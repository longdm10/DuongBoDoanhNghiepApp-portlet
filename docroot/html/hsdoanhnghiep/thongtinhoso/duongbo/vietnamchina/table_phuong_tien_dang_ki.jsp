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

<script type="text/javascript" src="<%=request.getContextPath()%>/js/duongbo/trungquoc/table_phuong_tien_dang_ki.js?modified=<%=DateUtils.CURRENT_TIME_STAMP%>"></script>

<%
	List<DmDataItem> lstNhanHieu = DanhMucConstants.getNhanHieuPhuongTien();
	List<DmDataItem> lstHinhThucHoatDong = DanhMucConstants.getHinhThucHoatDong();
	List<DmDataItem> lstCuaKhau = DanhMucConstants.getCuaKhauVNTQ();
	List<DmDataItem> lstTuyenHoatDong = DanhMucConstants.getTuyenHoatDongVnTQ();
	List<DmDataItem> lstDiemDung = DanhMucConstants.getDiemDoVNTQ();
	List<DmDataItem> lstLoaiXe = DanhMucConstants.getLoaiXe();
	
	
	List<DmDataItem> lstTuyenHoatDongCongVu = DanhMucConstants.getTuyenVietNamTQ_CongVu();
	
	String loaiTTHC = ParamUtil.getString(request, Constants.LOAI_THU_TUC_HANH_CHINH);
	_log.info("--------loaiTTHC : " + loaiTTHC);
	
	List<QlvtPhuongTienDangKyVietTrung> lstPhuongTienVietTrung = null;
	
	
	//Ton tai noi dung ho so
	if (noidungHoSo != null) {
		lstPhuongTienVietTrung = QlvtPhuongTienDangKyVietTrungLocalServiceUtil.findByNoiDungHoSoId(noidungHoSo.getId());
	}
	
	if (lstPhuongTienVietTrung == null) { lstPhuongTienVietTrung = new ArrayList<QlvtPhuongTienDangKyVietTrung>(); }
	_log.info("--------maTTHC : " + thuTucHanhChinh.getMaThuTuc());
	
%>

<div style="padding:0 15px">

<div style="overflow:hidden; margin:10px 0; position:relative">
	<div style="overflow-x:auto;">
	
	<%
	if (Constants.TTHC_VIET_TQ_DANG_KY_KHAI_THAC_TUYEN.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim()) ||
		Constants.TTHC_VIET_TQ_BO_SUNG_THAY_THE_PHUONG_TIEN_KHAI_THAC_TUYEN.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())) {
		%>
		<table class="table table-striped table-bordered table-hover m-table" id="tblPhuongTienDangKi" style="width:1088px; max-width:none; margin:0">
			<tbody>
			<tr>
				<th class="text-center" width="40px">STT</th>
				<th class="text-center" style="width: 130px;">Biển kiểm soát xe</th>
				<th class="text-center" style="width: 200px;">Tên đăng ký sở hữu xe</th>
				<th class="text-center" style="width: 150px;">Loại xe</th>
				<th class="text-center" style="width: 150px;">Số ghế</th>
				<th class="text-center" style="width: 150px;">Năm<br/>sản xuất</th>
				<th class="text-center" style="width: 200px;">Cửa khẩu<br/>xuất - nhập</th>
				<th class="decoy" style="height: 60px;">Thao tác</th>
				<th class="text-center colFixedPos">Thao tác</th>
			</tr>
	<%
	} else if (Constants.TTHC_VIET_TQ_CAP_PHEP_VAN_TAI_LOAI_D.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim()) || 
			Constants.TTHC_VIET_TQ_CAP_GIAY_GIOI_THIEU_DE_NGHI_CAP_PHEP_VAN_TAI_LOAI_D.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())) {
		%>
		<table class="table table-striped table-bordered table-hover m-table" id="tblPhuongTienDangKi" style="width:1700px; max-width:none; margin:0">
			<tbody>
			<tr>
				<th class="text-center" width="40px">STT</th>
				<th class="text-center" width="100px">Biển số xe<br>(Registration number plate)</th>
				<th class="text-center" width="110px">Thời gian cấp phép <br>(Date of issue)</th>
				<th class="text-center" width="220px">Tuyến<br>(Route)</th>
				<th class="text-center" width="220px">Hành trình đề nghị<br>(Proposed route)</th>
				<th class="text-center" width="275px">Các điểm dừng đỗ đề nghị<br>(Proposed stops and parking places)</th>
				<th class="text-center">Dự kiến thời gian khởi hành<br>(Proposed time of departure)</th>
				<th class="text-center">Loại hàng vận chuyển<br>(Good type)</th>
				<th class="text-center">Trọng tải<br>(Weight)</th>
				<th class="text-center">Nhãn hiệu<br>(Mark)</th>
				<th class="text-center">Màu sơn<br>(Color)</th>
				<th class="text-center">Số khung<br>(Chassic No)</th>
				<th class="text-center">Số máy<br>(Engine No)</th>
				<th class="decoy">Thao tác</th>
				<th class="text-center colFixedPos">Thao tác</th>
			</tr>
	<%
	} else if (Constants.TTHC_VIET_TQ_CAP_PHEP_VAN_TAI_LOAI_ABCEFG_LAN_DAU.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim()) ||
			Constants.TTHC_VIET_TQ_CAP_LAI_GPVT_A_E_HET_HAN.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())) {
		%>
		<table class="table table-striped table-bordered table-hover m-table" id="tblPhuongTienDangKi" style="width:1200px; max-width:none; margin:0">
			<tbody>
			<tr>
				<th class="text-center" width="40px">STT</th>
				<th class="text-center" width="100px">Biển số xe</th>
				<th class="text-center" width="100px">Thời gian đề nghị<br>cấp giấy phép</th>
				<th class="text-center" width="210px">Tuyến hoạt động</th>
				<th class="text-center" width="220px">Điểm dừng nghỉ trên đường</th>
				<th class="text-center" width="220px">Hình thức<br>hoạt động</th>
				<th class="text-center">Trọng tải<br>(ghế)</th>
				<th class="text-center">Nhãn hiệu<br>Phương tiện</th>
				<th class="decoy">Thao tác</th>
				<th class="text-center colFixedPos">Thao tác</th>
			</tr>
	<%
	} else if(Constants.TTHC_VIET_TQ_CAP_PHEP_VAN_TAI_CONG_VU.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())){
		%>
		<table class="table table-striped table-bordered table-hover m-table" id="tblPhuongTienDangKi" style="width:1050px; max-width:none; margin:0">
			<tbody>
			<tr>
				<th class="text-center" width="40px">STT</th>
				<th class="text-center" width="100px">Biển số xe</th>
				<th class="text-center" width="110px">Thời gian đề nghị<br>cấp giấy phép</th>
				<th class="text-center" width="220px">Tuyến hoạt động</th>
				<th class="text-center" width="230px">Cửa khẩu<br>xuất-nhập</th>
				<th class="text-center" width="150px">Nhãn hiệu<br>Phương tiện</th>
				<th class="text-center" width="132px">Trọng tải<br>(ghế)</th>
				<th class="decoy">Thao tác</th>
				<th class="text-center colFixedPos">Thao tác</th>
			</tr>
	<%
	} else if(Constants.TTHC_VIET_TQ_CAP_LAI_GPVT_A_D_E_HONG_MAT.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())){
		%>
		<table class="table table-striped table-bordered table-hover m-table" id="tblPhuongTienDangKi" style="width:1100px; max-width:none; margin:0">
			<tbody>
			<tr>
				<th class="text-center" width="40px">STT</th>
				<th class="text-center" width="100px">Biển số xe<br>(Registration number plate)</th>
				<th class="text-center" width="100px">Thời gian<br/>đề nghị<br/>cấp<br/>giấy phép<br>(Date of requesting for transport permit)</th>
				<th class="text-center" width="210px">Tuyến<br/>hoạt động<br>(Route)</th>
				<th class="text-center" width="220px">Điểm<br/>dừng nghỉ<br/>trên đường<br>(Stop on roads)</th>
				<th class="text-center" width="120px">Số giấy phép vận tải bị mất, hỏng<br>( Lost, damaged transport permit No)</th>
				<th class="text-center" width="120px">Trọng tải<br/>(số ghế, tấn)<br>(Weight / number of seat, ton)</th>
				<th class="text-center" width="122px">Nhãn hiệu<br/>phương tiện<br>(Mark)</th>
				<th class="decoy">Thao tác</th>
				<th class="text-center colFixedPos">Thao tác<br>(Action)</th>
			</tr>
		<%
	}
	
	//------------------------------------TR------------------------------------
	int index = 0;
	//---------------START----vietnamchina/dang_ki_khai_thac_tuyen_viet_trung.jsp----DBVN-TQ8
	if (Constants.TTHC_VIET_TQ_DANG_KY_KHAI_THAC_TUYEN.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())) {
		
		//-------------------------------------------TRUONG HOP XEM LAI TU DataBase----------------------
		if (noiDungXmml.length() == 0) {
			for (QlvtPhuongTienDangKyVietTrung item : lstPhuongTienVietTrung) {
				%>
				<tr class="trTbl<%=index%>">
					<td class="text-center"><span id="spanStt<%=index%>"><%=(index + 1)%></span></td>
					<td><span id="spanBienSoXe<%=index%>"><%=Validator.isNotNull(item.getBienSo()) ? item.getBienSo() : ""%></span></td>
					<td><span id="spanTenDangKySoHuuXe<%=index%>"><%=Validator.isNotNull(item.getTenDangKySoHuu()) ? item.getTenDangKySoHuu() : ""%></span></td>
					<td><span id="spanLoaiXe<%=index%>"><%=Validator.isNotNull(item.getLoaiXe()) ? (CommonUtils.getNameItemFromList(lstLoaiXe, item.getLoaiXe())) : ""%></span></td>
					<td><span id="spanTrongTai<%=index%>"><%=Validator.isNotNull(item.getTrongTai()) ? item.getTrongTai() : ""%></span></td>
					<td><span id="spanNamSanXuat<%=index%>"><%=Validator.isNotNull(item.getNamSanXuat()) ? item.getNamSanXuat() : ""%></span></td>
					<td><span id="spanCuaKhau<%=index%>"><%=Validator.isNotNull(item.getCuaKhauXuatNhap()) ? (CommonUtils.getNameItemFromList(lstCuaKhau, item.getCuaKhauXuatNhap())) : ""%></span></td>
					
					<input type="hidden" id="indexRow" name="indexRow" value="<%=index%>">
					<input type="hidden" id="objectPhuongTien<%=index%>" class="objectPhuongTien" name="objectPhuongTien" value="<%=CommonUtils.passPhuongTienVietTrungToString(item)%>">
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
		if (lstPhuongTienVietTrung.size() == 0) {
			String[] lstStringObjctPhuongTienKhaiThac = ParamUtil.getParameterValues(request, "objectPhuongTien", new String[]{});
			for (String valPhuongTien : lstStringObjctPhuongTienKhaiThac) {
				String[] phuongTien = valPhuongTien.split(";");
				%>
				<tr class="trTbl<%=index%>">
					<td class="text-center"><span id="spanStt<%=index%>"><%=(index + 1)%></span></td>
					<td><span id="spanBienSoXe<%=index%>"><%=phuongTien[1]%></span></td>
					<td><span id="spanTenDangKySoHuuXe<%=index%>"><%=phuongTien[22]%></span></td>
					<td><span id="spanLoaiXe<%=index%>"><%=(CommonUtils.getNameItemFromList(lstLoaiXe, phuongTien[23]))%></span></td>
					<td><span id="spanTrongTai<%=index%>"><%=phuongTien[3]%></span></td>
					<td><span id="spanNamSanXuat<%=index%>"><%=phuongTien[4]%></span></td>
					<td><span id="spanCuaKhau<%=index%>"><%=(CommonUtils.getNameItemFromList(lstCuaKhau, phuongTien[6]))%></span></td>
					
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
		
		
	//---------------END----vietnamchina/dang_ki_khai_thac_tuyen_viet_trung.jsp----DBVN-TQ8
		
	
	//--------------------vietnamchina/bo_sung_thay_the_khai_thac_tuyen_viet_trung.jsp
	} else if(Constants.TTHC_VIET_TQ_BO_SUNG_THAY_THE_PHUONG_TIEN_KHAI_THAC_TUYEN.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())) {
		
		//-------------------------------------------TRUONG HOP XEM LAI TU DataBase----------------------
		if (noiDungXmml.length() == 0) {
			for (QlvtPhuongTienDangKyVietTrung item : lstPhuongTienVietTrung) {
				%>
				<tr class="trTbl<%=index%>">
					<td class="text-center"><span id="spanStt<%=index%>"><%=(index + 1)%></span></td>
					<td><span id="spanBienSoXe<%=index%>"><%=Validator.isNotNull(item.getBienSo()) ? item.getBienSo() : ""%></span></td>
					<td><span id="spanTenDangKySoHuuXe<%=index%>"><%=Validator.isNotNull(item.getTenDangKySoHuu()) ? item.getTenDangKySoHuu() : ""%></span></td>
					<td><span id="spanLoaiXe<%=index%>"><%=Validator.isNotNull(item.getLoaiXe()) ? (CommonUtils.getNameItemFromList(lstLoaiXe, item.getLoaiXe())) : ""%></span></td>
					<td><span id="spanTrongTai<%=index%>"><%=Validator.isNotNull(item.getTrongTai()) ? item.getTrongTai() : ""%></span></td>
					<td><span id="spanNamSanXuat<%=index%>"><%=Validator.isNotNull(item.getNamSanXuat()) ? item.getNamSanXuat() : ""%></span></td>
					<td><span id="spanCuaKhau<%=index%>"><%=Validator.isNotNull(item.getCuaKhauXuatNhap()) ? (CommonUtils.getNameItemFromList(lstCuaKhau, item.getCuaKhauXuatNhap())) : ""%></span></td>
					<input type="hidden" id="indexRow" name="indexRow" value="<%=index%>">
					<input type="hidden" id="objectPhuongTien<%=index%>" class="objectPhuongTien" name="objectPhuongTien" value="<%=CommonUtils.passPhuongTienVietTrungToString(item)%>">
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
		if (lstPhuongTienVietTrung.size() == 0) {
			String[] lstStringObjctPhuongTienBsung = ParamUtil.getParameterValues(request, "objectPhuongTien", new String[]{});
			for (String valPhuongTien : lstStringObjctPhuongTienBsung) {
				String[] phuongTien = valPhuongTien.split(";");
				%>
				<tr class="trTbl<%=index%>">
					<td class="text-center"><span id="spanStt<%=index%>"><%=(index + 1)%></span></td>
					<td><span id="spanBienSoXe<%=index%>"><%=phuongTien[1]%></span></td>
					<td><span id="spanTenDangKySoHuuXe<%=index%>"><%=phuongTien[22]%></span></td>
					<td><span id="spanLoaiXe<%=index%>"><%=(CommonUtils.getNameItemFromList(lstLoaiXe, phuongTien[23]))%></span></td>
					<td><span id="spanTrongTai<%=index%>"><%=phuongTien[3]%></span></td>
					<td><span id="spanNamSanXuat<%=index%>"><%=phuongTien[4]%></span></td>
					<td><span id="spanCuaKhau<%=index%>"><%=(CommonUtils.getNameItemFromList(lstCuaKhau, phuongTien[6]))%></span></td>
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
		
	}
	
	//------------------------START-----------------cap_giay_phep_van_tai_viet_trung_A_B_C_E_F_G.jsp--------------------------------
	//cap_lai_giay_phep_van_tai_loai_A_E_do_het_han_viet_trung.jsp
	else if(Constants.TTHC_VIET_TQ_CAP_PHEP_VAN_TAI_LOAI_ABCEFG_LAN_DAU.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim()) ||
			Constants.TTHC_VIET_TQ_CAP_LAI_GPVT_A_E_HET_HAN.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())) {
		
		//-------------------------------------------TRUONG HOP XEM LAI TU DataBase----------------------
		if (noiDungXmml.length() == 0) {
			for (QlvtPhuongTienDangKyVietTrung item : lstPhuongTienVietTrung) {
				%>
				<tr class="trTbl<%=index%>">
					<td class="text-center"><span id="spanStt<%=index%>"><%=(index + 1)%></span></td>
					<td><span id="spanBienSoXe<%=index%>"><%=Validator.isNotNull(item.getBienSo()) ? item.getBienSo() : ""%></span></td>
					<td><span id="spanThoiGianDeNghi<%=index%>"><%=DateUtils.dateToString("dd/MM/yyyy", item.getThoiGianXinCapPhepTu()) + " - " + DateUtils.dateToString("dd/MM/yyyy", item.getThoiGianXinCapPhepDen())%></span></td>
					<td><span id="spanTuyenHd<%=index%>"><%=Validator.isNotNull(item.getTuyenHoatDong()) ? (CommonUtils.getNameItemFromList(lstTuyenHoatDong, item.getTuyenHoatDong())) : ""%></span></td>
					<td><span id="spanDiemDungNghi<%=index%>"><%=Validator.isNotNull(item.getDiemDungDoDangKy()) ? CommonUtils.getListNameItemFromList(lstDiemDung, item.getDiemDungDoDangKy().split(",")) : ""%></span></td>
					<td><span id="spanHinhThucHd<%=index%>"><%=Validator.isNotNull(item.getNhanHieu()) ? (CommonUtils.getNameItemFromList(lstHinhThucHoatDong, item.getHinhThucHoatDong())) : ""%></span></td>
					<td><span id="spanTrongTai<%=index%>"><%=Validator.isNotNull(item.getTrongTai()) ? item.getTrongTai() : ""%></span></td>
					<td class="text-center"><span id="spanNhanHieu<%=index%>"><%=Validator.isNotNull(item.getNhanHieu()) ? (CommonUtils.getNameItemFromList(lstNhanHieu, item.getNamSanXuat())) : ""%></span></td>
					
					<input type="hidden" id="indexRow" name="indexRow" value="<%=index%>">
					<input type="hidden" id="objectPhuongTien<%=index%>" class="objectPhuongTien" name="objectPhuongTien" value="<%=CommonUtils.passPhuongTienVietTrungToString(item)%>">
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
		if (lstPhuongTienVietTrung.size() == 0) {
			String[] lstStringObjctPhuongTienVanTai = ParamUtil.getParameterValues(request, "objectPhuongTien", new String[]{});
			for (String valPhuongTien : lstStringObjctPhuongTienVanTai) {
				String[] phuongTien = valPhuongTien.split(";");
				%>
				<tr class="trTbl<%=index%>">
					<td class="text-center"><span id="spanStt<%=index%>"><%=(index + 1)%></span></td>
					<td><span id="spanBienSoXe<%=index%>"><%=phuongTien[1]%></span></td>
					<td><span id="spanThoiGianDeNghi<%=index%>"><%=phuongTien[9] + " - " + phuongTien[10]%></span></td>
					<td><span id="spanTuyenHd<%=index%>"><%=(CommonUtils.getNameItemFromList(lstTuyenHoatDong, phuongTien[8]))%></span></td>
					<td><span id="spanDiemDungNghi<%=index%>"><%=CommonUtils.getListNameItemFromList(lstDiemDung, phuongTien[18].replace("#", ",").split(","))%></span></td>
					<td><span id="spanHinhThucHd<%=index%>"><%=CommonUtils.getNameItemFromList(lstHinhThucHoatDong, phuongTien[5])%></span></td>
					<td><span id="spanTrongTai<%=index%>"><%=phuongTien[3]%></span></td>
					<td class="text-center"><span id="spanNhanHieu<%=index%>"><%=(CommonUtils.getNameItemFromList(lstNhanHieu, phuongTien[2]))%></span></td>
					
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
	//-----------------------END------------------cap_giay_phep_van_tai_viet_trung_A_B_C_E_F_G.jsp--------------------------------
	
	//--------------------START---------cap_lai_giay_phep_van_tai_loai_A_D_E_do_hu_hong_mat_mat.jsp-------------
	} else if (Constants.TTHC_VIET_TQ_CAP_LAI_GPVT_A_D_E_HONG_MAT.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())) {
		
		//-------------------------------------------TRUONG HOP XEM LAI TU DataBase----------------------
		if (noiDungXmml.length() == 0) {
			for (QlvtPhuongTienDangKyVietTrung item : lstPhuongTienVietTrung) {
				%>
				<tr class="trTbl<%=index%>">
					<td class="text-center"><span id="spanStt<%=index%>"><%=(index + 1)%></span></td>
					<td><span id="spanBienSoXe<%=index%>"><%=Validator.isNotNull(item.getBienSo()) ? item.getBienSo() : ""%></span></td>
					<td><span id="spanThoiGianDeNghi<%=index%>"><%=DateUtils.dateToString("dd/MM/yyyy", item.getThoiGianXinCapPhepTu()) + " - " + DateUtils.dateToString("dd/MM/yyyy", item.getThoiGianXinCapPhepDen())%></span></td>
					<td><span id="spanTuyenHd<%=index%>"><%=Validator.isNotNull(item.getTuyenHoatDong()) ? (CommonUtils.getNameItemFromList(lstTuyenHoatDong, item.getTuyenHoatDong())) : ""%></span></td>
					<td><span id="spanDiemDungNghi<%=index%>"><%=Validator.isNotNull(item.getDiemDungDoDangKy()) ? CommonUtils.getListNameItemFromList(lstDiemDung, item.getDiemDungDoDangKy().split(",")) : ""%></span></td>
					<td><span id="spanSoGiayPhepMatHong<%=index%>"><%=Validator.isNotNull(item.getNhanHieu()) ? (CommonUtils.getNameItemFromList(lstHinhThucHoatDong, item.getHinhThucHoatDong())) : ""%></span></td>
					<td><span id="spanTrongTai<%=index%>"><%=Validator.isNotNull(item.getTrongTai()) ? item.getTrongTai() : ""%></span></td>
					<td class="text-center"><span id="spanNhanHieu<%=index%>"><%=Validator.isNotNull(item.getNhanHieu()) ? (CommonUtils.getNameItemFromList(lstNhanHieu, item.getNamSanXuat())) : ""%></span></td>
					
					<input type="hidden" id="indexRow" name="indexRow" value="<%=index%>">
					<input type="hidden" id="objectPhuongTien<%=index%>" class="objectPhuongTien" name="objectPhuongTien" value="<%=CommonUtils.passPhuongTienVietTrungToString(item)%>">
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
		if (lstPhuongTienVietTrung.size() == 0) {
			String[] lstStringObjctPhuongTienHongMat = ParamUtil.getParameterValues(request, "objectPhuongTien", new String[]{});
			for (String valPhuongTien : lstStringObjctPhuongTienHongMat) {
				String[] phuongTien = valPhuongTien.split(";");
				%>
				<tr class="trTbl<%=index%>">
					<td class="text-center"><span id="spanStt<%=index%>"><%=(index + 1)%></span></td>
					<td><span id="spanBienSoXe<%=index%>"><%=phuongTien[1]%></span></td>
					<td><span id="spanThoiGianDeNghi<%=index%>"><%=phuongTien[9] + " - " + phuongTien[10]%></span></td>
					<td><span id="spanTuyenHd<%=index%>"><%=(CommonUtils.getNameItemFromList(lstTuyenHoatDong, phuongTien[8]))%></span></td>
					<td><span id="spanDiemDungNghi<%=index%>"><%=CommonUtils.getListNameItemFromList(lstDiemDung, phuongTien[18].replace("#", ",").split(","))%></span></td>
					<td><span id="spanSoGiayPhepMatHong<%=index%>"><%=(CommonUtils.getNameItemFromList(lstHinhThucHoatDong, phuongTien[20]))%></span></td>
					<td><span id="spanTrongTai<%=index%>"><%=phuongTien[3]%></span></td>
					<td class="text-center"><span id="spanNhanHieu<%=index%>"><%=(CommonUtils.getNameItemFromList(lstNhanHieu, phuongTien[2]))%></span></td>
					
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

	//--------------------END---------cap_lai_giay_phep_van_tai_loai_A_D_E_do_hu_hong_mat_mat.jsp-------------
	

	//---------------------START-------vietnamchina/cap_giay_phep_van_tai_cho_xe_cong_vu_viet_trung.jsp
	} else if(Constants.TTHC_VIET_TQ_CAP_PHEP_VAN_TAI_CONG_VU.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())) {
		
		//-------------------------------------------TRUONG HOP XEM LAI TU DataBase----------------------
		if (noiDungXmml.length() == 0) {
			for (QlvtPhuongTienDangKyVietTrung item : lstPhuongTienVietTrung) {
				%>
				<tr class="trTbl<%=index%>">
					<td class="text-center"><span id="spanStt<%=index%>"><%=(index + 1)%></span></td>
					<td><span id="spanBienSoXe<%=index%>"><%=Validator.isNotNull(item.getBienSo()) ? item.getBienSo() : ""%></span></td>
					<td><span id="spanThoiGianDeNghi<%=index%>"><%=DateUtils.dateToString("dd/MM/yyyy", item.getThoiGianXinCapPhepTu()) + " - " + DateUtils.dateToString("dd/MM/yyyy", item.getThoiGianXinCapPhepDen())%></span></td>
					<td><span id="spanTuyenHd<%=index%>"><%=Validator.isNotNull(item.getTuyenHoatDong()) ? (CommonUtils.getNameItemFromList(lstTuyenHoatDongCongVu, item.getTuyenHoatDong())) : ""%></span></td>
					<td><span id="spanCuaKhau<%=index%>"><%=Validator.isNotNull(item.getCuaKhauXuatNhap()) ? (CommonUtils.getNameItemFromList(lstCuaKhau, item.getCuaKhauXuatNhap())) : ""%></span></td>
					<td><span id="spanTrongTai<%=index%>"><%=Validator.isNotNull(item.getTrongTai()) ? item.getTrongTai() : ""%></span></td>
					<td class="text-center"><span id="spanNhanHieu<%=index%>"><%=Validator.isNotNull(item.getNhanHieu()) ? (CommonUtils.getNameItemFromList(lstNhanHieu, item.getNamSanXuat())) : ""%></span></td>
					
					<input type="hidden" id="indexRow" name="indexRow" value="<%=index%>">
					<input type="hidden" id="objectPhuongTien<%=index%>" class="objectPhuongTien" name="objectPhuongTien" value="<%=CommonUtils.passPhuongTienVietTrungToString(item)%>">
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
		if (lstPhuongTienVietTrung.size() == 0) {
			String[] lstStringObjctPhuongTienCongVu = ParamUtil.getParameterValues(request, "objectPhuongTien", new String[]{});
			for (String valPhuongTien : lstStringObjctPhuongTienCongVu) {
				String[] phuongTien = valPhuongTien.split(";");
				%>
				<tr class="trTbl<%=index%>">
					<td class="text-center"><span id="spanStt<%=index%>"><%=(index + 1)%></span></td>
					<td><span id="spanBienSoXe<%=index%>"><%=phuongTien[1]%></span></td>
					<td><span id="spanThoiGianDeNghi<%=index%>"><%=phuongTien[9] + " - " + phuongTien[10]%></span></td>
					<td><span id="spanTuyenHd<%=index%>"><%=(CommonUtils.getNameItemFromList(lstTuyenHoatDongCongVu, phuongTien[8]))%></span></td>
					<td><span id="spanCuaKhau<%=index%>"><%=(CommonUtils.getNameItemFromList(lstCuaKhau, phuongTien[6]))%></span></td>
					<td><span id="spanTrongTai<%=index%>"><%=phuongTien[3]%></span></td>
					<td class="text-center"><span id="spanNhanHieu<%=index%>"><%=(CommonUtils.getNameItemFromList(lstNhanHieu, phuongTien[2]))%></span></td>
					
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
	//---------------------END-------vietnamchina/cap_giay_phep_van_tai_cho_xe_cong_vu_viet_trung.jsp
	
	
	//---------------------START-------vietnamchina/cap_giay_phep_van_tai_loai_D_view.jsp-----------
	} else if (Constants.TTHC_VIET_TQ_CAP_PHEP_VAN_TAI_LOAI_D.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim()) || 
			Constants.TTHC_VIET_TQ_CAP_GIAY_GIOI_THIEU_DE_NGHI_CAP_PHEP_VAN_TAI_LOAI_D.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())) {
		
		//-------------------------------------------TRUONG HOP XEM LAI TU DataBase----------------------
		if (noiDungXmml.length() == 0) {
			for (QlvtPhuongTienDangKyVietTrung item : lstPhuongTienVietTrung) {
				%>
				<tr class="trTbl<%=index%>">
					<td class="text-center"><span id="spanStt<%=index%>"><%=(index + 1)%></span></td>
					<td><span id="spanBienSoXe<%=index%>"><%=Validator.isNotNull(item.getBienSo()) ? item.getBienSo() : ""%></span></td>
					<td><span id="spanThoiGianDeNghi<%=index%>"><%=DateUtils.dateToString("dd/MM/yyyy", item.getThoiGianXinCapPhepTu()) + " - " + DateUtils.dateToString("dd/MM/yyyy", item.getThoiGianXinCapPhepDen())%></span></td>
					<td><span id="spanTuyenHd<%=index%>"><%=Validator.isNotNull(item.getTuyenHoatDong()) ? (CommonUtils.getNameItemFromList(lstTuyenHoatDong, item.getTuyenHoatDong())) : ""%></span></td>
					<td><span id="spanHanhTrinhDeNghi<%=index%>"><%=Validator.isNotNull(item.getHanhTrinhDeNghi()) ? item.getHanhTrinhDeNghi() : ""%></span></td>
					<td><span id="spanDiemDungNghi<%=index%>"><%=Validator.isNotNull(item.getDiemDungDoDangKy()) ? CommonUtils.getListNameItemFromList(lstDiemDung, item.getDiemDungDoDangKy().split(",")) : ""%></span></td>
					<td><span id="spanThoiGianKhoiHanhDuKien<%=index%>"><%=DateUtils.dateToString("dd/MM/yyyy", item.getThoiGianDuKienKhoiHanh())%></span></td>
					<td><span id="spanLoaiHangVanChuyen<%=index%>"><%=Validator.isNotNull(item.getLoaiHangVanChuyen()) ? item.getLoaiHangVanChuyen() : ""%></span></td>
					
					<td><span id="spanTrongTai<%=index%>"><%=Validator.isNotNull(item.getTrongTai()) ? item.getTrongTai() : ""%></span></td>
					<td class="text-center"><span id="spanNhanHieu<%=index%>"><%=Validator.isNotNull(item.getNhanHieu()) ? (CommonUtils.getNameItemFromList(lstNhanHieu, item.getNhanHieu())) : ""%></span></td>
					<td><span id="spanMauSon<%=index%>"><%=Validator.isNotNull(item.getMauSon()) ? item.getMauSon() : ""%></span></td>
					<td><span id="spanSoKhung<%=index%>"><%=Validator.isNotNull(item.getSoKhung()) ? item.getSoKhung() : ""%></span></td>
					<td><span id="spanSoMay<%=index%>"><%=Validator.isNotNull(item.getSoMay()) ? item.getSoMay() : ""%></span></td>
					
					<input type="hidden" id="indexRow" name="indexRow" value="<%=index%>">
					<input type="hidden" id="objectPhuongTien<%=index%>" class="objectPhuongTien" name="objectPhuongTien" value="<%=CommonUtils.passPhuongTienVietTrungToString(item)%>">
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
		if (lstPhuongTienVietTrung.size() == 0) {
			String[] lstStringObjctPhuongTienLoaiD = ParamUtil.getParameterValues(request, "objectPhuongTien", new String[]{});
			for (String valPhuongTien : lstStringObjctPhuongTienLoaiD) {
				String[] phuongTien = valPhuongTien.split(";");
				%>
				<tr class="trTbl<%=index%>">
					<td class="text-center"><span id="spanStt<%=index%>"><%=(index + 1)%></span></td>
					<td><span id="spanBienSoXe<%=index%>"><%=phuongTien[1]%></span></td>
					<td><span id="spanThoiGianDeNghi<%=index%>"><%=phuongTien[9] + " - " + phuongTien[10]%></span></td>
					<td><span id="spanTuyenHd<%=index%>"><%=(CommonUtils.getNameItemFromList(lstTuyenHoatDong, phuongTien[8]))%></span></td>
					<td><span id="spanHanhTrinhDeNghi<%=index%>"><%=phuongTien[19]%></span></td>
					<td><span id="spanDiemDungNghi<%=index%>"><%=CommonUtils.getListNameItemFromList(lstDiemDung, phuongTien[18].replace("#", ",").split(","))%></span></td>
					<td><span id="spanThoiGianKhoiHanhDuKien<%=index%>"><%=phuongTien[15]%></span></td>
					<td><span id="spanLoaiHangVanChuyen<%=index%>"><%=phuongTien[14]%></span></td>
					
					<td><span id="spanTrongTai<%=index%>"><%=phuongTien[3]%></span></td>
					<td class="text-center"><span id="spanNhanHieu<%=index%>"><%=(CommonUtils.getNameItemFromList(lstNhanHieu, phuongTien[2]))%></span></td>
					<td><span id="spanMauSon<%=index%>"><%=phuongTien[12]%></span></td>
					<td><span id="spanSoKhung<%=index%>"><%=phuongTien[11]%></span></td>
					<td><span id="spanSoMay<%=index%>"><%=phuongTien[13]%></span></td>
					
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
	}
	//---------------------END-------vietnamchina/cap_giay_phep_van_tai_loai_D_view.jsp-----------
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
			<%
			if(Constants.TTHC_VIET_TQ_CAP_PHEP_VAN_TAI_LOAI_ABCEFG_LAN_DAU.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim()) ||
					Constants.TTHC_VIET_TQ_CAP_LAI_GPVT_A_E_HET_HAN.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())){
			%>
			<div class="modal-body">
				<div class="col-xs-4 form-group">
					<label for="bienSoXe">Biển kiểm soát xe <span class="red">*</span>:</label>
					<input type="text" id="bienSoXe" name="bienSoXe" placeholder="" class="form-control">
				</div>
				
				<div class="col-xs-4 form-group">
					<label for="trongTaiGhe">Trọng tải (ghế) <span class="red">*</span>:</label>
					<input type="text" id="trongTaiGhe" name="trongTaiGhe" placeholder="" class="form-control">
				</div>
				
				<div class="col-xs-4 form-group">
					<label for="namSanXuat">Năm sản xuất <span class="red">*</span>:</label>
					<input type="text" id="namSanXuat" name="namSanXuat" class="form-control">
				</div>
				
				<div class="col-xs-4 form-group">
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
				
				<div class="col-xs-4 form-group">
					<label for="soKhung">Số khung <span class="red">*</span>:</label>
					<input type="text" id="soKhung" name="soKhung" class="form-control">
				</div>
				
				<div class="col-xs-4 form-group">
					<label for="soMay">Số máy <span class="red">*</span>:</label>
					<input type="text" id="soMay" name="soMay" class="form-control">
				</div>
				
				<div class="col-xs-4 form-group">
					<label for="mauSon">Màu sơn <span class="red">*</span>:</label>
					<input type="text" id="mauSon" name="mauSon" class="form-control">
				</div>
				
				<div class="col-xs-4 form-group">
					<label for="thoiGianCapFrom">Thời gian đề nghị cấp giấy phép từ<span class="red">*</span>:</label>
					<div class="input-group">
						<input type="text" id="thoiGianCapFrom" name="thoiGianCapFrom" class="form-control" onclick="gtCalendar('thoiGianCapFrom')">
						<span class="input-group-addon" onclick="gtCalendar('thoiGianCapFrom')"><i class="fa fa-calendar" onclick="gtCalendar('thoiGianCapFrom')"></i></span>
					</div>
				</div>
				
				<div class="col-xs-4 form-group">
					<label for="thoiGianCapTo">Thời gian đề nghị cấp giấy phép đến<span class="red">*</span>:</label>
					<div class="input-group">
						<input type="text" id="thoiGianCapTo" name="thoiGianCapTo" class="form-control" onclick="gtCalendar('thoiGianCapTo')">
						<span class="input-group-addon" onclick="gtCalendar('thoiGianCapTo')"><i class="fa fa-calendar" onclick="gtCalendar('thoiGianCapTo')"></i></span>
					</div>
				</div>
				
				<div class="col-xs-6 form-group">
					<label for="hinhThucHoatDong">Hình thức hoạt động <span class="red">*</span>:</label>
					<select class="form-control" id="hinhThucHoatDong" name="hinhThucHoatDong">
					<%for(DmDataItem item : lstHinhThucHoatDong) {
						%>
						<option value="<%=item.getCode()%>"><%=item.getName()%></option>
						<%
					}%>
					</select>
				</div>
				
				<div class="col-xs-6 form-group">
					<label for="tuyenHoatDong">Tuyến hoạt động <span class="red">*</span>:</label>
					<select class="form-control" id="tuyenHoatDong" name="tuyenHoatDong">
					<%for (DmDataItem item : lstTuyenHoatDong) {
						%>
						<option value="<%=item.getCode()%>"><%=item.getName()%></option>
						<%
					}%>
					</select>
				</div>
				<div class="col-xs-12 MB10"><b>Điểm dừng nghỉ trên đường</b> <span class="red">*</span>:</div>
				<div class="clear"></div>
				<div class="col-xs-12 PA0">
					<div class="" style="width:45%; float:left">
						<select id="select_diem_dung_left_original_id" name="select_diem_dung_left_original_id" class="form-control" multiple="" size="8" style="display: none;">
							<%
							for(int i=0;i<lstDiemDung.size();i++)
							{
							%>
								<option value="<%= lstDiemDung.get(i).getCode()%>"><%= lstDiemDung.get(i).getName()%></option>
							<%} 
							%>
						</select>
						<select id="select_diem_dung_left_id" name="select_diem_dung_left_id" class="form-control" multiple="" size="8">
							<%
							for(int i=0;i<lstDiemDung.size();i++)
							{
							%>
								<option value="<%= lstDiemDung.get(i).getCode()%>"><%= lstDiemDung.get(i).getName()%></option>
							<%} 
							%>
						</select>
					</div>
					<div class="" style="width:10%; float:left; text-align:center">
						<input type="button" style="margin-top: 40px;" class="text-center" value=">>" onclick="moveOptions('select_diem_dung_left_id','select_diem_dung_right_id');">
						<br>
						<input type="button" style="margin-top: 10px;" class="text-center" value="<<" onclick="moveOptions('select_diem_dung_right_id','select_diem_dung_left_id');">
					</div>
					<div class="" style="width:45%; float:left">
						<select id="select_diem_dung_right_id" name="select_diem_dung_right_id" class="form-control" multiple="" size="8">
							<option value="D02">Huế</option> 
						</select>
					</div>
					<input type="hidden" id="diemDungDoDangKy" name="diemDungDoDangKy">
				</div>
				
				<div class="clear"></div>
			</div>
		<%
			} else if(Constants.TTHC_VIET_TQ_CAP_LAI_GPVT_A_D_E_HONG_MAT.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())){
		%>
			<div class="modal-body">
				<div class="col-xs-4 form-group">
					<label for="bienSoXe">Biển kiểm soát xe</label><br/>
					<label for="bienSoXe">Registration number plate<span class="red">*</span>:</label>
					<input type="text" id="bienSoXe" name="bienSoXe" placeholder="" class="form-control">
				</div>
				
				<div class="col-xs-4 form-group">
					<label for="trongTaiGhe">Trọng tải (ghế)</label><br/>
					<label for="trongTaiGhe">Weight <span class="red">*</span>:</label>
					<input type="text" id="trongTaiGhe" name="trongTaiGhe" placeholder="" class="form-control">
				</div>
				
				<div class="col-xs-4 form-group">
					<label for="nhanHieu">Nhãn hiệu</label><br/>
					<label for="nhanHieu">Mark <span class="red">*</span>:</label>
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
				
				<div class="col-xs-4 form-group">
					<label for="soGiayPhepMatHong">Số Giấy phép vận tải bị mất, hỏng</label>
					<label for="soGiayPhepMatHong">Lost, damaged transport permit No <span class="red">*</span>:</label>
					<input type="text" id=soGiayPhepMatHong name="soGiayPhepMatHong" class="form-control">
				</div>
				
				<div class="col-xs-4 form-group">
					<label for="thoiGianCapFrom">Thời gian đề nghị cấp giấy phép từ </label><br/>
					<label for="thoiGianCapFrom">Date of issue from <span class="red">*</span>:</label>
					<div class="input-group">
						<input type="text" id="thoiGianCapFrom" name="thoiGianCapFrom" class="form-control" onclick="gtCalendar('thoiGianCapFrom')">
						<span class="input-group-addon" onclick="gtCalendar('thoiGianCapFrom')"><i class="fa fa-calendar" onclick="gtCalendar('thoiGianCapFrom')"></i></span>
					</div>
				</div>
				
				<div class="col-xs-4 form-group">
					<label for="thoiGianCapTo">Thời gian đề nghị cấp giấy phép đến</label><br/>
					<label for="thoiGianCapTo">Date of issue to <span class="red">*</span>:</label>
					<div class="input-group">
						<input type="text" id="thoiGianCapTo" name="thoiGianCapTo" class="form-control" onclick="gtCalendar('thoiGianCapTo')">
						<span class="input-group-addon" onclick="gtCalendar('thoiGianCapTo')"><i class="fa fa-calendar" onclick="gtCalendar('thoiGianCapTo')"></i></span>
					</div>
				</div>
				
				<div class="col-xs-6 form-group">
					<label for="tuyenHoatDong">Tuyến hoạt động </label><br/>
					<label for="thoiGianCapTo">Route <span class="red">*</span>:</label>
					<select class="form-control" id="tuyenHoatDong" name="tuyenHoatDong">
					<%for (DmDataItem item : lstTuyenHoatDong) {
						%>
						<option value="<%=item.getCode()%>"><%=item.getName()%></option>
						<%
					}%>
					</select>
				</div>
				
				<div class="col-xs-12 MB10"><b>Điểm dừng nghỉ trên đường</b> <span class="red">*</span>:</div><br/>
				<div class="col-xs-12 MB10"><b>Proposed stops and parking places </b> <span class="red">*</span>:</div>
				<div class="clear"></div>
				<div class="col-xs-12 PA0">
					<div class="" style="width:45%; float:left">
						<select id="select_diem_dung_left_original_id" name="select_diem_dung_left_original_id" class="form-control" multiple="" size="8" style="display: none;">
							<%
							for(int i=0;i<lstDiemDung.size();i++)
							{
							%>
								<option value="<%= lstDiemDung.get(i).getCode()%>"><%= lstDiemDung.get(i).getName()%></option>
							<%} 
							%>
						</select>
						<select id="select_diem_dung_left_id" name="select_diem_dung_left_id" class="form-control" multiple="" size="8">
							<%
							for(int i=0;i<lstDiemDung.size();i++)
							{
							%>
								<option value="<%= lstDiemDung.get(i).getCode()%>"><%= lstDiemDung.get(i).getName()%></option>
							<%} 
							%>
						</select>
					</div>
					<div class="" style="width:10%; float:left; text-align:center">
						<input type="button" style="margin-top: 40px;" class="text-center" value=">>" onclick="moveOptions('select_diem_dung_left_id','select_diem_dung_right_id');">
						<br>
						<input type="button" style="margin-top: 10px;" class="text-center" value="<<" onclick="moveOptions('select_diem_dung_right_id','select_diem_dung_left_id');">
					</div>
					<div class="" style="width:45%; float:left">
						<select id="select_diem_dung_right_id" name="select_diem_dung_right_id" class="form-control" multiple="" size="8">
							<option value="D02">Huế</option> 
						</select>
					</div>
					<input type="hidden" id="diemDungDoDangKy" name="diemDungDoDangKy">
				</div>
				
				<div class="clear"></div>
			</div>
		<%
			}else if(Constants.TTHC_VIET_TQ_CAP_PHEP_VAN_TAI_CONG_VU.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())){
		%>
				<div class="modal-body">
					<div class="col-xs-4 form-group">
						<label for="bienSoXe">Biển kiểm soát xe <span class="red">*</span>:</label>
						<input type="text" id="bienSoXe" name="bienSoXe" placeholder="" class="form-control">
					</div>
					
					<div class="col-xs-4 form-group">
						<label for="trongTaiGhe">Trọng tải (ghế) <span class="red">*</span>:</label>
						<input type="text" id="trongTaiGhe" name="trongTaiGhe" placeholder="" class="form-control">
					</div>
					
					<div class="col-xs-4 form-group">
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
					
					<div class="col-xs-4 form-group">
						<label for="cuaKhauNhap">Cửa khẩu xuất-nhập <span class="red">*</span>:</label>
						<select class="form-control" id="cuaKhauXuatNhap" name="cuaKhauXuatNhap">
						<%for (DmDataItem item : lstCuaKhau) {
							%>
							<option value="<%=item.getCode()%>"><%=item.getName()%></option>
							<%
						}%>
						</select>
					</div>
					
					<div class="col-xs-4 form-group">
						<label for="thoiGianCapFrom">Thời gian đề nghị cấp giấy phép từ<span class="red">*</span>:</label>
						<div class="input-group">
							<input type="text" id="thoiGianCapFrom" name="thoiGianCapFrom" class="form-control" onclick="gtCalendar('thoiGianCapFrom')">
							<span class="input-group-addon" onclick="gtCalendar('thoiGianCapFrom')"><i class="fa fa-calendar" onclick="gtCalendar('thoiGianCapFrom')"></i></span>
						</div>
					</div>
					
					<div class="col-xs-4 form-group">
						<label for="thoiGianCapTo">Thời gian đề nghị cấp giấy phép đến<span class="red">*</span>:</label>
						<div class="input-group">
							<input type="text" id="thoiGianCapTo" name="thoiGianCapTo" class="form-control" onclick="gtCalendar('thoiGianCapTo')">
							<span class="input-group-addon" onclick="gtCalendar('thoiGianCapTo')"><i class="fa fa-calendar" onclick="gtCalendar('thoiGianCapTo')"></i></span>
						</div>
					</div>
					
					<div class="col-xs-6 form-group">
						<label for="tuyenHoatDong">Tuyến hoạt động <span class="red">*</span>:</label>
						<select class="form-control" id="tuyenHoatDong" name="tuyenHoatDong">
						<%for (DmDataItem item : lstTuyenHoatDongCongVu) {
							%>
							<option value="<%=item.getCode()%>"><%=item.getName()%></option>
							<%
						}%>
						</select>
					</div>
					
					<div class="clear"></div>
				</div>
			<%
				} else if(Constants.TTHC_VIET_TQ_CAP_PHEP_VAN_TAI_LOAI_D.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim()) ||
						Constants.TTHC_VIET_TQ_CAP_GIAY_GIOI_THIEU_DE_NGHI_CAP_PHEP_VAN_TAI_LOAI_D.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())){
					%>
					<div class="modal-body">
						<div class="col-xs-3 form-group">
							<label for="bienSoXe">Biển kiểm soát xe</label><br/>
							<label for="bienSoXe">Registration number plate <span class="red">*</span>:</label>
							<input type="text" id="bienSoXe" name="bienSoXe" placeholder="" class="form-control">
						</div>
						
						<div class="col-xs-3 form-group">
							<label for="nhanHieu">Nhãn hiệu</label><br/>
							<label for="nhanHieu">Mark <span class="red">*</span>:</label>
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
						
						<div class="col-xs-3 form-group">
							<label for="trongTaiGhe">Trọng tải (ghế)</label><br/>
							<label for="trongTaiGhe">Weight <span class="red">*</span>:</label>
							<input type="text" id="trongTaiGhe" name="trongTaiGhe" placeholder="" class="form-control">
						</div>
						
						<div class="col-xs-3 form-group">
							<label for="loaiHangVanChuyen">Loại hàng vận chuyển </label><br/>
							<label for="loaiHangVanChuyen">Good type <span class="red">*</span>:</label>
							<input type="text" id="loaiHangVanChuyen" name="loaiHangVanChuyen" class="form-control">
						</div>
						
						<div class="col-xs-3 form-group">
							<label for="soKhung">Số khung</label><br/>
							<label for="soKhung">Chassic No <span class="red">*</span>:</label>
							<input type="text" id="soKhung" name="soKhung" class="form-control">
						</div>
						
						<div class="col-xs-3 form-group">
							<label for="soMay">Số máy</label><br/>
							<label for="soMay">Engine No <span class="red">*</span>:</label>
							<input type="text" id="soMay" name="soMay" class="form-control">
						</div>
						
						<div class="col-xs-3 form-group">
							<label for="mauSon">Màu sơn</label><br/>
							<label for="mauSon">Color <span class="red">*</span>:</label>
							<input type="text" id="mauSon" name="mauSon" class="form-control">
						</div>
						
						<div class="col-xs-4 form-group">
							<label for="thoiGianCapFrom">Thời gian đề nghị cấp giấy phép từ</label><br/>
							<label for="thoiGianCapFrom">Date of issue from <span class="red">*</span>:</label>
							<div class="input-group">
								<input type="text" id="thoiGianCapFrom" name="thoiGianCapFrom" class="form-control" onclick="gtCalendar('thoiGianCapFrom')">
								<span class="input-group-addon" onclick="gtCalendar('thoiGianCapFrom')"><i class="fa fa-calendar" onclick="gtCalendar('thoiGianCapFrom')"></i></span>
							</div>
						</div>
						
						<div class="col-xs-4 form-group">
							<label for="thoiGianCapTo">Thời gian đề nghị cấp giấy phép đến</label><br/>
							<label for="thoiGianCapTo">Date of issue to <span class="red">*</span>:</label>
							<div class="input-group">
								<input type="text" id="thoiGianCapTo" name="thoiGianCapTo" class="form-control" onclick="gtCalendar('thoiGianCapTo')">
								<span class="input-group-addon" onclick="gtCalendar('thoiGianCapTo')"><i class="fa fa-calendar" onclick="gtCalendar('thoiGianCapTo')"></i></span>
							</div>
						</div>
						
						<div class="col-xs-4 form-group">
							<label for="thoiGianDuKienKhoiHanh">Dự kiến thời gian khởi hành</label><br/>
							<label for="thoiGianDuKienKhoiHanh">Proposed time of departure <span class="red">*</span>:</label>
							<div class="input-group">
								<input type="text" id="thoiGianDuKienKhoiHanh" name="thoiGianDuKienKhoiHanh" class="form-control" onclick="gtCalendar('thoiGianDuKienKhoiHanh')">
								<span class="input-group-addon" onclick="gtCalendar('thoiGianCapTo')"><i class="fa fa-calendar" onclick="gtCalendar('thoiGianDuKienKhoiHanh')"></i></span>
							</div>
						</div>
						
						<div class="col-xs-6 form-group">
							<label for="tuyenHoatDong">Tuyến hoạt động</label><br/>
							<label for="tuyenHoatDong">Route <span class="red">*</span>:</label>
							<select class="form-control" id="tuyenHoatDong" name="tuyenHoatDong">
							<%for (DmDataItem item : lstTuyenHoatDong) {
								%>
								<option value="<%=item.getCode()%>"><%=item.getName()%></option>
								<%
							}%>
							</select>
						</div>
						<div class="col-xs-12"><label>Hành trình đề nghị</label></div><br/>
						<div class="col-xs-12 MB10"><b>Proposed route </b> <span class="red">*</span>:</div>
						<div class="col-xs-12">
							<textarea id="hanhTrinhDeNghi" name="hanhTrinhDeNghi" style="margin: 5px 0 0; width: 100%; height: 50px"></textarea>
						</div>
						
						<div class="col-xs-12"><label>Các điểm dừng đỗ đề nghị</label></div><br/>
						<div class="col-xs-12 MB10"><b>Proposed stops and parking places </b> <span class="red">*</span>:</div>
						<div class="clear"></div>
						<div class="col-xs-12">
							<div class="" style="width:45%; float:left">
								<select id="select_diem_dung_left_original_id" name="select_diem_dung_left_original_id" class="form-control" multiple="" size="8" style="display: none;">
									<%
									for(int i=0;i<lstDiemDung.size();i++)
									{
									%>
										<option value="<%= lstDiemDung.get(i).getCode()%>"><%= lstDiemDung.get(i).getName()%></option>
									<%} 
									%>
								</select>
								<select id="select_diem_dung_left_id" name="select_diem_dung_left_id" class="form-control" multiple="" size="8">
									<%
									for(int i=0;i<lstDiemDung.size();i++)
									{
									%>
										<option value="<%= lstDiemDung.get(i).getCode()%>"><%= lstDiemDung.get(i).getName()%></option>
									<%} 
									%>
								</select>
							</div>
							<div class="" style="width:10%; float:left; text-align:center">
								<input type="button" style="margin-top: 40px;" class="text-center" value=">>" onclick="moveOptions('select_diem_dung_left_id','select_diem_dung_right_id');">
								<br>
								<input type="button" style="margin-top: 10px;" class="text-center" value="<<" onclick="moveOptions('select_diem_dung_right_id','select_diem_dung_left_id');">
							</div>
							<div class="" style="width:45%; float:left">
								<select id="select_diem_dung_right_id" name="select_diem_dung_right_id" class="form-control" multiple="" size="8">
								</select>
							</div>
						</div>
						
						<div class="clear"></div>
					</div>
				<%
					} else if(Constants.TTHC_VIET_TQ_DANG_KY_KHAI_THAC_TUYEN.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())||Constants.TTHC_VIET_TQ_BO_SUNG_THAY_THE_PHUONG_TIEN_KHAI_THAC_TUYEN.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())){
			%>
			<div class="modal-body">
							<div class="col-xs-3 form-group">
								<label for="bienSoXe">Biển kiểm soát xe <span class="red">*</span>:</label>
								<input type="text" placeholder="" class="form-control" name="bienSoXe" id="bienSoXe">
							</div>
							<div class="col-xs-9 form-group">
								<label for="tenDangKySoHuuXe">Tên đăng ký chủ sở hữu xe <span class="red">*</span>:</label>
								<input type="text" class="form-control" name="tenDangKySoHuuXe" id="tenDangKySoHuuXe">
							</div>
							<div class="col-xs-3 form-group">
								  <label for="loaiXe">Loại xe <span class="red">*</span>:</label>
								  <select class="form-control" id="loaiXe" name="loaiXe">
								<%for (DmDataItem item : lstLoaiXe) {
									%>
									<option value="<%=item.getCode()%>"><%=item.getName()%></option>
									<%
								}%>
								</select>
							</div>
							<div class="col-xs-3 form-group">
								<label for="trongTaiGhe">Số ghế <span class="red">*</span>:</label>
								<input type="text" class="form-control" name="trongTaiGhe" id="trongTaiGhe">
							</div>
							<div class="col-xs-3 form-group">
								<label for="namSanXuat">Năm sản xuất <span class="red">*</span>:</label>
								<input type="text" class="form-control" name="namSanXuat" id="namSanXuat">
							</div>
							<div class="col-xs-3 form-group">
								<label for="cuaKhauXuatNhap">Cửa khẩu xuất - nhập <span class="red">*</span>:</label>
								<select class="form-control" id="cuaKhauXuatNhap" name="cuaKhauXuatNhap">
								<%for (DmDataItem item : lstCuaKhau) {
									%>
									<option value="<%=item.getCode()%>"><%=item.getName()%></option>
									<%
								}%>
								</select>
							</div>
							<div class="clear"></div>
						</div>
			<%
					}
			%>
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
<input type="hidden" id="loaiLVTT" name="loaiLVTT" value="<%=Constants.LVTT_VIET_NAM_CHINA%>">

<% if(Constants.TTHC_VIET_TQ_CAP_PHEP_VAN_TAI_LOAI_ABCEFG_LAN_DAU.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim()) ||
	Constants.TTHC_VIET_TQ_CAP_LAI_GPVT_A_E_HET_HAN.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())) {
	%>
	<input type="hidden" id="loaiTTHC" name="loaiTTHC" value="<%=Constants.TTHC_VIET_TQ_CAP_PHEP_VAN_TAI_LOAI_ABCEFG_LAN_DAU%>">
	
<%} else if(Constants.TTHC_VIET_TQ_CAP_PHEP_VAN_TAI_CONG_VU.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())) {
	%>
	<input type="hidden" id="loaiTTHC" name="loaiTTHC" value="<%=Constants.TTHC_VIET_TQ_CAP_PHEP_VAN_TAI_CONG_VU%>">
	
<%} else if(Constants.TTHC_VIET_TQ_CAP_PHEP_VAN_TAI_LOAI_D.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim()) ||
			Constants.TTHC_VIET_TQ_CAP_GIAY_GIOI_THIEU_DE_NGHI_CAP_PHEP_VAN_TAI_LOAI_D.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())){
	%>
	<input type="hidden" id="loaiTTHC" name="loaiTTHC" value="<%=Constants.TTHC_VIET_TQ_CAP_PHEP_VAN_TAI_LOAI_D%>">
	
<%} else if(Constants.TTHC_VIET_TQ_CAP_LAI_GPVT_A_D_E_HONG_MAT.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())) {
	%>
	<input type="hidden" id="loaiTTHC" name="loaiTTHC" value="<%=Constants.TTHC_VIET_TQ_CAP_LAI_GPVT_A_D_E_HONG_MAT%>">
	
<%} else if(Constants.TTHC_VIET_TQ_DANG_KY_KHAI_THAC_TUYEN.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())) {
	%>
	<input type="hidden" id="loaiTTHC" name="loaiTTHC" value="<%=Constants.TTHC_VIET_TQ_DANG_KY_KHAI_THAC_TUYEN%>">
	
<% } else if(Constants.TTHC_VIET_TQ_BO_SUNG_THAY_THE_PHUONG_TIEN_KHAI_THAC_TUYEN.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())) {
	%>
	<input type="hidden" id="loaiTTHC" name="loaiTTHC" value="<%=Constants.TTHC_VIET_TQ_BO_SUNG_THAY_THE_PHUONG_TIEN_KHAI_THAC_TUYEN%>">
	
<% } else {
	%>
	<input type="hidden" id="loaiTTHC" name="loaiTTHC" value="<%=thuTucHanhChinh.getMaThuTuc().trim()%>">
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