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
 * Provides a wrapper for {@link TempUnitGeneralLocalService}.
 *
 * @author longdm
 * @see TempUnitGeneralLocalService
 * @generated
 */
public class TempUnitGeneralLocalServiceWrapper
	implements TempUnitGeneralLocalService,
		ServiceWrapper<TempUnitGeneralLocalService> {
	public TempUnitGeneralLocalServiceWrapper(
		TempUnitGeneralLocalService tempUnitGeneralLocalService) {
		_tempUnitGeneralLocalService = tempUnitGeneralLocalService;
	}

	/**
	* Adds the temp unit general to the database. Also notifies the appropriate model listeners.
	*
	* @param tempUnitGeneral the temp unit general
	* @return the temp unit general that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral addTempUnitGeneral(
		vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral tempUnitGeneral)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempUnitGeneralLocalService.addTempUnitGeneral(tempUnitGeneral);
	}

	/**
	* Creates a new temp unit general with the primary key. Does not add the temp unit general to the database.
	*
	* @param id the primary key for the new temp unit general
	* @return the new temp unit general
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral createTempUnitGeneral(
		long id) {
		return _tempUnitGeneralLocalService.createTempUnitGeneral(id);
	}

	/**
	* Deletes the temp unit general with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp unit general
	* @return the temp unit general that was removed
	* @throws PortalException if a temp unit general with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral deleteTempUnitGeneral(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempUnitGeneralLocalService.deleteTempUnitGeneral(id);
	}

	/**
	* Deletes the temp unit general from the database. Also notifies the appropriate model listeners.
	*
	* @param tempUnitGeneral the temp unit general
	* @return the temp unit general that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral deleteTempUnitGeneral(
		vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral tempUnitGeneral)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempUnitGeneralLocalService.deleteTempUnitGeneral(tempUnitGeneral);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tempUnitGeneralLocalService.dynamicQuery();
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
		return _tempUnitGeneralLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempUnitGeneralModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tempUnitGeneralLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempUnitGeneralModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tempUnitGeneralLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _tempUnitGeneralLocalService.dynamicQueryCount(dynamicQuery);
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
		return _tempUnitGeneralLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral fetchTempUnitGeneral(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _tempUnitGeneralLocalService.fetchTempUnitGeneral(id);
	}

	/**
	* Returns the temp unit general with the primary key.
	*
	* @param id the primary key of the temp unit general
	* @return the temp unit general
	* @throws PortalException if a temp unit general with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral getTempUnitGeneral(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempUnitGeneralLocalService.getTempUnitGeneral(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempUnitGeneralLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the temp unit generals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempUnitGeneralModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of temp unit generals
	* @param end the upper bound of the range of temp unit generals (not inclusive)
	* @return the range of temp unit generals
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral> getTempUnitGenerals(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempUnitGeneralLocalService.getTempUnitGenerals(start, end);
	}

	/**
	* Returns the number of temp unit generals.
	*
	* @return the number of temp unit generals
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTempUnitGeneralsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempUnitGeneralLocalService.getTempUnitGeneralsCount();
	}

	/**
	* Updates the temp unit general in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempUnitGeneral the temp unit general
	* @return the temp unit general that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral updateTempUnitGeneral(
		vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral tempUnitGeneral)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempUnitGeneralLocalService.updateTempUnitGeneral(tempUnitGeneral);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _tempUnitGeneralLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tempUnitGeneralLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tempUnitGeneralLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TempUnitGeneralLocalService getWrappedTempUnitGeneralLocalService() {
		return _tempUnitGeneralLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTempUnitGeneralLocalService(
		TempUnitGeneralLocalService tempUnitGeneralLocalService) {
		_tempUnitGeneralLocalService = tempUnitGeneralLocalService;
	}

	@Override
	public TempUnitGeneralLocalService getWrappedService() {
		return _tempUnitGeneralLocalService;
	}

	@Override
	public void setWrappedService(
		TempUnitGeneralLocalService tempUnitGeneralLocalService) {
		_tempUnitGeneralLocalService = tempUnitGeneralLocalService;
	}

	private TempUnitGeneralLocalService _tempUnitGeneralLocalService;
}