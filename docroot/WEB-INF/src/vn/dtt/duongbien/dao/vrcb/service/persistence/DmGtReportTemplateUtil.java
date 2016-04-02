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

package vn.dtt.duongbien.dao.vrcb.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.duongbien.dao.vrcb.model.DmGtReportTemplate;

import java.util.List;

/**
 * The persistence utility for the dm gt report template service. This utility wraps {@link DmGtReportTemplatePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmGtReportTemplatePersistence
 * @see DmGtReportTemplatePersistenceImpl
 * @generated
 */
public class DmGtReportTemplateUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(DmGtReportTemplate dmGtReportTemplate) {
		getPersistence().clearCache(dmGtReportTemplate);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<DmGtReportTemplate> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmGtReportTemplate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmGtReportTemplate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DmGtReportTemplate update(
		DmGtReportTemplate dmGtReportTemplate) throws SystemException {
		return getPersistence().update(dmGtReportTemplate);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DmGtReportTemplate update(
		DmGtReportTemplate dmGtReportTemplate, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(dmGtReportTemplate, serviceContext);
	}

	/**
	* Returns the dm gt report template where reportCode = &#63; or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmGtReportTemplateException} if it could not be found.
	*
	* @param reportCode the report code
	* @return the matching dm gt report template
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtReportTemplateException if a matching dm gt report template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmGtReportTemplate findByReportCode(
		int reportCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmGtReportTemplateException {
		return getPersistence().findByReportCode(reportCode);
	}

	/**
	* Returns the dm gt report template where reportCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param reportCode the report code
	* @return the matching dm gt report template, or <code>null</code> if a matching dm gt report template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmGtReportTemplate fetchByReportCode(
		int reportCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByReportCode(reportCode);
	}

	/**
	* Returns the dm gt report template where reportCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param reportCode the report code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm gt report template, or <code>null</code> if a matching dm gt report template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmGtReportTemplate fetchByReportCode(
		int reportCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByReportCode(reportCode, retrieveFromCache);
	}

	/**
	* Removes the dm gt report template where reportCode = &#63; from the database.
	*
	* @param reportCode the report code
	* @return the dm gt report template that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmGtReportTemplate removeByReportCode(
		int reportCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmGtReportTemplateException {
		return getPersistence().removeByReportCode(reportCode);
	}

	/**
	* Returns the number of dm gt report templates where reportCode = &#63;.
	*
	* @param reportCode the report code
	* @return the number of matching dm gt report templates
	* @throws SystemException if a system exception occurred
	*/
	public static int countByReportCode(int reportCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByReportCode(reportCode);
	}

	/**
	* Returns all the dm gt report templates where reportType = &#63;.
	*
	* @param reportType the report type
	* @return the matching dm gt report templates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGtReportTemplate> findByreportType(
		int reportType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByreportType(reportType);
	}

	/**
	* Returns a range of all the dm gt report templates where reportType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGtReportTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param reportType the report type
	* @param start the lower bound of the range of dm gt report templates
	* @param end the upper bound of the range of dm gt report templates (not inclusive)
	* @return the range of matching dm gt report templates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGtReportTemplate> findByreportType(
		int reportType, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByreportType(reportType, start, end);
	}

	/**
	* Returns an ordered range of all the dm gt report templates where reportType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGtReportTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param reportType the report type
	* @param start the lower bound of the range of dm gt report templates
	* @param end the upper bound of the range of dm gt report templates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm gt report templates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGtReportTemplate> findByreportType(
		int reportType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByreportType(reportType, start, end, orderByComparator);
	}

	/**
	* Returns the first dm gt report template in the ordered set where reportType = &#63;.
	*
	* @param reportType the report type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm gt report template
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtReportTemplateException if a matching dm gt report template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmGtReportTemplate findByreportType_First(
		int reportType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmGtReportTemplateException {
		return getPersistence()
				   .findByreportType_First(reportType, orderByComparator);
	}

	/**
	* Returns the first dm gt report template in the ordered set where reportType = &#63;.
	*
	* @param reportType the report type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm gt report template, or <code>null</code> if a matching dm gt report template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmGtReportTemplate fetchByreportType_First(
		int reportType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByreportType_First(reportType, orderByComparator);
	}

	/**
	* Returns the last dm gt report template in the ordered set where reportType = &#63;.
	*
	* @param reportType the report type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm gt report template
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtReportTemplateException if a matching dm gt report template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmGtReportTemplate findByreportType_Last(
		int reportType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmGtReportTemplateException {
		return getPersistence()
				   .findByreportType_Last(reportType, orderByComparator);
	}

	/**
	* Returns the last dm gt report template in the ordered set where reportType = &#63;.
	*
	* @param reportType the report type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm gt report template, or <code>null</code> if a matching dm gt report template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmGtReportTemplate fetchByreportType_Last(
		int reportType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByreportType_Last(reportType, orderByComparator);
	}

	/**
	* Returns the dm gt report templates before and after the current dm gt report template in the ordered set where reportType = &#63;.
	*
	* @param id the primary key of the current dm gt report template
	* @param reportType the report type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm gt report template
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtReportTemplateException if a dm gt report template with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmGtReportTemplate[] findByreportType_PrevAndNext(
		long id, int reportType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmGtReportTemplateException {
		return getPersistence()
				   .findByreportType_PrevAndNext(id, reportType,
			orderByComparator);
	}

	/**
	* Removes all the dm gt report templates where reportType = &#63; from the database.
	*
	* @param reportType the report type
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByreportType(int reportType)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByreportType(reportType);
	}

	/**
	* Returns the number of dm gt report templates where reportType = &#63;.
	*
	* @param reportType the report type
	* @return the number of matching dm gt report templates
	* @throws SystemException if a system exception occurred
	*/
	public static int countByreportType(int reportType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByreportType(reportType);
	}

	/**
	* Caches the dm gt report template in the entity cache if it is enabled.
	*
	* @param dmGtReportTemplate the dm gt report template
	*/
	public static void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.DmGtReportTemplate dmGtReportTemplate) {
		getPersistence().cacheResult(dmGtReportTemplate);
	}

	/**
	* Caches the dm gt report templates in the entity cache if it is enabled.
	*
	* @param dmGtReportTemplates the dm gt report templates
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGtReportTemplate> dmGtReportTemplates) {
		getPersistence().cacheResult(dmGtReportTemplates);
	}

	/**
	* Creates a new dm gt report template with the primary key. Does not add the dm gt report template to the database.
	*
	* @param id the primary key for the new dm gt report template
	* @return the new dm gt report template
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmGtReportTemplate create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm gt report template with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm gt report template
	* @return the dm gt report template that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtReportTemplateException if a dm gt report template with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmGtReportTemplate remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmGtReportTemplateException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbien.dao.vrcb.model.DmGtReportTemplate updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmGtReportTemplate dmGtReportTemplate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmGtReportTemplate);
	}

	/**
	* Returns the dm gt report template with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmGtReportTemplateException} if it could not be found.
	*
	* @param id the primary key of the dm gt report template
	* @return the dm gt report template
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmGtReportTemplateException if a dm gt report template with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmGtReportTemplate findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmGtReportTemplateException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm gt report template with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm gt report template
	* @return the dm gt report template, or <code>null</code> if a dm gt report template with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmGtReportTemplate fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the dm gt report templates.
	*
	* @return the dm gt report templates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGtReportTemplate> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dm gt report templates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGtReportTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm gt report templates
	* @param end the upper bound of the range of dm gt report templates (not inclusive)
	* @return the range of dm gt report templates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGtReportTemplate> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dm gt report templates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmGtReportTemplateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm gt report templates
	* @param end the upper bound of the range of dm gt report templates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm gt report templates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmGtReportTemplate> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm gt report templates from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm gt report templates.
	*
	* @return the number of dm gt report templates
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmGtReportTemplatePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmGtReportTemplatePersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.getServletContextName(),
					DmGtReportTemplatePersistence.class.getName());

			ReferenceRegistry.registerReference(DmGtReportTemplateUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DmGtReportTemplatePersistence persistence) {
	}

	private static DmGtReportTemplatePersistence _persistence;
}