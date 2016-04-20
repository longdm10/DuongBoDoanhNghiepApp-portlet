/**
 * 
 */
package vn.dtt.duongbo.ipay;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import vn.dtt.duongbo.business.KeToanBusiness;
import vn.dtt.duongbo.business.MotCuaBusiness;
import vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo;
import vn.dtt.duongbo.dao.common.model.TthcThuTucHanhChinh;
import vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcPhanNhomHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil;
import vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep;
import vn.dtt.duongbo.dao.doanhnghiep.service.DnDoanhNghiepLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy;
import vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC;
import vn.dtt.duongbo.dao.motcua.model.MotCuaTrangThaiHoSo;
import vn.dtt.duongbo.dao.motcua.model.impl.MotCuaPhieuXuLyImpl;
import vn.dtt.duongbo.dao.motcua.service.MotCuaPhieuXuLyLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaQuyTrinhThuTucTTHCLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaTrangThaiHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.thanhtoan.model.ThanhToanKeyPay;
import vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi;
import vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan;
import vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo;
import vn.dtt.duongbo.dao.thanhtoan.model.impl.ThanhToanKeyPayImpl;
import vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcXacNhanThanhToanHoSoImpl;
import vn.dtt.duongbo.dao.thanhtoan.service.ThanhToanKeyPayLocalServiceUtil;
import vn.dtt.duongbo.dao.thanhtoan.service.TthcHinhThucNopPhiLocalServiceUtil;
import vn.dtt.duongbo.dao.thanhtoan.service.TthcXacNhanThanhToanHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.thanhtoan.service.TthcXacNhanThanhToanLocalServiceUtil;
import vn.dtt.duongbo.portlet.canbo.utils.CanBoDTBusinessUtils;
import vn.dtt.duongbo.utils.CommonUtils;
import vn.dtt.duongbo.utils.DoanhNghiepUtils;
import vn.dtt.duongbo.utils.config.DuongBoConfigurationManager;
import vn.dtt.duongbo.utils.format.ConvertUtil;
import vn.dtt.duongbo.business.Constants;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;

/**
 * @author win_64
 * 
 */
public class KeyPayUtils {

	private static Log log = LogFactoryUtil.getLog(KeyPayUtils.class);
	
	public static long getPayAmount(long hoSoThuTucId) {
		long payAmount = 0;
//		try {
//			TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
//			if(hoSoThuTuc != null){
//				TthcThuTucHanhChinh thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(hoSoThuTuc.getThuTucHanhChinhId());
//				if(thuTucHanhChinh != null){
//					TthcHinhThucNopPhi hinhThucNopPhi = TthcHinhThucNopPhiLocalServiceUtil.findByThuTucHanhChinhId(thuTucHanhChinh.getId());
//					if(hinhThucNopPhi != null){
//						payAmount = hinhThucNopPhi.getPhiNopBanDau();
//					}
//				}
//			}
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		return payAmount;
	}
	
	public static void addThanhToanKeyPay(long doanhNghiepId, String merchantTransId, long transidKeypay, String merchantCode, String bankCode, long shipFee, String currencyCode, String xmlDescription, long amount, String goodCode, String responseCode, String thongTinHoSo, int loaiMessage, int isIpn) {
		try {
			ThanhToanKeyPay thanhToanKeyPay = new ThanhToanKeyPayImpl();
			thanhToanKeyPay.setId(CounterLocalServiceUtil.increment(ThanhToanKeyPay.class.getName()));
			thanhToanKeyPay.setNetCost(amount);
			thanhToanKeyPay.setGoodCode(goodCode.trim());
			thanhToanKeyPay.setIdDoanhNghiep(doanhNghiepId);
			thanhToanKeyPay.setMerchantTransId(merchantTransId);
			thanhToanKeyPay.setTransidKeypay(transidKeypay);
			thanhToanKeyPay.setMerchantCode(merchantCode);
			thanhToanKeyPay.setBankCode(bankCode);
			thanhToanKeyPay.setShipFee(shipFee);
			thanhToanKeyPay.setCurrencyCode(currencyCode);
			thanhToanKeyPay.setResponseCode(responseCode);
			thanhToanKeyPay.setXmlDescription(xmlDescription);
			thanhToanKeyPay.setNgayXuLy(new Date());
			thanhToanKeyPay.setThongTinHoSo(thongTinHoSo);
			thanhToanKeyPay.setLoaiMessage(loaiMessage);
			thanhToanKeyPay.setIpn(isIpn);
			ThanhToanKeyPayLocalServiceUtil.addThanhToanKeyPay(thanhToanKeyPay);
			log.debug("==Them goodCode==" + goodCode + " === amount==" + amount + "==vao bang log_thanhtoankeypay.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void checkTrangThaiHoSo(String goodCode) {
		long id = ConvertUtil.convertToLong(goodCode);
		List<TthcHoSoThuTuc> liHoSoTTHCCongs = getHoSoTTHCCongByID(id);
/* chua lam		
		if (liHoSoTTHCCongs != null && liHoSoTTHCCongs.size() > 0) {
			if (liHoSoTTHCCongs.get(0).getTrangThaiHoSo() < 0) {
				int trangThaiHoSo = CheckBusinessUtils.checkTrangThaiHoSoChuaHoanThanhThanhToanOnline(id);
				HoSoTTHCCong hoSoTTHCCong = liHoSoTTHCCongs.get(0);
				int oldTrangThai = hoSoTTHCCong.getTrangThaiHoSo();
				hoSoTTHCCong.setTrangThaiHoSo(trangThaiHoSo);
				try {
					HoSoTTHCCongLocalServiceUtil.updateHoSoTTHCCong(hoSoTTHCCong);
					log.debug("==Cap nhat trang thai ho so HoSoTTHCCong goodCode==" + goodCode + " === co trang thai la cu la==" + oldTrangThai);
				} catch (SystemException e) {
					e.printStackTrace();
				}
			}
		} 
		*/
	}
/*
	public static ThanhToanKeyPay updateThanhToanKeyPay(String goodCode,
			String merchantTransId, String merchantCode, String responsecode,
			long transid_keypay, long net_cost, long ship_fee,
			String currency_code, String bank_code) {
		try {
			log.debug("==merchantTransId in updateThanhToanKeyPay==" + merchantTransId);
			if(merchantTransId.length() == 4){
				merchantTransId = "00" + merchantTransId;
			} else if(merchantTransId.length() == 5){
				merchantTransId = "0" + merchantTransId;
			}
			ThanhToanKeyPay thanhToanKeyPay = ThanhToanKeyPayLocalServiceUtil.findByGoodCodeAndMerchantCodeAndMerchantTransId(goodCode, merchantCode, merchantTransId);
			if (thanhToanKeyPay != null) {
				thanhToanKeyPay.setMerchantTransId(merchantTransId);
				thanhToanKeyPay.setMerchantCode(merchantCode);
				thanhToanKeyPay.setResponseCode(responsecode);
				thanhToanKeyPay.setTransidKeypay(transid_keypay);
				thanhToanKeyPay.setNetCost(net_cost);
				thanhToanKeyPay.setShipFee(ship_fee);
				thanhToanKeyPay.setCurrencyCode(currency_code);
				thanhToanKeyPay.setBankCode(bank_code);
				thanhToanKeyPay.setNgayXuLy(new Date());
				ThanhToanKeyPay thanhToanKeyPayUpdate = ThanhToanKeyPayLocalServiceUtil.updateThanhToanKeyPay(thanhToanKeyPay);
				log.debug("==update goodCode==" + goodCode + " === net_cost==" + net_cost + "===responsecode==" + responsecode + "==trong bang log_thanhtoankeypay.");
				if (thanhToanKeyPayUpdate != null && thanhToanKeyPayUpdate.getId() > 0) {
					return thanhToanKeyPayUpdate;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
*/	
	public static boolean addXacNhanThanhToan(long hoSoThuTucId, TthcXacNhanThanhToan xacNhanThanhToan) {
		try {
			xacNhanThanhToan.setId(CounterLocalServiceUtil.increment(TthcXacNhanThanhToan.class.getName()));
			xacNhanThanhToan = TthcXacNhanThanhToanLocalServiceUtil.addTthcXacNhanThanhToan(xacNhanThanhToan);
			if(xacNhanThanhToan != null){
				TthcXacNhanThanhToanHoSo xacNhanThanhToanHoSo = new TthcXacNhanThanhToanHoSoImpl();
				xacNhanThanhToanHoSo.setId(CounterLocalServiceUtil.increment(TthcXacNhanThanhToanHoSo.class.getName()));
				xacNhanThanhToanHoSo.setHoSoThuTucId(hoSoThuTucId);
				xacNhanThanhToanHoSo.setSoTien(xacNhanThanhToan.getSoTien());
				xacNhanThanhToanHoSo.setXacNhanThanhToanId(xacNhanThanhToan.getId());
				TthcXacNhanThanhToanHoSoLocalServiceUtil.addTthcXacNhanThanhToanHoSo(xacNhanThanhToanHoSo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}
	
	/**
	 * //TODO: LAM LAI
	 * @param xacNhanThanhToanId
	 * @param thongTinXacNhan
	 * @param taiLieuDinhKem
	 * @param hinhThucThanhToan
	 * @throws SystemException
	 * @throws PortalException
	 * @throws IOException
	 */
	public static void xacNhanThanhToanHoSo(long xacNhanThanhToanId, String thongTinXacNhan, long taiLieuDinhKem,
			Integer hinhThucThanhToan)
			throws SystemException, PortalException, IOException {
		log.info("-------------vao KeyPayUtil method: xacNhanThanhToanHoSo-----------");
		TthcXacNhanThanhToan xacNhanThanhToan = TthcXacNhanThanhToanLocalServiceUtil.fetchTthcXacNhanThanhToan(xacNhanThanhToanId);
		
		if(xacNhanThanhToan != null){
			if(Validator.isNotNull(hinhThucThanhToan)) {
				xacNhanThanhToan.setHinhThucThanhToan(hinhThucThanhToan);
			}
			
			if(Validator.isNotNull(thongTinXacNhan)) {
				xacNhanThanhToan.setThongTinXacNhan(thongTinXacNhan);
			}
			
			xacNhanThanhToan.setTaiLieuDinhKem(taiLieuDinhKem);
			
			xacNhanThanhToan.setNgayXacNhan(new Date());
			
			xacNhanThanhToan = TthcXacNhanThanhToanLocalServiceUtil.updateTthcXacNhanThanhToan(xacNhanThanhToan);
		}
	}
	
	private static List<TthcHoSoThuTuc> getHoSoTTHCCongByID(long hosotthccongid) {
		try {
			DynamicQuery query = DynamicQueryFactoryUtil.forClass(TthcHoSoThuTuc.class);
			// This is a test line for display all request if there's no search criteria
			Criterion criterionTrangThaiHoSo = RestrictionsFactoryUtil.eq("id", hosotthccongid);

			// Define search criteria
			query = query.add(criterionTrangThaiHoSo);

			return TthcHoSoThuTucLocalServiceUtil.dynamicQuery(query);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<TthcHoSoThuTuc>();
	}
	
	private static void taoPhieuXuLy(TthcHoSoThuTuc hoSoThuTuc) {
//		try {
//			MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC = MotCuaQuyTrinhThuTucTTHCLocalServiceUtil.fetchByThuTucHanhChinhIDAndToChucXuLy(hoSoThuTuc.getThuTucHanhChinhId(), hoSoThuTuc.getToChucQuanLy());
//
//			log.debug("=========xuLyHoSo====Binh them==motCuaQuyTrinhThuTucTTHC==  "+motCuaQuyTrinhThuTucTTHC );
//			log.debug("=========nopHoSo====Binh them==TthcHoSoThuTuc==  " + hoSoThuTuc.getId() );
//			log.debug("=========nopHoSo====Binh them==phanNhomHoSoId==  " + hoSoThuTuc.getPhanNhomHoSoId() );
//			
//			if (motCuaQuyTrinhThuTucTTHC != null) {
//				log.debug("---------hoSoThuTuc.getId(): " + hoSoThuTuc.getId());
//				log.debug("---------motCuaQuyTrinhThuTucTTHC.getQuyTrinhThuTucId(): " + motCuaQuyTrinhThuTucTTHC.getQuyTrinhThuTucId());
//
//				MotCuaPhieuXuLy motCuaPhieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.findByHoSoThuTucIdAndQuyTrinhThuTucId(hoSoThuTuc.getId(), motCuaQuyTrinhThuTucTTHC.getQuyTrinhThuTucId());
//				if (motCuaPhieuXuLy == null) {
//					log.debug("---------motCuaPhieuXuLy is null");
//					motCuaPhieuXuLy = new MotCuaPhieuXuLyImpl();
//					TthcPhanNhomHoSo tthcPhanNhomHoSo = TthcPhanNhomHoSoLocalServiceUtil.getByMaPhanNhom("02"); // Lay phan nhom ho so cho tiep nhan
//					
//					Long idMotCuaPhieuXuLy = CounterLocalServiceUtil.increment(MotCuaPhieuXuLy.class.getName());
//					motCuaPhieuXuLy.setId(idMotCuaPhieuXuLy);
//					motCuaPhieuXuLy.setHoSoThuTucId(hoSoThuTuc.getId());
//					motCuaPhieuXuLy.setSoThuTu(0);
//					long trangThaiBanDau = DuongBoConfigurationManager.getIntProp("trangthaibandau.can.bo.tiep.nhan", 1);
//					motCuaPhieuXuLy.setTrangThaiHienTaiId(trangThaiBanDau);
//					motCuaPhieuXuLy.setQuyTrinhThuTucId(motCuaQuyTrinhThuTucTTHC.getQuyTrinhThuTucId());
//					motCuaPhieuXuLy.setToChucQuanLy(hoSoThuTuc.getToChucQuanLy());
//					motCuaPhieuXuLy.setPhanNhomHoSoId(tthcPhanNhomHoSo.getId());
//					
//					MotCuaPhieuXuLyLocalServiceUtil.addMotCuaPhieuXuLy(motCuaPhieuXuLy);
//					
//					MotCuaBusiness motCuaBusiness = new MotCuaBusiness();
//					motCuaBusiness.updateTrangThaiHoSo(motCuaPhieuXuLy);
//				} else{
//					MotCuaTrangThaiHoSo trangThaiHoSo = MotCuaTrangThaiHoSoLocalServiceUtil.fetchMotCuaTrangThaiHoSo(Long.parseLong(hoSoThuTuc.getTrangThaiHoSo()));
//					MotCuaBusiness motCuaBusiness = new MotCuaBusiness();
//					String dieuKienChuyenDich = null;
//					int buocXuLy = 0;
//					if(trangThaiHoSo != null){
//						log.debug("---------trangThaiHoSo.getMaTrangThai(): " + trangThaiHoSo.getMaTrangThai());
//						if(trangThaiHoSo.getMaTrangThai().trim().equalsIgnoreCase(Constants.DOANH_NGHIEP_TRANG_THAI_CHO_KHAO_NGHIEM)){
//							dieuKienChuyenDich = DuongBoConfigurationManager.getStrProp("dieukiendichchuyen.doanh.nghiep.cap.nhat.ho.so.buoc.2", "Cap.nhat.ho.so.buoc.2");
//							buocXuLy = Constants.BUOC_XU_LY_B2;
//						}
//					}
//
//					log.debug("---------dieuKienChuyenDich: " + dieuKienChuyenDich);
//					long dichChuyenTrangThaiPhieuXuLy = motCuaBusiness.dichChuyenTrangThaiPhieuXuLy(motCuaPhieuXuLy, dieuKienChuyenDich, hoSoThuTuc.getNguoiTao(), motCuaPhieuXuLy.getQuyTrinhThuTucId(), null);
//					
//				}
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
	
}
