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
 * Provides a wrapper for {@link TthcNoidungHoSoTmpLocalService}.
 *
 * @author win_64
 * @see TthcNoidungHoSoTmpLocalService
 * @generated
 */
public class TthcNoidungHoSoTmpLocalServiceWrapper
	implements TthcNoidungHoSoTmpLocalService,
		ServiceWrapper<TthcNoidungHoSoTmpLocalService> {
	public TthcNoidungHoSoTmpLocalServiceWrapper(
		TthcNoidungHoSoTmpLocalService tthcNoidungHoSoTmpLocalService) {
		_tthcNoidungHoSoTmpLocalService = tthcNoidungHoSoTmpLocalService;
	}

	/**
	* Adds the tthc noidung ho so tmp to the database. Also notifies the appropriate model listeners.
	*
	* @param tthcNoidungHoSoTmp the tthc noidung ho so tmp
	* @return the tthc noidung ho so tmp that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp addTthcNoidungHoSoTmp(
		vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp tthcNoidungHoSoTmp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcNoidungHoSoTmpLocalService.addTthcNoidungHoSoTmp(tthcNoidungHoSoTmp);
	}

	/**
	* Creates a new tthc noidung ho so tmp with the primary key. Does not add the tthc noidung ho so tmp to the database.
	*
	* @param id the primary key for the new tthc noidung ho so tmp
	* @return the new tthc noidung ho so tmp
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp createTthcNoidungHoSoTmp(
		long id) {
		return _tthcNoidungHoSoTmpLocalService.createTthcNoidungHoSoTmp(id);
	}

	/**
	* Deletes the tthc noidung ho so tmp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tthc noidung ho so tmp
	* @return the tthc noidung ho so tmp that was removed
	* @throws PortalException if a tthc noidung ho so tmp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp deleteTthcNoidungHoSoTmp(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tthcNoidungHoSoTmpLocalService.deleteTthcNoidungHoSoTmp(id);
	}

	/**
	* Deletes the tthc noidung ho so tmp from the database. Also notifies the appropriate model listeners.
	*
	* @param tthcNoidungHoSoTmp the tthc noidung ho so tmp
	* @return the tthc noidung ho so tmp that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp deleteTthcNoidungHoSoTmp(
		vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp tthcNoidungHoSoTmp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcNoidungHoSoTmpLocalService.deleteTthcNoidungHoSoTmp(tthcNoidungHoSoTmp);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tthcNoidungHoSoTmpLocalService.dynamicQuery();
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
		return _tthcNoidungHoSoTmpLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoTmpModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tthcNoidungHoSoTmpLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoTmpModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tthcNoidungHoSoTmpLocalService.dynamicQuery(dynamicQuery,
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
		return _tthcNoidungHoSoTmpLocalService.dynamicQueryCount(dynamicQuery);
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
		return _tthcNoidungHoSoTmpLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp fetchTthcNoidungHoSoTmp(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcNoidungHoSoTmpLocalService.fetchTthcNoidungHoSoTmp(id);
	}

	/**
	* Returns the tthc noidung ho so tmp with the primary key.
	*
	* @param id the primary key of the tthc noidung ho so tmp
	* @return the tthc noidung ho so tmp
	* @throws PortalException if a tthc noidung ho so tmp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp getTthcNoidungHoSoTmp(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tthcNoidungHoSoTmpLocalService.getTthcNoidungHoSoTmp(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tthcNoidungHoSoTmpLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the tthc noidung ho so tmps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoTmpModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc noidung ho so tmps
	* @param end the upper bound of the range of tthc noidung ho so tmps (not inclusive)
	* @return the range of tthc noidung ho so tmps
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp> getTthcNoidungHoSoTmps(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcNoidungHoSoTmpLocalService.getTthcNoidungHoSoTmps(start, end);
	}

	/**
	* Returns the number of tthc noidung ho so tmps.
	*
	* @return the number of tthc noidung ho so tmps
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTthcNoidungHoSoTmpsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcNoidungHoSoTmpLocalService.getTthcNoidungHoSoTmpsCount();
	}

	/**
	* Updates the tthc noidung ho so tmp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tthcNoidungHoSoTmp the tthc noidung ho so tmp
	* @return the tthc noidung ho so tmp that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp updateTthcNoidungHoSoTmp(
		vn.dtt.duongbo.dao.common.model.TthcNoidungHoSoTmp tthcNoidungHoSoTmp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcNoidungHoSoTmpLocalService.updateTthcNoidungHoSoTmp(tthcNoidungHoSoTmp);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _tthcNoidungHoSoTmpLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tthcNoidungHoSoTmpLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tthcNoidungHoSoTmpLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TthcNoidungHoSoTmpLocalService getWrappedTthcNoidungHoSoTmpLocalService() {
		return _tthcNoidungHoSoTmpLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTthcNoidungHoSoTmpLocalService(
		TthcNoidungHoSoTmpLocalService tthcNoidungHoSoTmpLocalService) {
		_tthcNoidungHoSoTmpLocalService = tthcNoidungHoSoTmpLocalService;
	}

	@Override
	public TthcNoidungHoSoTmpLocalService getWrappedService() {
		return _tthcNoidungHoSoTmpLocalService;
	}

	@Override
	public void setWrappedService(
		TthcNoidungHoSoTmpLocalService tthcNoidungHoSoTmpLocalService) {
		_tthcNoidungHoSoTmpLocalService = tthcNoidungHoSoTmpLocalService;
	}

	private TthcNoidungHoSoTmpLocalService _tthcNoidungHoSoTmpLocalService;
}