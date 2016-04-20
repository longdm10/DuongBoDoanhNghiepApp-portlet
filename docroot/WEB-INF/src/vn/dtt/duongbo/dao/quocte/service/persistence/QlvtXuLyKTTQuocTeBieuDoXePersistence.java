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

import vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXe;

/**
 * The persistence interface for the qlvt xu ly k t t quoc te bieu do xe service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NoiPham
 * @see QlvtXuLyKTTQuocTeBieuDoXePersistenceImpl
 * @see QlvtXuLyKTTQuocTeBieuDoXeUtil
 * @generated
 */
public interface QlvtXuLyKTTQuocTeBieuDoXePersistence extends BasePersistence<QlvtXuLyKTTQuocTeBieuDoXe> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QlvtXuLyKTTQuocTeBieuDoXeUtil} to access the qlvt xu ly k t t quoc te bieu do xe persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the qlvt xu ly k t t quoc te bieu do xe in the entity cache if it is enabled.
	*
	* @param qlvtXuLyKTTQuocTeBieuDoXe the qlvt xu ly k t t quoc te bieu do xe
	*/
	public void cacheResult(
		vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXe qlvtXuLyKTTQuocTeBieuDoXe);

	/**
	* Caches the qlvt xu ly k t t quoc te bieu do xes in the entity cache if it is enabled.
	*
	* @param qlvtXuLyKTTQuocTeBieuDoXes the qlvt xu ly k t t quoc te bieu do xes
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXe> qlvtXuLyKTTQuocTeBieuDoXes);

	/**
	* Creates a new qlvt xu ly k t t quoc te bieu do xe with the primary key. Does not add the qlvt xu ly k t t quoc te bieu do xe to the database.
	*
	* @param id the primary key for the new qlvt xu ly k t t quoc te bieu do xe
	* @return the new qlvt xu ly k t t quoc te bieu do xe
	*/
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXe create(
		long id);

	/**
	* Removes the qlvt xu ly k t t quoc te bieu do xe with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt xu ly k t t quoc te bieu do xe
	* @return the qlvt xu ly k t t quoc te bieu do xe that was removed
	* @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeBieuDoXeException if a qlvt xu ly k t t quoc te bieu do xe with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXe remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeBieuDoXeException;

	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXe updateImpl(
		vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXe qlvtXuLyKTTQuocTeBieuDoXe)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the qlvt xu ly k t t quoc te bieu do xe with the primary key or throws a {@link vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeBieuDoXeException} if it could not be found.
	*
	* @param id the primary key of the qlvt xu ly k t t quoc te bieu do xe
	* @return the qlvt xu ly k t t quoc te bieu do xe
	* @throws vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeBieuDoXeException if a qlvt xu ly k t t quoc te bieu do xe with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXe findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.quocte.NoSuchQlvtXuLyKTTQuocTeBieuDoXeException;

	/**
	* Returns the qlvt xu ly k t t quoc te bieu do xe with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the qlvt xu ly k t t quoc te bieu do xe
	* @return the qlvt xu ly k t t quoc te bieu do xe, or <code>null</code> if a qlvt xu ly k t t quoc te bieu do xe with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXe fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the qlvt xu ly k t t quoc te bieu do xes.
	*
	* @return the qlvt xu ly k t t quoc te bieu do xes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXe> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the qlvt xu ly k t t quoc te bieu do xes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTeBieuDoXeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt xu ly k t t quoc te bieu do xes
	* @param end the upper bound of the range of qlvt xu ly k t t quoc te bieu do xes (not inclusive)
	* @return the range of qlvt xu ly k t t quoc te bieu do xes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXe> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the qlvt xu ly k t t quoc te bieu do xes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.quocte.model.impl.QlvtXuLyKTTQuocTeBieuDoXeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt xu ly k t t quoc te bieu do xes
	* @param end the upper bound of the range of qlvt xu ly k t t quoc te bieu do xes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of qlvt xu ly k t t quoc te bieu do xes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.quocte.model.QlvtXuLyKTTQuocTeBieuDoXe> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the qlvt xu ly k t t quoc te bieu do xes from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of qlvt xu ly k t t quoc te bieu do xes.
	*
	* @return the number of qlvt xu ly k t t quoc te bieu do xes
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}