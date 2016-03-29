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

package vn.dtt.duongbo.dao.lienvan.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for QlvtCapPhepGplvLoaiHinhVanTai. This utility wraps
 * {@link vn.dtt.duongbo.dao.lienvan.service.impl.QlvtCapPhepGplvLoaiHinhVanTaiLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author NhanNc
 * @see QlvtCapPhepGplvLoaiHinhVanTaiLocalService
 * @see vn.dtt.duongbo.dao.lienvan.service.base.QlvtCapPhepGplvLoaiHinhVanTaiLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.lienvan.service.impl.QlvtCapPhepGplvLoaiHinhVanTaiLocalServiceImpl
 * @generated
 */
public class QlvtCapPhepGplvLoaiHinhVanTaiLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.duongbo.dao.lienvan.service.impl.QlvtCapPhepGplvLoaiHinhVanTaiLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the qlvt cap phep gplv loai hinh van tai to the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtCapPhepGplvLoaiHinhVanTai the qlvt cap phep gplv loai hinh van tai
	* @return the qlvt cap phep gplv loai hinh van tai that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvLoaiHinhVanTai addQlvtCapPhepGplvLoaiHinhVanTai(
		vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvLoaiHinhVanTai qlvtCapPhepGplvLoaiHinhVanTai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addQlvtCapPhepGplvLoaiHinhVanTai(qlvtCapPhepGplvLoaiHinhVanTai);
	}

	/**
	* Creates a new qlvt cap phep gplv loai hinh van tai with the primary key. Does not add the qlvt cap phep gplv loai hinh van tai to the database.
	*
	* @param id the primary key for the new qlvt cap phep gplv loai hinh van tai
	* @return the new qlvt cap phep gplv loai hinh van tai
	*/
	public static vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvLoaiHinhVanTai createQlvtCapPhepGplvLoaiHinhVanTai(
		long id) {
		return getService().createQlvtCapPhepGplvLoaiHinhVanTai(id);
	}

	/**
	* Deletes the qlvt cap phep gplv loai hinh van tai with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt cap phep gplv loai hinh van tai
	* @return the qlvt cap phep gplv loai hinh van tai that was removed
	* @throws PortalException if a qlvt cap phep gplv loai hinh van tai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvLoaiHinhVanTai deleteQlvtCapPhepGplvLoaiHinhVanTai(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteQlvtCapPhepGplvLoaiHinhVanTai(id);
	}

	/**
	* Deletes the qlvt cap phep gplv loai hinh van tai from the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtCapPhepGplvLoaiHinhVanTai the qlvt cap phep gplv loai hinh van tai
	* @return the qlvt cap phep gplv loai hinh van tai that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvLoaiHinhVanTai deleteQlvtCapPhepGplvLoaiHinhVanTai(
		vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvLoaiHinhVanTai qlvtCapPhepGplvLoaiHinhVanTai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .deleteQlvtCapPhepGplvLoaiHinhVanTai(qlvtCapPhepGplvLoaiHinhVanTai);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGplvLoaiHinhVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGplvLoaiHinhVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvLoaiHinhVanTai fetchQlvtCapPhepGplvLoaiHinhVanTai(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchQlvtCapPhepGplvLoaiHinhVanTai(id);
	}

	/**
	* Returns the qlvt cap phep gplv loai hinh van tai with the primary key.
	*
	* @param id the primary key of the qlvt cap phep gplv loai hinh van tai
	* @return the qlvt cap phep gplv loai hinh van tai
	* @throws PortalException if a qlvt cap phep gplv loai hinh van tai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvLoaiHinhVanTai getQlvtCapPhepGplvLoaiHinhVanTai(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getQlvtCapPhepGplvLoaiHinhVanTai(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the qlvt cap phep gplv loai hinh van tais.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGplvLoaiHinhVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt cap phep gplv loai hinh van tais
	* @param end the upper bound of the range of qlvt cap phep gplv loai hinh van tais (not inclusive)
	* @return the range of qlvt cap phep gplv loai hinh van tais
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvLoaiHinhVanTai> getQlvtCapPhepGplvLoaiHinhVanTais(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getQlvtCapPhepGplvLoaiHinhVanTais(start, end);
	}

	/**
	* Returns the number of qlvt cap phep gplv loai hinh van tais.
	*
	* @return the number of qlvt cap phep gplv loai hinh van tais
	* @throws SystemException if a system exception occurred
	*/
	public static int getQlvtCapPhepGplvLoaiHinhVanTaisCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getQlvtCapPhepGplvLoaiHinhVanTaisCount();
	}

	/**
	* Updates the qlvt cap phep gplv loai hinh van tai in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param qlvtCapPhepGplvLoaiHinhVanTai the qlvt cap phep gplv loai hinh van tai
	* @return the qlvt cap phep gplv loai hinh van tai that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvLoaiHinhVanTai updateQlvtCapPhepGplvLoaiHinhVanTai(
		vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGplvLoaiHinhVanTai qlvtCapPhepGplvLoaiHinhVanTai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateQlvtCapPhepGplvLoaiHinhVanTai(qlvtCapPhepGplvLoaiHinhVanTai);
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

	public static void clearService() {
		_service = null;
	}

	public static QlvtCapPhepGplvLoaiHinhVanTaiLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					QlvtCapPhepGplvLoaiHinhVanTaiLocalService.class.getName());

			if (invokableLocalService instanceof QlvtCapPhepGplvLoaiHinhVanTaiLocalService) {
				_service = (QlvtCapPhepGplvLoaiHinhVanTaiLocalService)invokableLocalService;
			}
			else {
				_service = new QlvtCapPhepGplvLoaiHinhVanTaiLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(QlvtCapPhepGplvLoaiHinhVanTaiLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(QlvtCapPhepGplvLoaiHinhVanTaiLocalService service) {
	}

	private static QlvtCapPhepGplvLoaiHinhVanTaiLocalService _service;
}