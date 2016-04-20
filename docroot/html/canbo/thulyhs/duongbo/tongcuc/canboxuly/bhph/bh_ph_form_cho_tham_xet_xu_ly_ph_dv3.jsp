<%@page import="vn.dtt.duongbo.term.capbienhieuphuhieu.QLVTPhuHieuTerm"%>
<%@page import="vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyPhuHieuPhuongTienLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTien"%>
<%@ include file="/html/init.jsp"%>
<%@ include file="/html/param_init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
	String col1 = ParamUtil.getString(request, "col1");
	QLVTXuLyPhuHieuPhuongTien ettXuLyPhuHieuPhuongTien = QLVTXuLyPhuHieuPhuongTienLocalServiceUtil.fetchQLVTXuLyPhuHieuPhuongTien(Integer.valueOf("0"+col1));
	List<DmDataItem> listTuyen = DanhMucConstants.getTuyenCoDinh();
%>
<aui:input type="hidden" name="<%=QLVTPhuHieuTerm.ID_PHUONG_TIEN %>" value="<%=col1 %>"></aui:input>
<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="<%=\"Biển số xe: \"+ettXuLyPhuHieuPhuongTien.getBienSo() %>" inlineField="<%=true %>" >
		</aui:field-wrapper>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="50">
		<aui:field-wrapper label="Tên hiệu xe:" inlineField="<%=true %>" >
			<aui:input type="text" name="<%=QLVTPhuHieuTerm.NHAN_HIEU %>" value="<%=ettXuLyPhuHieuPhuongTien.getNhanHieu() %>" label="">

			</aui:input> 
		</aui:field-wrapper>
	</aui:col>
	<aui:col width="50">
		<aui:field-wrapper label="Năm sản xuất:" inlineField="<%=true %>" >
			<aui:select name="<%=QLVTPhuHieuTerm.NAM_SAN_XUAT %>" label="">
				<%for (String year : FormUtil.cbxYear()) {
					%>
					<option value="<%=year%>"><%=HtmlUtil.escape(year)%></option>
					<% }%>
			</aui:select>
		</aui:field-wrapper>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="50">
		<aui:field-wrapper label="Sức chứa:" inlineField="<%=true %>" >
			<aui:input type="text" name="<%=QLVTPhuHieuTerm.TRONG_TAI %>" value="<%=ettXuLyPhuHieuPhuongTien.getSoChoNgoi() %>" label="">

			</aui:input> 
		</aui:field-wrapper>
	</aui:col>
	<aui:col width="50">
		<aui:field-wrapper label="Phù hiệu xin cấp:" inlineField="<%=true %>" >
			<aui:select cssClass="fixWidth" name="<%=QLVTPhuHieuTerm.LOAI_PHU_HIEU_XIN_CAP %>" label="">
				<%
					for (Map.Entry<String,String> entry : FormUtil.cbxLoaiPH().entrySet()) {
				%>
					<option value="<%=entry.getKey()%>"><%=HtmlUtil.escape(entry.getValue())%></option>
				<% }%>
			</aui:select> 
		</aui:field-wrapper>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="Tải trọng" inlineField="<%=true %>" >
			<aui:input type="text" name="<%=QLVTPhuHieuTerm.TRONG_TAI %>" value="<%=ettXuLyPhuHieuPhuongTien.getTrongTai() %>" label="">

			</aui:input> 
		</aui:field-wrapper>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="50">
		<aui:field-wrapper label="Tuyến khai thác 1:" inlineField="<%=true %>" >
			<aui:select cssClass="fixWidth" id="<%=QLVTPhuHieuTerm.MA_TUYEN+\"0\" %>" name="<%=QLVTPhuHieuTerm.MA_TUYEN+\"0\" %>" onChange="pickMaTuyen()" label=" ">
				<%
				for(DmDataItem ett: listTuyen){
				%>
					<aui:option value="<%=ett.getCode() %>"><%=HtmlUtil.escape(ett.getName()) %></aui:option>
				<%} %>
			</aui:select>
		</aui:field-wrapper>
	</aui:col>
	<aui:col width="50">
		<aui:field-wrapper label="Tuyến khai thác 2:" inlineField="<%=true %>" >
			<aui:select cssClass="fixWidth" id ="<%=QLVTPhuHieuTerm.MA_TUYEN+\"1\" %>" name="<%=QLVTPhuHieuTerm.MA_TUYEN+\"1\" %>" onChange="pickMaTuyen()" label=" ">
				<%
				for(DmDataItem ett: listTuyen){
				%>
					<aui:option value="<%=ett.getCode() %>"><%=HtmlUtil.escape(ett.getName()) %></aui:option>
				<%} %>
			</aui:select>
		</aui:field-wrapper>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="Niên hạn sử dụng trên Giấy đăng kiểm:" inlineField="<%=true %>" >
			<aui:input type="text" name="<%=QLVTPhuHieuTerm.NIEN_HAN_SU_DUNG_GIAY_DANG_KIEM %>" value="<%=ettXuLyPhuHieuPhuongTien.getNienHanSuDungGiayDangKiem() %>" label="" prefix="date">

			</aui:input> 
		</aui:field-wrapper>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="Niên hạn sử dụng theo NĐ 86:" inlineField="<%=true %>" >
			<aui:input type="text" name="<%=QLVTPhuHieuTerm.NIEN_HAN_SU_DUNG_ND86 %>" value="<%=ettXuLyPhuHieuPhuongTien.getNienHanSuDungND86()%>" label="" prefix="date">

			</aui:input> 
		</aui:field-wrapper>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="Xe thuê/sở hữu:" inlineField="<%=true %>" >
			<aui:select name="<%=QLVTPhuHieuTerm.HINH_THUC_SO_HUU_XE %>" label="">
				<%
					for (Map.Entry<String,String> entry : FormUtil.cbxXeThueXeSoHuu().entrySet()) {
				%>
					<option value="<%=entry.getKey()%>"><%=HtmlUtil.escape(entry.getValue())%></option>
				<% }%>
			</aui:select>
		</aui:field-wrapper>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="Doanh nghiệp cho thuê:" inlineField="<%=true %>" >
			<aui:input type="text" name="<%=QLVTPhuHieuTerm.DOANH_NGHIEP_SO_HUU_THUE %>" value="<%=ettXuLyPhuHieuPhuongTien.getDoanhNghiepSoHuuThue()%>" label="">

			</aui:input>
		</aui:field-wrapper>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="50">
		<aui:field-wrapper label="Thời hạn thuê:" inlineField="<%=true %>" >
			<aui:input type="text" name="<%=QLVTPhuHieuTerm.THOI_HAN_THUE %>" value="<%=ettXuLyPhuHieuPhuongTien.getThoiHanThue()%>" label="" prefix="date">

			</aui:input>
		</aui:field-wrapper>
	</aui:col>
	<aui:col width="50">
		<aui:field-wrapper label="Hợp đồng sau cùng:" inlineField="<%=true %>" >
			<aui:select name="<%=QLVTPhuHieuTerm.HOP_DONG_SAU_CUNG %>" label="">
				<%
					for (Map.Entry<String,String> entry : FormUtil.cbxHopDongSauCung().entrySet()) {
				%>
					<option value="<%=entry.getKey()%>"><%=HtmlUtil.escape(entry.getValue())%></option>
				<% }%>
			</aui:select>
		</aui:field-wrapper>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="Tuyến trong quy hoạch:" inlineField="<%=true %>" >
			<aui:input type="text" name="<%=QLVTPhuHieuTerm.TUYEN_TRONG_QUY_HOACH%>" value="<%=ettXuLyPhuHieuPhuongTien.getLoaiTuyen()%>" label="">

			</aui:input>
		</aui:field-wrapper>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="100">
		<aui:input type="radio" name="<%=QLVTPhuHieuTerm.KET_QUA_XU_LY %>" value="1" label="Đạt" inlineField="<%=true %>" onClick="showHiddenDiv(1);"></aui:input>
		<aui:input type="radio" name="<%=QLVTPhuHieuTerm.KET_QUA_XU_LY %>" value="0" label="Không đạt" inlineField="<%=true %>" onClick="showHiddenDiv(0);"></aui:input>
	</aui:col>
</aui:row>

<div id="divDat" style="display: none;margin-left: 20%;">
	<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="Số phù hiệu:  " inlineField="<%=true %>" >
			<aui:input type="text" name="<%=QLVTPhuHieuTerm.SO_PHU_HIEU_DUOC_CAP%>" value="<%=ettXuLyPhuHieuPhuongTien.getSoPhuHieuDuocCap()%>" label="">
			</aui:input>
		</aui:field-wrapper>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="Đơn vị:" inlineField="<%=true %>" >
			<aui:input type="text" name="<%=QLVTPhuHieuTerm.DON_VI%>" value="" label="">
			</aui:input>
		</aui:field-wrapper>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="Biển số:" inlineField="<%=true %>" >
			<aui:input type="text" name="<%=QLVTPhuHieuTerm.BIEN_SO%>" value="<%=ettXuLyPhuHieuPhuongTien.getBienSo()%>" label="">
			</aui:input>
		</aui:field-wrapper>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="Có giá trị đến: " inlineField="<%=true %>" >
			<aui:input type="text" name="<%=QLVTPhuHieuTerm.CO_GIA_TRI_DEN%>" value="" label="" prefix="date">
			</aui:input>
		</aui:field-wrapper>
	</aui:col>
</aui:row>
</div>
<div id="divKoDat"style="display: none;margin-left: 20%;">
	<aui:input type="textarea" name="<%=QLVTPhuHieuTerm.LY_DO_KHONG_DAT %>" cssClass="myTextArea" value="<%=ettXuLyPhuHieuPhuongTien.getLyDoKhongDat() %>" label="Lý do không đạt"></aui:input>
</div>
<aui:button-row cssClass="myButtonTop">
	<aui:button cssClass="btn btn-primary" value="Lưu" onClick="submitItemForm();"></aui:button>
</aui:button-row>
<script type="text/javascript">
	var A = AUI();
	function pickMaTuyen() {
		var val1 = A.one('#<portlet:namespace /><%=QLVTPhuHieuTerm.MA_TUYEN+"0" %>');
		var val2 = A.one('#<portlet:namespace /><%=QLVTPhuHieuTerm.MA_TUYEN+"1" %>');
		var varMaTuyen = A.one('#<portlet:namespace /><%=QLVTPhuHieuTerm.MA_TUYEN %>');
		var varMaTuyens = A.one('#<portlet:namespace /><%=QLVTPhuHieuTerm.MA_TUYENS %>');
		varMaTuyens.val(val1.val()+","+val2.val());
	}
</script>
<portlet:renderURL var="dv1Page" windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
	<portlet:param name="mvcPath" value="/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/bhph/bh_ph_form_cho_tham_xet_xu_ly_ph_dv2.jsp"/>
</portlet:renderURL>
<portlet:actionURL var="addItemURL" name="phuHieu_oTo_luuThongTinThamXet" />
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
	
	
	AUI().use(
			  'aui-datepicker',
			  function(A) {
			    new A.DatePicker(
			      {
			    	trigger: '#<portlet:namespace /><%=QLVTPhuHieuTerm.CO_GIA_TRI_DEN %>',
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
			    	trigger: '#<portlet:namespace /><%=QLVTPhuHieuTerm.THOI_HAN_THUE %>',
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
			    	trigger: '#<portlet:namespace /><%=QLVTPhuHieuTerm.NAM_SAN_XUAT %>',
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
			    	trigger: '#<portlet:namespace /><%=QLVTPhuHieuTerm.NIEN_HAN_SU_DUNG_GIAY_DANG_KIEM %>',
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
			    	trigger: '#<portlet:namespace /><%=QLVTPhuHieuTerm.NIEN_HAN_SU_DUNG_ND86 %>',
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
