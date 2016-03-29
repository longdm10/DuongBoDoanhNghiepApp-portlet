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

package vn.dtt.duongbo.dao.lienvan.service.persistence;

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

import vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienException;
import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTien;
import vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanPhuongTienImpl;
import vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanPhuongTienModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the qlvt xu ly gp lien van phuong tien service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanNc
 * @see QlvtXuLyGpLienVanPhuongTienPersistence
 * @see QlvtXuLyGpLienVanPhuongTienUtil
 * @generated
 */
public class QlvtXuLyGpLienVanPhuongTienPersistenceImpl
	extends BasePersistenceImpl<QlvtXuLyGpLienVanPhuongTien>
	implements QlvtXuLyGpLienVanPhuongTienPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QlvtXuLyGpLienVanPhuongTienUtil} to access the qlvt xu ly gp lien van phuong tien persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QlvtXuLyGpLienVanPhuongTienImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QlvtXuLyGpLienVanPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanPhuongTienModelImpl.FINDER_CACHE_ENABLED,
			QlvtXuLyGpLienVanPhuongTienImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QlvtXuLyGpLienVanPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanPhuongTienModelImpl.FINDER_CACHE_ENABLED,
			QlvtXuLyGpLienVanPhuongTienImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QlvtXuLyGpLienVanPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanPhuongTienModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CAPGPLVID =
		new FinderPath(QlvtXuLyGpLienVanPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanPhuongTienModelImpl.FINDER_CACHE_ENABLED,
			QlvtXuLyGpLienVanPhuongTienImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycapGplvId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CAPGPLVID =
		new FinderPath(QlvtXuLyGpLienVanPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanPhuongTienModelImpl.FINDER_CACHE_ENABLED,
			QlvtXuLyGpLienVanPhuongTienImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycapGplvId",
			new String[] { Long.class.getName() },
			QlvtXuLyGpLienVanPhuongTienModelImpl.CAPGPLVID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CAPGPLVID = new FinderPath(QlvtXuLyGpLienVanPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanPhuongTienModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBycapGplvId", new String[] { Long.class.getName() });

	/**
	 * Returns all the qlvt xu ly gp lien van phuong tiens where capGplvId = &#63;.
	 *
	 * @param capGplvId the cap gplv ID
	 * @return the matching qlvt xu ly gp lien van phuong tiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpLienVanPhuongTien> findBycapGplvId(long capGplvId)
		throws SystemException {
		return findBycapGplvId(capGplvId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the qlvt xu ly gp lien van phuong tiens where capGplvId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param capGplvId the cap gplv ID
	 * @param start the lower bound of the range of qlvt xu ly gp lien van phuong tiens
	 * @param end the upper bound of the range of qlvt xu ly gp lien van phuong tiens (not inclusive)
	 * @return the range of matching qlvt xu ly gp lien van phuong tiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpLienVanPhuongTien> findBycapGplvId(long capGplvId,
		int start, int end) throws SystemException {
		return findBycapGplvId(capGplvId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt xu ly gp lien van phuong tiens where capGplvId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param capGplvId the cap gplv ID
	 * @param start the lower bound of the range of qlvt xu ly gp lien van phuong tiens
	 * @param end the upper bound of the range of qlvt xu ly gp lien van phuong tiens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching qlvt xu ly gp lien van phuong tiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpLienVanPhuongTien> findBycapGplvId(long capGplvId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CAPGPLVID;
			finderArgs = new Object[] { capGplvId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CAPGPLVID;
			finderArgs = new Object[] { capGplvId, start, end, orderByComparator };
		}

		List<QlvtXuLyGpLienVanPhuongTien> list = (List<QlvtXuLyGpLienVanPhuongTien>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien : list) {
				if ((capGplvId != qlvtXuLyGpLienVanPhuongTien.getCapGplvId())) {
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

			query.append(_SQL_SELECT_QLVTXULYGPLIENVANPHUONGTIEN_WHERE);

			query.append(_FINDER_COLUMN_CAPGPLVID_CAPGPLVID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(QlvtXuLyGpLienVanPhuongTienModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(capGplvId);

				if (!pagination) {
					list = (List<QlvtXuLyGpLienVanPhuongTien>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtXuLyGpLienVanPhuongTien>(list);
				}
				else {
					list = (List<QlvtXuLyGpLienVanPhuongTien>)QueryUtil.list(q,
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
	 * Returns the first qlvt xu ly gp lien van phuong tien in the ordered set where capGplvId = &#63;.
	 *
	 * @param capGplvId the cap gplv ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qlvt xu ly gp lien van phuong tien
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienException if a matching qlvt xu ly gp lien van phuong tien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanPhuongTien findBycapGplvId_First(long capGplvId,
		OrderByComparator orderByComparator)
		throws NoSuchQlvtXuLyGpLienVanPhuongTienException, SystemException {
		QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien = fetchBycapGplvId_First(capGplvId,
				orderByComparator);

		if (qlvtXuLyGpLienVanPhuongTien != null) {
			return qlvtXuLyGpLienVanPhuongTien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("capGplvId=");
		msg.append(capGplvId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchQlvtXuLyGpLienVanPhuongTienException(msg.toString());
	}

	/**
	 * Returns the first qlvt xu ly gp lien van phuong tien in the ordered set where capGplvId = &#63;.
	 *
	 * @param capGplvId the cap gplv ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qlvt xu ly gp lien van phuong tien, or <code>null</code> if a matching qlvt xu ly gp lien van phuong tien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanPhuongTien fetchBycapGplvId_First(long capGplvId,
		OrderByComparator orderByComparator) throws SystemException {
		List<QlvtXuLyGpLienVanPhuongTien> list = findBycapGplvId(capGplvId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last qlvt xu ly gp lien van phuong tien in the ordered set where capGplvId = &#63;.
	 *
	 * @param capGplvId the cap gplv ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qlvt xu ly gp lien van phuong tien
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienException if a matching qlvt xu ly gp lien van phuong tien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanPhuongTien findBycapGplvId_Last(long capGplvId,
		OrderByComparator orderByComparator)
		throws NoSuchQlvtXuLyGpLienVanPhuongTienException, SystemException {
		QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien = fetchBycapGplvId_Last(capGplvId,
				orderByComparator);

		if (qlvtXuLyGpLienVanPhuongTien != null) {
			return qlvtXuLyGpLienVanPhuongTien;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("capGplvId=");
		msg.append(capGplvId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchQlvtXuLyGpLienVanPhuongTienException(msg.toString());
	}

	/**
	 * Returns the last qlvt xu ly gp lien van phuong tien in the ordered set where capGplvId = &#63;.
	 *
	 * @param capGplvId the cap gplv ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qlvt xu ly gp lien van phuong tien, or <code>null</code> if a matching qlvt xu ly gp lien van phuong tien could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanPhuongTien fetchBycapGplvId_Last(long capGplvId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBycapGplvId(capGplvId);

		if (count == 0) {
			return null;
		}

		List<QlvtXuLyGpLienVanPhuongTien> list = findBycapGplvId(capGplvId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the qlvt xu ly gp lien van phuong tiens before and after the current qlvt xu ly gp lien van phuong tien in the ordered set where capGplvId = &#63;.
	 *
	 * @param id the primary key of the current qlvt xu ly gp lien van phuong tien
	 * @param capGplvId the cap gplv ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next qlvt xu ly gp lien van phuong tien
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienException if a qlvt xu ly gp lien van phuong tien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanPhuongTien[] findBycapGplvId_PrevAndNext(long id,
		long capGplvId, OrderByComparator orderByComparator)
		throws NoSuchQlvtXuLyGpLienVanPhuongTienException, SystemException {
		QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			QlvtXuLyGpLienVanPhuongTien[] array = new QlvtXuLyGpLienVanPhuongTienImpl[3];

			array[0] = getBycapGplvId_PrevAndNext(session,
					qlvtXuLyGpLienVanPhuongTien, capGplvId, orderByComparator,
					true);

			array[1] = qlvtXuLyGpLienVanPhuongTien;

			array[2] = getBycapGplvId_PrevAndNext(session,
					qlvtXuLyGpLienVanPhuongTien, capGplvId, orderByComparator,
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

	protected QlvtXuLyGpLienVanPhuongTien getBycapGplvId_PrevAndNext(
		Session session,
		QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien,
		long capGplvId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_QLVTXULYGPLIENVANPHUONGTIEN_WHERE);

		query.append(_FINDER_COLUMN_CAPGPLVID_CAPGPLVID_2);

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
			query.append(QlvtXuLyGpLienVanPhuongTienModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(capGplvId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(qlvtXuLyGpLienVanPhuongTien);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<QlvtXuLyGpLienVanPhuongTien> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the qlvt xu ly gp lien van phuong tiens where capGplvId = &#63; from the database.
	 *
	 * @param capGplvId the cap gplv ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBycapGplvId(long capGplvId) throws SystemException {
		for (QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien : findBycapGplvId(
				capGplvId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(qlvtXuLyGpLienVanPhuongTien);
		}
	}

	/**
	 * Returns the number of qlvt xu ly gp lien van phuong tiens where capGplvId = &#63;.
	 *
	 * @param capGplvId the cap gplv ID
	 * @return the number of matching qlvt xu ly gp lien van phuong tiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBycapGplvId(long capGplvId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CAPGPLVID;

		Object[] finderArgs = new Object[] { capGplvId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_QLVTXULYGPLIENVANPHUONGTIEN_WHERE);

			query.append(_FINDER_COLUMN_CAPGPLVID_CAPGPLVID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(capGplvId);

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

	private static final String _FINDER_COLUMN_CAPGPLVID_CAPGPLVID_2 = "qlvtXuLyGpLienVanPhuongTien.capGplvId = ?";

	public QlvtXuLyGpLienVanPhuongTienPersistenceImpl() {
		setModelClass(QlvtXuLyGpLienVanPhuongTien.class);
	}

	/**
	 * Caches the qlvt xu ly gp lien van phuong tien in the entity cache if it is enabled.
	 *
	 * @param qlvtXuLyGpLienVanPhuongTien the qlvt xu ly gp lien van phuong tien
	 */
	@Override
	public void cacheResult(
		QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien) {
		EntityCacheUtil.putResult(QlvtXuLyGpLienVanPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanPhuongTienImpl.class,
			qlvtXuLyGpLienVanPhuongTien.getPrimaryKey(),
			qlvtXuLyGpLienVanPhuongTien);

		qlvtXuLyGpLienVanPhuongTien.resetOriginalValues();
	}

	/**
	 * Caches the qlvt xu ly gp lien van phuong tiens in the entity cache if it is enabled.
	 *
	 * @param qlvtXuLyGpLienVanPhuongTiens the qlvt xu ly gp lien van phuong tiens
	 */
	@Override
	public void cacheResult(
		List<QlvtXuLyGpLienVanPhuongTien> qlvtXuLyGpLienVanPhuongTiens) {
		for (QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien : qlvtXuLyGpLienVanPhuongTiens) {
			if (EntityCacheUtil.getResult(
						QlvtXuLyGpLienVanPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
						QlvtXuLyGpLienVanPhuongTienImpl.class,
						qlvtXuLyGpLienVanPhuongTien.getPrimaryKey()) == null) {
				cacheResult(qlvtXuLyGpLienVanPhuongTien);
			}
			else {
				qlvtXuLyGpLienVanPhuongTien.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qlvt xu ly gp lien van phuong tiens.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QlvtXuLyGpLienVanPhuongTienImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QlvtXuLyGpLienVanPhuongTienImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qlvt xu ly gp lien van phuong tien.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien) {
		EntityCacheUtil.removeResult(QlvtXuLyGpLienVanPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanPhuongTienImpl.class,
			qlvtXuLyGpLienVanPhuongTien.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<QlvtXuLyGpLienVanPhuongTien> qlvtXuLyGpLienVanPhuongTiens) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien : qlvtXuLyGpLienVanPhuongTiens) {
			EntityCacheUtil.removeResult(QlvtXuLyGpLienVanPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
				QlvtXuLyGpLienVanPhuongTienImpl.class,
				qlvtXuLyGpLienVanPhuongTien.getPrimaryKey());
		}
	}

	/**
	 * Creates a new qlvt xu ly gp lien van phuong tien with the primary key. Does not add the qlvt xu ly gp lien van phuong tien to the database.
	 *
	 * @param id the primary key for the new qlvt xu ly gp lien van phuong tien
	 * @return the new qlvt xu ly gp lien van phuong tien
	 */
	@Override
	public QlvtXuLyGpLienVanPhuongTien create(long id) {
		QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien = new QlvtXuLyGpLienVanPhuongTienImpl();

		qlvtXuLyGpLienVanPhuongTien.setNew(true);
		qlvtXuLyGpLienVanPhuongTien.setPrimaryKey(id);

		return qlvtXuLyGpLienVanPhuongTien;
	}

	/**
	 * Removes the qlvt xu ly gp lien van phuong tien with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the qlvt xu ly gp lien van phuong tien
	 * @return the qlvt xu ly gp lien van phuong tien that was removed
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienException if a qlvt xu ly gp lien van phuong tien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanPhuongTien remove(long id)
		throws NoSuchQlvtXuLyGpLienVanPhuongTienException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the qlvt xu ly gp lien van phuong tien with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qlvt xu ly gp lien van phuong tien
	 * @return the qlvt xu ly gp lien van phuong tien that was removed
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienException if a qlvt xu ly gp lien van phuong tien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanPhuongTien remove(Serializable primaryKey)
		throws NoSuchQlvtXuLyGpLienVanPhuongTienException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien = (QlvtXuLyGpLienVanPhuongTien)session.get(QlvtXuLyGpLienVanPhuongTienImpl.class,
					primaryKey);

			if (qlvtXuLyGpLienVanPhuongTien == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQlvtXuLyGpLienVanPhuongTienException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtXuLyGpLienVanPhuongTien);
		}
		catch (NoSuchQlvtXuLyGpLienVanPhuongTienException nsee) {
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
	protected QlvtXuLyGpLienVanPhuongTien removeImpl(
		QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien)
		throws SystemException {
		qlvtXuLyGpLienVanPhuongTien = toUnwrappedModel(qlvtXuLyGpLienVanPhuongTien);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtXuLyGpLienVanPhuongTien)) {
				qlvtXuLyGpLienVanPhuongTien = (QlvtXuLyGpLienVanPhuongTien)session.get(QlvtXuLyGpLienVanPhuongTienImpl.class,
						qlvtXuLyGpLienVanPhuongTien.getPrimaryKeyObj());
			}

			if (qlvtXuLyGpLienVanPhuongTien != null) {
				session.delete(qlvtXuLyGpLienVanPhuongTien);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtXuLyGpLienVanPhuongTien != null) {
			clearCache(qlvtXuLyGpLienVanPhuongTien);
		}

		return qlvtXuLyGpLienVanPhuongTien;
	}

	@Override
	public QlvtXuLyGpLienVanPhuongTien updateImpl(
		vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien)
		throws SystemException {
		qlvtXuLyGpLienVanPhuongTien = toUnwrappedModel(qlvtXuLyGpLienVanPhuongTien);

		boolean isNew = qlvtXuLyGpLienVanPhuongTien.isNew();

		QlvtXuLyGpLienVanPhuongTienModelImpl qlvtXuLyGpLienVanPhuongTienModelImpl =
			(QlvtXuLyGpLienVanPhuongTienModelImpl)qlvtXuLyGpLienVanPhuongTien;

		Session session = null;

		try {
			session = openSession();

			if (qlvtXuLyGpLienVanPhuongTien.isNew()) {
				session.save(qlvtXuLyGpLienVanPhuongTien);

				qlvtXuLyGpLienVanPhuongTien.setNew(false);
			}
			else {
				session.merge(qlvtXuLyGpLienVanPhuongTien);
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
				!QlvtXuLyGpLienVanPhuongTienModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((qlvtXuLyGpLienVanPhuongTienModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CAPGPLVID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						qlvtXuLyGpLienVanPhuongTienModelImpl.getOriginalCapGplvId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CAPGPLVID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CAPGPLVID,
					args);

				args = new Object[] {
						qlvtXuLyGpLienVanPhuongTienModelImpl.getCapGplvId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CAPGPLVID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CAPGPLVID,
					args);
			}
		}

		EntityCacheUtil.putResult(QlvtXuLyGpLienVanPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanPhuongTienImpl.class,
			qlvtXuLyGpLienVanPhuongTien.getPrimaryKey(),
			qlvtXuLyGpLienVanPhuongTien);

		return qlvtXuLyGpLienVanPhuongTien;
	}

	protected QlvtXuLyGpLienVanPhuongTien toUnwrappedModel(
		QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien) {
		if (qlvtXuLyGpLienVanPhuongTien instanceof QlvtXuLyGpLienVanPhuongTienImpl) {
			return qlvtXuLyGpLienVanPhuongTien;
		}

		QlvtXuLyGpLienVanPhuongTienImpl qlvtXuLyGpLienVanPhuongTienImpl = new QlvtXuLyGpLienVanPhuongTienImpl();

		qlvtXuLyGpLienVanPhuongTienImpl.setNew(qlvtXuLyGpLienVanPhuongTien.isNew());
		qlvtXuLyGpLienVanPhuongTienImpl.setPrimaryKey(qlvtXuLyGpLienVanPhuongTien.getPrimaryKey());

		qlvtXuLyGpLienVanPhuongTienImpl.setId(qlvtXuLyGpLienVanPhuongTien.getId());
		qlvtXuLyGpLienVanPhuongTienImpl.setCapGplvId(qlvtXuLyGpLienVanPhuongTien.getCapGplvId());
		qlvtXuLyGpLienVanPhuongTienImpl.setBienSo(qlvtXuLyGpLienVanPhuongTien.getBienSo());
		qlvtXuLyGpLienVanPhuongTienImpl.setTrongTai(qlvtXuLyGpLienVanPhuongTien.getTrongTai());
		qlvtXuLyGpLienVanPhuongTienImpl.setNamSx(qlvtXuLyGpLienVanPhuongTien.getNamSx());
		qlvtXuLyGpLienVanPhuongTienImpl.setNhanHieu(qlvtXuLyGpLienVanPhuongTien.getNhanHieu());
		qlvtXuLyGpLienVanPhuongTienImpl.setSoKhung(qlvtXuLyGpLienVanPhuongTien.getSoKhung());
		qlvtXuLyGpLienVanPhuongTienImpl.setSoMay(qlvtXuLyGpLienVanPhuongTien.getSoMay());
		qlvtXuLyGpLienVanPhuongTienImpl.setMauSon(qlvtXuLyGpLienVanPhuongTien.getMauSon());
		qlvtXuLyGpLienVanPhuongTienImpl.setCuaKhau(qlvtXuLyGpLienVanPhuongTien.getCuaKhau());
		qlvtXuLyGpLienVanPhuongTienImpl.setMaCuaKhau(qlvtXuLyGpLienVanPhuongTien.getMaCuaKhau());
		qlvtXuLyGpLienVanPhuongTienImpl.setXinCapPhepTuNgay(qlvtXuLyGpLienVanPhuongTien.getXinCapPhepTuNgay());
		qlvtXuLyGpLienVanPhuongTienImpl.setXinCapPhepDenNgay(qlvtXuLyGpLienVanPhuongTien.getXinCapPhepDenNgay());
		qlvtXuLyGpLienVanPhuongTienImpl.setHinhThucHoatDong(qlvtXuLyGpLienVanPhuongTien.getHinhThucHoatDong());
		qlvtXuLyGpLienVanPhuongTienImpl.setSoPhuHieu(qlvtXuLyGpLienVanPhuongTien.getSoPhuHieu());
		qlvtXuLyGpLienVanPhuongTienImpl.setThoiHanPhuHieu(qlvtXuLyGpLienVanPhuongTien.getThoiHanPhuHieu());
		qlvtXuLyGpLienVanPhuongTienImpl.setSoNgayXinhGiaHan(qlvtXuLyGpLienVanPhuongTien.getSoNgayXinhGiaHan());
		qlvtXuLyGpLienVanPhuongTienImpl.setXinGiaHanTuNgay(qlvtXuLyGpLienVanPhuongTien.getXinGiaHanTuNgay());
		qlvtXuLyGpLienVanPhuongTienImpl.setXinGiaHanDenNgay(qlvtXuLyGpLienVanPhuongTien.getXinGiaHanDenNgay());
		qlvtXuLyGpLienVanPhuongTienImpl.setHinhThucSoHuu(qlvtXuLyGpLienVanPhuongTien.getHinhThucSoHuu());
		qlvtXuLyGpLienVanPhuongTienImpl.setDoanhNghiepChoThue(qlvtXuLyGpLienVanPhuongTien.getDoanhNghiepChoThue());
		qlvtXuLyGpLienVanPhuongTienImpl.setThoiHanChoThue(qlvtXuLyGpLienVanPhuongTien.getThoiHanChoThue());
		qlvtXuLyGpLienVanPhuongTienImpl.setHopDongSauCung(qlvtXuLyGpLienVanPhuongTien.getHopDongSauCung());
		qlvtXuLyGpLienVanPhuongTienImpl.setThoiGianNhapCanh(qlvtXuLyGpLienVanPhuongTien.getThoiGianNhapCanh());
		qlvtXuLyGpLienVanPhuongTienImpl.setThoiGianKhoiHanh(qlvtXuLyGpLienVanPhuongTien.getThoiGianKhoiHanh());
		qlvtXuLyGpLienVanPhuongTienImpl.setLoaiHinhGiaHan(qlvtXuLyGpLienVanPhuongTien.getLoaiHinhGiaHan());
		qlvtXuLyGpLienVanPhuongTienImpl.setLoaiGiayPhep(qlvtXuLyGpLienVanPhuongTien.getLoaiGiayPhep());
		qlvtXuLyGpLienVanPhuongTienImpl.setKetQuaXuLy(qlvtXuLyGpLienVanPhuongTien.getKetQuaXuLy());
		qlvtXuLyGpLienVanPhuongTienImpl.setLyDoKhongDat(qlvtXuLyGpLienVanPhuongTien.getLyDoKhongDat());
		qlvtXuLyGpLienVanPhuongTienImpl.setSoChoNgoi(qlvtXuLyGpLienVanPhuongTien.getSoChoNgoi());
		qlvtXuLyGpLienVanPhuongTienImpl.setHanhTrinh(qlvtXuLyGpLienVanPhuongTien.getHanhTrinh());
		qlvtXuLyGpLienVanPhuongTienImpl.setPhiCapPhep(qlvtXuLyGpLienVanPhuongTien.getPhiCapPhep());
		qlvtXuLyGpLienVanPhuongTienImpl.setSoGiayPhepLienVanPhuongTien(qlvtXuLyGpLienVanPhuongTien.getSoGiayPhepLienVanPhuongTien());
		qlvtXuLyGpLienVanPhuongTienImpl.setLoaiTuyen(qlvtXuLyGpLienVanPhuongTien.getLoaiTuyen());
		qlvtXuLyGpLienVanPhuongTienImpl.setLoaiHangVanChuyen(qlvtXuLyGpLienVanPhuongTien.getLoaiHangVanChuyen());

		return qlvtXuLyGpLienVanPhuongTienImpl;
	}

	/**
	 * Returns the qlvt xu ly gp lien van phuong tien with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt xu ly gp lien van phuong tien
	 * @return the qlvt xu ly gp lien van phuong tien
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienException if a qlvt xu ly gp lien van phuong tien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanPhuongTien findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQlvtXuLyGpLienVanPhuongTienException, SystemException {
		QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien = fetchByPrimaryKey(primaryKey);

		if (qlvtXuLyGpLienVanPhuongTien == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQlvtXuLyGpLienVanPhuongTienException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtXuLyGpLienVanPhuongTien;
	}

	/**
	 * Returns the qlvt xu ly gp lien van phuong tien with the primary key or throws a {@link vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienException} if it could not be found.
	 *
	 * @param id the primary key of the qlvt xu ly gp lien van phuong tien
	 * @return the qlvt xu ly gp lien van phuong tien
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienException if a qlvt xu ly gp lien van phuong tien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanPhuongTien findByPrimaryKey(long id)
		throws NoSuchQlvtXuLyGpLienVanPhuongTienException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the qlvt xu ly gp lien van phuong tien with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt xu ly gp lien van phuong tien
	 * @return the qlvt xu ly gp lien van phuong tien, or <code>null</code> if a qlvt xu ly gp lien van phuong tien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanPhuongTien fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien = (QlvtXuLyGpLienVanPhuongTien)EntityCacheUtil.getResult(QlvtXuLyGpLienVanPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
				QlvtXuLyGpLienVanPhuongTienImpl.class, primaryKey);

		if (qlvtXuLyGpLienVanPhuongTien == _nullQlvtXuLyGpLienVanPhuongTien) {
			return null;
		}

		if (qlvtXuLyGpLienVanPhuongTien == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtXuLyGpLienVanPhuongTien = (QlvtXuLyGpLienVanPhuongTien)session.get(QlvtXuLyGpLienVanPhuongTienImpl.class,
						primaryKey);

				if (qlvtXuLyGpLienVanPhuongTien != null) {
					cacheResult(qlvtXuLyGpLienVanPhuongTien);
				}
				else {
					EntityCacheUtil.putResult(QlvtXuLyGpLienVanPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
						QlvtXuLyGpLienVanPhuongTienImpl.class, primaryKey,
						_nullQlvtXuLyGpLienVanPhuongTien);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QlvtXuLyGpLienVanPhuongTienModelImpl.ENTITY_CACHE_ENABLED,
					QlvtXuLyGpLienVanPhuongTienImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtXuLyGpLienVanPhuongTien;
	}

	/**
	 * Returns the qlvt xu ly gp lien van phuong tien with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the qlvt xu ly gp lien van phuong tien
	 * @return the qlvt xu ly gp lien van phuong tien, or <code>null</code> if a qlvt xu ly gp lien van phuong tien with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanPhuongTien fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the qlvt xu ly gp lien van phuong tiens.
	 *
	 * @return the qlvt xu ly gp lien van phuong tiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpLienVanPhuongTien> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt xu ly gp lien van phuong tiens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt xu ly gp lien van phuong tiens
	 * @param end the upper bound of the range of qlvt xu ly gp lien van phuong tiens (not inclusive)
	 * @return the range of qlvt xu ly gp lien van phuong tiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpLienVanPhuongTien> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt xu ly gp lien van phuong tiens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt xu ly gp lien van phuong tiens
	 * @param end the upper bound of the range of qlvt xu ly gp lien van phuong tiens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qlvt xu ly gp lien van phuong tiens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpLienVanPhuongTien> findAll(int start, int end,
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

		List<QlvtXuLyGpLienVanPhuongTien> list = (List<QlvtXuLyGpLienVanPhuongTien>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTXULYGPLIENVANPHUONGTIEN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTXULYGPLIENVANPHUONGTIEN;

				if (pagination) {
					sql = sql.concat(QlvtXuLyGpLienVanPhuongTienModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QlvtXuLyGpLienVanPhuongTien>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtXuLyGpLienVanPhuongTien>(list);
				}
				else {
					list = (List<QlvtXuLyGpLienVanPhuongTien>)QueryUtil.list(q,
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
	 * Removes all the qlvt xu ly gp lien van phuong tiens from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien : findAll()) {
			remove(qlvtXuLyGpLienVanPhuongTien);
		}
	}

	/**
	 * Returns the number of qlvt xu ly gp lien van phuong tiens.
	 *
	 * @return the number of qlvt xu ly gp lien van phuong tiens
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

				Query q = session.createQuery(_SQL_COUNT_QLVTXULYGPLIENVANPHUONGTIEN);

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
	 * Initializes the qlvt xu ly gp lien van phuong tien persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTien")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QlvtXuLyGpLienVanPhuongTien>> listenersList = new ArrayList<ModelListener<QlvtXuLyGpLienVanPhuongTien>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QlvtXuLyGpLienVanPhuongTien>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QlvtXuLyGpLienVanPhuongTienImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTXULYGPLIENVANPHUONGTIEN = "SELECT qlvtXuLyGpLienVanPhuongTien FROM QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien";
	private static final String _SQL_SELECT_QLVTXULYGPLIENVANPHUONGTIEN_WHERE = "SELECT qlvtXuLyGpLienVanPhuongTien FROM QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien WHERE ";
	private static final String _SQL_COUNT_QLVTXULYGPLIENVANPHUONGTIEN = "SELECT COUNT(qlvtXuLyGpLienVanPhuongTien) FROM QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien";
	private static final String _SQL_COUNT_QLVTXULYGPLIENVANPHUONGTIEN_WHERE = "SELECT COUNT(qlvtXuLyGpLienVanPhuongTien) FROM QlvtXuLyGpLienVanPhuongTien qlvtXuLyGpLienVanPhuongTien WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtXuLyGpLienVanPhuongTien.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QlvtXuLyGpLienVanPhuongTien exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No QlvtXuLyGpLienVanPhuongTien exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QlvtXuLyGpLienVanPhuongTienPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "capGplvId", "bienSo", "trongTai", "namSx", "nhanHieu",
				"soKhung", "soMay", "mauSon", "cuaKhau", "maCuaKhau",
				"xinCapPhepTuNgay", "xinCapPhepDenNgay", "hinhThucHoatDong",
				"soPhuHieu", "thoiHanPhuHieu", "soNgayXinhGiaHan",
				"xinGiaHanTuNgay", "xinGiaHanDenNgay", "hinhThucSoHuu",
				"doanhNghiepChoThue", "thoiHanChoThue", "hopDongSauCung",
				"thoiGianNhapCanh", "thoiGianKhoiHanh", "loaiHinhGiaHan",
				"loaiGiayPhep", "ketQuaXuLy", "lyDoKhongDat", "soChoNgoi",
				"hanhTrinh", "phiCapPhep", "soGiayPhepLienVanPhuongTien",
				"loaiTuyen", "loaiHangVanChuyen"
			});
	private static QlvtXuLyGpLienVanPhuongTien _nullQlvtXuLyGpLienVanPhuongTien = new QlvtXuLyGpLienVanPhuongTienImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QlvtXuLyGpLienVanPhuongTien> toCacheModel() {
				return _nullQlvtXuLyGpLienVanPhuongTienCacheModel;
			}
		};

	private static CacheModel<QlvtXuLyGpLienVanPhuongTien> _nullQlvtXuLyGpLienVanPhuongTienCacheModel =
		new CacheModel<QlvtXuLyGpLienVanPhuongTien>() {
			@Override
			public QlvtXuLyGpLienVanPhuongTien toEntityModel() {
				return _nullQlvtXuLyGpLienVanPhuongTien;
			}
		};
}