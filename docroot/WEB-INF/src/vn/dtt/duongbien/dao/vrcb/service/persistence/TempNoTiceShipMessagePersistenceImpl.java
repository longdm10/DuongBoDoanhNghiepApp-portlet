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

import vn.dtt.duongbien.dao.vrcb.NoSuchTempNoTiceShipMessageException;
import vn.dtt.duongbien.dao.vrcb.model.TempNoTiceShipMessage;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempNoTiceShipMessageImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempNoTiceShipMessageModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the temp no tice ship message service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see TempNoTiceShipMessagePersistence
 * @see TempNoTiceShipMessageUtil
 * @generated
 */
public class TempNoTiceShipMessagePersistenceImpl extends BasePersistenceImpl<TempNoTiceShipMessage>
	implements TempNoTiceShipMessagePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TempNoTiceShipMessageUtil} to access the temp no tice ship message persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TempNoTiceShipMessageImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TempNoTiceShipMessageModelImpl.ENTITY_CACHE_ENABLED,
			TempNoTiceShipMessageModelImpl.FINDER_CACHE_ENABLED,
			TempNoTiceShipMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TempNoTiceShipMessageModelImpl.ENTITY_CACHE_ENABLED,
			TempNoTiceShipMessageModelImpl.FINDER_CACHE_ENABLED,
			TempNoTiceShipMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TempNoTiceShipMessageModelImpl.ENTITY_CACHE_ENABLED,
			TempNoTiceShipMessageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempNoTiceShipMessageModelImpl.ENTITY_CACHE_ENABLED,
			TempNoTiceShipMessageModelImpl.FINDER_CACHE_ENABLED,
			TempNoTiceShipMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBydocumentNameAnddocumentYear",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempNoTiceShipMessageModelImpl.ENTITY_CACHE_ENABLED,
			TempNoTiceShipMessageModelImpl.FINDER_CACHE_ENABLED,
			TempNoTiceShipMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBydocumentNameAnddocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() },
			TempNoTiceShipMessageModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			TempNoTiceShipMessageModelImpl.DOCUMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempNoTiceShipMessageModelImpl.ENTITY_CACHE_ENABLED,
			TempNoTiceShipMessageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBydocumentNameAnddocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the temp no tice ship messages where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the matching temp no tice ship messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempNoTiceShipMessage> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear) throws SystemException {
		return findBydocumentNameAnddocumentYear(documentName, documentYear,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp no tice ship messages where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempNoTiceShipMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of temp no tice ship messages
	 * @param end the upper bound of the range of temp no tice ship messages (not inclusive)
	 * @return the range of matching temp no tice ship messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempNoTiceShipMessage> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear, int start, int end)
		throws SystemException {
		return findBydocumentNameAnddocumentYear(documentName, documentYear,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp no tice ship messages where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempNoTiceShipMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of temp no tice ship messages
	 * @param end the upper bound of the range of temp no tice ship messages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp no tice ship messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempNoTiceShipMessage> findBydocumentNameAnddocumentYear(
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

		List<TempNoTiceShipMessage> list = (List<TempNoTiceShipMessage>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempNoTiceShipMessage tempNoTiceShipMessage : list) {
				if ((documentName != tempNoTiceShipMessage.getDocumentName()) ||
						(documentYear != tempNoTiceShipMessage.getDocumentYear())) {
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

			query.append(_SQL_SELECT_TEMPNOTICESHIPMESSAGE_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TempNoTiceShipMessageModelImpl.ORDER_BY_JPQL);
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
					list = (List<TempNoTiceShipMessage>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempNoTiceShipMessage>(list);
				}
				else {
					list = (List<TempNoTiceShipMessage>)QueryUtil.list(q,
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
	 * Returns the first temp no tice ship message in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp no tice ship message
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempNoTiceShipMessageException if a matching temp no tice ship message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempNoTiceShipMessage findBydocumentNameAnddocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchTempNoTiceShipMessageException, SystemException {
		TempNoTiceShipMessage tempNoTiceShipMessage = fetchBydocumentNameAnddocumentYear_First(documentName,
				documentYear, orderByComparator);

		if (tempNoTiceShipMessage != null) {
			return tempNoTiceShipMessage;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempNoTiceShipMessageException(msg.toString());
	}

	/**
	 * Returns the first temp no tice ship message in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp no tice ship message, or <code>null</code> if a matching temp no tice ship message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempNoTiceShipMessage fetchBydocumentNameAnddocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws SystemException {
		List<TempNoTiceShipMessage> list = findBydocumentNameAnddocumentYear(documentName,
				documentYear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp no tice ship message in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp no tice ship message
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempNoTiceShipMessageException if a matching temp no tice ship message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempNoTiceShipMessage findBydocumentNameAnddocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchTempNoTiceShipMessageException, SystemException {
		TempNoTiceShipMessage tempNoTiceShipMessage = fetchBydocumentNameAnddocumentYear_Last(documentName,
				documentYear, orderByComparator);

		if (tempNoTiceShipMessage != null) {
			return tempNoTiceShipMessage;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempNoTiceShipMessageException(msg.toString());
	}

	/**
	 * Returns the last temp no tice ship message in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp no tice ship message, or <code>null</code> if a matching temp no tice ship message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempNoTiceShipMessage fetchBydocumentNameAnddocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBydocumentNameAnddocumentYear(documentName,
				documentYear);

		if (count == 0) {
			return null;
		}

		List<TempNoTiceShipMessage> list = findBydocumentNameAnddocumentYear(documentName,
				documentYear, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp no tice ship messages before and after the current temp no tice ship message in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param id the primary key of the current temp no tice ship message
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp no tice ship message
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempNoTiceShipMessageException if a temp no tice ship message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempNoTiceShipMessage[] findBydocumentNameAnddocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		OrderByComparator orderByComparator)
		throws NoSuchTempNoTiceShipMessageException, SystemException {
		TempNoTiceShipMessage tempNoTiceShipMessage = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempNoTiceShipMessage[] array = new TempNoTiceShipMessageImpl[3];

			array[0] = getBydocumentNameAnddocumentYear_PrevAndNext(session,
					tempNoTiceShipMessage, documentName, documentYear,
					orderByComparator, true);

			array[1] = tempNoTiceShipMessage;

			array[2] = getBydocumentNameAnddocumentYear_PrevAndNext(session,
					tempNoTiceShipMessage, documentName, documentYear,
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

	protected TempNoTiceShipMessage getBydocumentNameAnddocumentYear_PrevAndNext(
		Session session, TempNoTiceShipMessage tempNoTiceShipMessage,
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

		query.append(_SQL_SELECT_TEMPNOTICESHIPMESSAGE_WHERE);

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
			query.append(TempNoTiceShipMessageModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(documentName);

		qPos.add(documentYear);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tempNoTiceShipMessage);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempNoTiceShipMessage> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp no tice ship messages where documentName = &#63; and documentYear = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBydocumentNameAnddocumentYear(long documentName,
		int documentYear) throws SystemException {
		for (TempNoTiceShipMessage tempNoTiceShipMessage : findBydocumentNameAnddocumentYear(
				documentName, documentYear, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tempNoTiceShipMessage);
		}
	}

	/**
	 * Returns the number of temp no tice ship messages where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the number of matching temp no tice ship messages
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

			query.append(_SQL_COUNT_TEMPNOTICESHIPMESSAGE_WHERE);

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
		"tempNoTiceShipMessage.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2 =
		"tempNoTiceShipMessage.documentYear = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARANDNOTICESHIPTYPE =
		new FinderPath(TempNoTiceShipMessageModelImpl.ENTITY_CACHE_ENABLED,
			TempNoTiceShipMessageModelImpl.FINDER_CACHE_ENABLED,
			TempNoTiceShipMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBydocumentNameAndDocumentYearAndNoticeShipType",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARANDNOTICESHIPTYPE =
		new FinderPath(TempNoTiceShipMessageModelImpl.ENTITY_CACHE_ENABLED,
			TempNoTiceShipMessageModelImpl.FINDER_CACHE_ENABLED,
			TempNoTiceShipMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBydocumentNameAndDocumentYearAndNoticeShipType",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName()
			},
			TempNoTiceShipMessageModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			TempNoTiceShipMessageModelImpl.DOCUMENTYEAR_COLUMN_BITMASK |
			TempNoTiceShipMessageModelImpl.NOTICESHIPTYPE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARANDNOTICESHIPTYPE =
		new FinderPath(TempNoTiceShipMessageModelImpl.ENTITY_CACHE_ENABLED,
			TempNoTiceShipMessageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBydocumentNameAndDocumentYearAndNoticeShipType",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the temp no tice ship messages where documentName = &#63; and documentYear = &#63; and noticeShipType = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param noticeShipType the notice ship type
	 * @return the matching temp no tice ship messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempNoTiceShipMessage> findBydocumentNameAndDocumentYearAndNoticeShipType(
		long documentName, int documentYear, String noticeShipType)
		throws SystemException {
		return findBydocumentNameAndDocumentYearAndNoticeShipType(documentName,
			documentYear, noticeShipType, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the temp no tice ship messages where documentName = &#63; and documentYear = &#63; and noticeShipType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempNoTiceShipMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param noticeShipType the notice ship type
	 * @param start the lower bound of the range of temp no tice ship messages
	 * @param end the upper bound of the range of temp no tice ship messages (not inclusive)
	 * @return the range of matching temp no tice ship messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempNoTiceShipMessage> findBydocumentNameAndDocumentYearAndNoticeShipType(
		long documentName, int documentYear, String noticeShipType, int start,
		int end) throws SystemException {
		return findBydocumentNameAndDocumentYearAndNoticeShipType(documentName,
			documentYear, noticeShipType, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp no tice ship messages where documentName = &#63; and documentYear = &#63; and noticeShipType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempNoTiceShipMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param noticeShipType the notice ship type
	 * @param start the lower bound of the range of temp no tice ship messages
	 * @param end the upper bound of the range of temp no tice ship messages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp no tice ship messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempNoTiceShipMessage> findBydocumentNameAndDocumentYearAndNoticeShipType(
		long documentName, int documentYear, String noticeShipType, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARANDNOTICESHIPTYPE;
			finderArgs = new Object[] { documentName, documentYear, noticeShipType };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARANDNOTICESHIPTYPE;
			finderArgs = new Object[] {
					documentName, documentYear, noticeShipType,
					
					start, end, orderByComparator
				};
		}

		List<TempNoTiceShipMessage> list = (List<TempNoTiceShipMessage>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempNoTiceShipMessage tempNoTiceShipMessage : list) {
				if ((documentName != tempNoTiceShipMessage.getDocumentName()) ||
						(documentYear != tempNoTiceShipMessage.getDocumentYear()) ||
						!Validator.equals(noticeShipType,
							tempNoTiceShipMessage.getNoticeShipType())) {
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

			query.append(_SQL_SELECT_TEMPNOTICESHIPMESSAGE_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDNOTICESHIPTYPE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDNOTICESHIPTYPE_DOCUMENTYEAR_2);

			boolean bindNoticeShipType = false;

			if (noticeShipType == null) {
				query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDNOTICESHIPTYPE_NOTICESHIPTYPE_1);
			}
			else if (noticeShipType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDNOTICESHIPTYPE_NOTICESHIPTYPE_3);
			}
			else {
				bindNoticeShipType = true;

				query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDNOTICESHIPTYPE_NOTICESHIPTYPE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TempNoTiceShipMessageModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				if (bindNoticeShipType) {
					qPos.add(noticeShipType);
				}

				if (!pagination) {
					list = (List<TempNoTiceShipMessage>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempNoTiceShipMessage>(list);
				}
				else {
					list = (List<TempNoTiceShipMessage>)QueryUtil.list(q,
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
	 * Returns the first temp no tice ship message in the ordered set where documentName = &#63; and documentYear = &#63; and noticeShipType = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param noticeShipType the notice ship type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp no tice ship message
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempNoTiceShipMessageException if a matching temp no tice ship message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempNoTiceShipMessage findBydocumentNameAndDocumentYearAndNoticeShipType_First(
		long documentName, int documentYear, String noticeShipType,
		OrderByComparator orderByComparator)
		throws NoSuchTempNoTiceShipMessageException, SystemException {
		TempNoTiceShipMessage tempNoTiceShipMessage = fetchBydocumentNameAndDocumentYearAndNoticeShipType_First(documentName,
				documentYear, noticeShipType, orderByComparator);

		if (tempNoTiceShipMessage != null) {
			return tempNoTiceShipMessage;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(", noticeShipType=");
		msg.append(noticeShipType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempNoTiceShipMessageException(msg.toString());
	}

	/**
	 * Returns the first temp no tice ship message in the ordered set where documentName = &#63; and documentYear = &#63; and noticeShipType = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param noticeShipType the notice ship type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp no tice ship message, or <code>null</code> if a matching temp no tice ship message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempNoTiceShipMessage fetchBydocumentNameAndDocumentYearAndNoticeShipType_First(
		long documentName, int documentYear, String noticeShipType,
		OrderByComparator orderByComparator) throws SystemException {
		List<TempNoTiceShipMessage> list = findBydocumentNameAndDocumentYearAndNoticeShipType(documentName,
				documentYear, noticeShipType, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp no tice ship message in the ordered set where documentName = &#63; and documentYear = &#63; and noticeShipType = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param noticeShipType the notice ship type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp no tice ship message
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempNoTiceShipMessageException if a matching temp no tice ship message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempNoTiceShipMessage findBydocumentNameAndDocumentYearAndNoticeShipType_Last(
		long documentName, int documentYear, String noticeShipType,
		OrderByComparator orderByComparator)
		throws NoSuchTempNoTiceShipMessageException, SystemException {
		TempNoTiceShipMessage tempNoTiceShipMessage = fetchBydocumentNameAndDocumentYearAndNoticeShipType_Last(documentName,
				documentYear, noticeShipType, orderByComparator);

		if (tempNoTiceShipMessage != null) {
			return tempNoTiceShipMessage;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(", noticeShipType=");
		msg.append(noticeShipType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempNoTiceShipMessageException(msg.toString());
	}

	/**
	 * Returns the last temp no tice ship message in the ordered set where documentName = &#63; and documentYear = &#63; and noticeShipType = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param noticeShipType the notice ship type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp no tice ship message, or <code>null</code> if a matching temp no tice ship message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempNoTiceShipMessage fetchBydocumentNameAndDocumentYearAndNoticeShipType_Last(
		long documentName, int documentYear, String noticeShipType,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBydocumentNameAndDocumentYearAndNoticeShipType(documentName,
				documentYear, noticeShipType);

		if (count == 0) {
			return null;
		}

		List<TempNoTiceShipMessage> list = findBydocumentNameAndDocumentYearAndNoticeShipType(documentName,
				documentYear, noticeShipType, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp no tice ship messages before and after the current temp no tice ship message in the ordered set where documentName = &#63; and documentYear = &#63; and noticeShipType = &#63;.
	 *
	 * @param id the primary key of the current temp no tice ship message
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param noticeShipType the notice ship type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp no tice ship message
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempNoTiceShipMessageException if a temp no tice ship message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempNoTiceShipMessage[] findBydocumentNameAndDocumentYearAndNoticeShipType_PrevAndNext(
		long id, long documentName, int documentYear, String noticeShipType,
		OrderByComparator orderByComparator)
		throws NoSuchTempNoTiceShipMessageException, SystemException {
		TempNoTiceShipMessage tempNoTiceShipMessage = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempNoTiceShipMessage[] array = new TempNoTiceShipMessageImpl[3];

			array[0] = getBydocumentNameAndDocumentYearAndNoticeShipType_PrevAndNext(session,
					tempNoTiceShipMessage, documentName, documentYear,
					noticeShipType, orderByComparator, true);

			array[1] = tempNoTiceShipMessage;

			array[2] = getBydocumentNameAndDocumentYearAndNoticeShipType_PrevAndNext(session,
					tempNoTiceShipMessage, documentName, documentYear,
					noticeShipType, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TempNoTiceShipMessage getBydocumentNameAndDocumentYearAndNoticeShipType_PrevAndNext(
		Session session, TempNoTiceShipMessage tempNoTiceShipMessage,
		long documentName, int documentYear, String noticeShipType,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TEMPNOTICESHIPMESSAGE_WHERE);

		query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDNOTICESHIPTYPE_DOCUMENTNAME_2);

		query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDNOTICESHIPTYPE_DOCUMENTYEAR_2);

		boolean bindNoticeShipType = false;

		if (noticeShipType == null) {
			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDNOTICESHIPTYPE_NOTICESHIPTYPE_1);
		}
		else if (noticeShipType.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDNOTICESHIPTYPE_NOTICESHIPTYPE_3);
		}
		else {
			bindNoticeShipType = true;

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDNOTICESHIPTYPE_NOTICESHIPTYPE_2);
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
			query.append(TempNoTiceShipMessageModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(documentName);

		qPos.add(documentYear);

		if (bindNoticeShipType) {
			qPos.add(noticeShipType);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tempNoTiceShipMessage);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempNoTiceShipMessage> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp no tice ship messages where documentName = &#63; and documentYear = &#63; and noticeShipType = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param noticeShipType the notice ship type
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBydocumentNameAndDocumentYearAndNoticeShipType(
		long documentName, int documentYear, String noticeShipType)
		throws SystemException {
		for (TempNoTiceShipMessage tempNoTiceShipMessage : findBydocumentNameAndDocumentYearAndNoticeShipType(
				documentName, documentYear, noticeShipType, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tempNoTiceShipMessage);
		}
	}

	/**
	 * Returns the number of temp no tice ship messages where documentName = &#63; and documentYear = &#63; and noticeShipType = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param noticeShipType the notice ship type
	 * @return the number of matching temp no tice ship messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBydocumentNameAndDocumentYearAndNoticeShipType(
		long documentName, int documentYear, String noticeShipType)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARANDNOTICESHIPTYPE;

		Object[] finderArgs = new Object[] {
				documentName, documentYear, noticeShipType
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_TEMPNOTICESHIPMESSAGE_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDNOTICESHIPTYPE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDNOTICESHIPTYPE_DOCUMENTYEAR_2);

			boolean bindNoticeShipType = false;

			if (noticeShipType == null) {
				query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDNOTICESHIPTYPE_NOTICESHIPTYPE_1);
			}
			else if (noticeShipType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDNOTICESHIPTYPE_NOTICESHIPTYPE_3);
			}
			else {
				bindNoticeShipType = true;

				query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDNOTICESHIPTYPE_NOTICESHIPTYPE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(documentName);

				qPos.add(documentYear);

				if (bindNoticeShipType) {
					qPos.add(noticeShipType);
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

	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDNOTICESHIPTYPE_DOCUMENTNAME_2 =
		"tempNoTiceShipMessage.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDNOTICESHIPTYPE_DOCUMENTYEAR_2 =
		"tempNoTiceShipMessage.documentYear = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDNOTICESHIPTYPE_NOTICESHIPTYPE_1 =
		"tempNoTiceShipMessage.noticeShipType IS NULL";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDNOTICESHIPTYPE_NOTICESHIPTYPE_2 =
		"tempNoTiceShipMessage.noticeShipType = ?";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARANDNOTICESHIPTYPE_NOTICESHIPTYPE_3 =
		"(tempNoTiceShipMessage.noticeShipType IS NULL OR tempNoTiceShipMessage.noticeShipType = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempNoTiceShipMessageModelImpl.ENTITY_CACHE_ENABLED,
			TempNoTiceShipMessageModelImpl.FINDER_CACHE_ENABLED,
			TempNoTiceShipMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRequestCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempNoTiceShipMessageModelImpl.ENTITY_CACHE_ENABLED,
			TempNoTiceShipMessageModelImpl.FINDER_CACHE_ENABLED,
			TempNoTiceShipMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRequestCode",
			new String[] { String.class.getName() },
			TempNoTiceShipMessageModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE = new FinderPath(TempNoTiceShipMessageModelImpl.ENTITY_CACHE_ENABLED,
			TempNoTiceShipMessageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRequestCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the temp no tice ship messages where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the matching temp no tice ship messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempNoTiceShipMessage> findByRequestCode(String requestCode)
		throws SystemException {
		return findByRequestCode(requestCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp no tice ship messages where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempNoTiceShipMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp no tice ship messages
	 * @param end the upper bound of the range of temp no tice ship messages (not inclusive)
	 * @return the range of matching temp no tice ship messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempNoTiceShipMessage> findByRequestCode(String requestCode,
		int start, int end) throws SystemException {
		return findByRequestCode(requestCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp no tice ship messages where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempNoTiceShipMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp no tice ship messages
	 * @param end the upper bound of the range of temp no tice ship messages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp no tice ship messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempNoTiceShipMessage> findByRequestCode(String requestCode,
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

		List<TempNoTiceShipMessage> list = (List<TempNoTiceShipMessage>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempNoTiceShipMessage tempNoTiceShipMessage : list) {
				if (!Validator.equals(requestCode,
							tempNoTiceShipMessage.getRequestCode())) {
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

			query.append(_SQL_SELECT_TEMPNOTICESHIPMESSAGE_WHERE);

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
				query.append(TempNoTiceShipMessageModelImpl.ORDER_BY_JPQL);
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
					list = (List<TempNoTiceShipMessage>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempNoTiceShipMessage>(list);
				}
				else {
					list = (List<TempNoTiceShipMessage>)QueryUtil.list(q,
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
	 * Returns the first temp no tice ship message in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp no tice ship message
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempNoTiceShipMessageException if a matching temp no tice ship message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempNoTiceShipMessage findByRequestCode_First(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempNoTiceShipMessageException, SystemException {
		TempNoTiceShipMessage tempNoTiceShipMessage = fetchByRequestCode_First(requestCode,
				orderByComparator);

		if (tempNoTiceShipMessage != null) {
			return tempNoTiceShipMessage;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempNoTiceShipMessageException(msg.toString());
	}

	/**
	 * Returns the first temp no tice ship message in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp no tice ship message, or <code>null</code> if a matching temp no tice ship message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempNoTiceShipMessage fetchByRequestCode_First(String requestCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<TempNoTiceShipMessage> list = findByRequestCode(requestCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp no tice ship message in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp no tice ship message
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempNoTiceShipMessageException if a matching temp no tice ship message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempNoTiceShipMessage findByRequestCode_Last(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempNoTiceShipMessageException, SystemException {
		TempNoTiceShipMessage tempNoTiceShipMessage = fetchByRequestCode_Last(requestCode,
				orderByComparator);

		if (tempNoTiceShipMessage != null) {
			return tempNoTiceShipMessage;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempNoTiceShipMessageException(msg.toString());
	}

	/**
	 * Returns the last temp no tice ship message in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp no tice ship message, or <code>null</code> if a matching temp no tice ship message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempNoTiceShipMessage fetchByRequestCode_Last(String requestCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByRequestCode(requestCode);

		if (count == 0) {
			return null;
		}

		List<TempNoTiceShipMessage> list = findByRequestCode(requestCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp no tice ship messages before and after the current temp no tice ship message in the ordered set where requestCode = &#63;.
	 *
	 * @param id the primary key of the current temp no tice ship message
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp no tice ship message
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempNoTiceShipMessageException if a temp no tice ship message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempNoTiceShipMessage[] findByRequestCode_PrevAndNext(long id,
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempNoTiceShipMessageException, SystemException {
		TempNoTiceShipMessage tempNoTiceShipMessage = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempNoTiceShipMessage[] array = new TempNoTiceShipMessageImpl[3];

			array[0] = getByRequestCode_PrevAndNext(session,
					tempNoTiceShipMessage, requestCode, orderByComparator, true);

			array[1] = tempNoTiceShipMessage;

			array[2] = getByRequestCode_PrevAndNext(session,
					tempNoTiceShipMessage, requestCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TempNoTiceShipMessage getByRequestCode_PrevAndNext(
		Session session, TempNoTiceShipMessage tempNoTiceShipMessage,
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

		query.append(_SQL_SELECT_TEMPNOTICESHIPMESSAGE_WHERE);

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
			query.append(TempNoTiceShipMessageModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(tempNoTiceShipMessage);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempNoTiceShipMessage> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp no tice ship messages where requestCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByRequestCode(String requestCode)
		throws SystemException {
		for (TempNoTiceShipMessage tempNoTiceShipMessage : findByRequestCode(
				requestCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tempNoTiceShipMessage);
		}
	}

	/**
	 * Returns the number of temp no tice ship messages where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the number of matching temp no tice ship messages
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

			query.append(_SQL_COUNT_TEMPNOTICESHIPMESSAGE_WHERE);

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

	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1 = "tempNoTiceShipMessage.requestCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2 = "tempNoTiceShipMessage.requestCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3 = "(tempNoTiceShipMessage.requestCode IS NULL OR tempNoTiceShipMessage.requestCode = '')";

	public TempNoTiceShipMessagePersistenceImpl() {
		setModelClass(TempNoTiceShipMessage.class);
	}

	/**
	 * Caches the temp no tice ship message in the entity cache if it is enabled.
	 *
	 * @param tempNoTiceShipMessage the temp no tice ship message
	 */
	@Override
	public void cacheResult(TempNoTiceShipMessage tempNoTiceShipMessage) {
		EntityCacheUtil.putResult(TempNoTiceShipMessageModelImpl.ENTITY_CACHE_ENABLED,
			TempNoTiceShipMessageImpl.class,
			tempNoTiceShipMessage.getPrimaryKey(), tempNoTiceShipMessage);

		tempNoTiceShipMessage.resetOriginalValues();
	}

	/**
	 * Caches the temp no tice ship messages in the entity cache if it is enabled.
	 *
	 * @param tempNoTiceShipMessages the temp no tice ship messages
	 */
	@Override
	public void cacheResult(List<TempNoTiceShipMessage> tempNoTiceShipMessages) {
		for (TempNoTiceShipMessage tempNoTiceShipMessage : tempNoTiceShipMessages) {
			if (EntityCacheUtil.getResult(
						TempNoTiceShipMessageModelImpl.ENTITY_CACHE_ENABLED,
						TempNoTiceShipMessageImpl.class,
						tempNoTiceShipMessage.getPrimaryKey()) == null) {
				cacheResult(tempNoTiceShipMessage);
			}
			else {
				tempNoTiceShipMessage.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all temp no tice ship messages.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TempNoTiceShipMessageImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TempNoTiceShipMessageImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the temp no tice ship message.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TempNoTiceShipMessage tempNoTiceShipMessage) {
		EntityCacheUtil.removeResult(TempNoTiceShipMessageModelImpl.ENTITY_CACHE_ENABLED,
			TempNoTiceShipMessageImpl.class,
			tempNoTiceShipMessage.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TempNoTiceShipMessage> tempNoTiceShipMessages) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TempNoTiceShipMessage tempNoTiceShipMessage : tempNoTiceShipMessages) {
			EntityCacheUtil.removeResult(TempNoTiceShipMessageModelImpl.ENTITY_CACHE_ENABLED,
				TempNoTiceShipMessageImpl.class,
				tempNoTiceShipMessage.getPrimaryKey());
		}
	}

	/**
	 * Creates a new temp no tice ship message with the primary key. Does not add the temp no tice ship message to the database.
	 *
	 * @param id the primary key for the new temp no tice ship message
	 * @return the new temp no tice ship message
	 */
	@Override
	public TempNoTiceShipMessage create(long id) {
		TempNoTiceShipMessage tempNoTiceShipMessage = new TempNoTiceShipMessageImpl();

		tempNoTiceShipMessage.setNew(true);
		tempNoTiceShipMessage.setPrimaryKey(id);

		return tempNoTiceShipMessage;
	}

	/**
	 * Removes the temp no tice ship message with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the temp no tice ship message
	 * @return the temp no tice ship message that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempNoTiceShipMessageException if a temp no tice ship message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempNoTiceShipMessage remove(long id)
		throws NoSuchTempNoTiceShipMessageException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the temp no tice ship message with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the temp no tice ship message
	 * @return the temp no tice ship message that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempNoTiceShipMessageException if a temp no tice ship message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempNoTiceShipMessage remove(Serializable primaryKey)
		throws NoSuchTempNoTiceShipMessageException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TempNoTiceShipMessage tempNoTiceShipMessage = (TempNoTiceShipMessage)session.get(TempNoTiceShipMessageImpl.class,
					primaryKey);

			if (tempNoTiceShipMessage == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTempNoTiceShipMessageException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tempNoTiceShipMessage);
		}
		catch (NoSuchTempNoTiceShipMessageException nsee) {
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
	protected TempNoTiceShipMessage removeImpl(
		TempNoTiceShipMessage tempNoTiceShipMessage) throws SystemException {
		tempNoTiceShipMessage = toUnwrappedModel(tempNoTiceShipMessage);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tempNoTiceShipMessage)) {
				tempNoTiceShipMessage = (TempNoTiceShipMessage)session.get(TempNoTiceShipMessageImpl.class,
						tempNoTiceShipMessage.getPrimaryKeyObj());
			}

			if (tempNoTiceShipMessage != null) {
				session.delete(tempNoTiceShipMessage);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tempNoTiceShipMessage != null) {
			clearCache(tempNoTiceShipMessage);
		}

		return tempNoTiceShipMessage;
	}

	@Override
	public TempNoTiceShipMessage updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.TempNoTiceShipMessage tempNoTiceShipMessage)
		throws SystemException {
		tempNoTiceShipMessage = toUnwrappedModel(tempNoTiceShipMessage);

		boolean isNew = tempNoTiceShipMessage.isNew();

		TempNoTiceShipMessageModelImpl tempNoTiceShipMessageModelImpl = (TempNoTiceShipMessageModelImpl)tempNoTiceShipMessage;

		Session session = null;

		try {
			session = openSession();

			if (tempNoTiceShipMessage.isNew()) {
				session.save(tempNoTiceShipMessage);

				tempNoTiceShipMessage.setNew(false);
			}
			else {
				session.merge(tempNoTiceShipMessage);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TempNoTiceShipMessageModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tempNoTiceShipMessageModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempNoTiceShipMessageModelImpl.getOriginalDocumentName(),
						tempNoTiceShipMessageModelImpl.getOriginalDocumentYear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);

				args = new Object[] {
						tempNoTiceShipMessageModelImpl.getDocumentName(),
						tempNoTiceShipMessageModelImpl.getDocumentYear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
			}

			if ((tempNoTiceShipMessageModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARANDNOTICESHIPTYPE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempNoTiceShipMessageModelImpl.getOriginalDocumentName(),
						tempNoTiceShipMessageModelImpl.getOriginalDocumentYear(),
						tempNoTiceShipMessageModelImpl.getOriginalNoticeShipType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARANDNOTICESHIPTYPE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARANDNOTICESHIPTYPE,
					args);

				args = new Object[] {
						tempNoTiceShipMessageModelImpl.getDocumentName(),
						tempNoTiceShipMessageModelImpl.getDocumentYear(),
						tempNoTiceShipMessageModelImpl.getNoticeShipType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARANDNOTICESHIPTYPE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARANDNOTICESHIPTYPE,
					args);
			}

			if ((tempNoTiceShipMessageModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempNoTiceShipMessageModelImpl.getOriginalRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);

				args = new Object[] {
						tempNoTiceShipMessageModelImpl.getRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(TempNoTiceShipMessageModelImpl.ENTITY_CACHE_ENABLED,
			TempNoTiceShipMessageImpl.class,
			tempNoTiceShipMessage.getPrimaryKey(), tempNoTiceShipMessage);

		return tempNoTiceShipMessage;
	}

	protected TempNoTiceShipMessage toUnwrappedModel(
		TempNoTiceShipMessage tempNoTiceShipMessage) {
		if (tempNoTiceShipMessage instanceof TempNoTiceShipMessageImpl) {
			return tempNoTiceShipMessage;
		}

		TempNoTiceShipMessageImpl tempNoTiceShipMessageImpl = new TempNoTiceShipMessageImpl();

		tempNoTiceShipMessageImpl.setNew(tempNoTiceShipMessage.isNew());
		tempNoTiceShipMessageImpl.setPrimaryKey(tempNoTiceShipMessage.getPrimaryKey());

		tempNoTiceShipMessageImpl.setId(tempNoTiceShipMessage.getId());
		tempNoTiceShipMessageImpl.setRequestCode(tempNoTiceShipMessage.getRequestCode());
		tempNoTiceShipMessageImpl.setRequestState(tempNoTiceShipMessage.getRequestState());
		tempNoTiceShipMessageImpl.setNoticeShipType(tempNoTiceShipMessage.getNoticeShipType());
		tempNoTiceShipMessageImpl.setNoticeShipCode(tempNoTiceShipMessage.getNoticeShipCode());
		tempNoTiceShipMessageImpl.setDocumentName(tempNoTiceShipMessage.getDocumentName());
		tempNoTiceShipMessageImpl.setUserCreated(tempNoTiceShipMessage.getUserCreated());
		tempNoTiceShipMessageImpl.setConfirmTime(tempNoTiceShipMessage.getConfirmTime());
		tempNoTiceShipMessageImpl.setShipName(tempNoTiceShipMessage.getShipName());
		tempNoTiceShipMessageImpl.setShipTypeCode(tempNoTiceShipMessage.getShipTypeCode());
		tempNoTiceShipMessageImpl.setStateCode(tempNoTiceShipMessage.getStateCode());
		tempNoTiceShipMessageImpl.setShipCaptain(tempNoTiceShipMessage.getShipCaptain());
		tempNoTiceShipMessageImpl.setImo(tempNoTiceShipMessage.getImo());
		tempNoTiceShipMessageImpl.setGrt(tempNoTiceShipMessage.getGrt());
		tempNoTiceShipMessageImpl.setDwt(tempNoTiceShipMessage.getDwt());
		tempNoTiceShipMessageImpl.setUnitGRT(tempNoTiceShipMessage.getUnitGRT());
		tempNoTiceShipMessageImpl.setUnitDWT(tempNoTiceShipMessage.getUnitDWT());
		tempNoTiceShipMessageImpl.setCallSign(tempNoTiceShipMessage.getCallSign());
		tempNoTiceShipMessageImpl.setArrivalDate(tempNoTiceShipMessage.getArrivalDate());
		tempNoTiceShipMessageImpl.setArrivalPortCode(tempNoTiceShipMessage.getArrivalPortCode());
		tempNoTiceShipMessageImpl.setPortHarbourCode(tempNoTiceShipMessage.getPortHarbourCode());
		tempNoTiceShipMessageImpl.setPortRegionCode(tempNoTiceShipMessage.getPortRegionCode());
		tempNoTiceShipMessageImpl.setPortWharfCode(tempNoTiceShipMessage.getPortWharfCode());
		tempNoTiceShipMessageImpl.setPortGoingToStateName(tempNoTiceShipMessage.getPortGoingToStateName());
		tempNoTiceShipMessageImpl.setPortGoingToCode(tempNoTiceShipMessage.getPortGoingToCode());
		tempNoTiceShipMessageImpl.setNameOfShipOwners(tempNoTiceShipMessage.getNameOfShipOwners());
		tempNoTiceShipMessageImpl.setAddressOfShipOwners(tempNoTiceShipMessage.getAddressOfShipOwners());
		tempNoTiceShipMessageImpl.setShipOwnerstateCode(tempNoTiceShipMessage.getShipOwnerstateCode());
		tempNoTiceShipMessageImpl.setShipOwnerPhone(tempNoTiceShipMessage.getShipOwnerPhone());
		tempNoTiceShipMessageImpl.setShipOwnerFax(tempNoTiceShipMessage.getShipOwnerFax());
		tempNoTiceShipMessageImpl.setShipOwnerEmail(tempNoTiceShipMessage.getShipOwnerEmail());
		tempNoTiceShipMessageImpl.setLoa(tempNoTiceShipMessage.getLoa());
		tempNoTiceShipMessageImpl.setBreadth(tempNoTiceShipMessage.getBreadth());
		tempNoTiceShipMessageImpl.setClearanceHeight(tempNoTiceShipMessage.getClearanceHeight());
		tempNoTiceShipMessageImpl.setShownDraftxF(tempNoTiceShipMessage.getShownDraftxF());
		tempNoTiceShipMessageImpl.setShownDraftxA(tempNoTiceShipMessage.getShownDraftxA());
		tempNoTiceShipMessageImpl.setUnitLOA(tempNoTiceShipMessage.getUnitLOA());
		tempNoTiceShipMessageImpl.setUnitBreadth(tempNoTiceShipMessage.getUnitBreadth());
		tempNoTiceShipMessageImpl.setUnitClearanceHeight(tempNoTiceShipMessage.getUnitClearanceHeight());
		tempNoTiceShipMessageImpl.setUnitShownDraftxF(tempNoTiceShipMessage.getUnitShownDraftxF());
		tempNoTiceShipMessageImpl.setUnitShownDraftxA(tempNoTiceShipMessage.getUnitShownDraftxA());
		tempNoTiceShipMessageImpl.setCertificateOfRegistryNumber(tempNoTiceShipMessage.getCertificateOfRegistryNumber());
		tempNoTiceShipMessageImpl.setCertificateOfRegistryDate(tempNoTiceShipMessage.getCertificateOfRegistryDate());
		tempNoTiceShipMessageImpl.setCertificateOfRegistryPortName(tempNoTiceShipMessage.getCertificateOfRegistryPortName());
		tempNoTiceShipMessageImpl.setShipAgencyCode(tempNoTiceShipMessage.getShipAgencyCode());
		tempNoTiceShipMessageImpl.setShipAgencyAddress(tempNoTiceShipMessage.getShipAgencyAddress());
		tempNoTiceShipMessageImpl.setShipAgencyPhone(tempNoTiceShipMessage.getShipAgencyPhone());
		tempNoTiceShipMessageImpl.setShipAgencyFax(tempNoTiceShipMessage.getShipAgencyFax());
		tempNoTiceShipMessageImpl.setShipAgencyEmail(tempNoTiceShipMessage.getShipAgencyEmail());
		tempNoTiceShipMessageImpl.setPurposeCode(tempNoTiceShipMessage.getPurposeCode());
		tempNoTiceShipMessageImpl.setPurposeSpecified(tempNoTiceShipMessage.getPurposeSpecified());
		tempNoTiceShipMessageImpl.setCrewNumber(tempNoTiceShipMessage.getCrewNumber());
		tempNoTiceShipMessageImpl.setUnitCrew(tempNoTiceShipMessage.getUnitCrew());
		tempNoTiceShipMessageImpl.setPassengerNumber(tempNoTiceShipMessage.getPassengerNumber());
		tempNoTiceShipMessageImpl.setUnitPassenger(tempNoTiceShipMessage.getUnitPassenger());
		tempNoTiceShipMessageImpl.setQuantityAndTypeOfCargo(tempNoTiceShipMessage.getQuantityAndTypeOfCargo());
		tempNoTiceShipMessageImpl.setUnitQuantityofCargo(tempNoTiceShipMessage.getUnitQuantityofCargo());
		tempNoTiceShipMessageImpl.setTypeOfCargo(tempNoTiceShipMessage.getTypeOfCargo());
		tempNoTiceShipMessageImpl.setOtherPersons(tempNoTiceShipMessage.getOtherPersons());
		tempNoTiceShipMessageImpl.setRemarks(tempNoTiceShipMessage.getRemarks());
		tempNoTiceShipMessageImpl.setSignPlace(tempNoTiceShipMessage.getSignPlace());
		tempNoTiceShipMessageImpl.setSignDate(tempNoTiceShipMessage.getSignDate());
		tempNoTiceShipMessageImpl.setMasterSigned(tempNoTiceShipMessage.getMasterSigned());
		tempNoTiceShipMessageImpl.setMasterSignedImage(tempNoTiceShipMessage.getMasterSignedImage());
		tempNoTiceShipMessageImpl.setDocumentYear(tempNoTiceShipMessage.getDocumentYear());
		tempNoTiceShipMessageImpl.setNameOfShipAgent(tempNoTiceShipMessage.getNameOfShipAgent());

		return tempNoTiceShipMessageImpl;
	}

	/**
	 * Returns the temp no tice ship message with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp no tice ship message
	 * @return the temp no tice ship message
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempNoTiceShipMessageException if a temp no tice ship message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempNoTiceShipMessage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTempNoTiceShipMessageException, SystemException {
		TempNoTiceShipMessage tempNoTiceShipMessage = fetchByPrimaryKey(primaryKey);

		if (tempNoTiceShipMessage == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTempNoTiceShipMessageException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tempNoTiceShipMessage;
	}

	/**
	 * Returns the temp no tice ship message with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchTempNoTiceShipMessageException} if it could not be found.
	 *
	 * @param id the primary key of the temp no tice ship message
	 * @return the temp no tice ship message
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempNoTiceShipMessageException if a temp no tice ship message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempNoTiceShipMessage findByPrimaryKey(long id)
		throws NoSuchTempNoTiceShipMessageException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the temp no tice ship message with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp no tice ship message
	 * @return the temp no tice ship message, or <code>null</code> if a temp no tice ship message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempNoTiceShipMessage fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TempNoTiceShipMessage tempNoTiceShipMessage = (TempNoTiceShipMessage)EntityCacheUtil.getResult(TempNoTiceShipMessageModelImpl.ENTITY_CACHE_ENABLED,
				TempNoTiceShipMessageImpl.class, primaryKey);

		if (tempNoTiceShipMessage == _nullTempNoTiceShipMessage) {
			return null;
		}

		if (tempNoTiceShipMessage == null) {
			Session session = null;

			try {
				session = openSession();

				tempNoTiceShipMessage = (TempNoTiceShipMessage)session.get(TempNoTiceShipMessageImpl.class,
						primaryKey);

				if (tempNoTiceShipMessage != null) {
					cacheResult(tempNoTiceShipMessage);
				}
				else {
					EntityCacheUtil.putResult(TempNoTiceShipMessageModelImpl.ENTITY_CACHE_ENABLED,
						TempNoTiceShipMessageImpl.class, primaryKey,
						_nullTempNoTiceShipMessage);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TempNoTiceShipMessageModelImpl.ENTITY_CACHE_ENABLED,
					TempNoTiceShipMessageImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tempNoTiceShipMessage;
	}

	/**
	 * Returns the temp no tice ship message with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the temp no tice ship message
	 * @return the temp no tice ship message, or <code>null</code> if a temp no tice ship message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempNoTiceShipMessage fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the temp no tice ship messages.
	 *
	 * @return the temp no tice ship messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempNoTiceShipMessage> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp no tice ship messages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempNoTiceShipMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp no tice ship messages
	 * @param end the upper bound of the range of temp no tice ship messages (not inclusive)
	 * @return the range of temp no tice ship messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempNoTiceShipMessage> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp no tice ship messages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempNoTiceShipMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp no tice ship messages
	 * @param end the upper bound of the range of temp no tice ship messages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of temp no tice ship messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempNoTiceShipMessage> findAll(int start, int end,
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

		List<TempNoTiceShipMessage> list = (List<TempNoTiceShipMessage>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TEMPNOTICESHIPMESSAGE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TEMPNOTICESHIPMESSAGE;

				if (pagination) {
					sql = sql.concat(TempNoTiceShipMessageModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TempNoTiceShipMessage>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempNoTiceShipMessage>(list);
				}
				else {
					list = (List<TempNoTiceShipMessage>)QueryUtil.list(q,
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
	 * Removes all the temp no tice ship messages from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TempNoTiceShipMessage tempNoTiceShipMessage : findAll()) {
			remove(tempNoTiceShipMessage);
		}
	}

	/**
	 * Returns the number of temp no tice ship messages.
	 *
	 * @return the number of temp no tice ship messages
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

				Query q = session.createQuery(_SQL_COUNT_TEMPNOTICESHIPMESSAGE);

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
	 * Initializes the temp no tice ship message persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.TempNoTiceShipMessage")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TempNoTiceShipMessage>> listenersList = new ArrayList<ModelListener<TempNoTiceShipMessage>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TempNoTiceShipMessage>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TempNoTiceShipMessageImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TEMPNOTICESHIPMESSAGE = "SELECT tempNoTiceShipMessage FROM TempNoTiceShipMessage tempNoTiceShipMessage";
	private static final String _SQL_SELECT_TEMPNOTICESHIPMESSAGE_WHERE = "SELECT tempNoTiceShipMessage FROM TempNoTiceShipMessage tempNoTiceShipMessage WHERE ";
	private static final String _SQL_COUNT_TEMPNOTICESHIPMESSAGE = "SELECT COUNT(tempNoTiceShipMessage) FROM TempNoTiceShipMessage tempNoTiceShipMessage";
	private static final String _SQL_COUNT_TEMPNOTICESHIPMESSAGE_WHERE = "SELECT COUNT(tempNoTiceShipMessage) FROM TempNoTiceShipMessage tempNoTiceShipMessage WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tempNoTiceShipMessage.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TempNoTiceShipMessage exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TempNoTiceShipMessage exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TempNoTiceShipMessagePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "requestCode", "requestState", "noticeShipType",
				"noticeShipCode", "documentName", "userCreated", "confirmTime",
				"shipName", "shipTypeCode", "stateCode", "shipCaptain", "imo",
				"grt", "dwt", "unitGRT", "unitDWT", "callSign", "arrivalDate",
				"arrivalPortCode", "portHarbourCode", "portRegionCode",
				"portWharfCode", "portGoingToStateName", "portGoingToCode",
				"nameOfShipOwners", "addressOfShipOwners", "shipOwnerstateCode",
				"shipOwnerPhone", "shipOwnerFax", "shipOwnerEmail", "loa",
				"breadth", "clearanceHeight", "shownDraftxF", "shownDraftxA",
				"unitLOA", "unitBreadth", "unitClearanceHeight",
				"unitShownDraftxF", "unitShownDraftxA",
				"certificateOfRegistryNumber", "certificateOfRegistryDate",
				"certificateOfRegistryPortName", "shipAgencyCode",
				"shipAgencyAddress", "shipAgencyPhone", "shipAgencyFax",
				"shipAgencyEmail", "purposeCode", "purposeSpecified",
				"crewNumber", "unitCrew", "passengerNumber", "unitPassenger",
				"quantityAndTypeOfCargo", "unitQuantityofCargo", "typeOfCargo",
				"otherPersons", "remarks", "signPlace", "signDate",
				"masterSigned", "masterSignedImage", "documentYear",
				"nameOfShipAgent"
			});
	private static TempNoTiceShipMessage _nullTempNoTiceShipMessage = new TempNoTiceShipMessageImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TempNoTiceShipMessage> toCacheModel() {
				return _nullTempNoTiceShipMessageCacheModel;
			}
		};

	private static CacheModel<TempNoTiceShipMessage> _nullTempNoTiceShipMessageCacheModel =
		new CacheModel<TempNoTiceShipMessage>() {
			@Override
			public TempNoTiceShipMessage toEntityModel() {
				return _nullTempNoTiceShipMessage;
			}
		};
}