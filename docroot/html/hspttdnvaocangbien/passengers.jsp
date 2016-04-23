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
%>
<div>
	<a href="<%=dialogPassengers.toString() %>"><input type="button"  value="Thêm mới hành khách" style="font-size:15px;color:white;background-color:#337ab7;height:30px;width: 200px;"/></a>
</div>
<div>
	<table>
		<tr>
		</tr>
	</table>
</div>