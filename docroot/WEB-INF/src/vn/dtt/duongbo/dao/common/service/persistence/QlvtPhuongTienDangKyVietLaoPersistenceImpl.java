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

import vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietLaoException;
import vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietLao;
import vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietLaoImpl;
import vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietLaoModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the qlvt phuong tien dang ky viet lao service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see QlvtPhuongTienDangKyVietLaoPersistence
 * @see QlvtPhuongTienDangKyVietLaoUtil
 * @generated
 */
public class QlvtPhuongTienDangKyVietLaoPersistenceImpl
	extends BasePersistenceImpl<QlvtPhuongTienDangKyVietLao>
	implements QlvtPhuongTienDangKyVietLaoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QlvtPhuongTienDangKyVietLaoUtil} to access the qlvt phuong tien dang ky viet lao persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QlvtPhuongTienDangKyVietLaoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QlvtPhuongTienDangKyVietLaoModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienDangKyVietLaoModelImpl.FINDER_CACHE_ENABLED,
			QlvtPhuongTienDangKyVietLaoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QlvtPhuongTienDangKyVietLaoModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienDangKyVietLaoModelImpl.FINDER_CACHE_ENABLED,
			QlvtPhuongTienDangKyVietLaoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QlvtPhuongTienDangKyVietLaoModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienDangKyVietLaoModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NOIDUNGHOSOID =
		new FinderPath(QlvtPhuongTienDangKyVietLaoModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienDangKyVietLaoModelImpl.FINDER_CACHE_ENABLED,
			QlvtPhuongTienDangKyVietLaoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByNoiDungHoSoId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOIDUNGHOSOID =
		new FinderPath(QlvtPhuongTienDangKyVietLaoModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienDangKyVietLaoModelImpl.FINDER_CACHE_ENABLED,
			QlvtPhuongTienDangKyVietLaoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByNoiDungHoSoId",
			new String[] { Long.class.getName() },
			QlvtPhuongTienDangKyVietLaoModelImpl.NOIDUNGHOSOID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NOIDUNGHOSOID = new FinderPath(QlvtPhuongTienDangKyVietLaoModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienDangKyVietLaoModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByNoiDungHoSoId", new String[] { Long.class.getName() });

	/**
	 * Returns all the qlvt phuong tien dang ky viet laos where NoiDungHoSoId = &#63;.
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @return the matching qlvt phuong tien dang ky viet laos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtPhuongTienDangKyVietLao> findByNoiDungHoSoId(
		long NoiDungHoSoId) throws SystemException {
		return findByNoiDungHoSoId(NoiDungHoSoId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt phuong tien dang ky viet laos where NoiDungHoSoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietLaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @param start the lower bound of the range of qlvt phuong tien dang ky viet laos
	 * @param end the upper bound of the range of qlvt phuong tien dang ky viet laos (not inclusive)
	 * @return the range of matching qlvt phuong tien dang ky viet laos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtPhuongTienDangKyVietLao> findByNoiDungHoSoId(
		long NoiDungHoSoId, int start, int end) throws SystemException {
		return findByNoiDungHoSoId(NoiDungHoSoId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt phuong tien dang ky viet laos where NoiDungHoSoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietLaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @param start the lower bound of the range of qlvt phuong tien dang ky viet laos
	 * @param end the upper bound of the range of qlvt phuong tien dang ky viet laos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching qlvt phuong tien dang ky viet laos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtPhuongTienDangKyVietLao> findByNoiDungHoSoId(
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

		List<QlvtPhuongTienDangKyVietLao> list = (List<QlvtPhuongTienDangKyVietLao>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (QlvtPhuongTienDangKyVietLao qlvtPhuongTienDangKyVietLao : list) {
				if ((NoiDungHoSoId != qlvtPhuongTienDangKyVietLao.getNoiDungHoSoId())) {
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

			query.append(_SQL_SELECT_QLVTPHUONGTIENDANGKYVIETLAO_WHERE);

			query.append(_FINDER_COLUMN_NOIDUNGHOSOID_NOIDUNGHOSOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(QlvtPhuongTienDangKyVietLaoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(NoiDungHoSoId);

				if (!pagination) {
					list = (List<QlvtPhuongTienDangKyVietLao>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtPhuongTienDangKyVietLao>(list);
				}
				else {
					list = (List<QlvtPhuongTienDangKyVietLao>)QueryUtil.list(q,
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
	 * Returns the first qlvt phuong tien dang ky viet lao in the ordered set where NoiDungHoSoId = &#63;.
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qlvt phuong tien dang ky viet lao
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietLaoException if a matching qlvt phuong tien dang ky viet lao could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienDangKyVietLao findByNoiDungHoSoId_First(
		long NoiDungHoSoId, OrderByComparator orderByComparator)
		throws NoSuchQlvtPhuongTienDangKyVietLaoException, SystemException {
		QlvtPhuongTienDangKyVietLao qlvtPhuongTienDangKyVietLao = fetchByNoiDungHoSoId_First(NoiDungHoSoId,
				orderByComparator);

		if (qlvtPhuongTienDangKyVietLao != null) {
			return qlvtPhuongTienDangKyVietLao;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("NoiDungHoSoId=");
		msg.append(NoiDungHoSoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchQlvtPhuongTienDangKyVietLaoException(msg.toString());
	}

	/**
	 * Returns the first qlvt phuong tien dang ky viet lao in the ordered set where NoiDungHoSoId = &#63;.
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qlvt phuong tien dang ky viet lao, or <code>null</code> if a matching qlvt phuong tien dang ky viet lao could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienDangKyVietLao fetchByNoiDungHoSoId_First(
		long NoiDungHoSoId, OrderByComparator orderByComparator)
		throws SystemException {
		List<QlvtPhuongTienDangKyVietLao> list = findByNoiDungHoSoId(NoiDungHoSoId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last qlvt phuong tien dang ky viet lao in the ordered set where NoiDungHoSoId = &#63;.
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qlvt phuong tien dang ky viet lao
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietLaoException if a matching qlvt phuong tien dang ky viet lao could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienDangKyVietLao findByNoiDungHoSoId_Last(
		long NoiDungHoSoId, OrderByComparator orderByComparator)
		throws NoSuchQlvtPhuongTienDangKyVietLaoException, SystemException {
		QlvtPhuongTienDangKyVietLao qlvtPhuongTienDangKyVietLao = fetchByNoiDungHoSoId_Last(NoiDungHoSoId,
				orderByComparator);

		if (qlvtPhuongTienDangKyVietLao != null) {
			return qlvtPhuongTienDangKyVietLao;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("NoiDungHoSoId=");
		msg.append(NoiDungHoSoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchQlvtPhuongTienDangKyVietLaoException(msg.toString());
	}

	/**
	 * Returns the last qlvt phuong tien dang ky viet lao in the ordered set where NoiDungHoSoId = &#63;.
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qlvt phuong tien dang ky viet lao, or <code>null</code> if a matching qlvt phuong tien dang ky viet lao could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienDangKyVietLao fetchByNoiDungHoSoId_Last(
		long NoiDungHoSoId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByNoiDungHoSoId(NoiDungHoSoId);

		if (count == 0) {
			return null;
		}

		List<QlvtPhuongTienDangKyVietLao> list = findByNoiDungHoSoId(NoiDungHoSoId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the qlvt phuong tien dang ky viet laos before and after the current qlvt phuong tien dang ky viet lao in the ordered set where NoiDungHoSoId = &#63;.
	 *
	 * @param id the primary key of the current qlvt phuong tien dang ky viet lao
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next qlvt phuong tien dang ky viet lao
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietLaoException if a qlvt phuong tien dang ky viet lao with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienDangKyVietLao[] findByNoiDungHoSoId_PrevAndNext(
		long id, long NoiDungHoSoId, OrderByComparator orderByComparator)
		throws NoSuchQlvtPhuongTienDangKyVietLaoException, SystemException {
		QlvtPhuongTienDangKyVietLao qlvtPhuongTienDangKyVietLao = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			QlvtPhuongTienDangKyVietLao[] array = new QlvtPhuongTienDangKyVietLaoImpl[3];

			array[0] = getByNoiDungHoSoId_PrevAndNext(session,
					qlvtPhuongTienDangKyVietLao, NoiDungHoSoId,
					orderByComparator, true);

			array[1] = qlvtPhuongTienDangKyVietLao;

			array[2] = getByNoiDungHoSoId_PrevAndNext(session,
					qlvtPhuongTienDangKyVietLao, NoiDungHoSoId,
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

	protected QlvtPhuongTienDangKyVietLao getByNoiDungHoSoId_PrevAndNext(
		Session session,
		QlvtPhuongTienDangKyVietLao qlvtPhuongTienDangKyVietLao,
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

		query.append(_SQL_SELECT_QLVTPHUONGTIENDANGKYVIETLAO_WHERE);

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
			query.append(QlvtPhuongTienDangKyVietLaoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(NoiDungHoSoId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(qlvtPhuongTienDangKyVietLao);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<QlvtPhuongTienDangKyVietLao> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the qlvt phuong tien dang ky viet laos where NoiDungHoSoId = &#63; from the database.
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByNoiDungHoSoId(long NoiDungHoSoId)
		throws SystemException {
		for (QlvtPhuongTienDangKyVietLao qlvtPhuongTienDangKyVietLao : findByNoiDungHoSoId(
				NoiDungHoSoId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(qlvtPhuongTienDangKyVietLao);
		}
	}

	/**
	 * Returns the number of qlvt phuong tien dang ky viet laos where NoiDungHoSoId = &#63;.
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @return the number of matching qlvt phuong tien dang ky viet laos
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

			query.append(_SQL_COUNT_QLVTPHUONGTIENDANGKYVIETLAO_WHERE);

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

	private static final String _FINDER_COLUMN_NOIDUNGHOSOID_NOIDUNGHOSOID_2 = "qlvtPhuongTienDangKyVietLao.NoiDungHoSoId = ?";

	public QlvtPhuongTienDangKyVietLaoPersistenceImpl() {
		setModelClass(QlvtPhuongTienDangKyVietLao.class);
	}

	/**
	 * Caches the qlvt phuong tien dang ky viet lao in the entity cache if it is enabled.
	 *
	 * @param qlvtPhuongTienDangKyVietLao the qlvt phuong tien dang ky viet lao
	 */
	@Override
	public void cacheResult(
		QlvtPhuongTienDangKyVietLao qlvtPhuongTienDangKyVietLao) {
		EntityCacheUtil.putResult(QlvtPhuongTienDangKyVietLaoModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienDangKyVietLaoImpl.class,
			qlvtPhuongTienDangKyVietLao.getPrimaryKey(),
			qlvtPhuongTienDangKyVietLao);

		qlvtPhuongTienDangKyVietLao.resetOriginalValues();
	}

	/**
	 * Caches the qlvt phuong tien dang ky viet laos in the entity cache if it is enabled.
	 *
	 * @param qlvtPhuongTienDangKyVietLaos the qlvt phuong tien dang ky viet laos
	 */
	@Override
	public void cacheResult(
		List<QlvtPhuongTienDangKyVietLao> qlvtPhuongTienDangKyVietLaos) {
		for (QlvtPhuongTienDangKyVietLao qlvtPhuongTienDangKyVietLao : qlvtPhuongTienDangKyVietLaos) {
			if (EntityCacheUtil.getResult(
						QlvtPhuongTienDangKyVietLaoModelImpl.ENTITY_CACHE_ENABLED,
						QlvtPhuongTienDangKyVietLaoImpl.class,
						qlvtPhuongTienDangKyVietLao.getPrimaryKey()) == null) {
				cacheResult(qlvtPhuongTienDangKyVietLao);
			}
			else {
				qlvtPhuongTienDangKyVietLao.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qlvt phuong tien dang ky viet laos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QlvtPhuongTienDangKyVietLaoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QlvtPhuongTienDangKyVietLaoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qlvt phuong tien dang ky viet lao.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		QlvtPhuongTienDangKyVietLao qlvtPhuongTienDangKyVietLao) {
		EntityCacheUtil.removeResult(QlvtPhuongTienDangKyVietLaoModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienDangKyVietLaoImpl.class,
			qlvtPhuongTienDangKyVietLao.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<QlvtPhuongTienDangKyVietLao> qlvtPhuongTienDangKyVietLaos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QlvtPhuongTienDangKyVietLao qlvtPhuongTienDangKyVietLao : qlvtPhuongTienDangKyVietLaos) {
			EntityCacheUtil.removeResult(QlvtPhuongTienDangKyVietLaoModelImpl.ENTITY_CACHE_ENABLED,
				QlvtPhuongTienDangKyVietLaoImpl.class,
				qlvtPhuongTienDangKyVietLao.getPrimaryKey());
		}
	}

	/**
	 * Creates a new qlvt phuong tien dang ky viet lao with the primary key. Does not add the qlvt phuong tien dang ky viet lao to the database.
	 *
	 * @param id the primary key for the new qlvt phuong tien dang ky viet lao
	 * @return the new qlvt phuong tien dang ky viet lao
	 */
	@Override
	public QlvtPhuongTienDangKyVietLao create(long id) {
		QlvtPhuongTienDangKyVietLao qlvtPhuongTienDangKyVietLao = new QlvtPhuongTienDangKyVietLaoImpl();

		qlvtPhuongTienDangKyVietLao.setNew(true);
		qlvtPhuongTienDangKyVietLao.setPrimaryKey(id);

		return qlvtPhuongTienDangKyVietLao;
	}

	/**
	 * Removes the qlvt phuong tien dang ky viet lao with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the qlvt phuong tien dang ky viet lao
	 * @return the qlvt phuong tien dang ky viet lao that was removed
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietLaoException if a qlvt phuong tien dang ky viet lao with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienDangKyVietLao remove(long id)
		throws NoSuchQlvtPhuongTienDangKyVietLaoException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the qlvt phuong tien dang ky viet lao with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qlvt phuong tien dang ky viet lao
	 * @return the qlvt phuong tien dang ky viet lao that was removed
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietLaoException if a qlvt phuong tien dang ky viet lao with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienDangKyVietLao remove(Serializable primaryKey)
		throws NoSuchQlvtPhuongTienDangKyVietLaoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QlvtPhuongTienDangKyVietLao qlvtPhuongTienDangKyVietLao = (QlvtPhuongTienDangKyVietLao)session.get(QlvtPhuongTienDangKyVietLaoImpl.class,
					primaryKey);

			if (qlvtPhuongTienDangKyVietLao == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQlvtPhuongTienDangKyVietLaoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtPhuongTienDangKyVietLao);
		}
		catch (NoSuchQlvtPhuongTienDangKyVietLaoException nsee) {
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
	protected QlvtPhuongTienDangKyVietLao removeImpl(
		QlvtPhuongTienDangKyVietLao qlvtPhuongTienDangKyVietLao)
		throws SystemException {
		qlvtPhuongTienDangKyVietLao = toUnwrappedModel(qlvtPhuongTienDangKyVietLao);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtPhuongTienDangKyVietLao)) {
				qlvtPhuongTienDangKyVietLao = (QlvtPhuongTienDangKyVietLao)session.get(QlvtPhuongTienDangKyVietLaoImpl.class,
						qlvtPhuongTienDangKyVietLao.getPrimaryKeyObj());
			}

			if (qlvtPhuongTienDangKyVietLao != null) {
				session.delete(qlvtPhuongTienDangKyVietLao);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtPhuongTienDangKyVietLao != null) {
			clearCache(qlvtPhuongTienDangKyVietLao);
		}

		return qlvtPhuongTienDangKyVietLao;
	}

	@Override
	public QlvtPhuongTienDangKyVietLao updateImpl(
		vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietLao qlvtPhuongTienDangKyVietLao)
		throws SystemException {
		qlvtPhuongTienDangKyVietLao = toUnwrappedModel(qlvtPhuongTienDangKyVietLao);

		boolean isNew = qlvtPhuongTienDangKyVietLao.isNew();

		QlvtPhuongTienDangKyVietLaoModelImpl qlvtPhuongTienDangKyVietLaoModelImpl =
			(QlvtPhuongTienDangKyVietLaoModelImpl)qlvtPhuongTienDangKyVietLao;

		Session session = null;

		try {
			session = openSession();

			if (qlvtPhuongTienDangKyVietLao.isNew()) {
				session.save(qlvtPhuongTienDangKyVietLao);

				qlvtPhuongTienDangKyVietLao.setNew(false);
			}
			else {
				session.merge(qlvtPhuongTienDangKyVietLao);
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
				!QlvtPhuongTienDangKyVietLaoModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((qlvtPhuongTienDangKyVietLaoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOIDUNGHOSOID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						qlvtPhuongTienDangKyVietLaoModelImpl.getOriginalNoiDungHoSoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NOIDUNGHOSOID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOIDUNGHOSOID,
					args);

				args = new Object[] {
						qlvtPhuongTienDangKyVietLaoModelImpl.getNoiDungHoSoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NOIDUNGHOSOID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOIDUNGHOSOID,
					args);
			}
		}

		EntityCacheUtil.putResult(QlvtPhuongTienDangKyVietLaoModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienDangKyVietLaoImpl.class,
			qlvtPhuongTienDangKyVietLao.getPrimaryKey(),
			qlvtPhuongTienDangKyVietLao);

		return qlvtPhuongTienDangKyVietLao;
	}

	protected QlvtPhuongTienDangKyVietLao toUnwrappedModel(
		QlvtPhuongTienDangKyVietLao qlvtPhuongTienDangKyVietLao) {
		if (qlvtPhuongTienDangKyVietLao instanceof QlvtPhuongTienDangKyVietLaoImpl) {
			return qlvtPhuongTienDangKyVietLao;
		}

		QlvtPhuongTienDangKyVietLaoImpl qlvtPhuongTienDangKyVietLaoImpl = new QlvtPhuongTienDangKyVietLaoImpl();

		qlvtPhuongTienDangKyVietLaoImpl.setNew(qlvtPhuongTienDangKyVietLao.isNew());
		qlvtPhuongTienDangKyVietLaoImpl.setPrimaryKey(qlvtPhuongTienDangKyVietLao.getPrimaryKey());

		qlvtPhuongTienDangKyVietLaoImpl.setId(qlvtPhuongTienDangKyVietLao.getId());
		qlvtPhuongTienDangKyVietLaoImpl.setBienSo(qlvtPhuongTienDangKyVietLao.getBienSo());
		qlvtPhuongTienDangKyVietLaoImpl.setTenDangKySoHuu(qlvtPhuongTienDangKyVietLao.getTenDangKySoHuu());
		qlvtPhuongTienDangKyVietLaoImpl.setNhanHieu(qlvtPhuongTienDangKyVietLao.getNhanHieu());
		qlvtPhuongTienDangKyVietLaoImpl.setTrongTai(qlvtPhuongTienDangKyVietLao.getTrongTai());
		qlvtPhuongTienDangKyVietLaoImpl.setNamSanXuat(qlvtPhuongTienDangKyVietLao.getNamSanXuat());
		qlvtPhuongTienDangKyVietLaoImpl.setCuaKhauXuatNhap(qlvtPhuongTienDangKyVietLao.getCuaKhauXuatNhap());
		qlvtPhuongTienDangKyVietLaoImpl.setHinhThucHoatDong(qlvtPhuongTienDangKyVietLao.getHinhThucHoatDong());
		qlvtPhuongTienDangKyVietLaoImpl.setLoaiHinhHoatDong(qlvtPhuongTienDangKyVietLao.getLoaiHinhHoatDong());
		qlvtPhuongTienDangKyVietLaoImpl.setTuyenHoatDong(qlvtPhuongTienDangKyVietLao.getTuyenHoatDong());
		qlvtPhuongTienDangKyVietLaoImpl.setThoiGianXinCapPhepTu(qlvtPhuongTienDangKyVietLao.getThoiGianXinCapPhepTu());
		qlvtPhuongTienDangKyVietLaoImpl.setThoiGianXinCapPhepDen(qlvtPhuongTienDangKyVietLao.getThoiGianXinCapPhepDen());
		qlvtPhuongTienDangKyVietLaoImpl.setSoKhung(qlvtPhuongTienDangKyVietLao.getSoKhung());
		qlvtPhuongTienDangKyVietLaoImpl.setMauSon(qlvtPhuongTienDangKyVietLao.getMauSon());
		qlvtPhuongTienDangKyVietLaoImpl.setSoMay(qlvtPhuongTienDangKyVietLao.getSoMay());
		qlvtPhuongTienDangKyVietLaoImpl.setLoaiHangVanChuyen(qlvtPhuongTienDangKyVietLao.getLoaiHangVanChuyen());
		qlvtPhuongTienDangKyVietLaoImpl.setThoiGianDuKienKhoiHanh(qlvtPhuongTienDangKyVietLao.getThoiGianDuKienKhoiHanh());
		qlvtPhuongTienDangKyVietLaoImpl.setNoiDungHoSoId(qlvtPhuongTienDangKyVietLao.getNoiDungHoSoId());
		qlvtPhuongTienDangKyVietLaoImpl.setHoSoThuTucId(qlvtPhuongTienDangKyVietLao.getHoSoThuTucId());

		return qlvtPhuongTienDangKyVietLaoImpl;
	}

	/**
	 * Returns the qlvt phuong tien dang ky viet lao with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt phuong tien dang ky viet lao
	 * @return the qlvt phuong tien dang ky viet lao
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietLaoException if a qlvt phuong tien dang ky viet lao with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienDangKyVietLao findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQlvtPhuongTienDangKyVietLaoException, SystemException {
		QlvtPhuongTienDangKyVietLao qlvtPhuongTienDangKyVietLao = fetchByPrimaryKey(primaryKey);

		if (qlvtPhuongTienDangKyVietLao == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQlvtPhuongTienDangKyVietLaoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtPhuongTienDangKyVietLao;
	}

	/**
	 * Returns the qlvt phuong tien dang ky viet lao with the primary key or throws a {@link vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietLaoException} if it could not be found.
	 *
	 * @param id the primary key of the qlvt phuong tien dang ky viet lao
	 * @return the qlvt phuong tien dang ky viet lao
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietLaoException if a qlvt phuong tien dang ky viet lao with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienDangKyVietLao findByPrimaryKey(long id)
		throws NoSuchQlvtPhuongTienDangKyVietLaoException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the qlvt phuong tien dang ky viet lao with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt phuong tien dang ky viet lao
	 * @return the qlvt phuong tien dang ky viet lao, or <code>null</code> if a qlvt phuong tien dang ky viet lao with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienDangKyVietLao fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		QlvtPhuongTienDangKyVietLao qlvtPhuongTienDangKyVietLao = (QlvtPhuongTienDangKyVietLao)EntityCacheUtil.getResult(QlvtPhuongTienDangKyVietLaoModelImpl.ENTITY_CACHE_ENABLED,
				QlvtPhuongTienDangKyVietLaoImpl.class, primaryKey);

		if (qlvtPhuongTienDangKyVietLao == _nullQlvtPhuongTienDangKyVietLao) {
			return null;
		}

		if (qlvtPhuongTienDangKyVietLao == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtPhuongTienDangKyVietLao = (QlvtPhuongTienDangKyVietLao)session.get(QlvtPhuongTienDangKyVietLaoImpl.class,
						primaryKey);

				if (qlvtPhuongTienDangKyVietLao != null) {
					cacheResult(qlvtPhuongTienDangKyVietLao);
				}
				else {
					EntityCacheUtil.putResult(QlvtPhuongTienDangKyVietLaoModelImpl.ENTITY_CACHE_ENABLED,
						QlvtPhuongTienDangKyVietLaoImpl.class, primaryKey,
						_nullQlvtPhuongTienDangKyVietLao);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QlvtPhuongTienDangKyVietLaoModelImpl.ENTITY_CACHE_ENABLED,
					QlvtPhuongTienDangKyVietLaoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtPhuongTienDangKyVietLao;
	}

	/**
	 * Returns the qlvt phuong tien dang ky viet lao with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the qlvt phuong tien dang ky viet lao
	 * @return the qlvt phuong tien dang ky viet lao, or <code>null</code> if a qlvt phuong tien dang ky viet lao with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienDangKyVietLao fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the qlvt phuong tien dang ky viet laos.
	 *
	 * @return the qlvt phuong tien dang ky viet laos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtPhuongTienDangKyVietLao> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt phuong tien dang ky viet laos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietLaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt phuong tien dang ky viet laos
	 * @param end the upper bound of the range of qlvt phuong tien dang ky viet laos (not inclusive)
	 * @return the range of qlvt phuong tien dang ky viet laos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtPhuongTienDangKyVietLao> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt phuong tien dang ky viet laos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietLaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt phuong tien dang ky viet laos
	 * @param end the upper bound of the range of qlvt phuong tien dang ky viet laos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qlvt phuong tien dang ky viet laos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtPhuongTienDangKyVietLao> findAll(int start, int end,
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

		List<QlvtPhuongTienDangKyVietLao> list = (List<QlvtPhuongTienDangKyVietLao>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTPHUONGTIENDANGKYVIETLAO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTPHUONGTIENDANGKYVIETLAO;

				if (pagination) {
					sql = sql.concat(QlvtPhuongTienDangKyVietLaoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QlvtPhuongTienDangKyVietLao>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtPhuongTienDangKyVietLao>(list);
				}
				else {
					list = (List<QlvtPhuongTienDangKyVietLao>)QueryUtil.list(q,
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
	 * Removes all the qlvt phuong tien dang ky viet laos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QlvtPhuongTienDangKyVietLao qlvtPhuongTienDangKyVietLao : findAll()) {
			remove(qlvtPhuongTienDangKyVietLao);
		}
	}

	/**
	 * Returns the number of qlvt phuong tien dang ky viet laos.
	 *
	 * @return the number of qlvt phuong tien dang ky viet laos
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

				Query q = session.createQuery(_SQL_COUNT_QLVTPHUONGTIENDANGKYVIETLAO);

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
	 * Initializes the qlvt phuong tien dang ky viet lao persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietLao")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QlvtPhuongTienDangKyVietLao>> listenersList = new ArrayList<ModelListener<QlvtPhuongTienDangKyVietLao>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QlvtPhuongTienDangKyVietLao>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QlvtPhuongTienDangKyVietLaoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTPHUONGTIENDANGKYVIETLAO = "SELECT qlvtPhuongTienDangKyVietLao FROM QlvtPhuongTienDangKyVietLao qlvtPhuongTienDangKyVietLao";
	private static final String _SQL_SELECT_QLVTPHUONGTIENDANGKYVIETLAO_WHERE = "SELECT qlvtPhuongTienDangKyVietLao FROM QlvtPhuongTienDangKyVietLao qlvtPhuongTienDangKyVietLao WHERE ";
	private static final String _SQL_COUNT_QLVTPHUONGTIENDANGKYVIETLAO = "SELECT COUNT(qlvtPhuongTienDangKyVietLao) FROM QlvtPhuongTienDangKyVietLao qlvtPhuongTienDangKyVietLao";
	private static final String _SQL_COUNT_QLVTPHUONGTIENDANGKYVIETLAO_WHERE = "SELECT COUNT(qlvtPhuongTienDangKyVietLao) FROM QlvtPhuongTienDangKyVietLao qlvtPhuongTienDangKyVietLao WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtPhuongTienDangKyVietLao.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QlvtPhuongTienDangKyVietLao exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No QlvtPhuongTienDangKyVietLao exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QlvtPhuongTienDangKyVietLaoPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "BienSo", "TenDangKySoHuu", "NhanHieu", "TrongTai",
				"NamSanXuat", "CuaKhauXuatNhap", "HinhThucHoatDong",
				"LoaiHinhHoatDong", "TuyenHoatDong", "ThoiGianXinCapPhepTu",
				"ThoiGianXinCapPhepDen", "SoKhung", "MauSon", "SoMay",
				"LoaiHangVanChuyen", "ThoiGianDuKienKhoiHanh", "NoiDungHoSoId",
				"HoSoThuTucId"
			});
	private static QlvtPhuongTienDangKyVietLao _nullQlvtPhuongTienDangKyVietLao = new QlvtPhuongTienDangKyVietLaoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QlvtPhuongTienDangKyVietLao> toCacheModel() {
				return _nullQlvtPhuongTienDangKyVietLaoCacheModel;
			}
		};

	private static CacheModel<QlvtPhuongTienDangKyVietLao> _nullQlvtPhuongTienDangKyVietLaoCacheModel =
		new CacheModel<QlvtPhuongTienDangKyVietLao>() {
			@Override
			public QlvtPhuongTienDangKyVietLao toEntityModel() {
				return _nullQlvtPhuongTienDangKyVietLao;
			}
		};
}