<%@page import="javax.portlet.PortletURL"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.service.TempGeneralDeclarationLocalServiceUtil"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.model.impl.TempGeneralDeclarationImpl"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclaration"%>
<%
String itemIdTemp = ParamUtil.getString(request, "id");
String tabs = ParamUtil.getString(request,"tabs1");
TempGeneralDeclaration tempGeneral = new TempGeneralDeclarationImpl();
if(!itemIdTemp.equals("")){
	tempGeneral = TempGeneralDeclarationLocalServiceUtil.getTempGeneralDeclaration(Long.valueOf(itemIdTemp));
}
PortletURL dialogInfo = renderResponse.createRenderURL();
dialogInfo.setParameter("jspPage", "/html/hspttdnvaocangbien/info_popup.jsp");
dialogInfo.setParameter("redirect", ParamUtil.getString(request, "redirect"));
dialogInfo.setParameter("tabs1", tabs);
dialogInfo.setParameter("id", itemIdTemp);
%>
 <div>
 	<a href="<%=dialogInfo.toString() %>"><input type="button"  value="Sửa thông báo" style="font-size:15px;color:white;background-color:#337ab7;height:30px;width: 150px;"/></a>
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
			<td>5. Mớn nước thực tế</td>
			<td colspan="2">6. Chiều cao tĩnh không (m)</td>
		</tr>
		<tr>
			<td colspan="3">7. Tên thuyền trưởng : <%=tempGeneral.getNameOfMaster() %></td>
		</tr>
		<tr>
			<td colspan="3">8. Tên vào địa chỉ liên lạc của đại lý (nếu có)
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
			<td colspan="3">9. Mục đích đến cảng</td>
		</tr>
		<tr>
			<td colspan="3">10. Số lượng và loại hàng hóa vận chuyển trên tàu</td>
		</tr>
		<tr>
			<td colspan="3">11. Hàng hóa gây nguy hiểm nếu có</td>
		</tr>
		<tr>
			<td>12. Số thuyền viên
				<br/>
				<%=tempGeneral.getNumberOfCrew()%>
			</td>
			<td colspan="2">13. Số hành khách
				<br/>
				<%=tempGeneral.getNumberOfPassengers() %>
			</td>
		</tr>
		<tr>
			<td colspan="3">14. Mã giấy phép rời cảng điện tử</td>
		</tr>
	</table>
</div>