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
 * Provides a wrapper for {@link DmHistoryGoodsLocalService}.
 *
 * @author longdm
 * @see DmHistoryGoodsLocalService
 * @generated
 */
public class DmHistoryGoodsLocalServiceWrapper
	implements DmHistoryGoodsLocalService,
		ServiceWrapper<DmHistoryGoodsLocalService> {
	public DmHistoryGoodsLocalServiceWrapper(
		DmHistoryGoodsLocalService dmHistoryGoodsLocalService) {
		_dmHistoryGoodsLocalService = dmHistoryGoodsLocalService;
	}

	/**
	* Adds the dm history goods to the database. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryGoods the dm history goods
	* @return the dm history goods that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods addDmHistoryGoods(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods dmHistoryGoods)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryGoodsLocalService.addDmHistoryGoods(dmHistoryGoods);
	}

	/**
	* Creates a new dm history goods with the primary key. Does not add the dm history goods to the database.
	*
	* @param id the primary key for the new dm history goods
	* @return the new dm history goods
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods createDmHistoryGoods(
		int id) {
		return _dmHistoryGoodsLocalService.createDmHistoryGoods(id);
	}

	/**
	* Deletes the dm history goods with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history goods
	* @return the dm history goods that was removed
	* @throws PortalException if a dm history goods with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods deleteDmHistoryGoods(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryGoodsLocalService.deleteDmHistoryGoods(id);
	}

	/**
	* Deletes the dm history goods from the database. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryGoods the dm history goods
	* @return the dm history goods that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods deleteDmHistoryGoods(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods dmHistoryGoods)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryGoodsLocalService.deleteDmHistoryGoods(dmHistoryGoods);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dmHistoryGoodsLocalService.dynamicQuery();
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
		return _dmHistoryGoodsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryGoodsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dmHistoryGoodsLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryGoodsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dmHistoryGoodsLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _dmHistoryGoodsLocalService.dynamicQueryCount(dynamicQuery);
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
		return _dmHistoryGoodsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods fetchDmHistoryGoods(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryGoodsLocalService.fetchDmHistoryGoods(id);
	}

	/**
	* Returns the dm history goods with the primary key.
	*
	* @param id the primary key of the dm history goods
	* @return the dm history goods
	* @throws PortalException if a dm history goods with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods getDmHistoryGoods(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryGoodsLocalService.getDmHistoryGoods(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryGoodsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm history goodses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryGoodsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm history goodses
	* @param end the upper bound of the range of dm history goodses (not inclusive)
	* @return the range of dm history goodses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods> getDmHistoryGoodses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryGoodsLocalService.getDmHistoryGoodses(start, end);
	}

	/**
	* Returns the number of dm history goodses.
	*
	* @return the number of dm history goodses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDmHistoryGoodsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryGoodsLocalService.getDmHistoryGoodsesCount();
	}

	/**
	* Updates the dm history goods in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryGoods the dm history goods
	* @return the dm history goods that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods updateDmHistoryGoods(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryGoods dmHistoryGoods)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryGoodsLocalService.updateDmHistoryGoods(dmHistoryGoods);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dmHistoryGoodsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dmHistoryGoodsLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dmHistoryGoodsLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DmHistoryGoodsLocalService getWrappedDmHistoryGoodsLocalService() {
		return _dmHistoryGoodsLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDmHistoryGoodsLocalService(
		DmHistoryGoodsLocalService dmHistoryGoodsLocalService) {
		_dmHistoryGoodsLocalService = dmHistoryGoodsLocalService;
	}

	@Override
	public DmHistoryGoodsLocalService getWrappedService() {
		return _dmHistoryGoodsLocalService;
	}

	@Override
	public void setWrappedService(
		DmHistoryGoodsLocalService dmHistoryGoodsLocalService) {
		_dmHistoryGoodsLocalService = dmHistoryGoodsLocalService;
	}

	private DmHistoryGoodsLocalService _dmHistoryGoodsLocalService;
}