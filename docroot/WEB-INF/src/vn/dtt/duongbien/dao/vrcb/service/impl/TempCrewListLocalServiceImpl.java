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

import vn.dtt.duongbien.dao.vrcb.model.TempCrewList;
import vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclaration;
import vn.dtt.duongbien.dao.vrcb.service.base.TempCrewListLocalServiceBaseImpl;

/**
 * The implementation of the temp crew list local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.duongbien.dao.vrcb.service.TempCrewListLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author longdm
 * @see vn.dtt.duongbien.dao.vrcb.service.base.TempCrewListLocalServiceBaseImpl
 * @see vn.dtt.duongbien.dao.vrcb.service.TempCrewListLocalServiceUtil
 */
public class TempCrewListLocalServiceImpl
	extends TempCrewListLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.duongbien.dao.vrcb.service.TempCrewListLocalServiceUtil} to access the temp crew list local service.
	 */
	public TempCrewList addTemCrewList(long documentName, int documentYear, String userCreated, int isArrival, String nameOfShip, String imoNumber, String voyageNumber, String portOfArrivalCode, Date dateOfArrival, String lastPortOfCallCode, String requestCode) throws SystemException{
		TempCrewList item = null;
		try {
			long itemId = CounterLocalServiceUtil.increment(TempCrewList.class.getName());
			item = tempCrewListPersistence.create(itemId);
			item.setRequestCode(requestCode);
			item.setDocumentName(documentName);
			item.setDocumentYear(documentYear);
			item.setUserCreated(userCreated);
			item.setIsArrival(isArrival);
			item.setNameOfShip(nameOfShip);
			item.setImoNumber(imoNumber);
			item.setVoyageNumber(voyageNumber);
			item.setPortOfArrivalCode(portOfArrivalCode);
			item.setDateOfArrival(dateOfArrival);
			item.setLastPortOfCallCode(lastPortOfCallCode);
			tempCrewListPersistence.update(item);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return item;
	}
}