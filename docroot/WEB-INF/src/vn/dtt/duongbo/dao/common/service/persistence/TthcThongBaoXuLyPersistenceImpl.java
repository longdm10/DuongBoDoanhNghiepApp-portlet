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

import vn.dtt.duongbo.dao.common.NoSuchTthcThongBaoXuLyException;
import vn.dtt.duongbo.dao.common.model.TthcThongBaoXuLy;
import vn.dtt.duongbo.dao.common.model.impl.TthcThongBaoXuLyImpl;
import vn.dtt.duongbo.dao.common.model.impl.TthcThongBaoXuLyModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the tthc thong bao xu ly service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcThongBaoXuLyPersistence
 * @see TthcThongBaoXuLyUtil
 * @generated
 */
public class TthcThongBaoXuLyPersistenceImpl extends BasePersistenceImpl<TthcThongBaoXuLy>
	implements TthcThongBaoXuLyPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TthcThongBaoXuLyUtil} to access the tthc thong bao xu ly persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TthcThongBaoXuLyImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TthcThongBaoXuLyModelImpl.ENTITY_CACHE_ENABLED,
			TthcThongBaoXuLyModelImpl.FINDER_CACHE_ENABLED,
			TthcThongBaoXuLyImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TthcThongBaoXuLyModelImpl.ENTITY_CACHE_ENABLED,
			TthcThongBaoXuLyModelImpl.FINDER_CACHE_ENABLED,
			TthcThongBaoXuLyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TthcThongBaoXuLyModelImpl.ENTITY_CACHE_ENABLED,
			TthcThongBaoXuLyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_HOSOTHUTUCID =
		new FinderPath(TthcThongBaoXuLyModelImpl.ENTITY_CACHE_ENABLED,
			TthcThongBaoXuLyModelImpl.FINDER_CACHE_ENABLED,
			TthcThongBaoXuLyImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByHoSoThuTucId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID =
		new FinderPath(TthcThongBaoXuLyModelImpl.ENTITY_CACHE_ENABLED,
			TthcThongBaoXuLyModelImpl.FINDER_CACHE_ENABLED,
			TthcThongBaoXuLyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByHoSoThuTucId",
			new String[] { Long.class.getName() },
			TthcThongBaoXuLyModelImpl.HOSOTHUTUCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_HOSOTHUTUCID = new FinderPath(TthcThongBaoXuLyModelImpl.ENTITY_CACHE_ENABLED,
			TthcThongBaoXuLyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByHoSoThuTucId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the tthc thong bao xu lies where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the matching tthc thong bao xu lies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcThongBaoXuLy> findByHoSoThuTucId(long hoSoThuTucId)
		throws SystemException {
		return findByHoSoThuTucId(hoSoThuTucId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc thong bao xu lies where hoSoThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcThongBaoXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param start the lower bound of the range of tthc thong bao xu lies
	 * @param end the upper bound of the range of tthc thong bao xu lies (not inclusive)
	 * @return the range of matching tthc thong bao xu lies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcThongBaoXuLy> findByHoSoThuTucId(long hoSoThuTucId,
		int start, int end) throws SystemException {
		return findByHoSoThuTucId(hoSoThuTucId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc thong bao xu lies where hoSoThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcThongBaoXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param start the lower bound of the range of tthc thong bao xu lies
	 * @param end the upper bound of the range of tthc thong bao xu lies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tthc thong bao xu lies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcThongBaoXuLy> findByHoSoThuTucId(long hoSoThuTucId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID;
			finderArgs = new Object[] { hoSoThuTucId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_HOSOTHUTUCID;
			finderArgs = new Object[] {
					hoSoThuTucId,
					
					start, end, orderByComparator
				};
		}

		List<TthcThongBaoXuLy> list = (List<TthcThongBaoXuLy>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TthcThongBaoXuLy tthcThongBaoXuLy : list) {
				if ((hoSoThuTucId != tthcThongBaoXuLy.getHoSoThuTucId())) {
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

			query.append(_SQL_SELECT_TTHCTHONGBAOXULY_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TthcThongBaoXuLyModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				if (!pagination) {
					list = (List<TthcThongBaoXuLy>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcThongBaoXuLy>(list);
				}
				else {
					list = (List<TthcThongBaoXuLy>)QueryUtil.list(q,
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
	 * Returns the first tthc thong bao xu ly in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc thong bao xu ly
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcThongBaoXuLyException if a matching tthc thong bao xu ly could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThongBaoXuLy findByHoSoThuTucId_First(long hoSoThuTucId,
		OrderByComparator orderByComparator)
		throws NoSuchTthcThongBaoXuLyException, SystemException {
		TthcThongBaoXuLy tthcThongBaoXuLy = fetchByHoSoThuTucId_First(hoSoThuTucId,
				orderByComparator);

		if (tthcThongBaoXuLy != null) {
			return tthcThongBaoXuLy;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoSoThuTucId=");
		msg.append(hoSoThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcThongBaoXuLyException(msg.toString());
	}

	/**
	 * Returns the first tthc thong bao xu ly in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc thong bao xu ly, or <code>null</code> if a matching tthc thong bao xu ly could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThongBaoXuLy fetchByHoSoThuTucId_First(long hoSoThuTucId,
		OrderByComparator orderByComparator) throws SystemException {
		List<TthcThongBaoXuLy> list = findByHoSoThuTucId(hoSoThuTucId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tthc thong bao xu ly in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc thong bao xu ly
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcThongBaoXuLyException if a matching tthc thong bao xu ly could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThongBaoXuLy findByHoSoThuTucId_Last(long hoSoThuTucId,
		OrderByComparator orderByComparator)
		throws NoSuchTthcThongBaoXuLyException, SystemException {
		TthcThongBaoXuLy tthcThongBaoXuLy = fetchByHoSoThuTucId_Last(hoSoThuTucId,
				orderByComparator);

		if (tthcThongBaoXuLy != null) {
			return tthcThongBaoXuLy;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoSoThuTucId=");
		msg.append(hoSoThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcThongBaoXuLyException(msg.toString());
	}

	/**
	 * Returns the last tthc thong bao xu ly in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc thong bao xu ly, or <code>null</code> if a matching tthc thong bao xu ly could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThongBaoXuLy fetchByHoSoThuTucId_Last(long hoSoThuTucId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByHoSoThuTucId(hoSoThuTucId);

		if (count == 0) {
			return null;
		}

		List<TthcThongBaoXuLy> list = findByHoSoThuTucId(hoSoThuTucId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tthc thong bao xu lies before and after the current tthc thong bao xu ly in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param id the primary key of the current tthc thong bao xu ly
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tthc thong bao xu ly
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcThongBaoXuLyException if a tthc thong bao xu ly with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThongBaoXuLy[] findByHoSoThuTucId_PrevAndNext(long id,
		long hoSoThuTucId, OrderByComparator orderByComparator)
		throws NoSuchTthcThongBaoXuLyException, SystemException {
		TthcThongBaoXuLy tthcThongBaoXuLy = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TthcThongBaoXuLy[] array = new TthcThongBaoXuLyImpl[3];

			array[0] = getByHoSoThuTucId_PrevAndNext(session, tthcThongBaoXuLy,
					hoSoThuTucId, orderByComparator, true);

			array[1] = tthcThongBaoXuLy;

			array[2] = getByHoSoThuTucId_PrevAndNext(session, tthcThongBaoXuLy,
					hoSoThuTucId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TthcThongBaoXuLy getByHoSoThuTucId_PrevAndNext(Session session,
		TthcThongBaoXuLy tthcThongBaoXuLy, long hoSoThuTucId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TTHCTHONGBAOXULY_WHERE);

		query.append(_FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2);

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
			query.append(TthcThongBaoXuLyModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(hoSoThuTucId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tthcThongBaoXuLy);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TthcThongBaoXuLy> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tthc thong bao xu lies where hoSoThuTucId = &#63; from the database.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByHoSoThuTucId(long hoSoThuTucId)
		throws SystemException {
		for (TthcThongBaoXuLy tthcThongBaoXuLy : findByHoSoThuTucId(
				hoSoThuTucId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tthcThongBaoXuLy);
		}
	}

	/**
	 * Returns the number of tthc thong bao xu lies where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the number of matching tthc thong bao xu lies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByHoSoThuTucId(long hoSoThuTucId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_HOSOTHUTUCID;

		Object[] finderArgs = new Object[] { hoSoThuTucId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TTHCTHONGBAOXULY_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

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

	private static final String _FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2 = "tthcThongBaoXuLy.hoSoThuTucId = ?";

	public TthcThongBaoXuLyPersistenceImpl() {
		setModelClass(TthcThongBaoXuLy.class);
	}

	/**
	 * Caches the tthc thong bao xu ly in the entity cache if it is enabled.
	 *
	 * @param tthcThongBaoXuLy the tthc thong bao xu ly
	 */
	@Override
	public void cacheResult(TthcThongBaoXuLy tthcThongBaoXuLy) {
		EntityCacheUtil.putResult(TthcThongBaoXuLyModelImpl.ENTITY_CACHE_ENABLED,
			TthcThongBaoXuLyImpl.class, tthcThongBaoXuLy.getPrimaryKey(),
			tthcThongBaoXuLy);

		tthcThongBaoXuLy.resetOriginalValues();
	}

	/**
	 * Caches the tthc thong bao xu lies in the entity cache if it is enabled.
	 *
	 * @param tthcThongBaoXuLies the tthc thong bao xu lies
	 */
	@Override
	public void cacheResult(List<TthcThongBaoXuLy> tthcThongBaoXuLies) {
		for (TthcThongBaoXuLy tthcThongBaoXuLy : tthcThongBaoXuLies) {
			if (EntityCacheUtil.getResult(
						TthcThongBaoXuLyModelImpl.ENTITY_CACHE_ENABLED,
						TthcThongBaoXuLyImpl.class,
						tthcThongBaoXuLy.getPrimaryKey()) == null) {
				cacheResult(tthcThongBaoXuLy);
			}
			else {
				tthcThongBaoXuLy.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tthc thong bao xu lies.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TthcThongBaoXuLyImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TthcThongBaoXuLyImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tthc thong bao xu ly.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TthcThongBaoXuLy tthcThongBaoXuLy) {
		EntityCacheUtil.removeResult(TthcThongBaoXuLyModelImpl.ENTITY_CACHE_ENABLED,
			TthcThongBaoXuLyImpl.class, tthcThongBaoXuLy.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TthcThongBaoXuLy> tthcThongBaoXuLies) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TthcThongBaoXuLy tthcThongBaoXuLy : tthcThongBaoXuLies) {
			EntityCacheUtil.removeResult(TthcThongBaoXuLyModelImpl.ENTITY_CACHE_ENABLED,
				TthcThongBaoXuLyImpl.class, tthcThongBaoXuLy.getPrimaryKey());
		}
	}

	/**
	 * Creates a new tthc thong bao xu ly with the primary key. Does not add the tthc thong bao xu ly to the database.
	 *
	 * @param id the primary key for the new tthc thong bao xu ly
	 * @return the new tthc thong bao xu ly
	 */
	@Override
	public TthcThongBaoXuLy create(long id) {
		TthcThongBaoXuLy tthcThongBaoXuLy = new TthcThongBaoXuLyImpl();

		tthcThongBaoXuLy.setNew(true);
		tthcThongBaoXuLy.setPrimaryKey(id);

		return tthcThongBaoXuLy;
	}

	/**
	 * Removes the tthc thong bao xu ly with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the tthc thong bao xu ly
	 * @return the tthc thong bao xu ly that was removed
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcThongBaoXuLyException if a tthc thong bao xu ly with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThongBaoXuLy remove(long id)
		throws NoSuchTthcThongBaoXuLyException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the tthc thong bao xu ly with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tthc thong bao xu ly
	 * @return the tthc thong bao xu ly that was removed
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcThongBaoXuLyException if a tthc thong bao xu ly with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThongBaoXuLy remove(Serializable primaryKey)
		throws NoSuchTthcThongBaoXuLyException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TthcThongBaoXuLy tthcThongBaoXuLy = (TthcThongBaoXuLy)session.get(TthcThongBaoXuLyImpl.class,
					primaryKey);

			if (tthcThongBaoXuLy == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTthcThongBaoXuLyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tthcThongBaoXuLy);
		}
		catch (NoSuchTthcThongBaoXuLyException nsee) {
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
	protected TthcThongBaoXuLy removeImpl(TthcThongBaoXuLy tthcThongBaoXuLy)
		throws SystemException {
		tthcThongBaoXuLy = toUnwrappedModel(tthcThongBaoXuLy);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tthcThongBaoXuLy)) {
				tthcThongBaoXuLy = (TthcThongBaoXuLy)session.get(TthcThongBaoXuLyImpl.class,
						tthcThongBaoXuLy.getPrimaryKeyObj());
			}

			if (tthcThongBaoXuLy != null) {
				session.delete(tthcThongBaoXuLy);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tthcThongBaoXuLy != null) {
			clearCache(tthcThongBaoXuLy);
		}

		return tthcThongBaoXuLy;
	}

	@Override
	public TthcThongBaoXuLy updateImpl(
		vn.dtt.duongbo.dao.common.model.TthcThongBaoXuLy tthcThongBaoXuLy)
		throws SystemException {
		tthcThongBaoXuLy = toUnwrappedModel(tthcThongBaoXuLy);

		boolean isNew = tthcThongBaoXuLy.isNew();

		TthcThongBaoXuLyModelImpl tthcThongBaoXuLyModelImpl = (TthcThongBaoXuLyModelImpl)tthcThongBaoXuLy;

		Session session = null;

		try {
			session = openSession();

			if (tthcThongBaoXuLy.isNew()) {
				session.save(tthcThongBaoXuLy);

				tthcThongBaoXuLy.setNew(false);
			}
			else {
				session.merge(tthcThongBaoXuLy);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TthcThongBaoXuLyModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tthcThongBaoXuLyModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcThongBaoXuLyModelImpl.getOriginalHoSoThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID,
					args);

				args = new Object[] { tthcThongBaoXuLyModelImpl.getHoSoThuTucId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID,
					args);
			}
		}

		EntityCacheUtil.putResult(TthcThongBaoXuLyModelImpl.ENTITY_CACHE_ENABLED,
			TthcThongBaoXuLyImpl.class, tthcThongBaoXuLy.getPrimaryKey(),
			tthcThongBaoXuLy);

		return tthcThongBaoXuLy;
	}

	protected TthcThongBaoXuLy toUnwrappedModel(
		TthcThongBaoXuLy tthcThongBaoXuLy) {
		if (tthcThongBaoXuLy instanceof TthcThongBaoXuLyImpl) {
			return tthcThongBaoXuLy;
		}

		TthcThongBaoXuLyImpl tthcThongBaoXuLyImpl = new TthcThongBaoXuLyImpl();

		tthcThongBaoXuLyImpl.setNew(tthcThongBaoXuLy.isNew());
		tthcThongBaoXuLyImpl.setPrimaryKey(tthcThongBaoXuLy.getPrimaryKey());

		tthcThongBaoXuLyImpl.setId(tthcThongBaoXuLy.getId());
		tthcThongBaoXuLyImpl.setHoSoThuTucId(tthcThongBaoXuLy.getHoSoThuTucId());
		tthcThongBaoXuLyImpl.setMaThongBao(tthcThongBaoXuLy.getMaThongBao());
		tthcThongBaoXuLyImpl.setNoiDungThongBao(tthcThongBaoXuLy.getNoiDungThongBao());
		tthcThongBaoXuLyImpl.setDuLieuThongBao(tthcThongBaoXuLy.getDuLieuThongBao());
		tthcThongBaoXuLyImpl.setNgayGio(tthcThongBaoXuLy.getNgayGio());

		return tthcThongBaoXuLyImpl;
	}

	/**
	 * Returns the tthc thong bao xu ly with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc thong bao xu ly
	 * @return the tthc thong bao xu ly
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcThongBaoXuLyException if a tthc thong bao xu ly with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThongBaoXuLy findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTthcThongBaoXuLyException, SystemException {
		TthcThongBaoXuLy tthcThongBaoXuLy = fetchByPrimaryKey(primaryKey);

		if (tthcThongBaoXuLy == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTthcThongBaoXuLyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tthcThongBaoXuLy;
	}

	/**
	 * Returns the tthc thong bao xu ly with the primary key or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcThongBaoXuLyException} if it could not be found.
	 *
	 * @param id the primary key of the tthc thong bao xu ly
	 * @return the tthc thong bao xu ly
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcThongBaoXuLyException if a tthc thong bao xu ly with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThongBaoXuLy findByPrimaryKey(long id)
		throws NoSuchTthcThongBaoXuLyException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the tthc thong bao xu ly with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc thong bao xu ly
	 * @return the tthc thong bao xu ly, or <code>null</code> if a tthc thong bao xu ly with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThongBaoXuLy fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TthcThongBaoXuLy tthcThongBaoXuLy = (TthcThongBaoXuLy)EntityCacheUtil.getResult(TthcThongBaoXuLyModelImpl.ENTITY_CACHE_ENABLED,
				TthcThongBaoXuLyImpl.class, primaryKey);

		if (tthcThongBaoXuLy == _nullTthcThongBaoXuLy) {
			return null;
		}

		if (tthcThongBaoXuLy == null) {
			Session session = null;

			try {
				session = openSession();

				tthcThongBaoXuLy = (TthcThongBaoXuLy)session.get(TthcThongBaoXuLyImpl.class,
						primaryKey);

				if (tthcThongBaoXuLy != null) {
					cacheResult(tthcThongBaoXuLy);
				}
				else {
					EntityCacheUtil.putResult(TthcThongBaoXuLyModelImpl.ENTITY_CACHE_ENABLED,
						TthcThongBaoXuLyImpl.class, primaryKey,
						_nullTthcThongBaoXuLy);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TthcThongBaoXuLyModelImpl.ENTITY_CACHE_ENABLED,
					TthcThongBaoXuLyImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tthcThongBaoXuLy;
	}

	/**
	 * Returns the tthc thong bao xu ly with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the tthc thong bao xu ly
	 * @return the tthc thong bao xu ly, or <code>null</code> if a tthc thong bao xu ly with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcThongBaoXuLy fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the tthc thong bao xu lies.
	 *
	 * @return the tthc thong bao xu lies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcThongBaoXuLy> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc thong bao xu lies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcThongBaoXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc thong bao xu lies
	 * @param end the upper bound of the range of tthc thong bao xu lies (not inclusive)
	 * @return the range of tthc thong bao xu lies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcThongBaoXuLy> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc thong bao xu lies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcThongBaoXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc thong bao xu lies
	 * @param end the upper bound of the range of tthc thong bao xu lies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tthc thong bao xu lies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcThongBaoXuLy> findAll(int start, int end,
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

		List<TthcThongBaoXuLy> list = (List<TthcThongBaoXuLy>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TTHCTHONGBAOXULY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TTHCTHONGBAOXULY;

				if (pagination) {
					sql = sql.concat(TthcThongBaoXuLyModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TthcThongBaoXuLy>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcThongBaoXuLy>(list);
				}
				else {
					list = (List<TthcThongBaoXuLy>)QueryUtil.list(q,
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
	 * Removes all the tthc thong bao xu lies from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TthcThongBaoXuLy tthcThongBaoXuLy : findAll()) {
			remove(tthcThongBaoXuLy);
		}
	}

	/**
	 * Returns the number of tthc thong bao xu lies.
	 *
	 * @return the number of tthc thong bao xu lies
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

				Query q = session.createQuery(_SQL_COUNT_TTHCTHONGBAOXULY);

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
	 * Initializes the tthc thong bao xu ly persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.common.model.TthcThongBaoXuLy")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TthcThongBaoXuLy>> listenersList = new ArrayList<ModelListener<TthcThongBaoXuLy>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TthcThongBaoXuLy>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TthcThongBaoXuLyImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TTHCTHONGBAOXULY = "SELECT tthcThongBaoXuLy FROM TthcThongBaoXuLy tthcThongBaoXuLy";
	private static final String _SQL_SELECT_TTHCTHONGBAOXULY_WHERE = "SELECT tthcThongBaoXuLy FROM TthcThongBaoXuLy tthcThongBaoXuLy WHERE ";
	private static final String _SQL_COUNT_TTHCTHONGBAOXULY = "SELECT COUNT(tthcThongBaoXuLy) FROM TthcThongBaoXuLy tthcThongBaoXuLy";
	private static final String _SQL_COUNT_TTHCTHONGBAOXULY_WHERE = "SELECT COUNT(tthcThongBaoXuLy) FROM TthcThongBaoXuLy tthcThongBaoXuLy WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tthcThongBaoXuLy.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TthcThongBaoXuLy exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TthcThongBaoXuLy exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TthcThongBaoXuLyPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"maThongBao", "noiDungThongBao", "ngayGio"
			});
	private static TthcThongBaoXuLy _nullTthcThongBaoXuLy = new TthcThongBaoXuLyImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TthcThongBaoXuLy> toCacheModel() {
				return _nullTthcThongBaoXuLyCacheModel;
			}
		};

	private static CacheModel<TthcThongBaoXuLy> _nullTthcThongBaoXuLyCacheModel = new CacheModel<TthcThongBaoXuLy>() {
			@Override
			public TthcThongBaoXuLy toEntityModel() {
				return _nullTthcThongBaoXuLy;
			}
		};
}