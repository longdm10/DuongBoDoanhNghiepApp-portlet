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
				<%
				String phanNhomTrangThaiHoSoCodeGroup = "";
				for (TthcPhanNhomHoSo item : lstPhanNhomDoanhNghiep) {

					//set maPhanNhom vao session
					
					if(item.getMaPhanNhom().trim().equalsIgnoreCase(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_DANG_TAO)){
						phanNhomTrangThaiHoSoCodeGroup = "'DN_DT'";
					} else if(item.getMaPhanNhom().trim().equalsIgnoreCase(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_DANG_XU_LY)){
						phanNhomTrangThaiHoSoCodeGroup = "'DN_DXL'";
					} else if(item.getMaPhanNhom().trim().equalsIgnoreCase(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_CHO_BO_SUNG)){
						phanNhomTrangThaiHoSoCodeGroup = "'DN_CBS'";
					} else if(item.getMaPhanNhom().trim().equalsIgnoreCase(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_CHO_THANH_TOAN)){
						phanNhomTrangThaiHoSoCodeGroup = "'DN_CTT'";
					} else if(item.getMaPhanNhom().trim().equalsIgnoreCase(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_CHO_TIEP_NHAN)){
						phanNhomTrangThaiHoSoCodeGroup = "'DN_CTN'";
					} else if(item.getMaPhanNhom().trim().equalsIgnoreCase(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_DA_TRA_KET_QUA)){
						phanNhomTrangThaiHoSoCodeGroup = "'DN_HT'";
					} 
					if(maPhanNhom.equals(item.getMaPhanNhom())){
						cssActive = "list-group-item";
					}else{
						cssActive = "";
					} 
					countHoSo = TthcHoSoThuTucLocalServiceUtil.countByGroupMaTrangThaiDoanhNghiepAndNguoiLamThuTucId(phanNhomTrangThaiHoSoCodeGroup, doanhNghiepId);
					%>
					<portlet:actionURL var="xemThanhPhanHoSoThuTuc">
						<portlet:param name="jspPage" value="/html/hscanbo/view.jsp" />
						<portlet:param name="<%=Constants.MA_PHAN_NHOM_HO_SO%>" value="<%=String.valueOf(item.getMaPhanNhom())%>" />
						<portlet:param name="<%=ActionRequest.ACTION_NAME%>" value="changeMenu" />
					</portlet:actionURL>
					<li><a href="<%=xemThanhPhanHoSoThuTuc %>" class="<%=(cssActive.trim().length() == 0) ? "textsub list-group-item" : cssActive %> "><span class="badge"><%=countHoSo %></span><%=item.getTenPhanNhom() %></a></li>
				<%
				}
				%>
				</ul>
				
				<a href="#" class="active list-group-item"><i class="MR5 fa3 fa fa-book"></i>Quản lý giấy tờ</a>
				<ul>
				<%
				lstPhanNhomDoanhNghiep = TthcPhanNhomHoSoLocalServiceUtil.findTthcPhanNhomHoSoByVaTroXuLy(liRoleSelected, Constants.LOAIPHANNHOM_GIAY_TO);
				for (TthcPhanNhomHoSo tthcPhanNhomHoSo : lstPhanNhomDoanhNghiep) {

					//set maPhanNhom vao session
					if (maPhanNhom != null && maPhanNhom.trim().length() == 0) {
						maPhanNhom = String.valueOf(tthcPhanNhomHoSo.getMaPhanNhom());
						if (httpSession != null) {
							httpSession.setAttribute(Constants.MA_PHAN_NHOM_HO_SO, maPhanNhom);
						}
					}
					
					if (Constants.MA_PHAN_NHOM_QUAN_LY_FILE_GIAY_TO_RIENG.equals(tthcPhanNhomHoSo.getMaPhanNhom())) {
						countHoSo = QlvtQuanLyFileLocalServiceUtil.countQuanLyFile(doanhNghiepId, Constants.QUAN_LY_FILE_RIENG, null, null, null, null, null, null,null,null);
						
					} else if(Constants.MA_PHAN_NHOM_QUAN_LY_FILE_GIAY_TO_DUOC_CAP.equals(tthcPhanNhomHoSo.getMaPhanNhom())) {
						countHoSo = QlvtQuanLyFileLocalServiceUtil.countQuanLyFile(doanhNghiepId, Constants.QUAN_LY_FILE_CHUNG, null, null, null, null, null, null,null,null);
					}
					if(maPhanNhom.equals(tthcPhanNhomHoSo.getMaPhanNhom())){
						cssActive = "list-group-item";
					}else{
						cssActive = "";
					} 
					%>
					<portlet:actionURL var="xemQuanLyGiayToURL">
						<portlet:param name="jspPage" value="/html/hscanbo/view.jsp" />
						<portlet:param name="<%=Constants.MA_PHAN_NHOM_HO_SO%>" value="<%=String.valueOf(tthcPhanNhomHoSo.getMaPhanNhom())%>" />
						<portlet:param name="<%=ActionRequest.ACTION_NAME%>" value="changeMenu" />
					</portlet:actionURL>
					<li><a href="<%=xemQuanLyGiayToURL %>"  class="<%=(cssActive.trim().length() == 0) ? "textsub list-group-item" : cssActive %> "><span class="badge"><%=countHoSo%></span><%=tthcPhanNhomHoSo.getTenPhanNhom() %></a></li>
				<%
				}
				%>
				</ul>
				
				<portlet:actionURL var="quanLyThongTinCaNhanURL" name="changeMenu">
					<portlet:param name="<%=Constants.MA_PHAN_NHOM_HO_SO%>" value="<%=Constants.MA_PHAN_NHOM_QLTT_CA_NHAN%>" />
				</portlet:actionURL>
				
				<a href="<%=quanLyThongTinCaNhanURL %>" class="active list-group-item"><i class="MR5 fa3 fa fa-book"></i>Quản lý thông tin cá nhân</a>
			</li>
		</ul>
	</div><!-- end left -->
</nav><!-- end nav -->