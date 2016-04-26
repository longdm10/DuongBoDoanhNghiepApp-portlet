<%@page import="vn.dtt.duongbien.dao.vrcb.service.TempCrewDetailsLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.util.PortalClassLoaderUtil"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.model.TempCrewDetails"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQuery"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="javax.portlet.WindowState"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="java.util.Calendar"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.model.DmPortWharf"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.model.DmPortHarbour"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.model.DmPort"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.model.DmPortRegion"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.service.DmPortWharfLocalServiceUtil"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.service.DmPortLocalServiceUtil"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.service.DmPortHarbourLocalServiceUtil"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.service.DmPortRegionLocalServiceUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ include file="/html/init.jsp"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<script type="text/javascript">
	function isNumberKey(evt){
	var charCode = (evt.which) ? evt.which : event.keyCode
	if (charCode > 31 && (charCode < 48 || charCode > 57))
		return false;
	return true;
	}
</script>
<%
String itemId = ParamUtil.getString(request, "id");
TempGeneralDeclaration tempGD = new TempGeneralDeclarationImpl();
if(!itemId.equals("")){
	tempGD = TempGeneralDeclarationLocalServiceUtil.getTempGeneralDeclaration(Long.valueOf(itemId));
}
String tabs1 = ParamUtil.getString(request, "tabs1", "info");
PortletURL portletURL = renderResponse.createRenderURL();
portletURL.setWindowState(WindowState.MAXIMIZED);
portletURL.setParameter("jspPage", "/html/hspttdnvaocangbien/edit_detail.jsp");
portletURL.setParameter("tabs1", tabs1);
portletURL.setParameter("id", itemId);
String tabsNames = "Thông báo,Thông tin chung,Danh sách thuyền viên,Danh sách hành khách,Gán quyền khai bổ sung,Danh sách tài liệu đính kèm";
String tabsValues = "Thông báo,Thông tin chung,Danh sách thuyền viên,Danh sách hành khách,Gán quyền khai bổ sung,Danh sách tài liệu đính kèm";
List listPortHabour = DmPortHarbourLocalServiceUtil.findByPortHarbourCode(tempGD.getPortHarbourCode());
DmPortHarbour tempPortHabour = null;
if(listPortHabour.size()>0)
	tempPortHabour = (DmPortHarbour)listPortHabour.get(0);

List listPortWharf = DmPortWharfLocalServiceUtil.findByPortWharfCode(tempGD.getPortWharfCode());
DmPortWharf tempPortWharf = null;
if(listPortWharf.size()>0)
	tempPortWharf = (DmPortWharf)listPortWharf.get(0);
%>
<form action="<%= portletURL.toString() %>" method="post" name="<portlet:namespace />fm">
<table width="100%">
	<tr>
		<td>
			<table>
				<tr>
					<td style="padding:10px 10px;">Tên hồ sơ :</td>
					<td style="padding:10px 10px;"><%=tempGD.getDocumentName() %></td>
					<td style="padding:10px 10px;">Tên tàu</td>
					<td style="padding:10px 10px;"><%=tempGD.getNameOfShip() %></td>
					<td style="padding:10px 10px;">Tên thuyền trưởng : </td>
					<td style="padding:10px 10px;"><%=tempGD.getNameOfMaster() %></td>
				</tr>
				<tr>
					<td style="padding:10px 10px;">Khu vực hàng hải :</td>
					<td><%=((DmPortRegion)(DmPortRegionLocalServiceUtil.findByPortRegionCode(tempGD.getPortRegionCode()).get(0))).getPortRegionNameVN() %></td>
					<td>Cảng đến/rời :</td>
					<td><%=((DmPort)DmPortLocalServiceUtil.findByPortCode(tempGD.getPortOfArrivalCode()).get(0)).getPortName() %></td>
					<td>Bến cảng :</td>
					<td><%=(tempPortHabour !=null) ? tempPortHabour.getPortHarbourNameVN() : "" %></td>
				</tr>
				<tr>
					<td style="padding:10px 10px;">Cầu cảng neo đậu :</td>
					<td><%=(tempPortWharf !=null) ? tempPortWharf.getPortWharfNameVN() : "" %></td>
					<td>Thời gian đến/rời :</td>
					<td><%=tempGD.getDateOfArrival() %></td>
					<td>Thời gian khai :</td>
					<td></td>
				</tr>
				<tr>
					<td style="padding:10px 10px;">Loại hồ sơ :<% %></td>
					<td><%= (tempGD.getIsArrival()==1) ? "Vào cảng" : "Ra cảng" %></td>
					<td>Số chuyến đi :</td>
					<td><%=tempGD.getVoyageNumber() %></td>
					<td>Người tạo :</td>
					<td><%=tempGD.getUserCreated() %></td>
				</tr>
			</table>
		</td>
	<tr>
		<td>
			<liferay-ui:tabs names="<%= tabsNames %>" url="<%= portletURL.toString() %>" tabsValues="tabsValues">
			 	<%@ include file="/html/hspttdnvaocangbien/upload_document.jsp" %>
				<liferay-ui:section>
					<%@ include file="/html/hspttdnvaocangbien/info.jsp" %>	
			    </liferay-ui:section>
			    <liferay-ui:section>
	     			 <%@ include file="/html/hspttdnvaocangbien/general.jsp" %>
				 </liferay-ui:section>
			    <liferay-ui:section>
			        <%@ include file="/html/hspttdnvaocangbien/crew.jsp" %>
			    </liferay-ui:section>
			     <liferay-ui:section>
			        <%@ include file="/html/hspttdnvaocangbien/passengers.jsp" %>
			    </liferay-ui:section>
			     <liferay-ui:section>
			        <%@ include file="/html/hspttdnvaocangbien/permission.jsp" %>
			    </liferay-ui:section>
			     <liferay-ui:section>
			        <%@ include file="/html/hspttdnvaocangbien/attachfile.jsp" %>
			    </liferay-ui:section>
			</liferay-ui:tabs>
		</td>
	</tr>
</table>
</form>
