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

import vn.dtt.duongbien.dao.vrcb.model.HistorySyncVersion;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing HistorySyncVersion in entity cache.
 *
 * @author longdm
 * @see HistorySyncVersion
 * @generated
 */
public class HistorySyncVersionCacheModel implements CacheModel<HistorySyncVersion>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(id);
		sb.append(", requestedDate=");
		sb.append(requestedDate);
		sb.append(", timeofPublish=");
		sb.append(timeofPublish);
		sb.append(", categoryID=");
		sb.append(categoryID);
		sb.append(", syncUnit=");
		sb.append(syncUnit);
		sb.append(", syncUser=");
		sb.append(syncUser);
		sb.append(", syncVersion=");
		sb.append(syncVersion);
		sb.append(", latestValueDate=");
		sb.append(latestValueDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public HistorySyncVersion toEntityModel() {
		HistorySyncVersionImpl historySyncVersionImpl = new HistorySyncVersionImpl();

		historySyncVersionImpl.setId(id);

		if (requestedDate == Long.MIN_VALUE) {
			historySyncVersionImpl.setRequestedDate(null);
		}
		else {
			historySyncVersionImpl.setRequestedDate(new Date(requestedDate));
		}

		if (timeofPublish == Long.MIN_VALUE) {
			historySyncVersionImpl.setTimeofPublish(null);
		}
		else {
			historySyncVersionImpl.setTimeofPublish(new Date(timeofPublish));
		}

		if (categoryID == null) {
			historySyncVersionImpl.setCategoryID(StringPool.BLANK);
		}
		else {
			historySyncVersionImpl.setCategoryID(categoryID);
		}

		if (syncUnit == null) {
			historySyncVersionImpl.setSyncUnit(StringPool.BLANK);
		}
		else {
			historySyncVersionImpl.setSyncUnit(syncUnit);
		}

		if (syncUser == null) {
			historySyncVersionImpl.setSyncUser(StringPool.BLANK);
		}
		else {
			historySyncVersionImpl.setSyncUser(syncUser);
		}

		if (syncVersion == null) {
			historySyncVersionImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			historySyncVersionImpl.setSyncVersion(syncVersion);
		}

		if (latestValueDate == Long.MIN_VALUE) {
			historySyncVersionImpl.setLatestValueDate(null);
		}
		else {
			historySyncVersionImpl.setLatestValueDate(new Date(latestValueDate));
		}

		historySyncVersionImpl.resetOriginalValues();

		return historySyncVersionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		requestedDate = objectInput.readLong();
		timeofPublish = objectInput.readLong();
		categoryID = objectInput.readUTF();
		syncUnit = objectInput.readUTF();
		syncUser = objectInput.readUTF();
		syncVersion = objectInput.readUTF();
		latestValueDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(requestedDate);
		objectOutput.writeLong(timeofPublish);

		if (categoryID == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(categoryID);
		}

		if (syncUnit == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(syncUnit);
		}

		if (syncUser == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(syncUser);
		}

		if (syncVersion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(syncVersion);
		}

		objectOutput.writeLong(latestValueDate);
	}

	public long id;
	public long requestedDate;
	public long timeofPublish;
	public String categoryID;
	public String syncUnit;
	public String syncUser;
	public String syncVersion;
	public long latestValueDate;
}