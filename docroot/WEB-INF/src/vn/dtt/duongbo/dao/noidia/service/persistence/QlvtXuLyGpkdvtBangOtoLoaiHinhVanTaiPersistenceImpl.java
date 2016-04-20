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

package vn.dtt.duongbo.dao.noidia.service.persistence;

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

import vn.dtt.duongbo.dao.noidia.NoSuchQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiException;
import vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai;
import vn.dtt.duongbo.dao.noidia.model.impl.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl;
import vn.dtt.duongbo.dao.noidia.model.impl.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the qlvt xu ly gpkdvt bang oto loai hinh van tai service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NoiPham
 * @see QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiPersistence
 * @see QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiUtil
 * @generated
 */
public class QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiPersistenceImpl
	extends BasePersistenceImpl<QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai>
	implements QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiUtil} to access the qlvt xu ly gpkdvt bang oto loai hinh van tai persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl.FINDER_CACHE_ENABLED,
			QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl.FINDER_CACHE_ENABLED,
			QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GPKDVTBANGOTOID =
		new FinderPath(QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl.FINDER_CACHE_ENABLED,
			QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygpkdvtBangOtoId",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GPKDVTBANGOTOID =
		new FinderPath(QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl.FINDER_CACHE_ENABLED,
			QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygpkdvtBangOtoId",
			new String[] { Integer.class.getName() },
			QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl.GPKDVTBANGOTOID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GPKDVTBANGOTOID = new FinderPath(QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygpkdvtBangOtoId", new String[] { Integer.class.getName() });

	/**
	 * Returns all the qlvt xu ly gpkdvt bang oto loai hinh van tais where gpkdvtBangOtoId = &#63;.
	 *
	 * @param gpkdvtBangOtoId the gpkdvt bang oto ID
	 * @return the matching qlvt xu ly gpkdvt bang oto loai hinh van tais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai> findBygpkdvtBangOtoId(
		int gpkdvtBangOtoId) throws SystemException {
		return findBygpkdvtBangOtoId(gpkdvtBangOtoId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt xu ly gpkdvt bang oto loai hinh van tais where gpkdvtBangOtoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.noidia.model.impl.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param gpkdvtBangOtoId the gpkdvt bang oto ID
	 * @param start the lower bound of the range of qlvt xu ly gpkdvt bang oto loai hinh van tais
	 * @param end the upper bound of the range of qlvt xu ly gpkdvt bang oto loai hinh van tais (not inclusive)
	 * @return the range of matching qlvt xu ly gpkdvt bang oto loai hinh van tais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai> findBygpkdvtBangOtoId(
		int gpkdvtBangOtoId, int start, int end) throws SystemException {
		return findBygpkdvtBangOtoId(gpkdvtBangOtoId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt xu ly gpkdvt bang oto loai hinh van tais where gpkdvtBangOtoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.noidia.model.impl.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param gpkdvtBangOtoId the gpkdvt bang oto ID
	 * @param start the lower bound of the range of qlvt xu ly gpkdvt bang oto loai hinh van tais
	 * @param end the upper bound of the range of qlvt xu ly gpkdvt bang oto loai hinh van tais (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching qlvt xu ly gpkdvt bang oto loai hinh van tais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai> findBygpkdvtBangOtoId(
		int gpkdvtBangOtoId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GPKDVTBANGOTOID;
			finderArgs = new Object[] { gpkdvtBangOtoId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GPKDVTBANGOTOID;
			finderArgs = new Object[] {
					gpkdvtBangOtoId,
					
					start, end, orderByComparator
				};
		}

		List<QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai> list = (List<QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai : list) {
				if ((gpkdvtBangOtoId != qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.getGpkdvtBangOtoId())) {
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

			query.append(_SQL_SELECT_QLVTXULYGPKDVTBANGOTOLOAIHINHVANTAI_WHERE);

			query.append(_FINDER_COLUMN_GPKDVTBANGOTOID_GPKDVTBANGOTOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(gpkdvtBangOtoId);

				if (!pagination) {
					list = (List<QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai>(list);
				}
				else {
					list = (List<QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai>)QueryUtil.list(q,
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
	 * Returns the first qlvt xu ly gpkdvt bang oto loai hinh van tai in the ordered set where gpkdvtBangOtoId = &#63;.
	 *
	 * @param gpkdvtBangOtoId the gpkdvt bang oto ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qlvt xu ly gpkdvt bang oto loai hinh van tai
	 * @throws vn.dtt.duongbo.dao.noidia.NoSuchQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiException if a matching qlvt xu ly gpkdvt bang oto loai hinh van tai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai findBygpkdvtBangOtoId_First(
		int gpkdvtBangOtoId, OrderByComparator orderByComparator)
		throws NoSuchQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiException,
			SystemException {
		QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai = fetchBygpkdvtBangOtoId_First(gpkdvtBangOtoId,
				orderByComparator);

		if (qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai != null) {
			return qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("gpkdvtBangOtoId=");
		msg.append(gpkdvtBangOtoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiException(msg.toString());
	}

	/**
	 * Returns the first qlvt xu ly gpkdvt bang oto loai hinh van tai in the ordered set where gpkdvtBangOtoId = &#63;.
	 *
	 * @param gpkdvtBangOtoId the gpkdvt bang oto ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qlvt xu ly gpkdvt bang oto loai hinh van tai, or <code>null</code> if a matching qlvt xu ly gpkdvt bang oto loai hinh van tai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai fetchBygpkdvtBangOtoId_First(
		int gpkdvtBangOtoId, OrderByComparator orderByComparator)
		throws SystemException {
		List<QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai> list = findBygpkdvtBangOtoId(gpkdvtBangOtoId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last qlvt xu ly gpkdvt bang oto loai hinh van tai in the ordered set where gpkdvtBangOtoId = &#63;.
	 *
	 * @param gpkdvtBangOtoId the gpkdvt bang oto ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qlvt xu ly gpkdvt bang oto loai hinh van tai
	 * @throws vn.dtt.duongbo.dao.noidia.NoSuchQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiException if a matching qlvt xu ly gpkdvt bang oto loai hinh van tai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai findBygpkdvtBangOtoId_Last(
		int gpkdvtBangOtoId, OrderByComparator orderByComparator)
		throws NoSuchQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiException,
			SystemException {
		QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai = fetchBygpkdvtBangOtoId_Last(gpkdvtBangOtoId,
				orderByComparator);

		if (qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai != null) {
			return qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("gpkdvtBangOtoId=");
		msg.append(gpkdvtBangOtoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiException(msg.toString());
	}

	/**
	 * Returns the last qlvt xu ly gpkdvt bang oto loai hinh van tai in the ordered set where gpkdvtBangOtoId = &#63;.
	 *
	 * @param gpkdvtBangOtoId the gpkdvt bang oto ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qlvt xu ly gpkdvt bang oto loai hinh van tai, or <code>null</code> if a matching qlvt xu ly gpkdvt bang oto loai hinh van tai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai fetchBygpkdvtBangOtoId_Last(
		int gpkdvtBangOtoId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBygpkdvtBangOtoId(gpkdvtBangOtoId);

		if (count == 0) {
			return null;
		}

		List<QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai> list = findBygpkdvtBangOtoId(gpkdvtBangOtoId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the qlvt xu ly gpkdvt bang oto loai hinh van tais before and after the current qlvt xu ly gpkdvt bang oto loai hinh van tai in the ordered set where gpkdvtBangOtoId = &#63;.
	 *
	 * @param id the primary key of the current qlvt xu ly gpkdvt bang oto loai hinh van tai
	 * @param gpkdvtBangOtoId the gpkdvt bang oto ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next qlvt xu ly gpkdvt bang oto loai hinh van tai
	 * @throws vn.dtt.duongbo.dao.noidia.NoSuchQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiException if a qlvt xu ly gpkdvt bang oto loai hinh van tai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai[] findBygpkdvtBangOtoId_PrevAndNext(
		long id, int gpkdvtBangOtoId, OrderByComparator orderByComparator)
		throws NoSuchQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiException,
			SystemException {
		QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai[] array = new QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl[3];

			array[0] = getBygpkdvtBangOtoId_PrevAndNext(session,
					qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai, gpkdvtBangOtoId,
					orderByComparator, true);

			array[1] = qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai;

			array[2] = getBygpkdvtBangOtoId_PrevAndNext(session,
					qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai, gpkdvtBangOtoId,
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

	protected QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai getBygpkdvtBangOtoId_PrevAndNext(
		Session session,
		QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai,
		int gpkdvtBangOtoId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_QLVTXULYGPKDVTBANGOTOLOAIHINHVANTAI_WHERE);

		query.append(_FINDER_COLUMN_GPKDVTBANGOTOID_GPKDVTBANGOTOID_2);

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
			query.append(QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(gpkdvtBangOtoId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the qlvt xu ly gpkdvt bang oto loai hinh van tais where gpkdvtBangOtoId = &#63; from the database.
	 *
	 * @param gpkdvtBangOtoId the gpkdvt bang oto ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBygpkdvtBangOtoId(int gpkdvtBangOtoId)
		throws SystemException {
		for (QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai : findBygpkdvtBangOtoId(
				gpkdvtBangOtoId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai);
		}
	}

	/**
	 * Returns the number of qlvt xu ly gpkdvt bang oto loai hinh van tais where gpkdvtBangOtoId = &#63;.
	 *
	 * @param gpkdvtBangOtoId the gpkdvt bang oto ID
	 * @return the number of matching qlvt xu ly gpkdvt bang oto loai hinh van tais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBygpkdvtBangOtoId(int gpkdvtBangOtoId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GPKDVTBANGOTOID;

		Object[] finderArgs = new Object[] { gpkdvtBangOtoId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_QLVTXULYGPKDVTBANGOTOLOAIHINHVANTAI_WHERE);

			query.append(_FINDER_COLUMN_GPKDVTBANGOTOID_GPKDVTBANGOTOID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(gpkdvtBangOtoId);

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

	private static final String _FINDER_COLUMN_GPKDVTBANGOTOID_GPKDVTBANGOTOID_2 =
		"qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.gpkdvtBangOtoId = ?";

	public QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiPersistenceImpl() {
		setModelClass(QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.class);
	}

	/**
	 * Caches the qlvt xu ly gpkdvt bang oto loai hinh van tai in the entity cache if it is enabled.
	 *
	 * @param qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai the qlvt xu ly gpkdvt bang oto loai hinh van tai
	 */
	@Override
	public void cacheResult(
		QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai) {
		EntityCacheUtil.putResult(QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.class,
			qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.getPrimaryKey(),
			qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai);

		qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.resetOriginalValues();
	}

	/**
	 * Caches the qlvt xu ly gpkdvt bang oto loai hinh van tais in the entity cache if it is enabled.
	 *
	 * @param qlvtXuLyGpkdvtBangOtoLoaiHinhVanTais the qlvt xu ly gpkdvt bang oto loai hinh van tais
	 */
	@Override
	public void cacheResult(
		List<QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai> qlvtXuLyGpkdvtBangOtoLoaiHinhVanTais) {
		for (QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai : qlvtXuLyGpkdvtBangOtoLoaiHinhVanTais) {
			if (EntityCacheUtil.getResult(
						QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl.ENTITY_CACHE_ENABLED,
						QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.class,
						qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.getPrimaryKey()) == null) {
				cacheResult(qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai);
			}
			else {
				qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qlvt xu ly gpkdvt bang oto loai hinh van tais.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qlvt xu ly gpkdvt bang oto loai hinh van tai.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai) {
		EntityCacheUtil.removeResult(QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.class,
			qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai> qlvtXuLyGpkdvtBangOtoLoaiHinhVanTais) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai : qlvtXuLyGpkdvtBangOtoLoaiHinhVanTais) {
			EntityCacheUtil.removeResult(QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl.ENTITY_CACHE_ENABLED,
				QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.class,
				qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.getPrimaryKey());
		}
	}

	/**
	 * Creates a new qlvt xu ly gpkdvt bang oto loai hinh van tai with the primary key. Does not add the qlvt xu ly gpkdvt bang oto loai hinh van tai to the database.
	 *
	 * @param id the primary key for the new qlvt xu ly gpkdvt bang oto loai hinh van tai
	 * @return the new qlvt xu ly gpkdvt bang oto loai hinh van tai
	 */
	@Override
	public QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai create(long id) {
		QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai = new QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl();

		qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.setNew(true);
		qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.setPrimaryKey(id);

		return qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai;
	}

	/**
	 * Removes the qlvt xu ly gpkdvt bang oto loai hinh van tai with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the qlvt xu ly gpkdvt bang oto loai hinh van tai
	 * @return the qlvt xu ly gpkdvt bang oto loai hinh van tai that was removed
	 * @throws vn.dtt.duongbo.dao.noidia.NoSuchQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiException if a qlvt xu ly gpkdvt bang oto loai hinh van tai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai remove(long id)
		throws NoSuchQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiException,
			SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the qlvt xu ly gpkdvt bang oto loai hinh van tai with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qlvt xu ly gpkdvt bang oto loai hinh van tai
	 * @return the qlvt xu ly gpkdvt bang oto loai hinh van tai that was removed
	 * @throws vn.dtt.duongbo.dao.noidia.NoSuchQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiException if a qlvt xu ly gpkdvt bang oto loai hinh van tai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai remove(Serializable primaryKey)
		throws NoSuchQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiException,
			SystemException {
		Session session = null;

		try {
			session = openSession();

			QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai =
				(QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai)session.get(QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.class,
					primaryKey);

			if (qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai);
		}
		catch (NoSuchQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiException nsee) {
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
	protected QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai removeImpl(
		QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai)
		throws SystemException {
		qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai = toUnwrappedModel(qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai)) {
				qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai = (QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai)session.get(QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.class,
						qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.getPrimaryKeyObj());
			}

			if (qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai != null) {
				session.delete(qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai != null) {
			clearCache(qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai);
		}

		return qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai;
	}

	@Override
	public QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai updateImpl(
		vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai)
		throws SystemException {
		qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai = toUnwrappedModel(qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai);

		boolean isNew = qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.isNew();

		QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl =
			(QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl)qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai;

		Session session = null;

		try {
			session = openSession();

			if (qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.isNew()) {
				session.save(qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai);

				qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.setNew(false);
			}
			else {
				session.merge(qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai);
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
				!QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GPKDVTBANGOTOID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl.getOriginalGpkdvtBangOtoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GPKDVTBANGOTOID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GPKDVTBANGOTOID,
					args);

				args = new Object[] {
						qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl.getGpkdvtBangOtoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GPKDVTBANGOTOID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GPKDVTBANGOTOID,
					args);
			}
		}

		EntityCacheUtil.putResult(QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.class,
			qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.getPrimaryKey(),
			qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai);

		return qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai;
	}

	protected QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai toUnwrappedModel(
		QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai) {
		if (qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai instanceof QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl) {
			return qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai;
		}

		QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl =
			new QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl();

		qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.setNew(qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.isNew());
		qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.setPrimaryKey(qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.getPrimaryKey());

		qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.setId(qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.getId());
		qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.setGpkdvtBangOtoId(qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.getGpkdvtBangOtoId());
		qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.setMaLoaiHinhHoatDong(qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.getMaLoaiHinhHoatDong());
		qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.setLoaiHinhKinhDoanhCuThe(qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.getLoaiHinhKinhDoanhCuThe());
		qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.setSoLuongPhuongTien(qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.getSoLuongPhuongTien());
		qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.setThietBiGiamSatHanhTrinh(qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.getThietBiGiamSatHanhTrinh());
		qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.setPhamViHoatDong(qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.getPhamViHoatDong());
		qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.setTuyenTu(qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.getTuyenTu());
		qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.setTuyenDen(qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.getTuyenDen());
		qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.setSoChuyen(qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.getSoChuyen());
		qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.setMauSon(qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.getMauSon());
		qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.setKetQuaXuLy(qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.getKetQuaXuLy());

		return qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl;
	}

	/**
	 * Returns the qlvt xu ly gpkdvt bang oto loai hinh van tai with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt xu ly gpkdvt bang oto loai hinh van tai
	 * @return the qlvt xu ly gpkdvt bang oto loai hinh van tai
	 * @throws vn.dtt.duongbo.dao.noidia.NoSuchQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiException if a qlvt xu ly gpkdvt bang oto loai hinh van tai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiException,
			SystemException {
		QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai = fetchByPrimaryKey(primaryKey);

		if (qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai;
	}

	/**
	 * Returns the qlvt xu ly gpkdvt bang oto loai hinh van tai with the primary key or throws a {@link vn.dtt.duongbo.dao.noidia.NoSuchQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiException} if it could not be found.
	 *
	 * @param id the primary key of the qlvt xu ly gpkdvt bang oto loai hinh van tai
	 * @return the qlvt xu ly gpkdvt bang oto loai hinh van tai
	 * @throws vn.dtt.duongbo.dao.noidia.NoSuchQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiException if a qlvt xu ly gpkdvt bang oto loai hinh van tai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai findByPrimaryKey(long id)
		throws NoSuchQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiException,
			SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the qlvt xu ly gpkdvt bang oto loai hinh van tai with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt xu ly gpkdvt bang oto loai hinh van tai
	 * @return the qlvt xu ly gpkdvt bang oto loai hinh van tai, or <code>null</code> if a qlvt xu ly gpkdvt bang oto loai hinh van tai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai = (QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai)EntityCacheUtil.getResult(QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl.ENTITY_CACHE_ENABLED,
				QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.class, primaryKey);

		if (qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai == _nullQlvtXuLyGpkdvtBangOtoLoaiHinhVanTai) {
			return null;
		}

		if (qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai = (QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai)session.get(QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.class,
						primaryKey);

				if (qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai != null) {
					cacheResult(qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai);
				}
				else {
					EntityCacheUtil.putResult(QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl.ENTITY_CACHE_ENABLED,
						QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.class,
						primaryKey, _nullQlvtXuLyGpkdvtBangOtoLoaiHinhVanTai);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl.ENTITY_CACHE_ENABLED,
					QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai;
	}

	/**
	 * Returns the qlvt xu ly gpkdvt bang oto loai hinh van tai with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the qlvt xu ly gpkdvt bang oto loai hinh van tai
	 * @return the qlvt xu ly gpkdvt bang oto loai hinh van tai, or <code>null</code> if a qlvt xu ly gpkdvt bang oto loai hinh van tai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the qlvt xu ly gpkdvt bang oto loai hinh van tais.
	 *
	 * @return the qlvt xu ly gpkdvt bang oto loai hinh van tais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt xu ly gpkdvt bang oto loai hinh van tais.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.noidia.model.impl.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt xu ly gpkdvt bang oto loai hinh van tais
	 * @param end the upper bound of the range of qlvt xu ly gpkdvt bang oto loai hinh van tais (not inclusive)
	 * @return the range of qlvt xu ly gpkdvt bang oto loai hinh van tais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt xu ly gpkdvt bang oto loai hinh van tais.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.noidia.model.impl.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt xu ly gpkdvt bang oto loai hinh van tais
	 * @param end the upper bound of the range of qlvt xu ly gpkdvt bang oto loai hinh van tais (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qlvt xu ly gpkdvt bang oto loai hinh van tais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai> findAll(int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
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

		List<QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai> list = (List<QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTXULYGPKDVTBANGOTOLOAIHINHVANTAI);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTXULYGPKDVTBANGOTOLOAIHINHVANTAI;

				if (pagination) {
					sql = sql.concat(QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai>(list);
				}
				else {
					list = (List<QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai>)QueryUtil.list(q,
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
	 * Removes all the qlvt xu ly gpkdvt bang oto loai hinh van tais from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai : findAll()) {
			remove(qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai);
		}
	}

	/**
	 * Returns the number of qlvt xu ly gpkdvt bang oto loai hinh van tais.
	 *
	 * @return the number of qlvt xu ly gpkdvt bang oto loai hinh van tais
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

				Query q = session.createQuery(_SQL_COUNT_QLVTXULYGPKDVTBANGOTOLOAIHINHVANTAI);

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
	 * Initializes the qlvt xu ly gpkdvt bang oto loai hinh van tai persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai>> listenersList =
					new ArrayList<ModelListener<QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTXULYGPKDVTBANGOTOLOAIHINHVANTAI = "SELECT qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai FROM QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai";
	private static final String _SQL_SELECT_QLVTXULYGPKDVTBANGOTOLOAIHINHVANTAI_WHERE =
		"SELECT qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai FROM QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai WHERE ";
	private static final String _SQL_COUNT_QLVTXULYGPKDVTBANGOTOLOAIHINHVANTAI = "SELECT COUNT(qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai) FROM QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai";
	private static final String _SQL_COUNT_QLVTXULYGPKDVTBANGOTOLOAIHINHVANTAI_WHERE =
		"SELECT COUNT(qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai) FROM QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "gpkdvtBangOtoId", "maLoaiHinhHoatDong",
				"loaiHinhKinhDoanhCuThe", "soLuongPhuongTien",
				"thietBiGiamSatHanhTrinh", "phamViHoatDong", "tuyenTu",
				"tuyenDen", "soChuyen", "mauSon", "ketQuaXuLy"
			});
	private static QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai _nullQlvtXuLyGpkdvtBangOtoLoaiHinhVanTai =
		new QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai> toCacheModel() {
				return _nullQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiCacheModel;
			}
		};

	private static CacheModel<QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai> _nullQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiCacheModel =
		new CacheModel<QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai>() {
			@Override
			public QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai toEntityModel() {
				return _nullQlvtXuLyGpkdvtBangOtoLoaiHinhVanTai;
			}
		};
}