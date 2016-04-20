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
 * Provides a wrapper for {@link DmPortWharfLocalService}.
 *
 * @author longdm
 * @see DmPortWharfLocalService
 * @generated
 */
public class DmPortWharfLocalServiceWrapper implements DmPortWharfLocalService,
	ServiceWrapper<DmPortWharfLocalService> {
	public DmPortWharfLocalServiceWrapper(
		DmPortWharfLocalService dmPortWharfLocalService) {
		_dmPortWharfLocalService = dmPortWharfLocalService;
	}

	/**
	* Adds the dm port wharf to the database. Also notifies the appropriate model listeners.
	*
	* @param dmPortWharf the dm port wharf
	* @return the dm port wharf that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmPortWharf addDmPortWharf(
		vn.dtt.duongbien.dao.vrcb.model.DmPortWharf dmPortWharf)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmPortWharfLocalService.addDmPortWharf(dmPortWharf);
	}

	/**
	* Creates a new dm port wharf with the primary key. Does not add the dm port wharf to the database.
	*
	* @param id the primary key for the new dm port wharf
	* @return the new dm port wharf
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmPortWharf createDmPortWharf(int id) {
		return _dmPortWharfLocalService.createDmPortWharf(id);
	}

	/**
	* Deletes the dm port wharf with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm port wharf
	* @return the dm port wharf that was removed
	* @throws PortalException if a dm port wharf with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmPortWharf deleteDmPortWharf(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmPortWharfLocalService.deleteDmPortWharf(id);
	}

	/**
	* Deletes the dm port wharf from the database. Also notifies the appropriate model listeners.
	*
	* @param dmPortWharf the dm port wharf
	* @return the dm port wharf that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmPortWharf deleteDmPortWharf(
		vn.dtt.duongbien.dao.vrcb.model.DmPortWharf dmPortWharf)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmPortWharfLocalService.deleteDmPortWharf(dmPortWharf);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dmPortWharfLocalService.dynamicQuery();
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
		return _dmPortWharfLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortWharfModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dmPortWharfLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortWharfModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dmPortWharfLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _dmPortWharfLocalService.dynamicQueryCount(dynamicQuery);
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
		return _dmPortWharfLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmPortWharf fetchDmPortWharf(int id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmPortWharfLocalService.fetchDmPortWharf(id);
	}

	/**
	* Returns the dm port wharf with the primary key.
	*
	* @param id the primary key of the dm port wharf
	* @return the dm port wharf
	* @throws PortalException if a dm port wharf with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmPortWharf getDmPortWharf(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmPortWharfLocalService.getDmPortWharf(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmPortWharfLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm port wharfs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmPortWharfModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm port wharfs
	* @param end the upper bound of the range of dm port wharfs (not inclusive)
	* @return the range of dm port wharfs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmPortWharf> getDmPortWharfs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmPortWharfLocalService.getDmPortWharfs(start, end);
	}

	/**
	* Returns the number of dm port wharfs.
	*
	* @return the number of dm port wharfs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDmPortWharfsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmPortWharfLocalService.getDmPortWharfsCount();
	}

	/**
	* Updates the dm port wharf in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmPortWharf the dm port wharf
	* @return the dm port wharf that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmPortWharf updateDmPortWharf(
		vn.dtt.duongbien.dao.vrcb.model.DmPortWharf dmPortWharf)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmPortWharfLocalService.updateDmPortWharf(dmPortWharf);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dmPortWharfLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dmPortWharfLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dmPortWharfLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List getDmPortWharf()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmPortWharfLocalService.getDmPortWharf();
	}

	@Override
	public java.util.List findByPortWharfCode(java.lang.String portWharfCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmPortWharfLocalService.findByPortWharfCode(portWharfCode);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DmPortWharfLocalService getWrappedDmPortWharfLocalService() {
		return _dmPortWharfLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDmPortWharfLocalService(
		DmPortWharfLocalService dmPortWharfLocalService) {
		_dmPortWharfLocalService = dmPortWharfLocalService;
	}

	@Override
	public DmPortWharfLocalService getWrappedService() {
		return _dmPortWharfLocalService;
	}

	@Override
	public void setWrappedService(
		DmPortWharfLocalService dmPortWharfLocalService) {
		_dmPortWharfLocalService = dmPortWharfLocalService;
	}

	private DmPortWharfLocalService _dmPortWharfLocalService;
}