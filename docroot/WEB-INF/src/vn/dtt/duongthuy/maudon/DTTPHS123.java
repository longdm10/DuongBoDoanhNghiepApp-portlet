
package vn.dtt.duongthuy.maudon;

import java.io.IOException;

import javax.portlet.PortletRequest;
import javax.servlet.http.HttpServletRequest;

import vn.dtt.duongbo.maudon.xml.MauDonFactory;
import vn.dtt.duongbo.maudon.xml.XmlUtils;
import vn.dtt.duongthuy.maudon.model.DonDTTPHS123;


public class DTTPHS123 extends DonOnline {
	
	public DTTPHS123(PortletRequest request) {
		super(request);
	}
	
	public DTTPHS123(HttpServletRequest request) {
		super(request);
	}
	
	public String getNoiDungXML() throws IOException {
		
		DonDTTPHS123 donOnline = new DonDTTPHS123();
		
		donOnline.setKinhGui(getKinhGui());
		donOnline.setToChucCaNhanDangKi(getToChucCaNhan());
		donOnline.setDaiDienChoCacDongSoHuu(getDaiDien());
		donOnline.setTruSoChinh(getTruSoChinh());
		donOnline.setDienThoai(getSoDienThoai());
		donOnline.setEmail(getEmail());
		donOnline.setTenPhuongTien(getTenPhuongTien());
		donOnline.setKiHieuThietKe(getKyHieuThietKe());
		donOnline.setCongDung(getCongDung());
		donOnline.setNamDong(getNamDong());
		donOnline.setCapTau(getCapTau());
		donOnline.setNoiDong(getNoiDong());
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
		donOnline.setGiayPhepNhapKhau(getGiayPhepNhapKhau());
		donOnline.setNgayGiayPhepNhapKhau(getNgayGiayPhepNhapKhau());
		donOnline.setCoQuanCapGPNK(getCoQuanCapNhapKhau());
		donOnline.setGiayChungNhanATKTBVMT(getGiayCN());
		donOnline.setCoQuanCapCN(getCoQuanCapCN());
		donOnline.setHoaDonLePhi(getHoaDonNopLePhi());
		donOnline.setNgayHoaDonNopLePhi(getHoaDonNgay());
		donOnline.setTinhThanhPho(getTinhThanhPho());
		String noiDungXML = MauDonFactory.convertObjectToXml(donOnline);
			
		if(noiDungXML != null) {
			noiDungXML = XmlUtils.makeNoiDungXmlStandard(noiDungXML);
		}
		
		return noiDungXML;
	}
	
	
}
