
package vn.dtt.duongthuy.business;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletContext;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import vn.dtt.duongbo.business.Constants;
import vn.dtt.duongbo.dao.common.model.DmDataItem;
import vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo;
import vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoLocalServiceUtil;
import vn.dtt.duongbo.report.ObjectExportToReportUtils;
import vn.dtt.duongthuy.maudon.DonOnline;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.HttpHeaders;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.PortletURLFactoryUtil;

public class DuongThuyBusiness {
	
	private static final Log _log = LogFactoryUtil.getLog(DuongThuyBusiness.class);
	
	public static void xemTruocNoiDung(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		String portletName = (String)actionRequest.getAttribute(WebKeys.PORTLET_ID);
		
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		long thuTucHanhChinhId = ParamUtil.getLong(actionRequest, Constants.ID_THU_TUC_HANH_CHINH);
		long thanhPhanHoSoId = ParamUtil.getLong(actionRequest, Constants.ID_THANH_PHAN_HO_SO);
		long hoSoThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_HO_SO_THU_TUC);
		
		String jspBack = ParamUtil.getString(actionRequest, "jspBack");
		
		DonOnline donOnline = DuongThuyUtil.getDonOnline(actionRequest, thanhPhanHoSoId);
		
		String noiDungXML = donOnline.getNoiDungXML();
		
		PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
		
		PortletURL redirectURL = PortletURLFactoryUtil.create(PortalUtil.getHttpServletRequest(actionRequest), 
			portletName, themeDisplay.getLayout().getPlid(), PortletRequest.RENDER_PHASE);
		redirectURL.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
		redirectURL.setParameter(Constants.ID_THANH_PHAN_HO_SO, String.valueOf(thanhPhanHoSoId));
		redirectURL.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
		redirectURL.setParameter(DTConstants.MA_DON_VI, donOnline.getKinhGui());	// Mac dinh tat ca cac don de truong kinh gui la ma don vi
		redirectURL.setParameter("noiDungXML", noiDungXML);
		redirectURL.setParameter("jspPage", jspBack);
	
		actionResponse.sendRedirect(redirectURL.toString());
	}
	
	public static void printPDF(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws IOException {
		long thanhPhanHoSoId = ParamUtil.getLong(resourceRequest, Constants.ID_THANH_PHAN_HO_SO);
		String noiDungXML = ParamUtil.getString(resourceRequest, "noiDungXML");

		InputStream is = null;

		try {
			TthcThanhPhanHoSo thanhPhanHoSo = TthcThanhPhanHoSoLocalServiceUtil.fetchTthcThanhPhanHoSo(thanhPhanHoSoId);
			
			String maThanhPhan = GetterUtil.getString(thanhPhanHoSo.getMaThanhPhan());

			JRDataSource dataSource = null;

			Object objectReport = DonOnline.getDonOnline(noiDungXML);
			dataSource = ObjectExportToReportUtils.exportBieuMau(objectReport);
			
			if (dataSource != null) {
				PortletContext portletContext = resourceRequest.getPortletSession().getPortletContext();

				String pathReportTemplate = portletContext.getRealPath("/") + "report" + File.separator + "duongthuy"
						+ File.separator + maThanhPhan + ".jrxml";

				is = new FileInputStream(pathReportTemplate);

				Map<String, Object> parameters = new HashMap<String, Object>();
				JasperDesign jasperDesign = JRXmlLoader.load(pathReportTemplate);
				JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
				JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);

				JRPdfExporter exporter = new JRPdfExporter();
				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);

				ByteArrayOutputStream baos = new ByteArrayOutputStream();

				exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, baos);
				exporter.exportReport();
				
				String pdfName = maThanhPhan + "_" + System.currentTimeMillis() + ".pdf";
				
				resourceResponse.setContentType(ContentTypes.APPLICATION_PDF);
				resourceResponse.addProperty(HttpHeaders.CACHE_CONTROL, HttpHeaders.CACHE_CONTROL_NO_CACHE_VALUE);
				resourceResponse.addProperty(HttpHeaders.CONTENT_DISPOSITION, "filename=" + pdfName);
				resourceResponse.setContentLength(baos.size());

				OutputStream out = resourceResponse.getPortletOutputStream();
				baos.writeTo(out);

				out.flush();
				out.close();
			}
		} catch (Exception e) {
			_log.error(e);
		} finally {
			if (is != null) {
				is.close();
			}
		}
	}
	
	public static void luuNoiDungHoSo(ActionRequest actionRequest, ActionResponse actionResponse) 
			throws IOException {
		
		String portletName = (String)actionRequest.getAttribute(WebKeys.PORTLET_ID);
		
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		long thuTucHanhChinhId = ParamUtil.getLong(actionRequest, Constants.ID_THU_TUC_HANH_CHINH);
		long thanhPhanHoSoId = ParamUtil.getLong(actionRequest, Constants.ID_THANH_PHAN_HO_SO);
		long hoSoThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_HO_SO_THU_TUC);
		String maDonVi = ParamUtil.getString(actionRequest, DTConstants.MA_DON_VI);
		
		String noiDungXML = ParamUtil.getString(actionRequest, "noiDungXML");
		
		boolean result = false;
		
		try {
			long userId = PortalUtil.getUserId(actionRequest);
			
			long bieuMauHoSoId = DuongThuyUtil.getBieuMauHoSoIdByThanhPhanHoSoId(thanhPhanHoSoId);
			
			long nguoiLamThuTucId = DuongThuyUtil.getNguoiLamThuTucIdByUserId(userId);
			
			if(Validator.isNotNull(noiDungXML)) {
				long organizationId = DuongThuyUtil.getOrganizationIdByTTHC_DV(thuTucHanhChinhId, maDonVi);
				
				TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.updateHoSoThuTuc(userId,
						nguoiLamThuTucId, hoSoThuTucId, thuTucHanhChinhId,
					thanhPhanHoSoId, bieuMauHoSoId, Constants.DOANH_NGHIEP_TRANG_THAI_HO_SO_LUU_NHAP,
					Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_DANG_TAO_ID, organizationId, noiDungXML,
					Constants.NOI_DUNG_HO_SO_TRANG_THAI_ACTIVE);
				
				hoSoThuTucId = hoSoThuTuc.getId();
				
				result = true;
			}
			
		} catch (Exception e) {
			_log.error(e);
		}
		
		PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
		
		if(result) {
			PortletURL redirectURL = PortletURLFactoryUtil.create(PortalUtil.getHttpServletRequest(actionRequest), 
					portletName, themeDisplay.getLayout().getPlid(), PortletRequest.RENDER_PHASE);
			redirectURL.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
			redirectURL.setParameter(Constants.ID_THANH_PHAN_HO_SO, String.valueOf(thanhPhanHoSoId));
			redirectURL.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
			redirectURL.setParameter("jspPage", "/html/hsdoanhnghiep/thongtinhoso/duongthuy/thanh_phan_ho_so.jsp");
		
			actionResponse.sendRedirect(redirectURL.toString());
		}
	}
	//TODO KIỂM tra điều kiện được chọn (maDieuKien) xem có nằm trong note 1 của DmDataItem hay không!!!
	public static void findHang(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws IOException {
		
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();
		
		try {
			String code = ParamUtil.getString(resourceRequest, "maDieuKien");
			_log.info("vao finhangggggggggggggggggggggggggg");
			
			if(Validator.isNotNull(code)) {
	 			List<DmDataItem> lstHang = DmDataItemLocalServiceUtil.findByGroupCode(DTConstants.DANH_MUC.DM_HANG_GCN);
				
				if (lstHang != null && lstHang.size() > 0) {
					for (DmDataItem hang : lstHang) {
						
						String[] listHang = StringUtil.split(hang.getNode1());
						
						if(ArrayUtil.contains(listHang, code)) {
							JSONObject obj = JSONFactoryUtil.createJSONObject();
							
							obj.put("code", hang.getCode());
							obj.put("name", hang.getName());
							
							jsonArray.put(obj);
						}
					}
				}
			}
		} catch (Exception e) {
			_log.error(e);
		}
		
		PrintWriter out = resourceResponse.getWriter();
		out.print(jsonArray.toString());
	}
}
