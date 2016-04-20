<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="javax.portlet.WindowState"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.service.TempGeneralDeclarationLocalServiceUtil"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.model.impl.TempGeneralDeclarationImpl"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclaration"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%
String itemIdTemp = ParamUtil.getString(request, "id");
TempGeneralDeclaration tempGeneral = new TempGeneralDeclarationImpl();
if(!itemIdTemp.equals("")){
	tempGeneral = TempGeneralDeclarationLocalServiceUtil.getTempGeneralDeclaration(Long.valueOf(itemIdTemp));
}
PortletURL dialogUrl = renderResponse.createRenderURL();
dialogUrl.setWindowState(LiferayWindowState.POP_UP);
dialogUrl.setParameter("jspPage", "/html/hspttdnvaocangbien/general_popup.jsp");
%>
<aui:script>

  function showPopup() {
  AUI().use( 'aui-io',
     'aui-dialog',
     function(A) {
     
     Liferay.Util.openWindow(
             {
                  dialog: {
                       centered: true,
                       destroyOnClose: true,
                      cache: false,
                      width: 500,
                       height: 300,
                      modal: true
                 },
                 title: 'Sample Popup',
                    id:'<portlet:namespace/>popUpDialog',            
                 uri:'<%=dialogUrl.toString()%>'
              });
              
              
              Liferay.provide(
                    window,
                    '<portlet:namespace/>closePopup',
                    function(popupIdToClose) {
                     var popupDialog = Liferay.Util.Window.getById(popupIdToClose);
                     popupDialog.destroy();
                    }, 
                    ['liferay-util-window']
               );

   });  
  }
 </aui:script>

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
			  		<td colspan="3"><input type="file" name="<portlet:namespace />file2" ></input></td>
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
		  	<input type="button" onclick="showPopup();" value="Sửa bản khai" style="font-size:15px;color:white;background-color:#337ab7;height:30px;width: 150px;"/>
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
				<textarea rows="6" cols="50"></textarea>
			</td>
		</tr>
	</table>
</div>