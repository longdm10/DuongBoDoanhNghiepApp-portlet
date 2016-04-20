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

<%@page import="vn.dtt.duongbo.dangky.NguoiLamThuTucTerm"%>
<%@page import="vn.dtt.duongbo.dangky.DangKyMessageErrors"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Calendar"%>
<%@page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@page import="vn.dtt.duongthuy.business.DTConstants"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@ include file="/html/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/css/dangkydoanhnghiep/style.css?t=<%= System.currentTimeMillis() %>">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/dangkydoanhnghiep/datetimepicker.js?t=<%=System.currentTimeMillis()%>"></script>

<%
int defaultTab = ParamUtil.getInteger(request, "defaultTab");
%>

<liferay-ui:error key="<%= DangKyMessageErrors.EMPTY_TEN_DOANH_NGHIEP %>" message="Vui lòng nhập tên doanh nghiệp"/>
<liferay-ui:error key="<%= DangKyMessageErrors.EMPTY_TINH_THANH %>" message="Vui lòng chọn tỉnh/thành"/>
<liferay-ui:error key="<%= DangKyMessageErrors.EMPTY_QUAN_HUYEN %>" message="Vui lòng chọn quận/huyện"/>
<liferay-ui:error key="<%= DangKyMessageErrors.EMPTY_PHUONG_XA %>" message="Vui lòng chọn phường/xã"/>
<liferay-ui:error key="<%= DangKyMessageErrors.EMPTY_DIEN_THOAI %>" message="Vui lòng nhập điện thoại"/>
<liferay-ui:error key="<%= DangKyMessageErrors.EMPTY_EMAIL %>" message="Vui lòng nhập email"/>
<liferay-ui:error key="<%= DangKyMessageErrors.EMPTY_GIAY_CN_DKKD %>" message="Vui lòng nhập giấy CN ĐKKD"/>
<liferay-ui:error key="<%= DangKyMessageErrors.EMPTY_NGAY_CAP %>" message="Vui lòng nhập ngày cấp"/>
<liferay-ui:error key="<%= DangKyMessageErrors.EMPTY_CO_QUAN_CAP %>" message="Vui lòng nhập cơ quan cấp"/>
<liferay-ui:error key="<%= DangKyMessageErrors.EMPTY_TEN_CONG_DAN %>" message="Vui lòng nhập tên công dân"/>
<liferay-ui:error key="<%= DangKyMessageErrors.EMPTY_SO_CMND %>" message="Vui lòng nhập số CMND"/>
<liferay-ui:error key="<%= DangKyMessageErrors.EMPTY_NOI_CAP %>" message="Vui lòng nhập nơi cấp"/>
<liferay-ui:error key="<%= DangKyMessageErrors.USER_ALREADY_EXISTS %>" message="Địa chỉ email đã được đăng ký tài khoản"/>
<liferay-ui:error key="<%= DangKyMessageErrors.ERROR_REGISTER %>" message="Có lỗi xảy ra trong quá trình đăng ký !"/>

<div class="register-area">
	<div class="box-register">
		<div id="<portlet:namespace/>TabbedPanels1" class="TabbedPanels">
			<ul class="TabbedPanelsTabGroup">
				<li class="TabbedPanelsTab" tabindex="0">Đăng ký tài khoản doanh nghiệp</li>
				<li class="TabbedPanelsTab" tabindex="1">Đăng ký tài khoản cá nhân</li>
			</ul>
			<div class="TabbedPanelsContentGroup">
				<div class="TabbedPanelsContent">
					<liferay-util:include page="/html/dangkydoanhnghiep/edit_doanhnghiep.jsp" servletContext="<%= application %>" />
				</div>
				
				<div class="TabbedPanelsContent">
					<liferay-util:include page="/html/dangkydoanhnghiep/edit_congdan.jsp" servletContext="<%= application %>" />
				</div>
			</div>
		</div>
	</div>
	
	<div class="clear"></div>
</div>

<script type="text/javascript">
<!--
var TabbedPanels1 = new Spry.Widget.TabbedPanels("<portlet:namespace/>TabbedPanels1",{ defaultTab: <%= defaultTab %> });
//-->
</script>

<portlet:resourceURL var="updateContentURL"></portlet:resourceURL>

<script type="text/javascript">
	function onchangeSelTinhThanh(selTinhThanh, selQuanHuyen) {
		var tinhThanh = $("#"+selTinhThanh);
		var quanHuyen = $('#'+selQuanHuyen);
		
		if(tinhThanh.length > 0 && quanHuyen.length > 0) {
			var code = tinhThanh.val();
	
			if (code == '') { return; }
	
			$.ajax({
				url: '<%=updateContentURL%>',
				dataType : "json",
				data : {
					codeTinhThanh : code,
					type: 'findQuanHuyenByTinhThanh'
				},
				type : "get",
				success : function(data) {
					var select = quanHuyen;
					select.find('option').remove();
					
					$('<option>').val("").text("---Chọn---").appendTo(select);
					$.each(data, function(idx, obj) {
						console.log(obj);
						$('<option>').val(obj.code).text(obj.name).appendTo(select);
					});
				}
			});
		}
	}

	function onchangeSelQuanHuyen(selTinhThanh, selQuanHuyen, selPhuongXa) {
		var tinhThanh = $("#"+selTinhThanh);
		var quanHuyen = $('#'+selQuanHuyen);
		var phuongXa = $('#'+selPhuongXa);
		
		if(tinhThanh.length > 0 && quanHuyen.length > 0 && phuongXa.length > 0) {
		
			var codeTinh = tinhThanh.val();
			var codeQuan = quanHuyen.val();
			
			if (codeTinh == '' || codeQuan =='') 
				{ return; }
			
			$.ajax({
				url: '<%=updateContentURL%>',
				dataType : "json",
				data : {
					codeTinhThanh : codeTinh,
					codeQuanHuyen : codeQuan,
					type: 'findPhuongXaByQuanHuyen'
				},
				type : "get",
				success : function(data) {
					
					var select = phuongXa;
					select.find('option').remove();
					
					$('<option>').val("").text("---Chọn---").appendTo(select);
					$.each(data, function(idx, obj) {
						console.log(obj);
						$('<option>').val(obj.code).text(obj.name).appendTo(select);
					});
				}
			});
		}
	}
</script>

<style>
	img.calIcon {
		margin: -33px -0px 0 0 !important;
		border: 0px solid #a9a9a9 !important;
	}
	
	input.calInput {
		cursor: pointer !important;
		background: #FFF !important;
	}
</style>