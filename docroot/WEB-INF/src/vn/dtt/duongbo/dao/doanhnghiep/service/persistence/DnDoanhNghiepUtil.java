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

import vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep;

import java.util.List;

/**
 * The persistence utility for the dn doanh nghiep service. This utility wraps {@link DnDoanhNghiepPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DnDoanhNghiepPersistence
 * @see DnDoanhNghiepPersistenceImpl
 * @generated
 */
public class DnDoanhNghiepUtil {
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
	public static void clearCache(DnDoanhNghiep dnDoanhNghiep) {
		getPersistence().clearCache(dnDoanhNghiep);
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
	public static List<DnDoanhNghiep> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DnDoanhNghiep> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DnDoanhNghiep> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DnDoanhNghiep update(DnDoanhNghiep dnDoanhNghiep)
		throws SystemException {
		return getPersistence().update(dnDoanhNghiep);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DnDoanhNghiep update(DnDoanhNghiep dnDoanhNghiep,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dnDoanhNghiep, serviceContext);
	}

	/**
	* Returns the dn doanh nghiep where id = &#63; or throws a {@link vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException} if it could not be found.
	*
	* @param id the ID
	* @return the matching dn doanh nghiep
	* @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException if a matching dn doanh nghiep could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep findByDnNguoiLamThuTucID(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException {
		return getPersistence().findByDnNguoiLamThuTucID(id);
	}

	/**
	* Returns the dn doanh nghiep where id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param id the ID
	* @return the matching dn doanh nghiep, or <code>null</code> if a matching dn doanh nghiep could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep fetchByDnNguoiLamThuTucID(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByDnNguoiLamThuTucID(id);
	}

	/**
	* Returns the dn doanh nghiep where id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param id the ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dn doanh nghiep, or <code>null</code> if a matching dn doanh nghiep could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep fetchByDnNguoiLamThuTucID(
		long id, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByDnNguoiLamThuTucID(id, retrieveFromCache);
	}

	/**
	* Removes the dn doanh nghiep where id = &#63; from the database.
	*
	* @param id the ID
	* @return the dn doanh nghiep that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep removeByDnNguoiLamThuTucID(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException {
		return getPersistence().removeByDnNguoiLamThuTucID(id);
	}

	/**
	* Returns the number of dn doanh nghieps where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching dn doanh nghieps
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDnNguoiLamThuTucID(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDnNguoiLamThuTucID(id);
	}

	/**
	* Returns all the dn doanh nghieps where loaiNguoiLamThuTuc = &#63;.
	*
	* @param loaiNguoiLamThuTuc the loai nguoi lam thu tuc
	* @return the matching dn doanh nghieps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep> findByloaiNguoiLamThuTuc(
		java.lang.String loaiNguoiLamThuTuc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByloaiNguoiLamThuTuc(loaiNguoiLamThuTuc);
	}

	/**
	* Returns a range of all the dn doanh nghieps where loaiNguoiLamThuTuc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param loaiNguoiLamThuTuc the loai nguoi lam thu tuc
	* @param start the lower bound of the range of dn doanh nghieps
	* @param end the upper bound of the range of dn doanh nghieps (not inclusive)
	* @return the range of matching dn doanh nghieps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep> findByloaiNguoiLamThuTuc(
		java.lang.String loaiNguoiLamThuTuc, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByloaiNguoiLamThuTuc(loaiNguoiLamThuTuc, start, end);
	}

	/**
	* Returns an ordered range of all the dn doanh nghieps where loaiNguoiLamThuTuc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param loaiNguoiLamThuTuc the loai nguoi lam thu tuc
	* @param start the lower bound of the range of dn doanh nghieps
	* @param end the upper bound of the range of dn doanh nghieps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dn doanh nghieps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep> findByloaiNguoiLamThuTuc(
		java.lang.String loaiNguoiLamThuTuc, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByloaiNguoiLamThuTuc(loaiNguoiLamThuTuc, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dn doanh nghiep in the ordered set where loaiNguoiLamThuTuc = &#63;.
	*
	* @param loaiNguoiLamThuTuc the loai nguoi lam thu tuc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dn doanh nghiep
	* @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException if a matching dn doanh nghiep could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep findByloaiNguoiLamThuTuc_First(
		java.lang.String loaiNguoiLamThuTuc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException {
		return getPersistence()
				   .findByloaiNguoiLamThuTuc_First(loaiNguoiLamThuTuc,
			orderByComparator);
	}

	/**
	* Returns the first dn doanh nghiep in the ordered set where loaiNguoiLamThuTuc = &#63;.
	*
	* @param loaiNguoiLamThuTuc the loai nguoi lam thu tuc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dn doanh nghiep, or <code>null</code> if a matching dn doanh nghiep could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep fetchByloaiNguoiLamThuTuc_First(
		java.lang.String loaiNguoiLamThuTuc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByloaiNguoiLamThuTuc_First(loaiNguoiLamThuTuc,
			orderByComparator);
	}

	/**
	* Returns the last dn doanh nghiep in the ordered set where loaiNguoiLamThuTuc = &#63;.
	*
	* @param loaiNguoiLamThuTuc the loai nguoi lam thu tuc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dn doanh nghiep
	* @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException if a matching dn doanh nghiep could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep findByloaiNguoiLamThuTuc_Last(
		java.lang.String loaiNguoiLamThuTuc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException {
		return getPersistence()
				   .findByloaiNguoiLamThuTuc_Last(loaiNguoiLamThuTuc,
			orderByComparator);
	}

	/**
	* Returns the last dn doanh nghiep in the ordered set where loaiNguoiLamThuTuc = &#63;.
	*
	* @param loaiNguoiLamThuTuc the loai nguoi lam thu tuc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dn doanh nghiep, or <code>null</code> if a matching dn doanh nghiep could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep fetchByloaiNguoiLamThuTuc_Last(
		java.lang.String loaiNguoiLamThuTuc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByloaiNguoiLamThuTuc_Last(loaiNguoiLamThuTuc,
			orderByComparator);
	}

	/**
	* Returns the dn doanh nghieps before and after the current dn doanh nghiep in the ordered set where loaiNguoiLamThuTuc = &#63;.
	*
	* @param id the primary key of the current dn doanh nghiep
	* @param loaiNguoiLamThuTuc the loai nguoi lam thu tuc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dn doanh nghiep
	* @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException if a dn doanh nghiep with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep[] findByloaiNguoiLamThuTuc_PrevAndNext(
		long id, java.lang.String loaiNguoiLamThuTuc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException {
		return getPersistence()
				   .findByloaiNguoiLamThuTuc_PrevAndNext(id,
			loaiNguoiLamThuTuc, orderByComparator);
	}

	/**
	* Removes all the dn doanh nghieps where loaiNguoiLamThuTuc = &#63; from the database.
	*
	* @param loaiNguoiLamThuTuc the loai nguoi lam thu tuc
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByloaiNguoiLamThuTuc(
		java.lang.String loaiNguoiLamThuTuc)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByloaiNguoiLamThuTuc(loaiNguoiLamThuTuc);
	}

	/**
	* Returns the number of dn doanh nghieps where loaiNguoiLamThuTuc = &#63;.
	*
	* @param loaiNguoiLamThuTuc the loai nguoi lam thu tuc
	* @return the number of matching dn doanh nghieps
	* @throws SystemException if a system exception occurred
	*/
	public static int countByloaiNguoiLamThuTuc(
		java.lang.String loaiNguoiLamThuTuc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByloaiNguoiLamThuTuc(loaiNguoiLamThuTuc);
	}

	/**
	* Returns all the dn doanh nghieps where email = &#63;.
	*
	* @param email the email
	* @return the matching dn doanh nghieps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep> findByEmail(
		java.lang.String email)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByEmail(email);
	}

	/**
	* Returns a range of all the dn doanh nghieps where email = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param email the email
	* @param start the lower bound of the range of dn doanh nghieps
	* @param end the upper bound of the range of dn doanh nghieps (not inclusive)
	* @return the range of matching dn doanh nghieps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep> findByEmail(
		java.lang.String email, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByEmail(email, start, end);
	}

	/**
	* Returns an ordered range of all the dn doanh nghieps where email = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param email the email
	* @param start the lower bound of the range of dn doanh nghieps
	* @param end the upper bound of the range of dn doanh nghieps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dn doanh nghieps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep> findByEmail(
		java.lang.String email, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByEmail(email, start, end, orderByComparator);
	}

	/**
	* Returns the first dn doanh nghiep in the ordered set where email = &#63;.
	*
	* @param email the email
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dn doanh nghiep
	* @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException if a matching dn doanh nghiep could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep findByEmail_First(
		java.lang.String email,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException {
		return getPersistence().findByEmail_First(email, orderByComparator);
	}

	/**
	* Returns the first dn doanh nghiep in the ordered set where email = &#63;.
	*
	* @param email the email
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dn doanh nghiep, or <code>null</code> if a matching dn doanh nghiep could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep fetchByEmail_First(
		java.lang.String email,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByEmail_First(email, orderByComparator);
	}

	/**
	* Returns the last dn doanh nghiep in the ordered set where email = &#63;.
	*
	* @param email the email
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dn doanh nghiep
	* @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException if a matching dn doanh nghiep could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep findByEmail_Last(
		java.lang.String email,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException {
		return getPersistence().findByEmail_Last(email, orderByComparator);
	}

	/**
	* Returns the last dn doanh nghiep in the ordered set where email = &#63;.
	*
	* @param email the email
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dn doanh nghiep, or <code>null</code> if a matching dn doanh nghiep could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep fetchByEmail_Last(
		java.lang.String email,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByEmail_Last(email, orderByComparator);
	}

	/**
	* Returns the dn doanh nghieps before and after the current dn doanh nghiep in the ordered set where email = &#63;.
	*
	* @param id the primary key of the current dn doanh nghiep
	* @param email the email
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dn doanh nghiep
	* @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException if a dn doanh nghiep with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep[] findByEmail_PrevAndNext(
		long id, java.lang.String email,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException {
		return getPersistence()
				   .findByEmail_PrevAndNext(id, email, orderByComparator);
	}

	/**
	* Removes all the dn doanh nghieps where email = &#63; from the database.
	*
	* @param email the email
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByEmail(java.lang.String email)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByEmail(email);
	}

	/**
	* Returns the number of dn doanh nghieps where email = &#63;.
	*
	* @param email the email
	* @return the number of matching dn doanh nghieps
	* @throws SystemException if a system exception occurred
	*/
	public static int countByEmail(java.lang.String email)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByEmail(email);
	}

	/**
	* Caches the dn doanh nghiep in the entity cache if it is enabled.
	*
	* @param dnDoanhNghiep the dn doanh nghiep
	*/
	public static void cacheResult(
		vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep dnDoanhNghiep) {
		getPersistence().cacheResult(dnDoanhNghiep);
	}

	/**
	* Caches the dn doanh nghieps in the entity cache if it is enabled.
	*
	* @param dnDoanhNghieps the dn doanh nghieps
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep> dnDoanhNghieps) {
		getPersistence().cacheResult(dnDoanhNghieps);
	}

	/**
	* Creates a new dn doanh nghiep with the primary key. Does not add the dn doanh nghiep to the database.
	*
	* @param id the primary key for the new dn doanh nghiep
	* @return the new dn doanh nghiep
	*/
	public static vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dn doanh nghiep with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dn doanh nghiep
	* @return the dn doanh nghiep that was removed
	* @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException if a dn doanh nghiep with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep updateImpl(
		vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep dnDoanhNghiep)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dnDoanhNghiep);
	}

	/**
	* Returns the dn doanh nghiep with the primary key or throws a {@link vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException} if it could not be found.
	*
	* @param id the primary key of the dn doanh nghiep
	* @return the dn doanh nghiep
	* @throws vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException if a dn doanh nghiep with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.doanhnghiep.NoSuchDnDoanhNghiepException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dn doanh nghiep with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dn doanh nghiep
	* @return the dn doanh nghiep, or <code>null</code> if a dn doanh nghiep with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the dn doanh nghieps.
	*
	* @return the dn doanh nghieps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dn doanh nghieps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dn doanh nghieps
	* @param end the upper bound of the range of dn doanh nghieps (not inclusive)
	* @return the range of dn doanh nghieps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dn doanh nghieps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.doanhnghiep.model.impl.DnDoanhNghiepModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dn doanh nghieps
	* @param end the upper bound of the range of dn doanh nghieps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dn doanh nghieps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.doanhnghiep.model.DnDoanhNghiep> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dn doanh nghieps from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dn doanh nghieps.
	*
	* @return the number of dn doanh nghieps
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DnDoanhNghiepPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DnDoanhNghiepPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.doanhnghiep.service.ClpSerializer.getServletContextName(),
					DnDoanhNghiepPersistence.class.getName());

			ReferenceRegistry.registerReference(DnDoanhNghiepUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DnDoanhNghiepPersistence persistence) {
	}

	private static DnDoanhNghiepPersistence _persistence;
}