<%@page
	import="vn.dtt.duongbien.dao.vrcb.model.impl.TempGeneralDeclarationImpl"%>
<%@page import="java.util.Date"%>
<%@page
	import="vn.dtt.duongbien.dao.vrcb.service.TempGeneralDeclarationLocalServiceUtil"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclaration"%>
<%@page import="javax.portlet.WindowState"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="java.util.Calendar"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.model.DmPortWharf"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.model.DmPortHarbour"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.model.DmPort"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.model.DmPortRegion"%>
<%@page
	import="vn.dtt.duongbien.dao.vrcb.service.DmPortWharfLocalServiceUtil"%>
<%@page
	import="vn.dtt.duongbien.dao.vrcb.service.DmPortLocalServiceUtil"%>
<%@page
	import="vn.dtt.duongbien.dao.vrcb.service.DmPortHarbourLocalServiceUtil"%>
<%@page
	import="vn.dtt.duongbien.dao.vrcb.service.DmPortRegionLocalServiceUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
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
	String redirect = ParamUtil.getString(request, "redirect");
	String itemIdTemp = ParamUtil.getString(request, "id");
	TempGeneralDeclaration tempGeneral = new TempGeneralDeclarationImpl();
	Calendar today = Calendar.getInstance();
	if (!itemIdTemp.equals("")) {
		tempGeneral = TempGeneralDeclarationLocalServiceUtil
				.getTempGeneralDeclaration(Long.valueOf(itemIdTemp));
		Date temp = tempGeneral.getDateOfArrival();
		today.setTime(temp);
	}
	DmPortRegion portRegion = null;
	DmPort port = null;
	DmPortHarbour portHarbour = null;
	DmPortWharf portWharf = null;
	List listDmPortRegin = DmPortRegionLocalServiceUtil
			.getDmPortRegion();
	List listDmPortHabour = DmPortHarbourLocalServiceUtil
			.getDmPortHarbour();
	List listDmPort = DmPortLocalServiceUtil.getDmPort();
	List listDmWharf = DmPortWharfLocalServiceUtil.getDmPortWharf();
	PortletURL listUrl = renderResponse.createRenderURL();
	listUrl.setWindowState(WindowState.MAXIMIZED);
	listUrl.setParameter("jspPage", "/html/hspttdnvaocangbien/view.jsp");
%>
<portlet:actionURL var="addVaoCangBenUrl" name="addVaoCangBen">
</portlet:actionURL>
<form action="<%=addVaoCangBenUrl.toString()%>" method="post"
	name="<portlet:namespace />fm">
	<input name="<portlet:namespace />id" type="hidden"
		value="<%=(itemIdTemp != null) ? itemIdTemp : ""%>"> <input
		name="<portlet:namespace />redirect" type="hidden"
		value="<%=redirect%>" />

	<!-- Thông tin chung -->
	<fieldset>
		<legend style="font-size: 15px; font-weight: bold;">Thông tin chung</legend>
		<%-- 					<input type="button" value="Danh sách hố sơ" onclick="javascript:document.location='<%=listUrl.toString()%>'" style="font-size:15px;color:white;background-color:#337ab7;height:40px;width: 150px;"/> --%>
		<table width="100%" cellpadding="5">
			<tr>
				<td  width="20%">Tên tàu <font color="red">*</font>
					<br>(Name of ship)
				</td>
				<td width="30%"><input type="text" name="<portlet:namespace />nameOfShip"
					size="50"
					value="<%=(tempGeneral != null) ? tempGeneral.getNameOfShip() : ""%>" /><br>Nhập
					tên tàu</td>
				<td  width="20%">Tên thuyền trưởng <br>(Name
					of master)
				</td>
				<td width="30%"><input type="text" name="<portlet:namespace />nameOfMaster"
					size="50"
					value="<%=(tempGeneral != null) ? tempGeneral.getNameOfMaster()
					: ""%>" /><br>&nbsp;</td>
			</tr>
			<tr>
				<td >Khu vực hàng hải <font
					color="red">*</font><br>(Port region)
				</td>
				<td><select name="<portlet:namespace />portRegionCode"
					style="width: 100%;">
						<%
							for (int i = 0; i < listDmPortRegin.size(); i++) {
								portRegion = (DmPortRegion) listDmPortRegin.get(i);
						%>
						<option value="<%=portRegion.getPortRegionCode()%>"
							title="<%=portRegion.getPortRegionNameVN()%>"
							<%=(tempGeneral.getPortRegionCode().equals(portRegion
						.getPortRegionCode())) ? "selected" : ""%>><%=StringUtil.shorten(portRegion.getPortRegionNameVN(),
						45, "")%></option>
						<%
							}
						%>
				</select> <br>Tải danh mục</td>
				<td >Cảng (đến/rời)<br>(Port of
					arrival)
				</td>
				<td><select name="<portlet:namespace />portOfArrivalCode"
					style="width: 100%;">
						<%
							for (int i = 0; i < listDmPort.size(); i++) {
								port = (DmPort) listDmPort.get(i);
						%>
						<option value="<%=port.getPortCode()%>"
							title="<%=port.getPortName()%>"
							<%=(tempGeneral.getPortOfArrivalCode().equals(port
						.getPortCode())) ? "selected" : ""%>><%=port.getPortName()%></option>
						<%
							}
						%>
				</select> <br>&nbsp;</td>
			</tr>
			<tr>
				<td >Bến cảng <font color="red">*</font><br>(Port
					harbour)
				</td>
				<td><select name="<portlet:namespace />portHarbourCode"
					style="width: 100%;">
						<%
							for (int i = 0; i < listDmPortHabour.size(); i++) {
								portHarbour = (DmPortHarbour) listDmPortHabour.get(i);
						%>
						<option value="<%=portHarbour.getPortHarbourCode()%>"
							title="<%=portHarbour.getPortHarbourNameVN()%>"
							<%=(tempGeneral.getPortHarbourCode().equals(portHarbour
						.getPortHarbourCode())) ? "selected" : ""%>><%=port.getPortName()%>><%=StringUtil.shorten(
						portHarbour.getPortHarbourNameVN(), 45, "")%></option>
						<%
							}
						%>
				</select>
				<td >Cầu cảng neo đậu <br>(Anchoring
					port wharf)
				</td>
				<td><select name="<portlet:namespace />portWharfCode"
					style="width: 100%;">
						<%
							for (int i = 0; i < listDmWharf.size(); i++) {
								portWharf = (DmPortWharf) listDmWharf.get(i);
						%>
						<option value="<%=portWharf.getPortWharfCode()%>"
							title="<%=portWharf.getPortWharfNameVN()%>"
							<%=(tempGeneral.getPortWharfCode().equals(portWharf
						.getPortWharfCode())) ? "selected" : ""%>><%=portWharf.getPortWharfNameVN()%></option>
						<%
							}
						%>
				</select></td>
			</tr>
			<tr>
				<td >Loại hồ sơ <br>(Type of
					Document)
				</td>
				<td><select name="<portlet:namespace />isArrival"
					style="width: 100%;">
						<option value="1"
							<%=(tempGeneral.getIsArrival() == 1) ? "selected" : ""%>>Vào
							cảng</option>
						<option value="0"
							<%=(tempGeneral.getIsArrival() == 0) ? "selected" : ""%>>Ra
							cảng</option>
				</select></td>
				<td >Số chuyến đi <font color="red">*</font>
					<br>(Voyage Number)
				</td>
				<td><input type="text" name="<portlet:namespace />voyageNumber"
					onkeypress="return isNumberKey(event)" size="50" maxlength="30"
					value="<%=(tempGeneral != null) ? tempGeneral.getVoyageNumber()
					: ""%>" /></td>
			</tr>
			<tr>
				<td >Số thuyền viên (gồm cả thuyền
					trưởng) <font color="red">*</font><br>(Number of crew (inc.
					master))
				</td>
				<td><input type="text" name="<portlet:namespace />numberOfCrew"
					onkeypress="return isNumberKey(event)" size="50" maxlength="9"
					value="<%=(tempGeneral != null) ? tempGeneral.getNumberOfCrew()
					: ""%>" /></td>
				<td >Số hành khách <font color="red">*</font>
					<br>(Number of passengers)
				</td>
				<td><input type="text"
					name="<portlet:namespace />numberOfPassengers"
					onkeypress="return isNumberKey(event)" size="50" maxlength="9"
					value="<%=(tempGeneral != null) ? tempGeneral
					.getNumberOfPassengers() : ""%>" /></td>
			</tr>
			<tr>
				<td >Cảng rời cuối cùng/Cảng đích <font
					color="red">*</font><br>(Last port of call)
				</td>
				<td><input type="text"
					name="<portlet:namespace />lastPortOfCallCode" size="5"
					maxlength="5"
					value="<%=(tempGeneral != null) ? tempGeneral
					.getLastPortOfCallCode() : ""%>" /></td>
				<td >Thời gian (đến/rời) cảng <font
					color="red">*</font> <br>(Time of arrival)
				</td>
				<td><liferay-ui:input-date name="dateOfArrival"
						disableNamespace="<%=false%>" disabled="false"
						dayValue="<%=today.get(Calendar.DAY_OF_MONTH)%>" dayParam="dobDay"
						monthValue="<%=today.get(Calendar.MONTH)%>" monthParam="dobMonth"
						yearValue="<%=today.get(Calendar.YEAR)%>" yearParam="dobYear" /></td>
			</tr>
		</table>
		<br/>
	</fieldset>
	<!-- Thông tin đại lý -->
	<fieldset>
		<legend style="font-size: 15px; font-weight: bold;">Thông tin đại lý</legend>
		<table width="100%" cellpadding="5">
			<tr>
				<td  width="20%">Mst đại lý <font color="red">*</font><br>(Tax
					code)
				</td>
				<td width="30%"><input type="text"
					name="<portlet:namespace />taxCodeOfShipownersAgents" size="50"
					value="<%=(tempGeneral != null) ? tempGeneral
					.getTaxCodeOfShipownersAgents() : ""%>" /></td>
				<td  width="20%">Tên đại lý <font color="red">*</font>
					<br>(Name)
				</td>
				<td width="30%"><input type="text"
					name="<portlet:namespace />nameOfShipownersAgents" size="50"
					value="<%=(tempGeneral != null) ? tempGeneral
					.getNameOfShipownersAgents() : ""%>" /></td>
			</tr>
			<tr>
				<td >Địa chỉ đại lý <font
					color="red">*</font><br>(Address)
				</td>
				<td><input type="text"
					name="<portlet:namespace />shipAgencyAddress" size="50"
					value="<%=(tempGeneral != null) ? tempGeneral
					.getShipAgencyAddress() : ""%>" /></td>
				<td >Điện thoại đại lý <font
					color="red">*</font> <br>(Phone)
				</td>
				<td><input type="text"
					name="<portlet:namespace />shipAgencyPhone"
					onkeypress="return isNumberKey(event)" size="50"
					value="<%=(tempGeneral != null) ? tempGeneral.getShipAgencyPhone()
					: ""%>" /></td>
			</tr>
			<tr>
				<td >Fax đại lý <font color="red">*</font><br>(Fax)
				</td>
				<td><input type="text"
					name="<portlet:namespace />shipAgencyFax"
					onkeypress="return isNumberKey(event)" size="50"
					value="<%=(tempGeneral != null) ? tempGeneral.getShipAgencyFax()
					: ""%>" /></td>
				<td >Email đại lý <font color="red">*</font>
					<br>(Email)
				</td>
				<td><input type="text"
					name="<portlet:namespace />shipAgencyEmail" size="50"
					value="<%=(tempGeneral != null) ? tempGeneral.getShipAgencyEmail()
					: ""%>" /></td>
			</tr>
		</table>
		<br/>
	</fieldset>
	<!-- Thành phần hồ sơ -->
	<fieldset>
		<legend style="font-size: 15px; font-weight: bold;">Thành phần hồ sơ</legend>
		<table width="100%" cellpadding="5">
			<tr>
			<td  width="20%"></td>
				<td width="30%"><input type="checkbox" name="bankhaichung" value="1"
					checked="checked" /> Bản khai chung <br/><input type="checkbox"
					name="danhsachthuyenvien" value="2" checked="checked" /> Danh sách
					thuyền viên  <br/><input type="checkbox" name="danhsachhanhkhach"
					value="3" /> Danh sách hành khách  <br/><input type="checkbox"
					name="tailieudinhkem" value="4" /> Tài liệu đính kèm <br/></td>
			<td width="20%"></td>
			<td width="30%"></td>
			</tr>
			
		</table>
		<br/>
	</fieldset>
	<input type="submit" value="Thêm mới hồ sơ"
		style="font-size: 15px; color: white; background-color: #337ab7; height: 40px; width: 150px;" />
	</td>

</form>