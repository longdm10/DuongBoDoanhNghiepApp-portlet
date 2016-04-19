<%@page
	import="vn.dtt.duongbien.dao.vrcb.service.InterfaceRequestLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.util.PortalClassLoaderUtil"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.model.InterfaceRequest"%>
<%@page
	import="com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQuery"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclaration"%>
<%@page import="com.liferay.portal.kernel.dao.search.TextSearchEntry"%>
<%@page import="com.liferay.portal.kernel.dao.search.RowChecker"%>
<%@page
	import="vn.dtt.duongbien.dao.vrcb.service.TempGeneralDeclarationLocalServiceUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="javax.portlet.WindowState"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="java.util.Calendar"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.model.DmPortWharf"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.model.DmPortHarbour"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.model.DmPort"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.model.DmPortRegion"%>
<%@page
	import="vn.dtt.duongbien.dao.vrcb.service.DmPortWharfLocalServiceUtil"%>
<%@page
	import="vn.dtt.duongbien.dao.vrcb.service.DmPortLocalServiceUtil"%>
<%@page
	import="vn.dtt.duongbien.dao.vrcb.service.DmPortHarbourLocalServiceUtil"%>
<%@page
	import="vn.dtt.duongbien.dao.vrcb.service.DmPortRegionLocalServiceUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ include file="/html/init.jsp"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<portlet:actionURL var="deleteVaoCangBenUrl" name="deleteVaoCangBien">
</portlet:actionURL>
<script type="text/javascript">
function deleteVaoCangBien(delete_id){
	if(confirm("Bạn có chắc chắn muốn xóa hồ sơ không")){
		document.<portlet:namespace />fm.<portlet:namespace />id.value = delete_id;
		submitForm(document.<portlet:namespace />fm, '<%=deleteVaoCangBenUrl.toString()%>
	');
		}
	}
</script>
<%
	//https://mvmn.wordpress.com/2011/06/23/liferay-6-webcontent-query-dynamic/

	//DynamicQuery subQuery = DynamicQueryFactoryUtil.forClass(InterfaceRequest.class, "requestSub", PortalClassLoaderUtil.getClassLoader()).setProjection(ProjectionFactoryUtil.max("id"));
	//List listSubQuery = InterfaceRequestLocalServiceUtil.dynamicQuery(subQuery);
	//Long maxId = (Long)listSubQuery.get(0);
	//DynamicQuery query = DynamicQueryFactoryUtil.forClass(InterfaceRequest.class, "requestParent", PortalClassLoaderUtil.getClassLoader()).add(PropertyFactoryUtil.forName("id").eq(maxId));
	//query.setProjection(ProjectionFactoryUtil.property("requestCode"));
	//List listQuery = InterfaceRequestLocalServiceUtil.dynamicQuery(query);
	//for(InterfaceRequest student:journalArticles){
	//	out.println(student.getRequestCode()+"<br/>");
	//}
	//String iR = (String)listQuery.get(0);
	//test.getRequestCode();
	//System.out.println(iR);
	PortletURL portletURL = renderResponse.createRenderURL();
	portletURL.setWindowState(WindowState.MAXIMIZED);
	portletURL.setParameter("jspPage",
			"/html/hspttdnvaocangbien/view.jsp");

	PortletURL addUrl = renderResponse.createRenderURL();
	addUrl.setWindowState(WindowState.MAXIMIZED);
	addUrl.setParameter("jspPage", "/html/hspttdnvaocangbien/edit.jsp");

	PortletURL editUrl = renderResponse.createRenderURL();
	editUrl.setWindowState(WindowState.MAXIMIZED);
	editUrl.setParameter("jspPage", "/html/hspttdnvaocangbien/edit.jsp");

	List headerNames = new ArrayList();
	headerNames.add("Stt");
	headerNames.add("Tên tàu");
	//headerNames.add("Lịch sử");
	headerNames.add("Số khai báo");
	headerNames.add("Số chuyến đi");
	headerNames.add("Loại hồ sơ");
	//headerNames.add("Tên tàu");
	headerNames.add("Cảng đến");
	headerNames.add("Thời gian đến");
	//headerNames.add("Ngày tạo");
	//headerNames.add("Người tạo");
	headerNames.add("Cảng vụ HH");
	//headerNames.add("Thông báo");
	//headerNames.add("Gửi hồ sơ");
	//headerNames.add("Yêu cầu sửa đổi");
	//headerNames.add("Xem giấy phép");
	headerNames.add("Trạng thái");
	headerNames.add("Sửa");
	headerNames.add("Hủy");

	SearchContainer searchCtn = new SearchContainer(renderRequest,
			null, null, SearchContainer.DEFAULT_CUR_PARAM,
			ParamUtil.getInteger(renderRequest,
					SearchContainer.DEFAULT_DELTA_PARAM), portletURL,
			headerNames, null);
	searchCtn.setEmptyResultsMessage("Không có hồ sơ vào cảng");
	List results = new ArrayList();
	int total = 0;
	results = TempGeneralDeclarationLocalServiceUtil
			.getTempGeneralDeclarations(searchCtn.getStart(),
					searchCtn.getEnd());
	total = TempGeneralDeclarationLocalServiceUtil
			.getTempGeneralDeclarationsCount();

	searchCtn.setTotal(total);
	searchCtn.setResults(results);
	searchCtn.setDelta(ParamUtil.getInteger(renderRequest,
			SearchContainer.DEFAULT_DELTA_PARAM));
	//searchCtn.setRowChecker(new RowChecker(renderResponse));

	List resultRows = searchCtn.getResultRows();
	for (int i = 0; i < results.size(); i++) {
		StringBuilder sb = new StringBuilder();

		TempGeneralDeclaration item = (TempGeneralDeclaration) results
				.get(i);
		ResultRow row = new ResultRow(item, item.getId(), i);

		//STT
		TextSearchEntry rowTextEntry = new TextSearchEntry();
		rowTextEntry.setName(String.valueOf(i + 1));
		row.addText(rowTextEntry);

		//Ten tau
		rowTextEntry = (TextSearchEntry) rowTextEntry.clone();
		rowTextEntry.setName(String.valueOf(item.getNameOfShip()));
		row.addText(rowTextEntry);

// 		//link history
// 		rowTextEntry = (TextSearchEntry) rowTextEntry.clone();
// 		PortletURL historyUrl = renderResponse.createRenderURL();
// 		historyUrl.setWindowState(WindowState.MAXIMIZED);
// 		historyUrl.setParameter("jspPage",
// 				"/html/hspttdnvaocangbien/history.jsp");
// 		historyUrl.setParameter("redirect", currentURL);
// 		sb.append("<a href=\"" + historyUrl.toString() + "\">test</a>");
// 		rowTextEntry.setName(sb.toString());
// 		row.addText(rowTextEntry);

		//so khai bao
		rowTextEntry = (TextSearchEntry) rowTextEntry.clone();
		rowTextEntry.setName(String.valueOf(item.getDocumentName()));
		row.addText(rowTextEntry);

		//so chuyen di
		rowTextEntry = (TextSearchEntry) rowTextEntry.clone();
		rowTextEntry.setName(item.getVoyageNumber());
		row.addText(rowTextEntry);

		//loai ho so
		rowTextEntry = (TextSearchEntry) rowTextEntry.clone();
		if (item.getIsArrival() == 1)
			rowTextEntry.setName("Vào cảng");
		else
			rowTextEntry.setName("Ra cảng");
		row.addText(rowTextEntry);

// 		//ten tau
// 		rowTextEntry = (TextSearchEntry) rowTextEntry.clone();
// 		rowTextEntry.setName(item.getNameOfShip());
// 		row.addText(rowTextEntry);

		//cang den
		rowTextEntry = (TextSearchEntry) rowTextEntry.clone();
		rowTextEntry.setName(((DmPort) DmPortLocalServiceUtil
				.findByPortCode(item.getPortOfArrivalCode()).get(0))
				.getPortName());
		row.addText(rowTextEntry);

		//thoi gian den
		rowTextEntry = (TextSearchEntry) rowTextEntry.clone();
		rowTextEntry.setName(String.valueOf(item.getDateOfArrival()));
		row.addText(rowTextEntry);

// 		//ngay tao
// 		rowTextEntry = (TextSearchEntry) rowTextEntry.clone();
// 		rowTextEntry.setName("");
// 		row.addText(rowTextEntry);

// 		//nguoi tao
// 		rowTextEntry = (TextSearchEntry) rowTextEntry.clone();
// 		rowTextEntry.setName(item.getUserCreated());
// 		row.addText(rowTextEntry);

		//cang vu hang hai
		rowTextEntry = (TextSearchEntry) rowTextEntry.clone();
		rowTextEntry.setName("");
		row.addText(rowTextEntry);

// 		//thong bao
// 		rowTextEntry = (TextSearchEntry) rowTextEntry.clone();
// 		rowTextEntry.setName("");
// 		row.addText(rowTextEntry);

// 		//gui ho so
// 		rowTextEntry = (TextSearchEntry) rowTextEntry.clone();
// 		rowTextEntry.setName("");
// 		row.addText(rowTextEntry);

// 		//yeu cau sua doi
// 		rowTextEntry = (TextSearchEntry) rowTextEntry.clone();
// 		rowTextEntry.setName("");
// 		row.addText(rowTextEntry);

// 		//xem giay phep
// 		rowTextEntry = (TextSearchEntry) rowTextEntry.clone();
// 		PortletURL certificateUrl = renderResponse.createRenderURL();
// 		certificateUrl.setWindowState(WindowState.MAXIMIZED);
// 		certificateUrl.setParameter("jspPage",
// 				"/html/hspttdnvaocangbien/certificate.jsp");
// 		certificateUrl.setParameter("redirect", currentURL);
// 		sb = new StringBuilder();
// 		sb.append("<a href=\"" + certificateUrl.toString()
// 				+ "\">link</a>");
// 		rowTextEntry.setName(sb.toString());
// 		row.addText(rowTextEntry);

		//Trạng thái
		rowTextEntry = (TextSearchEntry) rowTextEntry.clone();
		rowTextEntry.setName("");
		row.addText(rowTextEntry);
		
		//sua chi tiet
		rowTextEntry = (TextSearchEntry) rowTextEntry.clone();
		PortletURL editDetailUrl = renderResponse.createRenderURL();
		editDetailUrl.setWindowState(WindowState.MAXIMIZED);
		editDetailUrl.setParameter("jspPage",
				"/html/hspttdnvaocangbien/edit.jsp");
		editDetailUrl.setParameter("redirect", currentURL);
		editDetailUrl.setParameter("id", String.valueOf(item.getId()));
		sb = new StringBuilder();
		sb.append("<a href=\"" + editDetailUrl.toString()
				+ "\">Sửa</a>");
		rowTextEntry.setName(sb.toString());
		row.addText(rowTextEntry);

		//huy
		rowTextEntry = (TextSearchEntry) rowTextEntry.clone();
		sb = new StringBuilder();
		PortletURL deletelUrl = renderResponse.createActionURL();
		deletelUrl.setWindowState(WindowState.MAXIMIZED);
		deletelUrl.setParameter("javax.portlet.action",
				"deleteVaoCangBien");
		deletelUrl.setParameter("redirect", currentURL);
		deletelUrl.setParameter("id", String.valueOf(item.getId()));
		sb.append("<a href='javascript:void(0)' onclick='deleteVaoCangBien("
				+ item.getId() + ")'>Xóa</a>");
		rowTextEntry.setName(sb.toString());
		row.addText(rowTextEntry);

		//template
		//rowTextEntry =(TextSearchEntry)rowTextEntry.clone();
		//rowTextEntry.setName("");
		//row.addText(rowTextEntry);

		resultRows.add(row);
	}
%>

<form action="<%=portletURL.toString()%>" method="post"
	name="<portlet:namespace />fm">

	<!--<input type="hidden" name="<portlet:namespace />id" value="" /> <input
		type="button" value="Thêm mới hồ sơ"
		onclick="javascript:document.location='<%=addUrl.toString()%>'"
		style="font-size: 15px; color: white; background-color: #337ab7; height: 40px; width: 150px;" />-->
	<!--<input type="button" value="Thêm mới chi tiết hồ sơ" onclick="javascript:document.location='<%=addUrl.toString()%>'" style="font-size:15px;color:white;background-color:#337ab7;height:40px;width: 150px;"/> -->
	<liferay-ui:search-iterator searchContainer="<%=searchCtn%>" />
	<!--<input type="button" value="Thêm mới hồ sơ"
		onclick="javascript:document.location='<%=addUrl.toString()%>'"
		style="font-size: 15px; color: white; background-color: #337ab7; height: 40px; width: 150px;" />-->

</form>
