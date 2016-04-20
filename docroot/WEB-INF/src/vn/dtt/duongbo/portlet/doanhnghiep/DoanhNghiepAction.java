
package vn.dtt.duongbo.portlet.doanhnghiep;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletResponse;

import vn.dtt.duongbo.business.Constants;
import vn.dtt.duongbo.business.DoanhNghiepBusiness;
import vn.dtt.duongbo.business.MotCuaBusiness;
import vn.dtt.duongbo.dangky.DangKyDoanhNghiepActionUtil;
import vn.dtt.duongbo.dao.common.model.DmDataItem;
import vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn;
import vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinh;
import vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.QlvtLoaiHinhHoatDongDnLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil;
import vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser;
import vn.dtt.duongbo.dao.motcua.model.MotCuaPhanCongXuLy;
import vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy;
import vn.dtt.duongbo.dao.motcua.service.MotCuaPhanCongXuLyLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaPhieuXuLyLocalServiceUtil;
import vn.dtt.duongbo.utils.CommonUtils;
import vn.dtt.duongbo.utils.format.DateUtils;
import vn.dtt.duongbo.utils.format.FormatData;
import vn.dtt.duongthuy.business.DuongThuyBusiness;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageBusUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class DoanhNghiepAction
 */
public class DoanhNghiepAction extends MVCPortlet {
	
	private Log log = LogFactoryUtil.getLog(DoanhNghiepAction.class);
	DoanhNghiepBusiness doanhNghiepBusiness = new DoanhNghiepBusiness();
	
	@Override
	public void serveResource(ResourceRequest request, ResourceResponse response)
		throws IOException, PortletException {
		
		String type = ParamUtil.getString(request, "type");
		log.debug("--------vao ajax serveResource---------");
		log.debug("==type==" + type);
		
		if (type.endsWith("findThuTucHanhChinhByCodeLinhVucThuTuc")) {
			findThuTucHanhChinhByCodeLinhVucThuTuc(request, response);
		} else if (type.endsWith("changePayment4HoSoThuTuc")) {
			changePayment4HoSoThuTuc(request, response);
		} else if (type.endsWith("findQuanHuyenByTinhThanh")) {
			findQuanHuyenByTinhThanh(request, response);
		} else if (type.endsWith("findPhuongXaByQuanHuyen")) {
			findPhuongXaByQuanHuyen(request, response);
		} else if (type.endsWith("plusDay")) {
			plusDay(request, response);
		} else if (type.equalsIgnoreCase("dtPrintPDF")) {
			DuongThuyBusiness.printPDF(request, response);
		} else if (type.equalsIgnoreCase("findHang")) {
			DuongThuyBusiness.findHang(request, response);
		}
		
	}
	
	// call ajax tim kiem thuTucHanhChinh theo code linh vuc thu tuc
	public void findThuTucHanhChinhByCodeLinhVucThuTuc(ResourceRequest request, ResourceResponse response) {
		try {
			
			String code = ParamUtil.getString(request, "codeLinhVucThuTuc");
			log.debug("findThuTucHanhChinhByCodeLinhVucThuTuc==" + code);
			
			JSONArray jsonArray = JSONFactoryUtil.createJSONArray();
			JSONObject obj = null;
			
			List<TthcThuTucHanhChinh> lstLinhVucThuTuc = TthcThuTucHanhChinhLocalServiceUtil.findByLinhVucThuTuc(code);
			if (lstLinhVucThuTuc != null && lstLinhVucThuTuc.size() > 0) {
				for (TthcThuTucHanhChinh tthc : lstLinhVucThuTuc) {
					obj = JSONFactoryUtil.createJSONObject();
					obj.put("id", tthc.getId());
					obj.put("name", tthc.getTenThuTuc());
					jsonArray.put(obj);
				}
			}
			PrintWriter out = response.getWriter();
			log.debug(jsonArray.toString());
			out.print(jsonArray.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void findQuanHuyenByTinhThanh(ResourceRequest request, ResourceResponse response) {
		try {
			
			String code = ParamUtil.getString(request, "codeTinhThanh");
			log.debug("---------findQuanHuyenByTinhThanh---------" + code);
			
			JSONArray jsonArray = JSONFactoryUtil.createJSONArray();
			JSONObject obj = null;
			
			List<DmDataItem> lstQuanHuyen = DmDataItemLocalServiceUtil.findQuanHuyenByMaTinhThanh(code);
			if (lstQuanHuyen != null && lstQuanHuyen.size() > 0) {
				for (DmDataItem quanHuyen : lstQuanHuyen) {
					obj = JSONFactoryUtil.createJSONObject();
					obj.put("code", quanHuyen.getCode());
					obj.put("name", quanHuyen.getName());
					jsonArray.put(obj);
				}
			}
			PrintWriter out = response.getWriter();
			log.debug(jsonArray.toString());
			out.print(jsonArray.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void plusDay(ResourceRequest request, ResourceResponse response) {
		try {
			
			int dateCount = ParamUtil.getInteger(request, "dateCount");
			String dateFrom = ParamUtil.getString(request, "dateFrom");
			log.info("---------dateCount---------" + dateCount);
			log.info("---------dateFrom---------" + dateFrom);
			String dateTo = DateUtils.addDays(FormatData.parseStringToDateTypeDDMMYYYY(dateFrom), dateCount);
			
			JSONArray jsonArray = JSONFactoryUtil.createJSONArray();
			JSONObject obj = JSONFactoryUtil.createJSONObject();
			obj.put("value", dateTo);
			jsonArray.put(obj);
			PrintWriter out = response.getWriter();
			log.debug(jsonArray.toString());
			out.print(jsonArray.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void findPhuongXaByQuanHuyen(ResourceRequest request, ResourceResponse response) {
		try {
			
			String codeTinh = ParamUtil.getString(request, "codeTinhThanh");
			String codeQuan = ParamUtil.getString(request, "codeQuanHuyen");
			log.debug("---------findPhuongXaByQuanHuyen---------" + codeTinh + "_" + codeQuan);
			
			JSONArray jsonArray = JSONFactoryUtil.createJSONArray();
			JSONObject obj = null;
			
			List<DmDataItem> lstPhuongXa = DmDataItemLocalServiceUtil.findPhuongXaByMaTinhThanMaQuanHuyen(codeTinh, codeQuan);
			if (lstPhuongXa != null && lstPhuongXa.size() > 0) {
				for (DmDataItem quanHuyen : lstPhuongXa) {
					obj = JSONFactoryUtil.createJSONObject();
					obj.put("code", quanHuyen.getCode());
					obj.put("name", quanHuyen.getName());
					jsonArray.put(obj);
				}
			}
			PrintWriter out = response.getWriter();
			log.debug(jsonArray.toString());
			out.print(jsonArray.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void changePayment4HoSoThuTuc(ResourceRequest request, ResourceResponse response) {
		try {
			
			String hoSoThuTucId = ParamUtil.getString(request, "hoSoThuTucId");
			log.debug("--------hoSoThuTucId---------" + hoSoThuTucId);
			
			//			long payAmuont = KeyPayUtils.getPayAmount(ConvertUtil.convertToLong(hoSoThuTucId));
			long payAmuont = 0;
			log.debug("--------payAmuont---------" + payAmuont);
			
			JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
			
			JSONArray _hoSoId = JSONFactoryUtil.getJSONFactory().createJSONArray();
			_hoSoId.put(hoSoThuTucId);
			JSONArray _payAmount = JSONFactoryUtil.getJSONFactory().createJSONArray();
			_payAmount.put(payAmuont);
			
			jsonFeed.put("hoSoId", _hoSoId);
			jsonFeed.put("payAmount", _payAmount);
			
			PrintWriter out = response.getWriter();
			out.print(jsonFeed.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void timKiemQuanLyHoSo(ActionRequest request, ActionResponse httpReq) {
		log.debug("-------in timKiemQuanLyHoSo action----------------");
		
		String selLinhVucThuTuc = ParamUtil.getString(request, "selLinhVucThuTuc");
		String thuTucHanhChinhId = ParamUtil.getString(request, "selThuTucHanhChinh");
		String maBienNhan = ParamUtil.getString(request, "maBienNhan");
		
		log.debug("-------selLinhcVuThuTuc: " + selLinhVucThuTuc);
		log.debug("-------selThuTucHanhChinh: " + thuTucHanhChinhId);
		log.debug("-------maBienNhan: " + maBienNhan);
		
		httpReq.setRenderParameter(vn.dtt.duongbo.business.Constants.CODE_LINH_VUC_THU_TUC, selLinhVucThuTuc);
		httpReq.setRenderParameter(Constants.ID_THU_TUC_HANH_CHINH, thuTucHanhChinhId);
		httpReq.setRenderParameter(Constants.MA_BIEN_NHAN, maBienNhan);
		
		// String quanLyHoSo = ParamUtil.getString(request,
		// TrangThaiConstains.QUAN_LY_HS);
		
		/*
		 * if (quanLyHoSo.equals(TrangThaiConstains.HS_DANG_HOAN_THIEN)) {
		 * httpReq.setRenderParameter("jspPage",
		 * "/html/hsdoanhnghiep/quanlyhoso/hs_dang_hoan_thien.jsp");
		 * 
		 * } else if
		 * (quanLyHoSo.equals(TrangThaiConstains.HS_DA_HOAN_THIEN_CHUA_NOP_PHI))
		 * { httpReq.setRenderParameter("jspPage",
		 * "/html/hsdoanhnghiep/quanlyhoso/hs_da_hoan_thien_chua_nop_phi.jsp");
		 * 
		 * } else if (quanLyHoSo.equals(TrangThaiConstains.HS_CHO_TIEP_NHAN)) {
		 * httpReq.setRenderParameter("jspPage",
		 * "/html/hsdoanhnghiep/quanlyhoso/hs_cho_tiep_nhan.jsp");
		 * 
		 * } else if (quanLyHoSo.equals(TrangThaiConstains.HS_DANG_XU_LY)) {
		 * httpReq.setRenderParameter("jspPage",
		 * "/html/hsdoanhnghiep/quanlyhoso/hs_dang_xu_ly.jsp");
		 * 
		 * } else if (quanLyHoSo.equals(TrangThaiConstains.HS_DA_TRA_KET_QUA)) {
		 * httpReq.setRenderParameter("jspPage",
		 * "/html/hsdoanhnghiep/quanlyhoso/hs_da_tra_ket_qua.jsp"); }
		 */
		
		PortletConfig portletConfig = (PortletConfig) request.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}
	
	public void upLoadFileBieuMau(ActionRequest actionRequest, ActionResponse httpReq)
		throws SystemException {
		doanhNghiepBusiness.upLoadFileBieuMau(actionRequest, httpReq);
	}
	
	public void xoaNoiDungHoSo(ActionRequest actionRequest, ActionResponse httpReq)
		throws SystemException {
		doanhNghiepBusiness.xoaNoiDungHoSo(actionRequest, httpReq);
	}
	
	public void xoaHoSo(ActionRequest actionRequest, ActionResponse httpReq) {
		doanhNghiepBusiness.xoaHoSo(actionRequest, httpReq);
	}
	
	public void xemTruocNoiDung(ActionRequest actionRequest, ActionResponse httpReq)
		throws SystemException {
		doanhNghiepBusiness.xemTruocNoiDung(actionRequest, httpReq);
	}
	
	public void luuNoiDungHoSo(ActionRequest actionRequest, ActionResponse httpReq)
		throws SystemException {
		doanhNghiepBusiness.luuNoiDungHoSo(actionRequest, httpReq);
	}
	
	public void luuNhapHoSo(ActionRequest actionRequest, ActionResponse httpReq)
		throws SystemException {
		doanhNghiepBusiness.luuNhapHoSo(actionRequest, httpReq);
	}
	
	public void nopHoSo(ActionRequest actionRequest, ActionResponse httpReq)
		throws SystemException {
		doanhNghiepBusiness.nopHoSo(actionRequest, httpReq);
	}
	
	public void thanhToanHSByUploadBill(ActionRequest actionRequest, ActionResponse httpReq)
		throws IOException {
		doanhNghiepBusiness.thanhToanHSByUploadBill(actionRequest, httpReq);
	}
	
	public void updateCongDan(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException {
		
		if (CommonUtils.checkFromDate(actionRequest)) {
			return;
		}
		
		List<String> errors = new ArrayList<String>();
		
		DangKyDoanhNghiepActionUtil.updateCongDan(actionRequest, actionResponse, errors);
		
		for(String error : errors) {
			SessionErrors.add(actionRequest, error);
		}
		
		actionResponse.setRenderParameter(Constants.MA_PHAN_NHOM_HO_SO, Constants.MA_PHAN_NHOM_QLTT_CA_NHAN);
		
		SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
	}
	
	public void updateDoanhNghiep(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException {
		
		if (CommonUtils.checkFromDate(actionRequest)) {
			return;
		}
		
		List<String> errors = new ArrayList<String>();
		
		DangKyDoanhNghiepActionUtil.updateDoanhNghiep(actionRequest, actionResponse, errors);
		
		for(String error : errors) {
			SessionErrors.add(actionRequest, error);
		}
		
		actionResponse.setRenderParameter(Constants.MA_PHAN_NHOM_HO_SO, Constants.MA_PHAN_NHOM_QLTT_CA_NHAN);
		
		SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
	}
	
	public void luuLoaiHinhKinhDoanhVanTai(ActionRequest actionRequest, ActionResponse httpReq) throws IOException {
		try {
			log.info("---luuLoaiHinhKinhDoanhVanTai----");
			
			//KINH_DOANH_TUYEN_CO_DINH;KINH_DOANH_XE_DU_LICH;KINH_DOANH_HANG_HOA
			String maPhamViHoatDong = ParamUtil.getString(actionRequest, "phamVihd");
			
			//KINH_DOANH_XE_TAXI
			String maMauSon = ParamUtil.getString(actionRequest, "mauSon");
			
			String soLuongPhuongTien = ParamUtil.getString(actionRequest, "soLgPhuongTien");
			String thietBiGiamSatHanhTrinh = ParamUtil.getString(actionRequest, "giamSatHanhTrinh");
			
			long hoSoThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_HO_SO_THU_TUC);
			long noiDungHoSoId = ParamUtil.getLong(actionRequest, Constants.ID_NOI_DUNG_HO_SO);
			String maLoaiHinhHoatDong = ParamUtil.getString(actionRequest, "MA_LOAIHINH_KINHDOANH");
			
			log.info("--hoSoThuTucId--------" + hoSoThuTucId);
			log.info("--maLoaiHinhHoatDong--" + maLoaiHinhHoatDong);
			log.info("--maMauSon--" + maMauSon);
			log.info("--maPhamViHoatDong--" + maPhamViHoatDong);
			log.info("--soLuongPhuongTien--" + soLuongPhuongTien);
			log.info("--thietBiGiamSatHanhTrinh--" + thietBiGiamSatHanhTrinh);
			
			long id = -1;
			QlvtLoaiHinhHoatDongDn loaiHinhkd = null;
			id = CounterLocalServiceUtil.increment(QlvtLoaiHinhHoatDongDn.class.getName());
			
			loaiHinhkd = QlvtLoaiHinhHoatDongDnLocalServiceUtil.createQlvtLoaiHinhHoatDongDn(id);
			loaiHinhkd.setHoSoThuTucId(hoSoThuTucId);
			loaiHinhkd.setNoiDungHoSoId(noiDungHoSoId);
			loaiHinhkd.setMaLoaiHinhHoatDong(maLoaiHinhHoatDong);
			loaiHinhkd.setMaMauSon(maMauSon);
			loaiHinhkd.setMaPhamViHoatDong(maPhamViHoatDong);
			loaiHinhkd.setSoLuongPhuongTien(soLuongPhuongTien);
			loaiHinhkd.setThietBiGiamSatHanhTrinh(thietBiGiamSatHanhTrinh);
			
			try {
				QlvtLoaiHinhHoatDongDnLocalServiceUtil.updateQlvtLoaiHinhHoatDongDn(loaiHinhkd);
			} catch (Exception e) {
				e.printStackTrace();
				maLoaiHinhHoatDong = "";
			}
			
			// respone
			JSONObject jsonMessageObject = JSONFactoryUtil.createJSONObject();
			jsonMessageObject.put("status", Boolean.FALSE);
			HttpServletResponse httpResponse = PortalUtil.getHttpServletResponse(httpReq);
			httpResponse.setContentType("text");
			
			try {
				JSONObject payloadJSON = JSONFactoryUtil.createJSONObject();
				payloadJSON.put("bodyText", maLoaiHinhHoatDong);
				httpResponse.getWriter().print(payloadJSON.toString());
				httpResponse.flushBuffer();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e);
		}
	}
	
	/*@BEGIN: Duong Thuy **/
	
	public void dtXemTruocNoiDung(ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {
		DuongThuyBusiness.xemTruocNoiDung(actionRequest, actionResponse);
	}
	
	public void dtLuuNoiDungHoSo(ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {
		DuongThuyBusiness.luuNoiDungHoSo(actionRequest, actionResponse);
	}
	
	/*@END*/
	public void nopHoSoBoSung(ActionRequest actionRequest, ActionResponse httpReq) {
		log.info("================ action nopHoSoBoSung----------------");
		
		long idThuTucHanhChinh = ParamUtil.getLong(actionRequest, Constants.ID_THU_TUC_HANH_CHINH);
		long idHoSoThuTuc = ParamUtil.getLong(actionRequest, Constants.ID_HO_SO_THU_TUC);
		DnDoanhNghiepUser doanhNghiepUser = null;
		long userId = 0;
		long doanhNghiepId = 0;
		long organizationId = 0;
		
		try {
			MotCuaBusiness motCuaBusiness = new MotCuaBusiness();
			//TODO organizationId = YTeConfigurationManager.getLongProp("organization_id", 13101);
			userId = PortalUtil.getUserId(actionRequest);
			log.info("================vao canBoDichChuyenTrangThaiDynamic=====");
			long hoSoThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_HO_SO_THU_TUC);
			long quyTrinhThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_QUY_TRINH_THU_TUC);
			long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
			String keyDichChuyen = "Cap.nhat.ho.so";
			MotCuaPhieuXuLy phieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.findByHoSoThuTucId(hoSoThuTucId).get(0);
			long dichChuyenTrangThaiPhieuSuLy =
				motCuaBusiness.dichChuyenTrangThaiPhieuXuLy(
					phieuXuLy, keyDichChuyen, userId, quyTrinhThuTucId, null);
			log.info("---------------dichChuyenTrangThaiPhieuXuLy==" + dichChuyenTrangThaiPhieuSuLy);
			
			if(dichChuyenTrangThaiPhieuSuLy > 0){
				MotCuaPhanCongXuLy phanCong = MotCuaPhanCongXuLyLocalServiceUtil.fetchByF_UNI_PhieuXuLyId(phieuXuLy.getId());
				phieuXuLy.setNguoiXuLy(userId);
				phieuXuLy.setToChucQuanLy(phanCong.getToChucXuLy());
				MotCuaPhieuXuLyLocalServiceUtil.updateMotCuaPhieuXuLy(phieuXuLy);
				TthcHoSoThuTuc ettHsTT = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
				ettHsTT.setToChucQuanLy(phanCong.getToChucXuLy());
				TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(ettHsTT);
			}
			
			httpReq.setRenderParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
			httpReq.setRenderParameter(Constants.ID_QUY_TRINH_THU_TUC, String.valueOf(quyTrinhThuTucId));
			httpReq.setRenderParameter(Constants.ID_PHIEU_XU_LY, String.valueOf(phieuXuLyId));
			
			PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
