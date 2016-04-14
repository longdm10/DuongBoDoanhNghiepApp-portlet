<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
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

	String tenhoso = "TRANG MẶC ĐỊNH";
	String tranghuongdan = "/html/qlhsphuongtientndvaoracangbien/default.jsp";
	String trangthanhphan = "/html/qlhsphuongtientndvaoracangbien/default.jsp";
	//Toan bo ho so
	if (type.equals("1")) {
		tenhoso = "DANH SÁCH TOÀN BỘ HỒ SƠ";
		trangthanhphan = "/html/hspttdnvaocangbien/view.jsp";
		tranghuongdan = "/html/qlhsphuongtientndvaoracangbien/search.jsp";
		//Ho so luu nhap
	} else if (type.equals("2")) {
		tenhoso = "DANH SÁCH HỒ SƠ LƯU NHÁP";
		trangthanhphan = "/html/hspttdnvaocangbien/view.jsp";
		tranghuongdan = "/html/qlhsphuongtientndvaoracangbien/search.jsp";
		//ho so cho tiep nhan
	} else if (type.equals("3")) {
		tenhoso = "DANH SÁCH HỒ SƠ CHỜ TIẾP NHẬN";
		trangthanhphan = "/html/hspttdnvaocangbien/view.jsp";
		tranghuongdan = "/html/qlhsphuongtientndvaoracangbien/search.jsp";
		//ho so tra ket qua
	} else if (type.equals("4")) {
		tenhoso = "DANH SÁCH HỒ SƠ TRẢ KẾT QUẢ";
		trangthanhphan = "/html/hspttdnvaocangbien/view.jsp";
		tranghuongdan = "/html/qlhsphuongtientndvaoracangbien/search.jsp";
		//Ho so vao cang bien
	} else if (type.equals("5")) {
		tenhoso = "HỒ SƠ VÀO CẢNG BỂN";
		trangthanhphan = "/html/hspttdnvaocangbien/edit.jsp";
		tranghuongdan = "/html/qlhsphuongtientndvaoracangbien/help.jsp";
		//ho so ra cang bien
	} else if (type.equals("6")) {
		tenhoso = "HỒ SƠ RA CẢNG BỂN";
		trangthanhphan = "/html/hspttdnvaocangbien/edit.jsp";
		tranghuongdan = "/html/qlhsphuongtientndvaoracangbien/help.jsp";
		//Khai bao phuong tien
	} else if (type.equals("7")) {
		tenhoso = "KHAI BÁO THÔNG TIN PHƯƠNG TIỆN";
		trangthanhphan = "/html/ttphuongtientnd/tt_phuongtien.jsp";
		tranghuongdan = "/html/qlhsphuongtientndvaoracangbien/help.jsp";
	}
%>

<h4 class="PL15 BGT BOB font14 col-xs-12"><%=tenhoso%></h4>
<div class="P10 col-xs-12">
	<div class="BGT noidung">
		<div class="col-xs-12">
			<jsp:include page="<%=tranghuongdan%>"></jsp:include>
		</div>
		<div class="col-xs-12">
			<jsp:include page="<%=trangthanhphan%>"></jsp:include>
		</div>
	</div>
</div>
