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

package vn.dtt.duongbo.dao.capbienhieuphuhieu.service.persistence;

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

import vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuPhuongTienException;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTien;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyPhuHieuPhuongTienImpl;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyPhuHieuPhuongTienModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the q l v t xu ly phu hieu phuong tien service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author binhta
 * @see QLVTXuLyPhuHieuPhuongTienPersistence
 * @see QLVTXuLyPhuHieuPhuongTienUtil
 * @generated
 */
public class QLVTXuLyPhuHieuPhuongTienPersistenceImpl
	extends BasePersistenceImpl<QLVTXuLyPhuHieuPhuongTien>
	implements QLVTXuLyPhuHieuPhuongTienPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QLVTXuLyPhuHieuPhuongTienUtil} to access the q l v t xu ly phu hieu phuong tien persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QLVTXuLyPhuHieuPhuongTienImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QLVTXuLyPhuHieuPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QLVTXuLyPhuHieuPhuongTienModelImpl.FINDER_CACHE_ENABLED,
			QLVTXuLyPhuHieuPhuongTienImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QLVTXuLyPhuHieuPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QLVTXuLyPhuHieuPhuongTienModelImpl.FINDER_CACHE_ENABLED,
			QLVTXuLyPhuHieuPhuongTienImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QLVTXuLyPhuHieuPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QLVTXuLyPhuHieuPhuongTienModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CAPPHUHIEUID =
		new FinderPath(QLVTXuLyPhuHieuPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QLVTXuLyPhuHieuPhuongTienModelImpl.FINDER_CACHE_ENABLED,
			QLVTXuLyPhuHieuPhuongTienImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycapPhuHieuID",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CAPPHUHIEUID =
		new FinderPath(QLVTXuLyPhuHieuPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QLVTXuLyPhuHieuPhuongTienModelImpl.FINDER_CACHE_ENABLED,
			QLVTXuLyPhuHieuPhuongTienImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycapPhuHieuID",
			new String[] { Integer.class.getName() },
			QLVTXuLyPhuHieuPhuongTienModelImpl.CAPPHUHIEUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CAPPHUHIEUID = new FinderPath(QLVTXuLyPhuHieuPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QLVTXuLyPhuHieuPhuongTienModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBycapPhuHieuID", new String[] { Integer.class.getName() });

	/**
	 * Returns all the q l v t xu ly phu hieu phuong tiens where capPhuHieuID = &#63;.
	 *
	 * @param capPhuHieuID the cap phu hieu i d
	 * @return the matching q l v t xu ly phu hieu phuong tiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QLVTXuLyPhuHieuPhuongTien> findBycapPhuHieuID(int capPhuHieuID)
		throws SystemException {
		return findBycapPhuHieuID(capPhuHieuID, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the q l v t xu ly phu hieu phuong tiens where capPhuHieuID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyPhuHieuPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param capPhuHieuID the cap phu hieu i d
	 * @param start the lower bound of the range of q l v t xu ly phu hieu phuong tiens
	 * @param end the upper bound of the range of q l v t xu ly phu hieu phuong tiens (not inclusive)
	 * @return the range of matching q l v t xu ly phu hieu phuong tiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QLVTXuLyPhuHieuPhuongTien> findBycapPhuHieuID(
		int capPhuHieuID, int start, int end) throws SystemException {
		return findBycapPhuHieuID(capPhuHieuID, start, end, null);
	}

	/**
	 * Returns an ordered range of all the q l v t xu ly phu hieu phuong tiens where capPhuHieuID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyPhuHieuPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param capPhuHieuID the cap phu hieu i d
	 * @param start the lower bound of the range of q l v t xu ly phu hieu phuong tiens
	 * @param end the upper bound of the range of q l v t xu ly phu hieu phuong tiens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching q l v t xu ly phu hieu phuong tiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QLVTXuLyPhuHieuPhuongTien> findBycapPhuHieuID(
		int capPhuHieuID, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CAPPHUHIEUID;
			finderArgs = new Object[] { capPhuHieuID };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CAPPHUHIEUID;
			finderArgs = new Object[] {
					capPhuHieuID,
					
					start, end, orderByComparator
				};
		}

		List<QLVTXuLyPhuHieuPhuongTien> list = (List<QLVTXuLyPhuHieuPhuongTien>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (QLVTXuLyPhuHieuPhuongTien qlvtXuLyPhuHieuPhuongTien : list) {
				if ((capPhuHieuID != qlvtXuLyPhuHieuPhuongTien.getCapPhuHieuID())) {
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

			query.append(_SQL_SELECT_QLVTXULYPHUHIEUPHUONGTIEN_WHERE);

			query.append(_FINDER_COLUMN_CAPPHUHIEUID_CAPPHUHIEUID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(QLVTXuLyPhuHieuPhuongTienModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(capPhuHieuID);

				if (!pagination) {
					list = (List<QLVTXuLyPhuHieuPhuongTien>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QLVTXuLyPhuHieuPhuongTien>(list);
				}
				else {
					list = (List<QLVTXuLyPhuHieuPhuongTien>)QueryUtil.list(q,
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
	 * Returns the first q l v t xu ly phu hieu phuong tien in the ordered set where capPhuHieuID = &#63;.
	 *
	 * @param capPhuHieuID the cap phu hieu i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching q l v t xu ly phu hieu phuong tien
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuPhuongTienException if a matching q l v t xu ly phu hieu phuong tien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyPhuHieuPhuongTien findBycapPhuHieuID_First(
		int capPhuHieuID, OrderByComparator orderByComparator)
		throws NoSuchQLVTXuLyPhuHieuPhuongTienException, SystemException {
		QLVTXuLyPhuHieuPhuongTien qlvtXuLyPhuHieuPhuongTien = fetchBycapPhuHieuID_First(capPhuHieuID,
				orderByComparator);

		if (qlvtXuLyPhuHieuPhuongTien != null) {
			return qlvtXuLyPhuHieuPhuongTien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("capPhuHieuID=");
		msg.append(capPhuHieuID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchQLVTXuLyPhuHieuPhuongTienException(msg.toString());
	}

	/**
	 * Returns the first q l v t xu ly phu hieu phuong tien in the ordered set where capPhuHieuID = &#63;.
	 *
	 * @param capPhuHieuID the cap phu hieu i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching q l v t xu ly phu hieu phuong tien, or <code>null</code> if a matching q l v t xu ly phu hieu phuong tien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyPhuHieuPhuongTien fetchBycapPhuHieuID_First(
		int capPhuHieuID, OrderByComparator orderByComparator)
		throws SystemException {
		List<QLVTXuLyPhuHieuPhuongTien> list = findBycapPhuHieuID(capPhuHieuID,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last q l v t xu ly phu hieu phuong tien in the ordered set where capPhuHieuID = &#63;.
	 *
	 * @param capPhuHieuID the cap phu hieu i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching q l v t xu ly phu hieu phuong tien
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuPhuongTienException if a matching q l v t xu ly phu hieu phuong tien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyPhuHieuPhuongTien findBycapPhuHieuID_Last(int capPhuHieuID,
		OrderByComparator orderByComparator)
		throws NoSuchQLVTXuLyPhuHieuPhuongTienException, SystemException {
		QLVTXuLyPhuHieuPhuongTien qlvtXuLyPhuHieuPhuongTien = fetchBycapPhuHieuID_Last(capPhuHieuID,
				orderByComparator);

		if (qlvtXuLyPhuHieuPhuongTien != null) {
			return qlvtXuLyPhuHieuPhuongTien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("capPhuHieuID=");
		msg.append(capPhuHieuID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchQLVTXuLyPhuHieuPhuongTienException(msg.toString());
	}

	/**
	 * Returns the last q l v t xu ly phu hieu phuong tien in the ordered set where capPhuHieuID = &#63;.
	 *
	 * @param capPhuHieuID the cap phu hieu i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching q l v t xu ly phu hieu phuong tien, or <code>null</code> if a matching q l v t xu ly phu hieu phuong tien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyPhuHieuPhuongTien fetchBycapPhuHieuID_Last(
		int capPhuHieuID, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBycapPhuHieuID(capPhuHieuID);

		if (count == 0) {
			return null;
		}

		List<QLVTXuLyPhuHieuPhuongTien> list = findBycapPhuHieuID(capPhuHieuID,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the q l v t xu ly phu hieu phuong tiens before and after the current q l v t xu ly phu hieu phuong tien in the ordered set where capPhuHieuID = &#63;.
	 *
	 * @param id the primary key of the current q l v t xu ly phu hieu phuong tien
	 * @param capPhuHieuID the cap phu hieu i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next q l v t xu ly phu hieu phuong tien
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuPhuongTienException if a q l v t xu ly phu hieu phuong tien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyPhuHieuPhuongTien[] findBycapPhuHieuID_PrevAndNext(int id,
		int capPhuHieuID, OrderByComparator orderByComparator)
		throws NoSuchQLVTXuLyPhuHieuPhuongTienException, SystemException {
		QLVTXuLyPhuHieuPhuongTien qlvtXuLyPhuHieuPhuongTien = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			QLVTXuLyPhuHieuPhuongTien[] array = new QLVTXuLyPhuHieuPhuongTienImpl[3];

			array[0] = getBycapPhuHieuID_PrevAndNext(session,
					qlvtXuLyPhuHieuPhuongTien, capPhuHieuID, orderByComparator,
					true);

			array[1] = qlvtXuLyPhuHieuPhuongTien;

			array[2] = getBycapPhuHieuID_PrevAndNext(session,
					qlvtXuLyPhuHieuPhuongTien, capPhuHieuID, orderByComparator,
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

	protected QLVTXuLyPhuHieuPhuongTien getBycapPhuHieuID_PrevAndNext(
		Session session, QLVTXuLyPhuHieuPhuongTien qlvtXuLyPhuHieuPhuongTien,
		int capPhuHieuID, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_QLVTXULYPHUHIEUPHUONGTIEN_WHERE);

		query.append(_FINDER_COLUMN_CAPPHUHIEUID_CAPPHUHIEUID_2);

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
			query.append(QLVTXuLyPhuHieuPhuongTienModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(capPhuHieuID);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(qlvtXuLyPhuHieuPhuongTien);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<QLVTXuLyPhuHieuPhuongTien> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the q l v t xu ly phu hieu phuong tiens where capPhuHieuID = &#63; from the database.
	 *
	 * @param capPhuHieuID the cap phu hieu i d
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBycapPhuHieuID(int capPhuHieuID)
		throws SystemException {
		for (QLVTXuLyPhuHieuPhuongTien qlvtXuLyPhuHieuPhuongTien : findBycapPhuHieuID(
				capPhuHieuID, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(qlvtXuLyPhuHieuPhuongTien);
		}
	}

	/**
	 * Returns the number of q l v t xu ly phu hieu phuong tiens where capPhuHieuID = &#63;.
	 *
	 * @param capPhuHieuID the cap phu hieu i d
	 * @return the number of matching q l v t xu ly phu hieu phuong tiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBycapPhuHieuID(int capPhuHieuID) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CAPPHUHIEUID;

		Object[] finderArgs = new Object[] { capPhuHieuID };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_QLVTXULYPHUHIEUPHUONGTIEN_WHERE);

			query.append(_FINDER_COLUMN_CAPPHUHIEUID_CAPPHUHIEUID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(capPhuHieuID);

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

	private static final String _FINDER_COLUMN_CAPPHUHIEUID_CAPPHUHIEUID_2 = "qlvtXuLyPhuHieuPhuongTien.capPhuHieuID = ?";

	public QLVTXuLyPhuHieuPhuongTienPersistenceImpl() {
		setModelClass(QLVTXuLyPhuHieuPhuongTien.class);
	}

	/**
	 * Caches the q l v t xu ly phu hieu phuong tien in the entity cache if it is enabled.
	 *
	 * @param qlvtXuLyPhuHieuPhuongTien the q l v t xu ly phu hieu phuong tien
	 */
	@Override
	public void cacheResult(QLVTXuLyPhuHieuPhuongTien qlvtXuLyPhuHieuPhuongTien) {
		EntityCacheUtil.putResult(QLVTXuLyPhuHieuPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QLVTXuLyPhuHieuPhuongTienImpl.class,
			qlvtXuLyPhuHieuPhuongTien.getPrimaryKey(), qlvtXuLyPhuHieuPhuongTien);

		qlvtXuLyPhuHieuPhuongTien.resetOriginalValues();
	}

	/**
	 * Caches the q l v t xu ly phu hieu phuong tiens in the entity cache if it is enabled.
	 *
	 * @param qlvtXuLyPhuHieuPhuongTiens the q l v t xu ly phu hieu phuong tiens
	 */
	@Override
	public void cacheResult(
		List<QLVTXuLyPhuHieuPhuongTien> qlvtXuLyPhuHieuPhuongTiens) {
		for (QLVTXuLyPhuHieuPhuongTien qlvtXuLyPhuHieuPhuongTien : qlvtXuLyPhuHieuPhuongTiens) {
			if (EntityCacheUtil.getResult(
						QLVTXuLyPhuHieuPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
						QLVTXuLyPhuHieuPhuongTienImpl.class,
						qlvtXuLyPhuHieuPhuongTien.getPrimaryKey()) == null) {
				cacheResult(qlvtXuLyPhuHieuPhuongTien);
			}
			else {
				qlvtXuLyPhuHieuPhuongTien.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all q l v t xu ly phu hieu phuong tiens.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QLVTXuLyPhuHieuPhuongTienImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QLVTXuLyPhuHieuPhuongTienImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the q l v t xu ly phu hieu phuong tien.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QLVTXuLyPhuHieuPhuongTien qlvtXuLyPhuHieuPhuongTien) {
		EntityCacheUtil.removeResult(QLVTXuLyPhuHieuPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QLVTXuLyPhuHieuPhuongTienImpl.class,
			qlvtXuLyPhuHieuPhuongTien.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<QLVTXuLyPhuHieuPhuongTien> qlvtXuLyPhuHieuPhuongTiens) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QLVTXuLyPhuHieuPhuongTien qlvtXuLyPhuHieuPhuongTien : qlvtXuLyPhuHieuPhuongTiens) {
			EntityCacheUtil.removeResult(QLVTXuLyPhuHieuPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
				QLVTXuLyPhuHieuPhuongTienImpl.class,
				qlvtXuLyPhuHieuPhuongTien.getPrimaryKey());
		}
	}

	/**
	 * Creates a new q l v t xu ly phu hieu phuong tien with the primary key. Does not add the q l v t xu ly phu hieu phuong tien to the database.
	 *
	 * @param id the primary key for the new q l v t xu ly phu hieu phuong tien
	 * @return the new q l v t xu ly phu hieu phuong tien
	 */
	@Override
	public QLVTXuLyPhuHieuPhuongTien create(int id) {
		QLVTXuLyPhuHieuPhuongTien qlvtXuLyPhuHieuPhuongTien = new QLVTXuLyPhuHieuPhuongTienImpl();

		qlvtXuLyPhuHieuPhuongTien.setNew(true);
		qlvtXuLyPhuHieuPhuongTien.setPrimaryKey(id);

		return qlvtXuLyPhuHieuPhuongTien;
	}

	/**
	 * Removes the q l v t xu ly phu hieu phuong tien with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the q l v t xu ly phu hieu phuong tien
	 * @return the q l v t xu ly phu hieu phuong tien that was removed
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuPhuongTienException if a q l v t xu ly phu hieu phuong tien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyPhuHieuPhuongTien remove(int id)
		throws NoSuchQLVTXuLyPhuHieuPhuongTienException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the q l v t xu ly phu hieu phuong tien with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the q l v t xu ly phu hieu phuong tien
	 * @return the q l v t xu ly phu hieu phuong tien that was removed
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuPhuongTienException if a q l v t xu ly phu hieu phuong tien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyPhuHieuPhuongTien remove(Serializable primaryKey)
		throws NoSuchQLVTXuLyPhuHieuPhuongTienException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QLVTXuLyPhuHieuPhuongTien qlvtXuLyPhuHieuPhuongTien = (QLVTXuLyPhuHieuPhuongTien)session.get(QLVTXuLyPhuHieuPhuongTienImpl.class,
					primaryKey);

			if (qlvtXuLyPhuHieuPhuongTien == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQLVTXuLyPhuHieuPhuongTienException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtXuLyPhuHieuPhuongTien);
		}
		catch (NoSuchQLVTXuLyPhuHieuPhuongTienException nsee) {
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
	protected QLVTXuLyPhuHieuPhuongTien removeImpl(
		QLVTXuLyPhuHieuPhuongTien qlvtXuLyPhuHieuPhuongTien)
		throws SystemException {
		qlvtXuLyPhuHieuPhuongTien = toUnwrappedModel(qlvtXuLyPhuHieuPhuongTien);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtXuLyPhuHieuPhuongTien)) {
				qlvtXuLyPhuHieuPhuongTien = (QLVTXuLyPhuHieuPhuongTien)session.get(QLVTXuLyPhuHieuPhuongTienImpl.class,
						qlvtXuLyPhuHieuPhuongTien.getPrimaryKeyObj());
			}

			if (qlvtXuLyPhuHieuPhuongTien != null) {
				session.delete(qlvtXuLyPhuHieuPhuongTien);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtXuLyPhuHieuPhuongTien != null) {
			clearCache(qlvtXuLyPhuHieuPhuongTien);
		}

		return qlvtXuLyPhuHieuPhuongTien;
	}

	@Override
	public QLVTXuLyPhuHieuPhuongTien updateImpl(
		vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTien qlvtXuLyPhuHieuPhuongTien)
		throws SystemException {
		qlvtXuLyPhuHieuPhuongTien = toUnwrappedModel(qlvtXuLyPhuHieuPhuongTien);

		boolean isNew = qlvtXuLyPhuHieuPhuongTien.isNew();

		QLVTXuLyPhuHieuPhuongTienModelImpl qlvtXuLyPhuHieuPhuongTienModelImpl = (QLVTXuLyPhuHieuPhuongTienModelImpl)qlvtXuLyPhuHieuPhuongTien;

		Session session = null;

		try {
			session = openSession();

			if (qlvtXuLyPhuHieuPhuongTien.isNew()) {
				session.save(qlvtXuLyPhuHieuPhuongTien);

				qlvtXuLyPhuHieuPhuongTien.setNew(false);
			}
			else {
				session.merge(qlvtXuLyPhuHieuPhuongTien);
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
				!QLVTXuLyPhuHieuPhuongTienModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((qlvtXuLyPhuHieuPhuongTienModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CAPPHUHIEUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						qlvtXuLyPhuHieuPhuongTienModelImpl.getOriginalCapPhuHieuID()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CAPPHUHIEUID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CAPPHUHIEUID,
					args);

				args = new Object[] {
						qlvtXuLyPhuHieuPhuongTienModelImpl.getCapPhuHieuID()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CAPPHUHIEUID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CAPPHUHIEUID,
					args);
			}
		}

		EntityCacheUtil.putResult(QLVTXuLyPhuHieuPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QLVTXuLyPhuHieuPhuongTienImpl.class,
			qlvtXuLyPhuHieuPhuongTien.getPrimaryKey(), qlvtXuLyPhuHieuPhuongTien);

		return qlvtXuLyPhuHieuPhuongTien;
	}

	protected QLVTXuLyPhuHieuPhuongTien toUnwrappedModel(
		QLVTXuLyPhuHieuPhuongTien qlvtXuLyPhuHieuPhuongTien) {
		if (qlvtXuLyPhuHieuPhuongTien instanceof QLVTXuLyPhuHieuPhuongTienImpl) {
			return qlvtXuLyPhuHieuPhuongTien;
		}

		QLVTXuLyPhuHieuPhuongTienImpl qlvtXuLyPhuHieuPhuongTienImpl = new QLVTXuLyPhuHieuPhuongTienImpl();

		qlvtXuLyPhuHieuPhuongTienImpl.setNew(qlvtXuLyPhuHieuPhuongTien.isNew());
		qlvtXuLyPhuHieuPhuongTienImpl.setPrimaryKey(qlvtXuLyPhuHieuPhuongTien.getPrimaryKey());

		qlvtXuLyPhuHieuPhuongTienImpl.setId(qlvtXuLyPhuHieuPhuongTien.getId());
		qlvtXuLyPhuHieuPhuongTienImpl.setCapPhuHieuID(qlvtXuLyPhuHieuPhuongTien.getCapPhuHieuID());
		qlvtXuLyPhuHieuPhuongTienImpl.setNhanHieu(qlvtXuLyPhuHieuPhuongTien.getNhanHieu());
		qlvtXuLyPhuHieuPhuongTienImpl.setBienSo(qlvtXuLyPhuHieuPhuongTien.getBienSo());
		qlvtXuLyPhuHieuPhuongTienImpl.setTrongTai(qlvtXuLyPhuHieuPhuongTien.getTrongTai());
		qlvtXuLyPhuHieuPhuongTienImpl.setSoChoNgoi(qlvtXuLyPhuHieuPhuongTien.getSoChoNgoi());
		qlvtXuLyPhuHieuPhuongTienImpl.setNoiSanXuat(qlvtXuLyPhuHieuPhuongTien.getNoiSanXuat());
		qlvtXuLyPhuHieuPhuongTienImpl.setNamSanXuat(qlvtXuLyPhuHieuPhuongTien.getNamSanXuat());
		qlvtXuLyPhuHieuPhuongTienImpl.setMaTuyenCoDinh(qlvtXuLyPhuHieuPhuongTien.getMaTuyenCoDinh());
		qlvtXuLyPhuHieuPhuongTienImpl.setLoaiTuyen(qlvtXuLyPhuHieuPhuongTien.getLoaiTuyen());
		qlvtXuLyPhuHieuPhuongTienImpl.setHinhThucSoHuuXe(qlvtXuLyPhuHieuPhuongTien.getHinhThucSoHuuXe());
		qlvtXuLyPhuHieuPhuongTienImpl.setLinhVucKinhDoanhXeDuLich(qlvtXuLyPhuHieuPhuongTien.getLinhVucKinhDoanhXeDuLich());
		qlvtXuLyPhuHieuPhuongTienImpl.setNienHanSuDungGiayDangKiem(qlvtXuLyPhuHieuPhuongTien.getNienHanSuDungGiayDangKiem());
		qlvtXuLyPhuHieuPhuongTienImpl.setNienHanSuDungND86(qlvtXuLyPhuHieuPhuongTien.getNienHanSuDungND86());
		qlvtXuLyPhuHieuPhuongTienImpl.setDoanhNghiepSoHuuThue(qlvtXuLyPhuHieuPhuongTien.getDoanhNghiepSoHuuThue());
		qlvtXuLyPhuHieuPhuongTienImpl.setThoiHanThue(qlvtXuLyPhuHieuPhuongTien.getThoiHanThue());
		qlvtXuLyPhuHieuPhuongTienImpl.setHopDongSauCung(qlvtXuLyPhuHieuPhuongTien.getHopDongSauCung());
		qlvtXuLyPhuHieuPhuongTienImpl.setKetQuaXuLy(qlvtXuLyPhuHieuPhuongTien.getKetQuaXuLy());
		qlvtXuLyPhuHieuPhuongTienImpl.setSoPhuHieuDuocCap(qlvtXuLyPhuHieuPhuongTien.getSoPhuHieuDuocCap());
		qlvtXuLyPhuHieuPhuongTienImpl.setThoiHanDuocCapPhep(qlvtXuLyPhuHieuPhuongTien.getThoiHanDuocCapPhep());
		qlvtXuLyPhuHieuPhuongTienImpl.setLoaiPhuHieuXinCap(qlvtXuLyPhuHieuPhuongTien.getLoaiPhuHieuXinCap());
		qlvtXuLyPhuHieuPhuongTienImpl.setLyDoKhongDat(qlvtXuLyPhuHieuPhuongTien.getLyDoKhongDat());
		qlvtXuLyPhuHieuPhuongTienImpl.setCoGiaTriDen(qlvtXuLyPhuHieuPhuongTien.getCoGiaTriDen());

		return qlvtXuLyPhuHieuPhuongTienImpl;
	}

	/**
	 * Returns the q l v t xu ly phu hieu phuong tien with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the q l v t xu ly phu hieu phuong tien
	 * @return the q l v t xu ly phu hieu phuong tien
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuPhuongTienException if a q l v t xu ly phu hieu phuong tien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyPhuHieuPhuongTien findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQLVTXuLyPhuHieuPhuongTienException, SystemException {
		QLVTXuLyPhuHieuPhuongTien qlvtXuLyPhuHieuPhuongTien = fetchByPrimaryKey(primaryKey);

		if (qlvtXuLyPhuHieuPhuongTien == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQLVTXuLyPhuHieuPhuongTienException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtXuLyPhuHieuPhuongTien;
	}

	/**
	 * Returns the q l v t xu ly phu hieu phuong tien with the primary key or throws a {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuPhuongTienException} if it could not be found.
	 *
	 * @param id the primary key of the q l v t xu ly phu hieu phuong tien
	 * @return the q l v t xu ly phu hieu phuong tien
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuPhuongTienException if a q l v t xu ly phu hieu phuong tien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyPhuHieuPhuongTien findByPrimaryKey(int id)
		throws NoSuchQLVTXuLyPhuHieuPhuongTienException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the q l v t xu ly phu hieu phuong tien with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the q l v t xu ly phu hieu phuong tien
	 * @return the q l v t xu ly phu hieu phuong tien, or <code>null</code> if a q l v t xu ly phu hieu phuong tien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyPhuHieuPhuongTien fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QLVTXuLyPhuHieuPhuongTien qlvtXuLyPhuHieuPhuongTien = (QLVTXuLyPhuHieuPhuongTien)EntityCacheUtil.getResult(QLVTXuLyPhuHieuPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
				QLVTXuLyPhuHieuPhuongTienImpl.class, primaryKey);

		if (qlvtXuLyPhuHieuPhuongTien == _nullQLVTXuLyPhuHieuPhuongTien) {
			return null;
		}

		if (qlvtXuLyPhuHieuPhuongTien == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtXuLyPhuHieuPhuongTien = (QLVTXuLyPhuHieuPhuongTien)session.get(QLVTXuLyPhuHieuPhuongTienImpl.class,
						primaryKey);

				if (qlvtXuLyPhuHieuPhuongTien != null) {
					cacheResult(qlvtXuLyPhuHieuPhuongTien);
				}
				else {
					EntityCacheUtil.putResult(QLVTXuLyPhuHieuPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
						QLVTXuLyPhuHieuPhuongTienImpl.class, primaryKey,
						_nullQLVTXuLyPhuHieuPhuongTien);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QLVTXuLyPhuHieuPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
					QLVTXuLyPhuHieuPhuongTienImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtXuLyPhuHieuPhuongTien;
	}

	/**
	 * Returns the q l v t xu ly phu hieu phuong tien with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the q l v t xu ly phu hieu phuong tien
	 * @return the q l v t xu ly phu hieu phuong tien, or <code>null</code> if a q l v t xu ly phu hieu phuong tien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyPhuHieuPhuongTien fetchByPrimaryKey(int id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the q l v t xu ly phu hieu phuong tiens.
	 *
	 * @return the q l v t xu ly phu hieu phuong tiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QLVTXuLyPhuHieuPhuongTien> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the q l v t xu ly phu hieu phuong tiens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyPhuHieuPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of q l v t xu ly phu hieu phuong tiens
	 * @param end the upper bound of the range of q l v t xu ly phu hieu phuong tiens (not inclusive)
	 * @return the range of q l v t xu ly phu hieu phuong tiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QLVTXuLyPhuHieuPhuongTien> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the q l v t xu ly phu hieu phuong tiens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyPhuHieuPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of q l v t xu ly phu hieu phuong tiens
	 * @param end the upper bound of the range of q l v t xu ly phu hieu phuong tiens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of q l v t xu ly phu hieu phuong tiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QLVTXuLyPhuHieuPhuongTien> findAll(int start, int end,
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

		List<QLVTXuLyPhuHieuPhuongTien> list = (List<QLVTXuLyPhuHieuPhuongTien>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTXULYPHUHIEUPHUONGTIEN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTXULYPHUHIEUPHUONGTIEN;

				if (pagination) {
					sql = sql.concat(QLVTXuLyPhuHieuPhuongTienModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QLVTXuLyPhuHieuPhuongTien>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QLVTXuLyPhuHieuPhuongTien>(list);
				}
				else {
					list = (List<QLVTXuLyPhuHieuPhuongTien>)QueryUtil.list(q,
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
	 * Removes all the q l v t xu ly phu hieu phuong tiens from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QLVTXuLyPhuHieuPhuongTien qlvtXuLyPhuHieuPhuongTien : findAll()) {
			remove(qlvtXuLyPhuHieuPhuongTien);
		}
	}

	/**
	 * Returns the number of q l v t xu ly phu hieu phuong tiens.
	 *
	 * @return the number of q l v t xu ly phu hieu phuong tiens
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

				Query q = session.createQuery(_SQL_COUNT_QLVTXULYPHUHIEUPHUONGTIEN);

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
	 * Initializes the q l v t xu ly phu hieu phuong tien persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTien")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QLVTXuLyPhuHieuPhuongTien>> listenersList = new ArrayList<ModelListener<QLVTXuLyPhuHieuPhuongTien>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QLVTXuLyPhuHieuPhuongTien>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QLVTXuLyPhuHieuPhuongTienImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTXULYPHUHIEUPHUONGTIEN = "SELECT qlvtXuLyPhuHieuPhuongTien FROM QLVTXuLyPhuHieuPhuongTien qlvtXuLyPhuHieuPhuongTien";
	private static final String _SQL_SELECT_QLVTXULYPHUHIEUPHUONGTIEN_WHERE = "SELECT qlvtXuLyPhuHieuPhuongTien FROM QLVTXuLyPhuHieuPhuongTien qlvtXuLyPhuHieuPhuongTien WHERE ";
	private static final String _SQL_COUNT_QLVTXULYPHUHIEUPHUONGTIEN = "SELECT COUNT(qlvtXuLyPhuHieuPhuongTien) FROM QLVTXuLyPhuHieuPhuongTien qlvtXuLyPhuHieuPhuongTien";
	private static final String _SQL_COUNT_QLVTXULYPHUHIEUPHUONGTIEN_WHERE = "SELECT COUNT(qlvtXuLyPhuHieuPhuongTien) FROM QLVTXuLyPhuHieuPhuongTien qlvtXuLyPhuHieuPhuongTien WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtXuLyPhuHieuPhuongTien.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QLVTXuLyPhuHieuPhuongTien exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No QLVTXuLyPhuHieuPhuongTien exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QLVTXuLyPhuHieuPhuongTienPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "capPhuHieuID", "nhanHieu", "bienSo", "trongTai",
				"soChoNgoi", "noiSanXuat", "namSanXuat", "maTuyenCoDinh",
				"loaiTuyen", "hinhThucSoHuuXe", "linhVucKinhDoanhXeDuLich",
				"nienHanSuDungGiayDangKiem", "nienHanSuDungND86",
				"doanhNghiepSoHuuThue", "thoiHanThue", "hopDongSauCung",
				"ketQuaXuLy", "soPhuHieuDuocCap", "thoiHanDuocCapPhep",
				"loaiPhuHieuXinCap", "lyDoKhongDat", "coGiaTriDen"
			});
	private static QLVTXuLyPhuHieuPhuongTien _nullQLVTXuLyPhuHieuPhuongTien = new QLVTXuLyPhuHieuPhuongTienImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QLVTXuLyPhuHieuPhuongTien> toCacheModel() {
				return _nullQLVTXuLyPhuHieuPhuongTienCacheModel;
			}
		};

	private static CacheModel<QLVTXuLyPhuHieuPhuongTien> _nullQLVTXuLyPhuHieuPhuongTienCacheModel =
		new CacheModel<QLVTXuLyPhuHieuPhuongTien>() {
			@Override
			public QLVTXuLyPhuHieuPhuongTien toEntityModel() {
				return _nullQLVTXuLyPhuHieuPhuongTien;
			}
		};
}