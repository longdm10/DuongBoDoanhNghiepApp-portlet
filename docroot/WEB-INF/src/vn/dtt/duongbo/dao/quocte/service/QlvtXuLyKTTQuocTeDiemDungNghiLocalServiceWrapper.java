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

package vn.dtt.duongbo.dao.quocte.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link QlvtXuLyKTTQuocTeDiemDungNghiLocalService}.
 *
 * @author NoiPham
 * @see QlvtXuLyKTTQuocTeDiemDungNghiLocalService
 * @generated
 */
public class QlvtXuLyKTTQuocTeDiemDungNghiLocalServiceWrapper
	implements QlvtXuLyKTTQuocTeDiemDungNghiLocalService,
		ServiceWrapper<QlvtXuLyKTTQuocTeDiemDungNghiLocalService> {
	public QlvtXuLyKTTQuocTeDiemDungNghiLocalServiceWrapper(
		QlvtXuLyKTTQuocTeDiemDungNghiLocalService qlvtXuLyKTTQuocTeDiemDungNghiLocalService) {
		_qlvtXuLyKTTQuocTeDiemDungNghiLocalService = qlvtXuLyKTTQuocTeDiemDungNghiLocalService;
	}

	/**
	* Adds the qlvt xu ly k t t quoc te diem dung nghi to the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtXuLyKTTQuocTeDiemDungNghi the qlvt xu ly k t t quoc te diem dung nghi
	* @return the qlvt xu ly k t t quoc te diem dung nghi that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeDiemDungNghi addQlvtXuLyKTTQuocTeDiemDungNghi(
		vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeDiemDungNghi qlvtXuLyKTTQuocTeDiemDungNghi)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyKTTQuocTeDiemDungNghiLocalService.addQlvtXuLyKTTQuocTeDiemDungNghi(qlvtXuLyKTTQuocTeDiemDungNghi);
	}

	/**
	* Creates a new qlvt xu ly k t t quoc te diem dung nghi with the primary key. Does not add the qlvt xu ly k t t quoc te diem dung nghi to the database.
	*
	* @param id the primary key for the new qlvt xu ly k t t quoc te diem dung nghi
	* @return the new qlvt xu ly k t t quoc te diem dung nghi
	*/
	@Override
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeDiemDungNghi createQlvtXuLyKTTQuocTeDiemDungNghi(
		long id) {
		return _qlvtXuLyKTTQuocTeDiemDungNghiLocalService.createQlvtXuLyKTTQuocTeDiemDungNghi(id);
	}

	/**
	* Deletes the qlvt xu ly k t t quoc te diem dung nghi with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt xu ly k t t quoc te diem dung nghi
	* @return the qlvt xu ly k t t quoc te diem dung nghi that was removed
	* @throws PortalException if a qlvt xu ly k t t quoc te diem dung nghi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeDiemDungNghi deleteQlvtXuLyKTTQuocTeDiemDungNghi(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyKTTQuocTeDiemDungNghiLocalService.deleteQlvtXuLyKTTQuocTeDiemDungNghi(id);
	}

	/**
	* Deletes the qlvt xu ly k t t quoc te diem dung nghi from the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtXuLyKTTQuocTeDiemDungNghi the qlvt xu ly k t t quoc te diem dung nghi
	* @return the qlvt xu ly k t t quoc te diem dung nghi that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeDiemDungNghi deleteQlvtXuLyKTTQuocTeDiemDungNghi(
		vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeDiemDungNghi qlvtXuLyKTTQuocTeDiemDungNghi)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyKTTQuocTeDiemDungNghiLocalService.deleteQlvtXuLyKTTQuocTeDiemDungNghi(qlvtXuLyKTTQuocTeDiemDungNghi);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _qlvtXuLyKTTQuocTeDiemDungNghiLocalService.dynamicQuery();
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
		return _qlvtXuLyKTTQuocTeDiemDungNghiLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTeDiemDungNghiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtXuLyKTTQuocTeDiemDungNghiLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTeDiemDungNghiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtXuLyKTTQuocTeDiemDungNghiLocalService.dynamicQuery(dynamicQuery,
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
		return _qlvtXuLyKTTQuocTeDiemDungNghiLocalService.dynamicQueryCount(dynamicQuery);
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
		return _qlvtXuLyKTTQuocTeDiemDungNghiLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeDiemDungNghi fetchQlvtXuLyKTTQuocTeDiemDungNghi(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyKTTQuocTeDiemDungNghiLocalService.fetchQlvtXuLyKTTQuocTeDiemDungNghi(id);
	}

	/**
	* Returns the qlvt xu ly k t t quoc te diem dung nghi with the primary key.
	*
	* @param id the primary key of the qlvt xu ly k t t quoc te diem dung nghi
	* @return the qlvt xu ly k t t quoc te diem dung nghi
	* @throws PortalException if a qlvt xu ly k t t quoc te diem dung nghi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeDiemDungNghi getQlvtXuLyKTTQuocTeDiemDungNghi(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyKTTQuocTeDiemDungNghiLocalService.getQlvtXuLyKTTQuocTeDiemDungNghi(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyKTTQuocTeDiemDungNghiLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the qlvt xu ly k t t quoc te diem dung nghis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTeDiemDungNghiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt xu ly k t t quoc te diem dung nghis
	* @param end the upper bound of the range of qlvt xu ly k t t quoc te diem dung nghis (not inclusive)
	* @return the range of qlvt xu ly k t t quoc te diem dung nghis
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeDiemDungNghi> getQlvtXuLyKTTQuocTeDiemDungNghis(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyKTTQuocTeDiemDungNghiLocalService.getQlvtXuLyKTTQuocTeDiemDungNghis(start,
			end);
	}

	/**
	* Returns the number of qlvt xu ly k t t quoc te diem dung nghis.
	*
	* @return the number of qlvt xu ly k t t quoc te diem dung nghis
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getQlvtXuLyKTTQuocTeDiemDungNghisCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyKTTQuocTeDiemDungNghiLocalService.getQlvtXuLyKTTQuocTeDiemDungNghisCount();
	}

	/**
	* Updates the qlvt xu ly k t t quoc te diem dung nghi in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param qlvtXuLyKTTQuocTeDiemDungNghi the qlvt xu ly k t t quoc te diem dung nghi
	* @return the qlvt xu ly k t t quoc te diem dung nghi that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeDiemDungNghi updateQlvtXuLyKTTQuocTeDiemDungNghi(
		vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeDiemDungNghi qlvtXuLyKTTQuocTeDiemDungNghi)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyKTTQuocTeDiemDungNghiLocalService.updateQlvtXuLyKTTQuocTeDiemDungNghi(qlvtXuLyKTTQuocTeDiemDungNghi);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _qlvtXuLyKTTQuocTeDiemDungNghiLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_qlvtXuLyKTTQuocTeDiemDungNghiLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _qlvtXuLyKTTQuocTeDiemDungNghiLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public QlvtXuLyKTTQuocTeDiemDungNghiLocalService getWrappedQlvtXuLyKTTQuocTeDiemDungNghiLocalService() {
		return _qlvtXuLyKTTQuocTeDiemDungNghiLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedQlvtXuLyKTTQuocTeDiemDungNghiLocalService(
		QlvtXuLyKTTQuocTeDiemDungNghiLocalService qlvtXuLyKTTQuocTeDiemDungNghiLocalService) {
		_qlvtXuLyKTTQuocTeDiemDungNghiLocalService = qlvtXuLyKTTQuocTeDiemDungNghiLocalService;
	}

	@Override
	public QlvtXuLyKTTQuocTeDiemDungNghiLocalService getWrappedService() {
		return _qlvtXuLyKTTQuocTeDiemDungNghiLocalService;
	}

	@Override
	public void setWrappedService(
		QlvtXuLyKTTQuocTeDiemDungNghiLocalService qlvtXuLyKTTQuocTeDiemDungNghiLocalService) {
		_qlvtXuLyKTTQuocTeDiemDungNghiLocalService = qlvtXuLyKTTQuocTeDiemDungNghiLocalService;
	}

	private QlvtXuLyKTTQuocTeDiemDungNghiLocalService _qlvtXuLyKTTQuocTeDiemDungNghiLocalService;
}