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

import vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra;

import java.util.List;

/**
 * The persistence utility for the qlvt noi dung tham tra service. This utility wraps {@link QlvtNoiDungThamTraPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanNc
 * @see QlvtNoiDungThamTraPersistence
 * @see QlvtNoiDungThamTraPersistenceImpl
 * @generated
 */
public class QlvtNoiDungThamTraUtil {
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
	public static void clearCache(QlvtNoiDungThamTra qlvtNoiDungThamTra) {
		getPersistence().clearCache(qlvtNoiDungThamTra);
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
	public static List<QlvtNoiDungThamTra> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QlvtNoiDungThamTra> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QlvtNoiDungThamTra> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static QlvtNoiDungThamTra update(
		QlvtNoiDungThamTra qlvtNoiDungThamTra) throws SystemException {
		return getPersistence().update(qlvtNoiDungThamTra);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static QlvtNoiDungThamTra update(
		QlvtNoiDungThamTra qlvtNoiDungThamTra, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(qlvtNoiDungThamTra, serviceContext);
	}

	/**
	* Returns all the qlvt noi dung tham tras where tthcNoiDungThamTraId = &#63;.
	*
	* @param tthcNoiDungThamTraId the tthc noi dung tham tra ID
	* @return the matching qlvt noi dung tham tras
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra> findByF_tthcNoiDungThamTraId(
		int tthcNoiDungThamTraId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByF_tthcNoiDungThamTraId(tthcNoiDungThamTraId);
	}

	/**
	* Returns a range of all the qlvt noi dung tham tras where tthcNoiDungThamTraId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtNoiDungThamTraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tthcNoiDungThamTraId the tthc noi dung tham tra ID
	* @param start the lower bound of the range of qlvt noi dung tham tras
	* @param end the upper bound of the range of qlvt noi dung tham tras (not inclusive)
	* @return the range of matching qlvt noi dung tham tras
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra> findByF_tthcNoiDungThamTraId(
		int tthcNoiDungThamTraId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByF_tthcNoiDungThamTraId(tthcNoiDungThamTraId, start,
			end);
	}

	/**
	* Returns an ordered range of all the qlvt noi dung tham tras where tthcNoiDungThamTraId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtNoiDungThamTraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tthcNoiDungThamTraId the tthc noi dung tham tra ID
	* @param start the lower bound of the range of qlvt noi dung tham tras
	* @param end the upper bound of the range of qlvt noi dung tham tras (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching qlvt noi dung tham tras
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra> findByF_tthcNoiDungThamTraId(
		int tthcNoiDungThamTraId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByF_tthcNoiDungThamTraId(tthcNoiDungThamTraId, start,
			end, orderByComparator);
	}

	/**
	* Returns the first qlvt noi dung tham tra in the ordered set where tthcNoiDungThamTraId = &#63;.
	*
	* @param tthcNoiDungThamTraId the tthc noi dung tham tra ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching qlvt noi dung tham tra
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtNoiDungThamTraException if a matching qlvt noi dung tham tra could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra findByF_tthcNoiDungThamTraId_First(
		int tthcNoiDungThamTraId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtNoiDungThamTraException {
		return getPersistence()
				   .findByF_tthcNoiDungThamTraId_First(tthcNoiDungThamTraId,
			orderByComparator);
	}

	/**
	* Returns the first qlvt noi dung tham tra in the ordered set where tthcNoiDungThamTraId = &#63;.
	*
	* @param tthcNoiDungThamTraId the tthc noi dung tham tra ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching qlvt noi dung tham tra, or <code>null</code> if a matching qlvt noi dung tham tra could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra fetchByF_tthcNoiDungThamTraId_First(
		int tthcNoiDungThamTraId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByF_tthcNoiDungThamTraId_First(tthcNoiDungThamTraId,
			orderByComparator);
	}

	/**
	* Returns the last qlvt noi dung tham tra in the ordered set where tthcNoiDungThamTraId = &#63;.
	*
	* @param tthcNoiDungThamTraId the tthc noi dung tham tra ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching qlvt noi dung tham tra
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtNoiDungThamTraException if a matching qlvt noi dung tham tra could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra findByF_tthcNoiDungThamTraId_Last(
		int tthcNoiDungThamTraId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtNoiDungThamTraException {
		return getPersistence()
				   .findByF_tthcNoiDungThamTraId_Last(tthcNoiDungThamTraId,
			orderByComparator);
	}

	/**
	* Returns the last qlvt noi dung tham tra in the ordered set where tthcNoiDungThamTraId = &#63;.
	*
	* @param tthcNoiDungThamTraId the tthc noi dung tham tra ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching qlvt noi dung tham tra, or <code>null</code> if a matching qlvt noi dung tham tra could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra fetchByF_tthcNoiDungThamTraId_Last(
		int tthcNoiDungThamTraId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByF_tthcNoiDungThamTraId_Last(tthcNoiDungThamTraId,
			orderByComparator);
	}

	/**
	* Returns the qlvt noi dung tham tras before and after the current qlvt noi dung tham tra in the ordered set where tthcNoiDungThamTraId = &#63;.
	*
	* @param id the primary key of the current qlvt noi dung tham tra
	* @param tthcNoiDungThamTraId the tthc noi dung tham tra ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next qlvt noi dung tham tra
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtNoiDungThamTraException if a qlvt noi dung tham tra with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra[] findByF_tthcNoiDungThamTraId_PrevAndNext(
		long id, int tthcNoiDungThamTraId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtNoiDungThamTraException {
		return getPersistence()
				   .findByF_tthcNoiDungThamTraId_PrevAndNext(id,
			tthcNoiDungThamTraId, orderByComparator);
	}

	/**
	* Removes all the qlvt noi dung tham tras where tthcNoiDungThamTraId = &#63; from the database.
	*
	* @param tthcNoiDungThamTraId the tthc noi dung tham tra ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByF_tthcNoiDungThamTraId(int tthcNoiDungThamTraId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByF_tthcNoiDungThamTraId(tthcNoiDungThamTraId);
	}

	/**
	* Returns the number of qlvt noi dung tham tras where tthcNoiDungThamTraId = &#63;.
	*
	* @param tthcNoiDungThamTraId the tthc noi dung tham tra ID
	* @return the number of matching qlvt noi dung tham tras
	* @throws SystemException if a system exception occurred
	*/
	public static int countByF_tthcNoiDungThamTraId(int tthcNoiDungThamTraId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByF_tthcNoiDungThamTraId(tthcNoiDungThamTraId);
	}

	/**
	* Caches the qlvt noi dung tham tra in the entity cache if it is enabled.
	*
	* @param qlvtNoiDungThamTra the qlvt noi dung tham tra
	*/
	public static void cacheResult(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra qlvtNoiDungThamTra) {
		getPersistence().cacheResult(qlvtNoiDungThamTra);
	}

	/**
	* Caches the qlvt noi dung tham tras in the entity cache if it is enabled.
	*
	* @param qlvtNoiDungThamTras the qlvt noi dung tham tras
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra> qlvtNoiDungThamTras) {
		getPersistence().cacheResult(qlvtNoiDungThamTras);
	}

	/**
	* Creates a new qlvt noi dung tham tra with the primary key. Does not add the qlvt noi dung tham tra to the database.
	*
	* @param id the primary key for the new qlvt noi dung tham tra
	* @return the new qlvt noi dung tham tra
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the qlvt noi dung tham tra with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt noi dung tham tra
	* @return the qlvt noi dung tham tra that was removed
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtNoiDungThamTraException if a qlvt noi dung tham tra with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtNoiDungThamTraException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra updateImpl(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra qlvtNoiDungThamTra)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(qlvtNoiDungThamTra);
	}

	/**
	* Returns the qlvt noi dung tham tra with the primary key or throws a {@link vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtNoiDungThamTraException} if it could not be found.
	*
	* @param id the primary key of the qlvt noi dung tham tra
	* @return the qlvt noi dung tham tra
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtNoiDungThamTraException if a qlvt noi dung tham tra with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtNoiDungThamTraException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the qlvt noi dung tham tra with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the qlvt noi dung tham tra
	* @return the qlvt noi dung tham tra, or <code>null</code> if a qlvt noi dung tham tra with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the qlvt noi dung tham tras.
	*
	* @return the qlvt noi dung tham tras
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the qlvt noi dung tham tras.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtNoiDungThamTraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt noi dung tham tras
	* @param end the upper bound of the range of qlvt noi dung tham tras (not inclusive)
	* @return the range of qlvt noi dung tham tras
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the qlvt noi dung tham tras.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtNoiDungThamTraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt noi dung tham tras
	* @param end the upper bound of the range of qlvt noi dung tham tras (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of qlvt noi dung tham tras
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtNoiDungThamTra> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the qlvt noi dung tham tras from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of qlvt noi dung tham tras.
	*
	* @return the number of qlvt noi dung tham tras
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static QlvtNoiDungThamTraPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (QlvtNoiDungThamTraPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					QlvtNoiDungThamTraPersistence.class.getName());

			ReferenceRegistry.registerReference(QlvtNoiDungThamTraUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(QlvtNoiDungThamTraPersistence persistence) {
	}

	private static QlvtNoiDungThamTraPersistence _persistence;
}