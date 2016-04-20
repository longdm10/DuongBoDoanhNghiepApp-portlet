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

import vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanTuyenException;
import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen;
import vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanTuyenImpl;
import vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanTuyenModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the qlvt xu ly gp lien van tuyen service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanNc
 * @see QlvtXuLyGpLienVanTuyenPersistence
 * @see QlvtXuLyGpLienVanTuyenUtil
 * @generated
 */
public class QlvtXuLyGpLienVanTuyenPersistenceImpl extends BasePersistenceImpl<QlvtXuLyGpLienVanTuyen>
	implements QlvtXuLyGpLienVanTuyenPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QlvtXuLyGpLienVanTuyenUtil} to access the qlvt xu ly gp lien van tuyen persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QlvtXuLyGpLienVanTuyenImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QlvtXuLyGpLienVanTuyenModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanTuyenModelImpl.FINDER_CACHE_ENABLED,
			QlvtXuLyGpLienVanTuyenImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QlvtXuLyGpLienVanTuyenModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanTuyenModelImpl.FINDER_CACHE_ENABLED,
			QlvtXuLyGpLienVanTuyenImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QlvtXuLyGpLienVanTuyenModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanTuyenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GPLIENVANPHUONGTIENID =
		new FinderPath(QlvtXuLyGpLienVanTuyenModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanTuyenModelImpl.FINDER_CACHE_ENABLED,
			QlvtXuLyGpLienVanTuyenImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygpLienVanPhuongTienId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GPLIENVANPHUONGTIENID =
		new FinderPath(QlvtXuLyGpLienVanTuyenModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanTuyenModelImpl.FINDER_CACHE_ENABLED,
			QlvtXuLyGpLienVanTuyenImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygpLienVanPhuongTienId",
			new String[] { Long.class.getName() },
			QlvtXuLyGpLienVanTuyenModelImpl.GPLIENVANPHUONGTIENID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GPLIENVANPHUONGTIENID = new FinderPath(QlvtXuLyGpLienVanTuyenModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanTuyenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygpLienVanPhuongTienId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the qlvt xu ly gp lien van tuyens where gpLienVanPhuongTienId = &#63;.
	 *
	 * @param gpLienVanPhuongTienId the gp lien van phuong tien ID
	 * @return the matching qlvt xu ly gp lien van tuyens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpLienVanTuyen> findBygpLienVanPhuongTienId(
		long gpLienVanPhuongTienId) throws SystemException {
		return findBygpLienVanPhuongTienId(gpLienVanPhuongTienId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt xu ly gp lien van tuyens where gpLienVanPhuongTienId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanTuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param gpLienVanPhuongTienId the gp lien van phuong tien ID
	 * @param start the lower bound of the range of qlvt xu ly gp lien van tuyens
	 * @param end the upper bound of the range of qlvt xu ly gp lien van tuyens (not inclusive)
	 * @return the range of matching qlvt xu ly gp lien van tuyens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpLienVanTuyen> findBygpLienVanPhuongTienId(
		long gpLienVanPhuongTienId, int start, int end)
		throws SystemException {
		return findBygpLienVanPhuongTienId(gpLienVanPhuongTienId, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the qlvt xu ly gp lien van tuyens where gpLienVanPhuongTienId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanTuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param gpLienVanPhuongTienId the gp lien van phuong tien ID
	 * @param start the lower bound of the range of qlvt xu ly gp lien van tuyens
	 * @param end the upper bound of the range of qlvt xu ly gp lien van tuyens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching qlvt xu ly gp lien van tuyens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpLienVanTuyen> findBygpLienVanPhuongTienId(
		long gpLienVanPhuongTienId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GPLIENVANPHUONGTIENID;
			finderArgs = new Object[] { gpLienVanPhuongTienId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GPLIENVANPHUONGTIENID;
			finderArgs = new Object[] {
					gpLienVanPhuongTienId,
					
					start, end, orderByComparator
				};
		}

		List<QlvtXuLyGpLienVanTuyen> list = (List<QlvtXuLyGpLienVanTuyen>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (QlvtXuLyGpLienVanTuyen qlvtXuLyGpLienVanTuyen : list) {
				if ((gpLienVanPhuongTienId != qlvtXuLyGpLienVanTuyen.getGpLienVanPhuongTienId())) {
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

			query.append(_SQL_SELECT_QLVTXULYGPLIENVANTUYEN_WHERE);

			query.append(_FINDER_COLUMN_GPLIENVANPHUONGTIENID_GPLIENVANPHUONGTIENID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(QlvtXuLyGpLienVanTuyenModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(gpLienVanPhuongTienId);

				if (!pagination) {
					list = (List<QlvtXuLyGpLienVanTuyen>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtXuLyGpLienVanTuyen>(list);
				}
				else {
					list = (List<QlvtXuLyGpLienVanTuyen>)QueryUtil.list(q,
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
	 * Returns the first qlvt xu ly gp lien van tuyen in the ordered set where gpLienVanPhuongTienId = &#63;.
	 *
	 * @param gpLienVanPhuongTienId the gp lien van phuong tien ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qlvt xu ly gp lien van tuyen
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanTuyenException if a matching qlvt xu ly gp lien van tuyen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanTuyen findBygpLienVanPhuongTienId_First(
		long gpLienVanPhuongTienId, OrderByComparator orderByComparator)
		throws NoSuchQlvtXuLyGpLienVanTuyenException, SystemException {
		QlvtXuLyGpLienVanTuyen qlvtXuLyGpLienVanTuyen = fetchBygpLienVanPhuongTienId_First(gpLienVanPhuongTienId,
				orderByComparator);

		if (qlvtXuLyGpLienVanTuyen != null) {
			return qlvtXuLyGpLienVanTuyen;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("gpLienVanPhuongTienId=");
		msg.append(gpLienVanPhuongTienId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchQlvtXuLyGpLienVanTuyenException(msg.toString());
	}

	/**
	 * Returns the first qlvt xu ly gp lien van tuyen in the ordered set where gpLienVanPhuongTienId = &#63;.
	 *
	 * @param gpLienVanPhuongTienId the gp lien van phuong tien ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qlvt xu ly gp lien van tuyen, or <code>null</code> if a matching qlvt xu ly gp lien van tuyen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanTuyen fetchBygpLienVanPhuongTienId_First(
		long gpLienVanPhuongTienId, OrderByComparator orderByComparator)
		throws SystemException {
		List<QlvtXuLyGpLienVanTuyen> list = findBygpLienVanPhuongTienId(gpLienVanPhuongTienId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last qlvt xu ly gp lien van tuyen in the ordered set where gpLienVanPhuongTienId = &#63;.
	 *
	 * @param gpLienVanPhuongTienId the gp lien van phuong tien ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qlvt xu ly gp lien van tuyen
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanTuyenException if a matching qlvt xu ly gp lien van tuyen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanTuyen findBygpLienVanPhuongTienId_Last(
		long gpLienVanPhuongTienId, OrderByComparator orderByComparator)
		throws NoSuchQlvtXuLyGpLienVanTuyenException, SystemException {
		QlvtXuLyGpLienVanTuyen qlvtXuLyGpLienVanTuyen = fetchBygpLienVanPhuongTienId_Last(gpLienVanPhuongTienId,
				orderByComparator);

		if (qlvtXuLyGpLienVanTuyen != null) {
			return qlvtXuLyGpLienVanTuyen;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("gpLienVanPhuongTienId=");
		msg.append(gpLienVanPhuongTienId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchQlvtXuLyGpLienVanTuyenException(msg.toString());
	}

	/**
	 * Returns the last qlvt xu ly gp lien van tuyen in the ordered set where gpLienVanPhuongTienId = &#63;.
	 *
	 * @param gpLienVanPhuongTienId the gp lien van phuong tien ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qlvt xu ly gp lien van tuyen, or <code>null</code> if a matching qlvt xu ly gp lien van tuyen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanTuyen fetchBygpLienVanPhuongTienId_Last(
		long gpLienVanPhuongTienId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBygpLienVanPhuongTienId(gpLienVanPhuongTienId);

		if (count == 0) {
			return null;
		}

		List<QlvtXuLyGpLienVanTuyen> list = findBygpLienVanPhuongTienId(gpLienVanPhuongTienId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the qlvt xu ly gp lien van tuyens before and after the current qlvt xu ly gp lien van tuyen in the ordered set where gpLienVanPhuongTienId = &#63;.
	 *
	 * @param id the primary key of the current qlvt xu ly gp lien van tuyen
	 * @param gpLienVanPhuongTienId the gp lien van phuong tien ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next qlvt xu ly gp lien van tuyen
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanTuyenException if a qlvt xu ly gp lien van tuyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanTuyen[] findBygpLienVanPhuongTienId_PrevAndNext(
		long id, long gpLienVanPhuongTienId, OrderByComparator orderByComparator)
		throws NoSuchQlvtXuLyGpLienVanTuyenException, SystemException {
		QlvtXuLyGpLienVanTuyen qlvtXuLyGpLienVanTuyen = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			QlvtXuLyGpLienVanTuyen[] array = new QlvtXuLyGpLienVanTuyenImpl[3];

			array[0] = getBygpLienVanPhuongTienId_PrevAndNext(session,
					qlvtXuLyGpLienVanTuyen, gpLienVanPhuongTienId,
					orderByComparator, true);

			array[1] = qlvtXuLyGpLienVanTuyen;

			array[2] = getBygpLienVanPhuongTienId_PrevAndNext(session,
					qlvtXuLyGpLienVanTuyen, gpLienVanPhuongTienId,
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

	protected QlvtXuLyGpLienVanTuyen getBygpLienVanPhuongTienId_PrevAndNext(
		Session session, QlvtXuLyGpLienVanTuyen qlvtXuLyGpLienVanTuyen,
		long gpLienVanPhuongTienId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_QLVTXULYGPLIENVANTUYEN_WHERE);

		query.append(_FINDER_COLUMN_GPLIENVANPHUONGTIENID_GPLIENVANPHUONGTIENID_2);

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
			query.append(QlvtXuLyGpLienVanTuyenModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(gpLienVanPhuongTienId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(qlvtXuLyGpLienVanTuyen);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<QlvtXuLyGpLienVanTuyen> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the qlvt xu ly gp lien van tuyens where gpLienVanPhuongTienId = &#63; from the database.
	 *
	 * @param gpLienVanPhuongTienId the gp lien van phuong tien ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBygpLienVanPhuongTienId(long gpLienVanPhuongTienId)
		throws SystemException {
		for (QlvtXuLyGpLienVanTuyen qlvtXuLyGpLienVanTuyen : findBygpLienVanPhuongTienId(
				gpLienVanPhuongTienId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(qlvtXuLyGpLienVanTuyen);
		}
	}

	/**
	 * Returns the number of qlvt xu ly gp lien van tuyens where gpLienVanPhuongTienId = &#63;.
	 *
	 * @param gpLienVanPhuongTienId the gp lien van phuong tien ID
	 * @return the number of matching qlvt xu ly gp lien van tuyens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBygpLienVanPhuongTienId(long gpLienVanPhuongTienId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GPLIENVANPHUONGTIENID;

		Object[] finderArgs = new Object[] { gpLienVanPhuongTienId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_QLVTXULYGPLIENVANTUYEN_WHERE);

			query.append(_FINDER_COLUMN_GPLIENVANPHUONGTIENID_GPLIENVANPHUONGTIENID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(gpLienVanPhuongTienId);

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

	private static final String _FINDER_COLUMN_GPLIENVANPHUONGTIENID_GPLIENVANPHUONGTIENID_2 =
		"qlvtXuLyGpLienVanTuyen.gpLienVanPhuongTienId = ?";

	public QlvtXuLyGpLienVanTuyenPersistenceImpl() {
		setModelClass(QlvtXuLyGpLienVanTuyen.class);
	}

	/**
	 * Caches the qlvt xu ly gp lien van tuyen in the entity cache if it is enabled.
	 *
	 * @param qlvtXuLyGpLienVanTuyen the qlvt xu ly gp lien van tuyen
	 */
	@Override
	public void cacheResult(QlvtXuLyGpLienVanTuyen qlvtXuLyGpLienVanTuyen) {
		EntityCacheUtil.putResult(QlvtXuLyGpLienVanTuyenModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanTuyenImpl.class,
			qlvtXuLyGpLienVanTuyen.getPrimaryKey(), qlvtXuLyGpLienVanTuyen);

		qlvtXuLyGpLienVanTuyen.resetOriginalValues();
	}

	/**
	 * Caches the qlvt xu ly gp lien van tuyens in the entity cache if it is enabled.
	 *
	 * @param qlvtXuLyGpLienVanTuyens the qlvt xu ly gp lien van tuyens
	 */
	@Override
	public void cacheResult(
		List<QlvtXuLyGpLienVanTuyen> qlvtXuLyGpLienVanTuyens) {
		for (QlvtXuLyGpLienVanTuyen qlvtXuLyGpLienVanTuyen : qlvtXuLyGpLienVanTuyens) {
			if (EntityCacheUtil.getResult(
						QlvtXuLyGpLienVanTuyenModelImpl.ENTITY_CACHE_ENABLED,
						QlvtXuLyGpLienVanTuyenImpl.class,
						qlvtXuLyGpLienVanTuyen.getPrimaryKey()) == null) {
				cacheResult(qlvtXuLyGpLienVanTuyen);
			}
			else {
				qlvtXuLyGpLienVanTuyen.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qlvt xu ly gp lien van tuyens.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QlvtXuLyGpLienVanTuyenImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QlvtXuLyGpLienVanTuyenImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qlvt xu ly gp lien van tuyen.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QlvtXuLyGpLienVanTuyen qlvtXuLyGpLienVanTuyen) {
		EntityCacheUtil.removeResult(QlvtXuLyGpLienVanTuyenModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanTuyenImpl.class,
			qlvtXuLyGpLienVanTuyen.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<QlvtXuLyGpLienVanTuyen> qlvtXuLyGpLienVanTuyens) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QlvtXuLyGpLienVanTuyen qlvtXuLyGpLienVanTuyen : qlvtXuLyGpLienVanTuyens) {
			EntityCacheUtil.removeResult(QlvtXuLyGpLienVanTuyenModelImpl.ENTITY_CACHE_ENABLED,
				QlvtXuLyGpLienVanTuyenImpl.class,
				qlvtXuLyGpLienVanTuyen.getPrimaryKey());
		}
	}

	/**
	 * Creates a new qlvt xu ly gp lien van tuyen with the primary key. Does not add the qlvt xu ly gp lien van tuyen to the database.
	 *
	 * @param id the primary key for the new qlvt xu ly gp lien van tuyen
	 * @return the new qlvt xu ly gp lien van tuyen
	 */
	@Override
	public QlvtXuLyGpLienVanTuyen create(long id) {
		QlvtXuLyGpLienVanTuyen qlvtXuLyGpLienVanTuyen = new QlvtXuLyGpLienVanTuyenImpl();

		qlvtXuLyGpLienVanTuyen.setNew(true);
		qlvtXuLyGpLienVanTuyen.setPrimaryKey(id);

		return qlvtXuLyGpLienVanTuyen;
	}

	/**
	 * Removes the qlvt xu ly gp lien van tuyen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the qlvt xu ly gp lien van tuyen
	 * @return the qlvt xu ly gp lien van tuyen that was removed
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanTuyenException if a qlvt xu ly gp lien van tuyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanTuyen remove(long id)
		throws NoSuchQlvtXuLyGpLienVanTuyenException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the qlvt xu ly gp lien van tuyen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qlvt xu ly gp lien van tuyen
	 * @return the qlvt xu ly gp lien van tuyen that was removed
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanTuyenException if a qlvt xu ly gp lien van tuyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanTuyen remove(Serializable primaryKey)
		throws NoSuchQlvtXuLyGpLienVanTuyenException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QlvtXuLyGpLienVanTuyen qlvtXuLyGpLienVanTuyen = (QlvtXuLyGpLienVanTuyen)session.get(QlvtXuLyGpLienVanTuyenImpl.class,
					primaryKey);

			if (qlvtXuLyGpLienVanTuyen == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQlvtXuLyGpLienVanTuyenException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtXuLyGpLienVanTuyen);
		}
		catch (NoSuchQlvtXuLyGpLienVanTuyenException nsee) {
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
	protected QlvtXuLyGpLienVanTuyen removeImpl(
		QlvtXuLyGpLienVanTuyen qlvtXuLyGpLienVanTuyen)
		throws SystemException {
		qlvtXuLyGpLienVanTuyen = toUnwrappedModel(qlvtXuLyGpLienVanTuyen);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtXuLyGpLienVanTuyen)) {
				qlvtXuLyGpLienVanTuyen = (QlvtXuLyGpLienVanTuyen)session.get(QlvtXuLyGpLienVanTuyenImpl.class,
						qlvtXuLyGpLienVanTuyen.getPrimaryKeyObj());
			}

			if (qlvtXuLyGpLienVanTuyen != null) {
				session.delete(qlvtXuLyGpLienVanTuyen);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtXuLyGpLienVanTuyen != null) {
			clearCache(qlvtXuLyGpLienVanTuyen);
		}

		return qlvtXuLyGpLienVanTuyen;
	}

	@Override
	public QlvtXuLyGpLienVanTuyen updateImpl(
		vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen qlvtXuLyGpLienVanTuyen)
		throws SystemException {
		qlvtXuLyGpLienVanTuyen = toUnwrappedModel(qlvtXuLyGpLienVanTuyen);

		boolean isNew = qlvtXuLyGpLienVanTuyen.isNew();

		QlvtXuLyGpLienVanTuyenModelImpl qlvtXuLyGpLienVanTuyenModelImpl = (QlvtXuLyGpLienVanTuyenModelImpl)qlvtXuLyGpLienVanTuyen;

		Session session = null;

		try {
			session = openSession();

			if (qlvtXuLyGpLienVanTuyen.isNew()) {
				session.save(qlvtXuLyGpLienVanTuyen);

				qlvtXuLyGpLienVanTuyen.setNew(false);
			}
			else {
				session.merge(qlvtXuLyGpLienVanTuyen);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !QlvtXuLyGpLienVanTuyenModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((qlvtXuLyGpLienVanTuyenModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GPLIENVANPHUONGTIENID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						qlvtXuLyGpLienVanTuyenModelImpl.getOriginalGpLienVanPhuongTienId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GPLIENVANPHUONGTIENID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GPLIENVANPHUONGTIENID,
					args);

				args = new Object[] {
						qlvtXuLyGpLienVanTuyenModelImpl.getGpLienVanPhuongTienId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GPLIENVANPHUONGTIENID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GPLIENVANPHUONGTIENID,
					args);
			}
		}

		EntityCacheUtil.putResult(QlvtXuLyGpLienVanTuyenModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanTuyenImpl.class,
			qlvtXuLyGpLienVanTuyen.getPrimaryKey(), qlvtXuLyGpLienVanTuyen);

		return qlvtXuLyGpLienVanTuyen;
	}

	protected QlvtXuLyGpLienVanTuyen toUnwrappedModel(
		QlvtXuLyGpLienVanTuyen qlvtXuLyGpLienVanTuyen) {
		if (qlvtXuLyGpLienVanTuyen instanceof QlvtXuLyGpLienVanTuyenImpl) {
			return qlvtXuLyGpLienVanTuyen;
		}

		QlvtXuLyGpLienVanTuyenImpl qlvtXuLyGpLienVanTuyenImpl = new QlvtXuLyGpLienVanTuyenImpl();

		qlvtXuLyGpLienVanTuyenImpl.setNew(qlvtXuLyGpLienVanTuyen.isNew());
		qlvtXuLyGpLienVanTuyenImpl.setPrimaryKey(qlvtXuLyGpLienVanTuyen.getPrimaryKey());

		qlvtXuLyGpLienVanTuyenImpl.setId(qlvtXuLyGpLienVanTuyen.getId());
		qlvtXuLyGpLienVanTuyenImpl.setGpLienVanPhuongTienId(qlvtXuLyGpLienVanTuyen.getGpLienVanPhuongTienId());
		qlvtXuLyGpLienVanTuyenImpl.setMaTuyen(qlvtXuLyGpLienVanTuyen.getMaTuyen());
		qlvtXuLyGpLienVanTuyenImpl.setTenTuyen(qlvtXuLyGpLienVanTuyen.getTenTuyen());
		qlvtXuLyGpLienVanTuyenImpl.setTuNgay(qlvtXuLyGpLienVanTuyen.getTuNgay());
		qlvtXuLyGpLienVanTuyenImpl.setDenNgay(qlvtXuLyGpLienVanTuyen.getDenNgay());

		return qlvtXuLyGpLienVanTuyenImpl;
	}

	/**
	 * Returns the qlvt xu ly gp lien van tuyen with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt xu ly gp lien van tuyen
	 * @return the qlvt xu ly gp lien van tuyen
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanTuyenException if a qlvt xu ly gp lien van tuyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanTuyen findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQlvtXuLyGpLienVanTuyenException, SystemException {
		QlvtXuLyGpLienVanTuyen qlvtXuLyGpLienVanTuyen = fetchByPrimaryKey(primaryKey);

		if (qlvtXuLyGpLienVanTuyen == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQlvtXuLyGpLienVanTuyenException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtXuLyGpLienVanTuyen;
	}

	/**
	 * Returns the qlvt xu ly gp lien van tuyen with the primary key or throws a {@link vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanTuyenException} if it could not be found.
	 *
	 * @param id the primary key of the qlvt xu ly gp lien van tuyen
	 * @return the qlvt xu ly gp lien van tuyen
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanTuyenException if a qlvt xu ly gp lien van tuyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanTuyen findByPrimaryKey(long id)
		throws NoSuchQlvtXuLyGpLienVanTuyenException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the qlvt xu ly gp lien van tuyen with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt xu ly gp lien van tuyen
	 * @return the qlvt xu ly gp lien van tuyen, or <code>null</code> if a qlvt xu ly gp lien van tuyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanTuyen fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QlvtXuLyGpLienVanTuyen qlvtXuLyGpLienVanTuyen = (QlvtXuLyGpLienVanTuyen)EntityCacheUtil.getResult(QlvtXuLyGpLienVanTuyenModelImpl.ENTITY_CACHE_ENABLED,
				QlvtXuLyGpLienVanTuyenImpl.class, primaryKey);

		if (qlvtXuLyGpLienVanTuyen == _nullQlvtXuLyGpLienVanTuyen) {
			return null;
		}

		if (qlvtXuLyGpLienVanTuyen == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtXuLyGpLienVanTuyen = (QlvtXuLyGpLienVanTuyen)session.get(QlvtXuLyGpLienVanTuyenImpl.class,
						primaryKey);

				if (qlvtXuLyGpLienVanTuyen != null) {
					cacheResult(qlvtXuLyGpLienVanTuyen);
				}
				else {
					EntityCacheUtil.putResult(QlvtXuLyGpLienVanTuyenModelImpl.ENTITY_CACHE_ENABLED,
						QlvtXuLyGpLienVanTuyenImpl.class, primaryKey,
						_nullQlvtXuLyGpLienVanTuyen);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QlvtXuLyGpLienVanTuyenModelImpl.ENTITY_CACHE_ENABLED,
					QlvtXuLyGpLienVanTuyenImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtXuLyGpLienVanTuyen;
	}

	/**
	 * Returns the qlvt xu ly gp lien van tuyen with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the qlvt xu ly gp lien van tuyen
	 * @return the qlvt xu ly gp lien van tuyen, or <code>null</code> if a qlvt xu ly gp lien van tuyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanTuyen fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the qlvt xu ly gp lien van tuyens.
	 *
	 * @return the qlvt xu ly gp lien van tuyens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpLienVanTuyen> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt xu ly gp lien van tuyens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanTuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt xu ly gp lien van tuyens
	 * @param end the upper bound of the range of qlvt xu ly gp lien van tuyens (not inclusive)
	 * @return the range of qlvt xu ly gp lien van tuyens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpLienVanTuyen> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt xu ly gp lien van tuyens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanTuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt xu ly gp lien van tuyens
	 * @param end the upper bound of the range of qlvt xu ly gp lien van tuyens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qlvt xu ly gp lien van tuyens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpLienVanTuyen> findAll(int start, int end,
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

		List<QlvtXuLyGpLienVanTuyen> list = (List<QlvtXuLyGpLienVanTuyen>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTXULYGPLIENVANTUYEN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTXULYGPLIENVANTUYEN;

				if (pagination) {
					sql = sql.concat(QlvtXuLyGpLienVanTuyenModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QlvtXuLyGpLienVanTuyen>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtXuLyGpLienVanTuyen>(list);
				}
				else {
					list = (List<QlvtXuLyGpLienVanTuyen>)QueryUtil.list(q,
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
	 * Removes all the qlvt xu ly gp lien van tuyens from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QlvtXuLyGpLienVanTuyen qlvtXuLyGpLienVanTuyen : findAll()) {
			remove(qlvtXuLyGpLienVanTuyen);
		}
	}

	/**
	 * Returns the number of qlvt xu ly gp lien van tuyens.
	 *
	 * @return the number of qlvt xu ly gp lien van tuyens
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

				Query q = session.createQuery(_SQL_COUNT_QLVTXULYGPLIENVANTUYEN);

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
	 * Initializes the qlvt xu ly gp lien van tuyen persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QlvtXuLyGpLienVanTuyen>> listenersList = new ArrayList<ModelListener<QlvtXuLyGpLienVanTuyen>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QlvtXuLyGpLienVanTuyen>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QlvtXuLyGpLienVanTuyenImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTXULYGPLIENVANTUYEN = "SELECT qlvtXuLyGpLienVanTuyen FROM QlvtXuLyGpLienVanTuyen qlvtXuLyGpLienVanTuyen";
	private static final String _SQL_SELECT_QLVTXULYGPLIENVANTUYEN_WHERE = "SELECT qlvtXuLyGpLienVanTuyen FROM QlvtXuLyGpLienVanTuyen qlvtXuLyGpLienVanTuyen WHERE ";
	private static final String _SQL_COUNT_QLVTXULYGPLIENVANTUYEN = "SELECT COUNT(qlvtXuLyGpLienVanTuyen) FROM QlvtXuLyGpLienVanTuyen qlvtXuLyGpLienVanTuyen";
	private static final String _SQL_COUNT_QLVTXULYGPLIENVANTUYEN_WHERE = "SELECT COUNT(qlvtXuLyGpLienVanTuyen) FROM QlvtXuLyGpLienVanTuyen qlvtXuLyGpLienVanTuyen WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtXuLyGpLienVanTuyen.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QlvtXuLyGpLienVanTuyen exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No QlvtXuLyGpLienVanTuyen exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QlvtXuLyGpLienVanTuyenPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "gpLienVanPhuongTienId", "maTuyen", "tenTuyen", "tuNgay",
				"denNgay"
			});
	private static QlvtXuLyGpLienVanTuyen _nullQlvtXuLyGpLienVanTuyen = new QlvtXuLyGpLienVanTuyenImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QlvtXuLyGpLienVanTuyen> toCacheModel() {
				return _nullQlvtXuLyGpLienVanTuyenCacheModel;
			}
		};

	private static CacheModel<QlvtXuLyGpLienVanTuyen> _nullQlvtXuLyGpLienVanTuyenCacheModel =
		new CacheModel<QlvtXuLyGpLienVanTuyen>() {
			@Override
			public QlvtXuLyGpLienVanTuyen toEntityModel() {
				return _nullQlvtXuLyGpLienVanTuyen;
			}
		};
}