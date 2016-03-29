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

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

import vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnitException;
import vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit;
import vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc;
import vn.dtt.duongbo.dao.motcua.service.OEPUserMgtWorkingUnitLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.base.OEPUserMgtWorkingUnitLocalServiceBaseImpl;
import vn.dtt.duongbo.portlet.DuongBoAction;

/**
 * The implementation of the o e p user mgt working unit local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.duongbo.dao.motcua.service.OEPUserMgtWorkingUnitLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.duongbo.dao.motcua.service.base.OEPUserMgtWorkingUnitLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.motcua.service.OEPUserMgtWorkingUnitLocalServiceUtil
 */
public class OEPUserMgtWorkingUnitLocalServiceImpl extends OEPUserMgtWorkingUnitLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.duongbo.dao.motcua.service.OEPUserMgtWorkingUnitLocalServiceUtil} to access the o e p user mgt working unit local service.
	 */
	public List<OEPUserMgtWorkingUnit> getWorkingUnitByTTHCId(long tthcId) {
		List<OEPUserMgtWorkingUnit> result = new ArrayList<OEPUserMgtWorkingUnit>();
		List<OEPUserMgtWorkingUnit2tthc> resultBase = new ArrayList<OEPUserMgtWorkingUnit2tthc>();
		try {
			resultBase = oepUserMgtWorkingUnit2tthcPersistence.findByF_TTHCId(tthcId);
			for (OEPUserMgtWorkingUnit2tthc ett : resultBase) {
				result.add(OEPUserMgtWorkingUnitLocalServiceUtil.fetchOEPUserMgtWorkingUnit(ett.getWorkingUnitId()));
			}
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public OEPUserMgtWorkingUnit getByGovAgentId(String govAgentId) throws NoSuchOEPUserMgtWorkingUnitException, SystemException {
		return oepUserMgtWorkingUnitPersistence.fetchByGovAgentId(govAgentId);
	}
	public OEPUserMgtWorkingUnit fetchByF_organizationId(String organizationId) throws NoSuchOEPUserMgtWorkingUnitException, SystemException {
		return oepUserMgtWorkingUnitPersistence.fetchByF_organizationId(organizationId);
	}
	public List<OEPUserMgtWorkingUnit> findByF_parentWorkingUnitId(long parentWorkingUnitId) throws SystemException {
		return oepUserMgtWorkingUnitPersistence.findByF_parentWorkingUnitId(parentWorkingUnitId);
	}
	public List<OEPUserMgtWorkingUnit> findByF_parentWorkingUnitId(long parentWorkingUnitId, long TTHCId) throws SystemException {
		OEPUserMgtWorkingUnit2tthc ett2TTHC = null;
		List<OEPUserMgtWorkingUnit> listBase = new ArrayList<OEPUserMgtWorkingUnit>();
		List<OEPUserMgtWorkingUnit> listReturn = new ArrayList<OEPUserMgtWorkingUnit>();
		listBase = oepUserMgtWorkingUnitPersistence.findByF_parentWorkingUnitId(parentWorkingUnitId);
		for (OEPUserMgtWorkingUnit oepUserMgtWorkingUnit : listBase) {
			ett2TTHC = oepUserMgtWorkingUnit2tthcPersistence.fetchByF_TTHCId_workingUnitId(TTHCId, oepUserMgtWorkingUnit.getWorkingUnitId());
			if(Validator.isNotNull(ett2TTHC)){
				listReturn.add(oepUserMgtWorkingUnit);
			}
		}
		return listReturn;
	}
	
	private Log _log = LogFactoryUtil.getLog(OEPUserMgtWorkingUnitLocalServiceImpl.class);
}