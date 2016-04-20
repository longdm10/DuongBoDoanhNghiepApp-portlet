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

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile;

/**
 * The persistence interface for the qlvt quan ly file service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanNc
 * @see QlvtQuanLyFilePersistenceImpl
 * @see QlvtQuanLyFileUtil
 * @generated
 */
public interface QlvtQuanLyFilePersistence extends BasePersistence<QlvtQuanLyFile> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QlvtQuanLyFileUtil} to access the qlvt quan ly file persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the qlvt quan ly files where doanhNghiepId = &#63;.
	*
	* @param doanhNghiepId the doanh nghiep ID
	* @return the matching qlvt quan ly files
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile> findByDoanhNghiepId(
		long doanhNghiepId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile> findByDoanhNghiepId(
		long doanhNghiepId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile> findByDoanhNghiepId(
		long doanhNghiepId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first qlvt quan ly file in the ordered set where doanhNghiepId = &#63;.
	*
	* @param doanhNghiepId the doanh nghiep ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching qlvt quan ly file
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException if a matching qlvt quan ly file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile findByDoanhNghiepId_First(
		long doanhNghiepId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException;

	/**
	* Returns the first qlvt quan ly file in the ordered set where doanhNghiepId = &#63;.
	*
	* @param doanhNghiepId the doanh nghiep ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching qlvt quan ly file, or <code>null</code> if a matching qlvt quan ly file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile fetchByDoanhNghiepId_First(
		long doanhNghiepId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last qlvt quan ly file in the ordered set where doanhNghiepId = &#63;.
	*
	* @param doanhNghiepId the doanh nghiep ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching qlvt quan ly file
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException if a matching qlvt quan ly file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile findByDoanhNghiepId_Last(
		long doanhNghiepId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException;

	/**
	* Returns the last qlvt quan ly file in the ordered set where doanhNghiepId = &#63;.
	*
	* @param doanhNghiepId the doanh nghiep ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching qlvt quan ly file, or <code>null</code> if a matching qlvt quan ly file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile fetchByDoanhNghiepId_Last(
		long doanhNghiepId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile[] findByDoanhNghiepId_PrevAndNext(
		long id, long doanhNghiepId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException;

	/**
	* Removes all the qlvt quan ly files where doanhNghiepId = &#63; from the database.
	*
	* @param doanhNghiepId the doanh nghiep ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDoanhNghiepId(long doanhNghiepId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of qlvt quan ly files where doanhNghiepId = &#63;.
	*
	* @param doanhNghiepId the doanh nghiep ID
	* @return the number of matching qlvt quan ly files
	* @throws SystemException if a system exception occurred
	*/
	public int countByDoanhNghiepId(long doanhNghiepId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the qlvt quan ly file where idFile = &#63; or throws a {@link vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException} if it could not be found.
	*
	* @param idFile the id file
	* @return the matching qlvt quan ly file
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException if a matching qlvt quan ly file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile findByIdFile(
		long idFile)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException;

	/**
	* Returns the qlvt quan ly file where idFile = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param idFile the id file
	* @return the matching qlvt quan ly file, or <code>null</code> if a matching qlvt quan ly file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile fetchByIdFile(
		long idFile) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the qlvt quan ly file where idFile = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param idFile the id file
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching qlvt quan ly file, or <code>null</code> if a matching qlvt quan ly file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile fetchByIdFile(
		long idFile, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the qlvt quan ly file where idFile = &#63; from the database.
	*
	* @param idFile the id file
	* @return the qlvt quan ly file that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile removeByIdFile(
		long idFile)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException;

	/**
	* Returns the number of qlvt quan ly files where idFile = &#63;.
	*
	* @param idFile the id file
	* @return the number of matching qlvt quan ly files
	* @throws SystemException if a system exception occurred
	*/
	public int countByIdFile(long idFile)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the qlvt quan ly file where idFile = &#63; and doanhNghiepId = &#63; or throws a {@link vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException} if it could not be found.
	*
	* @param idFile the id file
	* @param doanhNghiepId the doanh nghiep ID
	* @return the matching qlvt quan ly file
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException if a matching qlvt quan ly file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile findByIdFileAndDoanhNghiepID(
		long idFile, long doanhNghiepId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException;

	/**
	* Returns the qlvt quan ly file where idFile = &#63; and doanhNghiepId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param idFile the id file
	* @param doanhNghiepId the doanh nghiep ID
	* @return the matching qlvt quan ly file, or <code>null</code> if a matching qlvt quan ly file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile fetchByIdFileAndDoanhNghiepID(
		long idFile, long doanhNghiepId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the qlvt quan ly file where idFile = &#63; and doanhNghiepId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param idFile the id file
	* @param doanhNghiepId the doanh nghiep ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching qlvt quan ly file, or <code>null</code> if a matching qlvt quan ly file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile fetchByIdFileAndDoanhNghiepID(
		long idFile, long doanhNghiepId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the qlvt quan ly file where idFile = &#63; and doanhNghiepId = &#63; from the database.
	*
	* @param idFile the id file
	* @param doanhNghiepId the doanh nghiep ID
	* @return the qlvt quan ly file that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile removeByIdFileAndDoanhNghiepID(
		long idFile, long doanhNghiepId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException;

	/**
	* Returns the number of qlvt quan ly files where idFile = &#63; and doanhNghiepId = &#63;.
	*
	* @param idFile the id file
	* @param doanhNghiepId the doanh nghiep ID
	* @return the number of matching qlvt quan ly files
	* @throws SystemException if a system exception occurred
	*/
	public int countByIdFileAndDoanhNghiepID(long idFile, long doanhNghiepId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the qlvt quan ly file in the entity cache if it is enabled.
	*
	* @param qlvtQuanLyFile the qlvt quan ly file
	*/
	public void cacheResult(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile qlvtQuanLyFile);

	/**
	* Caches the qlvt quan ly files in the entity cache if it is enabled.
	*
	* @param qlvtQuanLyFiles the qlvt quan ly files
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile> qlvtQuanLyFiles);

	/**
	* Creates a new qlvt quan ly file with the primary key. Does not add the qlvt quan ly file to the database.
	*
	* @param id the primary key for the new qlvt quan ly file
	* @return the new qlvt quan ly file
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile create(long id);

	/**
	* Removes the qlvt quan ly file with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt quan ly file
	* @return the qlvt quan ly file that was removed
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException if a qlvt quan ly file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException;

	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile updateImpl(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile qlvtQuanLyFile)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the qlvt quan ly file with the primary key or throws a {@link vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException} if it could not be found.
	*
	* @param id the primary key of the qlvt quan ly file
	* @return the qlvt quan ly file
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException if a qlvt quan ly file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtQuanLyFileException;

	/**
	* Returns the qlvt quan ly file with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the qlvt quan ly file
	* @return the qlvt quan ly file, or <code>null</code> if a qlvt quan ly file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the qlvt quan ly files.
	*
	* @return the qlvt quan ly files
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the qlvt quan ly files from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of qlvt quan ly files.
	*
	* @return the number of qlvt quan ly files
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}