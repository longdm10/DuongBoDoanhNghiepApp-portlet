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

package vn.dtt.duongbien.dao.vrcb.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine;
import vn.dtt.duongbien.dao.vrcb.service.TempDeclarationForAnimalQuarantineLocalService;
import vn.dtt.duongbien.dao.vrcb.service.persistence.CrewListPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmArrivalPurposePersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmCertificatePersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmDocTypePersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmEnterrisePersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmGTBusinessTypePersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmGTFunctionTypePersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmGTShipPositionPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmGoodsPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmGoodsTypePersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmGtOrganizationPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmGtReportCategoryPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmGtReportTemplatePersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmGtRouteConfigPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmGtStatusPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmGtVersionPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmHistoryArrivalPurposePersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmHistoryDocTypePersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmHistoryEnterrisePersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmHistoryGoodsPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmHistoryGoodsTypePersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmHistoryMaritimePersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmHistoryMinistryPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmHistoryPackagePersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmHistoryPassportTypePersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmHistoryPortHarbourPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmHistoryPortPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmHistoryPortRegionPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmHistoryPortWharfPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmHistoryRankRatingPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmHistoryRepresentativePersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmHistorySecurityLevelPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmHistoryShipAgencyPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmHistoryShipTypePersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmHistoryStatePersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmHistoryUnitGeneralPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmMaritimePersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmMinistryPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmPackagePersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmPassportTypePersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmPortHarbourPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmPortPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmPortRegionPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmPortWharfPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmRankRatingPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmRepresentativePersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmSecurityLevelPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmShipAgencyPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmShipTypePersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmStatePersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmSyncCategoryPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmTestN01RequestPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DmUnitGeneralPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DocumentGeneralPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.DocumentPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.HistoryInterfaceRequestFieldPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.HistoryInterfaceRequestPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.HistoryRmdcShipPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.HistorySyncVersionPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.InterfaceRequestFieldPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.InterfaceRequestPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.IssueAcceptanceForTransitPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.IssuePermissionForTransitPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.IssuePortClearancePersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.IssueShiftingOrderPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.LogMessageValidationPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.ModifyPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.NoticeShipMessagePersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.PassengerListPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.ResponseBoPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.ResultCertificatePersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.ResultCompetionPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.ResultDeclarationPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.ResultHistoryMinistryPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.ResultMinistryPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.ResultNotificationPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.RmdcShipPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.TempAnimalQuarantinePersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.TempAttachmentDeclarationHealthPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.TempCargoDeclarationPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.TempCrewDetailsPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.TempCrewEffectsDeclarationPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.TempCrewEffectsItemsPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.TempCrewListPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.TempDangerousGoodsItemsPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.TempDangerousGoodsNanifestPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.TempDeclarationForAnimalQuarantinePersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.TempDeclarationForPlantQuarantinePersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.TempDeclarationOfHealthPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.TempDocumentPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.TempGeneralDeclarationPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.TempGoodsItemsPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.TempHealthCrewPassengerListPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.TempHealthQuestionPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.TempNoTiceShipMessagePersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.TempPassengerDetailsPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.TempPassengerListPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.TempPlantQuarantinePersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.TempShipSecurityMessagePersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.TempShipSecurityPortItemsPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.TempShipStoresDeclarationPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.TempShipStoresItemsPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.TempUnitGeneralPersistence;
import vn.dtt.duongbien.dao.vrcb.service.persistence.UserPortPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the temp declaration for animal quarantine local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link vn.dtt.duongbien.dao.vrcb.service.impl.TempDeclarationForAnimalQuarantineLocalServiceImpl}.
 * </p>
 *
 * @author longdm
 * @see vn.dtt.duongbien.dao.vrcb.service.impl.TempDeclarationForAnimalQuarantineLocalServiceImpl
 * @see vn.dtt.duongbien.dao.vrcb.service.TempDeclarationForAnimalQuarantineLocalServiceUtil
 * @generated
 */
public abstract class TempDeclarationForAnimalQuarantineLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements TempDeclarationForAnimalQuarantineLocalService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link vn.dtt.duongbien.dao.vrcb.service.TempDeclarationForAnimalQuarantineLocalServiceUtil} to access the temp declaration for animal quarantine local service.
	 */

	/**
	 * Adds the temp declaration for animal quarantine to the database. Also notifies the appropriate model listeners.
	 *
	 * @param tempDeclarationForAnimalQuarantine the temp declaration for animal quarantine
	 * @return the temp declaration for animal quarantine that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public TempDeclarationForAnimalQuarantine addTempDeclarationForAnimalQuarantine(
		TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine)
		throws SystemException {
		tempDeclarationForAnimalQuarantine.setNew(true);

		return tempDeclarationForAnimalQuarantinePersistence.update(tempDeclarationForAnimalQuarantine);
	}

	/**
	 * Creates a new temp declaration for animal quarantine with the primary key. Does not add the temp declaration for animal quarantine to the database.
	 *
	 * @param id the primary key for the new temp declaration for animal quarantine
	 * @return the new temp declaration for animal quarantine
	 */
	@Override
	public TempDeclarationForAnimalQuarantine createTempDeclarationForAnimalQuarantine(
		long id) {
		return tempDeclarationForAnimalQuarantinePersistence.create(id);
	}

	/**
	 * Deletes the temp declaration for animal quarantine with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the temp declaration for animal quarantine
	 * @return the temp declaration for animal quarantine that was removed
	 * @throws PortalException if a temp declaration for animal quarantine with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public TempDeclarationForAnimalQuarantine deleteTempDeclarationForAnimalQuarantine(
		long id) throws PortalException, SystemException {
		return tempDeclarationForAnimalQuarantinePersistence.remove(id);
	}

	/**
	 * Deletes the temp declaration for animal quarantine from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tempDeclarationForAnimalQuarantine the temp declaration for animal quarantine
	 * @return the temp declaration for animal quarantine that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public TempDeclarationForAnimalQuarantine deleteTempDeclarationForAnimalQuarantine(
		TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine)
		throws SystemException {
		return tempDeclarationForAnimalQuarantinePersistence.remove(tempDeclarationForAnimalQuarantine);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(TempDeclarationForAnimalQuarantine.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return tempDeclarationForAnimalQuarantinePersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDeclarationForAnimalQuarantineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return tempDeclarationForAnimalQuarantinePersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDeclarationForAnimalQuarantineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return tempDeclarationForAnimalQuarantinePersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return tempDeclarationForAnimalQuarantinePersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return tempDeclarationForAnimalQuarantinePersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public TempDeclarationForAnimalQuarantine fetchTempDeclarationForAnimalQuarantine(
		long id) throws SystemException {
		return tempDeclarationForAnimalQuarantinePersistence.fetchByPrimaryKey(id);
	}

	/**
	 * Returns the temp declaration for animal quarantine with the primary key.
	 *
	 * @param id the primary key of the temp declaration for animal quarantine
	 * @return the temp declaration for animal quarantine
	 * @throws PortalException if a temp declaration for animal quarantine with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TempDeclarationForAnimalQuarantine getTempDeclarationForAnimalQuarantine(
		long id) throws PortalException, SystemException {
		return tempDeclarationForAnimalQuarantinePersistence.findByPrimaryKey(id);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return tempDeclarationForAnimalQuarantinePersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the temp declaration for animal quarantines.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDeclarationForAnimalQuarantineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of temp declaration for animal quarantines
	 * @param end the upper bound of the range of temp declaration for animal quarantines (not inclusive)
	 * @return the range of temp declaration for animal quarantines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TempDeclarationForAnimalQuarantine> getTempDeclarationForAnimalQuarantines(
		int start, int end) throws SystemException {
		return tempDeclarationForAnimalQuarantinePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of temp declaration for animal quarantines.
	 *
	 * @return the number of temp declaration for animal quarantines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getTempDeclarationForAnimalQuarantinesCount()
		throws SystemException {
		return tempDeclarationForAnimalQuarantinePersistence.countAll();
	}

	/**
	 * Updates the temp declaration for animal quarantine in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param tempDeclarationForAnimalQuarantine the temp declaration for animal quarantine
	 * @return the temp declaration for animal quarantine that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public TempDeclarationForAnimalQuarantine updateTempDeclarationForAnimalQuarantine(
		TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine)
		throws SystemException {
		return tempDeclarationForAnimalQuarantinePersistence.update(tempDeclarationForAnimalQuarantine);
	}

	/**
	 * Returns the crew list local service.
	 *
	 * @return the crew list local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.CrewListLocalService getCrewListLocalService() {
		return crewListLocalService;
	}

	/**
	 * Sets the crew list local service.
	 *
	 * @param crewListLocalService the crew list local service
	 */
	public void setCrewListLocalService(
		vn.dtt.duongbien.dao.vrcb.service.CrewListLocalService crewListLocalService) {
		this.crewListLocalService = crewListLocalService;
	}

	/**
	 * Returns the crew list remote service.
	 *
	 * @return the crew list remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.CrewListService getCrewListService() {
		return crewListService;
	}

	/**
	 * Sets the crew list remote service.
	 *
	 * @param crewListService the crew list remote service
	 */
	public void setCrewListService(
		vn.dtt.duongbien.dao.vrcb.service.CrewListService crewListService) {
		this.crewListService = crewListService;
	}

	/**
	 * Returns the crew list persistence.
	 *
	 * @return the crew list persistence
	 */
	public CrewListPersistence getCrewListPersistence() {
		return crewListPersistence;
	}

	/**
	 * Sets the crew list persistence.
	 *
	 * @param crewListPersistence the crew list persistence
	 */
	public void setCrewListPersistence(CrewListPersistence crewListPersistence) {
		this.crewListPersistence = crewListPersistence;
	}

	/**
	 * Returns the dm arrival purpose local service.
	 *
	 * @return the dm arrival purpose local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmArrivalPurposeLocalService getDmArrivalPurposeLocalService() {
		return dmArrivalPurposeLocalService;
	}

	/**
	 * Sets the dm arrival purpose local service.
	 *
	 * @param dmArrivalPurposeLocalService the dm arrival purpose local service
	 */
	public void setDmArrivalPurposeLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmArrivalPurposeLocalService dmArrivalPurposeLocalService) {
		this.dmArrivalPurposeLocalService = dmArrivalPurposeLocalService;
	}

	/**
	 * Returns the dm arrival purpose persistence.
	 *
	 * @return the dm arrival purpose persistence
	 */
	public DmArrivalPurposePersistence getDmArrivalPurposePersistence() {
		return dmArrivalPurposePersistence;
	}

	/**
	 * Sets the dm arrival purpose persistence.
	 *
	 * @param dmArrivalPurposePersistence the dm arrival purpose persistence
	 */
	public void setDmArrivalPurposePersistence(
		DmArrivalPurposePersistence dmArrivalPurposePersistence) {
		this.dmArrivalPurposePersistence = dmArrivalPurposePersistence;
	}

	/**
	 * Returns the dm certificate local service.
	 *
	 * @return the dm certificate local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmCertificateLocalService getDmCertificateLocalService() {
		return dmCertificateLocalService;
	}

	/**
	 * Sets the dm certificate local service.
	 *
	 * @param dmCertificateLocalService the dm certificate local service
	 */
	public void setDmCertificateLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmCertificateLocalService dmCertificateLocalService) {
		this.dmCertificateLocalService = dmCertificateLocalService;
	}

	/**
	 * Returns the dm certificate remote service.
	 *
	 * @return the dm certificate remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmCertificateService getDmCertificateService() {
		return dmCertificateService;
	}

	/**
	 * Sets the dm certificate remote service.
	 *
	 * @param dmCertificateService the dm certificate remote service
	 */
	public void setDmCertificateService(
		vn.dtt.duongbien.dao.vrcb.service.DmCertificateService dmCertificateService) {
		this.dmCertificateService = dmCertificateService;
	}

	/**
	 * Returns the dm certificate persistence.
	 *
	 * @return the dm certificate persistence
	 */
	public DmCertificatePersistence getDmCertificatePersistence() {
		return dmCertificatePersistence;
	}

	/**
	 * Sets the dm certificate persistence.
	 *
	 * @param dmCertificatePersistence the dm certificate persistence
	 */
	public void setDmCertificatePersistence(
		DmCertificatePersistence dmCertificatePersistence) {
		this.dmCertificatePersistence = dmCertificatePersistence;
	}

	/**
	 * Returns the dm doc type local service.
	 *
	 * @return the dm doc type local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmDocTypeLocalService getDmDocTypeLocalService() {
		return dmDocTypeLocalService;
	}

	/**
	 * Sets the dm doc type local service.
	 *
	 * @param dmDocTypeLocalService the dm doc type local service
	 */
	public void setDmDocTypeLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmDocTypeLocalService dmDocTypeLocalService) {
		this.dmDocTypeLocalService = dmDocTypeLocalService;
	}

	/**
	 * Returns the dm doc type persistence.
	 *
	 * @return the dm doc type persistence
	 */
	public DmDocTypePersistence getDmDocTypePersistence() {
		return dmDocTypePersistence;
	}

	/**
	 * Sets the dm doc type persistence.
	 *
	 * @param dmDocTypePersistence the dm doc type persistence
	 */
	public void setDmDocTypePersistence(
		DmDocTypePersistence dmDocTypePersistence) {
		this.dmDocTypePersistence = dmDocTypePersistence;
	}

	/**
	 * Returns the dm enterrise local service.
	 *
	 * @return the dm enterrise local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmEnterriseLocalService getDmEnterriseLocalService() {
		return dmEnterriseLocalService;
	}

	/**
	 * Sets the dm enterrise local service.
	 *
	 * @param dmEnterriseLocalService the dm enterrise local service
	 */
	public void setDmEnterriseLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmEnterriseLocalService dmEnterriseLocalService) {
		this.dmEnterriseLocalService = dmEnterriseLocalService;
	}

	/**
	 * Returns the dm enterrise persistence.
	 *
	 * @return the dm enterrise persistence
	 */
	public DmEnterrisePersistence getDmEnterrisePersistence() {
		return dmEnterrisePersistence;
	}

	/**
	 * Sets the dm enterrise persistence.
	 *
	 * @param dmEnterrisePersistence the dm enterrise persistence
	 */
	public void setDmEnterrisePersistence(
		DmEnterrisePersistence dmEnterrisePersistence) {
		this.dmEnterrisePersistence = dmEnterrisePersistence;
	}

	/**
	 * Returns the dm goods local service.
	 *
	 * @return the dm goods local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmGoodsLocalService getDmGoodsLocalService() {
		return dmGoodsLocalService;
	}

	/**
	 * Sets the dm goods local service.
	 *
	 * @param dmGoodsLocalService the dm goods local service
	 */
	public void setDmGoodsLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmGoodsLocalService dmGoodsLocalService) {
		this.dmGoodsLocalService = dmGoodsLocalService;
	}

	/**
	 * Returns the dm goods persistence.
	 *
	 * @return the dm goods persistence
	 */
	public DmGoodsPersistence getDmGoodsPersistence() {
		return dmGoodsPersistence;
	}

	/**
	 * Sets the dm goods persistence.
	 *
	 * @param dmGoodsPersistence the dm goods persistence
	 */
	public void setDmGoodsPersistence(DmGoodsPersistence dmGoodsPersistence) {
		this.dmGoodsPersistence = dmGoodsPersistence;
	}

	/**
	 * Returns the dm goods type local service.
	 *
	 * @return the dm goods type local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmGoodsTypeLocalService getDmGoodsTypeLocalService() {
		return dmGoodsTypeLocalService;
	}

	/**
	 * Sets the dm goods type local service.
	 *
	 * @param dmGoodsTypeLocalService the dm goods type local service
	 */
	public void setDmGoodsTypeLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmGoodsTypeLocalService dmGoodsTypeLocalService) {
		this.dmGoodsTypeLocalService = dmGoodsTypeLocalService;
	}

	/**
	 * Returns the dm goods type persistence.
	 *
	 * @return the dm goods type persistence
	 */
	public DmGoodsTypePersistence getDmGoodsTypePersistence() {
		return dmGoodsTypePersistence;
	}

	/**
	 * Sets the dm goods type persistence.
	 *
	 * @param dmGoodsTypePersistence the dm goods type persistence
	 */
	public void setDmGoodsTypePersistence(
		DmGoodsTypePersistence dmGoodsTypePersistence) {
		this.dmGoodsTypePersistence = dmGoodsTypePersistence;
	}

	/**
	 * Returns the dm g t business type local service.
	 *
	 * @return the dm g t business type local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmGTBusinessTypeLocalService getDmGTBusinessTypeLocalService() {
		return dmGTBusinessTypeLocalService;
	}

	/**
	 * Sets the dm g t business type local service.
	 *
	 * @param dmGTBusinessTypeLocalService the dm g t business type local service
	 */
	public void setDmGTBusinessTypeLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmGTBusinessTypeLocalService dmGTBusinessTypeLocalService) {
		this.dmGTBusinessTypeLocalService = dmGTBusinessTypeLocalService;
	}

	/**
	 * Returns the dm g t business type remote service.
	 *
	 * @return the dm g t business type remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmGTBusinessTypeService getDmGTBusinessTypeService() {
		return dmGTBusinessTypeService;
	}

	/**
	 * Sets the dm g t business type remote service.
	 *
	 * @param dmGTBusinessTypeService the dm g t business type remote service
	 */
	public void setDmGTBusinessTypeService(
		vn.dtt.duongbien.dao.vrcb.service.DmGTBusinessTypeService dmGTBusinessTypeService) {
		this.dmGTBusinessTypeService = dmGTBusinessTypeService;
	}

	/**
	 * Returns the dm g t business type persistence.
	 *
	 * @return the dm g t business type persistence
	 */
	public DmGTBusinessTypePersistence getDmGTBusinessTypePersistence() {
		return dmGTBusinessTypePersistence;
	}

	/**
	 * Sets the dm g t business type persistence.
	 *
	 * @param dmGTBusinessTypePersistence the dm g t business type persistence
	 */
	public void setDmGTBusinessTypePersistence(
		DmGTBusinessTypePersistence dmGTBusinessTypePersistence) {
		this.dmGTBusinessTypePersistence = dmGTBusinessTypePersistence;
	}

	/**
	 * Returns the dm g t function type local service.
	 *
	 * @return the dm g t function type local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmGTFunctionTypeLocalService getDmGTFunctionTypeLocalService() {
		return dmGTFunctionTypeLocalService;
	}

	/**
	 * Sets the dm g t function type local service.
	 *
	 * @param dmGTFunctionTypeLocalService the dm g t function type local service
	 */
	public void setDmGTFunctionTypeLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmGTFunctionTypeLocalService dmGTFunctionTypeLocalService) {
		this.dmGTFunctionTypeLocalService = dmGTFunctionTypeLocalService;
	}

	/**
	 * Returns the dm g t function type remote service.
	 *
	 * @return the dm g t function type remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmGTFunctionTypeService getDmGTFunctionTypeService() {
		return dmGTFunctionTypeService;
	}

	/**
	 * Sets the dm g t function type remote service.
	 *
	 * @param dmGTFunctionTypeService the dm g t function type remote service
	 */
	public void setDmGTFunctionTypeService(
		vn.dtt.duongbien.dao.vrcb.service.DmGTFunctionTypeService dmGTFunctionTypeService) {
		this.dmGTFunctionTypeService = dmGTFunctionTypeService;
	}

	/**
	 * Returns the dm g t function type persistence.
	 *
	 * @return the dm g t function type persistence
	 */
	public DmGTFunctionTypePersistence getDmGTFunctionTypePersistence() {
		return dmGTFunctionTypePersistence;
	}

	/**
	 * Sets the dm g t function type persistence.
	 *
	 * @param dmGTFunctionTypePersistence the dm g t function type persistence
	 */
	public void setDmGTFunctionTypePersistence(
		DmGTFunctionTypePersistence dmGTFunctionTypePersistence) {
		this.dmGTFunctionTypePersistence = dmGTFunctionTypePersistence;
	}

	/**
	 * Returns the dm gt organization local service.
	 *
	 * @return the dm gt organization local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmGtOrganizationLocalService getDmGtOrganizationLocalService() {
		return dmGtOrganizationLocalService;
	}

	/**
	 * Sets the dm gt organization local service.
	 *
	 * @param dmGtOrganizationLocalService the dm gt organization local service
	 */
	public void setDmGtOrganizationLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmGtOrganizationLocalService dmGtOrganizationLocalService) {
		this.dmGtOrganizationLocalService = dmGtOrganizationLocalService;
	}

	/**
	 * Returns the dm gt organization remote service.
	 *
	 * @return the dm gt organization remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmGtOrganizationService getDmGtOrganizationService() {
		return dmGtOrganizationService;
	}

	/**
	 * Sets the dm gt organization remote service.
	 *
	 * @param dmGtOrganizationService the dm gt organization remote service
	 */
	public void setDmGtOrganizationService(
		vn.dtt.duongbien.dao.vrcb.service.DmGtOrganizationService dmGtOrganizationService) {
		this.dmGtOrganizationService = dmGtOrganizationService;
	}

	/**
	 * Returns the dm gt organization persistence.
	 *
	 * @return the dm gt organization persistence
	 */
	public DmGtOrganizationPersistence getDmGtOrganizationPersistence() {
		return dmGtOrganizationPersistence;
	}

	/**
	 * Sets the dm gt organization persistence.
	 *
	 * @param dmGtOrganizationPersistence the dm gt organization persistence
	 */
	public void setDmGtOrganizationPersistence(
		DmGtOrganizationPersistence dmGtOrganizationPersistence) {
		this.dmGtOrganizationPersistence = dmGtOrganizationPersistence;
	}

	/**
	 * Returns the dm gt report category local service.
	 *
	 * @return the dm gt report category local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmGtReportCategoryLocalService getDmGtReportCategoryLocalService() {
		return dmGtReportCategoryLocalService;
	}

	/**
	 * Sets the dm gt report category local service.
	 *
	 * @param dmGtReportCategoryLocalService the dm gt report category local service
	 */
	public void setDmGtReportCategoryLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmGtReportCategoryLocalService dmGtReportCategoryLocalService) {
		this.dmGtReportCategoryLocalService = dmGtReportCategoryLocalService;
	}

	/**
	 * Returns the dm gt report category remote service.
	 *
	 * @return the dm gt report category remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmGtReportCategoryService getDmGtReportCategoryService() {
		return dmGtReportCategoryService;
	}

	/**
	 * Sets the dm gt report category remote service.
	 *
	 * @param dmGtReportCategoryService the dm gt report category remote service
	 */
	public void setDmGtReportCategoryService(
		vn.dtt.duongbien.dao.vrcb.service.DmGtReportCategoryService dmGtReportCategoryService) {
		this.dmGtReportCategoryService = dmGtReportCategoryService;
	}

	/**
	 * Returns the dm gt report category persistence.
	 *
	 * @return the dm gt report category persistence
	 */
	public DmGtReportCategoryPersistence getDmGtReportCategoryPersistence() {
		return dmGtReportCategoryPersistence;
	}

	/**
	 * Sets the dm gt report category persistence.
	 *
	 * @param dmGtReportCategoryPersistence the dm gt report category persistence
	 */
	public void setDmGtReportCategoryPersistence(
		DmGtReportCategoryPersistence dmGtReportCategoryPersistence) {
		this.dmGtReportCategoryPersistence = dmGtReportCategoryPersistence;
	}

	/**
	 * Returns the dm gt report template local service.
	 *
	 * @return the dm gt report template local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmGtReportTemplateLocalService getDmGtReportTemplateLocalService() {
		return dmGtReportTemplateLocalService;
	}

	/**
	 * Sets the dm gt report template local service.
	 *
	 * @param dmGtReportTemplateLocalService the dm gt report template local service
	 */
	public void setDmGtReportTemplateLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmGtReportTemplateLocalService dmGtReportTemplateLocalService) {
		this.dmGtReportTemplateLocalService = dmGtReportTemplateLocalService;
	}

	/**
	 * Returns the dm gt report template remote service.
	 *
	 * @return the dm gt report template remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmGtReportTemplateService getDmGtReportTemplateService() {
		return dmGtReportTemplateService;
	}

	/**
	 * Sets the dm gt report template remote service.
	 *
	 * @param dmGtReportTemplateService the dm gt report template remote service
	 */
	public void setDmGtReportTemplateService(
		vn.dtt.duongbien.dao.vrcb.service.DmGtReportTemplateService dmGtReportTemplateService) {
		this.dmGtReportTemplateService = dmGtReportTemplateService;
	}

	/**
	 * Returns the dm gt report template persistence.
	 *
	 * @return the dm gt report template persistence
	 */
	public DmGtReportTemplatePersistence getDmGtReportTemplatePersistence() {
		return dmGtReportTemplatePersistence;
	}

	/**
	 * Sets the dm gt report template persistence.
	 *
	 * @param dmGtReportTemplatePersistence the dm gt report template persistence
	 */
	public void setDmGtReportTemplatePersistence(
		DmGtReportTemplatePersistence dmGtReportTemplatePersistence) {
		this.dmGtReportTemplatePersistence = dmGtReportTemplatePersistence;
	}

	/**
	 * Returns the dm gt route config local service.
	 *
	 * @return the dm gt route config local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmGtRouteConfigLocalService getDmGtRouteConfigLocalService() {
		return dmGtRouteConfigLocalService;
	}

	/**
	 * Sets the dm gt route config local service.
	 *
	 * @param dmGtRouteConfigLocalService the dm gt route config local service
	 */
	public void setDmGtRouteConfigLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmGtRouteConfigLocalService dmGtRouteConfigLocalService) {
		this.dmGtRouteConfigLocalService = dmGtRouteConfigLocalService;
	}

	/**
	 * Returns the dm gt route config remote service.
	 *
	 * @return the dm gt route config remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmGtRouteConfigService getDmGtRouteConfigService() {
		return dmGtRouteConfigService;
	}

	/**
	 * Sets the dm gt route config remote service.
	 *
	 * @param dmGtRouteConfigService the dm gt route config remote service
	 */
	public void setDmGtRouteConfigService(
		vn.dtt.duongbien.dao.vrcb.service.DmGtRouteConfigService dmGtRouteConfigService) {
		this.dmGtRouteConfigService = dmGtRouteConfigService;
	}

	/**
	 * Returns the dm gt route config persistence.
	 *
	 * @return the dm gt route config persistence
	 */
	public DmGtRouteConfigPersistence getDmGtRouteConfigPersistence() {
		return dmGtRouteConfigPersistence;
	}

	/**
	 * Sets the dm gt route config persistence.
	 *
	 * @param dmGtRouteConfigPersistence the dm gt route config persistence
	 */
	public void setDmGtRouteConfigPersistence(
		DmGtRouteConfigPersistence dmGtRouteConfigPersistence) {
		this.dmGtRouteConfigPersistence = dmGtRouteConfigPersistence;
	}

	/**
	 * Returns the dm g t ship position local service.
	 *
	 * @return the dm g t ship position local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmGTShipPositionLocalService getDmGTShipPositionLocalService() {
		return dmGTShipPositionLocalService;
	}

	/**
	 * Sets the dm g t ship position local service.
	 *
	 * @param dmGTShipPositionLocalService the dm g t ship position local service
	 */
	public void setDmGTShipPositionLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmGTShipPositionLocalService dmGTShipPositionLocalService) {
		this.dmGTShipPositionLocalService = dmGTShipPositionLocalService;
	}

	/**
	 * Returns the dm g t ship position remote service.
	 *
	 * @return the dm g t ship position remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmGTShipPositionService getDmGTShipPositionService() {
		return dmGTShipPositionService;
	}

	/**
	 * Sets the dm g t ship position remote service.
	 *
	 * @param dmGTShipPositionService the dm g t ship position remote service
	 */
	public void setDmGTShipPositionService(
		vn.dtt.duongbien.dao.vrcb.service.DmGTShipPositionService dmGTShipPositionService) {
		this.dmGTShipPositionService = dmGTShipPositionService;
	}

	/**
	 * Returns the dm g t ship position persistence.
	 *
	 * @return the dm g t ship position persistence
	 */
	public DmGTShipPositionPersistence getDmGTShipPositionPersistence() {
		return dmGTShipPositionPersistence;
	}

	/**
	 * Sets the dm g t ship position persistence.
	 *
	 * @param dmGTShipPositionPersistence the dm g t ship position persistence
	 */
	public void setDmGTShipPositionPersistence(
		DmGTShipPositionPersistence dmGTShipPositionPersistence) {
		this.dmGTShipPositionPersistence = dmGTShipPositionPersistence;
	}

	/**
	 * Returns the dm gt status local service.
	 *
	 * @return the dm gt status local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmGtStatusLocalService getDmGtStatusLocalService() {
		return dmGtStatusLocalService;
	}

	/**
	 * Sets the dm gt status local service.
	 *
	 * @param dmGtStatusLocalService the dm gt status local service
	 */
	public void setDmGtStatusLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmGtStatusLocalService dmGtStatusLocalService) {
		this.dmGtStatusLocalService = dmGtStatusLocalService;
	}

	/**
	 * Returns the dm gt status remote service.
	 *
	 * @return the dm gt status remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmGtStatusService getDmGtStatusService() {
		return dmGtStatusService;
	}

	/**
	 * Sets the dm gt status remote service.
	 *
	 * @param dmGtStatusService the dm gt status remote service
	 */
	public void setDmGtStatusService(
		vn.dtt.duongbien.dao.vrcb.service.DmGtStatusService dmGtStatusService) {
		this.dmGtStatusService = dmGtStatusService;
	}

	/**
	 * Returns the dm gt status persistence.
	 *
	 * @return the dm gt status persistence
	 */
	public DmGtStatusPersistence getDmGtStatusPersistence() {
		return dmGtStatusPersistence;
	}

	/**
	 * Sets the dm gt status persistence.
	 *
	 * @param dmGtStatusPersistence the dm gt status persistence
	 */
	public void setDmGtStatusPersistence(
		DmGtStatusPersistence dmGtStatusPersistence) {
		this.dmGtStatusPersistence = dmGtStatusPersistence;
	}

	/**
	 * Returns the dm gt version local service.
	 *
	 * @return the dm gt version local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmGtVersionLocalService getDmGtVersionLocalService() {
		return dmGtVersionLocalService;
	}

	/**
	 * Sets the dm gt version local service.
	 *
	 * @param dmGtVersionLocalService the dm gt version local service
	 */
	public void setDmGtVersionLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmGtVersionLocalService dmGtVersionLocalService) {
		this.dmGtVersionLocalService = dmGtVersionLocalService;
	}

	/**
	 * Returns the dm gt version persistence.
	 *
	 * @return the dm gt version persistence
	 */
	public DmGtVersionPersistence getDmGtVersionPersistence() {
		return dmGtVersionPersistence;
	}

	/**
	 * Sets the dm gt version persistence.
	 *
	 * @param dmGtVersionPersistence the dm gt version persistence
	 */
	public void setDmGtVersionPersistence(
		DmGtVersionPersistence dmGtVersionPersistence) {
		this.dmGtVersionPersistence = dmGtVersionPersistence;
	}

	/**
	 * Returns the dm history arrival purpose local service.
	 *
	 * @return the dm history arrival purpose local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmHistoryArrivalPurposeLocalService getDmHistoryArrivalPurposeLocalService() {
		return dmHistoryArrivalPurposeLocalService;
	}

	/**
	 * Sets the dm history arrival purpose local service.
	 *
	 * @param dmHistoryArrivalPurposeLocalService the dm history arrival purpose local service
	 */
	public void setDmHistoryArrivalPurposeLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmHistoryArrivalPurposeLocalService dmHistoryArrivalPurposeLocalService) {
		this.dmHistoryArrivalPurposeLocalService = dmHistoryArrivalPurposeLocalService;
	}

	/**
	 * Returns the dm history arrival purpose persistence.
	 *
	 * @return the dm history arrival purpose persistence
	 */
	public DmHistoryArrivalPurposePersistence getDmHistoryArrivalPurposePersistence() {
		return dmHistoryArrivalPurposePersistence;
	}

	/**
	 * Sets the dm history arrival purpose persistence.
	 *
	 * @param dmHistoryArrivalPurposePersistence the dm history arrival purpose persistence
	 */
	public void setDmHistoryArrivalPurposePersistence(
		DmHistoryArrivalPurposePersistence dmHistoryArrivalPurposePersistence) {
		this.dmHistoryArrivalPurposePersistence = dmHistoryArrivalPurposePersistence;
	}

	/**
	 * Returns the dm history doc type local service.
	 *
	 * @return the dm history doc type local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmHistoryDocTypeLocalService getDmHistoryDocTypeLocalService() {
		return dmHistoryDocTypeLocalService;
	}

	/**
	 * Sets the dm history doc type local service.
	 *
	 * @param dmHistoryDocTypeLocalService the dm history doc type local service
	 */
	public void setDmHistoryDocTypeLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmHistoryDocTypeLocalService dmHistoryDocTypeLocalService) {
		this.dmHistoryDocTypeLocalService = dmHistoryDocTypeLocalService;
	}

	/**
	 * Returns the dm history doc type persistence.
	 *
	 * @return the dm history doc type persistence
	 */
	public DmHistoryDocTypePersistence getDmHistoryDocTypePersistence() {
		return dmHistoryDocTypePersistence;
	}

	/**
	 * Sets the dm history doc type persistence.
	 *
	 * @param dmHistoryDocTypePersistence the dm history doc type persistence
	 */
	public void setDmHistoryDocTypePersistence(
		DmHistoryDocTypePersistence dmHistoryDocTypePersistence) {
		this.dmHistoryDocTypePersistence = dmHistoryDocTypePersistence;
	}

	/**
	 * Returns the dm history enterrise local service.
	 *
	 * @return the dm history enterrise local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmHistoryEnterriseLocalService getDmHistoryEnterriseLocalService() {
		return dmHistoryEnterriseLocalService;
	}

	/**
	 * Sets the dm history enterrise local service.
	 *
	 * @param dmHistoryEnterriseLocalService the dm history enterrise local service
	 */
	public void setDmHistoryEnterriseLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmHistoryEnterriseLocalService dmHistoryEnterriseLocalService) {
		this.dmHistoryEnterriseLocalService = dmHistoryEnterriseLocalService;
	}

	/**
	 * Returns the dm history enterrise persistence.
	 *
	 * @return the dm history enterrise persistence
	 */
	public DmHistoryEnterrisePersistence getDmHistoryEnterrisePersistence() {
		return dmHistoryEnterrisePersistence;
	}

	/**
	 * Sets the dm history enterrise persistence.
	 *
	 * @param dmHistoryEnterrisePersistence the dm history enterrise persistence
	 */
	public void setDmHistoryEnterrisePersistence(
		DmHistoryEnterrisePersistence dmHistoryEnterrisePersistence) {
		this.dmHistoryEnterrisePersistence = dmHistoryEnterrisePersistence;
	}

	/**
	 * Returns the dm history goods local service.
	 *
	 * @return the dm history goods local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmHistoryGoodsLocalService getDmHistoryGoodsLocalService() {
		return dmHistoryGoodsLocalService;
	}

	/**
	 * Sets the dm history goods local service.
	 *
	 * @param dmHistoryGoodsLocalService the dm history goods local service
	 */
	public void setDmHistoryGoodsLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmHistoryGoodsLocalService dmHistoryGoodsLocalService) {
		this.dmHistoryGoodsLocalService = dmHistoryGoodsLocalService;
	}

	/**
	 * Returns the dm history goods persistence.
	 *
	 * @return the dm history goods persistence
	 */
	public DmHistoryGoodsPersistence getDmHistoryGoodsPersistence() {
		return dmHistoryGoodsPersistence;
	}

	/**
	 * Sets the dm history goods persistence.
	 *
	 * @param dmHistoryGoodsPersistence the dm history goods persistence
	 */
	public void setDmHistoryGoodsPersistence(
		DmHistoryGoodsPersistence dmHistoryGoodsPersistence) {
		this.dmHistoryGoodsPersistence = dmHistoryGoodsPersistence;
	}

	/**
	 * Returns the dm history goods type local service.
	 *
	 * @return the dm history goods type local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmHistoryGoodsTypeLocalService getDmHistoryGoodsTypeLocalService() {
		return dmHistoryGoodsTypeLocalService;
	}

	/**
	 * Sets the dm history goods type local service.
	 *
	 * @param dmHistoryGoodsTypeLocalService the dm history goods type local service
	 */
	public void setDmHistoryGoodsTypeLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmHistoryGoodsTypeLocalService dmHistoryGoodsTypeLocalService) {
		this.dmHistoryGoodsTypeLocalService = dmHistoryGoodsTypeLocalService;
	}

	/**
	 * Returns the dm history goods type persistence.
	 *
	 * @return the dm history goods type persistence
	 */
	public DmHistoryGoodsTypePersistence getDmHistoryGoodsTypePersistence() {
		return dmHistoryGoodsTypePersistence;
	}

	/**
	 * Sets the dm history goods type persistence.
	 *
	 * @param dmHistoryGoodsTypePersistence the dm history goods type persistence
	 */
	public void setDmHistoryGoodsTypePersistence(
		DmHistoryGoodsTypePersistence dmHistoryGoodsTypePersistence) {
		this.dmHistoryGoodsTypePersistence = dmHistoryGoodsTypePersistence;
	}

	/**
	 * Returns the dm history maritime local service.
	 *
	 * @return the dm history maritime local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmHistoryMaritimeLocalService getDmHistoryMaritimeLocalService() {
		return dmHistoryMaritimeLocalService;
	}

	/**
	 * Sets the dm history maritime local service.
	 *
	 * @param dmHistoryMaritimeLocalService the dm history maritime local service
	 */
	public void setDmHistoryMaritimeLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmHistoryMaritimeLocalService dmHistoryMaritimeLocalService) {
		this.dmHistoryMaritimeLocalService = dmHistoryMaritimeLocalService;
	}

	/**
	 * Returns the dm history maritime persistence.
	 *
	 * @return the dm history maritime persistence
	 */
	public DmHistoryMaritimePersistence getDmHistoryMaritimePersistence() {
		return dmHistoryMaritimePersistence;
	}

	/**
	 * Sets the dm history maritime persistence.
	 *
	 * @param dmHistoryMaritimePersistence the dm history maritime persistence
	 */
	public void setDmHistoryMaritimePersistence(
		DmHistoryMaritimePersistence dmHistoryMaritimePersistence) {
		this.dmHistoryMaritimePersistence = dmHistoryMaritimePersistence;
	}

	/**
	 * Returns the dm history ministry local service.
	 *
	 * @return the dm history ministry local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmHistoryMinistryLocalService getDmHistoryMinistryLocalService() {
		return dmHistoryMinistryLocalService;
	}

	/**
	 * Sets the dm history ministry local service.
	 *
	 * @param dmHistoryMinistryLocalService the dm history ministry local service
	 */
	public void setDmHistoryMinistryLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmHistoryMinistryLocalService dmHistoryMinistryLocalService) {
		this.dmHistoryMinistryLocalService = dmHistoryMinistryLocalService;
	}

	/**
	 * Returns the dm history ministry remote service.
	 *
	 * @return the dm history ministry remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmHistoryMinistryService getDmHistoryMinistryService() {
		return dmHistoryMinistryService;
	}

	/**
	 * Sets the dm history ministry remote service.
	 *
	 * @param dmHistoryMinistryService the dm history ministry remote service
	 */
	public void setDmHistoryMinistryService(
		vn.dtt.duongbien.dao.vrcb.service.DmHistoryMinistryService dmHistoryMinistryService) {
		this.dmHistoryMinistryService = dmHistoryMinistryService;
	}

	/**
	 * Returns the dm history ministry persistence.
	 *
	 * @return the dm history ministry persistence
	 */
	public DmHistoryMinistryPersistence getDmHistoryMinistryPersistence() {
		return dmHistoryMinistryPersistence;
	}

	/**
	 * Sets the dm history ministry persistence.
	 *
	 * @param dmHistoryMinistryPersistence the dm history ministry persistence
	 */
	public void setDmHistoryMinistryPersistence(
		DmHistoryMinistryPersistence dmHistoryMinistryPersistence) {
		this.dmHistoryMinistryPersistence = dmHistoryMinistryPersistence;
	}

	/**
	 * Returns the dm history package local service.
	 *
	 * @return the dm history package local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmHistoryPackageLocalService getDmHistoryPackageLocalService() {
		return dmHistoryPackageLocalService;
	}

	/**
	 * Sets the dm history package local service.
	 *
	 * @param dmHistoryPackageLocalService the dm history package local service
	 */
	public void setDmHistoryPackageLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmHistoryPackageLocalService dmHistoryPackageLocalService) {
		this.dmHistoryPackageLocalService = dmHistoryPackageLocalService;
	}

	/**
	 * Returns the dm history package persistence.
	 *
	 * @return the dm history package persistence
	 */
	public DmHistoryPackagePersistence getDmHistoryPackagePersistence() {
		return dmHistoryPackagePersistence;
	}

	/**
	 * Sets the dm history package persistence.
	 *
	 * @param dmHistoryPackagePersistence the dm history package persistence
	 */
	public void setDmHistoryPackagePersistence(
		DmHistoryPackagePersistence dmHistoryPackagePersistence) {
		this.dmHistoryPackagePersistence = dmHistoryPackagePersistence;
	}

	/**
	 * Returns the dm history passport type local service.
	 *
	 * @return the dm history passport type local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmHistoryPassportTypeLocalService getDmHistoryPassportTypeLocalService() {
		return dmHistoryPassportTypeLocalService;
	}

	/**
	 * Sets the dm history passport type local service.
	 *
	 * @param dmHistoryPassportTypeLocalService the dm history passport type local service
	 */
	public void setDmHistoryPassportTypeLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmHistoryPassportTypeLocalService dmHistoryPassportTypeLocalService) {
		this.dmHistoryPassportTypeLocalService = dmHistoryPassportTypeLocalService;
	}

	/**
	 * Returns the dm history passport type persistence.
	 *
	 * @return the dm history passport type persistence
	 */
	public DmHistoryPassportTypePersistence getDmHistoryPassportTypePersistence() {
		return dmHistoryPassportTypePersistence;
	}

	/**
	 * Sets the dm history passport type persistence.
	 *
	 * @param dmHistoryPassportTypePersistence the dm history passport type persistence
	 */
	public void setDmHistoryPassportTypePersistence(
		DmHistoryPassportTypePersistence dmHistoryPassportTypePersistence) {
		this.dmHistoryPassportTypePersistence = dmHistoryPassportTypePersistence;
	}

	/**
	 * Returns the dm history port local service.
	 *
	 * @return the dm history port local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmHistoryPortLocalService getDmHistoryPortLocalService() {
		return dmHistoryPortLocalService;
	}

	/**
	 * Sets the dm history port local service.
	 *
	 * @param dmHistoryPortLocalService the dm history port local service
	 */
	public void setDmHistoryPortLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmHistoryPortLocalService dmHistoryPortLocalService) {
		this.dmHistoryPortLocalService = dmHistoryPortLocalService;
	}

	/**
	 * Returns the dm history port persistence.
	 *
	 * @return the dm history port persistence
	 */
	public DmHistoryPortPersistence getDmHistoryPortPersistence() {
		return dmHistoryPortPersistence;
	}

	/**
	 * Sets the dm history port persistence.
	 *
	 * @param dmHistoryPortPersistence the dm history port persistence
	 */
	public void setDmHistoryPortPersistence(
		DmHistoryPortPersistence dmHistoryPortPersistence) {
		this.dmHistoryPortPersistence = dmHistoryPortPersistence;
	}

	/**
	 * Returns the dm history port harbour local service.
	 *
	 * @return the dm history port harbour local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmHistoryPortHarbourLocalService getDmHistoryPortHarbourLocalService() {
		return dmHistoryPortHarbourLocalService;
	}

	/**
	 * Sets the dm history port harbour local service.
	 *
	 * @param dmHistoryPortHarbourLocalService the dm history port harbour local service
	 */
	public void setDmHistoryPortHarbourLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmHistoryPortHarbourLocalService dmHistoryPortHarbourLocalService) {
		this.dmHistoryPortHarbourLocalService = dmHistoryPortHarbourLocalService;
	}

	/**
	 * Returns the dm history port harbour persistence.
	 *
	 * @return the dm history port harbour persistence
	 */
	public DmHistoryPortHarbourPersistence getDmHistoryPortHarbourPersistence() {
		return dmHistoryPortHarbourPersistence;
	}

	/**
	 * Sets the dm history port harbour persistence.
	 *
	 * @param dmHistoryPortHarbourPersistence the dm history port harbour persistence
	 */
	public void setDmHistoryPortHarbourPersistence(
		DmHistoryPortHarbourPersistence dmHistoryPortHarbourPersistence) {
		this.dmHistoryPortHarbourPersistence = dmHistoryPortHarbourPersistence;
	}

	/**
	 * Returns the dm history port region local service.
	 *
	 * @return the dm history port region local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmHistoryPortRegionLocalService getDmHistoryPortRegionLocalService() {
		return dmHistoryPortRegionLocalService;
	}

	/**
	 * Sets the dm history port region local service.
	 *
	 * @param dmHistoryPortRegionLocalService the dm history port region local service
	 */
	public void setDmHistoryPortRegionLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmHistoryPortRegionLocalService dmHistoryPortRegionLocalService) {
		this.dmHistoryPortRegionLocalService = dmHistoryPortRegionLocalService;
	}

	/**
	 * Returns the dm history port region persistence.
	 *
	 * @return the dm history port region persistence
	 */
	public DmHistoryPortRegionPersistence getDmHistoryPortRegionPersistence() {
		return dmHistoryPortRegionPersistence;
	}

	/**
	 * Sets the dm history port region persistence.
	 *
	 * @param dmHistoryPortRegionPersistence the dm history port region persistence
	 */
	public void setDmHistoryPortRegionPersistence(
		DmHistoryPortRegionPersistence dmHistoryPortRegionPersistence) {
		this.dmHistoryPortRegionPersistence = dmHistoryPortRegionPersistence;
	}

	/**
	 * Returns the dm history port wharf local service.
	 *
	 * @return the dm history port wharf local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmHistoryPortWharfLocalService getDmHistoryPortWharfLocalService() {
		return dmHistoryPortWharfLocalService;
	}

	/**
	 * Sets the dm history port wharf local service.
	 *
	 * @param dmHistoryPortWharfLocalService the dm history port wharf local service
	 */
	public void setDmHistoryPortWharfLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmHistoryPortWharfLocalService dmHistoryPortWharfLocalService) {
		this.dmHistoryPortWharfLocalService = dmHistoryPortWharfLocalService;
	}

	/**
	 * Returns the dm history port wharf persistence.
	 *
	 * @return the dm history port wharf persistence
	 */
	public DmHistoryPortWharfPersistence getDmHistoryPortWharfPersistence() {
		return dmHistoryPortWharfPersistence;
	}

	/**
	 * Sets the dm history port wharf persistence.
	 *
	 * @param dmHistoryPortWharfPersistence the dm history port wharf persistence
	 */
	public void setDmHistoryPortWharfPersistence(
		DmHistoryPortWharfPersistence dmHistoryPortWharfPersistence) {
		this.dmHistoryPortWharfPersistence = dmHistoryPortWharfPersistence;
	}

	/**
	 * Returns the dm history rank rating local service.
	 *
	 * @return the dm history rank rating local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmHistoryRankRatingLocalService getDmHistoryRankRatingLocalService() {
		return dmHistoryRankRatingLocalService;
	}

	/**
	 * Sets the dm history rank rating local service.
	 *
	 * @param dmHistoryRankRatingLocalService the dm history rank rating local service
	 */
	public void setDmHistoryRankRatingLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmHistoryRankRatingLocalService dmHistoryRankRatingLocalService) {
		this.dmHistoryRankRatingLocalService = dmHistoryRankRatingLocalService;
	}

	/**
	 * Returns the dm history rank rating persistence.
	 *
	 * @return the dm history rank rating persistence
	 */
	public DmHistoryRankRatingPersistence getDmHistoryRankRatingPersistence() {
		return dmHistoryRankRatingPersistence;
	}

	/**
	 * Sets the dm history rank rating persistence.
	 *
	 * @param dmHistoryRankRatingPersistence the dm history rank rating persistence
	 */
	public void setDmHistoryRankRatingPersistence(
		DmHistoryRankRatingPersistence dmHistoryRankRatingPersistence) {
		this.dmHistoryRankRatingPersistence = dmHistoryRankRatingPersistence;
	}

	/**
	 * Returns the dm history representative local service.
	 *
	 * @return the dm history representative local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmHistoryRepresentativeLocalService getDmHistoryRepresentativeLocalService() {
		return dmHistoryRepresentativeLocalService;
	}

	/**
	 * Sets the dm history representative local service.
	 *
	 * @param dmHistoryRepresentativeLocalService the dm history representative local service
	 */
	public void setDmHistoryRepresentativeLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmHistoryRepresentativeLocalService dmHistoryRepresentativeLocalService) {
		this.dmHistoryRepresentativeLocalService = dmHistoryRepresentativeLocalService;
	}

	/**
	 * Returns the dm history representative persistence.
	 *
	 * @return the dm history representative persistence
	 */
	public DmHistoryRepresentativePersistence getDmHistoryRepresentativePersistence() {
		return dmHistoryRepresentativePersistence;
	}

	/**
	 * Sets the dm history representative persistence.
	 *
	 * @param dmHistoryRepresentativePersistence the dm history representative persistence
	 */
	public void setDmHistoryRepresentativePersistence(
		DmHistoryRepresentativePersistence dmHistoryRepresentativePersistence) {
		this.dmHistoryRepresentativePersistence = dmHistoryRepresentativePersistence;
	}

	/**
	 * Returns the dm history security level local service.
	 *
	 * @return the dm history security level local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmHistorySecurityLevelLocalService getDmHistorySecurityLevelLocalService() {
		return dmHistorySecurityLevelLocalService;
	}

	/**
	 * Sets the dm history security level local service.
	 *
	 * @param dmHistorySecurityLevelLocalService the dm history security level local service
	 */
	public void setDmHistorySecurityLevelLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmHistorySecurityLevelLocalService dmHistorySecurityLevelLocalService) {
		this.dmHistorySecurityLevelLocalService = dmHistorySecurityLevelLocalService;
	}

	/**
	 * Returns the dm history security level persistence.
	 *
	 * @return the dm history security level persistence
	 */
	public DmHistorySecurityLevelPersistence getDmHistorySecurityLevelPersistence() {
		return dmHistorySecurityLevelPersistence;
	}

	/**
	 * Sets the dm history security level persistence.
	 *
	 * @param dmHistorySecurityLevelPersistence the dm history security level persistence
	 */
	public void setDmHistorySecurityLevelPersistence(
		DmHistorySecurityLevelPersistence dmHistorySecurityLevelPersistence) {
		this.dmHistorySecurityLevelPersistence = dmHistorySecurityLevelPersistence;
	}

	/**
	 * Returns the dm history ship agency local service.
	 *
	 * @return the dm history ship agency local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmHistoryShipAgencyLocalService getDmHistoryShipAgencyLocalService() {
		return dmHistoryShipAgencyLocalService;
	}

	/**
	 * Sets the dm history ship agency local service.
	 *
	 * @param dmHistoryShipAgencyLocalService the dm history ship agency local service
	 */
	public void setDmHistoryShipAgencyLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmHistoryShipAgencyLocalService dmHistoryShipAgencyLocalService) {
		this.dmHistoryShipAgencyLocalService = dmHistoryShipAgencyLocalService;
	}

	/**
	 * Returns the dm history ship agency persistence.
	 *
	 * @return the dm history ship agency persistence
	 */
	public DmHistoryShipAgencyPersistence getDmHistoryShipAgencyPersistence() {
		return dmHistoryShipAgencyPersistence;
	}

	/**
	 * Sets the dm history ship agency persistence.
	 *
	 * @param dmHistoryShipAgencyPersistence the dm history ship agency persistence
	 */
	public void setDmHistoryShipAgencyPersistence(
		DmHistoryShipAgencyPersistence dmHistoryShipAgencyPersistence) {
		this.dmHistoryShipAgencyPersistence = dmHistoryShipAgencyPersistence;
	}

	/**
	 * Returns the dm history ship type local service.
	 *
	 * @return the dm history ship type local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmHistoryShipTypeLocalService getDmHistoryShipTypeLocalService() {
		return dmHistoryShipTypeLocalService;
	}

	/**
	 * Sets the dm history ship type local service.
	 *
	 * @param dmHistoryShipTypeLocalService the dm history ship type local service
	 */
	public void setDmHistoryShipTypeLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmHistoryShipTypeLocalService dmHistoryShipTypeLocalService) {
		this.dmHistoryShipTypeLocalService = dmHistoryShipTypeLocalService;
	}

	/**
	 * Returns the dm history ship type persistence.
	 *
	 * @return the dm history ship type persistence
	 */
	public DmHistoryShipTypePersistence getDmHistoryShipTypePersistence() {
		return dmHistoryShipTypePersistence;
	}

	/**
	 * Sets the dm history ship type persistence.
	 *
	 * @param dmHistoryShipTypePersistence the dm history ship type persistence
	 */
	public void setDmHistoryShipTypePersistence(
		DmHistoryShipTypePersistence dmHistoryShipTypePersistence) {
		this.dmHistoryShipTypePersistence = dmHistoryShipTypePersistence;
	}

	/**
	 * Returns the dm history state local service.
	 *
	 * @return the dm history state local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmHistoryStateLocalService getDmHistoryStateLocalService() {
		return dmHistoryStateLocalService;
	}

	/**
	 * Sets the dm history state local service.
	 *
	 * @param dmHistoryStateLocalService the dm history state local service
	 */
	public void setDmHistoryStateLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmHistoryStateLocalService dmHistoryStateLocalService) {
		this.dmHistoryStateLocalService = dmHistoryStateLocalService;
	}

	/**
	 * Returns the dm history state persistence.
	 *
	 * @return the dm history state persistence
	 */
	public DmHistoryStatePersistence getDmHistoryStatePersistence() {
		return dmHistoryStatePersistence;
	}

	/**
	 * Sets the dm history state persistence.
	 *
	 * @param dmHistoryStatePersistence the dm history state persistence
	 */
	public void setDmHistoryStatePersistence(
		DmHistoryStatePersistence dmHistoryStatePersistence) {
		this.dmHistoryStatePersistence = dmHistoryStatePersistence;
	}

	/**
	 * Returns the dm history unit general local service.
	 *
	 * @return the dm history unit general local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmHistoryUnitGeneralLocalService getDmHistoryUnitGeneralLocalService() {
		return dmHistoryUnitGeneralLocalService;
	}

	/**
	 * Sets the dm history unit general local service.
	 *
	 * @param dmHistoryUnitGeneralLocalService the dm history unit general local service
	 */
	public void setDmHistoryUnitGeneralLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmHistoryUnitGeneralLocalService dmHistoryUnitGeneralLocalService) {
		this.dmHistoryUnitGeneralLocalService = dmHistoryUnitGeneralLocalService;
	}

	/**
	 * Returns the dm history unit general persistence.
	 *
	 * @return the dm history unit general persistence
	 */
	public DmHistoryUnitGeneralPersistence getDmHistoryUnitGeneralPersistence() {
		return dmHistoryUnitGeneralPersistence;
	}

	/**
	 * Sets the dm history unit general persistence.
	 *
	 * @param dmHistoryUnitGeneralPersistence the dm history unit general persistence
	 */
	public void setDmHistoryUnitGeneralPersistence(
		DmHistoryUnitGeneralPersistence dmHistoryUnitGeneralPersistence) {
		this.dmHistoryUnitGeneralPersistence = dmHistoryUnitGeneralPersistence;
	}

	/**
	 * Returns the dm maritime local service.
	 *
	 * @return the dm maritime local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmMaritimeLocalService getDmMaritimeLocalService() {
		return dmMaritimeLocalService;
	}

	/**
	 * Sets the dm maritime local service.
	 *
	 * @param dmMaritimeLocalService the dm maritime local service
	 */
	public void setDmMaritimeLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmMaritimeLocalService dmMaritimeLocalService) {
		this.dmMaritimeLocalService = dmMaritimeLocalService;
	}

	/**
	 * Returns the dm maritime persistence.
	 *
	 * @return the dm maritime persistence
	 */
	public DmMaritimePersistence getDmMaritimePersistence() {
		return dmMaritimePersistence;
	}

	/**
	 * Sets the dm maritime persistence.
	 *
	 * @param dmMaritimePersistence the dm maritime persistence
	 */
	public void setDmMaritimePersistence(
		DmMaritimePersistence dmMaritimePersistence) {
		this.dmMaritimePersistence = dmMaritimePersistence;
	}

	/**
	 * Returns the dm ministry local service.
	 *
	 * @return the dm ministry local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmMinistryLocalService getDmMinistryLocalService() {
		return dmMinistryLocalService;
	}

	/**
	 * Sets the dm ministry local service.
	 *
	 * @param dmMinistryLocalService the dm ministry local service
	 */
	public void setDmMinistryLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmMinistryLocalService dmMinistryLocalService) {
		this.dmMinistryLocalService = dmMinistryLocalService;
	}

	/**
	 * Returns the dm ministry remote service.
	 *
	 * @return the dm ministry remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmMinistryService getDmMinistryService() {
		return dmMinistryService;
	}

	/**
	 * Sets the dm ministry remote service.
	 *
	 * @param dmMinistryService the dm ministry remote service
	 */
	public void setDmMinistryService(
		vn.dtt.duongbien.dao.vrcb.service.DmMinistryService dmMinistryService) {
		this.dmMinistryService = dmMinistryService;
	}

	/**
	 * Returns the dm ministry persistence.
	 *
	 * @return the dm ministry persistence
	 */
	public DmMinistryPersistence getDmMinistryPersistence() {
		return dmMinistryPersistence;
	}

	/**
	 * Sets the dm ministry persistence.
	 *
	 * @param dmMinistryPersistence the dm ministry persistence
	 */
	public void setDmMinistryPersistence(
		DmMinistryPersistence dmMinistryPersistence) {
		this.dmMinistryPersistence = dmMinistryPersistence;
	}

	/**
	 * Returns the dm package local service.
	 *
	 * @return the dm package local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmPackageLocalService getDmPackageLocalService() {
		return dmPackageLocalService;
	}

	/**
	 * Sets the dm package local service.
	 *
	 * @param dmPackageLocalService the dm package local service
	 */
	public void setDmPackageLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmPackageLocalService dmPackageLocalService) {
		this.dmPackageLocalService = dmPackageLocalService;
	}

	/**
	 * Returns the dm package persistence.
	 *
	 * @return the dm package persistence
	 */
	public DmPackagePersistence getDmPackagePersistence() {
		return dmPackagePersistence;
	}

	/**
	 * Sets the dm package persistence.
	 *
	 * @param dmPackagePersistence the dm package persistence
	 */
	public void setDmPackagePersistence(
		DmPackagePersistence dmPackagePersistence) {
		this.dmPackagePersistence = dmPackagePersistence;
	}

	/**
	 * Returns the dm passport type local service.
	 *
	 * @return the dm passport type local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmPassportTypeLocalService getDmPassportTypeLocalService() {
		return dmPassportTypeLocalService;
	}

	/**
	 * Sets the dm passport type local service.
	 *
	 * @param dmPassportTypeLocalService the dm passport type local service
	 */
	public void setDmPassportTypeLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmPassportTypeLocalService dmPassportTypeLocalService) {
		this.dmPassportTypeLocalService = dmPassportTypeLocalService;
	}

	/**
	 * Returns the dm passport type persistence.
	 *
	 * @return the dm passport type persistence
	 */
	public DmPassportTypePersistence getDmPassportTypePersistence() {
		return dmPassportTypePersistence;
	}

	/**
	 * Sets the dm passport type persistence.
	 *
	 * @param dmPassportTypePersistence the dm passport type persistence
	 */
	public void setDmPassportTypePersistence(
		DmPassportTypePersistence dmPassportTypePersistence) {
		this.dmPassportTypePersistence = dmPassportTypePersistence;
	}

	/**
	 * Returns the dm port local service.
	 *
	 * @return the dm port local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmPortLocalService getDmPortLocalService() {
		return dmPortLocalService;
	}

	/**
	 * Sets the dm port local service.
	 *
	 * @param dmPortLocalService the dm port local service
	 */
	public void setDmPortLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmPortLocalService dmPortLocalService) {
		this.dmPortLocalService = dmPortLocalService;
	}

	/**
	 * Returns the dm port persistence.
	 *
	 * @return the dm port persistence
	 */
	public DmPortPersistence getDmPortPersistence() {
		return dmPortPersistence;
	}

	/**
	 * Sets the dm port persistence.
	 *
	 * @param dmPortPersistence the dm port persistence
	 */
	public void setDmPortPersistence(DmPortPersistence dmPortPersistence) {
		this.dmPortPersistence = dmPortPersistence;
	}

	/**
	 * Returns the dm port harbour local service.
	 *
	 * @return the dm port harbour local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmPortHarbourLocalService getDmPortHarbourLocalService() {
		return dmPortHarbourLocalService;
	}

	/**
	 * Sets the dm port harbour local service.
	 *
	 * @param dmPortHarbourLocalService the dm port harbour local service
	 */
	public void setDmPortHarbourLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmPortHarbourLocalService dmPortHarbourLocalService) {
		this.dmPortHarbourLocalService = dmPortHarbourLocalService;
	}

	/**
	 * Returns the dm port harbour persistence.
	 *
	 * @return the dm port harbour persistence
	 */
	public DmPortHarbourPersistence getDmPortHarbourPersistence() {
		return dmPortHarbourPersistence;
	}

	/**
	 * Sets the dm port harbour persistence.
	 *
	 * @param dmPortHarbourPersistence the dm port harbour persistence
	 */
	public void setDmPortHarbourPersistence(
		DmPortHarbourPersistence dmPortHarbourPersistence) {
		this.dmPortHarbourPersistence = dmPortHarbourPersistence;
	}

	/**
	 * Returns the dm port region local service.
	 *
	 * @return the dm port region local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmPortRegionLocalService getDmPortRegionLocalService() {
		return dmPortRegionLocalService;
	}

	/**
	 * Sets the dm port region local service.
	 *
	 * @param dmPortRegionLocalService the dm port region local service
	 */
	public void setDmPortRegionLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmPortRegionLocalService dmPortRegionLocalService) {
		this.dmPortRegionLocalService = dmPortRegionLocalService;
	}

	/**
	 * Returns the dm port region persistence.
	 *
	 * @return the dm port region persistence
	 */
	public DmPortRegionPersistence getDmPortRegionPersistence() {
		return dmPortRegionPersistence;
	}

	/**
	 * Sets the dm port region persistence.
	 *
	 * @param dmPortRegionPersistence the dm port region persistence
	 */
	public void setDmPortRegionPersistence(
		DmPortRegionPersistence dmPortRegionPersistence) {
		this.dmPortRegionPersistence = dmPortRegionPersistence;
	}

	/**
	 * Returns the dm port wharf local service.
	 *
	 * @return the dm port wharf local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmPortWharfLocalService getDmPortWharfLocalService() {
		return dmPortWharfLocalService;
	}

	/**
	 * Sets the dm port wharf local service.
	 *
	 * @param dmPortWharfLocalService the dm port wharf local service
	 */
	public void setDmPortWharfLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmPortWharfLocalService dmPortWharfLocalService) {
		this.dmPortWharfLocalService = dmPortWharfLocalService;
	}

	/**
	 * Returns the dm port wharf persistence.
	 *
	 * @return the dm port wharf persistence
	 */
	public DmPortWharfPersistence getDmPortWharfPersistence() {
		return dmPortWharfPersistence;
	}

	/**
	 * Sets the dm port wharf persistence.
	 *
	 * @param dmPortWharfPersistence the dm port wharf persistence
	 */
	public void setDmPortWharfPersistence(
		DmPortWharfPersistence dmPortWharfPersistence) {
		this.dmPortWharfPersistence = dmPortWharfPersistence;
	}

	/**
	 * Returns the dm rank rating local service.
	 *
	 * @return the dm rank rating local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmRankRatingLocalService getDmRankRatingLocalService() {
		return dmRankRatingLocalService;
	}

	/**
	 * Sets the dm rank rating local service.
	 *
	 * @param dmRankRatingLocalService the dm rank rating local service
	 */
	public void setDmRankRatingLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmRankRatingLocalService dmRankRatingLocalService) {
		this.dmRankRatingLocalService = dmRankRatingLocalService;
	}

	/**
	 * Returns the dm rank rating persistence.
	 *
	 * @return the dm rank rating persistence
	 */
	public DmRankRatingPersistence getDmRankRatingPersistence() {
		return dmRankRatingPersistence;
	}

	/**
	 * Sets the dm rank rating persistence.
	 *
	 * @param dmRankRatingPersistence the dm rank rating persistence
	 */
	public void setDmRankRatingPersistence(
		DmRankRatingPersistence dmRankRatingPersistence) {
		this.dmRankRatingPersistence = dmRankRatingPersistence;
	}

	/**
	 * Returns the dm representative local service.
	 *
	 * @return the dm representative local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmRepresentativeLocalService getDmRepresentativeLocalService() {
		return dmRepresentativeLocalService;
	}

	/**
	 * Sets the dm representative local service.
	 *
	 * @param dmRepresentativeLocalService the dm representative local service
	 */
	public void setDmRepresentativeLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmRepresentativeLocalService dmRepresentativeLocalService) {
		this.dmRepresentativeLocalService = dmRepresentativeLocalService;
	}

	/**
	 * Returns the dm representative persistence.
	 *
	 * @return the dm representative persistence
	 */
	public DmRepresentativePersistence getDmRepresentativePersistence() {
		return dmRepresentativePersistence;
	}

	/**
	 * Sets the dm representative persistence.
	 *
	 * @param dmRepresentativePersistence the dm representative persistence
	 */
	public void setDmRepresentativePersistence(
		DmRepresentativePersistence dmRepresentativePersistence) {
		this.dmRepresentativePersistence = dmRepresentativePersistence;
	}

	/**
	 * Returns the dm security level local service.
	 *
	 * @return the dm security level local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmSecurityLevelLocalService getDmSecurityLevelLocalService() {
		return dmSecurityLevelLocalService;
	}

	/**
	 * Sets the dm security level local service.
	 *
	 * @param dmSecurityLevelLocalService the dm security level local service
	 */
	public void setDmSecurityLevelLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmSecurityLevelLocalService dmSecurityLevelLocalService) {
		this.dmSecurityLevelLocalService = dmSecurityLevelLocalService;
	}

	/**
	 * Returns the dm security level persistence.
	 *
	 * @return the dm security level persistence
	 */
	public DmSecurityLevelPersistence getDmSecurityLevelPersistence() {
		return dmSecurityLevelPersistence;
	}

	/**
	 * Sets the dm security level persistence.
	 *
	 * @param dmSecurityLevelPersistence the dm security level persistence
	 */
	public void setDmSecurityLevelPersistence(
		DmSecurityLevelPersistence dmSecurityLevelPersistence) {
		this.dmSecurityLevelPersistence = dmSecurityLevelPersistence;
	}

	/**
	 * Returns the dm ship agency local service.
	 *
	 * @return the dm ship agency local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmShipAgencyLocalService getDmShipAgencyLocalService() {
		return dmShipAgencyLocalService;
	}

	/**
	 * Sets the dm ship agency local service.
	 *
	 * @param dmShipAgencyLocalService the dm ship agency local service
	 */
	public void setDmShipAgencyLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmShipAgencyLocalService dmShipAgencyLocalService) {
		this.dmShipAgencyLocalService = dmShipAgencyLocalService;
	}

	/**
	 * Returns the dm ship agency persistence.
	 *
	 * @return the dm ship agency persistence
	 */
	public DmShipAgencyPersistence getDmShipAgencyPersistence() {
		return dmShipAgencyPersistence;
	}

	/**
	 * Sets the dm ship agency persistence.
	 *
	 * @param dmShipAgencyPersistence the dm ship agency persistence
	 */
	public void setDmShipAgencyPersistence(
		DmShipAgencyPersistence dmShipAgencyPersistence) {
		this.dmShipAgencyPersistence = dmShipAgencyPersistence;
	}

	/**
	 * Returns the dm ship type local service.
	 *
	 * @return the dm ship type local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmShipTypeLocalService getDmShipTypeLocalService() {
		return dmShipTypeLocalService;
	}

	/**
	 * Sets the dm ship type local service.
	 *
	 * @param dmShipTypeLocalService the dm ship type local service
	 */
	public void setDmShipTypeLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmShipTypeLocalService dmShipTypeLocalService) {
		this.dmShipTypeLocalService = dmShipTypeLocalService;
	}

	/**
	 * Returns the dm ship type persistence.
	 *
	 * @return the dm ship type persistence
	 */
	public DmShipTypePersistence getDmShipTypePersistence() {
		return dmShipTypePersistence;
	}

	/**
	 * Sets the dm ship type persistence.
	 *
	 * @param dmShipTypePersistence the dm ship type persistence
	 */
	public void setDmShipTypePersistence(
		DmShipTypePersistence dmShipTypePersistence) {
		this.dmShipTypePersistence = dmShipTypePersistence;
	}

	/**
	 * Returns the dm state local service.
	 *
	 * @return the dm state local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmStateLocalService getDmStateLocalService() {
		return dmStateLocalService;
	}

	/**
	 * Sets the dm state local service.
	 *
	 * @param dmStateLocalService the dm state local service
	 */
	public void setDmStateLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmStateLocalService dmStateLocalService) {
		this.dmStateLocalService = dmStateLocalService;
	}

	/**
	 * Returns the dm state persistence.
	 *
	 * @return the dm state persistence
	 */
	public DmStatePersistence getDmStatePersistence() {
		return dmStatePersistence;
	}

	/**
	 * Sets the dm state persistence.
	 *
	 * @param dmStatePersistence the dm state persistence
	 */
	public void setDmStatePersistence(DmStatePersistence dmStatePersistence) {
		this.dmStatePersistence = dmStatePersistence;
	}

	/**
	 * Returns the dm sync category local service.
	 *
	 * @return the dm sync category local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmSyncCategoryLocalService getDmSyncCategoryLocalService() {
		return dmSyncCategoryLocalService;
	}

	/**
	 * Sets the dm sync category local service.
	 *
	 * @param dmSyncCategoryLocalService the dm sync category local service
	 */
	public void setDmSyncCategoryLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmSyncCategoryLocalService dmSyncCategoryLocalService) {
		this.dmSyncCategoryLocalService = dmSyncCategoryLocalService;
	}

	/**
	 * Returns the dm sync category persistence.
	 *
	 * @return the dm sync category persistence
	 */
	public DmSyncCategoryPersistence getDmSyncCategoryPersistence() {
		return dmSyncCategoryPersistence;
	}

	/**
	 * Sets the dm sync category persistence.
	 *
	 * @param dmSyncCategoryPersistence the dm sync category persistence
	 */
	public void setDmSyncCategoryPersistence(
		DmSyncCategoryPersistence dmSyncCategoryPersistence) {
		this.dmSyncCategoryPersistence = dmSyncCategoryPersistence;
	}

	/**
	 * Returns the dm test n01 request local service.
	 *
	 * @return the dm test n01 request local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmTestN01RequestLocalService getDmTestN01RequestLocalService() {
		return dmTestN01RequestLocalService;
	}

	/**
	 * Sets the dm test n01 request local service.
	 *
	 * @param dmTestN01RequestLocalService the dm test n01 request local service
	 */
	public void setDmTestN01RequestLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmTestN01RequestLocalService dmTestN01RequestLocalService) {
		this.dmTestN01RequestLocalService = dmTestN01RequestLocalService;
	}

	/**
	 * Returns the dm test n01 request persistence.
	 *
	 * @return the dm test n01 request persistence
	 */
	public DmTestN01RequestPersistence getDmTestN01RequestPersistence() {
		return dmTestN01RequestPersistence;
	}

	/**
	 * Sets the dm test n01 request persistence.
	 *
	 * @param dmTestN01RequestPersistence the dm test n01 request persistence
	 */
	public void setDmTestN01RequestPersistence(
		DmTestN01RequestPersistence dmTestN01RequestPersistence) {
		this.dmTestN01RequestPersistence = dmTestN01RequestPersistence;
	}

	/**
	 * Returns the dm unit general local service.
	 *
	 * @return the dm unit general local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DmUnitGeneralLocalService getDmUnitGeneralLocalService() {
		return dmUnitGeneralLocalService;
	}

	/**
	 * Sets the dm unit general local service.
	 *
	 * @param dmUnitGeneralLocalService the dm unit general local service
	 */
	public void setDmUnitGeneralLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DmUnitGeneralLocalService dmUnitGeneralLocalService) {
		this.dmUnitGeneralLocalService = dmUnitGeneralLocalService;
	}

	/**
	 * Returns the dm unit general persistence.
	 *
	 * @return the dm unit general persistence
	 */
	public DmUnitGeneralPersistence getDmUnitGeneralPersistence() {
		return dmUnitGeneralPersistence;
	}

	/**
	 * Sets the dm unit general persistence.
	 *
	 * @param dmUnitGeneralPersistence the dm unit general persistence
	 */
	public void setDmUnitGeneralPersistence(
		DmUnitGeneralPersistence dmUnitGeneralPersistence) {
		this.dmUnitGeneralPersistence = dmUnitGeneralPersistence;
	}

	/**
	 * Returns the document local service.
	 *
	 * @return the document local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DocumentLocalService getDocumentLocalService() {
		return documentLocalService;
	}

	/**
	 * Sets the document local service.
	 *
	 * @param documentLocalService the document local service
	 */
	public void setDocumentLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DocumentLocalService documentLocalService) {
		this.documentLocalService = documentLocalService;
	}

	/**
	 * Returns the document remote service.
	 *
	 * @return the document remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DocumentService getDocumentService() {
		return documentService;
	}

	/**
	 * Sets the document remote service.
	 *
	 * @param documentService the document remote service
	 */
	public void setDocumentService(
		vn.dtt.duongbien.dao.vrcb.service.DocumentService documentService) {
		this.documentService = documentService;
	}

	/**
	 * Returns the document persistence.
	 *
	 * @return the document persistence
	 */
	public DocumentPersistence getDocumentPersistence() {
		return documentPersistence;
	}

	/**
	 * Sets the document persistence.
	 *
	 * @param documentPersistence the document persistence
	 */
	public void setDocumentPersistence(DocumentPersistence documentPersistence) {
		this.documentPersistence = documentPersistence;
	}

	/**
	 * Returns the document general local service.
	 *
	 * @return the document general local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DocumentGeneralLocalService getDocumentGeneralLocalService() {
		return documentGeneralLocalService;
	}

	/**
	 * Sets the document general local service.
	 *
	 * @param documentGeneralLocalService the document general local service
	 */
	public void setDocumentGeneralLocalService(
		vn.dtt.duongbien.dao.vrcb.service.DocumentGeneralLocalService documentGeneralLocalService) {
		this.documentGeneralLocalService = documentGeneralLocalService;
	}

	/**
	 * Returns the document general remote service.
	 *
	 * @return the document general remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.DocumentGeneralService getDocumentGeneralService() {
		return documentGeneralService;
	}

	/**
	 * Sets the document general remote service.
	 *
	 * @param documentGeneralService the document general remote service
	 */
	public void setDocumentGeneralService(
		vn.dtt.duongbien.dao.vrcb.service.DocumentGeneralService documentGeneralService) {
		this.documentGeneralService = documentGeneralService;
	}

	/**
	 * Returns the document general persistence.
	 *
	 * @return the document general persistence
	 */
	public DocumentGeneralPersistence getDocumentGeneralPersistence() {
		return documentGeneralPersistence;
	}

	/**
	 * Sets the document general persistence.
	 *
	 * @param documentGeneralPersistence the document general persistence
	 */
	public void setDocumentGeneralPersistence(
		DocumentGeneralPersistence documentGeneralPersistence) {
		this.documentGeneralPersistence = documentGeneralPersistence;
	}

	/**
	 * Returns the history interface request local service.
	 *
	 * @return the history interface request local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.HistoryInterfaceRequestLocalService getHistoryInterfaceRequestLocalService() {
		return historyInterfaceRequestLocalService;
	}

	/**
	 * Sets the history interface request local service.
	 *
	 * @param historyInterfaceRequestLocalService the history interface request local service
	 */
	public void setHistoryInterfaceRequestLocalService(
		vn.dtt.duongbien.dao.vrcb.service.HistoryInterfaceRequestLocalService historyInterfaceRequestLocalService) {
		this.historyInterfaceRequestLocalService = historyInterfaceRequestLocalService;
	}

	/**
	 * Returns the history interface request remote service.
	 *
	 * @return the history interface request remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.HistoryInterfaceRequestService getHistoryInterfaceRequestService() {
		return historyInterfaceRequestService;
	}

	/**
	 * Sets the history interface request remote service.
	 *
	 * @param historyInterfaceRequestService the history interface request remote service
	 */
	public void setHistoryInterfaceRequestService(
		vn.dtt.duongbien.dao.vrcb.service.HistoryInterfaceRequestService historyInterfaceRequestService) {
		this.historyInterfaceRequestService = historyInterfaceRequestService;
	}

	/**
	 * Returns the history interface request persistence.
	 *
	 * @return the history interface request persistence
	 */
	public HistoryInterfaceRequestPersistence getHistoryInterfaceRequestPersistence() {
		return historyInterfaceRequestPersistence;
	}

	/**
	 * Sets the history interface request persistence.
	 *
	 * @param historyInterfaceRequestPersistence the history interface request persistence
	 */
	public void setHistoryInterfaceRequestPersistence(
		HistoryInterfaceRequestPersistence historyInterfaceRequestPersistence) {
		this.historyInterfaceRequestPersistence = historyInterfaceRequestPersistence;
	}

	/**
	 * Returns the history interface request field local service.
	 *
	 * @return the history interface request field local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.HistoryInterfaceRequestFieldLocalService getHistoryInterfaceRequestFieldLocalService() {
		return historyInterfaceRequestFieldLocalService;
	}

	/**
	 * Sets the history interface request field local service.
	 *
	 * @param historyInterfaceRequestFieldLocalService the history interface request field local service
	 */
	public void setHistoryInterfaceRequestFieldLocalService(
		vn.dtt.duongbien.dao.vrcb.service.HistoryInterfaceRequestFieldLocalService historyInterfaceRequestFieldLocalService) {
		this.historyInterfaceRequestFieldLocalService = historyInterfaceRequestFieldLocalService;
	}

	/**
	 * Returns the history interface request field remote service.
	 *
	 * @return the history interface request field remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.HistoryInterfaceRequestFieldService getHistoryInterfaceRequestFieldService() {
		return historyInterfaceRequestFieldService;
	}

	/**
	 * Sets the history interface request field remote service.
	 *
	 * @param historyInterfaceRequestFieldService the history interface request field remote service
	 */
	public void setHistoryInterfaceRequestFieldService(
		vn.dtt.duongbien.dao.vrcb.service.HistoryInterfaceRequestFieldService historyInterfaceRequestFieldService) {
		this.historyInterfaceRequestFieldService = historyInterfaceRequestFieldService;
	}

	/**
	 * Returns the history interface request field persistence.
	 *
	 * @return the history interface request field persistence
	 */
	public HistoryInterfaceRequestFieldPersistence getHistoryInterfaceRequestFieldPersistence() {
		return historyInterfaceRequestFieldPersistence;
	}

	/**
	 * Sets the history interface request field persistence.
	 *
	 * @param historyInterfaceRequestFieldPersistence the history interface request field persistence
	 */
	public void setHistoryInterfaceRequestFieldPersistence(
		HistoryInterfaceRequestFieldPersistence historyInterfaceRequestFieldPersistence) {
		this.historyInterfaceRequestFieldPersistence = historyInterfaceRequestFieldPersistence;
	}

	/**
	 * Returns the history rmdc ship local service.
	 *
	 * @return the history rmdc ship local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.HistoryRmdcShipLocalService getHistoryRmdcShipLocalService() {
		return historyRmdcShipLocalService;
	}

	/**
	 * Sets the history rmdc ship local service.
	 *
	 * @param historyRmdcShipLocalService the history rmdc ship local service
	 */
	public void setHistoryRmdcShipLocalService(
		vn.dtt.duongbien.dao.vrcb.service.HistoryRmdcShipLocalService historyRmdcShipLocalService) {
		this.historyRmdcShipLocalService = historyRmdcShipLocalService;
	}

	/**
	 * Returns the history rmdc ship remote service.
	 *
	 * @return the history rmdc ship remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.HistoryRmdcShipService getHistoryRmdcShipService() {
		return historyRmdcShipService;
	}

	/**
	 * Sets the history rmdc ship remote service.
	 *
	 * @param historyRmdcShipService the history rmdc ship remote service
	 */
	public void setHistoryRmdcShipService(
		vn.dtt.duongbien.dao.vrcb.service.HistoryRmdcShipService historyRmdcShipService) {
		this.historyRmdcShipService = historyRmdcShipService;
	}

	/**
	 * Returns the history rmdc ship persistence.
	 *
	 * @return the history rmdc ship persistence
	 */
	public HistoryRmdcShipPersistence getHistoryRmdcShipPersistence() {
		return historyRmdcShipPersistence;
	}

	/**
	 * Sets the history rmdc ship persistence.
	 *
	 * @param historyRmdcShipPersistence the history rmdc ship persistence
	 */
	public void setHistoryRmdcShipPersistence(
		HistoryRmdcShipPersistence historyRmdcShipPersistence) {
		this.historyRmdcShipPersistence = historyRmdcShipPersistence;
	}

	/**
	 * Returns the history sync version local service.
	 *
	 * @return the history sync version local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.HistorySyncVersionLocalService getHistorySyncVersionLocalService() {
		return historySyncVersionLocalService;
	}

	/**
	 * Sets the history sync version local service.
	 *
	 * @param historySyncVersionLocalService the history sync version local service
	 */
	public void setHistorySyncVersionLocalService(
		vn.dtt.duongbien.dao.vrcb.service.HistorySyncVersionLocalService historySyncVersionLocalService) {
		this.historySyncVersionLocalService = historySyncVersionLocalService;
	}

	/**
	 * Returns the history sync version persistence.
	 *
	 * @return the history sync version persistence
	 */
	public HistorySyncVersionPersistence getHistorySyncVersionPersistence() {
		return historySyncVersionPersistence;
	}

	/**
	 * Sets the history sync version persistence.
	 *
	 * @param historySyncVersionPersistence the history sync version persistence
	 */
	public void setHistorySyncVersionPersistence(
		HistorySyncVersionPersistence historySyncVersionPersistence) {
		this.historySyncVersionPersistence = historySyncVersionPersistence;
	}

	/**
	 * Returns the interface request local service.
	 *
	 * @return the interface request local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.InterfaceRequestLocalService getInterfaceRequestLocalService() {
		return interfaceRequestLocalService;
	}

	/**
	 * Sets the interface request local service.
	 *
	 * @param interfaceRequestLocalService the interface request local service
	 */
	public void setInterfaceRequestLocalService(
		vn.dtt.duongbien.dao.vrcb.service.InterfaceRequestLocalService interfaceRequestLocalService) {
		this.interfaceRequestLocalService = interfaceRequestLocalService;
	}

	/**
	 * Returns the interface request remote service.
	 *
	 * @return the interface request remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.InterfaceRequestService getInterfaceRequestService() {
		return interfaceRequestService;
	}

	/**
	 * Sets the interface request remote service.
	 *
	 * @param interfaceRequestService the interface request remote service
	 */
	public void setInterfaceRequestService(
		vn.dtt.duongbien.dao.vrcb.service.InterfaceRequestService interfaceRequestService) {
		this.interfaceRequestService = interfaceRequestService;
	}

	/**
	 * Returns the interface request persistence.
	 *
	 * @return the interface request persistence
	 */
	public InterfaceRequestPersistence getInterfaceRequestPersistence() {
		return interfaceRequestPersistence;
	}

	/**
	 * Sets the interface request persistence.
	 *
	 * @param interfaceRequestPersistence the interface request persistence
	 */
	public void setInterfaceRequestPersistence(
		InterfaceRequestPersistence interfaceRequestPersistence) {
		this.interfaceRequestPersistence = interfaceRequestPersistence;
	}

	/**
	 * Returns the interface request field local service.
	 *
	 * @return the interface request field local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.InterfaceRequestFieldLocalService getInterfaceRequestFieldLocalService() {
		return interfaceRequestFieldLocalService;
	}

	/**
	 * Sets the interface request field local service.
	 *
	 * @param interfaceRequestFieldLocalService the interface request field local service
	 */
	public void setInterfaceRequestFieldLocalService(
		vn.dtt.duongbien.dao.vrcb.service.InterfaceRequestFieldLocalService interfaceRequestFieldLocalService) {
		this.interfaceRequestFieldLocalService = interfaceRequestFieldLocalService;
	}

	/**
	 * Returns the interface request field remote service.
	 *
	 * @return the interface request field remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.InterfaceRequestFieldService getInterfaceRequestFieldService() {
		return interfaceRequestFieldService;
	}

	/**
	 * Sets the interface request field remote service.
	 *
	 * @param interfaceRequestFieldService the interface request field remote service
	 */
	public void setInterfaceRequestFieldService(
		vn.dtt.duongbien.dao.vrcb.service.InterfaceRequestFieldService interfaceRequestFieldService) {
		this.interfaceRequestFieldService = interfaceRequestFieldService;
	}

	/**
	 * Returns the interface request field persistence.
	 *
	 * @return the interface request field persistence
	 */
	public InterfaceRequestFieldPersistence getInterfaceRequestFieldPersistence() {
		return interfaceRequestFieldPersistence;
	}

	/**
	 * Sets the interface request field persistence.
	 *
	 * @param interfaceRequestFieldPersistence the interface request field persistence
	 */
	public void setInterfaceRequestFieldPersistence(
		InterfaceRequestFieldPersistence interfaceRequestFieldPersistence) {
		this.interfaceRequestFieldPersistence = interfaceRequestFieldPersistence;
	}

	/**
	 * Returns the issue acceptance for transit local service.
	 *
	 * @return the issue acceptance for transit local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.IssueAcceptanceForTransitLocalService getIssueAcceptanceForTransitLocalService() {
		return issueAcceptanceForTransitLocalService;
	}

	/**
	 * Sets the issue acceptance for transit local service.
	 *
	 * @param issueAcceptanceForTransitLocalService the issue acceptance for transit local service
	 */
	public void setIssueAcceptanceForTransitLocalService(
		vn.dtt.duongbien.dao.vrcb.service.IssueAcceptanceForTransitLocalService issueAcceptanceForTransitLocalService) {
		this.issueAcceptanceForTransitLocalService = issueAcceptanceForTransitLocalService;
	}

	/**
	 * Returns the issue acceptance for transit remote service.
	 *
	 * @return the issue acceptance for transit remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.IssueAcceptanceForTransitService getIssueAcceptanceForTransitService() {
		return issueAcceptanceForTransitService;
	}

	/**
	 * Sets the issue acceptance for transit remote service.
	 *
	 * @param issueAcceptanceForTransitService the issue acceptance for transit remote service
	 */
	public void setIssueAcceptanceForTransitService(
		vn.dtt.duongbien.dao.vrcb.service.IssueAcceptanceForTransitService issueAcceptanceForTransitService) {
		this.issueAcceptanceForTransitService = issueAcceptanceForTransitService;
	}

	/**
	 * Returns the issue acceptance for transit persistence.
	 *
	 * @return the issue acceptance for transit persistence
	 */
	public IssueAcceptanceForTransitPersistence getIssueAcceptanceForTransitPersistence() {
		return issueAcceptanceForTransitPersistence;
	}

	/**
	 * Sets the issue acceptance for transit persistence.
	 *
	 * @param issueAcceptanceForTransitPersistence the issue acceptance for transit persistence
	 */
	public void setIssueAcceptanceForTransitPersistence(
		IssueAcceptanceForTransitPersistence issueAcceptanceForTransitPersistence) {
		this.issueAcceptanceForTransitPersistence = issueAcceptanceForTransitPersistence;
	}

	/**
	 * Returns the issue permission for transit local service.
	 *
	 * @return the issue permission for transit local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.IssuePermissionForTransitLocalService getIssuePermissionForTransitLocalService() {
		return issuePermissionForTransitLocalService;
	}

	/**
	 * Sets the issue permission for transit local service.
	 *
	 * @param issuePermissionForTransitLocalService the issue permission for transit local service
	 */
	public void setIssuePermissionForTransitLocalService(
		vn.dtt.duongbien.dao.vrcb.service.IssuePermissionForTransitLocalService issuePermissionForTransitLocalService) {
		this.issuePermissionForTransitLocalService = issuePermissionForTransitLocalService;
	}

	/**
	 * Returns the issue permission for transit remote service.
	 *
	 * @return the issue permission for transit remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.IssuePermissionForTransitService getIssuePermissionForTransitService() {
		return issuePermissionForTransitService;
	}

	/**
	 * Sets the issue permission for transit remote service.
	 *
	 * @param issuePermissionForTransitService the issue permission for transit remote service
	 */
	public void setIssuePermissionForTransitService(
		vn.dtt.duongbien.dao.vrcb.service.IssuePermissionForTransitService issuePermissionForTransitService) {
		this.issuePermissionForTransitService = issuePermissionForTransitService;
	}

	/**
	 * Returns the issue permission for transit persistence.
	 *
	 * @return the issue permission for transit persistence
	 */
	public IssuePermissionForTransitPersistence getIssuePermissionForTransitPersistence() {
		return issuePermissionForTransitPersistence;
	}

	/**
	 * Sets the issue permission for transit persistence.
	 *
	 * @param issuePermissionForTransitPersistence the issue permission for transit persistence
	 */
	public void setIssuePermissionForTransitPersistence(
		IssuePermissionForTransitPersistence issuePermissionForTransitPersistence) {
		this.issuePermissionForTransitPersistence = issuePermissionForTransitPersistence;
	}

	/**
	 * Returns the issue port clearance local service.
	 *
	 * @return the issue port clearance local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.IssuePortClearanceLocalService getIssuePortClearanceLocalService() {
		return issuePortClearanceLocalService;
	}

	/**
	 * Sets the issue port clearance local service.
	 *
	 * @param issuePortClearanceLocalService the issue port clearance local service
	 */
	public void setIssuePortClearanceLocalService(
		vn.dtt.duongbien.dao.vrcb.service.IssuePortClearanceLocalService issuePortClearanceLocalService) {
		this.issuePortClearanceLocalService = issuePortClearanceLocalService;
	}

	/**
	 * Returns the issue port clearance remote service.
	 *
	 * @return the issue port clearance remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.IssuePortClearanceService getIssuePortClearanceService() {
		return issuePortClearanceService;
	}

	/**
	 * Sets the issue port clearance remote service.
	 *
	 * @param issuePortClearanceService the issue port clearance remote service
	 */
	public void setIssuePortClearanceService(
		vn.dtt.duongbien.dao.vrcb.service.IssuePortClearanceService issuePortClearanceService) {
		this.issuePortClearanceService = issuePortClearanceService;
	}

	/**
	 * Returns the issue port clearance persistence.
	 *
	 * @return the issue port clearance persistence
	 */
	public IssuePortClearancePersistence getIssuePortClearancePersistence() {
		return issuePortClearancePersistence;
	}

	/**
	 * Sets the issue port clearance persistence.
	 *
	 * @param issuePortClearancePersistence the issue port clearance persistence
	 */
	public void setIssuePortClearancePersistence(
		IssuePortClearancePersistence issuePortClearancePersistence) {
		this.issuePortClearancePersistence = issuePortClearancePersistence;
	}

	/**
	 * Returns the issue shifting order local service.
	 *
	 * @return the issue shifting order local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.IssueShiftingOrderLocalService getIssueShiftingOrderLocalService() {
		return issueShiftingOrderLocalService;
	}

	/**
	 * Sets the issue shifting order local service.
	 *
	 * @param issueShiftingOrderLocalService the issue shifting order local service
	 */
	public void setIssueShiftingOrderLocalService(
		vn.dtt.duongbien.dao.vrcb.service.IssueShiftingOrderLocalService issueShiftingOrderLocalService) {
		this.issueShiftingOrderLocalService = issueShiftingOrderLocalService;
	}

	/**
	 * Returns the issue shifting order remote service.
	 *
	 * @return the issue shifting order remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.IssueShiftingOrderService getIssueShiftingOrderService() {
		return issueShiftingOrderService;
	}

	/**
	 * Sets the issue shifting order remote service.
	 *
	 * @param issueShiftingOrderService the issue shifting order remote service
	 */
	public void setIssueShiftingOrderService(
		vn.dtt.duongbien.dao.vrcb.service.IssueShiftingOrderService issueShiftingOrderService) {
		this.issueShiftingOrderService = issueShiftingOrderService;
	}

	/**
	 * Returns the issue shifting order persistence.
	 *
	 * @return the issue shifting order persistence
	 */
	public IssueShiftingOrderPersistence getIssueShiftingOrderPersistence() {
		return issueShiftingOrderPersistence;
	}

	/**
	 * Sets the issue shifting order persistence.
	 *
	 * @param issueShiftingOrderPersistence the issue shifting order persistence
	 */
	public void setIssueShiftingOrderPersistence(
		IssueShiftingOrderPersistence issueShiftingOrderPersistence) {
		this.issueShiftingOrderPersistence = issueShiftingOrderPersistence;
	}

	/**
	 * Returns the log message validation local service.
	 *
	 * @return the log message validation local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.LogMessageValidationLocalService getLogMessageValidationLocalService() {
		return logMessageValidationLocalService;
	}

	/**
	 * Sets the log message validation local service.
	 *
	 * @param logMessageValidationLocalService the log message validation local service
	 */
	public void setLogMessageValidationLocalService(
		vn.dtt.duongbien.dao.vrcb.service.LogMessageValidationLocalService logMessageValidationLocalService) {
		this.logMessageValidationLocalService = logMessageValidationLocalService;
	}

	/**
	 * Returns the log message validation remote service.
	 *
	 * @return the log message validation remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.LogMessageValidationService getLogMessageValidationService() {
		return logMessageValidationService;
	}

	/**
	 * Sets the log message validation remote service.
	 *
	 * @param logMessageValidationService the log message validation remote service
	 */
	public void setLogMessageValidationService(
		vn.dtt.duongbien.dao.vrcb.service.LogMessageValidationService logMessageValidationService) {
		this.logMessageValidationService = logMessageValidationService;
	}

	/**
	 * Returns the log message validation persistence.
	 *
	 * @return the log message validation persistence
	 */
	public LogMessageValidationPersistence getLogMessageValidationPersistence() {
		return logMessageValidationPersistence;
	}

	/**
	 * Sets the log message validation persistence.
	 *
	 * @param logMessageValidationPersistence the log message validation persistence
	 */
	public void setLogMessageValidationPersistence(
		LogMessageValidationPersistence logMessageValidationPersistence) {
		this.logMessageValidationPersistence = logMessageValidationPersistence;
	}

	/**
	 * Returns the modify local service.
	 *
	 * @return the modify local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.ModifyLocalService getModifyLocalService() {
		return modifyLocalService;
	}

	/**
	 * Sets the modify local service.
	 *
	 * @param modifyLocalService the modify local service
	 */
	public void setModifyLocalService(
		vn.dtt.duongbien.dao.vrcb.service.ModifyLocalService modifyLocalService) {
		this.modifyLocalService = modifyLocalService;
	}

	/**
	 * Returns the modify remote service.
	 *
	 * @return the modify remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.ModifyService getModifyService() {
		return modifyService;
	}

	/**
	 * Sets the modify remote service.
	 *
	 * @param modifyService the modify remote service
	 */
	public void setModifyService(
		vn.dtt.duongbien.dao.vrcb.service.ModifyService modifyService) {
		this.modifyService = modifyService;
	}

	/**
	 * Returns the modify persistence.
	 *
	 * @return the modify persistence
	 */
	public ModifyPersistence getModifyPersistence() {
		return modifyPersistence;
	}

	/**
	 * Sets the modify persistence.
	 *
	 * @param modifyPersistence the modify persistence
	 */
	public void setModifyPersistence(ModifyPersistence modifyPersistence) {
		this.modifyPersistence = modifyPersistence;
	}

	/**
	 * Returns the notice ship message local service.
	 *
	 * @return the notice ship message local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.NoticeShipMessageLocalService getNoticeShipMessageLocalService() {
		return noticeShipMessageLocalService;
	}

	/**
	 * Sets the notice ship message local service.
	 *
	 * @param noticeShipMessageLocalService the notice ship message local service
	 */
	public void setNoticeShipMessageLocalService(
		vn.dtt.duongbien.dao.vrcb.service.NoticeShipMessageLocalService noticeShipMessageLocalService) {
		this.noticeShipMessageLocalService = noticeShipMessageLocalService;
	}

	/**
	 * Returns the notice ship message remote service.
	 *
	 * @return the notice ship message remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.NoticeShipMessageService getNoticeShipMessageService() {
		return noticeShipMessageService;
	}

	/**
	 * Sets the notice ship message remote service.
	 *
	 * @param noticeShipMessageService the notice ship message remote service
	 */
	public void setNoticeShipMessageService(
		vn.dtt.duongbien.dao.vrcb.service.NoticeShipMessageService noticeShipMessageService) {
		this.noticeShipMessageService = noticeShipMessageService;
	}

	/**
	 * Returns the notice ship message persistence.
	 *
	 * @return the notice ship message persistence
	 */
	public NoticeShipMessagePersistence getNoticeShipMessagePersistence() {
		return noticeShipMessagePersistence;
	}

	/**
	 * Sets the notice ship message persistence.
	 *
	 * @param noticeShipMessagePersistence the notice ship message persistence
	 */
	public void setNoticeShipMessagePersistence(
		NoticeShipMessagePersistence noticeShipMessagePersistence) {
		this.noticeShipMessagePersistence = noticeShipMessagePersistence;
	}

	/**
	 * Returns the passenger list local service.
	 *
	 * @return the passenger list local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.PassengerListLocalService getPassengerListLocalService() {
		return passengerListLocalService;
	}

	/**
	 * Sets the passenger list local service.
	 *
	 * @param passengerListLocalService the passenger list local service
	 */
	public void setPassengerListLocalService(
		vn.dtt.duongbien.dao.vrcb.service.PassengerListLocalService passengerListLocalService) {
		this.passengerListLocalService = passengerListLocalService;
	}

	/**
	 * Returns the passenger list remote service.
	 *
	 * @return the passenger list remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.PassengerListService getPassengerListService() {
		return passengerListService;
	}

	/**
	 * Sets the passenger list remote service.
	 *
	 * @param passengerListService the passenger list remote service
	 */
	public void setPassengerListService(
		vn.dtt.duongbien.dao.vrcb.service.PassengerListService passengerListService) {
		this.passengerListService = passengerListService;
	}

	/**
	 * Returns the passenger list persistence.
	 *
	 * @return the passenger list persistence
	 */
	public PassengerListPersistence getPassengerListPersistence() {
		return passengerListPersistence;
	}

	/**
	 * Sets the passenger list persistence.
	 *
	 * @param passengerListPersistence the passenger list persistence
	 */
	public void setPassengerListPersistence(
		PassengerListPersistence passengerListPersistence) {
		this.passengerListPersistence = passengerListPersistence;
	}

	/**
	 * Returns the response bo local service.
	 *
	 * @return the response bo local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.ResponseBoLocalService getResponseBoLocalService() {
		return responseBoLocalService;
	}

	/**
	 * Sets the response bo local service.
	 *
	 * @param responseBoLocalService the response bo local service
	 */
	public void setResponseBoLocalService(
		vn.dtt.duongbien.dao.vrcb.service.ResponseBoLocalService responseBoLocalService) {
		this.responseBoLocalService = responseBoLocalService;
	}

	/**
	 * Returns the response bo remote service.
	 *
	 * @return the response bo remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.ResponseBoService getResponseBoService() {
		return responseBoService;
	}

	/**
	 * Sets the response bo remote service.
	 *
	 * @param responseBoService the response bo remote service
	 */
	public void setResponseBoService(
		vn.dtt.duongbien.dao.vrcb.service.ResponseBoService responseBoService) {
		this.responseBoService = responseBoService;
	}

	/**
	 * Returns the response bo persistence.
	 *
	 * @return the response bo persistence
	 */
	public ResponseBoPersistence getResponseBoPersistence() {
		return responseBoPersistence;
	}

	/**
	 * Sets the response bo persistence.
	 *
	 * @param responseBoPersistence the response bo persistence
	 */
	public void setResponseBoPersistence(
		ResponseBoPersistence responseBoPersistence) {
		this.responseBoPersistence = responseBoPersistence;
	}

	/**
	 * Returns the result certificate local service.
	 *
	 * @return the result certificate local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.ResultCertificateLocalService getResultCertificateLocalService() {
		return resultCertificateLocalService;
	}

	/**
	 * Sets the result certificate local service.
	 *
	 * @param resultCertificateLocalService the result certificate local service
	 */
	public void setResultCertificateLocalService(
		vn.dtt.duongbien.dao.vrcb.service.ResultCertificateLocalService resultCertificateLocalService) {
		this.resultCertificateLocalService = resultCertificateLocalService;
	}

	/**
	 * Returns the result certificate remote service.
	 *
	 * @return the result certificate remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.ResultCertificateService getResultCertificateService() {
		return resultCertificateService;
	}

	/**
	 * Sets the result certificate remote service.
	 *
	 * @param resultCertificateService the result certificate remote service
	 */
	public void setResultCertificateService(
		vn.dtt.duongbien.dao.vrcb.service.ResultCertificateService resultCertificateService) {
		this.resultCertificateService = resultCertificateService;
	}

	/**
	 * Returns the result certificate persistence.
	 *
	 * @return the result certificate persistence
	 */
	public ResultCertificatePersistence getResultCertificatePersistence() {
		return resultCertificatePersistence;
	}

	/**
	 * Sets the result certificate persistence.
	 *
	 * @param resultCertificatePersistence the result certificate persistence
	 */
	public void setResultCertificatePersistence(
		ResultCertificatePersistence resultCertificatePersistence) {
		this.resultCertificatePersistence = resultCertificatePersistence;
	}

	/**
	 * Returns the result competion local service.
	 *
	 * @return the result competion local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.ResultCompetionLocalService getResultCompetionLocalService() {
		return resultCompetionLocalService;
	}

	/**
	 * Sets the result competion local service.
	 *
	 * @param resultCompetionLocalService the result competion local service
	 */
	public void setResultCompetionLocalService(
		vn.dtt.duongbien.dao.vrcb.service.ResultCompetionLocalService resultCompetionLocalService) {
		this.resultCompetionLocalService = resultCompetionLocalService;
	}

	/**
	 * Returns the result competion remote service.
	 *
	 * @return the result competion remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.ResultCompetionService getResultCompetionService() {
		return resultCompetionService;
	}

	/**
	 * Sets the result competion remote service.
	 *
	 * @param resultCompetionService the result competion remote service
	 */
	public void setResultCompetionService(
		vn.dtt.duongbien.dao.vrcb.service.ResultCompetionService resultCompetionService) {
		this.resultCompetionService = resultCompetionService;
	}

	/**
	 * Returns the result competion persistence.
	 *
	 * @return the result competion persistence
	 */
	public ResultCompetionPersistence getResultCompetionPersistence() {
		return resultCompetionPersistence;
	}

	/**
	 * Sets the result competion persistence.
	 *
	 * @param resultCompetionPersistence the result competion persistence
	 */
	public void setResultCompetionPersistence(
		ResultCompetionPersistence resultCompetionPersistence) {
		this.resultCompetionPersistence = resultCompetionPersistence;
	}

	/**
	 * Returns the result declaration local service.
	 *
	 * @return the result declaration local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.ResultDeclarationLocalService getResultDeclarationLocalService() {
		return resultDeclarationLocalService;
	}

	/**
	 * Sets the result declaration local service.
	 *
	 * @param resultDeclarationLocalService the result declaration local service
	 */
	public void setResultDeclarationLocalService(
		vn.dtt.duongbien.dao.vrcb.service.ResultDeclarationLocalService resultDeclarationLocalService) {
		this.resultDeclarationLocalService = resultDeclarationLocalService;
	}

	/**
	 * Returns the result declaration remote service.
	 *
	 * @return the result declaration remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.ResultDeclarationService getResultDeclarationService() {
		return resultDeclarationService;
	}

	/**
	 * Sets the result declaration remote service.
	 *
	 * @param resultDeclarationService the result declaration remote service
	 */
	public void setResultDeclarationService(
		vn.dtt.duongbien.dao.vrcb.service.ResultDeclarationService resultDeclarationService) {
		this.resultDeclarationService = resultDeclarationService;
	}

	/**
	 * Returns the result declaration persistence.
	 *
	 * @return the result declaration persistence
	 */
	public ResultDeclarationPersistence getResultDeclarationPersistence() {
		return resultDeclarationPersistence;
	}

	/**
	 * Sets the result declaration persistence.
	 *
	 * @param resultDeclarationPersistence the result declaration persistence
	 */
	public void setResultDeclarationPersistence(
		ResultDeclarationPersistence resultDeclarationPersistence) {
		this.resultDeclarationPersistence = resultDeclarationPersistence;
	}

	/**
	 * Returns the result history ministry local service.
	 *
	 * @return the result history ministry local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.ResultHistoryMinistryLocalService getResultHistoryMinistryLocalService() {
		return resultHistoryMinistryLocalService;
	}

	/**
	 * Sets the result history ministry local service.
	 *
	 * @param resultHistoryMinistryLocalService the result history ministry local service
	 */
	public void setResultHistoryMinistryLocalService(
		vn.dtt.duongbien.dao.vrcb.service.ResultHistoryMinistryLocalService resultHistoryMinistryLocalService) {
		this.resultHistoryMinistryLocalService = resultHistoryMinistryLocalService;
	}

	/**
	 * Returns the result history ministry remote service.
	 *
	 * @return the result history ministry remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.ResultHistoryMinistryService getResultHistoryMinistryService() {
		return resultHistoryMinistryService;
	}

	/**
	 * Sets the result history ministry remote service.
	 *
	 * @param resultHistoryMinistryService the result history ministry remote service
	 */
	public void setResultHistoryMinistryService(
		vn.dtt.duongbien.dao.vrcb.service.ResultHistoryMinistryService resultHistoryMinistryService) {
		this.resultHistoryMinistryService = resultHistoryMinistryService;
	}

	/**
	 * Returns the result history ministry persistence.
	 *
	 * @return the result history ministry persistence
	 */
	public ResultHistoryMinistryPersistence getResultHistoryMinistryPersistence() {
		return resultHistoryMinistryPersistence;
	}

	/**
	 * Sets the result history ministry persistence.
	 *
	 * @param resultHistoryMinistryPersistence the result history ministry persistence
	 */
	public void setResultHistoryMinistryPersistence(
		ResultHistoryMinistryPersistence resultHistoryMinistryPersistence) {
		this.resultHistoryMinistryPersistence = resultHistoryMinistryPersistence;
	}

	/**
	 * Returns the result ministry local service.
	 *
	 * @return the result ministry local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.ResultMinistryLocalService getResultMinistryLocalService() {
		return resultMinistryLocalService;
	}

	/**
	 * Sets the result ministry local service.
	 *
	 * @param resultMinistryLocalService the result ministry local service
	 */
	public void setResultMinistryLocalService(
		vn.dtt.duongbien.dao.vrcb.service.ResultMinistryLocalService resultMinistryLocalService) {
		this.resultMinistryLocalService = resultMinistryLocalService;
	}

	/**
	 * Returns the result ministry remote service.
	 *
	 * @return the result ministry remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.ResultMinistryService getResultMinistryService() {
		return resultMinistryService;
	}

	/**
	 * Sets the result ministry remote service.
	 *
	 * @param resultMinistryService the result ministry remote service
	 */
	public void setResultMinistryService(
		vn.dtt.duongbien.dao.vrcb.service.ResultMinistryService resultMinistryService) {
		this.resultMinistryService = resultMinistryService;
	}

	/**
	 * Returns the result ministry persistence.
	 *
	 * @return the result ministry persistence
	 */
	public ResultMinistryPersistence getResultMinistryPersistence() {
		return resultMinistryPersistence;
	}

	/**
	 * Sets the result ministry persistence.
	 *
	 * @param resultMinistryPersistence the result ministry persistence
	 */
	public void setResultMinistryPersistence(
		ResultMinistryPersistence resultMinistryPersistence) {
		this.resultMinistryPersistence = resultMinistryPersistence;
	}

	/**
	 * Returns the result notification local service.
	 *
	 * @return the result notification local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.ResultNotificationLocalService getResultNotificationLocalService() {
		return resultNotificationLocalService;
	}

	/**
	 * Sets the result notification local service.
	 *
	 * @param resultNotificationLocalService the result notification local service
	 */
	public void setResultNotificationLocalService(
		vn.dtt.duongbien.dao.vrcb.service.ResultNotificationLocalService resultNotificationLocalService) {
		this.resultNotificationLocalService = resultNotificationLocalService;
	}

	/**
	 * Returns the result notification remote service.
	 *
	 * @return the result notification remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.ResultNotificationService getResultNotificationService() {
		return resultNotificationService;
	}

	/**
	 * Sets the result notification remote service.
	 *
	 * @param resultNotificationService the result notification remote service
	 */
	public void setResultNotificationService(
		vn.dtt.duongbien.dao.vrcb.service.ResultNotificationService resultNotificationService) {
		this.resultNotificationService = resultNotificationService;
	}

	/**
	 * Returns the result notification persistence.
	 *
	 * @return the result notification persistence
	 */
	public ResultNotificationPersistence getResultNotificationPersistence() {
		return resultNotificationPersistence;
	}

	/**
	 * Sets the result notification persistence.
	 *
	 * @param resultNotificationPersistence the result notification persistence
	 */
	public void setResultNotificationPersistence(
		ResultNotificationPersistence resultNotificationPersistence) {
		this.resultNotificationPersistence = resultNotificationPersistence;
	}

	/**
	 * Returns the rmdc ship local service.
	 *
	 * @return the rmdc ship local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.RmdcShipLocalService getRmdcShipLocalService() {
		return rmdcShipLocalService;
	}

	/**
	 * Sets the rmdc ship local service.
	 *
	 * @param rmdcShipLocalService the rmdc ship local service
	 */
	public void setRmdcShipLocalService(
		vn.dtt.duongbien.dao.vrcb.service.RmdcShipLocalService rmdcShipLocalService) {
		this.rmdcShipLocalService = rmdcShipLocalService;
	}

	/**
	 * Returns the rmdc ship remote service.
	 *
	 * @return the rmdc ship remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.RmdcShipService getRmdcShipService() {
		return rmdcShipService;
	}

	/**
	 * Sets the rmdc ship remote service.
	 *
	 * @param rmdcShipService the rmdc ship remote service
	 */
	public void setRmdcShipService(
		vn.dtt.duongbien.dao.vrcb.service.RmdcShipService rmdcShipService) {
		this.rmdcShipService = rmdcShipService;
	}

	/**
	 * Returns the rmdc ship persistence.
	 *
	 * @return the rmdc ship persistence
	 */
	public RmdcShipPersistence getRmdcShipPersistence() {
		return rmdcShipPersistence;
	}

	/**
	 * Sets the rmdc ship persistence.
	 *
	 * @param rmdcShipPersistence the rmdc ship persistence
	 */
	public void setRmdcShipPersistence(RmdcShipPersistence rmdcShipPersistence) {
		this.rmdcShipPersistence = rmdcShipPersistence;
	}

	/**
	 * Returns the temp animal quarantine local service.
	 *
	 * @return the temp animal quarantine local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempAnimalQuarantineLocalService getTempAnimalQuarantineLocalService() {
		return tempAnimalQuarantineLocalService;
	}

	/**
	 * Sets the temp animal quarantine local service.
	 *
	 * @param tempAnimalQuarantineLocalService the temp animal quarantine local service
	 */
	public void setTempAnimalQuarantineLocalService(
		vn.dtt.duongbien.dao.vrcb.service.TempAnimalQuarantineLocalService tempAnimalQuarantineLocalService) {
		this.tempAnimalQuarantineLocalService = tempAnimalQuarantineLocalService;
	}

	/**
	 * Returns the temp animal quarantine remote service.
	 *
	 * @return the temp animal quarantine remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempAnimalQuarantineService getTempAnimalQuarantineService() {
		return tempAnimalQuarantineService;
	}

	/**
	 * Sets the temp animal quarantine remote service.
	 *
	 * @param tempAnimalQuarantineService the temp animal quarantine remote service
	 */
	public void setTempAnimalQuarantineService(
		vn.dtt.duongbien.dao.vrcb.service.TempAnimalQuarantineService tempAnimalQuarantineService) {
		this.tempAnimalQuarantineService = tempAnimalQuarantineService;
	}

	/**
	 * Returns the temp animal quarantine persistence.
	 *
	 * @return the temp animal quarantine persistence
	 */
	public TempAnimalQuarantinePersistence getTempAnimalQuarantinePersistence() {
		return tempAnimalQuarantinePersistence;
	}

	/**
	 * Sets the temp animal quarantine persistence.
	 *
	 * @param tempAnimalQuarantinePersistence the temp animal quarantine persistence
	 */
	public void setTempAnimalQuarantinePersistence(
		TempAnimalQuarantinePersistence tempAnimalQuarantinePersistence) {
		this.tempAnimalQuarantinePersistence = tempAnimalQuarantinePersistence;
	}

	/**
	 * Returns the temp attachment declaration health local service.
	 *
	 * @return the temp attachment declaration health local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempAttachmentDeclarationHealthLocalService getTempAttachmentDeclarationHealthLocalService() {
		return tempAttachmentDeclarationHealthLocalService;
	}

	/**
	 * Sets the temp attachment declaration health local service.
	 *
	 * @param tempAttachmentDeclarationHealthLocalService the temp attachment declaration health local service
	 */
	public void setTempAttachmentDeclarationHealthLocalService(
		vn.dtt.duongbien.dao.vrcb.service.TempAttachmentDeclarationHealthLocalService tempAttachmentDeclarationHealthLocalService) {
		this.tempAttachmentDeclarationHealthLocalService = tempAttachmentDeclarationHealthLocalService;
	}

	/**
	 * Returns the temp attachment declaration health remote service.
	 *
	 * @return the temp attachment declaration health remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempAttachmentDeclarationHealthService getTempAttachmentDeclarationHealthService() {
		return tempAttachmentDeclarationHealthService;
	}

	/**
	 * Sets the temp attachment declaration health remote service.
	 *
	 * @param tempAttachmentDeclarationHealthService the temp attachment declaration health remote service
	 */
	public void setTempAttachmentDeclarationHealthService(
		vn.dtt.duongbien.dao.vrcb.service.TempAttachmentDeclarationHealthService tempAttachmentDeclarationHealthService) {
		this.tempAttachmentDeclarationHealthService = tempAttachmentDeclarationHealthService;
	}

	/**
	 * Returns the temp attachment declaration health persistence.
	 *
	 * @return the temp attachment declaration health persistence
	 */
	public TempAttachmentDeclarationHealthPersistence getTempAttachmentDeclarationHealthPersistence() {
		return tempAttachmentDeclarationHealthPersistence;
	}

	/**
	 * Sets the temp attachment declaration health persistence.
	 *
	 * @param tempAttachmentDeclarationHealthPersistence the temp attachment declaration health persistence
	 */
	public void setTempAttachmentDeclarationHealthPersistence(
		TempAttachmentDeclarationHealthPersistence tempAttachmentDeclarationHealthPersistence) {
		this.tempAttachmentDeclarationHealthPersistence = tempAttachmentDeclarationHealthPersistence;
	}

	/**
	 * Returns the temp cargo declaration local service.
	 *
	 * @return the temp cargo declaration local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempCargoDeclarationLocalService getTempCargoDeclarationLocalService() {
		return tempCargoDeclarationLocalService;
	}

	/**
	 * Sets the temp cargo declaration local service.
	 *
	 * @param tempCargoDeclarationLocalService the temp cargo declaration local service
	 */
	public void setTempCargoDeclarationLocalService(
		vn.dtt.duongbien.dao.vrcb.service.TempCargoDeclarationLocalService tempCargoDeclarationLocalService) {
		this.tempCargoDeclarationLocalService = tempCargoDeclarationLocalService;
	}

	/**
	 * Returns the temp cargo declaration remote service.
	 *
	 * @return the temp cargo declaration remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempCargoDeclarationService getTempCargoDeclarationService() {
		return tempCargoDeclarationService;
	}

	/**
	 * Sets the temp cargo declaration remote service.
	 *
	 * @param tempCargoDeclarationService the temp cargo declaration remote service
	 */
	public void setTempCargoDeclarationService(
		vn.dtt.duongbien.dao.vrcb.service.TempCargoDeclarationService tempCargoDeclarationService) {
		this.tempCargoDeclarationService = tempCargoDeclarationService;
	}

	/**
	 * Returns the temp cargo declaration persistence.
	 *
	 * @return the temp cargo declaration persistence
	 */
	public TempCargoDeclarationPersistence getTempCargoDeclarationPersistence() {
		return tempCargoDeclarationPersistence;
	}

	/**
	 * Sets the temp cargo declaration persistence.
	 *
	 * @param tempCargoDeclarationPersistence the temp cargo declaration persistence
	 */
	public void setTempCargoDeclarationPersistence(
		TempCargoDeclarationPersistence tempCargoDeclarationPersistence) {
		this.tempCargoDeclarationPersistence = tempCargoDeclarationPersistence;
	}

	/**
	 * Returns the temp crew details local service.
	 *
	 * @return the temp crew details local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempCrewDetailsLocalService getTempCrewDetailsLocalService() {
		return tempCrewDetailsLocalService;
	}

	/**
	 * Sets the temp crew details local service.
	 *
	 * @param tempCrewDetailsLocalService the temp crew details local service
	 */
	public void setTempCrewDetailsLocalService(
		vn.dtt.duongbien.dao.vrcb.service.TempCrewDetailsLocalService tempCrewDetailsLocalService) {
		this.tempCrewDetailsLocalService = tempCrewDetailsLocalService;
	}

	/**
	 * Returns the temp crew details remote service.
	 *
	 * @return the temp crew details remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempCrewDetailsService getTempCrewDetailsService() {
		return tempCrewDetailsService;
	}

	/**
	 * Sets the temp crew details remote service.
	 *
	 * @param tempCrewDetailsService the temp crew details remote service
	 */
	public void setTempCrewDetailsService(
		vn.dtt.duongbien.dao.vrcb.service.TempCrewDetailsService tempCrewDetailsService) {
		this.tempCrewDetailsService = tempCrewDetailsService;
	}

	/**
	 * Returns the temp crew details persistence.
	 *
	 * @return the temp crew details persistence
	 */
	public TempCrewDetailsPersistence getTempCrewDetailsPersistence() {
		return tempCrewDetailsPersistence;
	}

	/**
	 * Sets the temp crew details persistence.
	 *
	 * @param tempCrewDetailsPersistence the temp crew details persistence
	 */
	public void setTempCrewDetailsPersistence(
		TempCrewDetailsPersistence tempCrewDetailsPersistence) {
		this.tempCrewDetailsPersistence = tempCrewDetailsPersistence;
	}

	/**
	 * Returns the temp crew effects declaration local service.
	 *
	 * @return the temp crew effects declaration local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempCrewEffectsDeclarationLocalService getTempCrewEffectsDeclarationLocalService() {
		return tempCrewEffectsDeclarationLocalService;
	}

	/**
	 * Sets the temp crew effects declaration local service.
	 *
	 * @param tempCrewEffectsDeclarationLocalService the temp crew effects declaration local service
	 */
	public void setTempCrewEffectsDeclarationLocalService(
		vn.dtt.duongbien.dao.vrcb.service.TempCrewEffectsDeclarationLocalService tempCrewEffectsDeclarationLocalService) {
		this.tempCrewEffectsDeclarationLocalService = tempCrewEffectsDeclarationLocalService;
	}

	/**
	 * Returns the temp crew effects declaration remote service.
	 *
	 * @return the temp crew effects declaration remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempCrewEffectsDeclarationService getTempCrewEffectsDeclarationService() {
		return tempCrewEffectsDeclarationService;
	}

	/**
	 * Sets the temp crew effects declaration remote service.
	 *
	 * @param tempCrewEffectsDeclarationService the temp crew effects declaration remote service
	 */
	public void setTempCrewEffectsDeclarationService(
		vn.dtt.duongbien.dao.vrcb.service.TempCrewEffectsDeclarationService tempCrewEffectsDeclarationService) {
		this.tempCrewEffectsDeclarationService = tempCrewEffectsDeclarationService;
	}

	/**
	 * Returns the temp crew effects declaration persistence.
	 *
	 * @return the temp crew effects declaration persistence
	 */
	public TempCrewEffectsDeclarationPersistence getTempCrewEffectsDeclarationPersistence() {
		return tempCrewEffectsDeclarationPersistence;
	}

	/**
	 * Sets the temp crew effects declaration persistence.
	 *
	 * @param tempCrewEffectsDeclarationPersistence the temp crew effects declaration persistence
	 */
	public void setTempCrewEffectsDeclarationPersistence(
		TempCrewEffectsDeclarationPersistence tempCrewEffectsDeclarationPersistence) {
		this.tempCrewEffectsDeclarationPersistence = tempCrewEffectsDeclarationPersistence;
	}

	/**
	 * Returns the temp crew effects items local service.
	 *
	 * @return the temp crew effects items local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempCrewEffectsItemsLocalService getTempCrewEffectsItemsLocalService() {
		return tempCrewEffectsItemsLocalService;
	}

	/**
	 * Sets the temp crew effects items local service.
	 *
	 * @param tempCrewEffectsItemsLocalService the temp crew effects items local service
	 */
	public void setTempCrewEffectsItemsLocalService(
		vn.dtt.duongbien.dao.vrcb.service.TempCrewEffectsItemsLocalService tempCrewEffectsItemsLocalService) {
		this.tempCrewEffectsItemsLocalService = tempCrewEffectsItemsLocalService;
	}

	/**
	 * Returns the temp crew effects items remote service.
	 *
	 * @return the temp crew effects items remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempCrewEffectsItemsService getTempCrewEffectsItemsService() {
		return tempCrewEffectsItemsService;
	}

	/**
	 * Sets the temp crew effects items remote service.
	 *
	 * @param tempCrewEffectsItemsService the temp crew effects items remote service
	 */
	public void setTempCrewEffectsItemsService(
		vn.dtt.duongbien.dao.vrcb.service.TempCrewEffectsItemsService tempCrewEffectsItemsService) {
		this.tempCrewEffectsItemsService = tempCrewEffectsItemsService;
	}

	/**
	 * Returns the temp crew effects items persistence.
	 *
	 * @return the temp crew effects items persistence
	 */
	public TempCrewEffectsItemsPersistence getTempCrewEffectsItemsPersistence() {
		return tempCrewEffectsItemsPersistence;
	}

	/**
	 * Sets the temp crew effects items persistence.
	 *
	 * @param tempCrewEffectsItemsPersistence the temp crew effects items persistence
	 */
	public void setTempCrewEffectsItemsPersistence(
		TempCrewEffectsItemsPersistence tempCrewEffectsItemsPersistence) {
		this.tempCrewEffectsItemsPersistence = tempCrewEffectsItemsPersistence;
	}

	/**
	 * Returns the temp crew list local service.
	 *
	 * @return the temp crew list local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempCrewListLocalService getTempCrewListLocalService() {
		return tempCrewListLocalService;
	}

	/**
	 * Sets the temp crew list local service.
	 *
	 * @param tempCrewListLocalService the temp crew list local service
	 */
	public void setTempCrewListLocalService(
		vn.dtt.duongbien.dao.vrcb.service.TempCrewListLocalService tempCrewListLocalService) {
		this.tempCrewListLocalService = tempCrewListLocalService;
	}

	/**
	 * Returns the temp crew list remote service.
	 *
	 * @return the temp crew list remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempCrewListService getTempCrewListService() {
		return tempCrewListService;
	}

	/**
	 * Sets the temp crew list remote service.
	 *
	 * @param tempCrewListService the temp crew list remote service
	 */
	public void setTempCrewListService(
		vn.dtt.duongbien.dao.vrcb.service.TempCrewListService tempCrewListService) {
		this.tempCrewListService = tempCrewListService;
	}

	/**
	 * Returns the temp crew list persistence.
	 *
	 * @return the temp crew list persistence
	 */
	public TempCrewListPersistence getTempCrewListPersistence() {
		return tempCrewListPersistence;
	}

	/**
	 * Sets the temp crew list persistence.
	 *
	 * @param tempCrewListPersistence the temp crew list persistence
	 */
	public void setTempCrewListPersistence(
		TempCrewListPersistence tempCrewListPersistence) {
		this.tempCrewListPersistence = tempCrewListPersistence;
	}

	/**
	 * Returns the temp dangerous goods items local service.
	 *
	 * @return the temp dangerous goods items local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempDangerousGoodsItemsLocalService getTempDangerousGoodsItemsLocalService() {
		return tempDangerousGoodsItemsLocalService;
	}

	/**
	 * Sets the temp dangerous goods items local service.
	 *
	 * @param tempDangerousGoodsItemsLocalService the temp dangerous goods items local service
	 */
	public void setTempDangerousGoodsItemsLocalService(
		vn.dtt.duongbien.dao.vrcb.service.TempDangerousGoodsItemsLocalService tempDangerousGoodsItemsLocalService) {
		this.tempDangerousGoodsItemsLocalService = tempDangerousGoodsItemsLocalService;
	}

	/**
	 * Returns the temp dangerous goods items remote service.
	 *
	 * @return the temp dangerous goods items remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempDangerousGoodsItemsService getTempDangerousGoodsItemsService() {
		return tempDangerousGoodsItemsService;
	}

	/**
	 * Sets the temp dangerous goods items remote service.
	 *
	 * @param tempDangerousGoodsItemsService the temp dangerous goods items remote service
	 */
	public void setTempDangerousGoodsItemsService(
		vn.dtt.duongbien.dao.vrcb.service.TempDangerousGoodsItemsService tempDangerousGoodsItemsService) {
		this.tempDangerousGoodsItemsService = tempDangerousGoodsItemsService;
	}

	/**
	 * Returns the temp dangerous goods items persistence.
	 *
	 * @return the temp dangerous goods items persistence
	 */
	public TempDangerousGoodsItemsPersistence getTempDangerousGoodsItemsPersistence() {
		return tempDangerousGoodsItemsPersistence;
	}

	/**
	 * Sets the temp dangerous goods items persistence.
	 *
	 * @param tempDangerousGoodsItemsPersistence the temp dangerous goods items persistence
	 */
	public void setTempDangerousGoodsItemsPersistence(
		TempDangerousGoodsItemsPersistence tempDangerousGoodsItemsPersistence) {
		this.tempDangerousGoodsItemsPersistence = tempDangerousGoodsItemsPersistence;
	}

	/**
	 * Returns the temp dangerous goods nanifest local service.
	 *
	 * @return the temp dangerous goods nanifest local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempDangerousGoodsNanifestLocalService getTempDangerousGoodsNanifestLocalService() {
		return tempDangerousGoodsNanifestLocalService;
	}

	/**
	 * Sets the temp dangerous goods nanifest local service.
	 *
	 * @param tempDangerousGoodsNanifestLocalService the temp dangerous goods nanifest local service
	 */
	public void setTempDangerousGoodsNanifestLocalService(
		vn.dtt.duongbien.dao.vrcb.service.TempDangerousGoodsNanifestLocalService tempDangerousGoodsNanifestLocalService) {
		this.tempDangerousGoodsNanifestLocalService = tempDangerousGoodsNanifestLocalService;
	}

	/**
	 * Returns the temp dangerous goods nanifest remote service.
	 *
	 * @return the temp dangerous goods nanifest remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempDangerousGoodsNanifestService getTempDangerousGoodsNanifestService() {
		return tempDangerousGoodsNanifestService;
	}

	/**
	 * Sets the temp dangerous goods nanifest remote service.
	 *
	 * @param tempDangerousGoodsNanifestService the temp dangerous goods nanifest remote service
	 */
	public void setTempDangerousGoodsNanifestService(
		vn.dtt.duongbien.dao.vrcb.service.TempDangerousGoodsNanifestService tempDangerousGoodsNanifestService) {
		this.tempDangerousGoodsNanifestService = tempDangerousGoodsNanifestService;
	}

	/**
	 * Returns the temp dangerous goods nanifest persistence.
	 *
	 * @return the temp dangerous goods nanifest persistence
	 */
	public TempDangerousGoodsNanifestPersistence getTempDangerousGoodsNanifestPersistence() {
		return tempDangerousGoodsNanifestPersistence;
	}

	/**
	 * Sets the temp dangerous goods nanifest persistence.
	 *
	 * @param tempDangerousGoodsNanifestPersistence the temp dangerous goods nanifest persistence
	 */
	public void setTempDangerousGoodsNanifestPersistence(
		TempDangerousGoodsNanifestPersistence tempDangerousGoodsNanifestPersistence) {
		this.tempDangerousGoodsNanifestPersistence = tempDangerousGoodsNanifestPersistence;
	}

	/**
	 * Returns the temp declaration for animal quarantine local service.
	 *
	 * @return the temp declaration for animal quarantine local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempDeclarationForAnimalQuarantineLocalService getTempDeclarationForAnimalQuarantineLocalService() {
		return tempDeclarationForAnimalQuarantineLocalService;
	}

	/**
	 * Sets the temp declaration for animal quarantine local service.
	 *
	 * @param tempDeclarationForAnimalQuarantineLocalService the temp declaration for animal quarantine local service
	 */
	public void setTempDeclarationForAnimalQuarantineLocalService(
		vn.dtt.duongbien.dao.vrcb.service.TempDeclarationForAnimalQuarantineLocalService tempDeclarationForAnimalQuarantineLocalService) {
		this.tempDeclarationForAnimalQuarantineLocalService = tempDeclarationForAnimalQuarantineLocalService;
	}

	/**
	 * Returns the temp declaration for animal quarantine remote service.
	 *
	 * @return the temp declaration for animal quarantine remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempDeclarationForAnimalQuarantineService getTempDeclarationForAnimalQuarantineService() {
		return tempDeclarationForAnimalQuarantineService;
	}

	/**
	 * Sets the temp declaration for animal quarantine remote service.
	 *
	 * @param tempDeclarationForAnimalQuarantineService the temp declaration for animal quarantine remote service
	 */
	public void setTempDeclarationForAnimalQuarantineService(
		vn.dtt.duongbien.dao.vrcb.service.TempDeclarationForAnimalQuarantineService tempDeclarationForAnimalQuarantineService) {
		this.tempDeclarationForAnimalQuarantineService = tempDeclarationForAnimalQuarantineService;
	}

	/**
	 * Returns the temp declaration for animal quarantine persistence.
	 *
	 * @return the temp declaration for animal quarantine persistence
	 */
	public TempDeclarationForAnimalQuarantinePersistence getTempDeclarationForAnimalQuarantinePersistence() {
		return tempDeclarationForAnimalQuarantinePersistence;
	}

	/**
	 * Sets the temp declaration for animal quarantine persistence.
	 *
	 * @param tempDeclarationForAnimalQuarantinePersistence the temp declaration for animal quarantine persistence
	 */
	public void setTempDeclarationForAnimalQuarantinePersistence(
		TempDeclarationForAnimalQuarantinePersistence tempDeclarationForAnimalQuarantinePersistence) {
		this.tempDeclarationForAnimalQuarantinePersistence = tempDeclarationForAnimalQuarantinePersistence;
	}

	/**
	 * Returns the temp declaration for plant quarantine local service.
	 *
	 * @return the temp declaration for plant quarantine local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempDeclarationForPlantQuarantineLocalService getTempDeclarationForPlantQuarantineLocalService() {
		return tempDeclarationForPlantQuarantineLocalService;
	}

	/**
	 * Sets the temp declaration for plant quarantine local service.
	 *
	 * @param tempDeclarationForPlantQuarantineLocalService the temp declaration for plant quarantine local service
	 */
	public void setTempDeclarationForPlantQuarantineLocalService(
		vn.dtt.duongbien.dao.vrcb.service.TempDeclarationForPlantQuarantineLocalService tempDeclarationForPlantQuarantineLocalService) {
		this.tempDeclarationForPlantQuarantineLocalService = tempDeclarationForPlantQuarantineLocalService;
	}

	/**
	 * Returns the temp declaration for plant quarantine remote service.
	 *
	 * @return the temp declaration for plant quarantine remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempDeclarationForPlantQuarantineService getTempDeclarationForPlantQuarantineService() {
		return tempDeclarationForPlantQuarantineService;
	}

	/**
	 * Sets the temp declaration for plant quarantine remote service.
	 *
	 * @param tempDeclarationForPlantQuarantineService the temp declaration for plant quarantine remote service
	 */
	public void setTempDeclarationForPlantQuarantineService(
		vn.dtt.duongbien.dao.vrcb.service.TempDeclarationForPlantQuarantineService tempDeclarationForPlantQuarantineService) {
		this.tempDeclarationForPlantQuarantineService = tempDeclarationForPlantQuarantineService;
	}

	/**
	 * Returns the temp declaration for plant quarantine persistence.
	 *
	 * @return the temp declaration for plant quarantine persistence
	 */
	public TempDeclarationForPlantQuarantinePersistence getTempDeclarationForPlantQuarantinePersistence() {
		return tempDeclarationForPlantQuarantinePersistence;
	}

	/**
	 * Sets the temp declaration for plant quarantine persistence.
	 *
	 * @param tempDeclarationForPlantQuarantinePersistence the temp declaration for plant quarantine persistence
	 */
	public void setTempDeclarationForPlantQuarantinePersistence(
		TempDeclarationForPlantQuarantinePersistence tempDeclarationForPlantQuarantinePersistence) {
		this.tempDeclarationForPlantQuarantinePersistence = tempDeclarationForPlantQuarantinePersistence;
	}

	/**
	 * Returns the temp declaration of health local service.
	 *
	 * @return the temp declaration of health local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempDeclarationOfHealthLocalService getTempDeclarationOfHealthLocalService() {
		return tempDeclarationOfHealthLocalService;
	}

	/**
	 * Sets the temp declaration of health local service.
	 *
	 * @param tempDeclarationOfHealthLocalService the temp declaration of health local service
	 */
	public void setTempDeclarationOfHealthLocalService(
		vn.dtt.duongbien.dao.vrcb.service.TempDeclarationOfHealthLocalService tempDeclarationOfHealthLocalService) {
		this.tempDeclarationOfHealthLocalService = tempDeclarationOfHealthLocalService;
	}

	/**
	 * Returns the temp declaration of health remote service.
	 *
	 * @return the temp declaration of health remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempDeclarationOfHealthService getTempDeclarationOfHealthService() {
		return tempDeclarationOfHealthService;
	}

	/**
	 * Sets the temp declaration of health remote service.
	 *
	 * @param tempDeclarationOfHealthService the temp declaration of health remote service
	 */
	public void setTempDeclarationOfHealthService(
		vn.dtt.duongbien.dao.vrcb.service.TempDeclarationOfHealthService tempDeclarationOfHealthService) {
		this.tempDeclarationOfHealthService = tempDeclarationOfHealthService;
	}

	/**
	 * Returns the temp declaration of health persistence.
	 *
	 * @return the temp declaration of health persistence
	 */
	public TempDeclarationOfHealthPersistence getTempDeclarationOfHealthPersistence() {
		return tempDeclarationOfHealthPersistence;
	}

	/**
	 * Sets the temp declaration of health persistence.
	 *
	 * @param tempDeclarationOfHealthPersistence the temp declaration of health persistence
	 */
	public void setTempDeclarationOfHealthPersistence(
		TempDeclarationOfHealthPersistence tempDeclarationOfHealthPersistence) {
		this.tempDeclarationOfHealthPersistence = tempDeclarationOfHealthPersistence;
	}

	/**
	 * Returns the temp document local service.
	 *
	 * @return the temp document local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempDocumentLocalService getTempDocumentLocalService() {
		return tempDocumentLocalService;
	}

	/**
	 * Sets the temp document local service.
	 *
	 * @param tempDocumentLocalService the temp document local service
	 */
	public void setTempDocumentLocalService(
		vn.dtt.duongbien.dao.vrcb.service.TempDocumentLocalService tempDocumentLocalService) {
		this.tempDocumentLocalService = tempDocumentLocalService;
	}

	/**
	 * Returns the temp document remote service.
	 *
	 * @return the temp document remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempDocumentService getTempDocumentService() {
		return tempDocumentService;
	}

	/**
	 * Sets the temp document remote service.
	 *
	 * @param tempDocumentService the temp document remote service
	 */
	public void setTempDocumentService(
		vn.dtt.duongbien.dao.vrcb.service.TempDocumentService tempDocumentService) {
		this.tempDocumentService = tempDocumentService;
	}

	/**
	 * Returns the temp document persistence.
	 *
	 * @return the temp document persistence
	 */
	public TempDocumentPersistence getTempDocumentPersistence() {
		return tempDocumentPersistence;
	}

	/**
	 * Sets the temp document persistence.
	 *
	 * @param tempDocumentPersistence the temp document persistence
	 */
	public void setTempDocumentPersistence(
		TempDocumentPersistence tempDocumentPersistence) {
		this.tempDocumentPersistence = tempDocumentPersistence;
	}

	/**
	 * Returns the temp general declaration local service.
	 *
	 * @return the temp general declaration local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempGeneralDeclarationLocalService getTempGeneralDeclarationLocalService() {
		return tempGeneralDeclarationLocalService;
	}

	/**
	 * Sets the temp general declaration local service.
	 *
	 * @param tempGeneralDeclarationLocalService the temp general declaration local service
	 */
	public void setTempGeneralDeclarationLocalService(
		vn.dtt.duongbien.dao.vrcb.service.TempGeneralDeclarationLocalService tempGeneralDeclarationLocalService) {
		this.tempGeneralDeclarationLocalService = tempGeneralDeclarationLocalService;
	}

	/**
	 * Returns the temp general declaration remote service.
	 *
	 * @return the temp general declaration remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempGeneralDeclarationService getTempGeneralDeclarationService() {
		return tempGeneralDeclarationService;
	}

	/**
	 * Sets the temp general declaration remote service.
	 *
	 * @param tempGeneralDeclarationService the temp general declaration remote service
	 */
	public void setTempGeneralDeclarationService(
		vn.dtt.duongbien.dao.vrcb.service.TempGeneralDeclarationService tempGeneralDeclarationService) {
		this.tempGeneralDeclarationService = tempGeneralDeclarationService;
	}

	/**
	 * Returns the temp general declaration persistence.
	 *
	 * @return the temp general declaration persistence
	 */
	public TempGeneralDeclarationPersistence getTempGeneralDeclarationPersistence() {
		return tempGeneralDeclarationPersistence;
	}

	/**
	 * Sets the temp general declaration persistence.
	 *
	 * @param tempGeneralDeclarationPersistence the temp general declaration persistence
	 */
	public void setTempGeneralDeclarationPersistence(
		TempGeneralDeclarationPersistence tempGeneralDeclarationPersistence) {
		this.tempGeneralDeclarationPersistence = tempGeneralDeclarationPersistence;
	}

	/**
	 * Returns the temp goods items local service.
	 *
	 * @return the temp goods items local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempGoodsItemsLocalService getTempGoodsItemsLocalService() {
		return tempGoodsItemsLocalService;
	}

	/**
	 * Sets the temp goods items local service.
	 *
	 * @param tempGoodsItemsLocalService the temp goods items local service
	 */
	public void setTempGoodsItemsLocalService(
		vn.dtt.duongbien.dao.vrcb.service.TempGoodsItemsLocalService tempGoodsItemsLocalService) {
		this.tempGoodsItemsLocalService = tempGoodsItemsLocalService;
	}

	/**
	 * Returns the temp goods items remote service.
	 *
	 * @return the temp goods items remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempGoodsItemsService getTempGoodsItemsService() {
		return tempGoodsItemsService;
	}

	/**
	 * Sets the temp goods items remote service.
	 *
	 * @param tempGoodsItemsService the temp goods items remote service
	 */
	public void setTempGoodsItemsService(
		vn.dtt.duongbien.dao.vrcb.service.TempGoodsItemsService tempGoodsItemsService) {
		this.tempGoodsItemsService = tempGoodsItemsService;
	}

	/**
	 * Returns the temp goods items persistence.
	 *
	 * @return the temp goods items persistence
	 */
	public TempGoodsItemsPersistence getTempGoodsItemsPersistence() {
		return tempGoodsItemsPersistence;
	}

	/**
	 * Sets the temp goods items persistence.
	 *
	 * @param tempGoodsItemsPersistence the temp goods items persistence
	 */
	public void setTempGoodsItemsPersistence(
		TempGoodsItemsPersistence tempGoodsItemsPersistence) {
		this.tempGoodsItemsPersistence = tempGoodsItemsPersistence;
	}

	/**
	 * Returns the temp health crew passenger list local service.
	 *
	 * @return the temp health crew passenger list local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempHealthCrewPassengerListLocalService getTempHealthCrewPassengerListLocalService() {
		return tempHealthCrewPassengerListLocalService;
	}

	/**
	 * Sets the temp health crew passenger list local service.
	 *
	 * @param tempHealthCrewPassengerListLocalService the temp health crew passenger list local service
	 */
	public void setTempHealthCrewPassengerListLocalService(
		vn.dtt.duongbien.dao.vrcb.service.TempHealthCrewPassengerListLocalService tempHealthCrewPassengerListLocalService) {
		this.tempHealthCrewPassengerListLocalService = tempHealthCrewPassengerListLocalService;
	}

	/**
	 * Returns the temp health crew passenger list remote service.
	 *
	 * @return the temp health crew passenger list remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempHealthCrewPassengerListService getTempHealthCrewPassengerListService() {
		return tempHealthCrewPassengerListService;
	}

	/**
	 * Sets the temp health crew passenger list remote service.
	 *
	 * @param tempHealthCrewPassengerListService the temp health crew passenger list remote service
	 */
	public void setTempHealthCrewPassengerListService(
		vn.dtt.duongbien.dao.vrcb.service.TempHealthCrewPassengerListService tempHealthCrewPassengerListService) {
		this.tempHealthCrewPassengerListService = tempHealthCrewPassengerListService;
	}

	/**
	 * Returns the temp health crew passenger list persistence.
	 *
	 * @return the temp health crew passenger list persistence
	 */
	public TempHealthCrewPassengerListPersistence getTempHealthCrewPassengerListPersistence() {
		return tempHealthCrewPassengerListPersistence;
	}

	/**
	 * Sets the temp health crew passenger list persistence.
	 *
	 * @param tempHealthCrewPassengerListPersistence the temp health crew passenger list persistence
	 */
	public void setTempHealthCrewPassengerListPersistence(
		TempHealthCrewPassengerListPersistence tempHealthCrewPassengerListPersistence) {
		this.tempHealthCrewPassengerListPersistence = tempHealthCrewPassengerListPersistence;
	}

	/**
	 * Returns the temp health question local service.
	 *
	 * @return the temp health question local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempHealthQuestionLocalService getTempHealthQuestionLocalService() {
		return tempHealthQuestionLocalService;
	}

	/**
	 * Sets the temp health question local service.
	 *
	 * @param tempHealthQuestionLocalService the temp health question local service
	 */
	public void setTempHealthQuestionLocalService(
		vn.dtt.duongbien.dao.vrcb.service.TempHealthQuestionLocalService tempHealthQuestionLocalService) {
		this.tempHealthQuestionLocalService = tempHealthQuestionLocalService;
	}

	/**
	 * Returns the temp health question remote service.
	 *
	 * @return the temp health question remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempHealthQuestionService getTempHealthQuestionService() {
		return tempHealthQuestionService;
	}

	/**
	 * Sets the temp health question remote service.
	 *
	 * @param tempHealthQuestionService the temp health question remote service
	 */
	public void setTempHealthQuestionService(
		vn.dtt.duongbien.dao.vrcb.service.TempHealthQuestionService tempHealthQuestionService) {
		this.tempHealthQuestionService = tempHealthQuestionService;
	}

	/**
	 * Returns the temp health question persistence.
	 *
	 * @return the temp health question persistence
	 */
	public TempHealthQuestionPersistence getTempHealthQuestionPersistence() {
		return tempHealthQuestionPersistence;
	}

	/**
	 * Sets the temp health question persistence.
	 *
	 * @param tempHealthQuestionPersistence the temp health question persistence
	 */
	public void setTempHealthQuestionPersistence(
		TempHealthQuestionPersistence tempHealthQuestionPersistence) {
		this.tempHealthQuestionPersistence = tempHealthQuestionPersistence;
	}

	/**
	 * Returns the temp no tice ship message local service.
	 *
	 * @return the temp no tice ship message local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempNoTiceShipMessageLocalService getTempNoTiceShipMessageLocalService() {
		return tempNoTiceShipMessageLocalService;
	}

	/**
	 * Sets the temp no tice ship message local service.
	 *
	 * @param tempNoTiceShipMessageLocalService the temp no tice ship message local service
	 */
	public void setTempNoTiceShipMessageLocalService(
		vn.dtt.duongbien.dao.vrcb.service.TempNoTiceShipMessageLocalService tempNoTiceShipMessageLocalService) {
		this.tempNoTiceShipMessageLocalService = tempNoTiceShipMessageLocalService;
	}

	/**
	 * Returns the temp no tice ship message remote service.
	 *
	 * @return the temp no tice ship message remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempNoTiceShipMessageService getTempNoTiceShipMessageService() {
		return tempNoTiceShipMessageService;
	}

	/**
	 * Sets the temp no tice ship message remote service.
	 *
	 * @param tempNoTiceShipMessageService the temp no tice ship message remote service
	 */
	public void setTempNoTiceShipMessageService(
		vn.dtt.duongbien.dao.vrcb.service.TempNoTiceShipMessageService tempNoTiceShipMessageService) {
		this.tempNoTiceShipMessageService = tempNoTiceShipMessageService;
	}

	/**
	 * Returns the temp no tice ship message persistence.
	 *
	 * @return the temp no tice ship message persistence
	 */
	public TempNoTiceShipMessagePersistence getTempNoTiceShipMessagePersistence() {
		return tempNoTiceShipMessagePersistence;
	}

	/**
	 * Sets the temp no tice ship message persistence.
	 *
	 * @param tempNoTiceShipMessagePersistence the temp no tice ship message persistence
	 */
	public void setTempNoTiceShipMessagePersistence(
		TempNoTiceShipMessagePersistence tempNoTiceShipMessagePersistence) {
		this.tempNoTiceShipMessagePersistence = tempNoTiceShipMessagePersistence;
	}

	/**
	 * Returns the temp passenger details local service.
	 *
	 * @return the temp passenger details local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempPassengerDetailsLocalService getTempPassengerDetailsLocalService() {
		return tempPassengerDetailsLocalService;
	}

	/**
	 * Sets the temp passenger details local service.
	 *
	 * @param tempPassengerDetailsLocalService the temp passenger details local service
	 */
	public void setTempPassengerDetailsLocalService(
		vn.dtt.duongbien.dao.vrcb.service.TempPassengerDetailsLocalService tempPassengerDetailsLocalService) {
		this.tempPassengerDetailsLocalService = tempPassengerDetailsLocalService;
	}

	/**
	 * Returns the temp passenger details remote service.
	 *
	 * @return the temp passenger details remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempPassengerDetailsService getTempPassengerDetailsService() {
		return tempPassengerDetailsService;
	}

	/**
	 * Sets the temp passenger details remote service.
	 *
	 * @param tempPassengerDetailsService the temp passenger details remote service
	 */
	public void setTempPassengerDetailsService(
		vn.dtt.duongbien.dao.vrcb.service.TempPassengerDetailsService tempPassengerDetailsService) {
		this.tempPassengerDetailsService = tempPassengerDetailsService;
	}

	/**
	 * Returns the temp passenger details persistence.
	 *
	 * @return the temp passenger details persistence
	 */
	public TempPassengerDetailsPersistence getTempPassengerDetailsPersistence() {
		return tempPassengerDetailsPersistence;
	}

	/**
	 * Sets the temp passenger details persistence.
	 *
	 * @param tempPassengerDetailsPersistence the temp passenger details persistence
	 */
	public void setTempPassengerDetailsPersistence(
		TempPassengerDetailsPersistence tempPassengerDetailsPersistence) {
		this.tempPassengerDetailsPersistence = tempPassengerDetailsPersistence;
	}

	/**
	 * Returns the temp passenger list local service.
	 *
	 * @return the temp passenger list local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempPassengerListLocalService getTempPassengerListLocalService() {
		return tempPassengerListLocalService;
	}

	/**
	 * Sets the temp passenger list local service.
	 *
	 * @param tempPassengerListLocalService the temp passenger list local service
	 */
	public void setTempPassengerListLocalService(
		vn.dtt.duongbien.dao.vrcb.service.TempPassengerListLocalService tempPassengerListLocalService) {
		this.tempPassengerListLocalService = tempPassengerListLocalService;
	}

	/**
	 * Returns the temp passenger list remote service.
	 *
	 * @return the temp passenger list remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempPassengerListService getTempPassengerListService() {
		return tempPassengerListService;
	}

	/**
	 * Sets the temp passenger list remote service.
	 *
	 * @param tempPassengerListService the temp passenger list remote service
	 */
	public void setTempPassengerListService(
		vn.dtt.duongbien.dao.vrcb.service.TempPassengerListService tempPassengerListService) {
		this.tempPassengerListService = tempPassengerListService;
	}

	/**
	 * Returns the temp passenger list persistence.
	 *
	 * @return the temp passenger list persistence
	 */
	public TempPassengerListPersistence getTempPassengerListPersistence() {
		return tempPassengerListPersistence;
	}

	/**
	 * Sets the temp passenger list persistence.
	 *
	 * @param tempPassengerListPersistence the temp passenger list persistence
	 */
	public void setTempPassengerListPersistence(
		TempPassengerListPersistence tempPassengerListPersistence) {
		this.tempPassengerListPersistence = tempPassengerListPersistence;
	}

	/**
	 * Returns the temp plant quarantine local service.
	 *
	 * @return the temp plant quarantine local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempPlantQuarantineLocalService getTempPlantQuarantineLocalService() {
		return tempPlantQuarantineLocalService;
	}

	/**
	 * Sets the temp plant quarantine local service.
	 *
	 * @param tempPlantQuarantineLocalService the temp plant quarantine local service
	 */
	public void setTempPlantQuarantineLocalService(
		vn.dtt.duongbien.dao.vrcb.service.TempPlantQuarantineLocalService tempPlantQuarantineLocalService) {
		this.tempPlantQuarantineLocalService = tempPlantQuarantineLocalService;
	}

	/**
	 * Returns the temp plant quarantine remote service.
	 *
	 * @return the temp plant quarantine remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempPlantQuarantineService getTempPlantQuarantineService() {
		return tempPlantQuarantineService;
	}

	/**
	 * Sets the temp plant quarantine remote service.
	 *
	 * @param tempPlantQuarantineService the temp plant quarantine remote service
	 */
	public void setTempPlantQuarantineService(
		vn.dtt.duongbien.dao.vrcb.service.TempPlantQuarantineService tempPlantQuarantineService) {
		this.tempPlantQuarantineService = tempPlantQuarantineService;
	}

	/**
	 * Returns the temp plant quarantine persistence.
	 *
	 * @return the temp plant quarantine persistence
	 */
	public TempPlantQuarantinePersistence getTempPlantQuarantinePersistence() {
		return tempPlantQuarantinePersistence;
	}

	/**
	 * Sets the temp plant quarantine persistence.
	 *
	 * @param tempPlantQuarantinePersistence the temp plant quarantine persistence
	 */
	public void setTempPlantQuarantinePersistence(
		TempPlantQuarantinePersistence tempPlantQuarantinePersistence) {
		this.tempPlantQuarantinePersistence = tempPlantQuarantinePersistence;
	}

	/**
	 * Returns the temp ship security message local service.
	 *
	 * @return the temp ship security message local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempShipSecurityMessageLocalService getTempShipSecurityMessageLocalService() {
		return tempShipSecurityMessageLocalService;
	}

	/**
	 * Sets the temp ship security message local service.
	 *
	 * @param tempShipSecurityMessageLocalService the temp ship security message local service
	 */
	public void setTempShipSecurityMessageLocalService(
		vn.dtt.duongbien.dao.vrcb.service.TempShipSecurityMessageLocalService tempShipSecurityMessageLocalService) {
		this.tempShipSecurityMessageLocalService = tempShipSecurityMessageLocalService;
	}

	/**
	 * Returns the temp ship security message remote service.
	 *
	 * @return the temp ship security message remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempShipSecurityMessageService getTempShipSecurityMessageService() {
		return tempShipSecurityMessageService;
	}

	/**
	 * Sets the temp ship security message remote service.
	 *
	 * @param tempShipSecurityMessageService the temp ship security message remote service
	 */
	public void setTempShipSecurityMessageService(
		vn.dtt.duongbien.dao.vrcb.service.TempShipSecurityMessageService tempShipSecurityMessageService) {
		this.tempShipSecurityMessageService = tempShipSecurityMessageService;
	}

	/**
	 * Returns the temp ship security message persistence.
	 *
	 * @return the temp ship security message persistence
	 */
	public TempShipSecurityMessagePersistence getTempShipSecurityMessagePersistence() {
		return tempShipSecurityMessagePersistence;
	}

	/**
	 * Sets the temp ship security message persistence.
	 *
	 * @param tempShipSecurityMessagePersistence the temp ship security message persistence
	 */
	public void setTempShipSecurityMessagePersistence(
		TempShipSecurityMessagePersistence tempShipSecurityMessagePersistence) {
		this.tempShipSecurityMessagePersistence = tempShipSecurityMessagePersistence;
	}

	/**
	 * Returns the temp ship security port items local service.
	 *
	 * @return the temp ship security port items local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempShipSecurityPortItemsLocalService getTempShipSecurityPortItemsLocalService() {
		return tempShipSecurityPortItemsLocalService;
	}

	/**
	 * Sets the temp ship security port items local service.
	 *
	 * @param tempShipSecurityPortItemsLocalService the temp ship security port items local service
	 */
	public void setTempShipSecurityPortItemsLocalService(
		vn.dtt.duongbien.dao.vrcb.service.TempShipSecurityPortItemsLocalService tempShipSecurityPortItemsLocalService) {
		this.tempShipSecurityPortItemsLocalService = tempShipSecurityPortItemsLocalService;
	}

	/**
	 * Returns the temp ship security port items remote service.
	 *
	 * @return the temp ship security port items remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempShipSecurityPortItemsService getTempShipSecurityPortItemsService() {
		return tempShipSecurityPortItemsService;
	}

	/**
	 * Sets the temp ship security port items remote service.
	 *
	 * @param tempShipSecurityPortItemsService the temp ship security port items remote service
	 */
	public void setTempShipSecurityPortItemsService(
		vn.dtt.duongbien.dao.vrcb.service.TempShipSecurityPortItemsService tempShipSecurityPortItemsService) {
		this.tempShipSecurityPortItemsService = tempShipSecurityPortItemsService;
	}

	/**
	 * Returns the temp ship security port items persistence.
	 *
	 * @return the temp ship security port items persistence
	 */
	public TempShipSecurityPortItemsPersistence getTempShipSecurityPortItemsPersistence() {
		return tempShipSecurityPortItemsPersistence;
	}

	/**
	 * Sets the temp ship security port items persistence.
	 *
	 * @param tempShipSecurityPortItemsPersistence the temp ship security port items persistence
	 */
	public void setTempShipSecurityPortItemsPersistence(
		TempShipSecurityPortItemsPersistence tempShipSecurityPortItemsPersistence) {
		this.tempShipSecurityPortItemsPersistence = tempShipSecurityPortItemsPersistence;
	}

	/**
	 * Returns the temp ship stores declaration local service.
	 *
	 * @return the temp ship stores declaration local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempShipStoresDeclarationLocalService getTempShipStoresDeclarationLocalService() {
		return tempShipStoresDeclarationLocalService;
	}

	/**
	 * Sets the temp ship stores declaration local service.
	 *
	 * @param tempShipStoresDeclarationLocalService the temp ship stores declaration local service
	 */
	public void setTempShipStoresDeclarationLocalService(
		vn.dtt.duongbien.dao.vrcb.service.TempShipStoresDeclarationLocalService tempShipStoresDeclarationLocalService) {
		this.tempShipStoresDeclarationLocalService = tempShipStoresDeclarationLocalService;
	}

	/**
	 * Returns the temp ship stores declaration remote service.
	 *
	 * @return the temp ship stores declaration remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempShipStoresDeclarationService getTempShipStoresDeclarationService() {
		return tempShipStoresDeclarationService;
	}

	/**
	 * Sets the temp ship stores declaration remote service.
	 *
	 * @param tempShipStoresDeclarationService the temp ship stores declaration remote service
	 */
	public void setTempShipStoresDeclarationService(
		vn.dtt.duongbien.dao.vrcb.service.TempShipStoresDeclarationService tempShipStoresDeclarationService) {
		this.tempShipStoresDeclarationService = tempShipStoresDeclarationService;
	}

	/**
	 * Returns the temp ship stores declaration persistence.
	 *
	 * @return the temp ship stores declaration persistence
	 */
	public TempShipStoresDeclarationPersistence getTempShipStoresDeclarationPersistence() {
		return tempShipStoresDeclarationPersistence;
	}

	/**
	 * Sets the temp ship stores declaration persistence.
	 *
	 * @param tempShipStoresDeclarationPersistence the temp ship stores declaration persistence
	 */
	public void setTempShipStoresDeclarationPersistence(
		TempShipStoresDeclarationPersistence tempShipStoresDeclarationPersistence) {
		this.tempShipStoresDeclarationPersistence = tempShipStoresDeclarationPersistence;
	}

	/**
	 * Returns the temp ship stores items local service.
	 *
	 * @return the temp ship stores items local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempShipStoresItemsLocalService getTempShipStoresItemsLocalService() {
		return tempShipStoresItemsLocalService;
	}

	/**
	 * Sets the temp ship stores items local service.
	 *
	 * @param tempShipStoresItemsLocalService the temp ship stores items local service
	 */
	public void setTempShipStoresItemsLocalService(
		vn.dtt.duongbien.dao.vrcb.service.TempShipStoresItemsLocalService tempShipStoresItemsLocalService) {
		this.tempShipStoresItemsLocalService = tempShipStoresItemsLocalService;
	}

	/**
	 * Returns the temp ship stores items remote service.
	 *
	 * @return the temp ship stores items remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempShipStoresItemsService getTempShipStoresItemsService() {
		return tempShipStoresItemsService;
	}

	/**
	 * Sets the temp ship stores items remote service.
	 *
	 * @param tempShipStoresItemsService the temp ship stores items remote service
	 */
	public void setTempShipStoresItemsService(
		vn.dtt.duongbien.dao.vrcb.service.TempShipStoresItemsService tempShipStoresItemsService) {
		this.tempShipStoresItemsService = tempShipStoresItemsService;
	}

	/**
	 * Returns the temp ship stores items persistence.
	 *
	 * @return the temp ship stores items persistence
	 */
	public TempShipStoresItemsPersistence getTempShipStoresItemsPersistence() {
		return tempShipStoresItemsPersistence;
	}

	/**
	 * Sets the temp ship stores items persistence.
	 *
	 * @param tempShipStoresItemsPersistence the temp ship stores items persistence
	 */
	public void setTempShipStoresItemsPersistence(
		TempShipStoresItemsPersistence tempShipStoresItemsPersistence) {
		this.tempShipStoresItemsPersistence = tempShipStoresItemsPersistence;
	}

	/**
	 * Returns the temp unit general local service.
	 *
	 * @return the temp unit general local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempUnitGeneralLocalService getTempUnitGeneralLocalService() {
		return tempUnitGeneralLocalService;
	}

	/**
	 * Sets the temp unit general local service.
	 *
	 * @param tempUnitGeneralLocalService the temp unit general local service
	 */
	public void setTempUnitGeneralLocalService(
		vn.dtt.duongbien.dao.vrcb.service.TempUnitGeneralLocalService tempUnitGeneralLocalService) {
		this.tempUnitGeneralLocalService = tempUnitGeneralLocalService;
	}

	/**
	 * Returns the temp unit general remote service.
	 *
	 * @return the temp unit general remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.TempUnitGeneralService getTempUnitGeneralService() {
		return tempUnitGeneralService;
	}

	/**
	 * Sets the temp unit general remote service.
	 *
	 * @param tempUnitGeneralService the temp unit general remote service
	 */
	public void setTempUnitGeneralService(
		vn.dtt.duongbien.dao.vrcb.service.TempUnitGeneralService tempUnitGeneralService) {
		this.tempUnitGeneralService = tempUnitGeneralService;
	}

	/**
	 * Returns the temp unit general persistence.
	 *
	 * @return the temp unit general persistence
	 */
	public TempUnitGeneralPersistence getTempUnitGeneralPersistence() {
		return tempUnitGeneralPersistence;
	}

	/**
	 * Sets the temp unit general persistence.
	 *
	 * @param tempUnitGeneralPersistence the temp unit general persistence
	 */
	public void setTempUnitGeneralPersistence(
		TempUnitGeneralPersistence tempUnitGeneralPersistence) {
		this.tempUnitGeneralPersistence = tempUnitGeneralPersistence;
	}

	/**
	 * Returns the user port local service.
	 *
	 * @return the user port local service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.UserPortLocalService getUserPortLocalService() {
		return userPortLocalService;
	}

	/**
	 * Sets the user port local service.
	 *
	 * @param userPortLocalService the user port local service
	 */
	public void setUserPortLocalService(
		vn.dtt.duongbien.dao.vrcb.service.UserPortLocalService userPortLocalService) {
		this.userPortLocalService = userPortLocalService;
	}

	/**
	 * Returns the user port remote service.
	 *
	 * @return the user port remote service
	 */
	public vn.dtt.duongbien.dao.vrcb.service.UserPortService getUserPortService() {
		return userPortService;
	}

	/**
	 * Sets the user port remote service.
	 *
	 * @param userPortService the user port remote service
	 */
	public void setUserPortService(
		vn.dtt.duongbien.dao.vrcb.service.UserPortService userPortService) {
		this.userPortService = userPortService;
	}

	/**
	 * Returns the user port persistence.
	 *
	 * @return the user port persistence
	 */
	public UserPortPersistence getUserPortPersistence() {
		return userPortPersistence;
	}

	/**
	 * Sets the user port persistence.
	 *
	 * @param userPortPersistence the user port persistence
	 */
	public void setUserPortPersistence(UserPortPersistence userPortPersistence) {
		this.userPortPersistence = userPortPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine",
			tempDeclarationForAnimalQuarantineLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return TempDeclarationForAnimalQuarantine.class;
	}

	protected String getModelClassName() {
		return TempDeclarationForAnimalQuarantine.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = tempDeclarationForAnimalQuarantinePersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.CrewListLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.CrewListLocalService crewListLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.CrewListService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.CrewListService crewListService;
	@BeanReference(type = CrewListPersistence.class)
	protected CrewListPersistence crewListPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmArrivalPurposeLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmArrivalPurposeLocalService dmArrivalPurposeLocalService;
	@BeanReference(type = DmArrivalPurposePersistence.class)
	protected DmArrivalPurposePersistence dmArrivalPurposePersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmCertificateLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmCertificateLocalService dmCertificateLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmCertificateService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmCertificateService dmCertificateService;
	@BeanReference(type = DmCertificatePersistence.class)
	protected DmCertificatePersistence dmCertificatePersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmDocTypeLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmDocTypeLocalService dmDocTypeLocalService;
	@BeanReference(type = DmDocTypePersistence.class)
	protected DmDocTypePersistence dmDocTypePersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmEnterriseLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmEnterriseLocalService dmEnterriseLocalService;
	@BeanReference(type = DmEnterrisePersistence.class)
	protected DmEnterrisePersistence dmEnterrisePersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmGoodsLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmGoodsLocalService dmGoodsLocalService;
	@BeanReference(type = DmGoodsPersistence.class)
	protected DmGoodsPersistence dmGoodsPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmGoodsTypeLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmGoodsTypeLocalService dmGoodsTypeLocalService;
	@BeanReference(type = DmGoodsTypePersistence.class)
	protected DmGoodsTypePersistence dmGoodsTypePersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmGTBusinessTypeLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmGTBusinessTypeLocalService dmGTBusinessTypeLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmGTBusinessTypeService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmGTBusinessTypeService dmGTBusinessTypeService;
	@BeanReference(type = DmGTBusinessTypePersistence.class)
	protected DmGTBusinessTypePersistence dmGTBusinessTypePersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmGTFunctionTypeLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmGTFunctionTypeLocalService dmGTFunctionTypeLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmGTFunctionTypeService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmGTFunctionTypeService dmGTFunctionTypeService;
	@BeanReference(type = DmGTFunctionTypePersistence.class)
	protected DmGTFunctionTypePersistence dmGTFunctionTypePersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmGtOrganizationLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmGtOrganizationLocalService dmGtOrganizationLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmGtOrganizationService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmGtOrganizationService dmGtOrganizationService;
	@BeanReference(type = DmGtOrganizationPersistence.class)
	protected DmGtOrganizationPersistence dmGtOrganizationPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmGtReportCategoryLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmGtReportCategoryLocalService dmGtReportCategoryLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmGtReportCategoryService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmGtReportCategoryService dmGtReportCategoryService;
	@BeanReference(type = DmGtReportCategoryPersistence.class)
	protected DmGtReportCategoryPersistence dmGtReportCategoryPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmGtReportTemplateLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmGtReportTemplateLocalService dmGtReportTemplateLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmGtReportTemplateService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmGtReportTemplateService dmGtReportTemplateService;
	@BeanReference(type = DmGtReportTemplatePersistence.class)
	protected DmGtReportTemplatePersistence dmGtReportTemplatePersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmGtRouteConfigLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmGtRouteConfigLocalService dmGtRouteConfigLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmGtRouteConfigService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmGtRouteConfigService dmGtRouteConfigService;
	@BeanReference(type = DmGtRouteConfigPersistence.class)
	protected DmGtRouteConfigPersistence dmGtRouteConfigPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmGTShipPositionLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmGTShipPositionLocalService dmGTShipPositionLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmGTShipPositionService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmGTShipPositionService dmGTShipPositionService;
	@BeanReference(type = DmGTShipPositionPersistence.class)
	protected DmGTShipPositionPersistence dmGTShipPositionPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmGtStatusLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmGtStatusLocalService dmGtStatusLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmGtStatusService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmGtStatusService dmGtStatusService;
	@BeanReference(type = DmGtStatusPersistence.class)
	protected DmGtStatusPersistence dmGtStatusPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmGtVersionLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmGtVersionLocalService dmGtVersionLocalService;
	@BeanReference(type = DmGtVersionPersistence.class)
	protected DmGtVersionPersistence dmGtVersionPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmHistoryArrivalPurposeLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmHistoryArrivalPurposeLocalService dmHistoryArrivalPurposeLocalService;
	@BeanReference(type = DmHistoryArrivalPurposePersistence.class)
	protected DmHistoryArrivalPurposePersistence dmHistoryArrivalPurposePersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmHistoryDocTypeLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmHistoryDocTypeLocalService dmHistoryDocTypeLocalService;
	@BeanReference(type = DmHistoryDocTypePersistence.class)
	protected DmHistoryDocTypePersistence dmHistoryDocTypePersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmHistoryEnterriseLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmHistoryEnterriseLocalService dmHistoryEnterriseLocalService;
	@BeanReference(type = DmHistoryEnterrisePersistence.class)
	protected DmHistoryEnterrisePersistence dmHistoryEnterrisePersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmHistoryGoodsLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmHistoryGoodsLocalService dmHistoryGoodsLocalService;
	@BeanReference(type = DmHistoryGoodsPersistence.class)
	protected DmHistoryGoodsPersistence dmHistoryGoodsPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmHistoryGoodsTypeLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmHistoryGoodsTypeLocalService dmHistoryGoodsTypeLocalService;
	@BeanReference(type = DmHistoryGoodsTypePersistence.class)
	protected DmHistoryGoodsTypePersistence dmHistoryGoodsTypePersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmHistoryMaritimeLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmHistoryMaritimeLocalService dmHistoryMaritimeLocalService;
	@BeanReference(type = DmHistoryMaritimePersistence.class)
	protected DmHistoryMaritimePersistence dmHistoryMaritimePersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmHistoryMinistryLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmHistoryMinistryLocalService dmHistoryMinistryLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmHistoryMinistryService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmHistoryMinistryService dmHistoryMinistryService;
	@BeanReference(type = DmHistoryMinistryPersistence.class)
	protected DmHistoryMinistryPersistence dmHistoryMinistryPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmHistoryPackageLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmHistoryPackageLocalService dmHistoryPackageLocalService;
	@BeanReference(type = DmHistoryPackagePersistence.class)
	protected DmHistoryPackagePersistence dmHistoryPackagePersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmHistoryPassportTypeLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmHistoryPassportTypeLocalService dmHistoryPassportTypeLocalService;
	@BeanReference(type = DmHistoryPassportTypePersistence.class)
	protected DmHistoryPassportTypePersistence dmHistoryPassportTypePersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmHistoryPortLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmHistoryPortLocalService dmHistoryPortLocalService;
	@BeanReference(type = DmHistoryPortPersistence.class)
	protected DmHistoryPortPersistence dmHistoryPortPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmHistoryPortHarbourLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmHistoryPortHarbourLocalService dmHistoryPortHarbourLocalService;
	@BeanReference(type = DmHistoryPortHarbourPersistence.class)
	protected DmHistoryPortHarbourPersistence dmHistoryPortHarbourPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmHistoryPortRegionLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmHistoryPortRegionLocalService dmHistoryPortRegionLocalService;
	@BeanReference(type = DmHistoryPortRegionPersistence.class)
	protected DmHistoryPortRegionPersistence dmHistoryPortRegionPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmHistoryPortWharfLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmHistoryPortWharfLocalService dmHistoryPortWharfLocalService;
	@BeanReference(type = DmHistoryPortWharfPersistence.class)
	protected DmHistoryPortWharfPersistence dmHistoryPortWharfPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmHistoryRankRatingLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmHistoryRankRatingLocalService dmHistoryRankRatingLocalService;
	@BeanReference(type = DmHistoryRankRatingPersistence.class)
	protected DmHistoryRankRatingPersistence dmHistoryRankRatingPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmHistoryRepresentativeLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmHistoryRepresentativeLocalService dmHistoryRepresentativeLocalService;
	@BeanReference(type = DmHistoryRepresentativePersistence.class)
	protected DmHistoryRepresentativePersistence dmHistoryRepresentativePersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmHistorySecurityLevelLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmHistorySecurityLevelLocalService dmHistorySecurityLevelLocalService;
	@BeanReference(type = DmHistorySecurityLevelPersistence.class)
	protected DmHistorySecurityLevelPersistence dmHistorySecurityLevelPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmHistoryShipAgencyLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmHistoryShipAgencyLocalService dmHistoryShipAgencyLocalService;
	@BeanReference(type = DmHistoryShipAgencyPersistence.class)
	protected DmHistoryShipAgencyPersistence dmHistoryShipAgencyPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmHistoryShipTypeLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmHistoryShipTypeLocalService dmHistoryShipTypeLocalService;
	@BeanReference(type = DmHistoryShipTypePersistence.class)
	protected DmHistoryShipTypePersistence dmHistoryShipTypePersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmHistoryStateLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmHistoryStateLocalService dmHistoryStateLocalService;
	@BeanReference(type = DmHistoryStatePersistence.class)
	protected DmHistoryStatePersistence dmHistoryStatePersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmHistoryUnitGeneralLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmHistoryUnitGeneralLocalService dmHistoryUnitGeneralLocalService;
	@BeanReference(type = DmHistoryUnitGeneralPersistence.class)
	protected DmHistoryUnitGeneralPersistence dmHistoryUnitGeneralPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmMaritimeLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmMaritimeLocalService dmMaritimeLocalService;
	@BeanReference(type = DmMaritimePersistence.class)
	protected DmMaritimePersistence dmMaritimePersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmMinistryLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmMinistryLocalService dmMinistryLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmMinistryService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmMinistryService dmMinistryService;
	@BeanReference(type = DmMinistryPersistence.class)
	protected DmMinistryPersistence dmMinistryPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmPackageLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmPackageLocalService dmPackageLocalService;
	@BeanReference(type = DmPackagePersistence.class)
	protected DmPackagePersistence dmPackagePersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmPassportTypeLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmPassportTypeLocalService dmPassportTypeLocalService;
	@BeanReference(type = DmPassportTypePersistence.class)
	protected DmPassportTypePersistence dmPassportTypePersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmPortLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmPortLocalService dmPortLocalService;
	@BeanReference(type = DmPortPersistence.class)
	protected DmPortPersistence dmPortPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmPortHarbourLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmPortHarbourLocalService dmPortHarbourLocalService;
	@BeanReference(type = DmPortHarbourPersistence.class)
	protected DmPortHarbourPersistence dmPortHarbourPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmPortRegionLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmPortRegionLocalService dmPortRegionLocalService;
	@BeanReference(type = DmPortRegionPersistence.class)
	protected DmPortRegionPersistence dmPortRegionPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmPortWharfLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmPortWharfLocalService dmPortWharfLocalService;
	@BeanReference(type = DmPortWharfPersistence.class)
	protected DmPortWharfPersistence dmPortWharfPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmRankRatingLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmRankRatingLocalService dmRankRatingLocalService;
	@BeanReference(type = DmRankRatingPersistence.class)
	protected DmRankRatingPersistence dmRankRatingPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmRepresentativeLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmRepresentativeLocalService dmRepresentativeLocalService;
	@BeanReference(type = DmRepresentativePersistence.class)
	protected DmRepresentativePersistence dmRepresentativePersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmSecurityLevelLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmSecurityLevelLocalService dmSecurityLevelLocalService;
	@BeanReference(type = DmSecurityLevelPersistence.class)
	protected DmSecurityLevelPersistence dmSecurityLevelPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmShipAgencyLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmShipAgencyLocalService dmShipAgencyLocalService;
	@BeanReference(type = DmShipAgencyPersistence.class)
	protected DmShipAgencyPersistence dmShipAgencyPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmShipTypeLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmShipTypeLocalService dmShipTypeLocalService;
	@BeanReference(type = DmShipTypePersistence.class)
	protected DmShipTypePersistence dmShipTypePersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmStateLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmStateLocalService dmStateLocalService;
	@BeanReference(type = DmStatePersistence.class)
	protected DmStatePersistence dmStatePersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmSyncCategoryLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmSyncCategoryLocalService dmSyncCategoryLocalService;
	@BeanReference(type = DmSyncCategoryPersistence.class)
	protected DmSyncCategoryPersistence dmSyncCategoryPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmTestN01RequestLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmTestN01RequestLocalService dmTestN01RequestLocalService;
	@BeanReference(type = DmTestN01RequestPersistence.class)
	protected DmTestN01RequestPersistence dmTestN01RequestPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DmUnitGeneralLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DmUnitGeneralLocalService dmUnitGeneralLocalService;
	@BeanReference(type = DmUnitGeneralPersistence.class)
	protected DmUnitGeneralPersistence dmUnitGeneralPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DocumentLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DocumentLocalService documentLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DocumentService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DocumentService documentService;
	@BeanReference(type = DocumentPersistence.class)
	protected DocumentPersistence documentPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DocumentGeneralLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DocumentGeneralLocalService documentGeneralLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.DocumentGeneralService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.DocumentGeneralService documentGeneralService;
	@BeanReference(type = DocumentGeneralPersistence.class)
	protected DocumentGeneralPersistence documentGeneralPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.HistoryInterfaceRequestLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.HistoryInterfaceRequestLocalService historyInterfaceRequestLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.HistoryInterfaceRequestService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.HistoryInterfaceRequestService historyInterfaceRequestService;
	@BeanReference(type = HistoryInterfaceRequestPersistence.class)
	protected HistoryInterfaceRequestPersistence historyInterfaceRequestPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.HistoryInterfaceRequestFieldLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.HistoryInterfaceRequestFieldLocalService historyInterfaceRequestFieldLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.HistoryInterfaceRequestFieldService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.HistoryInterfaceRequestFieldService historyInterfaceRequestFieldService;
	@BeanReference(type = HistoryInterfaceRequestFieldPersistence.class)
	protected HistoryInterfaceRequestFieldPersistence historyInterfaceRequestFieldPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.HistoryRmdcShipLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.HistoryRmdcShipLocalService historyRmdcShipLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.HistoryRmdcShipService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.HistoryRmdcShipService historyRmdcShipService;
	@BeanReference(type = HistoryRmdcShipPersistence.class)
	protected HistoryRmdcShipPersistence historyRmdcShipPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.HistorySyncVersionLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.HistorySyncVersionLocalService historySyncVersionLocalService;
	@BeanReference(type = HistorySyncVersionPersistence.class)
	protected HistorySyncVersionPersistence historySyncVersionPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.InterfaceRequestLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.InterfaceRequestLocalService interfaceRequestLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.InterfaceRequestService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.InterfaceRequestService interfaceRequestService;
	@BeanReference(type = InterfaceRequestPersistence.class)
	protected InterfaceRequestPersistence interfaceRequestPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.InterfaceRequestFieldLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.InterfaceRequestFieldLocalService interfaceRequestFieldLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.InterfaceRequestFieldService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.InterfaceRequestFieldService interfaceRequestFieldService;
	@BeanReference(type = InterfaceRequestFieldPersistence.class)
	protected InterfaceRequestFieldPersistence interfaceRequestFieldPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.IssueAcceptanceForTransitLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.IssueAcceptanceForTransitLocalService issueAcceptanceForTransitLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.IssueAcceptanceForTransitService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.IssueAcceptanceForTransitService issueAcceptanceForTransitService;
	@BeanReference(type = IssueAcceptanceForTransitPersistence.class)
	protected IssueAcceptanceForTransitPersistence issueAcceptanceForTransitPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.IssuePermissionForTransitLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.IssuePermissionForTransitLocalService issuePermissionForTransitLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.IssuePermissionForTransitService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.IssuePermissionForTransitService issuePermissionForTransitService;
	@BeanReference(type = IssuePermissionForTransitPersistence.class)
	protected IssuePermissionForTransitPersistence issuePermissionForTransitPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.IssuePortClearanceLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.IssuePortClearanceLocalService issuePortClearanceLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.IssuePortClearanceService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.IssuePortClearanceService issuePortClearanceService;
	@BeanReference(type = IssuePortClearancePersistence.class)
	protected IssuePortClearancePersistence issuePortClearancePersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.IssueShiftingOrderLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.IssueShiftingOrderLocalService issueShiftingOrderLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.IssueShiftingOrderService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.IssueShiftingOrderService issueShiftingOrderService;
	@BeanReference(type = IssueShiftingOrderPersistence.class)
	protected IssueShiftingOrderPersistence issueShiftingOrderPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.LogMessageValidationLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.LogMessageValidationLocalService logMessageValidationLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.LogMessageValidationService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.LogMessageValidationService logMessageValidationService;
	@BeanReference(type = LogMessageValidationPersistence.class)
	protected LogMessageValidationPersistence logMessageValidationPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.ModifyLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.ModifyLocalService modifyLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.ModifyService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.ModifyService modifyService;
	@BeanReference(type = ModifyPersistence.class)
	protected ModifyPersistence modifyPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.NoticeShipMessageLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.NoticeShipMessageLocalService noticeShipMessageLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.NoticeShipMessageService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.NoticeShipMessageService noticeShipMessageService;
	@BeanReference(type = NoticeShipMessagePersistence.class)
	protected NoticeShipMessagePersistence noticeShipMessagePersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.PassengerListLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.PassengerListLocalService passengerListLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.PassengerListService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.PassengerListService passengerListService;
	@BeanReference(type = PassengerListPersistence.class)
	protected PassengerListPersistence passengerListPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.ResponseBoLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.ResponseBoLocalService responseBoLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.ResponseBoService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.ResponseBoService responseBoService;
	@BeanReference(type = ResponseBoPersistence.class)
	protected ResponseBoPersistence responseBoPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.ResultCertificateLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.ResultCertificateLocalService resultCertificateLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.ResultCertificateService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.ResultCertificateService resultCertificateService;
	@BeanReference(type = ResultCertificatePersistence.class)
	protected ResultCertificatePersistence resultCertificatePersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.ResultCompetionLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.ResultCompetionLocalService resultCompetionLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.ResultCompetionService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.ResultCompetionService resultCompetionService;
	@BeanReference(type = ResultCompetionPersistence.class)
	protected ResultCompetionPersistence resultCompetionPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.ResultDeclarationLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.ResultDeclarationLocalService resultDeclarationLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.ResultDeclarationService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.ResultDeclarationService resultDeclarationService;
	@BeanReference(type = ResultDeclarationPersistence.class)
	protected ResultDeclarationPersistence resultDeclarationPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.ResultHistoryMinistryLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.ResultHistoryMinistryLocalService resultHistoryMinistryLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.ResultHistoryMinistryService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.ResultHistoryMinistryService resultHistoryMinistryService;
	@BeanReference(type = ResultHistoryMinistryPersistence.class)
	protected ResultHistoryMinistryPersistence resultHistoryMinistryPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.ResultMinistryLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.ResultMinistryLocalService resultMinistryLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.ResultMinistryService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.ResultMinistryService resultMinistryService;
	@BeanReference(type = ResultMinistryPersistence.class)
	protected ResultMinistryPersistence resultMinistryPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.ResultNotificationLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.ResultNotificationLocalService resultNotificationLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.ResultNotificationService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.ResultNotificationService resultNotificationService;
	@BeanReference(type = ResultNotificationPersistence.class)
	protected ResultNotificationPersistence resultNotificationPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.RmdcShipLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.RmdcShipLocalService rmdcShipLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.RmdcShipService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.RmdcShipService rmdcShipService;
	@BeanReference(type = RmdcShipPersistence.class)
	protected RmdcShipPersistence rmdcShipPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempAnimalQuarantineLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempAnimalQuarantineLocalService tempAnimalQuarantineLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempAnimalQuarantineService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempAnimalQuarantineService tempAnimalQuarantineService;
	@BeanReference(type = TempAnimalQuarantinePersistence.class)
	protected TempAnimalQuarantinePersistence tempAnimalQuarantinePersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempAttachmentDeclarationHealthLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempAttachmentDeclarationHealthLocalService tempAttachmentDeclarationHealthLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempAttachmentDeclarationHealthService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempAttachmentDeclarationHealthService tempAttachmentDeclarationHealthService;
	@BeanReference(type = TempAttachmentDeclarationHealthPersistence.class)
	protected TempAttachmentDeclarationHealthPersistence tempAttachmentDeclarationHealthPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempCargoDeclarationLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempCargoDeclarationLocalService tempCargoDeclarationLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempCargoDeclarationService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempCargoDeclarationService tempCargoDeclarationService;
	@BeanReference(type = TempCargoDeclarationPersistence.class)
	protected TempCargoDeclarationPersistence tempCargoDeclarationPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempCrewDetailsLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempCrewDetailsLocalService tempCrewDetailsLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempCrewDetailsService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempCrewDetailsService tempCrewDetailsService;
	@BeanReference(type = TempCrewDetailsPersistence.class)
	protected TempCrewDetailsPersistence tempCrewDetailsPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempCrewEffectsDeclarationLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempCrewEffectsDeclarationLocalService tempCrewEffectsDeclarationLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempCrewEffectsDeclarationService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempCrewEffectsDeclarationService tempCrewEffectsDeclarationService;
	@BeanReference(type = TempCrewEffectsDeclarationPersistence.class)
	protected TempCrewEffectsDeclarationPersistence tempCrewEffectsDeclarationPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempCrewEffectsItemsLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempCrewEffectsItemsLocalService tempCrewEffectsItemsLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempCrewEffectsItemsService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempCrewEffectsItemsService tempCrewEffectsItemsService;
	@BeanReference(type = TempCrewEffectsItemsPersistence.class)
	protected TempCrewEffectsItemsPersistence tempCrewEffectsItemsPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempCrewListLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempCrewListLocalService tempCrewListLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempCrewListService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempCrewListService tempCrewListService;
	@BeanReference(type = TempCrewListPersistence.class)
	protected TempCrewListPersistence tempCrewListPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempDangerousGoodsItemsLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempDangerousGoodsItemsLocalService tempDangerousGoodsItemsLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempDangerousGoodsItemsService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempDangerousGoodsItemsService tempDangerousGoodsItemsService;
	@BeanReference(type = TempDangerousGoodsItemsPersistence.class)
	protected TempDangerousGoodsItemsPersistence tempDangerousGoodsItemsPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempDangerousGoodsNanifestLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempDangerousGoodsNanifestLocalService tempDangerousGoodsNanifestLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempDangerousGoodsNanifestService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempDangerousGoodsNanifestService tempDangerousGoodsNanifestService;
	@BeanReference(type = TempDangerousGoodsNanifestPersistence.class)
	protected TempDangerousGoodsNanifestPersistence tempDangerousGoodsNanifestPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempDeclarationForAnimalQuarantineLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempDeclarationForAnimalQuarantineLocalService tempDeclarationForAnimalQuarantineLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempDeclarationForAnimalQuarantineService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempDeclarationForAnimalQuarantineService tempDeclarationForAnimalQuarantineService;
	@BeanReference(type = TempDeclarationForAnimalQuarantinePersistence.class)
	protected TempDeclarationForAnimalQuarantinePersistence tempDeclarationForAnimalQuarantinePersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempDeclarationForPlantQuarantineLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempDeclarationForPlantQuarantineLocalService tempDeclarationForPlantQuarantineLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempDeclarationForPlantQuarantineService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempDeclarationForPlantQuarantineService tempDeclarationForPlantQuarantineService;
	@BeanReference(type = TempDeclarationForPlantQuarantinePersistence.class)
	protected TempDeclarationForPlantQuarantinePersistence tempDeclarationForPlantQuarantinePersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempDeclarationOfHealthLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempDeclarationOfHealthLocalService tempDeclarationOfHealthLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempDeclarationOfHealthService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempDeclarationOfHealthService tempDeclarationOfHealthService;
	@BeanReference(type = TempDeclarationOfHealthPersistence.class)
	protected TempDeclarationOfHealthPersistence tempDeclarationOfHealthPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempDocumentLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempDocumentLocalService tempDocumentLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempDocumentService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempDocumentService tempDocumentService;
	@BeanReference(type = TempDocumentPersistence.class)
	protected TempDocumentPersistence tempDocumentPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempGeneralDeclarationLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempGeneralDeclarationLocalService tempGeneralDeclarationLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempGeneralDeclarationService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempGeneralDeclarationService tempGeneralDeclarationService;
	@BeanReference(type = TempGeneralDeclarationPersistence.class)
	protected TempGeneralDeclarationPersistence tempGeneralDeclarationPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempGoodsItemsLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempGoodsItemsLocalService tempGoodsItemsLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempGoodsItemsService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempGoodsItemsService tempGoodsItemsService;
	@BeanReference(type = TempGoodsItemsPersistence.class)
	protected TempGoodsItemsPersistence tempGoodsItemsPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempHealthCrewPassengerListLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempHealthCrewPassengerListLocalService tempHealthCrewPassengerListLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempHealthCrewPassengerListService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempHealthCrewPassengerListService tempHealthCrewPassengerListService;
	@BeanReference(type = TempHealthCrewPassengerListPersistence.class)
	protected TempHealthCrewPassengerListPersistence tempHealthCrewPassengerListPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempHealthQuestionLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempHealthQuestionLocalService tempHealthQuestionLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempHealthQuestionService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempHealthQuestionService tempHealthQuestionService;
	@BeanReference(type = TempHealthQuestionPersistence.class)
	protected TempHealthQuestionPersistence tempHealthQuestionPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempNoTiceShipMessageLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempNoTiceShipMessageLocalService tempNoTiceShipMessageLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempNoTiceShipMessageService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempNoTiceShipMessageService tempNoTiceShipMessageService;
	@BeanReference(type = TempNoTiceShipMessagePersistence.class)
	protected TempNoTiceShipMessagePersistence tempNoTiceShipMessagePersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempPassengerDetailsLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempPassengerDetailsLocalService tempPassengerDetailsLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempPassengerDetailsService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempPassengerDetailsService tempPassengerDetailsService;
	@BeanReference(type = TempPassengerDetailsPersistence.class)
	protected TempPassengerDetailsPersistence tempPassengerDetailsPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempPassengerListLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempPassengerListLocalService tempPassengerListLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempPassengerListService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempPassengerListService tempPassengerListService;
	@BeanReference(type = TempPassengerListPersistence.class)
	protected TempPassengerListPersistence tempPassengerListPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempPlantQuarantineLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempPlantQuarantineLocalService tempPlantQuarantineLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempPlantQuarantineService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempPlantQuarantineService tempPlantQuarantineService;
	@BeanReference(type = TempPlantQuarantinePersistence.class)
	protected TempPlantQuarantinePersistence tempPlantQuarantinePersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempShipSecurityMessageLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempShipSecurityMessageLocalService tempShipSecurityMessageLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempShipSecurityMessageService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempShipSecurityMessageService tempShipSecurityMessageService;
	@BeanReference(type = TempShipSecurityMessagePersistence.class)
	protected TempShipSecurityMessagePersistence tempShipSecurityMessagePersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempShipSecurityPortItemsLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempShipSecurityPortItemsLocalService tempShipSecurityPortItemsLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempShipSecurityPortItemsService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempShipSecurityPortItemsService tempShipSecurityPortItemsService;
	@BeanReference(type = TempShipSecurityPortItemsPersistence.class)
	protected TempShipSecurityPortItemsPersistence tempShipSecurityPortItemsPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempShipStoresDeclarationLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempShipStoresDeclarationLocalService tempShipStoresDeclarationLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempShipStoresDeclarationService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempShipStoresDeclarationService tempShipStoresDeclarationService;
	@BeanReference(type = TempShipStoresDeclarationPersistence.class)
	protected TempShipStoresDeclarationPersistence tempShipStoresDeclarationPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempShipStoresItemsLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempShipStoresItemsLocalService tempShipStoresItemsLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempShipStoresItemsService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempShipStoresItemsService tempShipStoresItemsService;
	@BeanReference(type = TempShipStoresItemsPersistence.class)
	protected TempShipStoresItemsPersistence tempShipStoresItemsPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempUnitGeneralLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempUnitGeneralLocalService tempUnitGeneralLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.TempUnitGeneralService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.TempUnitGeneralService tempUnitGeneralService;
	@BeanReference(type = TempUnitGeneralPersistence.class)
	protected TempUnitGeneralPersistence tempUnitGeneralPersistence;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.UserPortLocalService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.UserPortLocalService userPortLocalService;
	@BeanReference(type = vn.dtt.duongbien.dao.vrcb.service.UserPortService.class)
	protected vn.dtt.duongbien.dao.vrcb.service.UserPortService userPortService;
	@BeanReference(type = UserPortPersistence.class)
	protected UserPortPersistence userPortPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private TempDeclarationForAnimalQuarantineLocalServiceClpInvoker _clpInvoker =
		new TempDeclarationForAnimalQuarantineLocalServiceClpInvoker();
}