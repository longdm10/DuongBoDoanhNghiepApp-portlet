package vn.dtt.form.util;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;

import org.apache.poi.ss.formula.functions.Value;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import vn.dtt.duongbo.business.Constants;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieu;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTien;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyBienHieuPhuongTienLocalServiceUtil;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyPhuHieuPhuongTienLocalServiceUtil;
import vn.dtt.duongbo.dao.common.model.DmDataItem;
import vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil;
import vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpkdvtDuongboQuocTe;
import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVan;
import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTien;
import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi;
import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen;
import vn.dtt.duongbo.dao.lienvan.service.QlvtCapPhepGpkdvtDuongboQuocTeLocalServiceUtil;
import vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanLocalServiceUtil;
import vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanPhuongTienLocalServiceUtil;
import vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService;
import vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalServiceUtil;
import vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanTuyenLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy;
import vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit;
import vn.dtt.duongbo.dao.motcua.service.MotCuaPhieuXuLyLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.OEPUserMgtWorkingUnitLocalServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtNoiDungThamTraLocalServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtTTHCNoiDungThamTraLocalServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinXuLyLocalServiceUtil;
import vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai;
import vn.dtt.duongbo.dao.noidia.service.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalServiceUtil;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTe;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTe;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien;
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiLocalServiceUtil;
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenLocalServiceUtil;
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyGpkdvtQuocTeLocalServiceUtil;
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyKTTQuocTeLocalServiceUtil;
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyKTTQuocTePhuongTienLocalServiceUtil;
import vn.dtt.duongbo.maudon.model.DeNghiCapGiayPhepKDVTBangXeOto;
import vn.dtt.duongbo.maudon.model.DeNghiCapGiayPhepVanTaiDuongBoVietCam;
import vn.dtt.duongbo.maudon.model.DeNghiCapGiayPhepVanTaiDuongBoVietLao;
import vn.dtt.duongbo.maudon.model.DeNghiCapGiayPhepVanTaiDuongBoVietTrung;
import vn.dtt.duongbo.maudon.model.DonXinCapGPLVTMVietLao;
import vn.dtt.duongbo.maudon.model.DonXinCapGPLienVanVietLao;
import vn.dtt.duongbo.maudon.model.GiayDangKyKhaiThacTuyenVietTrung;
import vn.dtt.duongbo.maudon.model.GiayDeNghiCapPhuHieuBienHieu;
import vn.dtt.duongbo.maudon.model.GiayPhepKinhDoanhVanTaiBangOto;
import vn.dtt.duongbo.maudon.model.GiayPhepLienVanVietCamPhiThuongMai;
import vn.dtt.duongbo.maudon.model.GiayPhepLienVanVietCamThuongMai;
import vn.dtt.duongbo.maudon.model.GiayPhepLienVanVietLao;
import vn.dtt.duongbo.maudon.model.GiayPhepVanTaiDuongBoQuocTeVietLao;
import vn.dtt.duongbo.maudon.model.PhuHieuLienVanVietLaos;
import vn.dtt.duongbo.maudon.xml.MauDonFactory;
import vn.dtt.duongbo.portlet.canbo.CanBoAction;
import vn.dtt.duongbo.report.ReportUtils;
import vn.dtt.duongbo.term.capbienhieuphuhieu.QLVTBienHieuTerm;
import vn.dtt.duongbo.term.lienvan.QlvtLienVanTerm;
import vn.dtt.duongbo.term.noidia.QLVTNoiDiaTerm;
import vn.dtt.duongbo.term.quocte.QLVTKhaiTacTuyen;
import vn.dtt.duongbo.term.quocte.QLVTQuocTeTerm;
import vn.dtt.duongbo.utils.format.ConvertUtil;
import vn.dtt.duongbo.utils.format.FormatData;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.util.PortalUtil;

public class FormUtil {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public static List<String> cbxYear() {
		List<String> result = new ArrayList<String>();
		int year = Calendar.getInstance().get(Calendar.YEAR);
		for(int i=year; i>=2000;i--){
			result.add(String.valueOf(i));
		}
		return result;
	}
	public static Map<String, String> cbxXeThueXeSoHuu() {
		Map<String, String> mapping = new HashMap<String, String>();
		mapping.put("0", "Xe thuê");
		mapping.put("1", "Sở hữu");
		return mapping;
	}
	public static Map<String, String> cbxHopDongSauCung() {
		Map<String, String> mapping = new HashMap<String, String>();
		mapping.put("1", "Đúng");
		mapping.put("0", "Sai");
		return mapping;
	}
	
	public static Map<String, String> cbxTrongTai() {
		Map<String, String> mapping = new HashMap<String, String>();
		mapping.put("0", "Trọng tải");
		mapping.put("1", "Ghế");
		return mapping;
	}
	public static Map<String, String> cbxThietBiGiamSatHanhTrinh() {
		Map<String, String> mapping = new HashMap<String, String>();
		mapping.put("0", "Không");
		mapping.put("1", "Có");
		return mapping;
	}
	public static Map<String, String> cbxLoaiBH() {
		Map<String, String> mapping = new HashMap<String, String>();
		mapping.put("BM_137", "Biển hiệu cho \"XE DU LỊCH\"");
		return mapping;
	}
	public static Map<String, String> cbxLoaiPH() {
		Map<String, String> mapping = new HashMap<String, String>();
		mapping.put("BM_136", "Phù hiệu cho \"XE NỘI BỘ\"");
		mapping.put("BM_138", "Phù hiệu cho \"XE TRUNG CHUYỂN\"");
		mapping.put("BM_140", "Phù hiệu cho \"XE TAXI\"");
		mapping.put("BM_141", "Phù hiệu cho \"XE BUÝT\"");
		mapping.put("BM_142", "Phù hiệu cho \"XE CHẠY TUYẾN CỐ ĐỊNH\"");
		mapping.put("BM_143", "Phù hiệu cho \"XE HỢP ĐỒNG\"");
		mapping.put("BM_144", "Phù hiệu cho \"CÔNG TEN NƠ\"");
		mapping.put("BM_145", "Phù hiệu cho \"XE TẢI\"");
		mapping.put("BM_146", "Phù hiệu cho \"XE ĐẦU KÉO\"");
		return mapping;
	}
	
	
	
	
	
	
	
	
	
	
	
	public static String bodyTextPhuHieu(long idQuocTe) {
		String bodyText = "";
		try {
			List<QLVTXuLyPhuHieuPhuongTien> listBase = QLVTXuLyPhuHieuPhuongTienLocalServiceUtil.findBycapPhuHieuID(Integer.valueOf("0"+idQuocTe));
			_log.info(listBase+"idQuocTe" + idQuocTe);
			int dat = 0, khDat = 0, chuaKiemTra = 0;
			for (QLVTXuLyPhuHieuPhuongTien qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai : listBase) {
				_log.info("qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai"+ qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.getKetQuaXuLy().equals("1"));
				if (Validator.isNull(qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.getKetQuaXuLy())) {
					chuaKiemTra++;
				}
				if (qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.getKetQuaXuLy().equals("1")) {
					dat++;
				}
			}
			bodyText = "Đạt: " + dat + "<br/>" + "Không đạt: "
					+ (listBase.size() - dat - chuaKiemTra) + "<br/>"
					+ "Chưa kiểm tra: " + chuaKiemTra;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bodyText = "Đạt: " + "<br/>" + "Không đạt: " + "<br/>"
					+ "Chưa kiểm tra: ";
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bodyText = "Đạt: " + "<br/>" + "Không đạt: " + "<br/>"
					+ "Chưa kiểm tra: ";
		}
		return bodyText;
	}
	public static String bodyTextBienHieu(long idQuocTe) {
		String bodyText = "";
		try {
			List<QLVTXuLyBienHieuPhuongTien> listBase = QLVTXuLyBienHieuPhuongTienLocalServiceUtil
					.findBycapPhuHieuID(Integer.valueOf("0"+idQuocTe));
			_log.info(listBase.size()+"idQuocTe" + idQuocTe);
			int dat = 0, khDat = 0, chuaKiemTra = 0;
			for (QLVTXuLyBienHieuPhuongTien qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai : listBase) {
				_log.info("qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai"
						+ qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.getKetQuaXuLy()
								.equals("1"));
				if (Validator.isNull(qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai
						.getKetQuaXuLy())) {
					chuaKiemTra++;
				}
				if (qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.getKetQuaXuLy().equals(
						"1")) {
					dat++;
				}
			}
			bodyText = "Đạt: " + dat + "<br/>" + "Không đạt: "
					+ (listBase.size() - dat - chuaKiemTra) + "<br/>"
					+ "Chưa kiểm tra: " + chuaKiemTra;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bodyText = "Đạt: " + "<br/>" + "Không đạt: " + "<br/>"
					+ "Chưa kiểm tra: ";
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bodyText = "Đạt: " + "<br/>" + "Không đạt: " + "<br/>"
					+ "Chưa kiểm tra: ";
		}
		return bodyText;
	}
	public static String bodyTextQuocTe(long idQuocTe) {
		String bodyText = "";
		try {
			List<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai> listBase = QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiLocalServiceUtil
					.findBythongTinCapGpkdVanTaiId(Integer.valueOf(idQuocTe
							+ ""));
			_log.info("idQuocTe" + idQuocTe);
			int dat = 0, khDat = 0, chuaKiemTra = 0;
			for (QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai : listBase) {
				_log.info("qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai"
						+ qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.getKetQuaXuLy()
								.equals("1"));
				if (Validator.isNull(qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai
						.getKetQuaXuLy())) {
					chuaKiemTra++;
				}
				if (qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.getKetQuaXuLy().equals(
						"1")) {
					dat++;
				}
			}
			bodyText = "Đạt: " + dat + "<br/>" + "Không đạt: "
					+ (listBase.size() - dat - chuaKiemTra) + "<br/>"
					+ "Chưa kiểm tra: " + chuaKiemTra;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bodyText = "Đạt: " + "<br/>" + "Không đạt: " + "<br/>"
					+ "Chưa kiểm tra: ";
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bodyText = "Đạt: " + "<br/>" + "Không đạt: " + "<br/>"
					+ "Chưa kiểm tra: ";
		}
		return bodyText;
	}
	public static String bodyTextNoiDia(long idQuocTe) {
		String bodyText = "";
		try {
			List<QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai> listBase = QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalServiceUtil.findBygpkdvtBangOtoId(Integer.valueOf("0"+idQuocTe));
			_log.info("idQuocTe" + idQuocTe);
			int dat = 0, khDat = 0, chuaKiemTra = 0;
			for (QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai : listBase) {
				_log.info("qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai"
						+ qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.getKetQuaXuLy()
								.equals("1"));
				if (Validator.isNull(qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai
						.getKetQuaXuLy())) {
					chuaKiemTra++;
				}
				if (qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.getKetQuaXuLy().equals(
						"1")) {
					dat++;
				}
			}
			bodyText = "Đạt: " + dat + "<br/>" + "Không đạt: "
					+ (listBase.size() - dat - chuaKiemTra) + "<br/>"
					+ "Chưa kiểm tra: " + chuaKiemTra;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bodyText = "Đạt: " + "<br/>" + "Không đạt: " + "<br/>"
					+ "Chưa kiểm tra: ";
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bodyText = "Đạt: " + "<br/>" + "Không đạt: " + "<br/>"
					+ "Chưa kiểm tra: ";
		}
		return bodyText;
	}

	public static String bodyTextLienVan(long idQuocTe) {
		String bodyText = "Đạt: " + "<br/>" + "Không đạt: " + "<br/>"
				+ "Chưa kiểm tra: ";
		try {
			List<QlvtXuLyGpLienVanPhuongTien> listBase = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil
					.findBycapGplvId(Integer.valueOf(idQuocTe + ""));
			_log.info("idQuocTe" + idQuocTe);
			int dat = 0, khDat = 0, chuaKiemTra = 0;
			for (QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai : listBase) {
				if (Validator.isNull(qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai
						.getKetQuaXuLy())) {
					chuaKiemTra++;
				}
				if (qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.getKetQuaXuLy().equals(
						"1")) {
					dat++;
				}
			}
			bodyText = "Đạt: " + dat + "<br/>" + "Không đạt: "
					+ (listBase.size() - dat - chuaKiemTra) + "<br/>"
					+ "Chưa kiểm tra: " + chuaKiemTra;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bodyText = "Đạt: " + "<br/>" + "Không đạt: " + "<br/>"
					+ "Chưa kiểm tra: ";
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bodyText = "Đạt: " + "<br/>" + "Không đạt: " + "<br/>"
					+ "Chưa kiểm tra: ";
		}
		return bodyText;
	}
	public static String bodyTextKTT(long idQuocTe) {
		String bodyText = "Đạt: " + "<br/>" + "Không đạt: " + "<br/>"
				+ "Chưa kiểm tra: ";
		try {
			List<QlvtXuLyKTTQuocTePhuongTien> listBase = QlvtXuLyKTTQuocTePhuongTienLocalServiceUtil
					.findBycapPhepKTTQuocTeID(Integer.valueOf(idQuocTe + ""));
			_log.info("idQuocTe" + idQuocTe);
			int dat = 0, khDat = 0, chuaKiemTra = 0;
			for (QlvtXuLyKTTQuocTePhuongTien qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai : listBase) {
				if (Validator.isNull(qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai
						.getKetQuaXuLy())) {
					chuaKiemTra++;
				}
				if (qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.getKetQuaXuLy().equals(
						"1")) {
					dat++;
				}
			}
			bodyText = "Đạt: " + dat + "<br/>" + "Không đạt: "
					+ (listBase.size() - dat - chuaKiemTra) + "<br/>"
					+ "Chưa kiểm tra: " + chuaKiemTra;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bodyText = "Đạt: " + "<br/>" + "Không đạt: " + "<br/>"
					+ "Chưa kiểm tra: ";
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bodyText = "Đạt: " + "<br/>" + "Không đạt: " + "<br/>"
					+ "Chưa kiểm tra: ";
		}
		return bodyText;
	}
	public static void customResponse(ActionRequest actionRequest,ActionResponse httpReq, String bodyText) throws IOException {
		// TODO Auto-generated method stub
		JSONObject jsonMessageObject = JSONFactoryUtil.createJSONObject();
		jsonMessageObject.put("status", Boolean.FALSE);
		HttpServletResponse httpResponse = PortalUtil.getHttpServletResponse(httpReq);
		httpResponse.setContentType("text");
		JSONObject payloadJSON = JSONFactoryUtil.createJSONObject();
		payloadJSON.put("bodyText", bodyText);
		httpResponse.getWriter().print(payloadJSON.toString());
		httpResponse.flushBuffer();
		PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
	}
	
	public static List<QlvtNoiDungThamTra> checkList(String maTTHC) {
		List<QlvtNoiDungThamTra> listNDTT = new ArrayList<QlvtNoiDungThamTra>();
		try {
			QlvtTTHCNoiDungThamTra qlvtTTHCNoiDungThamTra = QlvtTTHCNoiDungThamTraLocalServiceUtil.findByF_MaTTHC(maTTHC);
			if(Validator.isNotNull(qlvtTTHCNoiDungThamTra)){
				listNDTT = new ArrayList<QlvtNoiDungThamTra>(QlvtNoiDungThamTraLocalServiceUtil.findByF_tthcNoiDungThamTraId(Integer.valueOf("0"+qlvtTTHCNoiDungThamTra.getId())));
			}
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listNDTT;
	}
	
	public static void guiDuyetProcess(ActionRequest actionRequest, ActionResponse actionResponse) throws SystemException {
		long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
		QlvtThongTinHoSo thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.fetchByphieuXuLyId(phieuXuLyId);
		String keyKetQuaThamTra = ParamUtil.getString(actionRequest,"keyKetQuaThamTra");
		int userId = (int) PortalUtil.getUserId(actionRequest);
		if (thongTinHoSo != null) {
			QlvtThongTinXuLy qlvtThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil.fetchBythongTinHoSoId(Integer.valueOf("0"+ thongTinHoSo.getId()));
			qlvtThongTinXuLy.setKetQuaXuLy(keyKetQuaThamTra);
			qlvtThongTinXuLy.setCanBoXuLy(userId);
			qlvtThongTinXuLy.setThoiGianXuLy(new Date());
			qlvtThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil.updateQlvtThongTinXuLy(qlvtThongTinXuLy);
		}
	}
	public static long gPNoiDiaOTOInsertProcess(ActionRequest actionRequest,
			ActionResponse httpReq) {
		// TODO Auto-generated method stub
		long idReturn = 0;
		try {

			QLVTNoiDiaTerm term = new QLVTNoiDiaTerm(actionRequest);
			QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai qlvtXuLyGpkdvtbangotoLoaiHinhVanTai = QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalServiceUtil.fetchQlvtXuLyGpkdvtBangOtoLoaiHinhVanTai(term.getIdLoaiHinhVt());
			
			qlvtXuLyGpkdvtbangotoLoaiHinhVanTai.setKetQuaXuLy(term.getKetQuaXuLyLoaiHinh());
			qlvtXuLyGpkdvtbangotoLoaiHinhVanTai.setMauSon(term.getMauSon());
			qlvtXuLyGpkdvtbangotoLoaiHinhVanTai.setPhamViHoatDong(term.getPhamViHoatDong());
			qlvtXuLyGpkdvtbangotoLoaiHinhVanTai.setSoLuongPhuongTien(term.getSoLuongPhuongTien());
			qlvtXuLyGpkdvtbangotoLoaiHinhVanTai.setThietBiGiamSatHanhTrinh(term.getThietBiGiamSatHanhTrinh());
			qlvtXuLyGpkdvtbangotoLoaiHinhVanTai.setTuyenDen(term.getMaTuyen());
			qlvtXuLyGpkdvtbangotoLoaiHinhVanTai.setTuyenDen(term.getMaTuyens());
			
			qlvtXuLyGpkdvtbangotoLoaiHinhVanTai = QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalServiceUtil.updateQlvtXuLyGpkdvtBangOtoLoaiHinhVanTai(qlvtXuLyGpkdvtbangotoLoaiHinhVanTai);
			idReturn = qlvtXuLyGpkdvtbangotoLoaiHinhVanTai.getGpkdvtBangOtoId();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return idReturn;
	}
	public static long gPQuocTeInsertProcess(ActionRequest actionRequest,
			ActionResponse httpReq) {
		// TODO Auto-generated method stub
		long idReturn = 0;
		try {
			QLVTQuocTeTerm term = new QLVTQuocTeTerm(actionRequest);
			QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai = QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiLocalServiceUtil.fetchQlvtXuLyGpkdvtQuocTeLoaiHinhVanTai(term.getIdLoaiHinh());
			qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.setKetQuaXuLy(term.getKetQuaXuLyLoaiHinh());
			qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.setLyDoKhongDat(term.getLyDoKhongDat());
			qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.setSoChuyen(term.getSoChuyen());
			qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.setThietBiGiamSatHanhTrinh(term.getThietBiGiamSatHanhTrinh());
			qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.setSoLuongPhuongTien(term.getSoLuongPhuongTien());
			qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai = QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiLocalServiceUtil.updateQlvtXuLyGpkdvtQuocTeLoaiHinhVanTai(qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai);

			List<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen> listDel = QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenLocalServiceUtil.findBygpkdLoaiHinhKdId(Integer
							.valueOf(qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.getId()
									+ ""));
			for (QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen : listDel) {
				QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenLocalServiceUtil
						.deleteQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen(qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen);
			}
			long id = -1;
			String[] maTuyens = term.getMaTuyens();
			QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen = null;
			for (String string : maTuyens) {
				id = CounterLocalServiceUtil
						.increment(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.class
								.getName());
				qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen = QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenLocalServiceUtil
						.createQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen(id);
				qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen
						.setGpkdLoaiHinhKdId(Integer
								.valueOf(qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai
										.getId() + ""));
				qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.setMaTuyen(string);
				qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen
						.setTenTuyen(DmDataItemLocalServiceUtil
								.findByGroupIdAndCode(
										Constants.GROUP_ID_DM_TUYEN_VIET_LAO,
										string).getName());
				qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen = QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenLocalServiceUtil
						.updateQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen(qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen);
			}

			idReturn = qlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.getThongTinCapGpkdVanTaiId();
			System.out.println("FormUtil.gPQuocTeInsertProcess()"+term.getId()+"//"+term.getIdLoaiHinh());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return idReturn;
	}
	public static long gPlienVanInsertProcess(ActionRequest actionRequest,
			ActionResponse httpReq) {
		// TODO Auto-generated method stub
		long idReturn = 0;
		try {
			QlvtLienVanTerm term = new QlvtLienVanTerm(actionRequest);
			long idQuyTrinhThuTuc = ParamUtil.getLong(actionRequest,Constants.ID_QUY_TRINH_THU_TUC);
			
			String soPhuHieu = ParamUtil.getString(actionRequest, QlvtLienVanTerm.SO_PHU_HIEU);
			String ngayHetHanGpvt = ParamUtil.getString(actionRequest, QlvtLienVanTerm.NGAY_HET_HAN_GPVT);
			String phiCapPhep = ParamUtil.getString(actionRequest, "phiCapPhep");
			
			QlvtXuLyGpLienVan giaypheplienvan = null;
			giaypheplienvan = QlvtXuLyGpLienVanLocalServiceUtil
					.fetchQlvtXuLyGpLienVan(term.getId());
			giaypheplienvan.setSoGpvt(term.getSoGpvt());
			giaypheplienvan.setNgayCapGpvt(new Date());
			giaypheplienvan.setNgayHetHanGiayPhepLienVan(term.getNgayHetHanGiayPhepLienVan());
			giaypheplienvan.setNgayCapGiayPhepLienVan(term.getNgayCapGiayPhepLienVan());
			giaypheplienvan.setMucPhi(term.getMucPhi());

			giaypheplienvan = QlvtXuLyGpLienVanLocalServiceUtil.updateQlvtXuLyGpLienVan(giaypheplienvan);
			QlvtXuLyGpLienVanPhuongTien lienVanPhuongTien = null;
			lienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.fetchQlvtXuLyGpLienVanPhuongTien(term.getIdPhuongTien());
			lienVanPhuongTien.setCapGplvId(giaypheplienvan.getId());
//			lienVanPhuongTien.setBienSo(term.getBienSo());
			System.out.println("-------------------idQuyTrinhThuTuc.idQuyTrinhThuTuc()" + idQuyTrinhThuTuc);
			System.out.println("-------------------term.getSoPhuHieu()" + term.getSoPhuHieu());
			System.out.println("-------------------term.getMucPhi()" + term.getMucPhi());
			System.out.println("-------------------term.getXinGiaHanDenNgay()" + term.getXinGiaHanDenNgay());
			
			lienVanPhuongTien.setTrongTai(Integer.valueOf(0+term.getTrongTai()));
			lienVanPhuongTien.setNamSx(term.getNamSx());
			lienVanPhuongTien.setNhanHieu(term.getNhanHieu());
			lienVanPhuongTien.setSoKhung(term.getSoKhung());
			lienVanPhuongTien.setSoMay(term.getSoMay());
			lienVanPhuongTien.setMauSon(term.getMauSon());

			lienVanPhuongTien.setCuaKhau(term.getCuaKhau());
			lienVanPhuongTien.setMaCuaKhau(term.getMaCuaKhau());

			//lienVanPhuongTien.setXinCapPhepTuNgay(term.getXinCapPhepTuNgay());
			//lienVanPhuongTien.setXinCapPhepDenNgay(term.getXinCapPhepDenNgay());

			lienVanPhuongTien.setHinhThucHoatDong(term.getHinhThucHoatDong());
			lienVanPhuongTien.setSoPhuHieu(term.getSoPhuHieu());

			lienVanPhuongTien.setThoiHanPhuHieu(term.getThoiHanPhuHieu());

			lienVanPhuongTien.setSoNgayXinhGiaHan(term.getSoNgayXinhGiaHan());
			lienVanPhuongTien.setXinGiaHanTuNgay(term.getXinGiaHanTuNgay());
			lienVanPhuongTien.setXinGiaHanDenNgay(term.getXinGiaHanDenNgay());

			lienVanPhuongTien.setHinhThucSoHuu(term.getHinhThucSoHuu());
			lienVanPhuongTien.setDoanhNghiepChoThue(term.getDoanhNghiepChoThue());

			System.out.println("-------------------term.getThoiHanChoThue()" + term.getThoiHanChoThue());
			lienVanPhuongTien.setThoiHanChoThue(term.getThoiHanChoThue());
			lienVanPhuongTien.setHopDongSauCung(term.getHopDongSauCung());
			lienVanPhuongTien.setThoiGianNhapCanh(term.getThoiGianNhapCanh());
			lienVanPhuongTien.setThoiGianKhoiHanh(term.getThoiGianKhoiHanh());

			lienVanPhuongTien.setLoaiHinhGiaHan(term.getLoaiHinhGiaHan());
			if(idQuyTrinhThuTuc == 4){
				lienVanPhuongTien.setLoaiGiayPhep("GPVT_VT_A");
			}else if(idQuyTrinhThuTuc == 3){
				lienVanPhuongTien.setLoaiGiayPhep("GPVT_VT_B");
			}else{
				lienVanPhuongTien.setLoaiGiayPhep(term.getLoaiGiayPhep());
			}
			
			lienVanPhuongTien.setKetQuaXuLy(term.getKetQuaXuLy());
			lienVanPhuongTien.setLyDoKhongDat(term.getLyDoKhongDat());
			lienVanPhuongTien.setHopDongSauCung(term.getHopDongSauCung());
//			lienVanPhuongTien.setPhiCapPhep(ConvertUtil.convertToInt(term.getMucPhi()));
//			lienVanPhuongTien.setSoGiayPhepLienVanPhuongTien(term.getSoGiayPhepLienVan());
//			lienVanPhuongTien.setHanhTrinh(term.getHanhTrinh());
//			lienVanPhuongTien.setLoaiTuyen(term.getLoaiTuyen());
			
			QlvtXuLyGpLienVanPhuongTienLocalServiceUtil
					.updateQlvtXuLyGpLienVanPhuongTien(lienVanPhuongTien);

			String[] paramDiemDungNghis = ParamUtil.getParameterValues(
					actionRequest, "diemDungNghi", new String[] {});

			long idtuyenhoatdong = ParamUtil.getLong(actionRequest,
					Constants.TUYEN_HOAT_DONG_ID);
			// long loaiHinhKinhDoanhVT = ParamUtil.getLong(actionRequest,
			// Constants.);

			long id = -1;
			// String[] maTuyens = term.getMaTuyens();
			QlvtXuLyGpLienVanTuyen qlvtXuLyGpLienVanTuyen = null;
			id = CounterLocalServiceUtil.increment(QlvtXuLyGpLienVanTuyen.class
					.getName());
			qlvtXuLyGpLienVanTuyen = QlvtXuLyGpLienVanTuyenLocalServiceUtil
					.createQlvtXuLyGpLienVanTuyen(id);
			qlvtXuLyGpLienVanTuyen.setGpLienVanPhuongTienId(lienVanPhuongTien
					.getId());
			qlvtXuLyGpLienVanTuyen.setMaTuyen(term.getMaTuyen());
			if (idtuyenhoatdong > 0) {
				DmDataItem dmitem = DmDataItemLocalServiceUtil
						.fetchDmDataItem(idtuyenhoatdong);
				qlvtXuLyGpLienVanTuyen.setTenTuyen(dmitem.getName());
			}

			if (term.getHinhThucHoatDong() != null) {
				List<DmDataItem> dmitem = DmDataItemLocalServiceUtil
						.findByGroupCode(term.getHinhThucHoatDong());
				// qlvtXuLyGpLienVanTuyen.setH(dmitem.get(0).getName());
			}
			QlvtXuLyGpLienVanTuyenLocalServiceUtil
					.updateQlvtXuLyGpLienVanTuyen(qlvtXuLyGpLienVanTuyen);
			
			
			
			
			idReturn = giaypheplienvan.getId();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return idReturn;
	}
	
	
	
	
	public static long processKTTQuocTeInsert(ActionRequest actionRequest,
			ActionResponse httpReq) {
		// TODO Auto-generated method stub
		long idReturn = 0;
		try {
			QLVTKhaiTacTuyen term = new QLVTKhaiTacTuyen(actionRequest);
			
			QlvtXuLyKTTQuocTe qlvtXuLyKTTQuocTe = null;
			//qlvtXuLyKTTQuocTe = QlvtXuLyKTTQuocTeLocalServiceUtil.fetchQlvtXuLyKTTQuocTe(Long.valueOf(term.getIdXuLyKTTQuocTe()));
			//TODO
			//QlvtXuLyKTTQuocTeLocalServiceUtil.updateQlvtXuLyKTTQuocTe(qlvtXuLyKTTQuocTe);
			System.out.println("----------------processKTTQuocTeInsert----------term.getIdPhuongTien():" +term.getIdPhuongTien());
			QlvtXuLyKTTQuocTePhuongTien ettKttQuocTePhuongTien = null;
			ettKttQuocTePhuongTien = QlvtXuLyKTTQuocTePhuongTienLocalServiceUtil.fetchQlvtXuLyKTTQuocTePhuongTien(Long.valueOf(term.getIdPhuongTien()));
			ettKttQuocTePhuongTien.setBienSo(term.getBienSo());
			ettKttQuocTePhuongTien.setCuaKhau(term.getCuaKhau());
			ettKttQuocTePhuongTien.setNhanHieu(term.getNhanHieu());
			ettKttQuocTePhuongTien.setNamSx(Integer.valueOf(term.getNamSanXuat()));
			ettKttQuocTePhuongTien.setHinhThucSoHuu(term.getHinhThucSoHuu());
			ettKttQuocTePhuongTien.setDoanhNghiepChoThue(term.getDoanhNghiepChoThue());
			ettKttQuocTePhuongTien.setHopDongSauCung(Long.valueOf(term.getHopDongSauCung()));
			ettKttQuocTePhuongTien.setKetQuaXuLy(term.getKetQuaXuLy());
			ettKttQuocTePhuongTien.setLoaiGiayPhep(Validator.isNotNull(term.getLoaiCapPhep())?term.getLoaiCapPhep():"Loai");
			ettKttQuocTePhuongTien.setHinhThucSoHuu(term.getHinhThucSoHuu());
			ettKttQuocTePhuongTien = QlvtXuLyKTTQuocTePhuongTienLocalServiceUtil.updateQlvtXuLyKTTQuocTePhuongTien(ettKttQuocTePhuongTien);
			idReturn = ettKttQuocTePhuongTien.getId();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return idReturn;
	}
	
	
	
	public static String pdfGenerateGiayPhep(Object objPDF,QlvtThongTinHoSo thongTinHoSoReport,QlvtThongTinXuLy qlvtThongTinXuLyReport) {
		
		try {
			String ketQuaxml = "";
			
			_log.info("*************************objPDF.getClass().getName()"+objPDF.getClass().getName());
			if(objPDF.getClass().getName().contains(".DonXinCapGPLienVanVietLao")){
				DonXinCapGPLienVanVietLao mauDon = new DonXinCapGPLienVanVietLao();
				_log.info("Cái này là vào từ Giấy phép KDVT ô tô ---- DonXinCapGPLienVanVietLao ");
				List<DonXinCapGPLienVanVietLao.DanhSachXe> lstDs = new ArrayList<DonXinCapGPLienVanVietLao.DanhSachXe>();
				mauDon.setTenCongTy(thongTinHoSoReport.getTenDn());
				mauDon.setDiaChi(thongTinHoSoReport.getDiaChiDn());
				mauDon.setSoDienThoai(thongTinHoSoReport.getDienThoaiDn());
				mauDon.setSoGPDKKD(thongTinHoSoReport.getSoDkkd());
				mauDon.setSoFax(thongTinHoSoReport.getSoFaxDn());
				if(Validator.isNotNull(thongTinHoSoReport.getCoQuanGiaiQuyet())){
					mauDon.setCoQuanGui(OEPUserMgtWorkingUnitLocalServiceUtil.fetchByF_organizationId(thongTinHoSoReport.getCoQuanGiaiQuyet()+"").getName());
				}
				mauDon.setLyDoMat(thongTinHoSoReport.getLyDoCapLai());
				QlvtXuLyGpLienVan qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.fetchBythongTinXuLyId(Integer.valueOf("0"+qlvtThongTinXuLyReport.getId()));
				List<QlvtXuLyGpLienVanPhuongTien> listXe = new ArrayList<QlvtXuLyGpLienVanPhuongTien>();
				if(Validator.isNotNull(qlvtXuLyGpLienVan)){
					listXe = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.findBycapGplvId(Integer.valueOf("0"+qlvtXuLyGpLienVan.getId()));
				}
				DonXinCapGPLienVanVietLao.DanhSachXe ettXe = null;
				for (QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien : listXe) {
					ettXe = new DonXinCapGPLienVanVietLao.DanhSachXe();
					ettXe.setBienSoXe(qlvtXuLyGpLienVanPhuongTien.getBienSo());
					ettXe.setCuaKhau(qlvtXuLyGpLienVanPhuongTien.getCuaKhau());
					ettXe.setHinhThucHoatDong(qlvtXuLyGpLienVanPhuongTien.getHinhThucHoatDong());
					ettXe.setMauSon(qlvtXuLyGpLienVanPhuongTien.getMauSon());
					ettXe.setNamSX(qlvtXuLyGpLienVanPhuongTien.getNamSx()+"");
					ettXe.setNhanHieu(qlvtXuLyGpLienVanPhuongTien.getNhanHieu());
					ettXe.setSoKhung(qlvtXuLyGpLienVanPhuongTien.getSoKhung());
					ettXe.setSoMay(qlvtXuLyGpLienVanPhuongTien.getSoMay());
					if(Validator.isNotNull(qlvtXuLyGpLienVanPhuongTien.getThoiHanPhuHieu())){
						ettXe.setThoiGianDeNghi(FormatData.parseDateToStringType9(qlvtXuLyGpLienVanPhuongTien.getThoiHanPhuHieu()));
					}
					ettXe.setTrongTai(qlvtXuLyGpLienVanPhuongTien.getTrongTai()+"");
					lstDs.add(ettXe);
				}
				mauDon.getDanhSachXe().addAll(lstDs);
//				mauDon.setMucDichChuyenDis(mucDichChuyenDi);
				ketQuaxml = MauDonFactory.convertObjectToXml(mauDon);
			}else if(objPDF.getClass().getName().contains(".GiayPhepLienVanVietLao")){
				GiayPhepLienVanVietLao mauDon = new GiayPhepLienVanVietLao();
				
				mauDon.setSoDienThoai(thongTinHoSoReport.getDienThoaiDn());
				mauDon.setSoGP(thongTinHoSoReport.getSoGiayPhepKinhDoanhVanTaiQuocTe());
				mauDon.setSoFax(thongTinHoSoReport.getSoFaxDn());
				mauDon.setTenDonVi(thongTinHoSoReport.getTenDn());
				mauDon.setDiaChi(thongTinHoSoReport.getDiaChiDn());
				mauDon.setLinhVucHD("");
				mauDon.setNgayHetHan("");
				if(Validator.isNotNull(thongTinHoSoReport.getNgayHetHanGPKDVTQuocTe())){
					mauDon.setNgayHetHan(FormatData.parseDateToStringType9(thongTinHoSoReport.getNgayHetHanGPKDVTQuocTe()));
				}
				mauDon.setGiaTriDenNgay("");
				mauDon.setGiaTriTuNgay("");
				mauDon.setNoiDen("");
				mauDon.setVungHoatDong("");
				mauDon.setNgayCap(FormatData.parseDateToStringType9(thongTinHoSoReport.getNgayCapGPKDVTQuocTe()));
				
				ketQuaxml = MauDonFactory.convertObjectToXml(mauDon);
			}else if(objPDF.getClass().getName().contains(".DonXinCapGPLVTMVietLao")){
				DonXinCapGPLVTMVietLao mauDon = new DonXinCapGPLVTMVietLao();
				mauDon.setSoDienThoai(thongTinHoSoReport.getDienThoaiDn());
				mauDon.setSoGPVanTai(thongTinHoSoReport.getSoDkkd());
				mauDon.setSoFax(thongTinHoSoReport.getSoFaxDn());
				mauDon.setTenCongTy(thongTinHoSoReport.getTenDn());
				mauDon.setDiaChi(thongTinHoSoReport.getDiaChiDn());
				ketQuaxml = MauDonFactory.convertObjectToXml(mauDon);
			}else if(objPDF.getClass().getName().contains(".GiayPhepVanTaiDuongBoQuocTeVietLao")){
				GiayPhepVanTaiDuongBoQuocTeVietLao mauDon = new GiayPhepVanTaiDuongBoQuocTeVietLao();
				List<String> loaiHinhHoatDongs = new ArrayList<String>();
				String ngayHieuLucInput = "";
				QlvtXuLyGpkdvtQuocTe gpkdvtQuocTe = QlvtXuLyGpkdvtQuocTeLocalServiceUtil.fetchBythongTinXuLyId(Integer.valueOf("0"+qlvtThongTinXuLyReport.getId()));
				List<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai> lstLoaiHinhHD = QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiLocalServiceUtil.findBythongTinCapGpkdVanTaiId(Integer.valueOf("0"+gpkdvtQuocTe.getId()));
				for (QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai loaiHinh : lstLoaiHinhHD) {
					loaiHinhHoatDongs.add(DmDataItemLocalServiceUtil.findByGroupIdAndCode(Constants.GROUP_ID_LOAI_HINH_HOAT_DONG, loaiHinh.getMaLoaiHinhHoatDong()).getName());
				}
				_log.info("Vào hàm GiayPhepVanTaiDuongBoQuocTeVietLao ");
				_log.info("=====12345678================="+thongTinHoSoReport);
				mauDon.setDiachi(thongTinHoSoReport.getDiaChiDn());
				mauDon.setDienThoai(thongTinHoSoReport.getDienThoaiDn());
				mauDon.setFax(thongTinHoSoReport.getSoFaxDn());
				mauDon.setTenCongTy(thongTinHoSoReport.getTenDn());
				mauDon.setDiachi(thongTinHoSoReport.getDiaChiDn());
				mauDon.setHieuLucDen(FormatData.parseDateToStringType9(thongTinHoSoReport.getNgayHetHanGPKDVTQuocTe()));
				mauDon.setNgayDKL1((FormatData.parseDateToStringType9(thongTinHoSoReport.getNgayCapGPKDVTQuocTe())));
				mauDon.setSoGP(thongTinHoSoReport.getSoGiayPhepKinhDoanhVanTaiQuocTe());
				mauDon.setSoGPLVVL("");
				mauDon.setTinhThanh("");
				mauDon.setWebsite(thongTinHoSoReport.getWebSiteDn());
				mauDon.setEmail(thongTinHoSoReport.getEmailDn());
				mauDon.setLoaiHinhHoatDongs(loaiHinhHoatDongs);
				// Cái này set hiệu lực giấy phép
				mauDon.setHieuLucDen(ngayHieuLucInput);
				
				
				ketQuaxml = MauDonFactory.convertObjectToXml(mauDon);
				_log.info("=================`````=================="+ketQuaxml);
			}else if(objPDF.getClass().getName().contains(".DeNghiCapGiayPhepVanTaiDuongBoVietLao")){
				DeNghiCapGiayPhepVanTaiDuongBoVietLao mauDon = new DeNghiCapGiayPhepVanTaiDuongBoVietLao();
				_log.info("Vào hàm DeNghiCapGiayPhepVanTaiDuongBoVietLao ");
				mauDon.setDienThoai(thongTinHoSoReport.getDienThoaiDn());
				mauDon.setFax(thongTinHoSoReport.getSoFaxDn());
				mauDon.setTenCongTy(thongTinHoSoReport.getTenDn());
				mauDon.setCoQuanCapGiayPhepKinhDoanh(thongTinHoSoReport.getCoQuanCapDkkd());
				mauDon.setCoQuanGui(String.valueOf(thongTinHoSoReport.getCoQuanGiaiQuyet()));
				mauDon.setDiaChi(thongTinHoSoReport.getDiaChiDn());
				mauDon.setLoaiHinhDeNghiCap("");
				mauDon.setNgayCapGiayPhepKinhDoanh((FormatData.parseDateToStringType9(thongTinHoSoReport.getNgayCapDkkd())));
				mauDon.setNoiDungLyDoCapLais("");
				mauDon.setSoGiayPhepKinhDoanh(thongTinHoSoReport.getSoDkkd());
				ketQuaxml = MauDonFactory.convertObjectToXml(mauDon);
			}
			else if(objPDF.getClass().getName().contains(".GiayPhepLienVanVietCamThuongMai")){
				GiayPhepLienVanVietCamThuongMai mauDon = new GiayPhepLienVanVietCamThuongMai();
				mauDon.setCuaKhau("");
				mauDon.setDiaChi(thongTinHoSoReport.getDiaChiDn());
				mauDon.setGiaTriDenNgay("");
				mauDon.setGiaTriTuNgay("");
				mauDon.setLinhVucHD("");
				mauDon.setNgayCap("");
				mauDon.setNgayPhatHanh("");
				mauDon.setNgayHetHan("");
				mauDon.setNgayCap("");
				mauDon.setNgayHetHan("");
				mauDon.setNoiDen("");
				mauDon.setSoDKPT("");
				mauDon.setTenDonVi(thongTinHoSoReport.getTenDn());
				mauDon.setVungHoatDong("");
				ketQuaxml = MauDonFactory.convertObjectToXml(mauDon);
			}else if(objPDF.getClass().getName().contains(".GiayPhepLienVanVietCamPhiThuongMai")){
				GiayPhepLienVanVietCamPhiThuongMai mauDon = new GiayPhepLienVanVietCamPhiThuongMai();
				mauDon.setCuaKhau("");
				mauDon.setDiaChi(thongTinHoSoReport.getDiaChiDn());
				mauDon.setGiaTriDenNgay("");
				mauDon.setGiaTriTuNgay("");
				mauDon.setNgayCap("");
				mauDon.setNgayHetHan("");
				mauDon.setNgayCap("");
				mauDon.setNgayHetHan("");
				mauDon.setNoiDen("");
				mauDon.setSoDKPT("");
				mauDon.setTenDonVi(thongTinHoSoReport.getTenDn());
				mauDon.setLoaiXe("");
				mauDon.setMauSon("");
				mauDon.setNamSX("");
				mauDon.setNgayCap("");
				mauDon.setNgayHetHan("");
				mauDon.setNhanHieu("");
				mauDon.setSoFax(thongTinHoSoReport.getSoFaxDn());
				mauDon.setSoGP("");
				mauDon.setSoKhung("");
				mauDon.setSoMay("");
				mauDon.setTenDonVi(thongTinHoSoReport.getTenDn());
				mauDon.setVungHoatDong("");
				mauDon.setTrongTai("");
				mauDon.setMucDichCD("");
				mauDon.setVungHoatDong("");
				ketQuaxml = MauDonFactory.convertObjectToXml(mauDon);
			}else if(objPDF.getClass().getName().contains(".GiayPhepKinhDoanhVanTaiBangOto")){
				GiayPhepKinhDoanhVanTaiBangOto mauDon = new GiayPhepKinhDoanhVanTaiBangOto();
				mauDon.setDiaChi(thongTinHoSoReport.getDiaChiDn());
				mauDon.setSoGP(thongTinHoSoReport.getSoGiayPhepKinhDoanhVanTaiNoiDia());
				mauDon.setCoQuanGui(String.valueOf(thongTinHoSoReport.getCoQuanGiaiQuyet()));
				mauDon.setGiatriGP((FormatData.parseDateToStringType9(thongTinHoSoReport.getNgayHetHanGPKDVTNoiDia())));
				mauDon.setLanCap(String.valueOf(thongTinHoSoReport.getLanCapGPKDVTNoiDia()));
				mauDon.setNgayCapGiayCNDKKD((FormatData.parseDateToStringType9(thongTinHoSoReport.getNgayCapDkkd())));
				mauDon.setNgayCapGPL1((FormatData.parseDateToStringType9(thongTinHoSoReport.getNgayCapGPKDVTNoiDia())));
				mauDon.setNoiCapGiayCNDKKD(thongTinHoSoReport.getCoQuanCapDkkd());
				mauDon.setNoiCapGPL1(thongTinHoSoReport.getCoQuanCapGPKDVTNoiDia());
				mauDon.setSoDienThoai(thongTinHoSoReport.getDienThoaiDn());
				mauDon.setSoGiayCNDKKD(thongTinHoSoReport.getSoDkkd());
				mauDon.setSoGPL1(thongTinHoSoReport.getSoGiayPhepKinhDoanhVanTaiNoiDia());
				mauDon.setTenCongTy(thongTinHoSoReport.getTenDn());
				mauDon.setTenNguoiDD(thongTinHoSoReport.getDaiDienDn());
				ketQuaxml = MauDonFactory.convertObjectToXml(mauDon);
//				DeNghiCapGiayPhepKDVTBangXeOto
			}else if(objPDF.getClass().getName().contains(".DeNghiCapGiayPhepKDVTBangXeOto")){
				DeNghiCapGiayPhepKDVTBangXeOto mauDon = new DeNghiCapGiayPhepKDVTBangXeOto();
				mauDon.setDiaChi(thongTinHoSoReport.getDiaChiDn());
				mauDon.setCoQuanGui(String.valueOf(thongTinHoSoReport.getCoQuanGiaiQuyet()));
				mauDon.setTenCongTy(thongTinHoSoReport.getTenDn());
				mauDon.setCoQuanCapGiayPhepKinhDoanh(thongTinHoSoReport.getCoQuanCapDkkd());
				mauDon.setDienThoai(thongTinHoSoReport.getDienThoaiDn());
				mauDon.setNgayCapGiayPhepKinhDoanh(FormatData.parseDateToStringType9(thongTinHoSoReport.getNgayCapDkkd()));
				mauDon.setNguoiDaiDien(thongTinHoSoReport.getDaiDienDn());
				mauDon.setNoiDungLyDoCapLai(thongTinHoSoReport.getLyDoCapLai());
				mauDon.setSoGiayPhepKinhDoanh(thongTinHoSoReport.getSoDkkd());
				mauDon.setTenQuocTe("");
				mauDon.setTinhThanh("");
//				mauDon.setDanhSachLoaiHinhHoatDong(danhSachLoaiHinhHoatDong);
//				mauDon.setLoaiHinhKDVTs(loaiHinhKDVTs);
//				mauDon.setLyDoCapLais(lyDoCapLais);
				ketQuaxml = MauDonFactory.convertObjectToXml(mauDon);
			}else if(objPDF.getClass().getName().contains(".GiayDeNghiCapPhuHieuBienHieu")){
				GiayDeNghiCapPhuHieuBienHieu mauDon = new GiayDeNghiCapPhuHieuBienHieu();
				mauDon.setDiaChi(thongTinHoSoReport.getDiaChiDn());
				mauDon.setCoQuanGui("");
				mauDon.setNgayCapGiayPhepKDVTOto((FormatData.parseDateToStringType9(thongTinHoSoReport.getNgayCapGPKDVTNoiDia())));
				mauDon.setNoiCapGiayPhepKDVTOto(thongTinHoSoReport.getCoQuanCapGPKDVTNoiDia());
//				mauDon.setPhuongXa("");
//				mauDon.setQuanHuyen("");
				mauDon.setSoDienThoai(thongTinHoSoReport.getDienThoaiDn());
				mauDon.setSoGiayPhepKDVTOto(thongTinHoSoReport.getCoQuanCapGPKDVTNoiDia());
				mauDon.setSoGPVanTai("");
				mauDon.setSoLuongDeNghiCap("");
				mauDon.setSoLuongNopLai("");
//				mauDon.setThongTinKhac("");
//				MAUDON.SETTHUTUCHANHCHINH("");
				mauDon.setTinhThanh("");
				mauDon.setTenCongTy(thongTinHoSoReport.getTenDn());
				//Còn cái Danh sách xe
				ketQuaxml = MauDonFactory.convertObjectToXml(mauDon);
			}else if(objPDF.getClass().getName().contains(".GiayDangKyKhaiThacTuyenVietTrung")){
				GiayDangKyKhaiThacTuyenVietTrung mauDon = new GiayDangKyKhaiThacTuyenVietTrung();
				mauDon.setDiaChi(thongTinHoSoReport.getDiaChiDn());
				mauDon.setCoQuanGui("");
				mauDon.setTinhThanh("");
				mauDon.setBenDen("");
				mauDon.setBenDi("");
				mauDon.setCoQuanGui("");
				mauDon.setCuLy("");
				mauDon.setDiemDungDo("");
				mauDon.setFax(thongTinHoSoReport.getSoFaxDn());
				mauDon.setHanhTrinh("");
				mauDon.setDienThoai(thongTinHoSoReport.getDienThoaiDn());
				mauDon.setNgayCapGiayPhepVantai((FormatData.parseDateToStringType9(thongTinHoSoReport.getNgayCapGPKDVTNoiDia())));
				mauDon.setNgayLamDon("");
				mauDon.setSoGiayPhepVanTai(thongTinHoSoReport.getSoGiayPhepKinhDoanhVanTaiNoiDia());
				mauDon.setNoiCapGiayPhepVanTai(thongTinHoSoReport.getCoQuanCapGPKDVTNoiDia());
//				mauDon.setTinhThanh("");
				mauDon.setTinhTPDen("");
				mauDon.setTinhTPDi("");
				mauDon.setTenCongTy(thongTinHoSoReport.getTenDn());
				//Còn cái Danh sách xe
				ketQuaxml = MauDonFactory.convertObjectToXml(mauDon);
			}else if(objPDF.getClass().getName().contains(".DeNghiCapGiayPhepVanTaiDuongBoVietCam")){
				DeNghiCapGiayPhepVanTaiDuongBoVietCam mauDon = new DeNghiCapGiayPhepVanTaiDuongBoVietCam();
				mauDon.setDiaChi(thongTinHoSoReport.getDiaChiDn());
				mauDon.setTinhThanh("");
				mauDon.setFax(thongTinHoSoReport.getSoFaxDn());
				mauDon.setDienThoai(thongTinHoSoReport.getDienThoaiDn());
				mauDon.setTenCongTy(thongTinHoSoReport.getTenDn());
				//Còn cái Danh sách xe
				ketQuaxml = MauDonFactory.convertObjectToXml(mauDon);
			}
			if(Validator.isNull(ketQuaxml)){
				ketQuaxml = MauDonFactory.convertObjectToXml(objPDF);
			}
			ketQuaxml = makeNoiDungXmlStandard(ketQuaxml);
			return ketQuaxml;
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			try {
				return MauDonFactory.convertObjectToXml(objPDF);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return null;
	}
	public static String pdfGenerateValue(String xmlInput, Object objPDF,QlvtThongTinHoSo thongTinHoSoReport,QlvtThongTinXuLy qlvtThongTinXuLyReport, String col1) {
		try {
			//all
			QLVTXuLyBienHieuPhuongTien qlvtXuLyBienHieuPhuongTien = null;
			QLVTXuLyPhuHieuPhuongTien qlvtXuLyPhuHieuPhuongTien = null;
			QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien = null;
			QlvtXuLyGpLienVan qlvtXuLyGpLienVan = null;
			if(Validator.isNotNull(col1)){
				qlvtXuLyBienHieuPhuongTien = QLVTXuLyBienHieuPhuongTienLocalServiceUtil.fetchQLVTXuLyBienHieuPhuongTien(Integer.valueOf("0"+col1));
				qlvtXuLyPhuHieuPhuongTien = QLVTXuLyPhuHieuPhuongTienLocalServiceUtil.fetchQLVTXuLyPhuHieuPhuongTien(Integer.valueOf("0"+col1));
				qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.fetchQlvtXuLyGpLienVanPhuongTien(Integer.valueOf("0"+col1));
				qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.fetchQlvtXuLyGpLienVan(Integer.valueOf("0"+col1));
			}
			//param to pdf
			String objName = objPDF.getClass().getName().substring(objPDF.getClass().getName().lastIndexOf(".")+1);
			// 1- Build the doc
			Document doc = XmlDuongBoUtil.convertStringToDocument(xmlInput);
//			 2- UpdateValue
			if(Validator.isNotNull(qlvtXuLyBienHieuPhuongTien)){
				updateXml(doc, objName+"/SoA", qlvtXuLyBienHieuPhuongTien.getSoA());
				updateXml(doc, objName+"/SoB", qlvtXuLyBienHieuPhuongTien.getSoB());
				updateXml(doc, objName+"/So", qlvtXuLyBienHieuPhuongTien.getBienSo());
				updateXml(doc, objName+"/DonVi", thongTinHoSoReport.getTenDn());
				updateXml(doc, objName+"/BienDangKy", qlvtXuLyBienHieuPhuongTien.getBienSo());
				updateXml(doc, objName+"/GiaTriDen", FormatData.parseDateToStringType9(qlvtXuLyBienHieuPhuongTien.getCoGiaTriDen()));
			}
			if(Validator.isNotNull(qlvtXuLyPhuHieuPhuongTien)){
				MotCuaPhieuXuLy ettPhieu = MotCuaPhieuXuLyLocalServiceUtil.fetchMotCuaPhieuXuLy(thongTinHoSoReport.getPhieuXuLyId());
				OEPUserMgtWorkingUnit oepWorkingUnit = OEPUserMgtWorkingUnitLocalServiceUtil.fetchByF_organizationId(ettPhieu.getToChucQuanLy()+"");
				updateXml(doc, objName+"/So", qlvtXuLyPhuHieuPhuongTien.getSoPhuHieuDuocCap());
				updateXml(doc, objName+"/TinhThanh", oepWorkingUnit.getName());
				updateXml(doc, objName+"/TuyenHoatDong", "");
				updateXml(doc, objName+"/DonVi", thongTinHoSoReport.getTenDn());
				updateXml(doc, objName+"/BienDangKy", qlvtXuLyPhuHieuPhuongTien.getBienSo());
				updateXml(doc, objName+"/GiaTriDen", FormatData.parseDateToStringType9(qlvtXuLyPhuHieuPhuongTien.getCoGiaTriDen()));
			}
			if(Validator.isNotNull(qlvtXuLyGpLienVanPhuongTien)){
				updateXml(doc, objName+"/SoDKPT", qlvtXuLyGpLienVanPhuongTien.getBienSo());
				updateXml(doc, objName+"/TenDonVi", thongTinHoSoReport.getTenDn());
				updateXml(doc, objName+"/DiaChi", thongTinHoSoReport.getDiaChiDn());
				updateXml(doc, objName+"/SoDienThoai", thongTinHoSoReport.getDienThoaiDn());
				updateXml(doc, objName+"/SoFax", thongTinHoSoReport.getSoFaxDn());
				updateXml(doc, objName+"/LinhVucHD", ReportUtils.getTenDmDataByCode(qlvtXuLyGpLienVanPhuongTien.getHinhThucHoatDong()));
				updateXml(doc, objName+"/SoGP", qlvtXuLyGpLienVan.getSoGpvt());
				updateXml(doc, objName+"/NgayHetHan", FormatData.parseDateToStringType9(thongTinHoSoReport.getNgayHetHanGPKDVTQuocTe()));
				updateXml(doc, objName+"/GiaTriTuNgay", FormatData.parseDateToStringType9(qlvtXuLyGpLienVan.getNgayCapGiayPhepLienVan()));
				updateXml(doc, objName+"/GiaTriDenNgay", FormatData.parseDateToStringType9(qlvtXuLyGpLienVan.getNgayHetHanGiayPhepLienVan()));
				updateXml(doc, objName+"/CuaKhau", ReportUtils.getTenDmDataByCode(qlvtXuLyGpLienVanPhuongTien.getCuaKhau()));
				updateXml(doc, objName+"/VungHoatDong", "");
				
				updateXml(doc, objName+"/NoiDen", "");
				updateXml(doc, objName+"/NgayCap", FormatData.parseDateToStringType9(qlvtXuLyGpLienVan.getNgayCapGiayPhepLienVan()));
				updateXml(doc, objName+"/NamSX", String.valueOf(qlvtXuLyGpLienVanPhuongTien.getSoKhung()));
				updateXml(doc, objName+"/NhanHieu", qlvtXuLyGpLienVanPhuongTien.getNhanHieu());
				updateXml(doc, objName+"/LoaiXe", "");
				updateXml(doc, objName+"/SoKhung", qlvtXuLyGpLienVanPhuongTien.getSoKhung());
				updateXml(doc, objName+"/SoMay", qlvtXuLyGpLienVanPhuongTien.getSoMay());
				updateXml(doc, objName+"/MauSon", qlvtXuLyGpLienVanPhuongTien.getMauSon());
			}
			
			System.out.println("//"+objName+"FormUtil.pdfGenerateValue()"+XmlDuongBoUtil.convertDocumentToString(doc).substring(XmlDuongBoUtil.convertDocumentToString(doc).indexOf(objName)-1));
			xmlInput = makeNoiDungXmlStandard(XmlDuongBoUtil.convertDocumentToString(doc).substring(XmlDuongBoUtil.convertDocumentToString(doc).indexOf(objName)-1));
			
//			objPDF = objPDF.getClass().cast(MauDonFactory.converXmlToObject(xmlInput, objPDF));
//			String ketQuaxml = MauDonFactory.convertObjectToXml(objPDF);
//			ketQuaxml = makeNoiDungXmlStandard(ketQuaxml);
//			_log.info(XmlDuongBoUtil.convertDocumentToString(doc)+"//"+makeNoiDungXmlStandard(XmlDuongBoUtil.convertDocumentToString(doc)));
			return xmlInput;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public static String makeNoiDungXmlStandard(String noiDungXml) {
		StringBuilder builder = new StringBuilder();
		builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		builder.append("<Envelope>");
		builder.append("<Header>");
		builder.append("</Header>");
		builder.append("<Body>");
		builder.append("<Content>");
		builder.append(noiDungXml);
		builder.append("</Content>");
		builder.append("</Body>");
		builder.append("</Envelope>");
		
		return builder.toString();
	}
	public static void updateXml(Document doc, String path, String def){
		  String p[] = path.split("/");
		  //search nodes or create them if they do not exist
		  Node n = doc;
		  for (int i=0;i < p.length;i++){
		    NodeList kids = n.getChildNodes();
		    Node nfound = null;
		    for (int j=0;j<kids.getLength();j++) 
		      if (kids.item(j).getNodeName().equals(p[i])) {
		    nfound = kids.item(j);
		    break;
		      }
		    if (nfound == null) { 
		      nfound = doc.createElement(p[i]);
		      n.appendChild(nfound);
		      n.appendChild(doc.createTextNode("\n")); //add whitespace, so the result looks nicer. Not really needed
		    }
		    n = nfound;
		  }
		  NodeList kids = n.getChildNodes();
		  for (int i=0;i<kids.getLength();i++)
		    if (kids.item(i).getNodeType() == Node.TEXT_NODE) {
		      //text node exists
		      kids.item(i).setNodeValue(def); //override
		      return;
		    }

		  n.appendChild(doc.createTextNode(def));    
		}
	private static Log _log = LogFactoryUtil.getLog(FormUtil.class);
	public static void lanhDaoCD(ActionRequest actionRequest,
			ActionResponse httpReq) throws SystemException {
		// TODO Auto-generated method stub
		long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
		QlvtThongTinHoSo thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.fetchByphieuXuLyId(phieuXuLyId);
		int userId = (int) PortalUtil.getUserId(actionRequest);
		if (thongTinHoSo != null) {
			//cập nhật thông tin xử lý của lãnh đạo
			QlvtThongTinXuLy qlvtThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil.fetchBythongTinHoSoId(Integer.valueOf("0"+ thongTinHoSo.getId()));
			qlvtThongTinXuLy.setLanhDaoDuyet(userId);
			qlvtThongTinXuLy.setThoiGianDuyet(new Date());
			qlvtThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil.updateQlvtThongTinXuLy(qlvtThongTinXuLy);
		}
	}
	public static void lanhDaoPheDuyet(ActionRequest actionRequest,
			ActionResponse httpReq) throws SystemException {
		// TODO Auto-generated method stub
		long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
		QlvtThongTinHoSo thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.fetchByphieuXuLyId(phieuXuLyId);
		int userId = (int) PortalUtil.getUserId(actionRequest);
		if (thongTinHoSo != null) {
			//cập nhật thông tin xử lý của lãnh đạo
			QlvtThongTinXuLy qlvtThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil.fetchBythongTinHoSoId(Integer.valueOf("0"+ thongTinHoSo.getId()));
			qlvtThongTinXuLy.setLanhDaoPheDuyet(userId);
			qlvtThongTinXuLy.setThoiGianPheDuyet(new Date());
			qlvtThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil.updateQlvtThongTinXuLy(qlvtThongTinXuLy);
		}
	}
	public static void canBoXuLy(ActionRequest actionRequest,
			ActionResponse httpReq) throws SystemException {
		// TODO Auto-generated method stub
		long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
		QlvtThongTinHoSo thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.fetchByphieuXuLyId(phieuXuLyId);
		int userId = (int) PortalUtil.getUserId(actionRequest);
		if (thongTinHoSo != null) {
			//cập nhật thông tin xử lý của lãnh đạo
			QlvtThongTinXuLy qlvtThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil.fetchBythongTinHoSoId(Integer.valueOf("0"+ thongTinHoSo.getId()));
			qlvtThongTinXuLy.setCanBoXuLy(userId);
			qlvtThongTinXuLy.setThoiGianXuLy(new Date());
			qlvtThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil.updateQlvtThongTinXuLy(qlvtThongTinXuLy);
		}
	}
	public static void vanThuTraKetQua(ActionRequest actionRequest,
			ActionResponse httpReq) throws SystemException {
		// TODO Auto-generated method stub
		long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
		QlvtThongTinHoSo thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.fetchByphieuXuLyId(phieuXuLyId);
		int userId = (int) PortalUtil.getUserId(actionRequest);
		if (thongTinHoSo != null) {
			//cập nhật thông tin xử lý của lãnh đạo
			QlvtThongTinXuLy qlvtThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil.fetchBythongTinHoSoId(Integer.valueOf("0"+ thongTinHoSo.getId()));
			qlvtThongTinXuLy.setNguoiTraKetQua(userId);
			qlvtThongTinXuLy.setThoiGianTraKetQua(new Date());
			qlvtThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil.updateQlvtThongTinXuLy(qlvtThongTinXuLy);
		}
	}
	public static void vanThuCapPhep(ActionRequest actionRequest,
			ActionResponse httpReq) throws SystemException {
		// TODO Auto-generated method stub
		long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
		QlvtThongTinHoSo thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.fetchByphieuXuLyId(phieuXuLyId);
		int userId = (int) PortalUtil.getUserId(actionRequest);
		if (thongTinHoSo != null) {
			//cập nhật thông tin xử lý của lãnh đạo
			QlvtThongTinXuLy qlvtThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil.fetchBythongTinHoSoId(Integer.valueOf("0"+ thongTinHoSo.getId()));
			qlvtThongTinXuLy.setNguoiTraKetQua(userId);
			qlvtThongTinXuLy.setThoiGianCapPhep(new Date());
			qlvtThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil.updateQlvtThongTinXuLy(qlvtThongTinXuLy);
		}
	}
}
