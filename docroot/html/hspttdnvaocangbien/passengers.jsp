<%@page import="javax.portlet.WindowState"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.service.TempPassengerDetailsLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.dao.search.TextSearchEntry"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.service.TempCrewDetailsLocalServiceUtil"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.model.TempPassengerDetails"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.service.TempGeneralDeclarationLocalServiceUtil"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.model.impl.TempGeneralDeclarationImpl"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclaration"%>
<%
String itemIdTemp = ParamUtil.getString(request, "id");
String tabs = ParamUtil.getString(request,"tabs1");
TempGeneralDeclaration tempGeneral = new TempGeneralDeclarationImpl();
if(!itemIdTemp.equals("")){
	tempGeneral = TempGeneralDeclarationLocalServiceUtil.getTempGeneralDeclaration(Long.valueOf(itemIdTemp));
}
PortletURL dialogPassengers = renderResponse.createRenderURL();
dialogPassengers.setParameter("jspPage", "/html/hspttdnvaocangbien/passengers_popup.jsp");
dialogPassengers.setParameter("redirect", ParamUtil.getString(request, "redirect"));
dialogPassengers.setParameter("tabs1", tabs);
dialogPassengers.setParameter("id", itemIdTemp);

PortletURL portletUrl = renderResponse.createRenderURL();
portletUrl.setParameter("jspPage", "/html/hspttdnvaocangbien/edit_detail.jsp");
portletUrl.setParameter("redirect", ParamUtil.getString(request, "redirect"));
portletUrl.setParameter("tabs1", tabs);
portletUrl.setParameter("id", itemIdTemp);

List headerNames = new ArrayList();
headerNames.add("Số Thứ tự");
headerNames.add("Họ");
headerNames.add("Tên");
headerNames.add("Ngày sinh");
headerNames.add("Nơi sinh");
headerNames.add("Số hộ chiếu");
headerNames.add("Xóa");

SearchContainer searchCtn = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, ParamUtil.getInteger(renderRequest,SearchContainer.DEFAULT_DELTA_PARAM),portletUrl, headerNames, null);	
searchCtn.setEmptyResultsMessage("Không có hành khách");
List results = new ArrayList();
int total = 0;
results =TempPassengerDetailsLocalServiceUtil.findByRequestCode(tempGeneral.getRequestCode(),searchCtn.getStart(), searchCtn.getEnd());
total = TempPassengerDetailsLocalServiceUtil.countByRequestCode(tempGeneral.getRequestCode());

searchCtn.setTotal(total);	
searchCtn.setResults(results);
searchCtn.setDelta(ParamUtil.getInteger(renderRequest,SearchContainer.DEFAULT_DELTA_PARAM));
//searchCtn.setRowChecker(new RowChecker(renderResponse));

List resultRows = searchCtn.getResultRows();
DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
for (int i = 0; i < results.size(); i++) {
	StringBuilder sb =new StringBuilder();
	
	TempPassengerDetails item = (TempPassengerDetails)results.get(i);
	ResultRow row = new ResultRow(item, item.getId(), i);
	
	//STT
	TextSearchEntry rowTextEntry =  new TextSearchEntry();
	rowTextEntry.setName(String.valueOf(i+1));
	row.addText(rowTextEntry);
	
	//Họ 
	rowTextEntry =(TextSearchEntry)rowTextEntry.clone();
	rowTextEntry.setName(String.valueOf(item.getFamilyName()));
	row.addText(rowTextEntry);
	
	//Tên 
	rowTextEntry =(TextSearchEntry)rowTextEntry.clone();
	rowTextEntry.setName(String.valueOf(item.getGivenName()));
	row.addText(rowTextEntry);
	
	//Ngày sinh
	rowTextEntry =(TextSearchEntry)rowTextEntry.clone();
	rowTextEntry.setName(dateFormat.format(item.getBirthDay()));
	row.addText(rowTextEntry);
	
	//Nơi sinh
	rowTextEntry =(TextSearchEntry)rowTextEntry.clone();
	rowTextEntry.setName(item.getBirthPlace());
	row.addText(rowTextEntry);
	
	//Số hộ chiếu
	rowTextEntry =(TextSearchEntry)rowTextEntry.clone();
	rowTextEntry.setName(item.getSerialNumberOfIdentity());
	row.addText(rowTextEntry);
		
	//huy
	rowTextEntry =(TextSearchEntry)rowTextEntry.clone();
	sb = new StringBuilder();
	PortletURL deletelUrl = renderResponse.createActionURL();
	deletelUrl.setWindowState(WindowState.MAXIMIZED);
	deletelUrl.setParameter("javax.portlet.action", "deleteVaoCangBien");
	deletelUrl.setParameter("redirect", ParamUtil.getString(request, "redirect"));
	deletelUrl.setParameter("id",String.valueOf(item.getId()));
	sb.append("<a href='javascript:void(0)' onclick='deleteVaoCangBien(" + item.getId() + ")'>Xóa</a>");
	rowTextEntry.setName(sb.toString());
	row.addText(rowTextEntry);
	
	//template
	//rowTextEntry =(TextSearchEntry)rowTextEntry.clone();
	//rowTextEntry.setName("");
	//row.addText(rowTextEntry);
	
	resultRows.add(row);
}
%>
<div>
	<a href="<%=dialogPassengers.toString() %>"><input type="button"  value="Thêm mới hành khách" style="font-size:15px;color:white;background-color:#337ab7;height:30px;width: 200px;"/></a>
</div>
<div>
	<table>
		<tr>
			<td><liferay-ui:search-iterator searchContainer="<%= searchCtn %>" /></td>
		</tr>
	</table>
</div>