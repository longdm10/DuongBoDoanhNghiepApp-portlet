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
 * Provides a wrapper for {@link QlvtPhuongTienDangKyVietCamLocalService}.
 *
 * @author win_64
 * @see QlvtPhuongTienDangKyVietCamLocalService
 * @generated
 */
public class QlvtPhuongTienDangKyVietCamLocalServiceWrapper
	implements QlvtPhuongTienDangKyVietCamLocalService,
		ServiceWrapper<QlvtPhuongTienDangKyVietCamLocalService> {
	public QlvtPhuongTienDangKyVietCamLocalServiceWrapper(
		QlvtPhuongTienDangKyVietCamLocalService qlvtPhuongTienDangKyVietCamLocalService) {
		_qlvtPhuongTienDangKyVietCamLocalService = qlvtPhuongTienDangKyVietCamLocalService;
	}

	/**
	* Adds the qlvt phuong tien dang ky viet cam to the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtPhuongTienDangKyVietCam the qlvt phuong tien dang ky viet cam
	* @return the qlvt phuong tien dang ky viet cam that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCam addQlvtPhuongTienDangKyVietCam(
		vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCam qlvtPhuongTienDangKyVietCam)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtPhuongTienDangKyVietCamLocalService.addQlvtPhuongTienDangKyVietCam(qlvtPhuongTienDangKyVietCam);
	}

	/**
	* Creates a new qlvt phuong tien dang ky viet cam with the primary key. Does not add the qlvt phuong tien dang ky viet cam to the database.
	*
	* @param id the primary key for the new qlvt phuong tien dang ky viet cam
	* @return the new qlvt phuong tien dang ky viet cam
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCam createQlvtPhuongTienDangKyVietCam(
		long id) {
		return _qlvtPhuongTienDangKyVietCamLocalService.createQlvtPhuongTienDangKyVietCam(id);
	}

	/**
	* Deletes the qlvt phuong tien dang ky viet cam with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt phuong tien dang ky viet cam
	* @return the qlvt phuong tien dang ky viet cam that was removed
	* @throws PortalException if a qlvt phuong tien dang ky viet cam with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCam deleteQlvtPhuongTienDangKyVietCam(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtPhuongTienDangKyVietCamLocalService.deleteQlvtPhuongTienDangKyVietCam(id);
	}

	/**
	* Deletes the qlvt phuong tien dang ky viet cam from the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtPhuongTienDangKyVietCam the qlvt phuong tien dang ky viet cam
	* @return the qlvt phuong tien dang ky viet cam that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCam deleteQlvtPhuongTienDangKyVietCam(
		vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCam qlvtPhuongTienDangKyVietCam)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtPhuongTienDangKyVietCamLocalService.deleteQlvtPhuongTienDangKyVietCam(qlvtPhuongTienDangKyVietCam);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _qlvtPhuongTienDangKyVietCamLocalService.dynamicQuery();
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
		return _qlvtPhuongTienDangKyVietCamLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietCamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtPhuongTienDangKyVietCamLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietCamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtPhuongTienDangKyVietCamLocalService.dynamicQuery(dynamicQuery,
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
		return _qlvtPhuongTienDangKyVietCamLocalService.dynamicQueryCount(dynamicQuery);
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
		return _qlvtPhuongTienDangKyVietCamLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCam fetchQlvtPhuongTienDangKyVietCam(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtPhuongTienDangKyVietCamLocalService.fetchQlvtPhuongTienDangKyVietCam(id);
	}

	/**
	* Returns the qlvt phuong tien dang ky viet cam with the primary key.
	*
	* @param id the primary key of the qlvt phuong tien dang ky viet cam
	* @return the qlvt phuong tien dang ky viet cam
	* @throws PortalException if a qlvt phuong tien dang ky viet cam with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCam getQlvtPhuongTienDangKyVietCam(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtPhuongTienDangKyVietCamLocalService.getQlvtPhuongTienDangKyVietCam(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtPhuongTienDangKyVietCamLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the qlvt phuong tien dang ky viet cams.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietCamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt phuong tien dang ky viet cams
	* @param end the upper bound of the range of qlvt phuong tien dang ky viet cams (not inclusive)
	* @return the range of qlvt phuong tien dang ky viet cams
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCam> getQlvtPhuongTienDangKyVietCams(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtPhuongTienDangKyVietCamLocalService.getQlvtPhuongTienDangKyVietCams(start,
			end);
	}

	/**
	* Returns the number of qlvt phuong tien dang ky viet cams.
	*
	* @return the number of qlvt phuong tien dang ky viet cams
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getQlvtPhuongTienDangKyVietCamsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtPhuongTienDangKyVietCamLocalService.getQlvtPhuongTienDangKyVietCamsCount();
	}

	/**
	* Updates the qlvt phuong tien dang ky viet cam in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param qlvtPhuongTienDangKyVietCam the qlvt phuong tien dang ky viet cam
	* @return the qlvt phuong tien dang ky viet cam that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCam updateQlvtPhuongTienDangKyVietCam(
		vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCam qlvtPhuongTienDangKyVietCam)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtPhuongTienDangKyVietCamLocalService.updateQlvtPhuongTienDangKyVietCam(qlvtPhuongTienDangKyVietCam);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _qlvtPhuongTienDangKyVietCamLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_qlvtPhuongTienDangKyVietCamLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _qlvtPhuongTienDangKyVietCamLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCam> findByNoiDungHoSoId(
		long idNoiDungHoSo) {
		return _qlvtPhuongTienDangKyVietCamLocalService.findByNoiDungHoSoId(idNoiDungHoSo);
	}

	@Override
	public java.util.List<java.lang.Long> findIdByNoiDungHoSoId(
		long noiDungHoSoI) {
		return _qlvtPhuongTienDangKyVietCamLocalService.findIdByNoiDungHoSoId(noiDungHoSoI);
	}

	@Override
	public boolean deleteAllByNoiDungHoSoId(long noiDungHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtPhuongTienDangKyVietCamLocalService.deleteAllByNoiDungHoSoId(noiDungHoSoId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public QlvtPhuongTienDangKyVietCamLocalService getWrappedQlvtPhuongTienDangKyVietCamLocalService() {
		return _qlvtPhuongTienDangKyVietCamLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedQlvtPhuongTienDangKyVietCamLocalService(
		QlvtPhuongTienDangKyVietCamLocalService qlvtPhuongTienDangKyVietCamLocalService) {
		_qlvtPhuongTienDangKyVietCamLocalService = qlvtPhuongTienDangKyVietCamLocalService;
	}

	@Override
	public QlvtPhuongTienDangKyVietCamLocalService getWrappedService() {
		return _qlvtPhuongTienDangKyVietCamLocalService;
	}

	@Override
	public void setWrappedService(
		QlvtPhuongTienDangKyVietCamLocalService qlvtPhuongTienDangKyVietCamLocalService) {
		_qlvtPhuongTienDangKyVietCamLocalService = qlvtPhuongTienDangKyVietCamLocalService;
	}

	private QlvtPhuongTienDangKyVietCamLocalService _qlvtPhuongTienDangKyVietCamLocalService;
}