
<%@page import="vn.dtt.duongbo.dao.motcua.service.OEPUserMgtEmployeeLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.duongbo.dao.motcua.service.MotCuaQuyTrinhThuTucTTHCLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.motcua.service.MotCuaQuyTrinhThuTucTTHCLocalService"%>
<%@page import="vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinh"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"
	language="java"%>
<%@ include file="/html/init.jsp"%>

<%
	String workingUnitId = ParamUtil.getString(request, "workingUnitId");
	List<OEPUserMgtEmployee> listEmployee = new ArrayList<OEPUserMgtEmployee>();
	if(Validator.isNotNull(workingUnitId)){
		listEmployee = OEPUserMgtEmployeeLocalServiceUtil.getEmployeeByWorkingUnitId(Long.valueOf(workingUnitId));
	}
	String requiredLabel = "";
	requiredLabel = "(*)";
	String dotLabel = ":";
%>
<select class="form-control" id="empId" name="empId">
	<%
		if (listEmployee != null && listEmployee.size() > 0) {
			for (OEPUserMgtEmployee ett : listEmployee) {
	%>
	<option value="<%=ett.getEmployeeId()%>" ><%=ett.getFullName()%></option>
	<%
		}
		}
	%>
</select>




