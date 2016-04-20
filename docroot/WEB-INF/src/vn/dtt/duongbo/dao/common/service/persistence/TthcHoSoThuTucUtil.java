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

import vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc;

import java.util.List;

/**
 * The persistence utility for the tthc ho so thu tuc service. This utility wraps {@link TthcHoSoThuTucPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcHoSoThuTucPersistence
 * @see TthcHoSoThuTucPersistenceImpl
 * @generated
 */
public class TthcHoSoThuTucUtil {
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
	public static void clearCache(TthcHoSoThuTuc tthcHoSoThuTuc) {
		getPersistence().clearCache(tthcHoSoThuTuc);
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
	public static List<TthcHoSoThuTuc> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TthcHoSoThuTuc> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TthcHoSoThuTuc> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static TthcHoSoThuTuc update(TthcHoSoThuTuc tthcHoSoThuTuc)
		throws SystemException {
		return getPersistence().update(tthcHoSoThuTuc);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static TthcHoSoThuTuc update(TthcHoSoThuTuc tthcHoSoThuTuc,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(tthcHoSoThuTuc, serviceContext);
	}

	/**
	* Returns the tthc ho so thu tuc where maSoHoSo = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException} if it could not be found.
	*
	* @param maSoHoSo the ma so ho so
	* @return the matching tthc ho so thu tuc
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException if a matching tthc ho so thu tuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc findByMaSoHoSo(
		java.lang.String maSoHoSo)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException {
		return getPersistence().findByMaSoHoSo(maSoHoSo);
	}

	/**
	* Returns the tthc ho so thu tuc where maSoHoSo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param maSoHoSo the ma so ho so
	* @return the matching tthc ho so thu tuc, or <code>null</code> if a matching tthc ho so thu tuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc fetchByMaSoHoSo(
		java.lang.String maSoHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByMaSoHoSo(maSoHoSo);
	}

	/**
	* Returns the tthc ho so thu tuc where maSoHoSo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param maSoHoSo the ma so ho so
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching tthc ho so thu tuc, or <code>null</code> if a matching tthc ho so thu tuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc fetchByMaSoHoSo(
		java.lang.String maSoHoSo, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByMaSoHoSo(maSoHoSo, retrieveFromCache);
	}

	/**
	* Removes the tthc ho so thu tuc where maSoHoSo = &#63; from the database.
	*
	* @param maSoHoSo the ma so ho so
	* @return the tthc ho so thu tuc that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc removeByMaSoHoSo(
		java.lang.String maSoHoSo)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException {
		return getPersistence().removeByMaSoHoSo(maSoHoSo);
	}

	/**
	* Returns the number of tthc ho so thu tucs where maSoHoSo = &#63;.
	*
	* @param maSoHoSo the ma so ho so
	* @return the number of matching tthc ho so thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByMaSoHoSo(java.lang.String maSoHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByMaSoHoSo(maSoHoSo);
	}

	/**
	* Returns all the tthc ho so thu tucs where nguoiLamThuTucId = &#63;.
	*
	* @param nguoiLamThuTucId the nguoi lam thu tuc ID
	* @return the matching tthc ho so thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc> findByNguoiLamThuTucId(
		long nguoiLamThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByNguoiLamThuTucId(nguoiLamThuTucId);
	}

	/**
	* Returns a range of all the tthc ho so thu tucs where nguoiLamThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcHoSoThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nguoiLamThuTucId the nguoi lam thu tuc ID
	* @param start the lower bound of the range of tthc ho so thu tucs
	* @param end the upper bound of the range of tthc ho so thu tucs (not inclusive)
	* @return the range of matching tthc ho so thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc> findByNguoiLamThuTucId(
		long nguoiLamThuTucId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNguoiLamThuTucId(nguoiLamThuTucId, start, end);
	}

	/**
	* Returns an ordered range of all the tthc ho so thu tucs where nguoiLamThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcHoSoThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nguoiLamThuTucId the nguoi lam thu tuc ID
	* @param start the lower bound of the range of tthc ho so thu tucs
	* @param end the upper bound of the range of tthc ho so thu tucs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tthc ho so thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc> findByNguoiLamThuTucId(
		long nguoiLamThuTucId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNguoiLamThuTucId(nguoiLamThuTucId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first tthc ho so thu tuc in the ordered set where nguoiLamThuTucId = &#63;.
	*
	* @param nguoiLamThuTucId the nguoi lam thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc ho so thu tuc
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException if a matching tthc ho so thu tuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc findByNguoiLamThuTucId_First(
		long nguoiLamThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException {
		return getPersistence()
				   .findByNguoiLamThuTucId_First(nguoiLamThuTucId,
			orderByComparator);
	}

	/**
	* Returns the first tthc ho so thu tuc in the ordered set where nguoiLamThuTucId = &#63;.
	*
	* @param nguoiLamThuTucId the nguoi lam thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc ho so thu tuc, or <code>null</code> if a matching tthc ho so thu tuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc fetchByNguoiLamThuTucId_First(
		long nguoiLamThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNguoiLamThuTucId_First(nguoiLamThuTucId,
			orderByComparator);
	}

	/**
	* Returns the last tthc ho so thu tuc in the ordered set where nguoiLamThuTucId = &#63;.
	*
	* @param nguoiLamThuTucId the nguoi lam thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc ho so thu tuc
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException if a matching tthc ho so thu tuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc findByNguoiLamThuTucId_Last(
		long nguoiLamThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException {
		return getPersistence()
				   .findByNguoiLamThuTucId_Last(nguoiLamThuTucId,
			orderByComparator);
	}

	/**
	* Returns the last tthc ho so thu tuc in the ordered set where nguoiLamThuTucId = &#63;.
	*
	* @param nguoiLamThuTucId the nguoi lam thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc ho so thu tuc, or <code>null</code> if a matching tthc ho so thu tuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc fetchByNguoiLamThuTucId_Last(
		long nguoiLamThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNguoiLamThuTucId_Last(nguoiLamThuTucId,
			orderByComparator);
	}

	/**
	* Returns the tthc ho so thu tucs before and after the current tthc ho so thu tuc in the ordered set where nguoiLamThuTucId = &#63;.
	*
	* @param id the primary key of the current tthc ho so thu tuc
	* @param nguoiLamThuTucId the nguoi lam thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tthc ho so thu tuc
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException if a tthc ho so thu tuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc[] findByNguoiLamThuTucId_PrevAndNext(
		long id, long nguoiLamThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException {
		return getPersistence()
				   .findByNguoiLamThuTucId_PrevAndNext(id, nguoiLamThuTucId,
			orderByComparator);
	}

	/**
	* Removes all the tthc ho so thu tucs where nguoiLamThuTucId = &#63; from the database.
	*
	* @param nguoiLamThuTucId the nguoi lam thu tuc ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByNguoiLamThuTucId(long nguoiLamThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByNguoiLamThuTucId(nguoiLamThuTucId);
	}

	/**
	* Returns the number of tthc ho so thu tucs where nguoiLamThuTucId = &#63;.
	*
	* @param nguoiLamThuTucId the nguoi lam thu tuc ID
	* @return the number of matching tthc ho so thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByNguoiLamThuTucId(long nguoiLamThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByNguoiLamThuTucId(nguoiLamThuTucId);
	}

	/**
	* Returns all the tthc ho so thu tucs where nguoiLamThuTucId = &#63; and thuTucHanhChinhId = &#63;.
	*
	* @param nguoiLamThuTucId the nguoi lam thu tuc ID
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @return the matching tthc ho so thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc> findByNguoiLamThuTucIdAndThuTucHanhChinhId(
		long nguoiLamThuTucId, long thuTucHanhChinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNguoiLamThuTucIdAndThuTucHanhChinhId(nguoiLamThuTucId,
			thuTucHanhChinhId);
	}

	/**
	* Returns a range of all the tthc ho so thu tucs where nguoiLamThuTucId = &#63; and thuTucHanhChinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcHoSoThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nguoiLamThuTucId the nguoi lam thu tuc ID
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param start the lower bound of the range of tthc ho so thu tucs
	* @param end the upper bound of the range of tthc ho so thu tucs (not inclusive)
	* @return the range of matching tthc ho so thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc> findByNguoiLamThuTucIdAndThuTucHanhChinhId(
		long nguoiLamThuTucId, long thuTucHanhChinhId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNguoiLamThuTucIdAndThuTucHanhChinhId(nguoiLamThuTucId,
			thuTucHanhChinhId, start, end);
	}

	/**
	* Returns an ordered range of all the tthc ho so thu tucs where nguoiLamThuTucId = &#63; and thuTucHanhChinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcHoSoThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nguoiLamThuTucId the nguoi lam thu tuc ID
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param start the lower bound of the range of tthc ho so thu tucs
	* @param end the upper bound of the range of tthc ho so thu tucs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tthc ho so thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc> findByNguoiLamThuTucIdAndThuTucHanhChinhId(
		long nguoiLamThuTucId, long thuTucHanhChinhId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNguoiLamThuTucIdAndThuTucHanhChinhId(nguoiLamThuTucId,
			thuTucHanhChinhId, start, end, orderByComparator);
	}

	/**
	* Returns the first tthc ho so thu tuc in the ordered set where nguoiLamThuTucId = &#63; and thuTucHanhChinhId = &#63;.
	*
	* @param nguoiLamThuTucId the nguoi lam thu tuc ID
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc ho so thu tuc
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException if a matching tthc ho so thu tuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc findByNguoiLamThuTucIdAndThuTucHanhChinhId_First(
		long nguoiLamThuTucId, long thuTucHanhChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException {
		return getPersistence()
				   .findByNguoiLamThuTucIdAndThuTucHanhChinhId_First(nguoiLamThuTucId,
			thuTucHanhChinhId, orderByComparator);
	}

	/**
	* Returns the first tthc ho so thu tuc in the ordered set where nguoiLamThuTucId = &#63; and thuTucHanhChinhId = &#63;.
	*
	* @param nguoiLamThuTucId the nguoi lam thu tuc ID
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc ho so thu tuc, or <code>null</code> if a matching tthc ho so thu tuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc fetchByNguoiLamThuTucIdAndThuTucHanhChinhId_First(
		long nguoiLamThuTucId, long thuTucHanhChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNguoiLamThuTucIdAndThuTucHanhChinhId_First(nguoiLamThuTucId,
			thuTucHanhChinhId, orderByComparator);
	}

	/**
	* Returns the last tthc ho so thu tuc in the ordered set where nguoiLamThuTucId = &#63; and thuTucHanhChinhId = &#63;.
	*
	* @param nguoiLamThuTucId the nguoi lam thu tuc ID
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc ho so thu tuc
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException if a matching tthc ho so thu tuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc findByNguoiLamThuTucIdAndThuTucHanhChinhId_Last(
		long nguoiLamThuTucId, long thuTucHanhChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException {
		return getPersistence()
				   .findByNguoiLamThuTucIdAndThuTucHanhChinhId_Last(nguoiLamThuTucId,
			thuTucHanhChinhId, orderByComparator);
	}

	/**
	* Returns the last tthc ho so thu tuc in the ordered set where nguoiLamThuTucId = &#63; and thuTucHanhChinhId = &#63;.
	*
	* @param nguoiLamThuTucId the nguoi lam thu tuc ID
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc ho so thu tuc, or <code>null</code> if a matching tthc ho so thu tuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc fetchByNguoiLamThuTucIdAndThuTucHanhChinhId_Last(
		long nguoiLamThuTucId, long thuTucHanhChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNguoiLamThuTucIdAndThuTucHanhChinhId_Last(nguoiLamThuTucId,
			thuTucHanhChinhId, orderByComparator);
	}

	/**
	* Returns the tthc ho so thu tucs before and after the current tthc ho so thu tuc in the ordered set where nguoiLamThuTucId = &#63; and thuTucHanhChinhId = &#63;.
	*
	* @param id the primary key of the current tthc ho so thu tuc
	* @param nguoiLamThuTucId the nguoi lam thu tuc ID
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tthc ho so thu tuc
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException if a tthc ho so thu tuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc[] findByNguoiLamThuTucIdAndThuTucHanhChinhId_PrevAndNext(
		long id, long nguoiLamThuTucId, long thuTucHanhChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException {
		return getPersistence()
				   .findByNguoiLamThuTucIdAndThuTucHanhChinhId_PrevAndNext(id,
			nguoiLamThuTucId, thuTucHanhChinhId, orderByComparator);
	}

	/**
	* Removes all the tthc ho so thu tucs where nguoiLamThuTucId = &#63; and thuTucHanhChinhId = &#63; from the database.
	*
	* @param nguoiLamThuTucId the nguoi lam thu tuc ID
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByNguoiLamThuTucIdAndThuTucHanhChinhId(
		long nguoiLamThuTucId, long thuTucHanhChinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByNguoiLamThuTucIdAndThuTucHanhChinhId(nguoiLamThuTucId,
			thuTucHanhChinhId);
	}

	/**
	* Returns the number of tthc ho so thu tucs where nguoiLamThuTucId = &#63; and thuTucHanhChinhId = &#63;.
	*
	* @param nguoiLamThuTucId the nguoi lam thu tuc ID
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @return the number of matching tthc ho so thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByNguoiLamThuTucIdAndThuTucHanhChinhId(
		long nguoiLamThuTucId, long thuTucHanhChinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByNguoiLamThuTucIdAndThuTucHanhChinhId(nguoiLamThuTucId,
			thuTucHanhChinhId);
	}

	/**
	* Returns all the tthc ho so thu tucs where nguoiTao = &#63; and thuTucHanhChinhId = &#63;.
	*
	* @param nguoiTao the nguoi tao
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @return the matching tthc ho so thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc> findByNguoiTaoAndThuTucHanhChinhId(
		long nguoiTao, long thuTucHanhChinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNguoiTaoAndThuTucHanhChinhId(nguoiTao,
			thuTucHanhChinhId);
	}

	/**
	* Returns a range of all the tthc ho so thu tucs where nguoiTao = &#63; and thuTucHanhChinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcHoSoThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nguoiTao the nguoi tao
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param start the lower bound of the range of tthc ho so thu tucs
	* @param end the upper bound of the range of tthc ho so thu tucs (not inclusive)
	* @return the range of matching tthc ho so thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc> findByNguoiTaoAndThuTucHanhChinhId(
		long nguoiTao, long thuTucHanhChinhId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNguoiTaoAndThuTucHanhChinhId(nguoiTao,
			thuTucHanhChinhId, start, end);
	}

	/**
	* Returns an ordered range of all the tthc ho so thu tucs where nguoiTao = &#63; and thuTucHanhChinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcHoSoThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nguoiTao the nguoi tao
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param start the lower bound of the range of tthc ho so thu tucs
	* @param end the upper bound of the range of tthc ho so thu tucs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tthc ho so thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc> findByNguoiTaoAndThuTucHanhChinhId(
		long nguoiTao, long thuTucHanhChinhId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNguoiTaoAndThuTucHanhChinhId(nguoiTao,
			thuTucHanhChinhId, start, end, orderByComparator);
	}

	/**
	* Returns the first tthc ho so thu tuc in the ordered set where nguoiTao = &#63; and thuTucHanhChinhId = &#63;.
	*
	* @param nguoiTao the nguoi tao
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc ho so thu tuc
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException if a matching tthc ho so thu tuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc findByNguoiTaoAndThuTucHanhChinhId_First(
		long nguoiTao, long thuTucHanhChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException {
		return getPersistence()
				   .findByNguoiTaoAndThuTucHanhChinhId_First(nguoiTao,
			thuTucHanhChinhId, orderByComparator);
	}

	/**
	* Returns the first tthc ho so thu tuc in the ordered set where nguoiTao = &#63; and thuTucHanhChinhId = &#63;.
	*
	* @param nguoiTao the nguoi tao
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc ho so thu tuc, or <code>null</code> if a matching tthc ho so thu tuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc fetchByNguoiTaoAndThuTucHanhChinhId_First(
		long nguoiTao, long thuTucHanhChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNguoiTaoAndThuTucHanhChinhId_First(nguoiTao,
			thuTucHanhChinhId, orderByComparator);
	}

	/**
	* Returns the last tthc ho so thu tuc in the ordered set where nguoiTao = &#63; and thuTucHanhChinhId = &#63;.
	*
	* @param nguoiTao the nguoi tao
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc ho so thu tuc
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException if a matching tthc ho so thu tuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc findByNguoiTaoAndThuTucHanhChinhId_Last(
		long nguoiTao, long thuTucHanhChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException {
		return getPersistence()
				   .findByNguoiTaoAndThuTucHanhChinhId_Last(nguoiTao,
			thuTucHanhChinhId, orderByComparator);
	}

	/**
	* Returns the last tthc ho so thu tuc in the ordered set where nguoiTao = &#63; and thuTucHanhChinhId = &#63;.
	*
	* @param nguoiTao the nguoi tao
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc ho so thu tuc, or <code>null</code> if a matching tthc ho so thu tuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc fetchByNguoiTaoAndThuTucHanhChinhId_Last(
		long nguoiTao, long thuTucHanhChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNguoiTaoAndThuTucHanhChinhId_Last(nguoiTao,
			thuTucHanhChinhId, orderByComparator);
	}

	/**
	* Returns the tthc ho so thu tucs before and after the current tthc ho so thu tuc in the ordered set where nguoiTao = &#63; and thuTucHanhChinhId = &#63;.
	*
	* @param id the primary key of the current tthc ho so thu tuc
	* @param nguoiTao the nguoi tao
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tthc ho so thu tuc
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException if a tthc ho so thu tuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc[] findByNguoiTaoAndThuTucHanhChinhId_PrevAndNext(
		long id, long nguoiTao, long thuTucHanhChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException {
		return getPersistence()
				   .findByNguoiTaoAndThuTucHanhChinhId_PrevAndNext(id,
			nguoiTao, thuTucHanhChinhId, orderByComparator);
	}

	/**
	* Removes all the tthc ho so thu tucs where nguoiTao = &#63; and thuTucHanhChinhId = &#63; from the database.
	*
	* @param nguoiTao the nguoi tao
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByNguoiTaoAndThuTucHanhChinhId(long nguoiTao,
		long thuTucHanhChinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByNguoiTaoAndThuTucHanhChinhId(nguoiTao, thuTucHanhChinhId);
	}

	/**
	* Returns the number of tthc ho so thu tucs where nguoiTao = &#63; and thuTucHanhChinhId = &#63;.
	*
	* @param nguoiTao the nguoi tao
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @return the number of matching tthc ho so thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByNguoiTaoAndThuTucHanhChinhId(long nguoiTao,
		long thuTucHanhChinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByNguoiTaoAndThuTucHanhChinhId(nguoiTao,
			thuTucHanhChinhId);
	}

	/**
	* Caches the tthc ho so thu tuc in the entity cache if it is enabled.
	*
	* @param tthcHoSoThuTuc the tthc ho so thu tuc
	*/
	public static void cacheResult(
		vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc tthcHoSoThuTuc) {
		getPersistence().cacheResult(tthcHoSoThuTuc);
	}

	/**
	* Caches the tthc ho so thu tucs in the entity cache if it is enabled.
	*
	* @param tthcHoSoThuTucs the tthc ho so thu tucs
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc> tthcHoSoThuTucs) {
		getPersistence().cacheResult(tthcHoSoThuTucs);
	}

	/**
	* Creates a new tthc ho so thu tuc with the primary key. Does not add the tthc ho so thu tuc to the database.
	*
	* @param id the primary key for the new tthc ho so thu tuc
	* @return the new tthc ho so thu tuc
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the tthc ho so thu tuc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tthc ho so thu tuc
	* @return the tthc ho so thu tuc that was removed
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException if a tthc ho so thu tuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc updateImpl(
		vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc tthcHoSoThuTuc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tthcHoSoThuTuc);
	}

	/**
	* Returns the tthc ho so thu tuc with the primary key or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException} if it could not be found.
	*
	* @param id the primary key of the tthc ho so thu tuc
	* @return the tthc ho so thu tuc
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException if a tthc ho so thu tuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcHoSoThuTucException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the tthc ho so thu tuc with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the tthc ho so thu tuc
	* @return the tthc ho so thu tuc, or <code>null</code> if a tthc ho so thu tuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the tthc ho so thu tucs.
	*
	* @return the tthc ho so thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the tthc ho so thu tucs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcHoSoThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc ho so thu tucs
	* @param end the upper bound of the range of tthc ho so thu tucs (not inclusive)
	* @return the range of tthc ho so thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the tthc ho so thu tucs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcHoSoThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc ho so thu tucs
	* @param end the upper bound of the range of tthc ho so thu tucs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tthc ho so thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcHoSoThuTuc> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the tthc ho so thu tucs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of tthc ho so thu tucs.
	*
	* @return the number of tthc ho so thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TthcHoSoThuTucPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TthcHoSoThuTucPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.common.service.ClpSerializer.getServletContextName(),
					TthcHoSoThuTucPersistence.class.getName());

			ReferenceRegistry.registerReference(TthcHoSoThuTucUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(TthcHoSoThuTucPersistence persistence) {
	}

	private static TthcHoSoThuTucPersistence _persistence;
}