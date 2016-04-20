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

package vn.dtt.duongbo.dao.motcua.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for MotCuaPhieuXuLy. This utility wraps
 * {@link vn.dtt.duongbo.dao.motcua.service.impl.MotCuaPhieuXuLyLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author win_64
 * @see MotCuaPhieuXuLyLocalService
 * @see vn.dtt.duongbo.dao.motcua.service.base.MotCuaPhieuXuLyLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.motcua.service.impl.MotCuaPhieuXuLyLocalServiceImpl
 * @generated
 */
public class MotCuaPhieuXuLyLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.duongbo.dao.motcua.service.impl.MotCuaPhieuXuLyLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the mot cua phieu xu ly to the database. Also notifies the appropriate model listeners.
	*
	* @param motCuaPhieuXuLy the mot cua phieu xu ly
	* @return the mot cua phieu xu ly that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy addMotCuaPhieuXuLy(
		vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy motCuaPhieuXuLy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addMotCuaPhieuXuLy(motCuaPhieuXuLy);
	}

	/**
	* Creates a new mot cua phieu xu ly with the primary key. Does not add the mot cua phieu xu ly to the database.
	*
	* @param id the primary key for the new mot cua phieu xu ly
	* @return the new mot cua phieu xu ly
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy createMotCuaPhieuXuLy(
		long id) {
		return getService().createMotCuaPhieuXuLy(id);
	}

	/**
	* Deletes the mot cua phieu xu ly with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the mot cua phieu xu ly
	* @return the mot cua phieu xu ly that was removed
	* @throws PortalException if a mot cua phieu xu ly with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy deleteMotCuaPhieuXuLy(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteMotCuaPhieuXuLy(id);
	}

	/**
	* Deletes the mot cua phieu xu ly from the database. Also notifies the appropriate model listeners.
	*
	* @param motCuaPhieuXuLy the mot cua phieu xu ly
	* @return the mot cua phieu xu ly that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy deleteMotCuaPhieuXuLy(
		vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy motCuaPhieuXuLy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteMotCuaPhieuXuLy(motCuaPhieuXuLy);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaPhieuXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaPhieuXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy fetchMotCuaPhieuXuLy(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchMotCuaPhieuXuLy(id);
	}

	/**
	* Returns the mot cua phieu xu ly with the primary key.
	*
	* @param id the primary key of the mot cua phieu xu ly
	* @return the mot cua phieu xu ly
	* @throws PortalException if a mot cua phieu xu ly with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy getMotCuaPhieuXuLy(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getMotCuaPhieuXuLy(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the mot cua phieu xu lies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaPhieuXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua phieu xu lies
	* @param end the upper bound of the range of mot cua phieu xu lies (not inclusive)
	* @return the range of mot cua phieu xu lies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> getMotCuaPhieuXuLies(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMotCuaPhieuXuLies(start, end);
	}

	/**
	* Returns the number of mot cua phieu xu lies.
	*
	* @return the number of mot cua phieu xu lies
	* @throws SystemException if a system exception occurred
	*/
	public static int getMotCuaPhieuXuLiesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMotCuaPhieuXuLiesCount();
	}

	/**
	* Updates the mot cua phieu xu ly in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param motCuaPhieuXuLy the mot cua phieu xu ly
	* @return the mot cua phieu xu ly that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy updateMotCuaPhieuXuLy(
		vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy motCuaPhieuXuLy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateMotCuaPhieuXuLy(motCuaPhieuXuLy);
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

	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy findByHoSoThuTucIdAndQuyTrinhThuTucId(
		long hoSoThuTucId, long quyTrinhThuTucId) {
		return getService()
				   .findByHoSoThuTucIdAndQuyTrinhThuTucId(hoSoThuTucId,
			quyTrinhThuTucId);
	}

	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findByHoSoThuTucId(
		long hoSoThuTucId) {
		return getService().findByHoSoThuTucId(hoSoThuTucId);
	}

	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findByToChucQuanLyId(
		long toChucQuanLy) {
		return getService().findByToChucQuanLyId(toChucQuanLy);
	}

	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findByToChucQuanLyAndPhanNhomHoSo(
		long toChucQuanLy, long phanNhomHoSoId) {
		return getService()
				   .findByToChucQuanLyAndPhanNhomHoSo(toChucQuanLy,
			phanNhomHoSoId);
	}

	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> searhMotCuaPhieuXuLy(
		long thuTucHanhChinhId, java.lang.String maSoHoSo,
		java.lang.String ngayGuiHoSoFrom, java.lang.String ngayGuiHoSoTo,
		int start, int end) {
		return getService()
				   .searhMotCuaPhieuXuLy(thuTucHanhChinhId, maSoHoSo,
			ngayGuiHoSoFrom, ngayGuiHoSoTo, start, end);
	}

	public static int countMotCuaPhieuXuLy(long thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayGuiHoSoFrom,
		java.lang.String ngayGuiHoSoTo) {
		return getService()
				   .countMotCuaPhieuXuLy(thuTucHanhChinhId, maSoHoSo,
			ngayGuiHoSoFrom, ngayGuiHoSoTo);
	}

	public static int countMotCuaPhieuXuLy(long phanNhomHoSo, long ogrId,
		java.lang.String maSoBienNhan, java.util.Date nopTuNgay,
		java.util.Date nopDenNgay, java.util.Date henTraTuNgay,
		java.util.Date henTraDenNgay, java.lang.String doanhNghiep,
		java.lang.String linhVucThuTucHanhChinh, long idThuTucHanhChinh,
		long userId, java.lang.String role) {
		return getService()
				   .countMotCuaPhieuXuLy(phanNhomHoSo, ogrId, maSoBienNhan,
			nopTuNgay, nopDenNgay, henTraTuNgay, henTraDenNgay, doanhNghiep,
			linhVucThuTucHanhChinh, idThuTucHanhChinh, userId, role);
	}

	public static int countMotCuaPhieuXuLyByPhanNhomHoSo(long phanNhomHoSo,
		long ogrId, long userId, java.lang.String role)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countMotCuaPhieuXuLyByPhanNhomHoSo(phanNhomHoSo, ogrId,
			userId, role);
	}

	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findMotCuaPhieuXuLy(
		long phanNhomHoSo, long ogrId, java.lang.String maSoBienNhan,
		java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		java.util.Date henTraTuNgay, java.util.Date henTraDenNgay,
		java.lang.String doanhNghiep, java.lang.String linhVucThuTucHanhChinh,
		long idThuTucHanhChinh, long userId, java.lang.String role, int start,
		int end) {
		return getService()
				   .findMotCuaPhieuXuLy(phanNhomHoSo, ogrId, maSoBienNhan,
			nopTuNgay, nopDenNgay, henTraTuNgay, henTraDenNgay, doanhNghiep,
			linhVucThuTucHanhChinh, idThuTucHanhChinh, userId, role, start, end);
	}

	public static int countMotCuaPhieuXuLyByTrangThai(
		java.lang.String trangThaiId) {
		return getService().countMotCuaPhieuXuLyByTrangThai(trangThaiId);
	}

	public static int layHoSoDaXuLyOrDangXuLy(long userId,
		java.lang.String trangThai, java.util.Date date) {
		return getService().layHoSoDaXuLyOrDangXuLy(userId, trangThai, date);
	}

	public static int countMotCuaPhieuXuLyByUserId_TC01(long phanNhomHoSo,
		long ogrId, java.lang.String maSoBienNhan, java.util.Date nopTuNgay,
		java.util.Date nopDenNgay, java.util.Date henTraTuNgay,
		java.util.Date henTraDenNgay, java.lang.String doanhNghiep,
		java.lang.String linhVucThuTucHanhChinh, long idThuTucHanhChinh,
		long userId) {
		return getService()
				   .countMotCuaPhieuXuLyByUserId_TC01(phanNhomHoSo, ogrId,
			maSoBienNhan, nopTuNgay, nopDenNgay, henTraTuNgay, henTraDenNgay,
			doanhNghiep, linhVucThuTucHanhChinh, idThuTucHanhChinh, userId);
	}

	public static int countMotCuaPhieuXuLyByUserId(long phanNhomHoSo,
		long ogrId, java.lang.String maSoBienNhan, java.util.Date nopTuNgay,
		java.util.Date nopDenNgay, java.util.Date henTraTuNgay,
		java.util.Date henTraDenNgay, java.lang.String doanhNghiep,
		java.lang.String linhVucThuTucHanhChinh, long idThuTucHanhChinh,
		long userId) {
		return getService()
				   .countMotCuaPhieuXuLyByUserId(phanNhomHoSo, ogrId,
			maSoBienNhan, nopTuNgay, nopDenNgay, henTraTuNgay, henTraDenNgay,
			doanhNghiep, linhVucThuTucHanhChinh, idThuTucHanhChinh, userId);
	}

	public static int countMotCuaPhieuXuLyByUserId2(long phanNhomHoSo,
		long ogrId, java.lang.String maSoBienNhan, java.util.Date nopTuNgay,
		java.util.Date nopDenNgay, java.util.Date henTraTuNgay,
		java.util.Date henTraDenNgay, java.lang.String doanhNghiep,
		java.lang.String linhVucThuTucHanhChinh, long idThuTucHanhChinh,
		long userId) {
		return getService()
				   .countMotCuaPhieuXuLyByUserId2(phanNhomHoSo, ogrId,
			maSoBienNhan, nopTuNgay, nopDenNgay, henTraTuNgay, henTraDenNgay,
			doanhNghiep, linhVucThuTucHanhChinh, idThuTucHanhChinh, userId);
	}

	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findMotCuaPhieuXuLyByUserId(
		long phanNhomHoSo, long ogrId, java.lang.String maSoBienNhan,
		java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		java.util.Date henTraTuNgay, java.util.Date henTraDenNgay,
		java.lang.String doanhNghiep, java.lang.String linhVucThuTucHanhChinh,
		long idThuTucHanhChinh, long userId, int start, int end) {
		return getService()
				   .findMotCuaPhieuXuLyByUserId(phanNhomHoSo, ogrId,
			maSoBienNhan, nopTuNgay, nopDenNgay, henTraTuNgay, henTraDenNgay,
			doanhNghiep, linhVucThuTucHanhChinh, idThuTucHanhChinh, userId,
			start, end);
	}

	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findMotCuaPhieuXuLyByUserId_TC01(
		long phanNhomHoSo, long ogrId, java.lang.String maSoBienNhan,
		java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		java.util.Date henTraTuNgay, java.util.Date henTraDenNgay,
		java.lang.String doanhNghiep, java.lang.String linhVucThuTucHanhChinh,
		long idThuTucHanhChinh, long userId, int start, int end) {
		return getService()
				   .findMotCuaPhieuXuLyByUserId_TC01(phanNhomHoSo, ogrId,
			maSoBienNhan, nopTuNgay, nopDenNgay, henTraTuNgay, henTraDenNgay,
			doanhNghiep, linhVucThuTucHanhChinh, idThuTucHanhChinh, userId,
			start, end);
	}

	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findMotCuaPhieuXuLyByUserId2(
		long phanNhomHoSo, long ogrId, java.lang.String maSoBienNhan,
		java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		java.util.Date henTraTuNgay, java.util.Date henTraDenNgay,
		java.lang.String doanhNghiep, java.lang.String linhVucThuTucHanhChinh,
		long idThuTucHanhChinh, long userId, int start, int end) {
		return getService()
				   .findMotCuaPhieuXuLyByUserId2(phanNhomHoSo, ogrId,
			maSoBienNhan, nopTuNgay, nopDenNgay, henTraTuNgay, henTraDenNgay,
			doanhNghiep, linhVucThuTucHanhChinh, idThuTucHanhChinh, userId,
			start, end);
	}

	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findMotCuaPhieuXuLyDoneByOrgid(
		long ogrId) {
		return getService().findMotCuaPhieuXuLyDoneByOrgid(ogrId);
	}

	public static int countMotCuaPhieuXuLyTrangThai(long phanNhomHoSo,
		long ogrId, java.lang.String maSoBienNhan, java.util.Date nopTuNgay,
		java.util.Date nopDenNgay, java.util.Date henTraTuNgay,
		java.util.Date henTraDenNgay, java.lang.String doanhNghiep,
		java.lang.String linhVucThuTucHanhChinh, long idThuTucHanhChinh,
		long trangThaiHienTaiId) {
		return getService()
				   .countMotCuaPhieuXuLyTrangThai(phanNhomHoSo, ogrId,
			maSoBienNhan, nopTuNgay, nopDenNgay, henTraTuNgay, henTraDenNgay,
			doanhNghiep, linhVucThuTucHanhChinh, idThuTucHanhChinh,
			trangThaiHienTaiId);
	}

	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findMotCuaPhieuXuLyTrangThai(
		long phanNhomHoSo, long ogrId, java.lang.String maSoBienNhan,
		java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		java.util.Date henTraTuNgay, java.util.Date henTraDenNgay,
		java.lang.String doanhNghiep, java.lang.String linhVucThuTucHanhChinh,
		long idThuTucHanhChinh, long trangThaiHienTaiId, int start, int end) {
		return getService()
				   .findMotCuaPhieuXuLyTrangThai(phanNhomHoSo, ogrId,
			maSoBienNhan, nopTuNgay, nopDenNgay, henTraTuNgay, henTraDenNgay,
			doanhNghiep, linhVucThuTucHanhChinh, idThuTucHanhChinh,
			trangThaiHienTaiId, start, end);
	}

	public static int countMotCuaPhieuXuLyByTrangThaiAndUserId(long ogrId,
		java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		long idThuTucHanhChinh, long userId, java.lang.String trangThaiIds) {
		return getService()
				   .countMotCuaPhieuXuLyByTrangThaiAndUserId(ogrId, nopTuNgay,
			nopDenNgay, idThuTucHanhChinh, userId, trangThaiIds);
	}

	public static int countMotCuaPhieuXuLyByTrangThaiAndUserId2(long ogrId,
		java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		long idThuTucHanhChinh, long userId, java.lang.String trangThaiIds) {
		return getService()
				   .countMotCuaPhieuXuLyByTrangThaiAndUserId2(ogrId, nopTuNgay,
			nopDenNgay, idThuTucHanhChinh, userId, trangThaiIds);
	}

	public static java.util.List<java.lang.Object> getMotCuaPhieuXuLyByTrangThaiAndUserId(
		long ogrId, java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		long idThuTucHanhChinh, long userId, java.lang.String trangThaiIds) {
		return getService()
				   .getMotCuaPhieuXuLyByTrangThaiAndUserId(ogrId, nopTuNgay,
			nopDenNgay, idThuTucHanhChinh, userId, trangThaiIds);
	}

	public static java.util.List<java.lang.Object> getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc(
		long ogrId, java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		long idThuTucHanhChinh, long userId, java.lang.String trangThaiIds) {
		return getService()
				   .getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc(ogrId,
			nopTuNgay, nopDenNgay, idThuTucHanhChinh, userId, trangThaiIds);
	}

	public static java.util.List<java.lang.Object> getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc2(
		long ogrId, java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		long idThuTucHanhChinh, long userId, java.lang.String trangThaiIds) {
		return getService()
				   .getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc2(ogrId,
			nopTuNgay, nopDenNgay, idThuTucHanhChinh, userId, trangThaiIds);
	}

	public static java.util.List<java.lang.Object> getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc3(
		long ogrId, java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		long idThuTucHanhChinh, long userId, java.lang.String trangThaiIds) {
		return getService()
				   .getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc3(ogrId,
			nopTuNgay, nopDenNgay, idThuTucHanhChinh, userId, trangThaiIds);
	}

	public static java.util.List<java.lang.Object> getMotCuaPhieuXuLyByOrgs(
		long ogrId) {
		return getService().getMotCuaPhieuXuLyByOrgs(ogrId);
	}

	public static java.util.List<java.lang.Object> getMotCuaPhieuXuLyByOrgs2(
		long ogrId) {
		return getService().getMotCuaPhieuXuLyByOrgs2(ogrId);
	}

	public static java.util.List<java.lang.Object> getMotCuaPhieuXuLyVanThuByOrgs(
		long ogrId) {
		return getService().getMotCuaPhieuXuLyVanThuByOrgs(ogrId);
	}

	public static int countMotCuaPhieuXuLyByTrangThaiVanThu(long ogrId,
		long idThuTucHanhChinh, java.lang.String trangThaiIds) {
		return getService()
				   .countMotCuaPhieuXuLyByTrangThaiVanThu(ogrId,
			idThuTucHanhChinh, trangThaiIds);
	}

	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findMotCuaPhieuXuLy_NEW(
		java.util.List<java.lang.String> lstPar, int start, int end) {
		return getService().findMotCuaPhieuXuLy_NEW(lstPar, start, end);
	}

	public static int countMotCuaPhieuXuLy_NEW(
		java.util.List<java.lang.String> lstCount) {
		return getService().countMotCuaPhieuXuLy_NEW(lstCount);
	}

	public static void clearService() {
		_service = null;
	}

	public static MotCuaPhieuXuLyLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					MotCuaPhieuXuLyLocalService.class.getName());

			if (invokableLocalService instanceof MotCuaPhieuXuLyLocalService) {
				_service = (MotCuaPhieuXuLyLocalService)invokableLocalService;
			}
			else {
				_service = new MotCuaPhieuXuLyLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(MotCuaPhieuXuLyLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(MotCuaPhieuXuLyLocalService service) {
	}

	private static MotCuaPhieuXuLyLocalService _service;
}