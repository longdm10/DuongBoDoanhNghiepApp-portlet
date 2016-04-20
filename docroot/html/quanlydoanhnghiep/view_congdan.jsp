
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
	String tabCongDan = String.valueOf(1);
	String tenCongDan = ParamUtil.getString(request, "tenCongDan");
	String trangThai = ParamUtil.getString(request, "trangThai");
	
	String trangThaiObj = trangThai;
	
	List<String> listTrangThai = new ArrayList<String>();
	
	listTrangThai.add(Constants.TRANG_THAI_HOAT_DONG);
	listTrangThai.add(Constants.TRANG_THAI_DUNG_HOAT_DONG);
	
	long organizationId = 0;
	
	if (themeDisplay.getUser().getOrganizations() != null && themeDisplay.getUser().getOrganizations().size() > 0) {
		organizationId = themeDisplay.getUser().getOrganizations().get(0).getOrganizationId();
	}

	PortletURL portletUrl = renderResponse.createRenderURL();
	portletUrl.setParameter("tenCongDan", tenCongDan);
	portletUrl.setParameter("trangThai", trangThai);
	portletUrl.setParameter("defaultTab", tabCongDan);
	
	SearchContainer searchContainer = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, 20, portletUrl, null, "");
	
	List<DnDoanhNghiep> listNguoiLamThuTuc = DnDoanhNghiepLocalServiceUtil.findBySDK_TDN_TCD_TT_L(null, null, tenCongDan, trangThaiObj, Constants.LOAI_NGUOI_LAM_THU_TUC_CD, searchContainer.getStart(), searchContainer.getEnd());
	int totalSize = DnDoanhNghiepLocalServiceUtil.countBySDK_TDN_TCD_TT_L(null, null, tenCongDan, trangThaiObj, Constants.LOAI_NGUOI_LAM_THU_TUC_CD);
	
	searchContainer.setResults(listNguoiLamThuTuc);
	searchContainer.setTotal(totalSize);
%>
<liferay-portlet:renderURL varImpl="searchURL">
	<portlet:param name="jspPage" value="/html/quanlydoanhnghiep/view.jsp" />
	<portlet:param name="defaultTab" value="<%= tabCongDan %>" />
</liferay-portlet:renderURL>

<portlet:renderURL var="themMoiCongDanURL">
	<portlet:param name="jspPage" value="/html/quanlydoanhnghiep/edit_congdan.jsp" />
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
	
	<div class="col-xs-4 PA0">
		<label class="col-xs-3">Tên:</label>
		<p class="col-xs-9">
			<input name="<portlet:namespace/>tenCongDan" type="text" class="form-control" value="<%= HtmlUtil.escape(tenCongDan) %>">
		</p>
	</div>
	<div class="col-xs-4 PA0">
		<input type="submit" class="btn btn-primary btn-sm" value="Tìm kiếm">
		<input type="button" class="btn btn-primary btn-sm" onclick="location.href='<%=themMoiCongDanURL  %>'" value="Thêm công dân">
	</div>
	
	<div class="clear"></div>
</aui:form>

<div class="col-xs-12" style="margin:30px 0 0">
	
	<table class="table table-striped table-bordered table-hover">
		<thead>
			<tr>
				<th width="5%">ID</th>
				<th width="15%">Tên công dân</th>
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
			
			List<DnDoanhNghiepUser> listNguoiLamThuTucUsers = DnDoanhNghiepUserLocalServiceUtil.findByDnNguoiLamThuTucUserID(nguoiLamThuTuc.getId());
			
			DnDoanhNghiepUser nguoiLamThuTucUser = null;
			
			if(listNguoiLamThuTucUsers != null && listNguoiLamThuTucUsers.size() > 0){
				nguoiLamThuTucUser = listNguoiLamThuTucUsers.get(0);
			}
			
			String trangThaiDoanhNghiep = "";
			String trangThaiCSS = "";
			
			if(nguoiLamThuTucUser != null) {
				if(nguoiLamThuTucUser.getTinhTrangHoatDong().equalsIgnoreCase(Constants.TRANG_THAI_HOAT_DONG)){
					isActive = true;
					trangThaiDoanhNghiep = "Đang hoạt động";
					trangThaiCSS = "blue";
					
				}else if(nguoiLamThuTucUser.getTinhTrangHoatDong().equalsIgnoreCase(Constants.TRANG_THAI_DUNG_HOAT_DONG)){
					trangThaiDoanhNghiep = "Dừng hoạt động";
					trangThaiCSS = "red";
				}
			}
			
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
			editUrl.setParameter("jspPage", "/html/quanlydoanhnghiep/edit_congdan.jsp");
			editUrl.setParameter(Constants.ID_DOANH_NGHIEP, String.valueOf(nguoiLamThuTuc.getId()));
			
			PortletURL doiMatKhauUrl = renderResponse.createRenderURL();
			doiMatKhauUrl.setParameter("jspPage", "/html/quanlydoanhnghiep/edit_password.jsp");
			doiMatKhauUrl.setParameter(Constants.ID_DOANH_NGHIEP, String.valueOf(nguoiLamThuTuc.getId()));
			doiMatKhauUrl.setParameter("defaultTab", "1");
		%>
			<tr>
				<td><%= (index++) +  searchContainer.getStart() %></td>
				<td class="sp"><%=Validator.isNotNull(nguoiLamThuTuc) ? nguoiLamThuTuc.getTenCongDan() : ""%></td>
				<td><%=Validator.isNotNull(nguoiLamThuTuc) ? nguoiLamThuTuc.getDiaChi() : ""%></td>
				<td><%=FormatData.parseDateToTringDDMMYYY(nguoiLamThuTuc.getNgayDangKi()) %></td>
				<td><span class="<%= trangThaiCSS %> "><%=trangThaiDoanhNghiep %></span></td>
				<td>
				<c:choose>
					<c:when test="<%= isActive %>">
						<a href="#" onClick='showAction("<%= actionDungHoatDong.toString() %>")' >Dừng hoạt động</a>
					</c:when>
					
					<c:otherwise>
						<a href="#" onClick='showAction("<%= actionkickHoatLai.toString() %>")' >Kích hoạt lại</a>
					</c:otherwise>
				</c:choose>
				
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
		<h3>Không có công dân nào tìm thấy</h3>
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
