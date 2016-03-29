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

import vn.dtt.duongbo.dao.common.NoSuchTthcDoiTuongThucHienException;
import vn.dtt.duongbo.dao.common.model.TthcDoiTuongThucHien;
import vn.dtt.duongbo.dao.common.model.impl.TthcDoiTuongThucHienImpl;
import vn.dtt.duongbo.dao.common.model.impl.TthcDoiTuongThucHienModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the tthc doi tuong thuc hien service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcDoiTuongThucHienPersistence
 * @see TthcDoiTuongThucHienUtil
 * @generated
 */
public class TthcDoiTuongThucHienPersistenceImpl extends BasePersistenceImpl<TthcDoiTuongThucHien>
	implements TthcDoiTuongThucHienPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TthcDoiTuongThucHienUtil} to access the tthc doi tuong thuc hien persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TthcDoiTuongThucHienImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TthcDoiTuongThucHienModelImpl.ENTITY_CACHE_ENABLED,
			TthcDoiTuongThucHienModelImpl.FINDER_CACHE_ENABLED,
			TthcDoiTuongThucHienImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TthcDoiTuongThucHienModelImpl.ENTITY_CACHE_ENABLED,
			TthcDoiTuongThucHienModelImpl.FINDER_CACHE_ENABLED,
			TthcDoiTuongThucHienImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TthcDoiTuongThucHienModelImpl.ENTITY_CACHE_ENABLED,
			TthcDoiTuongThucHienModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_THUTUCHANHCHINHID =
		new FinderPath(TthcDoiTuongThucHienModelImpl.ENTITY_CACHE_ENABLED,
			TthcDoiTuongThucHienModelImpl.FINDER_CACHE_ENABLED,
			TthcDoiTuongThucHienImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByThuTucHanhChinhId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_THUTUCHANHCHINHID =
		new FinderPath(TthcDoiTuongThucHienModelImpl.ENTITY_CACHE_ENABLED,
			TthcDoiTuongThucHienModelImpl.FINDER_CACHE_ENABLED,
			TthcDoiTuongThucHienImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByThuTucHanhChinhId", new String[] { Long.class.getName() },
			TthcDoiTuongThucHienModelImpl.THUTUCHANHCHINHID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_THUTUCHANHCHINHID = new FinderPath(TthcDoiTuongThucHienModelImpl.ENTITY_CACHE_ENABLED,
			TthcDoiTuongThucHienModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByThuTucHanhChinhId", new String[] { Long.class.getName() });

	/**
	 * Returns all the tthc doi tuong thuc hiens where thuTucHanhChinhId = &#63;.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @return the matching tthc doi tuong thuc hiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcDoiTuongThucHien> findByThuTucHanhChinhId(
		long thuTucHanhChinhId) throws SystemException {
		return findByThuTucHanhChinhId(thuTucHanhChinhId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc doi tuong thuc hiens where thuTucHanhChinhId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcDoiTuongThucHienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param start the lower bound of the range of tthc doi tuong thuc hiens
	 * @param end the upper bound of the range of tthc doi tuong thuc hiens (not inclusive)
	 * @return the range of matching tthc doi tuong thuc hiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcDoiTuongThucHien> findByThuTucHanhChinhId(
		long thuTucHanhChinhId, int start, int end) throws SystemException {
		return findByThuTucHanhChinhId(thuTucHanhChinhId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc doi tuong thuc hiens where thuTucHanhChinhId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcDoiTuongThucHienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param start the lower bound of the range of tthc doi tuong thuc hiens
	 * @param end the upper bound of the range of tthc doi tuong thuc hiens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tthc doi tuong thuc hiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcDoiTuongThucHien> findByThuTucHanhChinhId(
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

		List<TthcDoiTuongThucHien> list = (List<TthcDoiTuongThucHien>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TthcDoiTuongThucHien tthcDoiTuongThucHien : list) {
				if ((thuTucHanhChinhId != tthcDoiTuongThucHien.getThuTucHanhChinhId())) {
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

			query.append(_SQL_SELECT_TTHCDOITUONGTHUCHIEN_WHERE);

			query.append(_FINDER_COLUMN_THUTUCHANHCHINHID_THUTUCHANHCHINHID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TthcDoiTuongThucHienModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(thuTucHanhChinhId);

				if (!pagination) {
					list = (List<TthcDoiTuongThucHien>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcDoiTuongThucHien>(list);
				}
				else {
					list = (List<TthcDoiTuongThucHien>)QueryUtil.list(q,
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
	 * Returns the first tthc doi tuong thuc hien in the ordered set where thuTucHanhChinhId = &#63;.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc doi tuong thuc hien
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcDoiTuongThucHienException if a matching tthc doi tuong thuc hien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcDoiTuongThucHien findByThuTucHanhChinhId_First(
		long thuTucHanhChinhId, OrderByComparator orderByComparator)
		throws NoSuchTthcDoiTuongThucHienException, SystemException {
		TthcDoiTuongThucHien tthcDoiTuongThucHien = fetchByThuTucHanhChinhId_First(thuTucHanhChinhId,
				orderByComparator);

		if (tthcDoiTuongThucHien != null) {
			return tthcDoiTuongThucHien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("thuTucHanhChinhId=");
		msg.append(thuTucHanhChinhId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcDoiTuongThucHienException(msg.toString());
	}

	/**
	 * Returns the first tthc doi tuong thuc hien in the ordered set where thuTucHanhChinhId = &#63;.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc doi tuong thuc hien, or <code>null</code> if a matching tthc doi tuong thuc hien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcDoiTuongThucHien fetchByThuTucHanhChinhId_First(
		long thuTucHanhChinhId, OrderByComparator orderByComparator)
		throws SystemException {
		List<TthcDoiTuongThucHien> list = findByThuTucHanhChinhId(thuTucHanhChinhId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tthc doi tuong thuc hien in the ordered set where thuTucHanhChinhId = &#63;.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc doi tuong thuc hien
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcDoiTuongThucHienException if a matching tthc doi tuong thuc hien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcDoiTuongThucHien findByThuTucHanhChinhId_Last(
		long thuTucHanhChinhId, OrderByComparator orderByComparator)
		throws NoSuchTthcDoiTuongThucHienException, SystemException {
		TthcDoiTuongThucHien tthcDoiTuongThucHien = fetchByThuTucHanhChinhId_Last(thuTucHanhChinhId,
				orderByComparator);

		if (tthcDoiTuongThucHien != null) {
			return tthcDoiTuongThucHien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("thuTucHanhChinhId=");
		msg.append(thuTucHanhChinhId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcDoiTuongThucHienException(msg.toString());
	}

	/**
	 * Returns the last tthc doi tuong thuc hien in the ordered set where thuTucHanhChinhId = &#63;.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc doi tuong thuc hien, or <code>null</code> if a matching tthc doi tuong thuc hien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcDoiTuongThucHien fetchByThuTucHanhChinhId_Last(
		long thuTucHanhChinhId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByThuTucHanhChinhId(thuTucHanhChinhId);

		if (count == 0) {
			return null;
		}

		List<TthcDoiTuongThucHien> list = findByThuTucHanhChinhId(thuTucHanhChinhId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tthc doi tuong thuc hiens before and after the current tthc doi tuong thuc hien in the ordered set where thuTucHanhChinhId = &#63;.
	 *
	 * @param id the primary key of the current tthc doi tuong thuc hien
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tthc doi tuong thuc hien
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcDoiTuongThucHienException if a tthc doi tuong thuc hien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcDoiTuongThucHien[] findByThuTucHanhChinhId_PrevAndNext(long id,
		long thuTucHanhChinhId, OrderByComparator orderByComparator)
		throws NoSuchTthcDoiTuongThucHienException, SystemException {
		TthcDoiTuongThucHien tthcDoiTuongThucHien = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TthcDoiTuongThucHien[] array = new TthcDoiTuongThucHienImpl[3];

			array[0] = getByThuTucHanhChinhId_PrevAndNext(session,
					tthcDoiTuongThucHien, thuTucHanhChinhId, orderByComparator,
					true);

			array[1] = tthcDoiTuongThucHien;

			array[2] = getByThuTucHanhChinhId_PrevAndNext(session,
					tthcDoiTuongThucHien, thuTucHanhChinhId, orderByComparator,
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

	protected TthcDoiTuongThucHien getByThuTucHanhChinhId_PrevAndNext(
		Session session, TthcDoiTuongThucHien tthcDoiTuongThucHien,
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

		query.append(_SQL_SELECT_TTHCDOITUONGTHUCHIEN_WHERE);

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
			query.append(TthcDoiTuongThucHienModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(thuTucHanhChinhId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tthcDoiTuongThucHien);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TthcDoiTuongThucHien> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tthc doi tuong thuc hiens where thuTucHanhChinhId = &#63; from the database.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByThuTucHanhChinhId(long thuTucHanhChinhId)
		throws SystemException {
		for (TthcDoiTuongThucHien tthcDoiTuongThucHien : findByThuTucHanhChinhId(
				thuTucHanhChinhId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tthcDoiTuongThucHien);
		}
	}

	/**
	 * Returns the number of tthc doi tuong thuc hiens where thuTucHanhChinhId = &#63;.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @return the number of matching tthc doi tuong thuc hiens
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

			query.append(_SQL_COUNT_TTHCDOITUONGTHUCHIEN_WHERE);

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
		"tthcDoiTuongThucHien.thuTucHanhChinhId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LOAIDOITUONGTHUCHIEN =
		new FinderPath(TthcDoiTuongThucHienModelImpl.ENTITY_CACHE_ENABLED,
			TthcDoiTuongThucHienModelImpl.FINDER_CACHE_ENABLED,
			TthcDoiTuongThucHienImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByLoaiDoiTuongThucHien",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOAIDOITUONGTHUCHIEN =
		new FinderPath(TthcDoiTuongThucHienModelImpl.ENTITY_CACHE_ENABLED,
			TthcDoiTuongThucHienModelImpl.FINDER_CACHE_ENABLED,
			TthcDoiTuongThucHienImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByLoaiDoiTuongThucHien",
			new String[] { String.class.getName() },
			TthcDoiTuongThucHienModelImpl.LOAIDOITUONGTHUCHIEN_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LOAIDOITUONGTHUCHIEN = new FinderPath(TthcDoiTuongThucHienModelImpl.ENTITY_CACHE_ENABLED,
			TthcDoiTuongThucHienModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByLoaiDoiTuongThucHien",
			new String[] { String.class.getName() });

	/**
	 * Returns all the tthc doi tuong thuc hiens where loaiDoiTuongThucHien = &#63;.
	 *
	 * @param loaiDoiTuongThucHien the loai doi tuong thuc hien
	 * @return the matching tthc doi tuong thuc hiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcDoiTuongThucHien> findByLoaiDoiTuongThucHien(
		String loaiDoiTuongThucHien) throws SystemException {
		return findByLoaiDoiTuongThucHien(loaiDoiTuongThucHien,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc doi tuong thuc hiens where loaiDoiTuongThucHien = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcDoiTuongThucHienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param loaiDoiTuongThucHien the loai doi tuong thuc hien
	 * @param start the lower bound of the range of tthc doi tuong thuc hiens
	 * @param end the upper bound of the range of tthc doi tuong thuc hiens (not inclusive)
	 * @return the range of matching tthc doi tuong thuc hiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcDoiTuongThucHien> findByLoaiDoiTuongThucHien(
		String loaiDoiTuongThucHien, int start, int end)
		throws SystemException {
		return findByLoaiDoiTuongThucHien(loaiDoiTuongThucHien, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc doi tuong thuc hiens where loaiDoiTuongThucHien = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcDoiTuongThucHienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param loaiDoiTuongThucHien the loai doi tuong thuc hien
	 * @param start the lower bound of the range of tthc doi tuong thuc hiens
	 * @param end the upper bound of the range of tthc doi tuong thuc hiens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tthc doi tuong thuc hiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcDoiTuongThucHien> findByLoaiDoiTuongThucHien(
		String loaiDoiTuongThucHien, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOAIDOITUONGTHUCHIEN;
			finderArgs = new Object[] { loaiDoiTuongThucHien };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LOAIDOITUONGTHUCHIEN;
			finderArgs = new Object[] {
					loaiDoiTuongThucHien,
					
					start, end, orderByComparator
				};
		}

		List<TthcDoiTuongThucHien> list = (List<TthcDoiTuongThucHien>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TthcDoiTuongThucHien tthcDoiTuongThucHien : list) {
				if (!Validator.equals(loaiDoiTuongThucHien,
							tthcDoiTuongThucHien.getLoaiDoiTuongThucHien())) {
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

			query.append(_SQL_SELECT_TTHCDOITUONGTHUCHIEN_WHERE);

			boolean bindLoaiDoiTuongThucHien = false;

			if (loaiDoiTuongThucHien == null) {
				query.append(_FINDER_COLUMN_LOAIDOITUONGTHUCHIEN_LOAIDOITUONGTHUCHIEN_1);
			}
			else if (loaiDoiTuongThucHien.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LOAIDOITUONGTHUCHIEN_LOAIDOITUONGTHUCHIEN_3);
			}
			else {
				bindLoaiDoiTuongThucHien = true;

				query.append(_FINDER_COLUMN_LOAIDOITUONGTHUCHIEN_LOAIDOITUONGTHUCHIEN_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TthcDoiTuongThucHienModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindLoaiDoiTuongThucHien) {
					qPos.add(loaiDoiTuongThucHien);
				}

				if (!pagination) {
					list = (List<TthcDoiTuongThucHien>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcDoiTuongThucHien>(list);
				}
				else {
					list = (List<TthcDoiTuongThucHien>)QueryUtil.list(q,
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
	 * Returns the first tthc doi tuong thuc hien in the ordered set where loaiDoiTuongThucHien = &#63;.
	 *
	 * @param loaiDoiTuongThucHien the loai doi tuong thuc hien
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc doi tuong thuc hien
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcDoiTuongThucHienException if a matching tthc doi tuong thuc hien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcDoiTuongThucHien findByLoaiDoiTuongThucHien_First(
		String loaiDoiTuongThucHien, OrderByComparator orderByComparator)
		throws NoSuchTthcDoiTuongThucHienException, SystemException {
		TthcDoiTuongThucHien tthcDoiTuongThucHien = fetchByLoaiDoiTuongThucHien_First(loaiDoiTuongThucHien,
				orderByComparator);

		if (tthcDoiTuongThucHien != null) {
			return tthcDoiTuongThucHien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("loaiDoiTuongThucHien=");
		msg.append(loaiDoiTuongThucHien);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcDoiTuongThucHienException(msg.toString());
	}

	/**
	 * Returns the first tthc doi tuong thuc hien in the ordered set where loaiDoiTuongThucHien = &#63;.
	 *
	 * @param loaiDoiTuongThucHien the loai doi tuong thuc hien
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc doi tuong thuc hien, or <code>null</code> if a matching tthc doi tuong thuc hien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcDoiTuongThucHien fetchByLoaiDoiTuongThucHien_First(
		String loaiDoiTuongThucHien, OrderByComparator orderByComparator)
		throws SystemException {
		List<TthcDoiTuongThucHien> list = findByLoaiDoiTuongThucHien(loaiDoiTuongThucHien,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tthc doi tuong thuc hien in the ordered set where loaiDoiTuongThucHien = &#63;.
	 *
	 * @param loaiDoiTuongThucHien the loai doi tuong thuc hien
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc doi tuong thuc hien
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcDoiTuongThucHienException if a matching tthc doi tuong thuc hien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcDoiTuongThucHien findByLoaiDoiTuongThucHien_Last(
		String loaiDoiTuongThucHien, OrderByComparator orderByComparator)
		throws NoSuchTthcDoiTuongThucHienException, SystemException {
		TthcDoiTuongThucHien tthcDoiTuongThucHien = fetchByLoaiDoiTuongThucHien_Last(loaiDoiTuongThucHien,
				orderByComparator);

		if (tthcDoiTuongThucHien != null) {
			return tthcDoiTuongThucHien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("loaiDoiTuongThucHien=");
		msg.append(loaiDoiTuongThucHien);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcDoiTuongThucHienException(msg.toString());
	}

	/**
	 * Returns the last tthc doi tuong thuc hien in the ordered set where loaiDoiTuongThucHien = &#63;.
	 *
	 * @param loaiDoiTuongThucHien the loai doi tuong thuc hien
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc doi tuong thuc hien, or <code>null</code> if a matching tthc doi tuong thuc hien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcDoiTuongThucHien fetchByLoaiDoiTuongThucHien_Last(
		String loaiDoiTuongThucHien, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByLoaiDoiTuongThucHien(loaiDoiTuongThucHien);

		if (count == 0) {
			return null;
		}

		List<TthcDoiTuongThucHien> list = findByLoaiDoiTuongThucHien(loaiDoiTuongThucHien,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tthc doi tuong thuc hiens before and after the current tthc doi tuong thuc hien in the ordered set where loaiDoiTuongThucHien = &#63;.
	 *
	 * @param id the primary key of the current tthc doi tuong thuc hien
	 * @param loaiDoiTuongThucHien the loai doi tuong thuc hien
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tthc doi tuong thuc hien
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcDoiTuongThucHienException if a tthc doi tuong thuc hien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcDoiTuongThucHien[] findByLoaiDoiTuongThucHien_PrevAndNext(
		long id, String loaiDoiTuongThucHien,
		OrderByComparator orderByComparator)
		throws NoSuchTthcDoiTuongThucHienException, SystemException {
		TthcDoiTuongThucHien tthcDoiTuongThucHien = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TthcDoiTuongThucHien[] array = new TthcDoiTuongThucHienImpl[3];

			array[0] = getByLoaiDoiTuongThucHien_PrevAndNext(session,
					tthcDoiTuongThucHien, loaiDoiTuongThucHien,
					orderByComparator, true);

			array[1] = tthcDoiTuongThucHien;

			array[2] = getByLoaiDoiTuongThucHien_PrevAndNext(session,
					tthcDoiTuongThucHien, loaiDoiTuongThucHien,
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

	protected TthcDoiTuongThucHien getByLoaiDoiTuongThucHien_PrevAndNext(
		Session session, TthcDoiTuongThucHien tthcDoiTuongThucHien,
		String loaiDoiTuongThucHien, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TTHCDOITUONGTHUCHIEN_WHERE);

		boolean bindLoaiDoiTuongThucHien = false;

		if (loaiDoiTuongThucHien == null) {
			query.append(_FINDER_COLUMN_LOAIDOITUONGTHUCHIEN_LOAIDOITUONGTHUCHIEN_1);
		}
		else if (loaiDoiTuongThucHien.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_LOAIDOITUONGTHUCHIEN_LOAIDOITUONGTHUCHIEN_3);
		}
		else {
			bindLoaiDoiTuongThucHien = true;

			query.append(_FINDER_COLUMN_LOAIDOITUONGTHUCHIEN_LOAIDOITUONGTHUCHIEN_2);
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
			query.append(TthcDoiTuongThucHienModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindLoaiDoiTuongThucHien) {
			qPos.add(loaiDoiTuongThucHien);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tthcDoiTuongThucHien);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TthcDoiTuongThucHien> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tthc doi tuong thuc hiens where loaiDoiTuongThucHien = &#63; from the database.
	 *
	 * @param loaiDoiTuongThucHien the loai doi tuong thuc hien
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByLoaiDoiTuongThucHien(String loaiDoiTuongThucHien)
		throws SystemException {
		for (TthcDoiTuongThucHien tthcDoiTuongThucHien : findByLoaiDoiTuongThucHien(
				loaiDoiTuongThucHien, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tthcDoiTuongThucHien);
		}
	}

	/**
	 * Returns the number of tthc doi tuong thuc hiens where loaiDoiTuongThucHien = &#63;.
	 *
	 * @param loaiDoiTuongThucHien the loai doi tuong thuc hien
	 * @return the number of matching tthc doi tuong thuc hiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByLoaiDoiTuongThucHien(String loaiDoiTuongThucHien)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LOAIDOITUONGTHUCHIEN;

		Object[] finderArgs = new Object[] { loaiDoiTuongThucHien };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TTHCDOITUONGTHUCHIEN_WHERE);

			boolean bindLoaiDoiTuongThucHien = false;

			if (loaiDoiTuongThucHien == null) {
				query.append(_FINDER_COLUMN_LOAIDOITUONGTHUCHIEN_LOAIDOITUONGTHUCHIEN_1);
			}
			else if (loaiDoiTuongThucHien.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LOAIDOITUONGTHUCHIEN_LOAIDOITUONGTHUCHIEN_3);
			}
			else {
				bindLoaiDoiTuongThucHien = true;

				query.append(_FINDER_COLUMN_LOAIDOITUONGTHUCHIEN_LOAIDOITUONGTHUCHIEN_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindLoaiDoiTuongThucHien) {
					qPos.add(loaiDoiTuongThucHien);
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

	private static final String _FINDER_COLUMN_LOAIDOITUONGTHUCHIEN_LOAIDOITUONGTHUCHIEN_1 =
		"tthcDoiTuongThucHien.loaiDoiTuongThucHien IS NULL";
	private static final String _FINDER_COLUMN_LOAIDOITUONGTHUCHIEN_LOAIDOITUONGTHUCHIEN_2 =
		"tthcDoiTuongThucHien.loaiDoiTuongThucHien = ?";
	private static final String _FINDER_COLUMN_LOAIDOITUONGTHUCHIEN_LOAIDOITUONGTHUCHIEN_3 =
		"(tthcDoiTuongThucHien.loaiDoiTuongThucHien IS NULL OR tthcDoiTuongThucHien.loaiDoiTuongThucHien = '')";

	public TthcDoiTuongThucHienPersistenceImpl() {
		setModelClass(TthcDoiTuongThucHien.class);
	}

	/**
	 * Caches the tthc doi tuong thuc hien in the entity cache if it is enabled.
	 *
	 * @param tthcDoiTuongThucHien the tthc doi tuong thuc hien
	 */
	@Override
	public void cacheResult(TthcDoiTuongThucHien tthcDoiTuongThucHien) {
		EntityCacheUtil.putResult(TthcDoiTuongThucHienModelImpl.ENTITY_CACHE_ENABLED,
			TthcDoiTuongThucHienImpl.class,
			tthcDoiTuongThucHien.getPrimaryKey(), tthcDoiTuongThucHien);

		tthcDoiTuongThucHien.resetOriginalValues();
	}

	/**
	 * Caches the tthc doi tuong thuc hiens in the entity cache if it is enabled.
	 *
	 * @param tthcDoiTuongThucHiens the tthc doi tuong thuc hiens
	 */
	@Override
	public void cacheResult(List<TthcDoiTuongThucHien> tthcDoiTuongThucHiens) {
		for (TthcDoiTuongThucHien tthcDoiTuongThucHien : tthcDoiTuongThucHiens) {
			if (EntityCacheUtil.getResult(
						TthcDoiTuongThucHienModelImpl.ENTITY_CACHE_ENABLED,
						TthcDoiTuongThucHienImpl.class,
						tthcDoiTuongThucHien.getPrimaryKey()) == null) {
				cacheResult(tthcDoiTuongThucHien);
			}
			else {
				tthcDoiTuongThucHien.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tthc doi tuong thuc hiens.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TthcDoiTuongThucHienImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TthcDoiTuongThucHienImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tthc doi tuong thuc hien.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TthcDoiTuongThucHien tthcDoiTuongThucHien) {
		EntityCacheUtil.removeResult(TthcDoiTuongThucHienModelImpl.ENTITY_CACHE_ENABLED,
			TthcDoiTuongThucHienImpl.class, tthcDoiTuongThucHien.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TthcDoiTuongThucHien> tthcDoiTuongThucHiens) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TthcDoiTuongThucHien tthcDoiTuongThucHien : tthcDoiTuongThucHiens) {
			EntityCacheUtil.removeResult(TthcDoiTuongThucHienModelImpl.ENTITY_CACHE_ENABLED,
				TthcDoiTuongThucHienImpl.class,
				tthcDoiTuongThucHien.getPrimaryKey());
		}
	}

	/**
	 * Creates a new tthc doi tuong thuc hien with the primary key. Does not add the tthc doi tuong thuc hien to the database.
	 *
	 * @param id the primary key for the new tthc doi tuong thuc hien
	 * @return the new tthc doi tuong thuc hien
	 */
	@Override
	public TthcDoiTuongThucHien create(long id) {
		TthcDoiTuongThucHien tthcDoiTuongThucHien = new TthcDoiTuongThucHienImpl();

		tthcDoiTuongThucHien.setNew(true);
		tthcDoiTuongThucHien.setPrimaryKey(id);

		return tthcDoiTuongThucHien;
	}

	/**
	 * Removes the tthc doi tuong thuc hien with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the tthc doi tuong thuc hien
	 * @return the tthc doi tuong thuc hien that was removed
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcDoiTuongThucHienException if a tthc doi tuong thuc hien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcDoiTuongThucHien remove(long id)
		throws NoSuchTthcDoiTuongThucHienException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the tthc doi tuong thuc hien with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tthc doi tuong thuc hien
	 * @return the tthc doi tuong thuc hien that was removed
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcDoiTuongThucHienException if a tthc doi tuong thuc hien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcDoiTuongThucHien remove(Serializable primaryKey)
		throws NoSuchTthcDoiTuongThucHienException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TthcDoiTuongThucHien tthcDoiTuongThucHien = (TthcDoiTuongThucHien)session.get(TthcDoiTuongThucHienImpl.class,
					primaryKey);

			if (tthcDoiTuongThucHien == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTthcDoiTuongThucHienException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tthcDoiTuongThucHien);
		}
		catch (NoSuchTthcDoiTuongThucHienException nsee) {
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
	protected TthcDoiTuongThucHien removeImpl(
		TthcDoiTuongThucHien tthcDoiTuongThucHien) throws SystemException {
		tthcDoiTuongThucHien = toUnwrappedModel(tthcDoiTuongThucHien);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tthcDoiTuongThucHien)) {
				tthcDoiTuongThucHien = (TthcDoiTuongThucHien)session.get(TthcDoiTuongThucHienImpl.class,
						tthcDoiTuongThucHien.getPrimaryKeyObj());
			}

			if (tthcDoiTuongThucHien != null) {
				session.delete(tthcDoiTuongThucHien);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tthcDoiTuongThucHien != null) {
			clearCache(tthcDoiTuongThucHien);
		}

		return tthcDoiTuongThucHien;
	}

	@Override
	public TthcDoiTuongThucHien updateImpl(
		vn.dtt.duongbo.dao.common.model.TthcDoiTuongThucHien tthcDoiTuongThucHien)
		throws SystemException {
		tthcDoiTuongThucHien = toUnwrappedModel(tthcDoiTuongThucHien);

		boolean isNew = tthcDoiTuongThucHien.isNew();

		TthcDoiTuongThucHienModelImpl tthcDoiTuongThucHienModelImpl = (TthcDoiTuongThucHienModelImpl)tthcDoiTuongThucHien;

		Session session = null;

		try {
			session = openSession();

			if (tthcDoiTuongThucHien.isNew()) {
				session.save(tthcDoiTuongThucHien);

				tthcDoiTuongThucHien.setNew(false);
			}
			else {
				session.merge(tthcDoiTuongThucHien);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TthcDoiTuongThucHienModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tthcDoiTuongThucHienModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_THUTUCHANHCHINHID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcDoiTuongThucHienModelImpl.getOriginalThuTucHanhChinhId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_THUTUCHANHCHINHID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_THUTUCHANHCHINHID,
					args);

				args = new Object[] {
						tthcDoiTuongThucHienModelImpl.getThuTucHanhChinhId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_THUTUCHANHCHINHID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_THUTUCHANHCHINHID,
					args);
			}

			if ((tthcDoiTuongThucHienModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOAIDOITUONGTHUCHIEN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcDoiTuongThucHienModelImpl.getOriginalLoaiDoiTuongThucHien()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LOAIDOITUONGTHUCHIEN,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOAIDOITUONGTHUCHIEN,
					args);

				args = new Object[] {
						tthcDoiTuongThucHienModelImpl.getLoaiDoiTuongThucHien()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_LOAIDOITUONGTHUCHIEN,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOAIDOITUONGTHUCHIEN,
					args);
			}
		}

		EntityCacheUtil.putResult(TthcDoiTuongThucHienModelImpl.ENTITY_CACHE_ENABLED,
			TthcDoiTuongThucHienImpl.class,
			tthcDoiTuongThucHien.getPrimaryKey(), tthcDoiTuongThucHien);

		return tthcDoiTuongThucHien;
	}

	protected TthcDoiTuongThucHien toUnwrappedModel(
		TthcDoiTuongThucHien tthcDoiTuongThucHien) {
		if (tthcDoiTuongThucHien instanceof TthcDoiTuongThucHienImpl) {
			return tthcDoiTuongThucHien;
		}

		TthcDoiTuongThucHienImpl tthcDoiTuongThucHienImpl = new TthcDoiTuongThucHienImpl();

		tthcDoiTuongThucHienImpl.setNew(tthcDoiTuongThucHien.isNew());
		tthcDoiTuongThucHienImpl.setPrimaryKey(tthcDoiTuongThucHien.getPrimaryKey());

		tthcDoiTuongThucHienImpl.setId(tthcDoiTuongThucHien.getId());
		tthcDoiTuongThucHienImpl.setThuTucHanhChinhId(tthcDoiTuongThucHien.getThuTucHanhChinhId());
		tthcDoiTuongThucHienImpl.setLoaiDoiTuongThucHien(tthcDoiTuongThucHien.getLoaiDoiTuongThucHien());

		return tthcDoiTuongThucHienImpl;
	}

	/**
	 * Returns the tthc doi tuong thuc hien with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc doi tuong thuc hien
	 * @return the tthc doi tuong thuc hien
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcDoiTuongThucHienException if a tthc doi tuong thuc hien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcDoiTuongThucHien findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTthcDoiTuongThucHienException, SystemException {
		TthcDoiTuongThucHien tthcDoiTuongThucHien = fetchByPrimaryKey(primaryKey);

		if (tthcDoiTuongThucHien == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTthcDoiTuongThucHienException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tthcDoiTuongThucHien;
	}

	/**
	 * Returns the tthc doi tuong thuc hien with the primary key or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcDoiTuongThucHienException} if it could not be found.
	 *
	 * @param id the primary key of the tthc doi tuong thuc hien
	 * @return the tthc doi tuong thuc hien
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcDoiTuongThucHienException if a tthc doi tuong thuc hien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcDoiTuongThucHien findByPrimaryKey(long id)
		throws NoSuchTthcDoiTuongThucHienException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the tthc doi tuong thuc hien with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc doi tuong thuc hien
	 * @return the tthc doi tuong thuc hien, or <code>null</code> if a tthc doi tuong thuc hien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcDoiTuongThucHien fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TthcDoiTuongThucHien tthcDoiTuongThucHien = (TthcDoiTuongThucHien)EntityCacheUtil.getResult(TthcDoiTuongThucHienModelImpl.ENTITY_CACHE_ENABLED,
				TthcDoiTuongThucHienImpl.class, primaryKey);

		if (tthcDoiTuongThucHien == _nullTthcDoiTuongThucHien) {
			return null;
		}

		if (tthcDoiTuongThucHien == null) {
			Session session = null;

			try {
				session = openSession();

				tthcDoiTuongThucHien = (TthcDoiTuongThucHien)session.get(TthcDoiTuongThucHienImpl.class,
						primaryKey);

				if (tthcDoiTuongThucHien != null) {
					cacheResult(tthcDoiTuongThucHien);
				}
				else {
					EntityCacheUtil.putResult(TthcDoiTuongThucHienModelImpl.ENTITY_CACHE_ENABLED,
						TthcDoiTuongThucHienImpl.class, primaryKey,
						_nullTthcDoiTuongThucHien);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TthcDoiTuongThucHienModelImpl.ENTITY_CACHE_ENABLED,
					TthcDoiTuongThucHienImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tthcDoiTuongThucHien;
	}

	/**
	 * Returns the tthc doi tuong thuc hien with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the tthc doi tuong thuc hien
	 * @return the tthc doi tuong thuc hien, or <code>null</code> if a tthc doi tuong thuc hien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcDoiTuongThucHien fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the tthc doi tuong thuc hiens.
	 *
	 * @return the tthc doi tuong thuc hiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcDoiTuongThucHien> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc doi tuong thuc hiens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcDoiTuongThucHienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc doi tuong thuc hiens
	 * @param end the upper bound of the range of tthc doi tuong thuc hiens (not inclusive)
	 * @return the range of tthc doi tuong thuc hiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcDoiTuongThucHien> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc doi tuong thuc hiens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcDoiTuongThucHienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc doi tuong thuc hiens
	 * @param end the upper bound of the range of tthc doi tuong thuc hiens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tthc doi tuong thuc hiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcDoiTuongThucHien> findAll(int start, int end,
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

		List<TthcDoiTuongThucHien> list = (List<TthcDoiTuongThucHien>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TTHCDOITUONGTHUCHIEN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TTHCDOITUONGTHUCHIEN;

				if (pagination) {
					sql = sql.concat(TthcDoiTuongThucHienModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TthcDoiTuongThucHien>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcDoiTuongThucHien>(list);
				}
				else {
					list = (List<TthcDoiTuongThucHien>)QueryUtil.list(q,
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
	 * Removes all the tthc doi tuong thuc hiens from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TthcDoiTuongThucHien tthcDoiTuongThucHien : findAll()) {
			remove(tthcDoiTuongThucHien);
		}
	}

	/**
	 * Returns the number of tthc doi tuong thuc hiens.
	 *
	 * @return the number of tthc doi tuong thuc hiens
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

				Query q = session.createQuery(_SQL_COUNT_TTHCDOITUONGTHUCHIEN);

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
	 * Initializes the tthc doi tuong thuc hien persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.common.model.TthcDoiTuongThucHien")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TthcDoiTuongThucHien>> listenersList = new ArrayList<ModelListener<TthcDoiTuongThucHien>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TthcDoiTuongThucHien>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TthcDoiTuongThucHienImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TTHCDOITUONGTHUCHIEN = "SELECT tthcDoiTuongThucHien FROM TthcDoiTuongThucHien tthcDoiTuongThucHien";
	private static final String _SQL_SELECT_TTHCDOITUONGTHUCHIEN_WHERE = "SELECT tthcDoiTuongThucHien FROM TthcDoiTuongThucHien tthcDoiTuongThucHien WHERE ";
	private static final String _SQL_COUNT_TTHCDOITUONGTHUCHIEN = "SELECT COUNT(tthcDoiTuongThucHien) FROM TthcDoiTuongThucHien tthcDoiTuongThucHien";
	private static final String _SQL_COUNT_TTHCDOITUONGTHUCHIEN_WHERE = "SELECT COUNT(tthcDoiTuongThucHien) FROM TthcDoiTuongThucHien tthcDoiTuongThucHien WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tthcDoiTuongThucHien.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TthcDoiTuongThucHien exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TthcDoiTuongThucHien exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TthcDoiTuongThucHienPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"thuTucHanhChinhId", "loaiDoiTuongThucHien"
			});
	private static TthcDoiTuongThucHien _nullTthcDoiTuongThucHien = new TthcDoiTuongThucHienImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TthcDoiTuongThucHien> toCacheModel() {
				return _nullTthcDoiTuongThucHienCacheModel;
			}
		};

	private static CacheModel<TthcDoiTuongThucHien> _nullTthcDoiTuongThucHienCacheModel =
		new CacheModel<TthcDoiTuongThucHien>() {
			@Override
			public TthcDoiTuongThucHien toEntityModel() {
				return _nullTthcDoiTuongThucHien;
			}
		};
}