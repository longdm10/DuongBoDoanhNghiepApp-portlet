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

import vn.dtt.duongbien.dao.vrcb.model.DmEnterrise;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DmEnterrise in entity cache.
 *
 * @author longdm
 * @see DmEnterrise
 * @generated
 */
public class DmEnterriseCacheModel implements CacheModel<DmEnterrise>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(45);

		sb.append("{id=");
		sb.append(id);
		sb.append(", enterpriseCode=");
		sb.append(enterpriseCode);
		sb.append(", enterpriseTaxCode=");
		sb.append(enterpriseTaxCode);
		sb.append(", enterpriseName=");
		sb.append(enterpriseName);
		sb.append(", enterpriseShortName=");
		sb.append(enterpriseShortName);
		sb.append(", enterpriseForeignName=");
		sb.append(enterpriseForeignName);
		sb.append(", enterprisePerson=");
		sb.append(enterprisePerson);
		sb.append(", enterpriseHOAddress=");
		sb.append(enterpriseHOAddress);
		sb.append(", stateCode=");
		sb.append(stateCode);
		sb.append(", cityCode=");
		sb.append(cityCode);
		sb.append(", districtCode=");
		sb.append(districtCode);
		sb.append(", wardCode=");
		sb.append(wardCode);
		sb.append(", telephoneNo=");
		sb.append(telephoneNo);
		sb.append(", registrationCode=");
		sb.append(registrationCode);
		sb.append(", registrationAddress=");
		sb.append(registrationAddress);
		sb.append(", registrationDate=");
		sb.append(registrationDate);
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
		sb.append(", modifiedUser=");
		sb.append(modifiedUser);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DmEnterrise toEntityModel() {
		DmEnterriseImpl dmEnterriseImpl = new DmEnterriseImpl();

		dmEnterriseImpl.setId(id);

		if (enterpriseCode == null) {
			dmEnterriseImpl.setEnterpriseCode(StringPool.BLANK);
		}
		else {
			dmEnterriseImpl.setEnterpriseCode(enterpriseCode);
		}

		if (enterpriseTaxCode == null) {
			dmEnterriseImpl.setEnterpriseTaxCode(StringPool.BLANK);
		}
		else {
			dmEnterriseImpl.setEnterpriseTaxCode(enterpriseTaxCode);
		}

		if (enterpriseName == null) {
			dmEnterriseImpl.setEnterpriseName(StringPool.BLANK);
		}
		else {
			dmEnterriseImpl.setEnterpriseName(enterpriseName);
		}

		if (enterpriseShortName == null) {
			dmEnterriseImpl.setEnterpriseShortName(StringPool.BLANK);
		}
		else {
			dmEnterriseImpl.setEnterpriseShortName(enterpriseShortName);
		}

		if (enterpriseForeignName == null) {
			dmEnterriseImpl.setEnterpriseForeignName(StringPool.BLANK);
		}
		else {
			dmEnterriseImpl.setEnterpriseForeignName(enterpriseForeignName);
		}

		if (enterprisePerson == null) {
			dmEnterriseImpl.setEnterprisePerson(StringPool.BLANK);
		}
		else {
			dmEnterriseImpl.setEnterprisePerson(enterprisePerson);
		}

		if (enterpriseHOAddress == null) {
			dmEnterriseImpl.setEnterpriseHOAddress(StringPool.BLANK);
		}
		else {
			dmEnterriseImpl.setEnterpriseHOAddress(enterpriseHOAddress);
		}

		if (stateCode == null) {
			dmEnterriseImpl.setStateCode(StringPool.BLANK);
		}
		else {
			dmEnterriseImpl.setStateCode(stateCode);
		}

		if (cityCode == null) {
			dmEnterriseImpl.setCityCode(StringPool.BLANK);
		}
		else {
			dmEnterriseImpl.setCityCode(cityCode);
		}

		if (districtCode == null) {
			dmEnterriseImpl.setDistrictCode(StringPool.BLANK);
		}
		else {
			dmEnterriseImpl.setDistrictCode(districtCode);
		}

		if (wardCode == null) {
			dmEnterriseImpl.setWardCode(StringPool.BLANK);
		}
		else {
			dmEnterriseImpl.setWardCode(wardCode);
		}

		if (telephoneNo == null) {
			dmEnterriseImpl.setTelephoneNo(StringPool.BLANK);
		}
		else {
			dmEnterriseImpl.setTelephoneNo(telephoneNo);
		}

		if (registrationCode == null) {
			dmEnterriseImpl.setRegistrationCode(StringPool.BLANK);
		}
		else {
			dmEnterriseImpl.setRegistrationCode(registrationCode);
		}

		if (registrationAddress == null) {
			dmEnterriseImpl.setRegistrationAddress(StringPool.BLANK);
		}
		else {
			dmEnterriseImpl.setRegistrationAddress(registrationAddress);
		}

		if (registrationDate == Long.MIN_VALUE) {
			dmEnterriseImpl.setRegistrationDate(null);
		}
		else {
			dmEnterriseImpl.setRegistrationDate(new Date(registrationDate));
		}

		dmEnterriseImpl.setIsDelete(isDelete);
		dmEnterriseImpl.setMarkedAsDelete(markedAsDelete);

		if (modifiedDate == Long.MIN_VALUE) {
			dmEnterriseImpl.setModifiedDate(null);
		}
		else {
			dmEnterriseImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestedDate == Long.MIN_VALUE) {
			dmEnterriseImpl.setRequestedDate(null);
		}
		else {
			dmEnterriseImpl.setRequestedDate(new Date(requestedDate));
		}

		if (syncVersion == null) {
			dmEnterriseImpl.setSyncVersion(StringPool.BLANK);
		}
		else {
			dmEnterriseImpl.setSyncVersion(syncVersion);
		}

		if (modifiedUser == null) {
			dmEnterriseImpl.setModifiedUser(StringPool.BLANK);
		}
		else {
			dmEnterriseImpl.setModifiedUser(modifiedUser);
		}

		dmEnterriseImpl.resetOriginalValues();

		return dmEnterriseImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		enterpriseCode = objectInput.readUTF();
		enterpriseTaxCode = objectInput.readUTF();
		enterpriseName = objectInput.readUTF();
		enterpriseShortName = objectInput.readUTF();
		enterpriseForeignName = objectInput.readUTF();
		enterprisePerson = objectInput.readUTF();
		enterpriseHOAddress = objectInput.readUTF();
		stateCode = objectInput.readUTF();
		cityCode = objectInput.readUTF();
		districtCode = objectInput.readUTF();
		wardCode = objectInput.readUTF();
		telephoneNo = objectInput.readUTF();
		registrationCode = objectInput.readUTF();
		registrationAddress = objectInput.readUTF();
		registrationDate = objectInput.readLong();
		isDelete = objectInput.readInt();
		markedAsDelete = objectInput.readInt();
		modifiedDate = objectInput.readLong();
		requestedDate = objectInput.readLong();
		syncVersion = objectInput.readUTF();
		modifiedUser = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(id);

		if (enterpriseCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(enterpriseCode);
		}

		if (enterpriseTaxCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(enterpriseTaxCode);
		}

		if (enterpriseName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(enterpriseName);
		}

		if (enterpriseShortName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(enterpriseShortName);
		}

		if (enterpriseForeignName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(enterpriseForeignName);
		}

		if (enterprisePerson == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(enterprisePerson);
		}

		if (enterpriseHOAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(enterpriseHOAddress);
		}

		if (stateCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(stateCode);
		}

		if (cityCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cityCode);
		}

		if (districtCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(districtCode);
		}

		if (wardCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(wardCode);
		}

		if (telephoneNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(telephoneNo);
		}

		if (registrationCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(registrationCode);
		}

		if (registrationAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(registrationAddress);
		}

		objectOutput.writeLong(registrationDate);
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

		if (modifiedUser == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(modifiedUser);
		}
	}

	public int id;
	public String enterpriseCode;
	public String enterpriseTaxCode;
	public String enterpriseName;
	public String enterpriseShortName;
	public String enterpriseForeignName;
	public String enterprisePerson;
	public String enterpriseHOAddress;
	public String stateCode;
	public String cityCode;
	public String districtCode;
	public String wardCode;
	public String telephoneNo;
	public String registrationCode;
	public String registrationAddress;
	public long registrationDate;
	public int isDelete;
	public int markedAsDelete;
	public long modifiedDate;
	public long requestedDate;
	public String syncVersion;
	public String modifiedUser;
}