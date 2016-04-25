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
 * Provides a wrapper for {@link TempCrewListLocalService}.
 *
 * @author longdm
 * @see TempCrewListLocalService
 * @generated
 */
public class TempCrewListLocalServiceWrapper implements TempCrewListLocalService,
	ServiceWrapper<TempCrewListLocalService> {
	public TempCrewListLocalServiceWrapper(
		TempCrewListLocalService tempCrewListLocalService) {
		_tempCrewListLocalService = tempCrewListLocalService;
	}

	/**
	* Adds the temp crew list to the database. Also notifies the appropriate model listeners.
	*
	* @param tempCrewList the temp crew list
	* @return the temp crew list that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempCrewList addTempCrewList(
		vn.dtt.duongbien.dao.vrcb.model.TempCrewList tempCrewList)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempCrewListLocalService.addTempCrewList(tempCrewList);
	}

	/**
	* Creates a new temp crew list with the primary key. Does not add the temp crew list to the database.
	*
	* @param id the primary key for the new temp crew list
	* @return the new temp crew list
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempCrewList createTempCrewList(
		long id) {
		return _tempCrewListLocalService.createTempCrewList(id);
	}

	/**
	* Deletes the temp crew list with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp crew list
	* @return the temp crew list that was removed
	* @throws PortalException if a temp crew list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempCrewList deleteTempCrewList(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempCrewListLocalService.deleteTempCrewList(id);
	}

	/**
	* Deletes the temp crew list from the database. Also notifies the appropriate model listeners.
	*
	* @param tempCrewList the temp crew list
	* @return the temp crew list that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempCrewList deleteTempCrewList(
		vn.dtt.duongbien.dao.vrcb.model.TempCrewList tempCrewList)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempCrewListLocalService.deleteTempCrewList(tempCrewList);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tempCrewListLocalService.dynamicQuery();
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
		return _tempCrewListLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempCrewListModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tempCrewListLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempCrewListModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tempCrewListLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
		return _tempCrewListLocalService.dynamicQueryCount(dynamicQuery);
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
		return _tempCrewListLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempCrewList fetchTempCrewList(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _tempCrewListLocalService.fetchTempCrewList(id);
	}

	/**
	* Returns the temp crew list with the primary key.
	*
	* @param id the primary key of the temp crew list
	* @return the temp crew list
	* @throws PortalException if a temp crew list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempCrewList getTempCrewList(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempCrewListLocalService.getTempCrewList(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempCrewListLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the temp crew lists.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempCrewListModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of temp crew lists
	* @param end the upper bound of the range of temp crew lists (not inclusive)
	* @return the range of temp crew lists
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempCrewList> getTempCrewLists(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempCrewListLocalService.getTempCrewLists(start, end);
	}

	/**
	* Returns the number of temp crew lists.
	*
	* @return the number of temp crew lists
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTempCrewListsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempCrewListLocalService.getTempCrewListsCount();
	}

	/**
	* Updates the temp crew list in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempCrewList the temp crew list
	* @return the temp crew list that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempCrewList updateTempCrewList(
		vn.dtt.duongbien.dao.vrcb.model.TempCrewList tempCrewList)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempCrewListLocalService.updateTempCrewList(tempCrewList);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _tempCrewListLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tempCrewListLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tempCrewListLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempCrewList addTemCrewList(
		long documentName, int documentYear, java.lang.String userCreated,
		int isArrival, java.lang.String nameOfShip, java.lang.String imoNumber,
		java.lang.String voyageNumber, java.lang.String portOfArrivalCode,
		java.util.Date dateOfArrival, java.lang.String lastPortOfCallCode,
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempCrewListLocalService.addTemCrewList(documentName,
			documentYear, userCreated, isArrival, nameOfShip, imoNumber,
			voyageNumber, portOfArrivalCode, dateOfArrival, lastPortOfCallCode,
			requestCode);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TempCrewListLocalService getWrappedTempCrewListLocalService() {
		return _tempCrewListLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTempCrewListLocalService(
		TempCrewListLocalService tempCrewListLocalService) {
		_tempCrewListLocalService = tempCrewListLocalService;
	}

	@Override
	public TempCrewListLocalService getWrappedService() {
		return _tempCrewListLocalService;
	}

	@Override
	public void setWrappedService(
		TempCrewListLocalService tempCrewListLocalService) {
		_tempCrewListLocalService = tempCrewListLocalService;
	}

	private TempCrewListLocalService _tempCrewListLocalService;
}