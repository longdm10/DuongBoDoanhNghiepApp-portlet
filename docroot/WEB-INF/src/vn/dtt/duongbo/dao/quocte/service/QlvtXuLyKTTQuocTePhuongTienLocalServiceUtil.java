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

package vn.dtt.duongbo.dao.quocte.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for QlvtXuLyKTTQuocTePhuongTien. This utility wraps
 * {@link vn.dtt.duongbo.dao.quocte.service.impl.QlvtXuLyKTTQuocTePhuongTienLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author NoiPham
 * @see QlvtXuLyKTTQuocTePhuongTienLocalService
 * @see vn.dtt.duongbo.dao.quocte.service.base.QlvtXuLyKTTQuocTePhuongTienLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.quocte.service.impl.QlvtXuLyKTTQuocTePhuongTienLocalServiceImpl
 * @generated
 */
public class QlvtXuLyKTTQuocTePhuongTienLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.duongbo.dao.quocte.service.impl.QlvtXuLyKTTQuocTePhuongTienLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the qlvt xu ly k t t quoc te phuong tien to the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtXuLyKTTQuocTePhuongTien the qlvt xu ly k t t quoc te phuong tien
	* @return the qlvt xu ly k t t quoc te phuong tien that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien addQlvtXuLyKTTQuocTePhuongTien(
		vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addQlvtXuLyKTTQuocTePhuongTien(qlvtXuLyKTTQuocTePhuongTien);
	}

	/**
	* Creates a new qlvt xu ly k t t quoc te phuong tien with the primary key. Does not add the qlvt xu ly k t t quoc te phuong tien to the database.
	*
	* @param id the primary key for the new qlvt xu ly k t t quoc te phuong tien
	* @return the new qlvt xu ly k t t quoc te phuong tien
	*/
	public static vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien createQlvtXuLyKTTQuocTePhuongTien(
		long id) {
		return getService().createQlvtXuLyKTTQuocTePhuongTien(id);
	}

	/**
	* Deletes the qlvt xu ly k t t quoc te phuong tien with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt xu ly k t t quoc te phuong tien
	* @return the qlvt xu ly k t t quoc te phuong tien that was removed
	* @throws PortalException if a qlvt xu ly k t t quoc te phuong tien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien deleteQlvtXuLyKTTQuocTePhuongTien(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteQlvtXuLyKTTQuocTePhuongTien(id);
	}

	/**
	* Deletes the qlvt xu ly k t t quoc te phuong tien from the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtXuLyKTTQuocTePhuongTien the qlvt xu ly k t t quoc te phuong tien
	* @return the qlvt xu ly k t t quoc te phuong tien that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien deleteQlvtXuLyKTTQuocTePhuongTien(
		vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .deleteQlvtXuLyKTTQuocTePhuongTien(qlvtXuLyKTTQuocTePhuongTien);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTePhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTePhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien fetchQlvtXuLyKTTQuocTePhuongTien(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchQlvtXuLyKTTQuocTePhuongTien(id);
	}

	/**
	* Returns the qlvt xu ly k t t quoc te phuong tien with the primary key.
	*
	* @param id the primary key of the qlvt xu ly k t t quoc te phuong tien
	* @return the qlvt xu ly k t t quoc te phuong tien
	* @throws PortalException if a qlvt xu ly k t t quoc te phuong tien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien getQlvtXuLyKTTQuocTePhuongTien(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getQlvtXuLyKTTQuocTePhuongTien(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the qlvt xu ly k t t quoc te phuong tiens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTePhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt xu ly k t t quoc te phuong tiens
	* @param end the upper bound of the range of qlvt xu ly k t t quoc te phuong tiens (not inclusive)
	* @return the range of qlvt xu ly k t t quoc te phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien> getQlvtXuLyKTTQuocTePhuongTiens(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getQlvtXuLyKTTQuocTePhuongTiens(start, end);
	}

	/**
	* Returns the number of qlvt xu ly k t t quoc te phuong tiens.
	*
	* @return the number of qlvt xu ly k t t quoc te phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	public static int getQlvtXuLyKTTQuocTePhuongTiensCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getQlvtXuLyKTTQuocTePhuongTiensCount();
	}

	/**
	* Updates the qlvt xu ly k t t quoc te phuong tien in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param qlvtXuLyKTTQuocTePhuongTien the qlvt xu ly k t t quoc te phuong tien
	* @return the qlvt xu ly k t t quoc te phuong tien that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien updateQlvtXuLyKTTQuocTePhuongTien(
		vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateQlvtXuLyKTTQuocTePhuongTien(qlvtXuLyKTTQuocTePhuongTien);
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

	public static java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien> findBycapPhepKTTQuocTeID(
		long capPhepKTTQuocTeID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findBycapPhepKTTQuocTeID(capPhepKTTQuocTeID);
	}

	public static void clearService() {
		_service = null;
	}

	public static QlvtXuLyKTTQuocTePhuongTienLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					QlvtXuLyKTTQuocTePhuongTienLocalService.class.getName());

			if (invokableLocalService instanceof QlvtXuLyKTTQuocTePhuongTienLocalService) {
				_service = (QlvtXuLyKTTQuocTePhuongTienLocalService)invokableLocalService;
			}
			else {
				_service = new QlvtXuLyKTTQuocTePhuongTienLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(QlvtXuLyKTTQuocTePhuongTienLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(QlvtXuLyKTTQuocTePhuongTienLocalService service) {
	}

	private static QlvtXuLyKTTQuocTePhuongTienLocalService _service;
}