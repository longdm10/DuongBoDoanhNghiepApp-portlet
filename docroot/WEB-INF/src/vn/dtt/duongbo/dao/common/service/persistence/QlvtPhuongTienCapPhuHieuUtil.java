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

import vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu;

import java.util.List;

/**
 * The persistence utility for the qlvt phuong tien cap phu hieu service. This utility wraps {@link QlvtPhuongTienCapPhuHieuPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see QlvtPhuongTienCapPhuHieuPersistence
 * @see QlvtPhuongTienCapPhuHieuPersistenceImpl
 * @generated
 */
public class QlvtPhuongTienCapPhuHieuUtil {
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
		QlvtPhuongTienCapPhuHieu qlvtPhuongTienCapPhuHieu) {
		getPersistence().clearCache(qlvtPhuongTienCapPhuHieu);
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
	public static List<QlvtPhuongTienCapPhuHieu> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QlvtPhuongTienCapPhuHieu> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QlvtPhuongTienCapPhuHieu> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static QlvtPhuongTienCapPhuHieu update(
		QlvtPhuongTienCapPhuHieu qlvtPhuongTienCapPhuHieu)
		throws SystemException {
		return getPersistence().update(qlvtPhuongTienCapPhuHieu);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static QlvtPhuongTienCapPhuHieu update(
		QlvtPhuongTienCapPhuHieu qlvtPhuongTienCapPhuHieu,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(qlvtPhuongTienCapPhuHieu, serviceContext);
	}

	/**
	* Returns all the qlvt phuong tien cap phu hieus where NoiDungHoSoId = &#63;.
	*
	* @param NoiDungHoSoId the noi dung ho so ID
	* @return the matching qlvt phuong tien cap phu hieus
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu> findByNoiDungHoSoId(
		long NoiDungHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByNoiDungHoSoId(NoiDungHoSoId);
	}

	/**
	* Returns a range of all the qlvt phuong tien cap phu hieus where NoiDungHoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienCapPhuHieuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param NoiDungHoSoId the noi dung ho so ID
	* @param start the lower bound of the range of qlvt phuong tien cap phu hieus
	* @param end the upper bound of the range of qlvt phuong tien cap phu hieus (not inclusive)
	* @return the range of matching qlvt phuong tien cap phu hieus
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu> findByNoiDungHoSoId(
		long NoiDungHoSoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByNoiDungHoSoId(NoiDungHoSoId, start, end);
	}

	/**
	* Returns an ordered range of all the qlvt phuong tien cap phu hieus where NoiDungHoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienCapPhuHieuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param NoiDungHoSoId the noi dung ho so ID
	* @param start the lower bound of the range of qlvt phuong tien cap phu hieus
	* @param end the upper bound of the range of qlvt phuong tien cap phu hieus (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching qlvt phuong tien cap phu hieus
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu> findByNoiDungHoSoId(
		long NoiDungHoSoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNoiDungHoSoId(NoiDungHoSoId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first qlvt phuong tien cap phu hieu in the ordered set where NoiDungHoSoId = &#63;.
	*
	* @param NoiDungHoSoId the noi dung ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching qlvt phuong tien cap phu hieu
	* @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienCapPhuHieuException if a matching qlvt phuong tien cap phu hieu could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu findByNoiDungHoSoId_First(
		long NoiDungHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienCapPhuHieuException {
		return getPersistence()
				   .findByNoiDungHoSoId_First(NoiDungHoSoId, orderByComparator);
	}

	/**
	* Returns the first qlvt phuong tien cap phu hieu in the ordered set where NoiDungHoSoId = &#63;.
	*
	* @param NoiDungHoSoId the noi dung ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching qlvt phuong tien cap phu hieu, or <code>null</code> if a matching qlvt phuong tien cap phu hieu could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu fetchByNoiDungHoSoId_First(
		long NoiDungHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNoiDungHoSoId_First(NoiDungHoSoId, orderByComparator);
	}

	/**
	* Returns the last qlvt phuong tien cap phu hieu in the ordered set where NoiDungHoSoId = &#63;.
	*
	* @param NoiDungHoSoId the noi dung ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching qlvt phuong tien cap phu hieu
	* @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienCapPhuHieuException if a matching qlvt phuong tien cap phu hieu could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu findByNoiDungHoSoId_Last(
		long NoiDungHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienCapPhuHieuException {
		return getPersistence()
				   .findByNoiDungHoSoId_Last(NoiDungHoSoId, orderByComparator);
	}

	/**
	* Returns the last qlvt phuong tien cap phu hieu in the ordered set where NoiDungHoSoId = &#63;.
	*
	* @param NoiDungHoSoId the noi dung ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching qlvt phuong tien cap phu hieu, or <code>null</code> if a matching qlvt phuong tien cap phu hieu could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu fetchByNoiDungHoSoId_Last(
		long NoiDungHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNoiDungHoSoId_Last(NoiDungHoSoId, orderByComparator);
	}

	/**
	* Returns the qlvt phuong tien cap phu hieus before and after the current qlvt phuong tien cap phu hieu in the ordered set where NoiDungHoSoId = &#63;.
	*
	* @param id the primary key of the current qlvt phuong tien cap phu hieu
	* @param NoiDungHoSoId the noi dung ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next qlvt phuong tien cap phu hieu
	* @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienCapPhuHieuException if a qlvt phuong tien cap phu hieu with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu[] findByNoiDungHoSoId_PrevAndNext(
		long id, long NoiDungHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienCapPhuHieuException {
		return getPersistence()
				   .findByNoiDungHoSoId_PrevAndNext(id, NoiDungHoSoId,
			orderByComparator);
	}

	/**
	* Removes all the qlvt phuong tien cap phu hieus where NoiDungHoSoId = &#63; from the database.
	*
	* @param NoiDungHoSoId the noi dung ho so ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByNoiDungHoSoId(long NoiDungHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByNoiDungHoSoId(NoiDungHoSoId);
	}

	/**
	* Returns the number of qlvt phuong tien cap phu hieus where NoiDungHoSoId = &#63;.
	*
	* @param NoiDungHoSoId the noi dung ho so ID
	* @return the number of matching qlvt phuong tien cap phu hieus
	* @throws SystemException if a system exception occurred
	*/
	public static int countByNoiDungHoSoId(long NoiDungHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByNoiDungHoSoId(NoiDungHoSoId);
	}

	/**
	* Caches the qlvt phuong tien cap phu hieu in the entity cache if it is enabled.
	*
	* @param qlvtPhuongTienCapPhuHieu the qlvt phuong tien cap phu hieu
	*/
	public static void cacheResult(
		vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu qlvtPhuongTienCapPhuHieu) {
		getPersistence().cacheResult(qlvtPhuongTienCapPhuHieu);
	}

	/**
	* Caches the qlvt phuong tien cap phu hieus in the entity cache if it is enabled.
	*
	* @param qlvtPhuongTienCapPhuHieus the qlvt phuong tien cap phu hieus
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu> qlvtPhuongTienCapPhuHieus) {
		getPersistence().cacheResult(qlvtPhuongTienCapPhuHieus);
	}

	/**
	* Creates a new qlvt phuong tien cap phu hieu with the primary key. Does not add the qlvt phuong tien cap phu hieu to the database.
	*
	* @param id the primary key for the new qlvt phuong tien cap phu hieu
	* @return the new qlvt phuong tien cap phu hieu
	*/
	public static vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the qlvt phuong tien cap phu hieu with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt phuong tien cap phu hieu
	* @return the qlvt phuong tien cap phu hieu that was removed
	* @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienCapPhuHieuException if a qlvt phuong tien cap phu hieu with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienCapPhuHieuException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu updateImpl(
		vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu qlvtPhuongTienCapPhuHieu)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(qlvtPhuongTienCapPhuHieu);
	}

	/**
	* Returns the qlvt phuong tien cap phu hieu with the primary key or throws a {@link vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienCapPhuHieuException} if it could not be found.
	*
	* @param id the primary key of the qlvt phuong tien cap phu hieu
	* @return the qlvt phuong tien cap phu hieu
	* @throws vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienCapPhuHieuException if a qlvt phuong tien cap phu hieu with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchQlvtPhuongTienCapPhuHieuException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the qlvt phuong tien cap phu hieu with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the qlvt phuong tien cap phu hieu
	* @return the qlvt phuong tien cap phu hieu, or <code>null</code> if a qlvt phuong tien cap phu hieu with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the qlvt phuong tien cap phu hieus.
	*
	* @return the qlvt phuong tien cap phu hieus
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the qlvt phuong tien cap phu hieus.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienCapPhuHieuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt phuong tien cap phu hieus
	* @param end the upper bound of the range of qlvt phuong tien cap phu hieus (not inclusive)
	* @return the range of qlvt phuong tien cap phu hieus
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the qlvt phuong tien cap phu hieus.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.QlvtPhuongTienCapPhuHieuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt phuong tien cap phu hieus
	* @param end the upper bound of the range of qlvt phuong tien cap phu hieus (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of qlvt phuong tien cap phu hieus
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.QlvtPhuongTienCapPhuHieu> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the qlvt phuong tien cap phu hieus from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of qlvt phuong tien cap phu hieus.
	*
	* @return the number of qlvt phuong tien cap phu hieus
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static QlvtPhuongTienCapPhuHieuPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (QlvtPhuongTienCapPhuHieuPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.common.service.ClpSerializer.getServletContextName(),
					QlvtPhuongTienCapPhuHieuPersistence.class.getName());

			ReferenceRegistry.registerReference(QlvtPhuongTienCapPhuHieuUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(QlvtPhuongTienCapPhuHieuPersistence persistence) {
	}

	private static QlvtPhuongTienCapPhuHieuPersistence _persistence;
}