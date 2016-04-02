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

import vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise;

import java.util.List;

/**
 * The persistence utility for the dm history enterrise service. This utility wraps {@link DmHistoryEnterrisePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmHistoryEnterrisePersistence
 * @see DmHistoryEnterrisePersistenceImpl
 * @generated
 */
public class DmHistoryEnterriseUtil {
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
	public static void clearCache(DmHistoryEnterrise dmHistoryEnterrise) {
		getPersistence().clearCache(dmHistoryEnterrise);
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
	public static List<DmHistoryEnterrise> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmHistoryEnterrise> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmHistoryEnterrise> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DmHistoryEnterrise update(
		DmHistoryEnterrise dmHistoryEnterrise) throws SystemException {
		return getPersistence().update(dmHistoryEnterrise);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DmHistoryEnterrise update(
		DmHistoryEnterrise dmHistoryEnterrise, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(dmHistoryEnterrise, serviceContext);
	}

	/**
	* Returns all the dm history enterrises where syncVersion = &#63;.
	*
	* @param syncVersion the sync version
	* @return the matching dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise> findBySyncVersion(
		java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySyncVersion(syncVersion);
	}

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
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise> findBySyncVersion(
		java.lang.String syncVersion, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySyncVersion(syncVersion, start, end);
	}

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
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise> findBySyncVersion(
		java.lang.String syncVersion, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySyncVersion(syncVersion, start, end, orderByComparator);
	}

	/**
	* Returns the first dm history enterrise in the ordered set where syncVersion = &#63;.
	*
	* @param syncVersion the sync version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history enterrise
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException if a matching dm history enterrise could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise findBySyncVersion_First(
		java.lang.String syncVersion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException {
		return getPersistence()
				   .findBySyncVersion_First(syncVersion, orderByComparator);
	}

	/**
	* Returns the first dm history enterrise in the ordered set where syncVersion = &#63;.
	*
	* @param syncVersion the sync version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history enterrise, or <code>null</code> if a matching dm history enterrise could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise fetchBySyncVersion_First(
		java.lang.String syncVersion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySyncVersion_First(syncVersion, orderByComparator);
	}

	/**
	* Returns the last dm history enterrise in the ordered set where syncVersion = &#63;.
	*
	* @param syncVersion the sync version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history enterrise
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException if a matching dm history enterrise could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise findBySyncVersion_Last(
		java.lang.String syncVersion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException {
		return getPersistence()
				   .findBySyncVersion_Last(syncVersion, orderByComparator);
	}

	/**
	* Returns the last dm history enterrise in the ordered set where syncVersion = &#63;.
	*
	* @param syncVersion the sync version
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history enterrise, or <code>null</code> if a matching dm history enterrise could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise fetchBySyncVersion_Last(
		java.lang.String syncVersion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySyncVersion_Last(syncVersion, orderByComparator);
	}

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
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise[] findBySyncVersion_PrevAndNext(
		int id, java.lang.String syncVersion,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException {
		return getPersistence()
				   .findBySyncVersion_PrevAndNext(id, syncVersion,
			orderByComparator);
	}

	/**
	* Removes all the dm history enterrises where syncVersion = &#63; from the database.
	*
	* @param syncVersion the sync version
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBySyncVersion(java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBySyncVersion(syncVersion);
	}

	/**
	* Returns the number of dm history enterrises where syncVersion = &#63;.
	*
	* @param syncVersion the sync version
	* @return the number of matching dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	public static int countBySyncVersion(java.lang.String syncVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBySyncVersion(syncVersion);
	}

	/**
	* Returns all the dm history enterrises where enterpriseCode = &#63;.
	*
	* @param enterpriseCode the enterprise code
	* @return the matching dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise> findByEnterpriseCode(
		java.lang.String enterpriseCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByEnterpriseCode(enterpriseCode);
	}

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
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise> findByEnterpriseCode(
		java.lang.String enterpriseCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByEnterpriseCode(enterpriseCode, start, end);
	}

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
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise> findByEnterpriseCode(
		java.lang.String enterpriseCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByEnterpriseCode(enterpriseCode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dm history enterrise in the ordered set where enterpriseCode = &#63;.
	*
	* @param enterpriseCode the enterprise code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history enterrise
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException if a matching dm history enterrise could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise findByEnterpriseCode_First(
		java.lang.String enterpriseCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException {
		return getPersistence()
				   .findByEnterpriseCode_First(enterpriseCode, orderByComparator);
	}

	/**
	* Returns the first dm history enterrise in the ordered set where enterpriseCode = &#63;.
	*
	* @param enterpriseCode the enterprise code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history enterrise, or <code>null</code> if a matching dm history enterrise could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise fetchByEnterpriseCode_First(
		java.lang.String enterpriseCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByEnterpriseCode_First(enterpriseCode,
			orderByComparator);
	}

	/**
	* Returns the last dm history enterrise in the ordered set where enterpriseCode = &#63;.
	*
	* @param enterpriseCode the enterprise code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history enterrise
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException if a matching dm history enterrise could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise findByEnterpriseCode_Last(
		java.lang.String enterpriseCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException {
		return getPersistence()
				   .findByEnterpriseCode_Last(enterpriseCode, orderByComparator);
	}

	/**
	* Returns the last dm history enterrise in the ordered set where enterpriseCode = &#63;.
	*
	* @param enterpriseCode the enterprise code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history enterrise, or <code>null</code> if a matching dm history enterrise could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise fetchByEnterpriseCode_Last(
		java.lang.String enterpriseCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByEnterpriseCode_Last(enterpriseCode, orderByComparator);
	}

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
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise[] findByEnterpriseCode_PrevAndNext(
		int id, java.lang.String enterpriseCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException {
		return getPersistence()
				   .findByEnterpriseCode_PrevAndNext(id, enterpriseCode,
			orderByComparator);
	}

	/**
	* Removes all the dm history enterrises where enterpriseCode = &#63; from the database.
	*
	* @param enterpriseCode the enterprise code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByEnterpriseCode(java.lang.String enterpriseCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByEnterpriseCode(enterpriseCode);
	}

	/**
	* Returns the number of dm history enterrises where enterpriseCode = &#63;.
	*
	* @param enterpriseCode the enterprise code
	* @return the number of matching dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	public static int countByEnterpriseCode(java.lang.String enterpriseCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByEnterpriseCode(enterpriseCode);
	}

	/**
	* Returns all the dm history enterrises where enterpriseTaxCode = &#63;.
	*
	* @param enterpriseTaxCode the enterprise tax code
	* @return the matching dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise> findByEnterpriseTaxCode(
		java.lang.String enterpriseTaxCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByEnterpriseTaxCode(enterpriseTaxCode);
	}

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
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise> findByEnterpriseTaxCode(
		java.lang.String enterpriseTaxCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByEnterpriseTaxCode(enterpriseTaxCode, start, end);
	}

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
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise> findByEnterpriseTaxCode(
		java.lang.String enterpriseTaxCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByEnterpriseTaxCode(enterpriseTaxCode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dm history enterrise in the ordered set where enterpriseTaxCode = &#63;.
	*
	* @param enterpriseTaxCode the enterprise tax code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history enterrise
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException if a matching dm history enterrise could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise findByEnterpriseTaxCode_First(
		java.lang.String enterpriseTaxCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException {
		return getPersistence()
				   .findByEnterpriseTaxCode_First(enterpriseTaxCode,
			orderByComparator);
	}

	/**
	* Returns the first dm history enterrise in the ordered set where enterpriseTaxCode = &#63;.
	*
	* @param enterpriseTaxCode the enterprise tax code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm history enterrise, or <code>null</code> if a matching dm history enterrise could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise fetchByEnterpriseTaxCode_First(
		java.lang.String enterpriseTaxCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByEnterpriseTaxCode_First(enterpriseTaxCode,
			orderByComparator);
	}

	/**
	* Returns the last dm history enterrise in the ordered set where enterpriseTaxCode = &#63;.
	*
	* @param enterpriseTaxCode the enterprise tax code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history enterrise
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException if a matching dm history enterrise could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise findByEnterpriseTaxCode_Last(
		java.lang.String enterpriseTaxCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException {
		return getPersistence()
				   .findByEnterpriseTaxCode_Last(enterpriseTaxCode,
			orderByComparator);
	}

	/**
	* Returns the last dm history enterrise in the ordered set where enterpriseTaxCode = &#63;.
	*
	* @param enterpriseTaxCode the enterprise tax code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm history enterrise, or <code>null</code> if a matching dm history enterrise could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise fetchByEnterpriseTaxCode_Last(
		java.lang.String enterpriseTaxCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByEnterpriseTaxCode_Last(enterpriseTaxCode,
			orderByComparator);
	}

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
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise[] findByEnterpriseTaxCode_PrevAndNext(
		int id, java.lang.String enterpriseTaxCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException {
		return getPersistence()
				   .findByEnterpriseTaxCode_PrevAndNext(id, enterpriseTaxCode,
			orderByComparator);
	}

	/**
	* Removes all the dm history enterrises where enterpriseTaxCode = &#63; from the database.
	*
	* @param enterpriseTaxCode the enterprise tax code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByEnterpriseTaxCode(
		java.lang.String enterpriseTaxCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByEnterpriseTaxCode(enterpriseTaxCode);
	}

	/**
	* Returns the number of dm history enterrises where enterpriseTaxCode = &#63;.
	*
	* @param enterpriseTaxCode the enterprise tax code
	* @return the number of matching dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	public static int countByEnterpriseTaxCode(
		java.lang.String enterpriseTaxCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByEnterpriseTaxCode(enterpriseTaxCode);
	}

	/**
	* Caches the dm history enterrise in the entity cache if it is enabled.
	*
	* @param dmHistoryEnterrise the dm history enterrise
	*/
	public static void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise dmHistoryEnterrise) {
		getPersistence().cacheResult(dmHistoryEnterrise);
	}

	/**
	* Caches the dm history enterrises in the entity cache if it is enabled.
	*
	* @param dmHistoryEnterrises the dm history enterrises
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise> dmHistoryEnterrises) {
		getPersistence().cacheResult(dmHistoryEnterrises);
	}

	/**
	* Creates a new dm history enterrise with the primary key. Does not add the dm history enterrise to the database.
	*
	* @param id the primary key for the new dm history enterrise
	* @return the new dm history enterrise
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise create(
		int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm history enterrise with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history enterrise
	* @return the dm history enterrise that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException if a dm history enterrise with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise remove(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise dmHistoryEnterrise)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmHistoryEnterrise);
	}

	/**
	* Returns the dm history enterrise with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException} if it could not be found.
	*
	* @param id the primary key of the dm history enterrise
	* @return the dm history enterrise
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException if a dm history enterrise with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmHistoryEnterriseException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm history enterrise with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm history enterrise
	* @return the dm history enterrise, or <code>null</code> if a dm history enterrise with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the dm history enterrises.
	*
	* @return the dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm history enterrises from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm history enterrises.
	*
	* @return the number of dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmHistoryEnterrisePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmHistoryEnterrisePersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.getServletContextName(),
					DmHistoryEnterrisePersistence.class.getName());

			ReferenceRegistry.registerReference(DmHistoryEnterriseUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DmHistoryEnterrisePersistence persistence) {
	}

	private static DmHistoryEnterrisePersistence _persistence;
}