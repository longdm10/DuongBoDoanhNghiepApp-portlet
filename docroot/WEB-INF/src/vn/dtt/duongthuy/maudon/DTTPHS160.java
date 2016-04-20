
package vn.dtt.duongthuy.maudon;

import java.io.IOException;

import javax.portlet.PortletRequest;
import javax.servlet.http.HttpServletRequest;

import vn.dtt.duongbo.maudon.xml.MauDonFactory;
import vn.dtt.duongbo.maudon.xml.XmlUtils;
import vn.dtt.duongthuy.maudon.model.DonDTTPHS160;


public class DTTPHS160 extends DonOnline {
	
	public DTTPHS160(PortletRequest request) {
		super(request);
	}
	
	public DTTPHS160(HttpServletRequest request) {
		super(request);
	}
	
	public String getNoiDungXML() throws IOException {
		
		DonDTTPHS160 donOnline = new DonDTTPHS160();
		
		donOnline.setKinhGui(getKinhGui());
		donOnline.setToChucCaNhanDangKi(getToChucCaNhan());
		donOnline.setDaiDienChoCacDongSoHuu(getDaiDien());
		donOnline.setTenCoQuanDangKiTruocday(getTenCoQuanDangKyTruocDay());
		donOnline.setTruSoChinh(getTruSoChinh());
		donOnline.setDienThoai(getSoDienThoai());
		donOnline.setEmail(getEmail());
		donOnline.setTenPhuongTien(getTenPhuongTien());
		donOnline.setSoDangKy(getSoDangKy());
		donOnline.setNhapNgay(getNgayCapPhuongTien());
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
		donOnline.setThongSoCoBan(getThongSoCoBan());
		donOnline.setChonThanhPho(getTinhThanhPho());
		//bo sung 169 170
//		donOnline.setDiaChiDangKyTruocDay(getDiaChiDangKyTruocDay());
//		donOnline.setNgayDangKyTruocday(getNgayDangKyTruocDay());
		//donOnline.setNhapNgay(getNgayTao());
		
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
//	public String getThongSoCoBan() {
//		return thongSoCoBan;
//	}
//
//	public void setThongSoCoBan(String thongSoCoBan) {
//		this.thongSoCoBan = thongSoCoBan;
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
//	private String soDangKy;
//	private String tenCoQuanDangKyTruocDay;
//	private String lyDoCapLai;
//	private String thongSoCoBan;
}
