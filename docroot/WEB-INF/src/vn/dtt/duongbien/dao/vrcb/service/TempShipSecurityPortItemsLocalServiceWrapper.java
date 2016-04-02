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
 * Provides a wrapper for {@link TempShipSecurityPortItemsLocalService}.
 *
 * @author longdm
 * @see TempShipSecurityPortItemsLocalService
 * @generated
 */
public class TempShipSecurityPortItemsLocalServiceWrapper
	implements TempShipSecurityPortItemsLocalService,
		ServiceWrapper<TempShipSecurityPortItemsLocalService> {
	public TempShipSecurityPortItemsLocalServiceWrapper(
		TempShipSecurityPortItemsLocalService tempShipSecurityPortItemsLocalService) {
		_tempShipSecurityPortItemsLocalService = tempShipSecurityPortItemsLocalService;
	}

	/**
	* Adds the temp ship security port items to the database. Also notifies the appropriate model listeners.
	*
	* @param tempShipSecurityPortItems the temp ship security port items
	* @return the temp ship security port items that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityPortItems addTempShipSecurityPortItems(
		vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityPortItems tempShipSecurityPortItems)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempShipSecurityPortItemsLocalService.addTempShipSecurityPortItems(tempShipSecurityPortItems);
	}

	/**
	* Creates a new temp ship security port items with the primary key. Does not add the temp ship security port items to the database.
	*
	* @param id the primary key for the new temp ship security port items
	* @return the new temp ship security port items
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityPortItems createTempShipSecurityPortItems(
		long id) {
		return _tempShipSecurityPortItemsLocalService.createTempShipSecurityPortItems(id);
	}

	/**
	* Deletes the temp ship security port items with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp ship security port items
	* @return the temp ship security port items that was removed
	* @throws PortalException if a temp ship security port items with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityPortItems deleteTempShipSecurityPortItems(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempShipSecurityPortItemsLocalService.deleteTempShipSecurityPortItems(id);
	}

	/**
	* Deletes the temp ship security port items from the database. Also notifies the appropriate model listeners.
	*
	* @param tempShipSecurityPortItems the temp ship security port items
	* @return the temp ship security port items that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityPortItems deleteTempShipSecurityPortItems(
		vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityPortItems tempShipSecurityPortItems)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempShipSecurityPortItemsLocalService.deleteTempShipSecurityPortItems(tempShipSecurityPortItems);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tempShipSecurityPortItemsLocalService.dynamicQuery();
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
		return _tempShipSecurityPortItemsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempShipSecurityPortItemsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tempShipSecurityPortItemsLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempShipSecurityPortItemsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tempShipSecurityPortItemsLocalService.dynamicQuery(dynamicQuery,
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
		return _tempShipSecurityPortItemsLocalService.dynamicQueryCount(dynamicQuery);
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
		return _tempShipSecurityPortItemsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityPortItems fetchTempShipSecurityPortItems(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _tempShipSecurityPortItemsLocalService.fetchTempShipSecurityPortItems(id);
	}

	/**
	* Returns the temp ship security port items with the primary key.
	*
	* @param id the primary key of the temp ship security port items
	* @return the temp ship security port items
	* @throws PortalException if a temp ship security port items with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityPortItems getTempShipSecurityPortItems(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempShipSecurityPortItemsLocalService.getTempShipSecurityPortItems(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempShipSecurityPortItemsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the temp ship security port itemses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempShipSecurityPortItemsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of temp ship security port itemses
	* @param end the upper bound of the range of temp ship security port itemses (not inclusive)
	* @return the range of temp ship security port itemses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityPortItems> getTempShipSecurityPortItemses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempShipSecurityPortItemsLocalService.getTempShipSecurityPortItemses(start,
			end);
	}

	/**
	* Returns the number of temp ship security port itemses.
	*
	* @return the number of temp ship security port itemses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTempShipSecurityPortItemsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempShipSecurityPortItemsLocalService.getTempShipSecurityPortItemsesCount();
	}

	/**
	* Updates the temp ship security port items in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempShipSecurityPortItems the temp ship security port items
	* @return the temp ship security port items that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityPortItems updateTempShipSecurityPortItems(
		vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityPortItems tempShipSecurityPortItems)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempShipSecurityPortItemsLocalService.updateTempShipSecurityPortItems(tempShipSecurityPortItems);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _tempShipSecurityPortItemsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tempShipSecurityPortItemsLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tempShipSecurityPortItemsLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TempShipSecurityPortItemsLocalService getWrappedTempShipSecurityPortItemsLocalService() {
		return _tempShipSecurityPortItemsLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTempShipSecurityPortItemsLocalService(
		TempShipSecurityPortItemsLocalService tempShipSecurityPortItemsLocalService) {
		_tempShipSecurityPortItemsLocalService = tempShipSecurityPortItemsLocalService;
	}

	@Override
	public TempShipSecurityPortItemsLocalService getWrappedService() {
		return _tempShipSecurityPortItemsLocalService;
	}

	@Override
	public void setWrappedService(
		TempShipSecurityPortItemsLocalService tempShipSecurityPortItemsLocalService) {
		_tempShipSecurityPortItemsLocalService = tempShipSecurityPortItemsLocalService;
	}

	private TempShipSecurityPortItemsLocalService _tempShipSecurityPortItemsLocalService;
}