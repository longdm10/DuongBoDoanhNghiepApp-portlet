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
 * Provides a wrapper for {@link HistoryRmdcShipLocalService}.
 *
 * @author longdm
 * @see HistoryRmdcShipLocalService
 * @generated
 */
public class HistoryRmdcShipLocalServiceWrapper
	implements HistoryRmdcShipLocalService,
		ServiceWrapper<HistoryRmdcShipLocalService> {
	public HistoryRmdcShipLocalServiceWrapper(
		HistoryRmdcShipLocalService historyRmdcShipLocalService) {
		_historyRmdcShipLocalService = historyRmdcShipLocalService;
	}

	/**
	* Adds the history rmdc ship to the database. Also notifies the appropriate model listeners.
	*
	* @param historyRmdcShip the history rmdc ship
	* @return the history rmdc ship that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip addHistoryRmdcShip(
		vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip historyRmdcShip)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _historyRmdcShipLocalService.addHistoryRmdcShip(historyRmdcShip);
	}

	/**
	* Creates a new history rmdc ship with the primary key. Does not add the history rmdc ship to the database.
	*
	* @param id the primary key for the new history rmdc ship
	* @return the new history rmdc ship
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip createHistoryRmdcShip(
		long id) {
		return _historyRmdcShipLocalService.createHistoryRmdcShip(id);
	}

	/**
	* Deletes the history rmdc ship with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the history rmdc ship
	* @return the history rmdc ship that was removed
	* @throws PortalException if a history rmdc ship with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip deleteHistoryRmdcShip(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _historyRmdcShipLocalService.deleteHistoryRmdcShip(id);
	}

	/**
	* Deletes the history rmdc ship from the database. Also notifies the appropriate model listeners.
	*
	* @param historyRmdcShip the history rmdc ship
	* @return the history rmdc ship that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip deleteHistoryRmdcShip(
		vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip historyRmdcShip)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _historyRmdcShipLocalService.deleteHistoryRmdcShip(historyRmdcShip);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _historyRmdcShipLocalService.dynamicQuery();
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
		return _historyRmdcShipLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.HistoryRmdcShipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _historyRmdcShipLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.HistoryRmdcShipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _historyRmdcShipLocalService.dynamicQuery(dynamicQuery, start,
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
		return _historyRmdcShipLocalService.dynamicQueryCount(dynamicQuery);
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
		return _historyRmdcShipLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip fetchHistoryRmdcShip(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _historyRmdcShipLocalService.fetchHistoryRmdcShip(id);
	}

	/**
	* Returns the history rmdc ship with the primary key.
	*
	* @param id the primary key of the history rmdc ship
	* @return the history rmdc ship
	* @throws PortalException if a history rmdc ship with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip getHistoryRmdcShip(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _historyRmdcShipLocalService.getHistoryRmdcShip(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _historyRmdcShipLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the history rmdc ships.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.HistoryRmdcShipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of history rmdc ships
	* @param end the upper bound of the range of history rmdc ships (not inclusive)
	* @return the range of history rmdc ships
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip> getHistoryRmdcShips(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _historyRmdcShipLocalService.getHistoryRmdcShips(start, end);
	}

	/**
	* Returns the number of history rmdc ships.
	*
	* @return the number of history rmdc ships
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getHistoryRmdcShipsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _historyRmdcShipLocalService.getHistoryRmdcShipsCount();
	}

	/**
	* Updates the history rmdc ship in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param historyRmdcShip the history rmdc ship
	* @return the history rmdc ship that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip updateHistoryRmdcShip(
		vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip historyRmdcShip)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _historyRmdcShipLocalService.updateHistoryRmdcShip(historyRmdcShip);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _historyRmdcShipLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_historyRmdcShipLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _historyRmdcShipLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public HistoryRmdcShipLocalService getWrappedHistoryRmdcShipLocalService() {
		return _historyRmdcShipLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedHistoryRmdcShipLocalService(
		HistoryRmdcShipLocalService historyRmdcShipLocalService) {
		_historyRmdcShipLocalService = historyRmdcShipLocalService;
	}

	@Override
	public HistoryRmdcShipLocalService getWrappedService() {
		return _historyRmdcShipLocalService;
	}

	@Override
	public void setWrappedService(
		HistoryRmdcShipLocalService historyRmdcShipLocalService) {
		_historyRmdcShipLocalService = historyRmdcShipLocalService;
	}

	private HistoryRmdcShipLocalService _historyRmdcShipLocalService;
}