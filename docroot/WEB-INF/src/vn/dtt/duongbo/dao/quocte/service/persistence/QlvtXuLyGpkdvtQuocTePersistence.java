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

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTe;

/**
 * The persistence interface for the qlvt xu ly gpkdvt quoc te service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NoiPham
 * @see QlvtXuLyGpkdvtQuocTePersistenceImpl
 * @see QlvtXuLyGpkdvtQuocTeUtil
 * @generated
 */
public interface QlvtXuLyGpkdvtQuocTePersistence extends BasePersistence<QlvtXuLyGpkdvtQuocTe> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QlvtXuLyGpkdvtQuocTeUtil} to access the qlvt xu ly gpkdvt quoc te persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the qlvt xu ly gpkdvt quoc te where thongTinXuLyId = &#63; or throws a {@link vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyGpkdvtQuocTeException} if it could not be found.
	*
	* @param thongTinXuLyId the thong tin xu ly ID
	* @return the matching qlvt xu ly gpkdvt quoc te
	* @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyGpkdvtQuocTeException if a matching qlvt xu ly gpkdvt quoc te could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTe findBythongTinXuLyId(
		int thongTinXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyGpkdvtQuocTeException;

	/**
	* Returns the qlvt xu ly gpkdvt quoc te where thongTinXuLyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param thongTinXuLyId the thong tin xu ly ID
	* @return the matching qlvt xu ly gpkdvt quoc te, or <code>null</code> if a matching qlvt xu ly gpkdvt quoc te could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTe fetchBythongTinXuLyId(
		int thongTinXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the qlvt xu ly gpkdvt quoc te where thongTinXuLyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param thongTinXuLyId the thong tin xu ly ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching qlvt xu ly gpkdvt quoc te, or <code>null</code> if a matching qlvt xu ly gpkdvt quoc te could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTe fetchBythongTinXuLyId(
		int thongTinXuLyId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the qlvt xu ly gpkdvt quoc te where thongTinXuLyId = &#63; from the database.
	*
	* @param thongTinXuLyId the thong tin xu ly ID
	* @return the qlvt xu ly gpkdvt quoc te that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTe removeBythongTinXuLyId(
		int thongTinXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyGpkdvtQuocTeException;

	/**
	* Returns the number of qlvt xu ly gpkdvt quoc tes where thongTinXuLyId = &#63;.
	*
	* @param thongTinXuLyId the thong tin xu ly ID
	* @return the number of matching qlvt xu ly gpkdvt quoc tes
	* @throws SystemException if a system exception occurred
	*/
	public int countBythongTinXuLyId(int thongTinXuLyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the qlvt xu ly gpkdvt quoc te in the entity cache if it is enabled.
	*
	* @param qlvtXuLyGpkdvtQuocTe the qlvt xu ly gpkdvt quoc te
	*/
	public void cacheResult(
		vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTe qlvtXuLyGpkdvtQuocTe);

	/**
	* Caches the qlvt xu ly gpkdvt quoc tes in the entity cache if it is enabled.
	*
	* @param qlvtXuLyGpkdvtQuocTes the qlvt xu ly gpkdvt quoc tes
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTe> qlvtXuLyGpkdvtQuocTes);

	/**
	* Creates a new qlvt xu ly gpkdvt quoc te with the primary key. Does not add the qlvt xu ly gpkdvt quoc te to the database.
	*
	* @param id the primary key for the new qlvt xu ly gpkdvt quoc te
	* @return the new qlvt xu ly gpkdvt quoc te
	*/
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTe create(long id);

	/**
	* Removes the qlvt xu ly gpkdvt quoc te with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt xu ly gpkdvt quoc te
	* @return the qlvt xu ly gpkdvt quoc te that was removed
	* @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyGpkdvtQuocTeException if a qlvt xu ly gpkdvt quoc te with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTe remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyGpkdvtQuocTeException;

	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTe updateImpl(
		vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTe qlvtXuLyGpkdvtQuocTe)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the qlvt xu ly gpkdvt quoc te with the primary key or throws a {@link vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyGpkdvtQuocTeException} if it could not be found.
	*
	* @param id the primary key of the qlvt xu ly gpkdvt quoc te
	* @return the qlvt xu ly gpkdvt quoc te
	* @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyGpkdvtQuocTeException if a qlvt xu ly gpkdvt quoc te with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTe findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyGpkdvtQuocTeException;

	/**
	* Returns the qlvt xu ly gpkdvt quoc te with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the qlvt xu ly gpkdvt quoc te
	* @return the qlvt xu ly gpkdvt quoc te, or <code>null</code> if a qlvt xu ly gpkdvt quoc te with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTe fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the qlvt xu ly gpkdvt quoc tes.
	*
	* @return the qlvt xu ly gpkdvt quoc tes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTe> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the qlvt xu ly gpkdvt quoc tes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyGpkdvtQuocTeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt xu ly gpkdvt quoc tes
	* @param end the upper bound of the range of qlvt xu ly gpkdvt quoc tes (not inclusive)
	* @return the range of qlvt xu ly gpkdvt quoc tes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTe> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the qlvt xu ly gpkdvt quoc tes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyGpkdvtQuocTeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt xu ly gpkdvt quoc tes
	* @param end the upper bound of the range of qlvt xu ly gpkdvt quoc tes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of qlvt xu ly gpkdvt quoc tes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyGpkdvtQuocTe> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the qlvt xu ly gpkdvt quoc tes from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of qlvt xu ly gpkdvt quoc tes.
	*
	* @return the number of qlvt xu ly gpkdvt quoc tes
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}