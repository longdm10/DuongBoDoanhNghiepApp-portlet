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

import vn.dtt.duongbien.dao.vrcb.model.DmCertificate;

import java.util.List;

/**
 * The persistence utility for the dm certificate service. This utility wraps {@link DmCertificatePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmCertificatePersistence
 * @see DmCertificatePersistenceImpl
 * @generated
 */
public class DmCertificateUtil {
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
	public static void clearCache(DmCertificate dmCertificate) {
		getPersistence().clearCache(dmCertificate);
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
	public static List<DmCertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmCertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmCertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DmCertificate update(DmCertificate dmCertificate)
		throws SystemException {
		return getPersistence().update(dmCertificate);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DmCertificate update(DmCertificate dmCertificate,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dmCertificate, serviceContext);
	}

	/**
	* Returns all the dm certificates where certificateCode = &#63;.
	*
	* @param certificateCode the certificate code
	* @return the matching dm certificates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmCertificate> findByCertificateCode(
		java.lang.String certificateCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCertificateCode(certificateCode);
	}

	/**
	* Returns a range of all the dm certificates where certificateCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param certificateCode the certificate code
	* @param start the lower bound of the range of dm certificates
	* @param end the upper bound of the range of dm certificates (not inclusive)
	* @return the range of matching dm certificates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmCertificate> findByCertificateCode(
		java.lang.String certificateCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCertificateCode(certificateCode, start, end);
	}

	/**
	* Returns an ordered range of all the dm certificates where certificateCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param certificateCode the certificate code
	* @param start the lower bound of the range of dm certificates
	* @param end the upper bound of the range of dm certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm certificates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmCertificate> findByCertificateCode(
		java.lang.String certificateCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCertificateCode(certificateCode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dm certificate in the ordered set where certificateCode = &#63;.
	*
	* @param certificateCode the certificate code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm certificate
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException if a matching dm certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmCertificate findByCertificateCode_First(
		java.lang.String certificateCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException {
		return getPersistence()
				   .findByCertificateCode_First(certificateCode,
			orderByComparator);
	}

	/**
	* Returns the first dm certificate in the ordered set where certificateCode = &#63;.
	*
	* @param certificateCode the certificate code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm certificate, or <code>null</code> if a matching dm certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmCertificate fetchByCertificateCode_First(
		java.lang.String certificateCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCertificateCode_First(certificateCode,
			orderByComparator);
	}

	/**
	* Returns the last dm certificate in the ordered set where certificateCode = &#63;.
	*
	* @param certificateCode the certificate code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm certificate
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException if a matching dm certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmCertificate findByCertificateCode_Last(
		java.lang.String certificateCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException {
		return getPersistence()
				   .findByCertificateCode_Last(certificateCode,
			orderByComparator);
	}

	/**
	* Returns the last dm certificate in the ordered set where certificateCode = &#63;.
	*
	* @param certificateCode the certificate code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm certificate, or <code>null</code> if a matching dm certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmCertificate fetchByCertificateCode_Last(
		java.lang.String certificateCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCertificateCode_Last(certificateCode,
			orderByComparator);
	}

	/**
	* Returns the dm certificates before and after the current dm certificate in the ordered set where certificateCode = &#63;.
	*
	* @param id the primary key of the current dm certificate
	* @param certificateCode the certificate code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm certificate
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException if a dm certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmCertificate[] findByCertificateCode_PrevAndNext(
		long id, java.lang.String certificateCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException {
		return getPersistence()
				   .findByCertificateCode_PrevAndNext(id, certificateCode,
			orderByComparator);
	}

	/**
	* Removes all the dm certificates where certificateCode = &#63; from the database.
	*
	* @param certificateCode the certificate code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCertificateCode(java.lang.String certificateCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCertificateCode(certificateCode);
	}

	/**
	* Returns the number of dm certificates where certificateCode = &#63;.
	*
	* @param certificateCode the certificate code
	* @return the number of matching dm certificates
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCertificateCode(java.lang.String certificateCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCertificateCode(certificateCode);
	}

	/**
	* Returns all the dm certificates where certificateCode = &#63; and certificateName = &#63;.
	*
	* @param certificateCode the certificate code
	* @param certificateName the certificate name
	* @return the matching dm certificates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmCertificate> findByCertificateCodeAndCertificateName(
		java.lang.String certificateCode, java.lang.String certificateName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCertificateCodeAndCertificateName(certificateCode,
			certificateName);
	}

	/**
	* Returns a range of all the dm certificates where certificateCode = &#63; and certificateName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param certificateCode the certificate code
	* @param certificateName the certificate name
	* @param start the lower bound of the range of dm certificates
	* @param end the upper bound of the range of dm certificates (not inclusive)
	* @return the range of matching dm certificates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmCertificate> findByCertificateCodeAndCertificateName(
		java.lang.String certificateCode, java.lang.String certificateName,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCertificateCodeAndCertificateName(certificateCode,
			certificateName, start, end);
	}

	/**
	* Returns an ordered range of all the dm certificates where certificateCode = &#63; and certificateName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param certificateCode the certificate code
	* @param certificateName the certificate name
	* @param start the lower bound of the range of dm certificates
	* @param end the upper bound of the range of dm certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm certificates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmCertificate> findByCertificateCodeAndCertificateName(
		java.lang.String certificateCode, java.lang.String certificateName,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCertificateCodeAndCertificateName(certificateCode,
			certificateName, start, end, orderByComparator);
	}

	/**
	* Returns the first dm certificate in the ordered set where certificateCode = &#63; and certificateName = &#63;.
	*
	* @param certificateCode the certificate code
	* @param certificateName the certificate name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm certificate
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException if a matching dm certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmCertificate findByCertificateCodeAndCertificateName_First(
		java.lang.String certificateCode, java.lang.String certificateName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException {
		return getPersistence()
				   .findByCertificateCodeAndCertificateName_First(certificateCode,
			certificateName, orderByComparator);
	}

	/**
	* Returns the first dm certificate in the ordered set where certificateCode = &#63; and certificateName = &#63;.
	*
	* @param certificateCode the certificate code
	* @param certificateName the certificate name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm certificate, or <code>null</code> if a matching dm certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmCertificate fetchByCertificateCodeAndCertificateName_First(
		java.lang.String certificateCode, java.lang.String certificateName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCertificateCodeAndCertificateName_First(certificateCode,
			certificateName, orderByComparator);
	}

	/**
	* Returns the last dm certificate in the ordered set where certificateCode = &#63; and certificateName = &#63;.
	*
	* @param certificateCode the certificate code
	* @param certificateName the certificate name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm certificate
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException if a matching dm certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmCertificate findByCertificateCodeAndCertificateName_Last(
		java.lang.String certificateCode, java.lang.String certificateName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException {
		return getPersistence()
				   .findByCertificateCodeAndCertificateName_Last(certificateCode,
			certificateName, orderByComparator);
	}

	/**
	* Returns the last dm certificate in the ordered set where certificateCode = &#63; and certificateName = &#63;.
	*
	* @param certificateCode the certificate code
	* @param certificateName the certificate name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm certificate, or <code>null</code> if a matching dm certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmCertificate fetchByCertificateCodeAndCertificateName_Last(
		java.lang.String certificateCode, java.lang.String certificateName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCertificateCodeAndCertificateName_Last(certificateCode,
			certificateName, orderByComparator);
	}

	/**
	* Returns the dm certificates before and after the current dm certificate in the ordered set where certificateCode = &#63; and certificateName = &#63;.
	*
	* @param id the primary key of the current dm certificate
	* @param certificateCode the certificate code
	* @param certificateName the certificate name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm certificate
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException if a dm certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmCertificate[] findByCertificateCodeAndCertificateName_PrevAndNext(
		long id, java.lang.String certificateCode,
		java.lang.String certificateName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException {
		return getPersistence()
				   .findByCertificateCodeAndCertificateName_PrevAndNext(id,
			certificateCode, certificateName, orderByComparator);
	}

	/**
	* Removes all the dm certificates where certificateCode = &#63; and certificateName = &#63; from the database.
	*
	* @param certificateCode the certificate code
	* @param certificateName the certificate name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCertificateCodeAndCertificateName(
		java.lang.String certificateCode, java.lang.String certificateName)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByCertificateCodeAndCertificateName(certificateCode,
			certificateName);
	}

	/**
	* Returns the number of dm certificates where certificateCode = &#63; and certificateName = &#63;.
	*
	* @param certificateCode the certificate code
	* @param certificateName the certificate name
	* @return the number of matching dm certificates
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCertificateCodeAndCertificateName(
		java.lang.String certificateCode, java.lang.String certificateName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByCertificateCodeAndCertificateName(certificateCode,
			certificateName);
	}

	/**
	* Caches the dm certificate in the entity cache if it is enabled.
	*
	* @param dmCertificate the dm certificate
	*/
	public static void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.DmCertificate dmCertificate) {
		getPersistence().cacheResult(dmCertificate);
	}

	/**
	* Caches the dm certificates in the entity cache if it is enabled.
	*
	* @param dmCertificates the dm certificates
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmCertificate> dmCertificates) {
		getPersistence().cacheResult(dmCertificates);
	}

	/**
	* Creates a new dm certificate with the primary key. Does not add the dm certificate to the database.
	*
	* @param id the primary key for the new dm certificate
	* @return the new dm certificate
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmCertificate create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dm certificate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm certificate
	* @return the dm certificate that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException if a dm certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmCertificate remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.duongbien.dao.vrcb.model.DmCertificate updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmCertificate dmCertificate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmCertificate);
	}

	/**
	* Returns the dm certificate with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException} if it could not be found.
	*
	* @param id the primary key of the dm certificate
	* @return the dm certificate
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException if a dm certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmCertificate findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dm certificate with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm certificate
	* @return the dm certificate, or <code>null</code> if a dm certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.duongbien.dao.vrcb.model.DmCertificate fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the dm certificates.
	*
	* @return the dm certificates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmCertificate> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dm certificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm certificates
	* @param end the upper bound of the range of dm certificates (not inclusive)
	* @return the range of dm certificates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmCertificate> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dm certificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.duongbien.dao.vrcb.model.impl.DmCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm certificates
	* @param end the upper bound of the range of dm certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm certificates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmCertificate> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm certificates from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm certificates.
	*
	* @return the number of dm certificates
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmCertificatePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmCertificatePersistence)PortletBeanLocatorUtil.locate(vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.getServletContextName(),
					DmCertificatePersistence.class.getName());

			ReferenceRegistry.registerReference(DmCertificateUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DmCertificatePersistence persistence) {
	}

	private static DmCertificatePersistence _persistence;
}