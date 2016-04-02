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

import vn.dtt.duongbien.dao.vrcb.NoSuchModifyException;
import vn.dtt.duongbien.dao.vrcb.model.Modify;
import vn.dtt.duongbien.dao.vrcb.model.impl.ModifyImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.ModifyModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the modify service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see ModifyPersistence
 * @see ModifyUtil
 * @generated
 */
public class ModifyPersistenceImpl extends BasePersistenceImpl<Modify>
	implements ModifyPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ModifyUtil} to access the modify persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ModifyImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ModifyModelImpl.ENTITY_CACHE_ENABLED,
			ModifyModelImpl.FINDER_CACHE_ENABLED, ModifyImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ModifyModelImpl.ENTITY_CACHE_ENABLED,
			ModifyModelImpl.FINDER_CACHE_ENABLED, ModifyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ModifyModelImpl.ENTITY_CACHE_ENABLED,
			ModifyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ModifyPersistenceImpl() {
		setModelClass(Modify.class);
	}

	/**
	 * Caches the modify in the entity cache if it is enabled.
	 *
	 * @param modify the modify
	 */
	@Override
	public void cacheResult(Modify modify) {
		EntityCacheUtil.putResult(ModifyModelImpl.ENTITY_CACHE_ENABLED,
			ModifyImpl.class, modify.getPrimaryKey(), modify);

		modify.resetOriginalValues();
	}

	/**
	 * Caches the modifies in the entity cache if it is enabled.
	 *
	 * @param modifies the modifies
	 */
	@Override
	public void cacheResult(List<Modify> modifies) {
		for (Modify modify : modifies) {
			if (EntityCacheUtil.getResult(
						ModifyModelImpl.ENTITY_CACHE_ENABLED, ModifyImpl.class,
						modify.getPrimaryKey()) == null) {
				cacheResult(modify);
			}
			else {
				modify.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all modifies.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ModifyImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ModifyImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the modify.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Modify modify) {
		EntityCacheUtil.removeResult(ModifyModelImpl.ENTITY_CACHE_ENABLED,
			ModifyImpl.class, modify.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Modify> modifies) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Modify modify : modifies) {
			EntityCacheUtil.removeResult(ModifyModelImpl.ENTITY_CACHE_ENABLED,
				ModifyImpl.class, modify.getPrimaryKey());
		}
	}

	/**
	 * Creates a new modify with the primary key. Does not add the modify to the database.
	 *
	 * @param id the primary key for the new modify
	 * @return the new modify
	 */
	@Override
	public Modify create(long id) {
		Modify modify = new ModifyImpl();

		modify.setNew(true);
		modify.setPrimaryKey(id);

		return modify;
	}

	/**
	 * Removes the modify with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the modify
	 * @return the modify that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchModifyException if a modify with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Modify remove(long id) throws NoSuchModifyException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the modify with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the modify
	 * @return the modify that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchModifyException if a modify with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Modify remove(Serializable primaryKey)
		throws NoSuchModifyException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Modify modify = (Modify)session.get(ModifyImpl.class, primaryKey);

			if (modify == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchModifyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(modify);
		}
		catch (NoSuchModifyException nsee) {
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
	protected Modify removeImpl(Modify modify) throws SystemException {
		modify = toUnwrappedModel(modify);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(modify)) {
				modify = (Modify)session.get(ModifyImpl.class,
						modify.getPrimaryKeyObj());
			}

			if (modify != null) {
				session.delete(modify);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (modify != null) {
			clearCache(modify);
		}

		return modify;
	}

	@Override
	public Modify updateImpl(vn.dtt.duongbien.dao.vrcb.model.Modify modify)
		throws SystemException {
		modify = toUnwrappedModel(modify);

		boolean isNew = modify.isNew();

		Session session = null;

		try {
			session = openSession();

			if (modify.isNew()) {
				session.save(modify);

				modify.setNew(false);
			}
			else {
				session.merge(modify);
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

		EntityCacheUtil.putResult(ModifyModelImpl.ENTITY_CACHE_ENABLED,
			ModifyImpl.class, modify.getPrimaryKey(), modify);

		return modify;
	}

	protected Modify toUnwrappedModel(Modify modify) {
		if (modify instanceof ModifyImpl) {
			return modify;
		}

		ModifyImpl modifyImpl = new ModifyImpl();

		modifyImpl.setNew(modify.isNew());
		modifyImpl.setPrimaryKey(modify.getPrimaryKey());

		modifyImpl.setId(modify.getId());
		modifyImpl.setModifyCode(modify.getModifyCode());
		modifyImpl.setModifyDesc(modify.getModifyDesc());
		modifyImpl.setOrganization(modify.getOrganization());
		modifyImpl.setDivision(modify.getDivision());
		modifyImpl.setName(modify.getName());
		modifyImpl.setModifyDate(modify.getModifyDate());
		modifyImpl.setDocumentName(modify.getDocumentName());
		modifyImpl.setDocumentYear(modify.getDocumentYear());

		return modifyImpl;
	}

	/**
	 * Returns the modify with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the modify
	 * @return the modify
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchModifyException if a modify with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Modify findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModifyException, SystemException {
		Modify modify = fetchByPrimaryKey(primaryKey);

		if (modify == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchModifyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return modify;
	}

	/**
	 * Returns the modify with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchModifyException} if it could not be found.
	 *
	 * @param id the primary key of the modify
	 * @return the modify
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchModifyException if a modify with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Modify findByPrimaryKey(long id)
		throws NoSuchModifyException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the modify with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the modify
	 * @return the modify, or <code>null</code> if a modify with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Modify fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Modify modify = (Modify)EntityCacheUtil.getResult(ModifyModelImpl.ENTITY_CACHE_ENABLED,
				ModifyImpl.class, primaryKey);

		if (modify == _nullModify) {
			return null;
		}

		if (modify == null) {
			Session session = null;

			try {
				session = openSession();

				modify = (Modify)session.get(ModifyImpl.class, primaryKey);

				if (modify != null) {
					cacheResult(modify);
				}
				else {
					EntityCacheUtil.putResult(ModifyModelImpl.ENTITY_CACHE_ENABLED,
						ModifyImpl.class, primaryKey, _nullModify);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ModifyModelImpl.ENTITY_CACHE_ENABLED,
					ModifyImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return modify;
	}

	/**
	 * Returns the modify with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the modify
	 * @return the modify, or <code>null</code> if a modify with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Modify fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the modifies.
	 *
	 * @return the modifies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Modify> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the modifies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ModifyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of modifies
	 * @param end the upper bound of the range of modifies (not inclusive)
	 * @return the range of modifies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Modify> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the modifies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ModifyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of modifies
	 * @param end the upper bound of the range of modifies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of modifies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Modify> findAll(int start, int end,
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

		List<Modify> list = (List<Modify>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MODIFY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MODIFY;

				if (pagination) {
					sql = sql.concat(ModifyModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Modify>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Modify>(list);
				}
				else {
					list = (List<Modify>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the modifies from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Modify modify : findAll()) {
			remove(modify);
		}
	}

	/**
	 * Returns the number of modifies.
	 *
	 * @return the number of modifies
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

				Query q = session.createQuery(_SQL_COUNT_MODIFY);

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
	 * Initializes the modify persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.Modify")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Modify>> listenersList = new ArrayList<ModelListener<Modify>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Modify>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ModifyImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_MODIFY = "SELECT modify FROM Modify modify";
	private static final String _SQL_COUNT_MODIFY = "SELECT COUNT(modify) FROM Modify modify";
	private static final String _ORDER_BY_ENTITY_ALIAS = "modify.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Modify exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ModifyPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "modifyCode", "modifyDesc", "modifyDate", "documentName",
				"documentYear"
			});
	private static Modify _nullModify = new ModifyImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Modify> toCacheModel() {
				return _nullModifyCacheModel;
			}
		};

	private static CacheModel<Modify> _nullModifyCacheModel = new CacheModel<Modify>() {
			@Override
			public Modify toEntityModel() {
				return _nullModify;
			}
		};
}