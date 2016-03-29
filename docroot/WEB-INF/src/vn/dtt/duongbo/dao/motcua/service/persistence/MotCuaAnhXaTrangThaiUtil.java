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

import vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai;

import java.util.List;

/**
 * The persistence utility for the mot cua anh xa trang thai service. This utility wraps {@link MotCuaAnhXaTrangThaiPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see MotCuaAnhXaTrangThaiPersistence
 * @see MotCuaAnhXaTrangThaiPersistenceImpl
 * @generated
 */
public class MotCuaAnhXaTrangThaiUtil {
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
	public static void clearCache(MotCuaAnhXaTrangThai motCuaAnhXaTrangThai) {
		getPersistence().clearCache(motCuaAnhXaTrangThai);
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
	public static List<MotCuaAnhXaTrangThai> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MotCuaAnhXaTrangThai> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MotCuaAnhXaTrangThai> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static MotCuaAnhXaTrangThai update(
		MotCuaAnhXaTrangThai motCuaAnhXaTrangThai) throws SystemException {
		return getPersistence().update(motCuaAnhXaTrangThai);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static MotCuaAnhXaTrangThai update(
		MotCuaAnhXaTrangThai motCuaAnhXaTrangThai, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(motCuaAnhXaTrangThai, serviceContext);
	}

	/**
	* Returns the mot cua anh xa trang thai where maTTCanBo = &#63; or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchMotCuaAnhXaTrangThaiException} if it could not be found.
	*
	* @param maTTCanBo the ma t t can bo
	* @return the matching mot cua anh xa trang thai
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaAnhXaTrangThaiException if a matching mot cua anh xa trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai findByMaTTCanBo(
		java.lang.String maTTCanBo)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaAnhXaTrangThaiException {
		return getPersistence().findByMaTTCanBo(maTTCanBo);
	}

	/**
	* Returns the mot cua anh xa trang thai where maTTCanBo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param maTTCanBo the ma t t can bo
	* @return the matching mot cua anh xa trang thai, or <code>null</code> if a matching mot cua anh xa trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai fetchByMaTTCanBo(
		java.lang.String maTTCanBo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByMaTTCanBo(maTTCanBo);
	}

	/**
	* Returns the mot cua anh xa trang thai where maTTCanBo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param maTTCanBo the ma t t can bo
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching mot cua anh xa trang thai, or <code>null</code> if a matching mot cua anh xa trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai fetchByMaTTCanBo(
		java.lang.String maTTCanBo, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByMaTTCanBo(maTTCanBo, retrieveFromCache);
	}

	/**
	* Removes the mot cua anh xa trang thai where maTTCanBo = &#63; from the database.
	*
	* @param maTTCanBo the ma t t can bo
	* @return the mot cua anh xa trang thai that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai removeByMaTTCanBo(
		java.lang.String maTTCanBo)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaAnhXaTrangThaiException {
		return getPersistence().removeByMaTTCanBo(maTTCanBo);
	}

	/**
	* Returns the number of mot cua anh xa trang thais where maTTCanBo = &#63;.
	*
	* @param maTTCanBo the ma t t can bo
	* @return the number of matching mot cua anh xa trang thais
	* @throws SystemException if a system exception occurred
	*/
	public static int countByMaTTCanBo(java.lang.String maTTCanBo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByMaTTCanBo(maTTCanBo);
	}

	/**
	* Returns all the mot cua anh xa trang thais where maTTDoanhNghiep = &#63;.
	*
	* @param maTTDoanhNghiep the ma t t doanh nghiep
	* @return the matching mot cua anh xa trang thais
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai> findByMaTTDoanhNghiep(
		java.lang.String maTTDoanhNghiep)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByMaTTDoanhNghiep(maTTDoanhNghiep);
	}

	/**
	* Returns a range of all the mot cua anh xa trang thais where maTTDoanhNghiep = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaAnhXaTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param maTTDoanhNghiep the ma t t doanh nghiep
	* @param start the lower bound of the range of mot cua anh xa trang thais
	* @param end the upper bound of the range of mot cua anh xa trang thais (not inclusive)
	* @return the range of matching mot cua anh xa trang thais
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai> findByMaTTDoanhNghiep(
		java.lang.String maTTDoanhNghiep, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByMaTTDoanhNghiep(maTTDoanhNghiep, start, end);
	}

	/**
	* Returns an ordered range of all the mot cua anh xa trang thais where maTTDoanhNghiep = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaAnhXaTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param maTTDoanhNghiep the ma t t doanh nghiep
	* @param start the lower bound of the range of mot cua anh xa trang thais
	* @param end the upper bound of the range of mot cua anh xa trang thais (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mot cua anh xa trang thais
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai> findByMaTTDoanhNghiep(
		java.lang.String maTTDoanhNghiep, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByMaTTDoanhNghiep(maTTDoanhNghiep, start, end,
			orderByComparator);
	}

	/**
	* Returns the first mot cua anh xa trang thai in the ordered set where maTTDoanhNghiep = &#63;.
	*
	* @param maTTDoanhNghiep the ma t t doanh nghiep
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua anh xa trang thai
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaAnhXaTrangThaiException if a matching mot cua anh xa trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai findByMaTTDoanhNghiep_First(
		java.lang.String maTTDoanhNghiep,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaAnhXaTrangThaiException {
		return getPersistence()
				   .findByMaTTDoanhNghiep_First(maTTDoanhNghiep,
			orderByComparator);
	}

	/**
	* Returns the first mot cua anh xa trang thai in the ordered set where maTTDoanhNghiep = &#63;.
	*
	* @param maTTDoanhNghiep the ma t t doanh nghiep
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua anh xa trang thai, or <code>null</code> if a matching mot cua anh xa trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai fetchByMaTTDoanhNghiep_First(
		java.lang.String maTTDoanhNghiep,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByMaTTDoanhNghiep_First(maTTDoanhNghiep,
			orderByComparator);
	}

	/**
	* Returns the last mot cua anh xa trang thai in the ordered set where maTTDoanhNghiep = &#63;.
	*
	* @param maTTDoanhNghiep the ma t t doanh nghiep
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua anh xa trang thai
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaAnhXaTrangThaiException if a matching mot cua anh xa trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai findByMaTTDoanhNghiep_Last(
		java.lang.String maTTDoanhNghiep,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaAnhXaTrangThaiException {
		return getPersistence()
				   .findByMaTTDoanhNghiep_Last(maTTDoanhNghiep,
			orderByComparator);
	}

	/**
	* Returns the last mot cua anh xa trang thai in the ordered set where maTTDoanhNghiep = &#63;.
	*
	* @param maTTDoanhNghiep the ma t t doanh nghiep
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua anh xa trang thai, or <code>null</code> if a matching mot cua anh xa trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai fetchByMaTTDoanhNghiep_Last(
		java.lang.String maTTDoanhNghiep,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByMaTTDoanhNghiep_Last(maTTDoanhNghiep,
			orderByComparator);
	}

	/**
	* Returns the mot cua anh xa trang thais before and after the current mot cua anh xa trang thai in the ordered set where maTTDoanhNghiep = &#63;.
	*
	* @param id the primary key of the current mot cua anh xa trang thai
	* @param maTTDoanhNghiep the ma t t doanh nghiep
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mot cua anh xa trang thai
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaAnhXaTrangThaiException if a mot cua anh xa trang thai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai[] findByMaTTDoanhNghiep_PrevAndNext(
		long id, java.lang.String maTTDoanhNghiep,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaAnhXaTrangThaiException {
		return getPersistence()
				   .findByMaTTDoanhNghiep_PrevAndNext(id, maTTDoanhNghiep,
			orderByComparator);
	}

	/**
	* Removes all the mot cua anh xa trang thais where maTTDoanhNghiep = &#63; from the database.
	*
	* @param maTTDoanhNghiep the ma t t doanh nghiep
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByMaTTDoanhNghiep(java.lang.String maTTDoanhNghiep)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByMaTTDoanhNghiep(maTTDoanhNghiep);
	}

	/**
	* Returns the number of mot cua anh xa trang thais where maTTDoanhNghiep = &#63;.
	*
	* @param maTTDoanhNghiep the ma t t doanh nghiep
	* @return the number of matching mot cua anh xa trang thais
	* @throws SystemException if a system exception occurred
	*/
	public static int countByMaTTDoanhNghiep(java.lang.String maTTDoanhNghiep)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByMaTTDoanhNghiep(maTTDoanhNghiep);
	}

	/**
	* Caches the mot cua anh xa trang thai in the entity cache if it is enabled.
	*
	* @param motCuaAnhXaTrangThai the mot cua anh xa trang thai
	*/
	public static void cacheResult(
		vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai motCuaAnhXaTrangThai) {
		getPersistence().cacheResult(motCuaAnhXaTrangThai);
	}

	/**
	* Caches the mot cua anh xa trang thais in the entity cache if it is enabled.
	*
	* @param motCuaAnhXaTrangThais the mot cua anh xa trang thais
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai> motCuaAnhXaTrangThais) {
		getPersistence().cacheResult(motCuaAnhXaTrangThais);
	}

	/**
	* Creates a new mot cua anh xa trang thai with the primary key. Does not add the mot cua anh xa trang thai to the database.
	*
	* @param id the primary key for the new mot cua anh xa trang thai
	* @return the new mot cua anh xa trang thai
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the mot cua anh xa trang thai with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the mot cua anh xa trang thai
	* @return the mot cua anh xa trang thai that was removed
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaAnhXaTrangThaiException if a mot cua anh xa trang thai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaAnhXaTrangThaiException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai updateImpl(
		vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai motCuaAnhXaTrangThai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(motCuaAnhXaTrangThai);
	}

	/**
	* Returns the mot cua anh xa trang thai with the primary key or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchMotCuaAnhXaTrangThaiException} if it could not be found.
	*
	* @param id the primary key of the mot cua anh xa trang thai
	* @return the mot cua anh xa trang thai
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaAnhXaTrangThaiException if a mot cua anh xa trang thai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaAnhXaTrangThaiException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the mot cua anh xa trang thai with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the mot cua anh xa trang thai
	* @return the mot cua anh xa trang thai, or <code>null</code> if a mot cua anh xa trang thai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the mot cua anh xa trang thais.
	*
	* @return the mot cua anh xa trang thais
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the mot cua anh xa trang thais.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaAnhXaTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua anh xa trang thais
	* @param end the upper bound of the range of mot cua anh xa trang thais (not inclusive)
	* @return the range of mot cua anh xa trang thais
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the mot cua anh xa trang thais.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaAnhXaTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua anh xa trang thais
	* @param end the upper bound of the range of mot cua anh xa trang thais (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of mot cua anh xa trang thais
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the mot cua anh xa trang thais from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of mot cua anh xa trang thais.
	*
	* @return the number of mot cua anh xa trang thais
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static MotCuaAnhXaTrangThaiPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (MotCuaAnhXaTrangThaiPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.motcua.service.ClpSerializer.getServletContextName(),
					MotCuaAnhXaTrangThaiPersistence.class.getName());

			ReferenceRegistry.registerReference(MotCuaAnhXaTrangThaiUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(MotCuaAnhXaTrangThaiPersistence persistence) {
	}

	private static MotCuaAnhXaTrangThaiPersistence _persistence;
}