
package vn.dtt.duongbo.dao.common.service.persistence;

import java.util.List;

import vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo;
import vn.dtt.duongbo.dao.common.model.impl.TthcThanhPhanHoSoImpl;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class TthcThanhPhanHoSoFinderImpl extends BasePersistenceImpl<TthcThanhPhanHoSo> implements TthcThanhPhanHoSoFinder {
	
	private Log _log = LogFactoryUtil.getLog(TthcThanhPhanHoSoFinderImpl.class);
	
	public List<TthcThanhPhanHoSo> findByThutucHanhChinhIdAndLoaiThanhPhan(String thuTucHanhChinhId, String loaiThanhPhan) {
		Session session = null;
		try {
			session = openSession();
			StringBuilder query = new StringBuilder();
			
			query.append(" SELECT * FROM tthc_thanhphanhoso where 1=1 ");
			
			if (Validator.isNotNull(thuTucHanhChinhId) && thuTucHanhChinhId.trim().length() > 0) {
				query.append(" AND thutuchanhchinhid = " + thuTucHanhChinhId);
			}
			
			if (Validator.isNotNull(loaiThanhPhan) && loaiThanhPhan.trim().length() > 0) {
				query.append(" AND loaithanhphan in (" + loaiThanhPhan + ")");
			}
			query.append(" order by THUTUHIENTHI asc");

			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("TthcThanhPhanHoSo", TthcThanhPhanHoSoImpl.class);
			
			_log.debug("=========findByThutucHanhChinhIdAndLoaiThanhPhan===" + query.toString());
			
			return (List<TthcThanhPhanHoSo>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return null;
	}
}
