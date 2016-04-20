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

import vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OEPUserMgtEmployee in entity cache.
 *
 * @author win_64
 * @see OEPUserMgtEmployee
 * @generated
 */
public class OEPUserMgtEmployeeCacheModel implements CacheModel<OEPUserMgtEmployee>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{employeeId=");
		sb.append(employeeId);
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
		sb.append(", mappingUserId=");
		sb.append(mappingUserId);
		sb.append(", workingUnitId=");
		sb.append(workingUnitId);
		sb.append(", mainJobPosId=");
		sb.append(mainJobPosId);
		sb.append(", employeeNo=");
		sb.append(employeeNo);
		sb.append(", fullName=");
		sb.append(fullName);
		sb.append(", officeTel=");
		sb.append(officeTel);
		sb.append(", homeTel=");
		sb.append(homeTel);
		sb.append(", mobile=");
		sb.append(mobile);
		sb.append(", email=");
		sb.append(email);
		sb.append(", typeOfEmployee=");
		sb.append(typeOfEmployee);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OEPUserMgtEmployee toEntityModel() {
		OEPUserMgtEmployeeImpl oepUserMgtEmployeeImpl = new OEPUserMgtEmployeeImpl();

		oepUserMgtEmployeeImpl.setEmployeeId(employeeId);
		oepUserMgtEmployeeImpl.setUserId(userId);
		oepUserMgtEmployeeImpl.setGroupId(groupId);
		oepUserMgtEmployeeImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			oepUserMgtEmployeeImpl.setCreateDate(null);
		}
		else {
			oepUserMgtEmployeeImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			oepUserMgtEmployeeImpl.setModifiedDate(null);
		}
		else {
			oepUserMgtEmployeeImpl.setModifiedDate(new Date(modifiedDate));
		}

		oepUserMgtEmployeeImpl.setMappingUserId(mappingUserId);
		oepUserMgtEmployeeImpl.setWorkingUnitId(workingUnitId);
		oepUserMgtEmployeeImpl.setMainJobPosId(mainJobPosId);

		if (employeeNo == null) {
			oepUserMgtEmployeeImpl.setEmployeeNo(StringPool.BLANK);
		}
		else {
			oepUserMgtEmployeeImpl.setEmployeeNo(employeeNo);
		}

		if (fullName == null) {
			oepUserMgtEmployeeImpl.setFullName(StringPool.BLANK);
		}
		else {
			oepUserMgtEmployeeImpl.setFullName(fullName);
		}

		if (officeTel == null) {
			oepUserMgtEmployeeImpl.setOfficeTel(StringPool.BLANK);
		}
		else {
			oepUserMgtEmployeeImpl.setOfficeTel(officeTel);
		}

		if (homeTel == null) {
			oepUserMgtEmployeeImpl.setHomeTel(StringPool.BLANK);
		}
		else {
			oepUserMgtEmployeeImpl.setHomeTel(homeTel);
		}

		if (mobile == null) {
			oepUserMgtEmployeeImpl.setMobile(StringPool.BLANK);
		}
		else {
			oepUserMgtEmployeeImpl.setMobile(mobile);
		}

		if (email == null) {
			oepUserMgtEmployeeImpl.setEmail(StringPool.BLANK);
		}
		else {
			oepUserMgtEmployeeImpl.setEmail(email);
		}

		if (typeOfEmployee == null) {
			oepUserMgtEmployeeImpl.setTypeOfEmployee(StringPool.BLANK);
		}
		else {
			oepUserMgtEmployeeImpl.setTypeOfEmployee(typeOfEmployee);
		}

		oepUserMgtEmployeeImpl.resetOriginalValues();

		return oepUserMgtEmployeeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		employeeId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		mappingUserId = objectInput.readLong();
		workingUnitId = objectInput.readLong();
		mainJobPosId = objectInput.readLong();
		employeeNo = objectInput.readUTF();
		fullName = objectInput.readUTF();
		officeTel = objectInput.readUTF();
		homeTel = objectInput.readUTF();
		mobile = objectInput.readUTF();
		email = objectInput.readUTF();
		typeOfEmployee = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(employeeId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(mappingUserId);
		objectOutput.writeLong(workingUnitId);
		objectOutput.writeLong(mainJobPosId);

		if (employeeNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(employeeNo);
		}

		if (fullName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fullName);
		}

		if (officeTel == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(officeTel);
		}

		if (homeTel == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(homeTel);
		}

		if (mobile == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mobile);
		}

		if (email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (typeOfEmployee == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(typeOfEmployee);
		}
	}

	public long employeeId;
	public long userId;
	public long groupId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public long mappingUserId;
	public long workingUnitId;
	public long mainJobPosId;
	public String employeeNo;
	public String fullName;
	public String officeTel;
	public String homeTel;
	public String mobile;
	public String email;
	public String typeOfEmployee;
}