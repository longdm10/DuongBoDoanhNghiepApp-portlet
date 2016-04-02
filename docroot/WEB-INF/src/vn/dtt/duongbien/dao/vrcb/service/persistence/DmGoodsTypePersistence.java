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

import vn.dtt.duongbien.dao.vrcb.model.DmGoodsType;

/**
 * The persistence interface for the dm goods type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmGoodsTypePersistenceImpl
 * @see DmGoodsTypeUtil
 * @generated
 */
public interface DmGoodsTypePersistence extends BasePersistence<DmGoodsType> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmGoodsTypeUtil} to access the dm goods type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the dm goods types where goodsTypeCode = &#63;.
	*
	* @param goodsTypeCode the goods type code
	* @return the matching dm goods types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGoodsType> findByGoodsTypeCode(
		java.lang.String goodsTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm goods types where goodsTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGoodsTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param goodsTypeCode the goods type code
	* @param start the lower bound of the range of dm goods types
	* @param end the upper bound of the range of dm goods types (not inclusive)
	* @return the range of matching dm goods types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGoodsType> findByGoodsTypeCode(
		java.lang.String goodsTypeCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm goods types where goodsTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGoodsTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param goodsTypeCode the goods type code
	* @param start the lower bound of the range of dm goods types
	* @param end the upper bound of the range of dm goods types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm goods types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGoodsType> findByGoodsTypeCode(
		java.lang.String goodsTypeCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm goods type in the ordered set where goodsTypeCode = &#63;.
	*
	* @param goodsTypeCode the goods type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm goods type
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGoodsTypeException if a matching dm goods type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGoodsType findByGoodsTypeCode_First(
		java.lang.String goodsTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmGoodsTypeException;

	/**
	* Returns the first dm goods type in the ordered set where goodsTypeCode = &#63;.
	*
	* @param goodsTypeCode the goods type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm goods type, or <code>null</code> if a matching dm goods type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGoodsType fetchByGoodsTypeCode_First(
		java.lang.String goodsTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dm goods type in the ordered set where goodsTypeCode = &#63;.
	*
	* @param goodsTypeCode the goods type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm goods type
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGoodsTypeException if a matching dm goods type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGoodsType findByGoodsTypeCode_Last(
		java.lang.String goodsTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmGoodsTypeException;

	/**
	* Returns the last dm goods type in the ordered set where goodsTypeCode = &#63;.
	*
	* @param goodsTypeCode the goods type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm goods type, or <code>null</code> if a matching dm goods type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGoodsType fetchByGoodsTypeCode_Last(
		java.lang.String goodsTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm goods types before and after the current dm goods type in the ordered set where goodsTypeCode = &#63;.
	*
	* @param id the primary key of the current dm goods type
	* @param goodsTypeCode the goods type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm goods type
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGoodsTypeException if a dm goods type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGoodsType[] findByGoodsTypeCode_PrevAndNext(
		int id, java.lang.String goodsTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmGoodsTypeException;

	/**
	* Removes all the dm goods types where goodsTypeCode = &#63; from the database.
	*
	* @param goodsTypeCode the goods type code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGoodsTypeCode(java.lang.String goodsTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm goods types where goodsTypeCode = &#63;.
	*
	* @param goodsTypeCode the goods type code
	* @return the number of matching dm goods types
	* @throws SystemException if a system exception occurred
	*/
	public int countByGoodsTypeCode(java.lang.String goodsTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the dm goods type in the entity cache if it is enabled.
	*
	* @param dmGoodsType the dm goods type
	*/
	public void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.DmGoodsType dmGoodsType);

	/**
	* Caches the dm goods types in the entity cache if it is enabled.
	*
	* @param dmGoodsTypes the dm goods types
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGoodsType> dmGoodsTypes);

	/**
	* Creates a new dm goods type with the primary key. Does not add the dm goods type to the database.
	*
	* @param id the primary key for the new dm goods type
	* @return the new dm goods type
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGoodsType create(int id);

	/**
	* Removes the dm goods type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm goods type
	* @return the dm goods type that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGoodsTypeException if a dm goods type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGoodsType remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmGoodsTypeException;

	public vn.dtt.duongbien.dao.vrcb.model.DmGoodsType updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmGoodsType dmGoodsType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm goods type with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmGoodsTypeException} if it could not be found.
	*
	* @param id the primary key of the dm goods type
	* @return the dm goods type
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGoodsTypeException if a dm goods type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGoodsType findByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmGoodsTypeException;

	/**
	* Returns the dm goods type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm goods type
	* @return the dm goods type, or <code>null</code> if a dm goods type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmGoodsType fetchByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm goods types.
	*
	* @return the dm goods types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGoodsType> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm goods types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGoodsTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm goods types
	* @param end the upper bound of the range of dm goods types (not inclusive)
	* @return the range of dm goods types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGoodsType> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm goods types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGoodsTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm goods types
	* @param end the upper bound of the range of dm goods types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm goods types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGoodsType> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm goods types from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm goods types.
	*
	* @return the number of dm goods types
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}