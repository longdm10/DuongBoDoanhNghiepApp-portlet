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

package vn.dtt.duongbo.dao.common.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DmMetaDataLocalService}.
 *
 * @author win_64
 * @see DmMetaDataLocalService
 * @generated
 */
public class DmMetaDataLocalServiceWrapper implements DmMetaDataLocalService,
	ServiceWrapper<DmMetaDataLocalService> {
	public DmMetaDataLocalServiceWrapper(
		DmMetaDataLocalService dmMetaDataLocalService) {
		_dmMetaDataLocalService = dmMetaDataLocalService;
	}

	/**
	* Adds the dm meta data to the database. Also notifies the appropriate model listeners.
	*
	* @param dmMetaData the dm meta data
	* @return the dm meta data that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.DmMetaData addDmMetaData(
		vn.dtt.duongbo.dao.common.model.DmMetaData dmMetaData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmMetaDataLocalService.addDmMetaData(dmMetaData);
	}

	/**
	* Creates a new dm meta data with the primary key. Does not add the dm meta data to the database.
	*
	* @param id the primary key for the new dm meta data
	* @return the new dm meta data
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.DmMetaData createDmMetaData(long id) {
		return _dmMetaDataLocalService.createDmMetaData(id);
	}

	/**
	* Deletes the dm meta data with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm meta data
	* @return the dm meta data that was removed
	* @throws PortalException if a dm meta data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.DmMetaData deleteDmMetaData(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmMetaDataLocalService.deleteDmMetaData(id);
	}

	/**
	* Deletes the dm meta data from the database. Also notifies the appropriate model listeners.
	*
	* @param dmMetaData the dm meta data
	* @return the dm meta data that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.DmMetaData deleteDmMetaData(
		vn.dtt.duongbo.dao.common.model.DmMetaData dmMetaData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmMetaDataLocalService.deleteDmMetaData(dmMetaData);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dmMetaDataLocalService.dynamicQuery();
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
		return _dmMetaDataLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.DmMetaDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dmMetaDataLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.DmMetaDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dmMetaDataLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _dmMetaDataLocalService.dynamicQueryCount(dynamicQuery);
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
		return _dmMetaDataLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.DmMetaData fetchDmMetaData(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmMetaDataLocalService.fetchDmMetaData(id);
	}

	/**
	* Returns the dm meta data with the primary key.
	*
	* @param id the primary key of the dm meta data
	* @return the dm meta data
	* @throws PortalException if a dm meta data with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.DmMetaData getDmMetaData(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmMetaDataLocalService.getDmMetaData(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmMetaDataLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm meta datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.DmMetaDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm meta datas
	* @param end the upper bound of the range of dm meta datas (not inclusive)
	* @return the range of dm meta datas
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbo.dao.common.model.DmMetaData> getDmMetaDatas(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmMetaDataLocalService.getDmMetaDatas(start, end);
	}

	/**
	* Returns the number of dm meta datas.
	*
	* @return the number of dm meta datas
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDmMetaDatasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmMetaDataLocalService.getDmMetaDatasCount();
	}

	/**
	* Updates the dm meta data in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmMetaData the dm meta data
	* @return the dm meta data that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.DmMetaData updateDmMetaData(
		vn.dtt.duongbo.dao.common.model.DmMetaData dmMetaData)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmMetaDataLocalService.updateDmMetaData(dmMetaData);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dmMetaDataLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dmMetaDataLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dmMetaDataLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DmMetaDataLocalService getWrappedDmMetaDataLocalService() {
		return _dmMetaDataLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDmMetaDataLocalService(
		DmMetaDataLocalService dmMetaDataLocalService) {
		_dmMetaDataLocalService = dmMetaDataLocalService;
	}

	@Override
	public DmMetaDataLocalService getWrappedService() {
		return _dmMetaDataLocalService;
	}

	@Override
	public void setWrappedService(DmMetaDataLocalService dmMetaDataLocalService) {
		_dmMetaDataLocalService = dmMetaDataLocalService;
	}

	private DmMetaDataLocalService _dmMetaDataLocalService;
}