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

import vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau;

import java.util.List;

/**
 * The persistence utility for the tthc thanh phan ho so bieu mau service. This utility wraps {@link TthcThanhPhanHoSoBieuMauPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcThanhPhanHoSoBieuMauPersistence
 * @see TthcThanhPhanHoSoBieuMauPersistenceImpl
 * @generated
 */
public class TthcThanhPhanHoSoBieuMauUtil {
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
		TthcThanhPhanHoSoBieuMau tthcThanhPhanHoSoBieuMau) {
		getPersistence().clearCache(tthcThanhPhanHoSoBieuMau);
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
	public static List<TthcThanhPhanHoSoBieuMau> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TthcThanhPhanHoSoBieuMau> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TthcThanhPhanHoSoBieuMau> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static TthcThanhPhanHoSoBieuMau update(
		TthcThanhPhanHoSoBieuMau tthcThanhPhanHoSoBieuMau)
		throws SystemException {
		return getPersistence().update(tthcThanhPhanHoSoBieuMau);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static TthcThanhPhanHoSoBieuMau update(
		TthcThanhPhanHoSoBieuMau tthcThanhPhanHoSoBieuMau,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(tthcThanhPhanHoSoBieuMau, serviceContext);
	}

	/**
	* Returns all the tthc thanh phan ho so bieu maus where thanhPhanHoSoId = &#63;.
	*
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @return the matching tthc thanh phan ho so bieu maus
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau> findByThanhPhanHoSoId(
		long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByThanhPhanHoSoId(thanhPhanHoSoId);
	}

	/**
	* Returns a range of all the tthc thanh phan ho so bieu maus where thanhPhanHoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcThanhPhanHoSoBieuMauModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param start the lower bound of the range of tthc thanh phan ho so bieu maus
	* @param end the upper bound of the range of tthc thanh phan ho so bieu maus (not inclusive)
	* @return the range of matching tthc thanh phan ho so bieu maus
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau> findByThanhPhanHoSoId(
		long thanhPhanHoSoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByThanhPhanHoSoId(thanhPhanHoSoId, start, end);
	}

	/**
	* Returns an ordered range of all the tthc thanh phan ho so bieu maus where thanhPhanHoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcThanhPhanHoSoBieuMauModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param start the lower bound of the range of tthc thanh phan ho so bieu maus
	* @param end the upper bound of the range of tthc thanh phan ho so bieu maus (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tthc thanh phan ho so bieu maus
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau> findByThanhPhanHoSoId(
		long thanhPhanHoSoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByThanhPhanHoSoId(thanhPhanHoSoId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first tthc thanh phan ho so bieu mau in the ordered set where thanhPhanHoSoId = &#63;.
	*
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc thanh phan ho so bieu mau
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoBieuMauException if a matching tthc thanh phan ho so bieu mau could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau findByThanhPhanHoSoId_First(
		long thanhPhanHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoBieuMauException {
		return getPersistence()
				   .findByThanhPhanHoSoId_First(thanhPhanHoSoId,
			orderByComparator);
	}

	/**
	* Returns the first tthc thanh phan ho so bieu mau in the ordered set where thanhPhanHoSoId = &#63;.
	*
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc thanh phan ho so bieu mau, or <code>null</code> if a matching tthc thanh phan ho so bieu mau could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau fetchByThanhPhanHoSoId_First(
		long thanhPhanHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByThanhPhanHoSoId_First(thanhPhanHoSoId,
			orderByComparator);
	}

	/**
	* Returns the last tthc thanh phan ho so bieu mau in the ordered set where thanhPhanHoSoId = &#63;.
	*
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc thanh phan ho so bieu mau
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoBieuMauException if a matching tthc thanh phan ho so bieu mau could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau findByThanhPhanHoSoId_Last(
		long thanhPhanHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoBieuMauException {
		return getPersistence()
				   .findByThanhPhanHoSoId_Last(thanhPhanHoSoId,
			orderByComparator);
	}

	/**
	* Returns the last tthc thanh phan ho so bieu mau in the ordered set where thanhPhanHoSoId = &#63;.
	*
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc thanh phan ho so bieu mau, or <code>null</code> if a matching tthc thanh phan ho so bieu mau could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau fetchByThanhPhanHoSoId_Last(
		long thanhPhanHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByThanhPhanHoSoId_Last(thanhPhanHoSoId,
			orderByComparator);
	}

	/**
	* Returns the tthc thanh phan ho so bieu maus before and after the current tthc thanh phan ho so bieu mau in the ordered set where thanhPhanHoSoId = &#63;.
	*
	* @param id the primary key of the current tthc thanh phan ho so bieu mau
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tthc thanh phan ho so bieu mau
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoBieuMauException if a tthc thanh phan ho so bieu mau with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau[] findByThanhPhanHoSoId_PrevAndNext(
		long id, long thanhPhanHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoBieuMauException {
		return getPersistence()
				   .findByThanhPhanHoSoId_PrevAndNext(id, thanhPhanHoSoId,
			orderByComparator);
	}

	/**
	* Removes all the tthc thanh phan ho so bieu maus where thanhPhanHoSoId = &#63; from the database.
	*
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByThanhPhanHoSoId(long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByThanhPhanHoSoId(thanhPhanHoSoId);
	}

	/**
	* Returns the number of tthc thanh phan ho so bieu maus where thanhPhanHoSoId = &#63;.
	*
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @return the number of matching tthc thanh phan ho so bieu maus
	* @throws SystemException if a system exception occurred
	*/
	public static int countByThanhPhanHoSoId(long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByThanhPhanHoSoId(thanhPhanHoSoId);
	}

	/**
	* Returns all the tthc thanh phan ho so bieu maus where bieuMauHoSoId = &#63;.
	*
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @return the matching tthc thanh phan ho so bieu maus
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau> findByBieuMauHoSoId(
		long bieuMauHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByBieuMauHoSoId(bieuMauHoSoId);
	}

	/**
	* Returns a range of all the tthc thanh phan ho so bieu maus where bieuMauHoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcThanhPhanHoSoBieuMauModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param start the lower bound of the range of tthc thanh phan ho so bieu maus
	* @param end the upper bound of the range of tthc thanh phan ho so bieu maus (not inclusive)
	* @return the range of matching tthc thanh phan ho so bieu maus
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau> findByBieuMauHoSoId(
		long bieuMauHoSoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByBieuMauHoSoId(bieuMauHoSoId, start, end);
	}

	/**
	* Returns an ordered range of all the tthc thanh phan ho so bieu maus where bieuMauHoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcThanhPhanHoSoBieuMauModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param start the lower bound of the range of tthc thanh phan ho so bieu maus
	* @param end the upper bound of the range of tthc thanh phan ho so bieu maus (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tthc thanh phan ho so bieu maus
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau> findByBieuMauHoSoId(
		long bieuMauHoSoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByBieuMauHoSoId(bieuMauHoSoId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first tthc thanh phan ho so bieu mau in the ordered set where bieuMauHoSoId = &#63;.
	*
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc thanh phan ho so bieu mau
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoBieuMauException if a matching tthc thanh phan ho so bieu mau could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau findByBieuMauHoSoId_First(
		long bieuMauHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoBieuMauException {
		return getPersistence()
				   .findByBieuMauHoSoId_First(bieuMauHoSoId, orderByComparator);
	}

	/**
	* Returns the first tthc thanh phan ho so bieu mau in the ordered set where bieuMauHoSoId = &#63;.
	*
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc thanh phan ho so bieu mau, or <code>null</code> if a matching tthc thanh phan ho so bieu mau could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau fetchByBieuMauHoSoId_First(
		long bieuMauHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByBieuMauHoSoId_First(bieuMauHoSoId, orderByComparator);
	}

	/**
	* Returns the last tthc thanh phan ho so bieu mau in the ordered set where bieuMauHoSoId = &#63;.
	*
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc thanh phan ho so bieu mau
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoBieuMauException if a matching tthc thanh phan ho so bieu mau could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau findByBieuMauHoSoId_Last(
		long bieuMauHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoBieuMauException {
		return getPersistence()
				   .findByBieuMauHoSoId_Last(bieuMauHoSoId, orderByComparator);
	}

	/**
	* Returns the last tthc thanh phan ho so bieu mau in the ordered set where bieuMauHoSoId = &#63;.
	*
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc thanh phan ho so bieu mau, or <code>null</code> if a matching tthc thanh phan ho so bieu mau could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau fetchByBieuMauHoSoId_Last(
		long bieuMauHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByBieuMauHoSoId_Last(bieuMauHoSoId, orderByComparator);
	}

	/**
	* Returns the tthc thanh phan ho so bieu maus before and after the current tthc thanh phan ho so bieu mau in the ordered set where bieuMauHoSoId = &#63;.
	*
	* @param id the primary key of the current tthc thanh phan ho so bieu mau
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tthc thanh phan ho so bieu mau
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoBieuMauException if a tthc thanh phan ho so bieu mau with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau[] findByBieuMauHoSoId_PrevAndNext(
		long id, long bieuMauHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoBieuMauException {
		return getPersistence()
				   .findByBieuMauHoSoId_PrevAndNext(id, bieuMauHoSoId,
			orderByComparator);
	}

	/**
	* Removes all the tthc thanh phan ho so bieu maus where bieuMauHoSoId = &#63; from the database.
	*
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByBieuMauHoSoId(long bieuMauHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByBieuMauHoSoId(bieuMauHoSoId);
	}

	/**
	* Returns the number of tthc thanh phan ho so bieu maus where bieuMauHoSoId = &#63;.
	*
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @return the number of matching tthc thanh phan ho so bieu maus
	* @throws SystemException if a system exception occurred
	*/
	public static int countByBieuMauHoSoId(long bieuMauHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByBieuMauHoSoId(bieuMauHoSoId);
	}

	/**
	* Caches the tthc thanh phan ho so bieu mau in the entity cache if it is enabled.
	*
	* @param tthcThanhPhanHoSoBieuMau the tthc thanh phan ho so bieu mau
	*/
	public static void cacheResult(
		vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau tthcThanhPhanHoSoBieuMau) {
		getPersistence().cacheResult(tthcThanhPhanHoSoBieuMau);
	}

	/**
	* Caches the tthc thanh phan ho so bieu maus in the entity cache if it is enabled.
	*
	* @param tthcThanhPhanHoSoBieuMaus the tthc thanh phan ho so bieu maus
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau> tthcThanhPhanHoSoBieuMaus) {
		getPersistence().cacheResult(tthcThanhPhanHoSoBieuMaus);
	}

	/**
	* Creates a new tthc thanh phan ho so bieu mau with the primary key. Does not add the tthc thanh phan ho so bieu mau to the database.
	*
	* @param id the primary key for the new tthc thanh phan ho so bieu mau
	* @return the new tthc thanh phan ho so bieu mau
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the tthc thanh phan ho so bieu mau with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tthc thanh phan ho so bieu mau
	* @return the tthc thanh phan ho so bieu mau that was removed
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoBieuMauException if a tthc thanh phan ho so bieu mau with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoBieuMauException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau updateImpl(
		vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau tthcThanhPhanHoSoBieuMau)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tthcThanhPhanHoSoBieuMau);
	}

	/**
	* Returns the tthc thanh phan ho so bieu mau with the primary key or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoBieuMauException} if it could not be found.
	*
	* @param id the primary key of the tthc thanh phan ho so bieu mau
	* @return the tthc thanh phan ho so bieu mau
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoBieuMauException if a tthc thanh phan ho so bieu mau with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoBieuMauException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the tthc thanh phan ho so bieu mau with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the tthc thanh phan ho so bieu mau
	* @return the tthc thanh phan ho so bieu mau, or <code>null</code> if a tthc thanh phan ho so bieu mau with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the tthc thanh phan ho so bieu maus.
	*
	* @return the tthc thanh phan ho so bieu maus
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the tthc thanh phan ho so bieu maus.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcThanhPhanHoSoBieuMauModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc thanh phan ho so bieu maus
	* @param end the upper bound of the range of tthc thanh phan ho so bieu maus (not inclusive)
	* @return the range of tthc thanh phan ho so bieu maus
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the tthc thanh phan ho so bieu maus.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcThanhPhanHoSoBieuMauModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc thanh phan ho so bieu maus
	* @param end the upper bound of the range of tthc thanh phan ho so bieu maus (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tthc thanh phan ho so bieu maus
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSoBieuMau> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the tthc thanh phan ho so bieu maus from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of tthc thanh phan ho so bieu maus.
	*
	* @return the number of tthc thanh phan ho so bieu maus
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TthcThanhPhanHoSoBieuMauPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TthcThanhPhanHoSoBieuMauPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.common.service.ClpSerializer.getServletContextName(),
					TthcThanhPhanHoSoBieuMauPersistence.class.getName());

			ReferenceRegistry.registerReference(TthcThanhPhanHoSoBieuMauUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(TthcThanhPhanHoSoBieuMauPersistence persistence) {
	}

	private static TthcThanhPhanHoSoBieuMauPersistence _persistence;
}