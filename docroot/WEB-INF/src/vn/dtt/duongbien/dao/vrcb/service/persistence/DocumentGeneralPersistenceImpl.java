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

import vn.dtt.duongbien.dao.vrcb.NoSuchDocumentGeneralException;
import vn.dtt.duongbien.dao.vrcb.model.DocumentGeneral;
import vn.dtt.duongbien.dao.vrcb.model.impl.DocumentGeneralImpl;
import vn.dtt.duongbien.dao.vrcb.model.impl.DocumentGeneralModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the document general service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DocumentGeneralPersistence
 * @see DocumentGeneralUtil
 * @generated
 */
public class DocumentGeneralPersistenceImpl extends BasePersistenceImpl<DocumentGeneral>
	implements DocumentGeneralPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DocumentGeneralUtil} to access the document general persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DocumentGeneralImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DocumentGeneralModelImpl.ENTITY_CACHE_ENABLED,
			DocumentGeneralModelImpl.FINDER_CACHE_ENABLED,
			DocumentGeneralImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DocumentGeneralModelImpl.ENTITY_CACHE_ENABLED,
			DocumentGeneralModelImpl.FINDER_CACHE_ENABLED,
			DocumentGeneralImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DocumentGeneralModelImpl.ENTITY_CACHE_ENABLED,
			DocumentGeneralModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public DocumentGeneralPersistenceImpl() {
		setModelClass(DocumentGeneral.class);
	}

	/**
	 * Caches the document general in the entity cache if it is enabled.
	 *
	 * @param documentGeneral the document general
	 */
	@Override
	public void cacheResult(DocumentGeneral documentGeneral) {
		EntityCacheUtil.putResult(DocumentGeneralModelImpl.ENTITY_CACHE_ENABLED,
			DocumentGeneralImpl.class, documentGeneral.getPrimaryKey(),
			documentGeneral);

		documentGeneral.resetOriginalValues();
	}

	/**
	 * Caches the document generals in the entity cache if it is enabled.
	 *
	 * @param documentGenerals the document generals
	 */
	@Override
	public void cacheResult(List<DocumentGeneral> documentGenerals) {
		for (DocumentGeneral documentGeneral : documentGenerals) {
			if (EntityCacheUtil.getResult(
						DocumentGeneralModelImpl.ENTITY_CACHE_ENABLED,
						DocumentGeneralImpl.class,
						documentGeneral.getPrimaryKey()) == null) {
				cacheResult(documentGeneral);
			}
			else {
				documentGeneral.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all document generals.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DocumentGeneralImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DocumentGeneralImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the document general.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DocumentGeneral documentGeneral) {
		EntityCacheUtil.removeResult(DocumentGeneralModelImpl.ENTITY_CACHE_ENABLED,
			DocumentGeneralImpl.class, documentGeneral.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DocumentGeneral> documentGenerals) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DocumentGeneral documentGeneral : documentGenerals) {
			EntityCacheUtil.removeResult(DocumentGeneralModelImpl.ENTITY_CACHE_ENABLED,
				DocumentGeneralImpl.class, documentGeneral.getPrimaryKey());
		}
	}

	/**
	 * Creates a new document general with the primary key. Does not add the document general to the database.
	 *
	 * @param id the primary key for the new document general
	 * @return the new document general
	 */
	@Override
	public DocumentGeneral create(long id) {
		DocumentGeneral documentGeneral = new DocumentGeneralImpl();

		documentGeneral.setNew(true);
		documentGeneral.setPrimaryKey(id);

		return documentGeneral;
	}

	/**
	 * Removes the document general with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the document general
	 * @return the document general that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDocumentGeneralException if a document general with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentGeneral remove(long id)
		throws NoSuchDocumentGeneralException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the document general with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the document general
	 * @return the document general that was removed
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDocumentGeneralException if a document general with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentGeneral remove(Serializable primaryKey)
		throws NoSuchDocumentGeneralException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DocumentGeneral documentGeneral = (DocumentGeneral)session.get(DocumentGeneralImpl.class,
					primaryKey);

			if (documentGeneral == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDocumentGeneralException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(documentGeneral);
		}
		catch (NoSuchDocumentGeneralException nsee) {
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
	protected DocumentGeneral removeImpl(DocumentGeneral documentGeneral)
		throws SystemException {
		documentGeneral = toUnwrappedModel(documentGeneral);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(documentGeneral)) {
				documentGeneral = (DocumentGeneral)session.get(DocumentGeneralImpl.class,
						documentGeneral.getPrimaryKeyObj());
			}

			if (documentGeneral != null) {
				session.delete(documentGeneral);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (documentGeneral != null) {
			clearCache(documentGeneral);
		}

		return documentGeneral;
	}

	@Override
	public DocumentGeneral updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DocumentGeneral documentGeneral)
		throws SystemException {
		documentGeneral = toUnwrappedModel(documentGeneral);

		boolean isNew = documentGeneral.isNew();

		Session session = null;

		try {
			session = openSession();

			if (documentGeneral.isNew()) {
				session.save(documentGeneral);

				documentGeneral.setNew(false);
			}
			else {
				session.merge(documentGeneral);
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

		EntityCacheUtil.putResult(DocumentGeneralModelImpl.ENTITY_CACHE_ENABLED,
			DocumentGeneralImpl.class, documentGeneral.getPrimaryKey(),
			documentGeneral);

		return documentGeneral;
	}

	protected DocumentGeneral toUnwrappedModel(DocumentGeneral documentGeneral) {
		if (documentGeneral instanceof DocumentGeneralImpl) {
			return documentGeneral;
		}

		DocumentGeneralImpl documentGeneralImpl = new DocumentGeneralImpl();

		documentGeneralImpl.setNew(documentGeneral.isNew());
		documentGeneralImpl.setPrimaryKey(documentGeneral.getPrimaryKey());

		documentGeneralImpl.setId(documentGeneral.getId());
		documentGeneralImpl.setDocumentNo(documentGeneral.getDocumentNo());
		documentGeneralImpl.setDocumentFunction(documentGeneral.getDocumentFunction());
		documentGeneralImpl.setIsArrival(documentGeneral.getIsArrival());
		documentGeneralImpl.setIsDeparture(documentGeneral.getIsDeparture());
		documentGeneralImpl.setShipCode(documentGeneral.getShipCode());
		documentGeneralImpl.setArrivalOrDeparturePortCode(documentGeneral.getArrivalOrDeparturePortCode());
		documentGeneralImpl.setTimeArrivalOrDeparture(documentGeneral.getTimeArrivalOrDeparture());
		documentGeneralImpl.setImoNumber(documentGeneral.getImoNumber());
		documentGeneralImpl.setCallSign(documentGeneral.getCallSign());
		documentGeneralImpl.setVoyageNumber(documentGeneral.getVoyageNumber());
		documentGeneralImpl.setShipNationCode(documentGeneral.getShipNationCode());
		documentGeneralImpl.setNameOfMaster(documentGeneral.getNameOfMaster());
		documentGeneralImpl.setLastPort(documentGeneral.getLastPort());
		documentGeneralImpl.setContactDetailShipAgent(documentGeneral.getContactDetailShipAgent());
		documentGeneralImpl.setGrossTonnage(documentGeneral.getGrossTonnage());
		documentGeneralImpl.setNetTonnage(documentGeneral.getNetTonnage());
		documentGeneralImpl.setPositionShipInPort(documentGeneral.getPositionShipInPort());
		documentGeneralImpl.setBriefParticularsVoyage(documentGeneral.getBriefParticularsVoyage());
		documentGeneralImpl.setBriefDescriptionCargo(documentGeneral.getBriefDescriptionCargo());
		documentGeneralImpl.setCrewNumber(documentGeneral.getCrewNumber());
		documentGeneralImpl.setPassengerNumber(documentGeneral.getPassengerNumber());
		documentGeneralImpl.setRemarks(documentGeneral.getRemarks());
		documentGeneralImpl.setCargoDeclaration(documentGeneral.getCargoDeclaration());
		documentGeneralImpl.setShipStoresDeclaration(documentGeneral.getShipStoresDeclaration());
		documentGeneralImpl.setCrewList(documentGeneral.getCrewList());
		documentGeneralImpl.setPassengerList(documentGeneral.getPassengerList());
		documentGeneralImpl.setShipRequirements(documentGeneral.getShipRequirements());
		documentGeneralImpl.setIsCrewEffectDeclaration(documentGeneral.getIsCrewEffectDeclaration());
		documentGeneralImpl.setIsMaritimeDeclarationHealth(documentGeneral.getIsMaritimeDeclarationHealth());
		documentGeneralImpl.setCreateDate(documentGeneral.getCreateDate());
		documentGeneralImpl.setModifyDate(documentGeneral.getModifyDate());

		return documentGeneralImpl;
	}

	/**
	 * Returns the document general with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the document general
	 * @return the document general
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDocumentGeneralException if a document general with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentGeneral findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDocumentGeneralException, SystemException {
		DocumentGeneral documentGeneral = fetchByPrimaryKey(primaryKey);

		if (documentGeneral == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDocumentGeneralException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return documentGeneral;
	}

	/**
	 * Returns the document general with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDocumentGeneralException} if it could not be found.
	 *
	 * @param id the primary key of the document general
	 * @return the document general
	 * @throws vn.dtt.duongbien.dao.vrcb.NoSuchDocumentGeneralException if a document general with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentGeneral findByPrimaryKey(long id)
		throws NoSuchDocumentGeneralException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the document general with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the document general
	 * @return the document general, or <code>null</code> if a document general with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentGeneral fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DocumentGeneral documentGeneral = (DocumentGeneral)EntityCacheUtil.getResult(DocumentGeneralModelImpl.ENTITY_CACHE_ENABLED,
				DocumentGeneralImpl.class, primaryKey);

		if (documentGeneral == _nullDocumentGeneral) {
			return null;
		}

		if (documentGeneral == null) {
			Session session = null;

			try {
				session = openSession();

				documentGeneral = (DocumentGeneral)session.get(DocumentGeneralImpl.class,
						primaryKey);

				if (documentGeneral != null) {
					cacheResult(documentGeneral);
				}
				else {
					EntityCacheUtil.putResult(DocumentGeneralModelImpl.ENTITY_CACHE_ENABLED,
						DocumentGeneralImpl.class, primaryKey,
						_nullDocumentGeneral);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DocumentGeneralModelImpl.ENTITY_CACHE_ENABLED,
					DocumentGeneralImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return documentGeneral;
	}

	/**
	 * Returns the document general with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the document general
	 * @return the document general, or <code>null</code> if a document general with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentGeneral fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the document generals.
	 *
	 * @return the document generals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentGeneral> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the document generals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DocumentGeneralModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of document generals
	 * @param end the upper bound of the range of document generals (not inclusive)
	 * @return the range of document generals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentGeneral> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the document generals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DocumentGeneralModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of document generals
	 * @param end the upper bound of the range of document generals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of document generals
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentGeneral> findAll(int start, int end,
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

		List<DocumentGeneral> list = (List<DocumentGeneral>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DOCUMENTGENERAL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOCUMENTGENERAL;

				if (pagination) {
					sql = sql.concat(DocumentGeneralModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DocumentGeneral>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DocumentGeneral>(list);
				}
				else {
					list = (List<DocumentGeneral>)QueryUtil.list(q,
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
	 * Removes all the document generals from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DocumentGeneral documentGeneral : findAll()) {
			remove(documentGeneral);
		}
	}

	/**
	 * Returns the number of document generals.
	 *
	 * @return the number of document generals
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

				Query q = session.createQuery(_SQL_COUNT_DOCUMENTGENERAL);

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
	 * Initializes the document general persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.duongbien.dao.vrcb.model.DocumentGeneral")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DocumentGeneral>> listenersList = new ArrayList<ModelListener<DocumentGeneral>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DocumentGeneral>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DocumentGeneralImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DOCUMENTGENERAL = "SELECT documentGeneral FROM DocumentGeneral documentGeneral";
	private static final String _SQL_COUNT_DOCUMENTGENERAL = "SELECT COUNT(documentGeneral) FROM DocumentGeneral documentGeneral";
	private static final String _ORDER_BY_ENTITY_ALIAS = "documentGeneral.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DocumentGeneral exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DocumentGeneralPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"documentNo", "documentFunction", "isArrival", "isDeparture",
				"shipCode", "arrivalOrDeparturePortCode",
				"timeArrivalOrDeparture", "imoNumber", "callSign",
				"voyageNumber", "shipNationCode", "nameOfMaster", "lastPort",
				"contactDetailShipAgent", "grossTonnage", "netTonnage",
				"positionShipInPort", "briefParticularsVoyage",
				"briefDescriptionCargo", "crewNumber", "passengerNumber",
				"cargoDeclaration", "shipStoresDeclaration", "crewList",
				"passengerList", "shipRequirements", "isCrewEffectDeclaration",
				"isMaritimeDeclarationHealth", "createDate", "modifyDate"
			});
	private static DocumentGeneral _nullDocumentGeneral = new DocumentGeneralImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DocumentGeneral> toCacheModel() {
				return _nullDocumentGeneralCacheModel;
			}
		};

	private static CacheModel<DocumentGeneral> _nullDocumentGeneralCacheModel = new CacheModel<DocumentGeneral>() {
			@Override
			public DocumentGeneral toEntityModel() {
				return _nullDocumentGeneral;
			}
		};
}