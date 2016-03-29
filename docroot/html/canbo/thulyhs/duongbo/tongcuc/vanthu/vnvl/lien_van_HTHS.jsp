
<%@page import="vn.dtt.duongbo.dao.common.service.TthcNoidungHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo"%>
<%@ include file="/html/init.jsp"%>
<%@ include file="/html/param_init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%

PortletURL lienVan_vietLao_HTHS = renderResponse.createActionURL();
lienVan_vietLao_HTHS.setParameter(ActionRequest.ACTION_NAME, "lienVan_vietLao_HTHS");
lienVan_vietLao_HTHS.setParameter(Constants.ID_HO_SO_THU_TUC, hoSoThuTucId);
lienVan_vietLao_HTHS.setParameter(Constants.ID_PHIEU_XU_LY, phieuXuLyId);
lienVan_vietLao_HTHS.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
lienVan_vietLao_HTHS.setParameter(Constants.ID_QUY_TRINH_THU_TUC, quyTrinhThuTucId);
lienVan_vietLao_HTHS.setParameter(Constants.ID_THU_TUC_HANH_CHINH, idThuTucHanhChinh);
QlvtThongTinHoSo ettThongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.fetchByphieuXuLyId(Long.valueOf("0"+phieuXuLyId));
QlvtThongTinXuLy qlvtThongTinXuLy = null;
if(Validator.isNotNull(ettThongTinHoSo)){
	qlvtThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil.fetchBythongTinHoSoId(Integer.valueOf("0"+ettThongTinHoSo.getId()));	
}
List<TthcNoidungHoSo> lstHS = TthcNoidungHoSoLocalServiceUtil.findByF_HS_DINH_KEM(Long.valueOf("0"+hoSoThuTucId));
PortletURL viewPDFFile = renderResponse.createRenderURL();
viewPDFFile.setWindowState(LiferayWindowState.POP_UP);
viewPDFFile.setParameter("jspPage", "/html/canbo/thulyhs/duongbo/tongcuc/report_common/export_file_id.jsp");
%>

<portlet:renderURL var="renderSearchContent">
			<portlet:param name="jspPage" value="/html/hscanbo/search_content.jsp"/>
			<portlet:param name="<%=Constants.ID_HO_SO_THU_TUC%>" value="<%=StringUtil.valueOf(hoSoThuTucId)%>"/>
			<portlet:param name="<%=Constants.ID_PHIEU_XU_LY%>" value="<%=StringUtil.valueOf(phieuXuLyId)%>"/>
			<portlet:param name="<%=Constants.THANH_PHAN_XU_LY%>" value="<%=StringUtil.valueOf(thanhPhanXuLy)%>"/>
</portlet:renderURL>
<aui:form name="fm" action="#">
<div class="TabbedPanelsContent">
<%
	if(qlvtThongTinXuLy.getKetQuaXuLy().equalsIgnoreCase("CVYCBS")||qlvtThongTinXuLy.getKetQuaXuLy().equalsIgnoreCase("CVTCCGP")){
			%>
			<aui:input type="hidden" name="keyDichChuyen"></aui:input>
			<div align="center">
				<%@ include file="/html/canbo/thulyhs/duongbo/tongcuc/report_common/export_cong_van.jsp"%>
			</div>
			<%
		}else{
			int xuLyPhuHieuId=0;
			if(Validator.isNotNull(qlvtThongTinXuLy)){
				QlvtXuLyGpLienVan ettXuLyGpLienVan = QlvtXuLyGpLienVanLocalServiceUtil.fetchBythongTinXuLyId(Integer.valueOf("0"+qlvtThongTinXuLy.getId()));
				xuLyPhuHieuId = Validator.isNotNull(ettXuLyGpLienVan)?Integer.valueOf("0"+ettXuLyGpLienVan.getId()):0;
			}
		%>
		<div align="center">
		<liferay-util:include page="/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvl/vnvl_view_cap_phep_form.jsp" servletContext="<%=this.getServletContext() %>">
			<liferay-util:param name="popUp" value="1" />
			<liferay-util:param name="<%=Constants.ID_PHIEU_XU_LY %>" value="<%=phieuXuLyId %>" />
			<liferay-util:param name="xuLyPhuHieuId" value="<%=String.valueOf(xuLyPhuHieuId) %>" />
		</liferay-util:include>
		</div>
		<%
		}
		%>
		<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="Họ tên người trả kết quả:" inlineField="<%=true %>" >
				<aui:input type="text"  name="<%=QlvtLienVanTerm.NGUOI_LIEN_HE_TRA_KET_QUA %>" value="<%=ettThongTinHoSo.getNguoiLienHeTraKetQua() %>" label="">
				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
			<aui:field-wrapper label="Điện thoại người trả kết quả: " inlineField="<%=true %>" >
				<aui:input type="text"  name="<%=QlvtLienVanTerm.SO_DIEN_THOAI_NGUOI_LIEN_HE %>" value="<%=ettThongTinHoSo.getSoDienThoaiNguoiLienHe()%>" label="">
				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="50">
			<aui:field-wrapper label="Họ tên người nhận kết quả:" inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QlvtLienVanTerm.NGUOI_NHAN_KET_QUA %>" value="<%=ettThongTinHoSo.getNguoiLienHeTraKetQua()%>" label="">
				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
		<aui:col width="50">
			<aui:field-wrapper label="Điện thoại người nhận kết quả: " inlineField="<%=true %>" >
				<aui:input type="text" name="<%=QlvtLienVanTerm.THONG_TIN_TRA_KET_QUA %>" value="<%=ettThongTinHoSo.getThongTinTraKetQua()%>" label="">
				</aui:input> 
			</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="50" >
				<aui:field-wrapper label="ngày trả kết quả: " inlineField="<%=true %>" >
					<aui:input type="text" name="<%=QlvtLienVanTerm.NGAY_TRA_KET_QUA %>" value="<%=ettThongTinHoSo.getNgayTraKetQua() %>" label="">
					</aui:input> 
				</aui:field-wrapper>
		</aui:col>
	</aui:row>
	<div style = "margin-top: 20px;">
		<aui:input type="hidden" name="keyDichChuyen"></aui:input>
		<aui:input type="hidden" name="<%=Constants.ID_PHIEU_XU_LY %>" value="<%=phieuXuLyId %>"></aui:input>
		<aui:input type="hidden" name="<%=Constants.ID_QUY_TRINH_THU_TUC %>" value="<%=quyTrinhThuTucId %>"></aui:input>
		<aui:input type="hidden" name="actionCHK"></aui:input>
		<aui:input type="hidden" name="actionURL" value="<%=lienVan_vietLao_HTHS.toString() %>"></aui:input>
		<aui:input type="hidden" name="userIdXuLy"></aui:input>
			<aui:input type="hidden" name="idFileFm"></aui:input>
		<aui:button cssClass="btn btn-primary" value="Trả kết quả" onClick="chuyenDichDynamic('Xac.nhan');"/>
	</div>
</div>
<%@ include file="/html/canbo/thulyhs/duongbo/tongcuc/report_common/script_button.jspf"%>
</aui:form>

<aui:script use="aui-io-request,aui-node">
var A = AUI();
AUI().ready(function(A){
	
	<%
		for(TthcNoidungHoSo ettS: lstHS){
			viewPDFFile.setParameter("idFileReturn", ettS.getTaiLieuDinhKem()+"");
			String renderPop = "'" + viewPDFFile.toString() +"'";
			String tagPop = "javascript:viewDetail("+renderPop+",'cong-van',0.8)";
			String tagLinkString = "<a href='#' onclick="+tagPop+" title='Xem nội dung giấy tờ'>" + "<span style='font-family:Arial;font-size:13px;font-weight:normal;font-style:italic;text-decoration:underline;color:#0000FF;'>" + "-" + ettS.getTenTaiLieu() + "</span>" + "</a>";
		%>
		var errorBlock=A.one("#group-id-block"+<%=ettS.getNoiDungXml()%>);
		errorBlock.set("innerHTML","");
		var errorMessageNode = A.Node.create("<%=tagLinkString %>");
		errorMessageNode.appendTo(errorBlock);
	<%
		}
	%>
});
</aui:script>
<aui:script use="aui-io-request,aui-node">
var A = AUI();
AUI().use(
		  'aui-datepicker',
		  function(A) {
		    new A.DatePicker(
		      {
		    	trigger: '#<portlet:namespace /><%=QlvtLienVanTerm.NGAY_TRA_KET_QUA %>',
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
	AUI().one('#<portlet:namespace /><%=QlvtLienVanTerm.NGAY_TRA_KET_QUA  %>').val('<%=Validator.isNotNull(ettThongTinHoSo.getNgayTraKetQua())?sdf.format(ettThongTinHoSo.getNgayTraKetQua()):StringPool.BLANK %>');
</aui:script>