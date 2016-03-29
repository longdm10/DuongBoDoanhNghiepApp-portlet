
package vn.dtt.duongthuy.maudon;

import java.io.IOException;
import java.util.List;

import javax.portlet.PortletRequest;
import javax.servlet.http.HttpServletRequest;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.duongbo.maudon.xml.MauDonFactory;
import vn.dtt.duongbo.maudon.xml.XmlUtils;
import vn.dtt.duongthuy.maudon.model.DonDTTPHS83;

public class DTTPHS83 extends DonOnline {
	
	public DTTPHS83(PortletRequest request) {
		super(request);
	}
	
	public DTTPHS83(HttpServletRequest request) {
		super(request);
	}
	
	public String getNoiDungXML() throws IOException {
		
		DonDTTPHS83 donDTTPHS83 = new DonDTTPHS83();
		
		donDTTPHS83.setKinhGui(getKinhGui());
		donDTTPHS83.setTenToiLa(getTenToiLa());
		donDTTPHS83.setQuocTich(getQuocTich());
		donDTTPHS83.setGioiTinh(getGioiTinh());
		donDTTPHS83.setNgaySinh(getNgaySinh());
		donDTTPHS83.setNoiCuTru(getNoiCuTru());
		donDTTPHS83.setSoDienThoai(getSoDienThoai());
		donDTTPHS83.setEmail(getEmail());
		donDTTPHS83.setSoCmnd(getSoCMND());
		donDTTPHS83.setNoiCapCmnd(getNoiCapCMND());
		donDTTPHS83.setNgayCapCmnd(getNgayCapCMND());
		donDTTPHS83.setDaTotNghiepNganhHoc(getNganhHoc());
		donDTTPHS83.setKhoa(getKhoaHoc());
		donDTTPHS83.setTruong(getTruongHoc());
		donDTTPHS83.setSoGCNKMCNCCCMDuocCapBang(getSoGCN());
		donDTTPHS83.setNgayCapGCNKMCNCCCM(getNgayCapCMND());
		donDTTPHS83.setQuyetDinhSo(getQuyetDinhSo());
		donDTTPHS83.setNgayQuyetDinh(getNgayQuyetDinh());
		donDTTPHS83.setCua(getCua());
		donDTTPHS83.setDoiChieu(getDoiChieu());
		donDTTPHS83.setDeNghi(getKinhGui());
		donDTTPHS83.setTinhThanhPho(getTinhThanhPho());
		donDTTPHS83.setNgayTao(getNgayTao());
		
		List<DonDTTPHS83.QuaTrinhLamViecPTTND> listQuaTrinhLamViec = donDTTPHS83.getQuaTrinhLamViecPTTND();
		
		try {
			for(int i=0; i < getRowIndex().length; i++) {
				DonDTTPHS83.QuaTrinhLamViecPTTND qtlv = new DonDTTPHS83.QuaTrinhLamViecPTTND();
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
		
		String noiDungXML = MauDonFactory.convertObjectToXml(donDTTPHS83);
			
		if(noiDungXML != null) {
			noiDungXML = XmlUtils.makeNoiDungXmlStandard(noiDungXML);
		}
		
		return noiDungXML;
	}
	
	private static Log _log = LogFactoryUtil.getLog(DTTPHS83.class);
}
