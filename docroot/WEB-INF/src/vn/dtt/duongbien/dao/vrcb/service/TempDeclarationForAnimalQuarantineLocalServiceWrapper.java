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
 * Provides a wrapper for {@link TempDeclarationForAnimalQuarantineLocalService}.
 *
 * @author longdm
 * @see TempDeclarationForAnimalQuarantineLocalService
 * @generated
 */
public class TempDeclarationForAnimalQuarantineLocalServiceWrapper
	implements TempDeclarationForAnimalQuarantineLocalService,
		ServiceWrapper<TempDeclarationForAnimalQuarantineLocalService> {
	public TempDeclarationForAnimalQuarantineLocalServiceWrapper(
		TempDeclarationForAnimalQuarantineLocalService tempDeclarationForAnimalQuarantineLocalService) {
		_tempDeclarationForAnimalQuarantineLocalService = tempDeclarationForAnimalQuarantineLocalService;
	}

	/**
	* Adds the temp declaration for animal quarantine to the database. Also notifies the appropriate model listeners.
	*
	* @param tempDeclarationForAnimalQuarantine the temp declaration for animal quarantine
	* @return the temp declaration for animal quarantine that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine addTempDeclarationForAnimalQuarantine(
		vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDeclarationForAnimalQuarantineLocalService.addTempDeclarationForAnimalQuarantine(tempDeclarationForAnimalQuarantine);
	}

	/**
	* Creates a new temp declaration for animal quarantine with the primary key. Does not add the temp declaration for animal quarantine to the database.
	*
	* @param id the primary key for the new temp declaration for animal quarantine
	* @return the new temp declaration for animal quarantine
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine createTempDeclarationForAnimalQuarantine(
		long id) {
		return _tempDeclarationForAnimalQuarantineLocalService.createTempDeclarationForAnimalQuarantine(id);
	}

	/**
	* Deletes the temp declaration for animal quarantine with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp declaration for animal quarantine
	* @return the temp declaration for animal quarantine that was removed
	* @throws PortalException if a temp declaration for animal quarantine with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine deleteTempDeclarationForAnimalQuarantine(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempDeclarationForAnimalQuarantineLocalService.deleteTempDeclarationForAnimalQuarantine(id);
	}

	/**
	* Deletes the temp declaration for animal quarantine from the database. Also notifies the appropriate model listeners.
	*
	* @param tempDeclarationForAnimalQuarantine the temp declaration for animal quarantine
	* @return the temp declaration for animal quarantine that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine deleteTempDeclarationForAnimalQuarantine(
		vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDeclarationForAnimalQuarantineLocalService.deleteTempDeclarationForAnimalQuarantine(tempDeclarationForAnimalQuarantine);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tempDeclarationForAnimalQuarantineLocalService.dynamicQuery();
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
		return _tempDeclarationForAnimalQuarantineLocalService.dynamicQuery(dynamicQuery);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDeclarationForAnimalQuarantineLocalService.dynamicQuery(dynamicQuery,
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDeclarationForAnimalQuarantineLocalService.dynamicQuery(dynamicQuery,
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
		return _tempDeclarationForAnimalQuarantineLocalService.dynamicQueryCount(dynamicQuery);
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
		return _tempDeclarationForAnimalQuarantineLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine fetchTempDeclarationForAnimalQuarantine(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDeclarationForAnimalQuarantineLocalService.fetchTempDeclarationForAnimalQuarantine(id);
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
	public vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine getTempDeclarationForAnimalQuarantine(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempDeclarationForAnimalQuarantineLocalService.getTempDeclarationForAnimalQuarantine(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempDeclarationForAnimalQuarantineLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine> getTempDeclarationForAnimalQuarantines(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDeclarationForAnimalQuarantineLocalService.getTempDeclarationForAnimalQuarantines(start,
			end);
	}

	/**
	* Returns the number of temp declaration for animal quarantines.
	*
	* @return the number of temp declaration for animal quarantines
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTempDeclarationForAnimalQuarantinesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDeclarationForAnimalQuarantineLocalService.getTempDeclarationForAnimalQuarantinesCount();
	}

	/**
	* Updates the temp declaration for animal quarantine in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempDeclarationForAnimalQuarantine the temp declaration for animal quarantine
	* @return the temp declaration for animal quarantine that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine updateTempDeclarationForAnimalQuarantine(
		vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempDeclarationForAnimalQuarantineLocalService.updateTempDeclarationForAnimalQuarantine(tempDeclarationForAnimalQuarantine);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _tempDeclarationForAnimalQuarantineLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tempDeclarationForAnimalQuarantineLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tempDeclarationForAnimalQuarantineLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TempDeclarationForAnimalQuarantineLocalService getWrappedTempDeclarationForAnimalQuarantineLocalService() {
		return _tempDeclarationForAnimalQuarantineLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTempDeclarationForAnimalQuarantineLocalService(
		TempDeclarationForAnimalQuarantineLocalService tempDeclarationForAnimalQuarantineLocalService) {
		_tempDeclarationForAnimalQuarantineLocalService = tempDeclarationForAnimalQuarantineLocalService;
	}

	@Override
	public TempDeclarationForAnimalQuarantineLocalService getWrappedService() {
		return _tempDeclarationForAnimalQuarantineLocalService;
	}

	@Override
	public void setWrappedService(
		TempDeclarationForAnimalQuarantineLocalService tempDeclarationForAnimalQuarantineLocalService) {
		_tempDeclarationForAnimalQuarantineLocalService = tempDeclarationForAnimalQuarantineLocalService;
	}

	private TempDeclarationForAnimalQuarantineLocalService _tempDeclarationForAnimalQuarantineLocalService;
}