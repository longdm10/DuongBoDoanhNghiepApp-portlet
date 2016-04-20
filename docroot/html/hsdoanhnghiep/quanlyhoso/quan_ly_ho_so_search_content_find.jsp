<%@page import="vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinh"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcTrangThaiHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcTrangThaiHoSo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>

<%@page import="java.util.List"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%@ include file="/html/init.jsp"%>

<%
	List<DmDataItem> lstLinhVucThuTuc = DmDataItemLocalServiceUtil.findByGroupId(Constants.DM_LINH_VUC_TTHC);
	if (lstLinhVucThuTuc == null) { lstLinhVucThuTuc = new ArrayList<DmDataItem>(); }
	List<TthcTrangThaiHoSo> lstTrangThaiHoSo = TthcTrangThaiHoSoLocalServiceUtil.findTrangThaiHoSoInListId("13, 14, 15, 16, 17, 18, 19");

	
	PortletURL actionUrlTimKiemHoSoThuTuc = renderResponse.createActionURL();
	actionUrlTimKiemHoSoThuTuc.setParameter(ActionRequest.ACTION_NAME, "timKiemQuanLyHoSo");
	actionUrlTimKiemHoSoThuTuc.setParameter(Constants.MA_BIEN_NHAN, maBienNhan);

	List<TthcThuTucHanhChinh> allThuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.findByLinhVucThuTuc(selLinhVucThuTuc);
	
%>
<aui:form action="" name="myForm" id="myForm" method="POST">
		
		<!-------------- ho so dang hoan thien && da hoan thien chua nop phi && cho tiep nhan -------------->
		<% if (pnDoanhNghiep.getMaPhanNhom().trim().equals(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_DANG_TAO) ||
				pnDoanhNghiep.getMaPhanNhom().trim().equals(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_CHO_TIEP_NHAN)) {
			%>
			
			<!------------------------------- nhom dich vu cong ------------------------------>
			<div class="col-xs-5">
				<select class="form-control" id="selLinhVucThuTuc" name="selLinhVucThuTuc" onchange="onchangeSelLinhVucThuTuc()">
					<option value=""> ------------ Chọn tất cả các nhóm dịch vụ công ------------ </option>
					<%for (DmDataItem item : lstLinhVucThuTuc) {
						%>
						<option value="<%=item.getCode()%>" <%=item.getCode().equals(selLinhVucThuTuc) ? "selected='selected'" : ""%>><%=item.getName()%></option>
					<%}%>
				</select>
			</div>
			
			<!------------------------------- tat ca cac dich vu cong ------------------------->
			<input type="hidden" id="textThuTucHanhChinh" name="textThuTucHanhChinh" value="<%=thuTucHanhChinhId%>">
			<div class="col-xs-5">
				<select class="form-control" id="selThuTucHanhChinh" name="selThuTucHanhChinh">
					<option value=""> ------------ Chọn tất cả các dịch vụ công ------------ </option>
					<%	if (allThuTucHanhChinh != null && allThuTucHanhChinh.size() > 0) {
							for (TthcThuTucHanhChinh item : allThuTucHanhChinh) {
								%>
								<option value="<%=item.getId()%>" <%=(item.getId() == ((thuTucHanhChinhId.trim().length() > 0)? Long.parseLong(thuTucHanhChinhId) : 0)) ? "selected='selected'" : ""%>><%=item.getTenThuTuc()%></option>
								<%
							}
						}
					%>
				</select>
			</div>
			
			<div class="col-xs-2">
				<button type="button" class="PD btn btn-primary" onclick="summitForm('<%=actionUrlTimKiemHoSoThuTuc%>')">Tìm kiếm</button>
			</div>
			
		
		
		<!---------------------------- HO SO DANG XU LY ---------------------------->
		<% } else if (pnDoanhNghiep.getMaPhanNhom().equals(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_DANG_XU_LY)) { %>
			
			
			<!-- ---------------------------- nhom dich vu cong ------------------------------>
			<div class="col-xs-6">
				<select class="form-control" id="selLinhVucThuTuc" name="selLinhVucThuTuc" onchange="onchangeSelLinhVucThuTuc()">
					<option value=""> ------------ Chọn tất cả các nhóm dịch vụ công ------------ </option>
					<% for (DmDataItem item : lstLinhVucThuTuc) { %>
						<option value="<%=item.getCode()%>" <%=item.getCode().equals(selLinhVucThuTuc) ? "selected='selected'" : ""%>><%=item.getName()%></option>
					<% } %>
				</select>
			</div>
			
			
			<!-- ---------------------------- tat ca cac dich vu cong ------------------------------>
			<input type="hidden" id="textThuTucHanhChinh" name="textThuTucHanhChinh" value="<%=thuTucHanhChinhId%>">
			
			<div class="col-xs-6">
				<select class="form-control" id="selThuTucHanhChinh" name="selThuTucHanhChinh">
					<option value=""> ------------ Chọn tất cả các dịch vụ công ------------ </option>
					<%	if(allThuTucHanhChinh != null && allThuTucHanhChinh.size() > 0){ 
							for (TthcThuTucHanhChinh item : allThuTucHanhChinh) {
							%>
								<option value="<%=item.getId()%>" <%=(item.getId() == ((thuTucHanhChinhId.trim().length() > 0)? Long.parseLong(thuTucHanhChinhId) : 0)) ? "selected='selected'" : ""%>><%=item.getTenThuTuc()%></option>
						<% } 
						}
						%>
				</select>
			</div>
			
			
			
			<!-- ---------------------------- chon trang thai ho so ------------------------------>
			
			<!-- ---------------------------- nhap ma tiep nhan ho so------------------------------>
			
			<div class="col-xs-6" style="margin-top:10px">
				<input type="text" class="form-control" id="maBienNhan" name="maBienNhan" value="<%=maBienNhan %>" placeholder="Nhập mã tiếp nhận hồ sơ...">
			</div>
			
			<div class="col-xs-2" style="margin-top:10px">
				<button type="button" class="PD btn btn-primary" onclick="summitForm('<%=actionUrlTimKiemHoSoThuTuc%>')">Tìm kiếm</button>
			</div>
			
		
		<!-------------- ho so da tra ket qua -------------->
		<% } else if (pnDoanhNghiep.getMaPhanNhom().equals(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_DA_TRA_KET_QUA)) { %>
			
			<!-- ---------------------------- nhom dich vu cong ------------------------------>
			
			<div class="col-xs-6">
				<select class="form-control" id="selLinhVucThuTuc" name="selLinhVucThuTuc" onchange="onchangeSelLinhVucThuTuc()">
					<option value=""> ------------ Chọn tất cả các nhóm dịch vụ công ------------ </option>
					<% for (DmDataItem item : lstLinhVucThuTuc) { %>
						<option value="<%=item.getCode()%>" <%=item.getCode().equals(selLinhVucThuTuc) ? "selected='selected'" : ""%>><%=item.getName()%></option>
					<% } %>
				</select>
			</div>
			
			
			
			
			<!-- ---------------------------- tat ca cac dich vu cong ------------------------------>
			<input type="hidden" id="textThuTucHanhChinh" name="textThuTucHanhChinh" value="<%=thuTucHanhChinhId%>">
			
			<div class="col-xs-6">
				<select class="form-control" id="selThuTucHanhChinh" name="selThuTucHanhChinh">
					<option value=""> ------------ Chọn tất cả các dịch vụ công ------------ </option>
					<%	if(allThuTucHanhChinh != null && allThuTucHanhChinh.size() > 0){ 
							for (TthcThuTucHanhChinh item : allThuTucHanhChinh) {
							%>
								<option value="<%=item.getId()%>" <%=(item.getId() == ((thuTucHanhChinhId.trim().length() > 0)? Long.parseLong(thuTucHanhChinhId) : 0)) ? "selected='selected'" : ""%>><%=item.getTenThuTuc()%></option>
						<% } 
						}
						%>
				</select>
			</div>
			
			
			
			
			<!-- ---------------------------- nhap ma tiep nhan ho so -------------------------->
			<div class="col-xs-6" style="margin-top:10px">
				<input type="text" class="form-control" id="maBienNhan" name="maBienNhan" value="<%=maBienNhan %>" placeholder="Nhập mã tiếp nhận hồ sơ...">
			</div>
			
			<div class="col-xs-2" style="margin-top:10px">
				<button type="button" class="PD btn btn-primary" onclick="summitForm('<%=actionUrlTimKiemHoSoThuTuc%>')">Tìm kiếm</button>
			</div>
			
		<% } %>
		
</aui:form>

<portlet:resourceURL var="updateContentURL" ></portlet:resourceURL>
<script type="text/javascript">
function summitForm(url) {
	document.getElementById('<portlet:namespace />myForm').action = url;
	document.getElementById('<portlet:namespace />myForm').submit();
}

function onchangeSelLinhVucThuTuc() {
	var code = $("select#selLinhVucThuTuc").val();
	console.log('==onchangeSelLinhVucThuTuc==' + code);
	
	if (code == '') { return; }
	
	$.ajax({
		url: '<%=updateContentURL%>',
		dataType : "json",
		data : {
			codeLinhVucThuTuc : code,
			type: 'findThuTucHanhChinhByCodeLinhVucThuTuc'
		},
		type : "get",
		success : function(data) {
			console.log('(2)==onchangeSelLinhVucThuTuc==success==' + data);
			
			//preferred
			//var data2 = JSON.parse(data);
			//console.log(data2);
			
			var select = $('#selThuTucHanhChinh');
			select.find('option').remove();
			
			$('<option>').val("").text("------------ Chọn tất cả các dịch vụ công ------------").appendTo(select);
			$.each(data, function(idx, obj) {
				console.log(obj);
				$('<option>').val(obj.id).text(obj.name).appendTo(select);
			});
		},
		beforeSend : function(data) {
			console.log("(1)==onchangeSelLinhVucThuTuc==beforeSend==" + data);
		},
		complete : function(data) {
			console.log("(3)==onchangeSelLinhVucThuTuc==complete==" + data);
		},
		error : function(data) {
			console.log("(2)==onchangeSelLinhVucThuTuc==error==" + data);
		}
	});
}

$(function() {
	var tthc = $('#textThuTucHanhChinh').val();
	if (tthc.length > 0) {
		$('#selThuTucHanhChinh').val(tthc);
	}
});
</script>