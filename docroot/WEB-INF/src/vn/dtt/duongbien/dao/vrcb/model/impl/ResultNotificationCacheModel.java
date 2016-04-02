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

import vn.dtt.duongbien.dao.vrcb.model.ResultNotification;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ResultNotification in entity cache.
 *
 * @author longdm
 * @see ResultNotification
 * @generated
 */
public class ResultNotificationCacheModel implements CacheModel<ResultNotification>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

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
		sb.append(", maritimeCode=");
		sb.append(maritimeCode);
		sb.append(", role=");
		sb.append(role);
		sb.append(", response=");
		sb.append(response);
		sb.append(", organization=");
		sb.append(organization);
		sb.append(", division=");
		sb.append(division);
		sb.append(", officerName=");
		sb.append(officerName);
		sb.append(", latestDate=");
		sb.append(latestDate);
		sb.append(", businessTypeCode=");
		sb.append(businessTypeCode);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append(", isReply=");
		sb.append(isReply);
		sb.append(", responseTime=");
		sb.append(responseTime);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ResultNotification toEntityModel() {
		ResultNotificationImpl resultNotificationImpl = new ResultNotificationImpl();

		resultNotificationImpl.setId(id);

		if (requestCode == null) {
			resultNotificationImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			resultNotificationImpl.setRequestCode(requestCode);
		}

		resultNotificationImpl.setRequestState(requestState);
		resultNotificationImpl.setDocumentName(documentName);
		resultNotificationImpl.setDocumentYear(documentYear);

		if (maritimeCode == null) {
			resultNotificationImpl.setMaritimeCode(StringPool.BLANK);
		}
		else {
			resultNotificationImpl.setMaritimeCode(maritimeCode);
		}

		resultNotificationImpl.setRole(role);

		if (response == null) {
			resultNotificationImpl.setResponse(StringPool.BLANK);
		}
		else {
			resultNotificationImpl.setResponse(response);
		}

		if (organization == null) {
			resultNotificationImpl.setOrganization(StringPool.BLANK);
		}
		else {
			resultNotificationImpl.setOrganization(organization);
		}

		if (division == null) {
			resultNotificationImpl.setDivision(StringPool.BLANK);
		}
		else {
			resultNotificationImpl.setDivision(division);
		}

		if (officerName == null) {
			resultNotificationImpl.setOfficerName(StringPool.BLANK);
		}
		else {
			resultNotificationImpl.setOfficerName(officerName);
		}

		if (latestDate == null) {
			resultNotificationImpl.setLatestDate(StringPool.BLANK);
		}
		else {
			resultNotificationImpl.setLatestDate(latestDate);
		}

		resultNotificationImpl.setBusinessTypeCode(businessTypeCode);

		if (remarks == null) {
			resultNotificationImpl.setRemarks(StringPool.BLANK);
		}
		else {
			resultNotificationImpl.setRemarks(remarks);
		}

		resultNotificationImpl.setIsReply(isReply);

		if (responseTime == Long.MIN_VALUE) {
			resultNotificationImpl.setResponseTime(null);
		}
		else {
			resultNotificationImpl.setResponseTime(new Date(responseTime));
		}

		resultNotificationImpl.resetOriginalValues();

		return resultNotificationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		requestCode = objectInput.readUTF();
		requestState = objectInput.readInt();
		documentName = objectInput.readLong();
		documentYear = objectInput.readInt();
		maritimeCode = objectInput.readUTF();
		role = objectInput.readLong();
		response = objectInput.readUTF();
		organization = objectInput.readUTF();
		division = objectInput.readUTF();
		officerName = objectInput.readUTF();
		latestDate = objectInput.readUTF();
		businessTypeCode = objectInput.readInt();
		remarks = objectInput.readUTF();
		isReply = objectInput.readInt();
		responseTime = objectInput.readLong();
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

		if (maritimeCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maritimeCode);
		}

		objectOutput.writeLong(role);

		if (response == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(response);
		}

		if (organization == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(organization);
		}

		if (division == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(division);
		}

		if (officerName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(officerName);
		}

		if (latestDate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(latestDate);
		}

		objectOutput.writeInt(businessTypeCode);

		if (remarks == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remarks);
		}

		objectOutput.writeInt(isReply);
		objectOutput.writeLong(responseTime);
	}

	public long id;
	public String requestCode;
	public int requestState;
	public long documentName;
	public int documentYear;
	public String maritimeCode;
	public long role;
	public String response;
	public String organization;
	public String division;
	public String officerName;
	public String latestDate;
	public int businessTypeCode;
	public String remarks;
	public int isReply;
	public long responseTime;
}