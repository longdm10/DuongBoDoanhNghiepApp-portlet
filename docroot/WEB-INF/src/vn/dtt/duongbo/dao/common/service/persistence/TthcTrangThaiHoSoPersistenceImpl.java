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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.duongbo.dao.common.NoSuchTthcTrangThaiHoSoException;
import vn.dtt.duongbo.dao.common.model.TthcTrangThaiHoSo;
import vn.dtt.duongbo.dao.common.model.impl.TthcTrangThaiHoSoImpl;
import vn.dtt.duongbo.dao.common.model.impl.TthcTrangThaiHoSoModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the tthc trang thai ho so service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcTrangThaiHoSoPersistence
 * @see TthcTrangThaiHoSoUtil
 * @generated
 */
public class TthcTrangThaiHoSoPersistenceImpl extends BasePersistenceImpl<TthcTrangThaiHoSo>
	implements TthcTrangThaiHoSoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TthcTrangThaiHoSoUtil} to access the tthc trang thai ho so persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TthcTrangThaiHoSoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TthcTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcTrangThaiHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcTrangThaiHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TthcTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcTrangThaiHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcTrangThaiHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TthcTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcTrangThaiHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_QUYTRINHTHUTUCID =
		new FinderPath(TthcTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcTrangThaiHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcTrangThaiHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByQuyTrinhThuTucId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCID =
		new FinderPath(TthcTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcTrangThaiHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcTrangThaiHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByQuyTrinhThuTucId", new String[] { Long.class.getName() },
			TthcTrangThaiHoSoModelImpl.QUYTRINHTHUTUCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_QUYTRINHTHUTUCID = new FinderPath(TthcTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcTrangThaiHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByQuyTrinhThuTucId", new String[] { Long.class.getName() });

	/**
	 * Returns all the tthc trang thai ho sos where quyTrinhThuTucId = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @return the matching tthc trang thai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcTrangThaiHoSo> findByQuyTrinhThuTucId(long quyTrinhThuTucId)
		throws SystemException {
		return findByQuyTrinhThuTucId(quyTrinhThuTucId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc trang thai ho sos where quyTrinhThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcTrangThaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param start the lower bound of the range of tthc trang thai ho sos
	 * @param end the upper bound of the range of tthc trang thai ho sos (not inclusive)
	 * @return the range of matching tthc trang thai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcTrangThaiHoSo> findByQuyTrinhThuTucId(
		long quyTrinhThuTucId, int start, int end) throws SystemException {
		return findByQuyTrinhThuTucId(quyTrinhThuTucId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc trang thai ho sos where quyTrinhThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcTrangThaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param start the lower bound of the range of tthc trang thai ho sos
	 * @param end the upper bound of the range of tthc trang thai ho sos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tthc trang thai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcTrangThaiHoSo> findByQuyTrinhThuTucId(
		long quyTrinhThuTucId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCID;
			finderArgs = new Object[] { quyTrinhThuTucId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_QUYTRINHTHUTUCID;
			finderArgs = new Object[] {
					quyTrinhThuTucId,
					
					start, end, orderByComparator
				};
		}

		List<TthcTrangThaiHoSo> list = (List<TthcTrangThaiHoSo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TthcTrangThaiHoSo tthcTrangThaiHoSo : list) {
				if ((quyTrinhThuTucId != tthcTrangThaiHoSo.getQuyTrinhThuTucId())) {
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

			query.append(_SQL_SELECT_TTHCTRANGTHAIHOSO_WHERE);

			query.append(_FINDER_COLUMN_QUYTRINHTHUTUCID_QUYTRINHTHUTUCID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TthcTrangThaiHoSoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(quyTrinhThuTucId);

				if (!pagination) {
					list = (List<TthcTrangThaiHoSo>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcTrangThaiHoSo>(list);
				}
				else {
					list = (List<TthcTrangThaiHoSo>)QueryUtil.list(q,
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
	 * Returns the first tthc trang thai ho so in the ordered set where quyTrinhThuTucId = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc trang thai ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcTrangThaiHoSoException if a matching tthc trang thai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcTrangThaiHoSo findByQuyTrinhThuTucId_First(
		long quyTrinhThuTucId, OrderByComparator orderByComparator)
		throws NoSuchTthcTrangThaiHoSoException, SystemException {
		TthcTrangThaiHoSo tthcTrangThaiHoSo = fetchByQuyTrinhThuTucId_First(quyTrinhThuTucId,
				orderByComparator);

		if (tthcTrangThaiHoSo != null) {
			return tthcTrangThaiHoSo;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("quyTrinhThuTucId=");
		msg.append(quyTrinhThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcTrangThaiHoSoException(msg.toString());
	}

	/**
	 * Returns the first tthc trang thai ho so in the ordered set where quyTrinhThuTucId = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc trang thai ho so, or <code>null</code> if a matching tthc trang thai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcTrangThaiHoSo fetchByQuyTrinhThuTucId_First(
		long quyTrinhThuTucId, OrderByComparator orderByComparator)
		throws SystemException {
		List<TthcTrangThaiHoSo> list = findByQuyTrinhThuTucId(quyTrinhThuTucId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tthc trang thai ho so in the ordered set where quyTrinhThuTucId = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc trang thai ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcTrangThaiHoSoException if a matching tthc trang thai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcTrangThaiHoSo findByQuyTrinhThuTucId_Last(
		long quyTrinhThuTucId, OrderByComparator orderByComparator)
		throws NoSuchTthcTrangThaiHoSoException, SystemException {
		TthcTrangThaiHoSo tthcTrangThaiHoSo = fetchByQuyTrinhThuTucId_Last(quyTrinhThuTucId,
				orderByComparator);

		if (tthcTrangThaiHoSo != null) {
			return tthcTrangThaiHoSo;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("quyTrinhThuTucId=");
		msg.append(quyTrinhThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcTrangThaiHoSoException(msg.toString());
	}

	/**
	 * Returns the last tthc trang thai ho so in the ordered set where quyTrinhThuTucId = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc trang thai ho so, or <code>null</code> if a matching tthc trang thai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcTrangThaiHoSo fetchByQuyTrinhThuTucId_Last(
		long quyTrinhThuTucId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByQuyTrinhThuTucId(quyTrinhThuTucId);

		if (count == 0) {
			return null;
		}

		List<TthcTrangThaiHoSo> list = findByQuyTrinhThuTucId(quyTrinhThuTucId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tthc trang thai ho sos before and after the current tthc trang thai ho so in the ordered set where quyTrinhThuTucId = &#63;.
	 *
	 * @param id the primary key of the current tthc trang thai ho so
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tthc trang thai ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcTrangThaiHoSoException if a tthc trang thai ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcTrangThaiHoSo[] findByQuyTrinhThuTucId_PrevAndNext(long id,
		long quyTrinhThuTucId, OrderByComparator orderByComparator)
		throws NoSuchTthcTrangThaiHoSoException, SystemException {
		TthcTrangThaiHoSo tthcTrangThaiHoSo = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TthcTrangThaiHoSo[] array = new TthcTrangThaiHoSoImpl[3];

			array[0] = getByQuyTrinhThuTucId_PrevAndNext(session,
					tthcTrangThaiHoSo, quyTrinhThuTucId, orderByComparator, true);

			array[1] = tthcTrangThaiHoSo;

			array[2] = getByQuyTrinhThuTucId_PrevAndNext(session,
					tthcTrangThaiHoSo, quyTrinhThuTucId, orderByComparator,
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

	protected TthcTrangThaiHoSo getByQuyTrinhThuTucId_PrevAndNext(
		Session session, TthcTrangThaiHoSo tthcTrangThaiHoSo,
		long quyTrinhThuTucId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TTHCTRANGTHAIHOSO_WHERE);

		query.append(_FINDER_COLUMN_QUYTRINHTHUTUCID_QUYTRINHTHUTUCID_2);

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
			query.append(TthcTrangThaiHoSoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(quyTrinhThuTucId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tthcTrangThaiHoSo);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TthcTrangThaiHoSo> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tthc trang thai ho sos where quyTrinhThuTucId = &#63; from the database.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByQuyTrinhThuTucId(long quyTrinhThuTucId)
		throws SystemException {
		for (TthcTrangThaiHoSo tthcTrangThaiHoSo : findByQuyTrinhThuTucId(
				quyTrinhThuTucId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tthcTrangThaiHoSo);
		}
	}

	/**
	 * Returns the number of tthc trang thai ho sos where quyTrinhThuTucId = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @return the number of matching tthc trang thai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByQuyTrinhThuTucId(long quyTrinhThuTucId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_QUYTRINHTHUTUCID;

		Object[] finderArgs = new Object[] { quyTrinhThuTucId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TTHCTRANGTHAIHOSO_WHERE);

			query.append(_FINDER_COLUMN_QUYTRINHTHUTUCID_QUYTRINHTHUTUCID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(quyTrinhThuTucId);

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

	private static final String _FINDER_COLUMN_QUYTRINHTHUTUCID_QUYTRINHTHUTUCID_2 =
		"tthcTrangThaiHoSo.quyTrinhThuTucId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_MATRANGTHAI = new FinderPath(TthcTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcTrangThaiHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcTrangThaiHoSoImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByMaTrangThai", new String[] { String.class.getName() },
			TthcTrangThaiHoSoModelImpl.MATRANGTHAI_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MATRANGTHAI = new FinderPath(TthcTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcTrangThaiHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMaTrangThai",
			new String[] { String.class.getName() });

	/**
	 * Returns the tthc trang thai ho so where maTrangThai = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcTrangThaiHoSoException} if it could not be found.
	 *
	 * @param maTrangThai the ma trang thai
	 * @return the matching tthc trang thai ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcTrangThaiHoSoException if a matching tthc trang thai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcTrangThaiHoSo findByMaTrangThai(String maTrangThai)
		throws NoSuchTthcTrangThaiHoSoException, SystemException {
		TthcTrangThaiHoSo tthcTrangThaiHoSo = fetchByMaTrangThai(maTrangThai);

		if (tthcTrangThaiHoSo == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("maTrangThai=");
			msg.append(maTrangThai);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchTthcTrangThaiHoSoException(msg.toString());
		}

		return tthcTrangThaiHoSo;
	}

	/**
	 * Returns the tthc trang thai ho so where maTrangThai = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param maTrangThai the ma trang thai
	 * @return the matching tthc trang thai ho so, or <code>null</code> if a matching tthc trang thai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcTrangThaiHoSo fetchByMaTrangThai(String maTrangThai)
		throws SystemException {
		return fetchByMaTrangThai(maTrangThai, true);
	}

	/**
	 * Returns the tthc trang thai ho so where maTrangThai = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param maTrangThai the ma trang thai
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching tthc trang thai ho so, or <code>null</code> if a matching tthc trang thai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcTrangThaiHoSo fetchByMaTrangThai(String maTrangThai,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { maTrangThai };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_MATRANGTHAI,
					finderArgs, this);
		}

		if (result instanceof TthcTrangThaiHoSo) {
			TthcTrangThaiHoSo tthcTrangThaiHoSo = (TthcTrangThaiHoSo)result;

			if (!Validator.equals(maTrangThai,
						tthcTrangThaiHoSo.getMaTrangThai())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_TTHCTRANGTHAIHOSO_WHERE);

			boolean bindMaTrangThai = false;

			if (maTrangThai == null) {
				query.append(_FINDER_COLUMN_MATRANGTHAI_MATRANGTHAI_1);
			}
			else if (maTrangThai.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MATRANGTHAI_MATRANGTHAI_3);
			}
			else {
				bindMaTrangThai = true;

				query.append(_FINDER_COLUMN_MATRANGTHAI_MATRANGTHAI_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaTrangThai) {
					qPos.add(maTrangThai);
				}

				List<TthcTrangThaiHoSo> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATRANGTHAI,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"TthcTrangThaiHoSoPersistenceImpl.fetchByMaTrangThai(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					TthcTrangThaiHoSo tthcTrangThaiHoSo = list.get(0);

					result = tthcTrangThaiHoSo;

					cacheResult(tthcTrangThaiHoSo);

					if ((tthcTrangThaiHoSo.getMaTrangThai() == null) ||
							!tthcTrangThaiHoSo.getMaTrangThai()
												  .equals(maTrangThai)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATRANGTHAI,
							finderArgs, tthcTrangThaiHoSo);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MATRANGTHAI,
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
			return (TthcTrangThaiHoSo)result;
		}
	}

	/**
	 * Removes the tthc trang thai ho so where maTrangThai = &#63; from the database.
	 *
	 * @param maTrangThai the ma trang thai
	 * @return the tthc trang thai ho so that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcTrangThaiHoSo removeByMaTrangThai(String maTrangThai)
		throws NoSuchTthcTrangThaiHoSoException, SystemException {
		TthcTrangThaiHoSo tthcTrangThaiHoSo = findByMaTrangThai(maTrangThai);

		return remove(tthcTrangThaiHoSo);
	}

	/**
	 * Returns the number of tthc trang thai ho sos where maTrangThai = &#63;.
	 *
	 * @param maTrangThai the ma trang thai
	 * @return the number of matching tthc trang thai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByMaTrangThai(String maTrangThai) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MATRANGTHAI;

		Object[] finderArgs = new Object[] { maTrangThai };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TTHCTRANGTHAIHOSO_WHERE);

			boolean bindMaTrangThai = false;

			if (maTrangThai == null) {
				query.append(_FINDER_COLUMN_MATRANGTHAI_MATRANGTHAI_1);
			}
			else if (maTrangThai.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MATRANGTHAI_MATRANGTHAI_3);
			}
			else {
				bindMaTrangThai = true;

				query.append(_FINDER_COLUMN_MATRANGTHAI_MATRANGTHAI_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMaTrangThai) {
					qPos.add(maTrangThai);
				}

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

	private static final String _FINDER_COLUMN_MATRANGTHAI_MATRANGTHAI_1 = "tthcTrangThaiHoSo.maTrangThai IS NULL";
	private static final String _FINDER_COLUMN_MATRANGTHAI_MATRANGTHAI_2 = "tthcTrangThaiHoSo.maTrangThai = ?";
	private static final String _FINDER_COLUMN_MATRANGTHAI_MATRANGTHAI_3 = "(tthcTrangThaiHoSo.maTrangThai IS NULL OR tthcTrangThaiHoSo.maTrangThai = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDVAITROXULY1 =
		new FinderPath(TthcTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcTrangThaiHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcTrangThaiHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByQuyTrinhThuTucIdAndVaiTroXuLy1",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDVAITROXULY1 =
		new FinderPath(TthcTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcTrangThaiHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcTrangThaiHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByQuyTrinhThuTucIdAndVaiTroXuLy1",
			new String[] { Long.class.getName(), Long.class.getName() },
			TthcTrangThaiHoSoModelImpl.QUYTRINHTHUTUCID_COLUMN_BITMASK |
			TthcTrangThaiHoSoModelImpl.VAITROXULY1_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_QUYTRINHTHUTUCIDANDVAITROXULY1 =
		new FinderPath(TthcTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcTrangThaiHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByQuyTrinhThuTucIdAndVaiTroXuLy1",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the tthc trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy1 = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy1 the vai tro xu ly1
	 * @return the matching tthc trang thai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcTrangThaiHoSo> findByQuyTrinhThuTucIdAndVaiTroXuLy1(
		long quyTrinhThuTucId, long vaiTroXuLy1) throws SystemException {
		return findByQuyTrinhThuTucIdAndVaiTroXuLy1(quyTrinhThuTucId,
			vaiTroXuLy1, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy1 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcTrangThaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy1 the vai tro xu ly1
	 * @param start the lower bound of the range of tthc trang thai ho sos
	 * @param end the upper bound of the range of tthc trang thai ho sos (not inclusive)
	 * @return the range of matching tthc trang thai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcTrangThaiHoSo> findByQuyTrinhThuTucIdAndVaiTroXuLy1(
		long quyTrinhThuTucId, long vaiTroXuLy1, int start, int end)
		throws SystemException {
		return findByQuyTrinhThuTucIdAndVaiTroXuLy1(quyTrinhThuTucId,
			vaiTroXuLy1, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy1 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcTrangThaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy1 the vai tro xu ly1
	 * @param start the lower bound of the range of tthc trang thai ho sos
	 * @param end the upper bound of the range of tthc trang thai ho sos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tthc trang thai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcTrangThaiHoSo> findByQuyTrinhThuTucIdAndVaiTroXuLy1(
		long quyTrinhThuTucId, long vaiTroXuLy1, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDVAITROXULY1;
			finderArgs = new Object[] { quyTrinhThuTucId, vaiTroXuLy1 };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDVAITROXULY1;
			finderArgs = new Object[] {
					quyTrinhThuTucId, vaiTroXuLy1,
					
					start, end, orderByComparator
				};
		}

		List<TthcTrangThaiHoSo> list = (List<TthcTrangThaiHoSo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TthcTrangThaiHoSo tthcTrangThaiHoSo : list) {
				if ((quyTrinhThuTucId != tthcTrangThaiHoSo.getQuyTrinhThuTucId()) ||
						(vaiTroXuLy1 != tthcTrangThaiHoSo.getVaiTroXuLy1())) {
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

			query.append(_SQL_SELECT_TTHCTRANGTHAIHOSO_WHERE);

			query.append(_FINDER_COLUMN_QUYTRINHTHUTUCIDANDVAITROXULY1_QUYTRINHTHUTUCID_2);

			query.append(_FINDER_COLUMN_QUYTRINHTHUTUCIDANDVAITROXULY1_VAITROXULY1_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TthcTrangThaiHoSoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(quyTrinhThuTucId);

				qPos.add(vaiTroXuLy1);

				if (!pagination) {
					list = (List<TthcTrangThaiHoSo>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcTrangThaiHoSo>(list);
				}
				else {
					list = (List<TthcTrangThaiHoSo>)QueryUtil.list(q,
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
	 * Returns the first tthc trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy1 = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy1 the vai tro xu ly1
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc trang thai ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcTrangThaiHoSoException if a matching tthc trang thai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcTrangThaiHoSo findByQuyTrinhThuTucIdAndVaiTroXuLy1_First(
		long quyTrinhThuTucId, long vaiTroXuLy1,
		OrderByComparator orderByComparator)
		throws NoSuchTthcTrangThaiHoSoException, SystemException {
		TthcTrangThaiHoSo tthcTrangThaiHoSo = fetchByQuyTrinhThuTucIdAndVaiTroXuLy1_First(quyTrinhThuTucId,
				vaiTroXuLy1, orderByComparator);

		if (tthcTrangThaiHoSo != null) {
			return tthcTrangThaiHoSo;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("quyTrinhThuTucId=");
		msg.append(quyTrinhThuTucId);

		msg.append(", vaiTroXuLy1=");
		msg.append(vaiTroXuLy1);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcTrangThaiHoSoException(msg.toString());
	}

	/**
	 * Returns the first tthc trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy1 = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy1 the vai tro xu ly1
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc trang thai ho so, or <code>null</code> if a matching tthc trang thai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcTrangThaiHoSo fetchByQuyTrinhThuTucIdAndVaiTroXuLy1_First(
		long quyTrinhThuTucId, long vaiTroXuLy1,
		OrderByComparator orderByComparator) throws SystemException {
		List<TthcTrangThaiHoSo> list = findByQuyTrinhThuTucIdAndVaiTroXuLy1(quyTrinhThuTucId,
				vaiTroXuLy1, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tthc trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy1 = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy1 the vai tro xu ly1
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc trang thai ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcTrangThaiHoSoException if a matching tthc trang thai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcTrangThaiHoSo findByQuyTrinhThuTucIdAndVaiTroXuLy1_Last(
		long quyTrinhThuTucId, long vaiTroXuLy1,
		OrderByComparator orderByComparator)
		throws NoSuchTthcTrangThaiHoSoException, SystemException {
		TthcTrangThaiHoSo tthcTrangThaiHoSo = fetchByQuyTrinhThuTucIdAndVaiTroXuLy1_Last(quyTrinhThuTucId,
				vaiTroXuLy1, orderByComparator);

		if (tthcTrangThaiHoSo != null) {
			return tthcTrangThaiHoSo;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("quyTrinhThuTucId=");
		msg.append(quyTrinhThuTucId);

		msg.append(", vaiTroXuLy1=");
		msg.append(vaiTroXuLy1);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcTrangThaiHoSoException(msg.toString());
	}

	/**
	 * Returns the last tthc trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy1 = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy1 the vai tro xu ly1
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc trang thai ho so, or <code>null</code> if a matching tthc trang thai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcTrangThaiHoSo fetchByQuyTrinhThuTucIdAndVaiTroXuLy1_Last(
		long quyTrinhThuTucId, long vaiTroXuLy1,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByQuyTrinhThuTucIdAndVaiTroXuLy1(quyTrinhThuTucId,
				vaiTroXuLy1);

		if (count == 0) {
			return null;
		}

		List<TthcTrangThaiHoSo> list = findByQuyTrinhThuTucIdAndVaiTroXuLy1(quyTrinhThuTucId,
				vaiTroXuLy1, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tthc trang thai ho sos before and after the current tthc trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy1 = &#63;.
	 *
	 * @param id the primary key of the current tthc trang thai ho so
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy1 the vai tro xu ly1
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tthc trang thai ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcTrangThaiHoSoException if a tthc trang thai ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcTrangThaiHoSo[] findByQuyTrinhThuTucIdAndVaiTroXuLy1_PrevAndNext(
		long id, long quyTrinhThuTucId, long vaiTroXuLy1,
		OrderByComparator orderByComparator)
		throws NoSuchTthcTrangThaiHoSoException, SystemException {
		TthcTrangThaiHoSo tthcTrangThaiHoSo = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TthcTrangThaiHoSo[] array = new TthcTrangThaiHoSoImpl[3];

			array[0] = getByQuyTrinhThuTucIdAndVaiTroXuLy1_PrevAndNext(session,
					tthcTrangThaiHoSo, quyTrinhThuTucId, vaiTroXuLy1,
					orderByComparator, true);

			array[1] = tthcTrangThaiHoSo;

			array[2] = getByQuyTrinhThuTucIdAndVaiTroXuLy1_PrevAndNext(session,
					tthcTrangThaiHoSo, quyTrinhThuTucId, vaiTroXuLy1,
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

	protected TthcTrangThaiHoSo getByQuyTrinhThuTucIdAndVaiTroXuLy1_PrevAndNext(
		Session session, TthcTrangThaiHoSo tthcTrangThaiHoSo,
		long quyTrinhThuTucId, long vaiTroXuLy1,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TTHCTRANGTHAIHOSO_WHERE);

		query.append(_FINDER_COLUMN_QUYTRINHTHUTUCIDANDVAITROXULY1_QUYTRINHTHUTUCID_2);

		query.append(_FINDER_COLUMN_QUYTRINHTHUTUCIDANDVAITROXULY1_VAITROXULY1_2);

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
			query.append(TthcTrangThaiHoSoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(quyTrinhThuTucId);

		qPos.add(vaiTroXuLy1);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tthcTrangThaiHoSo);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TthcTrangThaiHoSo> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tthc trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy1 = &#63; from the database.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy1 the vai tro xu ly1
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByQuyTrinhThuTucIdAndVaiTroXuLy1(long quyTrinhThuTucId,
		long vaiTroXuLy1) throws SystemException {
		for (TthcTrangThaiHoSo tthcTrangThaiHoSo : findByQuyTrinhThuTucIdAndVaiTroXuLy1(
				quyTrinhThuTucId, vaiTroXuLy1, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tthcTrangThaiHoSo);
		}
	}

	/**
	 * Returns the number of tthc trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy1 = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy1 the vai tro xu ly1
	 * @return the number of matching tthc trang thai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByQuyTrinhThuTucIdAndVaiTroXuLy1(long quyTrinhThuTucId,
		long vaiTroXuLy1) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_QUYTRINHTHUTUCIDANDVAITROXULY1;

		Object[] finderArgs = new Object[] { quyTrinhThuTucId, vaiTroXuLy1 };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TTHCTRANGTHAIHOSO_WHERE);

			query.append(_FINDER_COLUMN_QUYTRINHTHUTUCIDANDVAITROXULY1_QUYTRINHTHUTUCID_2);

			query.append(_FINDER_COLUMN_QUYTRINHTHUTUCIDANDVAITROXULY1_VAITROXULY1_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(quyTrinhThuTucId);

				qPos.add(vaiTroXuLy1);

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

	private static final String _FINDER_COLUMN_QUYTRINHTHUTUCIDANDVAITROXULY1_QUYTRINHTHUTUCID_2 =
		"tthcTrangThaiHoSo.quyTrinhThuTucId = ? AND ";
	private static final String _FINDER_COLUMN_QUYTRINHTHUTUCIDANDVAITROXULY1_VAITROXULY1_2 =
		"tthcTrangThaiHoSo.vaiTroXuLy1 = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDVAITROXULY2 =
		new FinderPath(TthcTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcTrangThaiHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcTrangThaiHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByQuyTrinhThuTucIdAndVaiTroXuLy2",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDVAITROXULY2 =
		new FinderPath(TthcTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcTrangThaiHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcTrangThaiHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByQuyTrinhThuTucIdAndVaiTroXuLy2",
			new String[] { Long.class.getName(), Long.class.getName() },
			TthcTrangThaiHoSoModelImpl.QUYTRINHTHUTUCID_COLUMN_BITMASK |
			TthcTrangThaiHoSoModelImpl.VAITROXULY2_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_QUYTRINHTHUTUCIDANDVAITROXULY2 =
		new FinderPath(TthcTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcTrangThaiHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByQuyTrinhThuTucIdAndVaiTroXuLy2",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the tthc trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy2 = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy2 the vai tro xu ly2
	 * @return the matching tthc trang thai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcTrangThaiHoSo> findByQuyTrinhThuTucIdAndVaiTroXuLy2(
		long quyTrinhThuTucId, long vaiTroXuLy2) throws SystemException {
		return findByQuyTrinhThuTucIdAndVaiTroXuLy2(quyTrinhThuTucId,
			vaiTroXuLy2, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcTrangThaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy2 the vai tro xu ly2
	 * @param start the lower bound of the range of tthc trang thai ho sos
	 * @param end the upper bound of the range of tthc trang thai ho sos (not inclusive)
	 * @return the range of matching tthc trang thai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcTrangThaiHoSo> findByQuyTrinhThuTucIdAndVaiTroXuLy2(
		long quyTrinhThuTucId, long vaiTroXuLy2, int start, int end)
		throws SystemException {
		return findByQuyTrinhThuTucIdAndVaiTroXuLy2(quyTrinhThuTucId,
			vaiTroXuLy2, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcTrangThaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy2 the vai tro xu ly2
	 * @param start the lower bound of the range of tthc trang thai ho sos
	 * @param end the upper bound of the range of tthc trang thai ho sos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tthc trang thai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcTrangThaiHoSo> findByQuyTrinhThuTucIdAndVaiTroXuLy2(
		long quyTrinhThuTucId, long vaiTroXuLy2, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDVAITROXULY2;
			finderArgs = new Object[] { quyTrinhThuTucId, vaiTroXuLy2 };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDVAITROXULY2;
			finderArgs = new Object[] {
					quyTrinhThuTucId, vaiTroXuLy2,
					
					start, end, orderByComparator
				};
		}

		List<TthcTrangThaiHoSo> list = (List<TthcTrangThaiHoSo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TthcTrangThaiHoSo tthcTrangThaiHoSo : list) {
				if ((quyTrinhThuTucId != tthcTrangThaiHoSo.getQuyTrinhThuTucId()) ||
						(vaiTroXuLy2 != tthcTrangThaiHoSo.getVaiTroXuLy2())) {
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

			query.append(_SQL_SELECT_TTHCTRANGTHAIHOSO_WHERE);

			query.append(_FINDER_COLUMN_QUYTRINHTHUTUCIDANDVAITROXULY2_QUYTRINHTHUTUCID_2);

			query.append(_FINDER_COLUMN_QUYTRINHTHUTUCIDANDVAITROXULY2_VAITROXULY2_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TthcTrangThaiHoSoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(quyTrinhThuTucId);

				qPos.add(vaiTroXuLy2);

				if (!pagination) {
					list = (List<TthcTrangThaiHoSo>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcTrangThaiHoSo>(list);
				}
				else {
					list = (List<TthcTrangThaiHoSo>)QueryUtil.list(q,
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
	 * Returns the first tthc trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy2 = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy2 the vai tro xu ly2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc trang thai ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcTrangThaiHoSoException if a matching tthc trang thai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcTrangThaiHoSo findByQuyTrinhThuTucIdAndVaiTroXuLy2_First(
		long quyTrinhThuTucId, long vaiTroXuLy2,
		OrderByComparator orderByComparator)
		throws NoSuchTthcTrangThaiHoSoException, SystemException {
		TthcTrangThaiHoSo tthcTrangThaiHoSo = fetchByQuyTrinhThuTucIdAndVaiTroXuLy2_First(quyTrinhThuTucId,
				vaiTroXuLy2, orderByComparator);

		if (tthcTrangThaiHoSo != null) {
			return tthcTrangThaiHoSo;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("quyTrinhThuTucId=");
		msg.append(quyTrinhThuTucId);

		msg.append(", vaiTroXuLy2=");
		msg.append(vaiTroXuLy2);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcTrangThaiHoSoException(msg.toString());
	}

	/**
	 * Returns the first tthc trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy2 = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy2 the vai tro xu ly2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc trang thai ho so, or <code>null</code> if a matching tthc trang thai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcTrangThaiHoSo fetchByQuyTrinhThuTucIdAndVaiTroXuLy2_First(
		long quyTrinhThuTucId, long vaiTroXuLy2,
		OrderByComparator orderByComparator) throws SystemException {
		List<TthcTrangThaiHoSo> list = findByQuyTrinhThuTucIdAndVaiTroXuLy2(quyTrinhThuTucId,
				vaiTroXuLy2, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tthc trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy2 = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy2 the vai tro xu ly2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc trang thai ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcTrangThaiHoSoException if a matching tthc trang thai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcTrangThaiHoSo findByQuyTrinhThuTucIdAndVaiTroXuLy2_Last(
		long quyTrinhThuTucId, long vaiTroXuLy2,
		OrderByComparator orderByComparator)
		throws NoSuchTthcTrangThaiHoSoException, SystemException {
		TthcTrangThaiHoSo tthcTrangThaiHoSo = fetchByQuyTrinhThuTucIdAndVaiTroXuLy2_Last(quyTrinhThuTucId,
				vaiTroXuLy2, orderByComparator);

		if (tthcTrangThaiHoSo != null) {
			return tthcTrangThaiHoSo;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("quyTrinhThuTucId=");
		msg.append(quyTrinhThuTucId);

		msg.append(", vaiTroXuLy2=");
		msg.append(vaiTroXuLy2);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcTrangThaiHoSoException(msg.toString());
	}

	/**
	 * Returns the last tthc trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy2 = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy2 the vai tro xu ly2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc trang thai ho so, or <code>null</code> if a matching tthc trang thai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcTrangThaiHoSo fetchByQuyTrinhThuTucIdAndVaiTroXuLy2_Last(
		long quyTrinhThuTucId, long vaiTroXuLy2,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByQuyTrinhThuTucIdAndVaiTroXuLy2(quyTrinhThuTucId,
				vaiTroXuLy2);

		if (count == 0) {
			return null;
		}

		List<TthcTrangThaiHoSo> list = findByQuyTrinhThuTucIdAndVaiTroXuLy2(quyTrinhThuTucId,
				vaiTroXuLy2, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tthc trang thai ho sos before and after the current tthc trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy2 = &#63;.
	 *
	 * @param id the primary key of the current tthc trang thai ho so
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy2 the vai tro xu ly2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tthc trang thai ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcTrangThaiHoSoException if a tthc trang thai ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcTrangThaiHoSo[] findByQuyTrinhThuTucIdAndVaiTroXuLy2_PrevAndNext(
		long id, long quyTrinhThuTucId, long vaiTroXuLy2,
		OrderByComparator orderByComparator)
		throws NoSuchTthcTrangThaiHoSoException, SystemException {
		TthcTrangThaiHoSo tthcTrangThaiHoSo = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TthcTrangThaiHoSo[] array = new TthcTrangThaiHoSoImpl[3];

			array[0] = getByQuyTrinhThuTucIdAndVaiTroXuLy2_PrevAndNext(session,
					tthcTrangThaiHoSo, quyTrinhThuTucId, vaiTroXuLy2,
					orderByComparator, true);

			array[1] = tthcTrangThaiHoSo;

			array[2] = getByQuyTrinhThuTucIdAndVaiTroXuLy2_PrevAndNext(session,
					tthcTrangThaiHoSo, quyTrinhThuTucId, vaiTroXuLy2,
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

	protected TthcTrangThaiHoSo getByQuyTrinhThuTucIdAndVaiTroXuLy2_PrevAndNext(
		Session session, TthcTrangThaiHoSo tthcTrangThaiHoSo,
		long quyTrinhThuTucId, long vaiTroXuLy2,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TTHCTRANGTHAIHOSO_WHERE);

		query.append(_FINDER_COLUMN_QUYTRINHTHUTUCIDANDVAITROXULY2_QUYTRINHTHUTUCID_2);

		query.append(_FINDER_COLUMN_QUYTRINHTHUTUCIDANDVAITROXULY2_VAITROXULY2_2);

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
			query.append(TthcTrangThaiHoSoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(quyTrinhThuTucId);

		qPos.add(vaiTroXuLy2);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tthcTrangThaiHoSo);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TthcTrangThaiHoSo> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tthc trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy2 = &#63; from the database.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy2 the vai tro xu ly2
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByQuyTrinhThuTucIdAndVaiTroXuLy2(long quyTrinhThuTucId,
		long vaiTroXuLy2) throws SystemException {
		for (TthcTrangThaiHoSo tthcTrangThaiHoSo : findByQuyTrinhThuTucIdAndVaiTroXuLy2(
				quyTrinhThuTucId, vaiTroXuLy2, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tthcTrangThaiHoSo);
		}
	}

	/**
	 * Returns the number of tthc trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy2 = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy2 the vai tro xu ly2
	 * @return the number of matching tthc trang thai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByQuyTrinhThuTucIdAndVaiTroXuLy2(long quyTrinhThuTucId,
		long vaiTroXuLy2) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_QUYTRINHTHUTUCIDANDVAITROXULY2;

		Object[] finderArgs = new Object[] { quyTrinhThuTucId, vaiTroXuLy2 };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TTHCTRANGTHAIHOSO_WHERE);

			query.append(_FINDER_COLUMN_QUYTRINHTHUTUCIDANDVAITROXULY2_QUYTRINHTHUTUCID_2);

			query.append(_FINDER_COLUMN_QUYTRINHTHUTUCIDANDVAITROXULY2_VAITROXULY2_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(quyTrinhThuTucId);

				qPos.add(vaiTroXuLy2);

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

	private static final String _FINDER_COLUMN_QUYTRINHTHUTUCIDANDVAITROXULY2_QUYTRINHTHUTUCID_2 =
		"tthcTrangThaiHoSo.quyTrinhThuTucId = ? AND ";
	private static final String _FINDER_COLUMN_QUYTRINHTHUTUCIDANDVAITROXULY2_VAITROXULY2_2 =
		"tthcTrangThaiHoSo.vaiTroXuLy2 = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDVAITROXULY3 =
		new FinderPath(TthcTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcTrangThaiHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcTrangThaiHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByQuyTrinhThuTucIdAndVaiTroXuLy3",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDVAITROXULY3 =
		new FinderPath(TthcTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcTrangThaiHoSoModelImpl.FINDER_CACHE_ENABLED,
			TthcTrangThaiHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByQuyTrinhThuTucIdAndVaiTroXuLy3",
			new String[] { Long.class.getName(), Long.class.getName() },
			TthcTrangThaiHoSoModelImpl.QUYTRINHTHUTUCID_COLUMN_BITMASK |
			TthcTrangThaiHoSoModelImpl.VAITROXULY3_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_QUYTRINHTHUTUCIDANDVAITROXULY3 =
		new FinderPath(TthcTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcTrangThaiHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByQuyTrinhThuTucIdAndVaiTroXuLy3",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the tthc trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy3 = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy3 the vai tro xu ly3
	 * @return the matching tthc trang thai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcTrangThaiHoSo> findByQuyTrinhThuTucIdAndVaiTroXuLy3(
		long quyTrinhThuTucId, long vaiTroXuLy3) throws SystemException {
		return findByQuyTrinhThuTucIdAndVaiTroXuLy3(quyTrinhThuTucId,
			vaiTroXuLy3, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy3 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcTrangThaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy3 the vai tro xu ly3
	 * @param start the lower bound of the range of tthc trang thai ho sos
	 * @param end the upper bound of the range of tthc trang thai ho sos (not inclusive)
	 * @return the range of matching tthc trang thai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcTrangThaiHoSo> findByQuyTrinhThuTucIdAndVaiTroXuLy3(
		long quyTrinhThuTucId, long vaiTroXuLy3, int start, int end)
		throws SystemException {
		return findByQuyTrinhThuTucIdAndVaiTroXuLy3(quyTrinhThuTucId,
			vaiTroXuLy3, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy3 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcTrangThaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy3 the vai tro xu ly3
	 * @param start the lower bound of the range of tthc trang thai ho sos
	 * @param end the upper bound of the range of tthc trang thai ho sos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tthc trang thai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcTrangThaiHoSo> findByQuyTrinhThuTucIdAndVaiTroXuLy3(
		long quyTrinhThuTucId, long vaiTroXuLy3, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDVAITROXULY3;
			finderArgs = new Object[] { quyTrinhThuTucId, vaiTroXuLy3 };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDVAITROXULY3;
			finderArgs = new Object[] {
					quyTrinhThuTucId, vaiTroXuLy3,
					
					start, end, orderByComparator
				};
		}

		List<TthcTrangThaiHoSo> list = (List<TthcTrangThaiHoSo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TthcTrangThaiHoSo tthcTrangThaiHoSo : list) {
				if ((quyTrinhThuTucId != tthcTrangThaiHoSo.getQuyTrinhThuTucId()) ||
						(vaiTroXuLy3 != tthcTrangThaiHoSo.getVaiTroXuLy3())) {
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

			query.append(_SQL_SELECT_TTHCTRANGTHAIHOSO_WHERE);

			query.append(_FINDER_COLUMN_QUYTRINHTHUTUCIDANDVAITROXULY3_QUYTRINHTHUTUCID_2);

			query.append(_FINDER_COLUMN_QUYTRINHTHUTUCIDANDVAITROXULY3_VAITROXULY3_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TthcTrangThaiHoSoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(quyTrinhThuTucId);

				qPos.add(vaiTroXuLy3);

				if (!pagination) {
					list = (List<TthcTrangThaiHoSo>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcTrangThaiHoSo>(list);
				}
				else {
					list = (List<TthcTrangThaiHoSo>)QueryUtil.list(q,
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
	 * Returns the first tthc trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy3 = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy3 the vai tro xu ly3
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc trang thai ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcTrangThaiHoSoException if a matching tthc trang thai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcTrangThaiHoSo findByQuyTrinhThuTucIdAndVaiTroXuLy3_First(
		long quyTrinhThuTucId, long vaiTroXuLy3,
		OrderByComparator orderByComparator)
		throws NoSuchTthcTrangThaiHoSoException, SystemException {
		TthcTrangThaiHoSo tthcTrangThaiHoSo = fetchByQuyTrinhThuTucIdAndVaiTroXuLy3_First(quyTrinhThuTucId,
				vaiTroXuLy3, orderByComparator);

		if (tthcTrangThaiHoSo != null) {
			return tthcTrangThaiHoSo;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("quyTrinhThuTucId=");
		msg.append(quyTrinhThuTucId);

		msg.append(", vaiTroXuLy3=");
		msg.append(vaiTroXuLy3);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcTrangThaiHoSoException(msg.toString());
	}

	/**
	 * Returns the first tthc trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy3 = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy3 the vai tro xu ly3
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tthc trang thai ho so, or <code>null</code> if a matching tthc trang thai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcTrangThaiHoSo fetchByQuyTrinhThuTucIdAndVaiTroXuLy3_First(
		long quyTrinhThuTucId, long vaiTroXuLy3,
		OrderByComparator orderByComparator) throws SystemException {
		List<TthcTrangThaiHoSo> list = findByQuyTrinhThuTucIdAndVaiTroXuLy3(quyTrinhThuTucId,
				vaiTroXuLy3, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tthc trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy3 = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy3 the vai tro xu ly3
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc trang thai ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcTrangThaiHoSoException if a matching tthc trang thai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcTrangThaiHoSo findByQuyTrinhThuTucIdAndVaiTroXuLy3_Last(
		long quyTrinhThuTucId, long vaiTroXuLy3,
		OrderByComparator orderByComparator)
		throws NoSuchTthcTrangThaiHoSoException, SystemException {
		TthcTrangThaiHoSo tthcTrangThaiHoSo = fetchByQuyTrinhThuTucIdAndVaiTroXuLy3_Last(quyTrinhThuTucId,
				vaiTroXuLy3, orderByComparator);

		if (tthcTrangThaiHoSo != null) {
			return tthcTrangThaiHoSo;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("quyTrinhThuTucId=");
		msg.append(quyTrinhThuTucId);

		msg.append(", vaiTroXuLy3=");
		msg.append(vaiTroXuLy3);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTthcTrangThaiHoSoException(msg.toString());
	}

	/**
	 * Returns the last tthc trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy3 = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy3 the vai tro xu ly3
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tthc trang thai ho so, or <code>null</code> if a matching tthc trang thai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcTrangThaiHoSo fetchByQuyTrinhThuTucIdAndVaiTroXuLy3_Last(
		long quyTrinhThuTucId, long vaiTroXuLy3,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByQuyTrinhThuTucIdAndVaiTroXuLy3(quyTrinhThuTucId,
				vaiTroXuLy3);

		if (count == 0) {
			return null;
		}

		List<TthcTrangThaiHoSo> list = findByQuyTrinhThuTucIdAndVaiTroXuLy3(quyTrinhThuTucId,
				vaiTroXuLy3, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tthc trang thai ho sos before and after the current tthc trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy3 = &#63;.
	 *
	 * @param id the primary key of the current tthc trang thai ho so
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy3 the vai tro xu ly3
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tthc trang thai ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcTrangThaiHoSoException if a tthc trang thai ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcTrangThaiHoSo[] findByQuyTrinhThuTucIdAndVaiTroXuLy3_PrevAndNext(
		long id, long quyTrinhThuTucId, long vaiTroXuLy3,
		OrderByComparator orderByComparator)
		throws NoSuchTthcTrangThaiHoSoException, SystemException {
		TthcTrangThaiHoSo tthcTrangThaiHoSo = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TthcTrangThaiHoSo[] array = new TthcTrangThaiHoSoImpl[3];

			array[0] = getByQuyTrinhThuTucIdAndVaiTroXuLy3_PrevAndNext(session,
					tthcTrangThaiHoSo, quyTrinhThuTucId, vaiTroXuLy3,
					orderByComparator, true);

			array[1] = tthcTrangThaiHoSo;

			array[2] = getByQuyTrinhThuTucIdAndVaiTroXuLy3_PrevAndNext(session,
					tthcTrangThaiHoSo, quyTrinhThuTucId, vaiTroXuLy3,
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

	protected TthcTrangThaiHoSo getByQuyTrinhThuTucIdAndVaiTroXuLy3_PrevAndNext(
		Session session, TthcTrangThaiHoSo tthcTrangThaiHoSo,
		long quyTrinhThuTucId, long vaiTroXuLy3,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TTHCTRANGTHAIHOSO_WHERE);

		query.append(_FINDER_COLUMN_QUYTRINHTHUTUCIDANDVAITROXULY3_QUYTRINHTHUTUCID_2);

		query.append(_FINDER_COLUMN_QUYTRINHTHUTUCIDANDVAITROXULY3_VAITROXULY3_2);

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
			query.append(TthcTrangThaiHoSoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(quyTrinhThuTucId);

		qPos.add(vaiTroXuLy3);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tthcTrangThaiHoSo);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TthcTrangThaiHoSo> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tthc trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy3 = &#63; from the database.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy3 the vai tro xu ly3
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByQuyTrinhThuTucIdAndVaiTroXuLy3(long quyTrinhThuTucId,
		long vaiTroXuLy3) throws SystemException {
		for (TthcTrangThaiHoSo tthcTrangThaiHoSo : findByQuyTrinhThuTucIdAndVaiTroXuLy3(
				quyTrinhThuTucId, vaiTroXuLy3, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tthcTrangThaiHoSo);
		}
	}

	/**
	 * Returns the number of tthc trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy3 = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy3 the vai tro xu ly3
	 * @return the number of matching tthc trang thai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByQuyTrinhThuTucIdAndVaiTroXuLy3(long quyTrinhThuTucId,
		long vaiTroXuLy3) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_QUYTRINHTHUTUCIDANDVAITROXULY3;

		Object[] finderArgs = new Object[] { quyTrinhThuTucId, vaiTroXuLy3 };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TTHCTRANGTHAIHOSO_WHERE);

			query.append(_FINDER_COLUMN_QUYTRINHTHUTUCIDANDVAITROXULY3_QUYTRINHTHUTUCID_2);

			query.append(_FINDER_COLUMN_QUYTRINHTHUTUCIDANDVAITROXULY3_VAITROXULY3_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(quyTrinhThuTucId);

				qPos.add(vaiTroXuLy3);

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

	private static final String _FINDER_COLUMN_QUYTRINHTHUTUCIDANDVAITROXULY3_QUYTRINHTHUTUCID_2 =
		"tthcTrangThaiHoSo.quyTrinhThuTucId = ? AND ";
	private static final String _FINDER_COLUMN_QUYTRINHTHUTUCIDANDVAITROXULY3_VAITROXULY3_2 =
		"tthcTrangThaiHoSo.vaiTroXuLy3 = ?";

	public TthcTrangThaiHoSoPersistenceImpl() {
		setModelClass(TthcTrangThaiHoSo.class);
	}

	/**
	 * Caches the tthc trang thai ho so in the entity cache if it is enabled.
	 *
	 * @param tthcTrangThaiHoSo the tthc trang thai ho so
	 */
	@Override
	public void cacheResult(TthcTrangThaiHoSo tthcTrangThaiHoSo) {
		EntityCacheUtil.putResult(TthcTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcTrangThaiHoSoImpl.class, tthcTrangThaiHoSo.getPrimaryKey(),
			tthcTrangThaiHoSo);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATRANGTHAI,
			new Object[] { tthcTrangThaiHoSo.getMaTrangThai() },
			tthcTrangThaiHoSo);

		tthcTrangThaiHoSo.resetOriginalValues();
	}

	/**
	 * Caches the tthc trang thai ho sos in the entity cache if it is enabled.
	 *
	 * @param tthcTrangThaiHoSos the tthc trang thai ho sos
	 */
	@Override
	public void cacheResult(List<TthcTrangThaiHoSo> tthcTrangThaiHoSos) {
		for (TthcTrangThaiHoSo tthcTrangThaiHoSo : tthcTrangThaiHoSos) {
			if (EntityCacheUtil.getResult(
						TthcTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
						TthcTrangThaiHoSoImpl.class,
						tthcTrangThaiHoSo.getPrimaryKey()) == null) {
				cacheResult(tthcTrangThaiHoSo);
			}
			else {
				tthcTrangThaiHoSo.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tthc trang thai ho sos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TthcTrangThaiHoSoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TthcTrangThaiHoSoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tthc trang thai ho so.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TthcTrangThaiHoSo tthcTrangThaiHoSo) {
		EntityCacheUtil.removeResult(TthcTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcTrangThaiHoSoImpl.class, tthcTrangThaiHoSo.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(tthcTrangThaiHoSo);
	}

	@Override
	public void clearCache(List<TthcTrangThaiHoSo> tthcTrangThaiHoSos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TthcTrangThaiHoSo tthcTrangThaiHoSo : tthcTrangThaiHoSos) {
			EntityCacheUtil.removeResult(TthcTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
				TthcTrangThaiHoSoImpl.class, tthcTrangThaiHoSo.getPrimaryKey());

			clearUniqueFindersCache(tthcTrangThaiHoSo);
		}
	}

	protected void cacheUniqueFindersCache(TthcTrangThaiHoSo tthcTrangThaiHoSo) {
		if (tthcTrangThaiHoSo.isNew()) {
			Object[] args = new Object[] { tthcTrangThaiHoSo.getMaTrangThai() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MATRANGTHAI, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATRANGTHAI, args,
				tthcTrangThaiHoSo);
		}
		else {
			TthcTrangThaiHoSoModelImpl tthcTrangThaiHoSoModelImpl = (TthcTrangThaiHoSoModelImpl)tthcTrangThaiHoSo;

			if ((tthcTrangThaiHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_MATRANGTHAI.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { tthcTrangThaiHoSo.getMaTrangThai() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MATRANGTHAI,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATRANGTHAI,
					args, tthcTrangThaiHoSo);
			}
		}
	}

	protected void clearUniqueFindersCache(TthcTrangThaiHoSo tthcTrangThaiHoSo) {
		TthcTrangThaiHoSoModelImpl tthcTrangThaiHoSoModelImpl = (TthcTrangThaiHoSoModelImpl)tthcTrangThaiHoSo;

		Object[] args = new Object[] { tthcTrangThaiHoSo.getMaTrangThai() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MATRANGTHAI, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MATRANGTHAI, args);

		if ((tthcTrangThaiHoSoModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_MATRANGTHAI.getColumnBitmask()) != 0) {
			args = new Object[] {
					tthcTrangThaiHoSoModelImpl.getOriginalMaTrangThai()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MATRANGTHAI, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MATRANGTHAI, args);
		}
	}

	/**
	 * Creates a new tthc trang thai ho so with the primary key. Does not add the tthc trang thai ho so to the database.
	 *
	 * @param id the primary key for the new tthc trang thai ho so
	 * @return the new tthc trang thai ho so
	 */
	@Override
	public TthcTrangThaiHoSo create(long id) {
		TthcTrangThaiHoSo tthcTrangThaiHoSo = new TthcTrangThaiHoSoImpl();

		tthcTrangThaiHoSo.setNew(true);
		tthcTrangThaiHoSo.setPrimaryKey(id);

		return tthcTrangThaiHoSo;
	}

	/**
	 * Removes the tthc trang thai ho so with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the tthc trang thai ho so
	 * @return the tthc trang thai ho so that was removed
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcTrangThaiHoSoException if a tthc trang thai ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcTrangThaiHoSo remove(long id)
		throws NoSuchTthcTrangThaiHoSoException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the tthc trang thai ho so with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tthc trang thai ho so
	 * @return the tthc trang thai ho so that was removed
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcTrangThaiHoSoException if a tthc trang thai ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcTrangThaiHoSo remove(Serializable primaryKey)
		throws NoSuchTthcTrangThaiHoSoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TthcTrangThaiHoSo tthcTrangThaiHoSo = (TthcTrangThaiHoSo)session.get(TthcTrangThaiHoSoImpl.class,
					primaryKey);

			if (tthcTrangThaiHoSo == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTthcTrangThaiHoSoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tthcTrangThaiHoSo);
		}
		catch (NoSuchTthcTrangThaiHoSoException nsee) {
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
	protected TthcTrangThaiHoSo removeImpl(TthcTrangThaiHoSo tthcTrangThaiHoSo)
		throws SystemException {
		tthcTrangThaiHoSo = toUnwrappedModel(tthcTrangThaiHoSo);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tthcTrangThaiHoSo)) {
				tthcTrangThaiHoSo = (TthcTrangThaiHoSo)session.get(TthcTrangThaiHoSoImpl.class,
						tthcTrangThaiHoSo.getPrimaryKeyObj());
			}

			if (tthcTrangThaiHoSo != null) {
				session.delete(tthcTrangThaiHoSo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tthcTrangThaiHoSo != null) {
			clearCache(tthcTrangThaiHoSo);
		}

		return tthcTrangThaiHoSo;
	}

	@Override
	public TthcTrangThaiHoSo updateImpl(
		vn.dtt.duongbo.dao.common.model.TthcTrangThaiHoSo tthcTrangThaiHoSo)
		throws SystemException {
		tthcTrangThaiHoSo = toUnwrappedModel(tthcTrangThaiHoSo);

		boolean isNew = tthcTrangThaiHoSo.isNew();

		TthcTrangThaiHoSoModelImpl tthcTrangThaiHoSoModelImpl = (TthcTrangThaiHoSoModelImpl)tthcTrangThaiHoSo;

		Session session = null;

		try {
			session = openSession();

			if (tthcTrangThaiHoSo.isNew()) {
				session.save(tthcTrangThaiHoSo);

				tthcTrangThaiHoSo.setNew(false);
			}
			else {
				session.merge(tthcTrangThaiHoSo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TthcTrangThaiHoSoModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tthcTrangThaiHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcTrangThaiHoSoModelImpl.getOriginalQuyTrinhThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_QUYTRINHTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCID,
					args);

				args = new Object[] {
						tthcTrangThaiHoSoModelImpl.getQuyTrinhThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_QUYTRINHTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCID,
					args);
			}

			if ((tthcTrangThaiHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDVAITROXULY1.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcTrangThaiHoSoModelImpl.getOriginalQuyTrinhThuTucId(),
						tthcTrangThaiHoSoModelImpl.getOriginalVaiTroXuLy1()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_QUYTRINHTHUTUCIDANDVAITROXULY1,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDVAITROXULY1,
					args);

				args = new Object[] {
						tthcTrangThaiHoSoModelImpl.getQuyTrinhThuTucId(),
						tthcTrangThaiHoSoModelImpl.getVaiTroXuLy1()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_QUYTRINHTHUTUCIDANDVAITROXULY1,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDVAITROXULY1,
					args);
			}

			if ((tthcTrangThaiHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDVAITROXULY2.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcTrangThaiHoSoModelImpl.getOriginalQuyTrinhThuTucId(),
						tthcTrangThaiHoSoModelImpl.getOriginalVaiTroXuLy2()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_QUYTRINHTHUTUCIDANDVAITROXULY2,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDVAITROXULY2,
					args);

				args = new Object[] {
						tthcTrangThaiHoSoModelImpl.getQuyTrinhThuTucId(),
						tthcTrangThaiHoSoModelImpl.getVaiTroXuLy2()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_QUYTRINHTHUTUCIDANDVAITROXULY2,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDVAITROXULY2,
					args);
			}

			if ((tthcTrangThaiHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDVAITROXULY3.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tthcTrangThaiHoSoModelImpl.getOriginalQuyTrinhThuTucId(),
						tthcTrangThaiHoSoModelImpl.getOriginalVaiTroXuLy3()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_QUYTRINHTHUTUCIDANDVAITROXULY3,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDVAITROXULY3,
					args);

				args = new Object[] {
						tthcTrangThaiHoSoModelImpl.getQuyTrinhThuTucId(),
						tthcTrangThaiHoSoModelImpl.getVaiTroXuLy3()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_QUYTRINHTHUTUCIDANDVAITROXULY3,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDVAITROXULY3,
					args);
			}
		}

		EntityCacheUtil.putResult(TthcTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			TthcTrangThaiHoSoImpl.class, tthcTrangThaiHoSo.getPrimaryKey(),
			tthcTrangThaiHoSo);

		clearUniqueFindersCache(tthcTrangThaiHoSo);
		cacheUniqueFindersCache(tthcTrangThaiHoSo);

		return tthcTrangThaiHoSo;
	}

	protected TthcTrangThaiHoSo toUnwrappedModel(
		TthcTrangThaiHoSo tthcTrangThaiHoSo) {
		if (tthcTrangThaiHoSo instanceof TthcTrangThaiHoSoImpl) {
			return tthcTrangThaiHoSo;
		}

		TthcTrangThaiHoSoImpl tthcTrangThaiHoSoImpl = new TthcTrangThaiHoSoImpl();

		tthcTrangThaiHoSoImpl.setNew(tthcTrangThaiHoSo.isNew());
		tthcTrangThaiHoSoImpl.setPrimaryKey(tthcTrangThaiHoSo.getPrimaryKey());

		tthcTrangThaiHoSoImpl.setId(tthcTrangThaiHoSo.getId());
		tthcTrangThaiHoSoImpl.setQuyTrinhThuTucId(tthcTrangThaiHoSo.getQuyTrinhThuTucId());
		tthcTrangThaiHoSoImpl.setMaTrangThai(tthcTrangThaiHoSo.getMaTrangThai());
		tthcTrangThaiHoSoImpl.setTenTrangThai(tthcTrangThaiHoSo.getTenTrangThai());
		tthcTrangThaiHoSoImpl.setTenTiengAnh(tthcTrangThaiHoSo.getTenTiengAnh());
		tthcTrangThaiHoSoImpl.setSoThuTu(tthcTrangThaiHoSo.getSoThuTu());
		tthcTrangThaiHoSoImpl.setTrangThaiKetThuc(tthcTrangThaiHoSo.getTrangThaiKetThuc());
		tthcTrangThaiHoSoImpl.setMoTaTrangThai(tthcTrangThaiHoSo.getMoTaTrangThai());
		tthcTrangThaiHoSoImpl.setVaiTroXuLy1(tthcTrangThaiHoSo.getVaiTroXuLy1());
		tthcTrangThaiHoSoImpl.setVaiTroXuLy2(tthcTrangThaiHoSo.getVaiTroXuLy2());
		tthcTrangThaiHoSoImpl.setVaiTroXuLy3(tthcTrangThaiHoSo.getVaiTroXuLy3());
		tthcTrangThaiHoSoImpl.setFormXuLy(tthcTrangThaiHoSo.getFormXuLy());

		return tthcTrangThaiHoSoImpl;
	}

	/**
	 * Returns the tthc trang thai ho so with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc trang thai ho so
	 * @return the tthc trang thai ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcTrangThaiHoSoException if a tthc trang thai ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcTrangThaiHoSo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTthcTrangThaiHoSoException, SystemException {
		TthcTrangThaiHoSo tthcTrangThaiHoSo = fetchByPrimaryKey(primaryKey);

		if (tthcTrangThaiHoSo == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTthcTrangThaiHoSoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tthcTrangThaiHoSo;
	}

	/**
	 * Returns the tthc trang thai ho so with the primary key or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcTrangThaiHoSoException} if it could not be found.
	 *
	 * @param id the primary key of the tthc trang thai ho so
	 * @return the tthc trang thai ho so
	 * @throws vn.dtt.duongbo.dao.common.NoSuchTthcTrangThaiHoSoException if a tthc trang thai ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcTrangThaiHoSo findByPrimaryKey(long id)
		throws NoSuchTthcTrangThaiHoSoException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the tthc trang thai ho so with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tthc trang thai ho so
	 * @return the tthc trang thai ho so, or <code>null</code> if a tthc trang thai ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcTrangThaiHoSo fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TthcTrangThaiHoSo tthcTrangThaiHoSo = (TthcTrangThaiHoSo)EntityCacheUtil.getResult(TthcTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
				TthcTrangThaiHoSoImpl.class, primaryKey);

		if (tthcTrangThaiHoSo == _nullTthcTrangThaiHoSo) {
			return null;
		}

		if (tthcTrangThaiHoSo == null) {
			Session session = null;

			try {
				session = openSession();

				tthcTrangThaiHoSo = (TthcTrangThaiHoSo)session.get(TthcTrangThaiHoSoImpl.class,
						primaryKey);

				if (tthcTrangThaiHoSo != null) {
					cacheResult(tthcTrangThaiHoSo);
				}
				else {
					EntityCacheUtil.putResult(TthcTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
						TthcTrangThaiHoSoImpl.class, primaryKey,
						_nullTthcTrangThaiHoSo);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TthcTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
					TthcTrangThaiHoSoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tthcTrangThaiHoSo;
	}

	/**
	 * Returns the tthc trang thai ho so with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the tthc trang thai ho so
	 * @return the tthc trang thai ho so, or <code>null</code> if a tthc trang thai ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TthcTrangThaiHoSo fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the tthc trang thai ho sos.
	 *
	 * @return the tthc trang thai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcTrangThaiHoSo> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tthc trang thai ho sos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcTrangThaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc trang thai ho sos
	 * @param end the upper bound of the range of tthc trang thai ho sos (not inclusive)
	 * @return the range of tthc trang thai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcTrangThaiHoSo> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tthc trang thai ho sos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcTrangThaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of tthc trang thai ho sos
	 * @param end the upper bound of the range of tthc trang thai ho sos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tthc trang thai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TthcTrangThaiHoSo> findAll(int start, int end,
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

		List<TthcTrangThaiHoSo> list = (List<TthcTrangThaiHoSo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TTHCTRANGTHAIHOSO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TTHCTRANGTHAIHOSO;

				if (pagination) {
					sql = sql.concat(TthcTrangThaiHoSoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TthcTrangThaiHoSo>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TthcTrangThaiHoSo>(list);
				}
				else {
					list = (List<TthcTrangThaiHoSo>)QueryUtil.list(q,
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
	 * Removes all the tthc trang thai ho sos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TthcTrangThaiHoSo tthcTrangThaiHoSo : findAll()) {
			remove(tthcTrangThaiHoSo);
		}
	}

	/**
	 * Returns the number of tthc trang thai ho sos.
	 *
	 * @return the number of tthc trang thai ho sos
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

				Query q = session.createQuery(_SQL_COUNT_TTHCTRANGTHAIHOSO);

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
	 * Initializes the tthc trang thai ho so persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.common.model.TthcTrangThaiHoSo")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TthcTrangThaiHoSo>> listenersList = new ArrayList<ModelListener<TthcTrangThaiHoSo>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TthcTrangThaiHoSo>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TthcTrangThaiHoSoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TTHCTRANGTHAIHOSO = "SELECT tthcTrangThaiHoSo FROM TthcTrangThaiHoSo tthcTrangThaiHoSo";
	private static final String _SQL_SELECT_TTHCTRANGTHAIHOSO_WHERE = "SELECT tthcTrangThaiHoSo FROM TthcTrangThaiHoSo tthcTrangThaiHoSo WHERE ";
	private static final String _SQL_COUNT_TTHCTRANGTHAIHOSO = "SELECT COUNT(tthcTrangThaiHoSo) FROM TthcTrangThaiHoSo tthcTrangThaiHoSo";
	private static final String _SQL_COUNT_TTHCTRANGTHAIHOSO_WHERE = "SELECT COUNT(tthcTrangThaiHoSo) FROM TthcTrangThaiHoSo tthcTrangThaiHoSo WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tthcTrangThaiHoSo.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TthcTrangThaiHoSo exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TthcTrangThaiHoSo exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TthcTrangThaiHoSoPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"maTrangThai", "tenTrangThai", "tenTiengAnh", "soThuTu",
				"trangThaiKetThuc", "moTaTrangThai", "vaiTroXuLy1",
				"vaiTroXuLy2", "vaiTroXuLy3", "formXuLy"
			});
	private static TthcTrangThaiHoSo _nullTthcTrangThaiHoSo = new TthcTrangThaiHoSoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TthcTrangThaiHoSo> toCacheModel() {
				return _nullTthcTrangThaiHoSoCacheModel;
			}
		};

	private static CacheModel<TthcTrangThaiHoSo> _nullTthcTrangThaiHoSoCacheModel =
		new CacheModel<TthcTrangThaiHoSo>() {
			@Override
			public TthcTrangThaiHoSo toEntityModel() {
				return _nullTthcTrangThaiHoSo;
			}
		};
}