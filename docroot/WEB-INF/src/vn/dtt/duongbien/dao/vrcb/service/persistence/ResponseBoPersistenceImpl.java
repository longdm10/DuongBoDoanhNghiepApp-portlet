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

import vn.dtt.duongbien.dao.vrcb.NoSuchResponseBoException;
import vn.dtt.duongbien.dao.vrcb.model.ResponseBo;
import vn.dtt.duongbien.dao.vrcb.model.impl.ResponseBoImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.ResponseBoModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the response bo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see ResponseBoPersistence
 * @see ResponseBoUtil
 * @generated
 */
public class ResponseBoPersistenceImpl extends BasePersistenceImpl<ResponseBo>
	implements ResponseBoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ResponseBoUtil} to access the response bo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ResponseBoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ResponseBoModelImpl.ENTITY_CACHE_ENABLED,
			ResponseBoModelImpl.FINDER_CACHE_ENABLED, ResponseBoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ResponseBoModelImpl.ENTITY_CACHE_ENABLED,
			ResponseBoModelImpl.FINDER_CACHE_ENABLED, ResponseBoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ResponseBoModelImpl.ENTITY_CACHE_ENABLED,
			ResponseBoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ResponseBoPersistenceImpl() {
		setModelClass(ResponseBo.class);
	}

	/**
	 * Caches the response bo in the entity cache if it is enabled.
	 *
	 * @param responseBo the response bo
	 */
	@Override
	public void cacheResult(ResponseBo responseBo) {
		EntityCacheUtil.putResult(ResponseBoModelImpl.ENTITY_CACHE_ENABLED,
			ResponseBoImpl.class, responseBo.getPrimaryKey(), responseBo);

		responseBo.resetOriginalValues();
	}

	/**
	 * Caches the response bos in the entity cache if it is enabled.
	 *
	 * @param responseBos the response bos
	 */
	@Override
	public void cacheResult(List<ResponseBo> responseBos) {
		for (ResponseBo responseBo : responseBos) {
			if (EntityCacheUtil.getResult(
						ResponseBoModelImpl.ENTITY_CACHE_ENABLED,
						ResponseBoImpl.class, responseBo.getPrimaryKey()) == null) {
				cacheResult(responseBo);
			}
			else {
				responseBo.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all response bos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ResponseBoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ResponseBoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the response bo.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ResponseBo responseBo) {
		EntityCacheUtil.removeResult(ResponseBoModelImpl.ENTITY_CACHE_ENABLED,
			ResponseBoImpl.class, responseBo.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ResponseBo> responseBos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ResponseBo responseBo : responseBos) {
			EntityCacheUtil.removeResult(ResponseBoModelImpl.ENTITY_CACHE_ENABLED,
				ResponseBoImpl.class, responseBo.getPrimaryKey());
		}
	}

	/**
	 * Creates a new response bo with the primary key. Does not add the response bo to the database.
	 *
	 * @param id the primary key for the new response bo
	 * @return the new response bo
	 */
	@Override
	public ResponseBo create(long id) {
		ResponseBo responseBo = new ResponseBoImpl();

		responseBo.setNew(true);
		responseBo.setPrimaryKey(id);

		return responseBo;
	}

	/**
	 * Removes the response bo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the response bo
	 * @return the response bo that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchResponseBoException if a response bo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResponseBo remove(long id)
		throws NoSuchResponseBoException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the response bo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the response bo
	 * @return the response bo that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchResponseBoException if a response bo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResponseBo remove(Serializable primaryKey)
		throws NoSuchResponseBoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ResponseBo responseBo = (ResponseBo)session.get(ResponseBoImpl.class,
					primaryKey);

			if (responseBo == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchResponseBoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(responseBo);
		}
		catch (NoSuchResponseBoException nsee) {
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
	protected ResponseBo removeImpl(ResponseBo responseBo)
		throws SystemException {
		responseBo = toUnwrappedModel(responseBo);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(responseBo)) {
				responseBo = (ResponseBo)session.get(ResponseBoImpl.class,
						responseBo.getPrimaryKeyObj());
			}

			if (responseBo != null) {
				session.delete(responseBo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (responseBo != null) {
			clearCache(responseBo);
		}

		return responseBo;
	}

	@Override
	public ResponseBo updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.ResponseBo responseBo)
		throws SystemException {
		responseBo = toUnwrappedModel(responseBo);

		boolean isNew = responseBo.isNew();

		Session session = null;

		try {
			session = openSession();

			if (responseBo.isNew()) {
				session.save(responseBo);

				responseBo.setNew(false);
			}
			else {
				session.merge(responseBo);
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

		EntityCacheUtil.putResult(ResponseBoModelImpl.ENTITY_CACHE_ENABLED,
			ResponseBoImpl.class, responseBo.getPrimaryKey(), responseBo);

		return responseBo;
	}

	protected ResponseBo toUnwrappedModel(ResponseBo responseBo) {
		if (responseBo instanceof ResponseBoImpl) {
			return responseBo;
		}

		ResponseBoImpl responseBoImpl = new ResponseBoImpl();

		responseBoImpl.setNew(responseBo.isNew());
		responseBoImpl.setPrimaryKey(responseBo.getPrimaryKey());

		responseBoImpl.setId(responseBo.getId());
		responseBoImpl.setIsSuccess(responseBo.getIsSuccess());
		responseBoImpl.setErrorMessage(responseBo.getErrorMessage());

		return responseBoImpl;
	}

	/**
	 * Returns the response bo with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the response bo
	 * @return the response bo
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchResponseBoException if a response bo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResponseBo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchResponseBoException, SystemException {
		ResponseBo responseBo = fetchByPrimaryKey(primaryKey);

		if (responseBo == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchResponseBoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return responseBo;
	}

	/**
	 * Returns the response bo with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchResponseBoException} if it could not be found.
	 *
	 * @param id the primary key of the response bo
	 * @return the response bo
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchResponseBoException if a response bo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResponseBo findByPrimaryKey(long id)
		throws NoSuchResponseBoException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the response bo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the response bo
	 * @return the response bo, or <code>null</code> if a response bo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResponseBo fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ResponseBo responseBo = (ResponseBo)EntityCacheUtil.getResult(ResponseBoModelImpl.ENTITY_CACHE_ENABLED,
				ResponseBoImpl.class, primaryKey);

		if (responseBo == _nullResponseBo) {
			return null;
		}

		if (responseBo == null) {
			Session session = null;

			try {
				session = openSession();

				responseBo = (ResponseBo)session.get(ResponseBoImpl.class,
						primaryKey);

				if (responseBo != null) {
					cacheResult(responseBo);
				}
				else {
					EntityCacheUtil.putResult(ResponseBoModelImpl.ENTITY_CACHE_ENABLED,
						ResponseBoImpl.class, primaryKey, _nullResponseBo);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ResponseBoModelImpl.ENTITY_CACHE_ENABLED,
					ResponseBoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return responseBo;
	}

	/**
	 * Returns the response bo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the response bo
	 * @return the response bo, or <code>null</code> if a response bo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ResponseBo fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the response bos.
	 *
	 * @return the response bos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ResponseBo> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the response bos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResponseBoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of response bos
	 * @param end the upper bound of the range of response bos (not inclusive)
	 * @return the range of response bos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ResponseBo> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the response bos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResponseBoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of response bos
	 * @param end the upper bound of the range of response bos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of response bos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ResponseBo> findAll(int start, int end,
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

		List<ResponseBo> list = (List<ResponseBo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_RESPONSEBO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_RESPONSEBO;

				if (pagination) {
					sql = sql.concat(ResponseBoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ResponseBo>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ResponseBo>(list);
				}
				else {
					list = (List<ResponseBo>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the response bos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ResponseBo responseBo : findAll()) {
			remove(responseBo);
		}
	}

	/**
	 * Returns the number of response bos.
	 *
	 * @return the number of response bos
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

				Query q = session.createQuery(_SQL_COUNT_RESPONSEBO);

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
	 * Initializes the response bo persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.ResponseBo")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ResponseBo>> listenersList = new ArrayList<ModelListener<ResponseBo>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ResponseBo>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ResponseBoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_RESPONSEBO = "SELECT responseBo FROM ResponseBo responseBo";
	private static final String _SQL_COUNT_RESPONSEBO = "SELECT COUNT(responseBo) FROM ResponseBo responseBo";
	private static final String _ORDER_BY_ENTITY_ALIAS = "responseBo.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ResponseBo exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ResponseBoPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"isSuccess", "errorMessage"
			});
	private static ResponseBo _nullResponseBo = new ResponseBoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ResponseBo> toCacheModel() {
				return _nullResponseBoCacheModel;
			}
		};

	private static CacheModel<ResponseBo> _nullResponseBoCacheModel = new CacheModel<ResponseBo>() {
			@Override
			public ResponseBo toEntityModel() {
				return _nullResponseBo;
			}
		};
}