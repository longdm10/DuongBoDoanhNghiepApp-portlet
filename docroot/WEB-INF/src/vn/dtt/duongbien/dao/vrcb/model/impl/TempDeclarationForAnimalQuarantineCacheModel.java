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

import vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TempDeclarationForAnimalQuarantine in entity cache.
 *
 * @author longdm
 * @see TempDeclarationForAnimalQuarantine
 * @generated
 */
public class TempDeclarationForAnimalQuarantineCacheModel implements CacheModel<TempDeclarationForAnimalQuarantine>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

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
		sb.append(", nameOfShip=");
		sb.append(nameOfShip);
		sb.append(", flagStateOfShip=");
		sb.append(flagStateOfShip);
		sb.append(", numberOfCrew=");
		sb.append(numberOfCrew);
		sb.append(", numberOfPassengers=");
		sb.append(numberOfPassengers);
		sb.append(", lastPortOfCallCode=");
		sb.append(lastPortOfCallCode);
		sb.append(", nextPortOfCallCode=");
		sb.append(nextPortOfCallCode);
		sb.append(", animalNameFirst=");
		sb.append(animalNameFirst);
		sb.append(", animalNameBetween=");
		sb.append(animalNameBetween);
		sb.append(", animalNameThis=");
		sb.append(animalNameThis);
		sb.append(", nameOfMaster=");
		sb.append(nameOfMaster);
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
	public TempDeclarationForAnimalQuarantine toEntityModel() {
		TempDeclarationForAnimalQuarantineImpl tempDeclarationForAnimalQuarantineImpl =
			new TempDeclarationForAnimalQuarantineImpl();

		tempDeclarationForAnimalQuarantineImpl.setId(id);

		if (requestCode == null) {
			tempDeclarationForAnimalQuarantineImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			tempDeclarationForAnimalQuarantineImpl.setRequestCode(requestCode);
		}

		tempDeclarationForAnimalQuarantineImpl.setRequestState(requestState);
		tempDeclarationForAnimalQuarantineImpl.setDocumentName(documentName);
		tempDeclarationForAnimalQuarantineImpl.setDocumentYear(documentYear);

		if (userCreated == null) {
			tempDeclarationForAnimalQuarantineImpl.setUserCreated(StringPool.BLANK);
		}
		else {
			tempDeclarationForAnimalQuarantineImpl.setUserCreated(userCreated);
		}

		if (nameOfShip == null) {
			tempDeclarationForAnimalQuarantineImpl.setNameOfShip(StringPool.BLANK);
		}
		else {
			tempDeclarationForAnimalQuarantineImpl.setNameOfShip(nameOfShip);
		}

		if (flagStateOfShip == null) {
			tempDeclarationForAnimalQuarantineImpl.setFlagStateOfShip(StringPool.BLANK);
		}
		else {
			tempDeclarationForAnimalQuarantineImpl.setFlagStateOfShip(flagStateOfShip);
		}

		tempDeclarationForAnimalQuarantineImpl.setNumberOfCrew(numberOfCrew);
		tempDeclarationForAnimalQuarantineImpl.setNumberOfPassengers(numberOfPassengers);

		if (lastPortOfCallCode == null) {
			tempDeclarationForAnimalQuarantineImpl.setLastPortOfCallCode(StringPool.BLANK);
		}
		else {
			tempDeclarationForAnimalQuarantineImpl.setLastPortOfCallCode(lastPortOfCallCode);
		}

		if (nextPortOfCallCode == null) {
			tempDeclarationForAnimalQuarantineImpl.setNextPortOfCallCode(StringPool.BLANK);
		}
		else {
			tempDeclarationForAnimalQuarantineImpl.setNextPortOfCallCode(nextPortOfCallCode);
		}

		if (animalNameFirst == null) {
			tempDeclarationForAnimalQuarantineImpl.setAnimalNameFirst(StringPool.BLANK);
		}
		else {
			tempDeclarationForAnimalQuarantineImpl.setAnimalNameFirst(animalNameFirst);
		}

		if (animalNameBetween == null) {
			tempDeclarationForAnimalQuarantineImpl.setAnimalNameBetween(StringPool.BLANK);
		}
		else {
			tempDeclarationForAnimalQuarantineImpl.setAnimalNameBetween(animalNameBetween);
		}

		if (animalNameThis == null) {
			tempDeclarationForAnimalQuarantineImpl.setAnimalNameThis(StringPool.BLANK);
		}
		else {
			tempDeclarationForAnimalQuarantineImpl.setAnimalNameThis(animalNameThis);
		}

		if (nameOfMaster == null) {
			tempDeclarationForAnimalQuarantineImpl.setNameOfMaster(StringPool.BLANK);
		}
		else {
			tempDeclarationForAnimalQuarantineImpl.setNameOfMaster(nameOfMaster);
		}

		if (signPlace == null) {
			tempDeclarationForAnimalQuarantineImpl.setSignPlace(StringPool.BLANK);
		}
		else {
			tempDeclarationForAnimalQuarantineImpl.setSignPlace(signPlace);
		}

		if (signDate == Long.MIN_VALUE) {
			tempDeclarationForAnimalQuarantineImpl.setSignDate(null);
		}
		else {
			tempDeclarationForAnimalQuarantineImpl.setSignDate(new Date(
					signDate));
		}

		tempDeclarationForAnimalQuarantineImpl.setMasterSigned(masterSigned);
		tempDeclarationForAnimalQuarantineImpl.setMasterSignedImage(masterSignedImage);
		tempDeclarationForAnimalQuarantineImpl.setAttachedFile(attachedFile);

		tempDeclarationForAnimalQuarantineImpl.resetOriginalValues();

		return tempDeclarationForAnimalQuarantineImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		requestCode = objectInput.readUTF();
		requestState = objectInput.readInt();
		documentName = objectInput.readLong();
		documentYear = objectInput.readInt();
		userCreated = objectInput.readUTF();
		nameOfShip = objectInput.readUTF();
		flagStateOfShip = objectInput.readUTF();
		numberOfCrew = objectInput.readInt();
		numberOfPassengers = objectInput.readInt();
		lastPortOfCallCode = objectInput.readUTF();
		nextPortOfCallCode = objectInput.readUTF();
		animalNameFirst = objectInput.readUTF();
		animalNameBetween = objectInput.readUTF();
		animalNameThis = objectInput.readUTF();
		nameOfMaster = objectInput.readUTF();
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

		if (animalNameFirst == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(animalNameFirst);
		}

		if (animalNameBetween == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(animalNameBetween);
		}

		if (animalNameThis == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(animalNameThis);
		}

		if (nameOfMaster == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nameOfMaster);
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
	public int documentYear;
	public String userCreated;
	public String nameOfShip;
	public String flagStateOfShip;
	public int numberOfCrew;
	public int numberOfPassengers;
	public String lastPortOfCallCode;
	public String nextPortOfCallCode;
	public String animalNameFirst;
	public String animalNameBetween;
	public String animalNameThis;
	public String nameOfMaster;
	public String signPlace;
	public long signDate;
	public int masterSigned;
	public int masterSignedImage;
	public long attachedFile;
}