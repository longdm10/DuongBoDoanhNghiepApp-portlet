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

import vn.dtt.duongbien.dao.vrcb.model.TempDeclarationOfHealth;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TempDeclarationOfHealth in entity cache.
 *
 * @author longdm
 * @see TempDeclarationOfHealth
 * @generated
 */
public class TempDeclarationOfHealthCacheModel implements CacheModel<TempDeclarationOfHealth>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(69);

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
		sb.append(", submittedPortCode=");
		sb.append(submittedPortCode);
		sb.append(", dateSubmitted=");
		sb.append(dateSubmitted);
		sb.append(", nameOfShip=");
		sb.append(nameOfShip);
		sb.append(", registration=");
		sb.append(registration);
		sb.append(", imoNumber=");
		sb.append(imoNumber);
		sb.append(", arrivingFrom=");
		sb.append(arrivingFrom);
		sb.append(", sailingTo=");
		sb.append(sailingTo);
		sb.append(", nationality=");
		sb.append(nationality);
		sb.append(", masterName=");
		sb.append(masterName);
		sb.append(", grossTonnage=");
		sb.append(grossTonnage);
		sb.append(", grossTonnageUnit=");
		sb.append(grossTonnageUnit);
		sb.append(", tonnage=");
		sb.append(tonnage);
		sb.append(", tonnageUnit=");
		sb.append(tonnageUnit);
		sb.append(", certificatecarried=");
		sb.append(certificatecarried);
		sb.append(", issuedAt=");
		sb.append(issuedAt);
		sb.append(", issueDate=");
		sb.append(issueDate);
		sb.append(", reInspectionrequired=");
		sb.append(reInspectionrequired);
		sb.append(", isShipVisitedWHO=");
		sb.append(isShipVisitedWHO);
		sb.append(", visitedWHOPortCode=");
		sb.append(visitedWHOPortCode);
		sb.append(", dateOfVisitedWHO=");
		sb.append(dateOfVisitedWHO);
		sb.append(", listPortName=");
		sb.append(listPortName);
		sb.append(", doctorName=");
		sb.append(doctorName);
		sb.append(", doctorSigndate=");
		sb.append(doctorSigndate);
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
	public TempDeclarationOfHealth toEntityModel() {
		TempDeclarationOfHealthImpl tempDeclarationOfHealthImpl = new TempDeclarationOfHealthImpl();

		tempDeclarationOfHealthImpl.setId(id);

		if (requestCode == null) {
			tempDeclarationOfHealthImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			tempDeclarationOfHealthImpl.setRequestCode(requestCode);
		}

		tempDeclarationOfHealthImpl.setRequestState(requestState);
		tempDeclarationOfHealthImpl.setDocumentName(documentName);
		tempDeclarationOfHealthImpl.setDocumentYear(documentYear);

		if (userCreated == null) {
			tempDeclarationOfHealthImpl.setUserCreated(StringPool.BLANK);
		}
		else {
			tempDeclarationOfHealthImpl.setUserCreated(userCreated);
		}

		if (submittedPortCode == null) {
			tempDeclarationOfHealthImpl.setSubmittedPortCode(StringPool.BLANK);
		}
		else {
			tempDeclarationOfHealthImpl.setSubmittedPortCode(submittedPortCode);
		}

		if (dateSubmitted == Long.MIN_VALUE) {
			tempDeclarationOfHealthImpl.setDateSubmitted(null);
		}
		else {
			tempDeclarationOfHealthImpl.setDateSubmitted(new Date(dateSubmitted));
		}

		if (nameOfShip == null) {
			tempDeclarationOfHealthImpl.setNameOfShip(StringPool.BLANK);
		}
		else {
			tempDeclarationOfHealthImpl.setNameOfShip(nameOfShip);
		}

		if (registration == null) {
			tempDeclarationOfHealthImpl.setRegistration(StringPool.BLANK);
		}
		else {
			tempDeclarationOfHealthImpl.setRegistration(registration);
		}

		if (imoNumber == null) {
			tempDeclarationOfHealthImpl.setImoNumber(StringPool.BLANK);
		}
		else {
			tempDeclarationOfHealthImpl.setImoNumber(imoNumber);
		}

		if (arrivingFrom == null) {
			tempDeclarationOfHealthImpl.setArrivingFrom(StringPool.BLANK);
		}
		else {
			tempDeclarationOfHealthImpl.setArrivingFrom(arrivingFrom);
		}

		if (sailingTo == null) {
			tempDeclarationOfHealthImpl.setSailingTo(StringPool.BLANK);
		}
		else {
			tempDeclarationOfHealthImpl.setSailingTo(sailingTo);
		}

		if (nationality == null) {
			tempDeclarationOfHealthImpl.setNationality(StringPool.BLANK);
		}
		else {
			tempDeclarationOfHealthImpl.setNationality(nationality);
		}

		if (masterName == null) {
			tempDeclarationOfHealthImpl.setMasterName(StringPool.BLANK);
		}
		else {
			tempDeclarationOfHealthImpl.setMasterName(masterName);
		}

		tempDeclarationOfHealthImpl.setGrossTonnage(grossTonnage);

		if (grossTonnageUnit == null) {
			tempDeclarationOfHealthImpl.setGrossTonnageUnit(StringPool.BLANK);
		}
		else {
			tempDeclarationOfHealthImpl.setGrossTonnageUnit(grossTonnageUnit);
		}

		tempDeclarationOfHealthImpl.setTonnage(tonnage);

		if (tonnageUnit == null) {
			tempDeclarationOfHealthImpl.setTonnageUnit(StringPool.BLANK);
		}
		else {
			tempDeclarationOfHealthImpl.setTonnageUnit(tonnageUnit);
		}

		tempDeclarationOfHealthImpl.setCertificatecarried(certificatecarried);

		if (issuedAt == null) {
			tempDeclarationOfHealthImpl.setIssuedAt(StringPool.BLANK);
		}
		else {
			tempDeclarationOfHealthImpl.setIssuedAt(issuedAt);
		}

		if (issueDate == Long.MIN_VALUE) {
			tempDeclarationOfHealthImpl.setIssueDate(null);
		}
		else {
			tempDeclarationOfHealthImpl.setIssueDate(new Date(issueDate));
		}

		tempDeclarationOfHealthImpl.setReInspectionrequired(reInspectionrequired);
		tempDeclarationOfHealthImpl.setIsShipVisitedWHO(isShipVisitedWHO);

		if (visitedWHOPortCode == null) {
			tempDeclarationOfHealthImpl.setVisitedWHOPortCode(StringPool.BLANK);
		}
		else {
			tempDeclarationOfHealthImpl.setVisitedWHOPortCode(visitedWHOPortCode);
		}

		if (dateOfVisitedWHO == Long.MIN_VALUE) {
			tempDeclarationOfHealthImpl.setDateOfVisitedWHO(null);
		}
		else {
			tempDeclarationOfHealthImpl.setDateOfVisitedWHO(new Date(
					dateOfVisitedWHO));
		}

		if (listPortName == null) {
			tempDeclarationOfHealthImpl.setListPortName(StringPool.BLANK);
		}
		else {
			tempDeclarationOfHealthImpl.setListPortName(listPortName);
		}

		if (doctorName == null) {
			tempDeclarationOfHealthImpl.setDoctorName(StringPool.BLANK);
		}
		else {
			tempDeclarationOfHealthImpl.setDoctorName(doctorName);
		}

		if (doctorSigndate == Long.MIN_VALUE) {
			tempDeclarationOfHealthImpl.setDoctorSigndate(null);
		}
		else {
			tempDeclarationOfHealthImpl.setDoctorSigndate(new Date(
					doctorSigndate));
		}

		if (signPlace == null) {
			tempDeclarationOfHealthImpl.setSignPlace(StringPool.BLANK);
		}
		else {
			tempDeclarationOfHealthImpl.setSignPlace(signPlace);
		}

		if (signDate == Long.MIN_VALUE) {
			tempDeclarationOfHealthImpl.setSignDate(null);
		}
		else {
			tempDeclarationOfHealthImpl.setSignDate(new Date(signDate));
		}

		tempDeclarationOfHealthImpl.setMasterSigned(masterSigned);
		tempDeclarationOfHealthImpl.setMasterSignedImage(masterSignedImage);
		tempDeclarationOfHealthImpl.setAttachedFile(attachedFile);

		tempDeclarationOfHealthImpl.resetOriginalValues();

		return tempDeclarationOfHealthImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		requestCode = objectInput.readUTF();
		requestState = objectInput.readInt();
		documentName = objectInput.readLong();
		documentYear = objectInput.readInt();
		userCreated = objectInput.readUTF();
		submittedPortCode = objectInput.readUTF();
		dateSubmitted = objectInput.readLong();
		nameOfShip = objectInput.readUTF();
		registration = objectInput.readUTF();
		imoNumber = objectInput.readUTF();
		arrivingFrom = objectInput.readUTF();
		sailingTo = objectInput.readUTF();
		nationality = objectInput.readUTF();
		masterName = objectInput.readUTF();
		grossTonnage = objectInput.readDouble();
		grossTonnageUnit = objectInput.readUTF();
		tonnage = objectInput.readDouble();
		tonnageUnit = objectInput.readUTF();
		certificatecarried = objectInput.readInt();
		issuedAt = objectInput.readUTF();
		issueDate = objectInput.readLong();
		reInspectionrequired = objectInput.readInt();
		isShipVisitedWHO = objectInput.readInt();
		visitedWHOPortCode = objectInput.readUTF();
		dateOfVisitedWHO = objectInput.readLong();
		listPortName = objectInput.readUTF();
		doctorName = objectInput.readUTF();
		doctorSigndate = objectInput.readLong();
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

		if (submittedPortCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(submittedPortCode);
		}

		objectOutput.writeLong(dateSubmitted);

		if (nameOfShip == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nameOfShip);
		}

		if (registration == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(registration);
		}

		if (imoNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(imoNumber);
		}

		if (arrivingFrom == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(arrivingFrom);
		}

		if (sailingTo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sailingTo);
		}

		if (nationality == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nationality);
		}

		if (masterName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(masterName);
		}

		objectOutput.writeDouble(grossTonnage);

		if (grossTonnageUnit == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(grossTonnageUnit);
		}

		objectOutput.writeDouble(tonnage);

		if (tonnageUnit == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tonnageUnit);
		}

		objectOutput.writeInt(certificatecarried);

		if (issuedAt == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(issuedAt);
		}

		objectOutput.writeLong(issueDate);
		objectOutput.writeInt(reInspectionrequired);
		objectOutput.writeInt(isShipVisitedWHO);

		if (visitedWHOPortCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(visitedWHOPortCode);
		}

		objectOutput.writeLong(dateOfVisitedWHO);

		if (listPortName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(listPortName);
		}

		if (doctorName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(doctorName);
		}

		objectOutput.writeLong(doctorSigndate);

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
	public String submittedPortCode;
	public long dateSubmitted;
	public String nameOfShip;
	public String registration;
	public String imoNumber;
	public String arrivingFrom;
	public String sailingTo;
	public String nationality;
	public String masterName;
	public double grossTonnage;
	public String grossTonnageUnit;
	public double tonnage;
	public String tonnageUnit;
	public int certificatecarried;
	public String issuedAt;
	public long issueDate;
	public int reInspectionrequired;
	public int isShipVisitedWHO;
	public String visitedWHOPortCode;
	public long dateOfVisitedWHO;
	public String listPortName;
	public String doctorName;
	public long doctorSigndate;
	public String signPlace;
	public long signDate;
	public int masterSigned;
	public int masterSignedImage;
	public long attachedFile;
}