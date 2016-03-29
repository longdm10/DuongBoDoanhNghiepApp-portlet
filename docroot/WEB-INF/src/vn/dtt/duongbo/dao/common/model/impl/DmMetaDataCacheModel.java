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

package vn.dtt.duongbo.dao.common.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.duongbo.dao.common.model.DmMetaData;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing DmMetaData in entity cache.
 *
 * @author win_64
 * @see DmMetaData
 * @generated
 */
public class DmMetaDataCacheModel implements CacheModel<DmMetaData>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(id);
		sb.append(", entity=");
		sb.append(entity);
		sb.append(", fieldCode=");
		sb.append(fieldCode);
		sb.append(", fieldName=");
		sb.append(fieldName);
		sb.append(", fieldAlterName=");
		sb.append(fieldAlterName);
		sb.append(", fieldDescription=");
		sb.append(fieldDescription);
		sb.append(", fieldDataSet=");
		sb.append(fieldDataSet);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DmMetaData toEntityModel() {
		DmMetaDataImpl dmMetaDataImpl = new DmMetaDataImpl();

		dmMetaDataImpl.setId(id);

		if (entity == null) {
			dmMetaDataImpl.setEntity(StringPool.BLANK);
		}
		else {
			dmMetaDataImpl.setEntity(entity);
		}

		if (fieldCode == null) {
			dmMetaDataImpl.setFieldCode(StringPool.BLANK);
		}
		else {
			dmMetaDataImpl.setFieldCode(fieldCode);
		}

		if (fieldName == null) {
			dmMetaDataImpl.setFieldName(StringPool.BLANK);
		}
		else {
			dmMetaDataImpl.setFieldName(fieldName);
		}

		if (fieldAlterName == null) {
			dmMetaDataImpl.setFieldAlterName(StringPool.BLANK);
		}
		else {
			dmMetaDataImpl.setFieldAlterName(fieldAlterName);
		}

		if (fieldDescription == null) {
			dmMetaDataImpl.setFieldDescription(StringPool.BLANK);
		}
		else {
			dmMetaDataImpl.setFieldDescription(fieldDescription);
		}

		if (fieldDataSet == null) {
			dmMetaDataImpl.setFieldDataSet(StringPool.BLANK);
		}
		else {
			dmMetaDataImpl.setFieldDataSet(fieldDataSet);
		}

		dmMetaDataImpl.resetOriginalValues();

		return dmMetaDataImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		entity = objectInput.readUTF();
		fieldCode = objectInput.readUTF();
		fieldName = objectInput.readUTF();
		fieldAlterName = objectInput.readUTF();
		fieldDescription = objectInput.readUTF();
		fieldDataSet = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (entity == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(entity);
		}

		if (fieldCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fieldCode);
		}

		if (fieldName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fieldName);
		}

		if (fieldAlterName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fieldAlterName);
		}

		if (fieldDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fieldDescription);
		}

		if (fieldDataSet == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fieldDataSet);
		}
	}

	public long id;
	public String entity;
	public String fieldCode;
	public String fieldName;
	public String fieldAlterName;
	public String fieldDescription;
	public String fieldDataSet;
}