
package vn.dtt.duongbo.dao.common.service.persistence;

import java.util.List;

import vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo;
import vn.dtt.duongbo.dao.common.model.impl.TthcHoSoThuTucImpl;
import vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class TthcNoidungHoSoFinderImpl extends BasePersistenceImpl<TthcNoidungHoSo> implements TthcNoidungHoSoFinder {
	
	private Log _log = LogFactoryUtil.getLog(TthcNoidungHoSoFinderImpl.class);
	
	public List<TthcNoidungHoSo> findByHoSoThuTucIdAndThanhPhanHoSoId(long hoSoThuTucId, long thanhPhanHoSoId) throws SystemException {
		Session session = null;
		try {
			if (hoSoThuTucId > 0) {
				session = openSession();
				
				StringBuilder query = new StringBuilder();
				
				query.append("SELECT * FROM tthc_noidunghoso WHERE 1=1");
				
				query.append(" AND HOSOTHUTUCID = " + hoSoThuTucId);
				
				if (thanhPhanHoSoId > 0) {
					query.append(" AND THANHPHANHOSOID = " + thanhPhanHoSoId);
				}
				
				query.append(" order by NGAYTAO desc ");
				
				_log.debug("===findByHoSoThuTucIdAndThanhPhanHoSoId===" + query.toString());
				
				SQLQuery q = session.createSQLQuery(query.toString());
				q.setCacheable(false);
				q.addEntity("TthcHoSoThuTuc", TthcHoSoThuTucImpl.class);
				
				return (List<TthcNoidungHoSo>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			} else {
				return null;
			}
			
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	public TthcNoidungHoSo getLastByHoSoThuTucIdAndThanhPhanHoSoId(long hoSoThuTucId, long thanhPhanHoSoId) throws SystemException {
		Session session = null;
		try {
			if (hoSoThuTucId > 0 && thanhPhanHoSoId > 0) {
				
				session = openSession();
				
				StringBuilder query = new StringBuilder();
				query.append("SELECT * FROM tthc_noidunghoso WHERE ");
				query.append("HOSOTHUTUCID = ? ");
				query.append("AND THANHPHANHOSOID = ? ");
				query.append("order by NGAYTAO desc ");
				
				_log.debug("===findLastByHoSoThuTucIdAndThanhPhanHoSoId===" + query.toString());
				
				SQLQuery q = session.createSQLQuery(query.toString());
				q.setCacheable(false);
				q.addEntity("TthcNoidungHoSo", TthcNoidungHoSoImpl.class);
				
				QueryPos qPos = QueryPos.getInstance(q);
				qPos.add(hoSoThuTucId);
				qPos.add(thanhPhanHoSoId);
				
				List<TthcNoidungHoSo> lstResult = (List<TthcNoidungHoSo>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
				_log.info("getLastByHoSoThuTucIdAndThanhPhanHoSoId" + (Validator.isNotNull(lstResult) ? "==not null==" + lstResult.size() : "==null=="));
				
				if (Validator.isNotNull(lstResult) && lstResult.size() > 0) {
					return lstResult.get(0);
				}
			}
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
		return null;
	}
}
