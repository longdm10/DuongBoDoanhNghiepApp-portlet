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
 * Provides a wrapper for {@link QlvtThongTinXuLyLocalService}.
 *
 * @author NhanNc
 * @see QlvtThongTinXuLyLocalService
 * @generated
 */
public class QlvtThongTinXuLyLocalServiceWrapper
	implements QlvtThongTinXuLyLocalService,
		ServiceWrapper<QlvtThongTinXuLyLocalService> {
	public QlvtThongTinXuLyLocalServiceWrapper(
		QlvtThongTinXuLyLocalService qlvtThongTinXuLyLocalService) {
		_qlvtThongTinXuLyLocalService = qlvtThongTinXuLyLocalService;
	}

	/**
	* Adds the qlvt thong tin xu ly to the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtThongTinXuLy the qlvt thong tin xu ly
	* @return the qlvt thong tin xu ly that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy addQlvtThongTinXuLy(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy qlvtThongTinXuLy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinXuLyLocalService.addQlvtThongTinXuLy(qlvtThongTinXuLy);
	}

	/**
	* Creates a new qlvt thong tin xu ly with the primary key. Does not add the qlvt thong tin xu ly to the database.
	*
	* @param id the primary key for the new qlvt thong tin xu ly
	* @return the new qlvt thong tin xu ly
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy createQlvtThongTinXuLy(
		long id) {
		return _qlvtThongTinXuLyLocalService.createQlvtThongTinXuLy(id);
	}

	/**
	* Deletes the qlvt thong tin xu ly with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the qlvt thong tin xu ly
	* @return the qlvt thong tin xu ly that was removed
	* @throws PortalException if a qlvt thong tin xu ly with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy deleteQlvtThongTinXuLy(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinXuLyLocalService.deleteQlvtThongTinXuLy(id);
	}

	/**
	* Deletes the qlvt thong tin xu ly from the database. Also notifies the appropriate model listeners.
	*
	* @param qlvtThongTinXuLy the qlvt thong tin xu ly
	* @return the qlvt thong tin xu ly that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy deleteQlvtThongTinXuLy(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy qlvtThongTinXuLy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinXuLyLocalService.deleteQlvtThongTinXuLy(qlvtThongTinXuLy);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _qlvtThongTinXuLyLocalService.dynamicQuery();
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
		return _qlvtThongTinXuLyLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtThongTinXuLyLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _qlvtThongTinXuLyLocalService.dynamicQuery(dynamicQuery, start,
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
		return _qlvtThongTinXuLyLocalService.dynamicQueryCount(dynamicQuery);
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
		return _qlvtThongTinXuLyLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy fetchQlvtThongTinXuLy(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinXuLyLocalService.fetchQlvtThongTinXuLy(id);
	}

	/**
	* Returns the qlvt thong tin xu ly with the primary key.
	*
	* @param id the primary key of the qlvt thong tin xu ly
	* @return the qlvt thong tin xu ly
	* @throws PortalException if a qlvt thong tin xu ly with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy getQlvtThongTinXuLy(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinXuLyLocalService.getQlvtThongTinXuLy(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinXuLyLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the qlvt thong tin xu lies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.nghiepvu.model.impl.QlvtThongTinXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of qlvt thong tin xu lies
	* @param end the upper bound of the range of qlvt thong tin xu lies (not inclusive)
	* @return the range of qlvt thong tin xu lies
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy> getQlvtThongTinXuLies(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinXuLyLocalService.getQlvtThongTinXuLies(start, end);
	}

	/**
	* Returns the number of qlvt thong tin xu lies.
	*
	* @return the number of qlvt thong tin xu lies
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getQlvtThongTinXuLiesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinXuLyLocalService.getQlvtThongTinXuLiesCount();
	}

	/**
	* Updates the qlvt thong tin xu ly in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param qlvtThongTinXuLy the qlvt thong tin xu ly
	* @return the qlvt thong tin xu ly that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy updateQlvtThongTinXuLy(
		vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy qlvtThongTinXuLy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinXuLyLocalService.updateQlvtThongTinXuLy(qlvtThongTinXuLy);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _qlvtThongTinXuLyLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_qlvtThongTinXuLyLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _qlvtThongTinXuLyLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy fetchBythongTinHoSoId(
		int thongTinHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinXuLyLocalService.fetchBythongTinHoSoId(thongTinHoSoId);
	}

	@Override
	public vn.dtt.duongbo.dao.nghiepvu.model.QlvtThongTinXuLy fetchBythongTinHoSoId(
		long thongTinHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _qlvtThongTinXuLyLocalService.fetchBythongTinHoSoId(thongTinHoSoId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public QlvtThongTinXuLyLocalService getWrappedQlvtThongTinXuLyLocalService() {
		return _qlvtThongTinXuLyLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedQlvtThongTinXuLyLocalService(
		QlvtThongTinXuLyLocalService qlvtThongTinXuLyLocalService) {
		_qlvtThongTinXuLyLocalService = qlvtThongTinXuLyLocalService;
	}

	@Override
	public QlvtThongTinXuLyLocalService getWrappedService() {
		return _qlvtThongTinXuLyLocalService;
	}

	@Override
	public void setWrappedService(
		QlvtThongTinXuLyLocalService qlvtThongTinXuLyLocalService) {
		_qlvtThongTinXuLyLocalService = qlvtThongTinXuLyLocalService;
	}

	private QlvtThongTinXuLyLocalService _qlvtThongTinXuLyLocalService;
}