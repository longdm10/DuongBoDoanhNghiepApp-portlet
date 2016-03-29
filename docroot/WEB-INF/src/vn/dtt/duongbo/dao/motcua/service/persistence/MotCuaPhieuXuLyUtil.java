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

package vn.dtt.duongbo.dao.motcua.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy;

import java.util.List;

/**
 * The persistence utility for the mot cua phieu xu ly service. This utility wraps {@link MotCuaPhieuXuLyPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see MotCuaPhieuXuLyPersistence
 * @see MotCuaPhieuXuLyPersistenceImpl
 * @generated
 */
public class MotCuaPhieuXuLyUtil {
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
	public static void clearCache(MotCuaPhieuXuLy motCuaPhieuXuLy) {
		getPersistence().clearCache(motCuaPhieuXuLy);
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
	public static List<MotCuaPhieuXuLy> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MotCuaPhieuXuLy> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MotCuaPhieuXuLy> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static MotCuaPhieuXuLy update(MotCuaPhieuXuLy motCuaPhieuXuLy)
		throws SystemException {
		return getPersistence().update(motCuaPhieuXuLy);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static MotCuaPhieuXuLy update(MotCuaPhieuXuLy motCuaPhieuXuLy,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(motCuaPhieuXuLy, serviceContext);
	}

	/**
	* Returns the mot cua phieu xu ly where hoSoThuTucId = &#63; and quyTrinhThuTucId = &#63; or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException} if it could not be found.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @return the matching mot cua phieu xu ly
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException if a matching mot cua phieu xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy findByHoSoThuTucIdAndQuyTrinhThuTucId(
		long hoSoThuTucId, long quyTrinhThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException {
		return getPersistence()
				   .findByHoSoThuTucIdAndQuyTrinhThuTucId(hoSoThuTucId,
			quyTrinhThuTucId);
	}

	/**
	* Returns the mot cua phieu xu ly where hoSoThuTucId = &#63; and quyTrinhThuTucId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @return the matching mot cua phieu xu ly, or <code>null</code> if a matching mot cua phieu xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy fetchByHoSoThuTucIdAndQuyTrinhThuTucId(
		long hoSoThuTucId, long quyTrinhThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByHoSoThuTucIdAndQuyTrinhThuTucId(hoSoThuTucId,
			quyTrinhThuTucId);
	}

	/**
	* Returns the mot cua phieu xu ly where hoSoThuTucId = &#63; and quyTrinhThuTucId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching mot cua phieu xu ly, or <code>null</code> if a matching mot cua phieu xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy fetchByHoSoThuTucIdAndQuyTrinhThuTucId(
		long hoSoThuTucId, long quyTrinhThuTucId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByHoSoThuTucIdAndQuyTrinhThuTucId(hoSoThuTucId,
			quyTrinhThuTucId, retrieveFromCache);
	}

	/**
	* Removes the mot cua phieu xu ly where hoSoThuTucId = &#63; and quyTrinhThuTucId = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @return the mot cua phieu xu ly that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy removeByHoSoThuTucIdAndQuyTrinhThuTucId(
		long hoSoThuTucId, long quyTrinhThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException {
		return getPersistence()
				   .removeByHoSoThuTucIdAndQuyTrinhThuTucId(hoSoThuTucId,
			quyTrinhThuTucId);
	}

	/**
	* Returns the number of mot cua phieu xu lies where hoSoThuTucId = &#63; and quyTrinhThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @return the number of matching mot cua phieu xu lies
	* @throws SystemException if a system exception occurred
	*/
	public static int countByHoSoThuTucIdAndQuyTrinhThuTucId(
		long hoSoThuTucId, long quyTrinhThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByHoSoThuTucIdAndQuyTrinhThuTucId(hoSoThuTucId,
			quyTrinhThuTucId);
	}

	/**
	* Returns all the mot cua phieu xu lies where toChucQuanLy = &#63; and phanNhomHoSoId = &#63;.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param phanNhomHoSoId the phan nhom ho so ID
	* @return the matching mot cua phieu xu lies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findByToChucQuanLyAndPhanNhomHoSo(
		long toChucQuanLy, long phanNhomHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByToChucQuanLyAndPhanNhomHoSo(toChucQuanLy,
			phanNhomHoSoId);
	}

	/**
	* Returns a range of all the mot cua phieu xu lies where toChucQuanLy = &#63; and phanNhomHoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaPhieuXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param phanNhomHoSoId the phan nhom ho so ID
	* @param start the lower bound of the range of mot cua phieu xu lies
	* @param end the upper bound of the range of mot cua phieu xu lies (not inclusive)
	* @return the range of matching mot cua phieu xu lies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findByToChucQuanLyAndPhanNhomHoSo(
		long toChucQuanLy, long phanNhomHoSoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByToChucQuanLyAndPhanNhomHoSo(toChucQuanLy,
			phanNhomHoSoId, start, end);
	}

	/**
	* Returns an ordered range of all the mot cua phieu xu lies where toChucQuanLy = &#63; and phanNhomHoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaPhieuXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param phanNhomHoSoId the phan nhom ho so ID
	* @param start the lower bound of the range of mot cua phieu xu lies
	* @param end the upper bound of the range of mot cua phieu xu lies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mot cua phieu xu lies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findByToChucQuanLyAndPhanNhomHoSo(
		long toChucQuanLy, long phanNhomHoSoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByToChucQuanLyAndPhanNhomHoSo(toChucQuanLy,
			phanNhomHoSoId, start, end, orderByComparator);
	}

	/**
	* Returns the first mot cua phieu xu ly in the ordered set where toChucQuanLy = &#63; and phanNhomHoSoId = &#63;.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param phanNhomHoSoId the phan nhom ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua phieu xu ly
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException if a matching mot cua phieu xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy findByToChucQuanLyAndPhanNhomHoSo_First(
		long toChucQuanLy, long phanNhomHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException {
		return getPersistence()
				   .findByToChucQuanLyAndPhanNhomHoSo_First(toChucQuanLy,
			phanNhomHoSoId, orderByComparator);
	}

	/**
	* Returns the first mot cua phieu xu ly in the ordered set where toChucQuanLy = &#63; and phanNhomHoSoId = &#63;.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param phanNhomHoSoId the phan nhom ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua phieu xu ly, or <code>null</code> if a matching mot cua phieu xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy fetchByToChucQuanLyAndPhanNhomHoSo_First(
		long toChucQuanLy, long phanNhomHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByToChucQuanLyAndPhanNhomHoSo_First(toChucQuanLy,
			phanNhomHoSoId, orderByComparator);
	}

	/**
	* Returns the last mot cua phieu xu ly in the ordered set where toChucQuanLy = &#63; and phanNhomHoSoId = &#63;.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param phanNhomHoSoId the phan nhom ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua phieu xu ly
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException if a matching mot cua phieu xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy findByToChucQuanLyAndPhanNhomHoSo_Last(
		long toChucQuanLy, long phanNhomHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException {
		return getPersistence()
				   .findByToChucQuanLyAndPhanNhomHoSo_Last(toChucQuanLy,
			phanNhomHoSoId, orderByComparator);
	}

	/**
	* Returns the last mot cua phieu xu ly in the ordered set where toChucQuanLy = &#63; and phanNhomHoSoId = &#63;.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param phanNhomHoSoId the phan nhom ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua phieu xu ly, or <code>null</code> if a matching mot cua phieu xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy fetchByToChucQuanLyAndPhanNhomHoSo_Last(
		long toChucQuanLy, long phanNhomHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByToChucQuanLyAndPhanNhomHoSo_Last(toChucQuanLy,
			phanNhomHoSoId, orderByComparator);
	}

	/**
	* Returns the mot cua phieu xu lies before and after the current mot cua phieu xu ly in the ordered set where toChucQuanLy = &#63; and phanNhomHoSoId = &#63;.
	*
	* @param id the primary key of the current mot cua phieu xu ly
	* @param toChucQuanLy the to chuc quan ly
	* @param phanNhomHoSoId the phan nhom ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mot cua phieu xu ly
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException if a mot cua phieu xu ly with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy[] findByToChucQuanLyAndPhanNhomHoSo_PrevAndNext(
		long id, long toChucQuanLy, long phanNhomHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException {
		return getPersistence()
				   .findByToChucQuanLyAndPhanNhomHoSo_PrevAndNext(id,
			toChucQuanLy, phanNhomHoSoId, orderByComparator);
	}

	/**
	* Removes all the mot cua phieu xu lies where toChucQuanLy = &#63; and phanNhomHoSoId = &#63; from the database.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param phanNhomHoSoId the phan nhom ho so ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByToChucQuanLyAndPhanNhomHoSo(long toChucQuanLy,
		long phanNhomHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByToChucQuanLyAndPhanNhomHoSo(toChucQuanLy, phanNhomHoSoId);
	}

	/**
	* Returns the number of mot cua phieu xu lies where toChucQuanLy = &#63; and phanNhomHoSoId = &#63;.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param phanNhomHoSoId the phan nhom ho so ID
	* @return the number of matching mot cua phieu xu lies
	* @throws SystemException if a system exception occurred
	*/
	public static int countByToChucQuanLyAndPhanNhomHoSo(long toChucQuanLy,
		long phanNhomHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByToChucQuanLyAndPhanNhomHoSo(toChucQuanLy,
			phanNhomHoSoId);
	}

	/**
	* Returns all the mot cua phieu xu lies where toChucQuanLy = &#63;.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @return the matching mot cua phieu xu lies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findByToChucQuanLyId(
		long toChucQuanLy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByToChucQuanLyId(toChucQuanLy);
	}

	/**
	* Returns a range of all the mot cua phieu xu lies where toChucQuanLy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaPhieuXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param start the lower bound of the range of mot cua phieu xu lies
	* @param end the upper bound of the range of mot cua phieu xu lies (not inclusive)
	* @return the range of matching mot cua phieu xu lies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findByToChucQuanLyId(
		long toChucQuanLy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByToChucQuanLyId(toChucQuanLy, start, end);
	}

	/**
	* Returns an ordered range of all the mot cua phieu xu lies where toChucQuanLy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaPhieuXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param start the lower bound of the range of mot cua phieu xu lies
	* @param end the upper bound of the range of mot cua phieu xu lies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mot cua phieu xu lies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findByToChucQuanLyId(
		long toChucQuanLy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByToChucQuanLyId(toChucQuanLy, start, end,
			orderByComparator);
	}

	/**
	* Returns the first mot cua phieu xu ly in the ordered set where toChucQuanLy = &#63;.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua phieu xu ly
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException if a matching mot cua phieu xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy findByToChucQuanLyId_First(
		long toChucQuanLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException {
		return getPersistence()
				   .findByToChucQuanLyId_First(toChucQuanLy, orderByComparator);
	}

	/**
	* Returns the first mot cua phieu xu ly in the ordered set where toChucQuanLy = &#63;.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua phieu xu ly, or <code>null</code> if a matching mot cua phieu xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy fetchByToChucQuanLyId_First(
		long toChucQuanLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByToChucQuanLyId_First(toChucQuanLy, orderByComparator);
	}

	/**
	* Returns the last mot cua phieu xu ly in the ordered set where toChucQuanLy = &#63;.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua phieu xu ly
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException if a matching mot cua phieu xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy findByToChucQuanLyId_Last(
		long toChucQuanLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException {
		return getPersistence()
				   .findByToChucQuanLyId_Last(toChucQuanLy, orderByComparator);
	}

	/**
	* Returns the last mot cua phieu xu ly in the ordered set where toChucQuanLy = &#63;.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua phieu xu ly, or <code>null</code> if a matching mot cua phieu xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy fetchByToChucQuanLyId_Last(
		long toChucQuanLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByToChucQuanLyId_Last(toChucQuanLy, orderByComparator);
	}

	/**
	* Returns the mot cua phieu xu lies before and after the current mot cua phieu xu ly in the ordered set where toChucQuanLy = &#63;.
	*
	* @param id the primary key of the current mot cua phieu xu ly
	* @param toChucQuanLy the to chuc quan ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mot cua phieu xu ly
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException if a mot cua phieu xu ly with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy[] findByToChucQuanLyId_PrevAndNext(
		long id, long toChucQuanLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException {
		return getPersistence()
				   .findByToChucQuanLyId_PrevAndNext(id, toChucQuanLy,
			orderByComparator);
	}

	/**
	* Removes all the mot cua phieu xu lies where toChucQuanLy = &#63; from the database.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByToChucQuanLyId(long toChucQuanLy)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByToChucQuanLyId(toChucQuanLy);
	}

	/**
	* Returns the number of mot cua phieu xu lies where toChucQuanLy = &#63;.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @return the number of matching mot cua phieu xu lies
	* @throws SystemException if a system exception occurred
	*/
	public static int countByToChucQuanLyId(long toChucQuanLy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByToChucQuanLyId(toChucQuanLy);
	}

	/**
	* Returns all the mot cua phieu xu lies where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the matching mot cua phieu xu lies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findByHoSoThuTucId(
		long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns a range of all the mot cua phieu xu lies where hoSoThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaPhieuXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param start the lower bound of the range of mot cua phieu xu lies
	* @param end the upper bound of the range of mot cua phieu xu lies (not inclusive)
	* @return the range of matching mot cua phieu xu lies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findByHoSoThuTucId(
		long hoSoThuTucId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByHoSoThuTucId(hoSoThuTucId, start, end);
	}

	/**
	* Returns an ordered range of all the mot cua phieu xu lies where hoSoThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaPhieuXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param start the lower bound of the range of mot cua phieu xu lies
	* @param end the upper bound of the range of mot cua phieu xu lies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mot cua phieu xu lies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findByHoSoThuTucId(
		long hoSoThuTucId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByHoSoThuTucId(hoSoThuTucId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first mot cua phieu xu ly in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua phieu xu ly
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException if a matching mot cua phieu xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy findByHoSoThuTucId_First(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException {
		return getPersistence()
				   .findByHoSoThuTucId_First(hoSoThuTucId, orderByComparator);
	}

	/**
	* Returns the first mot cua phieu xu ly in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua phieu xu ly, or <code>null</code> if a matching mot cua phieu xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy fetchByHoSoThuTucId_First(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByHoSoThuTucId_First(hoSoThuTucId, orderByComparator);
	}

	/**
	* Returns the last mot cua phieu xu ly in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua phieu xu ly
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException if a matching mot cua phieu xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy findByHoSoThuTucId_Last(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException {
		return getPersistence()
				   .findByHoSoThuTucId_Last(hoSoThuTucId, orderByComparator);
	}

	/**
	* Returns the last mot cua phieu xu ly in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua phieu xu ly, or <code>null</code> if a matching mot cua phieu xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy fetchByHoSoThuTucId_Last(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByHoSoThuTucId_Last(hoSoThuTucId, orderByComparator);
	}

	/**
	* Returns the mot cua phieu xu lies before and after the current mot cua phieu xu ly in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param id the primary key of the current mot cua phieu xu ly
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mot cua phieu xu ly
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException if a mot cua phieu xu ly with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy[] findByHoSoThuTucId_PrevAndNext(
		long id, long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException {
		return getPersistence()
				   .findByHoSoThuTucId_PrevAndNext(id, hoSoThuTucId,
			orderByComparator);
	}

	/**
	* Removes all the mot cua phieu xu lies where hoSoThuTucId = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByHoSoThuTucId(long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns the number of mot cua phieu xu lies where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the number of matching mot cua phieu xu lies
	* @throws SystemException if a system exception occurred
	*/
	public static int countByHoSoThuTucId(long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Caches the mot cua phieu xu ly in the entity cache if it is enabled.
	*
	* @param motCuaPhieuXuLy the mot cua phieu xu ly
	*/
	public static void cacheResult(
		vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy motCuaPhieuXuLy) {
		getPersistence().cacheResult(motCuaPhieuXuLy);
	}

	/**
	* Caches the mot cua phieu xu lies in the entity cache if it is enabled.
	*
	* @param motCuaPhieuXuLies the mot cua phieu xu lies
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> motCuaPhieuXuLies) {
		getPersistence().cacheResult(motCuaPhieuXuLies);
	}

	/**
	* Creates a new mot cua phieu xu ly with the primary key. Does not add the mot cua phieu xu ly to the database.
	*
	* @param id the primary key for the new mot cua phieu xu ly
	* @return the new mot cua phieu xu ly
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the mot cua phieu xu ly with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the mot cua phieu xu ly
	* @return the mot cua phieu xu ly that was removed
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException if a mot cua phieu xu ly with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy updateImpl(
		vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy motCuaPhieuXuLy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(motCuaPhieuXuLy);
	}

	/**
	* Returns the mot cua phieu xu ly with the primary key or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException} if it could not be found.
	*
	* @param id the primary key of the mot cua phieu xu ly
	* @return the mot cua phieu xu ly
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException if a mot cua phieu xu ly with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhieuXuLyException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the mot cua phieu xu ly with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the mot cua phieu xu ly
	* @return the mot cua phieu xu ly, or <code>null</code> if a mot cua phieu xu ly with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the mot cua phieu xu lies.
	*
	* @return the mot cua phieu xu lies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the mot cua phieu xu lies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaPhieuXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua phieu xu lies
	* @param end the upper bound of the range of mot cua phieu xu lies (not inclusive)
	* @return the range of mot cua phieu xu lies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the mot cua phieu xu lies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaPhieuXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua phieu xu lies
	* @param end the upper bound of the range of mot cua phieu xu lies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of mot cua phieu xu lies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the mot cua phieu xu lies from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of mot cua phieu xu lies.
	*
	* @return the number of mot cua phieu xu lies
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static MotCuaPhieuXuLyPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (MotCuaPhieuXuLyPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.motcua.service.ClpSerializer.getServletContextName(),
					MotCuaPhieuXuLyPersistence.class.getName());

			ReferenceRegistry.registerReference(MotCuaPhieuXuLyUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(MotCuaPhieuXuLyPersistence persistence) {
	}

	private static MotCuaPhieuXuLyPersistence _persistence;
}