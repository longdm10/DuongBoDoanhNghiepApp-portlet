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

import vn.dtt.duongbien.dao.vrcb.NoSuchDmHistorySecurityLevelException;
import vn.dtt.duongbien.dao.vrcb.model.DmHistorySecurityLevel;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmHistorySecurityLevelImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmHistorySecurityLevelModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dm history security level service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmHistorySecurityLevelPersistence
 * @see DmHistorySecurityLevelUtil
 * @generated
 */
public class DmHistorySecurityLevelPersistenceImpl extends BasePersistenceImpl<DmHistorySecurityLevel>
	implements DmHistorySecurityLevelPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmHistorySecurityLevelUtil} to access the dm history security level persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmHistorySecurityLevelImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmHistorySecurityLevelModelImpl.ENTITY_CACHE_ENABLED,
			DmHistorySecurityLevelModelImpl.FINDER_CACHE_ENABLED,
			DmHistorySecurityLevelImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmHistorySecurityLevelModelImpl.ENTITY_CACHE_ENABLED,
			DmHistorySecurityLevelModelImpl.FINDER_CACHE_ENABLED,
			DmHistorySecurityLevelImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmHistorySecurityLevelModelImpl.ENTITY_CACHE_ENABLED,
			DmHistorySecurityLevelModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SECURITYLEVELCODE =
		new FinderPath(DmHistorySecurityLevelModelImpl.ENTITY_CACHE_ENABLED,
			DmHistorySecurityLevelModelImpl.FINDER_CACHE_ENABLED,
			DmHistorySecurityLevelImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBySecurityLevelCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SECURITYLEVELCODE =
		new FinderPath(DmHistorySecurityLevelModelImpl.ENTITY_CACHE_ENABLED,
			DmHistorySecurityLevelModelImpl.FINDER_CACHE_ENABLED,
			DmHistorySecurityLevelImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBySecurityLevelCode", new String[] { String.class.getName() },
			DmHistorySecurityLevelModelImpl.SECURITYLEVELCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SECURITYLEVELCODE = new FinderPath(DmHistorySecurityLevelModelImpl.ENTITY_CACHE_ENABLED,
			DmHistorySecurityLevelModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySecurityLevelCode", new String[] { String.class.getName() });

	/**
	 * Returns all the dm history security levels where securityLevelCode = &#63;.
	 *
	 * @param securityLevelCode the security level code
	 * @return the matching dm history security levels
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistorySecurityLevel> findBySecurityLevelCode(
		String securityLevelCode) throws SystemException {
		return findBySecurityLevelCode(securityLevelCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history security levels where securityLevelCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistorySecurityLevelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param securityLevelCode the security level code
	 * @param start the lower bound of the range of dm history security levels
	 * @param end the upper bound of the range of dm history security levels (not inclusive)
	 * @return the range of matching dm history security levels
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistorySecurityLevel> findBySecurityLevelCode(
		String securityLevelCode, int start, int end) throws SystemException {
		return findBySecurityLevelCode(securityLevelCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history security levels where securityLevelCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistorySecurityLevelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param securityLevelCode the security level code
	 * @param start the lower bound of the range of dm history security levels
	 * @param end the upper bound of the range of dm history security levels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm history security levels
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistorySecurityLevel> findBySecurityLevelCode(
		String securityLevelCode, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SECURITYLEVELCODE;
			finderArgs = new Object[] { securityLevelCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SECURITYLEVELCODE;
			finderArgs = new Object[] {
					securityLevelCode,
					
					start, end, orderByComparator
				};
		}

		List<DmHistorySecurityLevel> list = (List<DmHistorySecurityLevel>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmHistorySecurityLevel dmHistorySecurityLevel : list) {
				if (!Validator.equals(securityLevelCode,
							dmHistorySecurityLevel.getSecurityLevelCode())) {
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

			query.append(_SQL_SELECT_DMHISTORYSECURITYLEVEL_WHERE);

			boolean bindSecurityLevelCode = false;

			if (securityLevelCode == null) {
				query.append(_FINDER_COLUMN_SECURITYLEVELCODE_SECURITYLEVELCODE_1);
			}
			else if (securityLevelCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SECURITYLEVELCODE_SECURITYLEVELCODE_3);
			}
			else {
				bindSecurityLevelCode = true;

				query.append(_FINDER_COLUMN_SECURITYLEVELCODE_SECURITYLEVELCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DmHistorySecurityLevelModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSecurityLevelCode) {
					qPos.add(securityLevelCode);
				}

				if (!pagination) {
					list = (List<DmHistorySecurityLevel>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmHistorySecurityLevel>(list);
				}
				else {
					list = (List<DmHistorySecurityLevel>)QueryUtil.list(q,
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
	 * Returns the first dm history security level in the ordered set where securityLevelCode = &#63;.
	 *
	 * @param securityLevelCode the security level code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm history security level
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistorySecurityLevelException if a matching dm history security level could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistorySecurityLevel findBySecurityLevelCode_First(
		String securityLevelCode, OrderByComparator orderByComparator)
		throws NoSuchDmHistorySecurityLevelException, SystemException {
		DmHistorySecurityLevel dmHistorySecurityLevel = fetchBySecurityLevelCode_First(securityLevelCode,
				orderByComparator);

		if (dmHistorySecurityLevel != null) {
			return dmHistorySecurityLevel;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("securityLevelCode=");
		msg.append(securityLevelCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmHistorySecurityLevelException(msg.toString());
	}

	/**
	 * Returns the first dm history security level in the ordered set where securityLevelCode = &#63;.
	 *
	 * @param securityLevelCode the security level code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm history security level, or <code>null</code> if a matching dm history security level could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistorySecurityLevel fetchBySecurityLevelCode_First(
		String securityLevelCode, OrderByComparator orderByComparator)
		throws SystemException {
		List<DmHistorySecurityLevel> list = findBySecurityLevelCode(securityLevelCode,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm history security level in the ordered set where securityLevelCode = &#63;.
	 *
	 * @param securityLevelCode the security level code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm history security level
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistorySecurityLevelException if a matching dm history security level could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistorySecurityLevel findBySecurityLevelCode_Last(
		String securityLevelCode, OrderByComparator orderByComparator)
		throws NoSuchDmHistorySecurityLevelException, SystemException {
		DmHistorySecurityLevel dmHistorySecurityLevel = fetchBySecurityLevelCode_Last(securityLevelCode,
				orderByComparator);

		if (dmHistorySecurityLevel != null) {
			return dmHistorySecurityLevel;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("securityLevelCode=");
		msg.append(securityLevelCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmHistorySecurityLevelException(msg.toString());
	}

	/**
	 * Returns the last dm history security level in the ordered set where securityLevelCode = &#63;.
	 *
	 * @param securityLevelCode the security level code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm history security level, or <code>null</code> if a matching dm history security level could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistorySecurityLevel fetchBySecurityLevelCode_Last(
		String securityLevelCode, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBySecurityLevelCode(securityLevelCode);

		if (count == 0) {
			return null;
		}

		List<DmHistorySecurityLevel> list = findBySecurityLevelCode(securityLevelCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm history security levels before and after the current dm history security level in the ordered set where securityLevelCode = &#63;.
	 *
	 * @param id the primary key of the current dm history security level
	 * @param securityLevelCode the security level code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm history security level
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistorySecurityLevelException if a dm history security level with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistorySecurityLevel[] findBySecurityLevelCode_PrevAndNext(
		int id, String securityLevelCode, OrderByComparator orderByComparator)
		throws NoSuchDmHistorySecurityLevelException, SystemException {
		DmHistorySecurityLevel dmHistorySecurityLevel = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmHistorySecurityLevel[] array = new DmHistorySecurityLevelImpl[3];

			array[0] = getBySecurityLevelCode_PrevAndNext(session,
					dmHistorySecurityLevel, securityLevelCode,
					orderByComparator, true);

			array[1] = dmHistorySecurityLevel;

			array[2] = getBySecurityLevelCode_PrevAndNext(session,
					dmHistorySecurityLevel, securityLevelCode,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmHistorySecurityLevel getBySecurityLevelCode_PrevAndNext(
		Session session, DmHistorySecurityLevel dmHistorySecurityLevel,
		String securityLevelCode, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMHISTORYSECURITYLEVEL_WHERE);

		boolean bindSecurityLevelCode = false;

		if (securityLevelCode == null) {
			query.append(_FINDER_COLUMN_SECURITYLEVELCODE_SECURITYLEVELCODE_1);
		}
		else if (securityLevelCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_SECURITYLEVELCODE_SECURITYLEVELCODE_3);
		}
		else {
			bindSecurityLevelCode = true;

			query.append(_FINDER_COLUMN_SECURITYLEVELCODE_SECURITYLEVELCODE_2);
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
			query.append(DmHistorySecurityLevelModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindSecurityLevelCode) {
			qPos.add(securityLevelCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmHistorySecurityLevel);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmHistorySecurityLevel> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm history security levels where securityLevelCode = &#63; from the database.
	 *
	 * @param securityLevelCode the security level code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBySecurityLevelCode(String securityLevelCode)
		throws SystemException {
		for (DmHistorySecurityLevel dmHistorySecurityLevel : findBySecurityLevelCode(
				securityLevelCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dmHistorySecurityLevel);
		}
	}

	/**
	 * Returns the number of dm history security levels where securityLevelCode = &#63;.
	 *
	 * @param securityLevelCode the security level code
	 * @return the number of matching dm history security levels
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBySecurityLevelCode(String securityLevelCode)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SECURITYLEVELCODE;

		Object[] finderArgs = new Object[] { securityLevelCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMHISTORYSECURITYLEVEL_WHERE);

			boolean bindSecurityLevelCode = false;

			if (securityLevelCode == null) {
				query.append(_FINDER_COLUMN_SECURITYLEVELCODE_SECURITYLEVELCODE_1);
			}
			else if (securityLevelCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SECURITYLEVELCODE_SECURITYLEVELCODE_3);
			}
			else {
				bindSecurityLevelCode = true;

				query.append(_FINDER_COLUMN_SECURITYLEVELCODE_SECURITYLEVELCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSecurityLevelCode) {
					qPos.add(securityLevelCode);
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

	private static final String _FINDER_COLUMN_SECURITYLEVELCODE_SECURITYLEVELCODE_1 =
		"dmHistorySecurityLevel.securityLevelCode IS NULL";
	private static final String _FINDER_COLUMN_SECURITYLEVELCODE_SECURITYLEVELCODE_2 =
		"dmHistorySecurityLevel.securityLevelCode = ?";
	private static final String _FINDER_COLUMN_SECURITYLEVELCODE_SECURITYLEVELCODE_3 =
		"(dmHistorySecurityLevel.securityLevelCode IS NULL OR dmHistorySecurityLevel.securityLevelCode = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_SECURITYLEVELCODEANDSYNCVERSION =
		new FinderPath(DmHistorySecurityLevelModelImpl.ENTITY_CACHE_ENABLED,
			DmHistorySecurityLevelModelImpl.FINDER_CACHE_ENABLED,
			DmHistorySecurityLevelImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchBySecurityLevelCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() },
			DmHistorySecurityLevelModelImpl.SECURITYLEVELCODE_COLUMN_BITMASK |
			DmHistorySecurityLevelModelImpl.SYNCVERSION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SECURITYLEVELCODEANDSYNCVERSION =
		new FinderPath(DmHistorySecurityLevelModelImpl.ENTITY_CACHE_ENABLED,
			DmHistorySecurityLevelModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySecurityLevelCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns the dm history security level where securityLevelCode = &#63; and syncVersion = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistorySecurityLevelException} if it could not be found.
	 *
	 * @param securityLevelCode the security level code
	 * @param syncVersion the sync version
	 * @return the matching dm history security level
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistorySecurityLevelException if a matching dm history security level could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistorySecurityLevel findBySecurityLevelCodeAndSyncVersion(
		String securityLevelCode, String syncVersion)
		throws NoSuchDmHistorySecurityLevelException, SystemException {
		DmHistorySecurityLevel dmHistorySecurityLevel = fetchBySecurityLevelCodeAndSyncVersion(securityLevelCode,
				syncVersion);

		if (dmHistorySecurityLevel == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("securityLevelCode=");
			msg.append(securityLevelCode);

			msg.append(", syncVersion=");
			msg.append(syncVersion);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmHistorySecurityLevelException(msg.toString());
		}

		return dmHistorySecurityLevel;
	}

	/**
	 * Returns the dm history security level where securityLevelCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param securityLevelCode the security level code
	 * @param syncVersion the sync version
	 * @return the matching dm history security level, or <code>null</code> if a matching dm history security level could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistorySecurityLevel fetchBySecurityLevelCodeAndSyncVersion(
		String securityLevelCode, String syncVersion) throws SystemException {
		return fetchBySecurityLevelCodeAndSyncVersion(securityLevelCode,
			syncVersion, true);
	}

	/**
	 * Returns the dm history security level where securityLevelCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param securityLevelCode the security level code
	 * @param syncVersion the sync version
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm history security level, or <code>null</code> if a matching dm history security level could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistorySecurityLevel fetchBySecurityLevelCodeAndSyncVersion(
		String securityLevelCode, String syncVersion, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { securityLevelCode, syncVersion };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_SECURITYLEVELCODEANDSYNCVERSION,
					finderArgs, this);
		}

		if (result instanceof DmHistorySecurityLevel) {
			DmHistorySecurityLevel dmHistorySecurityLevel = (DmHistorySecurityLevel)result;

			if (!Validator.equals(securityLevelCode,
						dmHistorySecurityLevel.getSecurityLevelCode()) ||
					!Validator.equals(syncVersion,
						dmHistorySecurityLevel.getSyncVersion())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DMHISTORYSECURITYLEVEL_WHERE);

			boolean bindSecurityLevelCode = false;

			if (securityLevelCode == null) {
				query.append(_FINDER_COLUMN_SECURITYLEVELCODEANDSYNCVERSION_SECURITYLEVELCODE_1);
			}
			else if (securityLevelCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SECURITYLEVELCODEANDSYNCVERSION_SECURITYLEVELCODE_3);
			}
			else {
				bindSecurityLevelCode = true;

				query.append(_FINDER_COLUMN_SECURITYLEVELCODEANDSYNCVERSION_SECURITYLEVELCODE_2);
			}

			boolean bindSyncVersion = false;

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_SECURITYLEVELCODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else if (syncVersion.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SECURITYLEVELCODEANDSYNCVERSION_SYNCVERSION_3);
			}
			else {
				bindSyncVersion = true;

				query.append(_FINDER_COLUMN_SECURITYLEVELCODEANDSYNCVERSION_SYNCVERSION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSecurityLevelCode) {
					qPos.add(securityLevelCode);
				}

				if (bindSyncVersion) {
					qPos.add(syncVersion);
				}

				List<DmHistorySecurityLevel> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SECURITYLEVELCODEANDSYNCVERSION,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DmHistorySecurityLevelPersistenceImpl.fetchBySecurityLevelCodeAndSyncVersion(String, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DmHistorySecurityLevel dmHistorySecurityLevel = list.get(0);

					result = dmHistorySecurityLevel;

					cacheResult(dmHistorySecurityLevel);

					if ((dmHistorySecurityLevel.getSecurityLevelCode() == null) ||
							!dmHistorySecurityLevel.getSecurityLevelCode()
													   .equals(securityLevelCode) ||
							(dmHistorySecurityLevel.getSyncVersion() == null) ||
							!dmHistorySecurityLevel.getSyncVersion()
													   .equals(syncVersion)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SECURITYLEVELCODEANDSYNCVERSION,
							finderArgs, dmHistorySecurityLevel);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_SECURITYLEVELCODEANDSYNCVERSION,
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
			return (DmHistorySecurityLevel)result;
		}
	}

	/**
	 * Removes the dm history security level where securityLevelCode = &#63; and syncVersion = &#63; from the database.
	 *
	 * @param securityLevelCode the security level code
	 * @param syncVersion the sync version
	 * @return the dm history security level that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistorySecurityLevel removeBySecurityLevelCodeAndSyncVersion(
		String securityLevelCode, String syncVersion)
		throws NoSuchDmHistorySecurityLevelException, SystemException {
		DmHistorySecurityLevel dmHistorySecurityLevel = findBySecurityLevelCodeAndSyncVersion(securityLevelCode,
				syncVersion);

		return remove(dmHistorySecurityLevel);
	}

	/**
	 * Returns the number of dm history security levels where securityLevelCode = &#63; and syncVersion = &#63;.
	 *
	 * @param securityLevelCode the security level code
	 * @param syncVersion the sync version
	 * @return the number of matching dm history security levels
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBySecurityLevelCodeAndSyncVersion(
		String securityLevelCode, String syncVersion) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SECURITYLEVELCODEANDSYNCVERSION;

		Object[] finderArgs = new Object[] { securityLevelCode, syncVersion };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMHISTORYSECURITYLEVEL_WHERE);

			boolean bindSecurityLevelCode = false;

			if (securityLevelCode == null) {
				query.append(_FINDER_COLUMN_SECURITYLEVELCODEANDSYNCVERSION_SECURITYLEVELCODE_1);
			}
			else if (securityLevelCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SECURITYLEVELCODEANDSYNCVERSION_SECURITYLEVELCODE_3);
			}
			else {
				bindSecurityLevelCode = true;

				query.append(_FINDER_COLUMN_SECURITYLEVELCODEANDSYNCVERSION_SECURITYLEVELCODE_2);
			}

			boolean bindSyncVersion = false;

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_SECURITYLEVELCODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else if (syncVersion.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SECURITYLEVELCODEANDSYNCVERSION_SYNCVERSION_3);
			}
			else {
				bindSyncVersion = true;

				query.append(_FINDER_COLUMN_SECURITYLEVELCODEANDSYNCVERSION_SYNCVERSION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSecurityLevelCode) {
					qPos.add(securityLevelCode);
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

	private static final String _FINDER_COLUMN_SECURITYLEVELCODEANDSYNCVERSION_SECURITYLEVELCODE_1 =
		"dmHistorySecurityLevel.securityLevelCode IS NULL AND ";
	private static final String _FINDER_COLUMN_SECURITYLEVELCODEANDSYNCVERSION_SECURITYLEVELCODE_2 =
		"dmHistorySecurityLevel.securityLevelCode = ? AND ";
	private static final String _FINDER_COLUMN_SECURITYLEVELCODEANDSYNCVERSION_SECURITYLEVELCODE_3 =
		"(dmHistorySecurityLevel.securityLevelCode IS NULL OR dmHistorySecurityLevel.securityLevelCode = '') AND ";
	private static final String _FINDER_COLUMN_SECURITYLEVELCODEANDSYNCVERSION_SYNCVERSION_1 =
		"dmHistorySecurityLevel.syncVersion IS NULL";
	private static final String _FINDER_COLUMN_SECURITYLEVELCODEANDSYNCVERSION_SYNCVERSION_2 =
		"dmHistorySecurityLevel.syncVersion = ?";
	private static final String _FINDER_COLUMN_SECURITYLEVELCODEANDSYNCVERSION_SYNCVERSION_3 =
		"(dmHistorySecurityLevel.syncVersion IS NULL OR dmHistorySecurityLevel.syncVersion = '')";

	public DmHistorySecurityLevelPersistenceImpl() {
		setModelClass(DmHistorySecurityLevel.class);
	}

	/**
	 * Caches the dm history security level in the entity cache if it is enabled.
	 *
	 * @param dmHistorySecurityLevel the dm history security level
	 */
	@Override
	public void cacheResult(DmHistorySecurityLevel dmHistorySecurityLevel) {
		EntityCacheUtil.putResult(DmHistorySecurityLevelModelImpl.ENTITY_CACHE_ENABLED,
			DmHistorySecurityLevelImpl.class,
			dmHistorySecurityLevel.getPrimaryKey(), dmHistorySecurityLevel);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SECURITYLEVELCODEANDSYNCVERSION,
			new Object[] {
				dmHistorySecurityLevel.getSecurityLevelCode(),
				dmHistorySecurityLevel.getSyncVersion()
			}, dmHistorySecurityLevel);

		dmHistorySecurityLevel.resetOriginalValues();
	}

	/**
	 * Caches the dm history security levels in the entity cache if it is enabled.
	 *
	 * @param dmHistorySecurityLevels the dm history security levels
	 */
	@Override
	public void cacheResult(
		List<DmHistorySecurityLevel> dmHistorySecurityLevels) {
		for (DmHistorySecurityLevel dmHistorySecurityLevel : dmHistorySecurityLevels) {
			if (EntityCacheUtil.getResult(
						DmHistorySecurityLevelModelImpl.ENTITY_CACHE_ENABLED,
						DmHistorySecurityLevelImpl.class,
						dmHistorySecurityLevel.getPrimaryKey()) == null) {
				cacheResult(dmHistorySecurityLevel);
			}
			else {
				dmHistorySecurityLevel.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm history security levels.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmHistorySecurityLevelImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmHistorySecurityLevelImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm history security level.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmHistorySecurityLevel dmHistorySecurityLevel) {
		EntityCacheUtil.removeResult(DmHistorySecurityLevelModelImpl.ENTITY_CACHE_ENABLED,
			DmHistorySecurityLevelImpl.class,
			dmHistorySecurityLevel.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(dmHistorySecurityLevel);
	}

	@Override
	public void clearCache(List<DmHistorySecurityLevel> dmHistorySecurityLevels) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmHistorySecurityLevel dmHistorySecurityLevel : dmHistorySecurityLevels) {
			EntityCacheUtil.removeResult(DmHistorySecurityLevelModelImpl.ENTITY_CACHE_ENABLED,
				DmHistorySecurityLevelImpl.class,
				dmHistorySecurityLevel.getPrimaryKey());

			clearUniqueFindersCache(dmHistorySecurityLevel);
		}
	}

	protected void cacheUniqueFindersCache(
		DmHistorySecurityLevel dmHistorySecurityLevel) {
		if (dmHistorySecurityLevel.isNew()) {
			Object[] args = new Object[] {
					dmHistorySecurityLevel.getSecurityLevelCode(),
					dmHistorySecurityLevel.getSyncVersion()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SECURITYLEVELCODEANDSYNCVERSION,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SECURITYLEVELCODEANDSYNCVERSION,
				args, dmHistorySecurityLevel);
		}
		else {
			DmHistorySecurityLevelModelImpl dmHistorySecurityLevelModelImpl = (DmHistorySecurityLevelModelImpl)dmHistorySecurityLevel;

			if ((dmHistorySecurityLevelModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_SECURITYLEVELCODEANDSYNCVERSION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistorySecurityLevel.getSecurityLevelCode(),
						dmHistorySecurityLevel.getSyncVersion()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SECURITYLEVELCODEANDSYNCVERSION,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SECURITYLEVELCODEANDSYNCVERSION,
					args, dmHistorySecurityLevel);
			}
		}
	}

	protected void clearUniqueFindersCache(
		DmHistorySecurityLevel dmHistorySecurityLevel) {
		DmHistorySecurityLevelModelImpl dmHistorySecurityLevelModelImpl = (DmHistorySecurityLevelModelImpl)dmHistorySecurityLevel;

		Object[] args = new Object[] {
				dmHistorySecurityLevel.getSecurityLevelCode(),
				dmHistorySecurityLevel.getSyncVersion()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SECURITYLEVELCODEANDSYNCVERSION,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_SECURITYLEVELCODEANDSYNCVERSION,
			args);

		if ((dmHistorySecurityLevelModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_SECURITYLEVELCODEANDSYNCVERSION.getColumnBitmask()) != 0) {
			args = new Object[] {
					dmHistorySecurityLevelModelImpl.getOriginalSecurityLevelCode(),
					dmHistorySecurityLevelModelImpl.getOriginalSyncVersion()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SECURITYLEVELCODEANDSYNCVERSION,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_SECURITYLEVELCODEANDSYNCVERSION,
				args);
		}
	}

	/**
	 * Creates a new dm history security level with the primary key. Does not add the dm history security level to the database.
	 *
	 * @param id the primary key for the new dm history security level
	 * @return the new dm history security level
	 */
	@Override
	public DmHistorySecurityLevel create(int id) {
		DmHistorySecurityLevel dmHistorySecurityLevel = new DmHistorySecurityLevelImpl();

		dmHistorySecurityLevel.setNew(true);
		dmHistorySecurityLevel.setPrimaryKey(id);

		return dmHistorySecurityLevel;
	}

	/**
	 * Removes the dm history security level with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm history security level
	 * @return the dm history security level that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistorySecurityLevelException if a dm history security level with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistorySecurityLevel remove(int id)
		throws NoSuchDmHistorySecurityLevelException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the dm history security level with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm history security level
	 * @return the dm history security level that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistorySecurityLevelException if a dm history security level with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistorySecurityLevel remove(Serializable primaryKey)
		throws NoSuchDmHistorySecurityLevelException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmHistorySecurityLevel dmHistorySecurityLevel = (DmHistorySecurityLevel)session.get(DmHistorySecurityLevelImpl.class,
					primaryKey);

			if (dmHistorySecurityLevel == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmHistorySecurityLevelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmHistorySecurityLevel);
		}
		catch (NoSuchDmHistorySecurityLevelException nsee) {
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
	protected DmHistorySecurityLevel removeImpl(
		DmHistorySecurityLevel dmHistorySecurityLevel)
		throws SystemException {
		dmHistorySecurityLevel = toUnwrappedModel(dmHistorySecurityLevel);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dmHistorySecurityLevel)) {
				dmHistorySecurityLevel = (DmHistorySecurityLevel)session.get(DmHistorySecurityLevelImpl.class,
						dmHistorySecurityLevel.getPrimaryKeyObj());
			}

			if (dmHistorySecurityLevel != null) {
				session.delete(dmHistorySecurityLevel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dmHistorySecurityLevel != null) {
			clearCache(dmHistorySecurityLevel);
		}

		return dmHistorySecurityLevel;
	}

	@Override
	public DmHistorySecurityLevel updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmHistorySecurityLevel dmHistorySecurityLevel)
		throws SystemException {
		dmHistorySecurityLevel = toUnwrappedModel(dmHistorySecurityLevel);

		boolean isNew = dmHistorySecurityLevel.isNew();

		DmHistorySecurityLevelModelImpl dmHistorySecurityLevelModelImpl = (DmHistorySecurityLevelModelImpl)dmHistorySecurityLevel;

		Session session = null;

		try {
			session = openSession();

			if (dmHistorySecurityLevel.isNew()) {
				session.save(dmHistorySecurityLevel);

				dmHistorySecurityLevel.setNew(false);
			}
			else {
				session.merge(dmHistorySecurityLevel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmHistorySecurityLevelModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmHistorySecurityLevelModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SECURITYLEVELCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistorySecurityLevelModelImpl.getOriginalSecurityLevelCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SECURITYLEVELCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SECURITYLEVELCODE,
					args);

				args = new Object[] {
						dmHistorySecurityLevelModelImpl.getSecurityLevelCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SECURITYLEVELCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SECURITYLEVELCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmHistorySecurityLevelModelImpl.ENTITY_CACHE_ENABLED,
			DmHistorySecurityLevelImpl.class,
			dmHistorySecurityLevel.getPrimaryKey(), dmHistorySecurityLevel);

		clearUniqueFindersCache(dmHistorySecurityLevel);
		cacheUniqueFindersCache(dmHistorySecurityLevel);

		return dmHistorySecurityLevel;
	}

	protected DmHistorySecurityLevel toUnwrappedModel(
		DmHistorySecurityLevel dmHistorySecurityLevel) {
		if (dmHistorySecurityLevel instanceof DmHistorySecurityLevelImpl) {
			return dmHistorySecurityLevel;
		}

		DmHistorySecurityLevelImpl dmHistorySecurityLevelImpl = new DmHistorySecurityLevelImpl();

		dmHistorySecurityLevelImpl.setNew(dmHistorySecurityLevel.isNew());
		dmHistorySecurityLevelImpl.setPrimaryKey(dmHistorySecurityLevel.getPrimaryKey());

		dmHistorySecurityLevelImpl.setId(dmHistorySecurityLevel.getId());
		dmHistorySecurityLevelImpl.setSecurityLevelCode(dmHistorySecurityLevel.getSecurityLevelCode());
		dmHistorySecurityLevelImpl.setSecurityLevel(dmHistorySecurityLevel.getSecurityLevel());
		dmHistorySecurityLevelImpl.setSecurityLevelName(dmHistorySecurityLevel.getSecurityLevelName());
		dmHistorySecurityLevelImpl.setIsDelete(dmHistorySecurityLevel.getIsDelete());
		dmHistorySecurityLevelImpl.setMarkedAsDelete(dmHistorySecurityLevel.getMarkedAsDelete());
		dmHistorySecurityLevelImpl.setModifiedDate(dmHistorySecurityLevel.getModifiedDate());
		dmHistorySecurityLevelImpl.setRequestedDate(dmHistorySecurityLevel.getRequestedDate());
		dmHistorySecurityLevelImpl.setSyncVersion(dmHistorySecurityLevel.getSyncVersion());

		return dmHistorySecurityLevelImpl;
	}

	/**
	 * Returns the dm history security level with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history security level
	 * @return the dm history security level
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistorySecurityLevelException if a dm history security level with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistorySecurityLevel findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDmHistorySecurityLevelException, SystemException {
		DmHistorySecurityLevel dmHistorySecurityLevel = fetchByPrimaryKey(primaryKey);

		if (dmHistorySecurityLevel == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDmHistorySecurityLevelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dmHistorySecurityLevel;
	}

	/**
	 * Returns the dm history security level with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistorySecurityLevelException} if it could not be found.
	 *
	 * @param id the primary key of the dm history security level
	 * @return the dm history security level
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistorySecurityLevelException if a dm history security level with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistorySecurityLevel findByPrimaryKey(int id)
		throws NoSuchDmHistorySecurityLevelException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dm history security level with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history security level
	 * @return the dm history security level, or <code>null</code> if a dm history security level with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistorySecurityLevel fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DmHistorySecurityLevel dmHistorySecurityLevel = (DmHistorySecurityLevel)EntityCacheUtil.getResult(DmHistorySecurityLevelModelImpl.ENTITY_CACHE_ENABLED,
				DmHistorySecurityLevelImpl.class, primaryKey);

		if (dmHistorySecurityLevel == _nullDmHistorySecurityLevel) {
			return null;
		}

		if (dmHistorySecurityLevel == null) {
			Session session = null;

			try {
				session = openSession();

				dmHistorySecurityLevel = (DmHistorySecurityLevel)session.get(DmHistorySecurityLevelImpl.class,
						primaryKey);

				if (dmHistorySecurityLevel != null) {
					cacheResult(dmHistorySecurityLevel);
				}
				else {
					EntityCacheUtil.putResult(DmHistorySecurityLevelModelImpl.ENTITY_CACHE_ENABLED,
						DmHistorySecurityLevelImpl.class, primaryKey,
						_nullDmHistorySecurityLevel);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DmHistorySecurityLevelModelImpl.ENTITY_CACHE_ENABLED,
					DmHistorySecurityLevelImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dmHistorySecurityLevel;
	}

	/**
	 * Returns the dm history security level with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm history security level
	 * @return the dm history security level, or <code>null</code> if a dm history security level with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistorySecurityLevel fetchByPrimaryKey(int id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the dm history security levels.
	 *
	 * @return the dm history security levels
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistorySecurityLevel> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history security levels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistorySecurityLevelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history security levels
	 * @param end the upper bound of the range of dm history security levels (not inclusive)
	 * @return the range of dm history security levels
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistorySecurityLevel> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history security levels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistorySecurityLevelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history security levels
	 * @param end the upper bound of the range of dm history security levels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm history security levels
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistorySecurityLevel> findAll(int start, int end,
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

		List<DmHistorySecurityLevel> list = (List<DmHistorySecurityLevel>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMHISTORYSECURITYLEVEL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMHISTORYSECURITYLEVEL;

				if (pagination) {
					sql = sql.concat(DmHistorySecurityLevelModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DmHistorySecurityLevel>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmHistorySecurityLevel>(list);
				}
				else {
					list = (List<DmHistorySecurityLevel>)QueryUtil.list(q,
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
	 * Removes all the dm history security levels from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DmHistorySecurityLevel dmHistorySecurityLevel : findAll()) {
			remove(dmHistorySecurityLevel);
		}
	}

	/**
	 * Returns the number of dm history security levels.
	 *
	 * @return the number of dm history security levels
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

				Query q = session.createQuery(_SQL_COUNT_DMHISTORYSECURITYLEVEL);

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
	 * Initializes the dm history security level persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.DmHistorySecurityLevel")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmHistorySecurityLevel>> listenersList = new ArrayList<ModelListener<DmHistorySecurityLevel>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmHistorySecurityLevel>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmHistorySecurityLevelImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DMHISTORYSECURITYLEVEL = "SELECT dmHistorySecurityLevel FROM DmHistorySecurityLevel dmHistorySecurityLevel";
	private static final String _SQL_SELECT_DMHISTORYSECURITYLEVEL_WHERE = "SELECT dmHistorySecurityLevel FROM DmHistorySecurityLevel dmHistorySecurityLevel WHERE ";
	private static final String _SQL_COUNT_DMHISTORYSECURITYLEVEL = "SELECT COUNT(dmHistorySecurityLevel) FROM DmHistorySecurityLevel dmHistorySecurityLevel";
	private static final String _SQL_COUNT_DMHISTORYSECURITYLEVEL_WHERE = "SELECT COUNT(dmHistorySecurityLevel) FROM DmHistorySecurityLevel dmHistorySecurityLevel WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmHistorySecurityLevel.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmHistorySecurityLevel exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmHistorySecurityLevel exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmHistorySecurityLevelPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"securityLevelCode", "securityLevel", "securityLevelName",
				"isDelete", "markedAsDelete", "modifiedDate", "requestedDate",
				"syncVersion"
			});
	private static DmHistorySecurityLevel _nullDmHistorySecurityLevel = new DmHistorySecurityLevelImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmHistorySecurityLevel> toCacheModel() {
				return _nullDmHistorySecurityLevelCacheModel;
			}
		};

	private static CacheModel<DmHistorySecurityLevel> _nullDmHistorySecurityLevelCacheModel =
		new CacheModel<DmHistorySecurityLevel>() {
			@Override
			public DmHistorySecurityLevel toEntityModel() {
				return _nullDmHistorySecurityLevel;
			}
		};
}