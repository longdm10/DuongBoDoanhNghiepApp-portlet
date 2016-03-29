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

package vn.dtt.duongbo.dao.nghiepvu.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile;

import java.util.List;

/**
 * The persistence utility for the qlvt quan ly file service. This utility wraps {@link QlvtQuanLyFilePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanNc
 * @see QlvtQuanLyFilePersistence
 * @see QlvtQuanLyFilePersistenceImpl
 * @generated
 */
public class QlvtQuanLyFileUtil {
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
	public static void clearCache(QlvtQuanLyFile qlvtQuanLyFile) {
		getPersistence().clearCache(qlvtQuanLyFile);
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
	public static List<QlvtQuanLyFile> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QlvtQuanLyFile> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QlvtQuanLyFile> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static QlvtQuanLyFile update(QlvtQuanLyFile qlvtQuanLyFile)
		throws SystemException {
		return getPersistence().update(qlvtQuanLyFile);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static QlvtQuanLyFile update(QlvtQuanLyFile qlvtQuanLyFile,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(qlvtQuanLyFile, serviceContext);
	}

	/**
	* Returns all the qlvt quan ly files where doanhNghiepId = &#63;.
	*
	* @param doanhNghiepId the doanh nghiep ID
	* @return the matching qlvt quan ly files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile> findByDoanhNghiepId(
		long doanhNghiepId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDoanhNghiepId(doanhNghiepId);
	}

	/**
	* Returns a range of all the qlvt quan ly files where doanhNghiepId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtQuanLyFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param doanhNghiepId the doanh nghiep ID
	* @param start the lower bound of the range of qlvt quan ly files
	* @param end the upper bound of the range of qlvt quan ly files (not inclusive)
	* @return the range of matching qlvt quan ly files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile> findByDoanhNghiepId(
		long doanhNghiepId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDoanhNghiepId(doanhNghiepId, start, end);
	}

	/**
	* Returns an ordered range of all the qlvt quan ly files where doanhNghiepId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtQuanLyFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param doanhNghiepId the doanh nghiep ID
	* @param start the lower bound of the range of qlvt quan ly files
	* @param end the upper bound of the range of qlvt quan ly files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching qlvt quan ly files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile> findByDoanhNghiepId(
		long doanhNghiepId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDoanhNghiepId(doanhNghiepId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first qlvt quan ly file in the ordered set where doanhNghiepId = &#63;.
	*
	* @param doanhNghiepId the doanh nghiep ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching qlvt quan ly file
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException if a matching qlvt quan ly file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile findByDoanhNghiepId_First(
		long doanhNghiepId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException {
		return getPersistence()
				   .findByDoanhNghiepId_First(doanhNghiepId, orderByComparator);
	}

	/**
	* Returns the first qlvt quan ly file in the ordered set where doanhNghiepId = &#63;.
	*
	* @param doanhNghiepId the doanh nghiep ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching qlvt quan ly file, or <code>null</code> if a matching qlvt quan ly file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile fetchByDoanhNghiepId_First(
		long doanhNghiepId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDoanhNghiepId_First(doanhNghiepId, orderByComparator);
	}

	/**
	* Returns the last qlvt quan ly file in the ordered set where doanhNghiepId = &#63;.
	*
	* @param doanhNghiepId the doanh nghiep ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching qlvt quan ly file
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException if a matching qlvt quan ly file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile findByDoanhNghiepId_Last(
		long doanhNghiepId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException {
		return getPersistence()
				   .findByDoanhNghiepId_Last(doanhNghiepId, orderByComparator);
	}

	/**
	* Returns the last qlvt quan ly file in the ordered set where doanhNghiepId = &#63;.
	*
	* @param doanhNghiepId the doanh nghiep ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching qlvt quan ly file, or <code>null</code> if a matching qlvt quan ly file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile fetchByDoanhNghiepId_Last(
		long doanhNghiepId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDoanhNghiepId_Last(doanhNghiepId, orderByComparator);
	}

	/**
	* Returns the qlvt quan ly files before and after the current qlvt quan ly file in the ordered set where doanhNghiepId = &#63;.
	*
	* @param id the primary key of the current qlvt quan ly file
	* @param doanhNghiepId the doanh nghiep ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next qlvt quan ly file
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException if a qlvt quan ly file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile[] findByDoanhNghiepId_PrevAndNext(
		long id, long doanhNghiepId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException {
		return getPersistence()
				   .findByDoanhNghiepId_PrevAndNext(id, doanhNghiepId,
			orderByComparator);
	}

	/**
	* Removes all the qlvt quan ly files where doanhNghiepId = &#63; from the database.
	*
	* @param doanhNghiepId the doanh nghiep ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDoanhNghiepId(long doanhNghiepId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDoanhNghiepId(doanhNghiepId);
	}

	/**
	* Returns the number of qlvt quan ly files where doanhNghiepId = &#63;.
	*
	* @param doanhNghiepId the doanh nghiep ID
	* @return the number of matching qlvt quan ly files
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDoanhNghiepId(long doanhNghiepId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDoanhNghiepId(doanhNghiepId);
	}

	/**
	* Returns the qlvt quan ly file where idFile = &#63; or throws a {@link vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException} if it could not be found.
	*
	* @param idFile the id file
	* @return the matching qlvt quan ly file
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException if a matching qlvt quan ly file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile findByIdFile(
		long idFile)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException {
		return getPersistence().findByIdFile(idFile);
	}

	/**
	* Returns the qlvt quan ly file where idFile = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param idFile the id file
	* @return the matching qlvt quan ly file, or <code>null</code> if a matching qlvt quan ly file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile fetchByIdFile(
		long idFile) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByIdFile(idFile);
	}

	/**
	* Returns the qlvt quan ly file where idFile = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param idFile the id file
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching qlvt quan ly file, or <code>null</code> if a matching qlvt quan ly file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile fetchByIdFile(
		long idFile, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByIdFile(idFile, retrieveFromCache);
	}

	/**
	* Removes the qlvt quan ly file where idFile = &#63; from the database.
	*
	* @param idFile the id file
	* @return the qlvt quan ly file that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile removeByIdFile(
		long idFile)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException {
		return getPersistence().removeByIdFile(idFile);
	}

	/**
	* Returns the number of qlvt quan ly files where idFile = &#63;.
	*
	* @param idFile the id file
	* @return the number of matching qlvt quan ly files
	* @throws SystemException if a system exception occurred
	*/
	public static int countByIdFile(long idFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByIdFile(idFile);
	}

	/**
	* Returns the qlvt quan ly file where idFile = &#63; and doanhNghiepId = &#63; or throws a {@link vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException} if it could not be found.
	*
	* @param idFile the id file
	* @param doanhNghiepId the doanh nghiep ID
	* @return the matching qlvt quan ly file
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException if a matching qlvt quan ly file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile findByIdFileAndDoanhNghiepID(
		long idFile, long doanhNghiepId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException {
		return getPersistence()
				   .findByIdFileAndDoanhNghiepID(idFile, doanhNghiepId);
	}

	/**
	* Returns the qlvt quan ly file where idFile = &#63; and doanhNghiepId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param idFile the id file
	* @param doanhNghiepId the doanh nghiep ID
	* @return the matching qlvt quan ly file, or <code>null</code> if a matching qlvt quan ly file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile fetchByIdFileAndDoanhNghiepID(
		long idFile, long doanhNghiepId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByIdFileAndDoanhNghiepID(idFile, doanhNghiepId);
	}

	/**
	* Returns the qlvt quan ly file where idFile = &#63; and doanhNghiepId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param idFile the id file
	* @param doanhNghiepId the doanh nghiep ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching qlvt quan ly file, or <code>null</code> if a matching qlvt quan ly file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile fetchByIdFileAndDoanhNghiepID(
		long idFile, long doanhNghiepId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByIdFileAndDoanhNghiepID(idFile, doanhNghiepId,
			retrieveFromCache);
	}

	/**
	* Removes the qlvt quan ly file where idFile = &#63; and doanhNghiepId = &#63; from the database.
	*
	* @param idFile the id file
	* @param doanhNghiepId the doanh nghiep ID
	* @return the qlvt quan ly file that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile removeByIdFileAndDoanhNghiepID(
		long idFile, long doanhNghiepId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException {
		return getPersistence()
				   .removeByIdFileAndDoanhNghiepID(idFile, doanhNghiepId);
	}

	/**
	* Returns the number of qlvt quan ly files where idFile = &#63; and doanhNghiepId = &#63;.
	*
	* @param idFile the id file
	* @param doanhNghiepId the doanh nghiep ID
	* @return the number of matching qlvt quan ly files
	* @throws SystemException if a system exception occurred
	*/
	public static int countByIdFileAndDoanhNghiepID(long idFile,
		long doanhNghiepId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByIdFileAndDoanhNghiepID(idFile, doanhNghiepId);
	}

	/**
	* Caches the qlvt quan ly file in the entity cache if it is enabled.
	*
	* @param qlvtQuanLyFile the qlvt quan ly file
	*/
	public static void cacheResult(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile qlvtQuanLyFile) {
		getPersistence().cacheResult(qlvtQuanLyFile);
	}

	/**
	* Caches the qlvt quan ly files in the entity cache if it is enabled.
	*
	* @param qlvtQuanLyFiles the qlvt quan ly files
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile> qlvtQuanLyFiles) {
		getPersistence().cacheResult(qlvtQuanLyFiles);
	}

	/**
	* Creates a new qlvt quan ly file with the primary key. Does not add the qlvt quan ly file to the database.
	*
	* @param id the primary key for the new qlvt quan ly file
	* @return the new qlvt quan ly file
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the qlvt quan ly file with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt quan ly file
	* @return the qlvt quan ly file that was removed
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException if a qlvt quan ly file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile updateImpl(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile qlvtQuanLyFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(qlvtQuanLyFile);
	}

	/**
	* Returns the qlvt quan ly file with the primary key or throws a {@link vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException} if it could not be found.
	*
	* @param id the primary key of the qlvt quan ly file
	* @return the qlvt quan ly file
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException if a qlvt quan ly file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the qlvt quan ly file with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the qlvt quan ly file
	* @return the qlvt quan ly file, or <code>null</code> if a qlvt quan ly file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the qlvt quan ly files.
	*
	* @return the qlvt quan ly files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the qlvt quan ly files.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtQuanLyFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt quan ly files
	* @param end the upper bound of the range of qlvt quan ly files (not inclusive)
	* @return the range of qlvt quan ly files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the qlvt quan ly files.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtQuanLyFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt quan ly files
	* @param end the upper bound of the range of qlvt quan ly files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of qlvt quan ly files
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the qlvt quan ly files from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of qlvt quan ly files.
	*
	* @return the number of qlvt quan ly files
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static QlvtQuanLyFilePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (QlvtQuanLyFilePersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					QlvtQuanLyFilePersistence.class.getName());

			ReferenceRegistry.registerReference(QlvtQuanLyFileUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(QlvtQuanLyFilePersistence persistence) {
	}

	private static QlvtQuanLyFilePersistence _persistence;
}