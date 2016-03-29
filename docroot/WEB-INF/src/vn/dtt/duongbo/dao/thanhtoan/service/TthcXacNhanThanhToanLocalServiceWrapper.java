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

package vn.dtt.duongbo.dao.thanhtoan.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TthcXacNhanThanhToanLocalService}.
 *
 * @author win_64
 * @see TthcXacNhanThanhToanLocalService
 * @generated
 */
public class TthcXacNhanThanhToanLocalServiceWrapper
	implements TthcXacNhanThanhToanLocalService,
		ServiceWrapper<TthcXacNhanThanhToanLocalService> {
	public TthcXacNhanThanhToanLocalServiceWrapper(
		TthcXacNhanThanhToanLocalService tthcXacNhanThanhToanLocalService) {
		_tthcXacNhanThanhToanLocalService = tthcXacNhanThanhToanLocalService;
	}

	/**
	* Adds the tthc xac nhan thanh toan to the database. Also notifies the appropriate model listeners.
	*
	* @param tthcXacNhanThanhToan the tthc xac nhan thanh toan
	* @return the tthc xac nhan thanh toan that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan addTthcXacNhanThanhToan(
		vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan tthcXacNhanThanhToan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcXacNhanThanhToanLocalService.addTthcXacNhanThanhToan(tthcXacNhanThanhToan);
	}

	/**
	* Creates a new tthc xac nhan thanh toan with the primary key. Does not add the tthc xac nhan thanh toan to the database.
	*
	* @param id the primary key for the new tthc xac nhan thanh toan
	* @return the new tthc xac nhan thanh toan
	*/
	@Override
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan createTthcXacNhanThanhToan(
		long id) {
		return _tthcXacNhanThanhToanLocalService.createTthcXacNhanThanhToan(id);
	}

	/**
	* Deletes the tthc xac nhan thanh toan with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tthc xac nhan thanh toan
	* @return the tthc xac nhan thanh toan that was removed
	* @throws PortalException if a tthc xac nhan thanh toan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan deleteTthcXacNhanThanhToan(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tthcXacNhanThanhToanLocalService.deleteTthcXacNhanThanhToan(id);
	}

	/**
	* Deletes the tthc xac nhan thanh toan from the database. Also notifies the appropriate model listeners.
	*
	* @param tthcXacNhanThanhToan the tthc xac nhan thanh toan
	* @return the tthc xac nhan thanh toan that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan deleteTthcXacNhanThanhToan(
		vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan tthcXacNhanThanhToan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcXacNhanThanhToanLocalService.deleteTthcXacNhanThanhToan(tthcXacNhanThanhToan);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tthcXacNhanThanhToanLocalService.dynamicQuery();
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
		return _tthcXacNhanThanhToanLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcXacNhanThanhToanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tthcXacNhanThanhToanLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcXacNhanThanhToanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tthcXacNhanThanhToanLocalService.dynamicQuery(dynamicQuery,
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
		return _tthcXacNhanThanhToanLocalService.dynamicQueryCount(dynamicQuery);
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
		return _tthcXacNhanThanhToanLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan fetchTthcXacNhanThanhToan(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcXacNhanThanhToanLocalService.fetchTthcXacNhanThanhToan(id);
	}

	/**
	* Returns the tthc xac nhan thanh toan with the primary key.
	*
	* @param id the primary key of the tthc xac nhan thanh toan
	* @return the tthc xac nhan thanh toan
	* @throws PortalException if a tthc xac nhan thanh toan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan getTthcXacNhanThanhToan(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tthcXacNhanThanhToanLocalService.getTthcXacNhanThanhToan(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tthcXacNhanThanhToanLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the tthc xac nhan thanh toans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcXacNhanThanhToanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc xac nhan thanh toans
	* @param end the upper bound of the range of tthc xac nhan thanh toans (not inclusive)
	* @return the range of tthc xac nhan thanh toans
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan> getTthcXacNhanThanhToans(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcXacNhanThanhToanLocalService.getTthcXacNhanThanhToans(start,
			end);
	}

	/**
	* Returns the number of tthc xac nhan thanh toans.
	*
	* @return the number of tthc xac nhan thanh toans
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTthcXacNhanThanhToansCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcXacNhanThanhToanLocalService.getTthcXacNhanThanhToansCount();
	}

	/**
	* Updates the tthc xac nhan thanh toan in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tthcXacNhanThanhToan the tthc xac nhan thanh toan
	* @return the tthc xac nhan thanh toan that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan updateTthcXacNhanThanhToan(
		vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan tthcXacNhanThanhToan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcXacNhanThanhToanLocalService.updateTthcXacNhanThanhToan(tthcXacNhanThanhToan);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _tthcXacNhanThanhToanLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tthcXacNhanThanhToanLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tthcXacNhanThanhToanLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan> findAll() {
		return _tthcXacNhanThanhToanLocalService.findAll();
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan> findByToChucQuanLy(
		long toChucQuanLy) {
		return _tthcXacNhanThanhToanLocalService.findByToChucQuanLy(toChucQuanLy);
	}

	@Override
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan findByMaTuSinh(
		java.lang.String maTuSinh) {
		return _tthcXacNhanThanhToanLocalService.findByMaTuSinh(maTuSinh);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan> findByTrangThaiXacNhanAndToChucQuanLy(
		long toChucQuanLy, java.lang.String trangThai, int start, int end) {
		return _tthcXacNhanThanhToanLocalService.findByTrangThaiXacNhanAndToChucQuanLy(toChucQuanLy,
			trangThai, start, end);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan> findTthcXacNhanThanhToan(
		java.lang.String maGiaoDich, java.lang.String loaiGiaoDich,
		java.lang.String hinhThucThanhToan, long toChucQuanLy,
		java.lang.String trangThai, java.lang.String trangThaiSearch,
		java.util.Date tuNgay, java.util.Date denNGay,
		java.lang.String tenDoanhNGhiep, int year, int start, int end) {
		return _tthcXacNhanThanhToanLocalService.findTthcXacNhanThanhToan(maGiaoDich,
			loaiGiaoDich, hinhThucThanhToan, toChucQuanLy, trangThai,
			trangThaiSearch, tuNgay, denNGay, tenDoanhNGhiep, year, start, end);
	}

	@Override
	public int countTthcXacNhanThanhToan(java.lang.String maGiaoDich,
		java.lang.String loaiGiaoDich, java.lang.String hinhThucThanhToan,
		long toChucQuanLy, java.lang.String trangThai,
		java.lang.String trangThaiSearch, java.util.Date tuNgay,
		java.util.Date denNGay, java.lang.String tenDoanhNGhiep, int year) {
		return _tthcXacNhanThanhToanLocalService.countTthcXacNhanThanhToan(maGiaoDich,
			loaiGiaoDich, hinhThucThanhToan, toChucQuanLy, trangThai,
			trangThaiSearch, tuNgay, denNGay, tenDoanhNGhiep, year);
	}

	@Override
	public int countByTrangThaiXacNhanAndToChucQuanLy(long toChucQuanLy,
		java.lang.String trangThai) {
		return _tthcXacNhanThanhToanLocalService.countByTrangThaiXacNhanAndToChucQuanLy(toChucQuanLy,
			trangThai);
	}

	@Override
	public int sumTienByTrangThaiXacNhanAndToChucQuanLy(int hinhthucthanhtoan,
		java.lang.String loaiPhi, int trangThai, long tochucquanly,
		java.util.Date ngayGiaoDichTu, java.util.Date ngayGiaoDichDen) {
		return _tthcXacNhanThanhToanLocalService.sumTienByTrangThaiXacNhanAndToChucQuanLy(hinhthucthanhtoan,
			loaiPhi, trangThai, tochucquanly, ngayGiaoDichTu, ngayGiaoDichDen);
	}

	@Override
	public int countSoHoSoByTrangThaiXacNhanAndToChucQuanLy(
		int hinhthucthanhtoan, java.lang.String loaiPhi, int trangThai,
		long tochucquanly, java.util.Date ngayGiaoDichTu,
		java.util.Date ngayGiaoDichDen) {
		return _tthcXacNhanThanhToanLocalService.countSoHoSoByTrangThaiXacNhanAndToChucQuanLy(hinhthucthanhtoan,
			loaiPhi, trangThai, tochucquanly, ngayGiaoDichTu, ngayGiaoDichDen);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TthcXacNhanThanhToanLocalService getWrappedTthcXacNhanThanhToanLocalService() {
		return _tthcXacNhanThanhToanLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTthcXacNhanThanhToanLocalService(
		TthcXacNhanThanhToanLocalService tthcXacNhanThanhToanLocalService) {
		_tthcXacNhanThanhToanLocalService = tthcXacNhanThanhToanLocalService;
	}

	@Override
	public TthcXacNhanThanhToanLocalService getWrappedService() {
		return _tthcXacNhanThanhToanLocalService;
	}

	@Override
	public void setWrappedService(
		TthcXacNhanThanhToanLocalService tthcXacNhanThanhToanLocalService) {
		_tthcXacNhanThanhToanLocalService = tthcXacNhanThanhToanLocalService;
	}

	private TthcXacNhanThanhToanLocalService _tthcXacNhanThanhToanLocalService;
}