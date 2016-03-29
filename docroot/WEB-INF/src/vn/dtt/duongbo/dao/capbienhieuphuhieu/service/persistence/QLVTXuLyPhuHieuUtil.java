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

package vn.dtt.duongbo.dao.capbienhieuphuhieu.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu;

import java.util.List;

/**
 * The persistence utility for the q l v t xu ly phu hieu service. This utility wraps {@link QLVTXuLyPhuHieuPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author binhta
 * @see QLVTXuLyPhuHieuPersistence
 * @see QLVTXuLyPhuHieuPersistenceImpl
 * @generated
 */
public class QLVTXuLyPhuHieuUtil {
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
	public static void clearCache(QLVTXuLyPhuHieu qlvtXuLyPhuHieu) {
		getPersistence().clearCache(qlvtXuLyPhuHieu);
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
	public static List<QLVTXuLyPhuHieu> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QLVTXuLyPhuHieu> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QLVTXuLyPhuHieu> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static QLVTXuLyPhuHieu update(QLVTXuLyPhuHieu qlvtXuLyPhuHieu)
		throws SystemException {
		return getPersistence().update(qlvtXuLyPhuHieu);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static QLVTXuLyPhuHieu update(QLVTXuLyPhuHieu qlvtXuLyPhuHieu,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(qlvtXuLyPhuHieu, serviceContext);
	}

	/**
	* Returns the q l v t xu ly phu hieu where thongTinXuLyId = &#63; or throws a {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuException} if it could not be found.
	*
	* @param thongTinXuLyId the thong tin xu ly ID
	* @return the matching q l v t xu ly phu hieu
	* @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuException if a matching q l v t xu ly phu hieu could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu findBythongTinXuLyId(
		int thongTinXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuException {
		return getPersistence().findBythongTinXuLyId(thongTinXuLyId);
	}

	/**
	* Returns the q l v t xu ly phu hieu where thongTinXuLyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param thongTinXuLyId the thong tin xu ly ID
	* @return the matching q l v t xu ly phu hieu, or <code>null</code> if a matching q l v t xu ly phu hieu could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu fetchBythongTinXuLyId(
		int thongTinXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBythongTinXuLyId(thongTinXuLyId);
	}

	/**
	* Returns the q l v t xu ly phu hieu where thongTinXuLyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param thongTinXuLyId the thong tin xu ly ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching q l v t xu ly phu hieu, or <code>null</code> if a matching q l v t xu ly phu hieu could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu fetchBythongTinXuLyId(
		int thongTinXuLyId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBythongTinXuLyId(thongTinXuLyId, retrieveFromCache);
	}

	/**
	* Removes the q l v t xu ly phu hieu where thongTinXuLyId = &#63; from the database.
	*
	* @param thongTinXuLyId the thong tin xu ly ID
	* @return the q l v t xu ly phu hieu that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu removeBythongTinXuLyId(
		int thongTinXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuException {
		return getPersistence().removeBythongTinXuLyId(thongTinXuLyId);
	}

	/**
	* Returns the number of q l v t xu ly phu hieus where thongTinXuLyId = &#63;.
	*
	* @param thongTinXuLyId the thong tin xu ly ID
	* @return the number of matching q l v t xu ly phu hieus
	* @throws SystemException if a system exception occurred
	*/
	public static int countBythongTinXuLyId(int thongTinXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBythongTinXuLyId(thongTinXuLyId);
	}

	/**
	* Caches the q l v t xu ly phu hieu in the entity cache if it is enabled.
	*
	* @param qlvtXuLyPhuHieu the q l v t xu ly phu hieu
	*/
	public static void cacheResult(
		vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu qlvtXuLyPhuHieu) {
		getPersistence().cacheResult(qlvtXuLyPhuHieu);
	}

	/**
	* Caches the q l v t xu ly phu hieus in the entity cache if it is enabled.
	*
	* @param qlvtXuLyPhuHieus the q l v t xu ly phu hieus
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu> qlvtXuLyPhuHieus) {
		getPersistence().cacheResult(qlvtXuLyPhuHieus);
	}

	/**
	* Creates a new q l v t xu ly phu hieu with the primary key. Does not add the q l v t xu ly phu hieu to the database.
	*
	* @param id the primary key for the new q l v t xu ly phu hieu
	* @return the new q l v t xu ly phu hieu
	*/
	public static vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu create(
		int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the q l v t xu ly phu hieu with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the q l v t xu ly phu hieu
	* @return the q l v t xu ly phu hieu that was removed
	* @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuException if a q l v t xu ly phu hieu with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu remove(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu updateImpl(
		vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu qlvtXuLyPhuHieu)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(qlvtXuLyPhuHieu);
	}

	/**
	* Returns the q l v t xu ly phu hieu with the primary key or throws a {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuException} if it could not be found.
	*
	* @param id the primary key of the q l v t xu ly phu hieu
	* @return the q l v t xu ly phu hieu
	* @throws vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuException if a q l v t xu ly phu hieu with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu findByPrimaryKey(
		int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.capbienhieuphuhieu.NoSuchQLVTXuLyPhuHieuException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the q l v t xu ly phu hieu with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the q l v t xu ly phu hieu
	* @return the q l v t xu ly phu hieu, or <code>null</code> if a q l v t xu ly phu hieu with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the q l v t xu ly phu hieus.
	*
	* @return the q l v t xu ly phu hieus
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the q l v t xu ly phu hieus.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyPhuHieuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of q l v t xu ly phu hieus
	* @param end the upper bound of the range of q l v t xu ly phu hieus (not inclusive)
	* @return the range of q l v t xu ly phu hieus
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the q l v t xu ly phu hieus.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl.QLVTXuLyPhuHieuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of q l v t xu ly phu hieus
	* @param end the upper bound of the range of q l v t xu ly phu hieus (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of q l v t xu ly phu hieus
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTXuLyPhuHieu> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the q l v t xu ly phu hieus from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of q l v t xu ly phu hieus.
	*
	* @return the number of q l v t xu ly phu hieus
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static QLVTXuLyPhuHieuPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (QLVTXuLyPhuHieuPersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.capbienhieuphuhieu.service.ClpSerializer.getServletContextName(),
					QLVTXuLyPhuHieuPersistence.class.getName());

			ReferenceRegistry.registerReference(QLVTXuLyPhuHieuUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(QLVTXuLyPhuHieuPersistence persistence) {
	}

	private static QLVTXuLyPhuHieuPersistence _persistence;
}