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

import vn.dtt.duongbien.dao.vrcb.NoSuchTempHealthQuestionException;
import vn.dtt.duongbien.dao.vrcb.model.TempHealthQuestion;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempHealthQuestionImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.TempHealthQuestionModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the temp health question service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see TempHealthQuestionPersistence
 * @see TempHealthQuestionUtil
 * @generated
 */
public class TempHealthQuestionPersistenceImpl extends BasePersistenceImpl<TempHealthQuestion>
	implements TempHealthQuestionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TempHealthQuestionUtil} to access the temp health question persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TempHealthQuestionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TempHealthQuestionModelImpl.ENTITY_CACHE_ENABLED,
			TempHealthQuestionModelImpl.FINDER_CACHE_ENABLED,
			TempHealthQuestionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TempHealthQuestionModelImpl.ENTITY_CACHE_ENABLED,
			TempHealthQuestionModelImpl.FINDER_CACHE_ENABLED,
			TempHealthQuestionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TempHealthQuestionModelImpl.ENTITY_CACHE_ENABLED,
			TempHealthQuestionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempHealthQuestionModelImpl.ENTITY_CACHE_ENABLED,
			TempHealthQuestionModelImpl.FINDER_CACHE_ENABLED,
			TempHealthQuestionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRequestCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE =
		new FinderPath(TempHealthQuestionModelImpl.ENTITY_CACHE_ENABLED,
			TempHealthQuestionModelImpl.FINDER_CACHE_ENABLED,
			TempHealthQuestionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRequestCode",
			new String[] { String.class.getName() },
			TempHealthQuestionModelImpl.REQUESTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REQUESTCODE = new FinderPath(TempHealthQuestionModelImpl.ENTITY_CACHE_ENABLED,
			TempHealthQuestionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRequestCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the temp health questions where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the matching temp health questions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempHealthQuestion> findByRequestCode(String requestCode)
		throws SystemException {
		return findByRequestCode(requestCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp health questions where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempHealthQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp health questions
	 * @param end the upper bound of the range of temp health questions (not inclusive)
	 * @return the range of matching temp health questions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempHealthQuestion> findByRequestCode(String requestCode,
		int start, int end) throws SystemException {
		return findByRequestCode(requestCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp health questions where requestCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempHealthQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param requestCode the request code
	 * @param start the lower bound of the range of temp health questions
	 * @param end the upper bound of the range of temp health questions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching temp health questions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempHealthQuestion> findByRequestCode(String requestCode,
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

		List<TempHealthQuestion> list = (List<TempHealthQuestion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TempHealthQuestion tempHealthQuestion : list) {
				if (!Validator.equals(requestCode,
							tempHealthQuestion.getRequestCode())) {
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

			query.append(_SQL_SELECT_TEMPHEALTHQUESTION_WHERE);

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
				query.append(TempHealthQuestionModelImpl.ORDER_BY_JPQL);
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
					list = (List<TempHealthQuestion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempHealthQuestion>(list);
				}
				else {
					list = (List<TempHealthQuestion>)QueryUtil.list(q,
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
	 * Returns the first temp health question in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp health question
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempHealthQuestionException if a matching temp health question could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempHealthQuestion findByRequestCode_First(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempHealthQuestionException, SystemException {
		TempHealthQuestion tempHealthQuestion = fetchByRequestCode_First(requestCode,
				orderByComparator);

		if (tempHealthQuestion != null) {
			return tempHealthQuestion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempHealthQuestionException(msg.toString());
	}

	/**
	 * Returns the first temp health question in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching temp health question, or <code>null</code> if a matching temp health question could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempHealthQuestion fetchByRequestCode_First(String requestCode,
		OrderByComparator orderByComparator) throws SystemException {
		List<TempHealthQuestion> list = findByRequestCode(requestCode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last temp health question in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp health question
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempHealthQuestionException if a matching temp health question could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempHealthQuestion findByRequestCode_Last(String requestCode,
		OrderByComparator orderByComparator)
		throws NoSuchTempHealthQuestionException, SystemException {
		TempHealthQuestion tempHealthQuestion = fetchByRequestCode_Last(requestCode,
				orderByComparator);

		if (tempHealthQuestion != null) {
			return tempHealthQuestion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("requestCode=");
		msg.append(requestCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTempHealthQuestionException(msg.toString());
	}

	/**
	 * Returns the last temp health question in the ordered set where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching temp health question, or <code>null</code> if a matching temp health question could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempHealthQuestion fetchByRequestCode_Last(String requestCode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByRequestCode(requestCode);

		if (count == 0) {
			return null;
		}

		List<TempHealthQuestion> list = findByRequestCode(requestCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the temp health questions before and after the current temp health question in the ordered set where requestCode = &#63;.
	 *
	 * @param id the primary key of the current temp health question
	 * @param requestCode the request code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next temp health question
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempHealthQuestionException if a temp health question with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempHealthQuestion[] findByRequestCode_PrevAndNext(long id,
		String requestCode, OrderByComparator orderByComparator)
		throws NoSuchTempHealthQuestionException, SystemException {
		TempHealthQuestion tempHealthQuestion = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TempHealthQuestion[] array = new TempHealthQuestionImpl[3];

			array[0] = getByRequestCode_PrevAndNext(session,
					tempHealthQuestion, requestCode, orderByComparator, true);

			array[1] = tempHealthQuestion;

			array[2] = getByRequestCode_PrevAndNext(session,
					tempHealthQuestion, requestCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TempHealthQuestion getByRequestCode_PrevAndNext(Session session,
		TempHealthQuestion tempHealthQuestion, String requestCode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TEMPHEALTHQUESTION_WHERE);

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
			query.append(TempHealthQuestionModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(tempHealthQuestion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TempHealthQuestion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the temp health questions where requestCode = &#63; from the database.
	 *
	 * @param requestCode the request code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByRequestCode(String requestCode)
		throws SystemException {
		for (TempHealthQuestion tempHealthQuestion : findByRequestCode(
				requestCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(tempHealthQuestion);
		}
	}

	/**
	 * Returns the number of temp health questions where requestCode = &#63;.
	 *
	 * @param requestCode the request code
	 * @return the number of matching temp health questions
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

			query.append(_SQL_COUNT_TEMPHEALTHQUESTION_WHERE);

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

	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_1 = "tempHealthQuestion.requestCode IS NULL";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_2 = "tempHealthQuestion.requestCode = ?";
	private static final String _FINDER_COLUMN_REQUESTCODE_REQUESTCODE_3 = "(tempHealthQuestion.requestCode IS NULL OR tempHealthQuestion.requestCode = '')";

	public TempHealthQuestionPersistenceImpl() {
		setModelClass(TempHealthQuestion.class);
	}

	/**
	 * Caches the temp health question in the entity cache if it is enabled.
	 *
	 * @param tempHealthQuestion the temp health question
	 */
	@Override
	public void cacheResult(TempHealthQuestion tempHealthQuestion) {
		EntityCacheUtil.putResult(TempHealthQuestionModelImpl.ENTITY_CACHE_ENABLED,
			TempHealthQuestionImpl.class, tempHealthQuestion.getPrimaryKey(),
			tempHealthQuestion);

		tempHealthQuestion.resetOriginalValues();
	}

	/**
	 * Caches the temp health questions in the entity cache if it is enabled.
	 *
	 * @param tempHealthQuestions the temp health questions
	 */
	@Override
	public void cacheResult(List<TempHealthQuestion> tempHealthQuestions) {
		for (TempHealthQuestion tempHealthQuestion : tempHealthQuestions) {
			if (EntityCacheUtil.getResult(
						TempHealthQuestionModelImpl.ENTITY_CACHE_ENABLED,
						TempHealthQuestionImpl.class,
						tempHealthQuestion.getPrimaryKey()) == null) {
				cacheResult(tempHealthQuestion);
			}
			else {
				tempHealthQuestion.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all temp health questions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TempHealthQuestionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TempHealthQuestionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the temp health question.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TempHealthQuestion tempHealthQuestion) {
		EntityCacheUtil.removeResult(TempHealthQuestionModelImpl.ENTITY_CACHE_ENABLED,
			TempHealthQuestionImpl.class, tempHealthQuestion.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TempHealthQuestion> tempHealthQuestions) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TempHealthQuestion tempHealthQuestion : tempHealthQuestions) {
			EntityCacheUtil.removeResult(TempHealthQuestionModelImpl.ENTITY_CACHE_ENABLED,
				TempHealthQuestionImpl.class, tempHealthQuestion.getPrimaryKey());
		}
	}

	/**
	 * Creates a new temp health question with the primary key. Does not add the temp health question to the database.
	 *
	 * @param id the primary key for the new temp health question
	 * @return the new temp health question
	 */
	@Override
	public TempHealthQuestion create(long id) {
		TempHealthQuestion tempHealthQuestion = new TempHealthQuestionImpl();

		tempHealthQuestion.setNew(true);
		tempHealthQuestion.setPrimaryKey(id);

		return tempHealthQuestion;
	}

	/**
	 * Removes the temp health question with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the temp health question
	 * @return the temp health question that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempHealthQuestionException if a temp health question with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempHealthQuestion remove(long id)
		throws NoSuchTempHealthQuestionException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the temp health question with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the temp health question
	 * @return the temp health question that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempHealthQuestionException if a temp health question with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempHealthQuestion remove(Serializable primaryKey)
		throws NoSuchTempHealthQuestionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TempHealthQuestion tempHealthQuestion = (TempHealthQuestion)session.get(TempHealthQuestionImpl.class,
					primaryKey);

			if (tempHealthQuestion == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTempHealthQuestionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tempHealthQuestion);
		}
		catch (NoSuchTempHealthQuestionException nsee) {
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
	protected TempHealthQuestion removeImpl(
		TempHealthQuestion tempHealthQuestion) throws SystemException {
		tempHealthQuestion = toUnwrappedModel(tempHealthQuestion);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tempHealthQuestion)) {
				tempHealthQuestion = (TempHealthQuestion)session.get(TempHealthQuestionImpl.class,
						tempHealthQuestion.getPrimaryKeyObj());
			}

			if (tempHealthQuestion != null) {
				session.delete(tempHealthQuestion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tempHealthQuestion != null) {
			clearCache(tempHealthQuestion);
		}

		return tempHealthQuestion;
	}

	@Override
	public TempHealthQuestion updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.TempHealthQuestion tempHealthQuestion)
		throws SystemException {
		tempHealthQuestion = toUnwrappedModel(tempHealthQuestion);

		boolean isNew = tempHealthQuestion.isNew();

		TempHealthQuestionModelImpl tempHealthQuestionModelImpl = (TempHealthQuestionModelImpl)tempHealthQuestion;

		Session session = null;

		try {
			session = openSession();

			if (tempHealthQuestion.isNew()) {
				session.save(tempHealthQuestion);

				tempHealthQuestion.setNew(false);
			}
			else {
				session.merge(tempHealthQuestion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TempHealthQuestionModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((tempHealthQuestionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						tempHealthQuestionModelImpl.getOriginalRequestCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);

				args = new Object[] { tempHealthQuestionModelImpl.getRequestCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REQUESTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REQUESTCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(TempHealthQuestionModelImpl.ENTITY_CACHE_ENABLED,
			TempHealthQuestionImpl.class, tempHealthQuestion.getPrimaryKey(),
			tempHealthQuestion);

		return tempHealthQuestion;
	}

	protected TempHealthQuestion toUnwrappedModel(
		TempHealthQuestion tempHealthQuestion) {
		if (tempHealthQuestion instanceof TempHealthQuestionImpl) {
			return tempHealthQuestion;
		}

		TempHealthQuestionImpl tempHealthQuestionImpl = new TempHealthQuestionImpl();

		tempHealthQuestionImpl.setNew(tempHealthQuestion.isNew());
		tempHealthQuestionImpl.setPrimaryKey(tempHealthQuestion.getPrimaryKey());

		tempHealthQuestionImpl.setId(tempHealthQuestion.getId());
		tempHealthQuestionImpl.setRequestCode(tempHealthQuestion.getRequestCode());
		tempHealthQuestionImpl.setHealthQuestionCode(tempHealthQuestion.getHealthQuestionCode());
		tempHealthQuestionImpl.setPersonDied(tempHealthQuestion.getPersonDied());
		tempHealthQuestionImpl.setPersonDiedNo(tempHealthQuestion.getPersonDiedNo());
		tempHealthQuestionImpl.setPersonDiedReport(tempHealthQuestion.getPersonDiedReport());
		tempHealthQuestionImpl.setIsinfectious(tempHealthQuestion.getIsinfectious());
		tempHealthQuestionImpl.setInfectiousReport(tempHealthQuestion.getInfectiousReport());
		tempHealthQuestionImpl.setIllPassengersGreaterNomal(tempHealthQuestion.getIllPassengersGreaterNomal());
		tempHealthQuestionImpl.setIllPassengersNo(tempHealthQuestion.getIllPassengersNo());
		tempHealthQuestionImpl.setIllPersonsOnBoard(tempHealthQuestion.getIllPersonsOnBoard());
		tempHealthQuestionImpl.setIllPersonsReport(tempHealthQuestion.getIllPersonsReport());
		tempHealthQuestionImpl.setMedicalPractitionerConsulted(tempHealthQuestion.getMedicalPractitionerConsulted());
		tempHealthQuestionImpl.setMedicalTreatmentOrAdvice(tempHealthQuestion.getMedicalTreatmentOrAdvice());
		tempHealthQuestionImpl.setInfectionOrSpreadOfDisease(tempHealthQuestion.getInfectionOrSpreadOfDisease());
		tempHealthQuestionImpl.setInfectionsReport(tempHealthQuestion.getInfectionsReport());
		tempHealthQuestionImpl.setIsSanitary(tempHealthQuestion.getIsSanitary());
		tempHealthQuestionImpl.setSanitaryDes(tempHealthQuestion.getSanitaryDes());
		tempHealthQuestionImpl.setIsStowaways(tempHealthQuestion.getIsStowaways());
		tempHealthQuestionImpl.setJoinShip(tempHealthQuestion.getJoinShip());
		tempHealthQuestionImpl.setIsAnimal(tempHealthQuestion.getIsAnimal());

		return tempHealthQuestionImpl;
	}

	/**
	 * Returns the temp health question with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp health question
	 * @return the temp health question
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempHealthQuestionException if a temp health question with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempHealthQuestion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTempHealthQuestionException, SystemException {
		TempHealthQuestion tempHealthQuestion = fetchByPrimaryKey(primaryKey);

		if (tempHealthQuestion == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTempHealthQuestionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tempHealthQuestion;
	}

	/**
	 * Returns the temp health question with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchTempHealthQuestionException} if it could not be found.
	 *
	 * @param id the primary key of the temp health question
	 * @return the temp health question
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempHealthQuestionException if a temp health question with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempHealthQuestion findByPrimaryKey(long id)
		throws NoSuchTempHealthQuestionException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the temp health question with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the temp health question
	 * @return the temp health question, or <code>null</code> if a temp health question with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempHealthQuestion fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TempHealthQuestion tempHealthQuestion = (TempHealthQuestion)EntityCacheUtil.getResult(TempHealthQuestionModelImpl.ENTITY_CACHE_ENABLED,
				TempHealthQuestionImpl.class, primaryKey);

		if (tempHealthQuestion == _nullTempHealthQuestion) {
			return null;
		}

		if (tempHealthQuestion == null) {
			Session session = null;

			try {
				session = openSession();

				tempHealthQuestion = (TempHealthQuestion)session.get(TempHealthQuestionImpl.class,
						primaryKey);

				if (tempHealthQuestion != null) {
					cacheResult(tempHealthQuestion);
				}
				else {
					EntityCacheUtil.putResult(TempHealthQuestionModelImpl.ENTITY_CACHE_ENABLED,
						TempHealthQuestionImpl.class, primaryKey,
						_nullTempHealthQuestion);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TempHealthQuestionModelImpl.ENTITY_CACHE_ENABLED,
					TempHealthQuestionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tempHealthQuestion;
	}

	/**
	 * Returns the temp health question with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the temp health question
	 * @return the temp health question, or <code>null</code> if a temp health question with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempHealthQuestion fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the temp health questions.
	 *
	 * @return the temp health questions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempHealthQuestion> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the temp health questions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempHealthQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp health questions
	 * @param end the upper bound of the range of temp health questions (not inclusive)
	 * @return the range of temp health questions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempHealthQuestion> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the temp health questions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempHealthQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp health questions
	 * @param end the upper bound of the range of temp health questions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of temp health questions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempHealthQuestion> findAll(int start, int end,
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

		List<TempHealthQuestion> list = (List<TempHealthQuestion>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TEMPHEALTHQUESTION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TEMPHEALTHQUESTION;

				if (pagination) {
					sql = sql.concat(TempHealthQuestionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TempHealthQuestion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TempHealthQuestion>(list);
				}
				else {
					list = (List<TempHealthQuestion>)QueryUtil.list(q,
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
	 * Removes all the temp health questions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TempHealthQuestion tempHealthQuestion : findAll()) {
			remove(tempHealthQuestion);
		}
	}

	/**
	 * Returns the number of temp health questions.
	 *
	 * @return the number of temp health questions
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

				Query q = session.createQuery(_SQL_COUNT_TEMPHEALTHQUESTION);

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
	 * Initializes the temp health question persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.TempHealthQuestion")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TempHealthQuestion>> listenersList = new ArrayList<ModelListener<TempHealthQuestion>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TempHealthQuestion>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TempHealthQuestionImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TEMPHEALTHQUESTION = "SELECT tempHealthQuestion FROM TempHealthQuestion tempHealthQuestion";
	private static final String _SQL_SELECT_TEMPHEALTHQUESTION_WHERE = "SELECT tempHealthQuestion FROM TempHealthQuestion tempHealthQuestion WHERE ";
	private static final String _SQL_COUNT_TEMPHEALTHQUESTION = "SELECT COUNT(tempHealthQuestion) FROM TempHealthQuestion tempHealthQuestion";
	private static final String _SQL_COUNT_TEMPHEALTHQUESTION_WHERE = "SELECT COUNT(tempHealthQuestion) FROM TempHealthQuestion tempHealthQuestion WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tempHealthQuestion.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TempHealthQuestion exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TempHealthQuestion exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TempHealthQuestionPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "requestCode", "healthQuestionCode", "personDied",
				"personDiedNo", "personDiedReport", "isinfectious",
				"infectiousReport", "illPassengersGreaterNomal",
				"illPassengersNo", "illPersonsOnBoard", "illPersonsReport",
				"medicalPractitionerConsulted", "medicalTreatmentOrAdvice",
				"infectionOrSpreadOfDisease", "infectionsReport", "isSanitary",
				"sanitaryDes", "isStowaways", "joinShip", "isAnimal"
			});
	private static TempHealthQuestion _nullTempHealthQuestion = new TempHealthQuestionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TempHealthQuestion> toCacheModel() {
				return _nullTempHealthQuestionCacheModel;
			}
		};

	private static CacheModel<TempHealthQuestion> _nullTempHealthQuestionCacheModel =
		new CacheModel<TempHealthQuestion>() {
			@Override
			public TempHealthQuestion toEntityModel() {
				return _nullTempHealthQuestion;
			}
		};
}