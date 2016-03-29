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

package vn.dtt.duongbo.dao.doanhnghiep.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DnDoanhNghiepLocalService}.
 *
 * @author win_64
 * @see DnDoanhNghiepLocalService
 * @generated
 */
public class DnDoanhNghiepLocalServiceWrapper
	implements DnDoanhNghiepLocalService,
		ServiceWrapper<DnDoanhNghiepLocalService> {
	public DnDoanhNghiepLocalServiceWrapper(
		DnDoanhNghiepLocalService dnDoanhNghiepLocalService) {
		_dnDoanhNghiepLocalService = dnDoanhNghiepLocalService;
	}

	/**
	* Adds the dn doanh nghiep to the database. Also notifies the appropriate model listeners.
	*
	* @param dnDoanhNghiep the dn doanh nghiep
	* @return the dn doanh nghiep that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep addDnDoanhNghiep(
		vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep dnDoanhNghiep)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dnDoanhNghiepLocalService.addDnDoanhNghiep(dnDoanhNghiep);
	}

	/**
	* Creates a new dn doanh nghiep with the primary key. Does not add the dn doanh nghiep to the database.
	*
	* @param id the primary key for the new dn doanh nghiep
	* @return the new dn doanh nghiep
	*/
	@Override
	public vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep createDnDoanhNghiep(
		long id) {
		return _dnDoanhNghiepLocalService.createDnDoanhNghiep(id);
	}

	/**
	* Deletes the dn doanh nghiep with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dn doanh nghiep
	* @return the dn doanh nghiep that was removed
	* @throws PortalException if a dn doanh nghiep with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep deleteDnDoanhNghiep(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dnDoanhNghiepLocalService.deleteDnDoanhNghiep(id);
	}

	/**
	* Deletes the dn doanh nghiep from the database. Also notifies the appropriate model listeners.
	*
	* @param dnDoanhNghiep the dn doanh nghiep
	* @return the dn doanh nghiep that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep deleteDnDoanhNghiep(
		vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep dnDoanhNghiep)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dnDoanhNghiepLocalService.deleteDnDoanhNghiep(dnDoanhNghiep);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dnDoanhNghiepLocalService.dynamicQuery();
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
		return _dnDoanhNghiepLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dnDoanhNghiepLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dnDoanhNghiepLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _dnDoanhNghiepLocalService.dynamicQueryCount(dynamicQuery);
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
		return _dnDoanhNghiepLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep fetchDnDoanhNghiep(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _dnDoanhNghiepLocalService.fetchDnDoanhNghiep(id);
	}

	/**
	* Returns the dn doanh nghiep with the primary key.
	*
	* @param id the primary key of the dn doanh nghiep
	* @return the dn doanh nghiep
	* @throws PortalException if a dn doanh nghiep with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep getDnDoanhNghiep(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dnDoanhNghiepLocalService.getDnDoanhNghiep(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dnDoanhNghiepLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dn doanh nghieps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dn doanh nghieps
	* @param end the upper bound of the range of dn doanh nghieps (not inclusive)
	* @return the range of dn doanh nghieps
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep> getDnDoanhNghieps(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dnDoanhNghiepLocalService.getDnDoanhNghieps(start, end);
	}

	/**
	* Returns the number of dn doanh nghieps.
	*
	* @return the number of dn doanh nghieps
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDnDoanhNghiepsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dnDoanhNghiepLocalService.getDnDoanhNghiepsCount();
	}

	/**
	* Updates the dn doanh nghiep in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dnDoanhNghiep the dn doanh nghiep
	* @return the dn doanh nghiep that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep updateDnDoanhNghiep(
		vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep dnDoanhNghiep)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dnDoanhNghiepLocalService.updateDnDoanhNghiep(dnDoanhNghiep);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dnDoanhNghiepLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dnDoanhNghiepLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dnDoanhNghiepLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public int countBySoDkdk(java.lang.String soDangKyKinhDoanh) {
		return _dnDoanhNghiepLocalService.countBySoDkdk(soDangKyKinhDoanh);
	}

	@Override
	public int countByEmail(java.lang.String email) {
		return _dnDoanhNghiepLocalService.countByEmail(email);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep> findByEmail(
		java.lang.String email) {
		return _dnDoanhNghiepLocalService.findByEmail(email);
	}

	@Override
	public int countByMaSoDoanhNghiep(java.lang.String maSoDoanhNghiep) {
		return _dnDoanhNghiepLocalService.countByMaSoDoanhNghiep(maSoDoanhNghiep);
	}

	@Override
	public int countByTenDoanhNghiep(java.lang.String tenDoanhNghiep) {
		return _dnDoanhNghiepLocalService.countByTenDoanhNghiep(tenDoanhNghiep);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep> findBySDK_TDN_TCD_TT_L(
		java.lang.String soDangKy, java.lang.String tenDoanhNghiep,
		java.lang.String tenCongDan, java.lang.String trangThai,
		java.lang.String loaiNguoiLamThuTuc, int start, int end) {
		return _dnDoanhNghiepLocalService.findBySDK_TDN_TCD_TT_L(soDangKy,
			tenDoanhNghiep, tenCongDan, trangThai, loaiNguoiLamThuTuc, start,
			end);
	}

	@Override
	public int countBySDK_TDN_TCD_TT_L(java.lang.String soDangKy,
		java.lang.String tenDoanhNghiep, java.lang.String tenCongDan,
		java.lang.String trangThai, java.lang.String loaiNguoiLamThuTuc) {
		return _dnDoanhNghiepLocalService.countBySDK_TDN_TCD_TT_L(soDangKy,
			tenDoanhNghiep, tenCongDan, trangThai, loaiNguoiLamThuTuc);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DnDoanhNghiepLocalService getWrappedDnDoanhNghiepLocalService() {
		return _dnDoanhNghiepLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDnDoanhNghiepLocalService(
		DnDoanhNghiepLocalService dnDoanhNghiepLocalService) {
		_dnDoanhNghiepLocalService = dnDoanhNghiepLocalService;
	}

	@Override
	public DnDoanhNghiepLocalService getWrappedService() {
		return _dnDoanhNghiepLocalService;
	}

	@Override
	public void setWrappedService(
		DnDoanhNghiepLocalService dnDoanhNghiepLocalService) {
		_dnDoanhNghiepLocalService = dnDoanhNghiepLocalService;
	}

	private DnDoanhNghiepLocalService _dnDoanhNghiepLocalService;
}