package vn.dtt.duongbo.business;

import java.util.Date;
import java.util.List;

import vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.duongbo.dao.common.service.TthcHoSoThuTucLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.model.MotCuaChuyenDichTrangThai;
import vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo;
import vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy;
import vn.dtt.duongbo.dao.motcua.model.MotCuaTrangThaiHoSo;
import vn.dtt.duongbo.dao.motcua.model.impl.MotCuaDienBienHoSoImpl;
import vn.dtt.duongbo.dao.motcua.service.MotCuaChuyenDichTrangThaiLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaDienBienHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaPhieuXuLyLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.MotCuaTrangThaiHoSoLocalServiceUtil;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class HoSoBusiness {
	
	private Log _log = LogFactoryUtil.getLog(HoSoBusiness.class);
	private long dichChuyenTrangThaiPhieuXuLy(MotCuaPhieuXuLy phieuXuLyChinh, String dieuKienChuyenDich, Long userId,
			long quyTrinhThuTucId, String ghiChu) {
		long result = 0;
		try {
			_log.info("dichChuyenTrangThaiPhieuSuLyChinh ==phieuXuLyChinh==" + phieuXuLyChinh);
			_log.info("dichChuyenTrangThaiPhieuSuLyChinh ===quyTrinhThuTucId=" + quyTrinhThuTucId);
			_log.info("dichChuyenTrangThaiPhieuSuLyChinh ===dieuKienChuyenDich=" + dieuKienChuyenDich + "==");

			if (phieuXuLyChinh.getTrangThaiHienTaiId() != phieuXuLyChinh.getTrangThaiKetThuc()) {

				List<MotCuaChuyenDichTrangThai> chuyenDichTrangThais = MotCuaChuyenDichTrangThaiLocalServiceUtil
						.findByDieuKienChuyenDichAndTrangThaiNguonIdAndQuyTrinhThuTucId(dieuKienChuyenDich.trim(),
								phieuXuLyChinh.getTrangThaiHienTaiId(), quyTrinhThuTucId);
				_log.info("=====phieuXuLyChinh.getTrangThaiHienTaiId()= " + phieuXuLyChinh.getTrangThaiHienTaiId());
				_log.info("dichChuyenTrangThaiPhieuSuLyChinh ===chuyenDichTrangThais= " + chuyenDichTrangThais);

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
					_log.info("==========dichChuyenTrangThaiPhieuXuLy========xong updateTrangThaiHoSo=======");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = 0;
		}

		return result;
	}
	private void updateTrangThaiHoSo(MotCuaPhieuXuLy phieuXuLyChinh) {
		try {
			TthcHoSoThuTuc tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(phieuXuLyChinh.getHoSoThuTucId());
			MotCuaTrangThaiHoSo motCuaTrangThaiHoSo = MotCuaTrangThaiHoSoLocalServiceUtil.findMotCuaTrangThaiHoSoById(phieuXuLyChinh.getTrangThaiHienTaiId());
			_log.debug("==========updateTrangThaiHoSo========xong motCuaTrangThaiHoSo=======" + motCuaTrangThaiHoSo);
			if (motCuaTrangThaiHoSo != null) {
//				List<MotCuaAnhXaTrangThai> liCuaAnhXaTrangThais = MotCuaAnhXaTrangThaiLocalServiceUtil.findByMaTTCanBo(motCuaTrangThaiHoSo.getMaTrangThai().trim());
//				log.debug("==========updateTrangThaiHoSo========xong liCuaAnhXaTrangThais=======" + liCuaAnhXaTrangThais);

//				if (liCuaAnhXaTrangThais != null && liCuaAnhXaTrangThais.size() > 0) {
//					MotCuaTrangThaiHoSo motCuaTrangThaiHoSoDoanhNghiep = MotCuaTrangThaiHoSoLocalServiceUtil.fetchByMaTrangThai(liCuaAnhXaTrangThais.get(0).getMaTTDoanhNghiep());
//					_log.debug("==========updateTrangThaiHoSo========xong motCuaTrangThaiHoSoDoanhNghiep=======" + motCuaTrangThaiHoSoDoanhNghiep);

//					if (motCuaTrangThaiHoSoDoanhNghiep != null) {
//						tthcHoSoThuTuc.setTrangThaiHoSo(String.valueOf(motCuaTrangThaiHoSoDoanhNghiep.getId()));
						TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(tthcHoSoThuTuc);
					}
//				}
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
