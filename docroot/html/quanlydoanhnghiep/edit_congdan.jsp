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

PortletURL updateCongDanURL = renderResponse.createActionURL();
updateCongDanURL.setParameter(ActionRequest.ACTION_NAME, "updateCongDan");

String cdTen = nguoiLamThuTuc != null ? nguoiLamThuTuc.getTenCongDan() : "";
String cdDiaChi = nguoiLamThuTuc != null ? nguoiLamThuTuc.getDiaChi() : "";
String cdCMNDSo = nguoiLamThuTuc != null ? nguoiLamThuTuc.getMaSoCongDan() : "";
String cdCMNDNoiCap = nguoiLamThuTuc != null ? nguoiLamThuTuc.getNoiCapCMND() : "";
String cdCMNDNgayCap = nguoiLamThuTuc != null ? FormatData.parseDateToTringDDMMYYY(nguoiLamThuTuc.getNgayCapCMND()) : "";
String cdDienThoai = nguoiLamThuTuc != null ? nguoiLamThuTuc.getDienThoai() : "";
String cdEmail = nguoiLamThuTuc != null ? nguoiLamThuTuc.getEmail() : "";
String cdNgaySinh = nguoiLamThuTuc != null ? FormatData.parseDateToTringDDMMYYY(nguoiLamThuTuc.getNgaySinh()) : "";
int cdNamSinh = nguoiLamThuTuc != null ? GetterUtil.getInteger(nguoiLamThuTuc.getNamSinh()) : 0;
String cdTinhThanh = nguoiLamThuTuc != null ? nguoiLamThuTuc.getMaTinhThanh() : "";
String cdQuanHuyen = nguoiLamThuTuc != null ? nguoiLamThuTuc.getMaQuanHuyen() : "";
String cdPhuongXa = nguoiLamThuTuc != null ? nguoiLamThuTuc.getMaPhuongXa() : "";
String cdQuocTich = nguoiLamThuTuc != null ? nguoiLamThuTuc.getQuocTich() : DTConstants.MA_QUOC_GIA_DEFAULT;
String cdGioiTinh = nguoiLamThuTuc != null ? nguoiLamThuTuc.getGioiTinh() : "";

cdTen = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.CD_TEN, cdTen));
cdNgaySinh = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.CD_NGAY_SINH, cdNgaySinh));
cdNamSinh = ParamUtil.getInteger(request, NguoiLamThuTucTerm.CD_NAM_SINH, cdNamSinh);
cdQuocTich = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.CD_QUOC_TICH, cdQuocTich));
cdGioiTinh = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.CD_GIOI_TINH, cdGioiTinh));
cdTinhThanh = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.CD_TINH_THANH, cdTinhThanh));
cdQuanHuyen = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.CD_QUAN_HUYEN, cdQuanHuyen));
cdPhuongXa = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.CD_PHUONG_XA, cdPhuongXa));
cdDiaChi = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.CD_DIA_CHI, cdDiaChi));
cdCMNDSo = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.CD_CMND_SO, cdCMNDSo));
cdCMNDNoiCap = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.CD_CMND_NOI_CAP, cdCMNDNoiCap));
cdCMNDNgayCap = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.CD_CMND_NGAY_CAP, cdCMNDNgayCap));
cdDienThoai = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.CD_DIEN_THOAI, cdDienThoai));
cdEmail = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.CD_EMAIL, cdEmail));

List<DmDataItem> listQuocGia = DmDataItemLocalServiceUtil.findByGroupCode(DTConstants.DANH_MUC.DM_QUOCGIA);
List<DmDataItem> listTinhThanh = DmDataItemLocalServiceUtil.findTinhThanh();

List<DmDataItem> listQuanHuyen = new ArrayList<DmDataItem>();
if(Validator.isNotNull(cdTinhThanh)){
	listQuanHuyen = DmDataItemLocalServiceUtil.findQuanHuyenByMaTinhThanh(cdTinhThanh);
}

List<DmDataItem> listPhuongXa = new ArrayList<DmDataItem>();
if(Validator.isNotNull(cdTinhThanh) && Validator.isNotNull(cdQuanHuyen)) {
	listPhuongXa = DmDataItemLocalServiceUtil.findPhuongXaByMaTinhThanMaQuanHuyen(cdTinhThanh, cdQuanHuyen);
}

PortletURL backURL = renderResponse.createRenderURL();
backURL.setParameter("jspPage", "/html/quanlydoanhnghiep/view.jsp");
backURL.setParameter("defaultTab", "1");

Calendar cal = Calendar.getInstance();
cal.setTime(new Date());
cal.set(Calendar.YEAR, cal.get(Calendar.YEAR) -15);

%>
<link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/css/dangkydoanhnghiep/style.css?t=<%= System.currentTimeMillis() %>">
<section class="right">
	<div class="box">
		<div class="register-area">
			<div class="box-register">
				<c:choose>
					<c:when test="<%= nguoiLamThuTuc != null %>">
						<h4 class="title_right">Cập nhật tài khoản công dân</h4>
					</c:when>
					
					<c:otherwise>
						<h4 class="title_right">Đăng ký tài khoản công dân</h4>
					</c:otherwise>
				</c:choose>
				
				<liferay-ui:error key="<%= DangKyMessageErrors.EMPTY_TINH_THANH %>" message="Vui lòng chọn tỉnh/thành"/>
				<liferay-ui:error key="<%= DangKyMessageErrors.EMPTY_QUAN_HUYEN %>" message="Vui lòng chọn quận/huyện"/>
				<liferay-ui:error key="<%= DangKyMessageErrors.EMPTY_PHUONG_XA %>" message="Vui lòng chọn phường/xã"/>
				<liferay-ui:error key="<%= DangKyMessageErrors.EMPTY_DIEN_THOAI %>" message="Vui lòng nhập điện thoại"/>
				<liferay-ui:error key="<%= DangKyMessageErrors.EMPTY_EMAIL %>" message="Vui lòng nhập email"/>
				<liferay-ui:error key="<%= DangKyMessageErrors.EMPTY_NGAY_CAP %>" message="Vui lòng nhập ngày cấp"/>
				<liferay-ui:error key="<%= DangKyMessageErrors.EMPTY_CO_QUAN_CAP %>" message="Vui lòng nhập cơ quan cấp"/>
				<liferay-ui:error key="<%= DangKyMessageErrors.EMPTY_TEN_CONG_DAN %>" message="Vui lòng nhập tên công dân"/>
				<liferay-ui:error key="<%= DangKyMessageErrors.EMPTY_SO_CMND %>" message="Vui lòng nhập số CMND"/>
				<liferay-ui:error key="<%= DangKyMessageErrors.EMPTY_NOI_CAP %>" message="Vui lòng nhập nơi cấp"/>
				<liferay-ui:error key="<%= DangKyMessageErrors.USER_ALREADY_EXISTS %>" message="Địa chỉ email đã được đăng ký tài khoản"/>
				<liferay-ui:error key="<%= DangKyMessageErrors.ERROR_REGISTER %>" message="Có lỗi xảy ra trong quá trình đăng ký !"/>
		
				<aui:form action="" name="fm1" method="POST">
					<aui:input type="hidden" name="<%= Constants.ID_DOANH_NGHIEP %>" value="<%= nguoiLamThuTucId %>"/>
					<aui:input type="hidden" name="backURL" value="<%= backURL %>"/>
					
					<div class="row">
						<div class="box33">
							<p class="lbt box33">Họ và tên: <span class="red">*</span></p>
							<div class="box66">
								<input type="text" name="<%= NguoiLamThuTucTerm.CD_TEN %>" id="<%= NguoiLamThuTucTerm.CD_TEN %>" value="<%= cdTen %>">
							</div>
						</div>
						<div class="box66">
							<p class="box20 lbt">Ngày sinh:</p>
							<div class="box33">
								<div id="inputNgaySinh" style='<%= cdNamSinh > 0 ? "display: none;" : "" %>'>
									<input type="text" class="calInput" readonly="readonly" 
										id="<%= NguoiLamThuTucTerm.CD_NGAY_SINH %>" 
										name="<%= NguoiLamThuTucTerm.CD_NGAY_SINH %>" 
										onclick="gtCalendar('<%= NguoiLamThuTucTerm.CD_NGAY_SINH %>')" 
										value="<%=cdNgaySinh%>" /> 
										
									<img class="calIcon" src="<%=request.getContextPath()%>/img/date.png" onclick="gtCalendar('<%= NguoiLamThuTucTerm.CD_NGAY_SINH %>')">
								</div>
								
								<div id="selNgaySinh" style='<%= cdNamSinh > 0 ? "" : "display: none;" %>'>
									<select name="<%= NguoiLamThuTucTerm.CD_NAM_SINH %>" id ="<%= NguoiLamThuTucTerm.CD_NAM_SINH %>">
										<%
											for(int i = cal.get(Calendar.YEAR); i >= 1900; i--) {
												String seld = "";
												if(i == cdNamSinh) {
													seld = "selected=\"selected\"";
												}
											%>
												<option <%= seld %> value="<%= i %>"><%= i %></option>
											<%	
											}
											%>
									</select>
								</div>
							</div>
							<div class="box33">
								<p class="lbt">Chọn năm sinh <input type="checkbox" onchange="toggleNgaySinh('inputNgaySinh','selNgaySinh');"/></p>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="box33">
							<p class="lbt box33">Quốc tịch:</p>
							<div class="box66">
									<select style="width: 100%" id="<%= NguoiLamThuTucTerm.CD_QUOC_TICH %>"
									name="<%= NguoiLamThuTucTerm.CD_QUOC_TICH %>">
									<option value="">-- Chọn Quốc Gia --</option>
									<%
										for (DmDataItem item : listQuocGia) {
									%>
									<option value="<%=item.getCode()%>"
										<%=item.getCode().equalsIgnoreCase(cdQuocTich) ? "selected='selected'" : ""%>><%=item.getName()%></option>
									<%
										}
									%>
								</select>
							</div>
						</div>
						<div class="box66">
							<p class="lbt box20">Giới tính:</p>
							<div class="box80">
								<%
								String chkedNam = "";
								String chkedNu = "";
								if("Nam".equalsIgnoreCase(cdGioiTinh)) {
									chkedNam = "checked=\"checked\"";
								}
								
								if("Nữ".equalsIgnoreCase(cdGioiTinh)) {
									chkedNu = "checked=\"checked\"";
								}
								%>
								<label><input type="radio" name="<%= NguoiLamThuTucTerm.CD_GIOI_TINH %>" <%= chkedNam %> value="Nam"> <span>Nam</span></label>
								<label><input type="radio" name="<%= NguoiLamThuTucTerm.CD_GIOI_TINH %>" <%= chkedNu %> value="Nữ"> <span>Nữ</span></label>
							</div>
						</div>
					</div>
					<div class="row" style="margin-bottom:0">
						<p class="lbt box10" style="margin:0 2% 0 0">Địa chỉ</p>
						<div class="box90">
							<div class="row">
								<div class="box33">
									<p class="lbt box40">Tỉnh/Thành phố: <span class="red">*</span></p>
									<div class="box60">
										<select style="width: 100%" 
											id="<%= NguoiLamThuTucTerm.CD_TINH_THANH %>"
											name="<%= NguoiLamThuTucTerm.CD_TINH_THANH %>"
											onchange="onchangeSelTinhThanh('<%= NguoiLamThuTucTerm.CD_TINH_THANH %>', '<%= NguoiLamThuTucTerm.CD_QUAN_HUYEN %>')">
										<option value="">-- Chọn Tỉnh/Thành Phố --</option>
										<%
											for (DmDataItem item : listTinhThanh) {
										%>
										<option value="<%=item.getCode()%>"
											<%=item.getCode().equalsIgnoreCase(cdTinhThanh) ? "selected='selected'" : ""%>><%=item.getName()%></option>
										<%
											}
										%>
									</select>
									</div>
								</div>
								<div class="box33">
									<p class="lbt box40">Quận/Huyện: <span class="red">*</span></p>
									<div class="box60">
										<select id="<%= NguoiLamThuTucTerm.CD_QUAN_HUYEN %>" name="<%= NguoiLamThuTucTerm.CD_QUAN_HUYEN %>"
											onchange="onchangeSelQuanHuyen('<%= NguoiLamThuTucTerm.CD_TINH_THANH %>', '<%= NguoiLamThuTucTerm.CD_QUAN_HUYEN %>', '<%= NguoiLamThuTucTerm.CD_PHUONG_XA %>')" style="width: 100%">
										
										<option value="">-- Chọn Quận/Huyện --</option>
										<%
										if(listQuanHuyen != null && listQuanHuyen.size() > 0){ 
											for (DmDataItem item : listQuanHuyen) {
										%>
										<option value="<%=item.getCode()%>"
											<%=(item.getCode().equalsIgnoreCase(cdQuanHuyen)) ? "selected='selected'" : ""%>><%=item.getName()%></option>
										<%
											} 
										}
										%>
										</select>
									</div>
								</div>
								<div class="box33">
									<p class="lbt box40">Phường/Xã: <span class="red">*</span></p>
									<div class="box60">
										<select style="width: 100%" id="<%= NguoiLamThuTucTerm.CD_PHUONG_XA %>"
									name="<%= NguoiLamThuTucTerm.CD_PHUONG_XA %>">
									<option value="">-- Chọn Phường/Xã --</option>
									<%
									if(listPhuongXa != null && listPhuongXa.size() > 0){ 
										for (DmDataItem item : listPhuongXa) {
									%>
									<option value="<%=item.getCode()%>"
										<%=(item.getCode().equalsIgnoreCase(cdPhuongXa)) ? "selected='selected'" : ""%>><%=item.getName()%></option>
									<%
										} 
									}
									%>
							</select>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<p class="lbt box10" style="margin:0 2% 0 0">Địa chỉ chi tiết:</p>
						<div class="box90">
							<input type="text" name="<%= NguoiLamThuTucTerm.CD_DIA_CHI %>" id="<%= NguoiLamThuTucTerm.CD_DIA_CHI %>" value="<%= cdDiaChi %>">
						</div>
					</div>
					<div class="row">
						<div class="box33">
							<p class="lbt box33" style="margin-top:0; line-height:normal">Số CMND/Hộ chiếu: <span class="red">*</span></p>
							<div class="box66">
								<input type="text" name="<%= NguoiLamThuTucTerm.CD_CMND_SO %>" id="<%= NguoiLamThuTucTerm.CD_CMND_SO %>" value="<%= cdCMNDSo %>">
							</div>
						</div>
						<div class="box33">
							<p class="lbt box33">Nơi cấp: <span class="red">*</span></p>
							<div class="box66">
								<input type="text" name="<%= NguoiLamThuTucTerm.CD_CMND_NOI_CAP %>" id="<%= NguoiLamThuTucTerm.CD_CMND_NOI_CAP %>" value="<%= cdCMNDNoiCap %>">
							</div>
						</div>
						<div class="box33">
							<p class="lbt box33">Ngày cấp: <span class="red">*</span></p>
							<div class="box66">
								<input type="text" id="<%= NguoiLamThuTucTerm.CD_CMND_NGAY_CAP %>" class="calInput" readonly="readonly" name="<%= NguoiLamThuTucTerm.CD_CMND_NGAY_CAP %>" onclick="gtCalendar('<%= NguoiLamThuTucTerm.CD_CMND_NGAY_CAP %>')" value="<%= cdCMNDNgayCap %>" /> 
								<img class="calIcon" src="<%=request.getContextPath()%>/img/date.png" onclick="gtCalendar('<%= NguoiLamThuTucTerm.CD_CMND_NGAY_CAP %>')">
							</div>
						</div>
					</div>
					<div class="row">
						<div class="box33">
							<p class="lbt box33">Điện thoại:</p>	
							<div class="box66">
								<input type="text" name="<%= NguoiLamThuTucTerm.CD_DIEN_THOAI %>"
									id="<%= NguoiLamThuTucTerm.CD_DIEN_THOAI %>" value="<%= cdDienThoai %>">
							</div>
						</div>
						<div class="box66">
							<p class="lbt box10" style="margin:0 2% 0 0">Email: <span class="red">*</span></p>
							<div class="box90">
								<input type="text" <%= nguoiLamThuTuc != null ? "readonly=\"readonly\"" : "" %> name="<%= NguoiLamThuTucTerm.CD_EMAIL %>" id="<%= NguoiLamThuTucTerm.CD_EMAIL %>" value="<%= cdEmail %>">
							</div>
						</div>
					</div>
					<div class="row">
						<p><i>Ghi chú: Những trường thông tin có dấu "<span class="red">*</span>" là bắt buộc</i></p>
					</div>
					<div class="row row-bt">
						<input type="button" class="btn btn-primary btn-sm" onclick="summitForm('<%=updateCongDanURL.toString()%>')" value='<%= nguoiLamThuTuc != null ? "Cập nhật" : "Đăng ký" %>'/>
						<input type="button" class="btn btn-primary btn-sm" onclick="location.href='<%=backURL %>'" value="Quay lại" />
					</div>
				</aui:form>
			</div>
		</div>
	</div>
</section>
	
<portlet:resourceURL var="updateContentURL" ></portlet:resourceURL>

<script type="text/javascript">
	
	var isNgaySinh = <%= cdNamSinh == 0 %>;
	
	function toggleNgaySinh(inputNgaySinh, selNgaySinh) {
		var inputNgaySinh = $("#"+inputNgaySinh);
		var selNgaySinh = $('#'+selNgaySinh);
		
		if(inputNgaySinh.length > 0 && selNgaySinh.length > 0) {
			if(isNgaySinh) {
				inputNgaySinh.hide();
				selNgaySinh.show();
				isNgaySinh = false;
			} else {
				inputNgaySinh.show();
				selNgaySinh.hide();
				isNgaySinh = true;
			}
		}
	}
	
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

	function summitForm(url) {
		
		var cdTen = $('#<%= NguoiLamThuTucTerm.CD_TEN %>').val();
		var cdTinhThanh =  $('#<%= NguoiLamThuTucTerm.CD_TINH_THANH %>').val();
		var cdQuanHuyen =  $('#<%= NguoiLamThuTucTerm.CD_QUAN_HUYEN %>').val();
		var cdPhuongXa =  $('#<%= NguoiLamThuTucTerm.CD_PHUONG_XA %>').val();
		var cdCMNDSo =  $('#<%= NguoiLamThuTucTerm.CD_CMND_SO %>').val();
		var cdCMNDNgayCap =  $('#<%= NguoiLamThuTucTerm.CD_CMND_NGAY_CAP %>').val();
		var cdEmail =  $('#<%= NguoiLamThuTucTerm.CD_EMAIL %>').val();

		if (cdTen == "") {
			alert("Tên công dân không được để trống");
			return false;
		}
		if (cdEmail == "") {
			alert("Email không được để trống");
			return false;
		}
		var re = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
		if (!re.test(cdEmail)) {
			// Yay! valid
			alert('Nhập đúng định dạng ví dụ nguoidung@mt.gov.vn')
			return false;
		}
		
		if (cdCMNDNgayCap == "") {
			alert("Ngày Cấp chứng minh thư không được để trống");
			return false;
		}
		if (cdCMNDSo == "") {
			alert("Số Chứng minh thư không được để trống");
			return false;
		}
		if (cdCMNDSo.length < 7) {
			alert("Số chứng minh thư phải có tổi thiểu 8");
			return false;
		}
		if (cdCMNDSo.length > 13) {
			alert("Số chứng minh thư phải có tối đa 12");
			return false;
		}
		if(cdTinhThanh == ""){
			alert("Tên Tỉnh không được để trống!")
			return false;
		}		
		if (cdQuanHuyen == "") {
			alert("Tên quận/huyện không được để trống");
			return false;
		}
		if (cdPhuongXa == "") {
			alert("Tên phường/xã không được để trống");
			return false;
		}

		document.getElementById('<portlet:namespace />fm1').action = url;
		document.getElementById('<portlet:namespace />fm1').submit();
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