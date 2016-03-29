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

package vn.dtt.duongbo.dao.nghiepvu.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link QlvtKiemTraHoSoLocalService}.
 *
 * @author NhanNc
 * @see QlvtKiemTraHoSoLocalService
 * @generated
 */
public class QlvtKiemTraHoSoLocalServiceWrapper
	implements QlvtKiemTraHoSoLocalService,
		ServiceWrapper<QlvtKiemTraHoSoLocalService> {
	public QlvtKiemTraHoSoLocalServiceWrapper(
		QlvtKiemTraHoSoLocalService qlvtKiemTraHoSoLocalService) {
		_qlvtKiemTraHoSoLocalService = qlvtKiemTraHoSoLocalService;
	}

	/**
	* Adds the qlvt kiem tra ho so to the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtKiemTraHoSo the qlvt kiem tra ho so
	* @return the qlvt kiem tra ho so that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtKiemTraHoSo addQlvtKiemTraHoSo(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtKiemTraHoSo qlvtKiemTraHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtKiemTraHoSoLocalService.addQlvtKiemTraHoSo(qlvtKiemTraHoSo);
	}

	/**
	* Creates a new qlvt kiem tra ho so with the primary key. Does not add the qlvt kiem tra ho so to the database.
	*
	* @param id the primary key for the new qlvt kiem tra ho so
	* @return the new qlvt kiem tra ho so
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtKiemTraHoSo createQlvtKiemTraHoSo(
		long id) {
		return _qlvtKiemTraHoSoLocalService.createQlvtKiemTraHoSo(id);
	}

	/**
	* Deletes the qlvt kiem tra ho so with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt kiem tra ho so
	* @return the qlvt kiem tra ho so that was removed
	* @throws PortalException if a qlvt kiem tra ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtKiemTraHoSo deleteQlvtKiemTraHoSo(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtKiemTraHoSoLocalService.deleteQlvtKiemTraHoSo(id);
	}

	/**
	* Deletes the qlvt kiem tra ho so from the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtKiemTraHoSo the qlvt kiem tra ho so
	* @return the qlvt kiem tra ho so that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtKiemTraHoSo deleteQlvtKiemTraHoSo(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtKiemTraHoSo qlvtKiemTraHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtKiemTraHoSoLocalService.deleteQlvtKiemTraHoSo(qlvtKiemTraHoSo);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _qlvtKiemTraHoSoLocalService.dynamicQuery();
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
		return _qlvtKiemTraHoSoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtKiemTraHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtKiemTraHoSoLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtKiemTraHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtKiemTraHoSoLocalService.dynamicQuery(dynamicQuery, start,
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
		return _qlvtKiemTraHoSoLocalService.dynamicQueryCount(dynamicQuery);
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
		return _qlvtKiemTraHoSoLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtKiemTraHoSo fetchQlvtKiemTraHoSo(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtKiemTraHoSoLocalService.fetchQlvtKiemTraHoSo(id);
	}

	/**
	* Returns the qlvt kiem tra ho so with the primary key.
	*
	* @param id the primary key of the qlvt kiem tra ho so
	* @return the qlvt kiem tra ho so
	* @throws PortalException if a qlvt kiem tra ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtKiemTraHoSo getQlvtKiemTraHoSo(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtKiemTraHoSoLocalService.getQlvtKiemTraHoSo(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtKiemTraHoSoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the qlvt kiem tra ho sos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtKiemTraHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt kiem tra ho sos
	* @param end the upper bound of the range of qlvt kiem tra ho sos (not inclusive)
	* @return the range of qlvt kiem tra ho sos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtKiemTraHoSo> getQlvtKiemTraHoSos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtKiemTraHoSoLocalService.getQlvtKiemTraHoSos(start, end);
	}

	/**
	* Returns the number of qlvt kiem tra ho sos.
	*
	* @return the number of qlvt kiem tra ho sos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getQlvtKiemTraHoSosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtKiemTraHoSoLocalService.getQlvtKiemTraHoSosCount();
	}

	/**
	* Updates the qlvt kiem tra ho so in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param qlvtKiemTraHoSo the qlvt kiem tra ho so
	* @return the qlvt kiem tra ho so that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtKiemTraHoSo updateQlvtKiemTraHoSo(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtKiemTraHoSo qlvtKiemTraHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtKiemTraHoSoLocalService.updateQlvtKiemTraHoSo(qlvtKiemTraHoSo);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _qlvtKiemTraHoSoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_qlvtKiemTraHoSoLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _qlvtKiemTraHoSoLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public QlvtKiemTraHoSoLocalService getWrappedQlvtKiemTraHoSoLocalService() {
		return _qlvtKiemTraHoSoLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedQlvtKiemTraHoSoLocalService(
		QlvtKiemTraHoSoLocalService qlvtKiemTraHoSoLocalService) {
		_qlvtKiemTraHoSoLocalService = qlvtKiemTraHoSoLocalService;
	}

	@Override
	public QlvtKiemTraHoSoLocalService getWrappedService() {
		return _qlvtKiemTraHoSoLocalService;
	}

	@Override
	public void setWrappedService(
		QlvtKiemTraHoSoLocalService qlvtKiemTraHoSoLocalService) {
		_qlvtKiemTraHoSoLocalService = qlvtKiemTraHoSoLocalService;
	}

	private QlvtKiemTraHoSoLocalService _qlvtKiemTraHoSoLocalService;
}