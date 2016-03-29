package vn.dtt.duongbo.dao.common.service.persistence;

import java.util.ArrayList;
import java.util.List;

import vn.dtt.duongbo.dao.common.model.DmDataItem;
import vn.dtt.duongbo.dao.common.model.TthcDonViThucHien;
import vn.dtt.duongbo.dao.common.model.impl.DmDataItemImpl;
import vn.dtt.duongbo.dao.common.model.impl.TthcDonViThucHienImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class TthcDonViThucHienFinderImpl extends BasePersistenceImpl<TthcDonViThucHien> implements TthcDonViThucHienFinder {
	
	private static final Log _log = LogFactoryUtil.getLog(TthcDonViThucHienFinderImpl.class);
	
	public static final String FIND_BY_THUTUCHANHCHINHID = TthcDonViThucHienFinder.class.getName() + ".findByThuTucHanhChinhId";
	
	public List<DmDataItem> findByThuTucHanhChinhId(long thuTucHanhChinhId) throws SystemException {
		Session session = null;
		
		try {
			session = openSession();

			String sql = CustomSQLUtil.get(FIND_BY_THUTUCHANHCHINHID);
			
			SQLQuery q = session.createSQLQuery(sql);
			
			q.setCacheable(false);
			q.addEntity(DmDataItemImpl.TABLE_NAME, DmDataItemImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(thuTucHanhChinhId);
			
			return (List<DmDataItem>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
}
