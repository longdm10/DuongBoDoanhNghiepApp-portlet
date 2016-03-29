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
System.out.println("-------thong_tin_cong_Danview.jsp----userId: " +userId);
DnDoanhNghiepUser doanhNghiepUser = DnDoanhNghiepUserLocalServiceUtil.findByUserId(userId);

if(doanhNghiepUser != null){
	doanhNghiepId = doanhNghiepUser.getNguoiLamThuTucId();
	
	System.out.println("-------thong_tin_cong_Danview.jsp----doanhNghiepId: " +doanhNghiepId);
	DnDoanhNghiep dnDoanhNghiep=null;
	dnDoanhNghiep = DnDoanhNghiepLocalServiceUtil.fetchDnDoanhNghiep(doanhNghiepId);
	if(dnDoanhNghiep!=null){
		String maSoCongDan = dnDoanhNghiep.getMaSoCongDan();
		String gioiTinh = dnDoanhNghiep.getGioiTinh();
		String quocTich = dnDoanhNghiep.getQuocTich();
		String tenCongDan = dnDoanhNghiep.getTenCongDan();
		String textCapNgay = FormatData.parseDateToTringDDMMYYY(dnDoanhNghiep.getNgayCapCMND());
		String coQuanCap = dnDoanhNghiep.getNoiCapCMND();
		String soDienThoai = dnDoanhNghiep.getDienThoai();
		String email = dnDoanhNghiep.getEmail();
		String diaChi = dnDoanhNghiep.getDiaChi();
		
		System.out.println("-------thong_tin_cong_Danview.jsp----textCapNgay: " +textCapNgay);
		System.out.println("-------thong_tin_cong_Danview.jsp----coQuanCap: " +coQuanCap);
		System.out.println("-------thong_tin_cong_Danview.jsp----email: " +email);
		
		
		PortletURL backUrl = renderResponse.createRenderURL();
		backUrl.setParameter("jspPage", "html/hsdoanhnghiep/thongtinhoso/danhsach_dichvucong_tructuyen.jsp");
		
		PortletURL updateCongDan = renderResponse.createActionURL();
		updateCongDan.setParameter(ActionRequest.ACTION_NAME, "updateCongDan");
		
		%>
		<form action="<%=updateCongDan.toString()%>" name="myForm" id="myForm" method="POST">
			<section class="right">
			<h4 class="PL15 BGT BOB font14 col-xs-12" style="margin-bottom: 6px;">Xem thông tin công dân</h4>
				<div class="box">
					<input name="<portlet:namespace /><%=Constants.ID_DOANH_NGHIEP %>" type="hidden" id="<%=Constants.ID_DOANH_NGHIEP %>" class="egov-inputfield" value="<%=doanhNghiepId%>" />
					
					<div class="row"> 
						<label class="textlabel col-xs-2">Mã số doanh nghiệp:</label> 
						<div class="col-xs-10 PA0">
							<p class="col-xs-5">
								 <input type="text" id="maSoCongDan" name="maSoCongDan" value="<%=maSoCongDan %>" disabled class="form-control">
							</p>
							<label class="textlabel col-xs-2">Giới tính:</label>
							<p class="col-xs-5">
								 <input type="text" id="gioiTinh" name="gioiTinh" value="<%=gioiTinh %>" class="form-control" >
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
						<label class="textlabel col-xs-2">Quốc tịch:</label> 
						<p class="col-xs-10">
							 <input  type="text" id="quocTich" name="quocTich" value="<%=quocTich %>" class="form-control">
						</p>
					</div>
					
					<div class="row">
						<label class="textlabel col-xs-2">Tên công dân:</label> 
						<p class="col-xs-10">
							 <input  type="text" value="<%=tenCongDan %>" name="tenCongDan" class="form-control">
						</p>
					</div>
					
					<div class="row">
						<label class="textlabel col-xs-2">Địa chỉ:</label> 
						<p class="col-xs-10">
							 <input  type="text" value="<%=diaChi %>" name="diaChi" class="form-control">
						</p>
					</div>
					
					
					<div class="row">
						<label class="textlabel col-xs-2">Số điện thoại:</label> 
						<div class="col-xs-10 PA0">
							<p class="col-xs-6">
								<input  type="text" value="<%=soDienThoai %>" name="soDienThoai" id="soDienThoai" class="form-control" >
							</p>
							<label class="textlabel col-xs-1">Email:</label> 
							<p class="col-xs-5">
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
	