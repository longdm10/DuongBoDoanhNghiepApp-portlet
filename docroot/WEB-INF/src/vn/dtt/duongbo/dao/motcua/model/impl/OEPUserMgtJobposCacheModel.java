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

package vn.dtt.duongbo.dao.motcua.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.duongbo.dao.motcua.model.OEPUserMgtJobpos;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OEPUserMgtJobpos in entity cache.
 *
 * @author win_64
 * @see OEPUserMgtJobpos
 * @generated
 */
public class OEPUserMgtJobposCacheModel implements CacheModel<OEPUserMgtJobpos>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{jobPosId=");
		sb.append(jobPosId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", title=");
		sb.append(title);
		sb.append(", positionCatNo=");
		sb.append(positionCatNo);
		sb.append(", workingUnitId=");
		sb.append(workingUnitId);
		sb.append(", leader=");
		sb.append(leader);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OEPUserMgtJobpos toEntityModel() {
		OEPUserMgtJobposImpl oepUserMgtJobposImpl = new OEPUserMgtJobposImpl();

		oepUserMgtJobposImpl.setJobPosId(jobPosId);
		oepUserMgtJobposImpl.setUserId(userId);
		oepUserMgtJobposImpl.setGroupId(groupId);
		oepUserMgtJobposImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			oepUserMgtJobposImpl.setCreateDate(null);
		}
		else {
			oepUserMgtJobposImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			oepUserMgtJobposImpl.setModifiedDate(null);
		}
		else {
			oepUserMgtJobposImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (title == null) {
			oepUserMgtJobposImpl.setTitle(StringPool.BLANK);
		}
		else {
			oepUserMgtJobposImpl.setTitle(title);
		}

		if (positionCatNo == null) {
			oepUserMgtJobposImpl.setPositionCatNo(StringPool.BLANK);
		}
		else {
			oepUserMgtJobposImpl.setPositionCatNo(positionCatNo);
		}

		oepUserMgtJobposImpl.setWorkingUnitId(workingUnitId);
		oepUserMgtJobposImpl.setLeader(leader);

		oepUserMgtJobposImpl.resetOriginalValues();

		return oepUserMgtJobposImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		jobPosId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		title = objectInput.readUTF();
		positionCatNo = objectInput.readUTF();
		workingUnitId = objectInput.readLong();
		leader = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(jobPosId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (positionCatNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(positionCatNo);
		}

		objectOutput.writeLong(workingUnitId);
		objectOutput.writeInt(leader);
	}

	public long jobPosId;
	public long userId;
	public long groupId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public String title;
	public String positionCatNo;
	public long workingUnitId;
	public int leader;
}