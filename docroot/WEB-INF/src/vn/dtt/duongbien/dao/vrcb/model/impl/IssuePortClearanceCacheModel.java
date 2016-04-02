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

import vn.dtt.duongbien.dao.vrcb.model.IssuePortClearance;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing IssuePortClearance in entity cache.
 *
 * @author longdm
 * @see IssuePortClearance
 * @generated
 */
public class IssuePortClearanceCacheModel implements CacheModel<IssuePortClearance>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(85);

		sb.append("{id=");
		sb.append(id);
		sb.append(", requestCode=");
		sb.append(requestCode);
		sb.append(", numberPortClearance=");
		sb.append(numberPortClearance);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append(", documentYear=");
		sb.append(documentYear);
		sb.append(", portofAuthority=");
		sb.append(portofAuthority);
		sb.append(", nameOfShip=");
		sb.append(nameOfShip);
		sb.append(", flagStateOfShip=");
		sb.append(flagStateOfShip);
		sb.append(", numberOfCrews=");
		sb.append(numberOfCrews);
		sb.append(", numberOfPassengers=");
		sb.append(numberOfPassengers);
		sb.append(", callSign=");
		sb.append(callSign);
		sb.append(", nameOfMaster=");
		sb.append(nameOfMaster);
		sb.append(", cargo=");
		sb.append(cargo);
		sb.append(", volumeCargo=");
		sb.append(volumeCargo);
		sb.append(", cargoUnit=");
		sb.append(cargoUnit);
		sb.append(", transitCargo=");
		sb.append(transitCargo);
		sb.append(", volumeTransitCargo=");
		sb.append(volumeTransitCargo);
		sb.append(", transitCargoUnit=");
		sb.append(transitCargoUnit);
		sb.append(", timeOfDeparture=");
		sb.append(timeOfDeparture);
		sb.append(", nextPortOfCallCode=");
		sb.append(nextPortOfCallCode);
		sb.append(", validUntil=");
		sb.append(validUntil);
		sb.append(", issueDate=");
		sb.append(issueDate);
		sb.append(", directorOfMaritime=");
		sb.append(directorOfMaritime);
		sb.append(", certificateNo=");
		sb.append(certificateNo);
		sb.append(", requestState=");
		sb.append(requestState);
		sb.append(", gt=");
		sb.append(gt);
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
	public IssuePortClearance toEntityModel() {
		IssuePortClearanceImpl issuePortClearanceImpl = new IssuePortClearanceImpl();

		issuePortClearanceImpl.setId(id);

		if (requestCode == null) {
			issuePortClearanceImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setRequestCode(requestCode);
		}

		if (numberPortClearance == null) {
			issuePortClearanceImpl.setNumberPortClearance(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setNumberPortClearance(numberPortClearance);
		}

		issuePortClearanceImpl.setDocumentName(documentName);
		issuePortClearanceImpl.setDocumentYear(documentYear);

		if (portofAuthority == null) {
			issuePortClearanceImpl.setPortofAuthority(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setPortofAuthority(portofAuthority);
		}

		if (nameOfShip == null) {
			issuePortClearanceImpl.setNameOfShip(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setNameOfShip(nameOfShip);
		}

		if (flagStateOfShip == null) {
			issuePortClearanceImpl.setFlagStateOfShip(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setFlagStateOfShip(flagStateOfShip);
		}

		issuePortClearanceImpl.setNumberOfCrews(numberOfCrews);
		issuePortClearanceImpl.setNumberOfPassengers(numberOfPassengers);

		if (callSign == null) {
			issuePortClearanceImpl.setCallSign(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setCallSign(callSign);
		}

		if (nameOfMaster == null) {
			issuePortClearanceImpl.setNameOfMaster(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setNameOfMaster(nameOfMaster);
		}

		if (cargo == null) {
			issuePortClearanceImpl.setCargo(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setCargo(cargo);
		}

		issuePortClearanceImpl.setVolumeCargo(volumeCargo);

		if (cargoUnit == null) {
			issuePortClearanceImpl.setCargoUnit(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setCargoUnit(cargoUnit);
		}

		if (transitCargo == null) {
			issuePortClearanceImpl.setTransitCargo(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setTransitCargo(transitCargo);
		}

		issuePortClearanceImpl.setVolumeTransitCargo(volumeTransitCargo);

		if (transitCargoUnit == null) {
			issuePortClearanceImpl.setTransitCargoUnit(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setTransitCargoUnit(transitCargoUnit);
		}

		if (timeOfDeparture == Long.MIN_VALUE) {
			issuePortClearanceImpl.setTimeOfDeparture(null);
		}
		else {
			issuePortClearanceImpl.setTimeOfDeparture(new Date(timeOfDeparture));
		}

		if (nextPortOfCallCode == null) {
			issuePortClearanceImpl.setNextPortOfCallCode(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setNextPortOfCallCode(nextPortOfCallCode);
		}

		if (validUntil == Long.MIN_VALUE) {
			issuePortClearanceImpl.setValidUntil(null);
		}
		else {
			issuePortClearanceImpl.setValidUntil(new Date(validUntil));
		}

		if (issueDate == Long.MIN_VALUE) {
			issuePortClearanceImpl.setIssueDate(null);
		}
		else {
			issuePortClearanceImpl.setIssueDate(new Date(issueDate));
		}

		if (directorOfMaritime == null) {
			issuePortClearanceImpl.setDirectorOfMaritime(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setDirectorOfMaritime(directorOfMaritime);
		}

		if (certificateNo == null) {
			issuePortClearanceImpl.setCertificateNo(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setCertificateNo(certificateNo);
		}

		issuePortClearanceImpl.setRequestState(requestState);
		issuePortClearanceImpl.setGt(gt);

		if (versionNo == null) {
			issuePortClearanceImpl.setVersionNo(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setVersionNo(versionNo);
		}

		issuePortClearanceImpl.setIsApproval(isApproval);

		if (approvalDate == Long.MIN_VALUE) {
			issuePortClearanceImpl.setApprovalDate(null);
		}
		else {
			issuePortClearanceImpl.setApprovalDate(new Date(approvalDate));
		}

		if (approvalName == null) {
			issuePortClearanceImpl.setApprovalName(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setApprovalName(approvalName);
		}

		if (remarks == null) {
			issuePortClearanceImpl.setRemarks(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setRemarks(remarks);
		}

		issuePortClearanceImpl.setIsCancel(isCancel);

		if (cancelDate == Long.MIN_VALUE) {
			issuePortClearanceImpl.setCancelDate(null);
		}
		else {
			issuePortClearanceImpl.setCancelDate(new Date(cancelDate));
		}

		if (cancelName == null) {
			issuePortClearanceImpl.setCancelName(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setCancelName(cancelName);
		}

		if (cancelNote == null) {
			issuePortClearanceImpl.setCancelNote(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setCancelNote(cancelNote);
		}

		if (representative == null) {
			issuePortClearanceImpl.setRepresentative(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setRepresentative(representative);
		}

		if (signDate == Long.MIN_VALUE) {
			issuePortClearanceImpl.setSignDate(null);
		}
		else {
			issuePortClearanceImpl.setSignDate(new Date(signDate));
		}

		if (signName == null) {
			issuePortClearanceImpl.setSignName(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setSignName(signName);
		}

		if (signTitle == null) {
			issuePortClearanceImpl.setSignTitle(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setSignTitle(signTitle);
		}

		if (signPlace == null) {
			issuePortClearanceImpl.setSignPlace(StringPool.BLANK);
		}
		else {
			issuePortClearanceImpl.setSignPlace(signPlace);
		}

		issuePortClearanceImpl.setStampStatus(stampStatus);
		issuePortClearanceImpl.setAttachedFile(attachedFile);

		issuePortClearanceImpl.resetOriginalValues();

		return issuePortClearanceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		requestCode = objectInput.readUTF();
		numberPortClearance = objectInput.readUTF();
		documentName = objectInput.readLong();
		documentYear = objectInput.readInt();
		portofAuthority = objectInput.readUTF();
		nameOfShip = objectInput.readUTF();
		flagStateOfShip = objectInput.readUTF();
		numberOfCrews = objectInput.readInt();
		numberOfPassengers = objectInput.readInt();
		callSign = objectInput.readUTF();
		nameOfMaster = objectInput.readUTF();
		cargo = objectInput.readUTF();
		volumeCargo = objectInput.readDouble();
		cargoUnit = objectInput.readUTF();
		transitCargo = objectInput.readUTF();
		volumeTransitCargo = objectInput.readDouble();
		transitCargoUnit = objectInput.readUTF();
		timeOfDeparture = objectInput.readLong();
		nextPortOfCallCode = objectInput.readUTF();
		validUntil = objectInput.readLong();
		issueDate = objectInput.readLong();
		directorOfMaritime = objectInput.readUTF();
		certificateNo = objectInput.readUTF();
		requestState = objectInput.readInt();
		gt = objectInput.readDouble();
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

		if (numberPortClearance == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(numberPortClearance);
		}

		objectOutput.writeLong(documentName);
		objectOutput.writeInt(documentYear);

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

		if (cargo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cargo);
		}

		objectOutput.writeDouble(volumeCargo);

		if (cargoUnit == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cargoUnit);
		}

		if (transitCargo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(transitCargo);
		}

		objectOutput.writeDouble(volumeTransitCargo);

		if (transitCargoUnit == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(transitCargoUnit);
		}

		objectOutput.writeLong(timeOfDeparture);

		if (nextPortOfCallCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nextPortOfCallCode);
		}

		objectOutput.writeLong(validUntil);
		objectOutput.writeLong(issueDate);

		if (directorOfMaritime == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(directorOfMaritime);
		}

		if (certificateNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certificateNo);
		}

		objectOutput.writeInt(requestState);
		objectOutput.writeDouble(gt);

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
	public String numberPortClearance;
	public long documentName;
	public int documentYear;
	public String portofAuthority;
	public String nameOfShip;
	public String flagStateOfShip;
	public int numberOfCrews;
	public int numberOfPassengers;
	public String callSign;
	public String nameOfMaster;
	public String cargo;
	public double volumeCargo;
	public String cargoUnit;
	public String transitCargo;
	public double volumeTransitCargo;
	public String transitCargoUnit;
	public long timeOfDeparture;
	public String nextPortOfCallCode;
	public long validUntil;
	public long issueDate;
	public String directorOfMaritime;
	public String certificateNo;
	public int requestState;
	public double gt;
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
	public long signDate;
	public String signName;
	public String signTitle;
	public String signPlace;
	public long stampStatus;
	public long attachedFile;
}