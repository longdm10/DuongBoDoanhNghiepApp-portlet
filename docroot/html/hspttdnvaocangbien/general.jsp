<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="javax.portlet.WindowState"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.service.TempGeneralDeclarationLocalServiceUtil"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.model.impl.TempGeneralDeclarationImpl"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclaration"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%
String itemIdTemp = ParamUtil.getString(request, "id");
String tabs = ParamUtil.getString(request,"tabs1");
TempGeneralDeclaration tempGeneral = new TempGeneralDeclarationImpl();
if(!itemIdTemp.equals("")){
	tempGeneral = TempGeneralDeclarationLocalServiceUtil.getTempGeneralDeclaration(Long.valueOf(itemIdTemp));
}
PortletURL dialogUrl = renderResponse.createRenderURL();
dialogUrl.setParameter("jspPage", "/html/hspttdnvaocangbien/general_popup.jsp");
dialogUrl.setParameter("redirect", ParamUtil.getString(request, "redirect"));
dialogUrl.setParameter("tabs1", tabs);
dialogUrl.setParameter("id", itemIdTemp);
%>
 <%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>

 <div>
 	<a href="<%=dialogUrl.toString() %>"><input type="button"  value="Sửa bản khai" style="font-size:15px;color:white;background-color:#337ab7;height:30px;width: 150px;"/></a>
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
				<textarea rows="3" cols="50" name="<portlet:namespace />briefDescriptionOfTheCargo"  readonly="readonly"><%=tempGeneral.getBriefDescriptionOfTheCargo() %></textarea>
			</td>
		</tr>
		<tr>
			<td colspan="3">9. Ghi chú:
				<br/>
				Dung tích tàu : 1.00
				<br/>
				<textarea rows="3" cols="50" name="<portlet:namespace />grossTonnage" readonly="readonly"><%=tempGeneral.getGrossTonnage() %></textarea>
			</td>
		</tr>
	</table>
</div>