package vn.dtt.duongbien;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletPreferences;
import javax.servlet.http.HttpSession;

import vn.dtt.duongbo.business.Constants;
import vn.dtt.duongbo.portlet.menu.MenuAction;
import vn.dtt.duongbo.portlet.menu.MenuConfiguration;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.PortletPreferencesFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class Menudb
 */
public class Menudb extends MVCPortlet {
 
	private Log _log = LogFactoryUtil.getLog(MenuAction.class);
	
	public void changeMenu(ActionRequest resourceRequest, ActionResponse httpReq) {
		HttpSession httpSession = null;
		try {
			httpSession = PortalUtil.getHttpServletRequest(resourceRequest).getSession();
			String menuid = ParamUtil.getString(resourceRequest, "menuid");
			String keyInfo = ParamUtil.getString(resourceRequest, "keyInfo");
			String jspPage = ParamUtil.getString(resourceRequest, "jspPage");
			String loaiMenu="";

			if(Validator.isNotNull(keyInfo)){
				httpReq.sendRedirect(jspPage);
			}
				
//			PortletPreferences resourcePrefs = PortletPreferencesFactoryUtil.getPortletSetup(resourceRequest);
//			String url_doanh_nghiep = resourcePrefs.getValue(MenuConfiguration.TRANG_GOI_CLICK_DOANH_NGHIEP, "");
//			String menu = resourcePrefs.getValue(MenuConfiguration.TRANG_MENU_CAN_BO, "");
//			
//			if (MenuConfiguration.TRANG_MENU_DOANH_NGHIEP.compareToIgnoreCase(menu) == 0) {
//
//				if(Validator.isNotNull(keyInfo)){
//					httpReq.sendRedirect(jspPage);
//				}else{
//					
//				
//					httpReq.sendRedirect(PortalUtil.getPortalURL(resourceRequest) + url_doanh_nghiep);
//					
//					if (MenuConfiguration.TRANG_GOI_CLICK_THONG_TIN_DOANH_NGHIEP.compareToIgnoreCase(loaiMenu) == 0) {
//						httpReq.sendRedirect(PortalUtil.getPortalURL(resourceRequest) + "/group/doanh-nghiep/thongtin");
//					} else if (MenuConfiguration.TRANG_GOI_CLICK_QUAN_LY_TAI_KHOAN_PHU.compareToIgnoreCase(loaiMenu) == 0) {
//						httpReq.sendRedirect(PortalUtil.getPortalURL(resourceRequest) + "/group/doanh-nghiep/tai-khoan");
//					} else {
//						httpReq.sendRedirect(PortalUtil.getPortalURL(resourceRequest) + url_doanh_nghiep);
//					}
//				}
//			}
			
		} catch (Exception es) {
			es.printStackTrace();
		}
		
		PortletConfig portletConfig = (PortletConfig) resourceRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(resourceRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}
	
}
