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

package vn.dtt.duongbo.dao.thanhtoan.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TthcHinhThucNopPhiLocalService}.
 *
 * @author win_64
 * @see TthcHinhThucNopPhiLocalService
 * @generated
 */
public class TthcHinhThucNopPhiLocalServiceWrapper
	implements TthcHinhThucNopPhiLocalService,
		ServiceWrapper<TthcHinhThucNopPhiLocalService> {
	public TthcHinhThucNopPhiLocalServiceWrapper(
		TthcHinhThucNopPhiLocalService tthcHinhThucNopPhiLocalService) {
		_tthcHinhThucNopPhiLocalService = tthcHinhThucNopPhiLocalService;
	}

	/**
	* Adds the tthc hinh thuc nop phi to the database. Also notifies the appropriate model listeners.
	*
	* @param tthcHinhThucNopPhi the tthc hinh thuc nop phi
	* @return the tthc hinh thuc nop phi that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi addTthcHinhThucNopPhi(
		vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi tthcHinhThucNopPhi)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcHinhThucNopPhiLocalService.addTthcHinhThucNopPhi(tthcHinhThucNopPhi);
	}

	/**
	* Creates a new tthc hinh thuc nop phi with the primary key. Does not add the tthc hinh thuc nop phi to the database.
	*
	* @param id the primary key for the new tthc hinh thuc nop phi
	* @return the new tthc hinh thuc nop phi
	*/
	@Override
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi createTthcHinhThucNopPhi(
		long id) {
		return _tthcHinhThucNopPhiLocalService.createTthcHinhThucNopPhi(id);
	}

	/**
	* Deletes the tthc hinh thuc nop phi with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tthc hinh thuc nop phi
	* @return the tthc hinh thuc nop phi that was removed
	* @throws PortalException if a tthc hinh thuc nop phi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi deleteTthcHinhThucNopPhi(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tthcHinhThucNopPhiLocalService.deleteTthcHinhThucNopPhi(id);
	}

	/**
	* Deletes the tthc hinh thuc nop phi from the database. Also notifies the appropriate model listeners.
	*
	* @param tthcHinhThucNopPhi the tthc hinh thuc nop phi
	* @return the tthc hinh thuc nop phi that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi deleteTthcHinhThucNopPhi(
		vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi tthcHinhThucNopPhi)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcHinhThucNopPhiLocalService.deleteTthcHinhThucNopPhi(tthcHinhThucNopPhi);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tthcHinhThucNopPhiLocalService.dynamicQuery();
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
		return _tthcHinhThucNopPhiLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcHinhThucNopPhiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tthcHinhThucNopPhiLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcHinhThucNopPhiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tthcHinhThucNopPhiLocalService.dynamicQuery(dynamicQuery,
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
		return _tthcHinhThucNopPhiLocalService.dynamicQueryCount(dynamicQuery);
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
		return _tthcHinhThucNopPhiLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi fetchTthcHinhThucNopPhi(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcHinhThucNopPhiLocalService.fetchTthcHinhThucNopPhi(id);
	}

	/**
	* Returns the tthc hinh thuc nop phi with the primary key.
	*
	* @param id the primary key of the tthc hinh thuc nop phi
	* @return the tthc hinh thuc nop phi
	* @throws PortalException if a tthc hinh thuc nop phi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi getTthcHinhThucNopPhi(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tthcHinhThucNopPhiLocalService.getTthcHinhThucNopPhi(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tthcHinhThucNopPhiLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the tthc hinh thuc nop phis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcHinhThucNopPhiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc hinh thuc nop phis
	* @param end the upper bound of the range of tthc hinh thuc nop phis (not inclusive)
	* @return the range of tthc hinh thuc nop phis
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi> getTthcHinhThucNopPhis(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcHinhThucNopPhiLocalService.getTthcHinhThucNopPhis(start, end);
	}

	/**
	* Returns the number of tthc hinh thuc nop phis.
	*
	* @return the number of tthc hinh thuc nop phis
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTthcHinhThucNopPhisCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcHinhThucNopPhiLocalService.getTthcHinhThucNopPhisCount();
	}

	/**
	* Updates the tthc hinh thuc nop phi in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tthcHinhThucNopPhi the tthc hinh thuc nop phi
	* @return the tthc hinh thuc nop phi that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi updateTthcHinhThucNopPhi(
		vn.dtt.duongbo.dao.thanhtoan.model.TthcHinhThucNopPhi tthcHinhThucNopPhi)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcHinhThucNopPhiLocalService.updateTthcHinhThucNopPhi(tthcHinhThucNopPhi);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _tthcHinhThucNopPhiLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tthcHinhThucNopPhiLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tthcHinhThucNopPhiLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TthcHinhThucNopPhiLocalService getWrappedTthcHinhThucNopPhiLocalService() {
		return _tthcHinhThucNopPhiLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTthcHinhThucNopPhiLocalService(
		TthcHinhThucNopPhiLocalService tthcHinhThucNopPhiLocalService) {
		_tthcHinhThucNopPhiLocalService = tthcHinhThucNopPhiLocalService;
	}

	@Override
	public TthcHinhThucNopPhiLocalService getWrappedService() {
		return _tthcHinhThucNopPhiLocalService;
	}

	@Override
	public void setWrappedService(
		TthcHinhThucNopPhiLocalService tthcHinhThucNopPhiLocalService) {
		_tthcHinhThucNopPhiLocalService = tthcHinhThucNopPhiLocalService;
	}

	private TthcHinhThucNopPhiLocalService _tthcHinhThucNopPhiLocalService;
}