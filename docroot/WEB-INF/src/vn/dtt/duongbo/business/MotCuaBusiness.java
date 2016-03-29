package vn.dtt.duongbo.business;

import java.util.Date;
import java.util.List;

import vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo;
import vn.dtt.duongbo.dao.common.model.TthcTrangThaiHoSo;
import vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcPhanNhomHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcTrangThaiHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai;
import vn.dtt.duongbo.dao.motcua.model.MotCuaChuyenDichTrangThai;
import vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo;
import vn.dtt.duongbo.dao.motcua.model.MotCuaPhanCongXuLy;
import vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy;
import vn.dtt.duongbo.dao.motcua.model.MotCuaTrangThaiHoSo;
import vn.dtt.duongbo.dao.motcua.model.impl.MotCuaDienBienHoSoImpl;
import vn.dtt.duongbo.dao.motcua.model.impl.MotCuaPhanCongXuLyImpl;
import vn.dtt.duongbo.dao.motcua.model.impl.MotCuaPhieuXuLyImpl;
import vn.dtt.duongbo.dao.motcua.service.MotCuaAnhXaTrangThaiLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaChuyenDichTrangThaiLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaDienBienHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaPhanCongXuLyLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaPhieuXuLyLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaTrangThaiHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinXuLyLocalServiceUtil;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;

public class MotCuaBusiness {

	private static Log log = LogFactoryUtil.getLog(MotCuaBusiness.class);

	public long dichChuyenTrangThaiPhieuXuLy(MotCuaPhieuXuLy phieuXuLy, String dieuKienChuyenDich, Long userId, long quyTrinhThuTucId, String ghiChu) {
		long result = 0;
		try {
			log.info("===phieuXuLy===" + phieuXuLy);
			log.info("===quyTrinhThuTucId===" + quyTrinhThuTucId);
			log.info("===dieuKienChuyenDich===" + dieuKienChuyenDich);

			if (phieuXuLy.getTrangThaiHienTaiId() != phieuXuLy.getTrangThaiKetThuc()) {

				List<MotCuaChuyenDichTrangThai> chuyenDichTrangThais = MotCuaChuyenDichTrangThaiLocalServiceUtil.findByDieuKienChuyenDichAndTrangThaiNguonIdAndQuyTrinhThuTucId(
						dieuKienChuyenDich.trim(), phieuXuLy.getTrangThaiHienTaiId(), phieuXuLy.getQuyTrinhThuTucId());
				
				log.info("===TrangThaiHienTai===" + phieuXuLy.getTrangThaiHienTaiId());
				log.info("===chuyenDichTrangThais===" + chuyenDichTrangThais);

				if (chuyenDichTrangThais != null && chuyenDichTrangThais.size() > 0) {

					MotCuaChuyenDichTrangThai chuyenDichTrangThai = chuyenDichTrangThais.get(0);

					MotCuaDienBienHoSo motCuaDienBienHoSo = new MotCuaDienBienHoSoImpl();
					motCuaDienBienHoSo.setId(CounterLocalServiceUtil.increment(MotCuaDienBienHoSo.class.getName()));
					motCuaDienBienHoSo.setNgayXuLy(new Date());
					motCuaDienBienHoSo.setNguoiXuLy(userId);
					motCuaDienBienHoSo.setHoSoThuTucId(phieuXuLy.getHoSoThuTucId());
					motCuaDienBienHoSo.setPhieuXuLyId(phieuXuLy.getId());
					motCuaDienBienHoSo.setTrangThaiSauId(chuyenDichTrangThai.getTrangThaiDichId());
					if (ghiChu != null) {
						motCuaDienBienHoSo.setGhiChu(ghiChu);
					}
					motCuaDienBienHoSo.setTrangThaiTruocId(chuyenDichTrangThai.getTrangThaiNguonId());
					motCuaDienBienHoSo.setHanhDongXuLy(chuyenDichTrangThai.getHanhDongXuLy());
					motCuaDienBienHoSo.setSoNgayQuaHan(chuyenDichTrangThai.getSoNgayXuLy());
					MotCuaDienBienHoSoLocalServiceUtil.addMotCuaDienBienHoSo(motCuaDienBienHoSo);

					phieuXuLy.setTrangThaiHienTaiId(chuyenDichTrangThai.getTrangThaiDichId());
					phieuXuLy.setPhanNhomHoSoId(chuyenDichTrangThai.getPhanNhomHoSoId());
					phieuXuLy.setTrichYeuNoiDung(chuyenDichTrangThai.getHanhDongXuLy());
					MotCuaPhieuXuLyLocalServiceUtil.updateMotCuaPhieuXuLy(phieuXuLy);
					result = chuyenDichTrangThai.getTrangThaiDichId();

					updateTrangThaiHoSo(phieuXuLy);
					log.info("===xong updateTrangThaiHoSo===");
				}
			}
		} catch (Exception e) {
			log.error(e);
			result = 0;
		}finally{
			if(result>0){
				try {
					TthcHoSoThuTuc tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(phieuXuLy.getHoSoThuTucId());
					TthcTrangThaiHoSo tthcTrangThaiHoSo = TthcTrangThaiHoSoLocalServiceUtil.fetchTthcTrangThaiHoSo(result);
					MotCuaAnhXaTrangThai anhXaTrangThai = MotCuaAnhXaTrangThaiLocalServiceUtil.fetchByMaTTCanBo(tthcTrangThaiHoSo.getMaTrangThai());
					if(Validator.isNotNull(anhXaTrangThai)){
						tthcHoSoThuTuc.setTrangThaiHoSo(anhXaTrangThai.getMaTTDoanhNghiep());
					}
					TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(tthcHoSoThuTuc);
				} catch (SystemException e) {
					log.error(e);
				}
			}
		}

		return result;
	}
	
	
	public long dichChuyenTrangThaiPhieuXuLy2(MotCuaPhieuXuLy phieuXuLyChinh, String dieuKienChuyenDich, Long userId,
			long quyTrinhThuTucId, String ghiChu, long taiLieuDinhKem) {
		long result = 0;
		try {
			log.info("dichChuyenTrangThaiPhieuSuLyChinh ==phieuXuLyChinh==" + phieuXuLyChinh);
			log.info("dichChuyenTrangThaiPhieuSuLyChinh ===quyTrinhThuTucId=" + quyTrinhThuTucId);
			log.info("dichChuyenTrangThaiPhieuSuLyChinh ===dieuKienChuyenDich=" + dieuKienChuyenDich + "==");

			if (phieuXuLyChinh.getTrangThaiHienTaiId() != phieuXuLyChinh.getTrangThaiKetThuc()) {

				List<MotCuaChuyenDichTrangThai> chuyenDichTrangThais = MotCuaChuyenDichTrangThaiLocalServiceUtil
						.findByDieuKienChuyenDichAndTrangThaiNguonIdAndQuyTrinhThuTucId(dieuKienChuyenDich.trim(),
								phieuXuLyChinh.getTrangThaiHienTaiId(), 1);
				log.info("=====phieuXuLyChinh.getTrangThaiHienTaiId()= " + phieuXuLyChinh.getTrangThaiHienTaiId());
				log.info("dichChuyenTrangThaiPhieuSuLyChinh ===chuyenDichTrangThais= " + chuyenDichTrangThais);

				if (chuyenDichTrangThais != null && chuyenDichTrangThais.size() > 0) {

					MotCuaChuyenDichTrangThai chuyenDichTrangThai = chuyenDichTrangThais.get(0);

					MotCuaDienBienHoSo motCuaDienBienHoSo = new MotCuaDienBienHoSoImpl();
					motCuaDienBienHoSo.setId(CounterLocalServiceUtil.increment(MotCuaDienBienHoSo.class.getName()));
					motCuaDienBienHoSo.setNgayXuLy(new Date());
					motCuaDienBienHoSo.setNguoiXuLy(userId);
					motCuaDienBienHoSo.setHoSoThuTucId(phieuXuLyChinh.getHoSoThuTucId());
					motCuaDienBienHoSo.setPhieuXuLyId(phieuXuLyChinh.getId());
					motCuaDienBienHoSo.setTrangThaiSauId(chuyenDichTrangThai.getTrangThaiDichId());
					if (ghiChu != null) {
						motCuaDienBienHoSo.setGhiChu(ghiChu);
					}
					if(taiLieuDinhKem!=0){
						motCuaDienBienHoSo.setTaiLieuDinhKem(taiLieuDinhKem);
					}
					motCuaDienBienHoSo.setTrangThaiTruocId(chuyenDichTrangThai.getTrangThaiNguonId());
					motCuaDienBienHoSo.setHanhDongXuLy(chuyenDichTrangThai.getHanhDongXuLy());
					motCuaDienBienHoSo.setSoNgayQuaHan(chuyenDichTrangThai.getSoNgayXuLy());
					MotCuaDienBienHoSoLocalServiceUtil.addMotCuaDienBienHoSo(motCuaDienBienHoSo);

					phieuXuLyChinh.setTrangThaiHienTaiId(chuyenDichTrangThai.getTrangThaiDichId());
					phieuXuLyChinh.setPhanNhomHoSoId(chuyenDichTrangThai.getPhanNhomHoSoId());
					phieuXuLyChinh.setTrichYeuNoiDung(chuyenDichTrangThai.getHanhDongXuLy());
					MotCuaPhieuXuLyLocalServiceUtil.updateMotCuaPhieuXuLy(phieuXuLyChinh);
					result = chuyenDichTrangThai.getTrangThaiDichId();

					updateTrangThaiHoSo(phieuXuLyChinh);
					log.info("==========dichChuyenTrangThaiPhieuXuLy========xong updateTrangThaiHoSo=======");
				}
			}
		} catch (Exception e) {
			log.error(e);
			result = 0;
		}

		return result;
	}
	
	

	

	public long dichChuyenTrangThaiPhieuSuLy(Long hoSoThuTucId, String dieuKienChuyenDich, Long userId,
			long quyTrinhThuTucId) {
		long result = 2;
		try {
			log.debug("dichChuyenTrangThaiPhieuSuLyChinh  " + hoSoThuTucId);
			MotCuaPhieuXuLy phieuXuLyChinh = MotCuaPhieuXuLyLocalServiceUtil.findByHoSoThuTucIdAndQuyTrinhThuTucId(
					hoSoThuTucId, quyTrinhThuTucId);
			if (phieuXuLyChinh.getTrangThaiHienTaiId() != phieuXuLyChinh.getTrangThaiKetThuc()) {

				List<MotCuaChuyenDichTrangThai> chuyenDichTrangThais = MotCuaChuyenDichTrangThaiLocalServiceUtil
						.findByDieuKienChuyenDichAndTrangThaiNguonIdAndQuyTrinhThuTucId(dieuKienChuyenDich,
								phieuXuLyChinh.getTrangThaiHienTaiId(), quyTrinhThuTucId);
				log.debug("dichChuyenTrangThaiPhieuSuLyChinh truoc ");
				if (chuyenDichTrangThais != null && chuyenDichTrangThais.size() > 0) {
					log.debug("dichChuyenTrangThaiPhieuSuLyChinh " + chuyenDichTrangThais.size());

					MotCuaChuyenDichTrangThai chuyenDichTrangThai = chuyenDichTrangThais.get(0);

					if (chuyenDichTrangThai.getTaoPhieuMoi() == 0) {
						MotCuaDienBienHoSo motCuaDienBienHoSo = new MotCuaDienBienHoSoImpl();
						long id = CounterLocalServiceUtil.increment(MotCuaDienBienHoSo.class.getName());
						motCuaDienBienHoSo.setId(id);
						motCuaDienBienHoSo.setNgayXuLy(new Date());
						motCuaDienBienHoSo.setNguoiXuLy(userId);
						motCuaDienBienHoSo.setPhieuXuLyId(phieuXuLyChinh.getId());
						motCuaDienBienHoSo.setTrangThaiSauId(chuyenDichTrangThai.getTrangThaiDichId());
						motCuaDienBienHoSo.setTrangThaiTruocId(chuyenDichTrangThai.getTrangThaiNguonId());
						motCuaDienBienHoSo.setHanhDongXuLy(chuyenDichTrangThai.getHanhDongXuLy());
						motCuaDienBienHoSo.setSoNgayQuaHan(chuyenDichTrangThai.getSoNgayXuLy());
						MotCuaDienBienHoSoLocalServiceUtil.addMotCuaDienBienHoSo(motCuaDienBienHoSo);

						log.debug("chuyenDichTrangThai.getTrangThaiNguonId()  "
								+ chuyenDichTrangThai.getTrangThaiNguonId()
								+ " chuyenDichTrangThai.getTrangThaiDichId() "
								+ chuyenDichTrangThai.getTrangThaiDichId());
						phieuXuLyChinh.setTrangThaiHienTaiId(chuyenDichTrangThai.getTrangThaiDichId());
						phieuXuLyChinh.setChiemQuyenXuLy(0);
						phieuXuLyChinh.setPhanNhomHoSoId(chuyenDichTrangThai.getPhanNhomHoSoId());
						phieuXuLyChinh.setTrichYeuNoiDung(chuyenDichTrangThai.getHanhDongXuLy());
						MotCuaPhieuXuLyLocalServiceUtil.updateMotCuaPhieuXuLy(phieuXuLyChinh);
						result = chuyenDichTrangThai.getTrangThaiDichId();
					} else {
						MotCuaPhieuXuLy motCuaPhieuXuLy = new MotCuaPhieuXuLyImpl();
						long idMotCuaPhieuXuLy = CounterLocalServiceUtil.increment(MotCuaPhieuXuLy.class.getName());
						motCuaPhieuXuLy.setId(idMotCuaPhieuXuLy);
						motCuaPhieuXuLy.setTrangThaiHienTaiId(chuyenDichTrangThai.getTrangThaiDichId());
						motCuaPhieuXuLy.setChiemQuyenXuLy(0);
						motCuaPhieuXuLy.setPhanNhomHoSoId(chuyenDichTrangThai.getPhanNhomHoSoId());
						motCuaPhieuXuLy.setGhiChu(chuyenDichTrangThai.getHanhDongXuLy());
						motCuaPhieuXuLy.setPhieuXuLyCha(phieuXuLyChinh.getId());
						motCuaPhieuXuLy.setTrichYeuNoiDung(chuyenDichTrangThai.getHanhDongXuLy());
						MotCuaPhieuXuLyLocalServiceUtil.addMotCuaPhieuXuLy(motCuaPhieuXuLy);
								
						MotCuaDienBienHoSo motCuaDienBienHoSo = new MotCuaDienBienHoSoImpl();
						long id = CounterLocalServiceUtil.increment(MotCuaDienBienHoSo.class.getName());
						motCuaDienBienHoSo.setId(id);
						motCuaDienBienHoSo.setNgayXuLy(new Date());
						motCuaDienBienHoSo.setNguoiXuLy(userId);
						motCuaDienBienHoSo.setPhieuXuLyId(idMotCuaPhieuXuLy);
						motCuaDienBienHoSo.setTrangThaiSauId(chuyenDichTrangThai.getTrangThaiDichId());
						motCuaDienBienHoSo.setTrangThaiTruocId(chuyenDichTrangThai.getTrangThaiNguonId());
						motCuaDienBienHoSo.setHanhDongXuLy(chuyenDichTrangThai.getHanhDongXuLy());
						motCuaDienBienHoSo.setSoNgayQuaHan(chuyenDichTrangThai.getSoNgayXuLy());
						MotCuaDienBienHoSoLocalServiceUtil.addMotCuaDienBienHoSo(motCuaDienBienHoSo);

						log.debug("chuyenDichTrangThai.getTrangThaiNguonId()  "
								+ chuyenDichTrangThai.getTrangThaiNguonId()
								+ " chuyenDichTrangThai.getTrangThaiDichId() "
								+ chuyenDichTrangThai.getTrangThaiDichId());
						phieuXuLyChinh.setTrangThaiHienTaiId(chuyenDichTrangThai.getTrangThaiDichId());
						phieuXuLyChinh.setChiemQuyenXuLy(0);
						phieuXuLyChinh.setPhanNhomHoSoId(chuyenDichTrangThai.getPhanNhomHoSoId());
						phieuXuLyChinh.setTrichYeuNoiDung(chuyenDichTrangThai.getHanhDongXuLy());
						MotCuaPhieuXuLyLocalServiceUtil.updateMotCuaPhieuXuLy(phieuXuLyChinh);
						result = chuyenDichTrangThai.getTrangThaiDichId();
					}
					TthcHoSoThuTuc tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);

					if (chuyenDichTrangThai.getPhanNhomHoSoId() > 0) {
						tthcHoSoThuTuc.setPhanNhomHoSoId(chuyenDichTrangThai.getPhanNhomHoSoId());
						TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(tthcHoSoThuTuc);
					}
				}
			}
		} catch (Exception e) {
			log.error(e);
			result = 0;
		}
		log.debug("dichChuyenTrangThaiPhieuSuLyChinh  out");
		return result;
	}

	public long phanCongXuLy(Long phieuXuLyId, long trangThaiHoSoId, long userIdXuLy, long userIdPhanCong, long nhomId) {
		try {
			log.info("=====VAo phanCongXuLy============");
			MotCuaPhanCongXuLy motCuaPhanCongXuLy = MotCuaPhanCongXuLyLocalServiceUtil.findMotCuaPhanCongXuLyByPhieuXuLyId(phieuXuLyId);
			if (motCuaPhanCongXuLy != null) {
				
				log.info("1=====phanCongXuLy=============update");
				motCuaPhanCongXuLy.setNgayPhanCong(new Date());
				motCuaPhanCongXuLy.setNguoiPhanCong(userIdPhanCong);
				motCuaPhanCongXuLy.setNguoiXuLy(userIdXuLy);
				motCuaPhanCongXuLy.setPhieuXuLyId(phieuXuLyId);
				motCuaPhanCongXuLy.setTrangThaiHoSoId(trangThaiHoSoId);
				motCuaPhanCongXuLy.setNhomXuLy(nhomId);
				MotCuaPhanCongXuLyLocalServiceUtil.updateMotCuaPhanCongXuLy(motCuaPhanCongXuLy);
				return motCuaPhanCongXuLy.getId();
			} else {
				log.info("2=====phanCongXuLy=============add");
				motCuaPhanCongXuLy = new MotCuaPhanCongXuLyImpl();
				motCuaPhanCongXuLy.setId(CounterLocalServiceUtil.increment(MotCuaPhanCongXuLy.class.getName()));
				motCuaPhanCongXuLy.setNgayPhanCong(new Date());
				motCuaPhanCongXuLy.setNguoiPhanCong(userIdPhanCong);
				motCuaPhanCongXuLy.setNguoiXuLy(userIdXuLy);
				motCuaPhanCongXuLy.setPhieuXuLyId(phieuXuLyId);
				motCuaPhanCongXuLy.setTrangThaiHoSoId(trangThaiHoSoId);
				motCuaPhanCongXuLy.setNhomXuLy(nhomId);
				MotCuaPhanCongXuLyLocalServiceUtil.addMotCuaPhanCongXuLy(motCuaPhanCongXuLy);
				return motCuaPhanCongXuLy.getId();
			}
		} catch (Exception e) {
			log.error(e);
			log.error(e);
		}
		return 0;
	}

	public static String getTrangThaiByPhieuXuLy(long phieuXuLy) {
		try {
			MotCuaPhieuXuLy motCuaPhieuXuLy = MotCuaPhieuXuLyLocalServiceUtil.fetchMotCuaPhieuXuLy(phieuXuLy);
			MotCuaTrangThaiHoSo motCuaTrangThaiHoSo = MotCuaTrangThaiHoSoLocalServiceUtil.fetchMotCuaTrangThaiHoSo(motCuaPhieuXuLy.getTrangThaiHienTaiId());
			return motCuaTrangThaiHoSo.getTenTrangThai();
		} catch (Exception e) {
			log.error(e);
		}
		
		return "";
	}
	
	public static String getPhanNhomByIdPhanNhom(long idPhanNhomHoSo) {
		try {
			TthcPhanNhomHoSo thPhanNhomHoSo = TthcPhanNhomHoSoLocalServiceUtil.fetchTthcPhanNhomHoSo(idPhanNhomHoSo);
			return thPhanNhomHoSo.getTenPhanNhom();
		} catch (Exception e) {
			log.error(e);
		}
		
		return "";
	}
	
	
	public static String getNameByIdNguoiThamTra(long idNguoiThamTra) {
		try {
			User user2= null;
			user2 = UserLocalServiceUtil.getUser(idNguoiThamTra);
				if(user2!=null){
					return  user2.getFullName();
				}
		} catch (Exception e) {
		}
		return "";
	}
	
	public void updateTrangThaiHoSo(MotCuaPhieuXuLy phieuXuLy) {
		
	}
}
