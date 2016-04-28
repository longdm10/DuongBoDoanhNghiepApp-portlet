<%@page import="com.liferay.portal.kernel.dao.search.TextSearchEntry"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.model.TempDocument"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.service.TempDocumentLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="javax.portlet.PortletURL"%>
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
PortletURL dialogAttackfile = renderResponse.createRenderURL();
dialogAttackfile.setParameter("jspPage", "/html/hspttdnvaocangbien/attachfile_popup.jsp");
dialogAttackfile.setParameter("redirect", ParamUtil.getString(request, "redirect"));
dialogAttackfile.setParameter("tabs1", tabs);
dialogAttackfile.setParameter("id", itemIdTemp);

PortletURL portletUrl = renderResponse.createRenderURL();
portletUrl.setParameter("jspPage", "/html/hspttdnvaocangbien/edit_detail.jsp");
portletUrl.setParameter("redirect", ParamUtil.getString(request, "redirect"));
portletUrl.setParameter("tabs1", tabs);
portletUrl.setParameter("id", itemIdTemp);

List headerNames = new ArrayList();
headerNames.add("Số Thứ tự");
headerNames.add("Loại tờ xuất trình");
headerNames.add("Ngày cấp");
headerNames.add("Ngày hết hạn");
headerNames.add("Ngày kiểm tra định kì");
headerNames.add("Số giấy phép");
headerNames.add("Xóa");

SearchContainer searchCtn = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, ParamUtil.getInteger(renderRequest,SearchContainer.DEFAULT_DELTA_PARAM),portletUrl, headerNames, null);	
searchCtn.setEmptyResultsMessage("Không có hồ sơ vào cảng");
List results = new ArrayList();
int total = 0;
results =TempDocumentLocalServiceUtil.findByRequestCode(tempGeneral.getRequestCode(),searchCtn.getStart(), searchCtn.getEnd());
total = TempDocumentLocalServiceUtil.countByRequestCode(tempGeneral.getRequestCode());

searchCtn.setTotal(total);	
searchCtn.setResults(results);
searchCtn.setDelta(ParamUtil.getInteger(renderRequest,SearchContainer.DEFAULT_DELTA_PARAM));
//searchCtn.setRowChecker(new RowChecker(renderResponse));

List resultRows = searchCtn.getResultRows();
for (int i = 0; i < results.size(); i++) {
	StringBuilder sb =new StringBuilder();
	
	TempDocument item = (TempDocument)results.get(i);
	ResultRow row = new ResultRow(item, item.getId(), i);
	
	//STT
	TextSearchEntry rowTextEntry =  new TextSearchEntry();
	rowTextEntry.setName(String.valueOf(i+1));
	row.addText(rowTextEntry);
	
	//Loại tờ xuất trình
	rowTextEntry =(TextSearchEntry)rowTextEntry.clone();
	rowTextEntry.setName(String.valueOf(item.getDocumentTypeCode()));
	row.addText(rowTextEntry);
	
	//Ngày cấp 
	rowTextEntry =(TextSearchEntry)rowTextEntry.clone();
	rowTextEntry.setName(item.getShipDateFrom().toString());
	row.addText(rowTextEntry);
	
	//Ngày hết hạn
	rowTextEntry =(TextSearchEntry)rowTextEntry.clone();
	rowTextEntry.setName(item.getShipDateFrom().toString());
	row.addText(rowTextEntry);
	
	//Ngày kiểm tra định kì
	rowTextEntry =(TextSearchEntry)rowTextEntry.clone();
	rowTextEntry.setName((item.getShipDateLastCheck()==null) ? "" :  item.getShipDateLastCheck().toString());
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
	<a href="<%=dialogAttackfile.toString() %>"><input type="button"  value="Thêm tài liệu" style="font-size:15px;color:white;background-color:#337ab7;height:30px;width: 200px;"/></a>
</div>
<div>
	<table>
		<tr>
			<td>
				<liferay-ui:search-iterator searchContainer="<%= searchCtn %>" />
			</td>
		</tr>
	</table>
</div>