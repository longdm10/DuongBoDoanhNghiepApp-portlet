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

<%@ include file="/html/init.jsp"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>

<%
	String type = ParamUtil.getString(request, "type");
	if(type.equalsIgnoreCase("1")){
		%>
			<div class="dktc">
				<p class="p-head">Thông báo đăng ký thành công</p>
				<div class="p-content">
					<p>Cảm ơn quý doanh nghiệp đã đăng ký tài khoản trên hệ thống Dịch vụ Công !</p><br>
					<p>Tài khoản của doanh nghiệp sẽ được cán bộ quản trị hệ thống xem xét và kích hoạt!</p>
					<p>Thông tin kích hoạt sẽ được gửi tới tài khoản email của bạn. Xin vui lòng mở email để biết thêm chi tiết.</p>
					<input type="button" onclick="location.href='/'" value="Thoát"/>
				</div>
			</div>
		<%
	}else if(type.equalsIgnoreCase("2")){
		%>
			<div class="dktc">
				<p class="p-head">Thông báo đăng ký thành công</p>
				<div class="p-content">
					<p>Bạn đã đăng ký tài khoản thành công</p>
					<p>Thông tin đăng nhập đã được gửi tới tài khoản email của bạn. Xin vui lòng mở email để kích hoạt tài khoản.</p>
					<input type="button" onclick="location.href='/'" value="Thoát"/>
				</div>
			</div>
		<%
	}
	
%>


<style>
/* Thong bao dang ky thanh cong */
.dktc {border: 1px solid #000000; }
.dktc .p-head {border-bottom: 1px solid black; background-color: #ccc; text-transform: uppercase; text-align: center; padding: 10px; font-weight: bold}
.dktc .p-content {background-color: white; text-align: center; padding: 20px 15px}
.dktc .p-content p {margin-bottom: 10px;}
.dktc .p-content button {border: 1px solid #ccc; background-color: #efefef; padding: 4px 12px; margin-top: 20px}
</style>
	