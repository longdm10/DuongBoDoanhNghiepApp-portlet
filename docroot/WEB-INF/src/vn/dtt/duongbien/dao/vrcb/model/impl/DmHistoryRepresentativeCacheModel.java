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

import vn.dtt.duongbien.dao.vrcb.model.DmHistoryRepresentative;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DmHistoryRepresentative in entity cache.
 *
 * @author longdm
 * @see DmHistoryRepresentative
 * @generated
 */
public class DmHistoryRepresentativeCacheModel implements CacheModel<DmHistoryRepresentative>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(id);
		sb.append(", repCode=");
		sb.append(repCode);
		sb.append(", repName=");
		sb.append(repName);
		sb.append(", repNameVN=");
		sb.append(repNameVN);
		sb.append(", repOrder=");
		sb.append(repOrder);
		sb.append(", maritimeCode=");
		sb.append(maritimeCode);
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
	public DmHistoryRepresentative toEntityModel() {
		DmHistoryRepresentativeImpl dmHistoryRepresentativeImpl = new DmHistoryRepresentativeImpl();

		dmHistoryRepresentativeImpl.setId(id);

		if (repCode == null) {
			dmHistoryRepresentativeImpl.setRepCode(StringPool.BLANK);
		}
		else {
			dmHistoryRepresentativeImpl.setRepCode(repCode);
		}

		if (repName == null) {
			dmHistoryRepresentativeImpl.setRepName(StringPool.BLANK);
		}
		else {
			dmHistoryRepresentativeImpl.setRepName(repName);
		}

		if (repNameVN == null) {
			dmHistoryRepresentativeImpl.setRepNameVN(StringPool.BLANK);
		}
		else {
			dmHistoryRepresentativeImpl.setRepNameVN(repNameVN);
		}

		dmHistoryRepresentativeImpl.setRepOrder(repOrder);

		if (maritimeCode == null) {
			dmHistoryRepresentativeImpl.setMaritimeCode(StringPool.BLANK);
		}
		else {
			dmHistoryRepresentativeImpl.setMaritimeCode(maritimeCode);
		}

		dmHistoryRepresentativeImpl.setIsDelete(isDelete);
		dmHistoryRepresentativeImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmHistoryRepresentativeImpl.setModifiedDate(null);
		}
		else {
			dmHistoryRepresentativeImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmHistoryRepresentativeImpl.setRequestedDate(null);
		}
		else {
			dmHistoryRepresentativeImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmHistoryRepresentativeImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmHistoryRepresentativeImpl.setSyncVersion(syncVersion);
		}

		dmHistoryRepresentativeImpl.resetOriginalValues();

		return dmHistoryRepresentativeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		repCode = objectInput.readUTF();
		repName = objectInput.readUTF();
		repNameVN = objectInput.readUTF();
		repOrder = objectInput.readInt();
		maritimeCode = objectInput.readUTF();
		isDelete = objectInput.readInt();
		markedAsDelete = objectInput.readInt();
		modifiedDate = objectInput.readLong();
		requestedDate = objectInput.readLong();
		syncVersion = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(id);

		if (repCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(repCode);
		}

		if (repName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(repName);
		}

		if (repNameVN == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(repNameVN);
		}

		objectOutput.writeInt(repOrder);

		if (maritimeCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maritimeCode);
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

	public int id;
	public String repCode;
	public String repName;
	public String repNameVN;
	public int repOrder;
	public String maritimeCode;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}