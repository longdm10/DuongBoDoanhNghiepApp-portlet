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

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;

import vn.dtt.duongbien.dao.vrcb.model.TempCrewDetails;
import vn.dtt.duongbien.dao.vrcb.model.TempCrewList;
import vn.dtt.duongbien.dao.vrcb.service.base.TempCrewDetailsLocalServiceBaseImpl;

/**
 * The implementation of the temp crew details local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.duongbien.dao.vrcb.service.TempCrewDetailsLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author longdm
 * @see vn.dtt.duongbien.dao.vrcb.service.base.TempCrewDetailsLocalServiceBaseImpl
 * @see vn.dtt.duongbien.dao.vrcb.service.TempCrewDetailsLocalServiceUtil
 */
public class TempCrewDetailsLocalServiceImpl
	extends TempCrewDetailsLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.duongbien.dao.vrcb.service.TempCrewDetailsLocalServiceUtil} to access the temp crew details local service.
	 */
	public TempCrewDetails addTempCrewDetails(String crewcode, String familyName, String givenName, String rankCode) throws SystemException{
		long itemId = CounterLocalServiceUtil.increment(TempCrewDetails.class.getName());
		TempCrewDetails item = tempCrewDetailsPersistence.create(itemId);
		item.setCrewcode(crewcode);
		item.setFamilyName(familyName);
		item.setGivenName(givenName);
		item.setRankCode(rankCode);
		tempCrewDetailsPersistence.update(item);
		return item;
	}
}