package vn.dtt.duongthuy.maudon;

import java.io.IOException;

import javax.portlet.PortletRequest;
import javax.servlet.http.HttpServletRequest;

import vn.dtt.duongbo.maudon.xml.MauDonFactory;
import vn.dtt.duongbo.maudon.xml.XmlUtils;
import vn.dtt.duongthuy.maudon.model.DonDTTPHS209;

public class DTTPHS209 extends DonOnline {

	public DTTPHS209(PortletRequest request) {
		super(request);
		// TODO Auto-generated constructor stub
	}
	public DTTPHS209(HttpServletRequest request) {
		super(request);
	}
	
	public String getNoiDungXML() throws IOException {
		DonDTTPHS209 donOnline = new DonDTTPHS209();
		
		donOnline.setKinhGui(getKinhGui());
		donOnline.setToChucCaNhanDangKi(getToChucCaNhan());
		donOnline.setDaiDienChoCacDongSoHuu(getDaiDien());
		//donOnline.setTenCoQuanDangKiTruocday(getTenCoQuanDangKyTruocDay());
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
	//	donOnline.setTenCoQuanDangKiTruocday(getTenCoQuanDangKyTruocDay());
		donOnline.setLyDoXoaPhuongTien(getLyDoXoaDangKy());
		//donOnline.setThongSoCoBan(getThongSoCoBan());
		donOnline.setChonThanhPho(getTinhThanhPho());
		//donOnline.setNhapNgay(getNgayTao());
		
		
		
		String noiDungXML = MauDonFactory.convertObjectToXml(donOnline);
		
		if(noiDungXML != null) {
			noiDungXML = XmlUtils.makeNoiDungXmlStandard(noiDungXML);
		}
		
		return noiDungXML;
		
	}
	
	
	
	
}
