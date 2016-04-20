
<%@page import="vn.dtt.duongbo.term.capbienhieuphuhieu.QLVTPhuHieuTerm"%>
<%@page import="vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyPhuHieuLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinXuLyLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo"%>
<%@ include file="/html/init.jsp"%>
<%@ include file="/html/param_init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
	QlvtThongTinHoSo ettThongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.fetchByphieuXuLyId(Long.valueOf("0"+phieuXuLyId));
	QlvtThongTinXuLy ettThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil.fetchBythongTinHoSoId(Integer.valueOf("0"+ettThongTinHoSo.getId()));
	QLVTXuLyPhuHieu ettXuLyPhuHieu = QLVTXuLyPhuHieuLocalServiceUtil.fetchBythongTinXuLyId(Integer.valueOf("0"+ettThongTinXuLy.getId()));

%>
<div id="info">
	<aui:input type="hidden" name="inforId1" value="<%=ettThongTinHoSo.getId() %>"></aui:input>
	<aui:input type="hidden" name="inforId2" value="<%=ettThongTinXuLy.getId() %>"></aui:input>
	<aui:input type="hidden" name="inforId3" value="<%=ettXuLyPhuHieu.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QLVTPhuHieuTerm.THONG_TIN_HO_SO_ID %>" value="<%=ettThongTinHoSo.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QLVTPhuHieuTerm.THONG_TIN_XU_LY_ID %>" value="<%=ettThongTinXuLy.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QLVTPhuHieuTerm.ID %>" value="<%=ettXuLyPhuHieu.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QLVTPhuHieuTerm.MA_TUYEN %>" value=""></aui:input>
	<aui:input type="hidden" name="<%=QLVTPhuHieuTerm.MA_TUYENS %>" value=""></aui:input>
</div>
<div id="dv1">
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="Thông tin đề nghị cấp biển hiệu: " cssClass="textBold" inlineField="<%=true %>" >
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="1. Số GPKD vận tải bằng xe ô tô: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTPhuHieuTerm.GIAY_PHEP_KD_VT %>" value="<%=ettThongTinHoSo.getSoDkkd() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
			<aui:field-wrapper label="Ngày cấp: " inlineField="<%=true %>" >
				<aui:input prefix="date" type="text" name="<%=QLVTPhuHieuTerm.NGAY_CAP_GIAY_PHEP_KD_VT %>" value="<%=ettThongTinHoSo.getNgayCapDkkd() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="Nơi cấp: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTPhuHieuTerm.NOI_CAP_GIAY_PHEP_KD_VT %>" value="<%=ettThongTinHoSo.getCoQuanCapDkkd() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="Thời hạn đến: " inlineField="<%=true %>" >
				<aui:input prefix="date" type="text" name="<%=QLVTPhuHieuTerm.NGAY_GIA_HAN_GIAY_PHEP_KD_VT %>" value="<%=ettThongTinHoSo.getNgayHetHanDkkd() %>" label="">
				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="2. Số văn bản chấp thuận tuyến: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTPhuHieuTerm.SOVB_CHAP_NHAN_TUYEN %>" value="<%=ettXuLyPhuHieu.getSovbChapNhanTuyen() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
			<aui:field-wrapper label="Ngày cấp: " inlineField="<%=true %>" >
				<aui:input prefix="date" type="text" name="<%=QLVTPhuHieuTerm.NGAY_CAP_VB_CHAP_NHAN_TUYEN %>" value="<%=ettXuLyPhuHieu.getNgayCapVBChapNhanTuyen() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="4. Số lượng xe xin cấp: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTPhuHieuTerm.SO_LUONG_XE_XIN_CAP %>" value="<%=ettXuLyPhuHieu.getSoLuong() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
</div>
<div style="width: 350px; float: left;">
	<liferay-util:include page="/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/bhph/bh_ph_form_cho_tham_xet_xu_ly_ph_dv2.jsp" servletContext="<%=this.getServletContext() %>">
		<liferay-util:param name="xuLyPhuHieuId" value="<%=String.valueOf(ettXuLyPhuHieu.getId()) %>" />
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
			    	trigger: '#<portlet:namespace /><%=QLVTPhuHieuTerm.NGAY_CAP_GIAY_PHEP_KD_VT %>',
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
			  }
			);
			
			AUI().use(
			  'aui-datepicker',
			  function(A) {
			    new A.DatePicker(
			      {
			    	trigger: '#<portlet:namespace /><%=QLVTPhuHieuTerm.NGAY_GIA_HAN_GIAY_PHEP_KD_VT %>',
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
			  }
			);
			
			
			
			AUI().use(
			  'aui-datepicker',
			  function(A) {
			    new A.DatePicker(
			      {
			    	trigger: '#<portlet:namespace /><%=QLVTPhuHieuTerm.NGAY_CAP_VB_CHAP_NHAN_TUYEN %>',
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
			  }
			);
</aui:script>

<aui:script use="aui-io-request,aui-node">
	AUI().one('#<portlet:namespace /><%=QLVTPhuHieuTerm.NGAY_CAP_GIAY_PHEP_KD_VT %>').val('<%=Validator.isNotNull(ettThongTinHoSo.getNgayCapDkkd())?sdf.format(ettThongTinHoSo.getNgayCapDkkd()):StringPool.BLANK %>');
	AUI().one('#<portlet:namespace /><%=QLVTPhuHieuTerm.NGAY_GIA_HAN_GIAY_PHEP_KD_VT %>').val('<%=Validator.isNotNull(ettThongTinHoSo.getNgayHetHanDkkd())?sdf.format(ettThongTinHoSo.getNgayHetHanDkkd()):StringPool.BLANK %>');
	AUI().one('#<portlet:namespace /><%=QLVTPhuHieuTerm.NGAY_CAP_VB_CHAP_NHAN_TUYEN %>').val('<%=Validator.isNotNull(ettXuLyPhuHieu.getNgayCapVBChapNhanTuyen())?sdf.format(ettXuLyPhuHieu.getNgayCapVBChapNhanTuyen()):StringPool.BLANK %>');
</aui:script>