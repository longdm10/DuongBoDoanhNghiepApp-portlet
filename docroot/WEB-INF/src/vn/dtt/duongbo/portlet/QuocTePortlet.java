package vn.dtt.duongbo.portlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import vn.dtt.duongbo.business.Constants;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTe;
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyGpkdvtQuocTeLocalServiceUtil;
import vn.dtt.duongbo.portlet.canbo.utils.CanBoBusinessUtils;
import vn.dtt.duongbo.term.quocte.QLVTQuocTeTerm;
import vn.dtt.form.util.FormUtil;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;

public class QuocTePortlet {

	private static Log _log = LogFactoryUtil.getLog(QuocTePortlet.class);
	private static QLVTQuocTeTerm term = null;
	//quốc tế việt lào
	public static void quocTe_vietLao_choThamXet(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTQuocTeTerm(actionRequest);
		_log.debug("-quocTe_vietLao_choThamXet-----dung cho cho` tham xet!!!--");
		quocTe_ThongTinHoSo(actionRequest, httpReq);
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void quocTe_vietLao_dangThamXet(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTQuocTeTerm(actionRequest);
		_log.debug("-quocTe_vietLao_dangThamXet-----dung cho cho` tham xet!!!--");
		quocTe_ThongTinHoSo(actionRequest, httpReq);
		//send json message
		FormUtil.customResponse(actionRequest,httpReq, FormUtil.bodyTextQuocTe(term.getId()));
	}
	public static void quocTe_vietLao_CD(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTQuocTeTerm(actionRequest);
		_log.debug("-quocTe_vietLao_CD-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void quocTe_vietLao_CPD(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTQuocTeTerm(actionRequest);
		_log.debug("-quocTe_vietLao_CPD-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void quocTe_vietLao_CDDYCBS(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTQuocTeTerm(actionRequest);
		_log.debug("-quocTe_vietLao_CDDYCBS-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void quocTe_vietLao_CTKQ(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTQuocTeTerm(actionRequest);
		_log.debug("-quocTe_vietLao_CDDYCBS-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void quocTe_vietLao_CDDTCCP(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTQuocTeTerm(actionRequest);
		_log.debug("-quocTe_vietLao_CDDYCBS-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void quocTe_vietLao_HTHS(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTQuocTeTerm(actionRequest);
		_log.debug("-quocTe_vietLao_CDDYCBS-----dung cho cho` tham xet!!!--");
		quocTe_ThongTinHoSo_TraKetQua(actionRequest,httpReq);
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void quocTe_vietLao_HHS(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTQuocTeTerm(actionRequest);
		_log.debug("-quocTe_vietLao_CDDYCBS-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	//quốc tế việt cam
	public static void quocTe_vietCam_choThamXet(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTQuocTeTerm(actionRequest);
		_log.debug("-quocTe_vietCam_choThamXet-----dung cho cho` tham xet!!!--");
		quocTe_ThongTinHoSo(actionRequest, httpReq);
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void quocTe_vietCam_dangThamXet(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTQuocTeTerm(actionRequest);
		_log.debug("-quocTe_vietCam_dangThamXet-----dung cho cho` tham xet!!!--");
		quocTe_ThongTinHoSo(actionRequest, httpReq);
		//send json message
		FormUtil.customResponse(actionRequest,httpReq, FormUtil.bodyTextQuocTe(term.getId()));
	}
	public static void quocTe_vietCam_CD(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTQuocTeTerm(actionRequest);
		_log.debug("-quocTe_vietCam_CD-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void quocTe_vietCam_CPD(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTQuocTeTerm(actionRequest);
		_log.debug("-quocTe_vietCam_CPD-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void quocTe_vietCam_CDDYCBS(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTQuocTeTerm(actionRequest);
		_log.debug("-quocTe_vietCam_CDDYCBS-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void quocTe_vietCam_CTKQ(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTQuocTeTerm(actionRequest);
		_log.debug("-quocTe_vietCam_CDDYCBS-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void quocTe_vietCam_CDDTCCP(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTQuocTeTerm(actionRequest);
		_log.debug("-quocTe_vietCam_CDDYCBS-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void quocTe_vietCam_HTHS(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTQuocTeTerm(actionRequest);
		_log.debug("-quocTe_vietCam_CDDYCBS-----dung cho cho` tham xet!!!--");
		quocTe_ThongTinHoSo_TraKetQua(actionRequest,httpReq);
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void quocTe_vietCam_HHS(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTQuocTeTerm(actionRequest);
		_log.debug("-quocTe_vietCam_CDDYCBS-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void quocTe_vietLao_xemTruocNoiDung(ActionRequest actionRequest, ActionResponse httpReq) {
		// TODO Auto-generated method stub
		_log.debug("-quocTe_vietLao_xemTruocNoiDung-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.xemTruocNoiDungCongVan(actionRequest, httpReq);
	}	
	public static void quocTe_vietLao_guiDuyet(ActionRequest actionRequest, ActionResponse httpReq) throws SystemException {
		// TODO Auto-generated method stub
		_log.debug("-quocTe_vietLao_guiDuyet-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		// TODO
		FormUtil.guiDuyetProcess(actionRequest, httpReq);
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest,httpReq);
	}	
	public static void quocTe_vietLao_luuThongTinThamXet(ActionRequest actionRequest, ActionResponse actionResponse) {
		_log.info("-------------------quocTe_vietLao_luuThongTinThamXet--------------------------");
		try {
			term = new QLVTQuocTeTerm(actionRequest);
			//UPDATE
			long idReturn = FormUtil.gPQuocTeInsertProcess(actionRequest, actionResponse);
			FormUtil.customResponse(actionRequest,actionResponse, FormUtil.bodyTextQuocTe(idReturn));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void quocTe_vietCam_xemTruocNoiDung(ActionRequest actionRequest, ActionResponse httpReq) {
		// TODO Auto-generated method stub
		_log.debug("-quocTe_vietCam_xemTruocNoiDung-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.xemTruocNoiDungCongVan(actionRequest, httpReq);
	}	
	public static void quocTe_vietCam_guiDuyet(ActionRequest actionRequest, ActionResponse httpReq) throws SystemException {
		// TODO Auto-generated method stub
		_log.debug("-quocTe_vietCam_guiDuyet-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		// TODO
		FormUtil.guiDuyetProcess(actionRequest, httpReq);
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest,httpReq);
	}	
	public static void quocTe_vietCam_luuThongTinThamXet(ActionRequest actionRequest, ActionResponse actionResponse) {
		_log.info("-------------------quocTe_vietCam_luuThongTinThamXet--------------------------");
		try {
			term = new QLVTQuocTeTerm(actionRequest);
			//UPDATE
			long idReturn = FormUtil.gPQuocTeInsertProcess(actionRequest, actionResponse);
			FormUtil.customResponse(actionRequest,actionResponse, FormUtil.bodyTextQuocTe(idReturn));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//private
	private static void quocTe_ThongTinHoSo(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, SystemException {
		//end, thieu se bo sung sau
		// TODO
		try {
			QlvtThongTinHoSo qlvtThongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.fetchQlvtThongTinHoSo(term.getThongHoSoId());
			// TODO
			qlvtThongTinHoSo.setCoQuanCapDkkd(term.getCoQuanCapGiayPhepVanTaiId());
			//qlvtThongTinHoSo.setCoQuanGiaiQuyet(term.get)
			
			qlvtThongTinHoSo.setLanCapGPKDVTQuocTe(term.getLanCapGPKDVTQuocTe());
			qlvtThongTinHoSo.setLanCapGPKDVTNoiDia(term.getLanCapGPKDVTNoiDia());
			qlvtThongTinHoSo.setLanCapGiayDangKyKinhDoanh(term.getLanCapGiayDangKyKinhDoanh());
			qlvtThongTinHoSo.setLyDoCapLai(term.getLyDoKhongDat());
			qlvtThongTinHoSo.setNgayHetHanDkkd(term.getNgayHetHanGiayPhepVanTai());
			qlvtThongTinHoSo.setNgayCapGPKDVTNoiDia(term.getNgayCapGPKDVTNoiDia());
			qlvtThongTinHoSo.setNgayCapGPKDVTQuocTe(term.getNgayCapGPKDVTQuocTe());
			qlvtThongTinHoSo.setNgayGiaHanGiayDangKyKinhDoanh(term.getNgayGiaHanGiayDangKyKinhDoanh());
			qlvtThongTinHoSo.setNgayGiaHanGPKDVTNoiDia(term.getNgayGiaHanGPKDVTNoiDia());
			qlvtThongTinHoSo.setNgayGiaHanGPKDVTQuocTe(term.getNgayGiaHanGPKDVTQuocTe());
			qlvtThongTinHoSo.setLyDoCapLai(term.getLyDoKhongDat());
			qlvtThongTinHoSo.setSoGiayPhepKinhDoanhVanTaiQuocTe(term.getSoGiayPhepKinhDoanhVanTaiQuocTe());
			qlvtThongTinHoSo.setNgayCapGPKDVTQuocTe(term.getNgayCapGPKDVTQuocTe());
			
			
			qlvtThongTinHoSo.setSoDienThoaiNguoiLienHe(term.getSoDienThoaiNguoiLienHe());
			qlvtThongTinHoSo.setNguoiLienHeTraKetQua(term.getNguoiLienHeTraKetQua());
			qlvtThongTinHoSo.setNgayHetHanGPKDVTNoiDia(term.getNgayHetHanGPKDVTNoiDia());
			qlvtThongTinHoSo.setNgayHetHanGPKDVTQuocTe(term.getNgayHetHanGPKDVTQuocTe());
			qlvtThongTinHoSo.setNgayHetHanGPKDVTQuocTe(term.getNgayHetHanGPKDVTQuocTe());
			
			qlvtThongTinHoSo.setTenDn(term.getTenDn());
			qlvtThongTinHoSo.setDiaChiDn(term.getDiaChiDn());
			qlvtThongTinHoSo.setDienThoaiDn(term.getDienThoaiDn());
			qlvtThongTinHoSo.setSoFaxDn(term.getSoFaxDN());
			
			qlvtThongTinHoSo.setNguoiNhanKetQua(term.getNguoiNhanKetQua());
			qlvtThongTinHoSo.setThongTinTraKetQua(term.getThongTinTraKetQua());
			qlvtThongTinHoSo.setNgayTraKetQua(term.getNgayTraKetQua());
			
			QlvtThongTinHoSoLocalServiceUtil.updateQlvtThongTinHoSo(qlvtThongTinHoSo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void quocTe_ThongTinHoSo_TraKetQua(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, SystemException {
		try {
			Long idPhieuXuLy = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
			QlvtThongTinHoSo thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.fetchByphieuXuLyId(idPhieuXuLy);
			_log.info("=========thongtinhoso===="+thongTinHoSo + "==========="+term.getThongHoSoId());
			if(Validator.isNotNull(term.getNguoiLienHeTraKetQua()))thongTinHoSo.setNguoiLienHeTraKetQua(term.getNguoiLienHeTraKetQua());
			if(Validator.isNotNull(term.getSoDienThoaiNguoiLienHe()))thongTinHoSo.setSoDienThoaiNguoiLienHe(term.getSoDienThoaiNguoiLienHe());
			if(Validator.isNotNull(term.getNguoiNhanKetQua()))thongTinHoSo.setNguoiNhanKetQua(term.getNguoiNhanKetQua());
			if(Validator.isNotNull(term.getThongTinTraKetQua()))thongTinHoSo.setThongTinTraKetQua(term.getThongTinTraKetQua());
			if(Validator.isNotNull(term.getNgayTraKetQua()))thongTinHoSo.setNgayTraKetQua(term.getNgayTraKetQua());
			QlvtThongTinHoSoLocalServiceUtil.updateQlvtThongTinHoSo(thongTinHoSo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
