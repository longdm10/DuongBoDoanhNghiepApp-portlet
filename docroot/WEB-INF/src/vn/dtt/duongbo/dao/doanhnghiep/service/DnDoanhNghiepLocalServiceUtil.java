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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for DnDoanhNghiep. This utility wraps
 * {@link vn.dtt.duongbo.dao.doanhnghiep.service.impl.DnDoanhNghiepLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author win_64
 * @see DnDoanhNghiepLocalService
 * @see vn.dtt.duongbo.dao.doanhnghiep.service.base.DnDoanhNghiepLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.doanhnghiep.service.impl.DnDoanhNghiepLocalServiceImpl
 * @generated
 */
public class DnDoanhNghiepLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.duongbo.dao.doanhnghiep.service.impl.DnDoanhNghiepLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the dn doanh nghiep to the database. Also notifies the appropriate model listeners.
	*
	* @param dnDoanhNghiep the dn doanh nghiep
	* @return the dn doanh nghiep that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep addDnDoanhNghiep(
		vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep dnDoanhNghiep)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDnDoanhNghiep(dnDoanhNghiep);
	}

	/**
	* Creates a new dn doanh nghiep with the primary key. Does not add the dn doanh nghiep to the database.
	*
	* @param id the primary key for the new dn doanh nghiep
	* @return the new dn doanh nghiep
	*/
	public static vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep createDnDoanhNghiep(
		long id) {
		return getService().createDnDoanhNghiep(id);
	}

	/**
	* Deletes the dn doanh nghiep with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dn doanh nghiep
	* @return the dn doanh nghiep that was removed
	* @throws PortalException if a dn doanh nghiep with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep deleteDnDoanhNghiep(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDnDoanhNghiep(id);
	}

	/**
	* Deletes the dn doanh nghiep from the database. Also notifies the appropriate model listeners.
	*
	* @param dnDoanhNghiep the dn doanh nghiep
	* @return the dn doanh nghiep that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep deleteDnDoanhNghiep(
		vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep dnDoanhNghiep)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDnDoanhNghiep(dnDoanhNghiep);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep fetchDnDoanhNghiep(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDnDoanhNghiep(id);
	}

	/**
	* Returns the dn doanh nghiep with the primary key.
	*
	* @param id the primary key of the dn doanh nghiep
	* @return the dn doanh nghiep
	* @throws PortalException if a dn doanh nghiep with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep getDnDoanhNghiep(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDnDoanhNghiep(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep> getDnDoanhNghieps(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDnDoanhNghieps(start, end);
	}

	/**
	* Returns the number of dn doanh nghieps.
	*
	* @return the number of dn doanh nghieps
	* @throws SystemException if a system exception occurred
	*/
	public static int getDnDoanhNghiepsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDnDoanhNghiepsCount();
	}

	/**
	* Updates the dn doanh nghiep in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dnDoanhNghiep the dn doanh nghiep
	* @return the dn doanh nghiep that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep updateDnDoanhNghiep(
		vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep dnDoanhNghiep)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDnDoanhNghiep(dnDoanhNghiep);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static int countBySoDkdk(java.lang.String soDangKyKinhDoanh) {
		return getService().countBySoDkdk(soDangKyKinhDoanh);
	}

	public static int countByEmail(java.lang.String email) {
		return getService().countByEmail(email);
	}

	public static java.util.List<vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep> findByEmail(
		java.lang.String email) {
		return getService().findByEmail(email);
	}

	public static int countByMaSoDoanhNghiep(java.lang.String maSoDoanhNghiep) {
		return getService().countByMaSoDoanhNghiep(maSoDoanhNghiep);
	}

	public static int countByTenDoanhNghiep(java.lang.String tenDoanhNghiep) {
		return getService().countByTenDoanhNghiep(tenDoanhNghiep);
	}

	public static java.util.List<vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep> findBySDK_TDN_TCD_TT_L(
		java.lang.String soDangKy, java.lang.String tenDoanhNghiep,
		java.lang.String tenCongDan, java.lang.String trangThai,
		java.lang.String loaiNguoiLamThuTuc, int start, int end) {
		return getService()
				   .findBySDK_TDN_TCD_TT_L(soDangKy, tenDoanhNghiep,
			tenCongDan, trangThai, loaiNguoiLamThuTuc, start, end);
	}

	public static int countBySDK_TDN_TCD_TT_L(java.lang.String soDangKy,
		java.lang.String tenDoanhNghiep, java.lang.String tenCongDan,
		java.lang.String trangThai, java.lang.String loaiNguoiLamThuTuc) {
		return getService()
				   .countBySDK_TDN_TCD_TT_L(soDangKy, tenDoanhNghiep,
			tenCongDan, trangThai, loaiNguoiLamThuTuc);
	}

	public static void clearService() {
		_service = null;
	}

	public static DnDoanhNghiepLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DnDoanhNghiepLocalService.class.getName());

			if (invokableLocalService instanceof DnDoanhNghiepLocalService) {
				_service = (DnDoanhNghiepLocalService)invokableLocalService;
			}
			else {
				_service = new DnDoanhNghiepLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(DnDoanhNghiepLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(DnDoanhNghiepLocalService service) {
	}

	private static DnDoanhNghiepLocalService _service;
}