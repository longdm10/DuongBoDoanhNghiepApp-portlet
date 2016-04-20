package vn.dtt.duongbo.portlet.menucb;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletPreferences;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vn.dtt.duongbo.business.Constants;
import vn.dtt.duongbo.portlet.menu.MenuConfiguration;
import vn.dtt.duongbo.utils.Webkeys;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
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
public class ExampleAction extends MVCPortlet {

private Log _log = LogFactoryUtil.getLog(ExampleAction.class);
	
	public void addItemAjaxCall(ActionRequest actionRequest, ActionResponse actionResponse){
	    String itemName = ParamUtil.getString(actionRequest, "itemName");
	    System.out.println("Item Submitted: " + itemName);
	    JSONObject jsonMessageObject = JSONFactoryUtil.createJSONObject();
	    jsonMessageObject.put("status", Boolean.FALSE);
	    HttpServletResponse httpResponse = PortalUtil.getHttpServletResponse(actionResponse);
	    httpResponse.setContentType("text");
	    try {
			httpResponse.getWriter().print(itemName);
			httpResponse.flushBuffer();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}
	public void addItemURLTransaction(ActionRequest actionRequest, ActionResponse actionResponse){
//		try {
//			_log.info("addItemURLTransaction");
//			//table qlvt_capphuhieu + qlvt_phuongtiencapphuhieu
//			//create function on localserviceImpl
//			//call function from QLVTCapPhuHieuLocalServiceImpl
////			QLVTCapPhuHieu qlvtCapPhuHieu = new QLVTCapPhuHieuImpl();
////			//set value to qlvtCapPhuHieu
////			QLVTPhuongTienCapPhuHieu qlvtPhuongTienCapPhuHieu = new QLVTPhuongTienCapPhuHieuImpl();
////			//set value to qlvtPhuongTienCapPhuHieu
////			QLVTCapPhuHieuLocalServiceUtil.addDataTransaction(qlvtCapPhuHieu, qlvtPhuongTienCapPhuHieu);
//			sendCustomRedirect(actionRequest, actionResponse);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (PortalException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SystemException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	private void sendCustomRedirect(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException {

		if (!SessionErrors.isEmpty(actionRequest)) {
			String errorURL = ParamUtil.getString(actionRequest, "onpageError");
			SessionMessages
					.add(actionRequest,
							PortalUtil.getPortletId(actionRequest)
									+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);

			if (Validator.isNotNull(errorURL)) {
				actionResponse.sendRedirect(errorURL);
			}
		} else {
			String successURL = ParamUtil.getString(actionRequest, "onpageSuccess");
			SessionMessages
					.add(actionRequest,
							PortalUtil.getPortletId(actionRequest)
									+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);

			if (Validator.isNotNull(successURL)) {
				actionResponse.sendRedirect(successURL);
			}
		}
	}
}
