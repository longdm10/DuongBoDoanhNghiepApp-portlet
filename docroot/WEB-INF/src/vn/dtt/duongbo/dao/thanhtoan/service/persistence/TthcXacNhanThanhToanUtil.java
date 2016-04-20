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

package vn.dtt.duongbo.dao.thanhtoan.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan;

import java.util.List;

/**
 * The persistence utility for the tthc xac nhan thanh toan service. This utility wraps {@link TthcXacNhanThanhToanPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcXacNhanThanhToanPersistence
 * @see TthcXacNhanThanhToanPersistenceImpl
 * @generated
 */
public class TthcXacNhanThanhToanUtil {
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
	public static void clearCache(TthcXacNhanThanhToan tthcXacNhanThanhToan) {
		getPersistence().clearCache(tthcXacNhanThanhToan);
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
	public static List<TthcXacNhanThanhToan> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TthcXacNhanThanhToan> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TthcXacNhanThanhToan> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static TthcXacNhanThanhToan update(
		TthcXacNhanThanhToan tthcXacNhanThanhToan) throws SystemException {
		return getPersistence().update(tthcXacNhanThanhToan);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static TthcXacNhanThanhToan update(
		TthcXacNhanThanhToan tthcXacNhanThanhToan, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(tthcXacNhanThanhToan, serviceContext);
	}

	/**
	* Returns all the tthc xac nhan thanh toans where toChucQuanLy = &#63;.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @return the matching tthc xac nhan thanh toans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan> findByToChucQuanLy(
		long toChucQuanLy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByToChucQuanLy(toChucQuanLy);
	}

	/**
	* Returns a range of all the tthc xac nhan thanh toans where toChucQuanLy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcXacNhanThanhToanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param start the lower bound of the range of tthc xac nhan thanh toans
	* @param end the upper bound of the range of tthc xac nhan thanh toans (not inclusive)
	* @return the range of matching tthc xac nhan thanh toans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan> findByToChucQuanLy(
		long toChucQuanLy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByToChucQuanLy(toChucQuanLy, start, end);
	}

	/**
	* Returns an ordered range of all the tthc xac nhan thanh toans where toChucQuanLy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcXacNhanThanhToanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param start the lower bound of the range of tthc xac nhan thanh toans
	* @param end the upper bound of the range of tthc xac nhan thanh toans (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tthc xac nhan thanh toans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan> findByToChucQuanLy(
		long toChucQuanLy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByToChucQuanLy(toChucQuanLy, start, end,
			orderByComparator);
	}

	/**
	* Returns the first tthc xac nhan thanh toan in the ordered set where toChucQuanLy = &#63;.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc xac nhan thanh toan
	* @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException if a matching tthc xac nhan thanh toan could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan findByToChucQuanLy_First(
		long toChucQuanLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException {
		return getPersistence()
				   .findByToChucQuanLy_First(toChucQuanLy, orderByComparator);
	}

	/**
	* Returns the first tthc xac nhan thanh toan in the ordered set where toChucQuanLy = &#63;.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc xac nhan thanh toan, or <code>null</code> if a matching tthc xac nhan thanh toan could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan fetchByToChucQuanLy_First(
		long toChucQuanLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByToChucQuanLy_First(toChucQuanLy, orderByComparator);
	}

	/**
	* Returns the last tthc xac nhan thanh toan in the ordered set where toChucQuanLy = &#63;.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc xac nhan thanh toan
	* @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException if a matching tthc xac nhan thanh toan could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan findByToChucQuanLy_Last(
		long toChucQuanLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException {
		return getPersistence()
				   .findByToChucQuanLy_Last(toChucQuanLy, orderByComparator);
	}

	/**
	* Returns the last tthc xac nhan thanh toan in the ordered set where toChucQuanLy = &#63;.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc xac nhan thanh toan, or <code>null</code> if a matching tthc xac nhan thanh toan could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan fetchByToChucQuanLy_Last(
		long toChucQuanLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByToChucQuanLy_Last(toChucQuanLy, orderByComparator);
	}

	/**
	* Returns the tthc xac nhan thanh toans before and after the current tthc xac nhan thanh toan in the ordered set where toChucQuanLy = &#63;.
	*
	* @param id the primary key of the current tthc xac nhan thanh toan
	* @param toChucQuanLy the to chuc quan ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tthc xac nhan thanh toan
	* @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException if a tthc xac nhan thanh toan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan[] findByToChucQuanLy_PrevAndNext(
		long id, long toChucQuanLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException {
		return getPersistence()
				   .findByToChucQuanLy_PrevAndNext(id, toChucQuanLy,
			orderByComparator);
	}

	/**
	* Removes all the tthc xac nhan thanh toans where toChucQuanLy = &#63; from the database.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByToChucQuanLy(long toChucQuanLy)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByToChucQuanLy(toChucQuanLy);
	}

	/**
	* Returns the number of tthc xac nhan thanh toans where toChucQuanLy = &#63;.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @return the number of matching tthc xac nhan thanh toans
	* @throws SystemException if a system exception occurred
	*/
	public static int countByToChucQuanLy(long toChucQuanLy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByToChucQuanLy(toChucQuanLy);
	}

	/**
	* Returns the tthc xac nhan thanh toan where maTuSinh = &#63; or throws a {@link vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException} if it could not be found.
	*
	* @param maTuSinh the ma tu sinh
	* @return the matching tthc xac nhan thanh toan
	* @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException if a matching tthc xac nhan thanh toan could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan findByMaTuSinh(
		java.lang.String maTuSinh)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException {
		return getPersistence().findByMaTuSinh(maTuSinh);
	}

	/**
	* Returns the tthc xac nhan thanh toan where maTuSinh = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param maTuSinh the ma tu sinh
	* @return the matching tthc xac nhan thanh toan, or <code>null</code> if a matching tthc xac nhan thanh toan could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan fetchByMaTuSinh(
		java.lang.String maTuSinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByMaTuSinh(maTuSinh);
	}

	/**
	* Returns the tthc xac nhan thanh toan where maTuSinh = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param maTuSinh the ma tu sinh
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching tthc xac nhan thanh toan, or <code>null</code> if a matching tthc xac nhan thanh toan could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan fetchByMaTuSinh(
		java.lang.String maTuSinh, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByMaTuSinh(maTuSinh, retrieveFromCache);
	}

	/**
	* Removes the tthc xac nhan thanh toan where maTuSinh = &#63; from the database.
	*
	* @param maTuSinh the ma tu sinh
	* @return the tthc xac nhan thanh toan that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan removeByMaTuSinh(
		java.lang.String maTuSinh)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException {
		return getPersistence().removeByMaTuSinh(maTuSinh);
	}

	/**
	* Returns the number of tthc xac nhan thanh toans where maTuSinh = &#63;.
	*
	* @param maTuSinh the ma tu sinh
	* @return the number of matching tthc xac nhan thanh toans
	* @throws SystemException if a system exception occurred
	*/
	public static int countByMaTuSinh(java.lang.String maTuSinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByMaTuSinh(maTuSinh);
	}

	/**
	* Caches the tthc xac nhan thanh toan in the entity cache if it is enabled.
	*
	* @param tthcXacNhanThanhToan the tthc xac nhan thanh toan
	*/
	public static void cacheResult(
		vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan tthcXacNhanThanhToan) {
		getPersistence().cacheResult(tthcXacNhanThanhToan);
	}

	/**
	* Caches the tthc xac nhan thanh toans in the entity cache if it is enabled.
	*
	* @param tthcXacNhanThanhToans the tthc xac nhan thanh toans
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan> tthcXacNhanThanhToans) {
		getPersistence().cacheResult(tthcXacNhanThanhToans);
	}

	/**
	* Creates a new tthc xac nhan thanh toan with the primary key. Does not add the tthc xac nhan thanh toan to the database.
	*
	* @param id the primary key for the new tthc xac nhan thanh toan
	* @return the new tthc xac nhan thanh toan
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the tthc xac nhan thanh toan with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tthc xac nhan thanh toan
	* @return the tthc xac nhan thanh toan that was removed
	* @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException if a tthc xac nhan thanh toan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan updateImpl(
		vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan tthcXacNhanThanhToan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tthcXacNhanThanhToan);
	}

	/**
	* Returns the tthc xac nhan thanh toan with the primary key or throws a {@link vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException} if it could not be found.
	*
	* @param id the primary key of the tthc xac nhan thanh toan
	* @return the tthc xac nhan thanh toan
	* @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException if a tthc xac nhan thanh toan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the tthc xac nhan thanh toan with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the tthc xac nhan thanh toan
	* @return the tthc xac nhan thanh toan, or <code>null</code> if a tthc xac nhan thanh toan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the tthc xac nhan thanh toans.
	*
	* @return the tthc xac nhan thanh toans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the tthc xac nhan thanh toans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcXacNhanThanhToanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc xac nhan thanh toans
	* @param end the upper bound of the range of tthc xac nhan thanh toans (not inclusive)
	* @return the range of tthc xac nhan thanh toans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the tthc xac nhan thanh toans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcXacNhanThanhToanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc xac nhan thanh toans
	* @param end the upper bound of the range of tthc xac nhan thanh toans (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tthc xac nhan thanh toans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToan> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the tthc xac nhan thanh toans from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of tthc xac nhan thanh toans.
	*
	* @return the number of tthc xac nhan thanh toans
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TthcXacNhanThanhToanPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TthcXacNhanThanhToanPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.thanhtoan.service.ClpSerializer.getServletContextName(),
					TthcXacNhanThanhToanPersistence.class.getName());

			ReferenceRegistry.registerReference(TthcXacNhanThanhToanUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(TthcXacNhanThanhToanPersistence persistence) {
	}

	private static TthcXacNhanThanhToanPersistence _persistence;
}