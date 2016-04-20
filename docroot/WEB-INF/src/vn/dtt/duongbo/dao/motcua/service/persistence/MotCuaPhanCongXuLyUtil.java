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

package vn.dtt.duongbo.dao.motcua.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.duongbo.dao.motcua.model.MotCuaPhanCongXuLy;

import java.util.List;

/**
 * The persistence utility for the mot cua phan cong xu ly service. This utility wraps {@link MotCuaPhanCongXuLyPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see MotCuaPhanCongXuLyPersistence
 * @see MotCuaPhanCongXuLyPersistenceImpl
 * @generated
 */
public class MotCuaPhanCongXuLyUtil {
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
	public static void clearCache(MotCuaPhanCongXuLy motCuaPhanCongXuLy) {
		getPersistence().clearCache(motCuaPhanCongXuLy);
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
	public static List<MotCuaPhanCongXuLy> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MotCuaPhanCongXuLy> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MotCuaPhanCongXuLy> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static MotCuaPhanCongXuLy update(
		MotCuaPhanCongXuLy motCuaPhanCongXuLy) throws SystemException {
		return getPersistence().update(motCuaPhanCongXuLy);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static MotCuaPhanCongXuLy update(
		MotCuaPhanCongXuLy motCuaPhanCongXuLy, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(motCuaPhanCongXuLy, serviceContext);
	}

	/**
	* Returns the mot cua phan cong xu ly where phieuXuLyId = &#63; or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhanCongXuLyException} if it could not be found.
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @return the matching mot cua phan cong xu ly
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhanCongXuLyException if a matching mot cua phan cong xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhanCongXuLy findByF_UNI_PhieuXuLyId(
		long phieuXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhanCongXuLyException {
		return getPersistence().findByF_UNI_PhieuXuLyId(phieuXuLyId);
	}

	/**
	* Returns the mot cua phan cong xu ly where phieuXuLyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @return the matching mot cua phan cong xu ly, or <code>null</code> if a matching mot cua phan cong xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhanCongXuLy fetchByF_UNI_PhieuXuLyId(
		long phieuXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByF_UNI_PhieuXuLyId(phieuXuLyId);
	}

	/**
	* Returns the mot cua phan cong xu ly where phieuXuLyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching mot cua phan cong xu ly, or <code>null</code> if a matching mot cua phan cong xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhanCongXuLy fetchByF_UNI_PhieuXuLyId(
		long phieuXuLyId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByF_UNI_PhieuXuLyId(phieuXuLyId, retrieveFromCache);
	}

	/**
	* Removes the mot cua phan cong xu ly where phieuXuLyId = &#63; from the database.
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @return the mot cua phan cong xu ly that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhanCongXuLy removeByF_UNI_PhieuXuLyId(
		long phieuXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhanCongXuLyException {
		return getPersistence().removeByF_UNI_PhieuXuLyId(phieuXuLyId);
	}

	/**
	* Returns the number of mot cua phan cong xu lies where phieuXuLyId = &#63;.
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @return the number of matching mot cua phan cong xu lies
	* @throws SystemException if a system exception occurred
	*/
	public static int countByF_UNI_PhieuXuLyId(long phieuXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByF_UNI_PhieuXuLyId(phieuXuLyId);
	}

	/**
	* Returns all the mot cua phan cong xu lies where phieuXuLyId = &#63;.
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @return the matching mot cua phan cong xu lies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhanCongXuLy> findByPhieuXuLyId(
		long phieuXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPhieuXuLyId(phieuXuLyId);
	}

	/**
	* Returns a range of all the mot cua phan cong xu lies where phieuXuLyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaPhanCongXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @param start the lower bound of the range of mot cua phan cong xu lies
	* @param end the upper bound of the range of mot cua phan cong xu lies (not inclusive)
	* @return the range of matching mot cua phan cong xu lies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhanCongXuLy> findByPhieuXuLyId(
		long phieuXuLyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPhieuXuLyId(phieuXuLyId, start, end);
	}

	/**
	* Returns an ordered range of all the mot cua phan cong xu lies where phieuXuLyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaPhanCongXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @param start the lower bound of the range of mot cua phan cong xu lies
	* @param end the upper bound of the range of mot cua phan cong xu lies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mot cua phan cong xu lies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhanCongXuLy> findByPhieuXuLyId(
		long phieuXuLyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPhieuXuLyId(phieuXuLyId, start, end, orderByComparator);
	}

	/**
	* Returns the first mot cua phan cong xu ly in the ordered set where phieuXuLyId = &#63;.
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua phan cong xu ly
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhanCongXuLyException if a matching mot cua phan cong xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhanCongXuLy findByPhieuXuLyId_First(
		long phieuXuLyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhanCongXuLyException {
		return getPersistence()
				   .findByPhieuXuLyId_First(phieuXuLyId, orderByComparator);
	}

	/**
	* Returns the first mot cua phan cong xu ly in the ordered set where phieuXuLyId = &#63;.
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua phan cong xu ly, or <code>null</code> if a matching mot cua phan cong xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhanCongXuLy fetchByPhieuXuLyId_First(
		long phieuXuLyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPhieuXuLyId_First(phieuXuLyId, orderByComparator);
	}

	/**
	* Returns the last mot cua phan cong xu ly in the ordered set where phieuXuLyId = &#63;.
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua phan cong xu ly
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhanCongXuLyException if a matching mot cua phan cong xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhanCongXuLy findByPhieuXuLyId_Last(
		long phieuXuLyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhanCongXuLyException {
		return getPersistence()
				   .findByPhieuXuLyId_Last(phieuXuLyId, orderByComparator);
	}

	/**
	* Returns the last mot cua phan cong xu ly in the ordered set where phieuXuLyId = &#63;.
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua phan cong xu ly, or <code>null</code> if a matching mot cua phan cong xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhanCongXuLy fetchByPhieuXuLyId_Last(
		long phieuXuLyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPhieuXuLyId_Last(phieuXuLyId, orderByComparator);
	}

	/**
	* Returns the mot cua phan cong xu lies before and after the current mot cua phan cong xu ly in the ordered set where phieuXuLyId = &#63;.
	*
	* @param id the primary key of the current mot cua phan cong xu ly
	* @param phieuXuLyId the phieu xu ly ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mot cua phan cong xu ly
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhanCongXuLyException if a mot cua phan cong xu ly with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhanCongXuLy[] findByPhieuXuLyId_PrevAndNext(
		long id, long phieuXuLyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhanCongXuLyException {
		return getPersistence()
				   .findByPhieuXuLyId_PrevAndNext(id, phieuXuLyId,
			orderByComparator);
	}

	/**
	* Removes all the mot cua phan cong xu lies where phieuXuLyId = &#63; from the database.
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPhieuXuLyId(long phieuXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPhieuXuLyId(phieuXuLyId);
	}

	/**
	* Returns the number of mot cua phan cong xu lies where phieuXuLyId = &#63;.
	*
	* @param phieuXuLyId the phieu xu ly ID
	* @return the number of matching mot cua phan cong xu lies
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPhieuXuLyId(long phieuXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPhieuXuLyId(phieuXuLyId);
	}

	/**
	* Caches the mot cua phan cong xu ly in the entity cache if it is enabled.
	*
	* @param motCuaPhanCongXuLy the mot cua phan cong xu ly
	*/
	public static void cacheResult(
		vn.dtt.duongbo.dao.motcua.model.MotCuaPhanCongXuLy motCuaPhanCongXuLy) {
		getPersistence().cacheResult(motCuaPhanCongXuLy);
	}

	/**
	* Caches the mot cua phan cong xu lies in the entity cache if it is enabled.
	*
	* @param motCuaPhanCongXuLies the mot cua phan cong xu lies
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhanCongXuLy> motCuaPhanCongXuLies) {
		getPersistence().cacheResult(motCuaPhanCongXuLies);
	}

	/**
	* Creates a new mot cua phan cong xu ly with the primary key. Does not add the mot cua phan cong xu ly to the database.
	*
	* @param id the primary key for the new mot cua phan cong xu ly
	* @return the new mot cua phan cong xu ly
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhanCongXuLy create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the mot cua phan cong xu ly with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the mot cua phan cong xu ly
	* @return the mot cua phan cong xu ly that was removed
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhanCongXuLyException if a mot cua phan cong xu ly with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhanCongXuLy remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhanCongXuLyException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhanCongXuLy updateImpl(
		vn.dtt.duongbo.dao.motcua.model.MotCuaPhanCongXuLy motCuaPhanCongXuLy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(motCuaPhanCongXuLy);
	}

	/**
	* Returns the mot cua phan cong xu ly with the primary key or throws a {@link vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhanCongXuLyException} if it could not be found.
	*
	* @param id the primary key of the mot cua phan cong xu ly
	* @return the mot cua phan cong xu ly
	* @throws vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhanCongXuLyException if a mot cua phan cong xu ly with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhanCongXuLy findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.motcua.NoSuchMotCuaPhanCongXuLyException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the mot cua phan cong xu ly with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the mot cua phan cong xu ly
	* @return the mot cua phan cong xu ly, or <code>null</code> if a mot cua phan cong xu ly with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaPhanCongXuLy fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the mot cua phan cong xu lies.
	*
	* @return the mot cua phan cong xu lies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhanCongXuLy> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the mot cua phan cong xu lies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaPhanCongXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua phan cong xu lies
	* @param end the upper bound of the range of mot cua phan cong xu lies (not inclusive)
	* @return the range of mot cua phan cong xu lies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhanCongXuLy> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the mot cua phan cong xu lies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaPhanCongXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua phan cong xu lies
	* @param end the upper bound of the range of mot cua phan cong xu lies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of mot cua phan cong xu lies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaPhanCongXuLy> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the mot cua phan cong xu lies from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of mot cua phan cong xu lies.
	*
	* @return the number of mot cua phan cong xu lies
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static MotCuaPhanCongXuLyPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (MotCuaPhanCongXuLyPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.motcua.service.ClpSerializer.getServletContextName(),
					MotCuaPhanCongXuLyPersistence.class.getName());

			ReferenceRegistry.registerReference(MotCuaPhanCongXuLyUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(MotCuaPhanCongXuLyPersistence persistence) {
	}

	private static MotCuaPhanCongXuLyPersistence _persistence;
}