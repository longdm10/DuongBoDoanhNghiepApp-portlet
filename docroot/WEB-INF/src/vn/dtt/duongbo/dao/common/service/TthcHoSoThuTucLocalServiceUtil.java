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

package vn.dtt.duongbo.dao.common.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for TthcHoSoThuTuc. This utility wraps
 * {@link vn.dtt.duongbo.dao.common.service.impl.TthcHoSoThuTucLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author win_64
 * @see TthcHoSoThuTucLocalService
 * @see vn.dtt.duongbo.dao.common.service.base.TthcHoSoThuTucLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.common.service.impl.TthcHoSoThuTucLocalServiceImpl
 * @generated
 */
public class TthcHoSoThuTucLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.duongbo.dao.common.service.impl.TthcHoSoThuTucLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the tthc ho so thu tuc to the database. Also notifies the appropriate model listeners.
	*
	* @param tthcHoSoThuTuc the tthc ho so thu tuc
	* @return the tthc ho so thu tuc that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc addTthcHoSoThuTuc(
		vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc tthcHoSoThuTuc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addTthcHoSoThuTuc(tthcHoSoThuTuc);
	}

	/**
	* Creates a new tthc ho so thu tuc with the primary key. Does not add the tthc ho so thu tuc to the database.
	*
	* @param id the primary key for the new tthc ho so thu tuc
	* @return the new tthc ho so thu tuc
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc createTthcHoSoThuTuc(
		long id) {
		return getService().createTthcHoSoThuTuc(id);
	}

	/**
	* Deletes the tthc ho so thu tuc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tthc ho so thu tuc
	* @return the tthc ho so thu tuc that was removed
	* @throws PortalException if a tthc ho so thu tuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc deleteTthcHoSoThuTuc(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteTthcHoSoThuTuc(id);
	}

	/**
	* Deletes the tthc ho so thu tuc from the database. Also notifies the appropriate model listeners.
	*
	* @param tthcHoSoThuTuc the tthc ho so thu tuc
	* @return the tthc ho so thu tuc that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc deleteTthcHoSoThuTuc(
		vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc tthcHoSoThuTuc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteTthcHoSoThuTuc(tthcHoSoThuTuc);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcHoSoThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcHoSoThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc fetchTthcHoSoThuTuc(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchTthcHoSoThuTuc(id);
	}

	/**
	* Returns the tthc ho so thu tuc with the primary key.
	*
	* @param id the primary key of the tthc ho so thu tuc
	* @return the tthc ho so thu tuc
	* @throws PortalException if a tthc ho so thu tuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc getTthcHoSoThuTuc(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getTthcHoSoThuTuc(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the tthc ho so thu tucs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcHoSoThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc ho so thu tucs
	* @param end the upper bound of the range of tthc ho so thu tucs (not inclusive)
	* @return the range of tthc ho so thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc> getTthcHoSoThuTucs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTthcHoSoThuTucs(start, end);
	}

	/**
	* Returns the number of tthc ho so thu tucs.
	*
	* @return the number of tthc ho so thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public static int getTthcHoSoThuTucsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTthcHoSoThuTucsCount();
	}

	/**
	* Updates the tthc ho so thu tuc in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tthcHoSoThuTuc the tthc ho so thu tuc
	* @return the tthc ho so thu tuc that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc updateTthcHoSoThuTuc(
		vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc tthcHoSoThuTuc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTthcHoSoThuTuc(tthcHoSoThuTuc);
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

	public static vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc updateHoSoThuTuc(
		long userId, long nguoiLamThuTucId, long hoSoThuTucId,
		long thuTucHanhChinhId, long thanhPhanHoSoId, long bieuMauHoSoId,
		java.lang.String trangThaiHoSoThuTuc, long phanNhomHoSoId,
		long organizationId, java.lang.String noiDungXML,
		int trangThaiNoiDungHoSo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateHoSoThuTuc(userId, nguoiLamThuTucId, hoSoThuTucId,
			thuTucHanhChinhId, thanhPhanHoSoId, bieuMauHoSoId,
			trangThaiHoSoThuTuc, phanNhomHoSoId, organizationId, noiDungXML,
			trangThaiNoiDungHoSo);
	}

	public static vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc findByMaSoHoSo(
		java.lang.String maSoHoSo) {
		return getService().findByMaSoHoSo(maSoHoSo);
	}

	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc> getByNguoiLamThuTucId(
		long nguoiLamThuTucId) {
		return getService().getByNguoiLamThuTucId(nguoiLamThuTucId);
	}

	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc> getByNguoiLamThuTucIdAndThuTucHanhChinhId(
		long nguoiLamThuTucId, long thuTucHanhChinhId) {
		return getService()
				   .getByNguoiLamThuTucIdAndThuTucHanhChinhId(nguoiLamThuTucId,
			thuTucHanhChinhId);
	}

	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc> findByNguoiTaoAndThuTucHanhChinhId(
		long nguoiTao, long thuTucHanhChinhId) {
		return getService()
				   .findByNguoiTaoAndThuTucHanhChinhId(nguoiTao,
			thuTucHanhChinhId);
	}

	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc> searchQuanLyHoSo(
		java.lang.String maBienNhan, java.lang.String thuTucHanhChinhId,
		long userLoginId, long phanNhomHoSoId, int start, int end) {
		return getService()
				   .searchQuanLyHoSo(maBienNhan, thuTucHanhChinhId,
			userLoginId, phanNhomHoSoId, start, end);
	}

	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc> findHoSoByNguoiLamThuTucIdAndMaTrangThai(
		long nguoiLamThuTucId, java.lang.String maTrangThai) {
		return getService()
				   .findHoSoByNguoiLamThuTucIdAndMaTrangThai(nguoiLamThuTucId,
			maTrangThai);
	}

	public static int countQuanLyHoSo(java.lang.String maBienNhan,
		java.lang.String thuTucHanhChinhId, long userLoginId,
		long phanNhomHoSoId) {
		return getService()
				   .countQuanLyHoSo(maBienNhan, thuTucHanhChinhId, userLoginId,
			phanNhomHoSoId);
	}

	public static int countByGroupMaTrangThaiDoanhNghiepAndNguoiLamThuTucId(
		java.lang.String groupMaTrangThaiDoanhNghiep, long nguoiLamThuTucId) {
		return getService()
				   .countByGroupMaTrangThaiDoanhNghiepAndNguoiLamThuTucId(groupMaTrangThaiDoanhNghiep,
			nguoiLamThuTucId);
	}

	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc> searchQuanLyHoSoInPhanNhomGroup(
		java.lang.String maBienNhan, java.lang.String thuTucHanhChinhId,
		long userLoginId, java.lang.String groupPhanNhomHoSoId, int start,
		int end) {
		return getService()
				   .searchQuanLyHoSoInPhanNhomGroup(maBienNhan,
			thuTucHanhChinhId, userLoginId, groupPhanNhomHoSoId, start, end);
	}

	public static int countQuanLyHoSoInPhanNhomGroup(
		java.lang.String maBienNhan, java.lang.String thuTucHanhChinhId,
		long userLoginId, java.lang.String groupPhanNhomHoSoId) {
		return getService()
				   .countQuanLyHoSoInPhanNhomGroup(maBienNhan,
			thuTucHanhChinhId, userLoginId, groupPhanNhomHoSoId);
	}

	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc> searchQuanLyHoSoInPhanNhomHoSoDoanhNghiep(
		java.lang.String linhVucThuTuc, java.lang.String maBienNhan,
		java.lang.String thuTucHanhChinhId, long userLoginId,
		java.lang.String groupTrangThaiDoanhNghiepCode, int start, int end) {
		return getService()
				   .searchQuanLyHoSoInPhanNhomHoSoDoanhNghiep(linhVucThuTuc,
			maBienNhan, thuTucHanhChinhId, userLoginId,
			groupTrangThaiDoanhNghiepCode, start, end);
	}

	public static int countQuanLyHoSoInPhanNhomHoSoDoanhNghiep(
		java.lang.String linhVucThuTuc, java.lang.String maBienNhan,
		java.lang.String thuTucHanhChinhId, long userLoginId,
		java.lang.String groupTrangThaiDoanhNghiepCode) {
		return getService()
				   .countQuanLyHoSoInPhanNhomHoSoDoanhNghiep(linhVucThuTuc,
			maBienNhan, thuTucHanhChinhId, userLoginId,
			groupTrangThaiDoanhNghiepCode);
	}

	public static int countHoSoThuTucByPhanNhomHoSoIdAndNguoiLamThuTucId(
		long phanNhomHoSoId, long nguoiLamThuTucId) {
		return getService()
				   .countHoSoThuTucByPhanNhomHoSoIdAndNguoiLamThuTucId(phanNhomHoSoId,
			nguoiLamThuTucId);
	}

	public static int countByPhanNhomHoSoIdGroupAndNguoiLamThuTucId(
		java.lang.String phanNhomHoSoIdGroup, long nguoiLamThuTucId) {
		return getService()
				   .countByPhanNhomHoSoIdGroupAndNguoiLamThuTucId(phanNhomHoSoIdGroup,
			nguoiLamThuTucId);
	}

	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc> findByUserAndThuTucHanhChinhId(
		long userLoginId, long thuTucHanhChinhId) {
		return getService()
				   .findByUserAndThuTucHanhChinhId(userLoginId,
			thuTucHanhChinhId);
	}

	public static java.lang.String maxMaBienNhan(java.util.Date date) {
		return getService().maxMaBienNhan(date);
	}

	public static java.lang.String maxMaSoHoSo(
		java.lang.String soDangKyKinhDoanh) {
		return getService().maxMaSoHoSo(soDangKyKinhDoanh);
	}

	public static int countHoSoThuTucByTrangThai(java.lang.String trangThaiId) {
		return getService().countHoSoThuTucByTrangThai(trangThaiId);
	}

	public static void clearService() {
		_service = null;
	}

	public static TthcHoSoThuTucLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					TthcHoSoThuTucLocalService.class.getName());

			if (invokableLocalService instanceof TthcHoSoThuTucLocalService) {
				_service = (TthcHoSoThuTucLocalService)invokableLocalService;
			}
			else {
				_service = new TthcHoSoThuTucLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(TthcHoSoThuTucLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(TthcHoSoThuTucLocalService service) {
	}

	private static TthcHoSoThuTucLocalService _service;
}