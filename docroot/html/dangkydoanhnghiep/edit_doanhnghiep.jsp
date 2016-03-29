
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.duongthuy.business.DTConstants"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@page import="vn.dtt.duongbo.dangky.NguoiLamThuTucTerm"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>


<%@ include file="/html/init.jsp"%>

<%
String dnTen = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.DN_TEN));
String dnTenEn = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.DN_TEN_EN));
String dnTinhThanh = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.DN_TINH_THANH));
String dnQuanHuyen = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.DN_QUAN_HUYEN));
String dnPhuongXa = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.DN_PHUONG_XA));
String dnDiaChi = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.DN_DIA_CHI));
String dnDienThoai = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.DN_DIEN_THOAI));
String dnFax = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.DN_FAX));
String dnEmail = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.DN_EMAIL));

String dnDKKDSo = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.DN_DKKD_SO));
String dnDKKDNgayCap = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.DN_DKKD_NGAY_CAP));
String dnDKKDNoiCap = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.DN_DKKD_NOI_CAP));

String dnDkkdvtOtoSo = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.DN_DKKD_VT_OTO_SO));
String dnDkkdvtOtoNgayCap = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.DN_DKKD_VT_OTO_NGAY_CAP));
String dnDkkdvtOtoNoiCap = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.DN_DKKD_VT_OTO_NOI_CAP));

String dnNguoiDaiDien = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.DN_NGUOI_DAI_DIEN));
String dnChucVu = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.DN_CHUC_VU));
String dnNguoiDaiDienDT = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.DN_NGUOI_DAI_DIEN_DIEN_THOAI));

List<DmDataItem> listTinhThanh = DmDataItemLocalServiceUtil.findTinhThanh();

List<DmDataItem> listQuanHuyen = new ArrayList<DmDataItem>();
if(Validator.isNotNull(dnTinhThanh)){
	listQuanHuyen = DmDataItemLocalServiceUtil.findQuanHuyenByMaTinhThanh(dnTinhThanh);
}

List<DmDataItem> listPhuongXa = new ArrayList<DmDataItem>();
if(Validator.isNotNull(dnTinhThanh) && Validator.isNotNull(dnQuanHuyen)) {
	listPhuongXa = DmDataItemLocalServiceUtil.findPhuongXaByMaTinhThanMaQuanHuyen(dnTinhThanh, dnQuanHuyen);
}
%>

<portlet:renderURL var="thanhCongURL">
	<portlet:param name="jspPage" value="/html/dangkydoanhnghiep/view_thanhcong.jsp"/>
	<portlet:param name="type" value="1"/>
</portlet:renderURL>

<portlet:actionURL name="dangKyDoanhNghiep" var="dangKyDoanhNghiepURL">
	<portlet:param name="backURL" value="<%= thanhCongURL %>"/>
	<portlet:param name="defaultTab" value="0"/>
	<portlet:param name="type" value="1"/>
</portlet:actionURL>

<aui:form action="" name="fm" method="POST">
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
			<p class="lbt box5">Fax:</p>
			<div class="box20">
				<input maxlength="200" name="<%= NguoiLamThuTucTerm.DN_FAX %>" id="<%= NguoiLamThuTucTerm.DN_FAX %>" type="text"
					size="30" value="<%=dnFax%>" />
			</div>
			<p class="lbt box5" style="margin-right:2%">Email:<span class="red">*</span></p>
			<div class="box30" style="width:45%">
				<input maxlength="200" name="<%= NguoiLamThuTucTerm.DN_EMAIL %>" id="<%= NguoiLamThuTucTerm.DN_EMAIL %>"
					type="text" size="30" value="<%=dnEmail%>" /> 
					<label class="help-text">Hệ thống sẽ gửi mật khẩu vào tài khoản email và sử dụng chính email này làm tài khoản đăng nhập của bạn</label>
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
		<p class="lbt box20">Giấy phép kinh doanh vận tải bằng xe ô tô: </p>
		<div class="box80">
			<div class="box40">
				<label id="maSoDoanhNghiep_message" style="display: none;"></label>
				<input name="<%= NguoiLamThuTucTerm.DN_DKKD_VT_OTO_SO %>" type="text" id="<%= NguoiLamThuTucTerm.DN_DKKD_VT_OTO_SO %>"
					class="egov-inputfield" value="<%=dnDkkdvtOtoSo%>"/>
			</div>
			<p class="lbt box10" style="margin:0 2% 0 5%">Ngày cấp kdvt ô tô: </p>
			<div class="box33">
				<div>
					<input type="text" id="<%= NguoiLamThuTucTerm.DN_DKKD_VT_OTO_NGAY_CAP %>" class="calInput" readonly="readonly" name="<%= NguoiLamThuTucTerm.DN_DKKD_VT_OTO_NGAY_CAP %>" onclick="gtCalendar('<%= NguoiLamThuTucTerm.DN_DKKD_VT_OTO_NGAY_CAP %>')" value="<%=dnDkkdvtOtoNgayCap%>" /> 
					<img class="calIcon" src="<%=request.getContextPath()%>/img/date.png" onclick="gtCalendar('<%= NguoiLamThuTucTerm.DN_DKKD_VT_OTO_NGAY_CAP %>')">
				</div>
			</div>
		</div>
	</div>
	
	<div class="row">
		<p class="lbt box20">Cơ quan cấp phép kdvt ô tô: </p>
		<div class="box80">
			<input maxlength="200" name="<%= NguoiLamThuTucTerm.DN_DKKD_VT_OTO_NOI_CAP %>" id="<%= NguoiLamThuTucTerm.DN_DKKD_VT_OTO_NOI_CAP %>"
				type="text" size="30" 
				value="<%=dnDkkdvtOtoNoiCap%>" />
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
		<input type="button" onclick="summitForm('<%=dangKyDoanhNghiepURL%>')" value="Đăng ký" />
		<input type="button" onclick = "javascript: document.location.href='/'" value="Hủy bỏ" />
	</div>
</aui:form>

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
