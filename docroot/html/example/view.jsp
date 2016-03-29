<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.duongbo.dao.motcua.service.OEPUserMgtWorkingUnitLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
%>

<%@ include file="/html/init.jsp"%>

<%
List<OEPUserMgtWorkingUnit> listPB = new ArrayList<OEPUserMgtWorkingUnit>();
listPB = OEPUserMgtWorkingUnitLocalServiceUtil.getWorkingUnitByTTHCId(Long.valueOf(55));
%>
<portlet:renderURL var="onpageError">
	<portlet:param name="mvcPath" value="/html/example/view.jsp" />
</portlet:renderURL>

<portlet:renderURL var="onpageSuccess">
	<portlet:param name="mvcPath" value="/html/example/view.jsp" />
</portlet:renderURL>

<portlet:renderURL var="selectTenTTHC" windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>">
	<portlet:param name="mvcPath" value="/html/example/_select_employee.jsp" />
</portlet:renderURL>
<portlet:actionURL var="addItemURL" name="addItemAjaxCall" />
<portlet:actionURL var="addItemURLTransactionURL" name="addItemURLTransaction" />
<span id="group-error-block"></span>
<aui:form method="POST" action="#" name="addItemForm" id="addItemForm">
	<aui:input type="text" name="itemName"></aui:input>
	<select class="form-control" id="workingUnitId" name="workingUnitId">
		<%for(OEPUserMgtWorkingUnit ett: listPB){ %>
		<option value="<%=ett.getWorkingUnitId() %>"><%=ett.getName() %></option>
		<%} %>
	</select>
	<div id="cbxTenEmp" class="col-sm-10">
		<select class="form-control" id="empId" name="empId">
		</select>
	</div>
	<aui:button value="Add Item" onClick="submitItemForm();"></aui:button>
	<aui:button value="Transaction button no redirect" type="submit" onClick="TransactionAction();"></aui:button>
</aui:form>

<aui:script use="aui-io-request,aui-node">
var A = AUI();
Liferay.provide(window, 'TransactionAction', function(action) {
     A.one('#<portlet:namespace/>addItemForm').set('action','<%=addItemURLTransactionURL.toString()%>');

});
	Liferay.provide(window,'submitItemForm',
		function() {
		var A = AUI();
		var errorBlock=A.one('#group-error-block');
		A.io.request('<%=addItemURL %>',{
			method: 'POST',
			form: { id: '<portlet:namespace />addItemForm' },
			on: {
					success: function(){
  					alert("success " + this.get('responseData'));
  					errorBlock.set("innerHTML","");
  					var errorMessageNode = A.Node.create('<div class="portlet-msg-error">No group exist with this name.</div>');
					errorMessageNode.appendTo(errorBlock);
					}
			}
		});
	});
  AUI().ready(function(A){
		var capTinhInput = $("select#workingUnitId");

		capTinhInput.on('change', function(){
			var workingUnitId = capTinhInput.val();
			selectTTHC(workingUnitId);
		});
	});

	function selectTTHC(workingUnitId){
		AUI().use('aui-base','aui-io-request', function(A){

			//aui ajax call to get updated content
			A.io.request('<%= selectTenTTHC %>',
			{
				dataType: 'text/html',
				method: 'GET',
				data: { 
					"<portlet:namespace />workingUnitId": workingUnitId
				},
				on: {
					success: function() {
						var optHuyen = A.one("#cbxTenEmp");
						optHuyen.set("innerHTML", this.get('responseData'));
					} 
				}
			});
		});	
	}
</aui:script>
<%!
	private static Log _log = LogFactoryUtil.getLog("html.example.view.jsp");
%>