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

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.duongbo.dao.common.model.DmDataItem;

/**
 * The persistence interface for the dm data item service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmDataItemPersistenceImpl
 * @see DmDataItemUtil
 * @generated
 */
public interface DmDataItemPersistence extends BasePersistence<DmDataItem> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmDataItemUtil} to access the dm data item persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the dm data items where dataGroupId = &#63; and level = &#63;.
	*
	* @param dataGroupId the data group ID
	* @param level the level
	* @return the matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByDataGroupIdAndLevel(
		long dataGroupId, int level)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByDataGroupIdAndLevel(
		long dataGroupId, int level, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByDataGroupIdAndLevel(
		long dataGroupId, int level, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.duongbo.dao.common.model.DmDataItem findByDataGroupIdAndLevel_First(
		long dataGroupId, int level,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException;

	/**
	* Returns the first dm data item in the ordered set where dataGroupId = &#63; and level = &#63;.
	*
	* @param dataGroupId the data group ID
	* @param level the level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.DmDataItem fetchByDataGroupIdAndLevel_First(
		long dataGroupId, int level,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.duongbo.dao.common.model.DmDataItem findByDataGroupIdAndLevel_Last(
		long dataGroupId, int level,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException;

	/**
	* Returns the last dm data item in the ordered set where dataGroupId = &#63; and level = &#63;.
	*
	* @param dataGroupId the data group ID
	* @param level the level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.DmDataItem fetchByDataGroupIdAndLevel_Last(
		long dataGroupId, int level,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.duongbo.dao.common.model.DmDataItem[] findByDataGroupIdAndLevel_PrevAndNext(
		long id, long dataGroupId, int level,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException;

	/**
	* Removes all the dm data items where dataGroupId = &#63; and level = &#63; from the database.
	*
	* @param dataGroupId the data group ID
	* @param level the level
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDataGroupIdAndLevel(long dataGroupId, int level)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm data items where dataGroupId = &#63; and level = &#63;.
	*
	* @param dataGroupId the data group ID
	* @param level the level
	* @return the number of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public int countByDataGroupIdAndLevel(long dataGroupId, int level)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm data item where dataGroupId = &#63; and code = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchDmDataItemException} if it could not be found.
	*
	* @param dataGroupId the data group ID
	* @param code the code
	* @return the matching dm data item
	* @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.DmDataItem findByDataGroupIdAndCode(
		long dataGroupId, java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException;

	/**
	* Returns the dm data item where dataGroupId = &#63; and code = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param dataGroupId the data group ID
	* @param code the code
	* @return the matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.DmDataItem fetchByDataGroupIdAndCode(
		long dataGroupId, java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm data item where dataGroupId = &#63; and code = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param dataGroupId the data group ID
	* @param code the code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.DmDataItem fetchByDataGroupIdAndCode(
		long dataGroupId, java.lang.String code, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the dm data item where dataGroupId = &#63; and code = &#63; from the database.
	*
	* @param dataGroupId the data group ID
	* @param code the code
	* @return the dm data item that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.DmDataItem removeByDataGroupIdAndCode(
		long dataGroupId, java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException;

	/**
	* Returns the number of dm data items where dataGroupId = &#63; and code = &#63;.
	*
	* @param dataGroupId the data group ID
	* @param code the code
	* @return the number of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public int countByDataGroupIdAndCode(long dataGroupId, java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm data item where dataGroupId = &#63; and code = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchDmDataItemException} if it could not be found.
	*
	* @param dataGroupId the data group ID
	* @param code the code
	* @return the matching dm data item
	* @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.DmDataItem findByDataGroupIdAndCodeStatus(
		long dataGroupId, java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException;

	/**
	* Returns the dm data item where dataGroupId = &#63; and code = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param dataGroupId the data group ID
	* @param code the code
	* @return the matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.DmDataItem fetchByDataGroupIdAndCodeStatus(
		long dataGroupId, java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm data item where dataGroupId = &#63; and code = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param dataGroupId the data group ID
	* @param code the code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.DmDataItem fetchByDataGroupIdAndCodeStatus(
		long dataGroupId, java.lang.String code, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the dm data item where dataGroupId = &#63; and code = &#63; from the database.
	*
	* @param dataGroupId the data group ID
	* @param code the code
	* @return the dm data item that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.DmDataItem removeByDataGroupIdAndCodeStatus(
		long dataGroupId, java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException;

	/**
	* Returns the number of dm data items where dataGroupId = &#63; and code = &#63;.
	*
	* @param dataGroupId the data group ID
	* @param code the code
	* @return the number of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public int countByDataGroupIdAndCodeStatus(long dataGroupId,
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm data items where code = &#63; and status = &#63;.
	*
	* @param code the code
	* @param status the status
	* @return the matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByCodeAndStatus(
		java.lang.String code, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByCodeAndStatus(
		java.lang.String code, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByCodeAndStatus(
		java.lang.String code, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.duongbo.dao.common.model.DmDataItem findByCodeAndStatus_First(
		java.lang.String code, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException;

	/**
	* Returns the first dm data item in the ordered set where code = &#63; and status = &#63;.
	*
	* @param code the code
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.DmDataItem fetchByCodeAndStatus_First(
		java.lang.String code, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.duongbo.dao.common.model.DmDataItem findByCodeAndStatus_Last(
		java.lang.String code, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException;

	/**
	* Returns the last dm data item in the ordered set where code = &#63; and status = &#63;.
	*
	* @param code the code
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.DmDataItem fetchByCodeAndStatus_Last(
		java.lang.String code, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.duongbo.dao.common.model.DmDataItem[] findByCodeAndStatus_PrevAndNext(
		long id, java.lang.String code, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException;

	/**
	* Removes all the dm data items where code = &#63; and status = &#63; from the database.
	*
	* @param code the code
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCodeAndStatus(java.lang.String code, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm data items where code = &#63; and status = &#63;.
	*
	* @param code the code
	* @param status the status
	* @return the number of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public int countByCodeAndStatus(java.lang.String code, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm data items where dataGroupId = &#63; and status = &#63;.
	*
	* @param dataGroupId the data group ID
	* @param status the status
	* @return the matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findBydataGroupId(
		long dataGroupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findBydataGroupId(
		long dataGroupId, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findBydataGroupId(
		long dataGroupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.duongbo.dao.common.model.DmDataItem findBydataGroupId_First(
		long dataGroupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException;

	/**
	* Returns the first dm data item in the ordered set where dataGroupId = &#63; and status = &#63;.
	*
	* @param dataGroupId the data group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.DmDataItem fetchBydataGroupId_First(
		long dataGroupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.duongbo.dao.common.model.DmDataItem findBydataGroupId_Last(
		long dataGroupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException;

	/**
	* Returns the last dm data item in the ordered set where dataGroupId = &#63; and status = &#63;.
	*
	* @param dataGroupId the data group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.DmDataItem fetchBydataGroupId_Last(
		long dataGroupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.duongbo.dao.common.model.DmDataItem[] findBydataGroupId_PrevAndNext(
		long id, long dataGroupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException;

	/**
	* Removes all the dm data items where dataGroupId = &#63; and status = &#63; from the database.
	*
	* @param dataGroupId the data group ID
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public void removeBydataGroupId(long dataGroupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm data items where dataGroupId = &#63; and status = &#63;.
	*
	* @param dataGroupId the data group ID
	* @param status the status
	* @return the number of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public int countBydataGroupId(long dataGroupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm data item where code = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchDmDataItemException} if it could not be found.
	*
	* @param code the code
	* @return the matching dm data item
	* @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.DmDataItem findByCode(
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException;

	/**
	* Returns the dm data item where code = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param code the code
	* @return the matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.DmDataItem fetchByCode(
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm data item where code = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param code the code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.DmDataItem fetchByCode(
		java.lang.String code, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the dm data item where code = &#63; from the database.
	*
	* @param code the code
	* @return the dm data item that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.DmDataItem removeByCode(
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException;

	/**
	* Returns the number of dm data items where code = &#63;.
	*
	* @param code the code
	* @return the number of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public int countByCode(java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm data item where code = &#63; or throws a {@link vn.dtt.duongbo.dao.common.NoSuchDmDataItemException} if it could not be found.
	*
	* @param code the code
	* @return the matching dm data item
	* @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.DmDataItem findByCodeAndNoStatus(
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException;

	/**
	* Returns the dm data item where code = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param code the code
	* @return the matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.DmDataItem fetchByCodeAndNoStatus(
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm data item where code = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param code the code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.DmDataItem fetchByCodeAndNoStatus(
		java.lang.String code, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the dm data item where code = &#63; from the database.
	*
	* @param code the code
	* @return the dm data item that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.DmDataItem removeByCodeAndNoStatus(
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException;

	/**
	* Returns the number of dm data items where code = &#63;.
	*
	* @param code the code
	* @return the number of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public int countByCodeAndNoStatus(java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm data items where code = &#63; and level = &#63; and status = &#63;.
	*
	* @param code the code
	* @param level the level
	* @param status the status
	* @return the matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByCodeAndLevel(
		java.lang.String code, int level, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByCodeAndLevel(
		java.lang.String code, int level, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByCodeAndLevel(
		java.lang.String code, int level, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.duongbo.dao.common.model.DmDataItem findByCodeAndLevel_First(
		java.lang.String code, int level, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException;

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
	public vn.dtt.duongbo.dao.common.model.DmDataItem fetchByCodeAndLevel_First(
		java.lang.String code, int level, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.duongbo.dao.common.model.DmDataItem findByCodeAndLevel_Last(
		java.lang.String code, int level, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException;

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
	public vn.dtt.duongbo.dao.common.model.DmDataItem fetchByCodeAndLevel_Last(
		java.lang.String code, int level, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.duongbo.dao.common.model.DmDataItem[] findByCodeAndLevel_PrevAndNext(
		long id, java.lang.String code, int level, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException;

	/**
	* Removes all the dm data items where code = &#63; and level = &#63; and status = &#63; from the database.
	*
	* @param code the code
	* @param level the level
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCodeAndLevel(java.lang.String code, int level,
		int status) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm data items where code = &#63; and level = &#63; and status = &#63;.
	*
	* @param code the code
	* @param level the level
	* @param status the status
	* @return the number of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public int countByCodeAndLevel(java.lang.String code, int level, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm data items where code = &#63; and node1 = &#63; and status = &#63;.
	*
	* @param code the code
	* @param node1 the node1
	* @param status the status
	* @return the matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByCodeAndNode1(
		java.lang.String code, java.lang.String node1, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByCodeAndNode1(
		java.lang.String code, java.lang.String node1, int status, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByCodeAndNode1(
		java.lang.String code, java.lang.String node1, int status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.duongbo.dao.common.model.DmDataItem findByCodeAndNode1_First(
		java.lang.String code, java.lang.String node1, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException;

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
	public vn.dtt.duongbo.dao.common.model.DmDataItem fetchByCodeAndNode1_First(
		java.lang.String code, java.lang.String node1, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.duongbo.dao.common.model.DmDataItem findByCodeAndNode1_Last(
		java.lang.String code, java.lang.String node1, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException;

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
	public vn.dtt.duongbo.dao.common.model.DmDataItem fetchByCodeAndNode1_Last(
		java.lang.String code, java.lang.String node1, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.duongbo.dao.common.model.DmDataItem[] findByCodeAndNode1_PrevAndNext(
		long id, java.lang.String code, java.lang.String node1, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException;

	/**
	* Removes all the dm data items where code = &#63; and node1 = &#63; and status = &#63; from the database.
	*
	* @param code the code
	* @param node1 the node1
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCodeAndNode1(java.lang.String code,
		java.lang.String node1, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm data items where code = &#63; and node1 = &#63; and status = &#63;.
	*
	* @param code the code
	* @param node1 the node1
	* @param status the status
	* @return the number of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public int countByCodeAndNode1(java.lang.String code,
		java.lang.String node1, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the dm data item in the entity cache if it is enabled.
	*
	* @param dmDataItem the dm data item
	*/
	public void cacheResult(
		vn.dtt.duongbo.dao.common.model.DmDataItem dmDataItem);

	/**
	* Caches the dm data items in the entity cache if it is enabled.
	*
	* @param dmDataItems the dm data items
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> dmDataItems);

	/**
	* Creates a new dm data item with the primary key. Does not add the dm data item to the database.
	*
	* @param id the primary key for the new dm data item
	* @return the new dm data item
	*/
	public vn.dtt.duongbo.dao.common.model.DmDataItem create(long id);

	/**
	* Removes the dm data item with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm data item
	* @return the dm data item that was removed
	* @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.DmDataItem remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException;

	public vn.dtt.duongbo.dao.common.model.DmDataItem updateImpl(
		vn.dtt.duongbo.dao.common.model.DmDataItem dmDataItem)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm data item with the primary key or throws a {@link vn.dtt.duongbo.dao.common.NoSuchDmDataItemException} if it could not be found.
	*
	* @param id the primary key of the dm data item
	* @return the dm data item
	* @throws vn.dtt.duongbo.dao.common.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.DmDataItem findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.common.NoSuchDmDataItemException;

	/**
	* Returns the dm data item with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm data item
	* @return the dm data item, or <code>null</code> if a dm data item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.common.model.DmDataItem fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm data items.
	*
	* @return the dm data items
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm data items from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm data items.
	*
	* @return the number of dm data items
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}