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

import vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC;

import java.util.List;

/**
 * The persistence utility for the mot cua quy trinh thu tuc t t h c service. This utility wraps {@link MotCuaQuyTrinhThuTucTTHCPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see MotCuaQuyTrinhThuTucTTHCPersistence
 * @see MotCuaQuyTrinhThuTucTTHCPersistenceImpl
 * @generated
 */
public class MotCuaQuyTrinhThuTucTTHCUtil {
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
		MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC) {
		getPersistence().clearCache(motCuaQuyTrinhThuTucTTHC);
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
	public static List<MotCuaQuyTrinhThuTucTTHC> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MotCuaQuyTrinhThuTucTTHC> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MotCuaQuyTrinhThuTucTTHC> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static MotCuaQuyTrinhThuTucTTHC update(
		MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC)
		throws SystemException {
		return getPersistence().update(motCuaQuyTrinhThuTucTTHC);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static MotCuaQuyTrinhThuTucTTHC update(
		MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(motCuaQuyTrinhThuTucTTHC, serviceContext);
	}

	/**
	* Returns the mot cua quy trinh thu tuc t t h c where quyTrinhThuTucId = &#63; and thuTucHanhChinhID = &#63; or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException} if it could not be found.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param thuTucHanhChinhID the thu tuc hanh chinh i d
	* @return the matching mot cua quy trinh thu tuc t t h c
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException if a matching mot cua quy trinh thu tuc t t h c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC findByThuTucHanhChinhIDAndQuyTrinhThuTucId(
		long quyTrinhThuTucId, long thuTucHanhChinhID)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException {
		return getPersistence()
				   .findByThuTucHanhChinhIDAndQuyTrinhThuTucId(quyTrinhThuTucId,
			thuTucHanhChinhID);
	}

	/**
	* Returns the mot cua quy trinh thu tuc t t h c where quyTrinhThuTucId = &#63; and thuTucHanhChinhID = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param thuTucHanhChinhID the thu tuc hanh chinh i d
	* @return the matching mot cua quy trinh thu tuc t t h c, or <code>null</code> if a matching mot cua quy trinh thu tuc t t h c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC fetchByThuTucHanhChinhIDAndQuyTrinhThuTucId(
		long quyTrinhThuTucId, long thuTucHanhChinhID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByThuTucHanhChinhIDAndQuyTrinhThuTucId(quyTrinhThuTucId,
			thuTucHanhChinhID);
	}

	/**
	* Returns the mot cua quy trinh thu tuc t t h c where quyTrinhThuTucId = &#63; and thuTucHanhChinhID = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param thuTucHanhChinhID the thu tuc hanh chinh i d
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching mot cua quy trinh thu tuc t t h c, or <code>null</code> if a matching mot cua quy trinh thu tuc t t h c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC fetchByThuTucHanhChinhIDAndQuyTrinhThuTucId(
		long quyTrinhThuTucId, long thuTucHanhChinhID, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByThuTucHanhChinhIDAndQuyTrinhThuTucId(quyTrinhThuTucId,
			thuTucHanhChinhID, retrieveFromCache);
	}

	/**
	* Removes the mot cua quy trinh thu tuc t t h c where quyTrinhThuTucId = &#63; and thuTucHanhChinhID = &#63; from the database.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param thuTucHanhChinhID the thu tuc hanh chinh i d
	* @return the mot cua quy trinh thu tuc t t h c that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC removeByThuTucHanhChinhIDAndQuyTrinhThuTucId(
		long quyTrinhThuTucId, long thuTucHanhChinhID)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException {
		return getPersistence()
				   .removeByThuTucHanhChinhIDAndQuyTrinhThuTucId(quyTrinhThuTucId,
			thuTucHanhChinhID);
	}

	/**
	* Returns the number of mot cua quy trinh thu tuc t t h cs where quyTrinhThuTucId = &#63; and thuTucHanhChinhID = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param thuTucHanhChinhID the thu tuc hanh chinh i d
	* @return the number of matching mot cua quy trinh thu tuc t t h cs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByThuTucHanhChinhIDAndQuyTrinhThuTucId(
		long quyTrinhThuTucId, long thuTucHanhChinhID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByThuTucHanhChinhIDAndQuyTrinhThuTucId(quyTrinhThuTucId,
			thuTucHanhChinhID);
	}

	/**
	* Returns the mot cua quy trinh thu tuc t t h c where thuTucHanhChinhID = &#63; and toChucXuLy = &#63; or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException} if it could not be found.
	*
	* @param thuTucHanhChinhID the thu tuc hanh chinh i d
	* @param toChucXuLy the to chuc xu ly
	* @return the matching mot cua quy trinh thu tuc t t h c
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException if a matching mot cua quy trinh thu tuc t t h c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC findByThuTucHanhChinhIDAndToChucXuLy(
		long thuTucHanhChinhID, long toChucXuLy)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException {
		return getPersistence()
				   .findByThuTucHanhChinhIDAndToChucXuLy(thuTucHanhChinhID,
			toChucXuLy);
	}

	/**
	* Returns the mot cua quy trinh thu tuc t t h c where thuTucHanhChinhID = &#63; and toChucXuLy = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param thuTucHanhChinhID the thu tuc hanh chinh i d
	* @param toChucXuLy the to chuc xu ly
	* @return the matching mot cua quy trinh thu tuc t t h c, or <code>null</code> if a matching mot cua quy trinh thu tuc t t h c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC fetchByThuTucHanhChinhIDAndToChucXuLy(
		long thuTucHanhChinhID, long toChucXuLy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByThuTucHanhChinhIDAndToChucXuLy(thuTucHanhChinhID,
			toChucXuLy);
	}

	/**
	* Returns the mot cua quy trinh thu tuc t t h c where thuTucHanhChinhID = &#63; and toChucXuLy = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param thuTucHanhChinhID the thu tuc hanh chinh i d
	* @param toChucXuLy the to chuc xu ly
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching mot cua quy trinh thu tuc t t h c, or <code>null</code> if a matching mot cua quy trinh thu tuc t t h c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC fetchByThuTucHanhChinhIDAndToChucXuLy(
		long thuTucHanhChinhID, long toChucXuLy, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByThuTucHanhChinhIDAndToChucXuLy(thuTucHanhChinhID,
			toChucXuLy, retrieveFromCache);
	}

	/**
	* Removes the mot cua quy trinh thu tuc t t h c where thuTucHanhChinhID = &#63; and toChucXuLy = &#63; from the database.
	*
	* @param thuTucHanhChinhID the thu tuc hanh chinh i d
	* @param toChucXuLy the to chuc xu ly
	* @return the mot cua quy trinh thu tuc t t h c that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC removeByThuTucHanhChinhIDAndToChucXuLy(
		long thuTucHanhChinhID, long toChucXuLy)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException {
		return getPersistence()
				   .removeByThuTucHanhChinhIDAndToChucXuLy(thuTucHanhChinhID,
			toChucXuLy);
	}

	/**
	* Returns the number of mot cua quy trinh thu tuc t t h cs where thuTucHanhChinhID = &#63; and toChucXuLy = &#63;.
	*
	* @param thuTucHanhChinhID the thu tuc hanh chinh i d
	* @param toChucXuLy the to chuc xu ly
	* @return the number of matching mot cua quy trinh thu tuc t t h cs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByThuTucHanhChinhIDAndToChucXuLy(
		long thuTucHanhChinhID, long toChucXuLy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByThuTucHanhChinhIDAndToChucXuLy(thuTucHanhChinhID,
			toChucXuLy);
	}

	/**
	* Returns all the mot cua quy trinh thu tuc t t h cs where thuTucHanhChinhID = &#63;.
	*
	* @param thuTucHanhChinhID the thu tuc hanh chinh i d
	* @return the matching mot cua quy trinh thu tuc t t h cs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC> findByThuTucHanhChinhID(
		long thuTucHanhChinhID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByThuTucHanhChinhID(thuTucHanhChinhID);
	}

	/**
	* Returns a range of all the mot cua quy trinh thu tuc t t h cs where thuTucHanhChinhID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaQuyTrinhThuTucTTHCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param thuTucHanhChinhID the thu tuc hanh chinh i d
	* @param start the lower bound of the range of mot cua quy trinh thu tuc t t h cs
	* @param end the upper bound of the range of mot cua quy trinh thu tuc t t h cs (not inclusive)
	* @return the range of matching mot cua quy trinh thu tuc t t h cs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC> findByThuTucHanhChinhID(
		long thuTucHanhChinhID, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByThuTucHanhChinhID(thuTucHanhChinhID, start, end);
	}

	/**
	* Returns an ordered range of all the mot cua quy trinh thu tuc t t h cs where thuTucHanhChinhID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaQuyTrinhThuTucTTHCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param thuTucHanhChinhID the thu tuc hanh chinh i d
	* @param start the lower bound of the range of mot cua quy trinh thu tuc t t h cs
	* @param end the upper bound of the range of mot cua quy trinh thu tuc t t h cs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mot cua quy trinh thu tuc t t h cs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC> findByThuTucHanhChinhID(
		long thuTucHanhChinhID, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByThuTucHanhChinhID(thuTucHanhChinhID, start, end,
			orderByComparator);
	}

	/**
	* Returns the first mot cua quy trinh thu tuc t t h c in the ordered set where thuTucHanhChinhID = &#63;.
	*
	* @param thuTucHanhChinhID the thu tuc hanh chinh i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua quy trinh thu tuc t t h c
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException if a matching mot cua quy trinh thu tuc t t h c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC findByThuTucHanhChinhID_First(
		long thuTucHanhChinhID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException {
		return getPersistence()
				   .findByThuTucHanhChinhID_First(thuTucHanhChinhID,
			orderByComparator);
	}

	/**
	* Returns the first mot cua quy trinh thu tuc t t h c in the ordered set where thuTucHanhChinhID = &#63;.
	*
	* @param thuTucHanhChinhID the thu tuc hanh chinh i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua quy trinh thu tuc t t h c, or <code>null</code> if a matching mot cua quy trinh thu tuc t t h c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC fetchByThuTucHanhChinhID_First(
		long thuTucHanhChinhID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByThuTucHanhChinhID_First(thuTucHanhChinhID,
			orderByComparator);
	}

	/**
	* Returns the last mot cua quy trinh thu tuc t t h c in the ordered set where thuTucHanhChinhID = &#63;.
	*
	* @param thuTucHanhChinhID the thu tuc hanh chinh i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua quy trinh thu tuc t t h c
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException if a matching mot cua quy trinh thu tuc t t h c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC findByThuTucHanhChinhID_Last(
		long thuTucHanhChinhID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException {
		return getPersistence()
				   .findByThuTucHanhChinhID_Last(thuTucHanhChinhID,
			orderByComparator);
	}

	/**
	* Returns the last mot cua quy trinh thu tuc t t h c in the ordered set where thuTucHanhChinhID = &#63;.
	*
	* @param thuTucHanhChinhID the thu tuc hanh chinh i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua quy trinh thu tuc t t h c, or <code>null</code> if a matching mot cua quy trinh thu tuc t t h c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC fetchByThuTucHanhChinhID_Last(
		long thuTucHanhChinhID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByThuTucHanhChinhID_Last(thuTucHanhChinhID,
			orderByComparator);
	}

	/**
	* Returns the mot cua quy trinh thu tuc t t h cs before and after the current mot cua quy trinh thu tuc t t h c in the ordered set where thuTucHanhChinhID = &#63;.
	*
	* @param id the primary key of the current mot cua quy trinh thu tuc t t h c
	* @param thuTucHanhChinhID the thu tuc hanh chinh i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mot cua quy trinh thu tuc t t h c
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException if a mot cua quy trinh thu tuc t t h c with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC[] findByThuTucHanhChinhID_PrevAndNext(
		long id, long thuTucHanhChinhID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException {
		return getPersistence()
				   .findByThuTucHanhChinhID_PrevAndNext(id, thuTucHanhChinhID,
			orderByComparator);
	}

	/**
	* Removes all the mot cua quy trinh thu tuc t t h cs where thuTucHanhChinhID = &#63; from the database.
	*
	* @param thuTucHanhChinhID the thu tuc hanh chinh i d
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByThuTucHanhChinhID(long thuTucHanhChinhID)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByThuTucHanhChinhID(thuTucHanhChinhID);
	}

	/**
	* Returns the number of mot cua quy trinh thu tuc t t h cs where thuTucHanhChinhID = &#63;.
	*
	* @param thuTucHanhChinhID the thu tuc hanh chinh i d
	* @return the number of matching mot cua quy trinh thu tuc t t h cs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByThuTucHanhChinhID(long thuTucHanhChinhID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByThuTucHanhChinhID(thuTucHanhChinhID);
	}

	/**
	* Returns all the mot cua quy trinh thu tuc t t h cs where quyTrinhThuTucId = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @return the matching mot cua quy trinh thu tuc t t h cs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC> findByquyTrinhThuTucId(
		long quyTrinhThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByquyTrinhThuTucId(quyTrinhThuTucId);
	}

	/**
	* Returns a range of all the mot cua quy trinh thu tuc t t h cs where quyTrinhThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaQuyTrinhThuTucTTHCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param start the lower bound of the range of mot cua quy trinh thu tuc t t h cs
	* @param end the upper bound of the range of mot cua quy trinh thu tuc t t h cs (not inclusive)
	* @return the range of matching mot cua quy trinh thu tuc t t h cs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC> findByquyTrinhThuTucId(
		long quyTrinhThuTucId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByquyTrinhThuTucId(quyTrinhThuTucId, start, end);
	}

	/**
	* Returns an ordered range of all the mot cua quy trinh thu tuc t t h cs where quyTrinhThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaQuyTrinhThuTucTTHCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param start the lower bound of the range of mot cua quy trinh thu tuc t t h cs
	* @param end the upper bound of the range of mot cua quy trinh thu tuc t t h cs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mot cua quy trinh thu tuc t t h cs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC> findByquyTrinhThuTucId(
		long quyTrinhThuTucId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByquyTrinhThuTucId(quyTrinhThuTucId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first mot cua quy trinh thu tuc t t h c in the ordered set where quyTrinhThuTucId = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua quy trinh thu tuc t t h c
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException if a matching mot cua quy trinh thu tuc t t h c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC findByquyTrinhThuTucId_First(
		long quyTrinhThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException {
		return getPersistence()
				   .findByquyTrinhThuTucId_First(quyTrinhThuTucId,
			orderByComparator);
	}

	/**
	* Returns the first mot cua quy trinh thu tuc t t h c in the ordered set where quyTrinhThuTucId = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua quy trinh thu tuc t t h c, or <code>null</code> if a matching mot cua quy trinh thu tuc t t h c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC fetchByquyTrinhThuTucId_First(
		long quyTrinhThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByquyTrinhThuTucId_First(quyTrinhThuTucId,
			orderByComparator);
	}

	/**
	* Returns the last mot cua quy trinh thu tuc t t h c in the ordered set where quyTrinhThuTucId = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua quy trinh thu tuc t t h c
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException if a matching mot cua quy trinh thu tuc t t h c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC findByquyTrinhThuTucId_Last(
		long quyTrinhThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException {
		return getPersistence()
				   .findByquyTrinhThuTucId_Last(quyTrinhThuTucId,
			orderByComparator);
	}

	/**
	* Returns the last mot cua quy trinh thu tuc t t h c in the ordered set where quyTrinhThuTucId = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua quy trinh thu tuc t t h c, or <code>null</code> if a matching mot cua quy trinh thu tuc t t h c could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC fetchByquyTrinhThuTucId_Last(
		long quyTrinhThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByquyTrinhThuTucId_Last(quyTrinhThuTucId,
			orderByComparator);
	}

	/**
	* Returns the mot cua quy trinh thu tuc t t h cs before and after the current mot cua quy trinh thu tuc t t h c in the ordered set where quyTrinhThuTucId = &#63;.
	*
	* @param id the primary key of the current mot cua quy trinh thu tuc t t h c
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mot cua quy trinh thu tuc t t h c
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException if a mot cua quy trinh thu tuc t t h c with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC[] findByquyTrinhThuTucId_PrevAndNext(
		long id, long quyTrinhThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException {
		return getPersistence()
				   .findByquyTrinhThuTucId_PrevAndNext(id, quyTrinhThuTucId,
			orderByComparator);
	}

	/**
	* Removes all the mot cua quy trinh thu tuc t t h cs where quyTrinhThuTucId = &#63; from the database.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByquyTrinhThuTucId(long quyTrinhThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByquyTrinhThuTucId(quyTrinhThuTucId);
	}

	/**
	* Returns the number of mot cua quy trinh thu tuc t t h cs where quyTrinhThuTucId = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @return the number of matching mot cua quy trinh thu tuc t t h cs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByquyTrinhThuTucId(long quyTrinhThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByquyTrinhThuTucId(quyTrinhThuTucId);
	}

	/**
	* Caches the mot cua quy trinh thu tuc t t h c in the entity cache if it is enabled.
	*
	* @param motCuaQuyTrinhThuTucTTHC the mot cua quy trinh thu tuc t t h c
	*/
	public static void cacheResult(
		vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC) {
		getPersistence().cacheResult(motCuaQuyTrinhThuTucTTHC);
	}

	/**
	* Caches the mot cua quy trinh thu tuc t t h cs in the entity cache if it is enabled.
	*
	* @param motCuaQuyTrinhThuTucTTHCs the mot cua quy trinh thu tuc t t h cs
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC> motCuaQuyTrinhThuTucTTHCs) {
		getPersistence().cacheResult(motCuaQuyTrinhThuTucTTHCs);
	}

	/**
	* Creates a new mot cua quy trinh thu tuc t t h c with the primary key. Does not add the mot cua quy trinh thu tuc t t h c to the database.
	*
	* @param id the primary key for the new mot cua quy trinh thu tuc t t h c
	* @return the new mot cua quy trinh thu tuc t t h c
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the mot cua quy trinh thu tuc t t h c with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the mot cua quy trinh thu tuc t t h c
	* @return the mot cua quy trinh thu tuc t t h c that was removed
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException if a mot cua quy trinh thu tuc t t h c with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC updateImpl(
		vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(motCuaQuyTrinhThuTucTTHC);
	}

	/**
	* Returns the mot cua quy trinh thu tuc t t h c with the primary key or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException} if it could not be found.
	*
	* @param id the primary key of the mot cua quy trinh thu tuc t t h c
	* @return the mot cua quy trinh thu tuc t t h c
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException if a mot cua quy trinh thu tuc t t h c with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaQuyTrinhThuTucTTHCException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the mot cua quy trinh thu tuc t t h c with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the mot cua quy trinh thu tuc t t h c
	* @return the mot cua quy trinh thu tuc t t h c, or <code>null</code> if a mot cua quy trinh thu tuc t t h c with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the mot cua quy trinh thu tuc t t h cs.
	*
	* @return the mot cua quy trinh thu tuc t t h cs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the mot cua quy trinh thu tuc t t h cs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaQuyTrinhThuTucTTHCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua quy trinh thu tuc t t h cs
	* @param end the upper bound of the range of mot cua quy trinh thu tuc t t h cs (not inclusive)
	* @return the range of mot cua quy trinh thu tuc t t h cs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the mot cua quy trinh thu tuc t t h cs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaQuyTrinhThuTucTTHCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua quy trinh thu tuc t t h cs
	* @param end the upper bound of the range of mot cua quy trinh thu tuc t t h cs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of mot cua quy trinh thu tuc t t h cs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the mot cua quy trinh thu tuc t t h cs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of mot cua quy trinh thu tuc t t h cs.
	*
	* @return the number of mot cua quy trinh thu tuc t t h cs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static MotCuaQuyTrinhThuTucTTHCPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (MotCuaQuyTrinhThuTucTTHCPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.motcua.service.ClpSerializer.getServletContextName(),
					MotCuaQuyTrinhThuTucTTHCPersistence.class.getName());

			ReferenceRegistry.registerReference(MotCuaQuyTrinhThuTucTTHCUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(MotCuaQuyTrinhThuTucTTHCPersistence persistence) {
	}

	private static MotCuaQuyTrinhThuTucTTHCPersistence _persistence;
}