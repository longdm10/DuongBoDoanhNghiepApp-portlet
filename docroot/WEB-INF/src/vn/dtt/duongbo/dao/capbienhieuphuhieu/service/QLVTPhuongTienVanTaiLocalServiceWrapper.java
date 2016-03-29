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
 * Provides a wrapper for {@link QLVTPhuongTienVanTaiLocalService}.
 *
 * @author binhta
 * @see QLVTPhuongTienVanTaiLocalService
 * @generated
 */
public class QLVTPhuongTienVanTaiLocalServiceWrapper
	implements QLVTPhuongTienVanTaiLocalService,
		ServiceWrapper<QLVTPhuongTienVanTaiLocalService> {
	public QLVTPhuongTienVanTaiLocalServiceWrapper(
		QLVTPhuongTienVanTaiLocalService qlvtPhuongTienVanTaiLocalService) {
		_qlvtPhuongTienVanTaiLocalService = qlvtPhuongTienVanTaiLocalService;
	}

	/**
	* Adds the q l v t phuong tien van tai to the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtPhuongTienVanTai the q l v t phuong tien van tai
	* @return the q l v t phuong tien van tai that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTPhuongTienVanTai addQLVTPhuongTienVanTai(
		vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTPhuongTienVanTai qlvtPhuongTienVanTai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtPhuongTienVanTaiLocalService.addQLVTPhuongTienVanTai(qlvtPhuongTienVanTai);
	}

	/**
	* Creates a new q l v t phuong tien van tai with the primary key. Does not add the q l v t phuong tien van tai to the database.
	*
	* @param id the primary key for the new q l v t phuong tien van tai
	* @return the new q l v t phuong tien van tai
	*/
	@Override
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTPhuongTienVanTai createQLVTPhuongTienVanTai(
		int id) {
		return _qlvtPhuongTienVanTaiLocalService.createQLVTPhuongTienVanTai(id);
	}

	/**
	* Deletes the q l v t phuong tien van tai with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the q l v t phuong tien van tai
	* @return the q l v t phuong tien van tai that was removed
	* @throws PortalException if a q l v t phuong tien van tai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTPhuongTienVanTai deleteQLVTPhuongTienVanTai(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtPhuongTienVanTaiLocalService.deleteQLVTPhuongTienVanTai(id);
	}

	/**
	* Deletes the q l v t phuong tien van tai from the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtPhuongTienVanTai the q l v t phuong tien van tai
	* @return the q l v t phuong tien van tai that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTPhuongTienVanTai deleteQLVTPhuongTienVanTai(
		vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTPhuongTienVanTai qlvtPhuongTienVanTai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtPhuongTienVanTaiLocalService.deleteQLVTPhuongTienVanTai(qlvtPhuongTienVanTai);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _qlvtPhuongTienVanTaiLocalService.dynamicQuery();
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
		return _qlvtPhuongTienVanTaiLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTPhuongTienVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtPhuongTienVanTaiLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTPhuongTienVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtPhuongTienVanTaiLocalService.dynamicQuery(dynamicQuery,
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
		return _qlvtPhuongTienVanTaiLocalService.dynamicQueryCount(dynamicQuery);
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
		return _qlvtPhuongTienVanTaiLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTPhuongTienVanTai fetchQLVTPhuongTienVanTai(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtPhuongTienVanTaiLocalService.fetchQLVTPhuongTienVanTai(id);
	}

	/**
	* Returns the q l v t phuong tien van tai with the primary key.
	*
	* @param id the primary key of the q l v t phuong tien van tai
	* @return the q l v t phuong tien van tai
	* @throws PortalException if a q l v t phuong tien van tai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTPhuongTienVanTai getQLVTPhuongTienVanTai(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtPhuongTienVanTaiLocalService.getQLVTPhuongTienVanTai(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtPhuongTienVanTaiLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the q l v t phuong tien van tais.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTPhuongTienVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of q l v t phuong tien van tais
	* @param end the upper bound of the range of q l v t phuong tien van tais (not inclusive)
	* @return the range of q l v t phuong tien van tais
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTPhuongTienVanTai> getQLVTPhuongTienVanTais(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtPhuongTienVanTaiLocalService.getQLVTPhuongTienVanTais(start,
			end);
	}

	/**
	* Returns the number of q l v t phuong tien van tais.
	*
	* @return the number of q l v t phuong tien van tais
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getQLVTPhuongTienVanTaisCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtPhuongTienVanTaiLocalService.getQLVTPhuongTienVanTaisCount();
	}

	/**
	* Updates the q l v t phuong tien van tai in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param qlvtPhuongTienVanTai the q l v t phuong tien van tai
	* @return the q l v t phuong tien van tai that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTPhuongTienVanTai updateQLVTPhuongTienVanTai(
		vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTPhuongTienVanTai qlvtPhuongTienVanTai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtPhuongTienVanTaiLocalService.updateQLVTPhuongTienVanTai(qlvtPhuongTienVanTai);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _qlvtPhuongTienVanTaiLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_qlvtPhuongTienVanTaiLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _qlvtPhuongTienVanTaiLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public QLVTPhuongTienVanTaiLocalService getWrappedQLVTPhuongTienVanTaiLocalService() {
		return _qlvtPhuongTienVanTaiLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedQLVTPhuongTienVanTaiLocalService(
		QLVTPhuongTienVanTaiLocalService qlvtPhuongTienVanTaiLocalService) {
		_qlvtPhuongTienVanTaiLocalService = qlvtPhuongTienVanTaiLocalService;
	}

	@Override
	public QLVTPhuongTienVanTaiLocalService getWrappedService() {
		return _qlvtPhuongTienVanTaiLocalService;
	}

	@Override
	public void setWrappedService(
		QLVTPhuongTienVanTaiLocalService qlvtPhuongTienVanTaiLocalService) {
		_qlvtPhuongTienVanTaiLocalService = qlvtPhuongTienVanTaiLocalService;
	}

	private QLVTPhuongTienVanTaiLocalService _qlvtPhuongTienVanTaiLocalService;
}