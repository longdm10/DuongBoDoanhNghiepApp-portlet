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
 * This class is a wrapper for {@link IssuePermissionForTransit}.
 * </p>
 *
 * @author longdm
 * @see IssuePermissionForTransit
 * @generated
 */
public class IssuePermissionForTransitWrapper
	implements IssuePermissionForTransit,
		ModelWrapper<IssuePermissionForTransit> {
	public IssuePermissionForTransitWrapper(
		IssuePermissionForTransit issuePermissionForTransit) {
		_issuePermissionForTransit = issuePermissionForTransit;
	}

	@Override
	public Class<?> getModelClass() {
		return IssuePermissionForTransit.class;
	}

	@Override
	public String getModelClassName() {
		return IssuePermissionForTransit.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("requestCode", getRequestCode());
		attributes.put("numberPermissionForTransit",
			getNumberPermissionForTransit());
		attributes.put("documentName", getDocumentName());
		attributes.put("documentYear", getDocumentYear());
		attributes.put("requestState", getRequestState());
		attributes.put("portofAuthority", getPortofAuthority());
		attributes.put("nameOfShip", getNameOfShip());
		attributes.put("flagStateOfShip", getFlagStateOfShip());
		attributes.put("gt", getGt());
		attributes.put("numberOfCrews", getNumberOfCrews());
		attributes.put("numberOfPassengers", getNumberOfPassengers());
		attributes.put("callSign", getCallSign());
		attributes.put("nameOfMaster", getNameOfMaster());
		attributes.put("transitCargo", getTransitCargo());
		attributes.put("volumeCargo", getVolumeCargo());
		attributes.put("cargoUnit", getCargoUnit());
		attributes.put("permittedTransitFrom", getPermittedTransitFrom());
		attributes.put("permittedTransitTo", getPermittedTransitTo());
		attributes.put("timeOfDeparture", getTimeOfDeparture());
		attributes.put("validUntil", getValidUntil());
		attributes.put("dateOfSign", getDateOfSign());
		attributes.put("userCreated", getUserCreated());
		attributes.put("directorOfMaritime", getDirectorOfMaritime());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("certificateNo", getCertificateNo());
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

		String numberPermissionForTransit = (String)attributes.get(
				"numberPermissionForTransit");

		if (numberPermissionForTransit != null) {
			setNumberPermissionForTransit(numberPermissionForTransit);
		}

		Long documentName = (Long)attributes.get("documentName");

		if (documentName != null) {
			setDocumentName(documentName);
		}

		Integer documentYear = (Integer)attributes.get("documentYear");

		if (documentYear != null) {
			setDocumentYear(documentYear);
		}

		Integer requestState = (Integer)attributes.get("requestState");

		if (requestState != null) {
			setRequestState(requestState);
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

		Double gt = (Double)attributes.get("gt");

		if (gt != null) {
			setGt(gt);
		}

		Integer numberOfCrews = (Integer)attributes.get("numberOfCrews");

		if (numberOfCrews != null) {
			setNumberOfCrews(numberOfCrews);
		}

		Integer numberOfPassengers = (Integer)attributes.get(
				"numberOfPassengers");

		if (numberOfPassengers != null) {
			setNumberOfPassengers(numberOfPassengers);
		}

		String callSign = (String)attributes.get("callSign");

		if (callSign != null) {
			setCallSign(callSign);
		}

		String nameOfMaster = (String)attributes.get("nameOfMaster");

		if (nameOfMaster != null) {
			setNameOfMaster(nameOfMaster);
		}

		String transitCargo = (String)attributes.get("transitCargo");

		if (transitCargo != null) {
			setTransitCargo(transitCargo);
		}

		Double volumeCargo = (Double)attributes.get("volumeCargo");

		if (volumeCargo != null) {
			setVolumeCargo(volumeCargo);
		}

		String cargoUnit = (String)attributes.get("cargoUnit");

		if (cargoUnit != null) {
			setCargoUnit(cargoUnit);
		}

		String permittedTransitFrom = (String)attributes.get(
				"permittedTransitFrom");

		if (permittedTransitFrom != null) {
			setPermittedTransitFrom(permittedTransitFrom);
		}

		String permittedTransitTo = (String)attributes.get("permittedTransitTo");

		if (permittedTransitTo != null) {
			setPermittedTransitTo(permittedTransitTo);
		}

		Date timeOfDeparture = (Date)attributes.get("timeOfDeparture");

		if (timeOfDeparture != null) {
			setTimeOfDeparture(timeOfDeparture);
		}

		Date validUntil = (Date)attributes.get("validUntil");

		if (validUntil != null) {
			setValidUntil(validUntil);
		}

		Date dateOfSign = (Date)attributes.get("dateOfSign");

		if (dateOfSign != null) {
			setDateOfSign(dateOfSign);
		}

		String userCreated = (String)attributes.get("userCreated");

		if (userCreated != null) {
			setUserCreated(userCreated);
		}

		String directorOfMaritime = (String)attributes.get("directorOfMaritime");

		if (directorOfMaritime != null) {
			setDirectorOfMaritime(directorOfMaritime);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		String certificateNo = (String)attributes.get("certificateNo");

		if (certificateNo != null) {
			setCertificateNo(certificateNo);
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

		Long stampStatus = (Long)attributes.get("stampStatus");

		if (stampStatus != null) {
			setStampStatus(stampStatus);
		}

		Long attachedFile = (Long)attributes.get("attachedFile");

		if (attachedFile != null) {
			setAttachedFile(attachedFile);
		}
	}

	/**
	* Returns the primary key of this issue permission for transit.
	*
	* @return the primary key of this issue permission for transit
	*/
	@Override
	public long getPrimaryKey() {
		return _issuePermissionForTransit.getPrimaryKey();
	}

	/**
	* Sets the primary key of this issue permission for transit.
	*
	* @param primaryKey the primary key of this issue permission for transit
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_issuePermissionForTransit.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this issue permission for transit.
	*
	* @return the ID of this issue permission for transit
	*/
	@Override
	public long getId() {
		return _issuePermissionForTransit.getId();
	}

	/**
	* Sets the ID of this issue permission for transit.
	*
	* @param id the ID of this issue permission for transit
	*/
	@Override
	public void setId(long id) {
		_issuePermissionForTransit.setId(id);
	}

	/**
	* Returns the request code of this issue permission for transit.
	*
	* @return the request code of this issue permission for transit
	*/
	@Override
	public java.lang.String getRequestCode() {
		return _issuePermissionForTransit.getRequestCode();
	}

	/**
	* Sets the request code of this issue permission for transit.
	*
	* @param requestCode the request code of this issue permission for transit
	*/
	@Override
	public void setRequestCode(java.lang.String requestCode) {
		_issuePermissionForTransit.setRequestCode(requestCode);
	}

	/**
	* Returns the number permission for transit of this issue permission for transit.
	*
	* @return the number permission for transit of this issue permission for transit
	*/
	@Override
	public java.lang.String getNumberPermissionForTransit() {
		return _issuePermissionForTransit.getNumberPermissionForTransit();
	}

	/**
	* Sets the number permission for transit of this issue permission for transit.
	*
	* @param numberPermissionForTransit the number permission for transit of this issue permission for transit
	*/
	@Override
	public void setNumberPermissionForTransit(
		java.lang.String numberPermissionForTransit) {
		_issuePermissionForTransit.setNumberPermissionForTransit(numberPermissionForTransit);
	}

	/**
	* Returns the document name of this issue permission for transit.
	*
	* @return the document name of this issue permission for transit
	*/
	@Override
	public long getDocumentName() {
		return _issuePermissionForTransit.getDocumentName();
	}

	/**
	* Sets the document name of this issue permission for transit.
	*
	* @param documentName the document name of this issue permission for transit
	*/
	@Override
	public void setDocumentName(long documentName) {
		_issuePermissionForTransit.setDocumentName(documentName);
	}

	/**
	* Returns the document year of this issue permission for transit.
	*
	* @return the document year of this issue permission for transit
	*/
	@Override
	public int getDocumentYear() {
		return _issuePermissionForTransit.getDocumentYear();
	}

	/**
	* Sets the document year of this issue permission for transit.
	*
	* @param documentYear the document year of this issue permission for transit
	*/
	@Override
	public void setDocumentYear(int documentYear) {
		_issuePermissionForTransit.setDocumentYear(documentYear);
	}

	/**
	* Returns the request state of this issue permission for transit.
	*
	* @return the request state of this issue permission for transit
	*/
	@Override
	public int getRequestState() {
		return _issuePermissionForTransit.getRequestState();
	}

	/**
	* Sets the request state of this issue permission for transit.
	*
	* @param requestState the request state of this issue permission for transit
	*/
	@Override
	public void setRequestState(int requestState) {
		_issuePermissionForTransit.setRequestState(requestState);
	}

	/**
	* Returns the portof authority of this issue permission for transit.
	*
	* @return the portof authority of this issue permission for transit
	*/
	@Override
	public java.lang.String getPortofAuthority() {
		return _issuePermissionForTransit.getPortofAuthority();
	}

	/**
	* Sets the portof authority of this issue permission for transit.
	*
	* @param portofAuthority the portof authority of this issue permission for transit
	*/
	@Override
	public void setPortofAuthority(java.lang.String portofAuthority) {
		_issuePermissionForTransit.setPortofAuthority(portofAuthority);
	}

	/**
	* Returns the name of ship of this issue permission for transit.
	*
	* @return the name of ship of this issue permission for transit
	*/
	@Override
	public java.lang.String getNameOfShip() {
		return _issuePermissionForTransit.getNameOfShip();
	}

	/**
	* Sets the name of ship of this issue permission for transit.
	*
	* @param nameOfShip the name of ship of this issue permission for transit
	*/
	@Override
	public void setNameOfShip(java.lang.String nameOfShip) {
		_issuePermissionForTransit.setNameOfShip(nameOfShip);
	}

	/**
	* Returns the flag state of ship of this issue permission for transit.
	*
	* @return the flag state of ship of this issue permission for transit
	*/
	@Override
	public java.lang.String getFlagStateOfShip() {
		return _issuePermissionForTransit.getFlagStateOfShip();
	}

	/**
	* Sets the flag state of ship of this issue permission for transit.
	*
	* @param flagStateOfShip the flag state of ship of this issue permission for transit
	*/
	@Override
	public void setFlagStateOfShip(java.lang.String flagStateOfShip) {
		_issuePermissionForTransit.setFlagStateOfShip(flagStateOfShip);
	}

	/**
	* Returns the gt of this issue permission for transit.
	*
	* @return the gt of this issue permission for transit
	*/
	@Override
	public double getGt() {
		return _issuePermissionForTransit.getGt();
	}

	/**
	* Sets the gt of this issue permission for transit.
	*
	* @param gt the gt of this issue permission for transit
	*/
	@Override
	public void setGt(double gt) {
		_issuePermissionForTransit.setGt(gt);
	}

	/**
	* Returns the number of crews of this issue permission for transit.
	*
	* @return the number of crews of this issue permission for transit
	*/
	@Override
	public int getNumberOfCrews() {
		return _issuePermissionForTransit.getNumberOfCrews();
	}

	/**
	* Sets the number of crews of this issue permission for transit.
	*
	* @param numberOfCrews the number of crews of this issue permission for transit
	*/
	@Override
	public void setNumberOfCrews(int numberOfCrews) {
		_issuePermissionForTransit.setNumberOfCrews(numberOfCrews);
	}

	/**
	* Returns the number of passengers of this issue permission for transit.
	*
	* @return the number of passengers of this issue permission for transit
	*/
	@Override
	public int getNumberOfPassengers() {
		return _issuePermissionForTransit.getNumberOfPassengers();
	}

	/**
	* Sets the number of passengers of this issue permission for transit.
	*
	* @param numberOfPassengers the number of passengers of this issue permission for transit
	*/
	@Override
	public void setNumberOfPassengers(int numberOfPassengers) {
		_issuePermissionForTransit.setNumberOfPassengers(numberOfPassengers);
	}

	/**
	* Returns the call sign of this issue permission for transit.
	*
	* @return the call sign of this issue permission for transit
	*/
	@Override
	public java.lang.String getCallSign() {
		return _issuePermissionForTransit.getCallSign();
	}

	/**
	* Sets the call sign of this issue permission for transit.
	*
	* @param callSign the call sign of this issue permission for transit
	*/
	@Override
	public void setCallSign(java.lang.String callSign) {
		_issuePermissionForTransit.setCallSign(callSign);
	}

	/**
	* Returns the name of master of this issue permission for transit.
	*
	* @return the name of master of this issue permission for transit
	*/
	@Override
	public java.lang.String getNameOfMaster() {
		return _issuePermissionForTransit.getNameOfMaster();
	}

	/**
	* Sets the name of master of this issue permission for transit.
	*
	* @param nameOfMaster the name of master of this issue permission for transit
	*/
	@Override
	public void setNameOfMaster(java.lang.String nameOfMaster) {
		_issuePermissionForTransit.setNameOfMaster(nameOfMaster);
	}

	/**
	* Returns the transit cargo of this issue permission for transit.
	*
	* @return the transit cargo of this issue permission for transit
	*/
	@Override
	public java.lang.String getTransitCargo() {
		return _issuePermissionForTransit.getTransitCargo();
	}

	/**
	* Sets the transit cargo of this issue permission for transit.
	*
	* @param transitCargo the transit cargo of this issue permission for transit
	*/
	@Override
	public void setTransitCargo(java.lang.String transitCargo) {
		_issuePermissionForTransit.setTransitCargo(transitCargo);
	}

	/**
	* Returns the volume cargo of this issue permission for transit.
	*
	* @return the volume cargo of this issue permission for transit
	*/
	@Override
	public double getVolumeCargo() {
		return _issuePermissionForTransit.getVolumeCargo();
	}

	/**
	* Sets the volume cargo of this issue permission for transit.
	*
	* @param volumeCargo the volume cargo of this issue permission for transit
	*/
	@Override
	public void setVolumeCargo(double volumeCargo) {
		_issuePermissionForTransit.setVolumeCargo(volumeCargo);
	}

	/**
	* Returns the cargo unit of this issue permission for transit.
	*
	* @return the cargo unit of this issue permission for transit
	*/
	@Override
	public java.lang.String getCargoUnit() {
		return _issuePermissionForTransit.getCargoUnit();
	}

	/**
	* Sets the cargo unit of this issue permission for transit.
	*
	* @param cargoUnit the cargo unit of this issue permission for transit
	*/
	@Override
	public void setCargoUnit(java.lang.String cargoUnit) {
		_issuePermissionForTransit.setCargoUnit(cargoUnit);
	}

	/**
	* Returns the permitted transit from of this issue permission for transit.
	*
	* @return the permitted transit from of this issue permission for transit
	*/
	@Override
	public java.lang.String getPermittedTransitFrom() {
		return _issuePermissionForTransit.getPermittedTransitFrom();
	}

	/**
	* Sets the permitted transit from of this issue permission for transit.
	*
	* @param permittedTransitFrom the permitted transit from of this issue permission for transit
	*/
	@Override
	public void setPermittedTransitFrom(java.lang.String permittedTransitFrom) {
		_issuePermissionForTransit.setPermittedTransitFrom(permittedTransitFrom);
	}

	/**
	* Returns the permitted transit to of this issue permission for transit.
	*
	* @return the permitted transit to of this issue permission for transit
	*/
	@Override
	public java.lang.String getPermittedTransitTo() {
		return _issuePermissionForTransit.getPermittedTransitTo();
	}

	/**
	* Sets the permitted transit to of this issue permission for transit.
	*
	* @param permittedTransitTo the permitted transit to of this issue permission for transit
	*/
	@Override
	public void setPermittedTransitTo(java.lang.String permittedTransitTo) {
		_issuePermissionForTransit.setPermittedTransitTo(permittedTransitTo);
	}

	/**
	* Returns the time of departure of this issue permission for transit.
	*
	* @return the time of departure of this issue permission for transit
	*/
	@Override
	public java.util.Date getTimeOfDeparture() {
		return _issuePermissionForTransit.getTimeOfDeparture();
	}

	/**
	* Sets the time of departure of this issue permission for transit.
	*
	* @param timeOfDeparture the time of departure of this issue permission for transit
	*/
	@Override
	public void setTimeOfDeparture(java.util.Date timeOfDeparture) {
		_issuePermissionForTransit.setTimeOfDeparture(timeOfDeparture);
	}

	/**
	* Returns the valid until of this issue permission for transit.
	*
	* @return the valid until of this issue permission for transit
	*/
	@Override
	public java.util.Date getValidUntil() {
		return _issuePermissionForTransit.getValidUntil();
	}

	/**
	* Sets the valid until of this issue permission for transit.
	*
	* @param validUntil the valid until of this issue permission for transit
	*/
	@Override
	public void setValidUntil(java.util.Date validUntil) {
		_issuePermissionForTransit.setValidUntil(validUntil);
	}

	/**
	* Returns the date of sign of this issue permission for transit.
	*
	* @return the date of sign of this issue permission for transit
	*/
	@Override
	public java.util.Date getDateOfSign() {
		return _issuePermissionForTransit.getDateOfSign();
	}

	/**
	* Sets the date of sign of this issue permission for transit.
	*
	* @param dateOfSign the date of sign of this issue permission for transit
	*/
	@Override
	public void setDateOfSign(java.util.Date dateOfSign) {
		_issuePermissionForTransit.setDateOfSign(dateOfSign);
	}

	/**
	* Returns the user created of this issue permission for transit.
	*
	* @return the user created of this issue permission for transit
	*/
	@Override
	public java.lang.String getUserCreated() {
		return _issuePermissionForTransit.getUserCreated();
	}

	/**
	* Sets the user created of this issue permission for transit.
	*
	* @param userCreated the user created of this issue permission for transit
	*/
	@Override
	public void setUserCreated(java.lang.String userCreated) {
		_issuePermissionForTransit.setUserCreated(userCreated);
	}

	/**
	* Returns the director of maritime of this issue permission for transit.
	*
	* @return the director of maritime of this issue permission for transit
	*/
	@Override
	public java.lang.String getDirectorOfMaritime() {
		return _issuePermissionForTransit.getDirectorOfMaritime();
	}

	/**
	* Sets the director of maritime of this issue permission for transit.
	*
	* @param directorOfMaritime the director of maritime of this issue permission for transit
	*/
	@Override
	public void setDirectorOfMaritime(java.lang.String directorOfMaritime) {
		_issuePermissionForTransit.setDirectorOfMaritime(directorOfMaritime);
	}

	/**
	* Returns the created date of this issue permission for transit.
	*
	* @return the created date of this issue permission for transit
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _issuePermissionForTransit.getCreatedDate();
	}

	/**
	* Sets the created date of this issue permission for transit.
	*
	* @param createdDate the created date of this issue permission for transit
	*/
	@Override
	public void setCreatedDate(java.util.Date createdDate) {
		_issuePermissionForTransit.setCreatedDate(createdDate);
	}

	/**
	* Returns the certificate no of this issue permission for transit.
	*
	* @return the certificate no of this issue permission for transit
	*/
	@Override
	public java.lang.String getCertificateNo() {
		return _issuePermissionForTransit.getCertificateNo();
	}

	/**
	* Sets the certificate no of this issue permission for transit.
	*
	* @param certificateNo the certificate no of this issue permission for transit
	*/
	@Override
	public void setCertificateNo(java.lang.String certificateNo) {
		_issuePermissionForTransit.setCertificateNo(certificateNo);
	}

	/**
	* Returns the version no of this issue permission for transit.
	*
	* @return the version no of this issue permission for transit
	*/
	@Override
	public java.lang.String getVersionNo() {
		return _issuePermissionForTransit.getVersionNo();
	}

	/**
	* Sets the version no of this issue permission for transit.
	*
	* @param versionNo the version no of this issue permission for transit
	*/
	@Override
	public void setVersionNo(java.lang.String versionNo) {
		_issuePermissionForTransit.setVersionNo(versionNo);
	}

	/**
	* Returns the is approval of this issue permission for transit.
	*
	* @return the is approval of this issue permission for transit
	*/
	@Override
	public int getIsApproval() {
		return _issuePermissionForTransit.getIsApproval();
	}

	/**
	* Sets the is approval of this issue permission for transit.
	*
	* @param isApproval the is approval of this issue permission for transit
	*/
	@Override
	public void setIsApproval(int isApproval) {
		_issuePermissionForTransit.setIsApproval(isApproval);
	}

	/**
	* Returns the approval date of this issue permission for transit.
	*
	* @return the approval date of this issue permission for transit
	*/
	@Override
	public java.util.Date getApprovalDate() {
		return _issuePermissionForTransit.getApprovalDate();
	}

	/**
	* Sets the approval date of this issue permission for transit.
	*
	* @param approvalDate the approval date of this issue permission for transit
	*/
	@Override
	public void setApprovalDate(java.util.Date approvalDate) {
		_issuePermissionForTransit.setApprovalDate(approvalDate);
	}

	/**
	* Returns the approval name of this issue permission for transit.
	*
	* @return the approval name of this issue permission for transit
	*/
	@Override
	public java.lang.String getApprovalName() {
		return _issuePermissionForTransit.getApprovalName();
	}

	/**
	* Sets the approval name of this issue permission for transit.
	*
	* @param approvalName the approval name of this issue permission for transit
	*/
	@Override
	public void setApprovalName(java.lang.String approvalName) {
		_issuePermissionForTransit.setApprovalName(approvalName);
	}

	/**
	* Returns the remarks of this issue permission for transit.
	*
	* @return the remarks of this issue permission for transit
	*/
	@Override
	public java.lang.String getRemarks() {
		return _issuePermissionForTransit.getRemarks();
	}

	/**
	* Sets the remarks of this issue permission for transit.
	*
	* @param remarks the remarks of this issue permission for transit
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_issuePermissionForTransit.setRemarks(remarks);
	}

	/**
	* Returns the is cancel of this issue permission for transit.
	*
	* @return the is cancel of this issue permission for transit
	*/
	@Override
	public int getIsCancel() {
		return _issuePermissionForTransit.getIsCancel();
	}

	/**
	* Sets the is cancel of this issue permission for transit.
	*
	* @param isCancel the is cancel of this issue permission for transit
	*/
	@Override
	public void setIsCancel(int isCancel) {
		_issuePermissionForTransit.setIsCancel(isCancel);
	}

	/**
	* Returns the cancel date of this issue permission for transit.
	*
	* @return the cancel date of this issue permission for transit
	*/
	@Override
	public java.util.Date getCancelDate() {
		return _issuePermissionForTransit.getCancelDate();
	}

	/**
	* Sets the cancel date of this issue permission for transit.
	*
	* @param cancelDate the cancel date of this issue permission for transit
	*/
	@Override
	public void setCancelDate(java.util.Date cancelDate) {
		_issuePermissionForTransit.setCancelDate(cancelDate);
	}

	/**
	* Returns the cancel name of this issue permission for transit.
	*
	* @return the cancel name of this issue permission for transit
	*/
	@Override
	public java.lang.String getCancelName() {
		return _issuePermissionForTransit.getCancelName();
	}

	/**
	* Sets the cancel name of this issue permission for transit.
	*
	* @param cancelName the cancel name of this issue permission for transit
	*/
	@Override
	public void setCancelName(java.lang.String cancelName) {
		_issuePermissionForTransit.setCancelName(cancelName);
	}

	/**
	* Returns the cancel note of this issue permission for transit.
	*
	* @return the cancel note of this issue permission for transit
	*/
	@Override
	public java.lang.String getCancelNote() {
		return _issuePermissionForTransit.getCancelNote();
	}

	/**
	* Sets the cancel note of this issue permission for transit.
	*
	* @param cancelNote the cancel note of this issue permission for transit
	*/
	@Override
	public void setCancelNote(java.lang.String cancelNote) {
		_issuePermissionForTransit.setCancelNote(cancelNote);
	}

	/**
	* Returns the representative of this issue permission for transit.
	*
	* @return the representative of this issue permission for transit
	*/
	@Override
	public java.lang.String getRepresentative() {
		return _issuePermissionForTransit.getRepresentative();
	}

	/**
	* Sets the representative of this issue permission for transit.
	*
	* @param representative the representative of this issue permission for transit
	*/
	@Override
	public void setRepresentative(java.lang.String representative) {
		_issuePermissionForTransit.setRepresentative(representative);
	}

	/**
	* Returns the digital attached file of this issue permission for transit.
	*
	* @return the digital attached file of this issue permission for transit
	*/
	@Override
	public long getDigitalAttachedFile() {
		return _issuePermissionForTransit.getDigitalAttachedFile();
	}

	/**
	* Sets the digital attached file of this issue permission for transit.
	*
	* @param digitalAttachedFile the digital attached file of this issue permission for transit
	*/
	@Override
	public void setDigitalAttachedFile(long digitalAttachedFile) {
		_issuePermissionForTransit.setDigitalAttachedFile(digitalAttachedFile);
	}

	/**
	* Returns the sign date of this issue permission for transit.
	*
	* @return the sign date of this issue permission for transit
	*/
	@Override
	public java.util.Date getSignDate() {
		return _issuePermissionForTransit.getSignDate();
	}

	/**
	* Sets the sign date of this issue permission for transit.
	*
	* @param signDate the sign date of this issue permission for transit
	*/
	@Override
	public void setSignDate(java.util.Date signDate) {
		_issuePermissionForTransit.setSignDate(signDate);
	}

	/**
	* Returns the sign name of this issue permission for transit.
	*
	* @return the sign name of this issue permission for transit
	*/
	@Override
	public java.lang.String getSignName() {
		return _issuePermissionForTransit.getSignName();
	}

	/**
	* Sets the sign name of this issue permission for transit.
	*
	* @param signName the sign name of this issue permission for transit
	*/
	@Override
	public void setSignName(java.lang.String signName) {
		_issuePermissionForTransit.setSignName(signName);
	}

	/**
	* Returns the sign title of this issue permission for transit.
	*
	* @return the sign title of this issue permission for transit
	*/
	@Override
	public java.lang.String getSignTitle() {
		return _issuePermissionForTransit.getSignTitle();
	}

	/**
	* Sets the sign title of this issue permission for transit.
	*
	* @param signTitle the sign title of this issue permission for transit
	*/
	@Override
	public void setSignTitle(java.lang.String signTitle) {
		_issuePermissionForTransit.setSignTitle(signTitle);
	}

	/**
	* Returns the sign place of this issue permission for transit.
	*
	* @return the sign place of this issue permission for transit
	*/
	@Override
	public java.lang.String getSignPlace() {
		return _issuePermissionForTransit.getSignPlace();
	}

	/**
	* Sets the sign place of this issue permission for transit.
	*
	* @param signPlace the sign place of this issue permission for transit
	*/
	@Override
	public void setSignPlace(java.lang.String signPlace) {
		_issuePermissionForTransit.setSignPlace(signPlace);
	}

	/**
	* Returns the stamp status of this issue permission for transit.
	*
	* @return the stamp status of this issue permission for transit
	*/
	@Override
	public long getStampStatus() {
		return _issuePermissionForTransit.getStampStatus();
	}

	/**
	* Sets the stamp status of this issue permission for transit.
	*
	* @param stampStatus the stamp status of this issue permission for transit
	*/
	@Override
	public void setStampStatus(long stampStatus) {
		_issuePermissionForTransit.setStampStatus(stampStatus);
	}

	/**
	* Returns the attached file of this issue permission for transit.
	*
	* @return the attached file of this issue permission for transit
	*/
	@Override
	public long getAttachedFile() {
		return _issuePermissionForTransit.getAttachedFile();
	}

	/**
	* Sets the attached file of this issue permission for transit.
	*
	* @param attachedFile the attached file of this issue permission for transit
	*/
	@Override
	public void setAttachedFile(long attachedFile) {
		_issuePermissionForTransit.setAttachedFile(attachedFile);
	}

	@Override
	public boolean isNew() {
		return _issuePermissionForTransit.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_issuePermissionForTransit.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _issuePermissionForTransit.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_issuePermissionForTransit.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _issuePermissionForTransit.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _issuePermissionForTransit.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_issuePermissionForTransit.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _issuePermissionForTransit.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_issuePermissionForTransit.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_issuePermissionForTransit.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_issuePermissionForTransit.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new IssuePermissionForTransitWrapper((IssuePermissionForTransit)_issuePermissionForTransit.clone());
	}

	@Override
	public int compareTo(IssuePermissionForTransit issuePermissionForTransit) {
		return _issuePermissionForTransit.compareTo(issuePermissionForTransit);
	}

	@Override
	public int hashCode() {
		return _issuePermissionForTransit.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<IssuePermissionForTransit> toCacheModel() {
		return _issuePermissionForTransit.toCacheModel();
	}

	@Override
	public IssuePermissionForTransit toEscapedModel() {
		return new IssuePermissionForTransitWrapper(_issuePermissionForTransit.toEscapedModel());
	}

	@Override
	public IssuePermissionForTransit toUnescapedModel() {
		return new IssuePermissionForTransitWrapper(_issuePermissionForTransit.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _issuePermissionForTransit.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _issuePermissionForTransit.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_issuePermissionForTransit.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof IssuePermissionForTransitWrapper)) {
			return false;
		}

		IssuePermissionForTransitWrapper issuePermissionForTransitWrapper = (IssuePermissionForTransitWrapper)obj;

		if (Validator.equals(_issuePermissionForTransit,
					issuePermissionForTransitWrapper._issuePermissionForTransit)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public IssuePermissionForTransit getWrappedIssuePermissionForTransit() {
		return _issuePermissionForTransit;
	}

	@Override
	public IssuePermissionForTransit getWrappedModel() {
		return _issuePermissionForTransit;
	}

	@Override
	public void resetOriginalValues() {
		_issuePermissionForTransit.resetOriginalValues();
	}

	private IssuePermissionForTransit _issuePermissionForTransit;
}