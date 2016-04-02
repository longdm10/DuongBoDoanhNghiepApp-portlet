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

import vn.dtt.duongbien.dao.vrcb.model.DmUnitGeneral;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DmUnitGeneral in entity cache.
 *
 * @author longdm
 * @see DmUnitGeneral
 * @generated
 */
public class DmUnitGeneralCacheModel implements CacheModel<DmUnitGeneral>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(id);
		sb.append(", unitCode=");
		sb.append(unitCode);
		sb.append(", unitName=");
		sb.append(unitName);
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
	public DmUnitGeneral toEntityModel() {
		DmUnitGeneralImpl dmUnitGeneralImpl = new DmUnitGeneralImpl();

		dmUnitGeneralImpl.setId(id);

		if (unitCode == null) {
			dmUnitGeneralImpl.setUnitCode(StringPool.BLANK);
		}
		else {
			dmUnitGeneralImpl.setUnitCode(unitCode);
		}

		if (unitName == null) {
			dmUnitGeneralImpl.setUnitName(StringPool.BLANK);
		}
		else {
			dmUnitGeneralImpl.setUnitName(unitName);
		}

		dmUnitGeneralImpl.setIsDelete(isDelete);
		dmUnitGeneralImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmUnitGeneralImpl.setModifiedDate(null);
		}
		else {
			dmUnitGeneralImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmUnitGeneralImpl.setRequestedDate(null);
		}
		else {
			dmUnitGeneralImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmUnitGeneralImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmUnitGeneralImpl.setSyncVersion(syncVersion);
		}

		dmUnitGeneralImpl.resetOriginalValues();

		return dmUnitGeneralImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		unitCode = objectInput.readUTF();
		unitName = objectInput.readUTF();
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

		if (unitCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(unitCode);
		}

		if (unitName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(unitName);
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
	public String unitCode;
	public String unitName;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}