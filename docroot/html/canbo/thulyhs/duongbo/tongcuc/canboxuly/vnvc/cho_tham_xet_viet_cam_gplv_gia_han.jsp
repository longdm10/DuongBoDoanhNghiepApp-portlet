<%@page import="vn.dtt.duongbo.term.lienvan.QlvtLienVanTerm"%>
<%@page import="vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVan"%>
<%@page import="vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinXuLyLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo"%>
<%@ include file="/html/init.jsp"%>
<%@ include file="/html/param_init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
QlvtThongTinHoSo ettThongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.fetchByphieuXuLyId(Long.valueOf("0"+phieuXuLyId));
QlvtThongTinXuLy ettThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil.fetchBythongTinHoSoId(Integer.valueOf("0"+ettThongTinHoSo.getId()));
QlvtXuLyGpLienVan gpkdvtLienVan = QlvtXuLyGpLienVanLocalServiceUtil.fetchBythongTinXuLyId(Integer.valueOf("0"+ettThongTinXuLy.getId()));

%>
<div id="info">
	<aui:input type="hidden" name="inforId1" value="<%=ettThongTinHoSo.getId() %>"></aui:input>
	<aui:input type="hidden" name="inforId2" value="<%=ettThongTinXuLy.getId() %>"></aui:input>
	<aui:input type="hidden" name="inforId3" value="<%=gpkdvtLienVan.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QlvtLienVanTerm.THONG_TIN_HO_SO_ID %>" value="<%=ettThongTinHoSo.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QlvtLienVanTerm.THONG_TIN_XU_LY_ID %>" value="<%=ettThongTinXuLy.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QlvtLienVanTerm.ID %>" value="<%=gpkdvtLienVan.getId() %>"></aui:input>
	<aui:input type="hidden" name="<%=QlvtLienVanTerm.MA_TUYEN %>" value=""></aui:input>
	<aui:input type="hidden" name="<%=QlvtLienVanTerm.MA_TUYENS %>" value=""></aui:input>
</div>
<div style="display: block;overflow: hidden;">
	<div id="dv1">
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="1. Giấy phép liên vận CampuChia - Việt  " cssClass="textBold" inlineField="<%=true %>" >
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="Số: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QlvtLienVanTerm.SO_GPKD %>" value="<%=ettThongTinHoSo.getSoGiayPhepKinhDoanhVanTaiQuocTe() %>" label="">

				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
			<aui:field-wrapper label="Ngày cấp: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QlvtLienVanTerm.NGAY_CAP_GPKDVT_QUOC_TE %>" value="<%=ettThongTinHoSo.getNgayCapGPKDVTQuocTe() %>" label="">
				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="Nơi cấp: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QlvtLienVanTerm.CO_QUAN_CAP_GPKD %>" value="<%=ettThongTinHoSo.getCoQuanCapDkkd() %>" label="">
				</aui:input>  
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
			<aui:field-wrapper label="Có giá trị đến: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QlvtLienVanTerm.NGAY_GIA_HAN_GPKDVT_QUOC_TE %>" value="<%=ettThongTinHoSo.getNgayHetHanGPKDVTQuocTe() %>" label="">

				</aui:input>  
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="- Thời gian nhập cảnh vào Việt Nam (Date of entry into Viet Nam) *:" inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QlvtLienVanTerm.THOI_GIAN_NHAP_CANH %>" value="" label="">
				</aui:input>  
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	
	
	
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="2. Thông tin xin gia hạn: " cssClass="textBold" inlineField="<%=true %>" >
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="- Biển số xe xin gia hạn (Registration No) *:" inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QlvtLienVanTerm.BIEN_SO %>" value="" label="">
				</aui:input>  
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="- Thời hạn đề nghị được gia hạn thêm (Proposed extended duration):" cssClass="textBold" inlineField="<%=true %>" >
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	
	
	<aui:row>
		<aui:col width="100">
			<aui:input type="radio" name="" value="1" label="Gia hạn Giấy phép liên vận (Extension for) *:" inlineField="<%=true %>" onClick="showHiddenDiv(1);"></aui:input>
			<aui:input type="radio" name="" value="0" label="Gia hạn chuyến đi (Extension for Journey) *:" inlineField="<%=true %>" onClick="showHiddenDiv(0);"></aui:input>
		</aui:col>
	</aui:row>
	
	
<div id="divDat" style="display: none;margin-left: 20%;">
1
<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="Số ngày Gia hạn Giấy phép liên vận: " inlineField="<%=true %>" >
			<aui:input type="text" name="<%=QlvtLienVanTerm.NGAY_GIA_HAN_GPKDVT_QUOC_TE %>" value="<%=ettThongTinHoSo.getNgayGiaHanGPKDVTQuocTe() %>" label="">
			</aui:input>
		</aui:field-wrapper>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="50">
		<aui:field-wrapper label="Từ:" inlineField="<%=true %>" >
			<aui:input type="text" name="" value="" label="">
				
			</aui:input>
		</aui:field-wrapper>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="50">
		<aui:field-wrapper label="Đến" inlineField="<%=true %>" >
			<aui:input type="text" name="" value="" label="">
			</aui:input>
		</aui:field-wrapper>
	</aui:col>
</aui:row>
</div>


<div id="divKoDat" style="display: none;margin-left: 20%;">
0
<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="Số ngày Gia hạn Giấy phép liên vận: " inlineField="<%=true %>" >
			<aui:input type="text" name="" value="" label="">
			</aui:input>
		</aui:field-wrapper>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="50">
		<aui:field-wrapper label="Từ:" inlineField="<%=true %>" >
			<aui:input type="text" name="" value="" label="">
				
			</aui:input>
		</aui:field-wrapper>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="50">
		<aui:field-wrapper label="Đến" inlineField="<%=true %>" >
			<aui:input type="text" name="" value="" label="">
			</aui:input>
		</aui:field-wrapper>
	</aui:col>
</aui:row>
</div>

<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="Đánh giá thông tin đề nghị gia hạn:" cssClass="textBold" inlineField="<%=true %>" >
			</aui:field-wrapper>
		</aui:col>
</aui:row>
<aui:row>
		<aui:col width="100">
			<aui:input type="radio" name="<%=QlvtLienVanTerm.KET_QUA_XU_LY %>" value="1" label="Đạt" inlineField="<%=true %>"></aui:input>
			<aui:input type="radio" name="<%=QlvtLienVanTerm.KET_QUA_XU_LY %>" value="0" label="Không đạt" inlineField="<%=true %>" ></aui:input>
		</aui:col>
	</aui:row>
	
</div>
</div>


<div style="width: 350px; float: left;">
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
        trigger: '#<portlet:namespace /><%=QlvtLienVanTerm.NGAY_CAP_GPKDVT_QUOC_TE %>',
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
        trigger: '#<portlet:namespace /><%=QlvtLienVanTerm.NGAY_GIA_HAN_GPKDVT_QUOC_TE %>',
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
        trigger: '#<portlet:namespace /><%=QlvtLienVanTerm.THOI_GIAN_NHAP_CANH %>',
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
AUI().one('#<portlet:namespace /><%=QlvtLienVanTerm.NGAY_CAP_GPKDVT_QUOC_TE%>').val('<%=Validator.isNotNull(ettThongTinHoSo.getNgayCapGPKDVTQuocTe())?sdf.format(ettThongTinHoSo.getNgayCapGPKDVTQuocTe()):StringPool.BLANK %>');
AUI().one('#<portlet:namespace /><%=QlvtLienVanTerm.NGAY_GIA_HAN_GPKDVT_QUOC_TE%>').val('<%=Validator.isNotNull(ettThongTinHoSo.getNgayHetHanGPKDVTQuocTe())?sdf.format(ettThongTinHoSo.getNgayHetHanGPKDVTQuocTe()):StringPool.BLANK %>');
AUI().one('#<portlet:namespace /><%=QlvtLienVanTerm.THOI_GIAN_NHAP_CANH%>').val('<%=Validator.isNotNull(ettThongTinHoSo.getNgayHetHanDkkd())?sdf.format(ettThongTinHoSo.getNgayHetHanDkkd()):StringPool.BLANK %>');
</aui:script>
