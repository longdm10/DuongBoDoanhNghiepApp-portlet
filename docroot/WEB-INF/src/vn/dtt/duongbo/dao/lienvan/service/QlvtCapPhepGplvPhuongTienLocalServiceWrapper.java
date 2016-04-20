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

package vn.dtt.duongbo.dao.lienvan.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link QlvtCapPhepGplvPhuongTienLocalService}.
 *
 * @author NhanNc
 * @see QlvtCapPhepGplvPhuongTienLocalService
 * @generated
 */
public class QlvtCapPhepGplvPhuongTienLocalServiceWrapper
	implements QlvtCapPhepGplvPhuongTienLocalService,
		ServiceWrapper<QlvtCapPhepGplvPhuongTienLocalService> {
	public QlvtCapPhepGplvPhuongTienLocalServiceWrapper(
		QlvtCapPhepGplvPhuongTienLocalService qlvtCapPhepGplvPhuongTienLocalService) {
		_qlvtCapPhepGplvPhuongTienLocalService = qlvtCapPhepGplvPhuongTienLocalService;
	}

	/**
	* Adds the qlvt cap phep gplv phuong tien to the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtCapPhepGplvPhuongTien the qlvt cap phep gplv phuong tien
	* @return the qlvt cap phep gplv phuong tien that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvPhuongTien addQlvtCapPhepGplvPhuongTien(
		vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvPhuongTien qlvtCapPhepGplvPhuongTien)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtCapPhepGplvPhuongTienLocalService.addQlvtCapPhepGplvPhuongTien(qlvtCapPhepGplvPhuongTien);
	}

	/**
	* Creates a new qlvt cap phep gplv phuong tien with the primary key. Does not add the qlvt cap phep gplv phuong tien to the database.
	*
	* @param id the primary key for the new qlvt cap phep gplv phuong tien
	* @return the new qlvt cap phep gplv phuong tien
	*/
	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvPhuongTien createQlvtCapPhepGplvPhuongTien(
		long id) {
		return _qlvtCapPhepGplvPhuongTienLocalService.createQlvtCapPhepGplvPhuongTien(id);
	}

	/**
	* Deletes the qlvt cap phep gplv phuong tien with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt cap phep gplv phuong tien
	* @return the qlvt cap phep gplv phuong tien that was removed
	* @throws PortalException if a qlvt cap phep gplv phuong tien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvPhuongTien deleteQlvtCapPhepGplvPhuongTien(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtCapPhepGplvPhuongTienLocalService.deleteQlvtCapPhepGplvPhuongTien(id);
	}

	/**
	* Deletes the qlvt cap phep gplv phuong tien from the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtCapPhepGplvPhuongTien the qlvt cap phep gplv phuong tien
	* @return the qlvt cap phep gplv phuong tien that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvPhuongTien deleteQlvtCapPhepGplvPhuongTien(
		vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvPhuongTien qlvtCapPhepGplvPhuongTien)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtCapPhepGplvPhuongTienLocalService.deleteQlvtCapPhepGplvPhuongTien(qlvtCapPhepGplvPhuongTien);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _qlvtCapPhepGplvPhuongTienLocalService.dynamicQuery();
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
		return _qlvtCapPhepGplvPhuongTienLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGplvPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtCapPhepGplvPhuongTienLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGplvPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtCapPhepGplvPhuongTienLocalService.dynamicQuery(dynamicQuery,
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
		return _qlvtCapPhepGplvPhuongTienLocalService.dynamicQueryCount(dynamicQuery);
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
		return _qlvtCapPhepGplvPhuongTienLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvPhuongTien fetchQlvtCapPhepGplvPhuongTien(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtCapPhepGplvPhuongTienLocalService.fetchQlvtCapPhepGplvPhuongTien(id);
	}

	/**
	* Returns the qlvt cap phep gplv phuong tien with the primary key.
	*
	* @param id the primary key of the qlvt cap phep gplv phuong tien
	* @return the qlvt cap phep gplv phuong tien
	* @throws PortalException if a qlvt cap phep gplv phuong tien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvPhuongTien getQlvtCapPhepGplvPhuongTien(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtCapPhepGplvPhuongTienLocalService.getQlvtCapPhepGplvPhuongTien(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtCapPhepGplvPhuongTienLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the qlvt cap phep gplv phuong tiens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGplvPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt cap phep gplv phuong tiens
	* @param end the upper bound of the range of qlvt cap phep gplv phuong tiens (not inclusive)
	* @return the range of qlvt cap phep gplv phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvPhuongTien> getQlvtCapPhepGplvPhuongTiens(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtCapPhepGplvPhuongTienLocalService.getQlvtCapPhepGplvPhuongTiens(start,
			end);
	}

	/**
	* Returns the number of qlvt cap phep gplv phuong tiens.
	*
	* @return the number of qlvt cap phep gplv phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getQlvtCapPhepGplvPhuongTiensCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtCapPhepGplvPhuongTienLocalService.getQlvtCapPhepGplvPhuongTiensCount();
	}

	/**
	* Updates the qlvt cap phep gplv phuong tien in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param qlvtCapPhepGplvPhuongTien the qlvt cap phep gplv phuong tien
	* @return the qlvt cap phep gplv phuong tien that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvPhuongTien updateQlvtCapPhepGplvPhuongTien(
		vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvPhuongTien qlvtCapPhepGplvPhuongTien)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtCapPhepGplvPhuongTienLocalService.updateQlvtCapPhepGplvPhuongTien(qlvtCapPhepGplvPhuongTien);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _qlvtCapPhepGplvPhuongTienLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_qlvtCapPhepGplvPhuongTienLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _qlvtCapPhepGplvPhuongTienLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public QlvtCapPhepGplvPhuongTienLocalService getWrappedQlvtCapPhepGplvPhuongTienLocalService() {
		return _qlvtCapPhepGplvPhuongTienLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedQlvtCapPhepGplvPhuongTienLocalService(
		QlvtCapPhepGplvPhuongTienLocalService qlvtCapPhepGplvPhuongTienLocalService) {
		_qlvtCapPhepGplvPhuongTienLocalService = qlvtCapPhepGplvPhuongTienLocalService;
	}

	@Override
	public QlvtCapPhepGplvPhuongTienLocalService getWrappedService() {
		return _qlvtCapPhepGplvPhuongTienLocalService;
	}

	@Override
	public void setWrappedService(
		QlvtCapPhepGplvPhuongTienLocalService qlvtCapPhepGplvPhuongTienLocalService) {
		_qlvtCapPhepGplvPhuongTienLocalService = qlvtCapPhepGplvPhuongTienLocalService;
	}

	private QlvtCapPhepGplvPhuongTienLocalService _qlvtCapPhepGplvPhuongTienLocalService;
}