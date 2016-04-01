package vn.dtt.duongbien.ttphuongtientnd;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletPreferences;

import vn.dtt.duongbien.qlhsphuongtientndvaoracangbien.QLHSPhuongTienTNDVaoRaCangBien;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portlet.PortletPreferencesFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class TTPhuongTienTND
 */
public class TTPhuongTienTND extends MVCPortlet {
 

	private Log _log = LogFactoryUtil.getLog(TTPhuongTienTND.class);
	
	public void changeMenu(ActionRequest resourceRequest, ActionResponse httpReq) {

		try {
			String menuid = ParamUtil.getString(resourceRequest, "menuid");

			PortletPreferences resourcePrefs = PortletPreferencesFactoryUtil.getPortletSetup(resourceRequest);
			resourcePrefs.setValue("menuid", menuid);

		} catch (Exception es) {
			es.printStackTrace();
		}
		
		PortletConfig portletConfig = (PortletConfig) resourceRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(resourceRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}
}
