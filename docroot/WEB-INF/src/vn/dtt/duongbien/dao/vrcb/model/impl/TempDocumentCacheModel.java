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

import vn.dtt.duongbien.dao.vrcb.model.TempDocument;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TempDocument in entity cache.
 *
 * @author longdm
 * @see TempDocument
 * @generated
 */
public class TempDocumentCacheModel implements CacheModel<TempDocument>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(73);

		sb.append("{id=");
		sb.append(id);
		sb.append(", requestCode=");
		sb.append(requestCode);
		sb.append(", requestState=");
		sb.append(requestState);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append(", documentYear=");
		sb.append(documentYear);
		sb.append(", documentTypeCode=");
		sb.append(documentTypeCode);
		sb.append(", userCreated=");
		sb.append(userCreated);
		sb.append(", shipAgencyCode=");
		sb.append(shipAgencyCode);
		sb.append(", shipName=");
		sb.append(shipName);
		sb.append(", shipTypeCode=");
		sb.append(shipTypeCode);
		sb.append(", stateCode=");
		sb.append(stateCode);
		sb.append(", shipCaptain=");
		sb.append(shipCaptain);
		sb.append(", imo=");
		sb.append(imo);
		sb.append(", grt=");
		sb.append(grt);
		sb.append(", nt=");
		sb.append(nt);
		sb.append(", dwt=");
		sb.append(dwt);
		sb.append(", unitGRT=");
		sb.append(unitGRT);
		sb.append(", unitNT=");
		sb.append(unitNT);
		sb.append(", unitDWT=");
		sb.append(unitDWT);
		sb.append(", callSign=");
		sb.append(callSign);
		sb.append(", preDocumentName=");
		sb.append(preDocumentName);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", lastModifiedDate=");
		sb.append(lastModifiedDate);
		sb.append(", flowFlag=");
		sb.append(flowFlag);
		sb.append(", documentStatusCode=");
		sb.append(documentStatusCode);
		sb.append(", locationCode=");
		sb.append(locationCode);
		sb.append(", maritimeCode=");
		sb.append(maritimeCode);
		sb.append(", portRegionCode=");
		sb.append(portRegionCode);
		sb.append(", portCode=");
		sb.append(portCode);
		sb.append(", lastPortCode=");
		sb.append(lastPortCode);
		sb.append(", shipPosition=");
		sb.append(shipPosition);
		sb.append(", shipOwnerCode=");
		sb.append(shipOwnerCode);
		sb.append(", arrivalShipAgency=");
		sb.append(arrivalShipAgency);
		sb.append(", departureShipAgency=");
		sb.append(departureShipAgency);
		sb.append(", shipDateFrom=");
		sb.append(shipDateFrom);
		sb.append(", shipDateTo=");
		sb.append(shipDateTo);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TempDocument toEntityModel() {
		TempDocumentImpl tempDocumentImpl = new TempDocumentImpl();

		tempDocumentImpl.setId(id);

		if (requestCode == null) {
			tempDocumentImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			tempDocumentImpl.setRequestCode(requestCode);
		}

		tempDocumentImpl.setRequestState(requestState);
		tempDocumentImpl.setDocumentName(documentName);
		tempDocumentImpl.setDocumentYear(documentYear);

		if (documentTypeCode == null) {
			tempDocumentImpl.setDocumentTypeCode(StringPool.BLANK);
		}
		else {
			tempDocumentImpl.setDocumentTypeCode(documentTypeCode);
		}

		if (userCreated == null) {
			tempDocumentImpl.setUserCreated(StringPool.BLANK);
		}
		else {
			tempDocumentImpl.setUserCreated(userCreated);
		}

		if (shipAgencyCode == null) {
			tempDocumentImpl.setShipAgencyCode(StringPool.BLANK);
		}
		else {
			tempDocumentImpl.setShipAgencyCode(shipAgencyCode);
		}

		if (shipName == null) {
			tempDocumentImpl.setShipName(StringPool.BLANK);
		}
		else {
			tempDocumentImpl.setShipName(shipName);
		}

		if (shipTypeCode == null) {
			tempDocumentImpl.setShipTypeCode(StringPool.BLANK);
		}
		else {
			tempDocumentImpl.setShipTypeCode(shipTypeCode);
		}

		if (stateCode == null) {
			tempDocumentImpl.setStateCode(StringPool.BLANK);
		}
		else {
			tempDocumentImpl.setStateCode(stateCode);
		}

		if (shipCaptain == null) {
			tempDocumentImpl.setShipCaptain(StringPool.BLANK);
		}
		else {
			tempDocumentImpl.setShipCaptain(shipCaptain);
		}

		if (imo == null) {
			tempDocumentImpl.setImo(StringPool.BLANK);
		}
		else {
			tempDocumentImpl.setImo(imo);
		}

		tempDocumentImpl.setGrt(grt);
		tempDocumentImpl.setNt(nt);
		tempDocumentImpl.setDwt(dwt);

		if (unitGRT == null) {
			tempDocumentImpl.setUnitGRT(StringPool.BLANK);
		}
		else {
			tempDocumentImpl.setUnitGRT(unitGRT);
		}

		if (unitNT == null) {
			tempDocumentImpl.setUnitNT(StringPool.BLANK);
		}
		else {
			tempDocumentImpl.setUnitNT(unitNT);
		}

		if (unitDWT == null) {
			tempDocumentImpl.setUnitDWT(StringPool.BLANK);
		}
		else {
			tempDocumentImpl.setUnitDWT(unitDWT);
		}

		if (callSign == null) {
			tempDocumentImpl.setCallSign(StringPool.BLANK);
		}
		else {
			tempDocumentImpl.setCallSign(callSign);
		}

		if (preDocumentName == null) {
			tempDocumentImpl.setPreDocumentName(StringPool.BLANK);
		}
		else {
			tempDocumentImpl.setPreDocumentName(preDocumentName);
		}

		if (createdDate == Long.MIN_VALUE) {
			tempDocumentImpl.setCreatedDate(null);
		}
		else {
			tempDocumentImpl.setCreatedDate(new Date(createdDate));
		}

		if (lastModifiedDate == Long.MIN_VALUE) {
			tempDocumentImpl.setLastModifiedDate(null);
		}
		else {
			tempDocumentImpl.setLastModifiedDate(new Date(lastModifiedDate));
		}

		tempDocumentImpl.setFlowFlag(flowFlag);
		tempDocumentImpl.setDocumentStatusCode(documentStatusCode);

		if (locationCode == null) {
			tempDocumentImpl.setLocationCode(StringPool.BLANK);
		}
		else {
			tempDocumentImpl.setLocationCode(locationCode);
		}

		if (maritimeCode == null) {
			tempDocumentImpl.setMaritimeCode(StringPool.BLANK);
		}
		else {
			tempDocumentImpl.setMaritimeCode(maritimeCode);
		}

		if (portRegionCode == null) {
			tempDocumentImpl.setPortRegionCode(StringPool.BLANK);
		}
		else {
			tempDocumentImpl.setPortRegionCode(portRegionCode);
		}

		if (portCode == null) {
			tempDocumentImpl.setPortCode(StringPool.BLANK);
		}
		else {
			tempDocumentImpl.setPortCode(portCode);
		}

		if (lastPortCode == null) {
			tempDocumentImpl.setLastPortCode(StringPool.BLANK);
		}
		else {
			tempDocumentImpl.setLastPortCode(lastPortCode);
		}

		tempDocumentImpl.setShipPosition(shipPosition);

		if (shipOwnerCode == null) {
			tempDocumentImpl.setShipOwnerCode(StringPool.BLANK);
		}
		else {
			tempDocumentImpl.setShipOwnerCode(shipOwnerCode);
		}

		if (arrivalShipAgency == null) {
			tempDocumentImpl.setArrivalShipAgency(StringPool.BLANK);
		}
		else {
			tempDocumentImpl.setArrivalShipAgency(arrivalShipAgency);
		}

		if (departureShipAgency == null) {
			tempDocumentImpl.setDepartureShipAgency(StringPool.BLANK);
		}
		else {
			tempDocumentImpl.setDepartureShipAgency(departureShipAgency);
		}

		if (shipDateFrom == Long.MIN_VALUE) {
			tempDocumentImpl.setShipDateFrom(null);
		}
		else {
			tempDocumentImpl.setShipDateFrom(new Date(shipDateFrom));
		}

		if (shipDateTo == Long.MIN_VALUE) {
			tempDocumentImpl.setShipDateTo(null);
		}
		else {
			tempDocumentImpl.setShipDateTo(new Date(shipDateTo));
		}

		tempDocumentImpl.resetOriginalValues();

		return tempDocumentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		requestCode = objectInput.readUTF();
		requestState = objectInput.readInt();
		documentName = objectInput.readLong();
		documentYear = objectInput.readInt();
		documentTypeCode = objectInput.readUTF();
		userCreated = objectInput.readUTF();
		shipAgencyCode = objectInput.readUTF();
		shipName = objectInput.readUTF();
		shipTypeCode = objectInput.readUTF();
		stateCode = objectInput.readUTF();
		shipCaptain = objectInput.readUTF();
		imo = objectInput.readUTF();
		grt = objectInput.readDouble();
		nt = objectInput.readDouble();
		dwt = objectInput.readDouble();
		unitGRT = objectInput.readUTF();
		unitNT = objectInput.readUTF();
		unitDWT = objectInput.readUTF();
		callSign = objectInput.readUTF();
		preDocumentName = objectInput.readUTF();
		createdDate = objectInput.readLong();
		lastModifiedDate = objectInput.readLong();
		flowFlag = objectInput.readInt();
		documentStatusCode = objectInput.readInt();
		locationCode = objectInput.readUTF();
		maritimeCode = objectInput.readUTF();
		portRegionCode = objectInput.readUTF();
		portCode = objectInput.readUTF();
		lastPortCode = objectInput.readUTF();
		shipPosition = objectInput.readInt();
		shipOwnerCode = objectInput.readUTF();
		arrivalShipAgency = objectInput.readUTF();
		departureShipAgency = objectInput.readUTF();
		shipDateFrom = objectInput.readLong();
		shipDateTo = objectInput.readLong();
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

		objectOutput.writeInt(requestState);
		objectOutput.writeLong(documentName);
		objectOutput.writeInt(documentYear);

		if (documentTypeCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(documentTypeCode);
		}

		if (userCreated == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userCreated);
		}

		if (shipAgencyCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shipAgencyCode);
		}

		if (shipName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shipName);
		}

		if (shipTypeCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shipTypeCode);
		}

		if (stateCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(stateCode);
		}

		if (shipCaptain == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shipCaptain);
		}

		if (imo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(imo);
		}

		objectOutput.writeDouble(grt);
		objectOutput.writeDouble(nt);
		objectOutput.writeDouble(dwt);

		if (unitGRT == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(unitGRT);
		}

		if (unitNT == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(unitNT);
		}

		if (unitDWT == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(unitDWT);
		}

		if (callSign == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(callSign);
		}

		if (preDocumentName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(preDocumentName);
		}

		objectOutput.writeLong(createdDate);
		objectOutput.writeLong(lastModifiedDate);
		objectOutput.writeInt(flowFlag);
		objectOutput.writeInt(documentStatusCode);

		if (locationCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(locationCode);
		}

		if (maritimeCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maritimeCode);
		}

		if (portRegionCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(portRegionCode);
		}

		if (portCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(portCode);
		}

		if (lastPortCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lastPortCode);
		}

		objectOutput.writeInt(shipPosition);

		if (shipOwnerCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(shipOwnerCode);
		}

		if (arrivalShipAgency == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(arrivalShipAgency);
		}

		if (departureShipAgency == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(departureShipAgency);
		}

		objectOutput.writeLong(shipDateFrom);
		objectOutput.writeLong(shipDateTo);
	}

	public long id;
	public String requestCode;
	public int requestState;
	public long documentName;
	public int documentYear;
	public String documentTypeCode;
	public String userCreated;
	public String shipAgencyCode;
	public String shipName;
	public String shipTypeCode;
	public String stateCode;
	public String shipCaptain;
	public String imo;
	public double grt;
	public double nt;
	public double dwt;
	public String unitGRT;
	public String unitNT;
	public String unitDWT;
	public String callSign;
	public String preDocumentName;
	public long createdDate;
	public long lastModifiedDate;
	public int flowFlag;
	public int documentStatusCode;
	public String locationCode;
	public String maritimeCode;
	public String portRegionCode;
	public String portCode;
	public String lastPortCode;
	public int shipPosition;
	public String shipOwnerCode;
	public String arrivalShipAgency;
	public String departureShipAgency;
	public long shipDateFrom;
	public long shipDateTo;
}