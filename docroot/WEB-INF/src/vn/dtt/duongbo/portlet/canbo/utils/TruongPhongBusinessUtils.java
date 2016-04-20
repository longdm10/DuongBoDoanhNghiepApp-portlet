/**
 * 
 */
package vn.dtt.duongbo.portlet.canbo.utils;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;

import vn.dtt.duongbo.business.Constants;
import vn.dtt.duongbo.business.MotCuaBusiness;
import vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy;
import vn.dtt.duongbo.dao.motcua.service.MotCuaPhieuXuLyLocalServiceUtil;
import vn.dtt.duongbo.utils.config.DuongBoConfigurationManager;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.util.PortalUtil;

/**
 * @author binhnt
 * 
 */
public class TruongPhongBusinessUtils {
	
	private Log log = LogFactoryUtil.getLog(TruongPhongBusinessUtils.class);
	MotCuaBusiness motCuaBusiness = new MotCuaBusiness();
	
	public void duyetCapPhep(ActionRequest actionRequest, ActionResponse httpReq) {
		try {
			
			log.info("================vao`duyetCapPhep=====");
			long hoSoThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_HO_SO_THU_TUC);
			long quyTrinhThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_QUY_TRINH_THU_TUC);
			long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
			long userId = PortalUtil.getUserId(actionRequest);
			
	
			MotCuaPhieuXuLy phieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLy(phieuXuLyId);
			phieuXuLy.setNguoiXuLy(36683);
			MotCuaPhieuXuLyLocalServiceUtil.updateMotCuaPhieuXuLy(phieuXuLy);
			long dichChuyenTrangThaiPhieuSuLy = motCuaBusiness.dichChuyenTrangThaiPhieuXuLy(phieuXuLy, DuongBoConfigurationManager.getStrProp("dieukiendichchuyen.truong.phong.duyet.cap.phep", "Duyet.cap.phep"), userId, quyTrinhThuTucId, null);
			log.info("---------------dichChuyenTrangThaiPhieuXuLy==" + dichChuyenTrangThaiPhieuSuLy);
			
			httpReq.setRenderParameter(Constants.ID_HO_SO_THU_TUC,String.valueOf(hoSoThuTucId));
			httpReq.setRenderParameter(Constants.ID_QUY_TRINH_THU_TUC,String.valueOf(quyTrinhThuTucId));
			httpReq.setRenderParameter(Constants.ID_PHIEU_XU_LY,String.valueOf(phieuXuLyId));
			
			PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// Cái này cho GPVT VIệt Trung - GiangVuong
	public void duyetCapPhepGPVTVietTrung(ActionRequest actionRequest, ActionResponse httpReq) {
		try {
			
			log.info("================vao`duyetCapPhepGPVTVietTrung----------=====");
			long hoSoThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_HO_SO_THU_TUC);
			long quyTrinhThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_QUY_TRINH_THU_TUC);
			long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
			long userId = PortalUtil.getUserId(actionRequest);
			
	
			MotCuaPhieuXuLy phieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLy(phieuXuLyId);
			phieuXuLy.setNguoiXuLy(36683);
			MotCuaPhieuXuLyLocalServiceUtil.updateMotCuaPhieuXuLy(phieuXuLy);
			long dichChuyenTrangThaiPhieuSuLy = motCuaBusiness.dichChuyenTrangThaiPhieuXuLy(phieuXuLy, DuongBoConfigurationManager.getStrProp("dkdc.viettrung.duyet.cap.phep", "Duyet.cap.phep"), userId, quyTrinhThuTucId, null);
			log.info("---------------dichChuyenTrangThaiPhieuXuLy==" + dichChuyenTrangThaiPhieuSuLy);
			
			httpReq.setRenderParameter(Constants.ID_HO_SO_THU_TUC,String.valueOf(hoSoThuTucId));
			httpReq.setRenderParameter(Constants.ID_QUY_TRINH_THU_TUC,String.valueOf(quyTrinhThuTucId));
			httpReq.setRenderParameter(Constants.ID_PHIEU_XU_LY,String.valueOf(phieuXuLyId));
			
			PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e);
		}
	}
	
	//-------------VIET LAO -----------------
	public void duyetCapPhepVietLao(ActionRequest actionRequest, ActionResponse httpReq) {
		try {
			
			log.info("======VIET LAO==========vao`duyetCapPhepVietLao=====");
			long hoSoThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_HO_SO_THU_TUC);
			long quyTrinhThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_QUY_TRINH_THU_TUC);
			long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
			long userId = PortalUtil.getUserId(actionRequest);
			
	
			MotCuaPhieuXuLy phieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLy(phieuXuLyId);
			phieuXuLy.setNguoiXuLy(36683);
			MotCuaPhieuXuLyLocalServiceUtil.updateMotCuaPhieuXuLy(phieuXuLy);
			long dichChuyenTrangThaiPhieuSuLy = motCuaBusiness.dichChuyenTrangThaiPhieuXuLy(phieuXuLy, DuongBoConfigurationManager.getStrProp("dkdc.vietlao.duyet.cap.phep", "Duyet.cap.phep"), userId, quyTrinhThuTucId, null);
			log.info("---------------dichChuyenTrangThaiPhieuXuLy==" + dichChuyenTrangThaiPhieuSuLy);
			
			httpReq.setRenderParameter(Constants.ID_HO_SO_THU_TUC,String.valueOf(hoSoThuTucId));
			httpReq.setRenderParameter(Constants.ID_QUY_TRINH_THU_TUC,String.valueOf(quyTrinhThuTucId));
			httpReq.setRenderParameter(Constants.ID_PHIEU_XU_LY,String.valueOf(phieuXuLyId));
			
			PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e);
		}
	}
	
	public void duyetTuChoi(ActionRequest actionRequest, ActionResponse httpReq) {
		try {
			
			log.info("================vao`duyetCapPhep=====");
			long hoSoThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_HO_SO_THU_TUC);
			long quyTrinhThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_QUY_TRINH_THU_TUC);
			long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
			long userId = PortalUtil.getUserId(actionRequest);
			
	
			MotCuaPhieuXuLy phieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLy(phieuXuLyId);
			
			long dichChuyenTrangThaiPhieuSuLy = motCuaBusiness.dichChuyenTrangThaiPhieuXuLy(phieuXuLy, DuongBoConfigurationManager.getStrProp("dieukiendichchuyen.truong.phong.duyet.tu.choi", "Duyet.tu.choi"), userId, quyTrinhThuTucId, null);
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
	
	// Duyệt từ chối giấy phép vận tại việt trung
	public void duyetTuChoiGPVTVietTrung(ActionRequest actionRequest, ActionResponse httpReq) {
		try {
			
			log.info("================vao`duyetTuChoiGPVTVietTrung--=====");
			long hoSoThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_HO_SO_THU_TUC);
			long quyTrinhThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_QUY_TRINH_THU_TUC);
			long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
			long userId = PortalUtil.getUserId(actionRequest);
			MotCuaPhieuXuLy phieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLy(phieuXuLyId);
			long dichChuyenTrangThaiPhieuSuLy = motCuaBusiness.dichChuyenTrangThaiPhieuXuLy(phieuXuLy, DuongBoConfigurationManager.getStrProp("dkdc.viettrung.duyet.tu.choi", "Duyet.tu.choi"), userId, quyTrinhThuTucId, null);
			log.info("---------------dichChuyenTrangThaiPhieuXuLy==" + dichChuyenTrangThaiPhieuSuLy);
			httpReq.setRenderParameter(Constants.ID_HO_SO_THU_TUC,String.valueOf(hoSoThuTucId));
			httpReq.setRenderParameter(Constants.ID_QUY_TRINH_THU_TUC,String.valueOf(quyTrinhThuTucId));
			httpReq.setRenderParameter(Constants.ID_PHIEU_XU_LY,String.valueOf(phieuXuLyId));
			
			PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e);
		}
	}
	
	//-----------------VIET LAO ------------------------------------
	public void duyetTuChoiVietLao(ActionRequest actionRequest, ActionResponse httpReq) {
		try {
			
			log.info("=====VIET LAO===========vao`duyetTuChoiVietLao=====");
			long hoSoThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_HO_SO_THU_TUC);
			long quyTrinhThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_QUY_TRINH_THU_TUC);
			long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
			long userId = PortalUtil.getUserId(actionRequest);
			
	
			MotCuaPhieuXuLy phieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLy(phieuXuLyId);
			
			long dichChuyenTrangThaiPhieuSuLy = motCuaBusiness.dichChuyenTrangThaiPhieuXuLy(phieuXuLy, DuongBoConfigurationManager.getStrProp("dkdc.vietlao.duyet.tu.choi", "Duyet.tu.choi"), userId, quyTrinhThuTucId, null);
			log.info("---------------dichChuyenTrangThaiPhieuXuLy==" + dichChuyenTrangThaiPhieuSuLy);
			
			httpReq.setRenderParameter(Constants.ID_HO_SO_THU_TUC,String.valueOf(hoSoThuTucId));
			httpReq.setRenderParameter(Constants.ID_QUY_TRINH_THU_TUC,String.valueOf(quyTrinhThuTucId));
			httpReq.setRenderParameter(Constants.ID_PHIEU_XU_LY,String.valueOf(phieuXuLyId));
			
			PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e);
		}
	}
	
	public void duyetBoSung(ActionRequest actionRequest, ActionResponse httpReq) {
		try {
			
			log.info("================vao`duyetCapPhep=====");
			long hoSoThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_HO_SO_THU_TUC);
			long quyTrinhThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_QUY_TRINH_THU_TUC);
			long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
			long userId = PortalUtil.getUserId(actionRequest);
			
	
			MotCuaPhieuXuLy phieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLy(phieuXuLyId);
			
			long dichChuyenTrangThaiPhieuSuLy = motCuaBusiness.dichChuyenTrangThaiPhieuXuLy(phieuXuLy, DuongBoConfigurationManager.getStrProp("dieukiendichchuyen.truong.phong.duyet.bo.sung", "Duyet.bo.sung"), userId, quyTrinhThuTucId, null);
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
	// Cái này cho GPVT Việt Trung - GiangVuong
	public void duyetBoSungGPVTVietTrung(ActionRequest actionRequest, ActionResponse httpReq) {
		try {
			
			log.info("================vao`---------duyetBoSungGPVTVietTrung----------------=====");
			long hoSoThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_HO_SO_THU_TUC);
			long quyTrinhThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_QUY_TRINH_THU_TUC);
			long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
			long userId = PortalUtil.getUserId(actionRequest);
			
	
			MotCuaPhieuXuLy phieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLy(phieuXuLyId);
			
			long dichChuyenTrangThaiPhieuSuLy = motCuaBusiness.dichChuyenTrangThaiPhieuXuLy(phieuXuLy, DuongBoConfigurationManager.getStrProp("dkdc.viettrung.duyet.bo.sung", "Duyet.bo.sung"), userId, quyTrinhThuTucId, null);
			log.info("---------------dichChuyenTrangThaiPhieuXuLy==" + dichChuyenTrangThaiPhieuSuLy);
			
			httpReq.setRenderParameter(Constants.ID_HO_SO_THU_TUC,String.valueOf(hoSoThuTucId));
			httpReq.setRenderParameter(Constants.ID_QUY_TRINH_THU_TUC,String.valueOf(quyTrinhThuTucId));
			httpReq.setRenderParameter(Constants.ID_PHIEU_XU_LY,String.valueOf(phieuXuLyId));
			
			PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e);
		}
	}
	
	
	//--------------------------VIET LAO ------------------------------
	public void duyetBoSungVietLao(ActionRequest actionRequest, ActionResponse httpReq) {
		try {
			
			log.info("================vao`duyetBoSungVietLao=====");
			long hoSoThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_HO_SO_THU_TUC);
			long quyTrinhThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_QUY_TRINH_THU_TUC);
			long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
			long userId = PortalUtil.getUserId(actionRequest);
			
	
			MotCuaPhieuXuLy phieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLy(phieuXuLyId);
			
			long dichChuyenTrangThaiPhieuSuLy = motCuaBusiness.dichChuyenTrangThaiPhieuXuLy(phieuXuLy, DuongBoConfigurationManager.getStrProp("dkdc.vietlao.duyet.bo.sung", "Duyet.bo.sung"), userId, quyTrinhThuTucId, null);
			log.info("---------------dichChuyenTrangThaiPhieuXuLy==" + dichChuyenTrangThaiPhieuSuLy);
			
			httpReq.setRenderParameter(Constants.ID_HO_SO_THU_TUC,String.valueOf(hoSoThuTucId));
			httpReq.setRenderParameter(Constants.ID_QUY_TRINH_THU_TUC,String.valueOf(quyTrinhThuTucId));
			httpReq.setRenderParameter(Constants.ID_PHIEU_XU_LY,String.valueOf(phieuXuLyId));
			
			PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e);
		}
	}
	
	public void yeuCauThamXetLai(ActionRequest actionRequest, ActionResponse httpReq) {
		try {
			
			log.info("================vao`duyetCapPhep=====");
			long hoSoThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_HO_SO_THU_TUC);
			long quyTrinhThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_QUY_TRINH_THU_TUC);
			long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
			long userId = PortalUtil.getUserId(actionRequest);
			
	
			MotCuaPhieuXuLy phieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLy(phieuXuLyId);
			
			long dichChuyenTrangThaiPhieuSuLy = motCuaBusiness.dichChuyenTrangThaiPhieuXuLy(phieuXuLy, DuongBoConfigurationManager.getStrProp("dieukiendichchuyen.truong.phong.yeu.cau.tham.xet.lai", "Yeu.cau.tham.xet.lai"), userId, quyTrinhThuTucId, null);
			log.info("---------------dichChuyenTrangThaiPhieuXuLy==" + dichChuyenTrangThaiPhieuSuLy);
			
			httpReq.setRenderParameter(Constants.ID_HO_SO_THU_TUC,String.valueOf(hoSoThuTucId));
			httpReq.setRenderParameter(Constants.ID_QUY_TRINH_THU_TUC,String.valueOf(quyTrinhThuTucId));
			httpReq.setRenderParameter(Constants.ID_PHIEU_XU_LY,String.valueOf(phieuXuLyId));
			
			PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// Yêu cầu thẩm xét lại GPVT Việt trung - GiangVuong
	public void yeuCauThamXetLaiGPVTVietTrung(ActionRequest actionRequest, ActionResponse httpReq) {
		try {
			
			log.info("================vao`duyetCapPhep=====");
			long hoSoThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_HO_SO_THU_TUC);
			long quyTrinhThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_QUY_TRINH_THU_TUC);
			long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
			long userId = PortalUtil.getUserId(actionRequest);
			
	
			MotCuaPhieuXuLy phieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLy(phieuXuLyId);
			
			long dichChuyenTrangThaiPhieuSuLy = motCuaBusiness.dichChuyenTrangThaiPhieuXuLy(phieuXuLy, DuongBoConfigurationManager.getStrProp("dkdc.viettrung.Yeu.cau.tham.xet.lai", "Yeu.cau.tham.xet.lai"), userId, quyTrinhThuTucId, null);
			log.info("---------------dichChuyenTrangThaiPhieuXuLy==" + dichChuyenTrangThaiPhieuSuLy);
			
			httpReq.setRenderParameter(Constants.ID_HO_SO_THU_TUC,String.valueOf(hoSoThuTucId));
			httpReq.setRenderParameter(Constants.ID_QUY_TRINH_THU_TUC,String.valueOf(quyTrinhThuTucId));
			httpReq.setRenderParameter(Constants.ID_PHIEU_XU_LY,String.valueOf(phieuXuLyId));
			
			PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e);
		}
	}
	
	//-----------------VIET LAO------------------------------
	public void yeuCauThamXetLaiVietLao(ActionRequest actionRequest, ActionResponse httpReq) {
		try {
			
			log.info("================vao`yeuCauThamXetLaiVietLao=====");
			long hoSoThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_HO_SO_THU_TUC);
			long quyTrinhThuTucId = ParamUtil.getLong(actionRequest, Constants.ID_QUY_TRINH_THU_TUC);
			long phieuXuLyId = ParamUtil.getLong(actionRequest, Constants.ID_PHIEU_XU_LY);
			long userId = PortalUtil.getUserId(actionRequest);
			
	
			MotCuaPhieuXuLy phieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.getMotCuaPhieuXuLy(phieuXuLyId);
			
			long dichChuyenTrangThaiPhieuSuLy = motCuaBusiness.dichChuyenTrangThaiPhieuXuLy(phieuXuLy, DuongBoConfigurationManager.getStrProp("dkdc.vietlao.yeu.cau.tham.xet.lai", "Yeu.cau.tham.xet.lai"), userId, quyTrinhThuTucId, null);
			log.info("---------------dichChuyenTrangThaiPhieuXuLy==" + dichChuyenTrangThaiPhieuSuLy);
			
			httpReq.setRenderParameter(Constants.ID_HO_SO_THU_TUC,String.valueOf(hoSoThuTucId));
			httpReq.setRenderParameter(Constants.ID_QUY_TRINH_THU_TUC,String.valueOf(quyTrinhThuTucId));
			httpReq.setRenderParameter(Constants.ID_PHIEU_XU_LY,String.valueOf(phieuXuLyId));
			
			PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			SessionMessages.add(actionRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e);
		}
	}
	
}
