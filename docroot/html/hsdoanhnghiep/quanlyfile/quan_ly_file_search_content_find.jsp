<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@page import="vn.dtt.duongbo.utils.DanhMucKey"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%@ include file="/html/init.jsp"%>

<%
	
	
	String tenGiayTo = ParamUtil.getString(request, Constants.TEN_GIAY_TO);
	String selTrangThai = ParamUtil.getString(request, Constants.TRANG_THAI_QUAN_LY_FILE);
	String dateNgayCapTuNgay = ParamUtil.getString(request, Constants.NGAY_CAP_PHEP_FROM);
	String dateNgayCapDenNgay = ParamUtil.getString(request, Constants.NGAY_CAP_PHEP_TO);
	String dateNgayHetHanTuNgay = ParamUtil.getString(request, Constants.NGAY_HET_HAN_FROM);
	String dateNgayHetHanDenNgay = ParamUtil.getString(request, Constants.NGAY_HET_HAN_TO);
	
	String dateNgayTaiTuNgay = ParamUtil.getString(request, Constants.NGAY_TAI_FROM);
	String dateNgayTaiDenNgay = ParamUtil.getString(request, Constants.NGAY_TAI_TO);
	


	PortletURL actionUrlTimKiemFile = renderResponse.createActionURL();
	actionUrlTimKiemFile.setParameter(ActionRequest.ACTION_NAME, "timKiemQuanLyFile");
	
	List<String> listTrangThaiChung = new ArrayList<String>();
	listTrangThaiChung.add(Constants.QUAN_LY_FILE_TRANG_THAI_CON_HIEU_LUC);
	listTrangThaiChung.add(Constants.QUAN_LY_FILE_TRANG_THAI_HET_HIEU_LUC);
	
	List<String> listTrangThaiRieng = new ArrayList<String>();
	listTrangThaiRieng.add(Constants.QUAN_LY_FILE_TRANG_THAI_DANG_SU_DUNG);
	listTrangThaiRieng.add(Constants.QUAN_LY_FILE_TRANG_THAI_KHONG_SU_DUNG);
	

	
%>


<aui:form action="<%=actionUrlTimKiemFile.toString()%>" name="myForm" id="myForm" method="POST">
	<!-- Start Input -->
	<%
	if (maPhanNhomHoSo.trim().equalsIgnoreCase(Constants.MA_PHAN_NHOM_QUAN_LY_FILE_GIAY_TO_RIENG)) {
		%>
		<h5 class="col-xs-12"> <i class="pull-left fa fa-chevron-right fa-1"></i><b>Thông tin Giấy tờ riêng</b> </h5>
		<div class="col-xs-12">
			<label class="col-xs-2" for="tenGiayTo">Tên giấy tờ/Số giấy tờ:</label>
			<div class="col-xs-10">
				<input type="text" id="tenGiayTo" name="tenGiayTo" class="form-control" placeholder="Nhập tên giấy tờ/số giấy tờ...."/>
			</div>
		</div>
		
		<div class="col-xs-12">
			<label class="col-xs-2" for="selTrangThai">Tình trạng:</label>
			<div class="col-xs-10">
				<select id="selTrangThai" name="selTrangThai" class="form-control">
					<option value="">--Chọn tình trạng--</option>
					<%
					for (String loaiTrangThai :listTrangThaiRieng) {
						String ten ="";
						if (loaiTrangThai.equalsIgnoreCase(Constants.QUAN_LY_FILE_TRANG_THAI_DANG_SU_DUNG)) {
							ten = "Đang sử dụng";
						} else if(loaiTrangThai.equalsIgnoreCase(Constants.QUAN_LY_FILE_TRANG_THAI_KHONG_SU_DUNG)) {
							ten = "Không sử dụng";
						} 
						%>
						<option value="<%=loaiTrangThai%>" <%=loaiTrangThai.equals(selTrangThai) ? "selected='selected'" : ""%> ><%=ten %></option>
						<%
					}
					%>
				</select>
			</div>
		</div>
		
		<div class="col-xs-12">
			<label class="col-xs-2" for="">Ngày tải:</label>
			<label class="col-xs-2" for="">Từ ngày</label>
			<div class="col-xs-3">
				<div class="input-group">
					<input type="text" id="dateNgayTaiTuNgay" name="dateNgayTaiTuNgay" onclick="gtCalendar('dateNgayTaiTuNgay')" value="<%=dateNgayTaiTuNgay%>" class="form-control">
					<span class="input-group-addon" onclick="gtCalendar('dateNgayTaiTuNgay')"><i class="fa fa-calendar"></i></span>
				</div>
			</div>
			<label class="col-xs-2" for="sel1">Đến ngày</label>
			<div class="col-xs-3">
				<div class="input-group">
					<input type="text" id="dateNgayTaiDenNgay" name="dateNgayTaiDenNgay" onclick="gtCalendar('dateNgayTaiDenNgay')" value="<%=dateNgayTaiDenNgay%>" class="form-control">
						<span class="input-group-addon" onclick="gtCalendar('dateNgayTaiDenNgay')"><i class="fa fa-calendar"></i></span>
				</div>
			</div>
		</div>
		
		<div class="col-xs-12 form-group">
			<button class="btn btn-primary" type="button" onclick="summitForm('<%=actionUrlTimKiemFile%>')">Tìm kiếm</button>
		</div>
		
		<%
	} else if(maPhanNhomHoSo.trim().equalsIgnoreCase(Constants.MA_PHAN_NHOM_QUAN_LY_FILE_GIAY_TO_DUOC_CAP)) {
		%>
		
		<h5 class="col-xs-12"> <i class="pull-left fa fa-chevron-right fa-1"></i><b>Thông tin Giấy tờ được cấp</b> </h5>
		
		<div class="col-xs-12">
			<label class="col-xs-2" for="tenGiayTo">Tên giấy tờ/Số giấy tờ:</label>
			<div class="col-xs-10">
				<input type="text" id="tenGiayTo" name="tenGiayTo" class="form-control" placeholder="Nhập tên giấy tờ/số giấy tờ...."/>
			</div>
		</div>
		
		<div class="col-xs-12">
			<label class="col-xs-2" for="selTrangThai">Tình trạng:</label>
			<div class="col-xs-10">
				<select id="selTrangThai" name="selTrangThai" class="form-control">
					<option value="">--Chọn trạng thái--</option>
					<%
					for (String loaiTrangThai :listTrangThaiChung) {
						String ten ="";
						if (loaiTrangThai.equalsIgnoreCase(Constants.QUAN_LY_FILE_TRANG_THAI_CON_HIEU_LUC)) {
							ten = "Còn hiệu lực";
						} else if (loaiTrangThai.equalsIgnoreCase(Constants.QUAN_LY_FILE_TRANG_THAI_HET_HIEU_LUC)) {
							ten = "Hết hiệu lực";
						}
						%>
						<option value="<%=loaiTrangThai%>" <%=loaiTrangThai.equals(selTrangThai) ? "selected='selected'" : ""%> ><%=ten %></option>
						<%
					}
					%>
				</select>
			</div>
		</div>
		
		<div class="col-xs-12">
			<label class="col-xs-2" for="">Ngày cấp:</label>
			<label class="col-xs-2" for="">Từ ngày</label>
			<div class="col-xs-3">
				<div class="input-group">
					<input type="text" id="dateNgayTaiTuNgay" name="dateNgayCapTuNgay" onclick="gtCalendar('dateNgayCapTuNgay')" value="<%=dateNgayCapTuNgay%>" class="form-control">
					<span class="input-group-addon" onclick="gtCalendar('dateNgayCapTuNgay')"><i class="fa fa-calendar"></i></span>
				</div>
			</div>
			<label class="col-xs-2" for="sel1">Đến ngày</label>
			<div class="col-xs-3">
				<div class="input-group">
					<input type="text" id="dateNgayCapDenNgay" name="dateNgayCapDenNgay" onclick="gtCalendar('dateNgayTaiDenNgay')" value="<%=dateNgayCapDenNgay%>" class="form-control">
						<span class="input-group-addon" onclick="gtCalendar('dateNgayCapDenNgay')"><i class="fa fa-calendar"></i></span>
				</div>
			</div>
		</div>
		
		<div class="col-xs-12">
			<label class="col-xs-2" for="">Ngày hết hạn:</label>
			<label class="col-xs-2" for="">Từ ngày</label>
			<div class="col-xs-3">
				<div class="input-group">
					<input type="text" id="dateNgayTaiTuNgay" name="dateNgayHetHanTuNgay" onclick="gtCalendar('dateNgayHetHanTuNgay')" value="<%=dateNgayHetHanTuNgay%>" class="form-control">
					<span class="input-group-addon" onclick="gtCalendar('dateNgayHetHanTuNgay')"><i class="fa fa-calendar"></i></span>
				</div>
			</div>
			<label class="col-xs-2" for="sel1">Đến ngày</label>
			<div class="col-xs-3">
				<div class="input-group">
					<input type="text" id="dateNgayTaiDenNgay" name="dateNgayHetHanDenNgay" onclick="gtCalendar('dateNgayHetHanDenNgay')" value="<%=dateNgayHetHanDenNgay%>" class="form-control">
						<span class="input-group-addon" onclick="gtCalendar('dateNgayHetHanDenNgay')"><i class="fa fa-calendar"></i></span>
				</div>
			</div>
		</div>
		
		<div class="col-xs-12 form-group">
			<button class="btn btn-primary" type="button" onclick="summitForm('<%=actionUrlTimKiemFile%>')">Tìm kiếm</button>
		</div>
		<%
	}
	%>
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