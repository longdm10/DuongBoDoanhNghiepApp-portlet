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

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DmHistoryUnitGeneralLocalService}.
 *
 * @author longdm
 * @see DmHistoryUnitGeneralLocalService
 * @generated
 */
public class DmHistoryUnitGeneralLocalServiceWrapper
	implements DmHistoryUnitGeneralLocalService,
		ServiceWrapper<DmHistoryUnitGeneralLocalService> {
	public DmHistoryUnitGeneralLocalServiceWrapper(
		DmHistoryUnitGeneralLocalService dmHistoryUnitGeneralLocalService) {
		_dmHistoryUnitGeneralLocalService = dmHistoryUnitGeneralLocalService;
	}

	/**
	* Adds the dm history unit general to the database. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryUnitGeneral the dm history unit general
	* @return the dm history unit general that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryUnitGeneral addDmHistoryUnitGeneral(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryUnitGeneral dmHistoryUnitGeneral)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryUnitGeneralLocalService.addDmHistoryUnitGeneral(dmHistoryUnitGeneral);
	}

	/**
	* Creates a new dm history unit general with the primary key. Does not add the dm history unit general to the database.
	*
	* @param id the primary key for the new dm history unit general
	* @return the new dm history unit general
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryUnitGeneral createDmHistoryUnitGeneral(
		int id) {
		return _dmHistoryUnitGeneralLocalService.createDmHistoryUnitGeneral(id);
	}

	/**
	* Deletes the dm history unit general with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history unit general
	* @return the dm history unit general that was removed
	* @throws PortalException if a dm history unit general with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryUnitGeneral deleteDmHistoryUnitGeneral(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryUnitGeneralLocalService.deleteDmHistoryUnitGeneral(id);
	}

	/**
	* Deletes the dm history unit general from the database. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryUnitGeneral the dm history unit general
	* @return the dm history unit general that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryUnitGeneral deleteDmHistoryUnitGeneral(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryUnitGeneral dmHistoryUnitGeneral)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryUnitGeneralLocalService.deleteDmHistoryUnitGeneral(dmHistoryUnitGeneral);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dmHistoryUnitGeneralLocalService.dynamicQuery();
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryUnitGeneralLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryUnitGeneralModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryUnitGeneralLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryUnitGeneralModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryUnitGeneralLocalService.dynamicQuery(dynamicQuery,
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
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryUnitGeneralLocalService.dynamicQueryCount(dynamicQuery);
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
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryUnitGeneralLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryUnitGeneral fetchDmHistoryUnitGeneral(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryUnitGeneralLocalService.fetchDmHistoryUnitGeneral(id);
	}

	/**
	* Returns the dm history unit general with the primary key.
	*
	* @param id the primary key of the dm history unit general
	* @return the dm history unit general
	* @throws PortalException if a dm history unit general with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryUnitGeneral getDmHistoryUnitGeneral(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryUnitGeneralLocalService.getDmHistoryUnitGeneral(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryUnitGeneralLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm history unit generals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryUnitGeneralModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm history unit generals
	* @param end the upper bound of the range of dm history unit generals (not inclusive)
	* @return the range of dm history unit generals
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryUnitGeneral> getDmHistoryUnitGenerals(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryUnitGeneralLocalService.getDmHistoryUnitGenerals(start,
			end);
	}

	/**
	* Returns the number of dm history unit generals.
	*
	* @return the number of dm history unit generals
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDmHistoryUnitGeneralsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryUnitGeneralLocalService.getDmHistoryUnitGeneralsCount();
	}

	/**
	* Updates the dm history unit general in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryUnitGeneral the dm history unit general
	* @return the dm history unit general that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryUnitGeneral updateDmHistoryUnitGeneral(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryUnitGeneral dmHistoryUnitGeneral)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryUnitGeneralLocalService.updateDmHistoryUnitGeneral(dmHistoryUnitGeneral);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dmHistoryUnitGeneralLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dmHistoryUnitGeneralLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dmHistoryUnitGeneralLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DmHistoryUnitGeneralLocalService getWrappedDmHistoryUnitGeneralLocalService() {
		return _dmHistoryUnitGeneralLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDmHistoryUnitGeneralLocalService(
		DmHistoryUnitGeneralLocalService dmHistoryUnitGeneralLocalService) {
		_dmHistoryUnitGeneralLocalService = dmHistoryUnitGeneralLocalService;
	}

	@Override
	public DmHistoryUnitGeneralLocalService getWrappedService() {
		return _dmHistoryUnitGeneralLocalService;
	}

	@Override
	public void setWrappedService(
		DmHistoryUnitGeneralLocalService dmHistoryUnitGeneralLocalService) {
		_dmHistoryUnitGeneralLocalService = dmHistoryUnitGeneralLocalService;
	}

	private DmHistoryUnitGeneralLocalService _dmHistoryUnitGeneralLocalService;
}