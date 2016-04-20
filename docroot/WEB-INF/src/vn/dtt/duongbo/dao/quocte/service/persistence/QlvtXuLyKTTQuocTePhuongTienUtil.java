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

package vn.dtt.duongbo.dao.quocte.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien;

import java.util.List;

/**
 * The persistence utility for the qlvt xu ly k t t quoc te phuong tien service. This utility wraps {@link QlvtXuLyKTTQuocTePhuongTienPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NoiPham
 * @see QlvtXuLyKTTQuocTePhuongTienPersistence
 * @see QlvtXuLyKTTQuocTePhuongTienPersistenceImpl
 * @generated
 */
public class QlvtXuLyKTTQuocTePhuongTienUtil {
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
		QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien) {
		getPersistence().clearCache(qlvtXuLyKTTQuocTePhuongTien);
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
	public static List<QlvtXuLyKTTQuocTePhuongTien> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QlvtXuLyKTTQuocTePhuongTien> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QlvtXuLyKTTQuocTePhuongTien> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static QlvtXuLyKTTQuocTePhuongTien update(
		QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien)
		throws SystemException {
		return getPersistence().update(qlvtXuLyKTTQuocTePhuongTien);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static QlvtXuLyKTTQuocTePhuongTien update(
		QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(qlvtXuLyKTTQuocTePhuongTien, serviceContext);
	}

	/**
	* Returns all the qlvt xu ly k t t quoc te phuong tiens where capPhepKTTQuocTeID = &#63;.
	*
	* @param capPhepKTTQuocTeID the cap phep k t t quoc te i d
	* @return the matching qlvt xu ly k t t quoc te phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien> findBycapPhepKTTQuocTeID(
		long capPhepKTTQuocTeID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBycapPhepKTTQuocTeID(capPhepKTTQuocTeID);
	}

	/**
	* Returns a range of all the qlvt xu ly k t t quoc te phuong tiens where capPhepKTTQuocTeID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTePhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param capPhepKTTQuocTeID the cap phep k t t quoc te i d
	* @param start the lower bound of the range of qlvt xu ly k t t quoc te phuong tiens
	* @param end the upper bound of the range of qlvt xu ly k t t quoc te phuong tiens (not inclusive)
	* @return the range of matching qlvt xu ly k t t quoc te phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien> findBycapPhepKTTQuocTeID(
		long capPhepKTTQuocTeID, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBycapPhepKTTQuocTeID(capPhepKTTQuocTeID, start, end);
	}

	/**
	* Returns an ordered range of all the qlvt xu ly k t t quoc te phuong tiens where capPhepKTTQuocTeID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTePhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param capPhepKTTQuocTeID the cap phep k t t quoc te i d
	* @param start the lower bound of the range of qlvt xu ly k t t quoc te phuong tiens
	* @param end the upper bound of the range of qlvt xu ly k t t quoc te phuong tiens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching qlvt xu ly k t t quoc te phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien> findBycapPhepKTTQuocTeID(
		long capPhepKTTQuocTeID, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBycapPhepKTTQuocTeID(capPhepKTTQuocTeID, start, end,
			orderByComparator);
	}

	/**
	* Returns the first qlvt xu ly k t t quoc te phuong tien in the ordered set where capPhepKTTQuocTeID = &#63;.
	*
	* @param capPhepKTTQuocTeID the cap phep k t t quoc te i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching qlvt xu ly k t t quoc te phuong tien
	* @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTePhuongTienException if a matching qlvt xu ly k t t quoc te phuong tien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien findBycapPhepKTTQuocTeID_First(
		long capPhepKTTQuocTeID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTePhuongTienException {
		return getPersistence()
				   .findBycapPhepKTTQuocTeID_First(capPhepKTTQuocTeID,
			orderByComparator);
	}

	/**
	* Returns the first qlvt xu ly k t t quoc te phuong tien in the ordered set where capPhepKTTQuocTeID = &#63;.
	*
	* @param capPhepKTTQuocTeID the cap phep k t t quoc te i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching qlvt xu ly k t t quoc te phuong tien, or <code>null</code> if a matching qlvt xu ly k t t quoc te phuong tien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien fetchBycapPhepKTTQuocTeID_First(
		long capPhepKTTQuocTeID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBycapPhepKTTQuocTeID_First(capPhepKTTQuocTeID,
			orderByComparator);
	}

	/**
	* Returns the last qlvt xu ly k t t quoc te phuong tien in the ordered set where capPhepKTTQuocTeID = &#63;.
	*
	* @param capPhepKTTQuocTeID the cap phep k t t quoc te i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching qlvt xu ly k t t quoc te phuong tien
	* @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTePhuongTienException if a matching qlvt xu ly k t t quoc te phuong tien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien findBycapPhepKTTQuocTeID_Last(
		long capPhepKTTQuocTeID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTePhuongTienException {
		return getPersistence()
				   .findBycapPhepKTTQuocTeID_Last(capPhepKTTQuocTeID,
			orderByComparator);
	}

	/**
	* Returns the last qlvt xu ly k t t quoc te phuong tien in the ordered set where capPhepKTTQuocTeID = &#63;.
	*
	* @param capPhepKTTQuocTeID the cap phep k t t quoc te i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching qlvt xu ly k t t quoc te phuong tien, or <code>null</code> if a matching qlvt xu ly k t t quoc te phuong tien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien fetchBycapPhepKTTQuocTeID_Last(
		long capPhepKTTQuocTeID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBycapPhepKTTQuocTeID_Last(capPhepKTTQuocTeID,
			orderByComparator);
	}

	/**
	* Returns the qlvt xu ly k t t quoc te phuong tiens before and after the current qlvt xu ly k t t quoc te phuong tien in the ordered set where capPhepKTTQuocTeID = &#63;.
	*
	* @param id the primary key of the current qlvt xu ly k t t quoc te phuong tien
	* @param capPhepKTTQuocTeID the cap phep k t t quoc te i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next qlvt xu ly k t t quoc te phuong tien
	* @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTePhuongTienException if a qlvt xu ly k t t quoc te phuong tien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien[] findBycapPhepKTTQuocTeID_PrevAndNext(
		long id, long capPhepKTTQuocTeID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTePhuongTienException {
		return getPersistence()
				   .findBycapPhepKTTQuocTeID_PrevAndNext(id,
			capPhepKTTQuocTeID, orderByComparator);
	}

	/**
	* Removes all the qlvt xu ly k t t quoc te phuong tiens where capPhepKTTQuocTeID = &#63; from the database.
	*
	* @param capPhepKTTQuocTeID the cap phep k t t quoc te i d
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBycapPhepKTTQuocTeID(long capPhepKTTQuocTeID)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBycapPhepKTTQuocTeID(capPhepKTTQuocTeID);
	}

	/**
	* Returns the number of qlvt xu ly k t t quoc te phuong tiens where capPhepKTTQuocTeID = &#63;.
	*
	* @param capPhepKTTQuocTeID the cap phep k t t quoc te i d
	* @return the number of matching qlvt xu ly k t t quoc te phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	public static int countBycapPhepKTTQuocTeID(long capPhepKTTQuocTeID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBycapPhepKTTQuocTeID(capPhepKTTQuocTeID);
	}

	/**
	* Caches the qlvt xu ly k t t quoc te phuong tien in the entity cache if it is enabled.
	*
	* @param qlvtXuLyKTTQuocTePhuongTien the qlvt xu ly k t t quoc te phuong tien
	*/
	public static void cacheResult(
		vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien) {
		getPersistence().cacheResult(qlvtXuLyKTTQuocTePhuongTien);
	}

	/**
	* Caches the qlvt xu ly k t t quoc te phuong tiens in the entity cache if it is enabled.
	*
	* @param qlvtXuLyKTTQuocTePhuongTiens the qlvt xu ly k t t quoc te phuong tiens
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien> qlvtXuLyKTTQuocTePhuongTiens) {
		getPersistence().cacheResult(qlvtXuLyKTTQuocTePhuongTiens);
	}

	/**
	* Creates a new qlvt xu ly k t t quoc te phuong tien with the primary key. Does not add the qlvt xu ly k t t quoc te phuong tien to the database.
	*
	* @param id the primary key for the new qlvt xu ly k t t quoc te phuong tien
	* @return the new qlvt xu ly k t t quoc te phuong tien
	*/
	public static vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the qlvt xu ly k t t quoc te phuong tien with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt xu ly k t t quoc te phuong tien
	* @return the qlvt xu ly k t t quoc te phuong tien that was removed
	* @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTePhuongTienException if a qlvt xu ly k t t quoc te phuong tien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTePhuongTienException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien updateImpl(
		vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien qlvtXuLyKTTQuocTePhuongTien)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(qlvtXuLyKTTQuocTePhuongTien);
	}

	/**
	* Returns the qlvt xu ly k t t quoc te phuong tien with the primary key or throws a {@link vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTePhuongTienException} if it could not be found.
	*
	* @param id the primary key of the qlvt xu ly k t t quoc te phuong tien
	* @return the qlvt xu ly k t t quoc te phuong tien
	* @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTePhuongTienException if a qlvt xu ly k t t quoc te phuong tien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTePhuongTienException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the qlvt xu ly k t t quoc te phuong tien with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the qlvt xu ly k t t quoc te phuong tien
	* @return the qlvt xu ly k t t quoc te phuong tien, or <code>null</code> if a qlvt xu ly k t t quoc te phuong tien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the qlvt xu ly k t t quoc te phuong tiens.
	*
	* @return the qlvt xu ly k t t quoc te phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the qlvt xu ly k t t quoc te phuong tiens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTePhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt xu ly k t t quoc te phuong tiens
	* @param end the upper bound of the range of qlvt xu ly k t t quoc te phuong tiens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of qlvt xu ly k t t quoc te phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTePhuongTien> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the qlvt xu ly k t t quoc te phuong tiens from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of qlvt xu ly k t t quoc te phuong tiens.
	*
	* @return the number of qlvt xu ly k t t quoc te phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static QlvtXuLyKTTQuocTePhuongTienPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (QlvtXuLyKTTQuocTePhuongTienPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.quocte.service.ClpSerializer.getServletContextName(),
					QlvtXuLyKTTQuocTePhuongTienPersistence.class.getName());

			ReferenceRegistry.registerReference(QlvtXuLyKTTQuocTePhuongTienUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(
		QlvtXuLyKTTQuocTePhuongTienPersistence persistence) {
	}

	private static QlvtXuLyKTTQuocTePhuongTienPersistence _persistence;
}