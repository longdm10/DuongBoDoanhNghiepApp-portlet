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

import vn.dtt.duongbien.dao.vrcb.NoSuchDmGtReportCategoryException;
import vn.dtt.duongbien.dao.vrcb.model.DmGtReportCategory;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmGtReportCategoryImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.DmGtReportCategoryModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dm gt report category service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmGtReportCategoryPersistence
 * @see DmGtReportCategoryUtil
 * @generated
 */
public class DmGtReportCategoryPersistenceImpl extends BasePersistenceImpl<DmGtReportCategory>
	implements DmGtReportCategoryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmGtReportCategoryUtil} to access the dm gt report category persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmGtReportCategoryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmGtReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
			DmGtReportCategoryModelImpl.FINDER_CACHE_ENABLED,
			DmGtReportCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmGtReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
			DmGtReportCategoryModelImpl.FINDER_CACHE_ENABLED,
			DmGtReportCategoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmGtReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
			DmGtReportCategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public DmGtReportCategoryPersistenceImpl() {
		setModelClass(DmGtReportCategory.class);
	}

	/**
	 * Caches the dm gt report category in the entity cache if it is enabled.
	 *
	 * @param dmGtReportCategory the dm gt report category
	 */
	@Override
	public void cacheResult(DmGtReportCategory dmGtReportCategory) {
		EntityCacheUtil.putResult(DmGtReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
			DmGtReportCategoryImpl.class, dmGtReportCategory.getPrimaryKey(),
			dmGtReportCategory);

		dmGtReportCategory.resetOriginalValues();
	}

	/**
	 * Caches the dm gt report categories in the entity cache if it is enabled.
	 *
	 * @param dmGtReportCategories the dm gt report categories
	 */
	@Override
	public void cacheResult(List<DmGtReportCategory> dmGtReportCategories) {
		for (DmGtReportCategory dmGtReportCategory : dmGtReportCategories) {
			if (EntityCacheUtil.getResult(
						DmGtReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
						DmGtReportCategoryImpl.class,
						dmGtReportCategory.getPrimaryKey()) == null) {
				cacheResult(dmGtReportCategory);
			}
			else {
				dmGtReportCategory.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm gt report categories.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmGtReportCategoryImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmGtReportCategoryImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm gt report category.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmGtReportCategory dmGtReportCategory) {
		EntityCacheUtil.removeResult(DmGtReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
			DmGtReportCategoryImpl.class, dmGtReportCategory.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DmGtReportCategory> dmGtReportCategories) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmGtReportCategory dmGtReportCategory : dmGtReportCategories) {
			EntityCacheUtil.removeResult(DmGtReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
				DmGtReportCategoryImpl.class, dmGtReportCategory.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dm gt report category with the primary key. Does not add the dm gt report category to the database.
	 *
	 * @param id the primary key for the new dm gt report category
	 * @return the new dm gt report category
	 */
	@Override
	public DmGtReportCategory create(long id) {
		DmGtReportCategory dmGtReportCategory = new DmGtReportCategoryImpl();

		dmGtReportCategory.setNew(true);
		dmGtReportCategory.setPrimaryKey(id);

		return dmGtReportCategory;
	}

	/**
	 * Removes the dm gt report category with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm gt report category
	 * @return the dm gt report category that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtReportCategoryException if a dm gt report category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtReportCategory remove(long id)
		throws NoSuchDmGtReportCategoryException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the dm gt report category with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm gt report category
	 * @return the dm gt report category that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtReportCategoryException if a dm gt report category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtReportCategory remove(Serializable primaryKey)
		throws NoSuchDmGtReportCategoryException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmGtReportCategory dmGtReportCategory = (DmGtReportCategory)session.get(DmGtReportCategoryImpl.class,
					primaryKey);

			if (dmGtReportCategory == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmGtReportCategoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmGtReportCategory);
		}
		catch (NoSuchDmGtReportCategoryException nsee) {
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
	protected DmGtReportCategory removeImpl(
		DmGtReportCategory dmGtReportCategory) throws SystemException {
		dmGtReportCategory = toUnwrappedModel(dmGtReportCategory);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dmGtReportCategory)) {
				dmGtReportCategory = (DmGtReportCategory)session.get(DmGtReportCategoryImpl.class,
						dmGtReportCategory.getPrimaryKeyObj());
			}

			if (dmGtReportCategory != null) {
				session.delete(dmGtReportCategory);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dmGtReportCategory != null) {
			clearCache(dmGtReportCategory);
		}

		return dmGtReportCategory;
	}

	@Override
	public DmGtReportCategory updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmGtReportCategory dmGtReportCategory)
		throws SystemException {
		dmGtReportCategory = toUnwrappedModel(dmGtReportCategory);

		boolean isNew = dmGtReportCategory.isNew();

		Session session = null;

		try {
			session = openSession();

			if (dmGtReportCategory.isNew()) {
				session.save(dmGtReportCategory);

				dmGtReportCategory.setNew(false);
			}
			else {
				session.merge(dmGtReportCategory);
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

		EntityCacheUtil.putResult(DmGtReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
			DmGtReportCategoryImpl.class, dmGtReportCategory.getPrimaryKey(),
			dmGtReportCategory);

		return dmGtReportCategory;
	}

	protected DmGtReportCategory toUnwrappedModel(
		DmGtReportCategory dmGtReportCategory) {
		if (dmGtReportCategory instanceof DmGtReportCategoryImpl) {
			return dmGtReportCategory;
		}

		DmGtReportCategoryImpl dmGtReportCategoryImpl = new DmGtReportCategoryImpl();

		dmGtReportCategoryImpl.setNew(dmGtReportCategory.isNew());
		dmGtReportCategoryImpl.setPrimaryKey(dmGtReportCategory.getPrimaryKey());

		dmGtReportCategoryImpl.setId(dmGtReportCategory.getId());
		dmGtReportCategoryImpl.setCategory(dmGtReportCategory.getCategory());
		dmGtReportCategoryImpl.setCategoryName(dmGtReportCategory.getCategoryName());
		dmGtReportCategoryImpl.setCategoryOrder(dmGtReportCategory.getCategoryOrder());
		dmGtReportCategoryImpl.setIsDelete(dmGtReportCategory.getIsDelete());
		dmGtReportCategoryImpl.setMarkedAsDelete(dmGtReportCategory.getMarkedAsDelete());
		dmGtReportCategoryImpl.setModifiedDate(dmGtReportCategory.getModifiedDate());
		dmGtReportCategoryImpl.setRequestedDate(dmGtReportCategory.getRequestedDate());
		dmGtReportCategoryImpl.setSyncVersion(dmGtReportCategory.getSyncVersion());

		return dmGtReportCategoryImpl;
	}

	/**
	 * Returns the dm gt report category with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm gt report category
	 * @return the dm gt report category
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtReportCategoryException if a dm gt report category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtReportCategory findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDmGtReportCategoryException, SystemException {
		DmGtReportCategory dmGtReportCategory = fetchByPrimaryKey(primaryKey);

		if (dmGtReportCategory == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDmGtReportCategoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dmGtReportCategory;
	}

	/**
	 * Returns the dm gt report category with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmGtReportCategoryException} if it could not be found.
	 *
	 * @param id the primary key of the dm gt report category
	 * @return the dm gt report category
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtReportCategoryException if a dm gt report category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtReportCategory findByPrimaryKey(long id)
		throws NoSuchDmGtReportCategoryException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dm gt report category with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm gt report category
	 * @return the dm gt report category, or <code>null</code> if a dm gt report category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtReportCategory fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DmGtReportCategory dmGtReportCategory = (DmGtReportCategory)EntityCacheUtil.getResult(DmGtReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
				DmGtReportCategoryImpl.class, primaryKey);

		if (dmGtReportCategory == _nullDmGtReportCategory) {
			return null;
		}

		if (dmGtReportCategory == null) {
			Session session = null;

			try {
				session = openSession();

				dmGtReportCategory = (DmGtReportCategory)session.get(DmGtReportCategoryImpl.class,
						primaryKey);

				if (dmGtReportCategory != null) {
					cacheResult(dmGtReportCategory);
				}
				else {
					EntityCacheUtil.putResult(DmGtReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
						DmGtReportCategoryImpl.class, primaryKey,
						_nullDmGtReportCategory);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DmGtReportCategoryModelImpl.ENTITY_CACHE_ENABLED,
					DmGtReportCategoryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dmGtReportCategory;
	}

	/**
	 * Returns the dm gt report category with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm gt report category
	 * @return the dm gt report category, or <code>null</code> if a dm gt report category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmGtReportCategory fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the dm gt report categories.
	 *
	 * @return the dm gt report categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmGtReportCategory> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm gt report categories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGtReportCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm gt report categories
	 * @param end the upper bound of the range of dm gt report categories (not inclusive)
	 * @return the range of dm gt report categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmGtReportCategory> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm gt report categories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGtReportCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm gt report categories
	 * @param end the upper bound of the range of dm gt report categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm gt report categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmGtReportCategory> findAll(int start, int end,
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

		List<DmGtReportCategory> list = (List<DmGtReportCategory>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMGTREPORTCATEGORY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMGTREPORTCATEGORY;

				if (pagination) {
					sql = sql.concat(DmGtReportCategoryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DmGtReportCategory>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmGtReportCategory>(list);
				}
				else {
					list = (List<DmGtReportCategory>)QueryUtil.list(q,
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
	 * Removes all the dm gt report categories from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DmGtReportCategory dmGtReportCategory : findAll()) {
			remove(dmGtReportCategory);
		}
	}

	/**
	 * Returns the number of dm gt report categories.
	 *
	 * @return the number of dm gt report categories
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

				Query q = session.createQuery(_SQL_COUNT_DMGTREPORTCATEGORY);

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
	 * Initializes the dm gt report category persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.DmGtReportCategory")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmGtReportCategory>> listenersList = new ArrayList<ModelListener<DmGtReportCategory>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmGtReportCategory>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmGtReportCategoryImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DMGTREPORTCATEGORY = "SELECT dmGtReportCategory FROM DmGtReportCategory dmGtReportCategory";
	private static final String _SQL_COUNT_DMGTREPORTCATEGORY = "SELECT COUNT(dmGtReportCategory) FROM DmGtReportCategory dmGtReportCategory";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmGtReportCategory.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmGtReportCategory exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmGtReportCategoryPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "category", "categoryName", "categoryOrder", "isDelete",
				"markedAsDelete", "modifiedDate", "requestedDate", "syncVersion"
			});
	private static DmGtReportCategory _nullDmGtReportCategory = new DmGtReportCategoryImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmGtReportCategory> toCacheModel() {
				return _nullDmGtReportCategoryCacheModel;
			}
		};

	private static CacheModel<DmGtReportCategory> _nullDmGtReportCategoryCacheModel =
		new CacheModel<DmGtReportCategory>() {
			@Override
			public DmGtReportCategory toEntityModel() {
				return _nullDmGtReportCategory;
			}
		};
}