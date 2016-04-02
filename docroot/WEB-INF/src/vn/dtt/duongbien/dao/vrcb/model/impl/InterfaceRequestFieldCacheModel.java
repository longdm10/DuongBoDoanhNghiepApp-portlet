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

import vn.dtt.duongbien.dao.vrcb.model.InterfaceRequestField;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing InterfaceRequestField in entity cache.
 *
 * @author longdm
 * @see InterfaceRequestField
 * @generated
 */
public class InterfaceRequestFieldCacheModel implements CacheModel<InterfaceRequestField>,
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
	public InterfaceRequestField toEntityModel() {
		InterfaceRequestFieldImpl interfaceRequestFieldImpl = new InterfaceRequestFieldImpl();

		interfaceRequestFieldImpl.setId(id);

		if (requestCode == null) {
			interfaceRequestFieldImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			interfaceRequestFieldImpl.setRequestCode(requestCode);
		}

		if (organizationCode == null) {
			interfaceRequestFieldImpl.setOrganizationCode(StringPool.BLANK);
		}
		else {
			interfaceRequestFieldImpl.setOrganizationCode(organizationCode);
		}

		if (locCode == null) {
			interfaceRequestFieldImpl.setLocCode(StringPool.BLANK);
		}
		else {
			interfaceRequestFieldImpl.setLocCode(locCode);
		}

		if (requestDate == Long.MIN_VALUE) {
			interfaceRequestFieldImpl.setRequestDate(null);
		}
		else {
			interfaceRequestFieldImpl.setRequestDate(new Date(requestDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			interfaceRequestFieldImpl.setRequestedDate(null);
		}
		else {
			interfaceRequestFieldImpl.setRequestedDate(new Date(requestedDate));
		}

		if (requestDirection == null) {
			interfaceRequestFieldImpl.setRequestDirection(StringPool.BLANK);
		}
		else {
			interfaceRequestFieldImpl.setRequestDirection(requestDirection);
		}

		interfaceRequestFieldImpl.setRequestState(requestState);

		if (requestResponseTime == Long.MIN_VALUE) {
			interfaceRequestFieldImpl.setRequestResponseTime(null);
		}
		else {
			interfaceRequestFieldImpl.setRequestResponseTime(new Date(
					requestResponseTime));
		}

		if (documentType == null) {
			interfaceRequestFieldImpl.setDocumentType(StringPool.BLANK);
		}
		else {
			interfaceRequestFieldImpl.setDocumentType(documentType);
		}

		if (businessType == null) {
			interfaceRequestFieldImpl.setBusinessType(StringPool.BLANK);
		}
		else {
			interfaceRequestFieldImpl.setBusinessType(businessType);
		}

		if (functionType == null) {
			interfaceRequestFieldImpl.setFunctionType(StringPool.BLANK);
		}
		else {
			interfaceRequestFieldImpl.setFunctionType(functionType);
		}

		if (senderName == null) {
			interfaceRequestFieldImpl.setSenderName(StringPool.BLANK);
		}
		else {
			interfaceRequestFieldImpl.setSenderName(senderName);
		}

		if (requestVersion == null) {
			interfaceRequestFieldImpl.setRequestVersion(StringPool.BLANK);
		}
		else {
			interfaceRequestFieldImpl.setRequestVersion(requestVersion);
		}

		if (senderIdentify == null) {
			interfaceRequestFieldImpl.setSenderIdentify(StringPool.BLANK);
		}
		else {
			interfaceRequestFieldImpl.setSenderIdentify(senderIdentify);
		}

		if (receiverName == null) {
			interfaceRequestFieldImpl.setReceiverName(StringPool.BLANK);
		}
		else {
			interfaceRequestFieldImpl.setReceiverName(receiverName);
		}

		if (sendingDate == Long.MIN_VALUE) {
			interfaceRequestFieldImpl.setSendingDate(null);
		}
		else {
			interfaceRequestFieldImpl.setSendingDate(new Date(sendingDate));
		}

		if (receiverIdentify == null) {
			interfaceRequestFieldImpl.setReceiverIdentify(StringPool.BLANK);
		}
		else {
			interfaceRequestFieldImpl.setReceiverIdentify(receiverIdentify);
		}

		if (remarks == null) {
			interfaceRequestFieldImpl.setRemarks(StringPool.BLANK);
		}
		else {
			interfaceRequestFieldImpl.setRemarks(remarks);
		}

		interfaceRequestFieldImpl.resetOriginalValues();

		return interfaceRequestFieldImpl;
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