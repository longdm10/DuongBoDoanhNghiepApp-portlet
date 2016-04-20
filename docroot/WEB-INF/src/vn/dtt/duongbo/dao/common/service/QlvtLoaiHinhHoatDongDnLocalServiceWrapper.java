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
 * Provides a wrapper for {@link QlvtLoaiHinhHoatDongDnLocalService}.
 *
 * @author win_64
 * @see QlvtLoaiHinhHoatDongDnLocalService
 * @generated
 */
public class QlvtLoaiHinhHoatDongDnLocalServiceWrapper
	implements QlvtLoaiHinhHoatDongDnLocalService,
		ServiceWrapper<QlvtLoaiHinhHoatDongDnLocalService> {
	public QlvtLoaiHinhHoatDongDnLocalServiceWrapper(
		QlvtLoaiHinhHoatDongDnLocalService qlvtLoaiHinhHoatDongDnLocalService) {
		_qlvtLoaiHinhHoatDongDnLocalService = qlvtLoaiHinhHoatDongDnLocalService;
	}

	/**
	* Adds the qlvt loai hinh hoat dong dn to the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtLoaiHinhHoatDongDn the qlvt loai hinh hoat dong dn
	* @return the qlvt loai hinh hoat dong dn that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn addQlvtLoaiHinhHoatDongDn(
		vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn qlvtLoaiHinhHoatDongDn)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtLoaiHinhHoatDongDnLocalService.addQlvtLoaiHinhHoatDongDn(qlvtLoaiHinhHoatDongDn);
	}

	/**
	* Creates a new qlvt loai hinh hoat dong dn with the primary key. Does not add the qlvt loai hinh hoat dong dn to the database.
	*
	* @param id the primary key for the new qlvt loai hinh hoat dong dn
	* @return the new qlvt loai hinh hoat dong dn
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn createQlvtLoaiHinhHoatDongDn(
		long id) {
		return _qlvtLoaiHinhHoatDongDnLocalService.createQlvtLoaiHinhHoatDongDn(id);
	}

	/**
	* Deletes the qlvt loai hinh hoat dong dn with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt loai hinh hoat dong dn
	* @return the qlvt loai hinh hoat dong dn that was removed
	* @throws PortalException if a qlvt loai hinh hoat dong dn with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn deleteQlvtLoaiHinhHoatDongDn(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtLoaiHinhHoatDongDnLocalService.deleteQlvtLoaiHinhHoatDongDn(id);
	}

	/**
	* Deletes the qlvt loai hinh hoat dong dn from the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtLoaiHinhHoatDongDn the qlvt loai hinh hoat dong dn
	* @return the qlvt loai hinh hoat dong dn that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn deleteQlvtLoaiHinhHoatDongDn(
		vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn qlvtLoaiHinhHoatDongDn)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtLoaiHinhHoatDongDnLocalService.deleteQlvtLoaiHinhHoatDongDn(qlvtLoaiHinhHoatDongDn);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _qlvtLoaiHinhHoatDongDnLocalService.dynamicQuery();
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
		return _qlvtLoaiHinhHoatDongDnLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtLoaiHinhHoatDongDnModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtLoaiHinhHoatDongDnLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtLoaiHinhHoatDongDnModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtLoaiHinhHoatDongDnLocalService.dynamicQuery(dynamicQuery,
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
		return _qlvtLoaiHinhHoatDongDnLocalService.dynamicQueryCount(dynamicQuery);
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
		return _qlvtLoaiHinhHoatDongDnLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn fetchQlvtLoaiHinhHoatDongDn(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtLoaiHinhHoatDongDnLocalService.fetchQlvtLoaiHinhHoatDongDn(id);
	}

	/**
	* Returns the qlvt loai hinh hoat dong dn with the primary key.
	*
	* @param id the primary key of the qlvt loai hinh hoat dong dn
	* @return the qlvt loai hinh hoat dong dn
	* @throws PortalException if a qlvt loai hinh hoat dong dn with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn getQlvtLoaiHinhHoatDongDn(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtLoaiHinhHoatDongDnLocalService.getQlvtLoaiHinhHoatDongDn(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtLoaiHinhHoatDongDnLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the qlvt loai hinh hoat dong dns.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtLoaiHinhHoatDongDnModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt loai hinh hoat dong dns
	* @param end the upper bound of the range of qlvt loai hinh hoat dong dns (not inclusive)
	* @return the range of qlvt loai hinh hoat dong dns
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn> getQlvtLoaiHinhHoatDongDns(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtLoaiHinhHoatDongDnLocalService.getQlvtLoaiHinhHoatDongDns(start,
			end);
	}

	/**
	* Returns the number of qlvt loai hinh hoat dong dns.
	*
	* @return the number of qlvt loai hinh hoat dong dns
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getQlvtLoaiHinhHoatDongDnsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtLoaiHinhHoatDongDnLocalService.getQlvtLoaiHinhHoatDongDnsCount();
	}

	/**
	* Updates the qlvt loai hinh hoat dong dn in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param qlvtLoaiHinhHoatDongDn the qlvt loai hinh hoat dong dn
	* @return the qlvt loai hinh hoat dong dn that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn updateQlvtLoaiHinhHoatDongDn(
		vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn qlvtLoaiHinhHoatDongDn)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtLoaiHinhHoatDongDnLocalService.updateQlvtLoaiHinhHoatDongDn(qlvtLoaiHinhHoatDongDn);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _qlvtLoaiHinhHoatDongDnLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_qlvtLoaiHinhHoatDongDnLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _qlvtLoaiHinhHoatDongDnLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn getByHoSoThuTucIdAndMaLhhd(
		long hoSoThuTucId, java.lang.String maLoaiHinhHoatDong)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchQlvtLoaiHinhHoatDongDnException {
		return _qlvtLoaiHinhHoatDongDnLocalService.getByHoSoThuTucIdAndMaLhhd(hoSoThuTucId,
			maLoaiHinhHoatDong);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.common.model.QlvtLoaiHinhHoatDongDn> findByNoiDungHoSoId(
		long noiDungHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchQlvtLoaiHinhHoatDongDnException {
		return _qlvtLoaiHinhHoatDongDnLocalService.findByNoiDungHoSoId(noiDungHoSoId);
	}

	@Override
	public java.util.List<java.lang.Long> findIdNoiDungHoSoId(
		long noiDungHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtLoaiHinhHoatDongDnLocalService.findIdNoiDungHoSoId(noiDungHoSoId);
	}

	@Override
	public boolean deleteAllByNoiDungHoSoId(long noiDungHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtLoaiHinhHoatDongDnLocalService.deleteAllByNoiDungHoSoId(noiDungHoSoId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public QlvtLoaiHinhHoatDongDnLocalService getWrappedQlvtLoaiHinhHoatDongDnLocalService() {
		return _qlvtLoaiHinhHoatDongDnLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedQlvtLoaiHinhHoatDongDnLocalService(
		QlvtLoaiHinhHoatDongDnLocalService qlvtLoaiHinhHoatDongDnLocalService) {
		_qlvtLoaiHinhHoatDongDnLocalService = qlvtLoaiHinhHoatDongDnLocalService;
	}

	@Override
	public QlvtLoaiHinhHoatDongDnLocalService getWrappedService() {
		return _qlvtLoaiHinhHoatDongDnLocalService;
	}

	@Override
	public void setWrappedService(
		QlvtLoaiHinhHoatDongDnLocalService qlvtLoaiHinhHoatDongDnLocalService) {
		_qlvtLoaiHinhHoatDongDnLocalService = qlvtLoaiHinhHoatDongDnLocalService;
	}

	private QlvtLoaiHinhHoatDongDnLocalService _qlvtLoaiHinhHoatDongDnLocalService;
}