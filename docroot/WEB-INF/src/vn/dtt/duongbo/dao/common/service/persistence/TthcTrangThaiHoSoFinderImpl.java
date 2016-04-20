/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package vn.dtt.duongbo.dao.common.service.persistence;

import java.util.List;

import vn.dtt.duongbo.dao.common.model.TthcTrangThaiHoSo;
import vn.dtt.duongbo.dao.common.model.impl.TthcTrangThaiHoSoImpl;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

/**
 * The persistence interface for the mot cua trang thai ho so service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see MotCuaTrangThaiHoSoPersistenceImpl
 * @see MotCuaTrangThaiHoSoUtil
 * @generated
 */
public class TthcTrangThaiHoSoFinderImpl  extends BasePersistenceImpl<TthcTrangThaiHoSo> implements TthcTrangThaiHoSoFinder {
	
	private Log log = LogFactoryUtil.getLog(TthcTrangThaiHoSoFinderImpl.class);
	
	public TthcTrangThaiHoSo findMotCuaTrangThaiHoSoById(long motCuaTrangThaiHoSoId) {
		Session session = null;
		try {
			session = openSession();
			
			StringBuilder query = new StringBuilder();
			query.append("SELECT * FROM motcua_trangthaihoso where id = " + motCuaTrangThaiHoSoId);
			
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("TthcTrangThaiHoSo", TthcTrangThaiHoSoImpl.class);
			
			return (TthcTrangThaiHoSo)q.uniqueResult();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		
		return null;
	}
	
	public List<TthcTrangThaiHoSo> findTrangThaiHoSoInListId(String idStr) {
		List<TthcTrangThaiHoSo> result = null;
		Session session = null;
		try {
			session = openSession();

			StringBuilder query = new StringBuilder();
			query.append("SELECT * FROM motcua_trangthaihoso where 1=1 ");
			query.append(" And id in (" + idStr + ")");
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("TthcTrangThaiHoSo", TthcTrangThaiHoSoImpl.class);

			result =  (List<TthcTrangThaiHoSo>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}

		return result;
	}
}