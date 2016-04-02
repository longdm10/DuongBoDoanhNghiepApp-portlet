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

package vn.dtt.duongbien.dao.vrcb.service.persistence;

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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryUnitGeneralException;
import vn.dtt.duongbien.dao.vrcb.model.DmHistoryUnitGeneral;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryUnitGeneralImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryUnitGeneralModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dm history unit general service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmHistoryUnitGeneralPersistence
 * @see DmHistoryUnitGeneralUtil
 * @generated
 */
public class DmHistoryUnitGeneralPersistenceImpl extends BasePersistenceImpl<DmHistoryUnitGeneral>
	implements DmHistoryUnitGeneralPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmHistoryUnitGeneralUtil} to access the dm history unit general persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmHistoryUnitGeneralImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmHistoryUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryUnitGeneralModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryUnitGeneralImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmHistoryUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryUnitGeneralModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryUnitGeneralImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmHistoryUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryUnitGeneralModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UNITCODE = new FinderPath(DmHistoryUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryUnitGeneralModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryUnitGeneralImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUnitCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UNITCODE =
		new FinderPath(DmHistoryUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryUnitGeneralModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryUnitGeneralImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUnitCode",
			new String[] { String.class.getName() },
			DmHistoryUnitGeneralModelImpl.UNITCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UNITCODE = new FinderPath(DmHistoryUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryUnitGeneralModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUnitCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the dm history unit generals where unitCode = &#63;.
	 *
	 * @param unitCode the unit code
	 * @return the matching dm history unit generals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryUnitGeneral> findByUnitCode(String unitCode)
		throws SystemException {
		return findByUnitCode(unitCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the dm history unit generals where unitCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryUnitGeneralModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param unitCode the unit code
	 * @param start the lower bound of the range of dm history unit generals
	 * @param end the upper bound of the range of dm history unit generals (not inclusive)
	 * @return the range of matching dm history unit generals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryUnitGeneral> findByUnitCode(String unitCode,
		int start, int end) throws SystemException {
		return findByUnitCode(unitCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history unit generals where unitCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryUnitGeneralModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param unitCode the unit code
	 * @param start the lower bound of the range of dm history unit generals
	 * @param end the upper bound of the range of dm history unit generals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm history unit generals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryUnitGeneral> findByUnitCode(String unitCode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UNITCODE;
			finderArgs = new Object[] { unitCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UNITCODE;
			finderArgs = new Object[] { unitCode, start, end, orderByComparator };
		}

		List<DmHistoryUnitGeneral> list = (List<DmHistoryUnitGeneral>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmHistoryUnitGeneral dmHistoryUnitGeneral : list) {
				if (!Validator.equals(unitCode,
							dmHistoryUnitGeneral.getUnitCode())) {
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

			query.append(_SQL_SELECT_DMHISTORYUNITGENERAL_WHERE);

			boolean bindUnitCode = false;

			if (unitCode == null) {
				query.append(_FINDER_COLUMN_UNITCODE_UNITCODE_1);
			}
			else if (unitCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UNITCODE_UNITCODE_3);
			}
			else {
				bindUnitCode = true;

				query.append(_FINDER_COLUMN_UNITCODE_UNITCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DmHistoryUnitGeneralModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUnitCode) {
					qPos.add(unitCode);
				}

				if (!pagination) {
					list = (List<DmHistoryUnitGeneral>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmHistoryUnitGeneral>(list);
				}
				else {
					list = (List<DmHistoryUnitGeneral>)QueryUtil.list(q,
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
	 * Returns the first dm history unit general in the ordered set where unitCode = &#63;.
	 *
	 * @param unitCode the unit code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm history unit general
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryUnitGeneralException if a matching dm history unit general could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryUnitGeneral findByUnitCode_First(String unitCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmHistoryUnitGeneralException, SystemException {
		DmHistoryUnitGeneral dmHistoryUnitGeneral = fetchByUnitCode_First(unitCode,
				orderByComparator);

		if (dmHistoryUnitGeneral != null) {
			return dmHistoryUnitGeneral;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("unitCode=");
		msg.append(unitCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmHistoryUnitGeneralException(msg.toString());
	}

	/**
	 * Returns the first dm history unit general in the ordered set where unitCode = &#63;.
	 *
	 * @param unitCode the unit code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm history unit general, or <code>null</code> if a matching dm history unit general could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryUnitGeneral fetchByUnitCode_First(String unitCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<DmHistoryUnitGeneral> list = findByUnitCode(unitCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm history unit general in the ordered set where unitCode = &#63;.
	 *
	 * @param unitCode the unit code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm history unit general
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryUnitGeneralException if a matching dm history unit general could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryUnitGeneral findByUnitCode_Last(String unitCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmHistoryUnitGeneralException, SystemException {
		DmHistoryUnitGeneral dmHistoryUnitGeneral = fetchByUnitCode_Last(unitCode,
				orderByComparator);

		if (dmHistoryUnitGeneral != null) {
			return dmHistoryUnitGeneral;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("unitCode=");
		msg.append(unitCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmHistoryUnitGeneralException(msg.toString());
	}

	/**
	 * Returns the last dm history unit general in the ordered set where unitCode = &#63;.
	 *
	 * @param unitCode the unit code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm history unit general, or <code>null</code> if a matching dm history unit general could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryUnitGeneral fetchByUnitCode_Last(String unitCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUnitCode(unitCode);

		if (count == 0) {
			return null;
		}

		List<DmHistoryUnitGeneral> list = findByUnitCode(unitCode, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm history unit generals before and after the current dm history unit general in the ordered set where unitCode = &#63;.
	 *
	 * @param id the primary key of the current dm history unit general
	 * @param unitCode the unit code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm history unit general
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryUnitGeneralException if a dm history unit general with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryUnitGeneral[] findByUnitCode_PrevAndNext(int id,
		String unitCode, OrderByComparator orderByComparator)
		throws NoSuchDmHistoryUnitGeneralException, SystemException {
		DmHistoryUnitGeneral dmHistoryUnitGeneral = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmHistoryUnitGeneral[] array = new DmHistoryUnitGeneralImpl[3];

			array[0] = getByUnitCode_PrevAndNext(session, dmHistoryUnitGeneral,
					unitCode, orderByComparator, true);

			array[1] = dmHistoryUnitGeneral;

			array[2] = getByUnitCode_PrevAndNext(session, dmHistoryUnitGeneral,
					unitCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmHistoryUnitGeneral getByUnitCode_PrevAndNext(Session session,
		DmHistoryUnitGeneral dmHistoryUnitGeneral, String unitCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMHISTORYUNITGENERAL_WHERE);

		boolean bindUnitCode = false;

		if (unitCode == null) {
			query.append(_FINDER_COLUMN_UNITCODE_UNITCODE_1);
		}
		else if (unitCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UNITCODE_UNITCODE_3);
		}
		else {
			bindUnitCode = true;

			query.append(_FINDER_COLUMN_UNITCODE_UNITCODE_2);
		}

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
			query.append(DmHistoryUnitGeneralModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUnitCode) {
			qPos.add(unitCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmHistoryUnitGeneral);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmHistoryUnitGeneral> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm history unit generals where unitCode = &#63; from the database.
	 *
	 * @param unitCode the unit code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUnitCode(String unitCode) throws SystemException {
		for (DmHistoryUnitGeneral dmHistoryUnitGeneral : findByUnitCode(
				unitCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dmHistoryUnitGeneral);
		}
	}

	/**
	 * Returns the number of dm history unit generals where unitCode = &#63;.
	 *
	 * @param unitCode the unit code
	 * @return the number of matching dm history unit generals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUnitCode(String unitCode) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UNITCODE;

		Object[] finderArgs = new Object[] { unitCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMHISTORYUNITGENERAL_WHERE);

			boolean bindUnitCode = false;

			if (unitCode == null) {
				query.append(_FINDER_COLUMN_UNITCODE_UNITCODE_1);
			}
			else if (unitCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UNITCODE_UNITCODE_3);
			}
			else {
				bindUnitCode = true;

				query.append(_FINDER_COLUMN_UNITCODE_UNITCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUnitCode) {
					qPos.add(unitCode);
				}

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

	private static final String _FINDER_COLUMN_UNITCODE_UNITCODE_1 = "dmHistoryUnitGeneral.unitCode IS NULL";
	private static final String _FINDER_COLUMN_UNITCODE_UNITCODE_2 = "dmHistoryUnitGeneral.unitCode = ?";
	private static final String _FINDER_COLUMN_UNITCODE_UNITCODE_3 = "(dmHistoryUnitGeneral.unitCode IS NULL OR dmHistoryUnitGeneral.unitCode = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UNITCODEANDSYNCVERSION = new FinderPath(DmHistoryUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryUnitGeneralModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryUnitGeneralImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByUnitCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() },
			DmHistoryUnitGeneralModelImpl.UNITCODE_COLUMN_BITMASK |
			DmHistoryUnitGeneralModelImpl.SYNCVERSION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UNITCODEANDSYNCVERSION = new FinderPath(DmHistoryUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryUnitGeneralModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByUnitCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns the dm history unit general where unitCode = &#63; and syncVersion = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryUnitGeneralException} if it could not be found.
	 *
	 * @param unitCode the unit code
	 * @param syncVersion the sync version
	 * @return the matching dm history unit general
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryUnitGeneralException if a matching dm history unit general could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryUnitGeneral findByUnitCodeAndSyncVersion(String unitCode,
		String syncVersion)
		throws NoSuchDmHistoryUnitGeneralException, SystemException {
		DmHistoryUnitGeneral dmHistoryUnitGeneral = fetchByUnitCodeAndSyncVersion(unitCode,
				syncVersion);

		if (dmHistoryUnitGeneral == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("unitCode=");
			msg.append(unitCode);

			msg.append(", syncVersion=");
			msg.append(syncVersion);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmHistoryUnitGeneralException(msg.toString());
		}

		return dmHistoryUnitGeneral;
	}

	/**
	 * Returns the dm history unit general where unitCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param unitCode the unit code
	 * @param syncVersion the sync version
	 * @return the matching dm history unit general, or <code>null</code> if a matching dm history unit general could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryUnitGeneral fetchByUnitCodeAndSyncVersion(String unitCode,
		String syncVersion) throws SystemException {
		return fetchByUnitCodeAndSyncVersion(unitCode, syncVersion, true);
	}

	/**
	 * Returns the dm history unit general where unitCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param unitCode the unit code
	 * @param syncVersion the sync version
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm history unit general, or <code>null</code> if a matching dm history unit general could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryUnitGeneral fetchByUnitCodeAndSyncVersion(String unitCode,
		String syncVersion, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { unitCode, syncVersion };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UNITCODEANDSYNCVERSION,
					finderArgs, this);
		}

		if (result instanceof DmHistoryUnitGeneral) {
			DmHistoryUnitGeneral dmHistoryUnitGeneral = (DmHistoryUnitGeneral)result;

			if (!Validator.equals(unitCode, dmHistoryUnitGeneral.getUnitCode()) ||
					!Validator.equals(syncVersion,
						dmHistoryUnitGeneral.getSyncVersion())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DMHISTORYUNITGENERAL_WHERE);

			boolean bindUnitCode = false;

			if (unitCode == null) {
				query.append(_FINDER_COLUMN_UNITCODEANDSYNCVERSION_UNITCODE_1);
			}
			else if (unitCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UNITCODEANDSYNCVERSION_UNITCODE_3);
			}
			else {
				bindUnitCode = true;

				query.append(_FINDER_COLUMN_UNITCODEANDSYNCVERSION_UNITCODE_2);
			}

			boolean bindSyncVersion = false;

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_UNITCODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else if (syncVersion.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UNITCODEANDSYNCVERSION_SYNCVERSION_3);
			}
			else {
				bindSyncVersion = true;

				query.append(_FINDER_COLUMN_UNITCODEANDSYNCVERSION_SYNCVERSION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUnitCode) {
					qPos.add(unitCode);
				}

				if (bindSyncVersion) {
					qPos.add(syncVersion);
				}

				List<DmHistoryUnitGeneral> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UNITCODEANDSYNCVERSION,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DmHistoryUnitGeneralPersistenceImpl.fetchByUnitCodeAndSyncVersion(String, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DmHistoryUnitGeneral dmHistoryUnitGeneral = list.get(0);

					result = dmHistoryUnitGeneral;

					cacheResult(dmHistoryUnitGeneral);

					if ((dmHistoryUnitGeneral.getUnitCode() == null) ||
							!dmHistoryUnitGeneral.getUnitCode().equals(unitCode) ||
							(dmHistoryUnitGeneral.getSyncVersion() == null) ||
							!dmHistoryUnitGeneral.getSyncVersion()
													 .equals(syncVersion)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UNITCODEANDSYNCVERSION,
							finderArgs, dmHistoryUnitGeneral);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UNITCODEANDSYNCVERSION,
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
			return (DmHistoryUnitGeneral)result;
		}
	}

	/**
	 * Removes the dm history unit general where unitCode = &#63; and syncVersion = &#63; from the database.
	 *
	 * @param unitCode the unit code
	 * @param syncVersion the sync version
	 * @return the dm history unit general that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryUnitGeneral removeByUnitCodeAndSyncVersion(
		String unitCode, String syncVersion)
		throws NoSuchDmHistoryUnitGeneralException, SystemException {
		DmHistoryUnitGeneral dmHistoryUnitGeneral = findByUnitCodeAndSyncVersion(unitCode,
				syncVersion);

		return remove(dmHistoryUnitGeneral);
	}

	/**
	 * Returns the number of dm history unit generals where unitCode = &#63; and syncVersion = &#63;.
	 *
	 * @param unitCode the unit code
	 * @param syncVersion the sync version
	 * @return the number of matching dm history unit generals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUnitCodeAndSyncVersion(String unitCode, String syncVersion)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UNITCODEANDSYNCVERSION;

		Object[] finderArgs = new Object[] { unitCode, syncVersion };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMHISTORYUNITGENERAL_WHERE);

			boolean bindUnitCode = false;

			if (unitCode == null) {
				query.append(_FINDER_COLUMN_UNITCODEANDSYNCVERSION_UNITCODE_1);
			}
			else if (unitCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UNITCODEANDSYNCVERSION_UNITCODE_3);
			}
			else {
				bindUnitCode = true;

				query.append(_FINDER_COLUMN_UNITCODEANDSYNCVERSION_UNITCODE_2);
			}

			boolean bindSyncVersion = false;

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_UNITCODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else if (syncVersion.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UNITCODEANDSYNCVERSION_SYNCVERSION_3);
			}
			else {
				bindSyncVersion = true;

				query.append(_FINDER_COLUMN_UNITCODEANDSYNCVERSION_SYNCVERSION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUnitCode) {
					qPos.add(unitCode);
				}

				if (bindSyncVersion) {
					qPos.add(syncVersion);
				}

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

	private static final String _FINDER_COLUMN_UNITCODEANDSYNCVERSION_UNITCODE_1 =
		"dmHistoryUnitGeneral.unitCode IS NULL AND ";
	private static final String _FINDER_COLUMN_UNITCODEANDSYNCVERSION_UNITCODE_2 =
		"dmHistoryUnitGeneral.unitCode = ? AND ";
	private static final String _FINDER_COLUMN_UNITCODEANDSYNCVERSION_UNITCODE_3 =
		"(dmHistoryUnitGeneral.unitCode IS NULL OR dmHistoryUnitGeneral.unitCode = '') AND ";
	private static final String _FINDER_COLUMN_UNITCODEANDSYNCVERSION_SYNCVERSION_1 =
		"dmHistoryUnitGeneral.syncVersion IS NULL";
	private static final String _FINDER_COLUMN_UNITCODEANDSYNCVERSION_SYNCVERSION_2 =
		"dmHistoryUnitGeneral.syncVersion = ?";
	private static final String _FINDER_COLUMN_UNITCODEANDSYNCVERSION_SYNCVERSION_3 =
		"(dmHistoryUnitGeneral.syncVersion IS NULL OR dmHistoryUnitGeneral.syncVersion = '')";

	public DmHistoryUnitGeneralPersistenceImpl() {
		setModelClass(DmHistoryUnitGeneral.class);
	}

	/**
	 * Caches the dm history unit general in the entity cache if it is enabled.
	 *
	 * @param dmHistoryUnitGeneral the dm history unit general
	 */
	@Override
	public void cacheResult(DmHistoryUnitGeneral dmHistoryUnitGeneral) {
		EntityCacheUtil.putResult(DmHistoryUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryUnitGeneralImpl.class,
			dmHistoryUnitGeneral.getPrimaryKey(), dmHistoryUnitGeneral);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UNITCODEANDSYNCVERSION,
			new Object[] {
				dmHistoryUnitGeneral.getUnitCode(),
				dmHistoryUnitGeneral.getSyncVersion()
			}, dmHistoryUnitGeneral);

		dmHistoryUnitGeneral.resetOriginalValues();
	}

	/**
	 * Caches the dm history unit generals in the entity cache if it is enabled.
	 *
	 * @param dmHistoryUnitGenerals the dm history unit generals
	 */
	@Override
	public void cacheResult(List<DmHistoryUnitGeneral> dmHistoryUnitGenerals) {
		for (DmHistoryUnitGeneral dmHistoryUnitGeneral : dmHistoryUnitGenerals) {
			if (EntityCacheUtil.getResult(
						DmHistoryUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryUnitGeneralImpl.class,
						dmHistoryUnitGeneral.getPrimaryKey()) == null) {
				cacheResult(dmHistoryUnitGeneral);
			}
			else {
				dmHistoryUnitGeneral.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm history unit generals.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmHistoryUnitGeneralImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmHistoryUnitGeneralImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm history unit general.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmHistoryUnitGeneral dmHistoryUnitGeneral) {
		EntityCacheUtil.removeResult(DmHistoryUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryUnitGeneralImpl.class, dmHistoryUnitGeneral.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(dmHistoryUnitGeneral);
	}

	@Override
	public void clearCache(List<DmHistoryUnitGeneral> dmHistoryUnitGenerals) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmHistoryUnitGeneral dmHistoryUnitGeneral : dmHistoryUnitGenerals) {
			EntityCacheUtil.removeResult(DmHistoryUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryUnitGeneralImpl.class,
				dmHistoryUnitGeneral.getPrimaryKey());

			clearUniqueFindersCache(dmHistoryUnitGeneral);
		}
	}

	protected void cacheUniqueFindersCache(
		DmHistoryUnitGeneral dmHistoryUnitGeneral) {
		if (dmHistoryUnitGeneral.isNew()) {
			Object[] args = new Object[] {
					dmHistoryUnitGeneral.getUnitCode(),
					dmHistoryUnitGeneral.getSyncVersion()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UNITCODEANDSYNCVERSION,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UNITCODEANDSYNCVERSION,
				args, dmHistoryUnitGeneral);
		}
		else {
			DmHistoryUnitGeneralModelImpl dmHistoryUnitGeneralModelImpl = (DmHistoryUnitGeneralModelImpl)dmHistoryUnitGeneral;

			if ((dmHistoryUnitGeneralModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_UNITCODEANDSYNCVERSION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryUnitGeneral.getUnitCode(),
						dmHistoryUnitGeneral.getSyncVersion()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UNITCODEANDSYNCVERSION,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UNITCODEANDSYNCVERSION,
					args, dmHistoryUnitGeneral);
			}
		}
	}

	protected void clearUniqueFindersCache(
		DmHistoryUnitGeneral dmHistoryUnitGeneral) {
		DmHistoryUnitGeneralModelImpl dmHistoryUnitGeneralModelImpl = (DmHistoryUnitGeneralModelImpl)dmHistoryUnitGeneral;

		Object[] args = new Object[] {
				dmHistoryUnitGeneral.getUnitCode(),
				dmHistoryUnitGeneral.getSyncVersion()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UNITCODEANDSYNCVERSION,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UNITCODEANDSYNCVERSION,
			args);

		if ((dmHistoryUnitGeneralModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UNITCODEANDSYNCVERSION.getColumnBitmask()) != 0) {
			args = new Object[] {
					dmHistoryUnitGeneralModelImpl.getOriginalUnitCode(),
					dmHistoryUnitGeneralModelImpl.getOriginalSyncVersion()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UNITCODEANDSYNCVERSION,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UNITCODEANDSYNCVERSION,
				args);
		}
	}

	/**
	 * Creates a new dm history unit general with the primary key. Does not add the dm history unit general to the database.
	 *
	 * @param id the primary key for the new dm history unit general
	 * @return the new dm history unit general
	 */
	@Override
	public DmHistoryUnitGeneral create(int id) {
		DmHistoryUnitGeneral dmHistoryUnitGeneral = new DmHistoryUnitGeneralImpl();

		dmHistoryUnitGeneral.setNew(true);
		dmHistoryUnitGeneral.setPrimaryKey(id);

		return dmHistoryUnitGeneral;
	}

	/**
	 * Removes the dm history unit general with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm history unit general
	 * @return the dm history unit general that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryUnitGeneralException if a dm history unit general with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryUnitGeneral remove(int id)
		throws NoSuchDmHistoryUnitGeneralException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the dm history unit general with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm history unit general
	 * @return the dm history unit general that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryUnitGeneralException if a dm history unit general with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryUnitGeneral remove(Serializable primaryKey)
		throws NoSuchDmHistoryUnitGeneralException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmHistoryUnitGeneral dmHistoryUnitGeneral = (DmHistoryUnitGeneral)session.get(DmHistoryUnitGeneralImpl.class,
					primaryKey);

			if (dmHistoryUnitGeneral == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmHistoryUnitGeneralException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmHistoryUnitGeneral);
		}
		catch (NoSuchDmHistoryUnitGeneralException nsee) {
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
	protected DmHistoryUnitGeneral removeImpl(
		DmHistoryUnitGeneral dmHistoryUnitGeneral) throws SystemException {
		dmHistoryUnitGeneral = toUnwrappedModel(dmHistoryUnitGeneral);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dmHistoryUnitGeneral)) {
				dmHistoryUnitGeneral = (DmHistoryUnitGeneral)session.get(DmHistoryUnitGeneralImpl.class,
						dmHistoryUnitGeneral.getPrimaryKeyObj());
			}

			if (dmHistoryUnitGeneral != null) {
				session.delete(dmHistoryUnitGeneral);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dmHistoryUnitGeneral != null) {
			clearCache(dmHistoryUnitGeneral);
		}

		return dmHistoryUnitGeneral;
	}

	@Override
	public DmHistoryUnitGeneral updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryUnitGeneral dmHistoryUnitGeneral)
		throws SystemException {
		dmHistoryUnitGeneral = toUnwrappedModel(dmHistoryUnitGeneral);

		boolean isNew = dmHistoryUnitGeneral.isNew();

		DmHistoryUnitGeneralModelImpl dmHistoryUnitGeneralModelImpl = (DmHistoryUnitGeneralModelImpl)dmHistoryUnitGeneral;

		Session session = null;

		try {
			session = openSession();

			if (dmHistoryUnitGeneral.isNew()) {
				session.save(dmHistoryUnitGeneral);

				dmHistoryUnitGeneral.setNew(false);
			}
			else {
				session.merge(dmHistoryUnitGeneral);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmHistoryUnitGeneralModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmHistoryUnitGeneralModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UNITCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryUnitGeneralModelImpl.getOriginalUnitCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UNITCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UNITCODE,
					args);

				args = new Object[] { dmHistoryUnitGeneralModelImpl.getUnitCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UNITCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UNITCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmHistoryUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryUnitGeneralImpl.class,
			dmHistoryUnitGeneral.getPrimaryKey(), dmHistoryUnitGeneral);

		clearUniqueFindersCache(dmHistoryUnitGeneral);
		cacheUniqueFindersCache(dmHistoryUnitGeneral);

		return dmHistoryUnitGeneral;
	}

	protected DmHistoryUnitGeneral toUnwrappedModel(
		DmHistoryUnitGeneral dmHistoryUnitGeneral) {
		if (dmHistoryUnitGeneral instanceof DmHistoryUnitGeneralImpl) {
			return dmHistoryUnitGeneral;
		}

		DmHistoryUnitGeneralImpl dmHistoryUnitGeneralImpl = new DmHistoryUnitGeneralImpl();

		dmHistoryUnitGeneralImpl.setNew(dmHistoryUnitGeneral.isNew());
		dmHistoryUnitGeneralImpl.setPrimaryKey(dmHistoryUnitGeneral.getPrimaryKey());

		dmHistoryUnitGeneralImpl.setId(dmHistoryUnitGeneral.getId());
		dmHistoryUnitGeneralImpl.setUnitCode(dmHistoryUnitGeneral.getUnitCode());
		dmHistoryUnitGeneralImpl.setUnitName(dmHistoryUnitGeneral.getUnitName());
		dmHistoryUnitGeneralImpl.setIsDelete(dmHistoryUnitGeneral.getIsDelete());
		dmHistoryUnitGeneralImpl.setMarkedAsDelete(dmHistoryUnitGeneral.getMarkedAsDelete());
		dmHistoryUnitGeneralImpl.setModifiedDate(dmHistoryUnitGeneral.getModifiedDate());
		dmHistoryUnitGeneralImpl.setRequestedDate(dmHistoryUnitGeneral.getRequestedDate());
		dmHistoryUnitGeneralImpl.setSyncVersion(dmHistoryUnitGeneral.getSyncVersion());

		return dmHistoryUnitGeneralImpl;
	}

	/**
	 * Returns the dm history unit general with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history unit general
	 * @return the dm history unit general
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryUnitGeneralException if a dm history unit general with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryUnitGeneral findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDmHistoryUnitGeneralException, SystemException {
		DmHistoryUnitGeneral dmHistoryUnitGeneral = fetchByPrimaryKey(primaryKey);

		if (dmHistoryUnitGeneral == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDmHistoryUnitGeneralException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dmHistoryUnitGeneral;
	}

	/**
	 * Returns the dm history unit general with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryUnitGeneralException} if it could not be found.
	 *
	 * @param id the primary key of the dm history unit general
	 * @return the dm history unit general
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryUnitGeneralException if a dm history unit general with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryUnitGeneral findByPrimaryKey(int id)
		throws NoSuchDmHistoryUnitGeneralException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dm history unit general with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history unit general
	 * @return the dm history unit general, or <code>null</code> if a dm history unit general with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryUnitGeneral fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DmHistoryUnitGeneral dmHistoryUnitGeneral = (DmHistoryUnitGeneral)EntityCacheUtil.getResult(DmHistoryUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryUnitGeneralImpl.class, primaryKey);

		if (dmHistoryUnitGeneral == _nullDmHistoryUnitGeneral) {
			return null;
		}

		if (dmHistoryUnitGeneral == null) {
			Session session = null;

			try {
				session = openSession();

				dmHistoryUnitGeneral = (DmHistoryUnitGeneral)session.get(DmHistoryUnitGeneralImpl.class,
						primaryKey);

				if (dmHistoryUnitGeneral != null) {
					cacheResult(dmHistoryUnitGeneral);
				}
				else {
					EntityCacheUtil.putResult(DmHistoryUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryUnitGeneralImpl.class, primaryKey,
						_nullDmHistoryUnitGeneral);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DmHistoryUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
					DmHistoryUnitGeneralImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dmHistoryUnitGeneral;
	}

	/**
	 * Returns the dm history unit general with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm history unit general
	 * @return the dm history unit general, or <code>null</code> if a dm history unit general with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryUnitGeneral fetchByPrimaryKey(int id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the dm history unit generals.
	 *
	 * @return the dm history unit generals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryUnitGeneral> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history unit generals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryUnitGeneralModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history unit generals
	 * @param end the upper bound of the range of dm history unit generals (not inclusive)
	 * @return the range of dm history unit generals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryUnitGeneral> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history unit generals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryUnitGeneralModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history unit generals
	 * @param end the upper bound of the range of dm history unit generals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm history unit generals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryUnitGeneral> findAll(int start, int end,
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

		List<DmHistoryUnitGeneral> list = (List<DmHistoryUnitGeneral>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMHISTORYUNITGENERAL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMHISTORYUNITGENERAL;

				if (pagination) {
					sql = sql.concat(DmHistoryUnitGeneralModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DmHistoryUnitGeneral>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmHistoryUnitGeneral>(list);
				}
				else {
					list = (List<DmHistoryUnitGeneral>)QueryUtil.list(q,
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
	 * Removes all the dm history unit generals from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DmHistoryUnitGeneral dmHistoryUnitGeneral : findAll()) {
			remove(dmHistoryUnitGeneral);
		}
	}

	/**
	 * Returns the number of dm history unit generals.
	 *
	 * @return the number of dm history unit generals
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

				Query q = session.createQuery(_SQL_COUNT_DMHISTORYUNITGENERAL);

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

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the dm history unit general persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.DmHistoryUnitGeneral")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmHistoryUnitGeneral>> listenersList = new ArrayList<ModelListener<DmHistoryUnitGeneral>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmHistoryUnitGeneral>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmHistoryUnitGeneralImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DMHISTORYUNITGENERAL = "SELECT dmHistoryUnitGeneral FROM DmHistoryUnitGeneral dmHistoryUnitGeneral";
	private static final String _SQL_SELECT_DMHISTORYUNITGENERAL_WHERE = "SELECT dmHistoryUnitGeneral FROM DmHistoryUnitGeneral dmHistoryUnitGeneral WHERE ";
	private static final String _SQL_COUNT_DMHISTORYUNITGENERAL = "SELECT COUNT(dmHistoryUnitGeneral) FROM DmHistoryUnitGeneral dmHistoryUnitGeneral";
	private static final String _SQL_COUNT_DMHISTORYUNITGENERAL_WHERE = "SELECT COUNT(dmHistoryUnitGeneral) FROM DmHistoryUnitGeneral dmHistoryUnitGeneral WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmHistoryUnitGeneral.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmHistoryUnitGeneral exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmHistoryUnitGeneral exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmHistoryUnitGeneralPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"unitCode", "unitName", "isDelete", "markedAsDelete",
				"modifiedDate", "requestedDate", "syncVersion"
			});
	private static DmHistoryUnitGeneral _nullDmHistoryUnitGeneral = new DmHistoryUnitGeneralImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmHistoryUnitGeneral> toCacheModel() {
				return _nullDmHistoryUnitGeneralCacheModel;
			}
		};

	private static CacheModel<DmHistoryUnitGeneral> _nullDmHistoryUnitGeneralCacheModel =
		new CacheModel<DmHistoryUnitGeneral>() {
			@Override
			public DmHistoryUnitGeneral toEntityModel() {
				return _nullDmHistoryUnitGeneral;
			}
		};
}