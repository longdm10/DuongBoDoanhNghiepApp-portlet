
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.duongbo.term.quocte.QLVTQuocTeTerm"%>
<%@ include file="/html/init.jsp"%>
<%@ include file="/html/param_init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%

PortletURL quocTe_vietCam_HTHS = renderResponse.createActionURL();
quocTe_vietCam_HTHS.setParameter(ActionRequest.ACTION_NAME, "quocTe_vietCam_HTHS");
quocTe_vietCam_HTHS.setParameter(Constants.ID_HO_SO_THU_TUC, hoSoThuTucId);
quocTe_vietCam_HTHS.setParameter(Constants.ID_PHIEU_XU_LY, phieuXuLyId);
quocTe_vietCam_HTHS.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
quocTe_vietCam_HTHS.setParameter(Constants.ID_QUY_TRINH_THU_TUC, quyTrinhThuTucId);
quocTe_vietCam_HTHS.setParameter(Constants.ID_THU_TUC_HANH_CHINH, idThuTucHanhChinh);
QlvtThongTinHoSo ettThongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.fetchByphieuXuLyId(Long.valueOf("0"+phieuXuLyId));
QlvtThongTinXuLy ettThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil.fetchBythongTinHoSoId(Integer.valueOf("0"+ettThongTinHoSo.getId()));
%>

<portlet:renderURL var="renderSearchContent">
			<portlet:param name="jspPage" value="/html/hscanbo/search_content.jsp"/>
			<portlet:param name="<%=Constants.ID_HO_SO_THU_TUC%>" value="<%=StringUtil.valueOf(hoSoThuTucId)%>"/>
			<portlet:param name="<%=Constants.ID_PHIEU_XU_LY%>" value="<%=StringUtil.valueOf(phieuXuLyId)%>"/>
			<portlet:param name="<%=Constants.THANH_PHAN_XU_LY%>" value="<%=StringUtil.valueOf(thanhPhanXuLy)%>"/>
</portlet:renderURL>
<aui:form name="fm" action="#">
<div class="TabbedPanelsContent">
	<div align="center">
		<%@ include file="/html/canbo/thulyhs/duongbo/tongcuc/report_common/export_cong_van.jsp"%>
	</div>
	
		<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="Họ tên người trả kết quả:" inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTQuocTeTerm.NGUOI_LIEN_HE_TRA_KET_QUA %>" value="<%=ettThongTinHoSo.getNguoiLienHeTraKetQua() %>" label="">
				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
			<aui:field-wrapper label="Điện thoại người trả kết quả: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTQuocTeTerm.SO_DIEN_THOAI_NGUOI_LIEN_HE %>" value="<%=ettThongTinHoSo.getSoDienThoaiNguoiLienHe()%>" label="">
				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="Họ tên người nhận kết quả:" inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTQuocTeTerm.NGUOI_NHAN_KET_QUA %>" value="<%=ettThongTinHoSo.getNguoiNhanKetQua()%>" label="">
				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
			<aui:field-wrapper label="Điện thoại người nhận kết quả: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTQuocTeTerm.THONG_TIN_TRA_KET_QUA %>" value="<%=ettThongTinHoSo.getThongTinTraKetQua()%>" label="">
				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="50" >
				<aui:field-wrapper label="ngày trả kết quả: " inlineField="<%=true %>" >
					<aui:input type="text" name="<%=QLVTQuocTeTerm.NGAY_TRA_KET_QUA %>" value="<%=ettThongTinHoSo.getNgayTraKetQua() %>" label="">
					</aui:input> 
				</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<div style = "margin-top: 20px;">
		<aui:input type="hidden" name="keyDichChuyen"></aui:input>
		<aui:input type="hidden" name="<%=Constants.ID_PHIEU_XU_LY %>" value="<%=phieuXuLyId %>"></aui:input>
		<aui:input type="hidden" name="<%=Constants.ID_QUY_TRINH_THU_TUC %>" value="<%=quyTrinhThuTucId %>"></aui:input>
		<aui:input type="hidden" name="actionCHK"></aui:input>
		<aui:input type="hidden" name="actionURL" value="<%=quocTe_vietCam_HTHS.toString() %>"></aui:input>
		<aui:input type="hidden" name="userIdXuLy"></aui:input>
			<aui:input type="hidden" name="idFileFm"></aui:input>
		<aui:button cssClass="btn btn-primary" value="Trả kết quả" onClick="chuyenDichDynamic('Xac.nhan');"/>
	</div>
</div>
<%@ include file="/html/canbo/thulyhs/duongbo/tongcuc/report_common/script_button.jspf"%>
</aui:form>
<aui:script use="aui-io-request,aui-node">
var A = AUI();
AUI().use(
		  'aui-datepicker',
		  function(A) {
		    new A.DatePicker(
		      {
		    	trigger: '#<portlet:namespace /><%=QLVTQuocTeTerm.NGAY_TRA_KET_QUA %>',
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
	AUI().one('#<portlet:namespace /><%=QLVTQuocTeTerm.NGAY_TRA_KET_QUA  %>').val('<%=Validator.isNotNull(ettThongTinHoSo.getNgayTraKetQua())?sdf.format(ettThongTinHoSo.getNgayTraKetQua()):StringPool.BLANK %>');
</aui:script>