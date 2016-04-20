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

import vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo;

import java.util.List;

/**
 * The persistence utility for the tthc noidung ho so service. This utility wraps {@link TthcNoidungHoSoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcNoidungHoSoPersistence
 * @see TthcNoidungHoSoPersistenceImpl
 * @generated
 */
public class TthcNoidungHoSoUtil {
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
	public static void clearCache(TthcNoidungHoSo tthcNoidungHoSo) {
		getPersistence().clearCache(tthcNoidungHoSo);
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
	public static List<TthcNoidungHoSo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TthcNoidungHoSo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TthcNoidungHoSo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static TthcNoidungHoSo update(TthcNoidungHoSo tthcNoidungHoSo)
		throws SystemException {
		return getPersistence().update(tthcNoidungHoSo);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static TthcNoidungHoSo update(TthcNoidungHoSo tthcNoidungHoSo,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(tthcNoidungHoSo, serviceContext);
	}

	/**
	* Returns the tthc noidung ho so where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException} if it could not be found.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @return the matching tthc noidung ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo findByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException {
		return getPersistence()
				   .findByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId,
			bieuMauHoSoId, thanhPhanHoSoId);
	}

	/**
	* Returns the tthc noidung ho so where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @return the matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId,
			bieuMauHoSoId, thanhPhanHoSoId);
	}

	/**
	* Returns the tthc noidung ho so where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId,
			bieuMauHoSoId, thanhPhanHoSoId, retrieveFromCache);
	}

	/**
	* Removes the tthc noidung ho so where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @return the tthc noidung ho so that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo removeByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException {
		return getPersistence()
				   .removeByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId,
			bieuMauHoSoId, thanhPhanHoSoId);
	}

	/**
	* Returns the number of tthc noidung ho sos where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @return the number of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByBieuMauHoSoIdAndHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId,
			bieuMauHoSoId, thanhPhanHoSoId);
	}

	/**
	* Returns the tthc noidung ho so where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; and trangThai = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException} if it could not be found.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param trangThai the trang thai
	* @return the matching tthc noidung ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo findByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId,
		long trangThai)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException {
		return getPersistence()
				   .findByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai(hoSoThuTucId,
			bieuMauHoSoId, thanhPhanHoSoId, trangThai);
	}

	/**
	* Returns the tthc noidung ho so where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; and trangThai = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param trangThai the trang thai
	* @return the matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId,
		long trangThai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai(hoSoThuTucId,
			bieuMauHoSoId, thanhPhanHoSoId, trangThai);
	}

	/**
	* Returns the tthc noidung ho so where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; and trangThai = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param trangThai the trang thai
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId,
		long trangThai, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai(hoSoThuTucId,
			bieuMauHoSoId, thanhPhanHoSoId, trangThai, retrieveFromCache);
	}

	/**
	* Removes the tthc noidung ho so where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; and trangThai = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param trangThai the trang thai
	* @return the tthc noidung ho so that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo removeByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId,
		long trangThai)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException {
		return getPersistence()
				   .removeByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai(hoSoThuTucId,
			bieuMauHoSoId, thanhPhanHoSoId, trangThai);
	}

	/**
	* Returns the number of tthc noidung ho sos where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and thanhPhanHoSoId = &#63; and trangThai = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param trangThai the trang thai
	* @return the number of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai(
		long hoSoThuTucId, long bieuMauHoSoId, long thanhPhanHoSoId,
		long trangThai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByHoSoThuTucIdAndBieuMauHoSoIdAndThanhPhanHoSoIdAndTrangThai(hoSoThuTucId,
			bieuMauHoSoId, thanhPhanHoSoId, trangThai);
	}

	/**
	* Returns all the tthc noidung ho sos where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @return the matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo> findByHoSoThuTucIdAndThanhPhanHoSoId(
		long hoSoThuTucId, long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId,
			thanhPhanHoSoId);
	}

	/**
	* Returns a range of all the tthc noidung ho sos where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param start the lower bound of the range of tthc noidung ho sos
	* @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	* @return the range of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo> findByHoSoThuTucIdAndThanhPhanHoSoId(
		long hoSoThuTucId, long thanhPhanHoSoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId,
			thanhPhanHoSoId, start, end);
	}

	/**
	* Returns an ordered range of all the tthc noidung ho sos where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param start the lower bound of the range of tthc noidung ho sos
	* @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo> findByHoSoThuTucIdAndThanhPhanHoSoId(
		long hoSoThuTucId, long thanhPhanHoSoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId,
			thanhPhanHoSoId, start, end, orderByComparator);
	}

	/**
	* Returns the first tthc noidung ho so in the ordered set where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc noidung ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo findByHoSoThuTucIdAndThanhPhanHoSoId_First(
		long hoSoThuTucId, long thanhPhanHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException {
		return getPersistence()
				   .findByHoSoThuTucIdAndThanhPhanHoSoId_First(hoSoThuTucId,
			thanhPhanHoSoId, orderByComparator);
	}

	/**
	* Returns the first tthc noidung ho so in the ordered set where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByHoSoThuTucIdAndThanhPhanHoSoId_First(
		long hoSoThuTucId, long thanhPhanHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByHoSoThuTucIdAndThanhPhanHoSoId_First(hoSoThuTucId,
			thanhPhanHoSoId, orderByComparator);
	}

	/**
	* Returns the last tthc noidung ho so in the ordered set where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc noidung ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo findByHoSoThuTucIdAndThanhPhanHoSoId_Last(
		long hoSoThuTucId, long thanhPhanHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException {
		return getPersistence()
				   .findByHoSoThuTucIdAndThanhPhanHoSoId_Last(hoSoThuTucId,
			thanhPhanHoSoId, orderByComparator);
	}

	/**
	* Returns the last tthc noidung ho so in the ordered set where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByHoSoThuTucIdAndThanhPhanHoSoId_Last(
		long hoSoThuTucId, long thanhPhanHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByHoSoThuTucIdAndThanhPhanHoSoId_Last(hoSoThuTucId,
			thanhPhanHoSoId, orderByComparator);
	}

	/**
	* Returns the tthc noidung ho sos before and after the current tthc noidung ho so in the ordered set where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	*
	* @param id the primary key of the current tthc noidung ho so
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tthc noidung ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a tthc noidung ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo[] findByHoSoThuTucIdAndThanhPhanHoSoId_PrevAndNext(
		long id, long hoSoThuTucId, long thanhPhanHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException {
		return getPersistence()
				   .findByHoSoThuTucIdAndThanhPhanHoSoId_PrevAndNext(id,
			hoSoThuTucId, thanhPhanHoSoId, orderByComparator);
	}

	/**
	* Removes all the tthc noidung ho sos where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByHoSoThuTucIdAndThanhPhanHoSoId(
		long hoSoThuTucId, long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId,
			thanhPhanHoSoId);
	}

	/**
	* Returns the number of tthc noidung ho sos where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @return the number of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByHoSoThuTucIdAndThanhPhanHoSoId(long hoSoThuTucId,
		long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByHoSoThuTucIdAndThanhPhanHoSoId(hoSoThuTucId,
			thanhPhanHoSoId);
	}

	/**
	* Returns all the tthc noidung ho sos where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo> findByHoSoThuTucId(
		long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns a range of all the tthc noidung ho sos where hoSoThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param start the lower bound of the range of tthc noidung ho sos
	* @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	* @return the range of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo> findByHoSoThuTucId(
		long hoSoThuTucId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByHoSoThuTucId(hoSoThuTucId, start, end);
	}

	/**
	* Returns an ordered range of all the tthc noidung ho sos where hoSoThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param start the lower bound of the range of tthc noidung ho sos
	* @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo> findByHoSoThuTucId(
		long hoSoThuTucId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByHoSoThuTucId(hoSoThuTucId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first tthc noidung ho so in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc noidung ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo findByHoSoThuTucId_First(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException {
		return getPersistence()
				   .findByHoSoThuTucId_First(hoSoThuTucId, orderByComparator);
	}

	/**
	* Returns the first tthc noidung ho so in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByHoSoThuTucId_First(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByHoSoThuTucId_First(hoSoThuTucId, orderByComparator);
	}

	/**
	* Returns the last tthc noidung ho so in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc noidung ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo findByHoSoThuTucId_Last(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException {
		return getPersistence()
				   .findByHoSoThuTucId_Last(hoSoThuTucId, orderByComparator);
	}

	/**
	* Returns the last tthc noidung ho so in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByHoSoThuTucId_Last(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByHoSoThuTucId_Last(hoSoThuTucId, orderByComparator);
	}

	/**
	* Returns the tthc noidung ho sos before and after the current tthc noidung ho so in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param id the primary key of the current tthc noidung ho so
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tthc noidung ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a tthc noidung ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo[] findByHoSoThuTucId_PrevAndNext(
		long id, long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException {
		return getPersistence()
				   .findByHoSoThuTucId_PrevAndNext(id, hoSoThuTucId,
			orderByComparator);
	}

	/**
	* Removes all the tthc noidung ho sos where hoSoThuTucId = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByHoSoThuTucId(long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns the number of tthc noidung ho sos where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the number of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByHoSoThuTucId(long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns the tthc noidung ho so where hoSoThuTucId = &#63; and taiLieuDinhKem = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException} if it could not be found.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param taiLieuDinhKem the tai lieu dinh kem
	* @return the matching tthc noidung ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo findByHoSoThuTucId_TaiLieuDinhKem(
		long hoSoThuTucId, long taiLieuDinhKem)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException {
		return getPersistence()
				   .findByHoSoThuTucId_TaiLieuDinhKem(hoSoThuTucId,
			taiLieuDinhKem);
	}

	/**
	* Returns the tthc noidung ho so where hoSoThuTucId = &#63; and taiLieuDinhKem = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param taiLieuDinhKem the tai lieu dinh kem
	* @return the matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByHoSoThuTucId_TaiLieuDinhKem(
		long hoSoThuTucId, long taiLieuDinhKem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByHoSoThuTucId_TaiLieuDinhKem(hoSoThuTucId,
			taiLieuDinhKem);
	}

	/**
	* Returns the tthc noidung ho so where hoSoThuTucId = &#63; and taiLieuDinhKem = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param taiLieuDinhKem the tai lieu dinh kem
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByHoSoThuTucId_TaiLieuDinhKem(
		long hoSoThuTucId, long taiLieuDinhKem, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByHoSoThuTucId_TaiLieuDinhKem(hoSoThuTucId,
			taiLieuDinhKem, retrieveFromCache);
	}

	/**
	* Removes the tthc noidung ho so where hoSoThuTucId = &#63; and taiLieuDinhKem = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param taiLieuDinhKem the tai lieu dinh kem
	* @return the tthc noidung ho so that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo removeByHoSoThuTucId_TaiLieuDinhKem(
		long hoSoThuTucId, long taiLieuDinhKem)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException {
		return getPersistence()
				   .removeByHoSoThuTucId_TaiLieuDinhKem(hoSoThuTucId,
			taiLieuDinhKem);
	}

	/**
	* Returns the number of tthc noidung ho sos where hoSoThuTucId = &#63; and taiLieuDinhKem = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param taiLieuDinhKem the tai lieu dinh kem
	* @return the number of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByHoSoThuTucId_TaiLieuDinhKem(long hoSoThuTucId,
		long taiLieuDinhKem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByHoSoThuTucId_TaiLieuDinhKem(hoSoThuTucId,
			taiLieuDinhKem);
	}

	/**
	* Returns the tthc noidung ho so where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException} if it could not be found.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @return the matching tthc noidung ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo findByHoSoThuTucIdAndBieuMauHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException {
		return getPersistence()
				   .findByHoSoThuTucIdAndBieuMauHoSoId(hoSoThuTucId,
			bieuMauHoSoId);
	}

	/**
	* Returns the tthc noidung ho so where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @return the matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByHoSoThuTucIdAndBieuMauHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByHoSoThuTucIdAndBieuMauHoSoId(hoSoThuTucId,
			bieuMauHoSoId);
	}

	/**
	* Returns the tthc noidung ho so where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByHoSoThuTucIdAndBieuMauHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByHoSoThuTucIdAndBieuMauHoSoId(hoSoThuTucId,
			bieuMauHoSoId, retrieveFromCache);
	}

	/**
	* Removes the tthc noidung ho so where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @return the tthc noidung ho so that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo removeByHoSoThuTucIdAndBieuMauHoSoId(
		long hoSoThuTucId, long bieuMauHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException {
		return getPersistence()
				   .removeByHoSoThuTucIdAndBieuMauHoSoId(hoSoThuTucId,
			bieuMauHoSoId);
	}

	/**
	* Returns the number of tthc noidung ho sos where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @return the number of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByHoSoThuTucIdAndBieuMauHoSoId(long hoSoThuTucId,
		long bieuMauHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByHoSoThuTucIdAndBieuMauHoSoId(hoSoThuTucId,
			bieuMauHoSoId);
	}

	/**
	* Returns the tthc noidung ho so where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException} if it could not be found.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @return the matching tthc noidung ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo findByHoSoThuTucIdThanhPhanHoSoId(
		long hoSoThuTucId, long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException {
		return getPersistence()
				   .findByHoSoThuTucIdThanhPhanHoSoId(hoSoThuTucId,
			thanhPhanHoSoId);
	}

	/**
	* Returns the tthc noidung ho so where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @return the matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByHoSoThuTucIdThanhPhanHoSoId(
		long hoSoThuTucId, long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByHoSoThuTucIdThanhPhanHoSoId(hoSoThuTucId,
			thanhPhanHoSoId);
	}

	/**
	* Returns the tthc noidung ho so where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByHoSoThuTucIdThanhPhanHoSoId(
		long hoSoThuTucId, long thanhPhanHoSoId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByHoSoThuTucIdThanhPhanHoSoId(hoSoThuTucId,
			thanhPhanHoSoId, retrieveFromCache);
	}

	/**
	* Removes the tthc noidung ho so where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @return the tthc noidung ho so that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo removeByHoSoThuTucIdThanhPhanHoSoId(
		long hoSoThuTucId, long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException {
		return getPersistence()
				   .removeByHoSoThuTucIdThanhPhanHoSoId(hoSoThuTucId,
			thanhPhanHoSoId);
	}

	/**
	* Returns the number of tthc noidung ho sos where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @return the number of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByHoSoThuTucIdThanhPhanHoSoId(long hoSoThuTucId,
		long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByHoSoThuTucIdThanhPhanHoSoId(hoSoThuTucId,
			thanhPhanHoSoId);
	}

	/**
	* Returns all the tthc noidung ho sos where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param maTuSinh the ma tu sinh
	* @return the matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo> findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(
		long hoSoThuTucId, long bieuMauHoSoId, java.lang.String maTuSinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(hoSoThuTucId,
			bieuMauHoSoId, maTuSinh);
	}

	/**
	* Returns a range of all the tthc noidung ho sos where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param maTuSinh the ma tu sinh
	* @param start the lower bound of the range of tthc noidung ho sos
	* @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	* @return the range of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo> findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(
		long hoSoThuTucId, long bieuMauHoSoId, java.lang.String maTuSinh,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(hoSoThuTucId,
			bieuMauHoSoId, maTuSinh, start, end);
	}

	/**
	* Returns an ordered range of all the tthc noidung ho sos where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param maTuSinh the ma tu sinh
	* @param start the lower bound of the range of tthc noidung ho sos
	* @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo> findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(
		long hoSoThuTucId, long bieuMauHoSoId, java.lang.String maTuSinh,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(hoSoThuTucId,
			bieuMauHoSoId, maTuSinh, start, end, orderByComparator);
	}

	/**
	* Returns the first tthc noidung ho so in the ordered set where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param maTuSinh the ma tu sinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc noidung ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_First(
		long hoSoThuTucId, long bieuMauHoSoId, java.lang.String maTuSinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException {
		return getPersistence()
				   .findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_First(hoSoThuTucId,
			bieuMauHoSoId, maTuSinh, orderByComparator);
	}

	/**
	* Returns the first tthc noidung ho so in the ordered set where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param maTuSinh the ma tu sinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_First(
		long hoSoThuTucId, long bieuMauHoSoId, java.lang.String maTuSinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_First(hoSoThuTucId,
			bieuMauHoSoId, maTuSinh, orderByComparator);
	}

	/**
	* Returns the last tthc noidung ho so in the ordered set where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param maTuSinh the ma tu sinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc noidung ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_Last(
		long hoSoThuTucId, long bieuMauHoSoId, java.lang.String maTuSinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException {
		return getPersistence()
				   .findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_Last(hoSoThuTucId,
			bieuMauHoSoId, maTuSinh, orderByComparator);
	}

	/**
	* Returns the last tthc noidung ho so in the ordered set where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param maTuSinh the ma tu sinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_Last(
		long hoSoThuTucId, long bieuMauHoSoId, java.lang.String maTuSinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_Last(hoSoThuTucId,
			bieuMauHoSoId, maTuSinh, orderByComparator);
	}

	/**
	* Returns the tthc noidung ho sos before and after the current tthc noidung ho so in the ordered set where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	*
	* @param id the primary key of the current tthc noidung ho so
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param maTuSinh the ma tu sinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tthc noidung ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a tthc noidung ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo[] findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_PrevAndNext(
		long id, long hoSoThuTucId, long bieuMauHoSoId,
		java.lang.String maTuSinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException {
		return getPersistence()
				   .findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_PrevAndNext(id,
			hoSoThuTucId, bieuMauHoSoId, maTuSinh, orderByComparator);
	}

	/**
	* Removes all the tthc noidung ho sos where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param maTuSinh the ma tu sinh
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(
		long hoSoThuTucId, long bieuMauHoSoId, java.lang.String maTuSinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(hoSoThuTucId,
			bieuMauHoSoId, maTuSinh);
	}

	/**
	* Returns the number of tthc noidung ho sos where hoSoThuTucId = &#63; and bieuMauHoSoId = &#63; and maTuSinh = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param bieuMauHoSoId the bieu mau ho so ID
	* @param maTuSinh the ma tu sinh
	* @return the number of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(
		long hoSoThuTucId, long bieuMauHoSoId, java.lang.String maTuSinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(hoSoThuTucId,
			bieuMauHoSoId, maTuSinh);
	}

	/**
	* Returns the tthc noidung ho so where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException} if it could not be found.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @return the matching tthc noidung ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo findByHoSoThuTucDonOnline(
		long hoSoThuTucId, long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException {
		return getPersistence()
				   .findByHoSoThuTucDonOnline(hoSoThuTucId, thanhPhanHoSoId);
	}

	/**
	* Returns the tthc noidung ho so where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @return the matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByHoSoThuTucDonOnline(
		long hoSoThuTucId, long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByHoSoThuTucDonOnline(hoSoThuTucId, thanhPhanHoSoId);
	}

	/**
	* Returns the tthc noidung ho so where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByHoSoThuTucDonOnline(
		long hoSoThuTucId, long thanhPhanHoSoId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByHoSoThuTucDonOnline(hoSoThuTucId, thanhPhanHoSoId,
			retrieveFromCache);
	}

	/**
	* Removes the tthc noidung ho so where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @return the tthc noidung ho so that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo removeByHoSoThuTucDonOnline(
		long hoSoThuTucId, long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException {
		return getPersistence()
				   .removeByHoSoThuTucDonOnline(hoSoThuTucId, thanhPhanHoSoId);
	}

	/**
	* Returns the number of tthc noidung ho sos where hoSoThuTucId = &#63; and thanhPhanHoSoId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param thanhPhanHoSoId the thanh phan ho so ID
	* @return the number of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByHoSoThuTucDonOnline(long hoSoThuTucId,
		long thanhPhanHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByHoSoThuTucDonOnline(hoSoThuTucId, thanhPhanHoSoId);
	}

	/**
	* Returns all the tthc noidung ho sos where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo> findByF_HS_DINH_KEM(
		long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByF_HS_DINH_KEM(hoSoThuTucId);
	}

	/**
	* Returns a range of all the tthc noidung ho sos where hoSoThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param start the lower bound of the range of tthc noidung ho sos
	* @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	* @return the range of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo> findByF_HS_DINH_KEM(
		long hoSoThuTucId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByF_HS_DINH_KEM(hoSoThuTucId, start, end);
	}

	/**
	* Returns an ordered range of all the tthc noidung ho sos where hoSoThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param start the lower bound of the range of tthc noidung ho sos
	* @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo> findByF_HS_DINH_KEM(
		long hoSoThuTucId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByF_HS_DINH_KEM(hoSoThuTucId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first tthc noidung ho so in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc noidung ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo findByF_HS_DINH_KEM_First(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException {
		return getPersistence()
				   .findByF_HS_DINH_KEM_First(hoSoThuTucId, orderByComparator);
	}

	/**
	* Returns the first tthc noidung ho so in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByF_HS_DINH_KEM_First(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByF_HS_DINH_KEM_First(hoSoThuTucId, orderByComparator);
	}

	/**
	* Returns the last tthc noidung ho so in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc noidung ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo findByF_HS_DINH_KEM_Last(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException {
		return getPersistence()
				   .findByF_HS_DINH_KEM_Last(hoSoThuTucId, orderByComparator);
	}

	/**
	* Returns the last tthc noidung ho so in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByF_HS_DINH_KEM_Last(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByF_HS_DINH_KEM_Last(hoSoThuTucId, orderByComparator);
	}

	/**
	* Returns the tthc noidung ho sos before and after the current tthc noidung ho so in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param id the primary key of the current tthc noidung ho so
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tthc noidung ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a tthc noidung ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo[] findByF_HS_DINH_KEM_PrevAndNext(
		long id, long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException {
		return getPersistence()
				   .findByF_HS_DINH_KEM_PrevAndNext(id, hoSoThuTucId,
			orderByComparator);
	}

	/**
	* Removes all the tthc noidung ho sos where hoSoThuTucId = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByF_HS_DINH_KEM(long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByF_HS_DINH_KEM(hoSoThuTucId);
	}

	/**
	* Returns the number of tthc noidung ho sos where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the number of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByF_HS_DINH_KEM(long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByF_HS_DINH_KEM(hoSoThuTucId);
	}

	/**
	* Caches the tthc noidung ho so in the entity cache if it is enabled.
	*
	* @param tthcNoidungHoSo the tthc noidung ho so
	*/
	public static void cacheResult(
		vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo tthcNoidungHoSo) {
		getPersistence().cacheResult(tthcNoidungHoSo);
	}

	/**
	* Caches the tthc noidung ho sos in the entity cache if it is enabled.
	*
	* @param tthcNoidungHoSos the tthc noidung ho sos
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo> tthcNoidungHoSos) {
		getPersistence().cacheResult(tthcNoidungHoSos);
	}

	/**
	* Creates a new tthc noidung ho so with the primary key. Does not add the tthc noidung ho so to the database.
	*
	* @param id the primary key for the new tthc noidung ho so
	* @return the new tthc noidung ho so
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the tthc noidung ho so with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tthc noidung ho so
	* @return the tthc noidung ho so that was removed
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a tthc noidung ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo updateImpl(
		vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo tthcNoidungHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tthcNoidungHoSo);
	}

	/**
	* Returns the tthc noidung ho so with the primary key or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException} if it could not be found.
	*
	* @param id the primary key of the tthc noidung ho so
	* @return the tthc noidung ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException if a tthc noidung ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcNoidungHoSoException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the tthc noidung ho so with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the tthc noidung ho so
	* @return the tthc noidung ho so, or <code>null</code> if a tthc noidung ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the tthc noidung ho sos.
	*
	* @return the tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the tthc noidung ho sos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc noidung ho sos
	* @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	* @return the range of tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the tthc noidung ho sos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc noidung ho sos
	* @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the tthc noidung ho sos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of tthc noidung ho sos.
	*
	* @return the number of tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TthcNoidungHoSoPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TthcNoidungHoSoPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.common.service.ClpSerializer.getServletContextName(),
					TthcNoidungHoSoPersistence.class.getName());

			ReferenceRegistry.registerReference(TthcNoidungHoSoUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(TthcNoidungHoSoPersistence persistence) {
	}

	private static TthcNoidungHoSoPersistence _persistence;
}