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

package vn.dtt.duongbo.dao.noidia.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai;

import java.util.List;

/**
 * The persistence utility for the qlvt xu ly gpkdvt bang oto loai hinh van tai service. This utility wraps {@link QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NoiPham
 * @see QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiPersistence
 * @see QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiPersistenceImpl
 * @generated
 */
public class QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiUtil {
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
		QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai) {
		getPersistence().clearCache(qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai);
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
	public static List<QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai update(
		QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai)
		throws SystemException {
		return getPersistence().update(qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai update(
		QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai, serviceContext);
	}

	/**
	* Returns all the qlvt xu ly gpkdvt bang oto loai hinh van tais where gpkdvtBangOtoId = &#63;.
	*
	* @param gpkdvtBangOtoId the gpkdvt bang oto ID
	* @return the matching qlvt xu ly gpkdvt bang oto loai hinh van tais
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai> findBygpkdvtBangOtoId(
		int gpkdvtBangOtoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBygpkdvtBangOtoId(gpkdvtBangOtoId);
	}

	/**
	* Returns a range of all the qlvt xu ly gpkdvt bang oto loai hinh van tais where gpkdvtBangOtoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.noidia.model.impl.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param gpkdvtBangOtoId the gpkdvt bang oto ID
	* @param start the lower bound of the range of qlvt xu ly gpkdvt bang oto loai hinh van tais
	* @param end the upper bound of the range of qlvt xu ly gpkdvt bang oto loai hinh van tais (not inclusive)
	* @return the range of matching qlvt xu ly gpkdvt bang oto loai hinh van tais
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai> findBygpkdvtBangOtoId(
		int gpkdvtBangOtoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBygpkdvtBangOtoId(gpkdvtBangOtoId, start, end);
	}

	/**
	* Returns an ordered range of all the qlvt xu ly gpkdvt bang oto loai hinh van tais where gpkdvtBangOtoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.noidia.model.impl.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param gpkdvtBangOtoId the gpkdvt bang oto ID
	* @param start the lower bound of the range of qlvt xu ly gpkdvt bang oto loai hinh van tais
	* @param end the upper bound of the range of qlvt xu ly gpkdvt bang oto loai hinh van tais (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching qlvt xu ly gpkdvt bang oto loai hinh van tais
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai> findBygpkdvtBangOtoId(
		int gpkdvtBangOtoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBygpkdvtBangOtoId(gpkdvtBangOtoId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first qlvt xu ly gpkdvt bang oto loai hinh van tai in the ordered set where gpkdvtBangOtoId = &#63;.
	*
	* @param gpkdvtBangOtoId the gpkdvt bang oto ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching qlvt xu ly gpkdvt bang oto loai hinh van tai
	* @throws vn.dtt.duongbo.dao.noidia.NoSuchQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiException if a matching qlvt xu ly gpkdvt bang oto loai hinh van tai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai findBygpkdvtBangOtoId_First(
		int gpkdvtBangOtoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.noidia.NoSuchQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiException {
		return getPersistence()
				   .findBygpkdvtBangOtoId_First(gpkdvtBangOtoId,
			orderByComparator);
	}

	/**
	* Returns the first qlvt xu ly gpkdvt bang oto loai hinh van tai in the ordered set where gpkdvtBangOtoId = &#63;.
	*
	* @param gpkdvtBangOtoId the gpkdvt bang oto ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching qlvt xu ly gpkdvt bang oto loai hinh van tai, or <code>null</code> if a matching qlvt xu ly gpkdvt bang oto loai hinh van tai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai fetchBygpkdvtBangOtoId_First(
		int gpkdvtBangOtoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBygpkdvtBangOtoId_First(gpkdvtBangOtoId,
			orderByComparator);
	}

	/**
	* Returns the last qlvt xu ly gpkdvt bang oto loai hinh van tai in the ordered set where gpkdvtBangOtoId = &#63;.
	*
	* @param gpkdvtBangOtoId the gpkdvt bang oto ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching qlvt xu ly gpkdvt bang oto loai hinh van tai
	* @throws vn.dtt.duongbo.dao.noidia.NoSuchQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiException if a matching qlvt xu ly gpkdvt bang oto loai hinh van tai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai findBygpkdvtBangOtoId_Last(
		int gpkdvtBangOtoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.noidia.NoSuchQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiException {
		return getPersistence()
				   .findBygpkdvtBangOtoId_Last(gpkdvtBangOtoId,
			orderByComparator);
	}

	/**
	* Returns the last qlvt xu ly gpkdvt bang oto loai hinh van tai in the ordered set where gpkdvtBangOtoId = &#63;.
	*
	* @param gpkdvtBangOtoId the gpkdvt bang oto ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching qlvt xu ly gpkdvt bang oto loai hinh van tai, or <code>null</code> if a matching qlvt xu ly gpkdvt bang oto loai hinh van tai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai fetchBygpkdvtBangOtoId_Last(
		int gpkdvtBangOtoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBygpkdvtBangOtoId_Last(gpkdvtBangOtoId,
			orderByComparator);
	}

	/**
	* Returns the qlvt xu ly gpkdvt bang oto loai hinh van tais before and after the current qlvt xu ly gpkdvt bang oto loai hinh van tai in the ordered set where gpkdvtBangOtoId = &#63;.
	*
	* @param id the primary key of the current qlvt xu ly gpkdvt bang oto loai hinh van tai
	* @param gpkdvtBangOtoId the gpkdvt bang oto ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next qlvt xu ly gpkdvt bang oto loai hinh van tai
	* @throws vn.dtt.duongbo.dao.noidia.NoSuchQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiException if a qlvt xu ly gpkdvt bang oto loai hinh van tai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai[] findBygpkdvtBangOtoId_PrevAndNext(
		long id, int gpkdvtBangOtoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.noidia.NoSuchQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiException {
		return getPersistence()
				   .findBygpkdvtBangOtoId_PrevAndNext(id, gpkdvtBangOtoId,
			orderByComparator);
	}

	/**
	* Removes all the qlvt xu ly gpkdvt bang oto loai hinh van tais where gpkdvtBangOtoId = &#63; from the database.
	*
	* @param gpkdvtBangOtoId the gpkdvt bang oto ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBygpkdvtBangOtoId(int gpkdvtBangOtoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBygpkdvtBangOtoId(gpkdvtBangOtoId);
	}

	/**
	* Returns the number of qlvt xu ly gpkdvt bang oto loai hinh van tais where gpkdvtBangOtoId = &#63;.
	*
	* @param gpkdvtBangOtoId the gpkdvt bang oto ID
	* @return the number of matching qlvt xu ly gpkdvt bang oto loai hinh van tais
	* @throws SystemException if a system exception occurred
	*/
	public static int countBygpkdvtBangOtoId(int gpkdvtBangOtoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBygpkdvtBangOtoId(gpkdvtBangOtoId);
	}

	/**
	* Caches the qlvt xu ly gpkdvt bang oto loai hinh van tai in the entity cache if it is enabled.
	*
	* @param qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai the qlvt xu ly gpkdvt bang oto loai hinh van tai
	*/
	public static void cacheResult(
		vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai) {
		getPersistence().cacheResult(qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai);
	}

	/**
	* Caches the qlvt xu ly gpkdvt bang oto loai hinh van tais in the entity cache if it is enabled.
	*
	* @param qlvtXuLyGpkdvtBangOtoLoaiHinhVanTais the qlvt xu ly gpkdvt bang oto loai hinh van tais
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai> qlvtXuLyGpkdvtBangOtoLoaiHinhVanTais) {
		getPersistence().cacheResult(qlvtXuLyGpkdvtBangOtoLoaiHinhVanTais);
	}

	/**
	* Creates a new qlvt xu ly gpkdvt bang oto loai hinh van tai with the primary key. Does not add the qlvt xu ly gpkdvt bang oto loai hinh van tai to the database.
	*
	* @param id the primary key for the new qlvt xu ly gpkdvt bang oto loai hinh van tai
	* @return the new qlvt xu ly gpkdvt bang oto loai hinh van tai
	*/
	public static vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the qlvt xu ly gpkdvt bang oto loai hinh van tai with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt xu ly gpkdvt bang oto loai hinh van tai
	* @return the qlvt xu ly gpkdvt bang oto loai hinh van tai that was removed
	* @throws vn.dtt.duongbo.dao.noidia.NoSuchQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiException if a qlvt xu ly gpkdvt bang oto loai hinh van tai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.noidia.NoSuchQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai updateImpl(
		vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(qlvtXuLyGpkdvtBangOtoLoaiHinhVanTai);
	}

	/**
	* Returns the qlvt xu ly gpkdvt bang oto loai hinh van tai with the primary key or throws a {@link vn.dtt.duongbo.dao.noidia.NoSuchQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiException} if it could not be found.
	*
	* @param id the primary key of the qlvt xu ly gpkdvt bang oto loai hinh van tai
	* @return the qlvt xu ly gpkdvt bang oto loai hinh van tai
	* @throws vn.dtt.duongbo.dao.noidia.NoSuchQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiException if a qlvt xu ly gpkdvt bang oto loai hinh van tai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.noidia.NoSuchQlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the qlvt xu ly gpkdvt bang oto loai hinh van tai with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the qlvt xu ly gpkdvt bang oto loai hinh van tai
	* @return the qlvt xu ly gpkdvt bang oto loai hinh van tai, or <code>null</code> if a qlvt xu ly gpkdvt bang oto loai hinh van tai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the qlvt xu ly gpkdvt bang oto loai hinh van tais.
	*
	* @return the qlvt xu ly gpkdvt bang oto loai hinh van tais
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the qlvt xu ly gpkdvt bang oto loai hinh van tais.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.noidia.model.impl.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt xu ly gpkdvt bang oto loai hinh van tais
	* @param end the upper bound of the range of qlvt xu ly gpkdvt bang oto loai hinh van tais (not inclusive)
	* @return the range of qlvt xu ly gpkdvt bang oto loai hinh van tais
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the qlvt xu ly gpkdvt bang oto loai hinh van tais.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.noidia.model.impl.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt xu ly gpkdvt bang oto loai hinh van tais
	* @param end the upper bound of the range of qlvt xu ly gpkdvt bang oto loai hinh van tais (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of qlvt xu ly gpkdvt bang oto loai hinh van tais
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.noidia.model.QlvtXuLyGpkdvtBangOtoLoaiHinhVanTai> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the qlvt xu ly gpkdvt bang oto loai hinh van tais from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of qlvt xu ly gpkdvt bang oto loai hinh van tais.
	*
	* @return the number of qlvt xu ly gpkdvt bang oto loai hinh van tais
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.noidia.service.ClpSerializer.getServletContextName(),
					QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiPersistence.class.getName());

			ReferenceRegistry.registerReference(QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(
		QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiPersistence persistence) {
	}

	private static QlvtXuLyGpkdvtBangOtoLoaiHinhVanTaiPersistence _persistence;
}