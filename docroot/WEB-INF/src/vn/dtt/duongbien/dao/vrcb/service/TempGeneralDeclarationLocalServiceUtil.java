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

package vn.dtt.duongbien.dao.vrcb.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for TempGeneralDeclaration. This utility wraps
 * {@link vn.dtt.duongbien.dao.vrcb.service.impl.TempGeneralDeclarationLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author longdm
 * @see TempGeneralDeclarationLocalService
 * @see vn.dtt.duongbien.dao.vrcb.service.base.TempGeneralDeclarationLocalServiceBaseImpl
 * @see vn.dtt.duongbien.dao.vrcb.service.impl.TempGeneralDeclarationLocalServiceImpl
 * @generated
 */
public class TempGeneralDeclarationLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.duongbien.dao.vrcb.service.impl.TempGeneralDeclarationLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the temp general declaration to the database. Also notifies the appropriate model listeners.
	*
	* @param tempGeneralDeclaration the temp general declaration
	* @return the temp general declaration that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclaration addTempGeneralDeclaration(
		vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclaration tempGeneralDeclaration)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addTempGeneralDeclaration(tempGeneralDeclaration);
	}

	/**
	* Creates a new temp general declaration with the primary key. Does not add the temp general declaration to the database.
	*
	* @param id the primary key for the new temp general declaration
	* @return the new temp general declaration
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclaration createTempGeneralDeclaration(
		long id) {
		return getService().createTempGeneralDeclaration(id);
	}

	/**
	* Deletes the temp general declaration with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp general declaration
	* @return the temp general declaration that was removed
	* @throws PortalException if a temp general declaration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclaration deleteTempGeneralDeclaration(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteTempGeneralDeclaration(id);
	}

	/**
	* Deletes the temp general declaration from the database. Also notifies the appropriate model listeners.
	*
	* @param tempGeneralDeclaration the temp general declaration
	* @return the temp general declaration that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclaration deleteTempGeneralDeclaration(
		vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclaration tempGeneralDeclaration)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteTempGeneralDeclaration(tempGeneralDeclaration);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempGeneralDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempGeneralDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclaration fetchTempGeneralDeclaration(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchTempGeneralDeclaration(id);
	}

	/**
	* Returns the temp general declaration with the primary key.
	*
	* @param id the primary key of the temp general declaration
	* @return the temp general declaration
	* @throws PortalException if a temp general declaration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclaration getTempGeneralDeclaration(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getTempGeneralDeclaration(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the temp general declarations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempGeneralDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of temp general declarations
	* @param end the upper bound of the range of temp general declarations (not inclusive)
	* @return the range of temp general declarations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclaration> getTempGeneralDeclarations(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTempGeneralDeclarations(start, end);
	}

	/**
	* Returns the number of temp general declarations.
	*
	* @return the number of temp general declarations
	* @throws SystemException if a system exception occurred
	*/
	public static int getTempGeneralDeclarationsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTempGeneralDeclarationsCount();
	}

	/**
	* Updates the temp general declaration in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempGeneralDeclaration the temp general declaration
	* @return the temp general declaration that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclaration updateTempGeneralDeclaration(
		vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclaration tempGeneralDeclaration)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTempGeneralDeclaration(tempGeneralDeclaration);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclaration addTemGeneralDeclaration(
		java.lang.String nameOfShip, java.lang.String nameOfMaster,
		java.lang.String portRegionCode, java.lang.String portOfArrivalCode,
		java.lang.String portHarbourCode, java.lang.String portWharfCode,
		int isArrival, java.lang.String voyageNumber, int numberOfCrew,
		int numberOfPassengers, java.lang.String lastPortOfCallCode,
		java.util.Date dateOfArrival,
		java.lang.String taxCodeOfShipownersAgents,
		java.lang.String nameOfShipownersAgents,
		java.lang.String shipAgencyAddress, java.lang.String shipAgencyPhone,
		java.lang.String shipAgencyFax, java.lang.String shipAgencyEmail,
		java.util.Date signDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addTemGeneralDeclaration(nameOfShip, nameOfMaster,
			portRegionCode, portOfArrivalCode, portHarbourCode, portWharfCode,
			isArrival, voyageNumber, numberOfCrew, numberOfPassengers,
			lastPortOfCallCode, dateOfArrival, taxCodeOfShipownersAgents,
			nameOfShipownersAgents, shipAgencyAddress, shipAgencyPhone,
			shipAgencyFax, shipAgencyEmail, signDate);
	}

	public static vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclaration updateTemGeneralDeclaration(
		java.lang.Long id, java.lang.String nameOfShip,
		java.lang.String nameOfMaster, java.lang.String portRegionCode,
		java.lang.String portOfArrivalCode, java.lang.String portHarbourCode,
		java.lang.String portWharfCode, int isArrival,
		java.lang.String voyageNumber, int numberOfCrew,
		int numberOfPassengers, java.lang.String lastPortOfCallCode,
		java.util.Date dateOfArrival,
		java.lang.String taxCodeOfShipownersAgents,
		java.lang.String nameOfShipownersAgents,
		java.lang.String shipAgencyAddress, java.lang.String shipAgencyPhone,
		java.lang.String shipAgencyFax, java.lang.String shipAgencyEmail,
		java.util.Date signDate)
		throws com.liferay.portal.NoSuchModelException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateTemGeneralDeclaration(id, nameOfShip, nameOfMaster,
			portRegionCode, portOfArrivalCode, portHarbourCode, portWharfCode,
			isArrival, voyageNumber, numberOfCrew, numberOfPassengers,
			lastPortOfCallCode, dateOfArrival, taxCodeOfShipownersAgents,
			nameOfShipownersAgents, shipAgencyAddress, shipAgencyPhone,
			shipAgencyFax, shipAgencyEmail, signDate);
	}

	public static void deletTempGeneral(long itemId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempGeneralDeclarationException {
		getService().deletTempGeneral(itemId);
	}

	public static void updateTempGeneral(long itemId,
		java.lang.String briefDescriptionOfTheCargo, double grossTonnage)
		throws com.liferay.portal.NoSuchModelException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.updateTempGeneral(itemId, briefDescriptionOfTheCargo, grossTonnage);
	}

	public static void clearService() {
		_service = null;
	}

	public static TempGeneralDeclarationLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					TempGeneralDeclarationLocalService.class.getName());

			if (invokableLocalService instanceof TempGeneralDeclarationLocalService) {
				_service = (TempGeneralDeclarationLocalService)invokableLocalService;
			}
			else {
				_service = new TempGeneralDeclarationLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(TempGeneralDeclarationLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(TempGeneralDeclarationLocalService service) {
	}

	private static TempGeneralDeclarationLocalService _service;
}