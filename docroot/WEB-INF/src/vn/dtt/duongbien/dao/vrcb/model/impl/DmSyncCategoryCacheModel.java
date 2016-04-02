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

import vn.dtt.duongbien.dao.vrcb.model.DmSyncCategory;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DmSyncCategory in entity cache.
 *
 * @author longdm
 * @see DmSyncCategory
 * @generated
 */
public class DmSyncCategoryCacheModel implements CacheModel<DmSyncCategory>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(id);
		sb.append(", categoryId=");
		sb.append(categoryId);
		sb.append(", categoryDescription=");
		sb.append(categoryDescription);
		sb.append(", modifiedUser=");
		sb.append(modifiedUser);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DmSyncCategory toEntityModel() {
		DmSyncCategoryImpl dmSyncCategoryImpl = new DmSyncCategoryImpl();

		dmSyncCategoryImpl.setId(id);

		if (categoryId == null) {
			dmSyncCategoryImpl.setCategoryId(StringPool.BLANK);
		}
		else {
			dmSyncCategoryImpl.setCategoryId(categoryId);
		}

		if (categoryDescription == null) {
			dmSyncCategoryImpl.setCategoryDescription(StringPool.BLANK);
		}
		else {
			dmSyncCategoryImpl.setCategoryDescription(categoryDescription);
		}

		if (modifiedUser == null) {
			dmSyncCategoryImpl.setModifiedUser(StringPool.BLANK);
		}
		else {
			dmSyncCategoryImpl.setModifiedUser(modifiedUser);
		}

		if (modifiedDate == Long.MIN_VALUE) {
			dmSyncCategoryImpl.setModifiedDate(null);
		}
		else {
			dmSyncCategoryImpl.setModifiedDate(new Date(modifiedDate));
		}

		dmSyncCategoryImpl.resetOriginalValues();

		return dmSyncCategoryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		categoryId = objectInput.readUTF();
		categoryDescription = objectInput.readUTF();
		modifiedUser = objectInput.readUTF();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (categoryId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(categoryId);
		}

		if (categoryDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(categoryDescription);
		}

		if (modifiedUser == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(modifiedUser);
		}

		objectOutput.writeLong(modifiedDate);
	}

	public long id;
	public String categoryId;
	public String categoryDescription;
	public String modifiedUser;
	public long modifiedDate;
}