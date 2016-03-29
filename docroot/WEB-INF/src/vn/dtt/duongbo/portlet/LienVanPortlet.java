package vn.dtt.duongbo.portlet;

import java.io.IOException;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import vn.dtt.duongbo.business.Constants;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyBienHieuPhuongTienLocalServiceUtil;
import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVan;
import vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanLocalServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinXuLyLocalServiceUtil;
import vn.dtt.duongbo.portlet.canbo.utils.CanBoBusinessUtils;
import vn.dtt.duongbo.term.capbienhieuphuhieu.QLVTBienHieuTerm;
import vn.dtt.duongbo.term.lienvan.QlvtLienVanTerm;
import vn.dtt.form.util.FormUtil;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.util.PortalUtil;

public class LienVanPortlet {

	private static Log _log = LogFactoryUtil.getLog(LienVanPortlet.class);
	private static QlvtLienVanTerm term = null;
	//liên vận việt lào
	public static void lienVan_vietLao_choThamXet(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QlvtLienVanTerm(actionRequest);
		_log.debug("-lienVan_vietLao_choThamXet-----dung cho cho` tham xet!!!--");
		lienVan_ThongTinHoSo(actionRequest, httpReq);
		lienVan_ThongTinGPLienVan(actionRequest, httpReq);
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	
	public static void lienVan_vietLao_dangThamXet(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QlvtLienVanTerm(actionRequest);
		_log.debug("-lienVan_vietLao_dangThamXet-----dung cho cho` tham xet!!!--");
		lienVan_ThongTinHoSo(actionRequest, httpReq);
		lienVan_ThongTinGPLienVan(actionRequest, httpReq);
		//send json message
		FormUtil.customResponse(actionRequest,httpReq, FormUtil.bodyTextLienVan(term.getId()));
	}
	public static void lienVan_vietLao_CD(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QlvtLienVanTerm(actionRequest);
		_log.debug("-lienVan_vietLao_CD-----dung cho cho` tham xet!!!--");
		FormUtil.lanhDaoCD(actionRequest, httpReq);
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void lienVan_vietLao_CDDYCBS(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QlvtLienVanTerm(actionRequest);
		_log.debug("-lienVan_vietLao_CDDYCBS-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void lienVan_vietLao_CTKQ(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QlvtLienVanTerm(actionRequest);
		_log.debug("-lienVan_vietLao_CTKQ-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void lienVan_vietLao_CDDTCCP(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QlvtLienVanTerm(actionRequest);
		_log.debug("-lienVan_vietLao_CDDTCCP-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void lienVan_vietLao_HTHS(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QlvtLienVanTerm(actionRequest);
		_log.debug("-lienVan_vietLao_HTHS-----dung cho cho` tham xet!!!--");
		lienVan_ThongTinHoSo_TraKetQua(actionRequest, httpReq);
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void lienVan_vietLao_HHS(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QlvtLienVanTerm(actionRequest);
		_log.debug("-lienVan_vietLao_HHS-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	
	//liên vận việt cam
	public static void lienVan_vietCam_choThamXet(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QlvtLienVanTerm(actionRequest);
		_log.debug("-lienVan_vietCam_choThamXet-----dung cho cho` tham xet!!!--");
		lienVan_ThongTinHoSo(actionRequest, httpReq);
		lienVan_ThongTinGPLienVan(actionRequest, httpReq);
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void lienVan_vietCam_dangThamXet(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QlvtLienVanTerm(actionRequest);
		_log.debug("-lienVan_vietCam_dangThamXet-----dung cho cho` tham xet!!!--");
		lienVan_ThongTinHoSo(actionRequest, httpReq);
		lienVan_ThongTinGPLienVan(actionRequest, httpReq);
		//send json message
		FormUtil.customResponse(actionRequest,httpReq, FormUtil.bodyTextLienVan(term.getId()));
	}
	public static void lienVan_vietCam_CD(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QlvtLienVanTerm(actionRequest);
		_log.debug("-lienVan_vietCam_CD-----dung cho cho` tham xet!!!--");
		FormUtil.lanhDaoCD(actionRequest, httpReq);
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void lienVan_vietCam_CDDYCBS(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QlvtLienVanTerm(actionRequest);
		_log.debug("-lienVan_vietCam_CDDYCBS-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void lienVan_vietCam_CTKQ(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QlvtLienVanTerm(actionRequest);
		_log.debug("-lienVan_vietCam_CDDYCBS-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void lienVan_vietCam_CDDTCCP(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QlvtLienVanTerm(actionRequest);
		_log.debug("-lienVan_vietCam_CDDYCBS-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void lienVan_vietCam_HTHS(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QlvtLienVanTerm(actionRequest);
		_log.debug("-lienVan_vietCam_CDDYCBS-----dung cho cho` tham xet!!!--");
		lienVan_ThongTinHoSo_TraKetQua(actionRequest, httpReq);
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void lienVan_vietCam_HHS(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QlvtLienVanTerm(actionRequest);
		_log.debug("-lienVan_vietCam_CDDYCBS-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	//liên vận việt trung
	public static void lienVan_vietTrung_choThamXet(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QlvtLienVanTerm(actionRequest);
		_log.debug("-lienVan_vietTrung_choThamXet-----dung cho cho` tham xet!!!--");
		lienVan_ThongTinHoSo(actionRequest, httpReq);
		lienVan_ThongTinGPLienVan(actionRequest, httpReq);
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void lienVan_vietTrung_dangThamXet(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QlvtLienVanTerm(actionRequest);
		_log.debug("-lienVan_vietTrung_dangThamXet-----dung cho cho` tham xet!!!--");
		lienVan_ThongTinHoSo(actionRequest, httpReq);
		lienVan_ThongTinGPLienVan(actionRequest, httpReq);
		//send json message
		FormUtil.customResponse(actionRequest,httpReq, FormUtil.bodyTextLienVan(term.getId()));
	}
	public static void lienVan_vietTrung_CD(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QlvtLienVanTerm(actionRequest);
		_log.debug("-lienVan_vietTrung_CD-----dung cho cho` tham xet!!!--");
		FormUtil.lanhDaoCD(actionRequest, httpReq);
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void lienVan_vietTrung_CDDYCBS(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QlvtLienVanTerm(actionRequest);
		_log.debug("-lienVan_vietTrung_CDDYCBS-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void lienVan_vietTrung_CTKQ(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QlvtLienVanTerm(actionRequest);
		_log.debug("-lienVan_vietTrung_CDDYCBS-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void lienVan_vietTrung_CDDTCCP(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QlvtLienVanTerm(actionRequest);
		_log.debug("-lienVan_vietTrung_CDDYCBS-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void lienVan_vietTrung_HTHS(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QlvtLienVanTerm(actionRequest);
		_log.debug("-lienVan_vietTrung_CDDYCBS-----dung cho cho` tham xet!!!--");
		lienVan_ThongTinHoSo_TraKetQua(actionRequest, httpReq);
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void lienVan_vietTrung_HHS(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QlvtLienVanTerm(actionRequest);
		_log.debug("-lienVan_vietTrung_CDDYCBS-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void lienVan_vietTrung_xemTruocNoiDung(ActionRequest actionRequest, ActionResponse httpReq) {
		// TODO Auto-generated method stub
		_log.debug("-lienVan_vietTrung_xemTruocNoiDung-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.xemTruocNoiDungCongVan(actionRequest, httpReq);
	}	
	public static void lienVan_vietTrung_guiDuyet(ActionRequest actionRequest, ActionResponse httpReq) throws SystemException {
		// TODO Auto-generated method stub
		_log.debug("-lienVan_vietTrung_guiDuyet-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		// TODO
		FormUtil.guiDuyetProcess(actionRequest, httpReq);
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest,httpReq);
	}	
	public static void lienVan_vietTrung_luuThongTinThamXet(ActionRequest actionRequest, ActionResponse actionResponse) {
		_log.info("-------------------lienVan_vietTrung_luuThongTinThamXet--------------------------");
		try {
			term = new QlvtLienVanTerm(actionRequest);
			//UPDATE
			long idReturn = FormUtil.gPlienVanInsertProcess(actionRequest, actionResponse);
			FormUtil.customResponse(actionRequest,actionResponse, FormUtil.bodyTextLienVan(idReturn));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void lienVan_vietCam_xemTruocNoiDung(ActionRequest actionRequest, ActionResponse httpReq) {
		// TODO Auto-generated method stub
		_log.debug("-lienVan_vietCam_xemTruocNoiDung-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.xemTruocNoiDungCongVan(actionRequest, httpReq);
	}	
	public static void lienVan_vietCam_guiDuyet(ActionRequest actionRequest, ActionResponse httpReq) throws SystemException {
		// TODO Auto-generated method stub
		_log.debug("-lienVan_vietCam_guiDuyet-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		// TODO
		FormUtil.guiDuyetProcess(actionRequest, httpReq);
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest,httpReq);
	}	
	public static void lienVan_vietCam_luuThongTinThamXet(ActionRequest actionRequest, ActionResponse actionResponse) {
		_log.info("-------------------lienVan_vietCam_luuThongTinThamXet--------------------------");
		try {
			term = new QlvtLienVanTerm(actionRequest);
			//UPDATE
			long idReturn = FormUtil.gPlienVanInsertProcess(actionRequest, actionResponse);
			FormUtil.customResponse(actionRequest,actionResponse, FormUtil.bodyTextLienVan(idReturn));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void lienVan_vietLao_xemTruocNoiDung(ActionRequest actionRequest, ActionResponse httpReq) {
		// TODO Auto-generated method stub
		_log.debug("-lienVan_vietLao_xemTruocNoiDung-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.xemTruocNoiDungCongVan(actionRequest, httpReq);
	}	
	public static void lienVan_vietLao_guiDuyet(ActionRequest actionRequest, ActionResponse httpReq) throws SystemException {
		// TODO Auto-generated method stub
		_log.debug("-lienVan_vietLao_guiDuyet-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		// TODO
		FormUtil.guiDuyetProcess(actionRequest, httpReq);
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest,httpReq);
	}	
	public static void lienVan_vietLao_luuThongTinThamXet(ActionRequest actionRequest, ActionResponse actionResponse) {
		_log.info("-------------------lienVan_vietLao_luuThongTinThamXet--------------------------");
		try {
			term = new QlvtLienVanTerm(actionRequest);
			//UPDATE
			long idReturn = FormUtil.gPlienVanInsertProcess(actionRequest, actionResponse);
			FormUtil.customResponse(actionRequest,actionResponse, FormUtil.bodyTextLienVan(idReturn));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//private
	private static void lienVan_ThongTinHoSo(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, SystemException {
		QlvtThongTinHoSo thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.fetchQlvtThongTinHoSo(term.getThongHoSoId());
		//1
		if(Validator.isNotNull(term.getSoGiayPhepKinhDoanhVanTaiNoiDia()))thongTinHoSo.setSoGiayPhepKinhDoanhVanTaiNoiDia(term.getSoGiayPhepKinhDoanhVanTaiNoiDia());
		if(Validator.isNotNull(term.getNgayCapGPKDVTNoiDia()))thongTinHoSo.setNgayCapGPKDVTNoiDia(term.getNgayCapGPKDVTNoiDia());
		if(Validator.isNotNull(term.getCoQuanCapPhepLienVan()))thongTinHoSo.setCoQuanCapGPKDVTNoiDia(term.getCoQuanCapPhepLienVan());
		if(Validator.isNotNull(term.getNgayHetHanGPKDVTNoiDia()))thongTinHoSo.setNgayHetHanGPKDVTNoiDia(term.getNgayHetHanGPKDVTNoiDia());
		if(Validator.isNotNull(term.getLanCapGPKDVTNoiDia()))thongTinHoSo.setLanCapGPKDVTNoiDia(term.getLanCapGPKDVTNoiDia());
		//2
		if(Validator.isNotNull(term.getSoGpkd()))thongTinHoSo.setSoDkkd(term.getSoGpkd());
		if(Validator.isNotNull(term.getNgayCapGpkd()))thongTinHoSo.setNgayCapDkkd(term.getNgayCapGpkd());
		if(Validator.isNotNull(term.getNgayHetHanGpvt()))thongTinHoSo.setNgayHetHanDkkd(term.getNgayHetHanGpvt());
		if(Validator.isNotNull(term.getLanCapGiayDangKyKinhDoanh()))thongTinHoSo.setLanCapGiayDangKyKinhDoanh(term.getLanCapGiayDangKyKinhDoanh());
		if(Validator.isNotNull(term.getCoQuanCapGpkd()))thongTinHoSo.setCoQuanCapDkkd(term.getCoQuanCapGpkd());
		if(Validator.isNotNull(term.getNgayHetHanGPKDVTNoiDia()))thongTinHoSo.setNgayHetHanDkkd(term.getNgayHetHanGPKDVTNoiDia());
		if(Validator.isNotNull(term.getLanCapGPKDVTNoiDia()))thongTinHoSo.setLanCapGPKDVTNoiDia(term.getLanCapGPKDVTNoiDia());
		//3
		thongTinHoSo.setNguoiLienHeTraKetQua(term.getHoTenNTKQ());
		thongTinHoSo.setSoDienThoaiNguoiLienHe(term.getDienThoaiNTKQ());
		if(Validator.isNotNull(term.getTenDn()))thongTinHoSo.setTenDn(term.getTenDn());
		if(Validator.isNotNull(term.getDiaChiDn()))thongTinHoSo.setDiaChiDn(term.getDiaChiDn());
		if(Validator.isNotNull(term.getLyDoGiaHan()))thongTinHoSo.setLyDoCapLai(term.getLyDoGiaHan());
		
		//end, thieu se bo sung sau
		// TODO
		thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.updateQlvtThongTinHoSo(thongTinHoSo);
	}
	
	private static void lienVan_ThongTinHoSo_TraKetQua(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, SystemException {
		Long idPhieuXuLy = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
		QlvtThongTinHoSo thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.fetchByphieuXuLyId(idPhieuXuLy);
		_log.info("=========thongtinhoso===="+thongTinHoSo + "==========="+term.getThongHoSoId());
		if(Validator.isNotNull(term.getNguoiLienHeTraKetQua()))thongTinHoSo.setNguoiLienHeTraKetQua(term.getNguoiLienHeTraKetQua());
		if(Validator.isNotNull(term.getSoDienThoaiNguoiLienHe()))thongTinHoSo.setSoDienThoaiNguoiLienHe(term.getSoDienThoaiNguoiLienHe());
		if(Validator.isNotNull(term.getNguoiNhanKetQua()))thongTinHoSo.setNguoiNhanKetQua(term.getNguoiNhanKetQua());
		if(Validator.isNotNull(term.getThongTinTraKetQua()))thongTinHoSo.setThongTinTraKetQua(term.getThongTinTraKetQua());
		if(Validator.isNotNull(term.getNgayTraKetQua()))thongTinHoSo.setNgayTraKetQua(term.getNgayTraKetQua());
		
		
		// TODO
		thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.updateQlvtThongTinHoSo(thongTinHoSo);
	}
	
	private static void lienVan_ThongTinGPLienVan(ActionRequest actionRequest,
			ActionResponse httpReq) throws NumberFormatException, SystemException {
		// TODO Auto-generated method stub
		QlvtXuLyGpLienVan qlvtGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.fetchQlvtXuLyGpLienVan(term.getId());
		qlvtGpLienVan.setNgayHetHanGiayPhepLienVan(term.getNgayHetHanGiayPhepLienVan());
		qlvtGpLienVan.setLoaiGiayPhepLienVan(term.getLoaiGiayPhepLienVan());
		qlvtGpLienVan.setMucDichChuyenDi(term.getMucDichChuyenDi());
		qlvtGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.updateQlvtXuLyGpLienVan(qlvtGpLienVan);
	}
}
