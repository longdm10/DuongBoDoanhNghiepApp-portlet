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

import vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCam;

import java.util.List;

/**
 * The persistence utility for the qlvt phuong tien dang ky viet cam service. This utility wraps {@link QlvtPhuongTienDangKyVietCamPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see QlvtPhuongTienDangKyVietCamPersistence
 * @see QlvtPhuongTienDangKyVietCamPersistenceImpl
 * @generated
 */
public class QlvtPhuongTienDangKyVietCamUtil {
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
		QlvtPhuongTienDangKyVietCam qlvtPhuongTienDangKyVietCam) {
		getPersistence().clearCache(qlvtPhuongTienDangKyVietCam);
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
	public static List<QlvtPhuongTienDangKyVietCam> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QlvtPhuongTienDangKyVietCam> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QlvtPhuongTienDangKyVietCam> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static QlvtPhuongTienDangKyVietCam update(
		QlvtPhuongTienDangKyVietCam qlvtPhuongTienDangKyVietCam)
		throws SystemException {
		return getPersistence().update(qlvtPhuongTienDangKyVietCam);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static QlvtPhuongTienDangKyVietCam update(
		QlvtPhuongTienDangKyVietCam qlvtPhuongTienDangKyVietCam,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(qlvtPhuongTienDangKyVietCam, serviceContext);
	}

	/**
	* Returns all the qlvt phuong tien dang ky viet cams where NoiDungHoSoId = &#63;.
	*
	* @param NoiDungHoSoId the noi dung ho so ID
	* @return the matching qlvt phuong tien dang ky viet cams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCam> findByNoiDungHoSoId(
		long NoiDungHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByNoiDungHoSoId(NoiDungHoSoId);
	}

	/**
	* Returns a range of all the qlvt phuong tien dang ky viet cams where NoiDungHoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietCamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param NoiDungHoSoId the noi dung ho so ID
	* @param start the lower bound of the range of qlvt phuong tien dang ky viet cams
	* @param end the upper bound of the range of qlvt phuong tien dang ky viet cams (not inclusive)
	* @return the range of matching qlvt phuong tien dang ky viet cams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCam> findByNoiDungHoSoId(
		long NoiDungHoSoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByNoiDungHoSoId(NoiDungHoSoId, start, end);
	}

	/**
	* Returns an ordered range of all the qlvt phuong tien dang ky viet cams where NoiDungHoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietCamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param NoiDungHoSoId the noi dung ho so ID
	* @param start the lower bound of the range of qlvt phuong tien dang ky viet cams
	* @param end the upper bound of the range of qlvt phuong tien dang ky viet cams (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching qlvt phuong tien dang ky viet cams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCam> findByNoiDungHoSoId(
		long NoiDungHoSoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNoiDungHoSoId(NoiDungHoSoId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first qlvt phuong tien dang ky viet cam in the ordered set where NoiDungHoSoId = &#63;.
	*
	* @param NoiDungHoSoId the noi dung ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching qlvt phuong tien dang ky viet cam
	* @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietCamException if a matching qlvt phuong tien dang ky viet cam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCam findByNoiDungHoSoId_First(
		long NoiDungHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietCamException {
		return getPersistence()
				   .findByNoiDungHoSoId_First(NoiDungHoSoId, orderByComparator);
	}

	/**
	* Returns the first qlvt phuong tien dang ky viet cam in the ordered set where NoiDungHoSoId = &#63;.
	*
	* @param NoiDungHoSoId the noi dung ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching qlvt phuong tien dang ky viet cam, or <code>null</code> if a matching qlvt phuong tien dang ky viet cam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCam fetchByNoiDungHoSoId_First(
		long NoiDungHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNoiDungHoSoId_First(NoiDungHoSoId, orderByComparator);
	}

	/**
	* Returns the last qlvt phuong tien dang ky viet cam in the ordered set where NoiDungHoSoId = &#63;.
	*
	* @param NoiDungHoSoId the noi dung ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching qlvt phuong tien dang ky viet cam
	* @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietCamException if a matching qlvt phuong tien dang ky viet cam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCam findByNoiDungHoSoId_Last(
		long NoiDungHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietCamException {
		return getPersistence()
				   .findByNoiDungHoSoId_Last(NoiDungHoSoId, orderByComparator);
	}

	/**
	* Returns the last qlvt phuong tien dang ky viet cam in the ordered set where NoiDungHoSoId = &#63;.
	*
	* @param NoiDungHoSoId the noi dung ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching qlvt phuong tien dang ky viet cam, or <code>null</code> if a matching qlvt phuong tien dang ky viet cam could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCam fetchByNoiDungHoSoId_Last(
		long NoiDungHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNoiDungHoSoId_Last(NoiDungHoSoId, orderByComparator);
	}

	/**
	* Returns the qlvt phuong tien dang ky viet cams before and after the current qlvt phuong tien dang ky viet cam in the ordered set where NoiDungHoSoId = &#63;.
	*
	* @param id the primary key of the current qlvt phuong tien dang ky viet cam
	* @param NoiDungHoSoId the noi dung ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next qlvt phuong tien dang ky viet cam
	* @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietCamException if a qlvt phuong tien dang ky viet cam with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCam[] findByNoiDungHoSoId_PrevAndNext(
		long id, long NoiDungHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietCamException {
		return getPersistence()
				   .findByNoiDungHoSoId_PrevAndNext(id, NoiDungHoSoId,
			orderByComparator);
	}

	/**
	* Removes all the qlvt phuong tien dang ky viet cams where NoiDungHoSoId = &#63; from the database.
	*
	* @param NoiDungHoSoId the noi dung ho so ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByNoiDungHoSoId(long NoiDungHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByNoiDungHoSoId(NoiDungHoSoId);
	}

	/**
	* Returns the number of qlvt phuong tien dang ky viet cams where NoiDungHoSoId = &#63;.
	*
	* @param NoiDungHoSoId the noi dung ho so ID
	* @return the number of matching qlvt phuong tien dang ky viet cams
	* @throws SystemException if a system exception occurred
	*/
	public static int countByNoiDungHoSoId(long NoiDungHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByNoiDungHoSoId(NoiDungHoSoId);
	}

	/**
	* Caches the qlvt phuong tien dang ky viet cam in the entity cache if it is enabled.
	*
	* @param qlvtPhuongTienDangKyVietCam the qlvt phuong tien dang ky viet cam
	*/
	public static void cacheResult(
		vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCam qlvtPhuongTienDangKyVietCam) {
		getPersistence().cacheResult(qlvtPhuongTienDangKyVietCam);
	}

	/**
	* Caches the qlvt phuong tien dang ky viet cams in the entity cache if it is enabled.
	*
	* @param qlvtPhuongTienDangKyVietCams the qlvt phuong tien dang ky viet cams
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCam> qlvtPhuongTienDangKyVietCams) {
		getPersistence().cacheResult(qlvtPhuongTienDangKyVietCams);
	}

	/**
	* Creates a new qlvt phuong tien dang ky viet cam with the primary key. Does not add the qlvt phuong tien dang ky viet cam to the database.
	*
	* @param id the primary key for the new qlvt phuong tien dang ky viet cam
	* @return the new qlvt phuong tien dang ky viet cam
	*/
	public static vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCam create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the qlvt phuong tien dang ky viet cam with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt phuong tien dang ky viet cam
	* @return the qlvt phuong tien dang ky viet cam that was removed
	* @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietCamException if a qlvt phuong tien dang ky viet cam with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCam remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietCamException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCam updateImpl(
		vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCam qlvtPhuongTienDangKyVietCam)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(qlvtPhuongTienDangKyVietCam);
	}

	/**
	* Returns the qlvt phuong tien dang ky viet cam with the primary key or throws a {@link vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietCamException} if it could not be found.
	*
	* @param id the primary key of the qlvt phuong tien dang ky viet cam
	* @return the qlvt phuong tien dang ky viet cam
	* @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietCamException if a qlvt phuong tien dang ky viet cam with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCam findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietCamException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the qlvt phuong tien dang ky viet cam with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the qlvt phuong tien dang ky viet cam
	* @return the qlvt phuong tien dang ky viet cam, or <code>null</code> if a qlvt phuong tien dang ky viet cam with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCam fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the qlvt phuong tien dang ky viet cams.
	*
	* @return the qlvt phuong tien dang ky viet cams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCam> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the qlvt phuong tien dang ky viet cams.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietCamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt phuong tien dang ky viet cams
	* @param end the upper bound of the range of qlvt phuong tien dang ky viet cams (not inclusive)
	* @return the range of qlvt phuong tien dang ky viet cams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCam> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the qlvt phuong tien dang ky viet cams.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietCamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt phuong tien dang ky viet cams
	* @param end the upper bound of the range of qlvt phuong tien dang ky viet cams (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of qlvt phuong tien dang ky viet cams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietCam> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the qlvt phuong tien dang ky viet cams from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of qlvt phuong tien dang ky viet cams.
	*
	* @return the number of qlvt phuong tien dang ky viet cams
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static QlvtPhuongTienDangKyVietCamPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (QlvtPhuongTienDangKyVietCamPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.common.service.ClpSerializer.getServletContextName(),
					QlvtPhuongTienDangKyVietCamPersistence.class.getName());

			ReferenceRegistry.registerReference(QlvtPhuongTienDangKyVietCamUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(
		QlvtPhuongTienDangKyVietCamPersistence persistence) {
	}

	private static QlvtPhuongTienDangKyVietCamPersistence _persistence;
}