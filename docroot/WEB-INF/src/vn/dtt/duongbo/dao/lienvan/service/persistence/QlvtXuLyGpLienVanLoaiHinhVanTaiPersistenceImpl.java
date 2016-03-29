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

import vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanLoaiHinhVanTaiException;
import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanLoaiHinhVanTai;
import vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanLoaiHinhVanTaiImpl;
import vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanLoaiHinhVanTaiModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the qlvt xu ly gp lien van loai hinh van tai service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanNc
 * @see QlvtXuLyGpLienVanLoaiHinhVanTaiPersistence
 * @see QlvtXuLyGpLienVanLoaiHinhVanTaiUtil
 * @generated
 */
public class QlvtXuLyGpLienVanLoaiHinhVanTaiPersistenceImpl
	extends BasePersistenceImpl<QlvtXuLyGpLienVanLoaiHinhVanTai>
	implements QlvtXuLyGpLienVanLoaiHinhVanTaiPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QlvtXuLyGpLienVanLoaiHinhVanTaiUtil} to access the qlvt xu ly gp lien van loai hinh van tai persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QlvtXuLyGpLienVanLoaiHinhVanTaiImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QlvtXuLyGpLienVanLoaiHinhVanTaiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanLoaiHinhVanTaiModelImpl.FINDER_CACHE_ENABLED,
			QlvtXuLyGpLienVanLoaiHinhVanTaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QlvtXuLyGpLienVanLoaiHinhVanTaiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanLoaiHinhVanTaiModelImpl.FINDER_CACHE_ENABLED,
			QlvtXuLyGpLienVanLoaiHinhVanTaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QlvtXuLyGpLienVanLoaiHinhVanTaiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanLoaiHinhVanTaiModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GPLIENVANID =
		new FinderPath(QlvtXuLyGpLienVanLoaiHinhVanTaiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanLoaiHinhVanTaiModelImpl.FINDER_CACHE_ENABLED,
			QlvtXuLyGpLienVanLoaiHinhVanTaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygpLienVanId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GPLIENVANID =
		new FinderPath(QlvtXuLyGpLienVanLoaiHinhVanTaiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanLoaiHinhVanTaiModelImpl.FINDER_CACHE_ENABLED,
			QlvtXuLyGpLienVanLoaiHinhVanTaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygpLienVanId",
			new String[] { Long.class.getName() },
			QlvtXuLyGpLienVanLoaiHinhVanTaiModelImpl.GPLIENVANID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GPLIENVANID = new FinderPath(QlvtXuLyGpLienVanLoaiHinhVanTaiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanLoaiHinhVanTaiModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygpLienVanId", new String[] { Long.class.getName() });

	/**
	 * Returns all the qlvt xu ly gp lien van loai hinh van tais where gpLienVanId = &#63;.
	 *
	 * @param gpLienVanId the gp lien van ID
	 * @return the matching qlvt xu ly gp lien van loai hinh van tais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpLienVanLoaiHinhVanTai> findBygpLienVanId(
		long gpLienVanId) throws SystemException {
		return findBygpLienVanId(gpLienVanId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt xu ly gp lien van loai hinh van tais where gpLienVanId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanLoaiHinhVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param gpLienVanId the gp lien van ID
	 * @param start the lower bound of the range of qlvt xu ly gp lien van loai hinh van tais
	 * @param end the upper bound of the range of qlvt xu ly gp lien van loai hinh van tais (not inclusive)
	 * @return the range of matching qlvt xu ly gp lien van loai hinh van tais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpLienVanLoaiHinhVanTai> findBygpLienVanId(
		long gpLienVanId, int start, int end) throws SystemException {
		return findBygpLienVanId(gpLienVanId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt xu ly gp lien van loai hinh van tais where gpLienVanId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanLoaiHinhVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param gpLienVanId the gp lien van ID
	 * @param start the lower bound of the range of qlvt xu ly gp lien van loai hinh van tais
	 * @param end the upper bound of the range of qlvt xu ly gp lien van loai hinh van tais (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching qlvt xu ly gp lien van loai hinh van tais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpLienVanLoaiHinhVanTai> findBygpLienVanId(
		long gpLienVanId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GPLIENVANID;
			finderArgs = new Object[] { gpLienVanId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GPLIENVANID;
			finderArgs = new Object[] { gpLienVanId, start, end, orderByComparator };
		}

		List<QlvtXuLyGpLienVanLoaiHinhVanTai> list = (List<QlvtXuLyGpLienVanLoaiHinhVanTai>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (QlvtXuLyGpLienVanLoaiHinhVanTai qlvtXuLyGpLienVanLoaiHinhVanTai : list) {
				if ((gpLienVanId != qlvtXuLyGpLienVanLoaiHinhVanTai.getGpLienVanId())) {
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

			query.append(_SQL_SELECT_QLVTXULYGPLIENVANLOAIHINHVANTAI_WHERE);

			query.append(_FINDER_COLUMN_GPLIENVANID_GPLIENVANID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(QlvtXuLyGpLienVanLoaiHinhVanTaiModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(gpLienVanId);

				if (!pagination) {
					list = (List<QlvtXuLyGpLienVanLoaiHinhVanTai>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtXuLyGpLienVanLoaiHinhVanTai>(list);
				}
				else {
					list = (List<QlvtXuLyGpLienVanLoaiHinhVanTai>)QueryUtil.list(q,
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
	 * Returns the first qlvt xu ly gp lien van loai hinh van tai in the ordered set where gpLienVanId = &#63;.
	 *
	 * @param gpLienVanId the gp lien van ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qlvt xu ly gp lien van loai hinh van tai
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanLoaiHinhVanTaiException if a matching qlvt xu ly gp lien van loai hinh van tai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanLoaiHinhVanTai findBygpLienVanId_First(
		long gpLienVanId, OrderByComparator orderByComparator)
		throws NoSuchQlvtXuLyGpLienVanLoaiHinhVanTaiException, SystemException {
		QlvtXuLyGpLienVanLoaiHinhVanTai qlvtXuLyGpLienVanLoaiHinhVanTai = fetchBygpLienVanId_First(gpLienVanId,
				orderByComparator);

		if (qlvtXuLyGpLienVanLoaiHinhVanTai != null) {
			return qlvtXuLyGpLienVanLoaiHinhVanTai;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("gpLienVanId=");
		msg.append(gpLienVanId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchQlvtXuLyGpLienVanLoaiHinhVanTaiException(msg.toString());
	}

	/**
	 * Returns the first qlvt xu ly gp lien van loai hinh van tai in the ordered set where gpLienVanId = &#63;.
	 *
	 * @param gpLienVanId the gp lien van ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qlvt xu ly gp lien van loai hinh van tai, or <code>null</code> if a matching qlvt xu ly gp lien van loai hinh van tai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanLoaiHinhVanTai fetchBygpLienVanId_First(
		long gpLienVanId, OrderByComparator orderByComparator)
		throws SystemException {
		List<QlvtXuLyGpLienVanLoaiHinhVanTai> list = findBygpLienVanId(gpLienVanId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last qlvt xu ly gp lien van loai hinh van tai in the ordered set where gpLienVanId = &#63;.
	 *
	 * @param gpLienVanId the gp lien van ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qlvt xu ly gp lien van loai hinh van tai
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanLoaiHinhVanTaiException if a matching qlvt xu ly gp lien van loai hinh van tai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanLoaiHinhVanTai findBygpLienVanId_Last(
		long gpLienVanId, OrderByComparator orderByComparator)
		throws NoSuchQlvtXuLyGpLienVanLoaiHinhVanTaiException, SystemException {
		QlvtXuLyGpLienVanLoaiHinhVanTai qlvtXuLyGpLienVanLoaiHinhVanTai = fetchBygpLienVanId_Last(gpLienVanId,
				orderByComparator);

		if (qlvtXuLyGpLienVanLoaiHinhVanTai != null) {
			return qlvtXuLyGpLienVanLoaiHinhVanTai;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("gpLienVanId=");
		msg.append(gpLienVanId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchQlvtXuLyGpLienVanLoaiHinhVanTaiException(msg.toString());
	}

	/**
	 * Returns the last qlvt xu ly gp lien van loai hinh van tai in the ordered set where gpLienVanId = &#63;.
	 *
	 * @param gpLienVanId the gp lien van ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qlvt xu ly gp lien van loai hinh van tai, or <code>null</code> if a matching qlvt xu ly gp lien van loai hinh van tai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanLoaiHinhVanTai fetchBygpLienVanId_Last(
		long gpLienVanId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBygpLienVanId(gpLienVanId);

		if (count == 0) {
			return null;
		}

		List<QlvtXuLyGpLienVanLoaiHinhVanTai> list = findBygpLienVanId(gpLienVanId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the qlvt xu ly gp lien van loai hinh van tais before and after the current qlvt xu ly gp lien van loai hinh van tai in the ordered set where gpLienVanId = &#63;.
	 *
	 * @param id the primary key of the current qlvt xu ly gp lien van loai hinh van tai
	 * @param gpLienVanId the gp lien van ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next qlvt xu ly gp lien van loai hinh van tai
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanLoaiHinhVanTaiException if a qlvt xu ly gp lien van loai hinh van tai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanLoaiHinhVanTai[] findBygpLienVanId_PrevAndNext(
		long id, long gpLienVanId, OrderByComparator orderByComparator)
		throws NoSuchQlvtXuLyGpLienVanLoaiHinhVanTaiException, SystemException {
		QlvtXuLyGpLienVanLoaiHinhVanTai qlvtXuLyGpLienVanLoaiHinhVanTai = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			QlvtXuLyGpLienVanLoaiHinhVanTai[] array = new QlvtXuLyGpLienVanLoaiHinhVanTaiImpl[3];

			array[0] = getBygpLienVanId_PrevAndNext(session,
					qlvtXuLyGpLienVanLoaiHinhVanTai, gpLienVanId,
					orderByComparator, true);

			array[1] = qlvtXuLyGpLienVanLoaiHinhVanTai;

			array[2] = getBygpLienVanId_PrevAndNext(session,
					qlvtXuLyGpLienVanLoaiHinhVanTai, gpLienVanId,
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

	protected QlvtXuLyGpLienVanLoaiHinhVanTai getBygpLienVanId_PrevAndNext(
		Session session,
		QlvtXuLyGpLienVanLoaiHinhVanTai qlvtXuLyGpLienVanLoaiHinhVanTai,
		long gpLienVanId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_QLVTXULYGPLIENVANLOAIHINHVANTAI_WHERE);

		query.append(_FINDER_COLUMN_GPLIENVANID_GPLIENVANID_2);

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
			query.append(QlvtXuLyGpLienVanLoaiHinhVanTaiModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(gpLienVanId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(qlvtXuLyGpLienVanLoaiHinhVanTai);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<QlvtXuLyGpLienVanLoaiHinhVanTai> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the qlvt xu ly gp lien van loai hinh van tais where gpLienVanId = &#63; from the database.
	 *
	 * @param gpLienVanId the gp lien van ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBygpLienVanId(long gpLienVanId) throws SystemException {
		for (QlvtXuLyGpLienVanLoaiHinhVanTai qlvtXuLyGpLienVanLoaiHinhVanTai : findBygpLienVanId(
				gpLienVanId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(qlvtXuLyGpLienVanLoaiHinhVanTai);
		}
	}

	/**
	 * Returns the number of qlvt xu ly gp lien van loai hinh van tais where gpLienVanId = &#63;.
	 *
	 * @param gpLienVanId the gp lien van ID
	 * @return the number of matching qlvt xu ly gp lien van loai hinh van tais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBygpLienVanId(long gpLienVanId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GPLIENVANID;

		Object[] finderArgs = new Object[] { gpLienVanId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_QLVTXULYGPLIENVANLOAIHINHVANTAI_WHERE);

			query.append(_FINDER_COLUMN_GPLIENVANID_GPLIENVANID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(gpLienVanId);

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

	private static final String _FINDER_COLUMN_GPLIENVANID_GPLIENVANID_2 = "qlvtXuLyGpLienVanLoaiHinhVanTai.gpLienVanId = ?";

	public QlvtXuLyGpLienVanLoaiHinhVanTaiPersistenceImpl() {
		setModelClass(QlvtXuLyGpLienVanLoaiHinhVanTai.class);
	}

	/**
	 * Caches the qlvt xu ly gp lien van loai hinh van tai in the entity cache if it is enabled.
	 *
	 * @param qlvtXuLyGpLienVanLoaiHinhVanTai the qlvt xu ly gp lien van loai hinh van tai
	 */
	@Override
	public void cacheResult(
		QlvtXuLyGpLienVanLoaiHinhVanTai qlvtXuLyGpLienVanLoaiHinhVanTai) {
		EntityCacheUtil.putResult(QlvtXuLyGpLienVanLoaiHinhVanTaiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanLoaiHinhVanTaiImpl.class,
			qlvtXuLyGpLienVanLoaiHinhVanTai.getPrimaryKey(),
			qlvtXuLyGpLienVanLoaiHinhVanTai);

		qlvtXuLyGpLienVanLoaiHinhVanTai.resetOriginalValues();
	}

	/**
	 * Caches the qlvt xu ly gp lien van loai hinh van tais in the entity cache if it is enabled.
	 *
	 * @param qlvtXuLyGpLienVanLoaiHinhVanTais the qlvt xu ly gp lien van loai hinh van tais
	 */
	@Override
	public void cacheResult(
		List<QlvtXuLyGpLienVanLoaiHinhVanTai> qlvtXuLyGpLienVanLoaiHinhVanTais) {
		for (QlvtXuLyGpLienVanLoaiHinhVanTai qlvtXuLyGpLienVanLoaiHinhVanTai : qlvtXuLyGpLienVanLoaiHinhVanTais) {
			if (EntityCacheUtil.getResult(
						QlvtXuLyGpLienVanLoaiHinhVanTaiModelImpl.ENTITY_CACHE_ENABLED,
						QlvtXuLyGpLienVanLoaiHinhVanTaiImpl.class,
						qlvtXuLyGpLienVanLoaiHinhVanTai.getPrimaryKey()) == null) {
				cacheResult(qlvtXuLyGpLienVanLoaiHinhVanTai);
			}
			else {
				qlvtXuLyGpLienVanLoaiHinhVanTai.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qlvt xu ly gp lien van loai hinh van tais.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QlvtXuLyGpLienVanLoaiHinhVanTaiImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QlvtXuLyGpLienVanLoaiHinhVanTaiImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qlvt xu ly gp lien van loai hinh van tai.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		QlvtXuLyGpLienVanLoaiHinhVanTai qlvtXuLyGpLienVanLoaiHinhVanTai) {
		EntityCacheUtil.removeResult(QlvtXuLyGpLienVanLoaiHinhVanTaiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanLoaiHinhVanTaiImpl.class,
			qlvtXuLyGpLienVanLoaiHinhVanTai.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<QlvtXuLyGpLienVanLoaiHinhVanTai> qlvtXuLyGpLienVanLoaiHinhVanTais) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QlvtXuLyGpLienVanLoaiHinhVanTai qlvtXuLyGpLienVanLoaiHinhVanTai : qlvtXuLyGpLienVanLoaiHinhVanTais) {
			EntityCacheUtil.removeResult(QlvtXuLyGpLienVanLoaiHinhVanTaiModelImpl.ENTITY_CACHE_ENABLED,
				QlvtXuLyGpLienVanLoaiHinhVanTaiImpl.class,
				qlvtXuLyGpLienVanLoaiHinhVanTai.getPrimaryKey());
		}
	}

	/**
	 * Creates a new qlvt xu ly gp lien van loai hinh van tai with the primary key. Does not add the qlvt xu ly gp lien van loai hinh van tai to the database.
	 *
	 * @param id the primary key for the new qlvt xu ly gp lien van loai hinh van tai
	 * @return the new qlvt xu ly gp lien van loai hinh van tai
	 */
	@Override
	public QlvtXuLyGpLienVanLoaiHinhVanTai create(long id) {
		QlvtXuLyGpLienVanLoaiHinhVanTai qlvtXuLyGpLienVanLoaiHinhVanTai = new QlvtXuLyGpLienVanLoaiHinhVanTaiImpl();

		qlvtXuLyGpLienVanLoaiHinhVanTai.setNew(true);
		qlvtXuLyGpLienVanLoaiHinhVanTai.setPrimaryKey(id);

		return qlvtXuLyGpLienVanLoaiHinhVanTai;
	}

	/**
	 * Removes the qlvt xu ly gp lien van loai hinh van tai with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the qlvt xu ly gp lien van loai hinh van tai
	 * @return the qlvt xu ly gp lien van loai hinh van tai that was removed
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanLoaiHinhVanTaiException if a qlvt xu ly gp lien van loai hinh van tai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanLoaiHinhVanTai remove(long id)
		throws NoSuchQlvtXuLyGpLienVanLoaiHinhVanTaiException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the qlvt xu ly gp lien van loai hinh van tai with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qlvt xu ly gp lien van loai hinh van tai
	 * @return the qlvt xu ly gp lien van loai hinh van tai that was removed
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanLoaiHinhVanTaiException if a qlvt xu ly gp lien van loai hinh van tai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanLoaiHinhVanTai remove(Serializable primaryKey)
		throws NoSuchQlvtXuLyGpLienVanLoaiHinhVanTaiException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QlvtXuLyGpLienVanLoaiHinhVanTai qlvtXuLyGpLienVanLoaiHinhVanTai = (QlvtXuLyGpLienVanLoaiHinhVanTai)session.get(QlvtXuLyGpLienVanLoaiHinhVanTaiImpl.class,
					primaryKey);

			if (qlvtXuLyGpLienVanLoaiHinhVanTai == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQlvtXuLyGpLienVanLoaiHinhVanTaiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtXuLyGpLienVanLoaiHinhVanTai);
		}
		catch (NoSuchQlvtXuLyGpLienVanLoaiHinhVanTaiException nsee) {
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
	protected QlvtXuLyGpLienVanLoaiHinhVanTai removeImpl(
		QlvtXuLyGpLienVanLoaiHinhVanTai qlvtXuLyGpLienVanLoaiHinhVanTai)
		throws SystemException {
		qlvtXuLyGpLienVanLoaiHinhVanTai = toUnwrappedModel(qlvtXuLyGpLienVanLoaiHinhVanTai);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtXuLyGpLienVanLoaiHinhVanTai)) {
				qlvtXuLyGpLienVanLoaiHinhVanTai = (QlvtXuLyGpLienVanLoaiHinhVanTai)session.get(QlvtXuLyGpLienVanLoaiHinhVanTaiImpl.class,
						qlvtXuLyGpLienVanLoaiHinhVanTai.getPrimaryKeyObj());
			}

			if (qlvtXuLyGpLienVanLoaiHinhVanTai != null) {
				session.delete(qlvtXuLyGpLienVanLoaiHinhVanTai);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtXuLyGpLienVanLoaiHinhVanTai != null) {
			clearCache(qlvtXuLyGpLienVanLoaiHinhVanTai);
		}

		return qlvtXuLyGpLienVanLoaiHinhVanTai;
	}

	@Override
	public QlvtXuLyGpLienVanLoaiHinhVanTai updateImpl(
		vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanLoaiHinhVanTai qlvtXuLyGpLienVanLoaiHinhVanTai)
		throws SystemException {
		qlvtXuLyGpLienVanLoaiHinhVanTai = toUnwrappedModel(qlvtXuLyGpLienVanLoaiHinhVanTai);

		boolean isNew = qlvtXuLyGpLienVanLoaiHinhVanTai.isNew();

		QlvtXuLyGpLienVanLoaiHinhVanTaiModelImpl qlvtXuLyGpLienVanLoaiHinhVanTaiModelImpl =
			(QlvtXuLyGpLienVanLoaiHinhVanTaiModelImpl)qlvtXuLyGpLienVanLoaiHinhVanTai;

		Session session = null;

		try {
			session = openSession();

			if (qlvtXuLyGpLienVanLoaiHinhVanTai.isNew()) {
				session.save(qlvtXuLyGpLienVanLoaiHinhVanTai);

				qlvtXuLyGpLienVanLoaiHinhVanTai.setNew(false);
			}
			else {
				session.merge(qlvtXuLyGpLienVanLoaiHinhVanTai);
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
				!QlvtXuLyGpLienVanLoaiHinhVanTaiModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((qlvtXuLyGpLienVanLoaiHinhVanTaiModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GPLIENVANID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						qlvtXuLyGpLienVanLoaiHinhVanTaiModelImpl.getOriginalGpLienVanId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GPLIENVANID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GPLIENVANID,
					args);

				args = new Object[] {
						qlvtXuLyGpLienVanLoaiHinhVanTaiModelImpl.getGpLienVanId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GPLIENVANID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GPLIENVANID,
					args);
			}
		}

		EntityCacheUtil.putResult(QlvtXuLyGpLienVanLoaiHinhVanTaiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpLienVanLoaiHinhVanTaiImpl.class,
			qlvtXuLyGpLienVanLoaiHinhVanTai.getPrimaryKey(),
			qlvtXuLyGpLienVanLoaiHinhVanTai);

		return qlvtXuLyGpLienVanLoaiHinhVanTai;
	}

	protected QlvtXuLyGpLienVanLoaiHinhVanTai toUnwrappedModel(
		QlvtXuLyGpLienVanLoaiHinhVanTai qlvtXuLyGpLienVanLoaiHinhVanTai) {
		if (qlvtXuLyGpLienVanLoaiHinhVanTai instanceof QlvtXuLyGpLienVanLoaiHinhVanTaiImpl) {
			return qlvtXuLyGpLienVanLoaiHinhVanTai;
		}

		QlvtXuLyGpLienVanLoaiHinhVanTaiImpl qlvtXuLyGpLienVanLoaiHinhVanTaiImpl = new QlvtXuLyGpLienVanLoaiHinhVanTaiImpl();

		qlvtXuLyGpLienVanLoaiHinhVanTaiImpl.setNew(qlvtXuLyGpLienVanLoaiHinhVanTai.isNew());
		qlvtXuLyGpLienVanLoaiHinhVanTaiImpl.setPrimaryKey(qlvtXuLyGpLienVanLoaiHinhVanTai.getPrimaryKey());

		qlvtXuLyGpLienVanLoaiHinhVanTaiImpl.setId(qlvtXuLyGpLienVanLoaiHinhVanTai.getId());
		qlvtXuLyGpLienVanLoaiHinhVanTaiImpl.setGpLienVanId(qlvtXuLyGpLienVanLoaiHinhVanTai.getGpLienVanId());
		qlvtXuLyGpLienVanLoaiHinhVanTaiImpl.setMaLoaiHinhVanTai(qlvtXuLyGpLienVanLoaiHinhVanTai.getMaLoaiHinhVanTai());

		return qlvtXuLyGpLienVanLoaiHinhVanTaiImpl;
	}

	/**
	 * Returns the qlvt xu ly gp lien van loai hinh van tai with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt xu ly gp lien van loai hinh van tai
	 * @return the qlvt xu ly gp lien van loai hinh van tai
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanLoaiHinhVanTaiException if a qlvt xu ly gp lien van loai hinh van tai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanLoaiHinhVanTai findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchQlvtXuLyGpLienVanLoaiHinhVanTaiException, SystemException {
		QlvtXuLyGpLienVanLoaiHinhVanTai qlvtXuLyGpLienVanLoaiHinhVanTai = fetchByPrimaryKey(primaryKey);

		if (qlvtXuLyGpLienVanLoaiHinhVanTai == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQlvtXuLyGpLienVanLoaiHinhVanTaiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtXuLyGpLienVanLoaiHinhVanTai;
	}

	/**
	 * Returns the qlvt xu ly gp lien van loai hinh van tai with the primary key or throws a {@link vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanLoaiHinhVanTaiException} if it could not be found.
	 *
	 * @param id the primary key of the qlvt xu ly gp lien van loai hinh van tai
	 * @return the qlvt xu ly gp lien van loai hinh van tai
	 * @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanLoaiHinhVanTaiException if a qlvt xu ly gp lien van loai hinh van tai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanLoaiHinhVanTai findByPrimaryKey(long id)
		throws NoSuchQlvtXuLyGpLienVanLoaiHinhVanTaiException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the qlvt xu ly gp lien van loai hinh van tai with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt xu ly gp lien van loai hinh van tai
	 * @return the qlvt xu ly gp lien van loai hinh van tai, or <code>null</code> if a qlvt xu ly gp lien van loai hinh van tai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanLoaiHinhVanTai fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		QlvtXuLyGpLienVanLoaiHinhVanTai qlvtXuLyGpLienVanLoaiHinhVanTai = (QlvtXuLyGpLienVanLoaiHinhVanTai)EntityCacheUtil.getResult(QlvtXuLyGpLienVanLoaiHinhVanTaiModelImpl.ENTITY_CACHE_ENABLED,
				QlvtXuLyGpLienVanLoaiHinhVanTaiImpl.class, primaryKey);

		if (qlvtXuLyGpLienVanLoaiHinhVanTai == _nullQlvtXuLyGpLienVanLoaiHinhVanTai) {
			return null;
		}

		if (qlvtXuLyGpLienVanLoaiHinhVanTai == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtXuLyGpLienVanLoaiHinhVanTai = (QlvtXuLyGpLienVanLoaiHinhVanTai)session.get(QlvtXuLyGpLienVanLoaiHinhVanTaiImpl.class,
						primaryKey);

				if (qlvtXuLyGpLienVanLoaiHinhVanTai != null) {
					cacheResult(qlvtXuLyGpLienVanLoaiHinhVanTai);
				}
				else {
					EntityCacheUtil.putResult(QlvtXuLyGpLienVanLoaiHinhVanTaiModelImpl.ENTITY_CACHE_ENABLED,
						QlvtXuLyGpLienVanLoaiHinhVanTaiImpl.class, primaryKey,
						_nullQlvtXuLyGpLienVanLoaiHinhVanTai);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QlvtXuLyGpLienVanLoaiHinhVanTaiModelImpl.ENTITY_CACHE_ENABLED,
					QlvtXuLyGpLienVanLoaiHinhVanTaiImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtXuLyGpLienVanLoaiHinhVanTai;
	}

	/**
	 * Returns the qlvt xu ly gp lien van loai hinh van tai with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the qlvt xu ly gp lien van loai hinh van tai
	 * @return the qlvt xu ly gp lien van loai hinh van tai, or <code>null</code> if a qlvt xu ly gp lien van loai hinh van tai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpLienVanLoaiHinhVanTai fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the qlvt xu ly gp lien van loai hinh van tais.
	 *
	 * @return the qlvt xu ly gp lien van loai hinh van tais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpLienVanLoaiHinhVanTai> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt xu ly gp lien van loai hinh van tais.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanLoaiHinhVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt xu ly gp lien van loai hinh van tais
	 * @param end the upper bound of the range of qlvt xu ly gp lien van loai hinh van tais (not inclusive)
	 * @return the range of qlvt xu ly gp lien van loai hinh van tais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpLienVanLoaiHinhVanTai> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt xu ly gp lien van loai hinh van tais.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanLoaiHinhVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt xu ly gp lien van loai hinh van tais
	 * @param end the upper bound of the range of qlvt xu ly gp lien van loai hinh van tais (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qlvt xu ly gp lien van loai hinh van tais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpLienVanLoaiHinhVanTai> findAll(int start, int end,
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

		List<QlvtXuLyGpLienVanLoaiHinhVanTai> list = (List<QlvtXuLyGpLienVanLoaiHinhVanTai>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTXULYGPLIENVANLOAIHINHVANTAI);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTXULYGPLIENVANLOAIHINHVANTAI;

				if (pagination) {
					sql = sql.concat(QlvtXuLyGpLienVanLoaiHinhVanTaiModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QlvtXuLyGpLienVanLoaiHinhVanTai>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtXuLyGpLienVanLoaiHinhVanTai>(list);
				}
				else {
					list = (List<QlvtXuLyGpLienVanLoaiHinhVanTai>)QueryUtil.list(q,
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
	 * Removes all the qlvt xu ly gp lien van loai hinh van tais from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QlvtXuLyGpLienVanLoaiHinhVanTai qlvtXuLyGpLienVanLoaiHinhVanTai : findAll()) {
			remove(qlvtXuLyGpLienVanLoaiHinhVanTai);
		}
	}

	/**
	 * Returns the number of qlvt xu ly gp lien van loai hinh van tais.
	 *
	 * @return the number of qlvt xu ly gp lien van loai hinh van tais
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

				Query q = session.createQuery(_SQL_COUNT_QLVTXULYGPLIENVANLOAIHINHVANTAI);

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
	 * Initializes the qlvt xu ly gp lien van loai hinh van tai persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanLoaiHinhVanTai")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QlvtXuLyGpLienVanLoaiHinhVanTai>> listenersList =
					new ArrayList<ModelListener<QlvtXuLyGpLienVanLoaiHinhVanTai>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QlvtXuLyGpLienVanLoaiHinhVanTai>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QlvtXuLyGpLienVanLoaiHinhVanTaiImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTXULYGPLIENVANLOAIHINHVANTAI = "SELECT qlvtXuLyGpLienVanLoaiHinhVanTai FROM QlvtXuLyGpLienVanLoaiHinhVanTai qlvtXuLyGpLienVanLoaiHinhVanTai";
	private static final String _SQL_SELECT_QLVTXULYGPLIENVANLOAIHINHVANTAI_WHERE =
		"SELECT qlvtXuLyGpLienVanLoaiHinhVanTai FROM QlvtXuLyGpLienVanLoaiHinhVanTai qlvtXuLyGpLienVanLoaiHinhVanTai WHERE ";
	private static final String _SQL_COUNT_QLVTXULYGPLIENVANLOAIHINHVANTAI = "SELECT COUNT(qlvtXuLyGpLienVanLoaiHinhVanTai) FROM QlvtXuLyGpLienVanLoaiHinhVanTai qlvtXuLyGpLienVanLoaiHinhVanTai";
	private static final String _SQL_COUNT_QLVTXULYGPLIENVANLOAIHINHVANTAI_WHERE =
		"SELECT COUNT(qlvtXuLyGpLienVanLoaiHinhVanTai) FROM QlvtXuLyGpLienVanLoaiHinhVanTai qlvtXuLyGpLienVanLoaiHinhVanTai WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtXuLyGpLienVanLoaiHinhVanTai.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QlvtXuLyGpLienVanLoaiHinhVanTai exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No QlvtXuLyGpLienVanLoaiHinhVanTai exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QlvtXuLyGpLienVanLoaiHinhVanTaiPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "gpLienVanId", "maLoaiHinhVanTai"
			});
	private static QlvtXuLyGpLienVanLoaiHinhVanTai _nullQlvtXuLyGpLienVanLoaiHinhVanTai =
		new QlvtXuLyGpLienVanLoaiHinhVanTaiImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QlvtXuLyGpLienVanLoaiHinhVanTai> toCacheModel() {
				return _nullQlvtXuLyGpLienVanLoaiHinhVanTaiCacheModel;
			}
		};

	private static CacheModel<QlvtXuLyGpLienVanLoaiHinhVanTai> _nullQlvtXuLyGpLienVanLoaiHinhVanTaiCacheModel =
		new CacheModel<QlvtXuLyGpLienVanLoaiHinhVanTai>() {
			@Override
			public QlvtXuLyGpLienVanLoaiHinhVanTai toEntityModel() {
				return _nullQlvtXuLyGpLienVanLoaiHinhVanTai;
			}
		};
}