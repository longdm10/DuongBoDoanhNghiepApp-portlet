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

import vn.dtt.duongbien.dao.vrcb.model.CrewList;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CrewList in entity cache.
 *
 * @author longdm
 * @see CrewList
 * @generated
 */
public class CrewListCacheModel implements CacheModel<CrewList>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{id=");
		sb.append(id);
		sb.append(", crewCode=");
		sb.append(crewCode);
		sb.append(", documentNo=");
		sb.append(documentNo);
		sb.append(", stateCode=");
		sb.append(stateCode);
		sb.append(", birthDay=");
		sb.append(birthDay);
		sb.append(", birthPlace=");
		sb.append(birthPlace);
		sb.append(", familyName=");
		sb.append(familyName);
		sb.append(", fullName=");
		sb.append(fullName);
		sb.append(", givenName=");
		sb.append(givenName);
		sb.append(", passportNumber=");
		sb.append(passportNumber);
		sb.append(", passportType=");
		sb.append(passportType);
		sb.append(", rankCode=");
		sb.append(rankCode);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CrewList toEntityModel() {
		CrewListImpl crewListImpl = new CrewListImpl();

		crewListImpl.setId(id);

		if (crewCode == null) {
			crewListImpl.setCrewCode(StringPool.BLANK);
		}
		else {
			crewListImpl.setCrewCode(crewCode);
		}

		if (documentNo == null) {
			crewListImpl.setDocumentNo(StringPool.BLANK);
		}
		else {
			crewListImpl.setDocumentNo(documentNo);
		}

		if (stateCode == null) {
			crewListImpl.setStateCode(StringPool.BLANK);
		}
		else {
			crewListImpl.setStateCode(stateCode);
		}

		if (birthDay == Long.MIN_VALUE) {
			crewListImpl.setBirthDay(null);
		}
		else {
			crewListImpl.setBirthDay(new Date(birthDay));
		}

		if (birthPlace == null) {
			crewListImpl.setBirthPlace(StringPool.BLANK);
		}
		else {
			crewListImpl.setBirthPlace(birthPlace);
		}

		if (familyName == null) {
			crewListImpl.setFamilyName(StringPool.BLANK);
		}
		else {
			crewListImpl.setFamilyName(familyName);
		}

		if (fullName == null) {
			crewListImpl.setFullName(StringPool.BLANK);
		}
		else {
			crewListImpl.setFullName(fullName);
		}

		if (givenName == null) {
			crewListImpl.setGivenName(StringPool.BLANK);
		}
		else {
			crewListImpl.setGivenName(givenName);
		}

		if (passportNumber == null) {
			crewListImpl.setPassportNumber(StringPool.BLANK);
		}
		else {
			crewListImpl.setPassportNumber(passportNumber);
		}

		if (passportType == null) {
			crewListImpl.setPassportType(StringPool.BLANK);
		}
		else {
			crewListImpl.setPassportType(passportType);
		}

		if (rankCode == null) {
			crewListImpl.setRankCode(StringPool.BLANK);
		}
		else {
			crewListImpl.setRankCode(rankCode);
		}

		if (createDate == Long.MIN_VALUE) {
			crewListImpl.setCreateDate(null);
		}
		else {
			crewListImpl.setCreateDate(new Date(createDate));
		}

		if (modifyDate == Long.MIN_VALUE) {
			crewListImpl.setModifyDate(null);
		}
		else {
			crewListImpl.setModifyDate(new Date(modifyDate));
		}

		crewListImpl.resetOriginalValues();

		return crewListImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		crewCode = objectInput.readUTF();
		documentNo = objectInput.readUTF();
		stateCode = objectInput.readUTF();
		birthDay = objectInput.readLong();
		birthPlace = objectInput.readUTF();
		familyName = objectInput.readUTF();
		fullName = objectInput.readUTF();
		givenName = objectInput.readUTF();
		passportNumber = objectInput.readUTF();
		passportType = objectInput.readUTF();
		rankCode = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifyDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (crewCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(crewCode);
		}

		if (documentNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(documentNo);
		}

		if (stateCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(stateCode);
		}

		objectOutput.writeLong(birthDay);

		if (birthPlace == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(birthPlace);
		}

		if (familyName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(familyName);
		}

		if (fullName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fullName);
		}

		if (givenName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(givenName);
		}

		if (passportNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(passportNumber);
		}

		if (passportType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(passportType);
		}

		if (rankCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(rankCode);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifyDate);
	}

	public long id;
	public String crewCode;
	public String documentNo;
	public String stateCode;
	public long birthDay;
	public String birthPlace;
	public String familyName;
	public String fullName;
	public String givenName;
	public String passportNumber;
	public String passportType;
	public String rankCode;
	public long createDate;
	public long modifyDate;
}