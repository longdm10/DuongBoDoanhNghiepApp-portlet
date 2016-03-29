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
 * Provides a wrapper for {@link QlvtXuLyKTTQuocTeBieuDoXeLocalService}.
 *
 * @author NoiPham
 * @see QlvtXuLyKTTQuocTeBieuDoXeLocalService
 * @generated
 */
public class QlvtXuLyKTTQuocTeBieuDoXeLocalServiceWrapper
	implements QlvtXuLyKTTQuocTeBieuDoXeLocalService,
		ServiceWrapper<QlvtXuLyKTTQuocTeBieuDoXeLocalService> {
	public QlvtXuLyKTTQuocTeBieuDoXeLocalServiceWrapper(
		QlvtXuLyKTTQuocTeBieuDoXeLocalService qlvtXuLyKTTQuocTeBieuDoXeLocalService) {
		_qlvtXuLyKTTQuocTeBieuDoXeLocalService = qlvtXuLyKTTQuocTeBieuDoXeLocalService;
	}

	/**
	* Adds the qlvt xu ly k t t quoc te bieu do xe to the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtXuLyKTTQuocTeBieuDoXe the qlvt xu ly k t t quoc te bieu do xe
	* @return the qlvt xu ly k t t quoc te bieu do xe that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXe addQlvtXuLyKTTQuocTeBieuDoXe(
		vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXe qlvtXuLyKTTQuocTeBieuDoXe)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyKTTQuocTeBieuDoXeLocalService.addQlvtXuLyKTTQuocTeBieuDoXe(qlvtXuLyKTTQuocTeBieuDoXe);
	}

	/**
	* Creates a new qlvt xu ly k t t quoc te bieu do xe with the primary key. Does not add the qlvt xu ly k t t quoc te bieu do xe to the database.
	*
	* @param id the primary key for the new qlvt xu ly k t t quoc te bieu do xe
	* @return the new qlvt xu ly k t t quoc te bieu do xe
	*/
	@Override
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXe createQlvtXuLyKTTQuocTeBieuDoXe(
		long id) {
		return _qlvtXuLyKTTQuocTeBieuDoXeLocalService.createQlvtXuLyKTTQuocTeBieuDoXe(id);
	}

	/**
	* Deletes the qlvt xu ly k t t quoc te bieu do xe with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt xu ly k t t quoc te bieu do xe
	* @return the qlvt xu ly k t t quoc te bieu do xe that was removed
	* @throws PortalException if a qlvt xu ly k t t quoc te bieu do xe with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXe deleteQlvtXuLyKTTQuocTeBieuDoXe(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyKTTQuocTeBieuDoXeLocalService.deleteQlvtXuLyKTTQuocTeBieuDoXe(id);
	}

	/**
	* Deletes the qlvt xu ly k t t quoc te bieu do xe from the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtXuLyKTTQuocTeBieuDoXe the qlvt xu ly k t t quoc te bieu do xe
	* @return the qlvt xu ly k t t quoc te bieu do xe that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXe deleteQlvtXuLyKTTQuocTeBieuDoXe(
		vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXe qlvtXuLyKTTQuocTeBieuDoXe)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyKTTQuocTeBieuDoXeLocalService.deleteQlvtXuLyKTTQuocTeBieuDoXe(qlvtXuLyKTTQuocTeBieuDoXe);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _qlvtXuLyKTTQuocTeBieuDoXeLocalService.dynamicQuery();
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
		return _qlvtXuLyKTTQuocTeBieuDoXeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTeBieuDoXeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtXuLyKTTQuocTeBieuDoXeLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTeBieuDoXeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtXuLyKTTQuocTeBieuDoXeLocalService.dynamicQuery(dynamicQuery,
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
		return _qlvtXuLyKTTQuocTeBieuDoXeLocalService.dynamicQueryCount(dynamicQuery);
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
		return _qlvtXuLyKTTQuocTeBieuDoXeLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXe fetchQlvtXuLyKTTQuocTeBieuDoXe(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyKTTQuocTeBieuDoXeLocalService.fetchQlvtXuLyKTTQuocTeBieuDoXe(id);
	}

	/**
	* Returns the qlvt xu ly k t t quoc te bieu do xe with the primary key.
	*
	* @param id the primary key of the qlvt xu ly k t t quoc te bieu do xe
	* @return the qlvt xu ly k t t quoc te bieu do xe
	* @throws PortalException if a qlvt xu ly k t t quoc te bieu do xe with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXe getQlvtXuLyKTTQuocTeBieuDoXe(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyKTTQuocTeBieuDoXeLocalService.getQlvtXuLyKTTQuocTeBieuDoXe(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyKTTQuocTeBieuDoXeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the qlvt xu ly k t t quoc te bieu do xes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTeBieuDoXeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt xu ly k t t quoc te bieu do xes
	* @param end the upper bound of the range of qlvt xu ly k t t quoc te bieu do xes (not inclusive)
	* @return the range of qlvt xu ly k t t quoc te bieu do xes
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXe> getQlvtXuLyKTTQuocTeBieuDoXes(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyKTTQuocTeBieuDoXeLocalService.getQlvtXuLyKTTQuocTeBieuDoXes(start,
			end);
	}

	/**
	* Returns the number of qlvt xu ly k t t quoc te bieu do xes.
	*
	* @return the number of qlvt xu ly k t t quoc te bieu do xes
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getQlvtXuLyKTTQuocTeBieuDoXesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyKTTQuocTeBieuDoXeLocalService.getQlvtXuLyKTTQuocTeBieuDoXesCount();
	}

	/**
	* Updates the qlvt xu ly k t t quoc te bieu do xe in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param qlvtXuLyKTTQuocTeBieuDoXe the qlvt xu ly k t t quoc te bieu do xe
	* @return the qlvt xu ly k t t quoc te bieu do xe that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXe updateQlvtXuLyKTTQuocTeBieuDoXe(
		vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXe qlvtXuLyKTTQuocTeBieuDoXe)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyKTTQuocTeBieuDoXeLocalService.updateQlvtXuLyKTTQuocTeBieuDoXe(qlvtXuLyKTTQuocTeBieuDoXe);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _qlvtXuLyKTTQuocTeBieuDoXeLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_qlvtXuLyKTTQuocTeBieuDoXeLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _qlvtXuLyKTTQuocTeBieuDoXeLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public QlvtXuLyKTTQuocTeBieuDoXeLocalService getWrappedQlvtXuLyKTTQuocTeBieuDoXeLocalService() {
		return _qlvtXuLyKTTQuocTeBieuDoXeLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedQlvtXuLyKTTQuocTeBieuDoXeLocalService(
		QlvtXuLyKTTQuocTeBieuDoXeLocalService qlvtXuLyKTTQuocTeBieuDoXeLocalService) {
		_qlvtXuLyKTTQuocTeBieuDoXeLocalService = qlvtXuLyKTTQuocTeBieuDoXeLocalService;
	}

	@Override
	public QlvtXuLyKTTQuocTeBieuDoXeLocalService getWrappedService() {
		return _qlvtXuLyKTTQuocTeBieuDoXeLocalService;
	}

	@Override
	public void setWrappedService(
		QlvtXuLyKTTQuocTeBieuDoXeLocalService qlvtXuLyKTTQuocTeBieuDoXeLocalService) {
		_qlvtXuLyKTTQuocTeBieuDoXeLocalService = qlvtXuLyKTTQuocTeBieuDoXeLocalService;
	}

	private QlvtXuLyKTTQuocTeBieuDoXeLocalService _qlvtXuLyKTTQuocTeBieuDoXeLocalService;
}