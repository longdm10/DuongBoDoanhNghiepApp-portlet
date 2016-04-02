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

import vn.dtt.duongbien.dao.vrcb.model.DmGTBusinessType;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DmGTBusinessType in entity cache.
 *
 * @author longdm
 * @see DmGTBusinessType
 * @generated
 */
public class DmGTBusinessTypeCacheModel implements CacheModel<DmGTBusinessType>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(id);
		sb.append(", businessTypeCode=");
		sb.append(businessTypeCode);
		sb.append(", businessTypeName=");
		sb.append(businessTypeName);
		sb.append(", businessTypeNameVN=");
		sb.append(businessTypeNameVN);
		sb.append(", businessTypeOrder=");
		sb.append(businessTypeOrder);
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
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DmGTBusinessType toEntityModel() {
		DmGTBusinessTypeImpl dmGTBusinessTypeImpl = new DmGTBusinessTypeImpl();

		dmGTBusinessTypeImpl.setId(id);
		dmGTBusinessTypeImpl.setBusinessTypeCode(businessTypeCode);

		if (businessTypeName == null) {
			dmGTBusinessTypeImpl.setBusinessTypeName(StringPool.BLANK);
		}
		else {
			dmGTBusinessTypeImpl.setBusinessTypeName(businessTypeName);
		}

		if (businessTypeNameVN == null) {
			dmGTBusinessTypeImpl.setBusinessTypeNameVN(StringPool.BLANK);
		}
		else {
			dmGTBusinessTypeImpl.setBusinessTypeNameVN(businessTypeNameVN);
		}

		dmGTBusinessTypeImpl.setBusinessTypeOrder(businessTypeOrder);
		dmGTBusinessTypeImpl.setIsDelete(isDelete);
		dmGTBusinessTypeImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmGTBusinessTypeImpl.setModifiedDate(null);
		}
		else {
			dmGTBusinessTypeImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmGTBusinessTypeImpl.setRequestedDate(null);
		}
		else {
			dmGTBusinessTypeImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmGTBusinessTypeImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmGTBusinessTypeImpl.setSyncVersion(syncVersion);
		}

		if (remarks == null) {
			dmGTBusinessTypeImpl.setRemarks(StringPool.BLANK);
		}
		else {
			dmGTBusinessTypeImpl.setRemarks(remarks);
		}

		dmGTBusinessTypeImpl.resetOriginalValues();

		return dmGTBusinessTypeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		businessTypeCode = objectInput.readInt();
		businessTypeName = objectInput.readUTF();
		businessTypeNameVN = objectInput.readUTF();
		businessTypeOrder = objectInput.readInt();
		isDelete = objectInput.readInt();
		markedAsDelete = objectInput.readInt();
		modifiedDate = objectInput.readLong();
		requestedDate = objectInput.readLong();
		syncVersion = objectInput.readUTF();
		remarks = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeInt(businessTypeCode);

		if (businessTypeName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(businessTypeName);
		}

		if (businessTypeNameVN == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(businessTypeNameVN);
		}

		objectOutput.writeInt(businessTypeOrder);
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

		if (remarks == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remarks);
		}
	}

	public long id;
	public int businessTypeCode;
	public String businessTypeName;
	public String businessTypeNameVN;
	public int businessTypeOrder;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
	public String remarks;
}