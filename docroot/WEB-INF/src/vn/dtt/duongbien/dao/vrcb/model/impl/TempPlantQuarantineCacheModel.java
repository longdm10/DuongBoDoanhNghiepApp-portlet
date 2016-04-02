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

import vn.dtt.duongbien.dao.vrcb.model.TempPlantQuarantine;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TempPlantQuarantine in entity cache.
 *
 * @author longdm
 * @see TempPlantQuarantine
 * @generated
 */
public class TempPlantQuarantineCacheModel implements CacheModel<TempPlantQuarantine>,
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
		sb.append(", documentYear=");
		sb.append(documentYear);
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
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TempPlantQuarantine toEntityModel() {
		TempPlantQuarantineImpl tempPlantQuarantineImpl = new TempPlantQuarantineImpl();

		tempPlantQuarantineImpl.setId(id);

		if (requestCode == null) {
			tempPlantQuarantineImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			tempPlantQuarantineImpl.setRequestCode(requestCode);
		}

		tempPlantQuarantineImpl.setRequestState(requestState);
		tempPlantQuarantineImpl.setDocumentName(documentName);

		if (userCreated == null) {
			tempPlantQuarantineImpl.setUserCreated(StringPool.BLANK);
		}
		else {
			tempPlantQuarantineImpl.setUserCreated(userCreated);
		}

		tempPlantQuarantineImpl.setDocumentYear(documentYear);

		if (nameOfShip == null) {
			tempPlantQuarantineImpl.setNameOfShip(StringPool.BLANK);
		}
		else {
			tempPlantQuarantineImpl.setNameOfShip(nameOfShip);
		}

		if (flagStateOfShip == null) {
			tempPlantQuarantineImpl.setFlagStateOfShip(StringPool.BLANK);
		}
		else {
			tempPlantQuarantineImpl.setFlagStateOfShip(flagStateOfShip);
		}

		if (nameOfMaster == null) {
			tempPlantQuarantineImpl.setNameOfMaster(StringPool.BLANK);
		}
		else {
			tempPlantQuarantineImpl.setNameOfMaster(nameOfMaster);
		}

		if (doctorName == null) {
			tempPlantQuarantineImpl.setDoctorName(StringPool.BLANK);
		}
		else {
			tempPlantQuarantineImpl.setDoctorName(doctorName);
		}

		tempPlantQuarantineImpl.setNumberOfCrew(numberOfCrew);
		tempPlantQuarantineImpl.setNumberOfPassengers(numberOfPassengers);

		if (lastPortOfCallCode == null) {
			tempPlantQuarantineImpl.setLastPortOfCallCode(StringPool.BLANK);
		}
		else {
			tempPlantQuarantineImpl.setLastPortOfCallCode(lastPortOfCallCode);
		}

		if (nextPortOfCallCode == null) {
			tempPlantQuarantineImpl.setNextPortOfCallCode(StringPool.BLANK);
		}
		else {
			tempPlantQuarantineImpl.setNextPortOfCallCode(nextPortOfCallCode);
		}

		if (firstPortOfLoadingCode == null) {
			tempPlantQuarantineImpl.setFirstPortOfLoadingCode(StringPool.BLANK);
		}
		else {
			tempPlantQuarantineImpl.setFirstPortOfLoadingCode(firstPortOfLoadingCode);
		}

		if (dateOfdeparture == Long.MIN_VALUE) {
			tempPlantQuarantineImpl.setDateOfdeparture(null);
		}
		else {
			tempPlantQuarantineImpl.setDateOfdeparture(new Date(dateOfdeparture));
		}

		if (plantNameFirst == null) {
			tempPlantQuarantineImpl.setPlantNameFirst(StringPool.BLANK);
		}
		else {
			tempPlantQuarantineImpl.setPlantNameFirst(plantNameFirst);
		}

		if (plantNameBetween == null) {
			tempPlantQuarantineImpl.setPlantNameBetween(StringPool.BLANK);
		}
		else {
			tempPlantQuarantineImpl.setPlantNameBetween(plantNameBetween);
		}

		if (plantNameThis == null) {
			tempPlantQuarantineImpl.setPlantNameThis(StringPool.BLANK);
		}
		else {
			tempPlantQuarantineImpl.setPlantNameThis(plantNameThis);
		}

		if (signPlace == null) {
			tempPlantQuarantineImpl.setSignPlace(StringPool.BLANK);
		}
		else {
			tempPlantQuarantineImpl.setSignPlace(signPlace);
		}

		if (signDate == Long.MIN_VALUE) {
			tempPlantQuarantineImpl.setSignDate(null);
		}
		else {
			tempPlantQuarantineImpl.setSignDate(new Date(signDate));
		}

		tempPlantQuarantineImpl.setMasterSigned(masterSigned);
		tempPlantQuarantineImpl.setMasterSignedImage(masterSignedImage);
		tempPlantQuarantineImpl.setAttachedFile(attachedFile);

		tempPlantQuarantineImpl.resetOriginalValues();

		return tempPlantQuarantineImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		requestCode = objectInput.readUTF();
		requestState = objectInput.readInt();
		documentName = objectInput.readLong();
		userCreated = objectInput.readUTF();
		documentYear = objectInput.readInt();
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

		objectOutput.writeInt(documentYear);

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
	}

	public long id;
	public String requestCode;
	public int requestState;
	public long documentName;
	public String userCreated;
	public int documentYear;
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
}