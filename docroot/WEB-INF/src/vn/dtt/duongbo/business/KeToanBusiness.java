package vn.dtt.duongbo.business;

import java.util.Date;
import java.util.List;

import vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan;
import vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo;
import vn.dtt.duongbo.dao.thanhtoan.service.TthcXacNhanThanhToanHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.thanhtoan.service.TthcXacNhanThanhToanLocalServiceUtil;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

public class KeToanBusiness {
	
	/**
	 * Them moi xac nhan thanh toan, su dung ma so ho so lam ma tu sinh
	 * <p><b> TRUONG HOP QUAN HE XAC NHAN THANH TOAN VOI HO SO LA 1-1
	 * 
	 * @param hoSoThuTuc
	 * @param amount
	 * @param thongTinXacNhan
	 * @param phieuXuLyId
	 * @throws PortalException
	 * @throws SystemException
	 */
	public static void addXacNhanThanhToan(TthcHoSoThuTuc hoSoThuTuc, long amount, String loaiPhi, String thongTinXacNhan, long phieuXuLyId) 
			throws PortalException, SystemException {
			
		TthcXacNhanThanhToan xacNhanThanhToan = TthcXacNhanThanhToanLocalServiceUtil.findByMaTuSinh(hoSoThuTuc.getMaSoHoSo());
		
		long xacNhanThanhToanId = 0;
		TthcXacNhanThanhToanHoSo xacNhanThanhToanHoSo = null;
		
		if(xacNhanThanhToan == null){
			xacNhanThanhToanId = CounterLocalServiceUtil.increment(TthcXacNhanThanhToan.class.getName());
			
			xacNhanThanhToan = TthcXacNhanThanhToanLocalServiceUtil.createTthcXacNhanThanhToan(xacNhanThanhToanId);
			xacNhanThanhToan.setMaTuSinh(hoSoThuTuc.getMaSoHoSo());
			xacNhanThanhToan.setNgayTao(new Date());
			
			long xacNhanThanhToanHoSoId = CounterLocalServiceUtil.increment(TthcXacNhanThanhToanHoSo.class.getName());
			xacNhanThanhToanHoSo = TthcXacNhanThanhToanHoSoLocalServiceUtil.createTthcXacNhanThanhToanHoSo(xacNhanThanhToanHoSoId);
		} else {
			xacNhanThanhToanId = xacNhanThanhToan.getId();
			
			List<TthcXacNhanThanhToanHoSo> listXacNhanThanhToanHoSo = TthcXacNhanThanhToanHoSoLocalServiceUtil.findByXacNhanThanhToanId(xacNhanThanhToanId);
			
			if(listXacNhanThanhToanHoSo != null && listXacNhanThanhToanHoSo.size() > 0) {
				xacNhanThanhToanHoSo = listXacNhanThanhToanHoSo.get(0);
			} else {
				long xacNhanThanhToanHoSoId = CounterLocalServiceUtil.increment(TthcXacNhanThanhToanHoSo.class.getName());
				xacNhanThanhToanHoSo = TthcXacNhanThanhToanHoSoLocalServiceUtil.createTthcXacNhanThanhToanHoSo(xacNhanThanhToanHoSoId); 
			}
		}
		
		xacNhanThanhToan.setHinhThucThanhToan(Constants.THANH_TOAN_TRUC_TIEP);
		xacNhanThanhToan.setSoTien(amount);
		xacNhanThanhToan.setThongTinXacNhan(thongTinXacNhan);
		xacNhanThanhToan.setToChucQuanLy(hoSoThuTuc.getToChucQuanLy());
		xacNhanThanhToan.setTenDoanhNghiep(hoSoThuTuc.getTenChuHoSo());
		xacNhanThanhToan.setTrangThaiXacNhan(Constants.MTYT_CHUA_XAC_NHAN_THANH_TOAN);
		xacNhanThanhToan.setNguoiTao(hoSoThuTuc.getNguoiTao());
		xacNhanThanhToan.setLoaiPhi(loaiPhi);
		
		TthcXacNhanThanhToanLocalServiceUtil.updateTthcXacNhanThanhToan(xacNhanThanhToan);
		
		xacNhanThanhToanHoSo.setHoSoThuTucId(hoSoThuTuc.getId());
		xacNhanThanhToanHoSo.setSoTien(amount);
		xacNhanThanhToanHoSo.setPhieuXuLyId(phieuXuLyId);
		xacNhanThanhToanHoSo.setXacNhanThanhToanId(xacNhanThanhToanId);
		
		TthcXacNhanThanhToanHoSoLocalServiceUtil.updateTthcXacNhanThanhToanHoSo(xacNhanThanhToanHoSo);
	}
	
	public static TthcXacNhanThanhToan updateXacNhanThanhToan(long userId, long xacNhanThanhToanId, 
			String ngayXacNhan, String thongTinXacNhan, int trangThaiXacNhan, String yKien) 
			throws SystemException, PortalException {
		
		TthcXacNhanThanhToan tthcXacNhanThanhToan = TthcXacNhanThanhToanLocalServiceUtil.getTthcXacNhanThanhToan(xacNhanThanhToanId);
		
		tthcXacNhanThanhToan.setNguoiXacNhan(userId);
		tthcXacNhanThanhToan.setNgayXacNhan(new Date());
		tthcXacNhanThanhToan.setThongTinXacNhan(thongTinXacNhan);
		tthcXacNhanThanhToan.setTrangThaiXacNhan(trangThaiXacNhan);
		tthcXacNhanThanhToan.setYKienXuLy(yKien);

		tthcXacNhanThanhToan = TthcXacNhanThanhToanLocalServiceUtil.updateTthcXacNhanThanhToan(tthcXacNhanThanhToan);
		
		return tthcXacNhanThanhToan;
	}
}
