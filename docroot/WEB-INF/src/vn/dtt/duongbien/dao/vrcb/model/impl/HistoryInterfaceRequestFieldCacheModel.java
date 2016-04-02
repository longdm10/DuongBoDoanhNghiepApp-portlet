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

import vn.dtt.duongbien.dao.vrcb.model.HistoryInterfaceRequestField;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing HistoryInterfaceRequestField in entity cache.
 *
 * @author longdm
 * @see HistoryInterfaceRequestField
 * @generated
 */
public class HistoryInterfaceRequestFieldCacheModel implements CacheModel<HistoryInterfaceRequestField>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{id=");
		sb.append(id);
		sb.append(", requestCode=");
		sb.append(requestCode);
		sb.append(", organizationCode=");
		sb.append(organizationCode);
		sb.append(", locCode=");
		sb.append(locCode);
		sb.append(", requestDate=");
		sb.append(requestDate);
		sb.append(", requestedDate=");
		sb.append(requestedDate);
		sb.append(", requestDirection=");
		sb.append(requestDirection);
		sb.append(", requestState=");
		sb.append(requestState);
		sb.append(", requestResponseTime=");
		sb.append(requestResponseTime);
		sb.append(", documentType=");
		sb.append(documentType);
		sb.append(", businessType=");
		sb.append(businessType);
		sb.append(", functionType=");
		sb.append(functionType);
		sb.append(", senderName=");
		sb.append(senderName);
		sb.append(", requestVersion=");
		sb.append(requestVersion);
		sb.append(", senderIdentify=");
		sb.append(senderIdentify);
		sb.append(", receiverName=");
		sb.append(receiverName);
		sb.append(", sendingDate=");
		sb.append(sendingDate);
		sb.append(", receiverIdentify=");
		sb.append(receiverIdentify);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public HistoryInterfaceRequestField toEntityModel() {
		HistoryInterfaceRequestFieldImpl historyInterfaceRequestFieldImpl = new HistoryInterfaceRequestFieldImpl();

		historyInterfaceRequestFieldImpl.setId(id);

		if (requestCode == null) {
			historyInterfaceRequestFieldImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			historyInterfaceRequestFieldImpl.setRequestCode(requestCode);
		}

		if (organizationCode == null) {
			historyInterfaceRequestFieldImpl.setOrganizationCode(StringPool.BLANK);
		}
		else {
			historyInterfaceRequestFieldImpl.setOrganizationCode(organizationCode);
		}

		if (locCode == null) {
			historyInterfaceRequestFieldImpl.setLocCode(StringPool.BLANK);
		}
		else {
			historyInterfaceRequestFieldImpl.setLocCode(locCode);
		}

		if (requestDate == Long.MIN_VALUE) {
			historyInterfaceRequestFieldImpl.setRequestDate(null);
		}
		else {
			historyInterfaceRequestFieldImpl.setRequestDate(new Date(
					requestDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			historyInterfaceRequestFieldImpl.setRequestedDate(null);
		}
		else {
			historyInterfaceRequestFieldImpl.setRequestedDate(new Date(
					requestedDate));
		}

		if (requestDirection == null) {
			historyInterfaceRequestFieldImpl.setRequestDirection(StringPool.BLANK);
		}
		else {
			historyInterfaceRequestFieldImpl.setRequestDirection(requestDirection);
		}

		historyInterfaceRequestFieldImpl.setRequestState(requestState);

		if (requestResponseTime == Long.MIN_VALUE) {
			historyInterfaceRequestFieldImpl.setRequestResponseTime(null);
		}
		else {
			historyInterfaceRequestFieldImpl.setRequestResponseTime(new Date(
					requestResponseTime));
		}

		if (documentType == null) {
			historyInterfaceRequestFieldImpl.setDocumentType(StringPool.BLANK);
		}
		else {
			historyInterfaceRequestFieldImpl.setDocumentType(documentType);
		}

		if (businessType == null) {
			historyInterfaceRequestFieldImpl.setBusinessType(StringPool.BLANK);
		}
		else {
			historyInterfaceRequestFieldImpl.setBusinessType(businessType);
		}

		if (functionType == null) {
			historyInterfaceRequestFieldImpl.setFunctionType(StringPool.BLANK);
		}
		else {
			historyInterfaceRequestFieldImpl.setFunctionType(functionType);
		}

		if (senderName == null) {
			historyInterfaceRequestFieldImpl.setSenderName(StringPool.BLANK);
		}
		else {
			historyInterfaceRequestFieldImpl.setSenderName(senderName);
		}

		if (requestVersion == null) {
			historyInterfaceRequestFieldImpl.setRequestVersion(StringPool.BLANK);
		}
		else {
			historyInterfaceRequestFieldImpl.setRequestVersion(requestVersion);
		}

		if (senderIdentify == null) {
			historyInterfaceRequestFieldImpl.setSenderIdentify(StringPool.BLANK);
		}
		else {
			historyInterfaceRequestFieldImpl.setSenderIdentify(senderIdentify);
		}

		if (receiverName == null) {
			historyInterfaceRequestFieldImpl.setReceiverName(StringPool.BLANK);
		}
		else {
			historyInterfaceRequestFieldImpl.setReceiverName(receiverName);
		}

		if (sendingDate == Long.MIN_VALUE) {
			historyInterfaceRequestFieldImpl.setSendingDate(null);
		}
		else {
			historyInterfaceRequestFieldImpl.setSendingDate(new Date(
					sendingDate));
		}

		if (receiverIdentify == null) {
			historyInterfaceRequestFieldImpl.setReceiverIdentify(StringPool.BLANK);
		}
		else {
			historyInterfaceRequestFieldImpl.setReceiverIdentify(receiverIdentify);
		}

		if (remarks == null) {
			historyInterfaceRequestFieldImpl.setRemarks(StringPool.BLANK);
		}
		else {
			historyInterfaceRequestFieldImpl.setRemarks(remarks);
		}

		historyInterfaceRequestFieldImpl.resetOriginalValues();

		return historyInterfaceRequestFieldImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		requestCode = objectInput.readUTF();
		organizationCode = objectInput.readUTF();
		locCode = objectInput.readUTF();
		requestDate = objectInput.readLong();
		requestedDate = objectInput.readLong();
		requestDirection = objectInput.readUTF();
		requestState = objectInput.readInt();
		requestResponseTime = objectInput.readLong();
		documentType = objectInput.readUTF();
		businessType = objectInput.readUTF();
		functionType = objectInput.readUTF();
		senderName = objectInput.readUTF();
		requestVersion = objectInput.readUTF();
		senderIdentify = objectInput.readUTF();
		receiverName = objectInput.readUTF();
		sendingDate = objectInput.readLong();
		receiverIdentify = objectInput.readUTF();
		remarks = objectInput.readUTF();
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

		if (organizationCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(organizationCode);
		}

		if (locCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(locCode);
		}

		objectOutput.writeLong(requestDate);
		objectOutput.writeLong(requestedDate);

		if (requestDirection == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(requestDirection);
		}

		objectOutput.writeInt(requestState);
		objectOutput.writeLong(requestResponseTime);

		if (documentType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(documentType);
		}

		if (businessType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(businessType);
		}

		if (functionType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(functionType);
		}

		if (senderName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(senderName);
		}

		if (requestVersion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(requestVersion);
		}

		if (senderIdentify == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(senderIdentify);
		}

		if (receiverName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(receiverName);
		}

		objectOutput.writeLong(sendingDate);

		if (receiverIdentify == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(receiverIdentify);
		}

		if (remarks == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remarks);
		}
	}

	public long id;
	public String requestCode;
	public String organizationCode;
	public String locCode;
	public long requestDate;
	public long requestedDate;
	public String requestDirection;
	public int requestState;
	public long requestResponseTime;
	public String documentType;
	public String businessType;
	public String functionType;
	public String senderName;
	public String requestVersion;
	public String senderIdentify;
	public String receiverName;
	public long sendingDate;
	public String receiverIdentify;
	public String remarks;
}