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

package vn.dtt.duongbo.dao.nghiepvu.service.persistence;

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

import vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtLoaiHinhHoatDongTthsException;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths;
import vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtLoaiHinhHoatDongTthsImpl;
import vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtLoaiHinhHoatDongTthsModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the qlvt loai hinh hoat dong tths service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanNc
 * @see QlvtLoaiHinhHoatDongTthsPersistence
 * @see QlvtLoaiHinhHoatDongTthsUtil
 * @generated
 */
public class QlvtLoaiHinhHoatDongTthsPersistenceImpl extends BasePersistenceImpl<QlvtLoaiHinhHoatDongTths>
	implements QlvtLoaiHinhHoatDongTthsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QlvtLoaiHinhHoatDongTthsUtil} to access the qlvt loai hinh hoat dong tths persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QlvtLoaiHinhHoatDongTthsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QlvtLoaiHinhHoatDongTthsModelImpl.ENTITY_CACHE_ENABLED,
			QlvtLoaiHinhHoatDongTthsModelImpl.FINDER_CACHE_ENABLED,
			QlvtLoaiHinhHoatDongTthsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QlvtLoaiHinhHoatDongTthsModelImpl.ENTITY_CACHE_ENABLED,
			QlvtLoaiHinhHoatDongTthsModelImpl.FINDER_CACHE_ENABLED,
			QlvtLoaiHinhHoatDongTthsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QlvtLoaiHinhHoatDongTthsModelImpl.ENTITY_CACHE_ENABLED,
			QlvtLoaiHinhHoatDongTthsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_THONGTINHOSOID =
		new FinderPath(QlvtLoaiHinhHoatDongTthsModelImpl.ENTITY_CACHE_ENABLED,
			QlvtLoaiHinhHoatDongTthsModelImpl.FINDER_CACHE_ENABLED,
			QlvtLoaiHinhHoatDongTthsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByThongTinHoSoId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_THONGTINHOSOID =
		new FinderPath(QlvtLoaiHinhHoatDongTthsModelImpl.ENTITY_CACHE_ENABLED,
			QlvtLoaiHinhHoatDongTthsModelImpl.FINDER_CACHE_ENABLED,
			QlvtLoaiHinhHoatDongTthsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByThongTinHoSoId",
			new String[] { Long.class.getName() },
			QlvtLoaiHinhHoatDongTthsModelImpl.THONGTINHOSOID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_THONGTINHOSOID = new FinderPath(QlvtLoaiHinhHoatDongTthsModelImpl.ENTITY_CACHE_ENABLED,
			QlvtLoaiHinhHoatDongTthsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByThongTinHoSoId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the qlvt loai hinh hoat dong tthses where thongTinHoSoId = &#63;.
	 *
	 * @param thongTinHoSoId the thong tin ho so ID
	 * @return the matching qlvt loai hinh hoat dong tthses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtLoaiHinhHoatDongTths> findByThongTinHoSoId(
		long thongTinHoSoId) throws SystemException {
		return findByThongTinHoSoId(thongTinHoSoId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt loai hinh hoat dong tthses where thongTinHoSoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtLoaiHinhHoatDongTthsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param thongTinHoSoId the thong tin ho so ID
	 * @param start the lower bound of the range of qlvt loai hinh hoat dong tthses
	 * @param end the upper bound of the range of qlvt loai hinh hoat dong tthses (not inclusive)
	 * @return the range of matching qlvt loai hinh hoat dong tthses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtLoaiHinhHoatDongTths> findByThongTinHoSoId(
		long thongTinHoSoId, int start, int end) throws SystemException {
		return findByThongTinHoSoId(thongTinHoSoId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt loai hinh hoat dong tthses where thongTinHoSoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtLoaiHinhHoatDongTthsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param thongTinHoSoId the thong tin ho so ID
	 * @param start the lower bound of the range of qlvt loai hinh hoat dong tthses
	 * @param end the upper bound of the range of qlvt loai hinh hoat dong tthses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching qlvt loai hinh hoat dong tthses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtLoaiHinhHoatDongTths> findByThongTinHoSoId(
		long thongTinHoSoId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_THONGTINHOSOID;
			finderArgs = new Object[] { thongTinHoSoId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_THONGTINHOSOID;
			finderArgs = new Object[] {
					thongTinHoSoId,
					
					start, end, orderByComparator
				};
		}

		List<QlvtLoaiHinhHoatDongTths> list = (List<QlvtLoaiHinhHoatDongTths>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (QlvtLoaiHinhHoatDongTths qlvtLoaiHinhHoatDongTths : list) {
				if ((thongTinHoSoId != qlvtLoaiHinhHoatDongTths.getThongTinHoSoId())) {
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

			query.append(_SQL_SELECT_QLVTLOAIHINHHOATDONGTTHS_WHERE);

			query.append(_FINDER_COLUMN_THONGTINHOSOID_THONGTINHOSOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(QlvtLoaiHinhHoatDongTthsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(thongTinHoSoId);

				if (!pagination) {
					list = (List<QlvtLoaiHinhHoatDongTths>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtLoaiHinhHoatDongTths>(list);
				}
				else {
					list = (List<QlvtLoaiHinhHoatDongTths>)QueryUtil.list(q,
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
	 * Returns the first qlvt loai hinh hoat dong tths in the ordered set where thongTinHoSoId = &#63;.
	 *
	 * @param thongTinHoSoId the thong tin ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qlvt loai hinh hoat dong tths
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtLoaiHinhHoatDongTthsException if a matching qlvt loai hinh hoat dong tths could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtLoaiHinhHoatDongTths findByThongTinHoSoId_First(
		long thongTinHoSoId, OrderByComparator orderByComparator)
		throws NoSuchQlvtLoaiHinhHoatDongTthsException, SystemException {
		QlvtLoaiHinhHoatDongTths qlvtLoaiHinhHoatDongTths = fetchByThongTinHoSoId_First(thongTinHoSoId,
				orderByComparator);

		if (qlvtLoaiHinhHoatDongTths != null) {
			return qlvtLoaiHinhHoatDongTths;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("thongTinHoSoId=");
		msg.append(thongTinHoSoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchQlvtLoaiHinhHoatDongTthsException(msg.toString());
	}

	/**
	 * Returns the first qlvt loai hinh hoat dong tths in the ordered set where thongTinHoSoId = &#63;.
	 *
	 * @param thongTinHoSoId the thong tin ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qlvt loai hinh hoat dong tths, or <code>null</code> if a matching qlvt loai hinh hoat dong tths could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtLoaiHinhHoatDongTths fetchByThongTinHoSoId_First(
		long thongTinHoSoId, OrderByComparator orderByComparator)
		throws SystemException {
		List<QlvtLoaiHinhHoatDongTths> list = findByThongTinHoSoId(thongTinHoSoId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last qlvt loai hinh hoat dong tths in the ordered set where thongTinHoSoId = &#63;.
	 *
	 * @param thongTinHoSoId the thong tin ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qlvt loai hinh hoat dong tths
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtLoaiHinhHoatDongTthsException if a matching qlvt loai hinh hoat dong tths could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtLoaiHinhHoatDongTths findByThongTinHoSoId_Last(
		long thongTinHoSoId, OrderByComparator orderByComparator)
		throws NoSuchQlvtLoaiHinhHoatDongTthsException, SystemException {
		QlvtLoaiHinhHoatDongTths qlvtLoaiHinhHoatDongTths = fetchByThongTinHoSoId_Last(thongTinHoSoId,
				orderByComparator);

		if (qlvtLoaiHinhHoatDongTths != null) {
			return qlvtLoaiHinhHoatDongTths;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("thongTinHoSoId=");
		msg.append(thongTinHoSoId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchQlvtLoaiHinhHoatDongTthsException(msg.toString());
	}

	/**
	 * Returns the last qlvt loai hinh hoat dong tths in the ordered set where thongTinHoSoId = &#63;.
	 *
	 * @param thongTinHoSoId the thong tin ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qlvt loai hinh hoat dong tths, or <code>null</code> if a matching qlvt loai hinh hoat dong tths could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtLoaiHinhHoatDongTths fetchByThongTinHoSoId_Last(
		long thongTinHoSoId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByThongTinHoSoId(thongTinHoSoId);

		if (count == 0) {
			return null;
		}

		List<QlvtLoaiHinhHoatDongTths> list = findByThongTinHoSoId(thongTinHoSoId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the qlvt loai hinh hoat dong tthses before and after the current qlvt loai hinh hoat dong tths in the ordered set where thongTinHoSoId = &#63;.
	 *
	 * @param id the primary key of the current qlvt loai hinh hoat dong tths
	 * @param thongTinHoSoId the thong tin ho so ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next qlvt loai hinh hoat dong tths
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtLoaiHinhHoatDongTthsException if a qlvt loai hinh hoat dong tths with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtLoaiHinhHoatDongTths[] findByThongTinHoSoId_PrevAndNext(
		long id, long thongTinHoSoId, OrderByComparator orderByComparator)
		throws NoSuchQlvtLoaiHinhHoatDongTthsException, SystemException {
		QlvtLoaiHinhHoatDongTths qlvtLoaiHinhHoatDongTths = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			QlvtLoaiHinhHoatDongTths[] array = new QlvtLoaiHinhHoatDongTthsImpl[3];

			array[0] = getByThongTinHoSoId_PrevAndNext(session,
					qlvtLoaiHinhHoatDongTths, thongTinHoSoId,
					orderByComparator, true);

			array[1] = qlvtLoaiHinhHoatDongTths;

			array[2] = getByThongTinHoSoId_PrevAndNext(session,
					qlvtLoaiHinhHoatDongTths, thongTinHoSoId,
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

	protected QlvtLoaiHinhHoatDongTths getByThongTinHoSoId_PrevAndNext(
		Session session, QlvtLoaiHinhHoatDongTths qlvtLoaiHinhHoatDongTths,
		long thongTinHoSoId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_QLVTLOAIHINHHOATDONGTTHS_WHERE);

		query.append(_FINDER_COLUMN_THONGTINHOSOID_THONGTINHOSOID_2);

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
			query.append(QlvtLoaiHinhHoatDongTthsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(thongTinHoSoId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(qlvtLoaiHinhHoatDongTths);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<QlvtLoaiHinhHoatDongTths> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the qlvt loai hinh hoat dong tthses where thongTinHoSoId = &#63; from the database.
	 *
	 * @param thongTinHoSoId the thong tin ho so ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByThongTinHoSoId(long thongTinHoSoId)
		throws SystemException {
		for (QlvtLoaiHinhHoatDongTths qlvtLoaiHinhHoatDongTths : findByThongTinHoSoId(
				thongTinHoSoId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(qlvtLoaiHinhHoatDongTths);
		}
	}

	/**
	 * Returns the number of qlvt loai hinh hoat dong tthses where thongTinHoSoId = &#63;.
	 *
	 * @param thongTinHoSoId the thong tin ho so ID
	 * @return the number of matching qlvt loai hinh hoat dong tthses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByThongTinHoSoId(long thongTinHoSoId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_THONGTINHOSOID;

		Object[] finderArgs = new Object[] { thongTinHoSoId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_QLVTLOAIHINHHOATDONGTTHS_WHERE);

			query.append(_FINDER_COLUMN_THONGTINHOSOID_THONGTINHOSOID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(thongTinHoSoId);

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

	private static final String _FINDER_COLUMN_THONGTINHOSOID_THONGTINHOSOID_2 = "qlvtLoaiHinhHoatDongTths.thongTinHoSoId = ?";

	public QlvtLoaiHinhHoatDongTthsPersistenceImpl() {
		setModelClass(QlvtLoaiHinhHoatDongTths.class);
	}

	/**
	 * Caches the qlvt loai hinh hoat dong tths in the entity cache if it is enabled.
	 *
	 * @param qlvtLoaiHinhHoatDongTths the qlvt loai hinh hoat dong tths
	 */
	@Override
	public void cacheResult(QlvtLoaiHinhHoatDongTths qlvtLoaiHinhHoatDongTths) {
		EntityCacheUtil.putResult(QlvtLoaiHinhHoatDongTthsModelImpl.ENTITY_CACHE_ENABLED,
			QlvtLoaiHinhHoatDongTthsImpl.class,
			qlvtLoaiHinhHoatDongTths.getPrimaryKey(), qlvtLoaiHinhHoatDongTths);

		qlvtLoaiHinhHoatDongTths.resetOriginalValues();
	}

	/**
	 * Caches the qlvt loai hinh hoat dong tthses in the entity cache if it is enabled.
	 *
	 * @param qlvtLoaiHinhHoatDongTthses the qlvt loai hinh hoat dong tthses
	 */
	@Override
	public void cacheResult(
		List<QlvtLoaiHinhHoatDongTths> qlvtLoaiHinhHoatDongTthses) {
		for (QlvtLoaiHinhHoatDongTths qlvtLoaiHinhHoatDongTths : qlvtLoaiHinhHoatDongTthses) {
			if (EntityCacheUtil.getResult(
						QlvtLoaiHinhHoatDongTthsModelImpl.ENTITY_CACHE_ENABLED,
						QlvtLoaiHinhHoatDongTthsImpl.class,
						qlvtLoaiHinhHoatDongTths.getPrimaryKey()) == null) {
				cacheResult(qlvtLoaiHinhHoatDongTths);
			}
			else {
				qlvtLoaiHinhHoatDongTths.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qlvt loai hinh hoat dong tthses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QlvtLoaiHinhHoatDongTthsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QlvtLoaiHinhHoatDongTthsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qlvt loai hinh hoat dong tths.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QlvtLoaiHinhHoatDongTths qlvtLoaiHinhHoatDongTths) {
		EntityCacheUtil.removeResult(QlvtLoaiHinhHoatDongTthsModelImpl.ENTITY_CACHE_ENABLED,
			QlvtLoaiHinhHoatDongTthsImpl.class,
			qlvtLoaiHinhHoatDongTths.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<QlvtLoaiHinhHoatDongTths> qlvtLoaiHinhHoatDongTthses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QlvtLoaiHinhHoatDongTths qlvtLoaiHinhHoatDongTths : qlvtLoaiHinhHoatDongTthses) {
			EntityCacheUtil.removeResult(QlvtLoaiHinhHoatDongTthsModelImpl.ENTITY_CACHE_ENABLED,
				QlvtLoaiHinhHoatDongTthsImpl.class,
				qlvtLoaiHinhHoatDongTths.getPrimaryKey());
		}
	}

	/**
	 * Creates a new qlvt loai hinh hoat dong tths with the primary key. Does not add the qlvt loai hinh hoat dong tths to the database.
	 *
	 * @param id the primary key for the new qlvt loai hinh hoat dong tths
	 * @return the new qlvt loai hinh hoat dong tths
	 */
	@Override
	public QlvtLoaiHinhHoatDongTths create(long id) {
		QlvtLoaiHinhHoatDongTths qlvtLoaiHinhHoatDongTths = new QlvtLoaiHinhHoatDongTthsImpl();

		qlvtLoaiHinhHoatDongTths.setNew(true);
		qlvtLoaiHinhHoatDongTths.setPrimaryKey(id);

		return qlvtLoaiHinhHoatDongTths;
	}

	/**
	 * Removes the qlvt loai hinh hoat dong tths with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the qlvt loai hinh hoat dong tths
	 * @return the qlvt loai hinh hoat dong tths that was removed
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtLoaiHinhHoatDongTthsException if a qlvt loai hinh hoat dong tths with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtLoaiHinhHoatDongTths remove(long id)
		throws NoSuchQlvtLoaiHinhHoatDongTthsException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the qlvt loai hinh hoat dong tths with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qlvt loai hinh hoat dong tths
	 * @return the qlvt loai hinh hoat dong tths that was removed
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtLoaiHinhHoatDongTthsException if a qlvt loai hinh hoat dong tths with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtLoaiHinhHoatDongTths remove(Serializable primaryKey)
		throws NoSuchQlvtLoaiHinhHoatDongTthsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QlvtLoaiHinhHoatDongTths qlvtLoaiHinhHoatDongTths = (QlvtLoaiHinhHoatDongTths)session.get(QlvtLoaiHinhHoatDongTthsImpl.class,
					primaryKey);

			if (qlvtLoaiHinhHoatDongTths == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQlvtLoaiHinhHoatDongTthsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtLoaiHinhHoatDongTths);
		}
		catch (NoSuchQlvtLoaiHinhHoatDongTthsException nsee) {
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
	protected QlvtLoaiHinhHoatDongTths removeImpl(
		QlvtLoaiHinhHoatDongTths qlvtLoaiHinhHoatDongTths)
		throws SystemException {
		qlvtLoaiHinhHoatDongTths = toUnwrappedModel(qlvtLoaiHinhHoatDongTths);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtLoaiHinhHoatDongTths)) {
				qlvtLoaiHinhHoatDongTths = (QlvtLoaiHinhHoatDongTths)session.get(QlvtLoaiHinhHoatDongTthsImpl.class,
						qlvtLoaiHinhHoatDongTths.getPrimaryKeyObj());
			}

			if (qlvtLoaiHinhHoatDongTths != null) {
				session.delete(qlvtLoaiHinhHoatDongTths);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtLoaiHinhHoatDongTths != null) {
			clearCache(qlvtLoaiHinhHoatDongTths);
		}

		return qlvtLoaiHinhHoatDongTths;
	}

	@Override
	public QlvtLoaiHinhHoatDongTths updateImpl(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths qlvtLoaiHinhHoatDongTths)
		throws SystemException {
		qlvtLoaiHinhHoatDongTths = toUnwrappedModel(qlvtLoaiHinhHoatDongTths);

		boolean isNew = qlvtLoaiHinhHoatDongTths.isNew();

		QlvtLoaiHinhHoatDongTthsModelImpl qlvtLoaiHinhHoatDongTthsModelImpl = (QlvtLoaiHinhHoatDongTthsModelImpl)qlvtLoaiHinhHoatDongTths;

		Session session = null;

		try {
			session = openSession();

			if (qlvtLoaiHinhHoatDongTths.isNew()) {
				session.save(qlvtLoaiHinhHoatDongTths);

				qlvtLoaiHinhHoatDongTths.setNew(false);
			}
			else {
				session.merge(qlvtLoaiHinhHoatDongTths);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !QlvtLoaiHinhHoatDongTthsModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((qlvtLoaiHinhHoatDongTthsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_THONGTINHOSOID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						qlvtLoaiHinhHoatDongTthsModelImpl.getOriginalThongTinHoSoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_THONGTINHOSOID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_THONGTINHOSOID,
					args);

				args = new Object[] {
						qlvtLoaiHinhHoatDongTthsModelImpl.getThongTinHoSoId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_THONGTINHOSOID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_THONGTINHOSOID,
					args);
			}
		}

		EntityCacheUtil.putResult(QlvtLoaiHinhHoatDongTthsModelImpl.ENTITY_CACHE_ENABLED,
			QlvtLoaiHinhHoatDongTthsImpl.class,
			qlvtLoaiHinhHoatDongTths.getPrimaryKey(), qlvtLoaiHinhHoatDongTths);

		return qlvtLoaiHinhHoatDongTths;
	}

	protected QlvtLoaiHinhHoatDongTths toUnwrappedModel(
		QlvtLoaiHinhHoatDongTths qlvtLoaiHinhHoatDongTths) {
		if (qlvtLoaiHinhHoatDongTths instanceof QlvtLoaiHinhHoatDongTthsImpl) {
			return qlvtLoaiHinhHoatDongTths;
		}

		QlvtLoaiHinhHoatDongTthsImpl qlvtLoaiHinhHoatDongTthsImpl = new QlvtLoaiHinhHoatDongTthsImpl();

		qlvtLoaiHinhHoatDongTthsImpl.setNew(qlvtLoaiHinhHoatDongTths.isNew());
		qlvtLoaiHinhHoatDongTthsImpl.setPrimaryKey(qlvtLoaiHinhHoatDongTths.getPrimaryKey());

		qlvtLoaiHinhHoatDongTthsImpl.setId(qlvtLoaiHinhHoatDongTths.getId());
		qlvtLoaiHinhHoatDongTthsImpl.setMaLoaiHinhHoatDong(qlvtLoaiHinhHoatDongTths.getMaLoaiHinhHoatDong());
		qlvtLoaiHinhHoatDongTthsImpl.setThongTinHoSoId(qlvtLoaiHinhHoatDongTths.getThongTinHoSoId());
		qlvtLoaiHinhHoatDongTthsImpl.setSoLuongPhuongTien(qlvtLoaiHinhHoatDongTths.getSoLuongPhuongTien());
		qlvtLoaiHinhHoatDongTthsImpl.setThietBiGiamSatHanhTrinh(qlvtLoaiHinhHoatDongTths.getThietBiGiamSatHanhTrinh());
		qlvtLoaiHinhHoatDongTthsImpl.setTuyenTu(qlvtLoaiHinhHoatDongTths.getTuyenTu());
		qlvtLoaiHinhHoatDongTthsImpl.setTuyenDen(qlvtLoaiHinhHoatDongTths.getTuyenDen());
		qlvtLoaiHinhHoatDongTthsImpl.setSoChuyen(qlvtLoaiHinhHoatDongTths.getSoChuyen());
		qlvtLoaiHinhHoatDongTthsImpl.setMauSon(qlvtLoaiHinhHoatDongTths.getMauSon());
		qlvtLoaiHinhHoatDongTthsImpl.setLoaiHinhKinhDoanhCuThe(qlvtLoaiHinhHoatDongTths.getLoaiHinhKinhDoanhCuThe());
		qlvtLoaiHinhHoatDongTthsImpl.setDanhGia(qlvtLoaiHinhHoatDongTths.getDanhGia());
		qlvtLoaiHinhHoatDongTthsImpl.setLyDoKhongDat(qlvtLoaiHinhHoatDongTths.getLyDoKhongDat());

		return qlvtLoaiHinhHoatDongTthsImpl;
	}

	/**
	 * Returns the qlvt loai hinh hoat dong tths with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt loai hinh hoat dong tths
	 * @return the qlvt loai hinh hoat dong tths
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtLoaiHinhHoatDongTthsException if a qlvt loai hinh hoat dong tths with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtLoaiHinhHoatDongTths findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQlvtLoaiHinhHoatDongTthsException, SystemException {
		QlvtLoaiHinhHoatDongTths qlvtLoaiHinhHoatDongTths = fetchByPrimaryKey(primaryKey);

		if (qlvtLoaiHinhHoatDongTths == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQlvtLoaiHinhHoatDongTthsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtLoaiHinhHoatDongTths;
	}

	/**
	 * Returns the qlvt loai hinh hoat dong tths with the primary key or throws a {@link vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtLoaiHinhHoatDongTthsException} if it could not be found.
	 *
	 * @param id the primary key of the qlvt loai hinh hoat dong tths
	 * @return the qlvt loai hinh hoat dong tths
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtLoaiHinhHoatDongTthsException if a qlvt loai hinh hoat dong tths with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtLoaiHinhHoatDongTths findByPrimaryKey(long id)
		throws NoSuchQlvtLoaiHinhHoatDongTthsException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the qlvt loai hinh hoat dong tths with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt loai hinh hoat dong tths
	 * @return the qlvt loai hinh hoat dong tths, or <code>null</code> if a qlvt loai hinh hoat dong tths with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtLoaiHinhHoatDongTths fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QlvtLoaiHinhHoatDongTths qlvtLoaiHinhHoatDongTths = (QlvtLoaiHinhHoatDongTths)EntityCacheUtil.getResult(QlvtLoaiHinhHoatDongTthsModelImpl.ENTITY_CACHE_ENABLED,
				QlvtLoaiHinhHoatDongTthsImpl.class, primaryKey);

		if (qlvtLoaiHinhHoatDongTths == _nullQlvtLoaiHinhHoatDongTths) {
			return null;
		}

		if (qlvtLoaiHinhHoatDongTths == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtLoaiHinhHoatDongTths = (QlvtLoaiHinhHoatDongTths)session.get(QlvtLoaiHinhHoatDongTthsImpl.class,
						primaryKey);

				if (qlvtLoaiHinhHoatDongTths != null) {
					cacheResult(qlvtLoaiHinhHoatDongTths);
				}
				else {
					EntityCacheUtil.putResult(QlvtLoaiHinhHoatDongTthsModelImpl.ENTITY_CACHE_ENABLED,
						QlvtLoaiHinhHoatDongTthsImpl.class, primaryKey,
						_nullQlvtLoaiHinhHoatDongTths);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QlvtLoaiHinhHoatDongTthsModelImpl.ENTITY_CACHE_ENABLED,
					QlvtLoaiHinhHoatDongTthsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtLoaiHinhHoatDongTths;
	}

	/**
	 * Returns the qlvt loai hinh hoat dong tths with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the qlvt loai hinh hoat dong tths
	 * @return the qlvt loai hinh hoat dong tths, or <code>null</code> if a qlvt loai hinh hoat dong tths with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtLoaiHinhHoatDongTths fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the qlvt loai hinh hoat dong tthses.
	 *
	 * @return the qlvt loai hinh hoat dong tthses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtLoaiHinhHoatDongTths> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt loai hinh hoat dong tthses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtLoaiHinhHoatDongTthsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt loai hinh hoat dong tthses
	 * @param end the upper bound of the range of qlvt loai hinh hoat dong tthses (not inclusive)
	 * @return the range of qlvt loai hinh hoat dong tthses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtLoaiHinhHoatDongTths> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt loai hinh hoat dong tthses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtLoaiHinhHoatDongTthsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt loai hinh hoat dong tthses
	 * @param end the upper bound of the range of qlvt loai hinh hoat dong tthses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qlvt loai hinh hoat dong tthses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtLoaiHinhHoatDongTths> findAll(int start, int end,
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

		List<QlvtLoaiHinhHoatDongTths> list = (List<QlvtLoaiHinhHoatDongTths>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTLOAIHINHHOATDONGTTHS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTLOAIHINHHOATDONGTTHS;

				if (pagination) {
					sql = sql.concat(QlvtLoaiHinhHoatDongTthsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QlvtLoaiHinhHoatDongTths>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtLoaiHinhHoatDongTths>(list);
				}
				else {
					list = (List<QlvtLoaiHinhHoatDongTths>)QueryUtil.list(q,
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
	 * Removes all the qlvt loai hinh hoat dong tthses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QlvtLoaiHinhHoatDongTths qlvtLoaiHinhHoatDongTths : findAll()) {
			remove(qlvtLoaiHinhHoatDongTths);
		}
	}

	/**
	 * Returns the number of qlvt loai hinh hoat dong tthses.
	 *
	 * @return the number of qlvt loai hinh hoat dong tthses
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

				Query q = session.createQuery(_SQL_COUNT_QLVTLOAIHINHHOATDONGTTHS);

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
	 * Initializes the qlvt loai hinh hoat dong tths persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QlvtLoaiHinhHoatDongTths>> listenersList = new ArrayList<ModelListener<QlvtLoaiHinhHoatDongTths>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QlvtLoaiHinhHoatDongTths>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QlvtLoaiHinhHoatDongTthsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTLOAIHINHHOATDONGTTHS = "SELECT qlvtLoaiHinhHoatDongTths FROM QlvtLoaiHinhHoatDongTths qlvtLoaiHinhHoatDongTths";
	private static final String _SQL_SELECT_QLVTLOAIHINHHOATDONGTTHS_WHERE = "SELECT qlvtLoaiHinhHoatDongTths FROM QlvtLoaiHinhHoatDongTths qlvtLoaiHinhHoatDongTths WHERE ";
	private static final String _SQL_COUNT_QLVTLOAIHINHHOATDONGTTHS = "SELECT COUNT(qlvtLoaiHinhHoatDongTths) FROM QlvtLoaiHinhHoatDongTths qlvtLoaiHinhHoatDongTths";
	private static final String _SQL_COUNT_QLVTLOAIHINHHOATDONGTTHS_WHERE = "SELECT COUNT(qlvtLoaiHinhHoatDongTths) FROM QlvtLoaiHinhHoatDongTths qlvtLoaiHinhHoatDongTths WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtLoaiHinhHoatDongTths.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QlvtLoaiHinhHoatDongTths exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No QlvtLoaiHinhHoatDongTths exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QlvtLoaiHinhHoatDongTthsPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "maLoaiHinhHoatDong", "thongTinHoSoId",
				"soLuongPhuongTien", "thietBiGiamSatHanhTrinh", "tuyenTu",
				"tuyenDen", "soChuyen", "mauSon", "loaiHinhKinhDoanhCuThe",
				"danhGia", "lyDoKhongDat"
			});
	private static QlvtLoaiHinhHoatDongTths _nullQlvtLoaiHinhHoatDongTths = new QlvtLoaiHinhHoatDongTthsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QlvtLoaiHinhHoatDongTths> toCacheModel() {
				return _nullQlvtLoaiHinhHoatDongTthsCacheModel;
			}
		};

	private static CacheModel<QlvtLoaiHinhHoatDongTths> _nullQlvtLoaiHinhHoatDongTthsCacheModel =
		new CacheModel<QlvtLoaiHinhHoatDongTths>() {
			@Override
			public QlvtLoaiHinhHoatDongTths toEntityModel() {
				return _nullQlvtLoaiHinhHoatDongTths;
			}
		};
}