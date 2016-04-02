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

import vn.dtt.duongbien.dao.vrcb.NoSuchDmUnitGeneralException;
import vn.dtt.duongbien.dao.vrcb.model.DmUnitGeneral;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmUnitGeneralImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmUnitGeneralModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dm unit general service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmUnitGeneralPersistence
 * @see DmUnitGeneralUtil
 * @generated
 */
public class DmUnitGeneralPersistenceImpl extends BasePersistenceImpl<DmUnitGeneral>
	implements DmUnitGeneralPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmUnitGeneralUtil} to access the dm unit general persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmUnitGeneralImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
			DmUnitGeneralModelImpl.FINDER_CACHE_ENABLED,
			DmUnitGeneralImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
			DmUnitGeneralModelImpl.FINDER_CACHE_ENABLED,
			DmUnitGeneralImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
			DmUnitGeneralModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UNITCODE = new FinderPath(DmUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
			DmUnitGeneralModelImpl.FINDER_CACHE_ENABLED,
			DmUnitGeneralImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUnitCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UNITCODE =
		new FinderPath(DmUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
			DmUnitGeneralModelImpl.FINDER_CACHE_ENABLED,
			DmUnitGeneralImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByUnitCode", new String[] { String.class.getName() },
			DmUnitGeneralModelImpl.UNITCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UNITCODE = new FinderPath(DmUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
			DmUnitGeneralModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUnitCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the dm unit generals where unitCode = &#63;.
	 *
	 * @param unitCode the unit code
	 * @return the matching dm unit generals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmUnitGeneral> findByUnitCode(String unitCode)
		throws SystemException {
		return findByUnitCode(unitCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the dm unit generals where unitCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmUnitGeneralModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param unitCode the unit code
	 * @param start the lower bound of the range of dm unit generals
	 * @param end the upper bound of the range of dm unit generals (not inclusive)
	 * @return the range of matching dm unit generals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmUnitGeneral> findByUnitCode(String unitCode, int start,
		int end) throws SystemException {
		return findByUnitCode(unitCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm unit generals where unitCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmUnitGeneralModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param unitCode the unit code
	 * @param start the lower bound of the range of dm unit generals
	 * @param end the upper bound of the range of dm unit generals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm unit generals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmUnitGeneral> findByUnitCode(String unitCode, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
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

		List<DmUnitGeneral> list = (List<DmUnitGeneral>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmUnitGeneral dmUnitGeneral : list) {
				if (!Validator.equals(unitCode, dmUnitGeneral.getUnitCode())) {
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

			query.append(_SQL_SELECT_DMUNITGENERAL_WHERE);

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
				query.append(DmUnitGeneralModelImpl.ORDER_BY_JPQL);
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
					list = (List<DmUnitGeneral>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmUnitGeneral>(list);
				}
				else {
					list = (List<DmUnitGeneral>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first dm unit general in the ordered set where unitCode = &#63;.
	 *
	 * @param unitCode the unit code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm unit general
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmUnitGeneralException if a matching dm unit general could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmUnitGeneral findByUnitCode_First(String unitCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmUnitGeneralException, SystemException {
		DmUnitGeneral dmUnitGeneral = fetchByUnitCode_First(unitCode,
				orderByComparator);

		if (dmUnitGeneral != null) {
			return dmUnitGeneral;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("unitCode=");
		msg.append(unitCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmUnitGeneralException(msg.toString());
	}

	/**
	 * Returns the first dm unit general in the ordered set where unitCode = &#63;.
	 *
	 * @param unitCode the unit code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm unit general, or <code>null</code> if a matching dm unit general could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmUnitGeneral fetchByUnitCode_First(String unitCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<DmUnitGeneral> list = findByUnitCode(unitCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm unit general in the ordered set where unitCode = &#63;.
	 *
	 * @param unitCode the unit code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm unit general
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmUnitGeneralException if a matching dm unit general could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmUnitGeneral findByUnitCode_Last(String unitCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmUnitGeneralException, SystemException {
		DmUnitGeneral dmUnitGeneral = fetchByUnitCode_Last(unitCode,
				orderByComparator);

		if (dmUnitGeneral != null) {
			return dmUnitGeneral;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("unitCode=");
		msg.append(unitCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmUnitGeneralException(msg.toString());
	}

	/**
	 * Returns the last dm unit general in the ordered set where unitCode = &#63;.
	 *
	 * @param unitCode the unit code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm unit general, or <code>null</code> if a matching dm unit general could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmUnitGeneral fetchByUnitCode_Last(String unitCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUnitCode(unitCode);

		if (count == 0) {
			return null;
		}

		List<DmUnitGeneral> list = findByUnitCode(unitCode, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm unit generals before and after the current dm unit general in the ordered set where unitCode = &#63;.
	 *
	 * @param id the primary key of the current dm unit general
	 * @param unitCode the unit code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm unit general
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmUnitGeneralException if a dm unit general with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmUnitGeneral[] findByUnitCode_PrevAndNext(int id, String unitCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmUnitGeneralException, SystemException {
		DmUnitGeneral dmUnitGeneral = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmUnitGeneral[] array = new DmUnitGeneralImpl[3];

			array[0] = getByUnitCode_PrevAndNext(session, dmUnitGeneral,
					unitCode, orderByComparator, true);

			array[1] = dmUnitGeneral;

			array[2] = getByUnitCode_PrevAndNext(session, dmUnitGeneral,
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

	protected DmUnitGeneral getByUnitCode_PrevAndNext(Session session,
		DmUnitGeneral dmUnitGeneral, String unitCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMUNITGENERAL_WHERE);

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
			query.append(DmUnitGeneralModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(dmUnitGeneral);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmUnitGeneral> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm unit generals where unitCode = &#63; from the database.
	 *
	 * @param unitCode the unit code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUnitCode(String unitCode) throws SystemException {
		for (DmUnitGeneral dmUnitGeneral : findByUnitCode(unitCode,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dmUnitGeneral);
		}
	}

	/**
	 * Returns the number of dm unit generals where unitCode = &#63;.
	 *
	 * @param unitCode the unit code
	 * @return the number of matching dm unit generals
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

			query.append(_SQL_COUNT_DMUNITGENERAL_WHERE);

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

	private static final String _FINDER_COLUMN_UNITCODE_UNITCODE_1 = "dmUnitGeneral.unitCode IS NULL";
	private static final String _FINDER_COLUMN_UNITCODE_UNITCODE_2 = "dmUnitGeneral.unitCode = ?";
	private static final String _FINDER_COLUMN_UNITCODE_UNITCODE_3 = "(dmUnitGeneral.unitCode IS NULL OR dmUnitGeneral.unitCode = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UNITCODEANDSYNCVERSION = new FinderPath(DmUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
			DmUnitGeneralModelImpl.FINDER_CACHE_ENABLED,
			DmUnitGeneralImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByUnitCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() },
			DmUnitGeneralModelImpl.UNITCODE_COLUMN_BITMASK |
			DmUnitGeneralModelImpl.SYNCVERSION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UNITCODEANDSYNCVERSION = new FinderPath(DmUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
			DmUnitGeneralModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByUnitCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns the dm unit general where unitCode = &#63; and syncVersion = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmUnitGeneralException} if it could not be found.
	 *
	 * @param unitCode the unit code
	 * @param syncVersion the sync version
	 * @return the matching dm unit general
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmUnitGeneralException if a matching dm unit general could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmUnitGeneral findByUnitCodeAndSyncVersion(String unitCode,
		String syncVersion)
		throws NoSuchDmUnitGeneralException, SystemException {
		DmUnitGeneral dmUnitGeneral = fetchByUnitCodeAndSyncVersion(unitCode,
				syncVersion);

		if (dmUnitGeneral == null) {
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

			throw new NoSuchDmUnitGeneralException(msg.toString());
		}

		return dmUnitGeneral;
	}

	/**
	 * Returns the dm unit general where unitCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param unitCode the unit code
	 * @param syncVersion the sync version
	 * @return the matching dm unit general, or <code>null</code> if a matching dm unit general could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmUnitGeneral fetchByUnitCodeAndSyncVersion(String unitCode,
		String syncVersion) throws SystemException {
		return fetchByUnitCodeAndSyncVersion(unitCode, syncVersion, true);
	}

	/**
	 * Returns the dm unit general where unitCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param unitCode the unit code
	 * @param syncVersion the sync version
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm unit general, or <code>null</code> if a matching dm unit general could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmUnitGeneral fetchByUnitCodeAndSyncVersion(String unitCode,
		String syncVersion, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { unitCode, syncVersion };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UNITCODEANDSYNCVERSION,
					finderArgs, this);
		}

		if (result instanceof DmUnitGeneral) {
			DmUnitGeneral dmUnitGeneral = (DmUnitGeneral)result;

			if (!Validator.equals(unitCode, dmUnitGeneral.getUnitCode()) ||
					!Validator.equals(syncVersion,
						dmUnitGeneral.getSyncVersion())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DMUNITGENERAL_WHERE);

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

				List<DmUnitGeneral> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UNITCODEANDSYNCVERSION,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DmUnitGeneralPersistenceImpl.fetchByUnitCodeAndSyncVersion(String, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DmUnitGeneral dmUnitGeneral = list.get(0);

					result = dmUnitGeneral;

					cacheResult(dmUnitGeneral);

					if ((dmUnitGeneral.getUnitCode() == null) ||
							!dmUnitGeneral.getUnitCode().equals(unitCode) ||
							(dmUnitGeneral.getSyncVersion() == null) ||
							!dmUnitGeneral.getSyncVersion().equals(syncVersion)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UNITCODEANDSYNCVERSION,
							finderArgs, dmUnitGeneral);
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
			return (DmUnitGeneral)result;
		}
	}

	/**
	 * Removes the dm unit general where unitCode = &#63; and syncVersion = &#63; from the database.
	 *
	 * @param unitCode the unit code
	 * @param syncVersion the sync version
	 * @return the dm unit general that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmUnitGeneral removeByUnitCodeAndSyncVersion(String unitCode,
		String syncVersion)
		throws NoSuchDmUnitGeneralException, SystemException {
		DmUnitGeneral dmUnitGeneral = findByUnitCodeAndSyncVersion(unitCode,
				syncVersion);

		return remove(dmUnitGeneral);
	}

	/**
	 * Returns the number of dm unit generals where unitCode = &#63; and syncVersion = &#63;.
	 *
	 * @param unitCode the unit code
	 * @param syncVersion the sync version
	 * @return the number of matching dm unit generals
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

			query.append(_SQL_COUNT_DMUNITGENERAL_WHERE);

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
		"dmUnitGeneral.unitCode IS NULL AND ";
	private static final String _FINDER_COLUMN_UNITCODEANDSYNCVERSION_UNITCODE_2 =
		"dmUnitGeneral.unitCode = ? AND ";
	private static final String _FINDER_COLUMN_UNITCODEANDSYNCVERSION_UNITCODE_3 =
		"(dmUnitGeneral.unitCode IS NULL OR dmUnitGeneral.unitCode = '') AND ";
	private static final String _FINDER_COLUMN_UNITCODEANDSYNCVERSION_SYNCVERSION_1 =
		"dmUnitGeneral.syncVersion IS NULL";
	private static final String _FINDER_COLUMN_UNITCODEANDSYNCVERSION_SYNCVERSION_2 =
		"dmUnitGeneral.syncVersion = ?";
	private static final String _FINDER_COLUMN_UNITCODEANDSYNCVERSION_SYNCVERSION_3 =
		"(dmUnitGeneral.syncVersion IS NULL OR dmUnitGeneral.syncVersion = '')";

	public DmUnitGeneralPersistenceImpl() {
		setModelClass(DmUnitGeneral.class);
	}

	/**
	 * Caches the dm unit general in the entity cache if it is enabled.
	 *
	 * @param dmUnitGeneral the dm unit general
	 */
	@Override
	public void cacheResult(DmUnitGeneral dmUnitGeneral) {
		EntityCacheUtil.putResult(DmUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
			DmUnitGeneralImpl.class, dmUnitGeneral.getPrimaryKey(),
			dmUnitGeneral);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UNITCODEANDSYNCVERSION,
			new Object[] {
				dmUnitGeneral.getUnitCode(), dmUnitGeneral.getSyncVersion()
			}, dmUnitGeneral);

		dmUnitGeneral.resetOriginalValues();
	}

	/**
	 * Caches the dm unit generals in the entity cache if it is enabled.
	 *
	 * @param dmUnitGenerals the dm unit generals
	 */
	@Override
	public void cacheResult(List<DmUnitGeneral> dmUnitGenerals) {
		for (DmUnitGeneral dmUnitGeneral : dmUnitGenerals) {
			if (EntityCacheUtil.getResult(
						DmUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
						DmUnitGeneralImpl.class, dmUnitGeneral.getPrimaryKey()) == null) {
				cacheResult(dmUnitGeneral);
			}
			else {
				dmUnitGeneral.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm unit generals.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmUnitGeneralImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmUnitGeneralImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm unit general.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmUnitGeneral dmUnitGeneral) {
		EntityCacheUtil.removeResult(DmUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
			DmUnitGeneralImpl.class, dmUnitGeneral.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(dmUnitGeneral);
	}

	@Override
	public void clearCache(List<DmUnitGeneral> dmUnitGenerals) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmUnitGeneral dmUnitGeneral : dmUnitGenerals) {
			EntityCacheUtil.removeResult(DmUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
				DmUnitGeneralImpl.class, dmUnitGeneral.getPrimaryKey());

			clearUniqueFindersCache(dmUnitGeneral);
		}
	}

	protected void cacheUniqueFindersCache(DmUnitGeneral dmUnitGeneral) {
		if (dmUnitGeneral.isNew()) {
			Object[] args = new Object[] {
					dmUnitGeneral.getUnitCode(), dmUnitGeneral.getSyncVersion()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UNITCODEANDSYNCVERSION,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UNITCODEANDSYNCVERSION,
				args, dmUnitGeneral);
		}
		else {
			DmUnitGeneralModelImpl dmUnitGeneralModelImpl = (DmUnitGeneralModelImpl)dmUnitGeneral;

			if ((dmUnitGeneralModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_UNITCODEANDSYNCVERSION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmUnitGeneral.getUnitCode(),
						dmUnitGeneral.getSyncVersion()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UNITCODEANDSYNCVERSION,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UNITCODEANDSYNCVERSION,
					args, dmUnitGeneral);
			}
		}
	}

	protected void clearUniqueFindersCache(DmUnitGeneral dmUnitGeneral) {
		DmUnitGeneralModelImpl dmUnitGeneralModelImpl = (DmUnitGeneralModelImpl)dmUnitGeneral;

		Object[] args = new Object[] {
				dmUnitGeneral.getUnitCode(), dmUnitGeneral.getSyncVersion()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UNITCODEANDSYNCVERSION,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UNITCODEANDSYNCVERSION,
			args);

		if ((dmUnitGeneralModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UNITCODEANDSYNCVERSION.getColumnBitmask()) != 0) {
			args = new Object[] {
					dmUnitGeneralModelImpl.getOriginalUnitCode(),
					dmUnitGeneralModelImpl.getOriginalSyncVersion()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UNITCODEANDSYNCVERSION,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UNITCODEANDSYNCVERSION,
				args);
		}
	}

	/**
	 * Creates a new dm unit general with the primary key. Does not add the dm unit general to the database.
	 *
	 * @param id the primary key for the new dm unit general
	 * @return the new dm unit general
	 */
	@Override
	public DmUnitGeneral create(int id) {
		DmUnitGeneral dmUnitGeneral = new DmUnitGeneralImpl();

		dmUnitGeneral.setNew(true);
		dmUnitGeneral.setPrimaryKey(id);

		return dmUnitGeneral;
	}

	/**
	 * Removes the dm unit general with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm unit general
	 * @return the dm unit general that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmUnitGeneralException if a dm unit general with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmUnitGeneral remove(int id)
		throws NoSuchDmUnitGeneralException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the dm unit general with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm unit general
	 * @return the dm unit general that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmUnitGeneralException if a dm unit general with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmUnitGeneral remove(Serializable primaryKey)
		throws NoSuchDmUnitGeneralException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmUnitGeneral dmUnitGeneral = (DmUnitGeneral)session.get(DmUnitGeneralImpl.class,
					primaryKey);

			if (dmUnitGeneral == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmUnitGeneralException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmUnitGeneral);
		}
		catch (NoSuchDmUnitGeneralException nsee) {
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
	protected DmUnitGeneral removeImpl(DmUnitGeneral dmUnitGeneral)
		throws SystemException {
		dmUnitGeneral = toUnwrappedModel(dmUnitGeneral);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dmUnitGeneral)) {
				dmUnitGeneral = (DmUnitGeneral)session.get(DmUnitGeneralImpl.class,
						dmUnitGeneral.getPrimaryKeyObj());
			}

			if (dmUnitGeneral != null) {
				session.delete(dmUnitGeneral);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dmUnitGeneral != null) {
			clearCache(dmUnitGeneral);
		}

		return dmUnitGeneral;
	}

	@Override
	public DmUnitGeneral updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmUnitGeneral dmUnitGeneral)
		throws SystemException {
		dmUnitGeneral = toUnwrappedModel(dmUnitGeneral);

		boolean isNew = dmUnitGeneral.isNew();

		DmUnitGeneralModelImpl dmUnitGeneralModelImpl = (DmUnitGeneralModelImpl)dmUnitGeneral;

		Session session = null;

		try {
			session = openSession();

			if (dmUnitGeneral.isNew()) {
				session.save(dmUnitGeneral);

				dmUnitGeneral.setNew(false);
			}
			else {
				session.merge(dmUnitGeneral);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmUnitGeneralModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmUnitGeneralModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UNITCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmUnitGeneralModelImpl.getOriginalUnitCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UNITCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UNITCODE,
					args);

				args = new Object[] { dmUnitGeneralModelImpl.getUnitCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UNITCODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UNITCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
			DmUnitGeneralImpl.class, dmUnitGeneral.getPrimaryKey(),
			dmUnitGeneral);

		clearUniqueFindersCache(dmUnitGeneral);
		cacheUniqueFindersCache(dmUnitGeneral);

		return dmUnitGeneral;
	}

	protected DmUnitGeneral toUnwrappedModel(DmUnitGeneral dmUnitGeneral) {
		if (dmUnitGeneral instanceof DmUnitGeneralImpl) {
			return dmUnitGeneral;
		}

		DmUnitGeneralImpl dmUnitGeneralImpl = new DmUnitGeneralImpl();

		dmUnitGeneralImpl.setNew(dmUnitGeneral.isNew());
		dmUnitGeneralImpl.setPrimaryKey(dmUnitGeneral.getPrimaryKey());

		dmUnitGeneralImpl.setId(dmUnitGeneral.getId());
		dmUnitGeneralImpl.setUnitCode(dmUnitGeneral.getUnitCode());
		dmUnitGeneralImpl.setUnitName(dmUnitGeneral.getUnitName());
		dmUnitGeneralImpl.setIsDelete(dmUnitGeneral.getIsDelete());
		dmUnitGeneralImpl.setMarkedAsDelete(dmUnitGeneral.getMarkedAsDelete());
		dmUnitGeneralImpl.setModifiedDate(dmUnitGeneral.getModifiedDate());
		dmUnitGeneralImpl.setRequestedDate(dmUnitGeneral.getRequestedDate());
		dmUnitGeneralImpl.setSyncVersion(dmUnitGeneral.getSyncVersion());

		return dmUnitGeneralImpl;
	}

	/**
	 * Returns the dm unit general with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm unit general
	 * @return the dm unit general
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmUnitGeneralException if a dm unit general with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmUnitGeneral findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDmUnitGeneralException, SystemException {
		DmUnitGeneral dmUnitGeneral = fetchByPrimaryKey(primaryKey);

		if (dmUnitGeneral == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDmUnitGeneralException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dmUnitGeneral;
	}

	/**
	 * Returns the dm unit general with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmUnitGeneralException} if it could not be found.
	 *
	 * @param id the primary key of the dm unit general
	 * @return the dm unit general
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmUnitGeneralException if a dm unit general with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmUnitGeneral findByPrimaryKey(int id)
		throws NoSuchDmUnitGeneralException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dm unit general with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm unit general
	 * @return the dm unit general, or <code>null</code> if a dm unit general with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmUnitGeneral fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DmUnitGeneral dmUnitGeneral = (DmUnitGeneral)EntityCacheUtil.getResult(DmUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
				DmUnitGeneralImpl.class, primaryKey);

		if (dmUnitGeneral == _nullDmUnitGeneral) {
			return null;
		}

		if (dmUnitGeneral == null) {
			Session session = null;

			try {
				session = openSession();

				dmUnitGeneral = (DmUnitGeneral)session.get(DmUnitGeneralImpl.class,
						primaryKey);

				if (dmUnitGeneral != null) {
					cacheResult(dmUnitGeneral);
				}
				else {
					EntityCacheUtil.putResult(DmUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
						DmUnitGeneralImpl.class, primaryKey, _nullDmUnitGeneral);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DmUnitGeneralModelImpl.ENTITY_CACHE_ENABLED,
					DmUnitGeneralImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dmUnitGeneral;
	}

	/**
	 * Returns the dm unit general with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm unit general
	 * @return the dm unit general, or <code>null</code> if a dm unit general with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmUnitGeneral fetchByPrimaryKey(int id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the dm unit generals.
	 *
	 * @return the dm unit generals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmUnitGeneral> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm unit generals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmUnitGeneralModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm unit generals
	 * @param end the upper bound of the range of dm unit generals (not inclusive)
	 * @return the range of dm unit generals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmUnitGeneral> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm unit generals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmUnitGeneralModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm unit generals
	 * @param end the upper bound of the range of dm unit generals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm unit generals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmUnitGeneral> findAll(int start, int end,
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

		List<DmUnitGeneral> list = (List<DmUnitGeneral>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMUNITGENERAL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMUNITGENERAL;

				if (pagination) {
					sql = sql.concat(DmUnitGeneralModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DmUnitGeneral>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmUnitGeneral>(list);
				}
				else {
					list = (List<DmUnitGeneral>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the dm unit generals from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DmUnitGeneral dmUnitGeneral : findAll()) {
			remove(dmUnitGeneral);
		}
	}

	/**
	 * Returns the number of dm unit generals.
	 *
	 * @return the number of dm unit generals
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

				Query q = session.createQuery(_SQL_COUNT_DMUNITGENERAL);

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
	 * Initializes the dm unit general persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.DmUnitGeneral")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmUnitGeneral>> listenersList = new ArrayList<ModelListener<DmUnitGeneral>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmUnitGeneral>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmUnitGeneralImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DMUNITGENERAL = "SELECT dmUnitGeneral FROM DmUnitGeneral dmUnitGeneral";
	private static final String _SQL_SELECT_DMUNITGENERAL_WHERE = "SELECT dmUnitGeneral FROM DmUnitGeneral dmUnitGeneral WHERE ";
	private static final String _SQL_COUNT_DMUNITGENERAL = "SELECT COUNT(dmUnitGeneral) FROM DmUnitGeneral dmUnitGeneral";
	private static final String _SQL_COUNT_DMUNITGENERAL_WHERE = "SELECT COUNT(dmUnitGeneral) FROM DmUnitGeneral dmUnitGeneral WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmUnitGeneral.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmUnitGeneral exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmUnitGeneral exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmUnitGeneralPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"unitCode", "unitName", "isDelete", "markedAsDelete",
				"modifiedDate", "requestedDate", "syncVersion"
			});
	private static DmUnitGeneral _nullDmUnitGeneral = new DmUnitGeneralImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmUnitGeneral> toCacheModel() {
				return _nullDmUnitGeneralCacheModel;
			}
		};

	private static CacheModel<DmUnitGeneral> _nullDmUnitGeneralCacheModel = new CacheModel<DmUnitGeneral>() {
			@Override
			public DmUnitGeneral toEntityModel() {
				return _nullDmUnitGeneral;
			}
		};
}