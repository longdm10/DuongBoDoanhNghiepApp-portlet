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
 * Provides a wrapper for {@link RmdcShipLocalService}.
 *
 * @author longdm
 * @see RmdcShipLocalService
 * @generated
 */
public class RmdcShipLocalServiceWrapper implements RmdcShipLocalService,
	ServiceWrapper<RmdcShipLocalService> {
	public RmdcShipLocalServiceWrapper(
		RmdcShipLocalService rmdcShipLocalService) {
		_rmdcShipLocalService = rmdcShipLocalService;
	}

	/**
	* Adds the rmdc ship to the database. Also notifies the appropriate model listeners.
	*
	* @param rmdcShip the rmdc ship
	* @return the rmdc ship that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.RmdcShip addRmdcShip(
		vn.dtt.duongbien.dao.vrcb.model.RmdcShip rmdcShip)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rmdcShipLocalService.addRmdcShip(rmdcShip);
	}

	/**
	* Creates a new rmdc ship with the primary key. Does not add the rmdc ship to the database.
	*
	* @param id the primary key for the new rmdc ship
	* @return the new rmdc ship
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.RmdcShip createRmdcShip(long id) {
		return _rmdcShipLocalService.createRmdcShip(id);
	}

	/**
	* Deletes the rmdc ship with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the rmdc ship
	* @return the rmdc ship that was removed
	* @throws PortalException if a rmdc ship with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.RmdcShip deleteRmdcShip(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _rmdcShipLocalService.deleteRmdcShip(id);
	}

	/**
	* Deletes the rmdc ship from the database. Also notifies the appropriate model listeners.
	*
	* @param rmdcShip the rmdc ship
	* @return the rmdc ship that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.RmdcShip deleteRmdcShip(
		vn.dtt.duongbien.dao.vrcb.model.RmdcShip rmdcShip)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rmdcShipLocalService.deleteRmdcShip(rmdcShip);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _rmdcShipLocalService.dynamicQuery();
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
		return _rmdcShipLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.RmdcShipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _rmdcShipLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.RmdcShipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _rmdcShipLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _rmdcShipLocalService.dynamicQueryCount(dynamicQuery);
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
		return _rmdcShipLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.RmdcShip fetchRmdcShip(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rmdcShipLocalService.fetchRmdcShip(id);
	}

	/**
	* Returns the rmdc ship with the primary key.
	*
	* @param id the primary key of the rmdc ship
	* @return the rmdc ship
	* @throws PortalException if a rmdc ship with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.RmdcShip getRmdcShip(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _rmdcShipLocalService.getRmdcShip(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _rmdcShipLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the rmdc ships.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.RmdcShipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rmdc ships
	* @param end the upper bound of the range of rmdc ships (not inclusive)
	* @return the range of rmdc ships
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.RmdcShip> getRmdcShips(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rmdcShipLocalService.getRmdcShips(start, end);
	}

	/**
	* Returns the number of rmdc ships.
	*
	* @return the number of rmdc ships
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getRmdcShipsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rmdcShipLocalService.getRmdcShipsCount();
	}

	/**
	* Updates the rmdc ship in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param rmdcShip the rmdc ship
	* @return the rmdc ship that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.RmdcShip updateRmdcShip(
		vn.dtt.duongbien.dao.vrcb.model.RmdcShip rmdcShip)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rmdcShipLocalService.updateRmdcShip(rmdcShip);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _rmdcShipLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_rmdcShipLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _rmdcShipLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public RmdcShipLocalService getWrappedRmdcShipLocalService() {
		return _rmdcShipLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedRmdcShipLocalService(
		RmdcShipLocalService rmdcShipLocalService) {
		_rmdcShipLocalService = rmdcShipLocalService;
	}

	@Override
	public RmdcShipLocalService getWrappedService() {
		return _rmdcShipLocalService;
	}

	@Override
	public void setWrappedService(RmdcShipLocalService rmdcShipLocalService) {
		_rmdcShipLocalService = rmdcShipLocalService;
	}

	private RmdcShipLocalService _rmdcShipLocalService;
}