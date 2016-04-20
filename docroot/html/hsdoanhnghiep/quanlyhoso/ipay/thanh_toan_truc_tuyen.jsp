
<%@page import="java.util.Calendar"%>
<%@page import="vn.dtt.yte.maudon.model.NhapKhauNghienCuu"%>
<%@page import="vn.dtt.yte.maudon.model.NhapKhauKhaoNghiem"%>
<%@page import="vn.dtt.yte.maudon.model.DangKiLuuHanhLaiCacHoaChat"%>
<%@page import="vn.dtt.yte.maudon.model.DangKiLuuHanhBoXung"%>
<%@page import="vn.dtt.yte.maudon.model.DangKiLuuHanhChinhThuc"%>
<%@page import="vn.dtt.yte.utils.DoanhNghiepUtils"%>
<%@page import="vn.dtt.yte.dao.doanhnghiep.service.ThanhToanKeyPayLocalServiceUtil"%>
<%@page import="vn.dtt.yte.dao.doanhnghiep.model.ThanhToanKeyPay"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.yte.utils.config.YTeConfigurationManager"%>
<%@page import="vn.dtt.yte.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil"%>
<%@page import="vn.dtt.yte.dao.common.model.TthcThuTucHanhChinh"%>
<%@page import="vn.dtt.yte.business.Constants"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ include file="/html/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.Date"%>

<link rel="stylesheet" href="<%=request.getContextPath()%>/css/tipsy.css"
	type="text/css" media="screen" />
<link rel="stylesheet"	href="<%=request.getContextPath()%>/css/jquery.alerts.css"
	type="text/css" media="screen" />	
<link rel="stylesheet"	href="<%=request.getContextPath()%>/css/jquery-ui.css"
	type="text/css" media="screen" />
<%
	long userId = PortalUtil.getUserId(request);
    SimpleDateFormat sdf1 = new SimpleDateFormat("HHmmss");
    Date curDate = new Date();

    int[] fee_ship = {0, 20000, 10000, 15000, 35000, 40000};
    //int randomFeeShip = (fee_ship[new Random().nextInt(fee_ship.length)]);
    int randomFeeShip = 0;
    
   // int[] netCost = {20000000, 12000000, 6750000, 8640000, 14500000, 3500000};
   // int payAmount = (netCost[new Random().nextInt(netCost.length)]);

    
    
    System.out.println("/hsdoanhnghiep/quanlyhoso/ipay/thanh_toan_truc_tuyen.jsp");
    String listHoSoThuTuc = ParamUtil.getString(request, Constants.DANH_SACH_HO_SO_THU_TUC);
    String payAmount = ParamUtil.getString(request, Constants.VPC_AMOUNT);
    
    String goodCode = "";
    
    String loaiHoaChat = "";
    String hoSoThuTucId = "";
    List<Object> allObj = null;
    String[] allHoSoId = listHoSoThuTuc.split(",");
    if(listHoSoThuTuc != null && listHoSoThuTuc.trim().length() > 0){
		for (int i = 0; i < allHoSoId.length; i++) {
			hoSoThuTucId = allHoSoId[i].trim();
			allObj = DoanhNghiepUtils.getXmlByHoSoThuTucId(Long.parseLong(hoSoThuTucId));
		    if(allObj != null && allObj.size() > 0 ){
				if (allObj.get(0) instanceof DangKiLuuHanhChinhThuc) {
					DangKiLuuHanhChinhThuc mauDangKy =  DangKiLuuHanhChinhThuc.class.cast(allObj.get(0));
					loaiHoaChat = loaiHoaChat + mauDangKy.getTenThuongMaiHoaChat() + ",";
				} else if (allObj.get(0) instanceof DangKiLuuHanhBoXung) {
					DangKiLuuHanhBoXung mauDangKy =  DangKiLuuHanhBoXung.class.cast(allObj.get(0));
					loaiHoaChat = mauDangKy.getTenThuongMai() + ",";
				} else if (allObj.get(0) instanceof DangKiLuuHanhLaiCacHoaChat) {
					DangKiLuuHanhLaiCacHoaChat mauDangKy =  DangKiLuuHanhLaiCacHoaChat.class.cast(allObj.get(0));
					loaiHoaChat = mauDangKy.getTenThuongMaiHoaChat() + ",";
				} else if (allObj.get(0) instanceof NhapKhauKhaoNghiem) {
					NhapKhauKhaoNghiem mauDangKy =  NhapKhauKhaoNghiem.class.cast(allObj.get(0));
					List<NhapKhauKhaoNghiem.ThongTinKhaoNghiem> allThongTinKhaoNghiem = mauDangKy.getThongTinKhaoNghiem();
					if(allThongTinKhaoNghiem != null && allThongTinKhaoNghiem.size() > 0){
						for(int k=0; k< allThongTinKhaoNghiem.size(); k++){
							loaiHoaChat = loaiHoaChat + allThongTinKhaoNghiem.get(k).getTenThuongMai() + ",";
						}
					}
				} else if (allObj.get(0) instanceof NhapKhauNghienCuu) {
					NhapKhauNghienCuu mauDangKy =  NhapKhauNghienCuu.class.cast(allObj.get(0));
					List<NhapKhauNghienCuu.ThongTinKhaoNghiem> allThongTinKhaoNghiem = mauDangKy.getThongTinKhaoNghiem();
					if(allThongTinKhaoNghiem != null && allThongTinKhaoNghiem.size() > 0){
						for(int k=0; k< allThongTinKhaoNghiem.size(); k++){
							loaiHoaChat = loaiHoaChat + allThongTinKhaoNghiem.get(i).getTenThuongMai() + ",";
						}
					}
				}
		    }
		}
    }
    loaiHoaChat = loaiHoaChat.substring(0, loaiHoaChat.lastIndexOf(','));
    
    Calendar calendar = Calendar.getInstance();
    goodCode = userId + "" +  (new SimpleDateFormat("yyyyMMddHHmmss").format(calendar.getTime()));
    
    String thongTinHoSo = "";
    thongTinHoSo =  listHoSoThuTuc;
    
    String xml_description = "";
    xml_description =  loaiHoaChat;
    

    System.out.println("-------thanh-toan-truc-tuyen-online---xml_description:------"+xml_description);
    System.out.println("-------thanh-toan-truc-tuyen-online---goodCode:------" + goodCode);
    
    if(payAmount == null || payAmount.length()==0){
    	payAmount="0";
    }
    
    List<ThanhToanKeyPay> liKeyPays = ThanhToanKeyPayLocalServiceUtil.findByGoodCode(goodCode);
    
// check da thanh toan cho goodcode nay chưa, neu thanh toan roi thi thoi    
	boolean thanhToan = true;
    if (liKeyPays != null && liKeyPays.size() > 0) {
        if (liKeyPays.get(0).getResponseCode().trim().compareTo("00") == 0) {
        	thanhToan = false;
        	System.out.println("thanh toan? : " + thanhToan);
        }
    }
    
    // Chu y neu tien nho hon 1000 se bi loi.

	PortletURL return_url = renderResponse.createRenderURL();
	return_url.setParameter("jspPage", "/html/hsdoanhnghiep/quanlyhoso/ipay/vpc_Digital_Receive.jsp");
	
	PortletURL callUrl = renderResponse.createRenderURL();
	callUrl.setParameter("jspPage", "/html/hsdoanhnghiep/quanlyhoso/ipay/vpc_Digital_Order.jsp");
	
	PortletURL thanhPhanHoSoUrl = renderResponse.createRenderURL();
	thanhPhanHoSoUrl.setParameter("jspPage", "/html/hsdoanhnghiep/thongtinhoso/thanh_phan_ho_so.jsp");
	
%>
<div id="messageDialog" style="display: none;">
	<div style="margin:20px 0; border:1px solid #999; padding: 10px 10px 5px">
		<p>Hồ sơ đã được thanh toán</p><br>
	</div>
	<div class="btns_chuanbihs" style="margin-left: 45%">
		<input class="button4" style="margin-left:0" type="button" value="OK"  onclick="window.location.href='<%=thanhPhanHoSoUrl.toString()%>'">
	</div>
</div>
<section class="right">
	<div class="title_right">Thanh toán trực tuyến</div>
	<div class="box">
		<div class="main_chuanbihs">
			<form action="<%= callUrl.toString() %>" method="post" name="myForm">
				<div style="display: none;">>
			    	<input type="hidden" name="Title" value="VPC 3-Party" disabled />
			  	 	<input type="hidden" name="xml_description" value="<%=xml_description %>">
			  	 	<input type="hidden" name="thongTinHoSo" value="<%=thongTinHoSo %>">
			        <input type="hidden" name="bank_code" value="">
			        <input type="hidden" name="merchant_code" value="<%=YTeConfigurationManager.getStrProp("vn.keypay.merchant_code", "312")%>"/>
			        <% //value="312"
			        //YTeConfigurationManager.getStrProp("vn.keypay.merchant_code", "898989")
			        %>
			        <input type="hidden" name="merchant_trans_id" value="<%= sdf1.format(curDate) %>" />
			        <input type="hidden" name="good_code" value="<%= goodCode %>"/>
					<input type="hidden" name="net_cost" value="<%=payAmount%>"/>
					<input type="hidden" name="return_url" value="<%=return_url %>"/>
					<input type="hidden" name="version" value="1.0"/>
					<input type="hidden" name='command' value='pay'/>
					<input type="hidden" name='current_locale' value='vn'/>
					<input type="hidden" name="currency_code" value='704'/>
					<input type="hidden" name="service_code" value="720"/>
				</div>                
				<div class="thanhtoan">
					<p style="clear:both"></p>
					<p class="spectex6" style="width: 35%;">Ship Fee</p>
					<input type="text" name="ship_fee" value="<%=randomFeeShip%>">
					<p style="clear:both"></p>
					<p class="spectex6" style="width: 35%;">Tax</p>
					<input type="text" name="tax" value="0">
					<p style="clear:both"></p>
					<p class="spectex6" style="width: 35%;">Country Code</p>
					<input type="text" name="country_code" value="+84">
				</div>	
				<div class="thanhtoan">
					<p class="spectex7">Hiển thị danh sách ngân hàng</p>
					<p class="spectex7">Số tiền vận chuyển hàng</p>
					<p class="spectex7">Thuế (VNĐ)</p>
					<p class="spectex7">Mã Quốc gia</p>
				</div>
				<div class="thanhtoan">
					<p class="spectex7">Show list bank</p>
					<p class="spectex7">Ship fee (VNĐ)</p>
					<p class="spectex7">Tax</p>
					<p class="spectex7">Country code</p>
				</div>
				<!--input type="button" class="button4" style="margin-left:30%; background:green" value="Pay Now!" onclick="summitForm'<%=thanhToan%>', '<%=callUrl.toString()%>')"-->
				<% if(thanhToan){
				%>
					<input type="submit" class="button4" style="margin-top:25px; background:green" value="Pay Now!">
				<%
				} else{
				%>
					<input type="button" class="button4" style="margin-top:25px; background:green" value="Pay Now!" onclick="func_ShowMessage()">
				<%}
				%>
				
				
			</form>	
		</div>
	</div>
</section>
<script type="text/javascript">
function summitForm(isPay, url) {
	alert("chua thanh toan:" +isPay);
	if(isPay){
		alert("vao popup keypay");
		document.getElementById('<portlet:namespace />myForm').action = url;
		document.getElementById('<portlet:namespace />myForm').submit();
	} else{
		alert("vao show dialog");
		func_ShowMessage();
	}
}

function func_ShowMessage() {
	$('#messageDialog').dialog({
		title : 'Tình trạng thanh toán',
		resizable : false,
		modal : true,
		width : '500px',
		closeOnEscape : false,
		open : function() {
			jQuery('.ui-widget-overlay').bind('click', function() {
				$('#messageDialog').dialog('close');
			});
		}
	});
}
</script>