
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
	String codeLinhVucTthc = ParamUtil.getString(request, "codeLinhVucTthc");
	List<TthcThuTucHanhChinh> allThuTucHanhChinh = new ArrayList<TthcThuTucHanhChinh>();
	List<MotCuaQuyTrinhThuTucTTHC> listBase = new ArrayList<MotCuaQuyTrinhThuTucTTHC>();
	if(Validator.isNotNull(codeLinhVucTthc)){
		listBase = MotCuaQuyTrinhThuTucTTHCLocalServiceUtil.findByQuyTrinhThuTucId(Long.valueOf(codeLinhVucTthc));
	}
	int i = 0;
	for(MotCuaQuyTrinhThuTucTTHC ett: listBase){
		TthcThuTucHanhChinh ettTTHC = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(ett.getThuTucHanhChinhID());
		allThuTucHanhChinh.add(i, ettTTHC);
		i++;
	}
	String thuTucHanhChinhId = ParamUtil.getString(request, "selTenThuTuc");
	String requiredLabel = "";
	requiredLabel = "(*)";
	String dotLabel = ":";
%>
<select class="form-control" id="selTenThuTuc" name="selTenThuTuc">
	<option value="">------------ Chọn tất cả các Thủ tục
		-----------------</option>
	<%
		if (allThuTucHanhChinh != null && allThuTucHanhChinh.size() > 0) {
			for (TthcThuTucHanhChinh item : allThuTucHanhChinh) {
	%>
	<option value="<%=item.getId()%>"
		<%=(item.getId() == ((thuTucHanhChinhId.trim()
							.length() > 0) ? Long.parseLong(thuTucHanhChinhId)
							: 0)) ? "selected='selected'" : ""%>><%=item.getTenThuTuc()%></option>
	<%
		}
		}
	%>
</select>




