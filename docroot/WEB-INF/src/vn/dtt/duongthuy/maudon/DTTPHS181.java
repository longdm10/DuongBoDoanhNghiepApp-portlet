
package vn.dtt.duongthuy.maudon;

import java.io.IOException;

import javax.portlet.PortletRequest;
import javax.servlet.http.HttpServletRequest;

import vn.dtt.duongbo.maudon.xml.MauDonFactory;
import vn.dtt.duongbo.maudon.xml.XmlUtils;
import vn.dtt.duongthuy.maudon.model.DonDTTPHS181;


public class DTTPHS181 extends DonOnline {
	
	public DTTPHS181(PortletRequest request) {
		super(request);
	}
	
	public DTTPHS181(HttpServletRequest request) {
		super(request);
	}
	
	public String getNoiDungXML() throws IOException {
		
		DonDTTPHS181 donOnline = new DonDTTPHS181();
		
		donOnline.setKinhGui(getKinhGui());
		donOnline.setToChucCaNhanDangKi(getToChucCaNhan());
		donOnline.setDaiDienChoCacDongSoHuu(getDaiDien());
		donOnline.setTenCoQuanDangKiTruocday(getTenCoQuanDangKyTruocDay());
		donOnline.setTruSoChinh(getTruSoChinh());
		donOnline.setDienThoai(getSoDienThoai());
		donOnline.setEmail(getEmail());
		donOnline.setTenPhuongTien(getTenPhuongTien());
		donOnline.setSoDangKy(getSoDangKy());
		donOnline.setKiHieuThietKe(getKyHieuThietKe());
		donOnline.setCongDung(getCongDung());
		donOnline.setNamDong(getNamDong());
		donOnline.setNoiDong(getNoiDong());
		donOnline.setCapTau(getCapTau());
		donOnline.setVatLieuVo(getVatLieuVo());
		donOnline.setChieuDaiThietKe(getChieuDaiThietKe());
		donOnline.setChieuDaiLonNhat(getChieuDaiLonNhat());
		donOnline.setChieuCaoMan(getChieuCaoMan());
		donOnline.setChieuChim(getChieuChim());
		donOnline.setChieuRongThietKe(getChieuRongThietKe());
		donOnline.setChieuRongLonNhat(getChieuRongLonNhat());
		donOnline.setManKho(getManKho());
		donOnline.setTrongTaiToanPhan(getTrongTaiToanPhan());
		donOnline.setSoNguoiDuocPhepCho(getSoNguoiDuocPhepCho());
		donOnline.setSucKeoDay(getSucKeoDay());
		donOnline.setSoLuongMayChinh(getSoLuongMayChinh());
		donOnline.setKieuMayChinh(getKieuMayChinh());
		donOnline.setCongSuatMayChinh(getCongSuatMayChinh());
		donOnline.setNuocSanXuatMayChinh(getNuocSanXuatMayChinh());
		donOnline.setSoLuongMayPhu(getSoLuongMayPhu());
		donOnline.setKieuMayPhu(getKieuMayPhu());
		donOnline.setCongSuatMayPhu(getCongSuatMayPhu());
		donOnline.setNuocSanXuatMayPhu(getNuocSanXuatMayPhu());
		//donOnline.setTenCoQuanDangKiTruocday(getTenCoQuanDangKyTruocDay());
		donOnline.setLyDoCapLai(getLyDoCapLai());
		donOnline.setPhuongTienNayDuocMuaLaiHayChuyenNhuong(getPhuongTienNayDuocMuaLaiHayChuyenNhuong());
		donOnline.setNguoiMuaLai(getNguoiMuaLai());
		donOnline.setDiaChiNguoiMua(getDiaChiNguoiMua());
		donOnline.setChonThanhPho(getTinhThanhPho());
		donOnline.setNhapNgay(getNgayTao());
		//bo sung 181 170
		donOnline.setDiaChiDangKyTruocDay(getDiaChiDangKyTruocDay());
		donOnline.setNgayDangKyTruocday(getNgayDangKyTruocDay());
		
		String noiDungXML = MauDonFactory.convertObjectToXml(donOnline);
			
		if(noiDungXML != null) {
			noiDungXML = XmlUtils.makeNoiDungXmlStandard(noiDungXML);
		}
		
		return noiDungXML;
	}
	
//	public String getTenCoQuanDangKyTruocDay() {
//		return tenCoQuanDangKyTruocDay;
//	}
//
//	public void setTenCoQuanDangKyTruocDay(String tenCoQuanDangKyTruocDay) {
//		this.tenCoQuanDangKyTruocDay = tenCoQuanDangKyTruocDay;
//	}
//
//	public String getLyDoCapLai() {
//		return lyDoCapLai;
//	}
//
//	public void setLyDoCapLai(String lyDoCapLai) {
//		this.lyDoCapLai = lyDoCapLai;
//	}
//
//	public String getSoDangKy() {
//		return soDangKy;
//	}
//
//	public void setSoDangKy(String soDangKy) {
//		this.soDangKy = soDangKy;
//	}
//
//	public String getMuaLaiHoacDieuChuyen() {
//		return muaLaiHoacDieuChuyen;
//	}
//
//	public void setMuaLaiHoacDieuChuyen(String muaLaiHoacDieuChuyen) {
//		this.muaLaiHoacDieuChuyen = muaLaiHoacDieuChuyen;
//	}
//
//	public String getNguoiMuaLai() {
//		return nguoiMuaLai;
//	}
//
//	public void setNguoiMuaLai(String nguoiMuaLai) {
//		this.nguoiMuaLai = nguoiMuaLai;
//	}
//
//	public String getDiaChiNguoiMua() {
//		return diaChiNguoiMua;
//	}
//
//	public void setDiaChiNguoiMua(String diaChiNguoiMua) {
//		this.diaChiNguoiMua = diaChiNguoiMua;
//	}
//
//	private String soDangKy;
//	private String tenCoQuanDangKyTruocDay;
//	private String lyDoCapLai;
//	private String muaLaiHoacDieuChuyen;
//	private String nguoiMuaLai;
//	private String diaChiNguoiMua;
}
