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

package vn.dtt.duongbien.dao.vrcb.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DmGoodsLocalService}.
 *
 * @author longdm
 * @see DmGoodsLocalService
 * @generated
 */
public class DmGoodsLocalServiceWrapper implements DmGoodsLocalService,
	ServiceWrapper<DmGoodsLocalService> {
	public DmGoodsLocalServiceWrapper(DmGoodsLocalService dmGoodsLocalService) {
		_dmGoodsLocalService = dmGoodsLocalService;
	}

	/**
	* Adds the dm goods to the database. Also notifies the appropriate model listeners.
	*
	* @param dmGoods the dm goods
	* @return the dm goods that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGoods addDmGoods(
		vn.dtt.duongbien.dao.vrcb.model.DmGoods dmGoods)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGoodsLocalService.addDmGoods(dmGoods);
	}

	/**
	* Creates a new dm goods with the primary key. Does not add the dm goods to the database.
	*
	* @param id the primary key for the new dm goods
	* @return the new dm goods
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGoods createDmGoods(int id) {
		return _dmGoodsLocalService.createDmGoods(id);
	}

	/**
	* Deletes the dm goods with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm goods
	* @return the dm goods that was removed
	* @throws PortalException if a dm goods with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGoods deleteDmGoods(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmGoodsLocalService.deleteDmGoods(id);
	}

	/**
	* Deletes the dm goods from the database. Also notifies the appropriate model listeners.
	*
	* @param dmGoods the dm goods
	* @return the dm goods that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGoods deleteDmGoods(
		vn.dtt.duongbien.dao.vrcb.model.DmGoods dmGoods)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGoodsLocalService.deleteDmGoods(dmGoods);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dmGoodsLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGoodsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGoodsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGoodsLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGoodsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGoodsLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGoodsLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGoodsLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGoods fetchDmGoods(int id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGoodsLocalService.fetchDmGoods(id);
	}

	/**
	* Returns the dm goods with the primary key.
	*
	* @param id the primary key of the dm goods
	* @return the dm goods
	* @throws PortalException if a dm goods with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGoods getDmGoods(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmGoodsLocalService.getDmGoods(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmGoodsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm goodses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGoodsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm goodses
	* @param end the upper bound of the range of dm goodses (not inclusive)
	* @return the range of dm goodses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGoods> getDmGoodses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGoodsLocalService.getDmGoodses(start, end);
	}

	/**
	* Returns the number of dm goodses.
	*
	* @return the number of dm goodses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDmGoodsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGoodsLocalService.getDmGoodsesCount();
	}

	/**
	* Updates the dm goods in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmGoods the dm goods
	* @return the dm goods that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGoods updateDmGoods(
		vn.dtt.duongbien.dao.vrcb.model.DmGoods dmGoods)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGoodsLocalService.updateDmGoods(dmGoods);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dmGoodsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dmGoodsLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dmGoodsLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DmGoodsLocalService getWrappedDmGoodsLocalService() {
		return _dmGoodsLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDmGoodsLocalService(
		DmGoodsLocalService dmGoodsLocalService) {
		_dmGoodsLocalService = dmGoodsLocalService;
	}

	@Override
	public DmGoodsLocalService getWrappedService() {
		return _dmGoodsLocalService;
	}

	@Override
	public void setWrappedService(DmGoodsLocalService dmGoodsLocalService) {
		_dmGoodsLocalService = dmGoodsLocalService;
	}

	private DmGoodsLocalService _dmGoodsLocalService;
}