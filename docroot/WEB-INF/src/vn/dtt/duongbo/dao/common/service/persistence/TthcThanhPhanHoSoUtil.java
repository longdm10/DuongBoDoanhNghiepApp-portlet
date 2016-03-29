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

import vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo;

import java.util.List;

/**
 * The persistence utility for the tthc thanh phan ho so service. This utility wraps {@link TthcThanhPhanHoSoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcThanhPhanHoSoPersistence
 * @see TthcThanhPhanHoSoPersistenceImpl
 * @generated
 */
public class TthcThanhPhanHoSoUtil {
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
	public static void clearCache(TthcThanhPhanHoSo tthcThanhPhanHoSo) {
		getPersistence().clearCache(tthcThanhPhanHoSo);
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
	public static List<TthcThanhPhanHoSo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TthcThanhPhanHoSo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TthcThanhPhanHoSo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static TthcThanhPhanHoSo update(TthcThanhPhanHoSo tthcThanhPhanHoSo)
		throws SystemException {
		return getPersistence().update(tthcThanhPhanHoSo);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static TthcThanhPhanHoSo update(
		TthcThanhPhanHoSo tthcThanhPhanHoSo, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(tthcThanhPhanHoSo, serviceContext);
	}

	/**
	* Returns all the tthc thanh phan ho sos where thuTucHanhChinhId = &#63;.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @return the matching tthc thanh phan ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo> findByThuTucHanhChinhId(
		long thuTucHanhChinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByThuTucHanhChinhId(thuTucHanhChinhId);
	}

	/**
	* Returns a range of all the tthc thanh phan ho sos where thuTucHanhChinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcThanhPhanHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param start the lower bound of the range of tthc thanh phan ho sos
	* @param end the upper bound of the range of tthc thanh phan ho sos (not inclusive)
	* @return the range of matching tthc thanh phan ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo> findByThuTucHanhChinhId(
		long thuTucHanhChinhId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByThuTucHanhChinhId(thuTucHanhChinhId, start, end);
	}

	/**
	* Returns an ordered range of all the tthc thanh phan ho sos where thuTucHanhChinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcThanhPhanHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param start the lower bound of the range of tthc thanh phan ho sos
	* @param end the upper bound of the range of tthc thanh phan ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tthc thanh phan ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo> findByThuTucHanhChinhId(
		long thuTucHanhChinhId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByThuTucHanhChinhId(thuTucHanhChinhId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first tthc thanh phan ho so in the ordered set where thuTucHanhChinhId = &#63;.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc thanh phan ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoException if a matching tthc thanh phan ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo findByThuTucHanhChinhId_First(
		long thuTucHanhChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoException {
		return getPersistence()
				   .findByThuTucHanhChinhId_First(thuTucHanhChinhId,
			orderByComparator);
	}

	/**
	* Returns the first tthc thanh phan ho so in the ordered set where thuTucHanhChinhId = &#63;.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc thanh phan ho so, or <code>null</code> if a matching tthc thanh phan ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo fetchByThuTucHanhChinhId_First(
		long thuTucHanhChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByThuTucHanhChinhId_First(thuTucHanhChinhId,
			orderByComparator);
	}

	/**
	* Returns the last tthc thanh phan ho so in the ordered set where thuTucHanhChinhId = &#63;.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc thanh phan ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoException if a matching tthc thanh phan ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo findByThuTucHanhChinhId_Last(
		long thuTucHanhChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoException {
		return getPersistence()
				   .findByThuTucHanhChinhId_Last(thuTucHanhChinhId,
			orderByComparator);
	}

	/**
	* Returns the last tthc thanh phan ho so in the ordered set where thuTucHanhChinhId = &#63;.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc thanh phan ho so, or <code>null</code> if a matching tthc thanh phan ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo fetchByThuTucHanhChinhId_Last(
		long thuTucHanhChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByThuTucHanhChinhId_Last(thuTucHanhChinhId,
			orderByComparator);
	}

	/**
	* Returns the tthc thanh phan ho sos before and after the current tthc thanh phan ho so in the ordered set where thuTucHanhChinhId = &#63;.
	*
	* @param id the primary key of the current tthc thanh phan ho so
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tthc thanh phan ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoException if a tthc thanh phan ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo[] findByThuTucHanhChinhId_PrevAndNext(
		long id, long thuTucHanhChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoException {
		return getPersistence()
				   .findByThuTucHanhChinhId_PrevAndNext(id, thuTucHanhChinhId,
			orderByComparator);
	}

	/**
	* Removes all the tthc thanh phan ho sos where thuTucHanhChinhId = &#63; from the database.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByThuTucHanhChinhId(long thuTucHanhChinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByThuTucHanhChinhId(thuTucHanhChinhId);
	}

	/**
	* Returns the number of tthc thanh phan ho sos where thuTucHanhChinhId = &#63;.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @return the number of matching tthc thanh phan ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByThuTucHanhChinhId(long thuTucHanhChinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByThuTucHanhChinhId(thuTucHanhChinhId);
	}

	/**
	* Returns the tthc thanh phan ho so where thuTucHanhChinhId = &#63; and maThanhPhan = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoException} if it could not be found.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param maThanhPhan the ma thanh phan
	* @return the matching tthc thanh phan ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoException if a matching tthc thanh phan ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo findByThuTucHanhChinhIdAndMaThanhPhan(
		long thuTucHanhChinhId, java.lang.String maThanhPhan)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoException {
		return getPersistence()
				   .findByThuTucHanhChinhIdAndMaThanhPhan(thuTucHanhChinhId,
			maThanhPhan);
	}

	/**
	* Returns the tthc thanh phan ho so where thuTucHanhChinhId = &#63; and maThanhPhan = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param maThanhPhan the ma thanh phan
	* @return the matching tthc thanh phan ho so, or <code>null</code> if a matching tthc thanh phan ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo fetchByThuTucHanhChinhIdAndMaThanhPhan(
		long thuTucHanhChinhId, java.lang.String maThanhPhan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByThuTucHanhChinhIdAndMaThanhPhan(thuTucHanhChinhId,
			maThanhPhan);
	}

	/**
	* Returns the tthc thanh phan ho so where thuTucHanhChinhId = &#63; and maThanhPhan = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param maThanhPhan the ma thanh phan
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching tthc thanh phan ho so, or <code>null</code> if a matching tthc thanh phan ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo fetchByThuTucHanhChinhIdAndMaThanhPhan(
		long thuTucHanhChinhId, java.lang.String maThanhPhan,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByThuTucHanhChinhIdAndMaThanhPhan(thuTucHanhChinhId,
			maThanhPhan, retrieveFromCache);
	}

	/**
	* Removes the tthc thanh phan ho so where thuTucHanhChinhId = &#63; and maThanhPhan = &#63; from the database.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param maThanhPhan the ma thanh phan
	* @return the tthc thanh phan ho so that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo removeByThuTucHanhChinhIdAndMaThanhPhan(
		long thuTucHanhChinhId, java.lang.String maThanhPhan)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoException {
		return getPersistence()
				   .removeByThuTucHanhChinhIdAndMaThanhPhan(thuTucHanhChinhId,
			maThanhPhan);
	}

	/**
	* Returns the number of tthc thanh phan ho sos where thuTucHanhChinhId = &#63; and maThanhPhan = &#63;.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param maThanhPhan the ma thanh phan
	* @return the number of matching tthc thanh phan ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByThuTucHanhChinhIdAndMaThanhPhan(
		long thuTucHanhChinhId, java.lang.String maThanhPhan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByThuTucHanhChinhIdAndMaThanhPhan(thuTucHanhChinhId,
			maThanhPhan);
	}

	/**
	* Returns the tthc thanh phan ho so where thuTucHanhChinhId = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoException} if it could not be found.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @return the matching tthc thanh phan ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoException if a matching tthc thanh phan ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo findByThuTucHanhChinhIdMauDonOnline(
		long thuTucHanhChinhId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoException {
		return getPersistence()
				   .findByThuTucHanhChinhIdMauDonOnline(thuTucHanhChinhId);
	}

	/**
	* Returns the tthc thanh phan ho so where thuTucHanhChinhId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @return the matching tthc thanh phan ho so, or <code>null</code> if a matching tthc thanh phan ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo fetchByThuTucHanhChinhIdMauDonOnline(
		long thuTucHanhChinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByThuTucHanhChinhIdMauDonOnline(thuTucHanhChinhId);
	}

	/**
	* Returns the tthc thanh phan ho so where thuTucHanhChinhId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching tthc thanh phan ho so, or <code>null</code> if a matching tthc thanh phan ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo fetchByThuTucHanhChinhIdMauDonOnline(
		long thuTucHanhChinhId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByThuTucHanhChinhIdMauDonOnline(thuTucHanhChinhId,
			retrieveFromCache);
	}

	/**
	* Removes the tthc thanh phan ho so where thuTucHanhChinhId = &#63; from the database.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @return the tthc thanh phan ho so that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo removeByThuTucHanhChinhIdMauDonOnline(
		long thuTucHanhChinhId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoException {
		return getPersistence()
				   .removeByThuTucHanhChinhIdMauDonOnline(thuTucHanhChinhId);
	}

	/**
	* Returns the number of tthc thanh phan ho sos where thuTucHanhChinhId = &#63;.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @return the number of matching tthc thanh phan ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByThuTucHanhChinhIdMauDonOnline(
		long thuTucHanhChinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByThuTucHanhChinhIdMauDonOnline(thuTucHanhChinhId);
	}

	/**
	* Returns the tthc thanh phan ho so where thuTucHanhChinhId = &#63; and maThanhPhan = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoException} if it could not be found.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param maThanhPhan the ma thanh phan
	* @return the matching tthc thanh phan ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoException if a matching tthc thanh phan ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo findByF_thuTucHanhChinhId_maThanhPhan(
		long thuTucHanhChinhId, java.lang.String maThanhPhan)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoException {
		return getPersistence()
				   .findByF_thuTucHanhChinhId_maThanhPhan(thuTucHanhChinhId,
			maThanhPhan);
	}

	/**
	* Returns the tthc thanh phan ho so where thuTucHanhChinhId = &#63; and maThanhPhan = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param maThanhPhan the ma thanh phan
	* @return the matching tthc thanh phan ho so, or <code>null</code> if a matching tthc thanh phan ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo fetchByF_thuTucHanhChinhId_maThanhPhan(
		long thuTucHanhChinhId, java.lang.String maThanhPhan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByF_thuTucHanhChinhId_maThanhPhan(thuTucHanhChinhId,
			maThanhPhan);
	}

	/**
	* Returns the tthc thanh phan ho so where thuTucHanhChinhId = &#63; and maThanhPhan = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param maThanhPhan the ma thanh phan
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching tthc thanh phan ho so, or <code>null</code> if a matching tthc thanh phan ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo fetchByF_thuTucHanhChinhId_maThanhPhan(
		long thuTucHanhChinhId, java.lang.String maThanhPhan,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByF_thuTucHanhChinhId_maThanhPhan(thuTucHanhChinhId,
			maThanhPhan, retrieveFromCache);
	}

	/**
	* Removes the tthc thanh phan ho so where thuTucHanhChinhId = &#63; and maThanhPhan = &#63; from the database.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param maThanhPhan the ma thanh phan
	* @return the tthc thanh phan ho so that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo removeByF_thuTucHanhChinhId_maThanhPhan(
		long thuTucHanhChinhId, java.lang.String maThanhPhan)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoException {
		return getPersistence()
				   .removeByF_thuTucHanhChinhId_maThanhPhan(thuTucHanhChinhId,
			maThanhPhan);
	}

	/**
	* Returns the number of tthc thanh phan ho sos where thuTucHanhChinhId = &#63; and maThanhPhan = &#63;.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param maThanhPhan the ma thanh phan
	* @return the number of matching tthc thanh phan ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByF_thuTucHanhChinhId_maThanhPhan(
		long thuTucHanhChinhId, java.lang.String maThanhPhan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByF_thuTucHanhChinhId_maThanhPhan(thuTucHanhChinhId,
			maThanhPhan);
	}

	/**
	* Caches the tthc thanh phan ho so in the entity cache if it is enabled.
	*
	* @param tthcThanhPhanHoSo the tthc thanh phan ho so
	*/
	public static void cacheResult(
		vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo tthcThanhPhanHoSo) {
		getPersistence().cacheResult(tthcThanhPhanHoSo);
	}

	/**
	* Caches the tthc thanh phan ho sos in the entity cache if it is enabled.
	*
	* @param tthcThanhPhanHoSos the tthc thanh phan ho sos
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo> tthcThanhPhanHoSos) {
		getPersistence().cacheResult(tthcThanhPhanHoSos);
	}

	/**
	* Creates a new tthc thanh phan ho so with the primary key. Does not add the tthc thanh phan ho so to the database.
	*
	* @param id the primary key for the new tthc thanh phan ho so
	* @return the new tthc thanh phan ho so
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the tthc thanh phan ho so with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tthc thanh phan ho so
	* @return the tthc thanh phan ho so that was removed
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoException if a tthc thanh phan ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo updateImpl(
		vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo tthcThanhPhanHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tthcThanhPhanHoSo);
	}

	/**
	* Returns the tthc thanh phan ho so with the primary key or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoException} if it could not be found.
	*
	* @param id the primary key of the tthc thanh phan ho so
	* @return the tthc thanh phan ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoException if a tthc thanh phan ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcThanhPhanHoSoException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the tthc thanh phan ho so with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the tthc thanh phan ho so
	* @return the tthc thanh phan ho so, or <code>null</code> if a tthc thanh phan ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the tthc thanh phan ho sos.
	*
	* @return the tthc thanh phan ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the tthc thanh phan ho sos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcThanhPhanHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc thanh phan ho sos
	* @param end the upper bound of the range of tthc thanh phan ho sos (not inclusive)
	* @return the range of tthc thanh phan ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the tthc thanh phan ho sos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcThanhPhanHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc thanh phan ho sos
	* @param end the upper bound of the range of tthc thanh phan ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tthc thanh phan ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcThanhPhanHoSo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the tthc thanh phan ho sos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of tthc thanh phan ho sos.
	*
	* @return the number of tthc thanh phan ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TthcThanhPhanHoSoPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TthcThanhPhanHoSoPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.common.service.ClpSerializer.getServletContextName(),
					TthcThanhPhanHoSoPersistence.class.getName());

			ReferenceRegistry.registerReference(TthcThanhPhanHoSoUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(TthcThanhPhanHoSoPersistence persistence) {
	}

	private static TthcThanhPhanHoSoPersistence _persistence;
}