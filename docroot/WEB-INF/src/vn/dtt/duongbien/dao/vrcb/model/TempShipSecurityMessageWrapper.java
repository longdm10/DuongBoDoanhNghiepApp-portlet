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
 * This class is a wrapper for {@link TempShipSecurityMessage}.
 * </p>
 *
 * @author longdm
 * @see TempShipSecurityMessage
 * @generated
 */
public class TempShipSecurityMessageWrapper implements TempShipSecurityMessage,
	ModelWrapper<TempShipSecurityMessage> {
	public TempShipSecurityMessageWrapper(
		TempShipSecurityMessage tempShipSecurityMessage) {
		_tempShipSecurityMessage = tempShipSecurityMessage;
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

	/**
	* Returns the primary key of this temp ship security message.
	*
	* @return the primary key of this temp ship security message
	*/
	@Override
	public long getPrimaryKey() {
		return _tempShipSecurityMessage.getPrimaryKey();
	}

	/**
	* Sets the primary key of this temp ship security message.
	*
	* @param primaryKey the primary key of this temp ship security message
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tempShipSecurityMessage.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this temp ship security message.
	*
	* @return the ID of this temp ship security message
	*/
	@Override
	public long getId() {
		return _tempShipSecurityMessage.getId();
	}

	/**
	* Sets the ID of this temp ship security message.
	*
	* @param id the ID of this temp ship security message
	*/
	@Override
	public void setId(long id) {
		_tempShipSecurityMessage.setId(id);
	}

	/**
	* Returns the request code of this temp ship security message.
	*
	* @return the request code of this temp ship security message
	*/
	@Override
	public java.lang.String getRequestCode() {
		return _tempShipSecurityMessage.getRequestCode();
	}

	/**
	* Sets the request code of this temp ship security message.
	*
	* @param requestCode the request code of this temp ship security message
	*/
	@Override
	public void setRequestCode(java.lang.String requestCode) {
		_tempShipSecurityMessage.setRequestCode(requestCode);
	}

	/**
	* Returns the request state of this temp ship security message.
	*
	* @return the request state of this temp ship security message
	*/
	@Override
	public int getRequestState() {
		return _tempShipSecurityMessage.getRequestState();
	}

	/**
	* Sets the request state of this temp ship security message.
	*
	* @param requestState the request state of this temp ship security message
	*/
	@Override
	public void setRequestState(int requestState) {
		_tempShipSecurityMessage.setRequestState(requestState);
	}

	/**
	* Returns the document year of this temp ship security message.
	*
	* @return the document year of this temp ship security message
	*/
	@Override
	public int getDocumentYear() {
		return _tempShipSecurityMessage.getDocumentYear();
	}

	/**
	* Sets the document year of this temp ship security message.
	*
	* @param documentYear the document year of this temp ship security message
	*/
	@Override
	public void setDocumentYear(int documentYear) {
		_tempShipSecurityMessage.setDocumentYear(documentYear);
	}

	/**
	* Returns the ship security code of this temp ship security message.
	*
	* @return the ship security code of this temp ship security message
	*/
	@Override
	public java.lang.String getShipSecurityCode() {
		return _tempShipSecurityMessage.getShipSecurityCode();
	}

	/**
	* Sets the ship security code of this temp ship security message.
	*
	* @param shipSecurityCode the ship security code of this temp ship security message
	*/
	@Override
	public void setShipSecurityCode(java.lang.String shipSecurityCode) {
		_tempShipSecurityMessage.setShipSecurityCode(shipSecurityCode);
	}

	/**
	* Returns the document name of this temp ship security message.
	*
	* @return the document name of this temp ship security message
	*/
	@Override
	public long getDocumentName() {
		return _tempShipSecurityMessage.getDocumentName();
	}

	/**
	* Sets the document name of this temp ship security message.
	*
	* @param documentName the document name of this temp ship security message
	*/
	@Override
	public void setDocumentName(long documentName) {
		_tempShipSecurityMessage.setDocumentName(documentName);
	}

	/**
	* Returns the user created of this temp ship security message.
	*
	* @return the user created of this temp ship security message
	*/
	@Override
	public java.lang.String getUserCreated() {
		return _tempShipSecurityMessage.getUserCreated();
	}

	/**
	* Sets the user created of this temp ship security message.
	*
	* @param userCreated the user created of this temp ship security message
	*/
	@Override
	public void setUserCreated(java.lang.String userCreated) {
		_tempShipSecurityMessage.setUserCreated(userCreated);
	}

	/**
	* Returns the ship agency code of this temp ship security message.
	*
	* @return the ship agency code of this temp ship security message
	*/
	@Override
	public java.lang.String getShipAgencyCode() {
		return _tempShipSecurityMessage.getShipAgencyCode();
	}

	/**
	* Sets the ship agency code of this temp ship security message.
	*
	* @param shipAgencyCode the ship agency code of this temp ship security message
	*/
	@Override
	public void setShipAgencyCode(java.lang.String shipAgencyCode) {
		_tempShipSecurityMessage.setShipAgencyCode(shipAgencyCode);
	}

	/**
	* Returns the name of ship agent of this temp ship security message.
	*
	* @return the name of ship agent of this temp ship security message
	*/
	@Override
	public java.lang.String getNameOfShipAgent() {
		return _tempShipSecurityMessage.getNameOfShipAgent();
	}

	/**
	* Sets the name of ship agent of this temp ship security message.
	*
	* @param nameOfShipAgent the name of ship agent of this temp ship security message
	*/
	@Override
	public void setNameOfShipAgent(java.lang.String nameOfShipAgent) {
		_tempShipSecurityMessage.setNameOfShipAgent(nameOfShipAgent);
	}

	/**
	* Returns the ship name of this temp ship security message.
	*
	* @return the ship name of this temp ship security message
	*/
	@Override
	public java.lang.String getShipName() {
		return _tempShipSecurityMessage.getShipName();
	}

	/**
	* Sets the ship name of this temp ship security message.
	*
	* @param shipName the ship name of this temp ship security message
	*/
	@Override
	public void setShipName(java.lang.String shipName) {
		_tempShipSecurityMessage.setShipName(shipName);
	}

	/**
	* Returns the ship type code of this temp ship security message.
	*
	* @return the ship type code of this temp ship security message
	*/
	@Override
	public java.lang.String getShipTypeCode() {
		return _tempShipSecurityMessage.getShipTypeCode();
	}

	/**
	* Sets the ship type code of this temp ship security message.
	*
	* @param shipTypeCode the ship type code of this temp ship security message
	*/
	@Override
	public void setShipTypeCode(java.lang.String shipTypeCode) {
		_tempShipSecurityMessage.setShipTypeCode(shipTypeCode);
	}

	/**
	* Returns the state code of this temp ship security message.
	*
	* @return the state code of this temp ship security message
	*/
	@Override
	public java.lang.String getStateCode() {
		return _tempShipSecurityMessage.getStateCode();
	}

	/**
	* Sets the state code of this temp ship security message.
	*
	* @param stateCode the state code of this temp ship security message
	*/
	@Override
	public void setStateCode(java.lang.String stateCode) {
		_tempShipSecurityMessage.setStateCode(stateCode);
	}

	/**
	* Returns the ship captain of this temp ship security message.
	*
	* @return the ship captain of this temp ship security message
	*/
	@Override
	public java.lang.String getShipCaptain() {
		return _tempShipSecurityMessage.getShipCaptain();
	}

	/**
	* Sets the ship captain of this temp ship security message.
	*
	* @param shipCaptain the ship captain of this temp ship security message
	*/
	@Override
	public void setShipCaptain(java.lang.String shipCaptain) {
		_tempShipSecurityMessage.setShipCaptain(shipCaptain);
	}

	/**
	* Returns the imo of this temp ship security message.
	*
	* @return the imo of this temp ship security message
	*/
	@Override
	public java.lang.String getImo() {
		return _tempShipSecurityMessage.getImo();
	}

	/**
	* Sets the imo of this temp ship security message.
	*
	* @param imo the imo of this temp ship security message
	*/
	@Override
	public void setImo(java.lang.String imo) {
		_tempShipSecurityMessage.setImo(imo);
	}

	/**
	* Returns the grt of this temp ship security message.
	*
	* @return the grt of this temp ship security message
	*/
	@Override
	public double getGrt() {
		return _tempShipSecurityMessage.getGrt();
	}

	/**
	* Sets the grt of this temp ship security message.
	*
	* @param grt the grt of this temp ship security message
	*/
	@Override
	public void setGrt(double grt) {
		_tempShipSecurityMessage.setGrt(grt);
	}

	/**
	* Returns the unit g r t of this temp ship security message.
	*
	* @return the unit g r t of this temp ship security message
	*/
	@Override
	public java.lang.String getUnitGRT() {
		return _tempShipSecurityMessage.getUnitGRT();
	}

	/**
	* Sets the unit g r t of this temp ship security message.
	*
	* @param unitGRT the unit g r t of this temp ship security message
	*/
	@Override
	public void setUnitGRT(java.lang.String unitGRT) {
		_tempShipSecurityMessage.setUnitGRT(unitGRT);
	}

	/**
	* Returns the crew number of this temp ship security message.
	*
	* @return the crew number of this temp ship security message
	*/
	@Override
	public long getCrewNumber() {
		return _tempShipSecurityMessage.getCrewNumber();
	}

	/**
	* Sets the crew number of this temp ship security message.
	*
	* @param crewNumber the crew number of this temp ship security message
	*/
	@Override
	public void setCrewNumber(long crewNumber) {
		_tempShipSecurityMessage.setCrewNumber(crewNumber);
	}

	/**
	* Returns the arrival date of this temp ship security message.
	*
	* @return the arrival date of this temp ship security message
	*/
	@Override
	public java.util.Date getArrivalDate() {
		return _tempShipSecurityMessage.getArrivalDate();
	}

	/**
	* Sets the arrival date of this temp ship security message.
	*
	* @param arrivalDate the arrival date of this temp ship security message
	*/
	@Override
	public void setArrivalDate(java.util.Date arrivalDate) {
		_tempShipSecurityMessage.setArrivalDate(arrivalDate);
	}

	/**
	* Returns the purpose code of this temp ship security message.
	*
	* @return the purpose code of this temp ship security message
	*/
	@Override
	public java.lang.String getPurposeCode() {
		return _tempShipSecurityMessage.getPurposeCode();
	}

	/**
	* Sets the purpose code of this temp ship security message.
	*
	* @param purposeCode the purpose code of this temp ship security message
	*/
	@Override
	public void setPurposeCode(java.lang.String purposeCode) {
		_tempShipSecurityMessage.setPurposeCode(purposeCode);
	}

	/**
	* Returns the purpose specified of this temp ship security message.
	*
	* @return the purpose specified of this temp ship security message
	*/
	@Override
	public java.lang.String getPurposeSpecified() {
		return _tempShipSecurityMessage.getPurposeSpecified();
	}

	/**
	* Sets the purpose specified of this temp ship security message.
	*
	* @param purposeSpecified the purpose specified of this temp ship security message
	*/
	@Override
	public void setPurposeSpecified(java.lang.String purposeSpecified) {
		_tempShipSecurityMessage.setPurposeSpecified(purposeSpecified);
	}

	/**
	* Returns the port region code of this temp ship security message.
	*
	* @return the port region code of this temp ship security message
	*/
	@Override
	public java.lang.String getPortRegionCode() {
		return _tempShipSecurityMessage.getPortRegionCode();
	}

	/**
	* Sets the port region code of this temp ship security message.
	*
	* @param portRegionCode the port region code of this temp ship security message
	*/
	@Override
	public void setPortRegionCode(java.lang.String portRegionCode) {
		_tempShipSecurityMessage.setPortRegionCode(portRegionCode);
	}

	/**
	* Returns the port wharf code of this temp ship security message.
	*
	* @return the port wharf code of this temp ship security message
	*/
	@Override
	public java.lang.String getPortWharfCode() {
		return _tempShipSecurityMessage.getPortWharfCode();
	}

	/**
	* Sets the port wharf code of this temp ship security message.
	*
	* @param portWharfCode the port wharf code of this temp ship security message
	*/
	@Override
	public void setPortWharfCode(java.lang.String portWharfCode) {
		_tempShipSecurityMessage.setPortWharfCode(portWharfCode);
	}

	/**
	* Returns the ship agency phone of this temp ship security message.
	*
	* @return the ship agency phone of this temp ship security message
	*/
	@Override
	public java.lang.String getShipAgencyPhone() {
		return _tempShipSecurityMessage.getShipAgencyPhone();
	}

	/**
	* Sets the ship agency phone of this temp ship security message.
	*
	* @param shipAgencyPhone the ship agency phone of this temp ship security message
	*/
	@Override
	public void setShipAgencyPhone(java.lang.String shipAgencyPhone) {
		_tempShipSecurityMessage.setShipAgencyPhone(shipAgencyPhone);
	}

	/**
	* Returns the ship agency fax of this temp ship security message.
	*
	* @return the ship agency fax of this temp ship security message
	*/
	@Override
	public java.lang.String getShipAgencyFax() {
		return _tempShipSecurityMessage.getShipAgencyFax();
	}

	/**
	* Sets the ship agency fax of this temp ship security message.
	*
	* @param shipAgencyFax the ship agency fax of this temp ship security message
	*/
	@Override
	public void setShipAgencyFax(java.lang.String shipAgencyFax) {
		_tempShipSecurityMessage.setShipAgencyFax(shipAgencyFax);
	}

	/**
	* Returns the is international ship security of this temp ship security message.
	*
	* @return the is international ship security of this temp ship security message
	*/
	@Override
	public int getIsInternationalShipSecurity() {
		return _tempShipSecurityMessage.getIsInternationalShipSecurity();
	}

	/**
	* Sets the is international ship security of this temp ship security message.
	*
	* @param isInternationalShipSecurity the is international ship security of this temp ship security message
	*/
	@Override
	public void setIsInternationalShipSecurity(int isInternationalShipSecurity) {
		_tempShipSecurityMessage.setIsInternationalShipSecurity(isInternationalShipSecurity);
	}

	/**
	* Returns the name of i s s c of this temp ship security message.
	*
	* @return the name of i s s c of this temp ship security message
	*/
	@Override
	public java.lang.String getNameOfISSC() {
		return _tempShipSecurityMessage.getNameOfISSC();
	}

	/**
	* Sets the name of i s s c of this temp ship security message.
	*
	* @param nameOfISSC the name of i s s c of this temp ship security message
	*/
	@Override
	public void setNameOfISSC(java.lang.String nameOfISSC) {
		_tempShipSecurityMessage.setNameOfISSC(nameOfISSC);
	}

	/**
	* Returns the date of i s s c of this temp ship security message.
	*
	* @return the date of i s s c of this temp ship security message
	*/
	@Override
	public java.util.Date getDateOfISSC() {
		return _tempShipSecurityMessage.getDateOfISSC();
	}

	/**
	* Sets the date of i s s c of this temp ship security message.
	*
	* @param dateOfISSC the date of i s s c of this temp ship security message
	*/
	@Override
	public void setDateOfISSC(java.util.Date dateOfISSC) {
		_tempShipSecurityMessage.setDateOfISSC(dateOfISSC);
	}

	/**
	* Returns the date of expiry i s s c of this temp ship security message.
	*
	* @return the date of expiry i s s c of this temp ship security message
	*/
	@Override
	public java.util.Date getDateOfExpiryISSC() {
		return _tempShipSecurityMessage.getDateOfExpiryISSC();
	}

	/**
	* Sets the date of expiry i s s c of this temp ship security message.
	*
	* @param dateOfExpiryISSC the date of expiry i s s c of this temp ship security message
	*/
	@Override
	public void setDateOfExpiryISSC(java.util.Date dateOfExpiryISSC) {
		_tempShipSecurityMessage.setDateOfExpiryISSC(dateOfExpiryISSC);
	}

	/**
	* Returns the security level code of this temp ship security message.
	*
	* @return the security level code of this temp ship security message
	*/
	@Override
	public java.lang.String getSecurityLevelCode() {
		return _tempShipSecurityMessage.getSecurityLevelCode();
	}

	/**
	* Sets the security level code of this temp ship security message.
	*
	* @param securityLevelCode the security level code of this temp ship security message
	*/
	@Override
	public void setSecurityLevelCode(java.lang.String securityLevelCode) {
		_tempShipSecurityMessage.setSecurityLevelCode(securityLevelCode);
	}

	/**
	* Returns the security from date of this temp ship security message.
	*
	* @return the security from date of this temp ship security message
	*/
	@Override
	public java.util.Date getSecurityFromDate() {
		return _tempShipSecurityMessage.getSecurityFromDate();
	}

	/**
	* Sets the security from date of this temp ship security message.
	*
	* @param securityFromDate the security from date of this temp ship security message
	*/
	@Override
	public void setSecurityFromDate(java.util.Date securityFromDate) {
		_tempShipSecurityMessage.setSecurityFromDate(securityFromDate);
	}

	/**
	* Returns the is additional security measures of this temp ship security message.
	*
	* @return the is additional security measures of this temp ship security message
	*/
	@Override
	public int getIsAdditionalSecurityMeasures() {
		return _tempShipSecurityMessage.getIsAdditionalSecurityMeasures();
	}

	/**
	* Sets the is additional security measures of this temp ship security message.
	*
	* @param isAdditionalSecurityMeasures the is additional security measures of this temp ship security message
	*/
	@Override
	public void setIsAdditionalSecurityMeasures(
		int isAdditionalSecurityMeasures) {
		_tempShipSecurityMessage.setIsAdditionalSecurityMeasures(isAdditionalSecurityMeasures);
	}

	/**
	* Returns the additional security detail of this temp ship security message.
	*
	* @return the additional security detail of this temp ship security message
	*/
	@Override
	public java.lang.String getAdditionalSecurityDetail() {
		return _tempShipSecurityMessage.getAdditionalSecurityDetail();
	}

	/**
	* Sets the additional security detail of this temp ship security message.
	*
	* @param additionalSecurityDetail the additional security detail of this temp ship security message
	*/
	@Override
	public void setAdditionalSecurityDetail(
		java.lang.String additionalSecurityDetail) {
		_tempShipSecurityMessage.setAdditionalSecurityDetail(additionalSecurityDetail);
	}

	/**
	* Returns the is maintain security of this temp ship security message.
	*
	* @return the is maintain security of this temp ship security message
	*/
	@Override
	public int getIsMaintainSecurity() {
		return _tempShipSecurityMessage.getIsMaintainSecurity();
	}

	/**
	* Sets the is maintain security of this temp ship security message.
	*
	* @param isMaintainSecurity the is maintain security of this temp ship security message
	*/
	@Override
	public void setIsMaintainSecurity(int isMaintainSecurity) {
		_tempShipSecurityMessage.setIsMaintainSecurity(isMaintainSecurity);
	}

	/**
	* Returns the maintain security detail of this temp ship security message.
	*
	* @return the maintain security detail of this temp ship security message
	*/
	@Override
	public java.lang.String getMaintainSecurityDetail() {
		return _tempShipSecurityMessage.getMaintainSecurityDetail();
	}

	/**
	* Sets the maintain security detail of this temp ship security message.
	*
	* @param maintainSecurityDetail the maintain security detail of this temp ship security message
	*/
	@Override
	public void setMaintainSecurityDetail(
		java.lang.String maintainSecurityDetail) {
		_tempShipSecurityMessage.setMaintainSecurityDetail(maintainSecurityDetail);
	}

	/**
	* Returns the latitude of this temp ship security message.
	*
	* @return the latitude of this temp ship security message
	*/
	@Override
	public java.lang.String getLatitude() {
		return _tempShipSecurityMessage.getLatitude();
	}

	/**
	* Sets the latitude of this temp ship security message.
	*
	* @param latitude the latitude of this temp ship security message
	*/
	@Override
	public void setLatitude(java.lang.String latitude) {
		_tempShipSecurityMessage.setLatitude(latitude);
	}

	/**
	* Returns the longitude of this temp ship security message.
	*
	* @return the longitude of this temp ship security message
	*/
	@Override
	public java.lang.String getLongitude() {
		return _tempShipSecurityMessage.getLongitude();
	}

	/**
	* Sets the longitude of this temp ship security message.
	*
	* @param longitude the longitude of this temp ship security message
	*/
	@Override
	public void setLongitude(java.lang.String longitude) {
		_tempShipSecurityMessage.setLongitude(longitude);
	}

	/**
	* Returns the has ship security port items of this temp ship security message.
	*
	* @return the has ship security port items of this temp ship security message
	*/
	@Override
	public int getHasShipSecurityPortItems() {
		return _tempShipSecurityMessage.getHasShipSecurityPortItems();
	}

	/**
	* Sets the has ship security port items of this temp ship security message.
	*
	* @param hasShipSecurityPortItems the has ship security port items of this temp ship security message
	*/
	@Override
	public void setHasShipSecurityPortItems(int hasShipSecurityPortItems) {
		_tempShipSecurityMessage.setHasShipSecurityPortItems(hasShipSecurityPortItems);
	}

	/**
	* Returns the sign place of this temp ship security message.
	*
	* @return the sign place of this temp ship security message
	*/
	@Override
	public java.lang.String getSignPlace() {
		return _tempShipSecurityMessage.getSignPlace();
	}

	/**
	* Sets the sign place of this temp ship security message.
	*
	* @param signPlace the sign place of this temp ship security message
	*/
	@Override
	public void setSignPlace(java.lang.String signPlace) {
		_tempShipSecurityMessage.setSignPlace(signPlace);
	}

	/**
	* Returns the sign date of this temp ship security message.
	*
	* @return the sign date of this temp ship security message
	*/
	@Override
	public java.util.Date getSignDate() {
		return _tempShipSecurityMessage.getSignDate();
	}

	/**
	* Sets the sign date of this temp ship security message.
	*
	* @param signDate the sign date of this temp ship security message
	*/
	@Override
	public void setSignDate(java.util.Date signDate) {
		_tempShipSecurityMessage.setSignDate(signDate);
	}

	/**
	* Returns the master signed of this temp ship security message.
	*
	* @return the master signed of this temp ship security message
	*/
	@Override
	public int getMasterSigned() {
		return _tempShipSecurityMessage.getMasterSigned();
	}

	/**
	* Sets the master signed of this temp ship security message.
	*
	* @param masterSigned the master signed of this temp ship security message
	*/
	@Override
	public void setMasterSigned(int masterSigned) {
		_tempShipSecurityMessage.setMasterSigned(masterSigned);
	}

	/**
	* Returns the master signed image of this temp ship security message.
	*
	* @return the master signed image of this temp ship security message
	*/
	@Override
	public int getMasterSignedImage() {
		return _tempShipSecurityMessage.getMasterSignedImage();
	}

	/**
	* Sets the master signed image of this temp ship security message.
	*
	* @param masterSignedImage the master signed image of this temp ship security message
	*/
	@Override
	public void setMasterSignedImage(int masterSignedImage) {
		_tempShipSecurityMessage.setMasterSignedImage(masterSignedImage);
	}

	/**
	* Returns the call sign of this temp ship security message.
	*
	* @return the call sign of this temp ship security message
	*/
	@Override
	public java.lang.String getCallSign() {
		return _tempShipSecurityMessage.getCallSign();
	}

	/**
	* Sets the call sign of this temp ship security message.
	*
	* @param callSign the call sign of this temp ship security message
	*/
	@Override
	public void setCallSign(java.lang.String callSign) {
		_tempShipSecurityMessage.setCallSign(callSign);
	}

	/**
	* Returns the arrival port code of this temp ship security message.
	*
	* @return the arrival port code of this temp ship security message
	*/
	@Override
	public java.lang.String getArrivalPortCode() {
		return _tempShipSecurityMessage.getArrivalPortCode();
	}

	/**
	* Sets the arrival port code of this temp ship security message.
	*
	* @param arrivalPortCode the arrival port code of this temp ship security message
	*/
	@Override
	public void setArrivalPortCode(java.lang.String arrivalPortCode) {
		_tempShipSecurityMessage.setArrivalPortCode(arrivalPortCode);
	}

	/**
	* Returns the port harbour code of this temp ship security message.
	*
	* @return the port harbour code of this temp ship security message
	*/
	@Override
	public java.lang.String getPortHarbourCode() {
		return _tempShipSecurityMessage.getPortHarbourCode();
	}

	/**
	* Sets the port harbour code of this temp ship security message.
	*
	* @param portHarbourCode the port harbour code of this temp ship security message
	*/
	@Override
	public void setPortHarbourCode(java.lang.String portHarbourCode) {
		_tempShipSecurityMessage.setPortHarbourCode(portHarbourCode);
	}

	@Override
	public boolean isNew() {
		return _tempShipSecurityMessage.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tempShipSecurityMessage.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tempShipSecurityMessage.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tempShipSecurityMessage.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tempShipSecurityMessage.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tempShipSecurityMessage.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tempShipSecurityMessage.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tempShipSecurityMessage.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tempShipSecurityMessage.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tempShipSecurityMessage.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tempShipSecurityMessage.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TempShipSecurityMessageWrapper((TempShipSecurityMessage)_tempShipSecurityMessage.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityMessage tempShipSecurityMessage) {
		return _tempShipSecurityMessage.compareTo(tempShipSecurityMessage);
	}

	@Override
	public int hashCode() {
		return _tempShipSecurityMessage.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityMessage> toCacheModel() {
		return _tempShipSecurityMessage.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityMessage toEscapedModel() {
		return new TempShipSecurityMessageWrapper(_tempShipSecurityMessage.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempShipSecurityMessage toUnescapedModel() {
		return new TempShipSecurityMessageWrapper(_tempShipSecurityMessage.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tempShipSecurityMessage.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tempShipSecurityMessage.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempShipSecurityMessage.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TempShipSecurityMessageWrapper)) {
			return false;
		}

		TempShipSecurityMessageWrapper tempShipSecurityMessageWrapper = (TempShipSecurityMessageWrapper)obj;

		if (Validator.equals(_tempShipSecurityMessage,
					tempShipSecurityMessageWrapper._tempShipSecurityMessage)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TempShipSecurityMessage getWrappedTempShipSecurityMessage() {
		return _tempShipSecurityMessage;
	}

	@Override
	public TempShipSecurityMessage getWrappedModel() {
		return _tempShipSecurityMessage;
	}

	@Override
	public void resetOriginalValues() {
		_tempShipSecurityMessage.resetOriginalValues();
	}

	private TempShipSecurityMessage _tempShipSecurityMessage;
}