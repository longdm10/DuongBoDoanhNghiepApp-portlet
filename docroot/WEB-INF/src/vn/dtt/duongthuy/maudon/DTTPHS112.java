
package vn.dtt.duongthuy.maudon;

import java.io.IOException;
import java.util.List;

import javax.portlet.PortletRequest;
import javax.servlet.http.HttpServletRequest;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.duongbo.maudon.xml.MauDonFactory;
import vn.dtt.duongbo.maudon.xml.XmlUtils;
import vn.dtt.duongthuy.maudon.model.DonDTTPHS112;

public class DTTPHS112 extends DonOnline {
	
	public DTTPHS112(PortletRequest request) {
		super(request);
	}
	
	public DTTPHS112(HttpServletRequest request) {
		super(request);
	}
	
	public String getNoiDungXML() throws IOException {
		
		DonDTTPHS112 donDTTPHS112 = new DonDTTPHS112();
		
		donDTTPHS112.setKinhGui(getKinhGui());
		donDTTPHS112.setTenToiLa(getTenToiLa());
		donDTTPHS112.setQuocTich(getQuocTich());
		donDTTPHS112.setGioiTinh(getGioiTinh());
		donDTTPHS112.setNgaySinh(getNgaySinh());
		donDTTPHS112.setNoiCuTru(getNoiCuTru());
		donDTTPHS112.setSoDienThoai(getSoDienThoai());
		donDTTPHS112.setEmail(getEmail());
		donDTTPHS112.setSoCmnd(getSoCMND());
		donDTTPHS112.setNoiCapCmnd(getNoiCapCMND());
		donDTTPHS112.setNgayCapCmnd(getNgayCapCMND());
		donDTTPHS112.setDaTotNghiepNganhHoc(getNganhHoc());
		donDTTPHS112.setKhoa(getKhoaHoc());
		donDTTPHS112.setTruong(getTruongHoc());
		donDTTPHS112.setSoGCNKMCNCCCMDuocCapBang(getSoGCN());
		donDTTPHS112.setNgayCapGCNKMCNCCCM(getNgayCapCMND());
		donDTTPHS112.setQuyetDinhSo(getQuyetDinhSo());
		donDTTPHS112.setNgayQuyetDinh(getNgayQuyetDinh());
		donDTTPHS112.setCua(getCua());
		donDTTPHS112.setDoiChieu(getDoiChieu());
		donDTTPHS112.setDeNghi(getKinhGui());
		donDTTPHS112.setTinhThanhPho(getTinhThanhPho());
		donDTTPHS112.setNgayTao(getNgayTao());
		donDTTPHS112.setHang(getHang());
		
		List<DonDTTPHS112.QuaTrinhLamViecPTTND> listQuaTrinhLamViec = donDTTPHS112.getQuaTrinhLamViecPTTND();
		
		try {
			for(int i=0; i < getRowIndex().length; i++) {
				DonDTTPHS112.QuaTrinhLamViecPTTND qtlv = new DonDTTPHS112.QuaTrinhLamViecPTTND();
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
		
		String noiDungXML = MauDonFactory.convertObjectToXml(donDTTPHS112);
			
		if(noiDungXML != null) {
			noiDungXML = XmlUtils.makeNoiDungXmlStandard(noiDungXML);
		}
		
		return noiDungXML;
	}
	
	private static Log _log = LogFactoryUtil.getLog(DTTPHS112.class);
}
