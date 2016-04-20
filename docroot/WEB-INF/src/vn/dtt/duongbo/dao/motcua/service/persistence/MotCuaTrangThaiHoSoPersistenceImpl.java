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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.duongbo.dao.motcua.NoSuchMotCuaTrangThaiHoSoException;
import vn.dtt.duongbo.dao.motcua.model.MotCuaTrangThaiHoSo;
import vn.dtt.duongbo.dao.motcua.model.impl.MotCuaTrangThaiHoSoImpl;
import vn.dtt.duongbo.dao.motcua.model.impl.MotCuaTrangThaiHoSoModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the mot cua trang thai ho so service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see MotCuaTrangThaiHoSoPersistence
 * @see MotCuaTrangThaiHoSoUtil
 * @generated
 */
public class MotCuaTrangThaiHoSoPersistenceImpl extends BasePersistenceImpl<MotCuaTrangThaiHoSo>
	implements MotCuaTrangThaiHoSoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link MotCuaTrangThaiHoSoUtil} to access the mot cua trang thai ho so persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = MotCuaTrangThaiHoSoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MotCuaTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaTrangThaiHoSoModelImpl.FINDER_CACHE_ENABLED,
			MotCuaTrangThaiHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MotCuaTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaTrangThaiHoSoModelImpl.FINDER_CACHE_ENABLED,
			MotCuaTrangThaiHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MotCuaTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaTrangThaiHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_QUYTRINHTHUTUCID =
		new FinderPath(MotCuaTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaTrangThaiHoSoModelImpl.FINDER_CACHE_ENABLED,
			MotCuaTrangThaiHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByQuyTrinhThuTucId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCID =
		new FinderPath(MotCuaTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaTrangThaiHoSoModelImpl.FINDER_CACHE_ENABLED,
			MotCuaTrangThaiHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByQuyTrinhThuTucId", new String[] { Long.class.getName() },
			MotCuaTrangThaiHoSoModelImpl.QUYTRINHTHUTUCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_QUYTRINHTHUTUCID = new FinderPath(MotCuaTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaTrangThaiHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByQuyTrinhThuTucId", new String[] { Long.class.getName() });

	/**
	 * Returns all the mot cua trang thai ho sos where quyTrinhThuTucId = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @return the matching mot cua trang thai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaTrangThaiHoSo> findByQuyTrinhThuTucId(
		long quyTrinhThuTucId) throws SystemException {
		return findByQuyTrinhThuTucId(quyTrinhThuTucId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua trang thai ho sos where quyTrinhThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaTrangThaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param start the lower bound of the range of mot cua trang thai ho sos
	 * @param end the upper bound of the range of mot cua trang thai ho sos (not inclusive)
	 * @return the range of matching mot cua trang thai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaTrangThaiHoSo> findByQuyTrinhThuTucId(
		long quyTrinhThuTucId, int start, int end) throws SystemException {
		return findByQuyTrinhThuTucId(quyTrinhThuTucId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua trang thai ho sos where quyTrinhThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaTrangThaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param start the lower bound of the range of mot cua trang thai ho sos
	 * @param end the upper bound of the range of mot cua trang thai ho sos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mot cua trang thai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaTrangThaiHoSo> findByQuyTrinhThuTucId(
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

		List<MotCuaTrangThaiHoSo> list = (List<MotCuaTrangThaiHoSo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MotCuaTrangThaiHoSo motCuaTrangThaiHoSo : list) {
				if ((quyTrinhThuTucId != motCuaTrangThaiHoSo.getQuyTrinhThuTucId())) {
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

			query.append(_SQL_SELECT_MOTCUATRANGTHAIHOSO_WHERE);

			query.append(_FINDER_COLUMN_QUYTRINHTHUTUCID_QUYTRINHTHUTUCID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MotCuaTrangThaiHoSoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(quyTrinhThuTucId);

				if (!pagination) {
					list = (List<MotCuaTrangThaiHoSo>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaTrangThaiHoSo>(list);
				}
				else {
					list = (List<MotCuaTrangThaiHoSo>)QueryUtil.list(q,
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
	 * Returns the first mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua trang thai ho so
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaTrangThaiHoSoException if a matching mot cua trang thai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaTrangThaiHoSo findByQuyTrinhThuTucId_First(
		long quyTrinhThuTucId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaTrangThaiHoSoException, SystemException {
		MotCuaTrangThaiHoSo motCuaTrangThaiHoSo = fetchByQuyTrinhThuTucId_First(quyTrinhThuTucId,
				orderByComparator);

		if (motCuaTrangThaiHoSo != null) {
			return motCuaTrangThaiHoSo;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("quyTrinhThuTucId=");
		msg.append(quyTrinhThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaTrangThaiHoSoException(msg.toString());
	}

	/**
	 * Returns the first mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua trang thai ho so, or <code>null</code> if a matching mot cua trang thai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaTrangThaiHoSo fetchByQuyTrinhThuTucId_First(
		long quyTrinhThuTucId, OrderByComparator orderByComparator)
		throws SystemException {
		List<MotCuaTrangThaiHoSo> list = findByQuyTrinhThuTucId(quyTrinhThuTucId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua trang thai ho so
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaTrangThaiHoSoException if a matching mot cua trang thai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaTrangThaiHoSo findByQuyTrinhThuTucId_Last(
		long quyTrinhThuTucId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaTrangThaiHoSoException, SystemException {
		MotCuaTrangThaiHoSo motCuaTrangThaiHoSo = fetchByQuyTrinhThuTucId_Last(quyTrinhThuTucId,
				orderByComparator);

		if (motCuaTrangThaiHoSo != null) {
			return motCuaTrangThaiHoSo;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("quyTrinhThuTucId=");
		msg.append(quyTrinhThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaTrangThaiHoSoException(msg.toString());
	}

	/**
	 * Returns the last mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua trang thai ho so, or <code>null</code> if a matching mot cua trang thai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaTrangThaiHoSo fetchByQuyTrinhThuTucId_Last(
		long quyTrinhThuTucId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByQuyTrinhThuTucId(quyTrinhThuTucId);

		if (count == 0) {
			return null;
		}

		List<MotCuaTrangThaiHoSo> list = findByQuyTrinhThuTucId(quyTrinhThuTucId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mot cua trang thai ho sos before and after the current mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63;.
	 *
	 * @param id the primary key of the current mot cua trang thai ho so
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mot cua trang thai ho so
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaTrangThaiHoSoException if a mot cua trang thai ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaTrangThaiHoSo[] findByQuyTrinhThuTucId_PrevAndNext(long id,
		long quyTrinhThuTucId, OrderByComparator orderByComparator)
		throws NoSuchMotCuaTrangThaiHoSoException, SystemException {
		MotCuaTrangThaiHoSo motCuaTrangThaiHoSo = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			MotCuaTrangThaiHoSo[] array = new MotCuaTrangThaiHoSoImpl[3];

			array[0] = getByQuyTrinhThuTucId_PrevAndNext(session,
					motCuaTrangThaiHoSo, quyTrinhThuTucId, orderByComparator,
					true);

			array[1] = motCuaTrangThaiHoSo;

			array[2] = getByQuyTrinhThuTucId_PrevAndNext(session,
					motCuaTrangThaiHoSo, quyTrinhThuTucId, orderByComparator,
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

	protected MotCuaTrangThaiHoSo getByQuyTrinhThuTucId_PrevAndNext(
		Session session, MotCuaTrangThaiHoSo motCuaTrangThaiHoSo,
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

		query.append(_SQL_SELECT_MOTCUATRANGTHAIHOSO_WHERE);

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
			query.append(MotCuaTrangThaiHoSoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(quyTrinhThuTucId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(motCuaTrangThaiHoSo);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MotCuaTrangThaiHoSo> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mot cua trang thai ho sos where quyTrinhThuTucId = &#63; from the database.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByQuyTrinhThuTucId(long quyTrinhThuTucId)
		throws SystemException {
		for (MotCuaTrangThaiHoSo motCuaTrangThaiHoSo : findByQuyTrinhThuTucId(
				quyTrinhThuTucId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(motCuaTrangThaiHoSo);
		}
	}

	/**
	 * Returns the number of mot cua trang thai ho sos where quyTrinhThuTucId = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @return the number of matching mot cua trang thai ho sos
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

			query.append(_SQL_COUNT_MOTCUATRANGTHAIHOSO_WHERE);

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
		"motCuaTrangThaiHoSo.quyTrinhThuTucId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_MATRANGTHAI = new FinderPath(MotCuaTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaTrangThaiHoSoModelImpl.FINDER_CACHE_ENABLED,
			MotCuaTrangThaiHoSoImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByMaTrangThai", new String[] { String.class.getName() },
			MotCuaTrangThaiHoSoModelImpl.MATRANGTHAI_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MATRANGTHAI = new FinderPath(MotCuaTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaTrangThaiHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMaTrangThai",
			new String[] { String.class.getName() });

	/**
	 * Returns the mot cua trang thai ho so where maTrangThai = &#63; or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchMotCuaTrangThaiHoSoException} if it could not be found.
	 *
	 * @param maTrangThai the ma trang thai
	 * @return the matching mot cua trang thai ho so
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaTrangThaiHoSoException if a matching mot cua trang thai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaTrangThaiHoSo findByMaTrangThai(String maTrangThai)
		throws NoSuchMotCuaTrangThaiHoSoException, SystemException {
		MotCuaTrangThaiHoSo motCuaTrangThaiHoSo = fetchByMaTrangThai(maTrangThai);

		if (motCuaTrangThaiHoSo == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("maTrangThai=");
			msg.append(maTrangThai);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchMotCuaTrangThaiHoSoException(msg.toString());
		}

		return motCuaTrangThaiHoSo;
	}

	/**
	 * Returns the mot cua trang thai ho so where maTrangThai = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param maTrangThai the ma trang thai
	 * @return the matching mot cua trang thai ho so, or <code>null</code> if a matching mot cua trang thai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaTrangThaiHoSo fetchByMaTrangThai(String maTrangThai)
		throws SystemException {
		return fetchByMaTrangThai(maTrangThai, true);
	}

	/**
	 * Returns the mot cua trang thai ho so where maTrangThai = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param maTrangThai the ma trang thai
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching mot cua trang thai ho so, or <code>null</code> if a matching mot cua trang thai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaTrangThaiHoSo fetchByMaTrangThai(String maTrangThai,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { maTrangThai };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_MATRANGTHAI,
					finderArgs, this);
		}

		if (result instanceof MotCuaTrangThaiHoSo) {
			MotCuaTrangThaiHoSo motCuaTrangThaiHoSo = (MotCuaTrangThaiHoSo)result;

			if (!Validator.equals(maTrangThai,
						motCuaTrangThaiHoSo.getMaTrangThai())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_MOTCUATRANGTHAIHOSO_WHERE);

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

				List<MotCuaTrangThaiHoSo> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATRANGTHAI,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"MotCuaTrangThaiHoSoPersistenceImpl.fetchByMaTrangThai(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					MotCuaTrangThaiHoSo motCuaTrangThaiHoSo = list.get(0);

					result = motCuaTrangThaiHoSo;

					cacheResult(motCuaTrangThaiHoSo);

					if ((motCuaTrangThaiHoSo.getMaTrangThai() == null) ||
							!motCuaTrangThaiHoSo.getMaTrangThai()
													.equals(maTrangThai)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATRANGTHAI,
							finderArgs, motCuaTrangThaiHoSo);
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
			return (MotCuaTrangThaiHoSo)result;
		}
	}

	/**
	 * Removes the mot cua trang thai ho so where maTrangThai = &#63; from the database.
	 *
	 * @param maTrangThai the ma trang thai
	 * @return the mot cua trang thai ho so that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaTrangThaiHoSo removeByMaTrangThai(String maTrangThai)
		throws NoSuchMotCuaTrangThaiHoSoException, SystemException {
		MotCuaTrangThaiHoSo motCuaTrangThaiHoSo = findByMaTrangThai(maTrangThai);

		return remove(motCuaTrangThaiHoSo);
	}

	/**
	 * Returns the number of mot cua trang thai ho sos where maTrangThai = &#63;.
	 *
	 * @param maTrangThai the ma trang thai
	 * @return the number of matching mot cua trang thai ho sos
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

			query.append(_SQL_COUNT_MOTCUATRANGTHAIHOSO_WHERE);

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

	private static final String _FINDER_COLUMN_MATRANGTHAI_MATRANGTHAI_1 = "motCuaTrangThaiHoSo.maTrangThai IS NULL";
	private static final String _FINDER_COLUMN_MATRANGTHAI_MATRANGTHAI_2 = "motCuaTrangThaiHoSo.maTrangThai = ?";
	private static final String _FINDER_COLUMN_MATRANGTHAI_MATRANGTHAI_3 = "(motCuaTrangThaiHoSo.maTrangThai IS NULL OR motCuaTrangThaiHoSo.maTrangThai = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDVAITROXULY1 =
		new FinderPath(MotCuaTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaTrangThaiHoSoModelImpl.FINDER_CACHE_ENABLED,
			MotCuaTrangThaiHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByQuyTrinhThuTucIdAndVaiTroXuLy1",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDVAITROXULY1 =
		new FinderPath(MotCuaTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaTrangThaiHoSoModelImpl.FINDER_CACHE_ENABLED,
			MotCuaTrangThaiHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByQuyTrinhThuTucIdAndVaiTroXuLy1",
			new String[] { Long.class.getName(), Long.class.getName() },
			MotCuaTrangThaiHoSoModelImpl.QUYTRINHTHUTUCID_COLUMN_BITMASK |
			MotCuaTrangThaiHoSoModelImpl.VAITROXULY1_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_QUYTRINHTHUTUCIDANDVAITROXULY1 =
		new FinderPath(MotCuaTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaTrangThaiHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByQuyTrinhThuTucIdAndVaiTroXuLy1",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the mot cua trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy1 = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy1 the vai tro xu ly1
	 * @return the matching mot cua trang thai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaTrangThaiHoSo> findByQuyTrinhThuTucIdAndVaiTroXuLy1(
		long quyTrinhThuTucId, long vaiTroXuLy1) throws SystemException {
		return findByQuyTrinhThuTucIdAndVaiTroXuLy1(quyTrinhThuTucId,
			vaiTroXuLy1, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy1 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaTrangThaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy1 the vai tro xu ly1
	 * @param start the lower bound of the range of mot cua trang thai ho sos
	 * @param end the upper bound of the range of mot cua trang thai ho sos (not inclusive)
	 * @return the range of matching mot cua trang thai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaTrangThaiHoSo> findByQuyTrinhThuTucIdAndVaiTroXuLy1(
		long quyTrinhThuTucId, long vaiTroXuLy1, int start, int end)
		throws SystemException {
		return findByQuyTrinhThuTucIdAndVaiTroXuLy1(quyTrinhThuTucId,
			vaiTroXuLy1, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy1 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaTrangThaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy1 the vai tro xu ly1
	 * @param start the lower bound of the range of mot cua trang thai ho sos
	 * @param end the upper bound of the range of mot cua trang thai ho sos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mot cua trang thai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaTrangThaiHoSo> findByQuyTrinhThuTucIdAndVaiTroXuLy1(
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

		List<MotCuaTrangThaiHoSo> list = (List<MotCuaTrangThaiHoSo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MotCuaTrangThaiHoSo motCuaTrangThaiHoSo : list) {
				if ((quyTrinhThuTucId != motCuaTrangThaiHoSo.getQuyTrinhThuTucId()) ||
						(vaiTroXuLy1 != motCuaTrangThaiHoSo.getVaiTroXuLy1())) {
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

			query.append(_SQL_SELECT_MOTCUATRANGTHAIHOSO_WHERE);

			query.append(_FINDER_COLUMN_QUYTRINHTHUTUCIDANDVAITROXULY1_QUYTRINHTHUTUCID_2);

			query.append(_FINDER_COLUMN_QUYTRINHTHUTUCIDANDVAITROXULY1_VAITROXULY1_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MotCuaTrangThaiHoSoModelImpl.ORDER_BY_JPQL);
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
					list = (List<MotCuaTrangThaiHoSo>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaTrangThaiHoSo>(list);
				}
				else {
					list = (List<MotCuaTrangThaiHoSo>)QueryUtil.list(q,
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
	 * Returns the first mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy1 = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy1 the vai tro xu ly1
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua trang thai ho so
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaTrangThaiHoSoException if a matching mot cua trang thai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaTrangThaiHoSo findByQuyTrinhThuTucIdAndVaiTroXuLy1_First(
		long quyTrinhThuTucId, long vaiTroXuLy1,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaTrangThaiHoSoException, SystemException {
		MotCuaTrangThaiHoSo motCuaTrangThaiHoSo = fetchByQuyTrinhThuTucIdAndVaiTroXuLy1_First(quyTrinhThuTucId,
				vaiTroXuLy1, orderByComparator);

		if (motCuaTrangThaiHoSo != null) {
			return motCuaTrangThaiHoSo;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("quyTrinhThuTucId=");
		msg.append(quyTrinhThuTucId);

		msg.append(", vaiTroXuLy1=");
		msg.append(vaiTroXuLy1);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaTrangThaiHoSoException(msg.toString());
	}

	/**
	 * Returns the first mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy1 = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy1 the vai tro xu ly1
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua trang thai ho so, or <code>null</code> if a matching mot cua trang thai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaTrangThaiHoSo fetchByQuyTrinhThuTucIdAndVaiTroXuLy1_First(
		long quyTrinhThuTucId, long vaiTroXuLy1,
		OrderByComparator orderByComparator) throws SystemException {
		List<MotCuaTrangThaiHoSo> list = findByQuyTrinhThuTucIdAndVaiTroXuLy1(quyTrinhThuTucId,
				vaiTroXuLy1, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy1 = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy1 the vai tro xu ly1
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua trang thai ho so
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaTrangThaiHoSoException if a matching mot cua trang thai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaTrangThaiHoSo findByQuyTrinhThuTucIdAndVaiTroXuLy1_Last(
		long quyTrinhThuTucId, long vaiTroXuLy1,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaTrangThaiHoSoException, SystemException {
		MotCuaTrangThaiHoSo motCuaTrangThaiHoSo = fetchByQuyTrinhThuTucIdAndVaiTroXuLy1_Last(quyTrinhThuTucId,
				vaiTroXuLy1, orderByComparator);

		if (motCuaTrangThaiHoSo != null) {
			return motCuaTrangThaiHoSo;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("quyTrinhThuTucId=");
		msg.append(quyTrinhThuTucId);

		msg.append(", vaiTroXuLy1=");
		msg.append(vaiTroXuLy1);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaTrangThaiHoSoException(msg.toString());
	}

	/**
	 * Returns the last mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy1 = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy1 the vai tro xu ly1
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua trang thai ho so, or <code>null</code> if a matching mot cua trang thai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaTrangThaiHoSo fetchByQuyTrinhThuTucIdAndVaiTroXuLy1_Last(
		long quyTrinhThuTucId, long vaiTroXuLy1,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByQuyTrinhThuTucIdAndVaiTroXuLy1(quyTrinhThuTucId,
				vaiTroXuLy1);

		if (count == 0) {
			return null;
		}

		List<MotCuaTrangThaiHoSo> list = findByQuyTrinhThuTucIdAndVaiTroXuLy1(quyTrinhThuTucId,
				vaiTroXuLy1, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mot cua trang thai ho sos before and after the current mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy1 = &#63;.
	 *
	 * @param id the primary key of the current mot cua trang thai ho so
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy1 the vai tro xu ly1
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mot cua trang thai ho so
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaTrangThaiHoSoException if a mot cua trang thai ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaTrangThaiHoSo[] findByQuyTrinhThuTucIdAndVaiTroXuLy1_PrevAndNext(
		long id, long quyTrinhThuTucId, long vaiTroXuLy1,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaTrangThaiHoSoException, SystemException {
		MotCuaTrangThaiHoSo motCuaTrangThaiHoSo = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			MotCuaTrangThaiHoSo[] array = new MotCuaTrangThaiHoSoImpl[3];

			array[0] = getByQuyTrinhThuTucIdAndVaiTroXuLy1_PrevAndNext(session,
					motCuaTrangThaiHoSo, quyTrinhThuTucId, vaiTroXuLy1,
					orderByComparator, true);

			array[1] = motCuaTrangThaiHoSo;

			array[2] = getByQuyTrinhThuTucIdAndVaiTroXuLy1_PrevAndNext(session,
					motCuaTrangThaiHoSo, quyTrinhThuTucId, vaiTroXuLy1,
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

	protected MotCuaTrangThaiHoSo getByQuyTrinhThuTucIdAndVaiTroXuLy1_PrevAndNext(
		Session session, MotCuaTrangThaiHoSo motCuaTrangThaiHoSo,
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

		query.append(_SQL_SELECT_MOTCUATRANGTHAIHOSO_WHERE);

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
			query.append(MotCuaTrangThaiHoSoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(quyTrinhThuTucId);

		qPos.add(vaiTroXuLy1);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(motCuaTrangThaiHoSo);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MotCuaTrangThaiHoSo> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mot cua trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy1 = &#63; from the database.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy1 the vai tro xu ly1
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByQuyTrinhThuTucIdAndVaiTroXuLy1(long quyTrinhThuTucId,
		long vaiTroXuLy1) throws SystemException {
		for (MotCuaTrangThaiHoSo motCuaTrangThaiHoSo : findByQuyTrinhThuTucIdAndVaiTroXuLy1(
				quyTrinhThuTucId, vaiTroXuLy1, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(motCuaTrangThaiHoSo);
		}
	}

	/**
	 * Returns the number of mot cua trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy1 = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy1 the vai tro xu ly1
	 * @return the number of matching mot cua trang thai ho sos
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

			query.append(_SQL_COUNT_MOTCUATRANGTHAIHOSO_WHERE);

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
		"motCuaTrangThaiHoSo.quyTrinhThuTucId = ? AND ";
	private static final String _FINDER_COLUMN_QUYTRINHTHUTUCIDANDVAITROXULY1_VAITROXULY1_2 =
		"motCuaTrangThaiHoSo.vaiTroXuLy1 = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDVAITROXULY2 =
		new FinderPath(MotCuaTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaTrangThaiHoSoModelImpl.FINDER_CACHE_ENABLED,
			MotCuaTrangThaiHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByQuyTrinhThuTucIdAndVaiTroXuLy2",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDVAITROXULY2 =
		new FinderPath(MotCuaTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaTrangThaiHoSoModelImpl.FINDER_CACHE_ENABLED,
			MotCuaTrangThaiHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByQuyTrinhThuTucIdAndVaiTroXuLy2",
			new String[] { Long.class.getName(), Long.class.getName() },
			MotCuaTrangThaiHoSoModelImpl.QUYTRINHTHUTUCID_COLUMN_BITMASK |
			MotCuaTrangThaiHoSoModelImpl.VAITROXULY2_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_QUYTRINHTHUTUCIDANDVAITROXULY2 =
		new FinderPath(MotCuaTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaTrangThaiHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByQuyTrinhThuTucIdAndVaiTroXuLy2",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the mot cua trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy2 = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy2 the vai tro xu ly2
	 * @return the matching mot cua trang thai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaTrangThaiHoSo> findByQuyTrinhThuTucIdAndVaiTroXuLy2(
		long quyTrinhThuTucId, long vaiTroXuLy2) throws SystemException {
		return findByQuyTrinhThuTucIdAndVaiTroXuLy2(quyTrinhThuTucId,
			vaiTroXuLy2, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaTrangThaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy2 the vai tro xu ly2
	 * @param start the lower bound of the range of mot cua trang thai ho sos
	 * @param end the upper bound of the range of mot cua trang thai ho sos (not inclusive)
	 * @return the range of matching mot cua trang thai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaTrangThaiHoSo> findByQuyTrinhThuTucIdAndVaiTroXuLy2(
		long quyTrinhThuTucId, long vaiTroXuLy2, int start, int end)
		throws SystemException {
		return findByQuyTrinhThuTucIdAndVaiTroXuLy2(quyTrinhThuTucId,
			vaiTroXuLy2, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy2 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaTrangThaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy2 the vai tro xu ly2
	 * @param start the lower bound of the range of mot cua trang thai ho sos
	 * @param end the upper bound of the range of mot cua trang thai ho sos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mot cua trang thai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaTrangThaiHoSo> findByQuyTrinhThuTucIdAndVaiTroXuLy2(
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

		List<MotCuaTrangThaiHoSo> list = (List<MotCuaTrangThaiHoSo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MotCuaTrangThaiHoSo motCuaTrangThaiHoSo : list) {
				if ((quyTrinhThuTucId != motCuaTrangThaiHoSo.getQuyTrinhThuTucId()) ||
						(vaiTroXuLy2 != motCuaTrangThaiHoSo.getVaiTroXuLy2())) {
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

			query.append(_SQL_SELECT_MOTCUATRANGTHAIHOSO_WHERE);

			query.append(_FINDER_COLUMN_QUYTRINHTHUTUCIDANDVAITROXULY2_QUYTRINHTHUTUCID_2);

			query.append(_FINDER_COLUMN_QUYTRINHTHUTUCIDANDVAITROXULY2_VAITROXULY2_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MotCuaTrangThaiHoSoModelImpl.ORDER_BY_JPQL);
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
					list = (List<MotCuaTrangThaiHoSo>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaTrangThaiHoSo>(list);
				}
				else {
					list = (List<MotCuaTrangThaiHoSo>)QueryUtil.list(q,
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
	 * Returns the first mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy2 = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy2 the vai tro xu ly2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua trang thai ho so
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaTrangThaiHoSoException if a matching mot cua trang thai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaTrangThaiHoSo findByQuyTrinhThuTucIdAndVaiTroXuLy2_First(
		long quyTrinhThuTucId, long vaiTroXuLy2,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaTrangThaiHoSoException, SystemException {
		MotCuaTrangThaiHoSo motCuaTrangThaiHoSo = fetchByQuyTrinhThuTucIdAndVaiTroXuLy2_First(quyTrinhThuTucId,
				vaiTroXuLy2, orderByComparator);

		if (motCuaTrangThaiHoSo != null) {
			return motCuaTrangThaiHoSo;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("quyTrinhThuTucId=");
		msg.append(quyTrinhThuTucId);

		msg.append(", vaiTroXuLy2=");
		msg.append(vaiTroXuLy2);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaTrangThaiHoSoException(msg.toString());
	}

	/**
	 * Returns the first mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy2 = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy2 the vai tro xu ly2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua trang thai ho so, or <code>null</code> if a matching mot cua trang thai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaTrangThaiHoSo fetchByQuyTrinhThuTucIdAndVaiTroXuLy2_First(
		long quyTrinhThuTucId, long vaiTroXuLy2,
		OrderByComparator orderByComparator) throws SystemException {
		List<MotCuaTrangThaiHoSo> list = findByQuyTrinhThuTucIdAndVaiTroXuLy2(quyTrinhThuTucId,
				vaiTroXuLy2, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy2 = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy2 the vai tro xu ly2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua trang thai ho so
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaTrangThaiHoSoException if a matching mot cua trang thai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaTrangThaiHoSo findByQuyTrinhThuTucIdAndVaiTroXuLy2_Last(
		long quyTrinhThuTucId, long vaiTroXuLy2,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaTrangThaiHoSoException, SystemException {
		MotCuaTrangThaiHoSo motCuaTrangThaiHoSo = fetchByQuyTrinhThuTucIdAndVaiTroXuLy2_Last(quyTrinhThuTucId,
				vaiTroXuLy2, orderByComparator);

		if (motCuaTrangThaiHoSo != null) {
			return motCuaTrangThaiHoSo;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("quyTrinhThuTucId=");
		msg.append(quyTrinhThuTucId);

		msg.append(", vaiTroXuLy2=");
		msg.append(vaiTroXuLy2);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaTrangThaiHoSoException(msg.toString());
	}

	/**
	 * Returns the last mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy2 = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy2 the vai tro xu ly2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua trang thai ho so, or <code>null</code> if a matching mot cua trang thai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaTrangThaiHoSo fetchByQuyTrinhThuTucIdAndVaiTroXuLy2_Last(
		long quyTrinhThuTucId, long vaiTroXuLy2,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByQuyTrinhThuTucIdAndVaiTroXuLy2(quyTrinhThuTucId,
				vaiTroXuLy2);

		if (count == 0) {
			return null;
		}

		List<MotCuaTrangThaiHoSo> list = findByQuyTrinhThuTucIdAndVaiTroXuLy2(quyTrinhThuTucId,
				vaiTroXuLy2, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mot cua trang thai ho sos before and after the current mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy2 = &#63;.
	 *
	 * @param id the primary key of the current mot cua trang thai ho so
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy2 the vai tro xu ly2
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mot cua trang thai ho so
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaTrangThaiHoSoException if a mot cua trang thai ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaTrangThaiHoSo[] findByQuyTrinhThuTucIdAndVaiTroXuLy2_PrevAndNext(
		long id, long quyTrinhThuTucId, long vaiTroXuLy2,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaTrangThaiHoSoException, SystemException {
		MotCuaTrangThaiHoSo motCuaTrangThaiHoSo = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			MotCuaTrangThaiHoSo[] array = new MotCuaTrangThaiHoSoImpl[3];

			array[0] = getByQuyTrinhThuTucIdAndVaiTroXuLy2_PrevAndNext(session,
					motCuaTrangThaiHoSo, quyTrinhThuTucId, vaiTroXuLy2,
					orderByComparator, true);

			array[1] = motCuaTrangThaiHoSo;

			array[2] = getByQuyTrinhThuTucIdAndVaiTroXuLy2_PrevAndNext(session,
					motCuaTrangThaiHoSo, quyTrinhThuTucId, vaiTroXuLy2,
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

	protected MotCuaTrangThaiHoSo getByQuyTrinhThuTucIdAndVaiTroXuLy2_PrevAndNext(
		Session session, MotCuaTrangThaiHoSo motCuaTrangThaiHoSo,
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

		query.append(_SQL_SELECT_MOTCUATRANGTHAIHOSO_WHERE);

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
			query.append(MotCuaTrangThaiHoSoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(quyTrinhThuTucId);

		qPos.add(vaiTroXuLy2);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(motCuaTrangThaiHoSo);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MotCuaTrangThaiHoSo> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mot cua trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy2 = &#63; from the database.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy2 the vai tro xu ly2
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByQuyTrinhThuTucIdAndVaiTroXuLy2(long quyTrinhThuTucId,
		long vaiTroXuLy2) throws SystemException {
		for (MotCuaTrangThaiHoSo motCuaTrangThaiHoSo : findByQuyTrinhThuTucIdAndVaiTroXuLy2(
				quyTrinhThuTucId, vaiTroXuLy2, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(motCuaTrangThaiHoSo);
		}
	}

	/**
	 * Returns the number of mot cua trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy2 = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy2 the vai tro xu ly2
	 * @return the number of matching mot cua trang thai ho sos
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

			query.append(_SQL_COUNT_MOTCUATRANGTHAIHOSO_WHERE);

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
		"motCuaTrangThaiHoSo.quyTrinhThuTucId = ? AND ";
	private static final String _FINDER_COLUMN_QUYTRINHTHUTUCIDANDVAITROXULY2_VAITROXULY2_2 =
		"motCuaTrangThaiHoSo.vaiTroXuLy2 = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDVAITROXULY3 =
		new FinderPath(MotCuaTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaTrangThaiHoSoModelImpl.FINDER_CACHE_ENABLED,
			MotCuaTrangThaiHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByQuyTrinhThuTucIdAndVaiTroXuLy3",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDVAITROXULY3 =
		new FinderPath(MotCuaTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaTrangThaiHoSoModelImpl.FINDER_CACHE_ENABLED,
			MotCuaTrangThaiHoSoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByQuyTrinhThuTucIdAndVaiTroXuLy3",
			new String[] { Long.class.getName(), Long.class.getName() },
			MotCuaTrangThaiHoSoModelImpl.QUYTRINHTHUTUCID_COLUMN_BITMASK |
			MotCuaTrangThaiHoSoModelImpl.VAITROXULY3_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_QUYTRINHTHUTUCIDANDVAITROXULY3 =
		new FinderPath(MotCuaTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaTrangThaiHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByQuyTrinhThuTucIdAndVaiTroXuLy3",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the mot cua trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy3 = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy3 the vai tro xu ly3
	 * @return the matching mot cua trang thai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaTrangThaiHoSo> findByQuyTrinhThuTucIdAndVaiTroXuLy3(
		long quyTrinhThuTucId, long vaiTroXuLy3) throws SystemException {
		return findByQuyTrinhThuTucIdAndVaiTroXuLy3(quyTrinhThuTucId,
			vaiTroXuLy3, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy3 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaTrangThaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy3 the vai tro xu ly3
	 * @param start the lower bound of the range of mot cua trang thai ho sos
	 * @param end the upper bound of the range of mot cua trang thai ho sos (not inclusive)
	 * @return the range of matching mot cua trang thai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaTrangThaiHoSo> findByQuyTrinhThuTucIdAndVaiTroXuLy3(
		long quyTrinhThuTucId, long vaiTroXuLy3, int start, int end)
		throws SystemException {
		return findByQuyTrinhThuTucIdAndVaiTroXuLy3(quyTrinhThuTucId,
			vaiTroXuLy3, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy3 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaTrangThaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy3 the vai tro xu ly3
	 * @param start the lower bound of the range of mot cua trang thai ho sos
	 * @param end the upper bound of the range of mot cua trang thai ho sos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mot cua trang thai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaTrangThaiHoSo> findByQuyTrinhThuTucIdAndVaiTroXuLy3(
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

		List<MotCuaTrangThaiHoSo> list = (List<MotCuaTrangThaiHoSo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MotCuaTrangThaiHoSo motCuaTrangThaiHoSo : list) {
				if ((quyTrinhThuTucId != motCuaTrangThaiHoSo.getQuyTrinhThuTucId()) ||
						(vaiTroXuLy3 != motCuaTrangThaiHoSo.getVaiTroXuLy3())) {
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

			query.append(_SQL_SELECT_MOTCUATRANGTHAIHOSO_WHERE);

			query.append(_FINDER_COLUMN_QUYTRINHTHUTUCIDANDVAITROXULY3_QUYTRINHTHUTUCID_2);

			query.append(_FINDER_COLUMN_QUYTRINHTHUTUCIDANDVAITROXULY3_VAITROXULY3_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MotCuaTrangThaiHoSoModelImpl.ORDER_BY_JPQL);
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
					list = (List<MotCuaTrangThaiHoSo>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaTrangThaiHoSo>(list);
				}
				else {
					list = (List<MotCuaTrangThaiHoSo>)QueryUtil.list(q,
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
	 * Returns the first mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy3 = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy3 the vai tro xu ly3
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua trang thai ho so
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaTrangThaiHoSoException if a matching mot cua trang thai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaTrangThaiHoSo findByQuyTrinhThuTucIdAndVaiTroXuLy3_First(
		long quyTrinhThuTucId, long vaiTroXuLy3,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaTrangThaiHoSoException, SystemException {
		MotCuaTrangThaiHoSo motCuaTrangThaiHoSo = fetchByQuyTrinhThuTucIdAndVaiTroXuLy3_First(quyTrinhThuTucId,
				vaiTroXuLy3, orderByComparator);

		if (motCuaTrangThaiHoSo != null) {
			return motCuaTrangThaiHoSo;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("quyTrinhThuTucId=");
		msg.append(quyTrinhThuTucId);

		msg.append(", vaiTroXuLy3=");
		msg.append(vaiTroXuLy3);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaTrangThaiHoSoException(msg.toString());
	}

	/**
	 * Returns the first mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy3 = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy3 the vai tro xu ly3
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mot cua trang thai ho so, or <code>null</code> if a matching mot cua trang thai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaTrangThaiHoSo fetchByQuyTrinhThuTucIdAndVaiTroXuLy3_First(
		long quyTrinhThuTucId, long vaiTroXuLy3,
		OrderByComparator orderByComparator) throws SystemException {
		List<MotCuaTrangThaiHoSo> list = findByQuyTrinhThuTucIdAndVaiTroXuLy3(quyTrinhThuTucId,
				vaiTroXuLy3, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy3 = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy3 the vai tro xu ly3
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua trang thai ho so
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaTrangThaiHoSoException if a matching mot cua trang thai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaTrangThaiHoSo findByQuyTrinhThuTucIdAndVaiTroXuLy3_Last(
		long quyTrinhThuTucId, long vaiTroXuLy3,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaTrangThaiHoSoException, SystemException {
		MotCuaTrangThaiHoSo motCuaTrangThaiHoSo = fetchByQuyTrinhThuTucIdAndVaiTroXuLy3_Last(quyTrinhThuTucId,
				vaiTroXuLy3, orderByComparator);

		if (motCuaTrangThaiHoSo != null) {
			return motCuaTrangThaiHoSo;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("quyTrinhThuTucId=");
		msg.append(quyTrinhThuTucId);

		msg.append(", vaiTroXuLy3=");
		msg.append(vaiTroXuLy3);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMotCuaTrangThaiHoSoException(msg.toString());
	}

	/**
	 * Returns the last mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy3 = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy3 the vai tro xu ly3
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mot cua trang thai ho so, or <code>null</code> if a matching mot cua trang thai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaTrangThaiHoSo fetchByQuyTrinhThuTucIdAndVaiTroXuLy3_Last(
		long quyTrinhThuTucId, long vaiTroXuLy3,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByQuyTrinhThuTucIdAndVaiTroXuLy3(quyTrinhThuTucId,
				vaiTroXuLy3);

		if (count == 0) {
			return null;
		}

		List<MotCuaTrangThaiHoSo> list = findByQuyTrinhThuTucIdAndVaiTroXuLy3(quyTrinhThuTucId,
				vaiTroXuLy3, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mot cua trang thai ho sos before and after the current mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy3 = &#63;.
	 *
	 * @param id the primary key of the current mot cua trang thai ho so
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy3 the vai tro xu ly3
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mot cua trang thai ho so
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaTrangThaiHoSoException if a mot cua trang thai ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaTrangThaiHoSo[] findByQuyTrinhThuTucIdAndVaiTroXuLy3_PrevAndNext(
		long id, long quyTrinhThuTucId, long vaiTroXuLy3,
		OrderByComparator orderByComparator)
		throws NoSuchMotCuaTrangThaiHoSoException, SystemException {
		MotCuaTrangThaiHoSo motCuaTrangThaiHoSo = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			MotCuaTrangThaiHoSo[] array = new MotCuaTrangThaiHoSoImpl[3];

			array[0] = getByQuyTrinhThuTucIdAndVaiTroXuLy3_PrevAndNext(session,
					motCuaTrangThaiHoSo, quyTrinhThuTucId, vaiTroXuLy3,
					orderByComparator, true);

			array[1] = motCuaTrangThaiHoSo;

			array[2] = getByQuyTrinhThuTucIdAndVaiTroXuLy3_PrevAndNext(session,
					motCuaTrangThaiHoSo, quyTrinhThuTucId, vaiTroXuLy3,
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

	protected MotCuaTrangThaiHoSo getByQuyTrinhThuTucIdAndVaiTroXuLy3_PrevAndNext(
		Session session, MotCuaTrangThaiHoSo motCuaTrangThaiHoSo,
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

		query.append(_SQL_SELECT_MOTCUATRANGTHAIHOSO_WHERE);

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
			query.append(MotCuaTrangThaiHoSoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(quyTrinhThuTucId);

		qPos.add(vaiTroXuLy3);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(motCuaTrangThaiHoSo);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MotCuaTrangThaiHoSo> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mot cua trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy3 = &#63; from the database.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy3 the vai tro xu ly3
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByQuyTrinhThuTucIdAndVaiTroXuLy3(long quyTrinhThuTucId,
		long vaiTroXuLy3) throws SystemException {
		for (MotCuaTrangThaiHoSo motCuaTrangThaiHoSo : findByQuyTrinhThuTucIdAndVaiTroXuLy3(
				quyTrinhThuTucId, vaiTroXuLy3, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(motCuaTrangThaiHoSo);
		}
	}

	/**
	 * Returns the number of mot cua trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy3 = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param vaiTroXuLy3 the vai tro xu ly3
	 * @return the number of matching mot cua trang thai ho sos
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

			query.append(_SQL_COUNT_MOTCUATRANGTHAIHOSO_WHERE);

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
		"motCuaTrangThaiHoSo.quyTrinhThuTucId = ? AND ";
	private static final String _FINDER_COLUMN_QUYTRINHTHUTUCIDANDVAITROXULY3_VAITROXULY3_2 =
		"motCuaTrangThaiHoSo.vaiTroXuLy3 = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_QUYTRINHTHUTUCIDANDSOTHUTU =
		new FinderPath(MotCuaTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaTrangThaiHoSoModelImpl.FINDER_CACHE_ENABLED,
			MotCuaTrangThaiHoSoImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByQuyTrinhThuTucIdAndSoThuTu",
			new String[] { Long.class.getName(), Integer.class.getName() },
			MotCuaTrangThaiHoSoModelImpl.QUYTRINHTHUTUCID_COLUMN_BITMASK |
			MotCuaTrangThaiHoSoModelImpl.SOTHUTU_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_QUYTRINHTHUTUCIDANDSOTHUTU =
		new FinderPath(MotCuaTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaTrangThaiHoSoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByQuyTrinhThuTucIdAndSoThuTu",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns the mot cua trang thai ho so where quyTrinhThuTucId = &#63; and soThuTu = &#63; or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchMotCuaTrangThaiHoSoException} if it could not be found.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param soThuTu the so thu tu
	 * @return the matching mot cua trang thai ho so
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaTrangThaiHoSoException if a matching mot cua trang thai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaTrangThaiHoSo findByQuyTrinhThuTucIdAndSoThuTu(
		long quyTrinhThuTucId, int soThuTu)
		throws NoSuchMotCuaTrangThaiHoSoException, SystemException {
		MotCuaTrangThaiHoSo motCuaTrangThaiHoSo = fetchByQuyTrinhThuTucIdAndSoThuTu(quyTrinhThuTucId,
				soThuTu);

		if (motCuaTrangThaiHoSo == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("quyTrinhThuTucId=");
			msg.append(quyTrinhThuTucId);

			msg.append(", soThuTu=");
			msg.append(soThuTu);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchMotCuaTrangThaiHoSoException(msg.toString());
		}

		return motCuaTrangThaiHoSo;
	}

	/**
	 * Returns the mot cua trang thai ho so where quyTrinhThuTucId = &#63; and soThuTu = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param soThuTu the so thu tu
	 * @return the matching mot cua trang thai ho so, or <code>null</code> if a matching mot cua trang thai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaTrangThaiHoSo fetchByQuyTrinhThuTucIdAndSoThuTu(
		long quyTrinhThuTucId, int soThuTu) throws SystemException {
		return fetchByQuyTrinhThuTucIdAndSoThuTu(quyTrinhThuTucId, soThuTu, true);
	}

	/**
	 * Returns the mot cua trang thai ho so where quyTrinhThuTucId = &#63; and soThuTu = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param soThuTu the so thu tu
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching mot cua trang thai ho so, or <code>null</code> if a matching mot cua trang thai ho so could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaTrangThaiHoSo fetchByQuyTrinhThuTucIdAndSoThuTu(
		long quyTrinhThuTucId, int soThuTu, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { quyTrinhThuTucId, soThuTu };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_QUYTRINHTHUTUCIDANDSOTHUTU,
					finderArgs, this);
		}

		if (result instanceof MotCuaTrangThaiHoSo) {
			MotCuaTrangThaiHoSo motCuaTrangThaiHoSo = (MotCuaTrangThaiHoSo)result;

			if ((quyTrinhThuTucId != motCuaTrangThaiHoSo.getQuyTrinhThuTucId()) ||
					(soThuTu != motCuaTrangThaiHoSo.getSoThuTu())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_MOTCUATRANGTHAIHOSO_WHERE);

			query.append(_FINDER_COLUMN_QUYTRINHTHUTUCIDANDSOTHUTU_QUYTRINHTHUTUCID_2);

			query.append(_FINDER_COLUMN_QUYTRINHTHUTUCIDANDSOTHUTU_SOTHUTU_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(quyTrinhThuTucId);

				qPos.add(soThuTu);

				List<MotCuaTrangThaiHoSo> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_QUYTRINHTHUTUCIDANDSOTHUTU,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"MotCuaTrangThaiHoSoPersistenceImpl.fetchByQuyTrinhThuTucIdAndSoThuTu(long, int, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					MotCuaTrangThaiHoSo motCuaTrangThaiHoSo = list.get(0);

					result = motCuaTrangThaiHoSo;

					cacheResult(motCuaTrangThaiHoSo);

					if ((motCuaTrangThaiHoSo.getQuyTrinhThuTucId() != quyTrinhThuTucId) ||
							(motCuaTrangThaiHoSo.getSoThuTu() != soThuTu)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_QUYTRINHTHUTUCIDANDSOTHUTU,
							finderArgs, motCuaTrangThaiHoSo);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_QUYTRINHTHUTUCIDANDSOTHUTU,
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
			return (MotCuaTrangThaiHoSo)result;
		}
	}

	/**
	 * Removes the mot cua trang thai ho so where quyTrinhThuTucId = &#63; and soThuTu = &#63; from the database.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param soThuTu the so thu tu
	 * @return the mot cua trang thai ho so that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaTrangThaiHoSo removeByQuyTrinhThuTucIdAndSoThuTu(
		long quyTrinhThuTucId, int soThuTu)
		throws NoSuchMotCuaTrangThaiHoSoException, SystemException {
		MotCuaTrangThaiHoSo motCuaTrangThaiHoSo = findByQuyTrinhThuTucIdAndSoThuTu(quyTrinhThuTucId,
				soThuTu);

		return remove(motCuaTrangThaiHoSo);
	}

	/**
	 * Returns the number of mot cua trang thai ho sos where quyTrinhThuTucId = &#63; and soThuTu = &#63;.
	 *
	 * @param quyTrinhThuTucId the quy trinh thu tuc ID
	 * @param soThuTu the so thu tu
	 * @return the number of matching mot cua trang thai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByQuyTrinhThuTucIdAndSoThuTu(long quyTrinhThuTucId,
		int soThuTu) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_QUYTRINHTHUTUCIDANDSOTHUTU;

		Object[] finderArgs = new Object[] { quyTrinhThuTucId, soThuTu };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_MOTCUATRANGTHAIHOSO_WHERE);

			query.append(_FINDER_COLUMN_QUYTRINHTHUTUCIDANDSOTHUTU_QUYTRINHTHUTUCID_2);

			query.append(_FINDER_COLUMN_QUYTRINHTHUTUCIDANDSOTHUTU_SOTHUTU_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(quyTrinhThuTucId);

				qPos.add(soThuTu);

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

	private static final String _FINDER_COLUMN_QUYTRINHTHUTUCIDANDSOTHUTU_QUYTRINHTHUTUCID_2 =
		"motCuaTrangThaiHoSo.quyTrinhThuTucId = ? AND ";
	private static final String _FINDER_COLUMN_QUYTRINHTHUTUCIDANDSOTHUTU_SOTHUTU_2 =
		"motCuaTrangThaiHoSo.soThuTu = ?";

	public MotCuaTrangThaiHoSoPersistenceImpl() {
		setModelClass(MotCuaTrangThaiHoSo.class);
	}

	/**
	 * Caches the mot cua trang thai ho so in the entity cache if it is enabled.
	 *
	 * @param motCuaTrangThaiHoSo the mot cua trang thai ho so
	 */
	@Override
	public void cacheResult(MotCuaTrangThaiHoSo motCuaTrangThaiHoSo) {
		EntityCacheUtil.putResult(MotCuaTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaTrangThaiHoSoImpl.class, motCuaTrangThaiHoSo.getPrimaryKey(),
			motCuaTrangThaiHoSo);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATRANGTHAI,
			new Object[] { motCuaTrangThaiHoSo.getMaTrangThai() },
			motCuaTrangThaiHoSo);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_QUYTRINHTHUTUCIDANDSOTHUTU,
			new Object[] {
				motCuaTrangThaiHoSo.getQuyTrinhThuTucId(),
				motCuaTrangThaiHoSo.getSoThuTu()
			}, motCuaTrangThaiHoSo);

		motCuaTrangThaiHoSo.resetOriginalValues();
	}

	/**
	 * Caches the mot cua trang thai ho sos in the entity cache if it is enabled.
	 *
	 * @param motCuaTrangThaiHoSos the mot cua trang thai ho sos
	 */
	@Override
	public void cacheResult(List<MotCuaTrangThaiHoSo> motCuaTrangThaiHoSos) {
		for (MotCuaTrangThaiHoSo motCuaTrangThaiHoSo : motCuaTrangThaiHoSos) {
			if (EntityCacheUtil.getResult(
						MotCuaTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
						MotCuaTrangThaiHoSoImpl.class,
						motCuaTrangThaiHoSo.getPrimaryKey()) == null) {
				cacheResult(motCuaTrangThaiHoSo);
			}
			else {
				motCuaTrangThaiHoSo.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all mot cua trang thai ho sos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(MotCuaTrangThaiHoSoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(MotCuaTrangThaiHoSoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the mot cua trang thai ho so.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MotCuaTrangThaiHoSo motCuaTrangThaiHoSo) {
		EntityCacheUtil.removeResult(MotCuaTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaTrangThaiHoSoImpl.class, motCuaTrangThaiHoSo.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(motCuaTrangThaiHoSo);
	}

	@Override
	public void clearCache(List<MotCuaTrangThaiHoSo> motCuaTrangThaiHoSos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (MotCuaTrangThaiHoSo motCuaTrangThaiHoSo : motCuaTrangThaiHoSos) {
			EntityCacheUtil.removeResult(MotCuaTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
				MotCuaTrangThaiHoSoImpl.class,
				motCuaTrangThaiHoSo.getPrimaryKey());

			clearUniqueFindersCache(motCuaTrangThaiHoSo);
		}
	}

	protected void cacheUniqueFindersCache(
		MotCuaTrangThaiHoSo motCuaTrangThaiHoSo) {
		if (motCuaTrangThaiHoSo.isNew()) {
			Object[] args = new Object[] { motCuaTrangThaiHoSo.getMaTrangThai() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MATRANGTHAI, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATRANGTHAI, args,
				motCuaTrangThaiHoSo);

			args = new Object[] {
					motCuaTrangThaiHoSo.getQuyTrinhThuTucId(),
					motCuaTrangThaiHoSo.getSoThuTu()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_QUYTRINHTHUTUCIDANDSOTHUTU,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_QUYTRINHTHUTUCIDANDSOTHUTU,
				args, motCuaTrangThaiHoSo);
		}
		else {
			MotCuaTrangThaiHoSoModelImpl motCuaTrangThaiHoSoModelImpl = (MotCuaTrangThaiHoSoModelImpl)motCuaTrangThaiHoSo;

			if ((motCuaTrangThaiHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_MATRANGTHAI.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaTrangThaiHoSo.getMaTrangThai()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_MATRANGTHAI,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_MATRANGTHAI,
					args, motCuaTrangThaiHoSo);
			}

			if ((motCuaTrangThaiHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_QUYTRINHTHUTUCIDANDSOTHUTU.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaTrangThaiHoSo.getQuyTrinhThuTucId(),
						motCuaTrangThaiHoSo.getSoThuTu()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_QUYTRINHTHUTUCIDANDSOTHUTU,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_QUYTRINHTHUTUCIDANDSOTHUTU,
					args, motCuaTrangThaiHoSo);
			}
		}
	}

	protected void clearUniqueFindersCache(
		MotCuaTrangThaiHoSo motCuaTrangThaiHoSo) {
		MotCuaTrangThaiHoSoModelImpl motCuaTrangThaiHoSoModelImpl = (MotCuaTrangThaiHoSoModelImpl)motCuaTrangThaiHoSo;

		Object[] args = new Object[] { motCuaTrangThaiHoSo.getMaTrangThai() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MATRANGTHAI, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MATRANGTHAI, args);

		if ((motCuaTrangThaiHoSoModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_MATRANGTHAI.getColumnBitmask()) != 0) {
			args = new Object[] {
					motCuaTrangThaiHoSoModelImpl.getOriginalMaTrangThai()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MATRANGTHAI, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_MATRANGTHAI, args);
		}

		args = new Object[] {
				motCuaTrangThaiHoSo.getQuyTrinhThuTucId(),
				motCuaTrangThaiHoSo.getSoThuTu()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_QUYTRINHTHUTUCIDANDSOTHUTU,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_QUYTRINHTHUTUCIDANDSOTHUTU,
			args);

		if ((motCuaTrangThaiHoSoModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_QUYTRINHTHUTUCIDANDSOTHUTU.getColumnBitmask()) != 0) {
			args = new Object[] {
					motCuaTrangThaiHoSoModelImpl.getOriginalQuyTrinhThuTucId(),
					motCuaTrangThaiHoSoModelImpl.getOriginalSoThuTu()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_QUYTRINHTHUTUCIDANDSOTHUTU,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_QUYTRINHTHUTUCIDANDSOTHUTU,
				args);
		}
	}

	/**
	 * Creates a new mot cua trang thai ho so with the primary key. Does not add the mot cua trang thai ho so to the database.
	 *
	 * @param id the primary key for the new mot cua trang thai ho so
	 * @return the new mot cua trang thai ho so
	 */
	@Override
	public MotCuaTrangThaiHoSo create(long id) {
		MotCuaTrangThaiHoSo motCuaTrangThaiHoSo = new MotCuaTrangThaiHoSoImpl();

		motCuaTrangThaiHoSo.setNew(true);
		motCuaTrangThaiHoSo.setPrimaryKey(id);

		return motCuaTrangThaiHoSo;
	}

	/**
	 * Removes the mot cua trang thai ho so with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the mot cua trang thai ho so
	 * @return the mot cua trang thai ho so that was removed
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaTrangThaiHoSoException if a mot cua trang thai ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaTrangThaiHoSo remove(long id)
		throws NoSuchMotCuaTrangThaiHoSoException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the mot cua trang thai ho so with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the mot cua trang thai ho so
	 * @return the mot cua trang thai ho so that was removed
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaTrangThaiHoSoException if a mot cua trang thai ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaTrangThaiHoSo remove(Serializable primaryKey)
		throws NoSuchMotCuaTrangThaiHoSoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			MotCuaTrangThaiHoSo motCuaTrangThaiHoSo = (MotCuaTrangThaiHoSo)session.get(MotCuaTrangThaiHoSoImpl.class,
					primaryKey);

			if (motCuaTrangThaiHoSo == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMotCuaTrangThaiHoSoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(motCuaTrangThaiHoSo);
		}
		catch (NoSuchMotCuaTrangThaiHoSoException nsee) {
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
	protected MotCuaTrangThaiHoSo removeImpl(
		MotCuaTrangThaiHoSo motCuaTrangThaiHoSo) throws SystemException {
		motCuaTrangThaiHoSo = toUnwrappedModel(motCuaTrangThaiHoSo);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(motCuaTrangThaiHoSo)) {
				motCuaTrangThaiHoSo = (MotCuaTrangThaiHoSo)session.get(MotCuaTrangThaiHoSoImpl.class,
						motCuaTrangThaiHoSo.getPrimaryKeyObj());
			}

			if (motCuaTrangThaiHoSo != null) {
				session.delete(motCuaTrangThaiHoSo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (motCuaTrangThaiHoSo != null) {
			clearCache(motCuaTrangThaiHoSo);
		}

		return motCuaTrangThaiHoSo;
	}

	@Override
	public MotCuaTrangThaiHoSo updateImpl(
		vn.dtt.duongbo.dao.motcua.model.MotCuaTrangThaiHoSo motCuaTrangThaiHoSo)
		throws SystemException {
		motCuaTrangThaiHoSo = toUnwrappedModel(motCuaTrangThaiHoSo);

		boolean isNew = motCuaTrangThaiHoSo.isNew();

		MotCuaTrangThaiHoSoModelImpl motCuaTrangThaiHoSoModelImpl = (MotCuaTrangThaiHoSoModelImpl)motCuaTrangThaiHoSo;

		Session session = null;

		try {
			session = openSession();

			if (motCuaTrangThaiHoSo.isNew()) {
				session.save(motCuaTrangThaiHoSo);

				motCuaTrangThaiHoSo.setNew(false);
			}
			else {
				session.merge(motCuaTrangThaiHoSo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !MotCuaTrangThaiHoSoModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((motCuaTrangThaiHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaTrangThaiHoSoModelImpl.getOriginalQuyTrinhThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_QUYTRINHTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCID,
					args);

				args = new Object[] {
						motCuaTrangThaiHoSoModelImpl.getQuyTrinhThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_QUYTRINHTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCID,
					args);
			}

			if ((motCuaTrangThaiHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDVAITROXULY1.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaTrangThaiHoSoModelImpl.getOriginalQuyTrinhThuTucId(),
						motCuaTrangThaiHoSoModelImpl.getOriginalVaiTroXuLy1()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_QUYTRINHTHUTUCIDANDVAITROXULY1,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDVAITROXULY1,
					args);

				args = new Object[] {
						motCuaTrangThaiHoSoModelImpl.getQuyTrinhThuTucId(),
						motCuaTrangThaiHoSoModelImpl.getVaiTroXuLy1()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_QUYTRINHTHUTUCIDANDVAITROXULY1,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDVAITROXULY1,
					args);
			}

			if ((motCuaTrangThaiHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDVAITROXULY2.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaTrangThaiHoSoModelImpl.getOriginalQuyTrinhThuTucId(),
						motCuaTrangThaiHoSoModelImpl.getOriginalVaiTroXuLy2()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_QUYTRINHTHUTUCIDANDVAITROXULY2,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDVAITROXULY2,
					args);

				args = new Object[] {
						motCuaTrangThaiHoSoModelImpl.getQuyTrinhThuTucId(),
						motCuaTrangThaiHoSoModelImpl.getVaiTroXuLy2()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_QUYTRINHTHUTUCIDANDVAITROXULY2,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDVAITROXULY2,
					args);
			}

			if ((motCuaTrangThaiHoSoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDVAITROXULY3.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						motCuaTrangThaiHoSoModelImpl.getOriginalQuyTrinhThuTucId(),
						motCuaTrangThaiHoSoModelImpl.getOriginalVaiTroXuLy3()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_QUYTRINHTHUTUCIDANDVAITROXULY3,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDVAITROXULY3,
					args);

				args = new Object[] {
						motCuaTrangThaiHoSoModelImpl.getQuyTrinhThuTucId(),
						motCuaTrangThaiHoSoModelImpl.getVaiTroXuLy3()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_QUYTRINHTHUTUCIDANDVAITROXULY3,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_QUYTRINHTHUTUCIDANDVAITROXULY3,
					args);
			}
		}

		EntityCacheUtil.putResult(MotCuaTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
			MotCuaTrangThaiHoSoImpl.class, motCuaTrangThaiHoSo.getPrimaryKey(),
			motCuaTrangThaiHoSo);

		clearUniqueFindersCache(motCuaTrangThaiHoSo);
		cacheUniqueFindersCache(motCuaTrangThaiHoSo);

		return motCuaTrangThaiHoSo;
	}

	protected MotCuaTrangThaiHoSo toUnwrappedModel(
		MotCuaTrangThaiHoSo motCuaTrangThaiHoSo) {
		if (motCuaTrangThaiHoSo instanceof MotCuaTrangThaiHoSoImpl) {
			return motCuaTrangThaiHoSo;
		}

		MotCuaTrangThaiHoSoImpl motCuaTrangThaiHoSoImpl = new MotCuaTrangThaiHoSoImpl();

		motCuaTrangThaiHoSoImpl.setNew(motCuaTrangThaiHoSo.isNew());
		motCuaTrangThaiHoSoImpl.setPrimaryKey(motCuaTrangThaiHoSo.getPrimaryKey());

		motCuaTrangThaiHoSoImpl.setId(motCuaTrangThaiHoSo.getId());
		motCuaTrangThaiHoSoImpl.setQuyTrinhThuTucId(motCuaTrangThaiHoSo.getQuyTrinhThuTucId());
		motCuaTrangThaiHoSoImpl.setMaTrangThai(motCuaTrangThaiHoSo.getMaTrangThai());
		motCuaTrangThaiHoSoImpl.setTenTrangThai(motCuaTrangThaiHoSo.getTenTrangThai());
		motCuaTrangThaiHoSoImpl.setTenTiengAnh(motCuaTrangThaiHoSo.getTenTiengAnh());
		motCuaTrangThaiHoSoImpl.setSoThuTu(motCuaTrangThaiHoSo.getSoThuTu());
		motCuaTrangThaiHoSoImpl.setTrangThaiKetThuc(motCuaTrangThaiHoSo.getTrangThaiKetThuc());
		motCuaTrangThaiHoSoImpl.setMoTaTrangThai(motCuaTrangThaiHoSo.getMoTaTrangThai());
		motCuaTrangThaiHoSoImpl.setVaiTroXuLy1(motCuaTrangThaiHoSo.getVaiTroXuLy1());
		motCuaTrangThaiHoSoImpl.setVaiTroXuLy2(motCuaTrangThaiHoSo.getVaiTroXuLy2());
		motCuaTrangThaiHoSoImpl.setVaiTroXuLy3(motCuaTrangThaiHoSo.getVaiTroXuLy3());
		motCuaTrangThaiHoSoImpl.setFormXuLy(motCuaTrangThaiHoSo.getFormXuLy());

		return motCuaTrangThaiHoSoImpl;
	}

	/**
	 * Returns the mot cua trang thai ho so with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the mot cua trang thai ho so
	 * @return the mot cua trang thai ho so
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaTrangThaiHoSoException if a mot cua trang thai ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaTrangThaiHoSo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMotCuaTrangThaiHoSoException, SystemException {
		MotCuaTrangThaiHoSo motCuaTrangThaiHoSo = fetchByPrimaryKey(primaryKey);

		if (motCuaTrangThaiHoSo == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMotCuaTrangThaiHoSoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return motCuaTrangThaiHoSo;
	}

	/**
	 * Returns the mot cua trang thai ho so with the primary key or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchMotCuaTrangThaiHoSoException} if it could not be found.
	 *
	 * @param id the primary key of the mot cua trang thai ho so
	 * @return the mot cua trang thai ho so
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaTrangThaiHoSoException if a mot cua trang thai ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaTrangThaiHoSo findByPrimaryKey(long id)
		throws NoSuchMotCuaTrangThaiHoSoException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the mot cua trang thai ho so with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the mot cua trang thai ho so
	 * @return the mot cua trang thai ho so, or <code>null</code> if a mot cua trang thai ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaTrangThaiHoSo fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		MotCuaTrangThaiHoSo motCuaTrangThaiHoSo = (MotCuaTrangThaiHoSo)EntityCacheUtil.getResult(MotCuaTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
				MotCuaTrangThaiHoSoImpl.class, primaryKey);

		if (motCuaTrangThaiHoSo == _nullMotCuaTrangThaiHoSo) {
			return null;
		}

		if (motCuaTrangThaiHoSo == null) {
			Session session = null;

			try {
				session = openSession();

				motCuaTrangThaiHoSo = (MotCuaTrangThaiHoSo)session.get(MotCuaTrangThaiHoSoImpl.class,
						primaryKey);

				if (motCuaTrangThaiHoSo != null) {
					cacheResult(motCuaTrangThaiHoSo);
				}
				else {
					EntityCacheUtil.putResult(MotCuaTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
						MotCuaTrangThaiHoSoImpl.class, primaryKey,
						_nullMotCuaTrangThaiHoSo);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(MotCuaTrangThaiHoSoModelImpl.ENTITY_CACHE_ENABLED,
					MotCuaTrangThaiHoSoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return motCuaTrangThaiHoSo;
	}

	/**
	 * Returns the mot cua trang thai ho so with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the mot cua trang thai ho so
	 * @return the mot cua trang thai ho so, or <code>null</code> if a mot cua trang thai ho so with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MotCuaTrangThaiHoSo fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the mot cua trang thai ho sos.
	 *
	 * @return the mot cua trang thai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaTrangThaiHoSo> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mot cua trang thai ho sos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaTrangThaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mot cua trang thai ho sos
	 * @param end the upper bound of the range of mot cua trang thai ho sos (not inclusive)
	 * @return the range of mot cua trang thai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaTrangThaiHoSo> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the mot cua trang thai ho sos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaTrangThaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mot cua trang thai ho sos
	 * @param end the upper bound of the range of mot cua trang thai ho sos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mot cua trang thai ho sos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MotCuaTrangThaiHoSo> findAll(int start, int end,
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

		List<MotCuaTrangThaiHoSo> list = (List<MotCuaTrangThaiHoSo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MOTCUATRANGTHAIHOSO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MOTCUATRANGTHAIHOSO;

				if (pagination) {
					sql = sql.concat(MotCuaTrangThaiHoSoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<MotCuaTrangThaiHoSo>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MotCuaTrangThaiHoSo>(list);
				}
				else {
					list = (List<MotCuaTrangThaiHoSo>)QueryUtil.list(q,
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
	 * Removes all the mot cua trang thai ho sos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (MotCuaTrangThaiHoSo motCuaTrangThaiHoSo : findAll()) {
			remove(motCuaTrangThaiHoSo);
		}
	}

	/**
	 * Returns the number of mot cua trang thai ho sos.
	 *
	 * @return the number of mot cua trang thai ho sos
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

				Query q = session.createQuery(_SQL_COUNT_MOTCUATRANGTHAIHOSO);

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
	 * Initializes the mot cua trang thai ho so persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.motcua.model.MotCuaTrangThaiHoSo")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<MotCuaTrangThaiHoSo>> listenersList = new ArrayList<ModelListener<MotCuaTrangThaiHoSo>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<MotCuaTrangThaiHoSo>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(MotCuaTrangThaiHoSoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_MOTCUATRANGTHAIHOSO = "SELECT motCuaTrangThaiHoSo FROM MotCuaTrangThaiHoSo motCuaTrangThaiHoSo";
	private static final String _SQL_SELECT_MOTCUATRANGTHAIHOSO_WHERE = "SELECT motCuaTrangThaiHoSo FROM MotCuaTrangThaiHoSo motCuaTrangThaiHoSo WHERE ";
	private static final String _SQL_COUNT_MOTCUATRANGTHAIHOSO = "SELECT COUNT(motCuaTrangThaiHoSo) FROM MotCuaTrangThaiHoSo motCuaTrangThaiHoSo";
	private static final String _SQL_COUNT_MOTCUATRANGTHAIHOSO_WHERE = "SELECT COUNT(motCuaTrangThaiHoSo) FROM MotCuaTrangThaiHoSo motCuaTrangThaiHoSo WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "motCuaTrangThaiHoSo.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MotCuaTrangThaiHoSo exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No MotCuaTrangThaiHoSo exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(MotCuaTrangThaiHoSoPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"maTrangThai", "tenTrangThai", "tenTiengAnh", "soThuTu",
				"trangThaiKetThuc", "moTaTrangThai", "vaiTroXuLy1",
				"vaiTroXuLy2", "vaiTroXuLy3", "formXuLy"
			});
	private static MotCuaTrangThaiHoSo _nullMotCuaTrangThaiHoSo = new MotCuaTrangThaiHoSoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<MotCuaTrangThaiHoSo> toCacheModel() {
				return _nullMotCuaTrangThaiHoSoCacheModel;
			}
		};

	private static CacheModel<MotCuaTrangThaiHoSo> _nullMotCuaTrangThaiHoSoCacheModel =
		new CacheModel<MotCuaTrangThaiHoSo>() {
			@Override
			public MotCuaTrangThaiHoSo toEntityModel() {
				return _nullMotCuaTrangThaiHoSo;
			}
		};
}