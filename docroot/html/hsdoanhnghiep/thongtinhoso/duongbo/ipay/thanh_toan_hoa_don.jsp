
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@ include file="/html/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<link rel="stylesheet" href="<%=request.getContextPath()%>/css/tipsy.css"
	type="text/css" media="screen" />
<link rel="stylesheet"	href="<%=request.getContextPath()%>/css/jquery.alerts.css"
	type="text/css" media="screen" />	
<link rel="stylesheet"	href="<%=request.getContextPath()%>/css/jquery-ui.css"
	type="text/css" media="screen" />


<%
System.out.println("/hsdoanhnghiep/thongtinhoso/ipay/thanh_toan_hoa_don.jsp");
long thuTucHanhChinhId = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
long payAmount = ParamUtil.getLong(request, Constants.VPC_AMOUNT);
String listNoiDungHoSo = ParamUtil.getString(request, Constants.DANH_SACH_NOI_DUNG_HO_SO);

PortletURL actionUploadFileHoaDon = renderResponse.createActionURL();
actionUploadFileHoaDon.setParameter(ActionRequest.ACTION_NAME, "thanhToanHSByUploadBill");
actionUploadFileHoaDon.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
actionUploadFileHoaDon.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
actionUploadFileHoaDon.setParameter(Constants.VPC_AMOUNT, String.valueOf(payAmount));

PortletURL thanhPhanHoSoUrl = renderResponse.createRenderURL();
thanhPhanHoSoUrl.setParameter("jspPage", "/html/hsdoanhnghiep/thongtinhoso/thanh_phan_ho_so.jsp");
thanhPhanHoSoUrl.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
thanhPhanHoSoUrl.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
thanhPhanHoSoUrl.setParameter(Constants.DANH_SACH_NOI_DUNG_HO_SO, listNoiDungHoSo);

%>
<section class="right">
	<div class="title_right">Thanh toán hóa đơn</div>
	<div class="box">
		<div class="main_chuanbihs">
			<p class="spectex">Tải biên lai</p>
			<div class="form_bienlai">
				<form name="myForm" id="myForm" action="<%=actionUploadFileHoaDon %>" method="POST" enctype="multipart/form-data">
					<p>Số tiền:<input type="text" style="margin-right: 1px; float: right;" name="soTien" id="soTien" value="<%=payAmount%>" readonly="readonly"></p>
					<p>Số hóa đơn:<input type="text" style="margin-right: 1px; float: right;" name="soHoaDon" id="soHoaDon"></p>
					<p>Tải hóa đơn: <span style="color:red">(*)</span>
						<input style="position: static !important; margin-left: 21px;" name="attachment" id="attachment" type="file" label="Chọn file upload"> 
					</p>
					<div style="margin-top: -3px;float: left; margin-left: 110px;">
						<input class="button6" type="button" value="Lưu lại" onclick="summitForm('<%=actionUploadFileHoaDon%>')"/>
						<input class="button6" type="button" value="Quay lại" onclick="window.location.href='<%=thanhPhanHoSoUrl.toString()%>'" style="margin-left: 10px"/>
					</div>
					
				</form>
			</div>
		</div>
	</div>
</section>
<script type="text/javascript">
function summitForm(url) {
		var fileUpl = document.getElementById("attachment").value;
		if(fileUpl == ''){
			alert("Chưa tải file lên");
			return;
		} 
		$('#myForm').action = url;
		$('#myForm').submit();
	}
</script>