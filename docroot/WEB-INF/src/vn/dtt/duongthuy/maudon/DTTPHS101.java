
package vn.dtt.duongthuy.maudon;

import java.io.IOException;
import java.util.List;

import javax.portlet.PortletRequest;
import javax.servlet.http.HttpServletRequest;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.duongbo.maudon.xml.MauDonFactory;
import vn.dtt.duongbo.maudon.xml.XmlUtils;
import vn.dtt.duongthuy.maudon.model.DonDTTPHS101;

public class DTTPHS101 extends DonOnline {
	
	public DTTPHS101(PortletRequest request) {
		super(request);
	}
	
	public DTTPHS101(HttpServletRequest request) {
		super(request);
	}
	
	public String getNoiDungXML() throws IOException {
		
		DonDTTPHS101 donDTTPHS101 = new DonDTTPHS101();
		
		donDTTPHS101.setKinhGui(getKinhGui());
		donDTTPHS101.setTenToiLa(getTenToiLa());
		donDTTPHS101.setQuocTich(getQuocTich());
		donDTTPHS101.setGioiTinh(getGioiTinh());
		donDTTPHS101.setNgaySinh(getNgaySinh());
		donDTTPHS101.setNoiCuTru(getNoiCuTru());
		donDTTPHS101.setSoDienThoai(getSoDienThoai());
		donDTTPHS101.setEmail(getEmail());
		donDTTPHS101.setSoCmnd(getSoCMND());
		donDTTPHS101.setNoiCapCmnd(getNoiCapCMND());
		donDTTPHS101.setNgayCapCmnd(getNgayCapCMND());
		donDTTPHS101.setDaTotNghiepNganhHoc(getNganhHoc());
		donDTTPHS101.setKhoa(getKhoaHoc());
		donDTTPHS101.setTruong(getTruongHoc());
		donDTTPHS101.setSoGCNKMCNCCCMDuocCapBang(getSoGCN());
		donDTTPHS101.setNgayCapGCNKMCNCCCM(getNgayCapCMND());
		donDTTPHS101.setQuyetDinhSo(getQuyetDinhSo());
		donDTTPHS101.setNgayQuyetDinh(getNgayQuyetDinh());
		donDTTPHS101.setCua(getCua());
		donDTTPHS101.setDoiChieu(getDoiChieu());
		donDTTPHS101.setDeNghi(getKinhGui());
		donDTTPHS101.setTinhThanhPho(getTinhThanhPho());
		donDTTPHS101.setNgayTao(getNgayTao());
		donDTTPHS101.setHang(getHang());
		
		List<DonDTTPHS101.QuaTrinhLamViecPTTND> listQuaTrinhLamViec = donDTTPHS101.getQuaTrinhLamViecPTTND();
		
		try {
			for(int i=0; i < getRowIndex().length; i++) {
				DonDTTPHS101.QuaTrinhLamViecPTTND qtlv = new DonDTTPHS101.QuaTrinhLamViecPTTND();
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
		
		String noiDungXML = MauDonFactory.convertObjectToXml(donDTTPHS101);
			
		if(noiDungXML != null) {
			noiDungXML = XmlUtils.makeNoiDungXmlStandard(noiDungXML);
		}
		
		return noiDungXML;
	}
	
	private static Log _log = LogFactoryUtil.getLog(DTTPHS101.class);
}
