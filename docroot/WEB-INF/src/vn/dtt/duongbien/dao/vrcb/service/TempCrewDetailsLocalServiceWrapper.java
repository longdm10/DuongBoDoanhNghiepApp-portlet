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
 * Provides a wrapper for {@link TempCrewDetailsLocalService}.
 *
 * @author longdm
 * @see TempCrewDetailsLocalService
 * @generated
 */
public class TempCrewDetailsLocalServiceWrapper
	implements TempCrewDetailsLocalService,
		ServiceWrapper<TempCrewDetailsLocalService> {
	public TempCrewDetailsLocalServiceWrapper(
		TempCrewDetailsLocalService tempCrewDetailsLocalService) {
		_tempCrewDetailsLocalService = tempCrewDetailsLocalService;
	}

	/**
	* Adds the temp crew details to the database. Also notifies the appropriate model listeners.
	*
	* @param tempCrewDetails the temp crew details
	* @return the temp crew details that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempCrewDetails addTempCrewDetails(
		vn.dtt.duongbien.dao.vrcb.model.TempCrewDetails tempCrewDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempCrewDetailsLocalService.addTempCrewDetails(tempCrewDetails);
	}

	/**
	* Creates a new temp crew details with the primary key. Does not add the temp crew details to the database.
	*
	* @param id the primary key for the new temp crew details
	* @return the new temp crew details
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempCrewDetails createTempCrewDetails(
		long id) {
		return _tempCrewDetailsLocalService.createTempCrewDetails(id);
	}

	/**
	* Deletes the temp crew details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp crew details
	* @return the temp crew details that was removed
	* @throws PortalException if a temp crew details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempCrewDetails deleteTempCrewDetails(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempCrewDetailsLocalService.deleteTempCrewDetails(id);
	}

	/**
	* Deletes the temp crew details from the database. Also notifies the appropriate model listeners.
	*
	* @param tempCrewDetails the temp crew details
	* @return the temp crew details that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempCrewDetails deleteTempCrewDetails(
		vn.dtt.duongbien.dao.vrcb.model.TempCrewDetails tempCrewDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempCrewDetailsLocalService.deleteTempCrewDetails(tempCrewDetails);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tempCrewDetailsLocalService.dynamicQuery();
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
		return _tempCrewDetailsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempCrewDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tempCrewDetailsLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempCrewDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tempCrewDetailsLocalService.dynamicQuery(dynamicQuery, start,
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
		return _tempCrewDetailsLocalService.dynamicQueryCount(dynamicQuery);
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
		return _tempCrewDetailsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempCrewDetails fetchTempCrewDetails(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _tempCrewDetailsLocalService.fetchTempCrewDetails(id);
	}

	/**
	* Returns the temp crew details with the primary key.
	*
	* @param id the primary key of the temp crew details
	* @return the temp crew details
	* @throws PortalException if a temp crew details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempCrewDetails getTempCrewDetails(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempCrewDetailsLocalService.getTempCrewDetails(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempCrewDetailsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the temp crew detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempCrewDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of temp crew detailses
	* @param end the upper bound of the range of temp crew detailses (not inclusive)
	* @return the range of temp crew detailses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempCrewDetails> getTempCrewDetailses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempCrewDetailsLocalService.getTempCrewDetailses(start, end);
	}

	/**
	* Returns the number of temp crew detailses.
	*
	* @return the number of temp crew detailses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTempCrewDetailsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempCrewDetailsLocalService.getTempCrewDetailsesCount();
	}

	/**
	* Updates the temp crew details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempCrewDetails the temp crew details
	* @return the temp crew details that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempCrewDetails updateTempCrewDetails(
		vn.dtt.duongbien.dao.vrcb.model.TempCrewDetails tempCrewDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempCrewDetailsLocalService.updateTempCrewDetails(tempCrewDetails);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _tempCrewDetailsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tempCrewDetailsLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tempCrewDetailsLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempCrewDetails addTempCrewDetails(
		java.lang.String crewcode, java.lang.String familyName,
		java.lang.String givenName, java.lang.String rankCode,
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempCrewDetailsLocalService.addTempCrewDetails(crewcode,
			familyName, givenName, rankCode, requestCode);
	}

	@Override
	public java.util.List findByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempCrewDetailsLocalService.findByRequestCode(requestCode);
	}

	@Override
	public int countByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempCrewDetailsLocalService.countByRequestCode(requestCode);
	}

	@Override
	public java.util.List findByRequestCode(java.lang.String requestCode,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempCrewDetailsLocalService.findByRequestCode(requestCode,
			start, end);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TempCrewDetailsLocalService getWrappedTempCrewDetailsLocalService() {
		return _tempCrewDetailsLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTempCrewDetailsLocalService(
		TempCrewDetailsLocalService tempCrewDetailsLocalService) {
		_tempCrewDetailsLocalService = tempCrewDetailsLocalService;
	}

	@Override
	public TempCrewDetailsLocalService getWrappedService() {
		return _tempCrewDetailsLocalService;
	}

	@Override
	public void setWrappedService(
		TempCrewDetailsLocalService tempCrewDetailsLocalService) {
		_tempCrewDetailsLocalService = tempCrewDetailsLocalService;
	}

	private TempCrewDetailsLocalService _tempCrewDetailsLocalService;
}