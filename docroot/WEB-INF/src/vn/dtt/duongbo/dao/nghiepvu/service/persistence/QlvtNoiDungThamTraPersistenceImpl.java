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

import vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtNoiDungThamTraException;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra;
import vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtNoiDungThamTraImpl;
import vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtNoiDungThamTraModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the qlvt noi dung tham tra service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanNc
 * @see QlvtNoiDungThamTraPersistence
 * @see QlvtNoiDungThamTraUtil
 * @generated
 */
public class QlvtNoiDungThamTraPersistenceImpl extends BasePersistenceImpl<QlvtNoiDungThamTra>
	implements QlvtNoiDungThamTraPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QlvtNoiDungThamTraUtil} to access the qlvt noi dung tham tra persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QlvtNoiDungThamTraImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QlvtNoiDungThamTraModelImpl.ENTITY_CACHE_ENABLED,
			QlvtNoiDungThamTraModelImpl.FINDER_CACHE_ENABLED,
			QlvtNoiDungThamTraImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QlvtNoiDungThamTraModelImpl.ENTITY_CACHE_ENABLED,
			QlvtNoiDungThamTraModelImpl.FINDER_CACHE_ENABLED,
			QlvtNoiDungThamTraImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QlvtNoiDungThamTraModelImpl.ENTITY_CACHE_ENABLED,
			QlvtNoiDungThamTraModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_F_TTHCNOIDUNGTHAMTRAID =
		new FinderPath(QlvtNoiDungThamTraModelImpl.ENTITY_CACHE_ENABLED,
			QlvtNoiDungThamTraModelImpl.FINDER_CACHE_ENABLED,
			QlvtNoiDungThamTraImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByF_tthcNoiDungThamTraId",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_TTHCNOIDUNGTHAMTRAID =
		new FinderPath(QlvtNoiDungThamTraModelImpl.ENTITY_CACHE_ENABLED,
			QlvtNoiDungThamTraModelImpl.FINDER_CACHE_ENABLED,
			QlvtNoiDungThamTraImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByF_tthcNoiDungThamTraId",
			new String[] { Integer.class.getName() },
			QlvtNoiDungThamTraModelImpl.TTHCNOIDUNGTHAMTRAID_COLUMN_BITMASK |
			QlvtNoiDungThamTraModelImpl.THUTUHIENTHI_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_TTHCNOIDUNGTHAMTRAID = new FinderPath(QlvtNoiDungThamTraModelImpl.ENTITY_CACHE_ENABLED,
			QlvtNoiDungThamTraModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByF_tthcNoiDungThamTraId",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the qlvt noi dung tham tras where tthcNoiDungThamTraId = &#63;.
	 *
	 * @param tthcNoiDungThamTraId the tthc noi dung tham tra ID
	 * @return the matching qlvt noi dung tham tras
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtNoiDungThamTra> findByF_tthcNoiDungThamTraId(
		int tthcNoiDungThamTraId) throws SystemException {
		return findByF_tthcNoiDungThamTraId(tthcNoiDungThamTraId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt noi dung tham tras where tthcNoiDungThamTraId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtNoiDungThamTraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tthcNoiDungThamTraId the tthc noi dung tham tra ID
	 * @param start the lower bound of the range of qlvt noi dung tham tras
	 * @param end the upper bound of the range of qlvt noi dung tham tras (not inclusive)
	 * @return the range of matching qlvt noi dung tham tras
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtNoiDungThamTra> findByF_tthcNoiDungThamTraId(
		int tthcNoiDungThamTraId, int start, int end) throws SystemException {
		return findByF_tthcNoiDungThamTraId(tthcNoiDungThamTraId, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the qlvt noi dung tham tras where tthcNoiDungThamTraId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtNoiDungThamTraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tthcNoiDungThamTraId the tthc noi dung tham tra ID
	 * @param start the lower bound of the range of qlvt noi dung tham tras
	 * @param end the upper bound of the range of qlvt noi dung tham tras (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching qlvt noi dung tham tras
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtNoiDungThamTra> findByF_tthcNoiDungThamTraId(
		int tthcNoiDungThamTraId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_TTHCNOIDUNGTHAMTRAID;
			finderArgs = new Object[] { tthcNoiDungThamTraId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_F_TTHCNOIDUNGTHAMTRAID;
			finderArgs = new Object[] {
					tthcNoiDungThamTraId,
					
					start, end, orderByComparator
				};
		}

		List<QlvtNoiDungThamTra> list = (List<QlvtNoiDungThamTra>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (QlvtNoiDungThamTra qlvtNoiDungThamTra : list) {
				if ((tthcNoiDungThamTraId != qlvtNoiDungThamTra.getTthcNoiDungThamTraId())) {
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

			query.append(_SQL_SELECT_QLVTNOIDUNGTHAMTRA_WHERE);

			query.append(_FINDER_COLUMN_F_TTHCNOIDUNGTHAMTRAID_TTHCNOIDUNGTHAMTRAID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(QlvtNoiDungThamTraModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(tthcNoiDungThamTraId);

				if (!pagination) {
					list = (List<QlvtNoiDungThamTra>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtNoiDungThamTra>(list);
				}
				else {
					list = (List<QlvtNoiDungThamTra>)QueryUtil.list(q,
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
	 * Returns the first qlvt noi dung tham tra in the ordered set where tthcNoiDungThamTraId = &#63;.
	 *
	 * @param tthcNoiDungThamTraId the tthc noi dung tham tra ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qlvt noi dung tham tra
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtNoiDungThamTraException if a matching qlvt noi dung tham tra could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtNoiDungThamTra findByF_tthcNoiDungThamTraId_First(
		int tthcNoiDungThamTraId, OrderByComparator orderByComparator)
		throws NoSuchQlvtNoiDungThamTraException, SystemException {
		QlvtNoiDungThamTra qlvtNoiDungThamTra = fetchByF_tthcNoiDungThamTraId_First(tthcNoiDungThamTraId,
				orderByComparator);

		if (qlvtNoiDungThamTra != null) {
			return qlvtNoiDungThamTra;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tthcNoiDungThamTraId=");
		msg.append(tthcNoiDungThamTraId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchQlvtNoiDungThamTraException(msg.toString());
	}

	/**
	 * Returns the first qlvt noi dung tham tra in the ordered set where tthcNoiDungThamTraId = &#63;.
	 *
	 * @param tthcNoiDungThamTraId the tthc noi dung tham tra ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qlvt noi dung tham tra, or <code>null</code> if a matching qlvt noi dung tham tra could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtNoiDungThamTra fetchByF_tthcNoiDungThamTraId_First(
		int tthcNoiDungThamTraId, OrderByComparator orderByComparator)
		throws SystemException {
		List<QlvtNoiDungThamTra> list = findByF_tthcNoiDungThamTraId(tthcNoiDungThamTraId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last qlvt noi dung tham tra in the ordered set where tthcNoiDungThamTraId = &#63;.
	 *
	 * @param tthcNoiDungThamTraId the tthc noi dung tham tra ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qlvt noi dung tham tra
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtNoiDungThamTraException if a matching qlvt noi dung tham tra could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtNoiDungThamTra findByF_tthcNoiDungThamTraId_Last(
		int tthcNoiDungThamTraId, OrderByComparator orderByComparator)
		throws NoSuchQlvtNoiDungThamTraException, SystemException {
		QlvtNoiDungThamTra qlvtNoiDungThamTra = fetchByF_tthcNoiDungThamTraId_Last(tthcNoiDungThamTraId,
				orderByComparator);

		if (qlvtNoiDungThamTra != null) {
			return qlvtNoiDungThamTra;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tthcNoiDungThamTraId=");
		msg.append(tthcNoiDungThamTraId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchQlvtNoiDungThamTraException(msg.toString());
	}

	/**
	 * Returns the last qlvt noi dung tham tra in the ordered set where tthcNoiDungThamTraId = &#63;.
	 *
	 * @param tthcNoiDungThamTraId the tthc noi dung tham tra ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qlvt noi dung tham tra, or <code>null</code> if a matching qlvt noi dung tham tra could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtNoiDungThamTra fetchByF_tthcNoiDungThamTraId_Last(
		int tthcNoiDungThamTraId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByF_tthcNoiDungThamTraId(tthcNoiDungThamTraId);

		if (count == 0) {
			return null;
		}

		List<QlvtNoiDungThamTra> list = findByF_tthcNoiDungThamTraId(tthcNoiDungThamTraId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the qlvt noi dung tham tras before and after the current qlvt noi dung tham tra in the ordered set where tthcNoiDungThamTraId = &#63;.
	 *
	 * @param id the primary key of the current qlvt noi dung tham tra
	 * @param tthcNoiDungThamTraId the tthc noi dung tham tra ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next qlvt noi dung tham tra
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtNoiDungThamTraException if a qlvt noi dung tham tra with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtNoiDungThamTra[] findByF_tthcNoiDungThamTraId_PrevAndNext(
		long id, int tthcNoiDungThamTraId, OrderByComparator orderByComparator)
		throws NoSuchQlvtNoiDungThamTraException, SystemException {
		QlvtNoiDungThamTra qlvtNoiDungThamTra = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			QlvtNoiDungThamTra[] array = new QlvtNoiDungThamTraImpl[3];

			array[0] = getByF_tthcNoiDungThamTraId_PrevAndNext(session,
					qlvtNoiDungThamTra, tthcNoiDungThamTraId,
					orderByComparator, true);

			array[1] = qlvtNoiDungThamTra;

			array[2] = getByF_tthcNoiDungThamTraId_PrevAndNext(session,
					qlvtNoiDungThamTra, tthcNoiDungThamTraId,
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

	protected QlvtNoiDungThamTra getByF_tthcNoiDungThamTraId_PrevAndNext(
		Session session, QlvtNoiDungThamTra qlvtNoiDungThamTra,
		int tthcNoiDungThamTraId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_QLVTNOIDUNGTHAMTRA_WHERE);

		query.append(_FINDER_COLUMN_F_TTHCNOIDUNGTHAMTRAID_TTHCNOIDUNGTHAMTRAID_2);

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
			query.append(QlvtNoiDungThamTraModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(tthcNoiDungThamTraId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(qlvtNoiDungThamTra);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<QlvtNoiDungThamTra> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the qlvt noi dung tham tras where tthcNoiDungThamTraId = &#63; from the database.
	 *
	 * @param tthcNoiDungThamTraId the tthc noi dung tham tra ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByF_tthcNoiDungThamTraId(int tthcNoiDungThamTraId)
		throws SystemException {
		for (QlvtNoiDungThamTra qlvtNoiDungThamTra : findByF_tthcNoiDungThamTraId(
				tthcNoiDungThamTraId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(qlvtNoiDungThamTra);
		}
	}

	/**
	 * Returns the number of qlvt noi dung tham tras where tthcNoiDungThamTraId = &#63;.
	 *
	 * @param tthcNoiDungThamTraId the tthc noi dung tham tra ID
	 * @return the number of matching qlvt noi dung tham tras
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByF_tthcNoiDungThamTraId(int tthcNoiDungThamTraId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_TTHCNOIDUNGTHAMTRAID;

		Object[] finderArgs = new Object[] { tthcNoiDungThamTraId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_QLVTNOIDUNGTHAMTRA_WHERE);

			query.append(_FINDER_COLUMN_F_TTHCNOIDUNGTHAMTRAID_TTHCNOIDUNGTHAMTRAID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(tthcNoiDungThamTraId);

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

	private static final String _FINDER_COLUMN_F_TTHCNOIDUNGTHAMTRAID_TTHCNOIDUNGTHAMTRAID_2 =
		"qlvtNoiDungThamTra.tthcNoiDungThamTraId = ?";

	public QlvtNoiDungThamTraPersistenceImpl() {
		setModelClass(QlvtNoiDungThamTra.class);
	}

	/**
	 * Caches the qlvt noi dung tham tra in the entity cache if it is enabled.
	 *
	 * @param qlvtNoiDungThamTra the qlvt noi dung tham tra
	 */
	@Override
	public void cacheResult(QlvtNoiDungThamTra qlvtNoiDungThamTra) {
		EntityCacheUtil.putResult(QlvtNoiDungThamTraModelImpl.ENTITY_CACHE_ENABLED,
			QlvtNoiDungThamTraImpl.class, qlvtNoiDungThamTra.getPrimaryKey(),
			qlvtNoiDungThamTra);

		qlvtNoiDungThamTra.resetOriginalValues();
	}

	/**
	 * Caches the qlvt noi dung tham tras in the entity cache if it is enabled.
	 *
	 * @param qlvtNoiDungThamTras the qlvt noi dung tham tras
	 */
	@Override
	public void cacheResult(List<QlvtNoiDungThamTra> qlvtNoiDungThamTras) {
		for (QlvtNoiDungThamTra qlvtNoiDungThamTra : qlvtNoiDungThamTras) {
			if (EntityCacheUtil.getResult(
						QlvtNoiDungThamTraModelImpl.ENTITY_CACHE_ENABLED,
						QlvtNoiDungThamTraImpl.class,
						qlvtNoiDungThamTra.getPrimaryKey()) == null) {
				cacheResult(qlvtNoiDungThamTra);
			}
			else {
				qlvtNoiDungThamTra.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qlvt noi dung tham tras.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QlvtNoiDungThamTraImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QlvtNoiDungThamTraImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qlvt noi dung tham tra.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QlvtNoiDungThamTra qlvtNoiDungThamTra) {
		EntityCacheUtil.removeResult(QlvtNoiDungThamTraModelImpl.ENTITY_CACHE_ENABLED,
			QlvtNoiDungThamTraImpl.class, qlvtNoiDungThamTra.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<QlvtNoiDungThamTra> qlvtNoiDungThamTras) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QlvtNoiDungThamTra qlvtNoiDungThamTra : qlvtNoiDungThamTras) {
			EntityCacheUtil.removeResult(QlvtNoiDungThamTraModelImpl.ENTITY_CACHE_ENABLED,
				QlvtNoiDungThamTraImpl.class, qlvtNoiDungThamTra.getPrimaryKey());
		}
	}

	/**
	 * Creates a new qlvt noi dung tham tra with the primary key. Does not add the qlvt noi dung tham tra to the database.
	 *
	 * @param id the primary key for the new qlvt noi dung tham tra
	 * @return the new qlvt noi dung tham tra
	 */
	@Override
	public QlvtNoiDungThamTra create(long id) {
		QlvtNoiDungThamTra qlvtNoiDungThamTra = new QlvtNoiDungThamTraImpl();

		qlvtNoiDungThamTra.setNew(true);
		qlvtNoiDungThamTra.setPrimaryKey(id);

		return qlvtNoiDungThamTra;
	}

	/**
	 * Removes the qlvt noi dung tham tra with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the qlvt noi dung tham tra
	 * @return the qlvt noi dung tham tra that was removed
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtNoiDungThamTraException if a qlvt noi dung tham tra with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtNoiDungThamTra remove(long id)
		throws NoSuchQlvtNoiDungThamTraException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the qlvt noi dung tham tra with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qlvt noi dung tham tra
	 * @return the qlvt noi dung tham tra that was removed
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtNoiDungThamTraException if a qlvt noi dung tham tra with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtNoiDungThamTra remove(Serializable primaryKey)
		throws NoSuchQlvtNoiDungThamTraException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QlvtNoiDungThamTra qlvtNoiDungThamTra = (QlvtNoiDungThamTra)session.get(QlvtNoiDungThamTraImpl.class,
					primaryKey);

			if (qlvtNoiDungThamTra == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQlvtNoiDungThamTraException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtNoiDungThamTra);
		}
		catch (NoSuchQlvtNoiDungThamTraException nsee) {
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
	protected QlvtNoiDungThamTra removeImpl(
		QlvtNoiDungThamTra qlvtNoiDungThamTra) throws SystemException {
		qlvtNoiDungThamTra = toUnwrappedModel(qlvtNoiDungThamTra);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtNoiDungThamTra)) {
				qlvtNoiDungThamTra = (QlvtNoiDungThamTra)session.get(QlvtNoiDungThamTraImpl.class,
						qlvtNoiDungThamTra.getPrimaryKeyObj());
			}

			if (qlvtNoiDungThamTra != null) {
				session.delete(qlvtNoiDungThamTra);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtNoiDungThamTra != null) {
			clearCache(qlvtNoiDungThamTra);
		}

		return qlvtNoiDungThamTra;
	}

	@Override
	public QlvtNoiDungThamTra updateImpl(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra qlvtNoiDungThamTra)
		throws SystemException {
		qlvtNoiDungThamTra = toUnwrappedModel(qlvtNoiDungThamTra);

		boolean isNew = qlvtNoiDungThamTra.isNew();

		QlvtNoiDungThamTraModelImpl qlvtNoiDungThamTraModelImpl = (QlvtNoiDungThamTraModelImpl)qlvtNoiDungThamTra;

		Session session = null;

		try {
			session = openSession();

			if (qlvtNoiDungThamTra.isNew()) {
				session.save(qlvtNoiDungThamTra);

				qlvtNoiDungThamTra.setNew(false);
			}
			else {
				session.merge(qlvtNoiDungThamTra);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !QlvtNoiDungThamTraModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((qlvtNoiDungThamTraModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_TTHCNOIDUNGTHAMTRAID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						qlvtNoiDungThamTraModelImpl.getOriginalTthcNoiDungThamTraId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_TTHCNOIDUNGTHAMTRAID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_TTHCNOIDUNGTHAMTRAID,
					args);

				args = new Object[] {
						qlvtNoiDungThamTraModelImpl.getTthcNoiDungThamTraId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_TTHCNOIDUNGTHAMTRAID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_TTHCNOIDUNGTHAMTRAID,
					args);
			}
		}

		EntityCacheUtil.putResult(QlvtNoiDungThamTraModelImpl.ENTITY_CACHE_ENABLED,
			QlvtNoiDungThamTraImpl.class, qlvtNoiDungThamTra.getPrimaryKey(),
			qlvtNoiDungThamTra);

		return qlvtNoiDungThamTra;
	}

	protected QlvtNoiDungThamTra toUnwrappedModel(
		QlvtNoiDungThamTra qlvtNoiDungThamTra) {
		if (qlvtNoiDungThamTra instanceof QlvtNoiDungThamTraImpl) {
			return qlvtNoiDungThamTra;
		}

		QlvtNoiDungThamTraImpl qlvtNoiDungThamTraImpl = new QlvtNoiDungThamTraImpl();

		qlvtNoiDungThamTraImpl.setNew(qlvtNoiDungThamTra.isNew());
		qlvtNoiDungThamTraImpl.setPrimaryKey(qlvtNoiDungThamTra.getPrimaryKey());

		qlvtNoiDungThamTraImpl.setId(qlvtNoiDungThamTra.getId());
		qlvtNoiDungThamTraImpl.setMucKiemTra(qlvtNoiDungThamTra.getMucKiemTra());
		qlvtNoiDungThamTraImpl.setChaId(qlvtNoiDungThamTra.getChaId());
		qlvtNoiDungThamTraImpl.setCoYKien(qlvtNoiDungThamTra.getCoYKien());
		qlvtNoiDungThamTraImpl.setBuocXuLy(qlvtNoiDungThamTra.getBuocXuLy());
		qlvtNoiDungThamTraImpl.setThuTuHienThi(qlvtNoiDungThamTra.getThuTuHienThi());
		qlvtNoiDungThamTraImpl.setTthcNoiDungThamTraId(qlvtNoiDungThamTra.getTthcNoiDungThamTraId());
		qlvtNoiDungThamTraImpl.setTienTo(qlvtNoiDungThamTra.getTienTo());
		qlvtNoiDungThamTraImpl.setThanhPhanHoSo(qlvtNoiDungThamTra.getThanhPhanHoSo());

		return qlvtNoiDungThamTraImpl;
	}

	/**
	 * Returns the qlvt noi dung tham tra with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt noi dung tham tra
	 * @return the qlvt noi dung tham tra
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtNoiDungThamTraException if a qlvt noi dung tham tra with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtNoiDungThamTra findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQlvtNoiDungThamTraException, SystemException {
		QlvtNoiDungThamTra qlvtNoiDungThamTra = fetchByPrimaryKey(primaryKey);

		if (qlvtNoiDungThamTra == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQlvtNoiDungThamTraException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtNoiDungThamTra;
	}

	/**
	 * Returns the qlvt noi dung tham tra with the primary key or throws a {@link vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtNoiDungThamTraException} if it could not be found.
	 *
	 * @param id the primary key of the qlvt noi dung tham tra
	 * @return the qlvt noi dung tham tra
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtNoiDungThamTraException if a qlvt noi dung tham tra with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtNoiDungThamTra findByPrimaryKey(long id)
		throws NoSuchQlvtNoiDungThamTraException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the qlvt noi dung tham tra with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt noi dung tham tra
	 * @return the qlvt noi dung tham tra, or <code>null</code> if a qlvt noi dung tham tra with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtNoiDungThamTra fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QlvtNoiDungThamTra qlvtNoiDungThamTra = (QlvtNoiDungThamTra)EntityCacheUtil.getResult(QlvtNoiDungThamTraModelImpl.ENTITY_CACHE_ENABLED,
				QlvtNoiDungThamTraImpl.class, primaryKey);

		if (qlvtNoiDungThamTra == _nullQlvtNoiDungThamTra) {
			return null;
		}

		if (qlvtNoiDungThamTra == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtNoiDungThamTra = (QlvtNoiDungThamTra)session.get(QlvtNoiDungThamTraImpl.class,
						primaryKey);

				if (qlvtNoiDungThamTra != null) {
					cacheResult(qlvtNoiDungThamTra);
				}
				else {
					EntityCacheUtil.putResult(QlvtNoiDungThamTraModelImpl.ENTITY_CACHE_ENABLED,
						QlvtNoiDungThamTraImpl.class, primaryKey,
						_nullQlvtNoiDungThamTra);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QlvtNoiDungThamTraModelImpl.ENTITY_CACHE_ENABLED,
					QlvtNoiDungThamTraImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtNoiDungThamTra;
	}

	/**
	 * Returns the qlvt noi dung tham tra with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the qlvt noi dung tham tra
	 * @return the qlvt noi dung tham tra, or <code>null</code> if a qlvt noi dung tham tra with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtNoiDungThamTra fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the qlvt noi dung tham tras.
	 *
	 * @return the qlvt noi dung tham tras
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtNoiDungThamTra> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt noi dung tham tras.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtNoiDungThamTraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt noi dung tham tras
	 * @param end the upper bound of the range of qlvt noi dung tham tras (not inclusive)
	 * @return the range of qlvt noi dung tham tras
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtNoiDungThamTra> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt noi dung tham tras.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtNoiDungThamTraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt noi dung tham tras
	 * @param end the upper bound of the range of qlvt noi dung tham tras (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qlvt noi dung tham tras
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtNoiDungThamTra> findAll(int start, int end,
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

		List<QlvtNoiDungThamTra> list = (List<QlvtNoiDungThamTra>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTNOIDUNGTHAMTRA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTNOIDUNGTHAMTRA;

				if (pagination) {
					sql = sql.concat(QlvtNoiDungThamTraModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QlvtNoiDungThamTra>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtNoiDungThamTra>(list);
				}
				else {
					list = (List<QlvtNoiDungThamTra>)QueryUtil.list(q,
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
	 * Removes all the qlvt noi dung tham tras from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QlvtNoiDungThamTra qlvtNoiDungThamTra : findAll()) {
			remove(qlvtNoiDungThamTra);
		}
	}

	/**
	 * Returns the number of qlvt noi dung tham tras.
	 *
	 * @return the number of qlvt noi dung tham tras
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

				Query q = session.createQuery(_SQL_COUNT_QLVTNOIDUNGTHAMTRA);

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
	 * Initializes the qlvt noi dung tham tra persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QlvtNoiDungThamTra>> listenersList = new ArrayList<ModelListener<QlvtNoiDungThamTra>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QlvtNoiDungThamTra>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QlvtNoiDungThamTraImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTNOIDUNGTHAMTRA = "SELECT qlvtNoiDungThamTra FROM QlvtNoiDungThamTra qlvtNoiDungThamTra";
	private static final String _SQL_SELECT_QLVTNOIDUNGTHAMTRA_WHERE = "SELECT qlvtNoiDungThamTra FROM QlvtNoiDungThamTra qlvtNoiDungThamTra WHERE ";
	private static final String _SQL_COUNT_QLVTNOIDUNGTHAMTRA = "SELECT COUNT(qlvtNoiDungThamTra) FROM QlvtNoiDungThamTra qlvtNoiDungThamTra";
	private static final String _SQL_COUNT_QLVTNOIDUNGTHAMTRA_WHERE = "SELECT COUNT(qlvtNoiDungThamTra) FROM QlvtNoiDungThamTra qlvtNoiDungThamTra WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtNoiDungThamTra.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QlvtNoiDungThamTra exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No QlvtNoiDungThamTra exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QlvtNoiDungThamTraPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"mucKiemTra", "chaId", "coYKien", "buocXuLy", "thuTuHienThi",
				"tthcNoiDungThamTraId", "tienTo", "thanhPhanHoSo"
			});
	private static QlvtNoiDungThamTra _nullQlvtNoiDungThamTra = new QlvtNoiDungThamTraImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QlvtNoiDungThamTra> toCacheModel() {
				return _nullQlvtNoiDungThamTraCacheModel;
			}
		};

	private static CacheModel<QlvtNoiDungThamTra> _nullQlvtNoiDungThamTraCacheModel =
		new CacheModel<QlvtNoiDungThamTra>() {
			@Override
			public QlvtNoiDungThamTra toEntityModel() {
				return _nullQlvtNoiDungThamTra;
			}
		};
}