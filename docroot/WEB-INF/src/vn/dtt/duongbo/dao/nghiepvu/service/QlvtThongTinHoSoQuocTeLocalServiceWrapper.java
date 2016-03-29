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
 * Provides a wrapper for {@link QlvtThongTinHoSoQuocTeLocalService}.
 *
 * @author NhanNc
 * @see QlvtThongTinHoSoQuocTeLocalService
 * @generated
 */
public class QlvtThongTinHoSoQuocTeLocalServiceWrapper
	implements QlvtThongTinHoSoQuocTeLocalService,
		ServiceWrapper<QlvtThongTinHoSoQuocTeLocalService> {
	public QlvtThongTinHoSoQuocTeLocalServiceWrapper(
		QlvtThongTinHoSoQuocTeLocalService qlvtThongTinHoSoQuocTeLocalService) {
		_qlvtThongTinHoSoQuocTeLocalService = qlvtThongTinHoSoQuocTeLocalService;
	}

	/**
	* Adds the qlvt thong tin ho so quoc te to the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtThongTinHoSoQuocTe the qlvt thong tin ho so quoc te
	* @return the qlvt thong tin ho so quoc te that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoQuocTe addQlvtThongTinHoSoQuocTe(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoQuocTe qlvtThongTinHoSoQuocTe)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinHoSoQuocTeLocalService.addQlvtThongTinHoSoQuocTe(qlvtThongTinHoSoQuocTe);
	}

	/**
	* Creates a new qlvt thong tin ho so quoc te with the primary key. Does not add the qlvt thong tin ho so quoc te to the database.
	*
	* @param id the primary key for the new qlvt thong tin ho so quoc te
	* @return the new qlvt thong tin ho so quoc te
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoQuocTe createQlvtThongTinHoSoQuocTe(
		long id) {
		return _qlvtThongTinHoSoQuocTeLocalService.createQlvtThongTinHoSoQuocTe(id);
	}

	/**
	* Deletes the qlvt thong tin ho so quoc te with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt thong tin ho so quoc te
	* @return the qlvt thong tin ho so quoc te that was removed
	* @throws PortalException if a qlvt thong tin ho so quoc te with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoQuocTe deleteQlvtThongTinHoSoQuocTe(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinHoSoQuocTeLocalService.deleteQlvtThongTinHoSoQuocTe(id);
	}

	/**
	* Deletes the qlvt thong tin ho so quoc te from the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtThongTinHoSoQuocTe the qlvt thong tin ho so quoc te
	* @return the qlvt thong tin ho so quoc te that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoQuocTe deleteQlvtThongTinHoSoQuocTe(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoQuocTe qlvtThongTinHoSoQuocTe)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinHoSoQuocTeLocalService.deleteQlvtThongTinHoSoQuocTe(qlvtThongTinHoSoQuocTe);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _qlvtThongTinHoSoQuocTeLocalService.dynamicQuery();
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
		return _qlvtThongTinHoSoQuocTeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinHoSoQuocTeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtThongTinHoSoQuocTeLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinHoSoQuocTeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtThongTinHoSoQuocTeLocalService.dynamicQuery(dynamicQuery,
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
		return _qlvtThongTinHoSoQuocTeLocalService.dynamicQueryCount(dynamicQuery);
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
		return _qlvtThongTinHoSoQuocTeLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoQuocTe fetchQlvtThongTinHoSoQuocTe(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinHoSoQuocTeLocalService.fetchQlvtThongTinHoSoQuocTe(id);
	}

	/**
	* Returns the qlvt thong tin ho so quoc te with the primary key.
	*
	* @param id the primary key of the qlvt thong tin ho so quoc te
	* @return the qlvt thong tin ho so quoc te
	* @throws PortalException if a qlvt thong tin ho so quoc te with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoQuocTe getQlvtThongTinHoSoQuocTe(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinHoSoQuocTeLocalService.getQlvtThongTinHoSoQuocTe(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinHoSoQuocTeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the qlvt thong tin ho so quoc tes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinHoSoQuocTeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt thong tin ho so quoc tes
	* @param end the upper bound of the range of qlvt thong tin ho so quoc tes (not inclusive)
	* @return the range of qlvt thong tin ho so quoc tes
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoQuocTe> getQlvtThongTinHoSoQuocTes(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinHoSoQuocTeLocalService.getQlvtThongTinHoSoQuocTes(start,
			end);
	}

	/**
	* Returns the number of qlvt thong tin ho so quoc tes.
	*
	* @return the number of qlvt thong tin ho so quoc tes
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getQlvtThongTinHoSoQuocTesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinHoSoQuocTeLocalService.getQlvtThongTinHoSoQuocTesCount();
	}

	/**
	* Updates the qlvt thong tin ho so quoc te in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param qlvtThongTinHoSoQuocTe the qlvt thong tin ho so quoc te
	* @return the qlvt thong tin ho so quoc te that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoQuocTe updateQlvtThongTinHoSoQuocTe(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoQuocTe qlvtThongTinHoSoQuocTe)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinHoSoQuocTeLocalService.updateQlvtThongTinHoSoQuocTe(qlvtThongTinHoSoQuocTe);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _qlvtThongTinHoSoQuocTeLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_qlvtThongTinHoSoQuocTeLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _qlvtThongTinHoSoQuocTeLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public QlvtThongTinHoSoQuocTeLocalService getWrappedQlvtThongTinHoSoQuocTeLocalService() {
		return _qlvtThongTinHoSoQuocTeLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedQlvtThongTinHoSoQuocTeLocalService(
		QlvtThongTinHoSoQuocTeLocalService qlvtThongTinHoSoQuocTeLocalService) {
		_qlvtThongTinHoSoQuocTeLocalService = qlvtThongTinHoSoQuocTeLocalService;
	}

	@Override
	public QlvtThongTinHoSoQuocTeLocalService getWrappedService() {
		return _qlvtThongTinHoSoQuocTeLocalService;
	}

	@Override
	public void setWrappedService(
		QlvtThongTinHoSoQuocTeLocalService qlvtThongTinHoSoQuocTeLocalService) {
		_qlvtThongTinHoSoQuocTeLocalService = qlvtThongTinHoSoQuocTeLocalService;
	}

	private QlvtThongTinHoSoQuocTeLocalService _qlvtThongTinHoSoQuocTeLocalService;
}