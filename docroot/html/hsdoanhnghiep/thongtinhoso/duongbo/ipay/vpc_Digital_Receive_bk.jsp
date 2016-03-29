<%@page import="com.liferay.counter.service.CounterLocalServiceUtil"%>
<%@page import="vn.dtt.yte.dao.doanhnghiep.model.impl.TthcXacNhanThanhToanImpl"%>
<%@page import="vn.dtt.yte.dao.doanhnghiep.model.TthcXacNhanThanhToan"%>
<%@page import="vn.dtt.yte.business.Constants"%>
<%@page import="vn.dtt.yte.ipay.KeyPayUtils"%>
<%@page import="vn.dtt.yte.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.yte.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="vn.dtt.yte.utils.format.ConvertUtil"%>
<%@page import="vn.dtt.yte.dao.doanhnghiep.service.ThanhToanKeyPayLocalServiceUtil"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.yte.ipay.HashFunction"%>
<%@page import="vn.dtt.yte.utils.config.YTeConfigurationManager"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Collections"%>
<%@page import="vn.dtt.yte.dao.doanhnghiep.model.ThanhToanKeyPay"%>

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

    
        // Extract the available receipt fields from the VPC Response
        // If not present then let the value be equal to 'Unknown'
        // Standard Receipt Data
        String amount          = request.getParameter("net_cost");//net_cost
        String locale1          = request.getParameter("bank_code");
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
            if (locale1 != null && !locale1.equals("null")) {
                fields.put("bank_code", locale1);
            }
        }
        
        System.out.println("----------secure_hash in receive--------------" + secure_hash);
         
		String merchant_key = YTeConfigurationManager.getStrProp("vn.keypay.merchant_key", "111111") ;
		System.out.println("----------merchant_key in receive--------------" + merchant_key);
		
        HashFunction hf = new HashFunction();
        String sc = hf.hashAllFields(fields, merchant_key);
        System.out.println("----------sc in receive--------------" + sc);
        if (sc.equals(secure_hash)) {
            if (txnResponseCode.equals("00")) {
                message = "Pay successful !";
            } else {
                message = "Pay fail";
            }
        } else {
            message = "Chuỗi mã hóa trả về không hợp lệ !";
        }
        System.out.println("----------messagee--------------" + message);
        String error = "";
    	List<ThanhToanKeyPay> liKeyPays = ThanhToanKeyPayLocalServiceUtil.findByGoodCode(orderInfo);
    	ThanhToanKeyPay thanhToanKeyPay = null;
    	boolean trangThaiThanhToan = true;
        if (liKeyPays != null && liKeyPays.size() > 0) {
        	System.out.println("ton tai du lieu log keypay");
        	for(int i= 0; i< liKeyPays.size(); i++){
        		thanhToanKeyPay = liKeyPays.get(i);
        		if (thanhToanKeyPay.getResponseCode().trim().equalsIgnoreCase("00")) {
                	trangThaiThanhToan = false;	// Hoso da duoc thanh toan
                	break;
                }
        	}
        	thanhToanKeyPay = null;
        }
        
        thanhToanKeyPay = KeyPayUtils.updateThanhToanKeyPay(orderInfo, merchTxnRef, merchantCode, txnResponseCode, 
        		ConvertUtil.convertToLong(trans_id), ConvertUtil.convertToLong(amount), Long.parseLong(ship_fee), currency_code, locale1);
        
        String xmlDescription = thanhToanKeyPay.getXmlDescription();
        long amountInRequest = thanhToanKeyPay.getAmount();
        System.out.println("lay xml tu kepay_log : " + xmlDescription);
        System.out.println("trangThaiThanhToan : " + trangThaiThanhToan);
        System.out.println("txnResponseCode : " + txnResponseCode);
        
		
		String listNoiDungHoSo = xmlDescription.substring(0, xmlDescription.indexOf("_"));
        String thuTucHanhChinhId = xmlDescription.substring(xmlDescription.indexOf("_", 0) + 1,xmlDescription.lastIndexOf("_"));
	   	String hoSoThuTucId= xmlDescription.substring(xmlDescription.lastIndexOf("_") + 1, xmlDescription.length());
	   	
        if(trangThaiThanhToan && txnResponseCode!= null && txnResponseCode.length() > 0 && txnResponseCode.equals("00")) {
	        System.out.println("vpc_Digital_Receive.jsp>>>>>>>>>>>>>>>>>>> ID ho so= " + hoSoThuTucId + " ,orderinfo= " + orderInfo + "==amount:" + amount);
	        TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(Long.parseLong(hoSoThuTucId));
	        System.out.println("vao ghi xac nhan thanh toan cho : " + hoSoThuTucId);
	        // Truong hop thanh toan cho HoSoTTHCCong
	        if (hoSoThuTuc != null) {
	        	try{
	        		hoSoThuTuc.setTrangThaiHoSo("0");
	        		hoSoThuTuc.setPhanNhomHoSoId(15);
	        		hoSoThuTuc.setNgayGuiHoSo(new Date());
	        		TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(hoSoThuTuc);
	        		 System.out.println("Khoi tao xac nhan thanh toan: ");
	        		TthcXacNhanThanhToan xacNhanThanhToan = new TthcXacNhanThanhToanImpl();
	    			xacNhanThanhToan.setHinhThucThanhToan(Constants.THANH_TOAN_KEYPAY);
	    			xacNhanThanhToan.setSoTien(Long.parseLong(amount));
	    			xacNhanThanhToan.setThongTinXacNhan(txnResponseCode);
	    			xacNhanThanhToan.setMaTuSinh(orderInfo);
	    			xacNhanThanhToan.setNgayTao(new Date());
	    			xacNhanThanhToan.setLoaiPhi(Constants.PHI_THAM_DINH_CODE);
	    			xacNhanThanhToan.setNguoiTao(PortalUtil.getUserId(request));
	    			
	                KeyPayUtils.addXacNhanThanhToan(Long.parseLong(hoSoThuTucId), xacNhanThanhToan);
	            }catch(Exception e){
	                e.printStackTrace();
	            }
	        	System.out.println("=======vpc_Digital_Receive.jsp========Thanh toan phi online cho ho so HoSoTTHCCong co ID:::" + hoSoThuTucId);
	        }
	   	}
	   	
	   	
	   	String ketQuaGiaDichStr = "";
	   	if(txnResponseCode!= null && txnResponseCode.length() >0 && txnResponseCode.equals("00")){
	   		ketQuaGiaDichStr = "Bạn đã giao dịch thành công";
	   	} else{
	   		ketQuaGiaDichStr = "Bạn đã giao dịch không thành công";
	   	}
	   	
	   	PortletURL thanhToanTrucTuyenUrl = renderResponse.createRenderURL();
	   	thanhToanTrucTuyenUrl.setParameter("jspPage", "/html/hsdoanhnghiep/thongtinhoso/ipay/thanh_toan_truc_tuyen.jsp");
	   	thanhToanTrucTuyenUrl.setParameter(Constants.ID_THU_TUC_HANH_CHINH, thuTucHanhChinhId);
	   	thanhToanTrucTuyenUrl.setParameter(Constants.ID_HO_SO_THU_TUC, hoSoThuTucId);
	   	thanhToanTrucTuyenUrl.setParameter(Constants.VPC_AMOUNT, String.valueOf(amountInRequest));
	   	thanhToanTrucTuyenUrl.setParameter(Constants.DANH_SACH_NOI_DUNG_HO_SO, listNoiDungHoSo);
	   	
	   	PortletURL thanhPhanHoSoUrl = renderResponse.createRenderURL();
	   	thanhPhanHoSoUrl.setParameter("jspPage", "/html/hsdoanhnghiep/thongtinhoso/thanh_phan_ho_so.jsp");
	   	thanhPhanHoSoUrl.setParameter(Constants.ID_THU_TUC_HANH_CHINH, thuTucHanhChinhId);
	   	thanhPhanHoSoUrl.setParameter(Constants.ID_HO_SO_THU_TUC, hoSoThuTucId);
	   	thanhPhanHoSoUrl.setParameter(Constants.DANH_SACH_NOI_DUNG_HO_SO, listNoiDungHoSo);
	   	
	   	PortletURL finishUrl = renderResponse.createRenderURL();
	   	finishUrl.setParameter("jspPage", "/html/hsdoanhnghiep/thongtinhoso/danhsach_dichvucong_tructuyen.jsp");
	   	finishUrl.setParameter(Constants.ID_THU_TUC_HANH_CHINH, thuTucHanhChinhId);
	   	finishUrl.setParameter(Constants.ID_HO_SO_THU_TUC, hoSoThuTucId);
   %>

<section class="right">
	<div class="title_right">Kết quả thanh toán trực tuyến</div>
	<div class="box">
		<div class="main_chuanbihs">
			<h5>Thông tin kết quả thanh toán: <span class="red"><%= ketQuaGiaDichStr %></span></h5>
			<div style="margin:20px 0" class="don">
				<div style="float:left; width:25%; margin-right:3%">
					<p class="spectex4">Mã hóa đơn:</p>
					<input type="text" value="<%=merchTxnRef%>" disabled>
				</div>
				<div style="float:left; width:44%; margin-right:3%">
					<p class="spectex4">Tổng số tiền:</p>
					<input type="text" value="<%=amount%>" disabled>
				</div>
				<div style="float:left; width:25%">
					<p class="spectex4">Thông tin đơn hàng:</p>
					<input type="text" value="<%=orderInfo%>" disabled>
				</div>
				<div style="float:left; width:25%">
					<p class="spectex4">Mã kết quả giao dịch:</p>
					<input type="text" value="<%=txnResponseCode%>" disabled>
				</div>
				<div style="margin:27px 30px; float:left">
				<%if(txnResponseCode!= null && txnResponseCode.length() >0 && txnResponseCode.equals("00")){
				%>
					<input class="button4" type="submit" value="Trở về" onclick="window.location.href='<%=finishUrl.toString()%>'"/>
				<%
				} else{
				%>
					<input class="button4" type="button" value="Thanh toán giao dịch mới" onclick="window.location.href='<%=thanhToanTrucTuyenUrl.toString()%>'"/>
					<input class="button4" type="submit" value="Trở về" onclick="window.location.href='<%=thanhPhanHoSoUrl.toString()%>'"/>
				<%
				}
				%>
					
				</div>
			</div>
			<p style="height:1px; margin:80px"></p>
		</div>
	</div>
</section>
<%//ThanhToanDienTuUtils.insertThanhToanDienTu(lichSuThanhToanDienTu); %>
