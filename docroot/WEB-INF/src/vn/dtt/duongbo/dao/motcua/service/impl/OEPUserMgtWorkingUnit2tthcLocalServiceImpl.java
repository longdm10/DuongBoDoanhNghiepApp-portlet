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

package vn.dtt.duongbo.dao.motcua.service.impl;

import com.liferay.portal.kernel.exception.SystemException;

import vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc;
import vn.dtt.duongbo.dao.motcua.service.base.OEPUserMgtWorkingUnit2tthcLocalServiceBaseImpl;

/**
 * The implementation of the o e p user mgt working unit2tthc local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.duongbo.dao.motcua.service.OEPUserMgtWorkingUnit2tthcLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.duongbo.dao.motcua.service.base.OEPUserMgtWorkingUnit2tthcLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.motcua.service.OEPUserMgtWorkingUnit2tthcLocalServiceUtil
 */
public class OEPUserMgtWorkingUnit2tthcLocalServiceImpl
	extends OEPUserMgtWorkingUnit2tthcLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.duongbo.dao.motcua.service.OEPUserMgtWorkingUnit2tthcLocalServiceUtil} to access the o e p user mgt working unit2tthc local service.
	 */
	public OEPUserMgtWorkingUnit2tthc fetchByF_TTHCId_workingUnitId(long TTHCId, long workingUnitId) throws SystemException {
		return oepUserMgtWorkingUnit2tthcPersistence.fetchByF_TTHCId_workingUnitId(TTHCId, workingUnitId);
	}
}