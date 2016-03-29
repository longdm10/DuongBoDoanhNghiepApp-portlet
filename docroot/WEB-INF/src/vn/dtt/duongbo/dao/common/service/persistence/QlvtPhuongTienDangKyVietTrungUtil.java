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

import vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietTrung;

import java.util.List;

/**
 * The persistence utility for the qlvt phuong tien dang ky viet trung service. This utility wraps {@link QlvtPhuongTienDangKyVietTrungPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see QlvtPhuongTienDangKyVietTrungPersistence
 * @see QlvtPhuongTienDangKyVietTrungPersistenceImpl
 * @generated
 */
public class QlvtPhuongTienDangKyVietTrungUtil {
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
		QlvtPhuongTienDangKyVietTrung qlvtPhuongTienDangKyVietTrung) {
		getPersistence().clearCache(qlvtPhuongTienDangKyVietTrung);
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
	public static List<QlvtPhuongTienDangKyVietTrung> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QlvtPhuongTienDangKyVietTrung> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QlvtPhuongTienDangKyVietTrung> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static QlvtPhuongTienDangKyVietTrung update(
		QlvtPhuongTienDangKyVietTrung qlvtPhuongTienDangKyVietTrung)
		throws SystemException {
		return getPersistence().update(qlvtPhuongTienDangKyVietTrung);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static QlvtPhuongTienDangKyVietTrung update(
		QlvtPhuongTienDangKyVietTrung qlvtPhuongTienDangKyVietTrung,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(qlvtPhuongTienDangKyVietTrung, serviceContext);
	}

	/**
	* Returns all the qlvt phuong tien dang ky viet trungs where NoiDungHoSoId = &#63;.
	*
	* @param NoiDungHoSoId the noi dung ho so ID
	* @return the matching qlvt phuong tien dang ky viet trungs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietTrung> findByNoiDungHoSoId(
		long NoiDungHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByNoiDungHoSoId(NoiDungHoSoId);
	}

	/**
	* Returns a range of all the qlvt phuong tien dang ky viet trungs where NoiDungHoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietTrungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param NoiDungHoSoId the noi dung ho so ID
	* @param start the lower bound of the range of qlvt phuong tien dang ky viet trungs
	* @param end the upper bound of the range of qlvt phuong tien dang ky viet trungs (not inclusive)
	* @return the range of matching qlvt phuong tien dang ky viet trungs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietTrung> findByNoiDungHoSoId(
		long NoiDungHoSoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByNoiDungHoSoId(NoiDungHoSoId, start, end);
	}

	/**
	* Returns an ordered range of all the qlvt phuong tien dang ky viet trungs where NoiDungHoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietTrungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param NoiDungHoSoId the noi dung ho so ID
	* @param start the lower bound of the range of qlvt phuong tien dang ky viet trungs
	* @param end the upper bound of the range of qlvt phuong tien dang ky viet trungs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching qlvt phuong tien dang ky viet trungs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietTrung> findByNoiDungHoSoId(
		long NoiDungHoSoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNoiDungHoSoId(NoiDungHoSoId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first qlvt phuong tien dang ky viet trung in the ordered set where NoiDungHoSoId = &#63;.
	*
	* @param NoiDungHoSoId the noi dung ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching qlvt phuong tien dang ky viet trung
	* @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietTrungException if a matching qlvt phuong tien dang ky viet trung could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietTrung findByNoiDungHoSoId_First(
		long NoiDungHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietTrungException {
		return getPersistence()
				   .findByNoiDungHoSoId_First(NoiDungHoSoId, orderByComparator);
	}

	/**
	* Returns the first qlvt phuong tien dang ky viet trung in the ordered set where NoiDungHoSoId = &#63;.
	*
	* @param NoiDungHoSoId the noi dung ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching qlvt phuong tien dang ky viet trung, or <code>null</code> if a matching qlvt phuong tien dang ky viet trung could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietTrung fetchByNoiDungHoSoId_First(
		long NoiDungHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNoiDungHoSoId_First(NoiDungHoSoId, orderByComparator);
	}

	/**
	* Returns the last qlvt phuong tien dang ky viet trung in the ordered set where NoiDungHoSoId = &#63;.
	*
	* @param NoiDungHoSoId the noi dung ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching qlvt phuong tien dang ky viet trung
	* @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietTrungException if a matching qlvt phuong tien dang ky viet trung could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietTrung findByNoiDungHoSoId_Last(
		long NoiDungHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietTrungException {
		return getPersistence()
				   .findByNoiDungHoSoId_Last(NoiDungHoSoId, orderByComparator);
	}

	/**
	* Returns the last qlvt phuong tien dang ky viet trung in the ordered set where NoiDungHoSoId = &#63;.
	*
	* @param NoiDungHoSoId the noi dung ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching qlvt phuong tien dang ky viet trung, or <code>null</code> if a matching qlvt phuong tien dang ky viet trung could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietTrung fetchByNoiDungHoSoId_Last(
		long NoiDungHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNoiDungHoSoId_Last(NoiDungHoSoId, orderByComparator);
	}

	/**
	* Returns the qlvt phuong tien dang ky viet trungs before and after the current qlvt phuong tien dang ky viet trung in the ordered set where NoiDungHoSoId = &#63;.
	*
	* @param id the primary key of the current qlvt phuong tien dang ky viet trung
	* @param NoiDungHoSoId the noi dung ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next qlvt phuong tien dang ky viet trung
	* @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietTrungException if a qlvt phuong tien dang ky viet trung with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietTrung[] findByNoiDungHoSoId_PrevAndNext(
		long id, long NoiDungHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietTrungException {
		return getPersistence()
				   .findByNoiDungHoSoId_PrevAndNext(id, NoiDungHoSoId,
			orderByComparator);
	}

	/**
	* Removes all the qlvt phuong tien dang ky viet trungs where NoiDungHoSoId = &#63; from the database.
	*
	* @param NoiDungHoSoId the noi dung ho so ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByNoiDungHoSoId(long NoiDungHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByNoiDungHoSoId(NoiDungHoSoId);
	}

	/**
	* Returns the number of qlvt phuong tien dang ky viet trungs where NoiDungHoSoId = &#63;.
	*
	* @param NoiDungHoSoId the noi dung ho so ID
	* @return the number of matching qlvt phuong tien dang ky viet trungs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByNoiDungHoSoId(long NoiDungHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByNoiDungHoSoId(NoiDungHoSoId);
	}

	/**
	* Caches the qlvt phuong tien dang ky viet trung in the entity cache if it is enabled.
	*
	* @param qlvtPhuongTienDangKyVietTrung the qlvt phuong tien dang ky viet trung
	*/
	public static void cacheResult(
		vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietTrung qlvtPhuongTienDangKyVietTrung) {
		getPersistence().cacheResult(qlvtPhuongTienDangKyVietTrung);
	}

	/**
	* Caches the qlvt phuong tien dang ky viet trungs in the entity cache if it is enabled.
	*
	* @param qlvtPhuongTienDangKyVietTrungs the qlvt phuong tien dang ky viet trungs
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietTrung> qlvtPhuongTienDangKyVietTrungs) {
		getPersistence().cacheResult(qlvtPhuongTienDangKyVietTrungs);
	}

	/**
	* Creates a new qlvt phuong tien dang ky viet trung with the primary key. Does not add the qlvt phuong tien dang ky viet trung to the database.
	*
	* @param id the primary key for the new qlvt phuong tien dang ky viet trung
	* @return the new qlvt phuong tien dang ky viet trung
	*/
	public static vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietTrung create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the qlvt phuong tien dang ky viet trung with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt phuong tien dang ky viet trung
	* @return the qlvt phuong tien dang ky viet trung that was removed
	* @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietTrungException if a qlvt phuong tien dang ky viet trung with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietTrung remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietTrungException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietTrung updateImpl(
		vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietTrung qlvtPhuongTienDangKyVietTrung)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(qlvtPhuongTienDangKyVietTrung);
	}

	/**
	* Returns the qlvt phuong tien dang ky viet trung with the primary key or throws a {@link vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietTrungException} if it could not be found.
	*
	* @param id the primary key of the qlvt phuong tien dang ky viet trung
	* @return the qlvt phuong tien dang ky viet trung
	* @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietTrungException if a qlvt phuong tien dang ky viet trung with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietTrung findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienDangKyVietTrungException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the qlvt phuong tien dang ky viet trung with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the qlvt phuong tien dang ky viet trung
	* @return the qlvt phuong tien dang ky viet trung, or <code>null</code> if a qlvt phuong tien dang ky viet trung with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietTrung fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the qlvt phuong tien dang ky viet trungs.
	*
	* @return the qlvt phuong tien dang ky viet trungs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietTrung> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the qlvt phuong tien dang ky viet trungs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietTrungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt phuong tien dang ky viet trungs
	* @param end the upper bound of the range of qlvt phuong tien dang ky viet trungs (not inclusive)
	* @return the range of qlvt phuong tien dang ky viet trungs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietTrung> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the qlvt phuong tien dang ky viet trungs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienDangKyVietTrungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt phuong tien dang ky viet trungs
	* @param end the upper bound of the range of qlvt phuong tien dang ky viet trungs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of qlvt phuong tien dang ky viet trungs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.QlvtPhuongTienDangKyVietTrung> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the qlvt phuong tien dang ky viet trungs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of qlvt phuong tien dang ky viet trungs.
	*
	* @return the number of qlvt phuong tien dang ky viet trungs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static QlvtPhuongTienDangKyVietTrungPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (QlvtPhuongTienDangKyVietTrungPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.common.service.ClpSerializer.getServletContextName(),
					QlvtPhuongTienDangKyVietTrungPersistence.class.getName());

			ReferenceRegistry.registerReference(QlvtPhuongTienDangKyVietTrungUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(
		QlvtPhuongTienDangKyVietTrungPersistence persistence) {
	}

	private static QlvtPhuongTienDangKyVietTrungPersistence _persistence;
}