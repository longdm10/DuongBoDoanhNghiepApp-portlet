<%--
/**
* Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
*
* This library is free software; you can redistribute it and/or modify it under
* the terms of the GNU Lesser General Public License as published by the Free
* Software Foundation; either version 2.1 of the License, or (at your option)
* any later version.
*
* This library is distributed in the hope that it will be useful, but WITHOUT
* ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
* FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
* details.
*/
--%>
<%@page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep"%>
<%@page import="java.sql.Date"%>
<%@page import="java.util.List"%>
<%@ include file="init.jsp"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>

<%@page import="vn.dtt.duongbo.utils.format.FormatData"%>

<style> 
	* {-webkit-box-sizing: border-box; -moz-box-sizing: border-box; box-sizing: border-box;}
	.container {padding-left:0; padding-right:0; min-width: 1000px; margin-left:auto; margin-right:auto}
	.red {color: red}
	.clear {clear:both}
	.content_here {margin: 20px auto; width: 1000px; line-height: 1.42857143; color: #333}
	.h3 {text-align: center; text-transform: uppercase; margin: 30px 0 45px; font-size: 24px; line-height: 1.1;}
	.button {padding: 0; width: 120px; font-size: 18px; border: none; height: 32px; margin: 25px 10px 0 0; text-transform: none; background-color: #134aa6; color: white; border-radius: 5px}
	.f_group {float: left}
	.f_group p {font-weight:bold; margin-bottom:10px}
	.f_group input[type="text"] {width: 100%; margin-bottom: 15px; padding:3px 5px}
	.f_group select {padding: 3px 10px}
</style>
<section class="right">
	<div class="box">
		<h4 class="title_right">Đổi mật khẩu</h4>
		
		<portlet:renderURL var="backURL">
			<portlet:param name="jspPage" value="/html/quanlydoanhnghiep/view.jsp" />
			<portlet:param name="defaultTab" value='<%= ParamUtil.getString(request, "defaultTab") %>' />
		</portlet:renderURL>
	<%
	long nguoiLamThuTucId = ParamUtil.getLong(request, Constants.ID_DOANH_NGHIEP);
	DnDoanhNghiep nguoiLamThuTuc = DnDoanhNghiepLocalServiceUtil.fetchDnDoanhNghiep(nguoiLamThuTucId);
	
	PortletURL updatePasswordURL = renderResponse.createActionURL();
	updatePasswordURL.setParameter(ActionRequest.ACTION_NAME, "updatePassword");
	updatePasswordURL.setParameter("backURL", backURL);
	
	if(nguoiLamThuTuc!=null){
		String email = nguoiLamThuTuc.getEmail();
		String tenNguoiDung = Validator.isNotNull(nguoiLamThuTuc.getTenDoanhNghiep()) ? HtmlUtil.escape(nguoiLamThuTuc.getTenDoanhNghiep()) : HtmlUtil.escape(nguoiLamThuTuc.getTenCongDan());
		
		PortletURL backUrl = renderResponse.createRenderURL();
		backUrl.setParameter("jspPage", "/html/quanlydoanhnghiep/view.jsp");
		
		%>
			<aui:form action="" name="myForm" id="myForm" method="POST">
				<input name="<portlet:namespace /><%=Constants.ID_DOANH_NGHIEP %>" type="hidden" id="<%=Constants.ID_DOANH_NGHIEP %>" class="egov-inputfield" value="<%=nguoiLamThuTucId%>" />
				<div class="f_group" style="width:100%;">
					<p>Tên tài khoản đăng nhập (email): <span class="red">*</span></p>
					<input name="tenTaiKhoan" type="text" id="tenTaiKhoan" class="egov-inputfield" value="<%=email%>" readonly="readonly" />
				</div>
				<div class="f_group" style="width:100%; ">
					<p>Tên người dùng <span class="red">*</span></p>
					<input style="width:100%; float:left; height:23px" type="text" id="tenNguoiDung" name="tenNguoiDung" readonly="readonly" value="<%=tenNguoiDung %>"  />
				</div>
				<div class="f_group" style="width:49%">
					<p>Mật khẩu: <span class="red">*</span></p>
					<input maxlength="200" min="1" name="<portlet:namespace />matKhau" id="<portlet:namespace />matKhau"  type="text" size="30" required="required" />
				</div>
		
				<div class="f_group" style="width:100%">
					<p>Nhập lại mật khẩu: <span class="red">*</span></p>
					<input maxlength="200" min="1" name="<portlet:namespace />nhapLaiMatKhau" id="<portlet:namespace />nhapLaiMatKhau"  type="text" size="30" required="required" />
				</div>
				
				<div class="f_group" style="width:100%">
					<p><i>Ghi chú: Những trường thông tin có dấu "<span class="red">*</span>" là bắt buộc</i></p>
				</div>
				
				<div style="clear:both"></div>
		
				<div style="margin-left:370px">
					<input type="button" class="btn btn-primary btn-sm" onclick="summitForm('<%=updatePasswordURL%>')" value="Cập nhật">
					<input type="button" class="btn btn-primary btn-sm" onclick="location.href='<%=backUrl %>'" value="Hủy bỏ">
				</div>
			</aui:form>
		<%
	}
	%>
	</div>
</section>

<script type="text/javascript">
	function summitForm(url) {
		var matKhau = $('#<portlet:namespace />matKhau');
		var nhapLaiMatKhau = $('#<portlet:namespace />nhapLaiMatKhau');
		
		if(matKhau.val() != nhapLaiMatKhau.val()) {
			alert('Mật khẩu nhập lại phải giống mật khẩu !');
		} else {
			document.getElementById('<portlet:namespace />myForm').action = url;
			document.getElementById('<portlet:namespace />myForm').submit();
		}
	}
	
</script>