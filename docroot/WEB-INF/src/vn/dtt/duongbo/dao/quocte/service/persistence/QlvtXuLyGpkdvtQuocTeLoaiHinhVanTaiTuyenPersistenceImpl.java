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

import vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenException;
import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen;
import vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl;
import vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NoiPham
 * @see QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenPersistence
 * @see QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenUtil
 * @generated
 */
public class QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenPersistenceImpl
	extends BasePersistenceImpl<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen>
	implements QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenUtil} to access the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl.FINDER_CACHE_ENABLED,
			QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl.FINDER_CACHE_ENABLED,
			QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GPKDLOAIHINHKDID =
		new FinderPath(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl.FINDER_CACHE_ENABLED,
			QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygpkdLoaiHinhKdId",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GPKDLOAIHINHKDID =
		new FinderPath(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl.FINDER_CACHE_ENABLED,
			QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygpkdLoaiHinhKdId", new String[] { Integer.class.getName() },
			QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl.GPKDLOAIHINHKDID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GPKDLOAIHINHKDID = new FinderPath(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygpkdLoaiHinhKdId", new String[] { Integer.class.getName() });

	/**
	 * Returns all the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens where gpkdLoaiHinhKdId = &#63;.
	 *
	 * @param gpkdLoaiHinhKdId the gpkd loai hinh kd ID
	 * @return the matching qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen> findBygpkdLoaiHinhKdId(
		int gpkdLoaiHinhKdId) throws SystemException {
		return findBygpkdLoaiHinhKdId(gpkdLoaiHinhKdId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens where gpkdLoaiHinhKdId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param gpkdLoaiHinhKdId the gpkd loai hinh kd ID
	 * @param start the lower bound of the range of qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens
	 * @param end the upper bound of the range of qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens (not inclusive)
	 * @return the range of matching qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen> findBygpkdLoaiHinhKdId(
		int gpkdLoaiHinhKdId, int start, int end) throws SystemException {
		return findBygpkdLoaiHinhKdId(gpkdLoaiHinhKdId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens where gpkdLoaiHinhKdId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param gpkdLoaiHinhKdId the gpkd loai hinh kd ID
	 * @param start the lower bound of the range of qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens
	 * @param end the upper bound of the range of qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen> findBygpkdLoaiHinhKdId(
		int gpkdLoaiHinhKdId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GPKDLOAIHINHKDID;
			finderArgs = new Object[] { gpkdLoaiHinhKdId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GPKDLOAIHINHKDID;
			finderArgs = new Object[] {
					gpkdLoaiHinhKdId,
					
					start, end, orderByComparator
				};
		}

		List<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen> list = (List<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen : list) {
				if ((gpkdLoaiHinhKdId != qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.getGpkdLoaiHinhKdId())) {
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

			query.append(_SQL_SELECT_QLVTXULYGPKDVTQUOCTELOAIHINHVANTAITUYEN_WHERE);

			query.append(_FINDER_COLUMN_GPKDLOAIHINHKDID_GPKDLOAIHINHKDID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(gpkdLoaiHinhKdId);

				if (!pagination) {
					list = (List<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen>(list);
				}
				else {
					list = (List<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen>)QueryUtil.list(q,
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
	 * Returns the first qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen in the ordered set where gpkdLoaiHinhKdId = &#63;.
	 *
	 * @param gpkdLoaiHinhKdId the gpkd loai hinh kd ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen
	 * @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenException if a matching qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen findBygpkdLoaiHinhKdId_First(
		int gpkdLoaiHinhKdId, OrderByComparator orderByComparator)
		throws NoSuchQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenException,
			SystemException {
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen =
			fetchBygpkdLoaiHinhKdId_First(gpkdLoaiHinhKdId, orderByComparator);

		if (qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen != null) {
			return qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("gpkdLoaiHinhKdId=");
		msg.append(gpkdLoaiHinhKdId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenException(msg.toString());
	}

	/**
	 * Returns the first qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen in the ordered set where gpkdLoaiHinhKdId = &#63;.
	 *
	 * @param gpkdLoaiHinhKdId the gpkd loai hinh kd ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen, or <code>null</code> if a matching qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen fetchBygpkdLoaiHinhKdId_First(
		int gpkdLoaiHinhKdId, OrderByComparator orderByComparator)
		throws SystemException {
		List<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen> list = findBygpkdLoaiHinhKdId(gpkdLoaiHinhKdId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen in the ordered set where gpkdLoaiHinhKdId = &#63;.
	 *
	 * @param gpkdLoaiHinhKdId the gpkd loai hinh kd ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen
	 * @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenException if a matching qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen findBygpkdLoaiHinhKdId_Last(
		int gpkdLoaiHinhKdId, OrderByComparator orderByComparator)
		throws NoSuchQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenException,
			SystemException {
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen =
			fetchBygpkdLoaiHinhKdId_Last(gpkdLoaiHinhKdId, orderByComparator);

		if (qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen != null) {
			return qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("gpkdLoaiHinhKdId=");
		msg.append(gpkdLoaiHinhKdId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenException(msg.toString());
	}

	/**
	 * Returns the last qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen in the ordered set where gpkdLoaiHinhKdId = &#63;.
	 *
	 * @param gpkdLoaiHinhKdId the gpkd loai hinh kd ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen, or <code>null</code> if a matching qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen fetchBygpkdLoaiHinhKdId_Last(
		int gpkdLoaiHinhKdId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBygpkdLoaiHinhKdId(gpkdLoaiHinhKdId);

		if (count == 0) {
			return null;
		}

		List<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen> list = findBygpkdLoaiHinhKdId(gpkdLoaiHinhKdId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens before and after the current qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen in the ordered set where gpkdLoaiHinhKdId = &#63;.
	 *
	 * @param id the primary key of the current qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen
	 * @param gpkdLoaiHinhKdId the gpkd loai hinh kd ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen
	 * @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenException if a qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen[] findBygpkdLoaiHinhKdId_PrevAndNext(
		long id, int gpkdLoaiHinhKdId, OrderByComparator orderByComparator)
		throws NoSuchQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenException,
			SystemException {
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen =
			findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen[] array = new QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl[3];

			array[0] = getBygpkdLoaiHinhKdId_PrevAndNext(session,
					qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen, gpkdLoaiHinhKdId,
					orderByComparator, true);

			array[1] = qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen;

			array[2] = getBygpkdLoaiHinhKdId_PrevAndNext(session,
					qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen, gpkdLoaiHinhKdId,
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

	protected QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen getBygpkdLoaiHinhKdId_PrevAndNext(
		Session session,
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen,
		int gpkdLoaiHinhKdId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_QLVTXULYGPKDVTQUOCTELOAIHINHVANTAITUYEN_WHERE);

		query.append(_FINDER_COLUMN_GPKDLOAIHINHKDID_GPKDLOAIHINHKDID_2);

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
			query.append(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(gpkdLoaiHinhKdId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens where gpkdLoaiHinhKdId = &#63; from the database.
	 *
	 * @param gpkdLoaiHinhKdId the gpkd loai hinh kd ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBygpkdLoaiHinhKdId(int gpkdLoaiHinhKdId)
		throws SystemException {
		for (QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen : findBygpkdLoaiHinhKdId(
				gpkdLoaiHinhKdId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen);
		}
	}

	/**
	 * Returns the number of qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens where gpkdLoaiHinhKdId = &#63;.
	 *
	 * @param gpkdLoaiHinhKdId the gpkd loai hinh kd ID
	 * @return the number of matching qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBygpkdLoaiHinhKdId(int gpkdLoaiHinhKdId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GPKDLOAIHINHKDID;

		Object[] finderArgs = new Object[] { gpkdLoaiHinhKdId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_QLVTXULYGPKDVTQUOCTELOAIHINHVANTAITUYEN_WHERE);

			query.append(_FINDER_COLUMN_GPKDLOAIHINHKDID_GPKDLOAIHINHKDID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(gpkdLoaiHinhKdId);

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

	private static final String _FINDER_COLUMN_GPKDLOAIHINHKDID_GPKDLOAIHINHKDID_2 =
		"qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.gpkdLoaiHinhKdId = ?";

	public QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenPersistenceImpl() {
		setModelClass(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.class);
	}

	/**
	 * Caches the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen in the entity cache if it is enabled.
	 *
	 * @param qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen
	 */
	@Override
	public void cacheResult(
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen) {
		EntityCacheUtil.putResult(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl.class,
			qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.getPrimaryKey(),
			qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen);

		qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.resetOriginalValues();
	}

	/**
	 * Caches the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens in the entity cache if it is enabled.
	 *
	 * @param qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyens the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens
	 */
	@Override
	public void cacheResult(
		List<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen> qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyens) {
		for (QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen : qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyens) {
			if (EntityCacheUtil.getResult(
						QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl.ENTITY_CACHE_ENABLED,
						QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl.class,
						qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.getPrimaryKey()) == null) {
				cacheResult(qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen);
			}
			else {
				qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen) {
		EntityCacheUtil.removeResult(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl.class,
			qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen> qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyens) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen : qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyens) {
			EntityCacheUtil.removeResult(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl.ENTITY_CACHE_ENABLED,
				QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl.class,
				qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.getPrimaryKey());
		}
	}

	/**
	 * Creates a new qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen with the primary key. Does not add the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen to the database.
	 *
	 * @param id the primary key for the new qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen
	 * @return the new qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen
	 */
	@Override
	public QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen create(long id) {
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen =
			new QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl();

		qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.setNew(true);
		qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.setPrimaryKey(id);

		return qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen;
	}

	/**
	 * Removes the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen
	 * @return the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen that was removed
	 * @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenException if a qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen remove(long id)
		throws NoSuchQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenException,
			SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen
	 * @return the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen that was removed
	 * @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenException if a qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen remove(
		Serializable primaryKey)
		throws NoSuchQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenException,
			SystemException {
		Session session = null;

		try {
			session = openSession();

			QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen =
				(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen)session.get(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl.class,
					primaryKey);

			if (qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen);
		}
		catch (NoSuchQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenException nsee) {
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
	protected QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen removeImpl(
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen)
		throws SystemException {
		qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen = toUnwrappedModel(qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen)) {
				qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen = (QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen)session.get(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl.class,
						qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.getPrimaryKeyObj());
			}

			if (qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen != null) {
				session.delete(qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen != null) {
			clearCache(qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen);
		}

		return qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen;
	}

	@Override
	public QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen updateImpl(
		vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen)
		throws SystemException {
		qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen = toUnwrappedModel(qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen);

		boolean isNew = qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.isNew();

		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl =
			(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl)qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen;

		Session session = null;

		try {
			session = openSession();

			if (qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.isNew()) {
				session.save(qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen);

				qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.setNew(false);
			}
			else {
				session.merge(qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen);
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
				!QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GPKDLOAIHINHKDID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl.getOriginalGpkdLoaiHinhKdId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GPKDLOAIHINHKDID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GPKDLOAIHINHKDID,
					args);

				args = new Object[] {
						qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl.getGpkdLoaiHinhKdId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GPKDLOAIHINHKDID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GPKDLOAIHINHKDID,
					args);
			}
		}

		EntityCacheUtil.putResult(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl.ENTITY_CACHE_ENABLED,
			QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl.class,
			qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.getPrimaryKey(),
			qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen);

		return qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen;
	}

	protected QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen toUnwrappedModel(
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen) {
		if (qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen instanceof QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl) {
			return qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen;
		}

		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl =
			new QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl();

		qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl.setNew(qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.isNew());
		qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl.setPrimaryKey(qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.getPrimaryKey());

		qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl.setId(qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.getId());
		qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl.setGpkdLoaiHinhKdId(qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.getGpkdLoaiHinhKdId());
		qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl.setMaTuyen(qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.getMaTuyen());
		qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl.setTenTuyen(qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.getTenTuyen());

		return qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl;
	}

	/**
	 * Returns the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen
	 * @return the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen
	 * @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenException if a qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenException,
			SystemException {
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen =
			fetchByPrimaryKey(primaryKey);

		if (qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen;
	}

	/**
	 * Returns the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen with the primary key or throws a {@link vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenException} if it could not be found.
	 *
	 * @param id the primary key of the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen
	 * @return the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen
	 * @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenException if a qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen findByPrimaryKey(long id)
		throws NoSuchQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenException,
			SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen
	 * @return the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen, or <code>null</code> if a qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen =
			(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen)EntityCacheUtil.getResult(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl.ENTITY_CACHE_ENABLED,
				QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl.class, primaryKey);

		if (qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen == _nullQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen) {
			return null;
		}

		if (qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen = (QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen)session.get(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl.class,
						primaryKey);

				if (qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen != null) {
					cacheResult(qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen);
				}
				else {
					EntityCacheUtil.putResult(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl.ENTITY_CACHE_ENABLED,
						QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl.class,
						primaryKey, _nullQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl.ENTITY_CACHE_ENABLED,
					QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl.class,
					primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen;
	}

	/**
	 * Returns the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen
	 * @return the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen, or <code>null</code> if a qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens.
	 *
	 * @return the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens
	 * @param end the upper bound of the range of qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens (not inclusive)
	 * @return the range of qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen> findAll(int start,
		int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens
	 * @param end the upper bound of the range of qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen> findAll(int start,
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

		List<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen> list = (List<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTXULYGPKDVTQUOCTELOAIHINHVANTAITUYEN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTXULYGPKDVTQUOCTELOAIHINHVANTAITUYEN;

				if (pagination) {
					sql = sql.concat(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen>(list);
				}
				else {
					list = (List<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen>)QueryUtil.list(q,
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
	 * Removes all the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen : findAll()) {
			remove(qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen);
		}
	}

	/**
	 * Returns the number of qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens.
	 *
	 * @return the number of qlvt xu ly gpkdvt quoc te loai hinh van tai tuyens
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

				Query q = session.createQuery(_SQL_COUNT_QLVTXULYGPKDVTQUOCTELOAIHINHVANTAITUYEN);

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
	 * Initializes the qlvt xu ly gpkdvt quoc te loai hinh van tai tuyen persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen>> listenersList =
					new ArrayList<ModelListener<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTXULYGPKDVTQUOCTELOAIHINHVANTAITUYEN =
		"SELECT qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen FROM QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen";
	private static final String _SQL_SELECT_QLVTXULYGPKDVTQUOCTELOAIHINHVANTAITUYEN_WHERE =
		"SELECT qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen FROM QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen WHERE ";
	private static final String _SQL_COUNT_QLVTXULYGPKDVTQUOCTELOAIHINHVANTAITUYEN =
		"SELECT COUNT(qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen) FROM QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen";
	private static final String _SQL_COUNT_QLVTXULYGPKDVTQUOCTELOAIHINHVANTAITUYEN_WHERE =
		"SELECT COUNT(qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen) FROM QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "gpkdLoaiHinhKdId", "maTuyen", "tenTuyen"
			});
	private static QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen _nullQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen =
		new QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen> toCacheModel() {
				return _nullQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenCacheModel;
			}
		};

	private static CacheModel<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen> _nullQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyenCacheModel =
		new CacheModel<QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen>() {
			@Override
			public QlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen toEntityModel() {
				return _nullQlvtXuLyGpkdvtQuocTeLoaiHinhVanTaiTuyen;
			}
		};
}