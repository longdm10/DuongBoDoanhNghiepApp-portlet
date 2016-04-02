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

import vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityMessage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TempShipSecurityMessage in entity cache.
 *
 * @author longdm
 * @see TempShipSecurityMessage
 * @generated
 */
public class TempShipSecurityMessageCacheModel implements CacheModel<TempShipSecurityMessage>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(89);

		sb.append("{id=");
		sb.append(id);
		sb.append(", requestCode=");
		sb.append(requestCode);
		sb.append(", requestState=");
		sb.append(requestState);
		sb.append(", documentYear=");
		sb.append(documentYear);
		sb.append(", shipSecurityCode=");
		sb.append(shipSecurityCode);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append(", userCreated=");
		sb.append(userCreated);
		sb.append(", shipAgencyCode=");
		sb.append(shipAgencyCode);
		sb.append(", nameOfShipAgent=");
		sb.append(nameOfShipAgent);
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
		sb.append(", unitGRT=");
		sb.append(unitGRT);
		sb.append(", crewNumber=");
		sb.append(crewNumber);
		sb.append(", arrivalDate=");
		sb.append(arrivalDate);
		sb.append(", purposeCode=");
		sb.append(purposeCode);
		sb.append(", purposeSpecified=");
		sb.append(purposeSpecified);
		sb.append(", portRegionCode=");
		sb.append(portRegionCode);
		sb.append(", portWharfCode=");
		sb.append(portWharfCode);
		sb.append(", shipAgencyPhone=");
		sb.append(shipAgencyPhone);
		sb.append(", shipAgencyFax=");
		sb.append(shipAgencyFax);
		sb.append(", isInternationalShipSecurity=");
		sb.append(isInternationalShipSecurity);
		sb.append(", nameOfISSC=");
		sb.append(nameOfISSC);
		sb.append(", dateOfISSC=");
		sb.append(dateOfISSC);
		sb.append(", dateOfExpiryISSC=");
		sb.append(dateOfExpiryISSC);
		sb.append(", securityLevelCode=");
		sb.append(securityLevelCode);
		sb.append(", securityFromDate=");
		sb.append(securityFromDate);
		sb.append(", isAdditionalSecurityMeasures=");
		sb.append(isAdditionalSecurityMeasures);
		sb.append(", additionalSecurityDetail=");
		sb.append(additionalSecurityDetail);
		sb.append(", isMaintainSecurity=");
		sb.append(isMaintainSecurity);
		sb.append(", maintainSecurityDetail=");
		sb.append(maintainSecurityDetail);
		sb.append(", latitude=");
		sb.append(latitude);
		sb.append(", longitude=");
		sb.append(longitude);
		sb.append(", hasShipSecurityPortItems=");
		sb.append(hasShipSecurityPortItems);
		sb.append(", signPlace=");
		sb.append(signPlace);
		sb.append(", signDate=");
		sb.append(signDate);
		sb.append(", masterSigned=");
		sb.append(masterSigned);
		sb.append(", masterSignedImage=");
		sb.append(masterSignedImage);
		sb.append(", callSign=");
		sb.append(callSign);
		sb.append(", arrivalPortCode=");
		sb.append(arrivalPortCode);
		sb.append(", portHarbourCode=");
		sb.append(portHarbourCode);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TempShipSecurityMessage toEntityModel() {
		TempShipSecurityMessageImpl tempShipSecurityMessageImpl = new TempShipSecurityMessageImpl();

		tempShipSecurityMessageImpl.setId(id);

		if (requestCode == null) {
			tempShipSecurityMessageImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			tempShipSecurityMessageImpl.setRequestCode(requestCode);
		}

		tempShipSecurityMessageImpl.setRequestState(requestState);
		tempShipSecurityMessageImpl.setDocumentYear(documentYear);

		if (shipSecurityCode == null) {
			tempShipSecurityMessageImpl.setShipSecurityCode(StringPool.BLANK);
		}
		else {
			tempShipSecurityMessageImpl.setShipSecurityCode(shipSecurityCode);
		}

		tempShipSecurityMessageImpl.setDocumentName(documentName);

		if (userCreated == null) {
			tempShipSecurityMessageImpl.setUserCreated(StringPool.BLANK);
		}
		else {
			tempShipSecurityMessageImpl.setUserCreated(userCreated);
		}

		if (shipAgencyCode == null) {
			tempShipSecurityMessageImpl.setShipAgencyCode(StringPool.BLANK);
		}
		else {
			tempShipSecurityMessageImpl.setShipAgencyCode(shipAgencyCode);
		}

		if (nameOfShipAgent == null) {
			tempShipSecurityMessageImpl.setNameOfShipAgent(StringPool.BLANK);
		}
		else {
			tempShipSecurityMessageImpl.setNameOfShipAgent(nameOfShipAgent);
		}

		if (shipName == null) {
			tempShipSecurityMessageImpl.setShipName(StringPool.BLANK);
		}
		else {
			tempShipSecurityMessageImpl.setShipName(shipName);
		}

		if (shipTypeCode == null) {
			tempShipSecurityMessageImpl.setShipTypeCode(StringPool.BLANK);
		}
		else {
			tempShipSecurityMessageImpl.setShipTypeCode(shipTypeCode);
		}

		if (stateCode == null) {
			tempShipSecurityMessageImpl.setStateCode(StringPool.BLANK);
		}
		else {
			tempShipSecurityMessageImpl.setStateCode(stateCode);
		}

		if (shipCaptain == null) {
			tempShipSecurityMessageImpl.setShipCaptain(StringPool.BLANK);
		}
		else {
			tempShipSecurityMessageImpl.setShipCaptain(shipCaptain);
		}

		if (imo == null) {
			tempShipSecurityMessageImpl.setImo(StringPool.BLANK);
		}
		else {
			tempShipSecurityMessageImpl.setImo(imo);
		}

		tempShipSecurityMessageImpl.setGrt(grt);

		if (unitGRT == null) {
			tempShipSecurityMessageImpl.setUnitGRT(StringPool.BLANK);
		}
		else {
			tempShipSecurityMessageImpl.setUnitGRT(unitGRT);
		}

		tempShipSecurityMessageImpl.setCrewNumber(crewNumber);

		if (arrivalDate == Long.MIN_VALUE) {
			tempShipSecurityMessageImpl.setArrivalDate(null);
		}
		else {
			tempShipSecurityMessageImpl.setArrivalDate(new Date(arrivalDate));
		}

		if (purposeCode == null) {
			tempShipSecurityMessageImpl.setPurposeCode(StringPool.BLANK);
		}
		else {
			tempShipSecurityMessageImpl.setPurposeCode(purposeCode);
		}

		if (purposeSpecified == null) {
			tempShipSecurityMessageImpl.setPurposeSpecified(StringPool.BLANK);
		}
		else {
			tempShipSecurityMessageImpl.setPurposeSpecified(purposeSpecified);
		}

		if (portRegionCode == null) {
			tempShipSecurityMessageImpl.setPortRegionCode(StringPool.BLANK);
		}
		else {
			tempShipSecurityMessageImpl.setPortRegionCode(portRegionCode);
		}

		if (portWharfCode == null) {
			tempShipSecurityMessageImpl.setPortWharfCode(StringPool.BLANK);
		}
		else {
			tempShipSecurityMessageImpl.setPortWharfCode(portWharfCode);
		}

		if (shipAgencyPhone == null) {
			tempShipSecurityMessageImpl.setShipAgencyPhone(StringPool.BLANK);
		}
		else {
			tempShipSecurityMessageImpl.setShipAgencyPhone(shipAgencyPhone);
		}

		if (shipAgencyFax == null) {
			tempShipSecurityMessageImpl.setShipAgencyFax(StringPool.BLANK);
		}
		else {
			tempShipSecurityMessageImpl.setShipAgencyFax(shipAgencyFax);
		}

		tempShipSecurityMessageImpl.setIsInternationalShipSecurity(isInternationalShipSecurity);

		if (nameOfISSC == null) {
			tempShipSecurityMessageImpl.setNameOfISSC(StringPool.BLANK);
		}
		else {
			tempShipSecurityMessageImpl.setNameOfISSC(nameOfISSC);
		}

		if (dateOfISSC == Long.MIN_VALUE) {
			tempShipSecurityMessageImpl.setDateOfISSC(null);
		}
		else {
			tempShipSecurityMessageImpl.setDateOfISSC(new Date(dateOfISSC));
		}

		if (dateOfExpiryISSC == Long.MIN_VALUE) {
			tempShipSecurityMessageImpl.setDateOfExpiryISSC(null);
		}
		else {
			tempShipSecurityMessageImpl.setDateOfExpiryISSC(new Date(
					dateOfExpiryISSC));
		}

		if (securityLevelCode == null) {
			tempShipSecurityMessageImpl.setSecurityLevelCode(StringPool.BLANK);
		}
		else {
			tempShipSecurityMessageImpl.setSecurityLevelCode(securityLevelCode);
		}

		if (securityFromDate == Long.MIN_VALUE) {
			tempShipSecurityMessageImpl.setSecurityFromDate(null);
		}
		else {
			tempShipSecurityMessageImpl.setSecurityFromDate(new Date(
					securityFromDate));
		}

		tempShipSecurityMessageImpl.setIsAdditionalSecurityMeasures(isAdditionalSecurityMeasures);

		if (additionalSecurityDetail == null) {
			tempShipSecurityMessageImpl.setAdditionalSecurityDetail(StringPool.BLANK);
		}
		else {
			tempShipSecurityMessageImpl.setAdditionalSecurityDetail(additionalSecurityDetail);
		}

		tempShipSecurityMessageImpl.setIsMaintainSecurity(isMaintainSecurity);

		if (maintainSecurityDetail == null) {
			tempShipSecurityMessageImpl.setMaintainSecurityDetail(StringPool.BLANK);
		}
		else {
			tempShipSecurityMessageImpl.setMaintainSecurityDetail(maintainSecurityDetail);
		}

		if (latitude == null) {
			tempShipSecurityMessageImpl.setLatitude(StringPool.BLANK);
		}
		else {
			tempShipSecurityMessageImpl.setLatitude(latitude);
		}

		if (longitude == null) {
			tempShipSecurityMessageImpl.setLongitude(StringPool.BLANK);
		}
		else {
			tempShipSecurityMessageImpl.setLongitude(longitude);
		}

		tempShipSecurityMessageImpl.setHasShipSecurityPortItems(hasShipSecurityPortItems);

		if (signPlace == null) {
			tempShipSecurityMessageImpl.setSignPlace(StringPool.BLANK);
		}
		else {
			tempShipSecurityMessageImpl.setSignPlace(signPlace);
		}

		if (signDate == Long.MIN_VALUE) {
			tempShipSecurityMessageImpl.setSignDate(null);
		}
		else {
			tempShipSecurityMessageImpl.setSignDate(new Date(signDate));
		}

		tempShipSecurityMessageImpl.setMasterSigned(masterSigned);
		tempShipSecurityMessageImpl.setMasterSignedImage(masterSignedImage);

		if (callSign == null) {
			tempShipSecurityMessageImpl.setCallSign(StringPool.BLANK);
		}
		else {
			tempShipSecurityMessageImpl.setCallSign(callSign);
		}

		if (arrivalPortCode == null) {
			tempShipSecurityMessageImpl.setArrivalPortCode(StringPool.BLANK);
		}
		else {
			tempShipSecurityMessageImpl.setArrivalPortCode(arrivalPortCode);
		}

		if (portHarbourCode == null) {
			tempShipSecurityMessageImpl.setPortHarbourCode(StringPool.BLANK);
		}
		else {
			tempShipSecurityMessageImpl.setPortHarbourCode(portHarbourCode);
		}

		tempShipSecurityMessageImpl.resetOriginalValues();

		return tempShipSecurityMessageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		requestCode = objectInput.readUTF();
		requestState = objectInput.readInt();
		documentYear = objectInput.readInt();
		shipSecurityCode = objectInput.readUTF();
		documentName = objectInput.readLong();
		userCreated = objectInput.readUTF();
		shipAgencyCode = objectInput.readUTF();
		nameOfShipAgent = objectInput.readUTF();
		shipName = objectInput.readUTF();
		shipTypeCode = objectInput.readUTF();
		stateCode = objectInput.readUTF();
		shipCaptain = objectInput.readUTF();
		imo = objectInput.readUTF();
		grt = objectInput.readDouble();
		unitGRT = objectInput.readUTF();
		crewNumber = objectInput.readLong();
		arrivalDate = objectInput.readLong();
		purposeCode = objectInput.readUTF();
		purposeSpecified = objectInput.readUTF();
		portRegionCode = objectInput.readUTF();
		portWharfCode = objectInput.readUTF();
		shipAgencyPhone = objectInput.readUTF();
		shipAgencyFax = objectInput.readUTF();
		isInternationalShipSecurity = objectInput.readInt();
		nameOfISSC = objectInput.readUTF();
		dateOfISSC = objectInput.readLong();
		dateOfExpiryISSC = objectInput.readLong();
		securityLevelCode = objectInput.readUTF();
		securityFromDate = objectInput.readLong();
		isAdditionalSecurityMeasures = objectInput.readInt();
		additionalSecurityDetail = objectInput.readUTF();
		isMaintainSecurity = objectInput.readInt();
		maintainSecurityDetail = objectInput.readUTF();
		latitude = objectInput.readUTF();
		longitude = objectInput.readUTF();
		hasShipSecurityPortItems = objectInput.readInt();
		signPlace = objectInput.readUTF();
		signDate = objectInput.readLong();
		masterSigned = objectInput.readInt();
		masterSignedImage = objectInput.readInt();
		callSign = objectInput.readUTF();
		arrivalPortCode = objectInput.readUTF();
		portHarbourCode = objectInput.readUTF();
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
		objectOutput.writeInt(documentYear);

		if (shipSecurityCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shipSecurityCode);
		}

		objectOutput.writeLong(documentName);

		if (userCreated == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userCreated);
		}

		if (shipAgencyCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shipAgencyCode);
		}

		if (nameOfShipAgent == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nameOfShipAgent);
		}

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

		if (unitGRT == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(unitGRT);
		}

		objectOutput.writeLong(crewNumber);
		objectOutput.writeLong(arrivalDate);

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

		objectOutput.writeInt(isInternationalShipSecurity);

		if (nameOfISSC == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nameOfISSC);
		}

		objectOutput.writeLong(dateOfISSC);
		objectOutput.writeLong(dateOfExpiryISSC);

		if (securityLevelCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(securityLevelCode);
		}

		objectOutput.writeLong(securityFromDate);
		objectOutput.writeInt(isAdditionalSecurityMeasures);

		if (additionalSecurityDetail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(additionalSecurityDetail);
		}

		objectOutput.writeInt(isMaintainSecurity);

		if (maintainSecurityDetail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maintainSecurityDetail);
		}

		if (latitude == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(latitude);
		}

		if (longitude == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(longitude);
		}

		objectOutput.writeInt(hasShipSecurityPortItems);

		if (signPlace == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(signPlace);
		}

		objectOutput.writeLong(signDate);
		objectOutput.writeInt(masterSigned);
		objectOutput.writeInt(masterSignedImage);

		if (callSign == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(callSign);
		}

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
	}

	public long id;
	public String requestCode;
	public int requestState;
	public int documentYear;
	public String shipSecurityCode;
	public long documentName;
	public String userCreated;
	public String shipAgencyCode;
	public String nameOfShipAgent;
	public String shipName;
	public String shipTypeCode;
	public String stateCode;
	public String shipCaptain;
	public String imo;
	public double grt;
	public String unitGRT;
	public long crewNumber;
	public long arrivalDate;
	public String purposeCode;
	public String purposeSpecified;
	public String portRegionCode;
	public String portWharfCode;
	public String shipAgencyPhone;
	public String shipAgencyFax;
	public int isInternationalShipSecurity;
	public String nameOfISSC;
	public long dateOfISSC;
	public long dateOfExpiryISSC;
	public String securityLevelCode;
	public long securityFromDate;
	public int isAdditionalSecurityMeasures;
	public String additionalSecurityDetail;
	public int isMaintainSecurity;
	public String maintainSecurityDetail;
	public String latitude;
	public String longitude;
	public int hasShipSecurityPortItems;
	public String signPlace;
	public long signDate;
	public int masterSigned;
	public int masterSignedImage;
	public String callSign;
	public String arrivalPortCode;
	public String portHarbourCode;
}