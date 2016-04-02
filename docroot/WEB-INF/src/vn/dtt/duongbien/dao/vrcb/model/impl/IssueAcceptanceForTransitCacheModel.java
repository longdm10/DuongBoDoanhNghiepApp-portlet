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

import vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransit;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing IssueAcceptanceForTransit in entity cache.
 *
 * @author longdm
 * @see IssueAcceptanceForTransit
 * @generated
 */
public class IssueAcceptanceForTransitCacheModel implements CacheModel<IssueAcceptanceForTransit>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(57);

		sb.append("{id=");
		sb.append(id);
		sb.append(", requestCode=");
		sb.append(requestCode);
		sb.append(", numberAcceptanceForTransit=");
		sb.append(numberAcceptanceForTransit);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append(", documentYear=");
		sb.append(documentYear);
		sb.append(", nameOfShip=");
		sb.append(nameOfShip);
		sb.append(", flagStateOfShip=");
		sb.append(flagStateOfShip);
		sb.append(", callSign=");
		sb.append(callSign);
		sb.append(", nameOfMaster=");
		sb.append(nameOfMaster);
		sb.append(", loa=");
		sb.append(loa);
		sb.append(", unitLOA=");
		sb.append(unitLOA);
		sb.append(", breadth=");
		sb.append(breadth);
		sb.append(", unitBreadth=");
		sb.append(unitBreadth);
		sb.append(", grossTonnage=");
		sb.append(grossTonnage);
		sb.append(", grossTonnageUnit=");
		sb.append(grossTonnageUnit);
		sb.append(", netTonnage=");
		sb.append(netTonnage);
		sb.append(", netTonnageUnit=");
		sb.append(netTonnageUnit);
		sb.append(", dwt=");
		sb.append(dwt);
		sb.append(", unitDWT=");
		sb.append(unitDWT);
		sb.append(", shownDraftxF=");
		sb.append(shownDraftxF);
		sb.append(", unitShownDraftxF=");
		sb.append(unitShownDraftxF);
		sb.append(", shownDraftxA=");
		sb.append(shownDraftxA);
		sb.append(", unitShownDraftxA=");
		sb.append(unitShownDraftxA);
		sb.append(", clearanceHeight=");
		sb.append(clearanceHeight);
		sb.append(", unitClearanceHeight=");
		sb.append(unitClearanceHeight);
		sb.append(", permittedTransitFrom=");
		sb.append(permittedTransitFrom);
		sb.append(", permittedTransitTo=");
		sb.append(permittedTransitTo);
		sb.append(", timeOfDeparture=");
		sb.append(timeOfDeparture);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public IssueAcceptanceForTransit toEntityModel() {
		IssueAcceptanceForTransitImpl issueAcceptanceForTransitImpl = new IssueAcceptanceForTransitImpl();

		issueAcceptanceForTransitImpl.setId(id);

		if (requestCode == null) {
			issueAcceptanceForTransitImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			issueAcceptanceForTransitImpl.setRequestCode(requestCode);
		}

		if (numberAcceptanceForTransit == null) {
			issueAcceptanceForTransitImpl.setNumberAcceptanceForTransit(StringPool.BLANK);
		}
		else {
			issueAcceptanceForTransitImpl.setNumberAcceptanceForTransit(numberAcceptanceForTransit);
		}

		issueAcceptanceForTransitImpl.setDocumentName(documentName);
		issueAcceptanceForTransitImpl.setDocumentYear(documentYear);

		if (nameOfShip == null) {
			issueAcceptanceForTransitImpl.setNameOfShip(StringPool.BLANK);
		}
		else {
			issueAcceptanceForTransitImpl.setNameOfShip(nameOfShip);
		}

		if (flagStateOfShip == null) {
			issueAcceptanceForTransitImpl.setFlagStateOfShip(StringPool.BLANK);
		}
		else {
			issueAcceptanceForTransitImpl.setFlagStateOfShip(flagStateOfShip);
		}

		if (callSign == null) {
			issueAcceptanceForTransitImpl.setCallSign(StringPool.BLANK);
		}
		else {
			issueAcceptanceForTransitImpl.setCallSign(callSign);
		}

		if (nameOfMaster == null) {
			issueAcceptanceForTransitImpl.setNameOfMaster(StringPool.BLANK);
		}
		else {
			issueAcceptanceForTransitImpl.setNameOfMaster(nameOfMaster);
		}

		issueAcceptanceForTransitImpl.setLoa(loa);

		if (unitLOA == null) {
			issueAcceptanceForTransitImpl.setUnitLOA(StringPool.BLANK);
		}
		else {
			issueAcceptanceForTransitImpl.setUnitLOA(unitLOA);
		}

		issueAcceptanceForTransitImpl.setBreadth(breadth);

		if (unitBreadth == null) {
			issueAcceptanceForTransitImpl.setUnitBreadth(StringPool.BLANK);
		}
		else {
			issueAcceptanceForTransitImpl.setUnitBreadth(unitBreadth);
		}

		issueAcceptanceForTransitImpl.setGrossTonnage(grossTonnage);

		if (grossTonnageUnit == null) {
			issueAcceptanceForTransitImpl.setGrossTonnageUnit(StringPool.BLANK);
		}
		else {
			issueAcceptanceForTransitImpl.setGrossTonnageUnit(grossTonnageUnit);
		}

		issueAcceptanceForTransitImpl.setNetTonnage(netTonnage);

		if (netTonnageUnit == null) {
			issueAcceptanceForTransitImpl.setNetTonnageUnit(StringPool.BLANK);
		}
		else {
			issueAcceptanceForTransitImpl.setNetTonnageUnit(netTonnageUnit);
		}

		issueAcceptanceForTransitImpl.setDwt(dwt);

		if (unitDWT == null) {
			issueAcceptanceForTransitImpl.setUnitDWT(StringPool.BLANK);
		}
		else {
			issueAcceptanceForTransitImpl.setUnitDWT(unitDWT);
		}

		issueAcceptanceForTransitImpl.setShownDraftxF(shownDraftxF);

		if (unitShownDraftxF == null) {
			issueAcceptanceForTransitImpl.setUnitShownDraftxF(StringPool.BLANK);
		}
		else {
			issueAcceptanceForTransitImpl.setUnitShownDraftxF(unitShownDraftxF);
		}

		issueAcceptanceForTransitImpl.setShownDraftxA(shownDraftxA);

		if (unitShownDraftxA == null) {
			issueAcceptanceForTransitImpl.setUnitShownDraftxA(StringPool.BLANK);
		}
		else {
			issueAcceptanceForTransitImpl.setUnitShownDraftxA(unitShownDraftxA);
		}

		issueAcceptanceForTransitImpl.setClearanceHeight(clearanceHeight);

		if (unitClearanceHeight == null) {
			issueAcceptanceForTransitImpl.setUnitClearanceHeight(StringPool.BLANK);
		}
		else {
			issueAcceptanceForTransitImpl.setUnitClearanceHeight(unitClearanceHeight);
		}

		if (permittedTransitFrom == Long.MIN_VALUE) {
			issueAcceptanceForTransitImpl.setPermittedTransitFrom(null);
		}
		else {
			issueAcceptanceForTransitImpl.setPermittedTransitFrom(new Date(
					permittedTransitFrom));
		}

		if (permittedTransitTo == Long.MIN_VALUE) {
			issueAcceptanceForTransitImpl.setPermittedTransitTo(null);
		}
		else {
			issueAcceptanceForTransitImpl.setPermittedTransitTo(new Date(
					permittedTransitTo));
		}

		if (timeOfDeparture == Long.MIN_VALUE) {
			issueAcceptanceForTransitImpl.setTimeOfDeparture(null);
		}
		else {
			issueAcceptanceForTransitImpl.setTimeOfDeparture(new Date(
					timeOfDeparture));
		}

		issueAcceptanceForTransitImpl.resetOriginalValues();

		return issueAcceptanceForTransitImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		requestCode = objectInput.readUTF();
		numberAcceptanceForTransit = objectInput.readUTF();
		documentName = objectInput.readLong();
		documentYear = objectInput.readInt();
		nameOfShip = objectInput.readUTF();
		flagStateOfShip = objectInput.readUTF();
		callSign = objectInput.readUTF();
		nameOfMaster = objectInput.readUTF();
		loa = objectInput.readDouble();
		unitLOA = objectInput.readUTF();
		breadth = objectInput.readDouble();
		unitBreadth = objectInput.readUTF();
		grossTonnage = objectInput.readDouble();
		grossTonnageUnit = objectInput.readUTF();
		netTonnage = objectInput.readDouble();
		netTonnageUnit = objectInput.readUTF();
		dwt = objectInput.readDouble();
		unitDWT = objectInput.readUTF();
		shownDraftxF = objectInput.readDouble();
		unitShownDraftxF = objectInput.readUTF();
		shownDraftxA = objectInput.readDouble();
		unitShownDraftxA = objectInput.readUTF();
		clearanceHeight = objectInput.readDouble();
		unitClearanceHeight = objectInput.readUTF();
		permittedTransitFrom = objectInput.readLong();
		permittedTransitTo = objectInput.readLong();
		timeOfDeparture = objectInput.readLong();
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

		if (numberAcceptanceForTransit == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(numberAcceptanceForTransit);
		}

		objectOutput.writeLong(documentName);
		objectOutput.writeInt(documentYear);

		if (nameOfShip == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nameOfShip);
		}

		if (flagStateOfShip == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(flagStateOfShip);
		}

		if (callSign == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(callSign);
		}

		if (nameOfMaster == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nameOfMaster);
		}

		objectOutput.writeDouble(loa);

		if (unitLOA == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(unitLOA);
		}

		objectOutput.writeDouble(breadth);

		if (unitBreadth == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(unitBreadth);
		}

		objectOutput.writeDouble(grossTonnage);

		if (grossTonnageUnit == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(grossTonnageUnit);
		}

		objectOutput.writeDouble(netTonnage);

		if (netTonnageUnit == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(netTonnageUnit);
		}

		objectOutput.writeDouble(dwt);

		if (unitDWT == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(unitDWT);
		}

		objectOutput.writeDouble(shownDraftxF);

		if (unitShownDraftxF == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(unitShownDraftxF);
		}

		objectOutput.writeDouble(shownDraftxA);

		if (unitShownDraftxA == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(unitShownDraftxA);
		}

		objectOutput.writeDouble(clearanceHeight);

		if (unitClearanceHeight == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(unitClearanceHeight);
		}

		objectOutput.writeLong(permittedTransitFrom);
		objectOutput.writeLong(permittedTransitTo);
		objectOutput.writeLong(timeOfDeparture);
	}

	public long id;
	public String requestCode;
	public String numberAcceptanceForTransit;
	public long documentName;
	public int documentYear;
	public String nameOfShip;
	public String flagStateOfShip;
	public String callSign;
	public String nameOfMaster;
	public double loa;
	public String unitLOA;
	public double breadth;
	public String unitBreadth;
	public double grossTonnage;
	public String grossTonnageUnit;
	public double netTonnage;
	public String netTonnageUnit;
	public double dwt;
	public String unitDWT;
	public double shownDraftxF;
	public String unitShownDraftxF;
	public double shownDraftxA;
	public String unitShownDraftxA;
	public double clearanceHeight;
	public String unitClearanceHeight;
	public long permittedTransitFrom;
	public long permittedTransitTo;
	public long timeOfDeparture;
}