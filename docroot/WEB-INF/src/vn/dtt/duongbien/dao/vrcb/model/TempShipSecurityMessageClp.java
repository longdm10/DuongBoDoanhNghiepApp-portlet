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
import vn.dtt.duongbien.dao.vrcb.service.TempShipSecurityMessageLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class TempShipSecurityMessageClp extends BaseModelImpl<TempShipSecurityMessage>
	implements TempShipSecurityMessage {
	public TempShipSecurityMessageClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TempShipSecurityMessage.class;
	}

	@Override
	public String getModelClassName() {
		return TempShipSecurityMessage.class.getName();
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
		attributes.put("documentYear", getDocumentYear());
		attributes.put("shipSecurityCode", getShipSecurityCode());
		attributes.put("documentName", getDocumentName());
		attributes.put("userCreated", getUserCreated());
		attributes.put("shipAgencyCode", getShipAgencyCode());
		attributes.put("nameOfShipAgent", getNameOfShipAgent());
		attributes.put("shipName", getShipName());
		attributes.put("shipTypeCode", getShipTypeCode());
		attributes.put("stateCode", getStateCode());
		attributes.put("shipCaptain", getShipCaptain());
		attributes.put("imo", getImo());
		attributes.put("grt", getGrt());
		attributes.put("unitGRT", getUnitGRT());
		attributes.put("crewNumber", getCrewNumber());
		attributes.put("arrivalDate", getArrivalDate());
		attributes.put("purposeCode", getPurposeCode());
		attributes.put("purposeSpecified", getPurposeSpecified());
		attributes.put("portRegionCode", getPortRegionCode());
		attributes.put("portWharfCode", getPortWharfCode());
		attributes.put("shipAgencyPhone", getShipAgencyPhone());
		attributes.put("shipAgencyFax", getShipAgencyFax());
		attributes.put("isInternationalShipSecurity",
			getIsInternationalShipSecurity());
		attributes.put("nameOfISSC", getNameOfISSC());
		attributes.put("dateOfISSC", getDateOfISSC());
		attributes.put("dateOfExpiryISSC", getDateOfExpiryISSC());
		attributes.put("securityLevelCode", getSecurityLevelCode());
		attributes.put("securityFromDate", getSecurityFromDate());
		attributes.put("isAdditionalSecurityMeasures",
			getIsAdditionalSecurityMeasures());
		attributes.put("additionalSecurityDetail", getAdditionalSecurityDetail());
		attributes.put("isMaintainSecurity", getIsMaintainSecurity());
		attributes.put("maintainSecurityDetail", getMaintainSecurityDetail());
		attributes.put("latitude", getLatitude());
		attributes.put("longitude", getLongitude());
		attributes.put("hasShipSecurityPortItems", getHasShipSecurityPortItems());
		attributes.put("signPlace", getSignPlace());
		attributes.put("signDate", getSignDate());
		attributes.put("masterSigned", getMasterSigned());
		attributes.put("masterSignedImage", getMasterSignedImage());
		attributes.put("callSign", getCallSign());
		attributes.put("arrivalPortCode", getArrivalPortCode());
		attributes.put("portHarbourCode", getPortHarbourCode());

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

		Integer documentYear = (Integer)attributes.get("documentYear");

		if (documentYear != null) {
			setDocumentYear(documentYear);
		}

		String shipSecurityCode = (String)attributes.get("shipSecurityCode");

		if (shipSecurityCode != null) {
			setShipSecurityCode(shipSecurityCode);
		}

		Long documentName = (Long)attributes.get("documentName");

		if (documentName != null) {
			setDocumentName(documentName);
		}

		String userCreated = (String)attributes.get("userCreated");

		if (userCreated != null) {
			setUserCreated(userCreated);
		}

		String shipAgencyCode = (String)attributes.get("shipAgencyCode");

		if (shipAgencyCode != null) {
			setShipAgencyCode(shipAgencyCode);
		}

		String nameOfShipAgent = (String)attributes.get("nameOfShipAgent");

		if (nameOfShipAgent != null) {
			setNameOfShipAgent(nameOfShipAgent);
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

		String unitGRT = (String)attributes.get("unitGRT");

		if (unitGRT != null) {
			setUnitGRT(unitGRT);
		}

		Long crewNumber = (Long)attributes.get("crewNumber");

		if (crewNumber != null) {
			setCrewNumber(crewNumber);
		}

		Date arrivalDate = (Date)attributes.get("arrivalDate");

		if (arrivalDate != null) {
			setArrivalDate(arrivalDate);
		}

		String purposeCode = (String)attributes.get("purposeCode");

		if (purposeCode != null) {
			setPurposeCode(purposeCode);
		}

		String purposeSpecified = (String)attributes.get("purposeSpecified");

		if (purposeSpecified != null) {
			setPurposeSpecified(purposeSpecified);
		}

		String portRegionCode = (String)attributes.get("portRegionCode");

		if (portRegionCode != null) {
			setPortRegionCode(portRegionCode);
		}

		String portWharfCode = (String)attributes.get("portWharfCode");

		if (portWharfCode != null) {
			setPortWharfCode(portWharfCode);
		}

		String shipAgencyPhone = (String)attributes.get("shipAgencyPhone");

		if (shipAgencyPhone != null) {
			setShipAgencyPhone(shipAgencyPhone);
		}

		String shipAgencyFax = (String)attributes.get("shipAgencyFax");

		if (shipAgencyFax != null) {
			setShipAgencyFax(shipAgencyFax);
		}

		Integer isInternationalShipSecurity = (Integer)attributes.get(
				"isInternationalShipSecurity");

		if (isInternationalShipSecurity != null) {
			setIsInternationalShipSecurity(isInternationalShipSecurity);
		}

		String nameOfISSC = (String)attributes.get("nameOfISSC");

		if (nameOfISSC != null) {
			setNameOfISSC(nameOfISSC);
		}

		Date dateOfISSC = (Date)attributes.get("dateOfISSC");

		if (dateOfISSC != null) {
			setDateOfISSC(dateOfISSC);
		}

		Date dateOfExpiryISSC = (Date)attributes.get("dateOfExpiryISSC");

		if (dateOfExpiryISSC != null) {
			setDateOfExpiryISSC(dateOfExpiryISSC);
		}

		String securityLevelCode = (String)attributes.get("securityLevelCode");

		if (securityLevelCode != null) {
			setSecurityLevelCode(securityLevelCode);
		}

		Date securityFromDate = (Date)attributes.get("securityFromDate");

		if (securityFromDate != null) {
			setSecurityFromDate(securityFromDate);
		}

		Integer isAdditionalSecurityMeasures = (Integer)attributes.get(
				"isAdditionalSecurityMeasures");

		if (isAdditionalSecurityMeasures != null) {
			setIsAdditionalSecurityMeasures(isAdditionalSecurityMeasures);
		}

		String additionalSecurityDetail = (String)attributes.get(
				"additionalSecurityDetail");

		if (additionalSecurityDetail != null) {
			setAdditionalSecurityDetail(additionalSecurityDetail);
		}

		Integer isMaintainSecurity = (Integer)attributes.get(
				"isMaintainSecurity");

		if (isMaintainSecurity != null) {
			setIsMaintainSecurity(isMaintainSecurity);
		}

		String maintainSecurityDetail = (String)attributes.get(
				"maintainSecurityDetail");

		if (maintainSecurityDetail != null) {
			setMaintainSecurityDetail(maintainSecurityDetail);
		}

		String latitude = (String)attributes.get("latitude");

		if (latitude != null) {
			setLatitude(latitude);
		}

		String longitude = (String)attributes.get("longitude");

		if (longitude != null) {
			setLongitude(longitude);
		}

		Integer hasShipSecurityPortItems = (Integer)attributes.get(
				"hasShipSecurityPortItems");

		if (hasShipSecurityPortItems != null) {
			setHasShipSecurityPortItems(hasShipSecurityPortItems);
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

		String callSign = (String)attributes.get("callSign");

		if (callSign != null) {
			setCallSign(callSign);
		}

		String arrivalPortCode = (String)attributes.get("arrivalPortCode");

		if (arrivalPortCode != null) {
			setArrivalPortCode(arrivalPortCode);
		}

		String portHarbourCode = (String)attributes.get("portHarbourCode");

		if (portHarbourCode != null) {
			setPortHarbourCode(portHarbourCode);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tempShipSecurityMessageRemoteModel, id);
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

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestCode", String.class);

				method.invoke(_tempShipSecurityMessageRemoteModel, requestCode);
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

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestState", int.class);

				method.invoke(_tempShipSecurityMessageRemoteModel, requestState);
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

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentYear", int.class);

				method.invoke(_tempShipSecurityMessageRemoteModel, documentYear);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getShipSecurityCode() {
		return _shipSecurityCode;
	}

	@Override
	public void setShipSecurityCode(String shipSecurityCode) {
		_shipSecurityCode = shipSecurityCode;

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setShipSecurityCode",
						String.class);

				method.invoke(_tempShipSecurityMessageRemoteModel,
					shipSecurityCode);
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

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentName", long.class);

				method.invoke(_tempShipSecurityMessageRemoteModel, documentName);
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

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setUserCreated", String.class);

				method.invoke(_tempShipSecurityMessageRemoteModel, userCreated);
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

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setShipAgencyCode",
						String.class);

				method.invoke(_tempShipSecurityMessageRemoteModel,
					shipAgencyCode);
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

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setNameOfShipAgent",
						String.class);

				method.invoke(_tempShipSecurityMessageRemoteModel,
					nameOfShipAgent);
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

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setShipName", String.class);

				method.invoke(_tempShipSecurityMessageRemoteModel, shipName);
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

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setShipTypeCode", String.class);

				method.invoke(_tempShipSecurityMessageRemoteModel, shipTypeCode);
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

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setStateCode", String.class);

				method.invoke(_tempShipSecurityMessageRemoteModel, stateCode);
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

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setShipCaptain", String.class);

				method.invoke(_tempShipSecurityMessageRemoteModel, shipCaptain);
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

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setImo", String.class);

				method.invoke(_tempShipSecurityMessageRemoteModel, imo);
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

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setGrt", double.class);

				method.invoke(_tempShipSecurityMessageRemoteModel, grt);
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

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitGRT", String.class);

				method.invoke(_tempShipSecurityMessageRemoteModel, unitGRT);
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

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setCrewNumber", long.class);

				method.invoke(_tempShipSecurityMessageRemoteModel, crewNumber);
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

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setArrivalDate", Date.class);

				method.invoke(_tempShipSecurityMessageRemoteModel, arrivalDate);
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

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setPurposeCode", String.class);

				method.invoke(_tempShipSecurityMessageRemoteModel, purposeCode);
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

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setPurposeSpecified",
						String.class);

				method.invoke(_tempShipSecurityMessageRemoteModel,
					purposeSpecified);
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

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setPortRegionCode",
						String.class);

				method.invoke(_tempShipSecurityMessageRemoteModel,
					portRegionCode);
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

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setPortWharfCode", String.class);

				method.invoke(_tempShipSecurityMessageRemoteModel, portWharfCode);
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

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setShipAgencyPhone",
						String.class);

				method.invoke(_tempShipSecurityMessageRemoteModel,
					shipAgencyPhone);
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

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setShipAgencyFax", String.class);

				method.invoke(_tempShipSecurityMessageRemoteModel, shipAgencyFax);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIsInternationalShipSecurity() {
		return _isInternationalShipSecurity;
	}

	@Override
	public void setIsInternationalShipSecurity(int isInternationalShipSecurity) {
		_isInternationalShipSecurity = isInternationalShipSecurity;

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setIsInternationalShipSecurity",
						int.class);

				method.invoke(_tempShipSecurityMessageRemoteModel,
					isInternationalShipSecurity);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNameOfISSC() {
		return _nameOfISSC;
	}

	@Override
	public void setNameOfISSC(String nameOfISSC) {
		_nameOfISSC = nameOfISSC;

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setNameOfISSC", String.class);

				method.invoke(_tempShipSecurityMessageRemoteModel, nameOfISSC);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDateOfISSC() {
		return _dateOfISSC;
	}

	@Override
	public void setDateOfISSC(Date dateOfISSC) {
		_dateOfISSC = dateOfISSC;

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setDateOfISSC", Date.class);

				method.invoke(_tempShipSecurityMessageRemoteModel, dateOfISSC);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDateOfExpiryISSC() {
		return _dateOfExpiryISSC;
	}

	@Override
	public void setDateOfExpiryISSC(Date dateOfExpiryISSC) {
		_dateOfExpiryISSC = dateOfExpiryISSC;

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setDateOfExpiryISSC",
						Date.class);

				method.invoke(_tempShipSecurityMessageRemoteModel,
					dateOfExpiryISSC);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSecurityLevelCode() {
		return _securityLevelCode;
	}

	@Override
	public void setSecurityLevelCode(String securityLevelCode) {
		_securityLevelCode = securityLevelCode;

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setSecurityLevelCode",
						String.class);

				method.invoke(_tempShipSecurityMessageRemoteModel,
					securityLevelCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getSecurityFromDate() {
		return _securityFromDate;
	}

	@Override
	public void setSecurityFromDate(Date securityFromDate) {
		_securityFromDate = securityFromDate;

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setSecurityFromDate",
						Date.class);

				method.invoke(_tempShipSecurityMessageRemoteModel,
					securityFromDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIsAdditionalSecurityMeasures() {
		return _isAdditionalSecurityMeasures;
	}

	@Override
	public void setIsAdditionalSecurityMeasures(
		int isAdditionalSecurityMeasures) {
		_isAdditionalSecurityMeasures = isAdditionalSecurityMeasures;

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setIsAdditionalSecurityMeasures",
						int.class);

				method.invoke(_tempShipSecurityMessageRemoteModel,
					isAdditionalSecurityMeasures);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAdditionalSecurityDetail() {
		return _additionalSecurityDetail;
	}

	@Override
	public void setAdditionalSecurityDetail(String additionalSecurityDetail) {
		_additionalSecurityDetail = additionalSecurityDetail;

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setAdditionalSecurityDetail",
						String.class);

				method.invoke(_tempShipSecurityMessageRemoteModel,
					additionalSecurityDetail);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIsMaintainSecurity() {
		return _isMaintainSecurity;
	}

	@Override
	public void setIsMaintainSecurity(int isMaintainSecurity) {
		_isMaintainSecurity = isMaintainSecurity;

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setIsMaintainSecurity",
						int.class);

				method.invoke(_tempShipSecurityMessageRemoteModel,
					isMaintainSecurity);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaintainSecurityDetail() {
		return _maintainSecurityDetail;
	}

	@Override
	public void setMaintainSecurityDetail(String maintainSecurityDetail) {
		_maintainSecurityDetail = maintainSecurityDetail;

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setMaintainSecurityDetail",
						String.class);

				method.invoke(_tempShipSecurityMessageRemoteModel,
					maintainSecurityDetail);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLatitude() {
		return _latitude;
	}

	@Override
	public void setLatitude(String latitude) {
		_latitude = latitude;

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setLatitude", String.class);

				method.invoke(_tempShipSecurityMessageRemoteModel, latitude);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLongitude() {
		return _longitude;
	}

	@Override
	public void setLongitude(String longitude) {
		_longitude = longitude;

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setLongitude", String.class);

				method.invoke(_tempShipSecurityMessageRemoteModel, longitude);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getHasShipSecurityPortItems() {
		return _hasShipSecurityPortItems;
	}

	@Override
	public void setHasShipSecurityPortItems(int hasShipSecurityPortItems) {
		_hasShipSecurityPortItems = hasShipSecurityPortItems;

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setHasShipSecurityPortItems",
						int.class);

				method.invoke(_tempShipSecurityMessageRemoteModel,
					hasShipSecurityPortItems);
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

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setSignPlace", String.class);

				method.invoke(_tempShipSecurityMessageRemoteModel, signPlace);
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

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setSignDate", Date.class);

				method.invoke(_tempShipSecurityMessageRemoteModel, signDate);
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

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setMasterSigned", int.class);

				method.invoke(_tempShipSecurityMessageRemoteModel, masterSigned);
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

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setMasterSignedImage",
						int.class);

				method.invoke(_tempShipSecurityMessageRemoteModel,
					masterSignedImage);
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

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setCallSign", String.class);

				method.invoke(_tempShipSecurityMessageRemoteModel, callSign);
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

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setArrivalPortCode",
						String.class);

				method.invoke(_tempShipSecurityMessageRemoteModel,
					arrivalPortCode);
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

		if (_tempShipSecurityMessageRemoteModel != null) {
			try {
				Class<?> clazz = _tempShipSecurityMessageRemoteModel.getClass();

				Method method = clazz.getMethod("setPortHarbourCode",
						String.class);

				method.invoke(_tempShipSecurityMessageRemoteModel,
					portHarbourCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTempShipSecurityMessageRemoteModel() {
		return _tempShipSecurityMessageRemoteModel;
	}

	public void setTempShipSecurityMessageRemoteModel(
		BaseModel<?> tempShipSecurityMessageRemoteModel) {
		_tempShipSecurityMessageRemoteModel = tempShipSecurityMessageRemoteModel;
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

		Class<?> remoteModelClass = _tempShipSecurityMessageRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tempShipSecurityMessageRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TempShipSecurityMessageLocalServiceUtil.addTempShipSecurityMessage(this);
		}
		else {
			TempShipSecurityMessageLocalServiceUtil.updateTempShipSecurityMessage(this);
		}
	}

	@Override
	public TempShipSecurityMessage toEscapedModel() {
		return (TempShipSecurityMessage)ProxyUtil.newProxyInstance(TempShipSecurityMessage.class.getClassLoader(),
			new Class[] { TempShipSecurityMessage.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempShipSecurityMessageClp clone = new TempShipSecurityMessageClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setRequestState(getRequestState());
		clone.setDocumentYear(getDocumentYear());
		clone.setShipSecurityCode(getShipSecurityCode());
		clone.setDocumentName(getDocumentName());
		clone.setUserCreated(getUserCreated());
		clone.setShipAgencyCode(getShipAgencyCode());
		clone.setNameOfShipAgent(getNameOfShipAgent());
		clone.setShipName(getShipName());
		clone.setShipTypeCode(getShipTypeCode());
		clone.setStateCode(getStateCode());
		clone.setShipCaptain(getShipCaptain());
		clone.setImo(getImo());
		clone.setGrt(getGrt());
		clone.setUnitGRT(getUnitGRT());
		clone.setCrewNumber(getCrewNumber());
		clone.setArrivalDate(getArrivalDate());
		clone.setPurposeCode(getPurposeCode());
		clone.setPurposeSpecified(getPurposeSpecified());
		clone.setPortRegionCode(getPortRegionCode());
		clone.setPortWharfCode(getPortWharfCode());
		clone.setShipAgencyPhone(getShipAgencyPhone());
		clone.setShipAgencyFax(getShipAgencyFax());
		clone.setIsInternationalShipSecurity(getIsInternationalShipSecurity());
		clone.setNameOfISSC(getNameOfISSC());
		clone.setDateOfISSC(getDateOfISSC());
		clone.setDateOfExpiryISSC(getDateOfExpiryISSC());
		clone.setSecurityLevelCode(getSecurityLevelCode());
		clone.setSecurityFromDate(getSecurityFromDate());
		clone.setIsAdditionalSecurityMeasures(getIsAdditionalSecurityMeasures());
		clone.setAdditionalSecurityDetail(getAdditionalSecurityDetail());
		clone.setIsMaintainSecurity(getIsMaintainSecurity());
		clone.setMaintainSecurityDetail(getMaintainSecurityDetail());
		clone.setLatitude(getLatitude());
		clone.setLongitude(getLongitude());
		clone.setHasShipSecurityPortItems(getHasShipSecurityPortItems());
		clone.setSignPlace(getSignPlace());
		clone.setSignDate(getSignDate());
		clone.setMasterSigned(getMasterSigned());
		clone.setMasterSignedImage(getMasterSignedImage());
		clone.setCallSign(getCallSign());
		clone.setArrivalPortCode(getArrivalPortCode());
		clone.setPortHarbourCode(getPortHarbourCode());

		return clone;
	}

	@Override
	public int compareTo(TempShipSecurityMessage tempShipSecurityMessage) {
		int value = 0;

		if (getId() < tempShipSecurityMessage.getId()) {
			value = -1;
		}
		else if (getId() > tempShipSecurityMessage.getId()) {
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

		if (!(obj instanceof TempShipSecurityMessageClp)) {
			return false;
		}

		TempShipSecurityMessageClp tempShipSecurityMessage = (TempShipSecurityMessageClp)obj;

		long primaryKey = tempShipSecurityMessage.getPrimaryKey();

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
		StringBundler sb = new StringBundler(89);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", requestState=");
		sb.append(getRequestState());
		sb.append(", documentYear=");
		sb.append(getDocumentYear());
		sb.append(", shipSecurityCode=");
		sb.append(getShipSecurityCode());
		sb.append(", documentName=");
		sb.append(getDocumentName());
		sb.append(", userCreated=");
		sb.append(getUserCreated());
		sb.append(", shipAgencyCode=");
		sb.append(getShipAgencyCode());
		sb.append(", nameOfShipAgent=");
		sb.append(getNameOfShipAgent());
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
		sb.append(", unitGRT=");
		sb.append(getUnitGRT());
		sb.append(", crewNumber=");
		sb.append(getCrewNumber());
		sb.append(", arrivalDate=");
		sb.append(getArrivalDate());
		sb.append(", purposeCode=");
		sb.append(getPurposeCode());
		sb.append(", purposeSpecified=");
		sb.append(getPurposeSpecified());
		sb.append(", portRegionCode=");
		sb.append(getPortRegionCode());
		sb.append(", portWharfCode=");
		sb.append(getPortWharfCode());
		sb.append(", shipAgencyPhone=");
		sb.append(getShipAgencyPhone());
		sb.append(", shipAgencyFax=");
		sb.append(getShipAgencyFax());
		sb.append(", isInternationalShipSecurity=");
		sb.append(getIsInternationalShipSecurity());
		sb.append(", nameOfISSC=");
		sb.append(getNameOfISSC());
		sb.append(", dateOfISSC=");
		sb.append(getDateOfISSC());
		sb.append(", dateOfExpiryISSC=");
		sb.append(getDateOfExpiryISSC());
		sb.append(", securityLevelCode=");
		sb.append(getSecurityLevelCode());
		sb.append(", securityFromDate=");
		sb.append(getSecurityFromDate());
		sb.append(", isAdditionalSecurityMeasures=");
		sb.append(getIsAdditionalSecurityMeasures());
		sb.append(", additionalSecurityDetail=");
		sb.append(getAdditionalSecurityDetail());
		sb.append(", isMaintainSecurity=");
		sb.append(getIsMaintainSecurity());
		sb.append(", maintainSecurityDetail=");
		sb.append(getMaintainSecurityDetail());
		sb.append(", latitude=");
		sb.append(getLatitude());
		sb.append(", longitude=");
		sb.append(getLongitude());
		sb.append(", hasShipSecurityPortItems=");
		sb.append(getHasShipSecurityPortItems());
		sb.append(", signPlace=");
		sb.append(getSignPlace());
		sb.append(", signDate=");
		sb.append(getSignDate());
		sb.append(", masterSigned=");
		sb.append(getMasterSigned());
		sb.append(", masterSignedImage=");
		sb.append(getMasterSignedImage());
		sb.append(", callSign=");
		sb.append(getCallSign());
		sb.append(", arrivalPortCode=");
		sb.append(getArrivalPortCode());
		sb.append(", portHarbourCode=");
		sb.append(getPortHarbourCode());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(136);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityMessage");
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
			"<column><column-name>documentYear</column-name><column-value><![CDATA[");
		sb.append(getDocumentYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipSecurityCode</column-name><column-value><![CDATA[");
		sb.append(getShipSecurityCode());
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
			"<column><column-name>shipAgencyCode</column-name><column-value><![CDATA[");
		sb.append(getShipAgencyCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameOfShipAgent</column-name><column-value><![CDATA[");
		sb.append(getNameOfShipAgent());
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
			"<column><column-name>unitGRT</column-name><column-value><![CDATA[");
		sb.append(getUnitGRT());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>crewNumber</column-name><column-value><![CDATA[");
		sb.append(getCrewNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>arrivalDate</column-name><column-value><![CDATA[");
		sb.append(getArrivalDate());
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
			"<column><column-name>portRegionCode</column-name><column-value><![CDATA[");
		sb.append(getPortRegionCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portWharfCode</column-name><column-value><![CDATA[");
		sb.append(getPortWharfCode());
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
			"<column><column-name>isInternationalShipSecurity</column-name><column-value><![CDATA[");
		sb.append(getIsInternationalShipSecurity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameOfISSC</column-name><column-value><![CDATA[");
		sb.append(getNameOfISSC());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateOfISSC</column-name><column-value><![CDATA[");
		sb.append(getDateOfISSC());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateOfExpiryISSC</column-name><column-value><![CDATA[");
		sb.append(getDateOfExpiryISSC());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>securityLevelCode</column-name><column-value><![CDATA[");
		sb.append(getSecurityLevelCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>securityFromDate</column-name><column-value><![CDATA[");
		sb.append(getSecurityFromDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isAdditionalSecurityMeasures</column-name><column-value><![CDATA[");
		sb.append(getIsAdditionalSecurityMeasures());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>additionalSecurityDetail</column-name><column-value><![CDATA[");
		sb.append(getAdditionalSecurityDetail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isMaintainSecurity</column-name><column-value><![CDATA[");
		sb.append(getIsMaintainSecurity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maintainSecurityDetail</column-name><column-value><![CDATA[");
		sb.append(getMaintainSecurityDetail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>latitude</column-name><column-value><![CDATA[");
		sb.append(getLatitude());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>longitude</column-name><column-value><![CDATA[");
		sb.append(getLongitude());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hasShipSecurityPortItems</column-name><column-value><![CDATA[");
		sb.append(getHasShipSecurityPortItems());
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
			"<column><column-name>callSign</column-name><column-value><![CDATA[");
		sb.append(getCallSign());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>arrivalPortCode</column-name><column-value><![CDATA[");
		sb.append(getArrivalPortCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portHarbourCode</column-name><column-value><![CDATA[");
		sb.append(getPortHarbourCode());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private int _requestState;
	private int _documentYear;
	private String _shipSecurityCode;
	private long _documentName;
	private String _userCreated;
	private String _shipAgencyCode;
	private String _nameOfShipAgent;
	private String _shipName;
	private String _shipTypeCode;
	private String _stateCode;
	private String _shipCaptain;
	private String _imo;
	private double _grt;
	private String _unitGRT;
	private long _crewNumber;
	private Date _arrivalDate;
	private String _purposeCode;
	private String _purposeSpecified;
	private String _portRegionCode;
	private String _portWharfCode;
	private String _shipAgencyPhone;
	private String _shipAgencyFax;
	private int _isInternationalShipSecurity;
	private String _nameOfISSC;
	private Date _dateOfISSC;
	private Date _dateOfExpiryISSC;
	private String _securityLevelCode;
	private Date _securityFromDate;
	private int _isAdditionalSecurityMeasures;
	private String _additionalSecurityDetail;
	private int _isMaintainSecurity;
	private String _maintainSecurityDetail;
	private String _latitude;
	private String _longitude;
	private int _hasShipSecurityPortItems;
	private String _signPlace;
	private Date _signDate;
	private int _masterSigned;
	private int _masterSignedImage;
	private String _callSign;
	private String _arrivalPortCode;
	private String _portHarbourCode;
	private BaseModel<?> _tempShipSecurityMessageRemoteModel;
}