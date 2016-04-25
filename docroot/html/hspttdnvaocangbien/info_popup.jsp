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
String redirect = ParamUtil.getString(request, "redirect");
PortletURL backUrl = renderResponse.createRenderURL();
backUrl.setParameter("jspPage", "/html/hspttdnvaocangbien/edit_detail.jsp");
backUrl.setParameter("tabs1", tabsBack);
backUrl.setParameter("id", itemIdTemp);
%>
<portlet:actionURL var="updateRemarksUrl" name="updateRemarks">
</portlet:actionURL>
<form name='<portlet:namespace/>fm' method="post" action="<%=updateRemarksUrl.toString()%>"> 
	<div>
		<input type="hidden" name='<portlet:namespace/>id' value="<%=itemIdTemp %>" />
		<input type="hidden" name='<portlet:namespace/>redirect' value="<%=backUrl.toString() %>" />
		<input type="hidden" name='<portlet:namespace/>currentUrl' value="<%=PortalUtil.getCurrentCompleteURL(request)%>" />
		<aui:input type="text" label="Thông báo" name="remarks"></aui:input>
	</div>
	<div style="text-align: center;">
	  	<input type="submit"  value="Sửa thông báo" style="font-size:15px;color:white;background-color:#337ab7;height:30px;width: 150px;"/>
	  	<a href="<%=backUrl.toString()%>"><input type="button"  value="Bỏ qua" style="font-size:15px;color:white;background-color:#337ab7;height:30px;width: 150px;"/></a> 
	 </div>
 </form>