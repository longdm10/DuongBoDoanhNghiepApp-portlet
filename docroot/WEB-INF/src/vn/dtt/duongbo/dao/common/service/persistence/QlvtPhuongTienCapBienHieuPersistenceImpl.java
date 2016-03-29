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

import vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienCapBienHieuException;
import vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapBienHieu;
import vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienCapBienHieuImpl;
import vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienCapBienHieuModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the qlvt phuong tien cap bien hieu service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see QlvtPhuongTienCapBienHieuPersistence
 * @see QlvtPhuongTienCapBienHieuUtil
 * @generated
 */
public class QlvtPhuongTienCapBienHieuPersistenceImpl
	extends BasePersistenceImpl<QlvtPhuongTienCapBienHieu>
	implements QlvtPhuongTienCapBienHieuPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QlvtPhuongTienCapBienHieuUtil} to access the qlvt phuong tien cap bien hieu persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QlvtPhuongTienCapBienHieuImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QlvtPhuongTienCapBienHieuModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienCapBienHieuModelImpl.FINDER_CACHE_ENABLED,
			QlvtPhuongTienCapBienHieuImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QlvtPhuongTienCapBienHieuModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienCapBienHieuModelImpl.FINDER_CACHE_ENABLED,
			QlvtPhuongTienCapBienHieuImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QlvtPhuongTienCapBienHieuModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienCapBienHieuModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NOIDUNGHOSOID =
		new FinderPath(QlvtPhuongTienCapBienHieuModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienCapBienHieuModelImpl.FINDER_CACHE_ENABLED,
			QlvtPhuongTienCapBienHieuImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByNoiDungHoSoId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOIDUNGHOSOID =
		new FinderPath(QlvtPhuongTienCapBienHieuModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienCapBienHieuModelImpl.FINDER_CACHE_ENABLED,
			QlvtPhuongTienCapBienHieuImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByNoiDungHoSoId",
			new String[] { Long.class.getName() },
			QlvtPhuongTienCapBienHieuModelImpl.NOIDUNGHOSOID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NOIDUNGHOSOID = new FinderPath(QlvtPhuongTienCapBienHieuModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienCapBienHieuModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByNoiDungHoSoId", new String[] { Long.class.getName() });

	/**
	 * Returns all the qlvt phuong tien cap bien hieus where NoiDungHoSoId = &#63;.
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @return the matching qlvt phuong tien cap bien hieus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtPhuongTienCapBienHieu> findByNoiDungHoSoId(
		long NoiDungHoSoId) throws SystemException {
		return findByNoiDungHoSoId(NoiDungHoSoId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt phuong tien cap bien hieus where NoiDungHoSoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienCapBienHieuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @param start the lower bound of the range of qlvt phuong tien cap bien hieus
	 * @param end the upper bound of the range of qlvt phuong tien cap bien hieus (not inclusive)
	 * @return the range of matching qlvt phuong tien cap bien hieus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtPhuongTienCapBienHieu> findByNoiDungHoSoId(
		long NoiDungHoSoId, int start, int end) throws SystemException {
		return findByNoiDungHoSoId(NoiDungHoSoId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt phuong tien cap bien hieus where NoiDungHoSoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienCapBienHieuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @param start the lower bound of the range of qlvt phuong tien cap bien hieus
	 * @param end the upper bound of the range of qlvt phuong tien cap bien hieus (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching qlvt phuong tien cap bien hieus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtPhuongTienCapBienHieu> findByNoiDungHoSoId(
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

		List<QlvtPhuongTienCapBienHieu> list = (List<QlvtPhuongTienCapBienHieu>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (QlvtPhuongTienCapBienHieu qlvtPhuongTienCapBienHieu : list) {
				if ((NoiDungHoSoId != qlvtPhuongTienCapBienHieu.getNoiDungHoSoId())) {
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

			query.append(_SQL_SELECT_QLVTPHUONGTIENCAPBIENHIEU_WHERE);

			query.append(_FINDER_COLUMN_NOIDUNGHOSOID_NOIDUNGHOSOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(QlvtPhuongTienCapBienHieuModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(NoiDungHoSoId);

				if (!pagination) {
					list = (List<QlvtPhuongTienCapBienHieu>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtPhuongTienCapBienHieu>(list);
				}
				else {
					list = (List<QlvtPhuongTienCapBienHieu>)QueryUtil.list(q,
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
	 * Returns the first qlvt phuong tien cap bien hieu in the ordered set where NoiDungHoSoId = &#63;.
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qlvt phuong tien cap bien hieu
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienCapBienHieuException if a matching qlvt phuong tien cap bien hieu could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienCapBienHieu findByNoiDungHoSoId_First(
		long NoiDungHoSoId, OrderByComparator orderByComparator)
		throws NoSuchQlvtPhuongTienCapBienHieuException, SystemException {
		QlvtPhuongTienCapBienHieu qlvtPhuongTienCapBienHieu = fetchByNoiDungHoSoId_First(NoiDungHoSoId,
				orderByComparator);

		if (qlvtPhuongTienCapBienHieu != null) {
			return qlvtPhuongTienCapBienHieu;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("NoiDungHoSoId=");
		msg.append(NoiDungHoSoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchQlvtPhuongTienCapBienHieuException(msg.toString());
	}

	/**
	 * Returns the first qlvt phuong tien cap bien hieu in the ordered set where NoiDungHoSoId = &#63;.
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qlvt phuong tien cap bien hieu, or <code>null</code> if a matching qlvt phuong tien cap bien hieu could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienCapBienHieu fetchByNoiDungHoSoId_First(
		long NoiDungHoSoId, OrderByComparator orderByComparator)
		throws SystemException {
		List<QlvtPhuongTienCapBienHieu> list = findByNoiDungHoSoId(NoiDungHoSoId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last qlvt phuong tien cap bien hieu in the ordered set where NoiDungHoSoId = &#63;.
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qlvt phuong tien cap bien hieu
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienCapBienHieuException if a matching qlvt phuong tien cap bien hieu could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienCapBienHieu findByNoiDungHoSoId_Last(
		long NoiDungHoSoId, OrderByComparator orderByComparator)
		throws NoSuchQlvtPhuongTienCapBienHieuException, SystemException {
		QlvtPhuongTienCapBienHieu qlvtPhuongTienCapBienHieu = fetchByNoiDungHoSoId_Last(NoiDungHoSoId,
				orderByComparator);

		if (qlvtPhuongTienCapBienHieu != null) {
			return qlvtPhuongTienCapBienHieu;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("NoiDungHoSoId=");
		msg.append(NoiDungHoSoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchQlvtPhuongTienCapBienHieuException(msg.toString());
	}

	/**
	 * Returns the last qlvt phuong tien cap bien hieu in the ordered set where NoiDungHoSoId = &#63;.
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qlvt phuong tien cap bien hieu, or <code>null</code> if a matching qlvt phuong tien cap bien hieu could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienCapBienHieu fetchByNoiDungHoSoId_Last(
		long NoiDungHoSoId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByNoiDungHoSoId(NoiDungHoSoId);

		if (count == 0) {
			return null;
		}

		List<QlvtPhuongTienCapBienHieu> list = findByNoiDungHoSoId(NoiDungHoSoId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the qlvt phuong tien cap bien hieus before and after the current qlvt phuong tien cap bien hieu in the ordered set where NoiDungHoSoId = &#63;.
	 *
	 * @param id the primary key of the current qlvt phuong tien cap bien hieu
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next qlvt phuong tien cap bien hieu
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienCapBienHieuException if a qlvt phuong tien cap bien hieu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienCapBienHieu[] findByNoiDungHoSoId_PrevAndNext(
		long id, long NoiDungHoSoId, OrderByComparator orderByComparator)
		throws NoSuchQlvtPhuongTienCapBienHieuException, SystemException {
		QlvtPhuongTienCapBienHieu qlvtPhuongTienCapBienHieu = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			QlvtPhuongTienCapBienHieu[] array = new QlvtPhuongTienCapBienHieuImpl[3];

			array[0] = getByNoiDungHoSoId_PrevAndNext(session,
					qlvtPhuongTienCapBienHieu, NoiDungHoSoId,
					orderByComparator, true);

			array[1] = qlvtPhuongTienCapBienHieu;

			array[2] = getByNoiDungHoSoId_PrevAndNext(session,
					qlvtPhuongTienCapBienHieu, NoiDungHoSoId,
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

	protected QlvtPhuongTienCapBienHieu getByNoiDungHoSoId_PrevAndNext(
		Session session, QlvtPhuongTienCapBienHieu qlvtPhuongTienCapBienHieu,
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

		query.append(_SQL_SELECT_QLVTPHUONGTIENCAPBIENHIEU_WHERE);

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
			query.append(QlvtPhuongTienCapBienHieuModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(NoiDungHoSoId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(qlvtPhuongTienCapBienHieu);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<QlvtPhuongTienCapBienHieu> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the qlvt phuong tien cap bien hieus where NoiDungHoSoId = &#63; from the database.
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByNoiDungHoSoId(long NoiDungHoSoId)
		throws SystemException {
		for (QlvtPhuongTienCapBienHieu qlvtPhuongTienCapBienHieu : findByNoiDungHoSoId(
				NoiDungHoSoId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(qlvtPhuongTienCapBienHieu);
		}
	}

	/**
	 * Returns the number of qlvt phuong tien cap bien hieus where NoiDungHoSoId = &#63;.
	 *
	 * @param NoiDungHoSoId the noi dung ho so ID
	 * @return the number of matching qlvt phuong tien cap bien hieus
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

			query.append(_SQL_COUNT_QLVTPHUONGTIENCAPBIENHIEU_WHERE);

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

	private static final String _FINDER_COLUMN_NOIDUNGHOSOID_NOIDUNGHOSOID_2 = "qlvtPhuongTienCapBienHieu.NoiDungHoSoId = ?";

	public QlvtPhuongTienCapBienHieuPersistenceImpl() {
		setModelClass(QlvtPhuongTienCapBienHieu.class);
	}

	/**
	 * Caches the qlvt phuong tien cap bien hieu in the entity cache if it is enabled.
	 *
	 * @param qlvtPhuongTienCapBienHieu the qlvt phuong tien cap bien hieu
	 */
	@Override
	public void cacheResult(QlvtPhuongTienCapBienHieu qlvtPhuongTienCapBienHieu) {
		EntityCacheUtil.putResult(QlvtPhuongTienCapBienHieuModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienCapBienHieuImpl.class,
			qlvtPhuongTienCapBienHieu.getPrimaryKey(), qlvtPhuongTienCapBienHieu);

		qlvtPhuongTienCapBienHieu.resetOriginalValues();
	}

	/**
	 * Caches the qlvt phuong tien cap bien hieus in the entity cache if it is enabled.
	 *
	 * @param qlvtPhuongTienCapBienHieus the qlvt phuong tien cap bien hieus
	 */
	@Override
	public void cacheResult(
		List<QlvtPhuongTienCapBienHieu> qlvtPhuongTienCapBienHieus) {
		for (QlvtPhuongTienCapBienHieu qlvtPhuongTienCapBienHieu : qlvtPhuongTienCapBienHieus) {
			if (EntityCacheUtil.getResult(
						QlvtPhuongTienCapBienHieuModelImpl.ENTITY_CACHE_ENABLED,
						QlvtPhuongTienCapBienHieuImpl.class,
						qlvtPhuongTienCapBienHieu.getPrimaryKey()) == null) {
				cacheResult(qlvtPhuongTienCapBienHieu);
			}
			else {
				qlvtPhuongTienCapBienHieu.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qlvt phuong tien cap bien hieus.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QlvtPhuongTienCapBienHieuImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QlvtPhuongTienCapBienHieuImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qlvt phuong tien cap bien hieu.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QlvtPhuongTienCapBienHieu qlvtPhuongTienCapBienHieu) {
		EntityCacheUtil.removeResult(QlvtPhuongTienCapBienHieuModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienCapBienHieuImpl.class,
			qlvtPhuongTienCapBienHieu.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<QlvtPhuongTienCapBienHieu> qlvtPhuongTienCapBienHieus) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QlvtPhuongTienCapBienHieu qlvtPhuongTienCapBienHieu : qlvtPhuongTienCapBienHieus) {
			EntityCacheUtil.removeResult(QlvtPhuongTienCapBienHieuModelImpl.ENTITY_CACHE_ENABLED,
				QlvtPhuongTienCapBienHieuImpl.class,
				qlvtPhuongTienCapBienHieu.getPrimaryKey());
		}
	}

	/**
	 * Creates a new qlvt phuong tien cap bien hieu with the primary key. Does not add the qlvt phuong tien cap bien hieu to the database.
	 *
	 * @param id the primary key for the new qlvt phuong tien cap bien hieu
	 * @return the new qlvt phuong tien cap bien hieu
	 */
	@Override
	public QlvtPhuongTienCapBienHieu create(long id) {
		QlvtPhuongTienCapBienHieu qlvtPhuongTienCapBienHieu = new QlvtPhuongTienCapBienHieuImpl();

		qlvtPhuongTienCapBienHieu.setNew(true);
		qlvtPhuongTienCapBienHieu.setPrimaryKey(id);

		return qlvtPhuongTienCapBienHieu;
	}

	/**
	 * Removes the qlvt phuong tien cap bien hieu with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the qlvt phuong tien cap bien hieu
	 * @return the qlvt phuong tien cap bien hieu that was removed
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienCapBienHieuException if a qlvt phuong tien cap bien hieu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienCapBienHieu remove(long id)
		throws NoSuchQlvtPhuongTienCapBienHieuException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the qlvt phuong tien cap bien hieu with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qlvt phuong tien cap bien hieu
	 * @return the qlvt phuong tien cap bien hieu that was removed
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienCapBienHieuException if a qlvt phuong tien cap bien hieu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienCapBienHieu remove(Serializable primaryKey)
		throws NoSuchQlvtPhuongTienCapBienHieuException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QlvtPhuongTienCapBienHieu qlvtPhuongTienCapBienHieu = (QlvtPhuongTienCapBienHieu)session.get(QlvtPhuongTienCapBienHieuImpl.class,
					primaryKey);

			if (qlvtPhuongTienCapBienHieu == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQlvtPhuongTienCapBienHieuException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtPhuongTienCapBienHieu);
		}
		catch (NoSuchQlvtPhuongTienCapBienHieuException nsee) {
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
	protected QlvtPhuongTienCapBienHieu removeImpl(
		QlvtPhuongTienCapBienHieu qlvtPhuongTienCapBienHieu)
		throws SystemException {
		qlvtPhuongTienCapBienHieu = toUnwrappedModel(qlvtPhuongTienCapBienHieu);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtPhuongTienCapBienHieu)) {
				qlvtPhuongTienCapBienHieu = (QlvtPhuongTienCapBienHieu)session.get(QlvtPhuongTienCapBienHieuImpl.class,
						qlvtPhuongTienCapBienHieu.getPrimaryKeyObj());
			}

			if (qlvtPhuongTienCapBienHieu != null) {
				session.delete(qlvtPhuongTienCapBienHieu);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtPhuongTienCapBienHieu != null) {
			clearCache(qlvtPhuongTienCapBienHieu);
		}

		return qlvtPhuongTienCapBienHieu;
	}

	@Override
	public QlvtPhuongTienCapBienHieu updateImpl(
		vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapBienHieu qlvtPhuongTienCapBienHieu)
		throws SystemException {
		qlvtPhuongTienCapBienHieu = toUnwrappedModel(qlvtPhuongTienCapBienHieu);

		boolean isNew = qlvtPhuongTienCapBienHieu.isNew();

		QlvtPhuongTienCapBienHieuModelImpl qlvtPhuongTienCapBienHieuModelImpl = (QlvtPhuongTienCapBienHieuModelImpl)qlvtPhuongTienCapBienHieu;

		Session session = null;

		try {
			session = openSession();

			if (qlvtPhuongTienCapBienHieu.isNew()) {
				session.save(qlvtPhuongTienCapBienHieu);

				qlvtPhuongTienCapBienHieu.setNew(false);
			}
			else {
				session.merge(qlvtPhuongTienCapBienHieu);
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
				!QlvtPhuongTienCapBienHieuModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((qlvtPhuongTienCapBienHieuModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOIDUNGHOSOID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						qlvtPhuongTienCapBienHieuModelImpl.getOriginalNoiDungHoSoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NOIDUNGHOSOID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOIDUNGHOSOID,
					args);

				args = new Object[] {
						qlvtPhuongTienCapBienHieuModelImpl.getNoiDungHoSoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NOIDUNGHOSOID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOIDUNGHOSOID,
					args);
			}
		}

		EntityCacheUtil.putResult(QlvtPhuongTienCapBienHieuModelImpl.ENTITY_CACHE_ENABLED,
			QlvtPhuongTienCapBienHieuImpl.class,
			qlvtPhuongTienCapBienHieu.getPrimaryKey(), qlvtPhuongTienCapBienHieu);

		return qlvtPhuongTienCapBienHieu;
	}

	protected QlvtPhuongTienCapBienHieu toUnwrappedModel(
		QlvtPhuongTienCapBienHieu qlvtPhuongTienCapBienHieu) {
		if (qlvtPhuongTienCapBienHieu instanceof QlvtPhuongTienCapBienHieuImpl) {
			return qlvtPhuongTienCapBienHieu;
		}

		QlvtPhuongTienCapBienHieuImpl qlvtPhuongTienCapBienHieuImpl = new QlvtPhuongTienCapBienHieuImpl();

		qlvtPhuongTienCapBienHieuImpl.setNew(qlvtPhuongTienCapBienHieu.isNew());
		qlvtPhuongTienCapBienHieuImpl.setPrimaryKey(qlvtPhuongTienCapBienHieu.getPrimaryKey());

		qlvtPhuongTienCapBienHieuImpl.setId(qlvtPhuongTienCapBienHieu.getId());
		qlvtPhuongTienCapBienHieuImpl.setNhanHieu(qlvtPhuongTienCapBienHieu.getNhanHieu());
		qlvtPhuongTienCapBienHieuImpl.setBienSo(qlvtPhuongTienCapBienHieu.getBienSo());
		qlvtPhuongTienCapBienHieuImpl.setSoKhung(qlvtPhuongTienCapBienHieu.getSoKhung());
		qlvtPhuongTienCapBienHieuImpl.setSoMay(qlvtPhuongTienCapBienHieu.getSoMay());
		qlvtPhuongTienCapBienHieuImpl.setNamSanXuat(qlvtPhuongTienCapBienHieu.getNamSanXuat());
		qlvtPhuongTienCapBienHieuImpl.setMauSon(qlvtPhuongTienCapBienHieu.getMauSon());
		qlvtPhuongTienCapBienHieuImpl.setSoChoNgoi(qlvtPhuongTienCapBienHieu.getSoChoNgoi());
		qlvtPhuongTienCapBienHieuImpl.setNoiDungHoSoId(qlvtPhuongTienCapBienHieu.getNoiDungHoSoId());
		qlvtPhuongTienCapBienHieuImpl.setHoSoThuTucId(qlvtPhuongTienCapBienHieu.getHoSoThuTucId());

		return qlvtPhuongTienCapBienHieuImpl;
	}

	/**
	 * Returns the qlvt phuong tien cap bien hieu with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt phuong tien cap bien hieu
	 * @return the qlvt phuong tien cap bien hieu
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienCapBienHieuException if a qlvt phuong tien cap bien hieu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienCapBienHieu findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQlvtPhuongTienCapBienHieuException, SystemException {
		QlvtPhuongTienCapBienHieu qlvtPhuongTienCapBienHieu = fetchByPrimaryKey(primaryKey);

		if (qlvtPhuongTienCapBienHieu == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQlvtPhuongTienCapBienHieuException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtPhuongTienCapBienHieu;
	}

	/**
	 * Returns the qlvt phuong tien cap bien hieu with the primary key or throws a {@link vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienCapBienHieuException} if it could not be found.
	 *
	 * @param id the primary key of the qlvt phuong tien cap bien hieu
	 * @return the qlvt phuong tien cap bien hieu
	 * @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienCapBienHieuException if a qlvt phuong tien cap bien hieu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienCapBienHieu findByPrimaryKey(long id)
		throws NoSuchQlvtPhuongTienCapBienHieuException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the qlvt phuong tien cap bien hieu with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt phuong tien cap bien hieu
	 * @return the qlvt phuong tien cap bien hieu, or <code>null</code> if a qlvt phuong tien cap bien hieu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienCapBienHieu fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QlvtPhuongTienCapBienHieu qlvtPhuongTienCapBienHieu = (QlvtPhuongTienCapBienHieu)EntityCacheUtil.getResult(QlvtPhuongTienCapBienHieuModelImpl.ENTITY_CACHE_ENABLED,
				QlvtPhuongTienCapBienHieuImpl.class, primaryKey);

		if (qlvtPhuongTienCapBienHieu == _nullQlvtPhuongTienCapBienHieu) {
			return null;
		}

		if (qlvtPhuongTienCapBienHieu == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtPhuongTienCapBienHieu = (QlvtPhuongTienCapBienHieu)session.get(QlvtPhuongTienCapBienHieuImpl.class,
						primaryKey);

				if (qlvtPhuongTienCapBienHieu != null) {
					cacheResult(qlvtPhuongTienCapBienHieu);
				}
				else {
					EntityCacheUtil.putResult(QlvtPhuongTienCapBienHieuModelImpl.ENTITY_CACHE_ENABLED,
						QlvtPhuongTienCapBienHieuImpl.class, primaryKey,
						_nullQlvtPhuongTienCapBienHieu);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QlvtPhuongTienCapBienHieuModelImpl.ENTITY_CACHE_ENABLED,
					QlvtPhuongTienCapBienHieuImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtPhuongTienCapBienHieu;
	}

	/**
	 * Returns the qlvt phuong tien cap bien hieu with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the qlvt phuong tien cap bien hieu
	 * @return the qlvt phuong tien cap bien hieu, or <code>null</code> if a qlvt phuong tien cap bien hieu with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtPhuongTienCapBienHieu fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the qlvt phuong tien cap bien hieus.
	 *
	 * @return the qlvt phuong tien cap bien hieus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtPhuongTienCapBienHieu> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt phuong tien cap bien hieus.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienCapBienHieuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt phuong tien cap bien hieus
	 * @param end the upper bound of the range of qlvt phuong tien cap bien hieus (not inclusive)
	 * @return the range of qlvt phuong tien cap bien hieus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtPhuongTienCapBienHieu> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt phuong tien cap bien hieus.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienCapBienHieuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt phuong tien cap bien hieus
	 * @param end the upper bound of the range of qlvt phuong tien cap bien hieus (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qlvt phuong tien cap bien hieus
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtPhuongTienCapBienHieu> findAll(int start, int end,
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

		List<QlvtPhuongTienCapBienHieu> list = (List<QlvtPhuongTienCapBienHieu>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTPHUONGTIENCAPBIENHIEU);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTPHUONGTIENCAPBIENHIEU;

				if (pagination) {
					sql = sql.concat(QlvtPhuongTienCapBienHieuModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QlvtPhuongTienCapBienHieu>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtPhuongTienCapBienHieu>(list);
				}
				else {
					list = (List<QlvtPhuongTienCapBienHieu>)QueryUtil.list(q,
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
	 * Removes all the qlvt phuong tien cap bien hieus from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QlvtPhuongTienCapBienHieu qlvtPhuongTienCapBienHieu : findAll()) {
			remove(qlvtPhuongTienCapBienHieu);
		}
	}

	/**
	 * Returns the number of qlvt phuong tien cap bien hieus.
	 *
	 * @return the number of qlvt phuong tien cap bien hieus
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

				Query q = session.createQuery(_SQL_COUNT_QLVTPHUONGTIENCAPBIENHIEU);

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
	 * Initializes the qlvt phuong tien cap bien hieu persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapBienHieu")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QlvtPhuongTienCapBienHieu>> listenersList = new ArrayList<ModelListener<QlvtPhuongTienCapBienHieu>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QlvtPhuongTienCapBienHieu>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QlvtPhuongTienCapBienHieuImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTPHUONGTIENCAPBIENHIEU = "SELECT qlvtPhuongTienCapBienHieu FROM QlvtPhuongTienCapBienHieu qlvtPhuongTienCapBienHieu";
	private static final String _SQL_SELECT_QLVTPHUONGTIENCAPBIENHIEU_WHERE = "SELECT qlvtPhuongTienCapBienHieu FROM QlvtPhuongTienCapBienHieu qlvtPhuongTienCapBienHieu WHERE ";
	private static final String _SQL_COUNT_QLVTPHUONGTIENCAPBIENHIEU = "SELECT COUNT(qlvtPhuongTienCapBienHieu) FROM QlvtPhuongTienCapBienHieu qlvtPhuongTienCapBienHieu";
	private static final String _SQL_COUNT_QLVTPHUONGTIENCAPBIENHIEU_WHERE = "SELECT COUNT(qlvtPhuongTienCapBienHieu) FROM QlvtPhuongTienCapBienHieu qlvtPhuongTienCapBienHieu WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtPhuongTienCapBienHieu.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QlvtPhuongTienCapBienHieu exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No QlvtPhuongTienCapBienHieu exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QlvtPhuongTienCapBienHieuPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "NhanHieu", "BienSo", "SoKhung", "SoMay", "NamSanXuat",
				"MauSon", "SoChoNgoi", "NoiDungHoSoId", "HoSoThuTucId"
			});
	private static QlvtPhuongTienCapBienHieu _nullQlvtPhuongTienCapBienHieu = new QlvtPhuongTienCapBienHieuImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QlvtPhuongTienCapBienHieu> toCacheModel() {
				return _nullQlvtPhuongTienCapBienHieuCacheModel;
			}
		};

	private static CacheModel<QlvtPhuongTienCapBienHieu> _nullQlvtPhuongTienCapBienHieuCacheModel =
		new CacheModel<QlvtPhuongTienCapBienHieu>() {
			@Override
			public QlvtPhuongTienCapBienHieu toEntityModel() {
				return _nullQlvtPhuongTienCapBienHieu;
			}
		};
}