<%@page import="vn.dtt.duongbo.term.quocte.QLVTQuocTeTerm"%>
<%@page import="vn.dtt.duongbo.dao.quocte.service.QlvtXuLyGpkdvtQuocTeLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTe"%>
<%@page import="vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyPhuHieuLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinXuLyLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo"%>
<%@page import="vn.dtt.duongbo.term.capbienhieuphuhieu.QLVTPhuHieuTerm"%>
<%@page import="vn.dtt.duongbo.dao.common.model.impl.TthcHoSoThuTucImpl"%>
<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@ include file="/html/init.jsp"%>
<%@ include file="/html/param_init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
// String idThuTucHanhChinh = ParamUtil.getString(request, Constants.ID_THU_TUC_HANH_CHINH);
long organizationId = 0;
if (themeDisplay.getUser().getOrganizations() != null && themeDisplay.getUser().getOrganizations().size() > 0) {
organizationId = themeDisplay.getUser().getOrganizations().get(0).getOrganizationId();
}
//String userName = PortalUtil.getUser(request).getFullName();
// String hoSoThuTucId = ParamUtil.getString(request, Constants.ID_HO_SO_THU_TUC);
// String phieuXuLyId = ParamUtil.getString(request, Constants.ID_PHIEU_XU_LY);
// String quyTrinhThuTucId = ParamUtil.getString(request, Constants.ID_QUY_TRINH_THU_TUC);
// String thanhPhanXuLy = ParamUtil.getString(request, Constants.THANH_PHAN_XU_LY);
String viewPdf = ParamUtil.getString(request, Constants.VIEW_PDF);
String isSuaCheckList = ParamUtil.getString(request, "suaCheckList");
// String maThuTucHanhChinh = ParamUtil.getString(request, Constants.MA_THU_TUC_HANH_CHINH);

PortletURL canBoDuyetThamXet = renderResponse.createActionURL();
canBoDuyetThamXet.setParameter(ActionRequest.ACTION_NAME, "ktt_choThamXet");
canBoDuyetThamXet.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
canBoDuyetThamXet.setParameter(Constants.ID_HO_SO_THU_TUC, hoSoThuTucId);
canBoDuyetThamXet.setParameter(Constants.ID_PHIEU_XU_LY, phieuXuLyId);
canBoDuyetThamXet.setParameter(Constants.ID_QUY_TRINH_THU_TUC, quyTrinhThuTucId);
canBoDuyetThamXet.setParameter(Constants.ID_THU_TUC_HANH_CHINH, idThuTucHanhChinh);
canBoDuyetThamXet.setParameter(Constants.MA_THU_TUC_HANH_CHINH, maThuTucHanhChinh);

QlvtThongTinHoSo ettThongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.fetchByphieuXuLyId(Long.valueOf("0"+phieuXuLyId));
QlvtThongTinXuLy ettThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil.fetchBythongTinHoSoId(Integer.valueOf("0"+ettThongTinHoSo.getId()));
QlvtXuLyGpkdvtQuocTe gpkdvtQuocTe = QlvtXuLyGpkdvtQuocTeLocalServiceUtil.fetchBythongTinXuLyId(Integer.valueOf("0"+ettThongTinXuLy.getId()));
%>
<aui:input type="hidden" name="<%=QLVTQuocTeTerm.ID %>" value="<%=ettThongTinHoSo.getId() %>" ></aui:input>
<div id="dv1">
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="1. Thông tin Giấy phép kinh doanh vận tải bằng xe ô tô: " cssClass="textBold" inlineField="<%=true %>" >
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="Số: " inlineField="<%=true %>" >
				<aui:input type="text" name="" value="<%=ettThongTinHoSo.getSoDkkd() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
			<aui:field-wrapper label="Ngày cấp: " inlineField="<%=true %>" >
				<aui:input type="text" name="" value="<%=ettThongTinHoSo.getNgayCapDkkd() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="Cơ quan cấp: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTQuocTeTerm.CO_QUAN_CAP_GIAY_PHEP_VAN_TAI_ID %>" value="<%=ettThongTinHoSo.getCoQuanCapDkkd() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
			<aui:field-wrapper label="Niên hạn: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTQuocTeTerm.NGAY_HET_HAN_GIAY_PHEP_VAN_TAI %>" value="<%=ettThongTinHoSo.getNgayHetHanDkkd() %>" label="">

				</aui:input>  
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="Cấp lần: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTQuocTeTerm.LAN_CAP_GIAY_DANG_KY_KINH_DOANH %>" value="<%=ettThongTinHoSo.getLanCapGiayDangKyKinhDoanh() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
			<aui:field-wrapper label="Ngày cấp lần đầu: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTQuocTeTerm.NGAY_CAP_GIAY_PHEP_VAN_TAI %>" value="<%=ettThongTinHoSo.getNgayCapDkkd() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="Đánh giá Giấy phép kinh doanh vận tải bằng xe ô tô: " cssClass="textBold"  inlineField="<%=true %>" >
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
	<aui:col width="100">
		<aui:input type="radio" name="<%=QLVTQuocTeTerm.KET_QUA_XU_LY %>" value="1" label="Đạt" inlineField="<%=true %>" onClick="showHiddenDiv1(1);"></aui:input>
		<aui:input type="radio" name="<%=QLVTQuocTeTerm.KET_QUA_XU_LY %>" value="0" label="Không đạt" inlineField="<%=true %>" onClick="showHiddenDiv1(0);"></aui:input>
	</aui:col>
</aui:row>
<div id="divDat0" style="display: none;margin-left: 20%;">
	
</div>
<div id="divKoDat0"style="display: none;margin-left: 20%;">
	<aui:input type="textarea" name="" cssClass="myTextArea"></aui:input>
</div>

</div>
<div style="width: 350px; float: left;">
	<liferay-util:include page="/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvl/cho_tham_xet_viet_lao_qpvt_cap_moi_dv2.jsp" servletContext="<%=this.getServletContext() %>">
		<liferay-util:param name="xuLyPhuHieuId" value="<%=String.valueOf(gpkdvtQuocTe.getId()) %>" />
		
	</liferay-util:include>
	<span id="group-success-block"></span>
</div>
<div id="dv3">

</div>
<aui:script>
AUI().use(
  'aui-datepicker',
  function(A) {
    new A.DatePicker(
      {
        trigger: '#<portlet:namespace /><%=QLVTQuocTeTerm.NGAY_CAP_GIAY_PHEP_VAN_TAI %>',
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
		    	trigger: '#<portlet:namespace /><%=QLVTQuocTeTerm.NGAY_HET_HAN_GIAY_PHEP_VAN_TAI %>',
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

