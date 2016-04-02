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

import vn.dtt.duongbien.dao.vrcb.model.ResultCompetion;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ResultCompetion in entity cache.
 *
 * @author longdm
 * @see ResultCompetion
 * @generated
 */
public class ResultCompetionCacheModel implements CacheModel<ResultCompetion>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(67);

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
		sb.append(", nameOfShip=");
		sb.append(nameOfShip);
		sb.append(", flagStateOfShip=");
		sb.append(flagStateOfShip);
		sb.append(", nameOfMaster=");
		sb.append(nameOfMaster);
		sb.append(", grossTonnage=");
		sb.append(grossTonnage);
		sb.append(", portOfArrivalCode=");
		sb.append(portOfArrivalCode);
		sb.append(", maritimeCode=");
		sb.append(maritimeCode);
		sb.append(", division=");
		sb.append(division);
		sb.append(", approvalName=");
		sb.append(approvalName);
		sb.append(", approvalTime=");
		sb.append(approvalTime);
		sb.append(", certificateNo=");
		sb.append(certificateNo);
		sb.append(", responseStatusHQ=");
		sb.append(responseStatusHQ);
		sb.append(", responseStatusBP=");
		sb.append(responseStatusBP);
		sb.append(", responseStatusYT=");
		sb.append(responseStatusYT);
		sb.append(", responseStatusDV=");
		sb.append(responseStatusDV);
		sb.append(", responseStatusTV=");
		sb.append(responseStatusTV);
		sb.append(", responseStatusCVHH=");
		sb.append(responseStatusCVHH);
		sb.append(", responseTimeHQ=");
		sb.append(responseTimeHQ);
		sb.append(", responseTimeBP=");
		sb.append(responseTimeBP);
		sb.append(", responseTimeYT=");
		sb.append(responseTimeYT);
		sb.append(", responseTimeDV=");
		sb.append(responseTimeDV);
		sb.append(", responseTimeTV=");
		sb.append(responseTimeTV);
		sb.append(", responseTimeCVHH=");
		sb.append(responseTimeCVHH);
		sb.append(", responseHQ=");
		sb.append(responseHQ);
		sb.append(", responseBP=");
		sb.append(responseBP);
		sb.append(", responseYT=");
		sb.append(responseYT);
		sb.append(", responseDV=");
		sb.append(responseDV);
		sb.append(", responseTV=");
		sb.append(responseTV);
		sb.append(", responseCVHH=");
		sb.append(responseCVHH);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ResultCompetion toEntityModel() {
		ResultCompetionImpl resultCompetionImpl = new ResultCompetionImpl();

		resultCompetionImpl.setId(id);

		if (requestCode == null) {
			resultCompetionImpl.setRequestCode(StringPool.BLANK);
		}
		else {
			resultCompetionImpl.setRequestCode(requestCode);
		}

		resultCompetionImpl.setRequestState(requestState);
		resultCompetionImpl.setDocumentName(documentName);
		resultCompetionImpl.setDocumentYear(documentYear);

		if (nameOfShip == null) {
			resultCompetionImpl.setNameOfShip(StringPool.BLANK);
		}
		else {
			resultCompetionImpl.setNameOfShip(nameOfShip);
		}

		if (flagStateOfShip == null) {
			resultCompetionImpl.setFlagStateOfShip(StringPool.BLANK);
		}
		else {
			resultCompetionImpl.setFlagStateOfShip(flagStateOfShip);
		}

		if (nameOfMaster == null) {
			resultCompetionImpl.setNameOfMaster(StringPool.BLANK);
		}
		else {
			resultCompetionImpl.setNameOfMaster(nameOfMaster);
		}

		resultCompetionImpl.setGrossTonnage(grossTonnage);

		if (portOfArrivalCode == null) {
			resultCompetionImpl.setPortOfArrivalCode(StringPool.BLANK);
		}
		else {
			resultCompetionImpl.setPortOfArrivalCode(portOfArrivalCode);
		}

		if (maritimeCode == null) {
			resultCompetionImpl.setMaritimeCode(StringPool.BLANK);
		}
		else {
			resultCompetionImpl.setMaritimeCode(maritimeCode);
		}

		if (division == null) {
			resultCompetionImpl.setDivision(StringPool.BLANK);
		}
		else {
			resultCompetionImpl.setDivision(division);
		}

		if (approvalName == null) {
			resultCompetionImpl.setApprovalName(StringPool.BLANK);
		}
		else {
			resultCompetionImpl.setApprovalName(approvalName);
		}

		if (approvalTime == Long.MIN_VALUE) {
			resultCompetionImpl.setApprovalTime(null);
		}
		else {
			resultCompetionImpl.setApprovalTime(new Date(approvalTime));
		}

		if (certificateNo == null) {
			resultCompetionImpl.setCertificateNo(StringPool.BLANK);
		}
		else {
			resultCompetionImpl.setCertificateNo(certificateNo);
		}

		resultCompetionImpl.setResponseStatusHQ(responseStatusHQ);
		resultCompetionImpl.setResponseStatusBP(responseStatusBP);
		resultCompetionImpl.setResponseStatusYT(responseStatusYT);
		resultCompetionImpl.setResponseStatusDV(responseStatusDV);
		resultCompetionImpl.setResponseStatusTV(responseStatusTV);
		resultCompetionImpl.setResponseStatusCVHH(responseStatusCVHH);

		if (responseTimeHQ == Long.MIN_VALUE) {
			resultCompetionImpl.setResponseTimeHQ(null);
		}
		else {
			resultCompetionImpl.setResponseTimeHQ(new Date(responseTimeHQ));
		}

		if (responseTimeBP == Long.MIN_VALUE) {
			resultCompetionImpl.setResponseTimeBP(null);
		}
		else {
			resultCompetionImpl.setResponseTimeBP(new Date(responseTimeBP));
		}

		if (responseTimeYT == Long.MIN_VALUE) {
			resultCompetionImpl.setResponseTimeYT(null);
		}
		else {
			resultCompetionImpl.setResponseTimeYT(new Date(responseTimeYT));
		}

		if (responseTimeDV == Long.MIN_VALUE) {
			resultCompetionImpl.setResponseTimeDV(null);
		}
		else {
			resultCompetionImpl.setResponseTimeDV(new Date(responseTimeDV));
		}

		if (responseTimeTV == Long.MIN_VALUE) {
			resultCompetionImpl.setResponseTimeTV(null);
		}
		else {
			resultCompetionImpl.setResponseTimeTV(new Date(responseTimeTV));
		}

		if (responseTimeCVHH == Long.MIN_VALUE) {
			resultCompetionImpl.setResponseTimeCVHH(null);
		}
		else {
			resultCompetionImpl.setResponseTimeCVHH(new Date(responseTimeCVHH));
		}

		if (responseHQ == null) {
			resultCompetionImpl.setResponseHQ(StringPool.BLANK);
		}
		else {
			resultCompetionImpl.setResponseHQ(responseHQ);
		}

		if (responseBP == null) {
			resultCompetionImpl.setResponseBP(StringPool.BLANK);
		}
		else {
			resultCompetionImpl.setResponseBP(responseBP);
		}

		if (responseYT == null) {
			resultCompetionImpl.setResponseYT(StringPool.BLANK);
		}
		else {
			resultCompetionImpl.setResponseYT(responseYT);
		}

		if (responseDV == null) {
			resultCompetionImpl.setResponseDV(StringPool.BLANK);
		}
		else {
			resultCompetionImpl.setResponseDV(responseDV);
		}

		if (responseTV == null) {
			resultCompetionImpl.setResponseTV(StringPool.BLANK);
		}
		else {
			resultCompetionImpl.setResponseTV(responseTV);
		}

		if (responseCVHH == null) {
			resultCompetionImpl.setResponseCVHH(StringPool.BLANK);
		}
		else {
			resultCompetionImpl.setResponseCVHH(responseCVHH);
		}

		resultCompetionImpl.resetOriginalValues();

		return resultCompetionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		requestCode = objectInput.readUTF();
		requestState = objectInput.readInt();
		documentName = objectInput.readLong();
		documentYear = objectInput.readInt();
		nameOfShip = objectInput.readUTF();
		flagStateOfShip = objectInput.readUTF();
		nameOfMaster = objectInput.readUTF();
		grossTonnage = objectInput.readDouble();
		portOfArrivalCode = objectInput.readUTF();
		maritimeCode = objectInput.readUTF();
		division = objectInput.readUTF();
		approvalName = objectInput.readUTF();
		approvalTime = objectInput.readLong();
		certificateNo = objectInput.readUTF();
		responseStatusHQ = objectInput.readInt();
		responseStatusBP = objectInput.readInt();
		responseStatusYT = objectInput.readInt();
		responseStatusDV = objectInput.readInt();
		responseStatusTV = objectInput.readInt();
		responseStatusCVHH = objectInput.readInt();
		responseTimeHQ = objectInput.readLong();
		responseTimeBP = objectInput.readLong();
		responseTimeYT = objectInput.readLong();
		responseTimeDV = objectInput.readLong();
		responseTimeTV = objectInput.readLong();
		responseTimeCVHH = objectInput.readLong();
		responseHQ = objectInput.readUTF();
		responseBP = objectInput.readUTF();
		responseYT = objectInput.readUTF();
		responseDV = objectInput.readUTF();
		responseTV = objectInput.readUTF();
		responseCVHH = objectInput.readUTF();
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

		if (nameOfMaster == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nameOfMaster);
		}

		objectOutput.writeDouble(grossTonnage);

		if (portOfArrivalCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(portOfArrivalCode);
		}

		if (maritimeCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maritimeCode);
		}

		if (division == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(division);
		}

		if (approvalName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(approvalName);
		}

		objectOutput.writeLong(approvalTime);

		if (certificateNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certificateNo);
		}

		objectOutput.writeInt(responseStatusHQ);
		objectOutput.writeInt(responseStatusBP);
		objectOutput.writeInt(responseStatusYT);
		objectOutput.writeInt(responseStatusDV);
		objectOutput.writeInt(responseStatusTV);
		objectOutput.writeInt(responseStatusCVHH);
		objectOutput.writeLong(responseTimeHQ);
		objectOutput.writeLong(responseTimeBP);
		objectOutput.writeLong(responseTimeYT);
		objectOutput.writeLong(responseTimeDV);
		objectOutput.writeLong(responseTimeTV);
		objectOutput.writeLong(responseTimeCVHH);

		if (responseHQ == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(responseHQ);
		}

		if (responseBP == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(responseBP);
		}

		if (responseYT == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(responseYT);
		}

		if (responseDV == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(responseDV);
		}

		if (responseTV == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(responseTV);
		}

		if (responseCVHH == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(responseCVHH);
		}
	}

	public long id;
	public String requestCode;
	public int requestState;
	public long documentName;
	public int documentYear;
	public String nameOfShip;
	public String flagStateOfShip;
	public String nameOfMaster;
	public double grossTonnage;
	public String portOfArrivalCode;
	public String maritimeCode;
	public String division;
	public String approvalName;
	public long approvalTime;
	public String certificateNo;
	public int responseStatusHQ;
	public int responseStatusBP;
	public int responseStatusYT;
	public int responseStatusDV;
	public int responseStatusTV;
	public int responseStatusCVHH;
	public long responseTimeHQ;
	public long responseTimeBP;
	public long responseTimeYT;
	public long responseTimeDV;
	public long responseTimeTV;
	public long responseTimeCVHH;
	public String responseHQ;
	public String responseBP;
	public String responseYT;
	public String responseDV;
	public String responseTV;
	public String responseCVHH;
}