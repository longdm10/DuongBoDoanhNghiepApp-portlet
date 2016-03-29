package vn.dtt.duongbo.portlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import vn.dtt.duongbo.business.Constants;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieu;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTien;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyBienHieuLocalServiceUtil;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyBienHieuPhuongTienLocalServiceUtil;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyPhuHieuLocalServiceUtil;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyPhuHieuPhuongTienLocalServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinXuLyLocalServiceUtil;
import vn.dtt.duongbo.portlet.canbo.utils.CanBoBusinessUtils;
import vn.dtt.duongbo.term.capbienhieuphuhieu.QLVTBienHieuTerm;
import vn.dtt.duongbo.term.capbienhieuphuhieu.QLVTPhuHieuTerm;
import vn.dtt.duongbo.term.capbienhieuphuhieu.QLVTPhuHieuTerm;
import vn.dtt.duongbo.term.noidia.QLVTNoiDiaTerm;
import vn.dtt.form.util.FormUtil;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.util.PortalUtil;

public class PhuHieuPortlet {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private static Log _log = LogFactoryUtil.getLog(PhuHieuPortlet.class);
	private static QLVTPhuHieuTerm term = null;
	//nội địa ô tô
	public static void phuHieu_oTo_choThamXet(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTPhuHieuTerm(actionRequest);
		_log.debug("-phuHieu_oTo_choThamXet-----dung cho cho` tham xet!!!--");
		phuHieu_ThongTinHoSo(actionRequest, httpReq);
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void phuHieu_oTo_dangThamXet(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTPhuHieuTerm(actionRequest);
		_log.debug("-phuHieu_oTo_dangThamXet-----dung cho cho` tham xet!!!--");
		phuHieu_ThongTinHoSo(actionRequest, httpReq);
		//send json message
		FormUtil.customResponse(actionRequest,httpReq, FormUtil.bodyTextLienVan(term.getId()));
	}
	public static void phuHieu_oTo_CD(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTPhuHieuTerm(actionRequest);
		_log.debug("-phuHieu_oTo_CD-----dung cho cho` tham xet!!!--");
		FormUtil.lanhDaoCD(actionRequest, httpReq);
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void phuHieu_oTo_CDDYCBS(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTPhuHieuTerm(actionRequest);
		_log.debug("-phuHieu_oTo_CDDYCBS-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void phuHieu_oTo_CTKQ(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTPhuHieuTerm(actionRequest);
		_log.debug("-phuHieu_oTo_CDDYCBS-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void phuHieu_oTo_CDDTCCP(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTPhuHieuTerm(actionRequest);
		_log.debug("-phuHieu_oTo_CDDYCBS-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void phuHieu_oTo_HTHS(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTPhuHieuTerm(actionRequest);
		_log.debug("-phuHieu_oTo_CDDYCBS-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void phuHieu_oTo_HHS(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, NumberFormatException, SystemException {
		term = new QLVTPhuHieuTerm(actionRequest);
		_log.debug("-phuHieu_oTo_CDDYCBS-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest, httpReq);
	}
	public static void phuHieu_oTo_xemTruocNoiDung(ActionRequest actionRequest,
			ActionResponse httpReq) {
		// TODO Auto-generated method stub
		_log.debug("-phuHieu_oTo_xemTruocNoiDung-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		canBoBusinessUtils.xemTruocNoiDungCongVan(actionRequest, httpReq);
	}
	public static void phuHieu_oTo_guiDuyet(ActionRequest actionRequest, ActionResponse httpReq) throws SystemException {
		// TODO Auto-generated method stub
		_log.debug("-phuHieu_oTo_guiDuyet-----dung cho cho` tham xet!!!--");
		CanBoBusinessUtils canBoBusinessUtils = new CanBoBusinessUtils();
		// TODO
		FormUtil.guiDuyetProcess(actionRequest, httpReq);
		canBoBusinessUtils.canBoDichChuyenTrangThaiDynamic(actionRequest,httpReq);
	}
	public static void phuHieu_oTo_luuThongTinThamXet(ActionRequest actionRequest, ActionResponse actionResponse) {
		_log.info("-------------------phuHieu_oTo_luuThongTinThamXet--------------------------");
		try {
			term = new QLVTPhuHieuTerm(actionRequest);
			QLVTXuLyPhuHieuPhuongTien ettPhuongTien = QLVTXuLyPhuHieuPhuongTienLocalServiceUtil.fetchQLVTXuLyPhuHieuPhuongTien(Integer.valueOf(term.getIdPhuongTien()));
			ettPhuongTien.setHinhThucSoHuuXe(term.getHinhThucSoHuuXe());
			ettPhuongTien.setHopDongSauCung(term.getHopDongSauCung());
			ettPhuongTien.setKetQuaXuLy(String.valueOf(term.getKetQuaXuLy()));
			ettPhuongTien.setLinhVucKinhDoanhXeDuLich(term.getLoaiPhuHieuXinCap());
			ettPhuongTien.setLyDoKhongDat(term.getLyDoKhongDat());
			ettPhuongTien.setNamSanXuat(term.getNamSanXuat());
			ettPhuongTien.setNhanHieu(term.getNhanHieu());
			ettPhuongTien.setNienHanSuDungGiayDangKiem(term.getNienHanSuDungGiayDangKiem());
			ettPhuongTien.setNienHanSuDungND86(term.getNienHanSuDungND86());
			ettPhuongTien.setSoChoNgoi(Integer.valueOf("0"+term.getTrongTai()));
			ettPhuongTien.setSoPhuHieuDuocCap(term.getSoPhuHieuDuocCap());
			ettPhuongTien.setThoiHanDuocCapPhep(term.getThoiHanDuocCapPhep());
			ettPhuongTien.setThoiHanThue(term.getThoiHanThue());
			ettPhuongTien.setDoanhNghiepSoHuuThue(term.getDoanhNghiepSoHuuThue());
			ettPhuongTien.setSoChoNgoi(Integer.valueOf("0"+term.getTrongTai()));
			ettPhuongTien.setLoaiTuyen(term.getMaTuyen());
			ettPhuongTien.setSoPhuHieuDuocCap(term.getSoPhuHieuDuocCap());
			ettPhuongTien.setCoGiaTriDen(term.getCoGiaTriDen());
			ettPhuongTien.setLoaiPhuHieuXinCap(term.getLoaiPhuHieuXinCap());
			ettPhuongTien = QLVTXuLyPhuHieuPhuongTienLocalServiceUtil.updateQLVTXuLyPhuHieuPhuongTien(ettPhuongTien);
			FormUtil.customResponse(actionRequest,actionResponse, FormUtil.bodyTextPhuHieu(ettPhuongTien.getCapPhuHieuID()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
		//private
	private static void phuHieu_ThongTinHoSo(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, SystemException {
		_log.info("*************************term.getId()"+term.getId());
		_log.info("*************************term.getThongHoSoId()"+term.getThongHoSoId());
		_log.info("*************************term.getThongTinXuLyId()"+term.getThongTinXuLyId());
		QlvtThongTinHoSo thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.fetchQlvtThongTinHoSo(term.getThongHoSoId());
		QLVTXuLyPhuHieu qlvtXuLyPhuHieu = QLVTXuLyPhuHieuLocalServiceUtil.fetchQLVTXuLyPhuHieu(term.getId());
		// TODO
		thongTinHoSo.setSoDkkd(term.getGiayPhepKinhDoanhVanTai());
		thongTinHoSo.setNgayCapDkkd(term.getNgayCapGiayPhepKinhDoanhVanTai());
		thongTinHoSo.setCoQuanCapDkkd(term.getNoiCapGiayPhepKinhDoanhVanTai());
		thongTinHoSo.setNgayHetHanDkkd(term.getNgayGiaHanGiayPhepKinhDoanhVanTai());
		//thong tin bien hieu 
		qlvtXuLyPhuHieu.setSovbChapNhanTuyen(term.getSovbChapNhanTuyen());
		qlvtXuLyPhuHieu.setNgayCapVBChapNhanTuyen(term.getNgayCapVBChapNhanTuyen());;
		qlvtXuLyPhuHieu.setSoLuong(Integer.valueOf("0"+term.getSoLuongXeXinCap()));
		thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.updateQlvtThongTinHoSo(thongTinHoSo);
		qlvtXuLyPhuHieu = QLVTXuLyPhuHieuLocalServiceUtil.updateQLVTXuLyPhuHieu(qlvtXuLyPhuHieu);
	}
	private static void phuHieu_ThongTinHoSo_TraKetQua(ActionRequest actionRequest, ActionResponse httpReq) throws IOException, SystemException {
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