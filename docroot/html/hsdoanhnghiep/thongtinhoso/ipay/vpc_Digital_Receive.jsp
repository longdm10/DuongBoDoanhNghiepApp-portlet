<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcXacNhanThanhToanImpl"%>
<%@page import="vn.dtt.duongbo.ipay.KeyPayUtils"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@page import="vn.dtt.duongbo.utils.format.ConvertUtil"%>
<%@page import="vn.dtt.duongbo.dao.thanhtoan.service.ThanhToanKeyPayLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan"%>
<%@page import="vn.dtt.duongbo.dao.thanhtoan.service.TthcXacNhanThanhToanLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.thanhtoan.model.ThanhToanKeyPay"%>
<%@page import="vn.dtt.duongbo.ipay.HashFunction"%>
<%@page import="vn.dtt.duongbo.utils.config.DuongBoConfigurationManager"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepUserLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Collections"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/html/init.jsp" %>

<link rel="stylesheet" href="<%=request.getContextPath()%>/css/tipsy.css"
	type="text/css" media="screen" />
<link rel="stylesheet"	href="<%=request.getContextPath()%>/css/jquery.alerts.css"
	type="text/css" media="screen" />	
<link rel="stylesheet"	href="<%=request.getContextPath()%>/css/jquery-ui.css"
	type="text/css" media="screen" />

<%@ page import="java.util.Iterator,java.util.Enumeration,java.security.MessageDigest,java.util.Map,java.net.URLEncoder,java.util.HashMap"%>

<%
	PortletURL test_url = renderResponse.createRenderURL();
	test_url.setParameter("jspPage", "/html/ipay/index.jsp");
	String message = "";
	long userId = PortalUtil.getUserId(request);
	long doanhNghiepId = 0;
	DnDoanhNghiepUser doanhNghiepUser = DnDoanhNghiepUserLocalServiceUtil.findByUserId(userId);
	doanhNghiepId = doanhNghiepUser.getNguoiLamThuTucId();
    
        // Extract the available receipt fields from the VPC Response
        // If not present then let the value be equal to 'Unknown'
        // Standard Receipt Data
        String amount          = request.getParameter("net_cost");//net_cost
        String bankCode          = request.getParameter("bank_code");
        String command         = request.getParameter("command");
        String orderInfo       = request.getParameter("good_code");//good_code
        String merchantCode      = request.getParameter("merchant_code"); //merchant_code
        String merchTxnRef     = request.getParameter("merchant_trans_id");//merchant_trans_id
        String txnResponseCode = request.getParameter("response_code");//response_code
        String merchantTransId = request.getParameter("merchant_trans_id");
        String trans_id = request.getParameter("trans_id");
        String ship_fee = request.getParameter("ship_fee");
        String tax = request.getParameter("tax");
        String service_code = request.getParameter("service_code");
        String currency_code = request.getParameter("currency_code");
        String secure_hash = request.getParameter("secure_hash");
        
        String xmlDescription = request.getParameter("xml_description");
        
        Map<String, String> fields = new HashMap<String, String>();
        fields.put("command", command);
        fields.put("merchant_trans_id", merchTxnRef);
        fields.put("merchant_code", merchantCode);
        fields.put("response_code", txnResponseCode);
        fields.put("trans_id", trans_id);
        fields.put("good_code", orderInfo);
        fields.put("net_cost", amount);
        fields.put("ship_fee", ship_fee);
        fields.put("tax", tax);
        fields.put("service_code", service_code);
        fields.put("currency_code", currency_code);
        
        if (request.getParameterMap().containsKey("bank_code")) {
            if (bankCode != null && !bankCode.equals("null")) {
                fields.put("bank_code", bankCode);
            }
        }
        String merchant_key = DuongBoConfigurationManager.getStrProp("vn.keypay.merchant_key", "111111") ;
        HashFunction hf = new HashFunction();
        String sc = hf.hashAllFields(fields, merchant_key);
        if (sc.equals(secure_hash)) {
            if (txnResponseCode.equals("00")) {
                message = "Pay successful !";
            } else {
                message = "Pay fail";
            }
        } else {
            message = "Chuỗi mã hóa trả về không hợp lệ !";
        }
        System.out.println("message tra ve shash: " + message);
        String error = "";
    	ThanhToanKeyPay thanhToanKeyPayReq = null;
    	boolean trangThaiThanhToan = true;
    	
    	TthcXacNhanThanhToan xacNhanThanhToan = TthcXacNhanThanhToanLocalServiceUtil.findByMaTuSinh(orderInfo.trim());
        if (xacNhanThanhToan != null && xacNhanThanhToan.getTrangThaiXacNhan() == Constants.MTYT_XAC_NHAN_THANH_TOAN_HOP_LE) {
        	trangThaiThanhToan = false;	// Hoso da duoc thanh toan
        }
        
        thanhToanKeyPayReq = ThanhToanKeyPayLocalServiceUtil.findByGoodCodeAndMerchantCodeAndMerchantTransIdAndLoaiMessage(orderInfo.trim(), merchantCode.trim(), merchantTransId.trim(), GetterUtil.getInteger(Constants.KEYPAY_REQUEST));
        
        if(thanhToanKeyPayReq!=null && xacNhanThanhToan != null){
        	 KeyPayUtils.addThanhToanKeyPay(doanhNghiepId, merchTxnRef, GetterUtil.getLong(trans_id), merchantCode, bankCode, GetterUtil.getLong(ship_fee), currency_code, xmlDescription, GetterUtil.getLong(amount), orderInfo, txnResponseCode, thanhToanKeyPayReq.getThongTinHoSo(), Constants.KEYPAY_RESPONSE, Constants.KEYPAY_NORMAL_RECEIVER);
             
             String thongTinHoSo = thanhToanKeyPayReq.getThongTinHoSo();
             long amountInRequest = thanhToanKeyPayReq.getAmount();
             System.out.println("lay thongTinHoSo tu kepay_log : " + thongTinHoSo);
             System.out.println("trangThaiThanhToan : " + trangThaiThanhToan);
             System.out.println("txnResponseCode : " + txnResponseCode);
     	   	
             if(trangThaiThanhToan && txnResponseCode!= null && txnResponseCode.length() > 0 && txnResponseCode.equals("00")) {
     	        
     			KeyPayUtils.xacNhanThanhToanHoSo(xacNhanThanhToan.getId(), txnResponseCode, 0, Constants.THANH_TOAN_KEYPAY);
     	   	}
     	   	
     	   	String ketQuaGiaDichStr = "";
     	   	if(txnResponseCode!= null && txnResponseCode.length() >0 && txnResponseCode.equals("00")){
     	   		ketQuaGiaDichStr = "Bạn đã giao dịch thành công";
     	   	} else{
     	   		ketQuaGiaDichStr = "Bạn đã giao dịch không thành công";
     	   	}
     	   	
     	   	PortletURL thanhToanTrucTuyenUrl = renderResponse.createRenderURL();
     	   	thanhToanTrucTuyenUrl.setParameter("jspPage", "/html/hsdoanhnghiep/quanlyhoso/ipay/thanh_toan_truc_tuyen.jsp");
     	   	
     	   	PortletURL viewUrl = renderResponse.createRenderURL();
     	   	viewUrl.setParameter("jspPage", "/html/hsdoanhnghiep/view.jsp");
     	   	%>
     	   		<section class="right">
					<div class="title_right">Kết quả thanh toán trực tuyến</div>
					<div class="box">
						<div class="main_chuanbihs">
							<h5>Thông tin kết quả thanh toán: <span class="red"><%= ketQuaGiaDichStr %></span></h5>
							<div style="margin:20px 0" class="don">
								<div style="float:left; width:25%; margin-right:3%">
									<p class="spectex4">Mã hóa đơn:</p>
									<input style="margin-top: -5px;" type="text" value="<%=merchTxnRef%>" disabled>
								</div>
								<div style="float:left; width:44%; margin-right:3%">
									<p class="spectex4">Tổng số tiền:</p>
									<input style="margin-top: -5px;" type="text" value="<%=amount%>" disabled>
								</div>
								<div style="float:left; width:25%">
									<p class="spectex4">Thông tin đơn hàng:</p>
									<input style="margin-top: -5px;" type="text" value="<%=orderInfo%>" disabled>
								</div>
								<div style="float:left; width:25%">
									<p class="spectex4" style="margin-top: 15px;">Mã kết quả giao dịch:</p>
									<input style="margin-top: -5px;" type="text" value="<%=txnResponseCode%>" disabled>
								</div>
								<div style="margin:42px 30px; float:left">
								<%if(txnResponseCode!= null && txnResponseCode.length() >0 && txnResponseCode.equals("00")){
								%>
									<input class="button4" style="margin-top: 17px;" type="submit" value="Trở về" onclick="window.location.href='<%=viewUrl.toString()%>'"/>
								<%
								} else{
								%>
									<input class="button4" type="button" style="margin-top: 17px;" value="Thanh toán giao dịch mới" onclick="window.location.href='<%=thanhToanTrucTuyenUrl.toString()%>'"/>
									<input class="button4" type="submit" style="margin-top: 17px;" value="Trở về" onclick="window.location.href='<%=viewUrl.toString()%>'"/>
								<%
								}
								%>
									
								</div>
							</div>
							<p style="height:1px; margin:80px"></p>
						</div>
					</div>
				</section>
     	   	<%
        }
        
       
	   	
   %>


<%//ThanhToanDienTuUtils.insertThanhToanDienTu(lichSuThanhToanDienTu); %>
