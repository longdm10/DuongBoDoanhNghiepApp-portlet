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

package vn.dtt.duongbo.dao.doanhnghiep.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser;

import java.util.List;

/**
 * The persistence utility for the dn doanh nghiep user service. This utility wraps {@link DnDoanhNghiepUserPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DnDoanhNghiepUserPersistence
 * @see DnDoanhNghiepUserPersistenceImpl
 * @generated
 */
public class DnDoanhNghiepUserUtil {
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
	public static void clearCache(DnDoanhNghiepUser dnDoanhNghiepUser) {
		getPersistence().clearCache(dnDoanhNghiepUser);
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
	public static List<DnDoanhNghiepUser> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DnDoanhNghiepUser> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DnDoanhNghiepUser> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DnDoanhNghiepUser update(DnDoanhNghiepUser dnDoanhNghiepUser)
		throws SystemException {
		return getPersistence().update(dnDoanhNghiepUser);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DnDoanhNghiepUser update(
		DnDoanhNghiepUser dnDoanhNghiepUser, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(dnDoanhNghiepUser, serviceContext);
	}

	/**
	* Returns the dn doanh nghiep user where userId = &#63; or throws a {@link vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepUserException} if it could not be found.
	*
	* @param userId the user ID
	* @return the matching dn doanh nghiep user
	* @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepUserException if a matching dn doanh nghiep user could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser findByUserId(
		long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepUserException {
		return getPersistence().findByUserId(userId);
	}

	/**
	* Returns the dn doanh nghiep user where userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userId the user ID
	* @return the matching dn doanh nghiep user, or <code>null</code> if a matching dn doanh nghiep user could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser fetchByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUserId(userId);
	}

	/**
	* Returns the dn doanh nghiep user where userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userId the user ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dn doanh nghiep user, or <code>null</code> if a matching dn doanh nghiep user could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser fetchByUserId(
		long userId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUserId(userId, retrieveFromCache);
	}

	/**
	* Removes the dn doanh nghiep user where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @return the dn doanh nghiep user that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser removeByUserId(
		long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepUserException {
		return getPersistence().removeByUserId(userId);
	}

	/**
	* Returns the number of dn doanh nghiep users where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching dn doanh nghiep users
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUserId(userId);
	}

	/**
	* Returns all the dn doanh nghiep users where nguoiLamThuTucId = &#63;.
	*
	* @param nguoiLamThuTucId the nguoi lam thu tuc ID
	* @return the matching dn doanh nghiep users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser> findByDnNguoiLamThuTucUserID(
		long nguoiLamThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDnNguoiLamThuTucUserID(nguoiLamThuTucId);
	}

	/**
	* Returns a range of all the dn doanh nghiep users where nguoiLamThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nguoiLamThuTucId the nguoi lam thu tuc ID
	* @param start the lower bound of the range of dn doanh nghiep users
	* @param end the upper bound of the range of dn doanh nghiep users (not inclusive)
	* @return the range of matching dn doanh nghiep users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser> findByDnNguoiLamThuTucUserID(
		long nguoiLamThuTucId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDnNguoiLamThuTucUserID(nguoiLamThuTucId, start, end);
	}

	/**
	* Returns an ordered range of all the dn doanh nghiep users where nguoiLamThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nguoiLamThuTucId the nguoi lam thu tuc ID
	* @param start the lower bound of the range of dn doanh nghiep users
	* @param end the upper bound of the range of dn doanh nghiep users (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dn doanh nghiep users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser> findByDnNguoiLamThuTucUserID(
		long nguoiLamThuTucId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDnNguoiLamThuTucUserID(nguoiLamThuTucId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dn doanh nghiep user in the ordered set where nguoiLamThuTucId = &#63;.
	*
	* @param nguoiLamThuTucId the nguoi lam thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dn doanh nghiep user
	* @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepUserException if a matching dn doanh nghiep user could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser findByDnNguoiLamThuTucUserID_First(
		long nguoiLamThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepUserException {
		return getPersistence()
				   .findByDnNguoiLamThuTucUserID_First(nguoiLamThuTucId,
			orderByComparator);
	}

	/**
	* Returns the first dn doanh nghiep user in the ordered set where nguoiLamThuTucId = &#63;.
	*
	* @param nguoiLamThuTucId the nguoi lam thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dn doanh nghiep user, or <code>null</code> if a matching dn doanh nghiep user could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser fetchByDnNguoiLamThuTucUserID_First(
		long nguoiLamThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDnNguoiLamThuTucUserID_First(nguoiLamThuTucId,
			orderByComparator);
	}

	/**
	* Returns the last dn doanh nghiep user in the ordered set where nguoiLamThuTucId = &#63;.
	*
	* @param nguoiLamThuTucId the nguoi lam thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dn doanh nghiep user
	* @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepUserException if a matching dn doanh nghiep user could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser findByDnNguoiLamThuTucUserID_Last(
		long nguoiLamThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepUserException {
		return getPersistence()
				   .findByDnNguoiLamThuTucUserID_Last(nguoiLamThuTucId,
			orderByComparator);
	}

	/**
	* Returns the last dn doanh nghiep user in the ordered set where nguoiLamThuTucId = &#63;.
	*
	* @param nguoiLamThuTucId the nguoi lam thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dn doanh nghiep user, or <code>null</code> if a matching dn doanh nghiep user could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser fetchByDnNguoiLamThuTucUserID_Last(
		long nguoiLamThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDnNguoiLamThuTucUserID_Last(nguoiLamThuTucId,
			orderByComparator);
	}

	/**
	* Returns the dn doanh nghiep users before and after the current dn doanh nghiep user in the ordered set where nguoiLamThuTucId = &#63;.
	*
	* @param id the primary key of the current dn doanh nghiep user
	* @param nguoiLamThuTucId the nguoi lam thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dn doanh nghiep user
	* @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepUserException if a dn doanh nghiep user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser[] findByDnNguoiLamThuTucUserID_PrevAndNext(
		long id, long nguoiLamThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepUserException {
		return getPersistence()
				   .findByDnNguoiLamThuTucUserID_PrevAndNext(id,
			nguoiLamThuTucId, orderByComparator);
	}

	/**
	* Removes all the dn doanh nghiep users where nguoiLamThuTucId = &#63; from the database.
	*
	* @param nguoiLamThuTucId the nguoi lam thu tuc ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDnNguoiLamThuTucUserID(long nguoiLamThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDnNguoiLamThuTucUserID(nguoiLamThuTucId);
	}

	/**
	* Returns the number of dn doanh nghiep users where nguoiLamThuTucId = &#63;.
	*
	* @param nguoiLamThuTucId the nguoi lam thu tuc ID
	* @return the number of matching dn doanh nghiep users
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDnNguoiLamThuTucUserID(long nguoiLamThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDnNguoiLamThuTucUserID(nguoiLamThuTucId);
	}

	/**
	* Caches the dn doanh nghiep user in the entity cache if it is enabled.
	*
	* @param dnDoanhNghiepUser the dn doanh nghiep user
	*/
	public static void cacheResult(
		vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser dnDoanhNghiepUser) {
		getPersistence().cacheResult(dnDoanhNghiepUser);
	}

	/**
	* Caches the dn doanh nghiep users in the entity cache if it is enabled.
	*
	* @param dnDoanhNghiepUsers the dn doanh nghiep users
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser> dnDoanhNghiepUsers) {
		getPersistence().cacheResult(dnDoanhNghiepUsers);
	}

	/**
	* Creates a new dn doanh nghiep user with the primary key. Does not add the dn doanh nghiep user to the database.
	*
	* @param id the primary key for the new dn doanh nghiep user
	* @return the new dn doanh nghiep user
	*/
	public static vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dn doanh nghiep user with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dn doanh nghiep user
	* @return the dn doanh nghiep user that was removed
	* @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepUserException if a dn doanh nghiep user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepUserException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser updateImpl(
		vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser dnDoanhNghiepUser)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dnDoanhNghiepUser);
	}

	/**
	* Returns the dn doanh nghiep user with the primary key or throws a {@link vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepUserException} if it could not be found.
	*
	* @param id the primary key of the dn doanh nghiep user
	* @return the dn doanh nghiep user
	* @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepUserException if a dn doanh nghiep user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepUserException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dn doanh nghiep user with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dn doanh nghiep user
	* @return the dn doanh nghiep user, or <code>null</code> if a dn doanh nghiep user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the dn doanh nghiep users.
	*
	* @return the dn doanh nghiep users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dn doanh nghiep users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dn doanh nghiep users
	* @param end the upper bound of the range of dn doanh nghiep users (not inclusive)
	* @return the range of dn doanh nghiep users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dn doanh nghiep users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dn doanh nghiep users
	* @param end the upper bound of the range of dn doanh nghiep users (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dn doanh nghiep users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiepUser> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dn doanh nghiep users from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dn doanh nghiep users.
	*
	* @return the number of dn doanh nghiep users
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DnDoanhNghiepUserPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DnDoanhNghiepUserPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.doanhnghiep.service.ClpSerializer.getServletContextName(),
					DnDoanhNghiepUserPersistence.class.getName());

			ReferenceRegistry.registerReference(DnDoanhNghiepUserUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DnDoanhNghiepUserPersistence persistence) {
	}

	private static DnDoanhNghiepUserPersistence _persistence;
}