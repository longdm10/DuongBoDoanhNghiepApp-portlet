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

import vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException;
import vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile;
import vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtQuanLyFileImpl;
import vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtQuanLyFileModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the qlvt quan ly file service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanNc
 * @see QlvtQuanLyFilePersistence
 * @see QlvtQuanLyFileUtil
 * @generated
 */
public class QlvtQuanLyFilePersistenceImpl extends BasePersistenceImpl<QlvtQuanLyFile>
	implements QlvtQuanLyFilePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link QlvtQuanLyFileUtil} to access the qlvt quan ly file persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = QlvtQuanLyFileImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QlvtQuanLyFileModelImpl.ENTITY_CACHE_ENABLED,
			QlvtQuanLyFileModelImpl.FINDER_CACHE_ENABLED,
			QlvtQuanLyFileImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QlvtQuanLyFileModelImpl.ENTITY_CACHE_ENABLED,
			QlvtQuanLyFileModelImpl.FINDER_CACHE_ENABLED,
			QlvtQuanLyFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QlvtQuanLyFileModelImpl.ENTITY_CACHE_ENABLED,
			QlvtQuanLyFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOANHNGHIEPID =
		new FinderPath(QlvtQuanLyFileModelImpl.ENTITY_CACHE_ENABLED,
			QlvtQuanLyFileModelImpl.FINDER_CACHE_ENABLED,
			QlvtQuanLyFileImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDoanhNghiepId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOANHNGHIEPID =
		new FinderPath(QlvtQuanLyFileModelImpl.ENTITY_CACHE_ENABLED,
			QlvtQuanLyFileModelImpl.FINDER_CACHE_ENABLED,
			QlvtQuanLyFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDoanhNghiepId",
			new String[] { Long.class.getName() },
			QlvtQuanLyFileModelImpl.DOANHNGHIEPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOANHNGHIEPID = new FinderPath(QlvtQuanLyFileModelImpl.ENTITY_CACHE_ENABLED,
			QlvtQuanLyFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDoanhNghiepId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the qlvt quan ly files where doanhNghiepId = &#63;.
	 *
	 * @param doanhNghiepId the doanh nghiep ID
	 * @return the matching qlvt quan ly files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtQuanLyFile> findByDoanhNghiepId(long doanhNghiepId)
		throws SystemException {
		return findByDoanhNghiepId(doanhNghiepId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt quan ly files where doanhNghiepId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtQuanLyFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param doanhNghiepId the doanh nghiep ID
	 * @param start the lower bound of the range of qlvt quan ly files
	 * @param end the upper bound of the range of qlvt quan ly files (not inclusive)
	 * @return the range of matching qlvt quan ly files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtQuanLyFile> findByDoanhNghiepId(long doanhNghiepId,
		int start, int end) throws SystemException {
		return findByDoanhNghiepId(doanhNghiepId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt quan ly files where doanhNghiepId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtQuanLyFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param doanhNghiepId the doanh nghiep ID
	 * @param start the lower bound of the range of qlvt quan ly files
	 * @param end the upper bound of the range of qlvt quan ly files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching qlvt quan ly files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtQuanLyFile> findByDoanhNghiepId(long doanhNghiepId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOANHNGHIEPID;
			finderArgs = new Object[] { doanhNghiepId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOANHNGHIEPID;
			finderArgs = new Object[] {
					doanhNghiepId,
					
					start, end, orderByComparator
				};
		}

		List<QlvtQuanLyFile> list = (List<QlvtQuanLyFile>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (QlvtQuanLyFile qlvtQuanLyFile : list) {
				if ((doanhNghiepId != qlvtQuanLyFile.getDoanhNghiepId())) {
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

			query.append(_SQL_SELECT_QLVTQUANLYFILE_WHERE);

			query.append(_FINDER_COLUMN_DOANHNGHIEPID_DOANHNGHIEPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(QlvtQuanLyFileModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(doanhNghiepId);

				if (!pagination) {
					list = (List<QlvtQuanLyFile>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtQuanLyFile>(list);
				}
				else {
					list = (List<QlvtQuanLyFile>)QueryUtil.list(q,
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
	 * Returns the first qlvt quan ly file in the ordered set where doanhNghiepId = &#63;.
	 *
	 * @param doanhNghiepId the doanh nghiep ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qlvt quan ly file
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException if a matching qlvt quan ly file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtQuanLyFile findByDoanhNghiepId_First(long doanhNghiepId,
		OrderByComparator orderByComparator)
		throws NoSuchQlvtQuanLyFileException, SystemException {
		QlvtQuanLyFile qlvtQuanLyFile = fetchByDoanhNghiepId_First(doanhNghiepId,
				orderByComparator);

		if (qlvtQuanLyFile != null) {
			return qlvtQuanLyFile;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("doanhNghiepId=");
		msg.append(doanhNghiepId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchQlvtQuanLyFileException(msg.toString());
	}

	/**
	 * Returns the first qlvt quan ly file in the ordered set where doanhNghiepId = &#63;.
	 *
	 * @param doanhNghiepId the doanh nghiep ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching qlvt quan ly file, or <code>null</code> if a matching qlvt quan ly file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtQuanLyFile fetchByDoanhNghiepId_First(long doanhNghiepId,
		OrderByComparator orderByComparator) throws SystemException {
		List<QlvtQuanLyFile> list = findByDoanhNghiepId(doanhNghiepId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last qlvt quan ly file in the ordered set where doanhNghiepId = &#63;.
	 *
	 * @param doanhNghiepId the doanh nghiep ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qlvt quan ly file
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException if a matching qlvt quan ly file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtQuanLyFile findByDoanhNghiepId_Last(long doanhNghiepId,
		OrderByComparator orderByComparator)
		throws NoSuchQlvtQuanLyFileException, SystemException {
		QlvtQuanLyFile qlvtQuanLyFile = fetchByDoanhNghiepId_Last(doanhNghiepId,
				orderByComparator);

		if (qlvtQuanLyFile != null) {
			return qlvtQuanLyFile;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("doanhNghiepId=");
		msg.append(doanhNghiepId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchQlvtQuanLyFileException(msg.toString());
	}

	/**
	 * Returns the last qlvt quan ly file in the ordered set where doanhNghiepId = &#63;.
	 *
	 * @param doanhNghiepId the doanh nghiep ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching qlvt quan ly file, or <code>null</code> if a matching qlvt quan ly file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtQuanLyFile fetchByDoanhNghiepId_Last(long doanhNghiepId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByDoanhNghiepId(doanhNghiepId);

		if (count == 0) {
			return null;
		}

		List<QlvtQuanLyFile> list = findByDoanhNghiepId(doanhNghiepId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the qlvt quan ly files before and after the current qlvt quan ly file in the ordered set where doanhNghiepId = &#63;.
	 *
	 * @param id the primary key of the current qlvt quan ly file
	 * @param doanhNghiepId the doanh nghiep ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next qlvt quan ly file
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException if a qlvt quan ly file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtQuanLyFile[] findByDoanhNghiepId_PrevAndNext(long id,
		long doanhNghiepId, OrderByComparator orderByComparator)
		throws NoSuchQlvtQuanLyFileException, SystemException {
		QlvtQuanLyFile qlvtQuanLyFile = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			QlvtQuanLyFile[] array = new QlvtQuanLyFileImpl[3];

			array[0] = getByDoanhNghiepId_PrevAndNext(session, qlvtQuanLyFile,
					doanhNghiepId, orderByComparator, true);

			array[1] = qlvtQuanLyFile;

			array[2] = getByDoanhNghiepId_PrevAndNext(session, qlvtQuanLyFile,
					doanhNghiepId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected QlvtQuanLyFile getByDoanhNghiepId_PrevAndNext(Session session,
		QlvtQuanLyFile qlvtQuanLyFile, long doanhNghiepId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_QLVTQUANLYFILE_WHERE);

		query.append(_FINDER_COLUMN_DOANHNGHIEPID_DOANHNGHIEPID_2);

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
			query.append(QlvtQuanLyFileModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(doanhNghiepId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(qlvtQuanLyFile);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<QlvtQuanLyFile> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the qlvt quan ly files where doanhNghiepId = &#63; from the database.
	 *
	 * @param doanhNghiepId the doanh nghiep ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDoanhNghiepId(long doanhNghiepId)
		throws SystemException {
		for (QlvtQuanLyFile qlvtQuanLyFile : findByDoanhNghiepId(
				doanhNghiepId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(qlvtQuanLyFile);
		}
	}

	/**
	 * Returns the number of qlvt quan ly files where doanhNghiepId = &#63;.
	 *
	 * @param doanhNghiepId the doanh nghiep ID
	 * @return the number of matching qlvt quan ly files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDoanhNghiepId(long doanhNghiepId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOANHNGHIEPID;

		Object[] finderArgs = new Object[] { doanhNghiepId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_QLVTQUANLYFILE_WHERE);

			query.append(_FINDER_COLUMN_DOANHNGHIEPID_DOANHNGHIEPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(doanhNghiepId);

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

	private static final String _FINDER_COLUMN_DOANHNGHIEPID_DOANHNGHIEPID_2 = "qlvtQuanLyFile.doanhNghiepId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_IDFILE = new FinderPath(QlvtQuanLyFileModelImpl.ENTITY_CACHE_ENABLED,
			QlvtQuanLyFileModelImpl.FINDER_CACHE_ENABLED,
			QlvtQuanLyFileImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByIdFile", new String[] { Long.class.getName() },
			QlvtQuanLyFileModelImpl.IDFILE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_IDFILE = new FinderPath(QlvtQuanLyFileModelImpl.ENTITY_CACHE_ENABLED,
			QlvtQuanLyFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByIdFile",
			new String[] { Long.class.getName() });

	/**
	 * Returns the qlvt quan ly file where idFile = &#63; or throws a {@link vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException} if it could not be found.
	 *
	 * @param idFile the id file
	 * @return the matching qlvt quan ly file
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException if a matching qlvt quan ly file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtQuanLyFile findByIdFile(long idFile)
		throws NoSuchQlvtQuanLyFileException, SystemException {
		QlvtQuanLyFile qlvtQuanLyFile = fetchByIdFile(idFile);

		if (qlvtQuanLyFile == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("idFile=");
			msg.append(idFile);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchQlvtQuanLyFileException(msg.toString());
		}

		return qlvtQuanLyFile;
	}

	/**
	 * Returns the qlvt quan ly file where idFile = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param idFile the id file
	 * @return the matching qlvt quan ly file, or <code>null</code> if a matching qlvt quan ly file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtQuanLyFile fetchByIdFile(long idFile) throws SystemException {
		return fetchByIdFile(idFile, true);
	}

	/**
	 * Returns the qlvt quan ly file where idFile = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param idFile the id file
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching qlvt quan ly file, or <code>null</code> if a matching qlvt quan ly file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtQuanLyFile fetchByIdFile(long idFile, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { idFile };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_IDFILE,
					finderArgs, this);
		}

		if (result instanceof QlvtQuanLyFile) {
			QlvtQuanLyFile qlvtQuanLyFile = (QlvtQuanLyFile)result;

			if ((idFile != qlvtQuanLyFile.getIdFile())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_QLVTQUANLYFILE_WHERE);

			query.append(_FINDER_COLUMN_IDFILE_IDFILE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(idFile);

				List<QlvtQuanLyFile> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_IDFILE,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"QlvtQuanLyFilePersistenceImpl.fetchByIdFile(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					QlvtQuanLyFile qlvtQuanLyFile = list.get(0);

					result = qlvtQuanLyFile;

					cacheResult(qlvtQuanLyFile);

					if ((qlvtQuanLyFile.getIdFile() != idFile)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_IDFILE,
							finderArgs, qlvtQuanLyFile);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_IDFILE,
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
			return (QlvtQuanLyFile)result;
		}
	}

	/**
	 * Removes the qlvt quan ly file where idFile = &#63; from the database.
	 *
	 * @param idFile the id file
	 * @return the qlvt quan ly file that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtQuanLyFile removeByIdFile(long idFile)
		throws NoSuchQlvtQuanLyFileException, SystemException {
		QlvtQuanLyFile qlvtQuanLyFile = findByIdFile(idFile);

		return remove(qlvtQuanLyFile);
	}

	/**
	 * Returns the number of qlvt quan ly files where idFile = &#63;.
	 *
	 * @param idFile the id file
	 * @return the number of matching qlvt quan ly files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByIdFile(long idFile) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_IDFILE;

		Object[] finderArgs = new Object[] { idFile };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_QLVTQUANLYFILE_WHERE);

			query.append(_FINDER_COLUMN_IDFILE_IDFILE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(idFile);

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

	private static final String _FINDER_COLUMN_IDFILE_IDFILE_2 = "qlvtQuanLyFile.idFile = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_IDFILEANDDOANHNGHIEPID = new FinderPath(QlvtQuanLyFileModelImpl.ENTITY_CACHE_ENABLED,
			QlvtQuanLyFileModelImpl.FINDER_CACHE_ENABLED,
			QlvtQuanLyFileImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByIdFileAndDoanhNghiepID",
			new String[] { Long.class.getName(), Long.class.getName() },
			QlvtQuanLyFileModelImpl.IDFILE_COLUMN_BITMASK |
			QlvtQuanLyFileModelImpl.DOANHNGHIEPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_IDFILEANDDOANHNGHIEPID = new FinderPath(QlvtQuanLyFileModelImpl.ENTITY_CACHE_ENABLED,
			QlvtQuanLyFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByIdFileAndDoanhNghiepID",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the qlvt quan ly file where idFile = &#63; and doanhNghiepId = &#63; or throws a {@link vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException} if it could not be found.
	 *
	 * @param idFile the id file
	 * @param doanhNghiepId the doanh nghiep ID
	 * @return the matching qlvt quan ly file
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException if a matching qlvt quan ly file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtQuanLyFile findByIdFileAndDoanhNghiepID(long idFile,
		long doanhNghiepId)
		throws NoSuchQlvtQuanLyFileException, SystemException {
		QlvtQuanLyFile qlvtQuanLyFile = fetchByIdFileAndDoanhNghiepID(idFile,
				doanhNghiepId);

		if (qlvtQuanLyFile == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("idFile=");
			msg.append(idFile);

			msg.append(", doanhNghiepId=");
			msg.append(doanhNghiepId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchQlvtQuanLyFileException(msg.toString());
		}

		return qlvtQuanLyFile;
	}

	/**
	 * Returns the qlvt quan ly file where idFile = &#63; and doanhNghiepId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param idFile the id file
	 * @param doanhNghiepId the doanh nghiep ID
	 * @return the matching qlvt quan ly file, or <code>null</code> if a matching qlvt quan ly file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtQuanLyFile fetchByIdFileAndDoanhNghiepID(long idFile,
		long doanhNghiepId) throws SystemException {
		return fetchByIdFileAndDoanhNghiepID(idFile, doanhNghiepId, true);
	}

	/**
	 * Returns the qlvt quan ly file where idFile = &#63; and doanhNghiepId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param idFile the id file
	 * @param doanhNghiepId the doanh nghiep ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching qlvt quan ly file, or <code>null</code> if a matching qlvt quan ly file could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtQuanLyFile fetchByIdFileAndDoanhNghiepID(long idFile,
		long doanhNghiepId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { idFile, doanhNghiepId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_IDFILEANDDOANHNGHIEPID,
					finderArgs, this);
		}

		if (result instanceof QlvtQuanLyFile) {
			QlvtQuanLyFile qlvtQuanLyFile = (QlvtQuanLyFile)result;

			if ((idFile != qlvtQuanLyFile.getIdFile()) ||
					(doanhNghiepId != qlvtQuanLyFile.getDoanhNghiepId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_QLVTQUANLYFILE_WHERE);

			query.append(_FINDER_COLUMN_IDFILEANDDOANHNGHIEPID_IDFILE_2);

			query.append(_FINDER_COLUMN_IDFILEANDDOANHNGHIEPID_DOANHNGHIEPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(idFile);

				qPos.add(doanhNghiepId);

				List<QlvtQuanLyFile> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_IDFILEANDDOANHNGHIEPID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"QlvtQuanLyFilePersistenceImpl.fetchByIdFileAndDoanhNghiepID(long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					QlvtQuanLyFile qlvtQuanLyFile = list.get(0);

					result = qlvtQuanLyFile;

					cacheResult(qlvtQuanLyFile);

					if ((qlvtQuanLyFile.getIdFile() != idFile) ||
							(qlvtQuanLyFile.getDoanhNghiepId() != doanhNghiepId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_IDFILEANDDOANHNGHIEPID,
							finderArgs, qlvtQuanLyFile);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_IDFILEANDDOANHNGHIEPID,
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
			return (QlvtQuanLyFile)result;
		}
	}

	/**
	 * Removes the qlvt quan ly file where idFile = &#63; and doanhNghiepId = &#63; from the database.
	 *
	 * @param idFile the id file
	 * @param doanhNghiepId the doanh nghiep ID
	 * @return the qlvt quan ly file that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtQuanLyFile removeByIdFileAndDoanhNghiepID(long idFile,
		long doanhNghiepId)
		throws NoSuchQlvtQuanLyFileException, SystemException {
		QlvtQuanLyFile qlvtQuanLyFile = findByIdFileAndDoanhNghiepID(idFile,
				doanhNghiepId);

		return remove(qlvtQuanLyFile);
	}

	/**
	 * Returns the number of qlvt quan ly files where idFile = &#63; and doanhNghiepId = &#63;.
	 *
	 * @param idFile the id file
	 * @param doanhNghiepId the doanh nghiep ID
	 * @return the number of matching qlvt quan ly files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByIdFileAndDoanhNghiepID(long idFile, long doanhNghiepId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_IDFILEANDDOANHNGHIEPID;

		Object[] finderArgs = new Object[] { idFile, doanhNghiepId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_QLVTQUANLYFILE_WHERE);

			query.append(_FINDER_COLUMN_IDFILEANDDOANHNGHIEPID_IDFILE_2);

			query.append(_FINDER_COLUMN_IDFILEANDDOANHNGHIEPID_DOANHNGHIEPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(idFile);

				qPos.add(doanhNghiepId);

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

	private static final String _FINDER_COLUMN_IDFILEANDDOANHNGHIEPID_IDFILE_2 = "qlvtQuanLyFile.idFile = ? AND ";
	private static final String _FINDER_COLUMN_IDFILEANDDOANHNGHIEPID_DOANHNGHIEPID_2 =
		"qlvtQuanLyFile.doanhNghiepId = ?";

	public QlvtQuanLyFilePersistenceImpl() {
		setModelClass(QlvtQuanLyFile.class);
	}

	/**
	 * Caches the qlvt quan ly file in the entity cache if it is enabled.
	 *
	 * @param qlvtQuanLyFile the qlvt quan ly file
	 */
	@Override
	public void cacheResult(QlvtQuanLyFile qlvtQuanLyFile) {
		EntityCacheUtil.putResult(QlvtQuanLyFileModelImpl.ENTITY_CACHE_ENABLED,
			QlvtQuanLyFileImpl.class, qlvtQuanLyFile.getPrimaryKey(),
			qlvtQuanLyFile);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_IDFILE,
			new Object[] { qlvtQuanLyFile.getIdFile() }, qlvtQuanLyFile);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_IDFILEANDDOANHNGHIEPID,
			new Object[] {
				qlvtQuanLyFile.getIdFile(), qlvtQuanLyFile.getDoanhNghiepId()
			}, qlvtQuanLyFile);

		qlvtQuanLyFile.resetOriginalValues();
	}

	/**
	 * Caches the qlvt quan ly files in the entity cache if it is enabled.
	 *
	 * @param qlvtQuanLyFiles the qlvt quan ly files
	 */
	@Override
	public void cacheResult(List<QlvtQuanLyFile> qlvtQuanLyFiles) {
		for (QlvtQuanLyFile qlvtQuanLyFile : qlvtQuanLyFiles) {
			if (EntityCacheUtil.getResult(
						QlvtQuanLyFileModelImpl.ENTITY_CACHE_ENABLED,
						QlvtQuanLyFileImpl.class, qlvtQuanLyFile.getPrimaryKey()) == null) {
				cacheResult(qlvtQuanLyFile);
			}
			else {
				qlvtQuanLyFile.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all qlvt quan ly files.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(QlvtQuanLyFileImpl.class.getName());
		}

		EntityCacheUtil.clearCache(QlvtQuanLyFileImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the qlvt quan ly file.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QlvtQuanLyFile qlvtQuanLyFile) {
		EntityCacheUtil.removeResult(QlvtQuanLyFileModelImpl.ENTITY_CACHE_ENABLED,
			QlvtQuanLyFileImpl.class, qlvtQuanLyFile.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(qlvtQuanLyFile);
	}

	@Override
	public void clearCache(List<QlvtQuanLyFile> qlvtQuanLyFiles) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (QlvtQuanLyFile qlvtQuanLyFile : qlvtQuanLyFiles) {
			EntityCacheUtil.removeResult(QlvtQuanLyFileModelImpl.ENTITY_CACHE_ENABLED,
				QlvtQuanLyFileImpl.class, qlvtQuanLyFile.getPrimaryKey());

			clearUniqueFindersCache(qlvtQuanLyFile);
		}
	}

	protected void cacheUniqueFindersCache(QlvtQuanLyFile qlvtQuanLyFile) {
		if (qlvtQuanLyFile.isNew()) {
			Object[] args = new Object[] { qlvtQuanLyFile.getIdFile() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_IDFILE, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_IDFILE, args,
				qlvtQuanLyFile);

			args = new Object[] {
					qlvtQuanLyFile.getIdFile(),
					qlvtQuanLyFile.getDoanhNghiepId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_IDFILEANDDOANHNGHIEPID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_IDFILEANDDOANHNGHIEPID,
				args, qlvtQuanLyFile);
		}
		else {
			QlvtQuanLyFileModelImpl qlvtQuanLyFileModelImpl = (QlvtQuanLyFileModelImpl)qlvtQuanLyFile;

			if ((qlvtQuanLyFileModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_IDFILE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { qlvtQuanLyFile.getIdFile() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_IDFILE, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_IDFILE, args,
					qlvtQuanLyFile);
			}

			if ((qlvtQuanLyFileModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_IDFILEANDDOANHNGHIEPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						qlvtQuanLyFile.getIdFile(),
						qlvtQuanLyFile.getDoanhNghiepId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_IDFILEANDDOANHNGHIEPID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_IDFILEANDDOANHNGHIEPID,
					args, qlvtQuanLyFile);
			}
		}
	}

	protected void clearUniqueFindersCache(QlvtQuanLyFile qlvtQuanLyFile) {
		QlvtQuanLyFileModelImpl qlvtQuanLyFileModelImpl = (QlvtQuanLyFileModelImpl)qlvtQuanLyFile;

		Object[] args = new Object[] { qlvtQuanLyFile.getIdFile() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IDFILE, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_IDFILE, args);

		if ((qlvtQuanLyFileModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_IDFILE.getColumnBitmask()) != 0) {
			args = new Object[] { qlvtQuanLyFileModelImpl.getOriginalIdFile() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IDFILE, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_IDFILE, args);
		}

		args = new Object[] {
				qlvtQuanLyFile.getIdFile(), qlvtQuanLyFile.getDoanhNghiepId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IDFILEANDDOANHNGHIEPID,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_IDFILEANDDOANHNGHIEPID,
			args);

		if ((qlvtQuanLyFileModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_IDFILEANDDOANHNGHIEPID.getColumnBitmask()) != 0) {
			args = new Object[] {
					qlvtQuanLyFileModelImpl.getOriginalIdFile(),
					qlvtQuanLyFileModelImpl.getOriginalDoanhNghiepId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IDFILEANDDOANHNGHIEPID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_IDFILEANDDOANHNGHIEPID,
				args);
		}
	}

	/**
	 * Creates a new qlvt quan ly file with the primary key. Does not add the qlvt quan ly file to the database.
	 *
	 * @param id the primary key for the new qlvt quan ly file
	 * @return the new qlvt quan ly file
	 */
	@Override
	public QlvtQuanLyFile create(long id) {
		QlvtQuanLyFile qlvtQuanLyFile = new QlvtQuanLyFileImpl();

		qlvtQuanLyFile.setNew(true);
		qlvtQuanLyFile.setPrimaryKey(id);

		return qlvtQuanLyFile;
	}

	/**
	 * Removes the qlvt quan ly file with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the qlvt quan ly file
	 * @return the qlvt quan ly file that was removed
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException if a qlvt quan ly file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtQuanLyFile remove(long id)
		throws NoSuchQlvtQuanLyFileException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the qlvt quan ly file with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the qlvt quan ly file
	 * @return the qlvt quan ly file that was removed
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException if a qlvt quan ly file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtQuanLyFile remove(Serializable primaryKey)
		throws NoSuchQlvtQuanLyFileException, SystemException {
		Session session = null;

		try {
			session = openSession();

			QlvtQuanLyFile qlvtQuanLyFile = (QlvtQuanLyFile)session.get(QlvtQuanLyFileImpl.class,
					primaryKey);

			if (qlvtQuanLyFile == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQlvtQuanLyFileException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(qlvtQuanLyFile);
		}
		catch (NoSuchQlvtQuanLyFileException nsee) {
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
	protected QlvtQuanLyFile removeImpl(QlvtQuanLyFile qlvtQuanLyFile)
		throws SystemException {
		qlvtQuanLyFile = toUnwrappedModel(qlvtQuanLyFile);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qlvtQuanLyFile)) {
				qlvtQuanLyFile = (QlvtQuanLyFile)session.get(QlvtQuanLyFileImpl.class,
						qlvtQuanLyFile.getPrimaryKeyObj());
			}

			if (qlvtQuanLyFile != null) {
				session.delete(qlvtQuanLyFile);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (qlvtQuanLyFile != null) {
			clearCache(qlvtQuanLyFile);
		}

		return qlvtQuanLyFile;
	}

	@Override
	public QlvtQuanLyFile updateImpl(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile qlvtQuanLyFile)
		throws SystemException {
		qlvtQuanLyFile = toUnwrappedModel(qlvtQuanLyFile);

		boolean isNew = qlvtQuanLyFile.isNew();

		QlvtQuanLyFileModelImpl qlvtQuanLyFileModelImpl = (QlvtQuanLyFileModelImpl)qlvtQuanLyFile;

		Session session = null;

		try {
			session = openSession();

			if (qlvtQuanLyFile.isNew()) {
				session.save(qlvtQuanLyFile);

				qlvtQuanLyFile.setNew(false);
			}
			else {
				session.merge(qlvtQuanLyFile);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !QlvtQuanLyFileModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((qlvtQuanLyFileModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOANHNGHIEPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						qlvtQuanLyFileModelImpl.getOriginalDoanhNghiepId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOANHNGHIEPID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOANHNGHIEPID,
					args);

				args = new Object[] { qlvtQuanLyFileModelImpl.getDoanhNghiepId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOANHNGHIEPID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOANHNGHIEPID,
					args);
			}
		}

		EntityCacheUtil.putResult(QlvtQuanLyFileModelImpl.ENTITY_CACHE_ENABLED,
			QlvtQuanLyFileImpl.class, qlvtQuanLyFile.getPrimaryKey(),
			qlvtQuanLyFile);

		clearUniqueFindersCache(qlvtQuanLyFile);
		cacheUniqueFindersCache(qlvtQuanLyFile);

		return qlvtQuanLyFile;
	}

	protected QlvtQuanLyFile toUnwrappedModel(QlvtQuanLyFile qlvtQuanLyFile) {
		if (qlvtQuanLyFile instanceof QlvtQuanLyFileImpl) {
			return qlvtQuanLyFile;
		}

		QlvtQuanLyFileImpl qlvtQuanLyFileImpl = new QlvtQuanLyFileImpl();

		qlvtQuanLyFileImpl.setNew(qlvtQuanLyFile.isNew());
		qlvtQuanLyFileImpl.setPrimaryKey(qlvtQuanLyFile.getPrimaryKey());

		qlvtQuanLyFileImpl.setId(qlvtQuanLyFile.getId());
		qlvtQuanLyFileImpl.setTenFile(qlvtQuanLyFile.getTenFile());
		qlvtQuanLyFileImpl.setLoaiFile(qlvtQuanLyFile.getLoaiFile());
		qlvtQuanLyFileImpl.setThongTinFile(qlvtQuanLyFile.getThongTinFile());
		qlvtQuanLyFileImpl.setNgayTai(qlvtQuanLyFile.getNgayTai());
		qlvtQuanLyFileImpl.setNgayCap(qlvtQuanLyFile.getNgayCap());
		qlvtQuanLyFileImpl.setNgayHetHan(qlvtQuanLyFile.getNgayHetHan());
		qlvtQuanLyFileImpl.setIdFile(qlvtQuanLyFile.getIdFile());
		qlvtQuanLyFileImpl.setTrangThai(qlvtQuanLyFile.getTrangThai());
		qlvtQuanLyFileImpl.setDoanhNghiepId(qlvtQuanLyFile.getDoanhNghiepId());
		qlvtQuanLyFileImpl.setTaiKhoan(qlvtQuanLyFile.getTaiKhoan());
		qlvtQuanLyFileImpl.setMieuTa(qlvtQuanLyFile.getMieuTa());

		return qlvtQuanLyFileImpl;
	}

	/**
	 * Returns the qlvt quan ly file with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt quan ly file
	 * @return the qlvt quan ly file
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException if a qlvt quan ly file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtQuanLyFile findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQlvtQuanLyFileException, SystemException {
		QlvtQuanLyFile qlvtQuanLyFile = fetchByPrimaryKey(primaryKey);

		if (qlvtQuanLyFile == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQlvtQuanLyFileException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return qlvtQuanLyFile;
	}

	/**
	 * Returns the qlvt quan ly file with the primary key or throws a {@link vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException} if it could not be found.
	 *
	 * @param id the primary key of the qlvt quan ly file
	 * @return the qlvt quan ly file
	 * @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException if a qlvt quan ly file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtQuanLyFile findByPrimaryKey(long id)
		throws NoSuchQlvtQuanLyFileException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the qlvt quan ly file with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the qlvt quan ly file
	 * @return the qlvt quan ly file, or <code>null</code> if a qlvt quan ly file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtQuanLyFile fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		QlvtQuanLyFile qlvtQuanLyFile = (QlvtQuanLyFile)EntityCacheUtil.getResult(QlvtQuanLyFileModelImpl.ENTITY_CACHE_ENABLED,
				QlvtQuanLyFileImpl.class, primaryKey);

		if (qlvtQuanLyFile == _nullQlvtQuanLyFile) {
			return null;
		}

		if (qlvtQuanLyFile == null) {
			Session session = null;

			try {
				session = openSession();

				qlvtQuanLyFile = (QlvtQuanLyFile)session.get(QlvtQuanLyFileImpl.class,
						primaryKey);

				if (qlvtQuanLyFile != null) {
					cacheResult(qlvtQuanLyFile);
				}
				else {
					EntityCacheUtil.putResult(QlvtQuanLyFileModelImpl.ENTITY_CACHE_ENABLED,
						QlvtQuanLyFileImpl.class, primaryKey,
						_nullQlvtQuanLyFile);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(QlvtQuanLyFileModelImpl.ENTITY_CACHE_ENABLED,
					QlvtQuanLyFileImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return qlvtQuanLyFile;
	}

	/**
	 * Returns the qlvt quan ly file with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the qlvt quan ly file
	 * @return the qlvt quan ly file, or <code>null</code> if a qlvt quan ly file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public QlvtQuanLyFile fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the qlvt quan ly files.
	 *
	 * @return the qlvt quan ly files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtQuanLyFile> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the qlvt quan ly files.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtQuanLyFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt quan ly files
	 * @param end the upper bound of the range of qlvt quan ly files (not inclusive)
	 * @return the range of qlvt quan ly files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtQuanLyFile> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the qlvt quan ly files.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtQuanLyFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of qlvt quan ly files
	 * @param end the upper bound of the range of qlvt quan ly files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of qlvt quan ly files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<QlvtQuanLyFile> findAll(int start, int end,
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

		List<QlvtQuanLyFile> list = (List<QlvtQuanLyFile>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_QLVTQUANLYFILE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QLVTQUANLYFILE;

				if (pagination) {
					sql = sql.concat(QlvtQuanLyFileModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<QlvtQuanLyFile>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<QlvtQuanLyFile>(list);
				}
				else {
					list = (List<QlvtQuanLyFile>)QueryUtil.list(q,
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
	 * Removes all the qlvt quan ly files from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (QlvtQuanLyFile qlvtQuanLyFile : findAll()) {
			remove(qlvtQuanLyFile);
		}
	}

	/**
	 * Returns the number of qlvt quan ly files.
	 *
	 * @return the number of qlvt quan ly files
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

				Query q = session.createQuery(_SQL_COUNT_QLVTQUANLYFILE);

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
	 * Initializes the qlvt quan ly file persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<QlvtQuanLyFile>> listenersList = new ArrayList<ModelListener<QlvtQuanLyFile>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<QlvtQuanLyFile>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(QlvtQuanLyFileImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_QLVTQUANLYFILE = "SELECT qlvtQuanLyFile FROM QlvtQuanLyFile qlvtQuanLyFile";
	private static final String _SQL_SELECT_QLVTQUANLYFILE_WHERE = "SELECT qlvtQuanLyFile FROM QlvtQuanLyFile qlvtQuanLyFile WHERE ";
	private static final String _SQL_COUNT_QLVTQUANLYFILE = "SELECT COUNT(qlvtQuanLyFile) FROM QlvtQuanLyFile qlvtQuanLyFile";
	private static final String _SQL_COUNT_QLVTQUANLYFILE_WHERE = "SELECT COUNT(qlvtQuanLyFile) FROM QlvtQuanLyFile qlvtQuanLyFile WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "qlvtQuanLyFile.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QlvtQuanLyFile exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No QlvtQuanLyFile exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(QlvtQuanLyFilePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "tenFile", "loaiFile", "thongTinFile", "ngayTai",
				"ngayCap", "ngayHetHan", "idFile", "trangThai", "doanhNghiepId",
				"taiKhoan", "mieuTa"
			});
	private static QlvtQuanLyFile _nullQlvtQuanLyFile = new QlvtQuanLyFileImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<QlvtQuanLyFile> toCacheModel() {
				return _nullQlvtQuanLyFileCacheModel;
			}
		};

	private static CacheModel<QlvtQuanLyFile> _nullQlvtQuanLyFileCacheModel = new CacheModel<QlvtQuanLyFile>() {
			@Override
			public QlvtQuanLyFile toEntityModel() {
				return _nullQlvtQuanLyFile;
			}
		};
}