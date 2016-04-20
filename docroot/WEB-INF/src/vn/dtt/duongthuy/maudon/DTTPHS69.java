
package vn.dtt.duongthuy.maudon;

import java.io.IOException;
import java.util.List;

import javax.portlet.PortletRequest;
import javax.servlet.http.HttpServletRequest;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.duongbo.maudon.xml.MauDonFactory;
import vn.dtt.duongbo.maudon.xml.XmlUtils;
import vn.dtt.duongthuy.maudon.model.DonDTTPHS69;

public class DTTPHS69 extends DonOnline {
	
	public DTTPHS69(PortletRequest request) {
		super(request);
	}
	
	public DTTPHS69(HttpServletRequest request) {
		super(request);
	}
	
	public String getNoiDungXML() throws IOException {
		
		DonDTTPHS69 donDTTPHS69 = new DonDTTPHS69();
		
		donDTTPHS69.setKinhGui(getKinhGui());
		donDTTPHS69.setTenToiLa(getTenToiLa());
		donDTTPHS69.setQuocTich(getQuocTich());
		donDTTPHS69.setGioiTinh(getGioiTinh());
		donDTTPHS69.setNgaySinh(getNgaySinh());
		donDTTPHS69.setNoiCuTru(getNoiCuTru());
		donDTTPHS69.setSoDienThoai(getSoDienThoai());
		donDTTPHS69.setEmail(getEmail());
		donDTTPHS69.setSoCmnd(getSoCMND());
		donDTTPHS69.setNoiCapCmnd(getNoiCapCMND());
		donDTTPHS69.setNgayCapCmnd(getNgayCapCMND());
		donDTTPHS69.setDaTotNghiepNganhHoc(getNganhHoc());
		donDTTPHS69.setKhoa(getKhoaHoc());
		donDTTPHS69.setTruong(getTruongHoc());
		donDTTPHS69.setSoGCNKMCNCCCMDuocCapBang(getSoGCN());
		donDTTPHS69.setNgayCapGCNKMCNCCCM(getNgayCapCMND());
		donDTTPHS69.setQuyetDinhSo(getQuyetDinhSo());
		donDTTPHS69.setNgayQuyetDinh(getNgayQuyetDinh());
		donDTTPHS69.setCua(getCua());
		donDTTPHS69.setDoiChieu(getDoiChieu());
		donDTTPHS69.setDeNghi(getKinhGui());
		donDTTPHS69.setTinhThanhPho(getTinhThanhPho());
		donDTTPHS69.setNgayTao(getNgayTao());
		donDTTPHS69.setHang(getHang());
		
		List<DonDTTPHS69.QuaTrinhLamViecPTTND> listQuaTrinhLamViec = donDTTPHS69.getQuaTrinhLamViecPTTND();
		
		try {
			for(int i=0; i < getRowIndex().length; i++) {
				DonDTTPHS69.QuaTrinhLamViecPTTND qtlv = new DonDTTPHS69.QuaTrinhLamViecPTTND();
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
		
		String noiDungXML = MauDonFactory.convertObjectToXml(donDTTPHS69);
			
		if(noiDungXML != null) {
			noiDungXML = XmlUtils.makeNoiDungXmlStandard(noiDungXML);
		}
		
		return noiDungXML;
	}
	
	private static Log _log = LogFactoryUtil.getLog(DTTPHS69.class);
}
