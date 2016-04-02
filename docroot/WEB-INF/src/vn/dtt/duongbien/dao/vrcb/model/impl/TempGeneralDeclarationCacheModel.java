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

package vn.dtt.duongbien.dao.vrcb.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclaration;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TempGeneralDeclaration in entity cache.
 *
 * @author longdm
 * @see TempGeneralDeclaration
 * @generated
 */
public class TempGeneralDeclarationCacheModel implements CacheModel<TempGeneralDeclaration>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(97);

		sb.append("{id=");
		sb.append(id);
		sb.append(", requestCode=");
		sb.append(requestCode);
		sb.append(", requestState=");
		sb.append(requestState);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append(", documentYear=");
		sb.append(documentYear);
		sb.append(", userCreated=");
		sb.append(userCreated);
		sb.append(", isArrival=");
		sb.append(isArrival);
		sb.append(", nameOfShip=");
		sb.append(nameOfShip);
		sb.append(", shipTypeCode=");
		sb.append(shipTypeCode);
		sb.append(", imoNumber=");
		sb.append(imoNumber);
		sb.append(", callSign=");
		sb.append(callSign);
		sb.append(", voyageNumber=");
		sb.append(voyageNumber);
		sb.append(", portOfArrivalCode=");
		sb.append(portOfArrivalCode);
		sb.append(", dateOfArrival=");
		sb.append(dateOfArrival);
		sb.append(", portHarbourCode=");
		sb.append(portHarbourCode);
		sb.append(", portRegionCode=");
		sb.append(portRegionCode);
		sb.append(", portWharfCode=");
		sb.append(portWharfCode);
		sb.append(", flagStateOfShip=");
		sb.append(flagStateOfShip);
		sb.append(", nameOfMaster=");
		sb.append(nameOfMaster);
		sb.append(", lastPortOfCallCode=");
		sb.append(lastPortOfCallCode);
		sb.append(", certificateOfRegistryNumber=");
		sb.append(certificateOfRegistryNumber);
		sb.append(", certificateOfRegistryDate=");
		sb.append(certificateOfRegistryDate);
		sb.append(", certificateOfRegistryPortName=");
		sb.append(certificateOfRegistryPortName);
		sb.append(", taxCodeOfShipownersAgents=");
		sb.append(taxCodeOfShipownersAgents);
		sb.append(", nameOfShipownersAgents=");
		sb.append(nameOfShipownersAgents);
		sb.append(", shipAgencyAddress=");
		sb.append(shipAgencyAddress);
		sb.append(", shipAgencyPhone=");
		sb.append(shipAgencyPhone);
		sb.append(", shipAgencyFax=");
		sb.append(shipAgencyFax);
		sb.append(", shipAgencyEmail=");
		sb.append(shipAgencyEmail);
		sb.append(", grossTonnage=");
		sb.append(grossTonnage);
		sb.append(", netTonnage=");
		sb.append(netTonnage);
		sb.append(", positionOfShipInport=");
		sb.append(positionOfShipInport);
		sb.append(", briefParticularsOfVoyage=");
		sb.append(briefParticularsOfVoyage);
		sb.append(", briefDescriptionOfTheCargo=");
		sb.append(briefDescriptionOfTheCargo);
		sb.append(", numberOfCrew=");
		sb.append(numberOfCrew);
		sb.append(", numberOfPassengers=");
		sb.append(numberOfPassengers);
		sb.append(", shipRequirementsInTermsOfWaste=");
		sb.append(shipRequirementsInTermsOfWaste);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append(", numberCargoDeclaration=");
		sb.append(numberCargoDeclaration);
		sb.append(", numberShipStoreDeclaration=");
		sb.append(numberShipStoreDeclaration);
		sb.append(", numberCrewList=");
		sb.append(numberCrewList);
		sb.append(", numberPassengerList=");
		sb.append(numberPassengerList);
		sb.append(", numberCrewEffects=");
		sb.append(numberCrewEffects);
		sb.append(", numberHealthMaritime=");
		sb.append(numberHealthMaritime);
		sb.append(", signPlace=");
		sb.append(signPlace);
		sb.append(", signDate=");
		sb.append(signDate);
		sb.append(", masterSigned=");
		sb.append(masterSigned);
		sb.append(", masterSignedImage=");
		sb.append(masterSignedImage);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TempGeneralDeclaration toEntityModel() {
		TempGeneralDeclarationImpl tempGeneralDeclarationImpl = new TempGeneralDeclarationImpl();

		tempGeneralDeclarationImpl.setId(id);

		if (requestCode == null) {
			tempGeneralDeclarationImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			tempGeneralDeclarationImpl.setRequestCode(requestCode);
		}

		tempGeneralDeclarationImpl.setRequestState(requestState);
		tempGeneralDeclarationImpl.setDocumentName(documentName);
		tempGeneralDeclarationImpl.setDocumentYear(documentYear);

		if (userCreated == null) {
			tempGeneralDeclarationImpl.setUserCreated(StringPool.BLANK);
		}
		else {
			tempGeneralDeclarationImpl.setUserCreated(userCreated);
		}

		tempGeneralDeclarationImpl.setIsArrival(isArrival);

		if (nameOfShip == null) {
			tempGeneralDeclarationImpl.setNameOfShip(StringPool.BLANK);
		}
		else {
			tempGeneralDeclarationImpl.setNameOfShip(nameOfShip);
		}

		if (shipTypeCode == null) {
			tempGeneralDeclarationImpl.setShipTypeCode(StringPool.BLANK);
		}
		else {
			tempGeneralDeclarationImpl.setShipTypeCode(shipTypeCode);
		}

		if (imoNumber == null) {
			tempGeneralDeclarationImpl.setImoNumber(StringPool.BLANK);
		}
		else {
			tempGeneralDeclarationImpl.setImoNumber(imoNumber);
		}

		if (callSign == null) {
			tempGeneralDeclarationImpl.setCallSign(StringPool.BLANK);
		}
		else {
			tempGeneralDeclarationImpl.setCallSign(callSign);
		}

		if (voyageNumber == null) {
			tempGeneralDeclarationImpl.setVoyageNumber(StringPool.BLANK);
		}
		else {
			tempGeneralDeclarationImpl.setVoyageNumber(voyageNumber);
		}

		if (portOfArrivalCode == null) {
			tempGeneralDeclarationImpl.setPortOfArrivalCode(StringPool.BLANK);
		}
		else {
			tempGeneralDeclarationImpl.setPortOfArrivalCode(portOfArrivalCode);
		}

		if (dateOfArrival == Long.MIN_VALUE) {
			tempGeneralDeclarationImpl.setDateOfArrival(null);
		}
		else {
			tempGeneralDeclarationImpl.setDateOfArrival(new Date(dateOfArrival));
		}

		if (portHarbourCode == null) {
			tempGeneralDeclarationImpl.setPortHarbourCode(StringPool.BLANK);
		}
		else {
			tempGeneralDeclarationImpl.setPortHarbourCode(portHarbourCode);
		}

		if (portRegionCode == null) {
			tempGeneralDeclarationImpl.setPortRegionCode(StringPool.BLANK);
		}
		else {
			tempGeneralDeclarationImpl.setPortRegionCode(portRegionCode);
		}

		if (portWharfCode == null) {
			tempGeneralDeclarationImpl.setPortWharfCode(StringPool.BLANK);
		}
		else {
			tempGeneralDeclarationImpl.setPortWharfCode(portWharfCode);
		}

		if (flagStateOfShip == null) {
			tempGeneralDeclarationImpl.setFlagStateOfShip(StringPool.BLANK);
		}
		else {
			tempGeneralDeclarationImpl.setFlagStateOfShip(flagStateOfShip);
		}

		if (nameOfMaster == null) {
			tempGeneralDeclarationImpl.setNameOfMaster(StringPool.BLANK);
		}
		else {
			tempGeneralDeclarationImpl.setNameOfMaster(nameOfMaster);
		}

		if (lastPortOfCallCode == null) {
			tempGeneralDeclarationImpl.setLastPortOfCallCode(StringPool.BLANK);
		}
		else {
			tempGeneralDeclarationImpl.setLastPortOfCallCode(lastPortOfCallCode);
		}

		if (certificateOfRegistryNumber == null) {
			tempGeneralDeclarationImpl.setCertificateOfRegistryNumber(StringPool.BLANK);
		}
		else {
			tempGeneralDeclarationImpl.setCertificateOfRegistryNumber(certificateOfRegistryNumber);
		}

		if (certificateOfRegistryDate == Long.MIN_VALUE) {
			tempGeneralDeclarationImpl.setCertificateOfRegistryDate(null);
		}
		else {
			tempGeneralDeclarationImpl.setCertificateOfRegistryDate(new Date(
					certificateOfRegistryDate));
		}

		if (certificateOfRegistryPortName == null) {
			tempGeneralDeclarationImpl.setCertificateOfRegistryPortName(StringPool.BLANK);
		}
		else {
			tempGeneralDeclarationImpl.setCertificateOfRegistryPortName(certificateOfRegistryPortName);
		}

		if (taxCodeOfShipownersAgents == null) {
			tempGeneralDeclarationImpl.setTaxCodeOfShipownersAgents(StringPool.BLANK);
		}
		else {
			tempGeneralDeclarationImpl.setTaxCodeOfShipownersAgents(taxCodeOfShipownersAgents);
		}

		if (nameOfShipownersAgents == null) {
			tempGeneralDeclarationImpl.setNameOfShipownersAgents(StringPool.BLANK);
		}
		else {
			tempGeneralDeclarationImpl.setNameOfShipownersAgents(nameOfShipownersAgents);
		}

		if (shipAgencyAddress == null) {
			tempGeneralDeclarationImpl.setShipAgencyAddress(StringPool.BLANK);
		}
		else {
			tempGeneralDeclarationImpl.setShipAgencyAddress(shipAgencyAddress);
		}

		if (shipAgencyPhone == null) {
			tempGeneralDeclarationImpl.setShipAgencyPhone(StringPool.BLANK);
		}
		else {
			tempGeneralDeclarationImpl.setShipAgencyPhone(shipAgencyPhone);
		}

		if (shipAgencyFax == null) {
			tempGeneralDeclarationImpl.setShipAgencyFax(StringPool.BLANK);
		}
		else {
			tempGeneralDeclarationImpl.setShipAgencyFax(shipAgencyFax);
		}

		if (shipAgencyEmail == null) {
			tempGeneralDeclarationImpl.setShipAgencyEmail(StringPool.BLANK);
		}
		else {
			tempGeneralDeclarationImpl.setShipAgencyEmail(shipAgencyEmail);
		}

		tempGeneralDeclarationImpl.setGrossTonnage(grossTonnage);
		tempGeneralDeclarationImpl.setNetTonnage(netTonnage);

		if (positionOfShipInport == null) {
			tempGeneralDeclarationImpl.setPositionOfShipInport(StringPool.BLANK);
		}
		else {
			tempGeneralDeclarationImpl.setPositionOfShipInport(positionOfShipInport);
		}

		if (briefParticularsOfVoyage == null) {
			tempGeneralDeclarationImpl.setBriefParticularsOfVoyage(StringPool.BLANK);
		}
		else {
			tempGeneralDeclarationImpl.setBriefParticularsOfVoyage(briefParticularsOfVoyage);
		}

		if (briefDescriptionOfTheCargo == null) {
			tempGeneralDeclarationImpl.setBriefDescriptionOfTheCargo(StringPool.BLANK);
		}
		else {
			tempGeneralDeclarationImpl.setBriefDescriptionOfTheCargo(briefDescriptionOfTheCargo);
		}

		tempGeneralDeclarationImpl.setNumberOfCrew(numberOfCrew);
		tempGeneralDeclarationImpl.setNumberOfPassengers(numberOfPassengers);

		if (shipRequirementsInTermsOfWaste == null) {
			tempGeneralDeclarationImpl.setShipRequirementsInTermsOfWaste(StringPool.BLANK);
		}
		else {
			tempGeneralDeclarationImpl.setShipRequirementsInTermsOfWaste(shipRequirementsInTermsOfWaste);
		}

		if (remarks == null) {
			tempGeneralDeclarationImpl.setRemarks(StringPool.BLANK);
		}
		else {
			tempGeneralDeclarationImpl.setRemarks(remarks);
		}

		if (numberCargoDeclaration == null) {
			tempGeneralDeclarationImpl.setNumberCargoDeclaration(StringPool.BLANK);
		}
		else {
			tempGeneralDeclarationImpl.setNumberCargoDeclaration(numberCargoDeclaration);
		}

		if (numberShipStoreDeclaration == null) {
			tempGeneralDeclarationImpl.setNumberShipStoreDeclaration(StringPool.BLANK);
		}
		else {
			tempGeneralDeclarationImpl.setNumberShipStoreDeclaration(numberShipStoreDeclaration);
		}

		if (numberCrewList == null) {
			tempGeneralDeclarationImpl.setNumberCrewList(StringPool.BLANK);
		}
		else {
			tempGeneralDeclarationImpl.setNumberCrewList(numberCrewList);
		}

		if (numberPassengerList == null) {
			tempGeneralDeclarationImpl.setNumberPassengerList(StringPool.BLANK);
		}
		else {
			tempGeneralDeclarationImpl.setNumberPassengerList(numberPassengerList);
		}

		if (numberCrewEffects == null) {
			tempGeneralDeclarationImpl.setNumberCrewEffects(StringPool.BLANK);
		}
		else {
			tempGeneralDeclarationImpl.setNumberCrewEffects(numberCrewEffects);
		}

		if (numberHealthMaritime == null) {
			tempGeneralDeclarationImpl.setNumberHealthMaritime(StringPool.BLANK);
		}
		else {
			tempGeneralDeclarationImpl.setNumberHealthMaritime(numberHealthMaritime);
		}

		if (signPlace == null) {
			tempGeneralDeclarationImpl.setSignPlace(StringPool.BLANK);
		}
		else {
			tempGeneralDeclarationImpl.setSignPlace(signPlace);
		}

		if (signDate == Long.MIN_VALUE) {
			tempGeneralDeclarationImpl.setSignDate(null);
		}
		else {
			tempGeneralDeclarationImpl.setSignDate(new Date(signDate));
		}

		tempGeneralDeclarationImpl.setMasterSigned(masterSigned);
		tempGeneralDeclarationImpl.setMasterSignedImage(masterSignedImage);

		tempGeneralDeclarationImpl.resetOriginalValues();

		return tempGeneralDeclarationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		requestCode = objectInput.readUTF();
		requestState = objectInput.readInt();
		documentName = objectInput.readLong();
		documentYear = objectInput.readInt();
		userCreated = objectInput.readUTF();
		isArrival = objectInput.readInt();
		nameOfShip = objectInput.readUTF();
		shipTypeCode = objectInput.readUTF();
		imoNumber = objectInput.readUTF();
		callSign = objectInput.readUTF();
		voyageNumber = objectInput.readUTF();
		portOfArrivalCode = objectInput.readUTF();
		dateOfArrival = objectInput.readLong();
		portHarbourCode = objectInput.readUTF();
		portRegionCode = objectInput.readUTF();
		portWharfCode = objectInput.readUTF();
		flagStateOfShip = objectInput.readUTF();
		nameOfMaster = objectInput.readUTF();
		lastPortOfCallCode = objectInput.readUTF();
		certificateOfRegistryNumber = objectInput.readUTF();
		certificateOfRegistryDate = objectInput.readLong();
		certificateOfRegistryPortName = objectInput.readUTF();
		taxCodeOfShipownersAgents = objectInput.readUTF();
		nameOfShipownersAgents = objectInput.readUTF();
		shipAgencyAddress = objectInput.readUTF();
		shipAgencyPhone = objectInput.readUTF();
		shipAgencyFax = objectInput.readUTF();
		shipAgencyEmail = objectInput.readUTF();
		grossTonnage = objectInput.readDouble();
		netTonnage = objectInput.readDouble();
		positionOfShipInport = objectInput.readUTF();
		briefParticularsOfVoyage = objectInput.readUTF();
		briefDescriptionOfTheCargo = objectInput.readUTF();
		numberOfCrew = objectInput.readInt();
		numberOfPassengers = objectInput.readInt();
		shipRequirementsInTermsOfWaste = objectInput.readUTF();
		remarks = objectInput.readUTF();
		numberCargoDeclaration = objectInput.readUTF();
		numberShipStoreDeclaration = objectInput.readUTF();
		numberCrewList = objectInput.readUTF();
		numberPassengerList = objectInput.readUTF();
		numberCrewEffects = objectInput.readUTF();
		numberHealthMaritime = objectInput.readUTF();
		signPlace = objectInput.readUTF();
		signDate = objectInput.readLong();
		masterSigned = objectInput.readInt();
		masterSignedImage = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (requestCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(requestCode);
		}

		objectOutput.writeInt(requestState);
		objectOutput.writeLong(documentName);
		objectOutput.writeInt(documentYear);

		if (userCreated == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userCreated);
		}

		objectOutput.writeInt(isArrival);

		if (nameOfShip == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nameOfShip);
		}

		if (shipTypeCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shipTypeCode);
		}

		if (imoNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(imoNumber);
		}

		if (callSign == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(callSign);
		}

		if (voyageNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(voyageNumber);
		}

		if (portOfArrivalCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(portOfArrivalCode);
		}

		objectOutput.writeLong(dateOfArrival);

		if (portHarbourCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(portHarbourCode);
		}

		if (portRegionCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(portRegionCode);
		}

		if (portWharfCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(portWharfCode);
		}

		if (flagStateOfShip == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(flagStateOfShip);
		}

		if (nameOfMaster == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nameOfMaster);
		}

		if (lastPortOfCallCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lastPortOfCallCode);
		}

		if (certificateOfRegistryNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certificateOfRegistryNumber);
		}

		objectOutput.writeLong(certificateOfRegistryDate);

		if (certificateOfRegistryPortName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certificateOfRegistryPortName);
		}

		if (taxCodeOfShipownersAgents == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(taxCodeOfShipownersAgents);
		}

		if (nameOfShipownersAgents == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nameOfShipownersAgents);
		}

		if (shipAgencyAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shipAgencyAddress);
		}

		if (shipAgencyPhone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shipAgencyPhone);
		}

		if (shipAgencyFax == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shipAgencyFax);
		}

		if (shipAgencyEmail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shipAgencyEmail);
		}

		objectOutput.writeDouble(grossTonnage);
		objectOutput.writeDouble(netTonnage);

		if (positionOfShipInport == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(positionOfShipInport);
		}

		if (briefParticularsOfVoyage == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(briefParticularsOfVoyage);
		}

		if (briefDescriptionOfTheCargo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(briefDescriptionOfTheCargo);
		}

		objectOutput.writeInt(numberOfCrew);
		objectOutput.writeInt(numberOfPassengers);

		if (shipRequirementsInTermsOfWaste == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shipRequirementsInTermsOfWaste);
		}

		if (remarks == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remarks);
		}

		if (numberCargoDeclaration == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(numberCargoDeclaration);
		}

		if (numberShipStoreDeclaration == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(numberShipStoreDeclaration);
		}

		if (numberCrewList == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(numberCrewList);
		}

		if (numberPassengerList == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(numberPassengerList);
		}

		if (numberCrewEffects == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(numberCrewEffects);
		}

		if (numberHealthMaritime == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(numberHealthMaritime);
		}

		if (signPlace == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(signPlace);
		}

		objectOutput.writeLong(signDate);
		objectOutput.writeInt(masterSigned);
		objectOutput.writeInt(masterSignedImage);
	}

	public long id;
	public String requestCode;
	public int requestState;
	public long documentName;
	public int documentYear;
	public String userCreated;
	public int isArrival;
	public String nameOfShip;
	public String shipTypeCode;
	public String imoNumber;
	public String callSign;
	public String voyageNumber;
	public String portOfArrivalCode;
	public long dateOfArrival;
	public String portHarbourCode;
	public String portRegionCode;
	public String portWharfCode;
	public String flagStateOfShip;
	public String nameOfMaster;
	public String lastPortOfCallCode;
	public String certificateOfRegistryNumber;
	public long certificateOfRegistryDate;
	public String certificateOfRegistryPortName;
	public String taxCodeOfShipownersAgents;
	public String nameOfShipownersAgents;
	public String shipAgencyAddress;
	public String shipAgencyPhone;
	public String shipAgencyFax;
	public String shipAgencyEmail;
	public double grossTonnage;
	public double netTonnage;
	public String positionOfShipInport;
	public String briefParticularsOfVoyage;
	public String briefDescriptionOfTheCargo;
	public int numberOfCrew;
	public int numberOfPassengers;
	public String shipRequirementsInTermsOfWaste;
	public String remarks;
	public String numberCargoDeclaration;
	public String numberShipStoreDeclaration;
	public String numberCrewList;
	public String numberPassengerList;
	public String numberCrewEffects;
	public String numberHealthMaritime;
	public String signPlace;
	public long signDate;
	public int masterSigned;
	public int masterSignedImage;
}