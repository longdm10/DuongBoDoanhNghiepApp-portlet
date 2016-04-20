
<%@page import="vn.dtt.duongbo.utils.DoanhNghiepUtils"%>
<%@page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@page import="vn.dtt.duongbo.dao.thanhtoan.service.TthcXacNhanThanhToanLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@ include file="/html/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<link rel="stylesheet" href="<%=request.getContextPath()%>/css/tipsy.css" type="text/css" media="screen" />
<link rel="stylesheet"	href="<%=request.getContextPath()%>/css/jquery.alerts.css" type="text/css" media="screen" />	
<link rel="stylesheet"	href="<%=request.getContextPath()%>/css/jquery-ui.css" type="text/css" media="screen" />

<%
long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
long thuTucHanhChinhId = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
long payAmount = ParamUtil.getLong(request, Constants.VPC_AMOUNT);
String backURL = ParamUtil.getString(request, "backURL");

TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.getTthcHoSoThuTuc(hoSoThuTucId);

PortletURL actionUploadFileHoaDon = renderResponse.createActionURL();
actionUploadFileHoaDon.setParameter(ActionRequest.ACTION_NAME, "thanhToanHSByUploadBill");
actionUploadFileHoaDon.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
actionUploadFileHoaDon.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
actionUploadFileHoaDon.setParameter(Constants.VPC_AMOUNT, String.valueOf(payAmount));

boolean thanhToan = false;
TthcXacNhanThanhToan xacNhanThanhToan = TthcXacNhanThanhToanLocalServiceUtil.findByMaTuSinh(hoSoThuTuc.getMaSoHoSo());
	
if(xacNhanThanhToan != null && xacNhanThanhToan.getTrangThaiXacNhan() == Constants.MTYT_XAC_NHAN_THANH_TOAN_HOP_LE) {
	thanhToan = true;
}

%>
<c:choose>
	<c:when test="<%= thanhToan %>">
		<h4 class="PL15 BGT BOB font14 col-xs-12">Thanh toán hóa đơn</h4>
		<div class="P10 col-xs-12">
			<div class="BGT noidung">
				<div class="col-xs-12">
					<h3>Hồ sơ đã được thanh toán</h3>
					<input type="button" class="btn btn-primary" value="Quay lại" onclick="window.location.href='<%=backURL%>'">
				</div>
			</div>
		</div>
	</c:when>
	<c:otherwise>
		<h4 class="PL15 BGT BOB font14 col-xs-12">Thanh toán hóa đơn</h4>
		<div class="P10 col-xs-12">
			<div class="BGT noidung">
				<div class="col-xs-12">
					<aui:form method="POST" action="<%=actionUploadFileHoaDon %>" name="myForm" id="myForm" enctype="multipart/form-data">
						<div class="col-xs-12 form-group">
							<h3>Tải biên lai</h3>
						</div>
						<div class="col-xs-12 form-group">
							<label class="textlabel col-xs-2">Số tiền :</label>
							<label class="col-xs-10 textlabel"><%= DoanhNghiepUtils.getMoney(String.valueOf(payAmount)) %></label>
						</div>
						<div class="clear"></div>
						<div class="col-xs-12 form-group">
							<label class="textlabel col-xs-2">Số hóa đơn :<span style="color:red">(*)</span></label>
							<div class="col-xs-10 textlabel">
								<input type="text" name="<portlet:namespace />soHoaDon" id="<portlet:namespace />soHoaDon" class="form-control">
							</div>
						</div>
						<div class="clear"></div>
						<div class="col-xs-12 form-group">
							<label class="textlabel col-xs-2">File hóa đơn :<span style="color:red">(*)</span></label>
							<div class="col-xs-10 textlabel">
								<input style="position: static !important;" name="<portlet:namespace />attachment" id="<portlet:namespace />attachment" type="file"> 
							</div>
						</div>
						
						<div class="clear"></div>
						
						<input class="button btn btn-primary" type="button" value="Lưu lại" onclick="summitForm('<%=actionUploadFileHoaDon%>')"/>
						<input class="button btn btn-primary" type="button" value="Quay lại" onclick='window.location.href="<%=HtmlUtil.escape(backURL)%>"'/>
					</aui:form>
					
					<script type="text/javascript">
						function summitForm(url) {
							var fileUpl = document.getElementById("<portlet:namespace />attachment").value;
							var soHoaDon = document.getElementById("<portlet:namespace />soHoaDon").value;
							
							if(soHoaDon == '') {
								alert("Chưa nhập số hóa đơn !");
								return;
							}
							
							if(fileUpl == ''){
								alert("Chưa tải file lên");
								return;
							} 
							
							document.getElementById('<portlet:namespace />myForm').action = url;
							document.getElementById('<portlet:namespace />myForm').submit();
						}
					</script>
				</div>
			</div>
		</div>
	</c:otherwise>
</c:choose>
