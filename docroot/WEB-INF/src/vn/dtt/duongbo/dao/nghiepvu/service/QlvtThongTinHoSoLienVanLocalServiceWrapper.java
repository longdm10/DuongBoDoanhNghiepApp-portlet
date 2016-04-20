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

package vn.dtt.duongbo.dao.nghiepvu.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link QlvtThongTinHoSoLienVanLocalService}.
 *
 * @author NhanNc
 * @see QlvtThongTinHoSoLienVanLocalService
 * @generated
 */
public class QlvtThongTinHoSoLienVanLocalServiceWrapper
	implements QlvtThongTinHoSoLienVanLocalService,
		ServiceWrapper<QlvtThongTinHoSoLienVanLocalService> {
	public QlvtThongTinHoSoLienVanLocalServiceWrapper(
		QlvtThongTinHoSoLienVanLocalService qlvtThongTinHoSoLienVanLocalService) {
		_qlvtThongTinHoSoLienVanLocalService = qlvtThongTinHoSoLienVanLocalService;
	}

	/**
	* Adds the qlvt thong tin ho so lien van to the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtThongTinHoSoLienVan the qlvt thong tin ho so lien van
	* @return the qlvt thong tin ho so lien van that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoLienVan addQlvtThongTinHoSoLienVan(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoLienVan qlvtThongTinHoSoLienVan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinHoSoLienVanLocalService.addQlvtThongTinHoSoLienVan(qlvtThongTinHoSoLienVan);
	}

	/**
	* Creates a new qlvt thong tin ho so lien van with the primary key. Does not add the qlvt thong tin ho so lien van to the database.
	*
	* @param id the primary key for the new qlvt thong tin ho so lien van
	* @return the new qlvt thong tin ho so lien van
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoLienVan createQlvtThongTinHoSoLienVan(
		long id) {
		return _qlvtThongTinHoSoLienVanLocalService.createQlvtThongTinHoSoLienVan(id);
	}

	/**
	* Deletes the qlvt thong tin ho so lien van with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt thong tin ho so lien van
	* @return the qlvt thong tin ho so lien van that was removed
	* @throws PortalException if a qlvt thong tin ho so lien van with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoLienVan deleteQlvtThongTinHoSoLienVan(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinHoSoLienVanLocalService.deleteQlvtThongTinHoSoLienVan(id);
	}

	/**
	* Deletes the qlvt thong tin ho so lien van from the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtThongTinHoSoLienVan the qlvt thong tin ho so lien van
	* @return the qlvt thong tin ho so lien van that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoLienVan deleteQlvtThongTinHoSoLienVan(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoLienVan qlvtThongTinHoSoLienVan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinHoSoLienVanLocalService.deleteQlvtThongTinHoSoLienVan(qlvtThongTinHoSoLienVan);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _qlvtThongTinHoSoLienVanLocalService.dynamicQuery();
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
		return _qlvtThongTinHoSoLienVanLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinHoSoLienVanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtThongTinHoSoLienVanLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinHoSoLienVanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtThongTinHoSoLienVanLocalService.dynamicQuery(dynamicQuery,
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
		return _qlvtThongTinHoSoLienVanLocalService.dynamicQueryCount(dynamicQuery);
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
		return _qlvtThongTinHoSoLienVanLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoLienVan fetchQlvtThongTinHoSoLienVan(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinHoSoLienVanLocalService.fetchQlvtThongTinHoSoLienVan(id);
	}

	/**
	* Returns the qlvt thong tin ho so lien van with the primary key.
	*
	* @param id the primary key of the qlvt thong tin ho so lien van
	* @return the qlvt thong tin ho so lien van
	* @throws PortalException if a qlvt thong tin ho so lien van with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoLienVan getQlvtThongTinHoSoLienVan(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinHoSoLienVanLocalService.getQlvtThongTinHoSoLienVan(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinHoSoLienVanLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the qlvt thong tin ho so lien vans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinHoSoLienVanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt thong tin ho so lien vans
	* @param end the upper bound of the range of qlvt thong tin ho so lien vans (not inclusive)
	* @return the range of qlvt thong tin ho so lien vans
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoLienVan> getQlvtThongTinHoSoLienVans(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinHoSoLienVanLocalService.getQlvtThongTinHoSoLienVans(start,
			end);
	}

	/**
	* Returns the number of qlvt thong tin ho so lien vans.
	*
	* @return the number of qlvt thong tin ho so lien vans
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getQlvtThongTinHoSoLienVansCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinHoSoLienVanLocalService.getQlvtThongTinHoSoLienVansCount();
	}

	/**
	* Updates the qlvt thong tin ho so lien van in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param qlvtThongTinHoSoLienVan the qlvt thong tin ho so lien van
	* @return the qlvt thong tin ho so lien van that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoLienVan updateQlvtThongTinHoSoLienVan(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinHoSoLienVan qlvtThongTinHoSoLienVan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinHoSoLienVanLocalService.updateQlvtThongTinHoSoLienVan(qlvtThongTinHoSoLienVan);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _qlvtThongTinHoSoLienVanLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_qlvtThongTinHoSoLienVanLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _qlvtThongTinHoSoLienVanLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public QlvtThongTinHoSoLienVanLocalService getWrappedQlvtThongTinHoSoLienVanLocalService() {
		return _qlvtThongTinHoSoLienVanLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedQlvtThongTinHoSoLienVanLocalService(
		QlvtThongTinHoSoLienVanLocalService qlvtThongTinHoSoLienVanLocalService) {
		_qlvtThongTinHoSoLienVanLocalService = qlvtThongTinHoSoLienVanLocalService;
	}

	@Override
	public QlvtThongTinHoSoLienVanLocalService getWrappedService() {
		return _qlvtThongTinHoSoLienVanLocalService;
	}

	@Override
	public void setWrappedService(
		QlvtThongTinHoSoLienVanLocalService qlvtThongTinHoSoLienVanLocalService) {
		_qlvtThongTinHoSoLienVanLocalService = qlvtThongTinHoSoLienVanLocalService;
	}

	private QlvtThongTinHoSoLienVanLocalService _qlvtThongTinHoSoLienVanLocalService;
}