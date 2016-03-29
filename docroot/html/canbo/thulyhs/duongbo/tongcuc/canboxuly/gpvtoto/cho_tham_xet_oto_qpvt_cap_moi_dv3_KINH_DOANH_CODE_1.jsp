<%@page import="vn.dtt.duongbo.term.noidia.QLVTNoiDiaTerm"%>
<%@page import="vn.dtt.duongbo.dao.noidia.service.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai"%>
<%@page import="vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
<%@ include file="/html/init.jsp"%>
<%@ include file="/html/param_init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
	String col1 = ParamUtil.getString(request, "col1");
	String col2 = ParamUtil.getString(request, "col2");
	DmDataItem itemLhhd = DmDataItemLocalServiceUtil.getByGroupCodeAndItemCode0(DanhMucConstants.DM_LOAI_HINH_HOAT_DONG, col2);
	QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai ettData = QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalServiceUtil.fetchQlvtXuLyGpkdvtBangOtoLoaiHinhVanTai(Long.valueOf(col1));
	List<DmDataItem> listTuyen = DmDataItemLocalServiceUtil.findByGroupId(Constants.GROUP_ID_DM_TUYEN_OTO);
	List<DmDataItem> lstldkd = DanhMucConstants.getLoaiHinhKinhDoanh();
	List<DmDataItem> lstphamvihd = DanhMucConstants.getPhamViHoatDong();
%>
<aui:input type="hidden" name="<%=QLVTNoiDiaTerm.ID_LOAI_HINH_VT %>" value="<%=col1 %>"></aui:input>
<div class="modal-header">
	<h4 class="modal-title"><%=lstldkd.get(0).getName()%></h4>
</div>
<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="Phạm vi hoạt động:" inlineField="<%=true %>" >
				<select id="<%=QLVTNoiDiaTerm.PHAM_VI_HOAT_DONG%>"
						name="<%=QLVTNoiDiaTerm.PHAM_VI_HOAT_DONG%>%>"
						class="form-control">
						<%
							for (DmDataItem item : lstphamvihd) {
						%>
						<option value="<%=item.getCode()%>"><%=item.getName()%></option>
						<%
							}
						%>
					</select>
		</aui:field-wrapper>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="Số lượng phương tiện:" inlineField="<%=true %>" >
			<aui:input name="<%=QLVTNoiDiaTerm.SO_LUONG_PHUONG_TIEN %>" value="<%=ettData.getSoLuongPhuongTien() %>" label=" "></aui:input>
		</aui:field-wrapper>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="100">
		<aui:field-wrapper cssClass="fixWidth" label="Thiết bị giám sát hành trình:" inlineField="<%=true %>" >
			<aui:select cssClass="fixWidth" name="<%=QLVTNoiDiaTerm.THIET_BI_GIAM_SAT_HANH_TRINH %>" label="">
						<%
							for (Map.Entry<String,String> entry : FormUtil.cbxThietBiGiamSatHanhTrinh().entrySet()) {
						%>
							<option value="<%=entry.getKey()%>"><%=HtmlUtil.escape(entry.getValue())%></option>
						<% }%>
			</aui:select>	
		</aui:field-wrapper>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="100">
		<aui:field-wrapper cssClass="fixWidth" label="Tuyến khai thác 1:" inlineField="<%=true %>" >
			<aui:select cssClass="fixWidth"  id="<%=QLVTNoiDiaTerm.MA_TUYEN+\"0\" %>" name="<%=QLVTNoiDiaTerm.MA_TUYEN+\"0\" %>" onChange="pickMaTuyen()" label=" ">
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
		<aui:field-wrapper cssClass="fixWidth" label="Tuyến khai thác 2:" inlineField="<%=true %>" >
			<aui:select cssClass="fixWidth" id ="<%=QLVTNoiDiaTerm.MA_TUYEN+\"1\" %>" name="<%=QLVTNoiDiaTerm.MA_TUYEN+\"1\" %>" onChange="pickMaTuyen()" label=" ">
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
		<aui:field-wrapper label="Đánh giá phương án kinh doanh vận tải:" inlineField="<%=true %>" >
			
		</aui:field-wrapper>
		
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="100">
		<aui:input type="radio" name="<%=QLVTNoiDiaTerm.KET_QUA_XU_LY_LOAI_HINH %>" value="1" label="Đạt" inlineField="<%=true %>" onClick="showHiddenDiv(1);"></aui:input>
			<aui:input type="radio" name="<%=QLVTNoiDiaTerm.KET_QUA_XU_LY_LOAI_HINH %>" value="0" label="Không đạt" inlineField="<%=true %>" onClick="showHiddenDiv(0);"></aui:input>
	</aui:col>
</aui:row>
<div id="divDat" style="display: none;margin-left: 20%;">
	
</div>
<div id="divKoDat"style="display: none;margin-left: 20%;">
	<aui:input type="textarea" name="<%=QLVTNoiDiaTerm.LY_DO_KHONG_DAT %>" cssClass="myTextArea" label="Lý do không đạt"></aui:input>
</div>
<aui:button-row cssClass="myButtonTop">
	<aui:button cssClass="btn btn-primary" value="Lưu" onClick="submitItemForm();"></aui:button>
</aui:button-row>
<script type="text/javascript">
	var A = AUI();
	function pickMaTuyen() {
		var val1 = A.one('#<portlet:namespace /><%=QLVTNoiDiaTerm.MA_TUYEN+"0" %>');
		var val2 = A.one('#<portlet:namespace /><%=QLVTNoiDiaTerm.MA_TUYEN+"1" %>');
		var varMaTuyen = A.one('#<portlet:namespace /><%=QLVTNoiDiaTerm.MA_TUYEN %>');
		var varMaTuyens = A.one('#<portlet:namespace /><%=QLVTNoiDiaTerm.MA_TUYENS %>');
		varMaTuyens.val(val1.val()+","+val2.val());
	}
</script>
<portlet:renderURL var="dv1Page" windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
	<portlet:param name="mvcPath" value="/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/gpvtoto/cho_tham_xet_oto_qpvt_cap_moi_dv2.jsp"/>
</portlet:renderURL>
<portlet:actionURL var="addItemURL" name="noiDia_oTo_luuThongTinThamXet" />
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
</aui:script>
