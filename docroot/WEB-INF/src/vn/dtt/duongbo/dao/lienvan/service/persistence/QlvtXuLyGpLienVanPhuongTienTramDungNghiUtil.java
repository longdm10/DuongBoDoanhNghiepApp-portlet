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

package vn.dtt.duongbo.dao.lienvan.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi;

import java.util.List;

/**
 * The persistence utility for the qlvt xu ly gp lien van phuong tien tram dung nghi service. This utility wraps {@link QlvtXuLyGpLienVanPhuongTienTramDungNghiPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanNc
 * @see QlvtXuLyGpLienVanPhuongTienTramDungNghiPersistence
 * @see QlvtXuLyGpLienVanPhuongTienTramDungNghiPersistenceImpl
 * @generated
 */
public class QlvtXuLyGpLienVanPhuongTienTramDungNghiUtil {
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
		QlvtXuLyGpLienVanPhuongTienTramDungNghi qlvtXuLyGpLienVanPhuongTienTramDungNghi) {
		getPersistence().clearCache(qlvtXuLyGpLienVanPhuongTienTramDungNghi);
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
	public static List<QlvtXuLyGpLienVanPhuongTienTramDungNghi> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QlvtXuLyGpLienVanPhuongTienTramDungNghi> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QlvtXuLyGpLienVanPhuongTienTramDungNghi> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static QlvtXuLyGpLienVanPhuongTienTramDungNghi update(
		QlvtXuLyGpLienVanPhuongTienTramDungNghi qlvtXuLyGpLienVanPhuongTienTramDungNghi)
		throws SystemException {
		return getPersistence().update(qlvtXuLyGpLienVanPhuongTienTramDungNghi);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static QlvtXuLyGpLienVanPhuongTienTramDungNghi update(
		QlvtXuLyGpLienVanPhuongTienTramDungNghi qlvtXuLyGpLienVanPhuongTienTramDungNghi,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(qlvtXuLyGpLienVanPhuongTienTramDungNghi,
			serviceContext);
	}

	/**
	* Returns all the qlvt xu ly gp lien van phuong tien tram dung nghis where capGplxPhuongTienId = &#63;.
	*
	* @param capGplxPhuongTienId the cap gplx phuong tien ID
	* @return the matching qlvt xu ly gp lien van phuong tien tram dung nghis
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi> findByCapGplxPhuongTienId(
		long capGplxPhuongTienId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCapGplxPhuongTienId(capGplxPhuongTienId);
	}

	/**
	* Returns a range of all the qlvt xu ly gp lien van phuong tien tram dung nghis where capGplxPhuongTienId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param capGplxPhuongTienId the cap gplx phuong tien ID
	* @param start the lower bound of the range of qlvt xu ly gp lien van phuong tien tram dung nghis
	* @param end the upper bound of the range of qlvt xu ly gp lien van phuong tien tram dung nghis (not inclusive)
	* @return the range of matching qlvt xu ly gp lien van phuong tien tram dung nghis
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi> findByCapGplxPhuongTienId(
		long capGplxPhuongTienId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCapGplxPhuongTienId(capGplxPhuongTienId, start, end);
	}

	/**
	* Returns an ordered range of all the qlvt xu ly gp lien van phuong tien tram dung nghis where capGplxPhuongTienId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param capGplxPhuongTienId the cap gplx phuong tien ID
	* @param start the lower bound of the range of qlvt xu ly gp lien van phuong tien tram dung nghis
	* @param end the upper bound of the range of qlvt xu ly gp lien van phuong tien tram dung nghis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching qlvt xu ly gp lien van phuong tien tram dung nghis
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi> findByCapGplxPhuongTienId(
		long capGplxPhuongTienId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCapGplxPhuongTienId(capGplxPhuongTienId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first qlvt xu ly gp lien van phuong tien tram dung nghi in the ordered set where capGplxPhuongTienId = &#63;.
	*
	* @param capGplxPhuongTienId the cap gplx phuong tien ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching qlvt xu ly gp lien van phuong tien tram dung nghi
	* @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException if a matching qlvt xu ly gp lien van phuong tien tram dung nghi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi findByCapGplxPhuongTienId_First(
		long capGplxPhuongTienId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException {
		return getPersistence()
				   .findByCapGplxPhuongTienId_First(capGplxPhuongTienId,
			orderByComparator);
	}

	/**
	* Returns the first qlvt xu ly gp lien van phuong tien tram dung nghi in the ordered set where capGplxPhuongTienId = &#63;.
	*
	* @param capGplxPhuongTienId the cap gplx phuong tien ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching qlvt xu ly gp lien van phuong tien tram dung nghi, or <code>null</code> if a matching qlvt xu ly gp lien van phuong tien tram dung nghi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi fetchByCapGplxPhuongTienId_First(
		long capGplxPhuongTienId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCapGplxPhuongTienId_First(capGplxPhuongTienId,
			orderByComparator);
	}

	/**
	* Returns the last qlvt xu ly gp lien van phuong tien tram dung nghi in the ordered set where capGplxPhuongTienId = &#63;.
	*
	* @param capGplxPhuongTienId the cap gplx phuong tien ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching qlvt xu ly gp lien van phuong tien tram dung nghi
	* @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException if a matching qlvt xu ly gp lien van phuong tien tram dung nghi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi findByCapGplxPhuongTienId_Last(
		long capGplxPhuongTienId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException {
		return getPersistence()
				   .findByCapGplxPhuongTienId_Last(capGplxPhuongTienId,
			orderByComparator);
	}

	/**
	* Returns the last qlvt xu ly gp lien van phuong tien tram dung nghi in the ordered set where capGplxPhuongTienId = &#63;.
	*
	* @param capGplxPhuongTienId the cap gplx phuong tien ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching qlvt xu ly gp lien van phuong tien tram dung nghi, or <code>null</code> if a matching qlvt xu ly gp lien van phuong tien tram dung nghi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi fetchByCapGplxPhuongTienId_Last(
		long capGplxPhuongTienId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCapGplxPhuongTienId_Last(capGplxPhuongTienId,
			orderByComparator);
	}

	/**
	* Returns the qlvt xu ly gp lien van phuong tien tram dung nghis before and after the current qlvt xu ly gp lien van phuong tien tram dung nghi in the ordered set where capGplxPhuongTienId = &#63;.
	*
	* @param id the primary key of the current qlvt xu ly gp lien van phuong tien tram dung nghi
	* @param capGplxPhuongTienId the cap gplx phuong tien ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next qlvt xu ly gp lien van phuong tien tram dung nghi
	* @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException if a qlvt xu ly gp lien van phuong tien tram dung nghi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi[] findByCapGplxPhuongTienId_PrevAndNext(
		long id, long capGplxPhuongTienId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException {
		return getPersistence()
				   .findByCapGplxPhuongTienId_PrevAndNext(id,
			capGplxPhuongTienId, orderByComparator);
	}

	/**
	* Removes all the qlvt xu ly gp lien van phuong tien tram dung nghis where capGplxPhuongTienId = &#63; from the database.
	*
	* @param capGplxPhuongTienId the cap gplx phuong tien ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCapGplxPhuongTienId(long capGplxPhuongTienId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCapGplxPhuongTienId(capGplxPhuongTienId);
	}

	/**
	* Returns the number of qlvt xu ly gp lien van phuong tien tram dung nghis where capGplxPhuongTienId = &#63;.
	*
	* @param capGplxPhuongTienId the cap gplx phuong tien ID
	* @return the number of matching qlvt xu ly gp lien van phuong tien tram dung nghis
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCapGplxPhuongTienId(long capGplxPhuongTienId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCapGplxPhuongTienId(capGplxPhuongTienId);
	}

	/**
	* Caches the qlvt xu ly gp lien van phuong tien tram dung nghi in the entity cache if it is enabled.
	*
	* @param qlvtXuLyGpLienVanPhuongTienTramDungNghi the qlvt xu ly gp lien van phuong tien tram dung nghi
	*/
	public static void cacheResult(
		vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi qlvtXuLyGpLienVanPhuongTienTramDungNghi) {
		getPersistence().cacheResult(qlvtXuLyGpLienVanPhuongTienTramDungNghi);
	}

	/**
	* Caches the qlvt xu ly gp lien van phuong tien tram dung nghis in the entity cache if it is enabled.
	*
	* @param qlvtXuLyGpLienVanPhuongTienTramDungNghis the qlvt xu ly gp lien van phuong tien tram dung nghis
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi> qlvtXuLyGpLienVanPhuongTienTramDungNghis) {
		getPersistence().cacheResult(qlvtXuLyGpLienVanPhuongTienTramDungNghis);
	}

	/**
	* Creates a new qlvt xu ly gp lien van phuong tien tram dung nghi with the primary key. Does not add the qlvt xu ly gp lien van phuong tien tram dung nghi to the database.
	*
	* @param id the primary key for the new qlvt xu ly gp lien van phuong tien tram dung nghi
	* @return the new qlvt xu ly gp lien van phuong tien tram dung nghi
	*/
	public static vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the qlvt xu ly gp lien van phuong tien tram dung nghi with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt xu ly gp lien van phuong tien tram dung nghi
	* @return the qlvt xu ly gp lien van phuong tien tram dung nghi that was removed
	* @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException if a qlvt xu ly gp lien van phuong tien tram dung nghi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi updateImpl(
		vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi qlvtXuLyGpLienVanPhuongTienTramDungNghi)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .updateImpl(qlvtXuLyGpLienVanPhuongTienTramDungNghi);
	}

	/**
	* Returns the qlvt xu ly gp lien van phuong tien tram dung nghi with the primary key or throws a {@link vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException} if it could not be found.
	*
	* @param id the primary key of the qlvt xu ly gp lien van phuong tien tram dung nghi
	* @return the qlvt xu ly gp lien van phuong tien tram dung nghi
	* @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException if a qlvt xu ly gp lien van phuong tien tram dung nghi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanPhuongTienTramDungNghiException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the qlvt xu ly gp lien van phuong tien tram dung nghi with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the qlvt xu ly gp lien van phuong tien tram dung nghi
	* @return the qlvt xu ly gp lien van phuong tien tram dung nghi, or <code>null</code> if a qlvt xu ly gp lien van phuong tien tram dung nghi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the qlvt xu ly gp lien van phuong tien tram dung nghis.
	*
	* @return the qlvt xu ly gp lien van phuong tien tram dung nghis
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the qlvt xu ly gp lien van phuong tien tram dung nghis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt xu ly gp lien van phuong tien tram dung nghis
	* @param end the upper bound of the range of qlvt xu ly gp lien van phuong tien tram dung nghis (not inclusive)
	* @return the range of qlvt xu ly gp lien van phuong tien tram dung nghis
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the qlvt xu ly gp lien van phuong tien tram dung nghis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanPhuongTienTramDungNghiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt xu ly gp lien van phuong tien tram dung nghis
	* @param end the upper bound of the range of qlvt xu ly gp lien van phuong tien tram dung nghis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of qlvt xu ly gp lien van phuong tien tram dung nghis
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanPhuongTienTramDungNghi> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the qlvt xu ly gp lien van phuong tien tram dung nghis from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of qlvt xu ly gp lien van phuong tien tram dung nghis.
	*
	* @return the number of qlvt xu ly gp lien van phuong tien tram dung nghis
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static QlvtXuLyGpLienVanPhuongTienTramDungNghiPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (QlvtXuLyGpLienVanPhuongTienTramDungNghiPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.lienvan.service.ClpSerializer.getServletContextName(),
					QlvtXuLyGpLienVanPhuongTienTramDungNghiPersistence.class.getName());

			ReferenceRegistry.registerReference(QlvtXuLyGpLienVanPhuongTienTramDungNghiUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(
		QlvtXuLyGpLienVanPhuongTienTramDungNghiPersistence persistence) {
	}

	private static QlvtXuLyGpLienVanPhuongTienTramDungNghiPersistence _persistence;
}