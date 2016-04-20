package vn.dtt.duongbo.portlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import vn.dtt.duongbo.business.Constants;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieu;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyBienHieuLocalServiceUtil;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyBienHieuPhuongTienLocalServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinXuLyLocalServiceUtil;
import vn.dtt.duongbo.portlet.canbo.utils.CanBoBusinessUtils;
import vn.dtt.duongbo.term.capbienhieuphuhieu.QLVTBienHieuTerm;
import vn.dtt.duongbo.term.noidia.QLVTNoiDiaTerm;
import vn.dtt.form.util.FormUtil;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.util.PortalUtil;

public class BienHieuPortlet {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private static Log _log = LogFactoryUtil.getLog(BienHieuPortlet.class);
	private static QLVTBienHieuTerm term = null;
	//nội địa bien hieu ô tô
	public static void bienHieu_oTo_choThamXet(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTBienHieuTerm(actionRequest);
		_log.debug("-bienHieu_oTo_choThamXet-----dung cho cho` tham xet!!!--");
		bienHieu_ThongTinHoSo(actionRequest, httpReq);
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void bienHieu_oTo_dangThamXet(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTBienHieuTerm(actionRequest);
		_log.debug("-bienHieu_oTo_dangThamXet-----dung cho cho` tham xet!!!--");
		bienHieu_ThongTinHoSo(actionRequest, httpReq);
		//send json message
		FormUtil.customResponse(actionRequest,httpReq, FormUtil.bodyTextLienVan(term.getId()));
	}
	public static void bienHieu_oTo_CD(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTBienHieuTerm(actionRequest);
		_log.debug("-bienHieu_oTo_CD-----dung cho cho` tham xet!!!--");
		FormUtil.lanhDaoCD(actionRequest, httpReq);
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void bienHieu_oTo_CDDYCBS(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTBienHieuTerm(actionRequest);
		_log.debug("-bienHieu_oTo_CDDYCBS-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void bienHieu_oTo_CTKQ(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTBienHieuTerm(actionRequest);
		_log.debug("-bienHieu_oTo_CDDYCBS-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void bienHieu_oTo_CDDTCCP(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTBienHieuTerm(actionRequest);
		_log.debug("-bienHieu_oTo_CDDYCBS-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void bienHieu_oTo_HTHS(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTBienHieuTerm(actionRequest);
		_log.debug("-bienHieu_oTo_CDDYCBS-----dung cho cho` tham xet!!!--");
		bienHieu_ThongTinHoSo_TraKetQua(actionRequest, httpReq);
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void bienHieu_oTo_HHS(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTBienHieuTerm(actionRequest);
		_log.debug("-bienHieu_oTo_CDDYCBS-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void bienHieu_oTo_xemTruocNoiDung(ActionRequest actionRequest, ActionResponse httpReq) {
		// TODO Auto-generated method stub
		_log.debug("-bienHieu_oTo_xemTruocNoiDung-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.xemTruocNoiDungCongVan(actionRequest, httpReq);
	}	
	public static void bienHieu_oTo_guiDuyet(ActionRequest actionRequest, ActionResponse httpReq) throws SystemException {
		// TODO Auto-generated method stub
		_log.debug("-bienHieu_oTo_guiDuyet-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		// TODO
		FormUtil.guiDuyetProcess(actionRequest, httpReq);
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest,httpReq);
	}	
	public static void bienHieu_oTo_luuThongTinThamXet(ActionRequest actionRequest, ActionResponse actionResponse) {
		_log.info("-------------------bienHieu_oTo_luuThongTinThamXet--------------------------");
		try {
			term = new QLVTBienHieuTerm(actionRequest);
			QLVTXuLyBienHieuPhuongTien ettPhuongTien = QLVTXuLyBienHieuPhuongTienLocalServiceUtil.fetchQLVTXuLyBienHieuPhuongTien(Integer.valueOf(term.getIdPhuongTien()));
			//UPDATE
			_log.info("-------------------ettPhuongTien--------------------------"+term.getLyDoKhongDat());
			_log.info("-------------------term.getLyDoKhongDat()--------------------------"+term.getLyDoKhongDat());
			_log.info("-------------------term.getKetQuaXuLy()-------------------------"+term.getKetQuaXuLy());
			_log.info("-------------------term.getThoiHanThue()-------------------------"+term.getThoiHanThue());
			ettPhuongTien.setHinhThucSoHuuXe(term.getHinhThucSoHuuXe());
			ettPhuongTien.setHopDongSauCung(term.getHopDongSauCung());
			ettPhuongTien.setKetQuaXuLy(String.valueOf(term.getKetQuaXuLy()));
			ettPhuongTien.setLinhVucKinhDoanhXeDuLich(term.getLinhVucKinhDoanh());
			ettPhuongTien.setLyDoKhongDat(term.getLyDoKhongDat());
			ettPhuongTien.setNamSx(term.getNamSx());
			ettPhuongTien.setMauSon(term.getMauSon());
			ettPhuongTien.setNhanHieu(term.getNhanHieu());
			ettPhuongTien.setNienHanSuDungGiayDangKiem(term.getNienHanSuDungGiayDangKiem());
			ettPhuongTien.setNienHanSuDungND86(term.getNienHanSuDungND86());
			ettPhuongTien.setSoChoNgoi(Integer.valueOf("0"+term.getTrongTai()));
			ettPhuongTien.setSoPhuHieuDuocCap(term.getSoPhuHieuDuocCap());
			ettPhuongTien.setThoiHanDuocCapPhep(term.getThoiHanDuocCapPhep());
			ettPhuongTien.setThoiHanThue(term.getThoiHanThue());
			ettPhuongTien.setDoanhNghiepSoHuuThue(term.getDoanhNghiepSoHuuThue());
			ettPhuongTien.setSoKhung(term.getSoKhung());
			ettPhuongTien.setTrongTai(Long.valueOf("0"+term.getTrongTai()));
			//ra giay
			ettPhuongTien.setSoA(term.getSoA());
			ettPhuongTien.setSoB(term.getSoB());
			ettPhuongTien.setCoGiaTriDen(term.getCoGiaTriDen());
			ettPhuongTien = QLVTXuLyBienHieuPhuongTienLocalServiceUtil.updateQLVTXuLyBienHieuPhuongTien(ettPhuongTien);
			FormUtil.customResponse(actionRequest,actionResponse, FormUtil.bodyTextBienHieu(ettPhuongTien.getCapBienHieuID()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//private
	private static void bienHieu_ThongTinHoSo(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, SystemException {
		_log.info("*************************term.getId()"+term.getId());
		_log.info("*************************term.getThongHoSoId()"+term.getThongHoSoId());
		_log.info("*************************term.getThongTinXuLyId()"+term.getThongTinXuLyId());
		QlvtThongTinHoSo thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.fetchQlvtThongTinHoSo(term.getThongHoSoId());
		QLVTXuLyBienHieu qlvtXuLyBienHieu = QLVTXuLyBienHieuLocalServiceUtil.fetchQLVTXuLyBienHieu(term.getId());
		// TODO
		thongTinHoSo.setTenDn(term.getTenDoanhNghiep());
		thongTinHoSo.setSoDkkd(term.getGiayPhepKinhDoanhVanTai());
		thongTinHoSo.setNgayCapDkkd(term.getNgayCapGiayPhepKinhDoanhVanTai());
		thongTinHoSo.setCoQuanCapDkkd(term.getNoiCapGiayPhepKinhDoanhVanTai());
		thongTinHoSo.setNgayHetHanDkkd(term.getNgayGiaHanGiayPhepKinhDoanhVanTai());
		//thong tin bien hieu 
		qlvtXuLyBienHieu.setGpkdLuuHanhQuocTe(term.getSoGPKDLuHanhQuocTe());
		qlvtXuLyBienHieu.setGpkdLuuHanhQuocTeCQCAP(term.getNoiCapGPKDLuHanhQuocTe());
		qlvtXuLyBienHieu.setGpkdLuuHanhQuocTeNgayCap(term.getNgayCapGPKDLuHanhQuocTe());
		qlvtXuLyBienHieu.setGpkdLuuHanhQuocTeNgayHetHan(term.getNgayGiaHanGPKDLuHanhQuocTe());
		qlvtXuLyBienHieu.setSoLuongXe(term.getSoLuongXeXinCap());
		thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.updateQlvtThongTinHoSo(thongTinHoSo);
		qlvtXuLyBienHieu = QLVTXuLyBienHieuLocalServiceUtil.updateQLVTXuLyBienHieu(qlvtXuLyBienHieu);
	}
	
	private static void bienHieu_ThongTinHoSo_TraKetQua(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, SystemException {
		Long idPhieuXuLy = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
		QlvtThongTinHoSo thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.fetchByphieuXuLyId(idPhieuXuLy);
		_log.info("=========thongtinhoso===="+thongTinHoSo + "==========="+term.getThongHoSoId());
		if(Validator.isNotNull(term.getNguoiLienHeTraKetQua()))thongTinHoSo.setNguoiLienHeTraKetQua(term.getNguoiLienHeTraKetQua());
		if(Validator.isNotNull(term.getSoDienThoaiNguoiLienHe()))thongTinHoSo.setSoDienThoaiNguoiLienHe(term.getSoDienThoaiNguoiLienHe());
		if(Validator.isNotNull(term.getNguoiNhanKetQua()))thongTinHoSo.setNguoiNhanKetQua(term.getNguoiNhanKetQua());
		if(Validator.isNotNull(term.getThongTinTraKetQua()))thongTinHoSo.setThongTinTraKetQua(term.getThongTinTraKetQua());
		if(Validator.isNotNull(term.getNgayTraKetQua()))thongTinHoSo.setNgayTraKetQua(term.getNgayTraKetQua());
		
	}
}
