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

import vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen;

import java.util.List;

/**
 * The persistence utility for the qlvt xu ly gp lien van tuyen service. This utility wraps {@link QlvtXuLyGpLienVanTuyenPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanNc
 * @see QlvtXuLyGpLienVanTuyenPersistence
 * @see QlvtXuLyGpLienVanTuyenPersistenceImpl
 * @generated
 */
public class QlvtXuLyGpLienVanTuyenUtil {
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
	public static void clearCache(QlvtXuLyGpLienVanTuyen qlvtXuLyGpLienVanTuyen) {
		getPersistence().clearCache(qlvtXuLyGpLienVanTuyen);
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
	public static List<QlvtXuLyGpLienVanTuyen> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QlvtXuLyGpLienVanTuyen> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QlvtXuLyGpLienVanTuyen> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static QlvtXuLyGpLienVanTuyen update(
		QlvtXuLyGpLienVanTuyen qlvtXuLyGpLienVanTuyen)
		throws SystemException {
		return getPersistence().update(qlvtXuLyGpLienVanTuyen);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static QlvtXuLyGpLienVanTuyen update(
		QlvtXuLyGpLienVanTuyen qlvtXuLyGpLienVanTuyen,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(qlvtXuLyGpLienVanTuyen, serviceContext);
	}

	/**
	* Returns all the qlvt xu ly gp lien van tuyens where gpLienVanPhuongTienId = &#63;.
	*
	* @param gpLienVanPhuongTienId the gp lien van phuong tien ID
	* @return the matching qlvt xu ly gp lien van tuyens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen> findBygpLienVanPhuongTienId(
		long gpLienVanPhuongTienId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBygpLienVanPhuongTienId(gpLienVanPhuongTienId);
	}

	/**
	* Returns a range of all the qlvt xu ly gp lien van tuyens where gpLienVanPhuongTienId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanTuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param gpLienVanPhuongTienId the gp lien van phuong tien ID
	* @param start the lower bound of the range of qlvt xu ly gp lien van tuyens
	* @param end the upper bound of the range of qlvt xu ly gp lien van tuyens (not inclusive)
	* @return the range of matching qlvt xu ly gp lien van tuyens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen> findBygpLienVanPhuongTienId(
		long gpLienVanPhuongTienId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBygpLienVanPhuongTienId(gpLienVanPhuongTienId, start,
			end);
	}

	/**
	* Returns an ordered range of all the qlvt xu ly gp lien van tuyens where gpLienVanPhuongTienId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanTuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param gpLienVanPhuongTienId the gp lien van phuong tien ID
	* @param start the lower bound of the range of qlvt xu ly gp lien van tuyens
	* @param end the upper bound of the range of qlvt xu ly gp lien van tuyens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching qlvt xu ly gp lien van tuyens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen> findBygpLienVanPhuongTienId(
		long gpLienVanPhuongTienId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBygpLienVanPhuongTienId(gpLienVanPhuongTienId, start,
			end, orderByComparator);
	}

	/**
	* Returns the first qlvt xu ly gp lien van tuyen in the ordered set where gpLienVanPhuongTienId = &#63;.
	*
	* @param gpLienVanPhuongTienId the gp lien van phuong tien ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching qlvt xu ly gp lien van tuyen
	* @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanTuyenException if a matching qlvt xu ly gp lien van tuyen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen findBygpLienVanPhuongTienId_First(
		long gpLienVanPhuongTienId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanTuyenException {
		return getPersistence()
				   .findBygpLienVanPhuongTienId_First(gpLienVanPhuongTienId,
			orderByComparator);
	}

	/**
	* Returns the first qlvt xu ly gp lien van tuyen in the ordered set where gpLienVanPhuongTienId = &#63;.
	*
	* @param gpLienVanPhuongTienId the gp lien van phuong tien ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching qlvt xu ly gp lien van tuyen, or <code>null</code> if a matching qlvt xu ly gp lien van tuyen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen fetchBygpLienVanPhuongTienId_First(
		long gpLienVanPhuongTienId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBygpLienVanPhuongTienId_First(gpLienVanPhuongTienId,
			orderByComparator);
	}

	/**
	* Returns the last qlvt xu ly gp lien van tuyen in the ordered set where gpLienVanPhuongTienId = &#63;.
	*
	* @param gpLienVanPhuongTienId the gp lien van phuong tien ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching qlvt xu ly gp lien van tuyen
	* @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanTuyenException if a matching qlvt xu ly gp lien van tuyen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen findBygpLienVanPhuongTienId_Last(
		long gpLienVanPhuongTienId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanTuyenException {
		return getPersistence()
				   .findBygpLienVanPhuongTienId_Last(gpLienVanPhuongTienId,
			orderByComparator);
	}

	/**
	* Returns the last qlvt xu ly gp lien van tuyen in the ordered set where gpLienVanPhuongTienId = &#63;.
	*
	* @param gpLienVanPhuongTienId the gp lien van phuong tien ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching qlvt xu ly gp lien van tuyen, or <code>null</code> if a matching qlvt xu ly gp lien van tuyen could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen fetchBygpLienVanPhuongTienId_Last(
		long gpLienVanPhuongTienId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBygpLienVanPhuongTienId_Last(gpLienVanPhuongTienId,
			orderByComparator);
	}

	/**
	* Returns the qlvt xu ly gp lien van tuyens before and after the current qlvt xu ly gp lien van tuyen in the ordered set where gpLienVanPhuongTienId = &#63;.
	*
	* @param id the primary key of the current qlvt xu ly gp lien van tuyen
	* @param gpLienVanPhuongTienId the gp lien van phuong tien ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next qlvt xu ly gp lien van tuyen
	* @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanTuyenException if a qlvt xu ly gp lien van tuyen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen[] findBygpLienVanPhuongTienId_PrevAndNext(
		long id, long gpLienVanPhuongTienId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanTuyenException {
		return getPersistence()
				   .findBygpLienVanPhuongTienId_PrevAndNext(id,
			gpLienVanPhuongTienId, orderByComparator);
	}

	/**
	* Removes all the qlvt xu ly gp lien van tuyens where gpLienVanPhuongTienId = &#63; from the database.
	*
	* @param gpLienVanPhuongTienId the gp lien van phuong tien ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBygpLienVanPhuongTienId(long gpLienVanPhuongTienId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBygpLienVanPhuongTienId(gpLienVanPhuongTienId);
	}

	/**
	* Returns the number of qlvt xu ly gp lien van tuyens where gpLienVanPhuongTienId = &#63;.
	*
	* @param gpLienVanPhuongTienId the gp lien van phuong tien ID
	* @return the number of matching qlvt xu ly gp lien van tuyens
	* @throws SystemException if a system exception occurred
	*/
	public static int countBygpLienVanPhuongTienId(long gpLienVanPhuongTienId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countBygpLienVanPhuongTienId(gpLienVanPhuongTienId);
	}

	/**
	* Caches the qlvt xu ly gp lien van tuyen in the entity cache if it is enabled.
	*
	* @param qlvtXuLyGpLienVanTuyen the qlvt xu ly gp lien van tuyen
	*/
	public static void cacheResult(
		vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen qlvtXuLyGpLienVanTuyen) {
		getPersistence().cacheResult(qlvtXuLyGpLienVanTuyen);
	}

	/**
	* Caches the qlvt xu ly gp lien van tuyens in the entity cache if it is enabled.
	*
	* @param qlvtXuLyGpLienVanTuyens the qlvt xu ly gp lien van tuyens
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen> qlvtXuLyGpLienVanTuyens) {
		getPersistence().cacheResult(qlvtXuLyGpLienVanTuyens);
	}

	/**
	* Creates a new qlvt xu ly gp lien van tuyen with the primary key. Does not add the qlvt xu ly gp lien van tuyen to the database.
	*
	* @param id the primary key for the new qlvt xu ly gp lien van tuyen
	* @return the new qlvt xu ly gp lien van tuyen
	*/
	public static vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the qlvt xu ly gp lien van tuyen with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt xu ly gp lien van tuyen
	* @return the qlvt xu ly gp lien van tuyen that was removed
	* @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanTuyenException if a qlvt xu ly gp lien van tuyen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanTuyenException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen updateImpl(
		vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen qlvtXuLyGpLienVanTuyen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(qlvtXuLyGpLienVanTuyen);
	}

	/**
	* Returns the qlvt xu ly gp lien van tuyen with the primary key or throws a {@link vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanTuyenException} if it could not be found.
	*
	* @param id the primary key of the qlvt xu ly gp lien van tuyen
	* @return the qlvt xu ly gp lien van tuyen
	* @throws vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanTuyenException if a qlvt xu ly gp lien van tuyen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.lienvan.NoSuchQlvtXuLyGpLienVanTuyenException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the qlvt xu ly gp lien van tuyen with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the qlvt xu ly gp lien van tuyen
	* @return the qlvt xu ly gp lien van tuyen, or <code>null</code> if a qlvt xu ly gp lien van tuyen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the qlvt xu ly gp lien van tuyens.
	*
	* @return the qlvt xu ly gp lien van tuyens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the qlvt xu ly gp lien van tuyens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanTuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt xu ly gp lien van tuyens
	* @param end the upper bound of the range of qlvt xu ly gp lien van tuyens (not inclusive)
	* @return the range of qlvt xu ly gp lien van tuyens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the qlvt xu ly gp lien van tuyens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.lienvan.model.impl.QlvtXuLyGpLienVanTuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt xu ly gp lien van tuyens
	* @param end the upper bound of the range of qlvt xu ly gp lien van tuyens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of qlvt xu ly gp lien van tuyens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.lienvan.model.QlvtXuLyGpLienVanTuyen> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the qlvt xu ly gp lien van tuyens from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of qlvt xu ly gp lien van tuyens.
	*
	* @return the number of qlvt xu ly gp lien van tuyens
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static QlvtXuLyGpLienVanTuyenPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (QlvtXuLyGpLienVanTuyenPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.lienvan.service.ClpSerializer.getServletContextName(),
					QlvtXuLyGpLienVanTuyenPersistence.class.getName());

			ReferenceRegistry.registerReference(QlvtXuLyGpLienVanTuyenUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(QlvtXuLyGpLienVanTuyenPersistence persistence) {
	}

	private static QlvtXuLyGpLienVanTuyenPersistence _persistence;
}