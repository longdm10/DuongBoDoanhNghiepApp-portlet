<%@page import="vn.dtt.duongbien.dao.vrcb.service.TempGeneralDeclarationLocalServiceUtil"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.model.impl.TempGeneralDeclarationImpl"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclaration"%>
<%
String itemIdTemp = ParamUtil.getString(request, "id");
TempGeneralDeclaration tempGeneral = new TempGeneralDeclarationImpl();
if(!itemIdTemp.equals("")){
	tempGeneral = TempGeneralDeclarationLocalServiceUtil.getTempGeneralDeclaration(Long.valueOf(itemIdTemp));
}
%>
<div>
	<fieldset>
		  <legend style="font-size:15px;">Upload</legend>
		  <table>
			  	<tr>
			  		<td>Bản khai mẫu hồ sơ tải về</td>
			  		<td colspan="4">&nbsp;</td>
			  	</tr>
			  	<tr>
			  		<td>File</td>
			  		<td colspan="3"><input type="file" name="<portlet:namespace />file1" ></input></td>
			  		<td>import</td>
			  	</tr>
			  	<tr>
			  		<td>Trạng thái</td>
			  		<td>Thêm <input type="radio" name="doc_action" value="add"/></td>
			  		<td>Sửa <input type="radio" name="doc_action" value="edit"/></td>
			  		<td>Xóa <input type="radio" name="doc_action" value="delete"/></td>
			  		<td>&nbsp;</td>
			  	</tr>
		  </table>
	</fieldset>
</div>
<div>
	<fieldset>
		  <legend style="font-size:15px;">Thao tác</legend>
		  <div>
		  	<button name="Sửa thông báo" ></button>
		  </div>
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