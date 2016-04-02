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

import vn.dtt.duongbien.dao.vrcb.model.DmGtReportTemplate;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DmGtReportTemplate in entity cache.
 *
 * @author longdm
 * @see DmGtReportTemplate
 * @generated
 */
public class DmGtReportTemplateCacheModel implements CacheModel<DmGtReportTemplate>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(id);
		sb.append(", reportCode=");
		sb.append(reportCode);
		sb.append(", reportName=");
		sb.append(reportName);
		sb.append(", reportType=");
		sb.append(reportType);
		sb.append(", category=");
		sb.append(category);
		sb.append(", description=");
		sb.append(description);
		sb.append(", isDelete=");
		sb.append(isDelete);
		sb.append(", markedAsDelete=");
		sb.append(markedAsDelete);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", requestedDate=");
		sb.append(requestedDate);
		sb.append(", syncVersion=");
		sb.append(syncVersion);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DmGtReportTemplate toEntityModel() {
		DmGtReportTemplateImpl dmGtReportTemplateImpl = new DmGtReportTemplateImpl();

		dmGtReportTemplateImpl.setId(id);
		dmGtReportTemplateImpl.setReportCode(reportCode);

		if (reportName == null) {
			dmGtReportTemplateImpl.setReportName(StringPool.BLANK);
		}
		else {
			dmGtReportTemplateImpl.setReportName(reportName);
		}

		dmGtReportTemplateImpl.setReportType(reportType);

		if (category == null) {
			dmGtReportTemplateImpl.setCategory(StringPool.BLANK);
		}
		else {
			dmGtReportTemplateImpl.setCategory(category);
		}

		if (description == null) {
			dmGtReportTemplateImpl.setDescription(StringPool.BLANK);
		}
		else {
			dmGtReportTemplateImpl.setDescription(description);
		}

		dmGtReportTemplateImpl.setIsDelete(isDelete);
		dmGtReportTemplateImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmGtReportTemplateImpl.setModifiedDate(null);
		}
		else {
			dmGtReportTemplateImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmGtReportTemplateImpl.setRequestedDate(null);
		}
		else {
			dmGtReportTemplateImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmGtReportTemplateImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmGtReportTemplateImpl.setSyncVersion(syncVersion);
		}

		dmGtReportTemplateImpl.resetOriginalValues();

		return dmGtReportTemplateImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		reportCode = objectInput.readInt();
		reportName = objectInput.readUTF();
		reportType = objectInput.readInt();
		category = objectInput.readUTF();
		description = objectInput.readUTF();
		isDelete = objectInput.readInt();
		markedAsDelete = objectInput.readInt();
		modifiedDate = objectInput.readLong();
		requestedDate = objectInput.readLong();
		syncVersion = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeInt(reportCode);

		if (reportName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(reportName);
		}

		objectOutput.writeInt(reportType);

		if (category == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(category);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeInt(isDelete);
		objectOutput.writeInt(markedAsDelete);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(requestedDate);

		if (syncVersion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(syncVersion);
		}
	}

	public long id;
	public int reportCode;
	public String reportName;
	public int reportType;
	public String category;
	public String description;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}