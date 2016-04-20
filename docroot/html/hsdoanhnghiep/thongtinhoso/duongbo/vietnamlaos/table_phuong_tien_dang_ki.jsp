<%@page import="vn.dtt.duongbo.maudon.model.DKKTVTTuyenCoDinhBangOtoVietLao"%>
<%@page import="vn.dtt.duongbo.maudon.xml.MauDonFactory"%>
<%@page import="vn.dtt.duongbo.maudon.model.DonXinCapGPLienVanVietLao"%>
<%@page import="vn.dtt.duongbo.maudon.model.DonXinCapGPLVTMVietLao"%>
<%@page import="java.util.Arrays"%>
<%@page import="vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinh"%>
<%@page import="javax.naming.NoInitialContextException"%>
<%@page import="vn.dtt.duongbo.utils.CommonUtils"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
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

<script type="text/javascript" src="<%=request.getContextPath()%>/js/duongbo/laocam/table_phuong_tien_dang_ki.js?modified=<%=DateUtils.CURRENT_TIME_STAMP%>"></script>

<%
	List<DmDataItem> lstNhanHieu = DanhMucConstants.getNhanHieuPhuongTien();
	List<DmDataItem> lstHinhThucHoatDong = DanhMucConstants.getHinhThucHoatDong();
	List<DmDataItem> lstCuaKhau = DanhMucConstants.getCuaKhauVietLao();
	
	String loaiTTHC = ParamUtil.getString(request, Constants.LOAI_THU_TUC_HANH_CHINH);
	
	_log.info("------table_phuong_tien_dang_ki.jsp--LAO&CAM--loaiTTHC : " + loaiTTHC);
	_log.info("------table_phuong_tien_dang_ki.jsp--LAO&CAM--loaiTTHC : " + thuTucHanhChinh.getMaThuTuc().trim());
	
	
	List<QlvtPhuongTienDangKyVietLao> lstPhuongTienVietLao = null;
	//Ton tai noi dung ho so
	if (noidungHoSo != null) {
		lstPhuongTienVietLao = QlvtPhuongTienDangKyVietLaoLocalServiceUtil.findByNoiDungHoSoId(noidungHoSo.getId());
	}
	if (lstPhuongTienVietLao == null) { lstPhuongTienVietLao = new ArrayList<QlvtPhuongTienDangKyVietLao>(); }
%>

<!-- /html/hsdoanhnghiep/thongtinhoso/duongbo/vietnamlaos/table_phuong_tien_dang_ki.jsp -->
<div style="padding:0 15px">

<div style="overflow:hidden; margin:10px 0; position:relative">
	<div style="overflow-x:auto;">
	
	<%
	int index = 0;
	if (Constants.TTHC_VIET_LAO_DIEU_CHINH_TAN_SUAT_VAN_TAI_HANH_KHACH_CO_DINH.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())) {
		%>
		<table class="table table-striped table-bordered table-hover" id="tblPhuongTienDangKi">
			<tbody>
			<tr>
				<th class="text-center" width="40px">STT</th>
				<th class="text-center" style="width: 130px;">Biển kiểm soát xe</th>
				<th class="text-center" style="width: 200px;">Tên đăng ký sở hữu xe</th>
				<th class="text-center" style="width: 150px;">Nhãn hiệu</th>
				<th class="text-center" style="width: 150px;">Trọng tải</th>
				<th class="text-center" style="width: 150px;">Năm<br/>sản xuất</th>
				<th class="text-center">Thao tác</th>
			</tr>
	<%
	} else if (Constants.TTHC_VIET_LAO_KHAI_THAC_TUYEN_HANH_KHACH_CO_DINH_LIEN_VAN_QUOC_TE.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())||
				Constants.TTHC_VIET_LAO_BO_SUNG_PHUONNG_TIEN_KHAI_THAC_TUYEN_CO_DINH_VAN_TAI.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())||
				Constants.TTHC_VIET_LAO_THAY_THE_PHUONG_TIEN_KHAI_THAC_TUYEN_CO_DINH_VAN_TAI.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())) {
	%>
	<table class="table table-striped table-bordered table-hover m-table" id="tblPhuongTienDangKi" style="width: 1000px; max-width:none; margin:0">
		<tbody>
		<tr>
			<th class="text-center" width="40px">STT</th>
			<th class="text-center" style="width: 130px;">Biển kiểm soát xe</th>
			<th class="text-center" style="width: 130px;">Tên đăng ký sở hữu xe</th>
			<th class="text-center" style="width: 130px;">Loại xe</th>
			<th class="text-center" style="width: 130px;">Số ghế</th>
			<th class="text-center" style="width: 130px;">Năm<br/>sản xuất</th>
			<th class="text-center" style="width: 240px;">Cửa khẩu<br>xuất-nhập</th>
			<th class="decoy">Thao tác</th>
			<th class="text-center colFixedPos">Thao tác</th>
		</tr>
	
	<%
	} else {
	%>
		<table class="table table-striped table-bordered table-hover m-table" id="tblPhuongTienDangKi" style="width:1700px; max-width:none; margin:0">
			<tbody>
			<tr>
				<th class="text-center" width="40px">STT</th>
				<th class="text-center" width="110px">Biển số xe<br></th>
				<th class="text-center" width="110px">Trọng tải<br>(ghế)</th>
				<th class="text-center" width="90px">Năm SX</th>
				<th class="text-center" width="220px">Nhãn hiệu</th>
				<th class="text-center" style="width: 110px;">Số khung</th>
				<th class="text-center" style="width: 110px;">Số máy</th>
				<th class="text-center" style="width: 130px;">Màu sơn</th>
				<th class="text-center" style="width: 190px;">Thời gian đề nghị<br>cấp giấy phép</th>
				<th class="text-center" style="width: 280px;">Hình thức<br>hoạt động</th>
				<th class="text-center" style="width: 280px;">Cửa khẩu<br>xuất-nhập</th>
				<th class="decoy">Thao tác</th>
				<th class="text-center colFixedPos">Thao tác</th>
			</tr>
	<%
	}
	
	//----------------------------------------------NOI DUNG TABLE TAG TR---------------------------------------------
	
	if (Constants.TTHC_VIET_LAO_DIEU_CHINH_TAN_SUAT_VAN_TAI_HANH_KHACH_CO_DINH.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())) {
		
		//----------------------------------Lay du lieu DATABASE
		if (noiDungXmml.length() == 0) {
			for (QlvtPhuongTienDangKyVietLao item : lstPhuongTienVietLao) {
				
				_log.info("---112---TTHC_VIET_LAO_DIEU_CHINH_TAN_SUAT_VAN_TAI_HANH_KHACH_CO_DINH.jsp--LAO&CAM--loaiTTHC : " + thuTucHanhChinh.getMaThuTuc().trim());
				%>
				<tr class="trTbl<%=index%>">
					<td class="text-center"><span id="spanStt<%=index%>"><%=(index + 1)%></span></td>
					<td><span id="spanBienSoXe<%=index%>"><%=Validator.isNotNull(item.getBienSo()) ? item.getBienSo() : ""%></span></td>
					<td><span id="spanTenDangKySoHuu<%=index%>"><%=Validator.isNotNull(item.getTenDangKySoHuu()) ? item.getTenDangKySoHuu() : ""%></span></td>
					<td class="text-center"><span id="spanNhanHieu<%=index%>"><%=Validator.isNotNull(item.getNhanHieu()) ? (CommonUtils.getNameItemFromList(lstNhanHieu, item.getNhanHieu())) : ""%></span></td>
					<td><span id="spanTrongTai<%=index%>"><%=Validator.isNotNull(item.getTrongTai()) ? item.getTrongTai() : ""%></span></td>
					<td class="text-center"><span id="spanNamSanXuat<%=index%>"><%=Validator.isNotNull(item.getNamSanXuat()) ? item.getNamSanXuat() : ""%></span></td>
					<input type="hidden" id="indexRow" name="indexRow" value="<%=index%>" />
					<input type="hidden" id="objectPhuongTien<%=index%>" class="objectPhuongTien" name="objectPhuongTien" value="<%=CommonUtils.passPhuongTienVietLaoToString(item)%>" />
					<td class="text-center">
						<a onclick="iconSuaPhuongTien(<%=index%>)" title="Sửa" style="margin-right:5px"><i class="fa3 fa fa-pencil-square-o"></i></a>
						<a onclick="iconXoaPhuongTien(<%=index%>)" title="Xóa"><i class="fa3 fa fa-trash-o"></i></a>
					</td>
				</tr>
				<%
				++index;
			}
		} else {
			//----------------------------------Lay du lieu NOI-DUNG-XML
			String[] lstStringObjctPhuongTienTanSuat = ParamUtil.getParameterValues(request, "objectPhuongTien", new String[]{});
			for (String valPhuongTien : lstStringObjctPhuongTienTanSuat) {
				String[] phuongTien = valPhuongTien.split(";");
				%>
				<tr class="trTbl<%=index%>">
					<td class="text-center"><span id="spanStt<%=index%>"><%=(index + 1)%></span></td>
					<td><span id="spanBienSoXe<%=index%>"><%=phuongTien[1]%></span></td>
					<td><span id="spanTenDangKySoHuu<%=index%>"><%=phuongTien[23]%></span></td>
					<td class="text-center"><span id="spanNhanHieu<%=index%>"><%=(CommonUtils.getNameItemFromList(lstNhanHieu, phuongTien[2]))%></span></td>
					<td><span id="spanTrongTai<%=index%>"><%=phuongTien[3]%></span></td>
					<td class="text-center"><span id="spanNamSanXuat<%=index%>"><%=phuongTien[4]%></span></td>
					<input type="hidden" id="indexRow" name="indexRow" value="<%=index%>" />
					<input type="hidden" id="objectPhuongTien<%=index%>" class="objectPhuongTien" name="objectPhuongTien" value="<%=valPhuongTien%>" />
					<td class="text-center">
						<a onclick="iconSuaPhuongTien(<%=index%>)" title="Sửa" style="margin-right:5px"><i class="fa3 fa fa-pencil-square-o"></i></a>
						<a onclick="iconXoaPhuongTien(<%=index%>)" title="Xóa"><i class="fa3 fa fa-trash-o"></i></a>
					</td>
				</tr>
				<%
				++index;
			}
		}
		
	
	//-------------------------------/////////////-----------------------------------
	//2.3.2. Bổ sung phương tiện khai thác tuyến vận tải hành khách tuyến cố định Việt – Lào.
	} else if (Constants.TTHC_VIET_LAO_KHAI_THAC_TUYEN_HANH_KHACH_CO_DINH_LIEN_VAN_QUOC_TE.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim()) ||
				Constants.TTHC_VIET_LAO_BO_SUNG_PHUONNG_TIEN_KHAI_THAC_TUYEN_CO_DINH_VAN_TAI.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim()) ||
				Constants.TTHC_VIET_LAO_THAY_THE_PHUONG_TIEN_KHAI_THAC_TUYEN_CO_DINH_VAN_TAI.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())
		) {
		
		//----------------------------------Lay du lieu DATABASE
		if (noiDungXmml.length() == 0) {
			for (QlvtPhuongTienDangKyVietLao item : lstPhuongTienVietLao) {
				%>
				<tr class="trTbl<%=index%>">
					<td class="text-center"><span id="spanStt<%=index%>"><%=(index + 1)%></span></td>
					<td><span id="spanBienSoXe<%=index%>"><%=Validator.isNotNull(item.getBienSo()) ? item.getBienSo() : ""%></span></td>
					<td><span id="spanTenDangKySoHuu<%=index%>"><%=Validator.isNotNull(item.getTenDangKySoHuu()) ? item.getTenDangKySoHuu() : ""%></span></td>
					<td class="text-center"><span id="spanNhanHieu<%=index%>"><%=Validator.isNotNull(item.getNhanHieu()) ? (CommonUtils.getNameItemFromList(lstNhanHieu, item.getNhanHieu())) : ""%></span></td>
					<td><span id="spanTrongTai<%=index%>"><%=Validator.isNotNull(item.getTrongTai()) ? item.getTrongTai() : ""%></span></td>
					<td class="text-center"><span id="spanNamSanXuat<%=index%>"><%=Validator.isNotNull(item.getNamSanXuat()) ? item.getNamSanXuat() : ""%></span></td>
					<td><span id="spanCuaKhau<%=index%>"><%=Validator.isNotNull(item.getCuaKhauXuatNhap()) ? (CommonUtils.getNameItemFromList(lstCuaKhau, item.getCuaKhauXuatNhap())) : ""%></span></td>
					<input type="hidden" id="indexRow" name="indexRow" value="<%=index%>" />
					<input type="hidden" id="objectPhuongTien<%=index%>" class="objectPhuongTien" name="objectPhuongTien" value="<%=CommonUtils.passPhuongTienVietLaoToString(item)%>" />
					<td class="decoy"></td>
					<td class="text-center colFixedPos">
						<a onclick="iconSuaPhuongTien(<%=index%>)" title="Sửa" style="margin-right:5px"><i class="fa3 fa fa-pencil-square-o"></i></a>
						<a onclick="iconXoaPhuongTien(<%=index%>)" title="Xóa"><i class="fa3 fa fa-trash-o"></i></a>
					</td>
				</tr>
				<%
				++index;
			}
		} else {
			
			//----------------------------------Lay du lieu NOI-DUNG-XML
			String[] lstStringObjctPhuongTien = ParamUtil.getParameterValues(request, "objectPhuongTien", new String[]{});
			
			//DKKTVTTuyenCoDinhBangOtoVietLao donLienVanTuyen = null;
			//if (donLienVanTuyen == null) { donLienVanTuyen = MauDonFactory.converXmlToObject(noiDungXmml, new DKKTVTTuyenCoDinhBangOtoVietLao()); }
			//if (donLienVanTuyen == null) { donLienVanTuyen = new DKKTVTTuyenCoDinhBangOtoVietLao(); }
			//List<DKKTVTTuyenCoDinhBangOtoVietLao.DanhSachXe> lstDanhSachXePhiThuongMai = donLienVanTuyen.getDanhSachXe();
			//for (DKKTVTTuyenCoDinhBangOtoVietLao.DanhSachXe itemXe : lstDanhSachXePhiThuongMai) {
			for (String valPhuongTien : lstStringObjctPhuongTien) {
				String[] phuongTien = valPhuongTien.split(";");
				%>
				<tr class="trTbl<%=index%>">
					<td class="text-center"><span id="spanStt<%=index%>"><%=(index + 1)%></span></td>
					<td><span id="spanBienSoXe<%=index%>"><%=phuongTien[1]%></span></td>
					<td><span id="spanTenDangKySoHuu<%=index%>"><%=phuongTien[22]%></span></td>
					<td class="text-center"><span id="spanNhanHieu<%=index%>"><%=(CommonUtils.getNameItemFromList(lstNhanHieu, phuongTien[2]))%></span></td>
					<td><span id="spanTrongTai<%=index%>"><%=phuongTien[3]%></span></td>
					<td class="text-center"><span id="spanNamSanXuat<%=index%>"><%=phuongTien[4]%></span></td>
					<td><span id="spanCuaKhau<%=index%>"><%=(CommonUtils.getNameItemFromList(lstCuaKhau, phuongTien[6]))%></span></td>
					
					<input type="hidden" id="indexRow" name="indexRow" value="<%=index%>" />
					<input type="hidden" id="objectPhuongTien<%=index%>" class="objectPhuongTien" name="objectPhuongTien" value="<%=valPhuongTien%>" />
					
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
		
	
	////-------------------------------///////TRUONG HOP CHUNG//////-----------------------------------
	} else {
		
		
		
		
		//-------------------------TRUONG HOP XEM LAI TU DataBase----------------------
		if (noiDungXmml.length() == 0) {
			for (QlvtPhuongTienDangKyVietLao item : lstPhuongTienVietLao) {
				_log.info("====== 2 TAI SAO LAI KO VAO DAY=====" + thuTucHanhChinh.getMaThuTuc().trim());
				%>
				<tr class="trTbl<%=index%>">
				
					<td class="text-center"><span id="spanStt<%=index%>"><%=(index + 1)%></span></td>
					<td><span id="spanBienSoXe<%=index%>"><%=Validator.isNotNull(item.getBienSo()) ? item.getBienSo() : ""%></span></td>
					<td><span id="spanTrongTai<%=index%>"><%=Validator.isNotNull(item.getTrongTai()) ? item.getTrongTai() : ""%></span></td>
					<td class="text-center"><span id="spanNamSanXuat<%=index%>"><%=Validator.isNotNull(item.getNamSanXuat()) ? item.getNamSanXuat() : ""%></span></td>
					<td class="text-center"><span id="spanNhanHieu<%=index%>"><%=Validator.isNotNull(item.getNhanHieu()) ? (CommonUtils.getNameItemFromList(lstNhanHieu, item.getNhanHieu())) : ""%></span></td>
					<td><span id="spanSoKhung<%=index%>"><%=Validator.isNotNull(item.getSoKhung()) ? item.getSoKhung() : ""%></span></td>
					<td><span id="spanSoMay<%=index%>"><%=Validator.isNotNull(item.getSoMay()) ? item.getSoMay() : ""%></span></td>
					<td><span id="spanMauSon<%=index%>"><%=Validator.isNotNull(item.getMauSon()) ? item.getMauSon() : ""%></span></td>
					<td><span id="spanThoiGianDeNghi<%=index%>"><%=DateUtils.dateToString("dd/MM/yyyy", item.getThoiGianXinCapPhepTu()) + " - " + DateUtils.dateToString("dd/MM/yyyy", item.getThoiGianXinCapPhepDen())%></span></td>
					<td><span id="spanHinhThucHd<%=index%>"><%=Validator.isNotNull(item.getHinhThucHoatDong()) ? (CommonUtils.getNameItemFromList(lstHinhThucHoatDong, item.getHinhThucHoatDong())) : ""%></span></td>
					<td><span id="spanCuaKhau<%=index%>"><%=Validator.isNotNull(item.getCuaKhauXuatNhap()) ? (CommonUtils.getNameItemFromList(lstCuaKhau, item.getCuaKhauXuatNhap())) : ""%></span></td>
					
					<input type="hidden" id="indexRow" name="indexRow" value="<%=index%>">
					<input type="hidden" id="objectPhuongTien<%=index%>" class="objectPhuongTien" name="objectPhuongTien" value="<%=CommonUtils.passPhuongTienVietLaoToString(item)%>">
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
		if (lstPhuongTienVietLao.size() == 0) {
		
			//2.2.3. Cấp Giấy phép liên vận Việt – Lào cho phương tiện phi thương mại; phương tiện thương mại phục vụ các công trình, dự án hoặc hoạt động kinh doanh của doanh nghiệp, hợp tác xã trên lãnh thổ Lào.
	 		if (Arrays.asList(Constants.TTHC_VIET_LAO_LIENVAN_PHUONGTIEN_PHI_THUONGMAI_ALL).contains(thuTucHanhChinh.getMaThuTuc().trim())) {
				
				_log.info("----vietnamlaos\table_phuong_tien_dang_ki.jsp----TTHC_VIET_LAO_LIENVAN_PHUONGTIEN_PHI_THUONGMAI_ALL--" + thuTucHanhChinh.getMaThuTuc().trim());
				
				String[] lstStringObjctPhuongTienPhiThuongMai = ParamUtil.getParameterValues(request, "objectPhuongTien", new String[]{});
				
				//DonXinCapGPLienVanVietLao ptPhiThuongMai = null;
				//if (ptPhiThuongMai == null) { ptPhiThuongMai = MauDonFactory.converXmlToObject(noiDungXmml, new DonXinCapGPLienVanVietLao()); }
				//if (ptPhiThuongMai == null) { ptPhiThuongMai = new DonXinCapGPLienVanVietLao(); }
				//List<DonXinCapGPLienVanVietLao.DanhSachXe> lstDanhSachXePhiThuongMai = ptPhiThuongMai.getDanhSachXe();
				//for (DonXinCapGPLienVanVietLao.DanhSachXe itemXe : lstDanhSachXePhiThuongMai) {
				for (String valPhuongTien : lstStringObjctPhuongTienPhiThuongMai) {
					String[] phuongTien = valPhuongTien.split(";");
					%>
					<tr class="trTbl<%=index%>">
					
						<td class="text-center"><span id="spanStt<%=index%>"><%=(index + 1)%></span></td>
						<td><span id="spanBienSoXe<%=index%>"><%=phuongTien[1]%></span></td>
						<td><span id="spanTrongTai<%=index%>"><%=phuongTien[3]%></span></td>
						<td class="text-center"><span id="spanNamSanXuat<%=index%>"><%=phuongTien[4]%></span></td>
						<td class="text-center"><span id="spanNhanHieu<%=index%>"><%=(CommonUtils.getNameItemFromList(lstNhanHieu, phuongTien[2]))%></span></td>
						<td><span id="spanSoKhung<%=index%>"><%=phuongTien[11]%></span></td>
						<td><span id="spanSoMay<%=index%>"><%=phuongTien[13]%></span></td>
						<td><span id="spanMauSon<%=index%>"><%=phuongTien[12]%></span></td>
						<td><span id="spanThoiGianDeNghi<%=index%>"><%=phuongTien[9] + " - " + phuongTien[10]%></span></td>
						<td><span id="spanHinhThucHd<%=index%>"><%=(CommonUtils.getNameItemFromList(lstHinhThucHoatDong, phuongTien[5]))%></span></td>
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
			} else
			
			//----2.2.1. Cấp Giấy phép liên vận Việt – Lào đối với phương tiện thương mại (áp dụng cho phương tiện kinh doanh vận tải).
			if (Arrays.asList(Constants.TTHC_VIET_LAO_LIENVAN_PHUONGTIEN_KINHDOANH_ALL).contains(thuTucHanhChinh.getMaThuTuc().trim())) {
				
				_log.info("----vietnamlaos\table_phuong_tien_dang_ki.jsp----TTHC_VIET_LAO_LIENVAN_PHUONGTIEN_KINHDOANH_ALL--" + thuTucHanhChinh.getMaThuTuc().trim());
					
				//DonXinCapGPLVTMVietLao ptKinhDoanh = null;
				//if (ptKinhDoanh == null) { ptKinhDoanh = MauDonFactory.converXmlToObject(noiDungXmml, new DonXinCapGPLVTMVietLao());}
				//if (ptKinhDoanh == null) { ptKinhDoanh = new DonXinCapGPLVTMVietLao(); }
				
				//List<DonXinCapGPLVTMVietLao.DanhSachXe> lstDanhSachXeThuongMai = ptKinhDoanh.getDanhSachXe();
				String[] lstStringObjctPhuongTienKinhDoanh = ParamUtil.getParameterValues(request, "objectPhuongTien", new String[]{});
				
				//for (DonXinCapGPLVTMVietLao.DanhSachXe itemXe : lstDanhSachXeThuongMai) {
				for (String valPhuongTien : lstStringObjctPhuongTienKinhDoanh) {
					String[] phuongTien = valPhuongTien.split(";");
					%>
					<tr class="trTbl<%=index%>">
					
						<td class="text-center"><span id="spanStt<%=index%>"><%=(index + 1)%></span></td>
						<td><span id="spanBienSoXe<%=index%>"><%=phuongTien[1]%></span></td>
						<td><span id="spanTrongTai<%=index%>"><%=phuongTien[3]%></span></td>
						<td class="text-center"><span id="spanNamSanXuat<%=index%>"><%=phuongTien[4]%></span></td>
						<td class="text-center"><span id="spanNhanHieu<%=index%>"><%=(CommonUtils.getNameItemFromList(lstNhanHieu, phuongTien[2]))%></span></td>
						<td><span id="spanSoKhung<%=index%>"><%=phuongTien[11]%></span></td>
						<td><span id="spanSoMay<%=index%>"><%=phuongTien[13]%></span></td>
						<td><span id="spanMauSon<%=index%>"><%=phuongTien[12]%></span></td>
						<td><span id="spanThoiGianDeNghi<%=index%>"><%=phuongTien[9] + " - " + phuongTien[10]%></span></td>
						<td><span id="spanHinhThucHd<%=index%>"><%=(CommonUtils.getNameItemFromList(lstHinhThucHoatDong, phuongTien[5]))%></span></td>
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
	}
	%>
		</tbody>
		</table>
	</div>
</div>
	
	<!-- data-target="#myModal" -->
	<button class="btn btn-primary btn-sm" type="button" onclick="clearDataPopup(); initButton(); openPopup('modalPhuongTien');">Thêm phương tiện</button>
	
</div>


<!--------------------------------------------------------------- MODAL------------------------------------------------------>
<% if (Constants.TTHC_VIET_LAO_DIEU_CHINH_TAN_SUAT_VAN_TAI_HANH_KHACH_CO_DINH.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())) { %>
	<div id="modalPhuongTien" class="modal fade" role="dialog">
		<div class="modal-dialog modal-lg">
			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title text-center">Thêm phương tiện</h4>
				</div>
				<div class="modal-body">
					<div class="col-xs-4 form-group">
						<label for="bienSoXe">Biển kiểm soát xe <span class="red">*</span>:</label>
						<input type="text" id="bienSoXe" name="bienSoXe" placeholder="" class="form-control">
					</div>
					
					<div class="col-xs-8 form-group">
						<label for="tenDangKySoHuu">Tên đăng ký sở hữu <span class="red">*</span>:</label>
						<input type="text" id="tenDangKySoHuu" name="tenDangKySoHuu" placeholder="" class="form-control">
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
						<label for="trongTaiGhe">Trọng tải (ghế) <span class="red">*</span>:</label>
						<input type="text" id="trongTaiGhe" name="trongTaiGhe" placeholder="" class="form-control">
					</div>
					<div class="col-xs-4 form-group">
						<label for="namSanXuat">Năm sản xuất <span class="red">*</span>:</label>
						<input type="text" id="namSanXuat" name="namSanXuat" class="form-control">
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
<% } else if (Constants.TTHC_VIET_LAO_KHAI_THAC_TUYEN_HANH_KHACH_CO_DINH_LIEN_VAN_QUOC_TE.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim()) ||
			Constants.TTHC_VIET_LAO_BO_SUNG_PHUONNG_TIEN_KHAI_THAC_TUYEN_CO_DINH_VAN_TAI.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())||
			Constants.TTHC_VIET_LAO_THAY_THE_PHUONG_TIEN_KHAI_THAC_TUYEN_CO_DINH_VAN_TAI.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())
	) {
%>
	<div id="modalPhuongTien" class="modal fade" role="dialog">
		<div class="modal-dialog modal-lg">
			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title text-center">Thêm phương tiện</h4>
				</div>
				<div class="modal-body">
					<div class="col-xs-4 form-group">
						<label for="bienSoXe">Biển kiểm soát xe <span class="red">*</span>:</label>
						<input type="text" id="bienSoXe" name="bienSoXe" placeholder="" class="form-control">
					</div>
					
					<div class="col-xs-8 form-group">
						<label for="tenDangKySoHuu">Tên đăng ký sở hữu <span class="red">*</span>:</label>
						<input type="text" id="tenDangKySoHuu" name="tenDangKySoHuu" placeholder="" class="form-control">
					</div>
					
					<div class="col-xs-3 form-group">
						<label for="nhanHieu">Loại xe <span class="red">*</span>:</label>
						<select class="form-control" id="nhanHieu" name="nhanHieu">
<!-- 						<option value="1">-- Chọn nhãn hiệu --</option> -->
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
						<label for="trongTaiGhe">Trọng tải (ghế) <span class="red">*</span>:</label>
						<input type="text" id="trongTaiGhe" name="trongTaiGhe" placeholder="" class="form-control">
					</div>
					<div class="col-xs-3 form-group">
						<label for="namSanXuat">Năm sản xuất <span class="red">*</span>:</label>
						<input type="text" id="namSanXuat" name="namSanXuat" class="form-control">
					</div>
					
					<div class="col-xs-3 form-group">
						<label for="cuaKhauNhap">Cửa khẩu xuất-nhập <span class="red">*</span>:</label>
						<select class="form-control" id="cuaKhauXuatNhap" name="cuaKhauXuatNhap">
<!-- 						<option value="1">-- Chọn cửa khẩu --</option> -->
						<%for (DmDataItem item : lstCuaKhau) {
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
		
<% } else { %>
	
	<div id="modalPhuongTien" class="modal fade" role="dialog">
		<div class="modal-dialog modal-lg">
			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title text-center">Thêm phương tiện</h4>
				</div>
				
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
						<label for="cuaKhauNhap">Cửa khẩu xuất-nhập <span class="red">*</span>:</label>
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
<%
	}
%>

<input type="hidden" id="loaiLVTT" name="loaiLVTT" value="LAOCAM">

<%if (Constants.TTHC_VIET_LAO_DIEU_CHINH_TAN_SUAT_VAN_TAI_HANH_KHACH_CO_DINH.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())) {
	%>
	<input type="hidden" id="loaiTTHC" name="loaiTTHC" value="<%=Constants.TTHC_VIET_LAO_DIEU_CHINH_TAN_SUAT_VAN_TAI_HANH_KHACH_CO_DINH%>">
	
<%} else if(Constants.TTHC_VIET_LAO_KHAI_THAC_TUYEN_HANH_KHACH_CO_DINH_LIEN_VAN_QUOC_TE.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())) {
	%>
	<input type="hidden" id="loaiTTHC" name="loaiTTHC" value="<%=Constants.TTHC_VIET_LAO_KHAI_THAC_TUYEN_HANH_KHACH_CO_DINH_LIEN_VAN_QUOC_TE%>">
	<%
}else if(Constants.TTHC_VIET_LAO_BO_SUNG_PHUONNG_TIEN_KHAI_THAC_TUYEN_CO_DINH_VAN_TAI.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())){
	%>
	<input type="hidden" id="loaiTTHC" name="loaiTTHC" value="<%=Constants.TTHC_VIET_LAO_BO_SUNG_PHUONNG_TIEN_KHAI_THAC_TUYEN_CO_DINH_VAN_TAI%>">
	<%
}else if(Constants.TTHC_VIET_LAO_THAY_THE_PHUONG_TIEN_KHAI_THAC_TUYEN_CO_DINH_VAN_TAI.equalsIgnoreCase(thuTucHanhChinh.getMaThuTuc().trim())){
	%>
	<input type="hidden" id="loaiTTHC" name="loaiTTHC" value="<%=Constants.TTHC_VIET_LAO_THAY_THE_PHUONG_TIEN_KHAI_THAC_TUYEN_CO_DINH_VAN_TAI%>">
	<%
} else {
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



