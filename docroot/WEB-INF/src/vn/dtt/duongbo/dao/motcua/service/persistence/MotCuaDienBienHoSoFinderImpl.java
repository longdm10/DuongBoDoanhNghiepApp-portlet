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

package vn.dtt.duongbo.dao.motcua.service.persistence;

import java.util.ArrayList;
import java.util.List;

import vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo;
import vn.dtt.duongbo.dao.motcua.model.impl.MotCuaDienBienHoSoImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

/**
 * The persistence interface for the mot cua dien bien ho so service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see MotCuaDienBienHoSoPersistenceImpl
 * @see MotCuaDienBienHoSoUtil
 * @generated
 */
public class MotCuaDienBienHoSoFinderImpl  extends BasePersistenceImpl<MotCuaDienBienHoSo> implements MotCuaDienBienHoSoFinder {
	
	private Log log = LogFactoryUtil.getLog(MotCuaDienBienHoSoFinderImpl.class);
	
	public List<MotCuaDienBienHoSo> findMotCuaDienBienHoSo(long phieuxulyid) {
		Session session = null;
		try {
			session = openSession();

			StringBuilder query = new StringBuilder();
			query.append("SELECT * FROM motcua_dienbienhoso m where phieuxulyid = ? order by ngayxuly");

			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity("MotCuaDienBienHoSo", MotCuaDienBienHoSoImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(phieuxulyid);

			return (List<MotCuaDienBienHoSo>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}

		return new ArrayList<MotCuaDienBienHoSo>();
	}
}