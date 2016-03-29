
package vn.dtt.duongthuy.maudon;

import java.io.IOException;
import java.util.List;

import javax.portlet.PortletRequest;
import javax.servlet.http.HttpServletRequest;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.duongbo.maudon.xml.MauDonFactory;
import vn.dtt.duongbo.maudon.xml.XmlUtils;
import vn.dtt.duongthuy.maudon.model.DonDTTPHS90;


public class DTTPHS90 extends DonOnline {
	
	public DTTPHS90(PortletRequest request) {
		super(request);
	}
	
	public DTTPHS90(HttpServletRequest request) {
		super(request);
	}
	
	public String getNoiDungXML() throws IOException {
		
		DonDTTPHS90 donDTTPHS90 = new DonDTTPHS90();
		
		donDTTPHS90.setKinhGui(getKinhGui());
		donDTTPHS90.setTenToiLa(getTenToiLa());
		donDTTPHS90.setQuocTich(getQuocTich());
		donDTTPHS90.setGioiTinh(getGioiTinh());
		donDTTPHS90.setNgaySinh(getNgaySinh());
		donDTTPHS90.setNoiCuTru(getNoiCuTru());
		donDTTPHS90.setSoDienThoai(getSoDienThoai());
		donDTTPHS90.setEmail(getEmail());
		donDTTPHS90.setSoCmnd(getSoCMND());
		donDTTPHS90.setNoiCapCmnd(getNoiCapCMND());
		donDTTPHS90.setNgayCapCmnd(getNgayCapCMND());
		donDTTPHS90.setDaTotNghiepNganhHoc(getNganhHoc());
		donDTTPHS90.setKhoa(getKhoaHoc());
		donDTTPHS90.setTruong(getTruongHoc());
		donDTTPHS90.setSoGCNKMCNCCCMDuocCapBang(getSoGCN());
		donDTTPHS90.setNgayCapGCNKMCNCCCM(getNgayCapCMND());
		donDTTPHS90.setQuyetDinhSo(getQuyetDinhSo());
		donDTTPHS90.setNgayQuyetDinh(getNgayQuyetDinh());
		donDTTPHS90.setCua(getCua());
		donDTTPHS90.setDoiChieu(getDoiChieu());
		donDTTPHS90.setDeNghi(getKinhGui());
		donDTTPHS90.setTinhThanhPho(getTinhThanhPho());
		donDTTPHS90.setNgayTao(getNgayTao());
		donDTTPHS90.setHang(getHang());
		
		List<DonDTTPHS90.QuaTrinhLamViecPTTND> listQuaTrinhLamViec = donDTTPHS90.getQuaTrinhLamViecPTTND();
		
		try {
			for(int i=0; i < getRowIndex().length; i++) {
				DonDTTPHS90.QuaTrinhLamViecPTTND qtlv = new DonDTTPHS90.QuaTrinhLamViecPTTND();
				qtlv.setTuNgay(getQtlvTuNgays()[i]);
				qtlv.setDenNgay(getQtlvDenNgays()[i]);
				qtlv.setChucDanh(getQtlvChucDanhs()[i]);
				qtlv.setNoiLamViec(getQtlvNoiLamViecs()[i]);
				qtlv.setSoPTTND(getQtlvSoPTTNDs()[i]);
				qtlv.setGhiChu(getQtlvGhiChus()[i]);
				
				listQuaTrinhLamViec.add(qtlv);
			}
		} catch(Exception e) {
			_log.error(e);
		}
		
		String noiDungXML = MauDonFactory.convertObjectToXml(donDTTPHS90);
			
		if(noiDungXML != null) {
			noiDungXML = XmlUtils.makeNoiDungXmlStandard(noiDungXML);
		}
		
		return noiDungXML;
	}
	
	private static Log _log = LogFactoryUtil.getLog(DTTPHS90.class);
}
