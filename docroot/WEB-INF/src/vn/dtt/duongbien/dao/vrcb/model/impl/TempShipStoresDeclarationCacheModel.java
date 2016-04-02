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

import vn.dtt.duongbien.dao.vrcb.model.TempShipStoresDeclaration;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TempShipStoresDeclaration in entity cache.
 *
 * @author longdm
 * @see TempShipStoresDeclaration
 * @generated
 */
public class TempShipStoresDeclarationCacheModel implements CacheModel<TempShipStoresDeclaration>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(51);

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
		sb.append(", imoNumber=");
		sb.append(imoNumber);
		sb.append(", callsign=");
		sb.append(callsign);
		sb.append(", voyageNumber=");
		sb.append(voyageNumber);
		sb.append(", nationalityOfShip=");
		sb.append(nationalityOfShip);
		sb.append(", portOfArrivalCode=");
		sb.append(portOfArrivalCode);
		sb.append(", dateOfArrival=");
		sb.append(dateOfArrival);
		sb.append(", lastPortOfCallCode=");
		sb.append(lastPortOfCallCode);
		sb.append(", numberOfPersonsOnBoat=");
		sb.append(numberOfPersonsOnBoat);
		sb.append(", periodOfStay=");
		sb.append(periodOfStay);
		sb.append(", periodOfStayUnit=");
		sb.append(periodOfStayUnit);
		sb.append(", nameOfMaster=");
		sb.append(nameOfMaster);
		sb.append(", listShipsStores=");
		sb.append(listShipsStores);
		sb.append(", signPlace=");
		sb.append(signPlace);
		sb.append(", signDate=");
		sb.append(signDate);
		sb.append(", masterSigned=");
		sb.append(masterSigned);
		sb.append(", masterSignedImage=");
		sb.append(masterSignedImage);
		sb.append(", attachedFile=");
		sb.append(attachedFile);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TempShipStoresDeclaration toEntityModel() {
		TempShipStoresDeclarationImpl tempShipStoresDeclarationImpl = new TempShipStoresDeclarationImpl();

		tempShipStoresDeclarationImpl.setId(id);

		if (requestCode == null) {
			tempShipStoresDeclarationImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			tempShipStoresDeclarationImpl.setRequestCode(requestCode);
		}

		tempShipStoresDeclarationImpl.setRequestState(requestState);
		tempShipStoresDeclarationImpl.setDocumentName(documentName);
		tempShipStoresDeclarationImpl.setDocumentYear(documentYear);

		if (userCreated == null) {
			tempShipStoresDeclarationImpl.setUserCreated(StringPool.BLANK);
		}
		else {
			tempShipStoresDeclarationImpl.setUserCreated(userCreated);
		}

		tempShipStoresDeclarationImpl.setIsArrival(isArrival);

		if (nameOfShip == null) {
			tempShipStoresDeclarationImpl.setNameOfShip(StringPool.BLANK);
		}
		else {
			tempShipStoresDeclarationImpl.setNameOfShip(nameOfShip);
		}

		if (imoNumber == null) {
			tempShipStoresDeclarationImpl.setImoNumber(StringPool.BLANK);
		}
		else {
			tempShipStoresDeclarationImpl.setImoNumber(imoNumber);
		}

		if (callsign == null) {
			tempShipStoresDeclarationImpl.setCallsign(StringPool.BLANK);
		}
		else {
			tempShipStoresDeclarationImpl.setCallsign(callsign);
		}

		if (voyageNumber == null) {
			tempShipStoresDeclarationImpl.setVoyageNumber(StringPool.BLANK);
		}
		else {
			tempShipStoresDeclarationImpl.setVoyageNumber(voyageNumber);
		}

		if (nationalityOfShip == null) {
			tempShipStoresDeclarationImpl.setNationalityOfShip(StringPool.BLANK);
		}
		else {
			tempShipStoresDeclarationImpl.setNationalityOfShip(nationalityOfShip);
		}

		if (portOfArrivalCode == null) {
			tempShipStoresDeclarationImpl.setPortOfArrivalCode(StringPool.BLANK);
		}
		else {
			tempShipStoresDeclarationImpl.setPortOfArrivalCode(portOfArrivalCode);
		}

		if (dateOfArrival == Long.MIN_VALUE) {
			tempShipStoresDeclarationImpl.setDateOfArrival(null);
		}
		else {
			tempShipStoresDeclarationImpl.setDateOfArrival(new Date(
					dateOfArrival));
		}

		if (lastPortOfCallCode == null) {
			tempShipStoresDeclarationImpl.setLastPortOfCallCode(StringPool.BLANK);
		}
		else {
			tempShipStoresDeclarationImpl.setLastPortOfCallCode(lastPortOfCallCode);
		}

		tempShipStoresDeclarationImpl.setNumberOfPersonsOnBoat(numberOfPersonsOnBoat);

		if (periodOfStay == null) {
			tempShipStoresDeclarationImpl.setPeriodOfStay(StringPool.BLANK);
		}
		else {
			tempShipStoresDeclarationImpl.setPeriodOfStay(periodOfStay);
		}

		if (periodOfStayUnit == null) {
			tempShipStoresDeclarationImpl.setPeriodOfStayUnit(StringPool.BLANK);
		}
		else {
			tempShipStoresDeclarationImpl.setPeriodOfStayUnit(periodOfStayUnit);
		}

		if (nameOfMaster == null) {
			tempShipStoresDeclarationImpl.setNameOfMaster(StringPool.BLANK);
		}
		else {
			tempShipStoresDeclarationImpl.setNameOfMaster(nameOfMaster);
		}

		tempShipStoresDeclarationImpl.setListShipsStores(listShipsStores);

		if (signPlace == null) {
			tempShipStoresDeclarationImpl.setSignPlace(StringPool.BLANK);
		}
		else {
			tempShipStoresDeclarationImpl.setSignPlace(signPlace);
		}

		if (signDate == Long.MIN_VALUE) {
			tempShipStoresDeclarationImpl.setSignDate(null);
		}
		else {
			tempShipStoresDeclarationImpl.setSignDate(new Date(signDate));
		}

		tempShipStoresDeclarationImpl.setMasterSigned(masterSigned);
		tempShipStoresDeclarationImpl.setMasterSignedImage(masterSignedImage);
		tempShipStoresDeclarationImpl.setAttachedFile(attachedFile);

		tempShipStoresDeclarationImpl.resetOriginalValues();

		return tempShipStoresDeclarationImpl;
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
		imoNumber = objectInput.readUTF();
		callsign = objectInput.readUTF();
		voyageNumber = objectInput.readUTF();
		nationalityOfShip = objectInput.readUTF();
		portOfArrivalCode = objectInput.readUTF();
		dateOfArrival = objectInput.readLong();
		lastPortOfCallCode = objectInput.readUTF();
		numberOfPersonsOnBoat = objectInput.readInt();
		periodOfStay = objectInput.readUTF();
		periodOfStayUnit = objectInput.readUTF();
		nameOfMaster = objectInput.readUTF();
		listShipsStores = objectInput.readInt();
		signPlace = objectInput.readUTF();
		signDate = objectInput.readLong();
		masterSigned = objectInput.readInt();
		masterSignedImage = objectInput.readInt();
		attachedFile = objectInput.readLong();
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

		if (imoNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(imoNumber);
		}

		if (callsign == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(callsign);
		}

		if (voyageNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(voyageNumber);
		}

		if (nationalityOfShip == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nationalityOfShip);
		}

		if (portOfArrivalCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(portOfArrivalCode);
		}

		objectOutput.writeLong(dateOfArrival);

		if (lastPortOfCallCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lastPortOfCallCode);
		}

		objectOutput.writeInt(numberOfPersonsOnBoat);

		if (periodOfStay == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(periodOfStay);
		}

		if (periodOfStayUnit == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(periodOfStayUnit);
		}

		if (nameOfMaster == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nameOfMaster);
		}

		objectOutput.writeInt(listShipsStores);

		if (signPlace == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(signPlace);
		}

		objectOutput.writeLong(signDate);
		objectOutput.writeInt(masterSigned);
		objectOutput.writeInt(masterSignedImage);
		objectOutput.writeLong(attachedFile);
	}

	public long id;
	public String requestCode;
	public int requestState;
	public long documentName;
	public int documentYear;
	public String userCreated;
	public int isArrival;
	public String nameOfShip;
	public String imoNumber;
	public String callsign;
	public String voyageNumber;
	public String nationalityOfShip;
	public String portOfArrivalCode;
	public long dateOfArrival;
	public String lastPortOfCallCode;
	public int numberOfPersonsOnBoat;
	public String periodOfStay;
	public String periodOfStayUnit;
	public String nameOfMaster;
	public int listShipsStores;
	public String signPlace;
	public long signDate;
	public int masterSigned;
	public int masterSignedImage;
	public long attachedFile;
}