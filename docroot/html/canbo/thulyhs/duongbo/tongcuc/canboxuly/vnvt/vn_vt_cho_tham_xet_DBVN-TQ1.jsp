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
			<strong>1. Thông tin giấy phép kinh doanh vận tải bằng xe ô tô: <i>(đối với các doanh nghiệp, hợp tác xã kinh doanh vận tải hành khách và kinh doanh vận tải hàng hóa bằng công-ten-nơ )</i></strong>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="Số:" inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QlvtLienVanTerm.SO_GIAY_PHEP_KINH_DOANH_VAN_TAI_NOI_DIA %>" value="<%=ettThongTinHoSo.getSoGiayPhepKinhDoanhVanTaiNoiDia() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
			<aui:field-wrapper label="Ngày cấp:" inlineField="<%=true %>" >
				<aui:input prefix="date" type="text" name="<%=QlvtLienVanTerm.NGAY_CAP_GPKDVT_NOI_DIA %>" value="<%=ettThongTinHoSo.getNgayCapGPKDVTNoiDia() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="Cơ quan cấp: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QlvtLienVanTerm.CO_QUAN_CAP_PHEP_LIEN_VAN %>" value="<%=ettThongTinHoSo.getCoQuanCapGPKDVTNoiDia() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
			<aui:field-wrapper label="Niên hạn: " inlineField="<%=true %>" >
				<aui:input prefix="date" type="text" name="<%=QlvtLienVanTerm.NGAY_HET_HAN_GPKDVT_NOI_DIA %>" value="<%=ettThongTinHoSo.getNgayHetHanGPKDVTNoiDia()%>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="Cấp lần: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QlvtLienVanTerm.LAN_CAP_GPKDVT_NOI_KIA %>" value="<%=ettThongTinHoSo.getLanCapGPKDVTNoiDia() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
			<aui:field-wrapper label="Ngày cấp lần đầu:" inlineField="<%=true %>" >
				<aui:input prefix="date" type="text" name="<%=QlvtLienVanTerm.NGAY_CAP_GPKDVT_NOI_DIA %>" value="<%=ettThongTinHoSo.getNgayCapGPKDVTNoiDia() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="100">
			<strong>2. Thông tin giấy chứng nhận đăng ký kinh doanh: <i>(đối với các doanh nghiệp, hợp tác xã kinh doanh vận tải hàng hóa khác)</i></strong>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="Số:" inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QlvtLienVanTerm.SO_GPKD %>" value="<%=ettThongTinHoSo.getSoDkkd() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
			<aui:field-wrapper label="Ngày cấp:" inlineField="<%=true %>" >
				<aui:input prefix="date" type="text" name="<%=QlvtLienVanTerm.NGAY_CAP_GPKD %>" value="<%=ettThongTinHoSo.getNgayCapDkkd() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="Cơ quan cấp: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QlvtLienVanTerm.CO_QUAN_CAP_GPKD %>" value="<%=ettThongTinHoSo.getCoQuanCapDkkd() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
			<aui:field-wrapper label="Niên hạn: " inlineField="<%=true %>" >
				<aui:input prefix="date" type="text" name="<%=QlvtLienVanTerm.NIEN_HAN_GPKD %>" value="<%=ettThongTinHoSo.getNgayHetHanDkkd()%>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="Cấp lần: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QlvtLienVanTerm.LAN_CAP_GIAY_DANG_KY_KINH_DOANH %>" value="<%=ettThongTinHoSo.getLanCapGiayDangKyKinhDoanh()%>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
			<aui:field-wrapper label="Ngày cấp lần đầu:" inlineField="<%=true %>" >
				<aui:input prefix="date" type="text" name="<%=QlvtLienVanTerm.NGAY_CAP_GPKD %>" value="<%=ettThongTinHoSo.getNgayCapDkkd()%>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="100">
			<strong>3. Người liên hệ trả kết quả cấp phép:</strong>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="Họ tên:" inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QlvtLienVanTerm.HO_TEN_NGUOI_TRA_KET_QUA %>" value="<%=ettThongTinHoSo.getNguoiLienHeTraKetQua() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
			<aui:field-wrapper label="Điện thoại: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QlvtLienVanTerm.DIEN_THOAI_NGUOI_TRA_KET_QUA %>" value="<%=ettThongTinHoSo.getSoDienThoaiNguoiLienHe()%>" label="">

				</aui:input> 
			</aui:field-wrapper>
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
<aui:script use="aui-io-request,aui-node">
var A = AUI();

	AUI().use(
			  'aui-datepicker',
			  function(A) {
			    new A.DatePicker(
			      {
			    	trigger: '#<portlet:namespace /><%=QlvtLienVanTerm.NGAY_CAP_GPKDVT_NOI_DIA %>',
			        mask: '%m/%d/%Y',
			        popover: {
			          zIndex: 1
			        },
			        on: {
			          selectionChange: function(event) {
			            console.log(event.newSelection)
			          }
			        }
			      }
			    );
			  });

	AUI().use(
			  'aui-datepicker',
			  function(A) {
			    new A.DatePicker(
			      {
			    	trigger: '#<portlet:namespace /><%=QlvtLienVanTerm.NGAY_HET_HAN_GPKDVT_NOI_DIA %>',
			        mask: '%m/%d/%Y',
			        popover: {
			          zIndex: 1
			        },
			        on: {
			          selectionChange: function(event) {
			            console.log(event.newSelection)
			          }
			        }
			      }
			    );
			  });

	AUI().use(
			  'aui-datepicker',
			  function(A) {
			    new A.DatePicker(
			      {
			    	trigger: '#<portlet:namespace /><%=QlvtLienVanTerm.NGAY_CAP_GPKD %>',
			        mask: '%m/%d/%Y',
			        popover: {
			          zIndex: 1
			        },
			        on: {
			          selectionChange: function(event) {
			            console.log(event.newSelection)
			          }
			        }
			      }
			    );
			  });

	AUI().use(
			  'aui-datepicker',
			  function(A) {
			    new A.DatePicker(
			      {
			    	trigger: '#<portlet:namespace /><%=QlvtLienVanTerm.NIEN_HAN_GPKD %>',
			        mask: '%m/%d/%Y',
			        popover: {
			          zIndex: 1
			        },
			        on: {
			          selectionChange: function(event) {
			            console.log(event.newSelection)
			          }
			        }
			      }
			    );
			  });

</aui:script>
<aui:script use="aui-io-request,aui-node">
AUI().one('#<portlet:namespace /><%=QlvtLienVanTerm.NGAY_CAP_GPKDVT_NOI_DIA%>').val('<%=Validator.isNotNull(ettThongTinHoSo.getNgayCapGPKDVTNoiDia())?sdf.format(ettThongTinHoSo.getNgayCapGPKDVTNoiDia()):StringPool.BLANK %>');
AUI().one('#<portlet:namespace /><%=QlvtLienVanTerm.NGAY_HET_HAN_GPKDVT_NOI_DIA%>').val('<%=Validator.isNotNull(ettThongTinHoSo.getNgayHetHanGPKDVTNoiDia())?sdf.format(ettThongTinHoSo.getNgayHetHanGPKDVTNoiDia()):StringPool.BLANK %>');
AUI().one('#<portlet:namespace /><%=QlvtLienVanTerm.NGAY_CAP_GPKD%>').val('<%=Validator.isNotNull(ettThongTinHoSo.getNgayCapDkkd())?sdf.format(ettThongTinHoSo.getNgayCapDkkd()):StringPool.BLANK %>');
AUI().one('#<portlet:namespace /><%=QlvtLienVanTerm.NIEN_HAN_GPKD%>').val('<%=Validator.isNotNull(ettThongTinHoSo.getNgayHetHanDkkd())?sdf.format(ettThongTinHoSo.getNgayHetHanDkkd()):StringPool.BLANK %>');
</aui:script>