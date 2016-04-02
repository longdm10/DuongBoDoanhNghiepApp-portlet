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
 * Provides a wrapper for {@link DocumentGeneralLocalService}.
 *
 * @author longdm
 * @see DocumentGeneralLocalService
 * @generated
 */
public class DocumentGeneralLocalServiceWrapper
	implements DocumentGeneralLocalService,
		ServiceWrapper<DocumentGeneralLocalService> {
	public DocumentGeneralLocalServiceWrapper(
		DocumentGeneralLocalService documentGeneralLocalService) {
		_documentGeneralLocalService = documentGeneralLocalService;
	}

	/**
	* Adds the document general to the database. Also notifies the appropriate model listeners.
	*
	* @param documentGeneral the document general
	* @return the document general that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DocumentGeneral addDocumentGeneral(
		vn.dtt.duongbien.dao.vrcb.model.DocumentGeneral documentGeneral)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentGeneralLocalService.addDocumentGeneral(documentGeneral);
	}

	/**
	* Creates a new document general with the primary key. Does not add the document general to the database.
	*
	* @param id the primary key for the new document general
	* @return the new document general
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DocumentGeneral createDocumentGeneral(
		long id) {
		return _documentGeneralLocalService.createDocumentGeneral(id);
	}

	/**
	* Deletes the document general with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the document general
	* @return the document general that was removed
	* @throws PortalException if a document general with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DocumentGeneral deleteDocumentGeneral(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _documentGeneralLocalService.deleteDocumentGeneral(id);
	}

	/**
	* Deletes the document general from the database. Also notifies the appropriate model listeners.
	*
	* @param documentGeneral the document general
	* @return the document general that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DocumentGeneral deleteDocumentGeneral(
		vn.dtt.duongbien.dao.vrcb.model.DocumentGeneral documentGeneral)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentGeneralLocalService.deleteDocumentGeneral(documentGeneral);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _documentGeneralLocalService.dynamicQuery();
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
		return _documentGeneralLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DocumentGeneralModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _documentGeneralLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DocumentGeneralModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _documentGeneralLocalService.dynamicQuery(dynamicQuery, start,
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
		return _documentGeneralLocalService.dynamicQueryCount(dynamicQuery);
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
		return _documentGeneralLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DocumentGeneral fetchDocumentGeneral(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _documentGeneralLocalService.fetchDocumentGeneral(id);
	}

	/**
	* Returns the document general with the primary key.
	*
	* @param id the primary key of the document general
	* @return the document general
	* @throws PortalException if a document general with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DocumentGeneral getDocumentGeneral(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _documentGeneralLocalService.getDocumentGeneral(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _documentGeneralLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the document generals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DocumentGeneralModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of document generals
	* @param end the upper bound of the range of document generals (not inclusive)
	* @return the range of document generals
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DocumentGeneral> getDocumentGenerals(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentGeneralLocalService.getDocumentGenerals(start, end);
	}

	/**
	* Returns the number of document generals.
	*
	* @return the number of document generals
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDocumentGeneralsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentGeneralLocalService.getDocumentGeneralsCount();
	}

	/**
	* Updates the document general in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param documentGeneral the document general
	* @return the document general that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbien.dao.vrcb.model.DocumentGeneral updateDocumentGeneral(
		vn.dtt.duongbien.dao.vrcb.model.DocumentGeneral documentGeneral)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _documentGeneralLocalService.updateDocumentGeneral(documentGeneral);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _documentGeneralLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_documentGeneralLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _documentGeneralLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DocumentGeneralLocalService getWrappedDocumentGeneralLocalService() {
		return _documentGeneralLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDocumentGeneralLocalService(
		DocumentGeneralLocalService documentGeneralLocalService) {
		_documentGeneralLocalService = documentGeneralLocalService;
	}

	@Override
	public DocumentGeneralLocalService getWrappedService() {
		return _documentGeneralLocalService;
	}

	@Override
	public void setWrappedService(
		DocumentGeneralLocalService documentGeneralLocalService) {
		_documentGeneralLocalService = documentGeneralLocalService;
	}

	private DocumentGeneralLocalService _documentGeneralLocalService;
}