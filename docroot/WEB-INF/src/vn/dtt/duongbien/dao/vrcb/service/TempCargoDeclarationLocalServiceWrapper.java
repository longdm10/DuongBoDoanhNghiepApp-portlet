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
 * Provides a wrapper for {@link TempCargoDeclarationLocalService}.
 *
 * @author longdm
 * @see TempCargoDeclarationLocalService
 * @generated
 */
public class TempCargoDeclarationLocalServiceWrapper
	implements TempCargoDeclarationLocalService,
		ServiceWrapper<TempCargoDeclarationLocalService> {
	public TempCargoDeclarationLocalServiceWrapper(
		TempCargoDeclarationLocalService tempCargoDeclarationLocalService) {
		_tempCargoDeclarationLocalService = tempCargoDeclarationLocalService;
	}

	/**
	* Adds the temp cargo declaration to the database. Also notifies the appropriate model listeners.
	*
	* @param tempCargoDeclaration the temp cargo declaration
	* @return the temp cargo declaration that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempCargoDeclaration addTempCargoDeclaration(
		vn.dtt.duongbien.dao.vrcb.model.TempCargoDeclaration tempCargoDeclaration)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempCargoDeclarationLocalService.addTempCargoDeclaration(tempCargoDeclaration);
	}

	/**
	* Creates a new temp cargo declaration with the primary key. Does not add the temp cargo declaration to the database.
	*
	* @param id the primary key for the new temp cargo declaration
	* @return the new temp cargo declaration
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempCargoDeclaration createTempCargoDeclaration(
		long id) {
		return _tempCargoDeclarationLocalService.createTempCargoDeclaration(id);
	}

	/**
	* Deletes the temp cargo declaration with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the temp cargo declaration
	* @return the temp cargo declaration that was removed
	* @throws PortalException if a temp cargo declaration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempCargoDeclaration deleteTempCargoDeclaration(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempCargoDeclarationLocalService.deleteTempCargoDeclaration(id);
	}

	/**
	* Deletes the temp cargo declaration from the database. Also notifies the appropriate model listeners.
	*
	* @param tempCargoDeclaration the temp cargo declaration
	* @return the temp cargo declaration that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempCargoDeclaration deleteTempCargoDeclaration(
		vn.dtt.duongbien.dao.vrcb.model.TempCargoDeclaration tempCargoDeclaration)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempCargoDeclarationLocalService.deleteTempCargoDeclaration(tempCargoDeclaration);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tempCargoDeclarationLocalService.dynamicQuery();
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
		return _tempCargoDeclarationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempCargoDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tempCargoDeclarationLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempCargoDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tempCargoDeclarationLocalService.dynamicQuery(dynamicQuery,
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
		return _tempCargoDeclarationLocalService.dynamicQueryCount(dynamicQuery);
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
		return _tempCargoDeclarationLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempCargoDeclaration fetchTempCargoDeclaration(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _tempCargoDeclarationLocalService.fetchTempCargoDeclaration(id);
	}

	/**
	* Returns the temp cargo declaration with the primary key.
	*
	* @param id the primary key of the temp cargo declaration
	* @return the temp cargo declaration
	* @throws PortalException if a temp cargo declaration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempCargoDeclaration getTempCargoDeclaration(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempCargoDeclarationLocalService.getTempCargoDeclaration(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tempCargoDeclarationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the temp cargo declarations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempCargoDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of temp cargo declarations
	* @param end the upper bound of the range of temp cargo declarations (not inclusive)
	* @return the range of temp cargo declarations
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.TempCargoDeclaration> getTempCargoDeclarations(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempCargoDeclarationLocalService.getTempCargoDeclarations(start,
			end);
	}

	/**
	* Returns the number of temp cargo declarations.
	*
	* @return the number of temp cargo declarations
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTempCargoDeclarationsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempCargoDeclarationLocalService.getTempCargoDeclarationsCount();
	}

	/**
	* Updates the temp cargo declaration in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tempCargoDeclaration the temp cargo declaration
	* @return the temp cargo declaration that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempCargoDeclaration updateTempCargoDeclaration(
		vn.dtt.duongbien.dao.vrcb.model.TempCargoDeclaration tempCargoDeclaration)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tempCargoDeclarationLocalService.updateTempCargoDeclaration(tempCargoDeclaration);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _tempCargoDeclarationLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tempCargoDeclarationLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tempCargoDeclarationLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TempCargoDeclarationLocalService getWrappedTempCargoDeclarationLocalService() {
		return _tempCargoDeclarationLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTempCargoDeclarationLocalService(
		TempCargoDeclarationLocalService tempCargoDeclarationLocalService) {
		_tempCargoDeclarationLocalService = tempCargoDeclarationLocalService;
	}

	@Override
	public TempCargoDeclarationLocalService getWrappedService() {
		return _tempCargoDeclarationLocalService;
	}

	@Override
	public void setWrappedService(
		TempCargoDeclarationLocalService tempCargoDeclarationLocalService) {
		_tempCargoDeclarationLocalService = tempCargoDeclarationLocalService;
	}

	private TempCargoDeclarationLocalService _tempCargoDeclarationLocalService;
}