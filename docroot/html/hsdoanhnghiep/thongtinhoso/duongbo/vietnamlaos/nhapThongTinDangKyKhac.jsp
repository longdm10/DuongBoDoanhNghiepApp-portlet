<%@page import="com.liferay.portal.kernel.util.ArrayUtil"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<link type="text/css" href="<%=request.getContextPath()%>/js/jquery.keypad.package-1.5.1/jquery.keypad.css" rel="stylesheet">
<link type="text/css" href="<%=request.getContextPath()%>/js/jquery.keypad.package-1.5.1/jquery.keypad.alt.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.keypad.package-1.5.1/jquery.keypad.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/specialChar.js" ></script>


<%
	// Noi dung dk
%>

<!-- /html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamlaos/nhapThongTinDangKyKhac.jsp -->
<div id="div_uploadDocOther_<%=wildcard%>">
	<br/>			
	<fieldset style="border:1px solid #ccc; margin-left: 10px; margin-right: 10px; padding-left: 10px; padding-right: 10px; padding-bottom: 10px;">
		<div style="float: left; width: 48%; margin-right: 4%">
			<p class="spectex4" style="margin-top: 0">
				Tên thương mại <span style="color: red">*</span>:
			</p>
			<input type="text" id="textTenThuongMai_<%=wildcard%>" name="textTenThuongMai_<%=wildcard%>">
		</div>
		<div style="float: left; width: 48%">
			<p class="spectex4" style="margin-top: 0">
				Hàm lượng hoạt chất <span style="color: red">*</span>:
			</p>
			<input style="width:97%;" type="text" id="textThanhPhanHamLuongHC_<%=wildcard%>" name="textThanhPhanHamLuongHC_<%=wildcard%>">
		</div>
		<div style="float: left; width: 48%; margin-right: 4%">
			<p class="spectex4">
				Tác dụng của hóa chất, chế phẩm <span style="color: red">*</span>:
			</p>
			<input type="text" id="textTacDungHoaChatChePham_<%=wildcard%>" name="textTacDungHoaChatChePham_<%=wildcard%>">
		</div>
		<div style="float: left; width: 22%; margin-right: 4%">
			<p class="spectex4">
				Đơn vị tính <span style="color: red">*</span>:
			</p>
			<input type="text"  id="textDonViTinh_<%=wildcard%>" name="textDonViTinh_<%=wildcard%>">
		</div>
		<div style="float: left; width: 22%">
			<p class="spectex4">
				Số lượng <span style="color: red">*</span>:
			</p>
			<input style="width:93%;" type="text" id="textSoLuong_<%=wildcard%>" name="textSoLuong_<%=wildcard%>">
		</div>
		<div style="float: left; width: 100%">
			<p class="spectex4">
				Tên, địa chỉ nhà sản xuất <span style="color: red">*</span>:
			</p>
			<input style="width: 98.5%;margin-bottom: 10px;" type="text" id="textTenDiaChiNSX_<%=wildcard%>" name="textTenDiaChiNSX_<%=wildcard%>">
		</div>
		<p style="clear: both"></p>
		<table width="100%" align="center" border="0" class="egov-table-form" style="padding-left: 0px; padding-right: 0px;" >
			<tr>
				<td colspan="6">
					<img id="imgAddOther_<%=wildcard%>" onclick="func_addDmOther('<%=wildcard%>')"  class="hastipsy" style="display: inline;" 
							title="Click vào đây để thêm mới danh mục khác." src="<%=request.getContextPath()%>/img/icon_add.png"/>
					&nbsp;&nbsp;
					<img id="imgRemoveOther_<%=wildcard%>" onclick="func_removeDmOther('<%=wildcard%>')" class="hastipsy" style="display: inline;" 
							title="Click vào đây để loại bỏ danh mục khác này." src="<%=request.getContextPath()%>/img/icon_remove.png"/>
				</td>
			</tr>
		</table>
	</fieldset>
</div>	


<script>
	var idTenThuongMai = "" ;

//var count = document.getElementById("countOther").value;

	var count = document.getElementById("counterTTKhacBySp_TTKN").value;
	for (var i = 1; i < count + 2; i++) {
		idTenThuongMai = "#textTenThuongMai_TTKN_" + i;
		if ($(idTenThuongMai).length > 0) {
			$(idTenThuongMai).keypad({
				keypadOnly : false,
				layout : _specChar,
				prompt : _promptTitle
			});
		}
	}
</script>

