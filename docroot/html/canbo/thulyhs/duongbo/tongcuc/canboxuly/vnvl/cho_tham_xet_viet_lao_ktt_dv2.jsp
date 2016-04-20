<%@page import="vn.dtt.duongbo.dao.quocte.service.QlvtXuLyKTTQuocTePhuongTienLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien"%>
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

int xuLyPhuHieuId = ParamUtil.getInteger(request, "xuLyPhuHieuId");
String idQuyTrinhThuTuc = ParamUtil.getString(request, Constants.ID_QUY_TRINH_THU_TUC);
String phieuXuLyId = ParamUtil.getString(request, Constants.ID_PHIEU_XU_LY);
String tq2 = ParamUtil.getString(request, "tq2");
PortletURL showMyForm = renderResponse.createRenderURL();
showMyForm.setWindowState(LiferayWindowState.EXCLUSIVE);

showMyForm.setParameter("xuLyPhuHieuId",xuLyPhuHieuId+"");
showMyForm.setParameter(Constants.ID_PHIEU_XU_LY,phieuXuLyId);
List<QlvtXuLyKTTQuocTePhuongTien> listBase = QlvtXuLyKTTQuocTePhuongTienLocalServiceUtil.findBycapPhepKTTQuocTeID(xuLyPhuHieuId);
%>

<div id="dv2">
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

for(QlvtXuLyKTTQuocTePhuongTien ett: listBase){
	resultsQLVTListDV2.add(ipk, new QLVTListDV2(ett.getId()+"",ett.getBienSo(),ett.getKetQuaXuLy(),StringPool.BLANK,StringPool.BLANK,StringPool.BLANK));
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

showMyForm.setParameter("mvcPath", "/html/canbo/thulyhs/duongbo/tongcuc/canboxuly/vnvl/cho_tham_xet_viet_lao_ktt_dv3_"+tq2+".jsp");
showMyForm.setParameter("col1", ett.getCol1());
showMyForm.setParameter("col2", ett.getCol2());
showMyForm.setParameter("tq2", tq2+"");
showMyForm.setParameter(Constants.ID_PHIEU_XU_LY, phieuXuLyId+"");
showMyForm.setParameter(Constants.ID_QUY_TRINH_THU_TUC, idQuyTrinhThuTuc);
%>
	<a href="#<%= String.valueOf(searchContainer.getDelta()*(searchContainer.getCur()-1) +index + 1) %>" onclick="javascript:loadMyPageDv3('<%=showMyForm%>');"><%= ett.getCol2() %></a>
	<a name="<%= String.valueOf(searchContainer.getDelta()*(searchContainer.getCur()-1) +index + 1) %>"/>
</liferay-ui:search-container-column-text>

<liferay-ui:search-container-column-text name="Trạng thái" value="<%= LanguageUtil.get(pageContext, \"trang-thai-\"+ett.getCol3()) %>" orderable="<%= false %>" />

</liferay-ui:search-container-row>
<liferay-ui:search-iterator searchContainer="<%=searchContainer %>" />
</liferay-ui:search-container>
</div>

