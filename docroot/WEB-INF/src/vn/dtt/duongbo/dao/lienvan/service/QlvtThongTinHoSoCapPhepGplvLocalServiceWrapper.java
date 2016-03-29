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
 * Provides a wrapper for {@link QlvtThongTinHoSoCapPhepGplvLocalService}.
 *
 * @author NhanNc
 * @see QlvtThongTinHoSoCapPhepGplvLocalService
 * @generated
 */
public class QlvtThongTinHoSoCapPhepGplvLocalServiceWrapper
	implements QlvtThongTinHoSoCapPhepGplvLocalService,
		ServiceWrapper<QlvtThongTinHoSoCapPhepGplvLocalService> {
	public QlvtThongTinHoSoCapPhepGplvLocalServiceWrapper(
		QlvtThongTinHoSoCapPhepGplvLocalService qlvtThongTinHoSoCapPhepGplvLocalService) {
		_qlvtThongTinHoSoCapPhepGplvLocalService = qlvtThongTinHoSoCapPhepGplvLocalService;
	}

	/**
	* Adds the qlvt thong tin ho so cap phep gplv to the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtThongTinHoSoCapPhepGplv the qlvt thong tin ho so cap phep gplv
	* @return the qlvt thong tin ho so cap phep gplv that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoCapPhepGplv addQlvtThongTinHoSoCapPhepGplv(
		vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoCapPhepGplv qlvtThongTinHoSoCapPhepGplv)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinHoSoCapPhepGplvLocalService.addQlvtThongTinHoSoCapPhepGplv(qlvtThongTinHoSoCapPhepGplv);
	}

	/**
	* Creates a new qlvt thong tin ho so cap phep gplv with the primary key. Does not add the qlvt thong tin ho so cap phep gplv to the database.
	*
	* @param id the primary key for the new qlvt thong tin ho so cap phep gplv
	* @return the new qlvt thong tin ho so cap phep gplv
	*/
	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoCapPhepGplv createQlvtThongTinHoSoCapPhepGplv(
		long id) {
		return _qlvtThongTinHoSoCapPhepGplvLocalService.createQlvtThongTinHoSoCapPhepGplv(id);
	}

	/**
	* Deletes the qlvt thong tin ho so cap phep gplv with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt thong tin ho so cap phep gplv
	* @return the qlvt thong tin ho so cap phep gplv that was removed
	* @throws PortalException if a qlvt thong tin ho so cap phep gplv with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoCapPhepGplv deleteQlvtThongTinHoSoCapPhepGplv(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinHoSoCapPhepGplvLocalService.deleteQlvtThongTinHoSoCapPhepGplv(id);
	}

	/**
	* Deletes the qlvt thong tin ho so cap phep gplv from the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtThongTinHoSoCapPhepGplv the qlvt thong tin ho so cap phep gplv
	* @return the qlvt thong tin ho so cap phep gplv that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoCapPhepGplv deleteQlvtThongTinHoSoCapPhepGplv(
		vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoCapPhepGplv qlvtThongTinHoSoCapPhepGplv)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinHoSoCapPhepGplvLocalService.deleteQlvtThongTinHoSoCapPhepGplv(qlvtThongTinHoSoCapPhepGplv);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _qlvtThongTinHoSoCapPhepGplvLocalService.dynamicQuery();
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
		return _qlvtThongTinHoSoCapPhepGplvLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtThongTinHoSoCapPhepGplvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtThongTinHoSoCapPhepGplvLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtThongTinHoSoCapPhepGplvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtThongTinHoSoCapPhepGplvLocalService.dynamicQuery(dynamicQuery,
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
		return _qlvtThongTinHoSoCapPhepGplvLocalService.dynamicQueryCount(dynamicQuery);
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
		return _qlvtThongTinHoSoCapPhepGplvLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoCapPhepGplv fetchQlvtThongTinHoSoCapPhepGplv(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinHoSoCapPhepGplvLocalService.fetchQlvtThongTinHoSoCapPhepGplv(id);
	}

	/**
	* Returns the qlvt thong tin ho so cap phep gplv with the primary key.
	*
	* @param id the primary key of the qlvt thong tin ho so cap phep gplv
	* @return the qlvt thong tin ho so cap phep gplv
	* @throws PortalException if a qlvt thong tin ho so cap phep gplv with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoCapPhepGplv getQlvtThongTinHoSoCapPhepGplv(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinHoSoCapPhepGplvLocalService.getQlvtThongTinHoSoCapPhepGplv(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinHoSoCapPhepGplvLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the qlvt thong tin ho so cap phep gplvs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtThongTinHoSoCapPhepGplvModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt thong tin ho so cap phep gplvs
	* @param end the upper bound of the range of qlvt thong tin ho so cap phep gplvs (not inclusive)
	* @return the range of qlvt thong tin ho so cap phep gplvs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoCapPhepGplv> getQlvtThongTinHoSoCapPhepGplvs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinHoSoCapPhepGplvLocalService.getQlvtThongTinHoSoCapPhepGplvs(start,
			end);
	}

	/**
	* Returns the number of qlvt thong tin ho so cap phep gplvs.
	*
	* @return the number of qlvt thong tin ho so cap phep gplvs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getQlvtThongTinHoSoCapPhepGplvsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinHoSoCapPhepGplvLocalService.getQlvtThongTinHoSoCapPhepGplvsCount();
	}

	/**
	* Updates the qlvt thong tin ho so cap phep gplv in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param qlvtThongTinHoSoCapPhepGplv the qlvt thong tin ho so cap phep gplv
	* @return the qlvt thong tin ho so cap phep gplv that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoCapPhepGplv updateQlvtThongTinHoSoCapPhepGplv(
		vn.dtt.duongbo.dao.lienvan.model.QlvtThongTinHoSoCapPhepGplv qlvtThongTinHoSoCapPhepGplv)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinHoSoCapPhepGplvLocalService.updateQlvtThongTinHoSoCapPhepGplv(qlvtThongTinHoSoCapPhepGplv);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _qlvtThongTinHoSoCapPhepGplvLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_qlvtThongTinHoSoCapPhepGplvLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _qlvtThongTinHoSoCapPhepGplvLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public QlvtThongTinHoSoCapPhepGplvLocalService getWrappedQlvtThongTinHoSoCapPhepGplvLocalService() {
		return _qlvtThongTinHoSoCapPhepGplvLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedQlvtThongTinHoSoCapPhepGplvLocalService(
		QlvtThongTinHoSoCapPhepGplvLocalService qlvtThongTinHoSoCapPhepGplvLocalService) {
		_qlvtThongTinHoSoCapPhepGplvLocalService = qlvtThongTinHoSoCapPhepGplvLocalService;
	}

	@Override
	public QlvtThongTinHoSoCapPhepGplvLocalService getWrappedService() {
		return _qlvtThongTinHoSoCapPhepGplvLocalService;
	}

	@Override
	public void setWrappedService(
		QlvtThongTinHoSoCapPhepGplvLocalService qlvtThongTinHoSoCapPhepGplvLocalService) {
		_qlvtThongTinHoSoCapPhepGplvLocalService = qlvtThongTinHoSoCapPhepGplvLocalService;
	}

	private QlvtThongTinHoSoCapPhepGplvLocalService _qlvtThongTinHoSoCapPhepGplvLocalService;
}