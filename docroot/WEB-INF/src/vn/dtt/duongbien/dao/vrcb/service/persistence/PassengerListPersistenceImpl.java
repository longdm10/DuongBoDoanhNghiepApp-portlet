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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.duongbien.dao.vrcb.NoSuchPassengerListException;
import vn.dtt.duongbien.dao.vrcb.model.PassengerList;
import vn.dtt.duongbien.dao.vrcb.model.impl.PassengerListImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.PassengerListModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the passenger list service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see PassengerListPersistence
 * @see PassengerListUtil
 * @generated
 */
public class PassengerListPersistenceImpl extends BasePersistenceImpl<PassengerList>
	implements PassengerListPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PassengerListUtil} to access the passenger list persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PassengerListImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PassengerListModelImpl.ENTITY_CACHE_ENABLED,
			PassengerListModelImpl.FINDER_CACHE_ENABLED,
			PassengerListImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PassengerListModelImpl.ENTITY_CACHE_ENABLED,
			PassengerListModelImpl.FINDER_CACHE_ENABLED,
			PassengerListImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PassengerListModelImpl.ENTITY_CACHE_ENABLED,
			PassengerListModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public PassengerListPersistenceImpl() {
		setModelClass(PassengerList.class);
	}

	/**
	 * Caches the passenger list in the entity cache if it is enabled.
	 *
	 * @param passengerList the passenger list
	 */
	@Override
	public void cacheResult(PassengerList passengerList) {
		EntityCacheUtil.putResult(PassengerListModelImpl.ENTITY_CACHE_ENABLED,
			PassengerListImpl.class, passengerList.getPrimaryKey(),
			passengerList);

		passengerList.resetOriginalValues();
	}

	/**
	 * Caches the passenger lists in the entity cache if it is enabled.
	 *
	 * @param passengerLists the passenger lists
	 */
	@Override
	public void cacheResult(List<PassengerList> passengerLists) {
		for (PassengerList passengerList : passengerLists) {
			if (EntityCacheUtil.getResult(
						PassengerListModelImpl.ENTITY_CACHE_ENABLED,
						PassengerListImpl.class, passengerList.getPrimaryKey()) == null) {
				cacheResult(passengerList);
			}
			else {
				passengerList.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all passenger lists.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PassengerListImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PassengerListImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the passenger list.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PassengerList passengerList) {
		EntityCacheUtil.removeResult(PassengerListModelImpl.ENTITY_CACHE_ENABLED,
			PassengerListImpl.class, passengerList.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<PassengerList> passengerLists) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PassengerList passengerList : passengerLists) {
			EntityCacheUtil.removeResult(PassengerListModelImpl.ENTITY_CACHE_ENABLED,
				PassengerListImpl.class, passengerList.getPrimaryKey());
		}
	}

	/**
	 * Creates a new passenger list with the primary key. Does not add the passenger list to the database.
	 *
	 * @param id the primary key for the new passenger list
	 * @return the new passenger list
	 */
	@Override
	public PassengerList create(long id) {
		PassengerList passengerList = new PassengerListImpl();

		passengerList.setNew(true);
		passengerList.setPrimaryKey(id);

		return passengerList;
	}

	/**
	 * Removes the passenger list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the passenger list
	 * @return the passenger list that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchPassengerListException if a passenger list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PassengerList remove(long id)
		throws NoSuchPassengerListException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the passenger list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the passenger list
	 * @return the passenger list that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchPassengerListException if a passenger list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PassengerList remove(Serializable primaryKey)
		throws NoSuchPassengerListException, SystemException {
		Session session = null;

		try {
			session = openSession();

			PassengerList passengerList = (PassengerList)session.get(PassengerListImpl.class,
					primaryKey);

			if (passengerList == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPassengerListException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(passengerList);
		}
		catch (NoSuchPassengerListException nsee) {
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
	protected PassengerList removeImpl(PassengerList passengerList)
		throws SystemException {
		passengerList = toUnwrappedModel(passengerList);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(passengerList)) {
				passengerList = (PassengerList)session.get(PassengerListImpl.class,
						passengerList.getPrimaryKeyObj());
			}

			if (passengerList != null) {
				session.delete(passengerList);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (passengerList != null) {
			clearCache(passengerList);
		}

		return passengerList;
	}

	@Override
	public PassengerList updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.PassengerList passengerList)
		throws SystemException {
		passengerList = toUnwrappedModel(passengerList);

		boolean isNew = passengerList.isNew();

		Session session = null;

		try {
			session = openSession();

			if (passengerList.isNew()) {
				session.save(passengerList);

				passengerList.setNew(false);
			}
			else {
				session.merge(passengerList);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(PassengerListModelImpl.ENTITY_CACHE_ENABLED,
			PassengerListImpl.class, passengerList.getPrimaryKey(),
			passengerList);

		return passengerList;
	}

	protected PassengerList toUnwrappedModel(PassengerList passengerList) {
		if (passengerList instanceof PassengerListImpl) {
			return passengerList;
		}

		PassengerListImpl passengerListImpl = new PassengerListImpl();

		passengerListImpl.setNew(passengerList.isNew());
		passengerListImpl.setPrimaryKey(passengerList.getPrimaryKey());

		passengerListImpl.setId(passengerList.getId());
		passengerListImpl.setPassengerCode(passengerList.getPassengerCode());
		passengerListImpl.setDocumentNo(passengerList.getDocumentNo());
		passengerListImpl.setFullName(passengerList.getFullName());
		passengerListImpl.setStateCode(passengerList.getStateCode());
		passengerListImpl.setBirthDay(passengerList.getBirthDay());
		passengerListImpl.setBirthPlace(passengerList.getBirthPlace());
		passengerListImpl.setPassportTypeCode(passengerList.getPassportTypeCode());
		passengerListImpl.setPassPortNo(passengerList.getPassPortNo());
		passengerListImpl.setPortCheckInCode(passengerList.getPortCheckInCode());
		passengerListImpl.setPortCheckOutCode(passengerList.getPortCheckOutCode());
		passengerListImpl.setIsTransit(passengerList.isIsTransit());
		passengerListImpl.setCreateDate(passengerList.getCreateDate());
		passengerListImpl.setModifyDate(passengerList.getModifyDate());

		return passengerListImpl;
	}

	/**
	 * Returns the passenger list with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the passenger list
	 * @return the passenger list
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchPassengerListException if a passenger list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PassengerList findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPassengerListException, SystemException {
		PassengerList passengerList = fetchByPrimaryKey(primaryKey);

		if (passengerList == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPassengerListException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return passengerList;
	}

	/**
	 * Returns the passenger list with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchPassengerListException} if it could not be found.
	 *
	 * @param id the primary key of the passenger list
	 * @return the passenger list
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchPassengerListException if a passenger list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PassengerList findByPrimaryKey(long id)
		throws NoSuchPassengerListException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the passenger list with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the passenger list
	 * @return the passenger list, or <code>null</code> if a passenger list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PassengerList fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		PassengerList passengerList = (PassengerList)EntityCacheUtil.getResult(PassengerListModelImpl.ENTITY_CACHE_ENABLED,
				PassengerListImpl.class, primaryKey);

		if (passengerList == _nullPassengerList) {
			return null;
		}

		if (passengerList == null) {
			Session session = null;

			try {
				session = openSession();

				passengerList = (PassengerList)session.get(PassengerListImpl.class,
						primaryKey);

				if (passengerList != null) {
					cacheResult(passengerList);
				}
				else {
					EntityCacheUtil.putResult(PassengerListModelImpl.ENTITY_CACHE_ENABLED,
						PassengerListImpl.class, primaryKey, _nullPassengerList);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PassengerListModelImpl.ENTITY_CACHE_ENABLED,
					PassengerListImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return passengerList;
	}

	/**
	 * Returns the passenger list with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the passenger list
	 * @return the passenger list, or <code>null</code> if a passenger list with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PassengerList fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the passenger lists.
	 *
	 * @return the passenger lists
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PassengerList> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the passenger lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.PassengerListModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of passenger lists
	 * @param end the upper bound of the range of passenger lists (not inclusive)
	 * @return the range of passenger lists
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PassengerList> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the passenger lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.PassengerListModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of passenger lists
	 * @param end the upper bound of the range of passenger lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of passenger lists
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PassengerList> findAll(int start, int end,
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

		List<PassengerList> list = (List<PassengerList>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PASSENGERLIST);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PASSENGERLIST;

				if (pagination) {
					sql = sql.concat(PassengerListModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PassengerList>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PassengerList>(list);
				}
				else {
					list = (List<PassengerList>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the passenger lists from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (PassengerList passengerList : findAll()) {
			remove(passengerList);
		}
	}

	/**
	 * Returns the number of passenger lists.
	 *
	 * @return the number of passenger lists
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

				Query q = session.createQuery(_SQL_COUNT_PASSENGERLIST);

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
	 * Initializes the passenger list persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.PassengerList")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<PassengerList>> listenersList = new ArrayList<ModelListener<PassengerList>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<PassengerList>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PassengerListImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PASSENGERLIST = "SELECT passengerList FROM PassengerList passengerList";
	private static final String _SQL_COUNT_PASSENGERLIST = "SELECT COUNT(passengerList) FROM PassengerList passengerList";
	private static final String _ORDER_BY_ENTITY_ALIAS = "passengerList.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PassengerList exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PassengerListPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"passengerCode", "documentNo", "fullName", "stateCode",
				"birthDay", "birthPlace", "passportTypeCode", "passPortNo",
				"portCheckInCode", "portCheckOutCode", "isTransit", "createDate",
				"modifyDate"
			});
	private static PassengerList _nullPassengerList = new PassengerListImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<PassengerList> toCacheModel() {
				return _nullPassengerListCacheModel;
			}
		};

	private static CacheModel<PassengerList> _nullPassengerListCacheModel = new CacheModel<PassengerList>() {
			@Override
			public PassengerList toEntityModel() {
				return _nullPassengerList;
			}
		};
}