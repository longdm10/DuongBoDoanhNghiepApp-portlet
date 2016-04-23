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

import vn.dtt.duongbien.dao.vrcb.model.TempPassengerDetails;
import vn.dtt.duongbien.dao.vrcb.service.base.TempPassengerDetailsLocalServiceBaseImpl;

/**
 * The implementation of the temp passenger details local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.duongbien.dao.vrcb.service.TempPassengerDetailsLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author longdm
 * @see vn.dtt.duongbien.dao.vrcb.service.base.TempPassengerDetailsLocalServiceBaseImpl
 * @see vn.dtt.duongbien.dao.vrcb.service.TempPassengerDetailsLocalServiceUtil
 */
public class TempPassengerDetailsLocalServiceImpl
	extends TempPassengerDetailsLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.duongbien.dao.vrcb.service.TempPassengerDetailsLocalServiceUtil} to access the temp passenger details local service.
	 */
	
	public TempPassengerDetails addTempPassengerDetails(String passengerCode, String familyName, String givenName) throws SystemException{
		long itemId = CounterLocalServiceUtil.increment(TempPassengerDetails.class.getName());
		TempPassengerDetails item = tempPassengerDetailsPersistence.create(itemId);
		item.setPassengerCode(passengerCode);
		item.setFamilyName(familyName);
		item.setGivenName(givenName);
		tempPassengerDetailsPersistence.update(item);
		return item;
	}
}