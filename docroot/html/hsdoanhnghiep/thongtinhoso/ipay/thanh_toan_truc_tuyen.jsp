
<%@page import="vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan"%>
<%@page import="vn.dtt.duongbo.dao.thanhtoan.service.TthcXacNhanThanhToanLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="vn.dtt.duongbo.utils.config.DuongBoConfigurationManager"%>
<%@page import="vn.dtt.duongbo.dao.thanhtoan.service.ThanhToanKeyPayLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.thanhtoan.model.ThanhToanKeyPay"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ include file="/html/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.Date"%>

<link rel="stylesheet" href="<%=request.getContextPath()%>/css/tipsy.css" type="text/css" media="screen" />
<link rel="stylesheet"	href="<%=request.getContextPath()%>/css/jquery.alerts.css" type="text/css" media="screen" />	
<link rel="stylesheet"	href="<%=request.getContextPath()%>/css/jquery-ui.css" type="text/css" media="screen" />
<%
	long userId = PortalUtil.getUserId(request);
    SimpleDateFormat sdf1 = new SimpleDateFormat("HHmmss");
    Date curDate = new Date();

    long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
    long thuTucHanhChinhId = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
    long payAmount = ParamUtil.getLong(request, Constants.VPC_AMOUNT);
    String backURL = ParamUtil.getString(request, "backURL");
    
    TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.getTthcHoSoThuTuc(hoSoThuTucId);
    
    Calendar calendar = Calendar.getInstance();
    String goodCode = hoSoThuTuc.getMaSoHoSo();
    
    String xml_description = "";
    String thongTinHoSo = hoSoThuTuc.getMaSoHoSo();

	List<ThanhToanKeyPay> listKeyPay = ThanhToanKeyPayLocalServiceUtil.findByGoodCode(goodCode);

	// check da thanh toan cho goodcode nay chưa, neu thanh toan roi thi thoi
	boolean thanhToan = false;
	//TODO: DOan nay k hieu lam
    /* if (listKeyPay != null && listKeyPay.size() > 0) {
        if (listKeyPay.get(0).getResponseCode().trim().compareTo("00") == 0) {
        	thanhToan = false;
        }
    } */
    
	TthcXacNhanThanhToan xacNhanThanhToan = TthcXacNhanThanhToanLocalServiceUtil.findByMaTuSinh(hoSoThuTuc.getMaSoHoSo());

	if(xacNhanThanhToan != null && xacNhanThanhToan.getTrangThaiXacNhan() == Constants.MTYT_XAC_NHAN_THANH_TOAN_HOP_LE) {
		thanhToan = true;
	}

	// Chu y neu tien nho hon 1000 se bi loi.

	PortletURL return_url = renderResponse.createRenderURL();
	return_url.setParameter("jspPage", "/html/hsdoanhnghiep/thongtinhoso/ipay/vpc_Digital_Receive.jsp");
	
	PortletURL callUrl = renderResponse.createRenderURL();
	callUrl.setParameter("jspPage", "/html/hsdoanhnghiep/thongtinhoso/ipay/vpc_Digital_Order.jsp");
%>
<c:choose>
	<c:when test="<%= thanhToan %>">
		<h4 class="PL15 BGT BOB font14 col-xs-12">Thanh toán trực tuyến</h4>
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
		<h4 class="PL15 BGT BOB font14 col-xs-12">Thanh toán trực tuyến</h4>
		<div class="P10 col-xs-12">
			<div class="BGT noidung">
				<div class="col-xs-12">
					<form action="<%= callUrl.toString() %>" method="post" name="myForm" id="<portlet:namespace />myForm">
						<div style="display: none;">>
							<input type="hidden" name="Title" value="VPC 3-Party" disabled />
							<input type="hidden" name="xml_description" value="<%=xml_description %>">
							<input type="hidden" name="thongTinHoSo" value="<%=thongTinHoSo %>">
							<input type="hidden" name="bank_code" value="">
							<input type="hidden" name="merchant_code" value="<%=DuongBoConfigurationManager.getStrProp("vn.keypay.merchant_code", "312")%>"/>
							<input type="hidden" name="merchant_trans_id" value="<%= sdf1.format(curDate) %>" />
							<input type="hidden" name="good_code" value="<%= goodCode %>"/>
							<input type="hidden" name="net_cost" value="<%=payAmount%>"/>
							<input type="hidden" name="return_url" value="<%=return_url %>"/>
							<input type="hidden" name="version" value="1.0"/>
							<input type="hidden" name='command' value='pay'/>
							<input type="hidden" name='current_locale' value='vn'/>
							<input type="hidden" name="currency_code" value='704'/>
							<input type="hidden" name="service_code" value="720"/>
							<input type="hidden" name="ship_fee" value="0">
							<input type="hidden" name="tax" value="0">
							<input type="hidden" name="country_code" value="+84">
						</div>
					</form>
					
					<script type="text/javascript">
						document.getElementById('<portlet:namespace />myForm').submit();
					</script>
				</div>
			</div>
		</div>
	</c:otherwise>
</c:choose>