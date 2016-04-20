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
 * Provides a wrapper for {@link QlvtDiemDungDangKyVietTrungLocalService}.
 *
 * @author win_64
 * @see QlvtDiemDungDangKyVietTrungLocalService
 * @generated
 */
public class QlvtDiemDungDangKyVietTrungLocalServiceWrapper
	implements QlvtDiemDungDangKyVietTrungLocalService,
		ServiceWrapper<QlvtDiemDungDangKyVietTrungLocalService> {
	public QlvtDiemDungDangKyVietTrungLocalServiceWrapper(
		QlvtDiemDungDangKyVietTrungLocalService qlvtDiemDungDangKyVietTrungLocalService) {
		_qlvtDiemDungDangKyVietTrungLocalService = qlvtDiemDungDangKyVietTrungLocalService;
	}

	/**
	* Adds the qlvt diem dung dang ky viet trung to the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtDiemDungDangKyVietTrung the qlvt diem dung dang ky viet trung
	* @return the qlvt diem dung dang ky viet trung that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietTrung addQlvtDiemDungDangKyVietTrung(
		vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietTrung qlvtDiemDungDangKyVietTrung)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtDiemDungDangKyVietTrungLocalService.addQlvtDiemDungDangKyVietTrung(qlvtDiemDungDangKyVietTrung);
	}

	/**
	* Creates a new qlvt diem dung dang ky viet trung with the primary key. Does not add the qlvt diem dung dang ky viet trung to the database.
	*
	* @param id the primary key for the new qlvt diem dung dang ky viet trung
	* @return the new qlvt diem dung dang ky viet trung
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietTrung createQlvtDiemDungDangKyVietTrung(
		long id) {
		return _qlvtDiemDungDangKyVietTrungLocalService.createQlvtDiemDungDangKyVietTrung(id);
	}

	/**
	* Deletes the qlvt diem dung dang ky viet trung with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt diem dung dang ky viet trung
	* @return the qlvt diem dung dang ky viet trung that was removed
	* @throws PortalException if a qlvt diem dung dang ky viet trung with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietTrung deleteQlvtDiemDungDangKyVietTrung(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtDiemDungDangKyVietTrungLocalService.deleteQlvtDiemDungDangKyVietTrung(id);
	}

	/**
	* Deletes the qlvt diem dung dang ky viet trung from the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtDiemDungDangKyVietTrung the qlvt diem dung dang ky viet trung
	* @return the qlvt diem dung dang ky viet trung that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietTrung deleteQlvtDiemDungDangKyVietTrung(
		vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietTrung qlvtDiemDungDangKyVietTrung)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtDiemDungDangKyVietTrungLocalService.deleteQlvtDiemDungDangKyVietTrung(qlvtDiemDungDangKyVietTrung);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _qlvtDiemDungDangKyVietTrungLocalService.dynamicQuery();
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
		return _qlvtDiemDungDangKyVietTrungLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtDiemDungDangKyVietTrungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtDiemDungDangKyVietTrungLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtDiemDungDangKyVietTrungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtDiemDungDangKyVietTrungLocalService.dynamicQuery(dynamicQuery,
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
		return _qlvtDiemDungDangKyVietTrungLocalService.dynamicQueryCount(dynamicQuery);
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
		return _qlvtDiemDungDangKyVietTrungLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietTrung fetchQlvtDiemDungDangKyVietTrung(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtDiemDungDangKyVietTrungLocalService.fetchQlvtDiemDungDangKyVietTrung(id);
	}

	/**
	* Returns the qlvt diem dung dang ky viet trung with the primary key.
	*
	* @param id the primary key of the qlvt diem dung dang ky viet trung
	* @return the qlvt diem dung dang ky viet trung
	* @throws PortalException if a qlvt diem dung dang ky viet trung with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietTrung getQlvtDiemDungDangKyVietTrung(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtDiemDungDangKyVietTrungLocalService.getQlvtDiemDungDangKyVietTrung(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtDiemDungDangKyVietTrungLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the qlvt diem dung dang ky viet trungs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtDiemDungDangKyVietTrungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt diem dung dang ky viet trungs
	* @param end the upper bound of the range of qlvt diem dung dang ky viet trungs (not inclusive)
	* @return the range of qlvt diem dung dang ky viet trungs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietTrung> getQlvtDiemDungDangKyVietTrungs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtDiemDungDangKyVietTrungLocalService.getQlvtDiemDungDangKyVietTrungs(start,
			end);
	}

	/**
	* Returns the number of qlvt diem dung dang ky viet trungs.
	*
	* @return the number of qlvt diem dung dang ky viet trungs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getQlvtDiemDungDangKyVietTrungsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtDiemDungDangKyVietTrungLocalService.getQlvtDiemDungDangKyVietTrungsCount();
	}

	/**
	* Updates the qlvt diem dung dang ky viet trung in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param qlvtDiemDungDangKyVietTrung the qlvt diem dung dang ky viet trung
	* @return the qlvt diem dung dang ky viet trung that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietTrung updateQlvtDiemDungDangKyVietTrung(
		vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietTrung qlvtDiemDungDangKyVietTrung)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtDiemDungDangKyVietTrungLocalService.updateQlvtDiemDungDangKyVietTrung(qlvtDiemDungDangKyVietTrung);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _qlvtDiemDungDangKyVietTrungLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_qlvtDiemDungDangKyVietTrungLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _qlvtDiemDungDangKyVietTrungLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<java.lang.Long> findIdNoiDungHoSoId(long noiDungHoSoI) {
		return _qlvtDiemDungDangKyVietTrungLocalService.findIdNoiDungHoSoId(noiDungHoSoI);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public QlvtDiemDungDangKyVietTrungLocalService getWrappedQlvtDiemDungDangKyVietTrungLocalService() {
		return _qlvtDiemDungDangKyVietTrungLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedQlvtDiemDungDangKyVietTrungLocalService(
		QlvtDiemDungDangKyVietTrungLocalService qlvtDiemDungDangKyVietTrungLocalService) {
		_qlvtDiemDungDangKyVietTrungLocalService = qlvtDiemDungDangKyVietTrungLocalService;
	}

	@Override
	public QlvtDiemDungDangKyVietTrungLocalService getWrappedService() {
		return _qlvtDiemDungDangKyVietTrungLocalService;
	}

	@Override
	public void setWrappedService(
		QlvtDiemDungDangKyVietTrungLocalService qlvtDiemDungDangKyVietTrungLocalService) {
		_qlvtDiemDungDangKyVietTrungLocalService = qlvtDiemDungDangKyVietTrungLocalService;
	}

	private QlvtDiemDungDangKyVietTrungLocalService _qlvtDiemDungDangKyVietTrungLocalService;
}