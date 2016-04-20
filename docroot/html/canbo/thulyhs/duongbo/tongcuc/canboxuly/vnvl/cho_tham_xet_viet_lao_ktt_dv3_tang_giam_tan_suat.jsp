<%@page import="vn.dtt.duongbo.dao.quocte.service.QlvtXuLyKTTQuocTePhuongTienLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTePhuongTienImpl"%>
<%@page import="vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien"%>
<%@page import="vn.dtt.duongbo.dao.quocte.service.QlvtXuLyKTTQuocTeLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTe"%>
<%@page import="vn.dtt.duongbo.term.quocte.QLVTKhaiTacTuyen"%>
<%@page import="vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanTuyenLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen"%>
<%@page import="vn.dtt.duongbo.utils.CheckCssUtils"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Map"%>
<%@ include file="/html/param_init.jsp"%>
<%@page import="vn.dtt.form.util.FormUtil"%>
<%@page import="vn.dtt.duongbo.business.DanhMucConstants"%>
<%@page import="vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanPhuongTienImpl"%>
<%@page import="vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanPhuongTienLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy"%>
<%@page import="vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVan"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSo"%>
<%@page import="vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTien"%>
<%@page import="vn.dtt.duongbo.term.lienvan.QlvtLienVanTerm"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.impl.TthcHoSoThuTucImpl"%>
<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@ include file="/html/init.jsp"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinXuLyLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanLocalServiceUtil"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
	
	String col1 = ParamUtil.getString(request, "col1");
	String xuLyPhuHieuId = ParamUtil.getString(request, "xuLyPhuHieuId");
	QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien = new QlvtXuLyKTTQuocTePhuongTienImpl();
	
// 	String phieuXuLyId = ParamUtil.getString(request, Constants.ID_PHIEU_XU_LY);

	
	QlvtThongTinHoSo ettThongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.fetchByphieuXuLyId(Long.valueOf("0"+phieuXuLyId));
	QlvtThongTinXuLy ettThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil.fetchBythongTinHoSoId(Integer.valueOf("0"+ettThongTinHoSo.getId()));
	QlvtXuLyKTTQuocTe ettKTTQuocTe = QlvtXuLyKTTQuocTeLocalServiceUtil.fetchBythongTinXuLyId(Integer.valueOf("0"+ettThongTinXuLy.getId()));
	qlvtXuLyKTTQuocTePhuongTien = QlvtXuLyKTTQuocTePhuongTienLocalServiceUtil.fetchQlvtXuLyKTTQuocTePhuongTien(Long.valueOf("0"+col1));
	
	List<DmDataItem> listLoaiHinhKDVT = DanhMucConstants.getallLoaiHinhHoatDong();
	List<DmDataItem> listCuaKhauVietLao = DanhMucConstants.getCuaKhauVietLao();
	
%>
<aui:input type="hidden" name="<%=QLVTKhaiTacTuyen.ID_PHUONG_TIEN %>" value="<%=qlvtXuLyKTTQuocTePhuongTien.getId() %>"></aui:input>
<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="Biển kiểm soát:" inlineField="<%=true %>" >
			<aui:input type="text" name="<%=QLVTKhaiTacTuyen.BIEN_SO %>" value="<%=qlvtXuLyKTTQuocTePhuongTien.getBienSo() %>" label="">

			</aui:input>
			<%=HtmlUtil.escape("") %>
		</aui:field-wrapper>
	</aui:col>
</aui:row>
<!-- Nhãn hiệu trọng tải start -->
<aui:row>
	<aui:col width="50">
		<aui:field-wrapper label="Nhãn hiệu phương tiện:" inlineField="<%=true %>" >
			<aui:input type="text" name="<%=QLVTKhaiTacTuyen.NHAN_HIEU %>" value="<%=qlvtXuLyKTTQuocTePhuongTien.getNhanHieu() %>" label="">

			</aui:input>
		</aui:field-wrapper>
	</aui:col>
	<aui:col width="50">
		<aui:field-wrapper label="Năm sản xuất:" inlineField="<%=true %>" >
			<aui:input type="text" name="<%=QLVTKhaiTacTuyen.NAM_SX %>" label=" ">
			<%for (String year : FormUtil.cbxYear()) {
				%>
				<option value="<%=year%>"><%=HtmlUtil.escape(year)%></option>
				<% }%>

			</aui:input>
		</aui:field-wrapper>
	</aui:col>
</aui:row>


<!-- Trọng tải màu sơn start -->
<aui:row>
	<aui:col width="50">
	
		<aui:col width="50">
		<aui:field-wrapper label="Tên đăng ký sở hữu:" inlineField="<%=true %>" >
			<aui:input type="text" name="<%=QLVTKhaiTacTuyen.TEN_DANG_KY_SO_HUU %>" value="<%=qlvtXuLyKTTQuocTePhuongTien.getTenDangKySoHuu() %>" label="">
			</aui:input>
		</aui:field-wrapper>
		</aui:col>
		<aui:field-wrapper label="Trọng tải:" inlineField="<%=true %>" >
			<aui:input type="text" name="<%=QLVTKhaiTacTuyen.TRONG_TAI %>" value="" label="">
			</aui:input>
		</aui:field-wrapper>
	</aui:col>
</aui:row>


<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="Xe thuê/ sở hữu:" inlineField="<%=true %>" >
			<aui:input type="text" name="<%=QLVTKhaiTacTuyen.HINH_THUC_SO_HUU %>" label="">
				<%
					for (Map.Entry<String,String> entry : FormUtil.cbxXeThueXeSoHuu().entrySet()) {
				%>
					<option value="<%=entry.getKey()%>"><%=HtmlUtil.escape(entry.getValue())%></option>
				<% }%>
			</aui:input>
		</aui:field-wrapper>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="Doanh nghiệp cho thuê:" inlineField="<%=true %>" >
			<aui:input type="text" name="<%=QLVTKhaiTacTuyen.DOANH_NGHIEP_CHO_THUE %>" value="<%=qlvtXuLyKTTQuocTePhuongTien.getDoanhNghiepChoThue()%>" label="">
			</aui:input>
		</aui:field-wrapper>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:field-wrapper label="Thời hạn cho thuê:" inlineField="<%=true %>" >
			<aui:input type="text" name="<%=QLVTKhaiTacTuyen.THOI_HAN_CHO_THUE %>" value="<%=qlvtXuLyKTTQuocTePhuongTien.getThoiHanChoThue()%>" label="">
			</aui:input>
		</aui:field-wrapper>
	</aui:col>
	<aui:col width="50">
		<aui:field-wrapper label="Hợp đồng sau cùng" inlineField="<%=true %>" >
			<aui:input type="text" name="<%=QLVTKhaiTacTuyen.HOP_DONG_SAU_CUNG %>" label="">
				<%
					for (Map.Entry<String,String> entry : FormUtil.cbxHopDongSauCung().entrySet()) {
				%>
					<option value="<%=entry.getKey()%>"><%=HtmlUtil.escape(entry.getValue())%></option>
				<% }%>
			</aui:input>
		</aui:field-wrapper>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="100">
		<aui:input type="radio" name="<%=QLVTKhaiTacTuyen.KET_QUA_XU_LY %>" value="1" label="Đạt" inlineField="<%=true %>" onClick="showHiddenDiv(1);"></aui:input>
		<aui:input type="radio" name="<%=QLVTKhaiTacTuyen.KET_QUA_XU_LY %>" value="0" label="Không đạt" inlineField="<%=true %>" onClick="showHiddenDiv(0);"></aui:input>
	</aui:col>
</aui:row>

<div id="divDat" style="display: none;margin-left: 20%;">
Không có gì
</div>
<div id="divKoDat"style="display: none;margin-left: 20%;">
	<aui:row>
		<aui:col width="100">
			<aui:field-wrapper label="Lý do" inlineField="<%=true %>" >
				<aui:input type="textarea" name="<%=QLVTKhaiTacTuyen.LY_DO_KHONG_DAT %>" value="<%=qlvtXuLyKTTQuocTePhuongTien.getLyDoKhongDat()%>" cssClass="myTextArea">
				</aui:input>
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
</div>
<aui:button-row cssClass="myButtonTop">
	<aui:button value="Lưu" onClick="submitItemForm();"></aui:button>
</aui:button-row>
<portlet:renderURL var="dv1Page" windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
	<portlet:param name="mvcPath" value="/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvl/cho_tham_xet_viet_lao_ktt_dv2.jsp"/>
	<liferay-util:param name="xuLyPhuHieuId" value="<%=xuLyPhuHieuId %>" />
	<liferay-util:param name="<%=Constants.ID_PHIEU_XU_LY %>" value="<%=phieuXuLyId %>" />
	<liferay-util:param name="tq2" value="tang_giam_tan_suat" />
</portlet:renderURL>
<portlet:actionURL var="addItemURL" name="ktt_luuThongTinThamXet" />
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
			    	trigger: '#<portlet:namespace /><%=QLVTKhaiTacTuyen.THOI_HAN_CHO_THUE %>',
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
AUI().one('#<portlet:namespace /><%=QLVTKhaiTacTuyen.THOI_HAN_CHO_THUE %>').val('<%=Validator.isNotNull(qlvtXuLyKTTQuocTePhuongTien.getThoiHanChoThue())?sdf.format(qlvtXuLyKTTQuocTePhuongTien.getThoiHanChoThue()):StringPool.BLANK %>');
</aui:script> 