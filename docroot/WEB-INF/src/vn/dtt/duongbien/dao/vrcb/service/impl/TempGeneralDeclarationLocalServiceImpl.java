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

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import vn.dtt.duongbien.dao.vrcb.NoSuchTempGeneralDeclarationException;
import vn.dtt.duongbien.dao.vrcb.model.InterfaceRequest;
import vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclaration;
import vn.dtt.duongbien.dao.vrcb.service.InterfaceRequestLocalServiceUtil;
import vn.dtt.duongbien.dao.vrcb.service.base.TempGeneralDeclarationLocalServiceBaseImpl;

/**
 * The implementation of the temp general declaration local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.duongbien.dao.vrcb.service.TempGeneralDeclarationLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author longdm
 * @see vn.dtt.duongbien.dao.vrcb.service.base.TempGeneralDeclarationLocalServiceBaseImpl
 * @see vn.dtt.duongbien.dao.vrcb.service.TempGeneralDeclarationLocalServiceUtil
 */
public class TempGeneralDeclarationLocalServiceImpl
	extends TempGeneralDeclarationLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.duongbien.dao.vrcb.service.TempGeneralDeclarationLocalServiceUtil} to access the temp general declaration local service.
	 */
	public TempGeneralDeclaration addTemGeneralDeclaration(String nameOfShip, String nameOfMaster, String portRegionCode, String portOfArrivalCode, String portHarbourCode, String portWharfCode, int isArrival, String voyageNumber, int numberOfCrew, int numberOfPassengers, String lastPortOfCallCode, Date dateOfArrival, String taxCodeOfShipownersAgents, String nameOfShipownersAgents, String shipAgencyAddress, String shipAgencyPhone, String shipAgencyFax, String shipAgencyEmail, Date signDate) throws SystemException{
		InterfaceRequest lastIF = InterfaceRequestLocalServiceUtil.addInterfaceRequest(isArrival);
		long itemId = CounterLocalServiceUtil.increment(TempGeneralDeclaration.class.getName());
		TempGeneralDeclaration tgd = tempGeneralDeclarationPersistence.create(itemId);
		tgd.setNameOfShip(nameOfShip);
		tgd.setNameOfMaster(nameOfMaster);
		tgd.setPortRegionCode(portRegionCode);
		tgd.setPortOfArrivalCode(portOfArrivalCode);
		tgd.setPortHarbourCode(portHarbourCode);
		tgd.setPortWharfCode(portWharfCode);
		tgd.setIsArrival(isArrival);
		tgd.setVoyageNumber(voyageNumber);
		tgd.setNumberOfCrew(numberOfCrew);
		tgd.setNumberOfPassengers(numberOfPassengers);
		tgd.setLastPortOfCallCode(lastPortOfCallCode);
		tgd.setDateOfArrival(dateOfArrival);
		tgd.setTaxCodeOfShipownersAgents(taxCodeOfShipownersAgents);
		tgd.setNameOfShipownersAgents(nameOfShipownersAgents);
		tgd.setShipAgencyAddress(shipAgencyAddress);
		tgd.setShipAgencyPhone(shipAgencyPhone);
		tgd.setShipAgencyFax(shipAgencyFax);
		tgd.setShipAgencyEmail(shipAgencyEmail);
		tgd.setSignDate(signDate);
		tgd.setRequestCode(lastIF.getRequestCode());
		tempGeneralDeclarationPersistence.update(tgd);
		return tgd;
	}
	
	public TempGeneralDeclaration updateTemGeneralDeclaration(Long id,String nameOfShip, String nameOfMaster, String portRegionCode, String portOfArrivalCode, String portHarbourCode, String portWharfCode, int isArrival, String voyageNumber, int numberOfCrew, int numberOfPassengers, String lastPortOfCallCode, Date dateOfArrival, String taxCodeOfShipownersAgents, String nameOfShipownersAgents, String shipAgencyAddress, String shipAgencyPhone, String shipAgencyFax, String shipAgencyEmail, Date signDate) throws SystemException, NoSuchModelException{
		//long itemId = CounterLocalServiceUtil.increment(TempGeneralDeclaration.class.getName());
		TempGeneralDeclaration tgd = tempGeneralDeclarationPersistence.findByPrimaryKey(id);
		tgd.setNameOfShip(nameOfShip);
		tgd.setNameOfMaster(nameOfMaster);
		tgd.setPortRegionCode(portRegionCode);
		tgd.setPortOfArrivalCode(portOfArrivalCode);
		tgd.setPortHarbourCode(portHarbourCode);
		tgd.setPortWharfCode(portWharfCode);
		tgd.setIsArrival(isArrival);
		tgd.setVoyageNumber(voyageNumber);
		tgd.setNumberOfCrew(numberOfCrew);
		tgd.setNumberOfPassengers(numberOfPassengers);
		tgd.setLastPortOfCallCode(lastPortOfCallCode);
		tgd.setDateOfArrival(dateOfArrival);
		tgd.setTaxCodeOfShipownersAgents(taxCodeOfShipownersAgents);
		tgd.setNameOfShipownersAgents(nameOfShipownersAgents);
		tgd.setShipAgencyAddress(shipAgencyAddress);
		tgd.setShipAgencyPhone(shipAgencyPhone);
		tgd.setShipAgencyFax(shipAgencyFax);
		tgd.setShipAgencyEmail(shipAgencyEmail);
		tgd.setSignDate(signDate);
		tempGeneralDeclarationPersistence.update(tgd);
		return tgd;
	}
	
	public void deletTempGeneral(long itemId) throws NoSuchTempGeneralDeclarationException, SystemException{
		TempGeneralDeclaration item = tempGeneralDeclarationPersistence.findByPrimaryKey(itemId);
		tempGeneralDeclarationPersistence.remove(itemId);
	}
	
	public void updateTempGeneral(long itemId, String briefDescriptionOfTheCargo, double grossTonnage) throws NoSuchModelException, SystemException{
		TempGeneralDeclaration item = tempGeneralDeclarationPersistence.findByPrimaryKey(itemId);
		item.setBriefDescriptionOfTheCargo(briefDescriptionOfTheCargo);
		item.setGrossTonnage(grossTonnage);
		tempGeneralDeclarationPersistence.update(item);
	}
	
	public void updateRemarks(long itemId,String remarks) throws NoSuchTempGeneralDeclarationException, SystemException{
		TempGeneralDeclaration item = tempGeneralDeclarationPersistence.findByPrimaryKey(itemId);
		item.setRemarks(remarks);
		tempGeneralDeclarationPersistence.update(item);
	}
}
