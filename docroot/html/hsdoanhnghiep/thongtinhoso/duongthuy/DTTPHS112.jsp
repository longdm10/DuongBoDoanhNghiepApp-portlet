
<%@ include file="init.jsp"%>

<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
DonDTTPHS112 donOnline = (DonDTTPHS112) DuongThuyUtil.getDonOnline(noiDungHoSoId, noiDungXML);

List<Map<String, String>> listQuaTrinhLamViec = new ArrayList<Map<String, String>>();

if(donOnline == null) {
	donOnline = new DonDTTPHS112();
}

// Khoi tao List QuaTrinhLamViec cho don
if(donOnline.getQuaTrinhLamViecPTTND() == null || donOnline.getQuaTrinhLamViecPTTND().size() == 0) {
	donOnline.getQuaTrinhLamViecPTTND().add(new DonDTTPHS112.QuaTrinhLamViecPTTND());
}

for(int i = 0; i < donOnline.getQuaTrinhLamViecPTTND().size(); i++) {
	DonDTTPHS112.QuaTrinhLamViecPTTND quaTrinhLamViec = donOnline.getQuaTrinhLamViecPTTND().get(i);
	
	Map<String, String> mQuaTrinhLamViec = new HashMap<String, String>();
	
	mQuaTrinhLamViec.put(DonOnline.QTLV_TU_NGAY, quaTrinhLamViec.getTuNgay());
	mQuaTrinhLamViec.put(DonOnline.QTLV_DEN_NGAY, quaTrinhLamViec.getDenNgay());
	mQuaTrinhLamViec.put(DonOnline.QTLV_CHUC_DANH, quaTrinhLamViec.getChucDanh());
	mQuaTrinhLamViec.put(DonOnline.QTLV_NOI_LAM_VIEC, quaTrinhLamViec.getNoiLamViec());
	mQuaTrinhLamViec.put(DonOnline.QTLV_SO_PTTND, quaTrinhLamViec.getSoPTTND());
	mQuaTrinhLamViec.put(DonOnline.QTLV_GHI_CHU, quaTrinhLamViec.getGhiChu());
	
	listQuaTrinhLamViec.add(mQuaTrinhLamViec);
}

String kinhGui = GetterUtil.getString(donOnline.getKinhGui());
String tenToiLa = GetterUtil.getString(donOnline.getTenToiLa());
String quocTich = GetterUtil.getString(donOnline.getQuocTich());
String gioiTinh = GetterUtil.getString(donOnline.getGioiTinh());
String ngaySinh = GetterUtil.getString(donOnline.getNgaySinh());
String noiCuTru = GetterUtil.getString(donOnline.getNoiCuTru());
String soDienThoai = GetterUtil.getString(donOnline.getSoDienThoai());
String email = GetterUtil.getString(donOnline.getEmail());
String soCMND = GetterUtil.getString(donOnline.getSoCmnd());
String noiCapCMND = GetterUtil.getString(donOnline.getNoiCapCmnd());
String ngayCapCMND = GetterUtil.getString(donOnline.getNgayCapCmnd());
String nganhHoc = GetterUtil.getString(donOnline.getDaTotNghiepNganhHoc());
String khoaHoc = GetterUtil.getString(donOnline.getKhoa());
String truongHoc = GetterUtil.getString(donOnline.getTruong());
String soGCN = GetterUtil.getString(donOnline.getSoGCNKMCNCCCMDuocCapBang());
String ngayCapGCN = GetterUtil.getString(donOnline.getNgayCapGCNKMCNCCCM());
String quyetDinhSo = GetterUtil.getString(donOnline.getQuyetDinhSo());
String ngayQuyetDinh = GetterUtil.getString(donOnline.getNgayQuyetDinh());
String cua = GetterUtil.getString(donOnline.getCua());
String doiChieu = GetterUtil.getString(donOnline.getDoiChieu());
mapDonValue.put(DonOnline.TINH_THANH_PHO, donOnline.getTinhThanhPho());
String hangGCN = GetterUtil.getString(donOnline.getHang());

List<DmDataItem> listDieuKien = DmDataItemLocalServiceUtil.findByGroupCode(DTConstants.DANH_MUC.DM_GCNKNCM_CCCMDB_CCNV);

mapDonValue.put(DonOnline.HANG, hangGCN);

mapDonRequired.put(DonOnline.KINH_GUI, "ctrl-required");
mapDonRequired.put(DonOnline.TEN, "ctrl-required");
mapDonRequired.put(DonOnline.QUOC_TICH, "ctrl-required");
mapDonRequired.put(DonOnline.GIOI_TINH, "ctrl-required");
mapDonRequired.put(DonOnline.NGAY_SINH, "ctrl-required");
mapDonRequired.put(DonOnline.NOI_CO_TRU, "ctrl-required");
mapDonRequired.put(DonOnline.DIEN_THOAI, "ctrl-required");
mapDonRequired.put(DonOnline.SO_CMND, "ctrl-required");
mapDonRequired.put(DonOnline.NOI_CAP_CMND, "ctrl-required");
mapDonRequired.put(DonOnline.NGAY_CAP_CMND, "ctrl-required");
mapDonRequired.put(DonOnline.NGANH_TOT_NGHIEP, "ctrl-required");
//mapDonRequired.put(DonOnline.TRUONG_TOT_NGHIEP, "ctrl-required");
//mapDonRequired.put(DonOnline.SO_BANG, "ctrl-required");
//mapDonRequired.put(DonOnline.NGAY_CAP_BANG, "ctrl-required");
//mapDonRequired.put(DonOnline.SO_QUYET_DINH, "ctrl-required");
//mapDonRequired.put(DonOnline.NGAY_QUYET_DINH, "ctrl-required");
mapDonRequired.put(DonOnline.TINH_THANH_PHO, "ctrl-required");
mapDonRequired.put(DonOnline.QTLV_TU_NGAY, "ctrl-required");
mapDonRequired.put(DonOnline.QTLV_DEN_NGAY, "ctrl-required");
mapDonRequired.put(DonOnline.QTLV_CHUC_DANH, "ctrl-required");
mapDonRequired.put(DonOnline.QTLV_NOI_LAM_VIEC, "ctrl-required");
mapDonRequired.put(DonOnline.QTLV_SO_PTTND, "ctrl-required");
mapDonRequired.put(DonOnline.HANG, "ctrl-required");

%>
<h4 class="PL15 BGT BOB font14 col-xs-12"><%=bieuMauHoSo.getTenBieuMau()%></h4>

<aui:form action="<%= actionXemTruocNoiDung %>" name="fm" method="post" onSubmit='<%= "event.preventDefault(); " + renderResponse.getNamespace() + "saveDon();" %>'>
	<div class="P10 col-xs-12">
		<div class="BGT noidung">
			<div class="col-xs-12">
				<h3 class="tle text-center">ĐƠN ĐỀ NGHỊ<br/>DỰ HỌC,THI, KIỂM TRA, CẤP, CẤP LẠI, CHUYỂN ĐỔI GCNKNCM, CCCM</h3>
			</div>
			<div class="col-xs-12">
				<%@ include file="/html/hsdoanhnghiep/thongtinhoso/duongthuy/ttc_don_2.jspf"%>
				
				<div class="col-xs-12 MB10">
					<label class="textlabel col-xs-2" >Cho tôi được :</label>
					<strong class="textlabel col-xs-4">
						<span id="<portlet:namespace />txtDieuKien"></span>
					</strong>
				</div>
				
				<div class="col-xs-12 MB10">
					<label class="textlabel col-xs-2" >Hạng :</label>
					<div class="col-xs-4">
						<%= DuongThuyUtil.renderDanhMucCombobox(renderResponse.getNamespace(), DonOnline.HANG, "form-control", 
								"", "--- Lựa chọn ---", DTConstants.DANH_MUC.DM_HANG_GCN, mapDonValue, mapDonRequired) %>
					</div>
				</div>
				
				<div class="clear"></div>
				
				<div class="col-xs-12">
					<p class="" >Tôi xin cam đoan những điều khai trên là đúng sự thật, nếu sai tôi xin hoàn toàn chịu trách nhiệm.</p>
				</div>
				
				<div class="clear"></div>
				
				<div class="col-xs-12">(1) Nếu người làm thủ tục đăng ký dự học, dự kiểm tra lấy CCNV thì không phải điền các mục này.</div>
				
				<%@ include file="/html/hsdoanhnghiep/thongtinhoso/duongthuy/button_action.jspf"%>
			</div>
		</div>
	</div>
</aui:form>