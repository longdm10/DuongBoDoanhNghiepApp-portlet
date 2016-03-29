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
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.duongbo.dangky.DangKyMessageErrors"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="vn.dtt.duongthuy.business.DTConstants"%>
<%@page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Calendar"%>
<%@page import="vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep"%>
<%@page import="java.util.List"%>
<%@ include file="init.jsp"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>

<%@page import="vn.dtt.duongbo.utils.format.FormatData"%>

<%
long nguoiLamThuTucId = ParamUtil.getLong(request, Constants.ID_DOANH_NGHIEP);
DnDoanhNghiep nguoiLamThuTuc = null;

if(nguoiLamThuTucId > 0) {
	nguoiLamThuTuc = DnDoanhNghiepLocalServiceUtil.fetchDnDoanhNghiep(nguoiLamThuTucId);
}

PortletURL updateDoanhNghiepURL = renderResponse.createActionURL();
updateDoanhNghiepURL.setParameter(ActionRequest.ACTION_NAME, "updateDoanhNghiep");

String dnTen = nguoiLamThuTuc != null ? nguoiLamThuTuc.getTenDoanhNghiep() : "";
String dnTenEn = nguoiLamThuTuc != null ? nguoiLamThuTuc.getTenTiengAnh() : "";
String dnTinhThanh = nguoiLamThuTuc != null ? nguoiLamThuTuc.getMaTinhThanh() : "";
String dnQuanHuyen = nguoiLamThuTuc != null ? nguoiLamThuTuc.getMaQuanHuyen() : "";
String dnPhuongXa = nguoiLamThuTuc != null ? nguoiLamThuTuc.getMaPhuongXa() : "";
String dnDiaChi = nguoiLamThuTuc != null ? nguoiLamThuTuc.getDiaChi() : "";
String dnDienThoai = nguoiLamThuTuc != null ? nguoiLamThuTuc.getDienThoai() : "";
String dnFax = nguoiLamThuTuc != null ? nguoiLamThuTuc.getFax() : "";
String dnEmail = nguoiLamThuTuc != null ? nguoiLamThuTuc.getEmail() : "";
String dnDKKDSo = nguoiLamThuTuc != null ? nguoiLamThuTuc.getMaSoDoanhNghiep() : "";
String dnDKKDNgayCap = nguoiLamThuTuc != null ? FormatData.parseDateToTringDDMMYYY(nguoiLamThuTuc.getNgayCapDkKd()) : "";
String dnDKKDNoiCap = nguoiLamThuTuc != null ? nguoiLamThuTuc.getCoQuanCapDkKd() : "";
String dnNguoiDaiDien = nguoiLamThuTuc != null ? nguoiLamThuTuc.getNguoiDaiDien() : "";
String dnChucVu = nguoiLamThuTuc != null ? nguoiLamThuTuc.getChucVuNguoiDaiDien() : "";
String dnNguoiDaiDienDT = nguoiLamThuTuc != null ? nguoiLamThuTuc.getSoDienThoaiNguoiDaiDien() : "";

dnTen = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.DN_TEN, dnTen));
dnTenEn = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.DN_TEN_EN, dnTenEn));
dnTinhThanh = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.DN_TINH_THANH, dnTinhThanh));
dnQuanHuyen = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.DN_QUAN_HUYEN, dnQuanHuyen));
dnPhuongXa = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.DN_PHUONG_XA, dnPhuongXa));
dnDiaChi = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.DN_DIA_CHI, dnDiaChi));
dnDienThoai = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.DN_DIEN_THOAI, dnDienThoai));
dnFax = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.DN_FAX, dnFax));
dnEmail = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.DN_EMAIL, dnEmail));
dnDKKDSo = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.DN_DKKD_SO, dnDKKDSo));
dnDKKDNgayCap = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.DN_DKKD_NGAY_CAP, dnDKKDNgayCap));
dnDKKDNoiCap = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.DN_DKKD_NOI_CAP, dnDKKDNoiCap));
dnNguoiDaiDien = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.DN_NGUOI_DAI_DIEN, dnNguoiDaiDien));
dnChucVu = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.DN_CHUC_VU, dnChucVu));
dnNguoiDaiDienDT = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.DN_NGUOI_DAI_DIEN_DIEN_THOAI, dnNguoiDaiDienDT));

List<DmDataItem> listQuocGia = DmDataItemLocalServiceUtil.findByGroupCode(DTConstants.DANH_MUC.DM_QUOCGIA);
List<DmDataItem> listTinhThanh = DmDataItemLocalServiceUtil.findTinhThanh();

List<DmDataItem> listQuanHuyen = new ArrayList<DmDataItem>();
if(Validator.isNotNull(dnTinhThanh)){
	listQuanHuyen = DmDataItemLocalServiceUtil.findQuanHuyenByMaTinhThanh(dnTinhThanh);
}

List<DmDataItem> listPhuongXa = new ArrayList<DmDataItem>();
if(Validator.isNotNull(dnTinhThanh) && Validator.isNotNull(dnQuanHuyen)) {
	listPhuongXa = DmDataItemLocalServiceUtil.findPhuongXaByMaTinhThanMaQuanHuyen(dnTinhThanh, dnQuanHuyen);
}

PortletURL backURL = renderResponse.createRenderURL();
backURL.setParameter("jspPage", "/html/quanlydoanhnghiep/view.jsp");
backURL.setParameter("defaultTab", "0");
%>
<link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/css/dangkydoanhnghiep/style.css?t=<%= System.currentTimeMillis() %>">

<section class="right">
	<div class="box">
		<div class="register-area">
			<div class="box-register">
				<c:choose>
					<c:when test="<%= nguoiLamThuTuc != null %>">
						<h4 class="title_right">Cập nhật tài khoản doanh nghiệp</h4>
					</c:when>
					
					<c:otherwise>
						<h4 class="title_right">Đăng ký tài khoản doanh nghiệp</h4>
					</c:otherwise>
				</c:choose>
				
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
		
				<aui:form action="" name="fm" method="POST">
					<aui:input type="hidden" name="<%= Constants.ID_DOANH_NGHIEP %>" value="<%= nguoiLamThuTucId %>"/>
					<aui:input type="hidden" name="backURL" value="<%= backURL %>"/>
					
					<div class="row">
						<p class="lbt box20">Tên doanh nghiệp: <span class="red">*</span></p>
						<div class="box80">
							<input maxlength="200" name="<%= NguoiLamThuTucTerm.DN_TEN %>" id="<%= NguoiLamThuTucTerm.DN_TEN %>" type="text" size="30" value="<%=dnTen%>" />
						</div>
					</div>
					<div class="row">
						<p class="lbt box20">Tên giao dịch quốc tế (Nếu có):</p>
						<div class="box80">
							<input maxlength="200" name="<%= NguoiLamThuTucTerm.DN_TEN_EN %>"
								id="<%= NguoiLamThuTucTerm.DN_TEN_EN %>" type="text" size="30"
								value="<%=dnTenEn%>" />
						</div>
					</div>
					<div class="row">
						<p class="lbt box20">Địa chỉ</p>
						<div class="box80">
							<div class="box33">
								<p class="lbt">Tỉnh/Thành phố: <span class="red">*</span></p>
								<select style="width: 100%" 
									id="<%= NguoiLamThuTucTerm.DN_TINH_THANH %>"
									name="<%= NguoiLamThuTucTerm.DN_TINH_THANH %>"
									onchange="onchangeSelTinhThanh('<%= NguoiLamThuTucTerm.DN_TINH_THANH %>', '<%= NguoiLamThuTucTerm.DN_QUAN_HUYEN %>')">
								
									<option value="">-- Chọn Tỉnh/Thành Phố --</option>
									<%
										for (DmDataItem item : listTinhThanh) {
									%>
									<option value="<%=item.getCode()%>"
										<%=item.getCode().equalsIgnoreCase(dnTinhThanh) ? "selected='selected'" : ""%>><%=item.getName()%></option>
									<%
										}
									%>
								</select>
							</div>
							<div class="box33">
								<p class="lbt">Quận/Huyện: <span class="red">*</span></p>
								<select id="<%= NguoiLamThuTucTerm.DN_QUAN_HUYEN %>" name="<%= NguoiLamThuTucTerm.DN_QUAN_HUYEN %>"
									onchange="onchangeSelQuanHuyen('<%= NguoiLamThuTucTerm.DN_TINH_THANH %>', '<%= NguoiLamThuTucTerm.DN_QUAN_HUYEN %>','<%= NguoiLamThuTucTerm.DN_PHUONG_XA %>')" style="width: 100%">
									
									<option value="">-- Chọn Quận/Huyện --</option>
									<%
									if(listQuanHuyen != null && listQuanHuyen.size() > 0){ 
										for (DmDataItem item : listQuanHuyen) {
									%>
									<option value="<%=item.getCode()%>"
										<%=(item.getCode().equalsIgnoreCase(dnQuanHuyen)) ? "selected='selected'" : ""%>><%=item.getName()%></option>
									<%
										} 
									}
									%>
								</select>
							</div>
							<div class="box33">
								<p class="lbt">Phường/Xã: <span class="red">*</span></p>
								<select style="width: 100%" id="<%= NguoiLamThuTucTerm.DN_PHUONG_XA %>"
									name="<%= NguoiLamThuTucTerm.DN_PHUONG_XA %>">
									<option value="">-- Chọn Phường/Xã --</option>
									<%
									if(listPhuongXa != null && listPhuongXa.size() > 0){ 
										for (DmDataItem item : listPhuongXa) {
									%>
									<option value="<%=item.getCode()%>"
										<%=(item.getCode().equalsIgnoreCase(dnPhuongXa)) ? "selected='selected'" : ""%>><%=item.getName()%></option>
									<%
										} 
									}
									%>
								</select>
							</div>
						</div>
					</div>
					<div class="row">
						<p class="lbt box20">Địa chỉ chi tiết:</p>
						<div class="box80">
							<input maxlength="200" name="<%= NguoiLamThuTucTerm.DN_DIA_CHI %>" id="<%= NguoiLamThuTucTerm.DN_DIA_CHI %>"
								type="text" size="30" value="<%=dnDiaChi%>" />
						</div>
					</div>
					<div class="row">
						<p class="lbt box20">Số điện thoại: <span class="red">*</span></p>
						<div class="box80">
							<div class="box20">
								<input maxlength="200" name="<%= NguoiLamThuTucTerm.DN_DIEN_THOAI %>"
									id="<%= NguoiLamThuTucTerm.DN_DIEN_THOAI %>" type="text" size="30"
									value="<%=dnDienThoai%>" />
							</div>
							<p class="lbt box10">Fax:</p>
							<div class="box20">
								<input maxlength="200" name="<%= NguoiLamThuTucTerm.DN_FAX %>" id="<%= NguoiLamThuTucTerm.DN_FAX %>" type="text"
									size="30" value="<%=dnFax%>" />
							</div>
							<p class="lbt box10">Email:<span class="red">*</span></p>
							<div class="box30">
								<input maxlength="200" <%= nguoiLamThuTuc != null ? "readonly=\"readonly\"" : "" %> name="<%= NguoiLamThuTucTerm.DN_EMAIL %>" id="<%= NguoiLamThuTucTerm.DN_EMAIL %>"
									type="text" size="30" value="<%=dnEmail%>" /> 
							</div>
						</div>
					</div>
					<div class="row">
						<p class="lbt box20">Giấy CN ĐKKD/Mã số DN: <span class="red">*</span></p>
						<div class="box80">
							<div class="box40">
								<label id="maSoDoanhNghiep_message" style="display: none;"></label>
								<input name="<%= NguoiLamThuTucTerm.DN_DKKD_SO %>" type="text" id="<%= NguoiLamThuTucTerm.DN_DKKD_SO %>"
									class="egov-inputfield" value="<%=dnDKKDSo%>"/>
							</div>
							<p class="lbt box10" style="margin:0 2% 0 5%">Ngày cấp: <span class="red">*</span></p>
							<div class="box33">
								<div>
									<input type="text" id="<%= NguoiLamThuTucTerm.DN_DKKD_NGAY_CAP %>" class="calInput" readonly="readonly" name="<%= NguoiLamThuTucTerm.DN_DKKD_NGAY_CAP %>" onclick="gtCalendar('<%= NguoiLamThuTucTerm.DN_DKKD_NGAY_CAP %>')" value="<%=dnDKKDNgayCap%>" /> 
									<img class="calIcon" src="<%=request.getContextPath()%>/img/date.png" onclick="gtCalendar('<%= NguoiLamThuTucTerm.DN_DKKD_NGAY_CAP %>')">
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<p class="lbt box20">Cơ quan cấp phép: <span class="red">*</span></p>
						<div class="box80">
							<input maxlength="200" name="<%= NguoiLamThuTucTerm.DN_DKKD_NOI_CAP %>" id="<%= NguoiLamThuTucTerm.DN_DKKD_NOI_CAP %>"
								type="text" size="30" 
								value="<%=dnDKKDNoiCap%>" />
						</div>
					</div>
					<div class="row">
						<p class="lbt box20">Người đại diện:</p>
						<div class="box80">
							<div class="box40">
							<input maxlength="200" name="<%= NguoiLamThuTucTerm.DN_NGUOI_DAI_DIEN %>"
								id="<%= NguoiLamThuTucTerm.DN_NGUOI_DAI_DIEN %>" required="required" type="text" size="30"
								value="<%=dnNguoiDaiDien%>" />
							</div>
							<p class="lbt box10">Chức vụ:</p>
							<div class="box20">
									<input maxlength="200" name="<%= NguoiLamThuTucTerm.DN_CHUC_VU %>" id="<%= NguoiLamThuTucTerm.DN_CHUC_VU %>"
										required="required" type="text" size="30" value="<%=dnChucVu%>" />
							</div>									
							<p class="lbt box10" style="margin-left:0">Điện thoại:</p>
							<div class="box20" style="margin:0">
							<input maxlength="200" name="<%= NguoiLamThuTucTerm.DN_NGUOI_DAI_DIEN_DIEN_THOAI %>"
									id="<%= NguoiLamThuTucTerm.DN_NGUOI_DAI_DIEN_DIEN_THOAI %>" required="required" type="text"
									size="30" value="<%=dnNguoiDaiDienDT%>" />
							</div>
						</div>
					</div>
					<div class="row">
						<p><i>Ghi chú: Những trường thông tin có dấu "<span class="red">*</span>" là bắt buộc</i></p>
					</div>
					<div class="row row-bt">
						<input type="button" class="btn btn-primary btn-sm" onclick="summitForm('<%=updateDoanhNghiepURL.toString()%>')" value='<%= nguoiLamThuTuc != null ? "Cập nhật" : "Đăng ký" %>'/>
						<input type="button" class="btn btn-primary btn-sm" onclick="location.href='<%=backURL %>'" value="Quay lại" />
					</div>
				</aui:form>
			</div>
		</div>
	</div>
</section>
	
<portlet:resourceURL var="updateContentURL" ></portlet:resourceURL>


<script type="text/javascript">

function summitForm(url) {
	var dnTen = $('#<%= NguoiLamThuTucTerm.DN_TEN %>').val();
	var dnTinhThanh =  $('#<%= NguoiLamThuTucTerm.DN_TINH_THANH %>').val();
	var dnQuanHuyen =  $('#<%= NguoiLamThuTucTerm.DN_QUAN_HUYEN %>').val();
	var dnPhuongXa =  $('#<%= NguoiLamThuTucTerm.DN_PHUONG_XA %>').val();
	var dnDienThoai =  $('#<%= NguoiLamThuTucTerm.DN_DIEN_THOAI %>').val();
	var dnEmail =  $('#<%= NguoiLamThuTucTerm.DN_EMAIL %>').val();
	var dnDKKDSo =  $('#<%= NguoiLamThuTucTerm.DN_DKKD_SO %>').val();
	var dnDKKDNgayCap =  $('#<%= NguoiLamThuTucTerm.DN_DKKD_NGAY_CAP %>').val();
	var dnDKKDNoiCap =  $('#<%= NguoiLamThuTucTerm.DN_DKKD_NOI_CAP %>').val();
	
	if (dnTen == "") {
		alert("Tên doanh nghiệp không được để trống");
		return false;
	}
	if(dnTinhThanh == ""){
		alert("Tên Tỉnh không được để trống!")
		return false;
	}		
	if (dnQuanHuyen == "") {
		alert("Tên quận/huyện không được để trống");
		return false;
	}
	if (dnPhuongXa == "") {
		alert("Tên phường/xã không được để trống");
		return false;
	}
	if (dnDienThoai == "") {
		alert("Điện thoại không được để trống");
		return false;
	}
	if (dnDienThoai.length < 10) {
		alert("Điện thoại phải lớn hơn 10 kí tự");
		return false;
	}
	if (dnDienThoai.length > 15) {
		alert("Điện thoại phải nhỏ hơn 15 kí tự");
		return false;
	}
	if (isNaN(dnDienThoai) == true) {
		alert("Điện thoại phải để ở định dạng số");
		return false;
	}
	
	if (dnEmail == "") {
		alert("Email không được để trống");
		return false;
	}
	
	var re = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
	if (!re.test(dnEmail)) {
		alert('Nhập đúng định dạng ví dụ nguoidung@mt.gov.vn')
		return false;
	}
	if (dnDKKDSo == "") {
		alert("Mã số doanh nghiệp không được để trống");
		return false;
	}
	if (dnDKKDNgayCap == "") {
		alert("Ngày Cấp không được để trống");
		return false;
	}
	if (dnDKKDNoiCap == "") {
		alert("Cơ quan cấp không được để trống");
		return false;
	}	
	
	document.getElementById('<portlet:namespace />fm').action = url;
	document.getElementById('<portlet:namespace />fm').submit();
}
</script>

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
	
	.register-area .box-register .row-bt {
		width: auto !important;
		text-align: center;
	}
</style>