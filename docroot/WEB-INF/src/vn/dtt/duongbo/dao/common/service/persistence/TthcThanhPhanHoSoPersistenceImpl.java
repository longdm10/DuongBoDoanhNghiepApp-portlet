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

import vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoException;
import vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo;
import vn.dtt.duongbo.dao.common.model.impl.TthcThanhPhanHoSoImpl;
import vn.dtt.duongbo.dao.common.model.impl.TthcThanhPhanHoSoModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the tthc thanh phan ho so service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcThanhPhanHoSoPersistence
 * @see TthcThanhPhanHoSoUtil
 * @generated
 */
public class TthcThanhPhanHoSoPersistenceImpl extends BasePersistenceImpl<TthcThanhPhanHoSo>
	implements TthcThanhPhanHoSoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TthcThanhPhanHoSoUtil} to access the tthc thanh phan ho so persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TthcThanhPhanHoSoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TthcThanhPhanHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcThanhPhanHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcThanhPhanHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TthcThanhPhanHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcThanhPhanHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcThanhPhanHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TthcThanhPhanHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcThanhPhanHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_THUTUCHANHCHINHID =
		new FinderPath(TthcThanhPhanHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcThanhPhanHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcThanhPhanHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByThuTucHanhChinhId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_THUTUCHANHCHINHID =
		new FinderPath(TthcThanhPhanHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcThanhPhanHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcThanhPhanHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByThuTucHanhChinhId", new String[] { Long.class.getName() },
			TthcThanhPhanHoSoModelImpl.THUTUCHANHCHINHID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_THUTUCHANHCHINHID = new FinderPath(TthcThanhPhanHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcThanhPhanHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByThuTucHanhChinhId", new String[] { Long.class.getName() });

	/**
	 * Returns all the tthc thanh phan ho sos where thuTucHanhChinhId = &#63;.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @return the matching tthc thanh phan ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcThanhPhanHoSo> findByThuTucHanhChinhId(
		long thuTucHanhChinhId) throws SystemException {
		return findByThuTucHanhChinhId(thuTucHanhChinhId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc thanh phan ho sos where thuTucHanhChinhId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcThanhPhanHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param start the lower bound of the range of tthc thanh phan ho sos
	 * @param end the upper bound of the range of tthc thanh phan ho sos (not inclusive)
	 * @return the range of matching tthc thanh phan ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcThanhPhanHoSo> findByThuTucHanhChinhId(
		long thuTucHanhChinhId, int start, int end) throws SystemException {
		return findByThuTucHanhChinhId(thuTucHanhChinhId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc thanh phan ho sos where thuTucHanhChinhId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcThanhPhanHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param start the lower bound of the range of tthc thanh phan ho sos
	 * @param end the upper bound of the range of tthc thanh phan ho sos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tthc thanh phan ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcThanhPhanHoSo> findByThuTucHanhChinhId(
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

		List<TthcThanhPhanHoSo> list = (List<TthcThanhPhanHoSo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TthcThanhPhanHoSo tthcThanhPhanHoSo : list) {
				if ((thuTucHanhChinhId != tthcThanhPhanHoSo.getThuTucHanhChinhId())) {
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

			query.append(_SQL_SELECT_TTHCTHANHPHANHOSO_WHERE);

			query.append(_FINDER_COLUMN_THUTUCHANHCHINHID_THUTUCHANHCHINHID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TthcThanhPhanHoSoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(thuTucHanhChinhId);

				if (!pagination) {
					list = (List<TthcThanhPhanHoSo>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcThanhPhanHoSo>(list);
				}
				else {
					list = (List<TthcThanhPhanHoSo>)QueryUtil.list(q,
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
	 * Returns the first tthc thanh phan ho so in the ordered set where thuTucHanhChinhId = &#63;.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc thanh phan ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoException if a matching tthc thanh phan ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThanhPhanHoSo findByThuTucHanhChinhId_First(
		long thuTucHanhChinhId, OrderByComparator orderByComparator)
		throws NoSuchTthcThanhPhanHoSoException, SystemException {
		TthcThanhPhanHoSo tthcThanhPhanHoSo = fetchByThuTucHanhChinhId_First(thuTucHanhChinhId,
				orderByComparator);

		if (tthcThanhPhanHoSo != null) {
			return tthcThanhPhanHoSo;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("thuTucHanhChinhId=");
		msg.append(thuTucHanhChinhId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcThanhPhanHoSoException(msg.toString());
	}

	/**
	 * Returns the first tthc thanh phan ho so in the ordered set where thuTucHanhChinhId = &#63;.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc thanh phan ho so, or <code>null</code> if a matching tthc thanh phan ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThanhPhanHoSo fetchByThuTucHanhChinhId_First(
		long thuTucHanhChinhId, OrderByComparator orderByComparator)
		throws SystemException {
		List<TthcThanhPhanHoSo> list = findByThuTucHanhChinhId(thuTucHanhChinhId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tthc thanh phan ho so in the ordered set where thuTucHanhChinhId = &#63;.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc thanh phan ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoException if a matching tthc thanh phan ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThanhPhanHoSo findByThuTucHanhChinhId_Last(
		long thuTucHanhChinhId, OrderByComparator orderByComparator)
		throws NoSuchTthcThanhPhanHoSoException, SystemException {
		TthcThanhPhanHoSo tthcThanhPhanHoSo = fetchByThuTucHanhChinhId_Last(thuTucHanhChinhId,
				orderByComparator);

		if (tthcThanhPhanHoSo != null) {
			return tthcThanhPhanHoSo;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("thuTucHanhChinhId=");
		msg.append(thuTucHanhChinhId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcThanhPhanHoSoException(msg.toString());
	}

	/**
	 * Returns the last tthc thanh phan ho so in the ordered set where thuTucHanhChinhId = &#63;.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc thanh phan ho so, or <code>null</code> if a matching tthc thanh phan ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThanhPhanHoSo fetchByThuTucHanhChinhId_Last(
		long thuTucHanhChinhId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByThuTucHanhChinhId(thuTucHanhChinhId);

		if (count == 0) {
			return null;
		}

		List<TthcThanhPhanHoSo> list = findByThuTucHanhChinhId(thuTucHanhChinhId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tthc thanh phan ho sos before and after the current tthc thanh phan ho so in the ordered set where thuTucHanhChinhId = &#63;.
	 *
	 * @param id the primary key of the current tthc thanh phan ho so
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tthc thanh phan ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoException if a tthc thanh phan ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThanhPhanHoSo[] findByThuTucHanhChinhId_PrevAndNext(long id,
		long thuTucHanhChinhId, OrderByComparator orderByComparator)
		throws NoSuchTthcThanhPhanHoSoException, SystemException {
		TthcThanhPhanHoSo tthcThanhPhanHoSo = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TthcThanhPhanHoSo[] array = new TthcThanhPhanHoSoImpl[3];

			array[0] = getByThuTucHanhChinhId_PrevAndNext(session,
					tthcThanhPhanHoSo, thuTucHanhChinhId, orderByComparator,
					true);

			array[1] = tthcThanhPhanHoSo;

			array[2] = getByThuTucHanhChinhId_PrevAndNext(session,
					tthcThanhPhanHoSo, thuTucHanhChinhId, orderByComparator,
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

	protected TthcThanhPhanHoSo getByThuTucHanhChinhId_PrevAndNext(
		Session session, TthcThanhPhanHoSo tthcThanhPhanHoSo,
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

		query.append(_SQL_SELECT_TTHCTHANHPHANHOSO_WHERE);

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
			query.append(TthcThanhPhanHoSoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(thuTucHanhChinhId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tthcThanhPhanHoSo);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TthcThanhPhanHoSo> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tthc thanh phan ho sos where thuTucHanhChinhId = &#63; from the database.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByThuTucHanhChinhId(long thuTucHanhChinhId)
		throws SystemException {
		for (TthcThanhPhanHoSo tthcThanhPhanHoSo : findByThuTucHanhChinhId(
				thuTucHanhChinhId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tthcThanhPhanHoSo);
		}
	}

	/**
	 * Returns the number of tthc thanh phan ho sos where thuTucHanhChinhId = &#63;.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @return the number of matching tthc thanh phan ho sos
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

			query.append(_SQL_COUNT_TTHCTHANHPHANHOSO_WHERE);

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
		"tthcThanhPhanHoSo.thuTucHanhChinhId = ? AND  (tthcThanhPhanHoSo.loaiThanhPhan = 1 or tthcThanhPhanHoSo.loaiThanhPhan = 2 or tthcThanhPhanHoSo.loaiThanhPhan = 3) ";
	public static final FinderPath FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDANDMATHANHPHAN =
		new FinderPath(TthcThanhPhanHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcThanhPhanHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcThanhPhanHoSoImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByThuTucHanhChinhIdAndMaThanhPhan",
			new String[] { Long.class.getName(), String.class.getName() },
			TthcThanhPhanHoSoModelImpl.THUTUCHANHCHINHID_COLUMN_BITMASK |
			TthcThanhPhanHoSoModelImpl.MATHANHPHAN_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_THUTUCHANHCHINHIDANDMATHANHPHAN =
		new FinderPath(TthcThanhPhanHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcThanhPhanHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByThuTucHanhChinhIdAndMaThanhPhan",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the tthc thanh phan ho so where thuTucHanhChinhId = &#63; and maThanhPhan = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoException} if it could not be found.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param maThanhPhan the ma thanh phan
	 * @return the matching tthc thanh phan ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoException if a matching tthc thanh phan ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThanhPhanHoSo findByThuTucHanhChinhIdAndMaThanhPhan(
		long thuTucHanhChinhId, String maThanhPhan)
		throws NoSuchTthcThanhPhanHoSoException, SystemException {
		TthcThanhPhanHoSo tthcThanhPhanHoSo = fetchByThuTucHanhChinhIdAndMaThanhPhan(thuTucHanhChinhId,
				maThanhPhan);

		if (tthcThanhPhanHoSo == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("thuTucHanhChinhId=");
			msg.append(thuTucHanhChinhId);

			msg.append(", maThanhPhan=");
			msg.append(maThanhPhan);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchTthcThanhPhanHoSoException(msg.toString());
		}

		return tthcThanhPhanHoSo;
	}

	/**
	 * Returns the tthc thanh phan ho so where thuTucHanhChinhId = &#63; and maThanhPhan = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param maThanhPhan the ma thanh phan
	 * @return the matching tthc thanh phan ho so, or <code>null</code> if a matching tthc thanh phan ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThanhPhanHoSo fetchByThuTucHanhChinhIdAndMaThanhPhan(
		long thuTucHanhChinhId, String maThanhPhan) throws SystemException {
		return fetchByThuTucHanhChinhIdAndMaThanhPhan(thuTucHanhChinhId,
			maThanhPhan, true);
	}

	/**
	 * Returns the tthc thanh phan ho so where thuTucHanhChinhId = &#63; and maThanhPhan = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param maThanhPhan the ma thanh phan
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching tthc thanh phan ho so, or <code>null</code> if a matching tthc thanh phan ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThanhPhanHoSo fetchByThuTucHanhChinhIdAndMaThanhPhan(
		long thuTucHanhChinhId, String maThanhPhan, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { thuTucHanhChinhId, maThanhPhan };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDANDMATHANHPHAN,
					finderArgs, this);
		}

		if (result instanceof TthcThanhPhanHoSo) {
			TthcThanhPhanHoSo tthcThanhPhanHoSo = (TthcThanhPhanHoSo)result;

			if ((thuTucHanhChinhId != tthcThanhPhanHoSo.getThuTucHanhChinhId()) ||
					!Validator.equals(maThanhPhan,
						tthcThanhPhanHoSo.getMaThanhPhan())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_TTHCTHANHPHANHOSO_WHERE);

			query.append(_FINDER_COLUMN_THUTUCHANHCHINHIDANDMATHANHPHAN_THUTUCHANHCHINHID_2);

			boolean bindMaThanhPhan = false;

			if (maThanhPhan == null) {
				query.append(_FINDER_COLUMN_THUTUCHANHCHINHIDANDMATHANHPHAN_MATHANHPHAN_1);
			}
			else if (maThanhPhan.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_THUTUCHANHCHINHIDANDMATHANHPHAN_MATHANHPHAN_3);
			}
			else {
				bindMaThanhPhan = true;

				query.append(_FINDER_COLUMN_THUTUCHANHCHINHIDANDMATHANHPHAN_MATHANHPHAN_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(thuTucHanhChinhId);

				if (bindMaThanhPhan) {
					qPos.add(maThanhPhan);
				}

				List<TthcThanhPhanHoSo> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDANDMATHANHPHAN,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"TthcThanhPhanHoSoPersistenceImpl.fetchByThuTucHanhChinhIdAndMaThanhPhan(long, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					TthcThanhPhanHoSo tthcThanhPhanHoSo = list.get(0);

					result = tthcThanhPhanHoSo;

					cacheResult(tthcThanhPhanHoSo);

					if ((tthcThanhPhanHoSo.getThuTucHanhChinhId() != thuTucHanhChinhId) ||
							(tthcThanhPhanHoSo.getMaThanhPhan() == null) ||
							!tthcThanhPhanHoSo.getMaThanhPhan()
												  .equals(maThanhPhan)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDANDMATHANHPHAN,
							finderArgs, tthcThanhPhanHoSo);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDANDMATHANHPHAN,
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
			return (TthcThanhPhanHoSo)result;
		}
	}

	/**
	 * Removes the tthc thanh phan ho so where thuTucHanhChinhId = &#63; and maThanhPhan = &#63; from the database.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param maThanhPhan the ma thanh phan
	 * @return the tthc thanh phan ho so that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThanhPhanHoSo removeByThuTucHanhChinhIdAndMaThanhPhan(
		long thuTucHanhChinhId, String maThanhPhan)
		throws NoSuchTthcThanhPhanHoSoException, SystemException {
		TthcThanhPhanHoSo tthcThanhPhanHoSo = findByThuTucHanhChinhIdAndMaThanhPhan(thuTucHanhChinhId,
				maThanhPhan);

		return remove(tthcThanhPhanHoSo);
	}

	/**
	 * Returns the number of tthc thanh phan ho sos where thuTucHanhChinhId = &#63; and maThanhPhan = &#63;.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param maThanhPhan the ma thanh phan
	 * @return the number of matching tthc thanh phan ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByThuTucHanhChinhIdAndMaThanhPhan(long thuTucHanhChinhId,
		String maThanhPhan) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_THUTUCHANHCHINHIDANDMATHANHPHAN;

		Object[] finderArgs = new Object[] { thuTucHanhChinhId, maThanhPhan };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TTHCTHANHPHANHOSO_WHERE);

			query.append(_FINDER_COLUMN_THUTUCHANHCHINHIDANDMATHANHPHAN_THUTUCHANHCHINHID_2);

			boolean bindMaThanhPhan = false;

			if (maThanhPhan == null) {
				query.append(_FINDER_COLUMN_THUTUCHANHCHINHIDANDMATHANHPHAN_MATHANHPHAN_1);
			}
			else if (maThanhPhan.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_THUTUCHANHCHINHIDANDMATHANHPHAN_MATHANHPHAN_3);
			}
			else {
				bindMaThanhPhan = true;

				query.append(_FINDER_COLUMN_THUTUCHANHCHINHIDANDMATHANHPHAN_MATHANHPHAN_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(thuTucHanhChinhId);

				if (bindMaThanhPhan) {
					qPos.add(maThanhPhan);
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

	private static final String _FINDER_COLUMN_THUTUCHANHCHINHIDANDMATHANHPHAN_THUTUCHANHCHINHID_2 =
		"tthcThanhPhanHoSo.thuTucHanhChinhId = ? AND ";
	private static final String _FINDER_COLUMN_THUTUCHANHCHINHIDANDMATHANHPHAN_MATHANHPHAN_1 =
		"tthcThanhPhanHoSo.maThanhPhan IS NULL";
	private static final String _FINDER_COLUMN_THUTUCHANHCHINHIDANDMATHANHPHAN_MATHANHPHAN_2 =
		"tthcThanhPhanHoSo.maThanhPhan = ?";
	private static final String _FINDER_COLUMN_THUTUCHANHCHINHIDANDMATHANHPHAN_MATHANHPHAN_3 =
		"(tthcThanhPhanHoSo.maThanhPhan IS NULL OR tthcThanhPhanHoSo.maThanhPhan = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDMAUDONONLINE =
		new FinderPath(TthcThanhPhanHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcThanhPhanHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcThanhPhanHoSoImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByThuTucHanhChinhIdMauDonOnline",
			new String[] { Long.class.getName() },
			TthcThanhPhanHoSoModelImpl.THUTUCHANHCHINHID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_THUTUCHANHCHINHIDMAUDONONLINE =
		new FinderPath(TthcThanhPhanHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcThanhPhanHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByThuTucHanhChinhIdMauDonOnline",
			new String[] { Long.class.getName() });

	/**
	 * Returns the tthc thanh phan ho so where thuTucHanhChinhId = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoException} if it could not be found.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @return the matching tthc thanh phan ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoException if a matching tthc thanh phan ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThanhPhanHoSo findByThuTucHanhChinhIdMauDonOnline(
		long thuTucHanhChinhId)
		throws NoSuchTthcThanhPhanHoSoException, SystemException {
		TthcThanhPhanHoSo tthcThanhPhanHoSo = fetchByThuTucHanhChinhIdMauDonOnline(thuTucHanhChinhId);

		if (tthcThanhPhanHoSo == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("thuTucHanhChinhId=");
			msg.append(thuTucHanhChinhId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchTthcThanhPhanHoSoException(msg.toString());
		}

		return tthcThanhPhanHoSo;
	}

	/**
	 * Returns the tthc thanh phan ho so where thuTucHanhChinhId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @return the matching tthc thanh phan ho so, or <code>null</code> if a matching tthc thanh phan ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThanhPhanHoSo fetchByThuTucHanhChinhIdMauDonOnline(
		long thuTucHanhChinhId) throws SystemException {
		return fetchByThuTucHanhChinhIdMauDonOnline(thuTucHanhChinhId, true);
	}

	/**
	 * Returns the tthc thanh phan ho so where thuTucHanhChinhId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching tthc thanh phan ho so, or <code>null</code> if a matching tthc thanh phan ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThanhPhanHoSo fetchByThuTucHanhChinhIdMauDonOnline(
		long thuTucHanhChinhId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { thuTucHanhChinhId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDMAUDONONLINE,
					finderArgs, this);
		}

		if (result instanceof TthcThanhPhanHoSo) {
			TthcThanhPhanHoSo tthcThanhPhanHoSo = (TthcThanhPhanHoSo)result;

			if ((thuTucHanhChinhId != tthcThanhPhanHoSo.getThuTucHanhChinhId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_TTHCTHANHPHANHOSO_WHERE);

			query.append(_FINDER_COLUMN_THUTUCHANHCHINHIDMAUDONONLINE_THUTUCHANHCHINHID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(thuTucHanhChinhId);

				List<TthcThanhPhanHoSo> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDMAUDONONLINE,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"TthcThanhPhanHoSoPersistenceImpl.fetchByThuTucHanhChinhIdMauDonOnline(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					TthcThanhPhanHoSo tthcThanhPhanHoSo = list.get(0);

					result = tthcThanhPhanHoSo;

					cacheResult(tthcThanhPhanHoSo);

					if ((tthcThanhPhanHoSo.getThuTucHanhChinhId() != thuTucHanhChinhId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDMAUDONONLINE,
							finderArgs, tthcThanhPhanHoSo);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDMAUDONONLINE,
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
			return (TthcThanhPhanHoSo)result;
		}
	}

	/**
	 * Removes the tthc thanh phan ho so where thuTucHanhChinhId = &#63; from the database.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @return the tthc thanh phan ho so that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThanhPhanHoSo removeByThuTucHanhChinhIdMauDonOnline(
		long thuTucHanhChinhId)
		throws NoSuchTthcThanhPhanHoSoException, SystemException {
		TthcThanhPhanHoSo tthcThanhPhanHoSo = findByThuTucHanhChinhIdMauDonOnline(thuTucHanhChinhId);

		return remove(tthcThanhPhanHoSo);
	}

	/**
	 * Returns the number of tthc thanh phan ho sos where thuTucHanhChinhId = &#63;.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @return the number of matching tthc thanh phan ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByThuTucHanhChinhIdMauDonOnline(long thuTucHanhChinhId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_THUTUCHANHCHINHIDMAUDONONLINE;

		Object[] finderArgs = new Object[] { thuTucHanhChinhId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TTHCTHANHPHANHOSO_WHERE);

			query.append(_FINDER_COLUMN_THUTUCHANHCHINHIDMAUDONONLINE_THUTUCHANHCHINHID_2);

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

	private static final String _FINDER_COLUMN_THUTUCHANHCHINHIDMAUDONONLINE_THUTUCHANHCHINHID_2 =
		"tthcThanhPhanHoSo.thuTucHanhChinhId = ? AND  ( tthcThanhPhanHoSo.thuTuHienThi = 1 and tthcThanhPhanHoSo.mauTrucTuyen is not null ) ";
	public static final FinderPath FINDER_PATH_FETCH_BY_F_THUTUCHANHCHINHID_MATHANHPHAN =
		new FinderPath(TthcThanhPhanHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcThanhPhanHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcThanhPhanHoSoImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByF_thuTucHanhChinhId_maThanhPhan",
			new String[] { Long.class.getName(), String.class.getName() },
			TthcThanhPhanHoSoModelImpl.THUTUCHANHCHINHID_COLUMN_BITMASK |
			TthcThanhPhanHoSoModelImpl.MATHANHPHAN_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_THUTUCHANHCHINHID_MATHANHPHAN =
		new FinderPath(TthcThanhPhanHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcThanhPhanHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByF_thuTucHanhChinhId_maThanhPhan",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the tthc thanh phan ho so where thuTucHanhChinhId = &#63; and maThanhPhan = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoException} if it could not be found.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param maThanhPhan the ma thanh phan
	 * @return the matching tthc thanh phan ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoException if a matching tthc thanh phan ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThanhPhanHoSo findByF_thuTucHanhChinhId_maThanhPhan(
		long thuTucHanhChinhId, String maThanhPhan)
		throws NoSuchTthcThanhPhanHoSoException, SystemException {
		TthcThanhPhanHoSo tthcThanhPhanHoSo = fetchByF_thuTucHanhChinhId_maThanhPhan(thuTucHanhChinhId,
				maThanhPhan);

		if (tthcThanhPhanHoSo == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("thuTucHanhChinhId=");
			msg.append(thuTucHanhChinhId);

			msg.append(", maThanhPhan=");
			msg.append(maThanhPhan);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchTthcThanhPhanHoSoException(msg.toString());
		}

		return tthcThanhPhanHoSo;
	}

	/**
	 * Returns the tthc thanh phan ho so where thuTucHanhChinhId = &#63; and maThanhPhan = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param maThanhPhan the ma thanh phan
	 * @return the matching tthc thanh phan ho so, or <code>null</code> if a matching tthc thanh phan ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThanhPhanHoSo fetchByF_thuTucHanhChinhId_maThanhPhan(
		long thuTucHanhChinhId, String maThanhPhan) throws SystemException {
		return fetchByF_thuTucHanhChinhId_maThanhPhan(thuTucHanhChinhId,
			maThanhPhan, true);
	}

	/**
	 * Returns the tthc thanh phan ho so where thuTucHanhChinhId = &#63; and maThanhPhan = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param maThanhPhan the ma thanh phan
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching tthc thanh phan ho so, or <code>null</code> if a matching tthc thanh phan ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThanhPhanHoSo fetchByF_thuTucHanhChinhId_maThanhPhan(
		long thuTucHanhChinhId, String maThanhPhan, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { thuTucHanhChinhId, maThanhPhan };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_F_THUTUCHANHCHINHID_MATHANHPHAN,
					finderArgs, this);
		}

		if (result instanceof TthcThanhPhanHoSo) {
			TthcThanhPhanHoSo tthcThanhPhanHoSo = (TthcThanhPhanHoSo)result;

			if ((thuTucHanhChinhId != tthcThanhPhanHoSo.getThuTucHanhChinhId()) ||
					!Validator.equals(maThanhPhan,
						tthcThanhPhanHoSo.getMaThanhPhan())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_TTHCTHANHPHANHOSO_WHERE);

			query.append(_FINDER_COLUMN_F_THUTUCHANHCHINHID_MATHANHPHAN_THUTUCHANHCHINHID_2);

			boolean bindMaThanhPhan = false;

			if (maThanhPhan == null) {
				query.append(_FINDER_COLUMN_F_THUTUCHANHCHINHID_MATHANHPHAN_MATHANHPHAN_1);
			}
			else if (maThanhPhan.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_THUTUCHANHCHINHID_MATHANHPHAN_MATHANHPHAN_3);
			}
			else {
				bindMaThanhPhan = true;

				query.append(_FINDER_COLUMN_F_THUTUCHANHCHINHID_MATHANHPHAN_MATHANHPHAN_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(thuTucHanhChinhId);

				if (bindMaThanhPhan) {
					qPos.add(maThanhPhan);
				}

				List<TthcThanhPhanHoSo> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_THUTUCHANHCHINHID_MATHANHPHAN,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"TthcThanhPhanHoSoPersistenceImpl.fetchByF_thuTucHanhChinhId_maThanhPhan(long, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					TthcThanhPhanHoSo tthcThanhPhanHoSo = list.get(0);

					result = tthcThanhPhanHoSo;

					cacheResult(tthcThanhPhanHoSo);

					if ((tthcThanhPhanHoSo.getThuTucHanhChinhId() != thuTucHanhChinhId) ||
							(tthcThanhPhanHoSo.getMaThanhPhan() == null) ||
							!tthcThanhPhanHoSo.getMaThanhPhan()
												  .equals(maThanhPhan)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_THUTUCHANHCHINHID_MATHANHPHAN,
							finderArgs, tthcThanhPhanHoSo);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_F_THUTUCHANHCHINHID_MATHANHPHAN,
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
			return (TthcThanhPhanHoSo)result;
		}
	}

	/**
	 * Removes the tthc thanh phan ho so where thuTucHanhChinhId = &#63; and maThanhPhan = &#63; from the database.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param maThanhPhan the ma thanh phan
	 * @return the tthc thanh phan ho so that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThanhPhanHoSo removeByF_thuTucHanhChinhId_maThanhPhan(
		long thuTucHanhChinhId, String maThanhPhan)
		throws NoSuchTthcThanhPhanHoSoException, SystemException {
		TthcThanhPhanHoSo tthcThanhPhanHoSo = findByF_thuTucHanhChinhId_maThanhPhan(thuTucHanhChinhId,
				maThanhPhan);

		return remove(tthcThanhPhanHoSo);
	}

	/**
	 * Returns the number of tthc thanh phan ho sos where thuTucHanhChinhId = &#63; and maThanhPhan = &#63;.
	 *
	 * @param thuTucHanhChinhId the thu tuc hanh chinh ID
	 * @param maThanhPhan the ma thanh phan
	 * @return the number of matching tthc thanh phan ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByF_thuTucHanhChinhId_maThanhPhan(long thuTucHanhChinhId,
		String maThanhPhan) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_THUTUCHANHCHINHID_MATHANHPHAN;

		Object[] finderArgs = new Object[] { thuTucHanhChinhId, maThanhPhan };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TTHCTHANHPHANHOSO_WHERE);

			query.append(_FINDER_COLUMN_F_THUTUCHANHCHINHID_MATHANHPHAN_THUTUCHANHCHINHID_2);

			boolean bindMaThanhPhan = false;

			if (maThanhPhan == null) {
				query.append(_FINDER_COLUMN_F_THUTUCHANHCHINHID_MATHANHPHAN_MATHANHPHAN_1);
			}
			else if (maThanhPhan.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_THUTUCHANHCHINHID_MATHANHPHAN_MATHANHPHAN_3);
			}
			else {
				bindMaThanhPhan = true;

				query.append(_FINDER_COLUMN_F_THUTUCHANHCHINHID_MATHANHPHAN_MATHANHPHAN_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(thuTucHanhChinhId);

				if (bindMaThanhPhan) {
					qPos.add(maThanhPhan);
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

	private static final String _FINDER_COLUMN_F_THUTUCHANHCHINHID_MATHANHPHAN_THUTUCHANHCHINHID_2 =
		"tthcThanhPhanHoSo.thuTucHanhChinhId = ? AND ";
	private static final String _FINDER_COLUMN_F_THUTUCHANHCHINHID_MATHANHPHAN_MATHANHPHAN_1 =
		"tthcThanhPhanHoSo.maThanhPhan IS NULL";
	private static final String _FINDER_COLUMN_F_THUTUCHANHCHINHID_MATHANHPHAN_MATHANHPHAN_2 =
		"tthcThanhPhanHoSo.maThanhPhan = ?";
	private static final String _FINDER_COLUMN_F_THUTUCHANHCHINHID_MATHANHPHAN_MATHANHPHAN_3 =
		"(tthcThanhPhanHoSo.maThanhPhan IS NULL OR tthcThanhPhanHoSo.maThanhPhan = '')";

	public TthcThanhPhanHoSoPersistenceImpl() {
		setModelClass(TthcThanhPhanHoSo.class);
	}

	/**
	 * Caches the tthc thanh phan ho so in the entity cache if it is enabled.
	 *
	 * @param tthcThanhPhanHoSo the tthc thanh phan ho so
	 */
	@Override
	public void cacheResult(TthcThanhPhanHoSo tthcThanhPhanHoSo) {
		EntityCacheUtil.putResult(TthcThanhPhanHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcThanhPhanHoSoImpl.class, tthcThanhPhanHoSo.getPrimaryKey(),
			tthcThanhPhanHoSo);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDANDMATHANHPHAN,
			new Object[] {
				tthcThanhPhanHoSo.getThuTucHanhChinhId(),
				tthcThanhPhanHoSo.getMaThanhPhan()
			}, tthcThanhPhanHoSo);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDMAUDONONLINE,
			new Object[] { tthcThanhPhanHoSo.getThuTucHanhChinhId() },
			tthcThanhPhanHoSo);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_THUTUCHANHCHINHID_MATHANHPHAN,
			new Object[] {
				tthcThanhPhanHoSo.getThuTucHanhChinhId(),
				tthcThanhPhanHoSo.getMaThanhPhan()
			}, tthcThanhPhanHoSo);

		tthcThanhPhanHoSo.resetOriginalValues();
	}

	/**
	 * Caches the tthc thanh phan ho sos in the entity cache if it is enabled.
	 *
	 * @param tthcThanhPhanHoSos the tthc thanh phan ho sos
	 */
	@Override
	public void cacheResult(List<TthcThanhPhanHoSo> tthcThanhPhanHoSos) {
		for (TthcThanhPhanHoSo tthcThanhPhanHoSo : tthcThanhPhanHoSos) {
			if (EntityCacheUtil.getResult(
						TthcThanhPhanHoSoModelImpl.ENTITY_CACHE_ENABLED,
						TthcThanhPhanHoSoImpl.class,
						tthcThanhPhanHoSo.getPrimaryKey()) == null) {
				cacheResult(tthcThanhPhanHoSo);
			}
			else {
				tthcThanhPhanHoSo.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tthc thanh phan ho sos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TthcThanhPhanHoSoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TthcThanhPhanHoSoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tthc thanh phan ho so.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TthcThanhPhanHoSo tthcThanhPhanHoSo) {
		EntityCacheUtil.removeResult(TthcThanhPhanHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcThanhPhanHoSoImpl.class, tthcThanhPhanHoSo.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(tthcThanhPhanHoSo);
	}

	@Override
	public void clearCache(List<TthcThanhPhanHoSo> tthcThanhPhanHoSos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TthcThanhPhanHoSo tthcThanhPhanHoSo : tthcThanhPhanHoSos) {
			EntityCacheUtil.removeResult(TthcThanhPhanHoSoModelImpl.ENTITY_CACHE_ENABLED,
				TthcThanhPhanHoSoImpl.class, tthcThanhPhanHoSo.getPrimaryKey());

			clearUniqueFindersCache(tthcThanhPhanHoSo);
		}
	}

	protected void cacheUniqueFindersCache(TthcThanhPhanHoSo tthcThanhPhanHoSo) {
		if (tthcThanhPhanHoSo.isNew()) {
			Object[] args = new Object[] {
					tthcThanhPhanHoSo.getThuTucHanhChinhId(),
					tthcThanhPhanHoSo.getMaThanhPhan()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_THUTUCHANHCHINHIDANDMATHANHPHAN,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDANDMATHANHPHAN,
				args, tthcThanhPhanHoSo);

			args = new Object[] { tthcThanhPhanHoSo.getThuTucHanhChinhId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_THUTUCHANHCHINHIDMAUDONONLINE,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDMAUDONONLINE,
				args, tthcThanhPhanHoSo);

			args = new Object[] {
					tthcThanhPhanHoSo.getThuTucHanhChinhId(),
					tthcThanhPhanHoSo.getMaThanhPhan()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_F_THUTUCHANHCHINHID_MATHANHPHAN,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_THUTUCHANHCHINHID_MATHANHPHAN,
				args, tthcThanhPhanHoSo);
		}
		else {
			TthcThanhPhanHoSoModelImpl tthcThanhPhanHoSoModelImpl = (TthcThanhPhanHoSoModelImpl)tthcThanhPhanHoSo;

			if ((tthcThanhPhanHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDANDMATHANHPHAN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcThanhPhanHoSo.getThuTucHanhChinhId(),
						tthcThanhPhanHoSo.getMaThanhPhan()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_THUTUCHANHCHINHIDANDMATHANHPHAN,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDANDMATHANHPHAN,
					args, tthcThanhPhanHoSo);
			}

			if ((tthcThanhPhanHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDMAUDONONLINE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcThanhPhanHoSo.getThuTucHanhChinhId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_THUTUCHANHCHINHIDMAUDONONLINE,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDMAUDONONLINE,
					args, tthcThanhPhanHoSo);
			}

			if ((tthcThanhPhanHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_F_THUTUCHANHCHINHID_MATHANHPHAN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcThanhPhanHoSo.getThuTucHanhChinhId(),
						tthcThanhPhanHoSo.getMaThanhPhan()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_F_THUTUCHANHCHINHID_MATHANHPHAN,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_THUTUCHANHCHINHID_MATHANHPHAN,
					args, tthcThanhPhanHoSo);
			}
		}
	}

	protected void clearUniqueFindersCache(TthcThanhPhanHoSo tthcThanhPhanHoSo) {
		TthcThanhPhanHoSoModelImpl tthcThanhPhanHoSoModelImpl = (TthcThanhPhanHoSoModelImpl)tthcThanhPhanHoSo;

		Object[] args = new Object[] {
				tthcThanhPhanHoSo.getThuTucHanhChinhId(),
				tthcThanhPhanHoSo.getMaThanhPhan()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_THUTUCHANHCHINHIDANDMATHANHPHAN,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDANDMATHANHPHAN,
			args);

		if ((tthcThanhPhanHoSoModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDANDMATHANHPHAN.getColumnBitmask()) != 0) {
			args = new Object[] {
					tthcThanhPhanHoSoModelImpl.getOriginalThuTucHanhChinhId(),
					tthcThanhPhanHoSoModelImpl.getOriginalMaThanhPhan()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_THUTUCHANHCHINHIDANDMATHANHPHAN,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDANDMATHANHPHAN,
				args);
		}

		args = new Object[] { tthcThanhPhanHoSo.getThuTucHanhChinhId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_THUTUCHANHCHINHIDMAUDONONLINE,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDMAUDONONLINE,
			args);

		if ((tthcThanhPhanHoSoModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDMAUDONONLINE.getColumnBitmask()) != 0) {
			args = new Object[] {
					tthcThanhPhanHoSoModelImpl.getOriginalThuTucHanhChinhId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_THUTUCHANHCHINHIDMAUDONONLINE,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_THUTUCHANHCHINHIDMAUDONONLINE,
				args);
		}

		args = new Object[] {
				tthcThanhPhanHoSo.getThuTucHanhChinhId(),
				tthcThanhPhanHoSo.getMaThanhPhan()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_THUTUCHANHCHINHID_MATHANHPHAN,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_F_THUTUCHANHCHINHID_MATHANHPHAN,
			args);

		if ((tthcThanhPhanHoSoModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_F_THUTUCHANHCHINHID_MATHANHPHAN.getColumnBitmask()) != 0) {
			args = new Object[] {
					tthcThanhPhanHoSoModelImpl.getOriginalThuTucHanhChinhId(),
					tthcThanhPhanHoSoModelImpl.getOriginalMaThanhPhan()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_THUTUCHANHCHINHID_MATHANHPHAN,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_F_THUTUCHANHCHINHID_MATHANHPHAN,
				args);
		}
	}

	/**
	 * Creates a new tthc thanh phan ho so with the primary key. Does not add the tthc thanh phan ho so to the database.
	 *
	 * @param id the primary key for the new tthc thanh phan ho so
	 * @return the new tthc thanh phan ho so
	 */
	@Override
	public TthcThanhPhanHoSo create(long id) {
		TthcThanhPhanHoSo tthcThanhPhanHoSo = new TthcThanhPhanHoSoImpl();

		tthcThanhPhanHoSo.setNew(true);
		tthcThanhPhanHoSo.setPrimaryKey(id);

		return tthcThanhPhanHoSo;
	}

	/**
	 * Removes the tthc thanh phan ho so with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the tthc thanh phan ho so
	 * @return the tthc thanh phan ho so that was removed
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoException if a tthc thanh phan ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThanhPhanHoSo remove(long id)
		throws NoSuchTthcThanhPhanHoSoException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the tthc thanh phan ho so with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tthc thanh phan ho so
	 * @return the tthc thanh phan ho so that was removed
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoException if a tthc thanh phan ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThanhPhanHoSo remove(Serializable primaryKey)
		throws NoSuchTthcThanhPhanHoSoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TthcThanhPhanHoSo tthcThanhPhanHoSo = (TthcThanhPhanHoSo)session.get(TthcThanhPhanHoSoImpl.class,
					primaryKey);

			if (tthcThanhPhanHoSo == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTthcThanhPhanHoSoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tthcThanhPhanHoSo);
		}
		catch (NoSuchTthcThanhPhanHoSoException nsee) {
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
	protected TthcThanhPhanHoSo removeImpl(TthcThanhPhanHoSo tthcThanhPhanHoSo)
		throws SystemException {
		tthcThanhPhanHoSo = toUnwrappedModel(tthcThanhPhanHoSo);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tthcThanhPhanHoSo)) {
				tthcThanhPhanHoSo = (TthcThanhPhanHoSo)session.get(TthcThanhPhanHoSoImpl.class,
						tthcThanhPhanHoSo.getPrimaryKeyObj());
			}

			if (tthcThanhPhanHoSo != null) {
				session.delete(tthcThanhPhanHoSo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tthcThanhPhanHoSo != null) {
			clearCache(tthcThanhPhanHoSo);
		}

		return tthcThanhPhanHoSo;
	}

	@Override
	public TthcThanhPhanHoSo updateImpl(
		vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo tthcThanhPhanHoSo)
		throws SystemException {
		tthcThanhPhanHoSo = toUnwrappedModel(tthcThanhPhanHoSo);

		boolean isNew = tthcThanhPhanHoSo.isNew();

		TthcThanhPhanHoSoModelImpl tthcThanhPhanHoSoModelImpl = (TthcThanhPhanHoSoModelImpl)tthcThanhPhanHoSo;

		Session session = null;

		try {
			session = openSession();

			if (tthcThanhPhanHoSo.isNew()) {
				session.save(tthcThanhPhanHoSo);

				tthcThanhPhanHoSo.setNew(false);
			}
			else {
				session.merge(tthcThanhPhanHoSo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TthcThanhPhanHoSoModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tthcThanhPhanHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_THUTUCHANHCHINHID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcThanhPhanHoSoModelImpl.getOriginalThuTucHanhChinhId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_THUTUCHANHCHINHID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_THUTUCHANHCHINHID,
					args);

				args = new Object[] {
						tthcThanhPhanHoSoModelImpl.getThuTucHanhChinhId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_THUTUCHANHCHINHID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_THUTUCHANHCHINHID,
					args);
			}
		}

		EntityCacheUtil.putResult(TthcThanhPhanHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcThanhPhanHoSoImpl.class, tthcThanhPhanHoSo.getPrimaryKey(),
			tthcThanhPhanHoSo);

		clearUniqueFindersCache(tthcThanhPhanHoSo);
		cacheUniqueFindersCache(tthcThanhPhanHoSo);

		return tthcThanhPhanHoSo;
	}

	protected TthcThanhPhanHoSo toUnwrappedModel(
		TthcThanhPhanHoSo tthcThanhPhanHoSo) {
		if (tthcThanhPhanHoSo instanceof TthcThanhPhanHoSoImpl) {
			return tthcThanhPhanHoSo;
		}

		TthcThanhPhanHoSoImpl tthcThanhPhanHoSoImpl = new TthcThanhPhanHoSoImpl();

		tthcThanhPhanHoSoImpl.setNew(tthcThanhPhanHoSo.isNew());
		tthcThanhPhanHoSoImpl.setPrimaryKey(tthcThanhPhanHoSo.getPrimaryKey());

		tthcThanhPhanHoSoImpl.setId(tthcThanhPhanHoSo.getId());
		tthcThanhPhanHoSoImpl.setThuTucHanhChinhId(tthcThanhPhanHoSo.getThuTucHanhChinhId());
		tthcThanhPhanHoSoImpl.setTenThanhPhan(tthcThanhPhanHoSo.getTenThanhPhan());
		tthcThanhPhanHoSoImpl.setGhiChu(tthcThanhPhanHoSo.getGhiChu());
		tthcThanhPhanHoSoImpl.setMaThanhPhan(tthcThanhPhanHoSo.getMaThanhPhan());
		tthcThanhPhanHoSoImpl.setThuTuHienThi(tthcThanhPhanHoSo.getThuTuHienThi());
		tthcThanhPhanHoSoImpl.setLoaiThanhPhan(tthcThanhPhanHoSo.getLoaiThanhPhan());
		tthcThanhPhanHoSoImpl.setSoTaiLieuDinhKem(tthcThanhPhanHoSo.getSoTaiLieuDinhKem());
		tthcThanhPhanHoSoImpl.setMauTrucTuyen(tthcThanhPhanHoSo.getMauTrucTuyen());

		return tthcThanhPhanHoSoImpl;
	}

	/**
	 * Returns the tthc thanh phan ho so with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc thanh phan ho so
	 * @return the tthc thanh phan ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoException if a tthc thanh phan ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThanhPhanHoSo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTthcThanhPhanHoSoException, SystemException {
		TthcThanhPhanHoSo tthcThanhPhanHoSo = fetchByPrimaryKey(primaryKey);

		if (tthcThanhPhanHoSo == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTthcThanhPhanHoSoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tthcThanhPhanHoSo;
	}

	/**
	 * Returns the tthc thanh phan ho so with the primary key or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoException} if it could not be found.
	 *
	 * @param id the primary key of the tthc thanh phan ho so
	 * @return the tthc thanh phan ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoException if a tthc thanh phan ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThanhPhanHoSo findByPrimaryKey(long id)
		throws NoSuchTthcThanhPhanHoSoException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the tthc thanh phan ho so with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc thanh phan ho so
	 * @return the tthc thanh phan ho so, or <code>null</code> if a tthc thanh phan ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThanhPhanHoSo fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TthcThanhPhanHoSo tthcThanhPhanHoSo = (TthcThanhPhanHoSo)EntityCacheUtil.getResult(TthcThanhPhanHoSoModelImpl.ENTITY_CACHE_ENABLED,
				TthcThanhPhanHoSoImpl.class, primaryKey);

		if (tthcThanhPhanHoSo == _nullTthcThanhPhanHoSo) {
			return null;
		}

		if (tthcThanhPhanHoSo == null) {
			Session session = null;

			try {
				session = openSession();

				tthcThanhPhanHoSo = (TthcThanhPhanHoSo)session.get(TthcThanhPhanHoSoImpl.class,
						primaryKey);

				if (tthcThanhPhanHoSo != null) {
					cacheResult(tthcThanhPhanHoSo);
				}
				else {
					EntityCacheUtil.putResult(TthcThanhPhanHoSoModelImpl.ENTITY_CACHE_ENABLED,
						TthcThanhPhanHoSoImpl.class, primaryKey,
						_nullTthcThanhPhanHoSo);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TthcThanhPhanHoSoModelImpl.ENTITY_CACHE_ENABLED,
					TthcThanhPhanHoSoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tthcThanhPhanHoSo;
	}

	/**
	 * Returns the tthc thanh phan ho so with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the tthc thanh phan ho so
	 * @return the tthc thanh phan ho so, or <code>null</code> if a tthc thanh phan ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThanhPhanHoSo fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the tthc thanh phan ho sos.
	 *
	 * @return the tthc thanh phan ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcThanhPhanHoSo> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc thanh phan ho sos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcThanhPhanHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc thanh phan ho sos
	 * @param end the upper bound of the range of tthc thanh phan ho sos (not inclusive)
	 * @return the range of tthc thanh phan ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcThanhPhanHoSo> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc thanh phan ho sos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcThanhPhanHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc thanh phan ho sos
	 * @param end the upper bound of the range of tthc thanh phan ho sos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tthc thanh phan ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcThanhPhanHoSo> findAll(int start, int end,
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

		List<TthcThanhPhanHoSo> list = (List<TthcThanhPhanHoSo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TTHCTHANHPHANHOSO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TTHCTHANHPHANHOSO;

				if (pagination) {
					sql = sql.concat(TthcThanhPhanHoSoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TthcThanhPhanHoSo>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcThanhPhanHoSo>(list);
				}
				else {
					list = (List<TthcThanhPhanHoSo>)QueryUtil.list(q,
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
	 * Removes all the tthc thanh phan ho sos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TthcThanhPhanHoSo tthcThanhPhanHoSo : findAll()) {
			remove(tthcThanhPhanHoSo);
		}
	}

	/**
	 * Returns the number of tthc thanh phan ho sos.
	 *
	 * @return the number of tthc thanh phan ho sos
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

				Query q = session.createQuery(_SQL_COUNT_TTHCTHANHPHANHOSO);

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
	 * Initializes the tthc thanh phan ho so persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TthcThanhPhanHoSo>> listenersList = new ArrayList<ModelListener<TthcThanhPhanHoSo>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TthcThanhPhanHoSo>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TthcThanhPhanHoSoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TTHCTHANHPHANHOSO = "SELECT tthcThanhPhanHoSo FROM TthcThanhPhanHoSo tthcThanhPhanHoSo";
	private static final String _SQL_SELECT_TTHCTHANHPHANHOSO_WHERE = "SELECT tthcThanhPhanHoSo FROM TthcThanhPhanHoSo tthcThanhPhanHoSo WHERE ";
	private static final String _SQL_COUNT_TTHCTHANHPHANHOSO = "SELECT COUNT(tthcThanhPhanHoSo) FROM TthcThanhPhanHoSo tthcThanhPhanHoSo";
	private static final String _SQL_COUNT_TTHCTHANHPHANHOSO_WHERE = "SELECT COUNT(tthcThanhPhanHoSo) FROM TthcThanhPhanHoSo tthcThanhPhanHoSo WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tthcThanhPhanHoSo.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TthcThanhPhanHoSo exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TthcThanhPhanHoSo exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TthcThanhPhanHoSoPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"thuTucHanhChinhId", "tenThanhPhan", "ghiChu", "maThanhPhan",
				"thuTuHienThi", "loaiThanhPhan", "soTaiLieuDinhKem",
				"mauTrucTuyen"
			});
	private static TthcThanhPhanHoSo _nullTthcThanhPhanHoSo = new TthcThanhPhanHoSoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TthcThanhPhanHoSo> toCacheModel() {
				return _nullTthcThanhPhanHoSoCacheModel;
			}
		};

	private static CacheModel<TthcThanhPhanHoSo> _nullTthcThanhPhanHoSoCacheModel =
		new CacheModel<TthcThanhPhanHoSo>() {
			@Override
			public TthcThanhPhanHoSo toEntityModel() {
				return _nullTthcThanhPhanHoSo;
			}
		};
}