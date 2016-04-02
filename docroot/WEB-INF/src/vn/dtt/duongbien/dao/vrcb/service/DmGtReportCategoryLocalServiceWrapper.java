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
 * Provides a wrapper for {@link DmGtReportCategoryLocalService}.
 *
 * @author longdm
 * @see DmGtReportCategoryLocalService
 * @generated
 */
public class DmGtReportCategoryLocalServiceWrapper
	implements DmGtReportCategoryLocalService,
		ServiceWrapper<DmGtReportCategoryLocalService> {
	public DmGtReportCategoryLocalServiceWrapper(
		DmGtReportCategoryLocalService dmGtReportCategoryLocalService) {
		_dmGtReportCategoryLocalService = dmGtReportCategoryLocalService;
	}

	/**
	* Adds the dm gt report category to the database. Also notifies the appropriate model listeners.
	*
	* @param dmGtReportCategory the dm gt report category
	* @return the dm gt report category that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGtReportCategory addDmGtReportCategory(
		vn.dtt.duongbien.dao.vrcb.model.DmGtReportCategory dmGtReportCategory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGtReportCategoryLocalService.addDmGtReportCategory(dmGtReportCategory);
	}

	/**
	* Creates a new dm gt report category with the primary key. Does not add the dm gt report category to the database.
	*
	* @param id the primary key for the new dm gt report category
	* @return the new dm gt report category
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGtReportCategory createDmGtReportCategory(
		long id) {
		return _dmGtReportCategoryLocalService.createDmGtReportCategory(id);
	}

	/**
	* Deletes the dm gt report category with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm gt report category
	* @return the dm gt report category that was removed
	* @throws PortalException if a dm gt report category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGtReportCategory deleteDmGtReportCategory(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmGtReportCategoryLocalService.deleteDmGtReportCategory(id);
	}

	/**
	* Deletes the dm gt report category from the database. Also notifies the appropriate model listeners.
	*
	* @param dmGtReportCategory the dm gt report category
	* @return the dm gt report category that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGtReportCategory deleteDmGtReportCategory(
		vn.dtt.duongbien.dao.vrcb.model.DmGtReportCategory dmGtReportCategory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGtReportCategoryLocalService.deleteDmGtReportCategory(dmGtReportCategory);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dmGtReportCategoryLocalService.dynamicQuery();
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
		return _dmGtReportCategoryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGtReportCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dmGtReportCategoryLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGtReportCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dmGtReportCategoryLocalService.dynamicQuery(dynamicQuery,
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
		return _dmGtReportCategoryLocalService.dynamicQueryCount(dynamicQuery);
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
		return _dmGtReportCategoryLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGtReportCategory fetchDmGtReportCategory(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGtReportCategoryLocalService.fetchDmGtReportCategory(id);
	}

	/**
	* Returns the dm gt report category with the primary key.
	*
	* @param id the primary key of the dm gt report category
	* @return the dm gt report category
	* @throws PortalException if a dm gt report category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGtReportCategory getDmGtReportCategory(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmGtReportCategoryLocalService.getDmGtReportCategory(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmGtReportCategoryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dm gt report categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGtReportCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm gt report categories
	* @param end the upper bound of the range of dm gt report categories (not inclusive)
	* @return the range of dm gt report categories
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGtReportCategory> getDmGtReportCategories(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGtReportCategoryLocalService.getDmGtReportCategories(start,
			end);
	}

	/**
	* Returns the number of dm gt report categories.
	*
	* @return the number of dm gt report categories
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDmGtReportCategoriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGtReportCategoryLocalService.getDmGtReportCategoriesCount();
	}

	/**
	* Updates the dm gt report category in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmGtReportCategory the dm gt report category
	* @return the dm gt report category that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DmGtReportCategory updateDmGtReportCategory(
		vn.dtt.duongbien.dao.vrcb.model.DmGtReportCategory dmGtReportCategory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmGtReportCategoryLocalService.updateDmGtReportCategory(dmGtReportCategory);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dmGtReportCategoryLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dmGtReportCategoryLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dmGtReportCategoryLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DmGtReportCategoryLocalService getWrappedDmGtReportCategoryLocalService() {
		return _dmGtReportCategoryLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDmGtReportCategoryLocalService(
		DmGtReportCategoryLocalService dmGtReportCategoryLocalService) {
		_dmGtReportCategoryLocalService = dmGtReportCategoryLocalService;
	}

	@Override
	public DmGtReportCategoryLocalService getWrappedService() {
		return _dmGtReportCategoryLocalService;
	}

	@Override
	public void setWrappedService(
		DmGtReportCategoryLocalService dmGtReportCategoryLocalService) {
		_dmGtReportCategoryLocalService = dmGtReportCategoryLocalService;
	}

	private DmGtReportCategoryLocalService _dmGtReportCategoryLocalService;
}