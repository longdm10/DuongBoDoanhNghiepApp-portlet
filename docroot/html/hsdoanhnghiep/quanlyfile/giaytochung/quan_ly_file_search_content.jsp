<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%@ include file="/html/init.jsp"%>

<%
	//----------userId
	long userLoginId = PortalUtil.getUserId(request);

	long thuTucHanhChinhId = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
	long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
	long thanhPhanHoSoId = ParamUtil.getLong(request, Constants.ID_THANH_PHAN_HO_SO);
	
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
	TthcPhanNhomHoSo pnDoanhNghiep = TthcPhanNhomHoSoLocalServiceUtil.getByMaPhanNhom(maPhanNhomHoSo);
	if (pnDoanhNghiep == null) { pnDoanhNghiep = new TthcPhanNhomHoSoImpl(); };
	
	String selLinhVucThuTuc = ParamUtil.getString(request, Constants.CODE_LINH_VUC_THU_TUC);
	String maBienNhan = ParamUtil.getString(request, Constants.MA_BIEN_NHAN);
%>

<section class="right" style="height: auto;float: left;  width: 100%;">
	<div class="title_right">Quản lý file</div>
	<div class="box" style="height: auto;float: left;width: 95%;margin-bottom:40px;">
		<%@ include file="/html/hsdoanhnghiep/quanlyfile/giaytochung/quan_ly_file_search_content_find.jsp"%>
		<%@ include file="/html/hsdoanhnghiep/quanlyfile/giaytochung/quan_ly_file_search_content_result.jsp"%>
	</div>
</section>