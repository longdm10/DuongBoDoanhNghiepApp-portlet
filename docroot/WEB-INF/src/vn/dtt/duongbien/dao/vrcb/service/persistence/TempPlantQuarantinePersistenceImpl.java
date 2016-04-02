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

import vn.dtt.duongbien.dao.vrcb.NoSuchTempPlantQuarantineException;
import vn.dtt.duongbien.dao.vrcb.model.TempPlantQuarantine;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempPlantQuarantineImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempPlantQuarantineModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the temp plant quarantine service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see TempPlantQuarantinePersistence
 * @see TempPlantQuarantineUtil
 * @generated
 */
public class TempPlantQuarantinePersistenceImpl extends BasePersistenceImpl<TempPlantQuarantine>
	implements TempPlantQuarantinePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TempPlantQuarantineUtil} to access the temp plant quarantine persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TempPlantQuarantineImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TempPlantQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempPlantQuarantineModelImpl.FINDER_CACHE_ENABLED,
			TempPlantQuarantineImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TempPlantQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempPlantQuarantineModelImpl.FINDER_CACHE_ENABLED,
			TempPlantQuarantineImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TempPlantQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempPlantQuarantineModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempPlantQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempPlantQuarantineModelImpl.FINDER_CACHE_ENABLED,
			TempPlantQuarantineImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBydocumentNameAnddocumentYear",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempPlantQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempPlantQuarantineModelImpl.FINDER_CACHE_ENABLED,
			TempPlantQuarantineImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBydocumentNameAnddocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() },
			TempPlantQuarantineModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			TempPlantQuarantineModelImpl.DOCUMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempPlantQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempPlantQuarantineModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBydocumentNameAnddocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the temp plant quarantines where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the matching temp plant quarantines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempPlantQuarantine> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear) throws SystemException {
		return findBydocumentNameAnddocumentYear(documentName, documentYear,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp plant quarantines where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempPlantQuarantineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of temp plant quarantines
	 * @param end the upper bound of the range of temp plant quarantines (not inclusive)
	 * @return the range of matching temp plant quarantines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempPlantQuarantine> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear, int start, int end)
		throws SystemException {
		return findBydocumentNameAnddocumentYear(documentName, documentYear,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp plant quarantines where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempPlantQuarantineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of temp plant quarantines
	 * @param end the upper bound of the range of temp plant quarantines (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp plant quarantines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempPlantQuarantine> findBydocumentNameAnddocumentYear(
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

		List<TempPlantQuarantine> list = (List<TempPlantQuarantine>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempPlantQuarantine tempPlantQuarantine : list) {
				if ((documentName != tempPlantQuarantine.getDocumentName()) ||
						(documentYear != tempPlantQuarantine.getDocumentYear())) {
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

			query.append(_SQL_SELECT_TEMPPLANTQUARANTINE_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TempPlantQuarantineModelImpl.ORDER_BY_JPQL);
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
					list = (List<TempPlantQuarantine>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempPlantQuarantine>(list);
				}
				else {
					list = (List<TempPlantQuarantine>)QueryUtil.list(q,
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
	 * Returns the first temp plant quarantine in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp plant quarantine
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPlantQuarantineException if a matching temp plant quarantine could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPlantQuarantine findBydocumentNameAnddocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchTempPlantQuarantineException, SystemException {
		TempPlantQuarantine tempPlantQuarantine = fetchBydocumentNameAnddocumentYear_First(documentName,
				documentYear, orderByComparator);

		if (tempPlantQuarantine != null) {
			return tempPlantQuarantine;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempPlantQuarantineException(msg.toString());
	}

	/**
	 * Returns the first temp plant quarantine in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp plant quarantine, or <code>null</code> if a matching temp plant quarantine could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPlantQuarantine fetchBydocumentNameAnddocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws SystemException {
		List<TempPlantQuarantine> list = findBydocumentNameAnddocumentYear(documentName,
				documentYear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp plant quarantine in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp plant quarantine
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPlantQuarantineException if a matching temp plant quarantine could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPlantQuarantine findBydocumentNameAnddocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchTempPlantQuarantineException, SystemException {
		TempPlantQuarantine tempPlantQuarantine = fetchBydocumentNameAnddocumentYear_Last(documentName,
				documentYear, orderByComparator);

		if (tempPlantQuarantine != null) {
			return tempPlantQuarantine;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempPlantQuarantineException(msg.toString());
	}

	/**
	 * Returns the last temp plant quarantine in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp plant quarantine, or <code>null</code> if a matching temp plant quarantine could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPlantQuarantine fetchBydocumentNameAnddocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBydocumentNameAnddocumentYear(documentName,
				documentYear);

		if (count == 0) {
			return null;
		}

		List<TempPlantQuarantine> list = findBydocumentNameAnddocumentYear(documentName,
				documentYear, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp plant quarantines before and after the current temp plant quarantine in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param id the primary key of the current temp plant quarantine
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp plant quarantine
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPlantQuarantineException if a temp plant quarantine with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPlantQuarantine[] findBydocumentNameAnddocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		OrderByComparator orderByComparator)
		throws NoSuchTempPlantQuarantineException, SystemException {
		TempPlantQuarantine tempPlantQuarantine = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempPlantQuarantine[] array = new TempPlantQuarantineImpl[3];

			array[0] = getBydocumentNameAnddocumentYear_PrevAndNext(session,
					tempPlantQuarantine, documentName, documentYear,
					orderByComparator, true);

			array[1] = tempPlantQuarantine;

			array[2] = getBydocumentNameAnddocumentYear_PrevAndNext(session,
					tempPlantQuarantine, documentName, documentYear,
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

	protected TempPlantQuarantine getBydocumentNameAnddocumentYear_PrevAndNext(
		Session session, TempPlantQuarantine tempPlantQuarantine,
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

		query.append(_SQL_SELECT_TEMPPLANTQUARANTINE_WHERE);

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
			query.append(TempPlantQuarantineModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(documentName);

		qPos.add(documentYear);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tempPlantQuarantine);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempPlantQuarantine> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp plant quarantines where documentName = &#63; and documentYear = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBydocumentNameAnddocumentYear(long documentName,
		int documentYear) throws SystemException {
		for (TempPlantQuarantine tempPlantQuarantine : findBydocumentNameAnddocumentYear(
				documentName, documentYear, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tempPlantQuarantine);
		}
	}

	/**
	 * Returns the number of temp plant quarantines where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the number of matching temp plant quarantines
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

			query.append(_SQL_COUNT_TEMPPLANTQUARANTINE_WHERE);

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
		"tempPlantQuarantine.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2 =
		"tempPlantQuarantine.documentYear = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE =
		new FinderPath(TempPlantQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempPlantQuarantineModelImpl.FINDER_CACHE_ENABLED,
			TempPlantQuarantineImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBydocumentNameAnddocumentYearRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE =
		new FinderPath(TempPlantQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempPlantQuarantineModelImpl.FINDER_CACHE_ENABLED,
			TempPlantQuarantineImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBydocumentNameAnddocumentYearRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			},
			TempPlantQuarantineModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			TempPlantQuarantineModelImpl.DOCUMENTYEAR_COLUMN_BITMASK |
			TempPlantQuarantineModelImpl.REQUESTSTATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE =
		new FinderPath(TempPlantQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempPlantQuarantineModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBydocumentNameAnddocumentYearRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the temp plant quarantines where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @return the matching temp plant quarantines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempPlantQuarantine> findBydocumentNameAnddocumentYearRequestState(
		long documentName, int documentYear, int requestState)
		throws SystemException {
		return findBydocumentNameAnddocumentYearRequestState(documentName,
			documentYear, requestState, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the temp plant quarantines where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempPlantQuarantineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param start the lower bound of the range of temp plant quarantines
	 * @param end the upper bound of the range of temp plant quarantines (not inclusive)
	 * @return the range of matching temp plant quarantines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempPlantQuarantine> findBydocumentNameAnddocumentYearRequestState(
		long documentName, int documentYear, int requestState, int start,
		int end) throws SystemException {
		return findBydocumentNameAnddocumentYearRequestState(documentName,
			documentYear, requestState, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp plant quarantines where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempPlantQuarantineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param start the lower bound of the range of temp plant quarantines
	 * @param end the upper bound of the range of temp plant quarantines (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp plant quarantines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempPlantQuarantine> findBydocumentNameAnddocumentYearRequestState(
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

		List<TempPlantQuarantine> list = (List<TempPlantQuarantine>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempPlantQuarantine tempPlantQuarantine : list) {
				if ((documentName != tempPlantQuarantine.getDocumentName()) ||
						(documentYear != tempPlantQuarantine.getDocumentYear()) ||
						(requestState != tempPlantQuarantine.getRequestState())) {
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

			query.append(_SQL_SELECT_TEMPPLANTQUARANTINE_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTYEAR_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_REQUESTSTATE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TempPlantQuarantineModelImpl.ORDER_BY_JPQL);
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
					list = (List<TempPlantQuarantine>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempPlantQuarantine>(list);
				}
				else {
					list = (List<TempPlantQuarantine>)QueryUtil.list(q,
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
	 * Returns the first temp plant quarantine in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp plant quarantine
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPlantQuarantineException if a matching temp plant quarantine could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPlantQuarantine findBydocumentNameAnddocumentYearRequestState_First(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchTempPlantQuarantineException, SystemException {
		TempPlantQuarantine tempPlantQuarantine = fetchBydocumentNameAnddocumentYearRequestState_First(documentName,
				documentYear, requestState, orderByComparator);

		if (tempPlantQuarantine != null) {
			return tempPlantQuarantine;
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

		throw new NoSuchTempPlantQuarantineException(msg.toString());
	}

	/**
	 * Returns the first temp plant quarantine in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp plant quarantine, or <code>null</code> if a matching temp plant quarantine could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPlantQuarantine fetchBydocumentNameAnddocumentYearRequestState_First(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator) throws SystemException {
		List<TempPlantQuarantine> list = findBydocumentNameAnddocumentYearRequestState(documentName,
				documentYear, requestState, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp plant quarantine in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp plant quarantine
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPlantQuarantineException if a matching temp plant quarantine could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPlantQuarantine findBydocumentNameAnddocumentYearRequestState_Last(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchTempPlantQuarantineException, SystemException {
		TempPlantQuarantine tempPlantQuarantine = fetchBydocumentNameAnddocumentYearRequestState_Last(documentName,
				documentYear, requestState, orderByComparator);

		if (tempPlantQuarantine != null) {
			return tempPlantQuarantine;
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

		throw new NoSuchTempPlantQuarantineException(msg.toString());
	}

	/**
	 * Returns the last temp plant quarantine in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp plant quarantine, or <code>null</code> if a matching temp plant quarantine could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPlantQuarantine fetchBydocumentNameAnddocumentYearRequestState_Last(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBydocumentNameAnddocumentYearRequestState(documentName,
				documentYear, requestState);

		if (count == 0) {
			return null;
		}

		List<TempPlantQuarantine> list = findBydocumentNameAnddocumentYearRequestState(documentName,
				documentYear, requestState, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp plant quarantines before and after the current temp plant quarantine in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param id the primary key of the current temp plant quarantine
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp plant quarantine
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPlantQuarantineException if a temp plant quarantine with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPlantQuarantine[] findBydocumentNameAnddocumentYearRequestState_PrevAndNext(
		long id, long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchTempPlantQuarantineException, SystemException {
		TempPlantQuarantine tempPlantQuarantine = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempPlantQuarantine[] array = new TempPlantQuarantineImpl[3];

			array[0] = getBydocumentNameAnddocumentYearRequestState_PrevAndNext(session,
					tempPlantQuarantine, documentName, documentYear,
					requestState, orderByComparator, true);

			array[1] = tempPlantQuarantine;

			array[2] = getBydocumentNameAnddocumentYearRequestState_PrevAndNext(session,
					tempPlantQuarantine, documentName, documentYear,
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

	protected TempPlantQuarantine getBydocumentNameAnddocumentYearRequestState_PrevAndNext(
		Session session, TempPlantQuarantine tempPlantQuarantine,
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

		query.append(_SQL_SELECT_TEMPPLANTQUARANTINE_WHERE);

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
			query.append(TempPlantQuarantineModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(tempPlantQuarantine);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempPlantQuarantine> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp plant quarantines where documentName = &#63; and documentYear = &#63; and requestState = &#63; from the database.
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
		for (TempPlantQuarantine tempPlantQuarantine : findBydocumentNameAnddocumentYearRequestState(
				documentName, documentYear, requestState, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tempPlantQuarantine);
		}
	}

	/**
	 * Returns the number of temp plant quarantines where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @return the number of matching temp plant quarantines
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

			query.append(_SQL_COUNT_TEMPPLANTQUARANTINE_WHERE);

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
		"tempPlantQuarantine.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTYEAR_2 =
		"tempPlantQuarantine.documentYear = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_REQUESTSTATE_2 =
		"tempPlantQuarantine.requestState = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempPlantQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempPlantQuarantineModelImpl.FINDER_CACHE_ENABLED,
			TempPlantQuarantineImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRequestCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempPlantQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempPlantQuarantineModelImpl.FINDER_CACHE_ENABLED,
			TempPlantQuarantineImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRequestCode",
			new String[] { String.class.getName() },
			TempPlantQuarantineModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE = new FinderPath(TempPlantQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempPlantQuarantineModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRequestCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the temp plant quarantines where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the matching temp plant quarantines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempPlantQuarantine> findByRequestCode(String requestCode)
		throws SystemException {
		return findByRequestCode(requestCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp plant quarantines where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempPlantQuarantineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp plant quarantines
	 * @param end the upper bound of the range of temp plant quarantines (not inclusive)
	 * @return the range of matching temp plant quarantines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempPlantQuarantine> findByRequestCode(String requestCode,
		int start, int end) throws SystemException {
		return findByRequestCode(requestCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp plant quarantines where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempPlantQuarantineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp plant quarantines
	 * @param end the upper bound of the range of temp plant quarantines (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp plant quarantines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempPlantQuarantine> findByRequestCode(String requestCode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
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

		List<TempPlantQuarantine> list = (List<TempPlantQuarantine>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempPlantQuarantine tempPlantQuarantine : list) {
				if (!Validator.equals(requestCode,
							tempPlantQuarantine.getRequestCode())) {
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

			query.append(_SQL_SELECT_TEMPPLANTQUARANTINE_WHERE);

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
				query.append(TempPlantQuarantineModelImpl.ORDER_BY_JPQL);
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
					list = (List<TempPlantQuarantine>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempPlantQuarantine>(list);
				}
				else {
					list = (List<TempPlantQuarantine>)QueryUtil.list(q,
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
	 * Returns the first temp plant quarantine in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp plant quarantine
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPlantQuarantineException if a matching temp plant quarantine could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPlantQuarantine findByRequestCode_First(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempPlantQuarantineException, SystemException {
		TempPlantQuarantine tempPlantQuarantine = fetchByRequestCode_First(requestCode,
				orderByComparator);

		if (tempPlantQuarantine != null) {
			return tempPlantQuarantine;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempPlantQuarantineException(msg.toString());
	}

	/**
	 * Returns the first temp plant quarantine in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp plant quarantine, or <code>null</code> if a matching temp plant quarantine could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPlantQuarantine fetchByRequestCode_First(String requestCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<TempPlantQuarantine> list = findByRequestCode(requestCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp plant quarantine in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp plant quarantine
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPlantQuarantineException if a matching temp plant quarantine could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPlantQuarantine findByRequestCode_Last(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempPlantQuarantineException, SystemException {
		TempPlantQuarantine tempPlantQuarantine = fetchByRequestCode_Last(requestCode,
				orderByComparator);

		if (tempPlantQuarantine != null) {
			return tempPlantQuarantine;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempPlantQuarantineException(msg.toString());
	}

	/**
	 * Returns the last temp plant quarantine in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp plant quarantine, or <code>null</code> if a matching temp plant quarantine could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPlantQuarantine fetchByRequestCode_Last(String requestCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByRequestCode(requestCode);

		if (count == 0) {
			return null;
		}

		List<TempPlantQuarantine> list = findByRequestCode(requestCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp plant quarantines before and after the current temp plant quarantine in the ordered set where requestCode = &#63;.
	 *
	 * @param id the primary key of the current temp plant quarantine
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp plant quarantine
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPlantQuarantineException if a temp plant quarantine with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPlantQuarantine[] findByRequestCode_PrevAndNext(long id,
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempPlantQuarantineException, SystemException {
		TempPlantQuarantine tempPlantQuarantine = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempPlantQuarantine[] array = new TempPlantQuarantineImpl[3];

			array[0] = getByRequestCode_PrevAndNext(session,
					tempPlantQuarantine, requestCode, orderByComparator, true);

			array[1] = tempPlantQuarantine;

			array[2] = getByRequestCode_PrevAndNext(session,
					tempPlantQuarantine, requestCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TempPlantQuarantine getByRequestCode_PrevAndNext(
		Session session, TempPlantQuarantine tempPlantQuarantine,
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

		query.append(_SQL_SELECT_TEMPPLANTQUARANTINE_WHERE);

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
			query.append(TempPlantQuarantineModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(tempPlantQuarantine);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempPlantQuarantine> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp plant quarantines where requestCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByRequestCode(String requestCode)
		throws SystemException {
		for (TempPlantQuarantine tempPlantQuarantine : findByRequestCode(
				requestCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tempPlantQuarantine);
		}
	}

	/**
	 * Returns the number of temp plant quarantines where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the number of matching temp plant quarantines
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

			query.append(_SQL_COUNT_TEMPPLANTQUARANTINE_WHERE);

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

	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1 = "tempPlantQuarantine.requestCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2 = "tempPlantQuarantine.requestCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3 = "(tempPlantQuarantine.requestCode IS NULL OR tempPlantQuarantine.requestCode = '')";

	public TempPlantQuarantinePersistenceImpl() {
		setModelClass(TempPlantQuarantine.class);
	}

	/**
	 * Caches the temp plant quarantine in the entity cache if it is enabled.
	 *
	 * @param tempPlantQuarantine the temp plant quarantine
	 */
	@Override
	public void cacheResult(TempPlantQuarantine tempPlantQuarantine) {
		EntityCacheUtil.putResult(TempPlantQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempPlantQuarantineImpl.class, tempPlantQuarantine.getPrimaryKey(),
			tempPlantQuarantine);

		tempPlantQuarantine.resetOriginalValues();
	}

	/**
	 * Caches the temp plant quarantines in the entity cache if it is enabled.
	 *
	 * @param tempPlantQuarantines the temp plant quarantines
	 */
	@Override
	public void cacheResult(List<TempPlantQuarantine> tempPlantQuarantines) {
		for (TempPlantQuarantine tempPlantQuarantine : tempPlantQuarantines) {
			if (EntityCacheUtil.getResult(
						TempPlantQuarantineModelImpl.ENTITY_CACHE_ENABLED,
						TempPlantQuarantineImpl.class,
						tempPlantQuarantine.getPrimaryKey()) == null) {
				cacheResult(tempPlantQuarantine);
			}
			else {
				tempPlantQuarantine.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all temp plant quarantines.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TempPlantQuarantineImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TempPlantQuarantineImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the temp plant quarantine.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TempPlantQuarantine tempPlantQuarantine) {
		EntityCacheUtil.removeResult(TempPlantQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempPlantQuarantineImpl.class, tempPlantQuarantine.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TempPlantQuarantine> tempPlantQuarantines) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TempPlantQuarantine tempPlantQuarantine : tempPlantQuarantines) {
			EntityCacheUtil.removeResult(TempPlantQuarantineModelImpl.ENTITY_CACHE_ENABLED,
				TempPlantQuarantineImpl.class,
				tempPlantQuarantine.getPrimaryKey());
		}
	}

	/**
	 * Creates a new temp plant quarantine with the primary key. Does not add the temp plant quarantine to the database.
	 *
	 * @param id the primary key for the new temp plant quarantine
	 * @return the new temp plant quarantine
	 */
	@Override
	public TempPlantQuarantine create(long id) {
		TempPlantQuarantine tempPlantQuarantine = new TempPlantQuarantineImpl();

		tempPlantQuarantine.setNew(true);
		tempPlantQuarantine.setPrimaryKey(id);

		return tempPlantQuarantine;
	}

	/**
	 * Removes the temp plant quarantine with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the temp plant quarantine
	 * @return the temp plant quarantine that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPlantQuarantineException if a temp plant quarantine with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPlantQuarantine remove(long id)
		throws NoSuchTempPlantQuarantineException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the temp plant quarantine with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the temp plant quarantine
	 * @return the temp plant quarantine that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPlantQuarantineException if a temp plant quarantine with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPlantQuarantine remove(Serializable primaryKey)
		throws NoSuchTempPlantQuarantineException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TempPlantQuarantine tempPlantQuarantine = (TempPlantQuarantine)session.get(TempPlantQuarantineImpl.class,
					primaryKey);

			if (tempPlantQuarantine == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTempPlantQuarantineException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tempPlantQuarantine);
		}
		catch (NoSuchTempPlantQuarantineException nsee) {
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
	protected TempPlantQuarantine removeImpl(
		TempPlantQuarantine tempPlantQuarantine) throws SystemException {
		tempPlantQuarantine = toUnwrappedModel(tempPlantQuarantine);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tempPlantQuarantine)) {
				tempPlantQuarantine = (TempPlantQuarantine)session.get(TempPlantQuarantineImpl.class,
						tempPlantQuarantine.getPrimaryKeyObj());
			}

			if (tempPlantQuarantine != null) {
				session.delete(tempPlantQuarantine);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tempPlantQuarantine != null) {
			clearCache(tempPlantQuarantine);
		}

		return tempPlantQuarantine;
	}

	@Override
	public TempPlantQuarantine updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.TempPlantQuarantine tempPlantQuarantine)
		throws SystemException {
		tempPlantQuarantine = toUnwrappedModel(tempPlantQuarantine);

		boolean isNew = tempPlantQuarantine.isNew();

		TempPlantQuarantineModelImpl tempPlantQuarantineModelImpl = (TempPlantQuarantineModelImpl)tempPlantQuarantine;

		Session session = null;

		try {
			session = openSession();

			if (tempPlantQuarantine.isNew()) {
				session.save(tempPlantQuarantine);

				tempPlantQuarantine.setNew(false);
			}
			else {
				session.merge(tempPlantQuarantine);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TempPlantQuarantineModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tempPlantQuarantineModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempPlantQuarantineModelImpl.getOriginalDocumentName(),
						tempPlantQuarantineModelImpl.getOriginalDocumentYear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);

				args = new Object[] {
						tempPlantQuarantineModelImpl.getDocumentName(),
						tempPlantQuarantineModelImpl.getDocumentYear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
			}

			if ((tempPlantQuarantineModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempPlantQuarantineModelImpl.getOriginalDocumentName(),
						tempPlantQuarantineModelImpl.getOriginalDocumentYear(),
						tempPlantQuarantineModelImpl.getOriginalRequestState()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);

				args = new Object[] {
						tempPlantQuarantineModelImpl.getDocumentName(),
						tempPlantQuarantineModelImpl.getDocumentYear(),
						tempPlantQuarantineModelImpl.getRequestState()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);
			}

			if ((tempPlantQuarantineModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempPlantQuarantineModelImpl.getOriginalRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);

				args = new Object[] {
						tempPlantQuarantineModelImpl.getRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(TempPlantQuarantineModelImpl.ENTITY_CACHE_ENABLED,
			TempPlantQuarantineImpl.class, tempPlantQuarantine.getPrimaryKey(),
			tempPlantQuarantine);

		return tempPlantQuarantine;
	}

	protected TempPlantQuarantine toUnwrappedModel(
		TempPlantQuarantine tempPlantQuarantine) {
		if (tempPlantQuarantine instanceof TempPlantQuarantineImpl) {
			return tempPlantQuarantine;
		}

		TempPlantQuarantineImpl tempPlantQuarantineImpl = new TempPlantQuarantineImpl();

		tempPlantQuarantineImpl.setNew(tempPlantQuarantine.isNew());
		tempPlantQuarantineImpl.setPrimaryKey(tempPlantQuarantine.getPrimaryKey());

		tempPlantQuarantineImpl.setId(tempPlantQuarantine.getId());
		tempPlantQuarantineImpl.setRequestCode(tempPlantQuarantine.getRequestCode());
		tempPlantQuarantineImpl.setRequestState(tempPlantQuarantine.getRequestState());
		tempPlantQuarantineImpl.setDocumentName(tempPlantQuarantine.getDocumentName());
		tempPlantQuarantineImpl.setUserCreated(tempPlantQuarantine.getUserCreated());
		tempPlantQuarantineImpl.setDocumentYear(tempPlantQuarantine.getDocumentYear());
		tempPlantQuarantineImpl.setNameOfShip(tempPlantQuarantine.getNameOfShip());
		tempPlantQuarantineImpl.setFlagStateOfShip(tempPlantQuarantine.getFlagStateOfShip());
		tempPlantQuarantineImpl.setNameOfMaster(tempPlantQuarantine.getNameOfMaster());
		tempPlantQuarantineImpl.setDoctorName(tempPlantQuarantine.getDoctorName());
		tempPlantQuarantineImpl.setNumberOfCrew(tempPlantQuarantine.getNumberOfCrew());
		tempPlantQuarantineImpl.setNumberOfPassengers(tempPlantQuarantine.getNumberOfPassengers());
		tempPlantQuarantineImpl.setLastPortOfCallCode(tempPlantQuarantine.getLastPortOfCallCode());
		tempPlantQuarantineImpl.setNextPortOfCallCode(tempPlantQuarantine.getNextPortOfCallCode());
		tempPlantQuarantineImpl.setFirstPortOfLoadingCode(tempPlantQuarantine.getFirstPortOfLoadingCode());
		tempPlantQuarantineImpl.setDateOfdeparture(tempPlantQuarantine.getDateOfdeparture());
		tempPlantQuarantineImpl.setPlantNameFirst(tempPlantQuarantine.getPlantNameFirst());
		tempPlantQuarantineImpl.setPlantNameBetween(tempPlantQuarantine.getPlantNameBetween());
		tempPlantQuarantineImpl.setPlantNameThis(tempPlantQuarantine.getPlantNameThis());
		tempPlantQuarantineImpl.setSignPlace(tempPlantQuarantine.getSignPlace());
		tempPlantQuarantineImpl.setSignDate(tempPlantQuarantine.getSignDate());
		tempPlantQuarantineImpl.setMasterSigned(tempPlantQuarantine.getMasterSigned());
		tempPlantQuarantineImpl.setMasterSignedImage(tempPlantQuarantine.getMasterSignedImage());
		tempPlantQuarantineImpl.setAttachedFile(tempPlantQuarantine.getAttachedFile());

		return tempPlantQuarantineImpl;
	}

	/**
	 * Returns the temp plant quarantine with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp plant quarantine
	 * @return the temp plant quarantine
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPlantQuarantineException if a temp plant quarantine with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPlantQuarantine findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTempPlantQuarantineException, SystemException {
		TempPlantQuarantine tempPlantQuarantine = fetchByPrimaryKey(primaryKey);

		if (tempPlantQuarantine == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTempPlantQuarantineException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tempPlantQuarantine;
	}

	/**
	 * Returns the temp plant quarantine with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchTempPlantQuarantineException} if it could not be found.
	 *
	 * @param id the primary key of the temp plant quarantine
	 * @return the temp plant quarantine
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPlantQuarantineException if a temp plant quarantine with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPlantQuarantine findByPrimaryKey(long id)
		throws NoSuchTempPlantQuarantineException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the temp plant quarantine with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp plant quarantine
	 * @return the temp plant quarantine, or <code>null</code> if a temp plant quarantine with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPlantQuarantine fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TempPlantQuarantine tempPlantQuarantine = (TempPlantQuarantine)EntityCacheUtil.getResult(TempPlantQuarantineModelImpl.ENTITY_CACHE_ENABLED,
				TempPlantQuarantineImpl.class, primaryKey);

		if (tempPlantQuarantine == _nullTempPlantQuarantine) {
			return null;
		}

		if (tempPlantQuarantine == null) {
			Session session = null;

			try {
				session = openSession();

				tempPlantQuarantine = (TempPlantQuarantine)session.get(TempPlantQuarantineImpl.class,
						primaryKey);

				if (tempPlantQuarantine != null) {
					cacheResult(tempPlantQuarantine);
				}
				else {
					EntityCacheUtil.putResult(TempPlantQuarantineModelImpl.ENTITY_CACHE_ENABLED,
						TempPlantQuarantineImpl.class, primaryKey,
						_nullTempPlantQuarantine);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TempPlantQuarantineModelImpl.ENTITY_CACHE_ENABLED,
					TempPlantQuarantineImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tempPlantQuarantine;
	}

	/**
	 * Returns the temp plant quarantine with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the temp plant quarantine
	 * @return the temp plant quarantine, or <code>null</code> if a temp plant quarantine with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempPlantQuarantine fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the temp plant quarantines.
	 *
	 * @return the temp plant quarantines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempPlantQuarantine> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp plant quarantines.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempPlantQuarantineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp plant quarantines
	 * @param end the upper bound of the range of temp plant quarantines (not inclusive)
	 * @return the range of temp plant quarantines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempPlantQuarantine> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp plant quarantines.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempPlantQuarantineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp plant quarantines
	 * @param end the upper bound of the range of temp plant quarantines (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of temp plant quarantines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempPlantQuarantine> findAll(int start, int end,
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

		List<TempPlantQuarantine> list = (List<TempPlantQuarantine>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TEMPPLANTQUARANTINE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TEMPPLANTQUARANTINE;

				if (pagination) {
					sql = sql.concat(TempPlantQuarantineModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TempPlantQuarantine>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempPlantQuarantine>(list);
				}
				else {
					list = (List<TempPlantQuarantine>)QueryUtil.list(q,
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
	 * Removes all the temp plant quarantines from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TempPlantQuarantine tempPlantQuarantine : findAll()) {
			remove(tempPlantQuarantine);
		}
	}

	/**
	 * Returns the number of temp plant quarantines.
	 *
	 * @return the number of temp plant quarantines
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

				Query q = session.createQuery(_SQL_COUNT_TEMPPLANTQUARANTINE);

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
	 * Initializes the temp plant quarantine persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.TempPlantQuarantine")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TempPlantQuarantine>> listenersList = new ArrayList<ModelListener<TempPlantQuarantine>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TempPlantQuarantine>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TempPlantQuarantineImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TEMPPLANTQUARANTINE = "SELECT tempPlantQuarantine FROM TempPlantQuarantine tempPlantQuarantine";
	private static final String _SQL_SELECT_TEMPPLANTQUARANTINE_WHERE = "SELECT tempPlantQuarantine FROM TempPlantQuarantine tempPlantQuarantine WHERE ";
	private static final String _SQL_COUNT_TEMPPLANTQUARANTINE = "SELECT COUNT(tempPlantQuarantine) FROM TempPlantQuarantine tempPlantQuarantine";
	private static final String _SQL_COUNT_TEMPPLANTQUARANTINE_WHERE = "SELECT COUNT(tempPlantQuarantine) FROM TempPlantQuarantine tempPlantQuarantine WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tempPlantQuarantine.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TempPlantQuarantine exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TempPlantQuarantine exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TempPlantQuarantinePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "requestCode", "requestState", "documentName",
				"userCreated", "documentYear", "nameOfShip", "flagStateOfShip",
				"nameOfMaster", "doctorName", "numberOfCrew",
				"numberOfPassengers", "lastPortOfCallCode", "nextPortOfCallCode",
				"firstPortOfLoadingCode", "dateOfdeparture", "plantNameFirst",
				"plantNameBetween", "plantNameThis", "signPlace", "signDate",
				"masterSigned", "masterSignedImage", "attachedFile"
			});
	private static TempPlantQuarantine _nullTempPlantQuarantine = new TempPlantQuarantineImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TempPlantQuarantine> toCacheModel() {
				return _nullTempPlantQuarantineCacheModel;
			}
		};

	private static CacheModel<TempPlantQuarantine> _nullTempPlantQuarantineCacheModel =
		new CacheModel<TempPlantQuarantine>() {
			@Override
			public TempPlantQuarantine toEntityModel() {
				return _nullTempPlantQuarantine;
			}
		};
}