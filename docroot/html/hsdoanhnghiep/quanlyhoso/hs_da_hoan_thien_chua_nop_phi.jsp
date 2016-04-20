<%@page import="vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.business.DanhMucConstants"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinh"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcPhanNhomHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepUserLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%@include file="/html/init.jsp"%>

<%
	//----------userId
	long userLoginId = PortalUtil.getUserId(request);
	long doanhNghiepId = 0;
	DnDoanhNghiepUser doanhNghiepUser = DnDoanhNghiepUserLocalServiceUtil.findByUserId(userLoginId);
	if(doanhNghiepUser != null){
		doanhNghiepId = doanhNghiepUser.getNguoiLamThuTucId();
	}
	//----------maPhanNhom
	String maPhanNhom = "";
	
	HttpSession httpSession = null;
	try {
		httpSession = PortalUtil.getHttpServletRequest(renderRequest).getSession();
	} catch (Exception es) {}
	
	
	if (httpSession != null) {
		Object obj = httpSession.getAttribute(Constants.MA_PHAN_NHOM_HO_SO);
		if (obj != null) {
			maPhanNhom = obj.toString();
		} else {
			maPhanNhom = "";
		}
	}
	
	//----------organizationId - tochucId
	long organizationId = 0;
	if (themeDisplay.getUser().getOrganizations() != null && themeDisplay.getUser().getOrganizations().size() > 0) {
		organizationId = themeDisplay.getUser().getOrganizations().get(0).getOrganizationId();
	}
	
	long phanNhomHoSoId = 0;
	TthcPhanNhomHoSo pnDoanhNghiep = TthcPhanNhomHoSoLocalServiceUtil.getByMaPhanNhom(maPhanNhom);
	if (pnDoanhNghiep != null) {
		phanNhomHoSoId = pnDoanhNghiep.getId();
	};
	
	
	

	List<DmDataItem> lstLinhVucThuTuc = DmDataItemLocalServiceUtil.findByGroupCode(DanhMucConstants.DM_LINH_VUC_TTHC);
	if (lstLinhVucThuTuc == null) { lstLinhVucThuTuc = new ArrayList<DmDataItem>(); }
	
	String selLinhVucThuTuc = ParamUtil.getString(request, Constants.CODE_LINH_VUC_THU_TUC);
	String thuTucHanhChinhId = ParamUtil.getString(request, Constants.ID_THU_TUC_HANH_CHINH);
	String maBienNhan = ParamUtil.getString(request, Constants.MA_BIEN_NHAN);
	
	List<TthcHoSoThuTuc> resultsHoSoThuTuc = null;
	
	List<TthcThuTucHanhChinh> allThuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.findByLinhVucThuTuc(selLinhVucThuTuc);
	
	PortletURL portletUrl = renderResponse.createRenderURL();
	portletUrl.setParameter("jspPage", "/html/hsdoanhnghiep/quanlyhoso/hs_da_hoan_thien_chua_nop_phi.jsp");
	portletUrl.setParameter(Constants.CODE_LINH_VUC_THU_TUC, selLinhVucThuTuc);
	portletUrl.setParameter(Constants.ID_THU_TUC_HANH_CHINH, thuTucHanhChinhId);
	
	SearchContainer searchContainer = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, 15, portletUrl, null, null);
	long longTotal = 0;
	
	if (userLoginId > 0) {
		
		//resultsHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.searchQuanLyHoSothuTucHanhChinhId, userLoginId, TrangThaiConstains.HS_DA_HOAN_THIEN_CHUA_NOP_PHI, searchContainer.getStart(), searchContainer.getEnd());
		resultsHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.searchQuanLyHoSo(maBienNhan, thuTucHanhChinhId, doanhNghiepId, phanNhomHoSoId, searchContainer.getStart(), searchContainer.getEnd());
		longTotal = TthcHoSoThuTucLocalServiceUtil.countQuanLyHoSo(maBienNhan, thuTucHanhChinhId, doanhNghiepId, phanNhomHoSoId);
		
		searchContainer.setTotal(Integer.parseInt(String.valueOf(longTotal)));
		searchContainer.setResults(resultsHoSoThuTuc);
	}
	
	if (resultsHoSoThuTuc == null) { 
		resultsHoSoThuTuc = new ArrayList<TthcHoSoThuTuc>(); 
	}
%>
<%
PortletURL actionUrlTimKiemHoSoThuTuc = renderResponse.createActionURL();
actionUrlTimKiemHoSoThuTuc.setParameter(ActionRequest.ACTION_NAME, "timKiemQuanLyHoSo");
actionUrlTimKiemHoSoThuTuc.setParameter(Constants.CODE_LINH_VUC_THU_TUC, selLinhVucThuTuc);
actionUrlTimKiemHoSoThuTuc.setParameter(Constants.CODE_LINH_VUC_THU_TUC, thuTucHanhChinhId);
actionUrlTimKiemHoSoThuTuc.setParameter(Constants.MA_BIEN_NHAN, maBienNhan);

PortletURL actionForwardThanhToanTructuyenNhieuHoSo = renderResponse.createActionURL();
actionForwardThanhToanTructuyenNhieuHoSo.setParameter(ActionRequest.ACTION_NAME, "forwardThanhToanTructuyenNhieuHoSo");
//actionUrlThanhToanTrucTuyen.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
//actionUrlThanhToanTrucTuyen.setParameter(Constants.VPC_AMOUNT, String.valueOf(payAmount));

PortletURL actionForwardThanhToanHoaDonNhieuHoSo = renderResponse.createActionURL();
actionForwardThanhToanHoaDonNhieuHoSo.setParameter(ActionRequest.ACTION_NAME, "forwardThanhToanHoaDonNhieuHoSo");
//actionUrlThanhToanTrucTuyen.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
//actionUrlThanhToanTrucTuyen.setParameter(Constants.VPC_AMOUNT, String.valueOf(payAmount));

%>

<style>
	.aui p{
		margin: 0;
	}
</style>

<section class="right">
	<div class="title_right">Danh sách hồ sơ đã hoàn thiện chưa nộp phí</div>
	<div class="box">
		<aui:form action="<%=actionUrlTimKiemHoSoThuTuc.toString()%>" name="myForm" id="myForm" method="POST">
			<div class="box_select line1">
				<!-- ---------------------------- nhom dich vu cong ------------------------------>
				<select style="float: left; width: 40%;" class="select1" id="selLinhVucThuTuc" name="selLinhVucThuTuc" onchange="onchangeSelLinhVucThuTuc()">
					<option value="">------------ Chọn tất cả các nhóm dịch vụ công ------------</option>
					<% for (DmDataItem item : lstLinhVucThuTuc) { %>
						<option value="<%=item.getCode()%>" <%=item.getCode().equals(selLinhVucThuTuc) ? "selected='selected'" : ""%>><%=item.getName()%></option>
					<% } %>
				</select>

				<!-- ---------------------------- tat ca cac dich vu cong ------------------------------>
				<input type="hidden" id="textThuTucHanhChinh" name="textThuTucHanhChinh" value="<%=thuTucHanhChinhId%>">
				<select class="select1" id="selThuTucHanhChinh" name="selThuTucHanhChinh" style="float: left; width: 43%;margin-right: 1.5%;margin-left: 5%;">
					<option value=""> ------------ Chọn tất cả các dịch vụ công ------------ </option>
				<%	if(allThuTucHanhChinh != null && allThuTucHanhChinh.size() > 0){ 
						for (TthcThuTucHanhChinh item : allThuTucHanhChinh) {
						%>
							<option value="<%=item.getId()%>" <%=(item.getId() == ((thuTucHanhChinhId.trim().length() > 0)? Long.parseLong(thuTucHanhChinhId) : 0)) ? "selected='selected'" : ""%>><%=item.getTenThuTuc()%></option>
					<% } 
					}
					%>
			</select>
				<input style="width: 10%;" class="button" type="submit" value="Tìm kiếm">
			</div>
		</aui:form>
		<aui:form action="" name="payForm" id="payForm" method="POST">
			<div class="result">
				<table class="table">
					<tbody>
						<tr class="fl">
							<td width="5%">STT</td>
							<td width="5%"></td>
							<td width="26%">Tên nhóm dịch vụ công</td>
							<td width="36%">Tên dịch vụ công</td>
							<td width="17%">Thời điểm tạo hồ sơ</td>
							<td width="11%">Thao tác</td>
						</tr>
						<%
							int countRow = 1;
							long thuTucHanhChinhIdInItem = 0;
							String tenThuTucHanhChinh = "";
							String tenLinhVuc = "";
							DmDataItem linhVuc = null;
							TthcThuTucHanhChinh thuTucHanhChinh = null;
							for (TthcHoSoThuTuc item : resultsHoSoThuTuc) {
								thuTucHanhChinhIdInItem = item.getThuTucHanhChinhId();
								thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(thuTucHanhChinhIdInItem);
								if(thuTucHanhChinh != null){
									tenThuTucHanhChinh = thuTucHanhChinh.getTenThuTuc();
									linhVuc = DmDataItemLocalServiceUtil.getByGroupCodeAndItemCode0(Constants.LINH_VUC_THU_TUC_HANH_CHINH_CODE, thuTucHanhChinh.getLinhVucThuTuc().trim());
									if(linhVuc != null)
										tenLinhVuc = linhVuc.getName();
								}
								
								PortletURL suaHoSoUrl = renderResponse.createRenderURL();
								suaHoSoUrl.setParameter("jspPage", "/html/hsdoanhnghiep/thongtinhoso/thanh_phan_ho_so.jsp");
								suaHoSoUrl.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhIdInItem));
								suaHoSoUrl.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(item.getId()));
								suaHoSoUrl.setParameter(Constants.CODE_LINH_VUC_THU_TUC, selLinhVucThuTuc);
								suaHoSoUrl.setParameter(Constants.MA_BIEN_NHAN, maBienNhan);
								
								PortletURL actionHuyHoSo = renderResponse.createActionURL();
								actionHuyHoSo.setParameter(ActionRequest.ACTION_NAME, "huyHoSoHoanThienChuaNopPhi");
								actionHuyHoSo.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
								actionHuyHoSo.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(item.getId()));
								
							%>
						<tr>
							<td><%=countRow%></td>
							<td><input type="checkbox" id="<%=item.getId() %>" name="<%=item.getId() %>" onclick="changeAjax('<%=item.getId()%>')"></td>
							<td class="sp"><%=tenLinhVuc %></td>
							<td class="sp"><%=tenThuTucHanhChinh %></td>
							<td><%=FormatData.parseDateToTringType3(item.getNgayTao()) %></td>
							<td>
								<a href="<%=suaHoSoUrl.toString()%>"><img class="tabimg2" src="/yte-home-theme/images/i13.png" title="Sửa hồ sơ"></a>
								<a href="" onclick="summitForm('<%=actionHuyHoSo%>','false')"><img src="/yte-home-theme/images/i14.png" title="Xóa hồ sơ"></a>
							</td>
						</tr>
						<%
							countRow++;
							}
						%>
					</tbody>
				</table>
				<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" />
				
				<% 
					if(longTotal > 0){
				%>
	
				<!----------------------- Thông tin về phí, lệ phí ----------------------->
				<img style="margin-top: 5px;" class="lisths1" src="/yte-home-theme/images/list.png">
				<p class="spectex">
					Thông tin về phí, lệ phí: <span class="text_italic">
					<i style="font-weight: normal;">(khi chọn nhiều hồ sơ thì số phí sẽ bằng tổng số phí của các hồ sơ)</i></span>
				</p>
				<br>
				<p class="spectex2" style="margin-left: 5%;">
					- Phí thẩm định cho phép khảo nghiệm: <span class="bold2" id="paymentAmount"></span>
				</p>
				<br>
				<p class="spectex2" style="margin-left: 5%; float: left; margin-top: -15px;">
					- Phí thẩm xét hồ sơ: <span class="bold2"></span><span class="oi">Nộp khi bổ sung kết quả khảo nghiệm</span>
				</p>
				<br> <br>
	
	
				<!----------------------- Hướng dẫn nộp phí, lệ phí ----------------------->
				<img style="margin-top: 5px;" class="lisths1" src="/yte-home-theme/images/list.png">
				<p class="spectex">Hướng dẫn nộp phí, lệ phí:</p>
				<br>
				
				<p class="spectex2" style="margin-left: 5%;"><span class="bold3">- Cách 1:</span> Doanh nghiệp thanh toán trực tuyến thông qua dịch vụ thanh toán trực tuyến</p>
					<input type="button" class="button2" value="Thanh toán trực tuyến" onclick="summitForm('<%=actionForwardThanhToanTructuyenNhieuHoSo.toString()%>','true')"><br><br>
					<p class="spectex2" style="margin-left: 5%;margin-top: -25px;"><span class="bold3">- Cách 2:</span> Doanh nghiệp chuyển khoản ngân hàng theo thông tin:</p><br>
					<input type="button" class="button3" value="Tải biên lai hoặc phiếu ủy nhiệm chi" onclick="summitForm('<%=actionForwardThanhToanHoaDonNhieuHoSo.toString()%>','true')">
					
	<!-- 
	<p style="float: left; margin-left: 4%;" class="spectex2">
					<span class="bold3">- Cách 1:</span> Doanh nghiệp thanh toán trực tuyến thông qua dịch vụ thanh toán trực tuyến
				</p>
				<label style="line-height: 26px;" for="file-upload" class="button2">Thanh toán trực tuyến</label><input id="file-upload" type="file"><br> <br>
				<p style="margin-left: 4%; margin-top: -10px;" class="spectex2">
					<span class="bold3">- Cách 2:</span> Doanh nghiệp chuyển khoản ngân hàng theo thông tin:
				</p>
				<br> <label style="width: 250px; line-height: 26px;" for="file-upload" class="button3">Tải biên lai hoặc phiếu ủy nhiệm chi</label><input
					id="file-upload" type="file">
	
	 -->				
				
				<p class="">
						<p style="margin-left:10%;">Tên chủ tài khoản: <span class="bold3">Cục quản lý môi trường Y tế </span><br><p>
						<p style="margin-left:10%;">Số tài khoản: <span class="bold3">3511.0.1104195</span><br></p>
						<p style="margin-left:10%;">Tại: <span class="bold3">Kho bạc nhà nước quận Ba Đình- TP. hà Nội</span><br></p>
				</p></br>
				<%}
				%>
				<input type="hidden" id='<%=Constants.DANH_SACH_HO_SO_THU_TUC %>' name='<%=Constants.DANH_SACH_HO_SO_THU_TUC %>' value='' ><br>
				<input type="hidden" id='<%=Constants.VPC_AMOUNT %>' name='<%=Constants.VPC_AMOUNT %>' value='' ><br>
			</div>
		</aui:form>
	</div>
</section>

<portlet:resourceURL var="updateContentURL"></portlet:resourceURL>
<script type="text/javascript">

function changeAjax(dataId) {
	$.ajax({
		type : 'POST',
		url: '<%=updateContentURL%>',
		data : {
			hoSoThuTucId : dataId,
			type : 'changePayment4HoSoThuTuc'
		},
		success : function(data) {

			var data2 = JSON.parse(data);
			var isCheck=document.getElementById(dataId).checked;
			var hoSoId = data2.hoSoId[0];
			var amount = Number(data2.payAmount[0]);
			var payAmount = Number(document.getElementById('<%=Constants.VPC_AMOUNT %>').value);
			var listHoSoThuTucId=document.getElementById('<%=Constants.DANH_SACH_HO_SO_THU_TUC %>').value;
			if (isCheck==true){
				//alert("--true");
				listHoSoThuTucId=listHoSoThuTucId + hoSoId + ", ";
				payAmount = payAmount + amount;
			}else{
				//alert("--false");
				var res = listHoSoThuTucId.replace(hoSoId + ", ", "");
				listHoSoThuTucId=res;
				payAmount = payAmount - amount;
			}
			document.getElementById('<%=Constants.DANH_SACH_HO_SO_THU_TUC %>').value=listHoSoThuTucId;
			document.getElementById('<%=Constants.VPC_AMOUNT %>').value=payAmount;
			document.getElementById('paymentAmount').innerHTML = (payAmount + " VND");
			
		}
	});

}

function summitForm(url, isThanhToan) {
	if(isThanhToan.trim() == 'true'){
		var payAmount = Number(document.getElementById('<%=Constants.VPC_AMOUNT %>').value);
		if(payAmount == 0){
			alert("Chưa chọn hồ sơ thanh toán");
			return false;
		}
	}
	document.getElementById('<portlet:namespace />payForm').action = url;
	document.getElementById('<portlet:namespace />payForm').submit();
}

function onchangeSelLinhVucThuTuc() {
	var code = $("select#selLinhVucThuTuc").val();
	console.log('==onchangeSelLinhVucThuTuc==' + code);
	
	if (code == "") { return; }
	
	$.ajax({
		url: '<%=updateContentURL%>',
		dataType : "json",
		data : {
			codeLinhVucThuTuc : code,
			type : 'findThuTucHanhChinhByCodeLinhVucThuTuc'
		},
		type : "get",
		success : function(data) {
			console.log('(2)==onchangeSelLinhVucThuTuc==success==' + data);
			
			//preferred
			//var data2 = JSON.parse(data);
			//console.log(data2);

			var select = $('#selThuTucHanhChinh');
			select.find('option').remove();

			$('<option>').val("-1").text("------------ Chọn tất cả các dịch vụ công ------------").appendTo(select);
			$.each(data, function(idx, obj) {
				console.log(obj);
				$('<option>').val(obj.id).text(obj.name).appendTo(select);
			});
		},
		beforeSend : function(data) {
			console.log("(1)==onchangeSelLinhVucThuTuc==beforeSend==" + data);
		},
		complete : function(data) {
			console.log("(3)==onchangeSelLinhVucThuTuc==complete==" + data);
		},
		error : function(data) {
			console.log("(2)==onchangeSelLinhVucThuTuc==error==" + data);
		}
	});
}

$(function() {
	var tthc = $('#textThuTucHanhChinh').val();
	if (tthc.length > 0) {
		$('#selThuTucHanhChinh').val(tthc);
	}
});
</script>