<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="vn.dtt.duongbo.portlet.doanhnghiep.DoanhNghiepAction"%>
<%@page import="vn.dtt.duongbo.dao.common.model.impl.TthcPhanNhomHoSoImpl"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcPhanNhomHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%@ include file="/html/init.jsp"%>
<%! private static Log _log = LogFactoryUtil.getLog(DoanhNghiepAction.class); %>
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
	
	_log.info("--/hsdoanhnghiep/quanlyhoso/quan_ly_ho_so_search_content.jsp----maPhanNhomHoSo---" + maPhanNhomHoSo);
	
	//----------organizationId - tochucId
	long organizationId = 0;
	if (themeDisplay.getUser().getOrganizations() != null && themeDisplay.getUser().getOrganizations().size() > 0) {
		organizationId = themeDisplay.getUser().getOrganizations().get(0).getOrganizationId();
	}
	
	TthcPhanNhomHoSo pnDoanhNghiep = TthcPhanNhomHoSoLocalServiceUtil.getByMaPhanNhom(maPhanNhomHoSo);
	if (pnDoanhNghiep == null) { pnDoanhNghiep = new TthcPhanNhomHoSoImpl(); };
	
	String selLinhVucThuTuc = ParamUtil.getString(request, Constants.CODE_LINH_VUC_THU_TUC);
	String thuTucHanhChinhId = ParamUtil.getString(request, Constants.ID_THU_TUC_HANH_CHINH);
	String maBienNhan = ParamUtil.getString(request, Constants.MA_BIEN_NHAN);
%>

<% if (pnDoanhNghiep.getMaPhanNhom().equalsIgnoreCase(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_DANG_TAO)) { %>
	<h4 class="PL15 BGT BOB font14 col-xs-12">Danh sách hồ sơ đang tạo</h4>
	
<% } else if (pnDoanhNghiep.getMaPhanNhom().equalsIgnoreCase(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_CHO_TIEP_NHAN)) { %>
	<h4 class="PL15 BGT BOB font14 col-xs-12">Danh sách hồ sơ chờ tiếp nhận</h4>
	
<% } else if (pnDoanhNghiep.getMaPhanNhom().equalsIgnoreCase(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_DANG_XU_LY)) { %>
	<h4 class="PL15 BGT BOB font14 col-xs-12">Danh sách hồ sơ đang xử lý</h4>
	
<% } else if (pnDoanhNghiep.getMaPhanNhom().equalsIgnoreCase(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_CHO_BO_SUNG)) { %>
	<h4 class="PL15 BGT BOB font14 col-xs-12">Danh sách hồ sơ chờ bổ sung</h4>

<% } else if (pnDoanhNghiep.getMaPhanNhom().equalsIgnoreCase(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_CHO_THANH_TOAN)) { %>
	<h4 class="PL15 BGT BOB font14 col-xs-12">Danh sách hồ sơ chờ thanh toán</h4>

<% } else if (pnDoanhNghiep.getMaPhanNhom().equalsIgnoreCase(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_DA_TRA_KET_QUA)) { %>
	<h4 class="PL15 BGT BOB font14 col-xs-12">Danh sách hồ sơ đã trả kết quả</h4>
	
<% } %>
<div class="P10 col-xs-12">
	<div class="BGT noidung">
	<%@ include file="/html/hsdoanhnghiep/quanlyhoso/quan_ly_ho_so_search_content_find.jsp"%>
	<%@ include file="/html/hsdoanhnghiep/quanlyhoso/quan_ly_ho_so_search_content_result.jsp"%>
	<div class="clear"></div>
	</div>
</div>
