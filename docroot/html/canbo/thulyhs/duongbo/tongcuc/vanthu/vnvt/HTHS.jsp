
<%@page import="vn.dtt.duongbo.utils.document.DocumentUtils"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcNoidungHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo"%>
<%@page import="vn.dtt.duongbo.term.quocte.QLVTQuocTeTerm"%>
<%@ include file="/html/init.jsp"%>
<%@ include file="/html/param_init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%

PortletURL lienVan_vietTrung_HTHS = renderResponse.createActionURL();
lienVan_vietTrung_HTHS.setParameter(ActionRequest.ACTION_NAME, "lienVan_vietTrung_HTHS");
lienVan_vietTrung_HTHS.setParameter(Constants.ID_HO_SO_THU_TUC, hoSoThuTucId);
lienVan_vietTrung_HTHS.setParameter(Constants.ID_PHIEU_XU_LY, phieuXuLyId);
lienVan_vietTrung_HTHS.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
lienVan_vietTrung_HTHS.setParameter(Constants.ID_QUY_TRINH_THU_TUC, quyTrinhThuTucId);
lienVan_vietTrung_HTHS.setParameter(Constants.ID_THU_TUC_HANH_CHINH, idThuTucHanhChinh);
QlvtThongTinHoSo thongTinHoSo = QlvtThongTinHoSoLocalServiceUtil.fetchByphieuXuLyId(Long.valueOf("0"+phieuXuLyId));
QlvtThongTinXuLy qlvtThongTinXuLy = null;
if(Validator.isNotNull(thongTinHoSo)){
	qlvtThongTinXuLy = QlvtThongTinXuLyLocalServiceUtil.fetchBythongTinHoSoId(Integer.valueOf("0"+thongTinHoSo.getId()));	
}
List<TthcNoidungHoSo> lstHS = TthcNoidungHoSoLocalServiceUtil.findByF_HS_DINH_KEM(Long.valueOf("0"+hoSoThuTucId));
PortletURL viewPDFFile = renderResponse.createRenderURL();
viewPDFFile.setWindowState(LiferayWindowState.POP_UP);
viewPDFFile.setParameter("jspPage", "/html/canbo/thulyhs/duongbo/tongcuc/report_common/export_file_id.jsp");
%>
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
		<liferay-util:include page="/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvt/vnvt_view_cap_phep_form.jsp" servletContext="<%=this.getServletContext() %>">
			<liferay-util:param name="popUp" value="1" />
			<liferay-util:param name="<%=Constants.ID_PHIEU_XU_LY %>" value="<%=phieuXuLyId %>" />
			<liferay-util:param name="xuLyPhuHieuId" value="<%=String.valueOf(xuLyPhuHieuId) %>" />
		</liferay-util:include>
		</div>
		<%
		}
		%>
	<div style="text-align: left;">
		<aui:row>
			<aui:col width="50">
				<aui:field-wrapper label="Họ tên người trả kết quả:" inlineField="<%=true %>" >
					<aui:input type="text" disabled="true" name="<%=QlvtLienVanTerm.HO_TEN_NGUOI_TRA_KET_QUA %>" value="<%=thongTinHoSo.getNguoiLienHeTraKetQua() %>" label="">
					</aui:input> 
				</aui:field-wrapper>
			</aui:col>
			<aui:col width="50">
				<aui:field-wrapper label="Điện thoại người trả kết quả: " inlineField="<%=true %>" >
					<aui:input type="text" disabled="true" name="<%=QlvtLienVanTerm.DIEN_THOAI_NGUOI_TRA_KET_QUA %>" value="<%=thongTinHoSo.getSoDienThoaiNguoiLienHe()%>" label="">
					</aui:input> 
				</aui:field-wrapper>
			</aui:col>
		</aui:row>
		<aui:row>
			<aui:col width="50">
				<aui:field-wrapper label="Họ tên người nhận kết quả:" inlineField="<%=true %>" >
					<aui:input type="text" name="<%=QlvtLienVanTerm.NGUOI_NHAN_KET_QUA %>" value="<%=thongTinHoSo.getNguoiLienHeTraKetQua() %>" label="">
					</aui:input> 
				</aui:field-wrapper>
			</aui:col>
			<aui:col width="50">
				<aui:field-wrapper label="Điện thoại người nhận kết quả: " inlineField="<%=true %>" >
					<aui:input type="text" name="<%=QlvtLienVanTerm.THONG_TIN_TRA_KET_QUA %>" value="<%=thongTinHoSo.getThongTinTraKetQua()%>" label="">
					</aui:input> 
				</aui:field-wrapper>
			</aui:col>
		</aui:row>
		<aui:row>
			<aui:col width="100" >
					<aui:field-wrapper label="ngày trả kết quả: " inlineField="<%=true %>" >
						<aui:input type="text" name="<%=QlvtLienVanTerm.NGAY_TRA_KET_QUA %>" value="<%=thongTinHoSo.getNgayTraKetQua()%>" label="">
						</aui:input> 
					</aui:field-wrapper>
			</aui:col>
		</aui:row>
		<div style = "margin-top: 20px;">
			<aui:input type="hidden" name="<%=Constants.ID_PHIEU_XU_LY %>" value="<%=phieuXuLyId %>"></aui:input>
			<aui:input type="hidden" name="<%=Constants.ID_QUY_TRINH_THU_TUC %>" value="<%=quyTrinhThuTucId %>"></aui:input>
			<aui:input type="hidden" name="actionCHK"></aui:input>
			<aui:input type="hidden" name="actionURL" value="<%=lienVan_vietTrung_HTHS.toString() %>"></aui:input>
			<aui:input type="hidden" name="userIdXuLy"></aui:input>
				<aui:input type="hidden" name="idFileFm"></aui:input>
			<aui:button cssClass="btn btn-primary" value="Trả kết quả" onClick="chuyenDichDynamic('Xac.nhan');"/>
		</div>
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
	AUI().one('#<portlet:namespace /><%=QlvtLienVanTerm.NGAY_TRA_KET_QUA  %>').val('<%=Validator.isNotNull(thongTinHoSo.getNgayTraKetQua())?sdf.format(thongTinHoSo.getNgayTraKetQua()):StringPool.BLANK %>');
</aui:script>