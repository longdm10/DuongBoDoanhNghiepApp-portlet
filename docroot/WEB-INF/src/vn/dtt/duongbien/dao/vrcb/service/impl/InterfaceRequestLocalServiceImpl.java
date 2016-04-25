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
import java.util.UUID;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;

import vn.dtt.duongbien.dao.vrcb.model.InterfaceRequest;
import vn.dtt.duongbien.dao.vrcb.service.base.InterfaceRequestLocalServiceBaseImpl;

/**
 * The implementation of the interface request local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.duongbien.dao.vrcb.service.InterfaceRequestLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author longdm
 * @see vn.dtt.duongbien.dao.vrcb.service.base.InterfaceRequestLocalServiceBaseImpl
 * @see vn.dtt.duongbien.dao.vrcb.service.InterfaceRequestLocalServiceUtil
 */
public class InterfaceRequestLocalServiceImpl
	extends InterfaceRequestLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.duongbien.dao.vrcb.service.InterfaceRequestLocalServiceUtil} to access the interface request local service.
	 */
	
	public InterfaceRequest addInterfaceRequest(int isArrival) throws SystemException{
		long itemId = CounterLocalServiceUtil.increment(InterfaceRequest.class.getName());
		InterfaceRequest interfaceRequest= interfaceRequestPersistence.create(itemId);
		interfaceRequest.setRequestCode(UUID.randomUUID().toString());
		if(isArrival>0){
			interfaceRequest.setRequestDirection("IN");
		}else{
			interfaceRequest.setRequestDirection("OUT");
		}
		interfaceRequest.setRequestDate(new Date());
		interfaceRequest.setRequestedDate(new Date());
		interfaceRequest.setRequestResponseTime(new Date());
		interfaceRequestPersistence.update(interfaceRequest);
		return interfaceRequest;
	}
}