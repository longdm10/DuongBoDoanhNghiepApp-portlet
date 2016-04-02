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
 * Provides a wrapper for {@link TempPlantQuarantineLocalService}.
 *
 * @author longdm
 * @see TempPlantQuarantineLocalService
 * @generated
 */
public class TempPlantQuarantineLocalServiceWrapper
	implements TempPlantQuarantineLocalService,
		ServiceWrapper<TempPlantQuarantineLocalService> {
	public TempPlantQuarantineLocalServiceWrapper(
		TempPlantQuarantineLocalService tempPlantQuarantineLocalService) {
		_tempPlantQuarantineLocalService = tempPlantQuarantineLocalService;
	}

	/**
	* Adds the temp plant quarantine to the database. Also notifies the appropriate model listeners.
	*
	* @param tempPlantQuarantine the temp plant quarantine
	* @return the temp plant quarantine that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempPlantQuarantine addTempPlantQuarantine(
		vn.dtt.duongbien.dao.vrcb.model.TempPlantQuarantine tempPlantQuarantine)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempPlantQuarantineLocalService.addTempPlantQuarantine(tempPlantQuarantine);
	}

	/**
	* Creates a new temp plant quarantine with the primary key. Does not add the temp plant quarantine to the database.
	*
	* @param id the primary key for the new temp plant quarantine
	* @return the new temp plant quarantine
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempPlantQuarantine createTempPlantQuarantine(
		long id) {
		return _tempPlantQuarantineLocalService.createTempPlantQuarantine(id);
	}

	/**
	* Deletes the temp plant quarantine with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp plant quarantine
	* @return the temp plant quarantine that was removed
	* @throws PortalException if a temp plant quarantine with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempPlantQuarantine deleteTempPlantQuarantine(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempPlantQuarantineLocalService.deleteTempPlantQuarantine(id);
	}

	/**
	* Deletes the temp plant quarantine from the database. Also notifies the appropriate model listeners.
	*
	* @param tempPlantQuarantine the temp plant quarantine
	* @return the temp plant quarantine that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempPlantQuarantine deleteTempPlantQuarantine(
		vn.dtt.duongbien.dao.vrcb.model.TempPlantQuarantine tempPlantQuarantine)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempPlantQuarantineLocalService.deleteTempPlantQuarantine(tempPlantQuarantine);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tempPlantQuarantineLocalService.dynamicQuery();
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
		return _tempPlantQuarantineLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempPlantQuarantineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tempPlantQuarantineLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempPlantQuarantineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tempPlantQuarantineLocalService.dynamicQuery(dynamicQuery,
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
		return _tempPlantQuarantineLocalService.dynamicQueryCount(dynamicQuery);
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
		return _tempPlantQuarantineLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempPlantQuarantine fetchTempPlantQuarantine(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _tempPlantQuarantineLocalService.fetchTempPlantQuarantine(id);
	}

	/**
	* Returns the temp plant quarantine with the primary key.
	*
	* @param id the primary key of the temp plant quarantine
	* @return the temp plant quarantine
	* @throws PortalException if a temp plant quarantine with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempPlantQuarantine getTempPlantQuarantine(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempPlantQuarantineLocalService.getTempPlantQuarantine(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempPlantQuarantineLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the temp plant quarantines.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempPlantQuarantineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of temp plant quarantines
	* @param end the upper bound of the range of temp plant quarantines (not inclusive)
	* @return the range of temp plant quarantines
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempPlantQuarantine> getTempPlantQuarantines(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempPlantQuarantineLocalService.getTempPlantQuarantines(start,
			end);
	}

	/**
	* Returns the number of temp plant quarantines.
	*
	* @return the number of temp plant quarantines
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTempPlantQuarantinesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempPlantQuarantineLocalService.getTempPlantQuarantinesCount();
	}

	/**
	* Updates the temp plant quarantine in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempPlantQuarantine the temp plant quarantine
	* @return the temp plant quarantine that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempPlantQuarantine updateTempPlantQuarantine(
		vn.dtt.duongbien.dao.vrcb.model.TempPlantQuarantine tempPlantQuarantine)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempPlantQuarantineLocalService.updateTempPlantQuarantine(tempPlantQuarantine);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _tempPlantQuarantineLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tempPlantQuarantineLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tempPlantQuarantineLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TempPlantQuarantineLocalService getWrappedTempPlantQuarantineLocalService() {
		return _tempPlantQuarantineLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTempPlantQuarantineLocalService(
		TempPlantQuarantineLocalService tempPlantQuarantineLocalService) {
		_tempPlantQuarantineLocalService = tempPlantQuarantineLocalService;
	}

	@Override
	public TempPlantQuarantineLocalService getWrappedService() {
		return _tempPlantQuarantineLocalService;
	}

	@Override
	public void setWrappedService(
		TempPlantQuarantineLocalService tempPlantQuarantineLocalService) {
		_tempPlantQuarantineLocalService = tempPlantQuarantineLocalService;
	}

	private TempPlantQuarantineLocalService _tempPlantQuarantineLocalService;
}