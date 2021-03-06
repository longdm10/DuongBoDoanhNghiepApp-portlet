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

import vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo;

import java.util.List;

/**
 * The persistence utility for the tthc phan nhom ho so service. This utility wraps {@link TthcPhanNhomHoSoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcPhanNhomHoSoPersistence
 * @see TthcPhanNhomHoSoPersistenceImpl
 * @generated
 */
public class TthcPhanNhomHoSoUtil {
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
	public static void clearCache(TthcPhanNhomHoSo tthcPhanNhomHoSo) {
		getPersistence().clearCache(tthcPhanNhomHoSo);
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
	public static List<TthcPhanNhomHoSo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TthcPhanNhomHoSo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TthcPhanNhomHoSo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static TthcPhanNhomHoSo update(TthcPhanNhomHoSo tthcPhanNhomHoSo)
		throws SystemException {
		return getPersistence().update(tthcPhanNhomHoSo);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static TthcPhanNhomHoSo update(TthcPhanNhomHoSo tthcPhanNhomHoSo,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(tthcPhanNhomHoSo, serviceContext);
	}

	/**
	* Returns the tthc phan nhom ho so where maPhanNhom = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcPhanNhomHoSoException} if it could not be found.
	*
	* @param maPhanNhom the ma phan nhom
	* @return the matching tthc phan nhom ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcPhanNhomHoSoException if a matching tthc phan nhom ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo findByMaPhanNhom(
		java.lang.String maPhanNhom)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcPhanNhomHoSoException {
		return getPersistence().findByMaPhanNhom(maPhanNhom);
	}

	/**
	* Returns the tthc phan nhom ho so where maPhanNhom = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param maPhanNhom the ma phan nhom
	* @return the matching tthc phan nhom ho so, or <code>null</code> if a matching tthc phan nhom ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo fetchByMaPhanNhom(
		java.lang.String maPhanNhom)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByMaPhanNhom(maPhanNhom);
	}

	/**
	* Returns the tthc phan nhom ho so where maPhanNhom = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param maPhanNhom the ma phan nhom
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching tthc phan nhom ho so, or <code>null</code> if a matching tthc phan nhom ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo fetchByMaPhanNhom(
		java.lang.String maPhanNhom, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByMaPhanNhom(maPhanNhom, retrieveFromCache);
	}

	/**
	* Removes the tthc phan nhom ho so where maPhanNhom = &#63; from the database.
	*
	* @param maPhanNhom the ma phan nhom
	* @return the tthc phan nhom ho so that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo removeByMaPhanNhom(
		java.lang.String maPhanNhom)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcPhanNhomHoSoException {
		return getPersistence().removeByMaPhanNhom(maPhanNhom);
	}

	/**
	* Returns the number of tthc phan nhom ho sos where maPhanNhom = &#63;.
	*
	* @param maPhanNhom the ma phan nhom
	* @return the number of matching tthc phan nhom ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByMaPhanNhom(java.lang.String maPhanNhom)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByMaPhanNhom(maPhanNhom);
	}

	/**
	* Returns all the tthc phan nhom ho sos where toChucQuanLy = &#63;.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @return the matching tthc phan nhom ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo> findByToChucQuanLyId(
		long toChucQuanLy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByToChucQuanLyId(toChucQuanLy);
	}

	/**
	* Returns a range of all the tthc phan nhom ho sos where toChucQuanLy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcPhanNhomHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param start the lower bound of the range of tthc phan nhom ho sos
	* @param end the upper bound of the range of tthc phan nhom ho sos (not inclusive)
	* @return the range of matching tthc phan nhom ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo> findByToChucQuanLyId(
		long toChucQuanLy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByToChucQuanLyId(toChucQuanLy, start, end);
	}

	/**
	* Returns an ordered range of all the tthc phan nhom ho sos where toChucQuanLy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcPhanNhomHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param start the lower bound of the range of tthc phan nhom ho sos
	* @param end the upper bound of the range of tthc phan nhom ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tthc phan nhom ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo> findByToChucQuanLyId(
		long toChucQuanLy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByToChucQuanLyId(toChucQuanLy, start, end,
			orderByComparator);
	}

	/**
	* Returns the first tthc phan nhom ho so in the ordered set where toChucQuanLy = &#63;.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc phan nhom ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcPhanNhomHoSoException if a matching tthc phan nhom ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo findByToChucQuanLyId_First(
		long toChucQuanLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcPhanNhomHoSoException {
		return getPersistence()
				   .findByToChucQuanLyId_First(toChucQuanLy, orderByComparator);
	}

	/**
	* Returns the first tthc phan nhom ho so in the ordered set where toChucQuanLy = &#63;.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc phan nhom ho so, or <code>null</code> if a matching tthc phan nhom ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo fetchByToChucQuanLyId_First(
		long toChucQuanLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByToChucQuanLyId_First(toChucQuanLy, orderByComparator);
	}

	/**
	* Returns the last tthc phan nhom ho so in the ordered set where toChucQuanLy = &#63;.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc phan nhom ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcPhanNhomHoSoException if a matching tthc phan nhom ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo findByToChucQuanLyId_Last(
		long toChucQuanLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcPhanNhomHoSoException {
		return getPersistence()
				   .findByToChucQuanLyId_Last(toChucQuanLy, orderByComparator);
	}

	/**
	* Returns the last tthc phan nhom ho so in the ordered set where toChucQuanLy = &#63;.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc phan nhom ho so, or <code>null</code> if a matching tthc phan nhom ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo fetchByToChucQuanLyId_Last(
		long toChucQuanLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByToChucQuanLyId_Last(toChucQuanLy, orderByComparator);
	}

	/**
	* Returns the tthc phan nhom ho sos before and after the current tthc phan nhom ho so in the ordered set where toChucQuanLy = &#63;.
	*
	* @param id the primary key of the current tthc phan nhom ho so
	* @param toChucQuanLy the to chuc quan ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tthc phan nhom ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcPhanNhomHoSoException if a tthc phan nhom ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo[] findByToChucQuanLyId_PrevAndNext(
		long id, long toChucQuanLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcPhanNhomHoSoException {
		return getPersistence()
				   .findByToChucQuanLyId_PrevAndNext(id, toChucQuanLy,
			orderByComparator);
	}

	/**
	* Removes all the tthc phan nhom ho sos where toChucQuanLy = &#63; from the database.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByToChucQuanLyId(long toChucQuanLy)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByToChucQuanLyId(toChucQuanLy);
	}

	/**
	* Returns the number of tthc phan nhom ho sos where toChucQuanLy = &#63;.
	*
	* @param toChucQuanLy the to chuc quan ly
	* @return the number of matching tthc phan nhom ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByToChucQuanLyId(long toChucQuanLy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByToChucQuanLyId(toChucQuanLy);
	}

	/**
	* Caches the tthc phan nhom ho so in the entity cache if it is enabled.
	*
	* @param tthcPhanNhomHoSo the tthc phan nhom ho so
	*/
	public static void cacheResult(
		vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo tthcPhanNhomHoSo) {
		getPersistence().cacheResult(tthcPhanNhomHoSo);
	}

	/**
	* Caches the tthc phan nhom ho sos in the entity cache if it is enabled.
	*
	* @param tthcPhanNhomHoSos the tthc phan nhom ho sos
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo> tthcPhanNhomHoSos) {
		getPersistence().cacheResult(tthcPhanNhomHoSos);
	}

	/**
	* Creates a new tthc phan nhom ho so with the primary key. Does not add the tthc phan nhom ho so to the database.
	*
	* @param id the primary key for the new tthc phan nhom ho so
	* @return the new tthc phan nhom ho so
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the tthc phan nhom ho so with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tthc phan nhom ho so
	* @return the tthc phan nhom ho so that was removed
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcPhanNhomHoSoException if a tthc phan nhom ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcPhanNhomHoSoException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo updateImpl(
		vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo tthcPhanNhomHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tthcPhanNhomHoSo);
	}

	/**
	* Returns the tthc phan nhom ho so with the primary key or throws a {@link vn.dtt.duongbo.dao.common.NoSuchTthcPhanNhomHoSoException} if it could not be found.
	*
	* @param id the primary key of the tthc phan nhom ho so
	* @return the tthc phan nhom ho so
	* @throws vn.dtt.duongbo.dao.common.NoSuchTthcPhanNhomHoSoException if a tthc phan nhom ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchTthcPhanNhomHoSoException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the tthc phan nhom ho so with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the tthc phan nhom ho so
	* @return the tthc phan nhom ho so, or <code>null</code> if a tthc phan nhom ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the tthc phan nhom ho sos.
	*
	* @return the tthc phan nhom ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the tthc phan nhom ho sos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcPhanNhomHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc phan nhom ho sos
	* @param end the upper bound of the range of tthc phan nhom ho sos (not inclusive)
	* @return the range of tthc phan nhom ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the tthc phan nhom ho sos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.TthcPhanNhomHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc phan nhom ho sos
	* @param end the upper bound of the range of tthc phan nhom ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tthc phan nhom ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.TthcPhanNhomHoSo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the tthc phan nhom ho sos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of tthc phan nhom ho sos.
	*
	* @return the number of tthc phan nhom ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TthcPhanNhomHoSoPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TthcPhanNhomHoSoPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.common.service.ClpSerializer.getServletContextName(),
					TthcPhanNhomHoSoPersistence.class.getName());

			ReferenceRegistry.registerReference(TthcPhanNhomHoSoUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(TthcPhanNhomHoSoPersistence persistence) {
	}

	private static TthcPhanNhomHoSoPersistence _persistence;
}