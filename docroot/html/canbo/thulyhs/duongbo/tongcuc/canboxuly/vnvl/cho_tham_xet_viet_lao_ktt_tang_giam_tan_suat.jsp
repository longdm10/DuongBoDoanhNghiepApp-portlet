<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.duongbo.business.DanhMucConstants"%>
<%@page import="vn.dtt.duongbo.dao.quocte.service.QlvtXuLyKTTQuocTeLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTe"%>
<%@page import="vn.dtt.duongbo.term.quocte.QLVTQuocTeTerm"%>
<%@page import="vn.dtt.duongbo.dao.quocte.service.QlvtXuLyGpkdvtQuocTeLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTe"%>
<%@page import="vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyPhuHieuLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinXuLyLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo"%>
<%@page import="vn.dtt.duongbo.dao.common.model.impl.TthcHoSoThuTucImpl"%>
<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@page import="vn.dtt.duongbo.term.quocte.QLVTKhaiTacTuyen"%>
<%@page import="java.util.List"%>
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
canBoDuyetThamXet.setParameter(ActionRequest.ACTION_NAME, "canBoDuyetThamXet");
canBoDuyetThamXet.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
canBoDuyetThamXet.setParameter(Constants.ID_HO_SO_THU_TUC, hoSoThuTucId);
canBoDuyetThamXet.setParameter(Constants.ID_PHIEU_XU_LY, phieuXuLyId);
canBoDuyetThamXet.setParameter(Constants.ID_QUY_TRINH_THU_TUC, quyTrinhThuTucId);
canBoDuyetThamXet.setParameter(Constants.ID_THU_TUC_HANH_CHINH, idThuTucHanhChinh);
canBoDuyetThamXet.setParameter(Constants.MA_THU_TUC_HANH_CHINH, maThuTucHanhChinh);

QlvtThongTinHoSo ettThongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.fetchByphieuXuLyId(Long.valueOf("0"+phieuXuLyId));
QlvtThongTinXuLy ettThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil.fetchBythongTinHoSoId(Integer.valueOf("0"+ettThongTinHoSo.getId()));
QlvtXuLyKTTQuocTe ettKTTQuocTe = QlvtXuLyKTTQuocTeLocalServiceUtil.fetchBythongTinXuLyId(Integer.valueOf("0"+ettThongTinXuLy.getId()));


List<DmDataItem> lstBenDi = DanhMucConstants.getBenXeVN();
List<DmDataItem> lstBenDen = DanhMucConstants.getBenXeVN();
List<DmDataItem> lstTinhTPLao = DanhMucConstants.getTinhTPLao();

%>
<aui:input type="hidden" name="<%=QLVTKhaiTacTuyen.ID %>" value="<%=ettThongTinHoSo.getId() %>" ></aui:input>



<div id="info">
	<aui:input type="hidden" name="inforId1" value="<%=ettThongTinHoSo.getId() %>"></aui:input>
	<aui:input type="hidden" name="inforId2" value="<%=ettThongTinXuLy.getId() %>"></aui:input>
	<aui:input type="hidden" name="inforId3" value="<%=ettKTTQuocTe.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QLVTKhaiTacTuyen.THONG_TIN_HO_SO_ID %>" value="<%=ettThongTinHoSo.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QLVTKhaiTacTuyen.THONG_TIN_XU_LY_ID %>" value="<%=ettThongTinXuLy.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QLVTKhaiTacTuyen.ID %>" value="<%=ettKTTQuocTe.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QLVTKhaiTacTuyen.MA_TUYEN %>" value=""></aui:input>
</div>


<div id="dv1">
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="Thông tin đề nghị tăng giảm tần suất chạy xe trên tuyến vận tải hành khách cố định bằng xe ô tô:" cssClass="textBold" inlineField="<%=true %>" >
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="1. Giấy phép vận tải đường bộ quốc tế Việt Nam - Lào do Tổng cục Đường bộ Việt Nam cấp:" cssClass="textBold" inlineField="<%=true %>" >
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	
	
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="Số: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTKhaiTacTuyen.SO_QPKD %>" value="<%=ettThongTinHoSo.getSoDkkd() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="Ngày cấp: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTKhaiTacTuyen.NGAY_CAP_GPKD %>" value="<%=ettThongTinHoSo.getNgayCapDkkd() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	
	
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="Có hiệu lực đến: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTKhaiTacTuyen.NGAY_HET_HAN_GPKDVT %>" value="" label="">
				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="Tăng/giảm tần suất chạy xe kể từ ngày:" inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTKhaiTacTuyen.NGAY_TANG_GIAM_TAN_XUAT_TU %>" value="" label="">
				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="Tần suất khai thác:" inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTKhaiTacTuyen.TAN_XUAT %>" value="" label="">
				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="Tên tuyến đề nghị tăng/giảm tần suất chạy xe:" cssClass="textBold" inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTKhaiTacTuyen.TEN_TUYEN_DE_NGHI_TANG_GIAM_TAN_SUAT %>" value="" label="">
				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="Bến đi: " inlineField="<%=true %>" >
				<select id="<%=QLVTKhaiTacTuyen.BEN_DI %>" name="<%=QLVTKhaiTacTuyen.BEN_DI %>" class="form-control">
				<%for (DmDataItem item : lstBenDi) {
					%>
					<option value="<%=item.getCode()%>" ><%=item.getName()%></option>
					<%
				}%>
				</select> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
			<select id="<%=QLVTKhaiTacTuyen.TINH_TP_DI %>" name="<%=QLVTKhaiTacTuyen.TINH_TP_DI %>" class="form-control">
				<%for (DmDataItem item : lstTinhTPLao) {
					%>
					<option value="<%=item.getCode()%>" ><%=item.getName()%></option>
					<%
				}%>
			</select>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="Bến đến: " inlineField="<%=true %>" >
				<select id="<%=QLVTKhaiTacTuyen.BEN_DEN %>" name="<%=QLVTKhaiTacTuyen.BEN_DEN %>" class="form-control">
				<%for (DmDataItem item : lstBenDen) {
					%>
					<option value="<%=item.getCode()%>" ><%=item.getName()%></option>
					<%
				}%>
				</select>
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
			<aui:field-wrapper label="Tỉnh/thành phố đến *:" inlineField="<%=true %>" >
				<select id="<%=QLVTKhaiTacTuyen.TINH_TP_DEN %>" name="<%=QLVTKhaiTacTuyen.TINH_TP_DEN %>" class="form-control">
				<%for (DmDataItem item : lstTinhTPLao) {
					%>
					<option value="<%=item.getCode()%>" ><%=item.getName()%></option>
					<%
				}%>
				</select> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="Cự ly vận chuyển:" cssClass="textBold" inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTKhaiTacTuyen.CU_LY_VAN_CHUYEN %>" value="" label="">
				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="Hành trình xe chạy:" cssClass="textBold" inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTKhaiTacTuyen.HANH_TRINH_CHAY %>" value="" label="">
				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
</div>
<div style="width: 350px; float: left;">
	<liferay-util:include page="/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvl/cho_tham_xet_viet_lao_ktt_dv2.jsp" servletContext="<%=this.getServletContext() %>">
		<liferay-util:param name="xuLyPhuHieuId" value="<%=String.valueOf(ettKTTQuocTe.getId()) %>" />
		<liferay-util:param name="tq2" value="tang_giam_tan_suat" />
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
        trigger: '#<portlet:namespace /><%=QLVTKhaiTacTuyen.NGAY_HET_HAN_GPKDVT %>',
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
        trigger: '#<portlet:namespace /><%=QLVTKhaiTacTuyen.NGAY_TANG_GIAM_TAN_XUAT_TU %>',
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
        trigger: '#<portlet:namespace /><%=QLVTKhaiTacTuyen.NGAY_CAP_GPKD %>',
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
AUI().one('#<portlet:namespace /><%=QLVTKhaiTacTuyen.NGAY_CAP_GPKD%>').val('<%=Validator.isNotNull(ettThongTinHoSo.getNgayCapDkkd())?sdf.format(ettThongTinHoSo.getNgayCapDkkd()):StringPool.BLANK %>');
AUI().one('#<portlet:namespace /><%=QLVTKhaiTacTuyen.NGAY_HET_HAN_GPKDVT%>').val('<%=Validator.isNotNull(ettThongTinHoSo.getNgayHetHanGPKDVTQuocTe())?sdf.format(ettThongTinHoSo.getNgayHetHanGPKDVTQuocTe()):StringPool.BLANK %>');
AUI().one('#<portlet:namespace /><%=QLVTKhaiTacTuyen.NGAY_TANG_GIAM_TAN_XUAT_TU%>').val('<%=Validator.isNotNull(ettThongTinHoSo.getNgayHetHanDkkd())?sdf.format(ettThongTinHoSo.getNgayHetHanDkkd()):StringPool.BLANK %>');
</aui:script> 