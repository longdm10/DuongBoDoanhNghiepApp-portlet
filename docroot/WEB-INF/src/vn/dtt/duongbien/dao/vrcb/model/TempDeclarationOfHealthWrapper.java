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
 * This class is a wrapper for {@link TempDeclarationOfHealth}.
 * </p>
 *
 * @author longdm
 * @see TempDeclarationOfHealth
 * @generated
 */
public class TempDeclarationOfHealthWrapper implements TempDeclarationOfHealth,
	ModelWrapper<TempDeclarationOfHealth> {
	public TempDeclarationOfHealthWrapper(
		TempDeclarationOfHealth tempDeclarationOfHealth) {
		_tempDeclarationOfHealth = tempDeclarationOfHealth;
	}

	@Override
	public Class<?> getModelClass() {
		return TempDeclarationOfHealth.class;
	}

	@Override
	public String getModelClassName() {
		return TempDeclarationOfHealth.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("requestCode", getRequestCode());
		attributes.put("requestState", getRequestState());
		attributes.put("documentName", getDocumentName());
		attributes.put("documentYear", getDocumentYear());
		attributes.put("userCreated", getUserCreated());
		attributes.put("submittedPortCode", getSubmittedPortCode());
		attributes.put("dateSubmitted", getDateSubmitted());
		attributes.put("nameOfShip", getNameOfShip());
		attributes.put("registration", getRegistration());
		attributes.put("imoNumber", getImoNumber());
		attributes.put("arrivingFrom", getArrivingFrom());
		attributes.put("sailingTo", getSailingTo());
		attributes.put("nationality", getNationality());
		attributes.put("masterName", getMasterName());
		attributes.put("grossTonnage", getGrossTonnage());
		attributes.put("grossTonnageUnit", getGrossTonnageUnit());
		attributes.put("tonnage", getTonnage());
		attributes.put("tonnageUnit", getTonnageUnit());
		attributes.put("certificatecarried", getCertificatecarried());
		attributes.put("issuedAt", getIssuedAt());
		attributes.put("issueDate", getIssueDate());
		attributes.put("reInspectionrequired", getReInspectionrequired());
		attributes.put("isShipVisitedWHO", getIsShipVisitedWHO());
		attributes.put("visitedWHOPortCode", getVisitedWHOPortCode());
		attributes.put("dateOfVisitedWHO", getDateOfVisitedWHO());
		attributes.put("listPortName", getListPortName());
		attributes.put("doctorName", getDoctorName());
		attributes.put("doctorSigndate", getDoctorSigndate());
		attributes.put("signPlace", getSignPlace());
		attributes.put("signDate", getSignDate());
		attributes.put("masterSigned", getMasterSigned());
		attributes.put("masterSignedImage", getMasterSignedImage());
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

		Integer requestState = (Integer)attributes.get("requestState");

		if (requestState != null) {
			setRequestState(requestState);
		}

		Long documentName = (Long)attributes.get("documentName");

		if (documentName != null) {
			setDocumentName(documentName);
		}

		Integer documentYear = (Integer)attributes.get("documentYear");

		if (documentYear != null) {
			setDocumentYear(documentYear);
		}

		String userCreated = (String)attributes.get("userCreated");

		if (userCreated != null) {
			setUserCreated(userCreated);
		}

		String submittedPortCode = (String)attributes.get("submittedPortCode");

		if (submittedPortCode != null) {
			setSubmittedPortCode(submittedPortCode);
		}

		Date dateSubmitted = (Date)attributes.get("dateSubmitted");

		if (dateSubmitted != null) {
			setDateSubmitted(dateSubmitted);
		}

		String nameOfShip = (String)attributes.get("nameOfShip");

		if (nameOfShip != null) {
			setNameOfShip(nameOfShip);
		}

		String registration = (String)attributes.get("registration");

		if (registration != null) {
			setRegistration(registration);
		}

		String imoNumber = (String)attributes.get("imoNumber");

		if (imoNumber != null) {
			setImoNumber(imoNumber);
		}

		String arrivingFrom = (String)attributes.get("arrivingFrom");

		if (arrivingFrom != null) {
			setArrivingFrom(arrivingFrom);
		}

		String sailingTo = (String)attributes.get("sailingTo");

		if (sailingTo != null) {
			setSailingTo(sailingTo);
		}

		String nationality = (String)attributes.get("nationality");

		if (nationality != null) {
			setNationality(nationality);
		}

		String masterName = (String)attributes.get("masterName");

		if (masterName != null) {
			setMasterName(masterName);
		}

		Double grossTonnage = (Double)attributes.get("grossTonnage");

		if (grossTonnage != null) {
			setGrossTonnage(grossTonnage);
		}

		String grossTonnageUnit = (String)attributes.get("grossTonnageUnit");

		if (grossTonnageUnit != null) {
			setGrossTonnageUnit(grossTonnageUnit);
		}

		Double tonnage = (Double)attributes.get("tonnage");

		if (tonnage != null) {
			setTonnage(tonnage);
		}

		String tonnageUnit = (String)attributes.get("tonnageUnit");

		if (tonnageUnit != null) {
			setTonnageUnit(tonnageUnit);
		}

		Integer certificatecarried = (Integer)attributes.get(
				"certificatecarried");

		if (certificatecarried != null) {
			setCertificatecarried(certificatecarried);
		}

		String issuedAt = (String)attributes.get("issuedAt");

		if (issuedAt != null) {
			setIssuedAt(issuedAt);
		}

		Date issueDate = (Date)attributes.get("issueDate");

		if (issueDate != null) {
			setIssueDate(issueDate);
		}

		Integer reInspectionrequired = (Integer)attributes.get(
				"reInspectionrequired");

		if (reInspectionrequired != null) {
			setReInspectionrequired(reInspectionrequired);
		}

		Integer isShipVisitedWHO = (Integer)attributes.get("isShipVisitedWHO");

		if (isShipVisitedWHO != null) {
			setIsShipVisitedWHO(isShipVisitedWHO);
		}

		String visitedWHOPortCode = (String)attributes.get("visitedWHOPortCode");

		if (visitedWHOPortCode != null) {
			setVisitedWHOPortCode(visitedWHOPortCode);
		}

		Date dateOfVisitedWHO = (Date)attributes.get("dateOfVisitedWHO");

		if (dateOfVisitedWHO != null) {
			setDateOfVisitedWHO(dateOfVisitedWHO);
		}

		String listPortName = (String)attributes.get("listPortName");

		if (listPortName != null) {
			setListPortName(listPortName);
		}

		String doctorName = (String)attributes.get("doctorName");

		if (doctorName != null) {
			setDoctorName(doctorName);
		}

		Date doctorSigndate = (Date)attributes.get("doctorSigndate");

		if (doctorSigndate != null) {
			setDoctorSigndate(doctorSigndate);
		}

		String signPlace = (String)attributes.get("signPlace");

		if (signPlace != null) {
			setSignPlace(signPlace);
		}

		Date signDate = (Date)attributes.get("signDate");

		if (signDate != null) {
			setSignDate(signDate);
		}

		Integer masterSigned = (Integer)attributes.get("masterSigned");

		if (masterSigned != null) {
			setMasterSigned(masterSigned);
		}

		Integer masterSignedImage = (Integer)attributes.get("masterSignedImage");

		if (masterSignedImage != null) {
			setMasterSignedImage(masterSignedImage);
		}

		Long attachedFile = (Long)attributes.get("attachedFile");

		if (attachedFile != null) {
			setAttachedFile(attachedFile);
		}
	}

	/**
	* Returns the primary key of this temp declaration of health.
	*
	* @return the primary key of this temp declaration of health
	*/
	@Override
	public long getPrimaryKey() {
		return _tempDeclarationOfHealth.getPrimaryKey();
	}

	/**
	* Sets the primary key of this temp declaration of health.
	*
	* @param primaryKey the primary key of this temp declaration of health
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tempDeclarationOfHealth.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this temp declaration of health.
	*
	* @return the ID of this temp declaration of health
	*/
	@Override
	public long getId() {
		return _tempDeclarationOfHealth.getId();
	}

	/**
	* Sets the ID of this temp declaration of health.
	*
	* @param id the ID of this temp declaration of health
	*/
	@Override
	public void setId(long id) {
		_tempDeclarationOfHealth.setId(id);
	}

	/**
	* Returns the request code of this temp declaration of health.
	*
	* @return the request code of this temp declaration of health
	*/
	@Override
	public java.lang.String getRequestCode() {
		return _tempDeclarationOfHealth.getRequestCode();
	}

	/**
	* Sets the request code of this temp declaration of health.
	*
	* @param requestCode the request code of this temp declaration of health
	*/
	@Override
	public void setRequestCode(java.lang.String requestCode) {
		_tempDeclarationOfHealth.setRequestCode(requestCode);
	}

	/**
	* Returns the request state of this temp declaration of health.
	*
	* @return the request state of this temp declaration of health
	*/
	@Override
	public int getRequestState() {
		return _tempDeclarationOfHealth.getRequestState();
	}

	/**
	* Sets the request state of this temp declaration of health.
	*
	* @param requestState the request state of this temp declaration of health
	*/
	@Override
	public void setRequestState(int requestState) {
		_tempDeclarationOfHealth.setRequestState(requestState);
	}

	/**
	* Returns the document name of this temp declaration of health.
	*
	* @return the document name of this temp declaration of health
	*/
	@Override
	public long getDocumentName() {
		return _tempDeclarationOfHealth.getDocumentName();
	}

	/**
	* Sets the document name of this temp declaration of health.
	*
	* @param documentName the document name of this temp declaration of health
	*/
	@Override
	public void setDocumentName(long documentName) {
		_tempDeclarationOfHealth.setDocumentName(documentName);
	}

	/**
	* Returns the document year of this temp declaration of health.
	*
	* @return the document year of this temp declaration of health
	*/
	@Override
	public int getDocumentYear() {
		return _tempDeclarationOfHealth.getDocumentYear();
	}

	/**
	* Sets the document year of this temp declaration of health.
	*
	* @param documentYear the document year of this temp declaration of health
	*/
	@Override
	public void setDocumentYear(int documentYear) {
		_tempDeclarationOfHealth.setDocumentYear(documentYear);
	}

	/**
	* Returns the user created of this temp declaration of health.
	*
	* @return the user created of this temp declaration of health
	*/
	@Override
	public java.lang.String getUserCreated() {
		return _tempDeclarationOfHealth.getUserCreated();
	}

	/**
	* Sets the user created of this temp declaration of health.
	*
	* @param userCreated the user created of this temp declaration of health
	*/
	@Override
	public void setUserCreated(java.lang.String userCreated) {
		_tempDeclarationOfHealth.setUserCreated(userCreated);
	}

	/**
	* Returns the submitted port code of this temp declaration of health.
	*
	* @return the submitted port code of this temp declaration of health
	*/
	@Override
	public java.lang.String getSubmittedPortCode() {
		return _tempDeclarationOfHealth.getSubmittedPortCode();
	}

	/**
	* Sets the submitted port code of this temp declaration of health.
	*
	* @param submittedPortCode the submitted port code of this temp declaration of health
	*/
	@Override
	public void setSubmittedPortCode(java.lang.String submittedPortCode) {
		_tempDeclarationOfHealth.setSubmittedPortCode(submittedPortCode);
	}

	/**
	* Returns the date submitted of this temp declaration of health.
	*
	* @return the date submitted of this temp declaration of health
	*/
	@Override
	public java.util.Date getDateSubmitted() {
		return _tempDeclarationOfHealth.getDateSubmitted();
	}

	/**
	* Sets the date submitted of this temp declaration of health.
	*
	* @param dateSubmitted the date submitted of this temp declaration of health
	*/
	@Override
	public void setDateSubmitted(java.util.Date dateSubmitted) {
		_tempDeclarationOfHealth.setDateSubmitted(dateSubmitted);
	}

	/**
	* Returns the name of ship of this temp declaration of health.
	*
	* @return the name of ship of this temp declaration of health
	*/
	@Override
	public java.lang.String getNameOfShip() {
		return _tempDeclarationOfHealth.getNameOfShip();
	}

	/**
	* Sets the name of ship of this temp declaration of health.
	*
	* @param nameOfShip the name of ship of this temp declaration of health
	*/
	@Override
	public void setNameOfShip(java.lang.String nameOfShip) {
		_tempDeclarationOfHealth.setNameOfShip(nameOfShip);
	}

	/**
	* Returns the registration of this temp declaration of health.
	*
	* @return the registration of this temp declaration of health
	*/
	@Override
	public java.lang.String getRegistration() {
		return _tempDeclarationOfHealth.getRegistration();
	}

	/**
	* Sets the registration of this temp declaration of health.
	*
	* @param registration the registration of this temp declaration of health
	*/
	@Override
	public void setRegistration(java.lang.String registration) {
		_tempDeclarationOfHealth.setRegistration(registration);
	}

	/**
	* Returns the imo number of this temp declaration of health.
	*
	* @return the imo number of this temp declaration of health
	*/
	@Override
	public java.lang.String getImoNumber() {
		return _tempDeclarationOfHealth.getImoNumber();
	}

	/**
	* Sets the imo number of this temp declaration of health.
	*
	* @param imoNumber the imo number of this temp declaration of health
	*/
	@Override
	public void setImoNumber(java.lang.String imoNumber) {
		_tempDeclarationOfHealth.setImoNumber(imoNumber);
	}

	/**
	* Returns the arriving from of this temp declaration of health.
	*
	* @return the arriving from of this temp declaration of health
	*/
	@Override
	public java.lang.String getArrivingFrom() {
		return _tempDeclarationOfHealth.getArrivingFrom();
	}

	/**
	* Sets the arriving from of this temp declaration of health.
	*
	* @param arrivingFrom the arriving from of this temp declaration of health
	*/
	@Override
	public void setArrivingFrom(java.lang.String arrivingFrom) {
		_tempDeclarationOfHealth.setArrivingFrom(arrivingFrom);
	}

	/**
	* Returns the sailing to of this temp declaration of health.
	*
	* @return the sailing to of this temp declaration of health
	*/
	@Override
	public java.lang.String getSailingTo() {
		return _tempDeclarationOfHealth.getSailingTo();
	}

	/**
	* Sets the sailing to of this temp declaration of health.
	*
	* @param sailingTo the sailing to of this temp declaration of health
	*/
	@Override
	public void setSailingTo(java.lang.String sailingTo) {
		_tempDeclarationOfHealth.setSailingTo(sailingTo);
	}

	/**
	* Returns the nationality of this temp declaration of health.
	*
	* @return the nationality of this temp declaration of health
	*/
	@Override
	public java.lang.String getNationality() {
		return _tempDeclarationOfHealth.getNationality();
	}

	/**
	* Sets the nationality of this temp declaration of health.
	*
	* @param nationality the nationality of this temp declaration of health
	*/
	@Override
	public void setNationality(java.lang.String nationality) {
		_tempDeclarationOfHealth.setNationality(nationality);
	}

	/**
	* Returns the master name of this temp declaration of health.
	*
	* @return the master name of this temp declaration of health
	*/
	@Override
	public java.lang.String getMasterName() {
		return _tempDeclarationOfHealth.getMasterName();
	}

	/**
	* Sets the master name of this temp declaration of health.
	*
	* @param masterName the master name of this temp declaration of health
	*/
	@Override
	public void setMasterName(java.lang.String masterName) {
		_tempDeclarationOfHealth.setMasterName(masterName);
	}

	/**
	* Returns the gross tonnage of this temp declaration of health.
	*
	* @return the gross tonnage of this temp declaration of health
	*/
	@Override
	public double getGrossTonnage() {
		return _tempDeclarationOfHealth.getGrossTonnage();
	}

	/**
	* Sets the gross tonnage of this temp declaration of health.
	*
	* @param grossTonnage the gross tonnage of this temp declaration of health
	*/
	@Override
	public void setGrossTonnage(double grossTonnage) {
		_tempDeclarationOfHealth.setGrossTonnage(grossTonnage);
	}

	/**
	* Returns the gross tonnage unit of this temp declaration of health.
	*
	* @return the gross tonnage unit of this temp declaration of health
	*/
	@Override
	public java.lang.String getGrossTonnageUnit() {
		return _tempDeclarationOfHealth.getGrossTonnageUnit();
	}

	/**
	* Sets the gross tonnage unit of this temp declaration of health.
	*
	* @param grossTonnageUnit the gross tonnage unit of this temp declaration of health
	*/
	@Override
	public void setGrossTonnageUnit(java.lang.String grossTonnageUnit) {
		_tempDeclarationOfHealth.setGrossTonnageUnit(grossTonnageUnit);
	}

	/**
	* Returns the tonnage of this temp declaration of health.
	*
	* @return the tonnage of this temp declaration of health
	*/
	@Override
	public double getTonnage() {
		return _tempDeclarationOfHealth.getTonnage();
	}

	/**
	* Sets the tonnage of this temp declaration of health.
	*
	* @param tonnage the tonnage of this temp declaration of health
	*/
	@Override
	public void setTonnage(double tonnage) {
		_tempDeclarationOfHealth.setTonnage(tonnage);
	}

	/**
	* Returns the tonnage unit of this temp declaration of health.
	*
	* @return the tonnage unit of this temp declaration of health
	*/
	@Override
	public java.lang.String getTonnageUnit() {
		return _tempDeclarationOfHealth.getTonnageUnit();
	}

	/**
	* Sets the tonnage unit of this temp declaration of health.
	*
	* @param tonnageUnit the tonnage unit of this temp declaration of health
	*/
	@Override
	public void setTonnageUnit(java.lang.String tonnageUnit) {
		_tempDeclarationOfHealth.setTonnageUnit(tonnageUnit);
	}

	/**
	* Returns the certificatecarried of this temp declaration of health.
	*
	* @return the certificatecarried of this temp declaration of health
	*/
	@Override
	public int getCertificatecarried() {
		return _tempDeclarationOfHealth.getCertificatecarried();
	}

	/**
	* Sets the certificatecarried of this temp declaration of health.
	*
	* @param certificatecarried the certificatecarried of this temp declaration of health
	*/
	@Override
	public void setCertificatecarried(int certificatecarried) {
		_tempDeclarationOfHealth.setCertificatecarried(certificatecarried);
	}

	/**
	* Returns the issued at of this temp declaration of health.
	*
	* @return the issued at of this temp declaration of health
	*/
	@Override
	public java.lang.String getIssuedAt() {
		return _tempDeclarationOfHealth.getIssuedAt();
	}

	/**
	* Sets the issued at of this temp declaration of health.
	*
	* @param issuedAt the issued at of this temp declaration of health
	*/
	@Override
	public void setIssuedAt(java.lang.String issuedAt) {
		_tempDeclarationOfHealth.setIssuedAt(issuedAt);
	}

	/**
	* Returns the issue date of this temp declaration of health.
	*
	* @return the issue date of this temp declaration of health
	*/
	@Override
	public java.util.Date getIssueDate() {
		return _tempDeclarationOfHealth.getIssueDate();
	}

	/**
	* Sets the issue date of this temp declaration of health.
	*
	* @param issueDate the issue date of this temp declaration of health
	*/
	@Override
	public void setIssueDate(java.util.Date issueDate) {
		_tempDeclarationOfHealth.setIssueDate(issueDate);
	}

	/**
	* Returns the re inspectionrequired of this temp declaration of health.
	*
	* @return the re inspectionrequired of this temp declaration of health
	*/
	@Override
	public int getReInspectionrequired() {
		return _tempDeclarationOfHealth.getReInspectionrequired();
	}

	/**
	* Sets the re inspectionrequired of this temp declaration of health.
	*
	* @param reInspectionrequired the re inspectionrequired of this temp declaration of health
	*/
	@Override
	public void setReInspectionrequired(int reInspectionrequired) {
		_tempDeclarationOfHealth.setReInspectionrequired(reInspectionrequired);
	}

	/**
	* Returns the is ship visited w h o of this temp declaration of health.
	*
	* @return the is ship visited w h o of this temp declaration of health
	*/
	@Override
	public int getIsShipVisitedWHO() {
		return _tempDeclarationOfHealth.getIsShipVisitedWHO();
	}

	/**
	* Sets the is ship visited w h o of this temp declaration of health.
	*
	* @param isShipVisitedWHO the is ship visited w h o of this temp declaration of health
	*/
	@Override
	public void setIsShipVisitedWHO(int isShipVisitedWHO) {
		_tempDeclarationOfHealth.setIsShipVisitedWHO(isShipVisitedWHO);
	}

	/**
	* Returns the visited w h o port code of this temp declaration of health.
	*
	* @return the visited w h o port code of this temp declaration of health
	*/
	@Override
	public java.lang.String getVisitedWHOPortCode() {
		return _tempDeclarationOfHealth.getVisitedWHOPortCode();
	}

	/**
	* Sets the visited w h o port code of this temp declaration of health.
	*
	* @param visitedWHOPortCode the visited w h o port code of this temp declaration of health
	*/
	@Override
	public void setVisitedWHOPortCode(java.lang.String visitedWHOPortCode) {
		_tempDeclarationOfHealth.setVisitedWHOPortCode(visitedWHOPortCode);
	}

	/**
	* Returns the date of visited w h o of this temp declaration of health.
	*
	* @return the date of visited w h o of this temp declaration of health
	*/
	@Override
	public java.util.Date getDateOfVisitedWHO() {
		return _tempDeclarationOfHealth.getDateOfVisitedWHO();
	}

	/**
	* Sets the date of visited w h o of this temp declaration of health.
	*
	* @param dateOfVisitedWHO the date of visited w h o of this temp declaration of health
	*/
	@Override
	public void setDateOfVisitedWHO(java.util.Date dateOfVisitedWHO) {
		_tempDeclarationOfHealth.setDateOfVisitedWHO(dateOfVisitedWHO);
	}

	/**
	* Returns the list port name of this temp declaration of health.
	*
	* @return the list port name of this temp declaration of health
	*/
	@Override
	public java.lang.String getListPortName() {
		return _tempDeclarationOfHealth.getListPortName();
	}

	/**
	* Sets the list port name of this temp declaration of health.
	*
	* @param listPortName the list port name of this temp declaration of health
	*/
	@Override
	public void setListPortName(java.lang.String listPortName) {
		_tempDeclarationOfHealth.setListPortName(listPortName);
	}

	/**
	* Returns the doctor name of this temp declaration of health.
	*
	* @return the doctor name of this temp declaration of health
	*/
	@Override
	public java.lang.String getDoctorName() {
		return _tempDeclarationOfHealth.getDoctorName();
	}

	/**
	* Sets the doctor name of this temp declaration of health.
	*
	* @param doctorName the doctor name of this temp declaration of health
	*/
	@Override
	public void setDoctorName(java.lang.String doctorName) {
		_tempDeclarationOfHealth.setDoctorName(doctorName);
	}

	/**
	* Returns the doctor signdate of this temp declaration of health.
	*
	* @return the doctor signdate of this temp declaration of health
	*/
	@Override
	public java.util.Date getDoctorSigndate() {
		return _tempDeclarationOfHealth.getDoctorSigndate();
	}

	/**
	* Sets the doctor signdate of this temp declaration of health.
	*
	* @param doctorSigndate the doctor signdate of this temp declaration of health
	*/
	@Override
	public void setDoctorSigndate(java.util.Date doctorSigndate) {
		_tempDeclarationOfHealth.setDoctorSigndate(doctorSigndate);
	}

	/**
	* Returns the sign place of this temp declaration of health.
	*
	* @return the sign place of this temp declaration of health
	*/
	@Override
	public java.lang.String getSignPlace() {
		return _tempDeclarationOfHealth.getSignPlace();
	}

	/**
	* Sets the sign place of this temp declaration of health.
	*
	* @param signPlace the sign place of this temp declaration of health
	*/
	@Override
	public void setSignPlace(java.lang.String signPlace) {
		_tempDeclarationOfHealth.setSignPlace(signPlace);
	}

	/**
	* Returns the sign date of this temp declaration of health.
	*
	* @return the sign date of this temp declaration of health
	*/
	@Override
	public java.util.Date getSignDate() {
		return _tempDeclarationOfHealth.getSignDate();
	}

	/**
	* Sets the sign date of this temp declaration of health.
	*
	* @param signDate the sign date of this temp declaration of health
	*/
	@Override
	public void setSignDate(java.util.Date signDate) {
		_tempDeclarationOfHealth.setSignDate(signDate);
	}

	/**
	* Returns the master signed of this temp declaration of health.
	*
	* @return the master signed of this temp declaration of health
	*/
	@Override
	public int getMasterSigned() {
		return _tempDeclarationOfHealth.getMasterSigned();
	}

	/**
	* Sets the master signed of this temp declaration of health.
	*
	* @param masterSigned the master signed of this temp declaration of health
	*/
	@Override
	public void setMasterSigned(int masterSigned) {
		_tempDeclarationOfHealth.setMasterSigned(masterSigned);
	}

	/**
	* Returns the master signed image of this temp declaration of health.
	*
	* @return the master signed image of this temp declaration of health
	*/
	@Override
	public int getMasterSignedImage() {
		return _tempDeclarationOfHealth.getMasterSignedImage();
	}

	/**
	* Sets the master signed image of this temp declaration of health.
	*
	* @param masterSignedImage the master signed image of this temp declaration of health
	*/
	@Override
	public void setMasterSignedImage(int masterSignedImage) {
		_tempDeclarationOfHealth.setMasterSignedImage(masterSignedImage);
	}

	/**
	* Returns the attached file of this temp declaration of health.
	*
	* @return the attached file of this temp declaration of health
	*/
	@Override
	public long getAttachedFile() {
		return _tempDeclarationOfHealth.getAttachedFile();
	}

	/**
	* Sets the attached file of this temp declaration of health.
	*
	* @param attachedFile the attached file of this temp declaration of health
	*/
	@Override
	public void setAttachedFile(long attachedFile) {
		_tempDeclarationOfHealth.setAttachedFile(attachedFile);
	}

	@Override
	public boolean isNew() {
		return _tempDeclarationOfHealth.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tempDeclarationOfHealth.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tempDeclarationOfHealth.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tempDeclarationOfHealth.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tempDeclarationOfHealth.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tempDeclarationOfHealth.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tempDeclarationOfHealth.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tempDeclarationOfHealth.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tempDeclarationOfHealth.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tempDeclarationOfHealth.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tempDeclarationOfHealth.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TempDeclarationOfHealthWrapper((TempDeclarationOfHealth)_tempDeclarationOfHealth.clone());
	}

	@Override
	public int compareTo(TempDeclarationOfHealth tempDeclarationOfHealth) {
		return _tempDeclarationOfHealth.compareTo(tempDeclarationOfHealth);
	}

	@Override
	public int hashCode() {
		return _tempDeclarationOfHealth.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<TempDeclarationOfHealth> toCacheModel() {
		return _tempDeclarationOfHealth.toCacheModel();
	}

	@Override
	public TempDeclarationOfHealth toEscapedModel() {
		return new TempDeclarationOfHealthWrapper(_tempDeclarationOfHealth.toEscapedModel());
	}

	@Override
	public TempDeclarationOfHealth toUnescapedModel() {
		return new TempDeclarationOfHealthWrapper(_tempDeclarationOfHealth.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tempDeclarationOfHealth.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tempDeclarationOfHealth.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempDeclarationOfHealth.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TempDeclarationOfHealthWrapper)) {
			return false;
		}

		TempDeclarationOfHealthWrapper tempDeclarationOfHealthWrapper = (TempDeclarationOfHealthWrapper)obj;

		if (Validator.equals(_tempDeclarationOfHealth,
					tempDeclarationOfHealthWrapper._tempDeclarationOfHealth)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TempDeclarationOfHealth getWrappedTempDeclarationOfHealth() {
		return _tempDeclarationOfHealth;
	}

	@Override
	public TempDeclarationOfHealth getWrappedModel() {
		return _tempDeclarationOfHealth;
	}

	@Override
	public void resetOriginalValues() {
		_tempDeclarationOfHealth.resetOriginalValues();
	}

	private TempDeclarationOfHealth _tempDeclarationOfHealth;
}