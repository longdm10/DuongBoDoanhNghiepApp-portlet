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

import vn.dtt.duongbien.dao.vrcb.model.TempHealthCrewPassengerList;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TempHealthCrewPassengerList in entity cache.
 *
 * @author longdm
 * @see TempHealthCrewPassengerList
 * @generated
 */
public class TempHealthCrewPassengerListCacheModel implements CacheModel<TempHealthCrewPassengerList>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", requestCode=");
		sb.append(requestCode);
		sb.append(", healthCrewPassengerCode=");
		sb.append(healthCrewPassengerCode);
		sb.append(", passengerOrCrewCode=");
		sb.append(passengerOrCrewCode);
		sb.append(", passengerOrCrewName=");
		sb.append(passengerOrCrewName);
		sb.append(", classOrRating=");
		sb.append(classOrRating);
		sb.append(", stateVisitedCode=");
		sb.append(stateVisitedCode);
		sb.append(", portVisitedCode=");
		sb.append(portVisitedCode);
		sb.append(", fromDate=");
		sb.append(fromDate);
		sb.append(", toDate=");
		sb.append(toDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TempHealthCrewPassengerList toEntityModel() {
		TempHealthCrewPassengerListImpl tempHealthCrewPassengerListImpl = new TempHealthCrewPassengerListImpl();

		tempHealthCrewPassengerListImpl.setId(id);

		if (requestCode == null) {
			tempHealthCrewPassengerListImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			tempHealthCrewPassengerListImpl.setRequestCode(requestCode);
		}

		if (healthCrewPassengerCode == null) {
			tempHealthCrewPassengerListImpl.setHealthCrewPassengerCode(StringPool.BLANK);
		}
		else {
			tempHealthCrewPassengerListImpl.setHealthCrewPassengerCode(healthCrewPassengerCode);
		}

		if (passengerOrCrewCode == null) {
			tempHealthCrewPassengerListImpl.setPassengerOrCrewCode(StringPool.BLANK);
		}
		else {
			tempHealthCrewPassengerListImpl.setPassengerOrCrewCode(passengerOrCrewCode);
		}

		if (passengerOrCrewName == null) {
			tempHealthCrewPassengerListImpl.setPassengerOrCrewName(StringPool.BLANK);
		}
		else {
			tempHealthCrewPassengerListImpl.setPassengerOrCrewName(passengerOrCrewName);
		}

		tempHealthCrewPassengerListImpl.setClassOrRating(classOrRating);

		if (stateVisitedCode == null) {
			tempHealthCrewPassengerListImpl.setStateVisitedCode(StringPool.BLANK);
		}
		else {
			tempHealthCrewPassengerListImpl.setStateVisitedCode(stateVisitedCode);
		}

		if (portVisitedCode == null) {
			tempHealthCrewPassengerListImpl.setPortVisitedCode(StringPool.BLANK);
		}
		else {
			tempHealthCrewPassengerListImpl.setPortVisitedCode(portVisitedCode);
		}

		if (fromDate == Long.MIN_VALUE) {
			tempHealthCrewPassengerListImpl.setFromDate(null);
		}
		else {
			tempHealthCrewPassengerListImpl.setFromDate(new Date(fromDate));
		}

		if (toDate == Long.MIN_VALUE) {
			tempHealthCrewPassengerListImpl.setToDate(null);
		}
		else {
			tempHealthCrewPassengerListImpl.setToDate(new Date(toDate));
		}

		tempHealthCrewPassengerListImpl.resetOriginalValues();

		return tempHealthCrewPassengerListImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		requestCode = objectInput.readUTF();
		healthCrewPassengerCode = objectInput.readUTF();
		passengerOrCrewCode = objectInput.readUTF();
		passengerOrCrewName = objectInput.readUTF();
		classOrRating = objectInput.readInt();
		stateVisitedCode = objectInput.readUTF();
		portVisitedCode = objectInput.readUTF();
		fromDate = objectInput.readLong();
		toDate = objectInput.readLong();
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

		if (healthCrewPassengerCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(healthCrewPassengerCode);
		}

		if (passengerOrCrewCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(passengerOrCrewCode);
		}

		if (passengerOrCrewName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(passengerOrCrewName);
		}

		objectOutput.writeInt(classOrRating);

		if (stateVisitedCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(stateVisitedCode);
		}

		if (portVisitedCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(portVisitedCode);
		}

		objectOutput.writeLong(fromDate);
		objectOutput.writeLong(toDate);
	}

	public long id;
	public String requestCode;
	public String healthCrewPassengerCode;
	public String passengerOrCrewCode;
	public String passengerOrCrewName;
	public int classOrRating;
	public String stateVisitedCode;
	public String portVisitedCode;
	public long fromDate;
	public long toDate;
}