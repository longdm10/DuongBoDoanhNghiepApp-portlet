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
import java.util.List;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;

import vn.dtt.duongbien.dao.vrcb.model.TempDocument;
import vn.dtt.duongbien.dao.vrcb.service.base.TempDocumentLocalServiceBaseImpl;

/**
 * The implementation of the temp document local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.duongbien.dao.vrcb.service.TempDocumentLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author longdm
 * @see vn.dtt.duongbien.dao.vrcb.service.base.TempDocumentLocalServiceBaseImpl
 * @see vn.dtt.duongbien.dao.vrcb.service.TempDocumentLocalServiceUtil
 */
public class TempDocumentLocalServiceImpl
	extends TempDocumentLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.duongbien.dao.vrcb.service.TempDocumentLocalServiceUtil} to access the temp document local service.
	 */
	public TempDocument addTempDocument(String requestCode, long documentName, int documentYear, String documentTypeCode, String userCreated, String shipAgencyCode, String shipName, String shipTypeCode, String shipCaptain, String imo, Date shipDateFrom, Date shipDateTo, Date shipDateLastCheck) throws SystemException{
		long itemId = CounterLocalServiceUtil.increment(TempDocument.class.getName());
		TempDocument item = tempDocumentPersistence.create(itemId);
		item.setRequestCode(requestCode);
		item.setDocumentName(documentName);
		item.setDocumentYear(documentYear);
		item.setDocumentTypeCode(documentTypeCode);
		item.setUserCreated(userCreated);
		item.setShipAgencyCode(shipAgencyCode);
		item.setShipName(shipName);
		item.setShipTypeCode(shipTypeCode);
		item.setShipCaptain(shipCaptain);
		item.setImo(imo);
		item.setCreatedDate(new Date());
		item.setShipDateFrom(shipDateFrom);
		item.setShipDateTo(shipDateTo);
		item.setShipDateLastCheck(shipDateLastCheck);
		tempDocumentPersistence.update(item);
		return item;
	}
	
	public List findByRequestCode(String requestCode) throws SystemException{
		return tempDocumentPersistence.findByRequestCode(requestCode);
	}
	
	public List findByRequestCode(String requestCode,int start, int end) throws SystemException{
		return tempDocumentPersistence.findByRequestCode(requestCode,start,end);
	}
	
	public int countByRequestCode(String requestCode) throws SystemException{
		return tempDocumentPersistence.countByRequestCode(requestCode);
	}
}