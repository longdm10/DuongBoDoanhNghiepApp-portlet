<%@page import="vn.dtt.duongthuy.business.DuongThuyUtil"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep"%>
<%@page import="vn.dtt.duongbo.utils.DoanhNghiepUtils"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.utils.Webkeys"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.service.QlvtQuanLyFileLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcPhanNhomHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.utils.CommonUtils"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@page import="com.liferay.portlet.PortletPreferencesFactoryUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.portal.model.Role"%>
<%@page import="java.util.List"%>
<%@ include file="/html/init.jsp"%>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" language="java"%>

<%
	PortletPreferences resourcePrefsMenu = PortletPreferencesFactoryUtil.getPortletSetup(renderRequest);
	
	HttpSession httpSession = null;
	try {
		httpSession = PortalUtil.getHttpServletRequest(renderRequest).getSession();
	} catch (Exception es) {}
	
	
	String maPhanNhom = "";
	if (httpSession != null) {
		Object obj = httpSession.getAttribute(Constants.MA_PHAN_NHOM_HO_SO);
		if (obj != null) {
			maPhanNhom = obj.toString();
		} else {
			maPhanNhom = "";
		}
	}
	
	if (maPhanNhom != null && maPhanNhom.trim().length() == 0) {
		maPhanNhom = Constants.DANH_SACH_DICH_VU_CONG;
		if (httpSession != null) {
			httpSession.setAttribute(Constants.MA_PHAN_NHOM_HO_SO, maPhanNhom);
		}
	}
	
	long organizationId = 0;
	if (themeDisplay.getUser().getOrganizations() != null && themeDisplay.getUser().getOrganizations().size() > 0) {
		organizationId = themeDisplay.getUser().getOrganizations().get(0).getOrganizationId();
	}
	
	long userId = PortalUtil.getUserId(request);
	
	long doanhNghiepId = DuongThuyUtil.getNguoiLamThuTucIdByUserId(userId);
	
	int countHoSo = 0;
	String cssActive = "";
	List<TthcPhanNhomHoSo> lstPhanNhomDoanhNghiep = new ArrayList<TthcPhanNhomHoSo>();
	String liRoleSelected = null;
	lstPhanNhomDoanhNghiep = TthcPhanNhomHoSoLocalServiceUtil.findTthcPhanNhomHoSoByVaTroXuLy(liRoleSelected, Constants.LOAIPHANNHOM_HO_SO);
%>
<nav class="PA0 BOR BGT" style="float: left; width: 100%">
	<div class="PA0 BGT col-xs-12">
		
		<!-- danh sach dich vu cong -->
		<portlet:actionURL var="xemDanhSachDichVuCong">
			<portlet:param name="jspPage" value="/html/hscanbo/view.jsp" />
			<portlet:param name="<%=Constants.MA_PHAN_NHOM_HO_SO%>" value="<%=Constants.DANH_SACH_DICH_VU_CONG%>" />
			<portlet:param name="<%=ActionRequest.ACTION_NAME%>" value="changeMenu" />
		</portlet:actionURL>
		<h4 class="BOB font14 text-center"><a href='<%=xemDanhSachDichVuCong%>'>Danh sách dịch vụ công</a></h4>
		<ul class="menu list-group">
			<li>
				<a href="#" class="active list-group-item"><i class="MR5 fa3 fa fa-book"></i>Quản lý hồ sơ</a>
				<ul>
					<portlet:actionURL var="xemThanhPhanHoSoThuTuc">
						<portlet:param name="jspPage" value="/html/hscanbo/view.jsp" />
					</portlet:actionURL>
					<li><a href="<%=xemThanhPhanHoSoThuTuc %>">Tất cả hồ sơ</a></li>
					<li><a href="<%=xemThanhPhanHoSoThuTuc %>">Hồ sơ lưu nháp</a></li>
					<li><a href="<%=xemThanhPhanHoSoThuTuc %>">Hồ sơ trờ tiếp nhận</a></li>
					<li><a href="<%=xemThanhPhanHoSoThuTuc %>">Hồ sơ đã trả kết quả</a></li>
				</ul>
				
				<a href="#" class="active list-group-item"><i class="MR5 fa3 fa fa-book"></i>Nộp hồ sơ</a>
				<ul>
					<portlet:actionURL var="nopHoSoVaoCangBienURL">
						<portlet:param name="jspPage" value="/html/hscanbo/view.jsp" />
					</portlet:actionURL>
					<li><a href="<%=nopHoSoVaoCangBienURL %>">Hồ sơ vào cảng biển</a></li>
					<li><a href="<%=nopHoSoVaoCangBienURL %>">Hồ sơ rời cảng biển</a></li>
					<li><a href="<%=nopHoSoVaoCangBienURL %>">Khai báo phương tiện</a></li>
				</ul>
					
			</li>
		</ul>
	</div><!-- end left -->
</nav><!-- end nav -->