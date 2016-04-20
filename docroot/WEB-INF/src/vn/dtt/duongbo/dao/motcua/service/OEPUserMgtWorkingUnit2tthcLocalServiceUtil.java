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

package vn.dtt.duongbo.dao.motcua.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for OEPUserMgtWorkingUnit2tthc. This utility wraps
 * {@link vn.dtt.duongbo.dao.motcua.service.impl.OEPUserMgtWorkingUnit2tthcLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author win_64
 * @see OEPUserMgtWorkingUnit2tthcLocalService
 * @see vn.dtt.duongbo.dao.motcua.service.base.OEPUserMgtWorkingUnit2tthcLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.motcua.service.impl.OEPUserMgtWorkingUnit2tthcLocalServiceImpl
 * @generated
 */
public class OEPUserMgtWorkingUnit2tthcLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.duongbo.dao.motcua.service.impl.OEPUserMgtWorkingUnit2tthcLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the o e p user mgt working unit2tthc to the database. Also notifies the appropriate model listeners.
	*
	* @param oepUserMgtWorkingUnit2tthc the o e p user mgt working unit2tthc
	* @return the o e p user mgt working unit2tthc that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc addOEPUserMgtWorkingUnit2tthc(
		vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addOEPUserMgtWorkingUnit2tthc(oepUserMgtWorkingUnit2tthc);
	}

	/**
	* Creates a new o e p user mgt working unit2tthc with the primary key. Does not add the o e p user mgt working unit2tthc to the database.
	*
	* @param workingUnit2TTHCId the primary key for the new o e p user mgt working unit2tthc
	* @return the new o e p user mgt working unit2tthc
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc createOEPUserMgtWorkingUnit2tthc(
		long workingUnit2TTHCId) {
		return getService().createOEPUserMgtWorkingUnit2tthc(workingUnit2TTHCId);
	}

	/**
	* Deletes the o e p user mgt working unit2tthc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param workingUnit2TTHCId the primary key of the o e p user mgt working unit2tthc
	* @return the o e p user mgt working unit2tthc that was removed
	* @throws PortalException if a o e p user mgt working unit2tthc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc deleteOEPUserMgtWorkingUnit2tthc(
		long workingUnit2TTHCId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteOEPUserMgtWorkingUnit2tthc(workingUnit2TTHCId);
	}

	/**
	* Deletes the o e p user mgt working unit2tthc from the database. Also notifies the appropriate model listeners.
	*
	* @param oepUserMgtWorkingUnit2tthc the o e p user mgt working unit2tthc
	* @return the o e p user mgt working unit2tthc that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc deleteOEPUserMgtWorkingUnit2tthc(
		vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .deleteOEPUserMgtWorkingUnit2tthc(oepUserMgtWorkingUnit2tthc);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtWorkingUnit2tthcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtWorkingUnit2tthcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc fetchOEPUserMgtWorkingUnit2tthc(
		long workingUnit2TTHCId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchOEPUserMgtWorkingUnit2tthc(workingUnit2TTHCId);
	}

	/**
	* Returns the o e p user mgt working unit2tthc with the primary key.
	*
	* @param workingUnit2TTHCId the primary key of the o e p user mgt working unit2tthc
	* @return the o e p user mgt working unit2tthc
	* @throws PortalException if a o e p user mgt working unit2tthc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc getOEPUserMgtWorkingUnit2tthc(
		long workingUnit2TTHCId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getOEPUserMgtWorkingUnit2tthc(workingUnit2TTHCId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the o e p user mgt working unit2tthcs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.OEPUserMgtWorkingUnit2tthcModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of o e p user mgt working unit2tthcs
	* @param end the upper bound of the range of o e p user mgt working unit2tthcs (not inclusive)
	* @return the range of o e p user mgt working unit2tthcs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc> getOEPUserMgtWorkingUnit2tthcs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getOEPUserMgtWorkingUnit2tthcs(start, end);
	}

	/**
	* Returns the number of o e p user mgt working unit2tthcs.
	*
	* @return the number of o e p user mgt working unit2tthcs
	* @throws SystemException if a system exception occurred
	*/
	public static int getOEPUserMgtWorkingUnit2tthcsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getOEPUserMgtWorkingUnit2tthcsCount();
	}

	/**
	* Updates the o e p user mgt working unit2tthc in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param oepUserMgtWorkingUnit2tthc the o e p user mgt working unit2tthc
	* @return the o e p user mgt working unit2tthc that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc updateOEPUserMgtWorkingUnit2tthc(
		vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc oepUserMgtWorkingUnit2tthc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateOEPUserMgtWorkingUnit2tthc(oepUserMgtWorkingUnit2tthc);
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

	public static vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc fetchByF_TTHCId_workingUnitId(
		long TTHCId, long workingUnitId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchByF_TTHCId_workingUnitId(TTHCId, workingUnitId);
	}

	public static void clearService() {
		_service = null;
	}

	public static OEPUserMgtWorkingUnit2tthcLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					OEPUserMgtWorkingUnit2tthcLocalService.class.getName());

			if (invokableLocalService instanceof OEPUserMgtWorkingUnit2tthcLocalService) {
				_service = (OEPUserMgtWorkingUnit2tthcLocalService)invokableLocalService;
			}
			else {
				_service = new OEPUserMgtWorkingUnit2tthcLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(OEPUserMgtWorkingUnit2tthcLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(OEPUserMgtWorkingUnit2tthcLocalService service) {
	}

	private static OEPUserMgtWorkingUnit2tthcLocalService _service;
}