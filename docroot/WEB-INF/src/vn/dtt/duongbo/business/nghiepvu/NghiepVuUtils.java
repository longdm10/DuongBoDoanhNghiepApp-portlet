
package vn.dtt.duongbo.business.nghiepvu;

import java.util.List;

import vn.dtt.duongbo.dao.common.model.TthcBieuMauHoSo;
import vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau;
import vn.dtt.duongbo.dao.common.model.impl.TthcBieuMauHoSoImpl;
import vn.dtt.duongbo.dao.common.service.TthcBieuMauHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.common.service.TthcThanhPhanHoSoBieuMauLocalServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

public class NghiepVuUtils {
	
	private static Log _log = LogFactoryUtil.getLog(NghiepVuUtils.class);
	
	public static void sendHoSoCanBo(TthcHoSoThuTuc hoSoThuTuc) {
		_log.info("sendHoSoCanBo");
	}
	
	public static TthcBieuMauHoSo getBieuMauHoSoByThanhPhanHoSoId(long thanhPhanHoSoId) {
		TthcBieuMauHoSo bieuMauHoSo = null;
		try {
			List<TthcThanhPhanHoSoBieuMau> allThanhPhanHoSoBieuMau = TthcThanhPhanHoSoBieuMauLocalServiceUtil.findByThanhPhanHoSoId(thanhPhanHoSoId);
			if (allThanhPhanHoSoBieuMau != null && allThanhPhanHoSoBieuMau.size() > 0) {
				bieuMauHoSo = TthcBieuMauHoSoLocalServiceUtil.fetchTthcBieuMauHoSo(allThanhPhanHoSoBieuMau.get(0).getBieuMauHoSoId());
				if (Validator.isNull(bieuMauHoSo)) {
					bieuMauHoSo = new TthcBieuMauHoSoImpl();
				}
			}
		} catch (Exception e) {
			_log.error(e);
		}
		
		return bieuMauHoSo;
	}
}
