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
PortletURL backAttachfileUrl = renderResponse.createRenderURL();
backAttachfileUrl.setParameter("jspPage", "/html/hspttdnvaocangbien/edit_detail.jsp");
backAttachfileUrl.setParameter("tabs1", tabsBack);
backAttachfileUrl.setParameter("id", itemIdTemp);
%>
<portlet:actionURL var="updateAttachfileUrl" name="updateAttachfile">
</portlet:actionURL>
<aui:form method="post" action="<%=updateAttachfileUrl.toString() %>"></aui:form>
<div>
	<aui:input name="redirect" value="<%=backAttachfileUrl.toString() %>" type="hidden"></aui:input>
	<aui:input name="id" type="hidden" value="<%=itemIdTemp %>"></aui:input>
</div>
<div style="text-align: center;">
  	<a href="<%=updateAttachfileUrl.toString() %>"><input type="button"  value="Sửa bản khai" style="font-size:15px;color:white;background-color:#337ab7;height:30px;width: 150px;"/></a>
  	<a href="<%=backAttachfileUrl.toString()%>"><input type="button"  value="Bỏ qua" style="font-size:15px;color:white;background-color:#337ab7;height:30px;width: 150px;"/></a> 
 </div>