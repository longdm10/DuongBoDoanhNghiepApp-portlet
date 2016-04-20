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
 * Provides a wrapper for {@link QlvtXuLyGpLienVanLoaiHinhVanTaiLocalService}.
 *
 * @author NhanNc
 * @see QlvtXuLyGpLienVanLoaiHinhVanTaiLocalService
 * @generated
 */
public class QlvtXuLyGpLienVanLoaiHinhVanTaiLocalServiceWrapper
	implements QlvtXuLyGpLienVanLoaiHinhVanTaiLocalService,
		ServiceWrapper<QlvtXuLyGpLienVanLoaiHinhVanTaiLocalService> {
	public QlvtXuLyGpLienVanLoaiHinhVanTaiLocalServiceWrapper(
		QlvtXuLyGpLienVanLoaiHinhVanTaiLocalService qlvtXuLyGpLienVanLoaiHinhVanTaiLocalService) {
		_qlvtXuLyGpLienVanLoaiHinhVanTaiLocalService = qlvtXuLyGpLienVanLoaiHinhVanTaiLocalService;
	}

	/**
	* Adds the qlvt xu ly gp lien van loai hinh van tai to the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtXuLyGpLienVanLoaiHinhVanTai the qlvt xu ly gp lien van loai hinh van tai
	* @return the qlvt xu ly gp lien van loai hinh van tai that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanLoaiHinhVanTai addQlvtXuLyGpLienVanLoaiHinhVanTai(
		vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanLoaiHinhVanTai qlvtXuLyGpLienVanLoaiHinhVanTai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyGpLienVanLoaiHinhVanTaiLocalService.addQlvtXuLyGpLienVanLoaiHinhVanTai(qlvtXuLyGpLienVanLoaiHinhVanTai);
	}

	/**
	* Creates a new qlvt xu ly gp lien van loai hinh van tai with the primary key. Does not add the qlvt xu ly gp lien van loai hinh van tai to the database.
	*
	* @param id the primary key for the new qlvt xu ly gp lien van loai hinh van tai
	* @return the new qlvt xu ly gp lien van loai hinh van tai
	*/
	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanLoaiHinhVanTai createQlvtXuLyGpLienVanLoaiHinhVanTai(
		long id) {
		return _qlvtXuLyGpLienVanLoaiHinhVanTaiLocalService.createQlvtXuLyGpLienVanLoaiHinhVanTai(id);
	}

	/**
	* Deletes the qlvt xu ly gp lien van loai hinh van tai with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt xu ly gp lien van loai hinh van tai
	* @return the qlvt xu ly gp lien van loai hinh van tai that was removed
	* @throws PortalException if a qlvt xu ly gp lien van loai hinh van tai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanLoaiHinhVanTai deleteQlvtXuLyGpLienVanLoaiHinhVanTai(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyGpLienVanLoaiHinhVanTaiLocalService.deleteQlvtXuLyGpLienVanLoaiHinhVanTai(id);
	}

	/**
	* Deletes the qlvt xu ly gp lien van loai hinh van tai from the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtXuLyGpLienVanLoaiHinhVanTai the qlvt xu ly gp lien van loai hinh van tai
	* @return the qlvt xu ly gp lien van loai hinh van tai that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanLoaiHinhVanTai deleteQlvtXuLyGpLienVanLoaiHinhVanTai(
		vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanLoaiHinhVanTai qlvtXuLyGpLienVanLoaiHinhVanTai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyGpLienVanLoaiHinhVanTaiLocalService.deleteQlvtXuLyGpLienVanLoaiHinhVanTai(qlvtXuLyGpLienVanLoaiHinhVanTai);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _qlvtXuLyGpLienVanLoaiHinhVanTaiLocalService.dynamicQuery();
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
		return _qlvtXuLyGpLienVanLoaiHinhVanTaiLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanLoaiHinhVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtXuLyGpLienVanLoaiHinhVanTaiLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanLoaiHinhVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtXuLyGpLienVanLoaiHinhVanTaiLocalService.dynamicQuery(dynamicQuery,
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
		return _qlvtXuLyGpLienVanLoaiHinhVanTaiLocalService.dynamicQueryCount(dynamicQuery);
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
		return _qlvtXuLyGpLienVanLoaiHinhVanTaiLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanLoaiHinhVanTai fetchQlvtXuLyGpLienVanLoaiHinhVanTai(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyGpLienVanLoaiHinhVanTaiLocalService.fetchQlvtXuLyGpLienVanLoaiHinhVanTai(id);
	}

	/**
	* Returns the qlvt xu ly gp lien van loai hinh van tai with the primary key.
	*
	* @param id the primary key of the qlvt xu ly gp lien van loai hinh van tai
	* @return the qlvt xu ly gp lien van loai hinh van tai
	* @throws PortalException if a qlvt xu ly gp lien van loai hinh van tai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanLoaiHinhVanTai getQlvtXuLyGpLienVanLoaiHinhVanTai(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyGpLienVanLoaiHinhVanTaiLocalService.getQlvtXuLyGpLienVanLoaiHinhVanTai(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyGpLienVanLoaiHinhVanTaiLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the qlvt xu ly gp lien van loai hinh van tais.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanLoaiHinhVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt xu ly gp lien van loai hinh van tais
	* @param end the upper bound of the range of qlvt xu ly gp lien van loai hinh van tais (not inclusive)
	* @return the range of qlvt xu ly gp lien van loai hinh van tais
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanLoaiHinhVanTai> getQlvtXuLyGpLienVanLoaiHinhVanTais(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyGpLienVanLoaiHinhVanTaiLocalService.getQlvtXuLyGpLienVanLoaiHinhVanTais(start,
			end);
	}

	/**
	* Returns the number of qlvt xu ly gp lien van loai hinh van tais.
	*
	* @return the number of qlvt xu ly gp lien van loai hinh van tais
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getQlvtXuLyGpLienVanLoaiHinhVanTaisCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyGpLienVanLoaiHinhVanTaiLocalService.getQlvtXuLyGpLienVanLoaiHinhVanTaisCount();
	}

	/**
	* Updates the qlvt xu ly gp lien van loai hinh van tai in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param qlvtXuLyGpLienVanLoaiHinhVanTai the qlvt xu ly gp lien van loai hinh van tai
	* @return the qlvt xu ly gp lien van loai hinh van tai that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanLoaiHinhVanTai updateQlvtXuLyGpLienVanLoaiHinhVanTai(
		vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanLoaiHinhVanTai qlvtXuLyGpLienVanLoaiHinhVanTai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyGpLienVanLoaiHinhVanTaiLocalService.updateQlvtXuLyGpLienVanLoaiHinhVanTai(qlvtXuLyGpLienVanLoaiHinhVanTai);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _qlvtXuLyGpLienVanLoaiHinhVanTaiLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_qlvtXuLyGpLienVanLoaiHinhVanTaiLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _qlvtXuLyGpLienVanLoaiHinhVanTaiLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanLoaiHinhVanTai> findBygpLienVanId(
		int gpLienVanId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyGpLienVanLoaiHinhVanTaiLocalService.findBygpLienVanId(gpLienVanId);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanLoaiHinhVanTai> findBygpLienVanId(
		long gpLienVanId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyGpLienVanLoaiHinhVanTaiLocalService.findBygpLienVanId(gpLienVanId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public QlvtXuLyGpLienVanLoaiHinhVanTaiLocalService getWrappedQlvtXuLyGpLienVanLoaiHinhVanTaiLocalService() {
		return _qlvtXuLyGpLienVanLoaiHinhVanTaiLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedQlvtXuLyGpLienVanLoaiHinhVanTaiLocalService(
		QlvtXuLyGpLienVanLoaiHinhVanTaiLocalService qlvtXuLyGpLienVanLoaiHinhVanTaiLocalService) {
		_qlvtXuLyGpLienVanLoaiHinhVanTaiLocalService = qlvtXuLyGpLienVanLoaiHinhVanTaiLocalService;
	}

	@Override
	public QlvtXuLyGpLienVanLoaiHinhVanTaiLocalService getWrappedService() {
		return _qlvtXuLyGpLienVanLoaiHinhVanTaiLocalService;
	}

	@Override
	public void setWrappedService(
		QlvtXuLyGpLienVanLoaiHinhVanTaiLocalService qlvtXuLyGpLienVanLoaiHinhVanTaiLocalService) {
		_qlvtXuLyGpLienVanLoaiHinhVanTaiLocalService = qlvtXuLyGpLienVanLoaiHinhVanTaiLocalService;
	}

	private QlvtXuLyGpLienVanLoaiHinhVanTaiLocalService _qlvtXuLyGpLienVanLoaiHinhVanTaiLocalService;
}