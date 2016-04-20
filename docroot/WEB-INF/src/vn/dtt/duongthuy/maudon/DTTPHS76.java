
package vn.dtt.duongthuy.maudon;

import java.io.IOException;
import java.util.List;

import javax.portlet.PortletRequest;
import javax.servlet.http.HttpServletRequest;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.duongbo.maudon.xml.MauDonFactory;
import vn.dtt.duongbo.maudon.xml.XmlUtils;
import vn.dtt.duongthuy.maudon.model.DonDTTPHS76;


public class DTTPHS76 extends DonOnline {
	
	public DTTPHS76(PortletRequest request) {
		super(request);
	}
	
	public DTTPHS76(HttpServletRequest request) {
		super(request);
	}
	
	public String getNoiDungXML() throws IOException {
		
		DonDTTPHS76 donDTTPHS76 = new DonDTTPHS76();
		
		donDTTPHS76.setKinhGui(getKinhGui());
		donDTTPHS76.setTenToiLa(getTenToiLa());
		donDTTPHS76.setQuocTich(getQuocTich());
		donDTTPHS76.setGioiTinh(getGioiTinh());
		donDTTPHS76.setNgaySinh(getNgaySinh());
		donDTTPHS76.setNoiCuTru(getNoiCuTru());
		donDTTPHS76.setSoDienThoai(getSoDienThoai());
		donDTTPHS76.setEmail(getEmail());
		donDTTPHS76.setSoCmnd(getSoCMND());
		donDTTPHS76.setNoiCapCmnd(getNoiCapCMND());
		donDTTPHS76.setNgayCapCmnd(getNgayCapCMND());
		donDTTPHS76.setDaTotNghiepNganhHoc(getNganhHoc());
		donDTTPHS76.setKhoa(getKhoaHoc());
		donDTTPHS76.setTruong(getTruongHoc());
		donDTTPHS76.setSoGCNKMCNCCCMDuocCapBang(getSoGCN());
		donDTTPHS76.setNgayCapGCNKMCNCCCM(getNgayCapCMND());
		donDTTPHS76.setQuyetDinhSo(getQuyetDinhSo());
		donDTTPHS76.setNgayQuyetDinh(getNgayQuyetDinh());
		donDTTPHS76.setCua(getCua());
		donDTTPHS76.setDoiChieu(getDoiChieu());
		donDTTPHS76.setDeNghi(getKinhGui());
		donDTTPHS76.setTinhThanhPho(getTinhThanhPho());
		donDTTPHS76.setNgayTao(getNgayTao());
		
		List<DonDTTPHS76.QuaTrinhLamViecPTTND> listQuaTrinhLamViec = donDTTPHS76.getQuaTrinhLamViecPTTND();
		
		try {
			for(int i=0; i < getRowIndex().length; i++) {
				DonDTTPHS76.QuaTrinhLamViecPTTND qtlv = new DonDTTPHS76.QuaTrinhLamViecPTTND();
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
		
		String noiDungXML = MauDonFactory.convertObjectToXml(donDTTPHS76);
			
		if(noiDungXML != null) {
			noiDungXML = XmlUtils.makeNoiDungXmlStandard(noiDungXML);
		}
		
		return noiDungXML;
	}
	
	private static Log _log = LogFactoryUtil.getLog(DTTPHS76.class);
}
