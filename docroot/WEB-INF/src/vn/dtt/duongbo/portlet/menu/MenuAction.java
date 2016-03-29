
package vn.dtt.duongbo.portlet.menu;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletPreferences;
import javax.servlet.http.HttpSession;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.PortletPreferencesFactoryUtil;

import vn.dtt.duongbo.business.Constants;
import vn.dtt.duongbo.portlet.DuongBoAction;

/**
 * Portlet implementation class MenuAction
 */
public class MenuAction extends DuongBoAction {
	
	private Log _log = LogFactoryUtil.getLog(MenuAction.class);
	
	public void changeMenu(ActionRequest resourceRequest, ActionResponse httpReq) {
		HttpSession httpSession = null;
		try {
			httpSession = PortalUtil.getHttpServletRequest(resourceRequest).getSession();
			String maPhanNhom = ParamUtil.getString(resourceRequest, Constants.MA_PHAN_NHOM_HO_SO);
			String loaiMenu = ParamUtil.getString(resourceRequest, Constants.LOAI_MENU);
			String keyInfo = ParamUtil.getString(resourceRequest, "keyInfo");
			String jspPage = ParamUtil.getString(resourceRequest, "jspPage");
			_log.info("===maPhanNhom in MenuAction==:" + maPhanNhom);
			
			if (httpSession != null && maPhanNhom != null && maPhanNhom.trim().length() > 0) {
				httpSession.setAttribute(Constants.MA_PHAN_NHOM_HO_SO, maPhanNhom);
			}
			
			PortletPreferences resourcePrefs = PortletPreferencesFactoryUtil.getPortletSetup(resourceRequest);
			
			String url_doanh_nghiep = resourcePrefs.getValue(MenuConfiguration.TRANG_GOI_CLICK_DOANH_NGHIEP, "");
			
//			String url_can_bo = resourcePrefs.getValue(MenuConfiguration.TRANG_GOI_CLICK_CAN_BO, "");
			
			String menu = resourcePrefs.getValue(MenuConfiguration.TRANG_MENU_CAN_BO, "");
			
			String url_tra_cuu = resourcePrefs.getValue(MenuConfiguration.TRANG_GOI_CLICK_TRA_CUU, "");
			String url_thong_ke = resourcePrefs.getValue(MenuConfiguration.TRANG_GOI_CLICK_THONG_KE, "");
			
//			if (MenuConfiguration.TRANG_MENU_CAN_BO.compareToIgnoreCase(menu) == 0) {
//				
//				if (MenuConfiguration.TRANG_GOI_CLICK_THONG_KE.compareToIgnoreCase(loaiMenu) == 0) {
//					_log.info("==changemanu:==" + PortalUtil.getPortalURL(resourceRequest) + url_thong_ke);
//					httpReq.sendRedirect(PortalUtil.getPortalURL(resourceRequest) + url_thong_ke);
//				} else if (MenuConfiguration.TRANG_GOI_CLICK_TRA_CUU.compareToIgnoreCase(loaiMenu) == 0) {
//					_log.info("==changemanu:==" + PortalUtil.getPortalURL(resourceRequest) + url_tra_cuu);
//					httpReq.sendRedirect(PortalUtil.getPortalURL(resourceRequest) + url_tra_cuu);
//				} else {
//					_log.info("==changemanu:==" + PortalUtil.getPortalURL(resourceRequest) + url_can_bo);
//					httpReq.sendRedirect(PortalUtil.getPortalURL(resourceRequest) + url_can_bo);
//				}
//				
//			} else
			
			if (MenuConfiguration.TRANG_MENU_DOANH_NGHIEP.compareToIgnoreCase(menu) == 0) {
				
				_log.info("==changemanu:==" + PortalUtil.getPortalURL(resourceRequest) + url_doanh_nghiep);
				if(Validator.isNotNull(keyInfo)){
					httpReq.sendRedirect(jspPage);
				}else{
					
				
					httpReq.sendRedirect(PortalUtil.getPortalURL(resourceRequest) + url_doanh_nghiep);
					
					if (MenuConfiguration.TRANG_GOI_CLICK_THONG_TIN_DOANH_NGHIEP.compareToIgnoreCase(loaiMenu) == 0) {
						_log.info("==changemanu:==" + PortalUtil.getPortalURL(resourceRequest) + "/group/doanh-nghiep/thongtin");
						httpReq.sendRedirect(PortalUtil.getPortalURL(resourceRequest) + "/group/doanh-nghiep/thongtin");
						
					} else if (MenuConfiguration.TRANG_GOI_CLICK_QUAN_LY_TAI_KHOAN_PHU.compareToIgnoreCase(loaiMenu) == 0) {
						_log.info("==changemanu:==" + PortalUtil.getPortalURL(resourceRequest) + "/group/doanh-nghiep/tai-khoan");
						httpReq.sendRedirect(PortalUtil.getPortalURL(resourceRequest) + "/group/doanh-nghiep/tai-khoan");
						
					} else {
						_log.info("==changemanu:==" + PortalUtil.getPortalURL(resourceRequest) + url_doanh_nghiep);
						httpReq.sendRedirect(PortalUtil.getPortalURL(resourceRequest) + url_doanh_nghiep);
					}
				}
			}
			
		} catch (Exception es) {
			es.printStackTrace();
		}
		
		PortletConfig portletConfig = (PortletConfig) resourceRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(resourceRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}
}
