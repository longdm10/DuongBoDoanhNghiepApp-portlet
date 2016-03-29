<%@page import="vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanPhuongTienImpl"%>
<%@page import="vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTien"%>
<%@page import="vn.dtt.duongbo.term.lienvan.QlvtLienVanTerm"%>
<%@page import="vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinXuLyLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVan"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo"%>
<%@ include file="/html/init.jsp"%>
<%@ include file="/html/param_init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien = new QlvtXuLyGpLienVanPhuongTienImpl();
QlvtThongTinHoSo ettThongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.fetchByphieuXuLyId(Long.valueOf("0"+phieuXuLyId));
QlvtThongTinXuLy ettThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil.fetchBythongTinHoSoId(Integer.valueOf("0"+ettThongTinHoSo.getId()));
QlvtXuLyGpLienVan ettGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.fetchBythongTinXuLyId(Integer.valueOf("0"+ettThongTinXuLy.getId()));

%>

<div id="info">
	<aui:input type="hidden" name="inforId1" value="<%=ettThongTinHoSo.getId() %>"></aui:input>
	<aui:input type="hidden" name="inforId2" value="<%=ettThongTinXuLy.getId() %>"></aui:input>
	<aui:input type="hidden" name="inforId3" value="<%=ettGpLienVan.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QlvtLienVanTerm.THONG_TIN_HO_SO_ID %>" value="<%=ettThongTinHoSo.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QlvtLienVanTerm.THONG_TIN_XU_LY_ID %>" value="<%=ettThongTinXuLy.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QlvtLienVanTerm.ID %>" value="<%=ettGpLienVan.getId() %>"></aui:input>
</div>


<div id="dv1">
	<aui:row>
		<aui:col width="100">
			<h5><b>Thông tin đề nghị cấp giấy phép vận tải đường bộ Việt Nam - Trung Quốc</b></h5>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="100">
			<strong>1. Thông tin xe:</strong>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="Số khung:" inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QlvtLienVanTerm.SO_KHUNG %>" value="<%=qlvtXuLyGpLienVanPhuongTien.getSoKhung() %> " label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
			<aui:field-wrapper label="Số máy:" inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QlvtLienVanTerm.SO_MAY %>" value="<%=qlvtXuLyGpLienVanPhuongTien.getSoMay() %> " label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="Màu sơn: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QlvtLienVanTerm.MAU_SON %>" value=" <%=qlvtXuLyGpLienVanPhuongTien.getMauSon()%> " label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
			<aui:field-wrapper label="Nhãn hiệu: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QlvtLienVanTerm.NHAN_HIEU %>" value="<%=qlvtXuLyGpLienVanPhuongTien.getNhanHieu() %> " label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="100">
			<strong> Đánh giá thông tin đề nghị cấp giấy phép vận tải đường bộ Việt Nam - Trung Quốc:</strong>
		</aui:col>
	</aui:row>
</div>
<div style="width: 350px; float: left;">
	<liferay-util:include page="/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvt/vn_vt_cho_tham_xet_dv2.jsp" servletContext="<%=this.getServletContext() %>">
		<liferay-util:param name="xuLyPhuHieuId" value="<%=String.valueOf(ettGpLienVan.getId()) %>" />
		<liferay-util:param name="tq2" value="1" />
	</liferay-util:include>
	<span id="group-success-block"></span>
</div>
<div id="dv3">

</div>
<aui:button-row>
	<aui:button value="Lưu" type="submit" onClick="simpleSumbit();"></aui:button>
</aui:button-row>
