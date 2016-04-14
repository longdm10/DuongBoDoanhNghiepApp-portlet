<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<portlet:defineObjects />

<%
	String type = PortalUtil.getOriginalServletRequest(request)
			.getParameter("type");
	if (type == null) {
		type = "1";
	}
	String action = PortalUtil.getOriginalServletRequest(request)
			.getParameter("action");
	if (action == null) {
		action = "view";
	}

	if (type.equals("1")) {
%>
<jsp:include  page="/html/hspttdnvaocangbien/view.jsp"></jsp:include>
<%//@ include file="/html/hspttdnvaocangbien/view.jsp"%>
<%
	} else if (type.equals("2")) {
%>
ho so luu nhap
<%
	} else if (type.equals("3")) {
%>
ho so cho tiep nhan
<%
	} else if (type.equals("4")) {
%>
ho so tra ket qua
<%
	} else if (type.equals("5")) {
%>
<jsp:include  page="/html/hspttdnvaocangbien/edit.jsp"></jsp:include>
<%//@ include file="/html/hspttdnvaocangbien/edit.jsp"%>
<%
	} else if (type.equals("6")) {
%>
ho so ra cang bien

<%
	} else if (type.equals("7")) {
%>
<jsp:include  page="/html/ttphuongtientnd/tt_phuongtien.jsp"></jsp:include>
<%
	}
%>