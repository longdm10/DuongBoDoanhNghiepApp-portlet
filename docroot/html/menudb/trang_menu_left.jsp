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

<nav class="PA0 BOR BGT" style="float: left; width: 100%">
	<div class="PA0 BGT col-xs-12">
		
		<!-- danh sach dich vu cong -->
		<%
			String dvcurl="/group/doanh-nghiep/";
		%>
		<h4 class="BOB font14 text-center"><a href='<%=dvcurl%>'>Danh sách dịch vụ công</a></h4>
		<ul class="menu list-group">
			<li>
				<a href="#" class="active list-group-item"><i class="MR5 fa3 fa fa-book"></i>Quản lý hồ sơ</a>
				<ul>

					<%
						String tatcahosourl="/group/doanh-nghiep/quan-ly-ho-so?type=1";
					%>
					<li><a href="<%=tatcahosourl %>" class="textsub list-group-item"><span class="badge">&nbsp;</span>Tất cả hồ sơ</a></li>

					<%
						String hosoluunhapurl="/group/doanh-nghiep/quan-ly-ho-so?type=2";
					%>
					<li><a href="<%=hosoluunhapurl %>" class="textsub list-group-item"><span class="badge">&nbsp;</span>Hồ sơ lưu nháp</a></li>
					
					<%
						String hosochotiepnhanurl="/group/doanh-nghiep/quan-ly-ho-so?type=3";
					%>
					<li><a href="<%=hosochotiepnhanurl %>" class="textsub list-group-item"><span class="badge">&nbsp;</span>Hồ sơ chờ tiếp nhận</a></li>
					
					<%
						String hosodatraketquaurl="/group/doanh-nghiep/quan-ly-ho-so?type=4";
					%>
					<li><a href="<%=hosodatraketquaurl %>" class="textsub list-group-item"><span class="badge">&nbsp;</span>Hồ sơ đã chả kết quả</a></li>
	
				</ul>
				
				<a href="#" class="active list-group-item"><i class="MR5 fa3 fa fa-book"></i>Nộp hồ sơ</a>
				<ul>
					<%
						String hsvaocangbienurl="/group/doanh-nghiep/ho-so-vao-cang-bien";
					%>
					<li><a href="<%=hsvaocangbienurl %>"  class="textsub list-group-item"><span class="badge"></span>Hồ sơ vào cảng biến</a></li>
					
					<%
						String hsroicangbienurl="/group/doanh-nghiep/ho-so-roi-cang-bien";
					%>
					<li><a href="<%=hsroicangbienurl %>"  class="textsub list-group-item"><span class="badge"></span>Hồ sơ rời cảng biến</a></li>
					
					<%
						String hstauurl="/group/doanh-nghiep/thong-tin-phuong-tien";
					%>
					<li><a href="<%=hstauurl %>"  class="textsub list-group-item"><span class="badge"></span>Khai báo phương tiện</a></li>
				</ul>
				
			</li>
		</ul>
	</div><!-- end left -->
</nav><!-- end nav -->