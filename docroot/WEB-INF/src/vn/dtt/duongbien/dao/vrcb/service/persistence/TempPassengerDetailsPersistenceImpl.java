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

import vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerDetailsException;
import vn.dtt.duongbien.dao.vrcb.model.TempPassengerDetails;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempPassengerDetailsImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempPassengerDetailsModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the temp passenger details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see TempPassengerDetailsPersistence
 * @see TempPassengerDetailsUtil
 * @generated
 */
public class TempPassengerDetailsPersistenceImpl extends BasePersistenceImpl<TempPassengerDetails>
	implements TempPassengerDetailsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TempPassengerDetailsUtil} to access the temp passenger details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TempPassengerDetailsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TempPassengerDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempPassengerDetailsModelImpl.FINDER_CACHE_ENABLED,
			TempPassengerDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TempPassengerDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempPassengerDetailsModelImpl.FINDER_CACHE_ENABLED,
			TempPassengerDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TempPassengerDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempPassengerDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempPassengerDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempPassengerDetailsModelImpl.FINDER_CACHE_ENABLED,
			TempPassengerDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRequestCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempPassengerDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempPassengerDetailsModelImpl.FINDER_CACHE_ENABLED,
			TempPassengerDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRequestCode",
			new String[] { String.class.getName() },
			TempPassengerDetailsModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE = new FinderPath(TempPassengerDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempPassengerDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRequestCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the temp passenger detailses where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the matching temp passenger detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempPassengerDetails> findByRequestCode(String requestCode)
		throws SystemException {
		return findByRequestCode(requestCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp passenger detailses where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempPassengerDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp passenger detailses
	 * @param end the upper bound of the range of temp passenger detailses (not inclusive)
	 * @return the range of matching temp passenger detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempPassengerDetails> findByRequestCode(String requestCode,
		int start, int end) throws SystemException {
		return findByRequestCode(requestCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp passenger detailses where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempPassengerDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp passenger detailses
	 * @param end the upper bound of the range of temp passenger detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp passenger detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempPassengerDetails> findByRequestCode(String requestCode,
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

		List<TempPassengerDetails> list = (List<TempPassengerDetails>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempPassengerDetails tempPassengerDetails : list) {
				if (!Validator.equals(requestCode,
							tempPassengerDetails.getRequestCode())) {
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

			query.append(_SQL_SELECT_TEMPPASSENGERDETAILS_WHERE);

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
				query.append(TempPassengerDetailsModelImpl.ORDER_BY_JPQL);
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
					list = (List<TempPassengerDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempPassengerDetails>(list);
				}
				else {
					list = (List<TempPassengerDetails>)QueryUtil.list(q,
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
	 * Returns the first temp passenger details in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp passenger details
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerDetailsException if a matching temp passenger details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPassengerDetails findByRequestCode_First(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempPassengerDetailsException, SystemException {
		TempPassengerDetails tempPassengerDetails = fetchByRequestCode_First(requestCode,
				orderByComparator);

		if (tempPassengerDetails != null) {
			return tempPassengerDetails;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempPassengerDetailsException(msg.toString());
	}

	/**
	 * Returns the first temp passenger details in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp passenger details, or <code>null</code> if a matching temp passenger details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPassengerDetails fetchByRequestCode_First(String requestCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<TempPassengerDetails> list = findByRequestCode(requestCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp passenger details in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp passenger details
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerDetailsException if a matching temp passenger details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPassengerDetails findByRequestCode_Last(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempPassengerDetailsException, SystemException {
		TempPassengerDetails tempPassengerDetails = fetchByRequestCode_Last(requestCode,
				orderByComparator);

		if (tempPassengerDetails != null) {
			return tempPassengerDetails;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempPassengerDetailsException(msg.toString());
	}

	/**
	 * Returns the last temp passenger details in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp passenger details, or <code>null</code> if a matching temp passenger details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPassengerDetails fetchByRequestCode_Last(String requestCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByRequestCode(requestCode);

		if (count == 0) {
			return null;
		}

		List<TempPassengerDetails> list = findByRequestCode(requestCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp passenger detailses before and after the current temp passenger details in the ordered set where requestCode = &#63;.
	 *
	 * @param id the primary key of the current temp passenger details
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp passenger details
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerDetailsException if a temp passenger details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPassengerDetails[] findByRequestCode_PrevAndNext(long id,
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempPassengerDetailsException, SystemException {
		TempPassengerDetails tempPassengerDetails = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempPassengerDetails[] array = new TempPassengerDetailsImpl[3];

			array[0] = getByRequestCode_PrevAndNext(session,
					tempPassengerDetails, requestCode, orderByComparator, true);

			array[1] = tempPassengerDetails;

			array[2] = getByRequestCode_PrevAndNext(session,
					tempPassengerDetails, requestCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TempPassengerDetails getByRequestCode_PrevAndNext(
		Session session, TempPassengerDetails tempPassengerDetails,
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

		query.append(_SQL_SELECT_TEMPPASSENGERDETAILS_WHERE);

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
			query.append(TempPassengerDetailsModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(tempPassengerDetails);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempPassengerDetails> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp passenger detailses where requestCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByRequestCode(String requestCode)
		throws SystemException {
		for (TempPassengerDetails tempPassengerDetails : findByRequestCode(
				requestCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tempPassengerDetails);
		}
	}

	/**
	 * Returns the number of temp passenger detailses where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the number of matching temp passenger detailses
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

			query.append(_SQL_COUNT_TEMPPASSENGERDETAILS_WHERE);

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

	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1 = "tempPassengerDetails.requestCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2 = "tempPassengerDetails.requestCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3 = "(tempPassengerDetails.requestCode IS NULL OR tempPassengerDetails.requestCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PASSENGERCODE =
		new FinderPath(TempPassengerDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempPassengerDetailsModelImpl.FINDER_CACHE_ENABLED,
			TempPassengerDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPassengerCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PASSENGERCODE =
		new FinderPath(TempPassengerDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempPassengerDetailsModelImpl.FINDER_CACHE_ENABLED,
			TempPassengerDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPassengerCode",
			new String[] { String.class.getName() },
			TempPassengerDetailsModelImpl.PASSENGERCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PASSENGERCODE = new FinderPath(TempPassengerDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempPassengerDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPassengerCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the temp passenger detailses where passengerCode = &#63;.
	 *
	 * @param passengerCode the passenger code
	 * @return the matching temp passenger detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempPassengerDetails> findByPassengerCode(String passengerCode)
		throws SystemException {
		return findByPassengerCode(passengerCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp passenger detailses where passengerCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempPassengerDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param passengerCode the passenger code
	 * @param start the lower bound of the range of temp passenger detailses
	 * @param end the upper bound of the range of temp passenger detailses (not inclusive)
	 * @return the range of matching temp passenger detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempPassengerDetails> findByPassengerCode(
		String passengerCode, int start, int end) throws SystemException {
		return findByPassengerCode(passengerCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp passenger detailses where passengerCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempPassengerDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param passengerCode the passenger code
	 * @param start the lower bound of the range of temp passenger detailses
	 * @param end the upper bound of the range of temp passenger detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp passenger detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempPassengerDetails> findByPassengerCode(
		String passengerCode, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PASSENGERCODE;
			finderArgs = new Object[] { passengerCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PASSENGERCODE;
			finderArgs = new Object[] {
					passengerCode,
					
					start, end, orderByComparator
				};
		}

		List<TempPassengerDetails> list = (List<TempPassengerDetails>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempPassengerDetails tempPassengerDetails : list) {
				if (!Validator.equals(passengerCode,
							tempPassengerDetails.getPassengerCode())) {
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

			query.append(_SQL_SELECT_TEMPPASSENGERDETAILS_WHERE);

			boolean bindPassengerCode = false;

			if (passengerCode == null) {
				query.append(_FINDER_COLUMN_PASSENGERCODE_PASSENGERCODE_1);
			}
			else if (passengerCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PASSENGERCODE_PASSENGERCODE_3);
			}
			else {
				bindPassengerCode = true;

				query.append(_FINDER_COLUMN_PASSENGERCODE_PASSENGERCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TempPassengerDetailsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPassengerCode) {
					qPos.add(passengerCode);
				}

				if (!pagination) {
					list = (List<TempPassengerDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempPassengerDetails>(list);
				}
				else {
					list = (List<TempPassengerDetails>)QueryUtil.list(q,
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
	 * Returns the first temp passenger details in the ordered set where passengerCode = &#63;.
	 *
	 * @param passengerCode the passenger code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp passenger details
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerDetailsException if a matching temp passenger details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPassengerDetails findByPassengerCode_First(
		String passengerCode, OrderByComparator orderByComparator)
		throws NoSuchTempPassengerDetailsException, SystemException {
		TempPassengerDetails tempPassengerDetails = fetchByPassengerCode_First(passengerCode,
				orderByComparator);

		if (tempPassengerDetails != null) {
			return tempPassengerDetails;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("passengerCode=");
		msg.append(passengerCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempPassengerDetailsException(msg.toString());
	}

	/**
	 * Returns the first temp passenger details in the ordered set where passengerCode = &#63;.
	 *
	 * @param passengerCode the passenger code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp passenger details, or <code>null</code> if a matching temp passenger details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPassengerDetails fetchByPassengerCode_First(
		String passengerCode, OrderByComparator orderByComparator)
		throws SystemException {
		List<TempPassengerDetails> list = findByPassengerCode(passengerCode, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp passenger details in the ordered set where passengerCode = &#63;.
	 *
	 * @param passengerCode the passenger code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp passenger details
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerDetailsException if a matching temp passenger details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPassengerDetails findByPassengerCode_Last(String passengerCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempPassengerDetailsException, SystemException {
		TempPassengerDetails tempPassengerDetails = fetchByPassengerCode_Last(passengerCode,
				orderByComparator);

		if (tempPassengerDetails != null) {
			return tempPassengerDetails;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("passengerCode=");
		msg.append(passengerCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempPassengerDetailsException(msg.toString());
	}

	/**
	 * Returns the last temp passenger details in the ordered set where passengerCode = &#63;.
	 *
	 * @param passengerCode the passenger code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp passenger details, or <code>null</code> if a matching temp passenger details could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPassengerDetails fetchByPassengerCode_Last(
		String passengerCode, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByPassengerCode(passengerCode);

		if (count == 0) {
			return null;
		}

		List<TempPassengerDetails> list = findByPassengerCode(passengerCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp passenger detailses before and after the current temp passenger details in the ordered set where passengerCode = &#63;.
	 *
	 * @param id the primary key of the current temp passenger details
	 * @param passengerCode the passenger code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp passenger details
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerDetailsException if a temp passenger details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPassengerDetails[] findByPassengerCode_PrevAndNext(long id,
		String passengerCode, OrderByComparator orderByComparator)
		throws NoSuchTempPassengerDetailsException, SystemException {
		TempPassengerDetails tempPassengerDetails = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempPassengerDetails[] array = new TempPassengerDetailsImpl[3];

			array[0] = getByPassengerCode_PrevAndNext(session,
					tempPassengerDetails, passengerCode, orderByComparator, true);

			array[1] = tempPassengerDetails;

			array[2] = getByPassengerCode_PrevAndNext(session,
					tempPassengerDetails, passengerCode, orderByComparator,
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

	protected TempPassengerDetails getByPassengerCode_PrevAndNext(
		Session session, TempPassengerDetails tempPassengerDetails,
		String passengerCode, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TEMPPASSENGERDETAILS_WHERE);

		boolean bindPassengerCode = false;

		if (passengerCode == null) {
			query.append(_FINDER_COLUMN_PASSENGERCODE_PASSENGERCODE_1);
		}
		else if (passengerCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PASSENGERCODE_PASSENGERCODE_3);
		}
		else {
			bindPassengerCode = true;

			query.append(_FINDER_COLUMN_PASSENGERCODE_PASSENGERCODE_2);
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
			query.append(TempPassengerDetailsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindPassengerCode) {
			qPos.add(passengerCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tempPassengerDetails);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempPassengerDetails> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp passenger detailses where passengerCode = &#63; from the database.
	 *
	 * @param passengerCode the passenger code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPassengerCode(String passengerCode)
		throws SystemException {
		for (TempPassengerDetails tempPassengerDetails : findByPassengerCode(
				passengerCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tempPassengerDetails);
		}
	}

	/**
	 * Returns the number of temp passenger detailses where passengerCode = &#63;.
	 *
	 * @param passengerCode the passenger code
	 * @return the number of matching temp passenger detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPassengerCode(String passengerCode)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PASSENGERCODE;

		Object[] finderArgs = new Object[] { passengerCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TEMPPASSENGERDETAILS_WHERE);

			boolean bindPassengerCode = false;

			if (passengerCode == null) {
				query.append(_FINDER_COLUMN_PASSENGERCODE_PASSENGERCODE_1);
			}
			else if (passengerCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PASSENGERCODE_PASSENGERCODE_3);
			}
			else {
				bindPassengerCode = true;

				query.append(_FINDER_COLUMN_PASSENGERCODE_PASSENGERCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPassengerCode) {
					qPos.add(passengerCode);
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

	private static final String _FINDER_COLUMN_PASSENGERCODE_PASSENGERCODE_1 = "tempPassengerDetails.passengerCode IS NULL";
	private static final String _FINDER_COLUMN_PASSENGERCODE_PASSENGERCODE_2 = "tempPassengerDetails.passengerCode = ?";
	private static final String _FINDER_COLUMN_PASSENGERCODE_PASSENGERCODE_3 = "(tempPassengerDetails.passengerCode IS NULL OR tempPassengerDetails.passengerCode = '')";

	public TempPassengerDetailsPersistenceImpl() {
		setModelClass(TempPassengerDetails.class);
	}

	/**
	 * Caches the temp passenger details in the entity cache if it is enabled.
	 *
	 * @param tempPassengerDetails the temp passenger details
	 */
	@Override
	public void cacheResult(TempPassengerDetails tempPassengerDetails) {
		EntityCacheUtil.putResult(TempPassengerDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempPassengerDetailsImpl.class,
			tempPassengerDetails.getPrimaryKey(), tempPassengerDetails);

		tempPassengerDetails.resetOriginalValues();
	}

	/**
	 * Caches the temp passenger detailses in the entity cache if it is enabled.
	 *
	 * @param tempPassengerDetailses the temp passenger detailses
	 */
	@Override
	public void cacheResult(List<TempPassengerDetails> tempPassengerDetailses) {
		for (TempPassengerDetails tempPassengerDetails : tempPassengerDetailses) {
			if (EntityCacheUtil.getResult(
						TempPassengerDetailsModelImpl.ENTITY_CACHE_ENABLED,
						TempPassengerDetailsImpl.class,
						tempPassengerDetails.getPrimaryKey()) == null) {
				cacheResult(tempPassengerDetails);
			}
			else {
				tempPassengerDetails.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all temp passenger detailses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TempPassengerDetailsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TempPassengerDetailsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the temp passenger details.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TempPassengerDetails tempPassengerDetails) {
		EntityCacheUtil.removeResult(TempPassengerDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempPassengerDetailsImpl.class, tempPassengerDetails.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TempPassengerDetails> tempPassengerDetailses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TempPassengerDetails tempPassengerDetails : tempPassengerDetailses) {
			EntityCacheUtil.removeResult(TempPassengerDetailsModelImpl.ENTITY_CACHE_ENABLED,
				TempPassengerDetailsImpl.class,
				tempPassengerDetails.getPrimaryKey());
		}
	}

	/**
	 * Creates a new temp passenger details with the primary key. Does not add the temp passenger details to the database.
	 *
	 * @param id the primary key for the new temp passenger details
	 * @return the new temp passenger details
	 */
	@Override
	public TempPassengerDetails create(long id) {
		TempPassengerDetails tempPassengerDetails = new TempPassengerDetailsImpl();

		tempPassengerDetails.setNew(true);
		tempPassengerDetails.setPrimaryKey(id);

		return tempPassengerDetails;
	}

	/**
	 * Removes the temp passenger details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the temp passenger details
	 * @return the temp passenger details that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerDetailsException if a temp passenger details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPassengerDetails remove(long id)
		throws NoSuchTempPassengerDetailsException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the temp passenger details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the temp passenger details
	 * @return the temp passenger details that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerDetailsException if a temp passenger details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPassengerDetails remove(Serializable primaryKey)
		throws NoSuchTempPassengerDetailsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TempPassengerDetails tempPassengerDetails = (TempPassengerDetails)session.get(TempPassengerDetailsImpl.class,
					primaryKey);

			if (tempPassengerDetails == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTempPassengerDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tempPassengerDetails);
		}
		catch (NoSuchTempPassengerDetailsException nsee) {
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
	protected TempPassengerDetails removeImpl(
		TempPassengerDetails tempPassengerDetails) throws SystemException {
		tempPassengerDetails = toUnwrappedModel(tempPassengerDetails);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tempPassengerDetails)) {
				tempPassengerDetails = (TempPassengerDetails)session.get(TempPassengerDetailsImpl.class,
						tempPassengerDetails.getPrimaryKeyObj());
			}

			if (tempPassengerDetails != null) {
				session.delete(tempPassengerDetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tempPassengerDetails != null) {
			clearCache(tempPassengerDetails);
		}

		return tempPassengerDetails;
	}

	@Override
	public TempPassengerDetails updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.TempPassengerDetails tempPassengerDetails)
		throws SystemException {
		tempPassengerDetails = toUnwrappedModel(tempPassengerDetails);

		boolean isNew = tempPassengerDetails.isNew();

		TempPassengerDetailsModelImpl tempPassengerDetailsModelImpl = (TempPassengerDetailsModelImpl)tempPassengerDetails;

		Session session = null;

		try {
			session = openSession();

			if (tempPassengerDetails.isNew()) {
				session.save(tempPassengerDetails);

				tempPassengerDetails.setNew(false);
			}
			else {
				session.merge(tempPassengerDetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TempPassengerDetailsModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tempPassengerDetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempPassengerDetailsModelImpl.getOriginalRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);

				args = new Object[] {
						tempPassengerDetailsModelImpl.getRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);
			}

			if ((tempPassengerDetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PASSENGERCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempPassengerDetailsModelImpl.getOriginalPassengerCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PASSENGERCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PASSENGERCODE,
					args);

				args = new Object[] {
						tempPassengerDetailsModelImpl.getPassengerCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PASSENGERCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PASSENGERCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(TempPassengerDetailsModelImpl.ENTITY_CACHE_ENABLED,
			TempPassengerDetailsImpl.class,
			tempPassengerDetails.getPrimaryKey(), tempPassengerDetails);

		return tempPassengerDetails;
	}

	protected TempPassengerDetails toUnwrappedModel(
		TempPassengerDetails tempPassengerDetails) {
		if (tempPassengerDetails instanceof TempPassengerDetailsImpl) {
			return tempPassengerDetails;
		}

		TempPassengerDetailsImpl tempPassengerDetailsImpl = new TempPassengerDetailsImpl();

		tempPassengerDetailsImpl.setNew(tempPassengerDetails.isNew());
		tempPassengerDetailsImpl.setPrimaryKey(tempPassengerDetails.getPrimaryKey());

		tempPassengerDetailsImpl.setId(tempPassengerDetails.getId());
		tempPassengerDetailsImpl.setRequestCode(tempPassengerDetails.getRequestCode());
		tempPassengerDetailsImpl.setPassengerCode(tempPassengerDetails.getPassengerCode());
		tempPassengerDetailsImpl.setFamilyName(tempPassengerDetails.getFamilyName());
		tempPassengerDetailsImpl.setGivenName(tempPassengerDetails.getGivenName());
		tempPassengerDetailsImpl.setNationality(tempPassengerDetails.getNationality());
		tempPassengerDetailsImpl.setBirthDay(tempPassengerDetails.getBirthDay());
		tempPassengerDetailsImpl.setBirthPlace(tempPassengerDetails.getBirthPlace());
		tempPassengerDetailsImpl.setTypeOfIdentity(tempPassengerDetails.getTypeOfIdentity());
		tempPassengerDetailsImpl.setPassportExpiredDate(tempPassengerDetails.getPassportExpiredDate());
		tempPassengerDetailsImpl.setSerialNumberOfIdentity(tempPassengerDetails.getSerialNumberOfIdentity());
		tempPassengerDetailsImpl.setPortOfEmbarkation(tempPassengerDetails.getPortOfEmbarkation());
		tempPassengerDetailsImpl.setPortOfDisembarkation(tempPassengerDetails.getPortOfDisembarkation());
		tempPassengerDetailsImpl.setIsTransit(tempPassengerDetails.getIsTransit());

		return tempPassengerDetailsImpl;
	}

	/**
	 * Returns the temp passenger details with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp passenger details
	 * @return the temp passenger details
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerDetailsException if a temp passenger details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPassengerDetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTempPassengerDetailsException, SystemException {
		TempPassengerDetails tempPassengerDetails = fetchByPrimaryKey(primaryKey);

		if (tempPassengerDetails == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTempPassengerDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tempPassengerDetails;
	}

	/**
	 * Returns the temp passenger details with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerDetailsException} if it could not be found.
	 *
	 * @param id the primary key of the temp passenger details
	 * @return the temp passenger details
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerDetailsException if a temp passenger details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPassengerDetails findByPrimaryKey(long id)
		throws NoSuchTempPassengerDetailsException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the temp passenger details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp passenger details
	 * @return the temp passenger details, or <code>null</code> if a temp passenger details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPassengerDetails fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TempPassengerDetails tempPassengerDetails = (TempPassengerDetails)EntityCacheUtil.getResult(TempPassengerDetailsModelImpl.ENTITY_CACHE_ENABLED,
				TempPassengerDetailsImpl.class, primaryKey);

		if (tempPassengerDetails == _nullTempPassengerDetails) {
			return null;
		}

		if (tempPassengerDetails == null) {
			Session session = null;

			try {
				session = openSession();

				tempPassengerDetails = (TempPassengerDetails)session.get(TempPassengerDetailsImpl.class,
						primaryKey);

				if (tempPassengerDetails != null) {
					cacheResult(tempPassengerDetails);
				}
				else {
					EntityCacheUtil.putResult(TempPassengerDetailsModelImpl.ENTITY_CACHE_ENABLED,
						TempPassengerDetailsImpl.class, primaryKey,
						_nullTempPassengerDetails);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TempPassengerDetailsModelImpl.ENTITY_CACHE_ENABLED,
					TempPassengerDetailsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tempPassengerDetails;
	}

	/**
	 * Returns the temp passenger details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the temp passenger details
	 * @return the temp passenger details, or <code>null</code> if a temp passenger details with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPassengerDetails fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the temp passenger detailses.
	 *
	 * @return the temp passenger detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempPassengerDetails> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp passenger detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempPassengerDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp passenger detailses
	 * @param end the upper bound of the range of temp passenger detailses (not inclusive)
	 * @return the range of temp passenger detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempPassengerDetails> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp passenger detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempPassengerDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp passenger detailses
	 * @param end the upper bound of the range of temp passenger detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of temp passenger detailses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempPassengerDetails> findAll(int start, int end,
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

		List<TempPassengerDetails> list = (List<TempPassengerDetails>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TEMPPASSENGERDETAILS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TEMPPASSENGERDETAILS;

				if (pagination) {
					sql = sql.concat(TempPassengerDetailsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TempPassengerDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempPassengerDetails>(list);
				}
				else {
					list = (List<TempPassengerDetails>)QueryUtil.list(q,
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
	 * Removes all the temp passenger detailses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TempPassengerDetails tempPassengerDetails : findAll()) {
			remove(tempPassengerDetails);
		}
	}

	/**
	 * Returns the number of temp passenger detailses.
	 *
	 * @return the number of temp passenger detailses
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

				Query q = session.createQuery(_SQL_COUNT_TEMPPASSENGERDETAILS);

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
	 * Initializes the temp passenger details persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.TempPassengerDetails")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TempPassengerDetails>> listenersList = new ArrayList<ModelListener<TempPassengerDetails>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TempPassengerDetails>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TempPassengerDetailsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TEMPPASSENGERDETAILS = "SELECT tempPassengerDetails FROM TempPassengerDetails tempPassengerDetails";
	private static final String _SQL_SELECT_TEMPPASSENGERDETAILS_WHERE = "SELECT tempPassengerDetails FROM TempPassengerDetails tempPassengerDetails WHERE ";
	private static final String _SQL_COUNT_TEMPPASSENGERDETAILS = "SELECT COUNT(tempPassengerDetails) FROM TempPassengerDetails tempPassengerDetails";
	private static final String _SQL_COUNT_TEMPPASSENGERDETAILS_WHERE = "SELECT COUNT(tempPassengerDetails) FROM TempPassengerDetails tempPassengerDetails WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tempPassengerDetails.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TempPassengerDetails exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TempPassengerDetails exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TempPassengerDetailsPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "requestCode", "passengerCode", "familyName", "givenName",
				"nationality", "birthDay", "birthPlace", "typeOfIdentity",
				"passportExpiredDate", "serialNumberOfIdentity",
				"portOfEmbarkation", "portOfDisembarkation", "isTransit"
			});
	private static TempPassengerDetails _nullTempPassengerDetails = new TempPassengerDetailsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TempPassengerDetails> toCacheModel() {
				return _nullTempPassengerDetailsCacheModel;
			}
		};

	private static CacheModel<TempPassengerDetails> _nullTempPassengerDetailsCacheModel =
		new CacheModel<TempPassengerDetails>() {
			@Override
			public TempPassengerDetails toEntityModel() {
				return _nullTempPassengerDetails;
			}
		};
}