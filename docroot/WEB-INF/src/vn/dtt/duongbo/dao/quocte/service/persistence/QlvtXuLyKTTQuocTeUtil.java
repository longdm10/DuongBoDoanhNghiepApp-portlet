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

package vn.dtt.duongbo.dao.quocte.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTe;

import java.util.List;

/**
 * The persistence utility for the qlvt xu ly k t t quoc te service. This utility wraps {@link QlvtXuLyKTTQuocTePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NoiPham
 * @see QlvtXuLyKTTQuocTePersistence
 * @see QlvtXuLyKTTQuocTePersistenceImpl
 * @generated
 */
public class QlvtXuLyKTTQuocTeUtil {
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
	public static void clearCache(QlvtXuLyKTTQuocTe qlvtXuLyKTTQuocTe) {
		getPersistence().clearCache(qlvtXuLyKTTQuocTe);
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
	public static List<QlvtXuLyKTTQuocTe> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QlvtXuLyKTTQuocTe> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QlvtXuLyKTTQuocTe> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static QlvtXuLyKTTQuocTe update(QlvtXuLyKTTQuocTe qlvtXuLyKTTQuocTe)
		throws SystemException {
		return getPersistence().update(qlvtXuLyKTTQuocTe);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static QlvtXuLyKTTQuocTe update(
		QlvtXuLyKTTQuocTe qlvtXuLyKTTQuocTe, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(qlvtXuLyKTTQuocTe, serviceContext);
	}

	/**
	* Returns the qlvt xu ly k t t quoc te where thongTinXuLyId = &#63; or throws a {@link vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeException} if it could not be found.
	*
	* @param thongTinXuLyId the thong tin xu ly ID
	* @return the matching qlvt xu ly k t t quoc te
	* @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeException if a matching qlvt xu ly k t t quoc te could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTe findBythongTinXuLyId(
		int thongTinXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeException {
		return getPersistence().findBythongTinXuLyId(thongTinXuLyId);
	}

	/**
	* Returns the qlvt xu ly k t t quoc te where thongTinXuLyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param thongTinXuLyId the thong tin xu ly ID
	* @return the matching qlvt xu ly k t t quoc te, or <code>null</code> if a matching qlvt xu ly k t t quoc te could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTe fetchBythongTinXuLyId(
		int thongTinXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBythongTinXuLyId(thongTinXuLyId);
	}

	/**
	* Returns the qlvt xu ly k t t quoc te where thongTinXuLyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param thongTinXuLyId the thong tin xu ly ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching qlvt xu ly k t t quoc te, or <code>null</code> if a matching qlvt xu ly k t t quoc te could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTe fetchBythongTinXuLyId(
		int thongTinXuLyId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBythongTinXuLyId(thongTinXuLyId, retrieveFromCache);
	}

	/**
	* Removes the qlvt xu ly k t t quoc te where thongTinXuLyId = &#63; from the database.
	*
	* @param thongTinXuLyId the thong tin xu ly ID
	* @return the qlvt xu ly k t t quoc te that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTe removeBythongTinXuLyId(
		int thongTinXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeException {
		return getPersistence().removeBythongTinXuLyId(thongTinXuLyId);
	}

	/**
	* Returns the number of qlvt xu ly k t t quoc tes where thongTinXuLyId = &#63;.
	*
	* @param thongTinXuLyId the thong tin xu ly ID
	* @return the number of matching qlvt xu ly k t t quoc tes
	* @throws SystemException if a system exception occurred
	*/
	public static int countBythongTinXuLyId(int thongTinXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBythongTinXuLyId(thongTinXuLyId);
	}

	/**
	* Caches the qlvt xu ly k t t quoc te in the entity cache if it is enabled.
	*
	* @param qlvtXuLyKTTQuocTe the qlvt xu ly k t t quoc te
	*/
	public static void cacheResult(
		vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTe qlvtXuLyKTTQuocTe) {
		getPersistence().cacheResult(qlvtXuLyKTTQuocTe);
	}

	/**
	* Caches the qlvt xu ly k t t quoc tes in the entity cache if it is enabled.
	*
	* @param qlvtXuLyKTTQuocTes the qlvt xu ly k t t quoc tes
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTe> qlvtXuLyKTTQuocTes) {
		getPersistence().cacheResult(qlvtXuLyKTTQuocTes);
	}

	/**
	* Creates a new qlvt xu ly k t t quoc te with the primary key. Does not add the qlvt xu ly k t t quoc te to the database.
	*
	* @param id the primary key for the new qlvt xu ly k t t quoc te
	* @return the new qlvt xu ly k t t quoc te
	*/
	public static vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTe create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the qlvt xu ly k t t quoc te with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt xu ly k t t quoc te
	* @return the qlvt xu ly k t t quoc te that was removed
	* @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeException if a qlvt xu ly k t t quoc te with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTe remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTe updateImpl(
		vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTe qlvtXuLyKTTQuocTe)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(qlvtXuLyKTTQuocTe);
	}

	/**
	* Returns the qlvt xu ly k t t quoc te with the primary key or throws a {@link vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeException} if it could not be found.
	*
	* @param id the primary key of the qlvt xu ly k t t quoc te
	* @return the qlvt xu ly k t t quoc te
	* @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeException if a qlvt xu ly k t t quoc te with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTe findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the qlvt xu ly k t t quoc te with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the qlvt xu ly k t t quoc te
	* @return the qlvt xu ly k t t quoc te, or <code>null</code> if a qlvt xu ly k t t quoc te with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTe fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the qlvt xu ly k t t quoc tes.
	*
	* @return the qlvt xu ly k t t quoc tes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTe> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the qlvt xu ly k t t quoc tes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt xu ly k t t quoc tes
	* @param end the upper bound of the range of qlvt xu ly k t t quoc tes (not inclusive)
	* @return the range of qlvt xu ly k t t quoc tes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTe> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the qlvt xu ly k t t quoc tes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt xu ly k t t quoc tes
	* @param end the upper bound of the range of qlvt xu ly k t t quoc tes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of qlvt xu ly k t t quoc tes
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTe> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the qlvt xu ly k t t quoc tes from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of qlvt xu ly k t t quoc tes.
	*
	* @return the number of qlvt xu ly k t t quoc tes
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static QlvtXuLyKTTQuocTePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (QlvtXuLyKTTQuocTePersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.quocte.service.ClpSerializer.getServletContextName(),
					QlvtXuLyKTTQuocTePersistence.class.getName());

			ReferenceRegistry.registerReference(QlvtXuLyKTTQuocTeUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(QlvtXuLyKTTQuocTePersistence persistence) {
	}

	private static QlvtXuLyKTTQuocTePersistence _persistence;
}