package vn.dtt.duongbo.portlet.menucb;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletPreferences;
import javax.servlet.http.HttpSession;

import vn.dtt.duongbo.business.Constants;
import vn.dtt.duongbo.portlet.menu.MenuConfiguration;
import vn.dtt.duongbo.utils.Webkeys;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.PortletPreferencesFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class MenuCbAction
 */
public class MenuCbAction extends MVCPortlet {

private Log _log = LogFactoryUtil.getLog(MenuCbAction.class);
	
	public void changeMenu(ActionRequest resourceRequest, ActionResponse httpReq) {
		HttpSession httpSession = null;
		try {
			httpSession = PortalUtil.getHttpServletRequest(resourceRequest).getSession();
			String maPhanNhom = ParamUtil.getString(resourceRequest, Constants.MA_PHAN_NHOM_HO_SO);
			String loaiMenu = ParamUtil.getString(resourceRequest, Constants.LOAI_MENU);
			String jspPage = ParamUtil.getString(resourceRequest, "jspPage");
			String doanhNghiepKey = ParamUtil.getString(resourceRequest, "doanhNghiepKey");
			PortletPreferences resourcePrefs = PortletPreferencesFactoryUtil.getPortletSetup(resourceRequest);
			String url_doanh_nghiep = resourcePrefs.getValue(MenuConfiguration.TRANG_GOI_CLICK_DOANH_NGHIEP, "");
			_log.info("===maPhanNhom in MenuAction==:" + maPhanNhom);
			
			if (httpSession != null && maPhanNhom != null && maPhanNhom.trim().length() > 0) {
				httpSession.setAttribute(Constants.MA_PHAN_NHOM_HO_SO, maPhanNhom);
			}
			
			_log.info(jspPage+"===loaiMenu in MenuAction==:" + doanhNghiepKey+"//"+url_doanh_nghiep);
			
				_log.info("===vao` TRANG_MENU_CAN_BO TRANG_MENU_CAN_BO:---" + maPhanNhom);
				if(Validator.isNull(doanhNghiepKey)){
					httpReq.sendRedirect(jspPage);
				}else{
					httpReq.sendRedirect(PortalUtil.getPortalURL(resourceRequest) + url_doanh_nghiep);
				}
			
		} catch (Exception es) {
			es.printStackTrace();
		}
		
		PortletConfig portletConfig = (PortletConfig) resourceRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(resourceRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}
}
