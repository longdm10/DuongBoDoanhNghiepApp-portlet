package vn.dtt.duongbo.portlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import vn.dtt.duongbo.business.Constants;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinXuLyLocalServiceUtil;
import vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOto;
import vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai;
import vn.dtt.duongbo.dao.noidia.service.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalServiceUtil;
import vn.dtt.duongbo.dao.noidia.service.QlvtXuLyGpkdvtBangOtoLocalServiceUtil;
import vn.dtt.duongbo.portlet.canbo.utils.CanBoBusinessUtils;
import vn.dtt.duongbo.term.noidia.QLVTNoiDiaTerm;
import vn.dtt.duongbo.term.quocte.QLVTQuocTeTerm;
import vn.dtt.form.util.FormUtil;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;

public class NoiDiaPortlet {

	public static Log _log = LogFactoryUtil.getLog(NoiDiaPortlet.class);
	public static QLVTNoiDiaTerm term = null;
	//nội địa ô tô
	public static void noiDia_oTo_choThamXet(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTNoiDiaTerm(actionRequest);
		_log.debug("-noiDia_oTo_choThamXet-----dung cho cho` tham xet!!!--");
		noiDia_ThongTinHoSo(actionRequest, httpReq);
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void noiDia_oTo_dangThamXet(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTNoiDiaTerm(actionRequest);
		_log.debug("-noiDia_oTo_dangThamXet-----dung cho cho` tham xet!!!--");
		noiDia_ThongTinHoSo(actionRequest, httpReq);
		//send json message
		FormUtil.customResponse(actionRequest,httpReq, FormUtil.bodyTextNoiDia(term.getId()));
}
	public static void noiDia_oTo_CD(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTNoiDiaTerm(actionRequest);
		_log.debug("-noiDia_oTo_CD-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void noiDia_oTo_CDDYCBS(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTNoiDiaTerm(actionRequest);
		_log.debug("-noiDia_oTo_CDDYCBS-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void noiDia_oTo_CTKQ(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTNoiDiaTerm(actionRequest);
		_log.debug("-noiDia_oTo_CDDYCBS-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void noiDia_oTo_CDDTCCP(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTNoiDiaTerm(actionRequest);
		_log.debug("-noiDia_oTo_CDDYCBS-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void noiDia_oTo_HTHS(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTNoiDiaTerm(actionRequest);
		_log.debug("-noiDia_oTo_CDDYCBS-----dung cho cho` tham xet!!!--");
		noiDia_ThongTinHoSo_traketqua(actionRequest, httpReq);
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void noiDia_oTo_HHS(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTNoiDiaTerm(actionRequest);
		_log.debug("-noiDia_oTo_CDDYCBS-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	
	public static void noiDia_oTo_xemTruocNoiDung(ActionRequest actionRequest, ActionResponse httpReq) {
		// TODO Auto-generated method stub
		_log.debug("-noiDia_xemTruocNoiDung-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.xemTruocNoiDungCongVan(actionRequest, httpReq);
	}	
	public static void noiDia_oTo_guiDuyet(ActionRequest actionRequest, ActionResponse httpReq) throws SystemException {
		// TODO Auto-generated method stub
		_log.debug("-noiDia_guiDuyet-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		// TODO
		FormUtil.guiDuyetProcess(actionRequest, httpReq);
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest,httpReq);
	}	
	public static void noiDia_oTo_luuThongTinThamXet(ActionRequest actionRequest, ActionResponse actionResponse) {
		_log.info("-------------------noiDia_luuThongTinThamXet--------------------------");
		try {
			term = new QLVTNoiDiaTerm(actionRequest);
			//UPDATE
			long idReturn = FormUtil.gPNoiDiaOTOInsertProcess(actionRequest, actionResponse);
			FormUtil.customResponse(actionRequest,actionResponse, FormUtil.bodyTextNoiDia(idReturn));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//private
	public static void noiDia_ThongTinHoSo(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, SystemException {
		QlvtThongTinHoSo thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.fetchQlvtThongTinHoSo(term.getThongHoSoId());
//		thongTinHoSo.setSoGiayPhepKinhDoanhVanTaiNoiDia(term.getSoGpkdVanTaiBangOto());
//		thongTinHoSo.setNgayCapGPKDVTNoiDia(term.getNgayCapGpkdVanTaiBangOto());
//		thongTinHoSo.setCoQuanCapGPKDVTNoiDia(term.getCoQuanCapGpkdVanTaiBangOto());
//		thongTinHoSo.setNgayHetHanGPKDVTNoiDia(term.getNgayHetHanGpkdVanTaiBangOto());
//		thongTinHoSo.setNgayGiaHanGPKDVTNoiDia(term.getNgayGiaHanGPKDVTNoiDia());
//		thongTinHoSo.setLanCapGPKDVTNoiDia(term.getLanCapGPKDVTNoiDia());
//		thongTinHoSo.setLanCapGiayDangKyKinhDoanh(term.getLanCapGiayDangKyKinhDoanh());
//		thongTinHoSo.setNguoiLienHeTraKetQua(term.getNguoiLienHeTraKetQua());
//		thongTinHoSo.setSoDienThoaiNguoiLienHe(term.getSoDienThoaiNguoiLienHe());
		
		thongTinHoSo.setSoDkkd(term.getSoGpkdVanTaiBangOto());
		thongTinHoSo.setNgayCapGPKDVTNoiDia(term.getNgayCapGpkdVanTaiBangOto());
		thongTinHoSo.setCoQuanCapDkkd(term.getCoQuanCapGpkdVanTaiBangOto());
		
		//end, thieu se bo sung saut
		// TODO
		QlvtThongTinHoSoLocalServiceUtil.updateQlvtThongTinHoSo(thongTinHoSo);
		QlvtThongTinXuLy qlvtThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil.fetchBythongTinHoSoId(thongTinHoSo.getId());
		QlvtXuLyGpkdvtBangOto gpkdvtBangOto = QlvtXuLyGpkdvtBangOtoLocalServiceUtil.fetchBythongTinXuLyId(Integer.valueOf("0"+qlvtThongTinXuLy.getId()));
		gpkdvtBangOto.setNguoiTrucTiepDieuHanh(term.getNguoiTrucTiepDieuHanh());
		gpkdvtBangOto.setSoCmtNguoiDieuHanh(term.getSoCmtNguoiDieuHanh());
		gpkdvtBangOto.setNgayCapNguoiDieuHanh(term.getNgayCapNguoiDieuHanh());
		gpkdvtBangOto.setNoiCapNguoiDieuHanh(term.getNoiCapNguoiDieuHanh());
		gpkdvtBangOto.setBangCapNguoiDieuHanh(term.getBangCapNguoiDieuHanh());
		gpkdvtBangOto.setThoiGianBatDauDieuHanh(term.getThoiGianBatDauDieuHanh());
		gpkdvtBangOto.setThoiGianKetThucDieuHanh(term.getThoiGianKetThucDieuHanh());
		gpkdvtBangOto.setSoGiayPhepNguoiDieuHanh(term.getSoGiayPhepNguoiDieuHanh());
		gpkdvtBangOto.setLanCapNguoiDieuHanh(term.getLanCapNguoiDieuHanh());
		gpkdvtBangOto.setNgayCapCcDieuHanh(term.getNgayCapCcDieuHanh());
		gpkdvtBangOto.setNgayHetHanCcDieuHanh(term.getNgayHetHanCcDieuHanh());
		gpkdvtBangOto.setKetQuaXuLyNguoiDieuHanh(term.getKetQuaXuLyNguoiDieuHanh());
		gpkdvtBangOto.setLyDoKhongDatNguoiDieuHanh(term.getLyDoKhongDatNguoiDieuHanh());
		gpkdvtBangOto.setKetQuaXuLy(term.getKetQuaXuLy());
		gpkdvtBangOto.setLyDoKhongDat(term.getLyDoKhongDat());
		QlvtXuLyGpkdvtBangOtoLocalServiceUtil.updateQlvtXuLyGpkdvtBangOto(gpkdvtBangOto);
		
	}
	public static void noiDia_ThongTinHoSo_traketqua(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, SystemException {
		Long idPhieuXuLy = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
		QlvtThongTinHoSo thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.fetchByphieuXuLyId(idPhieuXuLy);
		_log.info("=========thongtinhoso===="+thongTinHoSo + "==========="+term.getThongHoSoId());
		if(Validator.isNotNull(term.getNguoiLienHeTraKetQua()))thongTinHoSo.setNguoiLienHeTraKetQua(term.getNguoiLienHeTraKetQua());
		if(Validator.isNotNull(term.getSoDienThoaiNguoiLienHe()))thongTinHoSo.setSoDienThoaiNguoiLienHe(term.getSoDienThoaiNguoiLienHe());
		if(Validator.isNotNull(term.getNguoiNhanKetQua()))thongTinHoSo.setNguoiNhanKetQua(term.getNguoiNhanKetQua());
		if(Validator.isNotNull(term.getthongTinTraKetQua()))thongTinHoSo.setThongTinTraKetQua(term.getthongTinTraKetQua());
		if(Validator.isNotNull(term.getNgayTraKetQua()))thongTinHoSo.setNgayTraKetQua(term.getNgayTraKetQua());
		//end, thieu se bo sung saut
		// TODO
		QlvtThongTinHoSoLocalServiceUtil.updateQlvtThongTinHoSo(thongTinHoSo);
	
		_log.info("=========thongtinhoso=1111111==="+thongTinHoSo + "==========="+term.getThongHoSoId());
	}
//	public static void gPNoiDiaOTOInsertProcess_ThongTin(ActionRequest actionRequest,
//			ActionResponse httpReq) {
//		// TODO Auto-generated method stub
//		try {
//
//			QLVTNoiDiaTerm term = new QLVTNoiDiaTerm(actionRequest);
//			QlvtThongTinHoSo thongtinhoso = QlvtThongTinHoSoLocalServiceUtil.fetchQlvtThongTinHoSo(term.getThongHoSoId());
//			QlvtThongTinXuLy ettThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil.fetchBythongTinHoSoId(Integer.valueOf("0"+thongtinhoso.getId()));
//			QlvtXuLyGpkdvtBangOto gpkdvtBangOto = QlvtXuLyGpkdvtBangOtoLocalServiceUtil.fetchBythongTinXuLyId(Integer.valueOf("0"+ettThongTinXuLy.getId()));
//			gpkdvtBangOto.setNguoiTrucTiepDieuHanh(term.getNguoiTrucTiepDieuHanh());
//			gpkdvtBangOto.setSoCmtNguoiDieuHanh(term.getSoCmtNguoiDieuHanh());
//			gpkdvtBangOto.setNgayCapNguoiDieuHanh(term.getNgayCapNguoiDieuHanh());
//			gpkdvtBangOto.setNoiCapNguoiDieuHanh(term.getNoiCapNguoiDieuHanh());
//			gpkdvtBangOto.setBangCapNguoiDieuHanh(term.getBangCapNguoiDieuHanh());
//			gpkdvtBangOto.setThoiGianBatDauDieuHanh(term.getThoiGianBatDauDieuHanh());
//			gpkdvtBangOto.setThoiGianKetThucDieuHanh(term.getThoiGianKetThucDieuHanh());
//			gpkdvtBangOto.setSoGiayPhepNguoiDieuHanh(term.getSoGiayPhepNguoiDieuHanh());
//			gpkdvtBangOto.setLanCapNguoiDieuHanh(term.getLanCapNguoiDieuHanh());
//			gpkdvtBangOto.setNgayCapCcDieuHanh(term.getNgayCapCcDieuHanh());
//			gpkdvtBangOto.setNgayHetHanCcDieuHanh(term.getNgayHetHanCcDieuHanh());
//			gpkdvtBangOto.setKetQuaXuLyNguoiDieuHanh(term.getKetQuaXuLyNguoiDieuHanh());
//			gpkdvtBangOto.setLyDoKhongDatNguoiDieuHanh(term.getLyDoKhongDatNguoiDieuHanh());
//			QlvtXuLyGpkdvtBangOtoLocalServiceUtil.updateQlvtXuLyGpkdvtBangOto(gpkdvtBangOto);
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		
//	}
}
