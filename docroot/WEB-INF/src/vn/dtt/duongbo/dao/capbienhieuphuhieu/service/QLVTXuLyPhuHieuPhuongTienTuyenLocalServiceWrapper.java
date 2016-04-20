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

package vn.dtt.duongbo.dao.capbienhieuphuhieu.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link QLVTXuLyPhuHieuPhuongTienTuyenLocalService}.
 *
 * @author binhta
 * @see QLVTXuLyPhuHieuPhuongTienTuyenLocalService
 * @generated
 */
public class QLVTXuLyPhuHieuPhuongTienTuyenLocalServiceWrapper
	implements QLVTXuLyPhuHieuPhuongTienTuyenLocalService,
		ServiceWrapper<QLVTXuLyPhuHieuPhuongTienTuyenLocalService> {
	public QLVTXuLyPhuHieuPhuongTienTuyenLocalServiceWrapper(
		QLVTXuLyPhuHieuPhuongTienTuyenLocalService qlvtXuLyPhuHieuPhuongTienTuyenLocalService) {
		_qlvtXuLyPhuHieuPhuongTienTuyenLocalService = qlvtXuLyPhuHieuPhuongTienTuyenLocalService;
	}

	/**
	* Adds the q l v t xu ly phu hieu phuong tien tuyen to the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtXuLyPhuHieuPhuongTienTuyen the q l v t xu ly phu hieu phuong tien tuyen
	* @return the q l v t xu ly phu hieu phuong tien tuyen that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTienTuyen addQLVTXuLyPhuHieuPhuongTienTuyen(
		vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTienTuyen qlvtXuLyPhuHieuPhuongTienTuyen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyPhuHieuPhuongTienTuyenLocalService.addQLVTXuLyPhuHieuPhuongTienTuyen(qlvtXuLyPhuHieuPhuongTienTuyen);
	}

	/**
	* Creates a new q l v t xu ly phu hieu phuong tien tuyen with the primary key. Does not add the q l v t xu ly phu hieu phuong tien tuyen to the database.
	*
	* @param id the primary key for the new q l v t xu ly phu hieu phuong tien tuyen
	* @return the new q l v t xu ly phu hieu phuong tien tuyen
	*/
	@Override
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTienTuyen createQLVTXuLyPhuHieuPhuongTienTuyen(
		int id) {
		return _qlvtXuLyPhuHieuPhuongTienTuyenLocalService.createQLVTXuLyPhuHieuPhuongTienTuyen(id);
	}

	/**
	* Deletes the q l v t xu ly phu hieu phuong tien tuyen with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the q l v t xu ly phu hieu phuong tien tuyen
	* @return the q l v t xu ly phu hieu phuong tien tuyen that was removed
	* @throws PortalException if a q l v t xu ly phu hieu phuong tien tuyen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTienTuyen deleteQLVTXuLyPhuHieuPhuongTienTuyen(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyPhuHieuPhuongTienTuyenLocalService.deleteQLVTXuLyPhuHieuPhuongTienTuyen(id);
	}

	/**
	* Deletes the q l v t xu ly phu hieu phuong tien tuyen from the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtXuLyPhuHieuPhuongTienTuyen the q l v t xu ly phu hieu phuong tien tuyen
	* @return the q l v t xu ly phu hieu phuong tien tuyen that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTienTuyen deleteQLVTXuLyPhuHieuPhuongTienTuyen(
		vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTienTuyen qlvtXuLyPhuHieuPhuongTienTuyen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyPhuHieuPhuongTienTuyenLocalService.deleteQLVTXuLyPhuHieuPhuongTienTuyen(qlvtXuLyPhuHieuPhuongTienTuyen);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _qlvtXuLyPhuHieuPhuongTienTuyenLocalService.dynamicQuery();
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
		return _qlvtXuLyPhuHieuPhuongTienTuyenLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyPhuHieuPhuongTienTuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtXuLyPhuHieuPhuongTienTuyenLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyPhuHieuPhuongTienTuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtXuLyPhuHieuPhuongTienTuyenLocalService.dynamicQuery(dynamicQuery,
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
		return _qlvtXuLyPhuHieuPhuongTienTuyenLocalService.dynamicQueryCount(dynamicQuery);
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
		return _qlvtXuLyPhuHieuPhuongTienTuyenLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTienTuyen fetchQLVTXuLyPhuHieuPhuongTienTuyen(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyPhuHieuPhuongTienTuyenLocalService.fetchQLVTXuLyPhuHieuPhuongTienTuyen(id);
	}

	/**
	* Returns the q l v t xu ly phu hieu phuong tien tuyen with the primary key.
	*
	* @param id the primary key of the q l v t xu ly phu hieu phuong tien tuyen
	* @return the q l v t xu ly phu hieu phuong tien tuyen
	* @throws PortalException if a q l v t xu ly phu hieu phuong tien tuyen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTienTuyen getQLVTXuLyPhuHieuPhuongTienTuyen(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyPhuHieuPhuongTienTuyenLocalService.getQLVTXuLyPhuHieuPhuongTienTuyen(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyPhuHieuPhuongTienTuyenLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the q l v t xu ly phu hieu phuong tien tuyens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyPhuHieuPhuongTienTuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of q l v t xu ly phu hieu phuong tien tuyens
	* @param end the upper bound of the range of q l v t xu ly phu hieu phuong tien tuyens (not inclusive)
	* @return the range of q l v t xu ly phu hieu phuong tien tuyens
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTienTuyen> getQLVTXuLyPhuHieuPhuongTienTuyens(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyPhuHieuPhuongTienTuyenLocalService.getQLVTXuLyPhuHieuPhuongTienTuyens(start,
			end);
	}

	/**
	* Returns the number of q l v t xu ly phu hieu phuong tien tuyens.
	*
	* @return the number of q l v t xu ly phu hieu phuong tien tuyens
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getQLVTXuLyPhuHieuPhuongTienTuyensCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyPhuHieuPhuongTienTuyenLocalService.getQLVTXuLyPhuHieuPhuongTienTuyensCount();
	}

	/**
	* Updates the q l v t xu ly phu hieu phuong tien tuyen in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param qlvtXuLyPhuHieuPhuongTienTuyen the q l v t xu ly phu hieu phuong tien tuyen
	* @return the q l v t xu ly phu hieu phuong tien tuyen that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTienTuyen updateQLVTXuLyPhuHieuPhuongTienTuyen(
		vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTienTuyen qlvtXuLyPhuHieuPhuongTienTuyen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyPhuHieuPhuongTienTuyenLocalService.updateQLVTXuLyPhuHieuPhuongTienTuyen(qlvtXuLyPhuHieuPhuongTienTuyen);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _qlvtXuLyPhuHieuPhuongTienTuyenLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_qlvtXuLyPhuHieuPhuongTienTuyenLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _qlvtXuLyPhuHieuPhuongTienTuyenLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public QLVTXuLyPhuHieuPhuongTienTuyenLocalService getWrappedQLVTXuLyPhuHieuPhuongTienTuyenLocalService() {
		return _qlvtXuLyPhuHieuPhuongTienTuyenLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedQLVTXuLyPhuHieuPhuongTienTuyenLocalService(
		QLVTXuLyPhuHieuPhuongTienTuyenLocalService qlvtXuLyPhuHieuPhuongTienTuyenLocalService) {
		_qlvtXuLyPhuHieuPhuongTienTuyenLocalService = qlvtXuLyPhuHieuPhuongTienTuyenLocalService;
	}

	@Override
	public QLVTXuLyPhuHieuPhuongTienTuyenLocalService getWrappedService() {
		return _qlvtXuLyPhuHieuPhuongTienTuyenLocalService;
	}

	@Override
	public void setWrappedService(
		QLVTXuLyPhuHieuPhuongTienTuyenLocalService qlvtXuLyPhuHieuPhuongTienTuyenLocalService) {
		_qlvtXuLyPhuHieuPhuongTienTuyenLocalService = qlvtXuLyPhuHieuPhuongTienTuyenLocalService;
	}

	private QLVTXuLyPhuHieuPhuongTienTuyenLocalService _qlvtXuLyPhuHieuPhuongTienTuyenLocalService;
}