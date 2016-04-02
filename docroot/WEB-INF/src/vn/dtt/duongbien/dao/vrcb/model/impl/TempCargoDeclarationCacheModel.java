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

import vn.dtt.duongbien.dao.vrcb.model.TempCargoDeclaration;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TempCargoDeclaration in entity cache.
 *
 * @author longdm
 * @see TempCargoDeclaration
 * @generated
 */
public class TempCargoDeclarationCacheModel implements CacheModel<TempCargoDeclaration>,
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
		sb.append(", portReport=");
		sb.append(portReport);
		sb.append(", flagStateOfShip=");
		sb.append(flagStateOfShip);
		sb.append(", nameOfMaster=");
		sb.append(nameOfMaster);
		sb.append(", portOfLoading=");
		sb.append(portOfLoading);
		sb.append(", listGoods=");
		sb.append(listGoods);
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
	public TempCargoDeclaration toEntityModel() {
		TempCargoDeclarationImpl tempCargoDeclarationImpl = new TempCargoDeclarationImpl();

		tempCargoDeclarationImpl.setId(id);

		if (requestCode == null) {
			tempCargoDeclarationImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			tempCargoDeclarationImpl.setRequestCode(requestCode);
		}

		tempCargoDeclarationImpl.setRequestState(requestState);
		tempCargoDeclarationImpl.setDocumentName(documentName);

		if (userCreated == null) {
			tempCargoDeclarationImpl.setUserCreated(StringPool.BLANK);
		}
		else {
			tempCargoDeclarationImpl.setUserCreated(userCreated);
		}

		tempCargoDeclarationImpl.setIsArrival(isArrival);

		if (nameOfShip == null) {
			tempCargoDeclarationImpl.setNameOfShip(StringPool.BLANK);
		}
		else {
			tempCargoDeclarationImpl.setNameOfShip(nameOfShip);
		}

		if (imoNumber == null) {
			tempCargoDeclarationImpl.setImoNumber(StringPool.BLANK);
		}
		else {
			tempCargoDeclarationImpl.setImoNumber(imoNumber);
		}

		if (callsign == null) {
			tempCargoDeclarationImpl.setCallsign(StringPool.BLANK);
		}
		else {
			tempCargoDeclarationImpl.setCallsign(callsign);
		}

		if (voyageNumber == null) {
			tempCargoDeclarationImpl.setVoyageNumber(StringPool.BLANK);
		}
		else {
			tempCargoDeclarationImpl.setVoyageNumber(voyageNumber);
		}

		if (portReport == null) {
			tempCargoDeclarationImpl.setPortReport(StringPool.BLANK);
		}
		else {
			tempCargoDeclarationImpl.setPortReport(portReport);
		}

		if (flagStateOfShip == null) {
			tempCargoDeclarationImpl.setFlagStateOfShip(StringPool.BLANK);
		}
		else {
			tempCargoDeclarationImpl.setFlagStateOfShip(flagStateOfShip);
		}

		if (nameOfMaster == null) {
			tempCargoDeclarationImpl.setNameOfMaster(StringPool.BLANK);
		}
		else {
			tempCargoDeclarationImpl.setNameOfMaster(nameOfMaster);
		}

		if (portOfLoading == null) {
			tempCargoDeclarationImpl.setPortOfLoading(StringPool.BLANK);
		}
		else {
			tempCargoDeclarationImpl.setPortOfLoading(portOfLoading);
		}

		tempCargoDeclarationImpl.setListGoods(listGoods);

		if (signPlace == null) {
			tempCargoDeclarationImpl.setSignPlace(StringPool.BLANK);
		}
		else {
			tempCargoDeclarationImpl.setSignPlace(signPlace);
		}

		if (signDate == Long.MIN_VALUE) {
			tempCargoDeclarationImpl.setSignDate(null);
		}
		else {
			tempCargoDeclarationImpl.setSignDate(new Date(signDate));
		}

		tempCargoDeclarationImpl.setMasterSigned(masterSigned);
		tempCargoDeclarationImpl.setMasterSignedImage(masterSignedImage);
		tempCargoDeclarationImpl.setAttachedFile(attachedFile);
		tempCargoDeclarationImpl.setDocumentYear(documentYear);

		tempCargoDeclarationImpl.resetOriginalValues();

		return tempCargoDeclarationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		requestCode = objectInput.readUTF();
		requestState = objectInput.readInt();
		documentName = objectInput.readLong();
		userCreated = objectInput.readUTF();
		isArrival = objectInput.readInt();
		nameOfShip = objectInput.readUTF();
		imoNumber = objectInput.readUTF();
		callsign = objectInput.readUTF();
		voyageNumber = objectInput.readUTF();
		portReport = objectInput.readUTF();
		flagStateOfShip = objectInput.readUTF();
		nameOfMaster = objectInput.readUTF();
		portOfLoading = objectInput.readUTF();
		listGoods = objectInput.readInt();
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

		if (portReport == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(portReport);
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

		if (portOfLoading == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(portOfLoading);
		}

		objectOutput.writeInt(listGoods);

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
	public int isArrival;
	public String nameOfShip;
	public String imoNumber;
	public String callsign;
	public String voyageNumber;
	public String portReport;
	public String flagStateOfShip;
	public String nameOfMaster;
	public String portOfLoading;
	public int listGoods;
	public String signPlace;
	public long signDate;
	public int masterSigned;
	public int masterSignedImage;
	public long attachedFile;
	public int documentYear;
}