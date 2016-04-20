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

import vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyBienHieuPhuongTienException;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyBienHieuPhuongTienImpl;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyBienHieuPhuongTienModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the q l v t xu ly bien hieu phuong tien service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author binhta
 * @see QLVTXuLyBienHieuPhuongTienPersistence
 * @see QLVTXuLyBienHieuPhuongTienUtil
 * @generated
 */
public class QLVTXuLyBienHieuPhuongTienPersistenceImpl
	extends BasePersistenceImpl<QLVTXuLyBienHieuPhuongTien>
	implements QLVTXuLyBienHieuPhuongTienPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QLVTXuLyBienHieuPhuongTienUtil} to access the q l v t xu ly bien hieu phuong tien persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QLVTXuLyBienHieuPhuongTienImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QLVTXuLyBienHieuPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QLVTXuLyBienHieuPhuongTienModelImpl.FINDER_CACHE_ENABLED,
			QLVTXuLyBienHieuPhuongTienImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QLVTXuLyBienHieuPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QLVTXuLyBienHieuPhuongTienModelImpl.FINDER_CACHE_ENABLED,
			QLVTXuLyBienHieuPhuongTienImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QLVTXuLyBienHieuPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QLVTXuLyBienHieuPhuongTienModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CAPBIENHIEUID =
		new FinderPath(QLVTXuLyBienHieuPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QLVTXuLyBienHieuPhuongTienModelImpl.FINDER_CACHE_ENABLED,
			QLVTXuLyBienHieuPhuongTienImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycapBienHieuID",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CAPBIENHIEUID =
		new FinderPath(QLVTXuLyBienHieuPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QLVTXuLyBienHieuPhuongTienModelImpl.FINDER_CACHE_ENABLED,
			QLVTXuLyBienHieuPhuongTienImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycapBienHieuID",
			new String[] { Integer.class.getName() },
			QLVTXuLyBienHieuPhuongTienModelImpl.CAPBIENHIEUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CAPBIENHIEUID = new FinderPath(QLVTXuLyBienHieuPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QLVTXuLyBienHieuPhuongTienModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBycapBienHieuID", new String[] { Integer.class.getName() });

	/**
	 * Returns all the q l v t xu ly bien hieu phuong tiens where capBienHieuID = &#63;.
	 *
	 * @param capBienHieuID the cap bien hieu i d
	 * @return the matching q l v t xu ly bien hieu phuong tiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QLVTXuLyBienHieuPhuongTien> findBycapBienHieuID(
		int capBienHieuID) throws SystemException {
		return findBycapBienHieuID(capBienHieuID, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the q l v t xu ly bien hieu phuong tiens where capBienHieuID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyBienHieuPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param capBienHieuID the cap bien hieu i d
	 * @param start the lower bound of the range of q l v t xu ly bien hieu phuong tiens
	 * @param end the upper bound of the range of q l v t xu ly bien hieu phuong tiens (not inclusive)
	 * @return the range of matching q l v t xu ly bien hieu phuong tiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QLVTXuLyBienHieuPhuongTien> findBycapBienHieuID(
		int capBienHieuID, int start, int end) throws SystemException {
		return findBycapBienHieuID(capBienHieuID, start, end, null);
	}

	/**
	 * Returns an ordered range of all the q l v t xu ly bien hieu phuong tiens where capBienHieuID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyBienHieuPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param capBienHieuID the cap bien hieu i d
	 * @param start the lower bound of the range of q l v t xu ly bien hieu phuong tiens
	 * @param end the upper bound of the range of q l v t xu ly bien hieu phuong tiens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching q l v t xu ly bien hieu phuong tiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QLVTXuLyBienHieuPhuongTien> findBycapBienHieuID(
		int capBienHieuID, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CAPBIENHIEUID;
			finderArgs = new Object[] { capBienHieuID };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CAPBIENHIEUID;
			finderArgs = new Object[] {
					capBienHieuID,
					
					start, end, orderByComparator
				};
		}

		List<QLVTXuLyBienHieuPhuongTien> list = (List<QLVTXuLyBienHieuPhuongTien>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (QLVTXuLyBienHieuPhuongTien qlvtXuLyBienHieuPhuongTien : list) {
				if ((capBienHieuID != qlvtXuLyBienHieuPhuongTien.getCapBienHieuID())) {
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

			query.append(_SQL_SELECT_QLVTXULYBIENHIEUPHUONGTIEN_WHERE);

			query.append(_FINDER_COLUMN_CAPBIENHIEUID_CAPBIENHIEUID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(QLVTXuLyBienHieuPhuongTienModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(capBienHieuID);

				if (!pagination) {
					list = (List<QLVTXuLyBienHieuPhuongTien>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QLVTXuLyBienHieuPhuongTien>(list);
				}
				else {
					list = (List<QLVTXuLyBienHieuPhuongTien>)QueryUtil.list(q,
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
	 * Returns the first q l v t xu ly bien hieu phuong tien in the ordered set where capBienHieuID = &#63;.
	 *
	 * @param capBienHieuID the cap bien hieu i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching q l v t xu ly bien hieu phuong tien
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyBienHieuPhuongTienException if a matching q l v t xu ly bien hieu phuong tien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyBienHieuPhuongTien findBycapBienHieuID_First(
		int capBienHieuID, OrderByComparator orderByComparator)
		throws NoSuchQLVTXuLyBienHieuPhuongTienException, SystemException {
		QLVTXuLyBienHieuPhuongTien qlvtXuLyBienHieuPhuongTien = fetchBycapBienHieuID_First(capBienHieuID,
				orderByComparator);

		if (qlvtXuLyBienHieuPhuongTien != null) {
			return qlvtXuLyBienHieuPhuongTien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("capBienHieuID=");
		msg.append(capBienHieuID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchQLVTXuLyBienHieuPhuongTienException(msg.toString());
	}

	/**
	 * Returns the first q l v t xu ly bien hieu phuong tien in the ordered set where capBienHieuID = &#63;.
	 *
	 * @param capBienHieuID the cap bien hieu i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching q l v t xu ly bien hieu phuong tien, or <code>null</code> if a matching q l v t xu ly bien hieu phuong tien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyBienHieuPhuongTien fetchBycapBienHieuID_First(
		int capBienHieuID, OrderByComparator orderByComparator)
		throws SystemException {
		List<QLVTXuLyBienHieuPhuongTien> list = findBycapBienHieuID(capBienHieuID,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last q l v t xu ly bien hieu phuong tien in the ordered set where capBienHieuID = &#63;.
	 *
	 * @param capBienHieuID the cap bien hieu i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching q l v t xu ly bien hieu phuong tien
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyBienHieuPhuongTienException if a matching q l v t xu ly bien hieu phuong tien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyBienHieuPhuongTien findBycapBienHieuID_Last(
		int capBienHieuID, OrderByComparator orderByComparator)
		throws NoSuchQLVTXuLyBienHieuPhuongTienException, SystemException {
		QLVTXuLyBienHieuPhuongTien qlvtXuLyBienHieuPhuongTien = fetchBycapBienHieuID_Last(capBienHieuID,
				orderByComparator);

		if (qlvtXuLyBienHieuPhuongTien != null) {
			return qlvtXuLyBienHieuPhuongTien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("capBienHieuID=");
		msg.append(capBienHieuID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchQLVTXuLyBienHieuPhuongTienException(msg.toString());
	}

	/**
	 * Returns the last q l v t xu ly bien hieu phuong tien in the ordered set where capBienHieuID = &#63;.
	 *
	 * @param capBienHieuID the cap bien hieu i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching q l v t xu ly bien hieu phuong tien, or <code>null</code> if a matching q l v t xu ly bien hieu phuong tien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyBienHieuPhuongTien fetchBycapBienHieuID_Last(
		int capBienHieuID, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBycapBienHieuID(capBienHieuID);

		if (count == 0) {
			return null;
		}

		List<QLVTXuLyBienHieuPhuongTien> list = findBycapBienHieuID(capBienHieuID,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the q l v t xu ly bien hieu phuong tiens before and after the current q l v t xu ly bien hieu phuong tien in the ordered set where capBienHieuID = &#63;.
	 *
	 * @param id the primary key of the current q l v t xu ly bien hieu phuong tien
	 * @param capBienHieuID the cap bien hieu i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next q l v t xu ly bien hieu phuong tien
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyBienHieuPhuongTienException if a q l v t xu ly bien hieu phuong tien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyBienHieuPhuongTien[] findBycapBienHieuID_PrevAndNext(
		int id, int capBienHieuID, OrderByComparator orderByComparator)
		throws NoSuchQLVTXuLyBienHieuPhuongTienException, SystemException {
		QLVTXuLyBienHieuPhuongTien qlvtXuLyBienHieuPhuongTien = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			QLVTXuLyBienHieuPhuongTien[] array = new QLVTXuLyBienHieuPhuongTienImpl[3];

			array[0] = getBycapBienHieuID_PrevAndNext(session,
					qlvtXuLyBienHieuPhuongTien, capBienHieuID,
					orderByComparator, true);

			array[1] = qlvtXuLyBienHieuPhuongTien;

			array[2] = getBycapBienHieuID_PrevAndNext(session,
					qlvtXuLyBienHieuPhuongTien, capBienHieuID,
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

	protected QLVTXuLyBienHieuPhuongTien getBycapBienHieuID_PrevAndNext(
		Session session, QLVTXuLyBienHieuPhuongTien qlvtXuLyBienHieuPhuongTien,
		int capBienHieuID, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_QLVTXULYBIENHIEUPHUONGTIEN_WHERE);

		query.append(_FINDER_COLUMN_CAPBIENHIEUID_CAPBIENHIEUID_2);

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
			query.append(QLVTXuLyBienHieuPhuongTienModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(capBienHieuID);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(qlvtXuLyBienHieuPhuongTien);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<QLVTXuLyBienHieuPhuongTien> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the q l v t xu ly bien hieu phuong tiens where capBienHieuID = &#63; from the database.
	 *
	 * @param capBienHieuID the cap bien hieu i d
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBycapBienHieuID(int capBienHieuID)
		throws SystemException {
		for (QLVTXuLyBienHieuPhuongTien qlvtXuLyBienHieuPhuongTien : findBycapBienHieuID(
				capBienHieuID, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(qlvtXuLyBienHieuPhuongTien);
		}
	}

	/**
	 * Returns the number of q l v t xu ly bien hieu phuong tiens where capBienHieuID = &#63;.
	 *
	 * @param capBienHieuID the cap bien hieu i d
	 * @return the number of matching q l v t xu ly bien hieu phuong tiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBycapBienHieuID(int capBienHieuID)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CAPBIENHIEUID;

		Object[] finderArgs = new Object[] { capBienHieuID };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_QLVTXULYBIENHIEUPHUONGTIEN_WHERE);

			query.append(_FINDER_COLUMN_CAPBIENHIEUID_CAPBIENHIEUID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(capBienHieuID);

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

	private static final String _FINDER_COLUMN_CAPBIENHIEUID_CAPBIENHIEUID_2 = "qlvtXuLyBienHieuPhuongTien.capBienHieuID = ?";

	public QLVTXuLyBienHieuPhuongTienPersistenceImpl() {
		setModelClass(QLVTXuLyBienHieuPhuongTien.class);
	}

	/**
	 * Caches the q l v t xu ly bien hieu phuong tien in the entity cache if it is enabled.
	 *
	 * @param qlvtXuLyBienHieuPhuongTien the q l v t xu ly bien hieu phuong tien
	 */
	@Override
	public void cacheResult(
		QLVTXuLyBienHieuPhuongTien qlvtXuLyBienHieuPhuongTien) {
		EntityCacheUtil.putResult(QLVTXuLyBienHieuPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QLVTXuLyBienHieuPhuongTienImpl.class,
			qlvtXuLyBienHieuPhuongTien.getPrimaryKey(),
			qlvtXuLyBienHieuPhuongTien);

		qlvtXuLyBienHieuPhuongTien.resetOriginalValues();
	}

	/**
	 * Caches the q l v t xu ly bien hieu phuong tiens in the entity cache if it is enabled.
	 *
	 * @param qlvtXuLyBienHieuPhuongTiens the q l v t xu ly bien hieu phuong tiens
	 */
	@Override
	public void cacheResult(
		List<QLVTXuLyBienHieuPhuongTien> qlvtXuLyBienHieuPhuongTiens) {
		for (QLVTXuLyBienHieuPhuongTien qlvtXuLyBienHieuPhuongTien : qlvtXuLyBienHieuPhuongTiens) {
			if (EntityCacheUtil.getResult(
						QLVTXuLyBienHieuPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
						QLVTXuLyBienHieuPhuongTienImpl.class,
						qlvtXuLyBienHieuPhuongTien.getPrimaryKey()) == null) {
				cacheResult(qlvtXuLyBienHieuPhuongTien);
			}
			else {
				qlvtXuLyBienHieuPhuongTien.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all q l v t xu ly bien hieu phuong tiens.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QLVTXuLyBienHieuPhuongTienImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QLVTXuLyBienHieuPhuongTienImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the q l v t xu ly bien hieu phuong tien.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		QLVTXuLyBienHieuPhuongTien qlvtXuLyBienHieuPhuongTien) {
		EntityCacheUtil.removeResult(QLVTXuLyBienHieuPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QLVTXuLyBienHieuPhuongTienImpl.class,
			qlvtXuLyBienHieuPhuongTien.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<QLVTXuLyBienHieuPhuongTien> qlvtXuLyBienHieuPhuongTiens) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QLVTXuLyBienHieuPhuongTien qlvtXuLyBienHieuPhuongTien : qlvtXuLyBienHieuPhuongTiens) {
			EntityCacheUtil.removeResult(QLVTXuLyBienHieuPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
				QLVTXuLyBienHieuPhuongTienImpl.class,
				qlvtXuLyBienHieuPhuongTien.getPrimaryKey());
		}
	}

	/**
	 * Creates a new q l v t xu ly bien hieu phuong tien with the primary key. Does not add the q l v t xu ly bien hieu phuong tien to the database.
	 *
	 * @param id the primary key for the new q l v t xu ly bien hieu phuong tien
	 * @return the new q l v t xu ly bien hieu phuong tien
	 */
	@Override
	public QLVTXuLyBienHieuPhuongTien create(int id) {
		QLVTXuLyBienHieuPhuongTien qlvtXuLyBienHieuPhuongTien = new QLVTXuLyBienHieuPhuongTienImpl();

		qlvtXuLyBienHieuPhuongTien.setNew(true);
		qlvtXuLyBienHieuPhuongTien.setPrimaryKey(id);

		return qlvtXuLyBienHieuPhuongTien;
	}

	/**
	 * Removes the q l v t xu ly bien hieu phuong tien with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the q l v t xu ly bien hieu phuong tien
	 * @return the q l v t xu ly bien hieu phuong tien that was removed
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyBienHieuPhuongTienException if a q l v t xu ly bien hieu phuong tien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyBienHieuPhuongTien remove(int id)
		throws NoSuchQLVTXuLyBienHieuPhuongTienException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the q l v t xu ly bien hieu phuong tien with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the q l v t xu ly bien hieu phuong tien
	 * @return the q l v t xu ly bien hieu phuong tien that was removed
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyBienHieuPhuongTienException if a q l v t xu ly bien hieu phuong tien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyBienHieuPhuongTien remove(Serializable primaryKey)
		throws NoSuchQLVTXuLyBienHieuPhuongTienException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QLVTXuLyBienHieuPhuongTien qlvtXuLyBienHieuPhuongTien = (QLVTXuLyBienHieuPhuongTien)session.get(QLVTXuLyBienHieuPhuongTienImpl.class,
					primaryKey);

			if (qlvtXuLyBienHieuPhuongTien == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQLVTXuLyBienHieuPhuongTienException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtXuLyBienHieuPhuongTien);
		}
		catch (NoSuchQLVTXuLyBienHieuPhuongTienException nsee) {
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
	protected QLVTXuLyBienHieuPhuongTien removeImpl(
		QLVTXuLyBienHieuPhuongTien qlvtXuLyBienHieuPhuongTien)
		throws SystemException {
		qlvtXuLyBienHieuPhuongTien = toUnwrappedModel(qlvtXuLyBienHieuPhuongTien);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtXuLyBienHieuPhuongTien)) {
				qlvtXuLyBienHieuPhuongTien = (QLVTXuLyBienHieuPhuongTien)session.get(QLVTXuLyBienHieuPhuongTienImpl.class,
						qlvtXuLyBienHieuPhuongTien.getPrimaryKeyObj());
			}

			if (qlvtXuLyBienHieuPhuongTien != null) {
				session.delete(qlvtXuLyBienHieuPhuongTien);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtXuLyBienHieuPhuongTien != null) {
			clearCache(qlvtXuLyBienHieuPhuongTien);
		}

		return qlvtXuLyBienHieuPhuongTien;
	}

	@Override
	public QLVTXuLyBienHieuPhuongTien updateImpl(
		vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien qlvtXuLyBienHieuPhuongTien)
		throws SystemException {
		qlvtXuLyBienHieuPhuongTien = toUnwrappedModel(qlvtXuLyBienHieuPhuongTien);

		boolean isNew = qlvtXuLyBienHieuPhuongTien.isNew();

		QLVTXuLyBienHieuPhuongTienModelImpl qlvtXuLyBienHieuPhuongTienModelImpl = (QLVTXuLyBienHieuPhuongTienModelImpl)qlvtXuLyBienHieuPhuongTien;

		Session session = null;

		try {
			session = openSession();

			if (qlvtXuLyBienHieuPhuongTien.isNew()) {
				session.save(qlvtXuLyBienHieuPhuongTien);

				qlvtXuLyBienHieuPhuongTien.setNew(false);
			}
			else {
				session.merge(qlvtXuLyBienHieuPhuongTien);
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
				!QLVTXuLyBienHieuPhuongTienModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((qlvtXuLyBienHieuPhuongTienModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CAPBIENHIEUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						qlvtXuLyBienHieuPhuongTienModelImpl.getOriginalCapBienHieuID()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CAPBIENHIEUID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CAPBIENHIEUID,
					args);

				args = new Object[] {
						qlvtXuLyBienHieuPhuongTienModelImpl.getCapBienHieuID()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CAPBIENHIEUID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CAPBIENHIEUID,
					args);
			}
		}

		EntityCacheUtil.putResult(QLVTXuLyBienHieuPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QLVTXuLyBienHieuPhuongTienImpl.class,
			qlvtXuLyBienHieuPhuongTien.getPrimaryKey(),
			qlvtXuLyBienHieuPhuongTien);

		return qlvtXuLyBienHieuPhuongTien;
	}

	protected QLVTXuLyBienHieuPhuongTien toUnwrappedModel(
		QLVTXuLyBienHieuPhuongTien qlvtXuLyBienHieuPhuongTien) {
		if (qlvtXuLyBienHieuPhuongTien instanceof QLVTXuLyBienHieuPhuongTienImpl) {
			return qlvtXuLyBienHieuPhuongTien;
		}

		QLVTXuLyBienHieuPhuongTienImpl qlvtXuLyBienHieuPhuongTienImpl = new QLVTXuLyBienHieuPhuongTienImpl();

		qlvtXuLyBienHieuPhuongTienImpl.setNew(qlvtXuLyBienHieuPhuongTien.isNew());
		qlvtXuLyBienHieuPhuongTienImpl.setPrimaryKey(qlvtXuLyBienHieuPhuongTien.getPrimaryKey());

		qlvtXuLyBienHieuPhuongTienImpl.setId(qlvtXuLyBienHieuPhuongTien.getId());
		qlvtXuLyBienHieuPhuongTienImpl.setCapBienHieuID(qlvtXuLyBienHieuPhuongTien.getCapBienHieuID());
		qlvtXuLyBienHieuPhuongTienImpl.setNhanHieu(qlvtXuLyBienHieuPhuongTien.getNhanHieu());
		qlvtXuLyBienHieuPhuongTienImpl.setBienSo(qlvtXuLyBienHieuPhuongTien.getBienSo());
		qlvtXuLyBienHieuPhuongTienImpl.setSoKhung(qlvtXuLyBienHieuPhuongTien.getSoKhung());
		qlvtXuLyBienHieuPhuongTienImpl.setSoMay(qlvtXuLyBienHieuPhuongTien.getSoMay());
		qlvtXuLyBienHieuPhuongTienImpl.setNamSx(qlvtXuLyBienHieuPhuongTien.getNamSx());
		qlvtXuLyBienHieuPhuongTienImpl.setMauSon(qlvtXuLyBienHieuPhuongTien.getMauSon());
		qlvtXuLyBienHieuPhuongTienImpl.setTrongTai(qlvtXuLyBienHieuPhuongTien.getTrongTai());
		qlvtXuLyBienHieuPhuongTienImpl.setSoChoNgoi(qlvtXuLyBienHieuPhuongTien.getSoChoNgoi());
		qlvtXuLyBienHieuPhuongTienImpl.setHinhThucSoHuuXe(qlvtXuLyBienHieuPhuongTien.getHinhThucSoHuuXe());
		qlvtXuLyBienHieuPhuongTienImpl.setLinhVucKinhDoanhXeDuLich(qlvtXuLyBienHieuPhuongTien.getLinhVucKinhDoanhXeDuLich());
		qlvtXuLyBienHieuPhuongTienImpl.setNienHanSuDungGiayDangKiem(qlvtXuLyBienHieuPhuongTien.getNienHanSuDungGiayDangKiem());
		qlvtXuLyBienHieuPhuongTienImpl.setNienHanSuDungND86(qlvtXuLyBienHieuPhuongTien.getNienHanSuDungND86());
		qlvtXuLyBienHieuPhuongTienImpl.setDoanhNghiepSoHuuThue(qlvtXuLyBienHieuPhuongTien.getDoanhNghiepSoHuuThue());
		qlvtXuLyBienHieuPhuongTienImpl.setThoiHanThue(qlvtXuLyBienHieuPhuongTien.getThoiHanThue());
		qlvtXuLyBienHieuPhuongTienImpl.setHopDongSauCung(qlvtXuLyBienHieuPhuongTien.getHopDongSauCung());
		qlvtXuLyBienHieuPhuongTienImpl.setKetQuaXuLy(qlvtXuLyBienHieuPhuongTien.getKetQuaXuLy());
		qlvtXuLyBienHieuPhuongTienImpl.setSoPhuHieuDuocCap(qlvtXuLyBienHieuPhuongTien.getSoPhuHieuDuocCap());
		qlvtXuLyBienHieuPhuongTienImpl.setThoiHanDuocCapPhep(qlvtXuLyBienHieuPhuongTien.getThoiHanDuocCapPhep());
		qlvtXuLyBienHieuPhuongTienImpl.setLyDoKhongDat(qlvtXuLyBienHieuPhuongTien.getLyDoKhongDat());
		qlvtXuLyBienHieuPhuongTienImpl.setSoA(qlvtXuLyBienHieuPhuongTien.getSoA());
		qlvtXuLyBienHieuPhuongTienImpl.setSoB(qlvtXuLyBienHieuPhuongTien.getSoB());
		qlvtXuLyBienHieuPhuongTienImpl.setCoGiaTriDen(qlvtXuLyBienHieuPhuongTien.getCoGiaTriDen());

		return qlvtXuLyBienHieuPhuongTienImpl;
	}

	/**
	 * Returns the q l v t xu ly bien hieu phuong tien with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the q l v t xu ly bien hieu phuong tien
	 * @return the q l v t xu ly bien hieu phuong tien
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyBienHieuPhuongTienException if a q l v t xu ly bien hieu phuong tien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyBienHieuPhuongTien findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQLVTXuLyBienHieuPhuongTienException, SystemException {
		QLVTXuLyBienHieuPhuongTien qlvtXuLyBienHieuPhuongTien = fetchByPrimaryKey(primaryKey);

		if (qlvtXuLyBienHieuPhuongTien == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQLVTXuLyBienHieuPhuongTienException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtXuLyBienHieuPhuongTien;
	}

	/**
	 * Returns the q l v t xu ly bien hieu phuong tien with the primary key or throws a {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyBienHieuPhuongTienException} if it could not be found.
	 *
	 * @param id the primary key of the q l v t xu ly bien hieu phuong tien
	 * @return the q l v t xu ly bien hieu phuong tien
	 * @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyBienHieuPhuongTienException if a q l v t xu ly bien hieu phuong tien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyBienHieuPhuongTien findByPrimaryKey(int id)
		throws NoSuchQLVTXuLyBienHieuPhuongTienException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the q l v t xu ly bien hieu phuong tien with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the q l v t xu ly bien hieu phuong tien
	 * @return the q l v t xu ly bien hieu phuong tien, or <code>null</code> if a q l v t xu ly bien hieu phuong tien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyBienHieuPhuongTien fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QLVTXuLyBienHieuPhuongTien qlvtXuLyBienHieuPhuongTien = (QLVTXuLyBienHieuPhuongTien)EntityCacheUtil.getResult(QLVTXuLyBienHieuPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
				QLVTXuLyBienHieuPhuongTienImpl.class, primaryKey);

		if (qlvtXuLyBienHieuPhuongTien == _nullQLVTXuLyBienHieuPhuongTien) {
			return null;
		}

		if (qlvtXuLyBienHieuPhuongTien == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtXuLyBienHieuPhuongTien = (QLVTXuLyBienHieuPhuongTien)session.get(QLVTXuLyBienHieuPhuongTienImpl.class,
						primaryKey);

				if (qlvtXuLyBienHieuPhuongTien != null) {
					cacheResult(qlvtXuLyBienHieuPhuongTien);
				}
				else {
					EntityCacheUtil.putResult(QLVTXuLyBienHieuPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
						QLVTXuLyBienHieuPhuongTienImpl.class, primaryKey,
						_nullQLVTXuLyBienHieuPhuongTien);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QLVTXuLyBienHieuPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
					QLVTXuLyBienHieuPhuongTienImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtXuLyBienHieuPhuongTien;
	}

	/**
	 * Returns the q l v t xu ly bien hieu phuong tien with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the q l v t xu ly bien hieu phuong tien
	 * @return the q l v t xu ly bien hieu phuong tien, or <code>null</code> if a q l v t xu ly bien hieu phuong tien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QLVTXuLyBienHieuPhuongTien fetchByPrimaryKey(int id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the q l v t xu ly bien hieu phuong tiens.
	 *
	 * @return the q l v t xu ly bien hieu phuong tiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QLVTXuLyBienHieuPhuongTien> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the q l v t xu ly bien hieu phuong tiens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyBienHieuPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of q l v t xu ly bien hieu phuong tiens
	 * @param end the upper bound of the range of q l v t xu ly bien hieu phuong tiens (not inclusive)
	 * @return the range of q l v t xu ly bien hieu phuong tiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QLVTXuLyBienHieuPhuongTien> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the q l v t xu ly bien hieu phuong tiens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyBienHieuPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of q l v t xu ly bien hieu phuong tiens
	 * @param end the upper bound of the range of q l v t xu ly bien hieu phuong tiens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of q l v t xu ly bien hieu phuong tiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QLVTXuLyBienHieuPhuongTien> findAll(int start, int end,
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

		List<QLVTXuLyBienHieuPhuongTien> list = (List<QLVTXuLyBienHieuPhuongTien>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTXULYBIENHIEUPHUONGTIEN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTXULYBIENHIEUPHUONGTIEN;

				if (pagination) {
					sql = sql.concat(QLVTXuLyBienHieuPhuongTienModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QLVTXuLyBienHieuPhuongTien>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QLVTXuLyBienHieuPhuongTien>(list);
				}
				else {
					list = (List<QLVTXuLyBienHieuPhuongTien>)QueryUtil.list(q,
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
	 * Removes all the q l v t xu ly bien hieu phuong tiens from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QLVTXuLyBienHieuPhuongTien qlvtXuLyBienHieuPhuongTien : findAll()) {
			remove(qlvtXuLyBienHieuPhuongTien);
		}
	}

	/**
	 * Returns the number of q l v t xu ly bien hieu phuong tiens.
	 *
	 * @return the number of q l v t xu ly bien hieu phuong tiens
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

				Query q = session.createQuery(_SQL_COUNT_QLVTXULYBIENHIEUPHUONGTIEN);

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
	 * Initializes the q l v t xu ly bien hieu phuong tien persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyBienHieuPhuongTien")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QLVTXuLyBienHieuPhuongTien>> listenersList = new ArrayList<ModelListener<QLVTXuLyBienHieuPhuongTien>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QLVTXuLyBienHieuPhuongTien>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QLVTXuLyBienHieuPhuongTienImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTXULYBIENHIEUPHUONGTIEN = "SELECT qlvtXuLyBienHieuPhuongTien FROM QLVTXuLyBienHieuPhuongTien qlvtXuLyBienHieuPhuongTien";
	private static final String _SQL_SELECT_QLVTXULYBIENHIEUPHUONGTIEN_WHERE = "SELECT qlvtXuLyBienHieuPhuongTien FROM QLVTXuLyBienHieuPhuongTien qlvtXuLyBienHieuPhuongTien WHERE ";
	private static final String _SQL_COUNT_QLVTXULYBIENHIEUPHUONGTIEN = "SELECT COUNT(qlvtXuLyBienHieuPhuongTien) FROM QLVTXuLyBienHieuPhuongTien qlvtXuLyBienHieuPhuongTien";
	private static final String _SQL_COUNT_QLVTXULYBIENHIEUPHUONGTIEN_WHERE = "SELECT COUNT(qlvtXuLyBienHieuPhuongTien) FROM QLVTXuLyBienHieuPhuongTien qlvtXuLyBienHieuPhuongTien WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtXuLyBienHieuPhuongTien.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QLVTXuLyBienHieuPhuongTien exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No QLVTXuLyBienHieuPhuongTien exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QLVTXuLyBienHieuPhuongTienPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "capBienHieuID", "nhanHieu", "bienSo", "soKhung", "soMay",
				"namSx", "mauSon", "trongTai", "soChoNgoi", "hinhThucSoHuuXe",
				"linhVucKinhDoanhXeDuLich", "nienHanSuDungGiayDangKiem",
				"nienHanSuDungND86", "doanhNghiepSoHuuThue", "thoiHanThue",
				"hopDongSauCung", "ketQuaXuLy", "soPhuHieuDuocCap",
				"thoiHanDuocCapPhep", "lyDoKhongDat"
			});
	private static QLVTXuLyBienHieuPhuongTien _nullQLVTXuLyBienHieuPhuongTien = new QLVTXuLyBienHieuPhuongTienImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QLVTXuLyBienHieuPhuongTien> toCacheModel() {
				return _nullQLVTXuLyBienHieuPhuongTienCacheModel;
			}
		};

	private static CacheModel<QLVTXuLyBienHieuPhuongTien> _nullQLVTXuLyBienHieuPhuongTienCacheModel =
		new CacheModel<QLVTXuLyBienHieuPhuongTien>() {
			@Override
			public QLVTXuLyBienHieuPhuongTien toEntityModel() {
				return _nullQLVTXuLyBienHieuPhuongTien;
			}
		};
}