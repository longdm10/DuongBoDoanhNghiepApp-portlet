/**
 * 
 */

package vn.dtt.duongbo.portlet.canbo.utils;

import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.servlet.http.HttpServletRequest;

import vn.dtt.duongbo.business.Constants;
import vn.dtt.duongbo.business.MotCuaBusiness;
import vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo;
import vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinh;
import vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil;
import vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep;
import vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy;
import vn.dtt.duongbo.dao.motcua.model.MotCuaTrangThaiHoSo;
import vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit;
import vn.dtt.duongbo.dao.motcua.service.MotCuaPhieuXuLyLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaTrangThaiHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.OEPUserMgtWorkingUnitLocalServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtKiemTraHoSo;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCNoiDungThamTra;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtKiemTraHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtNoiDungThamTraLocalServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtTTHCNoiDungThamTraLocalServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinXuLyLocalServiceUtil;
import vn.dtt.duongbo.maudon.model.CongVanTuChoiCapPHBH;
import vn.dtt.duongbo.maudon.model.CongVanYCBSHoSoDeNghiCapPHBH;
import vn.dtt.duongbo.maudon.xml.MauDonFactory;
import vn.dtt.duongbo.utils.config.DuongBoConfigurationManager;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageBusUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.OrganizationLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.util.PortalUtil;

/**
 * @author binhnt
 * 
 */
public class CanBoBusinessUtils {
	
	private static Log log = LogFactoryUtil.getLog(CanBoBusinessUtils.class);
	MotCuaBusiness motCuaBusiness = new MotCuaBusiness();
	
	// can bo xu ly trang thái 54 -- > 55
	public void canBoDuyetThamXetVietTrung(ActionRequest actionRequest, ActionResponse httpReq) {
		try {
			
			log.info("====START===vao`canBoDuyetThamXetVietTrung=====");
			//common
			long hoSoThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_HO_SO_THU_TUC);
			long quyTrinhThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_QUY_TRINH_THU_TUC);
			long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
			long thuTucHanhChinhId = ParamUtil.getLong(actionRequest, Constants.ID_THU_TUC_HANH_CHINH);
			String maThuTucHanhChinh = ParamUtil.getString(actionRequest, Constants.MA_THU_TUC_HANH_CHINH);
			long userId = PortalUtil.getUserId(actionRequest);
			
			//business
			
			
			
			MotCuaPhieuXuLy phieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLy(phieuXuLyId);
			
			//thay đổi cái function này
			long dichChuyenTrangThaiPhieuSuLy =
				motCuaBusiness.dichChuyenTrangThaiPhieuXuLy(
					phieuXuLy, DuongBoConfigurationManager.getStrProp("dkdc.viettrung.Xu.ly", "Xu.ly"), userId, quyTrinhThuTucId, null);
			log.info("------dichChuyenTrangThaiPhieuXuLy---VIET TRUNG---" + dichChuyenTrangThaiPhieuSuLy);
			
			//business
			
			//DBVN-TQ1
			if (Constants.TTHC_VIET_TQ_CAP_PHEP_VAN_TAI_LOAI_ABCEFG_LAN_DAU.equalsIgnoreCase(maThuTucHanhChinh)) {
				
				String soCapPhep = ParamUtil.getString(actionRequest, "soCapPhep");
				String ngayCapPhep = ParamUtil.getString(actionRequest, "ngayCapPhep");
				String coQuanCapPhep = ParamUtil.getString(actionRequest, "coQuanCapPhep");
				String nienHanCapPhep = ParamUtil.getString(actionRequest, "nienHanCapPhep");
				String capLan = ParamUtil.getString(actionRequest, "capLan");
				String ngayCapLanDau = ParamUtil.getString(actionRequest, "ngayCapLanDau");
				String soDangKiKinhDoanh = ParamUtil.getString(actionRequest, "soDangKiKinhDoanh");
				String ngayCapDangKiKinhDoanh = ParamUtil.getString(actionRequest, "ngayCapDangKiKinhDoanh");
				String coQuanCapDkkd = ParamUtil.getString(actionRequest, "coQuanCapDkkd");
				String nienHanDangKiKinhDoanh = ParamUtil.getString(actionRequest, "nienHanDangKiKinhDoanh");
				String capLanDkkd = ParamUtil.getString(actionRequest, "capLanDkkd");
				String ngayCapLanDauDkkd = ParamUtil.getString(actionRequest, "ngayCapLanDauDkkd");
				String hoTen = ParamUtil.getString(actionRequest, "hoTen");
				String dienThoai = ParamUtil.getString(actionRequest, "dienThoai");
				
			//DBVN-TQ2
			} else if (Constants.TTHC_VIET_TQ_CAP_PHEP_VAN_TAI_CONG_VU.equalsIgnoreCase(maThuTucHanhChinh)) {
				
				String mucDichCapPhep = ParamUtil.getString(actionRequest, "mucDichCapPhep");
				String hoTen = ParamUtil.getString(actionRequest, "hoTen");
				String dienThoai = ParamUtil.getString(actionRequest, "dienThoai");
				String giayCNKDANKT = ParamUtil.getString(actionRequest, "giayCNKDANKT");
				String giayCNDKOto = ParamUtil.getString(actionRequest, "giayCNDKOto");
				String hopDongThuePT = ParamUtil.getString(actionRequest, "hopDongThuePT");
				String giayCNBH = ParamUtil.getString(actionRequest, "giayCNBH");
				String quyetDinhCongTac = ParamUtil.getString(actionRequest, "quyetDinhCongTac");
				String thuMoiDoiTac = ParamUtil.getString(actionRequest, "thuMoiDoiTac");
			
			//DBVN-TQ3
			} else if (Constants.TTHC_VIET_TQ_CAP_GIAY_GIOI_THIEU_DE_NGHI_CAP_PHEP_VAN_TAI_LOAI_D.equalsIgnoreCase(maThuTucHanhChinh)) {
				
				String soGPVCHQK = ParamUtil.getString(actionRequest, "soGPVCHQK");
				String coQuanCap = ParamUtil.getString(actionRequest, "coQuanCap");
				String capNgay = ParamUtil.getString(actionRequest, "capNgay");
				String diaChi = ParamUtil.getString(actionRequest, "diaChi");
				String dienThoai = ParamUtil.getString(actionRequest, "dienThoai");
			//DBVN-TQ4
			} else if (Constants.TTHC_VIET_TQ_CAP_PHEP_VAN_TAI_LOAI_D.equalsIgnoreCase(maThuTucHanhChinh)) {
				
				String soGPVN = ParamUtil.getString(actionRequest, "soGPVN");
				String ngayCapVN = ParamUtil.getString(actionRequest, "ngayCapVN");
				String coQuanVN = ParamUtil.getString(actionRequest, "coQuanVN");
				String soGPTQ = ParamUtil.getString(actionRequest, "soGPTQ");
				String ngayCapTQ = ParamUtil.getString(actionRequest, "ngayCapTQ");
				String coQuanTQ = ParamUtil.getString(actionRequest, "coQuanTQ");
				String hoTen = ParamUtil.getString(actionRequest, "hoTen");
				String dienThoai = ParamUtil.getString(actionRequest, "dienThoai");
			//DBVN-TQ5
			} else if (Constants.TTHC_VIET_TQ_CAP_GPVT_LOAI_B_C_F_G_lAN_THU_HAI_TRO_DI_TRONG_NAM.equalsIgnoreCase(maThuTucHanhChinh)) {
			
				String soKhung = ParamUtil.getString(actionRequest, "soKhung");
				String soMay = ParamUtil.getString(actionRequest, "soMay");
				String mauSon = ParamUtil.getString(actionRequest, "mauSon");
				String nhanHieu = ParamUtil.getString(actionRequest, "nhanHieu");
			//DBVN-TQ6
			} else if (Constants.TTHC_VIET_TQ_CAP_LAI_GPVT_A_E_HET_HAN.equalsIgnoreCase(maThuTucHanhChinh)) {
				
				String soCapPhep = ParamUtil.getString(actionRequest, "soCapPhep");
				String ngayCapPhep = ParamUtil.getString(actionRequest, "ngayCapPhep");
				String coQuanCapPhep = ParamUtil.getString(actionRequest, "coQuanCapPhep");
				String nienHanCapPhep = ParamUtil.getString(actionRequest, "nienHanCapPhep");
				String capLan = ParamUtil.getString(actionRequest, "capLan");
				String ngayCapLanDau = ParamUtil.getString(actionRequest, "ngayCapLanDau");
				String soDangKiKinhDoanh = ParamUtil.getString(actionRequest, "soDangKiKinhDoanh");
				String ngayCapDangKiKinhDoanh = ParamUtil.getString(actionRequest, "ngayCapDangKiKinhDoanh");
				String coQuanCapDkkd = ParamUtil.getString(actionRequest, "coQuanCapDkkd");
				String nienHanDangKiKinhDoanh = ParamUtil.getString(actionRequest, "nienHanDangKiKinhDoanh");
				String capLanDkkd = ParamUtil.getString(actionRequest, "capLanDkkd");
				String ngayCapLanDauDkkd = ParamUtil.getString(actionRequest, "ngayCapLanDauDkkd");
				String hoTen = ParamUtil.getString(actionRequest, "hoTen");
				String dienThoai = ParamUtil.getString(actionRequest, "dienThoai");
				
			
			//DBVN-TQ7
			} else if (Constants.TTHC_VIET_TQ_GIA_HAN_GIAY_PHEP_THOI_GIAN_LUU_HANH.equalsIgnoreCase(maThuTucHanhChinh)) {
			
				String nguoiGiaHan = ParamUtil.getString(actionRequest, "nguoiGiaHan");
				String diaChi = ParamUtil.getString(actionRequest, "diaChi");
				String soDienThoai = ParamUtil.getString(actionRequest, "soDienThoai");
				String loaiGPVT = ParamUtil.getString(actionRequest, "loaiGPVT");
				String soGPVT = ParamUtil.getString(actionRequest, "soGPVT");
				String coQuanCap = ParamUtil.getString(actionRequest, "coQuanCap");
				String capNgay = ParamUtil.getString(actionRequest, "capNgay");
				String thoiGianHetHoatDong = ParamUtil.getString(actionRequest, "thoiGianHetHoatDong");
				String lyDoKhongVeNuoc = ParamUtil.getString(actionRequest, "lyDoKhongVeNuoc");
				String ngayGiaHan = ParamUtil.getString(actionRequest, "ngayGiaHan");
				String tuNgay = ParamUtil.getString(actionRequest, "tuNgay");
				String denNgay = ParamUtil.getString(actionRequest, "denNgay");
				String giayChungNhanDKOto = ParamUtil.getString(actionRequest, "giayChungNhanDKOto");
			//DBVN-TQ8
			} else if (Constants.TTHC_VIET_TQ_DANG_KY_KHAI_THAC_TUYEN.equalsIgnoreCase(maThuTucHanhChinh)) {
			
			//DBVN-TQ9
			} else if (Constants.TTHC_VIET_TQ_BO_SUNG_THAY_THE_PHUONG_TIEN_KHAI_THAC_TUYEN.equalsIgnoreCase(maThuTucHanhChinh)) {
			
			//DBVN-TQ10
			} else if (Constants.TTHC_VIET_TQ_CAP_LAI_GPVT_LOAI_B_C_F_G_DO_HET_HAN.equalsIgnoreCase(maThuTucHanhChinh)) {
			
				String soKhung = ParamUtil.getString(actionRequest, "soKhung");
				String soMay = ParamUtil.getString(actionRequest, "soMay");
				String mauSon = ParamUtil.getString(actionRequest, "mauSon");
				String nhanHieu = ParamUtil.getString(actionRequest, "nhanHieu");
			//DBVN-TQ11
			} else if (Constants.TTHC_VIET_TQ_CAP_LAI_GPVT_A_D_E_HONG_MAT.equalsIgnoreCase(maThuTucHanhChinh)) {
				String tenDonViVanTai = ParamUtil.getString(actionRequest, "tenDonViVanTai");
				String soCapPhep = ParamUtil.getString(actionRequest, "soCapPhep");
				String diaChi = ParamUtil.getString(actionRequest, "diaChi");
				String soDienThoai = ParamUtil.getString(actionRequest, "soDienThoai");
				String soGPKDVTOto = ParamUtil.getString(actionRequest, "ngayCapGPKDVTOto");
				String ngayCapGPKDVTOto = ParamUtil.getString(actionRequest, "soCapPhep");
				String coQuanCapGPKDVTOto = ParamUtil.getString(actionRequest, "coQuanCapGPKDVTOto");
				String soGCNKD = ParamUtil.getString(actionRequest, "soGCNKD");
				String ngayCapGCNKD = ParamUtil.getString(actionRequest, "ngayCapGCNKD");
				String coQuanCapGCNKD = ParamUtil.getString(actionRequest, "coQuanCapGCNKD");
				String hoTen = ParamUtil.getString(actionRequest, "hoTen");
				String dienThoai = ParamUtil.getString(actionRequest, "dienThoai");
				
			}
			
			httpReq.setRenderParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
			httpReq.setRenderParameter(Constants.ID_QUY_TRINH_THU_TUC, String.valueOf(quyTrinhThuTucId));
			httpReq.setRenderParameter(Constants.ID_PHIEU_XU_LY, String.valueOf(phieuXuLyId));
			httpReq.setRenderParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
			httpReq.setRenderParameter(Constants.MA_THU_TUC_HANH_CHINH, String.valueOf(maThuTucHanhChinh));
			
			
			PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
		} catch (Exception e) {
			log.error(e);
		}
	}
	
	// can bo xu ly trang thái 54 -- > 55
	public void canBoDuyetThamXet(ActionRequest actionRequest, ActionResponse httpReq) {
		try {
			
			log.info("================vao`canBoDuyetThamXet=====");
			long hoSoThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_HO_SO_THU_TUC);
			long quyTrinhThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_QUY_TRINH_THU_TUC);
			long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
			long userId = PortalUtil.getUserId(actionRequest);
			
			MotCuaPhieuXuLy phieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLy(phieuXuLyId);
			
			//thay đổi cái function này
			//DuongBoConfigurationManager.getStrProp("dieukiendichchuyen.can.bo.xu.ly", "Xu.ly")
			//DuongBoConfigurationManager.getStrProp("dieu kien moi", "cot hanh dong su kien")
			long dichChuyenTrangThaiPhieuSuLy =
				motCuaBusiness.dichChuyenTrangThaiPhieuXuLy(
					phieuXuLy, DuongBoConfigurationManager.getStrProp("dieukiendichchuyen.can.bo.xu.ly", "Xu.ly"), userId, quyTrinhThuTucId, null);
			log.info("---------------dichChuyenTrangThaiPhieuXuLy==" + dichChuyenTrangThaiPhieuSuLy);
			
			httpReq.setRenderParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
			httpReq.setRenderParameter(Constants.ID_QUY_TRINH_THU_TUC, String.valueOf(quyTrinhThuTucId));
			httpReq.setRenderParameter(Constants.ID_PHIEU_XU_LY, String.valueOf(phieuXuLyId));
			
			PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			
		} catch (Exception e) {
			log.error(e);
		}
	}
	
	/**html/canbo/thulyhs/duongbo/tongcuc/canboxuly/cho_tham_xet_viet_lao.jsp*/
	public void canBoDuyetThamXetVietLao(ActionRequest actionRequest, ActionResponse httpReq) {
		try {
			
			log.info("=======VietLao=========vao`canBoDuyetThamXetVietLao=====");
			
			//common
			long hoSoThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_HO_SO_THU_TUC);
			long quyTrinhThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_QUY_TRINH_THU_TUC);
			long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
			long thuTucHanhChinhId = ParamUtil.getLong(actionRequest, Constants.ID_THU_TUC_HANH_CHINH);
			String maThuTucHanhChinh = ParamUtil.getString(actionRequest, Constants.MA_THU_TUC_HANH_CHINH);
			long userId = PortalUtil.getUserId(actionRequest);
			
			//business
			
			
			//update chuyen dich trang thai
			MotCuaPhieuXuLy phieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLy(phieuXuLyId);
			long dichChuyenTrangThaiPhieuSuLy =
				motCuaBusiness.dichChuyenTrangThaiPhieuXuLy(
					phieuXuLy, DuongBoConfigurationManager.getStrProp("dkdc.vietlao.Xu.ly", "Xu.ly"), userId, quyTrinhThuTucId, null);
			log.info("---------------dichChuyenTrangThaiPhieuXuLy==" + dichChuyenTrangThaiPhieuSuLy);
			
			/***/
			if (Constants.TTHC_VIET_LAO_CAP_PHEP_DUONG_BO.equalsIgnoreCase(maThuTucHanhChinh)) {
				//tthc
				String string = ParamUtil.getString(actionRequest, "rdDanhGiaGiayPhep");
				
				
			} else if (Constants.TTHC_VIET_LAO_CAP_LAI_DUONG_BO_HET_HAN.equalsIgnoreCase(maThuTucHanhChinh) ||
					Constants.TTHC_VIET_LAO_CAP_LAI_DUONG_BO_HU_HONG.equalsIgnoreCase(maThuTucHanhChinh) ||
					Constants.TTHC_VIET_LAO_CAP_LAI_DUONG_BO_MAT_MAT.equalsIgnoreCase(maThuTucHanhChinh)) {
				//tthc
			}
			
			//update thong tin ho so (tthc_hosothutuc)
//			TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.getTthcHoSoThuTuc(hoSoThuTucId);
//			TthcHoSoThuTucLocalServiceUtil.updateHoSoThuTuc(userId, nguoiLamThuTucId, hoSoThuTucId, thuTucHanhChinhId, thanhPhanHoSoId, bieuMauHoSoId, trangThaiHoSoThuTuc, phanNhomHoSoId, organizationId, noiDungXML, trangThaiNoiDungHoSo);
			
			
			
			httpReq.setRenderParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
			httpReq.setRenderParameter(Constants.ID_QUY_TRINH_THU_TUC, String.valueOf(quyTrinhThuTucId));
			httpReq.setRenderParameter(Constants.ID_PHIEU_XU_LY, String.valueOf(phieuXuLyId));
			httpReq.setRenderParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
			httpReq.setRenderParameter(Constants.MA_THU_TUC_HANH_CHINH, maThuTucHanhChinh);
			
			PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
		} catch (Exception e) {
			log.error(e);
			log.error(e);
		}
	}
	
	public void chuyenXuLyChoCanBoKhac(ActionRequest actionRequest, ActionResponse httpReq) {
		try {
			
			log.info("================vao`canBoDuyetThamXet=====");
			long hoSoThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_HO_SO_THU_TUC);
			long quyTrinhThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_QUY_TRINH_THU_TUC);
			long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
			long userId = ParamUtil.getLong(actionRequest, "empId");
			log.info("?" + userId + "//================vao`phieuXuLyId=====" + phieuXuLyId);
			
			MotCuaPhieuXuLy phieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLy(phieuXuLyId);
			phieuXuLy.setNguoiXuLy(userId);
			MotCuaPhieuXuLyLocalServiceUtil.updateMotCuaPhieuXuLy(phieuXuLy);
			long dichChuyenTrangThaiPhieuSuLy =
				motCuaBusiness.dichChuyenTrangThaiPhieuXuLy(
					phieuXuLy, DuongBoConfigurationManager.getStrProp("dieukiendichchuyen.can.bo.chuyen.xu.ly", "Chuyen.xu.ly"), userId, quyTrinhThuTucId, null);
			log.info("---------------dichChuyenTrangThaiPhieuXuLy==" + dichChuyenTrangThaiPhieuSuLy);
			
			httpReq.setRenderParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
			httpReq.setRenderParameter(Constants.ID_QUY_TRINH_THU_TUC, String.valueOf(quyTrinhThuTucId));
			httpReq.setRenderParameter(Constants.ID_PHIEU_XU_LY, String.valueOf(phieuXuLyId));
			
			PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			
		} catch (Exception e) {
			log.error(e);
		}
	}
	
	public void chuyenXuLyChoCanBoKhacVietLao(ActionRequest actionRequest, ActionResponse httpReq) {
		try {
			
			log.info("=====vao`chuyenXuLyChoCanBoKhac--------VietLao=====");
			long hoSoThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_HO_SO_THU_TUC);
			long quyTrinhThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_QUY_TRINH_THU_TUC);
			long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
			long userId = ParamUtil.getLong(actionRequest, "empId");
			log.info("?" + userId + "//================vao`phieuXuLyId=====" + phieuXuLyId);
			
			MotCuaPhieuXuLy phieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLy(phieuXuLyId);
			phieuXuLy.setNguoiXuLy(userId);
			MotCuaPhieuXuLyLocalServiceUtil.updateMotCuaPhieuXuLy(phieuXuLy);
			
			long dichChuyenTrangThaiPhieuSuLy =
				motCuaBusiness.dichChuyenTrangThaiPhieuXuLy(
					phieuXuLy, DuongBoConfigurationManager.getStrProp("dkdc.vietlao.chuyen.xu.ly", "Chuyen.xu.ly"), userId, quyTrinhThuTucId, null);
			log.info("---------------dichChuyenTrangThaiPhieuXuLy==" + dichChuyenTrangThaiPhieuSuLy);
			
			httpReq.setRenderParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
			httpReq.setRenderParameter(Constants.ID_QUY_TRINH_THU_TUC, String.valueOf(quyTrinhThuTucId));
			httpReq.setRenderParameter(Constants.ID_PHIEU_XU_LY, String.valueOf(phieuXuLyId));
			
			PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
			
		} catch (Exception e) {
			log.error(e);
			log.error(e);
		}
	}
	
	public void traKetQua(ActionRequest actionRequest, ActionResponse httpReq) {
		try {
			
			log.info("================vao`traKetQua=====");
			long hoSoThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_HO_SO_THU_TUC);
			long quyTrinhThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_QUY_TRINH_THU_TUC);
			long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
			long userId = PortalUtil.getUserId(actionRequest);
			
			MotCuaPhieuXuLy phieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLy(phieuXuLyId);
			
			long dichChuyenTrangThaiPhieuSuLy =
				motCuaBusiness.dichChuyenTrangThaiPhieuXuLy(
					phieuXuLy, DuongBoConfigurationManager.getStrProp("dieukiendichchuyen.can.bo.tra.ket.qua", "Tra.ket.qua"), userId, quyTrinhThuTucId, null);
			log.info("---------------dichChuyenTrangThaiPhieuXuLy==" + dichChuyenTrangThaiPhieuSuLy);
			
			httpReq.setRenderParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
			httpReq.setRenderParameter(Constants.ID_QUY_TRINH_THU_TUC, String.valueOf(quyTrinhThuTucId));
			httpReq.setRenderParameter(Constants.ID_PHIEU_XU_LY, String.valueOf(phieuXuLyId));
			
			PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			
		} catch (Exception e) {
			log.error(e);
		}
	}
	//Cán bộ trả kết quả GPVT Việt Trung
	public void canBoTraKetQuaGPVTVietTrung(ActionRequest actionRequest, ActionResponse httpReq) {
		try {
			
			log.info("================vao`traKetQua==canBoTraKetQuaGPVTVietTrung===");
			//common
			long hoSoThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_HO_SO_THU_TUC);
			long quyTrinhThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_QUY_TRINH_THU_TUC);
			long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
			long thuTucHanhChinhId = ParamUtil.getLong(actionRequest, Constants.ID_THU_TUC_HANH_CHINH);
			String maThuTucHanhChinh = ParamUtil.getString(actionRequest, Constants.MA_THU_TUC_HANH_CHINH);
			long userId = PortalUtil.getUserId(actionRequest);
			
			//business
			
			
			
			MotCuaPhieuXuLy phieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLy(phieuXuLyId);
			
			long dichChuyenTrangThaiPhieuSuLy =
				motCuaBusiness.dichChuyenTrangThaiPhieuXuLy(
					phieuXuLy, DuongBoConfigurationManager.getStrProp("dkdc.viettrung.tra.ket.qua", "Tra.ket.qua"), userId, quyTrinhThuTucId, null);
			log.info("---------------dichChuyenTrangThaiPhieuXuLy==" + dichChuyenTrangThaiPhieuSuLy);
			
			httpReq.setRenderParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
			httpReq.setRenderParameter(Constants.ID_QUY_TRINH_THU_TUC, String.valueOf(quyTrinhThuTucId));
			httpReq.setRenderParameter(Constants.ID_PHIEU_XU_LY, String.valueOf(phieuXuLyId));
			
			PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			
		} catch (Exception e) {
			log.error(e);
		}
	}
	
	public void luuKetQuaThamXet(ActionRequest actionRequest, ActionResponse httpReq) {
		try {
			
			log.info("================vao`luuKetQuaThamXet=====");
			long hoSoThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_HO_SO_THU_TUC);
			long quyTrinhThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_QUY_TRINH_THU_TUC);
			long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
			long userId = PortalUtil.getUserId(actionRequest);
			
			MotCuaPhieuXuLy phieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLy(phieuXuLyId);
			
			long dichChuyenTrangThaiPhieuSuLy =
				motCuaBusiness.dichChuyenTrangThaiPhieuXuLy(
					phieuXuLy, DuongBoConfigurationManager.getStrProp("dieukiendichchuyen.can.bo.luu.ket.qua", "Luu.ket.qua"), userId, quyTrinhThuTucId, null);
			log.info("---------------dichChuyenTrangThaiPhieuXuLy==" + dichChuyenTrangThaiPhieuSuLy);
			
			httpReq.setRenderParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
			httpReq.setRenderParameter(Constants.ID_QUY_TRINH_THU_TUC, String.valueOf(quyTrinhThuTucId));
			httpReq.setRenderParameter(Constants.ID_PHIEU_XU_LY, String.valueOf(phieuXuLyId));
			
			PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			
		} catch (Exception e) {
			log.error(e);
		}
	}
	
	// Cái này cho GPVT Việt Trung
	
	
	public void xemTruocNoiDungThamXetVietTrung(ActionRequest actionRequest, ActionResponse httpReq) {
		try {
			
			log.info("================vao`xemTruocNoiDungThamXetVietTrung=====");
			long hoSoThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_HO_SO_THU_TUC);
			long quyTrinhThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_QUY_TRINH_THU_TUC);
			long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
			long userId = PortalUtil.getUserId(actionRequest);
			String thuTucHanhChinhId = ParamUtil.getString(actionRequest, Constants.ID_THU_TUC_HANH_CHINH);
			String keyKetQuaThamTra = ParamUtil.getString(actionRequest, "keyKetQuaThamTra");
			String lyDoBoSung = ParamUtil.getString(actionRequest, "lyDoBoSung");
			long orgUser = -1;
			orgUser = OrganizationLocalServiceUtil.getUserOrganizations(userId).get(0).getOrganizationId();
			OEPUserMgtWorkingUnit ettOEPWorkingUnit = OEPUserMgtWorkingUnitLocalServiceUtil.fetchByF_organizationId(""+orgUser);
			OEPUserMgtWorkingUnit ettOEPWorkingUnitParent = OEPUserMgtWorkingUnitLocalServiceUtil.fetchOEPUserMgtWorkingUnit(ettOEPWorkingUnit.getParentWorkingUnitId());
			TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
			DnDoanhNghiep ettNguoiLamThuTuc = DnDoanhNghiepLocalServiceUtil.fetchDnDoanhNghiep(hoSoThuTuc.getNguoiLamThuTucId());
			String kinhGui = StringPool.BLANK;
			if(Validator.isNotNull(ettNguoiLamThuTuc)){
				kinhGui = ettNguoiLamThuTuc.getLoaiNguoiLamThuTuc().equals("1")?ettNguoiLamThuTuc.getTenDoanhNghiep():ettNguoiLamThuTuc.getTenCongDan();
			}
			
			log.info("=======lyDoBoSung======"+lyDoBoSung+"//"+keyKetQuaThamTra);
			
			String[] lstTenGiayTo = ParamUtil.getParameterValues(actionRequest, "tenThanhPhanHoSo", new String[]{});
			
			TthcThanhPhanHoSo thanhPhanHoSo =null ;
			List<TthcThanhPhanHoSo> lisThanhPhanHoSos = TthcThanhPhanHoSoLocalServiceUtil.findByThuTucHanhChinhId(Long.parseLong(thuTucHanhChinhId));
			
			String idThanhPhanHoSo ="";
			String lydo ="";
			String ketQuaxml="";
			Class<?> clazz = Class.forName("vn.dtt.duongbo.maudon.model."+Constants.PDF_MAPPING_XSD.get(Constants.PDF_MAPPING.get(keyKetQuaThamTra)));
			Object obj = clazz.newInstance();
			if(keyKetQuaThamTra.equalsIgnoreCase("CVYCBS")){
				CongVanYCBSHoSoDeNghiCapPHBH mauDon = new CongVanYCBSHoSoDeNghiCapPHBH();
				List<CongVanYCBSHoSoDeNghiCapPHBH.DanhSach> listDanhSach = new ArrayList<CongVanYCBSHoSoDeNghiCapPHBH.DanhSach>();
				if(lisThanhPhanHoSos!=null && lisThanhPhanHoSos.size()>0){
					
					for(int i=0;i<lisThanhPhanHoSos.size();i++){
						thanhPhanHoSo = lisThanhPhanHoSos.get(i);
						idThanhPhanHoSo = ParamUtil.getString(actionRequest,thanhPhanHoSo.getId()+"dat");
						lydo = ParamUtil.getString(actionRequest,thanhPhanHoSo.getId()+"lydo");
							if(Validator.isNotNull(idThanhPhanHoSo)){
								CongVanYCBSHoSoDeNghiCapPHBH.DanhSach danhSach = new CongVanYCBSHoSoDeNghiCapPHBH.DanhSach();
								danhSach.setIdThanhPhanHoSo(idThanhPhanHoSo);
								danhSach.setLyDo(lydo);
								listDanhSach.add(danhSach);
							}
	    				}
				}
				mauDon.setTenCongTy(kinhGui);
				mauDon.setTinhThanh(Validator.isNotNull(ettOEPWorkingUnitParent)?ettOEPWorkingUnitParent.getCityNo():"01");
				mauDon.setDanhSachs(listDanhSach);
				obj = obj.getClass().cast(mauDon);
			}else if(keyKetQuaThamTra.equalsIgnoreCase("CVTCCGP")){
				CongVanTuChoiCapPHBH mauDon = new CongVanTuChoiCapPHBH();
				mauDon.setLyDoTuChoi(lyDoBoSung);
				mauDon.setTinhThanh(Validator.isNotNull(ettOEPWorkingUnitParent)?ettOEPWorkingUnitParent.getCityNo():"01");
				mauDon.setTenCongTy(kinhGui);
				obj = obj.getClass().cast(mauDon);
			}else{
				//TODO
				//set giá trị vào giấy phép cấp ra
				log.info("sassssss");
			}
			
			ketQuaxml = MauDonFactory.convertObjectToXml(obj);
			ketQuaxml = makeNoiDungXmlStandard(ketQuaxml);
			log.info("ketQuaxmlketQuaxmlketQuaxml"+ketQuaxml);
			QlvtThongTinHoSo thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.fetchByphieuXuLyId(phieuXuLyId);
			if(thongTinHoSo!=null){
				QlvtThongTinXuLy qlvtThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil.fetchBythongTinHoSoId(Integer.valueOf("0"+thongTinHoSo.getId()));
				qlvtThongTinXuLy.setKetQuaThamDinhXML(ketQuaxml);
				qlvtThongTinXuLy.setKetQuaXuLy(keyKetQuaThamTra);
				if(lyDoBoSung != null){
					qlvtThongTinXuLy.setYKienCanBoXuLy(lyDoBoSung);
				}
				qlvtThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil.updateQlvtThongTinXuLy(qlvtThongTinXuLy);
			}
			
			log.info("================vao`lstTenGiayTo====="+lstTenGiayTo);
			
			String jspPage ="/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vn_tq_tao_cong_van_yeu_cau_bo_sung_or_tu_choi_view.jsp";
			
			log.info("thuTucHanhChinhIdthuTucHanhChinhId"+thuTucHanhChinhId);
			MotCuaPhieuXuLy phieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLy(phieuXuLyId);
			
			
			httpReq.setRenderParameter("jspPage", jspPage);
			httpReq.setRenderParameter("lstTenGiayTo", lstTenGiayTo);
			httpReq.setRenderParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
			httpReq.setRenderParameter(Constants.ID_QUY_TRINH_THU_TUC, String.valueOf(quyTrinhThuTucId));
			httpReq.setRenderParameter(Constants.ID_PHIEU_XU_LY, String.valueOf(phieuXuLyId));
			httpReq.setRenderParameter(Constants.ID_THU_TUC_HANH_CHINH, thuTucHanhChinhId);
			httpReq.setRenderParameter("keyKetQuaThamTra", keyKetQuaThamTra);
			actionRequest.setAttribute("lyDoBoSung", lyDoBoSung);
			PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
		} catch (Exception e) {
			log.error(e);
		}
	}
	
	
	public void luuKetQuaThamXetGPVTVietTrung(ActionRequest actionRequest, ActionResponse httpReq) {
		try {
			
			log.info("================vao`luuKetQuaThamXet=====");
			long hoSoThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_HO_SO_THU_TUC);
			long quyTrinhThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_QUY_TRINH_THU_TUC);
			long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
			long userId = PortalUtil.getUserId(actionRequest);
			
			//them
			String thuTucHanhChinhId = ParamUtil.getString(actionRequest, Constants.ID_THU_TUC_HANH_CHINH);
			
			MotCuaPhieuXuLy phieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLy(phieuXuLyId);
			
			long dichChuyenTrangThaiPhieuSuLy =
				motCuaBusiness.dichChuyenTrangThaiPhieuXuLy(
					phieuXuLy, DuongBoConfigurationManager.getStrProp("dkdc.viettrung.Luu.ket.qua", "Luu.ket.qua"), userId, quyTrinhThuTucId, null);
			log.info("---------------dichChuyenTrangThaiPhieuXuLy==" + dichChuyenTrangThaiPhieuSuLy);
			
			//them
			List<TthcThanhPhanHoSo> lisThanhPhanHoSos = TthcThanhPhanHoSoLocalServiceUtil.findByThuTucHanhChinhId(Long.parseLong(thuTucHanhChinhId));
			TthcThanhPhanHoSo thanhPhanHoSo =null ;
			if(lisThanhPhanHoSos.size() > 0 && lisThanhPhanHoSos != null){
			for(int i=0;i<lisThanhPhanHoSos.size();i++){
				thanhPhanHoSo = lisThanhPhanHoSos.get(i);
				
			}
			}
			
			
			
			httpReq.setRenderParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
			httpReq.setRenderParameter(Constants.ID_QUY_TRINH_THU_TUC, String.valueOf(quyTrinhThuTucId));
			httpReq.setRenderParameter(Constants.ID_PHIEU_XU_LY, String.valueOf(phieuXuLyId));
			
			PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
		} catch (Exception e) {
			log.error(e);
		}
	}
	
	//-------------viet lao --------------
	public void luuKetQuaThamXetVietLao(ActionRequest actionRequest, ActionResponse httpReq) {
		try {
			
			log.info("=======VietLa=========vao`luuKetQuaThamXetVietLao=====");
			long hoSoThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_HO_SO_THU_TUC);
			long quyTrinhThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_QUY_TRINH_THU_TUC);
			long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
			long userId = PortalUtil.getUserId(actionRequest);
			
			MotCuaPhieuXuLy phieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLy(phieuXuLyId);
			
			long dichChuyenTrangThaiPhieuSuLy =
				motCuaBusiness.dichChuyenTrangThaiPhieuXuLy(
					phieuXuLy, DuongBoConfigurationManager.getStrProp("dkdc.vietlao.Luu.ket.qua", "Luu.ket.qua"), userId, quyTrinhThuTucId, null);
			log.info("---------------dichChuyenTrangThaiPhieuXuLy==" + dichChuyenTrangThaiPhieuSuLy);
			
			httpReq.setRenderParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
			httpReq.setRenderParameter(Constants.ID_QUY_TRINH_THU_TUC, String.valueOf(quyTrinhThuTucId));
			httpReq.setRenderParameter(Constants.ID_PHIEU_XU_LY, String.valueOf(phieuXuLyId));
			
			PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
		} catch (Exception e) {
			log.error(e);
		}
	}
	
	public void guiTruongPhongDuyet(ActionRequest actionRequest, ActionResponse httpReq) {
		try {
			
			log.info("================vao`guiTruongPhongDuyet=====");
			long hoSoThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_HO_SO_THU_TUC);
			long quyTrinhThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_QUY_TRINH_THU_TUC);
			long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
			long userId = PortalUtil.getUserId(actionRequest);
			
			MotCuaPhieuXuLy phieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLy(phieuXuLyId);
			phieuXuLy.setNguoiXuLy(36693);
			MotCuaPhieuXuLyLocalServiceUtil.updateMotCuaPhieuXuLy(phieuXuLy);
			
			long dichChuyenTrangThaiPhieuSuLy =
				motCuaBusiness.dichChuyenTrangThaiPhieuXuLy(
					phieuXuLy, DuongBoConfigurationManager.getStrProp("dieukiendichchuyen.can.bo.gui.duyet", "Gui.duyet"), userId, quyTrinhThuTucId, null);
			log.info("---------------dichChuyenTrangThaiPhieuXuLy==" + dichChuyenTrangThaiPhieuSuLy);
			
			httpReq.setRenderParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
			httpReq.setRenderParameter(Constants.ID_QUY_TRINH_THU_TUC, String.valueOf(quyTrinhThuTucId));
			httpReq.setRenderParameter(Constants.ID_PHIEU_XU_LY, String.valueOf(phieuXuLyId));
			
			PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
			
		} catch (Exception e) {
			log.error(e);
		}
	}
	
	// Cái này cho giấy phép vận tải việt trung
	public void guiTruongPhongDuyetGPVTVietTrung(ActionRequest actionRequest, ActionResponse httpReq) {
		try {
			
			log.info("================vao guiTruongPhongDuyetGPVTVietTrung=====");
			long hoSoThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_HO_SO_THU_TUC);
			long quyTrinhThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_QUY_TRINH_THU_TUC);
			long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
			long userId = PortalUtil.getUserId(actionRequest);
			
			String rdDanhGiaHoSo = ParamUtil.getString(actionRequest, "rdDanhGiaHoSo");
			String tenGiayTo1 = ParamUtil.getString(actionRequest, "tenGiayTo1");
			String tenGiayTo2 = ParamUtil.getString(actionRequest, "tenGiayTo2");
			String lyDo1 = ParamUtil.getString(actionRequest, "lyDo1");
			String lyDo2 = ParamUtil.getString(actionRequest, "lyDo2");
			String keyKetQuaThamTra = ParamUtil.getString(actionRequest, "keyKetQuaThamTra");
			log.info("================ guiTruongPhongDuyetGPVTVietTrung=====rdDanhGiaHoSo: "+rdDanhGiaHoSo);
			log.info("================ guiTruongPhongDuyetGPVTVietTrung=====tenGiayTo1: "+tenGiayTo1);
			log.info("================ guiTruongPhongDuyetGPVTVietTrung=====tenGiayTo2: "+tenGiayTo2);
			log.info("================ guiTruongPhongDuyetGPVTVietTrung=====lyDo1: "+lyDo1);
			log.info("================ guiTruongPhongDuyetGPVTVietTrung=====lyDo2: "+lyDo2);
			
			MotCuaPhieuXuLy phieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLy(phieuXuLyId);
//			phieuXuLy.setNguoiXuLy(36693);
//			MotCuaPhieuXuLyLocalServiceUtil.updateMotCuaPhieuXuLy(phieuXuLy);
			
			long dichChuyenTrangThaiPhieuSuLy =
				motCuaBusiness.dichChuyenTrangThaiPhieuXuLy(
					phieuXuLy, DuongBoConfigurationManager.getStrProp("dkdc.viettrung.Gui.duyet", "Gui.duyet"), userId, quyTrinhThuTucId, null);
			log.info("---------------dichChuyenTrangThaiPhieuXuLy==" + dichChuyenTrangThaiPhieuSuLy);
			
			httpReq.setRenderParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
			httpReq.setRenderParameter(Constants.ID_QUY_TRINH_THU_TUC, String.valueOf(quyTrinhThuTucId));
			httpReq.setRenderParameter(Constants.ID_PHIEU_XU_LY, String.valueOf(phieuXuLyId));
			httpReq.setRenderParameter("rdDanhGiaHoSo",rdDanhGiaHoSo);
			httpReq.setRenderParameter("tenGiayTo1", tenGiayTo1);
			httpReq.setRenderParameter("tenGiayTo2", tenGiayTo2);
			httpReq.setRenderParameter("lyDo1", lyDo1);
			httpReq.setRenderParameter("lyDo2", lyDo2);
			
			
			
			PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
			
		} catch (Exception e) {
			log.error(e);
		}
	}
	
	//Bước 3- Đang thẩm xét- Chuyên viên - Gui.duyet
	public void guiTruongPhongDuyetVietLao(ActionRequest actionRequest, ActionResponse httpReq) {
		try {
			
			log.info("======VietLao==========vao`guiTruongPhongDuyetVietLao=====");
			String thuTucHanhChinhId = ParamUtil.getString(actionRequest, Constants.ID_THU_TUC_HANH_CHINH);
			String maThuTucHanhChinh = ParamUtil.getString(actionRequest, Constants.MA_THU_TUC_HANH_CHINH);
			long hoSoThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_HO_SO_THU_TUC);
			long quyTrinhThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_QUY_TRINH_THU_TUC);
			long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
			//danh gia ho so cua chuyen vien, gui truong phong
			String cbDanhGiaHs = ParamUtil.getString(actionRequest, "cbDanhGiaHs");
			log.info("--cbDanhGiaHs--" + cbDanhGiaHs);
			
			long userId = PortalUtil.getUserId(actionRequest);
			
			MotCuaPhieuXuLy phieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLy(phieuXuLyId);
//			phieuXuLy.setNguoiXuLy(36693);
//			MotCuaPhieuXuLyLocalServiceUtil.updateMotCuaPhieuXuLy(phieuXuLy);
			
			long dichChuyenTrangThaiPhieuSuLy = motCuaBusiness.dichChuyenTrangThaiPhieuXuLy(
					phieuXuLy, DuongBoConfigurationManager.getStrProp("dkdc.vietlao.Gui.duyet", "Gui.duyet"), userId, quyTrinhThuTucId, null);
			log.info("---------------dichChuyenTrangThaiPhieuXuLy==" + dichChuyenTrangThaiPhieuSuLy);
			
			httpReq.setRenderParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
			httpReq.setRenderParameter(Constants.MA_THU_TUC_HANH_CHINH, String.valueOf(maThuTucHanhChinh));
			httpReq.setRenderParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
			httpReq.setRenderParameter(Constants.ID_QUY_TRINH_THU_TUC, String.valueOf(quyTrinhThuTucId));
			httpReq.setRenderParameter(Constants.ID_PHIEU_XU_LY, String.valueOf(phieuXuLyId));
			
			PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
			
		} catch (Exception e) {
			log.error(e);
		}
	}
	
	private String makeNoiDungXmlStandard(String noiDungXml) {
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
	//test
	public void canBoDichChuyenTrangThaiDynamic(ActionRequest actionRequest, ActionResponse httpReq) {
		try {
			
			log.info("================vao canBoDichChuyenTrangThaiDynamic=====");
			long hoSoThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_HO_SO_THU_TUC);
			long quyTrinhThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_QUY_TRINH_THU_TUC);
			long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
			long idThuTucHanhChinh = ParamUtil.getLong(actionRequest, Constants.ID_THU_TUC_HANH_CHINH);
			long userId = PortalUtil.getUserId(actionRequest);
			String keyDichChuyen = ParamUtil.getString(actionRequest, "keyDichChuyen");
			String tenTaiLieu = ParamUtil.getString(actionRequest, "tenTaiLieuFm");
			String userIdXuLy = ParamUtil.getString(actionRequest, "userIdXuLy");
			long idTaiLieu = ParamUtil.getLong(actionRequest, "idFileFm");
			String[] tenTaiLieuFms = ParamUtil.getParameterValues(actionRequest, "tenTaiLieuFms");
			String[] idFileFms = ParamUtil.getParameterValues(actionRequest, "idFileFms");
			String[] idPTFm = ParamUtil.getParameterValues(actionRequest, "idPTFm");
			MotCuaPhieuXuLy phieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLy(phieuXuLyId);
			long trangThaiHienTaiFixed = phieuXuLy.getTrangThaiHienTaiId();
			long dichChuyenTrangThaiPhieuSuLy =
				motCuaBusiness.dichChuyenTrangThaiPhieuXuLy(
					phieuXuLy, keyDichChuyen, userId, quyTrinhThuTucId, null);
			log.info("---------------dichChuyenTrangThaiPhieuXuLy==" + dichChuyenTrangThaiPhieuSuLy);
			
			if(dichChuyenTrangThaiPhieuSuLy>0){
				HttpServletRequest httpRequest = PortalUtil.getHttpServletRequest(actionRequest);
				//send HS to doanh nghiep
				ServiceContext context;
				context = ServiceContextFactory.getInstance(actionRequest);
				Message message = new Message();
				message.put("dichChuyenTrangThaiPhieuSuLy", dichChuyenTrangThaiPhieuSuLy);
				message.put("phieuXuLyId", phieuXuLyId);
				message.put("hoSoThuTucId", hoSoThuTucId);
				message.put("quyTrinhThuTucId", quyTrinhThuTucId);
				message.put("idThuTucHanhChinh", idThuTucHanhChinh);
				message.put("userId", userId);
				message.put("tenTaiLieu", tenTaiLieu);
				message.put("idTaiLieu", idTaiLieu);
				message.put("trangThaiHienTaiFixed", trangThaiHienTaiFixed);
				message.put("keyDichChuyen", keyDichChuyen);
				message.put("userIdXuLy", userIdXuLy);
				message.put("tenTaiLieuFms", tenTaiLieuFms);
				message.put("idFileFms", idFileFms);
				message.put("idPTFm", idPTFm);
				message.put("filePath", vn.dtt.duongbo.report.ReportUtils.getTemplateReportFilePath(httpRequest));
				MessageBusUtil.sendMessage("destination/thread/trahoso/HSTraDoanhNghiepThread",message);
				
			}
			
			httpReq.setRenderParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
			httpReq.setRenderParameter(Constants.ID_QUY_TRINH_THU_TUC, String.valueOf(quyTrinhThuTucId));
			httpReq.setRenderParameter(Constants.ID_PHIEU_XU_LY, String.valueOf(phieuXuLyId));
			
			PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
		} catch (Exception e) {
			log.error(e);
		}
	}
	public void xemTruocNoiDungCongVan(ActionRequest actionRequest, ActionResponse httpReq) {
		try {
			log.info("================vao`xemTruocNoiDungCongVan=====");
			long hoSoThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_HO_SO_THU_TUC);
			long quyTrinhThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_QUY_TRINH_THU_TUC);
			long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
			long userId = PortalUtil.getUserId(actionRequest);
			String thuTucHanhChinhId = ParamUtil.getString(actionRequest, Constants.ID_THU_TUC_HANH_CHINH);
			String keyKetQuaThamTra = ParamUtil.getString(actionRequest, "keyKetQuaThamTra");
			String ngayHieuLucInput = ParamUtil.getString(actionRequest, "ngayHieuLucInput");
			String lyDoBoSung = ParamUtil.getString(actionRequest, "lyDoBoSung");
			String jspPage =  ParamUtil.getString(actionRequest, "jspPageSuccess");
			//String thongTinXuLy = ParamUtil.getString(actionRequest, Constants.id)
			String maTTHC = "";
			long orgUser = -1;
			int id = -1;
			orgUser = OrganizationLocalServiceUtil.getUserOrganizations(userId).get(0).getOrganizationId();
			OEPUserMgtWorkingUnit ettOEPWorkingUnit = OEPUserMgtWorkingUnitLocalServiceUtil.fetchByF_organizationId(""+orgUser);
			OEPUserMgtWorkingUnit ettOEPWorkingUnitParent = OEPUserMgtWorkingUnitLocalServiceUtil.fetchOEPUserMgtWorkingUnit(ettOEPWorkingUnit.getParentWorkingUnitId());
			TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
			DnDoanhNghiep ettNguoiLamThuTuc = DnDoanhNghiepLocalServiceUtil.fetchDnDoanhNghiep(hoSoThuTuc.getNguoiLamThuTucId());
			String kinhGui = StringPool.BLANK;
			
			log.info("-------------------------ettNguoiLamThuTuc:"+ ettNguoiLamThuTuc + "-----------hoSoThuTuc: "+hoSoThuTuc);
			if(Validator.isNotNull(ettNguoiLamThuTuc)){
				kinhGui = ettNguoiLamThuTuc.getLoaiNguoiLamThuTuc().equals("1")?ettNguoiLamThuTuc.getTenDoanhNghiep():ettNguoiLamThuTuc.getTenCongDan();
				
				
			}
			String[] lstTenGiayTo = ParamUtil.getParameterValues(actionRequest, "tenThanhPhanHoSo", new String[]{});
		//	TthcThanhPhanHoSo thanhPhanHoSo =null ;
			QlvtKiemTraHoSo qlvtKiemTraHoSo = null;
			QlvtNoiDungThamTra noiDungThamTra = null;
			TthcThuTucHanhChinh thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(Long.valueOf("0"+thuTucHanhChinhId));
			maTTHC = thuTucHanhChinh.getMaThuTuc();
			QlvtTTHCNoiDungThamTra qlvttthcnoiDungThamTra = QlvtTTHCNoiDungThamTraLocalServiceUtil.findByF_MaTTHC(maTTHC);
			List<QlvtNoiDungThamTra> lstNoiDungThamTra = new ArrayList<QlvtNoiDungThamTra>();
			//TODO
			if(Validator.isNotNull(qlvttthcnoiDungThamTra)){
				lstNoiDungThamTra = QlvtNoiDungThamTraLocalServiceUtil.findByF_tthcNoiDungThamTraId(Integer.valueOf("0"+qlvttthcnoiDungThamTra.getId()));
			} 
			String idThanhPhanHoSo ="";
			String lydo ="";
			String ketQuaxml="";
			Class<?> clazz = Class.forName("vn.dtt.duongbo.maudon.model."+Constants.PDF_MAPPING_XSD.get(Constants.PDF_MAPPING.get(keyKetQuaThamTra)));
			Object obj = clazz.newInstance();
			log.info("================objobjobjobj====="+obj);
			log.info("================keyKetQuaThamTra====="+keyKetQuaThamTra);
			if(keyKetQuaThamTra.equalsIgnoreCase("CVYCBS")){
				CongVanYCBSHoSoDeNghiCapPHBH mauDon = new CongVanYCBSHoSoDeNghiCapPHBH();
				List<CongVanYCBSHoSoDeNghiCapPHBH.DanhSach> listDanhSach = new ArrayList<CongVanYCBSHoSoDeNghiCapPHBH.DanhSach>();
				
				if(Validator.isNotNull(lstNoiDungThamTra) && lstNoiDungThamTra.size()>0){
					QlvtThongTinHoSo ettHoSo = QlvtThongTinHoSoLocalServiceUtil.fetchByphieuXuLyId(phieuXuLyId);
					QlvtThongTinXuLy ettXuLy = QlvtThongTinXuLyLocalServiceUtil.fetchBythongTinHoSoId(ettHoSo.getId());
					for(int i=0;i<lstNoiDungThamTra.size();i++){
						id = (int) CounterLocalServiceUtil.increment(QlvtKiemTraHoSo.class.getName());
						qlvtKiemTraHoSo = QlvtKiemTraHoSoLocalServiceUtil.createQlvtKiemTraHoSo(id); 
						qlvtKiemTraHoSo.setThongTinXuLyId(Integer.valueOf("0"+ettXuLy.getId()));
						noiDungThamTra = lstNoiDungThamTra.get(i);
						idThanhPhanHoSo = ParamUtil.getString(actionRequest,noiDungThamTra.getId()+"dat");
						lydo = ParamUtil.getString(actionRequest,noiDungThamTra.getId()+"lydo");
						log.info("================lydo====="+lydo);
						log.info("================idThanhPhanHoSo====="+idThanhPhanHoSo);
							if(Validator.isNotNull(idThanhPhanHoSo)){
								CongVanYCBSHoSoDeNghiCapPHBH.DanhSach danhSach = new CongVanYCBSHoSoDeNghiCapPHBH.DanhSach();
								danhSach.setIdThanhPhanHoSo(idThanhPhanHoSo);
								danhSach.setLyDo(lydo);
								listDanhSach.add(danhSach);
							}
							qlvtKiemTraHoSo.setIdNoiDungThamTra(Integer.valueOf("0"+noiDungThamTra.getId()));
							qlvtKiemTraHoSo.setYKienThamTra(lydo);
							QlvtKiemTraHoSoLocalServiceUtil.updateQlvtKiemTraHoSo(qlvtKiemTraHoSo);
	    				}
				}
				
				
			
				
				mauDon.setTenCongTy(kinhGui);
				mauDon.setTinhThanh(Validator.isNotNull(ettOEPWorkingUnitParent)?ettOEPWorkingUnitParent.getCityNo():"01");
				mauDon.setDanhSachs(listDanhSach);
				
				log.info("================mauDon====="+mauDon);
				
				//TODO insert nghiepvu_kiemtrahoso
				obj = obj.getClass().cast(mauDon);
				log.info("================obj123456====="+obj);
				
				
				
		
			}else if(keyKetQuaThamTra.equalsIgnoreCase("CVTCCGP")){
				CongVanTuChoiCapPHBH mauDon = new CongVanTuChoiCapPHBH();
				mauDon.setLyDoTuChoi(lyDoBoSung);
				mauDon.setTinhThanh(Validator.isNotNull(ettOEPWorkingUnitParent)?ettOEPWorkingUnitParent.getCityNo():"01");
				mauDon.setTenCongTy(kinhGui);
				obj = obj.getClass().cast(mauDon);
			}else{
				//TODO
				//set giá trị vào giấy phép cấp ra
				log.info("sassssss");
			}
			
			ketQuaxml = MauDonFactory.convertObjectToXml(obj);
			ketQuaxml = makeNoiDungXmlStandard(ketQuaxml);
			log.info("------ketquaxml--------------"+ketQuaxml);
			QlvtThongTinHoSo thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.fetchByphieuXuLyId(phieuXuLyId);
			if(thongTinHoSo!=null){
				QlvtThongTinXuLy qlvtThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil.fetchBythongTinHoSoId(Integer.valueOf("0"+thongTinHoSo.getId()));
				qlvtThongTinXuLy.setKetQuaThamDinhXML(ketQuaxml);
				log.info("------ketquaxml--------------"+ketQuaxml);
				qlvtThongTinXuLy.setKetQuaXuLy(keyKetQuaThamTra);
				if(lyDoBoSung != null){
					qlvtThongTinXuLy.setYKienCanBoXuLy(lyDoBoSung);
				}
				qlvtThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil.updateQlvtThongTinXuLy(qlvtThongTinXuLy);
				log.info(qlvtThongTinXuLy.getKetQuaThamDinhXML());
			}
			MotCuaPhieuXuLy phieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLy(phieuXuLyId);
			
			httpReq.setRenderParameter("jspPage", jspPage);
			httpReq.setRenderParameter("lstTenGiayTo", lstTenGiayTo);
			httpReq.setRenderParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
			httpReq.setRenderParameter(Constants.ID_QUY_TRINH_THU_TUC, String.valueOf(quyTrinhThuTucId));
			httpReq.setRenderParameter(Constants.ID_PHIEU_XU_LY, String.valueOf(phieuXuLyId));
			httpReq.setRenderParameter(Constants.ID_THU_TUC_HANH_CHINH, thuTucHanhChinhId);
			httpReq.setRenderParameter("keyKetQuaThamTra", keyKetQuaThamTra);
			actionRequest.setAttribute("lyDoBoSung", lyDoBoSung);
			PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
		} catch (Exception e) {
			log.error(e);
		}
	}
}
