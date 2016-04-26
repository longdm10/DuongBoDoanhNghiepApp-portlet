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

package vn.dtt.duongbien.dao.vrcb.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import vn.dtt.duongbien.dao.vrcb.service.base.DmDocTypeLocalServiceBaseImpl;

/**
 * The implementation of the dm doc type local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.duongbien.dao.vrcb.service.DmDocTypeLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author longdm
 * @see vn.dtt.duongbien.dao.vrcb.service.base.DmDocTypeLocalServiceBaseImpl
 * @see vn.dtt.duongbien.dao.vrcb.service.DmDocTypeLocalServiceUtil
 */
public class DmDocTypeLocalServiceImpl extends DmDocTypeLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.duongbien.dao.vrcb.service.DmDocTypeLocalServiceUtil} to access the dm doc type local service.
	 */
	public List getALlDocType() throws SystemException{
		return dmDocTypePersistence.findAll();
	}
	
	public List findByDocType(String documentTypeCode) throws SystemException{
		return dmDocTypePersistence.findByDocumentTypeCode(documentTypeCode);
	}
}