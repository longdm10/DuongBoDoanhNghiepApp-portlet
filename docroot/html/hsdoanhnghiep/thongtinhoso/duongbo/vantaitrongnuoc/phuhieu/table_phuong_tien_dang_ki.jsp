<%@page import="vn.dtt.duongbo.dao.common.service.QlvtPhuongTienCapPhuHieuLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu"%>
<%@page import="vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapBienHieu"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinh"%>
<%@page import="javax.naming.NoInitialContextException"%>
<%@page import="vn.dtt.duongbo.utils.CommonUtils"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="vn.dtt.duongbo.dao.common.service.QlvtPhuongTienDangKyVietTrungLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.service.QlvtPhuongTienDangKyVietCamLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietTrung"%>
<%@page import="vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCam"%>
<%@page import="vn.dtt.duongbo.dao.common.service.QlvtPhuongTienDangKyVietLaoLocalServiceUtil"%>
<%@page import="vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietLao"%>
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
	List<DmDataItem> lstHinhThucHoatDong = DanhMucConstants.getHinhThucHoatDong();
	List<DmDataItem> lstCuaKhau = DanhMucConstants.getCuaKhauVNTQ();
	List<DmDataItem> lstTuyenHoatDong = DanhMucConstants.getTuyenHoatDongVN();
	List<DmDataItem> lstLoaiHinhHoatDong = DanhMucConstants.getallLoaiHinhHoatDong();
	List<DmDataItem> lstDiemDung = DanhMucConstants.getDiemDoVNTQ();
	List<DmDataItem> listNuocSanXuat = DanhMucConstants.getQuocGia();
	
	
	String loaiTTHC = ParamUtil.getString(request, Constants.LOAI_THU_TUC_HANH_CHINH);
	
	_log.info("-------------------loaiTTHC : " + loaiTTHC);
	
	List<QlvtPhuongTienCapPhuHieu> lstPhuongTienCapPhuHieus = null;
	//Ton tai noi dung ho so
	if (noidungHoSo != null) {
		lstPhuongTienCapPhuHieus = QlvtPhuongTienCapPhuHieuLocalServiceUtil.findByNoiDungHoSoId(noidungHoSo.getId());
	}
	
	if (lstPhuongTienCapPhuHieus == null) { lstPhuongTienCapPhuHieus = new ArrayList<QlvtPhuongTienCapPhuHieu>(); }
	_log.info("-------------------maTTHC : " + thuTucHanhChinh.getMaThuTuc());
%>

<div style="">

<div style="overflow:hidden; margin:10px 0; position:relative">
	<div style="overflow-x:auto;">
	<table class="table table-striped table-bordered table-hover m-table" id="tblPhuongTienDangKi" style="width:1000px; max-width:none; margin:0">
		<tbody>
		<tr>
			<th class="text-center" width="40px">STT</th>
			<th class="text-center" width="180px">Nhãn hiệu xe</th>
			<th class="text-center" width="180px">Biển kiểm soát</th>
			<th class="text-center" width="150px">Sức chứa</th>
			<th class="text-center" width="150px">Nước sản xuất</th>
			<th class="text-center">Năm sản xuất</th>
			<th class="text-center">Tuyến CĐ (HĐ, DL, taxi, xe tải....)</th>
			<th class="decoy">Thao tác</th>
			<th class="text-center colFixedPos">Thao tác</th>
		</tr>
	<%
	int index = 0;
	//-------------------------TRUONG HOP XEM LAI TU DataBase----------------------
	if (noiDungXmml.length() == 0) {
		for (QlvtPhuongTienCapPhuHieu item : lstPhuongTienCapPhuHieus) {
			%>
			<tr class="trTbl<%=index%>">
				<td class="text-center"><span id="spanStt<%=index%>"><%=(index + 1)%></span></td>
				<td class="text-center"><span id="spanNhanHieu<%=index%>"><%=Validator.isNotNull(item.getNhanHieu()) ? (CommonUtils.getNameItemFromList(lstNhanHieu, item.getNhanHieu())) : ""%></span></td>
				<td><span id="spanBienSoXe<%=index%>"><%=Validator.isNotNull(item.getBienSo()) ? item.getBienSo() : ""%></span></td>
				<td><span id="spanTrongTai<%=index%>"><%=Validator.isNotNull(item.getTrongTai()) ? item.getTrongTai() : ""%></span></td>
				<td><span id="spanNuocSanXuat<%=index%>"><%=Validator.isNotNull(item.getNuocSanXuat()) ? (CommonUtils.getNameItemFromList(listNuocSanXuat, item.getNuocSanXuat())) : ""%></span></td>
				<td><span id="spanNamSanXuat<%=index%>"><%=Validator.isNotNull(item.getNamSanXuat()) ? item.getNamSanXuat() : ""%></span></td>
				<td>
					<span id="spanLoaiHinhHd<%=index%>"><%=Validator.isNotNull(item.getLoaiHinhHoatDong()) ? (CommonUtils.getNameItemFromList(lstLoaiHinhHoatDong, item.getLoaiHinhHoatDong())) : ""%></span><br>
					<span id="spanTuyenHd<%=index%>"><%=Validator.isNotNull(item.getTuyenHoatDong()) ? (CommonUtils.getNameItemFromList(lstTuyenHoatDong, item.getTuyenHoatDong())) : ""%></span>
				</td>
				
				<input type="hidden" id="indexRow" name="indexRow" value="<%=index%>">
				<input type="hidden" id="objectPhuongTien<%=index%>" class="objectPhuongTien" name="objectPhuongTien" value="<%=CommonUtils.passPhuongTienCapPhuHieuToString(item)%>">
				
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
	if (lstPhuongTienCapPhuHieus.size() == 0) {
		String[] lstStringObjctPhuongTienVt = ParamUtil.getParameterValues(request, "objectPhuongTien", new String[]{});
		for (String valPhuongTien : lstStringObjctPhuongTienVt) {
			String[] phuongTien = valPhuongTien.split(";");
			%>
			<tr class="trTbl<%=index%>">
				<td class="text-center"><span id="spanStt<%=index%>"><%=(index + 1)%></span></td>
				<td class="text-center"><span id="spanNhanHieu<%=index%>"><%=(CommonUtils.getNameItemFromList(lstNhanHieu, phuongTien[1]))%></span></td>
				<td><span id="spanBienSoXe<%=index%>"><%=phuongTien[2]%></span></td>
				<td><span id="spanTrongTai<%=index%>"><%=phuongTien[3]%></span></td>
				<td><span id="spanNuocSanXuat<%=index%>"><%=(CommonUtils.getNameItemFromList(listNuocSanXuat, phuongTien[4]))%></span></td>
				<td><span id="spanNamSanXuat<%=index%>"><%=phuongTien[5]%></span></td>
				<td>
					<span id="spanLoaiHinhHd<%=index%>"><%=(CommonUtils.getNameItemFromList(lstLoaiHinhHoatDong, phuongTien[6]))%></span><br>
					<span id="spanTuyenHd<%=index%>"><%=CommonUtils.getNameItemFromList(lstTuyenHoatDong, phuongTien[7]) + ", " + CommonUtils.getNameItemFromList(lstTuyenHoatDong, phuongTien[8])%></span>
				</td>
				
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
					<%for (DmDataItem item : lstNhanHieu) {
						%>
						<option value="<%=item.getCode()%>"><%=item.getName()%></option>
						<%
					}%>
					</select>
				</div>
				<div class="col-xs-6 form-group">
					<label for="bienSo">Biển kiểm soát xe <span class="red">*</span>:</label>
					<input type="text" id="bienSoXe" name="bienSoXe" placeholder="" class="form-control">
				</div>
				
				<div class="col-xs-6 form-group">
					<label for="trongTaiGhe">Sức chứa <span class="red">*</span>:</label>
					<input type="text" id="trongTai" name="trongTai" placeholder="" class="form-control">
				</div>
				
				<div class="col-xs-6 form-group">
					<label for="namSanXuat">Nước sản xuất<span class="red">*</span>:</label>
					<select class="form-control" id="nuocSanXuat" name="nuocSanXuat">
						<option value="">--- Chọn nước sản xuất ---</option>
						<%for (DmDataItem item : listNuocSanXuat) {
							%>
							<option value="<%=item.getCode()%>"><%=item.getName()%></option>
							<%
						}%>
					</select>
				</div>
				
				<div class="col-xs-6 form-group">
					<label for="loaiHinhHoatDong">Loại hình <span class="red">*</span>:</label>
					<select class="form-control" id="loaiHinhHoatDong" name="loaiHinhHoatDong" onchange="changLoaiHinhHoatDong()">
						<%for (DmDataItem item : lstLoaiHinhHoatDong) {
							%>
							<option value="<%=item.getCode()%>"><%=item.getName()%></option>
							<%
						}%>
					</select>
				</div>
				
				<div class="col-xs-6 form-group">
					<label for="namSanXuat">Năm sản xuất <span class="red">*</span>:</label>
					<input type="text" id="namSanXuat" name="namSanXuat" class="form-control">
				</div>
				
				<div id="tuyenCoDinhDiv" class="col-xs-12 form-group" style="display: none;">
					<label for="tuyenHoatDong1">Tuyến khai thác 1 <span class="red">*</span>:</label>
					<select class="form-control" id="tuyenHoatDong1" name="tuyenHoatDong1">
					<%for (DmDataItem item : lstTuyenHoatDong) {
						%>
						<option value="<%=item.getCode()%>"><%=item.getName()%></option>
						<%
					}%>
					</select>
					<label for="tuyenHoatDong2">Tuyến khai thác 2<span class="red">*</span>:</label>
					<select class="form-control" id="tuyenHoatDong2" name="tuyenHoatDong2">
					<%for (DmDataItem item : lstTuyenHoatDong) {
						%>
						<option value="<%=item.getCode()%>"><%=item.getName()%></option>
						<%
					}%>
					</select>
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
<% if(Constants.CAP_PHU_HIEU_TAXI_BUYT_TUYEN_CO_DINH_HOP_DONG.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())) {
	%>
	<input type="hidden" id="loaiTTHC" name="loaiTTHC" value="<%=Constants.CAP_PHU_HIEU_TAXI_BUYT_TUYEN_CO_DINH_HOP_DONG%>">
	
<% } else if (Constants.CAP_PHU_HIEU_XE_NOI_BO.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())) {
	%>
	<input type="hidden" id="loaiTTHC" name="loaiTTHC" value="<%=Constants.CAP_PHU_HIEU_XE_NOI_BO%>">

<% } else if (Constants.CAP_PHU_HIEU_XE_TRUNG_CHUYEN.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())) {
	%>
	<input type="hidden" id="loaiTTHC" name="loaiTTHC" value="<%=Constants.CAP_PHU_HIEU_XE_TRUNG_CHUYEN%>">
	
<% } else if (Constants.CAP_PHU_HIEU_XE_CONTENO_XETAI.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())) {
	%>
	<input type="hidden" id="loaiTTHC" name="loaiTTHC" value="<%=Constants.CAP_PHU_HIEU_XE_CONTENO_XETAI%>">
<% } %>

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

	function changLoaiHinhHoatDong() {

		var loaiHinhHoatDong = document.getElementById("loaiHinhHoatDong");
		var giaTri = loaiHinhHoatDong.options[loaiHinhHoatDong.selectedIndex].value;
		if (giaTri == 'DM_LHHD_HKTCD') {
			//document.getElementById("tuyenCoDinhDiv").show();
			document.getElementById("tuyenCoDinhDiv").style.display = "block";
		}else{
			document.getElementById("tuyenCoDinhDiv").style.display = "none";
			}
	}
</script>