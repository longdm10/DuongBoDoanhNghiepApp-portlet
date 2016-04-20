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

package vn.dtt.duongbo.dao.common.service.persistence;

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

import vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietCamException;
import vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCam;
import vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietCamImpl;
import vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietCamModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the qlvt phuong tien dang ky viet cam service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see QlvtPhuongTienDangKyVietCamPersistence
 * @see QlvtPhuongTienDangKyVietCamUtil
 * @generated
 */
public class QlvtPhuongTienDangKyVietCamPersistenceImpl
	extends BasePersistenceImpl<QlvtPhuongTienDangKyVietCam>
	implements QlvtPhuongTienDangKyVietCamPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QlvtPhuongTienDangKyVietCamUtil} to access the qlvt phuong tien dang ky viet cam persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QlvtPhuongTienDangKyVietCamImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QlvtPhuongTienDangKyVietCamModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienDangKyVietCamModelImpl.FINDER_CACHE_ENABLED,
			QlvtPhuongTienDangKyVietCamImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QlvtPhuongTienDangKyVietCamModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienDangKyVietCamModelImpl.FINDER_CACHE_ENABLED,
			QlvtPhuongTienDangKyVietCamImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QlvtPhuongTienDangKyVietCamModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienDangKyVietCamModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NOIDUNGHOSOID =
		new FinderPath(QlvtPhuongTienDangKyVietCamModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienDangKyVietCamModelImpl.FINDER_CACHE_ENABLED,
			QlvtPhuongTienDangKyVietCamImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByNoiDungHoSoId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOIDUNGHOSOID =
		new FinderPath(QlvtPhuongTienDangKyVietCamModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienDangKyVietCamModelImpl.FINDER_CACHE_ENABLED,
			QlvtPhuongTienDangKyVietCamImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByNoiDungHoSoId",
			new String[] { Long.class.getName() },
			QlvtPhuongTienDangKyVietCamModelImpl.NOIDUNGHOSOID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NOIDUNGHOSOID = new FinderPath(QlvtPhuongTienDangKyVietCamModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienDangKyVietCamModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByNoiDungHoSoId", new String[] { Long.class.getName() });

	/**
	 * Returns all the qlvt phuong tien dang ky viet cams where NoiDungHoSoId = &#63;.
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @return the matching qlvt phuong tien dang ky viet cams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtPhuongTienDangKyVietCam> findByNoiDungHoSoId(
		long NoiDungHoSoId) throws SystemException {
		return findByNoiDungHoSoId(NoiDungHoSoId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt phuong tien dang ky viet cams where NoiDungHoSoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietCamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @param start the lower bound of the range of qlvt phuong tien dang ky viet cams
	 * @param end the upper bound of the range of qlvt phuong tien dang ky viet cams (not inclusive)
	 * @return the range of matching qlvt phuong tien dang ky viet cams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtPhuongTienDangKyVietCam> findByNoiDungHoSoId(
		long NoiDungHoSoId, int start, int end) throws SystemException {
		return findByNoiDungHoSoId(NoiDungHoSoId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt phuong tien dang ky viet cams where NoiDungHoSoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietCamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @param start the lower bound of the range of qlvt phuong tien dang ky viet cams
	 * @param end the upper bound of the range of qlvt phuong tien dang ky viet cams (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching qlvt phuong tien dang ky viet cams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtPhuongTienDangKyVietCam> findByNoiDungHoSoId(
		long NoiDungHoSoId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOIDUNGHOSOID;
			finderArgs = new Object[] { NoiDungHoSoId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NOIDUNGHOSOID;
			finderArgs = new Object[] {
					NoiDungHoSoId,
					
					start, end, orderByComparator
				};
		}

		List<QlvtPhuongTienDangKyVietCam> list = (List<QlvtPhuongTienDangKyVietCam>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (QlvtPhuongTienDangKyVietCam qlvtPhuongTienDangKyVietCam : list) {
				if ((NoiDungHoSoId != qlvtPhuongTienDangKyVietCam.getNoiDungHoSoId())) {
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

			query.append(_SQL_SELECT_QLVTPHUONGTIENDANGKYVIETCAM_WHERE);

			query.append(_FINDER_COLUMN_NOIDUNGHOSOID_NOIDUNGHOSOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(QlvtPhuongTienDangKyVietCamModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(NoiDungHoSoId);

				if (!pagination) {
					list = (List<QlvtPhuongTienDangKyVietCam>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtPhuongTienDangKyVietCam>(list);
				}
				else {
					list = (List<QlvtPhuongTienDangKyVietCam>)QueryUtil.list(q,
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
	 * Returns the first qlvt phuong tien dang ky viet cam in the ordered set where NoiDungHoSoId = &#63;.
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qlvt phuong tien dang ky viet cam
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietCamException if a matching qlvt phuong tien dang ky viet cam could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienDangKyVietCam findByNoiDungHoSoId_First(
		long NoiDungHoSoId, OrderByComparator orderByComparator)
		throws NoSuchQlvtPhuongTienDangKyVietCamException, SystemException {
		QlvtPhuongTienDangKyVietCam qlvtPhuongTienDangKyVietCam = fetchByNoiDungHoSoId_First(NoiDungHoSoId,
				orderByComparator);

		if (qlvtPhuongTienDangKyVietCam != null) {
			return qlvtPhuongTienDangKyVietCam;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("NoiDungHoSoId=");
		msg.append(NoiDungHoSoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchQlvtPhuongTienDangKyVietCamException(msg.toString());
	}

	/**
	 * Returns the first qlvt phuong tien dang ky viet cam in the ordered set where NoiDungHoSoId = &#63;.
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qlvt phuong tien dang ky viet cam, or <code>null</code> if a matching qlvt phuong tien dang ky viet cam could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienDangKyVietCam fetchByNoiDungHoSoId_First(
		long NoiDungHoSoId, OrderByComparator orderByComparator)
		throws SystemException {
		List<QlvtPhuongTienDangKyVietCam> list = findByNoiDungHoSoId(NoiDungHoSoId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last qlvt phuong tien dang ky viet cam in the ordered set where NoiDungHoSoId = &#63;.
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qlvt phuong tien dang ky viet cam
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietCamException if a matching qlvt phuong tien dang ky viet cam could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienDangKyVietCam findByNoiDungHoSoId_Last(
		long NoiDungHoSoId, OrderByComparator orderByComparator)
		throws NoSuchQlvtPhuongTienDangKyVietCamException, SystemException {
		QlvtPhuongTienDangKyVietCam qlvtPhuongTienDangKyVietCam = fetchByNoiDungHoSoId_Last(NoiDungHoSoId,
				orderByComparator);

		if (qlvtPhuongTienDangKyVietCam != null) {
			return qlvtPhuongTienDangKyVietCam;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("NoiDungHoSoId=");
		msg.append(NoiDungHoSoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchQlvtPhuongTienDangKyVietCamException(msg.toString());
	}

	/**
	 * Returns the last qlvt phuong tien dang ky viet cam in the ordered set where NoiDungHoSoId = &#63;.
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qlvt phuong tien dang ky viet cam, or <code>null</code> if a matching qlvt phuong tien dang ky viet cam could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienDangKyVietCam fetchByNoiDungHoSoId_Last(
		long NoiDungHoSoId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByNoiDungHoSoId(NoiDungHoSoId);

		if (count == 0) {
			return null;
		}

		List<QlvtPhuongTienDangKyVietCam> list = findByNoiDungHoSoId(NoiDungHoSoId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the qlvt phuong tien dang ky viet cams before and after the current qlvt phuong tien dang ky viet cam in the ordered set where NoiDungHoSoId = &#63;.
	 *
	 * @param id the primary key of the current qlvt phuong tien dang ky viet cam
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next qlvt phuong tien dang ky viet cam
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietCamException if a qlvt phuong tien dang ky viet cam with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienDangKyVietCam[] findByNoiDungHoSoId_PrevAndNext(
		long id, long NoiDungHoSoId, OrderByComparator orderByComparator)
		throws NoSuchQlvtPhuongTienDangKyVietCamException, SystemException {
		QlvtPhuongTienDangKyVietCam qlvtPhuongTienDangKyVietCam = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			QlvtPhuongTienDangKyVietCam[] array = new QlvtPhuongTienDangKyVietCamImpl[3];

			array[0] = getByNoiDungHoSoId_PrevAndNext(session,
					qlvtPhuongTienDangKyVietCam, NoiDungHoSoId,
					orderByComparator, true);

			array[1] = qlvtPhuongTienDangKyVietCam;

			array[2] = getByNoiDungHoSoId_PrevAndNext(session,
					qlvtPhuongTienDangKyVietCam, NoiDungHoSoId,
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

	protected QlvtPhuongTienDangKyVietCam getByNoiDungHoSoId_PrevAndNext(
		Session session,
		QlvtPhuongTienDangKyVietCam qlvtPhuongTienDangKyVietCam,
		long NoiDungHoSoId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_QLVTPHUONGTIENDANGKYVIETCAM_WHERE);

		query.append(_FINDER_COLUMN_NOIDUNGHOSOID_NOIDUNGHOSOID_2);

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
			query.append(QlvtPhuongTienDangKyVietCamModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(NoiDungHoSoId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(qlvtPhuongTienDangKyVietCam);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<QlvtPhuongTienDangKyVietCam> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the qlvt phuong tien dang ky viet cams where NoiDungHoSoId = &#63; from the database.
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByNoiDungHoSoId(long NoiDungHoSoId)
		throws SystemException {
		for (QlvtPhuongTienDangKyVietCam qlvtPhuongTienDangKyVietCam : findByNoiDungHoSoId(
				NoiDungHoSoId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(qlvtPhuongTienDangKyVietCam);
		}
	}

	/**
	 * Returns the number of qlvt phuong tien dang ky viet cams where NoiDungHoSoId = &#63;.
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @return the number of matching qlvt phuong tien dang ky viet cams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByNoiDungHoSoId(long NoiDungHoSoId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_NOIDUNGHOSOID;

		Object[] finderArgs = new Object[] { NoiDungHoSoId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_QLVTPHUONGTIENDANGKYVIETCAM_WHERE);

			query.append(_FINDER_COLUMN_NOIDUNGHOSOID_NOIDUNGHOSOID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(NoiDungHoSoId);

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

	private static final String _FINDER_COLUMN_NOIDUNGHOSOID_NOIDUNGHOSOID_2 = "qlvtPhuongTienDangKyVietCam.NoiDungHoSoId = ?";

	public QlvtPhuongTienDangKyVietCamPersistenceImpl() {
		setModelClass(QlvtPhuongTienDangKyVietCam.class);
	}

	/**
	 * Caches the qlvt phuong tien dang ky viet cam in the entity cache if it is enabled.
	 *
	 * @param qlvtPhuongTienDangKyVietCam the qlvt phuong tien dang ky viet cam
	 */
	@Override
	public void cacheResult(
		QlvtPhuongTienDangKyVietCam qlvtPhuongTienDangKyVietCam) {
		EntityCacheUtil.putResult(QlvtPhuongTienDangKyVietCamModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienDangKyVietCamImpl.class,
			qlvtPhuongTienDangKyVietCam.getPrimaryKey(),
			qlvtPhuongTienDangKyVietCam);

		qlvtPhuongTienDangKyVietCam.resetOriginalValues();
	}

	/**
	 * Caches the qlvt phuong tien dang ky viet cams in the entity cache if it is enabled.
	 *
	 * @param qlvtPhuongTienDangKyVietCams the qlvt phuong tien dang ky viet cams
	 */
	@Override
	public void cacheResult(
		List<QlvtPhuongTienDangKyVietCam> qlvtPhuongTienDangKyVietCams) {
		for (QlvtPhuongTienDangKyVietCam qlvtPhuongTienDangKyVietCam : qlvtPhuongTienDangKyVietCams) {
			if (EntityCacheUtil.getResult(
						QlvtPhuongTienDangKyVietCamModelImpl.ENTITY_CACHE_ENABLED,
						QlvtPhuongTienDangKyVietCamImpl.class,
						qlvtPhuongTienDangKyVietCam.getPrimaryKey()) == null) {
				cacheResult(qlvtPhuongTienDangKyVietCam);
			}
			else {
				qlvtPhuongTienDangKyVietCam.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qlvt phuong tien dang ky viet cams.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QlvtPhuongTienDangKyVietCamImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QlvtPhuongTienDangKyVietCamImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qlvt phuong tien dang ky viet cam.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		QlvtPhuongTienDangKyVietCam qlvtPhuongTienDangKyVietCam) {
		EntityCacheUtil.removeResult(QlvtPhuongTienDangKyVietCamModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienDangKyVietCamImpl.class,
			qlvtPhuongTienDangKyVietCam.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<QlvtPhuongTienDangKyVietCam> qlvtPhuongTienDangKyVietCams) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QlvtPhuongTienDangKyVietCam qlvtPhuongTienDangKyVietCam : qlvtPhuongTienDangKyVietCams) {
			EntityCacheUtil.removeResult(QlvtPhuongTienDangKyVietCamModelImpl.ENTITY_CACHE_ENABLED,
				QlvtPhuongTienDangKyVietCamImpl.class,
				qlvtPhuongTienDangKyVietCam.getPrimaryKey());
		}
	}

	/**
	 * Creates a new qlvt phuong tien dang ky viet cam with the primary key. Does not add the qlvt phuong tien dang ky viet cam to the database.
	 *
	 * @param id the primary key for the new qlvt phuong tien dang ky viet cam
	 * @return the new qlvt phuong tien dang ky viet cam
	 */
	@Override
	public QlvtPhuongTienDangKyVietCam create(long id) {
		QlvtPhuongTienDangKyVietCam qlvtPhuongTienDangKyVietCam = new QlvtPhuongTienDangKyVietCamImpl();

		qlvtPhuongTienDangKyVietCam.setNew(true);
		qlvtPhuongTienDangKyVietCam.setPrimaryKey(id);

		return qlvtPhuongTienDangKyVietCam;
	}

	/**
	 * Removes the qlvt phuong tien dang ky viet cam with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the qlvt phuong tien dang ky viet cam
	 * @return the qlvt phuong tien dang ky viet cam that was removed
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietCamException if a qlvt phuong tien dang ky viet cam with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienDangKyVietCam remove(long id)
		throws NoSuchQlvtPhuongTienDangKyVietCamException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the qlvt phuong tien dang ky viet cam with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qlvt phuong tien dang ky viet cam
	 * @return the qlvt phuong tien dang ky viet cam that was removed
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietCamException if a qlvt phuong tien dang ky viet cam with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienDangKyVietCam remove(Serializable primaryKey)
		throws NoSuchQlvtPhuongTienDangKyVietCamException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QlvtPhuongTienDangKyVietCam qlvtPhuongTienDangKyVietCam = (QlvtPhuongTienDangKyVietCam)session.get(QlvtPhuongTienDangKyVietCamImpl.class,
					primaryKey);

			if (qlvtPhuongTienDangKyVietCam == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQlvtPhuongTienDangKyVietCamException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtPhuongTienDangKyVietCam);
		}
		catch (NoSuchQlvtPhuongTienDangKyVietCamException nsee) {
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
	protected QlvtPhuongTienDangKyVietCam removeImpl(
		QlvtPhuongTienDangKyVietCam qlvtPhuongTienDangKyVietCam)
		throws SystemException {
		qlvtPhuongTienDangKyVietCam = toUnwrappedModel(qlvtPhuongTienDangKyVietCam);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtPhuongTienDangKyVietCam)) {
				qlvtPhuongTienDangKyVietCam = (QlvtPhuongTienDangKyVietCam)session.get(QlvtPhuongTienDangKyVietCamImpl.class,
						qlvtPhuongTienDangKyVietCam.getPrimaryKeyObj());
			}

			if (qlvtPhuongTienDangKyVietCam != null) {
				session.delete(qlvtPhuongTienDangKyVietCam);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtPhuongTienDangKyVietCam != null) {
			clearCache(qlvtPhuongTienDangKyVietCam);
		}

		return qlvtPhuongTienDangKyVietCam;
	}

	@Override
	public QlvtPhuongTienDangKyVietCam updateImpl(
		vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCam qlvtPhuongTienDangKyVietCam)
		throws SystemException {
		qlvtPhuongTienDangKyVietCam = toUnwrappedModel(qlvtPhuongTienDangKyVietCam);

		boolean isNew = qlvtPhuongTienDangKyVietCam.isNew();

		QlvtPhuongTienDangKyVietCamModelImpl qlvtPhuongTienDangKyVietCamModelImpl =
			(QlvtPhuongTienDangKyVietCamModelImpl)qlvtPhuongTienDangKyVietCam;

		Session session = null;

		try {
			session = openSession();

			if (qlvtPhuongTienDangKyVietCam.isNew()) {
				session.save(qlvtPhuongTienDangKyVietCam);

				qlvtPhuongTienDangKyVietCam.setNew(false);
			}
			else {
				session.merge(qlvtPhuongTienDangKyVietCam);
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
				!QlvtPhuongTienDangKyVietCamModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((qlvtPhuongTienDangKyVietCamModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOIDUNGHOSOID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						qlvtPhuongTienDangKyVietCamModelImpl.getOriginalNoiDungHoSoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NOIDUNGHOSOID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOIDUNGHOSOID,
					args);

				args = new Object[] {
						qlvtPhuongTienDangKyVietCamModelImpl.getNoiDungHoSoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NOIDUNGHOSOID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOIDUNGHOSOID,
					args);
			}
		}

		EntityCacheUtil.putResult(QlvtPhuongTienDangKyVietCamModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienDangKyVietCamImpl.class,
			qlvtPhuongTienDangKyVietCam.getPrimaryKey(),
			qlvtPhuongTienDangKyVietCam);

		return qlvtPhuongTienDangKyVietCam;
	}

	protected QlvtPhuongTienDangKyVietCam toUnwrappedModel(
		QlvtPhuongTienDangKyVietCam qlvtPhuongTienDangKyVietCam) {
		if (qlvtPhuongTienDangKyVietCam instanceof QlvtPhuongTienDangKyVietCamImpl) {
			return qlvtPhuongTienDangKyVietCam;
		}

		QlvtPhuongTienDangKyVietCamImpl qlvtPhuongTienDangKyVietCamImpl = new QlvtPhuongTienDangKyVietCamImpl();

		qlvtPhuongTienDangKyVietCamImpl.setNew(qlvtPhuongTienDangKyVietCam.isNew());
		qlvtPhuongTienDangKyVietCamImpl.setPrimaryKey(qlvtPhuongTienDangKyVietCam.getPrimaryKey());

		qlvtPhuongTienDangKyVietCamImpl.setId(qlvtPhuongTienDangKyVietCam.getId());
		qlvtPhuongTienDangKyVietCamImpl.setBienSo(qlvtPhuongTienDangKyVietCam.getBienSo());
		qlvtPhuongTienDangKyVietCamImpl.setTenDangKySoHuu(qlvtPhuongTienDangKyVietCam.getTenDangKySoHuu());
		qlvtPhuongTienDangKyVietCamImpl.setNhanHieu(qlvtPhuongTienDangKyVietCam.getNhanHieu());
		qlvtPhuongTienDangKyVietCamImpl.setTrongTai(qlvtPhuongTienDangKyVietCam.getTrongTai());
		qlvtPhuongTienDangKyVietCamImpl.setNamSanXuat(qlvtPhuongTienDangKyVietCam.getNamSanXuat());
		qlvtPhuongTienDangKyVietCamImpl.setCuaKhauXuatNhap(qlvtPhuongTienDangKyVietCam.getCuaKhauXuatNhap());
		qlvtPhuongTienDangKyVietCamImpl.setHinhThucHoatDong(qlvtPhuongTienDangKyVietCam.getHinhThucHoatDong());
		qlvtPhuongTienDangKyVietCamImpl.setLoaiHinhHoatDong(qlvtPhuongTienDangKyVietCam.getLoaiHinhHoatDong());
		qlvtPhuongTienDangKyVietCamImpl.setTuyenHoatDong(qlvtPhuongTienDangKyVietCam.getTuyenHoatDong());
		qlvtPhuongTienDangKyVietCamImpl.setThoiGianXinCapPhepTu(qlvtPhuongTienDangKyVietCam.getThoiGianXinCapPhepTu());
		qlvtPhuongTienDangKyVietCamImpl.setThoiGianXinCapPhepDen(qlvtPhuongTienDangKyVietCam.getThoiGianXinCapPhepDen());
		qlvtPhuongTienDangKyVietCamImpl.setSoKhung(qlvtPhuongTienDangKyVietCam.getSoKhung());
		qlvtPhuongTienDangKyVietCamImpl.setMauSon(qlvtPhuongTienDangKyVietCam.getMauSon());
		qlvtPhuongTienDangKyVietCamImpl.setSoMay(qlvtPhuongTienDangKyVietCam.getSoMay());
		qlvtPhuongTienDangKyVietCamImpl.setLoaiHangVanChuyen(qlvtPhuongTienDangKyVietCam.getLoaiHangVanChuyen());
		qlvtPhuongTienDangKyVietCamImpl.setThoiGianDuKienKhoiHanh(qlvtPhuongTienDangKyVietCam.getThoiGianDuKienKhoiHanh());
		qlvtPhuongTienDangKyVietCamImpl.setNoiDungHoSoId(qlvtPhuongTienDangKyVietCam.getNoiDungHoSoId());
		qlvtPhuongTienDangKyVietCamImpl.setHoSoThuTucId(qlvtPhuongTienDangKyVietCam.getHoSoThuTucId());

		return qlvtPhuongTienDangKyVietCamImpl;
	}

	/**
	 * Returns the qlvt phuong tien dang ky viet cam with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt phuong tien dang ky viet cam
	 * @return the qlvt phuong tien dang ky viet cam
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietCamException if a qlvt phuong tien dang ky viet cam with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienDangKyVietCam findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQlvtPhuongTienDangKyVietCamException, SystemException {
		QlvtPhuongTienDangKyVietCam qlvtPhuongTienDangKyVietCam = fetchByPrimaryKey(primaryKey);

		if (qlvtPhuongTienDangKyVietCam == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQlvtPhuongTienDangKyVietCamException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtPhuongTienDangKyVietCam;
	}

	/**
	 * Returns the qlvt phuong tien dang ky viet cam with the primary key or throws a {@link vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietCamException} if it could not be found.
	 *
	 * @param id the primary key of the qlvt phuong tien dang ky viet cam
	 * @return the qlvt phuong tien dang ky viet cam
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietCamException if a qlvt phuong tien dang ky viet cam with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienDangKyVietCam findByPrimaryKey(long id)
		throws NoSuchQlvtPhuongTienDangKyVietCamException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the qlvt phuong tien dang ky viet cam with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt phuong tien dang ky viet cam
	 * @return the qlvt phuong tien dang ky viet cam, or <code>null</code> if a qlvt phuong tien dang ky viet cam with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienDangKyVietCam fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		QlvtPhuongTienDangKyVietCam qlvtPhuongTienDangKyVietCam = (QlvtPhuongTienDangKyVietCam)EntityCacheUtil.getResult(QlvtPhuongTienDangKyVietCamModelImpl.ENTITY_CACHE_ENABLED,
				QlvtPhuongTienDangKyVietCamImpl.class, primaryKey);

		if (qlvtPhuongTienDangKyVietCam == _nullQlvtPhuongTienDangKyVietCam) {
			return null;
		}

		if (qlvtPhuongTienDangKyVietCam == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtPhuongTienDangKyVietCam = (QlvtPhuongTienDangKyVietCam)session.get(QlvtPhuongTienDangKyVietCamImpl.class,
						primaryKey);

				if (qlvtPhuongTienDangKyVietCam != null) {
					cacheResult(qlvtPhuongTienDangKyVietCam);
				}
				else {
					EntityCacheUtil.putResult(QlvtPhuongTienDangKyVietCamModelImpl.ENTITY_CACHE_ENABLED,
						QlvtPhuongTienDangKyVietCamImpl.class, primaryKey,
						_nullQlvtPhuongTienDangKyVietCam);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QlvtPhuongTienDangKyVietCamModelImpl.ENTITY_CACHE_ENABLED,
					QlvtPhuongTienDangKyVietCamImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtPhuongTienDangKyVietCam;
	}

	/**
	 * Returns the qlvt phuong tien dang ky viet cam with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the qlvt phuong tien dang ky viet cam
	 * @return the qlvt phuong tien dang ky viet cam, or <code>null</code> if a qlvt phuong tien dang ky viet cam with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienDangKyVietCam fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the qlvt phuong tien dang ky viet cams.
	 *
	 * @return the qlvt phuong tien dang ky viet cams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtPhuongTienDangKyVietCam> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt phuong tien dang ky viet cams.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietCamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt phuong tien dang ky viet cams
	 * @param end the upper bound of the range of qlvt phuong tien dang ky viet cams (not inclusive)
	 * @return the range of qlvt phuong tien dang ky viet cams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtPhuongTienDangKyVietCam> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt phuong tien dang ky viet cams.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietCamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt phuong tien dang ky viet cams
	 * @param end the upper bound of the range of qlvt phuong tien dang ky viet cams (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qlvt phuong tien dang ky viet cams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtPhuongTienDangKyVietCam> findAll(int start, int end,
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

		List<QlvtPhuongTienDangKyVietCam> list = (List<QlvtPhuongTienDangKyVietCam>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTPHUONGTIENDANGKYVIETCAM);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTPHUONGTIENDANGKYVIETCAM;

				if (pagination) {
					sql = sql.concat(QlvtPhuongTienDangKyVietCamModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QlvtPhuongTienDangKyVietCam>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtPhuongTienDangKyVietCam>(list);
				}
				else {
					list = (List<QlvtPhuongTienDangKyVietCam>)QueryUtil.list(q,
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
	 * Removes all the qlvt phuong tien dang ky viet cams from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QlvtPhuongTienDangKyVietCam qlvtPhuongTienDangKyVietCam : findAll()) {
			remove(qlvtPhuongTienDangKyVietCam);
		}
	}

	/**
	 * Returns the number of qlvt phuong tien dang ky viet cams.
	 *
	 * @return the number of qlvt phuong tien dang ky viet cams
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

				Query q = session.createQuery(_SQL_COUNT_QLVTPHUONGTIENDANGKYVIETCAM);

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
	 * Initializes the qlvt phuong tien dang ky viet cam persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCam")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QlvtPhuongTienDangKyVietCam>> listenersList = new ArrayList<ModelListener<QlvtPhuongTienDangKyVietCam>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QlvtPhuongTienDangKyVietCam>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QlvtPhuongTienDangKyVietCamImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTPHUONGTIENDANGKYVIETCAM = "SELECT qlvtPhuongTienDangKyVietCam FROM QlvtPhuongTienDangKyVietCam qlvtPhuongTienDangKyVietCam";
	private static final String _SQL_SELECT_QLVTPHUONGTIENDANGKYVIETCAM_WHERE = "SELECT qlvtPhuongTienDangKyVietCam FROM QlvtPhuongTienDangKyVietCam qlvtPhuongTienDangKyVietCam WHERE ";
	private static final String _SQL_COUNT_QLVTPHUONGTIENDANGKYVIETCAM = "SELECT COUNT(qlvtPhuongTienDangKyVietCam) FROM QlvtPhuongTienDangKyVietCam qlvtPhuongTienDangKyVietCam";
	private static final String _SQL_COUNT_QLVTPHUONGTIENDANGKYVIETCAM_WHERE = "SELECT COUNT(qlvtPhuongTienDangKyVietCam) FROM QlvtPhuongTienDangKyVietCam qlvtPhuongTienDangKyVietCam WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtPhuongTienDangKyVietCam.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QlvtPhuongTienDangKyVietCam exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No QlvtPhuongTienDangKyVietCam exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QlvtPhuongTienDangKyVietCamPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "BienSo", "TenDangKySoHuu", "NhanHieu", "TrongTai",
				"NamSanXuat", "CuaKhauXuatNhap", "HinhThucHoatDong",
				"LoaiHinhHoatDong", "TuyenHoatDong", "ThoiGianXinCapPhepTu",
				"ThoiGianXinCapPhepDen", "SoKhung", "MauSon", "SoMay",
				"LoaiHangVanChuyen", "ThoiGianDuKienKhoiHanh", "NoiDungHoSoId",
				"HoSoThuTucId"
			});
	private static QlvtPhuongTienDangKyVietCam _nullQlvtPhuongTienDangKyVietCam = new QlvtPhuongTienDangKyVietCamImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QlvtPhuongTienDangKyVietCam> toCacheModel() {
				return _nullQlvtPhuongTienDangKyVietCamCacheModel;
			}
		};

	private static CacheModel<QlvtPhuongTienDangKyVietCam> _nullQlvtPhuongTienDangKyVietCamCacheModel =
		new CacheModel<QlvtPhuongTienDangKyVietCam>() {
			@Override
			public QlvtPhuongTienDangKyVietCam toEntityModel() {
				return _nullQlvtPhuongTienDangKyVietCam;
			}
		};
}