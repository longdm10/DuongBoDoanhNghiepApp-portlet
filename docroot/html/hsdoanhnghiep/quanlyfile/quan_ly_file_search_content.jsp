<%@page import="vn.dtt.duongbo.business.Constants"%>

<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%@ include file="/html/init.jsp"%>

<%
	//----------userId
	long userLoginId = PortalUtil.getUserId(request);
	
	//----------maPhanNhomHoSo
	String maPhanNhomHoSo = "";
	
	HttpSession httpSession = null;
	try {
		httpSession = PortalUtil.getHttpServletRequest(renderRequest).getSession();
	} catch (Exception es) {}

	
	if (httpSession != null) {
		Object obj = httpSession.getAttribute(Constants.MA_PHAN_NHOM_HO_SO);
		if (obj != null) {
			maPhanNhomHoSo = obj.toString();
		} else {
			maPhanNhomHoSo = "";
		}
	}
	
	//----------organizationId - tochucId
	long organizationId = 0;
	if (themeDisplay.getUser().getOrganizations() != null && themeDisplay.getUser().getOrganizations().size() > 0) {
		organizationId = themeDisplay.getUser().getOrganizations().get(0).getOrganizationId();
	}
	
	String selLinhVucThuTuc = ParamUtil.getString(request, Constants.CODE_LINH_VUC_THU_TUC);
	String thuTucHanhChinhId = ParamUtil.getString(request, Constants.ID_THU_TUC_HANH_CHINH);
	String maBienNhan = ParamUtil.getString(request, Constants.MA_BIEN_NHAN);
%>

<h4 class="PL15 BGT BOB font14 col-xs-12">Quản lý file</h4>

<div class="P10 col-xs-12">
	<div class="BGT noidung">
		<%@ include file="/html/hsdoanhnghiep/quanlyfile/quan_ly_file_search_content_find.jsp"%>
		<%@ include file="/html/hsdoanhnghiep/quanlyfile/quan_ly_file_search_content_result.jsp"%>
		<div class="clear"></div>
	</div>
</div>