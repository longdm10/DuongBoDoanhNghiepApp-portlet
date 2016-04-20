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
<%@page import="vn.dtt.duongbo.dangky.DangKyMessageErrors"%>
<%@page import="vn.dtt.duongbo.utils.CommonUtils"%>
<%@page import="java.util.List"%>
<%@ include file="init.jsp"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" language="java"%>

<link type="text/css" href="<%=request.getContextPath()%>/css/SpryTabbedPanels.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/SpryTabbedPanels.js"></script>

<%
int defaultTab = ParamUtil.getInteger(request, "defaultTab");
%>

<section class="right">
	<div class="box">
		<liferay-ui:error key="<%= DangKyMessageErrors.ERROR_ACTIVE %>" message="Có lỗi trong quá trình kích hoạt tài khoản"/>
		<liferay-ui:error key="<%= DangKyMessageErrors.USER_ALREADY_EXISTS %>" message="Địa chỉ email đã được đăng ký tài khoản"/>

		<div id="<portlet:namespace/>TabbedPanels1" class="TabbedPanels">
			<ul class="TabbedPanelsTabGroup">
				<li class="TabbedPanelsTab" tabindex="0">Quản lý tài khoản doanh nghiệp</li>
				<li class="TabbedPanelsTab" tabindex="1">Quản lý tài khoản công dân</li>
			</ul>
			<div class="TabbedPanelsContentGroup">
				<div class="TabbedPanelsContent">
					<liferay-util:include page="/html/quanlydoanhnghiep/view_doanhnghiep.jsp" servletContext="<%= application %>" />
				</div>
				
				<div class="TabbedPanelsContent">
					<liferay-util:include page="/html/quanlydoanhnghiep/view_congdan.jsp" servletContext="<%= application %>" />
				</div>
			</div>
		</div>
	</div>
</section>

<script type="text/javascript">
<!--
var TabbedPanels1 = new Spry.Widget.TabbedPanels("<portlet:namespace/>TabbedPanels1",{ defaultTab: <%= defaultTab %> });
//-->
</script>