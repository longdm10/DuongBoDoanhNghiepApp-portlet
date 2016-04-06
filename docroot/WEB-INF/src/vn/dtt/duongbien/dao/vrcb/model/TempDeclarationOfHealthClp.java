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
import vn.dtt.duongbien.dao.vrcb.service.TempDeclarationOfHealthLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class TempDeclarationOfHealthClp extends BaseModelImpl<TempDeclarationOfHealth>
	implements TempDeclarationOfHealth {
	public TempDeclarationOfHealthClp() {
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

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tempDeclarationOfHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempDeclarationOfHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tempDeclarationOfHealthRemoteModel, id);
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

		if (_tempDeclarationOfHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempDeclarationOfHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestCode", String.class);

				method.invoke(_tempDeclarationOfHealthRemoteModel, requestCode);
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

		if (_tempDeclarationOfHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempDeclarationOfHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestState", int.class);

				method.invoke(_tempDeclarationOfHealthRemoteModel, requestState);
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

		if (_tempDeclarationOfHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempDeclarationOfHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentName", long.class);

				method.invoke(_tempDeclarationOfHealthRemoteModel, documentName);
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

		if (_tempDeclarationOfHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempDeclarationOfHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentYear", int.class);

				method.invoke(_tempDeclarationOfHealthRemoteModel, documentYear);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserCreated() {
		return _userCreated;
	}

	@Override
	public void setUserCreated(String userCreated) {
		_userCreated = userCreated;

		if (_tempDeclarationOfHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempDeclarationOfHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setUserCreated", String.class);

				method.invoke(_tempDeclarationOfHealthRemoteModel, userCreated);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSubmittedPortCode() {
		return _submittedPortCode;
	}

	@Override
	public void setSubmittedPortCode(String submittedPortCode) {
		_submittedPortCode = submittedPortCode;

		if (_tempDeclarationOfHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempDeclarationOfHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setSubmittedPortCode",
						String.class);

				method.invoke(_tempDeclarationOfHealthRemoteModel,
					submittedPortCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDateSubmitted() {
		return _dateSubmitted;
	}

	@Override
	public void setDateSubmitted(Date dateSubmitted) {
		_dateSubmitted = dateSubmitted;

		if (_tempDeclarationOfHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempDeclarationOfHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setDateSubmitted", Date.class);

				method.invoke(_tempDeclarationOfHealthRemoteModel, dateSubmitted);
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

		if (_tempDeclarationOfHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempDeclarationOfHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setNameOfShip", String.class);

				method.invoke(_tempDeclarationOfHealthRemoteModel, nameOfShip);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRegistration() {
		return _registration;
	}

	@Override
	public void setRegistration(String registration) {
		_registration = registration;

		if (_tempDeclarationOfHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempDeclarationOfHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setRegistration", String.class);

				method.invoke(_tempDeclarationOfHealthRemoteModel, registration);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getImoNumber() {
		return _imoNumber;
	}

	@Override
	public void setImoNumber(String imoNumber) {
		_imoNumber = imoNumber;

		if (_tempDeclarationOfHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempDeclarationOfHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setImoNumber", String.class);

				method.invoke(_tempDeclarationOfHealthRemoteModel, imoNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getArrivingFrom() {
		return _arrivingFrom;
	}

	@Override
	public void setArrivingFrom(String arrivingFrom) {
		_arrivingFrom = arrivingFrom;

		if (_tempDeclarationOfHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempDeclarationOfHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setArrivingFrom", String.class);

				method.invoke(_tempDeclarationOfHealthRemoteModel, arrivingFrom);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSailingTo() {
		return _sailingTo;
	}

	@Override
	public void setSailingTo(String sailingTo) {
		_sailingTo = sailingTo;

		if (_tempDeclarationOfHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempDeclarationOfHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setSailingTo", String.class);

				method.invoke(_tempDeclarationOfHealthRemoteModel, sailingTo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNationality() {
		return _nationality;
	}

	@Override
	public void setNationality(String nationality) {
		_nationality = nationality;

		if (_tempDeclarationOfHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempDeclarationOfHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setNationality", String.class);

				method.invoke(_tempDeclarationOfHealthRemoteModel, nationality);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMasterName() {
		return _masterName;
	}

	@Override
	public void setMasterName(String masterName) {
		_masterName = masterName;

		if (_tempDeclarationOfHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempDeclarationOfHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setMasterName", String.class);

				method.invoke(_tempDeclarationOfHealthRemoteModel, masterName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getGrossTonnage() {
		return _grossTonnage;
	}

	@Override
	public void setGrossTonnage(double grossTonnage) {
		_grossTonnage = grossTonnage;

		if (_tempDeclarationOfHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempDeclarationOfHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setGrossTonnage", double.class);

				method.invoke(_tempDeclarationOfHealthRemoteModel, grossTonnage);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGrossTonnageUnit() {
		return _grossTonnageUnit;
	}

	@Override
	public void setGrossTonnageUnit(String grossTonnageUnit) {
		_grossTonnageUnit = grossTonnageUnit;

		if (_tempDeclarationOfHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempDeclarationOfHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setGrossTonnageUnit",
						String.class);

				method.invoke(_tempDeclarationOfHealthRemoteModel,
					grossTonnageUnit);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getTonnage() {
		return _tonnage;
	}

	@Override
	public void setTonnage(double tonnage) {
		_tonnage = tonnage;

		if (_tempDeclarationOfHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempDeclarationOfHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setTonnage", double.class);

				method.invoke(_tempDeclarationOfHealthRemoteModel, tonnage);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTonnageUnit() {
		return _tonnageUnit;
	}

	@Override
	public void setTonnageUnit(String tonnageUnit) {
		_tonnageUnit = tonnageUnit;

		if (_tempDeclarationOfHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempDeclarationOfHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setTonnageUnit", String.class);

				method.invoke(_tempDeclarationOfHealthRemoteModel, tonnageUnit);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCertificatecarried() {
		return _certificatecarried;
	}

	@Override
	public void setCertificatecarried(int certificatecarried) {
		_certificatecarried = certificatecarried;

		if (_tempDeclarationOfHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempDeclarationOfHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setCertificatecarried",
						int.class);

				method.invoke(_tempDeclarationOfHealthRemoteModel,
					certificatecarried);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getIssuedAt() {
		return _issuedAt;
	}

	@Override
	public void setIssuedAt(String issuedAt) {
		_issuedAt = issuedAt;

		if (_tempDeclarationOfHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempDeclarationOfHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setIssuedAt", String.class);

				method.invoke(_tempDeclarationOfHealthRemoteModel, issuedAt);
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

		if (_tempDeclarationOfHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempDeclarationOfHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setIssueDate", Date.class);

				method.invoke(_tempDeclarationOfHealthRemoteModel, issueDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getReInspectionrequired() {
		return _reInspectionrequired;
	}

	@Override
	public void setReInspectionrequired(int reInspectionrequired) {
		_reInspectionrequired = reInspectionrequired;

		if (_tempDeclarationOfHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempDeclarationOfHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setReInspectionrequired",
						int.class);

				method.invoke(_tempDeclarationOfHealthRemoteModel,
					reInspectionrequired);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIsShipVisitedWHO() {
		return _isShipVisitedWHO;
	}

	@Override
	public void setIsShipVisitedWHO(int isShipVisitedWHO) {
		_isShipVisitedWHO = isShipVisitedWHO;

		if (_tempDeclarationOfHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempDeclarationOfHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setIsShipVisitedWHO", int.class);

				method.invoke(_tempDeclarationOfHealthRemoteModel,
					isShipVisitedWHO);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVisitedWHOPortCode() {
		return _visitedWHOPortCode;
	}

	@Override
	public void setVisitedWHOPortCode(String visitedWHOPortCode) {
		_visitedWHOPortCode = visitedWHOPortCode;

		if (_tempDeclarationOfHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempDeclarationOfHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setVisitedWHOPortCode",
						String.class);

				method.invoke(_tempDeclarationOfHealthRemoteModel,
					visitedWHOPortCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDateOfVisitedWHO() {
		return _dateOfVisitedWHO;
	}

	@Override
	public void setDateOfVisitedWHO(Date dateOfVisitedWHO) {
		_dateOfVisitedWHO = dateOfVisitedWHO;

		if (_tempDeclarationOfHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempDeclarationOfHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setDateOfVisitedWHO",
						Date.class);

				method.invoke(_tempDeclarationOfHealthRemoteModel,
					dateOfVisitedWHO);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getListPortName() {
		return _listPortName;
	}

	@Override
	public void setListPortName(String listPortName) {
		_listPortName = listPortName;

		if (_tempDeclarationOfHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempDeclarationOfHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setListPortName", String.class);

				method.invoke(_tempDeclarationOfHealthRemoteModel, listPortName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDoctorName() {
		return _doctorName;
	}

	@Override
	public void setDoctorName(String doctorName) {
		_doctorName = doctorName;

		if (_tempDeclarationOfHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempDeclarationOfHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setDoctorName", String.class);

				method.invoke(_tempDeclarationOfHealthRemoteModel, doctorName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDoctorSigndate() {
		return _doctorSigndate;
	}

	@Override
	public void setDoctorSigndate(Date doctorSigndate) {
		_doctorSigndate = doctorSigndate;

		if (_tempDeclarationOfHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempDeclarationOfHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setDoctorSigndate", Date.class);

				method.invoke(_tempDeclarationOfHealthRemoteModel,
					doctorSigndate);
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

		if (_tempDeclarationOfHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempDeclarationOfHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setSignPlace", String.class);

				method.invoke(_tempDeclarationOfHealthRemoteModel, signPlace);
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

		if (_tempDeclarationOfHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempDeclarationOfHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setSignDate", Date.class);

				method.invoke(_tempDeclarationOfHealthRemoteModel, signDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMasterSigned() {
		return _masterSigned;
	}

	@Override
	public void setMasterSigned(int masterSigned) {
		_masterSigned = masterSigned;

		if (_tempDeclarationOfHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempDeclarationOfHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setMasterSigned", int.class);

				method.invoke(_tempDeclarationOfHealthRemoteModel, masterSigned);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMasterSignedImage() {
		return _masterSignedImage;
	}

	@Override
	public void setMasterSignedImage(int masterSignedImage) {
		_masterSignedImage = masterSignedImage;

		if (_tempDeclarationOfHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempDeclarationOfHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setMasterSignedImage",
						int.class);

				method.invoke(_tempDeclarationOfHealthRemoteModel,
					masterSignedImage);
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

		if (_tempDeclarationOfHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempDeclarationOfHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setAttachedFile", long.class);

				method.invoke(_tempDeclarationOfHealthRemoteModel, attachedFile);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTempDeclarationOfHealthRemoteModel() {
		return _tempDeclarationOfHealthRemoteModel;
	}

	public void setTempDeclarationOfHealthRemoteModel(
		BaseModel<?> tempDeclarationOfHealthRemoteModel) {
		_tempDeclarationOfHealthRemoteModel = tempDeclarationOfHealthRemoteModel;
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

		Class<?> remoteModelClass = _tempDeclarationOfHealthRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tempDeclarationOfHealthRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TempDeclarationOfHealthLocalServiceUtil.addTempDeclarationOfHealth(this);
		}
		else {
			TempDeclarationOfHealthLocalServiceUtil.updateTempDeclarationOfHealth(this);
		}
	}

	@Override
	public TempDeclarationOfHealth toEscapedModel() {
		return (TempDeclarationOfHealth)ProxyUtil.newProxyInstance(TempDeclarationOfHealth.class.getClassLoader(),
			new Class[] { TempDeclarationOfHealth.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempDeclarationOfHealthClp clone = new TempDeclarationOfHealthClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setRequestState(getRequestState());
		clone.setDocumentName(getDocumentName());
		clone.setDocumentYear(getDocumentYear());
		clone.setUserCreated(getUserCreated());
		clone.setSubmittedPortCode(getSubmittedPortCode());
		clone.setDateSubmitted(getDateSubmitted());
		clone.setNameOfShip(getNameOfShip());
		clone.setRegistration(getRegistration());
		clone.setImoNumber(getImoNumber());
		clone.setArrivingFrom(getArrivingFrom());
		clone.setSailingTo(getSailingTo());
		clone.setNationality(getNationality());
		clone.setMasterName(getMasterName());
		clone.setGrossTonnage(getGrossTonnage());
		clone.setGrossTonnageUnit(getGrossTonnageUnit());
		clone.setTonnage(getTonnage());
		clone.setTonnageUnit(getTonnageUnit());
		clone.setCertificatecarried(getCertificatecarried());
		clone.setIssuedAt(getIssuedAt());
		clone.setIssueDate(getIssueDate());
		clone.setReInspectionrequired(getReInspectionrequired());
		clone.setIsShipVisitedWHO(getIsShipVisitedWHO());
		clone.setVisitedWHOPortCode(getVisitedWHOPortCode());
		clone.setDateOfVisitedWHO(getDateOfVisitedWHO());
		clone.setListPortName(getListPortName());
		clone.setDoctorName(getDoctorName());
		clone.setDoctorSigndate(getDoctorSigndate());
		clone.setSignPlace(getSignPlace());
		clone.setSignDate(getSignDate());
		clone.setMasterSigned(getMasterSigned());
		clone.setMasterSignedImage(getMasterSignedImage());
		clone.setAttachedFile(getAttachedFile());

		return clone;
	}

	@Override
	public int compareTo(TempDeclarationOfHealth tempDeclarationOfHealth) {
		int value = 0;

		if (getId() < tempDeclarationOfHealth.getId()) {
			value = -1;
		}
		else if (getId() > tempDeclarationOfHealth.getId()) {
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

		if (!(obj instanceof TempDeclarationOfHealthClp)) {
			return false;
		}

		TempDeclarationOfHealthClp tempDeclarationOfHealth = (TempDeclarationOfHealthClp)obj;

		long primaryKey = tempDeclarationOfHealth.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(69);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", requestState=");
		sb.append(getRequestState());
		sb.append(", documentName=");
		sb.append(getDocumentName());
		sb.append(", documentYear=");
		sb.append(getDocumentYear());
		sb.append(", userCreated=");
		sb.append(getUserCreated());
		sb.append(", submittedPortCode=");
		sb.append(getSubmittedPortCode());
		sb.append(", dateSubmitted=");
		sb.append(getDateSubmitted());
		sb.append(", nameOfShip=");
		sb.append(getNameOfShip());
		sb.append(", registration=");
		sb.append(getRegistration());
		sb.append(", imoNumber=");
		sb.append(getImoNumber());
		sb.append(", arrivingFrom=");
		sb.append(getArrivingFrom());
		sb.append(", sailingTo=");
		sb.append(getSailingTo());
		sb.append(", nationality=");
		sb.append(getNationality());
		sb.append(", masterName=");
		sb.append(getMasterName());
		sb.append(", grossTonnage=");
		sb.append(getGrossTonnage());
		sb.append(", grossTonnageUnit=");
		sb.append(getGrossTonnageUnit());
		sb.append(", tonnage=");
		sb.append(getTonnage());
		sb.append(", tonnageUnit=");
		sb.append(getTonnageUnit());
		sb.append(", certificatecarried=");
		sb.append(getCertificatecarried());
		sb.append(", issuedAt=");
		sb.append(getIssuedAt());
		sb.append(", issueDate=");
		sb.append(getIssueDate());
		sb.append(", reInspectionrequired=");
		sb.append(getReInspectionrequired());
		sb.append(", isShipVisitedWHO=");
		sb.append(getIsShipVisitedWHO());
		sb.append(", visitedWHOPortCode=");
		sb.append(getVisitedWHOPortCode());
		sb.append(", dateOfVisitedWHO=");
		sb.append(getDateOfVisitedWHO());
		sb.append(", listPortName=");
		sb.append(getListPortName());
		sb.append(", doctorName=");
		sb.append(getDoctorName());
		sb.append(", doctorSigndate=");
		sb.append(getDoctorSigndate());
		sb.append(", signPlace=");
		sb.append(getSignPlace());
		sb.append(", signDate=");
		sb.append(getSignDate());
		sb.append(", masterSigned=");
		sb.append(getMasterSigned());
		sb.append(", masterSignedImage=");
		sb.append(getMasterSignedImage());
		sb.append(", attachedFile=");
		sb.append(getAttachedFile());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(106);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.TempDeclarationOfHealth");
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
			"<column><column-name>requestState</column-name><column-value><![CDATA[");
		sb.append(getRequestState());
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
			"<column><column-name>userCreated</column-name><column-value><![CDATA[");
		sb.append(getUserCreated());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>submittedPortCode</column-name><column-value><![CDATA[");
		sb.append(getSubmittedPortCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateSubmitted</column-name><column-value><![CDATA[");
		sb.append(getDateSubmitted());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameOfShip</column-name><column-value><![CDATA[");
		sb.append(getNameOfShip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registration</column-name><column-value><![CDATA[");
		sb.append(getRegistration());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>imoNumber</column-name><column-value><![CDATA[");
		sb.append(getImoNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>arrivingFrom</column-name><column-value><![CDATA[");
		sb.append(getArrivingFrom());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sailingTo</column-name><column-value><![CDATA[");
		sb.append(getSailingTo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nationality</column-name><column-value><![CDATA[");
		sb.append(getNationality());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>masterName</column-name><column-value><![CDATA[");
		sb.append(getMasterName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>grossTonnage</column-name><column-value><![CDATA[");
		sb.append(getGrossTonnage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>grossTonnageUnit</column-name><column-value><![CDATA[");
		sb.append(getGrossTonnageUnit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tonnage</column-name><column-value><![CDATA[");
		sb.append(getTonnage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tonnageUnit</column-name><column-value><![CDATA[");
		sb.append(getTonnageUnit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificatecarried</column-name><column-value><![CDATA[");
		sb.append(getCertificatecarried());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>issuedAt</column-name><column-value><![CDATA[");
		sb.append(getIssuedAt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>issueDate</column-name><column-value><![CDATA[");
		sb.append(getIssueDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reInspectionrequired</column-name><column-value><![CDATA[");
		sb.append(getReInspectionrequired());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isShipVisitedWHO</column-name><column-value><![CDATA[");
		sb.append(getIsShipVisitedWHO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>visitedWHOPortCode</column-name><column-value><![CDATA[");
		sb.append(getVisitedWHOPortCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateOfVisitedWHO</column-name><column-value><![CDATA[");
		sb.append(getDateOfVisitedWHO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>listPortName</column-name><column-value><![CDATA[");
		sb.append(getListPortName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>doctorName</column-name><column-value><![CDATA[");
		sb.append(getDoctorName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>doctorSigndate</column-name><column-value><![CDATA[");
		sb.append(getDoctorSigndate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signPlace</column-name><column-value><![CDATA[");
		sb.append(getSignPlace());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signDate</column-name><column-value><![CDATA[");
		sb.append(getSignDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>masterSigned</column-name><column-value><![CDATA[");
		sb.append(getMasterSigned());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>masterSignedImage</column-name><column-value><![CDATA[");
		sb.append(getMasterSignedImage());
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
	private int _requestState;
	private long _documentName;
	private int _documentYear;
	private String _userCreated;
	private String _submittedPortCode;
	private Date _dateSubmitted;
	private String _nameOfShip;
	private String _registration;
	private String _imoNumber;
	private String _arrivingFrom;
	private String _sailingTo;
	private String _nationality;
	private String _masterName;
	private double _grossTonnage;
	private String _grossTonnageUnit;
	private double _tonnage;
	private String _tonnageUnit;
	private int _certificatecarried;
	private String _issuedAt;
	private Date _issueDate;
	private int _reInspectionrequired;
	private int _isShipVisitedWHO;
	private String _visitedWHOPortCode;
	private Date _dateOfVisitedWHO;
	private String _listPortName;
	private String _doctorName;
	private Date _doctorSigndate;
	private String _signPlace;
	private Date _signDate;
	private int _masterSigned;
	private int _masterSignedImage;
	private long _attachedFile;
	private BaseModel<?> _tempDeclarationOfHealthRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.class;
}