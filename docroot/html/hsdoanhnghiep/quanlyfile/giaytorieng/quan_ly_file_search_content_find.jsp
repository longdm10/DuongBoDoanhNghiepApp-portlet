
<%@page import="vn.dtt.duongbo.business.Constants"%>
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
	<div class="box_select">
	<!-- Start Input -->
				<div style="margin-bottom:10px">
					<p style="width:17%; float:left; margin-right:2%; line-height:25px">Tên giấy tờ: </p>
					<input style="width:79.5%; float:left; height:21px" type="text" id="tenGiayTo" name="tenGiayTo" placeholder="Nhập tên giấy tờ....">
					<div style="clear:both"></div>
				</div>
				<!-- Start
				<div style="margin-bottom:10px">
					<p style="width:17%; float:left; margin-right:2%; line-height:25px">Tình trạng:</p>
						<select style="width:81%; float:left; height:30px" id="selTrangThai" name="selTrangThai">
								<option value="">--Chọn tình trạng--</option>
								<%
							for(String loaiTrangThai :listTrangThaiRieng){
									String ten ="";
									if(loaiTrangThai.equalsIgnoreCase(Constants.QUAN_LY_FILE_TRANG_THAI_DANG_SU_DUNG)){
										ten = "Đang sử dụng";
									}else if(loaiTrangThai.equalsIgnoreCase(Constants.QUAN_LY_FILE_TRANG_THAI_KHONG_SU_DUNG)){
										ten = "Không sử dụng";
									} 
									%>
									<option value="<%=loaiTrangThai%>" <%=loaiTrangThai.equals(selTrangThai) ? "selected='selected'" : ""%> ><%=ten %></option>
									<%
								}
								%>
						</select>
					
					<div style="clear:both"></div>
				</div>
				<div style="margin-bottom:10px">
					<p style="width:17%; float:left; line-height:25px; margin-right:2%">Ngày tải:</p>
					<div style="width:81%; line-height:25px; float:left">
						<p style="float:left; margin-right:2%; width:10%">Từ ngày</p>
						<div style="width:35.5%; float:left; margin-right:5%; position:relative">
							<input style="width:100%; float:left; height:25px; box-sizing:border-box" type="text" value="" id="dateNgayTaiTuNgay" name="dateNgayTaiTuNgay" onclick="gtCalendar('dateNgayTaiTuNgay')">
							<img style="border-left: 1px solid #a9a9a9; cursor: pointer; float: right; height: 15px; margin-left: -25px; padding: 5px; position: absolute; z-index: 1;" src="<%=request.getContextPath()%>/img/date.png" onclick="gtCalendar('dateNgayTaiTuNgay')">
						</div>
						
						
						<p style="width:10%; float:left; margin-right:2%">Đến ngày</p>
						<div style="width:35.5%; float:left; position:relative">
							<input style="width:100%; float:left; height:25px; box-sizing:border-box" type="text" id="dateNgayTaiDenNgay" name="dateNgayTaiDenNgay" onclick="gtCalendar('dateNgayTaiDenNgay') ">
							<img style="border-left: 1px solid #a9a9a9; cursor: pointer; float: right; height: 15px; margin-left: -25px; padding: 5px; position: absolute; z-index: 1;" src="<%=request.getContextPath()%>/img/date.png" onclick="gtCalendar('dateNgayTaiDenNgay')">
						</div>
					</div>						
					<div style="clear:both"></div>
				</div>
				 Input -->
				<input class="button2" style="margin:0; float:none" type="button" onclick="summitForm('<%=actionUrlTimKiemFile%>')" value="Tìm kiếm">
	<!-- End Input -->
	</div>
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