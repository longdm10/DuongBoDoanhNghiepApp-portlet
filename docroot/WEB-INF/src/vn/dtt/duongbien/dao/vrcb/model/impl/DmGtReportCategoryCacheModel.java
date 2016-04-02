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

import vn.dtt.duongbien.dao.vrcb.model.DmGtReportCategory;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DmGtReportCategory in entity cache.
 *
 * @author longdm
 * @see DmGtReportCategory
 * @generated
 */
public class DmGtReportCategoryCacheModel implements CacheModel<DmGtReportCategory>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(id);
		sb.append(", category=");
		sb.append(category);
		sb.append(", categoryName=");
		sb.append(categoryName);
		sb.append(", categoryOrder=");
		sb.append(categoryOrder);
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
	public DmGtReportCategory toEntityModel() {
		DmGtReportCategoryImpl dmGtReportCategoryImpl = new DmGtReportCategoryImpl();

		dmGtReportCategoryImpl.setId(id);

		if (category == null) {
			dmGtReportCategoryImpl.setCategory(StringPool.BLANK);
		}
		else {
			dmGtReportCategoryImpl.setCategory(category);
		}

		if (categoryName == null) {
			dmGtReportCategoryImpl.setCategoryName(StringPool.BLANK);
		}
		else {
			dmGtReportCategoryImpl.setCategoryName(categoryName);
		}

		dmGtReportCategoryImpl.setCategoryOrder(categoryOrder);
		dmGtReportCategoryImpl.setIsDelete(isDelete);
		dmGtReportCategoryImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmGtReportCategoryImpl.setModifiedDate(null);
		}
		else {
			dmGtReportCategoryImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmGtReportCategoryImpl.setRequestedDate(null);
		}
		else {
			dmGtReportCategoryImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmGtReportCategoryImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmGtReportCategoryImpl.setSyncVersion(syncVersion);
		}

		dmGtReportCategoryImpl.resetOriginalValues();

		return dmGtReportCategoryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		category = objectInput.readUTF();
		categoryName = objectInput.readUTF();
		categoryOrder = objectInput.readInt();
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

		if (category == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(category);
		}

		if (categoryName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(categoryName);
		}

		objectOutput.writeInt(categoryOrder);
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
	public String category;
	public String categoryName;
	public int categoryOrder;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
}