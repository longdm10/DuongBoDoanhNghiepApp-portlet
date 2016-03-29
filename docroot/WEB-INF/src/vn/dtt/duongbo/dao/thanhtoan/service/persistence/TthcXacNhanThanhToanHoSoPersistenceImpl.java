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

package vn.dtt.duongbo.dao.thanhtoan.service.persistence;

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
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanHoSoException;
import vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo;
import vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcXacNhanThanhToanHoSoImpl;
import vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcXacNhanThanhToanHoSoModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the tthc xac nhan thanh toan ho so service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcXacNhanThanhToanHoSoPersistence
 * @see TthcXacNhanThanhToanHoSoUtil
 * @generated
 */
public class TthcXacNhanThanhToanHoSoPersistenceImpl extends BasePersistenceImpl<TthcXacNhanThanhToanHoSo>
	implements TthcXacNhanThanhToanHoSoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TthcXacNhanThanhToanHoSoUtil} to access the tthc xac nhan thanh toan ho so persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TthcXacNhanThanhToanHoSoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TthcXacNhanThanhToanHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcXacNhanThanhToanHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcXacNhanThanhToanHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TthcXacNhanThanhToanHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcXacNhanThanhToanHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcXacNhanThanhToanHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TthcXacNhanThanhToanHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcXacNhanThanhToanHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_XACNHANTHANHTOANID =
		new FinderPath(TthcXacNhanThanhToanHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcXacNhanThanhToanHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcXacNhanThanhToanHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByXacNhanThanhToanId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_XACNHANTHANHTOANID =
		new FinderPath(TthcXacNhanThanhToanHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcXacNhanThanhToanHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcXacNhanThanhToanHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByXacNhanThanhToanId", new String[] { Long.class.getName() },
			TthcXacNhanThanhToanHoSoModelImpl.XACNHANTHANHTOANID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_XACNHANTHANHTOANID = new FinderPath(TthcXacNhanThanhToanHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcXacNhanThanhToanHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByXacNhanThanhToanId", new String[] { Long.class.getName() });

	/**
	 * Returns all the tthc xac nhan thanh toan ho sos where xacNhanThanhToanId = &#63;.
	 *
	 * @param xacNhanThanhToanId the xac nhan thanh toan ID
	 * @return the matching tthc xac nhan thanh toan ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcXacNhanThanhToanHoSo> findByXacNhanThanhToanId(
		long xacNhanThanhToanId) throws SystemException {
		return findByXacNhanThanhToanId(xacNhanThanhToanId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc xac nhan thanh toan ho sos where xacNhanThanhToanId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcXacNhanThanhToanHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param xacNhanThanhToanId the xac nhan thanh toan ID
	 * @param start the lower bound of the range of tthc xac nhan thanh toan ho sos
	 * @param end the upper bound of the range of tthc xac nhan thanh toan ho sos (not inclusive)
	 * @return the range of matching tthc xac nhan thanh toan ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcXacNhanThanhToanHoSo> findByXacNhanThanhToanId(
		long xacNhanThanhToanId, int start, int end) throws SystemException {
		return findByXacNhanThanhToanId(xacNhanThanhToanId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc xac nhan thanh toan ho sos where xacNhanThanhToanId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcXacNhanThanhToanHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param xacNhanThanhToanId the xac nhan thanh toan ID
	 * @param start the lower bound of the range of tthc xac nhan thanh toan ho sos
	 * @param end the upper bound of the range of tthc xac nhan thanh toan ho sos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tthc xac nhan thanh toan ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcXacNhanThanhToanHoSo> findByXacNhanThanhToanId(
		long xacNhanThanhToanId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_XACNHANTHANHTOANID;
			finderArgs = new Object[] { xacNhanThanhToanId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_XACNHANTHANHTOANID;
			finderArgs = new Object[] {
					xacNhanThanhToanId,
					
					start, end, orderByComparator
				};
		}

		List<TthcXacNhanThanhToanHoSo> list = (List<TthcXacNhanThanhToanHoSo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo : list) {
				if ((xacNhanThanhToanId != tthcXacNhanThanhToanHoSo.getXacNhanThanhToanId())) {
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

			query.append(_SQL_SELECT_TTHCXACNHANTHANHTOANHOSO_WHERE);

			query.append(_FINDER_COLUMN_XACNHANTHANHTOANID_XACNHANTHANHTOANID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TthcXacNhanThanhToanHoSoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(xacNhanThanhToanId);

				if (!pagination) {
					list = (List<TthcXacNhanThanhToanHoSo>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcXacNhanThanhToanHoSo>(list);
				}
				else {
					list = (List<TthcXacNhanThanhToanHoSo>)QueryUtil.list(q,
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
	 * Returns the first tthc xac nhan thanh toan ho so in the ordered set where xacNhanThanhToanId = &#63;.
	 *
	 * @param xacNhanThanhToanId the xac nhan thanh toan ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc xac nhan thanh toan ho so
	 * @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanHoSoException if a matching tthc xac nhan thanh toan ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcXacNhanThanhToanHoSo findByXacNhanThanhToanId_First(
		long xacNhanThanhToanId, OrderByComparator orderByComparator)
		throws NoSuchTthcXacNhanThanhToanHoSoException, SystemException {
		TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo = fetchByXacNhanThanhToanId_First(xacNhanThanhToanId,
				orderByComparator);

		if (tthcXacNhanThanhToanHoSo != null) {
			return tthcXacNhanThanhToanHoSo;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("xacNhanThanhToanId=");
		msg.append(xacNhanThanhToanId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcXacNhanThanhToanHoSoException(msg.toString());
	}

	/**
	 * Returns the first tthc xac nhan thanh toan ho so in the ordered set where xacNhanThanhToanId = &#63;.
	 *
	 * @param xacNhanThanhToanId the xac nhan thanh toan ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc xac nhan thanh toan ho so, or <code>null</code> if a matching tthc xac nhan thanh toan ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcXacNhanThanhToanHoSo fetchByXacNhanThanhToanId_First(
		long xacNhanThanhToanId, OrderByComparator orderByComparator)
		throws SystemException {
		List<TthcXacNhanThanhToanHoSo> list = findByXacNhanThanhToanId(xacNhanThanhToanId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tthc xac nhan thanh toan ho so in the ordered set where xacNhanThanhToanId = &#63;.
	 *
	 * @param xacNhanThanhToanId the xac nhan thanh toan ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc xac nhan thanh toan ho so
	 * @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanHoSoException if a matching tthc xac nhan thanh toan ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcXacNhanThanhToanHoSo findByXacNhanThanhToanId_Last(
		long xacNhanThanhToanId, OrderByComparator orderByComparator)
		throws NoSuchTthcXacNhanThanhToanHoSoException, SystemException {
		TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo = fetchByXacNhanThanhToanId_Last(xacNhanThanhToanId,
				orderByComparator);

		if (tthcXacNhanThanhToanHoSo != null) {
			return tthcXacNhanThanhToanHoSo;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("xacNhanThanhToanId=");
		msg.append(xacNhanThanhToanId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcXacNhanThanhToanHoSoException(msg.toString());
	}

	/**
	 * Returns the last tthc xac nhan thanh toan ho so in the ordered set where xacNhanThanhToanId = &#63;.
	 *
	 * @param xacNhanThanhToanId the xac nhan thanh toan ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc xac nhan thanh toan ho so, or <code>null</code> if a matching tthc xac nhan thanh toan ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcXacNhanThanhToanHoSo fetchByXacNhanThanhToanId_Last(
		long xacNhanThanhToanId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByXacNhanThanhToanId(xacNhanThanhToanId);

		if (count == 0) {
			return null;
		}

		List<TthcXacNhanThanhToanHoSo> list = findByXacNhanThanhToanId(xacNhanThanhToanId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tthc xac nhan thanh toan ho sos before and after the current tthc xac nhan thanh toan ho so in the ordered set where xacNhanThanhToanId = &#63;.
	 *
	 * @param id the primary key of the current tthc xac nhan thanh toan ho so
	 * @param xacNhanThanhToanId the xac nhan thanh toan ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tthc xac nhan thanh toan ho so
	 * @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanHoSoException if a tthc xac nhan thanh toan ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcXacNhanThanhToanHoSo[] findByXacNhanThanhToanId_PrevAndNext(
		long id, long xacNhanThanhToanId, OrderByComparator orderByComparator)
		throws NoSuchTthcXacNhanThanhToanHoSoException, SystemException {
		TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TthcXacNhanThanhToanHoSo[] array = new TthcXacNhanThanhToanHoSoImpl[3];

			array[0] = getByXacNhanThanhToanId_PrevAndNext(session,
					tthcXacNhanThanhToanHoSo, xacNhanThanhToanId,
					orderByComparator, true);

			array[1] = tthcXacNhanThanhToanHoSo;

			array[2] = getByXacNhanThanhToanId_PrevAndNext(session,
					tthcXacNhanThanhToanHoSo, xacNhanThanhToanId,
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

	protected TthcXacNhanThanhToanHoSo getByXacNhanThanhToanId_PrevAndNext(
		Session session, TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo,
		long xacNhanThanhToanId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TTHCXACNHANTHANHTOANHOSO_WHERE);

		query.append(_FINDER_COLUMN_XACNHANTHANHTOANID_XACNHANTHANHTOANID_2);

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
			query.append(TthcXacNhanThanhToanHoSoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(xacNhanThanhToanId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tthcXacNhanThanhToanHoSo);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TthcXacNhanThanhToanHoSo> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tthc xac nhan thanh toan ho sos where xacNhanThanhToanId = &#63; from the database.
	 *
	 * @param xacNhanThanhToanId the xac nhan thanh toan ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByXacNhanThanhToanId(long xacNhanThanhToanId)
		throws SystemException {
		for (TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo : findByXacNhanThanhToanId(
				xacNhanThanhToanId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tthcXacNhanThanhToanHoSo);
		}
	}

	/**
	 * Returns the number of tthc xac nhan thanh toan ho sos where xacNhanThanhToanId = &#63;.
	 *
	 * @param xacNhanThanhToanId the xac nhan thanh toan ID
	 * @return the number of matching tthc xac nhan thanh toan ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByXacNhanThanhToanId(long xacNhanThanhToanId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_XACNHANTHANHTOANID;

		Object[] finderArgs = new Object[] { xacNhanThanhToanId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TTHCXACNHANTHANHTOANHOSO_WHERE);

			query.append(_FINDER_COLUMN_XACNHANTHANHTOANID_XACNHANTHANHTOANID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(xacNhanThanhToanId);

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

	private static final String _FINDER_COLUMN_XACNHANTHANHTOANID_XACNHANTHANHTOANID_2 =
		"tthcXacNhanThanhToanHoSo.xacNhanThanhToanId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_HOSOTHUTUCID = new FinderPath(TthcXacNhanThanhToanHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcXacNhanThanhToanHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcXacNhanThanhToanHoSoImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByHoSoThuTucId", new String[] { Long.class.getName() },
			TthcXacNhanThanhToanHoSoModelImpl.HOSOTHUTUCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_HOSOTHUTUCID = new FinderPath(TthcXacNhanThanhToanHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcXacNhanThanhToanHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByHoSoThuTucId",
			new String[] { Long.class.getName() });

	/**
	 * Returns the tthc xac nhan thanh toan ho so where hoSoThuTucId = &#63; or throws a {@link vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanHoSoException} if it could not be found.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the matching tthc xac nhan thanh toan ho so
	 * @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanHoSoException if a matching tthc xac nhan thanh toan ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcXacNhanThanhToanHoSo findByHoSoThuTucId(long hoSoThuTucId)
		throws NoSuchTthcXacNhanThanhToanHoSoException, SystemException {
		TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo = fetchByHoSoThuTucId(hoSoThuTucId);

		if (tthcXacNhanThanhToanHoSo == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("hoSoThuTucId=");
			msg.append(hoSoThuTucId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchTthcXacNhanThanhToanHoSoException(msg.toString());
		}

		return tthcXacNhanThanhToanHoSo;
	}

	/**
	 * Returns the tthc xac nhan thanh toan ho so where hoSoThuTucId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the matching tthc xac nhan thanh toan ho so, or <code>null</code> if a matching tthc xac nhan thanh toan ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcXacNhanThanhToanHoSo fetchByHoSoThuTucId(long hoSoThuTucId)
		throws SystemException {
		return fetchByHoSoThuTucId(hoSoThuTucId, true);
	}

	/**
	 * Returns the tthc xac nhan thanh toan ho so where hoSoThuTucId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching tthc xac nhan thanh toan ho so, or <code>null</code> if a matching tthc xac nhan thanh toan ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcXacNhanThanhToanHoSo fetchByHoSoThuTucId(long hoSoThuTucId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { hoSoThuTucId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCID,
					finderArgs, this);
		}

		if (result instanceof TthcXacNhanThanhToanHoSo) {
			TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo = (TthcXacNhanThanhToanHoSo)result;

			if ((hoSoThuTucId != tthcXacNhanThanhToanHoSo.getHoSoThuTucId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_TTHCXACNHANTHANHTOANHOSO_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				List<TthcXacNhanThanhToanHoSo> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"TthcXacNhanThanhToanHoSoPersistenceImpl.fetchByHoSoThuTucId(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo = list.get(0);

					result = tthcXacNhanThanhToanHoSo;

					cacheResult(tthcXacNhanThanhToanHoSo);

					if ((tthcXacNhanThanhToanHoSo.getHoSoThuTucId() != hoSoThuTucId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCID,
							finderArgs, tthcXacNhanThanhToanHoSo);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCID,
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
			return (TthcXacNhanThanhToanHoSo)result;
		}
	}

	/**
	 * Removes the tthc xac nhan thanh toan ho so where hoSoThuTucId = &#63; from the database.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the tthc xac nhan thanh toan ho so that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcXacNhanThanhToanHoSo removeByHoSoThuTucId(long hoSoThuTucId)
		throws NoSuchTthcXacNhanThanhToanHoSoException, SystemException {
		TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo = findByHoSoThuTucId(hoSoThuTucId);

		return remove(tthcXacNhanThanhToanHoSo);
	}

	/**
	 * Returns the number of tthc xac nhan thanh toan ho sos where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the number of matching tthc xac nhan thanh toan ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByHoSoThuTucId(long hoSoThuTucId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_HOSOTHUTUCID;

		Object[] finderArgs = new Object[] { hoSoThuTucId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TTHCXACNHANTHANHTOANHOSO_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

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

	private static final String _FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2 = "tthcXacNhanThanhToanHoSo.hoSoThuTucId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_XACNHANTHANHTOANIDHOSOTHUTUCID =
		new FinderPath(TthcXacNhanThanhToanHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcXacNhanThanhToanHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcXacNhanThanhToanHoSoImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByXacNhanThanhToanIdHoSoThuTucId",
			new String[] { Long.class.getName(), Long.class.getName() },
			TthcXacNhanThanhToanHoSoModelImpl.XACNHANTHANHTOANID_COLUMN_BITMASK |
			TthcXacNhanThanhToanHoSoModelImpl.HOSOTHUTUCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_XACNHANTHANHTOANIDHOSOTHUTUCID =
		new FinderPath(TthcXacNhanThanhToanHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcXacNhanThanhToanHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByXacNhanThanhToanIdHoSoThuTucId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the tthc xac nhan thanh toan ho so where xacNhanThanhToanId = &#63; and hoSoThuTucId = &#63; or throws a {@link vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanHoSoException} if it could not be found.
	 *
	 * @param xacNhanThanhToanId the xac nhan thanh toan ID
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the matching tthc xac nhan thanh toan ho so
	 * @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanHoSoException if a matching tthc xac nhan thanh toan ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcXacNhanThanhToanHoSo findByXacNhanThanhToanIdHoSoThuTucId(
		long xacNhanThanhToanId, long hoSoThuTucId)
		throws NoSuchTthcXacNhanThanhToanHoSoException, SystemException {
		TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo = fetchByXacNhanThanhToanIdHoSoThuTucId(xacNhanThanhToanId,
				hoSoThuTucId);

		if (tthcXacNhanThanhToanHoSo == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("xacNhanThanhToanId=");
			msg.append(xacNhanThanhToanId);

			msg.append(", hoSoThuTucId=");
			msg.append(hoSoThuTucId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchTthcXacNhanThanhToanHoSoException(msg.toString());
		}

		return tthcXacNhanThanhToanHoSo;
	}

	/**
	 * Returns the tthc xac nhan thanh toan ho so where xacNhanThanhToanId = &#63; and hoSoThuTucId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param xacNhanThanhToanId the xac nhan thanh toan ID
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the matching tthc xac nhan thanh toan ho so, or <code>null</code> if a matching tthc xac nhan thanh toan ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcXacNhanThanhToanHoSo fetchByXacNhanThanhToanIdHoSoThuTucId(
		long xacNhanThanhToanId, long hoSoThuTucId) throws SystemException {
		return fetchByXacNhanThanhToanIdHoSoThuTucId(xacNhanThanhToanId,
			hoSoThuTucId, true);
	}

	/**
	 * Returns the tthc xac nhan thanh toan ho so where xacNhanThanhToanId = &#63; and hoSoThuTucId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param xacNhanThanhToanId the xac nhan thanh toan ID
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching tthc xac nhan thanh toan ho so, or <code>null</code> if a matching tthc xac nhan thanh toan ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcXacNhanThanhToanHoSo fetchByXacNhanThanhToanIdHoSoThuTucId(
		long xacNhanThanhToanId, long hoSoThuTucId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { xacNhanThanhToanId, hoSoThuTucId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_XACNHANTHANHTOANIDHOSOTHUTUCID,
					finderArgs, this);
		}

		if (result instanceof TthcXacNhanThanhToanHoSo) {
			TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo = (TthcXacNhanThanhToanHoSo)result;

			if ((xacNhanThanhToanId != tthcXacNhanThanhToanHoSo.getXacNhanThanhToanId()) ||
					(hoSoThuTucId != tthcXacNhanThanhToanHoSo.getHoSoThuTucId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_TTHCXACNHANTHANHTOANHOSO_WHERE);

			query.append(_FINDER_COLUMN_XACNHANTHANHTOANIDHOSOTHUTUCID_XACNHANTHANHTOANID_2);

			query.append(_FINDER_COLUMN_XACNHANTHANHTOANIDHOSOTHUTUCID_HOSOTHUTUCID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(xacNhanThanhToanId);

				qPos.add(hoSoThuTucId);

				List<TthcXacNhanThanhToanHoSo> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_XACNHANTHANHTOANIDHOSOTHUTUCID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"TthcXacNhanThanhToanHoSoPersistenceImpl.fetchByXacNhanThanhToanIdHoSoThuTucId(long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo = list.get(0);

					result = tthcXacNhanThanhToanHoSo;

					cacheResult(tthcXacNhanThanhToanHoSo);

					if ((tthcXacNhanThanhToanHoSo.getXacNhanThanhToanId() != xacNhanThanhToanId) ||
							(tthcXacNhanThanhToanHoSo.getHoSoThuTucId() != hoSoThuTucId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_XACNHANTHANHTOANIDHOSOTHUTUCID,
							finderArgs, tthcXacNhanThanhToanHoSo);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_XACNHANTHANHTOANIDHOSOTHUTUCID,
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
			return (TthcXacNhanThanhToanHoSo)result;
		}
	}

	/**
	 * Removes the tthc xac nhan thanh toan ho so where xacNhanThanhToanId = &#63; and hoSoThuTucId = &#63; from the database.
	 *
	 * @param xacNhanThanhToanId the xac nhan thanh toan ID
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the tthc xac nhan thanh toan ho so that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcXacNhanThanhToanHoSo removeByXacNhanThanhToanIdHoSoThuTucId(
		long xacNhanThanhToanId, long hoSoThuTucId)
		throws NoSuchTthcXacNhanThanhToanHoSoException, SystemException {
		TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo = findByXacNhanThanhToanIdHoSoThuTucId(xacNhanThanhToanId,
				hoSoThuTucId);

		return remove(tthcXacNhanThanhToanHoSo);
	}

	/**
	 * Returns the number of tthc xac nhan thanh toan ho sos where xacNhanThanhToanId = &#63; and hoSoThuTucId = &#63;.
	 *
	 * @param xacNhanThanhToanId the xac nhan thanh toan ID
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the number of matching tthc xac nhan thanh toan ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByXacNhanThanhToanIdHoSoThuTucId(long xacNhanThanhToanId,
		long hoSoThuTucId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_XACNHANTHANHTOANIDHOSOTHUTUCID;

		Object[] finderArgs = new Object[] { xacNhanThanhToanId, hoSoThuTucId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TTHCXACNHANTHANHTOANHOSO_WHERE);

			query.append(_FINDER_COLUMN_XACNHANTHANHTOANIDHOSOTHUTUCID_XACNHANTHANHTOANID_2);

			query.append(_FINDER_COLUMN_XACNHANTHANHTOANIDHOSOTHUTUCID_HOSOTHUTUCID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(xacNhanThanhToanId);

				qPos.add(hoSoThuTucId);

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

	private static final String _FINDER_COLUMN_XACNHANTHANHTOANIDHOSOTHUTUCID_XACNHANTHANHTOANID_2 =
		"tthcXacNhanThanhToanHoSo.xacNhanThanhToanId = ? AND ";
	private static final String _FINDER_COLUMN_XACNHANTHANHTOANIDHOSOTHUTUCID_HOSOTHUTUCID_2 =
		"tthcXacNhanThanhToanHoSo.hoSoThuTucId = ?";

	public TthcXacNhanThanhToanHoSoPersistenceImpl() {
		setModelClass(TthcXacNhanThanhToanHoSo.class);
	}

	/**
	 * Caches the tthc xac nhan thanh toan ho so in the entity cache if it is enabled.
	 *
	 * @param tthcXacNhanThanhToanHoSo the tthc xac nhan thanh toan ho so
	 */
	@Override
	public void cacheResult(TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo) {
		EntityCacheUtil.putResult(TthcXacNhanThanhToanHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcXacNhanThanhToanHoSoImpl.class,
			tthcXacNhanThanhToanHoSo.getPrimaryKey(), tthcXacNhanThanhToanHoSo);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCID,
			new Object[] { tthcXacNhanThanhToanHoSo.getHoSoThuTucId() },
			tthcXacNhanThanhToanHoSo);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_XACNHANTHANHTOANIDHOSOTHUTUCID,
			new Object[] {
				tthcXacNhanThanhToanHoSo.getXacNhanThanhToanId(),
				tthcXacNhanThanhToanHoSo.getHoSoThuTucId()
			}, tthcXacNhanThanhToanHoSo);

		tthcXacNhanThanhToanHoSo.resetOriginalValues();
	}

	/**
	 * Caches the tthc xac nhan thanh toan ho sos in the entity cache if it is enabled.
	 *
	 * @param tthcXacNhanThanhToanHoSos the tthc xac nhan thanh toan ho sos
	 */
	@Override
	public void cacheResult(
		List<TthcXacNhanThanhToanHoSo> tthcXacNhanThanhToanHoSos) {
		for (TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo : tthcXacNhanThanhToanHoSos) {
			if (EntityCacheUtil.getResult(
						TthcXacNhanThanhToanHoSoModelImpl.ENTITY_CACHE_ENABLED,
						TthcXacNhanThanhToanHoSoImpl.class,
						tthcXacNhanThanhToanHoSo.getPrimaryKey()) == null) {
				cacheResult(tthcXacNhanThanhToanHoSo);
			}
			else {
				tthcXacNhanThanhToanHoSo.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tthc xac nhan thanh toan ho sos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TthcXacNhanThanhToanHoSoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TthcXacNhanThanhToanHoSoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tthc xac nhan thanh toan ho so.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo) {
		EntityCacheUtil.removeResult(TthcXacNhanThanhToanHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcXacNhanThanhToanHoSoImpl.class,
			tthcXacNhanThanhToanHoSo.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(tthcXacNhanThanhToanHoSo);
	}

	@Override
	public void clearCache(
		List<TthcXacNhanThanhToanHoSo> tthcXacNhanThanhToanHoSos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo : tthcXacNhanThanhToanHoSos) {
			EntityCacheUtil.removeResult(TthcXacNhanThanhToanHoSoModelImpl.ENTITY_CACHE_ENABLED,
				TthcXacNhanThanhToanHoSoImpl.class,
				tthcXacNhanThanhToanHoSo.getPrimaryKey());

			clearUniqueFindersCache(tthcXacNhanThanhToanHoSo);
		}
	}

	protected void cacheUniqueFindersCache(
		TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo) {
		if (tthcXacNhanThanhToanHoSo.isNew()) {
			Object[] args = new Object[] {
					tthcXacNhanThanhToanHoSo.getHoSoThuTucId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCID, args,
				tthcXacNhanThanhToanHoSo);

			args = new Object[] {
					tthcXacNhanThanhToanHoSo.getXacNhanThanhToanId(),
					tthcXacNhanThanhToanHoSo.getHoSoThuTucId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_XACNHANTHANHTOANIDHOSOTHUTUCID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_XACNHANTHANHTOANIDHOSOTHUTUCID,
				args, tthcXacNhanThanhToanHoSo);
		}
		else {
			TthcXacNhanThanhToanHoSoModelImpl tthcXacNhanThanhToanHoSoModelImpl = (TthcXacNhanThanhToanHoSoModelImpl)tthcXacNhanThanhToanHoSo;

			if ((tthcXacNhanThanhToanHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_HOSOTHUTUCID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcXacNhanThanhToanHoSo.getHoSoThuTucId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCID,
					args, tthcXacNhanThanhToanHoSo);
			}

			if ((tthcXacNhanThanhToanHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_XACNHANTHANHTOANIDHOSOTHUTUCID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcXacNhanThanhToanHoSo.getXacNhanThanhToanId(),
						tthcXacNhanThanhToanHoSo.getHoSoThuTucId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_XACNHANTHANHTOANIDHOSOTHUTUCID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_XACNHANTHANHTOANIDHOSOTHUTUCID,
					args, tthcXacNhanThanhToanHoSo);
			}
		}
	}

	protected void clearUniqueFindersCache(
		TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo) {
		TthcXacNhanThanhToanHoSoModelImpl tthcXacNhanThanhToanHoSoModelImpl = (TthcXacNhanThanhToanHoSoModelImpl)tthcXacNhanThanhToanHoSo;

		Object[] args = new Object[] { tthcXacNhanThanhToanHoSo.getHoSoThuTucId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCID, args);

		if ((tthcXacNhanThanhToanHoSoModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_HOSOTHUTUCID.getColumnBitmask()) != 0) {
			args = new Object[] {
					tthcXacNhanThanhToanHoSoModelImpl.getOriginalHoSoThuTucId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCID, args);
		}

		args = new Object[] {
				tthcXacNhanThanhToanHoSo.getXacNhanThanhToanId(),
				tthcXacNhanThanhToanHoSo.getHoSoThuTucId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_XACNHANTHANHTOANIDHOSOTHUTUCID,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_XACNHANTHANHTOANIDHOSOTHUTUCID,
			args);

		if ((tthcXacNhanThanhToanHoSoModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_XACNHANTHANHTOANIDHOSOTHUTUCID.getColumnBitmask()) != 0) {
			args = new Object[] {
					tthcXacNhanThanhToanHoSoModelImpl.getOriginalXacNhanThanhToanId(),
					tthcXacNhanThanhToanHoSoModelImpl.getOriginalHoSoThuTucId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_XACNHANTHANHTOANIDHOSOTHUTUCID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_XACNHANTHANHTOANIDHOSOTHUTUCID,
				args);
		}
	}

	/**
	 * Creates a new tthc xac nhan thanh toan ho so with the primary key. Does not add the tthc xac nhan thanh toan ho so to the database.
	 *
	 * @param id the primary key for the new tthc xac nhan thanh toan ho so
	 * @return the new tthc xac nhan thanh toan ho so
	 */
	@Override
	public TthcXacNhanThanhToanHoSo create(long id) {
		TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo = new TthcXacNhanThanhToanHoSoImpl();

		tthcXacNhanThanhToanHoSo.setNew(true);
		tthcXacNhanThanhToanHoSo.setPrimaryKey(id);

		return tthcXacNhanThanhToanHoSo;
	}

	/**
	 * Removes the tthc xac nhan thanh toan ho so with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the tthc xac nhan thanh toan ho so
	 * @return the tthc xac nhan thanh toan ho so that was removed
	 * @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanHoSoException if a tthc xac nhan thanh toan ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcXacNhanThanhToanHoSo remove(long id)
		throws NoSuchTthcXacNhanThanhToanHoSoException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the tthc xac nhan thanh toan ho so with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tthc xac nhan thanh toan ho so
	 * @return the tthc xac nhan thanh toan ho so that was removed
	 * @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanHoSoException if a tthc xac nhan thanh toan ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcXacNhanThanhToanHoSo remove(Serializable primaryKey)
		throws NoSuchTthcXacNhanThanhToanHoSoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo = (TthcXacNhanThanhToanHoSo)session.get(TthcXacNhanThanhToanHoSoImpl.class,
					primaryKey);

			if (tthcXacNhanThanhToanHoSo == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTthcXacNhanThanhToanHoSoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tthcXacNhanThanhToanHoSo);
		}
		catch (NoSuchTthcXacNhanThanhToanHoSoException nsee) {
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
	protected TthcXacNhanThanhToanHoSo removeImpl(
		TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo)
		throws SystemException {
		tthcXacNhanThanhToanHoSo = toUnwrappedModel(tthcXacNhanThanhToanHoSo);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tthcXacNhanThanhToanHoSo)) {
				tthcXacNhanThanhToanHoSo = (TthcXacNhanThanhToanHoSo)session.get(TthcXacNhanThanhToanHoSoImpl.class,
						tthcXacNhanThanhToanHoSo.getPrimaryKeyObj());
			}

			if (tthcXacNhanThanhToanHoSo != null) {
				session.delete(tthcXacNhanThanhToanHoSo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tthcXacNhanThanhToanHoSo != null) {
			clearCache(tthcXacNhanThanhToanHoSo);
		}

		return tthcXacNhanThanhToanHoSo;
	}

	@Override
	public TthcXacNhanThanhToanHoSo updateImpl(
		vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo)
		throws SystemException {
		tthcXacNhanThanhToanHoSo = toUnwrappedModel(tthcXacNhanThanhToanHoSo);

		boolean isNew = tthcXacNhanThanhToanHoSo.isNew();

		TthcXacNhanThanhToanHoSoModelImpl tthcXacNhanThanhToanHoSoModelImpl = (TthcXacNhanThanhToanHoSoModelImpl)tthcXacNhanThanhToanHoSo;

		Session session = null;

		try {
			session = openSession();

			if (tthcXacNhanThanhToanHoSo.isNew()) {
				session.save(tthcXacNhanThanhToanHoSo);

				tthcXacNhanThanhToanHoSo.setNew(false);
			}
			else {
				session.merge(tthcXacNhanThanhToanHoSo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TthcXacNhanThanhToanHoSoModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tthcXacNhanThanhToanHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_XACNHANTHANHTOANID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcXacNhanThanhToanHoSoModelImpl.getOriginalXacNhanThanhToanId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_XACNHANTHANHTOANID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_XACNHANTHANHTOANID,
					args);

				args = new Object[] {
						tthcXacNhanThanhToanHoSoModelImpl.getXacNhanThanhToanId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_XACNHANTHANHTOANID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_XACNHANTHANHTOANID,
					args);
			}
		}

		EntityCacheUtil.putResult(TthcXacNhanThanhToanHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcXacNhanThanhToanHoSoImpl.class,
			tthcXacNhanThanhToanHoSo.getPrimaryKey(), tthcXacNhanThanhToanHoSo);

		clearUniqueFindersCache(tthcXacNhanThanhToanHoSo);
		cacheUniqueFindersCache(tthcXacNhanThanhToanHoSo);

		return tthcXacNhanThanhToanHoSo;
	}

	protected TthcXacNhanThanhToanHoSo toUnwrappedModel(
		TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo) {
		if (tthcXacNhanThanhToanHoSo instanceof TthcXacNhanThanhToanHoSoImpl) {
			return tthcXacNhanThanhToanHoSo;
		}

		TthcXacNhanThanhToanHoSoImpl tthcXacNhanThanhToanHoSoImpl = new TthcXacNhanThanhToanHoSoImpl();

		tthcXacNhanThanhToanHoSoImpl.setNew(tthcXacNhanThanhToanHoSo.isNew());
		tthcXacNhanThanhToanHoSoImpl.setPrimaryKey(tthcXacNhanThanhToanHoSo.getPrimaryKey());

		tthcXacNhanThanhToanHoSoImpl.setId(tthcXacNhanThanhToanHoSo.getId());
		tthcXacNhanThanhToanHoSoImpl.setXacNhanThanhToanId(tthcXacNhanThanhToanHoSo.getXacNhanThanhToanId());
		tthcXacNhanThanhToanHoSoImpl.setHoSoThuTucId(tthcXacNhanThanhToanHoSo.getHoSoThuTucId());
		tthcXacNhanThanhToanHoSoImpl.setSoTien(tthcXacNhanThanhToanHoSo.getSoTien());
		tthcXacNhanThanhToanHoSoImpl.setPhieuXuLyId(tthcXacNhanThanhToanHoSo.getPhieuXuLyId());

		return tthcXacNhanThanhToanHoSoImpl;
	}

	/**
	 * Returns the tthc xac nhan thanh toan ho so with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc xac nhan thanh toan ho so
	 * @return the tthc xac nhan thanh toan ho so
	 * @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanHoSoException if a tthc xac nhan thanh toan ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcXacNhanThanhToanHoSo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTthcXacNhanThanhToanHoSoException, SystemException {
		TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo = fetchByPrimaryKey(primaryKey);

		if (tthcXacNhanThanhToanHoSo == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTthcXacNhanThanhToanHoSoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tthcXacNhanThanhToanHoSo;
	}

	/**
	 * Returns the tthc xac nhan thanh toan ho so with the primary key or throws a {@link vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanHoSoException} if it could not be found.
	 *
	 * @param id the primary key of the tthc xac nhan thanh toan ho so
	 * @return the tthc xac nhan thanh toan ho so
	 * @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanHoSoException if a tthc xac nhan thanh toan ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcXacNhanThanhToanHoSo findByPrimaryKey(long id)
		throws NoSuchTthcXacNhanThanhToanHoSoException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the tthc xac nhan thanh toan ho so with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc xac nhan thanh toan ho so
	 * @return the tthc xac nhan thanh toan ho so, or <code>null</code> if a tthc xac nhan thanh toan ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcXacNhanThanhToanHoSo fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo = (TthcXacNhanThanhToanHoSo)EntityCacheUtil.getResult(TthcXacNhanThanhToanHoSoModelImpl.ENTITY_CACHE_ENABLED,
				TthcXacNhanThanhToanHoSoImpl.class, primaryKey);

		if (tthcXacNhanThanhToanHoSo == _nullTthcXacNhanThanhToanHoSo) {
			return null;
		}

		if (tthcXacNhanThanhToanHoSo == null) {
			Session session = null;

			try {
				session = openSession();

				tthcXacNhanThanhToanHoSo = (TthcXacNhanThanhToanHoSo)session.get(TthcXacNhanThanhToanHoSoImpl.class,
						primaryKey);

				if (tthcXacNhanThanhToanHoSo != null) {
					cacheResult(tthcXacNhanThanhToanHoSo);
				}
				else {
					EntityCacheUtil.putResult(TthcXacNhanThanhToanHoSoModelImpl.ENTITY_CACHE_ENABLED,
						TthcXacNhanThanhToanHoSoImpl.class, primaryKey,
						_nullTthcXacNhanThanhToanHoSo);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TthcXacNhanThanhToanHoSoModelImpl.ENTITY_CACHE_ENABLED,
					TthcXacNhanThanhToanHoSoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tthcXacNhanThanhToanHoSo;
	}

	/**
	 * Returns the tthc xac nhan thanh toan ho so with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the tthc xac nhan thanh toan ho so
	 * @return the tthc xac nhan thanh toan ho so, or <code>null</code> if a tthc xac nhan thanh toan ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcXacNhanThanhToanHoSo fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the tthc xac nhan thanh toan ho sos.
	 *
	 * @return the tthc xac nhan thanh toan ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcXacNhanThanhToanHoSo> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc xac nhan thanh toan ho sos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcXacNhanThanhToanHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc xac nhan thanh toan ho sos
	 * @param end the upper bound of the range of tthc xac nhan thanh toan ho sos (not inclusive)
	 * @return the range of tthc xac nhan thanh toan ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcXacNhanThanhToanHoSo> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc xac nhan thanh toan ho sos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcXacNhanThanhToanHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc xac nhan thanh toan ho sos
	 * @param end the upper bound of the range of tthc xac nhan thanh toan ho sos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tthc xac nhan thanh toan ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcXacNhanThanhToanHoSo> findAll(int start, int end,
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

		List<TthcXacNhanThanhToanHoSo> list = (List<TthcXacNhanThanhToanHoSo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TTHCXACNHANTHANHTOANHOSO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TTHCXACNHANTHANHTOANHOSO;

				if (pagination) {
					sql = sql.concat(TthcXacNhanThanhToanHoSoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TthcXacNhanThanhToanHoSo>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcXacNhanThanhToanHoSo>(list);
				}
				else {
					list = (List<TthcXacNhanThanhToanHoSo>)QueryUtil.list(q,
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
	 * Removes all the tthc xac nhan thanh toan ho sos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo : findAll()) {
			remove(tthcXacNhanThanhToanHoSo);
		}
	}

	/**
	 * Returns the number of tthc xac nhan thanh toan ho sos.
	 *
	 * @return the number of tthc xac nhan thanh toan ho sos
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

				Query q = session.createQuery(_SQL_COUNT_TTHCXACNHANTHANHTOANHOSO);

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
	 * Initializes the tthc xac nhan thanh toan ho so persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TthcXacNhanThanhToanHoSo>> listenersList = new ArrayList<ModelListener<TthcXacNhanThanhToanHoSo>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TthcXacNhanThanhToanHoSo>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TthcXacNhanThanhToanHoSoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TTHCXACNHANTHANHTOANHOSO = "SELECT tthcXacNhanThanhToanHoSo FROM TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo";
	private static final String _SQL_SELECT_TTHCXACNHANTHANHTOANHOSO_WHERE = "SELECT tthcXacNhanThanhToanHoSo FROM TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo WHERE ";
	private static final String _SQL_COUNT_TTHCXACNHANTHANHTOANHOSO = "SELECT COUNT(tthcXacNhanThanhToanHoSo) FROM TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo";
	private static final String _SQL_COUNT_TTHCXACNHANTHANHTOANHOSO_WHERE = "SELECT COUNT(tthcXacNhanThanhToanHoSo) FROM TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tthcXacNhanThanhToanHoSo.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TthcXacNhanThanhToanHoSo exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TthcXacNhanThanhToanHoSo exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TthcXacNhanThanhToanHoSoPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"xacNhanThanhToanId", "hoSoThuTucId", "soTien", "phieuXuLyId"
			});
	private static TthcXacNhanThanhToanHoSo _nullTthcXacNhanThanhToanHoSo = new TthcXacNhanThanhToanHoSoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TthcXacNhanThanhToanHoSo> toCacheModel() {
				return _nullTthcXacNhanThanhToanHoSoCacheModel;
			}
		};

	private static CacheModel<TthcXacNhanThanhToanHoSo> _nullTthcXacNhanThanhToanHoSoCacheModel =
		new CacheModel<TthcXacNhanThanhToanHoSo>() {
			@Override
			public TthcXacNhanThanhToanHoSo toEntityModel() {
				return _nullTthcXacNhanThanhToanHoSo;
			}
		};
}