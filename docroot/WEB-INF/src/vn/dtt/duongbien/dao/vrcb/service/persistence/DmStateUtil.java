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

import vn.dtt.duongbien.dao.vrcb.model.DmState;

import java.util.List;

/**
 * The persistence utility for the dm state service. This utility wraps {@link DmStatePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmStatePersistence
 * @see DmStatePersistenceImpl
 * @generated
 */
public class DmStateUtil {
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
	public static void clearCache(DmState dmState) {
		getPersistence().clearCache(dmState);
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
	public static List<DmState> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmState> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmState> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DmState update(DmState dmState) throws SystemException {
		return getPersistence().update(dmState);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DmState update(DmState dmState, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(dmState, serviceContext);
	}

	/**
	* Returns all the dm states where stateCode = &#63;.
	*
	* @param stateCode the state code
	* @return the matching dm states
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmState> findByStateCode(
		java.lang.String stateCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByStateCode(stateCode);
	}

	/**
	* Returns a range of all the dm states where stateCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmStateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param stateCode the state code
	* @param start the lower bound of the range of dm states
	* @param end the upper bound of the range of dm states (not inclusive)
	* @return the range of matching dm states
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmState> findByStateCode(
		java.lang.String stateCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByStateCode(stateCode, start, end);
	}

	/**
	* Returns an ordered range of all the dm states where stateCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmStateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param stateCode the state code
	* @param start the lower bound of the range of dm states
	* @param end the upper bound of the range of dm states (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm states
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmState> findByStateCode(
		java.lang.String stateCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByStateCode(stateCode, start, end, orderByComparator);
	}

	/**
	* Returns the first dm state in the ordered set where stateCode = &#63;.
	*
	* @param stateCode the state code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm state
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmStateException if a matching dm state could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmState findByStateCode_First(
		java.lang.String stateCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmStateException {
		return getPersistence()
				   .findByStateCode_First(stateCode, orderByComparator);
	}

	/**
	* Returns the first dm state in the ordered set where stateCode = &#63;.
	*
	* @param stateCode the state code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm state, or <code>null</code> if a matching dm state could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmState fetchByStateCode_First(
		java.lang.String stateCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByStateCode_First(stateCode, orderByComparator);
	}

	/**
	* Returns the last dm state in the ordered set where stateCode = &#63;.
	*
	* @param stateCode the state code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm state
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmStateException if a matching dm state could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmState findByStateCode_Last(
		java.lang.String stateCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmStateException {
		return getPersistence()
				   .findByStateCode_Last(stateCode, orderByComparator);
	}

	/**
	* Returns the last dm state in the ordered set where stateCode = &#63;.
	*
	* @param stateCode the state code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm state, or <code>null</code> if a matching dm state could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmState fetchByStateCode_Last(
		java.lang.String stateCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByStateCode_Last(stateCode, orderByComparator);
	}

	/**
	* Returns the dm states before and after the current dm state in the ordered set where stateCode = &#63;.
	*
	* @param id the primary key of the current dm state
	* @param stateCode the state code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm state
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmStateException if a dm state with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmState[] findByStateCode_PrevAndNext(
		int id, java.lang.String stateCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmStateException {
		return getPersistence()
				   .findByStateCode_PrevAndNext(id, stateCode, orderByComparator);
	}

	/**
	* Removes all the dm states where stateCode = &#63; from the database.
	*
	* @param stateCode the state code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByStateCode(java.lang.String stateCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByStateCode(stateCode);
	}

	/**
	* Returns the number of dm states where stateCode = &#63;.
	*
	* @param stateCode the state code
	* @return the number of matching dm states
	* @throws SystemException if a system exception occurred
	*/
	public static int countByStateCode(java.lang.String stateCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByStateCode(stateCode);
	}

	/**
	* Caches the dm state in the entity cache if it is enabled.
	*
	* @param dmState the dm state
	*/
	public static void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.DmState dmState) {
		getPersistence().cacheResult(dmState);
	}

	/**
	* Caches the dm states in the entity cache if it is enabled.
	*
	* @param dmStates the dm states
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmState> dmStates) {
		getPersistence().cacheResult(dmStates);
	}

	/**
	* Creates a new dm state with the primary key. Does not add the dm state to the database.
	*
	* @param id the primary key for the new dm state
	* @return the new dm state
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmState create(int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm state with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm state
	* @return the dm state that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmStateException if a dm state with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmState remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmStateException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbien.dao.vrcb.model.DmState updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmState dmState)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmState);
	}

	/**
	* Returns the dm state with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmStateException} if it could not be found.
	*
	* @param id the primary key of the dm state
	* @return the dm state
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmStateException if a dm state with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmState findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmStateException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm state with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm state
	* @return the dm state, or <code>null</code> if a dm state with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmState fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the dm states.
	*
	* @return the dm states
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmState> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dm states.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmStateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm states
	* @param end the upper bound of the range of dm states (not inclusive)
	* @return the range of dm states
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmState> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dm states.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmStateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm states
	* @param end the upper bound of the range of dm states (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm states
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmState> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm states from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm states.
	*
	* @return the number of dm states
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmStatePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmStatePersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.getServletContextName(),
					DmStatePersistence.class.getName());

			ReferenceRegistry.registerReference(DmStateUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DmStatePersistence persistence) {
	}

	private static DmStatePersistence _persistence;
}