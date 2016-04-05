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
DmPortRegion portRegion=null;
DmPort port = null;
DmPortHarbour portHarbour = null;
DmPortWharf portWharf = null;
/*List listDmPortRegin = DmPortRegionLocalServiceUtil.getDmPortRegion();
List listDmPortHabour = DmPortHarbourLocalServiceUtil.getDmPortHarbour();
List listDmPort = DmPortLocalServiceUtil.getDmPort();
List listDmWharf = DmPortWharfLocalServiceUtil.getDmPortWharf();*/
Calendar today = Calendar.getInstance();
%>
<portlet:actionURL var="addVaoCangBenUrl" name="addVaoCangBen">
</portlet:actionURL>
<form action="<%= addVaoCangBenUrl.toString() %>" method="post" name="<portlet:namespace />fm" >
	<table width="1600px">
		<tr>
			<td width="200px" valign="top" >
				<jsp:include page="/html/menudb/trang_menu_left.jsp"></jsp:include>
			</td>
				<td valign="top">
					<table>
						<tr>
							<td style="padding:10px 10px;">Tên tàu <font color="red">*</font> <br>(Name of ship)</td>
							<td><input type="text" name="<portlet:namespace />nameOfShip" size="50"/><br>Nhập tên tàu</td>
							<td style="padding:10px 10px;">Tên thuyền trưởng <br>(Name of master)</td>
							<td><input type="text" name="<portlet:namespace />nameOfMaster" size="50"/><br>&nbsp;</td>
						</tr>
						<tr>
							<td style="padding:10px 10px;">Khu vực hàng hải <font color="red">*</font><br>(Port region)</td>
							<td>
							<select name="<portlet:namespace />typeId" id="<portlet:namespace />portRegionCode" style="width:100%;">
								
							</select>
							<br>Tải danh mục</td>
							<td style="padding:10px 10px;">Cảng đến<br>(Port of arrival)</td>
							<td>
								<select name="<portlet:namespace />typeId" id="<portlet:namespace />portOfArrivalCode" style="width:100%;">
									
								</select>
								<br>&nbsp;
							</td>
						</tr>
						<tr>
							<td style="padding:10px 10px;">Bến cảng <font color="red">*</font><br>(Port harbour)</td>
							<td>
								<select name="<portlet:namespace />typeId" id="<portlet:namespace />portHarbourCode" style="width:100%;">
										
								</select>
							<td style="padding:10px 10px;">Cầu cảng neo đậu <br>(Anchoring port wharf)</td>
							<td>
								<select name="<portlet:namespace />typeId" id="<portlet:namespace />portWharfCode" style="width:100%;">
											
								</select>
							</td>
						</tr>
						<tr>
							<td style="padding:10px 10px;">Loại hồ sơ <br>(Type of Document)</td>
							<td>
								<select name="<portlet:namespace />typeId" id="<portlet:namespace />isArrival" style="width:100%;">
									<option value="1">Vào cảng</option>
								</select>
							</td>
							<td style="padding:10px 10px;">Số chuyến đi <font color="red">*</font> <br>(Voyage Number)</td>
							<td><input type="text" name="<portlet:namespace />voyageNumber" onkeypress="return isNumberKey(event)" size="50"/></td>
						</tr>
						<tr>
							<td style="padding:10px 10px;">Số thuyền viên (gồm cả thuyền trưởng) <font color="red">*</font><br>(Number of crew (inc. master))</td>
							<td><input type="text" name="<portlet:namespace />numberOfCrew" onkeypress="return isNumberKey(event)" size="50"/></td>
							<td style="padding:10px 10px;">Số hành khách <font color="red">*</font> <br>(Number of passengers)</td>
							<td><input type="text" name="<portlet:namespace />numberOfPassengers" onkeypress="return isNumberKey(event)" size="50"/></td>
						</tr>
						<tr>
							<td style="padding:10px 10px;">Cảng rời cuối cùng <font color="red">*</font><br>(Last port of call)</td>
							<td><input type="text" name="<portlet:namespace />lastPortOfCallCode" size="50"/></td>
							<td style="padding:10px 10px;">Thời gian đến cảng <font color="red">*</font> <br>(Time of arrival)</td>
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
											<td><input type="text" name="<portlet:namespace />taxCodeOfShipownersAgents" size="50"/></td>
											<td style="padding:10px 10px;">Tên đại lý <font color="red">*</font> <br>(Name)</td>
											<td><input type="text" name="<portlet:namespace />nameOfShipownersAgents" size="50"/></td>
									  	</tr>
									  	<tr>
									  		<td style="padding:10px 10px;">Địa chỉ đại lý <font color="red">*</font><br>(Address)</td>
											<td><input type="text" name="<portlet:namespace />shipAgencyAddress" size="50"/></td>
											<td style="padding:10px 10px;">Điện thoại đại lý <font color="red">*</font> <br>(Phone)</td>
											<td><input type="text" name="<portlet:namespace />shipAgencyPhone" onkeypress="return isNumberKey(event)" size="50"/></td>
									  	</tr>
									  	<tr>
									  		<td style="padding:10px 10px;">Fax đại lý <font color="red">*</font><br>(Fax)</td>
											<td><input type="text" name="<portlet:namespace />shipAgencyFax" onkeypress="return isNumberKey(event)" size="50"/></td>
											<td style="padding:10px 10px;">Email đại lý <font color="red">*</font> <br>(Email)</td>
											<td><input type="text" name="<portlet:namespace />shipAgencyEmail" size="50"/></td>
									  	</tr>
									  </table>
								 </fieldset>
							</td>
						</tr>
						<tr>
							<td colspan="4" align="center"><input type="submit" value="Thêm mới hồ sơ" style="height: 40px;widows: 50px;"/></td>
						</tr>
					</table>
				</td>
		</tr>
	</table>
</form>