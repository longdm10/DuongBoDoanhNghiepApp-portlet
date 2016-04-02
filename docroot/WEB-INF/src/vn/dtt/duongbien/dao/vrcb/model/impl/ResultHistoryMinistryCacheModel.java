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

import vn.dtt.duongbien.dao.vrcb.model.ResultHistoryMinistry;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ResultHistoryMinistry in entity cache.
 *
 * @author longdm
 * @see ResultHistoryMinistry
 * @generated
 */
public class ResultHistoryMinistryCacheModel implements CacheModel<ResultHistoryMinistry>,
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
	public ResultHistoryMinistry toEntityModel() {
		ResultHistoryMinistryImpl resultHistoryMinistryImpl = new ResultHistoryMinistryImpl();

		resultHistoryMinistryImpl.setId(id);

		if (requestCode == null) {
			resultHistoryMinistryImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			resultHistoryMinistryImpl.setRequestCode(requestCode);
		}

		resultHistoryMinistryImpl.setRequestState(requestState);
		resultHistoryMinistryImpl.setDocumentName(documentName);
		resultHistoryMinistryImpl.setDocumentYear(documentYear);

		if (ministryCode == null) {
			resultHistoryMinistryImpl.setMinistryCode(StringPool.BLANK);
		}
		else {
			resultHistoryMinistryImpl.setMinistryCode(ministryCode);
		}

		if (organization == null) {
			resultHistoryMinistryImpl.setOrganization(StringPool.BLANK);
		}
		else {
			resultHistoryMinistryImpl.setOrganization(organization);
		}

		if (division == null) {
			resultHistoryMinistryImpl.setDivision(StringPool.BLANK);
		}
		else {
			resultHistoryMinistryImpl.setDivision(division);
		}

		if (officerName == null) {
			resultHistoryMinistryImpl.setOfficerName(StringPool.BLANK);
		}
		else {
			resultHistoryMinistryImpl.setOfficerName(officerName);
		}

		if (latestDate == Long.MIN_VALUE) {
			resultHistoryMinistryImpl.setLatestDate(null);
		}
		else {
			resultHistoryMinistryImpl.setLatestDate(new Date(latestDate));
		}

		resultHistoryMinistryImpl.setBusinessTypeCode(businessTypeCode);

		if (response == null) {
			resultHistoryMinistryImpl.setResponse(StringPool.BLANK);
		}
		else {
			resultHistoryMinistryImpl.setResponse(response);
		}

		if (remarks == null) {
			resultHistoryMinistryImpl.setRemarks(StringPool.BLANK);
		}
		else {
			resultHistoryMinistryImpl.setRemarks(remarks);
		}

		resultHistoryMinistryImpl.resetOriginalValues();

		return resultHistoryMinistryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		requestCode = objectInput.readUTF();
		requestState = objectInput.readInt();
		documentName = objectInput.readLong();
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
		objectOutput.writeLong(documentName);
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
	public long documentName;
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