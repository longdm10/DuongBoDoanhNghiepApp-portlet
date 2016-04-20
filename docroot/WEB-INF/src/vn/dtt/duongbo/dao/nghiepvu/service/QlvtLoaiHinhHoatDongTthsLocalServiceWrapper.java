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
 * Provides a wrapper for {@link QlvtLoaiHinhHoatDongTthsLocalService}.
 *
 * @author NhanNc
 * @see QlvtLoaiHinhHoatDongTthsLocalService
 * @generated
 */
public class QlvtLoaiHinhHoatDongTthsLocalServiceWrapper
	implements QlvtLoaiHinhHoatDongTthsLocalService,
		ServiceWrapper<QlvtLoaiHinhHoatDongTthsLocalService> {
	public QlvtLoaiHinhHoatDongTthsLocalServiceWrapper(
		QlvtLoaiHinhHoatDongTthsLocalService qlvtLoaiHinhHoatDongTthsLocalService) {
		_qlvtLoaiHinhHoatDongTthsLocalService = qlvtLoaiHinhHoatDongTthsLocalService;
	}

	/**
	* Adds the qlvt loai hinh hoat dong tths to the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtLoaiHinhHoatDongTths the qlvt loai hinh hoat dong tths
	* @return the qlvt loai hinh hoat dong tths that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths addQlvtLoaiHinhHoatDongTths(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths qlvtLoaiHinhHoatDongTths)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtLoaiHinhHoatDongTthsLocalService.addQlvtLoaiHinhHoatDongTths(qlvtLoaiHinhHoatDongTths);
	}

	/**
	* Creates a new qlvt loai hinh hoat dong tths with the primary key. Does not add the qlvt loai hinh hoat dong tths to the database.
	*
	* @param id the primary key for the new qlvt loai hinh hoat dong tths
	* @return the new qlvt loai hinh hoat dong tths
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths createQlvtLoaiHinhHoatDongTths(
		long id) {
		return _qlvtLoaiHinhHoatDongTthsLocalService.createQlvtLoaiHinhHoatDongTths(id);
	}

	/**
	* Deletes the qlvt loai hinh hoat dong tths with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt loai hinh hoat dong tths
	* @return the qlvt loai hinh hoat dong tths that was removed
	* @throws PortalException if a qlvt loai hinh hoat dong tths with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths deleteQlvtLoaiHinhHoatDongTths(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtLoaiHinhHoatDongTthsLocalService.deleteQlvtLoaiHinhHoatDongTths(id);
	}

	/**
	* Deletes the qlvt loai hinh hoat dong tths from the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtLoaiHinhHoatDongTths the qlvt loai hinh hoat dong tths
	* @return the qlvt loai hinh hoat dong tths that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths deleteQlvtLoaiHinhHoatDongTths(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths qlvtLoaiHinhHoatDongTths)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtLoaiHinhHoatDongTthsLocalService.deleteQlvtLoaiHinhHoatDongTths(qlvtLoaiHinhHoatDongTths);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _qlvtLoaiHinhHoatDongTthsLocalService.dynamicQuery();
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
		return _qlvtLoaiHinhHoatDongTthsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtLoaiHinhHoatDongTthsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtLoaiHinhHoatDongTthsLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtLoaiHinhHoatDongTthsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtLoaiHinhHoatDongTthsLocalService.dynamicQuery(dynamicQuery,
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
		return _qlvtLoaiHinhHoatDongTthsLocalService.dynamicQueryCount(dynamicQuery);
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
		return _qlvtLoaiHinhHoatDongTthsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths fetchQlvtLoaiHinhHoatDongTths(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtLoaiHinhHoatDongTthsLocalService.fetchQlvtLoaiHinhHoatDongTths(id);
	}

	/**
	* Returns the qlvt loai hinh hoat dong tths with the primary key.
	*
	* @param id the primary key of the qlvt loai hinh hoat dong tths
	* @return the qlvt loai hinh hoat dong tths
	* @throws PortalException if a qlvt loai hinh hoat dong tths with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths getQlvtLoaiHinhHoatDongTths(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtLoaiHinhHoatDongTthsLocalService.getQlvtLoaiHinhHoatDongTths(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtLoaiHinhHoatDongTthsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the qlvt loai hinh hoat dong tthses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtLoaiHinhHoatDongTthsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt loai hinh hoat dong tthses
	* @param end the upper bound of the range of qlvt loai hinh hoat dong tthses (not inclusive)
	* @return the range of qlvt loai hinh hoat dong tthses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths> getQlvtLoaiHinhHoatDongTthses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtLoaiHinhHoatDongTthsLocalService.getQlvtLoaiHinhHoatDongTthses(start,
			end);
	}

	/**
	* Returns the number of qlvt loai hinh hoat dong tthses.
	*
	* @return the number of qlvt loai hinh hoat dong tthses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getQlvtLoaiHinhHoatDongTthsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtLoaiHinhHoatDongTthsLocalService.getQlvtLoaiHinhHoatDongTthsesCount();
	}

	/**
	* Updates the qlvt loai hinh hoat dong tths in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param qlvtLoaiHinhHoatDongTths the qlvt loai hinh hoat dong tths
	* @return the qlvt loai hinh hoat dong tths that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths updateQlvtLoaiHinhHoatDongTths(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths qlvtLoaiHinhHoatDongTths)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtLoaiHinhHoatDongTthsLocalService.updateQlvtLoaiHinhHoatDongTths(qlvtLoaiHinhHoatDongTths);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _qlvtLoaiHinhHoatDongTthsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_qlvtLoaiHinhHoatDongTthsLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _qlvtLoaiHinhHoatDongTthsLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths> findByThongTinHoSoId(
		long thongTinHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtLoaiHinhHoatDongTthsLocalService.findByThongTinHoSoId(thongTinHoSoId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public QlvtLoaiHinhHoatDongTthsLocalService getWrappedQlvtLoaiHinhHoatDongTthsLocalService() {
		return _qlvtLoaiHinhHoatDongTthsLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedQlvtLoaiHinhHoatDongTthsLocalService(
		QlvtLoaiHinhHoatDongTthsLocalService qlvtLoaiHinhHoatDongTthsLocalService) {
		_qlvtLoaiHinhHoatDongTthsLocalService = qlvtLoaiHinhHoatDongTthsLocalService;
	}

	@Override
	public QlvtLoaiHinhHoatDongTthsLocalService getWrappedService() {
		return _qlvtLoaiHinhHoatDongTthsLocalService;
	}

	@Override
	public void setWrappedService(
		QlvtLoaiHinhHoatDongTthsLocalService qlvtLoaiHinhHoatDongTthsLocalService) {
		_qlvtLoaiHinhHoatDongTthsLocalService = qlvtLoaiHinhHoatDongTthsLocalService;
	}

	private QlvtLoaiHinhHoatDongTthsLocalService _qlvtLoaiHinhHoatDongTthsLocalService;
}