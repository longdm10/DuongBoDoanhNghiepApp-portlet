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

import vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing IssueShiftingOrder in entity cache.
 *
 * @author longdm
 * @see IssueShiftingOrder
 * @generated
 */
public class IssueShiftingOrderCacheModel implements CacheModel<IssueShiftingOrder>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(71);

		sb.append("{id=");
		sb.append(id);
		sb.append(", requestCode=");
		sb.append(requestCode);
		sb.append(", numberShiftingOrder=");
		sb.append(numberShiftingOrder);
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
		sb.append(", anchoringPortCode=");
		sb.append(anchoringPortCode);
		sb.append(", anchoringPortWharfCode=");
		sb.append(anchoringPortWharfCode);
		sb.append(", portHarbourCode=");
		sb.append(portHarbourCode);
		sb.append(", shiftingPortWharfCode=");
		sb.append(shiftingPortWharfCode);
		sb.append(", shiftingDate=");
		sb.append(shiftingDate);
		sb.append(", reasonToShift=");
		sb.append(reasonToShift);
		sb.append(", issueDate=");
		sb.append(issueDate);
		sb.append(", directorOfMaritime=");
		sb.append(directorOfMaritime);
		sb.append(", certificateNo=");
		sb.append(certificateNo);
		sb.append(", requestState=");
		sb.append(requestState);
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
	public IssueShiftingOrder toEntityModel() {
		IssueShiftingOrderImpl issueShiftingOrderImpl = new IssueShiftingOrderImpl();

		issueShiftingOrderImpl.setId(id);

		if (requestCode == null) {
			issueShiftingOrderImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setRequestCode(requestCode);
		}

		if (numberShiftingOrder == null) {
			issueShiftingOrderImpl.setNumberShiftingOrder(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setNumberShiftingOrder(numberShiftingOrder);
		}

		issueShiftingOrderImpl.setDocumentName(documentName);
		issueShiftingOrderImpl.setDocumentYear(documentYear);

		if (portofAuthority == null) {
			issueShiftingOrderImpl.setPortofAuthority(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setPortofAuthority(portofAuthority);
		}

		if (nameOfShip == null) {
			issueShiftingOrderImpl.setNameOfShip(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setNameOfShip(nameOfShip);
		}

		if (flagStateOfShip == null) {
			issueShiftingOrderImpl.setFlagStateOfShip(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setFlagStateOfShip(flagStateOfShip);
		}

		if (anchoringPortCode == null) {
			issueShiftingOrderImpl.setAnchoringPortCode(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setAnchoringPortCode(anchoringPortCode);
		}

		if (anchoringPortWharfCode == null) {
			issueShiftingOrderImpl.setAnchoringPortWharfCode(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setAnchoringPortWharfCode(anchoringPortWharfCode);
		}

		if (portHarbourCode == null) {
			issueShiftingOrderImpl.setPortHarbourCode(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setPortHarbourCode(portHarbourCode);
		}

		if (shiftingPortWharfCode == null) {
			issueShiftingOrderImpl.setShiftingPortWharfCode(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setShiftingPortWharfCode(shiftingPortWharfCode);
		}

		if (shiftingDate == Long.MIN_VALUE) {
			issueShiftingOrderImpl.setShiftingDate(null);
		}
		else {
			issueShiftingOrderImpl.setShiftingDate(new Date(shiftingDate));
		}

		if (reasonToShift == null) {
			issueShiftingOrderImpl.setReasonToShift(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setReasonToShift(reasonToShift);
		}

		if (issueDate == Long.MIN_VALUE) {
			issueShiftingOrderImpl.setIssueDate(null);
		}
		else {
			issueShiftingOrderImpl.setIssueDate(new Date(issueDate));
		}

		if (directorOfMaritime == null) {
			issueShiftingOrderImpl.setDirectorOfMaritime(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setDirectorOfMaritime(directorOfMaritime);
		}

		if (certificateNo == null) {
			issueShiftingOrderImpl.setCertificateNo(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setCertificateNo(certificateNo);
		}

		issueShiftingOrderImpl.setRequestState(requestState);

		if (versionNo == null) {
			issueShiftingOrderImpl.setVersionNo(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setVersionNo(versionNo);
		}

		issueShiftingOrderImpl.setIsApproval(isApproval);

		if (approvalDate == Long.MIN_VALUE) {
			issueShiftingOrderImpl.setApprovalDate(null);
		}
		else {
			issueShiftingOrderImpl.setApprovalDate(new Date(approvalDate));
		}

		if (approvalName == null) {
			issueShiftingOrderImpl.setApprovalName(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setApprovalName(approvalName);
		}

		if (remarks == null) {
			issueShiftingOrderImpl.setRemarks(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setRemarks(remarks);
		}

		issueShiftingOrderImpl.setIsCancel(isCancel);

		if (cancelDate == Long.MIN_VALUE) {
			issueShiftingOrderImpl.setCancelDate(null);
		}
		else {
			issueShiftingOrderImpl.setCancelDate(new Date(cancelDate));
		}

		if (cancelName == null) {
			issueShiftingOrderImpl.setCancelName(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setCancelName(cancelName);
		}

		if (cancelNote == null) {
			issueShiftingOrderImpl.setCancelNote(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setCancelNote(cancelNote);
		}

		if (representative == null) {
			issueShiftingOrderImpl.setRepresentative(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setRepresentative(representative);
		}

		issueShiftingOrderImpl.setDigitalAttachedFile(digitalAttachedFile);

		if (signDate == Long.MIN_VALUE) {
			issueShiftingOrderImpl.setSignDate(null);
		}
		else {
			issueShiftingOrderImpl.setSignDate(new Date(signDate));
		}

		if (signName == null) {
			issueShiftingOrderImpl.setSignName(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setSignName(signName);
		}

		if (signTitle == null) {
			issueShiftingOrderImpl.setSignTitle(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setSignTitle(signTitle);
		}

		if (signPlace == null) {
			issueShiftingOrderImpl.setSignPlace(StringPool.BLANK);
		}
		else {
			issueShiftingOrderImpl.setSignPlace(signPlace);
		}

		issueShiftingOrderImpl.setStampStatus(stampStatus);
		issueShiftingOrderImpl.setAttachedFile(attachedFile);

		issueShiftingOrderImpl.resetOriginalValues();

		return issueShiftingOrderImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		requestCode = objectInput.readUTF();
		numberShiftingOrder = objectInput.readUTF();
		documentName = objectInput.readLong();
		documentYear = objectInput.readInt();
		portofAuthority = objectInput.readUTF();
		nameOfShip = objectInput.readUTF();
		flagStateOfShip = objectInput.readUTF();
		anchoringPortCode = objectInput.readUTF();
		anchoringPortWharfCode = objectInput.readUTF();
		portHarbourCode = objectInput.readUTF();
		shiftingPortWharfCode = objectInput.readUTF();
		shiftingDate = objectInput.readLong();
		reasonToShift = objectInput.readUTF();
		issueDate = objectInput.readLong();
		directorOfMaritime = objectInput.readUTF();
		certificateNo = objectInput.readUTF();
		requestState = objectInput.readInt();
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
		stampStatus = objectInput.readInt();
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

		if (numberShiftingOrder == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(numberShiftingOrder);
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

		if (anchoringPortCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(anchoringPortCode);
		}

		if (anchoringPortWharfCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(anchoringPortWharfCode);
		}

		if (portHarbourCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(portHarbourCode);
		}

		if (shiftingPortWharfCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shiftingPortWharfCode);
		}

		objectOutput.writeLong(shiftingDate);

		if (reasonToShift == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(reasonToShift);
		}

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

		objectOutput.writeInt(stampStatus);
		objectOutput.writeLong(attachedFile);
	}

	public long id;
	public String requestCode;
	public String numberShiftingOrder;
	public long documentName;
	public int documentYear;
	public String portofAuthority;
	public String nameOfShip;
	public String flagStateOfShip;
	public String anchoringPortCode;
	public String anchoringPortWharfCode;
	public String portHarbourCode;
	public String shiftingPortWharfCode;
	public long shiftingDate;
	public String reasonToShift;
	public long issueDate;
	public String directorOfMaritime;
	public String certificateNo;
	public int requestState;
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
	public int stampStatus;
	public long attachedFile;
}