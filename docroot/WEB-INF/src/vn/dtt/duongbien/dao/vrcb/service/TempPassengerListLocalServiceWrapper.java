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
 * Provides a wrapper for {@link TempPassengerListLocalService}.
 *
 * @author longdm
 * @see TempPassengerListLocalService
 * @generated
 */
public class TempPassengerListLocalServiceWrapper
	implements TempPassengerListLocalService,
		ServiceWrapper<TempPassengerListLocalService> {
	public TempPassengerListLocalServiceWrapper(
		TempPassengerListLocalService tempPassengerListLocalService) {
		_tempPassengerListLocalService = tempPassengerListLocalService;
	}

	/**
	* Adds the temp passenger list to the database. Also notifies the appropriate model listeners.
	*
	* @param tempPassengerList the temp passenger list
	* @return the temp passenger list that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempPassengerList addTempPassengerList(
		vn.dtt.duongbien.dao.vrcb.model.TempPassengerList tempPassengerList)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempPassengerListLocalService.addTempPassengerList(tempPassengerList);
	}

	/**
	* Creates a new temp passenger list with the primary key. Does not add the temp passenger list to the database.
	*
	* @param id the primary key for the new temp passenger list
	* @return the new temp passenger list
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempPassengerList createTempPassengerList(
		long id) {
		return _tempPassengerListLocalService.createTempPassengerList(id);
	}

	/**
	* Deletes the temp passenger list with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp passenger list
	* @return the temp passenger list that was removed
	* @throws PortalException if a temp passenger list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempPassengerList deleteTempPassengerList(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempPassengerListLocalService.deleteTempPassengerList(id);
	}

	/**
	* Deletes the temp passenger list from the database. Also notifies the appropriate model listeners.
	*
	* @param tempPassengerList the temp passenger list
	* @return the temp passenger list that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempPassengerList deleteTempPassengerList(
		vn.dtt.duongbien.dao.vrcb.model.TempPassengerList tempPassengerList)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempPassengerListLocalService.deleteTempPassengerList(tempPassengerList);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tempPassengerListLocalService.dynamicQuery();
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
		return _tempPassengerListLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempPassengerListModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tempPassengerListLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempPassengerListModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tempPassengerListLocalService.dynamicQuery(dynamicQuery, start,
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
		return _tempPassengerListLocalService.dynamicQueryCount(dynamicQuery);
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
		return _tempPassengerListLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempPassengerList fetchTempPassengerList(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _tempPassengerListLocalService.fetchTempPassengerList(id);
	}

	/**
	* Returns the temp passenger list with the primary key.
	*
	* @param id the primary key of the temp passenger list
	* @return the temp passenger list
	* @throws PortalException if a temp passenger list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempPassengerList getTempPassengerList(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempPassengerListLocalService.getTempPassengerList(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempPassengerListLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the temp passenger lists.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempPassengerListModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of temp passenger lists
	* @param end the upper bound of the range of temp passenger lists (not inclusive)
	* @return the range of temp passenger lists
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempPassengerList> getTempPassengerLists(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempPassengerListLocalService.getTempPassengerLists(start, end);
	}

	/**
	* Returns the number of temp passenger lists.
	*
	* @return the number of temp passenger lists
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTempPassengerListsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempPassengerListLocalService.getTempPassengerListsCount();
	}

	/**
	* Updates the temp passenger list in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempPassengerList the temp passenger list
	* @return the temp passenger list that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempPassengerList updateTempPassengerList(
		vn.dtt.duongbien.dao.vrcb.model.TempPassengerList tempPassengerList)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempPassengerListLocalService.updateTempPassengerList(tempPassengerList);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _tempPassengerListLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tempPassengerListLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tempPassengerListLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempPassengerList addTempPassengerList(
		java.lang.String requestCode, long documentName, int documentYear,
		java.lang.String userCreated, int isArrival,
		java.lang.String nameOfShip, java.lang.String portOfArrivalCode,
		java.util.Date dateOfArrival, java.lang.String imoNumber,
		java.lang.String voyageNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempPassengerListLocalService.addTempPassengerList(requestCode,
			documentName, documentYear, userCreated, isArrival, nameOfShip,
			portOfArrivalCode, dateOfArrival, imoNumber, voyageNumber);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TempPassengerListLocalService getWrappedTempPassengerListLocalService() {
		return _tempPassengerListLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTempPassengerListLocalService(
		TempPassengerListLocalService tempPassengerListLocalService) {
		_tempPassengerListLocalService = tempPassengerListLocalService;
	}

	@Override
	public TempPassengerListLocalService getWrappedService() {
		return _tempPassengerListLocalService;
	}

	@Override
	public void setWrappedService(
		TempPassengerListLocalService tempPassengerListLocalService) {
		_tempPassengerListLocalService = tempPassengerListLocalService;
	}

	private TempPassengerListLocalService _tempPassengerListLocalService;
}