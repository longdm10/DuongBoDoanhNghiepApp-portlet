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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException;
import vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc;
import vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtWorkingUnit2tthcImpl;
import vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtWorkingUnit2tthcModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the o e p user mgt working unit2tthc service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see OEPUserMgtWorkingUnit2tthcPersistence
 * @see OEPUserMgtWorkingUnit2tthcUtil
 * @generated
 */
public class OEPUserMgtWorkingUnit2tthcPersistenceImpl
	extends BasePersistenceImpl<OEPUserMgtWorkingUnit2tthc>
	implements OEPUserMgtWorkingUnit2tthcPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link OEPUserMgtWorkingUnit2tthcUtil} to access the o e p user mgt working unit2tthc persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = OEPUserMgtWorkingUnit2tthcImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(OEPUserMgtWorkingUnit2tthcModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtWorkingUnit2tthcModelImpl.FINDER_CACHE_ENABLED,
			OEPUserMgtWorkingUnit2tthcImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(OEPUserMgtWorkingUnit2tthcModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtWorkingUnit2tthcModelImpl.FINDER_CACHE_ENABLED,
			OEPUserMgtWorkingUnit2tthcImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(OEPUserMgtWorkingUnit2tthcModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtWorkingUnit2tthcModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_F_TTHCID = new FinderPath(OEPUserMgtWorkingUnit2tthcModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtWorkingUnit2tthcModelImpl.FINDER_CACHE_ENABLED,
			OEPUserMgtWorkingUnit2tthcImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByF_TTHCId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_TTHCID =
		new FinderPath(OEPUserMgtWorkingUnit2tthcModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtWorkingUnit2tthcModelImpl.FINDER_CACHE_ENABLED,
			OEPUserMgtWorkingUnit2tthcImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByF_TTHCId",
			new String[] { Long.class.getName() },
			OEPUserMgtWorkingUnit2tthcModelImpl.TTHCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_TTHCID = new FinderPath(OEPUserMgtWorkingUnit2tthcModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtWorkingUnit2tthcModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByF_TTHCId", new String[] { Long.class.getName() });

	/**
	 * Returns all the o e p user mgt working unit2tthcs where TTHCId = &#63;.
	 *
	 * @param TTHCId the t t h c ID
	 * @return the matching o e p user mgt working unit2tthcs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OEPUserMgtWorkingUnit2tthc> findByF_TTHCId(long TTHCId)
		throws SystemException {
		return findByF_TTHCId(TTHCId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the o e p user mgt working unit2tthcs where TTHCId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtWorkingUnit2tthcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param TTHCId the t t h c ID
	 * @param start the lower bound of the range of o e p user mgt working unit2tthcs
	 * @param end the upper bound of the range of o e p user mgt working unit2tthcs (not inclusive)
	 * @return the range of matching o e p user mgt working unit2tthcs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OEPUserMgtWorkingUnit2tthc> findByF_TTHCId(long TTHCId,
		int start, int end) throws SystemException {
		return findByF_TTHCId(TTHCId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the o e p user mgt working unit2tthcs where TTHCId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtWorkingUnit2tthcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param TTHCId the t t h c ID
	 * @param start the lower bound of the range of o e p user mgt working unit2tthcs
	 * @param end the upper bound of the range of o e p user mgt working unit2tthcs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching o e p user mgt working unit2tthcs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OEPUserMgtWorkingUnit2tthc> findByF_TTHCId(long TTHCId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_TTHCID;
			finderArgs = new Object[] { TTHCId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_F_TTHCID;
			finderArgs = new Object[] { TTHCId, start, end, orderByComparator };
		}

		List<OEPUserMgtWorkingUnit2tthc> list = (List<OEPUserMgtWorkingUnit2tthc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc : list) {
				if ((TTHCId != oepUserMgtWorkingUnit2tthc.getTTHCId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_OEPUSERMGTWORKINGUNIT2TTHC_WHERE);

			query.append(_FINDER_COLUMN_F_TTHCID_TTHCID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(OEPUserMgtWorkingUnit2tthcModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(TTHCId);

				if (!pagination) {
					list = (List<OEPUserMgtWorkingUnit2tthc>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<OEPUserMgtWorkingUnit2tthc>(list);
				}
				else {
					list = (List<OEPUserMgtWorkingUnit2tthc>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first o e p user mgt working unit2tthc in the ordered set where TTHCId = &#63;.
	 *
	 * @param TTHCId the t t h c ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching o e p user mgt working unit2tthc
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException if a matching o e p user mgt working unit2tthc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtWorkingUnit2tthc findByF_TTHCId_First(long TTHCId,
		OrderByComparator orderByComparator)
		throws NoSuchOEPUserMgtWorkingUnit2tthcException, SystemException {
		OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc = fetchByF_TTHCId_First(TTHCId,
				orderByComparator);

		if (oepUserMgtWorkingUnit2tthc != null) {
			return oepUserMgtWorkingUnit2tthc;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("TTHCId=");
		msg.append(TTHCId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOEPUserMgtWorkingUnit2tthcException(msg.toString());
	}

	/**
	 * Returns the first o e p user mgt working unit2tthc in the ordered set where TTHCId = &#63;.
	 *
	 * @param TTHCId the t t h c ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching o e p user mgt working unit2tthc, or <code>null</code> if a matching o e p user mgt working unit2tthc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtWorkingUnit2tthc fetchByF_TTHCId_First(long TTHCId,
		OrderByComparator orderByComparator) throws SystemException {
		List<OEPUserMgtWorkingUnit2tthc> list = findByF_TTHCId(TTHCId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last o e p user mgt working unit2tthc in the ordered set where TTHCId = &#63;.
	 *
	 * @param TTHCId the t t h c ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching o e p user mgt working unit2tthc
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException if a matching o e p user mgt working unit2tthc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtWorkingUnit2tthc findByF_TTHCId_Last(long TTHCId,
		OrderByComparator orderByComparator)
		throws NoSuchOEPUserMgtWorkingUnit2tthcException, SystemException {
		OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc = fetchByF_TTHCId_Last(TTHCId,
				orderByComparator);

		if (oepUserMgtWorkingUnit2tthc != null) {
			return oepUserMgtWorkingUnit2tthc;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("TTHCId=");
		msg.append(TTHCId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOEPUserMgtWorkingUnit2tthcException(msg.toString());
	}

	/**
	 * Returns the last o e p user mgt working unit2tthc in the ordered set where TTHCId = &#63;.
	 *
	 * @param TTHCId the t t h c ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching o e p user mgt working unit2tthc, or <code>null</code> if a matching o e p user mgt working unit2tthc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtWorkingUnit2tthc fetchByF_TTHCId_Last(long TTHCId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByF_TTHCId(TTHCId);

		if (count == 0) {
			return null;
		}

		List<OEPUserMgtWorkingUnit2tthc> list = findByF_TTHCId(TTHCId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the o e p user mgt working unit2tthcs before and after the current o e p user mgt working unit2tthc in the ordered set where TTHCId = &#63;.
	 *
	 * @param workingUnit2TTHCId the primary key of the current o e p user mgt working unit2tthc
	 * @param TTHCId the t t h c ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next o e p user mgt working unit2tthc
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException if a o e p user mgt working unit2tthc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtWorkingUnit2tthc[] findByF_TTHCId_PrevAndNext(
		long workingUnit2TTHCId, long TTHCId,
		OrderByComparator orderByComparator)
		throws NoSuchOEPUserMgtWorkingUnit2tthcException, SystemException {
		OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc = findByPrimaryKey(workingUnit2TTHCId);

		Session session = null;

		try {
			session = openSession();

			OEPUserMgtWorkingUnit2tthc[] array = new OEPUserMgtWorkingUnit2tthcImpl[3];

			array[0] = getByF_TTHCId_PrevAndNext(session,
					oepUserMgtWorkingUnit2tthc, TTHCId, orderByComparator, true);

			array[1] = oepUserMgtWorkingUnit2tthc;

			array[2] = getByF_TTHCId_PrevAndNext(session,
					oepUserMgtWorkingUnit2tthc, TTHCId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected OEPUserMgtWorkingUnit2tthc getByF_TTHCId_PrevAndNext(
		Session session, OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc,
		long TTHCId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_OEPUSERMGTWORKINGUNIT2TTHC_WHERE);

		query.append(_FINDER_COLUMN_F_TTHCID_TTHCID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(OEPUserMgtWorkingUnit2tthcModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(TTHCId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(oepUserMgtWorkingUnit2tthc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<OEPUserMgtWorkingUnit2tthc> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the o e p user mgt working unit2tthcs where TTHCId = &#63; from the database.
	 *
	 * @param TTHCId the t t h c ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByF_TTHCId(long TTHCId) throws SystemException {
		for (OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc : findByF_TTHCId(
				TTHCId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(oepUserMgtWorkingUnit2tthc);
		}
	}

	/**
	 * Returns the number of o e p user mgt working unit2tthcs where TTHCId = &#63;.
	 *
	 * @param TTHCId the t t h c ID
	 * @return the number of matching o e p user mgt working unit2tthcs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByF_TTHCId(long TTHCId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_TTHCID;

		Object[] finderArgs = new Object[] { TTHCId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_OEPUSERMGTWORKINGUNIT2TTHC_WHERE);

			query.append(_FINDER_COLUMN_F_TTHCID_TTHCID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(TTHCId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_F_TTHCID_TTHCID_2 = "oepUserMgtWorkingUnit2tthc.TTHCId = ? AND  oepUserMgtWorkingUnit2tthc.tiepNhanTrucTiep = 0 ";
	public static final FinderPath FINDER_PATH_FETCH_BY_F_TTHCID_WORKINGUNITID = new FinderPath(OEPUserMgtWorkingUnit2tthcModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtWorkingUnit2tthcModelImpl.FINDER_CACHE_ENABLED,
			OEPUserMgtWorkingUnit2tthcImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByF_TTHCId_workingUnitId",
			new String[] { Long.class.getName(), Long.class.getName() },
			OEPUserMgtWorkingUnit2tthcModelImpl.TTHCID_COLUMN_BITMASK |
			OEPUserMgtWorkingUnit2tthcModelImpl.WORKINGUNITID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_TTHCID_WORKINGUNITID = new FinderPath(OEPUserMgtWorkingUnit2tthcModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtWorkingUnit2tthcModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByF_TTHCId_workingUnitId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the o e p user mgt working unit2tthc where TTHCId = &#63; and workingUnitId = &#63; or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException} if it could not be found.
	 *
	 * @param TTHCId the t t h c ID
	 * @param workingUnitId the working unit ID
	 * @return the matching o e p user mgt working unit2tthc
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException if a matching o e p user mgt working unit2tthc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtWorkingUnit2tthc findByF_TTHCId_workingUnitId(
		long TTHCId, long workingUnitId)
		throws NoSuchOEPUserMgtWorkingUnit2tthcException, SystemException {
		OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc = fetchByF_TTHCId_workingUnitId(TTHCId,
				workingUnitId);

		if (oepUserMgtWorkingUnit2tthc == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("TTHCId=");
			msg.append(TTHCId);

			msg.append(", workingUnitId=");
			msg.append(workingUnitId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchOEPUserMgtWorkingUnit2tthcException(msg.toString());
		}

		return oepUserMgtWorkingUnit2tthc;
	}

	/**
	 * Returns the o e p user mgt working unit2tthc where TTHCId = &#63; and workingUnitId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param TTHCId the t t h c ID
	 * @param workingUnitId the working unit ID
	 * @return the matching o e p user mgt working unit2tthc, or <code>null</code> if a matching o e p user mgt working unit2tthc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtWorkingUnit2tthc fetchByF_TTHCId_workingUnitId(
		long TTHCId, long workingUnitId) throws SystemException {
		return fetchByF_TTHCId_workingUnitId(TTHCId, workingUnitId, true);
	}

	/**
	 * Returns the o e p user mgt working unit2tthc where TTHCId = &#63; and workingUnitId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param TTHCId the t t h c ID
	 * @param workingUnitId the working unit ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching o e p user mgt working unit2tthc, or <code>null</code> if a matching o e p user mgt working unit2tthc could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtWorkingUnit2tthc fetchByF_TTHCId_workingUnitId(
		long TTHCId, long workingUnitId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { TTHCId, workingUnitId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_F_TTHCID_WORKINGUNITID,
					finderArgs, this);
		}

		if (result instanceof OEPUserMgtWorkingUnit2tthc) {
			OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc = (OEPUserMgtWorkingUnit2tthc)result;

			if ((TTHCId != oepUserMgtWorkingUnit2tthc.getTTHCId()) ||
					(workingUnitId != oepUserMgtWorkingUnit2tthc.getWorkingUnitId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_OEPUSERMGTWORKINGUNIT2TTHC_WHERE);

			query.append(_FINDER_COLUMN_F_TTHCID_WORKINGUNITID_TTHCID_2);

			query.append(_FINDER_COLUMN_F_TTHCID_WORKINGUNITID_WORKINGUNITID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(TTHCId);

				qPos.add(workingUnitId);

				List<OEPUserMgtWorkingUnit2tthc> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_TTHCID_WORKINGUNITID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"OEPUserMgtWorkingUnit2tthcPersistenceImpl.fetchByF_TTHCId_workingUnitId(long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc = list.get(0);

					result = oepUserMgtWorkingUnit2tthc;

					cacheResult(oepUserMgtWorkingUnit2tthc);

					if ((oepUserMgtWorkingUnit2tthc.getTTHCId() != TTHCId) ||
							(oepUserMgtWorkingUnit2tthc.getWorkingUnitId() != workingUnitId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_TTHCID_WORKINGUNITID,
							finderArgs, oepUserMgtWorkingUnit2tthc);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_F_TTHCID_WORKINGUNITID,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (OEPUserMgtWorkingUnit2tthc)result;
		}
	}

	/**
	 * Removes the o e p user mgt working unit2tthc where TTHCId = &#63; and workingUnitId = &#63; from the database.
	 *
	 * @param TTHCId the t t h c ID
	 * @param workingUnitId the working unit ID
	 * @return the o e p user mgt working unit2tthc that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtWorkingUnit2tthc removeByF_TTHCId_workingUnitId(
		long TTHCId, long workingUnitId)
		throws NoSuchOEPUserMgtWorkingUnit2tthcException, SystemException {
		OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc = findByF_TTHCId_workingUnitId(TTHCId,
				workingUnitId);

		return remove(oepUserMgtWorkingUnit2tthc);
	}

	/**
	 * Returns the number of o e p user mgt working unit2tthcs where TTHCId = &#63; and workingUnitId = &#63;.
	 *
	 * @param TTHCId the t t h c ID
	 * @param workingUnitId the working unit ID
	 * @return the number of matching o e p user mgt working unit2tthcs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByF_TTHCId_workingUnitId(long TTHCId, long workingUnitId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_TTHCID_WORKINGUNITID;

		Object[] finderArgs = new Object[] { TTHCId, workingUnitId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_OEPUSERMGTWORKINGUNIT2TTHC_WHERE);

			query.append(_FINDER_COLUMN_F_TTHCID_WORKINGUNITID_TTHCID_2);

			query.append(_FINDER_COLUMN_F_TTHCID_WORKINGUNITID_WORKINGUNITID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(TTHCId);

				qPos.add(workingUnitId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_F_TTHCID_WORKINGUNITID_TTHCID_2 = "oepUserMgtWorkingUnit2tthc.TTHCId = ? AND ";
	private static final String _FINDER_COLUMN_F_TTHCID_WORKINGUNITID_WORKINGUNITID_2 =
		"oepUserMgtWorkingUnit2tthc.workingUnitId = ? AND  oepUserMgtWorkingUnit2tthc.tiepNhanTrucTiep = 0 ";

	public OEPUserMgtWorkingUnit2tthcPersistenceImpl() {
		setModelClass(OEPUserMgtWorkingUnit2tthc.class);
	}

	/**
	 * Caches the o e p user mgt working unit2tthc in the entity cache if it is enabled.
	 *
	 * @param oepUserMgtWorkingUnit2tthc the o e p user mgt working unit2tthc
	 */
	@Override
	public void cacheResult(
		OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc) {
		EntityCacheUtil.putResult(OEPUserMgtWorkingUnit2tthcModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtWorkingUnit2tthcImpl.class,
			oepUserMgtWorkingUnit2tthc.getPrimaryKey(),
			oepUserMgtWorkingUnit2tthc);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_TTHCID_WORKINGUNITID,
			new Object[] {
				oepUserMgtWorkingUnit2tthc.getTTHCId(),
				oepUserMgtWorkingUnit2tthc.getWorkingUnitId()
			}, oepUserMgtWorkingUnit2tthc);

		oepUserMgtWorkingUnit2tthc.resetOriginalValues();
	}

	/**
	 * Caches the o e p user mgt working unit2tthcs in the entity cache if it is enabled.
	 *
	 * @param oepUserMgtWorkingUnit2tthcs the o e p user mgt working unit2tthcs
	 */
	@Override
	public void cacheResult(
		List<OEPUserMgtWorkingUnit2tthc> oepUserMgtWorkingUnit2tthcs) {
		for (OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc : oepUserMgtWorkingUnit2tthcs) {
			if (EntityCacheUtil.getResult(
						OEPUserMgtWorkingUnit2tthcModelImpl.ENTITY_CACHE_ENABLED,
						OEPUserMgtWorkingUnit2tthcImpl.class,
						oepUserMgtWorkingUnit2tthc.getPrimaryKey()) == null) {
				cacheResult(oepUserMgtWorkingUnit2tthc);
			}
			else {
				oepUserMgtWorkingUnit2tthc.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all o e p user mgt working unit2tthcs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(OEPUserMgtWorkingUnit2tthcImpl.class.getName());
		}

		EntityCacheUtil.clearCache(OEPUserMgtWorkingUnit2tthcImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the o e p user mgt working unit2tthc.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc) {
		EntityCacheUtil.removeResult(OEPUserMgtWorkingUnit2tthcModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtWorkingUnit2tthcImpl.class,
			oepUserMgtWorkingUnit2tthc.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(oepUserMgtWorkingUnit2tthc);
	}

	@Override
	public void clearCache(
		List<OEPUserMgtWorkingUnit2tthc> oepUserMgtWorkingUnit2tthcs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc : oepUserMgtWorkingUnit2tthcs) {
			EntityCacheUtil.removeResult(OEPUserMgtWorkingUnit2tthcModelImpl.ENTITY_CACHE_ENABLED,
				OEPUserMgtWorkingUnit2tthcImpl.class,
				oepUserMgtWorkingUnit2tthc.getPrimaryKey());

			clearUniqueFindersCache(oepUserMgtWorkingUnit2tthc);
		}
	}

	protected void cacheUniqueFindersCache(
		OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc) {
		if (oepUserMgtWorkingUnit2tthc.isNew()) {
			Object[] args = new Object[] {
					oepUserMgtWorkingUnit2tthc.getTTHCId(),
					oepUserMgtWorkingUnit2tthc.getWorkingUnitId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_F_TTHCID_WORKINGUNITID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_TTHCID_WORKINGUNITID,
				args, oepUserMgtWorkingUnit2tthc);
		}
		else {
			OEPUserMgtWorkingUnit2tthcModelImpl oepUserMgtWorkingUnit2tthcModelImpl =
				(OEPUserMgtWorkingUnit2tthcModelImpl)oepUserMgtWorkingUnit2tthc;

			if ((oepUserMgtWorkingUnit2tthcModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_F_TTHCID_WORKINGUNITID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						oepUserMgtWorkingUnit2tthc.getTTHCId(),
						oepUserMgtWorkingUnit2tthc.getWorkingUnitId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_F_TTHCID_WORKINGUNITID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_TTHCID_WORKINGUNITID,
					args, oepUserMgtWorkingUnit2tthc);
			}
		}
	}

	protected void clearUniqueFindersCache(
		OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc) {
		OEPUserMgtWorkingUnit2tthcModelImpl oepUserMgtWorkingUnit2tthcModelImpl = (OEPUserMgtWorkingUnit2tthcModelImpl)oepUserMgtWorkingUnit2tthc;

		Object[] args = new Object[] {
				oepUserMgtWorkingUnit2tthc.getTTHCId(),
				oepUserMgtWorkingUnit2tthc.getWorkingUnitId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_TTHCID_WORKINGUNITID,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_F_TTHCID_WORKINGUNITID,
			args);

		if ((oepUserMgtWorkingUnit2tthcModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_F_TTHCID_WORKINGUNITID.getColumnBitmask()) != 0) {
			args = new Object[] {
					oepUserMgtWorkingUnit2tthcModelImpl.getOriginalTTHCId(),
					oepUserMgtWorkingUnit2tthcModelImpl.getOriginalWorkingUnitId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_TTHCID_WORKINGUNITID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_F_TTHCID_WORKINGUNITID,
				args);
		}
	}

	/**
	 * Creates a new o e p user mgt working unit2tthc with the primary key. Does not add the o e p user mgt working unit2tthc to the database.
	 *
	 * @param workingUnit2TTHCId the primary key for the new o e p user mgt working unit2tthc
	 * @return the new o e p user mgt working unit2tthc
	 */
	@Override
	public OEPUserMgtWorkingUnit2tthc create(long workingUnit2TTHCId) {
		OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc = new OEPUserMgtWorkingUnit2tthcImpl();

		oepUserMgtWorkingUnit2tthc.setNew(true);
		oepUserMgtWorkingUnit2tthc.setPrimaryKey(workingUnit2TTHCId);

		return oepUserMgtWorkingUnit2tthc;
	}

	/**
	 * Removes the o e p user mgt working unit2tthc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param workingUnit2TTHCId the primary key of the o e p user mgt working unit2tthc
	 * @return the o e p user mgt working unit2tthc that was removed
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException if a o e p user mgt working unit2tthc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtWorkingUnit2tthc remove(long workingUnit2TTHCId)
		throws NoSuchOEPUserMgtWorkingUnit2tthcException, SystemException {
		return remove((Serializable)workingUnit2TTHCId);
	}

	/**
	 * Removes the o e p user mgt working unit2tthc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the o e p user mgt working unit2tthc
	 * @return the o e p user mgt working unit2tthc that was removed
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException if a o e p user mgt working unit2tthc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtWorkingUnit2tthc remove(Serializable primaryKey)
		throws NoSuchOEPUserMgtWorkingUnit2tthcException, SystemException {
		Session session = null;

		try {
			session = openSession();

			OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc = (OEPUserMgtWorkingUnit2tthc)session.get(OEPUserMgtWorkingUnit2tthcImpl.class,
					primaryKey);

			if (oepUserMgtWorkingUnit2tthc == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOEPUserMgtWorkingUnit2tthcException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(oepUserMgtWorkingUnit2tthc);
		}
		catch (NoSuchOEPUserMgtWorkingUnit2tthcException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected OEPUserMgtWorkingUnit2tthc removeImpl(
		OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc)
		throws SystemException {
		oepUserMgtWorkingUnit2tthc = toUnwrappedModel(oepUserMgtWorkingUnit2tthc);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(oepUserMgtWorkingUnit2tthc)) {
				oepUserMgtWorkingUnit2tthc = (OEPUserMgtWorkingUnit2tthc)session.get(OEPUserMgtWorkingUnit2tthcImpl.class,
						oepUserMgtWorkingUnit2tthc.getPrimaryKeyObj());
			}

			if (oepUserMgtWorkingUnit2tthc != null) {
				session.delete(oepUserMgtWorkingUnit2tthc);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (oepUserMgtWorkingUnit2tthc != null) {
			clearCache(oepUserMgtWorkingUnit2tthc);
		}

		return oepUserMgtWorkingUnit2tthc;
	}

	@Override
	public OEPUserMgtWorkingUnit2tthc updateImpl(
		vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc)
		throws SystemException {
		oepUserMgtWorkingUnit2tthc = toUnwrappedModel(oepUserMgtWorkingUnit2tthc);

		boolean isNew = oepUserMgtWorkingUnit2tthc.isNew();

		OEPUserMgtWorkingUnit2tthcModelImpl oepUserMgtWorkingUnit2tthcModelImpl = (OEPUserMgtWorkingUnit2tthcModelImpl)oepUserMgtWorkingUnit2tthc;

		Session session = null;

		try {
			session = openSession();

			if (oepUserMgtWorkingUnit2tthc.isNew()) {
				session.save(oepUserMgtWorkingUnit2tthc);

				oepUserMgtWorkingUnit2tthc.setNew(false);
			}
			else {
				session.merge(oepUserMgtWorkingUnit2tthc);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew ||
				!OEPUserMgtWorkingUnit2tthcModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((oepUserMgtWorkingUnit2tthcModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_TTHCID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						oepUserMgtWorkingUnit2tthcModelImpl.getOriginalTTHCId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_TTHCID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_TTHCID,
					args);

				args = new Object[] {
						oepUserMgtWorkingUnit2tthcModelImpl.getTTHCId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_TTHCID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_TTHCID,
					args);
			}
		}

		EntityCacheUtil.putResult(OEPUserMgtWorkingUnit2tthcModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtWorkingUnit2tthcImpl.class,
			oepUserMgtWorkingUnit2tthc.getPrimaryKey(),
			oepUserMgtWorkingUnit2tthc);

		clearUniqueFindersCache(oepUserMgtWorkingUnit2tthc);
		cacheUniqueFindersCache(oepUserMgtWorkingUnit2tthc);

		return oepUserMgtWorkingUnit2tthc;
	}

	protected OEPUserMgtWorkingUnit2tthc toUnwrappedModel(
		OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc) {
		if (oepUserMgtWorkingUnit2tthc instanceof OEPUserMgtWorkingUnit2tthcImpl) {
			return oepUserMgtWorkingUnit2tthc;
		}

		OEPUserMgtWorkingUnit2tthcImpl oepUserMgtWorkingUnit2tthcImpl = new OEPUserMgtWorkingUnit2tthcImpl();

		oepUserMgtWorkingUnit2tthcImpl.setNew(oepUserMgtWorkingUnit2tthc.isNew());
		oepUserMgtWorkingUnit2tthcImpl.setPrimaryKey(oepUserMgtWorkingUnit2tthc.getPrimaryKey());

		oepUserMgtWorkingUnit2tthcImpl.setWorkingUnit2TTHCId(oepUserMgtWorkingUnit2tthc.getWorkingUnit2TTHCId());
		oepUserMgtWorkingUnit2tthcImpl.setUserId(oepUserMgtWorkingUnit2tthc.getUserId());
		oepUserMgtWorkingUnit2tthcImpl.setGroupId(oepUserMgtWorkingUnit2tthc.getGroupId());
		oepUserMgtWorkingUnit2tthcImpl.setCompanyId(oepUserMgtWorkingUnit2tthc.getCompanyId());
		oepUserMgtWorkingUnit2tthcImpl.setCreateDate(oepUserMgtWorkingUnit2tthc.getCreateDate());
		oepUserMgtWorkingUnit2tthcImpl.setModifiedDate(oepUserMgtWorkingUnit2tthc.getModifiedDate());
		oepUserMgtWorkingUnit2tthcImpl.setWorkingUnitId(oepUserMgtWorkingUnit2tthc.getWorkingUnitId());
		oepUserMgtWorkingUnit2tthcImpl.setTTHCId(oepUserMgtWorkingUnit2tthc.getTTHCId());
		oepUserMgtWorkingUnit2tthcImpl.setLaDonViTiepNhanBanDau(oepUserMgtWorkingUnit2tthc.getLaDonViTiepNhanBanDau());
		oepUserMgtWorkingUnit2tthcImpl.setParentWorkingUnitID(oepUserMgtWorkingUnit2tthc.getParentWorkingUnitID());
		oepUserMgtWorkingUnit2tthcImpl.setTiepNhanTrucTiep(oepUserMgtWorkingUnit2tthc.getTiepNhanTrucTiep());

		return oepUserMgtWorkingUnit2tthcImpl;
	}

	/**
	 * Returns the o e p user mgt working unit2tthc with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the o e p user mgt working unit2tthc
	 * @return the o e p user mgt working unit2tthc
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException if a o e p user mgt working unit2tthc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtWorkingUnit2tthc findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOEPUserMgtWorkingUnit2tthcException, SystemException {
		OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc = fetchByPrimaryKey(primaryKey);

		if (oepUserMgtWorkingUnit2tthc == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOEPUserMgtWorkingUnit2tthcException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return oepUserMgtWorkingUnit2tthc;
	}

	/**
	 * Returns the o e p user mgt working unit2tthc with the primary key or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException} if it could not be found.
	 *
	 * @param workingUnit2TTHCId the primary key of the o e p user mgt working unit2tthc
	 * @return the o e p user mgt working unit2tthc
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnit2tthcException if a o e p user mgt working unit2tthc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtWorkingUnit2tthc findByPrimaryKey(long workingUnit2TTHCId)
		throws NoSuchOEPUserMgtWorkingUnit2tthcException, SystemException {
		return findByPrimaryKey((Serializable)workingUnit2TTHCId);
	}

	/**
	 * Returns the o e p user mgt working unit2tthc with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the o e p user mgt working unit2tthc
	 * @return the o e p user mgt working unit2tthc, or <code>null</code> if a o e p user mgt working unit2tthc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtWorkingUnit2tthc fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc = (OEPUserMgtWorkingUnit2tthc)EntityCacheUtil.getResult(OEPUserMgtWorkingUnit2tthcModelImpl.ENTITY_CACHE_ENABLED,
				OEPUserMgtWorkingUnit2tthcImpl.class, primaryKey);

		if (oepUserMgtWorkingUnit2tthc == _nullOEPUserMgtWorkingUnit2tthc) {
			return null;
		}

		if (oepUserMgtWorkingUnit2tthc == null) {
			Session session = null;

			try {
				session = openSession();

				oepUserMgtWorkingUnit2tthc = (OEPUserMgtWorkingUnit2tthc)session.get(OEPUserMgtWorkingUnit2tthcImpl.class,
						primaryKey);

				if (oepUserMgtWorkingUnit2tthc != null) {
					cacheResult(oepUserMgtWorkingUnit2tthc);
				}
				else {
					EntityCacheUtil.putResult(OEPUserMgtWorkingUnit2tthcModelImpl.ENTITY_CACHE_ENABLED,
						OEPUserMgtWorkingUnit2tthcImpl.class, primaryKey,
						_nullOEPUserMgtWorkingUnit2tthc);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(OEPUserMgtWorkingUnit2tthcModelImpl.ENTITY_CACHE_ENABLED,
					OEPUserMgtWorkingUnit2tthcImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return oepUserMgtWorkingUnit2tthc;
	}

	/**
	 * Returns the o e p user mgt working unit2tthc with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param workingUnit2TTHCId the primary key of the o e p user mgt working unit2tthc
	 * @return the o e p user mgt working unit2tthc, or <code>null</code> if a o e p user mgt working unit2tthc with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtWorkingUnit2tthc fetchByPrimaryKey(long workingUnit2TTHCId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)workingUnit2TTHCId);
	}

	/**
	 * Returns all the o e p user mgt working unit2tthcs.
	 *
	 * @return the o e p user mgt working unit2tthcs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OEPUserMgtWorkingUnit2tthc> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the o e p user mgt working unit2tthcs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtWorkingUnit2tthcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of o e p user mgt working unit2tthcs
	 * @param end the upper bound of the range of o e p user mgt working unit2tthcs (not inclusive)
	 * @return the range of o e p user mgt working unit2tthcs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OEPUserMgtWorkingUnit2tthc> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the o e p user mgt working unit2tthcs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtWorkingUnit2tthcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of o e p user mgt working unit2tthcs
	 * @param end the upper bound of the range of o e p user mgt working unit2tthcs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of o e p user mgt working unit2tthcs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OEPUserMgtWorkingUnit2tthc> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<OEPUserMgtWorkingUnit2tthc> list = (List<OEPUserMgtWorkingUnit2tthc>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_OEPUSERMGTWORKINGUNIT2TTHC);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_OEPUSERMGTWORKINGUNIT2TTHC;

				if (pagination) {
					sql = sql.concat(OEPUserMgtWorkingUnit2tthcModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<OEPUserMgtWorkingUnit2tthc>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<OEPUserMgtWorkingUnit2tthc>(list);
				}
				else {
					list = (List<OEPUserMgtWorkingUnit2tthc>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the o e p user mgt working unit2tthcs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc : findAll()) {
			remove(oepUserMgtWorkingUnit2tthc);
		}
	}

	/**
	 * Returns the number of o e p user mgt working unit2tthcs.
	 *
	 * @return the number of o e p user mgt working unit2tthcs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_OEPUSERMGTWORKINGUNIT2TTHC);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the o e p user mgt working unit2tthc persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<OEPUserMgtWorkingUnit2tthc>> listenersList = new ArrayList<ModelListener<OEPUserMgtWorkingUnit2tthc>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<OEPUserMgtWorkingUnit2tthc>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(OEPUserMgtWorkingUnit2tthcImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_OEPUSERMGTWORKINGUNIT2TTHC = "SELECT oepUserMgtWorkingUnit2tthc FROM OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc";
	private static final String _SQL_SELECT_OEPUSERMGTWORKINGUNIT2TTHC_WHERE = "SELECT oepUserMgtWorkingUnit2tthc FROM OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc WHERE ";
	private static final String _SQL_COUNT_OEPUSERMGTWORKINGUNIT2TTHC = "SELECT COUNT(oepUserMgtWorkingUnit2tthc) FROM OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc";
	private static final String _SQL_COUNT_OEPUSERMGTWORKINGUNIT2TTHC_WHERE = "SELECT COUNT(oepUserMgtWorkingUnit2tthc) FROM OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "oepUserMgtWorkingUnit2tthc.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No OEPUserMgtWorkingUnit2tthc exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No OEPUserMgtWorkingUnit2tthc exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(OEPUserMgtWorkingUnit2tthcPersistenceImpl.class);
	private static OEPUserMgtWorkingUnit2tthc _nullOEPUserMgtWorkingUnit2tthc = new OEPUserMgtWorkingUnit2tthcImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<OEPUserMgtWorkingUnit2tthc> toCacheModel() {
				return _nullOEPUserMgtWorkingUnit2tthcCacheModel;
			}
		};

	private static CacheModel<OEPUserMgtWorkingUnit2tthc> _nullOEPUserMgtWorkingUnit2tthcCacheModel =
		new CacheModel<OEPUserMgtWorkingUnit2tthc>() {
			@Override
			public OEPUserMgtWorkingUnit2tthc toEntityModel() {
				return _nullOEPUserMgtWorkingUnit2tthc;
			}
		};
}