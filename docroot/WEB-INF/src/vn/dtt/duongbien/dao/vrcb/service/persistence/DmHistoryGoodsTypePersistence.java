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

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType;

/**
 * The persistence interface for the dm history goods type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmHistoryGoodsTypePersistenceImpl
 * @see DmHistoryGoodsTypeUtil
 * @generated
 */
public interface DmHistoryGoodsTypePersistence extends BasePersistence<DmHistoryGoodsType> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmHistoryGoodsTypeUtil} to access the dm history goods type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the dm history goods types where goodsTypeCode = &#63;.
	*
	* @param goodsTypeCode the goods type code
	* @return the matching dm history goods types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType> findByGoodsTypeCode(
		java.lang.String goodsTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm history goods types where goodsTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryGoodsTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param goodsTypeCode the goods type code
	* @param start the lower bound of the range of dm history goods types
	* @param end the upper bound of the range of dm history goods types (not inclusive)
	* @return the range of matching dm history goods types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType> findByGoodsTypeCode(
		java.lang.String goodsTypeCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm history goods types where goodsTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryGoodsTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param goodsTypeCode the goods type code
	* @param start the lower bound of the range of dm history goods types
	* @param end the upper bound of the range of dm history goods types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm history goods types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType> findByGoodsTypeCode(
		java.lang.String goodsTypeCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm history goods type in the ordered set where goodsTypeCode = &#63;.
	*
	* @param goodsTypeCode the goods type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history goods type
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException if a matching dm history goods type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType findByGoodsTypeCode_First(
		java.lang.String goodsTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException;

	/**
	* Returns the first dm history goods type in the ordered set where goodsTypeCode = &#63;.
	*
	* @param goodsTypeCode the goods type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history goods type, or <code>null</code> if a matching dm history goods type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType fetchByGoodsTypeCode_First(
		java.lang.String goodsTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dm history goods type in the ordered set where goodsTypeCode = &#63;.
	*
	* @param goodsTypeCode the goods type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history goods type
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException if a matching dm history goods type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType findByGoodsTypeCode_Last(
		java.lang.String goodsTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException;

	/**
	* Returns the last dm history goods type in the ordered set where goodsTypeCode = &#63;.
	*
	* @param goodsTypeCode the goods type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history goods type, or <code>null</code> if a matching dm history goods type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType fetchByGoodsTypeCode_Last(
		java.lang.String goodsTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history goods types before and after the current dm history goods type in the ordered set where goodsTypeCode = &#63;.
	*
	* @param id the primary key of the current dm history goods type
	* @param goodsTypeCode the goods type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm history goods type
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException if a dm history goods type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType[] findByGoodsTypeCode_PrevAndNext(
		int id, java.lang.String goodsTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException;

	/**
	* Removes all the dm history goods types where goodsTypeCode = &#63; from the database.
	*
	* @param goodsTypeCode the goods type code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGoodsTypeCode(java.lang.String goodsTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history goods types where goodsTypeCode = &#63;.
	*
	* @param goodsTypeCode the goods type code
	* @return the number of matching dm history goods types
	* @throws SystemException if a system exception occurred
	*/
	public int countByGoodsTypeCode(java.lang.String goodsTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history goods type where goodsTypeCode = &#63; and syncVersion = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException} if it could not be found.
	*
	* @param goodsTypeCode the goods type code
	* @param syncVersion the sync version
	* @return the matching dm history goods type
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException if a matching dm history goods type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType findByGoodsTypeCodeAndSyncVersion(
		java.lang.String goodsTypeCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException;

	/**
	* Returns the dm history goods type where goodsTypeCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param goodsTypeCode the goods type code
	* @param syncVersion the sync version
	* @return the matching dm history goods type, or <code>null</code> if a matching dm history goods type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType fetchByGoodsTypeCodeAndSyncVersion(
		java.lang.String goodsTypeCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history goods type where goodsTypeCode = &#63; and syncVersion = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param goodsTypeCode the goods type code
	* @param syncVersion the sync version
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm history goods type, or <code>null</code> if a matching dm history goods type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType fetchByGoodsTypeCodeAndSyncVersion(
		java.lang.String goodsTypeCode, java.lang.String syncVersion,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the dm history goods type where goodsTypeCode = &#63; and syncVersion = &#63; from the database.
	*
	* @param goodsTypeCode the goods type code
	* @param syncVersion the sync version
	* @return the dm history goods type that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType removeByGoodsTypeCodeAndSyncVersion(
		java.lang.String goodsTypeCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException;

	/**
	* Returns the number of dm history goods types where goodsTypeCode = &#63; and syncVersion = &#63;.
	*
	* @param goodsTypeCode the goods type code
	* @param syncVersion the sync version
	* @return the number of matching dm history goods types
	* @throws SystemException if a system exception occurred
	*/
	public int countByGoodsTypeCodeAndSyncVersion(
		java.lang.String goodsTypeCode, java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the dm history goods type in the entity cache if it is enabled.
	*
	* @param dmHistoryGoodsType the dm history goods type
	*/
	public void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType dmHistoryGoodsType);

	/**
	* Caches the dm history goods types in the entity cache if it is enabled.
	*
	* @param dmHistoryGoodsTypes the dm history goods types
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType> dmHistoryGoodsTypes);

	/**
	* Creates a new dm history goods type with the primary key. Does not add the dm history goods type to the database.
	*
	* @param id the primary key for the new dm history goods type
	* @return the new dm history goods type
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType create(int id);

	/**
	* Removes the dm history goods type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history goods type
	* @return the dm history goods type that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException if a dm history goods type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException;

	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType dmHistoryGoodsType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history goods type with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException} if it could not be found.
	*
	* @param id the primary key of the dm history goods type
	* @return the dm history goods type
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException if a dm history goods type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryGoodsTypeException;

	/**
	* Returns the dm history goods type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm history goods type
	* @return the dm history goods type, or <code>null</code> if a dm history goods type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm history goods types.
	*
	* @return the dm history goods types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm history goods types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryGoodsTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm history goods types
	* @param end the upper bound of the range of dm history goods types (not inclusive)
	* @return the range of dm history goods types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm history goods types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryGoodsTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm history goods types
	* @param end the upper bound of the range of dm history goods types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm history goods types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoodsType> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm history goods types from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history goods types.
	*
	* @return the number of dm history goods types
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}