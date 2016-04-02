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

import vn.dtt.duongbien.dao.vrcb.model.DocumentGeneral;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DocumentGeneral in entity cache.
 *
 * @author longdm
 * @see DocumentGeneral
 * @generated
 */
public class DocumentGeneralCacheModel implements CacheModel<DocumentGeneral>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(65);

		sb.append("{id=");
		sb.append(id);
		sb.append(", documentNo=");
		sb.append(documentNo);
		sb.append(", documentFunction=");
		sb.append(documentFunction);
		sb.append(", isArrival=");
		sb.append(isArrival);
		sb.append(", isDeparture=");
		sb.append(isDeparture);
		sb.append(", shipCode=");
		sb.append(shipCode);
		sb.append(", arrivalOrDeparturePortCode=");
		sb.append(arrivalOrDeparturePortCode);
		sb.append(", timeArrivalOrDeparture=");
		sb.append(timeArrivalOrDeparture);
		sb.append(", imoNumber=");
		sb.append(imoNumber);
		sb.append(", callSign=");
		sb.append(callSign);
		sb.append(", voyageNumber=");
		sb.append(voyageNumber);
		sb.append(", shipNationCode=");
		sb.append(shipNationCode);
		sb.append(", nameOfMaster=");
		sb.append(nameOfMaster);
		sb.append(", lastPort=");
		sb.append(lastPort);
		sb.append(", contactDetailShipAgent=");
		sb.append(contactDetailShipAgent);
		sb.append(", grossTonnage=");
		sb.append(grossTonnage);
		sb.append(", netTonnage=");
		sb.append(netTonnage);
		sb.append(", positionShipInPort=");
		sb.append(positionShipInPort);
		sb.append(", briefParticularsVoyage=");
		sb.append(briefParticularsVoyage);
		sb.append(", briefDescriptionCargo=");
		sb.append(briefDescriptionCargo);
		sb.append(", crewNumber=");
		sb.append(crewNumber);
		sb.append(", passengerNumber=");
		sb.append(passengerNumber);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append(", cargoDeclaration=");
		sb.append(cargoDeclaration);
		sb.append(", shipStoresDeclaration=");
		sb.append(shipStoresDeclaration);
		sb.append(", crewList=");
		sb.append(crewList);
		sb.append(", passengerList=");
		sb.append(passengerList);
		sb.append(", shipRequirements=");
		sb.append(shipRequirements);
		sb.append(", isCrewEffectDeclaration=");
		sb.append(isCrewEffectDeclaration);
		sb.append(", isMaritimeDeclarationHealth=");
		sb.append(isMaritimeDeclarationHealth);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DocumentGeneral toEntityModel() {
		DocumentGeneralImpl documentGeneralImpl = new DocumentGeneralImpl();

		documentGeneralImpl.setId(id);

		if (documentNo == null) {
			documentGeneralImpl.setDocumentNo(StringPool.BLANK);
		}
		else {
			documentGeneralImpl.setDocumentNo(documentNo);
		}

		if (documentFunction == null) {
			documentGeneralImpl.setDocumentFunction(StringPool.BLANK);
		}
		else {
			documentGeneralImpl.setDocumentFunction(documentFunction);
		}

		documentGeneralImpl.setIsArrival(isArrival);
		documentGeneralImpl.setIsDeparture(isDeparture);

		if (shipCode == null) {
			documentGeneralImpl.setShipCode(StringPool.BLANK);
		}
		else {
			documentGeneralImpl.setShipCode(shipCode);
		}

		if (arrivalOrDeparturePortCode == null) {
			documentGeneralImpl.setArrivalOrDeparturePortCode(StringPool.BLANK);
		}
		else {
			documentGeneralImpl.setArrivalOrDeparturePortCode(arrivalOrDeparturePortCode);
		}

		if (timeArrivalOrDeparture == Long.MIN_VALUE) {
			documentGeneralImpl.setTimeArrivalOrDeparture(null);
		}
		else {
			documentGeneralImpl.setTimeArrivalOrDeparture(new Date(
					timeArrivalOrDeparture));
		}

		if (imoNumber == null) {
			documentGeneralImpl.setImoNumber(StringPool.BLANK);
		}
		else {
			documentGeneralImpl.setImoNumber(imoNumber);
		}

		if (callSign == null) {
			documentGeneralImpl.setCallSign(StringPool.BLANK);
		}
		else {
			documentGeneralImpl.setCallSign(callSign);
		}

		documentGeneralImpl.setVoyageNumber(voyageNumber);

		if (shipNationCode == null) {
			documentGeneralImpl.setShipNationCode(StringPool.BLANK);
		}
		else {
			documentGeneralImpl.setShipNationCode(shipNationCode);
		}

		if (nameOfMaster == null) {
			documentGeneralImpl.setNameOfMaster(StringPool.BLANK);
		}
		else {
			documentGeneralImpl.setNameOfMaster(nameOfMaster);
		}

		if (lastPort == null) {
			documentGeneralImpl.setLastPort(StringPool.BLANK);
		}
		else {
			documentGeneralImpl.setLastPort(lastPort);
		}

		if (contactDetailShipAgent == null) {
			documentGeneralImpl.setContactDetailShipAgent(StringPool.BLANK);
		}
		else {
			documentGeneralImpl.setContactDetailShipAgent(contactDetailShipAgent);
		}

		documentGeneralImpl.setGrossTonnage(grossTonnage);
		documentGeneralImpl.setNetTonnage(netTonnage);
		documentGeneralImpl.setPositionShipInPort(positionShipInPort);

		if (briefParticularsVoyage == null) {
			documentGeneralImpl.setBriefParticularsVoyage(StringPool.BLANK);
		}
		else {
			documentGeneralImpl.setBriefParticularsVoyage(briefParticularsVoyage);
		}

		if (briefDescriptionCargo == null) {
			documentGeneralImpl.setBriefDescriptionCargo(StringPool.BLANK);
		}
		else {
			documentGeneralImpl.setBriefDescriptionCargo(briefDescriptionCargo);
		}

		documentGeneralImpl.setCrewNumber(crewNumber);
		documentGeneralImpl.setPassengerNumber(passengerNumber);

		if (remarks == null) {
			documentGeneralImpl.setRemarks(StringPool.BLANK);
		}
		else {
			documentGeneralImpl.setRemarks(remarks);
		}

		if (cargoDeclaration == null) {
			documentGeneralImpl.setCargoDeclaration(StringPool.BLANK);
		}
		else {
			documentGeneralImpl.setCargoDeclaration(cargoDeclaration);
		}

		if (shipStoresDeclaration == null) {
			documentGeneralImpl.setShipStoresDeclaration(StringPool.BLANK);
		}
		else {
			documentGeneralImpl.setShipStoresDeclaration(shipStoresDeclaration);
		}

		if (crewList == null) {
			documentGeneralImpl.setCrewList(StringPool.BLANK);
		}
		else {
			documentGeneralImpl.setCrewList(crewList);
		}

		if (passengerList == null) {
			documentGeneralImpl.setPassengerList(StringPool.BLANK);
		}
		else {
			documentGeneralImpl.setPassengerList(passengerList);
		}

		if (shipRequirements == null) {
			documentGeneralImpl.setShipRequirements(StringPool.BLANK);
		}
		else {
			documentGeneralImpl.setShipRequirements(shipRequirements);
		}

		documentGeneralImpl.setIsCrewEffectDeclaration(isCrewEffectDeclaration);
		documentGeneralImpl.setIsMaritimeDeclarationHealth(isMaritimeDeclarationHealth);

		if (createDate == Long.MIN_VALUE) {
			documentGeneralImpl.setCreateDate(null);
		}
		else {
			documentGeneralImpl.setCreateDate(new Date(createDate));
		}

		if (modifyDate == Long.MIN_VALUE) {
			documentGeneralImpl.setModifyDate(null);
		}
		else {
			documentGeneralImpl.setModifyDate(new Date(modifyDate));
		}

		documentGeneralImpl.resetOriginalValues();

		return documentGeneralImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		documentNo = objectInput.readUTF();
		documentFunction = objectInput.readUTF();
		isArrival = objectInput.readInt();
		isDeparture = objectInput.readInt();
		shipCode = objectInput.readUTF();
		arrivalOrDeparturePortCode = objectInput.readUTF();
		timeArrivalOrDeparture = objectInput.readLong();
		imoNumber = objectInput.readUTF();
		callSign = objectInput.readUTF();
		voyageNumber = objectInput.readInt();
		shipNationCode = objectInput.readUTF();
		nameOfMaster = objectInput.readUTF();
		lastPort = objectInput.readUTF();
		contactDetailShipAgent = objectInput.readUTF();
		grossTonnage = objectInput.readDouble();
		netTonnage = objectInput.readDouble();
		positionShipInPort = objectInput.readInt();
		briefParticularsVoyage = objectInput.readUTF();
		briefDescriptionCargo = objectInput.readUTF();
		crewNumber = objectInput.readInt();
		passengerNumber = objectInput.readInt();
		remarks = objectInput.readUTF();
		cargoDeclaration = objectInput.readUTF();
		shipStoresDeclaration = objectInput.readUTF();
		crewList = objectInput.readUTF();
		passengerList = objectInput.readUTF();
		shipRequirements = objectInput.readUTF();
		isCrewEffectDeclaration = objectInput.readInt();
		isMaritimeDeclarationHealth = objectInput.readInt();
		createDate = objectInput.readLong();
		modifyDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (documentNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(documentNo);
		}

		if (documentFunction == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(documentFunction);
		}

		objectOutput.writeInt(isArrival);
		objectOutput.writeInt(isDeparture);

		if (shipCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shipCode);
		}

		if (arrivalOrDeparturePortCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(arrivalOrDeparturePortCode);
		}

		objectOutput.writeLong(timeArrivalOrDeparture);

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

		objectOutput.writeInt(voyageNumber);

		if (shipNationCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shipNationCode);
		}

		if (nameOfMaster == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nameOfMaster);
		}

		if (lastPort == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lastPort);
		}

		if (contactDetailShipAgent == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(contactDetailShipAgent);
		}

		objectOutput.writeDouble(grossTonnage);
		objectOutput.writeDouble(netTonnage);
		objectOutput.writeInt(positionShipInPort);

		if (briefParticularsVoyage == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(briefParticularsVoyage);
		}

		if (briefDescriptionCargo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(briefDescriptionCargo);
		}

		objectOutput.writeInt(crewNumber);
		objectOutput.writeInt(passengerNumber);

		if (remarks == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remarks);
		}

		if (cargoDeclaration == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cargoDeclaration);
		}

		if (shipStoresDeclaration == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shipStoresDeclaration);
		}

		if (crewList == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(crewList);
		}

		if (passengerList == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(passengerList);
		}

		if (shipRequirements == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shipRequirements);
		}

		objectOutput.writeInt(isCrewEffectDeclaration);
		objectOutput.writeInt(isMaritimeDeclarationHealth);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifyDate);
	}

	public long id;
	public String documentNo;
	public String documentFunction;
	public int isArrival;
	public int isDeparture;
	public String shipCode;
	public String arrivalOrDeparturePortCode;
	public long timeArrivalOrDeparture;
	public String imoNumber;
	public String callSign;
	public int voyageNumber;
	public String shipNationCode;
	public String nameOfMaster;
	public String lastPort;
	public String contactDetailShipAgent;
	public double grossTonnage;
	public double netTonnage;
	public int positionShipInPort;
	public String briefParticularsVoyage;
	public String briefDescriptionCargo;
	public int crewNumber;
	public int passengerNumber;
	public String remarks;
	public String cargoDeclaration;
	public String shipStoresDeclaration;
	public String crewList;
	public String passengerList;
	public String shipRequirements;
	public int isCrewEffectDeclaration;
	public int isMaritimeDeclarationHealth;
	public long createDate;
	public long modifyDate;
}