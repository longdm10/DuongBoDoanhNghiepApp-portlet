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

package vn.dtt.duongbo.dao.motcua.service.persistence;

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

import vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException;
import vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo;
import vn.dtt.duongbo.dao.motcua.model.impl.MotCuaDienBienHoSoImpl;
import vn.dtt.duongbo.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the mot cua dien bien ho so service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see MotCuaDienBienHoSoPersistence
 * @see MotCuaDienBienHoSoUtil
 * @generated
 */
public class MotCuaDienBienHoSoPersistenceImpl extends BasePersistenceImpl<MotCuaDienBienHoSo>
	implements MotCuaDienBienHoSoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link MotCuaDienBienHoSoUtil} to access the mot cua dien bien ho so persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = MotCuaDienBienHoSoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MotCuaDienBienHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaDienBienHoSoModelImpl.FINDER_CACHE_ENABLED,
			MotCuaDienBienHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MotCuaDienBienHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaDienBienHoSoModelImpl.FINDER_CACHE_ENABLED,
			MotCuaDienBienHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MotCuaDienBienHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaDienBienHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TRANGTHAITRUOCID =
		new FinderPath(MotCuaDienBienHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaDienBienHoSoModelImpl.FINDER_CACHE_ENABLED,
			MotCuaDienBienHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTrangThaiTruocId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRANGTHAITRUOCID =
		new FinderPath(MotCuaDienBienHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaDienBienHoSoModelImpl.FINDER_CACHE_ENABLED,
			MotCuaDienBienHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByTrangThaiTruocId", new String[] { Long.class.getName() },
			MotCuaDienBienHoSoModelImpl.TRANGTHAITRUOCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TRANGTHAITRUOCID = new FinderPath(MotCuaDienBienHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaDienBienHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByTrangThaiTruocId", new String[] { Long.class.getName() });

	/**
	 * Returns all the mot cua dien bien ho sos where trangThaiTruocId = &#63;.
	 *
	 * @param trangThaiTruocId the trang thai truoc ID
	 * @return the matching mot cua dien bien ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaDienBienHoSo> findByTrangThaiTruocId(
		long trangThaiTruocId) throws SystemException {
		return findByTrangThaiTruocId(trangThaiTruocId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua dien bien ho sos where trangThaiTruocId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param trangThaiTruocId the trang thai truoc ID
	 * @param start the lower bound of the range of mot cua dien bien ho sos
	 * @param end the upper bound of the range of mot cua dien bien ho sos (not inclusive)
	 * @return the range of matching mot cua dien bien ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaDienBienHoSo> findByTrangThaiTruocId(
		long trangThaiTruocId, int start, int end) throws SystemException {
		return findByTrangThaiTruocId(trangThaiTruocId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua dien bien ho sos where trangThaiTruocId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param trangThaiTruocId the trang thai truoc ID
	 * @param start the lower bound of the range of mot cua dien bien ho sos
	 * @param end the upper bound of the range of mot cua dien bien ho sos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mot cua dien bien ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaDienBienHoSo> findByTrangThaiTruocId(
		long trangThaiTruocId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRANGTHAITRUOCID;
			finderArgs = new Object[] { trangThaiTruocId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TRANGTHAITRUOCID;
			finderArgs = new Object[] {
					trangThaiTruocId,
					
					start, end, orderByComparator
				};
		}

		List<MotCuaDienBienHoSo> list = (List<MotCuaDienBienHoSo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MotCuaDienBienHoSo motCuaDienBienHoSo : list) {
				if ((trangThaiTruocId != motCuaDienBienHoSo.getTrangThaiTruocId())) {
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

			query.append(_SQL_SELECT_MOTCUADIENBIENHOSO_WHERE);

			query.append(_FINDER_COLUMN_TRANGTHAITRUOCID_TRANGTHAITRUOCID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MotCuaDienBienHoSoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(trangThaiTruocId);

				if (!pagination) {
					list = (List<MotCuaDienBienHoSo>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaDienBienHoSo>(list);
				}
				else {
					list = (List<MotCuaDienBienHoSo>)QueryUtil.list(q,
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
	 * Returns the first mot cua dien bien ho so in the ordered set where trangThaiTruocId = &#63;.
	 *
	 * @param trangThaiTruocId the trang thai truoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua dien bien ho so
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException if a matching mot cua dien bien ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDienBienHoSo findByTrangThaiTruocId_First(
		long trangThaiTruocId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaDienBienHoSoException, SystemException {
		MotCuaDienBienHoSo motCuaDienBienHoSo = fetchByTrangThaiTruocId_First(trangThaiTruocId,
				orderByComparator);

		if (motCuaDienBienHoSo != null) {
			return motCuaDienBienHoSo;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("trangThaiTruocId=");
		msg.append(trangThaiTruocId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaDienBienHoSoException(msg.toString());
	}

	/**
	 * Returns the first mot cua dien bien ho so in the ordered set where trangThaiTruocId = &#63;.
	 *
	 * @param trangThaiTruocId the trang thai truoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua dien bien ho so, or <code>null</code> if a matching mot cua dien bien ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDienBienHoSo fetchByTrangThaiTruocId_First(
		long trangThaiTruocId, OrderByComparator orderByComparator)
		throws SystemException {
		List<MotCuaDienBienHoSo> list = findByTrangThaiTruocId(trangThaiTruocId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mot cua dien bien ho so in the ordered set where trangThaiTruocId = &#63;.
	 *
	 * @param trangThaiTruocId the trang thai truoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua dien bien ho so
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException if a matching mot cua dien bien ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDienBienHoSo findByTrangThaiTruocId_Last(
		long trangThaiTruocId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaDienBienHoSoException, SystemException {
		MotCuaDienBienHoSo motCuaDienBienHoSo = fetchByTrangThaiTruocId_Last(trangThaiTruocId,
				orderByComparator);

		if (motCuaDienBienHoSo != null) {
			return motCuaDienBienHoSo;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("trangThaiTruocId=");
		msg.append(trangThaiTruocId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaDienBienHoSoException(msg.toString());
	}

	/**
	 * Returns the last mot cua dien bien ho so in the ordered set where trangThaiTruocId = &#63;.
	 *
	 * @param trangThaiTruocId the trang thai truoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua dien bien ho so, or <code>null</code> if a matching mot cua dien bien ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDienBienHoSo fetchByTrangThaiTruocId_Last(
		long trangThaiTruocId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByTrangThaiTruocId(trangThaiTruocId);

		if (count == 0) {
			return null;
		}

		List<MotCuaDienBienHoSo> list = findByTrangThaiTruocId(trangThaiTruocId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mot cua dien bien ho sos before and after the current mot cua dien bien ho so in the ordered set where trangThaiTruocId = &#63;.
	 *
	 * @param id the primary key of the current mot cua dien bien ho so
	 * @param trangThaiTruocId the trang thai truoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mot cua dien bien ho so
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException if a mot cua dien bien ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDienBienHoSo[] findByTrangThaiTruocId_PrevAndNext(long id,
		long trangThaiTruocId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaDienBienHoSoException, SystemException {
		MotCuaDienBienHoSo motCuaDienBienHoSo = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			MotCuaDienBienHoSo[] array = new MotCuaDienBienHoSoImpl[3];

			array[0] = getByTrangThaiTruocId_PrevAndNext(session,
					motCuaDienBienHoSo, trangThaiTruocId, orderByComparator,
					true);

			array[1] = motCuaDienBienHoSo;

			array[2] = getByTrangThaiTruocId_PrevAndNext(session,
					motCuaDienBienHoSo, trangThaiTruocId, orderByComparator,
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

	protected MotCuaDienBienHoSo getByTrangThaiTruocId_PrevAndNext(
		Session session, MotCuaDienBienHoSo motCuaDienBienHoSo,
		long trangThaiTruocId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MOTCUADIENBIENHOSO_WHERE);

		query.append(_FINDER_COLUMN_TRANGTHAITRUOCID_TRANGTHAITRUOCID_2);

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
			query.append(MotCuaDienBienHoSoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(trangThaiTruocId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(motCuaDienBienHoSo);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MotCuaDienBienHoSo> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mot cua dien bien ho sos where trangThaiTruocId = &#63; from the database.
	 *
	 * @param trangThaiTruocId the trang thai truoc ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTrangThaiTruocId(long trangThaiTruocId)
		throws SystemException {
		for (MotCuaDienBienHoSo motCuaDienBienHoSo : findByTrangThaiTruocId(
				trangThaiTruocId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(motCuaDienBienHoSo);
		}
	}

	/**
	 * Returns the number of mot cua dien bien ho sos where trangThaiTruocId = &#63;.
	 *
	 * @param trangThaiTruocId the trang thai truoc ID
	 * @return the number of matching mot cua dien bien ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTrangThaiTruocId(long trangThaiTruocId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TRANGTHAITRUOCID;

		Object[] finderArgs = new Object[] { trangThaiTruocId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MOTCUADIENBIENHOSO_WHERE);

			query.append(_FINDER_COLUMN_TRANGTHAITRUOCID_TRANGTHAITRUOCID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(trangThaiTruocId);

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

	private static final String _FINDER_COLUMN_TRANGTHAITRUOCID_TRANGTHAITRUOCID_2 =
		"motCuaDienBienHoSo.trangThaiTruocId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TRANGTHAISAUID =
		new FinderPath(MotCuaDienBienHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaDienBienHoSoModelImpl.FINDER_CACHE_ENABLED,
			MotCuaDienBienHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTrangThaiSauId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRANGTHAISAUID =
		new FinderPath(MotCuaDienBienHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaDienBienHoSoModelImpl.FINDER_CACHE_ENABLED,
			MotCuaDienBienHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTrangThaiSauId",
			new String[] { Long.class.getName() },
			MotCuaDienBienHoSoModelImpl.TRANGTHAISAUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TRANGTHAISAUID = new FinderPath(MotCuaDienBienHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaDienBienHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTrangThaiSauId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the mot cua dien bien ho sos where trangThaiSauId = &#63;.
	 *
	 * @param trangThaiSauId the trang thai sau ID
	 * @return the matching mot cua dien bien ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaDienBienHoSo> findByTrangThaiSauId(long trangThaiSauId)
		throws SystemException {
		return findByTrangThaiSauId(trangThaiSauId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua dien bien ho sos where trangThaiSauId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param trangThaiSauId the trang thai sau ID
	 * @param start the lower bound of the range of mot cua dien bien ho sos
	 * @param end the upper bound of the range of mot cua dien bien ho sos (not inclusive)
	 * @return the range of matching mot cua dien bien ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaDienBienHoSo> findByTrangThaiSauId(long trangThaiSauId,
		int start, int end) throws SystemException {
		return findByTrangThaiSauId(trangThaiSauId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua dien bien ho sos where trangThaiSauId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param trangThaiSauId the trang thai sau ID
	 * @param start the lower bound of the range of mot cua dien bien ho sos
	 * @param end the upper bound of the range of mot cua dien bien ho sos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mot cua dien bien ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaDienBienHoSo> findByTrangThaiSauId(long trangThaiSauId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRANGTHAISAUID;
			finderArgs = new Object[] { trangThaiSauId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TRANGTHAISAUID;
			finderArgs = new Object[] {
					trangThaiSauId,
					
					start, end, orderByComparator
				};
		}

		List<MotCuaDienBienHoSo> list = (List<MotCuaDienBienHoSo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MotCuaDienBienHoSo motCuaDienBienHoSo : list) {
				if ((trangThaiSauId != motCuaDienBienHoSo.getTrangThaiSauId())) {
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

			query.append(_SQL_SELECT_MOTCUADIENBIENHOSO_WHERE);

			query.append(_FINDER_COLUMN_TRANGTHAISAUID_TRANGTHAISAUID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MotCuaDienBienHoSoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(trangThaiSauId);

				if (!pagination) {
					list = (List<MotCuaDienBienHoSo>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaDienBienHoSo>(list);
				}
				else {
					list = (List<MotCuaDienBienHoSo>)QueryUtil.list(q,
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
	 * Returns the first mot cua dien bien ho so in the ordered set where trangThaiSauId = &#63;.
	 *
	 * @param trangThaiSauId the trang thai sau ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua dien bien ho so
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException if a matching mot cua dien bien ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDienBienHoSo findByTrangThaiSauId_First(long trangThaiSauId,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaDienBienHoSoException, SystemException {
		MotCuaDienBienHoSo motCuaDienBienHoSo = fetchByTrangThaiSauId_First(trangThaiSauId,
				orderByComparator);

		if (motCuaDienBienHoSo != null) {
			return motCuaDienBienHoSo;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("trangThaiSauId=");
		msg.append(trangThaiSauId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaDienBienHoSoException(msg.toString());
	}

	/**
	 * Returns the first mot cua dien bien ho so in the ordered set where trangThaiSauId = &#63;.
	 *
	 * @param trangThaiSauId the trang thai sau ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua dien bien ho so, or <code>null</code> if a matching mot cua dien bien ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDienBienHoSo fetchByTrangThaiSauId_First(long trangThaiSauId,
		OrderByComparator orderByComparator) throws SystemException {
		List<MotCuaDienBienHoSo> list = findByTrangThaiSauId(trangThaiSauId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mot cua dien bien ho so in the ordered set where trangThaiSauId = &#63;.
	 *
	 * @param trangThaiSauId the trang thai sau ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua dien bien ho so
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException if a matching mot cua dien bien ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDienBienHoSo findByTrangThaiSauId_Last(long trangThaiSauId,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaDienBienHoSoException, SystemException {
		MotCuaDienBienHoSo motCuaDienBienHoSo = fetchByTrangThaiSauId_Last(trangThaiSauId,
				orderByComparator);

		if (motCuaDienBienHoSo != null) {
			return motCuaDienBienHoSo;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("trangThaiSauId=");
		msg.append(trangThaiSauId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaDienBienHoSoException(msg.toString());
	}

	/**
	 * Returns the last mot cua dien bien ho so in the ordered set where trangThaiSauId = &#63;.
	 *
	 * @param trangThaiSauId the trang thai sau ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua dien bien ho so, or <code>null</code> if a matching mot cua dien bien ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDienBienHoSo fetchByTrangThaiSauId_Last(long trangThaiSauId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByTrangThaiSauId(trangThaiSauId);

		if (count == 0) {
			return null;
		}

		List<MotCuaDienBienHoSo> list = findByTrangThaiSauId(trangThaiSauId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mot cua dien bien ho sos before and after the current mot cua dien bien ho so in the ordered set where trangThaiSauId = &#63;.
	 *
	 * @param id the primary key of the current mot cua dien bien ho so
	 * @param trangThaiSauId the trang thai sau ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mot cua dien bien ho so
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException if a mot cua dien bien ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDienBienHoSo[] findByTrangThaiSauId_PrevAndNext(long id,
		long trangThaiSauId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaDienBienHoSoException, SystemException {
		MotCuaDienBienHoSo motCuaDienBienHoSo = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			MotCuaDienBienHoSo[] array = new MotCuaDienBienHoSoImpl[3];

			array[0] = getByTrangThaiSauId_PrevAndNext(session,
					motCuaDienBienHoSo, trangThaiSauId, orderByComparator, true);

			array[1] = motCuaDienBienHoSo;

			array[2] = getByTrangThaiSauId_PrevAndNext(session,
					motCuaDienBienHoSo, trangThaiSauId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected MotCuaDienBienHoSo getByTrangThaiSauId_PrevAndNext(
		Session session, MotCuaDienBienHoSo motCuaDienBienHoSo,
		long trangThaiSauId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MOTCUADIENBIENHOSO_WHERE);

		query.append(_FINDER_COLUMN_TRANGTHAISAUID_TRANGTHAISAUID_2);

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
			query.append(MotCuaDienBienHoSoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(trangThaiSauId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(motCuaDienBienHoSo);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MotCuaDienBienHoSo> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mot cua dien bien ho sos where trangThaiSauId = &#63; from the database.
	 *
	 * @param trangThaiSauId the trang thai sau ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTrangThaiSauId(long trangThaiSauId)
		throws SystemException {
		for (MotCuaDienBienHoSo motCuaDienBienHoSo : findByTrangThaiSauId(
				trangThaiSauId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(motCuaDienBienHoSo);
		}
	}

	/**
	 * Returns the number of mot cua dien bien ho sos where trangThaiSauId = &#63;.
	 *
	 * @param trangThaiSauId the trang thai sau ID
	 * @return the number of matching mot cua dien bien ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTrangThaiSauId(long trangThaiSauId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TRANGTHAISAUID;

		Object[] finderArgs = new Object[] { trangThaiSauId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MOTCUADIENBIENHOSO_WHERE);

			query.append(_FINDER_COLUMN_TRANGTHAISAUID_TRANGTHAISAUID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(trangThaiSauId);

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

	private static final String _FINDER_COLUMN_TRANGTHAISAUID_TRANGTHAISAUID_2 = "motCuaDienBienHoSo.trangThaiSauId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PHIEUXULYIDTRANGTHAITRUOCID =
		new FinderPath(MotCuaDienBienHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaDienBienHoSoModelImpl.FINDER_CACHE_ENABLED,
			MotCuaDienBienHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByPhieuXuLyIdTrangThaiTruocId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYIDTRANGTHAITRUOCID =
		new FinderPath(MotCuaDienBienHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaDienBienHoSoModelImpl.FINDER_CACHE_ENABLED,
			MotCuaDienBienHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByPhieuXuLyIdTrangThaiTruocId",
			new String[] { Long.class.getName(), Long.class.getName() },
			MotCuaDienBienHoSoModelImpl.PHIEUXULYID_COLUMN_BITMASK |
			MotCuaDienBienHoSoModelImpl.TRANGTHAITRUOCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PHIEUXULYIDTRANGTHAITRUOCID =
		new FinderPath(MotCuaDienBienHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaDienBienHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByPhieuXuLyIdTrangThaiTruocId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the mot cua dien bien ho sos where phieuXuLyId = &#63; and trangThaiTruocId = &#63;.
	 *
	 * @param phieuXuLyId the phieu xu ly ID
	 * @param trangThaiTruocId the trang thai truoc ID
	 * @return the matching mot cua dien bien ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaDienBienHoSo> findByPhieuXuLyIdTrangThaiTruocId(
		long phieuXuLyId, long trangThaiTruocId) throws SystemException {
		return findByPhieuXuLyIdTrangThaiTruocId(phieuXuLyId, trangThaiTruocId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua dien bien ho sos where phieuXuLyId = &#63; and trangThaiTruocId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param phieuXuLyId the phieu xu ly ID
	 * @param trangThaiTruocId the trang thai truoc ID
	 * @param start the lower bound of the range of mot cua dien bien ho sos
	 * @param end the upper bound of the range of mot cua dien bien ho sos (not inclusive)
	 * @return the range of matching mot cua dien bien ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaDienBienHoSo> findByPhieuXuLyIdTrangThaiTruocId(
		long phieuXuLyId, long trangThaiTruocId, int start, int end)
		throws SystemException {
		return findByPhieuXuLyIdTrangThaiTruocId(phieuXuLyId, trangThaiTruocId,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua dien bien ho sos where phieuXuLyId = &#63; and trangThaiTruocId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param phieuXuLyId the phieu xu ly ID
	 * @param trangThaiTruocId the trang thai truoc ID
	 * @param start the lower bound of the range of mot cua dien bien ho sos
	 * @param end the upper bound of the range of mot cua dien bien ho sos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mot cua dien bien ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaDienBienHoSo> findByPhieuXuLyIdTrangThaiTruocId(
		long phieuXuLyId, long trangThaiTruocId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYIDTRANGTHAITRUOCID;
			finderArgs = new Object[] { phieuXuLyId, trangThaiTruocId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PHIEUXULYIDTRANGTHAITRUOCID;
			finderArgs = new Object[] {
					phieuXuLyId, trangThaiTruocId,
					
					start, end, orderByComparator
				};
		}

		List<MotCuaDienBienHoSo> list = (List<MotCuaDienBienHoSo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MotCuaDienBienHoSo motCuaDienBienHoSo : list) {
				if ((phieuXuLyId != motCuaDienBienHoSo.getPhieuXuLyId()) ||
						(trangThaiTruocId != motCuaDienBienHoSo.getTrangThaiTruocId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_MOTCUADIENBIENHOSO_WHERE);

			query.append(_FINDER_COLUMN_PHIEUXULYIDTRANGTHAITRUOCID_PHIEUXULYID_2);

			query.append(_FINDER_COLUMN_PHIEUXULYIDTRANGTHAITRUOCID_TRANGTHAITRUOCID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MotCuaDienBienHoSoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(phieuXuLyId);

				qPos.add(trangThaiTruocId);

				if (!pagination) {
					list = (List<MotCuaDienBienHoSo>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaDienBienHoSo>(list);
				}
				else {
					list = (List<MotCuaDienBienHoSo>)QueryUtil.list(q,
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
	 * Returns the first mot cua dien bien ho so in the ordered set where phieuXuLyId = &#63; and trangThaiTruocId = &#63;.
	 *
	 * @param phieuXuLyId the phieu xu ly ID
	 * @param trangThaiTruocId the trang thai truoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua dien bien ho so
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException if a matching mot cua dien bien ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDienBienHoSo findByPhieuXuLyIdTrangThaiTruocId_First(
		long phieuXuLyId, long trangThaiTruocId,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaDienBienHoSoException, SystemException {
		MotCuaDienBienHoSo motCuaDienBienHoSo = fetchByPhieuXuLyIdTrangThaiTruocId_First(phieuXuLyId,
				trangThaiTruocId, orderByComparator);

		if (motCuaDienBienHoSo != null) {
			return motCuaDienBienHoSo;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("phieuXuLyId=");
		msg.append(phieuXuLyId);

		msg.append(", trangThaiTruocId=");
		msg.append(trangThaiTruocId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaDienBienHoSoException(msg.toString());
	}

	/**
	 * Returns the first mot cua dien bien ho so in the ordered set where phieuXuLyId = &#63; and trangThaiTruocId = &#63;.
	 *
	 * @param phieuXuLyId the phieu xu ly ID
	 * @param trangThaiTruocId the trang thai truoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua dien bien ho so, or <code>null</code> if a matching mot cua dien bien ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDienBienHoSo fetchByPhieuXuLyIdTrangThaiTruocId_First(
		long phieuXuLyId, long trangThaiTruocId,
		OrderByComparator orderByComparator) throws SystemException {
		List<MotCuaDienBienHoSo> list = findByPhieuXuLyIdTrangThaiTruocId(phieuXuLyId,
				trangThaiTruocId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mot cua dien bien ho so in the ordered set where phieuXuLyId = &#63; and trangThaiTruocId = &#63;.
	 *
	 * @param phieuXuLyId the phieu xu ly ID
	 * @param trangThaiTruocId the trang thai truoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua dien bien ho so
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException if a matching mot cua dien bien ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDienBienHoSo findByPhieuXuLyIdTrangThaiTruocId_Last(
		long phieuXuLyId, long trangThaiTruocId,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaDienBienHoSoException, SystemException {
		MotCuaDienBienHoSo motCuaDienBienHoSo = fetchByPhieuXuLyIdTrangThaiTruocId_Last(phieuXuLyId,
				trangThaiTruocId, orderByComparator);

		if (motCuaDienBienHoSo != null) {
			return motCuaDienBienHoSo;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("phieuXuLyId=");
		msg.append(phieuXuLyId);

		msg.append(", trangThaiTruocId=");
		msg.append(trangThaiTruocId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaDienBienHoSoException(msg.toString());
	}

	/**
	 * Returns the last mot cua dien bien ho so in the ordered set where phieuXuLyId = &#63; and trangThaiTruocId = &#63;.
	 *
	 * @param phieuXuLyId the phieu xu ly ID
	 * @param trangThaiTruocId the trang thai truoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua dien bien ho so, or <code>null</code> if a matching mot cua dien bien ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDienBienHoSo fetchByPhieuXuLyIdTrangThaiTruocId_Last(
		long phieuXuLyId, long trangThaiTruocId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByPhieuXuLyIdTrangThaiTruocId(phieuXuLyId,
				trangThaiTruocId);

		if (count == 0) {
			return null;
		}

		List<MotCuaDienBienHoSo> list = findByPhieuXuLyIdTrangThaiTruocId(phieuXuLyId,
				trangThaiTruocId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mot cua dien bien ho sos before and after the current mot cua dien bien ho so in the ordered set where phieuXuLyId = &#63; and trangThaiTruocId = &#63;.
	 *
	 * @param id the primary key of the current mot cua dien bien ho so
	 * @param phieuXuLyId the phieu xu ly ID
	 * @param trangThaiTruocId the trang thai truoc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mot cua dien bien ho so
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException if a mot cua dien bien ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDienBienHoSo[] findByPhieuXuLyIdTrangThaiTruocId_PrevAndNext(
		long id, long phieuXuLyId, long trangThaiTruocId,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaDienBienHoSoException, SystemException {
		MotCuaDienBienHoSo motCuaDienBienHoSo = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			MotCuaDienBienHoSo[] array = new MotCuaDienBienHoSoImpl[3];

			array[0] = getByPhieuXuLyIdTrangThaiTruocId_PrevAndNext(session,
					motCuaDienBienHoSo, phieuXuLyId, trangThaiTruocId,
					orderByComparator, true);

			array[1] = motCuaDienBienHoSo;

			array[2] = getByPhieuXuLyIdTrangThaiTruocId_PrevAndNext(session,
					motCuaDienBienHoSo, phieuXuLyId, trangThaiTruocId,
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

	protected MotCuaDienBienHoSo getByPhieuXuLyIdTrangThaiTruocId_PrevAndNext(
		Session session, MotCuaDienBienHoSo motCuaDienBienHoSo,
		long phieuXuLyId, long trangThaiTruocId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MOTCUADIENBIENHOSO_WHERE);

		query.append(_FINDER_COLUMN_PHIEUXULYIDTRANGTHAITRUOCID_PHIEUXULYID_2);

		query.append(_FINDER_COLUMN_PHIEUXULYIDTRANGTHAITRUOCID_TRANGTHAITRUOCID_2);

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
			query.append(MotCuaDienBienHoSoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(phieuXuLyId);

		qPos.add(trangThaiTruocId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(motCuaDienBienHoSo);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MotCuaDienBienHoSo> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mot cua dien bien ho sos where phieuXuLyId = &#63; and trangThaiTruocId = &#63; from the database.
	 *
	 * @param phieuXuLyId the phieu xu ly ID
	 * @param trangThaiTruocId the trang thai truoc ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPhieuXuLyIdTrangThaiTruocId(long phieuXuLyId,
		long trangThaiTruocId) throws SystemException {
		for (MotCuaDienBienHoSo motCuaDienBienHoSo : findByPhieuXuLyIdTrangThaiTruocId(
				phieuXuLyId, trangThaiTruocId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(motCuaDienBienHoSo);
		}
	}

	/**
	 * Returns the number of mot cua dien bien ho sos where phieuXuLyId = &#63; and trangThaiTruocId = &#63;.
	 *
	 * @param phieuXuLyId the phieu xu ly ID
	 * @param trangThaiTruocId the trang thai truoc ID
	 * @return the number of matching mot cua dien bien ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPhieuXuLyIdTrangThaiTruocId(long phieuXuLyId,
		long trangThaiTruocId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PHIEUXULYIDTRANGTHAITRUOCID;

		Object[] finderArgs = new Object[] { phieuXuLyId, trangThaiTruocId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_MOTCUADIENBIENHOSO_WHERE);

			query.append(_FINDER_COLUMN_PHIEUXULYIDTRANGTHAITRUOCID_PHIEUXULYID_2);

			query.append(_FINDER_COLUMN_PHIEUXULYIDTRANGTHAITRUOCID_TRANGTHAITRUOCID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(phieuXuLyId);

				qPos.add(trangThaiTruocId);

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

	private static final String _FINDER_COLUMN_PHIEUXULYIDTRANGTHAITRUOCID_PHIEUXULYID_2 =
		"motCuaDienBienHoSo.phieuXuLyId = ? AND ";
	private static final String _FINDER_COLUMN_PHIEUXULYIDTRANGTHAITRUOCID_TRANGTHAITRUOCID_2 =
		"motCuaDienBienHoSo.trangThaiTruocId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PHIEUXULYIDTRANGTHAISAUID =
		new FinderPath(MotCuaDienBienHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaDienBienHoSoModelImpl.FINDER_CACHE_ENABLED,
			MotCuaDienBienHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByPhieuXuLyIdTrangThaiSauId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYIDTRANGTHAISAUID =
		new FinderPath(MotCuaDienBienHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaDienBienHoSoModelImpl.FINDER_CACHE_ENABLED,
			MotCuaDienBienHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByPhieuXuLyIdTrangThaiSauId",
			new String[] { Long.class.getName(), Long.class.getName() },
			MotCuaDienBienHoSoModelImpl.PHIEUXULYID_COLUMN_BITMASK |
			MotCuaDienBienHoSoModelImpl.TRANGTHAISAUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PHIEUXULYIDTRANGTHAISAUID =
		new FinderPath(MotCuaDienBienHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaDienBienHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByPhieuXuLyIdTrangThaiSauId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the mot cua dien bien ho sos where phieuXuLyId = &#63; and trangThaiSauId = &#63;.
	 *
	 * @param phieuXuLyId the phieu xu ly ID
	 * @param trangThaiSauId the trang thai sau ID
	 * @return the matching mot cua dien bien ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaDienBienHoSo> findByPhieuXuLyIdTrangThaiSauId(
		long phieuXuLyId, long trangThaiSauId) throws SystemException {
		return findByPhieuXuLyIdTrangThaiSauId(phieuXuLyId, trangThaiSauId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua dien bien ho sos where phieuXuLyId = &#63; and trangThaiSauId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param phieuXuLyId the phieu xu ly ID
	 * @param trangThaiSauId the trang thai sau ID
	 * @param start the lower bound of the range of mot cua dien bien ho sos
	 * @param end the upper bound of the range of mot cua dien bien ho sos (not inclusive)
	 * @return the range of matching mot cua dien bien ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaDienBienHoSo> findByPhieuXuLyIdTrangThaiSauId(
		long phieuXuLyId, long trangThaiSauId, int start, int end)
		throws SystemException {
		return findByPhieuXuLyIdTrangThaiSauId(phieuXuLyId, trangThaiSauId,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua dien bien ho sos where phieuXuLyId = &#63; and trangThaiSauId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param phieuXuLyId the phieu xu ly ID
	 * @param trangThaiSauId the trang thai sau ID
	 * @param start the lower bound of the range of mot cua dien bien ho sos
	 * @param end the upper bound of the range of mot cua dien bien ho sos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mot cua dien bien ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaDienBienHoSo> findByPhieuXuLyIdTrangThaiSauId(
		long phieuXuLyId, long trangThaiSauId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYIDTRANGTHAISAUID;
			finderArgs = new Object[] { phieuXuLyId, trangThaiSauId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PHIEUXULYIDTRANGTHAISAUID;
			finderArgs = new Object[] {
					phieuXuLyId, trangThaiSauId,
					
					start, end, orderByComparator
				};
		}

		List<MotCuaDienBienHoSo> list = (List<MotCuaDienBienHoSo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MotCuaDienBienHoSo motCuaDienBienHoSo : list) {
				if ((phieuXuLyId != motCuaDienBienHoSo.getPhieuXuLyId()) ||
						(trangThaiSauId != motCuaDienBienHoSo.getTrangThaiSauId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_MOTCUADIENBIENHOSO_WHERE);

			query.append(_FINDER_COLUMN_PHIEUXULYIDTRANGTHAISAUID_PHIEUXULYID_2);

			query.append(_FINDER_COLUMN_PHIEUXULYIDTRANGTHAISAUID_TRANGTHAISAUID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MotCuaDienBienHoSoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(phieuXuLyId);

				qPos.add(trangThaiSauId);

				if (!pagination) {
					list = (List<MotCuaDienBienHoSo>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaDienBienHoSo>(list);
				}
				else {
					list = (List<MotCuaDienBienHoSo>)QueryUtil.list(q,
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
	 * Returns the first mot cua dien bien ho so in the ordered set where phieuXuLyId = &#63; and trangThaiSauId = &#63;.
	 *
	 * @param phieuXuLyId the phieu xu ly ID
	 * @param trangThaiSauId the trang thai sau ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua dien bien ho so
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException if a matching mot cua dien bien ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDienBienHoSo findByPhieuXuLyIdTrangThaiSauId_First(
		long phieuXuLyId, long trangThaiSauId,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaDienBienHoSoException, SystemException {
		MotCuaDienBienHoSo motCuaDienBienHoSo = fetchByPhieuXuLyIdTrangThaiSauId_First(phieuXuLyId,
				trangThaiSauId, orderByComparator);

		if (motCuaDienBienHoSo != null) {
			return motCuaDienBienHoSo;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("phieuXuLyId=");
		msg.append(phieuXuLyId);

		msg.append(", trangThaiSauId=");
		msg.append(trangThaiSauId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaDienBienHoSoException(msg.toString());
	}

	/**
	 * Returns the first mot cua dien bien ho so in the ordered set where phieuXuLyId = &#63; and trangThaiSauId = &#63;.
	 *
	 * @param phieuXuLyId the phieu xu ly ID
	 * @param trangThaiSauId the trang thai sau ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua dien bien ho so, or <code>null</code> if a matching mot cua dien bien ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDienBienHoSo fetchByPhieuXuLyIdTrangThaiSauId_First(
		long phieuXuLyId, long trangThaiSauId,
		OrderByComparator orderByComparator) throws SystemException {
		List<MotCuaDienBienHoSo> list = findByPhieuXuLyIdTrangThaiSauId(phieuXuLyId,
				trangThaiSauId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mot cua dien bien ho so in the ordered set where phieuXuLyId = &#63; and trangThaiSauId = &#63;.
	 *
	 * @param phieuXuLyId the phieu xu ly ID
	 * @param trangThaiSauId the trang thai sau ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua dien bien ho so
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException if a matching mot cua dien bien ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDienBienHoSo findByPhieuXuLyIdTrangThaiSauId_Last(
		long phieuXuLyId, long trangThaiSauId,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaDienBienHoSoException, SystemException {
		MotCuaDienBienHoSo motCuaDienBienHoSo = fetchByPhieuXuLyIdTrangThaiSauId_Last(phieuXuLyId,
				trangThaiSauId, orderByComparator);

		if (motCuaDienBienHoSo != null) {
			return motCuaDienBienHoSo;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("phieuXuLyId=");
		msg.append(phieuXuLyId);

		msg.append(", trangThaiSauId=");
		msg.append(trangThaiSauId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaDienBienHoSoException(msg.toString());
	}

	/**
	 * Returns the last mot cua dien bien ho so in the ordered set where phieuXuLyId = &#63; and trangThaiSauId = &#63;.
	 *
	 * @param phieuXuLyId the phieu xu ly ID
	 * @param trangThaiSauId the trang thai sau ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua dien bien ho so, or <code>null</code> if a matching mot cua dien bien ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDienBienHoSo fetchByPhieuXuLyIdTrangThaiSauId_Last(
		long phieuXuLyId, long trangThaiSauId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByPhieuXuLyIdTrangThaiSauId(phieuXuLyId, trangThaiSauId);

		if (count == 0) {
			return null;
		}

		List<MotCuaDienBienHoSo> list = findByPhieuXuLyIdTrangThaiSauId(phieuXuLyId,
				trangThaiSauId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mot cua dien bien ho sos before and after the current mot cua dien bien ho so in the ordered set where phieuXuLyId = &#63; and trangThaiSauId = &#63;.
	 *
	 * @param id the primary key of the current mot cua dien bien ho so
	 * @param phieuXuLyId the phieu xu ly ID
	 * @param trangThaiSauId the trang thai sau ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mot cua dien bien ho so
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException if a mot cua dien bien ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDienBienHoSo[] findByPhieuXuLyIdTrangThaiSauId_PrevAndNext(
		long id, long phieuXuLyId, long trangThaiSauId,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaDienBienHoSoException, SystemException {
		MotCuaDienBienHoSo motCuaDienBienHoSo = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			MotCuaDienBienHoSo[] array = new MotCuaDienBienHoSoImpl[3];

			array[0] = getByPhieuXuLyIdTrangThaiSauId_PrevAndNext(session,
					motCuaDienBienHoSo, phieuXuLyId, trangThaiSauId,
					orderByComparator, true);

			array[1] = motCuaDienBienHoSo;

			array[2] = getByPhieuXuLyIdTrangThaiSauId_PrevAndNext(session,
					motCuaDienBienHoSo, phieuXuLyId, trangThaiSauId,
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

	protected MotCuaDienBienHoSo getByPhieuXuLyIdTrangThaiSauId_PrevAndNext(
		Session session, MotCuaDienBienHoSo motCuaDienBienHoSo,
		long phieuXuLyId, long trangThaiSauId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MOTCUADIENBIENHOSO_WHERE);

		query.append(_FINDER_COLUMN_PHIEUXULYIDTRANGTHAISAUID_PHIEUXULYID_2);

		query.append(_FINDER_COLUMN_PHIEUXULYIDTRANGTHAISAUID_TRANGTHAISAUID_2);

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
			query.append(MotCuaDienBienHoSoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(phieuXuLyId);

		qPos.add(trangThaiSauId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(motCuaDienBienHoSo);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MotCuaDienBienHoSo> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mot cua dien bien ho sos where phieuXuLyId = &#63; and trangThaiSauId = &#63; from the database.
	 *
	 * @param phieuXuLyId the phieu xu ly ID
	 * @param trangThaiSauId the trang thai sau ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPhieuXuLyIdTrangThaiSauId(long phieuXuLyId,
		long trangThaiSauId) throws SystemException {
		for (MotCuaDienBienHoSo motCuaDienBienHoSo : findByPhieuXuLyIdTrangThaiSauId(
				phieuXuLyId, trangThaiSauId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(motCuaDienBienHoSo);
		}
	}

	/**
	 * Returns the number of mot cua dien bien ho sos where phieuXuLyId = &#63; and trangThaiSauId = &#63;.
	 *
	 * @param phieuXuLyId the phieu xu ly ID
	 * @param trangThaiSauId the trang thai sau ID
	 * @return the number of matching mot cua dien bien ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPhieuXuLyIdTrangThaiSauId(long phieuXuLyId,
		long trangThaiSauId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PHIEUXULYIDTRANGTHAISAUID;

		Object[] finderArgs = new Object[] { phieuXuLyId, trangThaiSauId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_MOTCUADIENBIENHOSO_WHERE);

			query.append(_FINDER_COLUMN_PHIEUXULYIDTRANGTHAISAUID_PHIEUXULYID_2);

			query.append(_FINDER_COLUMN_PHIEUXULYIDTRANGTHAISAUID_TRANGTHAISAUID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(phieuXuLyId);

				qPos.add(trangThaiSauId);

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

	private static final String _FINDER_COLUMN_PHIEUXULYIDTRANGTHAISAUID_PHIEUXULYID_2 =
		"motCuaDienBienHoSo.phieuXuLyId = ? AND ";
	private static final String _FINDER_COLUMN_PHIEUXULYIDTRANGTHAISAUID_TRANGTHAISAUID_2 =
		"motCuaDienBienHoSo.trangThaiSauId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PHIEUXULYID =
		new FinderPath(MotCuaDienBienHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaDienBienHoSoModelImpl.FINDER_CACHE_ENABLED,
			MotCuaDienBienHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByphieuXuLyId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYID =
		new FinderPath(MotCuaDienBienHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaDienBienHoSoModelImpl.FINDER_CACHE_ENABLED,
			MotCuaDienBienHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByphieuXuLyId",
			new String[] { Long.class.getName() },
			MotCuaDienBienHoSoModelImpl.PHIEUXULYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PHIEUXULYID = new FinderPath(MotCuaDienBienHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaDienBienHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByphieuXuLyId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the mot cua dien bien ho sos where phieuXuLyId = &#63;.
	 *
	 * @param phieuXuLyId the phieu xu ly ID
	 * @return the matching mot cua dien bien ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaDienBienHoSo> findByphieuXuLyId(long phieuXuLyId)
		throws SystemException {
		return findByphieuXuLyId(phieuXuLyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua dien bien ho sos where phieuXuLyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param phieuXuLyId the phieu xu ly ID
	 * @param start the lower bound of the range of mot cua dien bien ho sos
	 * @param end the upper bound of the range of mot cua dien bien ho sos (not inclusive)
	 * @return the range of matching mot cua dien bien ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaDienBienHoSo> findByphieuXuLyId(long phieuXuLyId,
		int start, int end) throws SystemException {
		return findByphieuXuLyId(phieuXuLyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua dien bien ho sos where phieuXuLyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param phieuXuLyId the phieu xu ly ID
	 * @param start the lower bound of the range of mot cua dien bien ho sos
	 * @param end the upper bound of the range of mot cua dien bien ho sos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mot cua dien bien ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaDienBienHoSo> findByphieuXuLyId(long phieuXuLyId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYID;
			finderArgs = new Object[] { phieuXuLyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PHIEUXULYID;
			finderArgs = new Object[] { phieuXuLyId, start, end, orderByComparator };
		}

		List<MotCuaDienBienHoSo> list = (List<MotCuaDienBienHoSo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MotCuaDienBienHoSo motCuaDienBienHoSo : list) {
				if ((phieuXuLyId != motCuaDienBienHoSo.getPhieuXuLyId())) {
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

			query.append(_SQL_SELECT_MOTCUADIENBIENHOSO_WHERE);

			query.append(_FINDER_COLUMN_PHIEUXULYID_PHIEUXULYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MotCuaDienBienHoSoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(phieuXuLyId);

				if (!pagination) {
					list = (List<MotCuaDienBienHoSo>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaDienBienHoSo>(list);
				}
				else {
					list = (List<MotCuaDienBienHoSo>)QueryUtil.list(q,
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
	 * Returns the first mot cua dien bien ho so in the ordered set where phieuXuLyId = &#63;.
	 *
	 * @param phieuXuLyId the phieu xu ly ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua dien bien ho so
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException if a matching mot cua dien bien ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDienBienHoSo findByphieuXuLyId_First(long phieuXuLyId,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaDienBienHoSoException, SystemException {
		MotCuaDienBienHoSo motCuaDienBienHoSo = fetchByphieuXuLyId_First(phieuXuLyId,
				orderByComparator);

		if (motCuaDienBienHoSo != null) {
			return motCuaDienBienHoSo;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("phieuXuLyId=");
		msg.append(phieuXuLyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaDienBienHoSoException(msg.toString());
	}

	/**
	 * Returns the first mot cua dien bien ho so in the ordered set where phieuXuLyId = &#63;.
	 *
	 * @param phieuXuLyId the phieu xu ly ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua dien bien ho so, or <code>null</code> if a matching mot cua dien bien ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDienBienHoSo fetchByphieuXuLyId_First(long phieuXuLyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<MotCuaDienBienHoSo> list = findByphieuXuLyId(phieuXuLyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mot cua dien bien ho so in the ordered set where phieuXuLyId = &#63;.
	 *
	 * @param phieuXuLyId the phieu xu ly ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua dien bien ho so
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException if a matching mot cua dien bien ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDienBienHoSo findByphieuXuLyId_Last(long phieuXuLyId,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaDienBienHoSoException, SystemException {
		MotCuaDienBienHoSo motCuaDienBienHoSo = fetchByphieuXuLyId_Last(phieuXuLyId,
				orderByComparator);

		if (motCuaDienBienHoSo != null) {
			return motCuaDienBienHoSo;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("phieuXuLyId=");
		msg.append(phieuXuLyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaDienBienHoSoException(msg.toString());
	}

	/**
	 * Returns the last mot cua dien bien ho so in the ordered set where phieuXuLyId = &#63;.
	 *
	 * @param phieuXuLyId the phieu xu ly ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua dien bien ho so, or <code>null</code> if a matching mot cua dien bien ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDienBienHoSo fetchByphieuXuLyId_Last(long phieuXuLyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByphieuXuLyId(phieuXuLyId);

		if (count == 0) {
			return null;
		}

		List<MotCuaDienBienHoSo> list = findByphieuXuLyId(phieuXuLyId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mot cua dien bien ho sos before and after the current mot cua dien bien ho so in the ordered set where phieuXuLyId = &#63;.
	 *
	 * @param id the primary key of the current mot cua dien bien ho so
	 * @param phieuXuLyId the phieu xu ly ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mot cua dien bien ho so
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException if a mot cua dien bien ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDienBienHoSo[] findByphieuXuLyId_PrevAndNext(long id,
		long phieuXuLyId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaDienBienHoSoException, SystemException {
		MotCuaDienBienHoSo motCuaDienBienHoSo = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			MotCuaDienBienHoSo[] array = new MotCuaDienBienHoSoImpl[3];

			array[0] = getByphieuXuLyId_PrevAndNext(session,
					motCuaDienBienHoSo, phieuXuLyId, orderByComparator, true);

			array[1] = motCuaDienBienHoSo;

			array[2] = getByphieuXuLyId_PrevAndNext(session,
					motCuaDienBienHoSo, phieuXuLyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected MotCuaDienBienHoSo getByphieuXuLyId_PrevAndNext(Session session,
		MotCuaDienBienHoSo motCuaDienBienHoSo, long phieuXuLyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MOTCUADIENBIENHOSO_WHERE);

		query.append(_FINDER_COLUMN_PHIEUXULYID_PHIEUXULYID_2);

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
			query.append(MotCuaDienBienHoSoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(phieuXuLyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(motCuaDienBienHoSo);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MotCuaDienBienHoSo> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mot cua dien bien ho sos where phieuXuLyId = &#63; from the database.
	 *
	 * @param phieuXuLyId the phieu xu ly ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByphieuXuLyId(long phieuXuLyId) throws SystemException {
		for (MotCuaDienBienHoSo motCuaDienBienHoSo : findByphieuXuLyId(
				phieuXuLyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(motCuaDienBienHoSo);
		}
	}

	/**
	 * Returns the number of mot cua dien bien ho sos where phieuXuLyId = &#63;.
	 *
	 * @param phieuXuLyId the phieu xu ly ID
	 * @return the number of matching mot cua dien bien ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByphieuXuLyId(long phieuXuLyId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PHIEUXULYID;

		Object[] finderArgs = new Object[] { phieuXuLyId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MOTCUADIENBIENHOSO_WHERE);

			query.append(_FINDER_COLUMN_PHIEUXULYID_PHIEUXULYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(phieuXuLyId);

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

	private static final String _FINDER_COLUMN_PHIEUXULYID_PHIEUXULYID_2 = "motCuaDienBienHoSo.phieuXuLyId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDTRANGTHAITRUOCIDANDTRANGTHAISAUID =
		new FinderPath(MotCuaDienBienHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaDienBienHoSoModelImpl.FINDER_CACHE_ENABLED,
			MotCuaDienBienHoSoImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByhoSoThuTucIdAndTrangThaiTruocIdAndTrangThaiSauId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			MotCuaDienBienHoSoModelImpl.HOSOTHUTUCID_COLUMN_BITMASK |
			MotCuaDienBienHoSoModelImpl.TRANGTHAITRUOCID_COLUMN_BITMASK |
			MotCuaDienBienHoSoModelImpl.TRANGTHAISAUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDTRANGTHAITRUOCIDANDTRANGTHAISAUID =
		new FinderPath(MotCuaDienBienHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaDienBienHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByhoSoThuTucIdAndTrangThaiTruocIdAndTrangThaiSauId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

	/**
	 * Returns the mot cua dien bien ho so where hoSoThuTucId = &#63; and trangThaiTruocId = &#63; and trangThaiSauId = &#63; or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException} if it could not be found.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param trangThaiTruocId the trang thai truoc ID
	 * @param trangThaiSauId the trang thai sau ID
	 * @return the matching mot cua dien bien ho so
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException if a matching mot cua dien bien ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDienBienHoSo findByhoSoThuTucIdAndTrangThaiTruocIdAndTrangThaiSauId(
		long hoSoThuTucId, long trangThaiTruocId, long trangThaiSauId)
		throws NoSuchMotCuaDienBienHoSoException, SystemException {
		MotCuaDienBienHoSo motCuaDienBienHoSo = fetchByhoSoThuTucIdAndTrangThaiTruocIdAndTrangThaiSauId(hoSoThuTucId,
				trangThaiTruocId, trangThaiSauId);

		if (motCuaDienBienHoSo == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("hoSoThuTucId=");
			msg.append(hoSoThuTucId);

			msg.append(", trangThaiTruocId=");
			msg.append(trangThaiTruocId);

			msg.append(", trangThaiSauId=");
			msg.append(trangThaiSauId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchMotCuaDienBienHoSoException(msg.toString());
		}

		return motCuaDienBienHoSo;
	}

	/**
	 * Returns the mot cua dien bien ho so where hoSoThuTucId = &#63; and trangThaiTruocId = &#63; and trangThaiSauId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param trangThaiTruocId the trang thai truoc ID
	 * @param trangThaiSauId the trang thai sau ID
	 * @return the matching mot cua dien bien ho so, or <code>null</code> if a matching mot cua dien bien ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDienBienHoSo fetchByhoSoThuTucIdAndTrangThaiTruocIdAndTrangThaiSauId(
		long hoSoThuTucId, long trangThaiTruocId, long trangThaiSauId)
		throws SystemException {
		return fetchByhoSoThuTucIdAndTrangThaiTruocIdAndTrangThaiSauId(hoSoThuTucId,
			trangThaiTruocId, trangThaiSauId, true);
	}

	/**
	 * Returns the mot cua dien bien ho so where hoSoThuTucId = &#63; and trangThaiTruocId = &#63; and trangThaiSauId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param trangThaiTruocId the trang thai truoc ID
	 * @param trangThaiSauId the trang thai sau ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching mot cua dien bien ho so, or <code>null</code> if a matching mot cua dien bien ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDienBienHoSo fetchByhoSoThuTucIdAndTrangThaiTruocIdAndTrangThaiSauId(
		long hoSoThuTucId, long trangThaiTruocId, long trangThaiSauId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] {
				hoSoThuTucId, trangThaiTruocId, trangThaiSauId
			};

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDTRANGTHAITRUOCIDANDTRANGTHAISAUID,
					finderArgs, this);
		}

		if (result instanceof MotCuaDienBienHoSo) {
			MotCuaDienBienHoSo motCuaDienBienHoSo = (MotCuaDienBienHoSo)result;

			if ((hoSoThuTucId != motCuaDienBienHoSo.getHoSoThuTucId()) ||
					(trangThaiTruocId != motCuaDienBienHoSo.getTrangThaiTruocId()) ||
					(trangThaiSauId != motCuaDienBienHoSo.getTrangThaiSauId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_MOTCUADIENBIENHOSO_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCIDANDTRANGTHAITRUOCIDANDTRANGTHAISAUID_HOSOTHUTUCID_2);

			query.append(_FINDER_COLUMN_HOSOTHUTUCIDANDTRANGTHAITRUOCIDANDTRANGTHAISAUID_TRANGTHAITRUOCID_2);

			query.append(_FINDER_COLUMN_HOSOTHUTUCIDANDTRANGTHAITRUOCIDANDTRANGTHAISAUID_TRANGTHAISAUID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				qPos.add(trangThaiTruocId);

				qPos.add(trangThaiSauId);

				List<MotCuaDienBienHoSo> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDTRANGTHAITRUOCIDANDTRANGTHAISAUID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"MotCuaDienBienHoSoPersistenceImpl.fetchByhoSoThuTucIdAndTrangThaiTruocIdAndTrangThaiSauId(long, long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					MotCuaDienBienHoSo motCuaDienBienHoSo = list.get(0);

					result = motCuaDienBienHoSo;

					cacheResult(motCuaDienBienHoSo);

					if ((motCuaDienBienHoSo.getHoSoThuTucId() != hoSoThuTucId) ||
							(motCuaDienBienHoSo.getTrangThaiTruocId() != trangThaiTruocId) ||
							(motCuaDienBienHoSo.getTrangThaiSauId() != trangThaiSauId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDTRANGTHAITRUOCIDANDTRANGTHAISAUID,
							finderArgs, motCuaDienBienHoSo);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDTRANGTHAITRUOCIDANDTRANGTHAISAUID,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (MotCuaDienBienHoSo)result;
		}
	}

	/**
	 * Removes the mot cua dien bien ho so where hoSoThuTucId = &#63; and trangThaiTruocId = &#63; and trangThaiSauId = &#63; from the database.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param trangThaiTruocId the trang thai truoc ID
	 * @param trangThaiSauId the trang thai sau ID
	 * @return the mot cua dien bien ho so that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDienBienHoSo removeByhoSoThuTucIdAndTrangThaiTruocIdAndTrangThaiSauId(
		long hoSoThuTucId, long trangThaiTruocId, long trangThaiSauId)
		throws NoSuchMotCuaDienBienHoSoException, SystemException {
		MotCuaDienBienHoSo motCuaDienBienHoSo = findByhoSoThuTucIdAndTrangThaiTruocIdAndTrangThaiSauId(hoSoThuTucId,
				trangThaiTruocId, trangThaiSauId);

		return remove(motCuaDienBienHoSo);
	}

	/**
	 * Returns the number of mot cua dien bien ho sos where hoSoThuTucId = &#63; and trangThaiTruocId = &#63; and trangThaiSauId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param trangThaiTruocId the trang thai truoc ID
	 * @param trangThaiSauId the trang thai sau ID
	 * @return the number of matching mot cua dien bien ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByhoSoThuTucIdAndTrangThaiTruocIdAndTrangThaiSauId(
		long hoSoThuTucId, long trangThaiTruocId, long trangThaiSauId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDTRANGTHAITRUOCIDANDTRANGTHAISAUID;

		Object[] finderArgs = new Object[] {
				hoSoThuTucId, trangThaiTruocId, trangThaiSauId
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_MOTCUADIENBIENHOSO_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCIDANDTRANGTHAITRUOCIDANDTRANGTHAISAUID_HOSOTHUTUCID_2);

			query.append(_FINDER_COLUMN_HOSOTHUTUCIDANDTRANGTHAITRUOCIDANDTRANGTHAISAUID_TRANGTHAITRUOCID_2);

			query.append(_FINDER_COLUMN_HOSOTHUTUCIDANDTRANGTHAITRUOCIDANDTRANGTHAISAUID_TRANGTHAISAUID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				qPos.add(trangThaiTruocId);

				qPos.add(trangThaiSauId);

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

	private static final String _FINDER_COLUMN_HOSOTHUTUCIDANDTRANGTHAITRUOCIDANDTRANGTHAISAUID_HOSOTHUTUCID_2 =
		"motCuaDienBienHoSo.hoSoThuTucId = ? AND ";
	private static final String _FINDER_COLUMN_HOSOTHUTUCIDANDTRANGTHAITRUOCIDANDTRANGTHAISAUID_TRANGTHAITRUOCID_2 =
		"motCuaDienBienHoSo.trangThaiTruocId = ? AND ";
	private static final String _FINDER_COLUMN_HOSOTHUTUCIDANDTRANGTHAITRUOCIDANDTRANGTHAISAUID_TRANGTHAISAUID_2 =
		"motCuaDienBienHoSo.trangThaiSauId = ?";

	public MotCuaDienBienHoSoPersistenceImpl() {
		setModelClass(MotCuaDienBienHoSo.class);
	}

	/**
	 * Caches the mot cua dien bien ho so in the entity cache if it is enabled.
	 *
	 * @param motCuaDienBienHoSo the mot cua dien bien ho so
	 */
	@Override
	public void cacheResult(MotCuaDienBienHoSo motCuaDienBienHoSo) {
		EntityCacheUtil.putResult(MotCuaDienBienHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaDienBienHoSoImpl.class, motCuaDienBienHoSo.getPrimaryKey(),
			motCuaDienBienHoSo);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDTRANGTHAITRUOCIDANDTRANGTHAISAUID,
			new Object[] {
				motCuaDienBienHoSo.getHoSoThuTucId(),
				motCuaDienBienHoSo.getTrangThaiTruocId(),
				motCuaDienBienHoSo.getTrangThaiSauId()
			}, motCuaDienBienHoSo);

		motCuaDienBienHoSo.resetOriginalValues();
	}

	/**
	 * Caches the mot cua dien bien ho sos in the entity cache if it is enabled.
	 *
	 * @param motCuaDienBienHoSos the mot cua dien bien ho sos
	 */
	@Override
	public void cacheResult(List<MotCuaDienBienHoSo> motCuaDienBienHoSos) {
		for (MotCuaDienBienHoSo motCuaDienBienHoSo : motCuaDienBienHoSos) {
			if (EntityCacheUtil.getResult(
						MotCuaDienBienHoSoModelImpl.ENTITY_CACHE_ENABLED,
						MotCuaDienBienHoSoImpl.class,
						motCuaDienBienHoSo.getPrimaryKey()) == null) {
				cacheResult(motCuaDienBienHoSo);
			}
			else {
				motCuaDienBienHoSo.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all mot cua dien bien ho sos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(MotCuaDienBienHoSoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(MotCuaDienBienHoSoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the mot cua dien bien ho so.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MotCuaDienBienHoSo motCuaDienBienHoSo) {
		EntityCacheUtil.removeResult(MotCuaDienBienHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaDienBienHoSoImpl.class, motCuaDienBienHoSo.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(motCuaDienBienHoSo);
	}

	@Override
	public void clearCache(List<MotCuaDienBienHoSo> motCuaDienBienHoSos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (MotCuaDienBienHoSo motCuaDienBienHoSo : motCuaDienBienHoSos) {
			EntityCacheUtil.removeResult(MotCuaDienBienHoSoModelImpl.ENTITY_CACHE_ENABLED,
				MotCuaDienBienHoSoImpl.class, motCuaDienBienHoSo.getPrimaryKey());

			clearUniqueFindersCache(motCuaDienBienHoSo);
		}
	}

	protected void cacheUniqueFindersCache(
		MotCuaDienBienHoSo motCuaDienBienHoSo) {
		if (motCuaDienBienHoSo.isNew()) {
			Object[] args = new Object[] {
					motCuaDienBienHoSo.getHoSoThuTucId(),
					motCuaDienBienHoSo.getTrangThaiTruocId(),
					motCuaDienBienHoSo.getTrangThaiSauId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDTRANGTHAITRUOCIDANDTRANGTHAISAUID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDTRANGTHAITRUOCIDANDTRANGTHAISAUID,
				args, motCuaDienBienHoSo);
		}
		else {
			MotCuaDienBienHoSoModelImpl motCuaDienBienHoSoModelImpl = (MotCuaDienBienHoSoModelImpl)motCuaDienBienHoSo;

			if ((motCuaDienBienHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDTRANGTHAITRUOCIDANDTRANGTHAISAUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaDienBienHoSo.getHoSoThuTucId(),
						motCuaDienBienHoSo.getTrangThaiTruocId(),
						motCuaDienBienHoSo.getTrangThaiSauId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDTRANGTHAITRUOCIDANDTRANGTHAISAUID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDTRANGTHAITRUOCIDANDTRANGTHAISAUID,
					args, motCuaDienBienHoSo);
			}
		}
	}

	protected void clearUniqueFindersCache(
		MotCuaDienBienHoSo motCuaDienBienHoSo) {
		MotCuaDienBienHoSoModelImpl motCuaDienBienHoSoModelImpl = (MotCuaDienBienHoSoModelImpl)motCuaDienBienHoSo;

		Object[] args = new Object[] {
				motCuaDienBienHoSo.getHoSoThuTucId(),
				motCuaDienBienHoSo.getTrangThaiTruocId(),
				motCuaDienBienHoSo.getTrangThaiSauId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDTRANGTHAITRUOCIDANDTRANGTHAISAUID,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDTRANGTHAITRUOCIDANDTRANGTHAISAUID,
			args);

		if ((motCuaDienBienHoSoModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDTRANGTHAITRUOCIDANDTRANGTHAISAUID.getColumnBitmask()) != 0) {
			args = new Object[] {
					motCuaDienBienHoSoModelImpl.getOriginalHoSoThuTucId(),
					motCuaDienBienHoSoModelImpl.getOriginalTrangThaiTruocId(),
					motCuaDienBienHoSoModelImpl.getOriginalTrangThaiSauId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCIDANDTRANGTHAITRUOCIDANDTRANGTHAISAUID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_HOSOTHUTUCIDANDTRANGTHAITRUOCIDANDTRANGTHAISAUID,
				args);
		}
	}

	/**
	 * Creates a new mot cua dien bien ho so with the primary key. Does not add the mot cua dien bien ho so to the database.
	 *
	 * @param id the primary key for the new mot cua dien bien ho so
	 * @return the new mot cua dien bien ho so
	 */
	@Override
	public MotCuaDienBienHoSo create(long id) {
		MotCuaDienBienHoSo motCuaDienBienHoSo = new MotCuaDienBienHoSoImpl();

		motCuaDienBienHoSo.setNew(true);
		motCuaDienBienHoSo.setPrimaryKey(id);

		return motCuaDienBienHoSo;
	}

	/**
	 * Removes the mot cua dien bien ho so with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the mot cua dien bien ho so
	 * @return the mot cua dien bien ho so that was removed
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException if a mot cua dien bien ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDienBienHoSo remove(long id)
		throws NoSuchMotCuaDienBienHoSoException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the mot cua dien bien ho so with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the mot cua dien bien ho so
	 * @return the mot cua dien bien ho so that was removed
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException if a mot cua dien bien ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDienBienHoSo remove(Serializable primaryKey)
		throws NoSuchMotCuaDienBienHoSoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			MotCuaDienBienHoSo motCuaDienBienHoSo = (MotCuaDienBienHoSo)session.get(MotCuaDienBienHoSoImpl.class,
					primaryKey);

			if (motCuaDienBienHoSo == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMotCuaDienBienHoSoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(motCuaDienBienHoSo);
		}
		catch (NoSuchMotCuaDienBienHoSoException nsee) {
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
	protected MotCuaDienBienHoSo removeImpl(
		MotCuaDienBienHoSo motCuaDienBienHoSo) throws SystemException {
		motCuaDienBienHoSo = toUnwrappedModel(motCuaDienBienHoSo);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(motCuaDienBienHoSo)) {
				motCuaDienBienHoSo = (MotCuaDienBienHoSo)session.get(MotCuaDienBienHoSoImpl.class,
						motCuaDienBienHoSo.getPrimaryKeyObj());
			}

			if (motCuaDienBienHoSo != null) {
				session.delete(motCuaDienBienHoSo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (motCuaDienBienHoSo != null) {
			clearCache(motCuaDienBienHoSo);
		}

		return motCuaDienBienHoSo;
	}

	@Override
	public MotCuaDienBienHoSo updateImpl(
		vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo motCuaDienBienHoSo)
		throws SystemException {
		motCuaDienBienHoSo = toUnwrappedModel(motCuaDienBienHoSo);

		boolean isNew = motCuaDienBienHoSo.isNew();

		MotCuaDienBienHoSoModelImpl motCuaDienBienHoSoModelImpl = (MotCuaDienBienHoSoModelImpl)motCuaDienBienHoSo;

		Session session = null;

		try {
			session = openSession();

			if (motCuaDienBienHoSo.isNew()) {
				session.save(motCuaDienBienHoSo);

				motCuaDienBienHoSo.setNew(false);
			}
			else {
				session.merge(motCuaDienBienHoSo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !MotCuaDienBienHoSoModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((motCuaDienBienHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRANGTHAITRUOCID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaDienBienHoSoModelImpl.getOriginalTrangThaiTruocId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TRANGTHAITRUOCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRANGTHAITRUOCID,
					args);

				args = new Object[] {
						motCuaDienBienHoSoModelImpl.getTrangThaiTruocId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TRANGTHAITRUOCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRANGTHAITRUOCID,
					args);
			}

			if ((motCuaDienBienHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRANGTHAISAUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaDienBienHoSoModelImpl.getOriginalTrangThaiSauId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TRANGTHAISAUID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRANGTHAISAUID,
					args);

				args = new Object[] {
						motCuaDienBienHoSoModelImpl.getTrangThaiSauId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TRANGTHAISAUID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRANGTHAISAUID,
					args);
			}

			if ((motCuaDienBienHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYIDTRANGTHAITRUOCID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaDienBienHoSoModelImpl.getOriginalPhieuXuLyId(),
						motCuaDienBienHoSoModelImpl.getOriginalTrangThaiTruocId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHIEUXULYIDTRANGTHAITRUOCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYIDTRANGTHAITRUOCID,
					args);

				args = new Object[] {
						motCuaDienBienHoSoModelImpl.getPhieuXuLyId(),
						motCuaDienBienHoSoModelImpl.getTrangThaiTruocId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHIEUXULYIDTRANGTHAITRUOCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYIDTRANGTHAITRUOCID,
					args);
			}

			if ((motCuaDienBienHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYIDTRANGTHAISAUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaDienBienHoSoModelImpl.getOriginalPhieuXuLyId(),
						motCuaDienBienHoSoModelImpl.getOriginalTrangThaiSauId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHIEUXULYIDTRANGTHAISAUID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYIDTRANGTHAISAUID,
					args);

				args = new Object[] {
						motCuaDienBienHoSoModelImpl.getPhieuXuLyId(),
						motCuaDienBienHoSoModelImpl.getTrangThaiSauId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHIEUXULYIDTRANGTHAISAUID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYIDTRANGTHAISAUID,
					args);
			}

			if ((motCuaDienBienHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaDienBienHoSoModelImpl.getOriginalPhieuXuLyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHIEUXULYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYID,
					args);

				args = new Object[] { motCuaDienBienHoSoModelImpl.getPhieuXuLyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHIEUXULYID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PHIEUXULYID,
					args);
			}
		}

		EntityCacheUtil.putResult(MotCuaDienBienHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaDienBienHoSoImpl.class, motCuaDienBienHoSo.getPrimaryKey(),
			motCuaDienBienHoSo);

		clearUniqueFindersCache(motCuaDienBienHoSo);
		cacheUniqueFindersCache(motCuaDienBienHoSo);

		return motCuaDienBienHoSo;
	}

	protected MotCuaDienBienHoSo toUnwrappedModel(
		MotCuaDienBienHoSo motCuaDienBienHoSo) {
		if (motCuaDienBienHoSo instanceof MotCuaDienBienHoSoImpl) {
			return motCuaDienBienHoSo;
		}

		MotCuaDienBienHoSoImpl motCuaDienBienHoSoImpl = new MotCuaDienBienHoSoImpl();

		motCuaDienBienHoSoImpl.setNew(motCuaDienBienHoSo.isNew());
		motCuaDienBienHoSoImpl.setPrimaryKey(motCuaDienBienHoSo.getPrimaryKey());

		motCuaDienBienHoSoImpl.setId(motCuaDienBienHoSo.getId());
		motCuaDienBienHoSoImpl.setHoSoThuTucId(motCuaDienBienHoSo.getHoSoThuTucId());
		motCuaDienBienHoSoImpl.setPhieuXuLyId(motCuaDienBienHoSo.getPhieuXuLyId());
		motCuaDienBienHoSoImpl.setSoNgayQuaHan(motCuaDienBienHoSo.getSoNgayQuaHan());
		motCuaDienBienHoSoImpl.setTrangThaiTruocId(motCuaDienBienHoSo.getTrangThaiTruocId());
		motCuaDienBienHoSoImpl.setTrangThaiSauId(motCuaDienBienHoSo.getTrangThaiSauId());
		motCuaDienBienHoSoImpl.setNgayXuLy(motCuaDienBienHoSo.getNgayXuLy());
		motCuaDienBienHoSoImpl.setNguoiXuLy(motCuaDienBienHoSo.getNguoiXuLy());
		motCuaDienBienHoSoImpl.setHanhDongXuLy(motCuaDienBienHoSo.getHanhDongXuLy());
		motCuaDienBienHoSoImpl.setGhiChu(motCuaDienBienHoSo.getGhiChu());
		motCuaDienBienHoSoImpl.setTaiLieuDinhKem(motCuaDienBienHoSo.getTaiLieuDinhKem());

		return motCuaDienBienHoSoImpl;
	}

	/**
	 * Returns the mot cua dien bien ho so with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the mot cua dien bien ho so
	 * @return the mot cua dien bien ho so
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException if a mot cua dien bien ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDienBienHoSo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMotCuaDienBienHoSoException, SystemException {
		MotCuaDienBienHoSo motCuaDienBienHoSo = fetchByPrimaryKey(primaryKey);

		if (motCuaDienBienHoSo == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMotCuaDienBienHoSoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return motCuaDienBienHoSo;
	}

	/**
	 * Returns the mot cua dien bien ho so with the primary key or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException} if it could not be found.
	 *
	 * @param id the primary key of the mot cua dien bien ho so
	 * @return the mot cua dien bien ho so
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaDienBienHoSoException if a mot cua dien bien ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDienBienHoSo findByPrimaryKey(long id)
		throws NoSuchMotCuaDienBienHoSoException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the mot cua dien bien ho so with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the mot cua dien bien ho so
	 * @return the mot cua dien bien ho so, or <code>null</code> if a mot cua dien bien ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDienBienHoSo fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		MotCuaDienBienHoSo motCuaDienBienHoSo = (MotCuaDienBienHoSo)EntityCacheUtil.getResult(MotCuaDienBienHoSoModelImpl.ENTITY_CACHE_ENABLED,
				MotCuaDienBienHoSoImpl.class, primaryKey);

		if (motCuaDienBienHoSo == _nullMotCuaDienBienHoSo) {
			return null;
		}

		if (motCuaDienBienHoSo == null) {
			Session session = null;

			try {
				session = openSession();

				motCuaDienBienHoSo = (MotCuaDienBienHoSo)session.get(MotCuaDienBienHoSoImpl.class,
						primaryKey);

				if (motCuaDienBienHoSo != null) {
					cacheResult(motCuaDienBienHoSo);
				}
				else {
					EntityCacheUtil.putResult(MotCuaDienBienHoSoModelImpl.ENTITY_CACHE_ENABLED,
						MotCuaDienBienHoSoImpl.class, primaryKey,
						_nullMotCuaDienBienHoSo);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(MotCuaDienBienHoSoModelImpl.ENTITY_CACHE_ENABLED,
					MotCuaDienBienHoSoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return motCuaDienBienHoSo;
	}

	/**
	 * Returns the mot cua dien bien ho so with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the mot cua dien bien ho so
	 * @return the mot cua dien bien ho so, or <code>null</code> if a mot cua dien bien ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaDienBienHoSo fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the mot cua dien bien ho sos.
	 *
	 * @return the mot cua dien bien ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaDienBienHoSo> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua dien bien ho sos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mot cua dien bien ho sos
	 * @param end the upper bound of the range of mot cua dien bien ho sos (not inclusive)
	 * @return the range of mot cua dien bien ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaDienBienHoSo> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua dien bien ho sos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mot cua dien bien ho sos
	 * @param end the upper bound of the range of mot cua dien bien ho sos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mot cua dien bien ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaDienBienHoSo> findAll(int start, int end,
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

		List<MotCuaDienBienHoSo> list = (List<MotCuaDienBienHoSo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MOTCUADIENBIENHOSO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MOTCUADIENBIENHOSO;

				if (pagination) {
					sql = sql.concat(MotCuaDienBienHoSoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<MotCuaDienBienHoSo>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaDienBienHoSo>(list);
				}
				else {
					list = (List<MotCuaDienBienHoSo>)QueryUtil.list(q,
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
	 * Removes all the mot cua dien bien ho sos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (MotCuaDienBienHoSo motCuaDienBienHoSo : findAll()) {
			remove(motCuaDienBienHoSo);
		}
	}

	/**
	 * Returns the number of mot cua dien bien ho sos.
	 *
	 * @return the number of mot cua dien bien ho sos
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

				Query q = session.createQuery(_SQL_COUNT_MOTCUADIENBIENHOSO);

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
	 * Initializes the mot cua dien bien ho so persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.motcua.model.MotCuaDienBienHoSo")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<MotCuaDienBienHoSo>> listenersList = new ArrayList<ModelListener<MotCuaDienBienHoSo>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<MotCuaDienBienHoSo>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(MotCuaDienBienHoSoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_MOTCUADIENBIENHOSO = "SELECT motCuaDienBienHoSo FROM MotCuaDienBienHoSo motCuaDienBienHoSo";
	private static final String _SQL_SELECT_MOTCUADIENBIENHOSO_WHERE = "SELECT motCuaDienBienHoSo FROM MotCuaDienBienHoSo motCuaDienBienHoSo WHERE ";
	private static final String _SQL_COUNT_MOTCUADIENBIENHOSO = "SELECT COUNT(motCuaDienBienHoSo) FROM MotCuaDienBienHoSo motCuaDienBienHoSo";
	private static final String _SQL_COUNT_MOTCUADIENBIENHOSO_WHERE = "SELECT COUNT(motCuaDienBienHoSo) FROM MotCuaDienBienHoSo motCuaDienBienHoSo WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "motCuaDienBienHoSo.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MotCuaDienBienHoSo exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No MotCuaDienBienHoSo exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(MotCuaDienBienHoSoPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"hoSoThuTucId", "phieuXuLyId", "soNgayQuaHan",
				"trangThaiTruocId", "trangThaiSauId", "ngayXuLy", "nguoiXuLy",
				"hanhDongXuLy", "ghiChu", "taiLieuDinhKem"
			});
	private static MotCuaDienBienHoSo _nullMotCuaDienBienHoSo = new MotCuaDienBienHoSoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<MotCuaDienBienHoSo> toCacheModel() {
				return _nullMotCuaDienBienHoSoCacheModel;
			}
		};

	private static CacheModel<MotCuaDienBienHoSo> _nullMotCuaDienBienHoSoCacheModel =
		new CacheModel<MotCuaDienBienHoSo>() {
			@Override
			public MotCuaDienBienHoSo toEntityModel() {
				return _nullMotCuaDienBienHoSo;
			}
		};
}