<%@page import="java.util.Calendar"%>
<%@page import="vn.dtt.duongbo.dao.common.service.QlvtPhuongTienCapBienHieuLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapBienHieu"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinh"%>
<%@page import="javax.naming.NoInitialContextException"%>
<%@page import="vn.dtt.duongbo.utils.CommonUtils"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="vn.dtt.duongbo.business.Constants"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="vn.dtt.duongbo.business.DanhMucConstants"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.duongbo.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.DmDataItem"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.duongbo.utils.format.DateUtils"%>
<%@page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<script type="text/javascript" src="<%=request.getContextPath()%>/js/duongbo/vantaitrongnuoc/table_phuong_tien_dang_ki.js?modified=<%=DateUtils.CURRENT_TIME_STAMP%>"></script>

<%
	List<DmDataItem> lstNhanHieu = DanhMucConstants.getNhanHieuPhuongTien();
	
	String loaiTTHC = ParamUtil.getString(request, Constants.LOAI_THU_TUC_HANH_CHINH);
	
	_log.info("-------------------loaiTTHC : " + loaiTTHC);
	
	List<QlvtPhuongTienCapBienHieu> lstPhuongTienCapBienHieu = null;
	
	
	//Ton tai noi dung ho so
	if (noidungHoSo != null) {
		lstPhuongTienCapBienHieu = QlvtPhuongTienCapBienHieuLocalServiceUtil.findByNoiDungHoSoId(noidungHoSo.getId());
	}
	
	if (lstPhuongTienCapBienHieu == null) { lstPhuongTienCapBienHieu = new ArrayList<QlvtPhuongTienCapBienHieu>(); }
	_log.info("-------------------maTTHC : " + thuTucHanhChinh.getMaThuTuc());
	
%>

<div style="">

<div style="overflow:hidden; margin:10px 0; position:relative">
	<div style="overflow-x:auto;">
	<table class="table table-striped table-bordered table-hover m-table" id="tblPhuongTienDangKi" style="width:1100px; max-width:none; margin:0">
		<tbody>
		<tr>
			<th class="text-center" width="40px">STT</th>
			<th class="text-center" style="width: 150px;">Tên hiệu xe</th>
			<th class="text-center" style="width: 180px;">Biển số</th>
			<th class="text-center" style="width: 150px;">Số khung</th>
			<th class="text-center" style="width: 150px;">Số máy</th>
			<th class="text-center">Năm sản xuất</th>
			<th class="text-center">Màu sơn</th>
			<th class="text-center">Số chỗ ngồi</th>
			<th class="decoy">Thao tác</th>
			<th class="text-center colFixedPos">Thao tác<br>(Action)</th>
		</tr>
		<%
		int index = 0;
		
		//-------------------------TRUONG HOP XEM LAI TU DataBase----------------------
		if (noiDungXmml.length() == 0) {
			for (QlvtPhuongTienCapBienHieu item : lstPhuongTienCapBienHieu) {
				%>
				<tr class="trTbl<%=index%>">
					<td class="text-center"><span id="spanStt<%=index%>"><%=(index + 1)%></span></td>
					<td><span id="spanNhanHieu<%=index%>"><%=Validator.isNotNull(item.getNhanHieu()) ? (CommonUtils.getNameItemFromList(lstNhanHieu, item.getNhanHieu())) : ""%></span></td>
					<td><span id="spanBienSo<%=index%>"><%=Validator.isNotNull(item.getBienSo()) ? item.getBienSo() : ""%></span></td>
					<td><span id="spanSoKhung<%=index%>"><%=Validator.isNotNull(item.getSoKhung()) ? item.getSoKhung() : ""%></span></td>
					<td><span id="spanSoMay<%=index%>"><%=Validator.isNotNull(item.getSoMay()) ? item.getSoMay() : ""%></span></td>
					<td><span id="spanNamSanXuat<%=index%>"><%=Validator.isNotNull(item.getNamSanXuat()) ? item.getNamSanXuat() : ""%></span></td>
					<td><span id="spanMauSon<%=index%>"><%=Validator.isNotNull(item.getMauSon()) ? item.getMauSon() : ""%></span></td>
					<td><span id="spanSoChoNgoi<%=index%>"><%=Validator.isNotNull(item.getSoChoNgoi()) ? item.getSoChoNgoi() : ""%></span></td>
					
					<input type="hidden" id="indexRow" name="indexRow" value="<%=index%>">
					<input type="hidden" id="objectPhuongTien<%=index%>" class="objectPhuongTien" name="objectPhuongTien" value="<%=CommonUtils.passPhuongTienCapBienHieuToString(item)%>">
					<td class="decoy"></td>
					<td class="text-center colFixedPos">
						<a onclick="iconSuaPhuongTien(<%=index%>)" title="Sửa" style="margin-right:5px"><i class="fa3 fa fa-pencil-square-o"></i></a>
						<a onclick="iconXoaPhuongTien(<%=index%>)" title="Xóa"><i class="fa3 fa fa-trash-o"></i></a>
					</td>
				</tr>
				<%
				++index;
			}
		}
		
		//-------------------------TRUONG HOP XEM LAI TU noiDungXml----------------------
		if (lstPhuongTienCapBienHieu.size() == 0) {
			String[] lstStringObjctPhuongTienBienHieu = ParamUtil.getParameterValues(request, "objectPhuongTien", new String[]{});
			for (String valPhuongTien : lstStringObjctPhuongTienBienHieu) {
				String[] phuongTien = valPhuongTien.split(";");
				%>
				<tr class="trTbl<%=index%>">
					<td class="text-center"><span id="spanStt<%=index%>"><%=(index + 1)%></span></td>
					<td><span id="spanNhanHieu<%=index%>"><%=(CommonUtils.getNameItemFromList(lstNhanHieu, phuongTien[1]))%></span></td>
					<td><span id="spanBienSo<%=index%>"><%=phuongTien[2]%></span></td>
					<td><span id="spanSoKhung<%=index%>"><%=phuongTien[11]%></span></td>
					<td><span id="spanSoMay<%=index%>"><%=phuongTien[12]%></span></td>
					<td><span id="spanNamSanXuat<%=index%>"><%=phuongTien[5]%></span></td>
					<td><span id="spanMauSon<%=index%>"><%=phuongTien[13]%></span></td>
					<td><span id="spanSoChoNgoi<%=index%>"><%=phuongTien[14]%></span></td>
					
					<input type="hidden" id="indexRow" name="indexRow" value="<%=index%>">
					<input type="hidden" id="objectPhuongTien<%=index%>" class="objectPhuongTien" name="objectPhuongTien" value="<%=valPhuongTien%>">
					
					<td class="decoy"></td>
					<td class="text-center colFixedPos">
						<a onclick="iconSuaPhuongTien(<%=index%>)" title="Sửa" style="margin-right:5px"><i class="fa3 fa fa-pencil-square-o"></i></a>
						<a onclick="iconXoaPhuongTien(<%=index%>)" title="Xóa"><i class="fa3 fa fa-trash-o"></i></a>
					</td>
				</tr>
				<%
				++index;
			}
		}
		
	%>
		
		</tbody>
	</table>
	</div>
</div>
	
	<!-- data-target="#myModal" -->
	<button class="btn btn-primary btn-sm" type="button" onclick="clearDataPopup(); initButton(); openPopup('modalPhuongTien');">Thêm phương tiện</button>
	
</div>



<!-- Modal -->

<div id="modalPhuongTien" class="modal fade" role="dialog">
	<div class="modal-dialog modal-lg">
		<!-- Modal content-->
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
				<h4 class="modal-title text-center">Thêm phương tiện</h4>
			</div>
			<div class="modal-body">
			
				<div class="col-xs-6 form-group">
					<label for="nhanHieu">Nhãn hiệu <span class="red">*</span>:</label>
					<select class="form-control" id="nhanHieu" name="nhanHieu">
						<%
						for (DmDataItem item : lstNhanHieu) {
							%>
							<option value="<%=item.getCode()%>"><%=item.getName()%></option>
							<%
						}
						%>
					</select>
				</div>
				<div class="col-xs-6 form-group">
					<label for="bienSoXe">Biển số <span class="red">*</span>:</label>
					<input type="text" id="bienSoXe" name="bienSoXe" placeholder="" class="form-control">
				</div>
				
				<div class="col-xs-6 form-group">
					<label for="soKhung">Số khung <span class="red">*</span>:</label>
					<input type="text" id="soKhung" name="soKhung" placeholder="" class="form-control">
				</div>
				
				<div class="col-xs-6 form-group">
					<label for="soMay">Số máy <span class="red">*</span>:</label>
					<input type="text" id="soMay" name="soMay" placeholder="" class="form-control">
				</div>
				
				<div class="col-xs-6 form-group">
					<label for="namSanXuat">Năm sản xuất <span class="red">*</span>:</label>
					<input type="text" id="namSanXuat" name="namSanXuat" class="form-control">
				</div>
				
				<div class="col-xs-6 form-group">
					<label for="namSanXuat">Màu Sơn <span class="red">*</span>:</label>
					<input type="text" id="mauSon" name=""mauSon"" class="form-control">
				</div>
				<div class="col-xs-6 form-group">
					<label for="soChoNgoi">Số chỗ ngồi <span class="red">*</span>:</label>
					<input type="text" id="soChoNgoi" name="soChoNgoi" class="form-control">
				</div>
				<div class="clear"></div>
			</div>
			
			<input type="hidden" id="indexPopup" name="indexPopup" value="">
			
			<div class="modal-footer">
				<div class="col-xs-12">
					<button class="btn btn-primary" type="button" id="btnLuuPhuongTien" name="btnLuuPhuongTien" onclick="btnClickThemPhuongTien()" title="Lưu & Đóng">Lưu phương tiện</button>
					<button class="btn btn-primary" type="button" id="btnThemPhuongTien" name="btnThemPhuongTien" onclick="btnClickLuuPhuongTien()" title="Thêm">Thêm phương tiện</button>
					
					<button class="btn btn-primary" type="button" style="display: none;" id="btnSuaPhuongTien" name="btnSuaPhuongTien" onclick="btnClickSuaPhuongTien()" title="Lưu">Lưu phương tiện</button>
					<button class="btn btn-primary" type="button" data-dismiss="modal" title="Đóng">Quay lại</button>
				</div>
			</div>
		</div>
	</div>
</div>

<!-- End modal -->
<input type="hidden" id="loaiLVTT" name="loaiLVTT" value="<%=Constants.LVTT_TRONG_NUOC%>">
<%
if(Constants.TTHC_VANTAI_TRONGNUOC_BIEN_HIEU.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())){
	%>
	<input type="hidden" id="loaiTTHC" name="loaiTTHC" value="<%=Constants.TTHC_VANTAI_TRONGNUOC_BIEN_HIEU%>">
	<%
} else if(Constants.TTHC_VANTAI_TRONGNUOC_BIEN_HIEU_LAI.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())){
	%>
	<input type="hidden" id="loaiTTHC" name="loaiTTHC" value="<%=Constants.TTHC_VANTAI_TRONGNUOC_BIEN_HIEU_LAI%>">
	<%
} else {
	%>
	<input type="hidden" id="loaiTTHC" name="loaiTTHC" value="">
	<%
}
%>

<script type="text/javascript">
	var eq_el_height = function(els, min_or_max) {
		els.each(function() {
			$(this).height('auto');
		});				
		var m = $(els[0]).height();
		els.each(function() {
			var h = $(this).height();

			if (min_or_max === "max") {
				m = h > m ? h : m;
			} else {
				m = h < m ? h : m;
			}
		});
		els.each(function() {
			$(this).height(m);
		});
	};
	
	$('.m-table tr').each(function(){
		eq_el_height($(this).find('th'), "max");
	});
	$('.m-table tr').each(function(){
		eq_el_height($(this).find('td'), "max");
	});
</script>