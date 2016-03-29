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

import vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo;

import java.util.List;

/**
 * The persistence utility for the tthc xac nhan thanh toan ho so service. This utility wraps {@link TthcXacNhanThanhToanHoSoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcXacNhanThanhToanHoSoPersistence
 * @see TthcXacNhanThanhToanHoSoPersistenceImpl
 * @generated
 */
public class TthcXacNhanThanhToanHoSoUtil {
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
		TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo) {
		getPersistence().clearCache(tthcXacNhanThanhToanHoSo);
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
	public static List<TthcXacNhanThanhToanHoSo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TthcXacNhanThanhToanHoSo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TthcXacNhanThanhToanHoSo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static TthcXacNhanThanhToanHoSo update(
		TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo)
		throws SystemException {
		return getPersistence().update(tthcXacNhanThanhToanHoSo);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static TthcXacNhanThanhToanHoSo update(
		TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(tthcXacNhanThanhToanHoSo, serviceContext);
	}

	/**
	* Returns all the tthc xac nhan thanh toan ho sos where xacNhanThanhToanId = &#63;.
	*
	* @param xacNhanThanhToanId the xac nhan thanh toan ID
	* @return the matching tthc xac nhan thanh toan ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo> findByXacNhanThanhToanId(
		long xacNhanThanhToanId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByXacNhanThanhToanId(xacNhanThanhToanId);
	}

	/**
	* Returns a range of all the tthc xac nhan thanh toan ho sos where xacNhanThanhToanId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcXacNhanThanhToanHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param xacNhanThanhToanId the xac nhan thanh toan ID
	* @param start the lower bound of the range of tthc xac nhan thanh toan ho sos
	* @param end the upper bound of the range of tthc xac nhan thanh toan ho sos (not inclusive)
	* @return the range of matching tthc xac nhan thanh toan ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo> findByXacNhanThanhToanId(
		long xacNhanThanhToanId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByXacNhanThanhToanId(xacNhanThanhToanId, start, end);
	}

	/**
	* Returns an ordered range of all the tthc xac nhan thanh toan ho sos where xacNhanThanhToanId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcXacNhanThanhToanHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param xacNhanThanhToanId the xac nhan thanh toan ID
	* @param start the lower bound of the range of tthc xac nhan thanh toan ho sos
	* @param end the upper bound of the range of tthc xac nhan thanh toan ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tthc xac nhan thanh toan ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo> findByXacNhanThanhToanId(
		long xacNhanThanhToanId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByXacNhanThanhToanId(xacNhanThanhToanId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first tthc xac nhan thanh toan ho so in the ordered set where xacNhanThanhToanId = &#63;.
	*
	* @param xacNhanThanhToanId the xac nhan thanh toan ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc xac nhan thanh toan ho so
	* @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanHoSoException if a matching tthc xac nhan thanh toan ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo findByXacNhanThanhToanId_First(
		long xacNhanThanhToanId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanHoSoException {
		return getPersistence()
				   .findByXacNhanThanhToanId_First(xacNhanThanhToanId,
			orderByComparator);
	}

	/**
	* Returns the first tthc xac nhan thanh toan ho so in the ordered set where xacNhanThanhToanId = &#63;.
	*
	* @param xacNhanThanhToanId the xac nhan thanh toan ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc xac nhan thanh toan ho so, or <code>null</code> if a matching tthc xac nhan thanh toan ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo fetchByXacNhanThanhToanId_First(
		long xacNhanThanhToanId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByXacNhanThanhToanId_First(xacNhanThanhToanId,
			orderByComparator);
	}

	/**
	* Returns the last tthc xac nhan thanh toan ho so in the ordered set where xacNhanThanhToanId = &#63;.
	*
	* @param xacNhanThanhToanId the xac nhan thanh toan ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc xac nhan thanh toan ho so
	* @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanHoSoException if a matching tthc xac nhan thanh toan ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo findByXacNhanThanhToanId_Last(
		long xacNhanThanhToanId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanHoSoException {
		return getPersistence()
				   .findByXacNhanThanhToanId_Last(xacNhanThanhToanId,
			orderByComparator);
	}

	/**
	* Returns the last tthc xac nhan thanh toan ho so in the ordered set where xacNhanThanhToanId = &#63;.
	*
	* @param xacNhanThanhToanId the xac nhan thanh toan ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc xac nhan thanh toan ho so, or <code>null</code> if a matching tthc xac nhan thanh toan ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo fetchByXacNhanThanhToanId_Last(
		long xacNhanThanhToanId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByXacNhanThanhToanId_Last(xacNhanThanhToanId,
			orderByComparator);
	}

	/**
	* Returns the tthc xac nhan thanh toan ho sos before and after the current tthc xac nhan thanh toan ho so in the ordered set where xacNhanThanhToanId = &#63;.
	*
	* @param id the primary key of the current tthc xac nhan thanh toan ho so
	* @param xacNhanThanhToanId the xac nhan thanh toan ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tthc xac nhan thanh toan ho so
	* @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanHoSoException if a tthc xac nhan thanh toan ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo[] findByXacNhanThanhToanId_PrevAndNext(
		long id, long xacNhanThanhToanId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanHoSoException {
		return getPersistence()
				   .findByXacNhanThanhToanId_PrevAndNext(id,
			xacNhanThanhToanId, orderByComparator);
	}

	/**
	* Removes all the tthc xac nhan thanh toan ho sos where xacNhanThanhToanId = &#63; from the database.
	*
	* @param xacNhanThanhToanId the xac nhan thanh toan ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByXacNhanThanhToanId(long xacNhanThanhToanId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByXacNhanThanhToanId(xacNhanThanhToanId);
	}

	/**
	* Returns the number of tthc xac nhan thanh toan ho sos where xacNhanThanhToanId = &#63;.
	*
	* @param xacNhanThanhToanId the xac nhan thanh toan ID
	* @return the number of matching tthc xac nhan thanh toan ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByXacNhanThanhToanId(long xacNhanThanhToanId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByXacNhanThanhToanId(xacNhanThanhToanId);
	}

	/**
	* Returns the tthc xac nhan thanh toan ho so where hoSoThuTucId = &#63; or throws a {@link vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanHoSoException} if it could not be found.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the matching tthc xac nhan thanh toan ho so
	* @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanHoSoException if a matching tthc xac nhan thanh toan ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo findByHoSoThuTucId(
		long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanHoSoException {
		return getPersistence().findByHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns the tthc xac nhan thanh toan ho so where hoSoThuTucId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the matching tthc xac nhan thanh toan ho so, or <code>null</code> if a matching tthc xac nhan thanh toan ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo fetchByHoSoThuTucId(
		long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns the tthc xac nhan thanh toan ho so where hoSoThuTucId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching tthc xac nhan thanh toan ho so, or <code>null</code> if a matching tthc xac nhan thanh toan ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo fetchByHoSoThuTucId(
		long hoSoThuTucId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByHoSoThuTucId(hoSoThuTucId, retrieveFromCache);
	}

	/**
	* Removes the tthc xac nhan thanh toan ho so where hoSoThuTucId = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the tthc xac nhan thanh toan ho so that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo removeByHoSoThuTucId(
		long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanHoSoException {
		return getPersistence().removeByHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns the number of tthc xac nhan thanh toan ho sos where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the number of matching tthc xac nhan thanh toan ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByHoSoThuTucId(long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns the tthc xac nhan thanh toan ho so where xacNhanThanhToanId = &#63; and hoSoThuTucId = &#63; or throws a {@link vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanHoSoException} if it could not be found.
	*
	* @param xacNhanThanhToanId the xac nhan thanh toan ID
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the matching tthc xac nhan thanh toan ho so
	* @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanHoSoException if a matching tthc xac nhan thanh toan ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo findByXacNhanThanhToanIdHoSoThuTucId(
		long xacNhanThanhToanId, long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanHoSoException {
		return getPersistence()
				   .findByXacNhanThanhToanIdHoSoThuTucId(xacNhanThanhToanId,
			hoSoThuTucId);
	}

	/**
	* Returns the tthc xac nhan thanh toan ho so where xacNhanThanhToanId = &#63; and hoSoThuTucId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param xacNhanThanhToanId the xac nhan thanh toan ID
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the matching tthc xac nhan thanh toan ho so, or <code>null</code> if a matching tthc xac nhan thanh toan ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo fetchByXacNhanThanhToanIdHoSoThuTucId(
		long xacNhanThanhToanId, long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByXacNhanThanhToanIdHoSoThuTucId(xacNhanThanhToanId,
			hoSoThuTucId);
	}

	/**
	* Returns the tthc xac nhan thanh toan ho so where xacNhanThanhToanId = &#63; and hoSoThuTucId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param xacNhanThanhToanId the xac nhan thanh toan ID
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching tthc xac nhan thanh toan ho so, or <code>null</code> if a matching tthc xac nhan thanh toan ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo fetchByXacNhanThanhToanIdHoSoThuTucId(
		long xacNhanThanhToanId, long hoSoThuTucId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByXacNhanThanhToanIdHoSoThuTucId(xacNhanThanhToanId,
			hoSoThuTucId, retrieveFromCache);
	}

	/**
	* Removes the tthc xac nhan thanh toan ho so where xacNhanThanhToanId = &#63; and hoSoThuTucId = &#63; from the database.
	*
	* @param xacNhanThanhToanId the xac nhan thanh toan ID
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the tthc xac nhan thanh toan ho so that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo removeByXacNhanThanhToanIdHoSoThuTucId(
		long xacNhanThanhToanId, long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanHoSoException {
		return getPersistence()
				   .removeByXacNhanThanhToanIdHoSoThuTucId(xacNhanThanhToanId,
			hoSoThuTucId);
	}

	/**
	* Returns the number of tthc xac nhan thanh toan ho sos where xacNhanThanhToanId = &#63; and hoSoThuTucId = &#63;.
	*
	* @param xacNhanThanhToanId the xac nhan thanh toan ID
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the number of matching tthc xac nhan thanh toan ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByXacNhanThanhToanIdHoSoThuTucId(
		long xacNhanThanhToanId, long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByXacNhanThanhToanIdHoSoThuTucId(xacNhanThanhToanId,
			hoSoThuTucId);
	}

	/**
	* Caches the tthc xac nhan thanh toan ho so in the entity cache if it is enabled.
	*
	* @param tthcXacNhanThanhToanHoSo the tthc xac nhan thanh toan ho so
	*/
	public static void cacheResult(
		vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo) {
		getPersistence().cacheResult(tthcXacNhanThanhToanHoSo);
	}

	/**
	* Caches the tthc xac nhan thanh toan ho sos in the entity cache if it is enabled.
	*
	* @param tthcXacNhanThanhToanHoSos the tthc xac nhan thanh toan ho sos
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo> tthcXacNhanThanhToanHoSos) {
		getPersistence().cacheResult(tthcXacNhanThanhToanHoSos);
	}

	/**
	* Creates a new tthc xac nhan thanh toan ho so with the primary key. Does not add the tthc xac nhan thanh toan ho so to the database.
	*
	* @param id the primary key for the new tthc xac nhan thanh toan ho so
	* @return the new tthc xac nhan thanh toan ho so
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the tthc xac nhan thanh toan ho so with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tthc xac nhan thanh toan ho so
	* @return the tthc xac nhan thanh toan ho so that was removed
	* @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanHoSoException if a tthc xac nhan thanh toan ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanHoSoException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo updateImpl(
		vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo tthcXacNhanThanhToanHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tthcXacNhanThanhToanHoSo);
	}

	/**
	* Returns the tthc xac nhan thanh toan ho so with the primary key or throws a {@link vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanHoSoException} if it could not be found.
	*
	* @param id the primary key of the tthc xac nhan thanh toan ho so
	* @return the tthc xac nhan thanh toan ho so
	* @throws vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanHoSoException if a tthc xac nhan thanh toan ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.thanhtoan.NoSuchTthcXacNhanThanhToanHoSoException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the tthc xac nhan thanh toan ho so with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the tthc xac nhan thanh toan ho so
	* @return the tthc xac nhan thanh toan ho so, or <code>null</code> if a tthc xac nhan thanh toan ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the tthc xac nhan thanh toan ho sos.
	*
	* @return the tthc xac nhan thanh toan ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the tthc xac nhan thanh toan ho sos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcXacNhanThanhToanHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc xac nhan thanh toan ho sos
	* @param end the upper bound of the range of tthc xac nhan thanh toan ho sos (not inclusive)
	* @return the range of tthc xac nhan thanh toan ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the tthc xac nhan thanh toan ho sos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.thanhtoan.model.impl.TthcXacNhanThanhToanHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc xac nhan thanh toan ho sos
	* @param end the upper bound of the range of tthc xac nhan thanh toan ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tthc xac nhan thanh toan ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.thanhtoan.model.TthcXacNhanThanhToanHoSo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the tthc xac nhan thanh toan ho sos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of tthc xac nhan thanh toan ho sos.
	*
	* @return the number of tthc xac nhan thanh toan ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TthcXacNhanThanhToanHoSoPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TthcXacNhanThanhToanHoSoPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.thanhtoan.service.ClpSerializer.getServletContextName(),
					TthcXacNhanThanhToanHoSoPersistence.class.getName());

			ReferenceRegistry.registerReference(TthcXacNhanThanhToanHoSoUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(TthcXacNhanThanhToanHoSoPersistence persistence) {
	}

	private static TthcXacNhanThanhToanHoSoPersistence _persistence;
}