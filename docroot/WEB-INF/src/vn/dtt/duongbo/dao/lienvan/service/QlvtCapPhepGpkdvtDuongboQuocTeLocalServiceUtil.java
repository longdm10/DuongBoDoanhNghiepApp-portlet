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
 * Provides the local service utility for QlvtCapPhepGpkdvtDuongboQuocTe. This utility wraps
 * {@link vn.dtt.duongbo.dao.lienvan.service.impl.QlvtCapPhepGpkdvtDuongboQuocTeLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author NhanNc
 * @see QlvtCapPhepGpkdvtDuongboQuocTeLocalService
 * @see vn.dtt.duongbo.dao.lienvan.service.base.QlvtCapPhepGpkdvtDuongboQuocTeLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.lienvan.service.impl.QlvtCapPhepGpkdvtDuongboQuocTeLocalServiceImpl
 * @generated
 */
public class QlvtCapPhepGpkdvtDuongboQuocTeLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.duongbo.dao.lienvan.service.impl.QlvtCapPhepGpkdvtDuongboQuocTeLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the qlvt cap phep gpkdvt duongbo quoc te to the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtCapPhepGpkdvtDuongboQuocTe the qlvt cap phep gpkdvt duongbo quoc te
	* @return the qlvt cap phep gpkdvt duongbo quoc te that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpkdvtDuongboQuocTe addQlvtCapPhepGpkdvtDuongboQuocTe(
		vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpkdvtDuongboQuocTe qlvtCapPhepGpkdvtDuongboQuocTe)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addQlvtCapPhepGpkdvtDuongboQuocTe(qlvtCapPhepGpkdvtDuongboQuocTe);
	}

	/**
	* Creates a new qlvt cap phep gpkdvt duongbo quoc te with the primary key. Does not add the qlvt cap phep gpkdvt duongbo quoc te to the database.
	*
	* @param id the primary key for the new qlvt cap phep gpkdvt duongbo quoc te
	* @return the new qlvt cap phep gpkdvt duongbo quoc te
	*/
	public static vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpkdvtDuongboQuocTe createQlvtCapPhepGpkdvtDuongboQuocTe(
		long id) {
		return getService().createQlvtCapPhepGpkdvtDuongboQuocTe(id);
	}

	/**
	* Deletes the qlvt cap phep gpkdvt duongbo quoc te with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt cap phep gpkdvt duongbo quoc te
	* @return the qlvt cap phep gpkdvt duongbo quoc te that was removed
	* @throws PortalException if a qlvt cap phep gpkdvt duongbo quoc te with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpkdvtDuongboQuocTe deleteQlvtCapPhepGpkdvtDuongboQuocTe(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteQlvtCapPhepGpkdvtDuongboQuocTe(id);
	}

	/**
	* Deletes the qlvt cap phep gpkdvt duongbo quoc te from the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtCapPhepGpkdvtDuongboQuocTe the qlvt cap phep gpkdvt duongbo quoc te
	* @return the qlvt cap phep gpkdvt duongbo quoc te that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpkdvtDuongboQuocTe deleteQlvtCapPhepGpkdvtDuongboQuocTe(
		vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpkdvtDuongboQuocTe qlvtCapPhepGpkdvtDuongboQuocTe)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .deleteQlvtCapPhepGpkdvtDuongboQuocTe(qlvtCapPhepGpkdvtDuongboQuocTe);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGpkdvtDuongboQuocTeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGpkdvtDuongboQuocTeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpkdvtDuongboQuocTe fetchQlvtCapPhepGpkdvtDuongboQuocTe(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchQlvtCapPhepGpkdvtDuongboQuocTe(id);
	}

	/**
	* Returns the qlvt cap phep gpkdvt duongbo quoc te with the primary key.
	*
	* @param id the primary key of the qlvt cap phep gpkdvt duongbo quoc te
	* @return the qlvt cap phep gpkdvt duongbo quoc te
	* @throws PortalException if a qlvt cap phep gpkdvt duongbo quoc te with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpkdvtDuongboQuocTe getQlvtCapPhepGpkdvtDuongboQuocTe(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getQlvtCapPhepGpkdvtDuongboQuocTe(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the qlvt cap phep gpkdvt duongbo quoc tes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtCapPhepGpkdvtDuongboQuocTeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt cap phep gpkdvt duongbo quoc tes
	* @param end the upper bound of the range of qlvt cap phep gpkdvt duongbo quoc tes (not inclusive)
	* @return the range of qlvt cap phep gpkdvt duongbo quoc tes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpkdvtDuongboQuocTe> getQlvtCapPhepGpkdvtDuongboQuocTes(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getQlvtCapPhepGpkdvtDuongboQuocTes(start, end);
	}

	/**
	* Returns the number of qlvt cap phep gpkdvt duongbo quoc tes.
	*
	* @return the number of qlvt cap phep gpkdvt duongbo quoc tes
	* @throws SystemException if a system exception occurred
	*/
	public static int getQlvtCapPhepGpkdvtDuongboQuocTesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getQlvtCapPhepGpkdvtDuongboQuocTesCount();
	}

	/**
	* Updates the qlvt cap phep gpkdvt duongbo quoc te in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param qlvtCapPhepGpkdvtDuongboQuocTe the qlvt cap phep gpkdvt duongbo quoc te
	* @return the qlvt cap phep gpkdvt duongbo quoc te that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpkdvtDuongboQuocTe updateQlvtCapPhepGpkdvtDuongboQuocTe(
		vn.dtt.duongbo.dao.lienvan.model.QlvtCapPhepGpkdvtDuongboQuocTe qlvtCapPhepGpkdvtDuongboQuocTe)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateQlvtCapPhepGpkdvtDuongboQuocTe(qlvtCapPhepGpkdvtDuongboQuocTe);
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

	public static QlvtCapPhepGpkdvtDuongboQuocTeLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					QlvtCapPhepGpkdvtDuongboQuocTeLocalService.class.getName());

			if (invokableLocalService instanceof QlvtCapPhepGpkdvtDuongboQuocTeLocalService) {
				_service = (QlvtCapPhepGpkdvtDuongboQuocTeLocalService)invokableLocalService;
			}
			else {
				_service = new QlvtCapPhepGpkdvtDuongboQuocTeLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(QlvtCapPhepGpkdvtDuongboQuocTeLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(QlvtCapPhepGpkdvtDuongboQuocTeLocalService service) {
	}

	private static QlvtCapPhepGpkdvtDuongboQuocTeLocalService _service;
}