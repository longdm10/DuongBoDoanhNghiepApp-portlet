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

import vn.dtt.duongbo.dao.common.model.DmDataItem;

import java.util.List;

/**
 * The persistence utility for the dm data item service. This utility wraps {@link DmDataItemPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmDataItemPersistence
 * @see DmDataItemPersistenceImpl
 * @generated
 */
public class DmDataItemUtil {
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
	public static void clearCache(DmDataItem dmDataItem) {
		getPersistence().clearCache(dmDataItem);
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
	public static List<DmDataItem> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmDataItem> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmDataItem> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DmDataItem update(DmDataItem dmDataItem)
		throws SystemException {
		return getPersistence().update(dmDataItem);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DmDataItem update(DmDataItem dmDataItem,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dmDataItem, serviceContext);
	}

	/**
	* Returns all the dm data items where dataGroupId = &#63; and level = &#63;.
	*
	* @param dataGroupId the data group ID
	* @param level the level
	* @return the matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByDataGroupIdAndLevel(
		long dataGroupId, int level)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDataGroupIdAndLevel(dataGroupId, level);
	}

	/**
	* Returns a range of all the dm data items where dataGroupId = &#63; and level = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dataGroupId the data group ID
	* @param level the level
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @return the range of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByDataGroupIdAndLevel(
		long dataGroupId, int level, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDataGroupIdAndLevel(dataGroupId, level, start, end);
	}

	/**
	* Returns an ordered range of all the dm data items where dataGroupId = &#63; and level = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dataGroupId the data group ID
	* @param level the level
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByDataGroupIdAndLevel(
		long dataGroupId, int level, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDataGroupIdAndLevel(dataGroupId, level, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dm data item in the ordered set where dataGroupId = &#63; and level = &#63;.
	*
	* @param dataGroupId the data group ID
	* @param level the level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm data item
	* @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem findByDataGroupIdAndLevel_First(
		long dataGroupId, int level,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException {
		return getPersistence()
				   .findByDataGroupIdAndLevel_First(dataGroupId, level,
			orderByComparator);
	}

	/**
	* Returns the first dm data item in the ordered set where dataGroupId = &#63; and level = &#63;.
	*
	* @param dataGroupId the data group ID
	* @param level the level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem fetchByDataGroupIdAndLevel_First(
		long dataGroupId, int level,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDataGroupIdAndLevel_First(dataGroupId, level,
			orderByComparator);
	}

	/**
	* Returns the last dm data item in the ordered set where dataGroupId = &#63; and level = &#63;.
	*
	* @param dataGroupId the data group ID
	* @param level the level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm data item
	* @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem findByDataGroupIdAndLevel_Last(
		long dataGroupId, int level,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException {
		return getPersistence()
				   .findByDataGroupIdAndLevel_Last(dataGroupId, level,
			orderByComparator);
	}

	/**
	* Returns the last dm data item in the ordered set where dataGroupId = &#63; and level = &#63;.
	*
	* @param dataGroupId the data group ID
	* @param level the level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem fetchByDataGroupIdAndLevel_Last(
		long dataGroupId, int level,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDataGroupIdAndLevel_Last(dataGroupId, level,
			orderByComparator);
	}

	/**
	* Returns the dm data items before and after the current dm data item in the ordered set where dataGroupId = &#63; and level = &#63;.
	*
	* @param id the primary key of the current dm data item
	* @param dataGroupId the data group ID
	* @param level the level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm data item
	* @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem[] findByDataGroupIdAndLevel_PrevAndNext(
		long id, long dataGroupId, int level,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException {
		return getPersistence()
				   .findByDataGroupIdAndLevel_PrevAndNext(id, dataGroupId,
			level, orderByComparator);
	}

	/**
	* Removes all the dm data items where dataGroupId = &#63; and level = &#63; from the database.
	*
	* @param dataGroupId the data group ID
	* @param level the level
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDataGroupIdAndLevel(long dataGroupId, int level)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDataGroupIdAndLevel(dataGroupId, level);
	}

	/**
	* Returns the number of dm data items where dataGroupId = &#63; and level = &#63;.
	*
	* @param dataGroupId the data group ID
	* @param level the level
	* @return the number of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDataGroupIdAndLevel(long dataGroupId, int level)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDataGroupIdAndLevel(dataGroupId, level);
	}

	/**
	* Returns the dm data item where dataGroupId = &#63; and code = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchDmDataItemException} if it could not be found.
	*
	* @param dataGroupId the data group ID
	* @param code the code
	* @return the matching dm data item
	* @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem findByDataGroupIdAndCode(
		long dataGroupId, java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException {
		return getPersistence().findByDataGroupIdAndCode(dataGroupId, code);
	}

	/**
	* Returns the dm data item where dataGroupId = &#63; and code = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param dataGroupId the data group ID
	* @param code the code
	* @return the matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem fetchByDataGroupIdAndCode(
		long dataGroupId, java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByDataGroupIdAndCode(dataGroupId, code);
	}

	/**
	* Returns the dm data item where dataGroupId = &#63; and code = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param dataGroupId the data group ID
	* @param code the code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem fetchByDataGroupIdAndCode(
		long dataGroupId, java.lang.String code, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDataGroupIdAndCode(dataGroupId, code,
			retrieveFromCache);
	}

	/**
	* Removes the dm data item where dataGroupId = &#63; and code = &#63; from the database.
	*
	* @param dataGroupId the data group ID
	* @param code the code
	* @return the dm data item that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem removeByDataGroupIdAndCode(
		long dataGroupId, java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException {
		return getPersistence().removeByDataGroupIdAndCode(dataGroupId, code);
	}

	/**
	* Returns the number of dm data items where dataGroupId = &#63; and code = &#63;.
	*
	* @param dataGroupId the data group ID
	* @param code the code
	* @return the number of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDataGroupIdAndCode(long dataGroupId,
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDataGroupIdAndCode(dataGroupId, code);
	}

	/**
	* Returns the dm data item where dataGroupId = &#63; and code = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchDmDataItemException} if it could not be found.
	*
	* @param dataGroupId the data group ID
	* @param code the code
	* @return the matching dm data item
	* @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem findByDataGroupIdAndCodeStatus(
		long dataGroupId, java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException {
		return getPersistence().findByDataGroupIdAndCodeStatus(dataGroupId, code);
	}

	/**
	* Returns the dm data item where dataGroupId = &#63; and code = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param dataGroupId the data group ID
	* @param code the code
	* @return the matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem fetchByDataGroupIdAndCodeStatus(
		long dataGroupId, java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDataGroupIdAndCodeStatus(dataGroupId, code);
	}

	/**
	* Returns the dm data item where dataGroupId = &#63; and code = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param dataGroupId the data group ID
	* @param code the code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem fetchByDataGroupIdAndCodeStatus(
		long dataGroupId, java.lang.String code, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDataGroupIdAndCodeStatus(dataGroupId, code,
			retrieveFromCache);
	}

	/**
	* Removes the dm data item where dataGroupId = &#63; and code = &#63; from the database.
	*
	* @param dataGroupId the data group ID
	* @param code the code
	* @return the dm data item that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem removeByDataGroupIdAndCodeStatus(
		long dataGroupId, java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException {
		return getPersistence()
				   .removeByDataGroupIdAndCodeStatus(dataGroupId, code);
	}

	/**
	* Returns the number of dm data items where dataGroupId = &#63; and code = &#63;.
	*
	* @param dataGroupId the data group ID
	* @param code the code
	* @return the number of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDataGroupIdAndCodeStatus(long dataGroupId,
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDataGroupIdAndCodeStatus(dataGroupId, code);
	}

	/**
	* Returns all the dm data items where code = &#63; and status = &#63;.
	*
	* @param code the code
	* @param status the status
	* @return the matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByCodeAndStatus(
		java.lang.String code, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCodeAndStatus(code, status);
	}

	/**
	* Returns a range of all the dm data items where code = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param code the code
	* @param status the status
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @return the range of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByCodeAndStatus(
		java.lang.String code, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCodeAndStatus(code, status, start, end);
	}

	/**
	* Returns an ordered range of all the dm data items where code = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param code the code
	* @param status the status
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByCodeAndStatus(
		java.lang.String code, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCodeAndStatus(code, status, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dm data item in the ordered set where code = &#63; and status = &#63;.
	*
	* @param code the code
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm data item
	* @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem findByCodeAndStatus_First(
		java.lang.String code, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException {
		return getPersistence()
				   .findByCodeAndStatus_First(code, status, orderByComparator);
	}

	/**
	* Returns the first dm data item in the ordered set where code = &#63; and status = &#63;.
	*
	* @param code the code
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem fetchByCodeAndStatus_First(
		java.lang.String code, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCodeAndStatus_First(code, status, orderByComparator);
	}

	/**
	* Returns the last dm data item in the ordered set where code = &#63; and status = &#63;.
	*
	* @param code the code
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm data item
	* @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem findByCodeAndStatus_Last(
		java.lang.String code, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException {
		return getPersistence()
				   .findByCodeAndStatus_Last(code, status, orderByComparator);
	}

	/**
	* Returns the last dm data item in the ordered set where code = &#63; and status = &#63;.
	*
	* @param code the code
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem fetchByCodeAndStatus_Last(
		java.lang.String code, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCodeAndStatus_Last(code, status, orderByComparator);
	}

	/**
	* Returns the dm data items before and after the current dm data item in the ordered set where code = &#63; and status = &#63;.
	*
	* @param id the primary key of the current dm data item
	* @param code the code
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm data item
	* @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem[] findByCodeAndStatus_PrevAndNext(
		long id, java.lang.String code, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException {
		return getPersistence()
				   .findByCodeAndStatus_PrevAndNext(id, code, status,
			orderByComparator);
	}

	/**
	* Removes all the dm data items where code = &#63; and status = &#63; from the database.
	*
	* @param code the code
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCodeAndStatus(java.lang.String code, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCodeAndStatus(code, status);
	}

	/**
	* Returns the number of dm data items where code = &#63; and status = &#63;.
	*
	* @param code the code
	* @param status the status
	* @return the number of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCodeAndStatus(java.lang.String code, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCodeAndStatus(code, status);
	}

	/**
	* Returns all the dm data items where dataGroupId = &#63; and status = &#63;.
	*
	* @param dataGroupId the data group ID
	* @param status the status
	* @return the matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findBydataGroupId(
		long dataGroupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBydataGroupId(dataGroupId, status);
	}

	/**
	* Returns a range of all the dm data items where dataGroupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dataGroupId the data group ID
	* @param status the status
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @return the range of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findBydataGroupId(
		long dataGroupId, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBydataGroupId(dataGroupId, status, start, end);
	}

	/**
	* Returns an ordered range of all the dm data items where dataGroupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dataGroupId the data group ID
	* @param status the status
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findBydataGroupId(
		long dataGroupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBydataGroupId(dataGroupId, status, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dm data item in the ordered set where dataGroupId = &#63; and status = &#63;.
	*
	* @param dataGroupId the data group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm data item
	* @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem findBydataGroupId_First(
		long dataGroupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException {
		return getPersistence()
				   .findBydataGroupId_First(dataGroupId, status,
			orderByComparator);
	}

	/**
	* Returns the first dm data item in the ordered set where dataGroupId = &#63; and status = &#63;.
	*
	* @param dataGroupId the data group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem fetchBydataGroupId_First(
		long dataGroupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBydataGroupId_First(dataGroupId, status,
			orderByComparator);
	}

	/**
	* Returns the last dm data item in the ordered set where dataGroupId = &#63; and status = &#63;.
	*
	* @param dataGroupId the data group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm data item
	* @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem findBydataGroupId_Last(
		long dataGroupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException {
		return getPersistence()
				   .findBydataGroupId_Last(dataGroupId, status,
			orderByComparator);
	}

	/**
	* Returns the last dm data item in the ordered set where dataGroupId = &#63; and status = &#63;.
	*
	* @param dataGroupId the data group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem fetchBydataGroupId_Last(
		long dataGroupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBydataGroupId_Last(dataGroupId, status,
			orderByComparator);
	}

	/**
	* Returns the dm data items before and after the current dm data item in the ordered set where dataGroupId = &#63; and status = &#63;.
	*
	* @param id the primary key of the current dm data item
	* @param dataGroupId the data group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm data item
	* @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem[] findBydataGroupId_PrevAndNext(
		long id, long dataGroupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException {
		return getPersistence()
				   .findBydataGroupId_PrevAndNext(id, dataGroupId, status,
			orderByComparator);
	}

	/**
	* Removes all the dm data items where dataGroupId = &#63; and status = &#63; from the database.
	*
	* @param dataGroupId the data group ID
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBydataGroupId(long dataGroupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBydataGroupId(dataGroupId, status);
	}

	/**
	* Returns the number of dm data items where dataGroupId = &#63; and status = &#63;.
	*
	* @param dataGroupId the data group ID
	* @param status the status
	* @return the number of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static int countBydataGroupId(long dataGroupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBydataGroupId(dataGroupId, status);
	}

	/**
	* Returns the dm data item where code = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchDmDataItemException} if it could not be found.
	*
	* @param code the code
	* @return the matching dm data item
	* @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem findByCode(
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException {
		return getPersistence().findByCode(code);
	}

	/**
	* Returns the dm data item where code = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param code the code
	* @return the matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem fetchByCode(
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCode(code);
	}

	/**
	* Returns the dm data item where code = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param code the code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem fetchByCode(
		java.lang.String code, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCode(code, retrieveFromCache);
	}

	/**
	* Removes the dm data item where code = &#63; from the database.
	*
	* @param code the code
	* @return the dm data item that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem removeByCode(
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException {
		return getPersistence().removeByCode(code);
	}

	/**
	* Returns the number of dm data items where code = &#63;.
	*
	* @param code the code
	* @return the number of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCode(java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCode(code);
	}

	/**
	* Returns the dm data item where code = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchDmDataItemException} if it could not be found.
	*
	* @param code the code
	* @return the matching dm data item
	* @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem findByCodeAndNoStatus(
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException {
		return getPersistence().findByCodeAndNoStatus(code);
	}

	/**
	* Returns the dm data item where code = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param code the code
	* @return the matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem fetchByCodeAndNoStatus(
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCodeAndNoStatus(code);
	}

	/**
	* Returns the dm data item where code = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param code the code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem fetchByCodeAndNoStatus(
		java.lang.String code, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCodeAndNoStatus(code, retrieveFromCache);
	}

	/**
	* Removes the dm data item where code = &#63; from the database.
	*
	* @param code the code
	* @return the dm data item that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem removeByCodeAndNoStatus(
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException {
		return getPersistence().removeByCodeAndNoStatus(code);
	}

	/**
	* Returns the number of dm data items where code = &#63;.
	*
	* @param code the code
	* @return the number of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCodeAndNoStatus(java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCodeAndNoStatus(code);
	}

	/**
	* Returns all the dm data items where code = &#63; and level = &#63; and status = &#63;.
	*
	* @param code the code
	* @param level the level
	* @param status the status
	* @return the matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByCodeAndLevel(
		java.lang.String code, int level, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCodeAndLevel(code, level, status);
	}

	/**
	* Returns a range of all the dm data items where code = &#63; and level = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param code the code
	* @param level the level
	* @param status the status
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @return the range of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByCodeAndLevel(
		java.lang.String code, int level, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCodeAndLevel(code, level, status, start, end);
	}

	/**
	* Returns an ordered range of all the dm data items where code = &#63; and level = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param code the code
	* @param level the level
	* @param status the status
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByCodeAndLevel(
		java.lang.String code, int level, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCodeAndLevel(code, level, status, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dm data item in the ordered set where code = &#63; and level = &#63; and status = &#63;.
	*
	* @param code the code
	* @param level the level
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm data item
	* @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem findByCodeAndLevel_First(
		java.lang.String code, int level, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException {
		return getPersistence()
				   .findByCodeAndLevel_First(code, level, status,
			orderByComparator);
	}

	/**
	* Returns the first dm data item in the ordered set where code = &#63; and level = &#63; and status = &#63;.
	*
	* @param code the code
	* @param level the level
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem fetchByCodeAndLevel_First(
		java.lang.String code, int level, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCodeAndLevel_First(code, level, status,
			orderByComparator);
	}

	/**
	* Returns the last dm data item in the ordered set where code = &#63; and level = &#63; and status = &#63;.
	*
	* @param code the code
	* @param level the level
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm data item
	* @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem findByCodeAndLevel_Last(
		java.lang.String code, int level, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException {
		return getPersistence()
				   .findByCodeAndLevel_Last(code, level, status,
			orderByComparator);
	}

	/**
	* Returns the last dm data item in the ordered set where code = &#63; and level = &#63; and status = &#63;.
	*
	* @param code the code
	* @param level the level
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem fetchByCodeAndLevel_Last(
		java.lang.String code, int level, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCodeAndLevel_Last(code, level, status,
			orderByComparator);
	}

	/**
	* Returns the dm data items before and after the current dm data item in the ordered set where code = &#63; and level = &#63; and status = &#63;.
	*
	* @param id the primary key of the current dm data item
	* @param code the code
	* @param level the level
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm data item
	* @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem[] findByCodeAndLevel_PrevAndNext(
		long id, java.lang.String code, int level, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException {
		return getPersistence()
				   .findByCodeAndLevel_PrevAndNext(id, code, level, status,
			orderByComparator);
	}

	/**
	* Removes all the dm data items where code = &#63; and level = &#63; and status = &#63; from the database.
	*
	* @param code the code
	* @param level the level
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCodeAndLevel(java.lang.String code, int level,
		int status) throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCodeAndLevel(code, level, status);
	}

	/**
	* Returns the number of dm data items where code = &#63; and level = &#63; and status = &#63;.
	*
	* @param code the code
	* @param level the level
	* @param status the status
	* @return the number of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCodeAndLevel(java.lang.String code, int level,
		int status) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCodeAndLevel(code, level, status);
	}

	/**
	* Returns all the dm data items where code = &#63; and node1 = &#63; and status = &#63;.
	*
	* @param code the code
	* @param node1 the node1
	* @param status the status
	* @return the matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByCodeAndNode1(
		java.lang.String code, java.lang.String node1, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCodeAndNode1(code, node1, status);
	}

	/**
	* Returns a range of all the dm data items where code = &#63; and node1 = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param code the code
	* @param node1 the node1
	* @param status the status
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @return the range of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByCodeAndNode1(
		java.lang.String code, java.lang.String node1, int status, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCodeAndNode1(code, node1, status, start, end);
	}

	/**
	* Returns an ordered range of all the dm data items where code = &#63; and node1 = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param code the code
	* @param node1 the node1
	* @param status the status
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByCodeAndNode1(
		java.lang.String code, java.lang.String node1, int status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCodeAndNode1(code, node1, status, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dm data item in the ordered set where code = &#63; and node1 = &#63; and status = &#63;.
	*
	* @param code the code
	* @param node1 the node1
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm data item
	* @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem findByCodeAndNode1_First(
		java.lang.String code, java.lang.String node1, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException {
		return getPersistence()
				   .findByCodeAndNode1_First(code, node1, status,
			orderByComparator);
	}

	/**
	* Returns the first dm data item in the ordered set where code = &#63; and node1 = &#63; and status = &#63;.
	*
	* @param code the code
	* @param node1 the node1
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem fetchByCodeAndNode1_First(
		java.lang.String code, java.lang.String node1, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCodeAndNode1_First(code, node1, status,
			orderByComparator);
	}

	/**
	* Returns the last dm data item in the ordered set where code = &#63; and node1 = &#63; and status = &#63;.
	*
	* @param code the code
	* @param node1 the node1
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm data item
	* @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem findByCodeAndNode1_Last(
		java.lang.String code, java.lang.String node1, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException {
		return getPersistence()
				   .findByCodeAndNode1_Last(code, node1, status,
			orderByComparator);
	}

	/**
	* Returns the last dm data item in the ordered set where code = &#63; and node1 = &#63; and status = &#63;.
	*
	* @param code the code
	* @param node1 the node1
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem fetchByCodeAndNode1_Last(
		java.lang.String code, java.lang.String node1, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCodeAndNode1_Last(code, node1, status,
			orderByComparator);
	}

	/**
	* Returns the dm data items before and after the current dm data item in the ordered set where code = &#63; and node1 = &#63; and status = &#63;.
	*
	* @param id the primary key of the current dm data item
	* @param code the code
	* @param node1 the node1
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm data item
	* @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem[] findByCodeAndNode1_PrevAndNext(
		long id, java.lang.String code, java.lang.String node1, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException {
		return getPersistence()
				   .findByCodeAndNode1_PrevAndNext(id, code, node1, status,
			orderByComparator);
	}

	/**
	* Removes all the dm data items where code = &#63; and node1 = &#63; and status = &#63; from the database.
	*
	* @param code the code
	* @param node1 the node1
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCodeAndNode1(java.lang.String code,
		java.lang.String node1, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCodeAndNode1(code, node1, status);
	}

	/**
	* Returns the number of dm data items where code = &#63; and node1 = &#63; and status = &#63;.
	*
	* @param code the code
	* @param node1 the node1
	* @param status the status
	* @return the number of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCodeAndNode1(java.lang.String code,
		java.lang.String node1, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCodeAndNode1(code, node1, status);
	}

	/**
	* Caches the dm data item in the entity cache if it is enabled.
	*
	* @param dmDataItem the dm data item
	*/
	public static void cacheResult(
		vn.dtt.duongbo.dao.common.model.DmDataItem dmDataItem) {
		getPersistence().cacheResult(dmDataItem);
	}

	/**
	* Caches the dm data items in the entity cache if it is enabled.
	*
	* @param dmDataItems the dm data items
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> dmDataItems) {
		getPersistence().cacheResult(dmDataItems);
	}

	/**
	* Creates a new dm data item with the primary key. Does not add the dm data item to the database.
	*
	* @param id the primary key for the new dm data item
	* @return the new dm data item
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm data item with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm data item
	* @return the dm data item that was removed
	* @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbo.dao.common.model.DmDataItem updateImpl(
		vn.dtt.duongbo.dao.common.model.DmDataItem dmDataItem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmDataItem);
	}

	/**
	* Returns the dm data item with the primary key or throws a {@link vn.dtt.duongbo.dao.common.NoSuchDmDataItemException} if it could not be found.
	*
	* @param id the primary key of the dm data item
	* @return the dm data item
	* @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm data item with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm data item
	* @return the dm data item, or <code>null</code> if a dm data item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.common.model.DmDataItem fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the dm data items.
	*
	* @return the dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dm data items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @return the range of dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dm data items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm data items from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm data items.
	*
	* @return the number of dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmDataItemPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmDataItemPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.common.service.ClpSerializer.getServletContextName(),
					DmDataItemPersistence.class.getName());

			ReferenceRegistry.registerReference(DmDataItemUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DmDataItemPersistence persistence) {
	}

	private static DmDataItemPersistence _persistence;
}