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
 * Provides a wrapper for {@link TempAnimalQuarantineLocalService}.
 *
 * @author longdm
 * @see TempAnimalQuarantineLocalService
 * @generated
 */
public class TempAnimalQuarantineLocalServiceWrapper
	implements TempAnimalQuarantineLocalService,
		ServiceWrapper<TempAnimalQuarantineLocalService> {
	public TempAnimalQuarantineLocalServiceWrapper(
		TempAnimalQuarantineLocalService tempAnimalQuarantineLocalService) {
		_tempAnimalQuarantineLocalService = tempAnimalQuarantineLocalService;
	}

	/**
	* Adds the temp animal quarantine to the database. Also notifies the appropriate model listeners.
	*
	* @param tempAnimalQuarantine the temp animal quarantine
	* @return the temp animal quarantine that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempAnimalQuarantine addTempAnimalQuarantine(
		vn.dtt.duongbien.dao.vrcb.model.TempAnimalQuarantine tempAnimalQuarantine)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempAnimalQuarantineLocalService.addTempAnimalQuarantine(tempAnimalQuarantine);
	}

	/**
	* Creates a new temp animal quarantine with the primary key. Does not add the temp animal quarantine to the database.
	*
	* @param id the primary key for the new temp animal quarantine
	* @return the new temp animal quarantine
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempAnimalQuarantine createTempAnimalQuarantine(
		long id) {
		return _tempAnimalQuarantineLocalService.createTempAnimalQuarantine(id);
	}

	/**
	* Deletes the temp animal quarantine with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp animal quarantine
	* @return the temp animal quarantine that was removed
	* @throws PortalException if a temp animal quarantine with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempAnimalQuarantine deleteTempAnimalQuarantine(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempAnimalQuarantineLocalService.deleteTempAnimalQuarantine(id);
	}

	/**
	* Deletes the temp animal quarantine from the database. Also notifies the appropriate model listeners.
	*
	* @param tempAnimalQuarantine the temp animal quarantine
	* @return the temp animal quarantine that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempAnimalQuarantine deleteTempAnimalQuarantine(
		vn.dtt.duongbien.dao.vrcb.model.TempAnimalQuarantine tempAnimalQuarantine)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempAnimalQuarantineLocalService.deleteTempAnimalQuarantine(tempAnimalQuarantine);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tempAnimalQuarantineLocalService.dynamicQuery();
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
		return _tempAnimalQuarantineLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempAnimalQuarantineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tempAnimalQuarantineLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempAnimalQuarantineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tempAnimalQuarantineLocalService.dynamicQuery(dynamicQuery,
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
		return _tempAnimalQuarantineLocalService.dynamicQueryCount(dynamicQuery);
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
		return _tempAnimalQuarantineLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempAnimalQuarantine fetchTempAnimalQuarantine(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _tempAnimalQuarantineLocalService.fetchTempAnimalQuarantine(id);
	}

	/**
	* Returns the temp animal quarantine with the primary key.
	*
	* @param id the primary key of the temp animal quarantine
	* @return the temp animal quarantine
	* @throws PortalException if a temp animal quarantine with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempAnimalQuarantine getTempAnimalQuarantine(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempAnimalQuarantineLocalService.getTempAnimalQuarantine(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempAnimalQuarantineLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the temp animal quarantines.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempAnimalQuarantineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of temp animal quarantines
	* @param end the upper bound of the range of temp animal quarantines (not inclusive)
	* @return the range of temp animal quarantines
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempAnimalQuarantine> getTempAnimalQuarantines(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempAnimalQuarantineLocalService.getTempAnimalQuarantines(start,
			end);
	}

	/**
	* Returns the number of temp animal quarantines.
	*
	* @return the number of temp animal quarantines
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTempAnimalQuarantinesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempAnimalQuarantineLocalService.getTempAnimalQuarantinesCount();
	}

	/**
	* Updates the temp animal quarantine in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempAnimalQuarantine the temp animal quarantine
	* @return the temp animal quarantine that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempAnimalQuarantine updateTempAnimalQuarantine(
		vn.dtt.duongbien.dao.vrcb.model.TempAnimalQuarantine tempAnimalQuarantine)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempAnimalQuarantineLocalService.updateTempAnimalQuarantine(tempAnimalQuarantine);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _tempAnimalQuarantineLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tempAnimalQuarantineLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tempAnimalQuarantineLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TempAnimalQuarantineLocalService getWrappedTempAnimalQuarantineLocalService() {
		return _tempAnimalQuarantineLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTempAnimalQuarantineLocalService(
		TempAnimalQuarantineLocalService tempAnimalQuarantineLocalService) {
		_tempAnimalQuarantineLocalService = tempAnimalQuarantineLocalService;
	}

	@Override
	public TempAnimalQuarantineLocalService getWrappedService() {
		return _tempAnimalQuarantineLocalService;
	}

	@Override
	public void setWrappedService(
		TempAnimalQuarantineLocalService tempAnimalQuarantineLocalService) {
		_tempAnimalQuarantineLocalService = tempAnimalQuarantineLocalService;
	}

	private TempAnimalQuarantineLocalService _tempAnimalQuarantineLocalService;
}