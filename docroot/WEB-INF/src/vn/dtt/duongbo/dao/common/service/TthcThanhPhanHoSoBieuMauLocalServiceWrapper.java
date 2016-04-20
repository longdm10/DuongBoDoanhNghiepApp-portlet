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
 * Provides a wrapper for {@link TthcThanhPhanHoSoBieuMauLocalService}.
 *
 * @author win_64
 * @see TthcThanhPhanHoSoBieuMauLocalService
 * @generated
 */
public class TthcThanhPhanHoSoBieuMauLocalServiceWrapper
	implements TthcThanhPhanHoSoBieuMauLocalService,
		ServiceWrapper<TthcThanhPhanHoSoBieuMauLocalService> {
	public TthcThanhPhanHoSoBieuMauLocalServiceWrapper(
		TthcThanhPhanHoSoBieuMauLocalService tthcThanhPhanHoSoBieuMauLocalService) {
		_tthcThanhPhanHoSoBieuMauLocalService = tthcThanhPhanHoSoBieuMauLocalService;
	}

	/**
	* Adds the tthc thanh phan ho so bieu mau to the database. Also notifies the appropriate model listeners.
	*
	* @param tthcThanhPhanHoSoBieuMau the tthc thanh phan ho so bieu mau
	* @return the tthc thanh phan ho so bieu mau that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau addTthcThanhPhanHoSoBieuMau(
		vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau tthcThanhPhanHoSoBieuMau)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcThanhPhanHoSoBieuMauLocalService.addTthcThanhPhanHoSoBieuMau(tthcThanhPhanHoSoBieuMau);
	}

	/**
	* Creates a new tthc thanh phan ho so bieu mau with the primary key. Does not add the tthc thanh phan ho so bieu mau to the database.
	*
	* @param id the primary key for the new tthc thanh phan ho so bieu mau
	* @return the new tthc thanh phan ho so bieu mau
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau createTthcThanhPhanHoSoBieuMau(
		long id) {
		return _tthcThanhPhanHoSoBieuMauLocalService.createTthcThanhPhanHoSoBieuMau(id);
	}

	/**
	* Deletes the tthc thanh phan ho so bieu mau with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tthc thanh phan ho so bieu mau
	* @return the tthc thanh phan ho so bieu mau that was removed
	* @throws PortalException if a tthc thanh phan ho so bieu mau with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau deleteTthcThanhPhanHoSoBieuMau(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tthcThanhPhanHoSoBieuMauLocalService.deleteTthcThanhPhanHoSoBieuMau(id);
	}

	/**
	* Deletes the tthc thanh phan ho so bieu mau from the database. Also notifies the appropriate model listeners.
	*
	* @param tthcThanhPhanHoSoBieuMau the tthc thanh phan ho so bieu mau
	* @return the tthc thanh phan ho so bieu mau that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau deleteTthcThanhPhanHoSoBieuMau(
		vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau tthcThanhPhanHoSoBieuMau)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcThanhPhanHoSoBieuMauLocalService.deleteTthcThanhPhanHoSoBieuMau(tthcThanhPhanHoSoBieuMau);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tthcThanhPhanHoSoBieuMauLocalService.dynamicQuery();
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
		return _tthcThanhPhanHoSoBieuMauLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcThanhPhanHoSoBieuMauModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tthcThanhPhanHoSoBieuMauLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcThanhPhanHoSoBieuMauModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tthcThanhPhanHoSoBieuMauLocalService.dynamicQuery(dynamicQuery,
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
		return _tthcThanhPhanHoSoBieuMauLocalService.dynamicQueryCount(dynamicQuery);
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
		return _tthcThanhPhanHoSoBieuMauLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau fetchTthcThanhPhanHoSoBieuMau(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcThanhPhanHoSoBieuMauLocalService.fetchTthcThanhPhanHoSoBieuMau(id);
	}

	/**
	* Returns the tthc thanh phan ho so bieu mau with the primary key.
	*
	* @param id the primary key of the tthc thanh phan ho so bieu mau
	* @return the tthc thanh phan ho so bieu mau
	* @throws PortalException if a tthc thanh phan ho so bieu mau with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau getTthcThanhPhanHoSoBieuMau(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tthcThanhPhanHoSoBieuMauLocalService.getTthcThanhPhanHoSoBieuMau(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tthcThanhPhanHoSoBieuMauLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the tthc thanh phan ho so bieu maus.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcThanhPhanHoSoBieuMauModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc thanh phan ho so bieu maus
	* @param end the upper bound of the range of tthc thanh phan ho so bieu maus (not inclusive)
	* @return the range of tthc thanh phan ho so bieu maus
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau> getTthcThanhPhanHoSoBieuMaus(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcThanhPhanHoSoBieuMauLocalService.getTthcThanhPhanHoSoBieuMaus(start,
			end);
	}

	/**
	* Returns the number of tthc thanh phan ho so bieu maus.
	*
	* @return the number of tthc thanh phan ho so bieu maus
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTthcThanhPhanHoSoBieuMausCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcThanhPhanHoSoBieuMauLocalService.getTthcThanhPhanHoSoBieuMausCount();
	}

	/**
	* Updates the tthc thanh phan ho so bieu mau in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tthcThanhPhanHoSoBieuMau the tthc thanh phan ho so bieu mau
	* @return the tthc thanh phan ho so bieu mau that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau updateTthcThanhPhanHoSoBieuMau(
		vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau tthcThanhPhanHoSoBieuMau)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcThanhPhanHoSoBieuMauLocalService.updateTthcThanhPhanHoSoBieuMau(tthcThanhPhanHoSoBieuMau);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _tthcThanhPhanHoSoBieuMauLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tthcThanhPhanHoSoBieuMauLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tthcThanhPhanHoSoBieuMauLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau> findByThanhPhanHoSoId(
		long thanhPhanHoSoId) {
		return _tthcThanhPhanHoSoBieuMauLocalService.findByThanhPhanHoSoId(thanhPhanHoSoId);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau> findByBieuMauHoSoId(
		long bieuMauHoSoId) {
		return _tthcThanhPhanHoSoBieuMauLocalService.findByBieuMauHoSoId(bieuMauHoSoId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TthcThanhPhanHoSoBieuMauLocalService getWrappedTthcThanhPhanHoSoBieuMauLocalService() {
		return _tthcThanhPhanHoSoBieuMauLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTthcThanhPhanHoSoBieuMauLocalService(
		TthcThanhPhanHoSoBieuMauLocalService tthcThanhPhanHoSoBieuMauLocalService) {
		_tthcThanhPhanHoSoBieuMauLocalService = tthcThanhPhanHoSoBieuMauLocalService;
	}

	@Override
	public TthcThanhPhanHoSoBieuMauLocalService getWrappedService() {
		return _tthcThanhPhanHoSoBieuMauLocalService;
	}

	@Override
	public void setWrappedService(
		TthcThanhPhanHoSoBieuMauLocalService tthcThanhPhanHoSoBieuMauLocalService) {
		_tthcThanhPhanHoSoBieuMauLocalService = tthcThanhPhanHoSoBieuMauLocalService;
	}

	private TthcThanhPhanHoSoBieuMauLocalService _tthcThanhPhanHoSoBieuMauLocalService;
}