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
 * Provides a wrapper for {@link QlvtCapPhepGpkdvtDuongboQuocTeLocalService}.
 *
 * @author NhanNc
 * @see QlvtCapPhepGpkdvtDuongboQuocTeLocalService
 * @generated
 */
public class QlvtCapPhepGpkdvtDuongboQuocTeLocalServiceWrapper
	implements QlvtCapPhepGpkdvtDuongboQuocTeLocalService,
		ServiceWrapper<QlvtCapPhepGpkdvtDuongboQuocTeLocalService> {
	public QlvtCapPhepGpkdvtDuongboQuocTeLocalServiceWrapper(
		QlvtCapPhepGpkdvtDuongboQuocTeLocalService qlvtCapPhepGpkdvtDuongboQuocTeLocalService) {
		_qlvtCapPhepGpkdvtDuongboQuocTeLocalService = qlvtCapPhepGpkdvtDuongboQuocTeLocalService;
	}

	/**
	* Adds the qlvt cap phep gpkdvt duongbo quoc te to the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtCapPhepGpkdvtDuongboQuocTe the qlvt cap phep gpkdvt duongbo quoc te
	* @return the qlvt cap phep gpkdvt duongbo quoc te that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpkdvtDuongboQuocTe addQlvtCapPhepGpkdvtDuongboQuocTe(
		vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpkdvtDuongboQuocTe qlvtCapPhepGpkdvtDuongboQuocTe)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtCapPhepGpkdvtDuongboQuocTeLocalService.addQlvtCapPhepGpkdvtDuongboQuocTe(qlvtCapPhepGpkdvtDuongboQuocTe);
	}

	/**
	* Creates a new qlvt cap phep gpkdvt duongbo quoc te with the primary key. Does not add the qlvt cap phep gpkdvt duongbo quoc te to the database.
	*
	* @param id the primary key for the new qlvt cap phep gpkdvt duongbo quoc te
	* @return the new qlvt cap phep gpkdvt duongbo quoc te
	*/
	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpkdvtDuongboQuocTe createQlvtCapPhepGpkdvtDuongboQuocTe(
		long id) {
		return _qlvtCapPhepGpkdvtDuongboQuocTeLocalService.createQlvtCapPhepGpkdvtDuongboQuocTe(id);
	}

	/**
	* Deletes the qlvt cap phep gpkdvt duongbo quoc te with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt cap phep gpkdvt duongbo quoc te
	* @return the qlvt cap phep gpkdvt duongbo quoc te that was removed
	* @throws PortalException if a qlvt cap phep gpkdvt duongbo quoc te with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpkdvtDuongboQuocTe deleteQlvtCapPhepGpkdvtDuongboQuocTe(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtCapPhepGpkdvtDuongboQuocTeLocalService.deleteQlvtCapPhepGpkdvtDuongboQuocTe(id);
	}

	/**
	* Deletes the qlvt cap phep gpkdvt duongbo quoc te from the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtCapPhepGpkdvtDuongboQuocTe the qlvt cap phep gpkdvt duongbo quoc te
	* @return the qlvt cap phep gpkdvt duongbo quoc te that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpkdvtDuongboQuocTe deleteQlvtCapPhepGpkdvtDuongboQuocTe(
		vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpkdvtDuongboQuocTe qlvtCapPhepGpkdvtDuongboQuocTe)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtCapPhepGpkdvtDuongboQuocTeLocalService.deleteQlvtCapPhepGpkdvtDuongboQuocTe(qlvtCapPhepGpkdvtDuongboQuocTe);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _qlvtCapPhepGpkdvtDuongboQuocTeLocalService.dynamicQuery();
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
		return _qlvtCapPhepGpkdvtDuongboQuocTeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGpkdvtDuongboQuocTeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtCapPhepGpkdvtDuongboQuocTeLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGpkdvtDuongboQuocTeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtCapPhepGpkdvtDuongboQuocTeLocalService.dynamicQuery(dynamicQuery,
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
		return _qlvtCapPhepGpkdvtDuongboQuocTeLocalService.dynamicQueryCount(dynamicQuery);
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
		return _qlvtCapPhepGpkdvtDuongboQuocTeLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpkdvtDuongboQuocTe fetchQlvtCapPhepGpkdvtDuongboQuocTe(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtCapPhepGpkdvtDuongboQuocTeLocalService.fetchQlvtCapPhepGpkdvtDuongboQuocTe(id);
	}

	/**
	* Returns the qlvt cap phep gpkdvt duongbo quoc te with the primary key.
	*
	* @param id the primary key of the qlvt cap phep gpkdvt duongbo quoc te
	* @return the qlvt cap phep gpkdvt duongbo quoc te
	* @throws PortalException if a qlvt cap phep gpkdvt duongbo quoc te with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpkdvtDuongboQuocTe getQlvtCapPhepGpkdvtDuongboQuocTe(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtCapPhepGpkdvtDuongboQuocTeLocalService.getQlvtCapPhepGpkdvtDuongboQuocTe(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtCapPhepGpkdvtDuongboQuocTeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the qlvt cap phep gpkdvt duongbo quoc tes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGpkdvtDuongboQuocTeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt cap phep gpkdvt duongbo quoc tes
	* @param end the upper bound of the range of qlvt cap phep gpkdvt duongbo quoc tes (not inclusive)
	* @return the range of qlvt cap phep gpkdvt duongbo quoc tes
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpkdvtDuongboQuocTe> getQlvtCapPhepGpkdvtDuongboQuocTes(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtCapPhepGpkdvtDuongboQuocTeLocalService.getQlvtCapPhepGpkdvtDuongboQuocTes(start,
			end);
	}

	/**
	* Returns the number of qlvt cap phep gpkdvt duongbo quoc tes.
	*
	* @return the number of qlvt cap phep gpkdvt duongbo quoc tes
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getQlvtCapPhepGpkdvtDuongboQuocTesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtCapPhepGpkdvtDuongboQuocTeLocalService.getQlvtCapPhepGpkdvtDuongboQuocTesCount();
	}

	/**
	* Updates the qlvt cap phep gpkdvt duongbo quoc te in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param qlvtCapPhepGpkdvtDuongboQuocTe the qlvt cap phep gpkdvt duongbo quoc te
	* @return the qlvt cap phep gpkdvt duongbo quoc te that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpkdvtDuongboQuocTe updateQlvtCapPhepGpkdvtDuongboQuocTe(
		vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpkdvtDuongboQuocTe qlvtCapPhepGpkdvtDuongboQuocTe)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtCapPhepGpkdvtDuongboQuocTeLocalService.updateQlvtCapPhepGpkdvtDuongboQuocTe(qlvtCapPhepGpkdvtDuongboQuocTe);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _qlvtCapPhepGpkdvtDuongboQuocTeLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_qlvtCapPhepGpkdvtDuongboQuocTeLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _qlvtCapPhepGpkdvtDuongboQuocTeLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public QlvtCapPhepGpkdvtDuongboQuocTeLocalService getWrappedQlvtCapPhepGpkdvtDuongboQuocTeLocalService() {
		return _qlvtCapPhepGpkdvtDuongboQuocTeLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedQlvtCapPhepGpkdvtDuongboQuocTeLocalService(
		QlvtCapPhepGpkdvtDuongboQuocTeLocalService qlvtCapPhepGpkdvtDuongboQuocTeLocalService) {
		_qlvtCapPhepGpkdvtDuongboQuocTeLocalService = qlvtCapPhepGpkdvtDuongboQuocTeLocalService;
	}

	@Override
	public QlvtCapPhepGpkdvtDuongboQuocTeLocalService getWrappedService() {
		return _qlvtCapPhepGpkdvtDuongboQuocTeLocalService;
	}

	@Override
	public void setWrappedService(
		QlvtCapPhepGpkdvtDuongboQuocTeLocalService qlvtCapPhepGpkdvtDuongboQuocTeLocalService) {
		_qlvtCapPhepGpkdvtDuongboQuocTeLocalService = qlvtCapPhepGpkdvtDuongboQuocTeLocalService;
	}

	private QlvtCapPhepGpkdvtDuongboQuocTeLocalService _qlvtCapPhepGpkdvtDuongboQuocTeLocalService;
}