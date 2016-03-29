<%@page import="vn.dtt.duongbo.report.ReportUtils"%>
<%@page import="vn.dtt.duongbo.utils.CommonUtils"%>
<%@page import="vn.dtt.duongbo.business.MotCuaBusiness"%>
<%@page import="vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi"%>
<%@page import="vn.dtt.duongbo.term.lienvan.QlvtLienVanTerm"%>
<%@page import="vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanPhuongTienLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTien"%>
<%@ include file="/html/init.jsp"%>
<%@ include file="/html/param_init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	
	String col1 = ParamUtil.getString(request, "col1");
	String tq2 = ParamUtil.getString(request, "tq2");
	QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.fetchQlvtXuLyGpLienVanPhuongTien(Long.valueOf("0"+col1));
	
	
	List<QlvtXuLyGpLienVanPhuongTienTramDungNghi> listEttTramDungNghi = QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalServiceUtil.findBycapGplxPhuongTienId(Long.valueOf("0"+col1));
	
	
	
	List<DmDataItem> lsttuyenHD = DmDataItemLocalServiceUtil.findByGroupCode(DanhMucConstants.DM_TUYENHD_VNTQ);
	List<DmDataItem> lstloaiGP = DmDataItemLocalServiceUtil.findByGroupCode(DanhMucConstants.DM_LOAIGIAYPHEP_VT);
	List<DmDataItem> lstHTHD = DanhMucConstants.getHinhThucHoatDong();
%>
<aui:input type="hidden" name="<%=QlvtLienVanTerm.ID_PHUONG_TIEN %>" value="<%=qlvtXuLyGpLienVanPhuongTien.getId() %>"></aui:input>

<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="<%=\"Biển số xe: \"+qlvtXuLyGpLienVanPhuongTien.getBienSo() %>" inlineField="<%=true %>" >
		</aui:field-wrapper>
	</aui:col>
</aui:row>
<!-- Nhãn hiệu trọng tải start -->
<aui:row>
	<aui:col width="30">
		<aui:field-wrapper label="Nhãn hiệu phương tiện:" inlineField="<%=true %>" >
			<aui:input disabled="true" type="text" name="" value="<%=qlvtXuLyGpLienVanPhuongTien.getNhanHieu() %>" label="">
			</aui:input>
			<aui:input type="hidden" name="<%=QlvtLienVanTerm.NHAN_HIEU %>" value="<%=qlvtXuLyGpLienVanPhuongTien.getNhanHieu() %>" label="">
			</aui:input>
		</aui:field-wrapper>
	</aui:col>
	<aui:col width="30">
		<aui:field-wrapper label="Trọng tải:" inlineField="<%=true %>" >
			<aui:input disabled="true" type="text" name="" value="<%=qlvtXuLyGpLienVanPhuongTien.getTrongTai()%>" label=" ">
			</aui:input>
			<aui:input type="hidden" name="<%=QlvtLienVanTerm.TRONG_TAI %>" value="<%=qlvtXuLyGpLienVanPhuongTien.getTrongTai()%>" label=" ">
			</aui:input>
		</aui:field-wrapper>
	</aui:col>
	<aui:col width="30">
		<aui:field-wrapper label="." inlineField="<%=true %>" >
			<aui:select  name="<%=QlvtLienVanTerm.TYPE_TRONG_TAI %>" label="">
				<%
					for (Map.Entry<String,String> entry : FormUtil.cbxTrongTai().entrySet()) {
				%>
					<option value="<%=entry.getKey()%>"><%=HtmlUtil.escape(entry.getValue())%></option>
				<% }%>
			</aui:select>
		</aui:field-wrapper>
	</aui:col>
</aui:row>


<aui:row>
	<aui:col width="30">
		<aui:field-wrapper label="Số khung: " inlineField="<%=true %>" >
			<aui:input disabled="true" type="text" name="" value="<%=qlvtXuLyGpLienVanPhuongTien.getSoKhung() %>" label="">
			</aui:input>
			<aui:input type="hidden" name="<%=QlvtLienVanTerm.SO_KHUNG %>" value="<%=qlvtXuLyGpLienVanPhuongTien.getSoKhung() %>" label="">
			</aui:input>
		</aui:field-wrapper>
	</aui:col>
	<aui:col width="30">
		<aui:field-wrapper label="Số máy: " inlineField="<%=true %>" >
			<aui:input disabled="true" type="text" name="" value="<%=qlvtXuLyGpLienVanPhuongTien.getSoMay()%>" label=" ">
			</aui:input>
			<aui:input type="hidden" name="<%=QlvtLienVanTerm.SO_MAY %>" value="<%=qlvtXuLyGpLienVanPhuongTien.getSoMay()%>" label=" ">
			</aui:input>
		</aui:field-wrapper>
	</aui:col>
	<aui:col width="30">
		<aui:field-wrapper label="Màu sơn: " inlineField="<%=true %>" >
			<aui:input disabled="true" type="text" name="" value="<%=qlvtXuLyGpLienVanPhuongTien.getMauSon()%>" label=" ">
			</aui:input>
			<aui:input type="hidden" name="<%=QlvtLienVanTerm.MAU_SON %>" value="<%=qlvtXuLyGpLienVanPhuongTien.getMauSon()%>" label=" ">
			</aui:input>
		</aui:field-wrapper>
	</aui:col>
</aui:row>

<!-- Thời gian đề nghị cấp giấy phép start -->
<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="Thời gian đề nghị cấp Giấy Phép:" inlineField="<%=true %>" >
			<%=HtmlUtil.escape("") %>
		</aui:field-wrapper>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="33">
		<aui:field-wrapper label="Từ ngày:" inlineField="<%=true %>" >
			<aui:input disabled="true" prefix="date" type="text" name="" value="<%=Validator.isNotNull(qlvtXuLyGpLienVanPhuongTien.getXinCapPhepTuNgay())?sdf.format(qlvtXuLyGpLienVanPhuongTien.getXinCapPhepTuNgay()):StringPool.BLANK %>" label="">
			</aui:input>
			<aui:input type="hidden" name="<%=QlvtLienVanTerm.XIN_CAP_PHEP_TU_NGAY %>" value="<%=qlvtXuLyGpLienVanPhuongTien.getXinCapPhepTuNgay()%>" label="">
			</aui:input>
		</aui:field-wrapper>
	</aui:col>
	<aui:col width="33">
		<aui:field-wrapper label="Đến ngày:" inlineField="<%=true %>" >
			<aui:input disabled="true"  prefix="date" type="text" name="" value="<%=Validator.isNotNull(qlvtXuLyGpLienVanPhuongTien.getXinCapPhepDenNgay())?sdf.format(qlvtXuLyGpLienVanPhuongTien.getXinCapPhepDenNgay()):StringPool.BLANK %>" label="">
			</aui:input>
			<aui:input type="hidden" name="<%=QlvtLienVanTerm.XIN_CAP_PHEP_DEN_NGAY %>" value="<%=qlvtXuLyGpLienVanPhuongTien.getXinCapPhepDenNgay()%>" label="">
			</aui:input>
		</aui:field-wrapper>
	</aui:col>
	
	
	<aui:col width="33">
	<aui:field-wrapper label="Dự kiến thời gian khởi hành:" inlineField="<%=true %>" >
		<aui:input disabled="true"  prefix="date" type="text" name="" value="<%=Validator.isNotNull(qlvtXuLyGpLienVanPhuongTien.getThoiGianKhoiHanh())?sdf.format(qlvtXuLyGpLienVanPhuongTien.getThoiGianKhoiHanh()):StringPool.BLANK %>" label="">
		</aui:input>
		<aui:input type="hidden" name="<%=QlvtLienVanTerm.THOI_GIAN_KHOI_HANH %>" value="<%=qlvtXuLyGpLienVanPhuongTien.getThoiGianKhoiHanh()%>" label="">
		</aui:input>
		</aui:field-wrapper>
	</aui:col>
	
	
</aui:row>
<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="Loại hàng vận chuyển: " inlineField="<%=true %>" >
			<aui:input disabled="true" type="text" name="" value="<%=qlvtXuLyGpLienVanPhuongTien.getLoaiHangVanChuyen()%>" label="">
			</aui:input>
			<aui:input type="hidden" name="<%=QlvtLienVanTerm.LOAI_HANG_VAN_CHUYEN %>" value="<%=qlvtXuLyGpLienVanPhuongTien.getLoaiHangVanChuyen()%>" label="">
			</aui:input>
			
		</aui:field-wrapper>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="Hành trình đề nghị: " inlineField="<%=true %>" >
			<aui:input disabled="true" type="textarea" name="<%=QlvtLienVanTerm.HANH_TRINH %>" label=" " value="<%=qlvtXuLyGpLienVanPhuongTien.getHanhTrinh() %>"></aui:input>
		</aui:field-wrapper>
	</aui:col>
</aui:row>


<!-- Thời gian đề nghị cấp giấy phép end -->

<!-- Điểm dừng nghỉ trên đường start -->


<%
	String diemDungNghi ="";
	for(QlvtXuLyGpLienVanPhuongTienTramDungNghi ettTramDungNghi :listEttTramDungNghi){
		diemDungNghi = diemDungNghi+";"+ReportUtils.getTenDmDataByCode(ettTramDungNghi.getMaTramDungNghi());
	}
		diemDungNghi = diemDungNghi.substring(diemDungNghi.indexOf(";")+1);
%>
<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="Điểm dừng nghỉ trên đường*:" inlineField="<%=true %>" >
			<aui:input disabled="true" type="text" name="" value="<%=diemDungNghi %>" label="">
				<aui:validator  name="required "  errorMessage="Điểm dừng nghỉ trên đường không được để trống" />
			</aui:input>
			<aui:input type="hidden" name="<%=QlvtLienVanTerm.DIEM_DUNG_NGHI %>" value="<%=diemDungNghi %>" label="">
				<aui:validator  name="required "  errorMessage="Điểm dừng nghỉ trên đường không được để trống" />
			</aui:input>
			
		</aui:field-wrapper>
	</aui:col>
</aui:row>
<!-- Điểm dừng nghỉ trên đường end -->

<aui:row>
	<aui:col width="100">
		<aui:input type="radio" name="<%=QlvtLienVanTerm.KET_QUA_XU_LY %>" value="1" label="Đạt" inlineField="<%=true %>" onClick="showHiddenDiv(1);"></aui:input>
		<aui:input type="radio" name="<%=QlvtLienVanTerm.KET_QUA_XU_LY %>" value="0" label="Không đạt" inlineField="<%=true %>" onClick="showHiddenDiv(0);"></aui:input>
	</aui:col>
</aui:row>

<div id="divDat" style="display: none;margin-left: 20%;">
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="Số GPVT:" inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QlvtLienVanTerm.SO_GIAY_PHEP_LIEN_VAN %>" value="<%=qlvtXuLyGpLienVanPhuongTien.getSoGiayPhepLienVanPhuongTien() %>" label="">
					
				</aui:input>
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="Thời gian hiệu lực của giấy phép" inlineField="<%=true %>" >
				<%=HtmlUtil.escape("") %>
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="Từ:" inlineField="<%=true %>" >
				<aui:input prefix="date" type="text" name="<%= QlvtLienVanTerm.XIN_GIA_HAN_TU_NGAY %>" value="<%=Validator.isNotNull(qlvtXuLyGpLienVanPhuongTien.getXinGiaHanTuNgay())?sdf.format(qlvtXuLyGpLienVanPhuongTien.getXinGiaHanTuNgay()):StringPool.BLANK %>" label="">
				</aui:input>
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
			<aui:field-wrapper label="Đến:" inlineField="<%=true %>" >
				<aui:input prefix="date" type="text" name="<%=QlvtLienVanTerm.XIN_GIA_HAN_DEN_NGAY%>" value="<%=Validator.isNotNull(qlvtXuLyGpLienVanPhuongTien.getXinGiaHanDenNgay())?sdf.format(qlvtXuLyGpLienVanPhuongTien.getXinGiaHanDenNgay()):StringPool.BLANK %>" label="">
				</aui:input>
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
</div>
<div id="divKoDat"style="display: none;margin-left: 20%;">
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="Lý do" inlineField="<%=true %>" >
				<aui:input label="" type="textarea" name="<%=QlvtLienVanTerm.LY_DO_KHONG_DAT %>" value="<%=qlvtXuLyGpLienVanPhuongTien.getLyDoKhongDat()%>" cssClass="myTextArea">
	
				</aui:input>
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
</div>
<aui:button-row cssClass="myButtonTop">
	<aui:button cssClass="btn btn-primary" value="Lưu" onClick="submitItemForm();"></aui:button>
</aui:button-row>
<portlet:renderURL var="dv1Page" windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
	<portlet:param name="mvcPath" value="/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvt/vn_vt_cho_tham_xet_dv2.jsp"/>
	<liferay-util:param name="tq2" value="<%=tq2 %>" />
</portlet:renderURL>
<portlet:actionURL var="addItemURL" name="lienVan_vietTrung_luuThongTinThamXet" />

<aui:script>
AUI().use(
		  'aui-datepicker',
		  function(A) {
		    new A.DatePicker(
		      {
		        trigger: '#<portlet:namespace /><%=QlvtLienVanTerm.THOI_HAN_CHO_THUE %>',
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
</aui:script>




<aui:script use="aui-io-request,aui-node">
var A = AUI();
	Liferay.provide(window,'submitItemForm',
		function() {
		var A = AUI();
		var errorBlock=A.one('#group-success-block');
		A.io.request('<%=addItemURL %>',{
			method: 'POST',
			form: { id: '<portlet:namespace />fm' },
			on: {
					success: function(){
					var json = JSON.parse(this.get('responseData'));
  					errorBlock.set("innerHTML","");
  					loadMyPageDv2('<%=dv1Page %>'+'&<portlet:namespace/>xuLyPhuHieuId='+A.one("#<portlet:namespace/>inforId3").val());
  					var errorMessageNode = A.Node.create(json.bodyText);
					errorMessageNode.appendTo(errorBlock);
					
					}
			}
		});
	});



AUI().one('#<portlet:namespace /><%=QlvtLienVanTerm.XIN_CAP_PHEP_DEN_NGAY%>').val('<%=Validator.isNotNull(qlvtXuLyGpLienVanPhuongTien.getXinCapPhepDenNgay())?sdf.format(qlvtXuLyGpLienVanPhuongTien.getXinCapPhepDenNgay()):StringPool.BLANK %>');
AUI().one('#<portlet:namespace /><%=QlvtLienVanTerm.THOI_HAN_CHO_THUE%>').val('<%=Validator.isNotNull(qlvtXuLyGpLienVanPhuongTien.getThoiHanChoThue())?sdf.format(qlvtXuLyGpLienVanPhuongTien.getThoiHanChoThue()):StringPool.BLANK %>');
AUI().one('#<portlet:namespace /><%=QlvtLienVanTerm.XIN_CAP_PHEP_TU_NGAY%>').val('<%=Validator.isNotNull(qlvtXuLyGpLienVanPhuongTien.getXinCapPhepTuNgay())?sdf.format(qlvtXuLyGpLienVanPhuongTien.getXinCapPhepTuNgay()):StringPool.BLANK %>');
AUI().one('#<portlet:namespace /><%=QlvtLienVanTerm.XIN_GIA_HAN_TU_NGAY%>').val('<%=Validator.isNotNull(qlvtXuLyGpLienVanPhuongTien.getXinGiaHanTuNgay())?sdf.format(qlvtXuLyGpLienVanPhuongTien.getXinGiaHanTuNgay()):StringPool.BLANK %>');
AUI().one('#<portlet:namespace /><%=QlvtLienVanTerm.XIN_GIA_HAN_DEN_NGAY%>').val('<%=Validator.isNotNull(qlvtXuLyGpLienVanPhuongTien.getXinGiaHanDenNgay())?sdf.format(qlvtXuLyGpLienVanPhuongTien.getXinGiaHanDenNgay()):StringPool.BLANK %>');
</aui:script>


