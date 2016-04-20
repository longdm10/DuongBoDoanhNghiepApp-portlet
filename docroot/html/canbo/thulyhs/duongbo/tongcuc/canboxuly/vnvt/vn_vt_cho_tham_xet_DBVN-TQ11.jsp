<%@page import="vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepLocalService"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalService"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep"%>
<%@page import="vn.dtt.duongbo.utils.format.DateUtils"%>
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

TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(Long.valueOf(hoSoThuTucId));

long idDoanhNghiep = 0;
idDoanhNghiep = hoSoThuTuc.getNguoiLamThuTucId();

DnDoanhNghiep dnDoanhNghiep = DnDoanhNghiepLocalServiceUtil.fetchDnDoanhNghiep(idDoanhNghiep);


%>

<div id="info">
	<aui:input type="hidden" name="inforId1" value="<%=ettThongTinHoSo.getId() %>"></aui:input>
	<aui:input type="hidden" name="inforId2" value="<%=ettThongTinXuLy.getId() %>"></aui:input>
	<aui:input type="hidden" name="inforId3" value="<%=ettGpLienVan.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QlvtLienVanTerm.THONG_TIN_HO_SO_ID %>" value="<%=ettThongTinHoSo.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QlvtLienVanTerm.THONG_TIN_XU_LY_ID %>" value="<%=ettThongTinXuLy.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QlvtLienVanTerm.ID %>" value="<%=ettGpLienVan.getId() %>"></aui:input>
</div>

<portlet:renderURL var="GuiDuyetURL" windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
	<portlet:param name="mvcPath" value="/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/dang_tham_xet_viet_trung.jsp" />
	<portlet:param name="<%=Constants.ID_THU_TUC_HANH_CHINH%>" value="<%=String.valueOf(idThuTucHanhChinh)%>" />
	<portlet:param name="<%=Constants.ID_HO_SO_THU_TUC%>" value="<%=String.valueOf(hoSoThuTucId)%>" />
	<portlet:param name="<%=Constants.ID_PHIEU_XU_LY%>" value="<%=String.valueOf(phieuXuLyId)%>" />
	<portlet:param name="<%=Constants.ID_QUY_TRINH_THU_TUC%>" value="<%=String.valueOf(quyTrinhThuTucId)%>" />
	<portlet:param name="<%=Constants.THANH_PHAN_XU_LY%>" value="<%=String.valueOf(thanhPhanXuLy)%>" />
</portlet:renderURL>



<portlet:renderURL var="LuuThongTin" windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>"></portlet:renderURL>

<style>
	.linH30 {
		line-height: 30px !important;
	}
</style>
<div class="p30 tab-content">
	<div id="menu1" class="tab-pane fade in active">
		<h5><b>Thông tin đề nghị cấp giấy phép vận tải đường bộ Việt Nam - Trung Quốc</b></h5>
		<div class="row MB5">
			
			<div class="col-xs-6">
				<h5 class="text-center"><b>Thông tin của lần cấp phép trước</b></h5>
				<div class="BOR">
					<div class="row"><p class="linH30 pull-left col-xs-3">1. Tên đơn vị:</p><label class="col-xs-9 linH30"><%= ettThongTinHoSo.getTenDn()%></label></div>
					<div class="row"><p class="linH30 pull-left col-xs-3">2. Địa chỉ:</p><label class="col-xs-9 "><%=ettThongTinHoSo.getDiaChiDn()%></label></div>
					<div class="row"><p class="linH30 pull-left col-xs-3 textlabel">3. Số GPKDVT:</p><label class="col-xs-9 linH30">Không có trong DB</label></div>
					<div class="row"><p class="linH30 pull-left col-xs-12">4. Giấy phép kinh doanh vận tải bằng xe ô tô:</p></div>
					<div class="row">
						<p class="linH30 pull-left col-xs-3">Số:</p>
						<label class="linH30 col-xs-3"><%=dnDoanhNghiep.getSoGpkdVanTaiBangOto() %></label>
						
						<p class="linH30 pull-left col-xs-3">Ngày cấp:</p>
						<label class="linH30 col-xs-3"><%=DateUtils.dateToString("dd/MM/yyyy", dnDoanhNghiep.getNgayCapGpkdVanTaiBangOto())%></label>
						
						<div class="clear"></div>
						
						<p class="linH30 pull-left col-xs-3">Cơ quan cấp:</p>
						<label class="linH30 col-xs-9"><%=(dnDoanhNghiep.getCoQuanCapGpkdVanTaiBangOto()!= null) ? dnDoanhNghiep.getCoQuanCapGpkdVanTaiBangOto(): ""%></label>
					</div>
					
					<div class="row"><p class="linH30 pull-left col-xs-12">5. Giấy chứng nhận đăng ký kinh doanh:</p></div>
					<div class="row">
						<p class="linH30 pull-left col-xs-3">Số:</p>
						<label class="linH30 col-xs-3"><%=dnDoanhNghiep.getSoDangKyKinhDoanh() %></label>
						
						<p class="linH30 pull-left col-xs-3">Ngày cấp:</p>
						<label class="linH30 col-xs-3"><%=DateUtils.dateToString("dd/MM/yyyy", dnDoanhNghiep.getNgayCapDkKd())%></label>
						
						<div class="clear"></div>
						
						<p class="linH30 pull-left col-xs-3">Cơ quan cấp:</p>
						<label class="linH30 col-xs-9"><%=(dnDoanhNghiep.getCoQuanCapDkKd()!= null) ? dnDoanhNghiep.getCoQuanCapDkKd(): ""%></label>
					</div>
				</div>
			</div>
			
			<div class="col-xs-6" style="border-left: 1px solid lightgray;">
				<h5 class="text-center"><b>Thông tin đề nghị cấp lại</b></h5>
				<div class="row">
					<aui:input disabled="true" placeholder="Tên đơn vị" type="text" label="" id="<%= QlvtLienVanTerm.TEN_DN%>" name="<%= QlvtLienVanTerm.TEN_DN%>" value="<%=ettThongTinHoSo.getTenDn() %>" class="form-control" />
				</div>
				<div class="row">
					<aui:input disabled="true" placeholder="Địa chỉ" type="text" label="" id="<%= QlvtLienVanTerm.DIA_CHI_DN%>" name="<%= QlvtLienVanTerm.DIA_CHI_DN%>" value="<%=ettThongTinHoSo.getDiaChiDn()%>" class="form-control" />
				</div>
				<div class="row">
					<aui:input disabled="true" placeholder="Số GPKD vận tải"  type="text" label="" id="<%= QlvtLienVanTerm.SO_GIAY_PHEP_KINH_DOANH_VAN_TAI_NOI_DIA%>" name="<%= QlvtLienVanTerm.SO_GIAY_PHEP_KINH_DOANH_VAN_TAI_NOI_DIA%>" value="<%=ettThongTinHoSo.getSoGiayPhepKinhDoanhVanTaiNoiDia()%>"  class="form-control" />
				</div>
				<aui:row>
					4. Giấy phép kinh doanh vận tải bằng xe ô tô:
				</aui:row>
				<aui:row>
					<aui:col width="50">
					<aui:field-wrapper label="Số:" inlineField="<%=true %>" >
						<aui:input type="text" label="" name="<%= QlvtLienVanTerm.SO_GPKD%>" value="<%=dnDoanhNghiep.getSoGpkdVanTaiBangOto()%>"  readonly="readonly" />
					</aui:field-wrapper>
					</aui:col>
					<aui:col width="50">
					<aui:field-wrapper label="Ngày cấp:" inlineField="<%=true %>" >
						<aui:input type="text" label="" name="<%= QlvtLienVanTerm.NGAY_CAP_GPKD%>" value="<%=dnDoanhNghiep.getNgayCapGpkdVanTaiBangOto() %>" readonly="readonly" />
					</aui:field-wrapper>
					</aui:col>
				</aui:row>
				<aui:row>
					<aui:col width="100">
						<aui:input placeholder="Cơ quan cấp:" type="text" label="" name="<%= QlvtLienVanTerm.CO_QUAN_CAP_GPKD%>" value="<%=(dnDoanhNghiep.getCoQuanCapGpkdVanTaiBangOto()!= null) ? dnDoanhNghiep.getCoQuanCapGpkdVanTaiBangOto(): StringPool.BLANK%>" />
					</aui:col>
				</aui:row>
				
				
				<aui:row>
					5. Giấy chứng nhận đăng ký kinh doanh:
				</aui:row>
				<aui:row>
					<aui:col width="50">
					<aui:field-wrapper label="Số:" inlineField="<%=true %>" >
						<aui:input type="text" label="" name="<%= QlvtLienVanTerm.SO_GPKD%>" value="<%=ettThongTinHoSo.getSoDkkd() %>"  readonly="readonly" />
					</aui:field-wrapper>
					</aui:col>
					<aui:col width="50">
					<aui:field-wrapper label="Ngày cấp:" inlineField="<%=true %>" >
						<aui:input type="text" label="" name="<%= QlvtLienVanTerm.NGAY_CAP_GPKD%>" value="<%=ettThongTinHoSo.getNgayCapDkkd() %>" readonly="readonly" />
					</aui:field-wrapper>
					</aui:col>
				</aui:row>
				<aui:row>
					<aui:col width="100">
						<aui:input placeholder="Cơ quan cấp:" type="text" label="" name="<%= QlvtLienVanTerm.CO_QUAN_CAP_GPKD%>" value="<%=(ettThongTinHoSo.getCoQuanCapDkkd()!= null) ? ettThongTinHoSo.getCoQuanCapDkkd(): StringPool.BLANK%>" />
					</aui:col>
				</aui:row>
				
				
				
			</div>
		</div>
	</div>

	
	<label>6. Người liên hệ trả kết quả:</label>
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="Họ tên:" inlineField="<%=true %>" >
				<aui:input disabled="true" type="text" label="" name="" value="<%=ettThongTinHoSo.getNguoiLienHeTraKetQua() %>" />
				<aui:input type="hidden" label="" name="<%= QlvtLienVanTerm.HO_TEN_NGUOI_TRA_KET_QUA%>" value="<%=ettThongTinHoSo.getNguoiLienHeTraKetQua() %>" />
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
			<aui:field-wrapper label="Điện thoại:" inlineField="<%=true %>" >
				<aui:input disabled="true" type="text" label="" name="" value="<%=ettThongTinHoSo.getSoDienThoaiNguoiLienHe()%>" />
				<aui:input type="hidden" label="" name="<%= QlvtLienVanTerm.DIEN_THOAI_NGUOI_TRA_KET_QUA%>" value="<%=ettThongTinHoSo.getSoDienThoaiNguoiLienHe()%>" />
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	
	<!--------------START------------- Xu ly phuong tien QLVT_PHUONGTIENCAPGPVT_VIETTRUNG ---------------------------->
	<div style="width: 350px; float: left;">
		<liferay-util:include page="/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvt/vn_vt_cho_tham_xet_dv2.jsp" servletContext="<%=this.getServletContext() %>">
			<liferay-util:param name="xuLyPhuHieuId" value="<%=String.valueOf(ettGpLienVan.getId()) %>" />
			<liferay-util:param name="tq2" value="11" />
		</liferay-util:include>
		<span id="group-success-block"></span>
	</div>
<div id="dv3">

</div>
</div>

<aui:script use="aui-io-request,aui-node">
var A = AUI();

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
			  }
			);
</aui:script>
<aui:script use="aui-io-request,aui-node">
AUI().one('#<portlet:namespace /><%=QlvtLienVanTerm.NGAY_CAP_GPKD%>').val('<%=Validator.isNotNull(ettThongTinHoSo.getNgayCapDkkd())?sdf.format(ettThongTinHoSo.getNgayCapDkkd()):StringPool.BLANK %>');
</aui:script>
<style>
.BGT .row{
    margin-right: 0px !important;
        margin-left: 1px !important;
    }
</style>