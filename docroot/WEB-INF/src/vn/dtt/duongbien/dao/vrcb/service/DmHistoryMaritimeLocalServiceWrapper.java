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
 * Provides a wrapper for {@link DmHistoryMaritimeLocalService}.
 *
 * @author longdm
 * @see DmHistoryMaritimeLocalService
 * @generated
 */
public class DmHistoryMaritimeLocalServiceWrapper
	implements DmHistoryMaritimeLocalService,
		ServiceWrapper<DmHistoryMaritimeLocalService> {
	public DmHistoryMaritimeLocalServiceWrapper(
		DmHistoryMaritimeLocalService dmHistoryMaritimeLocalService) {
		_dmHistoryMaritimeLocalService = dmHistoryMaritimeLocalService;
	}

	/**
	* Adds the dm history maritime to the database. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryMaritime the dm history maritime
	* @return the dm history maritime that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryMaritime addDmHistoryMaritime(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryMaritime dmHistoryMaritime)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryMaritimeLocalService.addDmHistoryMaritime(dmHistoryMaritime);
	}

	/**
	* Creates a new dm history maritime with the primary key. Does not add the dm history maritime to the database.
	*
	* @param id the primary key for the new dm history maritime
	* @return the new dm history maritime
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryMaritime createDmHistoryMaritime(
		int id) {
		return _dmHistoryMaritimeLocalService.createDmHistoryMaritime(id);
	}

	/**
	* Deletes the dm history maritime with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history maritime
	* @return the dm history maritime that was removed
	* @throws PortalException if a dm history maritime with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryMaritime deleteDmHistoryMaritime(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryMaritimeLocalService.deleteDmHistoryMaritime(id);
	}

	/**
	* Deletes the dm history maritime from the database. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryMaritime the dm history maritime
	* @return the dm history maritime that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryMaritime deleteDmHistoryMaritime(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryMaritime dmHistoryMaritime)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryMaritimeLocalService.deleteDmHistoryMaritime(dmHistoryMaritime);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dmHistoryMaritimeLocalService.dynamicQuery();
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
		return _dmHistoryMaritimeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryMaritimeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dmHistoryMaritimeLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryMaritimeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dmHistoryMaritimeLocalService.dynamicQuery(dynamicQuery, start,
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
		return _dmHistoryMaritimeLocalService.dynamicQueryCount(dynamicQuery);
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
		return _dmHistoryMaritimeLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryMaritime fetchDmHistoryMaritime(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryMaritimeLocalService.fetchDmHistoryMaritime(id);
	}

	/**
	* Returns the dm history maritime with the primary key.
	*
	* @param id the primary key of the dm history maritime
	* @return the dm history maritime
	* @throws PortalException if a dm history maritime with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryMaritime getDmHistoryMaritime(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryMaritimeLocalService.getDmHistoryMaritime(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryMaritimeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm history maritimes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryMaritimeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm history maritimes
	* @param end the upper bound of the range of dm history maritimes (not inclusive)
	* @return the range of dm history maritimes
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryMaritime> getDmHistoryMaritimes(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryMaritimeLocalService.getDmHistoryMaritimes(start, end);
	}

	/**
	* Returns the number of dm history maritimes.
	*
	* @return the number of dm history maritimes
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDmHistoryMaritimesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryMaritimeLocalService.getDmHistoryMaritimesCount();
	}

	/**
	* Updates the dm history maritime in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryMaritime the dm history maritime
	* @return the dm history maritime that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryMaritime updateDmHistoryMaritime(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryMaritime dmHistoryMaritime)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryMaritimeLocalService.updateDmHistoryMaritime(dmHistoryMaritime);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dmHistoryMaritimeLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dmHistoryMaritimeLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dmHistoryMaritimeLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DmHistoryMaritimeLocalService getWrappedDmHistoryMaritimeLocalService() {
		return _dmHistoryMaritimeLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDmHistoryMaritimeLocalService(
		DmHistoryMaritimeLocalService dmHistoryMaritimeLocalService) {
		_dmHistoryMaritimeLocalService = dmHistoryMaritimeLocalService;
	}

	@Override
	public DmHistoryMaritimeLocalService getWrappedService() {
		return _dmHistoryMaritimeLocalService;
	}

	@Override
	public void setWrappedService(
		DmHistoryMaritimeLocalService dmHistoryMaritimeLocalService) {
		_dmHistoryMaritimeLocalService = dmHistoryMaritimeLocalService;
	}

	private DmHistoryMaritimeLocalService _dmHistoryMaritimeLocalService;
}