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

package vn.dtt.duongbien.dao.vrcb.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.duongbien.dao.vrcb.model.TempPassengerDetails;

import java.util.List;

/**
 * The persistence utility for the temp passenger details service. This utility wraps {@link TempPassengerDetailsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see TempPassengerDetailsPersistence
 * @see TempPassengerDetailsPersistenceImpl
 * @generated
 */
public class TempPassengerDetailsUtil {
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
	public static void clearCache(TempPassengerDetails tempPassengerDetails) {
		getPersistence().clearCache(tempPassengerDetails);
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
	public static List<TempPassengerDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TempPassengerDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TempPassengerDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static TempPassengerDetails update(
		TempPassengerDetails tempPassengerDetails) throws SystemException {
		return getPersistence().update(tempPassengerDetails);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static TempPassengerDetails update(
		TempPassengerDetails tempPassengerDetails, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(tempPassengerDetails, serviceContext);
	}

	/**
	* Returns all the temp passenger detailses where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @return the matching temp passenger detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempPassengerDetails> findByRequestCode(
		java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByRequestCode(requestCode);
	}

	/**
	* Returns a range of all the temp passenger detailses where requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempPassengerDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param requestCode the request code
	* @param start the lower bound of the range of temp passenger detailses
	* @param end the upper bound of the range of temp passenger detailses (not inclusive)
	* @return the range of matching temp passenger detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempPassengerDetails> findByRequestCode(
		java.lang.String requestCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByRequestCode(requestCode, start, end);
	}

	/**
	* Returns an ordered range of all the temp passenger detailses where requestCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempPassengerDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param requestCode the request code
	* @param start the lower bound of the range of temp passenger detailses
	* @param end the upper bound of the range of temp passenger detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching temp passenger detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempPassengerDetails> findByRequestCode(
		java.lang.String requestCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRequestCode(requestCode, start, end, orderByComparator);
	}

	/**
	* Returns the first temp passenger details in the ordered set where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp passenger details
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerDetailsException if a matching temp passenger details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempPassengerDetails findByRequestCode_First(
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerDetailsException {
		return getPersistence()
				   .findByRequestCode_First(requestCode, orderByComparator);
	}

	/**
	* Returns the first temp passenger details in the ordered set where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp passenger details, or <code>null</code> if a matching temp passenger details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempPassengerDetails fetchByRequestCode_First(
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRequestCode_First(requestCode, orderByComparator);
	}

	/**
	* Returns the last temp passenger details in the ordered set where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp passenger details
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerDetailsException if a matching temp passenger details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempPassengerDetails findByRequestCode_Last(
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerDetailsException {
		return getPersistence()
				   .findByRequestCode_Last(requestCode, orderByComparator);
	}

	/**
	* Returns the last temp passenger details in the ordered set where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp passenger details, or <code>null</code> if a matching temp passenger details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempPassengerDetails fetchByRequestCode_Last(
		java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRequestCode_Last(requestCode, orderByComparator);
	}

	/**
	* Returns the temp passenger detailses before and after the current temp passenger details in the ordered set where requestCode = &#63;.
	*
	* @param id the primary key of the current temp passenger details
	* @param requestCode the request code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next temp passenger details
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerDetailsException if a temp passenger details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempPassengerDetails[] findByRequestCode_PrevAndNext(
		long id, java.lang.String requestCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerDetailsException {
		return getPersistence()
				   .findByRequestCode_PrevAndNext(id, requestCode,
			orderByComparator);
	}

	/**
	* Removes all the temp passenger detailses where requestCode = &#63; from the database.
	*
	* @param requestCode the request code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByRequestCode(requestCode);
	}

	/**
	* Returns the number of temp passenger detailses where requestCode = &#63;.
	*
	* @param requestCode the request code
	* @return the number of matching temp passenger detailses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByRequestCode(java.lang.String requestCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByRequestCode(requestCode);
	}

	/**
	* Returns all the temp passenger detailses where passengerCode = &#63;.
	*
	* @param passengerCode the passenger code
	* @return the matching temp passenger detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempPassengerDetails> findByPassengerCode(
		java.lang.String passengerCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPassengerCode(passengerCode);
	}

	/**
	* Returns a range of all the temp passenger detailses where passengerCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempPassengerDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param passengerCode the passenger code
	* @param start the lower bound of the range of temp passenger detailses
	* @param end the upper bound of the range of temp passenger detailses (not inclusive)
	* @return the range of matching temp passenger detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempPassengerDetails> findByPassengerCode(
		java.lang.String passengerCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPassengerCode(passengerCode, start, end);
	}

	/**
	* Returns an ordered range of all the temp passenger detailses where passengerCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempPassengerDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param passengerCode the passenger code
	* @param start the lower bound of the range of temp passenger detailses
	* @param end the upper bound of the range of temp passenger detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching temp passenger detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempPassengerDetails> findByPassengerCode(
		java.lang.String passengerCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPassengerCode(passengerCode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first temp passenger details in the ordered set where passengerCode = &#63;.
	*
	* @param passengerCode the passenger code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp passenger details
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerDetailsException if a matching temp passenger details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempPassengerDetails findByPassengerCode_First(
		java.lang.String passengerCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerDetailsException {
		return getPersistence()
				   .findByPassengerCode_First(passengerCode, orderByComparator);
	}

	/**
	* Returns the first temp passenger details in the ordered set where passengerCode = &#63;.
	*
	* @param passengerCode the passenger code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching temp passenger details, or <code>null</code> if a matching temp passenger details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempPassengerDetails fetchByPassengerCode_First(
		java.lang.String passengerCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPassengerCode_First(passengerCode, orderByComparator);
	}

	/**
	* Returns the last temp passenger details in the ordered set where passengerCode = &#63;.
	*
	* @param passengerCode the passenger code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp passenger details
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerDetailsException if a matching temp passenger details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempPassengerDetails findByPassengerCode_Last(
		java.lang.String passengerCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerDetailsException {
		return getPersistence()
				   .findByPassengerCode_Last(passengerCode, orderByComparator);
	}

	/**
	* Returns the last temp passenger details in the ordered set where passengerCode = &#63;.
	*
	* @param passengerCode the passenger code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching temp passenger details, or <code>null</code> if a matching temp passenger details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempPassengerDetails fetchByPassengerCode_Last(
		java.lang.String passengerCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPassengerCode_Last(passengerCode, orderByComparator);
	}

	/**
	* Returns the temp passenger detailses before and after the current temp passenger details in the ordered set where passengerCode = &#63;.
	*
	* @param id the primary key of the current temp passenger details
	* @param passengerCode the passenger code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next temp passenger details
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerDetailsException if a temp passenger details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempPassengerDetails[] findByPassengerCode_PrevAndNext(
		long id, java.lang.String passengerCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerDetailsException {
		return getPersistence()
				   .findByPassengerCode_PrevAndNext(id, passengerCode,
			orderByComparator);
	}

	/**
	* Removes all the temp passenger detailses where passengerCode = &#63; from the database.
	*
	* @param passengerCode the passenger code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPassengerCode(java.lang.String passengerCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPassengerCode(passengerCode);
	}

	/**
	* Returns the number of temp passenger detailses where passengerCode = &#63;.
	*
	* @param passengerCode the passenger code
	* @return the number of matching temp passenger detailses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPassengerCode(java.lang.String passengerCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPassengerCode(passengerCode);
	}

	/**
	* Caches the temp passenger details in the entity cache if it is enabled.
	*
	* @param tempPassengerDetails the temp passenger details
	*/
	public static void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.TempPassengerDetails tempPassengerDetails) {
		getPersistence().cacheResult(tempPassengerDetails);
	}

	/**
	* Caches the temp passenger detailses in the entity cache if it is enabled.
	*
	* @param tempPassengerDetailses the temp passenger detailses
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempPassengerDetails> tempPassengerDetailses) {
		getPersistence().cacheResult(tempPassengerDetailses);
	}

	/**
	* Creates a new temp passenger details with the primary key. Does not add the temp passenger details to the database.
	*
	* @param id the primary key for the new temp passenger details
	* @return the new temp passenger details
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempPassengerDetails create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the temp passenger details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp passenger details
	* @return the temp passenger details that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerDetailsException if a temp passenger details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempPassengerDetails remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerDetailsException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbien.dao.vrcb.model.TempPassengerDetails updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.TempPassengerDetails tempPassengerDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tempPassengerDetails);
	}

	/**
	* Returns the temp passenger details with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerDetailsException} if it could not be found.
	*
	* @param id the primary key of the temp passenger details
	* @return the temp passenger details
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerDetailsException if a temp passenger details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempPassengerDetails findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchTempPassengerDetailsException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the temp passenger details with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the temp passenger details
	* @return the temp passenger details, or <code>null</code> if a temp passenger details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.TempPassengerDetails fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the temp passenger detailses.
	*
	* @return the temp passenger detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempPassengerDetails> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the temp passenger detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempPassengerDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of temp passenger detailses
	* @param end the upper bound of the range of temp passenger detailses (not inclusive)
	* @return the range of temp passenger detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempPassengerDetails> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the temp passenger detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempPassengerDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of temp passenger detailses
	* @param end the upper bound of the range of temp passenger detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of temp passenger detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempPassengerDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the temp passenger detailses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of temp passenger detailses.
	*
	* @return the number of temp passenger detailses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TempPassengerDetailsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TempPassengerDetailsPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.getServletContextName(),
					TempPassengerDetailsPersistence.class.getName());

			ReferenceRegistry.registerReference(TempPassengerDetailsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(TempPassengerDetailsPersistence persistence) {
	}

	private static TempPassengerDetailsPersistence _persistence;
}