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

package vn.dtt.duongbien.dao.vrcb.service.persistence;

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

import vn.dtt.duongbien.dao.vrcb.NoSuchTempDangerousGoodsNanifestException;
import vn.dtt.duongbien.dao.vrcb.model.TempDangerousGoodsNanifest;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempDangerousGoodsNanifestImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempDangerousGoodsNanifestModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the temp dangerous goods nanifest service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see TempDangerousGoodsNanifestPersistence
 * @see TempDangerousGoodsNanifestUtil
 * @generated
 */
public class TempDangerousGoodsNanifestPersistenceImpl
	extends BasePersistenceImpl<TempDangerousGoodsNanifest>
	implements TempDangerousGoodsNanifestPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TempDangerousGoodsNanifestUtil} to access the temp dangerous goods nanifest persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TempDangerousGoodsNanifestImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TempDangerousGoodsNanifestModelImpl.ENTITY_CACHE_ENABLED,
			TempDangerousGoodsNanifestModelImpl.FINDER_CACHE_ENABLED,
			TempDangerousGoodsNanifestImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TempDangerousGoodsNanifestModelImpl.ENTITY_CACHE_ENABLED,
			TempDangerousGoodsNanifestModelImpl.FINDER_CACHE_ENABLED,
			TempDangerousGoodsNanifestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TempDangerousGoodsNanifestModelImpl.ENTITY_CACHE_ENABLED,
			TempDangerousGoodsNanifestModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempDangerousGoodsNanifestModelImpl.ENTITY_CACHE_ENABLED,
			TempDangerousGoodsNanifestModelImpl.FINDER_CACHE_ENABLED,
			TempDangerousGoodsNanifestImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBydocumentNameAnddocumentYear",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempDangerousGoodsNanifestModelImpl.ENTITY_CACHE_ENABLED,
			TempDangerousGoodsNanifestModelImpl.FINDER_CACHE_ENABLED,
			TempDangerousGoodsNanifestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBydocumentNameAnddocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() },
			TempDangerousGoodsNanifestModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			TempDangerousGoodsNanifestModelImpl.DOCUMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempDangerousGoodsNanifestModelImpl.ENTITY_CACHE_ENABLED,
			TempDangerousGoodsNanifestModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBydocumentNameAnddocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the temp dangerous goods nanifests where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the matching temp dangerous goods nanifests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDangerousGoodsNanifest> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear) throws SystemException {
		return findBydocumentNameAnddocumentYear(documentName, documentYear,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp dangerous goods nanifests where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDangerousGoodsNanifestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of temp dangerous goods nanifests
	 * @param end the upper bound of the range of temp dangerous goods nanifests (not inclusive)
	 * @return the range of matching temp dangerous goods nanifests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDangerousGoodsNanifest> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear, int start, int end)
		throws SystemException {
		return findBydocumentNameAnddocumentYear(documentName, documentYear,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp dangerous goods nanifests where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDangerousGoodsNanifestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of temp dangerous goods nanifests
	 * @param end the upper bound of the range of temp dangerous goods nanifests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp dangerous goods nanifests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDangerousGoodsNanifest> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR;
			finderArgs = new Object[] { documentName, documentYear };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR;
			finderArgs = new Object[] {
					documentName, documentYear,
					
					start, end, orderByComparator
				};
		}

		List<TempDangerousGoodsNanifest> list = (List<TempDangerousGoodsNanifest>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempDangerousGoodsNanifest tempDangerousGoodsNanifest : list) {
				if ((documentName != tempDangerousGoodsNanifest.getDocumentName()) ||
						(documentYear != tempDangerousGoodsNanifest.getDocumentYear())) {
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

			query.append(_SQL_SELECT_TEMPDANGEROUSGOODSNANIFEST_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TempDangerousGoodsNanifestModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				if (!pagination) {
					list = (List<TempDangerousGoodsNanifest>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempDangerousGoodsNanifest>(list);
				}
				else {
					list = (List<TempDangerousGoodsNanifest>)QueryUtil.list(q,
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
	 * Returns the first temp dangerous goods nanifest in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp dangerous goods nanifest
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDangerousGoodsNanifestException if a matching temp dangerous goods nanifest could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDangerousGoodsNanifest findBydocumentNameAnddocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchTempDangerousGoodsNanifestException, SystemException {
		TempDangerousGoodsNanifest tempDangerousGoodsNanifest = fetchBydocumentNameAnddocumentYear_First(documentName,
				documentYear, orderByComparator);

		if (tempDangerousGoodsNanifest != null) {
			return tempDangerousGoodsNanifest;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempDangerousGoodsNanifestException(msg.toString());
	}

	/**
	 * Returns the first temp dangerous goods nanifest in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp dangerous goods nanifest, or <code>null</code> if a matching temp dangerous goods nanifest could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDangerousGoodsNanifest fetchBydocumentNameAnddocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws SystemException {
		List<TempDangerousGoodsNanifest> list = findBydocumentNameAnddocumentYear(documentName,
				documentYear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp dangerous goods nanifest in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp dangerous goods nanifest
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDangerousGoodsNanifestException if a matching temp dangerous goods nanifest could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDangerousGoodsNanifest findBydocumentNameAnddocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchTempDangerousGoodsNanifestException, SystemException {
		TempDangerousGoodsNanifest tempDangerousGoodsNanifest = fetchBydocumentNameAnddocumentYear_Last(documentName,
				documentYear, orderByComparator);

		if (tempDangerousGoodsNanifest != null) {
			return tempDangerousGoodsNanifest;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempDangerousGoodsNanifestException(msg.toString());
	}

	/**
	 * Returns the last temp dangerous goods nanifest in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp dangerous goods nanifest, or <code>null</code> if a matching temp dangerous goods nanifest could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDangerousGoodsNanifest fetchBydocumentNameAnddocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBydocumentNameAnddocumentYear(documentName,
				documentYear);

		if (count == 0) {
			return null;
		}

		List<TempDangerousGoodsNanifest> list = findBydocumentNameAnddocumentYear(documentName,
				documentYear, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp dangerous goods nanifests before and after the current temp dangerous goods nanifest in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param id the primary key of the current temp dangerous goods nanifest
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp dangerous goods nanifest
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDangerousGoodsNanifestException if a temp dangerous goods nanifest with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDangerousGoodsNanifest[] findBydocumentNameAnddocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		OrderByComparator orderByComparator)
		throws NoSuchTempDangerousGoodsNanifestException, SystemException {
		TempDangerousGoodsNanifest tempDangerousGoodsNanifest = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempDangerousGoodsNanifest[] array = new TempDangerousGoodsNanifestImpl[3];

			array[0] = getBydocumentNameAnddocumentYear_PrevAndNext(session,
					tempDangerousGoodsNanifest, documentName, documentYear,
					orderByComparator, true);

			array[1] = tempDangerousGoodsNanifest;

			array[2] = getBydocumentNameAnddocumentYear_PrevAndNext(session,
					tempDangerousGoodsNanifest, documentName, documentYear,
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

	protected TempDangerousGoodsNanifest getBydocumentNameAnddocumentYear_PrevAndNext(
		Session session, TempDangerousGoodsNanifest tempDangerousGoodsNanifest,
		long documentName, int documentYear,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TEMPDANGEROUSGOODSNANIFEST_WHERE);

		query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2);

		query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2);

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
			query.append(TempDangerousGoodsNanifestModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(documentName);

		qPos.add(documentYear);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tempDangerousGoodsNanifest);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempDangerousGoodsNanifest> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp dangerous goods nanifests where documentName = &#63; and documentYear = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBydocumentNameAnddocumentYear(long documentName,
		int documentYear) throws SystemException {
		for (TempDangerousGoodsNanifest tempDangerousGoodsNanifest : findBydocumentNameAnddocumentYear(
				documentName, documentYear, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tempDangerousGoodsNanifest);
		}
	}

	/**
	 * Returns the number of temp dangerous goods nanifests where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the number of matching temp dangerous goods nanifests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBydocumentNameAnddocumentYear(long documentName,
		int documentYear) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR;

		Object[] finderArgs = new Object[] { documentName, documentYear };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TEMPDANGEROUSGOODSNANIFEST_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

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

	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2 =
		"tempDangerousGoodsNanifest.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2 =
		"tempDangerousGoodsNanifest.documentYear = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE =
		new FinderPath(TempDangerousGoodsNanifestModelImpl.ENTITY_CACHE_ENABLED,
			TempDangerousGoodsNanifestModelImpl.FINDER_CACHE_ENABLED,
			TempDangerousGoodsNanifestImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBydocumentNameAnddocumentYearRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE =
		new FinderPath(TempDangerousGoodsNanifestModelImpl.ENTITY_CACHE_ENABLED,
			TempDangerousGoodsNanifestModelImpl.FINDER_CACHE_ENABLED,
			TempDangerousGoodsNanifestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBydocumentNameAnddocumentYearRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			},
			TempDangerousGoodsNanifestModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			TempDangerousGoodsNanifestModelImpl.DOCUMENTYEAR_COLUMN_BITMASK |
			TempDangerousGoodsNanifestModelImpl.REQUESTSTATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE =
		new FinderPath(TempDangerousGoodsNanifestModelImpl.ENTITY_CACHE_ENABLED,
			TempDangerousGoodsNanifestModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBydocumentNameAnddocumentYearRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the temp dangerous goods nanifests where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @return the matching temp dangerous goods nanifests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDangerousGoodsNanifest> findBydocumentNameAnddocumentYearRequestState(
		long documentName, int documentYear, int requestState)
		throws SystemException {
		return findBydocumentNameAnddocumentYearRequestState(documentName,
			documentYear, requestState, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the temp dangerous goods nanifests where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDangerousGoodsNanifestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param start the lower bound of the range of temp dangerous goods nanifests
	 * @param end the upper bound of the range of temp dangerous goods nanifests (not inclusive)
	 * @return the range of matching temp dangerous goods nanifests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDangerousGoodsNanifest> findBydocumentNameAnddocumentYearRequestState(
		long documentName, int documentYear, int requestState, int start,
		int end) throws SystemException {
		return findBydocumentNameAnddocumentYearRequestState(documentName,
			documentYear, requestState, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp dangerous goods nanifests where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDangerousGoodsNanifestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param start the lower bound of the range of temp dangerous goods nanifests
	 * @param end the upper bound of the range of temp dangerous goods nanifests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp dangerous goods nanifests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDangerousGoodsNanifest> findBydocumentNameAnddocumentYearRequestState(
		long documentName, int documentYear, int requestState, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE;
			finderArgs = new Object[] { documentName, documentYear, requestState };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE;
			finderArgs = new Object[] {
					documentName, documentYear, requestState,
					
					start, end, orderByComparator
				};
		}

		List<TempDangerousGoodsNanifest> list = (List<TempDangerousGoodsNanifest>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempDangerousGoodsNanifest tempDangerousGoodsNanifest : list) {
				if ((documentName != tempDangerousGoodsNanifest.getDocumentName()) ||
						(documentYear != tempDangerousGoodsNanifest.getDocumentYear()) ||
						(requestState != tempDangerousGoodsNanifest.getRequestState())) {
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

			query.append(_SQL_SELECT_TEMPDANGEROUSGOODSNANIFEST_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTYEAR_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_REQUESTSTATE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TempDangerousGoodsNanifestModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				qPos.add(requestState);

				if (!pagination) {
					list = (List<TempDangerousGoodsNanifest>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempDangerousGoodsNanifest>(list);
				}
				else {
					list = (List<TempDangerousGoodsNanifest>)QueryUtil.list(q,
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
	 * Returns the first temp dangerous goods nanifest in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp dangerous goods nanifest
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDangerousGoodsNanifestException if a matching temp dangerous goods nanifest could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDangerousGoodsNanifest findBydocumentNameAnddocumentYearRequestState_First(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchTempDangerousGoodsNanifestException, SystemException {
		TempDangerousGoodsNanifest tempDangerousGoodsNanifest = fetchBydocumentNameAnddocumentYearRequestState_First(documentName,
				documentYear, requestState, orderByComparator);

		if (tempDangerousGoodsNanifest != null) {
			return tempDangerousGoodsNanifest;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(", requestState=");
		msg.append(requestState);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempDangerousGoodsNanifestException(msg.toString());
	}

	/**
	 * Returns the first temp dangerous goods nanifest in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp dangerous goods nanifest, or <code>null</code> if a matching temp dangerous goods nanifest could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDangerousGoodsNanifest fetchBydocumentNameAnddocumentYearRequestState_First(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator) throws SystemException {
		List<TempDangerousGoodsNanifest> list = findBydocumentNameAnddocumentYearRequestState(documentName,
				documentYear, requestState, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp dangerous goods nanifest in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp dangerous goods nanifest
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDangerousGoodsNanifestException if a matching temp dangerous goods nanifest could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDangerousGoodsNanifest findBydocumentNameAnddocumentYearRequestState_Last(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchTempDangerousGoodsNanifestException, SystemException {
		TempDangerousGoodsNanifest tempDangerousGoodsNanifest = fetchBydocumentNameAnddocumentYearRequestState_Last(documentName,
				documentYear, requestState, orderByComparator);

		if (tempDangerousGoodsNanifest != null) {
			return tempDangerousGoodsNanifest;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(", requestState=");
		msg.append(requestState);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempDangerousGoodsNanifestException(msg.toString());
	}

	/**
	 * Returns the last temp dangerous goods nanifest in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp dangerous goods nanifest, or <code>null</code> if a matching temp dangerous goods nanifest could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDangerousGoodsNanifest fetchBydocumentNameAnddocumentYearRequestState_Last(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBydocumentNameAnddocumentYearRequestState(documentName,
				documentYear, requestState);

		if (count == 0) {
			return null;
		}

		List<TempDangerousGoodsNanifest> list = findBydocumentNameAnddocumentYearRequestState(documentName,
				documentYear, requestState, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp dangerous goods nanifests before and after the current temp dangerous goods nanifest in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param id the primary key of the current temp dangerous goods nanifest
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp dangerous goods nanifest
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDangerousGoodsNanifestException if a temp dangerous goods nanifest with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDangerousGoodsNanifest[] findBydocumentNameAnddocumentYearRequestState_PrevAndNext(
		long id, long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchTempDangerousGoodsNanifestException, SystemException {
		TempDangerousGoodsNanifest tempDangerousGoodsNanifest = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempDangerousGoodsNanifest[] array = new TempDangerousGoodsNanifestImpl[3];

			array[0] = getBydocumentNameAnddocumentYearRequestState_PrevAndNext(session,
					tempDangerousGoodsNanifest, documentName, documentYear,
					requestState, orderByComparator, true);

			array[1] = tempDangerousGoodsNanifest;

			array[2] = getBydocumentNameAnddocumentYearRequestState_PrevAndNext(session,
					tempDangerousGoodsNanifest, documentName, documentYear,
					requestState, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TempDangerousGoodsNanifest getBydocumentNameAnddocumentYearRequestState_PrevAndNext(
		Session session, TempDangerousGoodsNanifest tempDangerousGoodsNanifest,
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TEMPDANGEROUSGOODSNANIFEST_WHERE);

		query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTNAME_2);

		query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTYEAR_2);

		query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_REQUESTSTATE_2);

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
			query.append(TempDangerousGoodsNanifestModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(documentName);

		qPos.add(documentYear);

		qPos.add(requestState);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tempDangerousGoodsNanifest);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempDangerousGoodsNanifest> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp dangerous goods nanifests where documentName = &#63; and documentYear = &#63; and requestState = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBydocumentNameAnddocumentYearRequestState(
		long documentName, int documentYear, int requestState)
		throws SystemException {
		for (TempDangerousGoodsNanifest tempDangerousGoodsNanifest : findBydocumentNameAnddocumentYearRequestState(
				documentName, documentYear, requestState, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tempDangerousGoodsNanifest);
		}
	}

	/**
	 * Returns the number of temp dangerous goods nanifests where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @return the number of matching temp dangerous goods nanifests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBydocumentNameAnddocumentYearRequestState(
		long documentName, int documentYear, int requestState)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE;

		Object[] finderArgs = new Object[] {
				documentName, documentYear, requestState
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_TEMPDANGEROUSGOODSNANIFEST_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTYEAR_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_REQUESTSTATE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				qPos.add(requestState);

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

	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTNAME_2 =
		"tempDangerousGoodsNanifest.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTYEAR_2 =
		"tempDangerousGoodsNanifest.documentYear = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_REQUESTSTATE_2 =
		"tempDangerousGoodsNanifest.requestState = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempDangerousGoodsNanifestModelImpl.ENTITY_CACHE_ENABLED,
			TempDangerousGoodsNanifestModelImpl.FINDER_CACHE_ENABLED,
			TempDangerousGoodsNanifestImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRequestCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempDangerousGoodsNanifestModelImpl.ENTITY_CACHE_ENABLED,
			TempDangerousGoodsNanifestModelImpl.FINDER_CACHE_ENABLED,
			TempDangerousGoodsNanifestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRequestCode",
			new String[] { String.class.getName() },
			TempDangerousGoodsNanifestModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE = new FinderPath(TempDangerousGoodsNanifestModelImpl.ENTITY_CACHE_ENABLED,
			TempDangerousGoodsNanifestModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByRequestCode", new String[] { String.class.getName() });

	/**
	 * Returns all the temp dangerous goods nanifests where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the matching temp dangerous goods nanifests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDangerousGoodsNanifest> findByRequestCode(
		String requestCode) throws SystemException {
		return findByRequestCode(requestCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp dangerous goods nanifests where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDangerousGoodsNanifestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp dangerous goods nanifests
	 * @param end the upper bound of the range of temp dangerous goods nanifests (not inclusive)
	 * @return the range of matching temp dangerous goods nanifests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDangerousGoodsNanifest> findByRequestCode(
		String requestCode, int start, int end) throws SystemException {
		return findByRequestCode(requestCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp dangerous goods nanifests where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDangerousGoodsNanifestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp dangerous goods nanifests
	 * @param end the upper bound of the range of temp dangerous goods nanifests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp dangerous goods nanifests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDangerousGoodsNanifest> findByRequestCode(
		String requestCode, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE;
			finderArgs = new Object[] { requestCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTCODE;
			finderArgs = new Object[] { requestCode, start, end, orderByComparator };
		}

		List<TempDangerousGoodsNanifest> list = (List<TempDangerousGoodsNanifest>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempDangerousGoodsNanifest tempDangerousGoodsNanifest : list) {
				if (!Validator.equals(requestCode,
							tempDangerousGoodsNanifest.getRequestCode())) {
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

			query.append(_SQL_SELECT_TEMPDANGEROUSGOODSNANIFEST_WHERE);

			boolean bindRequestCode = false;

			if (requestCode == null) {
				query.append(_FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1);
			}
			else if (requestCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3);
			}
			else {
				bindRequestCode = true;

				query.append(_FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TempDangerousGoodsNanifestModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRequestCode) {
					qPos.add(requestCode);
				}

				if (!pagination) {
					list = (List<TempDangerousGoodsNanifest>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempDangerousGoodsNanifest>(list);
				}
				else {
					list = (List<TempDangerousGoodsNanifest>)QueryUtil.list(q,
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
	 * Returns the first temp dangerous goods nanifest in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp dangerous goods nanifest
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDangerousGoodsNanifestException if a matching temp dangerous goods nanifest could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDangerousGoodsNanifest findByRequestCode_First(
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempDangerousGoodsNanifestException, SystemException {
		TempDangerousGoodsNanifest tempDangerousGoodsNanifest = fetchByRequestCode_First(requestCode,
				orderByComparator);

		if (tempDangerousGoodsNanifest != null) {
			return tempDangerousGoodsNanifest;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempDangerousGoodsNanifestException(msg.toString());
	}

	/**
	 * Returns the first temp dangerous goods nanifest in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp dangerous goods nanifest, or <code>null</code> if a matching temp dangerous goods nanifest could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDangerousGoodsNanifest fetchByRequestCode_First(
		String requestCode, OrderByComparator orderByComparator)
		throws SystemException {
		List<TempDangerousGoodsNanifest> list = findByRequestCode(requestCode,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp dangerous goods nanifest in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp dangerous goods nanifest
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDangerousGoodsNanifestException if a matching temp dangerous goods nanifest could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDangerousGoodsNanifest findByRequestCode_Last(
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempDangerousGoodsNanifestException, SystemException {
		TempDangerousGoodsNanifest tempDangerousGoodsNanifest = fetchByRequestCode_Last(requestCode,
				orderByComparator);

		if (tempDangerousGoodsNanifest != null) {
			return tempDangerousGoodsNanifest;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempDangerousGoodsNanifestException(msg.toString());
	}

	/**
	 * Returns the last temp dangerous goods nanifest in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp dangerous goods nanifest, or <code>null</code> if a matching temp dangerous goods nanifest could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDangerousGoodsNanifest fetchByRequestCode_Last(
		String requestCode, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByRequestCode(requestCode);

		if (count == 0) {
			return null;
		}

		List<TempDangerousGoodsNanifest> list = findByRequestCode(requestCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp dangerous goods nanifests before and after the current temp dangerous goods nanifest in the ordered set where requestCode = &#63;.
	 *
	 * @param id the primary key of the current temp dangerous goods nanifest
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp dangerous goods nanifest
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDangerousGoodsNanifestException if a temp dangerous goods nanifest with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDangerousGoodsNanifest[] findByRequestCode_PrevAndNext(long id,
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempDangerousGoodsNanifestException, SystemException {
		TempDangerousGoodsNanifest tempDangerousGoodsNanifest = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempDangerousGoodsNanifest[] array = new TempDangerousGoodsNanifestImpl[3];

			array[0] = getByRequestCode_PrevAndNext(session,
					tempDangerousGoodsNanifest, requestCode, orderByComparator,
					true);

			array[1] = tempDangerousGoodsNanifest;

			array[2] = getByRequestCode_PrevAndNext(session,
					tempDangerousGoodsNanifest, requestCode, orderByComparator,
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

	protected TempDangerousGoodsNanifest getByRequestCode_PrevAndNext(
		Session session, TempDangerousGoodsNanifest tempDangerousGoodsNanifest,
		String requestCode, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TEMPDANGEROUSGOODSNANIFEST_WHERE);

		boolean bindRequestCode = false;

		if (requestCode == null) {
			query.append(_FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1);
		}
		else if (requestCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3);
		}
		else {
			bindRequestCode = true;

			query.append(_FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2);
		}

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
			query.append(TempDangerousGoodsNanifestModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindRequestCode) {
			qPos.add(requestCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tempDangerousGoodsNanifest);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempDangerousGoodsNanifest> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp dangerous goods nanifests where requestCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByRequestCode(String requestCode)
		throws SystemException {
		for (TempDangerousGoodsNanifest tempDangerousGoodsNanifest : findByRequestCode(
				requestCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tempDangerousGoodsNanifest);
		}
	}

	/**
	 * Returns the number of temp dangerous goods nanifests where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the number of matching temp dangerous goods nanifests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByRequestCode(String requestCode) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REQUESTCODE;

		Object[] finderArgs = new Object[] { requestCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TEMPDANGEROUSGOODSNANIFEST_WHERE);

			boolean bindRequestCode = false;

			if (requestCode == null) {
				query.append(_FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1);
			}
			else if (requestCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3);
			}
			else {
				bindRequestCode = true;

				query.append(_FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRequestCode) {
					qPos.add(requestCode);
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

	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1 = "tempDangerousGoodsNanifest.requestCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2 = "tempDangerousGoodsNanifest.requestCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3 = "(tempDangerousGoodsNanifest.requestCode IS NULL OR tempDangerousGoodsNanifest.requestCode = '')";

	public TempDangerousGoodsNanifestPersistenceImpl() {
		setModelClass(TempDangerousGoodsNanifest.class);
	}

	/**
	 * Caches the temp dangerous goods nanifest in the entity cache if it is enabled.
	 *
	 * @param tempDangerousGoodsNanifest the temp dangerous goods nanifest
	 */
	@Override
	public void cacheResult(
		TempDangerousGoodsNanifest tempDangerousGoodsNanifest) {
		EntityCacheUtil.putResult(TempDangerousGoodsNanifestModelImpl.ENTITY_CACHE_ENABLED,
			TempDangerousGoodsNanifestImpl.class,
			tempDangerousGoodsNanifest.getPrimaryKey(),
			tempDangerousGoodsNanifest);

		tempDangerousGoodsNanifest.resetOriginalValues();
	}

	/**
	 * Caches the temp dangerous goods nanifests in the entity cache if it is enabled.
	 *
	 * @param tempDangerousGoodsNanifests the temp dangerous goods nanifests
	 */
	@Override
	public void cacheResult(
		List<TempDangerousGoodsNanifest> tempDangerousGoodsNanifests) {
		for (TempDangerousGoodsNanifest tempDangerousGoodsNanifest : tempDangerousGoodsNanifests) {
			if (EntityCacheUtil.getResult(
						TempDangerousGoodsNanifestModelImpl.ENTITY_CACHE_ENABLED,
						TempDangerousGoodsNanifestImpl.class,
						tempDangerousGoodsNanifest.getPrimaryKey()) == null) {
				cacheResult(tempDangerousGoodsNanifest);
			}
			else {
				tempDangerousGoodsNanifest.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all temp dangerous goods nanifests.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TempDangerousGoodsNanifestImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TempDangerousGoodsNanifestImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the temp dangerous goods nanifest.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		TempDangerousGoodsNanifest tempDangerousGoodsNanifest) {
		EntityCacheUtil.removeResult(TempDangerousGoodsNanifestModelImpl.ENTITY_CACHE_ENABLED,
			TempDangerousGoodsNanifestImpl.class,
			tempDangerousGoodsNanifest.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<TempDangerousGoodsNanifest> tempDangerousGoodsNanifests) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TempDangerousGoodsNanifest tempDangerousGoodsNanifest : tempDangerousGoodsNanifests) {
			EntityCacheUtil.removeResult(TempDangerousGoodsNanifestModelImpl.ENTITY_CACHE_ENABLED,
				TempDangerousGoodsNanifestImpl.class,
				tempDangerousGoodsNanifest.getPrimaryKey());
		}
	}

	/**
	 * Creates a new temp dangerous goods nanifest with the primary key. Does not add the temp dangerous goods nanifest to the database.
	 *
	 * @param id the primary key for the new temp dangerous goods nanifest
	 * @return the new temp dangerous goods nanifest
	 */
	@Override
	public TempDangerousGoodsNanifest create(long id) {
		TempDangerousGoodsNanifest tempDangerousGoodsNanifest = new TempDangerousGoodsNanifestImpl();

		tempDangerousGoodsNanifest.setNew(true);
		tempDangerousGoodsNanifest.setPrimaryKey(id);

		return tempDangerousGoodsNanifest;
	}

	/**
	 * Removes the temp dangerous goods nanifest with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the temp dangerous goods nanifest
	 * @return the temp dangerous goods nanifest that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDangerousGoodsNanifestException if a temp dangerous goods nanifest with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDangerousGoodsNanifest remove(long id)
		throws NoSuchTempDangerousGoodsNanifestException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the temp dangerous goods nanifest with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the temp dangerous goods nanifest
	 * @return the temp dangerous goods nanifest that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDangerousGoodsNanifestException if a temp dangerous goods nanifest with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDangerousGoodsNanifest remove(Serializable primaryKey)
		throws NoSuchTempDangerousGoodsNanifestException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TempDangerousGoodsNanifest tempDangerousGoodsNanifest = (TempDangerousGoodsNanifest)session.get(TempDangerousGoodsNanifestImpl.class,
					primaryKey);

			if (tempDangerousGoodsNanifest == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTempDangerousGoodsNanifestException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tempDangerousGoodsNanifest);
		}
		catch (NoSuchTempDangerousGoodsNanifestException nsee) {
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
	protected TempDangerousGoodsNanifest removeImpl(
		TempDangerousGoodsNanifest tempDangerousGoodsNanifest)
		throws SystemException {
		tempDangerousGoodsNanifest = toUnwrappedModel(tempDangerousGoodsNanifest);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tempDangerousGoodsNanifest)) {
				tempDangerousGoodsNanifest = (TempDangerousGoodsNanifest)session.get(TempDangerousGoodsNanifestImpl.class,
						tempDangerousGoodsNanifest.getPrimaryKeyObj());
			}

			if (tempDangerousGoodsNanifest != null) {
				session.delete(tempDangerousGoodsNanifest);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tempDangerousGoodsNanifest != null) {
			clearCache(tempDangerousGoodsNanifest);
		}

		return tempDangerousGoodsNanifest;
	}

	@Override
	public TempDangerousGoodsNanifest updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.TempDangerousGoodsNanifest tempDangerousGoodsNanifest)
		throws SystemException {
		tempDangerousGoodsNanifest = toUnwrappedModel(tempDangerousGoodsNanifest);

		boolean isNew = tempDangerousGoodsNanifest.isNew();

		TempDangerousGoodsNanifestModelImpl tempDangerousGoodsNanifestModelImpl = (TempDangerousGoodsNanifestModelImpl)tempDangerousGoodsNanifest;

		Session session = null;

		try {
			session = openSession();

			if (tempDangerousGoodsNanifest.isNew()) {
				session.save(tempDangerousGoodsNanifest);

				tempDangerousGoodsNanifest.setNew(false);
			}
			else {
				session.merge(tempDangerousGoodsNanifest);
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
				!TempDangerousGoodsNanifestModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tempDangerousGoodsNanifestModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempDangerousGoodsNanifestModelImpl.getOriginalDocumentName(),
						tempDangerousGoodsNanifestModelImpl.getOriginalDocumentYear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);

				args = new Object[] {
						tempDangerousGoodsNanifestModelImpl.getDocumentName(),
						tempDangerousGoodsNanifestModelImpl.getDocumentYear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
			}

			if ((tempDangerousGoodsNanifestModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempDangerousGoodsNanifestModelImpl.getOriginalDocumentName(),
						tempDangerousGoodsNanifestModelImpl.getOriginalDocumentYear(),
						tempDangerousGoodsNanifestModelImpl.getOriginalRequestState()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);

				args = new Object[] {
						tempDangerousGoodsNanifestModelImpl.getDocumentName(),
						tempDangerousGoodsNanifestModelImpl.getDocumentYear(),
						tempDangerousGoodsNanifestModelImpl.getRequestState()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);
			}

			if ((tempDangerousGoodsNanifestModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempDangerousGoodsNanifestModelImpl.getOriginalRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);

				args = new Object[] {
						tempDangerousGoodsNanifestModelImpl.getRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(TempDangerousGoodsNanifestModelImpl.ENTITY_CACHE_ENABLED,
			TempDangerousGoodsNanifestImpl.class,
			tempDangerousGoodsNanifest.getPrimaryKey(),
			tempDangerousGoodsNanifest);

		return tempDangerousGoodsNanifest;
	}

	protected TempDangerousGoodsNanifest toUnwrappedModel(
		TempDangerousGoodsNanifest tempDangerousGoodsNanifest) {
		if (tempDangerousGoodsNanifest instanceof TempDangerousGoodsNanifestImpl) {
			return tempDangerousGoodsNanifest;
		}

		TempDangerousGoodsNanifestImpl tempDangerousGoodsNanifestImpl = new TempDangerousGoodsNanifestImpl();

		tempDangerousGoodsNanifestImpl.setNew(tempDangerousGoodsNanifest.isNew());
		tempDangerousGoodsNanifestImpl.setPrimaryKey(tempDangerousGoodsNanifest.getPrimaryKey());

		tempDangerousGoodsNanifestImpl.setId(tempDangerousGoodsNanifest.getId());
		tempDangerousGoodsNanifestImpl.setRequestCode(tempDangerousGoodsNanifest.getRequestCode());
		tempDangerousGoodsNanifestImpl.setRequestState(tempDangerousGoodsNanifest.getRequestState());
		tempDangerousGoodsNanifestImpl.setDocumentName(tempDangerousGoodsNanifest.getDocumentName());
		tempDangerousGoodsNanifestImpl.setUserCreated(tempDangerousGoodsNanifest.getUserCreated());
		tempDangerousGoodsNanifestImpl.setNameOfShip(tempDangerousGoodsNanifest.getNameOfShip());
		tempDangerousGoodsNanifestImpl.setFlagStateOfShip(tempDangerousGoodsNanifest.getFlagStateOfShip());
		tempDangerousGoodsNanifestImpl.setMasterName(tempDangerousGoodsNanifest.getMasterName());
		tempDangerousGoodsNanifestImpl.setImoNumber(tempDangerousGoodsNanifest.getImoNumber());
		tempDangerousGoodsNanifestImpl.setCallsign(tempDangerousGoodsNanifest.getCallsign());
		tempDangerousGoodsNanifestImpl.setVoyageNumber(tempDangerousGoodsNanifest.getVoyageNumber());
		tempDangerousGoodsNanifestImpl.setPortOfLoadingCode(tempDangerousGoodsNanifest.getPortOfLoadingCode());
		tempDangerousGoodsNanifestImpl.setPortOfDischargeCode(tempDangerousGoodsNanifest.getPortOfDischargeCode());
		tempDangerousGoodsNanifestImpl.setShippingAgent(tempDangerousGoodsNanifest.getShippingAgent());
		tempDangerousGoodsNanifestImpl.setAdditionalRemark(tempDangerousGoodsNanifest.getAdditionalRemark());
		tempDangerousGoodsNanifestImpl.setListDangerousGoods(tempDangerousGoodsNanifest.getListDangerousGoods());
		tempDangerousGoodsNanifestImpl.setSignPlace(tempDangerousGoodsNanifest.getSignPlace());
		tempDangerousGoodsNanifestImpl.setSignDate(tempDangerousGoodsNanifest.getSignDate());
		tempDangerousGoodsNanifestImpl.setMasterSigned(tempDangerousGoodsNanifest.getMasterSigned());
		tempDangerousGoodsNanifestImpl.setMasterSignedImage(tempDangerousGoodsNanifest.getMasterSignedImage());
		tempDangerousGoodsNanifestImpl.setAttachedFile(tempDangerousGoodsNanifest.getAttachedFile());
		tempDangerousGoodsNanifestImpl.setDocumentYear(tempDangerousGoodsNanifest.getDocumentYear());

		return tempDangerousGoodsNanifestImpl;
	}

	/**
	 * Returns the temp dangerous goods nanifest with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp dangerous goods nanifest
	 * @return the temp dangerous goods nanifest
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDangerousGoodsNanifestException if a temp dangerous goods nanifest with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDangerousGoodsNanifest findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTempDangerousGoodsNanifestException, SystemException {
		TempDangerousGoodsNanifest tempDangerousGoodsNanifest = fetchByPrimaryKey(primaryKey);

		if (tempDangerousGoodsNanifest == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTempDangerousGoodsNanifestException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tempDangerousGoodsNanifest;
	}

	/**
	 * Returns the temp dangerous goods nanifest with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchTempDangerousGoodsNanifestException} if it could not be found.
	 *
	 * @param id the primary key of the temp dangerous goods nanifest
	 * @return the temp dangerous goods nanifest
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempDangerousGoodsNanifestException if a temp dangerous goods nanifest with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDangerousGoodsNanifest findByPrimaryKey(long id)
		throws NoSuchTempDangerousGoodsNanifestException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the temp dangerous goods nanifest with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp dangerous goods nanifest
	 * @return the temp dangerous goods nanifest, or <code>null</code> if a temp dangerous goods nanifest with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDangerousGoodsNanifest fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TempDangerousGoodsNanifest tempDangerousGoodsNanifest = (TempDangerousGoodsNanifest)EntityCacheUtil.getResult(TempDangerousGoodsNanifestModelImpl.ENTITY_CACHE_ENABLED,
				TempDangerousGoodsNanifestImpl.class, primaryKey);

		if (tempDangerousGoodsNanifest == _nullTempDangerousGoodsNanifest) {
			return null;
		}

		if (tempDangerousGoodsNanifest == null) {
			Session session = null;

			try {
				session = openSession();

				tempDangerousGoodsNanifest = (TempDangerousGoodsNanifest)session.get(TempDangerousGoodsNanifestImpl.class,
						primaryKey);

				if (tempDangerousGoodsNanifest != null) {
					cacheResult(tempDangerousGoodsNanifest);
				}
				else {
					EntityCacheUtil.putResult(TempDangerousGoodsNanifestModelImpl.ENTITY_CACHE_ENABLED,
						TempDangerousGoodsNanifestImpl.class, primaryKey,
						_nullTempDangerousGoodsNanifest);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TempDangerousGoodsNanifestModelImpl.ENTITY_CACHE_ENABLED,
					TempDangerousGoodsNanifestImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tempDangerousGoodsNanifest;
	}

	/**
	 * Returns the temp dangerous goods nanifest with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the temp dangerous goods nanifest
	 * @return the temp dangerous goods nanifest, or <code>null</code> if a temp dangerous goods nanifest with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDangerousGoodsNanifest fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the temp dangerous goods nanifests.
	 *
	 * @return the temp dangerous goods nanifests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDangerousGoodsNanifest> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp dangerous goods nanifests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDangerousGoodsNanifestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp dangerous goods nanifests
	 * @param end the upper bound of the range of temp dangerous goods nanifests (not inclusive)
	 * @return the range of temp dangerous goods nanifests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDangerousGoodsNanifest> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp dangerous goods nanifests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDangerousGoodsNanifestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp dangerous goods nanifests
	 * @param end the upper bound of the range of temp dangerous goods nanifests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of temp dangerous goods nanifests
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDangerousGoodsNanifest> findAll(int start, int end,
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

		List<TempDangerousGoodsNanifest> list = (List<TempDangerousGoodsNanifest>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TEMPDANGEROUSGOODSNANIFEST);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TEMPDANGEROUSGOODSNANIFEST;

				if (pagination) {
					sql = sql.concat(TempDangerousGoodsNanifestModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TempDangerousGoodsNanifest>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempDangerousGoodsNanifest>(list);
				}
				else {
					list = (List<TempDangerousGoodsNanifest>)QueryUtil.list(q,
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
	 * Removes all the temp dangerous goods nanifests from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TempDangerousGoodsNanifest tempDangerousGoodsNanifest : findAll()) {
			remove(tempDangerousGoodsNanifest);
		}
	}

	/**
	 * Returns the number of temp dangerous goods nanifests.
	 *
	 * @return the number of temp dangerous goods nanifests
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

				Query q = session.createQuery(_SQL_COUNT_TEMPDANGEROUSGOODSNANIFEST);

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
	 * Initializes the temp dangerous goods nanifest persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.TempDangerousGoodsNanifest")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TempDangerousGoodsNanifest>> listenersList = new ArrayList<ModelListener<TempDangerousGoodsNanifest>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TempDangerousGoodsNanifest>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TempDangerousGoodsNanifestImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TEMPDANGEROUSGOODSNANIFEST = "SELECT tempDangerousGoodsNanifest FROM TempDangerousGoodsNanifest tempDangerousGoodsNanifest";
	private static final String _SQL_SELECT_TEMPDANGEROUSGOODSNANIFEST_WHERE = "SELECT tempDangerousGoodsNanifest FROM TempDangerousGoodsNanifest tempDangerousGoodsNanifest WHERE ";
	private static final String _SQL_COUNT_TEMPDANGEROUSGOODSNANIFEST = "SELECT COUNT(tempDangerousGoodsNanifest) FROM TempDangerousGoodsNanifest tempDangerousGoodsNanifest";
	private static final String _SQL_COUNT_TEMPDANGEROUSGOODSNANIFEST_WHERE = "SELECT COUNT(tempDangerousGoodsNanifest) FROM TempDangerousGoodsNanifest tempDangerousGoodsNanifest WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tempDangerousGoodsNanifest.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TempDangerousGoodsNanifest exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TempDangerousGoodsNanifest exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TempDangerousGoodsNanifestPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "requestCode", "requestState", "documentName",
				"userCreated", "nameOfShip", "flagStateOfShip", "masterName",
				"imoNumber", "callsign", "voyageNumber", "portOfLoadingCode",
				"portOfDischargeCode", "shippingAgent", "additionalRemark",
				"listDangerousGoods", "signPlace", "signDate", "masterSigned",
				"masterSignedImage", "attachedFile", "documentYear"
			});
	private static TempDangerousGoodsNanifest _nullTempDangerousGoodsNanifest = new TempDangerousGoodsNanifestImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TempDangerousGoodsNanifest> toCacheModel() {
				return _nullTempDangerousGoodsNanifestCacheModel;
			}
		};

	private static CacheModel<TempDangerousGoodsNanifest> _nullTempDangerousGoodsNanifestCacheModel =
		new CacheModel<TempDangerousGoodsNanifest>() {
			@Override
			public TempDangerousGoodsNanifest toEntityModel() {
				return _nullTempDangerousGoodsNanifest;
			}
		};
}