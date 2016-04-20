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
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepUserLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dangky.DangKyMessageErrors"%>
<%@page import="vn.dtt.duongbo.utils.CommonUtils"%>
<%@page import="java.util.List"%>
<%@ include file="init.jsp"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" language="java"%>

<% 
DnDoanhNghiepUser nguoiLamThuTucUser = DnDoanhNghiepUserLocalServiceUtil.findByUserId(themeDisplay.getUserId());
long nguoiLamThuTucId = nguoiLamThuTucUser.getNguoiLamThuTucId();
DnDoanhNghiep nguoiLamThuTuc = DnDoanhNghiepLocalServiceUtil.fetchDnDoanhNghiep(nguoiLamThuTucId);
%>

<link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/css/dangkydoanhnghiep/style.css?t=<%= System.currentTimeMillis() %>">
<h4 class="PL15 BGT BOB font14 col-xs-12">Cập nhật thông tin cá nhân</h4>

<div class="P10 col-xs-12">
	<div class="BGT noidung">
		<div class="register-area col-xs-12">
			<div class="box-register">
					
				<liferay-ui:error key="<%= DangKyMessageErrors.EMPTY_TINH_THANH %>" message="Vui lòng chọn tỉnh/thành"/>
				<liferay-ui:error key="<%= DangKyMessageErrors.EMPTY_QUAN_HUYEN %>" message="Vui lòng chọn quận/huyện"/>
				<liferay-ui:error key="<%= DangKyMessageErrors.EMPTY_PHUONG_XA %>" message="Vui lòng chọn phường/xã"/>
				<liferay-ui:error key="<%= DangKyMessageErrors.EMPTY_DIEN_THOAI %>" message="Vui lòng nhập điện thoại"/>
				<liferay-ui:error key="<%= DangKyMessageErrors.EMPTY_NGAY_CAP %>" message="Vui lòng nhập ngày cấp"/>
				<liferay-ui:error key="<%= DangKyMessageErrors.EMPTY_CO_QUAN_CAP %>" message="Vui lòng nhập cơ quan cấp"/>
				<liferay-ui:error key="<%= DangKyMessageErrors.EMPTY_TEN_CONG_DAN %>" message="Vui lòng nhập tên công dân"/>
				<liferay-ui:error key="<%= DangKyMessageErrors.EMPTY_SO_CMND %>" message="Vui lòng nhập số CMND"/>
				<liferay-ui:error key="<%= DangKyMessageErrors.EMPTY_NOI_CAP %>" message="Vui lòng nhập nơi cấp"/>
					
				<c:choose>
						
					<c:when test="<%= nguoiLamThuTuc != null && nguoiLamThuTuc.getLoaiNguoiLamThuTuc().equalsIgnoreCase(Constants.LOAI_NGUOI_LAM_THU_TUC_CD) %>">
						<liferay-util:include page="/html/hsdoanhnghiep/quanlythongtincanhan/edit_congdan.jsp" servletContext="<%= application %>" />
					</c:when>
					
					<c:when test="<%= nguoiLamThuTuc != null && nguoiLamThuTuc.getLoaiNguoiLamThuTuc().equalsIgnoreCase(Constants.LOAI_NGUOI_LAM_THU_TUC_DN) %>">
						<liferay-util:include page="/html/hsdoanhnghiep/quanlythongtincanhan/edit_doanhnghiep.jsp" servletContext="<%= application %>" />
					</c:when>
					
					<c:otherwise>
						<h3>Người dùng không tồn tại !</h3>
					</c:otherwise>
				</c:choose>
			</div>
		</div>
	</div>
</div>
