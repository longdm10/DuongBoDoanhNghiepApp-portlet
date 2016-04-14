<%@page import="vn.dtt.duongbien.dao.vrcb.model.impl.TempGeneralDeclarationImpl"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.service.TempGeneralDeclarationLocalServiceUtil"%>
<%@page import="vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclaration"%>
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
String redirect = ParamUtil.getString(request, "redirect");		
String itemIdTemp = ParamUtil.getString(request, "id");
TempGeneralDeclaration tempGeneral = new TempGeneralDeclarationImpl();
Calendar today = Calendar.getInstance();
if(!itemIdTemp.equals("")){
	tempGeneral = TempGeneralDeclarationLocalServiceUtil.getTempGeneralDeclaration(Long.valueOf(itemIdTemp));
	Date temp = tempGeneral.getDateOfArrival();
	today.setTime(temp);
}
DmPortRegion portRegion=null;
DmPort port = null;
DmPortHarbour portHarbour = null;
DmPortWharf portWharf = null;
List listDmPortRegin = DmPortRegionLocalServiceUtil.getDmPortRegion();
List listDmPortHabour = DmPortHarbourLocalServiceUtil.getDmPortHarbour();
List listDmPort = DmPortLocalServiceUtil.getDmPort();
List listDmWharf = DmPortWharfLocalServiceUtil.getDmPortWharf();
PortletURL listUrl = renderResponse.createRenderURL();
listUrl.setWindowState(WindowState.MAXIMIZED);
listUrl.setParameter("jspPage", "/html/hspttdnvaocangbien/view.jsp");
%>
<portlet:actionURL var="addVaoCangBenUrl" name="addVaoCangBen">
</portlet:actionURL>
<form action="<%= addVaoCangBenUrl.toString() %>" method="post" name="<portlet:namespace />fm" >
	<input name="<portlet:namespace />id" type="hidden" value="<%= (itemIdTemp != null) ? itemIdTemp : "" %>">
	<input name="<portlet:namespace />redirect" type="hidden" value="<%= redirect %>"/>
	<table width="1600px">
		<tr>
				<td valign="top">
<%-- 					<input type="button" value="Danh sách hố sơ" onclick="javascript:document.location='<%=listUrl.toString()%>'" style="font-size:15px;color:white;background-color:#337ab7;height:40px;width: 150px;"/> --%>
					<table>
						<tr>
							<td style="padding:10px 10px;">Tên tàu <font color="red">*</font> <br>(Name of ship)</td>
							<td><input type="text" name="<portlet:namespace />nameOfShip" size="50" value="<%= (tempGeneral != null) ? tempGeneral.getNameOfShip() : "" %>"/><br>Nhập tên tàu</td>
							<td style="padding:10px 10px;">Tên thuyền trưởng <br>(Name of master)</td>
							<td><input type="text" name="<portlet:namespace />nameOfMaster" size="50" value="<%= (tempGeneral != null) ? tempGeneral.getNameOfMaster() : "" %>"/><br>&nbsp;</td>
						</tr>
						<tr>
							<td style="padding:10px 10px;">Khu vực hàng hải <font color="red">*</font><br>(Port region)</td>
							<td>
							<select name="<portlet:namespace />portRegionCode" style="width:100%;">
								<%	for(int i=0; i<listDmPortRegin.size();i++)	{
										portRegion = (DmPortRegion)listDmPortRegin.get(i);	 %>
										<option value="<%= portRegion.getPortRegionCode()%>" title="<%=portRegion.getPortRegionNameVN()%>" <%= (tempGeneral.getPortRegionCode().equals(portRegion.getPortRegionCode())) ? "selected" : "" %>><%=StringUtil.shorten(portRegion.getPortRegionNameVN(),45,"")%></option>
								<%	}	%>
							</select>
							<br>Tải danh mục</td>
							<td style="padding:10px 10px;">Cảng (đến/rời)<br>(Port of arrival)</td>
							<td>
								<select name="<portlet:namespace />portOfArrivalCode" style="width:100%;">
									<%	for(int i=0; i<listDmPort.size();i++)	{
										port = (DmPort)listDmPort.get(i);	 %>
										<option value="<%= port.getPortCode()%>" title="<%=port.getPortName()%>" <%= (tempGeneral.getPortOfArrivalCode().equals(port.getPortCode())) ? "selected" : "" %>><%= port.getPortName()%></option>
									<%	}	%>
								</select>
								<br>&nbsp;
							</td>
						</tr>
						<tr>
							<td style="padding:10px 10px;">Bến cảng <font color="red">*</font><br>(Port harbour)</td>
							<td>
								<select  name="<portlet:namespace />portHarbourCode" style="width:100%;">
									<%	for(int i=0; i<listDmPortHabour.size();i++)	{
											portHarbour = (DmPortHarbour)listDmPortHabour.get(i);	 %>
											<option value="<%= portHarbour.getPortHarbourCode()%>" title="<%=portHarbour.getPortHarbourNameVN() %>" <%= (tempGeneral.getPortHarbourCode().equals(portHarbour.getPortHarbourCode())) ? "selected" : "" %>><%= port.getPortName()%>><%=StringUtil.shorten(portHarbour.getPortHarbourNameVN(),45,"")%></option>
										<%	}	%>
								</select>
							<td style="padding:10px 10px;">Cầu cảng neo đậu <br>(Anchoring port wharf)</td>
							<td>
								<select  name="<portlet:namespace />portWharfCode" style="width:100%;">
									<%	for(int i=0; i<listDmWharf.size();i++)	{
											portWharf = (DmPortWharf)listDmWharf.get(i);	 %>
											<option value="<%= portWharf.getPortWharfCode()%>" title="<%= portWharf.getPortWharfNameVN()%>" <%= (tempGeneral.getPortWharfCode().equals(portWharf.getPortHarbourCode())) ? "selected" : "" %> ><%= portWharf.getPortWharfNameVN()%></option>
										<%	}	%>	
								</select>
							</td>
						</tr>
						<tr>
							<td style="padding:10px 10px;">Loại hồ sơ <br>(Type of Document)</td>
							<td>
								<select name="<portlet:namespace />isArrival" style="width:100%;">
									<option value="1" <%= (tempGeneral.getIsArrival()==1) ? "selected" : "" %> >Vào cảng</option>
									<option value="0" <%= (tempGeneral.getIsArrival()==0) ? "selected" : "" %> >Ra cảng</option>
								</select>
							</td>
							<td style="padding:10px 10px;">Số chuyến đi <font color="red">*</font> <br>(Voyage Number)</td>
							<td><input type="text" name="<portlet:namespace />voyageNumber" onkeypress="return isNumberKey(event)" size="50" maxlength="30" value="<%= (tempGeneral != null) ? tempGeneral.getVoyageNumber() : "" %>"/></td>
						</tr>
						<tr>
							<td style="padding:10px 10px;">Số thuyền viên (gồm cả thuyền trưởng) <font color="red">*</font><br>(Number of crew (inc. master))</td>
							<td><input type="text" name="<portlet:namespace />numberOfCrew" onkeypress="return isNumberKey(event)" size="50" maxlength="9" value="<%= (tempGeneral != null) ? tempGeneral.getNumberOfCrew() : "" %>"/></td>
							<td style="padding:10px 10px;">Số hành khách <font color="red">*</font> <br>(Number of passengers)</td>
							<td><input type="text" name="<portlet:namespace />numberOfPassengers" onkeypress="return isNumberKey(event)" size="50" maxlength="9" value="<%= (tempGeneral != null) ? tempGeneral.getNumberOfPassengers() : "" %>"/></td>
						</tr>
						<tr>
							<td style="padding:10px 10px;">Cảng rời cuối cùng/Cảng đích <font color="red">*</font><br>(Last port of call)</td>
							<td><input type="text" name="<portlet:namespace />lastPortOfCallCode" size="5" maxlength="5" value="<%= (tempGeneral != null) ? tempGeneral.getLastPortOfCallCode() : "" %>"/></td>
							<td style="padding:10px 10px;">Thời gian (đến/rời) cảng <font color="red">*</font> <br>(Time of arrival)</td>
							<td>
								<liferay-ui:input-date name="dateOfArrival" disableNamespace="<%= false %>"	disabled="false" 
									dayValue="<%= today.get(Calendar.DAY_OF_MONTH) %>" dayParam="dobDay"
							        monthValue="<%= today.get(Calendar.MONTH) %>" monthParam="dobMonth"
							        yearValue="<%= today.get(Calendar.YEAR) %>" yearParam="dobYear"
				        			/>
			        		</td>
						</tr>
						<tr>
							<td align="center" colspan="4" style="padding:10px 10px;margin:0px auto;">
								<fieldset>
									  <legend style="font-size:15px;">Thông tin đại lý</legend>
									  <table>
									  	<tr>
									  		<td style="padding:10px 10px;">Mst đại lý <font color="red">*</font><br>(Tax code)</td>
											<td><input type="text" name="<portlet:namespace />taxCodeOfShipownersAgents" size="50" value="<%= (tempGeneral != null) ? tempGeneral.getTaxCodeOfShipownersAgents() : "" %>"/></td>
											<td style="padding:10px 10px;">Tên đại lý <font color="red">*</font> <br>(Name)</td>
											<td><input type="text" name="<portlet:namespace />nameOfShipownersAgents" size="50" value="<%= (tempGeneral != null) ? tempGeneral.getNameOfShipownersAgents() : "" %>"/></td>
									  	</tr>
									  	<tr>
									  		<td style="padding:10px 10px;">Địa chỉ đại lý <font color="red">*</font><br>(Address)</td>
											<td><input type="text" name="<portlet:namespace />shipAgencyAddress" size="50" value="<%= (tempGeneral != null) ? tempGeneral.getShipAgencyAddress() : "" %>"/></td>
											<td style="padding:10px 10px;">Điện thoại đại lý <font color="red">*</font> <br>(Phone)</td>
											<td><input type="text" name="<portlet:namespace />shipAgencyPhone" onkeypress="return isNumberKey(event)" size="50" value="<%= (tempGeneral != null) ? tempGeneral.getShipAgencyPhone() : "" %>"/></td>
									  	</tr>
									  	<tr>
									  		<td style="padding:10px 10px;">Fax đại lý <font color="red">*</font><br>(Fax)</td>
											<td><input type="text" name="<portlet:namespace />shipAgencyFax" onkeypress="return isNumberKey(event)" size="50" value="<%= (tempGeneral != null) ? tempGeneral.getShipAgencyFax() : "" %>"/></td>
											<td style="padding:10px 10px;">Email đại lý <font color="red">*</font> <br>(Email)</td>
											<td><input type="text" name="<portlet:namespace />shipAgencyEmail" size="50" value="<%= (tempGeneral != null) ? tempGeneral.getShipAgencyEmail() : "" %>"/></td>
									  	</tr>
									  </table>
								 </fieldset>
							</td>
						</tr>
						<tr>
							<td colspan="4" align="center"><input type="submit" value="Thêm mới hồ sơ" style="font-size:15px;color:white;background-color:#337ab7;height:40px;width: 150px;"/></td>
						</tr>
					</table>
				</td>
		</tr>
	</table>
</form>