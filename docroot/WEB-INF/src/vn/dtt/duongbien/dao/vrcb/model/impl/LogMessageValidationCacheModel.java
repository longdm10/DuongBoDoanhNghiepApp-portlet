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

import vn.dtt.duongbien.dao.vrcb.model.LogMessageValidation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing LogMessageValidation in entity cache.
 *
 * @author longdm
 * @see LogMessageValidation
 * @generated
 */
public class LogMessageValidationCacheModel implements CacheModel<LogMessageValidation>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(id);
		sb.append(", requestCode=");
		sb.append(requestCode);
		sb.append(", requestDirection=");
		sb.append(requestDirection);
		sb.append(", requestDate=");
		sb.append(requestDate);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append(", documentYear=");
		sb.append(documentYear);
		sb.append(", documentType=");
		sb.append(documentType);
		sb.append(", tagProperty=");
		sb.append(tagProperty);
		sb.append(", dataValidation=");
		sb.append(dataValidation);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public LogMessageValidation toEntityModel() {
		LogMessageValidationImpl logMessageValidationImpl = new LogMessageValidationImpl();

		logMessageValidationImpl.setId(id);

		if (requestCode == null) {
			logMessageValidationImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			logMessageValidationImpl.setRequestCode(requestCode);
		}

		if (requestDirection == null) {
			logMessageValidationImpl.setRequestDirection(StringPool.BLANK);
		}
		else {
			logMessageValidationImpl.setRequestDirection(requestDirection);
		}

		if (requestDate == Long.MIN_VALUE) {
			logMessageValidationImpl.setRequestDate(null);
		}
		else {
			logMessageValidationImpl.setRequestDate(new Date(requestDate));
		}

		logMessageValidationImpl.setDocumentName(documentName);
		logMessageValidationImpl.setDocumentYear(documentYear);

		if (documentType == null) {
			logMessageValidationImpl.setDocumentType(StringPool.BLANK);
		}
		else {
			logMessageValidationImpl.setDocumentType(documentType);
		}

		if (tagProperty == null) {
			logMessageValidationImpl.setTagProperty(StringPool.BLANK);
		}
		else {
			logMessageValidationImpl.setTagProperty(tagProperty);
		}

		if (dataValidation == null) {
			logMessageValidationImpl.setDataValidation(StringPool.BLANK);
		}
		else {
			logMessageValidationImpl.setDataValidation(dataValidation);
		}

		logMessageValidationImpl.resetOriginalValues();

		return logMessageValidationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		requestCode = objectInput.readUTF();
		requestDirection = objectInput.readUTF();
		requestDate = objectInput.readLong();
		documentName = objectInput.readLong();
		documentYear = objectInput.readInt();
		documentType = objectInput.readUTF();
		tagProperty = objectInput.readUTF();
		dataValidation = objectInput.readUTF();
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

		if (requestDirection == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(requestDirection);
		}

		objectOutput.writeLong(requestDate);
		objectOutput.writeLong(documentName);
		objectOutput.writeInt(documentYear);

		if (documentType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(documentType);
		}

		if (tagProperty == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tagProperty);
		}

		if (dataValidation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dataValidation);
		}
	}

	public long id;
	public String requestCode;
	public String requestDirection;
	public long requestDate;
	public long documentName;
	public int documentYear;
	public String documentType;
	public String tagProperty;
	public String dataValidation;
}