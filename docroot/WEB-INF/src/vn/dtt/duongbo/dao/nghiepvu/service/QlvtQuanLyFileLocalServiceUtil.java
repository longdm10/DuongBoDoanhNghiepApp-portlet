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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for QlvtQuanLyFile. This utility wraps
 * {@link vn.dtt.duongbo.dao.nghiepvu.service.impl.QlvtQuanLyFileLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author NhanNc
 * @see QlvtQuanLyFileLocalService
 * @see vn.dtt.duongbo.dao.nghiepvu.service.base.QlvtQuanLyFileLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.nghiepvu.service.impl.QlvtQuanLyFileLocalServiceImpl
 * @generated
 */
public class QlvtQuanLyFileLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.duongbo.dao.nghiepvu.service.impl.QlvtQuanLyFileLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the qlvt quan ly file to the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtQuanLyFile the qlvt quan ly file
	* @return the qlvt quan ly file that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile addQlvtQuanLyFile(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile qlvtQuanLyFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addQlvtQuanLyFile(qlvtQuanLyFile);
	}

	/**
	* Creates a new qlvt quan ly file with the primary key. Does not add the qlvt quan ly file to the database.
	*
	* @param id the primary key for the new qlvt quan ly file
	* @return the new qlvt quan ly file
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile createQlvtQuanLyFile(
		long id) {
		return getService().createQlvtQuanLyFile(id);
	}

	/**
	* Deletes the qlvt quan ly file with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt quan ly file
	* @return the qlvt quan ly file that was removed
	* @throws PortalException if a qlvt quan ly file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile deleteQlvtQuanLyFile(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteQlvtQuanLyFile(id);
	}

	/**
	* Deletes the qlvt quan ly file from the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtQuanLyFile the qlvt quan ly file
	* @return the qlvt quan ly file that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile deleteQlvtQuanLyFile(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile qlvtQuanLyFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteQlvtQuanLyFile(qlvtQuanLyFile);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtQuanLyFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile fetchQlvtQuanLyFile(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchQlvtQuanLyFile(id);
	}

	/**
	* Returns the qlvt quan ly file with the primary key.
	*
	* @param id the primary key of the qlvt quan ly file
	* @return the qlvt quan ly file
	* @throws PortalException if a qlvt quan ly file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile getQlvtQuanLyFile(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getQlvtQuanLyFile(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile> getQlvtQuanLyFiles(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getQlvtQuanLyFiles(start, end);
	}

	/**
	* Returns the number of qlvt quan ly files.
	*
	* @return the number of qlvt quan ly files
	* @throws SystemException if a system exception occurred
	*/
	public static int getQlvtQuanLyFilesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getQlvtQuanLyFilesCount();
	}

	/**
	* Updates the qlvt quan ly file in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param qlvtQuanLyFile the qlvt quan ly file
	* @return the qlvt quan ly file that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile updateQlvtQuanLyFile(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile qlvtQuanLyFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateQlvtQuanLyFile(qlvtQuanLyFile);
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

	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile updateQuanLyFile(
		long userId, long doanhNghiepId, java.lang.String tenFile,
		long loaiFile, java.lang.String thongTinFile, long fileId,
		int trangThai, java.lang.String mieuTaFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateQuanLyFile(userId, doanhNghiepId, tenFile, loaiFile,
			thongTinFile, fileId, trangThai, mieuTaFile);
	}

	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile findByIdFile(
		long idFile) {
		return getService().findByIdFile(idFile);
	}

	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile findByIdFileAndDoanhNghiepID(
		long idFile, long doanhNghiepId) {
		return getService().findByIdFileAndDoanhNghiepID(idFile, doanhNghiepId);
	}

	public static java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile> findByDoanhNghiepId(
		long doanhNghiepId) {
		return getService().findByDoanhNghiepId(doanhNghiepId);
	}

	public static java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile> searchQuanLyFile(
		long doanhNghiepId, long loaiFile, java.lang.String trangThai,
		java.lang.String tenGiayTo, java.util.Date fromNgayCP,
		java.util.Date toNgayCP, java.util.Date fromNgayHH,
		java.util.Date toNgayHH, java.util.Date fromNgayTai,
		java.util.Date toNgayTai, int start, int end) {
		return getService()
				   .searchQuanLyFile(doanhNghiepId, loaiFile, trangThai,
			tenGiayTo, fromNgayCP, toNgayCP, fromNgayHH, toNgayHH, fromNgayTai,
			toNgayTai, start, end);
	}

	public static int countQuanLyFile(long doanhNghiepId, long loaiFile,
		java.lang.String trangThai, java.lang.String tenGiayTo,
		java.util.Date fromNgayCP, java.util.Date toNgayCP,
		java.util.Date fromNgayHH, java.util.Date toNgayHH,
		java.util.Date fromNgayTai, java.util.Date toNgayTai) {
		return getService()
				   .countQuanLyFile(doanhNghiepId, loaiFile, trangThai,
			tenGiayTo, fromNgayCP, toNgayCP, fromNgayHH, toNgayHH, fromNgayTai,
			toNgayTai);
	}

	public static void clearService() {
		_service = null;
	}

	public static QlvtQuanLyFileLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					QlvtQuanLyFileLocalService.class.getName());

			if (invokableLocalService instanceof QlvtQuanLyFileLocalService) {
				_service = (QlvtQuanLyFileLocalService)invokableLocalService;
			}
			else {
				_service = new QlvtQuanLyFileLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(QlvtQuanLyFileLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(QlvtQuanLyFileLocalService service) {
	}

	private static QlvtQuanLyFileLocalService _service;
}