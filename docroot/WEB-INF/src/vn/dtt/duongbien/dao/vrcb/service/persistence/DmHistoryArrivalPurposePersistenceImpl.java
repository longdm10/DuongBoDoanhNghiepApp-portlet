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

import vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryArrivalPurposeException;
import vn.dtt.duongbien.dao.vrcb.model.DmHistoryArrivalPurpose;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryArrivalPurposeImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryArrivalPurposeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dm history arrival purpose service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmHistoryArrivalPurposePersistence
 * @see DmHistoryArrivalPurposeUtil
 * @generated
 */
public class DmHistoryArrivalPurposePersistenceImpl extends BasePersistenceImpl<DmHistoryArrivalPurpose>
	implements DmHistoryArrivalPurposePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmHistoryArrivalPurposeUtil} to access the dm history arrival purpose persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmHistoryArrivalPurposeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmHistoryArrivalPurposeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryArrivalPurposeModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryArrivalPurposeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmHistoryArrivalPurposeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryArrivalPurposeModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryArrivalPurposeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmHistoryArrivalPurposeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryArrivalPurposeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PURPOSECODE =
		new FinderPath(DmHistoryArrivalPurposeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryArrivalPurposeModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryArrivalPurposeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPurposeCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PURPOSECODE =
		new FinderPath(DmHistoryArrivalPurposeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryArrivalPurposeModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryArrivalPurposeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPurposeCode",
			new String[] { String.class.getName() },
			DmHistoryArrivalPurposeModelImpl.PURPOSECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PURPOSECODE = new FinderPath(DmHistoryArrivalPurposeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryArrivalPurposeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPurposeCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the dm history arrival purposes where purposeCode = &#63;.
	 *
	 * @param purposeCode the purpose code
	 * @return the matching dm history arrival purposes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryArrivalPurpose> findByPurposeCode(String purposeCode)
		throws SystemException {
		return findByPurposeCode(purposeCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history arrival purposes where purposeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryArrivalPurposeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param purposeCode the purpose code
	 * @param start the lower bound of the range of dm history arrival purposes
	 * @param end the upper bound of the range of dm history arrival purposes (not inclusive)
	 * @return the range of matching dm history arrival purposes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryArrivalPurpose> findByPurposeCode(String purposeCode,
		int start, int end) throws SystemException {
		return findByPurposeCode(purposeCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history arrival purposes where purposeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryArrivalPurposeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param purposeCode the purpose code
	 * @param start the lower bound of the range of dm history arrival purposes
	 * @param end the upper bound of the range of dm history arrival purposes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm history arrival purposes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryArrivalPurpose> findByPurposeCode(String purposeCode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PURPOSECODE;
			finderArgs = new Object[] { purposeCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PURPOSECODE;
			finderArgs = new Object[] { purposeCode, start, end, orderByComparator };
		}

		List<DmHistoryArrivalPurpose> list = (List<DmHistoryArrivalPurpose>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmHistoryArrivalPurpose dmHistoryArrivalPurpose : list) {
				if (!Validator.equals(purposeCode,
							dmHistoryArrivalPurpose.getPurposeCode())) {
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

			query.append(_SQL_SELECT_DMHISTORYARRIVALPURPOSE_WHERE);

			boolean bindPurposeCode = false;

			if (purposeCode == null) {
				query.append(_FINDER_COLUMN_PURPOSECODE_PURPOSECODE_1);
			}
			else if (purposeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PURPOSECODE_PURPOSECODE_3);
			}
			else {
				bindPurposeCode = true;

				query.append(_FINDER_COLUMN_PURPOSECODE_PURPOSECODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DmHistoryArrivalPurposeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPurposeCode) {
					qPos.add(purposeCode);
				}

				if (!pagination) {
					list = (List<DmHistoryArrivalPurpose>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmHistoryArrivalPurpose>(list);
				}
				else {
					list = (List<DmHistoryArrivalPurpose>)QueryUtil.list(q,
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
	 * Returns the first dm history arrival purpose in the ordered set where purposeCode = &#63;.
	 *
	 * @param purposeCode the purpose code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm history arrival purpose
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryArrivalPurposeException if a matching dm history arrival purpose could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryArrivalPurpose findByPurposeCode_First(String purposeCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmHistoryArrivalPurposeException, SystemException {
		DmHistoryArrivalPurpose dmHistoryArrivalPurpose = fetchByPurposeCode_First(purposeCode,
				orderByComparator);

		if (dmHistoryArrivalPurpose != null) {
			return dmHistoryArrivalPurpose;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("purposeCode=");
		msg.append(purposeCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmHistoryArrivalPurposeException(msg.toString());
	}

	/**
	 * Returns the first dm history arrival purpose in the ordered set where purposeCode = &#63;.
	 *
	 * @param purposeCode the purpose code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm history arrival purpose, or <code>null</code> if a matching dm history arrival purpose could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryArrivalPurpose fetchByPurposeCode_First(
		String purposeCode, OrderByComparator orderByComparator)
		throws SystemException {
		List<DmHistoryArrivalPurpose> list = findByPurposeCode(purposeCode, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm history arrival purpose in the ordered set where purposeCode = &#63;.
	 *
	 * @param purposeCode the purpose code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm history arrival purpose
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryArrivalPurposeException if a matching dm history arrival purpose could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryArrivalPurpose findByPurposeCode_Last(String purposeCode,
		OrderByComparator orderByComparator)
		throws NoSuchDmHistoryArrivalPurposeException, SystemException {
		DmHistoryArrivalPurpose dmHistoryArrivalPurpose = fetchByPurposeCode_Last(purposeCode,
				orderByComparator);

		if (dmHistoryArrivalPurpose != null) {
			return dmHistoryArrivalPurpose;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("purposeCode=");
		msg.append(purposeCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmHistoryArrivalPurposeException(msg.toString());
	}

	/**
	 * Returns the last dm history arrival purpose in the ordered set where purposeCode = &#63;.
	 *
	 * @param purposeCode the purpose code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm history arrival purpose, or <code>null</code> if a matching dm history arrival purpose could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryArrivalPurpose fetchByPurposeCode_Last(String purposeCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByPurposeCode(purposeCode);

		if (count == 0) {
			return null;
		}

		List<DmHistoryArrivalPurpose> list = findByPurposeCode(purposeCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm history arrival purposes before and after the current dm history arrival purpose in the ordered set where purposeCode = &#63;.
	 *
	 * @param id the primary key of the current dm history arrival purpose
	 * @param purposeCode the purpose code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm history arrival purpose
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryArrivalPurposeException if a dm history arrival purpose with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryArrivalPurpose[] findByPurposeCode_PrevAndNext(int id,
		String purposeCode, OrderByComparator orderByComparator)
		throws NoSuchDmHistoryArrivalPurposeException, SystemException {
		DmHistoryArrivalPurpose dmHistoryArrivalPurpose = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmHistoryArrivalPurpose[] array = new DmHistoryArrivalPurposeImpl[3];

			array[0] = getByPurposeCode_PrevAndNext(session,
					dmHistoryArrivalPurpose, purposeCode, orderByComparator,
					true);

			array[1] = dmHistoryArrivalPurpose;

			array[2] = getByPurposeCode_PrevAndNext(session,
					dmHistoryArrivalPurpose, purposeCode, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmHistoryArrivalPurpose getByPurposeCode_PrevAndNext(
		Session session, DmHistoryArrivalPurpose dmHistoryArrivalPurpose,
		String purposeCode, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMHISTORYARRIVALPURPOSE_WHERE);

		boolean bindPurposeCode = false;

		if (purposeCode == null) {
			query.append(_FINDER_COLUMN_PURPOSECODE_PURPOSECODE_1);
		}
		else if (purposeCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PURPOSECODE_PURPOSECODE_3);
		}
		else {
			bindPurposeCode = true;

			query.append(_FINDER_COLUMN_PURPOSECODE_PURPOSECODE_2);
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
			query.append(DmHistoryArrivalPurposeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindPurposeCode) {
			qPos.add(purposeCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmHistoryArrivalPurpose);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmHistoryArrivalPurpose> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm history arrival purposes where purposeCode = &#63; from the database.
	 *
	 * @param purposeCode the purpose code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPurposeCode(String purposeCode)
		throws SystemException {
		for (DmHistoryArrivalPurpose dmHistoryArrivalPurpose : findByPurposeCode(
				purposeCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dmHistoryArrivalPurpose);
		}
	}

	/**
	 * Returns the number of dm history arrival purposes where purposeCode = &#63;.
	 *
	 * @param purposeCode the purpose code
	 * @return the number of matching dm history arrival purposes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPurposeCode(String purposeCode) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PURPOSECODE;

		Object[] finderArgs = new Object[] { purposeCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMHISTORYARRIVALPURPOSE_WHERE);

			boolean bindPurposeCode = false;

			if (purposeCode == null) {
				query.append(_FINDER_COLUMN_PURPOSECODE_PURPOSECODE_1);
			}
			else if (purposeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PURPOSECODE_PURPOSECODE_3);
			}
			else {
				bindPurposeCode = true;

				query.append(_FINDER_COLUMN_PURPOSECODE_PURPOSECODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPurposeCode) {
					qPos.add(purposeCode);
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

	private static final String _FINDER_COLUMN_PURPOSECODE_PURPOSECODE_1 = "dmHistoryArrivalPurpose.purposeCode IS NULL";
	private static final String _FINDER_COLUMN_PURPOSECODE_PURPOSECODE_2 = "dmHistoryArrivalPurpose.purposeCode = ?";
	private static final String _FINDER_COLUMN_PURPOSECODE_PURPOSECODE_3 = "(dmHistoryArrivalPurpose.purposeCode IS NULL OR dmHistoryArrivalPurpose.purposeCode = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_PURPOSECODEANDSYNCVERSION =
		new FinderPath(DmHistoryArrivalPurposeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryArrivalPurposeModelImpl.FINDER_CACHE_ENABLED,
			DmHistoryArrivalPurposeImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByPurposeCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() },
			DmHistoryArrivalPurposeModelImpl.PURPOSECODE_COLUMN_BITMASK |
			DmHistoryArrivalPurposeModelImpl.SYNCVERSION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PURPOSECODEANDSYNCVERSION =
		new FinderPath(DmHistoryArrivalPurposeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryArrivalPurposeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByPurposeCodeAndSyncVersion",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns the dm history arrival purpose where purposeCode = &#63; and syncVersion = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryArrivalPurposeException} if it could not be found.
	 *
	 * @param purposeCode the purpose code
	 * @param syncVersion the sync version
	 * @return the matching dm history arrival purpose
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryArrivalPurposeException if a matching dm history arrival purpose could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryArrivalPurpose findByPurposeCodeAndSyncVersion(
		String purposeCode, String syncVersion)
		throws NoSuchDmHistoryArrivalPurposeException, SystemException {
		DmHistoryArrivalPurpose dmHistoryArrivalPurpose = fetchByPurposeCodeAndSyncVersion(purposeCode,
				syncVersion);

		if (dmHistoryArrivalPurpose == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("purposeCode=");
			msg.append(purposeCode);

			msg.append(", syncVersion=");
			msg.append(syncVersion);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmHistoryArrivalPurposeException(msg.toString());
		}

		return dmHistoryArrivalPurpose;
	}

	/**
	 * Returns the dm history arrival purpose where purposeCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param purposeCode the purpose code
	 * @param syncVersion the sync version
	 * @return the matching dm history arrival purpose, or <code>null</code> if a matching dm history arrival purpose could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryArrivalPurpose fetchByPurposeCodeAndSyncVersion(
		String purposeCode, String syncVersion) throws SystemException {
		return fetchByPurposeCodeAndSyncVersion(purposeCode, syncVersion, true);
	}

	/**
	 * Returns the dm history arrival purpose where purposeCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param purposeCode the purpose code
	 * @param syncVersion the sync version
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm history arrival purpose, or <code>null</code> if a matching dm history arrival purpose could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryArrivalPurpose fetchByPurposeCodeAndSyncVersion(
		String purposeCode, String syncVersion, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { purposeCode, syncVersion };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_PURPOSECODEANDSYNCVERSION,
					finderArgs, this);
		}

		if (result instanceof DmHistoryArrivalPurpose) {
			DmHistoryArrivalPurpose dmHistoryArrivalPurpose = (DmHistoryArrivalPurpose)result;

			if (!Validator.equals(purposeCode,
						dmHistoryArrivalPurpose.getPurposeCode()) ||
					!Validator.equals(syncVersion,
						dmHistoryArrivalPurpose.getSyncVersion())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DMHISTORYARRIVALPURPOSE_WHERE);

			boolean bindPurposeCode = false;

			if (purposeCode == null) {
				query.append(_FINDER_COLUMN_PURPOSECODEANDSYNCVERSION_PURPOSECODE_1);
			}
			else if (purposeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PURPOSECODEANDSYNCVERSION_PURPOSECODE_3);
			}
			else {
				bindPurposeCode = true;

				query.append(_FINDER_COLUMN_PURPOSECODEANDSYNCVERSION_PURPOSECODE_2);
			}

			boolean bindSyncVersion = false;

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_PURPOSECODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else if (syncVersion.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PURPOSECODEANDSYNCVERSION_SYNCVERSION_3);
			}
			else {
				bindSyncVersion = true;

				query.append(_FINDER_COLUMN_PURPOSECODEANDSYNCVERSION_SYNCVERSION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPurposeCode) {
					qPos.add(purposeCode);
				}

				if (bindSyncVersion) {
					qPos.add(syncVersion);
				}

				List<DmHistoryArrivalPurpose> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PURPOSECODEANDSYNCVERSION,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DmHistoryArrivalPurposePersistenceImpl.fetchByPurposeCodeAndSyncVersion(String, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DmHistoryArrivalPurpose dmHistoryArrivalPurpose = list.get(0);

					result = dmHistoryArrivalPurpose;

					cacheResult(dmHistoryArrivalPurpose);

					if ((dmHistoryArrivalPurpose.getPurposeCode() == null) ||
							!dmHistoryArrivalPurpose.getPurposeCode()
														.equals(purposeCode) ||
							(dmHistoryArrivalPurpose.getSyncVersion() == null) ||
							!dmHistoryArrivalPurpose.getSyncVersion()
														.equals(syncVersion)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PURPOSECODEANDSYNCVERSION,
							finderArgs, dmHistoryArrivalPurpose);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PURPOSECODEANDSYNCVERSION,
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
			return (DmHistoryArrivalPurpose)result;
		}
	}

	/**
	 * Removes the dm history arrival purpose where purposeCode = &#63; and syncVersion = &#63; from the database.
	 *
	 * @param purposeCode the purpose code
	 * @param syncVersion the sync version
	 * @return the dm history arrival purpose that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryArrivalPurpose removeByPurposeCodeAndSyncVersion(
		String purposeCode, String syncVersion)
		throws NoSuchDmHistoryArrivalPurposeException, SystemException {
		DmHistoryArrivalPurpose dmHistoryArrivalPurpose = findByPurposeCodeAndSyncVersion(purposeCode,
				syncVersion);

		return remove(dmHistoryArrivalPurpose);
	}

	/**
	 * Returns the number of dm history arrival purposes where purposeCode = &#63; and syncVersion = &#63;.
	 *
	 * @param purposeCode the purpose code
	 * @param syncVersion the sync version
	 * @return the number of matching dm history arrival purposes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPurposeCodeAndSyncVersion(String purposeCode,
		String syncVersion) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PURPOSECODEANDSYNCVERSION;

		Object[] finderArgs = new Object[] { purposeCode, syncVersion };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMHISTORYARRIVALPURPOSE_WHERE);

			boolean bindPurposeCode = false;

			if (purposeCode == null) {
				query.append(_FINDER_COLUMN_PURPOSECODEANDSYNCVERSION_PURPOSECODE_1);
			}
			else if (purposeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PURPOSECODEANDSYNCVERSION_PURPOSECODE_3);
			}
			else {
				bindPurposeCode = true;

				query.append(_FINDER_COLUMN_PURPOSECODEANDSYNCVERSION_PURPOSECODE_2);
			}

			boolean bindSyncVersion = false;

			if (syncVersion == null) {
				query.append(_FINDER_COLUMN_PURPOSECODEANDSYNCVERSION_SYNCVERSION_1);
			}
			else if (syncVersion.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PURPOSECODEANDSYNCVERSION_SYNCVERSION_3);
			}
			else {
				bindSyncVersion = true;

				query.append(_FINDER_COLUMN_PURPOSECODEANDSYNCVERSION_SYNCVERSION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPurposeCode) {
					qPos.add(purposeCode);
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

	private static final String _FINDER_COLUMN_PURPOSECODEANDSYNCVERSION_PURPOSECODE_1 =
		"dmHistoryArrivalPurpose.purposeCode IS NULL AND ";
	private static final String _FINDER_COLUMN_PURPOSECODEANDSYNCVERSION_PURPOSECODE_2 =
		"dmHistoryArrivalPurpose.purposeCode = ? AND ";
	private static final String _FINDER_COLUMN_PURPOSECODEANDSYNCVERSION_PURPOSECODE_3 =
		"(dmHistoryArrivalPurpose.purposeCode IS NULL OR dmHistoryArrivalPurpose.purposeCode = '') AND ";
	private static final String _FINDER_COLUMN_PURPOSECODEANDSYNCVERSION_SYNCVERSION_1 =
		"dmHistoryArrivalPurpose.syncVersion IS NULL";
	private static final String _FINDER_COLUMN_PURPOSECODEANDSYNCVERSION_SYNCVERSION_2 =
		"dmHistoryArrivalPurpose.syncVersion = ?";
	private static final String _FINDER_COLUMN_PURPOSECODEANDSYNCVERSION_SYNCVERSION_3 =
		"(dmHistoryArrivalPurpose.syncVersion IS NULL OR dmHistoryArrivalPurpose.syncVersion = '')";

	public DmHistoryArrivalPurposePersistenceImpl() {
		setModelClass(DmHistoryArrivalPurpose.class);
	}

	/**
	 * Caches the dm history arrival purpose in the entity cache if it is enabled.
	 *
	 * @param dmHistoryArrivalPurpose the dm history arrival purpose
	 */
	@Override
	public void cacheResult(DmHistoryArrivalPurpose dmHistoryArrivalPurpose) {
		EntityCacheUtil.putResult(DmHistoryArrivalPurposeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryArrivalPurposeImpl.class,
			dmHistoryArrivalPurpose.getPrimaryKey(), dmHistoryArrivalPurpose);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PURPOSECODEANDSYNCVERSION,
			new Object[] {
				dmHistoryArrivalPurpose.getPurposeCode(),
				dmHistoryArrivalPurpose.getSyncVersion()
			}, dmHistoryArrivalPurpose);

		dmHistoryArrivalPurpose.resetOriginalValues();
	}

	/**
	 * Caches the dm history arrival purposes in the entity cache if it is enabled.
	 *
	 * @param dmHistoryArrivalPurposes the dm history arrival purposes
	 */
	@Override
	public void cacheResult(
		List<DmHistoryArrivalPurpose> dmHistoryArrivalPurposes) {
		for (DmHistoryArrivalPurpose dmHistoryArrivalPurpose : dmHistoryArrivalPurposes) {
			if (EntityCacheUtil.getResult(
						DmHistoryArrivalPurposeModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryArrivalPurposeImpl.class,
						dmHistoryArrivalPurpose.getPrimaryKey()) == null) {
				cacheResult(dmHistoryArrivalPurpose);
			}
			else {
				dmHistoryArrivalPurpose.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm history arrival purposes.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmHistoryArrivalPurposeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmHistoryArrivalPurposeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm history arrival purpose.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmHistoryArrivalPurpose dmHistoryArrivalPurpose) {
		EntityCacheUtil.removeResult(DmHistoryArrivalPurposeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryArrivalPurposeImpl.class,
			dmHistoryArrivalPurpose.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(dmHistoryArrivalPurpose);
	}

	@Override
	public void clearCache(
		List<DmHistoryArrivalPurpose> dmHistoryArrivalPurposes) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmHistoryArrivalPurpose dmHistoryArrivalPurpose : dmHistoryArrivalPurposes) {
			EntityCacheUtil.removeResult(DmHistoryArrivalPurposeModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryArrivalPurposeImpl.class,
				dmHistoryArrivalPurpose.getPrimaryKey());

			clearUniqueFindersCache(dmHistoryArrivalPurpose);
		}
	}

	protected void cacheUniqueFindersCache(
		DmHistoryArrivalPurpose dmHistoryArrivalPurpose) {
		if (dmHistoryArrivalPurpose.isNew()) {
			Object[] args = new Object[] {
					dmHistoryArrivalPurpose.getPurposeCode(),
					dmHistoryArrivalPurpose.getSyncVersion()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PURPOSECODEANDSYNCVERSION,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PURPOSECODEANDSYNCVERSION,
				args, dmHistoryArrivalPurpose);
		}
		else {
			DmHistoryArrivalPurposeModelImpl dmHistoryArrivalPurposeModelImpl = (DmHistoryArrivalPurposeModelImpl)dmHistoryArrivalPurpose;

			if ((dmHistoryArrivalPurposeModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_PURPOSECODEANDSYNCVERSION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryArrivalPurpose.getPurposeCode(),
						dmHistoryArrivalPurpose.getSyncVersion()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PURPOSECODEANDSYNCVERSION,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PURPOSECODEANDSYNCVERSION,
					args, dmHistoryArrivalPurpose);
			}
		}
	}

	protected void clearUniqueFindersCache(
		DmHistoryArrivalPurpose dmHistoryArrivalPurpose) {
		DmHistoryArrivalPurposeModelImpl dmHistoryArrivalPurposeModelImpl = (DmHistoryArrivalPurposeModelImpl)dmHistoryArrivalPurpose;

		Object[] args = new Object[] {
				dmHistoryArrivalPurpose.getPurposeCode(),
				dmHistoryArrivalPurpose.getSyncVersion()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PURPOSECODEANDSYNCVERSION,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PURPOSECODEANDSYNCVERSION,
			args);

		if ((dmHistoryArrivalPurposeModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_PURPOSECODEANDSYNCVERSION.getColumnBitmask()) != 0) {
			args = new Object[] {
					dmHistoryArrivalPurposeModelImpl.getOriginalPurposeCode(),
					dmHistoryArrivalPurposeModelImpl.getOriginalSyncVersion()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PURPOSECODEANDSYNCVERSION,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PURPOSECODEANDSYNCVERSION,
				args);
		}
	}

	/**
	 * Creates a new dm history arrival purpose with the primary key. Does not add the dm history arrival purpose to the database.
	 *
	 * @param id the primary key for the new dm history arrival purpose
	 * @return the new dm history arrival purpose
	 */
	@Override
	public DmHistoryArrivalPurpose create(int id) {
		DmHistoryArrivalPurpose dmHistoryArrivalPurpose = new DmHistoryArrivalPurposeImpl();

		dmHistoryArrivalPurpose.setNew(true);
		dmHistoryArrivalPurpose.setPrimaryKey(id);

		return dmHistoryArrivalPurpose;
	}

	/**
	 * Removes the dm history arrival purpose with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm history arrival purpose
	 * @return the dm history arrival purpose that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryArrivalPurposeException if a dm history arrival purpose with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryArrivalPurpose remove(int id)
		throws NoSuchDmHistoryArrivalPurposeException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the dm history arrival purpose with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm history arrival purpose
	 * @return the dm history arrival purpose that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryArrivalPurposeException if a dm history arrival purpose with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryArrivalPurpose remove(Serializable primaryKey)
		throws NoSuchDmHistoryArrivalPurposeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmHistoryArrivalPurpose dmHistoryArrivalPurpose = (DmHistoryArrivalPurpose)session.get(DmHistoryArrivalPurposeImpl.class,
					primaryKey);

			if (dmHistoryArrivalPurpose == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmHistoryArrivalPurposeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmHistoryArrivalPurpose);
		}
		catch (NoSuchDmHistoryArrivalPurposeException nsee) {
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
	protected DmHistoryArrivalPurpose removeImpl(
		DmHistoryArrivalPurpose dmHistoryArrivalPurpose)
		throws SystemException {
		dmHistoryArrivalPurpose = toUnwrappedModel(dmHistoryArrivalPurpose);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dmHistoryArrivalPurpose)) {
				dmHistoryArrivalPurpose = (DmHistoryArrivalPurpose)session.get(DmHistoryArrivalPurposeImpl.class,
						dmHistoryArrivalPurpose.getPrimaryKeyObj());
			}

			if (dmHistoryArrivalPurpose != null) {
				session.delete(dmHistoryArrivalPurpose);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dmHistoryArrivalPurpose != null) {
			clearCache(dmHistoryArrivalPurpose);
		}

		return dmHistoryArrivalPurpose;
	}

	@Override
	public DmHistoryArrivalPurpose updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryArrivalPurpose dmHistoryArrivalPurpose)
		throws SystemException {
		dmHistoryArrivalPurpose = toUnwrappedModel(dmHistoryArrivalPurpose);

		boolean isNew = dmHistoryArrivalPurpose.isNew();

		DmHistoryArrivalPurposeModelImpl dmHistoryArrivalPurposeModelImpl = (DmHistoryArrivalPurposeModelImpl)dmHistoryArrivalPurpose;

		Session session = null;

		try {
			session = openSession();

			if (dmHistoryArrivalPurpose.isNew()) {
				session.save(dmHistoryArrivalPurpose);

				dmHistoryArrivalPurpose.setNew(false);
			}
			else {
				session.merge(dmHistoryArrivalPurpose);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmHistoryArrivalPurposeModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmHistoryArrivalPurposeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PURPOSECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmHistoryArrivalPurposeModelImpl.getOriginalPurposeCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PURPOSECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PURPOSECODE,
					args);

				args = new Object[] {
						dmHistoryArrivalPurposeModelImpl.getPurposeCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PURPOSECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PURPOSECODE,
					args);
			}
		}

		EntityCacheUtil.putResult(DmHistoryArrivalPurposeModelImpl.ENTITY_CACHE_ENABLED,
			DmHistoryArrivalPurposeImpl.class,
			dmHistoryArrivalPurpose.getPrimaryKey(), dmHistoryArrivalPurpose);

		clearUniqueFindersCache(dmHistoryArrivalPurpose);
		cacheUniqueFindersCache(dmHistoryArrivalPurpose);

		return dmHistoryArrivalPurpose;
	}

	protected DmHistoryArrivalPurpose toUnwrappedModel(
		DmHistoryArrivalPurpose dmHistoryArrivalPurpose) {
		if (dmHistoryArrivalPurpose instanceof DmHistoryArrivalPurposeImpl) {
			return dmHistoryArrivalPurpose;
		}

		DmHistoryArrivalPurposeImpl dmHistoryArrivalPurposeImpl = new DmHistoryArrivalPurposeImpl();

		dmHistoryArrivalPurposeImpl.setNew(dmHistoryArrivalPurpose.isNew());
		dmHistoryArrivalPurposeImpl.setPrimaryKey(dmHistoryArrivalPurpose.getPrimaryKey());

		dmHistoryArrivalPurposeImpl.setId(dmHistoryArrivalPurpose.getId());
		dmHistoryArrivalPurposeImpl.setPurposeCode(dmHistoryArrivalPurpose.getPurposeCode());
		dmHistoryArrivalPurposeImpl.setPurposeName(dmHistoryArrivalPurpose.getPurposeName());
		dmHistoryArrivalPurposeImpl.setPurposeNameVN(dmHistoryArrivalPurpose.getPurposeNameVN());
		dmHistoryArrivalPurposeImpl.setIsDelete(dmHistoryArrivalPurpose.getIsDelete());
		dmHistoryArrivalPurposeImpl.setMarkedAsDelete(dmHistoryArrivalPurpose.getMarkedAsDelete());
		dmHistoryArrivalPurposeImpl.setModifiedDate(dmHistoryArrivalPurpose.getModifiedDate());
		dmHistoryArrivalPurposeImpl.setRequestedDate(dmHistoryArrivalPurpose.getRequestedDate());
		dmHistoryArrivalPurposeImpl.setSyncVersion(dmHistoryArrivalPurpose.getSyncVersion());

		return dmHistoryArrivalPurposeImpl;
	}

	/**
	 * Returns the dm history arrival purpose with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history arrival purpose
	 * @return the dm history arrival purpose
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryArrivalPurposeException if a dm history arrival purpose with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryArrivalPurpose findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDmHistoryArrivalPurposeException, SystemException {
		DmHistoryArrivalPurpose dmHistoryArrivalPurpose = fetchByPrimaryKey(primaryKey);

		if (dmHistoryArrivalPurpose == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDmHistoryArrivalPurposeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dmHistoryArrivalPurpose;
	}

	/**
	 * Returns the dm history arrival purpose with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryArrivalPurposeException} if it could not be found.
	 *
	 * @param id the primary key of the dm history arrival purpose
	 * @return the dm history arrival purpose
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryArrivalPurposeException if a dm history arrival purpose with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryArrivalPurpose findByPrimaryKey(int id)
		throws NoSuchDmHistoryArrivalPurposeException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dm history arrival purpose with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm history arrival purpose
	 * @return the dm history arrival purpose, or <code>null</code> if a dm history arrival purpose with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryArrivalPurpose fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DmHistoryArrivalPurpose dmHistoryArrivalPurpose = (DmHistoryArrivalPurpose)EntityCacheUtil.getResult(DmHistoryArrivalPurposeModelImpl.ENTITY_CACHE_ENABLED,
				DmHistoryArrivalPurposeImpl.class, primaryKey);

		if (dmHistoryArrivalPurpose == _nullDmHistoryArrivalPurpose) {
			return null;
		}

		if (dmHistoryArrivalPurpose == null) {
			Session session = null;

			try {
				session = openSession();

				dmHistoryArrivalPurpose = (DmHistoryArrivalPurpose)session.get(DmHistoryArrivalPurposeImpl.class,
						primaryKey);

				if (dmHistoryArrivalPurpose != null) {
					cacheResult(dmHistoryArrivalPurpose);
				}
				else {
					EntityCacheUtil.putResult(DmHistoryArrivalPurposeModelImpl.ENTITY_CACHE_ENABLED,
						DmHistoryArrivalPurposeImpl.class, primaryKey,
						_nullDmHistoryArrivalPurpose);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DmHistoryArrivalPurposeModelImpl.ENTITY_CACHE_ENABLED,
					DmHistoryArrivalPurposeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dmHistoryArrivalPurpose;
	}

	/**
	 * Returns the dm history arrival purpose with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm history arrival purpose
	 * @return the dm history arrival purpose, or <code>null</code> if a dm history arrival purpose with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmHistoryArrivalPurpose fetchByPrimaryKey(int id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the dm history arrival purposes.
	 *
	 * @return the dm history arrival purposes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryArrivalPurpose> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm history arrival purposes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryArrivalPurposeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history arrival purposes
	 * @param end the upper bound of the range of dm history arrival purposes (not inclusive)
	 * @return the range of dm history arrival purposes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryArrivalPurpose> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm history arrival purposes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryArrivalPurposeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm history arrival purposes
	 * @param end the upper bound of the range of dm history arrival purposes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm history arrival purposes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmHistoryArrivalPurpose> findAll(int start, int end,
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

		List<DmHistoryArrivalPurpose> list = (List<DmHistoryArrivalPurpose>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMHISTORYARRIVALPURPOSE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMHISTORYARRIVALPURPOSE;

				if (pagination) {
					sql = sql.concat(DmHistoryArrivalPurposeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DmHistoryArrivalPurpose>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmHistoryArrivalPurpose>(list);
				}
				else {
					list = (List<DmHistoryArrivalPurpose>)QueryUtil.list(q,
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
	 * Removes all the dm history arrival purposes from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DmHistoryArrivalPurpose dmHistoryArrivalPurpose : findAll()) {
			remove(dmHistoryArrivalPurpose);
		}
	}

	/**
	 * Returns the number of dm history arrival purposes.
	 *
	 * @return the number of dm history arrival purposes
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

				Query q = session.createQuery(_SQL_COUNT_DMHISTORYARRIVALPURPOSE);

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
	 * Initializes the dm history arrival purpose persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.DmHistoryArrivalPurpose")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmHistoryArrivalPurpose>> listenersList = new ArrayList<ModelListener<DmHistoryArrivalPurpose>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmHistoryArrivalPurpose>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmHistoryArrivalPurposeImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DMHISTORYARRIVALPURPOSE = "SELECT dmHistoryArrivalPurpose FROM DmHistoryArrivalPurpose dmHistoryArrivalPurpose";
	private static final String _SQL_SELECT_DMHISTORYARRIVALPURPOSE_WHERE = "SELECT dmHistoryArrivalPurpose FROM DmHistoryArrivalPurpose dmHistoryArrivalPurpose WHERE ";
	private static final String _SQL_COUNT_DMHISTORYARRIVALPURPOSE = "SELECT COUNT(dmHistoryArrivalPurpose) FROM DmHistoryArrivalPurpose dmHistoryArrivalPurpose";
	private static final String _SQL_COUNT_DMHISTORYARRIVALPURPOSE_WHERE = "SELECT COUNT(dmHistoryArrivalPurpose) FROM DmHistoryArrivalPurpose dmHistoryArrivalPurpose WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmHistoryArrivalPurpose.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmHistoryArrivalPurpose exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmHistoryArrivalPurpose exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmHistoryArrivalPurposePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"purposeCode", "purposeName", "purposeNameVN", "isDelete",
				"markedAsDelete", "modifiedDate", "requestedDate", "syncVersion"
			});
	private static DmHistoryArrivalPurpose _nullDmHistoryArrivalPurpose = new DmHistoryArrivalPurposeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmHistoryArrivalPurpose> toCacheModel() {
				return _nullDmHistoryArrivalPurposeCacheModel;
			}
		};

	private static CacheModel<DmHistoryArrivalPurpose> _nullDmHistoryArrivalPurposeCacheModel =
		new CacheModel<DmHistoryArrivalPurpose>() {
			@Override
			public DmHistoryArrivalPurpose toEntityModel() {
				return _nullDmHistoryArrivalPurpose;
			}
		};
}