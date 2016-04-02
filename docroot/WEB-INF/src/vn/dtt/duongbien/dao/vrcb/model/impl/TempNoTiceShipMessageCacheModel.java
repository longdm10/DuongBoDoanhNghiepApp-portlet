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

import vn.dtt.duongbien.dao.vrcb.model.TempNoTiceShipMessage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TempNoTiceShipMessage in entity cache.
 *
 * @author longdm
 * @see TempNoTiceShipMessage
 * @generated
 */
public class TempNoTiceShipMessageCacheModel implements CacheModel<TempNoTiceShipMessage>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(133);

		sb.append("{id=");
		sb.append(id);
		sb.append(", requestCode=");
		sb.append(requestCode);
		sb.append(", requestState=");
		sb.append(requestState);
		sb.append(", noticeShipType=");
		sb.append(noticeShipType);
		sb.append(", noticeShipCode=");
		sb.append(noticeShipCode);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append(", userCreated=");
		sb.append(userCreated);
		sb.append(", confirmTime=");
		sb.append(confirmTime);
		sb.append(", shipName=");
		sb.append(shipName);
		sb.append(", shipTypeCode=");
		sb.append(shipTypeCode);
		sb.append(", stateCode=");
		sb.append(stateCode);
		sb.append(", shipCaptain=");
		sb.append(shipCaptain);
		sb.append(", imo=");
		sb.append(imo);
		sb.append(", grt=");
		sb.append(grt);
		sb.append(", dwt=");
		sb.append(dwt);
		sb.append(", unitGRT=");
		sb.append(unitGRT);
		sb.append(", unitDWT=");
		sb.append(unitDWT);
		sb.append(", callSign=");
		sb.append(callSign);
		sb.append(", arrivalDate=");
		sb.append(arrivalDate);
		sb.append(", arrivalPortCode=");
		sb.append(arrivalPortCode);
		sb.append(", portHarbourCode=");
		sb.append(portHarbourCode);
		sb.append(", portRegionCode=");
		sb.append(portRegionCode);
		sb.append(", portWharfCode=");
		sb.append(portWharfCode);
		sb.append(", portGoingToStateName=");
		sb.append(portGoingToStateName);
		sb.append(", portGoingToCode=");
		sb.append(portGoingToCode);
		sb.append(", nameOfShipOwners=");
		sb.append(nameOfShipOwners);
		sb.append(", addressOfShipOwners=");
		sb.append(addressOfShipOwners);
		sb.append(", shipOwnerstateCode=");
		sb.append(shipOwnerstateCode);
		sb.append(", shipOwnerPhone=");
		sb.append(shipOwnerPhone);
		sb.append(", shipOwnerFax=");
		sb.append(shipOwnerFax);
		sb.append(", shipOwnerEmail=");
		sb.append(shipOwnerEmail);
		sb.append(", loa=");
		sb.append(loa);
		sb.append(", breadth=");
		sb.append(breadth);
		sb.append(", clearanceHeight=");
		sb.append(clearanceHeight);
		sb.append(", shownDraftxF=");
		sb.append(shownDraftxF);
		sb.append(", shownDraftxA=");
		sb.append(shownDraftxA);
		sb.append(", unitLOA=");
		sb.append(unitLOA);
		sb.append(", unitBreadth=");
		sb.append(unitBreadth);
		sb.append(", unitClearanceHeight=");
		sb.append(unitClearanceHeight);
		sb.append(", unitShownDraftxF=");
		sb.append(unitShownDraftxF);
		sb.append(", unitShownDraftxA=");
		sb.append(unitShownDraftxA);
		sb.append(", certificateOfRegistryNumber=");
		sb.append(certificateOfRegistryNumber);
		sb.append(", certificateOfRegistryDate=");
		sb.append(certificateOfRegistryDate);
		sb.append(", certificateOfRegistryPortName=");
		sb.append(certificateOfRegistryPortName);
		sb.append(", shipAgencyCode=");
		sb.append(shipAgencyCode);
		sb.append(", shipAgencyAddress=");
		sb.append(shipAgencyAddress);
		sb.append(", shipAgencyPhone=");
		sb.append(shipAgencyPhone);
		sb.append(", shipAgencyFax=");
		sb.append(shipAgencyFax);
		sb.append(", shipAgencyEmail=");
		sb.append(shipAgencyEmail);
		sb.append(", purposeCode=");
		sb.append(purposeCode);
		sb.append(", purposeSpecified=");
		sb.append(purposeSpecified);
		sb.append(", crewNumber=");
		sb.append(crewNumber);
		sb.append(", unitCrew=");
		sb.append(unitCrew);
		sb.append(", passengerNumber=");
		sb.append(passengerNumber);
		sb.append(", unitPassenger=");
		sb.append(unitPassenger);
		sb.append(", quantityAndTypeOfCargo=");
		sb.append(quantityAndTypeOfCargo);
		sb.append(", unitQuantityofCargo=");
		sb.append(unitQuantityofCargo);
		sb.append(", typeOfCargo=");
		sb.append(typeOfCargo);
		sb.append(", otherPersons=");
		sb.append(otherPersons);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append(", signPlace=");
		sb.append(signPlace);
		sb.append(", signDate=");
		sb.append(signDate);
		sb.append(", masterSigned=");
		sb.append(masterSigned);
		sb.append(", masterSignedImage=");
		sb.append(masterSignedImage);
		sb.append(", documentYear=");
		sb.append(documentYear);
		sb.append(", nameOfShipAgent=");
		sb.append(nameOfShipAgent);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TempNoTiceShipMessage toEntityModel() {
		TempNoTiceShipMessageImpl tempNoTiceShipMessageImpl = new TempNoTiceShipMessageImpl();

		tempNoTiceShipMessageImpl.setId(id);

		if (requestCode == null) {
			tempNoTiceShipMessageImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setRequestCode(requestCode);
		}

		tempNoTiceShipMessageImpl.setRequestState(requestState);

		if (noticeShipType == null) {
			tempNoTiceShipMessageImpl.setNoticeShipType(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setNoticeShipType(noticeShipType);
		}

		if (noticeShipCode == null) {
			tempNoTiceShipMessageImpl.setNoticeShipCode(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setNoticeShipCode(noticeShipCode);
		}

		tempNoTiceShipMessageImpl.setDocumentName(documentName);

		if (userCreated == null) {
			tempNoTiceShipMessageImpl.setUserCreated(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setUserCreated(userCreated);
		}

		tempNoTiceShipMessageImpl.setConfirmTime(confirmTime);

		if (shipName == null) {
			tempNoTiceShipMessageImpl.setShipName(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setShipName(shipName);
		}

		if (shipTypeCode == null) {
			tempNoTiceShipMessageImpl.setShipTypeCode(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setShipTypeCode(shipTypeCode);
		}

		if (stateCode == null) {
			tempNoTiceShipMessageImpl.setStateCode(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setStateCode(stateCode);
		}

		if (shipCaptain == null) {
			tempNoTiceShipMessageImpl.setShipCaptain(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setShipCaptain(shipCaptain);
		}

		if (imo == null) {
			tempNoTiceShipMessageImpl.setImo(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setImo(imo);
		}

		tempNoTiceShipMessageImpl.setGrt(grt);
		tempNoTiceShipMessageImpl.setDwt(dwt);

		if (unitGRT == null) {
			tempNoTiceShipMessageImpl.setUnitGRT(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setUnitGRT(unitGRT);
		}

		if (unitDWT == null) {
			tempNoTiceShipMessageImpl.setUnitDWT(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setUnitDWT(unitDWT);
		}

		if (callSign == null) {
			tempNoTiceShipMessageImpl.setCallSign(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setCallSign(callSign);
		}

		if (arrivalDate == Long.MIN_VALUE) {
			tempNoTiceShipMessageImpl.setArrivalDate(null);
		}
		else {
			tempNoTiceShipMessageImpl.setArrivalDate(new Date(arrivalDate));
		}

		if (arrivalPortCode == null) {
			tempNoTiceShipMessageImpl.setArrivalPortCode(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setArrivalPortCode(arrivalPortCode);
		}

		if (portHarbourCode == null) {
			tempNoTiceShipMessageImpl.setPortHarbourCode(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setPortHarbourCode(portHarbourCode);
		}

		if (portRegionCode == null) {
			tempNoTiceShipMessageImpl.setPortRegionCode(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setPortRegionCode(portRegionCode);
		}

		if (portWharfCode == null) {
			tempNoTiceShipMessageImpl.setPortWharfCode(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setPortWharfCode(portWharfCode);
		}

		if (portGoingToStateName == null) {
			tempNoTiceShipMessageImpl.setPortGoingToStateName(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setPortGoingToStateName(portGoingToStateName);
		}

		if (portGoingToCode == null) {
			tempNoTiceShipMessageImpl.setPortGoingToCode(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setPortGoingToCode(portGoingToCode);
		}

		if (nameOfShipOwners == null) {
			tempNoTiceShipMessageImpl.setNameOfShipOwners(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setNameOfShipOwners(nameOfShipOwners);
		}

		if (addressOfShipOwners == null) {
			tempNoTiceShipMessageImpl.setAddressOfShipOwners(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setAddressOfShipOwners(addressOfShipOwners);
		}

		if (shipOwnerstateCode == null) {
			tempNoTiceShipMessageImpl.setShipOwnerstateCode(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setShipOwnerstateCode(shipOwnerstateCode);
		}

		if (shipOwnerPhone == null) {
			tempNoTiceShipMessageImpl.setShipOwnerPhone(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setShipOwnerPhone(shipOwnerPhone);
		}

		if (shipOwnerFax == null) {
			tempNoTiceShipMessageImpl.setShipOwnerFax(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setShipOwnerFax(shipOwnerFax);
		}

		if (shipOwnerEmail == null) {
			tempNoTiceShipMessageImpl.setShipOwnerEmail(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setShipOwnerEmail(shipOwnerEmail);
		}

		tempNoTiceShipMessageImpl.setLoa(loa);
		tempNoTiceShipMessageImpl.setBreadth(breadth);
		tempNoTiceShipMessageImpl.setClearanceHeight(clearanceHeight);
		tempNoTiceShipMessageImpl.setShownDraftxF(shownDraftxF);
		tempNoTiceShipMessageImpl.setShownDraftxA(shownDraftxA);

		if (unitLOA == null) {
			tempNoTiceShipMessageImpl.setUnitLOA(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setUnitLOA(unitLOA);
		}

		if (unitBreadth == null) {
			tempNoTiceShipMessageImpl.setUnitBreadth(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setUnitBreadth(unitBreadth);
		}

		if (unitClearanceHeight == null) {
			tempNoTiceShipMessageImpl.setUnitClearanceHeight(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setUnitClearanceHeight(unitClearanceHeight);
		}

		if (unitShownDraftxF == null) {
			tempNoTiceShipMessageImpl.setUnitShownDraftxF(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setUnitShownDraftxF(unitShownDraftxF);
		}

		if (unitShownDraftxA == null) {
			tempNoTiceShipMessageImpl.setUnitShownDraftxA(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setUnitShownDraftxA(unitShownDraftxA);
		}

		if (certificateOfRegistryNumber == null) {
			tempNoTiceShipMessageImpl.setCertificateOfRegistryNumber(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setCertificateOfRegistryNumber(certificateOfRegistryNumber);
		}

		if (certificateOfRegistryDate == Long.MIN_VALUE) {
			tempNoTiceShipMessageImpl.setCertificateOfRegistryDate(null);
		}
		else {
			tempNoTiceShipMessageImpl.setCertificateOfRegistryDate(new Date(
					certificateOfRegistryDate));
		}

		if (certificateOfRegistryPortName == null) {
			tempNoTiceShipMessageImpl.setCertificateOfRegistryPortName(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setCertificateOfRegistryPortName(certificateOfRegistryPortName);
		}

		if (shipAgencyCode == null) {
			tempNoTiceShipMessageImpl.setShipAgencyCode(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setShipAgencyCode(shipAgencyCode);
		}

		if (shipAgencyAddress == null) {
			tempNoTiceShipMessageImpl.setShipAgencyAddress(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setShipAgencyAddress(shipAgencyAddress);
		}

		if (shipAgencyPhone == null) {
			tempNoTiceShipMessageImpl.setShipAgencyPhone(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setShipAgencyPhone(shipAgencyPhone);
		}

		if (shipAgencyFax == null) {
			tempNoTiceShipMessageImpl.setShipAgencyFax(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setShipAgencyFax(shipAgencyFax);
		}

		if (shipAgencyEmail == null) {
			tempNoTiceShipMessageImpl.setShipAgencyEmail(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setShipAgencyEmail(shipAgencyEmail);
		}

		if (purposeCode == null) {
			tempNoTiceShipMessageImpl.setPurposeCode(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setPurposeCode(purposeCode);
		}

		if (purposeSpecified == null) {
			tempNoTiceShipMessageImpl.setPurposeSpecified(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setPurposeSpecified(purposeSpecified);
		}

		tempNoTiceShipMessageImpl.setCrewNumber(crewNumber);

		if (unitCrew == null) {
			tempNoTiceShipMessageImpl.setUnitCrew(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setUnitCrew(unitCrew);
		}

		tempNoTiceShipMessageImpl.setPassengerNumber(passengerNumber);

		if (unitPassenger == null) {
			tempNoTiceShipMessageImpl.setUnitPassenger(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setUnitPassenger(unitPassenger);
		}

		if (quantityAndTypeOfCargo == null) {
			tempNoTiceShipMessageImpl.setQuantityAndTypeOfCargo(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setQuantityAndTypeOfCargo(quantityAndTypeOfCargo);
		}

		if (unitQuantityofCargo == null) {
			tempNoTiceShipMessageImpl.setUnitQuantityofCargo(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setUnitQuantityofCargo(unitQuantityofCargo);
		}

		if (typeOfCargo == null) {
			tempNoTiceShipMessageImpl.setTypeOfCargo(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setTypeOfCargo(typeOfCargo);
		}

		tempNoTiceShipMessageImpl.setOtherPersons(otherPersons);

		if (remarks == null) {
			tempNoTiceShipMessageImpl.setRemarks(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setRemarks(remarks);
		}

		if (signPlace == null) {
			tempNoTiceShipMessageImpl.setSignPlace(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setSignPlace(signPlace);
		}

		if (signDate == Long.MIN_VALUE) {
			tempNoTiceShipMessageImpl.setSignDate(null);
		}
		else {
			tempNoTiceShipMessageImpl.setSignDate(new Date(signDate));
		}

		tempNoTiceShipMessageImpl.setMasterSigned(masterSigned);
		tempNoTiceShipMessageImpl.setMasterSignedImage(masterSignedImage);
		tempNoTiceShipMessageImpl.setDocumentYear(documentYear);

		if (nameOfShipAgent == null) {
			tempNoTiceShipMessageImpl.setNameOfShipAgent(StringPool.BLANK);
		}
		else {
			tempNoTiceShipMessageImpl.setNameOfShipAgent(nameOfShipAgent);
		}

		tempNoTiceShipMessageImpl.resetOriginalValues();

		return tempNoTiceShipMessageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		requestCode = objectInput.readUTF();
		requestState = objectInput.readInt();
		noticeShipType = objectInput.readUTF();
		noticeShipCode = objectInput.readUTF();
		documentName = objectInput.readLong();
		userCreated = objectInput.readUTF();
		confirmTime = objectInput.readInt();
		shipName = objectInput.readUTF();
		shipTypeCode = objectInput.readUTF();
		stateCode = objectInput.readUTF();
		shipCaptain = objectInput.readUTF();
		imo = objectInput.readUTF();
		grt = objectInput.readDouble();
		dwt = objectInput.readDouble();
		unitGRT = objectInput.readUTF();
		unitDWT = objectInput.readUTF();
		callSign = objectInput.readUTF();
		arrivalDate = objectInput.readLong();
		arrivalPortCode = objectInput.readUTF();
		portHarbourCode = objectInput.readUTF();
		portRegionCode = objectInput.readUTF();
		portWharfCode = objectInput.readUTF();
		portGoingToStateName = objectInput.readUTF();
		portGoingToCode = objectInput.readUTF();
		nameOfShipOwners = objectInput.readUTF();
		addressOfShipOwners = objectInput.readUTF();
		shipOwnerstateCode = objectInput.readUTF();
		shipOwnerPhone = objectInput.readUTF();
		shipOwnerFax = objectInput.readUTF();
		shipOwnerEmail = objectInput.readUTF();
		loa = objectInput.readDouble();
		breadth = objectInput.readDouble();
		clearanceHeight = objectInput.readDouble();
		shownDraftxF = objectInput.readDouble();
		shownDraftxA = objectInput.readDouble();
		unitLOA = objectInput.readUTF();
		unitBreadth = objectInput.readUTF();
		unitClearanceHeight = objectInput.readUTF();
		unitShownDraftxF = objectInput.readUTF();
		unitShownDraftxA = objectInput.readUTF();
		certificateOfRegistryNumber = objectInput.readUTF();
		certificateOfRegistryDate = objectInput.readLong();
		certificateOfRegistryPortName = objectInput.readUTF();
		shipAgencyCode = objectInput.readUTF();
		shipAgencyAddress = objectInput.readUTF();
		shipAgencyPhone = objectInput.readUTF();
		shipAgencyFax = objectInput.readUTF();
		shipAgencyEmail = objectInput.readUTF();
		purposeCode = objectInput.readUTF();
		purposeSpecified = objectInput.readUTF();
		crewNumber = objectInput.readLong();
		unitCrew = objectInput.readUTF();
		passengerNumber = objectInput.readLong();
		unitPassenger = objectInput.readUTF();
		quantityAndTypeOfCargo = objectInput.readUTF();
		unitQuantityofCargo = objectInput.readUTF();
		typeOfCargo = objectInput.readUTF();
		otherPersons = objectInput.readInt();
		remarks = objectInput.readUTF();
		signPlace = objectInput.readUTF();
		signDate = objectInput.readLong();
		masterSigned = objectInput.readInt();
		masterSignedImage = objectInput.readInt();
		documentYear = objectInput.readInt();
		nameOfShipAgent = objectInput.readUTF();
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

		if (noticeShipType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(noticeShipType);
		}

		if (noticeShipCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(noticeShipCode);
		}

		objectOutput.writeLong(documentName);

		if (userCreated == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userCreated);
		}

		objectOutput.writeInt(confirmTime);

		if (shipName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shipName);
		}

		if (shipTypeCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shipTypeCode);
		}

		if (stateCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(stateCode);
		}

		if (shipCaptain == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shipCaptain);
		}

		if (imo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(imo);
		}

		objectOutput.writeDouble(grt);
		objectOutput.writeDouble(dwt);

		if (unitGRT == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(unitGRT);
		}

		if (unitDWT == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(unitDWT);
		}

		if (callSign == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(callSign);
		}

		objectOutput.writeLong(arrivalDate);

		if (arrivalPortCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(arrivalPortCode);
		}

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

		if (portGoingToStateName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(portGoingToStateName);
		}

		if (portGoingToCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(portGoingToCode);
		}

		if (nameOfShipOwners == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nameOfShipOwners);
		}

		if (addressOfShipOwners == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(addressOfShipOwners);
		}

		if (shipOwnerstateCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shipOwnerstateCode);
		}

		if (shipOwnerPhone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shipOwnerPhone);
		}

		if (shipOwnerFax == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shipOwnerFax);
		}

		if (shipOwnerEmail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shipOwnerEmail);
		}

		objectOutput.writeDouble(loa);
		objectOutput.writeDouble(breadth);
		objectOutput.writeDouble(clearanceHeight);
		objectOutput.writeDouble(shownDraftxF);
		objectOutput.writeDouble(shownDraftxA);

		if (unitLOA == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(unitLOA);
		}

		if (unitBreadth == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(unitBreadth);
		}

		if (unitClearanceHeight == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(unitClearanceHeight);
		}

		if (unitShownDraftxF == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(unitShownDraftxF);
		}

		if (unitShownDraftxA == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(unitShownDraftxA);
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

		if (shipAgencyCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shipAgencyCode);
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

		if (purposeCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(purposeCode);
		}

		if (purposeSpecified == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(purposeSpecified);
		}

		objectOutput.writeLong(crewNumber);

		if (unitCrew == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(unitCrew);
		}

		objectOutput.writeLong(passengerNumber);

		if (unitPassenger == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(unitPassenger);
		}

		if (quantityAndTypeOfCargo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(quantityAndTypeOfCargo);
		}

		if (unitQuantityofCargo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(unitQuantityofCargo);
		}

		if (typeOfCargo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(typeOfCargo);
		}

		objectOutput.writeInt(otherPersons);

		if (remarks == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remarks);
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
		objectOutput.writeInt(documentYear);

		if (nameOfShipAgent == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nameOfShipAgent);
		}
	}

	public long id;
	public String requestCode;
	public int requestState;
	public String noticeShipType;
	public String noticeShipCode;
	public long documentName;
	public String userCreated;
	public int confirmTime;
	public String shipName;
	public String shipTypeCode;
	public String stateCode;
	public String shipCaptain;
	public String imo;
	public double grt;
	public double dwt;
	public String unitGRT;
	public String unitDWT;
	public String callSign;
	public long arrivalDate;
	public String arrivalPortCode;
	public String portHarbourCode;
	public String portRegionCode;
	public String portWharfCode;
	public String portGoingToStateName;
	public String portGoingToCode;
	public String nameOfShipOwners;
	public String addressOfShipOwners;
	public String shipOwnerstateCode;
	public String shipOwnerPhone;
	public String shipOwnerFax;
	public String shipOwnerEmail;
	public double loa;
	public double breadth;
	public double clearanceHeight;
	public double shownDraftxF;
	public double shownDraftxA;
	public String unitLOA;
	public String unitBreadth;
	public String unitClearanceHeight;
	public String unitShownDraftxF;
	public String unitShownDraftxA;
	public String certificateOfRegistryNumber;
	public long certificateOfRegistryDate;
	public String certificateOfRegistryPortName;
	public String shipAgencyCode;
	public String shipAgencyAddress;
	public String shipAgencyPhone;
	public String shipAgencyFax;
	public String shipAgencyEmail;
	public String purposeCode;
	public String purposeSpecified;
	public long crewNumber;
	public String unitCrew;
	public long passengerNumber;
	public String unitPassenger;
	public String quantityAndTypeOfCargo;
	public String unitQuantityofCargo;
	public String typeOfCargo;
	public int otherPersons;
	public String remarks;
	public String signPlace;
	public long signDate;
	public int masterSigned;
	public int masterSignedImage;
	public int documentYear;
	public String nameOfShipAgent;
}