<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>

<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>

<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="javax.portlet.PortletPreferences"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.servlet.SessionMessages"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="javax.portlet.PortletPreferences"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>

<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<script type="text/javascript">
	var imageFilesPath = '<%=request.getContextPath()%>'+"/img/";
	
	$(document).ready(function(){ if($('.textAreaAutosize').length > 0){$('.textAreaAutosize').autosize(); }});

	$(document).on('change', '.upFile :file', function() {
		var input = $(this);
		var numFiles = input.get(0).files ? input.get(0).files.length : 1;
		var label = input.val().replace(/\\/g, '/').replace(/.*\//, '');
		input.trigger('fileselect', [numFiles, label]);
	});

	$(document).ready( function() {
		$('.upFile :file').on('fileselect', function(event, numFiles, label) {
			var input = $(this).parents('.boxUpFile').find(':text');
			var log = numFiles > 1 ? numFiles + ' files selected' : label;
			if ( input.length ) {
				input.val(log);
			} else {
				if( log ) alert(log);
			}
		});
	});
</script>

