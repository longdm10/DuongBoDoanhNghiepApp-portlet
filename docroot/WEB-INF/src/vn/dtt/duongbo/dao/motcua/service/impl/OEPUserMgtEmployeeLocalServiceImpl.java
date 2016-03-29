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

import vn.dtt.duongbo.dao.motcua.NoSuchOEPUserMgtWorkingUnitException;
import vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee;
import vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit;
import vn.dtt.duongbo.dao.motcua.service.OEPUserMgtEmployeeLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.OEPUserMgtWorkingUnitLocalServiceUtil;
import vn.dtt.duongbo.dao.motcua.service.base.OEPUserMgtEmployeeLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

/**
 * The implementation of the o e p user mgt employee local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.duongbo.dao.motcua.service.OEPUserMgtEmployeeLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.duongbo.dao.motcua.service.base.OEPUserMgtEmployeeLocalServiceBaseImpl
 * @see vn.dtt.duongbo.dao.motcua.service.OEPUserMgtEmployeeLocalServiceUtil
 */
public class OEPUserMgtEmployeeLocalServiceImpl
	extends OEPUserMgtEmployeeLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.duongbo.dao.motcua.service.OEPUserMgtEmployeeLocalServiceUtil} to access the o e p user mgt employee local service.
	 */
	
	public List<OEPUserMgtEmployee> getEmployeeByWorkingUnitId(long workingUnitId) {
		List<OEPUserMgtEmployee> result = new ArrayList<OEPUserMgtEmployee>();
		try {
			result = oepUserMgtEmployeePersistence.findByF_workingUnitId(workingUnitId);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	public List<OEPUserMgtEmployee> findByworkingUnitId(long workingUnitId) throws SystemException {
			return oepUserMgtEmployeePersistence.findByworkingUnitId(workingUnitId);
	}
	
	public List<OEPUserMgtEmployee> getEmployeeByWorkingUserId(long userId) {
		List<OEPUserMgtEmployee> result = new ArrayList<OEPUserMgtEmployee>();
		try {
			result = oepUserMgtEmployeePersistence.findByF_userId(userId);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	public OEPUserMgtEmployee fetchByF_mappingUserId(long mappingUserId) throws SystemException {
		return oepUserMgtEmployeePersistence.fetchByF_mappingUserId(mappingUserId);
	}
	public List<OEPUserMgtEmployee> findByF_workingUnitId_typeOfEmployee(long mappingUserId) throws SystemException {
		OEPUserMgtEmployee oep = oepUserMgtEmployeePersistence.fetchByF_mappingUserId(mappingUserId);
		OEPUserMgtWorkingUnit oepWorkingUnit = OEPUserMgtWorkingUnitLocalServiceUtil.fetchOEPUserMgtWorkingUnit(oep.getWorkingUnitId());
		String typeOfEmployee = "lanhdao_duyethoso";
		long oepWorkingUnitId = -1;
		if(Validator.isNotNull(oepWorkingUnit) && oepWorkingUnit.getIsRoot() == 0){
			oepWorkingUnitId = oepWorkingUnit.getWorkingUnitId();
			if(oep.getTypeOfEmployee().equalsIgnoreCase("chuyenvien")){
				typeOfEmployee = "lanhdao_duyethoso";
			}else if(oep.getTypeOfEmployee().equalsIgnoreCase("lanhdao_duyethoso")){
				typeOfEmployee = "lanhdao_pheduyethoso";
				OEPUserMgtWorkingUnit oepWorkingUnitParent = OEPUserMgtWorkingUnitLocalServiceUtil.fetchOEPUserMgtWorkingUnit(oepWorkingUnit.getParentWorkingUnitId());
				oepWorkingUnitId = oepWorkingUnitParent.getWorkingUnitId();
			}else{
				typeOfEmployee = "chuyenvien";
			}
			
		}else if(oepWorkingUnit.getIsRoot() == 1){
			typeOfEmployee = "chuyenvien";
			OEPUserMgtWorkingUnit oepWorkingUnitChild = null;
			oepWorkingUnitChild = OEPUserMgtWorkingUnitLocalServiceUtil.findByF_parentWorkingUnitId(oepWorkingUnit.getWorkingUnitId()).get(0);
			
			oepWorkingUnitId = oepWorkingUnitChild.getWorkingUnitId();
		}
		return oepUserMgtEmployeePersistence.findByF_workingUnitId_typeOfEmployee(oepWorkingUnitId, typeOfEmployee);
}
	 private Log _log = LogFactoryUtil.getLog(OEPUserMgtEmployeeLocalServiceImpl.class);
}