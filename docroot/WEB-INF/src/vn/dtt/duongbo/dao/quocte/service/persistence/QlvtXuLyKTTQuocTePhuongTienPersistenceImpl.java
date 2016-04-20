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

package vn.dtt.duongbo.dao.quocte.service.persistence;

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

import vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTePhuongTienException;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien;
import vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTePhuongTienImpl;
import vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTePhuongTienModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the qlvt xu ly k t t quoc te phuong tien service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NoiPham
 * @see QlvtXuLyKTTQuocTePhuongTienPersistence
 * @see QlvtXuLyKTTQuocTePhuongTienUtil
 * @generated
 */
public class QlvtXuLyKTTQuocTePhuongTienPersistenceImpl
	extends BasePersistenceImpl<QlvtXuLyKTTQuocTePhuongTien>
	implements QlvtXuLyKTTQuocTePhuongTienPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QlvtXuLyKTTQuocTePhuongTienUtil} to access the qlvt xu ly k t t quoc te phuong tien persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QlvtXuLyKTTQuocTePhuongTienImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QlvtXuLyKTTQuocTePhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyKTTQuocTePhuongTienModelImpl.FINDER_CACHE_ENABLED,
			QlvtXuLyKTTQuocTePhuongTienImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QlvtXuLyKTTQuocTePhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyKTTQuocTePhuongTienModelImpl.FINDER_CACHE_ENABLED,
			QlvtXuLyKTTQuocTePhuongTienImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QlvtXuLyKTTQuocTePhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyKTTQuocTePhuongTienModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CAPPHEPKTTQUOCTEID =
		new FinderPath(QlvtXuLyKTTQuocTePhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyKTTQuocTePhuongTienModelImpl.FINDER_CACHE_ENABLED,
			QlvtXuLyKTTQuocTePhuongTienImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycapPhepKTTQuocTeID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CAPPHEPKTTQUOCTEID =
		new FinderPath(QlvtXuLyKTTQuocTePhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyKTTQuocTePhuongTienModelImpl.FINDER_CACHE_ENABLED,
			QlvtXuLyKTTQuocTePhuongTienImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBycapPhepKTTQuocTeID", new String[] { Long.class.getName() },
			QlvtXuLyKTTQuocTePhuongTienModelImpl.CAPPHEPKTTQUOCTEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CAPPHEPKTTQUOCTEID = new FinderPath(QlvtXuLyKTTQuocTePhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyKTTQuocTePhuongTienModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBycapPhepKTTQuocTeID", new String[] { Long.class.getName() });

	/**
	 * Returns all the qlvt xu ly k t t quoc te phuong tiens where capPhepKTTQuocTeID = &#63;.
	 *
	 * @param capPhepKTTQuocTeID the cap phep k t t quoc te i d
	 * @return the matching qlvt xu ly k t t quoc te phuong tiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyKTTQuocTePhuongTien> findBycapPhepKTTQuocTeID(
		long capPhepKTTQuocTeID) throws SystemException {
		return findBycapPhepKTTQuocTeID(capPhepKTTQuocTeID, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt xu ly k t t quoc te phuong tiens where capPhepKTTQuocTeID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTePhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param capPhepKTTQuocTeID the cap phep k t t quoc te i d
	 * @param start the lower bound of the range of qlvt xu ly k t t quoc te phuong tiens
	 * @param end the upper bound of the range of qlvt xu ly k t t quoc te phuong tiens (not inclusive)
	 * @return the range of matching qlvt xu ly k t t quoc te phuong tiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyKTTQuocTePhuongTien> findBycapPhepKTTQuocTeID(
		long capPhepKTTQuocTeID, int start, int end) throws SystemException {
		return findBycapPhepKTTQuocTeID(capPhepKTTQuocTeID, start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt xu ly k t t quoc te phuong tiens where capPhepKTTQuocTeID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTePhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param capPhepKTTQuocTeID the cap phep k t t quoc te i d
	 * @param start the lower bound of the range of qlvt xu ly k t t quoc te phuong tiens
	 * @param end the upper bound of the range of qlvt xu ly k t t quoc te phuong tiens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching qlvt xu ly k t t quoc te phuong tiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyKTTQuocTePhuongTien> findBycapPhepKTTQuocTeID(
		long capPhepKTTQuocTeID, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CAPPHEPKTTQUOCTEID;
			finderArgs = new Object[] { capPhepKTTQuocTeID };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CAPPHEPKTTQUOCTEID;
			finderArgs = new Object[] {
					capPhepKTTQuocTeID,
					
					start, end, orderByComparator
				};
		}

		List<QlvtXuLyKTTQuocTePhuongTien> list = (List<QlvtXuLyKTTQuocTePhuongTien>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien : list) {
				if ((capPhepKTTQuocTeID != qlvtXuLyKTTQuocTePhuongTien.getCapPhepKTTQuocTeID())) {
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

			query.append(_SQL_SELECT_QLVTXULYKTTQUOCTEPHUONGTIEN_WHERE);

			query.append(_FINDER_COLUMN_CAPPHEPKTTQUOCTEID_CAPPHEPKTTQUOCTEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(QlvtXuLyKTTQuocTePhuongTienModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(capPhepKTTQuocTeID);

				if (!pagination) {
					list = (List<QlvtXuLyKTTQuocTePhuongTien>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtXuLyKTTQuocTePhuongTien>(list);
				}
				else {
					list = (List<QlvtXuLyKTTQuocTePhuongTien>)QueryUtil.list(q,
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
	 * Returns the first qlvt xu ly k t t quoc te phuong tien in the ordered set where capPhepKTTQuocTeID = &#63;.
	 *
	 * @param capPhepKTTQuocTeID the cap phep k t t quoc te i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qlvt xu ly k t t quoc te phuong tien
	 * @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTePhuongTienException if a matching qlvt xu ly k t t quoc te phuong tien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyKTTQuocTePhuongTien findBycapPhepKTTQuocTeID_First(
		long capPhepKTTQuocTeID, OrderByComparator orderByComparator)
		throws NoSuchQlvtXuLyKTTQuocTePhuongTienException, SystemException {
		QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien = fetchBycapPhepKTTQuocTeID_First(capPhepKTTQuocTeID,
				orderByComparator);

		if (qlvtXuLyKTTQuocTePhuongTien != null) {
			return qlvtXuLyKTTQuocTePhuongTien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("capPhepKTTQuocTeID=");
		msg.append(capPhepKTTQuocTeID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchQlvtXuLyKTTQuocTePhuongTienException(msg.toString());
	}

	/**
	 * Returns the first qlvt xu ly k t t quoc te phuong tien in the ordered set where capPhepKTTQuocTeID = &#63;.
	 *
	 * @param capPhepKTTQuocTeID the cap phep k t t quoc te i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qlvt xu ly k t t quoc te phuong tien, or <code>null</code> if a matching qlvt xu ly k t t quoc te phuong tien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyKTTQuocTePhuongTien fetchBycapPhepKTTQuocTeID_First(
		long capPhepKTTQuocTeID, OrderByComparator orderByComparator)
		throws SystemException {
		List<QlvtXuLyKTTQuocTePhuongTien> list = findBycapPhepKTTQuocTeID(capPhepKTTQuocTeID,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last qlvt xu ly k t t quoc te phuong tien in the ordered set where capPhepKTTQuocTeID = &#63;.
	 *
	 * @param capPhepKTTQuocTeID the cap phep k t t quoc te i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qlvt xu ly k t t quoc te phuong tien
	 * @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTePhuongTienException if a matching qlvt xu ly k t t quoc te phuong tien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyKTTQuocTePhuongTien findBycapPhepKTTQuocTeID_Last(
		long capPhepKTTQuocTeID, OrderByComparator orderByComparator)
		throws NoSuchQlvtXuLyKTTQuocTePhuongTienException, SystemException {
		QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien = fetchBycapPhepKTTQuocTeID_Last(capPhepKTTQuocTeID,
				orderByComparator);

		if (qlvtXuLyKTTQuocTePhuongTien != null) {
			return qlvtXuLyKTTQuocTePhuongTien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("capPhepKTTQuocTeID=");
		msg.append(capPhepKTTQuocTeID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchQlvtXuLyKTTQuocTePhuongTienException(msg.toString());
	}

	/**
	 * Returns the last qlvt xu ly k t t quoc te phuong tien in the ordered set where capPhepKTTQuocTeID = &#63;.
	 *
	 * @param capPhepKTTQuocTeID the cap phep k t t quoc te i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qlvt xu ly k t t quoc te phuong tien, or <code>null</code> if a matching qlvt xu ly k t t quoc te phuong tien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyKTTQuocTePhuongTien fetchBycapPhepKTTQuocTeID_Last(
		long capPhepKTTQuocTeID, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBycapPhepKTTQuocTeID(capPhepKTTQuocTeID);

		if (count == 0) {
			return null;
		}

		List<QlvtXuLyKTTQuocTePhuongTien> list = findBycapPhepKTTQuocTeID(capPhepKTTQuocTeID,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the qlvt xu ly k t t quoc te phuong tiens before and after the current qlvt xu ly k t t quoc te phuong tien in the ordered set where capPhepKTTQuocTeID = &#63;.
	 *
	 * @param id the primary key of the current qlvt xu ly k t t quoc te phuong tien
	 * @param capPhepKTTQuocTeID the cap phep k t t quoc te i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next qlvt xu ly k t t quoc te phuong tien
	 * @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTePhuongTienException if a qlvt xu ly k t t quoc te phuong tien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyKTTQuocTePhuongTien[] findBycapPhepKTTQuocTeID_PrevAndNext(
		long id, long capPhepKTTQuocTeID, OrderByComparator orderByComparator)
		throws NoSuchQlvtXuLyKTTQuocTePhuongTienException, SystemException {
		QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			QlvtXuLyKTTQuocTePhuongTien[] array = new QlvtXuLyKTTQuocTePhuongTienImpl[3];

			array[0] = getBycapPhepKTTQuocTeID_PrevAndNext(session,
					qlvtXuLyKTTQuocTePhuongTien, capPhepKTTQuocTeID,
					orderByComparator, true);

			array[1] = qlvtXuLyKTTQuocTePhuongTien;

			array[2] = getBycapPhepKTTQuocTeID_PrevAndNext(session,
					qlvtXuLyKTTQuocTePhuongTien, capPhepKTTQuocTeID,
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

	protected QlvtXuLyKTTQuocTePhuongTien getBycapPhepKTTQuocTeID_PrevAndNext(
		Session session,
		QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien,
		long capPhepKTTQuocTeID, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_QLVTXULYKTTQUOCTEPHUONGTIEN_WHERE);

		query.append(_FINDER_COLUMN_CAPPHEPKTTQUOCTEID_CAPPHEPKTTQUOCTEID_2);

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
			query.append(QlvtXuLyKTTQuocTePhuongTienModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(capPhepKTTQuocTeID);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(qlvtXuLyKTTQuocTePhuongTien);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<QlvtXuLyKTTQuocTePhuongTien> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the qlvt xu ly k t t quoc te phuong tiens where capPhepKTTQuocTeID = &#63; from the database.
	 *
	 * @param capPhepKTTQuocTeID the cap phep k t t quoc te i d
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBycapPhepKTTQuocTeID(long capPhepKTTQuocTeID)
		throws SystemException {
		for (QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien : findBycapPhepKTTQuocTeID(
				capPhepKTTQuocTeID, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(qlvtXuLyKTTQuocTePhuongTien);
		}
	}

	/**
	 * Returns the number of qlvt xu ly k t t quoc te phuong tiens where capPhepKTTQuocTeID = &#63;.
	 *
	 * @param capPhepKTTQuocTeID the cap phep k t t quoc te i d
	 * @return the number of matching qlvt xu ly k t t quoc te phuong tiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBycapPhepKTTQuocTeID(long capPhepKTTQuocTeID)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CAPPHEPKTTQUOCTEID;

		Object[] finderArgs = new Object[] { capPhepKTTQuocTeID };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_QLVTXULYKTTQUOCTEPHUONGTIEN_WHERE);

			query.append(_FINDER_COLUMN_CAPPHEPKTTQUOCTEID_CAPPHEPKTTQUOCTEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(capPhepKTTQuocTeID);

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

	private static final String _FINDER_COLUMN_CAPPHEPKTTQUOCTEID_CAPPHEPKTTQUOCTEID_2 =
		"qlvtXuLyKTTQuocTePhuongTien.capPhepKTTQuocTeID = ?";

	public QlvtXuLyKTTQuocTePhuongTienPersistenceImpl() {
		setModelClass(QlvtXuLyKTTQuocTePhuongTien.class);
	}

	/**
	 * Caches the qlvt xu ly k t t quoc te phuong tien in the entity cache if it is enabled.
	 *
	 * @param qlvtXuLyKTTQuocTePhuongTien the qlvt xu ly k t t quoc te phuong tien
	 */
	@Override
	public void cacheResult(
		QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien) {
		EntityCacheUtil.putResult(QlvtXuLyKTTQuocTePhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyKTTQuocTePhuongTienImpl.class,
			qlvtXuLyKTTQuocTePhuongTien.getPrimaryKey(),
			qlvtXuLyKTTQuocTePhuongTien);

		qlvtXuLyKTTQuocTePhuongTien.resetOriginalValues();
	}

	/**
	 * Caches the qlvt xu ly k t t quoc te phuong tiens in the entity cache if it is enabled.
	 *
	 * @param qlvtXuLyKTTQuocTePhuongTiens the qlvt xu ly k t t quoc te phuong tiens
	 */
	@Override
	public void cacheResult(
		List<QlvtXuLyKTTQuocTePhuongTien> qlvtXuLyKTTQuocTePhuongTiens) {
		for (QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien : qlvtXuLyKTTQuocTePhuongTiens) {
			if (EntityCacheUtil.getResult(
						QlvtXuLyKTTQuocTePhuongTienModelImpl.ENTITY_CACHE_ENABLED,
						QlvtXuLyKTTQuocTePhuongTienImpl.class,
						qlvtXuLyKTTQuocTePhuongTien.getPrimaryKey()) == null) {
				cacheResult(qlvtXuLyKTTQuocTePhuongTien);
			}
			else {
				qlvtXuLyKTTQuocTePhuongTien.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qlvt xu ly k t t quoc te phuong tiens.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QlvtXuLyKTTQuocTePhuongTienImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QlvtXuLyKTTQuocTePhuongTienImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qlvt xu ly k t t quoc te phuong tien.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien) {
		EntityCacheUtil.removeResult(QlvtXuLyKTTQuocTePhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyKTTQuocTePhuongTienImpl.class,
			qlvtXuLyKTTQuocTePhuongTien.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<QlvtXuLyKTTQuocTePhuongTien> qlvtXuLyKTTQuocTePhuongTiens) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien : qlvtXuLyKTTQuocTePhuongTiens) {
			EntityCacheUtil.removeResult(QlvtXuLyKTTQuocTePhuongTienModelImpl.ENTITY_CACHE_ENABLED,
				QlvtXuLyKTTQuocTePhuongTienImpl.class,
				qlvtXuLyKTTQuocTePhuongTien.getPrimaryKey());
		}
	}

	/**
	 * Creates a new qlvt xu ly k t t quoc te phuong tien with the primary key. Does not add the qlvt xu ly k t t quoc te phuong tien to the database.
	 *
	 * @param id the primary key for the new qlvt xu ly k t t quoc te phuong tien
	 * @return the new qlvt xu ly k t t quoc te phuong tien
	 */
	@Override
	public QlvtXuLyKTTQuocTePhuongTien create(long id) {
		QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien = new QlvtXuLyKTTQuocTePhuongTienImpl();

		qlvtXuLyKTTQuocTePhuongTien.setNew(true);
		qlvtXuLyKTTQuocTePhuongTien.setPrimaryKey(id);

		return qlvtXuLyKTTQuocTePhuongTien;
	}

	/**
	 * Removes the qlvt xu ly k t t quoc te phuong tien with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the qlvt xu ly k t t quoc te phuong tien
	 * @return the qlvt xu ly k t t quoc te phuong tien that was removed
	 * @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTePhuongTienException if a qlvt xu ly k t t quoc te phuong tien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyKTTQuocTePhuongTien remove(long id)
		throws NoSuchQlvtXuLyKTTQuocTePhuongTienException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the qlvt xu ly k t t quoc te phuong tien with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qlvt xu ly k t t quoc te phuong tien
	 * @return the qlvt xu ly k t t quoc te phuong tien that was removed
	 * @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTePhuongTienException if a qlvt xu ly k t t quoc te phuong tien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyKTTQuocTePhuongTien remove(Serializable primaryKey)
		throws NoSuchQlvtXuLyKTTQuocTePhuongTienException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien = (QlvtXuLyKTTQuocTePhuongTien)session.get(QlvtXuLyKTTQuocTePhuongTienImpl.class,
					primaryKey);

			if (qlvtXuLyKTTQuocTePhuongTien == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQlvtXuLyKTTQuocTePhuongTienException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtXuLyKTTQuocTePhuongTien);
		}
		catch (NoSuchQlvtXuLyKTTQuocTePhuongTienException nsee) {
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
	protected QlvtXuLyKTTQuocTePhuongTien removeImpl(
		QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien)
		throws SystemException {
		qlvtXuLyKTTQuocTePhuongTien = toUnwrappedModel(qlvtXuLyKTTQuocTePhuongTien);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtXuLyKTTQuocTePhuongTien)) {
				qlvtXuLyKTTQuocTePhuongTien = (QlvtXuLyKTTQuocTePhuongTien)session.get(QlvtXuLyKTTQuocTePhuongTienImpl.class,
						qlvtXuLyKTTQuocTePhuongTien.getPrimaryKeyObj());
			}

			if (qlvtXuLyKTTQuocTePhuongTien != null) {
				session.delete(qlvtXuLyKTTQuocTePhuongTien);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtXuLyKTTQuocTePhuongTien != null) {
			clearCache(qlvtXuLyKTTQuocTePhuongTien);
		}

		return qlvtXuLyKTTQuocTePhuongTien;
	}

	@Override
	public QlvtXuLyKTTQuocTePhuongTien updateImpl(
		vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien)
		throws SystemException {
		qlvtXuLyKTTQuocTePhuongTien = toUnwrappedModel(qlvtXuLyKTTQuocTePhuongTien);

		boolean isNew = qlvtXuLyKTTQuocTePhuongTien.isNew();

		QlvtXuLyKTTQuocTePhuongTienModelImpl qlvtXuLyKTTQuocTePhuongTienModelImpl =
			(QlvtXuLyKTTQuocTePhuongTienModelImpl)qlvtXuLyKTTQuocTePhuongTien;

		Session session = null;

		try {
			session = openSession();

			if (qlvtXuLyKTTQuocTePhuongTien.isNew()) {
				session.save(qlvtXuLyKTTQuocTePhuongTien);

				qlvtXuLyKTTQuocTePhuongTien.setNew(false);
			}
			else {
				session.merge(qlvtXuLyKTTQuocTePhuongTien);
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
				!QlvtXuLyKTTQuocTePhuongTienModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((qlvtXuLyKTTQuocTePhuongTienModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CAPPHEPKTTQUOCTEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						qlvtXuLyKTTQuocTePhuongTienModelImpl.getOriginalCapPhepKTTQuocTeID()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CAPPHEPKTTQUOCTEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CAPPHEPKTTQUOCTEID,
					args);

				args = new Object[] {
						qlvtXuLyKTTQuocTePhuongTienModelImpl.getCapPhepKTTQuocTeID()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CAPPHEPKTTQUOCTEID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CAPPHEPKTTQUOCTEID,
					args);
			}
		}

		EntityCacheUtil.putResult(QlvtXuLyKTTQuocTePhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyKTTQuocTePhuongTienImpl.class,
			qlvtXuLyKTTQuocTePhuongTien.getPrimaryKey(),
			qlvtXuLyKTTQuocTePhuongTien);

		return qlvtXuLyKTTQuocTePhuongTien;
	}

	protected QlvtXuLyKTTQuocTePhuongTien toUnwrappedModel(
		QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien) {
		if (qlvtXuLyKTTQuocTePhuongTien instanceof QlvtXuLyKTTQuocTePhuongTienImpl) {
			return qlvtXuLyKTTQuocTePhuongTien;
		}

		QlvtXuLyKTTQuocTePhuongTienImpl qlvtXuLyKTTQuocTePhuongTienImpl = new QlvtXuLyKTTQuocTePhuongTienImpl();

		qlvtXuLyKTTQuocTePhuongTienImpl.setNew(qlvtXuLyKTTQuocTePhuongTien.isNew());
		qlvtXuLyKTTQuocTePhuongTienImpl.setPrimaryKey(qlvtXuLyKTTQuocTePhuongTien.getPrimaryKey());

		qlvtXuLyKTTQuocTePhuongTienImpl.setId(qlvtXuLyKTTQuocTePhuongTien.getId());
		qlvtXuLyKTTQuocTePhuongTienImpl.setKttQuocTeID(qlvtXuLyKTTQuocTePhuongTien.getKttQuocTeID());
		qlvtXuLyKTTQuocTePhuongTienImpl.setBienSo(qlvtXuLyKTTQuocTePhuongTien.getBienSo());
		qlvtXuLyKTTQuocTePhuongTienImpl.setTrongTai(qlvtXuLyKTTQuocTePhuongTien.getTrongTai());
		qlvtXuLyKTTQuocTePhuongTienImpl.setNamSx(qlvtXuLyKTTQuocTePhuongTien.getNamSx());
		qlvtXuLyKTTQuocTePhuongTienImpl.setNhanHieu(qlvtXuLyKTTQuocTePhuongTien.getNhanHieu());
		qlvtXuLyKTTQuocTePhuongTienImpl.setSoKhung(qlvtXuLyKTTQuocTePhuongTien.getSoKhung());
		qlvtXuLyKTTQuocTePhuongTienImpl.setSoMay(qlvtXuLyKTTQuocTePhuongTien.getSoMay());
		qlvtXuLyKTTQuocTePhuongTienImpl.setCuaKhau(qlvtXuLyKTTQuocTePhuongTien.getCuaKhau());
		qlvtXuLyKTTQuocTePhuongTienImpl.setMaCuaKhau(qlvtXuLyKTTQuocTePhuongTien.getMaCuaKhau());
		qlvtXuLyKTTQuocTePhuongTienImpl.setHinhThucSoHuu(qlvtXuLyKTTQuocTePhuongTien.getHinhThucSoHuu());
		qlvtXuLyKTTQuocTePhuongTienImpl.setDoanhNghiepChoThue(qlvtXuLyKTTQuocTePhuongTien.getDoanhNghiepChoThue());
		qlvtXuLyKTTQuocTePhuongTienImpl.setThoiHanChoThue(qlvtXuLyKTTQuocTePhuongTien.getThoiHanChoThue());
		qlvtXuLyKTTQuocTePhuongTienImpl.setHopDongSauCung(qlvtXuLyKTTQuocTePhuongTien.getHopDongSauCung());
		qlvtXuLyKTTQuocTePhuongTienImpl.setThoiGianNhapCanh(qlvtXuLyKTTQuocTePhuongTien.getThoiGianNhapCanh());
		qlvtXuLyKTTQuocTePhuongTienImpl.setThoiGianKhoiHanh(qlvtXuLyKTTQuocTePhuongTien.getThoiGianKhoiHanh());
		qlvtXuLyKTTQuocTePhuongTienImpl.setXinCapPhepTuNgay(qlvtXuLyKTTQuocTePhuongTien.getXinCapPhepTuNgay());
		qlvtXuLyKTTQuocTePhuongTienImpl.setXinCapPhepDenNgay(qlvtXuLyKTTQuocTePhuongTien.getXinCapPhepDenNgay());
		qlvtXuLyKTTQuocTePhuongTienImpl.setHinhThucHoatDong(qlvtXuLyKTTQuocTePhuongTien.getHinhThucHoatDong());
		qlvtXuLyKTTQuocTePhuongTienImpl.setLoaiHinhGiaHan(qlvtXuLyKTTQuocTePhuongTien.getLoaiHinhGiaHan());
		qlvtXuLyKTTQuocTePhuongTienImpl.setKetQuaXuLy(qlvtXuLyKTTQuocTePhuongTien.getKetQuaXuLy());
		qlvtXuLyKTTQuocTePhuongTienImpl.setLyDoKhongDat(qlvtXuLyKTTQuocTePhuongTien.getLyDoKhongDat());
		qlvtXuLyKTTQuocTePhuongTienImpl.setCapPhepKTTQuocTeID(qlvtXuLyKTTQuocTePhuongTien.getCapPhepKTTQuocTeID());
		qlvtXuLyKTTQuocTePhuongTienImpl.setLoaiGiayPhep(qlvtXuLyKTTQuocTePhuongTien.getLoaiGiayPhep());
		qlvtXuLyKTTQuocTePhuongTienImpl.setSoChoNgoi(qlvtXuLyKTTQuocTePhuongTien.getSoChoNgoi());
		qlvtXuLyKTTQuocTePhuongTienImpl.setTenDangKySoHuu(qlvtXuLyKTTQuocTePhuongTien.getTenDangKySoHuu());

		return qlvtXuLyKTTQuocTePhuongTienImpl;
	}

	/**
	 * Returns the qlvt xu ly k t t quoc te phuong tien with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt xu ly k t t quoc te phuong tien
	 * @return the qlvt xu ly k t t quoc te phuong tien
	 * @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTePhuongTienException if a qlvt xu ly k t t quoc te phuong tien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyKTTQuocTePhuongTien findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQlvtXuLyKTTQuocTePhuongTienException, SystemException {
		QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien = fetchByPrimaryKey(primaryKey);

		if (qlvtXuLyKTTQuocTePhuongTien == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQlvtXuLyKTTQuocTePhuongTienException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtXuLyKTTQuocTePhuongTien;
	}

	/**
	 * Returns the qlvt xu ly k t t quoc te phuong tien with the primary key or throws a {@link vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTePhuongTienException} if it could not be found.
	 *
	 * @param id the primary key of the qlvt xu ly k t t quoc te phuong tien
	 * @return the qlvt xu ly k t t quoc te phuong tien
	 * @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTePhuongTienException if a qlvt xu ly k t t quoc te phuong tien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyKTTQuocTePhuongTien findByPrimaryKey(long id)
		throws NoSuchQlvtXuLyKTTQuocTePhuongTienException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the qlvt xu ly k t t quoc te phuong tien with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt xu ly k t t quoc te phuong tien
	 * @return the qlvt xu ly k t t quoc te phuong tien, or <code>null</code> if a qlvt xu ly k t t quoc te phuong tien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyKTTQuocTePhuongTien fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien = (QlvtXuLyKTTQuocTePhuongTien)EntityCacheUtil.getResult(QlvtXuLyKTTQuocTePhuongTienModelImpl.ENTITY_CACHE_ENABLED,
				QlvtXuLyKTTQuocTePhuongTienImpl.class, primaryKey);

		if (qlvtXuLyKTTQuocTePhuongTien == _nullQlvtXuLyKTTQuocTePhuongTien) {
			return null;
		}

		if (qlvtXuLyKTTQuocTePhuongTien == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtXuLyKTTQuocTePhuongTien = (QlvtXuLyKTTQuocTePhuongTien)session.get(QlvtXuLyKTTQuocTePhuongTienImpl.class,
						primaryKey);

				if (qlvtXuLyKTTQuocTePhuongTien != null) {
					cacheResult(qlvtXuLyKTTQuocTePhuongTien);
				}
				else {
					EntityCacheUtil.putResult(QlvtXuLyKTTQuocTePhuongTienModelImpl.ENTITY_CACHE_ENABLED,
						QlvtXuLyKTTQuocTePhuongTienImpl.class, primaryKey,
						_nullQlvtXuLyKTTQuocTePhuongTien);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QlvtXuLyKTTQuocTePhuongTienModelImpl.ENTITY_CACHE_ENABLED,
					QlvtXuLyKTTQuocTePhuongTienImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtXuLyKTTQuocTePhuongTien;
	}

	/**
	 * Returns the qlvt xu ly k t t quoc te phuong tien with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the qlvt xu ly k t t quoc te phuong tien
	 * @return the qlvt xu ly k t t quoc te phuong tien, or <code>null</code> if a qlvt xu ly k t t quoc te phuong tien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyKTTQuocTePhuongTien fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the qlvt xu ly k t t quoc te phuong tiens.
	 *
	 * @return the qlvt xu ly k t t quoc te phuong tiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyKTTQuocTePhuongTien> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt xu ly k t t quoc te phuong tiens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTePhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt xu ly k t t quoc te phuong tiens
	 * @param end the upper bound of the range of qlvt xu ly k t t quoc te phuong tiens (not inclusive)
	 * @return the range of qlvt xu ly k t t quoc te phuong tiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyKTTQuocTePhuongTien> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt xu ly k t t quoc te phuong tiens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTePhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt xu ly k t t quoc te phuong tiens
	 * @param end the upper bound of the range of qlvt xu ly k t t quoc te phuong tiens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qlvt xu ly k t t quoc te phuong tiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyKTTQuocTePhuongTien> findAll(int start, int end,
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

		List<QlvtXuLyKTTQuocTePhuongTien> list = (List<QlvtXuLyKTTQuocTePhuongTien>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTXULYKTTQUOCTEPHUONGTIEN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTXULYKTTQUOCTEPHUONGTIEN;

				if (pagination) {
					sql = sql.concat(QlvtXuLyKTTQuocTePhuongTienModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QlvtXuLyKTTQuocTePhuongTien>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtXuLyKTTQuocTePhuongTien>(list);
				}
				else {
					list = (List<QlvtXuLyKTTQuocTePhuongTien>)QueryUtil.list(q,
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
	 * Removes all the qlvt xu ly k t t quoc te phuong tiens from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien : findAll()) {
			remove(qlvtXuLyKTTQuocTePhuongTien);
		}
	}

	/**
	 * Returns the number of qlvt xu ly k t t quoc te phuong tiens.
	 *
	 * @return the number of qlvt xu ly k t t quoc te phuong tiens
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

				Query q = session.createQuery(_SQL_COUNT_QLVTXULYKTTQUOCTEPHUONGTIEN);

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
	 * Initializes the qlvt xu ly k t t quoc te phuong tien persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QlvtXuLyKTTQuocTePhuongTien>> listenersList = new ArrayList<ModelListener<QlvtXuLyKTTQuocTePhuongTien>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QlvtXuLyKTTQuocTePhuongTien>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QlvtXuLyKTTQuocTePhuongTienImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTXULYKTTQUOCTEPHUONGTIEN = "SELECT qlvtXuLyKTTQuocTePhuongTien FROM QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien";
	private static final String _SQL_SELECT_QLVTXULYKTTQUOCTEPHUONGTIEN_WHERE = "SELECT qlvtXuLyKTTQuocTePhuongTien FROM QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien WHERE ";
	private static final String _SQL_COUNT_QLVTXULYKTTQUOCTEPHUONGTIEN = "SELECT COUNT(qlvtXuLyKTTQuocTePhuongTien) FROM QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien";
	private static final String _SQL_COUNT_QLVTXULYKTTQUOCTEPHUONGTIEN_WHERE = "SELECT COUNT(qlvtXuLyKTTQuocTePhuongTien) FROM QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtXuLyKTTQuocTePhuongTien.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QlvtXuLyKTTQuocTePhuongTien exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No QlvtXuLyKTTQuocTePhuongTien exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QlvtXuLyKTTQuocTePhuongTienPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "kttQuocTeID", "bienSo", "trongTai", "namSx", "nhanHieu",
				"soKhung", "soMay", "cuaKhau", "maCuaKhau", "hinhThucSoHuu",
				"doanhNghiepChoThue", "thoiHanChoThue", "hopDongSauCung",
				"thoiGianNhapCanh", "thoiGianKhoiHanh", "xinCapPhepTuNgay",
				"xinCapPhepDenNgay", "hinhThucHoatDong", "loaiHinhGiaHan",
				"ketQuaXuLy", "lyDoKhongDat", "capPhepKTTQuocTeID",
				"loaiGiayPhep", "soChoNgoi", "tenDangKySoHuu"
			});
	private static QlvtXuLyKTTQuocTePhuongTien _nullQlvtXuLyKTTQuocTePhuongTien = new QlvtXuLyKTTQuocTePhuongTienImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QlvtXuLyKTTQuocTePhuongTien> toCacheModel() {
				return _nullQlvtXuLyKTTQuocTePhuongTienCacheModel;
			}
		};

	private static CacheModel<QlvtXuLyKTTQuocTePhuongTien> _nullQlvtXuLyKTTQuocTePhuongTienCacheModel =
		new CacheModel<QlvtXuLyKTTQuocTePhuongTien>() {
			@Override
			public QlvtXuLyKTTQuocTePhuongTien toEntityModel() {
				return _nullQlvtXuLyKTTQuocTePhuongTien;
			}
		};
}