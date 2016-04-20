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
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException;
import vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee;
import vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtEmployeeImpl;
import vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtEmployeeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the o e p user mgt employee service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see OEPUserMgtEmployeePersistence
 * @see OEPUserMgtEmployeeUtil
 * @generated
 */
public class OEPUserMgtEmployeePersistenceImpl extends BasePersistenceImpl<OEPUserMgtEmployee>
	implements OEPUserMgtEmployeePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link OEPUserMgtEmployeeUtil} to access the o e p user mgt employee persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = OEPUserMgtEmployeeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(OEPUserMgtEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtEmployeeModelImpl.FINDER_CACHE_ENABLED,
			OEPUserMgtEmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(OEPUserMgtEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtEmployeeModelImpl.FINDER_CACHE_ENABLED,
			OEPUserMgtEmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(OEPUserMgtEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtEmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_F_WORKINGUNITID =
		new FinderPath(OEPUserMgtEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtEmployeeModelImpl.FINDER_CACHE_ENABLED,
			OEPUserMgtEmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByF_workingUnitId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_WORKINGUNITID =
		new FinderPath(OEPUserMgtEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtEmployeeModelImpl.FINDER_CACHE_ENABLED,
			OEPUserMgtEmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByF_workingUnitId",
			new String[] { Long.class.getName() },
			OEPUserMgtEmployeeModelImpl.WORKINGUNITID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_WORKINGUNITID = new FinderPath(OEPUserMgtEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtEmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByF_workingUnitId", new String[] { Long.class.getName() });

	/**
	 * Returns all the o e p user mgt employees where workingUnitId = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @return the matching o e p user mgt employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OEPUserMgtEmployee> findByF_workingUnitId(long workingUnitId)
		throws SystemException {
		return findByF_workingUnitId(workingUnitId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the o e p user mgt employees where workingUnitId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param workingUnitId the working unit ID
	 * @param start the lower bound of the range of o e p user mgt employees
	 * @param end the upper bound of the range of o e p user mgt employees (not inclusive)
	 * @return the range of matching o e p user mgt employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OEPUserMgtEmployee> findByF_workingUnitId(long workingUnitId,
		int start, int end) throws SystemException {
		return findByF_workingUnitId(workingUnitId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the o e p user mgt employees where workingUnitId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param workingUnitId the working unit ID
	 * @param start the lower bound of the range of o e p user mgt employees
	 * @param end the upper bound of the range of o e p user mgt employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching o e p user mgt employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OEPUserMgtEmployee> findByF_workingUnitId(long workingUnitId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_WORKINGUNITID;
			finderArgs = new Object[] { workingUnitId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_F_WORKINGUNITID;
			finderArgs = new Object[] {
					workingUnitId,
					
					start, end, orderByComparator
				};
		}

		List<OEPUserMgtEmployee> list = (List<OEPUserMgtEmployee>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (OEPUserMgtEmployee oepUserMgtEmployee : list) {
				if ((workingUnitId != oepUserMgtEmployee.getWorkingUnitId())) {
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

			query.append(_SQL_SELECT_OEPUSERMGTEMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_F_WORKINGUNITID_WORKINGUNITID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(OEPUserMgtEmployeeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(workingUnitId);

				if (!pagination) {
					list = (List<OEPUserMgtEmployee>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<OEPUserMgtEmployee>(list);
				}
				else {
					list = (List<OEPUserMgtEmployee>)QueryUtil.list(q,
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
	 * Returns the first o e p user mgt employee in the ordered set where workingUnitId = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching o e p user mgt employee
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException if a matching o e p user mgt employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtEmployee findByF_workingUnitId_First(long workingUnitId,
		OrderByComparator orderByComparator)
		throws NoSuchOEPUserMgtEmployeeException, SystemException {
		OEPUserMgtEmployee oepUserMgtEmployee = fetchByF_workingUnitId_First(workingUnitId,
				orderByComparator);

		if (oepUserMgtEmployee != null) {
			return oepUserMgtEmployee;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("workingUnitId=");
		msg.append(workingUnitId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOEPUserMgtEmployeeException(msg.toString());
	}

	/**
	 * Returns the first o e p user mgt employee in the ordered set where workingUnitId = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching o e p user mgt employee, or <code>null</code> if a matching o e p user mgt employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtEmployee fetchByF_workingUnitId_First(long workingUnitId,
		OrderByComparator orderByComparator) throws SystemException {
		List<OEPUserMgtEmployee> list = findByF_workingUnitId(workingUnitId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last o e p user mgt employee in the ordered set where workingUnitId = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching o e p user mgt employee
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException if a matching o e p user mgt employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtEmployee findByF_workingUnitId_Last(long workingUnitId,
		OrderByComparator orderByComparator)
		throws NoSuchOEPUserMgtEmployeeException, SystemException {
		OEPUserMgtEmployee oepUserMgtEmployee = fetchByF_workingUnitId_Last(workingUnitId,
				orderByComparator);

		if (oepUserMgtEmployee != null) {
			return oepUserMgtEmployee;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("workingUnitId=");
		msg.append(workingUnitId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOEPUserMgtEmployeeException(msg.toString());
	}

	/**
	 * Returns the last o e p user mgt employee in the ordered set where workingUnitId = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching o e p user mgt employee, or <code>null</code> if a matching o e p user mgt employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtEmployee fetchByF_workingUnitId_Last(long workingUnitId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByF_workingUnitId(workingUnitId);

		if (count == 0) {
			return null;
		}

		List<OEPUserMgtEmployee> list = findByF_workingUnitId(workingUnitId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the o e p user mgt employees before and after the current o e p user mgt employee in the ordered set where workingUnitId = &#63;.
	 *
	 * @param employeeId the primary key of the current o e p user mgt employee
	 * @param workingUnitId the working unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next o e p user mgt employee
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException if a o e p user mgt employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtEmployee[] findByF_workingUnitId_PrevAndNext(
		long employeeId, long workingUnitId, OrderByComparator orderByComparator)
		throws NoSuchOEPUserMgtEmployeeException, SystemException {
		OEPUserMgtEmployee oepUserMgtEmployee = findByPrimaryKey(employeeId);

		Session session = null;

		try {
			session = openSession();

			OEPUserMgtEmployee[] array = new OEPUserMgtEmployeeImpl[3];

			array[0] = getByF_workingUnitId_PrevAndNext(session,
					oepUserMgtEmployee, workingUnitId, orderByComparator, true);

			array[1] = oepUserMgtEmployee;

			array[2] = getByF_workingUnitId_PrevAndNext(session,
					oepUserMgtEmployee, workingUnitId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected OEPUserMgtEmployee getByF_workingUnitId_PrevAndNext(
		Session session, OEPUserMgtEmployee oepUserMgtEmployee,
		long workingUnitId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_OEPUSERMGTEMPLOYEE_WHERE);

		query.append(_FINDER_COLUMN_F_WORKINGUNITID_WORKINGUNITID_2);

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
			query.append(OEPUserMgtEmployeeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(workingUnitId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(oepUserMgtEmployee);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<OEPUserMgtEmployee> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the o e p user mgt employees where workingUnitId = &#63; from the database.
	 *
	 * @param workingUnitId the working unit ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByF_workingUnitId(long workingUnitId)
		throws SystemException {
		for (OEPUserMgtEmployee oepUserMgtEmployee : findByF_workingUnitId(
				workingUnitId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(oepUserMgtEmployee);
		}
	}

	/**
	 * Returns the number of o e p user mgt employees where workingUnitId = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @return the number of matching o e p user mgt employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByF_workingUnitId(long workingUnitId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_WORKINGUNITID;

		Object[] finderArgs = new Object[] { workingUnitId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_OEPUSERMGTEMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_F_WORKINGUNITID_WORKINGUNITID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(workingUnitId);

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

	private static final String _FINDER_COLUMN_F_WORKINGUNITID_WORKINGUNITID_2 = "oepUserMgtEmployee.workingUnitId = ? AND  oepUserMgtEmployee.mappingUserId > 0 ";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_WORKINGUNITID =
		new FinderPath(OEPUserMgtEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtEmployeeModelImpl.FINDER_CACHE_ENABLED,
			OEPUserMgtEmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByworkingUnitId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WORKINGUNITID =
		new FinderPath(OEPUserMgtEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtEmployeeModelImpl.FINDER_CACHE_ENABLED,
			OEPUserMgtEmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByworkingUnitId",
			new String[] { Long.class.getName() },
			OEPUserMgtEmployeeModelImpl.WORKINGUNITID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_WORKINGUNITID = new FinderPath(OEPUserMgtEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtEmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByworkingUnitId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the o e p user mgt employees where workingUnitId = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @return the matching o e p user mgt employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OEPUserMgtEmployee> findByworkingUnitId(long workingUnitId)
		throws SystemException {
		return findByworkingUnitId(workingUnitId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the o e p user mgt employees where workingUnitId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param workingUnitId the working unit ID
	 * @param start the lower bound of the range of o e p user mgt employees
	 * @param end the upper bound of the range of o e p user mgt employees (not inclusive)
	 * @return the range of matching o e p user mgt employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OEPUserMgtEmployee> findByworkingUnitId(long workingUnitId,
		int start, int end) throws SystemException {
		return findByworkingUnitId(workingUnitId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the o e p user mgt employees where workingUnitId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param workingUnitId the working unit ID
	 * @param start the lower bound of the range of o e p user mgt employees
	 * @param end the upper bound of the range of o e p user mgt employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching o e p user mgt employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OEPUserMgtEmployee> findByworkingUnitId(long workingUnitId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WORKINGUNITID;
			finderArgs = new Object[] { workingUnitId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_WORKINGUNITID;
			finderArgs = new Object[] {
					workingUnitId,
					
					start, end, orderByComparator
				};
		}

		List<OEPUserMgtEmployee> list = (List<OEPUserMgtEmployee>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (OEPUserMgtEmployee oepUserMgtEmployee : list) {
				if ((workingUnitId != oepUserMgtEmployee.getWorkingUnitId())) {
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

			query.append(_SQL_SELECT_OEPUSERMGTEMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_WORKINGUNITID_WORKINGUNITID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(OEPUserMgtEmployeeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(workingUnitId);

				if (!pagination) {
					list = (List<OEPUserMgtEmployee>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<OEPUserMgtEmployee>(list);
				}
				else {
					list = (List<OEPUserMgtEmployee>)QueryUtil.list(q,
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
	 * Returns the first o e p user mgt employee in the ordered set where workingUnitId = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching o e p user mgt employee
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException if a matching o e p user mgt employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtEmployee findByworkingUnitId_First(long workingUnitId,
		OrderByComparator orderByComparator)
		throws NoSuchOEPUserMgtEmployeeException, SystemException {
		OEPUserMgtEmployee oepUserMgtEmployee = fetchByworkingUnitId_First(workingUnitId,
				orderByComparator);

		if (oepUserMgtEmployee != null) {
			return oepUserMgtEmployee;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("workingUnitId=");
		msg.append(workingUnitId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOEPUserMgtEmployeeException(msg.toString());
	}

	/**
	 * Returns the first o e p user mgt employee in the ordered set where workingUnitId = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching o e p user mgt employee, or <code>null</code> if a matching o e p user mgt employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtEmployee fetchByworkingUnitId_First(long workingUnitId,
		OrderByComparator orderByComparator) throws SystemException {
		List<OEPUserMgtEmployee> list = findByworkingUnitId(workingUnitId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last o e p user mgt employee in the ordered set where workingUnitId = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching o e p user mgt employee
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException if a matching o e p user mgt employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtEmployee findByworkingUnitId_Last(long workingUnitId,
		OrderByComparator orderByComparator)
		throws NoSuchOEPUserMgtEmployeeException, SystemException {
		OEPUserMgtEmployee oepUserMgtEmployee = fetchByworkingUnitId_Last(workingUnitId,
				orderByComparator);

		if (oepUserMgtEmployee != null) {
			return oepUserMgtEmployee;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("workingUnitId=");
		msg.append(workingUnitId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOEPUserMgtEmployeeException(msg.toString());
	}

	/**
	 * Returns the last o e p user mgt employee in the ordered set where workingUnitId = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching o e p user mgt employee, or <code>null</code> if a matching o e p user mgt employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtEmployee fetchByworkingUnitId_Last(long workingUnitId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByworkingUnitId(workingUnitId);

		if (count == 0) {
			return null;
		}

		List<OEPUserMgtEmployee> list = findByworkingUnitId(workingUnitId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the o e p user mgt employees before and after the current o e p user mgt employee in the ordered set where workingUnitId = &#63;.
	 *
	 * @param employeeId the primary key of the current o e p user mgt employee
	 * @param workingUnitId the working unit ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next o e p user mgt employee
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException if a o e p user mgt employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtEmployee[] findByworkingUnitId_PrevAndNext(
		long employeeId, long workingUnitId, OrderByComparator orderByComparator)
		throws NoSuchOEPUserMgtEmployeeException, SystemException {
		OEPUserMgtEmployee oepUserMgtEmployee = findByPrimaryKey(employeeId);

		Session session = null;

		try {
			session = openSession();

			OEPUserMgtEmployee[] array = new OEPUserMgtEmployeeImpl[3];

			array[0] = getByworkingUnitId_PrevAndNext(session,
					oepUserMgtEmployee, workingUnitId, orderByComparator, true);

			array[1] = oepUserMgtEmployee;

			array[2] = getByworkingUnitId_PrevAndNext(session,
					oepUserMgtEmployee, workingUnitId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected OEPUserMgtEmployee getByworkingUnitId_PrevAndNext(
		Session session, OEPUserMgtEmployee oepUserMgtEmployee,
		long workingUnitId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_OEPUSERMGTEMPLOYEE_WHERE);

		query.append(_FINDER_COLUMN_WORKINGUNITID_WORKINGUNITID_2);

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
			query.append(OEPUserMgtEmployeeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(workingUnitId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(oepUserMgtEmployee);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<OEPUserMgtEmployee> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the o e p user mgt employees where workingUnitId = &#63; from the database.
	 *
	 * @param workingUnitId the working unit ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByworkingUnitId(long workingUnitId)
		throws SystemException {
		for (OEPUserMgtEmployee oepUserMgtEmployee : findByworkingUnitId(
				workingUnitId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(oepUserMgtEmployee);
		}
	}

	/**
	 * Returns the number of o e p user mgt employees where workingUnitId = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @return the number of matching o e p user mgt employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByworkingUnitId(long workingUnitId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_WORKINGUNITID;

		Object[] finderArgs = new Object[] { workingUnitId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_OEPUSERMGTEMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_WORKINGUNITID_WORKINGUNITID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(workingUnitId);

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

	private static final String _FINDER_COLUMN_WORKINGUNITID_WORKINGUNITID_2 = "oepUserMgtEmployee.workingUnitId = ? AND  ( oepUserMgtEmployee.mappingUserId > 0 and oepUserMgtEmployee.typeOfEmployee = 'chuyenvien' ) ";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_F_USERID = new FinderPath(OEPUserMgtEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtEmployeeModelImpl.FINDER_CACHE_ENABLED,
			OEPUserMgtEmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByF_userId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_USERID =
		new FinderPath(OEPUserMgtEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtEmployeeModelImpl.FINDER_CACHE_ENABLED,
			OEPUserMgtEmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByF_userId",
			new String[] { Long.class.getName() },
			OEPUserMgtEmployeeModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_USERID = new FinderPath(OEPUserMgtEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtEmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByF_userId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the o e p user mgt employees where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching o e p user mgt employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OEPUserMgtEmployee> findByF_userId(long userId)
		throws SystemException {
		return findByF_userId(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the o e p user mgt employees where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of o e p user mgt employees
	 * @param end the upper bound of the range of o e p user mgt employees (not inclusive)
	 * @return the range of matching o e p user mgt employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OEPUserMgtEmployee> findByF_userId(long userId, int start,
		int end) throws SystemException {
		return findByF_userId(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the o e p user mgt employees where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of o e p user mgt employees
	 * @param end the upper bound of the range of o e p user mgt employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching o e p user mgt employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OEPUserMgtEmployee> findByF_userId(long userId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_USERID;
			finderArgs = new Object[] { userId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_F_USERID;
			finderArgs = new Object[] { userId, start, end, orderByComparator };
		}

		List<OEPUserMgtEmployee> list = (List<OEPUserMgtEmployee>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (OEPUserMgtEmployee oepUserMgtEmployee : list) {
				if ((userId != oepUserMgtEmployee.getUserId())) {
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

			query.append(_SQL_SELECT_OEPUSERMGTEMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_F_USERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(OEPUserMgtEmployeeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (!pagination) {
					list = (List<OEPUserMgtEmployee>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<OEPUserMgtEmployee>(list);
				}
				else {
					list = (List<OEPUserMgtEmployee>)QueryUtil.list(q,
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
	 * Returns the first o e p user mgt employee in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching o e p user mgt employee
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException if a matching o e p user mgt employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtEmployee findByF_userId_First(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchOEPUserMgtEmployeeException, SystemException {
		OEPUserMgtEmployee oepUserMgtEmployee = fetchByF_userId_First(userId,
				orderByComparator);

		if (oepUserMgtEmployee != null) {
			return oepUserMgtEmployee;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOEPUserMgtEmployeeException(msg.toString());
	}

	/**
	 * Returns the first o e p user mgt employee in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching o e p user mgt employee, or <code>null</code> if a matching o e p user mgt employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtEmployee fetchByF_userId_First(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		List<OEPUserMgtEmployee> list = findByF_userId(userId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last o e p user mgt employee in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching o e p user mgt employee
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException if a matching o e p user mgt employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtEmployee findByF_userId_Last(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchOEPUserMgtEmployeeException, SystemException {
		OEPUserMgtEmployee oepUserMgtEmployee = fetchByF_userId_Last(userId,
				orderByComparator);

		if (oepUserMgtEmployee != null) {
			return oepUserMgtEmployee;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOEPUserMgtEmployeeException(msg.toString());
	}

	/**
	 * Returns the last o e p user mgt employee in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching o e p user mgt employee, or <code>null</code> if a matching o e p user mgt employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtEmployee fetchByF_userId_Last(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByF_userId(userId);

		if (count == 0) {
			return null;
		}

		List<OEPUserMgtEmployee> list = findByF_userId(userId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the o e p user mgt employees before and after the current o e p user mgt employee in the ordered set where userId = &#63;.
	 *
	 * @param employeeId the primary key of the current o e p user mgt employee
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next o e p user mgt employee
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException if a o e p user mgt employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtEmployee[] findByF_userId_PrevAndNext(long employeeId,
		long userId, OrderByComparator orderByComparator)
		throws NoSuchOEPUserMgtEmployeeException, SystemException {
		OEPUserMgtEmployee oepUserMgtEmployee = findByPrimaryKey(employeeId);

		Session session = null;

		try {
			session = openSession();

			OEPUserMgtEmployee[] array = new OEPUserMgtEmployeeImpl[3];

			array[0] = getByF_userId_PrevAndNext(session, oepUserMgtEmployee,
					userId, orderByComparator, true);

			array[1] = oepUserMgtEmployee;

			array[2] = getByF_userId_PrevAndNext(session, oepUserMgtEmployee,
					userId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected OEPUserMgtEmployee getByF_userId_PrevAndNext(Session session,
		OEPUserMgtEmployee oepUserMgtEmployee, long userId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_OEPUSERMGTEMPLOYEE_WHERE);

		query.append(_FINDER_COLUMN_F_USERID_USERID_2);

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
			query.append(OEPUserMgtEmployeeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(oepUserMgtEmployee);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<OEPUserMgtEmployee> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the o e p user mgt employees where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByF_userId(long userId) throws SystemException {
		for (OEPUserMgtEmployee oepUserMgtEmployee : findByF_userId(userId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(oepUserMgtEmployee);
		}
	}

	/**
	 * Returns the number of o e p user mgt employees where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching o e p user mgt employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByF_userId(long userId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_USERID;

		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_OEPUSERMGTEMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_F_USERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

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

	private static final String _FINDER_COLUMN_F_USERID_USERID_2 = "oepUserMgtEmployee.userId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_F_WORKINGUNITID_TYPEOFEMPLOYEE =
		new FinderPath(OEPUserMgtEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtEmployeeModelImpl.FINDER_CACHE_ENABLED,
			OEPUserMgtEmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByF_workingUnitId_typeOfEmployee",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_WORKINGUNITID_TYPEOFEMPLOYEE =
		new FinderPath(OEPUserMgtEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtEmployeeModelImpl.FINDER_CACHE_ENABLED,
			OEPUserMgtEmployeeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByF_workingUnitId_typeOfEmployee",
			new String[] { Long.class.getName(), String.class.getName() },
			OEPUserMgtEmployeeModelImpl.WORKINGUNITID_COLUMN_BITMASK |
			OEPUserMgtEmployeeModelImpl.TYPEOFEMPLOYEE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_WORKINGUNITID_TYPEOFEMPLOYEE =
		new FinderPath(OEPUserMgtEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtEmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByF_workingUnitId_typeOfEmployee",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the o e p user mgt employees where workingUnitId = &#63; and typeOfEmployee = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @param typeOfEmployee the type of employee
	 * @return the matching o e p user mgt employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OEPUserMgtEmployee> findByF_workingUnitId_typeOfEmployee(
		long workingUnitId, String typeOfEmployee) throws SystemException {
		return findByF_workingUnitId_typeOfEmployee(workingUnitId,
			typeOfEmployee, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the o e p user mgt employees where workingUnitId = &#63; and typeOfEmployee = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param workingUnitId the working unit ID
	 * @param typeOfEmployee the type of employee
	 * @param start the lower bound of the range of o e p user mgt employees
	 * @param end the upper bound of the range of o e p user mgt employees (not inclusive)
	 * @return the range of matching o e p user mgt employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OEPUserMgtEmployee> findByF_workingUnitId_typeOfEmployee(
		long workingUnitId, String typeOfEmployee, int start, int end)
		throws SystemException {
		return findByF_workingUnitId_typeOfEmployee(workingUnitId,
			typeOfEmployee, start, end, null);
	}

	/**
	 * Returns an ordered range of all the o e p user mgt employees where workingUnitId = &#63; and typeOfEmployee = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param workingUnitId the working unit ID
	 * @param typeOfEmployee the type of employee
	 * @param start the lower bound of the range of o e p user mgt employees
	 * @param end the upper bound of the range of o e p user mgt employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching o e p user mgt employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OEPUserMgtEmployee> findByF_workingUnitId_typeOfEmployee(
		long workingUnitId, String typeOfEmployee, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_WORKINGUNITID_TYPEOFEMPLOYEE;
			finderArgs = new Object[] { workingUnitId, typeOfEmployee };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_F_WORKINGUNITID_TYPEOFEMPLOYEE;
			finderArgs = new Object[] {
					workingUnitId, typeOfEmployee,
					
					start, end, orderByComparator
				};
		}

		List<OEPUserMgtEmployee> list = (List<OEPUserMgtEmployee>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (OEPUserMgtEmployee oepUserMgtEmployee : list) {
				if ((workingUnitId != oepUserMgtEmployee.getWorkingUnitId()) ||
						!Validator.equals(typeOfEmployee,
							oepUserMgtEmployee.getTypeOfEmployee())) {
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

			query.append(_SQL_SELECT_OEPUSERMGTEMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_F_WORKINGUNITID_TYPEOFEMPLOYEE_WORKINGUNITID_2);

			boolean bindTypeOfEmployee = false;

			if (typeOfEmployee == null) {
				query.append(_FINDER_COLUMN_F_WORKINGUNITID_TYPEOFEMPLOYEE_TYPEOFEMPLOYEE_1);
			}
			else if (typeOfEmployee.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_WORKINGUNITID_TYPEOFEMPLOYEE_TYPEOFEMPLOYEE_3);
			}
			else {
				bindTypeOfEmployee = true;

				query.append(_FINDER_COLUMN_F_WORKINGUNITID_TYPEOFEMPLOYEE_TYPEOFEMPLOYEE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(OEPUserMgtEmployeeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(workingUnitId);

				if (bindTypeOfEmployee) {
					qPos.add(typeOfEmployee);
				}

				if (!pagination) {
					list = (List<OEPUserMgtEmployee>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<OEPUserMgtEmployee>(list);
				}
				else {
					list = (List<OEPUserMgtEmployee>)QueryUtil.list(q,
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
	 * Returns the first o e p user mgt employee in the ordered set where workingUnitId = &#63; and typeOfEmployee = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @param typeOfEmployee the type of employee
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching o e p user mgt employee
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException if a matching o e p user mgt employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtEmployee findByF_workingUnitId_typeOfEmployee_First(
		long workingUnitId, String typeOfEmployee,
		OrderByComparator orderByComparator)
		throws NoSuchOEPUserMgtEmployeeException, SystemException {
		OEPUserMgtEmployee oepUserMgtEmployee = fetchByF_workingUnitId_typeOfEmployee_First(workingUnitId,
				typeOfEmployee, orderByComparator);

		if (oepUserMgtEmployee != null) {
			return oepUserMgtEmployee;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("workingUnitId=");
		msg.append(workingUnitId);

		msg.append(", typeOfEmployee=");
		msg.append(typeOfEmployee);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOEPUserMgtEmployeeException(msg.toString());
	}

	/**
	 * Returns the first o e p user mgt employee in the ordered set where workingUnitId = &#63; and typeOfEmployee = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @param typeOfEmployee the type of employee
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching o e p user mgt employee, or <code>null</code> if a matching o e p user mgt employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtEmployee fetchByF_workingUnitId_typeOfEmployee_First(
		long workingUnitId, String typeOfEmployee,
		OrderByComparator orderByComparator) throws SystemException {
		List<OEPUserMgtEmployee> list = findByF_workingUnitId_typeOfEmployee(workingUnitId,
				typeOfEmployee, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last o e p user mgt employee in the ordered set where workingUnitId = &#63; and typeOfEmployee = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @param typeOfEmployee the type of employee
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching o e p user mgt employee
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException if a matching o e p user mgt employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtEmployee findByF_workingUnitId_typeOfEmployee_Last(
		long workingUnitId, String typeOfEmployee,
		OrderByComparator orderByComparator)
		throws NoSuchOEPUserMgtEmployeeException, SystemException {
		OEPUserMgtEmployee oepUserMgtEmployee = fetchByF_workingUnitId_typeOfEmployee_Last(workingUnitId,
				typeOfEmployee, orderByComparator);

		if (oepUserMgtEmployee != null) {
			return oepUserMgtEmployee;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("workingUnitId=");
		msg.append(workingUnitId);

		msg.append(", typeOfEmployee=");
		msg.append(typeOfEmployee);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchOEPUserMgtEmployeeException(msg.toString());
	}

	/**
	 * Returns the last o e p user mgt employee in the ordered set where workingUnitId = &#63; and typeOfEmployee = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @param typeOfEmployee the type of employee
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching o e p user mgt employee, or <code>null</code> if a matching o e p user mgt employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtEmployee fetchByF_workingUnitId_typeOfEmployee_Last(
		long workingUnitId, String typeOfEmployee,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByF_workingUnitId_typeOfEmployee(workingUnitId,
				typeOfEmployee);

		if (count == 0) {
			return null;
		}

		List<OEPUserMgtEmployee> list = findByF_workingUnitId_typeOfEmployee(workingUnitId,
				typeOfEmployee, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the o e p user mgt employees before and after the current o e p user mgt employee in the ordered set where workingUnitId = &#63; and typeOfEmployee = &#63;.
	 *
	 * @param employeeId the primary key of the current o e p user mgt employee
	 * @param workingUnitId the working unit ID
	 * @param typeOfEmployee the type of employee
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next o e p user mgt employee
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException if a o e p user mgt employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtEmployee[] findByF_workingUnitId_typeOfEmployee_PrevAndNext(
		long employeeId, long workingUnitId, String typeOfEmployee,
		OrderByComparator orderByComparator)
		throws NoSuchOEPUserMgtEmployeeException, SystemException {
		OEPUserMgtEmployee oepUserMgtEmployee = findByPrimaryKey(employeeId);

		Session session = null;

		try {
			session = openSession();

			OEPUserMgtEmployee[] array = new OEPUserMgtEmployeeImpl[3];

			array[0] = getByF_workingUnitId_typeOfEmployee_PrevAndNext(session,
					oepUserMgtEmployee, workingUnitId, typeOfEmployee,
					orderByComparator, true);

			array[1] = oepUserMgtEmployee;

			array[2] = getByF_workingUnitId_typeOfEmployee_PrevAndNext(session,
					oepUserMgtEmployee, workingUnitId, typeOfEmployee,
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

	protected OEPUserMgtEmployee getByF_workingUnitId_typeOfEmployee_PrevAndNext(
		Session session, OEPUserMgtEmployee oepUserMgtEmployee,
		long workingUnitId, String typeOfEmployee,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_OEPUSERMGTEMPLOYEE_WHERE);

		query.append(_FINDER_COLUMN_F_WORKINGUNITID_TYPEOFEMPLOYEE_WORKINGUNITID_2);

		boolean bindTypeOfEmployee = false;

		if (typeOfEmployee == null) {
			query.append(_FINDER_COLUMN_F_WORKINGUNITID_TYPEOFEMPLOYEE_TYPEOFEMPLOYEE_1);
		}
		else if (typeOfEmployee.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_F_WORKINGUNITID_TYPEOFEMPLOYEE_TYPEOFEMPLOYEE_3);
		}
		else {
			bindTypeOfEmployee = true;

			query.append(_FINDER_COLUMN_F_WORKINGUNITID_TYPEOFEMPLOYEE_TYPEOFEMPLOYEE_2);
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
			query.append(OEPUserMgtEmployeeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(workingUnitId);

		if (bindTypeOfEmployee) {
			qPos.add(typeOfEmployee);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(oepUserMgtEmployee);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<OEPUserMgtEmployee> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the o e p user mgt employees where workingUnitId = &#63; and typeOfEmployee = &#63; from the database.
	 *
	 * @param workingUnitId the working unit ID
	 * @param typeOfEmployee the type of employee
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByF_workingUnitId_typeOfEmployee(long workingUnitId,
		String typeOfEmployee) throws SystemException {
		for (OEPUserMgtEmployee oepUserMgtEmployee : findByF_workingUnitId_typeOfEmployee(
				workingUnitId, typeOfEmployee, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(oepUserMgtEmployee);
		}
	}

	/**
	 * Returns the number of o e p user mgt employees where workingUnitId = &#63; and typeOfEmployee = &#63;.
	 *
	 * @param workingUnitId the working unit ID
	 * @param typeOfEmployee the type of employee
	 * @return the number of matching o e p user mgt employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByF_workingUnitId_typeOfEmployee(long workingUnitId,
		String typeOfEmployee) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_WORKINGUNITID_TYPEOFEMPLOYEE;

		Object[] finderArgs = new Object[] { workingUnitId, typeOfEmployee };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_OEPUSERMGTEMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_F_WORKINGUNITID_TYPEOFEMPLOYEE_WORKINGUNITID_2);

			boolean bindTypeOfEmployee = false;

			if (typeOfEmployee == null) {
				query.append(_FINDER_COLUMN_F_WORKINGUNITID_TYPEOFEMPLOYEE_TYPEOFEMPLOYEE_1);
			}
			else if (typeOfEmployee.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_WORKINGUNITID_TYPEOFEMPLOYEE_TYPEOFEMPLOYEE_3);
			}
			else {
				bindTypeOfEmployee = true;

				query.append(_FINDER_COLUMN_F_WORKINGUNITID_TYPEOFEMPLOYEE_TYPEOFEMPLOYEE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(workingUnitId);

				if (bindTypeOfEmployee) {
					qPos.add(typeOfEmployee);
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

	private static final String _FINDER_COLUMN_F_WORKINGUNITID_TYPEOFEMPLOYEE_WORKINGUNITID_2 =
		"oepUserMgtEmployee.workingUnitId = ? AND ";
	private static final String _FINDER_COLUMN_F_WORKINGUNITID_TYPEOFEMPLOYEE_TYPEOFEMPLOYEE_1 =
		"oepUserMgtEmployee.typeOfEmployee IS NULL";
	private static final String _FINDER_COLUMN_F_WORKINGUNITID_TYPEOFEMPLOYEE_TYPEOFEMPLOYEE_2 =
		"oepUserMgtEmployee.typeOfEmployee = ?";
	private static final String _FINDER_COLUMN_F_WORKINGUNITID_TYPEOFEMPLOYEE_TYPEOFEMPLOYEE_3 =
		"(oepUserMgtEmployee.typeOfEmployee IS NULL OR oepUserMgtEmployee.typeOfEmployee = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_F_MAPPINGUSERID = new FinderPath(OEPUserMgtEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtEmployeeModelImpl.FINDER_CACHE_ENABLED,
			OEPUserMgtEmployeeImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByF_mappingUserId", new String[] { Long.class.getName() },
			OEPUserMgtEmployeeModelImpl.MAPPINGUSERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_MAPPINGUSERID = new FinderPath(OEPUserMgtEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtEmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByF_mappingUserId", new String[] { Long.class.getName() });

	/**
	 * Returns the o e p user mgt employee where mappingUserId = &#63; or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException} if it could not be found.
	 *
	 * @param mappingUserId the mapping user ID
	 * @return the matching o e p user mgt employee
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException if a matching o e p user mgt employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtEmployee findByF_mappingUserId(long mappingUserId)
		throws NoSuchOEPUserMgtEmployeeException, SystemException {
		OEPUserMgtEmployee oepUserMgtEmployee = fetchByF_mappingUserId(mappingUserId);

		if (oepUserMgtEmployee == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("mappingUserId=");
			msg.append(mappingUserId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchOEPUserMgtEmployeeException(msg.toString());
		}

		return oepUserMgtEmployee;
	}

	/**
	 * Returns the o e p user mgt employee where mappingUserId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param mappingUserId the mapping user ID
	 * @return the matching o e p user mgt employee, or <code>null</code> if a matching o e p user mgt employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtEmployee fetchByF_mappingUserId(long mappingUserId)
		throws SystemException {
		return fetchByF_mappingUserId(mappingUserId, true);
	}

	/**
	 * Returns the o e p user mgt employee where mappingUserId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param mappingUserId the mapping user ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching o e p user mgt employee, or <code>null</code> if a matching o e p user mgt employee could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtEmployee fetchByF_mappingUserId(long mappingUserId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { mappingUserId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_F_MAPPINGUSERID,
					finderArgs, this);
		}

		if (result instanceof OEPUserMgtEmployee) {
			OEPUserMgtEmployee oepUserMgtEmployee = (OEPUserMgtEmployee)result;

			if ((mappingUserId != oepUserMgtEmployee.getMappingUserId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_OEPUSERMGTEMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_F_MAPPINGUSERID_MAPPINGUSERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mappingUserId);

				List<OEPUserMgtEmployee> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_MAPPINGUSERID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"OEPUserMgtEmployeePersistenceImpl.fetchByF_mappingUserId(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					OEPUserMgtEmployee oepUserMgtEmployee = list.get(0);

					result = oepUserMgtEmployee;

					cacheResult(oepUserMgtEmployee);

					if ((oepUserMgtEmployee.getMappingUserId() != mappingUserId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_MAPPINGUSERID,
							finderArgs, oepUserMgtEmployee);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_F_MAPPINGUSERID,
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
			return (OEPUserMgtEmployee)result;
		}
	}

	/**
	 * Removes the o e p user mgt employee where mappingUserId = &#63; from the database.
	 *
	 * @param mappingUserId the mapping user ID
	 * @return the o e p user mgt employee that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtEmployee removeByF_mappingUserId(long mappingUserId)
		throws NoSuchOEPUserMgtEmployeeException, SystemException {
		OEPUserMgtEmployee oepUserMgtEmployee = findByF_mappingUserId(mappingUserId);

		return remove(oepUserMgtEmployee);
	}

	/**
	 * Returns the number of o e p user mgt employees where mappingUserId = &#63;.
	 *
	 * @param mappingUserId the mapping user ID
	 * @return the number of matching o e p user mgt employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByF_mappingUserId(long mappingUserId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_MAPPINGUSERID;

		Object[] finderArgs = new Object[] { mappingUserId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_OEPUSERMGTEMPLOYEE_WHERE);

			query.append(_FINDER_COLUMN_F_MAPPINGUSERID_MAPPINGUSERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mappingUserId);

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

	private static final String _FINDER_COLUMN_F_MAPPINGUSERID_MAPPINGUSERID_2 = "oepUserMgtEmployee.mappingUserId = ?";

	public OEPUserMgtEmployeePersistenceImpl() {
		setModelClass(OEPUserMgtEmployee.class);
	}

	/**
	 * Caches the o e p user mgt employee in the entity cache if it is enabled.
	 *
	 * @param oepUserMgtEmployee the o e p user mgt employee
	 */
	@Override
	public void cacheResult(OEPUserMgtEmployee oepUserMgtEmployee) {
		EntityCacheUtil.putResult(OEPUserMgtEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtEmployeeImpl.class, oepUserMgtEmployee.getPrimaryKey(),
			oepUserMgtEmployee);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_MAPPINGUSERID,
			new Object[] { oepUserMgtEmployee.getMappingUserId() },
			oepUserMgtEmployee);

		oepUserMgtEmployee.resetOriginalValues();
	}

	/**
	 * Caches the o e p user mgt employees in the entity cache if it is enabled.
	 *
	 * @param oepUserMgtEmployees the o e p user mgt employees
	 */
	@Override
	public void cacheResult(List<OEPUserMgtEmployee> oepUserMgtEmployees) {
		for (OEPUserMgtEmployee oepUserMgtEmployee : oepUserMgtEmployees) {
			if (EntityCacheUtil.getResult(
						OEPUserMgtEmployeeModelImpl.ENTITY_CACHE_ENABLED,
						OEPUserMgtEmployeeImpl.class,
						oepUserMgtEmployee.getPrimaryKey()) == null) {
				cacheResult(oepUserMgtEmployee);
			}
			else {
				oepUserMgtEmployee.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all o e p user mgt employees.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(OEPUserMgtEmployeeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(OEPUserMgtEmployeeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the o e p user mgt employee.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OEPUserMgtEmployee oepUserMgtEmployee) {
		EntityCacheUtil.removeResult(OEPUserMgtEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtEmployeeImpl.class, oepUserMgtEmployee.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(oepUserMgtEmployee);
	}

	@Override
	public void clearCache(List<OEPUserMgtEmployee> oepUserMgtEmployees) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (OEPUserMgtEmployee oepUserMgtEmployee : oepUserMgtEmployees) {
			EntityCacheUtil.removeResult(OEPUserMgtEmployeeModelImpl.ENTITY_CACHE_ENABLED,
				OEPUserMgtEmployeeImpl.class, oepUserMgtEmployee.getPrimaryKey());

			clearUniqueFindersCache(oepUserMgtEmployee);
		}
	}

	protected void cacheUniqueFindersCache(
		OEPUserMgtEmployee oepUserMgtEmployee) {
		if (oepUserMgtEmployee.isNew()) {
			Object[] args = new Object[] { oepUserMgtEmployee.getMappingUserId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_F_MAPPINGUSERID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_MAPPINGUSERID,
				args, oepUserMgtEmployee);
		}
		else {
			OEPUserMgtEmployeeModelImpl oepUserMgtEmployeeModelImpl = (OEPUserMgtEmployeeModelImpl)oepUserMgtEmployee;

			if ((oepUserMgtEmployeeModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_F_MAPPINGUSERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						oepUserMgtEmployee.getMappingUserId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_F_MAPPINGUSERID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_MAPPINGUSERID,
					args, oepUserMgtEmployee);
			}
		}
	}

	protected void clearUniqueFindersCache(
		OEPUserMgtEmployee oepUserMgtEmployee) {
		OEPUserMgtEmployeeModelImpl oepUserMgtEmployeeModelImpl = (OEPUserMgtEmployeeModelImpl)oepUserMgtEmployee;

		Object[] args = new Object[] { oepUserMgtEmployee.getMappingUserId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_MAPPINGUSERID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_F_MAPPINGUSERID, args);

		if ((oepUserMgtEmployeeModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_F_MAPPINGUSERID.getColumnBitmask()) != 0) {
			args = new Object[] {
					oepUserMgtEmployeeModelImpl.getOriginalMappingUserId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_MAPPINGUSERID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_F_MAPPINGUSERID,
				args);
		}
	}

	/**
	 * Creates a new o e p user mgt employee with the primary key. Does not add the o e p user mgt employee to the database.
	 *
	 * @param employeeId the primary key for the new o e p user mgt employee
	 * @return the new o e p user mgt employee
	 */
	@Override
	public OEPUserMgtEmployee create(long employeeId) {
		OEPUserMgtEmployee oepUserMgtEmployee = new OEPUserMgtEmployeeImpl();

		oepUserMgtEmployee.setNew(true);
		oepUserMgtEmployee.setPrimaryKey(employeeId);

		return oepUserMgtEmployee;
	}

	/**
	 * Removes the o e p user mgt employee with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param employeeId the primary key of the o e p user mgt employee
	 * @return the o e p user mgt employee that was removed
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException if a o e p user mgt employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtEmployee remove(long employeeId)
		throws NoSuchOEPUserMgtEmployeeException, SystemException {
		return remove((Serializable)employeeId);
	}

	/**
	 * Removes the o e p user mgt employee with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the o e p user mgt employee
	 * @return the o e p user mgt employee that was removed
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException if a o e p user mgt employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtEmployee remove(Serializable primaryKey)
		throws NoSuchOEPUserMgtEmployeeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			OEPUserMgtEmployee oepUserMgtEmployee = (OEPUserMgtEmployee)session.get(OEPUserMgtEmployeeImpl.class,
					primaryKey);

			if (oepUserMgtEmployee == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOEPUserMgtEmployeeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(oepUserMgtEmployee);
		}
		catch (NoSuchOEPUserMgtEmployeeException nsee) {
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
	protected OEPUserMgtEmployee removeImpl(
		OEPUserMgtEmployee oepUserMgtEmployee) throws SystemException {
		oepUserMgtEmployee = toUnwrappedModel(oepUserMgtEmployee);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(oepUserMgtEmployee)) {
				oepUserMgtEmployee = (OEPUserMgtEmployee)session.get(OEPUserMgtEmployeeImpl.class,
						oepUserMgtEmployee.getPrimaryKeyObj());
			}

			if (oepUserMgtEmployee != null) {
				session.delete(oepUserMgtEmployee);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (oepUserMgtEmployee != null) {
			clearCache(oepUserMgtEmployee);
		}

		return oepUserMgtEmployee;
	}

	@Override
	public OEPUserMgtEmployee updateImpl(
		vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee oepUserMgtEmployee)
		throws SystemException {
		oepUserMgtEmployee = toUnwrappedModel(oepUserMgtEmployee);

		boolean isNew = oepUserMgtEmployee.isNew();

		OEPUserMgtEmployeeModelImpl oepUserMgtEmployeeModelImpl = (OEPUserMgtEmployeeModelImpl)oepUserMgtEmployee;

		Session session = null;

		try {
			session = openSession();

			if (oepUserMgtEmployee.isNew()) {
				session.save(oepUserMgtEmployee);

				oepUserMgtEmployee.setNew(false);
			}
			else {
				session.merge(oepUserMgtEmployee);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !OEPUserMgtEmployeeModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((oepUserMgtEmployeeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_WORKINGUNITID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						oepUserMgtEmployeeModelImpl.getOriginalWorkingUnitId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_WORKINGUNITID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_WORKINGUNITID,
					args);

				args = new Object[] {
						oepUserMgtEmployeeModelImpl.getWorkingUnitId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_WORKINGUNITID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_WORKINGUNITID,
					args);
			}

			if ((oepUserMgtEmployeeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WORKINGUNITID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						oepUserMgtEmployeeModelImpl.getOriginalWorkingUnitId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_WORKINGUNITID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WORKINGUNITID,
					args);

				args = new Object[] {
						oepUserMgtEmployeeModelImpl.getWorkingUnitId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_WORKINGUNITID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WORKINGUNITID,
					args);
			}

			if ((oepUserMgtEmployeeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_USERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						oepUserMgtEmployeeModelImpl.getOriginalUserId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_USERID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_USERID,
					args);

				args = new Object[] { oepUserMgtEmployeeModelImpl.getUserId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_USERID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_USERID,
					args);
			}

			if ((oepUserMgtEmployeeModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_WORKINGUNITID_TYPEOFEMPLOYEE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						oepUserMgtEmployeeModelImpl.getOriginalWorkingUnitId(),
						oepUserMgtEmployeeModelImpl.getOriginalTypeOfEmployee()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_WORKINGUNITID_TYPEOFEMPLOYEE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_WORKINGUNITID_TYPEOFEMPLOYEE,
					args);

				args = new Object[] {
						oepUserMgtEmployeeModelImpl.getWorkingUnitId(),
						oepUserMgtEmployeeModelImpl.getTypeOfEmployee()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_WORKINGUNITID_TYPEOFEMPLOYEE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_F_WORKINGUNITID_TYPEOFEMPLOYEE,
					args);
			}
		}

		EntityCacheUtil.putResult(OEPUserMgtEmployeeModelImpl.ENTITY_CACHE_ENABLED,
			OEPUserMgtEmployeeImpl.class, oepUserMgtEmployee.getPrimaryKey(),
			oepUserMgtEmployee);

		clearUniqueFindersCache(oepUserMgtEmployee);
		cacheUniqueFindersCache(oepUserMgtEmployee);

		return oepUserMgtEmployee;
	}

	protected OEPUserMgtEmployee toUnwrappedModel(
		OEPUserMgtEmployee oepUserMgtEmployee) {
		if (oepUserMgtEmployee instanceof OEPUserMgtEmployeeImpl) {
			return oepUserMgtEmployee;
		}

		OEPUserMgtEmployeeImpl oepUserMgtEmployeeImpl = new OEPUserMgtEmployeeImpl();

		oepUserMgtEmployeeImpl.setNew(oepUserMgtEmployee.isNew());
		oepUserMgtEmployeeImpl.setPrimaryKey(oepUserMgtEmployee.getPrimaryKey());

		oepUserMgtEmployeeImpl.setEmployeeId(oepUserMgtEmployee.getEmployeeId());
		oepUserMgtEmployeeImpl.setUserId(oepUserMgtEmployee.getUserId());
		oepUserMgtEmployeeImpl.setGroupId(oepUserMgtEmployee.getGroupId());
		oepUserMgtEmployeeImpl.setCompanyId(oepUserMgtEmployee.getCompanyId());
		oepUserMgtEmployeeImpl.setCreateDate(oepUserMgtEmployee.getCreateDate());
		oepUserMgtEmployeeImpl.setModifiedDate(oepUserMgtEmployee.getModifiedDate());
		oepUserMgtEmployeeImpl.setMappingUserId(oepUserMgtEmployee.getMappingUserId());
		oepUserMgtEmployeeImpl.setWorkingUnitId(oepUserMgtEmployee.getWorkingUnitId());
		oepUserMgtEmployeeImpl.setMainJobPosId(oepUserMgtEmployee.getMainJobPosId());
		oepUserMgtEmployeeImpl.setEmployeeNo(oepUserMgtEmployee.getEmployeeNo());
		oepUserMgtEmployeeImpl.setFullName(oepUserMgtEmployee.getFullName());
		oepUserMgtEmployeeImpl.setOfficeTel(oepUserMgtEmployee.getOfficeTel());
		oepUserMgtEmployeeImpl.setHomeTel(oepUserMgtEmployee.getHomeTel());
		oepUserMgtEmployeeImpl.setMobile(oepUserMgtEmployee.getMobile());
		oepUserMgtEmployeeImpl.setEmail(oepUserMgtEmployee.getEmail());
		oepUserMgtEmployeeImpl.setTypeOfEmployee(oepUserMgtEmployee.getTypeOfEmployee());

		return oepUserMgtEmployeeImpl;
	}

	/**
	 * Returns the o e p user mgt employee with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the o e p user mgt employee
	 * @return the o e p user mgt employee
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException if a o e p user mgt employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtEmployee findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOEPUserMgtEmployeeException, SystemException {
		OEPUserMgtEmployee oepUserMgtEmployee = fetchByPrimaryKey(primaryKey);

		if (oepUserMgtEmployee == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOEPUserMgtEmployeeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return oepUserMgtEmployee;
	}

	/**
	 * Returns the o e p user mgt employee with the primary key or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException} if it could not be found.
	 *
	 * @param employeeId the primary key of the o e p user mgt employee
	 * @return the o e p user mgt employee
	 * @throws vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtEmployeeException if a o e p user mgt employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtEmployee findByPrimaryKey(long employeeId)
		throws NoSuchOEPUserMgtEmployeeException, SystemException {
		return findByPrimaryKey((Serializable)employeeId);
	}

	/**
	 * Returns the o e p user mgt employee with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the o e p user mgt employee
	 * @return the o e p user mgt employee, or <code>null</code> if a o e p user mgt employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtEmployee fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		OEPUserMgtEmployee oepUserMgtEmployee = (OEPUserMgtEmployee)EntityCacheUtil.getResult(OEPUserMgtEmployeeModelImpl.ENTITY_CACHE_ENABLED,
				OEPUserMgtEmployeeImpl.class, primaryKey);

		if (oepUserMgtEmployee == _nullOEPUserMgtEmployee) {
			return null;
		}

		if (oepUserMgtEmployee == null) {
			Session session = null;

			try {
				session = openSession();

				oepUserMgtEmployee = (OEPUserMgtEmployee)session.get(OEPUserMgtEmployeeImpl.class,
						primaryKey);

				if (oepUserMgtEmployee != null) {
					cacheResult(oepUserMgtEmployee);
				}
				else {
					EntityCacheUtil.putResult(OEPUserMgtEmployeeModelImpl.ENTITY_CACHE_ENABLED,
						OEPUserMgtEmployeeImpl.class, primaryKey,
						_nullOEPUserMgtEmployee);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(OEPUserMgtEmployeeModelImpl.ENTITY_CACHE_ENABLED,
					OEPUserMgtEmployeeImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return oepUserMgtEmployee;
	}

	/**
	 * Returns the o e p user mgt employee with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param employeeId the primary key of the o e p user mgt employee
	 * @return the o e p user mgt employee, or <code>null</code> if a o e p user mgt employee with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public OEPUserMgtEmployee fetchByPrimaryKey(long employeeId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)employeeId);
	}

	/**
	 * Returns all the o e p user mgt employees.
	 *
	 * @return the o e p user mgt employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OEPUserMgtEmployee> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the o e p user mgt employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of o e p user mgt employees
	 * @param end the upper bound of the range of o e p user mgt employees (not inclusive)
	 * @return the range of o e p user mgt employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OEPUserMgtEmployee> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the o e p user mgt employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of o e p user mgt employees
	 * @param end the upper bound of the range of o e p user mgt employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of o e p user mgt employees
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<OEPUserMgtEmployee> findAll(int start, int end,
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

		List<OEPUserMgtEmployee> list = (List<OEPUserMgtEmployee>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_OEPUSERMGTEMPLOYEE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_OEPUSERMGTEMPLOYEE;

				if (pagination) {
					sql = sql.concat(OEPUserMgtEmployeeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<OEPUserMgtEmployee>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<OEPUserMgtEmployee>(list);
				}
				else {
					list = (List<OEPUserMgtEmployee>)QueryUtil.list(q,
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
	 * Removes all the o e p user mgt employees from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (OEPUserMgtEmployee oepUserMgtEmployee : findAll()) {
			remove(oepUserMgtEmployee);
		}
	}

	/**
	 * Returns the number of o e p user mgt employees.
	 *
	 * @return the number of o e p user mgt employees
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

				Query q = session.createQuery(_SQL_COUNT_OEPUSERMGTEMPLOYEE);

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

	/**
	 * Initializes the o e p user mgt employee persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<OEPUserMgtEmployee>> listenersList = new ArrayList<ModelListener<OEPUserMgtEmployee>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<OEPUserMgtEmployee>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(OEPUserMgtEmployeeImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_OEPUSERMGTEMPLOYEE = "SELECT oepUserMgtEmployee FROM OEPUserMgtEmployee oepUserMgtEmployee";
	private static final String _SQL_SELECT_OEPUSERMGTEMPLOYEE_WHERE = "SELECT oepUserMgtEmployee FROM OEPUserMgtEmployee oepUserMgtEmployee WHERE ";
	private static final String _SQL_COUNT_OEPUSERMGTEMPLOYEE = "SELECT COUNT(oepUserMgtEmployee) FROM OEPUserMgtEmployee oepUserMgtEmployee";
	private static final String _SQL_COUNT_OEPUSERMGTEMPLOYEE_WHERE = "SELECT COUNT(oepUserMgtEmployee) FROM OEPUserMgtEmployee oepUserMgtEmployee WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "oepUserMgtEmployee.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No OEPUserMgtEmployee exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No OEPUserMgtEmployee exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(OEPUserMgtEmployeePersistenceImpl.class);
	private static OEPUserMgtEmployee _nullOEPUserMgtEmployee = new OEPUserMgtEmployeeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<OEPUserMgtEmployee> toCacheModel() {
				return _nullOEPUserMgtEmployeeCacheModel;
			}
		};

	private static CacheModel<OEPUserMgtEmployee> _nullOEPUserMgtEmployeeCacheModel =
		new CacheModel<OEPUserMgtEmployee>() {
			@Override
			public OEPUserMgtEmployee toEntityModel() {
				return _nullOEPUserMgtEmployee;
			}
		};
}