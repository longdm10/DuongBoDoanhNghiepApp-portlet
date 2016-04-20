package vn.dtt.notifications;

import javax.portlet.ActionRequest;
import javax.portlet.PortletURL;
import javax.portlet.WindowState;

import vn.dtt.duongbo.utils.config.DuongBoConfigurationManager;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.notifications.BaseUserNotificationHandler;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.UserNotificationEvent;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;

public class DuongBoNotificationHandler extends BaseUserNotificationHandler {
public static final String PORTLET_ID = "doanhnghiepaction_WAR_DuongBoDoanhNghiepAppportlet";
	
	public DuongBoNotificationHandler() {
 
		setPortletId(vn.dtt.notifications.DuongBoNotificationHandler.PORTLET_ID);
 
	}
 
	@Override
	protected String getBody(UserNotificationEvent userNotificationEvent,
			ServiceContext serviceContext) throws Exception {
 
		JSONObject jsonObject = JSONFactoryUtil
				.createJSONObject(userNotificationEvent.getPayload());
 
		long yourCustomEntityId = jsonObject
				.getLong("yourCustomEntityId");
		long userId = jsonObject
				.getLong("userId");
		String bodyTextJson = jsonObject.getString("bodyText");
		String email = "";
		if(Validator.isNotNull(UserLocalServiceUtil.fetchUser(userId)))email=UserLocalServiceUtil.fetchUser(userId).getEmailAddress();
		String title = "<strong>"+DuongBoConfigurationManager.getStrProp("vn.notifications.title", "unknown") +" : "
				+ email
				+ "</strong>";
 
		String bodyText = "Some other text.";
		if(Validator.isNotNull(bodyTextJson))bodyText = bodyTextJson;
		LiferayPortletResponse liferayPortletResponse = serviceContext
				.getLiferayPortletResponse();
 
		PortletURL confirmURL = liferayPortletResponse.createActionURL(vn.dtt.notifications.DuongBoNotificationHandler.PORTLET_ID);
 
		confirmURL.setParameter(ActionRequest.ACTION_NAME, "doSomethingGood");
		confirmURL.setParameter("redirect", serviceContext.getLayoutFullURL());
		confirmURL.setParameter("yourCustomEntityId", String.valueOf(yourCustomEntityId));
		confirmURL.setParameter("userNotificationEventId", String.valueOf(userNotificationEvent.getUserNotificationEventId()));
		confirmURL.setWindowState(WindowState.NORMAL);
 
		PortletURL ignoreURL = liferayPortletResponse.createActionURL(vn.dtt.notifications.DuongBoNotificationHandler.PORTLET_ID);
		ignoreURL.setParameter(ActionRequest.ACTION_NAME, "cancelForExample");
		ignoreURL.setParameter("redirect", serviceContext.getLayoutFullURL());
		ignoreURL.setParameter("yourCustomEntityId", String.valueOf(yourCustomEntityId));
		ignoreURL.setParameter("userNotificationEventId", String.valueOf(userNotificationEvent.getUserNotificationEventId()));
		ignoreURL.setWindowState(WindowState.NORMAL);
 
		String body = StringUtil.replace(getBodyTemplate(), new String[] {
				"[$CONFIRM$]", "[$CONFIRM_URL$]", "[$IGNORE$]",
				"[$IGNORE_URL$]", "[$TITLE$]", "[$BODY_TEXT$]" }, new String[] {
				serviceContext.translate("approve"), confirmURL.toString(),
				serviceContext.translate("reject"), ignoreURL.toString(),
				title, bodyText });
		
		return body;
	}
 
	@Override
	protected String getLink(UserNotificationEvent userNotificationEvent,
			ServiceContext serviceContext) throws Exception {
 
		JSONObject jsonObject = JSONFactoryUtil
				.createJSONObject(userNotificationEvent.getPayload());
 
		long yourCustomEntityId = jsonObject
				.getLong("yourCustomEntityId");
		
		LiferayPortletResponse liferayPortletResponse = serviceContext
				.getLiferayPortletResponse();		
 
		PortletURL viewURL = liferayPortletResponse.createActionURL(vn.dtt.notifications.DuongBoNotificationHandler.PORTLET_ID);
		viewURL.setParameter(ActionRequest.ACTION_NAME, "showDetails");
		viewURL.setParameter("redirect", serviceContext.getLayoutFullURL());
		viewURL.setParameter("yourCustomEntityId", String.valueOf(yourCustomEntityId));
		viewURL.setParameter("userNotificationEventId", String.valueOf(userNotificationEvent.getUserNotificationEventId()));
		viewURL.setWindowState(WindowState.NORMAL);
		
		return viewURL.toString();
	}
 
	protected String getBodyTemplate() throws Exception {
		StringBundler sb = new StringBundler(5);
		sb.append("<div class=\"title\">[$TITLE$]</div><div ");
		sb.append("class=\"body\">[$BODY_TEXT$] <br/> <a class=\"btn btn-action ");
		sb.append("btn-success\" href=\"[$CONFIRM_URL$]\">[$CONFIRM$]</a>");
		sb.append("<a class=\"btn btn-action btn-warning\" href=\"");
		sb.append("[$IGNORE_URL$]\">[$IGNORE$]</a></div>");
		return sb.toString();
	}
 
}