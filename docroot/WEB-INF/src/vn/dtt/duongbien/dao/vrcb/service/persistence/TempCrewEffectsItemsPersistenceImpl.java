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

import vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewEffectsItemsException;
import vn.dtt.duongbien.dao.vrcb.model.TempCrewEffectsItems;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempCrewEffectsItemsImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempCrewEffectsItemsModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the temp crew effects items service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see TempCrewEffectsItemsPersistence
 * @see TempCrewEffectsItemsUtil
 * @generated
 */
public class TempCrewEffectsItemsPersistenceImpl extends BasePersistenceImpl<TempCrewEffectsItems>
	implements TempCrewEffectsItemsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TempCrewEffectsItemsUtil} to access the temp crew effects items persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TempCrewEffectsItemsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TempCrewEffectsItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewEffectsItemsModelImpl.FINDER_CACHE_ENABLED,
			TempCrewEffectsItemsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TempCrewEffectsItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewEffectsItemsModelImpl.FINDER_CACHE_ENABLED,
			TempCrewEffectsItemsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TempCrewEffectsItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewEffectsItemsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempCrewEffectsItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewEffectsItemsModelImpl.FINDER_CACHE_ENABLED,
			TempCrewEffectsItemsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRequestCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempCrewEffectsItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewEffectsItemsModelImpl.FINDER_CACHE_ENABLED,
			TempCrewEffectsItemsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRequestCode",
			new String[] { String.class.getName() },
			TempCrewEffectsItemsModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE = new FinderPath(TempCrewEffectsItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewEffectsItemsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRequestCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the temp crew effects itemses where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the matching temp crew effects itemses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCrewEffectsItems> findByRequestCode(String requestCode)
		throws SystemException {
		return findByRequestCode(requestCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp crew effects itemses where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempCrewEffectsItemsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp crew effects itemses
	 * @param end the upper bound of the range of temp crew effects itemses (not inclusive)
	 * @return the range of matching temp crew effects itemses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCrewEffectsItems> findByRequestCode(String requestCode,
		int start, int end) throws SystemException {
		return findByRequestCode(requestCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp crew effects itemses where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempCrewEffectsItemsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp crew effects itemses
	 * @param end the upper bound of the range of temp crew effects itemses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp crew effects itemses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCrewEffectsItems> findByRequestCode(String requestCode,
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

		List<TempCrewEffectsItems> list = (List<TempCrewEffectsItems>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempCrewEffectsItems tempCrewEffectsItems : list) {
				if (!Validator.equals(requestCode,
							tempCrewEffectsItems.getRequestCode())) {
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

			query.append(_SQL_SELECT_TEMPCREWEFFECTSITEMS_WHERE);

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
				query.append(TempCrewEffectsItemsModelImpl.ORDER_BY_JPQL);
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
					list = (List<TempCrewEffectsItems>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempCrewEffectsItems>(list);
				}
				else {
					list = (List<TempCrewEffectsItems>)QueryUtil.list(q,
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
	 * Returns the first temp crew effects items in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp crew effects items
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewEffectsItemsException if a matching temp crew effects items could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewEffectsItems findByRequestCode_First(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempCrewEffectsItemsException, SystemException {
		TempCrewEffectsItems tempCrewEffectsItems = fetchByRequestCode_First(requestCode,
				orderByComparator);

		if (tempCrewEffectsItems != null) {
			return tempCrewEffectsItems;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempCrewEffectsItemsException(msg.toString());
	}

	/**
	 * Returns the first temp crew effects items in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp crew effects items, or <code>null</code> if a matching temp crew effects items could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewEffectsItems fetchByRequestCode_First(String requestCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<TempCrewEffectsItems> list = findByRequestCode(requestCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp crew effects items in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp crew effects items
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewEffectsItemsException if a matching temp crew effects items could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewEffectsItems findByRequestCode_Last(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempCrewEffectsItemsException, SystemException {
		TempCrewEffectsItems tempCrewEffectsItems = fetchByRequestCode_Last(requestCode,
				orderByComparator);

		if (tempCrewEffectsItems != null) {
			return tempCrewEffectsItems;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempCrewEffectsItemsException(msg.toString());
	}

	/**
	 * Returns the last temp crew effects items in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp crew effects items, or <code>null</code> if a matching temp crew effects items could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewEffectsItems fetchByRequestCode_Last(String requestCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByRequestCode(requestCode);

		if (count == 0) {
			return null;
		}

		List<TempCrewEffectsItems> list = findByRequestCode(requestCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp crew effects itemses before and after the current temp crew effects items in the ordered set where requestCode = &#63;.
	 *
	 * @param id the primary key of the current temp crew effects items
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp crew effects items
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewEffectsItemsException if a temp crew effects items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewEffectsItems[] findByRequestCode_PrevAndNext(long id,
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempCrewEffectsItemsException, SystemException {
		TempCrewEffectsItems tempCrewEffectsItems = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempCrewEffectsItems[] array = new TempCrewEffectsItemsImpl[3];

			array[0] = getByRequestCode_PrevAndNext(session,
					tempCrewEffectsItems, requestCode, orderByComparator, true);

			array[1] = tempCrewEffectsItems;

			array[2] = getByRequestCode_PrevAndNext(session,
					tempCrewEffectsItems, requestCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TempCrewEffectsItems getByRequestCode_PrevAndNext(
		Session session, TempCrewEffectsItems tempCrewEffectsItems,
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

		query.append(_SQL_SELECT_TEMPCREWEFFECTSITEMS_WHERE);

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
			query.append(TempCrewEffectsItemsModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(tempCrewEffectsItems);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempCrewEffectsItems> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp crew effects itemses where requestCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByRequestCode(String requestCode)
		throws SystemException {
		for (TempCrewEffectsItems tempCrewEffectsItems : findByRequestCode(
				requestCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tempCrewEffectsItems);
		}
	}

	/**
	 * Returns the number of temp crew effects itemses where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the number of matching temp crew effects itemses
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

			query.append(_SQL_COUNT_TEMPCREWEFFECTSITEMS_WHERE);

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

	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1 = "tempCrewEffectsItems.requestCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2 = "tempCrewEffectsItems.requestCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3 = "(tempCrewEffectsItems.requestCode IS NULL OR tempCrewEffectsItems.requestCode = '')";

	public TempCrewEffectsItemsPersistenceImpl() {
		setModelClass(TempCrewEffectsItems.class);
	}

	/**
	 * Caches the temp crew effects items in the entity cache if it is enabled.
	 *
	 * @param tempCrewEffectsItems the temp crew effects items
	 */
	@Override
	public void cacheResult(TempCrewEffectsItems tempCrewEffectsItems) {
		EntityCacheUtil.putResult(TempCrewEffectsItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewEffectsItemsImpl.class,
			tempCrewEffectsItems.getPrimaryKey(), tempCrewEffectsItems);

		tempCrewEffectsItems.resetOriginalValues();
	}

	/**
	 * Caches the temp crew effects itemses in the entity cache if it is enabled.
	 *
	 * @param tempCrewEffectsItemses the temp crew effects itemses
	 */
	@Override
	public void cacheResult(List<TempCrewEffectsItems> tempCrewEffectsItemses) {
		for (TempCrewEffectsItems tempCrewEffectsItems : tempCrewEffectsItemses) {
			if (EntityCacheUtil.getResult(
						TempCrewEffectsItemsModelImpl.ENTITY_CACHE_ENABLED,
						TempCrewEffectsItemsImpl.class,
						tempCrewEffectsItems.getPrimaryKey()) == null) {
				cacheResult(tempCrewEffectsItems);
			}
			else {
				tempCrewEffectsItems.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all temp crew effects itemses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TempCrewEffectsItemsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TempCrewEffectsItemsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the temp crew effects items.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TempCrewEffectsItems tempCrewEffectsItems) {
		EntityCacheUtil.removeResult(TempCrewEffectsItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewEffectsItemsImpl.class, tempCrewEffectsItems.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TempCrewEffectsItems> tempCrewEffectsItemses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TempCrewEffectsItems tempCrewEffectsItems : tempCrewEffectsItemses) {
			EntityCacheUtil.removeResult(TempCrewEffectsItemsModelImpl.ENTITY_CACHE_ENABLED,
				TempCrewEffectsItemsImpl.class,
				tempCrewEffectsItems.getPrimaryKey());
		}
	}

	/**
	 * Creates a new temp crew effects items with the primary key. Does not add the temp crew effects items to the database.
	 *
	 * @param id the primary key for the new temp crew effects items
	 * @return the new temp crew effects items
	 */
	@Override
	public TempCrewEffectsItems create(long id) {
		TempCrewEffectsItems tempCrewEffectsItems = new TempCrewEffectsItemsImpl();

		tempCrewEffectsItems.setNew(true);
		tempCrewEffectsItems.setPrimaryKey(id);

		return tempCrewEffectsItems;
	}

	/**
	 * Removes the temp crew effects items with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the temp crew effects items
	 * @return the temp crew effects items that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewEffectsItemsException if a temp crew effects items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewEffectsItems remove(long id)
		throws NoSuchTempCrewEffectsItemsException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the temp crew effects items with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the temp crew effects items
	 * @return the temp crew effects items that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewEffectsItemsException if a temp crew effects items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewEffectsItems remove(Serializable primaryKey)
		throws NoSuchTempCrewEffectsItemsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TempCrewEffectsItems tempCrewEffectsItems = (TempCrewEffectsItems)session.get(TempCrewEffectsItemsImpl.class,
					primaryKey);

			if (tempCrewEffectsItems == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTempCrewEffectsItemsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tempCrewEffectsItems);
		}
		catch (NoSuchTempCrewEffectsItemsException nsee) {
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
	protected TempCrewEffectsItems removeImpl(
		TempCrewEffectsItems tempCrewEffectsItems) throws SystemException {
		tempCrewEffectsItems = toUnwrappedModel(tempCrewEffectsItems);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tempCrewEffectsItems)) {
				tempCrewEffectsItems = (TempCrewEffectsItems)session.get(TempCrewEffectsItemsImpl.class,
						tempCrewEffectsItems.getPrimaryKeyObj());
			}

			if (tempCrewEffectsItems != null) {
				session.delete(tempCrewEffectsItems);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tempCrewEffectsItems != null) {
			clearCache(tempCrewEffectsItems);
		}

		return tempCrewEffectsItems;
	}

	@Override
	public TempCrewEffectsItems updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.TempCrewEffectsItems tempCrewEffectsItems)
		throws SystemException {
		tempCrewEffectsItems = toUnwrappedModel(tempCrewEffectsItems);

		boolean isNew = tempCrewEffectsItems.isNew();

		TempCrewEffectsItemsModelImpl tempCrewEffectsItemsModelImpl = (TempCrewEffectsItemsModelImpl)tempCrewEffectsItems;

		Session session = null;

		try {
			session = openSession();

			if (tempCrewEffectsItems.isNew()) {
				session.save(tempCrewEffectsItems);

				tempCrewEffectsItems.setNew(false);
			}
			else {
				session.merge(tempCrewEffectsItems);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TempCrewEffectsItemsModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tempCrewEffectsItemsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempCrewEffectsItemsModelImpl.getOriginalRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);

				args = new Object[] {
						tempCrewEffectsItemsModelImpl.getRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(TempCrewEffectsItemsModelImpl.ENTITY_CACHE_ENABLED,
			TempCrewEffectsItemsImpl.class,
			tempCrewEffectsItems.getPrimaryKey(), tempCrewEffectsItems);

		return tempCrewEffectsItems;
	}

	protected TempCrewEffectsItems toUnwrappedModel(
		TempCrewEffectsItems tempCrewEffectsItems) {
		if (tempCrewEffectsItems instanceof TempCrewEffectsItemsImpl) {
			return tempCrewEffectsItems;
		}

		TempCrewEffectsItemsImpl tempCrewEffectsItemsImpl = new TempCrewEffectsItemsImpl();

		tempCrewEffectsItemsImpl.setNew(tempCrewEffectsItems.isNew());
		tempCrewEffectsItemsImpl.setPrimaryKey(tempCrewEffectsItems.getPrimaryKey());

		tempCrewEffectsItemsImpl.setId(tempCrewEffectsItems.getId());
		tempCrewEffectsItemsImpl.setRequestCode(tempCrewEffectsItems.getRequestCode());
		tempCrewEffectsItemsImpl.setCrewEffectItemcode(tempCrewEffectsItems.getCrewEffectItemcode());
		tempCrewEffectsItemsImpl.setFamilyName(tempCrewEffectsItems.getFamilyName());
		tempCrewEffectsItemsImpl.setGivenName(tempCrewEffectsItems.getGivenName());
		tempCrewEffectsItemsImpl.setRankOrratingCode(tempCrewEffectsItems.getRankOrratingCode());
		tempCrewEffectsItemsImpl.setEffectsIneligibleForRelief(tempCrewEffectsItems.getEffectsIneligibleForRelief());

		return tempCrewEffectsItemsImpl;
	}

	/**
	 * Returns the temp crew effects items with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp crew effects items
	 * @return the temp crew effects items
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewEffectsItemsException if a temp crew effects items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewEffectsItems findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTempCrewEffectsItemsException, SystemException {
		TempCrewEffectsItems tempCrewEffectsItems = fetchByPrimaryKey(primaryKey);

		if (tempCrewEffectsItems == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTempCrewEffectsItemsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tempCrewEffectsItems;
	}

	/**
	 * Returns the temp crew effects items with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewEffectsItemsException} if it could not be found.
	 *
	 * @param id the primary key of the temp crew effects items
	 * @return the temp crew effects items
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempCrewEffectsItemsException if a temp crew effects items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewEffectsItems findByPrimaryKey(long id)
		throws NoSuchTempCrewEffectsItemsException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the temp crew effects items with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp crew effects items
	 * @return the temp crew effects items, or <code>null</code> if a temp crew effects items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewEffectsItems fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TempCrewEffectsItems tempCrewEffectsItems = (TempCrewEffectsItems)EntityCacheUtil.getResult(TempCrewEffectsItemsModelImpl.ENTITY_CACHE_ENABLED,
				TempCrewEffectsItemsImpl.class, primaryKey);

		if (tempCrewEffectsItems == _nullTempCrewEffectsItems) {
			return null;
		}

		if (tempCrewEffectsItems == null) {
			Session session = null;

			try {
				session = openSession();

				tempCrewEffectsItems = (TempCrewEffectsItems)session.get(TempCrewEffectsItemsImpl.class,
						primaryKey);

				if (tempCrewEffectsItems != null) {
					cacheResult(tempCrewEffectsItems);
				}
				else {
					EntityCacheUtil.putResult(TempCrewEffectsItemsModelImpl.ENTITY_CACHE_ENABLED,
						TempCrewEffectsItemsImpl.class, primaryKey,
						_nullTempCrewEffectsItems);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TempCrewEffectsItemsModelImpl.ENTITY_CACHE_ENABLED,
					TempCrewEffectsItemsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tempCrewEffectsItems;
	}

	/**
	 * Returns the temp crew effects items with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the temp crew effects items
	 * @return the temp crew effects items, or <code>null</code> if a temp crew effects items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempCrewEffectsItems fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the temp crew effects itemses.
	 *
	 * @return the temp crew effects itemses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCrewEffectsItems> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp crew effects itemses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempCrewEffectsItemsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp crew effects itemses
	 * @param end the upper bound of the range of temp crew effects itemses (not inclusive)
	 * @return the range of temp crew effects itemses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCrewEffectsItems> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp crew effects itemses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempCrewEffectsItemsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp crew effects itemses
	 * @param end the upper bound of the range of temp crew effects itemses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of temp crew effects itemses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempCrewEffectsItems> findAll(int start, int end,
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

		List<TempCrewEffectsItems> list = (List<TempCrewEffectsItems>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TEMPCREWEFFECTSITEMS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TEMPCREWEFFECTSITEMS;

				if (pagination) {
					sql = sql.concat(TempCrewEffectsItemsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TempCrewEffectsItems>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempCrewEffectsItems>(list);
				}
				else {
					list = (List<TempCrewEffectsItems>)QueryUtil.list(q,
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
	 * Removes all the temp crew effects itemses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TempCrewEffectsItems tempCrewEffectsItems : findAll()) {
			remove(tempCrewEffectsItems);
		}
	}

	/**
	 * Returns the number of temp crew effects itemses.
	 *
	 * @return the number of temp crew effects itemses
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

				Query q = session.createQuery(_SQL_COUNT_TEMPCREWEFFECTSITEMS);

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
	 * Initializes the temp crew effects items persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.TempCrewEffectsItems")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TempCrewEffectsItems>> listenersList = new ArrayList<ModelListener<TempCrewEffectsItems>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TempCrewEffectsItems>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TempCrewEffectsItemsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TEMPCREWEFFECTSITEMS = "SELECT tempCrewEffectsItems FROM TempCrewEffectsItems tempCrewEffectsItems";
	private static final String _SQL_SELECT_TEMPCREWEFFECTSITEMS_WHERE = "SELECT tempCrewEffectsItems FROM TempCrewEffectsItems tempCrewEffectsItems WHERE ";
	private static final String _SQL_COUNT_TEMPCREWEFFECTSITEMS = "SELECT COUNT(tempCrewEffectsItems) FROM TempCrewEffectsItems tempCrewEffectsItems";
	private static final String _SQL_COUNT_TEMPCREWEFFECTSITEMS_WHERE = "SELECT COUNT(tempCrewEffectsItems) FROM TempCrewEffectsItems tempCrewEffectsItems WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tempCrewEffectsItems.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TempCrewEffectsItems exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TempCrewEffectsItems exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TempCrewEffectsItemsPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "requestCode", "crewEffectItemcode", "familyName",
				"givenName", "rankOrratingCode", "effectsIneligibleForRelief"
			});
	private static TempCrewEffectsItems _nullTempCrewEffectsItems = new TempCrewEffectsItemsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TempCrewEffectsItems> toCacheModel() {
				return _nullTempCrewEffectsItemsCacheModel;
			}
		};

	private static CacheModel<TempCrewEffectsItems> _nullTempCrewEffectsItemsCacheModel =
		new CacheModel<TempCrewEffectsItems>() {
			@Override
			public TempCrewEffectsItems toEntityModel() {
				return _nullTempCrewEffectsItems;
			}
		};
}