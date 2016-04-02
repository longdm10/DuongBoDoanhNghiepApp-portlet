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
 * Provides a wrapper for {@link DmHistoryPortHarbourLocalService}.
 *
 * @author longdm
 * @see DmHistoryPortHarbourLocalService
 * @generated
 */
public class DmHistoryPortHarbourLocalServiceWrapper
	implements DmHistoryPortHarbourLocalService,
		ServiceWrapper<DmHistoryPortHarbourLocalService> {
	public DmHistoryPortHarbourLocalServiceWrapper(
		DmHistoryPortHarbourLocalService dmHistoryPortHarbourLocalService) {
		_dmHistoryPortHarbourLocalService = dmHistoryPortHarbourLocalService;
	}

	/**
	* Adds the dm history port harbour to the database. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryPortHarbour the dm history port harbour
	* @return the dm history port harbour that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour addDmHistoryPortHarbour(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour dmHistoryPortHarbour)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryPortHarbourLocalService.addDmHistoryPortHarbour(dmHistoryPortHarbour);
	}

	/**
	* Creates a new dm history port harbour with the primary key. Does not add the dm history port harbour to the database.
	*
	* @param id the primary key for the new dm history port harbour
	* @return the new dm history port harbour
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour createDmHistoryPortHarbour(
		int id) {
		return _dmHistoryPortHarbourLocalService.createDmHistoryPortHarbour(id);
	}

	/**
	* Deletes the dm history port harbour with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history port harbour
	* @return the dm history port harbour that was removed
	* @throws PortalException if a dm history port harbour with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour deleteDmHistoryPortHarbour(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryPortHarbourLocalService.deleteDmHistoryPortHarbour(id);
	}

	/**
	* Deletes the dm history port harbour from the database. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryPortHarbour the dm history port harbour
	* @return the dm history port harbour that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour deleteDmHistoryPortHarbour(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour dmHistoryPortHarbour)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryPortHarbourLocalService.deleteDmHistoryPortHarbour(dmHistoryPortHarbour);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dmHistoryPortHarbourLocalService.dynamicQuery();
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
		return _dmHistoryPortHarbourLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPortHarbourModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dmHistoryPortHarbourLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPortHarbourModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dmHistoryPortHarbourLocalService.dynamicQuery(dynamicQuery,
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
		return _dmHistoryPortHarbourLocalService.dynamicQueryCount(dynamicQuery);
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
		return _dmHistoryPortHarbourLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour fetchDmHistoryPortHarbour(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryPortHarbourLocalService.fetchDmHistoryPortHarbour(id);
	}

	/**
	* Returns the dm history port harbour with the primary key.
	*
	* @param id the primary key of the dm history port harbour
	* @return the dm history port harbour
	* @throws PortalException if a dm history port harbour with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour getDmHistoryPortHarbour(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryPortHarbourLocalService.getDmHistoryPortHarbour(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryPortHarbourLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm history port harbours.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryPortHarbourModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm history port harbours
	* @param end the upper bound of the range of dm history port harbours (not inclusive)
	* @return the range of dm history port harbours
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour> getDmHistoryPortHarbours(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryPortHarbourLocalService.getDmHistoryPortHarbours(start,
			end);
	}

	/**
	* Returns the number of dm history port harbours.
	*
	* @return the number of dm history port harbours
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDmHistoryPortHarboursCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryPortHarbourLocalService.getDmHistoryPortHarboursCount();
	}

	/**
	* Updates the dm history port harbour in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryPortHarbour the dm history port harbour
	* @return the dm history port harbour that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour updateDmHistoryPortHarbour(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryPortHarbour dmHistoryPortHarbour)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryPortHarbourLocalService.updateDmHistoryPortHarbour(dmHistoryPortHarbour);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dmHistoryPortHarbourLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dmHistoryPortHarbourLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dmHistoryPortHarbourLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DmHistoryPortHarbourLocalService getWrappedDmHistoryPortHarbourLocalService() {
		return _dmHistoryPortHarbourLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDmHistoryPortHarbourLocalService(
		DmHistoryPortHarbourLocalService dmHistoryPortHarbourLocalService) {
		_dmHistoryPortHarbourLocalService = dmHistoryPortHarbourLocalService;
	}

	@Override
	public DmHistoryPortHarbourLocalService getWrappedService() {
		return _dmHistoryPortHarbourLocalService;
	}

	@Override
	public void setWrappedService(
		DmHistoryPortHarbourLocalService dmHistoryPortHarbourLocalService) {
		_dmHistoryPortHarbourLocalService = dmHistoryPortHarbourLocalService;
	}

	private DmHistoryPortHarbourLocalService _dmHistoryPortHarbourLocalService;
}