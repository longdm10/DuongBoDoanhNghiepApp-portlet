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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException;
import vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan;
import vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcXacNhanThanhToanImpl;
import vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcXacNhanThanhToanModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the tthc xac nhan thanh toan service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcXacNhanThanhToanPersistence
 * @see TthcXacNhanThanhToanUtil
 * @generated
 */
public class TthcXacNhanThanhToanPersistenceImpl extends BasePersistenceImpl<TthcXacNhanThanhToan>
	implements TthcXacNhanThanhToanPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TthcXacNhanThanhToanUtil} to access the tthc xac nhan thanh toan persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TthcXacNhanThanhToanImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TthcXacNhanThanhToanModelImpl.ENTITY_CACHE_ENABLED,
			TthcXacNhanThanhToanModelImpl.FINDER_CACHE_ENABLED,
			TthcXacNhanThanhToanImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TthcXacNhanThanhToanModelImpl.ENTITY_CACHE_ENABLED,
			TthcXacNhanThanhToanModelImpl.FINDER_CACHE_ENABLED,
			TthcXacNhanThanhToanImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TthcXacNhanThanhToanModelImpl.ENTITY_CACHE_ENABLED,
			TthcXacNhanThanhToanModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TOCHUCQUANLY =
		new FinderPath(TthcXacNhanThanhToanModelImpl.ENTITY_CACHE_ENABLED,
			TthcXacNhanThanhToanModelImpl.FINDER_CACHE_ENABLED,
			TthcXacNhanThanhToanImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByToChucQuanLy",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOCHUCQUANLY =
		new FinderPath(TthcXacNhanThanhToanModelImpl.ENTITY_CACHE_ENABLED,
			TthcXacNhanThanhToanModelImpl.FINDER_CACHE_ENABLED,
			TthcXacNhanThanhToanImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByToChucQuanLy",
			new String[] { Long.class.getName() },
			TthcXacNhanThanhToanModelImpl.TOCHUCQUANLY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TOCHUCQUANLY = new FinderPath(TthcXacNhanThanhToanModelImpl.ENTITY_CACHE_ENABLED,
			TthcXacNhanThanhToanModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByToChucQuanLy",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the tthc xac nhan thanh toans where toChucQuanLy = &#63;.
	 *
	 * @param toChucQuanLy the to chuc quan ly
	 * @return the matching tthc xac nhan thanh toans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcXacNhanThanhToan> findByToChucQuanLy(long toChucQuanLy)
		throws SystemException {
		return findByToChucQuanLy(toChucQuanLy, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc xac nhan thanh toans where toChucQuanLy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcXacNhanThanhToanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param toChucQuanLy the to chuc quan ly
	 * @param start the lower bound of the range of tthc xac nhan thanh toans
	 * @param end the upper bound of the range of tthc xac nhan thanh toans (not inclusive)
	 * @return the range of matching tthc xac nhan thanh toans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcXacNhanThanhToan> findByToChucQuanLy(long toChucQuanLy,
		int start, int end) throws SystemException {
		return findByToChucQuanLy(toChucQuanLy, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc xac nhan thanh toans where toChucQuanLy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcXacNhanThanhToanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param toChucQuanLy the to chuc quan ly
	 * @param start the lower bound of the range of tthc xac nhan thanh toans
	 * @param end the upper bound of the range of tthc xac nhan thanh toans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tthc xac nhan thanh toans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcXacNhanThanhToan> findByToChucQuanLy(long toChucQuanLy,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOCHUCQUANLY;
			finderArgs = new Object[] { toChucQuanLy };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TOCHUCQUANLY;
			finderArgs = new Object[] {
					toChucQuanLy,
					
					start, end, orderByComparator
				};
		}

		List<TthcXacNhanThanhToan> list = (List<TthcXacNhanThanhToan>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TthcXacNhanThanhToan tthcXacNhanThanhToan : list) {
				if ((toChucQuanLy != tthcXacNhanThanhToan.getToChucQuanLy())) {
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

			query.append(_SQL_SELECT_TTHCXACNHANTHANHTOAN_WHERE);

			query.append(_FINDER_COLUMN_TOCHUCQUANLY_TOCHUCQUANLY_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TthcXacNhanThanhToanModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(toChucQuanLy);

				if (!pagination) {
					list = (List<TthcXacNhanThanhToan>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcXacNhanThanhToan>(list);
				}
				else {
					list = (List<TthcXacNhanThanhToan>)QueryUtil.list(q,
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
	 * Returns the first tthc xac nhan thanh toan in the ordered set where toChucQuanLy = &#63;.
	 *
	 * @param toChucQuanLy the to chuc quan ly
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc xac nhan thanh toan
	 * @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException if a matching tthc xac nhan thanh toan could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcXacNhanThanhToan findByToChucQuanLy_First(long toChucQuanLy,
		OrderByComparator orderByComparator)
		throws NoSuchTthcXacNhanThanhToanException, SystemException {
		TthcXacNhanThanhToan tthcXacNhanThanhToan = fetchByToChucQuanLy_First(toChucQuanLy,
				orderByComparator);

		if (tthcXacNhanThanhToan != null) {
			return tthcXacNhanThanhToan;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("toChucQuanLy=");
		msg.append(toChucQuanLy);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcXacNhanThanhToanException(msg.toString());
	}

	/**
	 * Returns the first tthc xac nhan thanh toan in the ordered set where toChucQuanLy = &#63;.
	 *
	 * @param toChucQuanLy the to chuc quan ly
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc xac nhan thanh toan, or <code>null</code> if a matching tthc xac nhan thanh toan could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcXacNhanThanhToan fetchByToChucQuanLy_First(long toChucQuanLy,
		OrderByComparator orderByComparator) throws SystemException {
		List<TthcXacNhanThanhToan> list = findByToChucQuanLy(toChucQuanLy, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tthc xac nhan thanh toan in the ordered set where toChucQuanLy = &#63;.
	 *
	 * @param toChucQuanLy the to chuc quan ly
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc xac nhan thanh toan
	 * @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException if a matching tthc xac nhan thanh toan could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcXacNhanThanhToan findByToChucQuanLy_Last(long toChucQuanLy,
		OrderByComparator orderByComparator)
		throws NoSuchTthcXacNhanThanhToanException, SystemException {
		TthcXacNhanThanhToan tthcXacNhanThanhToan = fetchByToChucQuanLy_Last(toChucQuanLy,
				orderByComparator);

		if (tthcXacNhanThanhToan != null) {
			return tthcXacNhanThanhToan;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("toChucQuanLy=");
		msg.append(toChucQuanLy);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcXacNhanThanhToanException(msg.toString());
	}

	/**
	 * Returns the last tthc xac nhan thanh toan in the ordered set where toChucQuanLy = &#63;.
	 *
	 * @param toChucQuanLy the to chuc quan ly
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc xac nhan thanh toan, or <code>null</code> if a matching tthc xac nhan thanh toan could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcXacNhanThanhToan fetchByToChucQuanLy_Last(long toChucQuanLy,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByToChucQuanLy(toChucQuanLy);

		if (count == 0) {
			return null;
		}

		List<TthcXacNhanThanhToan> list = findByToChucQuanLy(toChucQuanLy,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tthc xac nhan thanh toans before and after the current tthc xac nhan thanh toan in the ordered set where toChucQuanLy = &#63;.
	 *
	 * @param id the primary key of the current tthc xac nhan thanh toan
	 * @param toChucQuanLy the to chuc quan ly
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tthc xac nhan thanh toan
	 * @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException if a tthc xac nhan thanh toan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcXacNhanThanhToan[] findByToChucQuanLy_PrevAndNext(long id,
		long toChucQuanLy, OrderByComparator orderByComparator)
		throws NoSuchTthcXacNhanThanhToanException, SystemException {
		TthcXacNhanThanhToan tthcXacNhanThanhToan = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TthcXacNhanThanhToan[] array = new TthcXacNhanThanhToanImpl[3];

			array[0] = getByToChucQuanLy_PrevAndNext(session,
					tthcXacNhanThanhToan, toChucQuanLy, orderByComparator, true);

			array[1] = tthcXacNhanThanhToan;

			array[2] = getByToChucQuanLy_PrevAndNext(session,
					tthcXacNhanThanhToan, toChucQuanLy, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TthcXacNhanThanhToan getByToChucQuanLy_PrevAndNext(
		Session session, TthcXacNhanThanhToan tthcXacNhanThanhToan,
		long toChucQuanLy, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TTHCXACNHANTHANHTOAN_WHERE);

		query.append(_FINDER_COLUMN_TOCHUCQUANLY_TOCHUCQUANLY_2);

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
			query.append(TthcXacNhanThanhToanModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(toChucQuanLy);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tthcXacNhanThanhToan);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TthcXacNhanThanhToan> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tthc xac nhan thanh toans where toChucQuanLy = &#63; from the database.
	 *
	 * @param toChucQuanLy the to chuc quan ly
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByToChucQuanLy(long toChucQuanLy)
		throws SystemException {
		for (TthcXacNhanThanhToan tthcXacNhanThanhToan : findByToChucQuanLy(
				toChucQuanLy, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tthcXacNhanThanhToan);
		}
	}

	/**
	 * Returns the number of tthc xac nhan thanh toans where toChucQuanLy = &#63;.
	 *
	 * @param toChucQuanLy the to chuc quan ly
	 * @return the number of matching tthc xac nhan thanh toans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByToChucQuanLy(long toChucQuanLy) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TOCHUCQUANLY;

		Object[] finderArgs = new Object[] { toChucQuanLy };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TTHCXACNHANTHANHTOAN_WHERE);

			query.append(_FINDER_COLUMN_TOCHUCQUANLY_TOCHUCQUANLY_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(toChucQuanLy);

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

	private static final String _FINDER_COLUMN_TOCHUCQUANLY_TOCHUCQUANLY_2 = "tthcXacNhanThanhToan.toChucQuanLy = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_MATUSINH = new FinderPath(TthcXacNhanThanhToanModelImpl.ENTITY_CACHE_ENABLED,
			TthcXacNhanThanhToanModelImpl.FINDER_CACHE_ENABLED,
			TthcXacNhanThanhToanImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByMaTuSinh", new String[] { String.class.getName() },
			TthcXacNhanThanhToanModelImpl.MATUSINH_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MATUSINH = new FinderPath(TthcXacNhanThanhToanModelImpl.ENTITY_CACHE_ENABLED,
			TthcXacNhanThanhToanModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMaTuSinh",
			new String[] { String.class.getName() });

	/**
	 * Returns the tthc xac nhan thanh toan where maTuSinh = &#63; or throws a {@link vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException} if it could not be found.
	 *
	 * @param maTuSinh the ma tu sinh
	 * @return the matching tthc xac nhan thanh toan
	 * @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException if a matching tthc xac nhan thanh toan could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcXacNhanThanhToan findByMaTuSinh(String maTuSinh)
		throws NoSuchTthcXacNhanThanhToanException, SystemException {
		TthcXacNhanThanhToan tthcXacNhanThanhToan = fetchByMaTuSinh(maTuSinh);

		if (tthcXacNhanThanhToan == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("maTuSinh=");
			msg.append(maTuSinh);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchTthcXacNhanThanhToanException(msg.toString());
		}

		return tthcXacNhanThanhToan;
	}

	/**
	 * Returns the tthc xac nhan thanh toan where maTuSinh = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param maTuSinh the ma tu sinh
	 * @return the matching tthc xac nhan thanh toan, or <code>null</code> if a matching tthc xac nhan thanh toan could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcXacNhanThanhToan fetchByMaTuSinh(String maTuSinh)
		throws SystemException {
		return fetchByMaTuSinh(maTuSinh, true);
	}

	/**
	 * Returns the tthc xac nhan thanh toan where maTuSinh = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param maTuSinh the ma tu sinh
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching tthc xac nhan thanh toan, or <code>null</code> if a matching tthc xac nhan thanh toan could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcXacNhanThanhToan fetchByMaTuSinh(String maTuSinh,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { maTuSinh };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_MATUSINH,
					finderArgs, this);
		}

		if (result instanceof TthcXacNhanThanhToan) {
			TthcXacNhanThanhToan tthcXacNhanThanhToan = (TthcXacNhanThanhToan)result;

			if (!Validator.equals(maTuSinh, tthcXacNhanThanhToan.getMaTuSinh())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_TTHCXACNHANTHANHTOAN_WHERE);

			boolean bindMaTuSinh = false;

			if (maTuSinh == null) {
				query.append(_FINDER_COLUMN_MATUSINH_MATUSINH_1);
			}
			else if (maTuSinh.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MATUSINH_MATUSINH_3);
			}
			else {
				bindMaTuSinh = true;

				query.append(_FINDER_COLUMN_MATUSINH_MATUSINH_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaTuSinh) {
					qPos.add(maTuSinh);
				}

				List<TthcXacNhanThanhToan> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATUSINH,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"TthcXacNhanThanhToanPersistenceImpl.fetchByMaTuSinh(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					TthcXacNhanThanhToan tthcXacNhanThanhToan = list.get(0);

					result = tthcXacNhanThanhToan;

					cacheResult(tthcXacNhanThanhToan);

					if ((tthcXacNhanThanhToan.getMaTuSinh() == null) ||
							!tthcXacNhanThanhToan.getMaTuSinh().equals(maTuSinh)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATUSINH,
							finderArgs, tthcXacNhanThanhToan);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MATUSINH,
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
			return (TthcXacNhanThanhToan)result;
		}
	}

	/**
	 * Removes the tthc xac nhan thanh toan where maTuSinh = &#63; from the database.
	 *
	 * @param maTuSinh the ma tu sinh
	 * @return the tthc xac nhan thanh toan that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcXacNhanThanhToan removeByMaTuSinh(String maTuSinh)
		throws NoSuchTthcXacNhanThanhToanException, SystemException {
		TthcXacNhanThanhToan tthcXacNhanThanhToan = findByMaTuSinh(maTuSinh);

		return remove(tthcXacNhanThanhToan);
	}

	/**
	 * Returns the number of tthc xac nhan thanh toans where maTuSinh = &#63;.
	 *
	 * @param maTuSinh the ma tu sinh
	 * @return the number of matching tthc xac nhan thanh toans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByMaTuSinh(String maTuSinh) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MATUSINH;

		Object[] finderArgs = new Object[] { maTuSinh };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TTHCXACNHANTHANHTOAN_WHERE);

			boolean bindMaTuSinh = false;

			if (maTuSinh == null) {
				query.append(_FINDER_COLUMN_MATUSINH_MATUSINH_1);
			}
			else if (maTuSinh.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MATUSINH_MATUSINH_3);
			}
			else {
				bindMaTuSinh = true;

				query.append(_FINDER_COLUMN_MATUSINH_MATUSINH_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaTuSinh) {
					qPos.add(maTuSinh);
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

	private static final String _FINDER_COLUMN_MATUSINH_MATUSINH_1 = "tthcXacNhanThanhToan.maTuSinh IS NULL";
	private static final String _FINDER_COLUMN_MATUSINH_MATUSINH_2 = "tthcXacNhanThanhToan.maTuSinh = ?";
	private static final String _FINDER_COLUMN_MATUSINH_MATUSINH_3 = "(tthcXacNhanThanhToan.maTuSinh IS NULL OR tthcXacNhanThanhToan.maTuSinh = '')";

	public TthcXacNhanThanhToanPersistenceImpl() {
		setModelClass(TthcXacNhanThanhToan.class);
	}

	/**
	 * Caches the tthc xac nhan thanh toan in the entity cache if it is enabled.
	 *
	 * @param tthcXacNhanThanhToan the tthc xac nhan thanh toan
	 */
	@Override
	public void cacheResult(TthcXacNhanThanhToan tthcXacNhanThanhToan) {
		EntityCacheUtil.putResult(TthcXacNhanThanhToanModelImpl.ENTITY_CACHE_ENABLED,
			TthcXacNhanThanhToanImpl.class,
			tthcXacNhanThanhToan.getPrimaryKey(), tthcXacNhanThanhToan);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATUSINH,
			new Object[] { tthcXacNhanThanhToan.getMaTuSinh() },
			tthcXacNhanThanhToan);

		tthcXacNhanThanhToan.resetOriginalValues();
	}

	/**
	 * Caches the tthc xac nhan thanh toans in the entity cache if it is enabled.
	 *
	 * @param tthcXacNhanThanhToans the tthc xac nhan thanh toans
	 */
	@Override
	public void cacheResult(List<TthcXacNhanThanhToan> tthcXacNhanThanhToans) {
		for (TthcXacNhanThanhToan tthcXacNhanThanhToan : tthcXacNhanThanhToans) {
			if (EntityCacheUtil.getResult(
						TthcXacNhanThanhToanModelImpl.ENTITY_CACHE_ENABLED,
						TthcXacNhanThanhToanImpl.class,
						tthcXacNhanThanhToan.getPrimaryKey()) == null) {
				cacheResult(tthcXacNhanThanhToan);
			}
			else {
				tthcXacNhanThanhToan.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tthc xac nhan thanh toans.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TthcXacNhanThanhToanImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TthcXacNhanThanhToanImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tthc xac nhan thanh toan.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TthcXacNhanThanhToan tthcXacNhanThanhToan) {
		EntityCacheUtil.removeResult(TthcXacNhanThanhToanModelImpl.ENTITY_CACHE_ENABLED,
			TthcXacNhanThanhToanImpl.class, tthcXacNhanThanhToan.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(tthcXacNhanThanhToan);
	}

	@Override
	public void clearCache(List<TthcXacNhanThanhToan> tthcXacNhanThanhToans) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TthcXacNhanThanhToan tthcXacNhanThanhToan : tthcXacNhanThanhToans) {
			EntityCacheUtil.removeResult(TthcXacNhanThanhToanModelImpl.ENTITY_CACHE_ENABLED,
				TthcXacNhanThanhToanImpl.class,
				tthcXacNhanThanhToan.getPrimaryKey());

			clearUniqueFindersCache(tthcXacNhanThanhToan);
		}
	}

	protected void cacheUniqueFindersCache(
		TthcXacNhanThanhToan tthcXacNhanThanhToan) {
		if (tthcXacNhanThanhToan.isNew()) {
			Object[] args = new Object[] { tthcXacNhanThanhToan.getMaTuSinh() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MATUSINH, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATUSINH, args,
				tthcXacNhanThanhToan);
		}
		else {
			TthcXacNhanThanhToanModelImpl tthcXacNhanThanhToanModelImpl = (TthcXacNhanThanhToanModelImpl)tthcXacNhanThanhToan;

			if ((tthcXacNhanThanhToanModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_MATUSINH.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { tthcXacNhanThanhToan.getMaTuSinh() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MATUSINH, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATUSINH, args,
					tthcXacNhanThanhToan);
			}
		}
	}

	protected void clearUniqueFindersCache(
		TthcXacNhanThanhToan tthcXacNhanThanhToan) {
		TthcXacNhanThanhToanModelImpl tthcXacNhanThanhToanModelImpl = (TthcXacNhanThanhToanModelImpl)tthcXacNhanThanhToan;

		Object[] args = new Object[] { tthcXacNhanThanhToan.getMaTuSinh() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MATUSINH, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MATUSINH, args);

		if ((tthcXacNhanThanhToanModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_MATUSINH.getColumnBitmask()) != 0) {
			args = new Object[] {
					tthcXacNhanThanhToanModelImpl.getOriginalMaTuSinh()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MATUSINH, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MATUSINH, args);
		}
	}

	/**
	 * Creates a new tthc xac nhan thanh toan with the primary key. Does not add the tthc xac nhan thanh toan to the database.
	 *
	 * @param id the primary key for the new tthc xac nhan thanh toan
	 * @return the new tthc xac nhan thanh toan
	 */
	@Override
	public TthcXacNhanThanhToan create(long id) {
		TthcXacNhanThanhToan tthcXacNhanThanhToan = new TthcXacNhanThanhToanImpl();

		tthcXacNhanThanhToan.setNew(true);
		tthcXacNhanThanhToan.setPrimaryKey(id);

		return tthcXacNhanThanhToan;
	}

	/**
	 * Removes the tthc xac nhan thanh toan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the tthc xac nhan thanh toan
	 * @return the tthc xac nhan thanh toan that was removed
	 * @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException if a tthc xac nhan thanh toan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcXacNhanThanhToan remove(long id)
		throws NoSuchTthcXacNhanThanhToanException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the tthc xac nhan thanh toan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tthc xac nhan thanh toan
	 * @return the tthc xac nhan thanh toan that was removed
	 * @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException if a tthc xac nhan thanh toan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcXacNhanThanhToan remove(Serializable primaryKey)
		throws NoSuchTthcXacNhanThanhToanException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TthcXacNhanThanhToan tthcXacNhanThanhToan = (TthcXacNhanThanhToan)session.get(TthcXacNhanThanhToanImpl.class,
					primaryKey);

			if (tthcXacNhanThanhToan == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTthcXacNhanThanhToanException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tthcXacNhanThanhToan);
		}
		catch (NoSuchTthcXacNhanThanhToanException nsee) {
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
	protected TthcXacNhanThanhToan removeImpl(
		TthcXacNhanThanhToan tthcXacNhanThanhToan) throws SystemException {
		tthcXacNhanThanhToan = toUnwrappedModel(tthcXacNhanThanhToan);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tthcXacNhanThanhToan)) {
				tthcXacNhanThanhToan = (TthcXacNhanThanhToan)session.get(TthcXacNhanThanhToanImpl.class,
						tthcXacNhanThanhToan.getPrimaryKeyObj());
			}

			if (tthcXacNhanThanhToan != null) {
				session.delete(tthcXacNhanThanhToan);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tthcXacNhanThanhToan != null) {
			clearCache(tthcXacNhanThanhToan);
		}

		return tthcXacNhanThanhToan;
	}

	@Override
	public TthcXacNhanThanhToan updateImpl(
		vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan tthcXacNhanThanhToan)
		throws SystemException {
		tthcXacNhanThanhToan = toUnwrappedModel(tthcXacNhanThanhToan);

		boolean isNew = tthcXacNhanThanhToan.isNew();

		TthcXacNhanThanhToanModelImpl tthcXacNhanThanhToanModelImpl = (TthcXacNhanThanhToanModelImpl)tthcXacNhanThanhToan;

		Session session = null;

		try {
			session = openSession();

			if (tthcXacNhanThanhToan.isNew()) {
				session.save(tthcXacNhanThanhToan);

				tthcXacNhanThanhToan.setNew(false);
			}
			else {
				session.merge(tthcXacNhanThanhToan);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TthcXacNhanThanhToanModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tthcXacNhanThanhToanModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOCHUCQUANLY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcXacNhanThanhToanModelImpl.getOriginalToChucQuanLy()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TOCHUCQUANLY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOCHUCQUANLY,
					args);

				args = new Object[] {
						tthcXacNhanThanhToanModelImpl.getToChucQuanLy()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TOCHUCQUANLY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOCHUCQUANLY,
					args);
			}
		}

		EntityCacheUtil.putResult(TthcXacNhanThanhToanModelImpl.ENTITY_CACHE_ENABLED,
			TthcXacNhanThanhToanImpl.class,
			tthcXacNhanThanhToan.getPrimaryKey(), tthcXacNhanThanhToan);

		clearUniqueFindersCache(tthcXacNhanThanhToan);
		cacheUniqueFindersCache(tthcXacNhanThanhToan);

		return tthcXacNhanThanhToan;
	}

	protected TthcXacNhanThanhToan toUnwrappedModel(
		TthcXacNhanThanhToan tthcXacNhanThanhToan) {
		if (tthcXacNhanThanhToan instanceof TthcXacNhanThanhToanImpl) {
			return tthcXacNhanThanhToan;
		}

		TthcXacNhanThanhToanImpl tthcXacNhanThanhToanImpl = new TthcXacNhanThanhToanImpl();

		tthcXacNhanThanhToanImpl.setNew(tthcXacNhanThanhToan.isNew());
		tthcXacNhanThanhToanImpl.setPrimaryKey(tthcXacNhanThanhToan.getPrimaryKey());

		tthcXacNhanThanhToanImpl.setId(tthcXacNhanThanhToan.getId());
		tthcXacNhanThanhToanImpl.setMaTuSinh(tthcXacNhanThanhToan.getMaTuSinh());
		tthcXacNhanThanhToanImpl.setSoTien(tthcXacNhanThanhToan.getSoTien());
		tthcXacNhanThanhToanImpl.setHinhThucThanhToan(tthcXacNhanThanhToan.getHinhThucThanhToan());
		tthcXacNhanThanhToanImpl.setThongTinXacNhan(tthcXacNhanThanhToan.getThongTinXacNhan());
		tthcXacNhanThanhToanImpl.setTaiLieuDinhKem(tthcXacNhanThanhToan.getTaiLieuDinhKem());
		tthcXacNhanThanhToanImpl.setNgayTao(tthcXacNhanThanhToan.getNgayTao());
		tthcXacNhanThanhToanImpl.setNguoiTao(tthcXacNhanThanhToan.getNguoiTao());
		tthcXacNhanThanhToanImpl.setNgayXacNhan(tthcXacNhanThanhToan.getNgayXacNhan());
		tthcXacNhanThanhToanImpl.setNguoiXacNhan(tthcXacNhanThanhToan.getNguoiXacNhan());
		tthcXacNhanThanhToanImpl.setToChucQuanLy(tthcXacNhanThanhToan.getToChucQuanLy());
		tthcXacNhanThanhToanImpl.setTrangThaiXacNhan(tthcXacNhanThanhToan.getTrangThaiXacNhan());
		tthcXacNhanThanhToanImpl.setYKienXuLy(tthcXacNhanThanhToan.getYKienXuLy());
		tthcXacNhanThanhToanImpl.setLoaiPhi(tthcXacNhanThanhToan.getLoaiPhi());
		tthcXacNhanThanhToanImpl.setTenDoanhNghiep(tthcXacNhanThanhToan.getTenDoanhNghiep());
		tthcXacNhanThanhToanImpl.setGhiChu(tthcXacNhanThanhToan.getGhiChu());

		return tthcXacNhanThanhToanImpl;
	}

	/**
	 * Returns the tthc xac nhan thanh toan with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc xac nhan thanh toan
	 * @return the tthc xac nhan thanh toan
	 * @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException if a tthc xac nhan thanh toan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcXacNhanThanhToan findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTthcXacNhanThanhToanException, SystemException {
		TthcXacNhanThanhToan tthcXacNhanThanhToan = fetchByPrimaryKey(primaryKey);

		if (tthcXacNhanThanhToan == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTthcXacNhanThanhToanException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tthcXacNhanThanhToan;
	}

	/**
	 * Returns the tthc xac nhan thanh toan with the primary key or throws a {@link vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException} if it could not be found.
	 *
	 * @param id the primary key of the tthc xac nhan thanh toan
	 * @return the tthc xac nhan thanh toan
	 * @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException if a tthc xac nhan thanh toan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcXacNhanThanhToan findByPrimaryKey(long id)
		throws NoSuchTthcXacNhanThanhToanException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the tthc xac nhan thanh toan with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc xac nhan thanh toan
	 * @return the tthc xac nhan thanh toan, or <code>null</code> if a tthc xac nhan thanh toan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcXacNhanThanhToan fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TthcXacNhanThanhToan tthcXacNhanThanhToan = (TthcXacNhanThanhToan)EntityCacheUtil.getResult(TthcXacNhanThanhToanModelImpl.ENTITY_CACHE_ENABLED,
				TthcXacNhanThanhToanImpl.class, primaryKey);

		if (tthcXacNhanThanhToan == _nullTthcXacNhanThanhToan) {
			return null;
		}

		if (tthcXacNhanThanhToan == null) {
			Session session = null;

			try {
				session = openSession();

				tthcXacNhanThanhToan = (TthcXacNhanThanhToan)session.get(TthcXacNhanThanhToanImpl.class,
						primaryKey);

				if (tthcXacNhanThanhToan != null) {
					cacheResult(tthcXacNhanThanhToan);
				}
				else {
					EntityCacheUtil.putResult(TthcXacNhanThanhToanModelImpl.ENTITY_CACHE_ENABLED,
						TthcXacNhanThanhToanImpl.class, primaryKey,
						_nullTthcXacNhanThanhToan);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TthcXacNhanThanhToanModelImpl.ENTITY_CACHE_ENABLED,
					TthcXacNhanThanhToanImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tthcXacNhanThanhToan;
	}

	/**
	 * Returns the tthc xac nhan thanh toan with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the tthc xac nhan thanh toan
	 * @return the tthc xac nhan thanh toan, or <code>null</code> if a tthc xac nhan thanh toan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcXacNhanThanhToan fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the tthc xac nhan thanh toans.
	 *
	 * @return the tthc xac nhan thanh toans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcXacNhanThanhToan> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc xac nhan thanh toans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcXacNhanThanhToanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc xac nhan thanh toans
	 * @param end the upper bound of the range of tthc xac nhan thanh toans (not inclusive)
	 * @return the range of tthc xac nhan thanh toans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcXacNhanThanhToan> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc xac nhan thanh toans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcXacNhanThanhToanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc xac nhan thanh toans
	 * @param end the upper bound of the range of tthc xac nhan thanh toans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tthc xac nhan thanh toans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcXacNhanThanhToan> findAll(int start, int end,
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

		List<TthcXacNhanThanhToan> list = (List<TthcXacNhanThanhToan>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TTHCXACNHANTHANHTOAN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TTHCXACNHANTHANHTOAN;

				if (pagination) {
					sql = sql.concat(TthcXacNhanThanhToanModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TthcXacNhanThanhToan>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcXacNhanThanhToan>(list);
				}
				else {
					list = (List<TthcXacNhanThanhToan>)QueryUtil.list(q,
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
	 * Removes all the tthc xac nhan thanh toans from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TthcXacNhanThanhToan tthcXacNhanThanhToan : findAll()) {
			remove(tthcXacNhanThanhToan);
		}
	}

	/**
	 * Returns the number of tthc xac nhan thanh toans.
	 *
	 * @return the number of tthc xac nhan thanh toans
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

				Query q = session.createQuery(_SQL_COUNT_TTHCXACNHANTHANHTOAN);

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
	 * Initializes the tthc xac nhan thanh toan persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TthcXacNhanThanhToan>> listenersList = new ArrayList<ModelListener<TthcXacNhanThanhToan>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TthcXacNhanThanhToan>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TthcXacNhanThanhToanImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TTHCXACNHANTHANHTOAN = "SELECT tthcXacNhanThanhToan FROM TthcXacNhanThanhToan tthcXacNhanThanhToan";
	private static final String _SQL_SELECT_TTHCXACNHANTHANHTOAN_WHERE = "SELECT tthcXacNhanThanhToan FROM TthcXacNhanThanhToan tthcXacNhanThanhToan WHERE ";
	private static final String _SQL_COUNT_TTHCXACNHANTHANHTOAN = "SELECT COUNT(tthcXacNhanThanhToan) FROM TthcXacNhanThanhToan tthcXacNhanThanhToan";
	private static final String _SQL_COUNT_TTHCXACNHANTHANHTOAN_WHERE = "SELECT COUNT(tthcXacNhanThanhToan) FROM TthcXacNhanThanhToan tthcXacNhanThanhToan WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tthcXacNhanThanhToan.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TthcXacNhanThanhToan exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TthcXacNhanThanhToan exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TthcXacNhanThanhToanPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"maTuSinh", "soTien", "hinhThucThanhToan", "thongTinXacNhan",
				"taiLieuDinhKem", "ngayTao", "nguoiTao", "ngayXacNhan",
				"nguoiXacNhan", "toChucQuanLy", "trangThaiXacNhan", "yKienXuLy",
				"loaiPhi", "tenDoanhNghiep", "ghiChu"
			});
	private static TthcXacNhanThanhToan _nullTthcXacNhanThanhToan = new TthcXacNhanThanhToanImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TthcXacNhanThanhToan> toCacheModel() {
				return _nullTthcXacNhanThanhToanCacheModel;
			}
		};

	private static CacheModel<TthcXacNhanThanhToan> _nullTthcXacNhanThanhToanCacheModel =
		new CacheModel<TthcXacNhanThanhToan>() {
			@Override
			public TthcXacNhanThanhToan toEntityModel() {
				return _nullTthcXacNhanThanhToan;
			}
		};
}