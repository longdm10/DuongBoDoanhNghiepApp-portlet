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

import vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForPlantQuarantine;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TempDeclarationForPlantQuarantine in entity cache.
 *
 * @author longdm
 * @see TempDeclarationForPlantQuarantine
 * @generated
 */
public class TempDeclarationForPlantQuarantineCacheModel implements CacheModel<TempDeclarationForPlantQuarantine>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(49);

		sb.append("{id=");
		sb.append(id);
		sb.append(", requestCode=");
		sb.append(requestCode);
		sb.append(", requestState=");
		sb.append(requestState);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append(", userCreated=");
		sb.append(userCreated);
		sb.append(", nameOfShip=");
		sb.append(nameOfShip);
		sb.append(", flagStateOfShip=");
		sb.append(flagStateOfShip);
		sb.append(", nameOfMaster=");
		sb.append(nameOfMaster);
		sb.append(", doctorName=");
		sb.append(doctorName);
		sb.append(", numberOfCrew=");
		sb.append(numberOfCrew);
		sb.append(", numberOfPassengers=");
		sb.append(numberOfPassengers);
		sb.append(", lastPortOfCallCode=");
		sb.append(lastPortOfCallCode);
		sb.append(", nextPortOfCallCode=");
		sb.append(nextPortOfCallCode);
		sb.append(", firstPortOfLoadingCode=");
		sb.append(firstPortOfLoadingCode);
		sb.append(", dateOfdeparture=");
		sb.append(dateOfdeparture);
		sb.append(", plantNameFirst=");
		sb.append(plantNameFirst);
		sb.append(", plantNameBetween=");
		sb.append(plantNameBetween);
		sb.append(", plantNameThis=");
		sb.append(plantNameThis);
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
		sb.append(", documentYear=");
		sb.append(documentYear);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TempDeclarationForPlantQuarantine toEntityModel() {
		TempDeclarationForPlantQuarantineImpl tempDeclarationForPlantQuarantineImpl =
			new TempDeclarationForPlantQuarantineImpl();

		tempDeclarationForPlantQuarantineImpl.setId(id);

		if (requestCode == null) {
			tempDeclarationForPlantQuarantineImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			tempDeclarationForPlantQuarantineImpl.setRequestCode(requestCode);
		}

		tempDeclarationForPlantQuarantineImpl.setRequestState(requestState);
		tempDeclarationForPlantQuarantineImpl.setDocumentName(documentName);

		if (userCreated == null) {
			tempDeclarationForPlantQuarantineImpl.setUserCreated(StringPool.BLANK);
		}
		else {
			tempDeclarationForPlantQuarantineImpl.setUserCreated(userCreated);
		}

		if (nameOfShip == null) {
			tempDeclarationForPlantQuarantineImpl.setNameOfShip(StringPool.BLANK);
		}
		else {
			tempDeclarationForPlantQuarantineImpl.setNameOfShip(nameOfShip);
		}

		if (flagStateOfShip == null) {
			tempDeclarationForPlantQuarantineImpl.setFlagStateOfShip(StringPool.BLANK);
		}
		else {
			tempDeclarationForPlantQuarantineImpl.setFlagStateOfShip(flagStateOfShip);
		}

		if (nameOfMaster == null) {
			tempDeclarationForPlantQuarantineImpl.setNameOfMaster(StringPool.BLANK);
		}
		else {
			tempDeclarationForPlantQuarantineImpl.setNameOfMaster(nameOfMaster);
		}

		if (doctorName == null) {
			tempDeclarationForPlantQuarantineImpl.setDoctorName(StringPool.BLANK);
		}
		else {
			tempDeclarationForPlantQuarantineImpl.setDoctorName(doctorName);
		}

		tempDeclarationForPlantQuarantineImpl.setNumberOfCrew(numberOfCrew);
		tempDeclarationForPlantQuarantineImpl.setNumberOfPassengers(numberOfPassengers);

		if (lastPortOfCallCode == null) {
			tempDeclarationForPlantQuarantineImpl.setLastPortOfCallCode(StringPool.BLANK);
		}
		else {
			tempDeclarationForPlantQuarantineImpl.setLastPortOfCallCode(lastPortOfCallCode);
		}

		if (nextPortOfCallCode == null) {
			tempDeclarationForPlantQuarantineImpl.setNextPortOfCallCode(StringPool.BLANK);
		}
		else {
			tempDeclarationForPlantQuarantineImpl.setNextPortOfCallCode(nextPortOfCallCode);
		}

		if (firstPortOfLoadingCode == null) {
			tempDeclarationForPlantQuarantineImpl.setFirstPortOfLoadingCode(StringPool.BLANK);
		}
		else {
			tempDeclarationForPlantQuarantineImpl.setFirstPortOfLoadingCode(firstPortOfLoadingCode);
		}

		if (dateOfdeparture == Long.MIN_VALUE) {
			tempDeclarationForPlantQuarantineImpl.setDateOfdeparture(null);
		}
		else {
			tempDeclarationForPlantQuarantineImpl.setDateOfdeparture(new Date(
					dateOfdeparture));
		}

		if (plantNameFirst == null) {
			tempDeclarationForPlantQuarantineImpl.setPlantNameFirst(StringPool.BLANK);
		}
		else {
			tempDeclarationForPlantQuarantineImpl.setPlantNameFirst(plantNameFirst);
		}

		if (plantNameBetween == null) {
			tempDeclarationForPlantQuarantineImpl.setPlantNameBetween(StringPool.BLANK);
		}
		else {
			tempDeclarationForPlantQuarantineImpl.setPlantNameBetween(plantNameBetween);
		}

		if (plantNameThis == null) {
			tempDeclarationForPlantQuarantineImpl.setPlantNameThis(StringPool.BLANK);
		}
		else {
			tempDeclarationForPlantQuarantineImpl.setPlantNameThis(plantNameThis);
		}

		if (signPlace == null) {
			tempDeclarationForPlantQuarantineImpl.setSignPlace(StringPool.BLANK);
		}
		else {
			tempDeclarationForPlantQuarantineImpl.setSignPlace(signPlace);
		}

		if (signDate == Long.MIN_VALUE) {
			tempDeclarationForPlantQuarantineImpl.setSignDate(null);
		}
		else {
			tempDeclarationForPlantQuarantineImpl.setSignDate(new Date(signDate));
		}

		tempDeclarationForPlantQuarantineImpl.setMasterSigned(masterSigned);
		tempDeclarationForPlantQuarantineImpl.setMasterSignedImage(masterSignedImage);
		tempDeclarationForPlantQuarantineImpl.setAttachedFile(attachedFile);
		tempDeclarationForPlantQuarantineImpl.setDocumentYear(documentYear);

		tempDeclarationForPlantQuarantineImpl.resetOriginalValues();

		return tempDeclarationForPlantQuarantineImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		requestCode = objectInput.readUTF();
		requestState = objectInput.readInt();
		documentName = objectInput.readLong();
		userCreated = objectInput.readUTF();
		nameOfShip = objectInput.readUTF();
		flagStateOfShip = objectInput.readUTF();
		nameOfMaster = objectInput.readUTF();
		doctorName = objectInput.readUTF();
		numberOfCrew = objectInput.readInt();
		numberOfPassengers = objectInput.readInt();
		lastPortOfCallCode = objectInput.readUTF();
		nextPortOfCallCode = objectInput.readUTF();
		firstPortOfLoadingCode = objectInput.readUTF();
		dateOfdeparture = objectInput.readLong();
		plantNameFirst = objectInput.readUTF();
		plantNameBetween = objectInput.readUTF();
		plantNameThis = objectInput.readUTF();
		signPlace = objectInput.readUTF();
		signDate = objectInput.readLong();
		masterSigned = objectInput.readInt();
		masterSignedImage = objectInput.readInt();
		attachedFile = objectInput.readLong();
		documentYear = objectInput.readInt();
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

		if (userCreated == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userCreated);
		}

		if (nameOfShip == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nameOfShip);
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

		if (doctorName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(doctorName);
		}

		objectOutput.writeInt(numberOfCrew);
		objectOutput.writeInt(numberOfPassengers);

		if (lastPortOfCallCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lastPortOfCallCode);
		}

		if (nextPortOfCallCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nextPortOfCallCode);
		}

		if (firstPortOfLoadingCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(firstPortOfLoadingCode);
		}

		objectOutput.writeLong(dateOfdeparture);

		if (plantNameFirst == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(plantNameFirst);
		}

		if (plantNameBetween == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(plantNameBetween);
		}

		if (plantNameThis == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(plantNameThis);
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
		objectOutput.writeLong(attachedFile);
		objectOutput.writeInt(documentYear);
	}

	public long id;
	public String requestCode;
	public int requestState;
	public long documentName;
	public String userCreated;
	public String nameOfShip;
	public String flagStateOfShip;
	public String nameOfMaster;
	public String doctorName;
	public int numberOfCrew;
	public int numberOfPassengers;
	public String lastPortOfCallCode;
	public String nextPortOfCallCode;
	public String firstPortOfLoadingCode;
	public long dateOfdeparture;
	public String plantNameFirst;
	public String plantNameBetween;
	public String plantNameThis;
	public String signPlace;
	public long signDate;
	public int masterSigned;
	public int masterSignedImage;
	public long attachedFile;
	public int documentYear;
}