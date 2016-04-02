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
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbien.dao.vrcb.service.ClpSerializer;
import vn.dtt.duongbien.dao.vrcb.service.DocumentGeneralLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class DocumentGeneralClp extends BaseModelImpl<DocumentGeneral>
	implements DocumentGeneral {
	public DocumentGeneralClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DocumentGeneral.class;
	}

	@Override
	public String getModelClassName() {
		return DocumentGeneral.class.getName();
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
		attributes.put("documentNo", getDocumentNo());
		attributes.put("documentFunction", getDocumentFunction());
		attributes.put("isArrival", getIsArrival());
		attributes.put("isDeparture", getIsDeparture());
		attributes.put("shipCode", getShipCode());
		attributes.put("arrivalOrDeparturePortCode",
			getArrivalOrDeparturePortCode());
		attributes.put("timeArrivalOrDeparture", getTimeArrivalOrDeparture());
		attributes.put("imoNumber", getImoNumber());
		attributes.put("callSign", getCallSign());
		attributes.put("voyageNumber", getVoyageNumber());
		attributes.put("shipNationCode", getShipNationCode());
		attributes.put("nameOfMaster", getNameOfMaster());
		attributes.put("lastPort", getLastPort());
		attributes.put("contactDetailShipAgent", getContactDetailShipAgent());
		attributes.put("grossTonnage", getGrossTonnage());
		attributes.put("netTonnage", getNetTonnage());
		attributes.put("positionShipInPort", getPositionShipInPort());
		attributes.put("briefParticularsVoyage", getBriefParticularsVoyage());
		attributes.put("briefDescriptionCargo", getBriefDescriptionCargo());
		attributes.put("crewNumber", getCrewNumber());
		attributes.put("passengerNumber", getPassengerNumber());
		attributes.put("remarks", getRemarks());
		attributes.put("cargoDeclaration", getCargoDeclaration());
		attributes.put("shipStoresDeclaration", getShipStoresDeclaration());
		attributes.put("crewList", getCrewList());
		attributes.put("passengerList", getPassengerList());
		attributes.put("shipRequirements", getShipRequirements());
		attributes.put("isCrewEffectDeclaration", getIsCrewEffectDeclaration());
		attributes.put("isMaritimeDeclarationHealth",
			getIsMaritimeDeclarationHealth());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifyDate", getModifyDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String documentNo = (String)attributes.get("documentNo");

		if (documentNo != null) {
			setDocumentNo(documentNo);
		}

		String documentFunction = (String)attributes.get("documentFunction");

		if (documentFunction != null) {
			setDocumentFunction(documentFunction);
		}

		Integer isArrival = (Integer)attributes.get("isArrival");

		if (isArrival != null) {
			setIsArrival(isArrival);
		}

		Integer isDeparture = (Integer)attributes.get("isDeparture");

		if (isDeparture != null) {
			setIsDeparture(isDeparture);
		}

		String shipCode = (String)attributes.get("shipCode");

		if (shipCode != null) {
			setShipCode(shipCode);
		}

		String arrivalOrDeparturePortCode = (String)attributes.get(
				"arrivalOrDeparturePortCode");

		if (arrivalOrDeparturePortCode != null) {
			setArrivalOrDeparturePortCode(arrivalOrDeparturePortCode);
		}

		Date timeArrivalOrDeparture = (Date)attributes.get(
				"timeArrivalOrDeparture");

		if (timeArrivalOrDeparture != null) {
			setTimeArrivalOrDeparture(timeArrivalOrDeparture);
		}

		String imoNumber = (String)attributes.get("imoNumber");

		if (imoNumber != null) {
			setImoNumber(imoNumber);
		}

		String callSign = (String)attributes.get("callSign");

		if (callSign != null) {
			setCallSign(callSign);
		}

		Integer voyageNumber = (Integer)attributes.get("voyageNumber");

		if (voyageNumber != null) {
			setVoyageNumber(voyageNumber);
		}

		String shipNationCode = (String)attributes.get("shipNationCode");

		if (shipNationCode != null) {
			setShipNationCode(shipNationCode);
		}

		String nameOfMaster = (String)attributes.get("nameOfMaster");

		if (nameOfMaster != null) {
			setNameOfMaster(nameOfMaster);
		}

		String lastPort = (String)attributes.get("lastPort");

		if (lastPort != null) {
			setLastPort(lastPort);
		}

		String contactDetailShipAgent = (String)attributes.get(
				"contactDetailShipAgent");

		if (contactDetailShipAgent != null) {
			setContactDetailShipAgent(contactDetailShipAgent);
		}

		Double grossTonnage = (Double)attributes.get("grossTonnage");

		if (grossTonnage != null) {
			setGrossTonnage(grossTonnage);
		}

		Double netTonnage = (Double)attributes.get("netTonnage");

		if (netTonnage != null) {
			setNetTonnage(netTonnage);
		}

		Integer positionShipInPort = (Integer)attributes.get(
				"positionShipInPort");

		if (positionShipInPort != null) {
			setPositionShipInPort(positionShipInPort);
		}

		String briefParticularsVoyage = (String)attributes.get(
				"briefParticularsVoyage");

		if (briefParticularsVoyage != null) {
			setBriefParticularsVoyage(briefParticularsVoyage);
		}

		String briefDescriptionCargo = (String)attributes.get(
				"briefDescriptionCargo");

		if (briefDescriptionCargo != null) {
			setBriefDescriptionCargo(briefDescriptionCargo);
		}

		Integer crewNumber = (Integer)attributes.get("crewNumber");

		if (crewNumber != null) {
			setCrewNumber(crewNumber);
		}

		Integer passengerNumber = (Integer)attributes.get("passengerNumber");

		if (passengerNumber != null) {
			setPassengerNumber(passengerNumber);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		String cargoDeclaration = (String)attributes.get("cargoDeclaration");

		if (cargoDeclaration != null) {
			setCargoDeclaration(cargoDeclaration);
		}

		String shipStoresDeclaration = (String)attributes.get(
				"shipStoresDeclaration");

		if (shipStoresDeclaration != null) {
			setShipStoresDeclaration(shipStoresDeclaration);
		}

		String crewList = (String)attributes.get("crewList");

		if (crewList != null) {
			setCrewList(crewList);
		}

		String passengerList = (String)attributes.get("passengerList");

		if (passengerList != null) {
			setPassengerList(passengerList);
		}

		String shipRequirements = (String)attributes.get("shipRequirements");

		if (shipRequirements != null) {
			setShipRequirements(shipRequirements);
		}

		Integer isCrewEffectDeclaration = (Integer)attributes.get(
				"isCrewEffectDeclaration");

		if (isCrewEffectDeclaration != null) {
			setIsCrewEffectDeclaration(isCrewEffectDeclaration);
		}

		Integer isMaritimeDeclarationHealth = (Integer)attributes.get(
				"isMaritimeDeclarationHealth");

		if (isMaritimeDeclarationHealth != null) {
			setIsMaritimeDeclarationHealth(isMaritimeDeclarationHealth);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifyDate = (Date)attributes.get("modifyDate");

		if (modifyDate != null) {
			setModifyDate(modifyDate);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_documentGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _documentGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_documentGeneralRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDocumentNo() {
		return _documentNo;
	}

	@Override
	public void setDocumentNo(String documentNo) {
		_documentNo = documentNo;

		if (_documentGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _documentGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentNo", String.class);

				method.invoke(_documentGeneralRemoteModel, documentNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDocumentFunction() {
		return _documentFunction;
	}

	@Override
	public void setDocumentFunction(String documentFunction) {
		_documentFunction = documentFunction;

		if (_documentGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _documentGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentFunction",
						String.class);

				method.invoke(_documentGeneralRemoteModel, documentFunction);
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

		if (_documentGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _documentGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setIsArrival", int.class);

				method.invoke(_documentGeneralRemoteModel, isArrival);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIsDeparture() {
		return _isDeparture;
	}

	@Override
	public void setIsDeparture(int isDeparture) {
		_isDeparture = isDeparture;

		if (_documentGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _documentGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setIsDeparture", int.class);

				method.invoke(_documentGeneralRemoteModel, isDeparture);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getShipCode() {
		return _shipCode;
	}

	@Override
	public void setShipCode(String shipCode) {
		_shipCode = shipCode;

		if (_documentGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _documentGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setShipCode", String.class);

				method.invoke(_documentGeneralRemoteModel, shipCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getArrivalOrDeparturePortCode() {
		return _arrivalOrDeparturePortCode;
	}

	@Override
	public void setArrivalOrDeparturePortCode(String arrivalOrDeparturePortCode) {
		_arrivalOrDeparturePortCode = arrivalOrDeparturePortCode;

		if (_documentGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _documentGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setArrivalOrDeparturePortCode",
						String.class);

				method.invoke(_documentGeneralRemoteModel,
					arrivalOrDeparturePortCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getTimeArrivalOrDeparture() {
		return _timeArrivalOrDeparture;
	}

	@Override
	public void setTimeArrivalOrDeparture(Date timeArrivalOrDeparture) {
		_timeArrivalOrDeparture = timeArrivalOrDeparture;

		if (_documentGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _documentGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setTimeArrivalOrDeparture",
						Date.class);

				method.invoke(_documentGeneralRemoteModel,
					timeArrivalOrDeparture);
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

		if (_documentGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _documentGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setImoNumber", String.class);

				method.invoke(_documentGeneralRemoteModel, imoNumber);
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

		if (_documentGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _documentGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setCallSign", String.class);

				method.invoke(_documentGeneralRemoteModel, callSign);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getVoyageNumber() {
		return _voyageNumber;
	}

	@Override
	public void setVoyageNumber(int voyageNumber) {
		_voyageNumber = voyageNumber;

		if (_documentGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _documentGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setVoyageNumber", int.class);

				method.invoke(_documentGeneralRemoteModel, voyageNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getShipNationCode() {
		return _shipNationCode;
	}

	@Override
	public void setShipNationCode(String shipNationCode) {
		_shipNationCode = shipNationCode;

		if (_documentGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _documentGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setShipNationCode",
						String.class);

				method.invoke(_documentGeneralRemoteModel, shipNationCode);
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

		if (_documentGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _documentGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setNameOfMaster", String.class);

				method.invoke(_documentGeneralRemoteModel, nameOfMaster);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLastPort() {
		return _lastPort;
	}

	@Override
	public void setLastPort(String lastPort) {
		_lastPort = lastPort;

		if (_documentGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _documentGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setLastPort", String.class);

				method.invoke(_documentGeneralRemoteModel, lastPort);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getContactDetailShipAgent() {
		return _contactDetailShipAgent;
	}

	@Override
	public void setContactDetailShipAgent(String contactDetailShipAgent) {
		_contactDetailShipAgent = contactDetailShipAgent;

		if (_documentGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _documentGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setContactDetailShipAgent",
						String.class);

				method.invoke(_documentGeneralRemoteModel,
					contactDetailShipAgent);
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

		if (_documentGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _documentGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setGrossTonnage", double.class);

				method.invoke(_documentGeneralRemoteModel, grossTonnage);
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

		if (_documentGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _documentGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setNetTonnage", double.class);

				method.invoke(_documentGeneralRemoteModel, netTonnage);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPositionShipInPort() {
		return _positionShipInPort;
	}

	@Override
	public void setPositionShipInPort(int positionShipInPort) {
		_positionShipInPort = positionShipInPort;

		if (_documentGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _documentGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setPositionShipInPort",
						int.class);

				method.invoke(_documentGeneralRemoteModel, positionShipInPort);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBriefParticularsVoyage() {
		return _briefParticularsVoyage;
	}

	@Override
	public void setBriefParticularsVoyage(String briefParticularsVoyage) {
		_briefParticularsVoyage = briefParticularsVoyage;

		if (_documentGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _documentGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setBriefParticularsVoyage",
						String.class);

				method.invoke(_documentGeneralRemoteModel,
					briefParticularsVoyage);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBriefDescriptionCargo() {
		return _briefDescriptionCargo;
	}

	@Override
	public void setBriefDescriptionCargo(String briefDescriptionCargo) {
		_briefDescriptionCargo = briefDescriptionCargo;

		if (_documentGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _documentGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setBriefDescriptionCargo",
						String.class);

				method.invoke(_documentGeneralRemoteModel, briefDescriptionCargo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCrewNumber() {
		return _crewNumber;
	}

	@Override
	public void setCrewNumber(int crewNumber) {
		_crewNumber = crewNumber;

		if (_documentGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _documentGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setCrewNumber", int.class);

				method.invoke(_documentGeneralRemoteModel, crewNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPassengerNumber() {
		return _passengerNumber;
	}

	@Override
	public void setPassengerNumber(int passengerNumber) {
		_passengerNumber = passengerNumber;

		if (_documentGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _documentGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setPassengerNumber", int.class);

				method.invoke(_documentGeneralRemoteModel, passengerNumber);
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

		if (_documentGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _documentGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setRemarks", String.class);

				method.invoke(_documentGeneralRemoteModel, remarks);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCargoDeclaration() {
		return _cargoDeclaration;
	}

	@Override
	public void setCargoDeclaration(String cargoDeclaration) {
		_cargoDeclaration = cargoDeclaration;

		if (_documentGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _documentGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setCargoDeclaration",
						String.class);

				method.invoke(_documentGeneralRemoteModel, cargoDeclaration);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getShipStoresDeclaration() {
		return _shipStoresDeclaration;
	}

	@Override
	public void setShipStoresDeclaration(String shipStoresDeclaration) {
		_shipStoresDeclaration = shipStoresDeclaration;

		if (_documentGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _documentGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setShipStoresDeclaration",
						String.class);

				method.invoke(_documentGeneralRemoteModel, shipStoresDeclaration);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCrewList() {
		return _crewList;
	}

	@Override
	public void setCrewList(String crewList) {
		_crewList = crewList;

		if (_documentGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _documentGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setCrewList", String.class);

				method.invoke(_documentGeneralRemoteModel, crewList);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPassengerList() {
		return _passengerList;
	}

	@Override
	public void setPassengerList(String passengerList) {
		_passengerList = passengerList;

		if (_documentGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _documentGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setPassengerList", String.class);

				method.invoke(_documentGeneralRemoteModel, passengerList);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getShipRequirements() {
		return _shipRequirements;
	}

	@Override
	public void setShipRequirements(String shipRequirements) {
		_shipRequirements = shipRequirements;

		if (_documentGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _documentGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setShipRequirements",
						String.class);

				method.invoke(_documentGeneralRemoteModel, shipRequirements);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIsCrewEffectDeclaration() {
		return _isCrewEffectDeclaration;
	}

	@Override
	public void setIsCrewEffectDeclaration(int isCrewEffectDeclaration) {
		_isCrewEffectDeclaration = isCrewEffectDeclaration;

		if (_documentGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _documentGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setIsCrewEffectDeclaration",
						int.class);

				method.invoke(_documentGeneralRemoteModel,
					isCrewEffectDeclaration);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIsMaritimeDeclarationHealth() {
		return _isMaritimeDeclarationHealth;
	}

	@Override
	public void setIsMaritimeDeclarationHealth(int isMaritimeDeclarationHealth) {
		_isMaritimeDeclarationHealth = isMaritimeDeclarationHealth;

		if (_documentGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _documentGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setIsMaritimeDeclarationHealth",
						int.class);

				method.invoke(_documentGeneralRemoteModel,
					isMaritimeDeclarationHealth);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_documentGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _documentGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_documentGeneralRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifyDate() {
		return _modifyDate;
	}

	@Override
	public void setModifyDate(Date modifyDate) {
		_modifyDate = modifyDate;

		if (_documentGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _documentGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setModifyDate", Date.class);

				method.invoke(_documentGeneralRemoteModel, modifyDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDocumentGeneralRemoteModel() {
		return _documentGeneralRemoteModel;
	}

	public void setDocumentGeneralRemoteModel(
		BaseModel<?> documentGeneralRemoteModel) {
		_documentGeneralRemoteModel = documentGeneralRemoteModel;
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

		Class<?> remoteModelClass = _documentGeneralRemoteModel.getClass();

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

		Object returnValue = method.invoke(_documentGeneralRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DocumentGeneralLocalServiceUtil.addDocumentGeneral(this);
		}
		else {
			DocumentGeneralLocalServiceUtil.updateDocumentGeneral(this);
		}
	}

	@Override
	public DocumentGeneral toEscapedModel() {
		return (DocumentGeneral)ProxyUtil.newProxyInstance(DocumentGeneral.class.getClassLoader(),
			new Class[] { DocumentGeneral.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DocumentGeneralClp clone = new DocumentGeneralClp();

		clone.setId(getId());
		clone.setDocumentNo(getDocumentNo());
		clone.setDocumentFunction(getDocumentFunction());
		clone.setIsArrival(getIsArrival());
		clone.setIsDeparture(getIsDeparture());
		clone.setShipCode(getShipCode());
		clone.setArrivalOrDeparturePortCode(getArrivalOrDeparturePortCode());
		clone.setTimeArrivalOrDeparture(getTimeArrivalOrDeparture());
		clone.setImoNumber(getImoNumber());
		clone.setCallSign(getCallSign());
		clone.setVoyageNumber(getVoyageNumber());
		clone.setShipNationCode(getShipNationCode());
		clone.setNameOfMaster(getNameOfMaster());
		clone.setLastPort(getLastPort());
		clone.setContactDetailShipAgent(getContactDetailShipAgent());
		clone.setGrossTonnage(getGrossTonnage());
		clone.setNetTonnage(getNetTonnage());
		clone.setPositionShipInPort(getPositionShipInPort());
		clone.setBriefParticularsVoyage(getBriefParticularsVoyage());
		clone.setBriefDescriptionCargo(getBriefDescriptionCargo());
		clone.setCrewNumber(getCrewNumber());
		clone.setPassengerNumber(getPassengerNumber());
		clone.setRemarks(getRemarks());
		clone.setCargoDeclaration(getCargoDeclaration());
		clone.setShipStoresDeclaration(getShipStoresDeclaration());
		clone.setCrewList(getCrewList());
		clone.setPassengerList(getPassengerList());
		clone.setShipRequirements(getShipRequirements());
		clone.setIsCrewEffectDeclaration(getIsCrewEffectDeclaration());
		clone.setIsMaritimeDeclarationHealth(getIsMaritimeDeclarationHealth());
		clone.setCreateDate(getCreateDate());
		clone.setModifyDate(getModifyDate());

		return clone;
	}

	@Override
	public int compareTo(DocumentGeneral documentGeneral) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(),
				documentGeneral.getCreateDate());

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

		if (!(obj instanceof DocumentGeneralClp)) {
			return false;
		}

		DocumentGeneralClp documentGeneral = (DocumentGeneralClp)obj;

		long primaryKey = documentGeneral.getPrimaryKey();

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
		StringBundler sb = new StringBundler(65);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", documentNo=");
		sb.append(getDocumentNo());
		sb.append(", documentFunction=");
		sb.append(getDocumentFunction());
		sb.append(", isArrival=");
		sb.append(getIsArrival());
		sb.append(", isDeparture=");
		sb.append(getIsDeparture());
		sb.append(", shipCode=");
		sb.append(getShipCode());
		sb.append(", arrivalOrDeparturePortCode=");
		sb.append(getArrivalOrDeparturePortCode());
		sb.append(", timeArrivalOrDeparture=");
		sb.append(getTimeArrivalOrDeparture());
		sb.append(", imoNumber=");
		sb.append(getImoNumber());
		sb.append(", callSign=");
		sb.append(getCallSign());
		sb.append(", voyageNumber=");
		sb.append(getVoyageNumber());
		sb.append(", shipNationCode=");
		sb.append(getShipNationCode());
		sb.append(", nameOfMaster=");
		sb.append(getNameOfMaster());
		sb.append(", lastPort=");
		sb.append(getLastPort());
		sb.append(", contactDetailShipAgent=");
		sb.append(getContactDetailShipAgent());
		sb.append(", grossTonnage=");
		sb.append(getGrossTonnage());
		sb.append(", netTonnage=");
		sb.append(getNetTonnage());
		sb.append(", positionShipInPort=");
		sb.append(getPositionShipInPort());
		sb.append(", briefParticularsVoyage=");
		sb.append(getBriefParticularsVoyage());
		sb.append(", briefDescriptionCargo=");
		sb.append(getBriefDescriptionCargo());
		sb.append(", crewNumber=");
		sb.append(getCrewNumber());
		sb.append(", passengerNumber=");
		sb.append(getPassengerNumber());
		sb.append(", remarks=");
		sb.append(getRemarks());
		sb.append(", cargoDeclaration=");
		sb.append(getCargoDeclaration());
		sb.append(", shipStoresDeclaration=");
		sb.append(getShipStoresDeclaration());
		sb.append(", crewList=");
		sb.append(getCrewList());
		sb.append(", passengerList=");
		sb.append(getPassengerList());
		sb.append(", shipRequirements=");
		sb.append(getShipRequirements());
		sb.append(", isCrewEffectDeclaration=");
		sb.append(getIsCrewEffectDeclaration());
		sb.append(", isMaritimeDeclarationHealth=");
		sb.append(getIsMaritimeDeclarationHealth());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifyDate=");
		sb.append(getModifyDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(100);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DocumentGeneral");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentNo</column-name><column-value><![CDATA[");
		sb.append(getDocumentNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentFunction</column-name><column-value><![CDATA[");
		sb.append(getDocumentFunction());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isArrival</column-name><column-value><![CDATA[");
		sb.append(getIsArrival());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isDeparture</column-name><column-value><![CDATA[");
		sb.append(getIsDeparture());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipCode</column-name><column-value><![CDATA[");
		sb.append(getShipCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>arrivalOrDeparturePortCode</column-name><column-value><![CDATA[");
		sb.append(getArrivalOrDeparturePortCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>timeArrivalOrDeparture</column-name><column-value><![CDATA[");
		sb.append(getTimeArrivalOrDeparture());
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
			"<column><column-name>shipNationCode</column-name><column-value><![CDATA[");
		sb.append(getShipNationCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameOfMaster</column-name><column-value><![CDATA[");
		sb.append(getNameOfMaster());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lastPort</column-name><column-value><![CDATA[");
		sb.append(getLastPort());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactDetailShipAgent</column-name><column-value><![CDATA[");
		sb.append(getContactDetailShipAgent());
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
			"<column><column-name>positionShipInPort</column-name><column-value><![CDATA[");
		sb.append(getPositionShipInPort());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>briefParticularsVoyage</column-name><column-value><![CDATA[");
		sb.append(getBriefParticularsVoyage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>briefDescriptionCargo</column-name><column-value><![CDATA[");
		sb.append(getBriefDescriptionCargo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>crewNumber</column-name><column-value><![CDATA[");
		sb.append(getCrewNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>passengerNumber</column-name><column-value><![CDATA[");
		sb.append(getPassengerNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remarks</column-name><column-value><![CDATA[");
		sb.append(getRemarks());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cargoDeclaration</column-name><column-value><![CDATA[");
		sb.append(getCargoDeclaration());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipStoresDeclaration</column-name><column-value><![CDATA[");
		sb.append(getShipStoresDeclaration());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>crewList</column-name><column-value><![CDATA[");
		sb.append(getCrewList());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>passengerList</column-name><column-value><![CDATA[");
		sb.append(getPassengerList());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipRequirements</column-name><column-value><![CDATA[");
		sb.append(getShipRequirements());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isCrewEffectDeclaration</column-name><column-value><![CDATA[");
		sb.append(getIsCrewEffectDeclaration());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isMaritimeDeclarationHealth</column-name><column-value><![CDATA[");
		sb.append(getIsMaritimeDeclarationHealth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifyDate</column-name><column-value><![CDATA[");
		sb.append(getModifyDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _documentNo;
	private String _documentFunction;
	private int _isArrival;
	private int _isDeparture;
	private String _shipCode;
	private String _arrivalOrDeparturePortCode;
	private Date _timeArrivalOrDeparture;
	private String _imoNumber;
	private String _callSign;
	private int _voyageNumber;
	private String _shipNationCode;
	private String _nameOfMaster;
	private String _lastPort;
	private String _contactDetailShipAgent;
	private double _grossTonnage;
	private double _netTonnage;
	private int _positionShipInPort;
	private String _briefParticularsVoyage;
	private String _briefDescriptionCargo;
	private int _crewNumber;
	private int _passengerNumber;
	private String _remarks;
	private String _cargoDeclaration;
	private String _shipStoresDeclaration;
	private String _crewList;
	private String _passengerList;
	private String _shipRequirements;
	private int _isCrewEffectDeclaration;
	private int _isMaritimeDeclarationHealth;
	private Date _createDate;
	private Date _modifyDate;
	private BaseModel<?> _documentGeneralRemoteModel;
}