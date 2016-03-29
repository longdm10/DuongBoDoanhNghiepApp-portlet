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

package vn.dtt.duongbo.dao.nghiepvu.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link QlvtQuanLyFileLocalService}.
 *
 * @author NhanNc
 * @see QlvtQuanLyFileLocalService
 * @generated
 */
public class QlvtQuanLyFileLocalServiceWrapper
	implements QlvtQuanLyFileLocalService,
		ServiceWrapper<QlvtQuanLyFileLocalService> {
	public QlvtQuanLyFileLocalServiceWrapper(
		QlvtQuanLyFileLocalService qlvtQuanLyFileLocalService) {
		_qlvtQuanLyFileLocalService = qlvtQuanLyFileLocalService;
	}

	/**
	* Adds the qlvt quan ly file to the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtQuanLyFile the qlvt quan ly file
	* @return the qlvt quan ly file that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile addQlvtQuanLyFile(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile qlvtQuanLyFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtQuanLyFileLocalService.addQlvtQuanLyFile(qlvtQuanLyFile);
	}

	/**
	* Creates a new qlvt quan ly file with the primary key. Does not add the qlvt quan ly file to the database.
	*
	* @param id the primary key for the new qlvt quan ly file
	* @return the new qlvt quan ly file
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile createQlvtQuanLyFile(
		long id) {
		return _qlvtQuanLyFileLocalService.createQlvtQuanLyFile(id);
	}

	/**
	* Deletes the qlvt quan ly file with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt quan ly file
	* @return the qlvt quan ly file that was removed
	* @throws PortalException if a qlvt quan ly file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile deleteQlvtQuanLyFile(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtQuanLyFileLocalService.deleteQlvtQuanLyFile(id);
	}

	/**
	* Deletes the qlvt quan ly file from the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtQuanLyFile the qlvt quan ly file
	* @return the qlvt quan ly file that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile deleteQlvtQuanLyFile(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile qlvtQuanLyFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtQuanLyFileLocalService.deleteQlvtQuanLyFile(qlvtQuanLyFile);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _qlvtQuanLyFileLocalService.dynamicQuery();
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
		return _qlvtQuanLyFileLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtQuanLyFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtQuanLyFileLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtQuanLyFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtQuanLyFileLocalService.dynamicQuery(dynamicQuery, start,
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
		return _qlvtQuanLyFileLocalService.dynamicQueryCount(dynamicQuery);
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
		return _qlvtQuanLyFileLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile fetchQlvtQuanLyFile(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtQuanLyFileLocalService.fetchQlvtQuanLyFile(id);
	}

	/**
	* Returns the qlvt quan ly file with the primary key.
	*
	* @param id the primary key of the qlvt quan ly file
	* @return the qlvt quan ly file
	* @throws PortalException if a qlvt quan ly file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile getQlvtQuanLyFile(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtQuanLyFileLocalService.getQlvtQuanLyFile(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtQuanLyFileLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the qlvt quan ly files.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtQuanLyFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt quan ly files
	* @param end the upper bound of the range of qlvt quan ly files (not inclusive)
	* @return the range of qlvt quan ly files
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile> getQlvtQuanLyFiles(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtQuanLyFileLocalService.getQlvtQuanLyFiles(start, end);
	}

	/**
	* Returns the number of qlvt quan ly files.
	*
	* @return the number of qlvt quan ly files
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getQlvtQuanLyFilesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtQuanLyFileLocalService.getQlvtQuanLyFilesCount();
	}

	/**
	* Updates the qlvt quan ly file in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param qlvtQuanLyFile the qlvt quan ly file
	* @return the qlvt quan ly file that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile updateQlvtQuanLyFile(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile qlvtQuanLyFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtQuanLyFileLocalService.updateQlvtQuanLyFile(qlvtQuanLyFile);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _qlvtQuanLyFileLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_qlvtQuanLyFileLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _qlvtQuanLyFileLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile updateQuanLyFile(
		long userId, long doanhNghiepId, java.lang.String tenFile,
		long loaiFile, java.lang.String thongTinFile, long fileId,
		int trangThai, java.lang.String mieuTaFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtQuanLyFileLocalService.updateQuanLyFile(userId,
			doanhNghiepId, tenFile, loaiFile, thongTinFile, fileId, trangThai,
			mieuTaFile);
	}

	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile findByIdFile(
		long idFile) {
		return _qlvtQuanLyFileLocalService.findByIdFile(idFile);
	}

	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile findByIdFileAndDoanhNghiepID(
		long idFile, long doanhNghiepId) {
		return _qlvtQuanLyFileLocalService.findByIdFileAndDoanhNghiepID(idFile,
			doanhNghiepId);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile> findByDoanhNghiepId(
		long doanhNghiepId) {
		return _qlvtQuanLyFileLocalService.findByDoanhNghiepId(doanhNghiepId);
	}

	@Override
	public java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile> searchQuanLyFile(
		long doanhNghiepId, long loaiFile, java.lang.String trangThai,
		java.lang.String tenGiayTo, java.util.Date fromNgayCP,
		java.util.Date toNgayCP, java.util.Date fromNgayHH,
		java.util.Date toNgayHH, java.util.Date fromNgayTai,
		java.util.Date toNgayTai, int start, int end) {
		return _qlvtQuanLyFileLocalService.searchQuanLyFile(doanhNghiepId,
			loaiFile, trangThai, tenGiayTo, fromNgayCP, toNgayCP, fromNgayHH,
			toNgayHH, fromNgayTai, toNgayTai, start, end);
	}

	@Override
	public int countQuanLyFile(long doanhNghiepId, long loaiFile,
		java.lang.String trangThai, java.lang.String tenGiayTo,
		java.util.Date fromNgayCP, java.util.Date toNgayCP,
		java.util.Date fromNgayHH, java.util.Date toNgayHH,
		java.util.Date fromNgayTai, java.util.Date toNgayTai) {
		return _qlvtQuanLyFileLocalService.countQuanLyFile(doanhNghiepId,
			loaiFile, trangThai, tenGiayTo, fromNgayCP, toNgayCP, fromNgayHH,
			toNgayHH, fromNgayTai, toNgayTai);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public QlvtQuanLyFileLocalService getWrappedQlvtQuanLyFileLocalService() {
		return _qlvtQuanLyFileLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedQlvtQuanLyFileLocalService(
		QlvtQuanLyFileLocalService qlvtQuanLyFileLocalService) {
		_qlvtQuanLyFileLocalService = qlvtQuanLyFileLocalService;
	}

	@Override
	public QlvtQuanLyFileLocalService getWrappedService() {
		return _qlvtQuanLyFileLocalService;
	}

	@Override
	public void setWrappedService(
		QlvtQuanLyFileLocalService qlvtQuanLyFileLocalService) {
		_qlvtQuanLyFileLocalService = qlvtQuanLyFileLocalService;
	}

	private QlvtQuanLyFileLocalService _qlvtQuanLyFileLocalService;
}