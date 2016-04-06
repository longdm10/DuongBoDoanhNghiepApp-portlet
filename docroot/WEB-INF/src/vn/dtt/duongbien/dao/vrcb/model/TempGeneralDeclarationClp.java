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
import vn.dtt.duongbien.dao.vrcb.service.TempGeneralDeclarationLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class TempGeneralDeclarationClp extends BaseModelImpl<TempGeneralDeclaration>
	implements TempGeneralDeclaration {
	public TempGeneralDeclarationClp() {
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

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tempGeneralDeclarationRemoteModel, id);
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

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestCode", String.class);

				method.invoke(_tempGeneralDeclarationRemoteModel, requestCode);
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

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestState", int.class);

				method.invoke(_tempGeneralDeclarationRemoteModel, requestState);
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

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentName", long.class);

				method.invoke(_tempGeneralDeclarationRemoteModel, documentName);
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

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentYear", int.class);

				method.invoke(_tempGeneralDeclarationRemoteModel, documentYear);
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

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setUserCreated", String.class);

				method.invoke(_tempGeneralDeclarationRemoteModel, userCreated);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIsArrival() {
		return _isArrival;
	}

	@Override
	public void setIsArrival(int isArrival) {
		_isArrival = isArrival;

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setIsArrival", int.class);

				method.invoke(_tempGeneralDeclarationRemoteModel, isArrival);
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

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setNameOfShip", String.class);

				method.invoke(_tempGeneralDeclarationRemoteModel, nameOfShip);
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

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setShipTypeCode", String.class);

				method.invoke(_tempGeneralDeclarationRemoteModel, shipTypeCode);
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

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setImoNumber", String.class);

				method.invoke(_tempGeneralDeclarationRemoteModel, imoNumber);
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

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setCallSign", String.class);

				method.invoke(_tempGeneralDeclarationRemoteModel, callSign);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVoyageNumber() {
		return _voyageNumber;
	}

	@Override
	public void setVoyageNumber(String voyageNumber) {
		_voyageNumber = voyageNumber;

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setVoyageNumber", String.class);

				method.invoke(_tempGeneralDeclarationRemoteModel, voyageNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPortOfArrivalCode() {
		return _portOfArrivalCode;
	}

	@Override
	public void setPortOfArrivalCode(String portOfArrivalCode) {
		_portOfArrivalCode = portOfArrivalCode;

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setPortOfArrivalCode",
						String.class);

				method.invoke(_tempGeneralDeclarationRemoteModel,
					portOfArrivalCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDateOfArrival() {
		return _dateOfArrival;
	}

	@Override
	public void setDateOfArrival(Date dateOfArrival) {
		_dateOfArrival = dateOfArrival;

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setDateOfArrival", Date.class);

				method.invoke(_tempGeneralDeclarationRemoteModel, dateOfArrival);
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

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setPortHarbourCode",
						String.class);

				method.invoke(_tempGeneralDeclarationRemoteModel,
					portHarbourCode);
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

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setPortRegionCode",
						String.class);

				method.invoke(_tempGeneralDeclarationRemoteModel, portRegionCode);
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

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setPortWharfCode", String.class);

				method.invoke(_tempGeneralDeclarationRemoteModel, portWharfCode);
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

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setFlagStateOfShip",
						String.class);

				method.invoke(_tempGeneralDeclarationRemoteModel,
					flagStateOfShip);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNameOfMaster() {
		return _nameOfMaster;
	}

	@Override
	public void setNameOfMaster(String nameOfMaster) {
		_nameOfMaster = nameOfMaster;

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setNameOfMaster", String.class);

				method.invoke(_tempGeneralDeclarationRemoteModel, nameOfMaster);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLastPortOfCallCode() {
		return _lastPortOfCallCode;
	}

	@Override
	public void setLastPortOfCallCode(String lastPortOfCallCode) {
		_lastPortOfCallCode = lastPortOfCallCode;

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setLastPortOfCallCode",
						String.class);

				method.invoke(_tempGeneralDeclarationRemoteModel,
					lastPortOfCallCode);
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

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setCertificateOfRegistryNumber",
						String.class);

				method.invoke(_tempGeneralDeclarationRemoteModel,
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

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setCertificateOfRegistryDate",
						Date.class);

				method.invoke(_tempGeneralDeclarationRemoteModel,
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

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setCertificateOfRegistryPortName",
						String.class);

				method.invoke(_tempGeneralDeclarationRemoteModel,
					certificateOfRegistryPortName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTaxCodeOfShipownersAgents() {
		return _taxCodeOfShipownersAgents;
	}

	@Override
	public void setTaxCodeOfShipownersAgents(String taxCodeOfShipownersAgents) {
		_taxCodeOfShipownersAgents = taxCodeOfShipownersAgents;

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setTaxCodeOfShipownersAgents",
						String.class);

				method.invoke(_tempGeneralDeclarationRemoteModel,
					taxCodeOfShipownersAgents);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNameOfShipownersAgents() {
		return _nameOfShipownersAgents;
	}

	@Override
	public void setNameOfShipownersAgents(String nameOfShipownersAgents) {
		_nameOfShipownersAgents = nameOfShipownersAgents;

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setNameOfShipownersAgents",
						String.class);

				method.invoke(_tempGeneralDeclarationRemoteModel,
					nameOfShipownersAgents);
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

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setShipAgencyAddress",
						String.class);

				method.invoke(_tempGeneralDeclarationRemoteModel,
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

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setShipAgencyPhone",
						String.class);

				method.invoke(_tempGeneralDeclarationRemoteModel,
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

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setShipAgencyFax", String.class);

				method.invoke(_tempGeneralDeclarationRemoteModel, shipAgencyFax);
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

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setShipAgencyEmail",
						String.class);

				method.invoke(_tempGeneralDeclarationRemoteModel,
					shipAgencyEmail);
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

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setGrossTonnage", double.class);

				method.invoke(_tempGeneralDeclarationRemoteModel, grossTonnage);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getNetTonnage() {
		return _netTonnage;
	}

	@Override
	public void setNetTonnage(double netTonnage) {
		_netTonnage = netTonnage;

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setNetTonnage", double.class);

				method.invoke(_tempGeneralDeclarationRemoteModel, netTonnage);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPositionOfShipInport() {
		return _positionOfShipInport;
	}

	@Override
	public void setPositionOfShipInport(String positionOfShipInport) {
		_positionOfShipInport = positionOfShipInport;

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setPositionOfShipInport",
						String.class);

				method.invoke(_tempGeneralDeclarationRemoteModel,
					positionOfShipInport);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBriefParticularsOfVoyage() {
		return _briefParticularsOfVoyage;
	}

	@Override
	public void setBriefParticularsOfVoyage(String briefParticularsOfVoyage) {
		_briefParticularsOfVoyage = briefParticularsOfVoyage;

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setBriefParticularsOfVoyage",
						String.class);

				method.invoke(_tempGeneralDeclarationRemoteModel,
					briefParticularsOfVoyage);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBriefDescriptionOfTheCargo() {
		return _briefDescriptionOfTheCargo;
	}

	@Override
	public void setBriefDescriptionOfTheCargo(String briefDescriptionOfTheCargo) {
		_briefDescriptionOfTheCargo = briefDescriptionOfTheCargo;

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setBriefDescriptionOfTheCargo",
						String.class);

				method.invoke(_tempGeneralDeclarationRemoteModel,
					briefDescriptionOfTheCargo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNumberOfCrew() {
		return _numberOfCrew;
	}

	@Override
	public void setNumberOfCrew(int numberOfCrew) {
		_numberOfCrew = numberOfCrew;

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setNumberOfCrew", int.class);

				method.invoke(_tempGeneralDeclarationRemoteModel, numberOfCrew);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNumberOfPassengers() {
		return _numberOfPassengers;
	}

	@Override
	public void setNumberOfPassengers(int numberOfPassengers) {
		_numberOfPassengers = numberOfPassengers;

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setNumberOfPassengers",
						int.class);

				method.invoke(_tempGeneralDeclarationRemoteModel,
					numberOfPassengers);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getShipRequirementsInTermsOfWaste() {
		return _shipRequirementsInTermsOfWaste;
	}

	@Override
	public void setShipRequirementsInTermsOfWaste(
		String shipRequirementsInTermsOfWaste) {
		_shipRequirementsInTermsOfWaste = shipRequirementsInTermsOfWaste;

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setShipRequirementsInTermsOfWaste",
						String.class);

				method.invoke(_tempGeneralDeclarationRemoteModel,
					shipRequirementsInTermsOfWaste);
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

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setRemarks", String.class);

				method.invoke(_tempGeneralDeclarationRemoteModel, remarks);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNumberCargoDeclaration() {
		return _numberCargoDeclaration;
	}

	@Override
	public void setNumberCargoDeclaration(String numberCargoDeclaration) {
		_numberCargoDeclaration = numberCargoDeclaration;

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setNumberCargoDeclaration",
						String.class);

				method.invoke(_tempGeneralDeclarationRemoteModel,
					numberCargoDeclaration);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNumberShipStoreDeclaration() {
		return _numberShipStoreDeclaration;
	}

	@Override
	public void setNumberShipStoreDeclaration(String numberShipStoreDeclaration) {
		_numberShipStoreDeclaration = numberShipStoreDeclaration;

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setNumberShipStoreDeclaration",
						String.class);

				method.invoke(_tempGeneralDeclarationRemoteModel,
					numberShipStoreDeclaration);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNumberCrewList() {
		return _numberCrewList;
	}

	@Override
	public void setNumberCrewList(String numberCrewList) {
		_numberCrewList = numberCrewList;

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setNumberCrewList",
						String.class);

				method.invoke(_tempGeneralDeclarationRemoteModel, numberCrewList);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNumberPassengerList() {
		return _numberPassengerList;
	}

	@Override
	public void setNumberPassengerList(String numberPassengerList) {
		_numberPassengerList = numberPassengerList;

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setNumberPassengerList",
						String.class);

				method.invoke(_tempGeneralDeclarationRemoteModel,
					numberPassengerList);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNumberCrewEffects() {
		return _numberCrewEffects;
	}

	@Override
	public void setNumberCrewEffects(String numberCrewEffects) {
		_numberCrewEffects = numberCrewEffects;

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setNumberCrewEffects",
						String.class);

				method.invoke(_tempGeneralDeclarationRemoteModel,
					numberCrewEffects);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNumberHealthMaritime() {
		return _numberHealthMaritime;
	}

	@Override
	public void setNumberHealthMaritime(String numberHealthMaritime) {
		_numberHealthMaritime = numberHealthMaritime;

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setNumberHealthMaritime",
						String.class);

				method.invoke(_tempGeneralDeclarationRemoteModel,
					numberHealthMaritime);
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

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setSignPlace", String.class);

				method.invoke(_tempGeneralDeclarationRemoteModel, signPlace);
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

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setSignDate", Date.class);

				method.invoke(_tempGeneralDeclarationRemoteModel, signDate);
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

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setMasterSigned", int.class);

				method.invoke(_tempGeneralDeclarationRemoteModel, masterSigned);
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

		if (_tempGeneralDeclarationRemoteModel != null) {
			try {
				Class<?> clazz = _tempGeneralDeclarationRemoteModel.getClass();

				Method method = clazz.getMethod("setMasterSignedImage",
						int.class);

				method.invoke(_tempGeneralDeclarationRemoteModel,
					masterSignedImage);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTempGeneralDeclarationRemoteModel() {
		return _tempGeneralDeclarationRemoteModel;
	}

	public void setTempGeneralDeclarationRemoteModel(
		BaseModel<?> tempGeneralDeclarationRemoteModel) {
		_tempGeneralDeclarationRemoteModel = tempGeneralDeclarationRemoteModel;
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

		Class<?> remoteModelClass = _tempGeneralDeclarationRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tempGeneralDeclarationRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TempGeneralDeclarationLocalServiceUtil.addTempGeneralDeclaration(this);
		}
		else {
			TempGeneralDeclarationLocalServiceUtil.updateTempGeneralDeclaration(this);
		}
	}

	@Override
	public TempGeneralDeclaration toEscapedModel() {
		return (TempGeneralDeclaration)ProxyUtil.newProxyInstance(TempGeneralDeclaration.class.getClassLoader(),
			new Class[] { TempGeneralDeclaration.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempGeneralDeclarationClp clone = new TempGeneralDeclarationClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setRequestState(getRequestState());
		clone.setDocumentName(getDocumentName());
		clone.setDocumentYear(getDocumentYear());
		clone.setUserCreated(getUserCreated());
		clone.setIsArrival(getIsArrival());
		clone.setNameOfShip(getNameOfShip());
		clone.setShipTypeCode(getShipTypeCode());
		clone.setImoNumber(getImoNumber());
		clone.setCallSign(getCallSign());
		clone.setVoyageNumber(getVoyageNumber());
		clone.setPortOfArrivalCode(getPortOfArrivalCode());
		clone.setDateOfArrival(getDateOfArrival());
		clone.setPortHarbourCode(getPortHarbourCode());
		clone.setPortRegionCode(getPortRegionCode());
		clone.setPortWharfCode(getPortWharfCode());
		clone.setFlagStateOfShip(getFlagStateOfShip());
		clone.setNameOfMaster(getNameOfMaster());
		clone.setLastPortOfCallCode(getLastPortOfCallCode());
		clone.setCertificateOfRegistryNumber(getCertificateOfRegistryNumber());
		clone.setCertificateOfRegistryDate(getCertificateOfRegistryDate());
		clone.setCertificateOfRegistryPortName(getCertificateOfRegistryPortName());
		clone.setTaxCodeOfShipownersAgents(getTaxCodeOfShipownersAgents());
		clone.setNameOfShipownersAgents(getNameOfShipownersAgents());
		clone.setShipAgencyAddress(getShipAgencyAddress());
		clone.setShipAgencyPhone(getShipAgencyPhone());
		clone.setShipAgencyFax(getShipAgencyFax());
		clone.setShipAgencyEmail(getShipAgencyEmail());
		clone.setGrossTonnage(getGrossTonnage());
		clone.setNetTonnage(getNetTonnage());
		clone.setPositionOfShipInport(getPositionOfShipInport());
		clone.setBriefParticularsOfVoyage(getBriefParticularsOfVoyage());
		clone.setBriefDescriptionOfTheCargo(getBriefDescriptionOfTheCargo());
		clone.setNumberOfCrew(getNumberOfCrew());
		clone.setNumberOfPassengers(getNumberOfPassengers());
		clone.setShipRequirementsInTermsOfWaste(getShipRequirementsInTermsOfWaste());
		clone.setRemarks(getRemarks());
		clone.setNumberCargoDeclaration(getNumberCargoDeclaration());
		clone.setNumberShipStoreDeclaration(getNumberShipStoreDeclaration());
		clone.setNumberCrewList(getNumberCrewList());
		clone.setNumberPassengerList(getNumberPassengerList());
		clone.setNumberCrewEffects(getNumberCrewEffects());
		clone.setNumberHealthMaritime(getNumberHealthMaritime());
		clone.setSignPlace(getSignPlace());
		clone.setSignDate(getSignDate());
		clone.setMasterSigned(getMasterSigned());
		clone.setMasterSignedImage(getMasterSignedImage());

		return clone;
	}

	@Override
	public int compareTo(TempGeneralDeclaration tempGeneralDeclaration) {
		int value = 0;

		if (getId() < tempGeneralDeclaration.getId()) {
			value = -1;
		}
		else if (getId() > tempGeneralDeclaration.getId()) {
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

		if (!(obj instanceof TempGeneralDeclarationClp)) {
			return false;
		}

		TempGeneralDeclarationClp tempGeneralDeclaration = (TempGeneralDeclarationClp)obj;

		long primaryKey = tempGeneralDeclaration.getPrimaryKey();

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
		StringBundler sb = new StringBundler(97);

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
		sb.append(", isArrival=");
		sb.append(getIsArrival());
		sb.append(", nameOfShip=");
		sb.append(getNameOfShip());
		sb.append(", shipTypeCode=");
		sb.append(getShipTypeCode());
		sb.append(", imoNumber=");
		sb.append(getImoNumber());
		sb.append(", callSign=");
		sb.append(getCallSign());
		sb.append(", voyageNumber=");
		sb.append(getVoyageNumber());
		sb.append(", portOfArrivalCode=");
		sb.append(getPortOfArrivalCode());
		sb.append(", dateOfArrival=");
		sb.append(getDateOfArrival());
		sb.append(", portHarbourCode=");
		sb.append(getPortHarbourCode());
		sb.append(", portRegionCode=");
		sb.append(getPortRegionCode());
		sb.append(", portWharfCode=");
		sb.append(getPortWharfCode());
		sb.append(", flagStateOfShip=");
		sb.append(getFlagStateOfShip());
		sb.append(", nameOfMaster=");
		sb.append(getNameOfMaster());
		sb.append(", lastPortOfCallCode=");
		sb.append(getLastPortOfCallCode());
		sb.append(", certificateOfRegistryNumber=");
		sb.append(getCertificateOfRegistryNumber());
		sb.append(", certificateOfRegistryDate=");
		sb.append(getCertificateOfRegistryDate());
		sb.append(", certificateOfRegistryPortName=");
		sb.append(getCertificateOfRegistryPortName());
		sb.append(", taxCodeOfShipownersAgents=");
		sb.append(getTaxCodeOfShipownersAgents());
		sb.append(", nameOfShipownersAgents=");
		sb.append(getNameOfShipownersAgents());
		sb.append(", shipAgencyAddress=");
		sb.append(getShipAgencyAddress());
		sb.append(", shipAgencyPhone=");
		sb.append(getShipAgencyPhone());
		sb.append(", shipAgencyFax=");
		sb.append(getShipAgencyFax());
		sb.append(", shipAgencyEmail=");
		sb.append(getShipAgencyEmail());
		sb.append(", grossTonnage=");
		sb.append(getGrossTonnage());
		sb.append(", netTonnage=");
		sb.append(getNetTonnage());
		sb.append(", positionOfShipInport=");
		sb.append(getPositionOfShipInport());
		sb.append(", briefParticularsOfVoyage=");
		sb.append(getBriefParticularsOfVoyage());
		sb.append(", briefDescriptionOfTheCargo=");
		sb.append(getBriefDescriptionOfTheCargo());
		sb.append(", numberOfCrew=");
		sb.append(getNumberOfCrew());
		sb.append(", numberOfPassengers=");
		sb.append(getNumberOfPassengers());
		sb.append(", shipRequirementsInTermsOfWaste=");
		sb.append(getShipRequirementsInTermsOfWaste());
		sb.append(", remarks=");
		sb.append(getRemarks());
		sb.append(", numberCargoDeclaration=");
		sb.append(getNumberCargoDeclaration());
		sb.append(", numberShipStoreDeclaration=");
		sb.append(getNumberShipStoreDeclaration());
		sb.append(", numberCrewList=");
		sb.append(getNumberCrewList());
		sb.append(", numberPassengerList=");
		sb.append(getNumberPassengerList());
		sb.append(", numberCrewEffects=");
		sb.append(getNumberCrewEffects());
		sb.append(", numberHealthMaritime=");
		sb.append(getNumberHealthMaritime());
		sb.append(", signPlace=");
		sb.append(getSignPlace());
		sb.append(", signDate=");
		sb.append(getSignDate());
		sb.append(", masterSigned=");
		sb.append(getMasterSigned());
		sb.append(", masterSignedImage=");
		sb.append(getMasterSignedImage());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(148);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.TempGeneralDeclaration");
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
			"<column><column-name>isArrival</column-name><column-value><![CDATA[");
		sb.append(getIsArrival());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameOfShip</column-name><column-value><![CDATA[");
		sb.append(getNameOfShip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipTypeCode</column-name><column-value><![CDATA[");
		sb.append(getShipTypeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>imoNumber</column-name><column-value><![CDATA[");
		sb.append(getImoNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>callSign</column-name><column-value><![CDATA[");
		sb.append(getCallSign());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>voyageNumber</column-name><column-value><![CDATA[");
		sb.append(getVoyageNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portOfArrivalCode</column-name><column-value><![CDATA[");
		sb.append(getPortOfArrivalCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateOfArrival</column-name><column-value><![CDATA[");
		sb.append(getDateOfArrival());
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
			"<column><column-name>flagStateOfShip</column-name><column-value><![CDATA[");
		sb.append(getFlagStateOfShip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameOfMaster</column-name><column-value><![CDATA[");
		sb.append(getNameOfMaster());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lastPortOfCallCode</column-name><column-value><![CDATA[");
		sb.append(getLastPortOfCallCode());
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
			"<column><column-name>taxCodeOfShipownersAgents</column-name><column-value><![CDATA[");
		sb.append(getTaxCodeOfShipownersAgents());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameOfShipownersAgents</column-name><column-value><![CDATA[");
		sb.append(getNameOfShipownersAgents());
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
			"<column><column-name>grossTonnage</column-name><column-value><![CDATA[");
		sb.append(getGrossTonnage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>netTonnage</column-name><column-value><![CDATA[");
		sb.append(getNetTonnage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>positionOfShipInport</column-name><column-value><![CDATA[");
		sb.append(getPositionOfShipInport());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>briefParticularsOfVoyage</column-name><column-value><![CDATA[");
		sb.append(getBriefParticularsOfVoyage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>briefDescriptionOfTheCargo</column-name><column-value><![CDATA[");
		sb.append(getBriefDescriptionOfTheCargo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>numberOfCrew</column-name><column-value><![CDATA[");
		sb.append(getNumberOfCrew());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>numberOfPassengers</column-name><column-value><![CDATA[");
		sb.append(getNumberOfPassengers());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipRequirementsInTermsOfWaste</column-name><column-value><![CDATA[");
		sb.append(getShipRequirementsInTermsOfWaste());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remarks</column-name><column-value><![CDATA[");
		sb.append(getRemarks());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>numberCargoDeclaration</column-name><column-value><![CDATA[");
		sb.append(getNumberCargoDeclaration());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>numberShipStoreDeclaration</column-name><column-value><![CDATA[");
		sb.append(getNumberShipStoreDeclaration());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>numberCrewList</column-name><column-value><![CDATA[");
		sb.append(getNumberCrewList());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>numberPassengerList</column-name><column-value><![CDATA[");
		sb.append(getNumberPassengerList());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>numberCrewEffects</column-name><column-value><![CDATA[");
		sb.append(getNumberCrewEffects());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>numberHealthMaritime</column-name><column-value><![CDATA[");
		sb.append(getNumberHealthMaritime());
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

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private int _requestState;
	private long _documentName;
	private int _documentYear;
	private String _userCreated;
	private int _isArrival;
	private String _nameOfShip;
	private String _shipTypeCode;
	private String _imoNumber;
	private String _callSign;
	private String _voyageNumber;
	private String _portOfArrivalCode;
	private Date _dateOfArrival;
	private String _portHarbourCode;
	private String _portRegionCode;
	private String _portWharfCode;
	private String _flagStateOfShip;
	private String _nameOfMaster;
	private String _lastPortOfCallCode;
	private String _certificateOfRegistryNumber;
	private Date _certificateOfRegistryDate;
	private String _certificateOfRegistryPortName;
	private String _taxCodeOfShipownersAgents;
	private String _nameOfShipownersAgents;
	private String _shipAgencyAddress;
	private String _shipAgencyPhone;
	private String _shipAgencyFax;
	private String _shipAgencyEmail;
	private double _grossTonnage;
	private double _netTonnage;
	private String _positionOfShipInport;
	private String _briefParticularsOfVoyage;
	private String _briefDescriptionOfTheCargo;
	private int _numberOfCrew;
	private int _numberOfPassengers;
	private String _shipRequirementsInTermsOfWaste;
	private String _remarks;
	private String _numberCargoDeclaration;
	private String _numberShipStoreDeclaration;
	private String _numberCrewList;
	private String _numberPassengerList;
	private String _numberCrewEffects;
	private String _numberHealthMaritime;
	private String _signPlace;
	private Date _signDate;
	private int _masterSigned;
	private int _masterSignedImage;
	private BaseModel<?> _tempGeneralDeclarationRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.class;
}