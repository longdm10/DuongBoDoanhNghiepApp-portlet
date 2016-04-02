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

import vn.dtt.duongbien.dao.vrcb.NoSuchTempHealthCrewPassengerListException;
import vn.dtt.duongbien.dao.vrcb.model.TempHealthCrewPassengerList;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempHealthCrewPassengerListImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempHealthCrewPassengerListModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the temp health crew passenger list service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see TempHealthCrewPassengerListPersistence
 * @see TempHealthCrewPassengerListUtil
 * @generated
 */
public class TempHealthCrewPassengerListPersistenceImpl
	extends BasePersistenceImpl<TempHealthCrewPassengerList>
	implements TempHealthCrewPassengerListPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TempHealthCrewPassengerListUtil} to access the temp health crew passenger list persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TempHealthCrewPassengerListImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TempHealthCrewPassengerListModelImpl.ENTITY_CACHE_ENABLED,
			TempHealthCrewPassengerListModelImpl.FINDER_CACHE_ENABLED,
			TempHealthCrewPassengerListImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TempHealthCrewPassengerListModelImpl.ENTITY_CACHE_ENABLED,
			TempHealthCrewPassengerListModelImpl.FINDER_CACHE_ENABLED,
			TempHealthCrewPassengerListImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TempHealthCrewPassengerListModelImpl.ENTITY_CACHE_ENABLED,
			TempHealthCrewPassengerListModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempHealthCrewPassengerListModelImpl.ENTITY_CACHE_ENABLED,
			TempHealthCrewPassengerListModelImpl.FINDER_CACHE_ENABLED,
			TempHealthCrewPassengerListImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRequestCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempHealthCrewPassengerListModelImpl.ENTITY_CACHE_ENABLED,
			TempHealthCrewPassengerListModelImpl.FINDER_CACHE_ENABLED,
			TempHealthCrewPassengerListImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRequestCode",
			new String[] { String.class.getName() },
			TempHealthCrewPassengerListModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE = new FinderPath(TempHealthCrewPassengerListModelImpl.ENTITY_CACHE_ENABLED,
			TempHealthCrewPassengerListModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByRequestCode", new String[] { String.class.getName() });

	/**
	 * Returns all the temp health crew passenger lists where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the matching temp health crew passenger lists
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempHealthCrewPassengerList> findByRequestCode(
		String requestCode) throws SystemException {
		return findByRequestCode(requestCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp health crew passenger lists where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempHealthCrewPassengerListModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp health crew passenger lists
	 * @param end the upper bound of the range of temp health crew passenger lists (not inclusive)
	 * @return the range of matching temp health crew passenger lists
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempHealthCrewPassengerList> findByRequestCode(
		String requestCode, int start, int end) throws SystemException {
		return findByRequestCode(requestCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp health crew passenger lists where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempHealthCrewPassengerListModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp health crew passenger lists
	 * @param end the upper bound of the range of temp health crew passenger lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp health crew passenger lists
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempHealthCrewPassengerList> findByRequestCode(
		String requestCode, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE;
			finderArgs = new Object[] { requestCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTCODE;
			finderArgs = new Object[] { requestCode, start, end, orderByComparator };
		}

		List<TempHealthCrewPassengerList> list = (List<TempHealthCrewPassengerList>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempHealthCrewPassengerList tempHealthCrewPassengerList : list) {
				if (!Validator.equals(requestCode,
							tempHealthCrewPassengerList.getRequestCode())) {
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

			query.append(_SQL_SELECT_TEMPHEALTHCREWPASSENGERLIST_WHERE);

			boolean bindRequestCode = false;

			if (requestCode == null) {
				query.append(_FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1);
			}
			else if (requestCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3);
			}
			else {
				bindRequestCode = true;

				query.append(_FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TempHealthCrewPassengerListModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRequestCode) {
					qPos.add(requestCode);
				}

				if (!pagination) {
					list = (List<TempHealthCrewPassengerList>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempHealthCrewPassengerList>(list);
				}
				else {
					list = (List<TempHealthCrewPassengerList>)QueryUtil.list(q,
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
	 * Returns the first temp health crew passenger list in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp health crew passenger list
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempHealthCrewPassengerListException if a matching temp health crew passenger list could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempHealthCrewPassengerList findByRequestCode_First(
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempHealthCrewPassengerListException, SystemException {
		TempHealthCrewPassengerList tempHealthCrewPassengerList = fetchByRequestCode_First(requestCode,
				orderByComparator);

		if (tempHealthCrewPassengerList != null) {
			return tempHealthCrewPassengerList;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempHealthCrewPassengerListException(msg.toString());
	}

	/**
	 * Returns the first temp health crew passenger list in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp health crew passenger list, or <code>null</code> if a matching temp health crew passenger list could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempHealthCrewPassengerList fetchByRequestCode_First(
		String requestCode, OrderByComparator orderByComparator)
		throws SystemException {
		List<TempHealthCrewPassengerList> list = findByRequestCode(requestCode,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp health crew passenger list in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp health crew passenger list
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempHealthCrewPassengerListException if a matching temp health crew passenger list could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempHealthCrewPassengerList findByRequestCode_Last(
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempHealthCrewPassengerListException, SystemException {
		TempHealthCrewPassengerList tempHealthCrewPassengerList = fetchByRequestCode_Last(requestCode,
				orderByComparator);

		if (tempHealthCrewPassengerList != null) {
			return tempHealthCrewPassengerList;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempHealthCrewPassengerListException(msg.toString());
	}

	/**
	 * Returns the last temp health crew passenger list in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp health crew passenger list, or <code>null</code> if a matching temp health crew passenger list could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempHealthCrewPassengerList fetchByRequestCode_Last(
		String requestCode, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByRequestCode(requestCode);

		if (count == 0) {
			return null;
		}

		List<TempHealthCrewPassengerList> list = findByRequestCode(requestCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp health crew passenger lists before and after the current temp health crew passenger list in the ordered set where requestCode = &#63;.
	 *
	 * @param id the primary key of the current temp health crew passenger list
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp health crew passenger list
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempHealthCrewPassengerListException if a temp health crew passenger list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempHealthCrewPassengerList[] findByRequestCode_PrevAndNext(
		long id, String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempHealthCrewPassengerListException, SystemException {
		TempHealthCrewPassengerList tempHealthCrewPassengerList = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempHealthCrewPassengerList[] array = new TempHealthCrewPassengerListImpl[3];

			array[0] = getByRequestCode_PrevAndNext(session,
					tempHealthCrewPassengerList, requestCode,
					orderByComparator, true);

			array[1] = tempHealthCrewPassengerList;

			array[2] = getByRequestCode_PrevAndNext(session,
					tempHealthCrewPassengerList, requestCode,
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

	protected TempHealthCrewPassengerList getByRequestCode_PrevAndNext(
		Session session,
		TempHealthCrewPassengerList tempHealthCrewPassengerList,
		String requestCode, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TEMPHEALTHCREWPASSENGERLIST_WHERE);

		boolean bindRequestCode = false;

		if (requestCode == null) {
			query.append(_FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1);
		}
		else if (requestCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3);
		}
		else {
			bindRequestCode = true;

			query.append(_FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2);
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
			query.append(TempHealthCrewPassengerListModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindRequestCode) {
			qPos.add(requestCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tempHealthCrewPassengerList);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempHealthCrewPassengerList> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp health crew passenger lists where requestCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByRequestCode(String requestCode)
		throws SystemException {
		for (TempHealthCrewPassengerList tempHealthCrewPassengerList : findByRequestCode(
				requestCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tempHealthCrewPassengerList);
		}
	}

	/**
	 * Returns the number of temp health crew passenger lists where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the number of matching temp health crew passenger lists
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByRequestCode(String requestCode) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REQUESTCODE;

		Object[] finderArgs = new Object[] { requestCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TEMPHEALTHCREWPASSENGERLIST_WHERE);

			boolean bindRequestCode = false;

			if (requestCode == null) {
				query.append(_FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1);
			}
			else if (requestCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3);
			}
			else {
				bindRequestCode = true;

				query.append(_FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRequestCode) {
					qPos.add(requestCode);
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

	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1 = "tempHealthCrewPassengerList.requestCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2 = "tempHealthCrewPassengerList.requestCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3 = "(tempHealthCrewPassengerList.requestCode IS NULL OR tempHealthCrewPassengerList.requestCode = '')";

	public TempHealthCrewPassengerListPersistenceImpl() {
		setModelClass(TempHealthCrewPassengerList.class);
	}

	/**
	 * Caches the temp health crew passenger list in the entity cache if it is enabled.
	 *
	 * @param tempHealthCrewPassengerList the temp health crew passenger list
	 */
	@Override
	public void cacheResult(
		TempHealthCrewPassengerList tempHealthCrewPassengerList) {
		EntityCacheUtil.putResult(TempHealthCrewPassengerListModelImpl.ENTITY_CACHE_ENABLED,
			TempHealthCrewPassengerListImpl.class,
			tempHealthCrewPassengerList.getPrimaryKey(),
			tempHealthCrewPassengerList);

		tempHealthCrewPassengerList.resetOriginalValues();
	}

	/**
	 * Caches the temp health crew passenger lists in the entity cache if it is enabled.
	 *
	 * @param tempHealthCrewPassengerLists the temp health crew passenger lists
	 */
	@Override
	public void cacheResult(
		List<TempHealthCrewPassengerList> tempHealthCrewPassengerLists) {
		for (TempHealthCrewPassengerList tempHealthCrewPassengerList : tempHealthCrewPassengerLists) {
			if (EntityCacheUtil.getResult(
						TempHealthCrewPassengerListModelImpl.ENTITY_CACHE_ENABLED,
						TempHealthCrewPassengerListImpl.class,
						tempHealthCrewPassengerList.getPrimaryKey()) == null) {
				cacheResult(tempHealthCrewPassengerList);
			}
			else {
				tempHealthCrewPassengerList.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all temp health crew passenger lists.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TempHealthCrewPassengerListImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TempHealthCrewPassengerListImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the temp health crew passenger list.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		TempHealthCrewPassengerList tempHealthCrewPassengerList) {
		EntityCacheUtil.removeResult(TempHealthCrewPassengerListModelImpl.ENTITY_CACHE_ENABLED,
			TempHealthCrewPassengerListImpl.class,
			tempHealthCrewPassengerList.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<TempHealthCrewPassengerList> tempHealthCrewPassengerLists) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TempHealthCrewPassengerList tempHealthCrewPassengerList : tempHealthCrewPassengerLists) {
			EntityCacheUtil.removeResult(TempHealthCrewPassengerListModelImpl.ENTITY_CACHE_ENABLED,
				TempHealthCrewPassengerListImpl.class,
				tempHealthCrewPassengerList.getPrimaryKey());
		}
	}

	/**
	 * Creates a new temp health crew passenger list with the primary key. Does not add the temp health crew passenger list to the database.
	 *
	 * @param id the primary key for the new temp health crew passenger list
	 * @return the new temp health crew passenger list
	 */
	@Override
	public TempHealthCrewPassengerList create(long id) {
		TempHealthCrewPassengerList tempHealthCrewPassengerList = new TempHealthCrewPassengerListImpl();

		tempHealthCrewPassengerList.setNew(true);
		tempHealthCrewPassengerList.setPrimaryKey(id);

		return tempHealthCrewPassengerList;
	}

	/**
	 * Removes the temp health crew passenger list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the temp health crew passenger list
	 * @return the temp health crew passenger list that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempHealthCrewPassengerListException if a temp health crew passenger list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempHealthCrewPassengerList remove(long id)
		throws NoSuchTempHealthCrewPassengerListException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the temp health crew passenger list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the temp health crew passenger list
	 * @return the temp health crew passenger list that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempHealthCrewPassengerListException if a temp health crew passenger list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempHealthCrewPassengerList remove(Serializable primaryKey)
		throws NoSuchTempHealthCrewPassengerListException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TempHealthCrewPassengerList tempHealthCrewPassengerList = (TempHealthCrewPassengerList)session.get(TempHealthCrewPassengerListImpl.class,
					primaryKey);

			if (tempHealthCrewPassengerList == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTempHealthCrewPassengerListException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tempHealthCrewPassengerList);
		}
		catch (NoSuchTempHealthCrewPassengerListException nsee) {
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
	protected TempHealthCrewPassengerList removeImpl(
		TempHealthCrewPassengerList tempHealthCrewPassengerList)
		throws SystemException {
		tempHealthCrewPassengerList = toUnwrappedModel(tempHealthCrewPassengerList);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tempHealthCrewPassengerList)) {
				tempHealthCrewPassengerList = (TempHealthCrewPassengerList)session.get(TempHealthCrewPassengerListImpl.class,
						tempHealthCrewPassengerList.getPrimaryKeyObj());
			}

			if (tempHealthCrewPassengerList != null) {
				session.delete(tempHealthCrewPassengerList);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tempHealthCrewPassengerList != null) {
			clearCache(tempHealthCrewPassengerList);
		}

		return tempHealthCrewPassengerList;
	}

	@Override
	public TempHealthCrewPassengerList updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.TempHealthCrewPassengerList tempHealthCrewPassengerList)
		throws SystemException {
		tempHealthCrewPassengerList = toUnwrappedModel(tempHealthCrewPassengerList);

		boolean isNew = tempHealthCrewPassengerList.isNew();

		TempHealthCrewPassengerListModelImpl tempHealthCrewPassengerListModelImpl =
			(TempHealthCrewPassengerListModelImpl)tempHealthCrewPassengerList;

		Session session = null;

		try {
			session = openSession();

			if (tempHealthCrewPassengerList.isNew()) {
				session.save(tempHealthCrewPassengerList);

				tempHealthCrewPassengerList.setNew(false);
			}
			else {
				session.merge(tempHealthCrewPassengerList);
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
				!TempHealthCrewPassengerListModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tempHealthCrewPassengerListModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempHealthCrewPassengerListModelImpl.getOriginalRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);

				args = new Object[] {
						tempHealthCrewPassengerListModelImpl.getRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(TempHealthCrewPassengerListModelImpl.ENTITY_CACHE_ENABLED,
			TempHealthCrewPassengerListImpl.class,
			tempHealthCrewPassengerList.getPrimaryKey(),
			tempHealthCrewPassengerList);

		return tempHealthCrewPassengerList;
	}

	protected TempHealthCrewPassengerList toUnwrappedModel(
		TempHealthCrewPassengerList tempHealthCrewPassengerList) {
		if (tempHealthCrewPassengerList instanceof TempHealthCrewPassengerListImpl) {
			return tempHealthCrewPassengerList;
		}

		TempHealthCrewPassengerListImpl tempHealthCrewPassengerListImpl = new TempHealthCrewPassengerListImpl();

		tempHealthCrewPassengerListImpl.setNew(tempHealthCrewPassengerList.isNew());
		tempHealthCrewPassengerListImpl.setPrimaryKey(tempHealthCrewPassengerList.getPrimaryKey());

		tempHealthCrewPassengerListImpl.setId(tempHealthCrewPassengerList.getId());
		tempHealthCrewPassengerListImpl.setRequestCode(tempHealthCrewPassengerList.getRequestCode());
		tempHealthCrewPassengerListImpl.setHealthCrewPassengerCode(tempHealthCrewPassengerList.getHealthCrewPassengerCode());
		tempHealthCrewPassengerListImpl.setPassengerOrCrewCode(tempHealthCrewPassengerList.getPassengerOrCrewCode());
		tempHealthCrewPassengerListImpl.setPassengerOrCrewName(tempHealthCrewPassengerList.getPassengerOrCrewName());
		tempHealthCrewPassengerListImpl.setClassOrRating(tempHealthCrewPassengerList.getClassOrRating());
		tempHealthCrewPassengerListImpl.setStateVisitedCode(tempHealthCrewPassengerList.getStateVisitedCode());
		tempHealthCrewPassengerListImpl.setPortVisitedCode(tempHealthCrewPassengerList.getPortVisitedCode());
		tempHealthCrewPassengerListImpl.setFromDate(tempHealthCrewPassengerList.getFromDate());
		tempHealthCrewPassengerListImpl.setToDate(tempHealthCrewPassengerList.getToDate());

		return tempHealthCrewPassengerListImpl;
	}

	/**
	 * Returns the temp health crew passenger list with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp health crew passenger list
	 * @return the temp health crew passenger list
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempHealthCrewPassengerListException if a temp health crew passenger list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempHealthCrewPassengerList findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTempHealthCrewPassengerListException, SystemException {
		TempHealthCrewPassengerList tempHealthCrewPassengerList = fetchByPrimaryKey(primaryKey);

		if (tempHealthCrewPassengerList == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTempHealthCrewPassengerListException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tempHealthCrewPassengerList;
	}

	/**
	 * Returns the temp health crew passenger list with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchTempHealthCrewPassengerListException} if it could not be found.
	 *
	 * @param id the primary key of the temp health crew passenger list
	 * @return the temp health crew passenger list
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempHealthCrewPassengerListException if a temp health crew passenger list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempHealthCrewPassengerList findByPrimaryKey(long id)
		throws NoSuchTempHealthCrewPassengerListException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the temp health crew passenger list with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp health crew passenger list
	 * @return the temp health crew passenger list, or <code>null</code> if a temp health crew passenger list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempHealthCrewPassengerList fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		TempHealthCrewPassengerList tempHealthCrewPassengerList = (TempHealthCrewPassengerList)EntityCacheUtil.getResult(TempHealthCrewPassengerListModelImpl.ENTITY_CACHE_ENABLED,
				TempHealthCrewPassengerListImpl.class, primaryKey);

		if (tempHealthCrewPassengerList == _nullTempHealthCrewPassengerList) {
			return null;
		}

		if (tempHealthCrewPassengerList == null) {
			Session session = null;

			try {
				session = openSession();

				tempHealthCrewPassengerList = (TempHealthCrewPassengerList)session.get(TempHealthCrewPassengerListImpl.class,
						primaryKey);

				if (tempHealthCrewPassengerList != null) {
					cacheResult(tempHealthCrewPassengerList);
				}
				else {
					EntityCacheUtil.putResult(TempHealthCrewPassengerListModelImpl.ENTITY_CACHE_ENABLED,
						TempHealthCrewPassengerListImpl.class, primaryKey,
						_nullTempHealthCrewPassengerList);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TempHealthCrewPassengerListModelImpl.ENTITY_CACHE_ENABLED,
					TempHealthCrewPassengerListImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tempHealthCrewPassengerList;
	}

	/**
	 * Returns the temp health crew passenger list with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the temp health crew passenger list
	 * @return the temp health crew passenger list, or <code>null</code> if a temp health crew passenger list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempHealthCrewPassengerList fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the temp health crew passenger lists.
	 *
	 * @return the temp health crew passenger lists
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempHealthCrewPassengerList> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp health crew passenger lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempHealthCrewPassengerListModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp health crew passenger lists
	 * @param end the upper bound of the range of temp health crew passenger lists (not inclusive)
	 * @return the range of temp health crew passenger lists
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempHealthCrewPassengerList> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp health crew passenger lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempHealthCrewPassengerListModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp health crew passenger lists
	 * @param end the upper bound of the range of temp health crew passenger lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of temp health crew passenger lists
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempHealthCrewPassengerList> findAll(int start, int end,
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

		List<TempHealthCrewPassengerList> list = (List<TempHealthCrewPassengerList>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TEMPHEALTHCREWPASSENGERLIST);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TEMPHEALTHCREWPASSENGERLIST;

				if (pagination) {
					sql = sql.concat(TempHealthCrewPassengerListModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TempHealthCrewPassengerList>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempHealthCrewPassengerList>(list);
				}
				else {
					list = (List<TempHealthCrewPassengerList>)QueryUtil.list(q,
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
	 * Removes all the temp health crew passenger lists from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TempHealthCrewPassengerList tempHealthCrewPassengerList : findAll()) {
			remove(tempHealthCrewPassengerList);
		}
	}

	/**
	 * Returns the number of temp health crew passenger lists.
	 *
	 * @return the number of temp health crew passenger lists
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

				Query q = session.createQuery(_SQL_COUNT_TEMPHEALTHCREWPASSENGERLIST);

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
	 * Initializes the temp health crew passenger list persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.TempHealthCrewPassengerList")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TempHealthCrewPassengerList>> listenersList = new ArrayList<ModelListener<TempHealthCrewPassengerList>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TempHealthCrewPassengerList>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TempHealthCrewPassengerListImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TEMPHEALTHCREWPASSENGERLIST = "SELECT tempHealthCrewPassengerList FROM TempHealthCrewPassengerList tempHealthCrewPassengerList";
	private static final String _SQL_SELECT_TEMPHEALTHCREWPASSENGERLIST_WHERE = "SELECT tempHealthCrewPassengerList FROM TempHealthCrewPassengerList tempHealthCrewPassengerList WHERE ";
	private static final String _SQL_COUNT_TEMPHEALTHCREWPASSENGERLIST = "SELECT COUNT(tempHealthCrewPassengerList) FROM TempHealthCrewPassengerList tempHealthCrewPassengerList";
	private static final String _SQL_COUNT_TEMPHEALTHCREWPASSENGERLIST_WHERE = "SELECT COUNT(tempHealthCrewPassengerList) FROM TempHealthCrewPassengerList tempHealthCrewPassengerList WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tempHealthCrewPassengerList.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TempHealthCrewPassengerList exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TempHealthCrewPassengerList exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TempHealthCrewPassengerListPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "requestCode", "healthCrewPassengerCode",
				"passengerOrCrewCode", "passengerOrCrewName", "classOrRating",
				"stateVisitedCode", "portVisitedCode", "fromDate", "toDate"
			});
	private static TempHealthCrewPassengerList _nullTempHealthCrewPassengerList = new TempHealthCrewPassengerListImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TempHealthCrewPassengerList> toCacheModel() {
				return _nullTempHealthCrewPassengerListCacheModel;
			}
		};

	private static CacheModel<TempHealthCrewPassengerList> _nullTempHealthCrewPassengerListCacheModel =
		new CacheModel<TempHealthCrewPassengerList>() {
			@Override
			public TempHealthCrewPassengerList toEntityModel() {
				return _nullTempHealthCrewPassengerList;
			}
		};
}