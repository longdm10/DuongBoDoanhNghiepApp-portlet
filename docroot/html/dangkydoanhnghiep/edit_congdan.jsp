<%@page import="vn.dtt.duongthuy.business.DTConstants"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dangky.NguoiLamThuTucTerm"%>
<%@page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>


<%@ include file="/html/init.jsp"%>

<%
String cdTen = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.CD_TEN));
String cdNgaySinh = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.CD_NGAY_SINH));
int cdNamSinh = ParamUtil.getInteger(request, NguoiLamThuTucTerm.CD_NAM_SINH);
String cdQuocTich = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.CD_QUOC_TICH, DTConstants.MA_QUOC_GIA_DEFAULT));
String cdGioiTinh = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.CD_GIOI_TINH));
String cdTinhThanh = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.CD_TINH_THANH));
String cdQuanHuyen = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.CD_QUAN_HUYEN));
String cdPhuongXa = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.CD_PHUONG_XA));
String cdDiaChi = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.CD_DIA_CHI));
String cdCMNDSo = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.CD_CMND_SO));
String cdCMNDNoiCap = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.CD_CMND_NOI_CAP));
String cdCMNDNgayCap = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.CD_CMND_NGAY_CAP));
String cdDienThoai = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.CD_DIEN_THOAI));
String cdEmail = HtmlUtil.escape(ParamUtil.getString(request, NguoiLamThuTucTerm.CD_EMAIL));

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

Calendar cal = Calendar.getInstance();
cal.setTime(new Date());
cal.set(Calendar.YEAR, cal.get(Calendar.YEAR) -15);
%>

<portlet:renderURL var="thanhCongURL">
	<portlet:param name="jspPage" value="/html/dangkydoanhnghiep/view_thanhcong.jsp"/>
	<portlet:param name="type" value="2"/>
</portlet:renderURL>

<portlet:actionURL name="dangKyCongDan" var="dangKyCongDanURL">
	<portlet:param name="backURL" value="<%= thanhCongURL %>"/>
	<portlet:param name="defaultTab" value="1"/>
	<portlet:param name="type" value="2"/>
</portlet:actionURL>

<aui:form action="" name="fm1" method="POST">
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
					<option value="">-Chọn Quốc Gia-</option>
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
						<option value="">-Chọn Tỉnh/Thành Phố-</option>
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
						
						<option value="">-Chọn Quận/Huyện-</option>
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
					<option value="">-Chọn Phường/Xã-</option>
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
				<input type="text" name="<%= NguoiLamThuTucTerm.CD_EMAIL %>" id="<%= NguoiLamThuTucTerm.CD_EMAIL %>" value="<%= cdEmail %>">
				<label class="help-text">Hệ thống sẽ gửi mật khẩu vào tài khoản email và sử dụng chính email này làm tài khoản đăng nhập của bạn</label>
			</div>
		</div>
	</div>
	<div class="row">
		<p><i>Ghi chú: Những trường thông tin có dấu "<span class="red">*</span>" là bắt buộc</i></p>
	</div>
	<div class="row row-bt">
		<input type="button" onclick="summitForm1('<%=dangKyCongDanURL%>')" value="Đăng ký" />
		<input type="button" onclick = "javascript: document.location.href='/home'" value="Hủy bỏ" />
	</div>
</aui:form>

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

function summitForm1(url) {
	
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
