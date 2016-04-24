<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.model.DmRankRating"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.service.DmRankRatingLocalServiceUtil"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.service.TempGeneralDeclarationLocalServiceUtil"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclaration"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.model.impl.TempGeneralDeclarationImpl"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
PortletURL backCrewwUrl = renderResponse.createRenderURL();
backCrewwUrl.setParameter("jspPage", "/html/hspttdnvaocangbien/edit_detail.jsp");
backCrewwUrl.setParameter("tabs1", tabsBack);
backCrewwUrl.setParameter("id", itemIdTemp);
List<DmRankRating> listRankCode = DmRankRatingLocalServiceUtil.getAllDmRankRating();
%>
<portlet:actionURL var="updateCrewUrl" name="updateCrew">
</portlet:actionURL>
<aui:form method="post" action="<%=updateCrewUrl.toString() %>">
	<div>
		<aui:input name="redirect" value="<%=backCrewwUrl.toString() %>" type="hidden"></aui:input>
		<aui:input name="currentUrl" value="<%=PortalUtil.getCurrentURL(request)%>" type="hidden"></aui:input>
		<aui:input name="id" type="hidden" value="<%=itemIdTemp%>"></aui:input>
		<aui:input name="familyName" label="Họ"  type="text">
			<aui:validator name="required" errorMessage="Họ không được để trống"></aui:validator>
		</aui:input>
		<aui:input name="givenName" label="Tên" type="text"></aui:input>
		<aui:select name="rankCode" label="Chức danh">
			<%for (DmRankRating rank : listRankCode  ){%>
				<aui:option value="<%=rank.getRankCode() %>"><%=rank.getRankNameVN() %></aui:option>
			<%}%>
		</aui:select>
		<aui:input name="" label="Số GCN khả năng chuyên muôn"></aui:input>
	</div>
	<div style="text-align: center;">
	  	<input type="submit"  value="Thêm mới thành viên" style="font-size:15px;color:white;background-color:#337ab7;height:30px;width: 150px;"/>
	  	<a href="<%=backCrewwUrl.toString()%>"><input type="button"  value="Bỏ qua" style="font-size:15px;color:white;background-color:#337ab7;height:30px;width: 150px;"/></a> 
	 </div>
 </aui:form>