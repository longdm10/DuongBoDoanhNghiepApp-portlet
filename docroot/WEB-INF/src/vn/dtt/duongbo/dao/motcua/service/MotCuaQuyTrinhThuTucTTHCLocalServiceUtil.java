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

package vn.dtt.duongbo.dao.motcua.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for MotCuaQuyTrinhThuTucTTHC. This utility wraps
 * {@link vn.dtt.duongbo.dao.motcua.service.impl.MotCuaQuyTrinhThuTucTTHCLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author win_64
 * @see MotCuaQuyTrinhThuTucTTHCLocalService
 * @see vn.dtt.duongbo.dao.motcua.service.base.MotCuaQuyTrinhThuTucTTHCLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.motcua.service.impl.MotCuaQuyTrinhThuTucTTHCLocalServiceImpl
 * @generated
 */
public class MotCuaQuyTrinhThuTucTTHCLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.duongbo.dao.motcua.service.impl.MotCuaQuyTrinhThuTucTTHCLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the mot cua quy trinh thu tuc t t h c to the database. Also notifies the appropriate model listeners.
	*
	* @param motCuaQuyTrinhThuTucTTHC the mot cua quy trinh thu tuc t t h c
	* @return the mot cua quy trinh thu tuc t t h c that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC addMotCuaQuyTrinhThuTucTTHC(
		vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addMotCuaQuyTrinhThuTucTTHC(motCuaQuyTrinhThuTucTTHC);
	}

	/**
	* Creates a new mot cua quy trinh thu tuc t t h c with the primary key. Does not add the mot cua quy trinh thu tuc t t h c to the database.
	*
	* @param id the primary key for the new mot cua quy trinh thu tuc t t h c
	* @return the new mot cua quy trinh thu tuc t t h c
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC createMotCuaQuyTrinhThuTucTTHC(
		long id) {
		return getService().createMotCuaQuyTrinhThuTucTTHC(id);
	}

	/**
	* Deletes the mot cua quy trinh thu tuc t t h c with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the mot cua quy trinh thu tuc t t h c
	* @return the mot cua quy trinh thu tuc t t h c that was removed
	* @throws PortalException if a mot cua quy trinh thu tuc t t h c with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC deleteMotCuaQuyTrinhThuTucTTHC(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteMotCuaQuyTrinhThuTucTTHC(id);
	}

	/**
	* Deletes the mot cua quy trinh thu tuc t t h c from the database. Also notifies the appropriate model listeners.
	*
	* @param motCuaQuyTrinhThuTucTTHC the mot cua quy trinh thu tuc t t h c
	* @return the mot cua quy trinh thu tuc t t h c that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC deleteMotCuaQuyTrinhThuTucTTHC(
		vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .deleteMotCuaQuyTrinhThuTucTTHC(motCuaQuyTrinhThuTucTTHC);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaQuyTrinhThuTucTTHCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaQuyTrinhThuTucTTHCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC fetchMotCuaQuyTrinhThuTucTTHC(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchMotCuaQuyTrinhThuTucTTHC(id);
	}

	/**
	* Returns the mot cua quy trinh thu tuc t t h c with the primary key.
	*
	* @param id the primary key of the mot cua quy trinh thu tuc t t h c
	* @return the mot cua quy trinh thu tuc t t h c
	* @throws PortalException if a mot cua quy trinh thu tuc t t h c with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC getMotCuaQuyTrinhThuTucTTHC(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getMotCuaQuyTrinhThuTucTTHC(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the mot cua quy trinh thu tuc t t h cs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbo.dao.motcua.model.impl.MotCuaQuyTrinhThuTucTTHCModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua quy trinh thu tuc t t h cs
	* @param end the upper bound of the range of mot cua quy trinh thu tuc t t h cs (not inclusive)
	* @return the range of mot cua quy trinh thu tuc t t h cs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC> getMotCuaQuyTrinhThuTucTTHCs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMotCuaQuyTrinhThuTucTTHCs(start, end);
	}

	/**
	* Returns the number of mot cua quy trinh thu tuc t t h cs.
	*
	* @return the number of mot cua quy trinh thu tuc t t h cs
	* @throws SystemException if a system exception occurred
	*/
	public static int getMotCuaQuyTrinhThuTucTTHCsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMotCuaQuyTrinhThuTucTTHCsCount();
	}

	/**
	* Updates the mot cua quy trinh thu tuc t t h c in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param motCuaQuyTrinhThuTucTTHC the mot cua quy trinh thu tuc t t h c
	* @return the mot cua quy trinh thu tuc t t h c that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC updateMotCuaQuyTrinhThuTucTTHC(
		vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC motCuaQuyTrinhThuTucTTHC)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateMotCuaQuyTrinhThuTucTTHC(motCuaQuyTrinhThuTucTTHC);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC> findByThuTucHanhChinhID(
		long thuTucHanhChinhID) {
		return getService().findByThuTucHanhChinhID(thuTucHanhChinhID);
	}

	public static java.util.List<vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC> findByQuyTrinhThuTucId(
		long quyTrinhThuTucId) {
		return getService().findByQuyTrinhThuTucId(quyTrinhThuTucId);
	}

	public static vn.dtt.duongbo.dao.motcua.model.MotCuaQuyTrinhThuTucTTHC fetchByThuTucHanhChinhIDAndToChucXuLy(
		long thuTucHanhChinhID, long toChucXuLy) {
		return getService()
				   .fetchByThuTucHanhChinhIDAndToChucXuLy(thuTucHanhChinhID,
			toChucXuLy);
	}

	public static void clearService() {
		_service = null;
	}

	public static MotCuaQuyTrinhThuTucTTHCLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					MotCuaQuyTrinhThuTucTTHCLocalService.class.getName());

			if (invokableLocalService instanceof MotCuaQuyTrinhThuTucTTHCLocalService) {
				_service = (MotCuaQuyTrinhThuTucTTHCLocalService)invokableLocalService;
			}
			else {
				_service = new MotCuaQuyTrinhThuTucTTHCLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(MotCuaQuyTrinhThuTucTTHCLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(MotCuaQuyTrinhThuTucTTHCLocalService service) {
	}

	private static MotCuaQuyTrinhThuTucTTHCLocalService _service;
}