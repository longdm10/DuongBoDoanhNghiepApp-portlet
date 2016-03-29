<%@page import="vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.term.capbienhieuphuhieu.QLVTListDV2"%>
<%@page import="vn.dtt.duongbo.dao.noidia.service.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai"%>
<%@ include file="/html/init.jsp"%>
<%@ include file="/html/param_init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
int xuLyPhuHieuId = ParamUtil.getInteger(request, "xuLyPhuHieuId");
PortletURL showMyForm = renderResponse.createRenderURL();
showMyForm.setWindowState(LiferayWindowState.EXCLUSIVE);
List<QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai> listBase = QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalServiceUtil.findBygpkdvtBangOtoId(xuLyPhuHieuId);
%>

<div id="dv2">
<liferay-portlet:renderURL varImpl="iteratorURL">
<portlet:param name="mvcPath" value="/html/jsps/view_all_students.jsp" />
</liferay-portlet:renderURL>
<liferay-ui:search-container emptyResultsMessage="Không tìm thấy bản ghi nào" iteratorURL="<%=iteratorURL %>" delta="25" > 
<liferay-ui:search-container-results>
<%
List<QLVTListDV2> resultsQLVTListDV2 = new ArrayList<QLVTListDV2>();
int ipk = 0;

for(QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai ett: listBase){
	resultsQLVTListDV2.add(ipk, new QLVTListDV2(ett.getId()+"",ett.getMaLoaiHinhHoatDong(),ett.getKetQuaXuLy(),StringPool.BLANK,StringPool.BLANK,StringPool.BLANK));
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
<%
showMyForm.setParameter("mvcPath", "/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/gpvtoto/cho_tham_xet_oto_qpvt_cap_moi_dv3_"+ett.getCol2()+".jsp");
showMyForm.setParameter("col1", ett.getCol1());
showMyForm.setParameter("col2", ett.getCol2());
%>
	<a style="cursor:help" onclick="javascript:loadMyPageDv3('<%=showMyForm%>');"><%=DmDataItemLocalServiceUtil.findByGroupIdAndCode(Constants.GROUP_LOAI_HINH_HOAT_DONG, ett.getCol2()).getName() %></a>
</liferay-ui:search-container-column-text>

<liferay-ui:search-container-column-text name="Trạng thái" value="<%= LanguageUtil.get(pageContext, \"trang-thai-\"+ett.getCol3()) %>" orderable="<%= false %>" />

</liferay-ui:search-container-row>
<liferay-ui:search-iterator searchContainer="<%=searchContainer %>" />
</liferay-ui:search-container>
</div>

