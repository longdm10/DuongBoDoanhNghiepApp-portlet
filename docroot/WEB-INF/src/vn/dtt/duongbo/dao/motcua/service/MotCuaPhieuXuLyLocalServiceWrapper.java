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

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MotCuaPhieuXuLyLocalService}.
 *
 * @author win_64
 * @see MotCuaPhieuXuLyLocalService
 * @generated
 */
public class MotCuaPhieuXuLyLocalServiceWrapper
	implements MotCuaPhieuXuLyLocalService,
		ServiceWrapper<MotCuaPhieuXuLyLocalService> {
	public MotCuaPhieuXuLyLocalServiceWrapper(
		MotCuaPhieuXuLyLocalService motCuaPhieuXuLyLocalService) {
		_motCuaPhieuXuLyLocalService = motCuaPhieuXuLyLocalService;
	}

	/**
	* Adds the mot cua phieu xu ly to the database. Also notifies the appropriate model listeners.
	*
	* @param motCuaPhieuXuLy the mot cua phieu xu ly
	* @return the mot cua phieu xu ly that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy addMotCuaPhieuXuLy(
		vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy motCuaPhieuXuLy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaPhieuXuLyLocalService.addMotCuaPhieuXuLy(motCuaPhieuXuLy);
	}

	/**
	* Creates a new mot cua phieu xu ly with the primary key. Does not add the mot cua phieu xu ly to the database.
	*
	* @param id the primary key for the new mot cua phieu xu ly
	* @return the new mot cua phieu xu ly
	*/
	@Override
	public vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy createMotCuaPhieuXuLy(
		long id) {
		return _motCuaPhieuXuLyLocalService.createMotCuaPhieuXuLy(id);
	}

	/**
	* Deletes the mot cua phieu xu ly with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the mot cua phieu xu ly
	* @return the mot cua phieu xu ly that was removed
	* @throws PortalException if a mot cua phieu xu ly with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy deleteMotCuaPhieuXuLy(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _motCuaPhieuXuLyLocalService.deleteMotCuaPhieuXuLy(id);
	}

	/**
	* Deletes the mot cua phieu xu ly from the database. Also notifies the appropriate model listeners.
	*
	* @param motCuaPhieuXuLy the mot cua phieu xu ly
	* @return the mot cua phieu xu ly that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy deleteMotCuaPhieuXuLy(
		vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy motCuaPhieuXuLy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaPhieuXuLyLocalService.deleteMotCuaPhieuXuLy(motCuaPhieuXuLy);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _motCuaPhieuXuLyLocalService.dynamicQuery();
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
		return _motCuaPhieuXuLyLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaPhieuXuLyLocalService.dynamicQuery(dynamicQuery, start,
			end);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaPhieuXuLyLocalService.dynamicQuery(dynamicQuery, start,
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
		return _motCuaPhieuXuLyLocalService.dynamicQueryCount(dynamicQuery);
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
		return _motCuaPhieuXuLyLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy fetchMotCuaPhieuXuLy(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaPhieuXuLyLocalService.fetchMotCuaPhieuXuLy(id);
	}

	/**
	* Returns the mot cua phieu xu ly with the primary key.
	*
	* @param id the primary key of the mot cua phieu xu ly
	* @return the mot cua phieu xu ly
	* @throws PortalException if a mot cua phieu xu ly with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy getMotCuaPhieuXuLy(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _motCuaPhieuXuLyLocalService.getMotCuaPhieuXuLy(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _motCuaPhieuXuLyLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> getMotCuaPhieuXuLies(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaPhieuXuLyLocalService.getMotCuaPhieuXuLies(start, end);
	}

	/**
	* Returns the number of mot cua phieu xu lies.
	*
	* @return the number of mot cua phieu xu lies
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getMotCuaPhieuXuLiesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaPhieuXuLyLocalService.getMotCuaPhieuXuLiesCount();
	}

	/**
	* Updates the mot cua phieu xu ly in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param motCuaPhieuXuLy the mot cua phieu xu ly
	* @return the mot cua phieu xu ly that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy updateMotCuaPhieuXuLy(
		vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy motCuaPhieuXuLy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaPhieuXuLyLocalService.updateMotCuaPhieuXuLy(motCuaPhieuXuLy);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _motCuaPhieuXuLyLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_motCuaPhieuXuLyLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _motCuaPhieuXuLyLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy findByHoSoThuTucIdAndQuyTrinhThuTucId(
		long hoSoThuTucId, long quyTrinhThuTucId) {
		return _motCuaPhieuXuLyLocalService.findByHoSoThuTucIdAndQuyTrinhThuTucId(hoSoThuTucId,
			quyTrinhThuTucId);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findByHoSoThuTucId(
		long hoSoThuTucId) {
		return _motCuaPhieuXuLyLocalService.findByHoSoThuTucId(hoSoThuTucId);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findByToChucQuanLyId(
		long toChucQuanLy) {
		return _motCuaPhieuXuLyLocalService.findByToChucQuanLyId(toChucQuanLy);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findByToChucQuanLyAndPhanNhomHoSo(
		long toChucQuanLy, long phanNhomHoSoId) {
		return _motCuaPhieuXuLyLocalService.findByToChucQuanLyAndPhanNhomHoSo(toChucQuanLy,
			phanNhomHoSoId);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> searhMotCuaPhieuXuLy(
		long thuTucHanhChinhId, java.lang.String maSoHoSo,
		java.lang.String ngayGuiHoSoFrom, java.lang.String ngayGuiHoSoTo,
		int start, int end) {
		return _motCuaPhieuXuLyLocalService.searhMotCuaPhieuXuLy(thuTucHanhChinhId,
			maSoHoSo, ngayGuiHoSoFrom, ngayGuiHoSoTo, start, end);
	}

	@Override
	public int countMotCuaPhieuXuLy(long thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayGuiHoSoFrom,
		java.lang.String ngayGuiHoSoTo) {
		return _motCuaPhieuXuLyLocalService.countMotCuaPhieuXuLy(thuTucHanhChinhId,
			maSoHoSo, ngayGuiHoSoFrom, ngayGuiHoSoTo);
	}

	@Override
	public int countMotCuaPhieuXuLy(long phanNhomHoSo, long ogrId,
		java.lang.String maSoBienNhan, java.util.Date nopTuNgay,
		java.util.Date nopDenNgay, java.util.Date henTraTuNgay,
		java.util.Date henTraDenNgay, java.lang.String doanhNghiep,
		java.lang.String linhVucThuTucHanhChinh, long idThuTucHanhChinh,
		long userId, java.lang.String role) {
		return _motCuaPhieuXuLyLocalService.countMotCuaPhieuXuLy(phanNhomHoSo,
			ogrId, maSoBienNhan, nopTuNgay, nopDenNgay, henTraTuNgay,
			henTraDenNgay, doanhNghiep, linhVucThuTucHanhChinh,
			idThuTucHanhChinh, userId, role);
	}

	@Override
	public int countMotCuaPhieuXuLyByPhanNhomHoSo(long phanNhomHoSo,
		long ogrId, long userId, java.lang.String role)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaPhieuXuLyLocalService.countMotCuaPhieuXuLyByPhanNhomHoSo(phanNhomHoSo,
			ogrId, userId, role);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findMotCuaPhieuXuLy(
		long phanNhomHoSo, long ogrId, java.lang.String maSoBienNhan,
		java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		java.util.Date henTraTuNgay, java.util.Date henTraDenNgay,
		java.lang.String doanhNghiep, java.lang.String linhVucThuTucHanhChinh,
		long idThuTucHanhChinh, long userId, java.lang.String role, int start,
		int end) {
		return _motCuaPhieuXuLyLocalService.findMotCuaPhieuXuLy(phanNhomHoSo,
			ogrId, maSoBienNhan, nopTuNgay, nopDenNgay, henTraTuNgay,
			henTraDenNgay, doanhNghiep, linhVucThuTucHanhChinh,
			idThuTucHanhChinh, userId, role, start, end);
	}

	@Override
	public int countMotCuaPhieuXuLyByTrangThai(java.lang.String trangThaiId) {
		return _motCuaPhieuXuLyLocalService.countMotCuaPhieuXuLyByTrangThai(trangThaiId);
	}

	@Override
	public int layHoSoDaXuLyOrDangXuLy(long userId, java.lang.String trangThai,
		java.util.Date date) {
		return _motCuaPhieuXuLyLocalService.layHoSoDaXuLyOrDangXuLy(userId,
			trangThai, date);
	}

	@Override
	public int countMotCuaPhieuXuLyByUserId_TC01(long phanNhomHoSo, long ogrId,
		java.lang.String maSoBienNhan, java.util.Date nopTuNgay,
		java.util.Date nopDenNgay, java.util.Date henTraTuNgay,
		java.util.Date henTraDenNgay, java.lang.String doanhNghiep,
		java.lang.String linhVucThuTucHanhChinh, long idThuTucHanhChinh,
		long userId) {
		return _motCuaPhieuXuLyLocalService.countMotCuaPhieuXuLyByUserId_TC01(phanNhomHoSo,
			ogrId, maSoBienNhan, nopTuNgay, nopDenNgay, henTraTuNgay,
			henTraDenNgay, doanhNghiep, linhVucThuTucHanhChinh,
			idThuTucHanhChinh, userId);
	}

	@Override
	public int countMotCuaPhieuXuLyByUserId(long phanNhomHoSo, long ogrId,
		java.lang.String maSoBienNhan, java.util.Date nopTuNgay,
		java.util.Date nopDenNgay, java.util.Date henTraTuNgay,
		java.util.Date henTraDenNgay, java.lang.String doanhNghiep,
		java.lang.String linhVucThuTucHanhChinh, long idThuTucHanhChinh,
		long userId) {
		return _motCuaPhieuXuLyLocalService.countMotCuaPhieuXuLyByUserId(phanNhomHoSo,
			ogrId, maSoBienNhan, nopTuNgay, nopDenNgay, henTraTuNgay,
			henTraDenNgay, doanhNghiep, linhVucThuTucHanhChinh,
			idThuTucHanhChinh, userId);
	}

	@Override
	public int countMotCuaPhieuXuLyByUserId2(long phanNhomHoSo, long ogrId,
		java.lang.String maSoBienNhan, java.util.Date nopTuNgay,
		java.util.Date nopDenNgay, java.util.Date henTraTuNgay,
		java.util.Date henTraDenNgay, java.lang.String doanhNghiep,
		java.lang.String linhVucThuTucHanhChinh, long idThuTucHanhChinh,
		long userId) {
		return _motCuaPhieuXuLyLocalService.countMotCuaPhieuXuLyByUserId2(phanNhomHoSo,
			ogrId, maSoBienNhan, nopTuNgay, nopDenNgay, henTraTuNgay,
			henTraDenNgay, doanhNghiep, linhVucThuTucHanhChinh,
			idThuTucHanhChinh, userId);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findMotCuaPhieuXuLyByUserId(
		long phanNhomHoSo, long ogrId, java.lang.String maSoBienNhan,
		java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		java.util.Date henTraTuNgay, java.util.Date henTraDenNgay,
		java.lang.String doanhNghiep, java.lang.String linhVucThuTucHanhChinh,
		long idThuTucHanhChinh, long userId, int start, int end) {
		return _motCuaPhieuXuLyLocalService.findMotCuaPhieuXuLyByUserId(phanNhomHoSo,
			ogrId, maSoBienNhan, nopTuNgay, nopDenNgay, henTraTuNgay,
			henTraDenNgay, doanhNghiep, linhVucThuTucHanhChinh,
			idThuTucHanhChinh, userId, start, end);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findMotCuaPhieuXuLyByUserId_TC01(
		long phanNhomHoSo, long ogrId, java.lang.String maSoBienNhan,
		java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		java.util.Date henTraTuNgay, java.util.Date henTraDenNgay,
		java.lang.String doanhNghiep, java.lang.String linhVucThuTucHanhChinh,
		long idThuTucHanhChinh, long userId, int start, int end) {
		return _motCuaPhieuXuLyLocalService.findMotCuaPhieuXuLyByUserId_TC01(phanNhomHoSo,
			ogrId, maSoBienNhan, nopTuNgay, nopDenNgay, henTraTuNgay,
			henTraDenNgay, doanhNghiep, linhVucThuTucHanhChinh,
			idThuTucHanhChinh, userId, start, end);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findMotCuaPhieuXuLyByUserId2(
		long phanNhomHoSo, long ogrId, java.lang.String maSoBienNhan,
		java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		java.util.Date henTraTuNgay, java.util.Date henTraDenNgay,
		java.lang.String doanhNghiep, java.lang.String linhVucThuTucHanhChinh,
		long idThuTucHanhChinh, long userId, int start, int end) {
		return _motCuaPhieuXuLyLocalService.findMotCuaPhieuXuLyByUserId2(phanNhomHoSo,
			ogrId, maSoBienNhan, nopTuNgay, nopDenNgay, henTraTuNgay,
			henTraDenNgay, doanhNghiep, linhVucThuTucHanhChinh,
			idThuTucHanhChinh, userId, start, end);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findMotCuaPhieuXuLyDoneByOrgid(
		long ogrId) {
		return _motCuaPhieuXuLyLocalService.findMotCuaPhieuXuLyDoneByOrgid(ogrId);
	}

	@Override
	public int countMotCuaPhieuXuLyTrangThai(long phanNhomHoSo, long ogrId,
		java.lang.String maSoBienNhan, java.util.Date nopTuNgay,
		java.util.Date nopDenNgay, java.util.Date henTraTuNgay,
		java.util.Date henTraDenNgay, java.lang.String doanhNghiep,
		java.lang.String linhVucThuTucHanhChinh, long idThuTucHanhChinh,
		long trangThaiHienTaiId) {
		return _motCuaPhieuXuLyLocalService.countMotCuaPhieuXuLyTrangThai(phanNhomHoSo,
			ogrId, maSoBienNhan, nopTuNgay, nopDenNgay, henTraTuNgay,
			henTraDenNgay, doanhNghiep, linhVucThuTucHanhChinh,
			idThuTucHanhChinh, trangThaiHienTaiId);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findMotCuaPhieuXuLyTrangThai(
		long phanNhomHoSo, long ogrId, java.lang.String maSoBienNhan,
		java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		java.util.Date henTraTuNgay, java.util.Date henTraDenNgay,
		java.lang.String doanhNghiep, java.lang.String linhVucThuTucHanhChinh,
		long idThuTucHanhChinh, long trangThaiHienTaiId, int start, int end) {
		return _motCuaPhieuXuLyLocalService.findMotCuaPhieuXuLyTrangThai(phanNhomHoSo,
			ogrId, maSoBienNhan, nopTuNgay, nopDenNgay, henTraTuNgay,
			henTraDenNgay, doanhNghiep, linhVucThuTucHanhChinh,
			idThuTucHanhChinh, trangThaiHienTaiId, start, end);
	}

	@Override
	public int countMotCuaPhieuXuLyByTrangThaiAndUserId(long ogrId,
		java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		long idThuTucHanhChinh, long userId, java.lang.String trangThaiIds) {
		return _motCuaPhieuXuLyLocalService.countMotCuaPhieuXuLyByTrangThaiAndUserId(ogrId,
			nopTuNgay, nopDenNgay, idThuTucHanhChinh, userId, trangThaiIds);
	}

	@Override
	public int countMotCuaPhieuXuLyByTrangThaiAndUserId2(long ogrId,
		java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		long idThuTucHanhChinh, long userId, java.lang.String trangThaiIds) {
		return _motCuaPhieuXuLyLocalService.countMotCuaPhieuXuLyByTrangThaiAndUserId2(ogrId,
			nopTuNgay, nopDenNgay, idThuTucHanhChinh, userId, trangThaiIds);
	}

	@Override
	public java.util.List<java.lang.Object> getMotCuaPhieuXuLyByTrangThaiAndUserId(
		long ogrId, java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		long idThuTucHanhChinh, long userId, java.lang.String trangThaiIds) {
		return _motCuaPhieuXuLyLocalService.getMotCuaPhieuXuLyByTrangThaiAndUserId(ogrId,
			nopTuNgay, nopDenNgay, idThuTucHanhChinh, userId, trangThaiIds);
	}

	@Override
	public java.util.List<java.lang.Object> getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc(
		long ogrId, java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		long idThuTucHanhChinh, long userId, java.lang.String trangThaiIds) {
		return _motCuaPhieuXuLyLocalService.getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc(ogrId,
			nopTuNgay, nopDenNgay, idThuTucHanhChinh, userId, trangThaiIds);
	}

	@Override
	public java.util.List<java.lang.Object> getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc2(
		long ogrId, java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		long idThuTucHanhChinh, long userId, java.lang.String trangThaiIds) {
		return _motCuaPhieuXuLyLocalService.getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc2(ogrId,
			nopTuNgay, nopDenNgay, idThuTucHanhChinh, userId, trangThaiIds);
	}

	@Override
	public java.util.List<java.lang.Object> getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc3(
		long ogrId, java.util.Date nopTuNgay, java.util.Date nopDenNgay,
		long idThuTucHanhChinh, long userId, java.lang.String trangThaiIds) {
		return _motCuaPhieuXuLyLocalService.getMotCuaPhieuXuLyByTrangThaiAndUserIdAndThuTuc3(ogrId,
			nopTuNgay, nopDenNgay, idThuTucHanhChinh, userId, trangThaiIds);
	}

	@Override
	public java.util.List<java.lang.Object> getMotCuaPhieuXuLyByOrgs(long ogrId) {
		return _motCuaPhieuXuLyLocalService.getMotCuaPhieuXuLyByOrgs(ogrId);
	}

	@Override
	public java.util.List<java.lang.Object> getMotCuaPhieuXuLyByOrgs2(
		long ogrId) {
		return _motCuaPhieuXuLyLocalService.getMotCuaPhieuXuLyByOrgs2(ogrId);
	}

	@Override
	public java.util.List<java.lang.Object> getMotCuaPhieuXuLyVanThuByOrgs(
		long ogrId) {
		return _motCuaPhieuXuLyLocalService.getMotCuaPhieuXuLyVanThuByOrgs(ogrId);
	}

	@Override
	public int countMotCuaPhieuXuLyByTrangThaiVanThu(long ogrId,
		long idThuTucHanhChinh, java.lang.String trangThaiIds) {
		return _motCuaPhieuXuLyLocalService.countMotCuaPhieuXuLyByTrangThaiVanThu(ogrId,
			idThuTucHanhChinh, trangThaiIds);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findMotCuaPhieuXuLy_NEW(
		java.util.List<java.lang.String> lstPar, int start, int end) {
		return _motCuaPhieuXuLyLocalService.findMotCuaPhieuXuLy_NEW(lstPar,
			start, end);
	}

	@Override
	public int countMotCuaPhieuXuLy_NEW(
		java.util.List<java.lang.String> lstCount) {
		return _motCuaPhieuXuLyLocalService.countMotCuaPhieuXuLy_NEW(lstCount);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public MotCuaPhieuXuLyLocalService getWrappedMotCuaPhieuXuLyLocalService() {
		return _motCuaPhieuXuLyLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedMotCuaPhieuXuLyLocalService(
		MotCuaPhieuXuLyLocalService motCuaPhieuXuLyLocalService) {
		_motCuaPhieuXuLyLocalService = motCuaPhieuXuLyLocalService;
	}

	@Override
	public MotCuaPhieuXuLyLocalService getWrappedService() {
		return _motCuaPhieuXuLyLocalService;
	}

	@Override
	public void setWrappedService(
		MotCuaPhieuXuLyLocalService motCuaPhieuXuLyLocalService) {
		_motCuaPhieuXuLyLocalService = motCuaPhieuXuLyLocalService;
	}

	private MotCuaPhieuXuLyLocalService _motCuaPhieuXuLyLocalService;
}