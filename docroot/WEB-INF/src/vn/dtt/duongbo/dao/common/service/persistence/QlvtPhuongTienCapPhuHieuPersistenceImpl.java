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

import vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienCapPhuHieuException;
import vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu;
import vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienCapPhuHieuImpl;
import vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienCapPhuHieuModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the qlvt phuong tien cap phu hieu service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see QlvtPhuongTienCapPhuHieuPersistence
 * @see QlvtPhuongTienCapPhuHieuUtil
 * @generated
 */
public class QlvtPhuongTienCapPhuHieuPersistenceImpl extends BasePersistenceImpl<QlvtPhuongTienCapPhuHieu>
	implements QlvtPhuongTienCapPhuHieuPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QlvtPhuongTienCapPhuHieuUtil} to access the qlvt phuong tien cap phu hieu persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QlvtPhuongTienCapPhuHieuImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QlvtPhuongTienCapPhuHieuModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienCapPhuHieuModelImpl.FINDER_CACHE_ENABLED,
			QlvtPhuongTienCapPhuHieuImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QlvtPhuongTienCapPhuHieuModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienCapPhuHieuModelImpl.FINDER_CACHE_ENABLED,
			QlvtPhuongTienCapPhuHieuImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QlvtPhuongTienCapPhuHieuModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienCapPhuHieuModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NOIDUNGHOSOID =
		new FinderPath(QlvtPhuongTienCapPhuHieuModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienCapPhuHieuModelImpl.FINDER_CACHE_ENABLED,
			QlvtPhuongTienCapPhuHieuImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByNoiDungHoSoId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOIDUNGHOSOID =
		new FinderPath(QlvtPhuongTienCapPhuHieuModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienCapPhuHieuModelImpl.FINDER_CACHE_ENABLED,
			QlvtPhuongTienCapPhuHieuImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByNoiDungHoSoId",
			new String[] { Long.class.getName() },
			QlvtPhuongTienCapPhuHieuModelImpl.NOIDUNGHOSOID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NOIDUNGHOSOID = new FinderPath(QlvtPhuongTienCapPhuHieuModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienCapPhuHieuModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByNoiDungHoSoId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the qlvt phuong tien cap phu hieus where NoiDungHoSoId = &#63;.
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @return the matching qlvt phuong tien cap phu hieus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtPhuongTienCapPhuHieu> findByNoiDungHoSoId(
		long NoiDungHoSoId) throws SystemException {
		return findByNoiDungHoSoId(NoiDungHoSoId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt phuong tien cap phu hieus where NoiDungHoSoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienCapPhuHieuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @param start the lower bound of the range of qlvt phuong tien cap phu hieus
	 * @param end the upper bound of the range of qlvt phuong tien cap phu hieus (not inclusive)
	 * @return the range of matching qlvt phuong tien cap phu hieus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtPhuongTienCapPhuHieu> findByNoiDungHoSoId(
		long NoiDungHoSoId, int start, int end) throws SystemException {
		return findByNoiDungHoSoId(NoiDungHoSoId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt phuong tien cap phu hieus where NoiDungHoSoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienCapPhuHieuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @param start the lower bound of the range of qlvt phuong tien cap phu hieus
	 * @param end the upper bound of the range of qlvt phuong tien cap phu hieus (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching qlvt phuong tien cap phu hieus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtPhuongTienCapPhuHieu> findByNoiDungHoSoId(
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

		List<QlvtPhuongTienCapPhuHieu> list = (List<QlvtPhuongTienCapPhuHieu>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (QlvtPhuongTienCapPhuHieu qlvtPhuongTienCapPhuHieu : list) {
				if ((NoiDungHoSoId != qlvtPhuongTienCapPhuHieu.getNoiDungHoSoId())) {
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

			query.append(_SQL_SELECT_QLVTPHUONGTIENCAPPHUHIEU_WHERE);

			query.append(_FINDER_COLUMN_NOIDUNGHOSOID_NOIDUNGHOSOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(QlvtPhuongTienCapPhuHieuModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(NoiDungHoSoId);

				if (!pagination) {
					list = (List<QlvtPhuongTienCapPhuHieu>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtPhuongTienCapPhuHieu>(list);
				}
				else {
					list = (List<QlvtPhuongTienCapPhuHieu>)QueryUtil.list(q,
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
	 * Returns the first qlvt phuong tien cap phu hieu in the ordered set where NoiDungHoSoId = &#63;.
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qlvt phuong tien cap phu hieu
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienCapPhuHieuException if a matching qlvt phuong tien cap phu hieu could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienCapPhuHieu findByNoiDungHoSoId_First(
		long NoiDungHoSoId, OrderByComparator orderByComparator)
		throws NoSuchQlvtPhuongTienCapPhuHieuException, SystemException {
		QlvtPhuongTienCapPhuHieu qlvtPhuongTienCapPhuHieu = fetchByNoiDungHoSoId_First(NoiDungHoSoId,
				orderByComparator);

		if (qlvtPhuongTienCapPhuHieu != null) {
			return qlvtPhuongTienCapPhuHieu;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("NoiDungHoSoId=");
		msg.append(NoiDungHoSoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchQlvtPhuongTienCapPhuHieuException(msg.toString());
	}

	/**
	 * Returns the first qlvt phuong tien cap phu hieu in the ordered set where NoiDungHoSoId = &#63;.
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qlvt phuong tien cap phu hieu, or <code>null</code> if a matching qlvt phuong tien cap phu hieu could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienCapPhuHieu fetchByNoiDungHoSoId_First(
		long NoiDungHoSoId, OrderByComparator orderByComparator)
		throws SystemException {
		List<QlvtPhuongTienCapPhuHieu> list = findByNoiDungHoSoId(NoiDungHoSoId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last qlvt phuong tien cap phu hieu in the ordered set where NoiDungHoSoId = &#63;.
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qlvt phuong tien cap phu hieu
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienCapPhuHieuException if a matching qlvt phuong tien cap phu hieu could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienCapPhuHieu findByNoiDungHoSoId_Last(
		long NoiDungHoSoId, OrderByComparator orderByComparator)
		throws NoSuchQlvtPhuongTienCapPhuHieuException, SystemException {
		QlvtPhuongTienCapPhuHieu qlvtPhuongTienCapPhuHieu = fetchByNoiDungHoSoId_Last(NoiDungHoSoId,
				orderByComparator);

		if (qlvtPhuongTienCapPhuHieu != null) {
			return qlvtPhuongTienCapPhuHieu;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("NoiDungHoSoId=");
		msg.append(NoiDungHoSoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchQlvtPhuongTienCapPhuHieuException(msg.toString());
	}

	/**
	 * Returns the last qlvt phuong tien cap phu hieu in the ordered set where NoiDungHoSoId = &#63;.
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qlvt phuong tien cap phu hieu, or <code>null</code> if a matching qlvt phuong tien cap phu hieu could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienCapPhuHieu fetchByNoiDungHoSoId_Last(
		long NoiDungHoSoId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByNoiDungHoSoId(NoiDungHoSoId);

		if (count == 0) {
			return null;
		}

		List<QlvtPhuongTienCapPhuHieu> list = findByNoiDungHoSoId(NoiDungHoSoId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the qlvt phuong tien cap phu hieus before and after the current qlvt phuong tien cap phu hieu in the ordered set where NoiDungHoSoId = &#63;.
	 *
	 * @param id the primary key of the current qlvt phuong tien cap phu hieu
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next qlvt phuong tien cap phu hieu
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienCapPhuHieuException if a qlvt phuong tien cap phu hieu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienCapPhuHieu[] findByNoiDungHoSoId_PrevAndNext(long id,
		long NoiDungHoSoId, OrderByComparator orderByComparator)
		throws NoSuchQlvtPhuongTienCapPhuHieuException, SystemException {
		QlvtPhuongTienCapPhuHieu qlvtPhuongTienCapPhuHieu = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			QlvtPhuongTienCapPhuHieu[] array = new QlvtPhuongTienCapPhuHieuImpl[3];

			array[0] = getByNoiDungHoSoId_PrevAndNext(session,
					qlvtPhuongTienCapPhuHieu, NoiDungHoSoId, orderByComparator,
					true);

			array[1] = qlvtPhuongTienCapPhuHieu;

			array[2] = getByNoiDungHoSoId_PrevAndNext(session,
					qlvtPhuongTienCapPhuHieu, NoiDungHoSoId, orderByComparator,
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

	protected QlvtPhuongTienCapPhuHieu getByNoiDungHoSoId_PrevAndNext(
		Session session, QlvtPhuongTienCapPhuHieu qlvtPhuongTienCapPhuHieu,
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

		query.append(_SQL_SELECT_QLVTPHUONGTIENCAPPHUHIEU_WHERE);

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
			query.append(QlvtPhuongTienCapPhuHieuModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(NoiDungHoSoId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(qlvtPhuongTienCapPhuHieu);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<QlvtPhuongTienCapPhuHieu> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the qlvt phuong tien cap phu hieus where NoiDungHoSoId = &#63; from the database.
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByNoiDungHoSoId(long NoiDungHoSoId)
		throws SystemException {
		for (QlvtPhuongTienCapPhuHieu qlvtPhuongTienCapPhuHieu : findByNoiDungHoSoId(
				NoiDungHoSoId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(qlvtPhuongTienCapPhuHieu);
		}
	}

	/**
	 * Returns the number of qlvt phuong tien cap phu hieus where NoiDungHoSoId = &#63;.
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @return the number of matching qlvt phuong tien cap phu hieus
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

			query.append(_SQL_COUNT_QLVTPHUONGTIENCAPPHUHIEU_WHERE);

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

	private static final String _FINDER_COLUMN_NOIDUNGHOSOID_NOIDUNGHOSOID_2 = "qlvtPhuongTienCapPhuHieu.NoiDungHoSoId = ?";

	public QlvtPhuongTienCapPhuHieuPersistenceImpl() {
		setModelClass(QlvtPhuongTienCapPhuHieu.class);
	}

	/**
	 * Caches the qlvt phuong tien cap phu hieu in the entity cache if it is enabled.
	 *
	 * @param qlvtPhuongTienCapPhuHieu the qlvt phuong tien cap phu hieu
	 */
	@Override
	public void cacheResult(QlvtPhuongTienCapPhuHieu qlvtPhuongTienCapPhuHieu) {
		EntityCacheUtil.putResult(QlvtPhuongTienCapPhuHieuModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienCapPhuHieuImpl.class,
			qlvtPhuongTienCapPhuHieu.getPrimaryKey(), qlvtPhuongTienCapPhuHieu);

		qlvtPhuongTienCapPhuHieu.resetOriginalValues();
	}

	/**
	 * Caches the qlvt phuong tien cap phu hieus in the entity cache if it is enabled.
	 *
	 * @param qlvtPhuongTienCapPhuHieus the qlvt phuong tien cap phu hieus
	 */
	@Override
	public void cacheResult(
		List<QlvtPhuongTienCapPhuHieu> qlvtPhuongTienCapPhuHieus) {
		for (QlvtPhuongTienCapPhuHieu qlvtPhuongTienCapPhuHieu : qlvtPhuongTienCapPhuHieus) {
			if (EntityCacheUtil.getResult(
						QlvtPhuongTienCapPhuHieuModelImpl.ENTITY_CACHE_ENABLED,
						QlvtPhuongTienCapPhuHieuImpl.class,
						qlvtPhuongTienCapPhuHieu.getPrimaryKey()) == null) {
				cacheResult(qlvtPhuongTienCapPhuHieu);
			}
			else {
				qlvtPhuongTienCapPhuHieu.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qlvt phuong tien cap phu hieus.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QlvtPhuongTienCapPhuHieuImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QlvtPhuongTienCapPhuHieuImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qlvt phuong tien cap phu hieu.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QlvtPhuongTienCapPhuHieu qlvtPhuongTienCapPhuHieu) {
		EntityCacheUtil.removeResult(QlvtPhuongTienCapPhuHieuModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienCapPhuHieuImpl.class,
			qlvtPhuongTienCapPhuHieu.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<QlvtPhuongTienCapPhuHieu> qlvtPhuongTienCapPhuHieus) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QlvtPhuongTienCapPhuHieu qlvtPhuongTienCapPhuHieu : qlvtPhuongTienCapPhuHieus) {
			EntityCacheUtil.removeResult(QlvtPhuongTienCapPhuHieuModelImpl.ENTITY_CACHE_ENABLED,
				QlvtPhuongTienCapPhuHieuImpl.class,
				qlvtPhuongTienCapPhuHieu.getPrimaryKey());
		}
	}

	/**
	 * Creates a new qlvt phuong tien cap phu hieu with the primary key. Does not add the qlvt phuong tien cap phu hieu to the database.
	 *
	 * @param id the primary key for the new qlvt phuong tien cap phu hieu
	 * @return the new qlvt phuong tien cap phu hieu
	 */
	@Override
	public QlvtPhuongTienCapPhuHieu create(long id) {
		QlvtPhuongTienCapPhuHieu qlvtPhuongTienCapPhuHieu = new QlvtPhuongTienCapPhuHieuImpl();

		qlvtPhuongTienCapPhuHieu.setNew(true);
		qlvtPhuongTienCapPhuHieu.setPrimaryKey(id);

		return qlvtPhuongTienCapPhuHieu;
	}

	/**
	 * Removes the qlvt phuong tien cap phu hieu with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the qlvt phuong tien cap phu hieu
	 * @return the qlvt phuong tien cap phu hieu that was removed
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienCapPhuHieuException if a qlvt phuong tien cap phu hieu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienCapPhuHieu remove(long id)
		throws NoSuchQlvtPhuongTienCapPhuHieuException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the qlvt phuong tien cap phu hieu with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qlvt phuong tien cap phu hieu
	 * @return the qlvt phuong tien cap phu hieu that was removed
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienCapPhuHieuException if a qlvt phuong tien cap phu hieu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienCapPhuHieu remove(Serializable primaryKey)
		throws NoSuchQlvtPhuongTienCapPhuHieuException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QlvtPhuongTienCapPhuHieu qlvtPhuongTienCapPhuHieu = (QlvtPhuongTienCapPhuHieu)session.get(QlvtPhuongTienCapPhuHieuImpl.class,
					primaryKey);

			if (qlvtPhuongTienCapPhuHieu == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQlvtPhuongTienCapPhuHieuException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtPhuongTienCapPhuHieu);
		}
		catch (NoSuchQlvtPhuongTienCapPhuHieuException nsee) {
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
	protected QlvtPhuongTienCapPhuHieu removeImpl(
		QlvtPhuongTienCapPhuHieu qlvtPhuongTienCapPhuHieu)
		throws SystemException {
		qlvtPhuongTienCapPhuHieu = toUnwrappedModel(qlvtPhuongTienCapPhuHieu);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtPhuongTienCapPhuHieu)) {
				qlvtPhuongTienCapPhuHieu = (QlvtPhuongTienCapPhuHieu)session.get(QlvtPhuongTienCapPhuHieuImpl.class,
						qlvtPhuongTienCapPhuHieu.getPrimaryKeyObj());
			}

			if (qlvtPhuongTienCapPhuHieu != null) {
				session.delete(qlvtPhuongTienCapPhuHieu);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtPhuongTienCapPhuHieu != null) {
			clearCache(qlvtPhuongTienCapPhuHieu);
		}

		return qlvtPhuongTienCapPhuHieu;
	}

	@Override
	public QlvtPhuongTienCapPhuHieu updateImpl(
		vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu qlvtPhuongTienCapPhuHieu)
		throws SystemException {
		qlvtPhuongTienCapPhuHieu = toUnwrappedModel(qlvtPhuongTienCapPhuHieu);

		boolean isNew = qlvtPhuongTienCapPhuHieu.isNew();

		QlvtPhuongTienCapPhuHieuModelImpl qlvtPhuongTienCapPhuHieuModelImpl = (QlvtPhuongTienCapPhuHieuModelImpl)qlvtPhuongTienCapPhuHieu;

		Session session = null;

		try {
			session = openSession();

			if (qlvtPhuongTienCapPhuHieu.isNew()) {
				session.save(qlvtPhuongTienCapPhuHieu);

				qlvtPhuongTienCapPhuHieu.setNew(false);
			}
			else {
				session.merge(qlvtPhuongTienCapPhuHieu);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !QlvtPhuongTienCapPhuHieuModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((qlvtPhuongTienCapPhuHieuModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOIDUNGHOSOID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						qlvtPhuongTienCapPhuHieuModelImpl.getOriginalNoiDungHoSoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NOIDUNGHOSOID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOIDUNGHOSOID,
					args);

				args = new Object[] {
						qlvtPhuongTienCapPhuHieuModelImpl.getNoiDungHoSoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NOIDUNGHOSOID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOIDUNGHOSOID,
					args);
			}
		}

		EntityCacheUtil.putResult(QlvtPhuongTienCapPhuHieuModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienCapPhuHieuImpl.class,
			qlvtPhuongTienCapPhuHieu.getPrimaryKey(), qlvtPhuongTienCapPhuHieu);

		return qlvtPhuongTienCapPhuHieu;
	}

	protected QlvtPhuongTienCapPhuHieu toUnwrappedModel(
		QlvtPhuongTienCapPhuHieu qlvtPhuongTienCapPhuHieu) {
		if (qlvtPhuongTienCapPhuHieu instanceof QlvtPhuongTienCapPhuHieuImpl) {
			return qlvtPhuongTienCapPhuHieu;
		}

		QlvtPhuongTienCapPhuHieuImpl qlvtPhuongTienCapPhuHieuImpl = new QlvtPhuongTienCapPhuHieuImpl();

		qlvtPhuongTienCapPhuHieuImpl.setNew(qlvtPhuongTienCapPhuHieu.isNew());
		qlvtPhuongTienCapPhuHieuImpl.setPrimaryKey(qlvtPhuongTienCapPhuHieu.getPrimaryKey());

		qlvtPhuongTienCapPhuHieuImpl.setId(qlvtPhuongTienCapPhuHieu.getId());
		qlvtPhuongTienCapPhuHieuImpl.setNhanHieu(qlvtPhuongTienCapPhuHieu.getNhanHieu());
		qlvtPhuongTienCapPhuHieuImpl.setBienSo(qlvtPhuongTienCapPhuHieu.getBienSo());
		qlvtPhuongTienCapPhuHieuImpl.setTrongTai(qlvtPhuongTienCapPhuHieu.getTrongTai());
		qlvtPhuongTienCapPhuHieuImpl.setNuocSanXuat(qlvtPhuongTienCapPhuHieu.getNuocSanXuat());
		qlvtPhuongTienCapPhuHieuImpl.setNamSanXuat(qlvtPhuongTienCapPhuHieu.getNamSanXuat());
		qlvtPhuongTienCapPhuHieuImpl.setTuyenHoatDong(qlvtPhuongTienCapPhuHieu.getTuyenHoatDong());
		qlvtPhuongTienCapPhuHieuImpl.setLoaiHinhHoatDong(qlvtPhuongTienCapPhuHieu.getLoaiHinhHoatDong());
		qlvtPhuongTienCapPhuHieuImpl.setNoiDungHoSoId(qlvtPhuongTienCapPhuHieu.getNoiDungHoSoId());
		qlvtPhuongTienCapPhuHieuImpl.setHoSoThuTucId(qlvtPhuongTienCapPhuHieu.getHoSoThuTucId());

		return qlvtPhuongTienCapPhuHieuImpl;
	}

	/**
	 * Returns the qlvt phuong tien cap phu hieu with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt phuong tien cap phu hieu
	 * @return the qlvt phuong tien cap phu hieu
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienCapPhuHieuException if a qlvt phuong tien cap phu hieu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienCapPhuHieu findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQlvtPhuongTienCapPhuHieuException, SystemException {
		QlvtPhuongTienCapPhuHieu qlvtPhuongTienCapPhuHieu = fetchByPrimaryKey(primaryKey);

		if (qlvtPhuongTienCapPhuHieu == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQlvtPhuongTienCapPhuHieuException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtPhuongTienCapPhuHieu;
	}

	/**
	 * Returns the qlvt phuong tien cap phu hieu with the primary key or throws a {@link vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienCapPhuHieuException} if it could not be found.
	 *
	 * @param id the primary key of the qlvt phuong tien cap phu hieu
	 * @return the qlvt phuong tien cap phu hieu
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienCapPhuHieuException if a qlvt phuong tien cap phu hieu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienCapPhuHieu findByPrimaryKey(long id)
		throws NoSuchQlvtPhuongTienCapPhuHieuException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the qlvt phuong tien cap phu hieu with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt phuong tien cap phu hieu
	 * @return the qlvt phuong tien cap phu hieu, or <code>null</code> if a qlvt phuong tien cap phu hieu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienCapPhuHieu fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QlvtPhuongTienCapPhuHieu qlvtPhuongTienCapPhuHieu = (QlvtPhuongTienCapPhuHieu)EntityCacheUtil.getResult(QlvtPhuongTienCapPhuHieuModelImpl.ENTITY_CACHE_ENABLED,
				QlvtPhuongTienCapPhuHieuImpl.class, primaryKey);

		if (qlvtPhuongTienCapPhuHieu == _nullQlvtPhuongTienCapPhuHieu) {
			return null;
		}

		if (qlvtPhuongTienCapPhuHieu == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtPhuongTienCapPhuHieu = (QlvtPhuongTienCapPhuHieu)session.get(QlvtPhuongTienCapPhuHieuImpl.class,
						primaryKey);

				if (qlvtPhuongTienCapPhuHieu != null) {
					cacheResult(qlvtPhuongTienCapPhuHieu);
				}
				else {
					EntityCacheUtil.putResult(QlvtPhuongTienCapPhuHieuModelImpl.ENTITY_CACHE_ENABLED,
						QlvtPhuongTienCapPhuHieuImpl.class, primaryKey,
						_nullQlvtPhuongTienCapPhuHieu);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QlvtPhuongTienCapPhuHieuModelImpl.ENTITY_CACHE_ENABLED,
					QlvtPhuongTienCapPhuHieuImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtPhuongTienCapPhuHieu;
	}

	/**
	 * Returns the qlvt phuong tien cap phu hieu with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the qlvt phuong tien cap phu hieu
	 * @return the qlvt phuong tien cap phu hieu, or <code>null</code> if a qlvt phuong tien cap phu hieu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienCapPhuHieu fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the qlvt phuong tien cap phu hieus.
	 *
	 * @return the qlvt phuong tien cap phu hieus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtPhuongTienCapPhuHieu> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt phuong tien cap phu hieus.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienCapPhuHieuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt phuong tien cap phu hieus
	 * @param end the upper bound of the range of qlvt phuong tien cap phu hieus (not inclusive)
	 * @return the range of qlvt phuong tien cap phu hieus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtPhuongTienCapPhuHieu> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt phuong tien cap phu hieus.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienCapPhuHieuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt phuong tien cap phu hieus
	 * @param end the upper bound of the range of qlvt phuong tien cap phu hieus (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qlvt phuong tien cap phu hieus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtPhuongTienCapPhuHieu> findAll(int start, int end,
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

		List<QlvtPhuongTienCapPhuHieu> list = (List<QlvtPhuongTienCapPhuHieu>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTPHUONGTIENCAPPHUHIEU);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTPHUONGTIENCAPPHUHIEU;

				if (pagination) {
					sql = sql.concat(QlvtPhuongTienCapPhuHieuModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QlvtPhuongTienCapPhuHieu>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtPhuongTienCapPhuHieu>(list);
				}
				else {
					list = (List<QlvtPhuongTienCapPhuHieu>)QueryUtil.list(q,
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
	 * Removes all the qlvt phuong tien cap phu hieus from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QlvtPhuongTienCapPhuHieu qlvtPhuongTienCapPhuHieu : findAll()) {
			remove(qlvtPhuongTienCapPhuHieu);
		}
	}

	/**
	 * Returns the number of qlvt phuong tien cap phu hieus.
	 *
	 * @return the number of qlvt phuong tien cap phu hieus
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

				Query q = session.createQuery(_SQL_COUNT_QLVTPHUONGTIENCAPPHUHIEU);

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
	 * Initializes the qlvt phuong tien cap phu hieu persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QlvtPhuongTienCapPhuHieu>> listenersList = new ArrayList<ModelListener<QlvtPhuongTienCapPhuHieu>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QlvtPhuongTienCapPhuHieu>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QlvtPhuongTienCapPhuHieuImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTPHUONGTIENCAPPHUHIEU = "SELECT qlvtPhuongTienCapPhuHieu FROM QlvtPhuongTienCapPhuHieu qlvtPhuongTienCapPhuHieu";
	private static final String _SQL_SELECT_QLVTPHUONGTIENCAPPHUHIEU_WHERE = "SELECT qlvtPhuongTienCapPhuHieu FROM QlvtPhuongTienCapPhuHieu qlvtPhuongTienCapPhuHieu WHERE ";
	private static final String _SQL_COUNT_QLVTPHUONGTIENCAPPHUHIEU = "SELECT COUNT(qlvtPhuongTienCapPhuHieu) FROM QlvtPhuongTienCapPhuHieu qlvtPhuongTienCapPhuHieu";
	private static final String _SQL_COUNT_QLVTPHUONGTIENCAPPHUHIEU_WHERE = "SELECT COUNT(qlvtPhuongTienCapPhuHieu) FROM QlvtPhuongTienCapPhuHieu qlvtPhuongTienCapPhuHieu WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtPhuongTienCapPhuHieu.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QlvtPhuongTienCapPhuHieu exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No QlvtPhuongTienCapPhuHieu exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QlvtPhuongTienCapPhuHieuPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "NhanHieu", "BienSo", "TrongTai", "NuocSanXuat",
				"NamSanXuat", "TuyenHoatDong", "LoaiHinhHoatDong",
				"NoiDungHoSoId", "HoSoThuTucId"
			});
	private static QlvtPhuongTienCapPhuHieu _nullQlvtPhuongTienCapPhuHieu = new QlvtPhuongTienCapPhuHieuImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QlvtPhuongTienCapPhuHieu> toCacheModel() {
				return _nullQlvtPhuongTienCapPhuHieuCacheModel;
			}
		};

	private static CacheModel<QlvtPhuongTienCapPhuHieu> _nullQlvtPhuongTienCapPhuHieuCacheModel =
		new CacheModel<QlvtPhuongTienCapPhuHieu>() {
			@Override
			public QlvtPhuongTienCapPhuHieu toEntityModel() {
				return _nullQlvtPhuongTienCapPhuHieu;
			}
		};
}