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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for QlvtDiemDungDangKyVietLao. This utility wraps
 * {@link vn.dtt.duongbo.dao.common.service.impl.QlvtDiemDungDangKyVietLaoLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author win_64
 * @see QlvtDiemDungDangKyVietLaoLocalService
 * @see vn.dtt.duongbo.dao.common.service.base.QlvtDiemDungDangKyVietLaoLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.common.service.impl.QlvtDiemDungDangKyVietLaoLocalServiceImpl
 * @generated
 */
public class QlvtDiemDungDangKyVietLaoLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.duongbo.dao.common.service.impl.QlvtDiemDungDangKyVietLaoLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the qlvt diem dung dang ky viet lao to the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtDiemDungDangKyVietLao the qlvt diem dung dang ky viet lao
	* @return the qlvt diem dung dang ky viet lao that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietLao addQlvtDiemDungDangKyVietLao(
		vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietLao qlvtDiemDungDangKyVietLao)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addQlvtDiemDungDangKyVietLao(qlvtDiemDungDangKyVietLao);
	}

	/**
	* Creates a new qlvt diem dung dang ky viet lao with the primary key. Does not add the qlvt diem dung dang ky viet lao to the database.
	*
	* @param id the primary key for the new qlvt diem dung dang ky viet lao
	* @return the new qlvt diem dung dang ky viet lao
	*/
	public static vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietLao createQlvtDiemDungDangKyVietLao(
		long id) {
		return getService().createQlvtDiemDungDangKyVietLao(id);
	}

	/**
	* Deletes the qlvt diem dung dang ky viet lao with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt diem dung dang ky viet lao
	* @return the qlvt diem dung dang ky viet lao that was removed
	* @throws PortalException if a qlvt diem dung dang ky viet lao with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietLao deleteQlvtDiemDungDangKyVietLao(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteQlvtDiemDungDangKyVietLao(id);
	}

	/**
	* Deletes the qlvt diem dung dang ky viet lao from the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtDiemDungDangKyVietLao the qlvt diem dung dang ky viet lao
	* @return the qlvt diem dung dang ky viet lao that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietLao deleteQlvtDiemDungDangKyVietLao(
		vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietLao qlvtDiemDungDangKyVietLao)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .deleteQlvtDiemDungDangKyVietLao(qlvtDiemDungDangKyVietLao);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtDiemDungDangKyVietLaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtDiemDungDangKyVietLaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietLao fetchQlvtDiemDungDangKyVietLao(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchQlvtDiemDungDangKyVietLao(id);
	}

	/**
	* Returns the qlvt diem dung dang ky viet lao with the primary key.
	*
	* @param id the primary key of the qlvt diem dung dang ky viet lao
	* @return the qlvt diem dung dang ky viet lao
	* @throws PortalException if a qlvt diem dung dang ky viet lao with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietLao getQlvtDiemDungDangKyVietLao(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getQlvtDiemDungDangKyVietLao(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the qlvt diem dung dang ky viet laos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtDiemDungDangKyVietLaoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt diem dung dang ky viet laos
	* @param end the upper bound of the range of qlvt diem dung dang ky viet laos (not inclusive)
	* @return the range of qlvt diem dung dang ky viet laos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietLao> getQlvtDiemDungDangKyVietLaos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getQlvtDiemDungDangKyVietLaos(start, end);
	}

	/**
	* Returns the number of qlvt diem dung dang ky viet laos.
	*
	* @return the number of qlvt diem dung dang ky viet laos
	* @throws SystemException if a system exception occurred
	*/
	public static int getQlvtDiemDungDangKyVietLaosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getQlvtDiemDungDangKyVietLaosCount();
	}

	/**
	* Updates the qlvt diem dung dang ky viet lao in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param qlvtDiemDungDangKyVietLao the qlvt diem dung dang ky viet lao
	* @return the qlvt diem dung dang ky viet lao that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietLao updateQlvtDiemDungDangKyVietLao(
		vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietLao qlvtDiemDungDangKyVietLao)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateQlvtDiemDungDangKyVietLao(qlvtDiemDungDangKyVietLao);
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

	public static java.util.List<java.lang.Long> findIdNoiDungHoSoId(
		long noiDungHoSoI) {
		return getService().findIdNoiDungHoSoId(noiDungHoSoI);
	}

	public static void clearService() {
		_service = null;
	}

	public static QlvtDiemDungDangKyVietLaoLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					QlvtDiemDungDangKyVietLaoLocalService.class.getName());

			if (invokableLocalService instanceof QlvtDiemDungDangKyVietLaoLocalService) {
				_service = (QlvtDiemDungDangKyVietLaoLocalService)invokableLocalService;
			}
			else {
				_service = new QlvtDiemDungDangKyVietLaoLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(QlvtDiemDungDangKyVietLaoLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(QlvtDiemDungDangKyVietLaoLocalService service) {
	}

	private static QlvtDiemDungDangKyVietLaoLocalService _service;
}