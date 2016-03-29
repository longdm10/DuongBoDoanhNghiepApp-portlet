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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * Provides the local service interface for TthcXacNhanThanhToan. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author win_64
 * @see TthcXacNhanThanhToanLocalServiceUtil
 * @see vn.dtt.duongbo.dao.thanhtoan.service.base.TthcXacNhanThanhToanLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.thanhtoan.service.impl.TthcXacNhanThanhToanLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface TthcXacNhanThanhToanLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TthcXacNhanThanhToanLocalServiceUtil} to access the tthc xac nhan thanh toan local service. Add custom service methods to {@link vn.dtt.duongbo.dao.thanhtoan.service.impl.TthcXacNhanThanhToanLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the tthc xac nhan thanh toan to the database. Also notifies the appropriate model listeners.
	*
	* @param tthcXacNhanThanhToan the tthc xac nhan thanh toan
	* @return the tthc xac nhan thanh toan that was added
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan addTthcXacNhanThanhToan(
		vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan tthcXacNhanThanhToan)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new tthc xac nhan thanh toan with the primary key. Does not add the tthc xac nhan thanh toan to the database.
	*
	* @param id the primary key for the new tthc xac nhan thanh toan
	* @return the new tthc xac nhan thanh toan
	*/
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan createTthcXacNhanThanhToan(
		long id);

	/**
	* Deletes the tthc xac nhan thanh toan with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tthc xac nhan thanh toan
	* @return the tthc xac nhan thanh toan that was removed
	* @throws PortalException if a tthc xac nhan thanh toan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan deleteTthcXacNhanThanhToan(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the tthc xac nhan thanh toan from the database. Also notifies the appropriate model listeners.
	*
	* @param tthcXacNhanThanhToan the tthc xac nhan thanh toan
	* @return the tthc xac nhan thanh toan that was removed
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan deleteTthcXacNhanThanhToan(
		vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan tthcXacNhanThanhToan)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan fetchTthcXacNhanThanhToan(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc xac nhan thanh toan with the primary key.
	*
	* @param id the primary key of the tthc xac nhan thanh toan
	* @return the tthc xac nhan thanh toan
	* @throws PortalException if a tthc xac nhan thanh toan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan getTthcXacNhanThanhToan(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan> getTthcXacNhanThanhToans(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tthc xac nhan thanh toans.
	*
	* @return the number of tthc xac nhan thanh toans
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getTthcXacNhanThanhToansCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the tthc xac nhan thanh toan in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tthcXacNhanThanhToan the tthc xac nhan thanh toan
	* @return the tthc xac nhan thanh toan that was updated
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan updateTthcXacNhanThanhToan(
		vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan tthcXacNhanThanhToan)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;

	public java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan> findAll();

	public java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan> findByToChucQuanLy(
		long toChucQuanLy);

	public vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan findByMaTuSinh(
		java.lang.String maTuSinh);

	public java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan> findByTrangThaiXacNhanAndToChucQuanLy(
		long toChucQuanLy, java.lang.String trangThai, int start, int end);

	public java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan> findTthcXacNhanThanhToan(
		java.lang.String maGiaoDich, java.lang.String loaiGiaoDich,
		java.lang.String hinhThucThanhToan, long toChucQuanLy,
		java.lang.String trangThai, java.lang.String trangThaiSearch,
		java.util.Date tuNgay, java.util.Date denNGay,
		java.lang.String tenDoanhNGhiep, int year, int start, int end);

	public int countTthcXacNhanThanhToan(java.lang.String maGiaoDich,
		java.lang.String loaiGiaoDich, java.lang.String hinhThucThanhToan,
		long toChucQuanLy, java.lang.String trangThai,
		java.lang.String trangThaiSearch, java.util.Date tuNgay,
		java.util.Date denNGay, java.lang.String tenDoanhNGhiep, int year);

	public int countByTrangThaiXacNhanAndToChucQuanLy(long toChucQuanLy,
		java.lang.String trangThai);

	public int sumTienByTrangThaiXacNhanAndToChucQuanLy(int hinhthucthanhtoan,
		java.lang.String loaiPhi, int trangThai, long tochucquanly,
		java.util.Date ngayGiaoDichTu, java.util.Date ngayGiaoDichDen);

	public int countSoHoSoByTrangThaiXacNhanAndToChucQuanLy(
		int hinhthucthanhtoan, java.lang.String loaiPhi, int trangThai,
		long tochucquanly, java.util.Date ngayGiaoDichTu,
		java.util.Date ngayGiaoDichDen);
}