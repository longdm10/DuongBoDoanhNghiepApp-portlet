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
 * Provides a wrapper for {@link ResultDeclarationLocalService}.
 *
 * @author longdm
 * @see ResultDeclarationLocalService
 * @generated
 */
public class ResultDeclarationLocalServiceWrapper
	implements ResultDeclarationLocalService,
		ServiceWrapper<ResultDeclarationLocalService> {
	public ResultDeclarationLocalServiceWrapper(
		ResultDeclarationLocalService resultDeclarationLocalService) {
		_resultDeclarationLocalService = resultDeclarationLocalService;
	}

	/**
	* Adds the result declaration to the database. Also notifies the appropriate model listeners.
	*
	* @param resultDeclaration the result declaration
	* @return the result declaration that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration addResultDeclaration(
		vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration resultDeclaration)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resultDeclarationLocalService.addResultDeclaration(resultDeclaration);
	}

	/**
	* Creates a new result declaration with the primary key. Does not add the result declaration to the database.
	*
	* @param id the primary key for the new result declaration
	* @return the new result declaration
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration createResultDeclaration(
		long id) {
		return _resultDeclarationLocalService.createResultDeclaration(id);
	}

	/**
	* Deletes the result declaration with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the result declaration
	* @return the result declaration that was removed
	* @throws PortalException if a result declaration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration deleteResultDeclaration(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _resultDeclarationLocalService.deleteResultDeclaration(id);
	}

	/**
	* Deletes the result declaration from the database. Also notifies the appropriate model listeners.
	*
	* @param resultDeclaration the result declaration
	* @return the result declaration that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration deleteResultDeclaration(
		vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration resultDeclaration)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resultDeclarationLocalService.deleteResultDeclaration(resultDeclaration);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _resultDeclarationLocalService.dynamicQuery();
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
		return _resultDeclarationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _resultDeclarationLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _resultDeclarationLocalService.dynamicQuery(dynamicQuery, start,
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
		return _resultDeclarationLocalService.dynamicQueryCount(dynamicQuery);
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
		return _resultDeclarationLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration fetchResultDeclaration(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _resultDeclarationLocalService.fetchResultDeclaration(id);
	}

	/**
	* Returns the result declaration with the primary key.
	*
	* @param id the primary key of the result declaration
	* @return the result declaration
	* @throws PortalException if a result declaration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration getResultDeclaration(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _resultDeclarationLocalService.getResultDeclaration(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _resultDeclarationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the result declarations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of result declarations
	* @param end the upper bound of the range of result declarations (not inclusive)
	* @return the range of result declarations
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration> getResultDeclarations(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resultDeclarationLocalService.getResultDeclarations(start, end);
	}

	/**
	* Returns the number of result declarations.
	*
	* @return the number of result declarations
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getResultDeclarationsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resultDeclarationLocalService.getResultDeclarationsCount();
	}

	/**
	* Updates the result declaration in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param resultDeclaration the result declaration
	* @return the result declaration that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration updateResultDeclaration(
		vn.dtt.duongbien.dao.vrcb.model.ResultDeclaration resultDeclaration)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resultDeclarationLocalService.updateResultDeclaration(resultDeclaration);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _resultDeclarationLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_resultDeclarationLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _resultDeclarationLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ResultDeclarationLocalService getWrappedResultDeclarationLocalService() {
		return _resultDeclarationLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedResultDeclarationLocalService(
		ResultDeclarationLocalService resultDeclarationLocalService) {
		_resultDeclarationLocalService = resultDeclarationLocalService;
	}

	@Override
	public ResultDeclarationLocalService getWrappedService() {
		return _resultDeclarationLocalService;
	}

	@Override
	public void setWrappedService(
		ResultDeclarationLocalService resultDeclarationLocalService) {
		_resultDeclarationLocalService = resultDeclarationLocalService;
	}

	private ResultDeclarationLocalService _resultDeclarationLocalService;
}