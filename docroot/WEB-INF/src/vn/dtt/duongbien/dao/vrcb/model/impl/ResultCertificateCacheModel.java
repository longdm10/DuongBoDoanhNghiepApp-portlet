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

import vn.dtt.duongbien.dao.vrcb.model.ResultCertificate;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ResultCertificate in entity cache.
 *
 * @author longdm
 * @see ResultCertificate
 * @generated
 */
public class ResultCertificateCacheModel implements CacheModel<ResultCertificate>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{id=");
		sb.append(id);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append(", documentYear=");
		sb.append(documentYear);
		sb.append(", maritimeCode=");
		sb.append(maritimeCode);
		sb.append(", certificateCode=");
		sb.append(certificateCode);
		sb.append(", certificateOrder=");
		sb.append(certificateOrder);
		sb.append(", certificateNo=");
		sb.append(certificateNo);
		sb.append(", certificateIssueDate=");
		sb.append(certificateIssueDate);
		sb.append(", certificateExpiredDate=");
		sb.append(certificateExpiredDate);
		sb.append(", examinationDate=");
		sb.append(examinationDate);
		sb.append(", approvalName=");
		sb.append(approvalName);
		sb.append(", isExamined=");
		sb.append(isExamined);
		sb.append(", mandatory=");
		sb.append(mandatory);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ResultCertificate toEntityModel() {
		ResultCertificateImpl resultCertificateImpl = new ResultCertificateImpl();

		resultCertificateImpl.setId(id);
		resultCertificateImpl.setDocumentName(documentName);
		resultCertificateImpl.setDocumentYear(documentYear);

		if (maritimeCode == null) {
			resultCertificateImpl.setMaritimeCode(StringPool.BLANK);
		}
		else {
			resultCertificateImpl.setMaritimeCode(maritimeCode);
		}

		if (certificateCode == null) {
			resultCertificateImpl.setCertificateCode(StringPool.BLANK);
		}
		else {
			resultCertificateImpl.setCertificateCode(certificateCode);
		}

		resultCertificateImpl.setCertificateOrder(certificateOrder);

		if (certificateNo == null) {
			resultCertificateImpl.setCertificateNo(StringPool.BLANK);
		}
		else {
			resultCertificateImpl.setCertificateNo(certificateNo);
		}

		if (certificateIssueDate == Long.MIN_VALUE) {
			resultCertificateImpl.setCertificateIssueDate(null);
		}
		else {
			resultCertificateImpl.setCertificateIssueDate(new Date(
					certificateIssueDate));
		}

		if (certificateExpiredDate == Long.MIN_VALUE) {
			resultCertificateImpl.setCertificateExpiredDate(null);
		}
		else {
			resultCertificateImpl.setCertificateExpiredDate(new Date(
					certificateExpiredDate));
		}

		if (examinationDate == Long.MIN_VALUE) {
			resultCertificateImpl.setExaminationDate(null);
		}
		else {
			resultCertificateImpl.setExaminationDate(new Date(examinationDate));
		}

		if (approvalName == null) {
			resultCertificateImpl.setApprovalName(StringPool.BLANK);
		}
		else {
			resultCertificateImpl.setApprovalName(approvalName);
		}

		resultCertificateImpl.setIsExamined(isExamined);
		resultCertificateImpl.setMandatory(mandatory);

		resultCertificateImpl.resetOriginalValues();

		return resultCertificateImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		documentName = objectInput.readLong();
		documentYear = objectInput.readInt();
		maritimeCode = objectInput.readUTF();
		certificateCode = objectInput.readUTF();
		certificateOrder = objectInput.readInt();
		certificateNo = objectInput.readUTF();
		certificateIssueDate = objectInput.readLong();
		certificateExpiredDate = objectInput.readLong();
		examinationDate = objectInput.readLong();
		approvalName = objectInput.readUTF();
		isExamined = objectInput.readInt();
		mandatory = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(documentName);
		objectOutput.writeInt(documentYear);

		if (maritimeCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maritimeCode);
		}

		if (certificateCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certificateCode);
		}

		objectOutput.writeInt(certificateOrder);

		if (certificateNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(certificateNo);
		}

		objectOutput.writeLong(certificateIssueDate);
		objectOutput.writeLong(certificateExpiredDate);
		objectOutput.writeLong(examinationDate);

		if (approvalName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(approvalName);
		}

		objectOutput.writeInt(isExamined);
		objectOutput.writeInt(mandatory);
	}

	public long id;
	public long documentName;
	public int documentYear;
	public String maritimeCode;
	public String certificateCode;
	public int certificateOrder;
	public String certificateNo;
	public long certificateIssueDate;
	public long certificateExpiredDate;
	public long examinationDate;
	public String approvalName;
	public int isExamined;
	public int mandatory;
}