<%@page import="vn.dtt.duongbo.term.capbienhieuphuhieu.QLVTBienHieuTerm"%>
<%@page import="vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyBienHieuLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinXuLyLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieu"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo"%>
<%@ include file="/html/init.jsp"%>
<%@ include file="/html/param_init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%

PortletURL canBoDuyetThamXet = renderResponse.createActionURL();
canBoDuyetThamXet.setParameter(ActionRequest.ACTION_NAME, "canBoDuyetThamXet");
canBoDuyetThamXet.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
canBoDuyetThamXet.setParameter(Constants.ID_HO_SO_THU_TUC, hoSoThuTucId);
canBoDuyetThamXet.setParameter(Constants.ID_PHIEU_XU_LY, phieuXuLyId);
canBoDuyetThamXet.setParameter(Constants.ID_QUY_TRINH_THU_TUC, quyTrinhThuTucId);
canBoDuyetThamXet.setParameter(Constants.ID_THU_TUC_HANH_CHINH, idThuTucHanhChinh);
canBoDuyetThamXet.setParameter(Constants.MA_THU_TUC_HANH_CHINH, maThuTucHanhChinh);

QlvtThongTinHoSo ettThongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.fetchByphieuXuLyId(Long.valueOf("0"+phieuXuLyId));
QlvtThongTinXuLy ettThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil.fetchBythongTinHoSoId(Integer.valueOf("0"+ettThongTinHoSo.getId()));
QLVTXuLyBienHieu ettXuLyBienHieu = QLVTXuLyBienHieuLocalServiceUtil.fetchBythongTinXuLyId(Integer.valueOf("0"+ettThongTinXuLy.getId()));

%>
<div id="info">
	<aui:input type="hidden" name="inforId1" value="<%=ettThongTinHoSo.getId() %>"></aui:input>
	<aui:input type="hidden" name="inforId2" value="<%=ettThongTinXuLy.getId() %>"></aui:input>
	<aui:input type="hidden" name="inforId3" value="<%=ettXuLyBienHieu.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QLVTBienHieuTerm.THONG_TIN_HO_SO_ID %>" value="<%=ettThongTinHoSo.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QLVTBienHieuTerm.THONG_TIN_XU_LY_ID %>" value="<%=ettThongTinXuLy.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QLVTBienHieuTerm.ID %>" value="<%=ettXuLyBienHieu.getId() %>"></aui:input>
</div>

<div id="dv1">
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="Thông tin đề nghị cấp biển hiệu: " cssClass="textBold" inlineField="<%=true %>" >
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="1. Tên đơn vị vận tải: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTBienHieuTerm.TEN_DOANH_NGHIEP %>" value="<%=ettThongTinHoSo.getTenDn() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="2. Số GPKD vận tải bằng xe ô tô: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTBienHieuTerm.GIAY_PHEP_KD_VT %>" value="<%=ettThongTinHoSo.getSoDkkd() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
			<aui:field-wrapper label="Ngày cấp: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTBienHieuTerm.NGAY_CAP_GIAY_PHEP_KD_VT %>" value="<%=ettThongTinHoSo.getNgayCapDkkd() %>" label="" prefix="date">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="Nơi cấp: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTBienHieuTerm.NOI_CAP_GIAY_PHEP_KD_VT %>" value="<%=ettThongTinHoSo.getCoQuanCapDkkd() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="Thời hạn đến: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTBienHieuTerm.NGAY_GIA_HAN_GIAY_PHEP_KD_VT %>" value="<%=ettThongTinHoSo.getNgayHetHanDkkd() %>" label="" prefix="date">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="3. GPKD lữ hành quốc tế (hoặc giấy chứng nhận ĐKKD) số: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTBienHieuTerm.SO_GPDK_LU_HANH_QUOC_TE %>" value="<%=ettXuLyBienHieu.getGpkdLuuHanhQuocTe() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
			<aui:field-wrapper label="Ngày cấp: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTBienHieuTerm.NGAY_CAP_GPDK_LU_HANH_QUOC_TE %>" value="<%=ettXuLyBienHieu.getGpkdLuuHanhQuocTeNgayCap() %>" label="" prefix="date">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="Nơi cấp: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTBienHieuTerm.NOI_CAP_GPDK_LU_HANH_QUOC_TE %>" value="<%=ettXuLyBienHieu.getGpkdLuuHanhQuocTeCQCAP() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="Thời hạn đến: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTBienHieuTerm.NGAY_GIA_HAN_GPDK_LU_HANH_QUOC_TE %>" value="<%=ettXuLyBienHieu.getGpkdLuuHanhQuocTeNgayHetHan() %>" label="" prefix="date">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="4. Số lượng xe xin cấp: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTBienHieuTerm.SO_LUONG_XE_XIN_CAP %>" value="<%=ettXuLyBienHieu.getSoLuongXe() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
</div>
<div style="width: 350px; float: left;">
	<liferay-util:include page="/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/bhph/bh_ph_form_cho_tham_xet_xu_ly_bh_dv2.jsp" servletContext="<%=this.getServletContext() %>">
		<liferay-util:param name="xuLyPhuHieuId" value="<%=String.valueOf(ettXuLyBienHieu.getId()) %>" />
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
			    	trigger: '#<portlet:namespace /><%=QLVTBienHieuTerm.NGAY_CAP_GIAY_PHEP_KD_VT %>',
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
			    	trigger: '#<portlet:namespace /><%=QLVTBienHieuTerm.NGAY_GIA_HAN_GIAY_PHEP_KD_VT %>',
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
			    	trigger: '#<portlet:namespace /><%=QLVTBienHieuTerm.NGAY_CAP_GPDK_LU_HANH_QUOC_TE %>',
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
			    	  trigger: '#<portlet:namespace /><%=QLVTBienHieuTerm.NGAY_GIA_HAN_GPDK_LU_HANH_QUOC_TE %>',
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
	AUI().one('#<portlet:namespace /><%=QLVTBienHieuTerm.NGAY_CAP_GIAY_PHEP_KD_VT %>').val('<%=Validator.isNotNull(ettThongTinHoSo.getNgayCapDkkd())?sdf.format(ettThongTinHoSo.getNgayCapDkkd()):StringPool.BLANK %>');
	AUI().one('#<portlet:namespace /><%=QLVTBienHieuTerm.NGAY_GIA_HAN_GIAY_PHEP_KD_VT %>').val('<%=Validator.isNotNull(ettThongTinHoSo.getNgayHetHanDkkd())?sdf.format(ettThongTinHoSo.getNgayHetHanDkkd()):StringPool.BLANK %>');
	AUI().one('#<portlet:namespace /><%=QLVTBienHieuTerm.NGAY_CAP_GPDK_LU_HANH_QUOC_TE %>').val('<%=Validator.isNotNull(ettXuLyBienHieu.getGpkdLuuHanhQuocTeNgayCap())?sdf.format(ettXuLyBienHieu.getGpkdLuuHanhQuocTeNgayCap()):StringPool.BLANK %>');
	AUI().one('#<portlet:namespace /><%=QLVTBienHieuTerm.NGAY_GIA_HAN_GPDK_LU_HANH_QUOC_TE %>').val('<%=Validator.isNotNull(ettXuLyBienHieu.getGpkdLuuHanhQuocTeNgayHetHan())?sdf.format(ettXuLyBienHieu.getGpkdLuuHanhQuocTeNgayHetHan()):StringPool.BLANK %>');
</aui:script>
