
package vn.dtt.duongbo.dao.common.service.persistence;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietCam;
import vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietLao;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class QlvtDiemDungDangKyVietCamFinderImpl extends BasePersistenceImpl<QlvtDiemDungDangKyVietCam> implements QlvtDiemDungDangKyVietCamFinder {
	
	private Log _log = LogFactoryUtil.getLog(QlvtDiemDungDangKyVietCamFinderImpl.class);
	
	public List<Long> findIdNoiDungHoSoId(long noiDungHoSoId)
		throws SystemException {
		Session session = null;
		
		try {
			if (noiDungHoSoId > 0) {
				
				session = openSession();
				
				StringBuilder query = new StringBuilder();
				query.append("SELECT ID as id FROM qlvt_diemdungdangky_vc WHERE ");
				query.append("NOIDUNGHOSOID = ? ");
				
				_log.debug("===findIdNoiDungHoSoId===" + query.toString());
				
				SQLQuery q = session.createSQLQuery(query.toString());
				q.addScalar("total", Type.LONG);
				q.setCacheable(false);
				
				QueryPos qPos = QueryPos.getInstance(q);
				qPos.add(noiDungHoSoId);
				
				Iterator<Long> itr = q.list().iterator();
				
				List<Long> lstId = new ArrayList<Long>();
				
				if (itr.hasNext()) {
					
					while (itr.hasNext()) {
						lstId.add(itr.next().longValue());
					}
					
					_log.info("--findIdNoiDungHoSoId--" + lstId.size());
					return lstId;
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
