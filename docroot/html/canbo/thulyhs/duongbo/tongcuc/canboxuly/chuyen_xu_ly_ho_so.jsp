
<%@page import="vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="vn.dtt.duongbo.dao.motcua.service.OEPUserMgtEmployeeLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee"%>
<%@page import="vn.dtt.duongbo.dao.motcua.service.OEPUserMgtWorkingUnitLocalServiceUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@page import="vn.dtt.duongbo.utils.CommonUtils"%>
<%@page import="com.liferay.portal.model.User"%>
<%@ include file="/html/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>

<%
	String hoSoThuTucId = ParamUtil.getString(request, Constants.ID_HO_SO_THU_TUC);
	String phieuXuLyId = ParamUtil.getString(request,
			Constants.ID_PHIEU_XU_LY);
	String quyTrinhThuTucId = ParamUtil.getString(request,
			Constants.ID_QUY_TRINH_THU_TUC);
	String idThuTucHanhChinh = ParamUtil.getString(request,
			Constants.ID_THU_TUC_HANH_CHINH);

	PortletURL chuyenXuLyURL = renderResponse.createActionURL();
	chuyenXuLyURL.setParameter(ActionRequest.ACTION_NAME, "chuyenXuLyChoCanBoKhac");
	chuyenXuLyURL.setParameter(Constants.ID_HO_SO_THU_TUC, hoSoThuTucId);
	chuyenXuLyURL.setParameter(Constants.ID_PHIEU_XU_LY, phieuXuLyId);
	chuyenXuLyURL.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
	chuyenXuLyURL.setParameter(Constants.ID_QUY_TRINH_THU_TUC, quyTrinhThuTucId);
	chuyenXuLyURL.setParameter(Constants.ID_THU_TUC_HANH_CHINH, idThuTucHanhChinh);
	chuyenXuLyURL.setWindowState(LiferayWindowState.NORMAL);
	//phong ban cua user
	long userId = user.getUserId();
	String returnURL = ParamUtil.getString(request, Constants.RETURN_URL);
	//
	TthcHoSoThuTuc etThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(Long.valueOf(hoSoThuTucId));
	OEPUserMgtWorkingUnit oepWorkingUnit = OEPUserMgtWorkingUnitLocalServiceUtil.fetchByF_organizationId(etThuTuc.getToChucQuanLy()+"");
	//phong ban
	List<OEPUserMgtWorkingUnit> listPB = new ArrayList<OEPUserMgtWorkingUnit>();
	listPB.add(0, oepWorkingUnit);
	listPB.addAll(OEPUserMgtWorkingUnitLocalServiceUtil.findByF_parentWorkingUnitId(oepWorkingUnit.getWorkingUnitId(), Long.valueOf("0"+idThuTucHanhChinh)));
	List<OEPUserMgtEmployee> listEmployee = new ArrayList<OEPUserMgtEmployee>();
	if(listPB.size()>0){
		listEmployee = OEPUserMgtEmployeeLocalServiceUtil.findByworkingUnitId(listPB.get(0).getWorkingUnitId());
	}
%>
		<aui:input type="hidden" name="keyDichChuyen"></aui:input>
		<h6 class="">
			<b>Chọn cán bộ xử lý hồ sơ</b>
		</h6>
		<div class="row MB10">
			<div class="col-sm-2 lineH30">Chọn phòng ban</div>
			<div class="col-sm-10">
				<select class="form-control"  id="workingUnitId" name="workingUnitId">
					<%for(OEPUserMgtWorkingUnit ett: listPB){ %>
						<option value="<%=ett.getWorkingUnitId() %>"><%=ett.getName() %></option>
					<%} %>
				</select>
			</div>
		</div>
		<div class="row MB10">
			<div class="col-sm-2 lineH30">Chọn cán bộ</div>
			<div id="cbxTenEmp" class="col-sm-10">
				<select required="required" class="form-control" id="canBoXuLyId" name="canBoXuLyId">
					<%
					if (listEmployee != null && listEmployee.size() > 0) {
						for (OEPUserMgtEmployee ett : listEmployee) {
						%>
						<option value="<%=ett.getUserId()%>" ><%=ett.getFullName()%></option>
						<%
						}
					}
					%>
				</select>
			</div>
		</div>
		<div class="row">
			<div class="col-xs-12" style="padding-left: 15px !important;">
				<input style="width: 10%;" class="btn btn-primary" type="submit" value="Xác nhận" 
				onclick="advSubmit('<%=chuyenXuLyURL.toString()%>','Chuyen.xu.ly');"/>
			</div>
		</div>
<portlet:renderURL var="selectTenTTHC" windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>">
	<portlet:param name="mvcPath" value="/html/canbo/thulyhs/duongbo/tongcuc/vanthu/_select_employee.jsp"/>
</portlet:renderURL>
<script type="text/javascript">
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
</script>
<aui:script use="aui-io-request,aui-node">
var A = AUI();
Liferay.provide(window, 'advSubmit', function(action,key) {
	var keyDichChuyen = A.one("#<portlet:namespace/>keyDichChuyen");
	keyDichChuyen.val(key);
    A.one('#<portlet:namespace/>fm').set('action',action);

});
</aui:script>