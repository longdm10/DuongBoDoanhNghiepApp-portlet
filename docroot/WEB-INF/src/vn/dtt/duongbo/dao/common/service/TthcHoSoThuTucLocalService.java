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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * Provides the local service interface for TthcHoSoThuTuc. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author win_64
 * @see TthcHoSoThuTucLocalServiceUtil
 * @see vn.dtt.duongbo.dao.common.service.base.TthcHoSoThuTucLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.common.service.impl.TthcHoSoThuTucLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface TthcHoSoThuTucLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TthcHoSoThuTucLocalServiceUtil} to access the tthc ho so thu tuc local service. Add custom service methods to {@link vn.dtt.duongbo.dao.common.service.impl.TthcHoSoThuTucLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the tthc ho so thu tuc to the database. Also notifies the appropriate model listeners.
	*
	* @param tthcHoSoThuTuc the tthc ho so thu tuc
	* @return the tthc ho so thu tuc that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc addTthcHoSoThuTuc(
		vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc tthcHoSoThuTuc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new tthc ho so thu tuc with the primary key. Does not add the tthc ho so thu tuc to the database.
	*
	* @param id the primary key for the new tthc ho so thu tuc
	* @return the new tthc ho so thu tuc
	*/
	public vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc createTthcHoSoThuTuc(
		long id);

	/**
	* Deletes the tthc ho so thu tuc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tthc ho so thu tuc
	* @return the tthc ho so thu tuc that was removed
	* @throws PortalException if a tthc ho so thu tuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc deleteTthcHoSoThuTuc(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the tthc ho so thu tuc from the database. Also notifies the appropriate model listeners.
	*
	* @param tthcHoSoThuTuc the tthc ho so thu tuc
	* @return the tthc ho so thu tuc that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc deleteTthcHoSoThuTuc(
		vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc tthcHoSoThuTuc)
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc fetchTthcHoSoThuTuc(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc ho so thu tuc with the primary key.
	*
	* @param id the primary key of the tthc ho so thu tuc
	* @return the tthc ho so thu tuc
	* @throws PortalException if a tthc ho so thu tuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc getTthcHoSoThuTuc(
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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc> getTthcHoSoThuTucs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tthc ho so thu tucs.
	*
	* @return the number of tthc ho so thu tucs
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getTthcHoSoThuTucsCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the tthc ho so thu tuc in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tthcHoSoThuTuc the tthc ho so thu tuc
	* @return the tthc ho so thu tuc that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc updateTthcHoSoThuTuc(
		vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc tthcHoSoThuTuc)
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

	public vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc updateHoSoThuTuc(
		long userId, long nguoiLamThuTucId, long hoSoThuTucId,
		long thuTucHanhChinhId, long thanhPhanHoSoId, long bieuMauHoSoId,
		java.lang.String trangThaiHoSoThuTuc, long phanNhomHoSoId,
		long organizationId, java.lang.String noiDungXML,
		int trangThaiNoiDungHoSo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc findByMaSoHoSo(
		java.lang.String maSoHoSo);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc> getByNguoiLamThuTucId(
		long nguoiLamThuTucId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc> getByNguoiLamThuTucIdAndThuTucHanhChinhId(
		long nguoiLamThuTucId, long thuTucHanhChinhId);

	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc> findByNguoiTaoAndThuTucHanhChinhId(
		long nguoiTao, long thuTucHanhChinhId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc> searchQuanLyHoSo(
		java.lang.String maBienNhan, java.lang.String thuTucHanhChinhId,
		long userLoginId, long phanNhomHoSoId, int start, int end);

	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc> findHoSoByNguoiLamThuTucIdAndMaTrangThai(
		long nguoiLamThuTucId, java.lang.String maTrangThai);

	public int countQuanLyHoSo(java.lang.String maBienNhan,
		java.lang.String thuTucHanhChinhId, long userLoginId,
		long phanNhomHoSoId);

	public int countByGroupMaTrangThaiDoanhNghiepAndNguoiLamThuTucId(
		java.lang.String groupMaTrangThaiDoanhNghiep, long nguoiLamThuTucId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc> searchQuanLyHoSoInPhanNhomGroup(
		java.lang.String maBienNhan, java.lang.String thuTucHanhChinhId,
		long userLoginId, java.lang.String groupPhanNhomHoSoId, int start,
		int end);

	public int countQuanLyHoSoInPhanNhomGroup(java.lang.String maBienNhan,
		java.lang.String thuTucHanhChinhId, long userLoginId,
		java.lang.String groupPhanNhomHoSoId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc> searchQuanLyHoSoInPhanNhomHoSoDoanhNghiep(
		java.lang.String linhVucThuTuc, java.lang.String maBienNhan,
		java.lang.String thuTucHanhChinhId, long userLoginId,
		java.lang.String groupTrangThaiDoanhNghiepCode, int start, int end);

	public int countQuanLyHoSoInPhanNhomHoSoDoanhNghiep(
		java.lang.String linhVucThuTuc, java.lang.String maBienNhan,
		java.lang.String thuTucHanhChinhId, long userLoginId,
		java.lang.String groupTrangThaiDoanhNghiepCode);

	public int countHoSoThuTucByPhanNhomHoSoIdAndNguoiLamThuTucId(
		long phanNhomHoSoId, long nguoiLamThuTucId);

	public int countByPhanNhomHoSoIdGroupAndNguoiLamThuTucId(
		java.lang.String phanNhomHoSoIdGroup, long nguoiLamThuTucId);

	public java.util.List<vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc> findByUserAndThuTucHanhChinhId(
		long userLoginId, long thuTucHanhChinhId);

	public java.lang.String maxMaBienNhan(java.util.Date date);

	public java.lang.String maxMaSoHoSo(java.lang.String soDangKyKinhDoanh);

	public int countHoSoThuTucByTrangThai(java.lang.String trangThaiId);
}