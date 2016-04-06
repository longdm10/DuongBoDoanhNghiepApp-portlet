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
import vn.dtt.duongbien.dao.vrcb.service.TempNoTiceShipMessageLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class TempNoTiceShipMessageClp extends BaseModelImpl<TempNoTiceShipMessage>
	implements TempNoTiceShipMessage {
	public TempNoTiceShipMessageClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TempNoTiceShipMessage.class;
	}

	@Override
	public String getModelClassName() {
		return TempNoTiceShipMessage.class.getName();
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
		attributes.put("noticeShipType", getNoticeShipType());
		attributes.put("noticeShipCode", getNoticeShipCode());
		attributes.put("documentName", getDocumentName());
		attributes.put("userCreated", getUserCreated());
		attributes.put("confirmTime", getConfirmTime());
		attributes.put("shipName", getShipName());
		attributes.put("shipTypeCode", getShipTypeCode());
		attributes.put("stateCode", getStateCode());
		attributes.put("shipCaptain", getShipCaptain());
		attributes.put("imo", getImo());
		attributes.put("grt", getGrt());
		attributes.put("dwt", getDwt());
		attributes.put("unitGRT", getUnitGRT());
		attributes.put("unitDWT", getUnitDWT());
		attributes.put("callSign", getCallSign());
		attributes.put("arrivalDate", getArrivalDate());
		attributes.put("arrivalPortCode", getArrivalPortCode());
		attributes.put("portHarbourCode", getPortHarbourCode());
		attributes.put("portRegionCode", getPortRegionCode());
		attributes.put("portWharfCode", getPortWharfCode());
		attributes.put("portGoingToStateName", getPortGoingToStateName());
		attributes.put("portGoingToCode", getPortGoingToCode());
		attributes.put("nameOfShipOwners", getNameOfShipOwners());
		attributes.put("addressOfShipOwners", getAddressOfShipOwners());
		attributes.put("shipOwnerstateCode", getShipOwnerstateCode());
		attributes.put("shipOwnerPhone", getShipOwnerPhone());
		attributes.put("shipOwnerFax", getShipOwnerFax());
		attributes.put("shipOwnerEmail", getShipOwnerEmail());
		attributes.put("loa", getLoa());
		attributes.put("breadth", getBreadth());
		attributes.put("clearanceHeight", getClearanceHeight());
		attributes.put("shownDraftxF", getShownDraftxF());
		attributes.put("shownDraftxA", getShownDraftxA());
		attributes.put("unitLOA", getUnitLOA());
		attributes.put("unitBreadth", getUnitBreadth());
		attributes.put("unitClearanceHeight", getUnitClearanceHeight());
		attributes.put("unitShownDraftxF", getUnitShownDraftxF());
		attributes.put("unitShownDraftxA", getUnitShownDraftxA());
		attributes.put("certificateOfRegistryNumber",
			getCertificateOfRegistryNumber());
		attributes.put("certificateOfRegistryDate",
			getCertificateOfRegistryDate());
		attributes.put("certificateOfRegistryPortName",
			getCertificateOfRegistryPortName());
		attributes.put("shipAgencyCode", getShipAgencyCode());
		attributes.put("shipAgencyAddress", getShipAgencyAddress());
		attributes.put("shipAgencyPhone", getShipAgencyPhone());
		attributes.put("shipAgencyFax", getShipAgencyFax());
		attributes.put("shipAgencyEmail", getShipAgencyEmail());
		attributes.put("purposeCode", getPurposeCode());
		attributes.put("purposeSpecified", getPurposeSpecified());
		attributes.put("crewNumber", getCrewNumber());
		attributes.put("unitCrew", getUnitCrew());
		attributes.put("passengerNumber", getPassengerNumber());
		attributes.put("unitPassenger", getUnitPassenger());
		attributes.put("quantityAndTypeOfCargo", getQuantityAndTypeOfCargo());
		attributes.put("unitQuantityofCargo", getUnitQuantityofCargo());
		attributes.put("typeOfCargo", getTypeOfCargo());
		attributes.put("otherPersons", getOtherPersons());
		attributes.put("remarks", getRemarks());
		attributes.put("signPlace", getSignPlace());
		attributes.put("signDate", getSignDate());
		attributes.put("masterSigned", getMasterSigned());
		attributes.put("masterSignedImage", getMasterSignedImage());
		attributes.put("documentYear", getDocumentYear());
		attributes.put("nameOfShipAgent", getNameOfShipAgent());

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

		String noticeShipType = (String)attributes.get("noticeShipType");

		if (noticeShipType != null) {
			setNoticeShipType(noticeShipType);
		}

		String noticeShipCode = (String)attributes.get("noticeShipCode");

		if (noticeShipCode != null) {
			setNoticeShipCode(noticeShipCode);
		}

		Long documentName = (Long)attributes.get("documentName");

		if (documentName != null) {
			setDocumentName(documentName);
		}

		String userCreated = (String)attributes.get("userCreated");

		if (userCreated != null) {
			setUserCreated(userCreated);
		}

		Integer confirmTime = (Integer)attributes.get("confirmTime");

		if (confirmTime != null) {
			setConfirmTime(confirmTime);
		}

		String shipName = (String)attributes.get("shipName");

		if (shipName != null) {
			setShipName(shipName);
		}

		String shipTypeCode = (String)attributes.get("shipTypeCode");

		if (shipTypeCode != null) {
			setShipTypeCode(shipTypeCode);
		}

		String stateCode = (String)attributes.get("stateCode");

		if (stateCode != null) {
			setStateCode(stateCode);
		}

		String shipCaptain = (String)attributes.get("shipCaptain");

		if (shipCaptain != null) {
			setShipCaptain(shipCaptain);
		}

		String imo = (String)attributes.get("imo");

		if (imo != null) {
			setImo(imo);
		}

		Double grt = (Double)attributes.get("grt");

		if (grt != null) {
			setGrt(grt);
		}

		Double dwt = (Double)attributes.get("dwt");

		if (dwt != null) {
			setDwt(dwt);
		}

		String unitGRT = (String)attributes.get("unitGRT");

		if (unitGRT != null) {
			setUnitGRT(unitGRT);
		}

		String unitDWT = (String)attributes.get("unitDWT");

		if (unitDWT != null) {
			setUnitDWT(unitDWT);
		}

		String callSign = (String)attributes.get("callSign");

		if (callSign != null) {
			setCallSign(callSign);
		}

		Date arrivalDate = (Date)attributes.get("arrivalDate");

		if (arrivalDate != null) {
			setArrivalDate(arrivalDate);
		}

		String arrivalPortCode = (String)attributes.get("arrivalPortCode");

		if (arrivalPortCode != null) {
			setArrivalPortCode(arrivalPortCode);
		}

		String portHarbourCode = (String)attributes.get("portHarbourCode");

		if (portHarbourCode != null) {
			setPortHarbourCode(portHarbourCode);
		}

		String portRegionCode = (String)attributes.get("portRegionCode");

		if (portRegionCode != null) {
			setPortRegionCode(portRegionCode);
		}

		String portWharfCode = (String)attributes.get("portWharfCode");

		if (portWharfCode != null) {
			setPortWharfCode(portWharfCode);
		}

		String portGoingToStateName = (String)attributes.get(
				"portGoingToStateName");

		if (portGoingToStateName != null) {
			setPortGoingToStateName(portGoingToStateName);
		}

		String portGoingToCode = (String)attributes.get("portGoingToCode");

		if (portGoingToCode != null) {
			setPortGoingToCode(portGoingToCode);
		}

		String nameOfShipOwners = (String)attributes.get("nameOfShipOwners");

		if (nameOfShipOwners != null) {
			setNameOfShipOwners(nameOfShipOwners);
		}

		String addressOfShipOwners = (String)attributes.get(
				"addressOfShipOwners");

		if (addressOfShipOwners != null) {
			setAddressOfShipOwners(addressOfShipOwners);
		}

		String shipOwnerstateCode = (String)attributes.get("shipOwnerstateCode");

		if (shipOwnerstateCode != null) {
			setShipOwnerstateCode(shipOwnerstateCode);
		}

		String shipOwnerPhone = (String)attributes.get("shipOwnerPhone");

		if (shipOwnerPhone != null) {
			setShipOwnerPhone(shipOwnerPhone);
		}

		String shipOwnerFax = (String)attributes.get("shipOwnerFax");

		if (shipOwnerFax != null) {
			setShipOwnerFax(shipOwnerFax);
		}

		String shipOwnerEmail = (String)attributes.get("shipOwnerEmail");

		if (shipOwnerEmail != null) {
			setShipOwnerEmail(shipOwnerEmail);
		}

		Double loa = (Double)attributes.get("loa");

		if (loa != null) {
			setLoa(loa);
		}

		Double breadth = (Double)attributes.get("breadth");

		if (breadth != null) {
			setBreadth(breadth);
		}

		Double clearanceHeight = (Double)attributes.get("clearanceHeight");

		if (clearanceHeight != null) {
			setClearanceHeight(clearanceHeight);
		}

		Double shownDraftxF = (Double)attributes.get("shownDraftxF");

		if (shownDraftxF != null) {
			setShownDraftxF(shownDraftxF);
		}

		Double shownDraftxA = (Double)attributes.get("shownDraftxA");

		if (shownDraftxA != null) {
			setShownDraftxA(shownDraftxA);
		}

		String unitLOA = (String)attributes.get("unitLOA");

		if (unitLOA != null) {
			setUnitLOA(unitLOA);
		}

		String unitBreadth = (String)attributes.get("unitBreadth");

		if (unitBreadth != null) {
			setUnitBreadth(unitBreadth);
		}

		String unitClearanceHeight = (String)attributes.get(
				"unitClearanceHeight");

		if (unitClearanceHeight != null) {
			setUnitClearanceHeight(unitClearanceHeight);
		}

		String unitShownDraftxF = (String)attributes.get("unitShownDraftxF");

		if (unitShownDraftxF != null) {
			setUnitShownDraftxF(unitShownDraftxF);
		}

		String unitShownDraftxA = (String)attributes.get("unitShownDraftxA");

		if (unitShownDraftxA != null) {
			setUnitShownDraftxA(unitShownDraftxA);
		}

		String certificateOfRegistryNumber = (String)attributes.get(
				"certificateOfRegistryNumber");

		if (certificateOfRegistryNumber != null) {
			setCertificateOfRegistryNumber(certificateOfRegistryNumber);
		}

		Date certificateOfRegistryDate = (Date)attributes.get(
				"certificateOfRegistryDate");

		if (certificateOfRegistryDate != null) {
			setCertificateOfRegistryDate(certificateOfRegistryDate);
		}

		String certificateOfRegistryPortName = (String)attributes.get(
				"certificateOfRegistryPortName");

		if (certificateOfRegistryPortName != null) {
			setCertificateOfRegistryPortName(certificateOfRegistryPortName);
		}

		String shipAgencyCode = (String)attributes.get("shipAgencyCode");

		if (shipAgencyCode != null) {
			setShipAgencyCode(shipAgencyCode);
		}

		String shipAgencyAddress = (String)attributes.get("shipAgencyAddress");

		if (shipAgencyAddress != null) {
			setShipAgencyAddress(shipAgencyAddress);
		}

		String shipAgencyPhone = (String)attributes.get("shipAgencyPhone");

		if (shipAgencyPhone != null) {
			setShipAgencyPhone(shipAgencyPhone);
		}

		String shipAgencyFax = (String)attributes.get("shipAgencyFax");

		if (shipAgencyFax != null) {
			setShipAgencyFax(shipAgencyFax);
		}

		String shipAgencyEmail = (String)attributes.get("shipAgencyEmail");

		if (shipAgencyEmail != null) {
			setShipAgencyEmail(shipAgencyEmail);
		}

		String purposeCode = (String)attributes.get("purposeCode");

		if (purposeCode != null) {
			setPurposeCode(purposeCode);
		}

		String purposeSpecified = (String)attributes.get("purposeSpecified");

		if (purposeSpecified != null) {
			setPurposeSpecified(purposeSpecified);
		}

		Long crewNumber = (Long)attributes.get("crewNumber");

		if (crewNumber != null) {
			setCrewNumber(crewNumber);
		}

		String unitCrew = (String)attributes.get("unitCrew");

		if (unitCrew != null) {
			setUnitCrew(unitCrew);
		}

		Long passengerNumber = (Long)attributes.get("passengerNumber");

		if (passengerNumber != null) {
			setPassengerNumber(passengerNumber);
		}

		String unitPassenger = (String)attributes.get("unitPassenger");

		if (unitPassenger != null) {
			setUnitPassenger(unitPassenger);
		}

		String quantityAndTypeOfCargo = (String)attributes.get(
				"quantityAndTypeOfCargo");

		if (quantityAndTypeOfCargo != null) {
			setQuantityAndTypeOfCargo(quantityAndTypeOfCargo);
		}

		String unitQuantityofCargo = (String)attributes.get(
				"unitQuantityofCargo");

		if (unitQuantityofCargo != null) {
			setUnitQuantityofCargo(unitQuantityofCargo);
		}

		String typeOfCargo = (String)attributes.get("typeOfCargo");

		if (typeOfCargo != null) {
			setTypeOfCargo(typeOfCargo);
		}

		Integer otherPersons = (Integer)attributes.get("otherPersons");

		if (otherPersons != null) {
			setOtherPersons(otherPersons);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
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

		Integer documentYear = (Integer)attributes.get("documentYear");

		if (documentYear != null) {
			setDocumentYear(documentYear);
		}

		String nameOfShipAgent = (String)attributes.get("nameOfShipAgent");

		if (nameOfShipAgent != null) {
			setNameOfShipAgent(nameOfShipAgent);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, id);
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

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestCode", String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, requestCode);
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

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestState", int.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, requestState);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNoticeShipType() {
		return _noticeShipType;
	}

	@Override
	public void setNoticeShipType(String noticeShipType) {
		_noticeShipType = noticeShipType;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setNoticeShipType",
						String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, noticeShipType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNoticeShipCode() {
		return _noticeShipCode;
	}

	@Override
	public void setNoticeShipCode(String noticeShipCode) {
		_noticeShipCode = noticeShipCode;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setNoticeShipCode",
						String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, noticeShipCode);
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

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentName", long.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, documentName);
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

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setUserCreated", String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, userCreated);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getConfirmTime() {
		return _confirmTime;
	}

	@Override
	public void setConfirmTime(int confirmTime) {
		_confirmTime = confirmTime;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setConfirmTime", int.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, confirmTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getShipName() {
		return _shipName;
	}

	@Override
	public void setShipName(String shipName) {
		_shipName = shipName;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setShipName", String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, shipName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getShipTypeCode() {
		return _shipTypeCode;
	}

	@Override
	public void setShipTypeCode(String shipTypeCode) {
		_shipTypeCode = shipTypeCode;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setShipTypeCode", String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, shipTypeCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStateCode() {
		return _stateCode;
	}

	@Override
	public void setStateCode(String stateCode) {
		_stateCode = stateCode;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setStateCode", String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, stateCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getShipCaptain() {
		return _shipCaptain;
	}

	@Override
	public void setShipCaptain(String shipCaptain) {
		_shipCaptain = shipCaptain;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setShipCaptain", String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, shipCaptain);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getImo() {
		return _imo;
	}

	@Override
	public void setImo(String imo) {
		_imo = imo;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setImo", String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, imo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getGrt() {
		return _grt;
	}

	@Override
	public void setGrt(double grt) {
		_grt = grt;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setGrt", double.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, grt);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getDwt() {
		return _dwt;
	}

	@Override
	public void setDwt(double dwt) {
		_dwt = dwt;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setDwt", double.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, dwt);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUnitGRT() {
		return _unitGRT;
	}

	@Override
	public void setUnitGRT(String unitGRT) {
		_unitGRT = unitGRT;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitGRT", String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, unitGRT);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUnitDWT() {
		return _unitDWT;
	}

	@Override
	public void setUnitDWT(String unitDWT) {
		_unitDWT = unitDWT;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitDWT", String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, unitDWT);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCallSign() {
		return _callSign;
	}

	@Override
	public void setCallSign(String callSign) {
		_callSign = callSign;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setCallSign", String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, callSign);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getArrivalDate() {
		return _arrivalDate;
	}

	@Override
	public void setArrivalDate(Date arrivalDate) {
		_arrivalDate = arrivalDate;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setArrivalDate", Date.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, arrivalDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getArrivalPortCode() {
		return _arrivalPortCode;
	}

	@Override
	public void setArrivalPortCode(String arrivalPortCode) {
		_arrivalPortCode = arrivalPortCode;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setArrivalPortCode",
						String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, arrivalPortCode);
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

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setPortHarbourCode",
						String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, portHarbourCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPortRegionCode() {
		return _portRegionCode;
	}

	@Override
	public void setPortRegionCode(String portRegionCode) {
		_portRegionCode = portRegionCode;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setPortRegionCode",
						String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, portRegionCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPortWharfCode() {
		return _portWharfCode;
	}

	@Override
	public void setPortWharfCode(String portWharfCode) {
		_portWharfCode = portWharfCode;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setPortWharfCode", String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, portWharfCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPortGoingToStateName() {
		return _portGoingToStateName;
	}

	@Override
	public void setPortGoingToStateName(String portGoingToStateName) {
		_portGoingToStateName = portGoingToStateName;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setPortGoingToStateName",
						String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel,
					portGoingToStateName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPortGoingToCode() {
		return _portGoingToCode;
	}

	@Override
	public void setPortGoingToCode(String portGoingToCode) {
		_portGoingToCode = portGoingToCode;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setPortGoingToCode",
						String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, portGoingToCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNameOfShipOwners() {
		return _nameOfShipOwners;
	}

	@Override
	public void setNameOfShipOwners(String nameOfShipOwners) {
		_nameOfShipOwners = nameOfShipOwners;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setNameOfShipOwners",
						String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel,
					nameOfShipOwners);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAddressOfShipOwners() {
		return _addressOfShipOwners;
	}

	@Override
	public void setAddressOfShipOwners(String addressOfShipOwners) {
		_addressOfShipOwners = addressOfShipOwners;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setAddressOfShipOwners",
						String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel,
					addressOfShipOwners);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getShipOwnerstateCode() {
		return _shipOwnerstateCode;
	}

	@Override
	public void setShipOwnerstateCode(String shipOwnerstateCode) {
		_shipOwnerstateCode = shipOwnerstateCode;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setShipOwnerstateCode",
						String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel,
					shipOwnerstateCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getShipOwnerPhone() {
		return _shipOwnerPhone;
	}

	@Override
	public void setShipOwnerPhone(String shipOwnerPhone) {
		_shipOwnerPhone = shipOwnerPhone;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setShipOwnerPhone",
						String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, shipOwnerPhone);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getShipOwnerFax() {
		return _shipOwnerFax;
	}

	@Override
	public void setShipOwnerFax(String shipOwnerFax) {
		_shipOwnerFax = shipOwnerFax;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setShipOwnerFax", String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, shipOwnerFax);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getShipOwnerEmail() {
		return _shipOwnerEmail;
	}

	@Override
	public void setShipOwnerEmail(String shipOwnerEmail) {
		_shipOwnerEmail = shipOwnerEmail;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setShipOwnerEmail",
						String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, shipOwnerEmail);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getLoa() {
		return _loa;
	}

	@Override
	public void setLoa(double loa) {
		_loa = loa;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setLoa", double.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, loa);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getBreadth() {
		return _breadth;
	}

	@Override
	public void setBreadth(double breadth) {
		_breadth = breadth;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setBreadth", double.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, breadth);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getClearanceHeight() {
		return _clearanceHeight;
	}

	@Override
	public void setClearanceHeight(double clearanceHeight) {
		_clearanceHeight = clearanceHeight;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setClearanceHeight",
						double.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, clearanceHeight);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getShownDraftxF() {
		return _shownDraftxF;
	}

	@Override
	public void setShownDraftxF(double shownDraftxF) {
		_shownDraftxF = shownDraftxF;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setShownDraftxF", double.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, shownDraftxF);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getShownDraftxA() {
		return _shownDraftxA;
	}

	@Override
	public void setShownDraftxA(double shownDraftxA) {
		_shownDraftxA = shownDraftxA;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setShownDraftxA", double.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, shownDraftxA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUnitLOA() {
		return _unitLOA;
	}

	@Override
	public void setUnitLOA(String unitLOA) {
		_unitLOA = unitLOA;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitLOA", String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, unitLOA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUnitBreadth() {
		return _unitBreadth;
	}

	@Override
	public void setUnitBreadth(String unitBreadth) {
		_unitBreadth = unitBreadth;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitBreadth", String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, unitBreadth);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUnitClearanceHeight() {
		return _unitClearanceHeight;
	}

	@Override
	public void setUnitClearanceHeight(String unitClearanceHeight) {
		_unitClearanceHeight = unitClearanceHeight;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitClearanceHeight",
						String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel,
					unitClearanceHeight);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUnitShownDraftxF() {
		return _unitShownDraftxF;
	}

	@Override
	public void setUnitShownDraftxF(String unitShownDraftxF) {
		_unitShownDraftxF = unitShownDraftxF;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitShownDraftxF",
						String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel,
					unitShownDraftxF);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUnitShownDraftxA() {
		return _unitShownDraftxA;
	}

	@Override
	public void setUnitShownDraftxA(String unitShownDraftxA) {
		_unitShownDraftxA = unitShownDraftxA;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitShownDraftxA",
						String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel,
					unitShownDraftxA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCertificateOfRegistryNumber() {
		return _certificateOfRegistryNumber;
	}

	@Override
	public void setCertificateOfRegistryNumber(
		String certificateOfRegistryNumber) {
		_certificateOfRegistryNumber = certificateOfRegistryNumber;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setCertificateOfRegistryNumber",
						String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel,
					certificateOfRegistryNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCertificateOfRegistryDate() {
		return _certificateOfRegistryDate;
	}

	@Override
	public void setCertificateOfRegistryDate(Date certificateOfRegistryDate) {
		_certificateOfRegistryDate = certificateOfRegistryDate;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setCertificateOfRegistryDate",
						Date.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel,
					certificateOfRegistryDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCertificateOfRegistryPortName() {
		return _certificateOfRegistryPortName;
	}

	@Override
	public void setCertificateOfRegistryPortName(
		String certificateOfRegistryPortName) {
		_certificateOfRegistryPortName = certificateOfRegistryPortName;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setCertificateOfRegistryPortName",
						String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel,
					certificateOfRegistryPortName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getShipAgencyCode() {
		return _shipAgencyCode;
	}

	@Override
	public void setShipAgencyCode(String shipAgencyCode) {
		_shipAgencyCode = shipAgencyCode;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setShipAgencyCode",
						String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, shipAgencyCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getShipAgencyAddress() {
		return _shipAgencyAddress;
	}

	@Override
	public void setShipAgencyAddress(String shipAgencyAddress) {
		_shipAgencyAddress = shipAgencyAddress;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setShipAgencyAddress",
						String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel,
					shipAgencyAddress);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getShipAgencyPhone() {
		return _shipAgencyPhone;
	}

	@Override
	public void setShipAgencyPhone(String shipAgencyPhone) {
		_shipAgencyPhone = shipAgencyPhone;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setShipAgencyPhone",
						String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, shipAgencyPhone);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getShipAgencyFax() {
		return _shipAgencyFax;
	}

	@Override
	public void setShipAgencyFax(String shipAgencyFax) {
		_shipAgencyFax = shipAgencyFax;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setShipAgencyFax", String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, shipAgencyFax);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getShipAgencyEmail() {
		return _shipAgencyEmail;
	}

	@Override
	public void setShipAgencyEmail(String shipAgencyEmail) {
		_shipAgencyEmail = shipAgencyEmail;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setShipAgencyEmail",
						String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, shipAgencyEmail);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPurposeCode() {
		return _purposeCode;
	}

	@Override
	public void setPurposeCode(String purposeCode) {
		_purposeCode = purposeCode;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setPurposeCode", String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, purposeCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPurposeSpecified() {
		return _purposeSpecified;
	}

	@Override
	public void setPurposeSpecified(String purposeSpecified) {
		_purposeSpecified = purposeSpecified;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setPurposeSpecified",
						String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel,
					purposeSpecified);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCrewNumber() {
		return _crewNumber;
	}

	@Override
	public void setCrewNumber(long crewNumber) {
		_crewNumber = crewNumber;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setCrewNumber", long.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, crewNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUnitCrew() {
		return _unitCrew;
	}

	@Override
	public void setUnitCrew(String unitCrew) {
		_unitCrew = unitCrew;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitCrew", String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, unitCrew);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPassengerNumber() {
		return _passengerNumber;
	}

	@Override
	public void setPassengerNumber(long passengerNumber) {
		_passengerNumber = passengerNumber;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setPassengerNumber", long.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, passengerNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUnitPassenger() {
		return _unitPassenger;
	}

	@Override
	public void setUnitPassenger(String unitPassenger) {
		_unitPassenger = unitPassenger;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitPassenger", String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, unitPassenger);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getQuantityAndTypeOfCargo() {
		return _quantityAndTypeOfCargo;
	}

	@Override
	public void setQuantityAndTypeOfCargo(String quantityAndTypeOfCargo) {
		_quantityAndTypeOfCargo = quantityAndTypeOfCargo;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setQuantityAndTypeOfCargo",
						String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel,
					quantityAndTypeOfCargo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUnitQuantityofCargo() {
		return _unitQuantityofCargo;
	}

	@Override
	public void setUnitQuantityofCargo(String unitQuantityofCargo) {
		_unitQuantityofCargo = unitQuantityofCargo;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitQuantityofCargo",
						String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel,
					unitQuantityofCargo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTypeOfCargo() {
		return _typeOfCargo;
	}

	@Override
	public void setTypeOfCargo(String typeOfCargo) {
		_typeOfCargo = typeOfCargo;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setTypeOfCargo", String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, typeOfCargo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getOtherPersons() {
		return _otherPersons;
	}

	@Override
	public void setOtherPersons(int otherPersons) {
		_otherPersons = otherPersons;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setOtherPersons", int.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, otherPersons);
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

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setRemarks", String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, remarks);
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

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setSignPlace", String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, signPlace);
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

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setSignDate", Date.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, signDate);
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

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setMasterSigned", int.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, masterSigned);
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

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setMasterSignedImage",
						int.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel,
					masterSignedImage);
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

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentYear", int.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, documentYear);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNameOfShipAgent() {
		return _nameOfShipAgent;
	}

	@Override
	public void setNameOfShipAgent(String nameOfShipAgent) {
		_nameOfShipAgent = nameOfShipAgent;

		if (_tempNoTiceShipMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempNoTiceShipMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setNameOfShipAgent",
						String.class);

				method.invoke(_tempNoTiceShipMessageRemoteModel, nameOfShipAgent);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTempNoTiceShipMessageRemoteModel() {
		return _tempNoTiceShipMessageRemoteModel;
	}

	public void setTempNoTiceShipMessageRemoteModel(
		BaseModel<?> tempNoTiceShipMessageRemoteModel) {
		_tempNoTiceShipMessageRemoteModel = tempNoTiceShipMessageRemoteModel;
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

		Class<?> remoteModelClass = _tempNoTiceShipMessageRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tempNoTiceShipMessageRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TempNoTiceShipMessageLocalServiceUtil.addTempNoTiceShipMessage(this);
		}
		else {
			TempNoTiceShipMessageLocalServiceUtil.updateTempNoTiceShipMessage(this);
		}
	}

	@Override
	public TempNoTiceShipMessage toEscapedModel() {
		return (TempNoTiceShipMessage)ProxyUtil.newProxyInstance(TempNoTiceShipMessage.class.getClassLoader(),
			new Class[] { TempNoTiceShipMessage.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempNoTiceShipMessageClp clone = new TempNoTiceShipMessageClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setRequestState(getRequestState());
		clone.setNoticeShipType(getNoticeShipType());
		clone.setNoticeShipCode(getNoticeShipCode());
		clone.setDocumentName(getDocumentName());
		clone.setUserCreated(getUserCreated());
		clone.setConfirmTime(getConfirmTime());
		clone.setShipName(getShipName());
		clone.setShipTypeCode(getShipTypeCode());
		clone.setStateCode(getStateCode());
		clone.setShipCaptain(getShipCaptain());
		clone.setImo(getImo());
		clone.setGrt(getGrt());
		clone.setDwt(getDwt());
		clone.setUnitGRT(getUnitGRT());
		clone.setUnitDWT(getUnitDWT());
		clone.setCallSign(getCallSign());
		clone.setArrivalDate(getArrivalDate());
		clone.setArrivalPortCode(getArrivalPortCode());
		clone.setPortHarbourCode(getPortHarbourCode());
		clone.setPortRegionCode(getPortRegionCode());
		clone.setPortWharfCode(getPortWharfCode());
		clone.setPortGoingToStateName(getPortGoingToStateName());
		clone.setPortGoingToCode(getPortGoingToCode());
		clone.setNameOfShipOwners(getNameOfShipOwners());
		clone.setAddressOfShipOwners(getAddressOfShipOwners());
		clone.setShipOwnerstateCode(getShipOwnerstateCode());
		clone.setShipOwnerPhone(getShipOwnerPhone());
		clone.setShipOwnerFax(getShipOwnerFax());
		clone.setShipOwnerEmail(getShipOwnerEmail());
		clone.setLoa(getLoa());
		clone.setBreadth(getBreadth());
		clone.setClearanceHeight(getClearanceHeight());
		clone.setShownDraftxF(getShownDraftxF());
		clone.setShownDraftxA(getShownDraftxA());
		clone.setUnitLOA(getUnitLOA());
		clone.setUnitBreadth(getUnitBreadth());
		clone.setUnitClearanceHeight(getUnitClearanceHeight());
		clone.setUnitShownDraftxF(getUnitShownDraftxF());
		clone.setUnitShownDraftxA(getUnitShownDraftxA());
		clone.setCertificateOfRegistryNumber(getCertificateOfRegistryNumber());
		clone.setCertificateOfRegistryDate(getCertificateOfRegistryDate());
		clone.setCertificateOfRegistryPortName(getCertificateOfRegistryPortName());
		clone.setShipAgencyCode(getShipAgencyCode());
		clone.setShipAgencyAddress(getShipAgencyAddress());
		clone.setShipAgencyPhone(getShipAgencyPhone());
		clone.setShipAgencyFax(getShipAgencyFax());
		clone.setShipAgencyEmail(getShipAgencyEmail());
		clone.setPurposeCode(getPurposeCode());
		clone.setPurposeSpecified(getPurposeSpecified());
		clone.setCrewNumber(getCrewNumber());
		clone.setUnitCrew(getUnitCrew());
		clone.setPassengerNumber(getPassengerNumber());
		clone.setUnitPassenger(getUnitPassenger());
		clone.setQuantityAndTypeOfCargo(getQuantityAndTypeOfCargo());
		clone.setUnitQuantityofCargo(getUnitQuantityofCargo());
		clone.setTypeOfCargo(getTypeOfCargo());
		clone.setOtherPersons(getOtherPersons());
		clone.setRemarks(getRemarks());
		clone.setSignPlace(getSignPlace());
		clone.setSignDate(getSignDate());
		clone.setMasterSigned(getMasterSigned());
		clone.setMasterSignedImage(getMasterSignedImage());
		clone.setDocumentYear(getDocumentYear());
		clone.setNameOfShipAgent(getNameOfShipAgent());

		return clone;
	}

	@Override
	public int compareTo(TempNoTiceShipMessage tempNoTiceShipMessage) {
		int value = 0;

		if (getId() < tempNoTiceShipMessage.getId()) {
			value = -1;
		}
		else if (getId() > tempNoTiceShipMessage.getId()) {
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

		if (!(obj instanceof TempNoTiceShipMessageClp)) {
			return false;
		}

		TempNoTiceShipMessageClp tempNoTiceShipMessage = (TempNoTiceShipMessageClp)obj;

		long primaryKey = tempNoTiceShipMessage.getPrimaryKey();

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
		StringBundler sb = new StringBundler(133);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", requestState=");
		sb.append(getRequestState());
		sb.append(", noticeShipType=");
		sb.append(getNoticeShipType());
		sb.append(", noticeShipCode=");
		sb.append(getNoticeShipCode());
		sb.append(", documentName=");
		sb.append(getDocumentName());
		sb.append(", userCreated=");
		sb.append(getUserCreated());
		sb.append(", confirmTime=");
		sb.append(getConfirmTime());
		sb.append(", shipName=");
		sb.append(getShipName());
		sb.append(", shipTypeCode=");
		sb.append(getShipTypeCode());
		sb.append(", stateCode=");
		sb.append(getStateCode());
		sb.append(", shipCaptain=");
		sb.append(getShipCaptain());
		sb.append(", imo=");
		sb.append(getImo());
		sb.append(", grt=");
		sb.append(getGrt());
		sb.append(", dwt=");
		sb.append(getDwt());
		sb.append(", unitGRT=");
		sb.append(getUnitGRT());
		sb.append(", unitDWT=");
		sb.append(getUnitDWT());
		sb.append(", callSign=");
		sb.append(getCallSign());
		sb.append(", arrivalDate=");
		sb.append(getArrivalDate());
		sb.append(", arrivalPortCode=");
		sb.append(getArrivalPortCode());
		sb.append(", portHarbourCode=");
		sb.append(getPortHarbourCode());
		sb.append(", portRegionCode=");
		sb.append(getPortRegionCode());
		sb.append(", portWharfCode=");
		sb.append(getPortWharfCode());
		sb.append(", portGoingToStateName=");
		sb.append(getPortGoingToStateName());
		sb.append(", portGoingToCode=");
		sb.append(getPortGoingToCode());
		sb.append(", nameOfShipOwners=");
		sb.append(getNameOfShipOwners());
		sb.append(", addressOfShipOwners=");
		sb.append(getAddressOfShipOwners());
		sb.append(", shipOwnerstateCode=");
		sb.append(getShipOwnerstateCode());
		sb.append(", shipOwnerPhone=");
		sb.append(getShipOwnerPhone());
		sb.append(", shipOwnerFax=");
		sb.append(getShipOwnerFax());
		sb.append(", shipOwnerEmail=");
		sb.append(getShipOwnerEmail());
		sb.append(", loa=");
		sb.append(getLoa());
		sb.append(", breadth=");
		sb.append(getBreadth());
		sb.append(", clearanceHeight=");
		sb.append(getClearanceHeight());
		sb.append(", shownDraftxF=");
		sb.append(getShownDraftxF());
		sb.append(", shownDraftxA=");
		sb.append(getShownDraftxA());
		sb.append(", unitLOA=");
		sb.append(getUnitLOA());
		sb.append(", unitBreadth=");
		sb.append(getUnitBreadth());
		sb.append(", unitClearanceHeight=");
		sb.append(getUnitClearanceHeight());
		sb.append(", unitShownDraftxF=");
		sb.append(getUnitShownDraftxF());
		sb.append(", unitShownDraftxA=");
		sb.append(getUnitShownDraftxA());
		sb.append(", certificateOfRegistryNumber=");
		sb.append(getCertificateOfRegistryNumber());
		sb.append(", certificateOfRegistryDate=");
		sb.append(getCertificateOfRegistryDate());
		sb.append(", certificateOfRegistryPortName=");
		sb.append(getCertificateOfRegistryPortName());
		sb.append(", shipAgencyCode=");
		sb.append(getShipAgencyCode());
		sb.append(", shipAgencyAddress=");
		sb.append(getShipAgencyAddress());
		sb.append(", shipAgencyPhone=");
		sb.append(getShipAgencyPhone());
		sb.append(", shipAgencyFax=");
		sb.append(getShipAgencyFax());
		sb.append(", shipAgencyEmail=");
		sb.append(getShipAgencyEmail());
		sb.append(", purposeCode=");
		sb.append(getPurposeCode());
		sb.append(", purposeSpecified=");
		sb.append(getPurposeSpecified());
		sb.append(", crewNumber=");
		sb.append(getCrewNumber());
		sb.append(", unitCrew=");
		sb.append(getUnitCrew());
		sb.append(", passengerNumber=");
		sb.append(getPassengerNumber());
		sb.append(", unitPassenger=");
		sb.append(getUnitPassenger());
		sb.append(", quantityAndTypeOfCargo=");
		sb.append(getQuantityAndTypeOfCargo());
		sb.append(", unitQuantityofCargo=");
		sb.append(getUnitQuantityofCargo());
		sb.append(", typeOfCargo=");
		sb.append(getTypeOfCargo());
		sb.append(", otherPersons=");
		sb.append(getOtherPersons());
		sb.append(", remarks=");
		sb.append(getRemarks());
		sb.append(", signPlace=");
		sb.append(getSignPlace());
		sb.append(", signDate=");
		sb.append(getSignDate());
		sb.append(", masterSigned=");
		sb.append(getMasterSigned());
		sb.append(", masterSignedImage=");
		sb.append(getMasterSignedImage());
		sb.append(", documentYear=");
		sb.append(getDocumentYear());
		sb.append(", nameOfShipAgent=");
		sb.append(getNameOfShipAgent());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(202);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.TempNoTiceShipMessage");
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
			"<column><column-name>noticeShipType</column-name><column-value><![CDATA[");
		sb.append(getNoticeShipType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>noticeShipCode</column-name><column-value><![CDATA[");
		sb.append(getNoticeShipCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentName</column-name><column-value><![CDATA[");
		sb.append(getDocumentName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userCreated</column-name><column-value><![CDATA[");
		sb.append(getUserCreated());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>confirmTime</column-name><column-value><![CDATA[");
		sb.append(getConfirmTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipName</column-name><column-value><![CDATA[");
		sb.append(getShipName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipTypeCode</column-name><column-value><![CDATA[");
		sb.append(getShipTypeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stateCode</column-name><column-value><![CDATA[");
		sb.append(getStateCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipCaptain</column-name><column-value><![CDATA[");
		sb.append(getShipCaptain());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>imo</column-name><column-value><![CDATA[");
		sb.append(getImo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>grt</column-name><column-value><![CDATA[");
		sb.append(getGrt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dwt</column-name><column-value><![CDATA[");
		sb.append(getDwt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitGRT</column-name><column-value><![CDATA[");
		sb.append(getUnitGRT());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitDWT</column-name><column-value><![CDATA[");
		sb.append(getUnitDWT());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>callSign</column-name><column-value><![CDATA[");
		sb.append(getCallSign());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>arrivalDate</column-name><column-value><![CDATA[");
		sb.append(getArrivalDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>arrivalPortCode</column-name><column-value><![CDATA[");
		sb.append(getArrivalPortCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portHarbourCode</column-name><column-value><![CDATA[");
		sb.append(getPortHarbourCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portRegionCode</column-name><column-value><![CDATA[");
		sb.append(getPortRegionCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portWharfCode</column-name><column-value><![CDATA[");
		sb.append(getPortWharfCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portGoingToStateName</column-name><column-value><![CDATA[");
		sb.append(getPortGoingToStateName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portGoingToCode</column-name><column-value><![CDATA[");
		sb.append(getPortGoingToCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameOfShipOwners</column-name><column-value><![CDATA[");
		sb.append(getNameOfShipOwners());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>addressOfShipOwners</column-name><column-value><![CDATA[");
		sb.append(getAddressOfShipOwners());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipOwnerstateCode</column-name><column-value><![CDATA[");
		sb.append(getShipOwnerstateCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipOwnerPhone</column-name><column-value><![CDATA[");
		sb.append(getShipOwnerPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipOwnerFax</column-name><column-value><![CDATA[");
		sb.append(getShipOwnerFax());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipOwnerEmail</column-name><column-value><![CDATA[");
		sb.append(getShipOwnerEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loa</column-name><column-value><![CDATA[");
		sb.append(getLoa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>breadth</column-name><column-value><![CDATA[");
		sb.append(getBreadth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>clearanceHeight</column-name><column-value><![CDATA[");
		sb.append(getClearanceHeight());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shownDraftxF</column-name><column-value><![CDATA[");
		sb.append(getShownDraftxF());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shownDraftxA</column-name><column-value><![CDATA[");
		sb.append(getShownDraftxA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitLOA</column-name><column-value><![CDATA[");
		sb.append(getUnitLOA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitBreadth</column-name><column-value><![CDATA[");
		sb.append(getUnitBreadth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitClearanceHeight</column-name><column-value><![CDATA[");
		sb.append(getUnitClearanceHeight());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitShownDraftxF</column-name><column-value><![CDATA[");
		sb.append(getUnitShownDraftxF());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitShownDraftxA</column-name><column-value><![CDATA[");
		sb.append(getUnitShownDraftxA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateOfRegistryNumber</column-name><column-value><![CDATA[");
		sb.append(getCertificateOfRegistryNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateOfRegistryDate</column-name><column-value><![CDATA[");
		sb.append(getCertificateOfRegistryDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>certificateOfRegistryPortName</column-name><column-value><![CDATA[");
		sb.append(getCertificateOfRegistryPortName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipAgencyCode</column-name><column-value><![CDATA[");
		sb.append(getShipAgencyCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipAgencyAddress</column-name><column-value><![CDATA[");
		sb.append(getShipAgencyAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipAgencyPhone</column-name><column-value><![CDATA[");
		sb.append(getShipAgencyPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipAgencyFax</column-name><column-value><![CDATA[");
		sb.append(getShipAgencyFax());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipAgencyEmail</column-name><column-value><![CDATA[");
		sb.append(getShipAgencyEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>purposeCode</column-name><column-value><![CDATA[");
		sb.append(getPurposeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>purposeSpecified</column-name><column-value><![CDATA[");
		sb.append(getPurposeSpecified());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>crewNumber</column-name><column-value><![CDATA[");
		sb.append(getCrewNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitCrew</column-name><column-value><![CDATA[");
		sb.append(getUnitCrew());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>passengerNumber</column-name><column-value><![CDATA[");
		sb.append(getPassengerNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitPassenger</column-name><column-value><![CDATA[");
		sb.append(getUnitPassenger());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>quantityAndTypeOfCargo</column-name><column-value><![CDATA[");
		sb.append(getQuantityAndTypeOfCargo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitQuantityofCargo</column-name><column-value><![CDATA[");
		sb.append(getUnitQuantityofCargo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>typeOfCargo</column-name><column-value><![CDATA[");
		sb.append(getTypeOfCargo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>otherPersons</column-name><column-value><![CDATA[");
		sb.append(getOtherPersons());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remarks</column-name><column-value><![CDATA[");
		sb.append(getRemarks());
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
			"<column><column-name>documentYear</column-name><column-value><![CDATA[");
		sb.append(getDocumentYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameOfShipAgent</column-name><column-value><![CDATA[");
		sb.append(getNameOfShipAgent());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private int _requestState;
	private String _noticeShipType;
	private String _noticeShipCode;
	private long _documentName;
	private String _userCreated;
	private int _confirmTime;
	private String _shipName;
	private String _shipTypeCode;
	private String _stateCode;
	private String _shipCaptain;
	private String _imo;
	private double _grt;
	private double _dwt;
	private String _unitGRT;
	private String _unitDWT;
	private String _callSign;
	private Date _arrivalDate;
	private String _arrivalPortCode;
	private String _portHarbourCode;
	private String _portRegionCode;
	private String _portWharfCode;
	private String _portGoingToStateName;
	private String _portGoingToCode;
	private String _nameOfShipOwners;
	private String _addressOfShipOwners;
	private String _shipOwnerstateCode;
	private String _shipOwnerPhone;
	private String _shipOwnerFax;
	private String _shipOwnerEmail;
	private double _loa;
	private double _breadth;
	private double _clearanceHeight;
	private double _shownDraftxF;
	private double _shownDraftxA;
	private String _unitLOA;
	private String _unitBreadth;
	private String _unitClearanceHeight;
	private String _unitShownDraftxF;
	private String _unitShownDraftxA;
	private String _certificateOfRegistryNumber;
	private Date _certificateOfRegistryDate;
	private String _certificateOfRegistryPortName;
	private String _shipAgencyCode;
	private String _shipAgencyAddress;
	private String _shipAgencyPhone;
	private String _shipAgencyFax;
	private String _shipAgencyEmail;
	private String _purposeCode;
	private String _purposeSpecified;
	private long _crewNumber;
	private String _unitCrew;
	private long _passengerNumber;
	private String _unitPassenger;
	private String _quantityAndTypeOfCargo;
	private String _unitQuantityofCargo;
	private String _typeOfCargo;
	private int _otherPersons;
	private String _remarks;
	private String _signPlace;
	private Date _signDate;
	private int _masterSigned;
	private int _masterSignedImage;
	private int _documentYear;
	private String _nameOfShipAgent;
	private BaseModel<?> _tempNoTiceShipMessageRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.class;
}