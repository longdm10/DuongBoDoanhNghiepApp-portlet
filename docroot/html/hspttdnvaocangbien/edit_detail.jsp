<%@page import="javax.portlet.WindowState"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="java.util.Calendar"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.model.DmPortWharf"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.model.DmPortHarbour"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.model.DmPort"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.model.DmPortRegion"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.service.DmPortWharfLocalServiceUtil"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.service.DmPortLocalServiceUtil"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.service.DmPortHarbourLocalServiceUtil"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.service.DmPortRegionLocalServiceUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ include file="/html/init.jsp"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<script type="text/javascript">
	function isNumberKey(evt){
	var charCode = (evt.which) ? evt.which : event.keyCode
	if (charCode > 31 && (charCode < 48 || charCode > 57))
		return false;
	return true;
	}
</script>
<%
String tabs1 = ParamUtil.getString(request, "tabs1", "info");
PortletURL portletURL = renderResponse.createRenderURL();
portletURL.setWindowState(WindowState.MAXIMIZED);
portletURL.setParameter("jspPage", "/html/hspttdnvaocangbien/edit_detail.jsp");
portletURL.setParameter("tabs1", tabs1);

String tabsNames = "info1,general,crew,passengers,permission,attachfile";
String tabsValues = "Thông báo11,Thông tin chung12,crew,passengers,permission,attachfile";
%>
<form action="<%= portletURL.toString() %>" method="post" name="<portlet:namespace />fm">
<table width="100%">
	<tr>
		<td>
			<liferay-ui:tabs names="<%= tabsNames %>" url="<%= portletURL.toString() %>" tabsValues="tabsValues">
				<liferay-ui:section>
		        	<%@ include file="/html/hspttdnvaocangbien/info.jsp" %>	
			    </liferay-ui:section>
			    <liferay-ui:section>
			        <%@ include file="/html/hspttdnvaocangbien/general.jsp" %>	
			    </liferay-ui:section>
			    <liferay-ui:section>
			        <%@ include file="/html/hspttdnvaocangbien/crew.jsp" %>
			    </liferay-ui:section>
			     <liferay-ui:section>
			        <%@ include file="/html/hspttdnvaocangbien/passengers.jsp" %>
			    </liferay-ui:section>
			     <liferay-ui:section>
			        <%@ include file="/html/hspttdnvaocangbien/permission.jsp" %>
			    </liferay-ui:section>
			     <liferay-ui:section>
			        <%@ include file="/html/hspttdnvaocangbien/attachfile.jsp" %>
			    </liferay-ui:section>
			</liferay-ui:tabs>
		</td>
	</tr>
</table>
</form>
