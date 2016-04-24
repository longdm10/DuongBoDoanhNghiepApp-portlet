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
%>
<div>
	<a href="<%=dialogAttackfile.toString() %>"><input type="button"  value="Thêm tài liệu" style="font-size:15px;color:white;background-color:#337ab7;height:30px;width: 200px;"/></a>
</div>
<div>
	<table>
		<tr>
		</tr>
	</table>
</div>