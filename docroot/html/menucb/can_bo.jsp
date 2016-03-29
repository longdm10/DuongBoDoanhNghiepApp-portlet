<%@page import="java.util.Arrays"%>
<%@page import="org.apache.commons.collections.list.FixedSizeList"%>
<%@page import="vn.dtt.duongbo.dao.thanhtoan.service.TthcXacNhanThanhToanLocalServiceUtil"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.service.UserLocalService"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="com.liferay.portal.service.RoleLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.utils.format.FormatData"%>
<%@page import="vn.dtt.duongbo.utils.config.DuongBoConfigurationManager"%>
<%@page import="vn.dtt.duongbo.utils.format.ConvertUtil"%>
<%@page import="vn.dtt.duongbo.dao.motcua.service.MotCuaPhieuXuLyLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.utils.Webkeys"%>
<%@page import="javax.portlet.PortletMode"%>
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
// 	organizationId = DuongBoConfigurationManager.getLongProp("organization_id", 13101);
	long userId = 0;
	long doanhNghiepId = 0;
	userId = PortalUtil.getUserId(request);
	User ettUser = UserLocalServiceUtil.fetchUser(userId);
	List<Role> listRoles = ettUser.getRoles();
	boolean isTiepNhanTrucTiep = false;
	for(Role ett: listRoles){
		if(ett.getRoleId() == 50590){
			isTiepNhanTrucTiep = true;
			break;
		}
	}
	int countHoSo = 0;
	
	List<TthcPhanNhomHoSo> lstPhanNhomTiepNhanTrucTiep = new ArrayList<TthcPhanNhomHoSo>();
	List<TthcPhanNhomHoSo> lstPhanNhomQuanLyHoSo = new ArrayList<TthcPhanNhomHoSo>();
	List<TthcPhanNhomHoSo> lstPhanNhomTraCuuThongTin = new ArrayList<TthcPhanNhomHoSo>();
	List<TthcPhanNhomHoSo> lstPhanNhomBaoCaoThongKe = new ArrayList<TthcPhanNhomHoSo>();
	String liRoleSelected = StringPool.BLANK;
	for(long roleId: user.getRoleIds()){
		liRoleSelected += roleId+",";
	}
	liRoleSelected+=1;
	if (liRoleSelected != null && liRoleSelected.trim().length() > 0) {
		lstPhanNhomTiepNhanTrucTiep = TthcPhanNhomHoSoLocalServiceUtil.findTthcPhanNhomHoSoByVaTroXuLy(liRoleSelected, 0);
		lstPhanNhomQuanLyHoSo = TthcPhanNhomHoSoLocalServiceUtil.findTthcPhanNhomHoSoByVaTroXuLy(liRoleSelected, Constants.LOAIPHANNHOM_CAN_BO_HO_SO);
		lstPhanNhomTraCuuThongTin = TthcPhanNhomHoSoLocalServiceUtil.findTthcPhanNhomHoSoByVaTroXuLy(liRoleSelected, Constants.LOAIPHANNHOM_CAN_BO_TRA_CUU);
		lstPhanNhomBaoCaoThongKe = TthcPhanNhomHoSoLocalServiceUtil.findTthcPhanNhomHoSoByVaTroXuLy(liRoleSelected, Constants.LOAIPHANNHOM_CAN_BO_BAO_CAO);
	}
	
	String cssActive = "";
	String phanNhomTrangThaiHoSoCodeGroup = "";
	boolean roleCheck = CommonUtils.checkRoleName(themeDisplay, Constants.MTYT_KeTOAN);
%>
<liferay-portlet:renderURL  var="redirectMenuTiepNhanURL" portletName="<%= Webkeys.CAN_BO_PORTLET_ID %>" >
	<portlet:param name="mvcPath" value="/html/canbo/duongbo/tongcuc/tiep_nhan_truc_tiep/view.jsp"/>
</liferay-portlet:renderURL>
<liferay-portlet:renderURL  var="redirectMenuQLHSURL" portletName="<%= Webkeys.CAN_BO_PORTLET_ID %>" >
	<portlet:param name="mvcPath" value="/html/canbo/view.jsp"/>
</liferay-portlet:renderURL>
<liferay-portlet:renderURL  var="redirectMenuTraCuuURL" portletName="<%= Webkeys.CAN_BO_PORTLET_ID %>" >
	<portlet:param name="mvcPath" value="/html/canbo/duongbo/tongtuc/cbtracuu/view.jsp"/>
</liferay-portlet:renderURL>
<liferay-portlet:renderURL  var="redirectMenuBaoCaoURL" portletName="<%= Webkeys.CAN_BO_PORTLET_ID %>" >
	<portlet:param name="mvcPath" value="/html/canbo/duongbo/tongtuc/cbthongke/view.jsp"/>
</liferay-portlet:renderURL>
<nav class="PA0 BOR BGT" style="float: left; width: 100%">
	<div class="PA0 BGT col-xs-12">
		<!-- danh sach dich vu cong -->
		<portlet:actionURL var="xemDanhSachDichVuCong">
			<portlet:param name="jspPage" value="<%=redirectMenuTiepNhanURL %>" />
			<portlet:param name="doanhNghiepKey" value="1" />
			<portlet:param name="<%=Constants.MA_PHAN_NHOM_HO_SO%>" value="<%=Constants.DANH_SACH_DICH_VU_CONG%>" />
			<portlet:param name="<%=ActionRequest.ACTION_NAME%>" value="changeMenu" />
		</portlet:actionURL>
		<portlet:actionURL var="tiepNhanTrucTiepURL">
			<portlet:param name="jspPage" value="<%=redirectMenuTiepNhanURL %>" />
			<portlet:param name="<%=Constants.MA_PHAN_NHOM_HO_SO%>" value="<%=Constants.DANH_SACH_DICH_VU_CONG%>" />
			<portlet:param name="<%=ActionRequest.ACTION_NAME%>" value="changeMenu" />
		</portlet:actionURL>
		
		<h4 class="BOB font14 text-center"><a href='#'>Danh sách dịch vụ công</a></h4>
		<ul class="menu list-group">
			<li>
				<% 
					if(isTiepNhanTrucTiep){
				%>
				<a href="#" class="active list-group-item"><i class="MR5 fa3 fa fa-book"></i>Tiếp nhận trực tiếp</a>
				<ul>
				<%
				
				for (TthcPhanNhomHoSo item : lstPhanNhomTiepNhanTrucTiep) {

					//set maPhanNhom vao session
					
					if(item.getMaPhanNhom().trim().equalsIgnoreCase(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_DANG_TAO)){
						phanNhomTrangThaiHoSoCodeGroup = "'CHT'";
					} else if(item.getMaPhanNhom().trim().equalsIgnoreCase(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_DANG_XU_LY)){
						phanNhomTrangThaiHoSoCodeGroup = "'DXL','CBS'";
					} else if(item.getMaPhanNhom().trim().equalsIgnoreCase(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_CHO_TIEP_NHAN)){
						phanNhomTrangThaiHoSoCodeGroup = "'CTN'";
					} else if(item.getMaPhanNhom().trim().equalsIgnoreCase(Constants.DOANH_NGHIEP_PHAN_NHOM_HO_SO_DA_TRA_KET_QUA)){
						phanNhomTrangThaiHoSoCodeGroup = "'HT'";
					} 
					countHoSo = 0;
					%>
					<portlet:actionURL var="xemThanhPhanHoSoThuTuc0">
						<portlet:param name="jspPage" value="<%=redirectMenuQLHSURL %>" />
						<portlet:param name="<%=Constants.MA_PHAN_NHOM_HO_SO%>" value="<%=String.valueOf(item.getMaPhanNhom())%>" />
						<portlet:param name="<%=ActionRequest.ACTION_NAME%>" value="changeMenu" />
					</portlet:actionURL>
					<li><a href="<%=xemThanhPhanHoSoThuTuc0 %>" class="textsub list-group-item"><span class="badge"><%=countHoSo %></span><%=item.getTenPhanNhom() %></a></li>
				<%
				}
				%>
				</ul>
				<% } %>
				<a href="#" class="active list-group-item"><i class="MR5 fa3 fa fa-file-text fa-1"></i>Quản lý hồ sơ</a>
				<ul>
				<%
				phanNhomTrangThaiHoSoCodeGroup = "";
				for (TthcPhanNhomHoSo item : lstPhanNhomQuanLyHoSo) {
					//System.out.println("vao canbo.jsp===0001111111110===="+item);
					
					if (roleCheck) {
						if (item.getMaPhanNhom().equalsIgnoreCase("KT_GDCXN")) {
							//System.out.println("vao canbo.jsp===0000===="+item.getId());
							countHoSo = TthcXacNhanThanhToanLocalServiceUtil.countByTrangThaiXacNhanAndToChucQuanLy(organizationId, Constants.MTYT_CHUA_XAC_NHAN_THANH_TOAN + "");
						} else if (item.getMaPhanNhom().equalsIgnoreCase("KT_GDDXN")) {
							//System.out.println("vao canbo.jsp====11111==="+item.getId());
							countHoSo = TthcXacNhanThanhToanLocalServiceUtil.countByTrangThaiXacNhanAndToChucQuanLy(organizationId, Constants.MTYT_XAC_NHAN_THANH_TOAN_HOP_LE + "," +  Constants.MTYT_XAC_NHAN_THANH_TOAN_KHONG_HOP_LE);
						}
					} else {
						List<String> lstPar = new ArrayList<String>(Arrays.asList(new String[10]));
						lstPar.add(0, ConvertUtil.parseLongToString(organizationId));
						lstPar.add(1, ConvertUtil.parseLongToString(item.getId()));
						lstPar.add(9, ConvertUtil.parseLongToString(themeDisplay.getUser().getUserId()));
						countHoSo = MotCuaPhieuXuLyLocalServiceUtil.countMotCuaPhieuXuLy_NEW(lstPar); 
						//countHoSo = MotCuaPhieuXuLyLocalServiceUtil.countMotCuaPhieuXuLyByPhanNhomHoSo(item.getId(), organizationId, themeDisplay.getUser().getUserId(), "36345");
					}
					//set maPhanNhom vao session
// 					countHoSo = TthcHoSoThuTucLocalServiceUtil.countByGroupMaTrangThaiDoanhNghiepAndDoanhNghiepId(phanNhomTrangThaiHoSoCodeGroup, doanhNghiepId);
	/*				countHoSo = MotCuaPhieuXuLyLocalServiceUtil.countMotCuaPhieuXuLyByPhanNhomHoSo(ConvertUtil.convertToLong(item.getId()+""), organizationId, themeDisplay.getUser().getUserId(), liRoleSelected);
						
	*/                if(maPhanNhom.equals(item.getMaPhanNhom())){
							cssActive = "list-group-item";
						}else{
							cssActive = "";
						} 

					%>
					<portlet:actionURL var="xemThanhPhanHoSoThuTuc">
						<portlet:param name="jspPage" value="<%=redirectMenuQLHSURL %>" />
						<portlet:param name="<%=Constants.MA_PHAN_NHOM_HO_SO%>" value="<%=String.valueOf(item.getMaPhanNhom())%>" />
						<portlet:param name="<%=ActionRequest.ACTION_NAME%>" value="changeMenu" />
					</portlet:actionURL>
					<li><a href="<%=xemThanhPhanHoSoThuTuc %>" class="<%=(cssActive.trim().length() == 0) ? "textsub list-group-item" : cssActive %> "><span class="badge"><%=countHoSo %></span><%=item.getTenPhanNhom() %></a></li>
				<%
				}
				%>
				</ul>
				
				<a href="#" class="active list-group-item"><i class="MR5 fa3 fa fa-search"></i>Tra cứu thông tin</a>
				<ul>
				<%
				for (TthcPhanNhomHoSo tthcPhanNhomHoSo : lstPhanNhomTraCuuThongTin) {

					//set maPhanNhom vao session
					if (maPhanNhom != null && maPhanNhom.trim().length() == 0) {
						maPhanNhom = String.valueOf(tthcPhanNhomHoSo.getId());
						if (httpSession != null) {
							httpSession.setAttribute(Constants.MA_PHAN_NHOM_HO_SO, maPhanNhom);
						}

					}
					if(maPhanNhom.equals(tthcPhanNhomHoSo.getMaPhanNhom())){
						cssActive = "list-group-item";
					}else{
						cssActive = "";
					}
					%>
					<portlet:actionURL var="xemThanhPhanHoSoThuTuc1">
						<portlet:param name="jspPage" value="<%=redirectMenuQLHSURL %>" />
						<portlet:param name="<%=Constants.MA_PHAN_NHOM_HO_SO%>" value="<%=String.valueOf(tthcPhanNhomHoSo.getMaPhanNhom())%>" />
						<portlet:param name="<%=ActionRequest.ACTION_NAME%>" value="changeMenu" />
					</portlet:actionURL>
					<li><a href="<%=xemThanhPhanHoSoThuTuc1 %>" class="<%=(cssActive.trim().length() == 0) ? "textsub list-group-item" : cssActive %> "><span class="badge"></span><%=tthcPhanNhomHoSo.getTenPhanNhom() %></a></li>
				<%
				}
				%>
				</ul>
				
				<a href="#" class="active list-group-item"><i class="MR5 fa3 fa fa-bar-chart"></i>Báo cáo thống kê</a>
				<ul>
				<%
				for (TthcPhanNhomHoSo tthcPhanNhomHoSo : lstPhanNhomBaoCaoThongKe) {

					//set maPhanNhom vao session
					if (maPhanNhom != null && maPhanNhom.trim().length() == 0) {
						maPhanNhom = String.valueOf(tthcPhanNhomHoSo.getId());
						if (httpSession != null) {
							httpSession.setAttribute(Constants.MA_PHAN_NHOM_HO_SO, maPhanNhom);
						}

					}
					%>
					<portlet:actionURL var="xemThanhPhanHoSoThuTuc2">
						<portlet:param name="jspPage" value="<%=redirectMenuBaoCaoURL %>" />
						<portlet:param name="<%=Constants.MA_PHAN_NHOM_HO_SO%>" value="<%=String.valueOf(tthcPhanNhomHoSo.getMaPhanNhom())%>" />
						<portlet:param name="<%=ActionRequest.ACTION_NAME%>" value="changeMenu" />
					</portlet:actionURL>
					<li><a href="<%=xemThanhPhanHoSoThuTuc2 %>" class="textsub list-group-item"><span class="badge"><%=countHoSo %></span><%=tthcPhanNhomHoSo.getTenPhanNhom() %></a></li>
				<%
				}
				%>
				</ul>
			</li>
		</ul>
	</div><!-- end left -->
</nav><!-- end nav -->