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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link IssueShiftingOrder}.
 * </p>
 *
 * @author longdm
 * @see IssueShiftingOrder
 * @generated
 */
public class IssueShiftingOrderWrapper implements IssueShiftingOrder,
	ModelWrapper<IssueShiftingOrder> {
	public IssueShiftingOrderWrapper(IssueShiftingOrder issueShiftingOrder) {
		_issueShiftingOrder = issueShiftingOrder;
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

	/**
	* Returns the primary key of this issue shifting order.
	*
	* @return the primary key of this issue shifting order
	*/
	@Override
	public long getPrimaryKey() {
		return _issueShiftingOrder.getPrimaryKey();
	}

	/**
	* Sets the primary key of this issue shifting order.
	*
	* @param primaryKey the primary key of this issue shifting order
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_issueShiftingOrder.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this issue shifting order.
	*
	* @return the ID of this issue shifting order
	*/
	@Override
	public long getId() {
		return _issueShiftingOrder.getId();
	}

	/**
	* Sets the ID of this issue shifting order.
	*
	* @param id the ID of this issue shifting order
	*/
	@Override
	public void setId(long id) {
		_issueShiftingOrder.setId(id);
	}

	/**
	* Returns the request code of this issue shifting order.
	*
	* @return the request code of this issue shifting order
	*/
	@Override
	public java.lang.String getRequestCode() {
		return _issueShiftingOrder.getRequestCode();
	}

	/**
	* Sets the request code of this issue shifting order.
	*
	* @param requestCode the request code of this issue shifting order
	*/
	@Override
	public void setRequestCode(java.lang.String requestCode) {
		_issueShiftingOrder.setRequestCode(requestCode);
	}

	/**
	* Returns the number shifting order of this issue shifting order.
	*
	* @return the number shifting order of this issue shifting order
	*/
	@Override
	public java.lang.String getNumberShiftingOrder() {
		return _issueShiftingOrder.getNumberShiftingOrder();
	}

	/**
	* Sets the number shifting order of this issue shifting order.
	*
	* @param numberShiftingOrder the number shifting order of this issue shifting order
	*/
	@Override
	public void setNumberShiftingOrder(java.lang.String numberShiftingOrder) {
		_issueShiftingOrder.setNumberShiftingOrder(numberShiftingOrder);
	}

	/**
	* Returns the document name of this issue shifting order.
	*
	* @return the document name of this issue shifting order
	*/
	@Override
	public long getDocumentName() {
		return _issueShiftingOrder.getDocumentName();
	}

	/**
	* Sets the document name of this issue shifting order.
	*
	* @param documentName the document name of this issue shifting order
	*/
	@Override
	public void setDocumentName(long documentName) {
		_issueShiftingOrder.setDocumentName(documentName);
	}

	/**
	* Returns the document year of this issue shifting order.
	*
	* @return the document year of this issue shifting order
	*/
	@Override
	public int getDocumentYear() {
		return _issueShiftingOrder.getDocumentYear();
	}

	/**
	* Sets the document year of this issue shifting order.
	*
	* @param documentYear the document year of this issue shifting order
	*/
	@Override
	public void setDocumentYear(int documentYear) {
		_issueShiftingOrder.setDocumentYear(documentYear);
	}

	/**
	* Returns the portof authority of this issue shifting order.
	*
	* @return the portof authority of this issue shifting order
	*/
	@Override
	public java.lang.String getPortofAuthority() {
		return _issueShiftingOrder.getPortofAuthority();
	}

	/**
	* Sets the portof authority of this issue shifting order.
	*
	* @param portofAuthority the portof authority of this issue shifting order
	*/
	@Override
	public void setPortofAuthority(java.lang.String portofAuthority) {
		_issueShiftingOrder.setPortofAuthority(portofAuthority);
	}

	/**
	* Returns the name of ship of this issue shifting order.
	*
	* @return the name of ship of this issue shifting order
	*/
	@Override
	public java.lang.String getNameOfShip() {
		return _issueShiftingOrder.getNameOfShip();
	}

	/**
	* Sets the name of ship of this issue shifting order.
	*
	* @param nameOfShip the name of ship of this issue shifting order
	*/
	@Override
	public void setNameOfShip(java.lang.String nameOfShip) {
		_issueShiftingOrder.setNameOfShip(nameOfShip);
	}

	/**
	* Returns the flag state of ship of this issue shifting order.
	*
	* @return the flag state of ship of this issue shifting order
	*/
	@Override
	public java.lang.String getFlagStateOfShip() {
		return _issueShiftingOrder.getFlagStateOfShip();
	}

	/**
	* Sets the flag state of ship of this issue shifting order.
	*
	* @param flagStateOfShip the flag state of ship of this issue shifting order
	*/
	@Override
	public void setFlagStateOfShip(java.lang.String flagStateOfShip) {
		_issueShiftingOrder.setFlagStateOfShip(flagStateOfShip);
	}

	/**
	* Returns the anchoring port code of this issue shifting order.
	*
	* @return the anchoring port code of this issue shifting order
	*/
	@Override
	public java.lang.String getAnchoringPortCode() {
		return _issueShiftingOrder.getAnchoringPortCode();
	}

	/**
	* Sets the anchoring port code of this issue shifting order.
	*
	* @param anchoringPortCode the anchoring port code of this issue shifting order
	*/
	@Override
	public void setAnchoringPortCode(java.lang.String anchoringPortCode) {
		_issueShiftingOrder.setAnchoringPortCode(anchoringPortCode);
	}

	/**
	* Returns the anchoring port wharf code of this issue shifting order.
	*
	* @return the anchoring port wharf code of this issue shifting order
	*/
	@Override
	public java.lang.String getAnchoringPortWharfCode() {
		return _issueShiftingOrder.getAnchoringPortWharfCode();
	}

	/**
	* Sets the anchoring port wharf code of this issue shifting order.
	*
	* @param anchoringPortWharfCode the anchoring port wharf code of this issue shifting order
	*/
	@Override
	public void setAnchoringPortWharfCode(
		java.lang.String anchoringPortWharfCode) {
		_issueShiftingOrder.setAnchoringPortWharfCode(anchoringPortWharfCode);
	}

	/**
	* Returns the port harbour code of this issue shifting order.
	*
	* @return the port harbour code of this issue shifting order
	*/
	@Override
	public java.lang.String getPortHarbourCode() {
		return _issueShiftingOrder.getPortHarbourCode();
	}

	/**
	* Sets the port harbour code of this issue shifting order.
	*
	* @param portHarbourCode the port harbour code of this issue shifting order
	*/
	@Override
	public void setPortHarbourCode(java.lang.String portHarbourCode) {
		_issueShiftingOrder.setPortHarbourCode(portHarbourCode);
	}

	/**
	* Returns the shifting port wharf code of this issue shifting order.
	*
	* @return the shifting port wharf code of this issue shifting order
	*/
	@Override
	public java.lang.String getShiftingPortWharfCode() {
		return _issueShiftingOrder.getShiftingPortWharfCode();
	}

	/**
	* Sets the shifting port wharf code of this issue shifting order.
	*
	* @param shiftingPortWharfCode the shifting port wharf code of this issue shifting order
	*/
	@Override
	public void setShiftingPortWharfCode(java.lang.String shiftingPortWharfCode) {
		_issueShiftingOrder.setShiftingPortWharfCode(shiftingPortWharfCode);
	}

	/**
	* Returns the shifting date of this issue shifting order.
	*
	* @return the shifting date of this issue shifting order
	*/
	@Override
	public java.util.Date getShiftingDate() {
		return _issueShiftingOrder.getShiftingDate();
	}

	/**
	* Sets the shifting date of this issue shifting order.
	*
	* @param shiftingDate the shifting date of this issue shifting order
	*/
	@Override
	public void setShiftingDate(java.util.Date shiftingDate) {
		_issueShiftingOrder.setShiftingDate(shiftingDate);
	}

	/**
	* Returns the reason to shift of this issue shifting order.
	*
	* @return the reason to shift of this issue shifting order
	*/
	@Override
	public java.lang.String getReasonToShift() {
		return _issueShiftingOrder.getReasonToShift();
	}

	/**
	* Sets the reason to shift of this issue shifting order.
	*
	* @param reasonToShift the reason to shift of this issue shifting order
	*/
	@Override
	public void setReasonToShift(java.lang.String reasonToShift) {
		_issueShiftingOrder.setReasonToShift(reasonToShift);
	}

	/**
	* Returns the issue date of this issue shifting order.
	*
	* @return the issue date of this issue shifting order
	*/
	@Override
	public java.util.Date getIssueDate() {
		return _issueShiftingOrder.getIssueDate();
	}

	/**
	* Sets the issue date of this issue shifting order.
	*
	* @param issueDate the issue date of this issue shifting order
	*/
	@Override
	public void setIssueDate(java.util.Date issueDate) {
		_issueShiftingOrder.setIssueDate(issueDate);
	}

	/**
	* Returns the director of maritime of this issue shifting order.
	*
	* @return the director of maritime of this issue shifting order
	*/
	@Override
	public java.lang.String getDirectorOfMaritime() {
		return _issueShiftingOrder.getDirectorOfMaritime();
	}

	/**
	* Sets the director of maritime of this issue shifting order.
	*
	* @param directorOfMaritime the director of maritime of this issue shifting order
	*/
	@Override
	public void setDirectorOfMaritime(java.lang.String directorOfMaritime) {
		_issueShiftingOrder.setDirectorOfMaritime(directorOfMaritime);
	}

	/**
	* Returns the certificate no of this issue shifting order.
	*
	* @return the certificate no of this issue shifting order
	*/
	@Override
	public java.lang.String getCertificateNo() {
		return _issueShiftingOrder.getCertificateNo();
	}

	/**
	* Sets the certificate no of this issue shifting order.
	*
	* @param certificateNo the certificate no of this issue shifting order
	*/
	@Override
	public void setCertificateNo(java.lang.String certificateNo) {
		_issueShiftingOrder.setCertificateNo(certificateNo);
	}

	/**
	* Returns the request state of this issue shifting order.
	*
	* @return the request state of this issue shifting order
	*/
	@Override
	public int getRequestState() {
		return _issueShiftingOrder.getRequestState();
	}

	/**
	* Sets the request state of this issue shifting order.
	*
	* @param requestState the request state of this issue shifting order
	*/
	@Override
	public void setRequestState(int requestState) {
		_issueShiftingOrder.setRequestState(requestState);
	}

	/**
	* Returns the version no of this issue shifting order.
	*
	* @return the version no of this issue shifting order
	*/
	@Override
	public java.lang.String getVersionNo() {
		return _issueShiftingOrder.getVersionNo();
	}

	/**
	* Sets the version no of this issue shifting order.
	*
	* @param versionNo the version no of this issue shifting order
	*/
	@Override
	public void setVersionNo(java.lang.String versionNo) {
		_issueShiftingOrder.setVersionNo(versionNo);
	}

	/**
	* Returns the is approval of this issue shifting order.
	*
	* @return the is approval of this issue shifting order
	*/
	@Override
	public int getIsApproval() {
		return _issueShiftingOrder.getIsApproval();
	}

	/**
	* Sets the is approval of this issue shifting order.
	*
	* @param isApproval the is approval of this issue shifting order
	*/
	@Override
	public void setIsApproval(int isApproval) {
		_issueShiftingOrder.setIsApproval(isApproval);
	}

	/**
	* Returns the approval date of this issue shifting order.
	*
	* @return the approval date of this issue shifting order
	*/
	@Override
	public java.util.Date getApprovalDate() {
		return _issueShiftingOrder.getApprovalDate();
	}

	/**
	* Sets the approval date of this issue shifting order.
	*
	* @param approvalDate the approval date of this issue shifting order
	*/
	@Override
	public void setApprovalDate(java.util.Date approvalDate) {
		_issueShiftingOrder.setApprovalDate(approvalDate);
	}

	/**
	* Returns the approval name of this issue shifting order.
	*
	* @return the approval name of this issue shifting order
	*/
	@Override
	public java.lang.String getApprovalName() {
		return _issueShiftingOrder.getApprovalName();
	}

	/**
	* Sets the approval name of this issue shifting order.
	*
	* @param approvalName the approval name of this issue shifting order
	*/
	@Override
	public void setApprovalName(java.lang.String approvalName) {
		_issueShiftingOrder.setApprovalName(approvalName);
	}

	/**
	* Returns the remarks of this issue shifting order.
	*
	* @return the remarks of this issue shifting order
	*/
	@Override
	public java.lang.String getRemarks() {
		return _issueShiftingOrder.getRemarks();
	}

	/**
	* Sets the remarks of this issue shifting order.
	*
	* @param remarks the remarks of this issue shifting order
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_issueShiftingOrder.setRemarks(remarks);
	}

	/**
	* Returns the is cancel of this issue shifting order.
	*
	* @return the is cancel of this issue shifting order
	*/
	@Override
	public int getIsCancel() {
		return _issueShiftingOrder.getIsCancel();
	}

	/**
	* Sets the is cancel of this issue shifting order.
	*
	* @param isCancel the is cancel of this issue shifting order
	*/
	@Override
	public void setIsCancel(int isCancel) {
		_issueShiftingOrder.setIsCancel(isCancel);
	}

	/**
	* Returns the cancel date of this issue shifting order.
	*
	* @return the cancel date of this issue shifting order
	*/
	@Override
	public java.util.Date getCancelDate() {
		return _issueShiftingOrder.getCancelDate();
	}

	/**
	* Sets the cancel date of this issue shifting order.
	*
	* @param cancelDate the cancel date of this issue shifting order
	*/
	@Override
	public void setCancelDate(java.util.Date cancelDate) {
		_issueShiftingOrder.setCancelDate(cancelDate);
	}

	/**
	* Returns the cancel name of this issue shifting order.
	*
	* @return the cancel name of this issue shifting order
	*/
	@Override
	public java.lang.String getCancelName() {
		return _issueShiftingOrder.getCancelName();
	}

	/**
	* Sets the cancel name of this issue shifting order.
	*
	* @param cancelName the cancel name of this issue shifting order
	*/
	@Override
	public void setCancelName(java.lang.String cancelName) {
		_issueShiftingOrder.setCancelName(cancelName);
	}

	/**
	* Returns the cancel note of this issue shifting order.
	*
	* @return the cancel note of this issue shifting order
	*/
	@Override
	public java.lang.String getCancelNote() {
		return _issueShiftingOrder.getCancelNote();
	}

	/**
	* Sets the cancel note of this issue shifting order.
	*
	* @param cancelNote the cancel note of this issue shifting order
	*/
	@Override
	public void setCancelNote(java.lang.String cancelNote) {
		_issueShiftingOrder.setCancelNote(cancelNote);
	}

	/**
	* Returns the representative of this issue shifting order.
	*
	* @return the representative of this issue shifting order
	*/
	@Override
	public java.lang.String getRepresentative() {
		return _issueShiftingOrder.getRepresentative();
	}

	/**
	* Sets the representative of this issue shifting order.
	*
	* @param representative the representative of this issue shifting order
	*/
	@Override
	public void setRepresentative(java.lang.String representative) {
		_issueShiftingOrder.setRepresentative(representative);
	}

	/**
	* Returns the digital attached file of this issue shifting order.
	*
	* @return the digital attached file of this issue shifting order
	*/
	@Override
	public long getDigitalAttachedFile() {
		return _issueShiftingOrder.getDigitalAttachedFile();
	}

	/**
	* Sets the digital attached file of this issue shifting order.
	*
	* @param digitalAttachedFile the digital attached file of this issue shifting order
	*/
	@Override
	public void setDigitalAttachedFile(long digitalAttachedFile) {
		_issueShiftingOrder.setDigitalAttachedFile(digitalAttachedFile);
	}

	/**
	* Returns the sign date of this issue shifting order.
	*
	* @return the sign date of this issue shifting order
	*/
	@Override
	public java.util.Date getSignDate() {
		return _issueShiftingOrder.getSignDate();
	}

	/**
	* Sets the sign date of this issue shifting order.
	*
	* @param signDate the sign date of this issue shifting order
	*/
	@Override
	public void setSignDate(java.util.Date signDate) {
		_issueShiftingOrder.setSignDate(signDate);
	}

	/**
	* Returns the sign name of this issue shifting order.
	*
	* @return the sign name of this issue shifting order
	*/
	@Override
	public java.lang.String getSignName() {
		return _issueShiftingOrder.getSignName();
	}

	/**
	* Sets the sign name of this issue shifting order.
	*
	* @param signName the sign name of this issue shifting order
	*/
	@Override
	public void setSignName(java.lang.String signName) {
		_issueShiftingOrder.setSignName(signName);
	}

	/**
	* Returns the sign title of this issue shifting order.
	*
	* @return the sign title of this issue shifting order
	*/
	@Override
	public java.lang.String getSignTitle() {
		return _issueShiftingOrder.getSignTitle();
	}

	/**
	* Sets the sign title of this issue shifting order.
	*
	* @param signTitle the sign title of this issue shifting order
	*/
	@Override
	public void setSignTitle(java.lang.String signTitle) {
		_issueShiftingOrder.setSignTitle(signTitle);
	}

	/**
	* Returns the sign place of this issue shifting order.
	*
	* @return the sign place of this issue shifting order
	*/
	@Override
	public java.lang.String getSignPlace() {
		return _issueShiftingOrder.getSignPlace();
	}

	/**
	* Sets the sign place of this issue shifting order.
	*
	* @param signPlace the sign place of this issue shifting order
	*/
	@Override
	public void setSignPlace(java.lang.String signPlace) {
		_issueShiftingOrder.setSignPlace(signPlace);
	}

	/**
	* Returns the stamp status of this issue shifting order.
	*
	* @return the stamp status of this issue shifting order
	*/
	@Override
	public int getStampStatus() {
		return _issueShiftingOrder.getStampStatus();
	}

	/**
	* Sets the stamp status of this issue shifting order.
	*
	* @param stampStatus the stamp status of this issue shifting order
	*/
	@Override
	public void setStampStatus(int stampStatus) {
		_issueShiftingOrder.setStampStatus(stampStatus);
	}

	/**
	* Returns the attached file of this issue shifting order.
	*
	* @return the attached file of this issue shifting order
	*/
	@Override
	public long getAttachedFile() {
		return _issueShiftingOrder.getAttachedFile();
	}

	/**
	* Sets the attached file of this issue shifting order.
	*
	* @param attachedFile the attached file of this issue shifting order
	*/
	@Override
	public void setAttachedFile(long attachedFile) {
		_issueShiftingOrder.setAttachedFile(attachedFile);
	}

	@Override
	public boolean isNew() {
		return _issueShiftingOrder.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_issueShiftingOrder.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _issueShiftingOrder.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_issueShiftingOrder.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _issueShiftingOrder.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _issueShiftingOrder.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_issueShiftingOrder.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _issueShiftingOrder.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_issueShiftingOrder.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_issueShiftingOrder.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_issueShiftingOrder.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new IssueShiftingOrderWrapper((IssueShiftingOrder)_issueShiftingOrder.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder issueShiftingOrder) {
		return _issueShiftingOrder.compareTo(issueShiftingOrder);
	}

	@Override
	public int hashCode() {
		return _issueShiftingOrder.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder> toCacheModel() {
		return _issueShiftingOrder.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder toEscapedModel() {
		return new IssueShiftingOrderWrapper(_issueShiftingOrder.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.IssueShiftingOrder toUnescapedModel() {
		return new IssueShiftingOrderWrapper(_issueShiftingOrder.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _issueShiftingOrder.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _issueShiftingOrder.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_issueShiftingOrder.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof IssueShiftingOrderWrapper)) {
			return false;
		}

		IssueShiftingOrderWrapper issueShiftingOrderWrapper = (IssueShiftingOrderWrapper)obj;

		if (Validator.equals(_issueShiftingOrder,
					issueShiftingOrderWrapper._issueShiftingOrder)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public IssueShiftingOrder getWrappedIssueShiftingOrder() {
		return _issueShiftingOrder;
	}

	@Override
	public IssueShiftingOrder getWrappedModel() {
		return _issueShiftingOrder;
	}

	@Override
	public void resetOriginalValues() {
		_issueShiftingOrder.resetOriginalValues();
	}

	private IssueShiftingOrder _issueShiftingOrder;
}