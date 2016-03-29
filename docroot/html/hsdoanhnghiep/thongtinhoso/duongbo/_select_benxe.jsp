<%@page import="vn.dtt.duongbo.business.DanhMucConstants"%>
<%@page import="vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinh"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ include file="/html/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>

<%
	String codeTinhTP = ParamUtil.getString(request, "codeTinhThanhPho");
	String codeDmConstantBenXe = ParamUtil.getString(request, "danhMucConstantBenXe");
	
	List<DmDataItem> allBenXe = DmDataItemLocalServiceUtil.findByGroupCodeAndNode1(codeDmConstantBenXe, codeTinhTP);
	
	String requiredLabel = "";
	requiredLabel = "(*)";
	String dotLabel = ":";
%>

<option value="">-- Chọn bến --</option>
<%
if (allBenXe != null && allBenXe.size() > 0) {
	for (DmDataItem item : allBenXe) {
		%>
		<option value="<%=item.getCode()%>"><%=item.getName()%></option>
		<%
	}
}
%>
