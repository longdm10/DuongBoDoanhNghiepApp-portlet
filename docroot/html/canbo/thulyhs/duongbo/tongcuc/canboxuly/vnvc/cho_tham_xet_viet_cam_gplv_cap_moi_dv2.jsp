<%@page import="vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanPhuongTienLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTien"%>
<%@page import="vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVan"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.service.DmDataGroupLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataGroup"%>
<%@page import="vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.duongbo.dao.quocte.service.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTai"%>
<%@page import="vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTXuLyBienHieuPhuongTienLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="vn.dtt.duongbo.term.capbienhieuphuhieu.QLVTListDV2"%>
<%@page import="vn.dtt.duongbo.dao.common.model.impl.TthcHoSoThuTucImpl"%>
<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ include file="/html/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%

/* int xuLyPhuHieuId = ParamUtil.getInteger(request, "xuLyPhuHieuId");
String phieuXuLyId = ParamUtil.getString(request, Constants.ID_PHIEU_XU_LY);
String maTrangThai = ParamUtil.getString(request, "maTrangThai");
String tq2 = ParamUtil.getString(request, "tq2");
PortletURL showMyForm = renderResponse.createRenderURL();
showMyForm.setWindowState(LiferayWindowState.EXCLUSIVE); */

int xuLyPhuHieuId = ParamUtil.getInteger(request, "xuLyPhuHieuId");
String tq2 = ParamUtil.getString(request, "tq2");
String popUp = ParamUtil.getString(request, "popUp");
String maTrangThai = ParamUtil.getString(request, "maTrangThai");
PortletURL showMyForm = renderResponse.createRenderURL();
showMyForm.setWindowState(LiferayWindowState.EXCLUSIVE);
showMyForm.setParameter("tq2", tq2);
if(Validator.isNotNull(popUp)){
	showMyForm.setParameter("mvcPath", "/html/canbo/thulyhs/duongbo/tongcuc/report_common/export_cong_van.jsp");
}else{
	showMyForm.setParameter("mvcPath", "/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvc/cho_tham_xet_viet_cam_gplv_dv3_"+tq2+".jsp");
}

List<QlvtXuLyGpLienVanPhuongTien> listBase = QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.findBycapGplvId(xuLyPhuHieuId);
%>

<div id="<%=Validator.isNotNull(popUp)?StringPool.BLANK:"dv2"%>">
<liferay-portlet:renderURL varImpl="iteratorURL">
<portlet:param name="mvcPath" value="/html/jsps/view_all_students.jsp" />
</liferay-portlet:renderURL>
<liferay-ui:search-container emptyResultsMessage="Không tìm thấy bản ghi nào"
iteratorURL="<%=iteratorURL %>"
delta="25"
> 
<liferay-ui:search-container-results>
<%
List<QLVTListDV2> resultsQLVTListDV2 = new ArrayList<QLVTListDV2>();
int ipk = 0;

for(QlvtXuLyGpLienVanPhuongTien ett: listBase){
	resultsQLVTListDV2.add(ipk, new QLVTListDV2(ett.getId()+"",ett.getBienSo(),ett.getKetQuaXuLy(),StringPool.BLANK,ett.getLoaiGiayPhep(),StringPool.BLANK));
	ipk++;
}
results = resultsQLVTListDV2;
total = listBase.size();
searchContainer.setTotal(total);
searchContainer.setResults(results);
%>
</liferay-ui:search-container-results>
<liferay-ui:search-container-row className="vn.dtt.duongbo.term.capbienhieuphuhieu.QLVTListDV2"
keyProperty="col1" modelVar="ett">

<liferay-ui:search-container-column-text name="STT" value="<%= String.valueOf(searchContainer.getDelta()*(searchContainer.getCur()-1) +index + 1) %>" orderable="<%= false %>" />

<liferay-ui:search-container-column-text name="Biển số" >
<%-- <%

showMyForm.setParameter("mvcPath", "/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvc/cho_tham_xet_viet_cam_gplv_dv3_"+tq2+".jsp");
showMyForm.setParameter("col1", ett.getCol1());
showMyForm.setParameter("col2", ett.getCol2());


%>
	<a style="cursor:help" onclick="javascript:loadMyPageDv3('<%=showMyForm%>');"><%= ett.getCol2() %></a> --%>
<c:choose>
	<c:when test="<%=Validator.isNotNull(popUp) %>">
	<%
	showMyForm.setParameter("keyKetQuaThamTra",Validator.isNotNull(ett.getCol5())?ett.getCol5():ett.getCol6());
	%>
		<a style="cursor:help" onclick="javascript:viewDetail('<%=showMyForm%>','<%= LanguageUtil.get(pageContext, "cong_van") %>',0.8)"><%=ett.getCol2() %></a>
		
	</c:when>
	<c:otherwise>
	<%
		showMyForm.setParameter("col1", ett.getCol1());
		showMyForm.setParameter("col2", ett.getCol2());
	%>
		<a style="cursor:help" onclick="javascript:loadMyPageDv3('<%=showMyForm%>','<%= LanguageUtil.get(pageContext, "cong_van") %>',0.8)"><%= ett.getCol2() %></a>
	</c:otherwise>
</c:choose>	
</liferay-ui:search-container-column-text>

<liferay-ui:search-container-column-text name="Trạng thái" value="<%= LanguageUtil.get(pageContext, \"trang-thai-\"+ett.getCol3()) %>" orderable="<%= false %>" />


<%
	if(Validator.isNotNull(maTrangThai) && maTrangThai.equalsIgnoreCase("CB_CTKQ")){
%>
<liferay-ui:search-container-column-text name="Tải file"  orderable="<%= false %>" >
	<div style="float: left;" id='<%="group-success-block" + String.valueOf(searchContainer.getDelta()*(searchContainer.getCur()-1) +index + 1) %>' ></div>
	<div style="float: right;">
		<aui:input type="hidden" name="<%=\"fName\" + String.valueOf(searchContainer.getDelta()*(searchContainer.getCur()-1) +index + 1) %>" />
		<aui:input type="hidden" name="<%=\"fId\" + String.valueOf(searchContainer.getDelta()*(searchContainer.getCur()-1) +index + 1) %>" />
		<aui:input type="hidden" name="<%=\"fIdPT\" + String.valueOf(searchContainer.getDelta()*(searchContainer.getCur()-1) +index + 1) %>" value="<%=ett.getCol1() %>" />
		<a href="#" class="btn btn-primary" onclick="javascript:func_uploadFile('<%=String.valueOf(searchContainer.getDelta()*(searchContainer.getCur()-1) +index + 1) %>');" title="Tải giấy tờ lên">TẢI KẾT QUẢ</a>
	</div>
</liferay-ui:search-container-column-text>
<%
	}
%>
<%
	if(Validator.isNotNull(maTrangThai) && maTrangThai.equalsIgnoreCase("CB_HTHS")){
%>
<liferay-ui:search-container-column-text name="Đính kèm"  orderable="<%= false %>" >
	<div style="float: left;" id='<%="group-id-block" + ett.getCol1() %>' ></div>
</liferay-ui:search-container-column-text>
<%
	}
%>

</liferay-ui:search-container-row>
<liferay-ui:search-iterator searchContainer="<%=searchContainer %>" />
</liferay-ui:search-container>
</div>

