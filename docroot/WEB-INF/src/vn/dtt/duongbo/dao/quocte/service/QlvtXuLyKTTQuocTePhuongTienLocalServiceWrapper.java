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
 * Provides a wrapper for {@link QlvtXuLyKTTQuocTePhuongTienLocalService}.
 *
 * @author NoiPham
 * @see QlvtXuLyKTTQuocTePhuongTienLocalService
 * @generated
 */
public class QlvtXuLyKTTQuocTePhuongTienLocalServiceWrapper
	implements QlvtXuLyKTTQuocTePhuongTienLocalService,
		ServiceWrapper<QlvtXuLyKTTQuocTePhuongTienLocalService> {
	public QlvtXuLyKTTQuocTePhuongTienLocalServiceWrapper(
		QlvtXuLyKTTQuocTePhuongTienLocalService qlvtXuLyKTTQuocTePhuongTienLocalService) {
		_qlvtXuLyKTTQuocTePhuongTienLocalService = qlvtXuLyKTTQuocTePhuongTienLocalService;
	}

	/**
	* Adds the qlvt xu ly k t t quoc te phuong tien to the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtXuLyKTTQuocTePhuongTien the qlvt xu ly k t t quoc te phuong tien
	* @return the qlvt xu ly k t t quoc te phuong tien that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien addQlvtXuLyKTTQuocTePhuongTien(
		vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyKTTQuocTePhuongTienLocalService.addQlvtXuLyKTTQuocTePhuongTien(qlvtXuLyKTTQuocTePhuongTien);
	}

	/**
	* Creates a new qlvt xu ly k t t quoc te phuong tien with the primary key. Does not add the qlvt xu ly k t t quoc te phuong tien to the database.
	*
	* @param id the primary key for the new qlvt xu ly k t t quoc te phuong tien
	* @return the new qlvt xu ly k t t quoc te phuong tien
	*/
	@Override
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien createQlvtXuLyKTTQuocTePhuongTien(
		long id) {
		return _qlvtXuLyKTTQuocTePhuongTienLocalService.createQlvtXuLyKTTQuocTePhuongTien(id);
	}

	/**
	* Deletes the qlvt xu ly k t t quoc te phuong tien with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt xu ly k t t quoc te phuong tien
	* @return the qlvt xu ly k t t quoc te phuong tien that was removed
	* @throws PortalException if a qlvt xu ly k t t quoc te phuong tien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien deleteQlvtXuLyKTTQuocTePhuongTien(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyKTTQuocTePhuongTienLocalService.deleteQlvtXuLyKTTQuocTePhuongTien(id);
	}

	/**
	* Deletes the qlvt xu ly k t t quoc te phuong tien from the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtXuLyKTTQuocTePhuongTien the qlvt xu ly k t t quoc te phuong tien
	* @return the qlvt xu ly k t t quoc te phuong tien that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien deleteQlvtXuLyKTTQuocTePhuongTien(
		vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyKTTQuocTePhuongTienLocalService.deleteQlvtXuLyKTTQuocTePhuongTien(qlvtXuLyKTTQuocTePhuongTien);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _qlvtXuLyKTTQuocTePhuongTienLocalService.dynamicQuery();
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
		return _qlvtXuLyKTTQuocTePhuongTienLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTePhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtXuLyKTTQuocTePhuongTienLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTePhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtXuLyKTTQuocTePhuongTienLocalService.dynamicQuery(dynamicQuery,
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
		return _qlvtXuLyKTTQuocTePhuongTienLocalService.dynamicQueryCount(dynamicQuery);
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
		return _qlvtXuLyKTTQuocTePhuongTienLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien fetchQlvtXuLyKTTQuocTePhuongTien(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyKTTQuocTePhuongTienLocalService.fetchQlvtXuLyKTTQuocTePhuongTien(id);
	}

	/**
	* Returns the qlvt xu ly k t t quoc te phuong tien with the primary key.
	*
	* @param id the primary key of the qlvt xu ly k t t quoc te phuong tien
	* @return the qlvt xu ly k t t quoc te phuong tien
	* @throws PortalException if a qlvt xu ly k t t quoc te phuong tien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien getQlvtXuLyKTTQuocTePhuongTien(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyKTTQuocTePhuongTienLocalService.getQlvtXuLyKTTQuocTePhuongTien(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyKTTQuocTePhuongTienLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the qlvt xu ly k t t quoc te phuong tiens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTePhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt xu ly k t t quoc te phuong tiens
	* @param end the upper bound of the range of qlvt xu ly k t t quoc te phuong tiens (not inclusive)
	* @return the range of qlvt xu ly k t t quoc te phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien> getQlvtXuLyKTTQuocTePhuongTiens(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyKTTQuocTePhuongTienLocalService.getQlvtXuLyKTTQuocTePhuongTiens(start,
			end);
	}

	/**
	* Returns the number of qlvt xu ly k t t quoc te phuong tiens.
	*
	* @return the number of qlvt xu ly k t t quoc te phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getQlvtXuLyKTTQuocTePhuongTiensCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyKTTQuocTePhuongTienLocalService.getQlvtXuLyKTTQuocTePhuongTiensCount();
	}

	/**
	* Updates the qlvt xu ly k t t quoc te phuong tien in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param qlvtXuLyKTTQuocTePhuongTien the qlvt xu ly k t t quoc te phuong tien
	* @return the qlvt xu ly k t t quoc te phuong tien that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien updateQlvtXuLyKTTQuocTePhuongTien(
		vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyKTTQuocTePhuongTienLocalService.updateQlvtXuLyKTTQuocTePhuongTien(qlvtXuLyKTTQuocTePhuongTien);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _qlvtXuLyKTTQuocTePhuongTienLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_qlvtXuLyKTTQuocTePhuongTienLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _qlvtXuLyKTTQuocTePhuongTienLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien> findBycapPhepKTTQuocTeID(
		long capPhepKTTQuocTeID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyKTTQuocTePhuongTienLocalService.findBycapPhepKTTQuocTeID(capPhepKTTQuocTeID);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public QlvtXuLyKTTQuocTePhuongTienLocalService getWrappedQlvtXuLyKTTQuocTePhuongTienLocalService() {
		return _qlvtXuLyKTTQuocTePhuongTienLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedQlvtXuLyKTTQuocTePhuongTienLocalService(
		QlvtXuLyKTTQuocTePhuongTienLocalService qlvtXuLyKTTQuocTePhuongTienLocalService) {
		_qlvtXuLyKTTQuocTePhuongTienLocalService = qlvtXuLyKTTQuocTePhuongTienLocalService;
	}

	@Override
	public QlvtXuLyKTTQuocTePhuongTienLocalService getWrappedService() {
		return _qlvtXuLyKTTQuocTePhuongTienLocalService;
	}

	@Override
	public void setWrappedService(
		QlvtXuLyKTTQuocTePhuongTienLocalService qlvtXuLyKTTQuocTePhuongTienLocalService) {
		_qlvtXuLyKTTQuocTePhuongTienLocalService = qlvtXuLyKTTQuocTePhuongTienLocalService;
	}

	private QlvtXuLyKTTQuocTePhuongTienLocalService _qlvtXuLyKTTQuocTePhuongTienLocalService;
}