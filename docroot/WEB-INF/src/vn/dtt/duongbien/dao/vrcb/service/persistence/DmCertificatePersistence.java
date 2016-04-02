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

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.duongbien.dao.vrcb.model.DmCertificate;

/**
 * The persistence interface for the dm certificate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author longdm
 * @see DmCertificatePersistenceImpl
 * @see DmCertificateUtil
 * @generated
 */
public interface DmCertificatePersistence extends BasePersistence<DmCertificate> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmCertificateUtil} to access the dm certificate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the dm certificates where certificateCode = &#63;.
	*
	* @param certificateCode the certificate code
	* @return the matching dm certificates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmCertificate> findByCertificateCode(
		java.lang.String certificateCode)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmCertificate> findByCertificateCode(
		java.lang.String certificateCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmCertificate> findByCertificateCode(
		java.lang.String certificateCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dm certificate in the ordered set where certificateCode = &#63;.
	*
	* @param certificateCode the certificate code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm certificate
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException if a matching dm certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmCertificate findByCertificateCode_First(
		java.lang.String certificateCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException;

	/**
	* Returns the first dm certificate in the ordered set where certificateCode = &#63;.
	*
	* @param certificateCode the certificate code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm certificate, or <code>null</code> if a matching dm certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmCertificate fetchByCertificateCode_First(
		java.lang.String certificateCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dm certificate in the ordered set where certificateCode = &#63;.
	*
	* @param certificateCode the certificate code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm certificate
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException if a matching dm certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmCertificate findByCertificateCode_Last(
		java.lang.String certificateCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException;

	/**
	* Returns the last dm certificate in the ordered set where certificateCode = &#63;.
	*
	* @param certificateCode the certificate code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm certificate, or <code>null</code> if a matching dm certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmCertificate fetchByCertificateCode_Last(
		java.lang.String certificateCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.duongbien.dao.vrcb.model.DmCertificate[] findByCertificateCode_PrevAndNext(
		long id, java.lang.String certificateCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException;

	/**
	* Removes all the dm certificates where certificateCode = &#63; from the database.
	*
	* @param certificateCode the certificate code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCertificateCode(java.lang.String certificateCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm certificates where certificateCode = &#63;.
	*
	* @param certificateCode the certificate code
	* @return the number of matching dm certificates
	* @throws SystemException if a system exception occurred
	*/
	public int countByCertificateCode(java.lang.String certificateCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm certificates where certificateCode = &#63; and certificateName = &#63;.
	*
	* @param certificateCode the certificate code
	* @param certificateName the certificate name
	* @return the matching dm certificates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmCertificate> findByCertificateCodeAndCertificateName(
		java.lang.String certificateCode, java.lang.String certificateName)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmCertificate> findByCertificateCodeAndCertificateName(
		java.lang.String certificateCode, java.lang.String certificateName,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmCertificate> findByCertificateCodeAndCertificateName(
		java.lang.String certificateCode, java.lang.String certificateName,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.duongbien.dao.vrcb.model.DmCertificate findByCertificateCodeAndCertificateName_First(
		java.lang.String certificateCode, java.lang.String certificateName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException;

	/**
	* Returns the first dm certificate in the ordered set where certificateCode = &#63; and certificateName = &#63;.
	*
	* @param certificateCode the certificate code
	* @param certificateName the certificate name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm certificate, or <code>null</code> if a matching dm certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmCertificate fetchByCertificateCodeAndCertificateName_First(
		java.lang.String certificateCode, java.lang.String certificateName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.duongbien.dao.vrcb.model.DmCertificate findByCertificateCodeAndCertificateName_Last(
		java.lang.String certificateCode, java.lang.String certificateName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException;

	/**
	* Returns the last dm certificate in the ordered set where certificateCode = &#63; and certificateName = &#63;.
	*
	* @param certificateCode the certificate code
	* @param certificateName the certificate name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm certificate, or <code>null</code> if a matching dm certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmCertificate fetchByCertificateCodeAndCertificateName_Last(
		java.lang.String certificateCode, java.lang.String certificateName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.duongbien.dao.vrcb.model.DmCertificate[] findByCertificateCodeAndCertificateName_PrevAndNext(
		long id, java.lang.String certificateCode,
		java.lang.String certificateName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException;

	/**
	* Removes all the dm certificates where certificateCode = &#63; and certificateName = &#63; from the database.
	*
	* @param certificateCode the certificate code
	* @param certificateName the certificate name
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCertificateCodeAndCertificateName(
		java.lang.String certificateCode, java.lang.String certificateName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm certificates where certificateCode = &#63; and certificateName = &#63;.
	*
	* @param certificateCode the certificate code
	* @param certificateName the certificate name
	* @return the number of matching dm certificates
	* @throws SystemException if a system exception occurred
	*/
	public int countByCertificateCodeAndCertificateName(
		java.lang.String certificateCode, java.lang.String certificateName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the dm certificate in the entity cache if it is enabled.
	*
	* @param dmCertificate the dm certificate
	*/
	public void cacheResult(
		vn.dtt.duongbien.dao.vrcb.model.DmCertificate dmCertificate);

	/**
	* Caches the dm certificates in the entity cache if it is enabled.
	*
	* @param dmCertificates the dm certificates
	*/
	public void cacheResult(
		java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmCertificate> dmCertificates);

	/**
	* Creates a new dm certificate with the primary key. Does not add the dm certificate to the database.
	*
	* @param id the primary key for the new dm certificate
	* @return the new dm certificate
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmCertificate create(long id);

	/**
	* Removes the dm certificate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm certificate
	* @return the dm certificate that was removed
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException if a dm certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmCertificate remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException;

	public vn.dtt.duongbien.dao.vrcb.model.DmCertificate updateImpl(
		vn.dtt.duongbien.dao.vrcb.model.DmCertificate dmCertificate)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm certificate with the primary key or throws a {@link vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException} if it could not be found.
	*
	* @param id the primary key of the dm certificate
	* @return the dm certificate
	* @throws vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException if a dm certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmCertificate findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.duongbien.dao.vrcb.NoSuchDmCertificateException;

	/**
	* Returns the dm certificate with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm certificate
	* @return the dm certificate, or <code>null</code> if a dm certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.duongbien.dao.vrcb.model.DmCertificate fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm certificates.
	*
	* @return the dm certificates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmCertificate> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmCertificate> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.duongbien.dao.vrcb.model.DmCertificate> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm certificates from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm certificates.
	*
	* @return the number of dm certificates
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}