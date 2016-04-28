<%@page import="java.util.List"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.service.DmDocTypeLocalServiceUtil"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.model.DmDocType"%>
<%@page import="java.util.Calendar"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.service.TempGeneralDeclarationLocalServiceUtil"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclaration"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.model.impl.TempGeneralDeclarationImpl"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:defineObjects />
<liferay-theme:defineObjects />
<%
String itemIdTemp = ParamUtil.getString(request, "id");
String tabsBack = ParamUtil.getString(request,"tabs1");
TempGeneralDeclaration tempGeneral = new TempGeneralDeclarationImpl();
if(!itemIdTemp.equals("")){
	tempGeneral = TempGeneralDeclarationLocalServiceUtil.getTempGeneralDeclaration(Long.valueOf(itemIdTemp));
}
PortletURL backAttachfileUrl = renderResponse.createRenderURL();
backAttachfileUrl.setParameter("jspPage", "/html/hspttdnvaocangbien/edit_detail.jsp");
backAttachfileUrl.setParameter("tabs1", tabsBack);
backAttachfileUrl.setParameter("id", itemIdTemp);

Calendar today = Calendar.getInstance();
List<DmDocType> listDocType = DmDocTypeLocalServiceUtil.getALlDocType();

%>
<portlet:actionURL var="updateAttachfileUrl" name="updateAttachfile">
</portlet:actionURL>
<aui:form method="post" action="<%=updateAttachfileUrl.toString() %>">
<div>
	<aui:input name="redirect" value="<%=backAttachfileUrl.toString() %>" type="hidden"></aui:input>
	<aui:input name="id" type="hidden" value="<%=itemIdTemp %>"></aui:input>
	<aui:select name="documentTypeCode" label="Chức danh">
			<%for (DmDocType docType : listDocType ){%>
				<aui:option value="<%=docType.getDocumentTypeCode() %>"><%=docType.getDocumentTypeName() %></aui:option>
			<%}%>
	</aui:select>
	<aui:field-wrapper label="Ngày cấp">
		<liferay-ui:input-date name="shipDateFrom"
						disableNamespace="<%=false%>" disabled="false"
						dayValue="<%=today.get(Calendar.DAY_OF_MONTH)%>" dayParam="dobDay"
						monthValue="<%=today.get(Calendar.MONTH)%>" monthParam="dobMonth"
						yearValue="<%=today.get(Calendar.YEAR)%>" yearParam="dobYear" />
	</aui:field-wrapper>
	<aui:field-wrapper label="Ngày hết hạn">
		<liferay-ui:input-date name="shipDateTo"
						disableNamespace="<%=false%>" disabled="false"
						dayValue="<%=today.get(Calendar.DAY_OF_MONTH)%>" dayParam="dobDay"
						monthValue="<%=today.get(Calendar.MONTH)%>" monthParam="dobMonth"
						yearValue="<%=today.get(Calendar.YEAR)%>" yearParam="dobYear" />
	</aui:field-wrapper>
	<aui:field-wrapper label="Ngày kiểm tra định kì gần nhất">
		<liferay-ui:input-date name="shipDateLastCheck"
						disableNamespace="<%=false%>" disabled="false"
						dayValue="<%=today.get(Calendar.DAY_OF_MONTH)%>" dayParam="dobDay"
						monthValue="<%=today.get(Calendar.MONTH)%>" monthParam="dobMonth"
						yearValue="<%=today.get(Calendar.YEAR)%>" yearParam="dobYear" />
	</aui:field-wrapper>
	<aui:input name="" label="Số giấy phép" type="text"></aui:input>
</div>
<div style="text-align: center;">
  	<input type="submit"  value="Thêm tài liệu" style="font-size:15px;color:white;background-color:#337ab7;height:30px;width: 150px;"/>
  	<a href="<%=backAttachfileUrl.toString()%>"><input type="button"  value="Bỏ qua" style="font-size:15px;color:white;background-color:#337ab7;height:30px;width: 150px;"/></a> 
 </div>
 </aui:form>