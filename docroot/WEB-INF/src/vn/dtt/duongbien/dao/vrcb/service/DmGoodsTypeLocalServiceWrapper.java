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
 * Provides a wrapper for {@link DmGoodsTypeLocalService}.
 *
 * @author longdm
 * @see DmGoodsTypeLocalService
 * @generated
 */
public class DmGoodsTypeLocalServiceWrapper implements DmGoodsTypeLocalService,
	ServiceWrapper<DmGoodsTypeLocalService> {
	public DmGoodsTypeLocalServiceWrapper(
		DmGoodsTypeLocalService dmGoodsTypeLocalService) {
		_dmGoodsTypeLocalService = dmGoodsTypeLocalService;
	}

	/**
	* Adds the dm goods type to the database. Also notifies the appropriate model listeners.
	*
	* @param dmGoodsType the dm goods type
	* @return the dm goods type that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGoodsType addDmGoodsType(
		vn.dtt.duongbien.dao.vrcb.model.DmGoodsType dmGoodsType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGoodsTypeLocalService.addDmGoodsType(dmGoodsType);
	}

	/**
	* Creates a new dm goods type with the primary key. Does not add the dm goods type to the database.
	*
	* @param id the primary key for the new dm goods type
	* @return the new dm goods type
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGoodsType createDmGoodsType(int id) {
		return _dmGoodsTypeLocalService.createDmGoodsType(id);
	}

	/**
	* Deletes the dm goods type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm goods type
	* @return the dm goods type that was removed
	* @throws PortalException if a dm goods type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGoodsType deleteDmGoodsType(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmGoodsTypeLocalService.deleteDmGoodsType(id);
	}

	/**
	* Deletes the dm goods type from the database. Also notifies the appropriate model listeners.
	*
	* @param dmGoodsType the dm goods type
	* @return the dm goods type that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGoodsType deleteDmGoodsType(
		vn.dtt.duongbien.dao.vrcb.model.DmGoodsType dmGoodsType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGoodsTypeLocalService.deleteDmGoodsType(dmGoodsType);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dmGoodsTypeLocalService.dynamicQuery();
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
		return _dmGoodsTypeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGoodsTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dmGoodsTypeLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGoodsTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dmGoodsTypeLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _dmGoodsTypeLocalService.dynamicQueryCount(dynamicQuery);
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
		return _dmGoodsTypeLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGoodsType fetchDmGoodsType(int id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGoodsTypeLocalService.fetchDmGoodsType(id);
	}

	/**
	* Returns the dm goods type with the primary key.
	*
	* @param id the primary key of the dm goods type
	* @return the dm goods type
	* @throws PortalException if a dm goods type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGoodsType getDmGoodsType(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmGoodsTypeLocalService.getDmGoodsType(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmGoodsTypeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm goods types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGoodsTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm goods types
	* @param end the upper bound of the range of dm goods types (not inclusive)
	* @return the range of dm goods types
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGoodsType> getDmGoodsTypes(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGoodsTypeLocalService.getDmGoodsTypes(start, end);
	}

	/**
	* Returns the number of dm goods types.
	*
	* @return the number of dm goods types
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDmGoodsTypesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGoodsTypeLocalService.getDmGoodsTypesCount();
	}

	/**
	* Updates the dm goods type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmGoodsType the dm goods type
	* @return the dm goods type that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGoodsType updateDmGoodsType(
		vn.dtt.duongbien.dao.vrcb.model.DmGoodsType dmGoodsType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGoodsTypeLocalService.updateDmGoodsType(dmGoodsType);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dmGoodsTypeLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dmGoodsTypeLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dmGoodsTypeLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DmGoodsTypeLocalService getWrappedDmGoodsTypeLocalService() {
		return _dmGoodsTypeLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDmGoodsTypeLocalService(
		DmGoodsTypeLocalService dmGoodsTypeLocalService) {
		_dmGoodsTypeLocalService = dmGoodsTypeLocalService;
	}

	@Override
	public DmGoodsTypeLocalService getWrappedService() {
		return _dmGoodsTypeLocalService;
	}

	@Override
	public void setWrappedService(
		DmGoodsTypeLocalService dmGoodsTypeLocalService) {
		_dmGoodsTypeLocalService = dmGoodsTypeLocalService;
	}

	private DmGoodsTypeLocalService _dmGoodsTypeLocalService;
}