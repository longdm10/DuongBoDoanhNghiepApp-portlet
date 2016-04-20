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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCKetQuaThamTraException;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTra;
import vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtTTHCKetQuaThamTraImpl;
import vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtTTHCKetQuaThamTraModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the qlvt t t h c ket qua tham tra service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanNc
 * @see QlvtTTHCKetQuaThamTraPersistence
 * @see QlvtTTHCKetQuaThamTraUtil
 * @generated
 */
public class QlvtTTHCKetQuaThamTraPersistenceImpl extends BasePersistenceImpl<QlvtTTHCKetQuaThamTra>
	implements QlvtTTHCKetQuaThamTraPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QlvtTTHCKetQuaThamTraUtil} to access the qlvt t t h c ket qua tham tra persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QlvtTTHCKetQuaThamTraImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QlvtTTHCKetQuaThamTraModelImpl.ENTITY_CACHE_ENABLED,
			QlvtTTHCKetQuaThamTraModelImpl.FINDER_CACHE_ENABLED,
			QlvtTTHCKetQuaThamTraImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QlvtTTHCKetQuaThamTraModelImpl.ENTITY_CACHE_ENABLED,
			QlvtTTHCKetQuaThamTraModelImpl.FINDER_CACHE_ENABLED,
			QlvtTTHCKetQuaThamTraImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QlvtTTHCKetQuaThamTraModelImpl.ENTITY_CACHE_ENABLED,
			QlvtTTHCKetQuaThamTraModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TOCHUCIDANDMATTHC =
		new FinderPath(QlvtTTHCKetQuaThamTraModelImpl.ENTITY_CACHE_ENABLED,
			QlvtTTHCKetQuaThamTraModelImpl.FINDER_CACHE_ENABLED,
			QlvtTTHCKetQuaThamTraImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByToChucIdAndMaTthc",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOCHUCIDANDMATTHC =
		new FinderPath(QlvtTTHCKetQuaThamTraModelImpl.ENTITY_CACHE_ENABLED,
			QlvtTTHCKetQuaThamTraModelImpl.FINDER_CACHE_ENABLED,
			QlvtTTHCKetQuaThamTraImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByToChucIdAndMaTthc",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			},
			QlvtTTHCKetQuaThamTraModelImpl.MATTHC_COLUMN_BITMASK |
			QlvtTTHCKetQuaThamTraModelImpl.BUOCXULY_COLUMN_BITMASK |
			QlvtTTHCKetQuaThamTraModelImpl.TOCHUCXULY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TOCHUCIDANDMATTHC = new FinderPath(QlvtTTHCKetQuaThamTraModelImpl.ENTITY_CACHE_ENABLED,
			QlvtTTHCKetQuaThamTraModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByToChucIdAndMaTthc",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the qlvt t t h c ket qua tham tras where maTTHC = &#63; and buocXuLy = &#63; and toChucXuLy = &#63;.
	 *
	 * @param maTTHC the ma t t h c
	 * @param buocXuLy the buoc xu ly
	 * @param toChucXuLy the to chuc xu ly
	 * @return the matching qlvt t t h c ket qua tham tras
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtTTHCKetQuaThamTra> findByToChucIdAndMaTthc(String maTTHC,
		int buocXuLy, int toChucXuLy) throws SystemException {
		return findByToChucIdAndMaTthc(maTTHC, buocXuLy, toChucXuLy,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt t t h c ket qua tham tras where maTTHC = &#63; and buocXuLy = &#63; and toChucXuLy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtTTHCKetQuaThamTraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param maTTHC the ma t t h c
	 * @param buocXuLy the buoc xu ly
	 * @param toChucXuLy the to chuc xu ly
	 * @param start the lower bound of the range of qlvt t t h c ket qua tham tras
	 * @param end the upper bound of the range of qlvt t t h c ket qua tham tras (not inclusive)
	 * @return the range of matching qlvt t t h c ket qua tham tras
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtTTHCKetQuaThamTra> findByToChucIdAndMaTthc(String maTTHC,
		int buocXuLy, int toChucXuLy, int start, int end)
		throws SystemException {
		return findByToChucIdAndMaTthc(maTTHC, buocXuLy, toChucXuLy, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt t t h c ket qua tham tras where maTTHC = &#63; and buocXuLy = &#63; and toChucXuLy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtTTHCKetQuaThamTraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param maTTHC the ma t t h c
	 * @param buocXuLy the buoc xu ly
	 * @param toChucXuLy the to chuc xu ly
	 * @param start the lower bound of the range of qlvt t t h c ket qua tham tras
	 * @param end the upper bound of the range of qlvt t t h c ket qua tham tras (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching qlvt t t h c ket qua tham tras
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtTTHCKetQuaThamTra> findByToChucIdAndMaTthc(String maTTHC,
		int buocXuLy, int toChucXuLy, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOCHUCIDANDMATTHC;
			finderArgs = new Object[] { maTTHC, buocXuLy, toChucXuLy };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TOCHUCIDANDMATTHC;
			finderArgs = new Object[] {
					maTTHC, buocXuLy, toChucXuLy,
					
					start, end, orderByComparator
				};
		}

		List<QlvtTTHCKetQuaThamTra> list = (List<QlvtTTHCKetQuaThamTra>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (QlvtTTHCKetQuaThamTra qlvtTTHCKetQuaThamTra : list) {
				if (!Validator.equals(maTTHC, qlvtTTHCKetQuaThamTra.getMaTTHC()) ||
						(buocXuLy != qlvtTTHCKetQuaThamTra.getBuocXuLy()) ||
						(toChucXuLy != qlvtTTHCKetQuaThamTra.getToChucXuLy())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_QLVTTTHCKETQUATHAMTRA_WHERE);

			boolean bindMaTTHC = false;

			if (maTTHC == null) {
				query.append(_FINDER_COLUMN_TOCHUCIDANDMATTHC_MATTHC_1);
			}
			else if (maTTHC.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TOCHUCIDANDMATTHC_MATTHC_3);
			}
			else {
				bindMaTTHC = true;

				query.append(_FINDER_COLUMN_TOCHUCIDANDMATTHC_MATTHC_2);
			}

			query.append(_FINDER_COLUMN_TOCHUCIDANDMATTHC_BUOCXULY_2);

			query.append(_FINDER_COLUMN_TOCHUCIDANDMATTHC_TOCHUCXULY_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(QlvtTTHCKetQuaThamTraModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaTTHC) {
					qPos.add(maTTHC);
				}

				qPos.add(buocXuLy);

				qPos.add(toChucXuLy);

				if (!pagination) {
					list = (List<QlvtTTHCKetQuaThamTra>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtTTHCKetQuaThamTra>(list);
				}
				else {
					list = (List<QlvtTTHCKetQuaThamTra>)QueryUtil.list(q,
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
	 * Returns the first qlvt t t h c ket qua tham tra in the ordered set where maTTHC = &#63; and buocXuLy = &#63; and toChucXuLy = &#63;.
	 *
	 * @param maTTHC the ma t t h c
	 * @param buocXuLy the buoc xu ly
	 * @param toChucXuLy the to chuc xu ly
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qlvt t t h c ket qua tham tra
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCKetQuaThamTraException if a matching qlvt t t h c ket qua tham tra could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtTTHCKetQuaThamTra findByToChucIdAndMaTthc_First(String maTTHC,
		int buocXuLy, int toChucXuLy, OrderByComparator orderByComparator)
		throws NoSuchQlvtTTHCKetQuaThamTraException, SystemException {
		QlvtTTHCKetQuaThamTra qlvtTTHCKetQuaThamTra = fetchByToChucIdAndMaTthc_First(maTTHC,
				buocXuLy, toChucXuLy, orderByComparator);

		if (qlvtTTHCKetQuaThamTra != null) {
			return qlvtTTHCKetQuaThamTra;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("maTTHC=");
		msg.append(maTTHC);

		msg.append(", buocXuLy=");
		msg.append(buocXuLy);

		msg.append(", toChucXuLy=");
		msg.append(toChucXuLy);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchQlvtTTHCKetQuaThamTraException(msg.toString());
	}

	/**
	 * Returns the first qlvt t t h c ket qua tham tra in the ordered set where maTTHC = &#63; and buocXuLy = &#63; and toChucXuLy = &#63;.
	 *
	 * @param maTTHC the ma t t h c
	 * @param buocXuLy the buoc xu ly
	 * @param toChucXuLy the to chuc xu ly
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qlvt t t h c ket qua tham tra, or <code>null</code> if a matching qlvt t t h c ket qua tham tra could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtTTHCKetQuaThamTra fetchByToChucIdAndMaTthc_First(String maTTHC,
		int buocXuLy, int toChucXuLy, OrderByComparator orderByComparator)
		throws SystemException {
		List<QlvtTTHCKetQuaThamTra> list = findByToChucIdAndMaTthc(maTTHC,
				buocXuLy, toChucXuLy, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last qlvt t t h c ket qua tham tra in the ordered set where maTTHC = &#63; and buocXuLy = &#63; and toChucXuLy = &#63;.
	 *
	 * @param maTTHC the ma t t h c
	 * @param buocXuLy the buoc xu ly
	 * @param toChucXuLy the to chuc xu ly
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qlvt t t h c ket qua tham tra
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCKetQuaThamTraException if a matching qlvt t t h c ket qua tham tra could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtTTHCKetQuaThamTra findByToChucIdAndMaTthc_Last(String maTTHC,
		int buocXuLy, int toChucXuLy, OrderByComparator orderByComparator)
		throws NoSuchQlvtTTHCKetQuaThamTraException, SystemException {
		QlvtTTHCKetQuaThamTra qlvtTTHCKetQuaThamTra = fetchByToChucIdAndMaTthc_Last(maTTHC,
				buocXuLy, toChucXuLy, orderByComparator);

		if (qlvtTTHCKetQuaThamTra != null) {
			return qlvtTTHCKetQuaThamTra;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("maTTHC=");
		msg.append(maTTHC);

		msg.append(", buocXuLy=");
		msg.append(buocXuLy);

		msg.append(", toChucXuLy=");
		msg.append(toChucXuLy);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchQlvtTTHCKetQuaThamTraException(msg.toString());
	}

	/**
	 * Returns the last qlvt t t h c ket qua tham tra in the ordered set where maTTHC = &#63; and buocXuLy = &#63; and toChucXuLy = &#63;.
	 *
	 * @param maTTHC the ma t t h c
	 * @param buocXuLy the buoc xu ly
	 * @param toChucXuLy the to chuc xu ly
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qlvt t t h c ket qua tham tra, or <code>null</code> if a matching qlvt t t h c ket qua tham tra could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtTTHCKetQuaThamTra fetchByToChucIdAndMaTthc_Last(String maTTHC,
		int buocXuLy, int toChucXuLy, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByToChucIdAndMaTthc(maTTHC, buocXuLy, toChucXuLy);

		if (count == 0) {
			return null;
		}

		List<QlvtTTHCKetQuaThamTra> list = findByToChucIdAndMaTthc(maTTHC,
				buocXuLy, toChucXuLy, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the qlvt t t h c ket qua tham tras before and after the current qlvt t t h c ket qua tham tra in the ordered set where maTTHC = &#63; and buocXuLy = &#63; and toChucXuLy = &#63;.
	 *
	 * @param id the primary key of the current qlvt t t h c ket qua tham tra
	 * @param maTTHC the ma t t h c
	 * @param buocXuLy the buoc xu ly
	 * @param toChucXuLy the to chuc xu ly
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next qlvt t t h c ket qua tham tra
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCKetQuaThamTraException if a qlvt t t h c ket qua tham tra with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtTTHCKetQuaThamTra[] findByToChucIdAndMaTthc_PrevAndNext(
		long id, String maTTHC, int buocXuLy, int toChucXuLy,
		OrderByComparator orderByComparator)
		throws NoSuchQlvtTTHCKetQuaThamTraException, SystemException {
		QlvtTTHCKetQuaThamTra qlvtTTHCKetQuaThamTra = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			QlvtTTHCKetQuaThamTra[] array = new QlvtTTHCKetQuaThamTraImpl[3];

			array[0] = getByToChucIdAndMaTthc_PrevAndNext(session,
					qlvtTTHCKetQuaThamTra, maTTHC, buocXuLy, toChucXuLy,
					orderByComparator, true);

			array[1] = qlvtTTHCKetQuaThamTra;

			array[2] = getByToChucIdAndMaTthc_PrevAndNext(session,
					qlvtTTHCKetQuaThamTra, maTTHC, buocXuLy, toChucXuLy,
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

	protected QlvtTTHCKetQuaThamTra getByToChucIdAndMaTthc_PrevAndNext(
		Session session, QlvtTTHCKetQuaThamTra qlvtTTHCKetQuaThamTra,
		String maTTHC, int buocXuLy, int toChucXuLy,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_QLVTTTHCKETQUATHAMTRA_WHERE);

		boolean bindMaTTHC = false;

		if (maTTHC == null) {
			query.append(_FINDER_COLUMN_TOCHUCIDANDMATTHC_MATTHC_1);
		}
		else if (maTTHC.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_TOCHUCIDANDMATTHC_MATTHC_3);
		}
		else {
			bindMaTTHC = true;

			query.append(_FINDER_COLUMN_TOCHUCIDANDMATTHC_MATTHC_2);
		}

		query.append(_FINDER_COLUMN_TOCHUCIDANDMATTHC_BUOCXULY_2);

		query.append(_FINDER_COLUMN_TOCHUCIDANDMATTHC_TOCHUCXULY_2);

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
			query.append(QlvtTTHCKetQuaThamTraModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindMaTTHC) {
			qPos.add(maTTHC);
		}

		qPos.add(buocXuLy);

		qPos.add(toChucXuLy);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(qlvtTTHCKetQuaThamTra);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<QlvtTTHCKetQuaThamTra> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the qlvt t t h c ket qua tham tras where maTTHC = &#63; and buocXuLy = &#63; and toChucXuLy = &#63; from the database.
	 *
	 * @param maTTHC the ma t t h c
	 * @param buocXuLy the buoc xu ly
	 * @param toChucXuLy the to chuc xu ly
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByToChucIdAndMaTthc(String maTTHC, int buocXuLy,
		int toChucXuLy) throws SystemException {
		for (QlvtTTHCKetQuaThamTra qlvtTTHCKetQuaThamTra : findByToChucIdAndMaTthc(
				maTTHC, buocXuLy, toChucXuLy, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(qlvtTTHCKetQuaThamTra);
		}
	}

	/**
	 * Returns the number of qlvt t t h c ket qua tham tras where maTTHC = &#63; and buocXuLy = &#63; and toChucXuLy = &#63;.
	 *
	 * @param maTTHC the ma t t h c
	 * @param buocXuLy the buoc xu ly
	 * @param toChucXuLy the to chuc xu ly
	 * @return the number of matching qlvt t t h c ket qua tham tras
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByToChucIdAndMaTthc(String maTTHC, int buocXuLy,
		int toChucXuLy) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TOCHUCIDANDMATTHC;

		Object[] finderArgs = new Object[] { maTTHC, buocXuLy, toChucXuLy };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_QLVTTTHCKETQUATHAMTRA_WHERE);

			boolean bindMaTTHC = false;

			if (maTTHC == null) {
				query.append(_FINDER_COLUMN_TOCHUCIDANDMATTHC_MATTHC_1);
			}
			else if (maTTHC.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TOCHUCIDANDMATTHC_MATTHC_3);
			}
			else {
				bindMaTTHC = true;

				query.append(_FINDER_COLUMN_TOCHUCIDANDMATTHC_MATTHC_2);
			}

			query.append(_FINDER_COLUMN_TOCHUCIDANDMATTHC_BUOCXULY_2);

			query.append(_FINDER_COLUMN_TOCHUCIDANDMATTHC_TOCHUCXULY_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaTTHC) {
					qPos.add(maTTHC);
				}

				qPos.add(buocXuLy);

				qPos.add(toChucXuLy);

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

	private static final String _FINDER_COLUMN_TOCHUCIDANDMATTHC_MATTHC_1 = "qlvtTTHCKetQuaThamTra.maTTHC IS NULL AND ";
	private static final String _FINDER_COLUMN_TOCHUCIDANDMATTHC_MATTHC_2 = "qlvtTTHCKetQuaThamTra.maTTHC = ? AND ";
	private static final String _FINDER_COLUMN_TOCHUCIDANDMATTHC_MATTHC_3 = "(qlvtTTHCKetQuaThamTra.maTTHC IS NULL OR qlvtTTHCKetQuaThamTra.maTTHC = '') AND ";
	private static final String _FINDER_COLUMN_TOCHUCIDANDMATTHC_BUOCXULY_2 = "qlvtTTHCKetQuaThamTra.buocXuLy = ? AND ";
	private static final String _FINDER_COLUMN_TOCHUCIDANDMATTHC_TOCHUCXULY_2 = "qlvtTTHCKetQuaThamTra.toChucXuLy = ?";

	public QlvtTTHCKetQuaThamTraPersistenceImpl() {
		setModelClass(QlvtTTHCKetQuaThamTra.class);
	}

	/**
	 * Caches the qlvt t t h c ket qua tham tra in the entity cache if it is enabled.
	 *
	 * @param qlvtTTHCKetQuaThamTra the qlvt t t h c ket qua tham tra
	 */
	@Override
	public void cacheResult(QlvtTTHCKetQuaThamTra qlvtTTHCKetQuaThamTra) {
		EntityCacheUtil.putResult(QlvtTTHCKetQuaThamTraModelImpl.ENTITY_CACHE_ENABLED,
			QlvtTTHCKetQuaThamTraImpl.class,
			qlvtTTHCKetQuaThamTra.getPrimaryKey(), qlvtTTHCKetQuaThamTra);

		qlvtTTHCKetQuaThamTra.resetOriginalValues();
	}

	/**
	 * Caches the qlvt t t h c ket qua tham tras in the entity cache if it is enabled.
	 *
	 * @param qlvtTTHCKetQuaThamTras the qlvt t t h c ket qua tham tras
	 */
	@Override
	public void cacheResult(List<QlvtTTHCKetQuaThamTra> qlvtTTHCKetQuaThamTras) {
		for (QlvtTTHCKetQuaThamTra qlvtTTHCKetQuaThamTra : qlvtTTHCKetQuaThamTras) {
			if (EntityCacheUtil.getResult(
						QlvtTTHCKetQuaThamTraModelImpl.ENTITY_CACHE_ENABLED,
						QlvtTTHCKetQuaThamTraImpl.class,
						qlvtTTHCKetQuaThamTra.getPrimaryKey()) == null) {
				cacheResult(qlvtTTHCKetQuaThamTra);
			}
			else {
				qlvtTTHCKetQuaThamTra.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qlvt t t h c ket qua tham tras.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QlvtTTHCKetQuaThamTraImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QlvtTTHCKetQuaThamTraImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qlvt t t h c ket qua tham tra.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QlvtTTHCKetQuaThamTra qlvtTTHCKetQuaThamTra) {
		EntityCacheUtil.removeResult(QlvtTTHCKetQuaThamTraModelImpl.ENTITY_CACHE_ENABLED,
			QlvtTTHCKetQuaThamTraImpl.class,
			qlvtTTHCKetQuaThamTra.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<QlvtTTHCKetQuaThamTra> qlvtTTHCKetQuaThamTras) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QlvtTTHCKetQuaThamTra qlvtTTHCKetQuaThamTra : qlvtTTHCKetQuaThamTras) {
			EntityCacheUtil.removeResult(QlvtTTHCKetQuaThamTraModelImpl.ENTITY_CACHE_ENABLED,
				QlvtTTHCKetQuaThamTraImpl.class,
				qlvtTTHCKetQuaThamTra.getPrimaryKey());
		}
	}

	/**
	 * Creates a new qlvt t t h c ket qua tham tra with the primary key. Does not add the qlvt t t h c ket qua tham tra to the database.
	 *
	 * @param id the primary key for the new qlvt t t h c ket qua tham tra
	 * @return the new qlvt t t h c ket qua tham tra
	 */
	@Override
	public QlvtTTHCKetQuaThamTra create(long id) {
		QlvtTTHCKetQuaThamTra qlvtTTHCKetQuaThamTra = new QlvtTTHCKetQuaThamTraImpl();

		qlvtTTHCKetQuaThamTra.setNew(true);
		qlvtTTHCKetQuaThamTra.setPrimaryKey(id);

		return qlvtTTHCKetQuaThamTra;
	}

	/**
	 * Removes the qlvt t t h c ket qua tham tra with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the qlvt t t h c ket qua tham tra
	 * @return the qlvt t t h c ket qua tham tra that was removed
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCKetQuaThamTraException if a qlvt t t h c ket qua tham tra with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtTTHCKetQuaThamTra remove(long id)
		throws NoSuchQlvtTTHCKetQuaThamTraException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the qlvt t t h c ket qua tham tra with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qlvt t t h c ket qua tham tra
	 * @return the qlvt t t h c ket qua tham tra that was removed
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCKetQuaThamTraException if a qlvt t t h c ket qua tham tra with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtTTHCKetQuaThamTra remove(Serializable primaryKey)
		throws NoSuchQlvtTTHCKetQuaThamTraException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QlvtTTHCKetQuaThamTra qlvtTTHCKetQuaThamTra = (QlvtTTHCKetQuaThamTra)session.get(QlvtTTHCKetQuaThamTraImpl.class,
					primaryKey);

			if (qlvtTTHCKetQuaThamTra == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQlvtTTHCKetQuaThamTraException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtTTHCKetQuaThamTra);
		}
		catch (NoSuchQlvtTTHCKetQuaThamTraException nsee) {
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
	protected QlvtTTHCKetQuaThamTra removeImpl(
		QlvtTTHCKetQuaThamTra qlvtTTHCKetQuaThamTra) throws SystemException {
		qlvtTTHCKetQuaThamTra = toUnwrappedModel(qlvtTTHCKetQuaThamTra);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtTTHCKetQuaThamTra)) {
				qlvtTTHCKetQuaThamTra = (QlvtTTHCKetQuaThamTra)session.get(QlvtTTHCKetQuaThamTraImpl.class,
						qlvtTTHCKetQuaThamTra.getPrimaryKeyObj());
			}

			if (qlvtTTHCKetQuaThamTra != null) {
				session.delete(qlvtTTHCKetQuaThamTra);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtTTHCKetQuaThamTra != null) {
			clearCache(qlvtTTHCKetQuaThamTra);
		}

		return qlvtTTHCKetQuaThamTra;
	}

	@Override
	public QlvtTTHCKetQuaThamTra updateImpl(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTra qlvtTTHCKetQuaThamTra)
		throws SystemException {
		qlvtTTHCKetQuaThamTra = toUnwrappedModel(qlvtTTHCKetQuaThamTra);

		boolean isNew = qlvtTTHCKetQuaThamTra.isNew();

		QlvtTTHCKetQuaThamTraModelImpl qlvtTTHCKetQuaThamTraModelImpl = (QlvtTTHCKetQuaThamTraModelImpl)qlvtTTHCKetQuaThamTra;

		Session session = null;

		try {
			session = openSession();

			if (qlvtTTHCKetQuaThamTra.isNew()) {
				session.save(qlvtTTHCKetQuaThamTra);

				qlvtTTHCKetQuaThamTra.setNew(false);
			}
			else {
				session.merge(qlvtTTHCKetQuaThamTra);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !QlvtTTHCKetQuaThamTraModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((qlvtTTHCKetQuaThamTraModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOCHUCIDANDMATTHC.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						qlvtTTHCKetQuaThamTraModelImpl.getOriginalMaTTHC(),
						qlvtTTHCKetQuaThamTraModelImpl.getOriginalBuocXuLy(),
						qlvtTTHCKetQuaThamTraModelImpl.getOriginalToChucXuLy()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TOCHUCIDANDMATTHC,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOCHUCIDANDMATTHC,
					args);

				args = new Object[] {
						qlvtTTHCKetQuaThamTraModelImpl.getMaTTHC(),
						qlvtTTHCKetQuaThamTraModelImpl.getBuocXuLy(),
						qlvtTTHCKetQuaThamTraModelImpl.getToChucXuLy()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TOCHUCIDANDMATTHC,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOCHUCIDANDMATTHC,
					args);
			}
		}

		EntityCacheUtil.putResult(QlvtTTHCKetQuaThamTraModelImpl.ENTITY_CACHE_ENABLED,
			QlvtTTHCKetQuaThamTraImpl.class,
			qlvtTTHCKetQuaThamTra.getPrimaryKey(), qlvtTTHCKetQuaThamTra);

		return qlvtTTHCKetQuaThamTra;
	}

	protected QlvtTTHCKetQuaThamTra toUnwrappedModel(
		QlvtTTHCKetQuaThamTra qlvtTTHCKetQuaThamTra) {
		if (qlvtTTHCKetQuaThamTra instanceof QlvtTTHCKetQuaThamTraImpl) {
			return qlvtTTHCKetQuaThamTra;
		}

		QlvtTTHCKetQuaThamTraImpl qlvtTTHCKetQuaThamTraImpl = new QlvtTTHCKetQuaThamTraImpl();

		qlvtTTHCKetQuaThamTraImpl.setNew(qlvtTTHCKetQuaThamTra.isNew());
		qlvtTTHCKetQuaThamTraImpl.setPrimaryKey(qlvtTTHCKetQuaThamTra.getPrimaryKey());

		qlvtTTHCKetQuaThamTraImpl.setId(qlvtTTHCKetQuaThamTra.getId());
		qlvtTTHCKetQuaThamTraImpl.setMaKetQuaThamTra(qlvtTTHCKetQuaThamTra.getMaKetQuaThamTra());
		qlvtTTHCKetQuaThamTraImpl.setMaTTHC(qlvtTTHCKetQuaThamTra.getMaTTHC());
		qlvtTTHCKetQuaThamTraImpl.setBuocXuLy(qlvtTTHCKetQuaThamTra.getBuocXuLy());
		qlvtTTHCKetQuaThamTraImpl.setToChucXuLy(qlvtTTHCKetQuaThamTra.getToChucXuLy());

		return qlvtTTHCKetQuaThamTraImpl;
	}

	/**
	 * Returns the qlvt t t h c ket qua tham tra with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt t t h c ket qua tham tra
	 * @return the qlvt t t h c ket qua tham tra
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCKetQuaThamTraException if a qlvt t t h c ket qua tham tra with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtTTHCKetQuaThamTra findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQlvtTTHCKetQuaThamTraException, SystemException {
		QlvtTTHCKetQuaThamTra qlvtTTHCKetQuaThamTra = fetchByPrimaryKey(primaryKey);

		if (qlvtTTHCKetQuaThamTra == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQlvtTTHCKetQuaThamTraException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtTTHCKetQuaThamTra;
	}

	/**
	 * Returns the qlvt t t h c ket qua tham tra with the primary key or throws a {@link vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCKetQuaThamTraException} if it could not be found.
	 *
	 * @param id the primary key of the qlvt t t h c ket qua tham tra
	 * @return the qlvt t t h c ket qua tham tra
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtTTHCKetQuaThamTraException if a qlvt t t h c ket qua tham tra with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtTTHCKetQuaThamTra findByPrimaryKey(long id)
		throws NoSuchQlvtTTHCKetQuaThamTraException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the qlvt t t h c ket qua tham tra with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt t t h c ket qua tham tra
	 * @return the qlvt t t h c ket qua tham tra, or <code>null</code> if a qlvt t t h c ket qua tham tra with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtTTHCKetQuaThamTra fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QlvtTTHCKetQuaThamTra qlvtTTHCKetQuaThamTra = (QlvtTTHCKetQuaThamTra)EntityCacheUtil.getResult(QlvtTTHCKetQuaThamTraModelImpl.ENTITY_CACHE_ENABLED,
				QlvtTTHCKetQuaThamTraImpl.class, primaryKey);

		if (qlvtTTHCKetQuaThamTra == _nullQlvtTTHCKetQuaThamTra) {
			return null;
		}

		if (qlvtTTHCKetQuaThamTra == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtTTHCKetQuaThamTra = (QlvtTTHCKetQuaThamTra)session.get(QlvtTTHCKetQuaThamTraImpl.class,
						primaryKey);

				if (qlvtTTHCKetQuaThamTra != null) {
					cacheResult(qlvtTTHCKetQuaThamTra);
				}
				else {
					EntityCacheUtil.putResult(QlvtTTHCKetQuaThamTraModelImpl.ENTITY_CACHE_ENABLED,
						QlvtTTHCKetQuaThamTraImpl.class, primaryKey,
						_nullQlvtTTHCKetQuaThamTra);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QlvtTTHCKetQuaThamTraModelImpl.ENTITY_CACHE_ENABLED,
					QlvtTTHCKetQuaThamTraImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtTTHCKetQuaThamTra;
	}

	/**
	 * Returns the qlvt t t h c ket qua tham tra with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the qlvt t t h c ket qua tham tra
	 * @return the qlvt t t h c ket qua tham tra, or <code>null</code> if a qlvt t t h c ket qua tham tra with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtTTHCKetQuaThamTra fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the qlvt t t h c ket qua tham tras.
	 *
	 * @return the qlvt t t h c ket qua tham tras
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtTTHCKetQuaThamTra> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt t t h c ket qua tham tras.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtTTHCKetQuaThamTraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt t t h c ket qua tham tras
	 * @param end the upper bound of the range of qlvt t t h c ket qua tham tras (not inclusive)
	 * @return the range of qlvt t t h c ket qua tham tras
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtTTHCKetQuaThamTra> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt t t h c ket qua tham tras.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtTTHCKetQuaThamTraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt t t h c ket qua tham tras
	 * @param end the upper bound of the range of qlvt t t h c ket qua tham tras (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qlvt t t h c ket qua tham tras
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtTTHCKetQuaThamTra> findAll(int start, int end,
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

		List<QlvtTTHCKetQuaThamTra> list = (List<QlvtTTHCKetQuaThamTra>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTTTHCKETQUATHAMTRA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTTTHCKETQUATHAMTRA;

				if (pagination) {
					sql = sql.concat(QlvtTTHCKetQuaThamTraModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QlvtTTHCKetQuaThamTra>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtTTHCKetQuaThamTra>(list);
				}
				else {
					list = (List<QlvtTTHCKetQuaThamTra>)QueryUtil.list(q,
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
	 * Removes all the qlvt t t h c ket qua tham tras from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QlvtTTHCKetQuaThamTra qlvtTTHCKetQuaThamTra : findAll()) {
			remove(qlvtTTHCKetQuaThamTra);
		}
	}

	/**
	 * Returns the number of qlvt t t h c ket qua tham tras.
	 *
	 * @return the number of qlvt t t h c ket qua tham tras
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

				Query q = session.createQuery(_SQL_COUNT_QLVTTTHCKETQUATHAMTRA);

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
	 * Initializes the qlvt t t h c ket qua tham tra persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.nghiepvu.model.QlvtTTHCKetQuaThamTra")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QlvtTTHCKetQuaThamTra>> listenersList = new ArrayList<ModelListener<QlvtTTHCKetQuaThamTra>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QlvtTTHCKetQuaThamTra>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QlvtTTHCKetQuaThamTraImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTTTHCKETQUATHAMTRA = "SELECT qlvtTTHCKetQuaThamTra FROM QlvtTTHCKetQuaThamTra qlvtTTHCKetQuaThamTra";
	private static final String _SQL_SELECT_QLVTTTHCKETQUATHAMTRA_WHERE = "SELECT qlvtTTHCKetQuaThamTra FROM QlvtTTHCKetQuaThamTra qlvtTTHCKetQuaThamTra WHERE ";
	private static final String _SQL_COUNT_QLVTTTHCKETQUATHAMTRA = "SELECT COUNT(qlvtTTHCKetQuaThamTra) FROM QlvtTTHCKetQuaThamTra qlvtTTHCKetQuaThamTra";
	private static final String _SQL_COUNT_QLVTTTHCKETQUATHAMTRA_WHERE = "SELECT COUNT(qlvtTTHCKetQuaThamTra) FROM QlvtTTHCKetQuaThamTra qlvtTTHCKetQuaThamTra WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtTTHCKetQuaThamTra.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QlvtTTHCKetQuaThamTra exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No QlvtTTHCKetQuaThamTra exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QlvtTTHCKetQuaThamTraPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"maKetQuaThamTra", "maTTHC", "buocXuLy", "toChucXuLy"
			});
	private static QlvtTTHCKetQuaThamTra _nullQlvtTTHCKetQuaThamTra = new QlvtTTHCKetQuaThamTraImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QlvtTTHCKetQuaThamTra> toCacheModel() {
				return _nullQlvtTTHCKetQuaThamTraCacheModel;
			}
		};

	private static CacheModel<QlvtTTHCKetQuaThamTra> _nullQlvtTTHCKetQuaThamTraCacheModel =
		new CacheModel<QlvtTTHCKetQuaThamTra>() {
			@Override
			public QlvtTTHCKetQuaThamTra toEntityModel() {
				return _nullQlvtTTHCKetQuaThamTra;
			}
		};
}