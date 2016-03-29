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
 * Provides a wrapper for {@link QlvtDiemDungDangKyVietLaoLocalService}.
 *
 * @author win_64
 * @see QlvtDiemDungDangKyVietLaoLocalService
 * @generated
 */
public class QlvtDiemDungDangKyVietLaoLocalServiceWrapper
	implements QlvtDiemDungDangKyVietLaoLocalService,
		ServiceWrapper<QlvtDiemDungDangKyVietLaoLocalService> {
	public QlvtDiemDungDangKyVietLaoLocalServiceWrapper(
		QlvtDiemDungDangKyVietLaoLocalService qlvtDiemDungDangKyVietLaoLocalService) {
		_qlvtDiemDungDangKyVietLaoLocalService = qlvtDiemDungDangKyVietLaoLocalService;
	}

	/**
	* Adds the qlvt diem dung dang ky viet lao to the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtDiemDungDangKyVietLao the qlvt diem dung dang ky viet lao
	* @return the qlvt diem dung dang ky viet lao that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietLao addQlvtDiemDungDangKyVietLao(
		vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietLao qlvtDiemDungDangKyVietLao)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtDiemDungDangKyVietLaoLocalService.addQlvtDiemDungDangKyVietLao(qlvtDiemDungDangKyVietLao);
	}

	/**
	* Creates a new qlvt diem dung dang ky viet lao with the primary key. Does not add the qlvt diem dung dang ky viet lao to the database.
	*
	* @param id the primary key for the new qlvt diem dung dang ky viet lao
	* @return the new qlvt diem dung dang ky viet lao
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietLao createQlvtDiemDungDangKyVietLao(
		long id) {
		return _qlvtDiemDungDangKyVietLaoLocalService.createQlvtDiemDungDangKyVietLao(id);
	}

	/**
	* Deletes the qlvt diem dung dang ky viet lao with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt diem dung dang ky viet lao
	* @return the qlvt diem dung dang ky viet lao that was removed
	* @throws PortalException if a qlvt diem dung dang ky viet lao with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietLao deleteQlvtDiemDungDangKyVietLao(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtDiemDungDangKyVietLaoLocalService.deleteQlvtDiemDungDangKyVietLao(id);
	}

	/**
	* Deletes the qlvt diem dung dang ky viet lao from the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtDiemDungDangKyVietLao the qlvt diem dung dang ky viet lao
	* @return the qlvt diem dung dang ky viet lao that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietLao deleteQlvtDiemDungDangKyVietLao(
		vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietLao qlvtDiemDungDangKyVietLao)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtDiemDungDangKyVietLaoLocalService.deleteQlvtDiemDungDangKyVietLao(qlvtDiemDungDangKyVietLao);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _qlvtDiemDungDangKyVietLaoLocalService.dynamicQuery();
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
		return _qlvtDiemDungDangKyVietLaoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtDiemDungDangKyVietLaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtDiemDungDangKyVietLaoLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtDiemDungDangKyVietLaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtDiemDungDangKyVietLaoLocalService.dynamicQuery(dynamicQuery,
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
		return _qlvtDiemDungDangKyVietLaoLocalService.dynamicQueryCount(dynamicQuery);
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
		return _qlvtDiemDungDangKyVietLaoLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietLao fetchQlvtDiemDungDangKyVietLao(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtDiemDungDangKyVietLaoLocalService.fetchQlvtDiemDungDangKyVietLao(id);
	}

	/**
	* Returns the qlvt diem dung dang ky viet lao with the primary key.
	*
	* @param id the primary key of the qlvt diem dung dang ky viet lao
	* @return the qlvt diem dung dang ky viet lao
	* @throws PortalException if a qlvt diem dung dang ky viet lao with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietLao getQlvtDiemDungDangKyVietLao(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtDiemDungDangKyVietLaoLocalService.getQlvtDiemDungDangKyVietLao(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtDiemDungDangKyVietLaoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the qlvt diem dung dang ky viet laos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtDiemDungDangKyVietLaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt diem dung dang ky viet laos
	* @param end the upper bound of the range of qlvt diem dung dang ky viet laos (not inclusive)
	* @return the range of qlvt diem dung dang ky viet laos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietLao> getQlvtDiemDungDangKyVietLaos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtDiemDungDangKyVietLaoLocalService.getQlvtDiemDungDangKyVietLaos(start,
			end);
	}

	/**
	* Returns the number of qlvt diem dung dang ky viet laos.
	*
	* @return the number of qlvt diem dung dang ky viet laos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getQlvtDiemDungDangKyVietLaosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtDiemDungDangKyVietLaoLocalService.getQlvtDiemDungDangKyVietLaosCount();
	}

	/**
	* Updates the qlvt diem dung dang ky viet lao in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param qlvtDiemDungDangKyVietLao the qlvt diem dung dang ky viet lao
	* @return the qlvt diem dung dang ky viet lao that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietLao updateQlvtDiemDungDangKyVietLao(
		vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietLao qlvtDiemDungDangKyVietLao)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtDiemDungDangKyVietLaoLocalService.updateQlvtDiemDungDangKyVietLao(qlvtDiemDungDangKyVietLao);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _qlvtDiemDungDangKyVietLaoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_qlvtDiemDungDangKyVietLaoLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _qlvtDiemDungDangKyVietLaoLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<java.lang.Long> findIdNoiDungHoSoId(long noiDungHoSoI) {
		return _qlvtDiemDungDangKyVietLaoLocalService.findIdNoiDungHoSoId(noiDungHoSoI);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public QlvtDiemDungDangKyVietLaoLocalService getWrappedQlvtDiemDungDangKyVietLaoLocalService() {
		return _qlvtDiemDungDangKyVietLaoLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedQlvtDiemDungDangKyVietLaoLocalService(
		QlvtDiemDungDangKyVietLaoLocalService qlvtDiemDungDangKyVietLaoLocalService) {
		_qlvtDiemDungDangKyVietLaoLocalService = qlvtDiemDungDangKyVietLaoLocalService;
	}

	@Override
	public QlvtDiemDungDangKyVietLaoLocalService getWrappedService() {
		return _qlvtDiemDungDangKyVietLaoLocalService;
	}

	@Override
	public void setWrappedService(
		QlvtDiemDungDangKyVietLaoLocalService qlvtDiemDungDangKyVietLaoLocalService) {
		_qlvtDiemDungDangKyVietLaoLocalService = qlvtDiemDungDangKyVietLaoLocalService;
	}

	private QlvtDiemDungDangKyVietLaoLocalService _qlvtDiemDungDangKyVietLaoLocalService;
}