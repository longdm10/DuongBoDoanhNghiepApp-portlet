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

package vn.dtt.duongbien.dao.vrcb.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbien.dao.vrcb.service.ClpSerializer;
import vn.dtt.duongbien.dao.vrcb.service.IssueShiftingOrderLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class IssueShiftingOrderClp extends BaseModelImpl<IssueShiftingOrder>
	implements IssueShiftingOrder {
	public IssueShiftingOrderClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return IssueShiftingOrder.class;
	}

	@Override
	public String getModelClassName() {
		return IssueShiftingOrder.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("requestCode", getRequestCode());
		attributes.put("numberShiftingOrder", getNumberShiftingOrder());
		attributes.put("documentName", getDocumentName());
		attributes.put("documentYear", getDocumentYear());
		attributes.put("portofAuthority", getPortofAuthority());
		attributes.put("nameOfShip", getNameOfShip());
		attributes.put("flagStateOfShip", getFlagStateOfShip());
		attributes.put("anchoringPortCode", getAnchoringPortCode());
		attributes.put("anchoringPortWharfCode", getAnchoringPortWharfCode());
		attributes.put("portHarbourCode", getPortHarbourCode());
		attributes.put("shiftingPortWharfCode", getShiftingPortWharfCode());
		attributes.put("shiftingDate", getShiftingDate());
		attributes.put("reasonToShift", getReasonToShift());
		attributes.put("issueDate", getIssueDate());
		attributes.put("directorOfMaritime", getDirectorOfMaritime());
		attributes.put("certificateNo", getCertificateNo());
		attributes.put("requestState", getRequestState());
		attributes.put("versionNo", getVersionNo());
		attributes.put("isApproval", getIsApproval());
		attributes.put("approvalDate", getApprovalDate());
		attributes.put("approvalName", getApprovalName());
		attributes.put("remarks", getRemarks());
		attributes.put("isCancel", getIsCancel());
		attributes.put("cancelDate", getCancelDate());
		attributes.put("cancelName", getCancelName());
		attributes.put("cancelNote", getCancelNote());
		attributes.put("representative", getRepresentative());
		attributes.put("digitalAttachedFile", getDigitalAttachedFile());
		attributes.put("signDate", getSignDate());
		attributes.put("signName", getSignName());
		attributes.put("signTitle", getSignTitle());
		attributes.put("signPlace", getSignPlace());
		attributes.put("stampStatus", getStampStatus());
		attributes.put("attachedFile", getAttachedFile());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String requestCode = (String)attributes.get("requestCode");

		if (requestCode != null) {
			setRequestCode(requestCode);
		}

		String numberShiftingOrder = (String)attributes.get(
				"numberShiftingOrder");

		if (numberShiftingOrder != null) {
			setNumberShiftingOrder(numberShiftingOrder);
		}

		Long documentName = (Long)attributes.get("documentName");

		if (documentName != null) {
			setDocumentName(documentName);
		}

		Integer documentYear = (Integer)attributes.get("documentYear");

		if (documentYear != null) {
			setDocumentYear(documentYear);
		}

		String portofAuthority = (String)attributes.get("portofAuthority");

		if (portofAuthority != null) {
			setPortofAuthority(portofAuthority);
		}

		String nameOfShip = (String)attributes.get("nameOfShip");

		if (nameOfShip != null) {
			setNameOfShip(nameOfShip);
		}

		String flagStateOfShip = (String)attributes.get("flagStateOfShip");

		if (flagStateOfShip != null) {
			setFlagStateOfShip(flagStateOfShip);
		}

		String anchoringPortCode = (String)attributes.get("anchoringPortCode");

		if (anchoringPortCode != null) {
			setAnchoringPortCode(anchoringPortCode);
		}

		String anchoringPortWharfCode = (String)attributes.get(
				"anchoringPortWharfCode");

		if (anchoringPortWharfCode != null) {
			setAnchoringPortWharfCode(anchoringPortWharfCode);
		}

		String portHarbourCode = (String)attributes.get("portHarbourCode");

		if (portHarbourCode != null) {
			setPortHarbourCode(portHarbourCode);
		}

		String shiftingPortWharfCode = (String)attributes.get(
				"shiftingPortWharfCode");

		if (shiftingPortWharfCode != null) {
			setShiftingPortWharfCode(shiftingPortWharfCode);
		}

		Date shiftingDate = (Date)attributes.get("shiftingDate");

		if (shiftingDate != null) {
			setShiftingDate(shiftingDate);
		}

		String reasonToShift = (String)attributes.get("reasonToShift");

		if (reasonToShift != null) {
			setReasonToShift(reasonToShift);
		}

		Date issueDate = (Date)attributes.get("issueDate");

		if (issueDate != null) {
			setIssueDate(issueDate);
		}

		String directorOfMaritime = (String)attributes.get("directorOfMaritime");

		if (directorOfMaritime != null) {
			setDirectorOfMaritime(directorOfMaritime);
		}

		String certificateNo = (String)attributes.get("certificateNo");

		if (certificateNo != null) {
			setCertificateNo(certificateNo);
		}

		Integer requestState = (Integer)attributes.get("requestState");

		if (requestState != null) {
			setRequestState(requestState);
		}

		String versionNo = (String)attributes.get("versionNo");

		if (versionNo != null) {
			setVersionNo(versionNo);
		}

		Integer isApproval = (Integer)attributes.get("isApproval");

		if (isApproval != null) {
			setIsApproval(isApproval);
		}

		Date approvalDate = (Date)attributes.get("approvalDate");

		if (approvalDate != null) {
			setApprovalDate(approvalDate);
		}

		String approvalName = (String)attributes.get("approvalName");

		if (approvalName != null) {
			setApprovalName(approvalName);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		Integer isCancel = (Integer)attributes.get("isCancel");

		if (isCancel != null) {
			setIsCancel(isCancel);
		}

		Date cancelDate = (Date)attributes.get("cancelDate");

		if (cancelDate != null) {
			setCancelDate(cancelDate);
		}

		String cancelName = (String)attributes.get("cancelName");

		if (cancelName != null) {
			setCancelName(cancelName);
		}

		String cancelNote = (String)attributes.get("cancelNote");

		if (cancelNote != null) {
			setCancelNote(cancelNote);
		}

		String representative = (String)attributes.get("representative");

		if (representative != null) {
			setRepresentative(representative);
		}

		Long digitalAttachedFile = (Long)attributes.get("digitalAttachedFile");

		if (digitalAttachedFile != null) {
			setDigitalAttachedFile(digitalAttachedFile);
		}

		Date signDate = (Date)attributes.get("signDate");

		if (signDate != null) {
			setSignDate(signDate);
		}

		String signName = (String)attributes.get("signName");

		if (signName != null) {
			setSignName(signName);
		}

		String signTitle = (String)attributes.get("signTitle");

		if (signTitle != null) {
			setSignTitle(signTitle);
		}

		String signPlace = (String)attributes.get("signPlace");

		if (signPlace != null) {
			setSignPlace(signPlace);
		}

		Integer stampStatus = (Integer)attributes.get("stampStatus");

		if (stampStatus != null) {
			setStampStatus(stampStatus);
		}

		Long attachedFile = (Long)attributes.get("attachedFile");

		if (attachedFile != null) {
			setAttachedFile(attachedFile);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_issueShiftingOrderRemoteModel != null) {
			try {
				Class<?> clazz = _issueShiftingOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_issueShiftingOrderRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRequestCode() {
		return _requestCode;
	}

	@Override
	public void setRequestCode(String requestCode) {
		_requestCode = requestCode;

		if (_issueShiftingOrderRemoteModel != null) {
			try {
				Class<?> clazz = _issueShiftingOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestCode", String.class);

				method.invoke(_issueShiftingOrderRemoteModel, requestCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNumberShiftingOrder() {
		return _numberShiftingOrder;
	}

	@Override
	public void setNumberShiftingOrder(String numberShiftingOrder) {
		_numberShiftingOrder = numberShiftingOrder;

		if (_issueShiftingOrderRemoteModel != null) {
			try {
				Class<?> clazz = _issueShiftingOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setNumberShiftingOrder",
						String.class);

				method.invoke(_issueShiftingOrderRemoteModel,
					numberShiftingOrder);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDocumentName() {
		return _documentName;
	}

	@Override
	public void setDocumentName(long documentName) {
		_documentName = documentName;

		if (_issueShiftingOrderRemoteModel != null) {
			try {
				Class<?> clazz = _issueShiftingOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentName", long.class);

				method.invoke(_issueShiftingOrderRemoteModel, documentName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDocumentYear() {
		return _documentYear;
	}

	@Override
	public void setDocumentYear(int documentYear) {
		_documentYear = documentYear;

		if (_issueShiftingOrderRemoteModel != null) {
			try {
				Class<?> clazz = _issueShiftingOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentYear", int.class);

				method.invoke(_issueShiftingOrderRemoteModel, documentYear);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPortofAuthority() {
		return _portofAuthority;
	}

	@Override
	public void setPortofAuthority(String portofAuthority) {
		_portofAuthority = portofAuthority;

		if (_issueShiftingOrderRemoteModel != null) {
			try {
				Class<?> clazz = _issueShiftingOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setPortofAuthority",
						String.class);

				method.invoke(_issueShiftingOrderRemoteModel, portofAuthority);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNameOfShip() {
		return _nameOfShip;
	}

	@Override
	public void setNameOfShip(String nameOfShip) {
		_nameOfShip = nameOfShip;

		if (_issueShiftingOrderRemoteModel != null) {
			try {
				Class<?> clazz = _issueShiftingOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setNameOfShip", String.class);

				method.invoke(_issueShiftingOrderRemoteModel, nameOfShip);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFlagStateOfShip() {
		return _flagStateOfShip;
	}

	@Override
	public void setFlagStateOfShip(String flagStateOfShip) {
		_flagStateOfShip = flagStateOfShip;

		if (_issueShiftingOrderRemoteModel != null) {
			try {
				Class<?> clazz = _issueShiftingOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setFlagStateOfShip",
						String.class);

				method.invoke(_issueShiftingOrderRemoteModel, flagStateOfShip);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAnchoringPortCode() {
		return _anchoringPortCode;
	}

	@Override
	public void setAnchoringPortCode(String anchoringPortCode) {
		_anchoringPortCode = anchoringPortCode;

		if (_issueShiftingOrderRemoteModel != null) {
			try {
				Class<?> clazz = _issueShiftingOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setAnchoringPortCode",
						String.class);

				method.invoke(_issueShiftingOrderRemoteModel, anchoringPortCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAnchoringPortWharfCode() {
		return _anchoringPortWharfCode;
	}

	@Override
	public void setAnchoringPortWharfCode(String anchoringPortWharfCode) {
		_anchoringPortWharfCode = anchoringPortWharfCode;

		if (_issueShiftingOrderRemoteModel != null) {
			try {
				Class<?> clazz = _issueShiftingOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setAnchoringPortWharfCode",
						String.class);

				method.invoke(_issueShiftingOrderRemoteModel,
					anchoringPortWharfCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPortHarbourCode() {
		return _portHarbourCode;
	}

	@Override
	public void setPortHarbourCode(String portHarbourCode) {
		_portHarbourCode = portHarbourCode;

		if (_issueShiftingOrderRemoteModel != null) {
			try {
				Class<?> clazz = _issueShiftingOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setPortHarbourCode",
						String.class);

				method.invoke(_issueShiftingOrderRemoteModel, portHarbourCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getShiftingPortWharfCode() {
		return _shiftingPortWharfCode;
	}

	@Override
	public void setShiftingPortWharfCode(String shiftingPortWharfCode) {
		_shiftingPortWharfCode = shiftingPortWharfCode;

		if (_issueShiftingOrderRemoteModel != null) {
			try {
				Class<?> clazz = _issueShiftingOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setShiftingPortWharfCode",
						String.class);

				method.invoke(_issueShiftingOrderRemoteModel,
					shiftingPortWharfCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getShiftingDate() {
		return _shiftingDate;
	}

	@Override
	public void setShiftingDate(Date shiftingDate) {
		_shiftingDate = shiftingDate;

		if (_issueShiftingOrderRemoteModel != null) {
			try {
				Class<?> clazz = _issueShiftingOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setShiftingDate", Date.class);

				method.invoke(_issueShiftingOrderRemoteModel, shiftingDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getReasonToShift() {
		return _reasonToShift;
	}

	@Override
	public void setReasonToShift(String reasonToShift) {
		_reasonToShift = reasonToShift;

		if (_issueShiftingOrderRemoteModel != null) {
			try {
				Class<?> clazz = _issueShiftingOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setReasonToShift", String.class);

				method.invoke(_issueShiftingOrderRemoteModel, reasonToShift);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getIssueDate() {
		return _issueDate;
	}

	@Override
	public void setIssueDate(Date issueDate) {
		_issueDate = issueDate;

		if (_issueShiftingOrderRemoteModel != null) {
			try {
				Class<?> clazz = _issueShiftingOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setIssueDate", Date.class);

				method.invoke(_issueShiftingOrderRemoteModel, issueDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDirectorOfMaritime() {
		return _directorOfMaritime;
	}

	@Override
	public void setDirectorOfMaritime(String directorOfMaritime) {
		_directorOfMaritime = directorOfMaritime;

		if (_issueShiftingOrderRemoteModel != null) {
			try {
				Class<?> clazz = _issueShiftingOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setDirectorOfMaritime",
						String.class);

				method.invoke(_issueShiftingOrderRemoteModel, directorOfMaritime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCertificateNo() {
		return _certificateNo;
	}

	@Override
	public void setCertificateNo(String certificateNo) {
		_certificateNo = certificateNo;

		if (_issueShiftingOrderRemoteModel != null) {
			try {
				Class<?> clazz = _issueShiftingOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setCertificateNo", String.class);

				method.invoke(_issueShiftingOrderRemoteModel, certificateNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getRequestState() {
		return _requestState;
	}

	@Override
	public void setRequestState(int requestState) {
		_requestState = requestState;

		if (_issueShiftingOrderRemoteModel != null) {
			try {
				Class<?> clazz = _issueShiftingOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestState", int.class);

				method.invoke(_issueShiftingOrderRemoteModel, requestState);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVersionNo() {
		return _versionNo;
	}

	@Override
	public void setVersionNo(String versionNo) {
		_versionNo = versionNo;

		if (_issueShiftingOrderRemoteModel != null) {
			try {
				Class<?> clazz = _issueShiftingOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setVersionNo", String.class);

				method.invoke(_issueShiftingOrderRemoteModel, versionNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIsApproval() {
		return _isApproval;
	}

	@Override
	public void setIsApproval(int isApproval) {
		_isApproval = isApproval;

		if (_issueShiftingOrderRemoteModel != null) {
			try {
				Class<?> clazz = _issueShiftingOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setIsApproval", int.class);

				method.invoke(_issueShiftingOrderRemoteModel, isApproval);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getApprovalDate() {
		return _approvalDate;
	}

	@Override
	public void setApprovalDate(Date approvalDate) {
		_approvalDate = approvalDate;

		if (_issueShiftingOrderRemoteModel != null) {
			try {
				Class<?> clazz = _issueShiftingOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setApprovalDate", Date.class);

				method.invoke(_issueShiftingOrderRemoteModel, approvalDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getApprovalName() {
		return _approvalName;
	}

	@Override
	public void setApprovalName(String approvalName) {
		_approvalName = approvalName;

		if (_issueShiftingOrderRemoteModel != null) {
			try {
				Class<?> clazz = _issueShiftingOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setApprovalName", String.class);

				method.invoke(_issueShiftingOrderRemoteModel, approvalName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRemarks() {
		return _remarks;
	}

	@Override
	public void setRemarks(String remarks) {
		_remarks = remarks;

		if (_issueShiftingOrderRemoteModel != null) {
			try {
				Class<?> clazz = _issueShiftingOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setRemarks", String.class);

				method.invoke(_issueShiftingOrderRemoteModel, remarks);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIsCancel() {
		return _isCancel;
	}

	@Override
	public void setIsCancel(int isCancel) {
		_isCancel = isCancel;

		if (_issueShiftingOrderRemoteModel != null) {
			try {
				Class<?> clazz = _issueShiftingOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setIsCancel", int.class);

				method.invoke(_issueShiftingOrderRemoteModel, isCancel);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCancelDate() {
		return _cancelDate;
	}

	@Override
	public void setCancelDate(Date cancelDate) {
		_cancelDate = cancelDate;

		if (_issueShiftingOrderRemoteModel != null) {
			try {
				Class<?> clazz = _issueShiftingOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setCancelDate", Date.class);

				method.invoke(_issueShiftingOrderRemoteModel, cancelDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCancelName() {
		return _cancelName;
	}

	@Override
	public void setCancelName(String cancelName) {
		_cancelName = cancelName;

		if (_issueShiftingOrderRemoteModel != null) {
			try {
				Class<?> clazz = _issueShiftingOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setCancelName", String.class);

				method.invoke(_issueShiftingOrderRemoteModel, cancelName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCancelNote() {
		return _cancelNote;
	}

	@Override
	public void setCancelNote(String cancelNote) {
		_cancelNote = cancelNote;

		if (_issueShiftingOrderRemoteModel != null) {
			try {
				Class<?> clazz = _issueShiftingOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setCancelNote", String.class);

				method.invoke(_issueShiftingOrderRemoteModel, cancelNote);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRepresentative() {
		return _representative;
	}

	@Override
	public void setRepresentative(String representative) {
		_representative = representative;

		if (_issueShiftingOrderRemoteModel != null) {
			try {
				Class<?> clazz = _issueShiftingOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setRepresentative",
						String.class);

				method.invoke(_issueShiftingOrderRemoteModel, representative);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDigitalAttachedFile() {
		return _digitalAttachedFile;
	}

	@Override
	public void setDigitalAttachedFile(long digitalAttachedFile) {
		_digitalAttachedFile = digitalAttachedFile;

		if (_issueShiftingOrderRemoteModel != null) {
			try {
				Class<?> clazz = _issueShiftingOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setDigitalAttachedFile",
						long.class);

				method.invoke(_issueShiftingOrderRemoteModel,
					digitalAttachedFile);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getSignDate() {
		return _signDate;
	}

	@Override
	public void setSignDate(Date signDate) {
		_signDate = signDate;

		if (_issueShiftingOrderRemoteModel != null) {
			try {
				Class<?> clazz = _issueShiftingOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setSignDate", Date.class);

				method.invoke(_issueShiftingOrderRemoteModel, signDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSignName() {
		return _signName;
	}

	@Override
	public void setSignName(String signName) {
		_signName = signName;

		if (_issueShiftingOrderRemoteModel != null) {
			try {
				Class<?> clazz = _issueShiftingOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setSignName", String.class);

				method.invoke(_issueShiftingOrderRemoteModel, signName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSignTitle() {
		return _signTitle;
	}

	@Override
	public void setSignTitle(String signTitle) {
		_signTitle = signTitle;

		if (_issueShiftingOrderRemoteModel != null) {
			try {
				Class<?> clazz = _issueShiftingOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setSignTitle", String.class);

				method.invoke(_issueShiftingOrderRemoteModel, signTitle);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSignPlace() {
		return _signPlace;
	}

	@Override
	public void setSignPlace(String signPlace) {
		_signPlace = signPlace;

		if (_issueShiftingOrderRemoteModel != null) {
			try {
				Class<?> clazz = _issueShiftingOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setSignPlace", String.class);

				method.invoke(_issueShiftingOrderRemoteModel, signPlace);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getStampStatus() {
		return _stampStatus;
	}

	@Override
	public void setStampStatus(int stampStatus) {
		_stampStatus = stampStatus;

		if (_issueShiftingOrderRemoteModel != null) {
			try {
				Class<?> clazz = _issueShiftingOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setStampStatus", int.class);

				method.invoke(_issueShiftingOrderRemoteModel, stampStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAttachedFile() {
		return _attachedFile;
	}

	@Override
	public void setAttachedFile(long attachedFile) {
		_attachedFile = attachedFile;

		if (_issueShiftingOrderRemoteModel != null) {
			try {
				Class<?> clazz = _issueShiftingOrderRemoteModel.getClass();

				Method method = clazz.getMethod("setAttachedFile", long.class);

				method.invoke(_issueShiftingOrderRemoteModel, attachedFile);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getIssueShiftingOrderRemoteModel() {
		return _issueShiftingOrderRemoteModel;
	}

	public void setIssueShiftingOrderRemoteModel(
		BaseModel<?> issueShiftingOrderRemoteModel) {
		_issueShiftingOrderRemoteModel = issueShiftingOrderRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _issueShiftingOrderRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_issueShiftingOrderRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			IssueShiftingOrderLocalServiceUtil.addIssueShiftingOrder(this);
		}
		else {
			IssueShiftingOrderLocalServiceUtil.updateIssueShiftingOrder(this);
		}
	}

	@Override
	public IssueShiftingOrder toEscapedModel() {
		return (IssueShiftingOrder)ProxyUtil.newProxyInstance(IssueShiftingOrder.class.getClassLoader(),
			new Class[] { IssueShiftingOrder.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		IssueShiftingOrderClp clone = new IssueShiftingOrderClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setNumberShiftingOrder(getNumberShiftingOrder());
		clone.setDocumentName(getDocumentName());
		clone.setDocumentYear(getDocumentYear());
		clone.setPortofAuthority(getPortofAuthority());
		clone.setNameOfShip(getNameOfShip());
		clone.setFlagStateOfShip(getFlagStateOfShip());
		clone.setAnchoringPortCode(getAnchoringPortCode());
		clone.setAnchoringPortWharfCode(getAnchoringPortWharfCode());
		clone.setPortHarbourCode(getPortHarbourCode());
		clone.setShiftingPortWharfCode(getShiftingPortWharfCode());
		clone.setShiftingDate(getShiftingDate());
		clone.setReasonToShift(getReasonToShift());
		clone.setIssueDate(getIssueDate());
		clone.setDirectorOfMaritime(getDirectorOfMaritime());
		clone.setCertificateNo(getCertificateNo());
		clone.setRequestState(getRequestState());
		clone.setVersionNo(getVersionNo());
		clone.setIsApproval(getIsApproval());
		clone.setApprovalDate(getApprovalDate());
		clone.setApprovalName(getApprovalName());
		clone.setRemarks(getRemarks());
		clone.setIsCancel(getIsCancel());
		clone.setCancelDate(getCancelDate());
		clone.setCancelName(getCancelName());
		clone.setCancelNote(getCancelNote());
		clone.setRepresentative(getRepresentative());
		clone.setDigitalAttachedFile(getDigitalAttachedFile());
		clone.setSignDate(getSignDate());
		clone.setSignName(getSignName());
		clone.setSignTitle(getSignTitle());
		clone.setSignPlace(getSignPlace());
		clone.setStampStatus(getStampStatus());
		clone.setAttachedFile(getAttachedFile());

		return clone;
	}

	@Override
	public int compareTo(IssueShiftingOrder issueShiftingOrder) {
		int value = 0;

		if (getId() < issueShiftingOrder.getId()) {
			value = -1;
		}
		else if (getId() > issueShiftingOrder.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof IssueShiftingOrderClp)) {
			return false;
		}

		IssueShiftingOrderClp issueShiftingOrder = (IssueShiftingOrderClp)obj;

		long primaryKey = issueShiftingOrder.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(71);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", numberShiftingOrder=");
		sb.append(getNumberShiftingOrder());
		sb.append(", documentName=");
		sb.append(getDocumentName());
		sb.append(", documentYear=");
		sb.append(getDocumentYear());
		sb.append(", portofAuthority=");
		sb.append(getPortofAuthority());
		sb.append(", nameOfShip=");
		sb.append(getNameOfShip());
		sb.append(", flagStateOfShip=");
		sb.append(getFlagStateOfShip());
		sb.append(", anchoringPortCode=");
		sb.append(getAnchoringPortCode());
		sb.append(", anchoringPortWharfCode=");
		sb.append(getAnchoringPortWharfCode());
		sb.append(", portHarbourCode=");
		sb.append(getPortHarbourCode());
		sb.append(", shiftingPortWharfCode=");
		sb.append(getShiftingPortWharfCode());
		sb.append(", shiftingDate=");
		sb.append(getShiftingDate());
		sb.append(", reasonToShift=");
		sb.append(getReasonToShift());
		sb.append(", issueDate=");
		sb.append(getIssueDate());
		sb.append(", directorOfMaritime=");
		sb.append(getDirectorOfMaritime());
		sb.append(", certificateNo=");
		sb.append(getCertificateNo());
		sb.append(", requestState=");
		sb.append(getRequestState());
		sb.append(", versionNo=");
		sb.append(getVersionNo());
		sb.append(", isApproval=");
		sb.append(getIsApproval());
		sb.append(", approvalDate=");
		sb.append(getApprovalDate());
		sb.append(", approvalName=");
		sb.append(getApprovalName());
		sb.append(", remarks=");
		sb.append(getRemarks());
		sb.append(", isCancel=");
		sb.append(getIsCancel());
		sb.append(", cancelDate=");
		sb.append(getCancelDate());
		sb.append(", cancelName=");
		sb.append(getCancelName());
		sb.append(", cancelNote=");
		sb.append(getCancelNote());
		sb.append(", representative=");
		sb.append(getRepresentative());
		sb.append(", digitalAttachedFile=");
		sb.append(getDigitalAttachedFile());
		sb.append(", signDate=");
		sb.append(getSignDate());
		sb.append(", signName=");
		sb.append(getSignName());
		sb.append(", signTitle=");
		sb.append(getSignTitle());
		sb.append(", signPlace=");
		sb.append(getSignPlace());
		sb.append(", stampStatus=");
		sb.append(getStampStatus());
		sb.append(", attachedFile=");
		sb.append(getAttachedFile());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(109);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestCode</column-name><column-value><![CDATA[");
		sb.append(getRequestCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>numberShiftingOrder</column-name><column-value><![CDATA[");
		sb.append(getNumberShiftingOrder());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentName</column-name><column-value><![CDATA[");
		sb.append(getDocumentName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentYear</column-name><column-value><![CDATA[");
		sb.append(getDocumentYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portofAuthority</column-name><column-value><![CDATA[");
		sb.append(getPortofAuthority());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameOfShip</column-name><column-value><![CDATA[");
		sb.append(getNameOfShip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>flagStateOfShip</column-name><column-value><![CDATA[");
		sb.append(getFlagStateOfShip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>anchoringPortCode</column-name><column-value><![CDATA[");
		sb.append(getAnchoringPortCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>anchoringPortWharfCode</column-name><column-value><![CDATA[");
		sb.append(getAnchoringPortWharfCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portHarbourCode</column-name><column-value><![CDATA[");
		sb.append(getPortHarbourCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shiftingPortWharfCode</column-name><column-value><![CDATA[");
		sb.append(getShiftingPortWharfCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shiftingDate</column-name><column-value><![CDATA[");
		sb.append(getShiftingDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reasonToShift</column-name><column-value><![CDATA[");
		sb.append(getReasonToShift());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>issueDate</column-name><column-value><![CDATA[");
		sb.append(getIssueDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>directorOfMaritime</column-name><column-value><![CDATA[");
		sb.append(getDirectorOfMaritime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateNo</column-name><column-value><![CDATA[");
		sb.append(getCertificateNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestState</column-name><column-value><![CDATA[");
		sb.append(getRequestState());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>versionNo</column-name><column-value><![CDATA[");
		sb.append(getVersionNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isApproval</column-name><column-value><![CDATA[");
		sb.append(getIsApproval());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approvalDate</column-name><column-value><![CDATA[");
		sb.append(getApprovalDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approvalName</column-name><column-value><![CDATA[");
		sb.append(getApprovalName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remarks</column-name><column-value><![CDATA[");
		sb.append(getRemarks());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isCancel</column-name><column-value><![CDATA[");
		sb.append(getIsCancel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cancelDate</column-name><column-value><![CDATA[");
		sb.append(getCancelDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cancelName</column-name><column-value><![CDATA[");
		sb.append(getCancelName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cancelNote</column-name><column-value><![CDATA[");
		sb.append(getCancelNote());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>representative</column-name><column-value><![CDATA[");
		sb.append(getRepresentative());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>digitalAttachedFile</column-name><column-value><![CDATA[");
		sb.append(getDigitalAttachedFile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signDate</column-name><column-value><![CDATA[");
		sb.append(getSignDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signName</column-name><column-value><![CDATA[");
		sb.append(getSignName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signTitle</column-name><column-value><![CDATA[");
		sb.append(getSignTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signPlace</column-name><column-value><![CDATA[");
		sb.append(getSignPlace());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stampStatus</column-name><column-value><![CDATA[");
		sb.append(getStampStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>attachedFile</column-name><column-value><![CDATA[");
		sb.append(getAttachedFile());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private String _numberShiftingOrder;
	private long _documentName;
	private int _documentYear;
	private String _portofAuthority;
	private String _nameOfShip;
	private String _flagStateOfShip;
	private String _anchoringPortCode;
	private String _anchoringPortWharfCode;
	private String _portHarbourCode;
	private String _shiftingPortWharfCode;
	private Date _shiftingDate;
	private String _reasonToShift;
	private Date _issueDate;
	private String _directorOfMaritime;
	private String _certificateNo;
	private int _requestState;
	private String _versionNo;
	private int _isApproval;
	private Date _approvalDate;
	private String _approvalName;
	private String _remarks;
	private int _isCancel;
	private Date _cancelDate;
	private String _cancelName;
	private String _cancelNote;
	private String _representative;
	private long _digitalAttachedFile;
	private Date _signDate;
	private String _signName;
	private String _signTitle;
	private String _signPlace;
	private int _stampStatus;
	private long _attachedFile;
	private BaseModel<?> _issueShiftingOrderRemoteModel;
}