
<%@ include file="init.jsp"%>

<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
DonDTTPHS123 donOnline = (DonDTTPHS123) DuongThuyUtil.getDonOnline(noiDungHoSoId, noiDungXML);

if(donOnline == null) {
	donOnline = new DonDTTPHS123();
}

mapDonValue.put(DonOnline.KINH_GUI, GetterUtil.getString(donOnline.getKinhGui()));
mapDonValue.put(DonOnline.TO_CHUC_CA_NHAN, GetterUtil.getString(donOnline.getToChucCaNhanDangKi()));
mapDonValue.put(DonOnline.DAI_DIEN, GetterUtil.getString(donOnline.getDaiDienChoCacDongSoHuu()));
mapDonValue.put(DonOnline.TRU_SO_CHINH, GetterUtil.getString(donOnline.getTruSoChinh()));
mapDonValue.put(DonOnline.DIEN_THOAI, GetterUtil.getString(donOnline.getDienThoai()));
mapDonValue.put(DonOnline.EMAIL, GetterUtil.getString(donOnline.getEmail()));
mapDonValue.put(DonOnline.TEN_PHUONG_TIEN, GetterUtil.getString(donOnline.getTenPhuongTien()));
mapDonValue.put(DonOnline.KY_HIEU_THIET_KE, GetterUtil.getString(donOnline.getKiHieuThietKe()));
mapDonValue.put(DonOnline.CONG_DUNG_TAU, GetterUtil.getString(donOnline.getCongDung()));
mapDonValue.put(DonOnline.NAM_DONG, GetterUtil.getString(donOnline.getNamDong()));
mapDonValue.put(DonOnline.NOI_DONG, GetterUtil.getString(donOnline.getNoiDong()));
mapDonValue.put(DonOnline.CAP_TAU, GetterUtil.getString(donOnline.getCapTau()));
mapDonValue.put(DonOnline.VAT_LIEU_VO, GetterUtil.getString(donOnline.getVatLieuVo()));
mapDonValue.put(DonOnline.CHIEU_DAI_THIET_KE, GetterUtil.getString(donOnline.getChieuDaiThietKe()));
mapDonValue.put(DonOnline.CHIEU_DAI_LON_NHAT, GetterUtil.getString(donOnline.getChieuDaiLonNhat()));
mapDonValue.put(DonOnline.CHIEU_CAO_MAN, GetterUtil.getString(donOnline.getChieuCaoMan()));
mapDonValue.put(DonOnline.CHIEU_CHIM, GetterUtil.getString(donOnline.getChieuChim()));
mapDonValue.put(DonOnline.CHIEU_DAI_THIET_KE, GetterUtil.getString(donOnline.getChieuRongThietKe()));
mapDonValue.put(DonOnline.CHIEU_RONG_LON_NHAT, GetterUtil.getString(donOnline.getChieuRongLonNhat()));
mapDonValue.put(DonOnline.MAN_KHO, GetterUtil.getString(donOnline.getManKho()));
mapDonValue.put(DonOnline.TRONG_TAI_TOAN_PHAN, GetterUtil.getString(donOnline.getTrongTaiToanPhan()));
mapDonValue.put(DonOnline.SO_NGUOI_DUOC_PHEP_CHO, GetterUtil.getString(donOnline.getSoNguoiDuocPhepCho()));
mapDonValue.put(DonOnline.SUC_KEO_DAY, GetterUtil.getString(donOnline.getSucKeoDay()));
mapDonValue.put(DonOnline.SO_LUONG_MAY_CHINH, GetterUtil.getString(donOnline.getSoLuongMayChinh()));
mapDonValue.put(DonOnline.KIEU_MAY_CHINH, GetterUtil.getString(donOnline.getKieuMayChinh()));
mapDonValue.put(DonOnline.CONG_SUAT_MAY_CHINH, GetterUtil.getString(donOnline.getCongSuatMayChinh()));
mapDonValue.put(DonOnline.NUOC_SAN_XUAT_MAY_CHINH, GetterUtil.getString(donOnline.getNuocSanXuatMayChinh()));
mapDonValue.put(DonOnline.SO_LUONG_MAY_PHU, GetterUtil.getString(donOnline.getSoLuongMayPhu()));
mapDonValue.put(DonOnline.KIEU_MAY_PHU, GetterUtil.getString(donOnline.getKieuMayPhu()));
mapDonValue.put(DonOnline.CONG_SUAT_MAY_PHU, GetterUtil.getString(donOnline.getCongSuatMayPhu()));
mapDonValue.put(DonOnline.NUOC_SAN_XUAT_MAY_PHU, GetterUtil.getString(donOnline.getNuocSanXuatMayPhu()));
mapDonValue.put(DonOnline.GIAY_PHEP_NHAP_KHAU, GetterUtil.getString(donOnline.getGiayPhepNhapKhau()));
mapDonValue.put(DonOnline.NGAY_GIAY_PHEP_NHAP_KHAU, GetterUtil.getString(donOnline.getNgayGiayPhepNhapKhau()));
mapDonValue.put(DonOnline.CO_QUAN_CAP_NK, GetterUtil.getString(donOnline.getCoQuanCapGPNK()));
mapDonValue.put(DonOnline.GIAY_CN_ATKT_BVMT, GetterUtil.getString(donOnline.getGiayChungNhanATKTBVMT()));
mapDonValue.put(DonOnline.CO_QUAN_CAP_CN, GetterUtil.getString(donOnline.getCoQuanCapCN()));
mapDonValue.put(DonOnline.HOA_DON_NOP_LE_PHI, GetterUtil.getString(donOnline.getHoaDonLePhi()));
mapDonValue.put(DonOnline.NGAY_HOA_DON, GetterUtil.getString(donOnline.getNgayHoaDonNopLePhi()));

mapDonRequired.put(DonOnline.KINH_GUI, "ctrl-required");
mapDonRequired.put(DonOnline.TO_CHUC_CA_NHAN, "ctrl-required");
mapDonRequired.put(DonOnline.TRU_SO_CHINH, "ctrl-required");
mapDonRequired.put(DonOnline.DIEN_THOAI, "ctrl-required");
//mapDonRequired.put(DonOnline.TEN_PHUONG_TIEN, "ctrl-required");
//mapDonRequired.put(DonOnline.KY_HIEU_THIET_KE, "ctrl-required");
mapDonRequired.put(DonOnline.DIEN_THOAI, "ctrl-required");
mapDonRequired.put(DonOnline.CONG_DUNG_TAU, "ctrl-required");
mapDonRequired.put(DonOnline.NAM_DONG, "ctrl-required");
mapDonRequired.put(DonOnline.CAP_TAU, "ctrl-required");
mapDonRequired.put(DonOnline.CHIEU_DAI_THIET_KE, "ctrl-required");
mapDonRequired.put(DonOnline.CHIEU_DAI_LON_NHAT, "ctrl-required");
mapDonRequired.put(DonOnline.CHIEU_CAO_MAN, "ctrl-required");
mapDonRequired.put(DonOnline.CHIEU_CHIM, "ctrl-required");
mapDonRequired.put(DonOnline.CHIEU_RONG_THIET_KE, "ctrl-required");
mapDonRequired.put(DonOnline.CHIEU_RONG_LON_NHAT, "ctrl-required");
mapDonRequired.put(DonOnline.MAN_KHO, "ctrl-required");
mapDonRequired.put(DonOnline.TRONG_TAI_TOAN_PHAN, "ctrl-required");
mapDonRequired.put(DonOnline.SO_NGUOI_DUOC_PHEP_CHO, "ctrl-required");
mapDonRequired.put(DonOnline.SUC_KEO_DAY, "ctrl-required");
mapDonRequired.put(DonOnline.SO_LUONG_MAY_CHINH, "ctrl-required");
mapDonRequired.put(DonOnline.KIEU_MAY_CHINH, "ctrl-required");
mapDonRequired.put(DonOnline.CONG_SUAT_MAY_CHINH, "ctrl-required");
mapDonRequired.put(DonOnline.NUOC_SAN_XUAT_MAY_CHINH, "ctrl-required");
mapDonRequired.put(DonOnline.TINH_THANH_PHO, "ctrl-required");
mapDonRequired.put(DonOnline.VAT_LIEU_VO, "ctrl-required");

%>
<h4 class="PL15 BGT BOB font14 col-xs-12"><%=bieuMauHoSo.getTenBieuMau()%></h4>

<aui:form action="<%= actionXemTruocNoiDung %>" name="fm" method="post" onSubmit='<%= "event.preventDefault(); " + renderResponse.getNamespace() + "saveDon();" %>'>
	<div class="P10 col-xs-12">
		<div class="BGT noidung">
			<div class="col-xs-12">
				<h3 class="tle text-center">ĐƠN ĐỀ NGHỊ ĐĂNG KÝ<br/>PHƯƠNG TIỆN THỦY NỘI ĐỊA<br/><span style="font-size:16px"><i>(Dùng cho phương tiện chưa khai thác, đăng ký lần đầu)</i></span></h3>
			</div>
			<div class="col-xs-12">
				
				<div class="col-xs-6 PA0">
					<label class="textlabel col-xs-4" for="sel1">Kính gửi: <span class="red">*</span></label>
					<p class="col-xs-8">
						<%= DuongThuyUtil.renderDonViThucHienCombobox(renderResponse.getNamespace(), 
								DonOnline.KINH_GUI, "form-control", "", "--- Lựa chọn ---", thuTucHanhChinhId, mapDonValue, mapDonRequired) %>
					</p>
				</div>
				<div class="clear"></div>
				<div class="col-xs-6 PA0">
					<label class="textlabel col-xs-4" for="sel1">Tổ chức, cá nhân đăng ký: <span class="red">*</span></label>
					<p class="col-xs-8">
						<%= DuongThuyUtil.renderInput(renderResponse.getNamespace(), 
							DonOnline.TO_CHUC_CA_NHAN, "form-control", mapDonValue, mapDonRequired) %>
					</p>
				</div>
				<div class="col-xs-6 PA0">
					<label class="col-xs-4" for="sel1">Đại diện cho các đồng sở hữu:</label>
					<p class="col-xs-8">
						<%= DuongThuyUtil.renderInput(renderResponse.getNamespace(), 
							DonOnline.DAI_DIEN, "form-control", mapDonValue, mapDonRequired) %>
					</p>
				</div>
				<div class="col-xs-12 PA0">
					<label class="textlabel col-xs-2" for="sel1">Trụ sở chính: <span class="red">*</span></label>
					<p class="col-xs-10">
						<%= DuongThuyUtil.renderInput(renderResponse.getNamespace(), 
							DonOnline.TRU_SO_CHINH, "form-control", mapDonValue, mapDonRequired) %>
						<span class="help-block" style="margin-bottom:0">Địa chỉ chủ phương tiện đặt trụ sở hoặc nơi đăng ký hộ khẩu thường trú hoặc nơi đăng ký tạm trú đối với trường hợp chủ phương tiện là cá nhân chưa có hộ khẩu thường trú nhưng có đăng ký tạm trú tại địa phương</span>
					</p>
				</div>
				<div class="col-xs-6 PA0">
					<label class="textlabel col-xs-4" for="sel1">Điện thoại: <span class="red">*</span></label>
					<p class="col-xs-6">
						<%= DuongThuyUtil.renderInput(renderResponse.getNamespace(), 
							DonOnline.DIEN_THOAI, "form-control", mapDonValue, mapDonRequired) %>
					</p>
				</div>
				<div class="col-xs-6 PA0">
					<label class="textlabel col-xs-4" for="sel1">Email:</label>
					<p class="col-xs-6">
						<%= DuongThuyUtil.renderInput(renderResponse.getNamespace(), 
							DonOnline.EMAIL, "form-control", mapDonValue, mapDonRequired) %>
					</p>
				</div>
				
				<label class="textlabel col-xs-10 col-xs-offset-2" style="font-size:14px; margin-bottom:15px">Đề nghị cơ quan cấp đăng ký phương tiện thủy nội địa với đặc điểm cơ bản như sau:</label>
				
				<div class="col-xs-6 PA0">
					<label class="textlabel col-xs-4" for="sel1">Tên phương tiện:</label>
					<p class="col-xs-8">
						<%= DuongThuyUtil.renderInput(renderResponse.getNamespace(), 
								DonOnline.TEN_PHUONG_TIEN, "form-control", mapDonValue, mapDonRequired) %>
					</p>
				</div>
				<div class="col-xs-6 PA0 MB10">
					<label class="col-xs-4 textlabel">Số đăng kiểm:</label>
					<div class="col-xs-8">
						<%= DuongThuyUtil.renderInput(renderResponse.getNamespace(), 
								DonOnline.KY_HIEU_THIET_KE, "form-control", mapDonValue, mapDonRequired) %>
					</div>
				</div>
				<div class="col-xs-6 PA0 MB10">
					<label class="col-xs-4 textlabel">Công dụng: <span class="red">*</span></label>
					<div class="col-xs-6">
						<%= DuongThuyUtil.renderDanhMucCombobox(renderResponse.getNamespace(), DonOnline.CONG_DUNG_TAU, "form-control", 
								"", "--- Lựa chọn ---", DTConstants.DANH_MUC.DM_CONGDUNGTAU, mapDonValue, mapDonRequired) %>
					</div>
				</div>
				<div class="col-xs-6 PA0 MB10">
					<label class="col-xs-4">Năm đóng: <c:if test="<%= Validator.isNotNull(mapDonRequired.get(DonOnline.NAM_DONG)) %>"><span class="red">*</span></c:if></label>
					<div class="col-xs-2">
						<%= DuongThuyUtil.renderInput(renderResponse.getNamespace(), 
								DonOnline.NAM_DONG, "form-control", mapDonValue, mapDonRequired) %>
					</div>
				</div>
				<div class="col-xs-6 PA0">
					<label class="textlabel col-xs-4" for="sel1">Nơi đóng: <span class="red">*</span></label>
					<p class="col-xs-8">
						<%= DuongThuyUtil.renderInput(renderResponse.getNamespace(), 
								DonOnline.NOI_DONG, "form-control", mapDonValue, mapDonRequired) %>
					</p>
				</div>
				<div class="clear"></div>
				<div class="col-xs-6 PA0 MB10">
					<label class="col-xs-4" for="sel1">Cấp tàu: <span class="red">*</span></label>
					<div class="col-xs-6">	
						<%= DuongThuyUtil.renderDanhMucCombobox(renderResponse.getNamespace(), DonOnline.CAP_TAU, "form-control", 
								"", "--- Lựa chọn ---", DTConstants.DANH_MUC.DM_CAPTAU, mapDonValue, mapDonRequired) %>
					</div>
				</div>
				<div class="col-xs-6 MB10 PA0">
					<label class="col-xs-4 textlabel" for="sel1">Vật liệu vỏ: <span class="red">*</span></label>
					<div class="col-xs-8">
						<%= DuongThuyUtil.renderInput(renderResponse.getNamespace(), 
								DonOnline.VAT_LIEU_VO, "form-control", mapDonValue, mapDonRequired) %>
					</div>
				</div>
				<div class="col-xs-6 PA0 MB10">
					<label class="col-xs-4 textlabel" for="sel1">Chiều dài thiết kế: <span class="red">*</span></label>
					<div class="col-xs-2">
						<%= DuongThuyUtil.renderInput(renderResponse.getNamespace(), 
								DonOnline.CHIEU_DAI_THIET_KE, "form-control pull-left ipt-w80", mapDonValue, mapDonRequired) %>
						<span class="pull-right textlabel">m</span>
					</div>
					<label class="col-xs-3 col-xs-offset-1 PAl0 textlabel" for="sel1">Chiều dài lớn nhất: <span class="red">*</span></label>
					<div class="col-xs-2">
						<%= DuongThuyUtil.renderInput(renderResponse.getNamespace(), 
								DonOnline.CHIEU_DAI_LON_NHAT, "form-control pull-left ipt-w80", mapDonValue, mapDonRequired) %>
						<span class="pull-right textlabel">m</span>
					</div>
				</div>
				<div class="col-xs-6 PA0 MB10">
					<label class="col-xs-3 textlabel" for="sel1">Chiều cao mạn: <span class="red">*</span></label>
					<div class="col-xs-2">
						<%= DuongThuyUtil.renderInput(renderResponse.getNamespace(), 
								DonOnline.CHIEU_CAO_MAN, "form-control pull-left ipt-w80", mapDonValue, mapDonRequired) %>
						<span class="pull-right textlabel">m</span>
					</div>
					<label class="col-xs-3 col-xs-offset-1 textlabel" for="sel1">Chiều chìm: <span class="red">*</span></label>
					<div class="col-xs-2 col-xs-offset-1">
						<%= DuongThuyUtil.renderInput(renderResponse.getNamespace(), 
								DonOnline.CHIEU_CHIM, "form-control pull-left ipt-w80", mapDonValue, mapDonRequired) %>
						<span class="pull-right textlabel">m</span>
					</div>
				</div>
				<div class="col-xs-6 PA0 MB10">
					<label class="col-xs-4 textlabel" for="sel1">Chiều rộng thiết kế: <span class="red">*</span></label>
					<div class="col-xs-2">
						<%= DuongThuyUtil.renderInput(renderResponse.getNamespace(), 
								DonOnline.CHIEU_RONG_THIET_KE, "form-control pull-left ipt-w80", mapDonValue, mapDonRequired) %>
						<span class="pull-right textlabel">m</span>
					</div>
					<label class="col-xs-3 col-xs-offset-1 PAl0 textlabel" for="sel1">Chiều rộng lớn nhất:<span class="red">*</span></label>
					<div class="col-xs-2">
						<%= DuongThuyUtil.renderInput(renderResponse.getNamespace(), 
								DonOnline.CHIEU_RONG_LON_NHAT, "form-control pull-left ipt-w80", mapDonValue, mapDonRequired) %>
						<span class="pull-right textlabel">m</span>
					</div>
				</div>
				<div class="col-xs-6 PA0 MB10">
					<label class="col-xs-3 textlabel" for="sel1">Mạn khô: <span class="red">*</span></label>
					<div class="col-xs-2">
						<%= DuongThuyUtil.renderInput(renderResponse.getNamespace(), 
								DonOnline.MAN_KHO, "form-control pull-left ipt-w80", mapDonValue, mapDonRequired) %>
						<span class="pull-right textlabel">m</span>
					</div>
					<label class="col-xs-3 col-xs-offset-1 textlabel" for="sel1">Trọng tải toàn phần:<span class="red">*</span></label>
					<div class="col-xs-2 col-xs-offset-1 PAr0">
						<%= DuongThuyUtil.renderInput(renderResponse.getNamespace(), 
								DonOnline.TRONG_TAI_TOAN_PHAN, "form-control pull-left ipt-w80", mapDonValue, mapDonRequired) %>
						<span class="pull-left textlabel">tấn</span>
					</div>
				</div>
				<div class="col-xs-6 PA0 MB10">
					<label class="col-xs-4 textlabel" for="sel1">Số người được phép chở: <span class="red">*</span></label>
					<div class="col-xs-2 PAr0" style="width:134px">
						<%= DuongThuyUtil.renderInput(renderResponse.getNamespace(), 
								DonOnline.SO_NGUOI_DUOC_PHEP_CHO, "form-control pull-left ipt-w80", mapDonValue, mapDonRequired) %>
						<span class="pull-left textlabel">người</span>
					</div>
					<label class="col-xs-3 PAl0 textlabel" for="sel1">Sức kéo, đẩy: <span class="red">*</span></label>
					<div class="col-xs-2 PAr0">
						<%= DuongThuyUtil.renderInput(renderResponse.getNamespace(), 
								DonOnline.SUC_KEO_DAY, "form-control pull-left ipt-w80", mapDonValue, mapDonRequired) %>
						<span class="pull-left textlabel">tấn</span>
					</div>
				</div>
				<div class="clear"></div>
				<div class="col-xs-6 PA0 MB10">
					<div class="col-xs-4">
						<label class="pull-left textlabel" for="sel1">Máy chính: <span class="red">*</span></label>
						<label class="pull-right textlabel" for="sel1">Số lượng: <span class="red">*</span></label>
					</div>
					<div class="col-xs-2">
						<%= DuongThuyUtil.renderInput(renderResponse.getNamespace(), 
								DonOnline.SO_LUONG_MAY_CHINH, "form-control pull-left ipt-w80", mapDonValue, mapDonRequired) %>
					</div>
					<label class="col-xs-1 col-xs-offset-1 PAl0 textlabel" for="sel1">Kiểu: <span class="red">*</span></label>
					<div class="col-xs-4">
						<%= DuongThuyUtil.renderDanhMucCombobox(renderResponse.getNamespace(), DonOnline.KIEU_MAY_CHINH, "form-control", 
								"", "--- Lựa chọn ---", DTConstants.DANH_MUC.DM_KIEUMAY, mapDonValue, mapDonRequired) %>
					</div>
				</div>
				<div class="col-xs-6 PA0 MB10">
					<label class="col-xs-3 textlabel" for="sel1">Công suất: <span class="red">*</span></label>
					<div class="col-xs-3">
						<%= DuongThuyUtil.renderInput(renderResponse.getNamespace(), 
								DonOnline.CONG_SUAT_MAY_CHINH, "form-control pull-left ipt-w90", mapDonValue, mapDonRequired) %>
						<span class="pull-left textlabel">CV</span>
					</div>
					<label class="col-xs-3 textlabel" for="sel1">Nước sản xuất: <span class="red">*</span></label>
					<div class="col-xs-3 PAl0">
						<%= DuongThuyUtil.renderDanhMucCombobox(renderResponse.getNamespace(), DonOnline.NUOC_SAN_XUAT_MAY_CHINH, "form-control", 
								"", "--- Lựa chọn ---", DTConstants.DANH_MUC.DM_QUOCGIA, mapDonValue, mapDonRequired) %>
					</div>
				</div>
				<div class="col-xs-6 PA0 MB10">
					<div class="col-xs-4">
						<label class="pull-left" for="sel1">Máy phụ<br/>(nếu có):</label>
						<label class="pull-right textlabel" for="sel1">Số lượng:</label>
					</div>
					<div class="col-xs-2">
						<%= DuongThuyUtil.renderInput(renderResponse.getNamespace(), 
								DonOnline.SO_LUONG_MAY_PHU, "form-control pull-left ipt-w80", mapDonValue, mapDonRequired) %>
					</div>
					<label class="col-xs-1 col-xs-offset-1 PAl0 textlabel" for="sel1">Kiểu: <c:if test="<%= Validator.isNotNull(mapDonRequired.get(DonOnline.KIEU_MAY_PHU)) %>"><span class="red">*</span></c:if></label>
					<div class="col-xs-4">
						<%=  DuongThuyUtil.renderDanhMucCombobox(renderResponse.getNamespace(), DonOnline.KIEU_MAY_PHU, "form-control", 
								"", "--- Lựa chọn ---", DTConstants.DANH_MUC.DM_KIEUMAY, mapDonValue, mapDonRequired) %>
					</div>
				</div>
				<div class="col-xs-6 PA0 MB10">
					<label class="col-xs-3 textlabel" for="sel1">Công suất:</label>
					<div class="col-xs-3">
						<%= DuongThuyUtil.renderInput(renderResponse.getNamespace(), 
								DonOnline.CONG_SUAT_MAY_PHU, "form-control pull-left ipt-w90", mapDonValue, mapDonRequired) %>
						<span class="pull-left textlabel">CV</span>
					</div>
					<label class="col-xs-3 textlabel" for="sel1">Nước sản xuất:</label>
					<div class="col-xs-3 PAl0">
						<%= DuongThuyUtil.renderDanhMucCombobox(renderResponse.getNamespace(), DonOnline.NUOC_SAN_XUAT_MAY_PHU, "form-control", 
								"", "--- Lựa chọn ---", DTConstants.DANH_MUC.DM_QUOCGIA, mapDonValue, mapDonRequired) %>
					</div>
				</div>
				<div class="clear"></div>
				
				<div class="col-xs-5 PA0 MB10">
					<label class="col-xs-6 textlabel" for="sel1">Giấy phép nhập khẩu (nếu có):</label>
					<div class="col-xs-6">
						<div class="input-group">
							<%= DuongThuyUtil.renderInput(renderResponse.getNamespace(), 
									DonOnline.GIAY_PHEP_NHAP_KHAU, "form-control", mapDonValue, mapDonRequired) %>
						</div>
					</div>
				</div>
				
				<div class="col-xs-3 PA0 MB10">
					<label class="col-xs-2 textlabel" for="sel1">Ngày:</label>
					<div class="col-xs-10">
						<div class="input-group">
							<%= DuongThuyUtil.renderInput(renderResponse.getNamespace(), 
									DonOnline.NGAY_GIAY_PHEP_NHAP_KHAU, "form-control ctrl-input-calendar", mapDonValue, mapDonRequired) %>
							<span class="input-group-addon ctrl-input-calendar"><i class="fa fa-calendar"></i></span>
						</div>
					</div>
				</div>
				
				<div class="col-xs-4 PA0">
					<label class="textlabel col-xs-4" for="sel1">Cơ quan cấp:</label>
					<p class="col-xs-8">
						<%= DuongThuyUtil.renderDanhMucCombobox(renderResponse.getNamespace(), DonOnline.CO_QUAN_CAP_NK, "form-control", 
								"", "--- Lựa chọn ---", DTConstants.DANH_MUC.DM_CQCP_NHAPKHAU, mapDonValue, mapDonRequired) %>
					</p>
				</div>
				
				<div class="clear"></div>
				<div class="col-xs-6 PA0">
					<label class="textlabel col-xs-4" for="sel1">Giấy CN ATKT&BVMT số:</label>
					<p class="col-xs-6">
						<%= DuongThuyUtil.renderInput(renderResponse.getNamespace(), 
								DonOnline.GIAY_CN_ATKT_BVMT, "form-control", mapDonValue, mapDonRequired) %>
					</p>
				</div>
				<div class="col-xs-6 PA0">
					<label class="textlabel col-xs-4" for="sel1">Cơ quan cấp:</label>
					<p class="col-xs-8">
						<%= DuongThuyUtil.renderDanhMucCombobox(renderResponse.getNamespace(), DonOnline.CO_QUAN_CAP_CN, "form-control", 
								"", "--- Lựa chọn ---", DTConstants.DANH_MUC.DM_CQCP_GCN, mapDonValue, mapDonRequired) %>
					</p>
				</div>
				<div class="col-xs-6 PA0">
					<label class="col-xs-4" for="sel1">Hóa đơn nộp lệ phí trước bạ số:</label>
					<p class="col-xs-6">
						<%= DuongThuyUtil.renderInput(renderResponse.getNamespace(), 
								DonOnline.HOA_DON_NOP_LE_PHI, "form-control", mapDonValue, mapDonRequired) %>
					</p>
				</div>
				<div class="col-xs-6 PA0">
					<label class="textlabel col-xs-4" for="sel1">Ngày:</label>
					<div class="col-xs-6">
						<div class="input-group">
							<%= DuongThuyUtil.renderInput(renderResponse.getNamespace(), 
									DonOnline.NGAY_HOA_DON, "form-control ctrl-input-calendar", mapDonValue, mapDonRequired) %>
							<span class="input-group-addon ctrl-input-calendar"><i class="fa fa-calendar"></i></span>
						</div>
					</div>
				</div>
				<div class="clear"></div>
				
				<p class="col-xs-12">Tôi cam đoan chấp hành nghiêm chỉnh mọi quy định của pháp luật về quản lý và sử dụng phương tiện.</p>
				
				<div class="clear"></div>
				
				<%@ include file="/html/hsdoanhnghiep/thongtinhoso/duongthuy/button_action.jspf"%>
			</div>
		</div>
	</div>
</aui:form>