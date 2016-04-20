<%@page import="java.util.Date"%>
<%@page import="vn.dtt.duongbo.utils.format.FormatData"%>
<%@page import="vn.dtt.duongbo.dao.motcua.service.MotCuaQuyTrinhThuTucTTHCLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC"%>
<%@page import="vn.dtt.duongbo.dao.motcua.service.MotCuaQuyTrinhThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.motcua.service.MotCuaQuyTrinhThuTucLocalService"%>
<%@page import="vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTuc"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="vn.dtt.duongbo.utils.DanhMucKey"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@page import="vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinh"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>

<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>


<%@ include file="/html/init.jsp"%>

<%
	String codeLinhVucTthc = ParamUtil.getString(request, "selLoaiThuTuc");
	String thuTucHanhChinhId = ParamUtil.getString(request, "selTenThuTuc");
	String testSoHoSo = ParamUtil.getString(request,"textSoHoSo");
	String dateNgayNopHoSoTuNgay = ParamUtil.getString(request, "dateNgayNopHoSoTuNgay");
	String dateNgayNopHoSoDenNgay = ParamUtil.getString(request, "dateNgayNopHoSoDenNgay");
	String textDoanhNghiep = ParamUtil.getString(request, "textDoanhNghiep");
	String namTxT = ParamUtil.getString(request, "namTxT");
	
	List<TthcThuTucHanhChinh> allThuTucHanhChinh = new ArrayList<TthcThuTucHanhChinh>();
	List<MotCuaQuyTrinhThuTucTTHC> listBase = new ArrayList<MotCuaQuyTrinhThuTucTTHC>();
	if(Validator.isNotNull(codeLinhVucTthc)){
		listBase = MotCuaQuyTrinhThuTucTTHCLocalServiceUtil.findByQuyTrinhThuTucId(Long.valueOf(codeLinhVucTthc));
	}
	if (namTxT == null || namTxT.trim().length() == 0) {
		namTxT = FormatData.getYear(new Date());
	}
	int i = 0;
	for(MotCuaQuyTrinhThuTucTTHC ett: listBase){
		TthcThuTucHanhChinh ettTTHC = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(ett.getThuTucHanhChinhID());
		allThuTucHanhChinh.add(i, ettTTHC);
		i++;
	}
	List<MotCuaQuyTrinhThuTuc> listMotCuaQuyTrinhTthc = MotCuaQuyTrinhThuTucLocalServiceUtil.getMotCuaQuyTrinhThuTucs(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
%>

<!-- /html/canbo/search_content_find.jsp -->
<div class="col-xs-12 form-group">
	<label class="col-xs-2" for="sel1">Nhóm thủ tục:</label>
	<div class="col-xs-10">
		<select class="form-control" id="selLoaiThuTuc" name="selLoaiThuTuc">
			<option value="">------------ Chọn tất cả các nhóm thủ tục
				------------</option>
			<%if(listMotCuaQuyTrinhTthc != null && listMotCuaQuyTrinhTthc.size() > 0){
				for (MotCuaQuyTrinhThuTuc item : listMotCuaQuyTrinhTthc) {
			%>
			<option value="<%=item.getId()%>"
				<%=String.valueOf(item.getId()).equals(codeLinhVucTthc) ? "selected='selected'" : ""%>><%=item.getTenQuyTrinh()%></option>
			<%
				}}
			%>
		</select>
	</div>
</div>
	
<div class="col-xs-12 form-group">
	<label class="col-xs-2" for="sel1">Tên thủ tục:</label>
	<div id="cbxTenTTHC" class="col-xs-10">
		<select class="form-control" id="selTenThuTuc" name="selTenThuTuc">
			<option value="">------------ Chọn tất cả các Thủ tục -----------------</option>
			<%
			if (allThuTucHanhChinh != null && allThuTucHanhChinh.size() > 0) {
				for (TthcThuTucHanhChinh item : allThuTucHanhChinh) {
				%>
				<option value="<%=item.getId()%>"
					<%=(item.getId() == ((thuTucHanhChinhId.trim().length() > 0) ? Long.parseLong(thuTucHanhChinhId) : 0)) ? "selected='selected'" : ""%>><%=item.getTenThuTuc()%></option>
				<%
				}
			}
			%>
		</select>
	</div>
</div>

	<div class="col-xs-offset-2 col-xs-10 form-group">
		<div class="row">
			<div class="col-xs-4">
				<label class="col-xs-4" for="sel1" style="padding-right: 0px;" >Ngày nộp:</label>
				<div class="col-xs-8 input-group">
					<input class="form-control"
						style="width: 100%; float: left; height: 28px; box-sizing: border-box"
						type="text" value="<%=dateNgayNopHoSoTuNgay%>"
						id="dateNgayNopHoSoTuNgay" name="dateNgayNopHoSoTuNgay"
						onclick="gtCalendar('dateNgayNopHoSoTuNgay')"> 
						<span onclick="gtCalendar('dateNgayNopHoSoTuNgay')"
						class="input-group-addon"><img
						style="border-left: 1px solid #a9a9a9; cursor: pointer; float: right; height: 15px; padding: 5px; position: absolute; z-index: 1;"
						src="<%=request.getContextPath()%>/img/date.png"
						><i class="fa fa-calendar"></i></span>
				</div>
			</div>
			<div class="col-xs-4">
				<label class="col-xs-4" for="sel1" style="padding-right: 0px;" >Đến ngày:</label>
				<div class="col-xs-8 input-group">
					<input class="form-control"
						style="width: 100%; float: left; height: 28px; box-sizing: border-box"
						type="text" value="<%=dateNgayNopHoSoDenNgay%>"
						id="dateNgayNopHoSoDenNgay" name="dateNgayNopHoSoDenNgay"
						onclick="gtCalendar('dateNgayNopHoSoDenNgay')"> 
						<span onclick="gtCalendar('dateNgayNopHoSoDenNgay')" class="input-group-addon">
							<img style="border-left: 1px solid #a9a9a9; cursor: pointer; float: right; height: 15px; padding: 5px; position: absolute; z-index: 1;"
								src="<%=request.getContextPath()%>/img/date.png" >
							<i class="fa fa-calendar"></i>
						</span>
				</div>
			</div>
			<div class="col-xs-4">
				<label class="col-xs-4" for="sel1">Năm:</label>
				<div class="col-xs-8">
					<select id="namTxT" class="form-control">
						<%
						for (int i1 = 1; i1 <= 10; i1++) {
							 if (String.valueOf(i1 + 2014).compareTo(namTxT) == 0) {
								 %>
									<option value="<%=i1 + 2014 %>" selected="selected" ><%=i1 + 2014 %></option>
									<%
							 } else {
								 %>
									<option value="<%=i1 + 2014 %>" ><%=i1 + 2014 %></option>
									<%
							 }
						}
						%>
					</select> 
				</div>
			</div>
		</div>
	</div>
	<div class="col-xs-12 form-group">
		<label class="col-xs-2" for="sel1">Doanh nghiệp:</label>
		<div class="col-xs-6">
		<input type="text" placeholder="..........." class="form-control"
						style="width: 60%; height: 24px; padding-left: 1%; float: left; margin-right: 5%;"
						id="textDoanhNghiep" name="textDoanhNghiep"
						value="<%=textDoanhNghiep %>">
		</div>
		<label class="col-xs-2" for="sel1">Mã số hồ sơ:</label>
		<div class="col-xs-2">
			<input  placeholder="..........." class="form-control"
						type="text" style="width: 76%; height: 24px; float: right;"
						id="textSoHoSo" name="textSoHoSo" value="<%=testSoHoSo%>">
		</div>

	</div>
	<div class="col-xs-offset-2 col-xs-10 form-group">
		<div class="col-xs-12">
		<input type="button" value="Tìm kiếm" onclick='<%= renderResponse.getNamespace() + "fitterALL()" %>' class="btn btn-primary">
		</div>
	</div>

<portlet:renderURL var="selectTenTTHC" windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>">
	<portlet:param name="mvcPath" value="/html/canbo/_select_tentthc.jsp"/>
</portlet:renderURL>
<liferay-portlet:renderURL varImpl="searchURL" windowState="<%=LiferayWindowState.NORMAL.toString()%>">
	<portlet:param name="mvcPath" value="/html/canbo/view.jsp" />
</liferay-portlet:renderURL>
<script type="text/javascript">
//fitter list
	function <portlet:namespace />fitterALL() {
		var A = AUI();
// 		imPortTuExcelURL
		var url = '<%=searchURL.toString() %>';
		if($("select#selLoaiThuTuc").val() != undefined) {
			url += '&selLoaiThuTuc=' + $("select#selLoaiThuTuc").val();
		}
		if($("select#selTenThuTuc").val() != undefined) {
			url += '&selTenThuTuc=' + $("select#selTenThuTuc").val();
		}
		if($("#dateNgayNopHoSoTuNgay").val() != undefined) {
			url += '&dateNgayNopHoSoTuNgay=' + $("#dateNgayNopHoSoTuNgay").val();
		}
		if($("#dateNgayNopHoSoDenNgay").val() != undefined) {
			url += '&dateNgayNopHoSoDenNgay=' + $("#dateNgayNopHoSoDenNgay").val();
		}
		if($("#textDoanhNghiep").val() != undefined) {
			url += '&textDoanhNghiep=' + $("#textDoanhNghiep").val();
		}
		if($("#textSoHoSo").val() != undefined) {
			url += '&textSoHoSo=' + $("#textSoHoSo").val();
		}
		if($("select#namTxT").val() != undefined) {
			url += '&namTxT=' + $("select#namTxT").val();
		}
		location.href = url;
	}


	AUI().ready(function(A){
		var capTinhInput = $("select#selLoaiThuTuc");

		capTinhInput.on('change', function(){
			var codeLinhVucTthc = capTinhInput.val();
			selectTTHC(codeLinhVucTthc);
		});
	});

	function selectTTHC(codeLinhVucTthc){
		AUI().use('aui-base','aui-io-request', function(A){

			//aui ajax call to get updated content
			A.io.request('<%= selectTenTTHC %>',
			{
				dataType: 'text/html',
				method: 'GET',
				data: { 
					"<portlet:namespace />codeLinhVucTthc": codeLinhVucTthc
				},
				on: {
					success: function() {
						var optHuyen = A.one("#cbxTenTTHC");
						optHuyen.set("innerHTML", this.get('responseData'));
					} 
				}
			});
		});	
	}
</script>