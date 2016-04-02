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

import vn.dtt.duongbien.dao.vrcb.NoSuchTempShipSecurityMessageException;
import vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityMessage;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempShipSecurityMessageImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempShipSecurityMessageModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the temp ship security message service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see TempShipSecurityMessagePersistence
 * @see TempShipSecurityMessageUtil
 * @generated
 */
public class TempShipSecurityMessagePersistenceImpl extends BasePersistenceImpl<TempShipSecurityMessage>
	implements TempShipSecurityMessagePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TempShipSecurityMessageUtil} to access the temp ship security message persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TempShipSecurityMessageImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TempShipSecurityMessageModelImpl.ENTITY_CACHE_ENABLED,
			TempShipSecurityMessageModelImpl.FINDER_CACHE_ENABLED,
			TempShipSecurityMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TempShipSecurityMessageModelImpl.ENTITY_CACHE_ENABLED,
			TempShipSecurityMessageModelImpl.FINDER_CACHE_ENABLED,
			TempShipSecurityMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TempShipSecurityMessageModelImpl.ENTITY_CACHE_ENABLED,
			TempShipSecurityMessageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempShipSecurityMessageModelImpl.ENTITY_CACHE_ENABLED,
			TempShipSecurityMessageModelImpl.FINDER_CACHE_ENABLED,
			TempShipSecurityMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBydocumentNameAnddocumentYear",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempShipSecurityMessageModelImpl.ENTITY_CACHE_ENABLED,
			TempShipSecurityMessageModelImpl.FINDER_CACHE_ENABLED,
			TempShipSecurityMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBydocumentNameAnddocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() },
			TempShipSecurityMessageModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			TempShipSecurityMessageModelImpl.DOCUMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR =
		new FinderPath(TempShipSecurityMessageModelImpl.ENTITY_CACHE_ENABLED,
			TempShipSecurityMessageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBydocumentNameAnddocumentYear",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the temp ship security messages where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the matching temp ship security messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempShipSecurityMessage> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear) throws SystemException {
		return findBydocumentNameAnddocumentYear(documentName, documentYear,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp ship security messages where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempShipSecurityMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of temp ship security messages
	 * @param end the upper bound of the range of temp ship security messages (not inclusive)
	 * @return the range of matching temp ship security messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempShipSecurityMessage> findBydocumentNameAnddocumentYear(
		long documentName, int documentYear, int start, int end)
		throws SystemException {
		return findBydocumentNameAnddocumentYear(documentName, documentYear,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp ship security messages where documentName = &#63; and documentYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempShipSecurityMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param start the lower bound of the range of temp ship security messages
	 * @param end the upper bound of the range of temp ship security messages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp ship security messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempShipSecurityMessage> findBydocumentNameAnddocumentYear(
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

		List<TempShipSecurityMessage> list = (List<TempShipSecurityMessage>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempShipSecurityMessage tempShipSecurityMessage : list) {
				if ((documentName != tempShipSecurityMessage.getDocumentName()) ||
						(documentYear != tempShipSecurityMessage.getDocumentYear())) {
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

			query.append(_SQL_SELECT_TEMPSHIPSECURITYMESSAGE_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TempShipSecurityMessageModelImpl.ORDER_BY_JPQL);
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
					list = (List<TempShipSecurityMessage>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempShipSecurityMessage>(list);
				}
				else {
					list = (List<TempShipSecurityMessage>)QueryUtil.list(q,
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
	 * Returns the first temp ship security message in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp ship security message
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempShipSecurityMessageException if a matching temp ship security message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipSecurityMessage findBydocumentNameAnddocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchTempShipSecurityMessageException, SystemException {
		TempShipSecurityMessage tempShipSecurityMessage = fetchBydocumentNameAnddocumentYear_First(documentName,
				documentYear, orderByComparator);

		if (tempShipSecurityMessage != null) {
			return tempShipSecurityMessage;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempShipSecurityMessageException(msg.toString());
	}

	/**
	 * Returns the first temp ship security message in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp ship security message, or <code>null</code> if a matching temp ship security message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipSecurityMessage fetchBydocumentNameAnddocumentYear_First(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws SystemException {
		List<TempShipSecurityMessage> list = findBydocumentNameAnddocumentYear(documentName,
				documentYear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp ship security message in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp ship security message
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempShipSecurityMessageException if a matching temp ship security message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipSecurityMessage findBydocumentNameAnddocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws NoSuchTempShipSecurityMessageException, SystemException {
		TempShipSecurityMessage tempShipSecurityMessage = fetchBydocumentNameAnddocumentYear_Last(documentName,
				documentYear, orderByComparator);

		if (tempShipSecurityMessage != null) {
			return tempShipSecurityMessage;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentName=");
		msg.append(documentName);

		msg.append(", documentYear=");
		msg.append(documentYear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempShipSecurityMessageException(msg.toString());
	}

	/**
	 * Returns the last temp ship security message in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp ship security message, or <code>null</code> if a matching temp ship security message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipSecurityMessage fetchBydocumentNameAnddocumentYear_Last(
		long documentName, int documentYear, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBydocumentNameAnddocumentYear(documentName,
				documentYear);

		if (count == 0) {
			return null;
		}

		List<TempShipSecurityMessage> list = findBydocumentNameAnddocumentYear(documentName,
				documentYear, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp ship security messages before and after the current temp ship security message in the ordered set where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param id the primary key of the current temp ship security message
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp ship security message
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempShipSecurityMessageException if a temp ship security message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipSecurityMessage[] findBydocumentNameAnddocumentYear_PrevAndNext(
		long id, long documentName, int documentYear,
		OrderByComparator orderByComparator)
		throws NoSuchTempShipSecurityMessageException, SystemException {
		TempShipSecurityMessage tempShipSecurityMessage = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempShipSecurityMessage[] array = new TempShipSecurityMessageImpl[3];

			array[0] = getBydocumentNameAnddocumentYear_PrevAndNext(session,
					tempShipSecurityMessage, documentName, documentYear,
					orderByComparator, true);

			array[1] = tempShipSecurityMessage;

			array[2] = getBydocumentNameAnddocumentYear_PrevAndNext(session,
					tempShipSecurityMessage, documentName, documentYear,
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

	protected TempShipSecurityMessage getBydocumentNameAnddocumentYear_PrevAndNext(
		Session session, TempShipSecurityMessage tempShipSecurityMessage,
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

		query.append(_SQL_SELECT_TEMPSHIPSECURITYMESSAGE_WHERE);

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
			query.append(TempShipSecurityMessageModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(documentName);

		qPos.add(documentYear);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(tempShipSecurityMessage);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempShipSecurityMessage> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp ship security messages where documentName = &#63; and documentYear = &#63; from the database.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBydocumentNameAnddocumentYear(long documentName,
		int documentYear) throws SystemException {
		for (TempShipSecurityMessage tempShipSecurityMessage : findBydocumentNameAnddocumentYear(
				documentName, documentYear, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tempShipSecurityMessage);
		}
	}

	/**
	 * Returns the number of temp ship security messages where documentName = &#63; and documentYear = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @return the number of matching temp ship security messages
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

			query.append(_SQL_COUNT_TEMPSHIPSECURITYMESSAGE_WHERE);

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
		"tempShipSecurityMessage.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEAR_DOCUMENTYEAR_2 =
		"tempShipSecurityMessage.documentYear = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE =
		new FinderPath(TempShipSecurityMessageModelImpl.ENTITY_CACHE_ENABLED,
			TempShipSecurityMessageModelImpl.FINDER_CACHE_ENABLED,
			TempShipSecurityMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBydocumentNameAnddocumentYearRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE =
		new FinderPath(TempShipSecurityMessageModelImpl.ENTITY_CACHE_ENABLED,
			TempShipSecurityMessageModelImpl.FINDER_CACHE_ENABLED,
			TempShipSecurityMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBydocumentNameAnddocumentYearRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			},
			TempShipSecurityMessageModelImpl.DOCUMENTNAME_COLUMN_BITMASK |
			TempShipSecurityMessageModelImpl.DOCUMENTYEAR_COLUMN_BITMASK |
			TempShipSecurityMessageModelImpl.REQUESTSTATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE =
		new FinderPath(TempShipSecurityMessageModelImpl.ENTITY_CACHE_ENABLED,
			TempShipSecurityMessageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBydocumentNameAnddocumentYearRequestState",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the temp ship security messages where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @return the matching temp ship security messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempShipSecurityMessage> findBydocumentNameAnddocumentYearRequestState(
		long documentName, int documentYear, int requestState)
		throws SystemException {
		return findBydocumentNameAnddocumentYearRequestState(documentName,
			documentYear, requestState, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the temp ship security messages where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempShipSecurityMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param start the lower bound of the range of temp ship security messages
	 * @param end the upper bound of the range of temp ship security messages (not inclusive)
	 * @return the range of matching temp ship security messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempShipSecurityMessage> findBydocumentNameAnddocumentYearRequestState(
		long documentName, int documentYear, int requestState, int start,
		int end) throws SystemException {
		return findBydocumentNameAnddocumentYearRequestState(documentName,
			documentYear, requestState, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp ship security messages where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempShipSecurityMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param start the lower bound of the range of temp ship security messages
	 * @param end the upper bound of the range of temp ship security messages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp ship security messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempShipSecurityMessage> findBydocumentNameAnddocumentYearRequestState(
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

		List<TempShipSecurityMessage> list = (List<TempShipSecurityMessage>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempShipSecurityMessage tempShipSecurityMessage : list) {
				if ((documentName != tempShipSecurityMessage.getDocumentName()) ||
						(documentYear != tempShipSecurityMessage.getDocumentYear()) ||
						(requestState != tempShipSecurityMessage.getRequestState())) {
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

			query.append(_SQL_SELECT_TEMPSHIPSECURITYMESSAGE_WHERE);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTNAME_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTYEAR_2);

			query.append(_FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_REQUESTSTATE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TempShipSecurityMessageModelImpl.ORDER_BY_JPQL);
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
					list = (List<TempShipSecurityMessage>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempShipSecurityMessage>(list);
				}
				else {
					list = (List<TempShipSecurityMessage>)QueryUtil.list(q,
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
	 * Returns the first temp ship security message in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp ship security message
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempShipSecurityMessageException if a matching temp ship security message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipSecurityMessage findBydocumentNameAnddocumentYearRequestState_First(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchTempShipSecurityMessageException, SystemException {
		TempShipSecurityMessage tempShipSecurityMessage = fetchBydocumentNameAnddocumentYearRequestState_First(documentName,
				documentYear, requestState, orderByComparator);

		if (tempShipSecurityMessage != null) {
			return tempShipSecurityMessage;
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

		throw new NoSuchTempShipSecurityMessageException(msg.toString());
	}

	/**
	 * Returns the first temp ship security message in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp ship security message, or <code>null</code> if a matching temp ship security message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipSecurityMessage fetchBydocumentNameAnddocumentYearRequestState_First(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator) throws SystemException {
		List<TempShipSecurityMessage> list = findBydocumentNameAnddocumentYearRequestState(documentName,
				documentYear, requestState, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp ship security message in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp ship security message
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempShipSecurityMessageException if a matching temp ship security message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipSecurityMessage findBydocumentNameAnddocumentYearRequestState_Last(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchTempShipSecurityMessageException, SystemException {
		TempShipSecurityMessage tempShipSecurityMessage = fetchBydocumentNameAnddocumentYearRequestState_Last(documentName,
				documentYear, requestState, orderByComparator);

		if (tempShipSecurityMessage != null) {
			return tempShipSecurityMessage;
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

		throw new NoSuchTempShipSecurityMessageException(msg.toString());
	}

	/**
	 * Returns the last temp ship security message in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp ship security message, or <code>null</code> if a matching temp ship security message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipSecurityMessage fetchBydocumentNameAnddocumentYearRequestState_Last(
		long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBydocumentNameAnddocumentYearRequestState(documentName,
				documentYear, requestState);

		if (count == 0) {
			return null;
		}

		List<TempShipSecurityMessage> list = findBydocumentNameAnddocumentYearRequestState(documentName,
				documentYear, requestState, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp ship security messages before and after the current temp ship security message in the ordered set where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param id the primary key of the current temp ship security message
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp ship security message
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempShipSecurityMessageException if a temp ship security message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipSecurityMessage[] findBydocumentNameAnddocumentYearRequestState_PrevAndNext(
		long id, long documentName, int documentYear, int requestState,
		OrderByComparator orderByComparator)
		throws NoSuchTempShipSecurityMessageException, SystemException {
		TempShipSecurityMessage tempShipSecurityMessage = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempShipSecurityMessage[] array = new TempShipSecurityMessageImpl[3];

			array[0] = getBydocumentNameAnddocumentYearRequestState_PrevAndNext(session,
					tempShipSecurityMessage, documentName, documentYear,
					requestState, orderByComparator, true);

			array[1] = tempShipSecurityMessage;

			array[2] = getBydocumentNameAnddocumentYearRequestState_PrevAndNext(session,
					tempShipSecurityMessage, documentName, documentYear,
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

	protected TempShipSecurityMessage getBydocumentNameAnddocumentYearRequestState_PrevAndNext(
		Session session, TempShipSecurityMessage tempShipSecurityMessage,
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

		query.append(_SQL_SELECT_TEMPSHIPSECURITYMESSAGE_WHERE);

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
			query.append(TempShipSecurityMessageModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(tempShipSecurityMessage);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempShipSecurityMessage> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp ship security messages where documentName = &#63; and documentYear = &#63; and requestState = &#63; from the database.
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
		for (TempShipSecurityMessage tempShipSecurityMessage : findBydocumentNameAnddocumentYearRequestState(
				documentName, documentYear, requestState, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(tempShipSecurityMessage);
		}
	}

	/**
	 * Returns the number of temp ship security messages where documentName = &#63; and documentYear = &#63; and requestState = &#63;.
	 *
	 * @param documentName the document name
	 * @param documentYear the document year
	 * @param requestState the request state
	 * @return the number of matching temp ship security messages
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

			query.append(_SQL_COUNT_TEMPSHIPSECURITYMESSAGE_WHERE);

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
		"tempShipSecurityMessage.documentName = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_DOCUMENTYEAR_2 =
		"tempShipSecurityMessage.documentYear = ? AND ";
	private static final String _FINDER_COLUMN_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE_REQUESTSTATE_2 =
		"tempShipSecurityMessage.requestState = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempShipSecurityMessageModelImpl.ENTITY_CACHE_ENABLED,
			TempShipSecurityMessageModelImpl.FINDER_CACHE_ENABLED,
			TempShipSecurityMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRequestCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempShipSecurityMessageModelImpl.ENTITY_CACHE_ENABLED,
			TempShipSecurityMessageModelImpl.FINDER_CACHE_ENABLED,
			TempShipSecurityMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRequestCode",
			new String[] { String.class.getName() },
			TempShipSecurityMessageModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE = new FinderPath(TempShipSecurityMessageModelImpl.ENTITY_CACHE_ENABLED,
			TempShipSecurityMessageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRequestCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the temp ship security messages where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the matching temp ship security messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempShipSecurityMessage> findByRequestCode(String requestCode)
		throws SystemException {
		return findByRequestCode(requestCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp ship security messages where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempShipSecurityMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp ship security messages
	 * @param end the upper bound of the range of temp ship security messages (not inclusive)
	 * @return the range of matching temp ship security messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempShipSecurityMessage> findByRequestCode(String requestCode,
		int start, int end) throws SystemException {
		return findByRequestCode(requestCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp ship security messages where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempShipSecurityMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp ship security messages
	 * @param end the upper bound of the range of temp ship security messages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp ship security messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempShipSecurityMessage> findByRequestCode(String requestCode,
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

		List<TempShipSecurityMessage> list = (List<TempShipSecurityMessage>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempShipSecurityMessage tempShipSecurityMessage : list) {
				if (!Validator.equals(requestCode,
							tempShipSecurityMessage.getRequestCode())) {
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

			query.append(_SQL_SELECT_TEMPSHIPSECURITYMESSAGE_WHERE);

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
				query.append(TempShipSecurityMessageModelImpl.ORDER_BY_JPQL);
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
					list = (List<TempShipSecurityMessage>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempShipSecurityMessage>(list);
				}
				else {
					list = (List<TempShipSecurityMessage>)QueryUtil.list(q,
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
	 * Returns the first temp ship security message in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp ship security message
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempShipSecurityMessageException if a matching temp ship security message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipSecurityMessage findByRequestCode_First(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempShipSecurityMessageException, SystemException {
		TempShipSecurityMessage tempShipSecurityMessage = fetchByRequestCode_First(requestCode,
				orderByComparator);

		if (tempShipSecurityMessage != null) {
			return tempShipSecurityMessage;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempShipSecurityMessageException(msg.toString());
	}

	/**
	 * Returns the first temp ship security message in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp ship security message, or <code>null</code> if a matching temp ship security message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipSecurityMessage fetchByRequestCode_First(
		String requestCode, OrderByComparator orderByComparator)
		throws SystemException {
		List<TempShipSecurityMessage> list = findByRequestCode(requestCode, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp ship security message in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp ship security message
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempShipSecurityMessageException if a matching temp ship security message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipSecurityMessage findByRequestCode_Last(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempShipSecurityMessageException, SystemException {
		TempShipSecurityMessage tempShipSecurityMessage = fetchByRequestCode_Last(requestCode,
				orderByComparator);

		if (tempShipSecurityMessage != null) {
			return tempShipSecurityMessage;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempShipSecurityMessageException(msg.toString());
	}

	/**
	 * Returns the last temp ship security message in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp ship security message, or <code>null</code> if a matching temp ship security message could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipSecurityMessage fetchByRequestCode_Last(String requestCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByRequestCode(requestCode);

		if (count == 0) {
			return null;
		}

		List<TempShipSecurityMessage> list = findByRequestCode(requestCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp ship security messages before and after the current temp ship security message in the ordered set where requestCode = &#63;.
	 *
	 * @param id the primary key of the current temp ship security message
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp ship security message
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempShipSecurityMessageException if a temp ship security message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipSecurityMessage[] findByRequestCode_PrevAndNext(long id,
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempShipSecurityMessageException, SystemException {
		TempShipSecurityMessage tempShipSecurityMessage = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempShipSecurityMessage[] array = new TempShipSecurityMessageImpl[3];

			array[0] = getByRequestCode_PrevAndNext(session,
					tempShipSecurityMessage, requestCode, orderByComparator,
					true);

			array[1] = tempShipSecurityMessage;

			array[2] = getByRequestCode_PrevAndNext(session,
					tempShipSecurityMessage, requestCode, orderByComparator,
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

	protected TempShipSecurityMessage getByRequestCode_PrevAndNext(
		Session session, TempShipSecurityMessage tempShipSecurityMessage,
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

		query.append(_SQL_SELECT_TEMPSHIPSECURITYMESSAGE_WHERE);

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
			query.append(TempShipSecurityMessageModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(tempShipSecurityMessage);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempShipSecurityMessage> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp ship security messages where requestCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByRequestCode(String requestCode)
		throws SystemException {
		for (TempShipSecurityMessage tempShipSecurityMessage : findByRequestCode(
				requestCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tempShipSecurityMessage);
		}
	}

	/**
	 * Returns the number of temp ship security messages where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the number of matching temp ship security messages
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

			query.append(_SQL_COUNT_TEMPSHIPSECURITYMESSAGE_WHERE);

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

	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1 = "tempShipSecurityMessage.requestCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2 = "tempShipSecurityMessage.requestCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3 = "(tempShipSecurityMessage.requestCode IS NULL OR tempShipSecurityMessage.requestCode = '')";

	public TempShipSecurityMessagePersistenceImpl() {
		setModelClass(TempShipSecurityMessage.class);
	}

	/**
	 * Caches the temp ship security message in the entity cache if it is enabled.
	 *
	 * @param tempShipSecurityMessage the temp ship security message
	 */
	@Override
	public void cacheResult(TempShipSecurityMessage tempShipSecurityMessage) {
		EntityCacheUtil.putResult(TempShipSecurityMessageModelImpl.ENTITY_CACHE_ENABLED,
			TempShipSecurityMessageImpl.class,
			tempShipSecurityMessage.getPrimaryKey(), tempShipSecurityMessage);

		tempShipSecurityMessage.resetOriginalValues();
	}

	/**
	 * Caches the temp ship security messages in the entity cache if it is enabled.
	 *
	 * @param tempShipSecurityMessages the temp ship security messages
	 */
	@Override
	public void cacheResult(
		List<TempShipSecurityMessage> tempShipSecurityMessages) {
		for (TempShipSecurityMessage tempShipSecurityMessage : tempShipSecurityMessages) {
			if (EntityCacheUtil.getResult(
						TempShipSecurityMessageModelImpl.ENTITY_CACHE_ENABLED,
						TempShipSecurityMessageImpl.class,
						tempShipSecurityMessage.getPrimaryKey()) == null) {
				cacheResult(tempShipSecurityMessage);
			}
			else {
				tempShipSecurityMessage.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all temp ship security messages.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TempShipSecurityMessageImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TempShipSecurityMessageImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the temp ship security message.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TempShipSecurityMessage tempShipSecurityMessage) {
		EntityCacheUtil.removeResult(TempShipSecurityMessageModelImpl.ENTITY_CACHE_ENABLED,
			TempShipSecurityMessageImpl.class,
			tempShipSecurityMessage.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<TempShipSecurityMessage> tempShipSecurityMessages) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TempShipSecurityMessage tempShipSecurityMessage : tempShipSecurityMessages) {
			EntityCacheUtil.removeResult(TempShipSecurityMessageModelImpl.ENTITY_CACHE_ENABLED,
				TempShipSecurityMessageImpl.class,
				tempShipSecurityMessage.getPrimaryKey());
		}
	}

	/**
	 * Creates a new temp ship security message with the primary key. Does not add the temp ship security message to the database.
	 *
	 * @param id the primary key for the new temp ship security message
	 * @return the new temp ship security message
	 */
	@Override
	public TempShipSecurityMessage create(long id) {
		TempShipSecurityMessage tempShipSecurityMessage = new TempShipSecurityMessageImpl();

		tempShipSecurityMessage.setNew(true);
		tempShipSecurityMessage.setPrimaryKey(id);

		return tempShipSecurityMessage;
	}

	/**
	 * Removes the temp ship security message with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the temp ship security message
	 * @return the temp ship security message that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempShipSecurityMessageException if a temp ship security message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipSecurityMessage remove(long id)
		throws NoSuchTempShipSecurityMessageException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the temp ship security message with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the temp ship security message
	 * @return the temp ship security message that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempShipSecurityMessageException if a temp ship security message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipSecurityMessage remove(Serializable primaryKey)
		throws NoSuchTempShipSecurityMessageException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TempShipSecurityMessage tempShipSecurityMessage = (TempShipSecurityMessage)session.get(TempShipSecurityMessageImpl.class,
					primaryKey);

			if (tempShipSecurityMessage == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTempShipSecurityMessageException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tempShipSecurityMessage);
		}
		catch (NoSuchTempShipSecurityMessageException nsee) {
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
	protected TempShipSecurityMessage removeImpl(
		TempShipSecurityMessage tempShipSecurityMessage)
		throws SystemException {
		tempShipSecurityMessage = toUnwrappedModel(tempShipSecurityMessage);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tempShipSecurityMessage)) {
				tempShipSecurityMessage = (TempShipSecurityMessage)session.get(TempShipSecurityMessageImpl.class,
						tempShipSecurityMessage.getPrimaryKeyObj());
			}

			if (tempShipSecurityMessage != null) {
				session.delete(tempShipSecurityMessage);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tempShipSecurityMessage != null) {
			clearCache(tempShipSecurityMessage);
		}

		return tempShipSecurityMessage;
	}

	@Override
	public TempShipSecurityMessage updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityMessage tempShipSecurityMessage)
		throws SystemException {
		tempShipSecurityMessage = toUnwrappedModel(tempShipSecurityMessage);

		boolean isNew = tempShipSecurityMessage.isNew();

		TempShipSecurityMessageModelImpl tempShipSecurityMessageModelImpl = (TempShipSecurityMessageModelImpl)tempShipSecurityMessage;

		Session session = null;

		try {
			session = openSession();

			if (tempShipSecurityMessage.isNew()) {
				session.save(tempShipSecurityMessage);

				tempShipSecurityMessage.setNew(false);
			}
			else {
				session.merge(tempShipSecurityMessage);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TempShipSecurityMessageModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tempShipSecurityMessageModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempShipSecurityMessageModelImpl.getOriginalDocumentName(),
						tempShipSecurityMessageModelImpl.getOriginalDocumentYear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);

				args = new Object[] {
						tempShipSecurityMessageModelImpl.getDocumentName(),
						tempShipSecurityMessageModelImpl.getDocumentYear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEAR,
					args);
			}

			if ((tempShipSecurityMessageModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempShipSecurityMessageModelImpl.getOriginalDocumentName(),
						tempShipSecurityMessageModelImpl.getOriginalDocumentYear(),
						tempShipSecurityMessageModelImpl.getOriginalRequestState()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);

				args = new Object[] {
						tempShipSecurityMessageModelImpl.getDocumentName(),
						tempShipSecurityMessageModelImpl.getDocumentYear(),
						tempShipSecurityMessageModelImpl.getRequestState()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTNAMEANDDOCUMENTYEARREQUESTSTATE,
					args);
			}

			if ((tempShipSecurityMessageModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempShipSecurityMessageModelImpl.getOriginalRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);

				args = new Object[] {
						tempShipSecurityMessageModelImpl.getRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(TempShipSecurityMessageModelImpl.ENTITY_CACHE_ENABLED,
			TempShipSecurityMessageImpl.class,
			tempShipSecurityMessage.getPrimaryKey(), tempShipSecurityMessage);

		return tempShipSecurityMessage;
	}

	protected TempShipSecurityMessage toUnwrappedModel(
		TempShipSecurityMessage tempShipSecurityMessage) {
		if (tempShipSecurityMessage instanceof TempShipSecurityMessageImpl) {
			return tempShipSecurityMessage;
		}

		TempShipSecurityMessageImpl tempShipSecurityMessageImpl = new TempShipSecurityMessageImpl();

		tempShipSecurityMessageImpl.setNew(tempShipSecurityMessage.isNew());
		tempShipSecurityMessageImpl.setPrimaryKey(tempShipSecurityMessage.getPrimaryKey());

		tempShipSecurityMessageImpl.setId(tempShipSecurityMessage.getId());
		tempShipSecurityMessageImpl.setRequestCode(tempShipSecurityMessage.getRequestCode());
		tempShipSecurityMessageImpl.setRequestState(tempShipSecurityMessage.getRequestState());
		tempShipSecurityMessageImpl.setDocumentYear(tempShipSecurityMessage.getDocumentYear());
		tempShipSecurityMessageImpl.setShipSecurityCode(tempShipSecurityMessage.getShipSecurityCode());
		tempShipSecurityMessageImpl.setDocumentName(tempShipSecurityMessage.getDocumentName());
		tempShipSecurityMessageImpl.setUserCreated(tempShipSecurityMessage.getUserCreated());
		tempShipSecurityMessageImpl.setShipAgencyCode(tempShipSecurityMessage.getShipAgencyCode());
		tempShipSecurityMessageImpl.setNameOfShipAgent(tempShipSecurityMessage.getNameOfShipAgent());
		tempShipSecurityMessageImpl.setShipName(tempShipSecurityMessage.getShipName());
		tempShipSecurityMessageImpl.setShipTypeCode(tempShipSecurityMessage.getShipTypeCode());
		tempShipSecurityMessageImpl.setStateCode(tempShipSecurityMessage.getStateCode());
		tempShipSecurityMessageImpl.setShipCaptain(tempShipSecurityMessage.getShipCaptain());
		tempShipSecurityMessageImpl.setImo(tempShipSecurityMessage.getImo());
		tempShipSecurityMessageImpl.setGrt(tempShipSecurityMessage.getGrt());
		tempShipSecurityMessageImpl.setUnitGRT(tempShipSecurityMessage.getUnitGRT());
		tempShipSecurityMessageImpl.setCrewNumber(tempShipSecurityMessage.getCrewNumber());
		tempShipSecurityMessageImpl.setArrivalDate(tempShipSecurityMessage.getArrivalDate());
		tempShipSecurityMessageImpl.setPurposeCode(tempShipSecurityMessage.getPurposeCode());
		tempShipSecurityMessageImpl.setPurposeSpecified(tempShipSecurityMessage.getPurposeSpecified());
		tempShipSecurityMessageImpl.setPortRegionCode(tempShipSecurityMessage.getPortRegionCode());
		tempShipSecurityMessageImpl.setPortWharfCode(tempShipSecurityMessage.getPortWharfCode());
		tempShipSecurityMessageImpl.setShipAgencyPhone(tempShipSecurityMessage.getShipAgencyPhone());
		tempShipSecurityMessageImpl.setShipAgencyFax(tempShipSecurityMessage.getShipAgencyFax());
		tempShipSecurityMessageImpl.setIsInternationalShipSecurity(tempShipSecurityMessage.getIsInternationalShipSecurity());
		tempShipSecurityMessageImpl.setNameOfISSC(tempShipSecurityMessage.getNameOfISSC());
		tempShipSecurityMessageImpl.setDateOfISSC(tempShipSecurityMessage.getDateOfISSC());
		tempShipSecurityMessageImpl.setDateOfExpiryISSC(tempShipSecurityMessage.getDateOfExpiryISSC());
		tempShipSecurityMessageImpl.setSecurityLevelCode(tempShipSecurityMessage.getSecurityLevelCode());
		tempShipSecurityMessageImpl.setSecurityFromDate(tempShipSecurityMessage.getSecurityFromDate());
		tempShipSecurityMessageImpl.setIsAdditionalSecurityMeasures(tempShipSecurityMessage.getIsAdditionalSecurityMeasures());
		tempShipSecurityMessageImpl.setAdditionalSecurityDetail(tempShipSecurityMessage.getAdditionalSecurityDetail());
		tempShipSecurityMessageImpl.setIsMaintainSecurity(tempShipSecurityMessage.getIsMaintainSecurity());
		tempShipSecurityMessageImpl.setMaintainSecurityDetail(tempShipSecurityMessage.getMaintainSecurityDetail());
		tempShipSecurityMessageImpl.setLatitude(tempShipSecurityMessage.getLatitude());
		tempShipSecurityMessageImpl.setLongitude(tempShipSecurityMessage.getLongitude());
		tempShipSecurityMessageImpl.setHasShipSecurityPortItems(tempShipSecurityMessage.getHasShipSecurityPortItems());
		tempShipSecurityMessageImpl.setSignPlace(tempShipSecurityMessage.getSignPlace());
		tempShipSecurityMessageImpl.setSignDate(tempShipSecurityMessage.getSignDate());
		tempShipSecurityMessageImpl.setMasterSigned(tempShipSecurityMessage.getMasterSigned());
		tempShipSecurityMessageImpl.setMasterSignedImage(tempShipSecurityMessage.getMasterSignedImage());
		tempShipSecurityMessageImpl.setCallSign(tempShipSecurityMessage.getCallSign());
		tempShipSecurityMessageImpl.setArrivalPortCode(tempShipSecurityMessage.getArrivalPortCode());
		tempShipSecurityMessageImpl.setPortHarbourCode(tempShipSecurityMessage.getPortHarbourCode());

		return tempShipSecurityMessageImpl;
	}

	/**
	 * Returns the temp ship security message with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp ship security message
	 * @return the temp ship security message
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempShipSecurityMessageException if a temp ship security message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipSecurityMessage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTempShipSecurityMessageException, SystemException {
		TempShipSecurityMessage tempShipSecurityMessage = fetchByPrimaryKey(primaryKey);

		if (tempShipSecurityMessage == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTempShipSecurityMessageException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tempShipSecurityMessage;
	}

	/**
	 * Returns the temp ship security message with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchTempShipSecurityMessageException} if it could not be found.
	 *
	 * @param id the primary key of the temp ship security message
	 * @return the temp ship security message
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempShipSecurityMessageException if a temp ship security message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipSecurityMessage findByPrimaryKey(long id)
		throws NoSuchTempShipSecurityMessageException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the temp ship security message with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp ship security message
	 * @return the temp ship security message, or <code>null</code> if a temp ship security message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipSecurityMessage fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TempShipSecurityMessage tempShipSecurityMessage = (TempShipSecurityMessage)EntityCacheUtil.getResult(TempShipSecurityMessageModelImpl.ENTITY_CACHE_ENABLED,
				TempShipSecurityMessageImpl.class, primaryKey);

		if (tempShipSecurityMessage == _nullTempShipSecurityMessage) {
			return null;
		}

		if (tempShipSecurityMessage == null) {
			Session session = null;

			try {
				session = openSession();

				tempShipSecurityMessage = (TempShipSecurityMessage)session.get(TempShipSecurityMessageImpl.class,
						primaryKey);

				if (tempShipSecurityMessage != null) {
					cacheResult(tempShipSecurityMessage);
				}
				else {
					EntityCacheUtil.putResult(TempShipSecurityMessageModelImpl.ENTITY_CACHE_ENABLED,
						TempShipSecurityMessageImpl.class, primaryKey,
						_nullTempShipSecurityMessage);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TempShipSecurityMessageModelImpl.ENTITY_CACHE_ENABLED,
					TempShipSecurityMessageImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tempShipSecurityMessage;
	}

	/**
	 * Returns the temp ship security message with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the temp ship security message
	 * @return the temp ship security message, or <code>null</code> if a temp ship security message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempShipSecurityMessage fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the temp ship security messages.
	 *
	 * @return the temp ship security messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempShipSecurityMessage> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp ship security messages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempShipSecurityMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp ship security messages
	 * @param end the upper bound of the range of temp ship security messages (not inclusive)
	 * @return the range of temp ship security messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempShipSecurityMessage> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp ship security messages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempShipSecurityMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp ship security messages
	 * @param end the upper bound of the range of temp ship security messages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of temp ship security messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempShipSecurityMessage> findAll(int start, int end,
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

		List<TempShipSecurityMessage> list = (List<TempShipSecurityMessage>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TEMPSHIPSECURITYMESSAGE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TEMPSHIPSECURITYMESSAGE;

				if (pagination) {
					sql = sql.concat(TempShipSecurityMessageModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TempShipSecurityMessage>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempShipSecurityMessage>(list);
				}
				else {
					list = (List<TempShipSecurityMessage>)QueryUtil.list(q,
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
	 * Removes all the temp ship security messages from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TempShipSecurityMessage tempShipSecurityMessage : findAll()) {
			remove(tempShipSecurityMessage);
		}
	}

	/**
	 * Returns the number of temp ship security messages.
	 *
	 * @return the number of temp ship security messages
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

				Query q = session.createQuery(_SQL_COUNT_TEMPSHIPSECURITYMESSAGE);

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
	 * Initializes the temp ship security message persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityMessage")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TempShipSecurityMessage>> listenersList = new ArrayList<ModelListener<TempShipSecurityMessage>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TempShipSecurityMessage>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TempShipSecurityMessageImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TEMPSHIPSECURITYMESSAGE = "SELECT tempShipSecurityMessage FROM TempShipSecurityMessage tempShipSecurityMessage";
	private static final String _SQL_SELECT_TEMPSHIPSECURITYMESSAGE_WHERE = "SELECT tempShipSecurityMessage FROM TempShipSecurityMessage tempShipSecurityMessage WHERE ";
	private static final String _SQL_COUNT_TEMPSHIPSECURITYMESSAGE = "SELECT COUNT(tempShipSecurityMessage) FROM TempShipSecurityMessage tempShipSecurityMessage";
	private static final String _SQL_COUNT_TEMPSHIPSECURITYMESSAGE_WHERE = "SELECT COUNT(tempShipSecurityMessage) FROM TempShipSecurityMessage tempShipSecurityMessage WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tempShipSecurityMessage.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TempShipSecurityMessage exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TempShipSecurityMessage exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TempShipSecurityMessagePersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "requestCode", "requestState", "documentYear",
				"shipSecurityCode", "documentName", "userCreated",
				"shipAgencyCode", "nameOfShipAgent", "shipName", "shipTypeCode",
				"stateCode", "shipCaptain", "imo", "grt", "unitGRT",
				"crewNumber", "arrivalDate", "purposeCode", "purposeSpecified",
				"portRegionCode", "portWharfCode", "shipAgencyPhone",
				"shipAgencyFax", "isInternationalShipSecurity", "nameOfISSC",
				"dateOfISSC", "dateOfExpiryISSC", "securityLevelCode",
				"securityFromDate", "isAdditionalSecurityMeasures",
				"additionalSecurityDetail", "isMaintainSecurity",
				"maintainSecurityDetail", "latitude", "longitude",
				"hasShipSecurityPortItems", "signPlace", "signDate",
				"masterSigned", "masterSignedImage", "callSign",
				"arrivalPortCode", "portHarbourCode"
			});
	private static TempShipSecurityMessage _nullTempShipSecurityMessage = new TempShipSecurityMessageImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TempShipSecurityMessage> toCacheModel() {
				return _nullTempShipSecurityMessageCacheModel;
			}
		};

	private static CacheModel<TempShipSecurityMessage> _nullTempShipSecurityMessageCacheModel =
		new CacheModel<TempShipSecurityMessage>() {
			@Override
			public TempShipSecurityMessage toEntityModel() {
				return _nullTempShipSecurityMessage;
			}
		};
}