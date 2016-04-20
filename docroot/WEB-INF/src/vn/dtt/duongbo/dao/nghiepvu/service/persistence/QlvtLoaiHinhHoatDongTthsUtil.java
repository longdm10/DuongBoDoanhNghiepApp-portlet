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

package vn.dtt.duongbo.dao.nghiepvu.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths;

import java.util.List;

/**
 * The persistence utility for the qlvt loai hinh hoat dong tths service. This utility wraps {@link QlvtLoaiHinhHoatDongTthsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanNc
 * @see QlvtLoaiHinhHoatDongTthsPersistence
 * @see QlvtLoaiHinhHoatDongTthsPersistenceImpl
 * @generated
 */
public class QlvtLoaiHinhHoatDongTthsUtil {
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
		QlvtLoaiHinhHoatDongTths qlvtLoaiHinhHoatDongTths) {
		getPersistence().clearCache(qlvtLoaiHinhHoatDongTths);
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
	public static List<QlvtLoaiHinhHoatDongTths> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QlvtLoaiHinhHoatDongTths> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QlvtLoaiHinhHoatDongTths> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static QlvtLoaiHinhHoatDongTths update(
		QlvtLoaiHinhHoatDongTths qlvtLoaiHinhHoatDongTths)
		throws SystemException {
		return getPersistence().update(qlvtLoaiHinhHoatDongTths);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static QlvtLoaiHinhHoatDongTths update(
		QlvtLoaiHinhHoatDongTths qlvtLoaiHinhHoatDongTths,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(qlvtLoaiHinhHoatDongTths, serviceContext);
	}

	/**
	* Returns all the qlvt loai hinh hoat dong tthses where thongTinHoSoId = &#63;.
	*
	* @param thongTinHoSoId the thong tin ho so ID
	* @return the matching qlvt loai hinh hoat dong tthses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths> findByThongTinHoSoId(
		long thongTinHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByThongTinHoSoId(thongTinHoSoId);
	}

	/**
	* Returns a range of all the qlvt loai hinh hoat dong tthses where thongTinHoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtLoaiHinhHoatDongTthsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param thongTinHoSoId the thong tin ho so ID
	* @param start the lower bound of the range of qlvt loai hinh hoat dong tthses
	* @param end the upper bound of the range of qlvt loai hinh hoat dong tthses (not inclusive)
	* @return the range of matching qlvt loai hinh hoat dong tthses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths> findByThongTinHoSoId(
		long thongTinHoSoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByThongTinHoSoId(thongTinHoSoId, start, end);
	}

	/**
	* Returns an ordered range of all the qlvt loai hinh hoat dong tthses where thongTinHoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtLoaiHinhHoatDongTthsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param thongTinHoSoId the thong tin ho so ID
	* @param start the lower bound of the range of qlvt loai hinh hoat dong tthses
	* @param end the upper bound of the range of qlvt loai hinh hoat dong tthses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching qlvt loai hinh hoat dong tthses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths> findByThongTinHoSoId(
		long thongTinHoSoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByThongTinHoSoId(thongTinHoSoId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first qlvt loai hinh hoat dong tths in the ordered set where thongTinHoSoId = &#63;.
	*
	* @param thongTinHoSoId the thong tin ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching qlvt loai hinh hoat dong tths
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtLoaiHinhHoatDongTthsException if a matching qlvt loai hinh hoat dong tths could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths findByThongTinHoSoId_First(
		long thongTinHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtLoaiHinhHoatDongTthsException {
		return getPersistence()
				   .findByThongTinHoSoId_First(thongTinHoSoId, orderByComparator);
	}

	/**
	* Returns the first qlvt loai hinh hoat dong tths in the ordered set where thongTinHoSoId = &#63;.
	*
	* @param thongTinHoSoId the thong tin ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching qlvt loai hinh hoat dong tths, or <code>null</code> if a matching qlvt loai hinh hoat dong tths could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths fetchByThongTinHoSoId_First(
		long thongTinHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByThongTinHoSoId_First(thongTinHoSoId,
			orderByComparator);
	}

	/**
	* Returns the last qlvt loai hinh hoat dong tths in the ordered set where thongTinHoSoId = &#63;.
	*
	* @param thongTinHoSoId the thong tin ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching qlvt loai hinh hoat dong tths
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtLoaiHinhHoatDongTthsException if a matching qlvt loai hinh hoat dong tths could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths findByThongTinHoSoId_Last(
		long thongTinHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtLoaiHinhHoatDongTthsException {
		return getPersistence()
				   .findByThongTinHoSoId_Last(thongTinHoSoId, orderByComparator);
	}

	/**
	* Returns the last qlvt loai hinh hoat dong tths in the ordered set where thongTinHoSoId = &#63;.
	*
	* @param thongTinHoSoId the thong tin ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching qlvt loai hinh hoat dong tths, or <code>null</code> if a matching qlvt loai hinh hoat dong tths could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths fetchByThongTinHoSoId_Last(
		long thongTinHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByThongTinHoSoId_Last(thongTinHoSoId, orderByComparator);
	}

	/**
	* Returns the qlvt loai hinh hoat dong tthses before and after the current qlvt loai hinh hoat dong tths in the ordered set where thongTinHoSoId = &#63;.
	*
	* @param id the primary key of the current qlvt loai hinh hoat dong tths
	* @param thongTinHoSoId the thong tin ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next qlvt loai hinh hoat dong tths
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtLoaiHinhHoatDongTthsException if a qlvt loai hinh hoat dong tths with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths[] findByThongTinHoSoId_PrevAndNext(
		long id, long thongTinHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtLoaiHinhHoatDongTthsException {
		return getPersistence()
				   .findByThongTinHoSoId_PrevAndNext(id, thongTinHoSoId,
			orderByComparator);
	}

	/**
	* Removes all the qlvt loai hinh hoat dong tthses where thongTinHoSoId = &#63; from the database.
	*
	* @param thongTinHoSoId the thong tin ho so ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByThongTinHoSoId(long thongTinHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByThongTinHoSoId(thongTinHoSoId);
	}

	/**
	* Returns the number of qlvt loai hinh hoat dong tthses where thongTinHoSoId = &#63;.
	*
	* @param thongTinHoSoId the thong tin ho so ID
	* @return the number of matching qlvt loai hinh hoat dong tthses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByThongTinHoSoId(long thongTinHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByThongTinHoSoId(thongTinHoSoId);
	}

	/**
	* Caches the qlvt loai hinh hoat dong tths in the entity cache if it is enabled.
	*
	* @param qlvtLoaiHinhHoatDongTths the qlvt loai hinh hoat dong tths
	*/
	public static void cacheResult(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths qlvtLoaiHinhHoatDongTths) {
		getPersistence().cacheResult(qlvtLoaiHinhHoatDongTths);
	}

	/**
	* Caches the qlvt loai hinh hoat dong tthses in the entity cache if it is enabled.
	*
	* @param qlvtLoaiHinhHoatDongTthses the qlvt loai hinh hoat dong tthses
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths> qlvtLoaiHinhHoatDongTthses) {
		getPersistence().cacheResult(qlvtLoaiHinhHoatDongTthses);
	}

	/**
	* Creates a new qlvt loai hinh hoat dong tths with the primary key. Does not add the qlvt loai hinh hoat dong tths to the database.
	*
	* @param id the primary key for the new qlvt loai hinh hoat dong tths
	* @return the new qlvt loai hinh hoat dong tths
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the qlvt loai hinh hoat dong tths with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt loai hinh hoat dong tths
	* @return the qlvt loai hinh hoat dong tths that was removed
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtLoaiHinhHoatDongTthsException if a qlvt loai hinh hoat dong tths with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtLoaiHinhHoatDongTthsException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths updateImpl(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths qlvtLoaiHinhHoatDongTths)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(qlvtLoaiHinhHoatDongTths);
	}

	/**
	* Returns the qlvt loai hinh hoat dong tths with the primary key or throws a {@link vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtLoaiHinhHoatDongTthsException} if it could not be found.
	*
	* @param id the primary key of the qlvt loai hinh hoat dong tths
	* @return the qlvt loai hinh hoat dong tths
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtLoaiHinhHoatDongTthsException if a qlvt loai hinh hoat dong tths with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtLoaiHinhHoatDongTthsException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the qlvt loai hinh hoat dong tths with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the qlvt loai hinh hoat dong tths
	* @return the qlvt loai hinh hoat dong tths, or <code>null</code> if a qlvt loai hinh hoat dong tths with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the qlvt loai hinh hoat dong tthses.
	*
	* @return the qlvt loai hinh hoat dong tthses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the qlvt loai hinh hoat dong tthses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtLoaiHinhHoatDongTthsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt loai hinh hoat dong tthses
	* @param end the upper bound of the range of qlvt loai hinh hoat dong tthses (not inclusive)
	* @return the range of qlvt loai hinh hoat dong tthses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the qlvt loai hinh hoat dong tthses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtLoaiHinhHoatDongTthsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt loai hinh hoat dong tthses
	* @param end the upper bound of the range of qlvt loai hinh hoat dong tthses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of qlvt loai hinh hoat dong tthses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtLoaiHinhHoatDongTths> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the qlvt loai hinh hoat dong tthses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of qlvt loai hinh hoat dong tthses.
	*
	* @return the number of qlvt loai hinh hoat dong tthses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static QlvtLoaiHinhHoatDongTthsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (QlvtLoaiHinhHoatDongTthsPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					QlvtLoaiHinhHoatDongTthsPersistence.class.getName());

			ReferenceRegistry.registerReference(QlvtLoaiHinhHoatDongTthsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(QlvtLoaiHinhHoatDongTthsPersistence persistence) {
	}

	private static QlvtLoaiHinhHoatDongTthsPersistence _persistence;
}