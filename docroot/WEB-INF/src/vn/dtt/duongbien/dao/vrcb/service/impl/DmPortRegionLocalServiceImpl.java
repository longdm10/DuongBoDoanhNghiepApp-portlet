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

import vn.dtt.duongbien.dao.vrcb.service.base.DmPortRegionLocalServiceBaseImpl;

/**
 * The implementation of the dm port region local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.duongbien.dao.vrcb.service.DmPortRegionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author longdm
 * @see vn.dtt.duongbien.dao.vrcb.service.base.DmPortRegionLocalServiceBaseImpl
 * @see vn.dtt.duongbien.dao.vrcb.service.DmPortRegionLocalServiceUtil
 */
public class DmPortRegionLocalServiceImpl
	extends DmPortRegionLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.duongbien.dao.vrcb.service.DmPortRegionLocalServiceUtil} to access the dm port region local service.
	 */
	public List getDmPortRegion() throws SystemException{
		return dmPortRegionPersistence.findAll();
	}
	
	public List findByPortRegionCode(String portRegionCode) throws SystemException{
		return dmPortRegionPersistence.findByPortRegionCode(portRegionCode);
	}
}