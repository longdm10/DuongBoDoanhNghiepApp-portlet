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

import vn.dtt.duongbien.dao.vrcb.model.TempCrewEffectsDeclaration;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TempCrewEffectsDeclaration in entity cache.
 *
 * @author longdm
 * @see TempCrewEffectsDeclaration
 * @generated
 */
public class TempCrewEffectsDeclarationCacheModel implements CacheModel<TempCrewEffectsDeclaration>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

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
		sb.append(", imoNumber=");
		sb.append(imoNumber);
		sb.append(", callsign=");
		sb.append(callsign);
		sb.append(", voyageNumber=");
		sb.append(voyageNumber);
		sb.append(", flagStateOfShip=");
		sb.append(flagStateOfShip);
		sb.append(", nameOfMaster=");
		sb.append(nameOfMaster);
		sb.append(", listCrewEffects=");
		sb.append(listCrewEffects);
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
	public TempCrewEffectsDeclaration toEntityModel() {
		TempCrewEffectsDeclarationImpl tempCrewEffectsDeclarationImpl = new TempCrewEffectsDeclarationImpl();

		tempCrewEffectsDeclarationImpl.setId(id);

		if (requestCode == null) {
			tempCrewEffectsDeclarationImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			tempCrewEffectsDeclarationImpl.setRequestCode(requestCode);
		}

		tempCrewEffectsDeclarationImpl.setRequestState(requestState);
		tempCrewEffectsDeclarationImpl.setDocumentName(documentName);

		if (userCreated == null) {
			tempCrewEffectsDeclarationImpl.setUserCreated(StringPool.BLANK);
		}
		else {
			tempCrewEffectsDeclarationImpl.setUserCreated(userCreated);
		}

		if (nameOfShip == null) {
			tempCrewEffectsDeclarationImpl.setNameOfShip(StringPool.BLANK);
		}
		else {
			tempCrewEffectsDeclarationImpl.setNameOfShip(nameOfShip);
		}

		if (imoNumber == null) {
			tempCrewEffectsDeclarationImpl.setImoNumber(StringPool.BLANK);
		}
		else {
			tempCrewEffectsDeclarationImpl.setImoNumber(imoNumber);
		}

		if (callsign == null) {
			tempCrewEffectsDeclarationImpl.setCallsign(StringPool.BLANK);
		}
		else {
			tempCrewEffectsDeclarationImpl.setCallsign(callsign);
		}

		if (voyageNumber == null) {
			tempCrewEffectsDeclarationImpl.setVoyageNumber(StringPool.BLANK);
		}
		else {
			tempCrewEffectsDeclarationImpl.setVoyageNumber(voyageNumber);
		}

		if (flagStateOfShip == null) {
			tempCrewEffectsDeclarationImpl.setFlagStateOfShip(StringPool.BLANK);
		}
		else {
			tempCrewEffectsDeclarationImpl.setFlagStateOfShip(flagStateOfShip);
		}

		if (nameOfMaster == null) {
			tempCrewEffectsDeclarationImpl.setNameOfMaster(StringPool.BLANK);
		}
		else {
			tempCrewEffectsDeclarationImpl.setNameOfMaster(nameOfMaster);
		}

		tempCrewEffectsDeclarationImpl.setListCrewEffects(listCrewEffects);

		if (signPlace == null) {
			tempCrewEffectsDeclarationImpl.setSignPlace(StringPool.BLANK);
		}
		else {
			tempCrewEffectsDeclarationImpl.setSignPlace(signPlace);
		}

		if (signDate == Long.MIN_VALUE) {
			tempCrewEffectsDeclarationImpl.setSignDate(null);
		}
		else {
			tempCrewEffectsDeclarationImpl.setSignDate(new Date(signDate));
		}

		tempCrewEffectsDeclarationImpl.setMasterSigned(masterSigned);
		tempCrewEffectsDeclarationImpl.setMasterSignedImage(masterSignedImage);
		tempCrewEffectsDeclarationImpl.setAttachedFile(attachedFile);
		tempCrewEffectsDeclarationImpl.setDocumentYear(documentYear);

		tempCrewEffectsDeclarationImpl.resetOriginalValues();

		return tempCrewEffectsDeclarationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		requestCode = objectInput.readUTF();
		requestState = objectInput.readInt();
		documentName = objectInput.readLong();
		userCreated = objectInput.readUTF();
		nameOfShip = objectInput.readUTF();
		imoNumber = objectInput.readUTF();
		callsign = objectInput.readUTF();
		voyageNumber = objectInput.readUTF();
		flagStateOfShip = objectInput.readUTF();
		nameOfMaster = objectInput.readUTF();
		listCrewEffects = objectInput.readInt();
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

		objectOutput.writeInt(listCrewEffects);

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
	public String imoNumber;
	public String callsign;
	public String voyageNumber;
	public String flagStateOfShip;
	public String nameOfMaster;
	public int listCrewEffects;
	public String signPlace;
	public long signDate;
	public int masterSigned;
	public int masterSignedImage;
	public long attachedFile;
	public int documentYear;
}