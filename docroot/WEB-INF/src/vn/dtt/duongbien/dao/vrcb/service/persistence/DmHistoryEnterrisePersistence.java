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

import vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise;

/**
 * The persistence interface for the dm history enterrise service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmHistoryEnterrisePersistenceImpl
 * @see DmHistoryEnterriseUtil
 * @generated
 */
public interface DmHistoryEnterrisePersistence extends BasePersistence<DmHistoryEnterrise> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmHistoryEnterriseUtil} to access the dm history enterrise persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the dm history enterrises where syncVersion = &#63;.
	*
	* @param syncVersion the sync version
	* @return the matching dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise> findBySyncVersion(
		java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm history enterrises where syncVersion = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryEnterriseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param syncVersion the sync version
	* @param start the lower bound of the range of dm history enterrises
	* @param end the upper bound of the range of dm history enterrises (not inclusive)
	* @return the range of matching dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise> findBySyncVersion(
		java.lang.String syncVersion, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm history enterrises where syncVersion = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryEnterriseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param syncVersion the sync version
	* @param start the lower bound of the range of dm history enterrises
	* @param end the upper bound of the range of dm history enterrises (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise> findBySyncVersion(
		java.lang.String syncVersion, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm history enterrise in the ordered set where syncVersion = &#63;.
	*
	* @param syncVersion the sync version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history enterrise
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException if a matching dm history enterrise could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise findBySyncVersion_First(
		java.lang.String syncVersion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException;

	/**
	* Returns the first dm history enterrise in the ordered set where syncVersion = &#63;.
	*
	* @param syncVersion the sync version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history enterrise, or <code>null</code> if a matching dm history enterrise could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise fetchBySyncVersion_First(
		java.lang.String syncVersion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dm history enterrise in the ordered set where syncVersion = &#63;.
	*
	* @param syncVersion the sync version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history enterrise
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException if a matching dm history enterrise could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise findBySyncVersion_Last(
		java.lang.String syncVersion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException;

	/**
	* Returns the last dm history enterrise in the ordered set where syncVersion = &#63;.
	*
	* @param syncVersion the sync version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history enterrise, or <code>null</code> if a matching dm history enterrise could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise fetchBySyncVersion_Last(
		java.lang.String syncVersion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history enterrises before and after the current dm history enterrise in the ordered set where syncVersion = &#63;.
	*
	* @param id the primary key of the current dm history enterrise
	* @param syncVersion the sync version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm history enterrise
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException if a dm history enterrise with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise[] findBySyncVersion_PrevAndNext(
		int id, java.lang.String syncVersion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException;

	/**
	* Removes all the dm history enterrises where syncVersion = &#63; from the database.
	*
	* @param syncVersion the sync version
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySyncVersion(java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history enterrises where syncVersion = &#63;.
	*
	* @param syncVersion the sync version
	* @return the number of matching dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	public int countBySyncVersion(java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm history enterrises where enterpriseCode = &#63;.
	*
	* @param enterpriseCode the enterprise code
	* @return the matching dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise> findByEnterpriseCode(
		java.lang.String enterpriseCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm history enterrises where enterpriseCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryEnterriseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param enterpriseCode the enterprise code
	* @param start the lower bound of the range of dm history enterrises
	* @param end the upper bound of the range of dm history enterrises (not inclusive)
	* @return the range of matching dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise> findByEnterpriseCode(
		java.lang.String enterpriseCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm history enterrises where enterpriseCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryEnterriseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param enterpriseCode the enterprise code
	* @param start the lower bound of the range of dm history enterrises
	* @param end the upper bound of the range of dm history enterrises (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise> findByEnterpriseCode(
		java.lang.String enterpriseCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm history enterrise in the ordered set where enterpriseCode = &#63;.
	*
	* @param enterpriseCode the enterprise code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history enterrise
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException if a matching dm history enterrise could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise findByEnterpriseCode_First(
		java.lang.String enterpriseCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException;

	/**
	* Returns the first dm history enterrise in the ordered set where enterpriseCode = &#63;.
	*
	* @param enterpriseCode the enterprise code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history enterrise, or <code>null</code> if a matching dm history enterrise could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise fetchByEnterpriseCode_First(
		java.lang.String enterpriseCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dm history enterrise in the ordered set where enterpriseCode = &#63;.
	*
	* @param enterpriseCode the enterprise code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history enterrise
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException if a matching dm history enterrise could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise findByEnterpriseCode_Last(
		java.lang.String enterpriseCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException;

	/**
	* Returns the last dm history enterrise in the ordered set where enterpriseCode = &#63;.
	*
	* @param enterpriseCode the enterprise code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history enterrise, or <code>null</code> if a matching dm history enterrise could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise fetchByEnterpriseCode_Last(
		java.lang.String enterpriseCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history enterrises before and after the current dm history enterrise in the ordered set where enterpriseCode = &#63;.
	*
	* @param id the primary key of the current dm history enterrise
	* @param enterpriseCode the enterprise code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm history enterrise
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException if a dm history enterrise with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise[] findByEnterpriseCode_PrevAndNext(
		int id, java.lang.String enterpriseCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException;

	/**
	* Removes all the dm history enterrises where enterpriseCode = &#63; from the database.
	*
	* @param enterpriseCode the enterprise code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByEnterpriseCode(java.lang.String enterpriseCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history enterrises where enterpriseCode = &#63;.
	*
	* @param enterpriseCode the enterprise code
	* @return the number of matching dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	public int countByEnterpriseCode(java.lang.String enterpriseCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm history enterrises where enterpriseTaxCode = &#63;.
	*
	* @param enterpriseTaxCode the enterprise tax code
	* @return the matching dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise> findByEnterpriseTaxCode(
		java.lang.String enterpriseTaxCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm history enterrises where enterpriseTaxCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryEnterriseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param enterpriseTaxCode the enterprise tax code
	* @param start the lower bound of the range of dm history enterrises
	* @param end the upper bound of the range of dm history enterrises (not inclusive)
	* @return the range of matching dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise> findByEnterpriseTaxCode(
		java.lang.String enterpriseTaxCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm history enterrises where enterpriseTaxCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryEnterriseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param enterpriseTaxCode the enterprise tax code
	* @param start the lower bound of the range of dm history enterrises
	* @param end the upper bound of the range of dm history enterrises (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise> findByEnterpriseTaxCode(
		java.lang.String enterpriseTaxCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm history enterrise in the ordered set where enterpriseTaxCode = &#63;.
	*
	* @param enterpriseTaxCode the enterprise tax code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history enterrise
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException if a matching dm history enterrise could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise findByEnterpriseTaxCode_First(
		java.lang.String enterpriseTaxCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException;

	/**
	* Returns the first dm history enterrise in the ordered set where enterpriseTaxCode = &#63;.
	*
	* @param enterpriseTaxCode the enterprise tax code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history enterrise, or <code>null</code> if a matching dm history enterrise could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise fetchByEnterpriseTaxCode_First(
		java.lang.String enterpriseTaxCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dm history enterrise in the ordered set where enterpriseTaxCode = &#63;.
	*
	* @param enterpriseTaxCode the enterprise tax code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history enterrise
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException if a matching dm history enterrise could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise findByEnterpriseTaxCode_Last(
		java.lang.String enterpriseTaxCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException;

	/**
	* Returns the last dm history enterrise in the ordered set where enterpriseTaxCode = &#63;.
	*
	* @param enterpriseTaxCode the enterprise tax code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history enterrise, or <code>null</code> if a matching dm history enterrise could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise fetchByEnterpriseTaxCode_Last(
		java.lang.String enterpriseTaxCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history enterrises before and after the current dm history enterrise in the ordered set where enterpriseTaxCode = &#63;.
	*
	* @param id the primary key of the current dm history enterrise
	* @param enterpriseTaxCode the enterprise tax code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm history enterrise
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException if a dm history enterrise with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise[] findByEnterpriseTaxCode_PrevAndNext(
		int id, java.lang.String enterpriseTaxCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException;

	/**
	* Removes all the dm history enterrises where enterpriseTaxCode = &#63; from the database.
	*
	* @param enterpriseTaxCode the enterprise tax code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByEnterpriseTaxCode(java.lang.String enterpriseTaxCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history enterrises where enterpriseTaxCode = &#63;.
	*
	* @param enterpriseTaxCode the enterprise tax code
	* @return the number of matching dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	public int countByEnterpriseTaxCode(java.lang.String enterpriseTaxCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the dm history enterrise in the entity cache if it is enabled.
	*
	* @param dmHistoryEnterrise the dm history enterrise
	*/
	public void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise dmHistoryEnterrise);

	/**
	* Caches the dm history enterrises in the entity cache if it is enabled.
	*
	* @param dmHistoryEnterrises the dm history enterrises
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise> dmHistoryEnterrises);

	/**
	* Creates a new dm history enterrise with the primary key. Does not add the dm history enterrise to the database.
	*
	* @param id the primary key for the new dm history enterrise
	* @return the new dm history enterrise
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise create(int id);

	/**
	* Removes the dm history enterrise with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history enterrise
	* @return the dm history enterrise that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException if a dm history enterrise with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException;

	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise dmHistoryEnterrise)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm history enterrise with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException} if it could not be found.
	*
	* @param id the primary key of the dm history enterrise
	* @return the dm history enterrise
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException if a dm history enterrise with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException;

	/**
	* Returns the dm history enterrise with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm history enterrise
	* @return the dm history enterrise, or <code>null</code> if a dm history enterrise with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm history enterrises.
	*
	* @return the dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm history enterrises.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryEnterriseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm history enterrises
	* @param end the upper bound of the range of dm history enterrises (not inclusive)
	* @return the range of dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm history enterrises.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryEnterriseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm history enterrises
	* @param end the upper bound of the range of dm history enterrises (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm history enterrises from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm history enterrises.
	*
	* @return the number of dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}