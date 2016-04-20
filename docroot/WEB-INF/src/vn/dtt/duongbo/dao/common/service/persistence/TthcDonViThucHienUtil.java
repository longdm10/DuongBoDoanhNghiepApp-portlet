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

import vn.dtt.duongbo.dao.common.model.TthcDonViThucHien;

import java.util.List;

/**
 * The persistence utility for the tthc don vi thuc hien service. This utility wraps {@link TthcDonViThucHienPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcDonViThucHienPersistence
 * @see TthcDonViThucHienPersistenceImpl
 * @generated
 */
public class TthcDonViThucHienUtil {
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
	public static void clearCache(TthcDonViThucHien tthcDonViThucHien) {
		getPersistence().clearCache(tthcDonViThucHien);
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
	public static List<TthcDonViThucHien> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TthcDonViThucHien> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TthcDonViThucHien> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static TthcDonViThucHien update(TthcDonViThucHien tthcDonViThucHien)
		throws SystemException {
		return getPersistence().update(tthcDonViThucHien);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static TthcDonViThucHien update(
		TthcDonViThucHien tthcDonViThucHien, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(tthcDonViThucHien, serviceContext);
	}

	/**
	* Returns all the tthc don vi thuc hiens where thuTucHanhChinhId = &#63;.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @return the matching tthc don vi thuc hiens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcDonViThucHien> findByThuTucHanhChinhId(
		long thuTucHanhChinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByThuTucHanhChinhId(thuTucHanhChinhId);
	}

	/**
	* Returns a range of all the tthc don vi thuc hiens where thuTucHanhChinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcDonViThucHienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param start the lower bound of the range of tthc don vi thuc hiens
	* @param end the upper bound of the range of tthc don vi thuc hiens (not inclusive)
	* @return the range of matching tthc don vi thuc hiens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcDonViThucHien> findByThuTucHanhChinhId(
		long thuTucHanhChinhId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByThuTucHanhChinhId(thuTucHanhChinhId, start, end);
	}

	/**
	* Returns an ordered range of all the tthc don vi thuc hiens where thuTucHanhChinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcDonViThucHienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param start the lower bound of the range of tthc don vi thuc hiens
	* @param end the upper bound of the range of tthc don vi thuc hiens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tthc don vi thuc hiens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcDonViThucHien> findByThuTucHanhChinhId(
		long thuTucHanhChinhId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByThuTucHanhChinhId(thuTucHanhChinhId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first tthc don vi thuc hien in the ordered set where thuTucHanhChinhId = &#63;.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc don vi thuc hien
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcDonViThucHienException if a matching tthc don vi thuc hien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcDonViThucHien findByThuTucHanhChinhId_First(
		long thuTucHanhChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcDonViThucHienException {
		return getPersistence()
				   .findByThuTucHanhChinhId_First(thuTucHanhChinhId,
			orderByComparator);
	}

	/**
	* Returns the first tthc don vi thuc hien in the ordered set where thuTucHanhChinhId = &#63;.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc don vi thuc hien, or <code>null</code> if a matching tthc don vi thuc hien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcDonViThucHien fetchByThuTucHanhChinhId_First(
		long thuTucHanhChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByThuTucHanhChinhId_First(thuTucHanhChinhId,
			orderByComparator);
	}

	/**
	* Returns the last tthc don vi thuc hien in the ordered set where thuTucHanhChinhId = &#63;.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc don vi thuc hien
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcDonViThucHienException if a matching tthc don vi thuc hien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcDonViThucHien findByThuTucHanhChinhId_Last(
		long thuTucHanhChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcDonViThucHienException {
		return getPersistence()
				   .findByThuTucHanhChinhId_Last(thuTucHanhChinhId,
			orderByComparator);
	}

	/**
	* Returns the last tthc don vi thuc hien in the ordered set where thuTucHanhChinhId = &#63;.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc don vi thuc hien, or <code>null</code> if a matching tthc don vi thuc hien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcDonViThucHien fetchByThuTucHanhChinhId_Last(
		long thuTucHanhChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByThuTucHanhChinhId_Last(thuTucHanhChinhId,
			orderByComparator);
	}

	/**
	* Returns the tthc don vi thuc hiens before and after the current tthc don vi thuc hien in the ordered set where thuTucHanhChinhId = &#63;.
	*
	* @param id the primary key of the current tthc don vi thuc hien
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tthc don vi thuc hien
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcDonViThucHienException if a tthc don vi thuc hien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcDonViThucHien[] findByThuTucHanhChinhId_PrevAndNext(
		long id, long thuTucHanhChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcDonViThucHienException {
		return getPersistence()
				   .findByThuTucHanhChinhId_PrevAndNext(id, thuTucHanhChinhId,
			orderByComparator);
	}

	/**
	* Removes all the tthc don vi thuc hiens where thuTucHanhChinhId = &#63; from the database.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByThuTucHanhChinhId(long thuTucHanhChinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByThuTucHanhChinhId(thuTucHanhChinhId);
	}

	/**
	* Returns the number of tthc don vi thuc hiens where thuTucHanhChinhId = &#63;.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @return the number of matching tthc don vi thuc hiens
	* @throws SystemException if a system exception occurred
	*/
	public static int countByThuTucHanhChinhId(long thuTucHanhChinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByThuTucHanhChinhId(thuTucHanhChinhId);
	}

	/**
	* Returns the tthc don vi thuc hien where thuTucHanhChinhId = &#63; and maDonVi = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcDonViThucHienException} if it could not be found.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param maDonVi the ma don vi
	* @return the matching tthc don vi thuc hien
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcDonViThucHienException if a matching tthc don vi thuc hien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcDonViThucHien findByTTHC_MaDV(
		long thuTucHanhChinhId, java.lang.String maDonVi)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcDonViThucHienException {
		return getPersistence().findByTTHC_MaDV(thuTucHanhChinhId, maDonVi);
	}

	/**
	* Returns the tthc don vi thuc hien where thuTucHanhChinhId = &#63; and maDonVi = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param maDonVi the ma don vi
	* @return the matching tthc don vi thuc hien, or <code>null</code> if a matching tthc don vi thuc hien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcDonViThucHien fetchByTTHC_MaDV(
		long thuTucHanhChinhId, java.lang.String maDonVi)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByTTHC_MaDV(thuTucHanhChinhId, maDonVi);
	}

	/**
	* Returns the tthc don vi thuc hien where thuTucHanhChinhId = &#63; and maDonVi = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param maDonVi the ma don vi
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching tthc don vi thuc hien, or <code>null</code> if a matching tthc don vi thuc hien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcDonViThucHien fetchByTTHC_MaDV(
		long thuTucHanhChinhId, java.lang.String maDonVi,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTTHC_MaDV(thuTucHanhChinhId, maDonVi,
			retrieveFromCache);
	}

	/**
	* Removes the tthc don vi thuc hien where thuTucHanhChinhId = &#63; and maDonVi = &#63; from the database.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param maDonVi the ma don vi
	* @return the tthc don vi thuc hien that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcDonViThucHien removeByTTHC_MaDV(
		long thuTucHanhChinhId, java.lang.String maDonVi)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcDonViThucHienException {
		return getPersistence().removeByTTHC_MaDV(thuTucHanhChinhId, maDonVi);
	}

	/**
	* Returns the number of tthc don vi thuc hiens where thuTucHanhChinhId = &#63; and maDonVi = &#63;.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param maDonVi the ma don vi
	* @return the number of matching tthc don vi thuc hiens
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTTHC_MaDV(long thuTucHanhChinhId,
		java.lang.String maDonVi)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByTTHC_MaDV(thuTucHanhChinhId, maDonVi);
	}

	/**
	* Caches the tthc don vi thuc hien in the entity cache if it is enabled.
	*
	* @param tthcDonViThucHien the tthc don vi thuc hien
	*/
	public static void cacheResult(
		vn.dtt.duongbo.dao.common.model.TthcDonViThucHien tthcDonViThucHien) {
		getPersistence().cacheResult(tthcDonViThucHien);
	}

	/**
	* Caches the tthc don vi thuc hiens in the entity cache if it is enabled.
	*
	* @param tthcDonViThucHiens the tthc don vi thuc hiens
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.common.model.TthcDonViThucHien> tthcDonViThucHiens) {
		getPersistence().cacheResult(tthcDonViThucHiens);
	}

	/**
	* Creates a new tthc don vi thuc hien with the primary key. Does not add the tthc don vi thuc hien to the database.
	*
	* @param id the primary key for the new tthc don vi thuc hien
	* @return the new tthc don vi thuc hien
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcDonViThucHien create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the tthc don vi thuc hien with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tthc don vi thuc hien
	* @return the tthc don vi thuc hien that was removed
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcDonViThucHienException if a tthc don vi thuc hien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcDonViThucHien remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcDonViThucHienException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbo.dao.common.model.TthcDonViThucHien updateImpl(
		vn.dtt.duongbo.dao.common.model.TthcDonViThucHien tthcDonViThucHien)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tthcDonViThucHien);
	}

	/**
	* Returns the tthc don vi thuc hien with the primary key or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcDonViThucHienException} if it could not be found.
	*
	* @param id the primary key of the tthc don vi thuc hien
	* @return the tthc don vi thuc hien
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcDonViThucHienException if a tthc don vi thuc hien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcDonViThucHien findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcDonViThucHienException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the tthc don vi thuc hien with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the tthc don vi thuc hien
	* @return the tthc don vi thuc hien, or <code>null</code> if a tthc don vi thuc hien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcDonViThucHien fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the tthc don vi thuc hiens.
	*
	* @return the tthc don vi thuc hiens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcDonViThucHien> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the tthc don vi thuc hiens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcDonViThucHienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc don vi thuc hiens
	* @param end the upper bound of the range of tthc don vi thuc hiens (not inclusive)
	* @return the range of tthc don vi thuc hiens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcDonViThucHien> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the tthc don vi thuc hiens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcDonViThucHienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc don vi thuc hiens
	* @param end the upper bound of the range of tthc don vi thuc hiens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tthc don vi thuc hiens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcDonViThucHien> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the tthc don vi thuc hiens from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of tthc don vi thuc hiens.
	*
	* @return the number of tthc don vi thuc hiens
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TthcDonViThucHienPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TthcDonViThucHienPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.common.service.ClpSerializer.getServletContextName(),
					TthcDonViThucHienPersistence.class.getName());

			ReferenceRegistry.registerReference(TthcDonViThucHienUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(TthcDonViThucHienPersistence persistence) {
	}

	private static TthcDonViThucHienPersistence _persistence;
}