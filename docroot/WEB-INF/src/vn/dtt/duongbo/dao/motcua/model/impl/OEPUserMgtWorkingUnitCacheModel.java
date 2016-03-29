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

import vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OEPUserMgtWorkingUnit in entity cache.
 *
 * @author win_64
 * @see OEPUserMgtWorkingUnit
 * @generated
 */
public class OEPUserMgtWorkingUnitCacheModel implements CacheModel<OEPUserMgtWorkingUnit>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(47);

		sb.append("{workingUnitId=");
		sb.append(workingUnitId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", organizationId=");
		sb.append(organizationId);
		sb.append(", govAgentId=");
		sb.append(govAgentId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", enname=");
		sb.append(enname);
		sb.append(", isRoot=");
		sb.append(isRoot);
		sb.append(", parentWorkingUnitId=");
		sb.append(parentWorkingUnitId);
		sb.append(", address=");
		sb.append(address);
		sb.append(", cityNo=");
		sb.append(cityNo);
		sb.append(", cityName=");
		sb.append(cityName);
		sb.append(", districtNo=");
		sb.append(districtNo);
		sb.append(", districtName=");
		sb.append(districtName);
		sb.append(", wardNo=");
		sb.append(wardNo);
		sb.append(", wardName=");
		sb.append(wardName);
		sb.append(", gpsPosition=");
		sb.append(gpsPosition);
		sb.append(", telNo=");
		sb.append(telNo);
		sb.append(", fax=");
		sb.append(fax);
		sb.append(", email=");
		sb.append(email);
		sb.append(", website=");
		sb.append(website);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OEPUserMgtWorkingUnit toEntityModel() {
		OEPUserMgtWorkingUnitImpl oepUserMgtWorkingUnitImpl = new OEPUserMgtWorkingUnitImpl();

		oepUserMgtWorkingUnitImpl.setWorkingUnitId(workingUnitId);
		oepUserMgtWorkingUnitImpl.setUserId(userId);
		oepUserMgtWorkingUnitImpl.setGroupId(groupId);

		if (createDate == Long.MIN_VALUE) {
			oepUserMgtWorkingUnitImpl.setCreateDate(null);
		}
		else {
			oepUserMgtWorkingUnitImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			oepUserMgtWorkingUnitImpl.setModifiedDate(null);
		}
		else {
			oepUserMgtWorkingUnitImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (organizationId == null) {
			oepUserMgtWorkingUnitImpl.setOrganizationId(StringPool.BLANK);
		}
		else {
			oepUserMgtWorkingUnitImpl.setOrganizationId(organizationId);
		}

		if (govAgentId == null) {
			oepUserMgtWorkingUnitImpl.setGovAgentId(StringPool.BLANK);
		}
		else {
			oepUserMgtWorkingUnitImpl.setGovAgentId(govAgentId);
		}

		if (name == null) {
			oepUserMgtWorkingUnitImpl.setName(StringPool.BLANK);
		}
		else {
			oepUserMgtWorkingUnitImpl.setName(name);
		}

		if (enname == null) {
			oepUserMgtWorkingUnitImpl.setEnname(StringPool.BLANK);
		}
		else {
			oepUserMgtWorkingUnitImpl.setEnname(enname);
		}

		oepUserMgtWorkingUnitImpl.setIsRoot(isRoot);
		oepUserMgtWorkingUnitImpl.setParentWorkingUnitId(parentWorkingUnitId);

		if (address == null) {
			oepUserMgtWorkingUnitImpl.setAddress(StringPool.BLANK);
		}
		else {
			oepUserMgtWorkingUnitImpl.setAddress(address);
		}

		if (cityNo == null) {
			oepUserMgtWorkingUnitImpl.setCityNo(StringPool.BLANK);
		}
		else {
			oepUserMgtWorkingUnitImpl.setCityNo(cityNo);
		}

		if (cityName == null) {
			oepUserMgtWorkingUnitImpl.setCityName(StringPool.BLANK);
		}
		else {
			oepUserMgtWorkingUnitImpl.setCityName(cityName);
		}

		if (districtNo == null) {
			oepUserMgtWorkingUnitImpl.setDistrictNo(StringPool.BLANK);
		}
		else {
			oepUserMgtWorkingUnitImpl.setDistrictNo(districtNo);
		}

		if (districtName == null) {
			oepUserMgtWorkingUnitImpl.setDistrictName(StringPool.BLANK);
		}
		else {
			oepUserMgtWorkingUnitImpl.setDistrictName(districtName);
		}

		if (wardNo == null) {
			oepUserMgtWorkingUnitImpl.setWardNo(StringPool.BLANK);
		}
		else {
			oepUserMgtWorkingUnitImpl.setWardNo(wardNo);
		}

		if (wardName == null) {
			oepUserMgtWorkingUnitImpl.setWardName(StringPool.BLANK);
		}
		else {
			oepUserMgtWorkingUnitImpl.setWardName(wardName);
		}

		if (gpsPosition == null) {
			oepUserMgtWorkingUnitImpl.setGpsPosition(StringPool.BLANK);
		}
		else {
			oepUserMgtWorkingUnitImpl.setGpsPosition(gpsPosition);
		}

		if (telNo == null) {
			oepUserMgtWorkingUnitImpl.setTelNo(StringPool.BLANK);
		}
		else {
			oepUserMgtWorkingUnitImpl.setTelNo(telNo);
		}

		if (fax == null) {
			oepUserMgtWorkingUnitImpl.setFax(StringPool.BLANK);
		}
		else {
			oepUserMgtWorkingUnitImpl.setFax(fax);
		}

		if (email == null) {
			oepUserMgtWorkingUnitImpl.setEmail(StringPool.BLANK);
		}
		else {
			oepUserMgtWorkingUnitImpl.setEmail(email);
		}

		if (website == null) {
			oepUserMgtWorkingUnitImpl.setWebsite(StringPool.BLANK);
		}
		else {
			oepUserMgtWorkingUnitImpl.setWebsite(website);
		}

		oepUserMgtWorkingUnitImpl.resetOriginalValues();

		return oepUserMgtWorkingUnitImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		workingUnitId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		organizationId = objectInput.readUTF();
		govAgentId = objectInput.readUTF();
		name = objectInput.readUTF();
		enname = objectInput.readUTF();
		isRoot = objectInput.readInt();
		parentWorkingUnitId = objectInput.readLong();
		address = objectInput.readUTF();
		cityNo = objectInput.readUTF();
		cityName = objectInput.readUTF();
		districtNo = objectInput.readUTF();
		districtName = objectInput.readUTF();
		wardNo = objectInput.readUTF();
		wardName = objectInput.readUTF();
		gpsPosition = objectInput.readUTF();
		telNo = objectInput.readUTF();
		fax = objectInput.readUTF();
		email = objectInput.readUTF();
		website = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(workingUnitId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (organizationId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(organizationId);
		}

		if (govAgentId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(govAgentId);
		}

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (enname == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(enname);
		}

		objectOutput.writeInt(isRoot);
		objectOutput.writeLong(parentWorkingUnitId);

		if (address == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(address);
		}

		if (cityNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cityNo);
		}

		if (cityName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cityName);
		}

		if (districtNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(districtNo);
		}

		if (districtName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(districtName);
		}

		if (wardNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(wardNo);
		}

		if (wardName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(wardName);
		}

		if (gpsPosition == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(gpsPosition);
		}

		if (telNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(telNo);
		}

		if (fax == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fax);
		}

		if (email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (website == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(website);
		}
	}

	public long workingUnitId;
	public long userId;
	public long groupId;
	public long createDate;
	public long modifiedDate;
	public String organizationId;
	public String govAgentId;
	public String name;
	public String enname;
	public int isRoot;
	public long parentWorkingUnitId;
	public String address;
	public String cityNo;
	public String cityName;
	public String districtNo;
	public String districtName;
	public String wardNo;
	public String wardName;
	public String gpsPosition;
	public String telNo;
	public String fax;
	public String email;
	public String website;
}