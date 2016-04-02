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
 * Provides a wrapper for {@link DmHistoryEnterriseLocalService}.
 *
 * @author longdm
 * @see DmHistoryEnterriseLocalService
 * @generated
 */
public class DmHistoryEnterriseLocalServiceWrapper
	implements DmHistoryEnterriseLocalService,
		ServiceWrapper<DmHistoryEnterriseLocalService> {
	public DmHistoryEnterriseLocalServiceWrapper(
		DmHistoryEnterriseLocalService dmHistoryEnterriseLocalService) {
		_dmHistoryEnterriseLocalService = dmHistoryEnterriseLocalService;
	}

	/**
	* Adds the dm history enterrise to the database. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryEnterrise the dm history enterrise
	* @return the dm history enterrise that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise addDmHistoryEnterrise(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise dmHistoryEnterrise)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryEnterriseLocalService.addDmHistoryEnterrise(dmHistoryEnterrise);
	}

	/**
	* Creates a new dm history enterrise with the primary key. Does not add the dm history enterrise to the database.
	*
	* @param id the primary key for the new dm history enterrise
	* @return the new dm history enterrise
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise createDmHistoryEnterrise(
		int id) {
		return _dmHistoryEnterriseLocalService.createDmHistoryEnterrise(id);
	}

	/**
	* Deletes the dm history enterrise with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm history enterrise
	* @return the dm history enterrise that was removed
	* @throws PortalException if a dm history enterrise with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise deleteDmHistoryEnterrise(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryEnterriseLocalService.deleteDmHistoryEnterrise(id);
	}

	/**
	* Deletes the dm history enterrise from the database. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryEnterrise the dm history enterrise
	* @return the dm history enterrise that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise deleteDmHistoryEnterrise(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise dmHistoryEnterrise)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryEnterriseLocalService.deleteDmHistoryEnterrise(dmHistoryEnterrise);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dmHistoryEnterriseLocalService.dynamicQuery();
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
		return _dmHistoryEnterriseLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryEnterriseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dmHistoryEnterriseLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryEnterriseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dmHistoryEnterriseLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
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
		return _dmHistoryEnterriseLocalService.dynamicQueryCount(dynamicQuery);
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
		return _dmHistoryEnterriseLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise fetchDmHistoryEnterrise(
		int id) throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryEnterriseLocalService.fetchDmHistoryEnterrise(id);
	}

	/**
	* Returns the dm history enterrise with the primary key.
	*
	* @param id the primary key of the dm history enterrise
	* @return the dm history enterrise
	* @throws PortalException if a dm history enterrise with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise getDmHistoryEnterrise(
		int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryEnterriseLocalService.getDmHistoryEnterrise(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryEnterriseLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm history enterrises.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmHistoryEnterriseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm history enterrises
	* @param end the upper bound of the range of dm history enterrises (not inclusive)
	* @return the range of dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise> getDmHistoryEnterrises(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryEnterriseLocalService.getDmHistoryEnterrises(start, end);
	}

	/**
	* Returns the number of dm history enterrises.
	*
	* @return the number of dm history enterrises
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDmHistoryEnterrisesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryEnterriseLocalService.getDmHistoryEnterrisesCount();
	}

	/**
	* Updates the dm history enterrise in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmHistoryEnterrise the dm history enterrise
	* @return the dm history enterrise that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise updateDmHistoryEnterrise(
		vn.dtt.duongbien.dao.vrcb.model.DmHistoryEnterrise dmHistoryEnterrise)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmHistoryEnterriseLocalService.updateDmHistoryEnterrise(dmHistoryEnterrise);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dmHistoryEnterriseLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dmHistoryEnterriseLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dmHistoryEnterriseLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DmHistoryEnterriseLocalService getWrappedDmHistoryEnterriseLocalService() {
		return _dmHistoryEnterriseLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDmHistoryEnterriseLocalService(
		DmHistoryEnterriseLocalService dmHistoryEnterriseLocalService) {
		_dmHistoryEnterriseLocalService = dmHistoryEnterriseLocalService;
	}

	@Override
	public DmHistoryEnterriseLocalService getWrappedService() {
		return _dmHistoryEnterriseLocalService;
	}

	@Override
	public void setWrappedService(
		DmHistoryEnterriseLocalService dmHistoryEnterriseLocalService) {
		_dmHistoryEnterriseLocalService = dmHistoryEnterriseLocalService;
	}

	private DmHistoryEnterriseLocalService _dmHistoryEnterriseLocalService;
}