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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for TthcXacNhanThanhToan. This utility wraps
 * {@link vn.dtt.duongbo.dao.thanhtoan.service.impl.TthcXacNhanThanhToanLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author win_64
 * @see TthcXacNhanThanhToanLocalService
 * @see vn.dtt.duongbo.dao.thanhtoan.service.base.TthcXacNhanThanhToanLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.thanhtoan.service.impl.TthcXacNhanThanhToanLocalServiceImpl
 * @generated
 */
public class TthcXacNhanThanhToanLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.duongbo.dao.thanhtoan.service.impl.TthcXacNhanThanhToanLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the tthc xac nhan thanh toan to the database. Also notifies the appropriate model listeners.
	*
	* @param tthcXacNhanThanhToan the tthc xac nhan thanh toan
	* @return the tthc xac nhan thanh toan that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan addTthcXacNhanThanhToan(
		vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan tthcXacNhanThanhToan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addTthcXacNhanThanhToan(tthcXacNhanThanhToan);
	}

	/**
	* Creates a new tthc xac nhan thanh toan with the primary key. Does not add the tthc xac nhan thanh toan to the database.
	*
	* @param id the primary key for the new tthc xac nhan thanh toan
	* @return the new tthc xac nhan thanh toan
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan createTthcXacNhanThanhToan(
		long id) {
		return getService().createTthcXacNhanThanhToan(id);
	}

	/**
	* Deletes the tthc xac nhan thanh toan with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tthc xac nhan thanh toan
	* @return the tthc xac nhan thanh toan that was removed
	* @throws PortalException if a tthc xac nhan thanh toan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan deleteTthcXacNhanThanhToan(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteTthcXacNhanThanhToan(id);
	}

	/**
	* Deletes the tthc xac nhan thanh toan from the database. Also notifies the appropriate model listeners.
	*
	* @param tthcXacNhanThanhToan the tthc xac nhan thanh toan
	* @return the tthc xac nhan thanh toan that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan deleteTthcXacNhanThanhToan(
		vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan tthcXacNhanThanhToan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteTthcXacNhanThanhToan(tthcXacNhanThanhToan);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcXacNhanThanhToanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan fetchTthcXacNhanThanhToan(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchTthcXacNhanThanhToan(id);
	}

	/**
	* Returns the tthc xac nhan thanh toan with the primary key.
	*
	* @param id the primary key of the tthc xac nhan thanh toan
	* @return the tthc xac nhan thanh toan
	* @throws PortalException if a tthc xac nhan thanh toan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan getTthcXacNhanThanhToan(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getTthcXacNhanThanhToan(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan> getTthcXacNhanThanhToans(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTthcXacNhanThanhToans(start, end);
	}

	/**
	* Returns the number of tthc xac nhan thanh toans.
	*
	* @return the number of tthc xac nhan thanh toans
	* @throws SystemException if a system exception occurred
	*/
	public static int getTthcXacNhanThanhToansCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTthcXacNhanThanhToansCount();
	}

	/**
	* Updates the tthc xac nhan thanh toan in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tthcXacNhanThanhToan the tthc xac nhan thanh toan
	* @return the tthc xac nhan thanh toan that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan updateTthcXacNhanThanhToan(
		vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan tthcXacNhanThanhToan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTthcXacNhanThanhToan(tthcXacNhanThanhToan);
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

	public static java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan> findAll() {
		return getService().findAll();
	}

	public static java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan> findByToChucQuanLy(
		long toChucQuanLy) {
		return getService().findByToChucQuanLy(toChucQuanLy);
	}

	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan findByMaTuSinh(
		java.lang.String maTuSinh) {
		return getService().findByMaTuSinh(maTuSinh);
	}

	public static java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan> findByTrangThaiXacNhanAndToChucQuanLy(
		long toChucQuanLy, java.lang.String trangThai, int start, int end) {
		return getService()
				   .findByTrangThaiXacNhanAndToChucQuanLy(toChucQuanLy,
			trangThai, start, end);
	}

	public static java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan> findTthcXacNhanThanhToan(
		java.lang.String maGiaoDich, java.lang.String loaiGiaoDich,
		java.lang.String hinhThucThanhToan, long toChucQuanLy,
		java.lang.String trangThai, java.lang.String trangThaiSearch,
		java.util.Date tuNgay, java.util.Date denNGay,
		java.lang.String tenDoanhNGhiep, int year, int start, int end) {
		return getService()
				   .findTthcXacNhanThanhToan(maGiaoDich, loaiGiaoDich,
			hinhThucThanhToan, toChucQuanLy, trangThai, trangThaiSearch,
			tuNgay, denNGay, tenDoanhNGhiep, year, start, end);
	}

	public static int countTthcXacNhanThanhToan(java.lang.String maGiaoDich,
		java.lang.String loaiGiaoDich, java.lang.String hinhThucThanhToan,
		long toChucQuanLy, java.lang.String trangThai,
		java.lang.String trangThaiSearch, java.util.Date tuNgay,
		java.util.Date denNGay, java.lang.String tenDoanhNGhiep, int year) {
		return getService()
				   .countTthcXacNhanThanhToan(maGiaoDich, loaiGiaoDich,
			hinhThucThanhToan, toChucQuanLy, trangThai, trangThaiSearch,
			tuNgay, denNGay, tenDoanhNGhiep, year);
	}

	public static int countByTrangThaiXacNhanAndToChucQuanLy(
		long toChucQuanLy, java.lang.String trangThai) {
		return getService()
				   .countByTrangThaiXacNhanAndToChucQuanLy(toChucQuanLy,
			trangThai);
	}

	public static int sumTienByTrangThaiXacNhanAndToChucQuanLy(
		int hinhthucthanhtoan, java.lang.String loaiPhi, int trangThai,
		long tochucquanly, java.util.Date ngayGiaoDichTu,
		java.util.Date ngayGiaoDichDen) {
		return getService()
				   .sumTienByTrangThaiXacNhanAndToChucQuanLy(hinhthucthanhtoan,
			loaiPhi, trangThai, tochucquanly, ngayGiaoDichTu, ngayGiaoDichDen);
	}

	public static int countSoHoSoByTrangThaiXacNhanAndToChucQuanLy(
		int hinhthucthanhtoan, java.lang.String loaiPhi, int trangThai,
		long tochucquanly, java.util.Date ngayGiaoDichTu,
		java.util.Date ngayGiaoDichDen) {
		return getService()
				   .countSoHoSoByTrangThaiXacNhanAndToChucQuanLy(hinhthucthanhtoan,
			loaiPhi, trangThai, tochucquanly, ngayGiaoDichTu, ngayGiaoDichDen);
	}

	public static void clearService() {
		_service = null;
	}

	public static TthcXacNhanThanhToanLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					TthcXacNhanThanhToanLocalService.class.getName());

			if (invokableLocalService instanceof TthcXacNhanThanhToanLocalService) {
				_service = (TthcXacNhanThanhToanLocalService)invokableLocalService;
			}
			else {
				_service = new TthcXacNhanThanhToanLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(TthcXacNhanThanhToanLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(TthcXacNhanThanhToanLocalService service) {
	}

	private static TthcXacNhanThanhToanLocalService _service;
}