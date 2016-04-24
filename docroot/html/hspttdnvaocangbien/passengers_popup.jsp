<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.service.TempGeneralDeclarationLocalServiceUtil"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclaration"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.model.impl.TempGeneralDeclarationImpl"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:defineObjects />
<liferay-theme:defineObjects />
<%
String itemIdTemp = ParamUtil.getString(request, "id");
String tabsBack = ParamUtil.getString(request,"tabs1");
TempGeneralDeclaration tempGeneral = new TempGeneralDeclarationImpl();
if(!itemIdTemp.equals("")){
	tempGeneral = TempGeneralDeclarationLocalServiceUtil.getTempGeneralDeclaration(Long.valueOf(itemIdTemp));
}
PortletURL backPasengersUrl = renderResponse.createRenderURL();
backPasengersUrl.setParameter("jspPage", "/html/hspttdnvaocangbien/edit_detail.jsp");
backPasengersUrl.setParameter("tabs1", tabsBack);
backPasengersUrl.setParameter("id", itemIdTemp);
%>
<portlet:actionURL var="updatePassengersUrl" name="updatePassengers">
</portlet:actionURL>
<aui:form method="post" action="<%=updatePassengersUrl.toString() %>">
	<div>
		<aui:input name="redirect" value="<%=backPasengersUrl.toString() %>" type="hidden"></aui:input>
		<aui:input name="currentUrl" value="<%=PortalUtil.getCurrentCompleteURL(request)%>" type="hidden"></aui:input>
		<aui:input name="id" type="hidden" value="<%=itemIdTemp %>"></aui:input>
		<aui:input name="familyName" label="Họ"  type="text">
			<aui:validator name="required" errorMessage="Họ không được để trống"></aui:validator>
		</aui:input>
		<aui:input name="givenName" label="Tên" type="text"></aui:input>
		<br/>
		Ngày Sinh
		<liferay-ui:input-date name="birthDay" yearValue="1980"
						disableNamespace="<%=false%>" disabled="false" dayParam="dobDay"
						 monthParam="dobMonth"
						yearParam="dobYear" />
		<aui:input name="birthPlace" label="Nơi sinh"></aui:input>
		<aui:input name="serialNumberOfIdentity" label="Số hộ chiếu"></aui:input>
	</div>
	<div style="text-align: center;">
	  	<input type="submit"  value="Thêm mới hành khách" style="font-size:15px;color:white;background-color:#337ab7;height:30px;width: 200px;"/>
	  	<a href="<%=backPasengersUrl.toString()%>"><input type="button"  value="Bỏ qua" style="font-size:15px;color:white;background-color:#337ab7;height:30px;width: 150px;"/></a> 
	 </div>
 </aui:form>