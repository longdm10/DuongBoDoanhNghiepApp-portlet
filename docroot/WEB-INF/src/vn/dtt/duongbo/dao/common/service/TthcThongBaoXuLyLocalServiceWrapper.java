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
 * Provides a wrapper for {@link TthcThongBaoXuLyLocalService}.
 *
 * @author win_64
 * @see TthcThongBaoXuLyLocalService
 * @generated
 */
public class TthcThongBaoXuLyLocalServiceWrapper
	implements TthcThongBaoXuLyLocalService,
		ServiceWrapper<TthcThongBaoXuLyLocalService> {
	public TthcThongBaoXuLyLocalServiceWrapper(
		TthcThongBaoXuLyLocalService tthcThongBaoXuLyLocalService) {
		_tthcThongBaoXuLyLocalService = tthcThongBaoXuLyLocalService;
	}

	/**
	* Adds the tthc thong bao xu ly to the database. Also notifies the appropriate model listeners.
	*
	* @param tthcThongBaoXuLy the tthc thong bao xu ly
	* @return the tthc thong bao xu ly that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.TthcThongBaoXuLy addTthcThongBaoXuLy(
		vn.dtt.duongbo.dao.common.model.TthcThongBaoXuLy tthcThongBaoXuLy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcThongBaoXuLyLocalService.addTthcThongBaoXuLy(tthcThongBaoXuLy);
	}

	/**
	* Creates a new tthc thong bao xu ly with the primary key. Does not add the tthc thong bao xu ly to the database.
	*
	* @param id the primary key for the new tthc thong bao xu ly
	* @return the new tthc thong bao xu ly
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.TthcThongBaoXuLy createTthcThongBaoXuLy(
		long id) {
		return _tthcThongBaoXuLyLocalService.createTthcThongBaoXuLy(id);
	}

	/**
	* Deletes the tthc thong bao xu ly with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tthc thong bao xu ly
	* @return the tthc thong bao xu ly that was removed
	* @throws PortalException if a tthc thong bao xu ly with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.TthcThongBaoXuLy deleteTthcThongBaoXuLy(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tthcThongBaoXuLyLocalService.deleteTthcThongBaoXuLy(id);
	}

	/**
	* Deletes the tthc thong bao xu ly from the database. Also notifies the appropriate model listeners.
	*
	* @param tthcThongBaoXuLy the tthc thong bao xu ly
	* @return the tthc thong bao xu ly that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.TthcThongBaoXuLy deleteTthcThongBaoXuLy(
		vn.dtt.duongbo.dao.common.model.TthcThongBaoXuLy tthcThongBaoXuLy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcThongBaoXuLyLocalService.deleteTthcThongBaoXuLy(tthcThongBaoXuLy);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tthcThongBaoXuLyLocalService.dynamicQuery();
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
		return _tthcThongBaoXuLyLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcThongBaoXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tthcThongBaoXuLyLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcThongBaoXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tthcThongBaoXuLyLocalService.dynamicQuery(dynamicQuery, start,
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
		return _tthcThongBaoXuLyLocalService.dynamicQueryCount(dynamicQuery);
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
		return _tthcThongBaoXuLyLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.TthcThongBaoXuLy fetchTthcThongBaoXuLy(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcThongBaoXuLyLocalService.fetchTthcThongBaoXuLy(id);
	}

	/**
	* Returns the tthc thong bao xu ly with the primary key.
	*
	* @param id the primary key of the tthc thong bao xu ly
	* @return the tthc thong bao xu ly
	* @throws PortalException if a tthc thong bao xu ly with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.TthcThongBaoXuLy getTthcThongBaoXuLy(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tthcThongBaoXuLyLocalService.getTthcThongBaoXuLy(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tthcThongBaoXuLyLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the tthc thong bao xu lies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcThongBaoXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc thong bao xu lies
	* @param end the upper bound of the range of tthc thong bao xu lies (not inclusive)
	* @return the range of tthc thong bao xu lies
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcThongBaoXuLy> getTthcThongBaoXuLies(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcThongBaoXuLyLocalService.getTthcThongBaoXuLies(start, end);
	}

	/**
	* Returns the number of tthc thong bao xu lies.
	*
	* @return the number of tthc thong bao xu lies
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTthcThongBaoXuLiesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcThongBaoXuLyLocalService.getTthcThongBaoXuLiesCount();
	}

	/**
	* Updates the tthc thong bao xu ly in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tthcThongBaoXuLy the tthc thong bao xu ly
	* @return the tthc thong bao xu ly that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.TthcThongBaoXuLy updateTthcThongBaoXuLy(
		vn.dtt.duongbo.dao.common.model.TthcThongBaoXuLy tthcThongBaoXuLy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcThongBaoXuLyLocalService.updateTthcThongBaoXuLy(tthcThongBaoXuLy);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _tthcThongBaoXuLyLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tthcThongBaoXuLyLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tthcThongBaoXuLyLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TthcThongBaoXuLyLocalService getWrappedTthcThongBaoXuLyLocalService() {
		return _tthcThongBaoXuLyLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTthcThongBaoXuLyLocalService(
		TthcThongBaoXuLyLocalService tthcThongBaoXuLyLocalService) {
		_tthcThongBaoXuLyLocalService = tthcThongBaoXuLyLocalService;
	}

	@Override
	public TthcThongBaoXuLyLocalService getWrappedService() {
		return _tthcThongBaoXuLyLocalService;
	}

	@Override
	public void setWrappedService(
		TthcThongBaoXuLyLocalService tthcThongBaoXuLyLocalService) {
		_tthcThongBaoXuLyLocalService = tthcThongBaoXuLyLocalService;
	}

	private TthcThongBaoXuLyLocalService _tthcThongBaoXuLyLocalService;
}