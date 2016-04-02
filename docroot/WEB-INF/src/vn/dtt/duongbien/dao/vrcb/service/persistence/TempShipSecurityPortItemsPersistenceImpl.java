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

import vn.dtt.duongbien.dao.vrcb.NoSuchTempShipSecurityPortItemsException;
import vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityPortItems;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempShipSecurityPortItemsImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempShipSecurityPortItemsModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the temp ship security port items service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see TempShipSecurityPortItemsPersistence
 * @see TempShipSecurityPortItemsUtil
 * @generated
 */
public class TempShipSecurityPortItemsPersistenceImpl
	extends BasePersistenceImpl<TempShipSecurityPortItems>
	implements TempShipSecurityPortItemsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TempShipSecurityPortItemsUtil} to access the temp ship security port items persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TempShipSecurityPortItemsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TempShipSecurityPortItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempShipSecurityPortItemsModelImpl.FINDER_CACHE_ENABLED,
			TempShipSecurityPortItemsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TempShipSecurityPortItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempShipSecurityPortItemsModelImpl.FINDER_CACHE_ENABLED,
			TempShipSecurityPortItemsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TempShipSecurityPortItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempShipSecurityPortItemsModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempShipSecurityPortItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempShipSecurityPortItemsModelImpl.FINDER_CACHE_ENABLED,
			TempShipSecurityPortItemsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRequestCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempShipSecurityPortItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempShipSecurityPortItemsModelImpl.FINDER_CACHE_ENABLED,
			TempShipSecurityPortItemsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRequestCode",
			new String[] { String.class.getName() },
			TempShipSecurityPortItemsModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE = new FinderPath(TempShipSecurityPortItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempShipSecurityPortItemsModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByRequestCode", new String[] { String.class.getName() });

	/**
	 * Returns all the temp ship security port itemses where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the matching temp ship security port itemses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempShipSecurityPortItems> findByRequestCode(String requestCode)
		throws SystemException {
		return findByRequestCode(requestCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp ship security port itemses where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempShipSecurityPortItemsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp ship security port itemses
	 * @param end the upper bound of the range of temp ship security port itemses (not inclusive)
	 * @return the range of matching temp ship security port itemses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempShipSecurityPortItems> findByRequestCode(
		String requestCode, int start, int end) throws SystemException {
		return findByRequestCode(requestCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp ship security port itemses where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempShipSecurityPortItemsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp ship security port itemses
	 * @param end the upper bound of the range of temp ship security port itemses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp ship security port itemses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempShipSecurityPortItems> findByRequestCode(
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

		List<TempShipSecurityPortItems> list = (List<TempShipSecurityPortItems>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempShipSecurityPortItems tempShipSecurityPortItems : list) {
				if (!Validator.equals(requestCode,
							tempShipSecurityPortItems.getRequestCode())) {
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

			query.append(_SQL_SELECT_TEMPSHIPSECURITYPORTITEMS_WHERE);

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
				query.append(TempShipSecurityPortItemsModelImpl.ORDER_BY_JPQL);
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
					list = (List<TempShipSecurityPortItems>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempShipSecurityPortItems>(list);
				}
				else {
					list = (List<TempShipSecurityPortItems>)QueryUtil.list(q,
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
	 * Returns the first temp ship security port items in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp ship security port items
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempShipSecurityPortItemsException if a matching temp ship security port items could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipSecurityPortItems findByRequestCode_First(
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempShipSecurityPortItemsException, SystemException {
		TempShipSecurityPortItems tempShipSecurityPortItems = fetchByRequestCode_First(requestCode,
				orderByComparator);

		if (tempShipSecurityPortItems != null) {
			return tempShipSecurityPortItems;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempShipSecurityPortItemsException(msg.toString());
	}

	/**
	 * Returns the first temp ship security port items in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp ship security port items, or <code>null</code> if a matching temp ship security port items could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipSecurityPortItems fetchByRequestCode_First(
		String requestCode, OrderByComparator orderByComparator)
		throws SystemException {
		List<TempShipSecurityPortItems> list = findByRequestCode(requestCode,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp ship security port items in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp ship security port items
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempShipSecurityPortItemsException if a matching temp ship security port items could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipSecurityPortItems findByRequestCode_Last(
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempShipSecurityPortItemsException, SystemException {
		TempShipSecurityPortItems tempShipSecurityPortItems = fetchByRequestCode_Last(requestCode,
				orderByComparator);

		if (tempShipSecurityPortItems != null) {
			return tempShipSecurityPortItems;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempShipSecurityPortItemsException(msg.toString());
	}

	/**
	 * Returns the last temp ship security port items in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp ship security port items, or <code>null</code> if a matching temp ship security port items could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipSecurityPortItems fetchByRequestCode_Last(
		String requestCode, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByRequestCode(requestCode);

		if (count == 0) {
			return null;
		}

		List<TempShipSecurityPortItems> list = findByRequestCode(requestCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp ship security port itemses before and after the current temp ship security port items in the ordered set where requestCode = &#63;.
	 *
	 * @param id the primary key of the current temp ship security port items
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp ship security port items
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempShipSecurityPortItemsException if a temp ship security port items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipSecurityPortItems[] findByRequestCode_PrevAndNext(long id,
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempShipSecurityPortItemsException, SystemException {
		TempShipSecurityPortItems tempShipSecurityPortItems = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempShipSecurityPortItems[] array = new TempShipSecurityPortItemsImpl[3];

			array[0] = getByRequestCode_PrevAndNext(session,
					tempShipSecurityPortItems, requestCode, orderByComparator,
					true);

			array[1] = tempShipSecurityPortItems;

			array[2] = getByRequestCode_PrevAndNext(session,
					tempShipSecurityPortItems, requestCode, orderByComparator,
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

	protected TempShipSecurityPortItems getByRequestCode_PrevAndNext(
		Session session, TempShipSecurityPortItems tempShipSecurityPortItems,
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

		query.append(_SQL_SELECT_TEMPSHIPSECURITYPORTITEMS_WHERE);

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
			query.append(TempShipSecurityPortItemsModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(tempShipSecurityPortItems);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempShipSecurityPortItems> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp ship security port itemses where requestCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByRequestCode(String requestCode)
		throws SystemException {
		for (TempShipSecurityPortItems tempShipSecurityPortItems : findByRequestCode(
				requestCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tempShipSecurityPortItems);
		}
	}

	/**
	 * Returns the number of temp ship security port itemses where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the number of matching temp ship security port itemses
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

			query.append(_SQL_COUNT_TEMPSHIPSECURITYPORTITEMS_WHERE);

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

	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1 = "tempShipSecurityPortItems.requestCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2 = "tempShipSecurityPortItems.requestCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3 = "(tempShipSecurityPortItems.requestCode IS NULL OR tempShipSecurityPortItems.requestCode = '')";

	public TempShipSecurityPortItemsPersistenceImpl() {
		setModelClass(TempShipSecurityPortItems.class);
	}

	/**
	 * Caches the temp ship security port items in the entity cache if it is enabled.
	 *
	 * @param tempShipSecurityPortItems the temp ship security port items
	 */
	@Override
	public void cacheResult(TempShipSecurityPortItems tempShipSecurityPortItems) {
		EntityCacheUtil.putResult(TempShipSecurityPortItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempShipSecurityPortItemsImpl.class,
			tempShipSecurityPortItems.getPrimaryKey(), tempShipSecurityPortItems);

		tempShipSecurityPortItems.resetOriginalValues();
	}

	/**
	 * Caches the temp ship security port itemses in the entity cache if it is enabled.
	 *
	 * @param tempShipSecurityPortItemses the temp ship security port itemses
	 */
	@Override
	public void cacheResult(
		List<TempShipSecurityPortItems> tempShipSecurityPortItemses) {
		for (TempShipSecurityPortItems tempShipSecurityPortItems : tempShipSecurityPortItemses) {
			if (EntityCacheUtil.getResult(
						TempShipSecurityPortItemsModelImpl.ENTITY_CACHE_ENABLED,
						TempShipSecurityPortItemsImpl.class,
						tempShipSecurityPortItems.getPrimaryKey()) == null) {
				cacheResult(tempShipSecurityPortItems);
			}
			else {
				tempShipSecurityPortItems.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all temp ship security port itemses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TempShipSecurityPortItemsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TempShipSecurityPortItemsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the temp ship security port items.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TempShipSecurityPortItems tempShipSecurityPortItems) {
		EntityCacheUtil.removeResult(TempShipSecurityPortItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempShipSecurityPortItemsImpl.class,
			tempShipSecurityPortItems.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<TempShipSecurityPortItems> tempShipSecurityPortItemses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TempShipSecurityPortItems tempShipSecurityPortItems : tempShipSecurityPortItemses) {
			EntityCacheUtil.removeResult(TempShipSecurityPortItemsModelImpl.ENTITY_CACHE_ENABLED,
				TempShipSecurityPortItemsImpl.class,
				tempShipSecurityPortItems.getPrimaryKey());
		}
	}

	/**
	 * Creates a new temp ship security port items with the primary key. Does not add the temp ship security port items to the database.
	 *
	 * @param id the primary key for the new temp ship security port items
	 * @return the new temp ship security port items
	 */
	@Override
	public TempShipSecurityPortItems create(long id) {
		TempShipSecurityPortItems tempShipSecurityPortItems = new TempShipSecurityPortItemsImpl();

		tempShipSecurityPortItems.setNew(true);
		tempShipSecurityPortItems.setPrimaryKey(id);

		return tempShipSecurityPortItems;
	}

	/**
	 * Removes the temp ship security port items with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the temp ship security port items
	 * @return the temp ship security port items that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempShipSecurityPortItemsException if a temp ship security port items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipSecurityPortItems remove(long id)
		throws NoSuchTempShipSecurityPortItemsException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the temp ship security port items with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the temp ship security port items
	 * @return the temp ship security port items that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempShipSecurityPortItemsException if a temp ship security port items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipSecurityPortItems remove(Serializable primaryKey)
		throws NoSuchTempShipSecurityPortItemsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TempShipSecurityPortItems tempShipSecurityPortItems = (TempShipSecurityPortItems)session.get(TempShipSecurityPortItemsImpl.class,
					primaryKey);

			if (tempShipSecurityPortItems == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTempShipSecurityPortItemsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tempShipSecurityPortItems);
		}
		catch (NoSuchTempShipSecurityPortItemsException nsee) {
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
	protected TempShipSecurityPortItems removeImpl(
		TempShipSecurityPortItems tempShipSecurityPortItems)
		throws SystemException {
		tempShipSecurityPortItems = toUnwrappedModel(tempShipSecurityPortItems);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tempShipSecurityPortItems)) {
				tempShipSecurityPortItems = (TempShipSecurityPortItems)session.get(TempShipSecurityPortItemsImpl.class,
						tempShipSecurityPortItems.getPrimaryKeyObj());
			}

			if (tempShipSecurityPortItems != null) {
				session.delete(tempShipSecurityPortItems);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tempShipSecurityPortItems != null) {
			clearCache(tempShipSecurityPortItems);
		}

		return tempShipSecurityPortItems;
	}

	@Override
	public TempShipSecurityPortItems updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityPortItems tempShipSecurityPortItems)
		throws SystemException {
		tempShipSecurityPortItems = toUnwrappedModel(tempShipSecurityPortItems);

		boolean isNew = tempShipSecurityPortItems.isNew();

		TempShipSecurityPortItemsModelImpl tempShipSecurityPortItemsModelImpl = (TempShipSecurityPortItemsModelImpl)tempShipSecurityPortItems;

		Session session = null;

		try {
			session = openSession();

			if (tempShipSecurityPortItems.isNew()) {
				session.save(tempShipSecurityPortItems);

				tempShipSecurityPortItems.setNew(false);
			}
			else {
				session.merge(tempShipSecurityPortItems);
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
				!TempShipSecurityPortItemsModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tempShipSecurityPortItemsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempShipSecurityPortItemsModelImpl.getOriginalRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);

				args = new Object[] {
						tempShipSecurityPortItemsModelImpl.getRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(TempShipSecurityPortItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempShipSecurityPortItemsImpl.class,
			tempShipSecurityPortItems.getPrimaryKey(), tempShipSecurityPortItems);

		return tempShipSecurityPortItems;
	}

	protected TempShipSecurityPortItems toUnwrappedModel(
		TempShipSecurityPortItems tempShipSecurityPortItems) {
		if (tempShipSecurityPortItems instanceof TempShipSecurityPortItemsImpl) {
			return tempShipSecurityPortItems;
		}

		TempShipSecurityPortItemsImpl tempShipSecurityPortItemsImpl = new TempShipSecurityPortItemsImpl();

		tempShipSecurityPortItemsImpl.setNew(tempShipSecurityPortItems.isNew());
		tempShipSecurityPortItemsImpl.setPrimaryKey(tempShipSecurityPortItems.getPrimaryKey());

		tempShipSecurityPortItemsImpl.setId(tempShipSecurityPortItems.getId());
		tempShipSecurityPortItemsImpl.setRequestCode(tempShipSecurityPortItems.getRequestCode());
		tempShipSecurityPortItemsImpl.setShipSecurityPortItemCode(tempShipSecurityPortItems.getShipSecurityPortItemCode());
		tempShipSecurityPortItemsImpl.setPortCode(tempShipSecurityPortItems.getPortCode());
		tempShipSecurityPortItemsImpl.setDateArrival(tempShipSecurityPortItems.getDateArrival());
		tempShipSecurityPortItemsImpl.setDateDeparture(tempShipSecurityPortItems.getDateDeparture());
		tempShipSecurityPortItemsImpl.setSecurityLevelCode(tempShipSecurityPortItems.getSecurityLevelCode());

		return tempShipSecurityPortItemsImpl;
	}

	/**
	 * Returns the temp ship security port items with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp ship security port items
	 * @return the temp ship security port items
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempShipSecurityPortItemsException if a temp ship security port items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipSecurityPortItems findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTempShipSecurityPortItemsException, SystemException {
		TempShipSecurityPortItems tempShipSecurityPortItems = fetchByPrimaryKey(primaryKey);

		if (tempShipSecurityPortItems == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTempShipSecurityPortItemsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tempShipSecurityPortItems;
	}

	/**
	 * Returns the temp ship security port items with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchTempShipSecurityPortItemsException} if it could not be found.
	 *
	 * @param id the primary key of the temp ship security port items
	 * @return the temp ship security port items
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempShipSecurityPortItemsException if a temp ship security port items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipSecurityPortItems findByPrimaryKey(long id)
		throws NoSuchTempShipSecurityPortItemsException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the temp ship security port items with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp ship security port items
	 * @return the temp ship security port items, or <code>null</code> if a temp ship security port items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipSecurityPortItems fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TempShipSecurityPortItems tempShipSecurityPortItems = (TempShipSecurityPortItems)EntityCacheUtil.getResult(TempShipSecurityPortItemsModelImpl.ENTITY_CACHE_ENABLED,
				TempShipSecurityPortItemsImpl.class, primaryKey);

		if (tempShipSecurityPortItems == _nullTempShipSecurityPortItems) {
			return null;
		}

		if (tempShipSecurityPortItems == null) {
			Session session = null;

			try {
				session = openSession();

				tempShipSecurityPortItems = (TempShipSecurityPortItems)session.get(TempShipSecurityPortItemsImpl.class,
						primaryKey);

				if (tempShipSecurityPortItems != null) {
					cacheResult(tempShipSecurityPortItems);
				}
				else {
					EntityCacheUtil.putResult(TempShipSecurityPortItemsModelImpl.ENTITY_CACHE_ENABLED,
						TempShipSecurityPortItemsImpl.class, primaryKey,
						_nullTempShipSecurityPortItems);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TempShipSecurityPortItemsModelImpl.ENTITY_CACHE_ENABLED,
					TempShipSecurityPortItemsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tempShipSecurityPortItems;
	}

	/**
	 * Returns the temp ship security port items with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the temp ship security port items
	 * @return the temp ship security port items, or <code>null</code> if a temp ship security port items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipSecurityPortItems fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the temp ship security port itemses.
	 *
	 * @return the temp ship security port itemses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempShipSecurityPortItems> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp ship security port itemses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempShipSecurityPortItemsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp ship security port itemses
	 * @param end the upper bound of the range of temp ship security port itemses (not inclusive)
	 * @return the range of temp ship security port itemses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempShipSecurityPortItems> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp ship security port itemses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempShipSecurityPortItemsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp ship security port itemses
	 * @param end the upper bound of the range of temp ship security port itemses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of temp ship security port itemses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempShipSecurityPortItems> findAll(int start, int end,
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

		List<TempShipSecurityPortItems> list = (List<TempShipSecurityPortItems>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TEMPSHIPSECURITYPORTITEMS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TEMPSHIPSECURITYPORTITEMS;

				if (pagination) {
					sql = sql.concat(TempShipSecurityPortItemsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TempShipSecurityPortItems>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempShipSecurityPortItems>(list);
				}
				else {
					list = (List<TempShipSecurityPortItems>)QueryUtil.list(q,
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
	 * Removes all the temp ship security port itemses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TempShipSecurityPortItems tempShipSecurityPortItems : findAll()) {
			remove(tempShipSecurityPortItems);
		}
	}

	/**
	 * Returns the number of temp ship security port itemses.
	 *
	 * @return the number of temp ship security port itemses
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

				Query q = session.createQuery(_SQL_COUNT_TEMPSHIPSECURITYPORTITEMS);

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
	 * Initializes the temp ship security port items persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityPortItems")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TempShipSecurityPortItems>> listenersList = new ArrayList<ModelListener<TempShipSecurityPortItems>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TempShipSecurityPortItems>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TempShipSecurityPortItemsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TEMPSHIPSECURITYPORTITEMS = "SELECT tempShipSecurityPortItems FROM TempShipSecurityPortItems tempShipSecurityPortItems";
	private static final String _SQL_SELECT_TEMPSHIPSECURITYPORTITEMS_WHERE = "SELECT tempShipSecurityPortItems FROM TempShipSecurityPortItems tempShipSecurityPortItems WHERE ";
	private static final String _SQL_COUNT_TEMPSHIPSECURITYPORTITEMS = "SELECT COUNT(tempShipSecurityPortItems) FROM TempShipSecurityPortItems tempShipSecurityPortItems";
	private static final String _SQL_COUNT_TEMPSHIPSECURITYPORTITEMS_WHERE = "SELECT COUNT(tempShipSecurityPortItems) FROM TempShipSecurityPortItems tempShipSecurityPortItems WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tempShipSecurityPortItems.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TempShipSecurityPortItems exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TempShipSecurityPortItems exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TempShipSecurityPortItemsPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "requestCode", "shipSecurityPortItemCode", "portCode",
				"dateArrival", "dateDeparture", "securityLevelCode"
			});
	private static TempShipSecurityPortItems _nullTempShipSecurityPortItems = new TempShipSecurityPortItemsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TempShipSecurityPortItems> toCacheModel() {
				return _nullTempShipSecurityPortItemsCacheModel;
			}
		};

	private static CacheModel<TempShipSecurityPortItems> _nullTempShipSecurityPortItemsCacheModel =
		new CacheModel<TempShipSecurityPortItems>() {
			@Override
			public TempShipSecurityPortItems toEntityModel() {
				return _nullTempShipSecurityPortItems;
			}
		};
}