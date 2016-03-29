<%@page import="vn.dtt.duongbo.dao.lienvan.service.QlvtCapPhepGpkdvtDuongboQuocTeLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpkdvtDuongboQuocTe"%>
<%@page import="vn.dtt.duongbo.report.ReportUtils"%>
<%@page import="vn.dtt.duongbo.term.quocte.QLVTQuocTeTerm"%>
<%@page import="vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.quocte.service.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai"%>
<%@page import="vn.dtt.duongbo.dao.quocte.service.QlvtXuLyGpkdvtQuocTeLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTe"%>
<%@page import="java.util.Arrays"%>
<%@page import="vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVan"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy"%>
<%@page import="vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinXuLyLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo"%>
<%@ include file="/html/init.jsp"%>
<%@ include file="/html/param_init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%

QlvtThongTinHoSo ettThongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.fetchByphieuXuLyId(Long.valueOf("0"+phieuXuLyId));
QlvtThongTinXuLy ettThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil.fetchBythongTinHoSoId(Integer.valueOf("0"+ettThongTinHoSo.getId()));
QlvtXuLyGpkdvtQuocTe gpkdvtQuocTe = QlvtXuLyGpkdvtQuocTeLocalServiceUtil.fetchBythongTinXuLyId(Integer.valueOf("0"+ettThongTinXuLy.getId()));

// QlvtCapPhepGpkdvtDuongboQuocTe ettCapPhepGpkdvtDuongBoQuocTe = QlvtCapPhepGpkdvtDuongboQuocTeLocalServiceUtil.fetchQlvtCapPhepGpkdvtDuongboQuocTe(id);


List<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai> lstLoaiHinhHD = QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiLocalServiceUtil.findBythongTinCapGpkdVanTaiId(Integer.valueOf("0"+gpkdvtQuocTe.getId()));
List<DmDataItem> lstCoQuanCapPhep = DanhMucConstants.getCoQuanCapPhep(idThuTucHanhChinh+"");
List<DmDataItem> lstLoaiHinhKDVT = DanhMucConstants.getLoaiHinhKDVT();


%>

<div id="info">
	<aui:input type="hidden" name="inforId1" value="<%=ettThongTinHoSo.getId() %>"></aui:input>
	<aui:input type="hidden" name="inforId2" value="<%=ettThongTinXuLy.getId() %>"></aui:input>
	<aui:input type="hidden" name="inforId3" value="<%=gpkdvtQuocTe.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QLVTQuocTeTerm.THONG_TIN_HO_SO_ID %>" value="<%=ettThongTinHoSo.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QLVTQuocTeTerm.THONG_TIN_XU_LY_ID %>" value="<%=ettThongTinXuLy.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QLVTQuocTeTerm.ID %>" value="<%=gpkdvtQuocTe.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QLVTQuocTeTerm.MA_TUYEN %>" value=""></aui:input>
	<aui:input type="hidden" name="<%=QLVTQuocTeTerm.MA_TUYENS %>" value=""></aui:input>
</div>

<aui:row>
	<aui:column columnWidth="50">
		<aui:row>
			<aui:col width="100">
				<aui:field-wrapper cssClass="textCenter" label="Thông tin của lần cấp phép trước" inlineField="<%=true %>" inlineLabel="true">
				</aui:field-wrapper>
				<aui:field-wrapper cssClass="fix30" label="1. Tên doanh nghiệp, HTX:" inlineField="<%=true %>" inlineLabel="true">
					<%=ettThongTinHoSo.getTenDn()%>
				</aui:field-wrapper>
				<aui:field-wrapper cssClass="fix30" label="2. Địa chỉ:" inlineField="<%=true %>" inlineLabel="true">
					<%=ettThongTinHoSo.getDiaChiDn()%>
				</aui:field-wrapper>
				<aui:field-wrapper cssClass="fix30" label="3. Số điện thoại:" inlineField="<%=true %>" inlineLabel="true">
					<%=ettThongTinHoSo.getDienThoaiDn()%>
				</aui:field-wrapper>
				<aui:field-wrapper cssClass="fix30" label="<span class='hidden'>3. </span>Số fax:" inlineField="<%=true %>" inlineLabel="true">
					<%=ettThongTinHoSo.getSoFaxDn()%>
				</aui:field-wrapper>
				<aui:field-wrapper label="4. Giấy phép vận tải đường bộ quốc tế Việt Nam - Lào:" inlineField="<%=true %>" inlineLabel="true">
				</aui:field-wrapper>
				<aui:row>
					<aui:col width="50">
						<aui:field-wrapper label="<span class='hidden'>4. </span>Số:" inlineField="<%=true %>" inlineLabel="true">
							<%=ettThongTinHoSo.getSoGiayPhepKinhDoanhVanTaiNoiDia() %>
						</aui:field-wrapper>
					</aui:col>
					<aui:col width="50">
						<aui:field-wrapper label="Ngày cấp:" inlineField="<%=true %>" inlineLabel="true">
							<%=Validator.isNotNull(sdf.format(ettThongTinHoSo.getNgayCapGPKDVTNoiDia()))?sdf.format(ettThongTinHoSo.getNgayCapGPKDVTNoiDia()):StringPool.BLANK %>
						</aui:field-wrapper>
					</aui:col>
				</aui:row>
				<aui:field-wrapper cssClass="top6" label="<span class='hidden'>4. </span>Cơ quan cấp:" inlineField="<%=true %>" inlineLabel="true">
					<%=ettThongTinHoSo.getCoQuanCapGPKDVTNoiDia() %>
				</aui:field-wrapper>
				<aui:field-wrapper cssClass="fix30" label="5. Loại hình hoạt động:" inlineField="<%=true %>" inlineLabel="true">
					<aui:row cssClass="pad15">
						<%
							for(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai loaiHinh :lstLoaiHinhHD){
						%>
							<%=HtmlUtil.escape(DmDataItemLocalServiceUtil.findByGroupIdAndCode(Constants.GROUP_ID_LOAI_HINH_HOAT_DONG, loaiHinh.getMaLoaiHinhHoatDong()).getName()) %>
						<%} %>
					</aui:row>
				</aui:field-wrapper>
				<aui:field-wrapper label="6. Loại hình đề nghị cấp:" inlineField="<%=true %>" inlineLabel="true">
					<%=ReportUtils.getTenDmDataByCode(gpkdvtQuocTe.getLoaiCapPhep())%>
				</aui:field-wrapper>
			</aui:col>
		</aui:row>
	</aui:column>
	<aui:column columnWidth="50" cssClass="borderLeft">
		<aui:row>
			<aui:col width="100">
				<aui:field-wrapper cssClass="textCenter" label="Thông tin đề nghị thay đổi" inlineField="<%=true %>" inlineLabel="true">
				</aui:field-wrapper>
				<aui:field-wrapper cssClass="pad15 top6" label="" inlineField="<%=true %>" inlineLabel="true">
					<aui:input placeholder="Tên doanh nghiệp, HTX" name="<%=QLVTQuocTeTerm.TEN_DN %>" value="<%=ettThongTinHoSo.getTenDn() %>" label=""></aui:input>
				</aui:field-wrapper>
				<aui:field-wrapper cssClass="pad15 top6" label="" inlineField="<%=true %>" inlineLabel="true">
					<aui:input placeholder="Địa chỉ" name="<%=QLVTQuocTeTerm.DIA_CHI_DN%>" value="<%=ettThongTinHoSo.getDiaChiDn()%>" label=""></aui:input>
				</aui:field-wrapper>
				<aui:field-wrapper cssClass="pad15 top6" label="" inlineField="<%=true %>" inlineLabel="true">
					<aui:input placeholder="Số điện thoại" name="<%=QLVTQuocTeTerm.DIEN_THOAI_DN%>" value="<%=ettThongTinHoSo.getDienThoaiDn()%>" label=""></aui:input>
				</aui:field-wrapper>
				<aui:field-wrapper cssClass="pad15 top6" label="" inlineField="<%=true %>" inlineLabel="true">
					<aui:input placeholder="Số fax" name="<%=QLVTQuocTeTerm.SO_FAX_DN%>" value="<%=ettThongTinHoSo.getSoFaxDn()%>" label=""></aui:input>
				</aui:field-wrapper>
				<aui:field-wrapper label="4. Giấy phép vận tải đường bộ quốc tế Việt Nam - Lào:" inlineField="<%=true %>" inlineLabel="true">
				</aui:field-wrapper>
				<aui:row cssClass="pad15 top6">
					<aui:col width="50">
						<aui:field-wrapper label="" inlineField="<%=true %>" inlineLabel="true">
							<aui:input placeholder="Số" name="<%=QLVTQuocTeTerm.SO_GIAY_PHEP_KINH_DOANH_VAN_TAI_NOI_DIA%>" value="<%=ettThongTinHoSo.getSoGiayPhepKinhDoanhVanTaiNoiDia() %>" label=""></aui:input>
						</aui:field-wrapper>
					</aui:col>
					<aui:col width="50">
						<aui:field-wrapper label="" inlineField="<%=true %>" inlineLabel="true">
							<aui:input placeholder="Ngày cấp" prefix="date" name="<%=QLVTQuocTeTerm.NGAY_CAP_GPKDVT_NOI_DIA%>" value="<%=Validator.isNotNull(sdf.format(ettThongTinHoSo.getNgayCapGPKDVTNoiDia()))?sdf.format(ettThongTinHoSo.getNgayCapGPKDVTNoiDia()):StringPool.BLANK %>" label=""></aui:input>
						</aui:field-wrapper>
					</aui:col>
				</aui:row>
				<aui:field-wrapper cssClass="pad15 top6" label="" inlineField="<%=true %>" inlineLabel="true">
					<aui:input placeholder="Cơ quan cấp" name="<%=QLVTQuocTeTerm.CO_QUAN_CAP_GIAY_PHEP_VAN_TAI_ID%>" value="<%=ettThongTinHoSo.getCoQuanCapGPKDVTNoiDia() %>" label=""></aui:input>
				</aui:field-wrapper>
				<aui:field-wrapper cssClass="fix30" label="5. Loại hình hoạt động:" inlineField="<%=true %>" inlineLabel="true">
					<aui:row cssClass="pad15">
						<%
							for(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai loaiHinh :lstLoaiHinhHD){
						%>
							<%=HtmlUtil.escape(DmDataItemLocalServiceUtil.findByGroupIdAndCode(Constants.GROUP_ID_LOAI_HINH_HOAT_DONG, loaiHinh.getMaLoaiHinhHoatDong()).getName()) %>
						<%} %>
					</aui:row>
				</aui:field-wrapper>
				
				<aui:field-wrapper label="6. Loại hình đề nghị cấp:" inlineField="<%=true %>" inlineLabel="true">
					<%=ReportUtils.getTenDmDataByCode(gpkdvtQuocTe.getLoaiCapPhep())%>
				</aui:field-wrapper>
			</aui:col>
		</aui:row>
	</aui:column>
</aui:row>
<aui:row>
	<aui:col width="100" >
		<aui:field-wrapper label="7. Lý do xin cấp lại:" inlineField="<%=true %>" inlineLabel="true">
					<aui:input name="<%=QLVTQuocTeTerm.LY_DO_KHONG_DAT%>" value="<%=ettThongTinHoSo.getLyDoCapLai() %>" label="">
					<aui:validator  name="required "  errorMessage="Lý do không đạt không được để trống!" />
					</aui:input>
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
	<aui:input type="textarea" name="" cssClass="myTextArea" label="Lý do:"></aui:input>
</div>

<style>
.borderLeft{
	border-left: 1px solid lightgray;
}
 .fix30 .control-label{
	width: 40% !important;
}
.pad15{
	padding-left: 15px !important;
}
.top6{
	margin-top: -6px !important;
}
.aui .hidden {
    display: initial !important;
}
.textCenter{
text-align: center;
}
.control-group.control-group-inline.field-wrapper {
    padding-top: 18px !important;
}
</style>
<aui:script use="aui-io-request,aui-node">
var A = AUI();
AUI().ready(function(A){
	var idThongTinXuLy = A.one('#<portlet:namespace /><%=QLVTQuocTeTerm.THONG_TIN_XU_LY_ID %>');
	idThongTinXuLy.val(A.one("#<portlet:namespace/>inforId2").val());
});
	AUI().use(
			  'aui-datepicker',
			  function(A) {
			    new A.DatePicker(
			      {
			    	trigger: '#<portlet:namespace /><%=QLVTQuocTeTerm.NGAY_CAP_GPKDVT_QUOC_TE %>',
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
			    	trigger: '#<portlet:namespace /><%=QLVTQuocTeTerm.NGAY_CAP_GPKDVT_NOI_DIA %>',
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

