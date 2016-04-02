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

import vn.dtt.duongbien.dao.vrcb.model.TempCrewDetails;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TempCrewDetails in entity cache.
 *
 * @author longdm
 * @see TempCrewDetails
 * @generated
 */
public class TempCrewDetailsCacheModel implements CacheModel<TempCrewDetails>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(id);
		sb.append(", requestCode=");
		sb.append(requestCode);
		sb.append(", crewcode=");
		sb.append(crewcode);
		sb.append(", familyName=");
		sb.append(familyName);
		sb.append(", givenName=");
		sb.append(givenName);
		sb.append(", rankCode=");
		sb.append(rankCode);
		sb.append(", nationality=");
		sb.append(nationality);
		sb.append(", dateOfBirth=");
		sb.append(dateOfBirth);
		sb.append(", placeOfBirth=");
		sb.append(placeOfBirth);
		sb.append(", passportNumber=");
		sb.append(passportNumber);
		sb.append(", passportTypeCode=");
		sb.append(passportTypeCode);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TempCrewDetails toEntityModel() {
		TempCrewDetailsImpl tempCrewDetailsImpl = new TempCrewDetailsImpl();

		tempCrewDetailsImpl.setId(id);

		if (requestCode == null) {
			tempCrewDetailsImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			tempCrewDetailsImpl.setRequestCode(requestCode);
		}

		if (crewcode == null) {
			tempCrewDetailsImpl.setCrewcode(StringPool.BLANK);
		}
		else {
			tempCrewDetailsImpl.setCrewcode(crewcode);
		}

		if (familyName == null) {
			tempCrewDetailsImpl.setFamilyName(StringPool.BLANK);
		}
		else {
			tempCrewDetailsImpl.setFamilyName(familyName);
		}

		if (givenName == null) {
			tempCrewDetailsImpl.setGivenName(StringPool.BLANK);
		}
		else {
			tempCrewDetailsImpl.setGivenName(givenName);
		}

		if (rankCode == null) {
			tempCrewDetailsImpl.setRankCode(StringPool.BLANK);
		}
		else {
			tempCrewDetailsImpl.setRankCode(rankCode);
		}

		if (nationality == null) {
			tempCrewDetailsImpl.setNationality(StringPool.BLANK);
		}
		else {
			tempCrewDetailsImpl.setNationality(nationality);
		}

		if (dateOfBirth == Long.MIN_VALUE) {
			tempCrewDetailsImpl.setDateOfBirth(null);
		}
		else {
			tempCrewDetailsImpl.setDateOfBirth(new Date(dateOfBirth));
		}

		if (placeOfBirth == null) {
			tempCrewDetailsImpl.setPlaceOfBirth(StringPool.BLANK);
		}
		else {
			tempCrewDetailsImpl.setPlaceOfBirth(placeOfBirth);
		}

		if (passportNumber == null) {
			tempCrewDetailsImpl.setPassportNumber(StringPool.BLANK);
		}
		else {
			tempCrewDetailsImpl.setPassportNumber(passportNumber);
		}

		if (passportTypeCode == null) {
			tempCrewDetailsImpl.setPassportTypeCode(StringPool.BLANK);
		}
		else {
			tempCrewDetailsImpl.setPassportTypeCode(passportTypeCode);
		}

		tempCrewDetailsImpl.resetOriginalValues();

		return tempCrewDetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		requestCode = objectInput.readUTF();
		crewcode = objectInput.readUTF();
		familyName = objectInput.readUTF();
		givenName = objectInput.readUTF();
		rankCode = objectInput.readUTF();
		nationality = objectInput.readUTF();
		dateOfBirth = objectInput.readLong();
		placeOfBirth = objectInput.readUTF();
		passportNumber = objectInput.readUTF();
		passportTypeCode = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (requestCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(requestCode);
		}

		if (crewcode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(crewcode);
		}

		if (familyName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(familyName);
		}

		if (givenName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(givenName);
		}

		if (rankCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(rankCode);
		}

		if (nationality == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nationality);
		}

		objectOutput.writeLong(dateOfBirth);

		if (placeOfBirth == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(placeOfBirth);
		}

		if (passportNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(passportNumber);
		}

		if (passportTypeCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(passportTypeCode);
		}
	}

	public long id;
	public String requestCode;
	public String crewcode;
	public String familyName;
	public String givenName;
	public String rankCode;
	public String nationality;
	public long dateOfBirth;
	public String placeOfBirth;
	public String passportNumber;
	public String passportTypeCode;
}