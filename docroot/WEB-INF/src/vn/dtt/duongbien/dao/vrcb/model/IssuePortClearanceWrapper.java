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
 * This class is a wrapper for {@link IssuePortClearance}.
 * </p>
 *
 * @author longdm
 * @see IssuePortClearance
 * @generated
 */
public class IssuePortClearanceWrapper implements IssuePortClearance,
	ModelWrapper<IssuePortClearance> {
	public IssuePortClearanceWrapper(IssuePortClearance issuePortClearance) {
		_issuePortClearance = issuePortClearance;
	}

	@Override
	public Class<?> getModelClass() {
		return IssuePortClearance.class;
	}

	@Override
	public String getModelClassName() {
		return IssuePortClearance.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("requestCode", getRequestCode());
		attributes.put("numberPortClearance", getNumberPortClearance());
		attributes.put("documentName", getDocumentName());
		attributes.put("documentYear", getDocumentYear());
		attributes.put("portofAuthority", getPortofAuthority());
		attributes.put("nameOfShip", getNameOfShip());
		attributes.put("flagStateOfShip", getFlagStateOfShip());
		attributes.put("numberOfCrews", getNumberOfCrews());
		attributes.put("numberOfPassengers", getNumberOfPassengers());
		attributes.put("callSign", getCallSign());
		attributes.put("nameOfMaster", getNameOfMaster());
		attributes.put("cargo", getCargo());
		attributes.put("volumeCargo", getVolumeCargo());
		attributes.put("cargoUnit", getCargoUnit());
		attributes.put("transitCargo", getTransitCargo());
		attributes.put("volumeTransitCargo", getVolumeTransitCargo());
		attributes.put("transitCargoUnit", getTransitCargoUnit());
		attributes.put("timeOfDeparture", getTimeOfDeparture());
		attributes.put("nextPortOfCallCode", getNextPortOfCallCode());
		attributes.put("validUntil", getValidUntil());
		attributes.put("issueDate", getIssueDate());
		attributes.put("directorOfMaritime", getDirectorOfMaritime());
		attributes.put("certificateNo", getCertificateNo());
		attributes.put("requestState", getRequestState());
		attributes.put("gt", getGt());
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

		String numberPortClearance = (String)attributes.get(
				"numberPortClearance");

		if (numberPortClearance != null) {
			setNumberPortClearance(numberPortClearance);
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

		String cargo = (String)attributes.get("cargo");

		if (cargo != null) {
			setCargo(cargo);
		}

		Double volumeCargo = (Double)attributes.get("volumeCargo");

		if (volumeCargo != null) {
			setVolumeCargo(volumeCargo);
		}

		String cargoUnit = (String)attributes.get("cargoUnit");

		if (cargoUnit != null) {
			setCargoUnit(cargoUnit);
		}

		String transitCargo = (String)attributes.get("transitCargo");

		if (transitCargo != null) {
			setTransitCargo(transitCargo);
		}

		Double volumeTransitCargo = (Double)attributes.get("volumeTransitCargo");

		if (volumeTransitCargo != null) {
			setVolumeTransitCargo(volumeTransitCargo);
		}

		String transitCargoUnit = (String)attributes.get("transitCargoUnit");

		if (transitCargoUnit != null) {
			setTransitCargoUnit(transitCargoUnit);
		}

		Date timeOfDeparture = (Date)attributes.get("timeOfDeparture");

		if (timeOfDeparture != null) {
			setTimeOfDeparture(timeOfDeparture);
		}

		String nextPortOfCallCode = (String)attributes.get("nextPortOfCallCode");

		if (nextPortOfCallCode != null) {
			setNextPortOfCallCode(nextPortOfCallCode);
		}

		Date validUntil = (Date)attributes.get("validUntil");

		if (validUntil != null) {
			setValidUntil(validUntil);
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

		Double gt = (Double)attributes.get("gt");

		if (gt != null) {
			setGt(gt);
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
	* Returns the primary key of this issue port clearance.
	*
	* @return the primary key of this issue port clearance
	*/
	@Override
	public long getPrimaryKey() {
		return _issuePortClearance.getPrimaryKey();
	}

	/**
	* Sets the primary key of this issue port clearance.
	*
	* @param primaryKey the primary key of this issue port clearance
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_issuePortClearance.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this issue port clearance.
	*
	* @return the ID of this issue port clearance
	*/
	@Override
	public long getId() {
		return _issuePortClearance.getId();
	}

	/**
	* Sets the ID of this issue port clearance.
	*
	* @param id the ID of this issue port clearance
	*/
	@Override
	public void setId(long id) {
		_issuePortClearance.setId(id);
	}

	/**
	* Returns the request code of this issue port clearance.
	*
	* @return the request code of this issue port clearance
	*/
	@Override
	public java.lang.String getRequestCode() {
		return _issuePortClearance.getRequestCode();
	}

	/**
	* Sets the request code of this issue port clearance.
	*
	* @param requestCode the request code of this issue port clearance
	*/
	@Override
	public void setRequestCode(java.lang.String requestCode) {
		_issuePortClearance.setRequestCode(requestCode);
	}

	/**
	* Returns the number port clearance of this issue port clearance.
	*
	* @return the number port clearance of this issue port clearance
	*/
	@Override
	public java.lang.String getNumberPortClearance() {
		return _issuePortClearance.getNumberPortClearance();
	}

	/**
	* Sets the number port clearance of this issue port clearance.
	*
	* @param numberPortClearance the number port clearance of this issue port clearance
	*/
	@Override
	public void setNumberPortClearance(java.lang.String numberPortClearance) {
		_issuePortClearance.setNumberPortClearance(numberPortClearance);
	}

	/**
	* Returns the document name of this issue port clearance.
	*
	* @return the document name of this issue port clearance
	*/
	@Override
	public long getDocumentName() {
		return _issuePortClearance.getDocumentName();
	}

	/**
	* Sets the document name of this issue port clearance.
	*
	* @param documentName the document name of this issue port clearance
	*/
	@Override
	public void setDocumentName(long documentName) {
		_issuePortClearance.setDocumentName(documentName);
	}

	/**
	* Returns the document year of this issue port clearance.
	*
	* @return the document year of this issue port clearance
	*/
	@Override
	public int getDocumentYear() {
		return _issuePortClearance.getDocumentYear();
	}

	/**
	* Sets the document year of this issue port clearance.
	*
	* @param documentYear the document year of this issue port clearance
	*/
	@Override
	public void setDocumentYear(int documentYear) {
		_issuePortClearance.setDocumentYear(documentYear);
	}

	/**
	* Returns the portof authority of this issue port clearance.
	*
	* @return the portof authority of this issue port clearance
	*/
	@Override
	public java.lang.String getPortofAuthority() {
		return _issuePortClearance.getPortofAuthority();
	}

	/**
	* Sets the portof authority of this issue port clearance.
	*
	* @param portofAuthority the portof authority of this issue port clearance
	*/
	@Override
	public void setPortofAuthority(java.lang.String portofAuthority) {
		_issuePortClearance.setPortofAuthority(portofAuthority);
	}

	/**
	* Returns the name of ship of this issue port clearance.
	*
	* @return the name of ship of this issue port clearance
	*/
	@Override
	public java.lang.String getNameOfShip() {
		return _issuePortClearance.getNameOfShip();
	}

	/**
	* Sets the name of ship of this issue port clearance.
	*
	* @param nameOfShip the name of ship of this issue port clearance
	*/
	@Override
	public void setNameOfShip(java.lang.String nameOfShip) {
		_issuePortClearance.setNameOfShip(nameOfShip);
	}

	/**
	* Returns the flag state of ship of this issue port clearance.
	*
	* @return the flag state of ship of this issue port clearance
	*/
	@Override
	public java.lang.String getFlagStateOfShip() {
		return _issuePortClearance.getFlagStateOfShip();
	}

	/**
	* Sets the flag state of ship of this issue port clearance.
	*
	* @param flagStateOfShip the flag state of ship of this issue port clearance
	*/
	@Override
	public void setFlagStateOfShip(java.lang.String flagStateOfShip) {
		_issuePortClearance.setFlagStateOfShip(flagStateOfShip);
	}

	/**
	* Returns the number of crews of this issue port clearance.
	*
	* @return the number of crews of this issue port clearance
	*/
	@Override
	public int getNumberOfCrews() {
		return _issuePortClearance.getNumberOfCrews();
	}

	/**
	* Sets the number of crews of this issue port clearance.
	*
	* @param numberOfCrews the number of crews of this issue port clearance
	*/
	@Override
	public void setNumberOfCrews(int numberOfCrews) {
		_issuePortClearance.setNumberOfCrews(numberOfCrews);
	}

	/**
	* Returns the number of passengers of this issue port clearance.
	*
	* @return the number of passengers of this issue port clearance
	*/
	@Override
	public int getNumberOfPassengers() {
		return _issuePortClearance.getNumberOfPassengers();
	}

	/**
	* Sets the number of passengers of this issue port clearance.
	*
	* @param numberOfPassengers the number of passengers of this issue port clearance
	*/
	@Override
	public void setNumberOfPassengers(int numberOfPassengers) {
		_issuePortClearance.setNumberOfPassengers(numberOfPassengers);
	}

	/**
	* Returns the call sign of this issue port clearance.
	*
	* @return the call sign of this issue port clearance
	*/
	@Override
	public java.lang.String getCallSign() {
		return _issuePortClearance.getCallSign();
	}

	/**
	* Sets the call sign of this issue port clearance.
	*
	* @param callSign the call sign of this issue port clearance
	*/
	@Override
	public void setCallSign(java.lang.String callSign) {
		_issuePortClearance.setCallSign(callSign);
	}

	/**
	* Returns the name of master of this issue port clearance.
	*
	* @return the name of master of this issue port clearance
	*/
	@Override
	public java.lang.String getNameOfMaster() {
		return _issuePortClearance.getNameOfMaster();
	}

	/**
	* Sets the name of master of this issue port clearance.
	*
	* @param nameOfMaster the name of master of this issue port clearance
	*/
	@Override
	public void setNameOfMaster(java.lang.String nameOfMaster) {
		_issuePortClearance.setNameOfMaster(nameOfMaster);
	}

	/**
	* Returns the cargo of this issue port clearance.
	*
	* @return the cargo of this issue port clearance
	*/
	@Override
	public java.lang.String getCargo() {
		return _issuePortClearance.getCargo();
	}

	/**
	* Sets the cargo of this issue port clearance.
	*
	* @param cargo the cargo of this issue port clearance
	*/
	@Override
	public void setCargo(java.lang.String cargo) {
		_issuePortClearance.setCargo(cargo);
	}

	/**
	* Returns the volume cargo of this issue port clearance.
	*
	* @return the volume cargo of this issue port clearance
	*/
	@Override
	public double getVolumeCargo() {
		return _issuePortClearance.getVolumeCargo();
	}

	/**
	* Sets the volume cargo of this issue port clearance.
	*
	* @param volumeCargo the volume cargo of this issue port clearance
	*/
	@Override
	public void setVolumeCargo(double volumeCargo) {
		_issuePortClearance.setVolumeCargo(volumeCargo);
	}

	/**
	* Returns the cargo unit of this issue port clearance.
	*
	* @return the cargo unit of this issue port clearance
	*/
	@Override
	public java.lang.String getCargoUnit() {
		return _issuePortClearance.getCargoUnit();
	}

	/**
	* Sets the cargo unit of this issue port clearance.
	*
	* @param cargoUnit the cargo unit of this issue port clearance
	*/
	@Override
	public void setCargoUnit(java.lang.String cargoUnit) {
		_issuePortClearance.setCargoUnit(cargoUnit);
	}

	/**
	* Returns the transit cargo of this issue port clearance.
	*
	* @return the transit cargo of this issue port clearance
	*/
	@Override
	public java.lang.String getTransitCargo() {
		return _issuePortClearance.getTransitCargo();
	}

	/**
	* Sets the transit cargo of this issue port clearance.
	*
	* @param transitCargo the transit cargo of this issue port clearance
	*/
	@Override
	public void setTransitCargo(java.lang.String transitCargo) {
		_issuePortClearance.setTransitCargo(transitCargo);
	}

	/**
	* Returns the volume transit cargo of this issue port clearance.
	*
	* @return the volume transit cargo of this issue port clearance
	*/
	@Override
	public double getVolumeTransitCargo() {
		return _issuePortClearance.getVolumeTransitCargo();
	}

	/**
	* Sets the volume transit cargo of this issue port clearance.
	*
	* @param volumeTransitCargo the volume transit cargo of this issue port clearance
	*/
	@Override
	public void setVolumeTransitCargo(double volumeTransitCargo) {
		_issuePortClearance.setVolumeTransitCargo(volumeTransitCargo);
	}

	/**
	* Returns the transit cargo unit of this issue port clearance.
	*
	* @return the transit cargo unit of this issue port clearance
	*/
	@Override
	public java.lang.String getTransitCargoUnit() {
		return _issuePortClearance.getTransitCargoUnit();
	}

	/**
	* Sets the transit cargo unit of this issue port clearance.
	*
	* @param transitCargoUnit the transit cargo unit of this issue port clearance
	*/
	@Override
	public void setTransitCargoUnit(java.lang.String transitCargoUnit) {
		_issuePortClearance.setTransitCargoUnit(transitCargoUnit);
	}

	/**
	* Returns the time of departure of this issue port clearance.
	*
	* @return the time of departure of this issue port clearance
	*/
	@Override
	public java.util.Date getTimeOfDeparture() {
		return _issuePortClearance.getTimeOfDeparture();
	}

	/**
	* Sets the time of departure of this issue port clearance.
	*
	* @param timeOfDeparture the time of departure of this issue port clearance
	*/
	@Override
	public void setTimeOfDeparture(java.util.Date timeOfDeparture) {
		_issuePortClearance.setTimeOfDeparture(timeOfDeparture);
	}

	/**
	* Returns the next port of call code of this issue port clearance.
	*
	* @return the next port of call code of this issue port clearance
	*/
	@Override
	public java.lang.String getNextPortOfCallCode() {
		return _issuePortClearance.getNextPortOfCallCode();
	}

	/**
	* Sets the next port of call code of this issue port clearance.
	*
	* @param nextPortOfCallCode the next port of call code of this issue port clearance
	*/
	@Override
	public void setNextPortOfCallCode(java.lang.String nextPortOfCallCode) {
		_issuePortClearance.setNextPortOfCallCode(nextPortOfCallCode);
	}

	/**
	* Returns the valid until of this issue port clearance.
	*
	* @return the valid until of this issue port clearance
	*/
	@Override
	public java.util.Date getValidUntil() {
		return _issuePortClearance.getValidUntil();
	}

	/**
	* Sets the valid until of this issue port clearance.
	*
	* @param validUntil the valid until of this issue port clearance
	*/
	@Override
	public void setValidUntil(java.util.Date validUntil) {
		_issuePortClearance.setValidUntil(validUntil);
	}

	/**
	* Returns the issue date of this issue port clearance.
	*
	* @return the issue date of this issue port clearance
	*/
	@Override
	public java.util.Date getIssueDate() {
		return _issuePortClearance.getIssueDate();
	}

	/**
	* Sets the issue date of this issue port clearance.
	*
	* @param issueDate the issue date of this issue port clearance
	*/
	@Override
	public void setIssueDate(java.util.Date issueDate) {
		_issuePortClearance.setIssueDate(issueDate);
	}

	/**
	* Returns the director of maritime of this issue port clearance.
	*
	* @return the director of maritime of this issue port clearance
	*/
	@Override
	public java.lang.String getDirectorOfMaritime() {
		return _issuePortClearance.getDirectorOfMaritime();
	}

	/**
	* Sets the director of maritime of this issue port clearance.
	*
	* @param directorOfMaritime the director of maritime of this issue port clearance
	*/
	@Override
	public void setDirectorOfMaritime(java.lang.String directorOfMaritime) {
		_issuePortClearance.setDirectorOfMaritime(directorOfMaritime);
	}

	/**
	* Returns the certificate no of this issue port clearance.
	*
	* @return the certificate no of this issue port clearance
	*/
	@Override
	public java.lang.String getCertificateNo() {
		return _issuePortClearance.getCertificateNo();
	}

	/**
	* Sets the certificate no of this issue port clearance.
	*
	* @param certificateNo the certificate no of this issue port clearance
	*/
	@Override
	public void setCertificateNo(java.lang.String certificateNo) {
		_issuePortClearance.setCertificateNo(certificateNo);
	}

	/**
	* Returns the request state of this issue port clearance.
	*
	* @return the request state of this issue port clearance
	*/
	@Override
	public int getRequestState() {
		return _issuePortClearance.getRequestState();
	}

	/**
	* Sets the request state of this issue port clearance.
	*
	* @param requestState the request state of this issue port clearance
	*/
	@Override
	public void setRequestState(int requestState) {
		_issuePortClearance.setRequestState(requestState);
	}

	/**
	* Returns the gt of this issue port clearance.
	*
	* @return the gt of this issue port clearance
	*/
	@Override
	public double getGt() {
		return _issuePortClearance.getGt();
	}

	/**
	* Sets the gt of this issue port clearance.
	*
	* @param gt the gt of this issue port clearance
	*/
	@Override
	public void setGt(double gt) {
		_issuePortClearance.setGt(gt);
	}

	/**
	* Returns the version no of this issue port clearance.
	*
	* @return the version no of this issue port clearance
	*/
	@Override
	public java.lang.String getVersionNo() {
		return _issuePortClearance.getVersionNo();
	}

	/**
	* Sets the version no of this issue port clearance.
	*
	* @param versionNo the version no of this issue port clearance
	*/
	@Override
	public void setVersionNo(java.lang.String versionNo) {
		_issuePortClearance.setVersionNo(versionNo);
	}

	/**
	* Returns the is approval of this issue port clearance.
	*
	* @return the is approval of this issue port clearance
	*/
	@Override
	public int getIsApproval() {
		return _issuePortClearance.getIsApproval();
	}

	/**
	* Sets the is approval of this issue port clearance.
	*
	* @param isApproval the is approval of this issue port clearance
	*/
	@Override
	public void setIsApproval(int isApproval) {
		_issuePortClearance.setIsApproval(isApproval);
	}

	/**
	* Returns the approval date of this issue port clearance.
	*
	* @return the approval date of this issue port clearance
	*/
	@Override
	public java.util.Date getApprovalDate() {
		return _issuePortClearance.getApprovalDate();
	}

	/**
	* Sets the approval date of this issue port clearance.
	*
	* @param approvalDate the approval date of this issue port clearance
	*/
	@Override
	public void setApprovalDate(java.util.Date approvalDate) {
		_issuePortClearance.setApprovalDate(approvalDate);
	}

	/**
	* Returns the approval name of this issue port clearance.
	*
	* @return the approval name of this issue port clearance
	*/
	@Override
	public java.lang.String getApprovalName() {
		return _issuePortClearance.getApprovalName();
	}

	/**
	* Sets the approval name of this issue port clearance.
	*
	* @param approvalName the approval name of this issue port clearance
	*/
	@Override
	public void setApprovalName(java.lang.String approvalName) {
		_issuePortClearance.setApprovalName(approvalName);
	}

	/**
	* Returns the remarks of this issue port clearance.
	*
	* @return the remarks of this issue port clearance
	*/
	@Override
	public java.lang.String getRemarks() {
		return _issuePortClearance.getRemarks();
	}

	/**
	* Sets the remarks of this issue port clearance.
	*
	* @param remarks the remarks of this issue port clearance
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_issuePortClearance.setRemarks(remarks);
	}

	/**
	* Returns the is cancel of this issue port clearance.
	*
	* @return the is cancel of this issue port clearance
	*/
	@Override
	public int getIsCancel() {
		return _issuePortClearance.getIsCancel();
	}

	/**
	* Sets the is cancel of this issue port clearance.
	*
	* @param isCancel the is cancel of this issue port clearance
	*/
	@Override
	public void setIsCancel(int isCancel) {
		_issuePortClearance.setIsCancel(isCancel);
	}

	/**
	* Returns the cancel date of this issue port clearance.
	*
	* @return the cancel date of this issue port clearance
	*/
	@Override
	public java.util.Date getCancelDate() {
		return _issuePortClearance.getCancelDate();
	}

	/**
	* Sets the cancel date of this issue port clearance.
	*
	* @param cancelDate the cancel date of this issue port clearance
	*/
	@Override
	public void setCancelDate(java.util.Date cancelDate) {
		_issuePortClearance.setCancelDate(cancelDate);
	}

	/**
	* Returns the cancel name of this issue port clearance.
	*
	* @return the cancel name of this issue port clearance
	*/
	@Override
	public java.lang.String getCancelName() {
		return _issuePortClearance.getCancelName();
	}

	/**
	* Sets the cancel name of this issue port clearance.
	*
	* @param cancelName the cancel name of this issue port clearance
	*/
	@Override
	public void setCancelName(java.lang.String cancelName) {
		_issuePortClearance.setCancelName(cancelName);
	}

	/**
	* Returns the cancel note of this issue port clearance.
	*
	* @return the cancel note of this issue port clearance
	*/
	@Override
	public java.lang.String getCancelNote() {
		return _issuePortClearance.getCancelNote();
	}

	/**
	* Sets the cancel note of this issue port clearance.
	*
	* @param cancelNote the cancel note of this issue port clearance
	*/
	@Override
	public void setCancelNote(java.lang.String cancelNote) {
		_issuePortClearance.setCancelNote(cancelNote);
	}

	/**
	* Returns the representative of this issue port clearance.
	*
	* @return the representative of this issue port clearance
	*/
	@Override
	public java.lang.String getRepresentative() {
		return _issuePortClearance.getRepresentative();
	}

	/**
	* Sets the representative of this issue port clearance.
	*
	* @param representative the representative of this issue port clearance
	*/
	@Override
	public void setRepresentative(java.lang.String representative) {
		_issuePortClearance.setRepresentative(representative);
	}

	/**
	* Returns the sign date of this issue port clearance.
	*
	* @return the sign date of this issue port clearance
	*/
	@Override
	public java.util.Date getSignDate() {
		return _issuePortClearance.getSignDate();
	}

	/**
	* Sets the sign date of this issue port clearance.
	*
	* @param signDate the sign date of this issue port clearance
	*/
	@Override
	public void setSignDate(java.util.Date signDate) {
		_issuePortClearance.setSignDate(signDate);
	}

	/**
	* Returns the sign name of this issue port clearance.
	*
	* @return the sign name of this issue port clearance
	*/
	@Override
	public java.lang.String getSignName() {
		return _issuePortClearance.getSignName();
	}

	/**
	* Sets the sign name of this issue port clearance.
	*
	* @param signName the sign name of this issue port clearance
	*/
	@Override
	public void setSignName(java.lang.String signName) {
		_issuePortClearance.setSignName(signName);
	}

	/**
	* Returns the sign title of this issue port clearance.
	*
	* @return the sign title of this issue port clearance
	*/
	@Override
	public java.lang.String getSignTitle() {
		return _issuePortClearance.getSignTitle();
	}

	/**
	* Sets the sign title of this issue port clearance.
	*
	* @param signTitle the sign title of this issue port clearance
	*/
	@Override
	public void setSignTitle(java.lang.String signTitle) {
		_issuePortClearance.setSignTitle(signTitle);
	}

	/**
	* Returns the sign place of this issue port clearance.
	*
	* @return the sign place of this issue port clearance
	*/
	@Override
	public java.lang.String getSignPlace() {
		return _issuePortClearance.getSignPlace();
	}

	/**
	* Sets the sign place of this issue port clearance.
	*
	* @param signPlace the sign place of this issue port clearance
	*/
	@Override
	public void setSignPlace(java.lang.String signPlace) {
		_issuePortClearance.setSignPlace(signPlace);
	}

	/**
	* Returns the stamp status of this issue port clearance.
	*
	* @return the stamp status of this issue port clearance
	*/
	@Override
	public long getStampStatus() {
		return _issuePortClearance.getStampStatus();
	}

	/**
	* Sets the stamp status of this issue port clearance.
	*
	* @param stampStatus the stamp status of this issue port clearance
	*/
	@Override
	public void setStampStatus(long stampStatus) {
		_issuePortClearance.setStampStatus(stampStatus);
	}

	/**
	* Returns the attached file of this issue port clearance.
	*
	* @return the attached file of this issue port clearance
	*/
	@Override
	public long getAttachedFile() {
		return _issuePortClearance.getAttachedFile();
	}

	/**
	* Sets the attached file of this issue port clearance.
	*
	* @param attachedFile the attached file of this issue port clearance
	*/
	@Override
	public void setAttachedFile(long attachedFile) {
		_issuePortClearance.setAttachedFile(attachedFile);
	}

	@Override
	public boolean isNew() {
		return _issuePortClearance.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_issuePortClearance.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _issuePortClearance.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_issuePortClearance.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _issuePortClearance.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _issuePortClearance.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_issuePortClearance.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _issuePortClearance.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_issuePortClearance.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_issuePortClearance.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_issuePortClearance.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new IssuePortClearanceWrapper((IssuePortClearance)_issuePortClearance.clone());
	}

	@Override
	public int compareTo(IssuePortClearance issuePortClearance) {
		return _issuePortClearance.compareTo(issuePortClearance);
	}

	@Override
	public int hashCode() {
		return _issuePortClearance.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<IssuePortClearance> toCacheModel() {
		return _issuePortClearance.toCacheModel();
	}

	@Override
	public IssuePortClearance toEscapedModel() {
		return new IssuePortClearanceWrapper(_issuePortClearance.toEscapedModel());
	}

	@Override
	public IssuePortClearance toUnescapedModel() {
		return new IssuePortClearanceWrapper(_issuePortClearance.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _issuePortClearance.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _issuePortClearance.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_issuePortClearance.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof IssuePortClearanceWrapper)) {
			return false;
		}

		IssuePortClearanceWrapper issuePortClearanceWrapper = (IssuePortClearanceWrapper)obj;

		if (Validator.equals(_issuePortClearance,
					issuePortClearanceWrapper._issuePortClearance)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public IssuePortClearance getWrappedIssuePortClearance() {
		return _issuePortClearance;
	}

	@Override
	public IssuePortClearance getWrappedModel() {
		return _issuePortClearance;
	}

	@Override
	public void resetOriginalValues() {
		_issuePortClearance.resetOriginalValues();
	}

	private IssuePortClearance _issuePortClearance;
}