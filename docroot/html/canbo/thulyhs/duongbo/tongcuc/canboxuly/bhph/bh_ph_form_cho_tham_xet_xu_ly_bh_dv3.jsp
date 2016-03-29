
<%@page import="vn.dtt.duongbo.term.capbienhieuphuhieu.QLVTBienHieuTerm"%>
<%@page import="vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyBienHieuPhuongTienLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien"%>
<%@ include file="/html/init.jsp"%>
<%@ include file="/html/param_init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
	String col1 = ParamUtil.getString(request, "col1");
	QLVTXuLyBienHieuPhuongTien ettXuLyBienHieuPhuongTien = QLVTXuLyBienHieuPhuongTienLocalServiceUtil.fetchQLVTXuLyBienHieuPhuongTien(Integer.valueOf("0"+col1));
%>
<aui:input type="hidden" name="<%=QLVTBienHieuTerm.ID_PHUONG_TIEN %>" value="<%=col1 %>"></aui:input>
<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="<%=\"Biển số xe: \"+ettXuLyBienHieuPhuongTien.getBienSo() %>" inlineField="<%=true %>" >
		</aui:field-wrapper>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="50">
		<aui:field-wrapper label="Tên hiệu xe:" inlineField="<%=true %>" >
			<aui:input name="<%=QLVTBienHieuTerm.NHAN_HIEU %>" value="<%=ettXuLyBienHieuPhuongTien.getNhanHieu() %>" label=" "></aui:input>
		</aui:field-wrapper>
	</aui:col>
	<aui:col width="50">
		<aui:field-wrapper label="Năm sản xuất:" inlineField="<%=true %>" >
			<aui:select name="<%=QLVTBienHieuTerm.NAM_SX %>" label="">
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
		<aui:field-wrapper label="Màu sơn:" inlineField="<%=true %>" >
			<aui:input name="<%=QLVTBienHieuTerm.MAU_SON %>" value="<%=ettXuLyBienHieuPhuongTien.getMauSon() %>" label=" "></aui:input>
		</aui:field-wrapper>
	</aui:col>
	<aui:col width="50">
		<aui:field-wrapper label="Lĩnh vực kinh doanh:" inlineField="<%=true %>" >
			<aui:select cssClass="fixWidth" name="<%=QLVTBienHieuTerm.LINH_VUC_KINH_DOANH %>" label="">
				<%
					for (Map.Entry<String,String> entry : FormUtil.cbxLoaiBH().entrySet()) {
				%>
					<option value="<%=entry.getKey()%>"><%=HtmlUtil.escape(entry.getValue())%></option>
				<% }%>
			</aui:select>
		</aui:field-wrapper>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="Niên hạn sử dụng trên Giấy đăng kiểm:" inlineField="<%=true %>" >
			<aui:input name="<%=QLVTBienHieuTerm.NIEN_HAN_SU_DUNG_GIAY_DANG_KIEM %>" value="<%=ettXuLyBienHieuPhuongTien.getNienHanSuDungGiayDangKiem()%>" label=" "></aui:input>
		</aui:field-wrapper>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="Niên hạn sử dụng theo NĐ 86:" inlineField="<%=true %>" >
			<aui:input name="<%=QLVTBienHieuTerm.NIEN_HAN_SU_DUNG_ND86 %>" value="<%=ettXuLyBienHieuPhuongTien.getNienHanSuDungND86()%>" label=" " prefix="date"></aui:input>
		</aui:field-wrapper>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="Xe thuê/sở hữu:" inlineField="<%=true %>" >
			<aui:select name="<%=QLVTBienHieuTerm.HINH_THUC_SO_HUU_XE %>" label="">
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
			<aui:input name="<%=QLVTBienHieuTerm.DOANH_NGHIEP_SO_HUU_THUE %>" value="<%=ettXuLyBienHieuPhuongTien.getDoanhNghiepSoHuuThue()%>" label=" "></aui:input>
		</aui:field-wrapper>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="50">
		<aui:field-wrapper label="Thời hạn thuê:" inlineField="<%=true %>" >
			<aui:input name="<%=QLVTBienHieuTerm.THOI_HAN_THUE %>" value="<%=ettXuLyBienHieuPhuongTien.getThoiHanThue()%>" label=" " prefix="date">
			</aui:input>
		</aui:field-wrapper>
	</aui:col>
	<aui:col width="50">
		<aui:field-wrapper label="Hợp đồng sau cùng:" inlineField="<%=true %>" >
			<aui:select name="<%=QLVTBienHieuTerm.HOP_DONG_SAU_CUNG %>" label="">
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
		<aui:input type="radio" name="<%=QLVTBienHieuTerm.KET_QUA_XU_LY %>" value="1" label="Đạt" inlineField="<%=true %>" inlineLabel="false" onClick="showHiddenDiv(1);"></aui:input>
		<aui:input type="radio" name="<%=QLVTBienHieuTerm.KET_QUA_XU_LY %>" value="0" label="Không đạt" inlineField="<%=true %>" inlineLabel="false" onClick="showHiddenDiv(0);"></aui:input>
	</aui:col>
</aui:row>

<div id="divDat" style="display: none;margin-left: 20%;">
	<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="Số A: " inlineField="<%=true %>" >
			<aui:input name="<%=QLVTBienHieuTerm.SO_A %>" value="<%=ettXuLyBienHieuPhuongTien.getSoA() %>" label=" "></aui:input>
		</aui:field-wrapper>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="Số B:" inlineField="<%=true %>" >
			<aui:input name="<%=QLVTBienHieuTerm.SO_B %>" value="<%=ettXuLyBienHieuPhuongTien.getSoB() %>" label=" "></aui:input>
		</aui:field-wrapper>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="Đơn vị:" inlineField="<%=true %>" >
			<aui:input name="<%=QLVTBienHieuTerm.DON_VI %>" value="" label=" "></aui:input>
		</aui:field-wrapper>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="Biển số:" inlineField="<%=true %>" >
			<aui:input name="<%=QLVTBienHieuTerm.BIEN_SO_DAT %>" value="" label=" "></aui:input>
		</aui:field-wrapper>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="Có giá trị đến: " inlineField="<%=true %>" >
			<aui:input name="<%=QLVTBienHieuTerm.CO_GIA_TRI_DEN %>" value="" label=" " prefix="date"></aui:input>
		</aui:field-wrapper>
	</aui:col>
</aui:row>
</div>
<div id="divKoDat"style="display: none;margin-left: 20%;">
	<aui:input type="textarea" name="<%=QLVTBienHieuTerm.LY_DO_KHONG_DAT %>" value="<%=ettXuLyBienHieuPhuongTien.getLyDoKhongDat() %>" cssClass="myTextArea" label=" "></aui:input>
</div>
<aui:button-row cssClass="myButtonTop">
	<aui:button cssClass="btn btn-primary" value="Lưu" onClick="submitItemForm();"></aui:button>
</aui:button-row>
<portlet:renderURL var="dv1Page" windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
	<portlet:param name="mvcPath" value="/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/bhph/bh_ph_form_cho_tham_xet_xu_ly_bh_dv2.jsp"/>
</portlet:renderURL>
<portlet:actionURL var="addItemURL" name="bienHieu_oTo_luuThongTinThamXet" />
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
			    	trigger: '#<portlet:namespace /><%=QLVTBienHieuTerm.NIEN_HAN_SU_DUNG_GIAY_DANG_KIEM %>',
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
			    	trigger: '#<portlet:namespace /><%=QLVTBienHieuTerm.NIEN_HAN_SU_DUNG_ND86 %>',
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
			    	trigger: '#<portlet:namespace /><%=QLVTBienHieuTerm.CO_GIA_TRI_DEN %>',
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
			    	trigger: '#<portlet:namespace /><%=QLVTBienHieuTerm.THOI_HAN_THUE %>',
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
