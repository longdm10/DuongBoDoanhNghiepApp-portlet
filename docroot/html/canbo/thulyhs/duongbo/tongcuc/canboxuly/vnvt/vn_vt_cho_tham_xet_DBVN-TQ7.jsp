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
// QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien = null;

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
			<h5><b>Thông tin đề nghị gia hạn giấy phép vận tải và thời gian lưu hành tại Việt Nam cho phương tiện của Trung Quốc</b></h5>
		</aui:col>
	</aui:row>	
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper cssClass="fix30" label="1. Người xin gia hạn (Full name):" inlineField="<%=true %>" inlineLabel="true" >
				<%=ettThongTinHoSo.getTenDn() %>
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper cssClass="fix30" label="2. Địa chỉ:" inlineField="<%=true %>" inlineLabel="true" >
				<%=ettThongTinHoSo.getDiaChiDn() %>
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper cssClass="fix30" label="3. Số điện thoại:" inlineField="<%=true %>" inlineLabel="true" >
				<%=ettThongTinHoSo.getDienThoaiDn() %>
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="100">
		<aui:field-wrapper cssClass="fix30" label="4. Giấy phép vận tải:" inlineField="<%=true %>" inlineLabel="true" >
				<%=ettThongTinHoSo.getSoDkkd() %>
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="Loại: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QlvtLienVanTerm.LOAI_GIAY_PHEP_LIEN_VAN %>" value ="<%=ettGpLienVan.getLoaiGiayPhepLienVan()%>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
			<aui:field-wrapper label="Số: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QlvtLienVanTerm.SO_GPKD %>" value="<%=ettThongTinHoSo.getSoDkkd() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="Do (cơ quan): " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QlvtLienVanTerm.CO_QUAN_CAP_GPKD %>" value="<%=ettThongTinHoSo.getCoQuanCapDkkd() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
			<aui:field-wrapper label="Cấp ngày: " inlineField="<%=true %>" >
				<aui:input prefix="date" type="text" name="<%=QlvtLienVanTerm.NGAY_CAP_GPKD %>" value="<%=ettThongTinHoSo.getNgayCapDkkd() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="50">
			<strong>5. Thời gian hết hạn hoạt động tại Việt Nam:</strong>
		</aui:col>
		<aui:col width="50">
			<aui:field-wrapper label="" inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QlvtLienVanTerm.NGAY_HET_HAN_GIAY_PHEP_LIEN_VAN %>" value="<%=ettGpLienVan.getNgayHetHanGiayPhepLienVan() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="100">
			<strong>6. Lý do xin gia hạn: <i>(Mô tả lý do không thể về nước theo quy định )</i></strong>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="" inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QlvtLienVanTerm.LY_DO_GIA_HAN %>" value="<%=ettThongTinHoSo.getLyDoCapLai() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="60">
			<strong>7. Đề nghị xin gia hạn giấy phép vận tải để khắc phục sự cố trong thời gian:</strong>
		</aui:col>
		<aui:col width="30">
			<aui:field-wrapper label="" inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QlvtLienVanTerm.SO_NGAY_XIN_GIA_HAN %>" value="" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="10">
			<aui:field-wrapper label="ngày" inlineField="<%=true %>" >
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="Từ ngày: " inlineField="<%=true %>" >
				<aui:input prefix="date" type="text" name="<%=QlvtLienVanTerm.XIN_GIA_HAN_TU_NGAY %>" value="" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
			<aui:field-wrapper label="Đến ngày: " inlineField="<%=true %>" >
				<aui:input prefix="date" type="text" name="<%=QlvtLienVanTerm.XIN_GIA_HAN_DEN_NGAY %>" value="" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
	</aui:row>
	<aui:row>
		<aui:col width="100">
			<strong>Đánh giá thông tin đề nghị gia hạn giấy phép vận tải và thời gian lưu hành tại Việt Nam cho phương tiện của Trung Quốc:</strong>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="100">
			<aui:input type="radio" name="<%=QlvtLienVanTerm.KET_QUA_XU_LY  %>" value="1" label="Đạt" inlineField="<%=true %>" onClick="showHiddenDiv1(1);"></aui:input>
			<aui:input type="radio" name="<%=QlvtLienVanTerm.KET_QUA_XU_LY  %>" value="0" label="Không đạt" inlineField="<%=true %>" onClick="showHiddenDiv1(0);"></aui:input>
		</aui:col>
	</aui:row>
	<div id="divKoDat0" style="display: none;margin-left: 20%;">
		<aui:row>
			<aui:col width="100">
				<aui:field-wrapper label="Lý do" inlineField="<%=true %>" >
					<aui:input type="textarea" name="<%=QlvtLienVanTerm.LY_DO_KHONG_DAT %>" value="" cssClass="myTextArea" label="">
	
				</aui:input>
				</aui:field-wrapper>
			</aui:col>
		</aui:row>
	</div>
	<div id="divDat0" style="display: none;margin-left: 20%;">
	
	</div>
</div>
<style>
 .fix30 .control-label{
	width: 25% !important;
}
</style>
<script type="text/javascript">
	function showHiddenDiv1(type) {
		if(type == 1){
			$('#divDat1').css("display", "block");
			$('#divKoDat1').css("display", "none");
		}else {
			$('#divDat1').css("display", "none");
			$('#divKoDat1').css("display", "block");
		}
		
	}
</script>
<aui:script use="aui-io-request,aui-node">
var A = AUI();

	AUI().use(
			  'aui-datepicker',
			  function(A) {
			    new A.DatePicker(
			      {
			    	trigger: '#<portlet:namespace /><%=QlvtLienVanTerm.XIN_GIA_HAN_TU_NGAY %>',
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
			    	trigger: '#<portlet:namespace /><%=QlvtLienVanTerm.XIN_GIA_HAN_DEN_NGAY %>',
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
			).render('#<%=QlvtLienVanTerm.NGAY_CAP_GPKD %>');
	         A.one('#<%=QlvtLienVanTerm.NGAY_CAP_GPKD %>').val(<%=Validator.isNotNull(ettThongTinHoSo.getNgayCapDkkd())
	    	         ?sdf.format(ettThongTinHoSo.getNgayCapDkkd()):StringPool.BLANK %>);
</aui:script>
