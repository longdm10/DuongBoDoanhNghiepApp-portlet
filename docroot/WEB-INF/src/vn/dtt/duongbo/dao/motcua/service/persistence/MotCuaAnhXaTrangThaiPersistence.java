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

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai;

/**
 * The persistence interface for the mot cua anh xa trang thai service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see MotCuaAnhXaTrangThaiPersistenceImpl
 * @see MotCuaAnhXaTrangThaiUtil
 * @generated
 */
public interface MotCuaAnhXaTrangThaiPersistence extends BasePersistence<MotCuaAnhXaTrangThai> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MotCuaAnhXaTrangThaiUtil} to access the mot cua anh xa trang thai persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the mot cua anh xa trang thai where maTTCanBo = &#63; or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchMotCuaAnhXaTrangThaiException} if it could not be found.
	*
	* @param maTTCanBo the ma t t can bo
	* @return the matching mot cua anh xa trang thai
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaAnhXaTrangThaiException if a matching mot cua anh xa trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai findByMaTTCanBo(
		java.lang.String maTTCanBo)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaAnhXaTrangThaiException;

	/**
	* Returns the mot cua anh xa trang thai where maTTCanBo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param maTTCanBo the ma t t can bo
	* @return the matching mot cua anh xa trang thai, or <code>null</code> if a matching mot cua anh xa trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai fetchByMaTTCanBo(
		java.lang.String maTTCanBo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua anh xa trang thai where maTTCanBo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param maTTCanBo the ma t t can bo
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching mot cua anh xa trang thai, or <code>null</code> if a matching mot cua anh xa trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai fetchByMaTTCanBo(
		java.lang.String maTTCanBo, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the mot cua anh xa trang thai where maTTCanBo = &#63; from the database.
	*
	* @param maTTCanBo the ma t t can bo
	* @return the mot cua anh xa trang thai that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai removeByMaTTCanBo(
		java.lang.String maTTCanBo)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaAnhXaTrangThaiException;

	/**
	* Returns the number of mot cua anh xa trang thais where maTTCanBo = &#63;.
	*
	* @param maTTCanBo the ma t t can bo
	* @return the number of matching mot cua anh xa trang thais
	* @throws SystemException if a system exception occurred
	*/
	public int countByMaTTCanBo(java.lang.String maTTCanBo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mot cua anh xa trang thais where maTTDoanhNghiep = &#63;.
	*
	* @param maTTDoanhNghiep the ma t t doanh nghiep
	* @return the matching mot cua anh xa trang thais
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai> findByMaTTDoanhNghiep(
		java.lang.String maTTDoanhNghiep)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai> findByMaTTDoanhNghiep(
		java.lang.String maTTDoanhNghiep, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai> findByMaTTDoanhNghiep(
		java.lang.String maTTDoanhNghiep, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first mot cua anh xa trang thai in the ordered set where maTTDoanhNghiep = &#63;.
	*
	* @param maTTDoanhNghiep the ma t t doanh nghiep
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua anh xa trang thai
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaAnhXaTrangThaiException if a matching mot cua anh xa trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai findByMaTTDoanhNghiep_First(
		java.lang.String maTTDoanhNghiep,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaAnhXaTrangThaiException;

	/**
	* Returns the first mot cua anh xa trang thai in the ordered set where maTTDoanhNghiep = &#63;.
	*
	* @param maTTDoanhNghiep the ma t t doanh nghiep
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua anh xa trang thai, or <code>null</code> if a matching mot cua anh xa trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai fetchByMaTTDoanhNghiep_First(
		java.lang.String maTTDoanhNghiep,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last mot cua anh xa trang thai in the ordered set where maTTDoanhNghiep = &#63;.
	*
	* @param maTTDoanhNghiep the ma t t doanh nghiep
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua anh xa trang thai
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaAnhXaTrangThaiException if a matching mot cua anh xa trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai findByMaTTDoanhNghiep_Last(
		java.lang.String maTTDoanhNghiep,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaAnhXaTrangThaiException;

	/**
	* Returns the last mot cua anh xa trang thai in the ordered set where maTTDoanhNghiep = &#63;.
	*
	* @param maTTDoanhNghiep the ma t t doanh nghiep
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua anh xa trang thai, or <code>null</code> if a matching mot cua anh xa trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai fetchByMaTTDoanhNghiep_Last(
		java.lang.String maTTDoanhNghiep,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai[] findByMaTTDoanhNghiep_PrevAndNext(
		long id, java.lang.String maTTDoanhNghiep,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaAnhXaTrangThaiException;

	/**
	* Removes all the mot cua anh xa trang thais where maTTDoanhNghiep = &#63; from the database.
	*
	* @param maTTDoanhNghiep the ma t t doanh nghiep
	* @throws SystemException if a system exception occurred
	*/
	public void removeByMaTTDoanhNghiep(java.lang.String maTTDoanhNghiep)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mot cua anh xa trang thais where maTTDoanhNghiep = &#63;.
	*
	* @param maTTDoanhNghiep the ma t t doanh nghiep
	* @return the number of matching mot cua anh xa trang thais
	* @throws SystemException if a system exception occurred
	*/
	public int countByMaTTDoanhNghiep(java.lang.String maTTDoanhNghiep)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the mot cua anh xa trang thai in the entity cache if it is enabled.
	*
	* @param motCuaAnhXaTrangThai the mot cua anh xa trang thai
	*/
	public void cacheResult(
		vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai motCuaAnhXaTrangThai);

	/**
	* Caches the mot cua anh xa trang thais in the entity cache if it is enabled.
	*
	* @param motCuaAnhXaTrangThais the mot cua anh xa trang thais
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai> motCuaAnhXaTrangThais);

	/**
	* Creates a new mot cua anh xa trang thai with the primary key. Does not add the mot cua anh xa trang thai to the database.
	*
	* @param id the primary key for the new mot cua anh xa trang thai
	* @return the new mot cua anh xa trang thai
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai create(long id);

	/**
	* Removes the mot cua anh xa trang thai with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the mot cua anh xa trang thai
	* @return the mot cua anh xa trang thai that was removed
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaAnhXaTrangThaiException if a mot cua anh xa trang thai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaAnhXaTrangThaiException;

	public vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai updateImpl(
		vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai motCuaAnhXaTrangThai)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua anh xa trang thai with the primary key or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchMotCuaAnhXaTrangThaiException} if it could not be found.
	*
	* @param id the primary key of the mot cua anh xa trang thai
	* @return the mot cua anh xa trang thai
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaAnhXaTrangThaiException if a mot cua anh xa trang thai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaAnhXaTrangThaiException;

	/**
	* Returns the mot cua anh xa trang thai with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the mot cua anh xa trang thai
	* @return the mot cua anh xa trang thai, or <code>null</code> if a mot cua anh xa trang thai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mot cua anh xa trang thais.
	*
	* @return the mot cua anh xa trang thais
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaAnhXaTrangThai> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the mot cua anh xa trang thais from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mot cua anh xa trang thais.
	*
	* @return the number of mot cua anh xa trang thais
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}