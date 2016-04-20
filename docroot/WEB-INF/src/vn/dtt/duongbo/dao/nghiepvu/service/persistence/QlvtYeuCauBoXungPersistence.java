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

import vn.dtt.duongbo.dao.nghiepvu.model.QlvtYeuCauBoXung;

/**
 * The persistence interface for the qlvt yeu cau bo xung service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanNc
 * @see QlvtYeuCauBoXungPersistenceImpl
 * @see QlvtYeuCauBoXungUtil
 * @generated
 */
public interface QlvtYeuCauBoXungPersistence extends BasePersistence<QlvtYeuCauBoXung> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QlvtYeuCauBoXungUtil} to access the qlvt yeu cau bo xung persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the qlvt yeu cau bo xung in the entity cache if it is enabled.
	*
	* @param qlvtYeuCauBoXung the qlvt yeu cau bo xung
	*/
	public void cacheResult(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtYeuCauBoXung qlvtYeuCauBoXung);

	/**
	* Caches the qlvt yeu cau bo xungs in the entity cache if it is enabled.
	*
	* @param qlvtYeuCauBoXungs the qlvt yeu cau bo xungs
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtYeuCauBoXung> qlvtYeuCauBoXungs);

	/**
	* Creates a new qlvt yeu cau bo xung with the primary key. Does not add the qlvt yeu cau bo xung to the database.
	*
	* @param id the primary key for the new qlvt yeu cau bo xung
	* @return the new qlvt yeu cau bo xung
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtYeuCauBoXung create(long id);

	/**
	* Removes the qlvt yeu cau bo xung with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt yeu cau bo xung
	* @return the qlvt yeu cau bo xung that was removed
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtYeuCauBoXungException if a qlvt yeu cau bo xung with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtYeuCauBoXung remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtYeuCauBoXungException;

	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtYeuCauBoXung updateImpl(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtYeuCauBoXung qlvtYeuCauBoXung)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the qlvt yeu cau bo xung with the primary key or throws a {@link vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtYeuCauBoXungException} if it could not be found.
	*
	* @param id the primary key of the qlvt yeu cau bo xung
	* @return the qlvt yeu cau bo xung
	* @throws vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtYeuCauBoXungException if a qlvt yeu cau bo xung with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtYeuCauBoXung findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbo.dao.nghiepvu.NoSuchQlvtYeuCauBoXungException;

	/**
	* Returns the qlvt yeu cau bo xung with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the qlvt yeu cau bo xung
	* @return the qlvt yeu cau bo xung, or <code>null</code> if a qlvt yeu cau bo xung with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtYeuCauBoXung fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the qlvt yeu cau bo xungs.
	*
	* @return the qlvt yeu cau bo xungs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtYeuCauBoXung> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the qlvt yeu cau bo xungs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtYeuCauBoXungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt yeu cau bo xungs
	* @param end the upper bound of the range of qlvt yeu cau bo xungs (not inclusive)
	* @return the range of qlvt yeu cau bo xungs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtYeuCauBoXung> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the qlvt yeu cau bo xungs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtYeuCauBoXungModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt yeu cau bo xungs
	* @param end the upper bound of the range of qlvt yeu cau bo xungs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of qlvt yeu cau bo xungs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtYeuCauBoXung> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the qlvt yeu cau bo xungs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of qlvt yeu cau bo xungs.
	*
	* @return the number of qlvt yeu cau bo xungs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}