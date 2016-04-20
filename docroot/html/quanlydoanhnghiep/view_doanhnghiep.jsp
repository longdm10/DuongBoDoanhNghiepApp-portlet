
<%@page import="vn.dtt.duongbo.dangky.DangKyMessageErrors"%>
<%@page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@page import="vn.dtt.duongbo.utils.format.FormatData"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepUserLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep"%>
<%@page import="vn.dtt.duongbo.utils.DanhMucKey"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>

<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>


<%@ include file="init.jsp"%>

<%
	String soDangKyKinhDoanh = ParamUtil.getString(request, "soDangKyKinhDoanh");
	String tenDoanhNghiep = ParamUtil.getString(request, "tenDoanhNghiep");
	String trangThai = ParamUtil.getString(request, "trangThai");
	
	String trangThaiObj = trangThai;
	
	if(trangThai.equalsIgnoreCase("CKH")) {
		trangThaiObj = null;
	}

	List<String> listTrangThai = new ArrayList<String>();
	
	listTrangThai.add(Constants.TRANG_THAI_HOAT_DONG);
	listTrangThai.add(Constants.TRANG_THAI_DUNG_HOAT_DONG);
	listTrangThai.add("CKH");
	
	long organizationId = 0;
	
	if (themeDisplay.getUser().getOrganizations() != null && themeDisplay.getUser().getOrganizations().size() > 0) {
		organizationId = themeDisplay.getUser().getOrganizations().get(0).getOrganizationId();
	}

	PortletURL portletUrl = renderResponse.createRenderURL();
	portletUrl.setParameter("soDangKyKinhDoanh", soDangKyKinhDoanh);
	portletUrl.setParameter("tenDoanhNghiep", tenDoanhNghiep);
	portletUrl.setParameter("trangThai", trangThai);
	
	SearchContainer searchContainer = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, 20, portletUrl, null, "");
	
	List<DnDoanhNghiep> listNguoiLamThuTuc = DnDoanhNghiepLocalServiceUtil.findBySDK_TDN_TCD_TT_L(soDangKyKinhDoanh, tenDoanhNghiep, null, trangThaiObj, Constants.LOAI_NGUOI_LAM_THU_TUC_DN, searchContainer.getStart(), searchContainer.getEnd());
	int totalSize = DnDoanhNghiepLocalServiceUtil.countBySDK_TDN_TCD_TT_L(soDangKyKinhDoanh, tenDoanhNghiep, null, trangThaiObj, Constants.LOAI_NGUOI_LAM_THU_TUC_DN);
	
	searchContainer.setResults(listNguoiLamThuTuc);
	searchContainer.setTotal(totalSize);
%>
<liferay-portlet:renderURL varImpl="searchURL">
	<portlet:param name="jspPage" value="/html/quanlydoanhnghiep/view.jsp" />
</liferay-portlet:renderURL>

<portlet:renderURL var="themMoiDoanhNghiepURL">
	<portlet:param name="jspPage" value="/html/quanlydoanhnghiep/edit_doanhnghiep.jsp" />
</portlet:renderURL>

<portlet:renderURL var="backURL">
	<portlet:param name="jspPage" value="/html/quanlydoanhnghiep/view.jsp" />
	<portlet:param name="defaultTab" value="0" />
</portlet:renderURL>

<aui:form action="<%=searchURL%>" name="myForm" id="myForm" method="get">
	<liferay-portlet:renderURLParams varImpl="searchURL" />

	<div class="col-xs-4 PA0">
		<label class="col-xs-5" style="padding-right: 0">Trạng thái tài khoản:</label>
		<p class="col-xs-7">
			<select class="form-control" name="<portlet:namespace/>trangThai">
				<option value="">--Tất cả--</option>
				
				<%
				for(String loaiTrangThai : listTrangThai){
					String tenTrangThaiHoatDong = "";
					
					if(loaiTrangThai.equalsIgnoreCase(Constants.TRANG_THAI_DUNG_HOAT_DONG)){
						tenTrangThaiHoatDong = "Dừng hoạt động";
					} else if(loaiTrangThai.equalsIgnoreCase(Constants.TRANG_THAI_HOAT_DONG)){
						tenTrangThaiHoatDong = "Đang hoạt động";
					} else if(loaiTrangThai.equalsIgnoreCase("CKH")){
						tenTrangThaiHoatDong = "Chưa kích hoạt";
					}
					
					String seld = "";
					if(trangThai.equalsIgnoreCase(loaiTrangThai)) {
						seld = "selected=\"selected\"";
					}
				%>
					<option <%= seld %> value="<%= loaiTrangThai %>"><%= tenTrangThaiHoatDong %></option>
				<%
				}
				%>
			</select>
		</p>
	</div>
	
	<div class="col-xs-5 PA0">
		<label class="col-xs-5" style="padding-right: 0">Giấy CN ĐKKD/Mã số DN:</label>
		<p class="col-xs-7">
			<input name="<portlet:namespace/>soDangKyKinhDoanh" type="text" class="form-control" value="<%= HtmlUtil.escape(soDangKyKinhDoanh) %>">
		</p>
	</div>
	<div class="col-xs-3 PA0">
		<label class="col-xs-3" style="padding-right: 0">Tên:</label>
		<p class="col-xs-9">
			<input name="<portlet:namespace/>tenDoanhNghiep" type="text" class="form-control" value="<%= HtmlUtil.escape(tenDoanhNghiep) %>">
		</p>
	</div>
	<div class="col-xs-12">
		<input type="submit" class="btn btn-primary btn-sm" value="Tìm kiếm">
		<input type="button" class="btn btn-primary btn-sm" onclick="location.href='<%=themMoiDoanhNghiepURL  %>'" value="Thêm doanh nghiệp">
	</div>

</aui:form>

<div class="col-xs-12" style="margin:30px 0 0">
	<table class="table table-striped table-bordered table-hover">
		<thead>
			<tr>
				<th width="5%">ID</th>
				<th width="10%">Giấy CN ĐKKD/Mã số DN</th>
				<th width="15%">Tên doanh nghiệp</th>
				<th width="15%">Địa chỉ</th>
				<th width="10%">Ngày đăng ký</th>
				<th width="10%">Trạng thái</th>
				<th width="15%">Thao tác</th>
			</tr>
		</thead>
		<tbody>
		<%	
		int index = 1;
		for (DnDoanhNghiep nguoiLamThuTuc : listNguoiLamThuTuc) {
			
			boolean isActive = false;
			boolean isActive2 = false;
			
			/* if(nguoiLamThuTuc.getMaKichHoat() != null && nguoiLamThuTuc.getMaKichHoat().trim().length() > 0){
				isActive = true;
			} */
			
			List<DnDoanhNghiepUser> listNguoiLamThuTucUsers = DnDoanhNghiepUserLocalServiceUtil.findByDnNguoiLamThuTucUserID(nguoiLamThuTuc.getId());
			
			DnDoanhNghiepUser nguoiLamThuTucUser = null;
			
			if(listNguoiLamThuTucUsers != null && listNguoiLamThuTucUsers.size() > 0){
				nguoiLamThuTucUser = listNguoiLamThuTucUsers.get(0);
			}
			
			String trangThaiDoanhNghiep = "";
			String trangThaiCSS = "";
			
			if(nguoiLamThuTucUser != null) {
				isActive = true;
				
				if(nguoiLamThuTucUser.getTinhTrangHoatDong().equalsIgnoreCase(Constants.TRANG_THAI_HOAT_DONG)){
					isActive2 = true;
					trangThaiDoanhNghiep = "Đang hoạt động";
					trangThaiCSS = "blue";
					
				}else if(nguoiLamThuTucUser.getTinhTrangHoatDong().equalsIgnoreCase(Constants.TRANG_THAI_DUNG_HOAT_DONG)){
					trangThaiDoanhNghiep = "Dừng hoạt động";
					trangThaiCSS = "red";
				}
			}
			
			if(isActive == false){
				trangThaiDoanhNghiep = "Chưa kích hoạt";
			}
		
			PortletURL actionKichHoat = renderResponse.createActionURL();
			actionKichHoat.setParameter(ActionRequest.ACTION_NAME, "kichHoatDoanhNghiep");
			actionKichHoat.setParameter(Constants.ID_DOANH_NGHIEP, String.valueOf(nguoiLamThuTuc.getId()));
			actionKichHoat.setParameter("backURL", backURL);
			
			PortletURL actionDungHoatDong = renderResponse.createActionURL();
			actionDungHoatDong.setParameter(ActionRequest.ACTION_NAME, "dungHoatDong");
			actionDungHoatDong.setParameter(Constants.ID_DOANH_NGHIEP, String.valueOf(nguoiLamThuTuc.getId()));
			actionDungHoatDong.setParameter("backURL", backURL);
			
			PortletURL actionkickHoatLai = renderResponse.createActionURL();
			actionkickHoatLai.setParameter(ActionRequest.ACTION_NAME, "kickHoatLai");
			actionkickHoatLai.setParameter(Constants.ID_DOANH_NGHIEP, String.valueOf(nguoiLamThuTuc.getId()));
			actionkickHoatLai.setParameter("backURL", backURL);
			
			PortletURL actionXoa = renderResponse.createActionURL();
			actionXoa.setParameter(ActionRequest.ACTION_NAME, "xoaDoanhNghiep");
			actionXoa.setParameter(Constants.ID_DOANH_NGHIEP, String.valueOf(nguoiLamThuTuc.getId()));
			actionXoa.setParameter("backURL", backURL);
			
			PortletURL editUrl = renderResponse.createRenderURL();
			editUrl.setParameter("jspPage", "/html/quanlydoanhnghiep/edit_doanhnghiep.jsp");
			editUrl.setParameter(Constants.ID_DOANH_NGHIEP, String.valueOf(nguoiLamThuTuc.getId()));
			
			PortletURL doiMatKhauUrl = renderResponse.createRenderURL();
			doiMatKhauUrl.setParameter("jspPage", "/html/quanlydoanhnghiep/edit_password.jsp");
			doiMatKhauUrl.setParameter(Constants.ID_DOANH_NGHIEP, String.valueOf(nguoiLamThuTuc.getId()));
			doiMatKhauUrl.setParameter("defaultTab", "0");
			
			%>
			<tr>
				<td><%= (index++) +  searchContainer.getStart() %></td>
				<td class="sp"><%=Validator.isNotNull(nguoiLamThuTuc) ? nguoiLamThuTuc.getMaSoDoanhNghiep() : "" %></td>
				<td class="sp"><%=Validator.isNotNull(nguoiLamThuTuc) ? nguoiLamThuTuc.getTenDoanhNghiep() : ""%></td>
				<td><%=Validator.isNotNull(nguoiLamThuTuc) ? nguoiLamThuTuc.getDiaChi() : ""%></td>
				<td><%=FormatData.parseDateToTringDDMMYYY(nguoiLamThuTuc.getNgayDangKi()) %></td>
				<td><span class="<%= trangThaiCSS %> "><%=trangThaiDoanhNghiep %></span></td>
				<td>
				<% if(isActive){
					if(isActive2){
						%>
							<a href="#" onClick='showAction("<%= actionDungHoatDong.toString() %>")' >Dừng hoạt động</a>
							
						<%
					}else{
						%>
						<a href="#" onClick='showAction("<%= actionkickHoatLai.toString() %>")' >Kích hoạt lại</a>
						<%
					}
					
				 } else {
				%>
					<a href="#" onClick='showAction("<%= actionKichHoat.toString() %>")' >Kích hoạt</a>
				<%} %>
				
				| <a href="<%=editUrl.toString()%>">Cập nhật</a>
				| <a href="#" onClick='showAction("<%= actionXoa.toString() %>")' >Xóa</a>
				| <a href="<%=doiMatKhauUrl.toString()%>">Đổi mật khẩu</a>
				</td>
			</tr>
			
		<%	
		}
		%>
		</tbody>
	</table>
	<%
	if(totalSize == 0){
	%>
		<h3>Không có doanh nghiêp nào tìm thấy</h3>
	<%
	}
	%>
	<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" />
</div>

<script type="text/javascript">

function showAction(actionURL)
{	
	var r = confirm("Bạn có muốn tiếp tục không?");
	
	if (r==true)
	{
		window.location.href = actionURL;
	}else{
		return;
	}
}
</script>

<style>
.blue {
	color: blue;
}
.red {
	color: red;
}
</style>
