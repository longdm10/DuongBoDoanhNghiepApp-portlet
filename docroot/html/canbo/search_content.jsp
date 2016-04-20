<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%@ include file="/html/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>

<%
HttpSession httpSession = null;
try {
	httpSession = PortalUtil.getHttpServletRequest(renderRequest).getSession();
} catch (Exception es) { }

String idPhanNhomHoSo = "";
if (httpSession != null) {
	Object obj = httpSession.getAttribute(Constants.MA_PHAN_NHOM_HO_SO);
	if (obj != null) {
		idPhanNhomHoSo = obj.toString();
	} else {
		idPhanNhomHoSo = "";
	}
}
String TthcPhanNhomHoSoName = null;
if (idPhanNhomHoSo != null && idPhanNhomHoSo.trim().length() > 0) {
	try {
		TthcPhanNhomHoSoName = TthcPhanNhomHoSoLocalServiceUtil.findByMaPhanNhom(idPhanNhomHoSo).getTenPhanNhom();
	} catch (Exception es) {
	}
}

%>
<h4 class="PL15 BGT BOB font14 col-xs-12"><%=(TthcPhanNhomHoSoName == null) ? "Tìm kiếm hồ sơ" : TthcPhanNhomHoSoName%></h4>
<div class="P10 col-xs-12">
	<div class="BGT noidung">
		<%@ include file="/html/canbo/search_content_find.jsp"%>
		<%@ include file="/html/canbo/search_content_result.jsp"%>
	</div>
</div>