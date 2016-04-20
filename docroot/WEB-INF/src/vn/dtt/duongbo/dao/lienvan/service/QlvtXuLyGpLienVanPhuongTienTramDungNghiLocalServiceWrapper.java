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
 * Provides a wrapper for {@link QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService}.
 *
 * @author NhanNc
 * @see QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService
 * @generated
 */
public class QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalServiceWrapper
	implements QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService,
		ServiceWrapper<QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService> {
	public QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalServiceWrapper(
		QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService qlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService) {
		_qlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService = qlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService;
	}

	/**
	* Adds the qlvt xu ly gp lien van phuong tien tram dung nghi to the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtXuLyGpLienVanPhuongTienTramDungNghi the qlvt xu ly gp lien van phuong tien tram dung nghi
	* @return the qlvt xu ly gp lien van phuong tien tram dung nghi that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi addQlvtXuLyGpLienVanPhuongTienTramDungNghi(
		vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi qlvtXuLyGpLienVanPhuongTienTramDungNghi)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService.addQlvtXuLyGpLienVanPhuongTienTramDungNghi(qlvtXuLyGpLienVanPhuongTienTramDungNghi);
	}

	/**
	* Creates a new qlvt xu ly gp lien van phuong tien tram dung nghi with the primary key. Does not add the qlvt xu ly gp lien van phuong tien tram dung nghi to the database.
	*
	* @param id the primary key for the new qlvt xu ly gp lien van phuong tien tram dung nghi
	* @return the new qlvt xu ly gp lien van phuong tien tram dung nghi
	*/
	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi createQlvtXuLyGpLienVanPhuongTienTramDungNghi(
		long id) {
		return _qlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService.createQlvtXuLyGpLienVanPhuongTienTramDungNghi(id);
	}

	/**
	* Deletes the qlvt xu ly gp lien van phuong tien tram dung nghi with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt xu ly gp lien van phuong tien tram dung nghi
	* @return the qlvt xu ly gp lien van phuong tien tram dung nghi that was removed
	* @throws PortalException if a qlvt xu ly gp lien van phuong tien tram dung nghi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi deleteQlvtXuLyGpLienVanPhuongTienTramDungNghi(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService.deleteQlvtXuLyGpLienVanPhuongTienTramDungNghi(id);
	}

	/**
	* Deletes the qlvt xu ly gp lien van phuong tien tram dung nghi from the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtXuLyGpLienVanPhuongTienTramDungNghi the qlvt xu ly gp lien van phuong tien tram dung nghi
	* @return the qlvt xu ly gp lien van phuong tien tram dung nghi that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi deleteQlvtXuLyGpLienVanPhuongTienTramDungNghi(
		vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi qlvtXuLyGpLienVanPhuongTienTramDungNghi)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService.deleteQlvtXuLyGpLienVanPhuongTienTramDungNghi(qlvtXuLyGpLienVanPhuongTienTramDungNghi);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _qlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService.dynamicQuery();
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
		return _qlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService.dynamicQuery(dynamicQuery,
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
		return _qlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService.dynamicQueryCount(dynamicQuery);
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
		return _qlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi fetchQlvtXuLyGpLienVanPhuongTienTramDungNghi(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService.fetchQlvtXuLyGpLienVanPhuongTienTramDungNghi(id);
	}

	/**
	* Returns the qlvt xu ly gp lien van phuong tien tram dung nghi with the primary key.
	*
	* @param id the primary key of the qlvt xu ly gp lien van phuong tien tram dung nghi
	* @return the qlvt xu ly gp lien van phuong tien tram dung nghi
	* @throws PortalException if a qlvt xu ly gp lien van phuong tien tram dung nghi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi getQlvtXuLyGpLienVanPhuongTienTramDungNghi(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService.getQlvtXuLyGpLienVanPhuongTienTramDungNghi(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the qlvt xu ly gp lien van phuong tien tram dung nghis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt xu ly gp lien van phuong tien tram dung nghis
	* @param end the upper bound of the range of qlvt xu ly gp lien van phuong tien tram dung nghis (not inclusive)
	* @return the range of qlvt xu ly gp lien van phuong tien tram dung nghis
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi> getQlvtXuLyGpLienVanPhuongTienTramDungNghis(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService.getQlvtXuLyGpLienVanPhuongTienTramDungNghis(start,
			end);
	}

	/**
	* Returns the number of qlvt xu ly gp lien van phuong tien tram dung nghis.
	*
	* @return the number of qlvt xu ly gp lien van phuong tien tram dung nghis
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getQlvtXuLyGpLienVanPhuongTienTramDungNghisCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService.getQlvtXuLyGpLienVanPhuongTienTramDungNghisCount();
	}

	/**
	* Updates the qlvt xu ly gp lien van phuong tien tram dung nghi in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param qlvtXuLyGpLienVanPhuongTienTramDungNghi the qlvt xu ly gp lien van phuong tien tram dung nghi
	* @return the qlvt xu ly gp lien van phuong tien tram dung nghi that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi updateQlvtXuLyGpLienVanPhuongTienTramDungNghi(
		vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi qlvtXuLyGpLienVanPhuongTienTramDungNghi)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService.updateQlvtXuLyGpLienVanPhuongTienTramDungNghi(qlvtXuLyGpLienVanPhuongTienTramDungNghi);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _qlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_qlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _qlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi> findBycapGplxPhuongTienId(
		int capGplxPhuongTienId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService.findBycapGplxPhuongTienId(capGplxPhuongTienId);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi> findBycapGplxPhuongTienId(
		long capGplxPhuongTienId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService.findBycapGplxPhuongTienId(capGplxPhuongTienId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService getWrappedQlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService() {
		return _qlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedQlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService(
		QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService qlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService) {
		_qlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService = qlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService;
	}

	@Override
	public QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService getWrappedService() {
		return _qlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService;
	}

	@Override
	public void setWrappedService(
		QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService qlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService) {
		_qlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService = qlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService;
	}

	private QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService _qlvtXuLyGpLienVanPhuongTienTramDungNghiLocalService;
}