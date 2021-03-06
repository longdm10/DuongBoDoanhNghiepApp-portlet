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

package vn.dtt.duongbo.dao.noidia.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService}.
 *
 * @author NoiPham
 * @see QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService
 * @generated
 */
public class QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalServiceWrapper
	implements QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService,
		ServiceWrapper<QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService> {
	public QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalServiceWrapper(
		QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService) {
		_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService = qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService;
	}

	/**
	* Adds the qlvt xu ly gpkdvt bang oto loai hinh van tai to the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai the qlvt xu ly gpkdvt bang oto loai hinh van tai
	* @return the qlvt xu ly gpkdvt bang oto loai hinh van tai that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai addQlvtXuLyGpkdvtBangOtoLoaiHinhVanTai(
		vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService.addQlvtXuLyGpkdvtBangOtoLoaiHinhVanTai(qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai);
	}

	/**
	* Creates a new qlvt xu ly gpkdvt bang oto loai hinh van tai with the primary key. Does not add the qlvt xu ly gpkdvt bang oto loai hinh van tai to the database.
	*
	* @param id the primary key for the new qlvt xu ly gpkdvt bang oto loai hinh van tai
	* @return the new qlvt xu ly gpkdvt bang oto loai hinh van tai
	*/
	@Override
	public vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai createQlvtXuLyGpkdvtBangOtoLoaiHinhVanTai(
		long id) {
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService.createQlvtXuLyGpkdvtBangOtoLoaiHinhVanTai(id);
	}

	/**
	* Deletes the qlvt xu ly gpkdvt bang oto loai hinh van tai with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt xu ly gpkdvt bang oto loai hinh van tai
	* @return the qlvt xu ly gpkdvt bang oto loai hinh van tai that was removed
	* @throws PortalException if a qlvt xu ly gpkdvt bang oto loai hinh van tai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai deleteQlvtXuLyGpkdvtBangOtoLoaiHinhVanTai(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService.deleteQlvtXuLyGpkdvtBangOtoLoaiHinhVanTai(id);
	}

	/**
	* Deletes the qlvt xu ly gpkdvt bang oto loai hinh van tai from the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai the qlvt xu ly gpkdvt bang oto loai hinh van tai
	* @return the qlvt xu ly gpkdvt bang oto loai hinh van tai that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai deleteQlvtXuLyGpkdvtBangOtoLoaiHinhVanTai(
		vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService.deleteQlvtXuLyGpkdvtBangOtoLoaiHinhVanTai(qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService.dynamicQuery();
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
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.noidia.model.impl.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.noidia.model.impl.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService.dynamicQuery(dynamicQuery,
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
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService.dynamicQueryCount(dynamicQuery);
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
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai fetchQlvtXuLyGpkdvtBangOtoLoaiHinhVanTai(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService.fetchQlvtXuLyGpkdvtBangOtoLoaiHinhVanTai(id);
	}

	/**
	* Returns the qlvt xu ly gpkdvt bang oto loai hinh van tai with the primary key.
	*
	* @param id the primary key of the qlvt xu ly gpkdvt bang oto loai hinh van tai
	* @return the qlvt xu ly gpkdvt bang oto loai hinh van tai
	* @throws PortalException if a qlvt xu ly gpkdvt bang oto loai hinh van tai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai getQlvtXuLyGpkdvtBangOtoLoaiHinhVanTai(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService.getQlvtXuLyGpkdvtBangOtoLoaiHinhVanTai(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the qlvt xu ly gpkdvt bang oto loai hinh van tais.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.noidia.model.impl.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt xu ly gpkdvt bang oto loai hinh van tais
	* @param end the upper bound of the range of qlvt xu ly gpkdvt bang oto loai hinh van tais (not inclusive)
	* @return the range of qlvt xu ly gpkdvt bang oto loai hinh van tais
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai> getQlvtXuLyGpkdvtBangOtoLoaiHinhVanTais(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService.getQlvtXuLyGpkdvtBangOtoLoaiHinhVanTais(start,
			end);
	}

	/**
	* Returns the number of qlvt xu ly gpkdvt bang oto loai hinh van tais.
	*
	* @return the number of qlvt xu ly gpkdvt bang oto loai hinh van tais
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaisCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService.getQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaisCount();
	}

	/**
	* Updates the qlvt xu ly gpkdvt bang oto loai hinh van tai in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai the qlvt xu ly gpkdvt bang oto loai hinh van tai
	* @return the qlvt xu ly gpkdvt bang oto loai hinh van tai that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai updateQlvtXuLyGpkdvtBangOtoLoaiHinhVanTai(
		vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService.updateQlvtXuLyGpkdvtBangOtoLoaiHinhVanTai(qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai> findBygpkdvtBangOtoId(
		int gpkdvtBangOtoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService.findBygpkdvtBangOtoId(gpkdvtBangOtoId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService getWrappedQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService() {
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService(
		QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService) {
		_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService = qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService;
	}

	@Override
	public QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService getWrappedService() {
		return _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService;
	}

	@Override
	public void setWrappedService(
		QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService) {
		_qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService = qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService;
	}

	private QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService _qlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiLocalService;
}