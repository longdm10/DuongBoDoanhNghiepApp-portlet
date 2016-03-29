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

package vn.dtt.duongbo.dao.capbienhieuphuhieu.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTien;

import java.util.List;

/**
 * The persistence utility for the q l v t xu ly phu hieu phuong tien service. This utility wraps {@link QLVTXuLyPhuHieuPhuongTienPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author binhta
 * @see QLVTXuLyPhuHieuPhuongTienPersistence
 * @see QLVTXuLyPhuHieuPhuongTienPersistenceImpl
 * @generated
 */
public class QLVTXuLyPhuHieuPhuongTienUtil {
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
		QLVTXuLyPhuHieuPhuongTien qlvtXuLyPhuHieuPhuongTien) {
		getPersistence().clearCache(qlvtXuLyPhuHieuPhuongTien);
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
	public static List<QLVTXuLyPhuHieuPhuongTien> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QLVTXuLyPhuHieuPhuongTien> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QLVTXuLyPhuHieuPhuongTien> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static QLVTXuLyPhuHieuPhuongTien update(
		QLVTXuLyPhuHieuPhuongTien qlvtXuLyPhuHieuPhuongTien)
		throws SystemException {
		return getPersistence().update(qlvtXuLyPhuHieuPhuongTien);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static QLVTXuLyPhuHieuPhuongTien update(
		QLVTXuLyPhuHieuPhuongTien qlvtXuLyPhuHieuPhuongTien,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(qlvtXuLyPhuHieuPhuongTien, serviceContext);
	}

	/**
	* Returns all the q l v t xu ly phu hieu phuong tiens where capPhuHieuID = &#63;.
	*
	* @param capPhuHieuID the cap phu hieu i d
	* @return the matching q l v t xu ly phu hieu phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTien> findBycapPhuHieuID(
		int capPhuHieuID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBycapPhuHieuID(capPhuHieuID);
	}

	/**
	* Returns a range of all the q l v t xu ly phu hieu phuong tiens where capPhuHieuID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyPhuHieuPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param capPhuHieuID the cap phu hieu i d
	* @param start the lower bound of the range of q l v t xu ly phu hieu phuong tiens
	* @param end the upper bound of the range of q l v t xu ly phu hieu phuong tiens (not inclusive)
	* @return the range of matching q l v t xu ly phu hieu phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTien> findBycapPhuHieuID(
		int capPhuHieuID, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBycapPhuHieuID(capPhuHieuID, start, end);
	}

	/**
	* Returns an ordered range of all the q l v t xu ly phu hieu phuong tiens where capPhuHieuID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyPhuHieuPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param capPhuHieuID the cap phu hieu i d
	* @param start the lower bound of the range of q l v t xu ly phu hieu phuong tiens
	* @param end the upper bound of the range of q l v t xu ly phu hieu phuong tiens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching q l v t xu ly phu hieu phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTien> findBycapPhuHieuID(
		int capPhuHieuID, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBycapPhuHieuID(capPhuHieuID, start, end,
			orderByComparator);
	}

	/**
	* Returns the first q l v t xu ly phu hieu phuong tien in the ordered set where capPhuHieuID = &#63;.
	*
	* @param capPhuHieuID the cap phu hieu i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching q l v t xu ly phu hieu phuong tien
	* @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuPhuongTienException if a matching q l v t xu ly phu hieu phuong tien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTien findBycapPhuHieuID_First(
		int capPhuHieuID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuPhuongTienException {
		return getPersistence()
				   .findBycapPhuHieuID_First(capPhuHieuID, orderByComparator);
	}

	/**
	* Returns the first q l v t xu ly phu hieu phuong tien in the ordered set where capPhuHieuID = &#63;.
	*
	* @param capPhuHieuID the cap phu hieu i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching q l v t xu ly phu hieu phuong tien, or <code>null</code> if a matching q l v t xu ly phu hieu phuong tien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTien fetchBycapPhuHieuID_First(
		int capPhuHieuID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBycapPhuHieuID_First(capPhuHieuID, orderByComparator);
	}

	/**
	* Returns the last q l v t xu ly phu hieu phuong tien in the ordered set where capPhuHieuID = &#63;.
	*
	* @param capPhuHieuID the cap phu hieu i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching q l v t xu ly phu hieu phuong tien
	* @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuPhuongTienException if a matching q l v t xu ly phu hieu phuong tien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTien findBycapPhuHieuID_Last(
		int capPhuHieuID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuPhuongTienException {
		return getPersistence()
				   .findBycapPhuHieuID_Last(capPhuHieuID, orderByComparator);
	}

	/**
	* Returns the last q l v t xu ly phu hieu phuong tien in the ordered set where capPhuHieuID = &#63;.
	*
	* @param capPhuHieuID the cap phu hieu i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching q l v t xu ly phu hieu phuong tien, or <code>null</code> if a matching q l v t xu ly phu hieu phuong tien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTien fetchBycapPhuHieuID_Last(
		int capPhuHieuID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBycapPhuHieuID_Last(capPhuHieuID, orderByComparator);
	}

	/**
	* Returns the q l v t xu ly phu hieu phuong tiens before and after the current q l v t xu ly phu hieu phuong tien in the ordered set where capPhuHieuID = &#63;.
	*
	* @param id the primary key of the current q l v t xu ly phu hieu phuong tien
	* @param capPhuHieuID the cap phu hieu i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next q l v t xu ly phu hieu phuong tien
	* @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuPhuongTienException if a q l v t xu ly phu hieu phuong tien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTien[] findBycapPhuHieuID_PrevAndNext(
		int id, int capPhuHieuID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuPhuongTienException {
		return getPersistence()
				   .findBycapPhuHieuID_PrevAndNext(id, capPhuHieuID,
			orderByComparator);
	}

	/**
	* Removes all the q l v t xu ly phu hieu phuong tiens where capPhuHieuID = &#63; from the database.
	*
	* @param capPhuHieuID the cap phu hieu i d
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBycapPhuHieuID(int capPhuHieuID)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBycapPhuHieuID(capPhuHieuID);
	}

	/**
	* Returns the number of q l v t xu ly phu hieu phuong tiens where capPhuHieuID = &#63;.
	*
	* @param capPhuHieuID the cap phu hieu i d
	* @return the number of matching q l v t xu ly phu hieu phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	public static int countBycapPhuHieuID(int capPhuHieuID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBycapPhuHieuID(capPhuHieuID);
	}

	/**
	* Caches the q l v t xu ly phu hieu phuong tien in the entity cache if it is enabled.
	*
	* @param qlvtXuLyPhuHieuPhuongTien the q l v t xu ly phu hieu phuong tien
	*/
	public static void cacheResult(
		vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTien qlvtXuLyPhuHieuPhuongTien) {
		getPersistence().cacheResult(qlvtXuLyPhuHieuPhuongTien);
	}

	/**
	* Caches the q l v t xu ly phu hieu phuong tiens in the entity cache if it is enabled.
	*
	* @param qlvtXuLyPhuHieuPhuongTiens the q l v t xu ly phu hieu phuong tiens
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTien> qlvtXuLyPhuHieuPhuongTiens) {
		getPersistence().cacheResult(qlvtXuLyPhuHieuPhuongTiens);
	}

	/**
	* Creates a new q l v t xu ly phu hieu phuong tien with the primary key. Does not add the q l v t xu ly phu hieu phuong tien to the database.
	*
	* @param id the primary key for the new q l v t xu ly phu hieu phuong tien
	* @return the new q l v t xu ly phu hieu phuong tien
	*/
	public static vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTien create(
		int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the q l v t xu ly phu hieu phuong tien with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the q l v t xu ly phu hieu phuong tien
	* @return the q l v t xu ly phu hieu phuong tien that was removed
	* @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuPhuongTienException if a q l v t xu ly phu hieu phuong tien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTien remove(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuPhuongTienException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTien updateImpl(
		vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTien qlvtXuLyPhuHieuPhuongTien)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(qlvtXuLyPhuHieuPhuongTien);
	}

	/**
	* Returns the q l v t xu ly phu hieu phuong tien with the primary key or throws a {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuPhuongTienException} if it could not be found.
	*
	* @param id the primary key of the q l v t xu ly phu hieu phuong tien
	* @return the q l v t xu ly phu hieu phuong tien
	* @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuPhuongTienException if a q l v t xu ly phu hieu phuong tien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTien findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuPhuongTienException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the q l v t xu ly phu hieu phuong tien with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the q l v t xu ly phu hieu phuong tien
	* @return the q l v t xu ly phu hieu phuong tien, or <code>null</code> if a q l v t xu ly phu hieu phuong tien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTien fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the q l v t xu ly phu hieu phuong tiens.
	*
	* @return the q l v t xu ly phu hieu phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTien> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the q l v t xu ly phu hieu phuong tiens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyPhuHieuPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of q l v t xu ly phu hieu phuong tiens
	* @param end the upper bound of the range of q l v t xu ly phu hieu phuong tiens (not inclusive)
	* @return the range of q l v t xu ly phu hieu phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTien> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the q l v t xu ly phu hieu phuong tiens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyPhuHieuPhuongTienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of q l v t xu ly phu hieu phuong tiens
	* @param end the upper bound of the range of q l v t xu ly phu hieu phuong tiens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of q l v t xu ly phu hieu phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieuPhuongTien> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the q l v t xu ly phu hieu phuong tiens from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of q l v t xu ly phu hieu phuong tiens.
	*
	* @return the number of q l v t xu ly phu hieu phuong tiens
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static QLVTXuLyPhuHieuPhuongTienPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (QLVTXuLyPhuHieuPhuongTienPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.capbienhieuphuhieu.service.ClpSerializer.getServletContextName(),
					QLVTXuLyPhuHieuPhuongTienPersistence.class.getName());

			ReferenceRegistry.registerReference(QLVTXuLyPhuHieuPhuongTienUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(QLVTXuLyPhuHieuPhuongTienPersistence persistence) {
	}

	private static QLVTXuLyPhuHieuPhuongTienPersistence _persistence;
}