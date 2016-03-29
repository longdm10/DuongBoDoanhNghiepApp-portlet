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

import vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietTrungException;
import vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietTrung;
import vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietTrungImpl;
import vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietTrungModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the qlvt phuong tien dang ky viet trung service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see QlvtPhuongTienDangKyVietTrungPersistence
 * @see QlvtPhuongTienDangKyVietTrungUtil
 * @generated
 */
public class QlvtPhuongTienDangKyVietTrungPersistenceImpl
	extends BasePersistenceImpl<QlvtPhuongTienDangKyVietTrung>
	implements QlvtPhuongTienDangKyVietTrungPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QlvtPhuongTienDangKyVietTrungUtil} to access the qlvt phuong tien dang ky viet trung persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QlvtPhuongTienDangKyVietTrungImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QlvtPhuongTienDangKyVietTrungModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienDangKyVietTrungModelImpl.FINDER_CACHE_ENABLED,
			QlvtPhuongTienDangKyVietTrungImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QlvtPhuongTienDangKyVietTrungModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienDangKyVietTrungModelImpl.FINDER_CACHE_ENABLED,
			QlvtPhuongTienDangKyVietTrungImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QlvtPhuongTienDangKyVietTrungModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienDangKyVietTrungModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NOIDUNGHOSOID =
		new FinderPath(QlvtPhuongTienDangKyVietTrungModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienDangKyVietTrungModelImpl.FINDER_CACHE_ENABLED,
			QlvtPhuongTienDangKyVietTrungImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByNoiDungHoSoId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOIDUNGHOSOID =
		new FinderPath(QlvtPhuongTienDangKyVietTrungModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienDangKyVietTrungModelImpl.FINDER_CACHE_ENABLED,
			QlvtPhuongTienDangKyVietTrungImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByNoiDungHoSoId",
			new String[] { Long.class.getName() },
			QlvtPhuongTienDangKyVietTrungModelImpl.NOIDUNGHOSOID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NOIDUNGHOSOID = new FinderPath(QlvtPhuongTienDangKyVietTrungModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienDangKyVietTrungModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByNoiDungHoSoId", new String[] { Long.class.getName() });

	/**
	 * Returns all the qlvt phuong tien dang ky viet trungs where NoiDungHoSoId = &#63;.
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @return the matching qlvt phuong tien dang ky viet trungs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtPhuongTienDangKyVietTrung> findByNoiDungHoSoId(
		long NoiDungHoSoId) throws SystemException {
		return findByNoiDungHoSoId(NoiDungHoSoId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt phuong tien dang ky viet trungs where NoiDungHoSoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietTrungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @param start the lower bound of the range of qlvt phuong tien dang ky viet trungs
	 * @param end the upper bound of the range of qlvt phuong tien dang ky viet trungs (not inclusive)
	 * @return the range of matching qlvt phuong tien dang ky viet trungs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtPhuongTienDangKyVietTrung> findByNoiDungHoSoId(
		long NoiDungHoSoId, int start, int end) throws SystemException {
		return findByNoiDungHoSoId(NoiDungHoSoId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt phuong tien dang ky viet trungs where NoiDungHoSoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietTrungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @param start the lower bound of the range of qlvt phuong tien dang ky viet trungs
	 * @param end the upper bound of the range of qlvt phuong tien dang ky viet trungs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching qlvt phuong tien dang ky viet trungs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtPhuongTienDangKyVietTrung> findByNoiDungHoSoId(
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

		List<QlvtPhuongTienDangKyVietTrung> list = (List<QlvtPhuongTienDangKyVietTrung>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (QlvtPhuongTienDangKyVietTrung qlvtPhuongTienDangKyVietTrung : list) {
				if ((NoiDungHoSoId != qlvtPhuongTienDangKyVietTrung.getNoiDungHoSoId())) {
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

			query.append(_SQL_SELECT_QLVTPHUONGTIENDANGKYVIETTRUNG_WHERE);

			query.append(_FINDER_COLUMN_NOIDUNGHOSOID_NOIDUNGHOSOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(QlvtPhuongTienDangKyVietTrungModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(NoiDungHoSoId);

				if (!pagination) {
					list = (List<QlvtPhuongTienDangKyVietTrung>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtPhuongTienDangKyVietTrung>(list);
				}
				else {
					list = (List<QlvtPhuongTienDangKyVietTrung>)QueryUtil.list(q,
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
	 * Returns the first qlvt phuong tien dang ky viet trung in the ordered set where NoiDungHoSoId = &#63;.
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qlvt phuong tien dang ky viet trung
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietTrungException if a matching qlvt phuong tien dang ky viet trung could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienDangKyVietTrung findByNoiDungHoSoId_First(
		long NoiDungHoSoId, OrderByComparator orderByComparator)
		throws NoSuchQlvtPhuongTienDangKyVietTrungException, SystemException {
		QlvtPhuongTienDangKyVietTrung qlvtPhuongTienDangKyVietTrung = fetchByNoiDungHoSoId_First(NoiDungHoSoId,
				orderByComparator);

		if (qlvtPhuongTienDangKyVietTrung != null) {
			return qlvtPhuongTienDangKyVietTrung;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("NoiDungHoSoId=");
		msg.append(NoiDungHoSoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchQlvtPhuongTienDangKyVietTrungException(msg.toString());
	}

	/**
	 * Returns the first qlvt phuong tien dang ky viet trung in the ordered set where NoiDungHoSoId = &#63;.
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qlvt phuong tien dang ky viet trung, or <code>null</code> if a matching qlvt phuong tien dang ky viet trung could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienDangKyVietTrung fetchByNoiDungHoSoId_First(
		long NoiDungHoSoId, OrderByComparator orderByComparator)
		throws SystemException {
		List<QlvtPhuongTienDangKyVietTrung> list = findByNoiDungHoSoId(NoiDungHoSoId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last qlvt phuong tien dang ky viet trung in the ordered set where NoiDungHoSoId = &#63;.
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qlvt phuong tien dang ky viet trung
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietTrungException if a matching qlvt phuong tien dang ky viet trung could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienDangKyVietTrung findByNoiDungHoSoId_Last(
		long NoiDungHoSoId, OrderByComparator orderByComparator)
		throws NoSuchQlvtPhuongTienDangKyVietTrungException, SystemException {
		QlvtPhuongTienDangKyVietTrung qlvtPhuongTienDangKyVietTrung = fetchByNoiDungHoSoId_Last(NoiDungHoSoId,
				orderByComparator);

		if (qlvtPhuongTienDangKyVietTrung != null) {
			return qlvtPhuongTienDangKyVietTrung;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("NoiDungHoSoId=");
		msg.append(NoiDungHoSoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchQlvtPhuongTienDangKyVietTrungException(msg.toString());
	}

	/**
	 * Returns the last qlvt phuong tien dang ky viet trung in the ordered set where NoiDungHoSoId = &#63;.
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qlvt phuong tien dang ky viet trung, or <code>null</code> if a matching qlvt phuong tien dang ky viet trung could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienDangKyVietTrung fetchByNoiDungHoSoId_Last(
		long NoiDungHoSoId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByNoiDungHoSoId(NoiDungHoSoId);

		if (count == 0) {
			return null;
		}

		List<QlvtPhuongTienDangKyVietTrung> list = findByNoiDungHoSoId(NoiDungHoSoId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the qlvt phuong tien dang ky viet trungs before and after the current qlvt phuong tien dang ky viet trung in the ordered set where NoiDungHoSoId = &#63;.
	 *
	 * @param id the primary key of the current qlvt phuong tien dang ky viet trung
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next qlvt phuong tien dang ky viet trung
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietTrungException if a qlvt phuong tien dang ky viet trung with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienDangKyVietTrung[] findByNoiDungHoSoId_PrevAndNext(
		long id, long NoiDungHoSoId, OrderByComparator orderByComparator)
		throws NoSuchQlvtPhuongTienDangKyVietTrungException, SystemException {
		QlvtPhuongTienDangKyVietTrung qlvtPhuongTienDangKyVietTrung = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			QlvtPhuongTienDangKyVietTrung[] array = new QlvtPhuongTienDangKyVietTrungImpl[3];

			array[0] = getByNoiDungHoSoId_PrevAndNext(session,
					qlvtPhuongTienDangKyVietTrung, NoiDungHoSoId,
					orderByComparator, true);

			array[1] = qlvtPhuongTienDangKyVietTrung;

			array[2] = getByNoiDungHoSoId_PrevAndNext(session,
					qlvtPhuongTienDangKyVietTrung, NoiDungHoSoId,
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

	protected QlvtPhuongTienDangKyVietTrung getByNoiDungHoSoId_PrevAndNext(
		Session session,
		QlvtPhuongTienDangKyVietTrung qlvtPhuongTienDangKyVietTrung,
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

		query.append(_SQL_SELECT_QLVTPHUONGTIENDANGKYVIETTRUNG_WHERE);

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
			query.append(QlvtPhuongTienDangKyVietTrungModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(NoiDungHoSoId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(qlvtPhuongTienDangKyVietTrung);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<QlvtPhuongTienDangKyVietTrung> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the qlvt phuong tien dang ky viet trungs where NoiDungHoSoId = &#63; from the database.
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByNoiDungHoSoId(long NoiDungHoSoId)
		throws SystemException {
		for (QlvtPhuongTienDangKyVietTrung qlvtPhuongTienDangKyVietTrung : findByNoiDungHoSoId(
				NoiDungHoSoId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(qlvtPhuongTienDangKyVietTrung);
		}
	}

	/**
	 * Returns the number of qlvt phuong tien dang ky viet trungs where NoiDungHoSoId = &#63;.
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @return the number of matching qlvt phuong tien dang ky viet trungs
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

			query.append(_SQL_COUNT_QLVTPHUONGTIENDANGKYVIETTRUNG_WHERE);

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

	private static final String _FINDER_COLUMN_NOIDUNGHOSOID_NOIDUNGHOSOID_2 = "qlvtPhuongTienDangKyVietTrung.NoiDungHoSoId = ?";

	public QlvtPhuongTienDangKyVietTrungPersistenceImpl() {
		setModelClass(QlvtPhuongTienDangKyVietTrung.class);
	}

	/**
	 * Caches the qlvt phuong tien dang ky viet trung in the entity cache if it is enabled.
	 *
	 * @param qlvtPhuongTienDangKyVietTrung the qlvt phuong tien dang ky viet trung
	 */
	@Override
	public void cacheResult(
		QlvtPhuongTienDangKyVietTrung qlvtPhuongTienDangKyVietTrung) {
		EntityCacheUtil.putResult(QlvtPhuongTienDangKyVietTrungModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienDangKyVietTrungImpl.class,
			qlvtPhuongTienDangKyVietTrung.getPrimaryKey(),
			qlvtPhuongTienDangKyVietTrung);

		qlvtPhuongTienDangKyVietTrung.resetOriginalValues();
	}

	/**
	 * Caches the qlvt phuong tien dang ky viet trungs in the entity cache if it is enabled.
	 *
	 * @param qlvtPhuongTienDangKyVietTrungs the qlvt phuong tien dang ky viet trungs
	 */
	@Override
	public void cacheResult(
		List<QlvtPhuongTienDangKyVietTrung> qlvtPhuongTienDangKyVietTrungs) {
		for (QlvtPhuongTienDangKyVietTrung qlvtPhuongTienDangKyVietTrung : qlvtPhuongTienDangKyVietTrungs) {
			if (EntityCacheUtil.getResult(
						QlvtPhuongTienDangKyVietTrungModelImpl.ENTITY_CACHE_ENABLED,
						QlvtPhuongTienDangKyVietTrungImpl.class,
						qlvtPhuongTienDangKyVietTrung.getPrimaryKey()) == null) {
				cacheResult(qlvtPhuongTienDangKyVietTrung);
			}
			else {
				qlvtPhuongTienDangKyVietTrung.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qlvt phuong tien dang ky viet trungs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QlvtPhuongTienDangKyVietTrungImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QlvtPhuongTienDangKyVietTrungImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qlvt phuong tien dang ky viet trung.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		QlvtPhuongTienDangKyVietTrung qlvtPhuongTienDangKyVietTrung) {
		EntityCacheUtil.removeResult(QlvtPhuongTienDangKyVietTrungModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienDangKyVietTrungImpl.class,
			qlvtPhuongTienDangKyVietTrung.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<QlvtPhuongTienDangKyVietTrung> qlvtPhuongTienDangKyVietTrungs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QlvtPhuongTienDangKyVietTrung qlvtPhuongTienDangKyVietTrung : qlvtPhuongTienDangKyVietTrungs) {
			EntityCacheUtil.removeResult(QlvtPhuongTienDangKyVietTrungModelImpl.ENTITY_CACHE_ENABLED,
				QlvtPhuongTienDangKyVietTrungImpl.class,
				qlvtPhuongTienDangKyVietTrung.getPrimaryKey());
		}
	}

	/**
	 * Creates a new qlvt phuong tien dang ky viet trung with the primary key. Does not add the qlvt phuong tien dang ky viet trung to the database.
	 *
	 * @param id the primary key for the new qlvt phuong tien dang ky viet trung
	 * @return the new qlvt phuong tien dang ky viet trung
	 */
	@Override
	public QlvtPhuongTienDangKyVietTrung create(long id) {
		QlvtPhuongTienDangKyVietTrung qlvtPhuongTienDangKyVietTrung = new QlvtPhuongTienDangKyVietTrungImpl();

		qlvtPhuongTienDangKyVietTrung.setNew(true);
		qlvtPhuongTienDangKyVietTrung.setPrimaryKey(id);

		return qlvtPhuongTienDangKyVietTrung;
	}

	/**
	 * Removes the qlvt phuong tien dang ky viet trung with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the qlvt phuong tien dang ky viet trung
	 * @return the qlvt phuong tien dang ky viet trung that was removed
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietTrungException if a qlvt phuong tien dang ky viet trung with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienDangKyVietTrung remove(long id)
		throws NoSuchQlvtPhuongTienDangKyVietTrungException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the qlvt phuong tien dang ky viet trung with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qlvt phuong tien dang ky viet trung
	 * @return the qlvt phuong tien dang ky viet trung that was removed
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietTrungException if a qlvt phuong tien dang ky viet trung with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienDangKyVietTrung remove(Serializable primaryKey)
		throws NoSuchQlvtPhuongTienDangKyVietTrungException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QlvtPhuongTienDangKyVietTrung qlvtPhuongTienDangKyVietTrung = (QlvtPhuongTienDangKyVietTrung)session.get(QlvtPhuongTienDangKyVietTrungImpl.class,
					primaryKey);

			if (qlvtPhuongTienDangKyVietTrung == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQlvtPhuongTienDangKyVietTrungException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtPhuongTienDangKyVietTrung);
		}
		catch (NoSuchQlvtPhuongTienDangKyVietTrungException nsee) {
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
	protected QlvtPhuongTienDangKyVietTrung removeImpl(
		QlvtPhuongTienDangKyVietTrung qlvtPhuongTienDangKyVietTrung)
		throws SystemException {
		qlvtPhuongTienDangKyVietTrung = toUnwrappedModel(qlvtPhuongTienDangKyVietTrung);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtPhuongTienDangKyVietTrung)) {
				qlvtPhuongTienDangKyVietTrung = (QlvtPhuongTienDangKyVietTrung)session.get(QlvtPhuongTienDangKyVietTrungImpl.class,
						qlvtPhuongTienDangKyVietTrung.getPrimaryKeyObj());
			}

			if (qlvtPhuongTienDangKyVietTrung != null) {
				session.delete(qlvtPhuongTienDangKyVietTrung);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtPhuongTienDangKyVietTrung != null) {
			clearCache(qlvtPhuongTienDangKyVietTrung);
		}

		return qlvtPhuongTienDangKyVietTrung;
	}

	@Override
	public QlvtPhuongTienDangKyVietTrung updateImpl(
		vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietTrung qlvtPhuongTienDangKyVietTrung)
		throws SystemException {
		qlvtPhuongTienDangKyVietTrung = toUnwrappedModel(qlvtPhuongTienDangKyVietTrung);

		boolean isNew = qlvtPhuongTienDangKyVietTrung.isNew();

		QlvtPhuongTienDangKyVietTrungModelImpl qlvtPhuongTienDangKyVietTrungModelImpl =
			(QlvtPhuongTienDangKyVietTrungModelImpl)qlvtPhuongTienDangKyVietTrung;

		Session session = null;

		try {
			session = openSession();

			if (qlvtPhuongTienDangKyVietTrung.isNew()) {
				session.save(qlvtPhuongTienDangKyVietTrung);

				qlvtPhuongTienDangKyVietTrung.setNew(false);
			}
			else {
				session.merge(qlvtPhuongTienDangKyVietTrung);
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
				!QlvtPhuongTienDangKyVietTrungModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((qlvtPhuongTienDangKyVietTrungModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOIDUNGHOSOID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						qlvtPhuongTienDangKyVietTrungModelImpl.getOriginalNoiDungHoSoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NOIDUNGHOSOID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOIDUNGHOSOID,
					args);

				args = new Object[] {
						qlvtPhuongTienDangKyVietTrungModelImpl.getNoiDungHoSoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NOIDUNGHOSOID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOIDUNGHOSOID,
					args);
			}
		}

		EntityCacheUtil.putResult(QlvtPhuongTienDangKyVietTrungModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienDangKyVietTrungImpl.class,
			qlvtPhuongTienDangKyVietTrung.getPrimaryKey(),
			qlvtPhuongTienDangKyVietTrung);

		return qlvtPhuongTienDangKyVietTrung;
	}

	protected QlvtPhuongTienDangKyVietTrung toUnwrappedModel(
		QlvtPhuongTienDangKyVietTrung qlvtPhuongTienDangKyVietTrung) {
		if (qlvtPhuongTienDangKyVietTrung instanceof QlvtPhuongTienDangKyVietTrungImpl) {
			return qlvtPhuongTienDangKyVietTrung;
		}

		QlvtPhuongTienDangKyVietTrungImpl qlvtPhuongTienDangKyVietTrungImpl = new QlvtPhuongTienDangKyVietTrungImpl();

		qlvtPhuongTienDangKyVietTrungImpl.setNew(qlvtPhuongTienDangKyVietTrung.isNew());
		qlvtPhuongTienDangKyVietTrungImpl.setPrimaryKey(qlvtPhuongTienDangKyVietTrung.getPrimaryKey());

		qlvtPhuongTienDangKyVietTrungImpl.setId(qlvtPhuongTienDangKyVietTrung.getId());
		qlvtPhuongTienDangKyVietTrungImpl.setBienSo(qlvtPhuongTienDangKyVietTrung.getBienSo());
		qlvtPhuongTienDangKyVietTrungImpl.setNhanHieu(qlvtPhuongTienDangKyVietTrung.getNhanHieu());
		qlvtPhuongTienDangKyVietTrungImpl.setTenDangKySoHuu(qlvtPhuongTienDangKyVietTrung.getTenDangKySoHuu());
		qlvtPhuongTienDangKyVietTrungImpl.setLoaiXe(qlvtPhuongTienDangKyVietTrung.getLoaiXe());
		qlvtPhuongTienDangKyVietTrungImpl.setTrongTai(qlvtPhuongTienDangKyVietTrung.getTrongTai());
		qlvtPhuongTienDangKyVietTrungImpl.setNamSanXuat(qlvtPhuongTienDangKyVietTrung.getNamSanXuat());
		qlvtPhuongTienDangKyVietTrungImpl.setCuaKhauXuatNhap(qlvtPhuongTienDangKyVietTrung.getCuaKhauXuatNhap());
		qlvtPhuongTienDangKyVietTrungImpl.setHinhThucHoatDong(qlvtPhuongTienDangKyVietTrung.getHinhThucHoatDong());
		qlvtPhuongTienDangKyVietTrungImpl.setTuyenHoatDong(qlvtPhuongTienDangKyVietTrung.getTuyenHoatDong());
		qlvtPhuongTienDangKyVietTrungImpl.setThoiGianXinCapPhepTu(qlvtPhuongTienDangKyVietTrung.getThoiGianXinCapPhepTu());
		qlvtPhuongTienDangKyVietTrungImpl.setThoiGianXinCapPhepDen(qlvtPhuongTienDangKyVietTrung.getThoiGianXinCapPhepDen());
		qlvtPhuongTienDangKyVietTrungImpl.setSoKhung(qlvtPhuongTienDangKyVietTrung.getSoKhung());
		qlvtPhuongTienDangKyVietTrungImpl.setMauSon(qlvtPhuongTienDangKyVietTrung.getMauSon());
		qlvtPhuongTienDangKyVietTrungImpl.setSoMay(qlvtPhuongTienDangKyVietTrung.getSoMay());
		qlvtPhuongTienDangKyVietTrungImpl.setLoaiHangVanChuyen(qlvtPhuongTienDangKyVietTrung.getLoaiHangVanChuyen());
		qlvtPhuongTienDangKyVietTrungImpl.setThoiGianDuKienKhoiHanh(qlvtPhuongTienDangKyVietTrung.getThoiGianDuKienKhoiHanh());
		qlvtPhuongTienDangKyVietTrungImpl.setHanhTrinhDeNghi(qlvtPhuongTienDangKyVietTrung.getHanhTrinhDeNghi());
		qlvtPhuongTienDangKyVietTrungImpl.setSoGiayPhepBiMatHong(qlvtPhuongTienDangKyVietTrung.getSoGiayPhepBiMatHong());
		qlvtPhuongTienDangKyVietTrungImpl.setDiemDungDoDangKy(qlvtPhuongTienDangKyVietTrung.getDiemDungDoDangKy());
		qlvtPhuongTienDangKyVietTrungImpl.setNoiDungHoSoId(qlvtPhuongTienDangKyVietTrung.getNoiDungHoSoId());
		qlvtPhuongTienDangKyVietTrungImpl.setHoSoThuTucId(qlvtPhuongTienDangKyVietTrung.getHoSoThuTucId());

		return qlvtPhuongTienDangKyVietTrungImpl;
	}

	/**
	 * Returns the qlvt phuong tien dang ky viet trung with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt phuong tien dang ky viet trung
	 * @return the qlvt phuong tien dang ky viet trung
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietTrungException if a qlvt phuong tien dang ky viet trung with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienDangKyVietTrung findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchQlvtPhuongTienDangKyVietTrungException, SystemException {
		QlvtPhuongTienDangKyVietTrung qlvtPhuongTienDangKyVietTrung = fetchByPrimaryKey(primaryKey);

		if (qlvtPhuongTienDangKyVietTrung == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQlvtPhuongTienDangKyVietTrungException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtPhuongTienDangKyVietTrung;
	}

	/**
	 * Returns the qlvt phuong tien dang ky viet trung with the primary key or throws a {@link vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietTrungException} if it could not be found.
	 *
	 * @param id the primary key of the qlvt phuong tien dang ky viet trung
	 * @return the qlvt phuong tien dang ky viet trung
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietTrungException if a qlvt phuong tien dang ky viet trung with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienDangKyVietTrung findByPrimaryKey(long id)
		throws NoSuchQlvtPhuongTienDangKyVietTrungException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the qlvt phuong tien dang ky viet trung with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt phuong tien dang ky viet trung
	 * @return the qlvt phuong tien dang ky viet trung, or <code>null</code> if a qlvt phuong tien dang ky viet trung with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienDangKyVietTrung fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		QlvtPhuongTienDangKyVietTrung qlvtPhuongTienDangKyVietTrung = (QlvtPhuongTienDangKyVietTrung)EntityCacheUtil.getResult(QlvtPhuongTienDangKyVietTrungModelImpl.ENTITY_CACHE_ENABLED,
				QlvtPhuongTienDangKyVietTrungImpl.class, primaryKey);

		if (qlvtPhuongTienDangKyVietTrung == _nullQlvtPhuongTienDangKyVietTrung) {
			return null;
		}

		if (qlvtPhuongTienDangKyVietTrung == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtPhuongTienDangKyVietTrung = (QlvtPhuongTienDangKyVietTrung)session.get(QlvtPhuongTienDangKyVietTrungImpl.class,
						primaryKey);

				if (qlvtPhuongTienDangKyVietTrung != null) {
					cacheResult(qlvtPhuongTienDangKyVietTrung);
				}
				else {
					EntityCacheUtil.putResult(QlvtPhuongTienDangKyVietTrungModelImpl.ENTITY_CACHE_ENABLED,
						QlvtPhuongTienDangKyVietTrungImpl.class, primaryKey,
						_nullQlvtPhuongTienDangKyVietTrung);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QlvtPhuongTienDangKyVietTrungModelImpl.ENTITY_CACHE_ENABLED,
					QlvtPhuongTienDangKyVietTrungImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtPhuongTienDangKyVietTrung;
	}

	/**
	 * Returns the qlvt phuong tien dang ky viet trung with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the qlvt phuong tien dang ky viet trung
	 * @return the qlvt phuong tien dang ky viet trung, or <code>null</code> if a qlvt phuong tien dang ky viet trung with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienDangKyVietTrung fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the qlvt phuong tien dang ky viet trungs.
	 *
	 * @return the qlvt phuong tien dang ky viet trungs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtPhuongTienDangKyVietTrung> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt phuong tien dang ky viet trungs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietTrungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt phuong tien dang ky viet trungs
	 * @param end the upper bound of the range of qlvt phuong tien dang ky viet trungs (not inclusive)
	 * @return the range of qlvt phuong tien dang ky viet trungs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtPhuongTienDangKyVietTrung> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt phuong tien dang ky viet trungs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietTrungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt phuong tien dang ky viet trungs
	 * @param end the upper bound of the range of qlvt phuong tien dang ky viet trungs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qlvt phuong tien dang ky viet trungs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtPhuongTienDangKyVietTrung> findAll(int start, int end,
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

		List<QlvtPhuongTienDangKyVietTrung> list = (List<QlvtPhuongTienDangKyVietTrung>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTPHUONGTIENDANGKYVIETTRUNG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTPHUONGTIENDANGKYVIETTRUNG;

				if (pagination) {
					sql = sql.concat(QlvtPhuongTienDangKyVietTrungModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QlvtPhuongTienDangKyVietTrung>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtPhuongTienDangKyVietTrung>(list);
				}
				else {
					list = (List<QlvtPhuongTienDangKyVietTrung>)QueryUtil.list(q,
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
	 * Removes all the qlvt phuong tien dang ky viet trungs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QlvtPhuongTienDangKyVietTrung qlvtPhuongTienDangKyVietTrung : findAll()) {
			remove(qlvtPhuongTienDangKyVietTrung);
		}
	}

	/**
	 * Returns the number of qlvt phuong tien dang ky viet trungs.
	 *
	 * @return the number of qlvt phuong tien dang ky viet trungs
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

				Query q = session.createQuery(_SQL_COUNT_QLVTPHUONGTIENDANGKYVIETTRUNG);

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
	 * Initializes the qlvt phuong tien dang ky viet trung persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietTrung")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QlvtPhuongTienDangKyVietTrung>> listenersList =
					new ArrayList<ModelListener<QlvtPhuongTienDangKyVietTrung>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QlvtPhuongTienDangKyVietTrung>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QlvtPhuongTienDangKyVietTrungImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTPHUONGTIENDANGKYVIETTRUNG = "SELECT qlvtPhuongTienDangKyVietTrung FROM QlvtPhuongTienDangKyVietTrung qlvtPhuongTienDangKyVietTrung";
	private static final String _SQL_SELECT_QLVTPHUONGTIENDANGKYVIETTRUNG_WHERE = "SELECT qlvtPhuongTienDangKyVietTrung FROM QlvtPhuongTienDangKyVietTrung qlvtPhuongTienDangKyVietTrung WHERE ";
	private static final String _SQL_COUNT_QLVTPHUONGTIENDANGKYVIETTRUNG = "SELECT COUNT(qlvtPhuongTienDangKyVietTrung) FROM QlvtPhuongTienDangKyVietTrung qlvtPhuongTienDangKyVietTrung";
	private static final String _SQL_COUNT_QLVTPHUONGTIENDANGKYVIETTRUNG_WHERE = "SELECT COUNT(qlvtPhuongTienDangKyVietTrung) FROM QlvtPhuongTienDangKyVietTrung qlvtPhuongTienDangKyVietTrung WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtPhuongTienDangKyVietTrung.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QlvtPhuongTienDangKyVietTrung exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No QlvtPhuongTienDangKyVietTrung exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QlvtPhuongTienDangKyVietTrungPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "BienSo", "NhanHieu", "tenDangKySoHuu", "loaiXe",
				"TrongTai", "NamSanXuat", "CuaKhauXuatNhap", "HinhThucHoatDong",
				"TuyenHoatDong", "ThoiGianXinCapPhepTu", "ThoiGianXinCapPhepDen",
				"SoKhung", "MauSon", "SoMay", "LoaiHangVanChuyen",
				"ThoiGianDuKienKhoiHanh", "hanhTrinhDeNghi",
				"soGiayPhepBiMatHong", "diemDungDoDangKy", "NoiDungHoSoId",
				"HoSoThuTucId"
			});
	private static QlvtPhuongTienDangKyVietTrung _nullQlvtPhuongTienDangKyVietTrung =
		new QlvtPhuongTienDangKyVietTrungImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QlvtPhuongTienDangKyVietTrung> toCacheModel() {
				return _nullQlvtPhuongTienDangKyVietTrungCacheModel;
			}
		};

	private static CacheModel<QlvtPhuongTienDangKyVietTrung> _nullQlvtPhuongTienDangKyVietTrungCacheModel =
		new CacheModel<QlvtPhuongTienDangKyVietTrung>() {
			@Override
			public QlvtPhuongTienDangKyVietTrung toEntityModel() {
				return _nullQlvtPhuongTienDangKyVietTrung;
			}
		};
}