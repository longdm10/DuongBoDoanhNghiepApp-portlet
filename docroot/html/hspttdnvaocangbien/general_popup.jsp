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
<portlet:actionURL var="updateGeneralDocUrl" name="updateGeneralDoc">
</portlet:actionURL>
<div>
	<fieldset>
		  <legend style="font-size:15px;">Sửa thông tin bản khai</legend>
	  </fieldset>
</div>
<div>
	<table>
		<tr>
			<td>1. Tên tàu : <%=tempGeneral.getNameOfShip() %></td>
			<td rowspan="2">3. Cảng đến/rời
			<br/>  
			<%=tempGeneral.getPortOfArrivalCode() %></td>
			<td rowspan="2">4. Thời gian đến/rời <%=tempGeneral.getDateOfArrival() %></td>
		</tr>
		<tr>
			<td>2. Hô hiệu	</td>
		</tr>
		<tr>
			<td colspan="1">5. Tên thuyền trưởng : <%=tempGeneral.getNameOfMaster() %></td>
			<td colspan="2">6. Cảng rời cuối cùng/cảng đích: 
				<br/>
				<%=tempGeneral.getLastPortOfCallCode() %>
			</td>
		</tr>
		<tr>
			<td colspan="3">7. Tên vào địa chỉ liên lạc của đại lý (nếu có)
				<br/>
				<%=tempGeneral.getNameOfShipownersAgents()%>
				<br/>
				<%=tempGeneral.getShipAgencyAddress()%>
				<br/>
				Tel : <%=tempGeneral.getShipAgencyPhone()%> - Fax: <%=tempGeneral.getShipAgencyFax()%>
				<br/>
				Email : <%=tempGeneral.getShipAgencyEmail()%>
			</td>
		</tr>
		<tr>
			<td colspan="3">8. Số lượng và loại hàng hóa vận chuyển trên tàu
				<br/>
				<textarea rows="6" cols="50"></textarea>
			</td>
		</tr>
		<tr>
			<td colspan="3">9. Ghi chú:
				<br/>
				Dung tích tàu : 1.00
				<br/>
				<textarea rows="6" cols="50"></textarea>
			</td>
		</tr>
	</table>
</div>
<div style="text-align: center;">
  	<a href="<%=updateGeneralDocUrl.toString() %>"><input type="button"  value="Sửa bản khai" style="font-size:15px;color:white;background-color:#337ab7;height:30px;width: 150px;"/></a>
  	<a href="<%=backUrl.toString()%>"><input type="button"  value="Bỏ qua" style="font-size:15px;color:white;background-color:#337ab7;height:30px;width: 150px;"/></a> 
 </div>