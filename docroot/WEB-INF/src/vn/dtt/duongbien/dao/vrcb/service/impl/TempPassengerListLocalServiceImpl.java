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

import java.util.Date;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;

import vn.dtt.duongbien.dao.vrcb.model.TempPassengerList;
import vn.dtt.duongbien.dao.vrcb.service.base.TempPassengerListLocalServiceBaseImpl;

/**
 * The implementation of the temp passenger list local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.duongbien.dao.vrcb.service.TempPassengerListLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author longdm
 * @see vn.dtt.duongbien.dao.vrcb.service.base.TempPassengerListLocalServiceBaseImpl
 * @see vn.dtt.duongbien.dao.vrcb.service.TempPassengerListLocalServiceUtil
 */
public class TempPassengerListLocalServiceImpl
	extends TempPassengerListLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.duongbien.dao.vrcb.service.TempPassengerListLocalServiceUtil} to access the temp passenger list local service.
	 */
	
	public TempPassengerList addTempPassengerList(long documentName, int documentYear, String userCreated, int isArrival, String nameOfShip, String portOfArrivalCode, Date dateOfArrival, String imoNumber, String voyageNumber) throws SystemException{
		long itemID = CounterLocalServiceUtil.increment(TempPassengerList.class.getName());
		TempPassengerList item = tempPassengerListPersistence.create(itemID);
		item.setDocumentName(documentName);
		item.setDocumentYear(documentYear);
		item.setUserCreated(userCreated);
		item.setIsArrival(isArrival);
		item.setNameOfShip(nameOfShip);
		item.setPortOfArrivalCode(portOfArrivalCode);
		item.setDateOfArrival(dateOfArrival);
		item.setImoNumber(imoNumber);
		item.setVoyageNumber(voyageNumber);
		return item;
	}
}