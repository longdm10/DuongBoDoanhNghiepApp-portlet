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
		  	<button name="Thêm hành khách" ></button>
		  </div>
	  </fieldset>
</div>
<div>
	<table>
		<tr>
		</tr>
	</table>
</div>