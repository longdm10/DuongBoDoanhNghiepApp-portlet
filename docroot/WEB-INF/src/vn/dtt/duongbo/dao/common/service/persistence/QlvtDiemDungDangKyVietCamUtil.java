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

package vn.dtt.duongbo.dao.common.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietCam;

import java.util.List;

/**
 * The persistence utility for the qlvt diem dung dang ky viet cam service. This utility wraps {@link QlvtDiemDungDangKyVietCamPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see QlvtDiemDungDangKyVietCamPersistence
 * @see QlvtDiemDungDangKyVietCamPersistenceImpl
 * @generated
 */
public class QlvtDiemDungDangKyVietCamUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(
		QlvtDiemDungDangKyVietCam qlvtDiemDungDangKyVietCam) {
		getPersistence().clearCache(qlvtDiemDungDangKyVietCam);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<QlvtDiemDungDangKyVietCam> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QlvtDiemDungDangKyVietCam> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QlvtDiemDungDangKyVietCam> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static QlvtDiemDungDangKyVietCam update(
		QlvtDiemDungDangKyVietCam qlvtDiemDungDangKyVietCam)
		throws SystemException {
		return getPersistence().update(qlvtDiemDungDangKyVietCam);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static QlvtDiemDungDangKyVietCam update(
		QlvtDiemDungDangKyVietCam qlvtDiemDungDangKyVietCam,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(qlvtDiemDungDangKyVietCam, serviceContext);
	}

	/**
	* Caches the qlvt diem dung dang ky viet cam in the entity cache if it is enabled.
	*
	* @param qlvtDiemDungDangKyVietCam the qlvt diem dung dang ky viet cam
	*/
	public static void cacheResult(
		vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietCam qlvtDiemDungDangKyVietCam) {
		getPersistence().cacheResult(qlvtDiemDungDangKyVietCam);
	}

	/**
	* Caches the qlvt diem dung dang ky viet cams in the entity cache if it is enabled.
	*
	* @param qlvtDiemDungDangKyVietCams the qlvt diem dung dang ky viet cams
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietCam> qlvtDiemDungDangKyVietCams) {
		getPersistence().cacheResult(qlvtDiemDungDangKyVietCams);
	}

	/**
	* Creates a new qlvt diem dung dang ky viet cam with the primary key. Does not add the qlvt diem dung dang ky viet cam to the database.
	*
	* @param id the primary key for the new qlvt diem dung dang ky viet cam
	* @return the new qlvt diem dung dang ky viet cam
	*/
	public static vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietCam create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the qlvt diem dung dang ky viet cam with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt diem dung dang ky viet cam
	* @return the qlvt diem dung dang ky viet cam that was removed
	* @throws vn.dtt.duongbo.dao.common.NoSuchQlvtDiemDungDangKyVietCamException if a qlvt diem dung dang ky viet cam with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietCam remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchQlvtDiemDungDangKyVietCamException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietCam updateImpl(
		vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietCam qlvtDiemDungDangKyVietCam)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(qlvtDiemDungDangKyVietCam);
	}

	/**
	* Returns the qlvt diem dung dang ky viet cam with the primary key or throws a {@link vn.dtt.duongbo.dao.common.NoSuchQlvtDiemDungDangKyVietCamException} if it could not be found.
	*
	* @param id the primary key of the qlvt diem dung dang ky viet cam
	* @return the qlvt diem dung dang ky viet cam
	* @throws vn.dtt.duongbo.dao.common.NoSuchQlvtDiemDungDangKyVietCamException if a qlvt diem dung dang ky viet cam with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietCam findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchQlvtDiemDungDangKyVietCamException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the qlvt diem dung dang ky viet cam with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the qlvt diem dung dang ky viet cam
	* @return the qlvt diem dung dang ky viet cam, or <code>null</code> if a qlvt diem dung dang ky viet cam with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietCam fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the qlvt diem dung dang ky viet cams.
	*
	* @return the qlvt diem dung dang ky viet cams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietCam> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the qlvt diem dung dang ky viet cams.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtDiemDungDangKyVietCamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt diem dung dang ky viet cams
	* @param end the upper bound of the range of qlvt diem dung dang ky viet cams (not inclusive)
	* @return the range of qlvt diem dung dang ky viet cams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietCam> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the qlvt diem dung dang ky viet cams.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtDiemDungDangKyVietCamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt diem dung dang ky viet cams
	* @param end the upper bound of the range of qlvt diem dung dang ky viet cams (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of qlvt diem dung dang ky viet cams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.QlvtDiemDungDangKyVietCam> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the qlvt diem dung dang ky viet cams from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of qlvt diem dung dang ky viet cams.
	*
	* @return the number of qlvt diem dung dang ky viet cams
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static QlvtDiemDungDangKyVietCamPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (QlvtDiemDungDangKyVietCamPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.common.service.ClpSerializer.getServletContextName(),
					QlvtDiemDungDangKyVietCamPersistence.class.getName());

			ReferenceRegistry.registerReference(QlvtDiemDungDangKyVietCamUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(QlvtDiemDungDangKyVietCamPersistence persistence) {
	}

	private static QlvtDiemDungDangKyVietCamPersistence _persistence;
}