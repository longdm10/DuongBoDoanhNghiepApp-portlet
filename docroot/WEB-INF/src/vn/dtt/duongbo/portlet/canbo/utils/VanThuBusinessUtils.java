/**
 * 
 */

package vn.dtt.duongbo.portlet.canbo.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;

import vn.dtt.duongbo.business.Constants;
import vn.dtt.duongbo.business.MotCuaBusiness;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieu;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTien;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTienTuyen;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyBienHieuLocalServiceUtil;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyBienHieuPhuongTienLocalServiceUtil;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyPhuHieuLocalServiceUtil;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyPhuHieuPhuongTienLocalServiceUtil;
import vn.dtt.duongbo.dao.common.model.TthcBieuMauHoSo;
import vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo;
import vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo;
import vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau;
import vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinh;
import vn.dtt.duongbo.dao.common.service.TthcBieuMauHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcNoidungHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoBieuMauLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil;
import vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep;
import vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepLocalServiceUtil;
import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVan;
import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanLoaiHinhVanTai;
import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTien;
import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi;
import vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanLocalServiceUtil;
import vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanPhuongTienLocalServiceUtil;
import vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.model.MotCuaPhanCongXuLy;
import vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy;
import vn.dtt.duongbo.dao.motcua.model.MotCuaTrangThaiHoSo;
import vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit;
import vn.dtt.duongbo.dao.motcua.model.impl.MotCuaPhanCongXuLyImpl;
import vn.dtt.duongbo.dao.motcua.service.MotCuaPhanCongXuLyLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaPhieuXuLyLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaTrangThaiHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.OEPUserMgtWorkingUnitLocalServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy;
import vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinXuLyImpl;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinXuLyLocalServiceUtil;
import vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOto;
import vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai;
import vn.dtt.duongbo.dao.noidia.service.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalServiceUtil;
import vn.dtt.duongbo.dao.noidia.service.QlvtXuLyGpkdvtBangOtoLocalServiceUtil;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTe;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTe;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXe;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeDiemDungNghi;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien;
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiLocalServiceUtil;
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyGpkdvtQuocTeLocalServiceUtil;
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyKTTQuocTeLocalServiceUtil;
import vn.dtt.duongbo.dao.quocte.service.QlvtXuLyKTTQuocTePhuongTienLocalServiceUtil;
import vn.dtt.duongbo.maudon.model.DKKTVTTuyenCoDinhBangOtoVietLao;
import vn.dtt.duongbo.maudon.model.DeNghiCapBienHieuXeOtoVanChuyenKhachDuLich;
import vn.dtt.duongbo.maudon.model.DeNghiCapGPVTVietTrungChoXeCongVu;
import vn.dtt.duongbo.maudon.model.DeNghiCapGiayPhepKDVTBangXeOto;
import vn.dtt.duongbo.maudon.model.DeNghiCapGiayPhepVanTaiDuongBoVietLao;
import vn.dtt.duongbo.maudon.model.DeNghiCapGiayPhepVanTaiDuongBoVietTrung;
import vn.dtt.duongbo.maudon.model.DeNghiCapLaiGPVTVietTrungDoHongMat;
import vn.dtt.duongbo.maudon.model.DeNghiGiaHanGiayPhepLienVanVietCam;
import vn.dtt.duongbo.maudon.model.DeNghiGiaHanGiayPhepLienVanVietLao;
import vn.dtt.duongbo.maudon.model.DeNghiGiaHanGiayPhepVanTaiChoPTTrungQuoc;
import vn.dtt.duongbo.maudon.model.DeNghiGioiThieuXinCapGPVTLoaiDVietNam;
import vn.dtt.duongbo.maudon.model.DonXinCapGPLVTMVietCam;
import vn.dtt.duongbo.maudon.model.DonXinCapGPLVTMVietLao;
import vn.dtt.duongbo.maudon.model.DonXinCapGPLienVanVietCam;
import vn.dtt.duongbo.maudon.model.DonXinCapGPLienVanVietLao;
import vn.dtt.duongbo.maudon.model.DonXinCapGPVTLoaiDCuaPTTrungQuoc;
import vn.dtt.duongbo.maudon.model.GiayDangKyKhaiThacTuyenVietTrung;
import vn.dtt.duongbo.maudon.model.GiayDeNghiCapPhuHieuBienHieu;
import vn.dtt.duongbo.maudon.model.NgungKhaiThacTuyenVTHKCDBangOtoVietLao;
import vn.dtt.duongbo.maudon.model.TBaoDieuChinhTanSuatXeChayTuyenCDVietLao;
import vn.dtt.duongbo.maudon.xml.MauDonFactory;
import vn.dtt.duongbo.utils.CollectionUtils;
import vn.dtt.duongbo.utils.CommonUtils;
import vn.dtt.duongbo.utils.DoanhNghiepUtils;
import vn.dtt.duongbo.utils.config.DuongBoConfigurationManager;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageBusUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.util.PortalUtil;


/**
 * @author binhnt
 * 
 */
public class VanThuBusinessUtils {
	
	private Log log = LogFactoryUtil.getLog(VanThuBusinessUtils.class);
	MotCuaBusiness motCuaBusiness = new MotCuaBusiness();
	
	public void xacNhanKetQua(ActionRequest actionRequest, ActionResponse httpReq) {
		try {
			
			log.info("================vao`canBoDuyetThamXet=====");
			long hoSoThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_HO_SO_THU_TUC);
			long quyTrinhThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_QUY_TRINH_THU_TUC);
			long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
			long userId = PortalUtil.getUserId(actionRequest);
			
			MotCuaPhieuXuLy phieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLy(phieuXuLyId);
			
			long dichChuyenTrangThaiPhieuSuLy = motCuaBusiness.dichChuyenTrangThaiPhieuXuLy(phieuXuLy, DuongBoConfigurationManager.getStrProp("dieukiendichchuyen.mot.cua.xac.nhan", "Xac.nhan"), userId, quyTrinhThuTucId, null);
			log.info("---------------dichChuyenTrangThaiPhieuXuLy==" + dichChuyenTrangThaiPhieuSuLy);
			
			httpReq.setRenderParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
			httpReq.setRenderParameter(Constants.ID_QUY_TRINH_THU_TUC, String.valueOf(quyTrinhThuTucId));
			httpReq.setRenderParameter(Constants.ID_PHIEU_XU_LY, String.valueOf(phieuXuLyId));
			
			PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// Má»™t cá»­a xĂ¡c nháº­n káº¿t quáº£ cho GPVT Viá»‡t Trung
	
	public void motcuaXacNhanKetQuaGPVTVietTrung(ActionRequest actionRequest, ActionResponse httpReq) {
		try {
			
			log.info("================vao`motcuaXacNhanKetQuaGPVTVietTrung=====");
			long hoSoThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_HO_SO_THU_TUC);
			long quyTrinhThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_QUY_TRINH_THU_TUC);
			long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
			long userId = PortalUtil.getUserId(actionRequest);
			
			MotCuaPhieuXuLy phieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLy(phieuXuLyId);
			
			long dichChuyenTrangThaiPhieuSuLy = motCuaBusiness.dichChuyenTrangThaiPhieuXuLy(phieuXuLy, DuongBoConfigurationManager.getStrProp("dkdc.viettrung.xac.nhan", "Xac.nhan"), userId, quyTrinhThuTucId, null);
			log.info("---------------dichChuyenTrangThaiPhieuXuLy==" + dichChuyenTrangThaiPhieuSuLy);
			
			httpReq.setRenderParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
			httpReq.setRenderParameter(Constants.ID_QUY_TRINH_THU_TUC, String.valueOf(quyTrinhThuTucId));
			httpReq.setRenderParameter(Constants.ID_PHIEU_XU_LY, String.valueOf(phieuXuLyId));
			
			PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void vanThuTraKetQua(ActionRequest actionRequest, ActionResponse httpReq) {
		try {
			
			log.info("================vao`vanThuTraKetQua ++++");
			String maPhanNhom = ParamUtil.getString(actionRequest, Constants.MA_PHAN_NHOM_HO_SO);
			long quyTrinhThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_QUY_TRINH_THU_TUC);
			long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
			long userId = PortalUtil.getUserId(actionRequest);
			
			String diuKienDichChuyen = "";
			if (maPhanNhom.trim().equalsIgnoreCase("HSYCBS")) {
				diuKienDichChuyen = DuongBoConfigurationManager.getStrProp("dieukiendichchuyen.van.thu.tra.ket.qua.bo.sung", "Tra.ket.qua.bo.sung");
			} else if (maPhanNhom.trim().equalsIgnoreCase("HSTCCP")) {
				diuKienDichChuyen = DuongBoConfigurationManager.getStrProp("dieukiendichchuyen.van.thu.tra.ket.qua.tu.choi", "Tra.ket.qua.tu.choi");
			}
			
			MotCuaPhieuXuLy phieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLy(phieuXuLyId);
			
			long dichChuyenTrangThaiPhieuSuLy = motCuaBusiness.dichChuyenTrangThaiPhieuXuLy(phieuXuLy, diuKienDichChuyen, userId, quyTrinhThuTucId, null);
			log.info("---------------dichChuyenTrangThaiPhieuXuLy==" + dichChuyenTrangThaiPhieuSuLy);
			
			httpReq.setRenderParameter(Constants.ID_QUY_TRINH_THU_TUC, String.valueOf(quyTrinhThuTucId));
			httpReq.setRenderParameter(Constants.ID_PHIEU_XU_LY, String.valueOf(phieuXuLyId));
			
			PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//Tráº£ káº¿t quáº£ GPVT Viá»‡t Trung
	
	public void vanThuTraKetQuaGPVTVietTrung(ActionRequest actionRequest, ActionResponse httpReq) {
		try {
			
			log.info("================vao`vanThuTraKetQua ++++");
			String maPhanNhom = ParamUtil.getString(actionRequest, Constants.MA_PHAN_NHOM_HO_SO);
			long quyTrinhThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_QUY_TRINH_THU_TUC);
			long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
			long userId = PortalUtil.getUserId(actionRequest);
			
			
			log.info("================vao---vanThuTraKetQua ++++ maPhanNhom :" +maPhanNhom);
			
			String diuKienDichChuyen = "";
			if (maPhanNhom.trim().equalsIgnoreCase("HSYCBS")) {
				log.info("-------------maPhanNhom.trim()1" +maPhanNhom.trim());
				diuKienDichChuyen = DuongBoConfigurationManager.getStrProp("dkdc.viettrung.Tra.ket.qua.bo.sung", "Tra.ket.qua.bo.sung");
				
			} else if (maPhanNhom.trim().equalsIgnoreCase("HSTCCP")) {
				log.info("-------------maPhanNhom.trim()2" +maPhanNhom.trim());
				diuKienDichChuyen = DuongBoConfigurationManager.getStrProp("dkdc.viettrung.Tra.ket.qua.tu.choi", "Tra.ket.qua.tu.choi");
			}
			
			MotCuaPhieuXuLy phieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLy(phieuXuLyId);
			
			long dichChuyenTrangThaiPhieuSuLy = motCuaBusiness.dichChuyenTrangThaiPhieuXuLy(phieuXuLy, diuKienDichChuyen, userId, quyTrinhThuTucId, null);
			log.info("---------------dichChuyenTrangThaiPhieuXuLy==" + dichChuyenTrangThaiPhieuSuLy);
			
			httpReq.setRenderParameter(Constants.ID_QUY_TRINH_THU_TUC, String.valueOf(quyTrinhThuTucId));
			httpReq.setRenderParameter(Constants.ID_PHIEU_XU_LY, String.valueOf(phieuXuLyId));
			
			PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//---------------VIET LAO------------------
	public void vanThuTraKetQuaBoSungVietLao(ActionRequest actionRequest, ActionResponse httpReq) {
		try {
			
			log.info("=======VietLao=========vao`vanThuTraKetQuaBoSungVietLao=====");
			long hoSoThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_HO_SO_THU_TUC);
			long quyTrinhThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_QUY_TRINH_THU_TUC);
			long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
			long userId = PortalUtil.getUserId(actionRequest);
			
	
			MotCuaPhieuXuLy phieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLy(phieuXuLyId);
			
			long dichChuyenTrangThaiPhieuSuLy = motCuaBusiness.dichChuyenTrangThaiPhieuXuLy(phieuXuLy, DuongBoConfigurationManager.getStrProp("dkdc.vietlao.tra.ket.qua.bo.sung", "Tra.ket.qua.bo.sung"), userId, quyTrinhThuTucId, null);
			log.info("---------------dichChuyenTrangThaiPhieuXuLy==" + dichChuyenTrangThaiPhieuSuLy);
			
			httpReq.setRenderParameter(Constants.ID_HO_SO_THU_TUC,String.valueOf(hoSoThuTucId));
			httpReq.setRenderParameter(Constants.ID_QUY_TRINH_THU_TUC,String.valueOf(quyTrinhThuTucId));
			httpReq.setRenderParameter(Constants.ID_PHIEU_XU_LY,String.valueOf(phieuXuLyId));
			
			PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void vanThuTiepNhanHoSo(ActionRequest actionRequest, ActionResponse httpReq) {
		try {
			
			log.info("================vao`vanThuTiepNhanHoSo=====");
			//long workingUnitId = ParamUtil.getLong(actionRequest, "workingUnitId");
			long canBoXuLyId = ParamUtil.getLong(actionRequest, "canBoXuLyId");
			long hoSoThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_HO_SO_THU_TUC);
			long quyTrinhThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_QUY_TRINH_THU_TUC);
			long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
			long idThuTucHanhChinh = ParamUtil.getLong(actionRequest, Constants.ID_THU_TUC_HANH_CHINH);
			String maThuTucHanhChinh = ParamUtil.getString(actionRequest, Constants.MA_THU_TUC_HANH_CHINH);
			long workingUnitId = ParamUtil.getLong(actionRequest, "workingUnitId");
			long toChucQuanLy = 0;
			long userId = PortalUtil.getUserId(actionRequest);
			
			log.info("=======canBoXuLyId========" + canBoXuLyId);
			log.info("=======hoSoThuTucId=======" + hoSoThuTucId);
			log.info("=======quyTrinhThuTucId===" + quyTrinhThuTucId);
			log.info("=======phieuXuLyId========" + phieuXuLyId);
			log.info("=======idThuTucHanhChinh==" + idThuTucHanhChinh);
			log.info("=======maThuTucHanhChinh==" + maThuTucHanhChinh);
			
			if (CommonUtils.checkFromDate(actionRequest)) { return; }
			
			MotCuaPhieuXuLy phieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLy(phieuXuLyId);
			phieuXuLy.setNguoiXuLy(userId);
//			phieuXuLy.setToChucQuanLy(toChucQuanLy);
			phieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.updateMotCuaPhieuXuLy(phieuXuLy);
			
			
			TthcThuTucHanhChinh tthcThuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(idThuTucHanhChinh);
			
			log.info("=======tthcThuTucHanhChinh= ====" + tthcThuTucHanhChinh);
			
//			
			long phanCongXuLy = motCuaBusiness.phanCongXuLy(phieuXuLyId, phieuXuLy.getTrangThaiHienTaiId(), userId, canBoXuLyId, 0);
			log.info("=======motcua_phancongxuly= ====" + phanCongXuLy);
			
			QlvtThongTinHoSo thongTinHoSoCHK = QlvtThongTinHoSoLocalServiceUtil.fetchByphieuXuLyId(phieuXuLy.getId());
			log.info(".."+thongTinHoSoCHK+"--phieuXuLy.getId()" + phieuXuLy.getId());
			if(Validator.isNotNull(thongTinHoSoCHK)){
				QlvtThongTinXuLy qlvtTTinXuLy = QlvtThongTinXuLyLocalServiceUtil.fetchBythongTinHoSoId(thongTinHoSoCHK.getId());
				QlvtThongTinXuLyLocalServiceUtil.deleteQlvtThongTinXuLy(qlvtTTinXuLy);
				QlvtThongTinHoSoLocalServiceUtil.deleteQlvtThongTinHoSo(thongTinHoSoCHK);
				MotCuaPhanCongXuLyLocalServiceUtil.deleteMotCuaPhanCongXuLy(phanCongXuLy);
			}
			
//			if(Validator.isNull(thongTinHoSoCHK)){
	//			
				QlvtThongTinHoSo thongTinHoSo=null;
				thongTinHoSo = addThongTinHoSo(phieuXuLy, tthcThuTucHanhChinh, hoSoThuTucId);
				log.info("--vanThuTiepNhanHoSo--QlvtThongTinHoSo--" + thongTinHoSo);
	//			
				QlvtThongTinXuLy addThongTinXuLy=null;
				addThongTinXuLy = addThongTinXuLy(phieuXuLy, tthcThuTucHanhChinh, thongTinHoSo, userId, hoSoThuTucId, phieuXuLy.getToChucQuanLy());
				log.info("--vanThuTiepNhanHoSo--QlvtThongTinXuLy--" + addThongTinXuLy);
	//			
				
				
				
				//update tochucxuly
				OEPUserMgtWorkingUnit orgOEP = OEPUserMgtWorkingUnitLocalServiceUtil.fetchOEPUserMgtWorkingUnit(workingUnitId);
				toChucQuanLy = Long.valueOf("0"+orgOEP.getOrganizationId());
				OEPUserMgtWorkingUnit orgOEPParen = null;
				if(Validator.isNotNull(orgOEP)){
					if(orgOEP.getIsRoot() != 1){
						log.info("=======workingUnitId========" + workingUnitId);
						log.info("=======orgOEP========" + orgOEP);
						log.info("=======phieuXuLyId========" + phieuXuLyId);
						orgOEPParen = OEPUserMgtWorkingUnitLocalServiceUtil.fetchOEPUserMgtWorkingUnit(orgOEP.getParentWorkingUnitId());
						MotCuaPhanCongXuLy ettPhanCong = MotCuaPhanCongXuLyLocalServiceUtil.fetchByF_UNI_PhieuXuLyId(phieuXuLyId);
						if(Validator.isNull(ettPhanCong)){
							MotCuaPhanCongXuLy motCuaPhanCongXuLy = null;
							long ids = CounterLocalServiceUtil.increment(MotCuaPhanCongXuLy.class.getName());
							motCuaPhanCongXuLy = MotCuaPhanCongXuLyLocalServiceUtil.createMotCuaPhanCongXuLy(ids);
							motCuaPhanCongXuLy.setNgayPhanCong(new Date());
							motCuaPhanCongXuLy.setNguoiPhanCong(canBoXuLyId);
							motCuaPhanCongXuLy.setNguoiXuLy(userId);
							motCuaPhanCongXuLy.setPhieuXuLyId(phieuXuLyId);
							motCuaPhanCongXuLy.setTrangThaiHoSoId(phieuXuLy.getTrangThaiHienTaiId());
							motCuaPhanCongXuLy.setNhomXuLy(0);
							motCuaPhanCongXuLy.setToChucXuLy(Long.valueOf("0"+orgOEP.getOrganizationId()));
							motCuaPhanCongXuLy.setToChucXetDuyet(Long.valueOf("0"+orgOEPParen.getOrganizationId()));
							ettPhanCong = MotCuaPhanCongXuLyLocalServiceUtil.updateMotCuaPhanCongXuLy(motCuaPhanCongXuLy);
						}
						ettPhanCong.setToChucXuLy(Long.valueOf("0"+orgOEP.getOrganizationId()));
						ettPhanCong.setToChucXetDuyet(Long.valueOf("0"+orgOEPParen.getOrganizationId()));
						MotCuaPhanCongXuLyLocalServiceUtil.updateMotCuaPhanCongXuLy(ettPhanCong);
					}
					phieuXuLy.setToChucQuanLy(toChucQuanLy);
					MotCuaPhieuXuLyLocalServiceUtil.updateMotCuaPhieuXuLy(phieuXuLy);

					TthcHoSoThuTuc updateMaBienNhanHoSoThuTuc = updateMaBienNhanHoSoThuTuc(hoSoThuTucId,toChucQuanLy);
					log.info("--vanThuTiepNhanHoSo--TthcHoSoThuTuc--" + updateMaBienNhanHoSoThuTuc);
				}
				//TODO
				//convert xml don online to object
				//nghiep vu tiep nhan process
				//processTiepNhanVanThu(idThuTucHanhChinh,hoSoThuTucId,thongTinHoSo,addThongTinXuLy);
				
				long dichChuyenTrangThaiPhieuSuLy = motCuaBusiness.dichChuyenTrangThaiPhieuXuLy(phieuXuLy, DuongBoConfigurationManager.getStrProp("dieukiendichchuyen.mot.cua.tiep.nhan.ho.so", "Tiep.nhan"), userId, quyTrinhThuTucId, null);
				log.info("--vanThuTiepNhanHoSo--dichChuyenTrangThaiPhieuXuLy==" + dichChuyenTrangThaiPhieuSuLy);
				
				if(dichChuyenTrangThaiPhieuSuLy>0){
					//send HS to doanh nghiep
					ServiceContext context;
					context = ServiceContextFactory.getInstance(actionRequest);
					Message message = new Message();
					message.put("idThuTucHanhChinh", idThuTucHanhChinh);
					message.put("phieuXuLyId", phieuXuLyId);
					message.put("hoSoThuTucId", hoSoThuTucId);
					message.put("thongTinHoSo", thongTinHoSo);
					message.put("addThongTinXuLy", addThongTinXuLy);
					MessageBusUtil.sendMessage("destination/thread/trahoso/VanThuThread",message);
				}
				
	//			if(dichChuyenTrangThaiPhieuSuLy == 0){
	//				QlvtThongTinXuLyLocalServiceUtil.deleteQlvtThongTinXuLy(addThongTinXuLy.getId());
	//				QlvtThongTinHoSoLocalServiceUtil.deleteQlvtThongTinHoSo(thongTinHoSo.getId());
	//				MotCuaPhanCongXuLyLocalServiceUtil.deleteMotCuaPhanCongXuLy(phanCongXuLy);
	//			}
//			}
			httpReq.setRenderParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
			httpReq.setRenderParameter(Constants.ID_QUY_TRINH_THU_TUC, String.valueOf(quyTrinhThuTucId));
			httpReq.setRenderParameter(Constants.ID_PHIEU_XU_LY, String.valueOf(phieuXuLyId));
			httpReq.setRenderParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(idThuTucHanhChinh));
			httpReq.setRenderParameter(Constants.MA_THU_TUC_HANH_CHINH, String.valueOf(maThuTucHanhChinh));
			
			
			PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e);
		}
	}
	private void processTiepNhanVanThu(long idThuTucHanhChinh, long hoSoThuTucId,QlvtThongTinHoSo thongTinHoSo,QlvtThongTinXuLy addThongTinXuLy) throws SystemException, ClassNotFoundException {
		// TODO Auto-generated method stub
		TthcThanhPhanHoSo ettThanhPhanMauDon = TthcThanhPhanHoSoLocalServiceUtil.findByThuTucHanhChinhIdMauDonOnline(idThuTucHanhChinh);
		List<TthcThanhPhanHoSoBieuMau> listTTHSBM = TthcThanhPhanHoSoBieuMauLocalServiceUtil.findByThanhPhanHoSoId(ettThanhPhanMauDon.getId());
		TthcThanhPhanHoSoBieuMau ettThanhPhanHoSoBieuMau = null;
		TthcBieuMauHoSo ettBMHS = null;
		if(listTTHSBM.size()>0){
			ettThanhPhanHoSoBieuMau = listTTHSBM.get(0);
			ettBMHS = TthcBieuMauHoSoLocalServiceUtil.fetchTthcBieuMauHoSo(ettThanhPhanHoSoBieuMau.getBieuMauHoSoId());
		}
		log.info(idThuTucHanhChinh + "-- ettThanhPhanMauDon.getId()--");
//		List<TthcNoidungHoSo> listNoiDungHS = TthcNoidungHoSoLocalServiceUtil.findByHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId, ettThanhPhanMauDon.getId());
		log.info(hoSoThuTucId + "-- hoSoThuTucId--");
		log.info(ettThanhPhanMauDon.getId() + "-- ettThanhPhanMauDon.getId() --");
		TthcNoidungHoSo ettNoiDungHS = TthcNoidungHoSoLocalServiceUtil.fetchByHoSoThuTucDonOnline(hoSoThuTucId, ettThanhPhanMauDon.getId());
//		if(listNoiDungHS.size() > 0){
//			ettNoiDungHS = TthcNoidungHoSoLocalServiceUtil.findByHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId, ettThanhPhanMauDon.getId()).get(0);
//		}
		List<Object> allMauDon = MauDonFactory.converXMLMessagesContentToObject(ettNoiDungHS.getNoiDungXml());
		Object obj = allMauDon.size()>0?allMauDon.get(0):null;
		if(idThuTucHanhChinh == 1){
			vanThuProcessNghiepVuQuyTrinh1(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 2){
			vanThuProcessNghiepVuQuyTrinh1(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 3){
			vanThuProcessNghiepVuQuyTrinh3(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 4){
			vanThuProcessNghiepVuQuyTrinh3(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 5){
			vanThuProcessNghiepVuQuyTrinh3(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 6){
			vanThuProcessNghiepVuQuyTrinh3(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 7){
			vanThuProcessNghiepVuQuyTrinh3(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 8){
			vanThuProcessNghiepVuQuyTrinh8(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 9){
			vanThuProcessNghiepVuQuyTrinh8(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 10){
			vanThuProcessNghiepVuQuyTrinh8(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 11){
			vanThuProcessNghiepVuQuyTrinh9(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 12){
			vanThuProcessNghiepVuQuyTrinh9(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 13){
			vanThuProcessNghiepVuQuyTrinh2(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 14){
			vanThuProcessNghiepVuQuyTrinh2(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 15){
			vanThuProcessNghiepVuQuyTrinh4(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 16){
			vanThuProcessNghiepVuQuyTrinh4(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 17){
			vanThuProcessNghiepVuQuyTrinh4(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 18){
			vanThuProcessNghiepVuQuyTrinh4(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 19){
			vanThuProcessNghiepVuQuyTrinh4(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 20){
			vanThuProcessNghiepVuQuyTrinh8(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 21){
			vanThuProcessNghiepVuQuyTrinh8(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 22){
			vanThuProcessNghiepVuQuyTrinh8(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 23){
			vanThuProcessNghiepVuQuyTrinh9(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 24){
			vanThuProcessNghiepVuQuyTrinh9(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 25){
			vanThuProcessNghiepVuQuyTrinh5(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 26){
			vanThuProcessNghiepVuQuyTrinh5(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 27){
			vanThuProcessNghiepVuQuyTrinh5(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 28){
			vanThuProcessNghiepVuQuyTrinh5(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 29){
			vanThuProcessNghiepVuQuyTrinh5(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 30){
			vanThuProcessNghiepVuQuyTrinh5(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 31){
			vanThuProcessNghiepVuQuyTrinh5(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 32){
			vanThuProcessNghiepVuQuyTrinh5(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 33){
			vanThuProcessNghiepVuQuyTrinh5(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 34){
			vanThuProcessNghiepVuQuyTrinh1(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 35){
			vanThuProcessNghiepVuQuyTrinh1(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 36){
			vanThuProcessNghiepVuQuyTrinh3(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 37){
			vanThuProcessNghiepVuQuyTrinh3(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 38){
			vanThuProcessNghiepVuQuyTrinh3(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 39){
			vanThuProcessNghiepVuQuyTrinh3(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 40){
			vanThuProcessNghiepVuQuyTrinh2(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 41){
			vanThuProcessNghiepVuQuyTrinh2(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 42){
			vanThuProcessNghiepVuQuyTrinh4(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 43){
			vanThuProcessNghiepVuQuyTrinh4(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 44){
			vanThuProcessNghiepVuQuyTrinh4(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 45){
			vanThuProcessNghiepVuQuyTrinh4(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 46){
			vanThuProcessNghiepVuQuyTrinh5(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 47){
			vanThuProcessNghiepVuQuyTrinh5(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 51){
			vanThuProcessNghiepVuQuyTrinh7(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 52){
			vanThuProcessNghiepVuQuyTrinh7(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 53){
			vanThuProcessNghiepVuQuyTrinh7(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 54){
			vanThuProcessNghiepVuQuyTrinh7(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 55){
			vanThuProcessNghiepVuQuyTrinh6(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 56){
			vanThuProcessNghiepVuQuyTrinh6(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 57){
			vanThuProcessNghiepVuQuyTrinh6(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 58){
			vanThuProcessNghiepVuQuyTrinh6(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}else if(idThuTucHanhChinh == 59){
			vanThuProcessNghiepVuQuyTrinh6(obj,idThuTucHanhChinh, hoSoThuTucId, thongTinHoSo, addThongTinXuLy);
		}
		
	}
	
	public void vanThuProcessNghiepVuQuyTrinh1(Object obj,long idThuTucHanhChinh, long hoSoThuTucId,QlvtThongTinHoSo thongTinHoSo,QlvtThongTinXuLy addThongTinXuLy) {
		log.info("----- Cáº¥p giáº¥y phĂ©p váº­n táº£i Ä‘Æ°á»�ng bá»™ quá»‘c táº¿ Viá»‡t Nam - LĂ o -----");
		DeNghiCapGiayPhepVanTaiDuongBoVietLao objCast = (DeNghiCapGiayPhepVanTaiDuongBoVietLao)obj;
		List<String> listLoaiHinh = objCast.getLoaiHinhHoatDongs();
		QlvtXuLyGpkdvtQuocTe ettQuocTe = null;
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai ettLoaiHinhVanTai = null;
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen ettLoaiHinhVanTaiTuyen = null;
		int id = -1;
		try {
			id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpkdvtQuocTe.class.getName());
			ettQuocTe = QlvtXuLyGpkdvtQuocTeLocalServiceUtil.createQlvtXuLyGpkdvtQuocTe(id);
			ettQuocTe.setThongTinXuLyId(Integer.valueOf(addThongTinXuLy.getId()+""));
			ettQuocTe.setLoaiCapPhep(objCast.getLoaiHinhDeNghiCap());
			ettQuocTe.setNgayCapGiayPhepVanTai(Validator.isNotNull(objCast.getNgayCapGiayPhepKinhDoanh())?sdf.parse(objCast.getNgayCapGiayPhepKinhDoanh()):null);
			ettQuocTe.setCoQuanCapGiayPhepVanTaiId(objCast.getCoQuanCapGiayPhepKinhDoanh());
			ettQuocTe = QlvtXuLyGpkdvtQuocTeLocalServiceUtil.updateQlvtXuLyGpkdvtQuocTe(ettQuocTe);
			if(Validator.isNotNull(ettQuocTe) && listLoaiHinh.size() > 0){
				for (String loaiHinh : listLoaiHinh) {
					id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.class.getName());
					ettLoaiHinhVanTai = QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiLocalServiceUtil.createQlvtXuLyGpkdvtQuocTeLoaiHinhVanTai(id);
					ettLoaiHinhVanTai.setThongTinCapGpkdVanTaiId((int)ettQuocTe.getId());
					ettLoaiHinhVanTai.setMaLoaiHinhHoatDong(loaiHinh);
					QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiLocalServiceUtil.updateQlvtXuLyGpkdvtQuocTeLoaiHinhVanTai(ettLoaiHinhVanTai);
				}
			}
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void vanThuProcessNghiepVuQuyTrinh2(Object obj,long idThuTucHanhChinh, long hoSoThuTucId,QlvtThongTinHoSo thongTinHoSo,QlvtThongTinXuLy addThongTinXuLy) {
		log.info("----- Cáº¥p giáº¥y phĂ©p váº­n táº£i Ä‘Æ°á»�ng bá»™ quá»‘c táº¿ Viá»‡t Nam - Campuchia -----");
		DeNghiCapGiayPhepVanTaiDuongBoVietLao objCast = (DeNghiCapGiayPhepVanTaiDuongBoVietLao)obj;
		List<String> listLoaiHinh = objCast.getLoaiHinhHoatDongs();
		QlvtXuLyGpkdvtQuocTe ettQuocTe = null;
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai ettLoaiHinhVanTai = null;
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen ettLoaiHinhVanTaiTuyen = null;
		int id = -1;
		try {
			id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpkdvtQuocTe.class.getName());
			ettQuocTe = QlvtXuLyGpkdvtQuocTeLocalServiceUtil.createQlvtXuLyGpkdvtQuocTe(id);
			ettQuocTe.setThongTinXuLyId(Integer.valueOf(addThongTinXuLy.getId()+""));
			ettQuocTe.setLoaiCapPhep(objCast.getLoaiHinhDeNghiCap());
			ettQuocTe.setNgayCapGiayPhepVanTai(Validator.isNotNull(objCast.getNgayCapGiayPhepKinhDoanh())?sdf.parse(objCast.getNgayCapGiayPhepKinhDoanh()):null);
			ettQuocTe.setCoQuanCapGiayPhepVanTaiId(objCast.getCoQuanCapGiayPhepKinhDoanh());
			ettQuocTe = QlvtXuLyGpkdvtQuocTeLocalServiceUtil.updateQlvtXuLyGpkdvtQuocTe(ettQuocTe);
			if(Validator.isNotNull(ettQuocTe) && listLoaiHinh.size() > 0){
				for (String loaiHinh : listLoaiHinh) {
					id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai.class.getName());
					ettLoaiHinhVanTai = QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiLocalServiceUtil.createQlvtXuLyGpkdvtQuocTeLoaiHinhVanTai(id);
					ettLoaiHinhVanTai.setThongTinCapGpkdVanTaiId((int)ettQuocTe.getId());
					ettLoaiHinhVanTai.setMaLoaiHinhHoatDong(loaiHinh);
					QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiLocalServiceUtil.updateQlvtXuLyGpkdvtQuocTeLoaiHinhVanTai(ettLoaiHinhVanTai);
				}
			}
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void vanThuProcessNghiepVuQuyTrinh3(Object obj,long idThuTucHanhChinh, long hoSoThuTucId,QlvtThongTinHoSo thongTinHoSo,QlvtThongTinXuLy addThongTinXuLy) {
		log.info("----- Cáº¥p giáº¥y phĂ©p liĂªn váº­n Viá»‡t Nam - LĂ o -----");
		
		QlvtXuLyGpLienVan qlvtXuLyGpLienVan = null;
		QlvtXuLyGpLienVanLoaiHinhVanTai qlvtXuLyGpLienVanLoaiHinhVanTai = null;
		QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien = null;
		QlvtXuLyGpLienVanPhuongTienTramDungNghi QlvtXuLyGpLienVanPhuongTienTramDungNghi = null;
		int id = -1;
		try {
			log.info("----- obj.getClass().getName() -----"+obj.getClass().getName());
			if(obj.getClass().getName().contains(".DonXinCapGPLVTMVietLao")){
				DonXinCapGPLVTMVietLao objCast = (DonXinCapGPLVTMVietLao)obj;
				List<DonXinCapGPLVTMVietLao.DanhSachXe> listPhuongTien = objCast.getDanhSachXe();
				id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVan.class.getName());
				qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.createQlvtXuLyGpLienVan(id);
				qlvtXuLyGpLienVan.setThongTinXuLyId(Integer.valueOf(addThongTinXuLy.getId()+""));
				//TODO
//				qlvtXuLyGpLienVan.setLoaiCapPhep(objCast.get);
				qlvtXuLyGpLienVan.setSoGpvt(objCast.getSoGPVanTai());
				qlvtXuLyGpLienVan.setNgayCapGpvt(Validator.isNotNull(objCast.getNgayCapGPVanTai())?sdf.parse(objCast.getNgayCapGPVanTai()):null);
				qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.updateQlvtXuLyGpLienVan(qlvtXuLyGpLienVan);
				if(Validator.isNotNull(qlvtXuLyGpLienVan) && listPhuongTien.size() > 0){
					for (DonXinCapGPLVTMVietLao.DanhSachXe danhSachXe : listPhuongTien) {
						id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVanPhuongTien.class.getName());
						qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.createQlvtXuLyGpLienVanPhuongTien(id);
						qlvtXuLyGpLienVanPhuongTien.setCapGplvId(Integer.valueOf("0"+qlvtXuLyGpLienVan.getId()));
						qlvtXuLyGpLienVanPhuongTien.setBienSo(danhSachXe.getBienSoXe());
						qlvtXuLyGpLienVanPhuongTien.setHinhThucHoatDong(danhSachXe.getHinhThucHoatDong());
						qlvtXuLyGpLienVanPhuongTien.setNhanHieu(danhSachXe.getNhanHieu());
						//TODO danhSachXe.getThoiGianDeNghiCapPhep() danhSachXe.getTuyenHoatDong()
						qlvtXuLyGpLienVanPhuongTien.setTrongTai(Integer.valueOf("0"+danhSachXe.getTrongTai()));
						qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.updateQlvtXuLyGpLienVanPhuongTien(qlvtXuLyGpLienVanPhuongTien);
						
					}
				}
			} else if(obj.getClass().getName().contains(".DonXinCapGPLienVanVietLao")){
				DonXinCapGPLienVanVietLao objCast = (DonXinCapGPLienVanVietLao)obj;
				List<DonXinCapGPLienVanVietLao.DanhSachXe> listPhuongTien = objCast.getDanhSachXe();
				id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVan.class.getName());
				qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.createQlvtXuLyGpLienVan(id);
				qlvtXuLyGpLienVan.setThongTinXuLyId(Integer.valueOf(addThongTinXuLy.getId()+""));
				qlvtXuLyGpLienVan.setSoGpvt(objCast.getSoGPDKKD());
				qlvtXuLyGpLienVan.setNgayCapGpvt(Validator.isNotNull(objCast.getNgayCapGPDKKD())?sdf.parse(objCast.getNgayCapGPDKKD()):null);
				qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.updateQlvtXuLyGpLienVan(qlvtXuLyGpLienVan);
				if(Validator.isNotNull(qlvtXuLyGpLienVan) && listPhuongTien.size() > 0){
					for (DonXinCapGPLienVanVietLao.DanhSachXe danhSachXe : listPhuongTien) {
						id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVanPhuongTien.class.getName());
						qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.createQlvtXuLyGpLienVanPhuongTien(id);
						qlvtXuLyGpLienVanPhuongTien.setCapGplvId(Integer.valueOf("0"+qlvtXuLyGpLienVan.getId()));
						qlvtXuLyGpLienVanPhuongTien.setBienSo(danhSachXe.getBienSoXe());
						qlvtXuLyGpLienVanPhuongTien.setHinhThucHoatDong(danhSachXe.getHinhThucHoatDong());
						qlvtXuLyGpLienVanPhuongTien.setNhanHieu(danhSachXe.getNhanHieu());
						//TODO danhSachXe.getThoiGianDeNghiCapPhep() danhSachXe.getTuyenHoatDong()
						qlvtXuLyGpLienVanPhuongTien.setTrongTai(Integer.valueOf("0"+danhSachXe.getTrongTai()));
						qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.updateQlvtXuLyGpLienVanPhuongTien(qlvtXuLyGpLienVanPhuongTien);
						
					}
				
				}
			}else if(obj.getClass().getName().contains(".DeNghiGiaHanGiayPhepLienVanVietLao")){
				DeNghiGiaHanGiayPhepLienVanVietLao objCast = (DeNghiGiaHanGiayPhepLienVanVietLao)obj;
				id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVan.class.getName());
				qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.createQlvtXuLyGpLienVan(id);
				qlvtXuLyGpLienVan.setThongTinXuLyId(Integer.valueOf(addThongTinXuLy.getId()+""));
				qlvtXuLyGpLienVan.setSoGpvt(objCast.getSoGPLVVL());
				qlvtXuLyGpLienVan.setNgayCapGpvt(Validator.isNotNull(objCast.getNgayCapGiayPhep())?sdf.parse(objCast.getNgayCapGiayPhep()):null);
				qlvtXuLyGpLienVan.setCoQuanCapPhepLienVan(objCast.getCoQuanCapGiayPhep());
				qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.updateQlvtXuLyGpLienVan(qlvtXuLyGpLienVan);
				
				//UPDATE THONGTINHOSO
				thongTinHoSo.setCoQuanCapDkkd(objCast.getCoQuanCapGiayPhep());
				String govAID = objCast.getCoQuanGui();
				OEPUserMgtWorkingUnit ettEOP = OEPUserMgtWorkingUnitLocalServiceUtil.getByGovAgentId(govAID);
				thongTinHoSo.setCoQuanGiaiQuyet(Long.valueOf(ettEOP.getOrganizationId()));
				thongTinHoSo.setDienThoaiDn(objCast.getDienThoai());
				thongTinHoSo.setDiaChiDn(objCast.getDiaChi());
				thongTinHoSo.setNgayGiaHanGiayDangKyKinhDoanh(Validator.isNotNull(objCast.getNgayFromGiahanGplv())?sdf.parse(objCast.getNgayFromGiahanGplv()):null);
				thongTinHoSo.setLyDoCapLai(objCast.getLydoGiaHan());
				thongTinHoSo.setSoFaxDn(objCast.getFax());
				thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.updateQlvtThongTinHoSo(thongTinHoSo);
				
			}
		} catch (Exception e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void vanThuProcessNghiepVuQuyTrinh4(Object obj,long idThuTucHanhChinh, long hoSoThuTucId,QlvtThongTinHoSo thongTinHoSo,QlvtThongTinXuLy addThongTinXuLy) {
		log.info("----- Cáº¥p giáº¥y phĂ©p liĂªn váº­n Viá»‡t Nam - Campuchia -----");
		QlvtXuLyGpLienVan qlvtXuLyGpLienVan = null;
		QlvtXuLyGpLienVanLoaiHinhVanTai qlvtXuLyGpLienVanLoaiHinhVanTai = null;
		QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien = null;
		QlvtXuLyGpLienVanPhuongTienTramDungNghi QlvtXuLyGpLienVanPhuongTienTramDungNghi = null;
		int id = -1;
		try {
			log.info("----- obj.getClass().getName() -----"+obj.getClass().getName());
			if(obj.getClass().getName().contains(".DonXinCapGPLVTMVietCam")){
				log.info("----- Cáº¥p giáº¥y phĂ©p liĂªn váº­n Viá»‡t Nam - Campuchia 1-----");
				DonXinCapGPLVTMVietCam objCast = (DonXinCapGPLVTMVietCam)obj;
				List<DonXinCapGPLVTMVietCam.DanhSachXe> listPhuongTien = objCast.getDanhSachXe();
				id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVan.class.getName());
				qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.createQlvtXuLyGpLienVan(id);
				qlvtXuLyGpLienVan.setThongTinXuLyId(Integer.valueOf(addThongTinXuLy.getId()+""));
				//TODO
//				qlvtXuLyGpLienVan.setLoaiCapPhep(objCast.get);
				qlvtXuLyGpLienVan.setSoGpvt(objCast.getSoGPVanTai());
				qlvtXuLyGpLienVan.setNgayCapGpvt(Validator.isNotNull(objCast.getNgayCapGPVanTai())?sdf.parse(objCast.getNgayCapGPVanTai()):null);
				qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.updateQlvtXuLyGpLienVan(qlvtXuLyGpLienVan);
				if(Validator.isNotNull(qlvtXuLyGpLienVan) && listPhuongTien.size() > 0){
					for (DonXinCapGPLVTMVietCam.DanhSachXe danhSachXe : listPhuongTien) {
						id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVanPhuongTien.class.getName());
						qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.createQlvtXuLyGpLienVanPhuongTien(id);
						qlvtXuLyGpLienVanPhuongTien.setCapGplvId(Integer.valueOf("0"+qlvtXuLyGpLienVan.getId()));
						qlvtXuLyGpLienVanPhuongTien.setBienSo(danhSachXe.getBienSoXe());
						qlvtXuLyGpLienVanPhuongTien.setHinhThucHoatDong(danhSachXe.getHinhThucHoatDong());
						qlvtXuLyGpLienVanPhuongTien.setNhanHieu(danhSachXe.getNhanHieu());
						//TODO danhSachXe.getThoiGianDeNghiCapPhep() danhSachXe.getTuyenHoatDong()
						qlvtXuLyGpLienVanPhuongTien.setTrongTai(Integer.valueOf("0"+danhSachXe.getTrongTai()));
						qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.updateQlvtXuLyGpLienVanPhuongTien(qlvtXuLyGpLienVanPhuongTien);
					}
				}
			} else if(obj.getClass().getName().contains(".DonXinCapGPLienVanVietCam")){
				log.info("----- Cáº¥p giáº¥y phĂ©p liĂªn váº­n Viá»‡t Nam - Campuchia 2-----");
				DonXinCapGPLienVanVietCam objCast = (DonXinCapGPLienVanVietCam)obj;
				List<DonXinCapGPLienVanVietCam.DanhSachXe> listPhuongTien = objCast.getDanhSachXe();
				id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVan.class.getName());
				qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.createQlvtXuLyGpLienVan(id);
				qlvtXuLyGpLienVan.setThongTinXuLyId(Integer.valueOf(addThongTinXuLy.getId()+""));
				qlvtXuLyGpLienVan.setSoGpvt(objCast.getSoGPDKKD());
				qlvtXuLyGpLienVan.setNgayCapGpvt(Validator.isNotNull(objCast.getNgayCapGPDKKD())?sdf.parse(objCast.getNgayCapGPDKKD()):null);
				qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.updateQlvtXuLyGpLienVan(qlvtXuLyGpLienVan);
				if(Validator.isNotNull(qlvtXuLyGpLienVan) && listPhuongTien.size() > 0){
					for (DonXinCapGPLienVanVietCam.DanhSachXe danhSachXe : listPhuongTien) {
						id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVanPhuongTien.class.getName());
						qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.createQlvtXuLyGpLienVanPhuongTien(id);
						qlvtXuLyGpLienVanPhuongTien.setCapGplvId(Integer.valueOf("0"+qlvtXuLyGpLienVan.getId()));
						qlvtXuLyGpLienVanPhuongTien.setBienSo(danhSachXe.getBienSoXe());
						qlvtXuLyGpLienVanPhuongTien.setHinhThucHoatDong(danhSachXe.getHinhThucHoatDong());
						qlvtXuLyGpLienVanPhuongTien.setNhanHieu(danhSachXe.getNhanHieu());
						//TODO danhSachXe.getThoiGianDeNghiCapPhep() danhSachXe.getTuyenHoatDong()
						qlvtXuLyGpLienVanPhuongTien.setTrongTai(Integer.valueOf("0"+danhSachXe.getTrongTai()));
						qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.updateQlvtXuLyGpLienVanPhuongTien(qlvtXuLyGpLienVanPhuongTien);
					}
				
				}
			}else if(obj.getClass().getName().contains(".DeNghiGiaHanGiayPhepLienVanVietCam")){
				log.info("----- Cáº¥p giáº¥y phĂ©p liĂªn váº­n Viá»‡t Nam - Campuchia 3-----");
				DeNghiGiaHanGiayPhepLienVanVietCam objCast = (DeNghiGiaHanGiayPhepLienVanVietCam)obj;
				id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVan.class.getName());
				qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.createQlvtXuLyGpLienVan(id);
				qlvtXuLyGpLienVan.setThongTinXuLyId(Integer.valueOf(addThongTinXuLy.getId()+""));
				qlvtXuLyGpLienVan.setSoGpvt(objCast.getSoGPLVVL());
				qlvtXuLyGpLienVan.setNgayCapGpvt(Validator.isNotNull(objCast.getNgayCapGiayPhep())?sdf.parse(objCast.getNgayCapGiayPhep()):null);
				qlvtXuLyGpLienVan.setCoQuanCapPhepLienVan(objCast.getCoQuanCapGiayPhep());
				qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.updateQlvtXuLyGpLienVan(qlvtXuLyGpLienVan);
				
				//UPDATE THONGTINHOSO
				thongTinHoSo.setCoQuanCapDkkd(objCast.getCoQuanCapGiayPhep());
				thongTinHoSo.setCoQuanGiaiQuyet(Long.valueOf(objCast.getCoQuanGui()));
				thongTinHoSo.setDienThoaiDn(objCast.getDienThoai());
				thongTinHoSo.setDiaChiDn(objCast.getDiaChi());
				thongTinHoSo.setNgayGiaHanGiayDangKyKinhDoanh(Validator.isNotNull(objCast.getNgayFromGiahanGplv())?sdf.parse(objCast.getNgayFromGiahanGplv()):null);
				thongTinHoSo.setLyDoCapLai(objCast.getLydoGiaHan());
				thongTinHoSo.setSoFaxDn(objCast.getFax());
				thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.updateQlvtThongTinHoSo(thongTinHoSo);
				
			}
		} catch (Exception e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	public void vanThuProcessNghiepVuQuyTrinh5(Object obj,long idThuTucHanhChinh, long hoSoThuTucId,QlvtThongTinHoSo thongTinHoSo,QlvtThongTinXuLy addThongTinXuLy) {
		log.info("----- Cáº¥p giáº¥y phĂ©p váº­n táº£i Viá»‡t Nam - Trung Quá»‘c, Cháº¥p thuáº­n, bá»• sung, thay tháº¿ phÆ°Æ¡ng tiá»‡n khai thĂ¡c tuyáº¿n Viá»‡t Nam - Trung Quá»‘c -----");
		QlvtXuLyGpLienVan qlvtXuLyGpLienVan = null;
		QlvtXuLyGpLienVanLoaiHinhVanTai qlvtXuLyGpLienVanLoaiHinhVanTai = null;
		QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien = null;
		QlvtXuLyGpLienVanPhuongTienTramDungNghi QlvtXuLyGpLienVanPhuongTienTramDungNghi = null;
		int id = -1;
		try {
			log.info("----- obj.getClass().getName() -----"+obj.getClass().getName());
			if(obj.getClass().getName().contains(".DeNghiCapGiayPhepVanTaiDuongBoVietTrung")){
				DeNghiCapGiayPhepVanTaiDuongBoVietTrung objCast = (DeNghiCapGiayPhepVanTaiDuongBoVietTrung)obj;
				List<DeNghiCapGiayPhepVanTaiDuongBoVietTrung.DanhSachXe> listPhuongTien = objCast.getDanhSachXe();
				id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVan.class.getName());
				qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.createQlvtXuLyGpLienVan(id);
				qlvtXuLyGpLienVan.setThongTinXuLyId(Integer.valueOf(addThongTinXuLy.getId()+""));
				//TODO
//				qlvtXuLyGpLienVan.setLoaiCapPhep(objCast.get);
				qlvtXuLyGpLienVan.setSoGpvt(objCast.getSoGiayPhepVanTai());
				qlvtXuLyGpLienVan.setNgayCapGpvt(Validator.isNotNull(objCast.getNgayCapGiayPhepVanTai())?sdf.parse(objCast.getNgayCapGiayPhepVanTai()):null);
				qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.updateQlvtXuLyGpLienVan(qlvtXuLyGpLienVan);
				if(Validator.isNotNull(qlvtXuLyGpLienVan) && listPhuongTien.size() > 0){
					for (DeNghiCapGiayPhepVanTaiDuongBoVietTrung.DanhSachXe danhSachXe : listPhuongTien) {
						id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVanPhuongTien.class.getName());
						qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.createQlvtXuLyGpLienVanPhuongTien(id);
						qlvtXuLyGpLienVanPhuongTien.setCapGplvId(Integer.valueOf("0"+qlvtXuLyGpLienVan.getId()));
						qlvtXuLyGpLienVanPhuongTien.setBienSo(danhSachXe.getBienKiemSoat());
						qlvtXuLyGpLienVanPhuongTien.setHinhThucHoatDong(danhSachXe.getHinhThucHoatDong());
						qlvtXuLyGpLienVanPhuongTien.setNhanHieu(danhSachXe.getNhanHieu());
						//TODO danhSachXe.getThoiGianDeNghiCapPhep() danhSachXe.getTuyenHoatDong()
						qlvtXuLyGpLienVanPhuongTien.setTrongTai(Integer.valueOf("0"+danhSachXe.getTrongTai()));
						
						
						qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.updateQlvtXuLyGpLienVanPhuongTien(qlvtXuLyGpLienVanPhuongTien);
						List<String> listDiemDungNghis = danhSachXe.getDiemDungNghis();
						for (String string : listDiemDungNghis) {
							id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVanPhuongTienTramDungNghi.class.getName());
							QlvtXuLyGpLienVanPhuongTienTramDungNghi = QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalServiceUtil.createQlvtXuLyGpLienVanPhuongTienTramDungNghi(id);
							QlvtXuLyGpLienVanPhuongTienTramDungNghi.setCapGplxPhuongTienId(Integer.valueOf("0"+qlvtXuLyGpLienVanPhuongTien.getId()));
							QlvtXuLyGpLienVanPhuongTienTramDungNghi.setMaTramDungNghi(string);
							QlvtXuLyGpLienVanPhuongTienTramDungNghi = QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalServiceUtil.updateQlvtXuLyGpLienVanPhuongTienTramDungNghi(QlvtXuLyGpLienVanPhuongTienTramDungNghi);
						}
					}
				}
				//UPDATE THONG TIN HO SO
				thongTinHoSo.setNguoiLienHeTraKetQua(objCast.getNguoiLienHeTraKqCapPhep());
				thongTinHoSo.setSoDienThoaiNguoiLienHe(objCast.getDienThoaiNguoiTraKqCapPhep());
				thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.updateQlvtThongTinHoSo(thongTinHoSo);
				
			}else if(obj.getClass().getName().contains(".DeNghiCapGPVTVietTrungChoXeCongVu")){
				DeNghiCapGPVTVietTrungChoXeCongVu objCast = (DeNghiCapGPVTVietTrungChoXeCongVu)obj;
				List<DeNghiCapGPVTVietTrungChoXeCongVu.DanhSachXe> listPhuongTien = objCast.getDanhSachXe();
				id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVan.class.getName());
				qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.createQlvtXuLyGpLienVan(id);
				qlvtXuLyGpLienVan.setThongTinXuLyId(Integer.valueOf(addThongTinXuLy.getId()+""));
				//TODO
//				qlvtXuLyGpLienVan.setLoaiCapPhep(objCast.get);
//				objCast.get
//				qlvtXuLyGpLienVan.setSoGpvt(objCast.getSoGiayPhepVanTai());
//				qlvtXuLyGpLienVan.setNgayCapGpvt(Validator.isNotNull(objCast.getNgayCapGiayPhepVanTai())?sdf.parse(objCast.getNgayCapGiayPhepVanTai()):null);
				qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.updateQlvtXuLyGpLienVan(qlvtXuLyGpLienVan);
				if(Validator.isNotNull(qlvtXuLyGpLienVan) && listPhuongTien.size() > 0){
					for (DeNghiCapGPVTVietTrungChoXeCongVu.DanhSachXe danhSachXe : listPhuongTien) {
						id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVanPhuongTien.class.getName());
						qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.createQlvtXuLyGpLienVanPhuongTien(id);
						qlvtXuLyGpLienVanPhuongTien.setCapGplvId(Integer.valueOf("0"+qlvtXuLyGpLienVan.getId()));
						qlvtXuLyGpLienVanPhuongTien.setBienSo(danhSachXe.getBienKiemSoat());
						qlvtXuLyGpLienVanPhuongTien.setCuaKhau(danhSachXe.getCuaKhau());
						qlvtXuLyGpLienVanPhuongTien.setMaCuaKhau(danhSachXe.getCuaKhau());
						qlvtXuLyGpLienVanPhuongTien.setNhanHieu(danhSachXe.getNhanHieu());
						//TODO danhSachXe.getThoiGianDeNghiCapPhep() danhSachXe.getTuyenHoatDong()
						qlvtXuLyGpLienVanPhuongTien.setTrongTai(Integer.valueOf("0"+danhSachXe.getTrongTai()));
						
						
						qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.updateQlvtXuLyGpLienVanPhuongTien(qlvtXuLyGpLienVanPhuongTien);
						
					}
				}
				
				//UPDATE THONG TIN HO SO
				thongTinHoSo.setNguoiLienHeTraKetQua(objCast.getNguoiLienHeTraKqCapPhep());
				thongTinHoSo.setSoDienThoaiNguoiLienHe(objCast.getDienThoaiNguoiTraKqCapPhep());
				thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.updateQlvtThongTinHoSo(thongTinHoSo);
				
			}else if(obj.getClass().getName().contains(".DeNghiGioiThieuXinCapGPVTLoaiDVietNam")){
				DeNghiGioiThieuXinCapGPVTLoaiDVietNam objCast = (DeNghiGioiThieuXinCapGPVTLoaiDVietNam)obj;
				List<DeNghiGioiThieuXinCapGPVTLoaiDVietNam.DanhSachXe> listPhuongTien = objCast.getDanhSachXe();
				id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVan.class.getName());
				qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.createQlvtXuLyGpLienVan(id);
				qlvtXuLyGpLienVan.setThongTinXuLyId(Integer.valueOf(addThongTinXuLy.getId()+""));
				//TODO
//				qlvtXuLyGpLienVan.setLoaiCapPhep(objCast.get);
				qlvtXuLyGpLienVan.setSoGpvt(objCast.getSoGiayPhepVC());
				qlvtXuLyGpLienVan.setCoQuanCapPhepLienVan(objCast.getNoiCapGiayPhepVC());
				qlvtXuLyGpLienVan.setNgayCapGpvt(Validator.isNotNull(objCast.getNgayCapGiayPhepVC())?sdf.parse(objCast.getNgayCapGiayPhepVC()):null);
				qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.updateQlvtXuLyGpLienVan(qlvtXuLyGpLienVan);
				if(Validator.isNotNull(qlvtXuLyGpLienVan) && listPhuongTien.size() > 0){
					for (DeNghiGioiThieuXinCapGPVTLoaiDVietNam.DanhSachXe danhSachXe : listPhuongTien) {
						id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVanPhuongTien.class.getName());
						qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.createQlvtXuLyGpLienVanPhuongTien(id);
						qlvtXuLyGpLienVanPhuongTien.setCapGplvId(Integer.valueOf("0"+qlvtXuLyGpLienVan.getId()));
						qlvtXuLyGpLienVanPhuongTien.setBienSo(danhSachXe.getBienKiemSoat());
						qlvtXuLyGpLienVanPhuongTien.setNhanHieu(danhSachXe.getNhanHieu());
						qlvtXuLyGpLienVanPhuongTien.setSoKhung(danhSachXe.getSoKhung());
						qlvtXuLyGpLienVanPhuongTien.setMauSon(danhSachXe.getMauSon());
						qlvtXuLyGpLienVanPhuongTien.setSoMay(danhSachXe.getSoMay());
						//TODO danhSachXe.getThoiGianDeNghiCapPhep() danhSachXe.getTuyenHoatDong()
						qlvtXuLyGpLienVanPhuongTien.setTrongTai(Integer.valueOf("0"+danhSachXe.getTrongTai()));
						qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.updateQlvtXuLyGpLienVanPhuongTien(qlvtXuLyGpLienVanPhuongTien);
						List<String> listDiemDungNghis = danhSachXe.getDiemDungNghis();
						for (String string : listDiemDungNghis) {
							id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVanPhuongTienTramDungNghi.class.getName());
							QlvtXuLyGpLienVanPhuongTienTramDungNghi = QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalServiceUtil.createQlvtXuLyGpLienVanPhuongTienTramDungNghi(id);
							QlvtXuLyGpLienVanPhuongTienTramDungNghi.setCapGplxPhuongTienId(Integer.valueOf("0"+qlvtXuLyGpLienVanPhuongTien.getId()));
							QlvtXuLyGpLienVanPhuongTienTramDungNghi.setMaTramDungNghi(string);
							QlvtXuLyGpLienVanPhuongTienTramDungNghi = QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalServiceUtil.updateQlvtXuLyGpLienVanPhuongTienTramDungNghi(QlvtXuLyGpLienVanPhuongTienTramDungNghi);
						}
					}
				}
				//UPDATE THONG TIN HO SO
				thongTinHoSo.setDiaDiemLamHoSo(objCast.getDiaChiNguoiLienHeTraKqCapPhep());
				thongTinHoSo.setSoDienThoaiNguoiLienHe(objCast.getDienThoaiNguoiTraKqCapPhep());
				thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.updateQlvtThongTinHoSo(thongTinHoSo);
			}else if(obj.getClass().getName().contains(".DonXinCapGPVTLoaiDCuaPTTrungQuoc")){
				DonXinCapGPVTLoaiDCuaPTTrungQuoc objCast = (DonXinCapGPVTLoaiDCuaPTTrungQuoc)obj;
				List<DonXinCapGPVTLoaiDCuaPTTrungQuoc.DanhSachXe> listPhuongTien = objCast.getDanhSachXe();
				id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVan.class.getName());
				qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.createQlvtXuLyGpLienVan(id);
				qlvtXuLyGpLienVan.setThongTinXuLyId(Integer.valueOf(addThongTinXuLy.getId()+""));
				//TODO
//				qlvtXuLyGpLienVan.setLoaiCapPhep(objCast.get);
				qlvtXuLyGpLienVan.setSoGpvt(objCast.getSoGiayPhepVCTQ());
				qlvtXuLyGpLienVan.setCoQuanCapPhepLienVan(objCast.getNoiCapGiayPhepVCTQ());
				qlvtXuLyGpLienVan.setNgayCapGpvt(Validator.isNotNull(objCast.getNgayCapGiayPhepVCTQ())?sdf.parse(objCast.getNgayCapGiayPhepVCTQ()):null);
				qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.updateQlvtXuLyGpLienVan(qlvtXuLyGpLienVan);
				if(Validator.isNotNull(qlvtXuLyGpLienVan) && listPhuongTien.size() > 0){
					for (DonXinCapGPVTLoaiDCuaPTTrungQuoc.DanhSachXe danhSachXe : listPhuongTien) {
						id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVanPhuongTien.class.getName());
						qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.createQlvtXuLyGpLienVanPhuongTien(id);
						qlvtXuLyGpLienVanPhuongTien.setCapGplvId(Integer.valueOf("0"+qlvtXuLyGpLienVan.getId()));
						qlvtXuLyGpLienVanPhuongTien.setBienSo(danhSachXe.getBienKiemSoat());
						qlvtXuLyGpLienVanPhuongTien.setNhanHieu(danhSachXe.getNhanHieu());
						qlvtXuLyGpLienVanPhuongTien.setSoKhung(danhSachXe.getSoKhung());
						qlvtXuLyGpLienVanPhuongTien.setMauSon(danhSachXe.getMauSon());
						qlvtXuLyGpLienVanPhuongTien.setSoMay(danhSachXe.getSoMay());
						//TODO danhSachXe.getThoiGianDeNghiCapPhep() danhSachXe.getTuyenHoatDong()
						qlvtXuLyGpLienVanPhuongTien.setTrongTai(Integer.valueOf("0"+danhSachXe.getTrongTai()));
						qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.updateQlvtXuLyGpLienVanPhuongTien(qlvtXuLyGpLienVanPhuongTien);
						List<String> listDiemDungNghis = danhSachXe.getDiemDungNghis();
						for (String string : listDiemDungNghis) {
							id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVanPhuongTienTramDungNghi.class.getName());
							QlvtXuLyGpLienVanPhuongTienTramDungNghi = QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalServiceUtil.createQlvtXuLyGpLienVanPhuongTienTramDungNghi(id);
							QlvtXuLyGpLienVanPhuongTienTramDungNghi.setCapGplxPhuongTienId(Integer.valueOf("0"+qlvtXuLyGpLienVanPhuongTien.getId()));
							QlvtXuLyGpLienVanPhuongTienTramDungNghi.setMaTramDungNghi(string);
							QlvtXuLyGpLienVanPhuongTienTramDungNghi = QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalServiceUtil.updateQlvtXuLyGpLienVanPhuongTienTramDungNghi(QlvtXuLyGpLienVanPhuongTienTramDungNghi);
						}
					}
				}
				//UPDATE THONG TIN HO SO
				thongTinHoSo.setNguoiLienHeTraKetQua(objCast.getNguoiLienHeTraKqCapPhep());
				thongTinHoSo.setSoDienThoaiNguoiLienHe(objCast.getDienThoaiNguoiTraKqCapPhep());
				thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.updateQlvtThongTinHoSo(thongTinHoSo);
			}else if(obj.getClass().getName().contains(".DeNghiGiaHanGiayPhepVanTaiChoPTTrungQuoc")){
				DeNghiGiaHanGiayPhepVanTaiChoPTTrungQuoc objCast = (DeNghiGiaHanGiayPhepVanTaiChoPTTrungQuoc)obj;
				id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVan.class.getName());
				qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.createQlvtXuLyGpLienVan(id);
				qlvtXuLyGpLienVan.setThongTinXuLyId(Integer.valueOf(addThongTinXuLy.getId()+""));
				//TODO
//				qlvtXuLyGpLienVan.setLoaiCapPhep(objCast.get);
				qlvtXuLyGpLienVan.setLoaiGiayPhepLienVan(objCast.getLoaiGiayPhepVT());
				qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.updateQlvtXuLyGpLienVan(qlvtXuLyGpLienVan);
				
				//UPDATE THONG TIN HO SO
				
			}else if(obj.getClass().getName().contains(".DeNghiCapLaiGPVTVietTrungDoHongMat")){
				DeNghiCapLaiGPVTVietTrungDoHongMat objCast = (DeNghiCapLaiGPVTVietTrungDoHongMat)obj;
				List<DeNghiCapLaiGPVTVietTrungDoHongMat.DanhSachXe> listPhuongTien = objCast.getDanhSachXe();
				id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVan.class.getName());
				qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.createQlvtXuLyGpLienVan(id);
				qlvtXuLyGpLienVan.setThongTinXuLyId(Integer.valueOf(addThongTinXuLy.getId()+""));
				//TODO
//				qlvtXuLyGpLienVan.setLoaiCapPhep(objCast.get);
				qlvtXuLyGpLienVan.setSoGpvt(objCast.getSoGiayPhepVanTai());
				qlvtXuLyGpLienVan.setCoQuanCapPhepLienVan(objCast.getNoiCapGiayPhepVanTai());
				qlvtXuLyGpLienVan.setNgayCapGpvt(Validator.isNotNull(objCast.getNgayCapGiayPhepVanTai())?sdf.parse(objCast.getNgayCapGiayPhepVanTai()):null);
				qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.updateQlvtXuLyGpLienVan(qlvtXuLyGpLienVan);
				if(Validator.isNotNull(qlvtXuLyGpLienVan) && listPhuongTien.size() > 0){
					for (DeNghiCapLaiGPVTVietTrungDoHongMat.DanhSachXe danhSachXe : listPhuongTien) {
						id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVanPhuongTien.class.getName());
						qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.createQlvtXuLyGpLienVanPhuongTien(id);
						qlvtXuLyGpLienVanPhuongTien.setCapGplvId(Integer.valueOf("0"+qlvtXuLyGpLienVan.getId()));
						qlvtXuLyGpLienVanPhuongTien.setBienSo(danhSachXe.getBienKiemSoat());
						qlvtXuLyGpLienVanPhuongTien.setNhanHieu(danhSachXe.getNhanHieu());
						//TODO danhSachXe.getThoiGianDeNghiCapPhep() danhSachXe.getTuyenHoatDong()
						qlvtXuLyGpLienVanPhuongTien.setTrongTai(Integer.valueOf("0"+danhSachXe.getTrongTai()));
						qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.updateQlvtXuLyGpLienVanPhuongTien(qlvtXuLyGpLienVanPhuongTien);
						List<String> listDiemDungNghis = danhSachXe.getDiemDungNghis();
						for (String string : listDiemDungNghis) {
							id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVanPhuongTienTramDungNghi.class.getName());
							QlvtXuLyGpLienVanPhuongTienTramDungNghi = QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalServiceUtil.createQlvtXuLyGpLienVanPhuongTienTramDungNghi(id);
							QlvtXuLyGpLienVanPhuongTienTramDungNghi.setCapGplxPhuongTienId(Integer.valueOf("0"+qlvtXuLyGpLienVanPhuongTien.getId()));
							QlvtXuLyGpLienVanPhuongTienTramDungNghi.setMaTramDungNghi(string);
							QlvtXuLyGpLienVanPhuongTienTramDungNghi = QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalServiceUtil.updateQlvtXuLyGpLienVanPhuongTienTramDungNghi(QlvtXuLyGpLienVanPhuongTienTramDungNghi);
						}
					}
				}
				
				//UPDATE THONG TIN HO SO
				thongTinHoSo.setNguoiLienHeTraKetQua(objCast.getNguoiLienHeTraKqCapPhep());
				thongTinHoSo.setSoDienThoaiNguoiLienHe(objCast.getDienThoaiNguoiTraKqCapPhep());
				thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.updateQlvtThongTinHoSo(thongTinHoSo);
				
			}else if(obj.getClass().getName().contains(".GiayDangKyKhaiThacTuyenVietTrung")){
				GiayDangKyKhaiThacTuyenVietTrung objCast = (GiayDangKyKhaiThacTuyenVietTrung)obj;
				List<GiayDangKyKhaiThacTuyenVietTrung.DanhSachXe> listPhuongTien = objCast.getDanhSachXe();
				id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVan.class.getName());
				qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.createQlvtXuLyGpLienVan(id);
				qlvtXuLyGpLienVan.setThongTinXuLyId(Integer.valueOf(addThongTinXuLy.getId()+""));
				//TODO
//				qlvtXuLyGpLienVan.setLoaiCapPhep(objCast.get);
				qlvtXuLyGpLienVan.setSoGpvt(objCast.getSoGiayPhepVanTai());
				qlvtXuLyGpLienVan.setCoQuanCapPhepLienVan(objCast.getNoiCapGiayPhepVanTai());
				qlvtXuLyGpLienVan.setNgayCapGpvt(Validator.isNotNull(objCast.getNgayCapGiayPhepVantai())?sdf.parse(objCast.getNgayCapGiayPhepVantai()):null);
				qlvtXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.updateQlvtXuLyGpLienVan(qlvtXuLyGpLienVan);
				if(Validator.isNotNull(qlvtXuLyGpLienVan) && listPhuongTien.size() > 0){
					for (GiayDangKyKhaiThacTuyenVietTrung.DanhSachXe danhSachXe : listPhuongTien) {
						id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpLienVanPhuongTien.class.getName());
						qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.createQlvtXuLyGpLienVanPhuongTien(id);
						qlvtXuLyGpLienVanPhuongTien.setCapGplvId(Integer.valueOf("0"+qlvtXuLyGpLienVan.getId()));
						qlvtXuLyGpLienVanPhuongTien.setBienSo(danhSachXe.getBienKiemSoat());
						//TODO danhSachXe.getThoiGianDeNghiCapPhep() danhSachXe.getTuyenHoatDong()
						qlvtXuLyGpLienVanPhuongTien.setCuaKhau(danhSachXe.getCuaKhau());
						qlvtXuLyGpLienVanPhuongTien.setMaCuaKhau(danhSachXe.getCuaKhau());
						qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.updateQlvtXuLyGpLienVanPhuongTien(qlvtXuLyGpLienVanPhuongTien);
					}
				}
				//UPDATE THONG TIN HO SO
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void vanThuProcessNghiepVuQuyTrinh6(Object obj,long idThuTucHanhChinh, long hoSoThuTucId,QlvtThongTinHoSo thongTinHoSo,QlvtThongTinXuLy addThongTinXuLy) {
		log.info("----- Cáº¥p phĂ¹ hiá»‡u, biá»ƒn hiá»‡u -----"+obj.getClass().getName());
		QLVTXuLyBienHieu ettXLBienHieu = null;
		QLVTXuLyBienHieuPhuongTien ettXLBienHieuPhuongTien = null;
		QLVTXuLyPhuHieu ettXLPhuHieu = null;
		QLVTXuLyPhuHieuPhuongTien ettXLPhuHieuPhuongTien = null;
		QLVTXuLyPhuHieuPhuongTienTuyen ettXLPhuHieuPhuongTienTuyen = null;
		int id = -1;
		try {
			if(obj.getClass().getName().contains(".DeNghiCapBienHieuXeOtoVanChuyenKhachDuLich")){
				DeNghiCapBienHieuXeOtoVanChuyenKhachDuLich objCast = (DeNghiCapBienHieuXeOtoVanChuyenKhachDuLich)obj;
				List<DeNghiCapBienHieuXeOtoVanChuyenKhachDuLich.DanhSachXe> listPhuongTien = objCast.getDanhSachXe();
				id = (int) CounterLocalServiceUtil.increment(QLVTXuLyBienHieu.class.getName());
				ettXLBienHieu = QLVTXuLyBienHieuLocalServiceUtil.createQLVTXuLyBienHieu(id);
				ettXLBienHieu.setThongTinXuLyId(Integer.valueOf(addThongTinXuLy.getId()+""));
				String strLv = "";
				if(Validator.isNotNull(objCast.getLinhVucKinhDoanhs())){
					for(String str: objCast.getLinhVucKinhDoanhs()){
						strLv += str+",";
					}
				}
				if(strLv.length()<=0){
					strLv +=",";
				}
				strLv = strLv.substring(0,strLv.lastIndexOf(",")-1);
				ettXLBienHieu.setLinhVucKinhDoanh(strLv);
				ettXLBienHieu.setSoLuongXe(objCast.getSoXeDeNghi());
				ettXLBienHieu.setGpkdLuuHanhQuocTe(objCast.getSoGPLH());
				ettXLBienHieu.setGpkdLuuHanhQuocTeCQCAP(objCast.getNoiCapGPLH());
				ettXLBienHieu.setGpkdLuuHanhQuocTeNgayCap(Validator.isNotNull(objCast.getNgayCapGPLH())?sdf.parse(objCast.getNgayCapGPLH()):null);
				ettXLBienHieu = QLVTXuLyBienHieuLocalServiceUtil.updateQLVTXuLyBienHieu(ettXLBienHieu);
				if(Validator.isNotNull(ettXLBienHieu) && listPhuongTien.size() > 0){
					for (DeNghiCapBienHieuXeOtoVanChuyenKhachDuLich.DanhSachXe danhSachXe : listPhuongTien) {
						id = (int) CounterLocalServiceUtil.increment(QLVTXuLyBienHieuPhuongTien.class.getName());
						ettXLBienHieuPhuongTien = QLVTXuLyBienHieuPhuongTienLocalServiceUtil.createQLVTXuLyBienHieuPhuongTien(id);
						ettXLBienHieuPhuongTien.setCapBienHieuID(ettXLBienHieu.getId());
						ettXLBienHieuPhuongTien.setNhanHieu(danhSachXe.getTenHieu());
						ettXLBienHieuPhuongTien.setBienSo(danhSachXe.getBienSoXe());
						ettXLBienHieuPhuongTien.setSoKhung(danhSachXe.getSoKhung());
						ettXLBienHieuPhuongTien.setNamSx(Validator.isNotNull(danhSachXe.getNamSX())?Integer.valueOf(danhSachXe.getNamSX()):0);
						ettXLBienHieuPhuongTien.setMauSon(danhSachXe.getMauSon());
						ettXLBienHieuPhuongTien.setSoChoNgoi(Validator.isNotNull(danhSachXe.getSoCho())?Integer.valueOf(danhSachXe.getSoCho()):0);
						ettXLBienHieuPhuongTien.setSoMay(danhSachXe.getSoMay());
						ettXLBienHieuPhuongTien = QLVTXuLyBienHieuPhuongTienLocalServiceUtil.updateQLVTXuLyBienHieuPhuongTien(ettXLBienHieuPhuongTien);
					}
				}
			}else{
				GiayDeNghiCapPhuHieuBienHieu objCast = (GiayDeNghiCapPhuHieuBienHieu)obj;
				List<GiayDeNghiCapPhuHieuBienHieu.DanhSachXe> listPhuongTien = objCast.getDanhSachXe();
				id = (int) CounterLocalServiceUtil.increment(QLVTXuLyPhuHieu.class.getName());
				ettXLPhuHieu = QLVTXuLyPhuHieuLocalServiceUtil.createQLVTXuLyPhuHieu(id);
				ettXLPhuHieu.setThongTinXuLyId(Integer.valueOf(addThongTinXuLy.getId()+""));
				ettXLPhuHieu.setSoLuong(Integer.valueOf(""+objCast.getSoLuongDeNghiCap()));
				ettXLPhuHieu.setSoLuongBH_PHNopLai(Integer.valueOf("0"+objCast.getSoLuongNopLai()));
				ettXLPhuHieu.setSoLuongBHPHNopLai(Integer.valueOf("0"+objCast.getSoLuongNopLai()));
				ettXLPhuHieu = QLVTXuLyPhuHieuLocalServiceUtil.updateQLVTXuLyPhuHieu(ettXLPhuHieu);
				if(Validator.isNotNull(ettXLPhuHieu) && listPhuongTien.size() > 0){
					for (GiayDeNghiCapPhuHieuBienHieu.DanhSachXe danhSachXe : listPhuongTien) {
						id = (int) CounterLocalServiceUtil.increment(QLVTXuLyPhuHieuPhuongTien.class.getName());
						ettXLPhuHieuPhuongTien = QLVTXuLyPhuHieuPhuongTienLocalServiceUtil.createQLVTXuLyPhuHieuPhuongTien(id);
						ettXLPhuHieuPhuongTien.setCapPhuHieuID(ettXLPhuHieu.getId());
						ettXLPhuHieuPhuongTien.setNhanHieu(danhSachXe.getNhanHieu());
						ettXLPhuHieuPhuongTien.setBienSo(danhSachXe.getBienSoXe());
						ettXLPhuHieuPhuongTien.setNamSanXuat(Validator.isNotNull(danhSachXe.getNamSX())?Integer.valueOf(danhSachXe.getNamSX()):0);
						ettXLPhuHieuPhuongTien.setTrongTai(Validator.isNotNull(danhSachXe.getSucChua())?Integer.valueOf(danhSachXe.getSucChua()):0);
						ettXLPhuHieuPhuongTien.setNoiSanXuat(danhSachXe.getNuocSX());
						ettXLPhuHieuPhuongTien.setMaTuyenCoDinh(danhSachXe.getTuyenCD());
						ettXLPhuHieuPhuongTien = QLVTXuLyPhuHieuPhuongTienLocalServiceUtil.updateQLVTXuLyPhuHieuPhuongTien(ettXLPhuHieuPhuongTien);
					}
				}
			}
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void vanThuProcessNghiepVuQuyTrinh7(Object obj,long idThuTucHanhChinh, long hoSoThuTucId,QlvtThongTinHoSo thongTinHoSo,QlvtThongTinXuLy addThongTinXuLy) {
		log.info("----- Cáº¥p giáº¥y phĂ©p kinh doanh váº­n táº£i báº±ng Ă´ tĂ´ -----");
		
		QlvtXuLyGpkdvtBangOto qlvtXuLyGpkdvtBangOto = null;
		QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai = null;
		
		int id = -1;
		try {
			log.info("----- obj.getClass().getName() -----"+obj.getClass().getName());
				DeNghiCapGiayPhepKDVTBangXeOto objCast = (DeNghiCapGiayPhepKDVTBangXeOto)obj;
			//	List<DeNghiCapGiayPhepKDVTBangXeOto.DanhSachXe> listPhuongTien = objCast.getDanhSachXe();
				id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpkdvtBangOto.class.getName());
				qlvtXuLyGpkdvtBangOto = QlvtXuLyGpkdvtBangOtoLocalServiceUtil.createQlvtXuLyGpkdvtBangOto(id);
				qlvtXuLyGpkdvtBangOto.setThongTinXuLyId(Integer.valueOf(addThongTinXuLy.getId()+""));
				//TODO
//				qlvtXuLyGpLienVan.setLoaiCapPhep(objCast.get);
				qlvtXuLyGpkdvtBangOto.setCoQuanCapGpkdVanTaiBangOto(objCast.getCoQuanGui());
				qlvtXuLyGpkdvtBangOto.setSoGpkdVanTaiBangOto(objCast.getSoGiayPhepKinhDoanh());
				qlvtXuLyGpkdvtBangOto.setNgayCapGpkdVanTaiBangOto(Validator.isNotNull(objCast.getNgayCapGiayPhepKinhDoanh())?sdf.parse(objCast.getNgayCapGiayPhepKinhDoanh()):null);
				List<String> listPhuongTien = objCast.getLoaiHinhKDVTs();
				//qlvtXuLyGpkdvtBangOto.setNgayCapGpvt(Validator.isNotNull(objCast.getNgayCapGiayPhepKinhDoanh()())?sdf.parse(objCast.getNgayCapGPVanTai()):null);
				qlvtXuLyGpkdvtBangOto = QlvtXuLyGpkdvtBangOtoLocalServiceUtil.updateQlvtXuLyGpkdvtBangOto(qlvtXuLyGpkdvtBangOto);
				if(Validator.isNotNull(qlvtXuLyGpkdvtBangOto) && listPhuongTien.size() > 0){
					for (String loaihinhhoatdong : listPhuongTien) {
						id = (int) CounterLocalServiceUtil.increment(QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.class.getName());
						qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai = QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalServiceUtil.createQlvtXuLyGpkdvtBangOtoLoaiHinhVanTai(id);
						qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.setGpkdvtBangOtoId(Integer.valueOf("0"+qlvtXuLyGpkdvtBangOto.getId()));
						qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.setMaLoaiHinhHoatDong(loaihinhhoatdong);
//						qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.setHinhThucHoatDong(danhSachXe.getHinhThucHoatDong());
//						qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.setNhanHieu(danhSachXe.getNhanHieu());
						//TODO danhSachXe.getThoiGianDeNghiCapPhep() danhSachXe.getTuyenHoatDong()
						qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai = QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalServiceUtil.updateQlvtXuLyGpkdvtBangOtoLoaiHinhVanTai(qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai);
						
					}
				}
		} catch (Exception e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void vanThuProcessNghiepVuQuyTrinh8(Object obj,long idThuTucHanhChinh, long hoSoThuTucId,QlvtThongTinHoSo thongTinHoSo,QlvtThongTinXuLy addThongTinXuLy) {
		log.info("----- Cháº¥p thuáº­n khai thĂ¡c tuyáº¿n, bá»• sung, thay tháº¿ phÆ°Æ¡ng tiá»‡n khai thĂ¡c tuyáº¿n Viá»‡t Nam - LĂ o, Viá»‡t Nam - Campuchia -----");
		QlvtXuLyKTTQuocTe qlvtXuLyKTTQuocTe = null;
		QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien = null;
		QlvtXuLyKTTQuocTeBieuDoXe qlvtXuLyKTTQuocTeBieuDoXe = null;
		QlvtXuLyKTTQuocTeDiemDungNghi  qlvtXuLyKTTQuocTeDiemDungNghi = null;
		int id = -1;
		try {
			if(obj.getClass().getName().contains(".DKKTVTTuyenCoDinhBangOtoVietLao")){
				DKKTVTTuyenCoDinhBangOtoVietLao objCast = (DKKTVTTuyenCoDinhBangOtoVietLao)obj;
				List<DKKTVTTuyenCoDinhBangOtoVietLao.DanhSachXe> listPhuongTien = objCast.getDanhSachXe();
				id = (int) CounterLocalServiceUtil.increment(QlvtXuLyKTTQuocTe.class.getName());
				qlvtXuLyKTTQuocTe = QlvtXuLyKTTQuocTeLocalServiceUtil.createQlvtXuLyKTTQuocTe(id);
				qlvtXuLyKTTQuocTe.setThongTinXuLyId(Integer.valueOf(addThongTinXuLy.getId()+""));
				qlvtXuLyKTTQuocTe.setBenDen(objCast.getBenDen());
				qlvtXuLyKTTQuocTe.setBenDi(objCast.getBenDi());
				qlvtXuLyKTTQuocTe.setCuaKhau(objCast.getCuaKhauDen());
				qlvtXuLyKTTQuocTe.setDiemDen(objCast.getTinhTPDen());
				qlvtXuLyKTTQuocTe.setDiemDi(objCast.getTinhTPDi());
				qlvtXuLyKTTQuocTe.setCuLyVanChuyen(Integer.valueOf(objCast.getCuLy()));
				qlvtXuLyKTTQuocTe.setHanhTrinhChay(objCast.getHanhTrinh());
				//TODO
				qlvtXuLyKTTQuocTe = QlvtXuLyKTTQuocTeLocalServiceUtil.updateQlvtXuLyKTTQuocTe(qlvtXuLyKTTQuocTe);
				if(Validator.isNotNull(qlvtXuLyKTTQuocTe) && listPhuongTien.size() > 0){
					log.info("---------------qlvtXuLyKTTQuocTe + listPhuongTien.size():"+listPhuongTien.size());
					for (DKKTVTTuyenCoDinhBangOtoVietLao.DanhSachXe danhSachXe : listPhuongTien) {
						id = (int) CounterLocalServiceUtil.increment(QlvtXuLyKTTQuocTePhuongTien.class.getName());
						qlvtXuLyKTTQuocTePhuongTien = QlvtXuLyKTTQuocTePhuongTienLocalServiceUtil.createQlvtXuLyKTTQuocTePhuongTien(id);
						qlvtXuLyKTTQuocTePhuongTien.setCapPhepKTTQuocTeID(Integer.valueOf("0"+qlvtXuLyKTTQuocTe.getId()));
						qlvtXuLyKTTQuocTePhuongTien.setBienSo(danhSachXe.getBienKiemSoat());
						qlvtXuLyKTTQuocTePhuongTien.setNhanHieu(danhSachXe.getLoaiXe());
						qlvtXuLyKTTQuocTePhuongTien.setTrongTai(Integer.valueOf("0"+danhSachXe.getSoGhe()));
						qlvtXuLyKTTQuocTePhuongTien.setNamSx(Integer.valueOf("0"+danhSachXe.getNamSx()));
						log.info("---------------updateeeeeeeeeeeeeeeeeeeeeeeee------------------");
						qlvtXuLyKTTQuocTePhuongTien.setKttQuocTeID(qlvtXuLyKTTQuocTe.getId());
						qlvtXuLyKTTQuocTePhuongTien = QlvtXuLyKTTQuocTePhuongTienLocalServiceUtil.updateQlvtXuLyKTTQuocTePhuongTien(qlvtXuLyKTTQuocTePhuongTien);
					}
				}
				log.info("---------------END------------------");
				//update QlvtThongTinHoSo
				thongTinHoSo.setSoDkkd(objCast.getSoGiayPhepVanTai());
				thongTinHoSo.setNgayCapDkkd(vn.dtt.duongbo.utils.format.FormatData.parseStringToDateTypeDDMMYYYY(objCast.getNgayCapGiayPhepVantai()));
				thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.updateQlvtThongTinHoSo(thongTinHoSo);
				
			}else if(obj.getClass().getName().contains(".TBaoDieuChinhTanSuatXeChayTuyenCDVietLao")){
				
				log.info("---------------TBaoDieuChinhTanSuatXeChayTuyenCDVietLao------------------");
				TBaoDieuChinhTanSuatXeChayTuyenCDVietLao objCast = (TBaoDieuChinhTanSuatXeChayTuyenCDVietLao)obj;
				List<TBaoDieuChinhTanSuatXeChayTuyenCDVietLao.DanhSachXe> listPhuongTien = objCast.getDanhSachXe();
				id = (int) CounterLocalServiceUtil.increment(QlvtXuLyKTTQuocTe.class.getName());
				qlvtXuLyKTTQuocTe = QlvtXuLyKTTQuocTeLocalServiceUtil.createQlvtXuLyKTTQuocTe(id);
				qlvtXuLyKTTQuocTe.setThongTinXuLyId(Integer.valueOf(addThongTinXuLy.getId()+""));
				qlvtXuLyKTTQuocTe = QlvtXuLyKTTQuocTeLocalServiceUtil.updateQlvtXuLyKTTQuocTe(qlvtXuLyKTTQuocTe);
				if(Validator.isNotNull(qlvtXuLyKTTQuocTe) && listPhuongTien.size() > 0){
					for (TBaoDieuChinhTanSuatXeChayTuyenCDVietLao.DanhSachXe danhSachXe : listPhuongTien) {
						id = (int) CounterLocalServiceUtil.increment(QlvtXuLyKTTQuocTePhuongTien.class.getName());
						qlvtXuLyKTTQuocTePhuongTien = QlvtXuLyKTTQuocTePhuongTienLocalServiceUtil.createQlvtXuLyKTTQuocTePhuongTien(id);
						qlvtXuLyKTTQuocTePhuongTien.setCapPhepKTTQuocTeID(Integer.valueOf("0"+qlvtXuLyKTTQuocTe.getId()));
						qlvtXuLyKTTQuocTePhuongTien.setBienSo(danhSachXe.getBienSoXe());
						qlvtXuLyKTTQuocTePhuongTien.setNhanHieu(danhSachXe.getNhanHieu());
						qlvtXuLyKTTQuocTePhuongTien.setTrongTai(Integer.valueOf("0"+danhSachXe.getTrongTai()));
						qlvtXuLyKTTQuocTePhuongTien.setNamSx(Integer.valueOf("0"+danhSachXe.getNamSX()));
						qlvtXuLyKTTQuocTePhuongTien.setKttQuocTeID(qlvtXuLyKTTQuocTe.getId());
						qlvtXuLyKTTQuocTePhuongTien = QlvtXuLyKTTQuocTePhuongTienLocalServiceUtil.updateQlvtXuLyKTTQuocTePhuongTien(qlvtXuLyKTTQuocTePhuongTien);
					}
				}
				//update QlvtThongTinHoSo
				thongTinHoSo.setSoDkkd(objCast.getSoGiayPhepVanTai());
				thongTinHoSo.setNgayCapDkkd(vn.dtt.duongbo.utils.format.FormatData.parseStringToDateTypeDDMMYYYY(objCast.getNgayCapGiayPhepVantai()));
				thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.updateQlvtThongTinHoSo(thongTinHoSo);
			}
			
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void vanThuProcessNghiepVuQuyTrinh9(Object obj,long idThuTucHanhChinh, long hoSoThuTucId,QlvtThongTinHoSo thongTinHoSo,QlvtThongTinXuLy addThongTinXuLy) {
		log.info("----- Ngá»«ng khai thĂ¡c tuyáº¿n, Ä‘iá»�u chá»‰nh táº§n suáº¥t cháº¡y xe trĂªn tuyáº¿n Viá»‡t Nam - LĂ o, Viá»‡t Nam - Campuchia -----");
		QlvtXuLyKTTQuocTe qlvtXuLyKTTQuocTe = null;
		QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien = null;
		QlvtXuLyKTTQuocTeBieuDoXe qlvtXuLyKTTQuocTeBieuDoXe = null;
		QlvtXuLyKTTQuocTeDiemDungNghi  qlvtXuLyKTTQuocTeDiemDungNghi = null;
		int id = -1;
		try {
			if(obj.getClass().getName().contains(".NgungKhaiThacTuyenVTHKCDBangOtoVietLao")){
				NgungKhaiThacTuyenVTHKCDBangOtoVietLao objCast = (NgungKhaiThacTuyenVTHKCDBangOtoVietLao)obj;
				id = (int) CounterLocalServiceUtil.increment(QlvtXuLyKTTQuocTe.class.getName());
				qlvtXuLyKTTQuocTe = QlvtXuLyKTTQuocTeLocalServiceUtil.createQlvtXuLyKTTQuocTe(id);
				qlvtXuLyKTTQuocTe.setThongTinXuLyId(Integer.valueOf(addThongTinXuLy.getId()+""));
				//TODO
				qlvtXuLyKTTQuocTe = QlvtXuLyKTTQuocTeLocalServiceUtil.updateQlvtXuLyKTTQuocTe(qlvtXuLyKTTQuocTe);
			
				//update QlvtThongTinHoSo
				thongTinHoSo.setSoDkkd(objCast.getSoGiayPhepVanTai());
				thongTinHoSo.setNgayCapDkkd(vn.dtt.duongbo.utils.format.FormatData.parseStringToDateTypeDDMMYYYY(objCast.getNgayCapGiayPhepVantai()));
				thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.updateQlvtThongTinHoSo(thongTinHoSo);
			}
			
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public TthcHoSoThuTuc updateMaBienNhanHoSoThuTuc(long hoSoThuTucId, long toChucQuanLy) {
		TthcHoSoThuTuc ett = null;
		try {
			ett = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
			String maBienNhan = StringPool.BLANK;
			long idByDoanhNghiep = CounterLocalServiceUtil.increment(DuongBoConfigurationManager.getStrProp("DGIncrement", "DoanhNghiep") + ett.getNguoiLamThuTucId());
			maBienNhan = generate6Number(idByDoanhNghiep) + "_" + generate6Number(ett.getNguoiLamThuTucId());
			ett.setMaBienNhan(maBienNhan);
			ett.setToChucQuanLy(toChucQuanLy);
			TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(ett);
		} catch (SystemException e) {
			e.printStackTrace();
			log.error(e);
		}
		return ett;
	}
	public TthcHoSoThuTuc updateMaBienNhanHoSoThuTuc(long hoSoThuTucId) {
		TthcHoSoThuTuc ett = null;
		try {
			ett = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
			String maBienNhan = StringPool.BLANK;
			long idByDoanhNghiep = CounterLocalServiceUtil.increment(DuongBoConfigurationManager.getStrProp("DGIncrement", "DoanhNghiep") + ett.getNguoiLamThuTucId());
			maBienNhan = generate6Number(idByDoanhNghiep) + "_" + generate6Number(ett.getNguoiLamThuTucId());
			ett.setMaBienNhan(maBienNhan);
			TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(ett);
		} catch (SystemException e) {
			e.printStackTrace();
			log.error(e);
		}
		return ett;
	}
	
	public String generate6Number(long idByDoanhNghiep) {
		String result = StringPool.BLANK;
		for (int i = 1; i < 6 - (String.valueOf(idByDoanhNghiep)).length(); i++) {
			result += "0";
		}
		result += idByDoanhNghiep;
		return result;
	}
	
	private QlvtThongTinHoSo addThongTinHoSo(MotCuaPhieuXuLy phieuXuLy, TthcThuTucHanhChinh tthcThuTucHanhChinh, long hoSoThuTucId) {
		
		QlvtThongTinHoSo result = null;
		try {
			TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
			DnDoanhNghiep doanhNghiep = DnDoanhNghiepLocalServiceUtil.fetchDnDoanhNghiep(hoSoThuTuc.getNguoiLamThuTucId());
			long id = CounterLocalServiceUtil.increment(QlvtThongTinHoSo.class.getName());
			result = QlvtThongTinHoSoLocalServiceUtil.createQlvtThongTinHoSo(id);
			//chua ro
			result.setSoCongVanDen("chua_co_quy_tac" + id);
			result.setTenDn(doanhNghiep.getTenDoanhNghiep());
			result.setDiaChiDn(doanhNghiep.getDiaChi());
			result.setDienThoaiDn(doanhNghiep.getDienThoai());
			result.setSoFaxDn(doanhNghiep.getFax());
			result.setEmailDn(doanhNghiep.getEmail());
			result.setSoDkkd(doanhNghiep.getSoDangKyKinhDoanh());
			result.setNgayCapDkkd(doanhNghiep.getNgayCapDkKd());
			result.setCoQuanCapDkkd(doanhNghiep.getCoQuanCapDkKd());
			String trangThaiHoSoStr = "";
//			MotCuaTrangThaiHoSo ettTTHS = null;
//			ettTTHS = MotCuaTrangThaiHoSoLocalServiceUtil.fetchMotCuaTrangThaiHoSo(phieuXuLy.getTrangThaiHienTaiId());
//			if (Validator.isNotNull(ettTTHS)) {
//				trangThaiHoSoStr = ettTTHS.getMaTrangThai();
//			}
//			result.setTrangThaiHoSo(trangThaiHoSoStr);
			
//			result.setHoSoThuTucId(Integer.valueOf(phieuXuLy.getHoSoThuTucId() + ""));
			
			result.setPhieuXuLyId(Integer.valueOf(phieuXuLy.getId() + ""));
			result.setMaSoHoSo(hoSoThuTuc.getMaSoHoSo());
			result.setSoGiayPhepKinhDoanhVanTaiNoiDia(doanhNghiep.getSoGpkdVanTaiBangOto());
			result.setNgayCapGPKDVTNoiDia(doanhNghiep.getNgayCapGpkdVanTaiBangOto());
			result.setWebSiteDn(doanhNghiep.getWebsite());
			result.setDaiDienDn(doanhNghiep.getNguoiDaiDien());
			result.setCoQuanCapGPKDVTNoiDia(doanhNghiep.getCoQuanCapGpkdVanTaiBangOto());
			
			result = QlvtThongTinHoSoLocalServiceUtil.updateQlvtThongTinHoSo(result);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	private QlvtThongTinXuLy addThongTinXuLy(MotCuaPhieuXuLy phieuXuLy, TthcThuTucHanhChinh tthcThuTucHanhChinh, QlvtThongTinHoSo thongTinHoSo, long userId, long hoSoThuTucId, long toChucQuanLy) {
		QlvtThongTinXuLy thongTinXuLy = null;
		try {
			log.info("======thongTinXuLy========" + thongTinXuLy);
			TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
			thongTinXuLy = new QlvtThongTinXuLyImpl();
			long id = CounterLocalServiceUtil.increment(QlvtThongTinXuLy.class.getName());
			thongTinXuLy = QlvtThongTinXuLyLocalServiceUtil.createQlvtThongTinXuLy(id);
			thongTinXuLy.setThongTinHoSoId(Integer.valueOf("0" + thongTinHoSo.getId()));
			String trangThaiHoSoStr = "";
			MotCuaTrangThaiHoSo ettTTHS = null;
			ettTTHS = MotCuaTrangThaiHoSoLocalServiceUtil.fetchMotCuaTrangThaiHoSo(phieuXuLy.getTrangThaiHienTaiId());
			if (Validator.isNotNull(ettTTHS)) {
				trangThaiHoSoStr = ettTTHS.getMaTrangThai();
			}
//			thongTinXuLy.setTrangThaiHoSo(trangThaiHoSoStr);
			thongTinXuLy.setMaSoHoSo(hoSoThuTuc.getMaSoHoSo());
			log.debug("======thongTinXuLy========" + thongTinXuLy);
			QlvtThongTinXuLyLocalServiceUtil.updateQlvtThongTinXuLy(thongTinXuLy);
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e);
		}
		return thongTinXuLy;
	}
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
}
