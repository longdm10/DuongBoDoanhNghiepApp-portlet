<%@page import="javax.portlet.PortletRequest"%>
<%@page import="com.liferay.portlet.PortletURLUtil"%>
<%@ include file="/html/init.jsp"%>

<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinh"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.utils.DoanhNghiepUtils"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.duongbo.business.DanhMucConstants"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.duongbo.business.nghiepvu.NghiepVuUtils"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcBieuMauHoSo"%>
<%@page import="vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@page import="vn.dtt.duongthuy.business.DuongThuyUtil"%>
<%@page import="vn.dtt.duongthuy.business.DTConstants"%>
<%@page import="vn.dtt.duongthuy.maudon.*"%>
<%@page import="vn.dtt.duongthuy.maudon.model.*"%>
<%@page import="vn.dtt.duongbo.dao.common.service.TthcNoidungHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo"%>
<%@page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@page import="vn.dtt.duongthuy.maudon.DonOnline"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.duongbo.utils.format.DateUtils"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>

<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
PortletURL currentURLObj = PortletURLUtil.getCurrent(liferayPortletRequest, liferayPortletResponse);

String currentURL = currentURLObj.toString();

String redirectURL = ParamUtil.getString(request, DTConstants.REDIRECT_URL, currentURL);

long thuTucHanhChinhId = ParamUtil.getLong(request, Constants.ID_THU_TUC_HANH_CHINH);
long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
long thanhPhanHoSoId = ParamUtil.getLong(request, Constants.ID_THANH_PHAN_HO_SO);
long noiDungHoSoId = ParamUtil.getLong(request, Constants.ID_NOI_DUNG_HO_SO);
String noiDungXML = ParamUtil.getString(request, "noiDungXML");

TthcBieuMauHoSo bieuMauHoSo = NghiepVuUtils.getBieuMauHoSoByThanhPhanHoSoId(thanhPhanHoSoId);

TthcThuTucHanhChinh thuTucHanhChinh = null;
if(thuTucHanhChinhId > 0) {
	thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(thuTucHanhChinhId);
}


TthcThanhPhanHoSo thanhPhanHoSo = null;
if(thanhPhanHoSoId > 0) {
	thanhPhanHoSo = TthcThanhPhanHoSoLocalServiceUtil.fetchTthcThanhPhanHoSo(thanhPhanHoSoId);
}

TthcHoSoThuTuc hoSoThuTuc = null;
if(hoSoThuTucId > 0) {
	hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
}

TthcNoidungHoSo noiDungHoSo = null;
if(noiDungHoSoId > 0) {
	noiDungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(noiDungHoSoId);
}

PortletURL actionLuuNoiDungHoSo = renderResponse.createActionURL();
actionLuuNoiDungHoSo.setParameter(ActionRequest.ACTION_NAME, "dtLuuNoiDungHoSo");
actionLuuNoiDungHoSo.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
actionLuuNoiDungHoSo.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
actionLuuNoiDungHoSo.setParameter(Constants.ID_THANH_PHAN_HO_SO, String.valueOf(thanhPhanHoSoId));

PortletURL actionXemTruocNoiDung = renderResponse.createActionURL();
actionXemTruocNoiDung.setParameter(ActionRequest.ACTION_NAME, "dtXemTruocNoiDung");
actionXemTruocNoiDung.setParameter(Constants.ID_THU_TUC_HANH_CHINH, String.valueOf(thuTucHanhChinhId));
actionXemTruocNoiDung.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTucId));
actionXemTruocNoiDung.setParameter(Constants.ID_THANH_PHAN_HO_SO, String.valueOf(thanhPhanHoSoId));
actionXemTruocNoiDung.setParameter("jspBack", "/html/hsdoanhnghiep/thongtinhoso/duongthuy/thanh_phan_ho_so_view.jsp");

Map<String, String> mapDonRequired = new HashMap<String, String>();
Map<String, String> mapDonValue =  new HashMap<String, String>();

%>

<portlet:resourceURL var="resourceURL" ></portlet:resourceURL>
<script>
	function <portlet:namespace />validateForm() {
		var valid = true;
		
		$('.ctrl-required').each(
			function() {
				var name = $(this).attr('name');
				
				var node = $(this);
				
				if($.trim(node.val()) == '') {
					node.addClass('validate-error');
					valid = false;
				} else {
					node.removeClass('validate-error');
				}
			}
		);
		
		if(!valid) {
			alert('Bạn vui lòng nhập đầy đủ dữ liệu (Các trường bôi đỏ) !');
		}
		
		return valid;
	}
	
	function <portlet:namespace/>saveDon() {
		var valid = <portlet:namespace />validateForm();
		
		if(valid) {
			document.getElementById('<portlet:namespace />fm').submit();
		}
	}
	
	$(document).ready(
		function() {
			// Ham set gia tri khi chon combobox kinh gui
			var selKinhGui = $('#<%= renderResponse.getNamespace() + DonOnline.KINH_GUI %>');
			var txtKinhGui = $('#<%= renderResponse.getNamespace() + "txtKinhGui" %>');
			
			if(selKinhGui.length > 0 && txtKinhGui.length > 0) {
				var setTxtKinhGui = function(selKinhGui, txtKinhGui) {
					txtKinhGui.text(selKinhGui.find(":selected").text());
				}
				
				setTxtKinhGui(selKinhGui, txtKinhGui);
				
				selKinhGui.change(function() {
					setTxtKinhGui($(this), txtKinhGui);
				});
			}
			
			// Ham set dieu kien khi click vao input calendar se hien thi calendar de chon
			$(document).on('click', '.ctrl-input-calendar', function(){
				
				var inputCal = $(this);
				
				if($(this).is("span")) {
					inputCal = $(this).prev();
				}
				
				if(inputCal.is("input")) {
					var idElement = inputCal.attr('id');
					
					if(idElement) {
						gtCalendar(idElement);
					}
				}
			});
			
			// Ham khi chon dieu kien GCNKNCM, CCCM se load danh sach hang va set doan text "cho toi duoc" theo dieu kien chon
			var inputDK = $('input[name="<%= renderResponse.getNamespace() + DonOnline.DIEU_KIEN %>"]');
			if(inputDK.length > 0) {
				// Set text "cho toi duoc " theo dieu kien chon
				var setTxtDieuKien = function() {
					var txtDKPlaceHolder = $('#<%= renderResponse.getNamespace() + "txtDieuKien" %>');
					var txtDK = $('input[name="<%= renderResponse.getNamespace() + DonOnline.DIEU_KIEN %>"]:checked').data('text');
					
					if(txtDK.length > 0) {
						txtDKPlaceHolder.text(txtDK);
					}
				}
				
				// Danh sach hang theo dieu kien chon
				var setSelectHang = function() {
					var maDieuKien = $('input[name="<%= renderResponse.getNamespace() + DonOnline.DIEU_KIEN %>"]:checked').val();
					var selectHang = $('#<%= renderResponse.getNamespace() + DonOnline.HANG %>');
					
					if(selectHang.length > 0) {
						$.ajax({
							url: '<%=resourceURL%>',
							dataType: 'json',
							data : {
								maDieuKien : maDieuKien,
								type: 'findHang'
							},
							type: 'get',
							success : function(data) {
								selectHang.find('option').remove();
								
								$('<option>').val("").text("-Lựa chọn-").appendTo(selectHang);
								
								$.each(data, function(idx, obj) {
									$('<option>').val(obj.code).text(obj.name).appendTo(selectHang);
								});
							}
						});
					}
				}
				
				setTxtDieuKien();
				setSelectHang();
				
				inputDK.click(function() {
					setTxtDieuKien();
					setSelectHang();
				});
			}
		}
	);
</script>
