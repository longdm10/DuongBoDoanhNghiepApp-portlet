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
 * Provides a wrapper for {@link ResultCompetionLocalService}.
 *
 * @author longdm
 * @see ResultCompetionLocalService
 * @generated
 */
public class ResultCompetionLocalServiceWrapper
	implements ResultCompetionLocalService,
		ServiceWrapper<ResultCompetionLocalService> {
	public ResultCompetionLocalServiceWrapper(
		ResultCompetionLocalService resultCompetionLocalService) {
		_resultCompetionLocalService = resultCompetionLocalService;
	}

	/**
	* Adds the result competion to the database. Also notifies the appropriate model listeners.
	*
	* @param resultCompetion the result competion
	* @return the result competion that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.ResultCompetion addResultCompetion(
		vn.dtt.duongbien.dao.vrcb.model.ResultCompetion resultCompetion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resultCompetionLocalService.addResultCompetion(resultCompetion);
	}

	/**
	* Creates a new result competion with the primary key. Does not add the result competion to the database.
	*
	* @param id the primary key for the new result competion
	* @return the new result competion
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.ResultCompetion createResultCompetion(
		long id) {
		return _resultCompetionLocalService.createResultCompetion(id);
	}

	/**
	* Deletes the result competion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the result competion
	* @return the result competion that was removed
	* @throws PortalException if a result competion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.ResultCompetion deleteResultCompetion(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _resultCompetionLocalService.deleteResultCompetion(id);
	}

	/**
	* Deletes the result competion from the database. Also notifies the appropriate model listeners.
	*
	* @param resultCompetion the result competion
	* @return the result competion that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.ResultCompetion deleteResultCompetion(
		vn.dtt.duongbien.dao.vrcb.model.ResultCompetion resultCompetion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resultCompetionLocalService.deleteResultCompetion(resultCompetion);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _resultCompetionLocalService.dynamicQuery();
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
		return _resultCompetionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultCompetionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _resultCompetionLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultCompetionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _resultCompetionLocalService.dynamicQuery(dynamicQuery, start,
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
		return _resultCompetionLocalService.dynamicQueryCount(dynamicQuery);
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
		return _resultCompetionLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.ResultCompetion fetchResultCompetion(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _resultCompetionLocalService.fetchResultCompetion(id);
	}

	/**
	* Returns the result competion with the primary key.
	*
	* @param id the primary key of the result competion
	* @return the result competion
	* @throws PortalException if a result competion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.ResultCompetion getResultCompetion(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _resultCompetionLocalService.getResultCompetion(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _resultCompetionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the result competions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.ResultCompetionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of result competions
	* @param end the upper bound of the range of result competions (not inclusive)
	* @return the range of result competions
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.ResultCompetion> getResultCompetions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resultCompetionLocalService.getResultCompetions(start, end);
	}

	/**
	* Returns the number of result competions.
	*
	* @return the number of result competions
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getResultCompetionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resultCompetionLocalService.getResultCompetionsCount();
	}

	/**
	* Updates the result competion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param resultCompetion the result competion
	* @return the result competion that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.ResultCompetion updateResultCompetion(
		vn.dtt.duongbien.dao.vrcb.model.ResultCompetion resultCompetion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resultCompetionLocalService.updateResultCompetion(resultCompetion);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _resultCompetionLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_resultCompetionLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _resultCompetionLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ResultCompetionLocalService getWrappedResultCompetionLocalService() {
		return _resultCompetionLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedResultCompetionLocalService(
		ResultCompetionLocalService resultCompetionLocalService) {
		_resultCompetionLocalService = resultCompetionLocalService;
	}

	@Override
	public ResultCompetionLocalService getWrappedService() {
		return _resultCompetionLocalService;
	}

	@Override
	public void setWrappedService(
		ResultCompetionLocalService resultCompetionLocalService) {
		_resultCompetionLocalService = resultCompetionLocalService;
	}

	private ResultCompetionLocalService _resultCompetionLocalService;
}