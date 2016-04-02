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

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.duongbien.dao.vrcb.model.DmRankRating;

/**
 * The persistence interface for the dm rank rating service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmRankRatingPersistenceImpl
 * @see DmRankRatingUtil
 * @generated
 */
public interface DmRankRatingPersistence extends BasePersistence<DmRankRating> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmRankRatingUtil} to access the dm rank rating persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the dm rank ratings where rankCode = &#63;.
	*
	* @param rankCode the rank code
	* @return the matching dm rank ratings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmRankRating> findByRankCode(
		java.lang.String rankCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm rank ratings where rankCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmRankRatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param rankCode the rank code
	* @param start the lower bound of the range of dm rank ratings
	* @param end the upper bound of the range of dm rank ratings (not inclusive)
	* @return the range of matching dm rank ratings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmRankRating> findByRankCode(
		java.lang.String rankCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm rank ratings where rankCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmRankRatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param rankCode the rank code
	* @param start the lower bound of the range of dm rank ratings
	* @param end the upper bound of the range of dm rank ratings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm rank ratings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmRankRating> findByRankCode(
		java.lang.String rankCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm rank rating in the ordered set where rankCode = &#63;.
	*
	* @param rankCode the rank code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm rank rating
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmRankRatingException if a matching dm rank rating could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmRankRating findByRankCode_First(
		java.lang.String rankCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmRankRatingException;

	/**
	* Returns the first dm rank rating in the ordered set where rankCode = &#63;.
	*
	* @param rankCode the rank code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm rank rating, or <code>null</code> if a matching dm rank rating could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmRankRating fetchByRankCode_First(
		java.lang.String rankCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dm rank rating in the ordered set where rankCode = &#63;.
	*
	* @param rankCode the rank code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm rank rating
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmRankRatingException if a matching dm rank rating could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmRankRating findByRankCode_Last(
		java.lang.String rankCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmRankRatingException;

	/**
	* Returns the last dm rank rating in the ordered set where rankCode = &#63;.
	*
	* @param rankCode the rank code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm rank rating, or <code>null</code> if a matching dm rank rating could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmRankRating fetchByRankCode_Last(
		java.lang.String rankCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm rank ratings before and after the current dm rank rating in the ordered set where rankCode = &#63;.
	*
	* @param id the primary key of the current dm rank rating
	* @param rankCode the rank code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm rank rating
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmRankRatingException if a dm rank rating with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmRankRating[] findByRankCode_PrevAndNext(
		int id, java.lang.String rankCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmRankRatingException;

	/**
	* Removes all the dm rank ratings where rankCode = &#63; from the database.
	*
	* @param rankCode the rank code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByRankCode(java.lang.String rankCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm rank ratings where rankCode = &#63;.
	*
	* @param rankCode the rank code
	* @return the number of matching dm rank ratings
	* @throws SystemException if a system exception occurred
	*/
	public int countByRankCode(java.lang.String rankCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the dm rank rating in the entity cache if it is enabled.
	*
	* @param dmRankRating the dm rank rating
	*/
	public void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.DmRankRating dmRankRating);

	/**
	* Caches the dm rank ratings in the entity cache if it is enabled.
	*
	* @param dmRankRatings the dm rank ratings
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmRankRating> dmRankRatings);

	/**
	* Creates a new dm rank rating with the primary key. Does not add the dm rank rating to the database.
	*
	* @param id the primary key for the new dm rank rating
	* @return the new dm rank rating
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmRankRating create(int id);

	/**
	* Removes the dm rank rating with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm rank rating
	* @return the dm rank rating that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmRankRatingException if a dm rank rating with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmRankRating remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmRankRatingException;

	public vn.dtt.duongbien.dao.vrcb.model.DmRankRating updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmRankRating dmRankRating)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm rank rating with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmRankRatingException} if it could not be found.
	*
	* @param id the primary key of the dm rank rating
	* @return the dm rank rating
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmRankRatingException if a dm rank rating with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmRankRating findByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmRankRatingException;

	/**
	* Returns the dm rank rating with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm rank rating
	* @return the dm rank rating, or <code>null</code> if a dm rank rating with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmRankRating fetchByPrimaryKey(
		int id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm rank ratings.
	*
	* @return the dm rank ratings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmRankRating> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm rank ratings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmRankRatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm rank ratings
	* @param end the upper bound of the range of dm rank ratings (not inclusive)
	* @return the range of dm rank ratings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmRankRating> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm rank ratings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmRankRatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm rank ratings
	* @param end the upper bound of the range of dm rank ratings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm rank ratings
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmRankRating> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm rank ratings from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm rank ratings.
	*
	* @return the number of dm rank ratings
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}