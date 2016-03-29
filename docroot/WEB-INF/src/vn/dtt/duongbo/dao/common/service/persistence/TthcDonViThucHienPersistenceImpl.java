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

package vn.dtt.duongbo.dao.common.service.persistence;

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

import vn.dtt.duongbo.dao.common.NoSuchTthcDonViThucHienException;
import vn.dtt.duongbo.dao.common.model.TthcDonViThucHien;
import vn.dtt.duongbo.dao.common.model.impl.TthcDonViThucHienImpl;
import vn.dtt.duongbo.dao.common.model.impl.TthcDonViThucHienModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the tthc don vi thuc hien service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcDonViThucHienPersistence
 * @see TthcDonViThucHienUtil
 * @generated
 */
public class TthcDonViThucHienPersistenceImpl extends BasePersistenceImpl<TthcDonViThucHien>
	implements TthcDonViThucHienPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TthcDonViThucHienUtil} to access the tthc don vi thuc hien persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TthcDonViThucHienImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TthcDonViThucHienModelImpl.ENTITY_CACHE_ENABLED,
			TthcDonViThucHienModelImpl.FINDER_CACHE_ENABLED,
			TthcDonViThucHienImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TthcDonViThucHienModelImpl.ENTITY_CACHE_ENABLED,
			TthcDonViThucHienModelImpl.FINDER_CACHE_ENABLED,
			TthcDonViThucHienImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TthcDonViThucHienModelImpl.ENTITY_CACHE_ENABLED,
			TthcDonViThucHienModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_THUTUCHANHCHINHID =
		new FinderPath(TthcDonViThucHienModelImpl.ENTITY_CACHE_ENABLED,
			TthcDonViThucHienModelImpl.FINDER_CACHE_ENABLED,
			TthcDonViThucHienImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByThuTucHanhChinhId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_THUTUCHANHCHINHID =
		new FinderPath(TthcDonViThucHienModelImpl.ENTITY_CACHE_ENABLED,
			TthcDonViThucHienModelImpl.FINDER_CACHE_ENABLED,
			TthcDonViThucHienImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByThuTucHanhChinhId", new String[] { Long.class.getName() },
			TthcDonViThucHienModelImpl.THUTUCHANHCHINHID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_THUTUCHANHCHINHID = new FinderPath(TthcDonViThucHienModelImpl.ENTITY_CACHE_ENABLED,
			TthcDonViThucHienModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByThuTucHanhChinhId", new String[] { Long.class.getName() });

	/**
	 * Returns all the tthc don vi thuc hiens where thuTucHanhChinhId = &#63;.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @return the matching tthc don vi thuc hiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcDonViThucHien> findByThuTucHanhChinhId(
		long thuTucHanhChinhId) throws SystemException {
		return findByThuTucHanhChinhId(thuTucHanhChinhId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc don vi thuc hiens where thuTucHanhChinhId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcDonViThucHienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param start the lower bound of the range of tthc don vi thuc hiens
	 * @param end the upper bound of the range of tthc don vi thuc hiens (not inclusive)
	 * @return the range of matching tthc don vi thuc hiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcDonViThucHien> findByThuTucHanhChinhId(
		long thuTucHanhChinhId, int start, int end) throws SystemException {
		return findByThuTucHanhChinhId(thuTucHanhChinhId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc don vi thuc hiens where thuTucHanhChinhId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcDonViThucHienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param start the lower bound of the range of tthc don vi thuc hiens
	 * @param end the upper bound of the range of tthc don vi thuc hiens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tthc don vi thuc hiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcDonViThucHien> findByThuTucHanhChinhId(
		long thuTucHanhChinhId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_THUTUCHANHCHINHID;
			finderArgs = new Object[] { thuTucHanhChinhId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_THUTUCHANHCHINHID;
			finderArgs = new Object[] {
					thuTucHanhChinhId,
					
					start, end, orderByComparator
				};
		}

		List<TthcDonViThucHien> list = (List<TthcDonViThucHien>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TthcDonViThucHien tthcDonViThucHien : list) {
				if ((thuTucHanhChinhId != tthcDonViThucHien.getThuTucHanhChinhId())) {
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

			query.append(_SQL_SELECT_TTHCDONVITHUCHIEN_WHERE);

			query.append(_FINDER_COLUMN_THUTUCHANHCHINHID_THUTUCHANHCHINHID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TthcDonViThucHienModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(thuTucHanhChinhId);

				if (!pagination) {
					list = (List<TthcDonViThucHien>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcDonViThucHien>(list);
				}
				else {
					list = (List<TthcDonViThucHien>)QueryUtil.list(q,
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
	 * Returns the first tthc don vi thuc hien in the ordered set where thuTucHanhChinhId = &#63;.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc don vi thuc hien
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcDonViThucHienException if a matching tthc don vi thuc hien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcDonViThucHien findByThuTucHanhChinhId_First(
		long thuTucHanhChinhId, OrderByComparator orderByComparator)
		throws NoSuchTthcDonViThucHienException, SystemException {
		TthcDonViThucHien tthcDonViThucHien = fetchByThuTucHanhChinhId_First(thuTucHanhChinhId,
				orderByComparator);

		if (tthcDonViThucHien != null) {
			return tthcDonViThucHien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("thuTucHanhChinhId=");
		msg.append(thuTucHanhChinhId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcDonViThucHienException(msg.toString());
	}

	/**
	 * Returns the first tthc don vi thuc hien in the ordered set where thuTucHanhChinhId = &#63;.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc don vi thuc hien, or <code>null</code> if a matching tthc don vi thuc hien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcDonViThucHien fetchByThuTucHanhChinhId_First(
		long thuTucHanhChinhId, OrderByComparator orderByComparator)
		throws SystemException {
		List<TthcDonViThucHien> list = findByThuTucHanhChinhId(thuTucHanhChinhId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tthc don vi thuc hien in the ordered set where thuTucHanhChinhId = &#63;.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc don vi thuc hien
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcDonViThucHienException if a matching tthc don vi thuc hien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcDonViThucHien findByThuTucHanhChinhId_Last(
		long thuTucHanhChinhId, OrderByComparator orderByComparator)
		throws NoSuchTthcDonViThucHienException, SystemException {
		TthcDonViThucHien tthcDonViThucHien = fetchByThuTucHanhChinhId_Last(thuTucHanhChinhId,
				orderByComparator);

		if (tthcDonViThucHien != null) {
			return tthcDonViThucHien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("thuTucHanhChinhId=");
		msg.append(thuTucHanhChinhId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcDonViThucHienException(msg.toString());
	}

	/**
	 * Returns the last tthc don vi thuc hien in the ordered set where thuTucHanhChinhId = &#63;.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc don vi thuc hien, or <code>null</code> if a matching tthc don vi thuc hien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcDonViThucHien fetchByThuTucHanhChinhId_Last(
		long thuTucHanhChinhId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByThuTucHanhChinhId(thuTucHanhChinhId);

		if (count == 0) {
			return null;
		}

		List<TthcDonViThucHien> list = findByThuTucHanhChinhId(thuTucHanhChinhId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tthc don vi thuc hiens before and after the current tthc don vi thuc hien in the ordered set where thuTucHanhChinhId = &#63;.
	 *
	 * @param id the primary key of the current tthc don vi thuc hien
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tthc don vi thuc hien
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcDonViThucHienException if a tthc don vi thuc hien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcDonViThucHien[] findByThuTucHanhChinhId_PrevAndNext(long id,
		long thuTucHanhChinhId, OrderByComparator orderByComparator)
		throws NoSuchTthcDonViThucHienException, SystemException {
		TthcDonViThucHien tthcDonViThucHien = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TthcDonViThucHien[] array = new TthcDonViThucHienImpl[3];

			array[0] = getByThuTucHanhChinhId_PrevAndNext(session,
					tthcDonViThucHien, thuTucHanhChinhId, orderByComparator,
					true);

			array[1] = tthcDonViThucHien;

			array[2] = getByThuTucHanhChinhId_PrevAndNext(session,
					tthcDonViThucHien, thuTucHanhChinhId, orderByComparator,
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

	protected TthcDonViThucHien getByThuTucHanhChinhId_PrevAndNext(
		Session session, TthcDonViThucHien tthcDonViThucHien,
		long thuTucHanhChinhId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TTHCDONVITHUCHIEN_WHERE);

		query.append(_FINDER_COLUMN_THUTUCHANHCHINHID_THUTUCHANHCHINHID_2);

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
			query.append(TthcDonViThucHienModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(thuTucHanhChinhId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tthcDonViThucHien);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TthcDonViThucHien> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tthc don vi thuc hiens where thuTucHanhChinhId = &#63; from the database.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByThuTucHanhChinhId(long thuTucHanhChinhId)
		throws SystemException {
		for (TthcDonViThucHien tthcDonViThucHien : findByThuTucHanhChinhId(
				thuTucHanhChinhId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tthcDonViThucHien);
		}
	}

	/**
	 * Returns the number of tthc don vi thuc hiens where thuTucHanhChinhId = &#63;.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @return the number of matching tthc don vi thuc hiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByThuTucHanhChinhId(long thuTucHanhChinhId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_THUTUCHANHCHINHID;

		Object[] finderArgs = new Object[] { thuTucHanhChinhId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TTHCDONVITHUCHIEN_WHERE);

			query.append(_FINDER_COLUMN_THUTUCHANHCHINHID_THUTUCHANHCHINHID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(thuTucHanhChinhId);

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

	private static final String _FINDER_COLUMN_THUTUCHANHCHINHID_THUTUCHANHCHINHID_2 =
		"tthcDonViThucHien.thuTucHanhChinhId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_TTHC_MADV = new FinderPath(TthcDonViThucHienModelImpl.ENTITY_CACHE_ENABLED,
			TthcDonViThucHienModelImpl.FINDER_CACHE_ENABLED,
			TthcDonViThucHienImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByTTHC_MaDV",
			new String[] { Long.class.getName(), String.class.getName() },
			TthcDonViThucHienModelImpl.THUTUCHANHCHINHID_COLUMN_BITMASK |
			TthcDonViThucHienModelImpl.MADONVI_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TTHC_MADV = new FinderPath(TthcDonViThucHienModelImpl.ENTITY_CACHE_ENABLED,
			TthcDonViThucHienModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTTHC_MaDV",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the tthc don vi thuc hien where thuTucHanhChinhId = &#63; and maDonVi = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcDonViThucHienException} if it could not be found.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param maDonVi the ma don vi
	 * @return the matching tthc don vi thuc hien
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcDonViThucHienException if a matching tthc don vi thuc hien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcDonViThucHien findByTTHC_MaDV(long thuTucHanhChinhId,
		String maDonVi)
		throws NoSuchTthcDonViThucHienException, SystemException {
		TthcDonViThucHien tthcDonViThucHien = fetchByTTHC_MaDV(thuTucHanhChinhId,
				maDonVi);

		if (tthcDonViThucHien == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("thuTucHanhChinhId=");
			msg.append(thuTucHanhChinhId);

			msg.append(", maDonVi=");
			msg.append(maDonVi);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchTthcDonViThucHienException(msg.toString());
		}

		return tthcDonViThucHien;
	}

	/**
	 * Returns the tthc don vi thuc hien where thuTucHanhChinhId = &#63; and maDonVi = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param maDonVi the ma don vi
	 * @return the matching tthc don vi thuc hien, or <code>null</code> if a matching tthc don vi thuc hien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcDonViThucHien fetchByTTHC_MaDV(long thuTucHanhChinhId,
		String maDonVi) throws SystemException {
		return fetchByTTHC_MaDV(thuTucHanhChinhId, maDonVi, true);
	}

	/**
	 * Returns the tthc don vi thuc hien where thuTucHanhChinhId = &#63; and maDonVi = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param maDonVi the ma don vi
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching tthc don vi thuc hien, or <code>null</code> if a matching tthc don vi thuc hien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcDonViThucHien fetchByTTHC_MaDV(long thuTucHanhChinhId,
		String maDonVi, boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { thuTucHanhChinhId, maDonVi };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_TTHC_MADV,
					finderArgs, this);
		}

		if (result instanceof TthcDonViThucHien) {
			TthcDonViThucHien tthcDonViThucHien = (TthcDonViThucHien)result;

			if ((thuTucHanhChinhId != tthcDonViThucHien.getThuTucHanhChinhId()) ||
					!Validator.equals(maDonVi, tthcDonViThucHien.getMaDonVi())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_TTHCDONVITHUCHIEN_WHERE);

			query.append(_FINDER_COLUMN_TTHC_MADV_THUTUCHANHCHINHID_2);

			boolean bindMaDonVi = false;

			if (maDonVi == null) {
				query.append(_FINDER_COLUMN_TTHC_MADV_MADONVI_1);
			}
			else if (maDonVi.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TTHC_MADV_MADONVI_3);
			}
			else {
				bindMaDonVi = true;

				query.append(_FINDER_COLUMN_TTHC_MADV_MADONVI_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(thuTucHanhChinhId);

				if (bindMaDonVi) {
					qPos.add(maDonVi);
				}

				List<TthcDonViThucHien> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TTHC_MADV,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"TthcDonViThucHienPersistenceImpl.fetchByTTHC_MaDV(long, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					TthcDonViThucHien tthcDonViThucHien = list.get(0);

					result = tthcDonViThucHien;

					cacheResult(tthcDonViThucHien);

					if ((tthcDonViThucHien.getThuTucHanhChinhId() != thuTucHanhChinhId) ||
							(tthcDonViThucHien.getMaDonVi() == null) ||
							!tthcDonViThucHien.getMaDonVi().equals(maDonVi)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TTHC_MADV,
							finderArgs, tthcDonViThucHien);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_TTHC_MADV,
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
			return (TthcDonViThucHien)result;
		}
	}

	/**
	 * Removes the tthc don vi thuc hien where thuTucHanhChinhId = &#63; and maDonVi = &#63; from the database.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param maDonVi the ma don vi
	 * @return the tthc don vi thuc hien that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcDonViThucHien removeByTTHC_MaDV(long thuTucHanhChinhId,
		String maDonVi)
		throws NoSuchTthcDonViThucHienException, SystemException {
		TthcDonViThucHien tthcDonViThucHien = findByTTHC_MaDV(thuTucHanhChinhId,
				maDonVi);

		return remove(tthcDonViThucHien);
	}

	/**
	 * Returns the number of tthc don vi thuc hiens where thuTucHanhChinhId = &#63; and maDonVi = &#63;.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param maDonVi the ma don vi
	 * @return the number of matching tthc don vi thuc hiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTTHC_MaDV(long thuTucHanhChinhId, String maDonVi)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TTHC_MADV;

		Object[] finderArgs = new Object[] { thuTucHanhChinhId, maDonVi };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TTHCDONVITHUCHIEN_WHERE);

			query.append(_FINDER_COLUMN_TTHC_MADV_THUTUCHANHCHINHID_2);

			boolean bindMaDonVi = false;

			if (maDonVi == null) {
				query.append(_FINDER_COLUMN_TTHC_MADV_MADONVI_1);
			}
			else if (maDonVi.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TTHC_MADV_MADONVI_3);
			}
			else {
				bindMaDonVi = true;

				query.append(_FINDER_COLUMN_TTHC_MADV_MADONVI_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(thuTucHanhChinhId);

				if (bindMaDonVi) {
					qPos.add(maDonVi);
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

	private static final String _FINDER_COLUMN_TTHC_MADV_THUTUCHANHCHINHID_2 = "tthcDonViThucHien.thuTucHanhChinhId = ? AND ";
	private static final String _FINDER_COLUMN_TTHC_MADV_MADONVI_1 = "tthcDonViThucHien.maDonVi IS NULL";
	private static final String _FINDER_COLUMN_TTHC_MADV_MADONVI_2 = "tthcDonViThucHien.maDonVi = ?";
	private static final String _FINDER_COLUMN_TTHC_MADV_MADONVI_3 = "(tthcDonViThucHien.maDonVi IS NULL OR tthcDonViThucHien.maDonVi = '')";

	public TthcDonViThucHienPersistenceImpl() {
		setModelClass(TthcDonViThucHien.class);
	}

	/**
	 * Caches the tthc don vi thuc hien in the entity cache if it is enabled.
	 *
	 * @param tthcDonViThucHien the tthc don vi thuc hien
	 */
	@Override
	public void cacheResult(TthcDonViThucHien tthcDonViThucHien) {
		EntityCacheUtil.putResult(TthcDonViThucHienModelImpl.ENTITY_CACHE_ENABLED,
			TthcDonViThucHienImpl.class, tthcDonViThucHien.getPrimaryKey(),
			tthcDonViThucHien);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TTHC_MADV,
			new Object[] {
				tthcDonViThucHien.getThuTucHanhChinhId(),
				tthcDonViThucHien.getMaDonVi()
			}, tthcDonViThucHien);

		tthcDonViThucHien.resetOriginalValues();
	}

	/**
	 * Caches the tthc don vi thuc hiens in the entity cache if it is enabled.
	 *
	 * @param tthcDonViThucHiens the tthc don vi thuc hiens
	 */
	@Override
	public void cacheResult(List<TthcDonViThucHien> tthcDonViThucHiens) {
		for (TthcDonViThucHien tthcDonViThucHien : tthcDonViThucHiens) {
			if (EntityCacheUtil.getResult(
						TthcDonViThucHienModelImpl.ENTITY_CACHE_ENABLED,
						TthcDonViThucHienImpl.class,
						tthcDonViThucHien.getPrimaryKey()) == null) {
				cacheResult(tthcDonViThucHien);
			}
			else {
				tthcDonViThucHien.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tthc don vi thuc hiens.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TthcDonViThucHienImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TthcDonViThucHienImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tthc don vi thuc hien.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TthcDonViThucHien tthcDonViThucHien) {
		EntityCacheUtil.removeResult(TthcDonViThucHienModelImpl.ENTITY_CACHE_ENABLED,
			TthcDonViThucHienImpl.class, tthcDonViThucHien.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(tthcDonViThucHien);
	}

	@Override
	public void clearCache(List<TthcDonViThucHien> tthcDonViThucHiens) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TthcDonViThucHien tthcDonViThucHien : tthcDonViThucHiens) {
			EntityCacheUtil.removeResult(TthcDonViThucHienModelImpl.ENTITY_CACHE_ENABLED,
				TthcDonViThucHienImpl.class, tthcDonViThucHien.getPrimaryKey());

			clearUniqueFindersCache(tthcDonViThucHien);
		}
	}

	protected void cacheUniqueFindersCache(TthcDonViThucHien tthcDonViThucHien) {
		if (tthcDonViThucHien.isNew()) {
			Object[] args = new Object[] {
					tthcDonViThucHien.getThuTucHanhChinhId(),
					tthcDonViThucHien.getMaDonVi()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TTHC_MADV, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TTHC_MADV, args,
				tthcDonViThucHien);
		}
		else {
			TthcDonViThucHienModelImpl tthcDonViThucHienModelImpl = (TthcDonViThucHienModelImpl)tthcDonViThucHien;

			if ((tthcDonViThucHienModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_TTHC_MADV.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcDonViThucHien.getThuTucHanhChinhId(),
						tthcDonViThucHien.getMaDonVi()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TTHC_MADV, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TTHC_MADV, args,
					tthcDonViThucHien);
			}
		}
	}

	protected void clearUniqueFindersCache(TthcDonViThucHien tthcDonViThucHien) {
		TthcDonViThucHienModelImpl tthcDonViThucHienModelImpl = (TthcDonViThucHienModelImpl)tthcDonViThucHien;

		Object[] args = new Object[] {
				tthcDonViThucHien.getThuTucHanhChinhId(),
				tthcDonViThucHien.getMaDonVi()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TTHC_MADV, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_TTHC_MADV, args);

		if ((tthcDonViThucHienModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_TTHC_MADV.getColumnBitmask()) != 0) {
			args = new Object[] {
					tthcDonViThucHienModelImpl.getOriginalThuTucHanhChinhId(),
					tthcDonViThucHienModelImpl.getOriginalMaDonVi()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TTHC_MADV, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_TTHC_MADV, args);
		}
	}

	/**
	 * Creates a new tthc don vi thuc hien with the primary key. Does not add the tthc don vi thuc hien to the database.
	 *
	 * @param id the primary key for the new tthc don vi thuc hien
	 * @return the new tthc don vi thuc hien
	 */
	@Override
	public TthcDonViThucHien create(long id) {
		TthcDonViThucHien tthcDonViThucHien = new TthcDonViThucHienImpl();

		tthcDonViThucHien.setNew(true);
		tthcDonViThucHien.setPrimaryKey(id);

		return tthcDonViThucHien;
	}

	/**
	 * Removes the tthc don vi thuc hien with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the tthc don vi thuc hien
	 * @return the tthc don vi thuc hien that was removed
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcDonViThucHienException if a tthc don vi thuc hien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcDonViThucHien remove(long id)
		throws NoSuchTthcDonViThucHienException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the tthc don vi thuc hien with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tthc don vi thuc hien
	 * @return the tthc don vi thuc hien that was removed
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcDonViThucHienException if a tthc don vi thuc hien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcDonViThucHien remove(Serializable primaryKey)
		throws NoSuchTthcDonViThucHienException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TthcDonViThucHien tthcDonViThucHien = (TthcDonViThucHien)session.get(TthcDonViThucHienImpl.class,
					primaryKey);

			if (tthcDonViThucHien == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTthcDonViThucHienException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tthcDonViThucHien);
		}
		catch (NoSuchTthcDonViThucHienException nsee) {
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
	protected TthcDonViThucHien removeImpl(TthcDonViThucHien tthcDonViThucHien)
		throws SystemException {
		tthcDonViThucHien = toUnwrappedModel(tthcDonViThucHien);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tthcDonViThucHien)) {
				tthcDonViThucHien = (TthcDonViThucHien)session.get(TthcDonViThucHienImpl.class,
						tthcDonViThucHien.getPrimaryKeyObj());
			}

			if (tthcDonViThucHien != null) {
				session.delete(tthcDonViThucHien);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tthcDonViThucHien != null) {
			clearCache(tthcDonViThucHien);
		}

		return tthcDonViThucHien;
	}

	@Override
	public TthcDonViThucHien updateImpl(
		vn.dtt.duongbo.dao.common.model.TthcDonViThucHien tthcDonViThucHien)
		throws SystemException {
		tthcDonViThucHien = toUnwrappedModel(tthcDonViThucHien);

		boolean isNew = tthcDonViThucHien.isNew();

		TthcDonViThucHienModelImpl tthcDonViThucHienModelImpl = (TthcDonViThucHienModelImpl)tthcDonViThucHien;

		Session session = null;

		try {
			session = openSession();

			if (tthcDonViThucHien.isNew()) {
				session.save(tthcDonViThucHien);

				tthcDonViThucHien.setNew(false);
			}
			else {
				session.merge(tthcDonViThucHien);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TthcDonViThucHienModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tthcDonViThucHienModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_THUTUCHANHCHINHID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcDonViThucHienModelImpl.getOriginalThuTucHanhChinhId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_THUTUCHANHCHINHID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_THUTUCHANHCHINHID,
					args);

				args = new Object[] {
						tthcDonViThucHienModelImpl.getThuTucHanhChinhId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_THUTUCHANHCHINHID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_THUTUCHANHCHINHID,
					args);
			}
		}

		EntityCacheUtil.putResult(TthcDonViThucHienModelImpl.ENTITY_CACHE_ENABLED,
			TthcDonViThucHienImpl.class, tthcDonViThucHien.getPrimaryKey(),
			tthcDonViThucHien);

		clearUniqueFindersCache(tthcDonViThucHien);
		cacheUniqueFindersCache(tthcDonViThucHien);

		return tthcDonViThucHien;
	}

	protected TthcDonViThucHien toUnwrappedModel(
		TthcDonViThucHien tthcDonViThucHien) {
		if (tthcDonViThucHien instanceof TthcDonViThucHienImpl) {
			return tthcDonViThucHien;
		}

		TthcDonViThucHienImpl tthcDonViThucHienImpl = new TthcDonViThucHienImpl();

		tthcDonViThucHienImpl.setNew(tthcDonViThucHien.isNew());
		tthcDonViThucHienImpl.setPrimaryKey(tthcDonViThucHien.getPrimaryKey());

		tthcDonViThucHienImpl.setId(tthcDonViThucHien.getId());
		tthcDonViThucHienImpl.setThuTucHanhChinhId(tthcDonViThucHien.getThuTucHanhChinhId());
		tthcDonViThucHienImpl.setMaDonVi(tthcDonViThucHien.getMaDonVi());
		tthcDonViThucHienImpl.setToChuc(tthcDonViThucHien.getToChuc());

		return tthcDonViThucHienImpl;
	}

	/**
	 * Returns the tthc don vi thuc hien with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc don vi thuc hien
	 * @return the tthc don vi thuc hien
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcDonViThucHienException if a tthc don vi thuc hien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcDonViThucHien findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTthcDonViThucHienException, SystemException {
		TthcDonViThucHien tthcDonViThucHien = fetchByPrimaryKey(primaryKey);

		if (tthcDonViThucHien == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTthcDonViThucHienException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tthcDonViThucHien;
	}

	/**
	 * Returns the tthc don vi thuc hien with the primary key or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcDonViThucHienException} if it could not be found.
	 *
	 * @param id the primary key of the tthc don vi thuc hien
	 * @return the tthc don vi thuc hien
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcDonViThucHienException if a tthc don vi thuc hien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcDonViThucHien findByPrimaryKey(long id)
		throws NoSuchTthcDonViThucHienException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the tthc don vi thuc hien with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc don vi thuc hien
	 * @return the tthc don vi thuc hien, or <code>null</code> if a tthc don vi thuc hien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcDonViThucHien fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TthcDonViThucHien tthcDonViThucHien = (TthcDonViThucHien)EntityCacheUtil.getResult(TthcDonViThucHienModelImpl.ENTITY_CACHE_ENABLED,
				TthcDonViThucHienImpl.class, primaryKey);

		if (tthcDonViThucHien == _nullTthcDonViThucHien) {
			return null;
		}

		if (tthcDonViThucHien == null) {
			Session session = null;

			try {
				session = openSession();

				tthcDonViThucHien = (TthcDonViThucHien)session.get(TthcDonViThucHienImpl.class,
						primaryKey);

				if (tthcDonViThucHien != null) {
					cacheResult(tthcDonViThucHien);
				}
				else {
					EntityCacheUtil.putResult(TthcDonViThucHienModelImpl.ENTITY_CACHE_ENABLED,
						TthcDonViThucHienImpl.class, primaryKey,
						_nullTthcDonViThucHien);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TthcDonViThucHienModelImpl.ENTITY_CACHE_ENABLED,
					TthcDonViThucHienImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tthcDonViThucHien;
	}

	/**
	 * Returns the tthc don vi thuc hien with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the tthc don vi thuc hien
	 * @return the tthc don vi thuc hien, or <code>null</code> if a tthc don vi thuc hien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcDonViThucHien fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the tthc don vi thuc hiens.
	 *
	 * @return the tthc don vi thuc hiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcDonViThucHien> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc don vi thuc hiens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcDonViThucHienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc don vi thuc hiens
	 * @param end the upper bound of the range of tthc don vi thuc hiens (not inclusive)
	 * @return the range of tthc don vi thuc hiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcDonViThucHien> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc don vi thuc hiens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcDonViThucHienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc don vi thuc hiens
	 * @param end the upper bound of the range of tthc don vi thuc hiens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tthc don vi thuc hiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcDonViThucHien> findAll(int start, int end,
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

		List<TthcDonViThucHien> list = (List<TthcDonViThucHien>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TTHCDONVITHUCHIEN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TTHCDONVITHUCHIEN;

				if (pagination) {
					sql = sql.concat(TthcDonViThucHienModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TthcDonViThucHien>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcDonViThucHien>(list);
				}
				else {
					list = (List<TthcDonViThucHien>)QueryUtil.list(q,
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
	 * Removes all the tthc don vi thuc hiens from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TthcDonViThucHien tthcDonViThucHien : findAll()) {
			remove(tthcDonViThucHien);
		}
	}

	/**
	 * Returns the number of tthc don vi thuc hiens.
	 *
	 * @return the number of tthc don vi thuc hiens
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

				Query q = session.createQuery(_SQL_COUNT_TTHCDONVITHUCHIEN);

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
	 * Initializes the tthc don vi thuc hien persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.common.model.TthcDonViThucHien")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TthcDonViThucHien>> listenersList = new ArrayList<ModelListener<TthcDonViThucHien>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TthcDonViThucHien>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TthcDonViThucHienImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TTHCDONVITHUCHIEN = "SELECT tthcDonViThucHien FROM TthcDonViThucHien tthcDonViThucHien";
	private static final String _SQL_SELECT_TTHCDONVITHUCHIEN_WHERE = "SELECT tthcDonViThucHien FROM TthcDonViThucHien tthcDonViThucHien WHERE ";
	private static final String _SQL_COUNT_TTHCDONVITHUCHIEN = "SELECT COUNT(tthcDonViThucHien) FROM TthcDonViThucHien tthcDonViThucHien";
	private static final String _SQL_COUNT_TTHCDONVITHUCHIEN_WHERE = "SELECT COUNT(tthcDonViThucHien) FROM TthcDonViThucHien tthcDonViThucHien WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tthcDonViThucHien.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TthcDonViThucHien exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TthcDonViThucHien exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TthcDonViThucHienPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"thuTucHanhChinhId", "maDonVi", "toChuc"
			});
	private static TthcDonViThucHien _nullTthcDonViThucHien = new TthcDonViThucHienImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TthcDonViThucHien> toCacheModel() {
				return _nullTthcDonViThucHienCacheModel;
			}
		};

	private static CacheModel<TthcDonViThucHien> _nullTthcDonViThucHienCacheModel =
		new CacheModel<TthcDonViThucHien>() {
			@Override
			public TthcDonViThucHien toEntityModel() {
				return _nullTthcDonViThucHien;
			}
		};
}