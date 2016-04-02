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

import vn.dtt.duongbien.dao.vrcb.model.ResultMinistry;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ResultMinistry in entity cache.
 *
 * @author longdm
 * @see ResultMinistry
 * @generated
 */
public class ResultMinistryCacheModel implements CacheModel<ResultMinistry>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

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
		sb.append(", ministryCode=");
		sb.append(ministryCode);
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
		sb.append(", response=");
		sb.append(response);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ResultMinistry toEntityModel() {
		ResultMinistryImpl resultMinistryImpl = new ResultMinistryImpl();

		resultMinistryImpl.setId(id);

		if (requestCode == null) {
			resultMinistryImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			resultMinistryImpl.setRequestCode(requestCode);
		}

		resultMinistryImpl.setRequestState(requestState);
		resultMinistryImpl.setDocumentName(documentName);
		resultMinistryImpl.setDocumentYear(documentYear);

		if (ministryCode == null) {
			resultMinistryImpl.setMinistryCode(StringPool.BLANK);
		}
		else {
			resultMinistryImpl.setMinistryCode(ministryCode);
		}

		if (organization == null) {
			resultMinistryImpl.setOrganization(StringPool.BLANK);
		}
		else {
			resultMinistryImpl.setOrganization(organization);
		}

		if (division == null) {
			resultMinistryImpl.setDivision(StringPool.BLANK);
		}
		else {
			resultMinistryImpl.setDivision(division);
		}

		if (officerName == null) {
			resultMinistryImpl.setOfficerName(StringPool.BLANK);
		}
		else {
			resultMinistryImpl.setOfficerName(officerName);
		}

		if (latestDate == Long.MIN_VALUE) {
			resultMinistryImpl.setLatestDate(null);
		}
		else {
			resultMinistryImpl.setLatestDate(new Date(latestDate));
		}

		resultMinistryImpl.setBusinessTypeCode(businessTypeCode);

		if (response == null) {
			resultMinistryImpl.setResponse(StringPool.BLANK);
		}
		else {
			resultMinistryImpl.setResponse(response);
		}

		if (remarks == null) {
			resultMinistryImpl.setRemarks(StringPool.BLANK);
		}
		else {
			resultMinistryImpl.setRemarks(remarks);
		}

		resultMinistryImpl.resetOriginalValues();

		return resultMinistryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		requestCode = objectInput.readUTF();
		requestState = objectInput.readInt();
		documentName = objectInput.readInt();
		documentYear = objectInput.readInt();
		ministryCode = objectInput.readUTF();
		organization = objectInput.readUTF();
		division = objectInput.readUTF();
		officerName = objectInput.readUTF();
		latestDate = objectInput.readLong();
		businessTypeCode = objectInput.readInt();
		response = objectInput.readUTF();
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

		objectOutput.writeInt(requestState);
		objectOutput.writeInt(documentName);
		objectOutput.writeInt(documentYear);

		if (ministryCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ministryCode);
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

		objectOutput.writeLong(latestDate);
		objectOutput.writeInt(businessTypeCode);

		if (response == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(response);
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
	public int requestState;
	public int documentName;
	public int documentYear;
	public String ministryCode;
	public String organization;
	public String division;
	public String officerName;
	public long latestDate;
	public int businessTypeCode;
	public String response;
	public String remarks;
}