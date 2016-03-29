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
			<strong>1. Mục đích xin cấp phép cho ô tô *:</strong>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="" inlineField="<%=true %>" >
				<aui:input type="text" name="<%= QlvtLienVanTerm.MUC_DICH_CHUYEN_DI %>" value="<%= ettGpLienVan.getMucDichChuyenDi() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="100">
			<strong>2.  Người liên hệ trả kết quả cấp phép:</strong>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="Họ tên:" inlineField="<%=true %>" >
				<aui:input disabled="true" type="text" name="" value="<%=ettThongTinHoSo.getNguoiLienHeTraKetQua() %>" label="">
				</aui:input>  
				
				<aui:input type="hidden" name="<%=QlvtLienVanTerm.HO_TEN_NGUOI_TRA_KET_QUA %>" value="<%=ettThongTinHoSo.getNguoiLienHeTraKetQua() %>" label="">
				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
			<aui:field-wrapper label="Điện thoại:" inlineField="<%=true %>" >
				<aui:input disabled="true" type="text" name="<%=QlvtLienVanTerm.DIEN_THOAI_NGUOI_TRA_KET_QUA %>" value="<%=ettThongTinHoSo.getSoDienThoaiNguoiLienHe()%>" label="">
				</aui:input> 
				<aui:input type="hidden" name="<%=QlvtLienVanTerm.DIEN_THOAI_NGUOI_TRA_KET_QUA %>" value="<%=ettThongTinHoSo.getSoDienThoaiNguoiLienHe()%>" label="">
				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	
</div>
<div style="width: 350px; float: left;">
	<liferay-util:include page="/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvt/vn_vt_cho_tham_xet_dv2.jsp" servletContext="<%=this.getServletContext() %>">
		<liferay-util:param name="xuLyPhuHieuId" value="<%=String.valueOf(ettGpLienVan.getId()) %>" />
		<liferay-util:param name="tq2" value="2" />
	</liferay-util:include>
	<span id="group-success-block"></span>
</div>
<div id="dv3">

</div>
