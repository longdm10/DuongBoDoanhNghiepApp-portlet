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
<%@page import="vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepUserLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser"%>
<%@page import="vn.dtt.duongbo.utils.format.*" %>
<%@page import="vn.dtt.duongbo.business.Constants" %>
<%@page import="java.sql.Date"%>
<%@page import="java.util.List"%>
<%@ include file="/html/init.jsp"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>

<%
long userId = 0;
long doanhNghiepId = 0;
userId = PortalUtil.getUserId(request);
DnDoanhNghiepUser doanhNghiepUser = DnDoanhNghiepUserLocalServiceUtil.findByUserId(userId);
if(doanhNghiepUser != null){
	doanhNghiepId = doanhNghiepUser.getNguoiLamThuTucId();
	DnDoanhNghiep dnDoanhNghiep=null;
	dnDoanhNghiep = DnDoanhNghiepLocalServiceUtil.fetchDnDoanhNghiep(doanhNghiepId);

	if(dnDoanhNghiep!=null){
		String soDangKyKinhDoanh = dnDoanhNghiep.getSoDangKyKinhDoanh();
		String tenDoanhNghiep = dnDoanhNghiep.getTenDoanhNghiep();
		String textCapNgay = FormatData.parseDateToTringDDMMYYY(dnDoanhNghiep.getNgayDangKi());
		System.out.print("------------dnDoanhNghiep.getNgayDangKi()------------"+textCapNgay);
		String coQuanCap = dnDoanhNghiep.getCoQuanCapDkKd();
		String soDienThoaiNguoiDaiDien = dnDoanhNghiep.getDienThoai();
		String soDienThoai = dnDoanhNghiep.getDienThoai();
		String nguoiDaiDien = dnDoanhNghiep.getNguoiDaiDien();
		String chucVu =dnDoanhNghiep.getChucVuNguoiDaiDien();
		String email = dnDoanhNghiep.getEmail();
		String tenDoanhNghiepTiengAnh =dnDoanhNghiep.getTenTiengAnh();
		String tenDoanhNghiepVietTat = dnDoanhNghiep.getTenVietTat();
		String diaChi = dnDoanhNghiep.getDiaChi();
		String fax = dnDoanhNghiep.getFax();
		String webSite = "";
		String maSoDoanhNghiep = dnDoanhNghiep.getMaSoDoanhNghiep();

		String selTinhBotton = dnDoanhNghiep.getMaTinhThanh();
		String selQuan = dnDoanhNghiep.getMaQuanHuyen();
		String selPhuong = dnDoanhNghiep.getMaPhuongXa();
		String loaiDoanhNghiep = dnDoanhNghiep.getLoaiDoanhNghiep();
		
		
		List<DmDataItem> allTinhThanh = DmDataItemLocalServiceUtil.findTinhThanh();
		List<DmDataItem> allQuanHuyen = DmDataItemLocalServiceUtil.findQuanHuyenByMaTinhThanh(selTinhBotton);
		List<DmDataItem> allPhuongXa = DmDataItemLocalServiceUtil.findPhuongXaByMaTinhThanMaQuanHuyen(selTinhBotton, selQuan);
		
		
		PortletURL backUrl = renderResponse.createRenderURL();
		backUrl.setParameter("jspPage", "html/hsdoanhnghiep/thongtinhoso/danhsach_dichvucong_tructuyen.jsp");
		
		
		PortletURL updateDoanhNghiep = renderResponse.createActionURL();
		updateDoanhNghiep.setParameter(ActionRequest.ACTION_NAME, "updateDoanhNghiep");
		
		%>
		<form action="<%=updateDoanhNghiep.toString()%>" name="myForm" id="myForm" method="POST">
			<section class="right">
			<h4 class="PL15 BGT BOB font14 col-xs-12" style="margin-bottom: 6px;">Xem thông tin doanh nghiệp</h4>
				<div class="box">
					<input name="<portlet:namespace /><%=Constants.ID_DOANH_NGHIEP %>" type="hidden" id="<%=Constants.ID_DOANH_NGHIEP %>" class="egov-inputfield" value="<%=doanhNghiepId%>" />
					<div class="row"> 
						<label class="textlabel col-xs-2">Mã số doanh nghiệp:</label> 
						<div class="col-xs-10 PA0">
							<p class="col-xs-5">
								<input type="text" id="maSoDoanhNghiep" name="maSoDoanhNghiep" value="<%=maSoDoanhNghiep %>" disabled class="form-control">
							</p>
							<label class="textlabel col-xs-2">Số đăng ký kinh doanh:</label>
							<p class="col-xs-5">
								<input type="text" id="soDangKyKinhDoanh" name="soDangKyKinhDoanh" value="<%=soDangKyKinhDoanh %>" disabled class="form-control">
							</p>
						</div>
					</div>
					
					<div class="row">
						<label class="textlabel col-xs-2">Ngày cấp:</label> 
						<div class="col-xs-10 PA0">
							<p class="col-xs-5">
								<input  value="<%=textCapNgay %>" type="text"  name="textCapNgay" disabled class="form-control">
							</p>
							<label class="textlabel col-xs-2">Cơ quan cấp:</label> 
							<p class="col-xs-5">
								 <input type="text" value="<%=coQuanCap %>" name="coQuanCap" disabled class="form-control">
							</p>
						</div>
					</div>
					
					<div class="row">
						<label class="textlabel col-xs-2">Tên doanh nghiệp:</label> 
						<p class="col-xs-10">
							<input  type="text" value="<%=tenDoanhNghiep %>" name="tenDoanhNghiep" class="form-control">
						</p>
					</div>
					
					<div class="row">
						<label class="textlabel col-xs-2">Tên tiếng anh:</label> 
						<p class="col-xs-10">
							<input type="text" value="<%=tenDoanhNghiepTiengAnh %>" name="tenDoanhNghiepTiengAnh" class="form-control">
						</p>
					</div>
					
					
					<div class="row">
						<label class="textlabel col-xs-2">Tên viết tắt:</label> 
						<p class="col-xs-10">
							 <input type="text" value="<%=tenDoanhNghiepVietTat %>" name="tenDoanhNghiepVietTat" class="form-control">
						</p>
					</div>
					
					<div class="row">
						<label class="textlabel col-xs-2">Loại hình doanh nghiệp:</label> 
						<p class="col-xs-10">
							 <input type="text" value="<%=loaiDoanhNghiep %>" name="loaiDoanhNghiep" disabled class="form-control">
						</p>
					</div>
					
					
					<div class="row">
						<label class="textlabel col-xs-2">Địa chỉ:</label> 
						<p class="col-xs-10">
						<input type="text" value="<%=diaChi %>" name="diaChi" class="form-control">
						</p>
					</div>
									
									
					<div class="row">
						<label class="textlabel col-xs-2" style="visibility:hidden">Địa chỉ:</label> 
						<div class="col-xs-10 PA0">
							<div class="col-xs-4">
								<label class="">Tỉnh/Thành phố <span class="red">*</span></label>
								<select class="form-control" style="width:80%;float:left;" id="selTinhThanhBotton" name="selTinhThanhBotton" onchange="onchangeSelTinhThanh('<%=false%>')">
									<option value=""> -- Chọn Tỉnh/Thành Phố -- </option>
									<% for (DmDataItem item : allTinhThanh) {
									%>
										<option value="<%=item.getCode()%>" <%=item.getCode().equals(selTinhBotton) ? "selected='selected'" : ""%>><%=item.getName()%></option>
									<% } %>
								</select>
							</div>
							<div class="col-xs-4 PA0">
								<label class="">Quận/Huyện<span class="red">*</span></label>
								<select class="form-control" style="float:left;width:85%;margin-left: -5%;" id="selQuanHuyen" name="selQuanHuyen" onchange="onchangeSelQuanHuyen()" >
									<option value=""> -- Chọn Quận/Huyện -- </option>
									<%	if(allQuanHuyen != null && allQuanHuyen.size() > 0){ 
											for (DmDataItem item : allQuanHuyen) {
											%>
												<option value="<%=item.getCode()%>" <%=item.getCode().equalsIgnoreCase(selQuan) ? "selected='selected'" : ""%>><%=item.getName()%></option>
										<% } 
										}
										%>
								</select>
							</div>
							<div class="col-xs-4">
								<label class="">Phường/Xã <span class="red">*</span></label>
								<select class="form-control" style="width:98%;float:left;" id="selPhuongXa" name="selPhuongXa">
									<option value=""> -- Chọn Phường/Xã -- </option>
									<%	if(allPhuongXa != null && allPhuongXa.size() > 0){ 
											for (DmDataItem item : allPhuongXa) {
											%>
												<option value="<%=item.getCode()%>" <%=item.getCode().equalsIgnoreCase(selPhuong) ? "selected='selected'" : ""%>><%=item.getName()%></option>
										<% } 
										}
										%>
								</select>
							</div>
						</div>
					</div>				
					
					<div class="row" style="margin-top: 10px;">
						<label class="textlabel col-xs-2">Người đại diện:</label>
						<p class="col-xs-10">
							 <input type="text" value="<%=nguoiDaiDien %>" name="nguoiDaiDien" class="form-control">
						</p>
					</div>
					
					
					<div class="row">
						<label class="textlabel col-xs-2">Chức vụ:</label>
						<p class="col-xs-10">
							<input  type="text" value="<%=chucVu %>" name="chucVu" class="form-control">
						</p>
					</div>
					
					<div class="row">
						<label class="textlabel col-xs-2">Số điện thoại:</label> 
						<div class="col-xs-10 PA0">
							<p class="col-xs-3">
								<input  type="text" value="<%=soDienThoai %>" name="soDienThoai" id="soDienThoai" class="form-control" >
							</p>
							<label class="textlabel col-xs-1">Fax:</label> 
							<p class="col-xs-3">
								 <input  type="text" value="<%=fax %>" name="fax" id="fax" class="form-control" >
							</p>
							<label class="textlabel col-xs-1">Email:</label> 
							<p class="col-xs-4">
								<input  type="text" value="<%=email %>" disabled name="email" class="form-control">
							</p>
						</div>
					</div>		
					
					<div class="row" style="margin-top:30px">
						<button class="btn btn-sm btn-primary" type="button" onclick="javascript: document.location.href='home'" >Quay lại</button>
						<button class="btn btn-sm btn-primary" type="submit">Cập nhật</button>
					</div>
				</div>
			</section>
		</form>
		<%
	}
}

%>
<portlet:resourceURL var="updateContentURL" ></portlet:resourceURL>

<script>
function summitForm(url) {
		document.getElementById('myForm').action = url;
		document.getElementById('myForm').submit();
	}
function onchangeSelTinhThanh(isTinhTop) {
	if(isTinhTop.trim() == 'true'){
		$("select#selTinhThanhBotton").val($("select#selTinhThanhTop").val());
	}
	var code = $("select#selTinhThanhBotton").val();
	console.log('==onchangeSelTinhThanh==' + code);
	
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
			console.log('(2)==onchangeSelTinhThanh==success==' + data);
			
			//preferred
			//var data2 = JSON.parse(data);
			//console.log(data2);
			
			var select = $('#selQuanHuyen');
			select.find('option').remove();
			
			$('<option>').val("").text("-- Chọn quận huyện --").appendTo(select);
			$.each(data, function(idx, obj) {
				console.log(obj);
				$('<option>').val(obj.code).text(obj.name).appendTo(select);
			});
		},
		beforeSend : function(data) {
			console.log("(1)==onchangeSelTinhThanh==beforeSend==" + data);
		},
		complete : function(data) {
			console.log("(3)==onchangeSelTinhThanh==complete==" + data);
		},
		error : function(data) {
			console.log("(2)==onchangeSelTinhThanh==error==" + data);
		}
	});
}

function onchangeSelQuanHuyen() {
	var codeTinh = $("select#selTinhThanhBotton").val();
	var codeQuan = $("select#selQuanHuyen").val();
	
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
			console.log('(2)==onchangeSelQuanHuyen==success==' + data);
			
			//preferred
			//var data2 = JSON.parse(data);
			//console.log(data2);
			
			var select = $('#selPhuongXa');
			select.find('option').remove();
			
			$('<option>').val("").text("-- Chọn phường xã --").appendTo(select);
			$.each(data, function(idx, obj) {
				console.log(obj);
				$('<option>').val(obj.code).text(obj.name).appendTo(select);
			});
		},
		beforeSend : function(data) {
			console.log("(1)==onchangeSelQuanHuyen==beforeSend==" + data);
		},
		complete : function(data) {
			console.log("(3)==onchangeSelQuanHuyen==complete==" + data);
		},
		error : function(data) {
			console.log("(2)==onchangeSelQuanHuyen==error==" + data);
		}
	});
}

	
</script>
	