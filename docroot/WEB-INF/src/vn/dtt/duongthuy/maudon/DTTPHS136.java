
package vn.dtt.duongthuy.maudon;

import java.io.IOException;

import javax.portlet.PortletRequest;
import javax.servlet.http.HttpServletRequest;

import com.liferay.portal.kernel.util.ParamUtil;

import vn.dtt.duongbo.maudon.xml.MauDonFactory;
import vn.dtt.duongbo.maudon.xml.XmlUtils;
import vn.dtt.duongthuy.maudon.model.DonDTTPHS136;

public class DTTPHS136 extends DonOnline {
	
	public DTTPHS136(PortletRequest request) {
		super(request);
		setNamHoatDong(ParamUtil.getString(request, NAM_HOAT_DONG));
	}
	
	public DTTPHS136(HttpServletRequest request) {
		super(request);
		setNamHoatDong(ParamUtil.getString(request, NAM_HOAT_DONG));
	}
	
	public String getNoiDungXML() throws IOException {
		
		DonDTTPHS136 donOnline = new DonDTTPHS136();
		
		donOnline.setKinhGui(getKinhGui());
		donOnline.setToChucCaNhanDangKi(getToChucCaNhan());
		donOnline.setTruSoChinh(getTruSoChinh());
		donOnline.setDaiDienChoCacDongSoHuu(getDaiDien());
		donOnline.setDienThoai(getSoDienThoai());
		donOnline.setEmail(getEmail());
		donOnline.setTenPhuongTien(getTenPhuongTien());
		donOnline.setChieuCaoMan(getChieuCaoMan());
		donOnline.setCongDung(getCongDung());
		donOnline.setManKho(getManKho());
		donOnline.setNamDong(getNamDong());
		donOnline.setNoiDong(getNoiDong());
		donOnline.setNamHoatDong(getNamHoatDong());
		donOnline.setChieuDaiLonNhat(getChieuDaiLonNhat());
		donOnline.setSoNguoiDuocPhepCho(getSoNguoiDuocPhepCho());
		donOnline.setVatLieuVo(getVatLieuVo());
		donOnline.setChieuRongLonNhat(getChieuRongLonNhat());
		donOnline.setSucKeoDay(getSucKeoDay());
		donOnline.setChieuChim(getChieuChim());
		donOnline.setTrongTaiToanPhan(getTrongTaiToanPhan());
		donOnline.setSoLuongMayChinh(getSoLuongMayChinh());
		donOnline.setKieuMayChinh(getKieuMayChinh());
		donOnline.setCongSuatMayChinh(getCongSuatMayChinh());
		donOnline.setNuocSanXuatMayChinh(getNuocSanXuatMayChinh());
		donOnline.setSoLuongMayPhu(getSoLuongMayPhu());
		donOnline.setKieuMayPhu(getKieuMayPhu());
		donOnline.setCongSuatMayPhu(getCongSuatMayPhu());
		donOnline.setNuocSanXuatMayPhu(getNuocSanXuatMayPhu());
		donOnline.setPhuongTienMuaLaiHayDongLai(getPhuongTienMuaLaiHayDongLai());
		donOnline.setDiaChi(getPhuongTienNayDuocMuaLaiHayChuyenNhuong());
		donOnline.setThoiGianMuaChon(getThoiGianMuaChon());
		donOnline.setThoiGianMuaNhap(getThoiGianMuaNhap());
		donOnline.setHoaDonNopLePhi(getHoaDonNopLePhi());
		donOnline.setThoiGianNopLePhi(getHoaDonNgay());
		donOnline.setTinhThanhPho(getTinhThanhPho());
		
		String noiDungXML = MauDonFactory.convertObjectToXml(donOnline);
			
		if(noiDungXML != null) {
			noiDungXML = XmlUtils.makeNoiDungXmlStandard(noiDungXML);
		}
		
		return noiDungXML;
	}
	
	public String getNamHoatDong() {
		return namHoatDong;
	}

	public void setNamHoatDong(String namHoatDong) {
		this.namHoatDong = namHoatDong;
	}

	private String namHoatDong;
}
