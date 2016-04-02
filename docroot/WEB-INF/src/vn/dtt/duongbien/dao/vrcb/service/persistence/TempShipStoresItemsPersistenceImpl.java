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

import vn.dtt.duongbien.dao.vrcb.NoSuchTempShipStoresItemsException;
import vn.dtt.duongbien.dao.vrcb.model.TempShipStoresItems;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempShipStoresItemsImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempShipStoresItemsModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the temp ship stores items service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see TempShipStoresItemsPersistence
 * @see TempShipStoresItemsUtil
 * @generated
 */
public class TempShipStoresItemsPersistenceImpl extends BasePersistenceImpl<TempShipStoresItems>
	implements TempShipStoresItemsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TempShipStoresItemsUtil} to access the temp ship stores items persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TempShipStoresItemsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TempShipStoresItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempShipStoresItemsModelImpl.FINDER_CACHE_ENABLED,
			TempShipStoresItemsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TempShipStoresItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempShipStoresItemsModelImpl.FINDER_CACHE_ENABLED,
			TempShipStoresItemsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TempShipStoresItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempShipStoresItemsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempShipStoresItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempShipStoresItemsModelImpl.FINDER_CACHE_ENABLED,
			TempShipStoresItemsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRequestCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempShipStoresItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempShipStoresItemsModelImpl.FINDER_CACHE_ENABLED,
			TempShipStoresItemsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRequestCode",
			new String[] { String.class.getName() },
			TempShipStoresItemsModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE = new FinderPath(TempShipStoresItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempShipStoresItemsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRequestCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the temp ship stores itemses where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the matching temp ship stores itemses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempShipStoresItems> findByRequestCode(String requestCode)
		throws SystemException {
		return findByRequestCode(requestCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp ship stores itemses where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempShipStoresItemsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp ship stores itemses
	 * @param end the upper bound of the range of temp ship stores itemses (not inclusive)
	 * @return the range of matching temp ship stores itemses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempShipStoresItems> findByRequestCode(String requestCode,
		int start, int end) throws SystemException {
		return findByRequestCode(requestCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp ship stores itemses where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempShipStoresItemsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp ship stores itemses
	 * @param end the upper bound of the range of temp ship stores itemses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp ship stores itemses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempShipStoresItems> findByRequestCode(String requestCode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
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

		List<TempShipStoresItems> list = (List<TempShipStoresItems>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempShipStoresItems tempShipStoresItems : list) {
				if (!Validator.equals(requestCode,
							tempShipStoresItems.getRequestCode())) {
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

			query.append(_SQL_SELECT_TEMPSHIPSTORESITEMS_WHERE);

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
				query.append(TempShipStoresItemsModelImpl.ORDER_BY_JPQL);
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
					list = (List<TempShipStoresItems>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempShipStoresItems>(list);
				}
				else {
					list = (List<TempShipStoresItems>)QueryUtil.list(q,
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
	 * Returns the first temp ship stores items in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp ship stores items
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempShipStoresItemsException if a matching temp ship stores items could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipStoresItems findByRequestCode_First(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempShipStoresItemsException, SystemException {
		TempShipStoresItems tempShipStoresItems = fetchByRequestCode_First(requestCode,
				orderByComparator);

		if (tempShipStoresItems != null) {
			return tempShipStoresItems;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempShipStoresItemsException(msg.toString());
	}

	/**
	 * Returns the first temp ship stores items in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp ship stores items, or <code>null</code> if a matching temp ship stores items could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipStoresItems fetchByRequestCode_First(String requestCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<TempShipStoresItems> list = findByRequestCode(requestCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp ship stores items in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp ship stores items
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempShipStoresItemsException if a matching temp ship stores items could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipStoresItems findByRequestCode_Last(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempShipStoresItemsException, SystemException {
		TempShipStoresItems tempShipStoresItems = fetchByRequestCode_Last(requestCode,
				orderByComparator);

		if (tempShipStoresItems != null) {
			return tempShipStoresItems;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempShipStoresItemsException(msg.toString());
	}

	/**
	 * Returns the last temp ship stores items in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp ship stores items, or <code>null</code> if a matching temp ship stores items could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipStoresItems fetchByRequestCode_Last(String requestCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByRequestCode(requestCode);

		if (count == 0) {
			return null;
		}

		List<TempShipStoresItems> list = findByRequestCode(requestCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp ship stores itemses before and after the current temp ship stores items in the ordered set where requestCode = &#63;.
	 *
	 * @param id the primary key of the current temp ship stores items
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp ship stores items
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempShipStoresItemsException if a temp ship stores items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipStoresItems[] findByRequestCode_PrevAndNext(long id,
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempShipStoresItemsException, SystemException {
		TempShipStoresItems tempShipStoresItems = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempShipStoresItems[] array = new TempShipStoresItemsImpl[3];

			array[0] = getByRequestCode_PrevAndNext(session,
					tempShipStoresItems, requestCode, orderByComparator, true);

			array[1] = tempShipStoresItems;

			array[2] = getByRequestCode_PrevAndNext(session,
					tempShipStoresItems, requestCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TempShipStoresItems getByRequestCode_PrevAndNext(
		Session session, TempShipStoresItems tempShipStoresItems,
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

		query.append(_SQL_SELECT_TEMPSHIPSTORESITEMS_WHERE);

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
			query.append(TempShipStoresItemsModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(tempShipStoresItems);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempShipStoresItems> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp ship stores itemses where requestCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByRequestCode(String requestCode)
		throws SystemException {
		for (TempShipStoresItems tempShipStoresItems : findByRequestCode(
				requestCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tempShipStoresItems);
		}
	}

	/**
	 * Returns the number of temp ship stores itemses where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the number of matching temp ship stores itemses
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

			query.append(_SQL_COUNT_TEMPSHIPSTORESITEMS_WHERE);

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

	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1 = "tempShipStoresItems.requestCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2 = "tempShipStoresItems.requestCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3 = "(tempShipStoresItems.requestCode IS NULL OR tempShipStoresItems.requestCode = '')";

	public TempShipStoresItemsPersistenceImpl() {
		setModelClass(TempShipStoresItems.class);
	}

	/**
	 * Caches the temp ship stores items in the entity cache if it is enabled.
	 *
	 * @param tempShipStoresItems the temp ship stores items
	 */
	@Override
	public void cacheResult(TempShipStoresItems tempShipStoresItems) {
		EntityCacheUtil.putResult(TempShipStoresItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempShipStoresItemsImpl.class, tempShipStoresItems.getPrimaryKey(),
			tempShipStoresItems);

		tempShipStoresItems.resetOriginalValues();
	}

	/**
	 * Caches the temp ship stores itemses in the entity cache if it is enabled.
	 *
	 * @param tempShipStoresItemses the temp ship stores itemses
	 */
	@Override
	public void cacheResult(List<TempShipStoresItems> tempShipStoresItemses) {
		for (TempShipStoresItems tempShipStoresItems : tempShipStoresItemses) {
			if (EntityCacheUtil.getResult(
						TempShipStoresItemsModelImpl.ENTITY_CACHE_ENABLED,
						TempShipStoresItemsImpl.class,
						tempShipStoresItems.getPrimaryKey()) == null) {
				cacheResult(tempShipStoresItems);
			}
			else {
				tempShipStoresItems.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all temp ship stores itemses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TempShipStoresItemsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TempShipStoresItemsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the temp ship stores items.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TempShipStoresItems tempShipStoresItems) {
		EntityCacheUtil.removeResult(TempShipStoresItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempShipStoresItemsImpl.class, tempShipStoresItems.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TempShipStoresItems> tempShipStoresItemses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TempShipStoresItems tempShipStoresItems : tempShipStoresItemses) {
			EntityCacheUtil.removeResult(TempShipStoresItemsModelImpl.ENTITY_CACHE_ENABLED,
				TempShipStoresItemsImpl.class,
				tempShipStoresItems.getPrimaryKey());
		}
	}

	/**
	 * Creates a new temp ship stores items with the primary key. Does not add the temp ship stores items to the database.
	 *
	 * @param id the primary key for the new temp ship stores items
	 * @return the new temp ship stores items
	 */
	@Override
	public TempShipStoresItems create(long id) {
		TempShipStoresItems tempShipStoresItems = new TempShipStoresItemsImpl();

		tempShipStoresItems.setNew(true);
		tempShipStoresItems.setPrimaryKey(id);

		return tempShipStoresItems;
	}

	/**
	 * Removes the temp ship stores items with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the temp ship stores items
	 * @return the temp ship stores items that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempShipStoresItemsException if a temp ship stores items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipStoresItems remove(long id)
		throws NoSuchTempShipStoresItemsException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the temp ship stores items with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the temp ship stores items
	 * @return the temp ship stores items that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempShipStoresItemsException if a temp ship stores items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipStoresItems remove(Serializable primaryKey)
		throws NoSuchTempShipStoresItemsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TempShipStoresItems tempShipStoresItems = (TempShipStoresItems)session.get(TempShipStoresItemsImpl.class,
					primaryKey);

			if (tempShipStoresItems == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTempShipStoresItemsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tempShipStoresItems);
		}
		catch (NoSuchTempShipStoresItemsException nsee) {
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
	protected TempShipStoresItems removeImpl(
		TempShipStoresItems tempShipStoresItems) throws SystemException {
		tempShipStoresItems = toUnwrappedModel(tempShipStoresItems);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tempShipStoresItems)) {
				tempShipStoresItems = (TempShipStoresItems)session.get(TempShipStoresItemsImpl.class,
						tempShipStoresItems.getPrimaryKeyObj());
			}

			if (tempShipStoresItems != null) {
				session.delete(tempShipStoresItems);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tempShipStoresItems != null) {
			clearCache(tempShipStoresItems);
		}

		return tempShipStoresItems;
	}

	@Override
	public TempShipStoresItems updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.TempShipStoresItems tempShipStoresItems)
		throws SystemException {
		tempShipStoresItems = toUnwrappedModel(tempShipStoresItems);

		boolean isNew = tempShipStoresItems.isNew();

		TempShipStoresItemsModelImpl tempShipStoresItemsModelImpl = (TempShipStoresItemsModelImpl)tempShipStoresItems;

		Session session = null;

		try {
			session = openSession();

			if (tempShipStoresItems.isNew()) {
				session.save(tempShipStoresItems);

				tempShipStoresItems.setNew(false);
			}
			else {
				session.merge(tempShipStoresItems);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TempShipStoresItemsModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tempShipStoresItemsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempShipStoresItemsModelImpl.getOriginalRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);

				args = new Object[] {
						tempShipStoresItemsModelImpl.getRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(TempShipStoresItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempShipStoresItemsImpl.class, tempShipStoresItems.getPrimaryKey(),
			tempShipStoresItems);

		return tempShipStoresItems;
	}

	protected TempShipStoresItems toUnwrappedModel(
		TempShipStoresItems tempShipStoresItems) {
		if (tempShipStoresItems instanceof TempShipStoresItemsImpl) {
			return tempShipStoresItems;
		}

		TempShipStoresItemsImpl tempShipStoresItemsImpl = new TempShipStoresItemsImpl();

		tempShipStoresItemsImpl.setNew(tempShipStoresItems.isNew());
		tempShipStoresItemsImpl.setPrimaryKey(tempShipStoresItems.getPrimaryKey());

		tempShipStoresItemsImpl.setId(tempShipStoresItems.getId());
		tempShipStoresItemsImpl.setRequestCode(tempShipStoresItems.getRequestCode());
		tempShipStoresItemsImpl.setShipsstoreItemCode(tempShipStoresItems.getShipsstoreItemCode());
		tempShipStoresItemsImpl.setNameOfArticle(tempShipStoresItems.getNameOfArticle());
		tempShipStoresItemsImpl.setQuantity(tempShipStoresItems.getQuantity());
		tempShipStoresItemsImpl.setQuantityUnit(tempShipStoresItems.getQuantityUnit());
		tempShipStoresItemsImpl.setLocationOnBoat(tempShipStoresItems.getLocationOnBoat());
		tempShipStoresItemsImpl.setUseInBoat(tempShipStoresItems.getUseInBoat());

		return tempShipStoresItemsImpl;
	}

	/**
	 * Returns the temp ship stores items with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp ship stores items
	 * @return the temp ship stores items
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempShipStoresItemsException if a temp ship stores items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipStoresItems findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTempShipStoresItemsException, SystemException {
		TempShipStoresItems tempShipStoresItems = fetchByPrimaryKey(primaryKey);

		if (tempShipStoresItems == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTempShipStoresItemsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tempShipStoresItems;
	}

	/**
	 * Returns the temp ship stores items with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchTempShipStoresItemsException} if it could not be found.
	 *
	 * @param id the primary key of the temp ship stores items
	 * @return the temp ship stores items
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempShipStoresItemsException if a temp ship stores items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipStoresItems findByPrimaryKey(long id)
		throws NoSuchTempShipStoresItemsException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the temp ship stores items with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp ship stores items
	 * @return the temp ship stores items, or <code>null</code> if a temp ship stores items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipStoresItems fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TempShipStoresItems tempShipStoresItems = (TempShipStoresItems)EntityCacheUtil.getResult(TempShipStoresItemsModelImpl.ENTITY_CACHE_ENABLED,
				TempShipStoresItemsImpl.class, primaryKey);

		if (tempShipStoresItems == _nullTempShipStoresItems) {
			return null;
		}

		if (tempShipStoresItems == null) {
			Session session = null;

			try {
				session = openSession();

				tempShipStoresItems = (TempShipStoresItems)session.get(TempShipStoresItemsImpl.class,
						primaryKey);

				if (tempShipStoresItems != null) {
					cacheResult(tempShipStoresItems);
				}
				else {
					EntityCacheUtil.putResult(TempShipStoresItemsModelImpl.ENTITY_CACHE_ENABLED,
						TempShipStoresItemsImpl.class, primaryKey,
						_nullTempShipStoresItems);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TempShipStoresItemsModelImpl.ENTITY_CACHE_ENABLED,
					TempShipStoresItemsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tempShipStoresItems;
	}

	/**
	 * Returns the temp ship stores items with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the temp ship stores items
	 * @return the temp ship stores items, or <code>null</code> if a temp ship stores items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipStoresItems fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the temp ship stores itemses.
	 *
	 * @return the temp ship stores itemses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempShipStoresItems> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp ship stores itemses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempShipStoresItemsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp ship stores itemses
	 * @param end the upper bound of the range of temp ship stores itemses (not inclusive)
	 * @return the range of temp ship stores itemses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempShipStoresItems> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp ship stores itemses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempShipStoresItemsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp ship stores itemses
	 * @param end the upper bound of the range of temp ship stores itemses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of temp ship stores itemses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempShipStoresItems> findAll(int start, int end,
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

		List<TempShipStoresItems> list = (List<TempShipStoresItems>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TEMPSHIPSTORESITEMS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TEMPSHIPSTORESITEMS;

				if (pagination) {
					sql = sql.concat(TempShipStoresItemsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TempShipStoresItems>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempShipStoresItems>(list);
				}
				else {
					list = (List<TempShipStoresItems>)QueryUtil.list(q,
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
	 * Removes all the temp ship stores itemses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TempShipStoresItems tempShipStoresItems : findAll()) {
			remove(tempShipStoresItems);
		}
	}

	/**
	 * Returns the number of temp ship stores itemses.
	 *
	 * @return the number of temp ship stores itemses
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

				Query q = session.createQuery(_SQL_COUNT_TEMPSHIPSTORESITEMS);

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
	 * Initializes the temp ship stores items persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.TempShipStoresItems")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TempShipStoresItems>> listenersList = new ArrayList<ModelListener<TempShipStoresItems>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TempShipStoresItems>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TempShipStoresItemsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TEMPSHIPSTORESITEMS = "SELECT tempShipStoresItems FROM TempShipStoresItems tempShipStoresItems";
	private static final String _SQL_SELECT_TEMPSHIPSTORESITEMS_WHERE = "SELECT tempShipStoresItems FROM TempShipStoresItems tempShipStoresItems WHERE ";
	private static final String _SQL_COUNT_TEMPSHIPSTORESITEMS = "SELECT COUNT(tempShipStoresItems) FROM TempShipStoresItems tempShipStoresItems";
	private static final String _SQL_COUNT_TEMPSHIPSTORESITEMS_WHERE = "SELECT COUNT(tempShipStoresItems) FROM TempShipStoresItems tempShipStoresItems WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tempShipStoresItems.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TempShipStoresItems exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TempShipStoresItems exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TempShipStoresItemsPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "requestCode", "shipsstoreItemCode", "nameOfArticle",
				"quantity", "quantityUnit", "locationOnBoat", "useInBoat"
			});
	private static TempShipStoresItems _nullTempShipStoresItems = new TempShipStoresItemsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TempShipStoresItems> toCacheModel() {
				return _nullTempShipStoresItemsCacheModel;
			}
		};

	private static CacheModel<TempShipStoresItems> _nullTempShipStoresItemsCacheModel =
		new CacheModel<TempShipStoresItems>() {
			@Override
			public TempShipStoresItems toEntityModel() {
				return _nullTempShipStoresItems;
			}
		};
}