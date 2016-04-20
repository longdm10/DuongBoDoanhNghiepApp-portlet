
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@page import="vn.dtt.duongbo.utils.format.ConvertUtil"%>
<%@page import="vn.dtt.duongbo.ipay.KeyPayUtils"%>
<%@page import="vn.dtt.duongbo.utils.config.DuongBoConfigurationManager"%>
<%@page import="vn.dtt.duongbo.ipay.HashFunction"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepUserLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.Collections"%>


<%@page import="java.io.IOException"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Iterator"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/html/init.jsp" %>

<link rel="stylesheet" href="<%=request.getContextPath()%>/css/tipsy.css"
	type="text/css" media="screen" />
<link rel="stylesheet"	href="<%=request.getContextPath()%>/css/jquery.alerts.css"
	type="text/css" media="screen" />	
<link rel="stylesheet"	href="<%=request.getContextPath()%>/css/jquery-ui.css"
	type="text/css" media="screen" />
<%

long userId = PortalUtil.getUserId(request);
long doanhNghiepId = 0;
DnDoanhNghiepUser doanhNghiepUser = DnDoanhNghiepUserLocalServiceUtil.findByUserId(userId);
doanhNghiepId = doanhNghiepUser.getNguoiLamThuTucId();

Map<String, String> fields = new HashMap<String, String>();


String version = request.getParameter("version");
String current_locale = request.getParameter("current_locale");
String command = request.getParameter("command");
String merchantTransId = request.getParameter("merchant_trans_id");
String merchantCode = request.getParameter("merchant_code");
String country_code = request.getParameter("country_code");
String good_code = request.getParameter("good_code");
String net_cost = request.getParameter("net_cost");
String shipFee = request.getParameter("ship_fee");
String tax = request.getParameter("tax");
String currencyCode = request.getParameter("currency_code");
String return_url = request.getParameter("return_url");
String xmlDescription = request.getParameter("xml_description");
String thongTinHoSo = request.getParameter("thongTinHoSo");

System.out.println("-------version::::::"+version);
System.out.println("-------current_locale::::::"+current_locale);
System.out.println("-------merchantTransId::::::"+merchantTransId);
System.out.println("-------merchantCode::::::"+merchantCode);
System.out.println("-------country_code::::::"+country_code);
System.out.println("-------good_code::::::"+good_code);
System.out.println("-------net_cost::::::"+net_cost);
System.out.println("-------shipFee::::::"+shipFee);
System.out.println("-------tax::::::"+tax);
System.out.println("-------currencyCode::::::"+currencyCode);
System.out.println("-------return_url::::::"+return_url);
System.out.println("-------xmlDescription::::::"+xmlDescription);
System.out.println("-------thongTinHoSo::::::"+thongTinHoSo);

fields.put("version", version);
fields.put("current_locale", current_locale);
fields.put("command", command);
fields.put("merchant_trans_id", merchantTransId);
fields.put("merchant_code", merchantCode);
fields.put("country_code", country_code);
fields.put("good_code", good_code);
fields.put("net_cost", net_cost);
fields.put("ship_fee", shipFee);
fields.put("tax", tax);
fields.put("service_code", "720");
fields.put("currency_code", currencyCode);
fields.put("return_url", return_url);

String secure_hash = "";

HashFunction hf = new HashFunction();
secure_hash = hf.hashAllFields(fields,DuongBoConfigurationManager.getStrProp("vn.keypay.merchant_key", "111111"));
//secure_hash = hf.hashAllFields(fields,"111111" );

String url_redirect = DuongBoConfigurationManager.getStrProp("vn.keypay.url_redirect", "http://online.keypay.vn/process?");
//url_redirect = "http://online.keypay.vn/process?";

System.out.println("----Check-secure_hash "+secure_hash+"-----url_redirect--"+url_redirect);

Map params = request.getParameterMap();
Iterator i = params.keySet().iterator();
String param = "";
String param1 = "";
while ( i.hasNext() )
{
    String key = (String) i.next();
	String value = ((String[]) params.get( key ))[ 0 ];
	if(!key.equals("thongTinHoSo")){
		param += key + "=" + URLEncoder.encode(new String(value.getBytes("UTF-8"), "ISO-8859-1"),"UTF-8") + "&";
		param1 +=  key + "=" + value + "&";
	}
}
System.out.println("--------------param--:"+param);
System.out.println("---------------param truoc encode--:"+param1);
//url_redirect += param+"secure_hash="+secure_hash+"&desc_1=desc_1&desc_2=desc_2&desc_3=desc_3&desc_4=desc_4&desc_5=1234&internal_bank=all_card";
url_redirect += param+"secure_hash="+secure_hash;


System.out.println("---vpc_Digital_Order.jsp===Gui sang key pay===url_redirect-------------"+url_redirect);
KeyPayUtils.addThanhToanKeyPay( doanhNghiepId,  merchantTransId, 0, merchantCode, "", Long.parseLong(shipFee),  currencyCode, xmlDescription, ConvertUtil.convertToInt(request.getParameter("net_cost")), request.getParameter("good_code"), "", thongTinHoSo, Constants.KEYPAY_REQUEST, 0);

%>



<script >

window.location='<%=url_redirect.toString()%>';

</script>