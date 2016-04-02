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

import vn.dtt.duongbien.dao.vrcb.model.IssuePermissionForTransit;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing IssuePermissionForTransit in entity cache.
 *
 * @author longdm
 * @see IssuePermissionForTransit
 * @generated
 */
public class IssuePermissionForTransitCacheModel implements CacheModel<IssuePermissionForTransit>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(87);

		sb.append("{id=");
		sb.append(id);
		sb.append(", requestCode=");
		sb.append(requestCode);
		sb.append(", numberPermissionForTransit=");
		sb.append(numberPermissionForTransit);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append(", documentYear=");
		sb.append(documentYear);
		sb.append(", requestState=");
		sb.append(requestState);
		sb.append(", portofAuthority=");
		sb.append(portofAuthority);
		sb.append(", nameOfShip=");
		sb.append(nameOfShip);
		sb.append(", flagStateOfShip=");
		sb.append(flagStateOfShip);
		sb.append(", gt=");
		sb.append(gt);
		sb.append(", numberOfCrews=");
		sb.append(numberOfCrews);
		sb.append(", numberOfPassengers=");
		sb.append(numberOfPassengers);
		sb.append(", callSign=");
		sb.append(callSign);
		sb.append(", nameOfMaster=");
		sb.append(nameOfMaster);
		sb.append(", transitCargo=");
		sb.append(transitCargo);
		sb.append(", volumeCargo=");
		sb.append(volumeCargo);
		sb.append(", cargoUnit=");
		sb.append(cargoUnit);
		sb.append(", permittedTransitFrom=");
		sb.append(permittedTransitFrom);
		sb.append(", permittedTransitTo=");
		sb.append(permittedTransitTo);
		sb.append(", timeOfDeparture=");
		sb.append(timeOfDeparture);
		sb.append(", validUntil=");
		sb.append(validUntil);
		sb.append(", dateOfSign=");
		sb.append(dateOfSign);
		sb.append(", userCreated=");
		sb.append(userCreated);
		sb.append(", directorOfMaritime=");
		sb.append(directorOfMaritime);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", certificateNo=");
		sb.append(certificateNo);
		sb.append(", versionNo=");
		sb.append(versionNo);
		sb.append(", isApproval=");
		sb.append(isApproval);
		sb.append(", approvalDate=");
		sb.append(approvalDate);
		sb.append(", approvalName=");
		sb.append(approvalName);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append(", isCancel=");
		sb.append(isCancel);
		sb.append(", cancelDate=");
		sb.append(cancelDate);
		sb.append(", cancelName=");
		sb.append(cancelName);
		sb.append(", cancelNote=");
		sb.append(cancelNote);
		sb.append(", representative=");
		sb.append(representative);
		sb.append(", digitalAttachedFile=");
		sb.append(digitalAttachedFile);
		sb.append(", signDate=");
		sb.append(signDate);
		sb.append(", signName=");
		sb.append(signName);
		sb.append(", signTitle=");
		sb.append(signTitle);
		sb.append(", signPlace=");
		sb.append(signPlace);
		sb.append(", stampStatus=");
		sb.append(stampStatus);
		sb.append(", attachedFile=");
		sb.append(attachedFile);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public IssuePermissionForTransit toEntityModel() {
		IssuePermissionForTransitImpl issuePermissionForTransitImpl = new IssuePermissionForTransitImpl();

		issuePermissionForTransitImpl.setId(id);

		if (requestCode == null) {
			issuePermissionForTransitImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			issuePermissionForTransitImpl.setRequestCode(requestCode);
		}

		if (numberPermissionForTransit == null) {
			issuePermissionForTransitImpl.setNumberPermissionForTransit(StringPool.BLANK);
		}
		else {
			issuePermissionForTransitImpl.setNumberPermissionForTransit(numberPermissionForTransit);
		}

		issuePermissionForTransitImpl.setDocumentName(documentName);
		issuePermissionForTransitImpl.setDocumentYear(documentYear);
		issuePermissionForTransitImpl.setRequestState(requestState);

		if (portofAuthority == null) {
			issuePermissionForTransitImpl.setPortofAuthority(StringPool.BLANK);
		}
		else {
			issuePermissionForTransitImpl.setPortofAuthority(portofAuthority);
		}

		if (nameOfShip == null) {
			issuePermissionForTransitImpl.setNameOfShip(StringPool.BLANK);
		}
		else {
			issuePermissionForTransitImpl.setNameOfShip(nameOfShip);
		}

		if (flagStateOfShip == null) {
			issuePermissionForTransitImpl.setFlagStateOfShip(StringPool.BLANK);
		}
		else {
			issuePermissionForTransitImpl.setFlagStateOfShip(flagStateOfShip);
		}

		issuePermissionForTransitImpl.setGt(gt);
		issuePermissionForTransitImpl.setNumberOfCrews(numberOfCrews);
		issuePermissionForTransitImpl.setNumberOfPassengers(numberOfPassengers);

		if (callSign == null) {
			issuePermissionForTransitImpl.setCallSign(StringPool.BLANK);
		}
		else {
			issuePermissionForTransitImpl.setCallSign(callSign);
		}

		if (nameOfMaster == null) {
			issuePermissionForTransitImpl.setNameOfMaster(StringPool.BLANK);
		}
		else {
			issuePermissionForTransitImpl.setNameOfMaster(nameOfMaster);
		}

		if (transitCargo == null) {
			issuePermissionForTransitImpl.setTransitCargo(StringPool.BLANK);
		}
		else {
			issuePermissionForTransitImpl.setTransitCargo(transitCargo);
		}

		issuePermissionForTransitImpl.setVolumeCargo(volumeCargo);

		if (cargoUnit == null) {
			issuePermissionForTransitImpl.setCargoUnit(StringPool.BLANK);
		}
		else {
			issuePermissionForTransitImpl.setCargoUnit(cargoUnit);
		}

		if (permittedTransitFrom == null) {
			issuePermissionForTransitImpl.setPermittedTransitFrom(StringPool.BLANK);
		}
		else {
			issuePermissionForTransitImpl.setPermittedTransitFrom(permittedTransitFrom);
		}

		if (permittedTransitTo == null) {
			issuePermissionForTransitImpl.setPermittedTransitTo(StringPool.BLANK);
		}
		else {
			issuePermissionForTransitImpl.setPermittedTransitTo(permittedTransitTo);
		}

		if (timeOfDeparture == Long.MIN_VALUE) {
			issuePermissionForTransitImpl.setTimeOfDeparture(null);
		}
		else {
			issuePermissionForTransitImpl.setTimeOfDeparture(new Date(
					timeOfDeparture));
		}

		if (validUntil == Long.MIN_VALUE) {
			issuePermissionForTransitImpl.setValidUntil(null);
		}
		else {
			issuePermissionForTransitImpl.setValidUntil(new Date(validUntil));
		}

		if (dateOfSign == Long.MIN_VALUE) {
			issuePermissionForTransitImpl.setDateOfSign(null);
		}
		else {
			issuePermissionForTransitImpl.setDateOfSign(new Date(dateOfSign));
		}

		if (userCreated == null) {
			issuePermissionForTransitImpl.setUserCreated(StringPool.BLANK);
		}
		else {
			issuePermissionForTransitImpl.setUserCreated(userCreated);
		}

		if (directorOfMaritime == null) {
			issuePermissionForTransitImpl.setDirectorOfMaritime(StringPool.BLANK);
		}
		else {
			issuePermissionForTransitImpl.setDirectorOfMaritime(directorOfMaritime);
		}

		if (createdDate == Long.MIN_VALUE) {
			issuePermissionForTransitImpl.setCreatedDate(null);
		}
		else {
			issuePermissionForTransitImpl.setCreatedDate(new Date(createdDate));
		}

		if (certificateNo == null) {
			issuePermissionForTransitImpl.setCertificateNo(StringPool.BLANK);
		}
		else {
			issuePermissionForTransitImpl.setCertificateNo(certificateNo);
		}

		if (versionNo == null) {
			issuePermissionForTransitImpl.setVersionNo(StringPool.BLANK);
		}
		else {
			issuePermissionForTransitImpl.setVersionNo(versionNo);
		}

		issuePermissionForTransitImpl.setIsApproval(isApproval);

		if (approvalDate == Long.MIN_VALUE) {
			issuePermissionForTransitImpl.setApprovalDate(null);
		}
		else {
			issuePermissionForTransitImpl.setApprovalDate(new Date(approvalDate));
		}

		if (approvalName == null) {
			issuePermissionForTransitImpl.setApprovalName(StringPool.BLANK);
		}
		else {
			issuePermissionForTransitImpl.setApprovalName(approvalName);
		}

		if (remarks == null) {
			issuePermissionForTransitImpl.setRemarks(StringPool.BLANK);
		}
		else {
			issuePermissionForTransitImpl.setRemarks(remarks);
		}

		issuePermissionForTransitImpl.setIsCancel(isCancel);

		if (cancelDate == Long.MIN_VALUE) {
			issuePermissionForTransitImpl.setCancelDate(null);
		}
		else {
			issuePermissionForTransitImpl.setCancelDate(new Date(cancelDate));
		}

		if (cancelName == null) {
			issuePermissionForTransitImpl.setCancelName(StringPool.BLANK);
		}
		else {
			issuePermissionForTransitImpl.setCancelName(cancelName);
		}

		if (cancelNote == null) {
			issuePermissionForTransitImpl.setCancelNote(StringPool.BLANK);
		}
		else {
			issuePermissionForTransitImpl.setCancelNote(cancelNote);
		}

		if (representative == null) {
			issuePermissionForTransitImpl.setRepresentative(StringPool.BLANK);
		}
		else {
			issuePermissionForTransitImpl.setRepresentative(representative);
		}

		issuePermissionForTransitImpl.setDigitalAttachedFile(digitalAttachedFile);

		if (signDate == Long.MIN_VALUE) {
			issuePermissionForTransitImpl.setSignDate(null);
		}
		else {
			issuePermissionForTransitImpl.setSignDate(new Date(signDate));
		}

		if (signName == null) {
			issuePermissionForTransitImpl.setSignName(StringPool.BLANK);
		}
		else {
			issuePermissionForTransitImpl.setSignName(signName);
		}

		if (signTitle == null) {
			issuePermissionForTransitImpl.setSignTitle(StringPool.BLANK);
		}
		else {
			issuePermissionForTransitImpl.setSignTitle(signTitle);
		}

		if (signPlace == null) {
			issuePermissionForTransitImpl.setSignPlace(StringPool.BLANK);
		}
		else {
			issuePermissionForTransitImpl.setSignPlace(signPlace);
		}

		issuePermissionForTransitImpl.setStampStatus(stampStatus);
		issuePermissionForTransitImpl.setAttachedFile(attachedFile);

		issuePermissionForTransitImpl.resetOriginalValues();

		return issuePermissionForTransitImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		requestCode = objectInput.readUTF();
		numberPermissionForTransit = objectInput.readUTF();
		documentName = objectInput.readLong();
		documentYear = objectInput.readInt();
		requestState = objectInput.readInt();
		portofAuthority = objectInput.readUTF();
		nameOfShip = objectInput.readUTF();
		flagStateOfShip = objectInput.readUTF();
		gt = objectInput.readDouble();
		numberOfCrews = objectInput.readInt();
		numberOfPassengers = objectInput.readInt();
		callSign = objectInput.readUTF();
		nameOfMaster = objectInput.readUTF();
		transitCargo = objectInput.readUTF();
		volumeCargo = objectInput.readDouble();
		cargoUnit = objectInput.readUTF();
		permittedTransitFrom = objectInput.readUTF();
		permittedTransitTo = objectInput.readUTF();
		timeOfDeparture = objectInput.readLong();
		validUntil = objectInput.readLong();
		dateOfSign = objectInput.readLong();
		userCreated = objectInput.readUTF();
		directorOfMaritime = objectInput.readUTF();
		createdDate = objectInput.readLong();
		certificateNo = objectInput.readUTF();
		versionNo = objectInput.readUTF();
		isApproval = objectInput.readInt();
		approvalDate = objectInput.readLong();
		approvalName = objectInput.readUTF();
		remarks = objectInput.readUTF();
		isCancel = objectInput.readInt();
		cancelDate = objectInput.readLong();
		cancelName = objectInput.readUTF();
		cancelNote = objectInput.readUTF();
		representative = objectInput.readUTF();
		digitalAttachedFile = objectInput.readLong();
		signDate = objectInput.readLong();
		signName = objectInput.readUTF();
		signTitle = objectInput.readUTF();
		signPlace = objectInput.readUTF();
		stampStatus = objectInput.readLong();
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

		if (numberPermissionForTransit == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(numberPermissionForTransit);
		}

		objectOutput.writeLong(documentName);
		objectOutput.writeInt(documentYear);
		objectOutput.writeInt(requestState);

		if (portofAuthority == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(portofAuthority);
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

		objectOutput.writeDouble(gt);
		objectOutput.writeInt(numberOfCrews);
		objectOutput.writeInt(numberOfPassengers);

		if (callSign == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(callSign);
		}

		if (nameOfMaster == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nameOfMaster);
		}

		if (transitCargo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(transitCargo);
		}

		objectOutput.writeDouble(volumeCargo);

		if (cargoUnit == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cargoUnit);
		}

		if (permittedTransitFrom == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(permittedTransitFrom);
		}

		if (permittedTransitTo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(permittedTransitTo);
		}

		objectOutput.writeLong(timeOfDeparture);
		objectOutput.writeLong(validUntil);
		objectOutput.writeLong(dateOfSign);

		if (userCreated == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userCreated);
		}

		if (directorOfMaritime == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(directorOfMaritime);
		}

		objectOutput.writeLong(createdDate);

		if (certificateNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certificateNo);
		}

		if (versionNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(versionNo);
		}

		objectOutput.writeInt(isApproval);
		objectOutput.writeLong(approvalDate);

		if (approvalName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(approvalName);
		}

		if (remarks == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remarks);
		}

		objectOutput.writeInt(isCancel);
		objectOutput.writeLong(cancelDate);

		if (cancelName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cancelName);
		}

		if (cancelNote == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cancelNote);
		}

		if (representative == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(representative);
		}

		objectOutput.writeLong(digitalAttachedFile);
		objectOutput.writeLong(signDate);

		if (signName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(signName);
		}

		if (signTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(signTitle);
		}

		if (signPlace == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(signPlace);
		}

		objectOutput.writeLong(stampStatus);
		objectOutput.writeLong(attachedFile);
	}

	public long id;
	public String requestCode;
	public String numberPermissionForTransit;
	public long documentName;
	public int documentYear;
	public int requestState;
	public String portofAuthority;
	public String nameOfShip;
	public String flagStateOfShip;
	public double gt;
	public int numberOfCrews;
	public int numberOfPassengers;
	public String callSign;
	public String nameOfMaster;
	public String transitCargo;
	public double volumeCargo;
	public String cargoUnit;
	public String permittedTransitFrom;
	public String permittedTransitTo;
	public long timeOfDeparture;
	public long validUntil;
	public long dateOfSign;
	public String userCreated;
	public String directorOfMaritime;
	public long createdDate;
	public String certificateNo;
	public String versionNo;
	public int isApproval;
	public long approvalDate;
	public String approvalName;
	public String remarks;
	public int isCancel;
	public long cancelDate;
	public String cancelName;
	public String cancelNote;
	public String representative;
	public long digitalAttachedFile;
	public long signDate;
	public String signName;
	public String signTitle;
	public String signPlace;
	public long stampStatus;
	public long attachedFile;
}