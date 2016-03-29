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
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@page import="vn.dtt.duongbo.utils.CommonUtils"%>
<%@page import="com.liferay.portal.model.Organization"%>
<%@page import="com.liferay.portal.model.User"%>
<%@ include file="/html/init.jsp"%>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"
	language="java"%>
<h4 class="PL15 BGT BOB font14 col-xs-12">Tiếp nhận trực tiếp</h4>
<div class="P10 col-xs-12">
	<div class="BGT noidung">
		<h5 class="col-xs-12">
			<i class="pull-left fa fa-chevron-right fa-1"></i><b>Thông tin
				người nộp</b>
		</h5>
		<div class="col-xs-12">
			<label class="col-xs-2" for="sel1">Đối tượng nộp:</label>
			<div class="col-xs-10">
				<select id="sel1" class="form-control">

					<option>Hộ kinh doanh</option>
					<option>Doanh nghiệp</option>
					<option>Hợp tác xã</option>
				</select>
			</div>
		</div>
		<div class="col-xs-12">
			<label class="col-xs-2" for="sel1">Tên đầy đủ:</label>
			<div class="col-xs-4">
				<input type="text" placeholder="NGUYỄN VĂN A" class="form-control">
			</div>
			<label class="col-xs-2" for="sel1">Số CMND hoặc hộ chiếu:</label>
			<div class="col-xs-4">
				<input type="text" placeholder="0251463875" class="form-control">
			</div>
		</div>
		<div class="col-xs-12">
			<label class="col-xs-2" for="sel1">Số điện thoại:</label>
			<div class="col-xs-4">
				<input type="text" placeholder="0934554489" class="form-control">
			</div>
			<label class="col-xs-2" for="sel1">Email:</label>
			<div class="col-xs-4">
				<input type="text" placeholder="abc@gmai.com" class="form-control">
			</div>
		</div>
		<h5 class="col-xs-12">
			<i class="pull-left fa fa-chevron-right fa-1"></i><b>Thông tin hồ
				sơ</b>
		</h5>
		<div class="col-xs-12">
			<label class="col-xs-2" for="sel1">Tên thủ tục:</label>
			<div class="col-xs-10">
				<select id="sel1" class="form-control">
					<option>Cấp giấy phép kinh doanh vận tải bằng xe ô tô đối
						với Doanh nghiệp, Hợp tác xã</option>
					<option>Cấp giấy phép kinh doanh vận tải bằng xe ô tô đối
						với Hộ kinh doanh</option>

				</select>
			</div>
		</div>
		<div class="col-xs-12">
			<label class="col-xs-2" for="sel1">Nhận hồ sơ ngày:</label>
			<div class="col-xs-3">
				<div class="input-group">
					<input type="text" class="form-control"> <span
						class="input-group-addon"><i class="fa fa-calendar"></i></span>
				</div>
			</div>
			<label class="col-xs-2" for="sel1">Lúc:</label>
			<div class="col-xs-2">
				<input type="text" placeholder="08:30 sáng" class="form-control">
			</div>
		</div>
		<div class="col-xs-12">
			<label class="col-xs-2" for="sel1">Hẹn Trả hồ sơ ngày:</label>
			<div class="col-xs-3">
				<div class="input-group">
					<input type="text" class="form-control"> <span
						class="input-group-addon"><i class="fa fa-calendar"></i></span>
				</div>
			</div>
			<label class="col-xs-2" for="sel1">Lúc:</label>
			<div class="col-xs-2">
				<input type="text" placeholder="08:30 sáng" class="form-control">
			</div>
		</div>
		<div class="col-xs-12">
			<label class="col-xs-2" for="sel1">Số bộ hồ sơ:</label>
			<div class="col-xs-3">
				<input type="text" placeholder="08" class="form-control">
			</div>
			<label class="col-xs-2" for="sel1">Số ngày xử lý:</label>
			<div class="col-xs-2">
				<input type="text" placeholder="08" class="form-control">
			</div>
		</div>



		<!-- Thành phần hồ sơ -->
		<div class="col-xs-12">

			<table class="table table-striped table-bordered table-hover">
				<tr>
					<th>STT</th>
					<th>Tên giấy tờ</th>
					<th>Bản chính</th>
					<th>Bản sao công chứng</th>
					<th>Bản photo</th>
					<th>Số lượng</th>
				</tr>
				<tr>
					<td class="text-center">1</td>
					<td>Phương án kinh doanh</td>
					<td class="text-center"><input type="checkbox" value=""></td>
					<td class="text-center"><input type="checkbox" value=""></td>
					<td class="text-center"><input type="checkbox" value=""></td>
					<td class="text-center"><input type="text" placeholder="01"
						class="form-control"></td>
				</tr>
				<tr>
					<td class="text-center">2</td>
					<td>Chứng nhận an toàn về kỹ thuật và bảo vệ môi trường</td>
					<td class="text-center"><input type="checkbox" value=""></td>
					<td class="text-center"><input type="checkbox" value=""></td>
					<td class="text-center"><input type="checkbox" value=""></td>
					<td class="text-center"><input type="text" placeholder="01"
						class="form-control"></td>
				</tr>

			</table>
		</div>

		<div class="col-xs-12 form-group">
			<button class="btn btn-primary">Tiếp nhận</button>
			<button class="btn btn-primary">Nhập đơn</button>
			<button class="btn btn-primary">In giấy biên nhận</button>
		</div>
		<div class="clear"></div>
	</div>
</div>