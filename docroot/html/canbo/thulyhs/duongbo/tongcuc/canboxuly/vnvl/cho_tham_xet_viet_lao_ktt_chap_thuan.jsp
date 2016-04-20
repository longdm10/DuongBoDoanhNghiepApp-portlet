<%@page import="vn.dtt.duongbo.dao.quocte.service.QlvtXuLyKTTQuocTeLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTe"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.duongbo.business.DanhMucConstants"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanPhuongTienLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanPhuongTienImpl"%>
<%@page import="vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTien"%>
<%@page import="vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVan"%>
<%@page import="vn.dtt.duongbo.term.quocte.QLVTKhaiTacTuyen"%>
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
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
String idThuTucHanhChinh = ParamUtil.getString(request, Constants.ID_THU_TUC_HANH_CHINH);
long organizationId = 0;
if (themeDisplay.getUser().getOrganizations() != null && themeDisplay.getUser().getOrganizations().size() > 0) {
organizationId = themeDisplay.getUser().getOrganizations().get(0).getOrganizationId();

}
//String userName = PortalUtil.getUser(request).getFullName();
String col1 = ParamUtil.getString(request, "col1");
String hoSoThuTucId = ParamUtil.getString(request, Constants.ID_HO_SO_THU_TUC);
String phieuXuLyId = ParamUtil.getString(request, Constants.ID_PHIEU_XU_LY);
String quyTrinhThuTucId = ParamUtil.getString(request, Constants.ID_QUY_TRINH_THU_TUC);
String thanhPhanXuLy = ParamUtil.getString(request, Constants.THANH_PHAN_XU_LY);
String viewPdf = ParamUtil.getString(request, Constants.VIEW_PDF);
String isSuaCheckList = ParamUtil.getString(request, "suaCheckList");
String maThuTucHanhChinh = ParamUtil.getString(request, Constants.MA_THU_TUC_HANH_CHINH);
QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien = new QlvtXuLyGpLienVanPhuongTienImpl();

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
QlvtXuLyKTTQuocTe ettKTTQuocTe = QlvtXuLyKTTQuocTeLocalServiceUtil.fetchBythongTinXuLyId(Integer.valueOf("0"+ettThongTinXuLy.getId()));

List<DmDataItem> listLoaiHinhKDVT = DanhMucConstants.getallLoaiHinhHoatDong();
List<DmDataItem> listCuaKhauVietLao = DanhMucConstants.getCuaKhauVietLao();
List<DmDataItem> lstBenDi = DanhMucConstants.getBenXeVN();
List<DmDataItem> lstBenDen = DanhMucConstants.getBenXeVN();
List<DmDataItem> lstTinhTPLao = DanhMucConstants.getTinhTPLao();


%>
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
			<aui:field-wrapper label="Thông tin đề nghị khai thác tuyến vận tải hành khách tuyến cố định:" cssClass="textBold" inlineField="<%=true %>" >
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
				<aui:input type="text" name="<%=QLVTKhaiTacTuyen.NGAY_HET_HAN_GPKDVT %>" value="<%=ettThongTinHoSo.getNgayHetHanDkkd() %>" label="">
				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="Loại hình hoạt động: Vận tải hàng hóa bằng ô tô tuyến cố định" cssClass="textBold" inlineField="<%=true %>" >
				<aui:col width="100">
					<aui:input type="radio" name="<%=QLVTQuocTeTerm.KET_QUA_XU_LY_LOAI_HINH %>" value="1" label="Đạt" inlineField="<%=true %>" ></aui:input>
					<aui:input type="radio" name="<%=QLVTQuocTeTerm.KET_QUA_XU_LY_LOAI_HINH %>" value="0" label="Không đạt" inlineField="<%=true %>"></aui:input>
				</aui:col>
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	
	
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="2. Đăng ký khai thác tuyến vận tải hành khách tuyến cố định bằng xe ô tô giữa Việt Nam và Lào:" cssClass="textBold" inlineField="<%=true %>" >
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
			<aui:field-wrapper label="Tỉnh/thành phố đi *:" inlineField="<%=true %>" >
				<select id="<%=QLVTKhaiTacTuyen.TINH_TP_DI %>" name="<%=QLVTKhaiTacTuyen.TINH_TP_DI %>" class="form-control">
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
				<aui:input type="text" name="<%=QLVTKhaiTacTuyen.CU_LY_VAN_CHUYEN %>" value="<%=ettKTTQuocTe.getCuLyVanChuyen() %>" label="">
				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="Hành trình xe chạy:" cssClass="textBold" inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QLVTKhaiTacTuyen.HANH_TRINH_CHAY %>" value="<%=ettKTTQuocTe.getHanhTrinhChay() %>" label="">
				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>

	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="cửa khẩu đi/cửa khẩu đến" cssClass="textBold" inlineField="<%=true %>" >
				<select id="<%=QLVTKhaiTacTuyen.CUA_KHAU %>" name="<%=QLVTKhaiTacTuyen.CUA_KHAU %>" class="form-control">
				<%for (DmDataItem item : listCuaKhauVietLao) {
					%>
					<option value="<%=item.getCode()%>" ><%=item.getName()%></option>
					<%
				}%>
				</select>
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
</div>



<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="Thông tin biểu đồ xe chạy" cssClass="textBold" inlineField="<%=true %>" >
		</aui:field-wrapper>
	</aui:col>
</aui:row>

<div style="display: block;overflow: hidden;">
	<%@ include file="/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvl/info_bieu_do_xe_chay_ktt.jspf"%>
</div>


<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="Thông tin về điểm dừng nghỉ" cssClass="textBold" inlineField="<%=true %>" >
		</aui:field-wrapper>
	</aui:col>
</aui:row>

<div style="display: block;overflow: hidden;">
	<%@ include file="/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvl/info_diem_dung_nghi_ktt.jspf"%>
</div>

<div style="width: 350px; float: left;">
	<liferay-util:include page="/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvl/cho_tham_xet_viet_lao_ktt_dv2.jsp" servletContext="<%=this.getServletContext() %>">
		<liferay-util:param name="xuLyPhuHieuId" value="<%=String.valueOf(ettKTTQuocTe.getId()) %>" />
		<liferay-util:param name="tq2" value="thay_the_phuong_tien_tren_tuyen" />
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
 </aui:script>
 