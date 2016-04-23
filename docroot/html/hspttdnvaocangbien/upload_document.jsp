<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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