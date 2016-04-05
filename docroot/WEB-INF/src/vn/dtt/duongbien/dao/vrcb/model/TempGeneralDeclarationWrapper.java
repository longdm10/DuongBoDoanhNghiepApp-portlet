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
 * This class is a wrapper for {@link TempGeneralDeclaration}.
 * </p>
 *
 * @author longdm
 * @see TempGeneralDeclaration
 * @generated
 */
public class TempGeneralDeclarationWrapper implements TempGeneralDeclaration,
	ModelWrapper<TempGeneralDeclaration> {
	public TempGeneralDeclarationWrapper(
		TempGeneralDeclaration tempGeneralDeclaration) {
		_tempGeneralDeclaration = tempGeneralDeclaration;
	}

	@Override
	public Class<?> getModelClass() {
		return TempGeneralDeclaration.class;
	}

	@Override
	public String getModelClassName() {
		return TempGeneralDeclaration.class.getName();
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
		attributes.put("isArrival", getIsArrival());
		attributes.put("nameOfShip", getNameOfShip());
		attributes.put("shipTypeCode", getShipTypeCode());
		attributes.put("imoNumber", getImoNumber());
		attributes.put("callSign", getCallSign());
		attributes.put("voyageNumber", getVoyageNumber());
		attributes.put("portOfArrivalCode", getPortOfArrivalCode());
		attributes.put("dateOfArrival", getDateOfArrival());
		attributes.put("portHarbourCode", getPortHarbourCode());
		attributes.put("portRegionCode", getPortRegionCode());
		attributes.put("portWharfCode", getPortWharfCode());
		attributes.put("flagStateOfShip", getFlagStateOfShip());
		attributes.put("nameOfMaster", getNameOfMaster());
		attributes.put("lastPortOfCallCode", getLastPortOfCallCode());
		attributes.put("certificateOfRegistryNumber",
			getCertificateOfRegistryNumber());
		attributes.put("certificateOfRegistryDate",
			getCertificateOfRegistryDate());
		attributes.put("certificateOfRegistryPortName",
			getCertificateOfRegistryPortName());
		attributes.put("taxCodeOfShipownersAgents",
			getTaxCodeOfShipownersAgents());
		attributes.put("nameOfShipownersAgents", getNameOfShipownersAgents());
		attributes.put("shipAgencyAddress", getShipAgencyAddress());
		attributes.put("shipAgencyPhone", getShipAgencyPhone());
		attributes.put("shipAgencyFax", getShipAgencyFax());
		attributes.put("shipAgencyEmail", getShipAgencyEmail());
		attributes.put("grossTonnage", getGrossTonnage());
		attributes.put("netTonnage", getNetTonnage());
		attributes.put("positionOfShipInport", getPositionOfShipInport());
		attributes.put("briefParticularsOfVoyage", getBriefParticularsOfVoyage());
		attributes.put("briefDescriptionOfTheCargo",
			getBriefDescriptionOfTheCargo());
		attributes.put("numberOfCrew", getNumberOfCrew());
		attributes.put("numberOfPassengers", getNumberOfPassengers());
		attributes.put("shipRequirementsInTermsOfWaste",
			getShipRequirementsInTermsOfWaste());
		attributes.put("remarks", getRemarks());
		attributes.put("numberCargoDeclaration", getNumberCargoDeclaration());
		attributes.put("numberShipStoreDeclaration",
			getNumberShipStoreDeclaration());
		attributes.put("numberCrewList", getNumberCrewList());
		attributes.put("numberPassengerList", getNumberPassengerList());
		attributes.put("numberCrewEffects", getNumberCrewEffects());
		attributes.put("numberHealthMaritime", getNumberHealthMaritime());
		attributes.put("signPlace", getSignPlace());
		attributes.put("signDate", getSignDate());
		attributes.put("masterSigned", getMasterSigned());
		attributes.put("masterSignedImage", getMasterSignedImage());

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

		Integer isArrival = (Integer)attributes.get("isArrival");

		if (isArrival != null) {
			setIsArrival(isArrival);
		}

		String nameOfShip = (String)attributes.get("nameOfShip");

		if (nameOfShip != null) {
			setNameOfShip(nameOfShip);
		}

		String shipTypeCode = (String)attributes.get("shipTypeCode");

		if (shipTypeCode != null) {
			setShipTypeCode(shipTypeCode);
		}

		String imoNumber = (String)attributes.get("imoNumber");

		if (imoNumber != null) {
			setImoNumber(imoNumber);
		}

		String callSign = (String)attributes.get("callSign");

		if (callSign != null) {
			setCallSign(callSign);
		}

		String voyageNumber = (String)attributes.get("voyageNumber");

		if (voyageNumber != null) {
			setVoyageNumber(voyageNumber);
		}

		String portOfArrivalCode = (String)attributes.get("portOfArrivalCode");

		if (portOfArrivalCode != null) {
			setPortOfArrivalCode(portOfArrivalCode);
		}

		Date dateOfArrival = (Date)attributes.get("dateOfArrival");

		if (dateOfArrival != null) {
			setDateOfArrival(dateOfArrival);
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

		String flagStateOfShip = (String)attributes.get("flagStateOfShip");

		if (flagStateOfShip != null) {
			setFlagStateOfShip(flagStateOfShip);
		}

		String nameOfMaster = (String)attributes.get("nameOfMaster");

		if (nameOfMaster != null) {
			setNameOfMaster(nameOfMaster);
		}

		String lastPortOfCallCode = (String)attributes.get("lastPortOfCallCode");

		if (lastPortOfCallCode != null) {
			setLastPortOfCallCode(lastPortOfCallCode);
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

		String taxCodeOfShipownersAgents = (String)attributes.get(
				"taxCodeOfShipownersAgents");

		if (taxCodeOfShipownersAgents != null) {
			setTaxCodeOfShipownersAgents(taxCodeOfShipownersAgents);
		}

		String nameOfShipownersAgents = (String)attributes.get(
				"nameOfShipownersAgents");

		if (nameOfShipownersAgents != null) {
			setNameOfShipownersAgents(nameOfShipownersAgents);
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

		Double grossTonnage = (Double)attributes.get("grossTonnage");

		if (grossTonnage != null) {
			setGrossTonnage(grossTonnage);
		}

		Double netTonnage = (Double)attributes.get("netTonnage");

		if (netTonnage != null) {
			setNetTonnage(netTonnage);
		}

		String positionOfShipInport = (String)attributes.get(
				"positionOfShipInport");

		if (positionOfShipInport != null) {
			setPositionOfShipInport(positionOfShipInport);
		}

		String briefParticularsOfVoyage = (String)attributes.get(
				"briefParticularsOfVoyage");

		if (briefParticularsOfVoyage != null) {
			setBriefParticularsOfVoyage(briefParticularsOfVoyage);
		}

		String briefDescriptionOfTheCargo = (String)attributes.get(
				"briefDescriptionOfTheCargo");

		if (briefDescriptionOfTheCargo != null) {
			setBriefDescriptionOfTheCargo(briefDescriptionOfTheCargo);
		}

		Integer numberOfCrew = (Integer)attributes.get("numberOfCrew");

		if (numberOfCrew != null) {
			setNumberOfCrew(numberOfCrew);
		}

		Integer numberOfPassengers = (Integer)attributes.get(
				"numberOfPassengers");

		if (numberOfPassengers != null) {
			setNumberOfPassengers(numberOfPassengers);
		}

		String shipRequirementsInTermsOfWaste = (String)attributes.get(
				"shipRequirementsInTermsOfWaste");

		if (shipRequirementsInTermsOfWaste != null) {
			setShipRequirementsInTermsOfWaste(shipRequirementsInTermsOfWaste);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		String numberCargoDeclaration = (String)attributes.get(
				"numberCargoDeclaration");

		if (numberCargoDeclaration != null) {
			setNumberCargoDeclaration(numberCargoDeclaration);
		}

		String numberShipStoreDeclaration = (String)attributes.get(
				"numberShipStoreDeclaration");

		if (numberShipStoreDeclaration != null) {
			setNumberShipStoreDeclaration(numberShipStoreDeclaration);
		}

		String numberCrewList = (String)attributes.get("numberCrewList");

		if (numberCrewList != null) {
			setNumberCrewList(numberCrewList);
		}

		String numberPassengerList = (String)attributes.get(
				"numberPassengerList");

		if (numberPassengerList != null) {
			setNumberPassengerList(numberPassengerList);
		}

		String numberCrewEffects = (String)attributes.get("numberCrewEffects");

		if (numberCrewEffects != null) {
			setNumberCrewEffects(numberCrewEffects);
		}

		String numberHealthMaritime = (String)attributes.get(
				"numberHealthMaritime");

		if (numberHealthMaritime != null) {
			setNumberHealthMaritime(numberHealthMaritime);
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
	}

	/**
	* Returns the primary key of this temp general declaration.
	*
	* @return the primary key of this temp general declaration
	*/
	@Override
	public long getPrimaryKey() {
		return _tempGeneralDeclaration.getPrimaryKey();
	}

	/**
	* Sets the primary key of this temp general declaration.
	*
	* @param primaryKey the primary key of this temp general declaration
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tempGeneralDeclaration.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this temp general declaration.
	*
	* @return the ID of this temp general declaration
	*/
	@Override
	public long getId() {
		return _tempGeneralDeclaration.getId();
	}

	/**
	* Sets the ID of this temp general declaration.
	*
	* @param id the ID of this temp general declaration
	*/
	@Override
	public void setId(long id) {
		_tempGeneralDeclaration.setId(id);
	}

	/**
	* Returns the request code of this temp general declaration.
	*
	* @return the request code of this temp general declaration
	*/
	@Override
	public java.lang.String getRequestCode() {
		return _tempGeneralDeclaration.getRequestCode();
	}

	/**
	* Sets the request code of this temp general declaration.
	*
	* @param requestCode the request code of this temp general declaration
	*/
	@Override
	public void setRequestCode(java.lang.String requestCode) {
		_tempGeneralDeclaration.setRequestCode(requestCode);
	}

	/**
	* Returns the request state of this temp general declaration.
	*
	* @return the request state of this temp general declaration
	*/
	@Override
	public int getRequestState() {
		return _tempGeneralDeclaration.getRequestState();
	}

	/**
	* Sets the request state of this temp general declaration.
	*
	* @param requestState the request state of this temp general declaration
	*/
	@Override
	public void setRequestState(int requestState) {
		_tempGeneralDeclaration.setRequestState(requestState);
	}

	/**
	* Returns the document name of this temp general declaration.
	*
	* @return the document name of this temp general declaration
	*/
	@Override
	public long getDocumentName() {
		return _tempGeneralDeclaration.getDocumentName();
	}

	/**
	* Sets the document name of this temp general declaration.
	*
	* @param documentName the document name of this temp general declaration
	*/
	@Override
	public void setDocumentName(long documentName) {
		_tempGeneralDeclaration.setDocumentName(documentName);
	}

	/**
	* Returns the document year of this temp general declaration.
	*
	* @return the document year of this temp general declaration
	*/
	@Override
	public int getDocumentYear() {
		return _tempGeneralDeclaration.getDocumentYear();
	}

	/**
	* Sets the document year of this temp general declaration.
	*
	* @param documentYear the document year of this temp general declaration
	*/
	@Override
	public void setDocumentYear(int documentYear) {
		_tempGeneralDeclaration.setDocumentYear(documentYear);
	}

	/**
	* Returns the user created of this temp general declaration.
	*
	* @return the user created of this temp general declaration
	*/
	@Override
	public java.lang.String getUserCreated() {
		return _tempGeneralDeclaration.getUserCreated();
	}

	/**
	* Sets the user created of this temp general declaration.
	*
	* @param userCreated the user created of this temp general declaration
	*/
	@Override
	public void setUserCreated(java.lang.String userCreated) {
		_tempGeneralDeclaration.setUserCreated(userCreated);
	}

	/**
	* Returns the is arrival of this temp general declaration.
	*
	* @return the is arrival of this temp general declaration
	*/
	@Override
	public int getIsArrival() {
		return _tempGeneralDeclaration.getIsArrival();
	}

	/**
	* Sets the is arrival of this temp general declaration.
	*
	* @param isArrival the is arrival of this temp general declaration
	*/
	@Override
	public void setIsArrival(int isArrival) {
		_tempGeneralDeclaration.setIsArrival(isArrival);
	}

	/**
	* Returns the name of ship of this temp general declaration.
	*
	* @return the name of ship of this temp general declaration
	*/
	@Override
	public java.lang.String getNameOfShip() {
		return _tempGeneralDeclaration.getNameOfShip();
	}

	/**
	* Sets the name of ship of this temp general declaration.
	*
	* @param nameOfShip the name of ship of this temp general declaration
	*/
	@Override
	public void setNameOfShip(java.lang.String nameOfShip) {
		_tempGeneralDeclaration.setNameOfShip(nameOfShip);
	}

	/**
	* Returns the ship type code of this temp general declaration.
	*
	* @return the ship type code of this temp general declaration
	*/
	@Override
	public java.lang.String getShipTypeCode() {
		return _tempGeneralDeclaration.getShipTypeCode();
	}

	/**
	* Sets the ship type code of this temp general declaration.
	*
	* @param shipTypeCode the ship type code of this temp general declaration
	*/
	@Override
	public void setShipTypeCode(java.lang.String shipTypeCode) {
		_tempGeneralDeclaration.setShipTypeCode(shipTypeCode);
	}

	/**
	* Returns the imo number of this temp general declaration.
	*
	* @return the imo number of this temp general declaration
	*/
	@Override
	public java.lang.String getImoNumber() {
		return _tempGeneralDeclaration.getImoNumber();
	}

	/**
	* Sets the imo number of this temp general declaration.
	*
	* @param imoNumber the imo number of this temp general declaration
	*/
	@Override
	public void setImoNumber(java.lang.String imoNumber) {
		_tempGeneralDeclaration.setImoNumber(imoNumber);
	}

	/**
	* Returns the call sign of this temp general declaration.
	*
	* @return the call sign of this temp general declaration
	*/
	@Override
	public java.lang.String getCallSign() {
		return _tempGeneralDeclaration.getCallSign();
	}

	/**
	* Sets the call sign of this temp general declaration.
	*
	* @param callSign the call sign of this temp general declaration
	*/
	@Override
	public void setCallSign(java.lang.String callSign) {
		_tempGeneralDeclaration.setCallSign(callSign);
	}

	/**
	* Returns the voyage number of this temp general declaration.
	*
	* @return the voyage number of this temp general declaration
	*/
	@Override
	public java.lang.String getVoyageNumber() {
		return _tempGeneralDeclaration.getVoyageNumber();
	}

	/**
	* Sets the voyage number of this temp general declaration.
	*
	* @param voyageNumber the voyage number of this temp general declaration
	*/
	@Override
	public void setVoyageNumber(java.lang.String voyageNumber) {
		_tempGeneralDeclaration.setVoyageNumber(voyageNumber);
	}

	/**
	* Returns the port of arrival code of this temp general declaration.
	*
	* @return the port of arrival code of this temp general declaration
	*/
	@Override
	public java.lang.String getPortOfArrivalCode() {
		return _tempGeneralDeclaration.getPortOfArrivalCode();
	}

	/**
	* Sets the port of arrival code of this temp general declaration.
	*
	* @param portOfArrivalCode the port of arrival code of this temp general declaration
	*/
	@Override
	public void setPortOfArrivalCode(java.lang.String portOfArrivalCode) {
		_tempGeneralDeclaration.setPortOfArrivalCode(portOfArrivalCode);
	}

	/**
	* Returns the date of arrival of this temp general declaration.
	*
	* @return the date of arrival of this temp general declaration
	*/
	@Override
	public java.util.Date getDateOfArrival() {
		return _tempGeneralDeclaration.getDateOfArrival();
	}

	/**
	* Sets the date of arrival of this temp general declaration.
	*
	* @param dateOfArrival the date of arrival of this temp general declaration
	*/
	@Override
	public void setDateOfArrival(java.util.Date dateOfArrival) {
		_tempGeneralDeclaration.setDateOfArrival(dateOfArrival);
	}

	/**
	* Returns the port harbour code of this temp general declaration.
	*
	* @return the port harbour code of this temp general declaration
	*/
	@Override
	public java.lang.String getPortHarbourCode() {
		return _tempGeneralDeclaration.getPortHarbourCode();
	}

	/**
	* Sets the port harbour code of this temp general declaration.
	*
	* @param portHarbourCode the port harbour code of this temp general declaration
	*/
	@Override
	public void setPortHarbourCode(java.lang.String portHarbourCode) {
		_tempGeneralDeclaration.setPortHarbourCode(portHarbourCode);
	}

	/**
	* Returns the port region code of this temp general declaration.
	*
	* @return the port region code of this temp general declaration
	*/
	@Override
	public java.lang.String getPortRegionCode() {
		return _tempGeneralDeclaration.getPortRegionCode();
	}

	/**
	* Sets the port region code of this temp general declaration.
	*
	* @param portRegionCode the port region code of this temp general declaration
	*/
	@Override
	public void setPortRegionCode(java.lang.String portRegionCode) {
		_tempGeneralDeclaration.setPortRegionCode(portRegionCode);
	}

	/**
	* Returns the port wharf code of this temp general declaration.
	*
	* @return the port wharf code of this temp general declaration
	*/
	@Override
	public java.lang.String getPortWharfCode() {
		return _tempGeneralDeclaration.getPortWharfCode();
	}

	/**
	* Sets the port wharf code of this temp general declaration.
	*
	* @param portWharfCode the port wharf code of this temp general declaration
	*/
	@Override
	public void setPortWharfCode(java.lang.String portWharfCode) {
		_tempGeneralDeclaration.setPortWharfCode(portWharfCode);
	}

	/**
	* Returns the flag state of ship of this temp general declaration.
	*
	* @return the flag state of ship of this temp general declaration
	*/
	@Override
	public java.lang.String getFlagStateOfShip() {
		return _tempGeneralDeclaration.getFlagStateOfShip();
	}

	/**
	* Sets the flag state of ship of this temp general declaration.
	*
	* @param flagStateOfShip the flag state of ship of this temp general declaration
	*/
	@Override
	public void setFlagStateOfShip(java.lang.String flagStateOfShip) {
		_tempGeneralDeclaration.setFlagStateOfShip(flagStateOfShip);
	}

	/**
	* Returns the name of master of this temp general declaration.
	*
	* @return the name of master of this temp general declaration
	*/
	@Override
	public java.lang.String getNameOfMaster() {
		return _tempGeneralDeclaration.getNameOfMaster();
	}

	/**
	* Sets the name of master of this temp general declaration.
	*
	* @param nameOfMaster the name of master of this temp general declaration
	*/
	@Override
	public void setNameOfMaster(java.lang.String nameOfMaster) {
		_tempGeneralDeclaration.setNameOfMaster(nameOfMaster);
	}

	/**
	* Returns the last port of call code of this temp general declaration.
	*
	* @return the last port of call code of this temp general declaration
	*/
	@Override
	public java.lang.String getLastPortOfCallCode() {
		return _tempGeneralDeclaration.getLastPortOfCallCode();
	}

	/**
	* Sets the last port of call code of this temp general declaration.
	*
	* @param lastPortOfCallCode the last port of call code of this temp general declaration
	*/
	@Override
	public void setLastPortOfCallCode(java.lang.String lastPortOfCallCode) {
		_tempGeneralDeclaration.setLastPortOfCallCode(lastPortOfCallCode);
	}

	/**
	* Returns the certificate of registry number of this temp general declaration.
	*
	* @return the certificate of registry number of this temp general declaration
	*/
	@Override
	public java.lang.String getCertificateOfRegistryNumber() {
		return _tempGeneralDeclaration.getCertificateOfRegistryNumber();
	}

	/**
	* Sets the certificate of registry number of this temp general declaration.
	*
	* @param certificateOfRegistryNumber the certificate of registry number of this temp general declaration
	*/
	@Override
	public void setCertificateOfRegistryNumber(
		java.lang.String certificateOfRegistryNumber) {
		_tempGeneralDeclaration.setCertificateOfRegistryNumber(certificateOfRegistryNumber);
	}

	/**
	* Returns the certificate of registry date of this temp general declaration.
	*
	* @return the certificate of registry date of this temp general declaration
	*/
	@Override
	public java.util.Date getCertificateOfRegistryDate() {
		return _tempGeneralDeclaration.getCertificateOfRegistryDate();
	}

	/**
	* Sets the certificate of registry date of this temp general declaration.
	*
	* @param certificateOfRegistryDate the certificate of registry date of this temp general declaration
	*/
	@Override
	public void setCertificateOfRegistryDate(
		java.util.Date certificateOfRegistryDate) {
		_tempGeneralDeclaration.setCertificateOfRegistryDate(certificateOfRegistryDate);
	}

	/**
	* Returns the certificate of registry port name of this temp general declaration.
	*
	* @return the certificate of registry port name of this temp general declaration
	*/
	@Override
	public java.lang.String getCertificateOfRegistryPortName() {
		return _tempGeneralDeclaration.getCertificateOfRegistryPortName();
	}

	/**
	* Sets the certificate of registry port name of this temp general declaration.
	*
	* @param certificateOfRegistryPortName the certificate of registry port name of this temp general declaration
	*/
	@Override
	public void setCertificateOfRegistryPortName(
		java.lang.String certificateOfRegistryPortName) {
		_tempGeneralDeclaration.setCertificateOfRegistryPortName(certificateOfRegistryPortName);
	}

	/**
	* Returns the tax code of shipowners agents of this temp general declaration.
	*
	* @return the tax code of shipowners agents of this temp general declaration
	*/
	@Override
	public java.lang.String getTaxCodeOfShipownersAgents() {
		return _tempGeneralDeclaration.getTaxCodeOfShipownersAgents();
	}

	/**
	* Sets the tax code of shipowners agents of this temp general declaration.
	*
	* @param taxCodeOfShipownersAgents the tax code of shipowners agents of this temp general declaration
	*/
	@Override
	public void setTaxCodeOfShipownersAgents(
		java.lang.String taxCodeOfShipownersAgents) {
		_tempGeneralDeclaration.setTaxCodeOfShipownersAgents(taxCodeOfShipownersAgents);
	}

	/**
	* Returns the name of shipowners agents of this temp general declaration.
	*
	* @return the name of shipowners agents of this temp general declaration
	*/
	@Override
	public java.lang.String getNameOfShipownersAgents() {
		return _tempGeneralDeclaration.getNameOfShipownersAgents();
	}

	/**
	* Sets the name of shipowners agents of this temp general declaration.
	*
	* @param nameOfShipownersAgents the name of shipowners agents of this temp general declaration
	*/
	@Override
	public void setNameOfShipownersAgents(
		java.lang.String nameOfShipownersAgents) {
		_tempGeneralDeclaration.setNameOfShipownersAgents(nameOfShipownersAgents);
	}

	/**
	* Returns the ship agency address of this temp general declaration.
	*
	* @return the ship agency address of this temp general declaration
	*/
	@Override
	public java.lang.String getShipAgencyAddress() {
		return _tempGeneralDeclaration.getShipAgencyAddress();
	}

	/**
	* Sets the ship agency address of this temp general declaration.
	*
	* @param shipAgencyAddress the ship agency address of this temp general declaration
	*/
	@Override
	public void setShipAgencyAddress(java.lang.String shipAgencyAddress) {
		_tempGeneralDeclaration.setShipAgencyAddress(shipAgencyAddress);
	}

	/**
	* Returns the ship agency phone of this temp general declaration.
	*
	* @return the ship agency phone of this temp general declaration
	*/
	@Override
	public java.lang.String getShipAgencyPhone() {
		return _tempGeneralDeclaration.getShipAgencyPhone();
	}

	/**
	* Sets the ship agency phone of this temp general declaration.
	*
	* @param shipAgencyPhone the ship agency phone of this temp general declaration
	*/
	@Override
	public void setShipAgencyPhone(java.lang.String shipAgencyPhone) {
		_tempGeneralDeclaration.setShipAgencyPhone(shipAgencyPhone);
	}

	/**
	* Returns the ship agency fax of this temp general declaration.
	*
	* @return the ship agency fax of this temp general declaration
	*/
	@Override
	public java.lang.String getShipAgencyFax() {
		return _tempGeneralDeclaration.getShipAgencyFax();
	}

	/**
	* Sets the ship agency fax of this temp general declaration.
	*
	* @param shipAgencyFax the ship agency fax of this temp general declaration
	*/
	@Override
	public void setShipAgencyFax(java.lang.String shipAgencyFax) {
		_tempGeneralDeclaration.setShipAgencyFax(shipAgencyFax);
	}

	/**
	* Returns the ship agency email of this temp general declaration.
	*
	* @return the ship agency email of this temp general declaration
	*/
	@Override
	public java.lang.String getShipAgencyEmail() {
		return _tempGeneralDeclaration.getShipAgencyEmail();
	}

	/**
	* Sets the ship agency email of this temp general declaration.
	*
	* @param shipAgencyEmail the ship agency email of this temp general declaration
	*/
	@Override
	public void setShipAgencyEmail(java.lang.String shipAgencyEmail) {
		_tempGeneralDeclaration.setShipAgencyEmail(shipAgencyEmail);
	}

	/**
	* Returns the gross tonnage of this temp general declaration.
	*
	* @return the gross tonnage of this temp general declaration
	*/
	@Override
	public double getGrossTonnage() {
		return _tempGeneralDeclaration.getGrossTonnage();
	}

	/**
	* Sets the gross tonnage of this temp general declaration.
	*
	* @param grossTonnage the gross tonnage of this temp general declaration
	*/
	@Override
	public void setGrossTonnage(double grossTonnage) {
		_tempGeneralDeclaration.setGrossTonnage(grossTonnage);
	}

	/**
	* Returns the net tonnage of this temp general declaration.
	*
	* @return the net tonnage of this temp general declaration
	*/
	@Override
	public double getNetTonnage() {
		return _tempGeneralDeclaration.getNetTonnage();
	}

	/**
	* Sets the net tonnage of this temp general declaration.
	*
	* @param netTonnage the net tonnage of this temp general declaration
	*/
	@Override
	public void setNetTonnage(double netTonnage) {
		_tempGeneralDeclaration.setNetTonnage(netTonnage);
	}

	/**
	* Returns the position of ship inport of this temp general declaration.
	*
	* @return the position of ship inport of this temp general declaration
	*/
	@Override
	public java.lang.String getPositionOfShipInport() {
		return _tempGeneralDeclaration.getPositionOfShipInport();
	}

	/**
	* Sets the position of ship inport of this temp general declaration.
	*
	* @param positionOfShipInport the position of ship inport of this temp general declaration
	*/
	@Override
	public void setPositionOfShipInport(java.lang.String positionOfShipInport) {
		_tempGeneralDeclaration.setPositionOfShipInport(positionOfShipInport);
	}

	/**
	* Returns the brief particulars of voyage of this temp general declaration.
	*
	* @return the brief particulars of voyage of this temp general declaration
	*/
	@Override
	public java.lang.String getBriefParticularsOfVoyage() {
		return _tempGeneralDeclaration.getBriefParticularsOfVoyage();
	}

	/**
	* Sets the brief particulars of voyage of this temp general declaration.
	*
	* @param briefParticularsOfVoyage the brief particulars of voyage of this temp general declaration
	*/
	@Override
	public void setBriefParticularsOfVoyage(
		java.lang.String briefParticularsOfVoyage) {
		_tempGeneralDeclaration.setBriefParticularsOfVoyage(briefParticularsOfVoyage);
	}

	/**
	* Returns the brief description of the cargo of this temp general declaration.
	*
	* @return the brief description of the cargo of this temp general declaration
	*/
	@Override
	public java.lang.String getBriefDescriptionOfTheCargo() {
		return _tempGeneralDeclaration.getBriefDescriptionOfTheCargo();
	}

	/**
	* Sets the brief description of the cargo of this temp general declaration.
	*
	* @param briefDescriptionOfTheCargo the brief description of the cargo of this temp general declaration
	*/
	@Override
	public void setBriefDescriptionOfTheCargo(
		java.lang.String briefDescriptionOfTheCargo) {
		_tempGeneralDeclaration.setBriefDescriptionOfTheCargo(briefDescriptionOfTheCargo);
	}

	/**
	* Returns the number of crew of this temp general declaration.
	*
	* @return the number of crew of this temp general declaration
	*/
	@Override
	public int getNumberOfCrew() {
		return _tempGeneralDeclaration.getNumberOfCrew();
	}

	/**
	* Sets the number of crew of this temp general declaration.
	*
	* @param numberOfCrew the number of crew of this temp general declaration
	*/
	@Override
	public void setNumberOfCrew(int numberOfCrew) {
		_tempGeneralDeclaration.setNumberOfCrew(numberOfCrew);
	}

	/**
	* Returns the number of passengers of this temp general declaration.
	*
	* @return the number of passengers of this temp general declaration
	*/
	@Override
	public int getNumberOfPassengers() {
		return _tempGeneralDeclaration.getNumberOfPassengers();
	}

	/**
	* Sets the number of passengers of this temp general declaration.
	*
	* @param numberOfPassengers the number of passengers of this temp general declaration
	*/
	@Override
	public void setNumberOfPassengers(int numberOfPassengers) {
		_tempGeneralDeclaration.setNumberOfPassengers(numberOfPassengers);
	}

	/**
	* Returns the ship requirements in terms of waste of this temp general declaration.
	*
	* @return the ship requirements in terms of waste of this temp general declaration
	*/
	@Override
	public java.lang.String getShipRequirementsInTermsOfWaste() {
		return _tempGeneralDeclaration.getShipRequirementsInTermsOfWaste();
	}

	/**
	* Sets the ship requirements in terms of waste of this temp general declaration.
	*
	* @param shipRequirementsInTermsOfWaste the ship requirements in terms of waste of this temp general declaration
	*/
	@Override
	public void setShipRequirementsInTermsOfWaste(
		java.lang.String shipRequirementsInTermsOfWaste) {
		_tempGeneralDeclaration.setShipRequirementsInTermsOfWaste(shipRequirementsInTermsOfWaste);
	}

	/**
	* Returns the remarks of this temp general declaration.
	*
	* @return the remarks of this temp general declaration
	*/
	@Override
	public java.lang.String getRemarks() {
		return _tempGeneralDeclaration.getRemarks();
	}

	/**
	* Sets the remarks of this temp general declaration.
	*
	* @param remarks the remarks of this temp general declaration
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_tempGeneralDeclaration.setRemarks(remarks);
	}

	/**
	* Returns the number cargo declaration of this temp general declaration.
	*
	* @return the number cargo declaration of this temp general declaration
	*/
	@Override
	public java.lang.String getNumberCargoDeclaration() {
		return _tempGeneralDeclaration.getNumberCargoDeclaration();
	}

	/**
	* Sets the number cargo declaration of this temp general declaration.
	*
	* @param numberCargoDeclaration the number cargo declaration of this temp general declaration
	*/
	@Override
	public void setNumberCargoDeclaration(
		java.lang.String numberCargoDeclaration) {
		_tempGeneralDeclaration.setNumberCargoDeclaration(numberCargoDeclaration);
	}

	/**
	* Returns the number ship store declaration of this temp general declaration.
	*
	* @return the number ship store declaration of this temp general declaration
	*/
	@Override
	public java.lang.String getNumberShipStoreDeclaration() {
		return _tempGeneralDeclaration.getNumberShipStoreDeclaration();
	}

	/**
	* Sets the number ship store declaration of this temp general declaration.
	*
	* @param numberShipStoreDeclaration the number ship store declaration of this temp general declaration
	*/
	@Override
	public void setNumberShipStoreDeclaration(
		java.lang.String numberShipStoreDeclaration) {
		_tempGeneralDeclaration.setNumberShipStoreDeclaration(numberShipStoreDeclaration);
	}

	/**
	* Returns the number crew list of this temp general declaration.
	*
	* @return the number crew list of this temp general declaration
	*/
	@Override
	public java.lang.String getNumberCrewList() {
		return _tempGeneralDeclaration.getNumberCrewList();
	}

	/**
	* Sets the number crew list of this temp general declaration.
	*
	* @param numberCrewList the number crew list of this temp general declaration
	*/
	@Override
	public void setNumberCrewList(java.lang.String numberCrewList) {
		_tempGeneralDeclaration.setNumberCrewList(numberCrewList);
	}

	/**
	* Returns the number passenger list of this temp general declaration.
	*
	* @return the number passenger list of this temp general declaration
	*/
	@Override
	public java.lang.String getNumberPassengerList() {
		return _tempGeneralDeclaration.getNumberPassengerList();
	}

	/**
	* Sets the number passenger list of this temp general declaration.
	*
	* @param numberPassengerList the number passenger list of this temp general declaration
	*/
	@Override
	public void setNumberPassengerList(java.lang.String numberPassengerList) {
		_tempGeneralDeclaration.setNumberPassengerList(numberPassengerList);
	}

	/**
	* Returns the number crew effects of this temp general declaration.
	*
	* @return the number crew effects of this temp general declaration
	*/
	@Override
	public java.lang.String getNumberCrewEffects() {
		return _tempGeneralDeclaration.getNumberCrewEffects();
	}

	/**
	* Sets the number crew effects of this temp general declaration.
	*
	* @param numberCrewEffects the number crew effects of this temp general declaration
	*/
	@Override
	public void setNumberCrewEffects(java.lang.String numberCrewEffects) {
		_tempGeneralDeclaration.setNumberCrewEffects(numberCrewEffects);
	}

	/**
	* Returns the number health maritime of this temp general declaration.
	*
	* @return the number health maritime of this temp general declaration
	*/
	@Override
	public java.lang.String getNumberHealthMaritime() {
		return _tempGeneralDeclaration.getNumberHealthMaritime();
	}

	/**
	* Sets the number health maritime of this temp general declaration.
	*
	* @param numberHealthMaritime the number health maritime of this temp general declaration
	*/
	@Override
	public void setNumberHealthMaritime(java.lang.String numberHealthMaritime) {
		_tempGeneralDeclaration.setNumberHealthMaritime(numberHealthMaritime);
	}

	/**
	* Returns the sign place of this temp general declaration.
	*
	* @return the sign place of this temp general declaration
	*/
	@Override
	public java.lang.String getSignPlace() {
		return _tempGeneralDeclaration.getSignPlace();
	}

	/**
	* Sets the sign place of this temp general declaration.
	*
	* @param signPlace the sign place of this temp general declaration
	*/
	@Override
	public void setSignPlace(java.lang.String signPlace) {
		_tempGeneralDeclaration.setSignPlace(signPlace);
	}

	/**
	* Returns the sign date of this temp general declaration.
	*
	* @return the sign date of this temp general declaration
	*/
	@Override
	public java.util.Date getSignDate() {
		return _tempGeneralDeclaration.getSignDate();
	}

	/**
	* Sets the sign date of this temp general declaration.
	*
	* @param signDate the sign date of this temp general declaration
	*/
	@Override
	public void setSignDate(java.util.Date signDate) {
		_tempGeneralDeclaration.setSignDate(signDate);
	}

	/**
	* Returns the master signed of this temp general declaration.
	*
	* @return the master signed of this temp general declaration
	*/
	@Override
	public int getMasterSigned() {
		return _tempGeneralDeclaration.getMasterSigned();
	}

	/**
	* Sets the master signed of this temp general declaration.
	*
	* @param masterSigned the master signed of this temp general declaration
	*/
	@Override
	public void setMasterSigned(int masterSigned) {
		_tempGeneralDeclaration.setMasterSigned(masterSigned);
	}

	/**
	* Returns the master signed image of this temp general declaration.
	*
	* @return the master signed image of this temp general declaration
	*/
	@Override
	public int getMasterSignedImage() {
		return _tempGeneralDeclaration.getMasterSignedImage();
	}

	/**
	* Sets the master signed image of this temp general declaration.
	*
	* @param masterSignedImage the master signed image of this temp general declaration
	*/
	@Override
	public void setMasterSignedImage(int masterSignedImage) {
		_tempGeneralDeclaration.setMasterSignedImage(masterSignedImage);
	}

	@Override
	public boolean isNew() {
		return _tempGeneralDeclaration.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tempGeneralDeclaration.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tempGeneralDeclaration.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tempGeneralDeclaration.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tempGeneralDeclaration.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tempGeneralDeclaration.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tempGeneralDeclaration.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tempGeneralDeclaration.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tempGeneralDeclaration.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tempGeneralDeclaration.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tempGeneralDeclaration.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TempGeneralDeclarationWrapper((TempGeneralDeclaration)_tempGeneralDeclaration.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclaration tempGeneralDeclaration) {
		return _tempGeneralDeclaration.compareTo(tempGeneralDeclaration);
	}

	@Override
	public int hashCode() {
		return _tempGeneralDeclaration.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclaration> toCacheModel() {
		return _tempGeneralDeclaration.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclaration toEscapedModel() {
		return new TempGeneralDeclarationWrapper(_tempGeneralDeclaration.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclaration toUnescapedModel() {
		return new TempGeneralDeclarationWrapper(_tempGeneralDeclaration.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tempGeneralDeclaration.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tempGeneralDeclaration.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempGeneralDeclaration.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TempGeneralDeclarationWrapper)) {
			return false;
		}

		TempGeneralDeclarationWrapper tempGeneralDeclarationWrapper = (TempGeneralDeclarationWrapper)obj;

		if (Validator.equals(_tempGeneralDeclaration,
					tempGeneralDeclarationWrapper._tempGeneralDeclaration)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TempGeneralDeclaration getWrappedTempGeneralDeclaration() {
		return _tempGeneralDeclaration;
	}

	@Override
	public TempGeneralDeclaration getWrappedModel() {
		return _tempGeneralDeclaration;
	}

	@Override
	public void resetOriginalValues() {
		_tempGeneralDeclaration.resetOriginalValues();
	}

	private TempGeneralDeclaration _tempGeneralDeclaration;
}