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
 * This class is a wrapper for {@link HistoryRmdcShip}.
 * </p>
 *
 * @author longdm
 * @see HistoryRmdcShip
 * @generated
 */
public class HistoryRmdcShipWrapper implements HistoryRmdcShip,
	ModelWrapper<HistoryRmdcShip> {
	public HistoryRmdcShipWrapper(HistoryRmdcShip historyRmdcShip) {
		_historyRmdcShip = historyRmdcShip;
	}

	@Override
	public Class<?> getModelClass() {
		return HistoryRmdcShip.class;
	}

	@Override
	public String getModelClassName() {
		return HistoryRmdcShip.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("shipId", getShipId());
		attributes.put("shipName", getShipName());
		attributes.put("shipTypeId", getShipTypeId());
		attributes.put("shipTypeCode", getShipTypeCode());
		attributes.put("imo", getImo());
		attributes.put("callSign", getCallSign());
		attributes.put("stateId", getStateId());
		attributes.put("stateCode", getStateCode());
		attributes.put("registryNumber", getRegistryNumber());
		attributes.put("registryDate", getRegistryDate());
		attributes.put("registryPortId", getRegistryPortId());
		attributes.put("registryPortCode", getRegistryPortCode());
		attributes.put("gt", getGt());
		attributes.put("nrt", getNrt());
		attributes.put("dwt", getDwt());
		attributes.put("length", getLength());
		attributes.put("width", getWidth());
		attributes.put("height", getHeight());
		attributes.put("sailingSpeed", getSailingSpeed());
		attributes.put("color", getColor());
		attributes.put("boneCode", getBoneCode());
		attributes.put("machineCode", getMachineCode());
		attributes.put("shipAgencyId", getShipAgencyId());
		attributes.put("shipAgencyCode", getShipAgencyCode());
		attributes.put("fishingBoatRegistration", getFishingBoatRegistration());
		attributes.put("roleShip", getRoleShip());
		attributes.put("isDelete", getIsDelete());
		attributes.put("markedAsDelete", getMarkedAsDelete());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("requestedDate", getRequestedDate());
		attributes.put("syncVersion", getSyncVersion());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer shipId = (Integer)attributes.get("shipId");

		if (shipId != null) {
			setShipId(shipId);
		}

		String shipName = (String)attributes.get("shipName");

		if (shipName != null) {
			setShipName(shipName);
		}

		Integer shipTypeId = (Integer)attributes.get("shipTypeId");

		if (shipTypeId != null) {
			setShipTypeId(shipTypeId);
		}

		String shipTypeCode = (String)attributes.get("shipTypeCode");

		if (shipTypeCode != null) {
			setShipTypeCode(shipTypeCode);
		}

		String imo = (String)attributes.get("imo");

		if (imo != null) {
			setImo(imo);
		}

		String callSign = (String)attributes.get("callSign");

		if (callSign != null) {
			setCallSign(callSign);
		}

		String stateId = (String)attributes.get("stateId");

		if (stateId != null) {
			setStateId(stateId);
		}

		String stateCode = (String)attributes.get("stateCode");

		if (stateCode != null) {
			setStateCode(stateCode);
		}

		String registryNumber = (String)attributes.get("registryNumber");

		if (registryNumber != null) {
			setRegistryNumber(registryNumber);
		}

		Date registryDate = (Date)attributes.get("registryDate");

		if (registryDate != null) {
			setRegistryDate(registryDate);
		}

		Integer registryPortId = (Integer)attributes.get("registryPortId");

		if (registryPortId != null) {
			setRegistryPortId(registryPortId);
		}

		String registryPortCode = (String)attributes.get("registryPortCode");

		if (registryPortCode != null) {
			setRegistryPortCode(registryPortCode);
		}

		Double gt = (Double)attributes.get("gt");

		if (gt != null) {
			setGt(gt);
		}

		Double nrt = (Double)attributes.get("nrt");

		if (nrt != null) {
			setNrt(nrt);
		}

		Double dwt = (Double)attributes.get("dwt");

		if (dwt != null) {
			setDwt(dwt);
		}

		Double length = (Double)attributes.get("length");

		if (length != null) {
			setLength(length);
		}

		Double width = (Double)attributes.get("width");

		if (width != null) {
			setWidth(width);
		}

		Double height = (Double)attributes.get("height");

		if (height != null) {
			setHeight(height);
		}

		Double sailingSpeed = (Double)attributes.get("sailingSpeed");

		if (sailingSpeed != null) {
			setSailingSpeed(sailingSpeed);
		}

		String color = (String)attributes.get("color");

		if (color != null) {
			setColor(color);
		}

		String boneCode = (String)attributes.get("boneCode");

		if (boneCode != null) {
			setBoneCode(boneCode);
		}

		String machineCode = (String)attributes.get("machineCode");

		if (machineCode != null) {
			setMachineCode(machineCode);
		}

		Integer shipAgencyId = (Integer)attributes.get("shipAgencyId");

		if (shipAgencyId != null) {
			setShipAgencyId(shipAgencyId);
		}

		String shipAgencyCode = (String)attributes.get("shipAgencyCode");

		if (shipAgencyCode != null) {
			setShipAgencyCode(shipAgencyCode);
		}

		String fishingBoatRegistration = (String)attributes.get(
				"fishingBoatRegistration");

		if (fishingBoatRegistration != null) {
			setFishingBoatRegistration(fishingBoatRegistration);
		}

		Integer roleShip = (Integer)attributes.get("roleShip");

		if (roleShip != null) {
			setRoleShip(roleShip);
		}

		Integer isDelete = (Integer)attributes.get("isDelete");

		if (isDelete != null) {
			setIsDelete(isDelete);
		}

		Integer markedAsDelete = (Integer)attributes.get("markedAsDelete");

		if (markedAsDelete != null) {
			setMarkedAsDelete(markedAsDelete);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Date requestedDate = (Date)attributes.get("requestedDate");

		if (requestedDate != null) {
			setRequestedDate(requestedDate);
		}

		String syncVersion = (String)attributes.get("syncVersion");

		if (syncVersion != null) {
			setSyncVersion(syncVersion);
		}
	}

	/**
	* Returns the primary key of this history rmdc ship.
	*
	* @return the primary key of this history rmdc ship
	*/
	@Override
	public long getPrimaryKey() {
		return _historyRmdcShip.getPrimaryKey();
	}

	/**
	* Sets the primary key of this history rmdc ship.
	*
	* @param primaryKey the primary key of this history rmdc ship
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_historyRmdcShip.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this history rmdc ship.
	*
	* @return the ID of this history rmdc ship
	*/
	@Override
	public long getId() {
		return _historyRmdcShip.getId();
	}

	/**
	* Sets the ID of this history rmdc ship.
	*
	* @param id the ID of this history rmdc ship
	*/
	@Override
	public void setId(long id) {
		_historyRmdcShip.setId(id);
	}

	/**
	* Returns the ship ID of this history rmdc ship.
	*
	* @return the ship ID of this history rmdc ship
	*/
	@Override
	public int getShipId() {
		return _historyRmdcShip.getShipId();
	}

	/**
	* Sets the ship ID of this history rmdc ship.
	*
	* @param shipId the ship ID of this history rmdc ship
	*/
	@Override
	public void setShipId(int shipId) {
		_historyRmdcShip.setShipId(shipId);
	}

	/**
	* Returns the ship name of this history rmdc ship.
	*
	* @return the ship name of this history rmdc ship
	*/
	@Override
	public java.lang.String getShipName() {
		return _historyRmdcShip.getShipName();
	}

	/**
	* Sets the ship name of this history rmdc ship.
	*
	* @param shipName the ship name of this history rmdc ship
	*/
	@Override
	public void setShipName(java.lang.String shipName) {
		_historyRmdcShip.setShipName(shipName);
	}

	/**
	* Returns the ship type ID of this history rmdc ship.
	*
	* @return the ship type ID of this history rmdc ship
	*/
	@Override
	public int getShipTypeId() {
		return _historyRmdcShip.getShipTypeId();
	}

	/**
	* Sets the ship type ID of this history rmdc ship.
	*
	* @param shipTypeId the ship type ID of this history rmdc ship
	*/
	@Override
	public void setShipTypeId(int shipTypeId) {
		_historyRmdcShip.setShipTypeId(shipTypeId);
	}

	/**
	* Returns the ship type code of this history rmdc ship.
	*
	* @return the ship type code of this history rmdc ship
	*/
	@Override
	public java.lang.String getShipTypeCode() {
		return _historyRmdcShip.getShipTypeCode();
	}

	/**
	* Sets the ship type code of this history rmdc ship.
	*
	* @param shipTypeCode the ship type code of this history rmdc ship
	*/
	@Override
	public void setShipTypeCode(java.lang.String shipTypeCode) {
		_historyRmdcShip.setShipTypeCode(shipTypeCode);
	}

	/**
	* Returns the imo of this history rmdc ship.
	*
	* @return the imo of this history rmdc ship
	*/
	@Override
	public java.lang.String getImo() {
		return _historyRmdcShip.getImo();
	}

	/**
	* Sets the imo of this history rmdc ship.
	*
	* @param imo the imo of this history rmdc ship
	*/
	@Override
	public void setImo(java.lang.String imo) {
		_historyRmdcShip.setImo(imo);
	}

	/**
	* Returns the call sign of this history rmdc ship.
	*
	* @return the call sign of this history rmdc ship
	*/
	@Override
	public java.lang.String getCallSign() {
		return _historyRmdcShip.getCallSign();
	}

	/**
	* Sets the call sign of this history rmdc ship.
	*
	* @param callSign the call sign of this history rmdc ship
	*/
	@Override
	public void setCallSign(java.lang.String callSign) {
		_historyRmdcShip.setCallSign(callSign);
	}

	/**
	* Returns the state ID of this history rmdc ship.
	*
	* @return the state ID of this history rmdc ship
	*/
	@Override
	public java.lang.String getStateId() {
		return _historyRmdcShip.getStateId();
	}

	/**
	* Sets the state ID of this history rmdc ship.
	*
	* @param stateId the state ID of this history rmdc ship
	*/
	@Override
	public void setStateId(java.lang.String stateId) {
		_historyRmdcShip.setStateId(stateId);
	}

	/**
	* Returns the state code of this history rmdc ship.
	*
	* @return the state code of this history rmdc ship
	*/
	@Override
	public java.lang.String getStateCode() {
		return _historyRmdcShip.getStateCode();
	}

	/**
	* Sets the state code of this history rmdc ship.
	*
	* @param stateCode the state code of this history rmdc ship
	*/
	@Override
	public void setStateCode(java.lang.String stateCode) {
		_historyRmdcShip.setStateCode(stateCode);
	}

	/**
	* Returns the registry number of this history rmdc ship.
	*
	* @return the registry number of this history rmdc ship
	*/
	@Override
	public java.lang.String getRegistryNumber() {
		return _historyRmdcShip.getRegistryNumber();
	}

	/**
	* Sets the registry number of this history rmdc ship.
	*
	* @param registryNumber the registry number of this history rmdc ship
	*/
	@Override
	public void setRegistryNumber(java.lang.String registryNumber) {
		_historyRmdcShip.setRegistryNumber(registryNumber);
	}

	/**
	* Returns the registry date of this history rmdc ship.
	*
	* @return the registry date of this history rmdc ship
	*/
	@Override
	public java.util.Date getRegistryDate() {
		return _historyRmdcShip.getRegistryDate();
	}

	/**
	* Sets the registry date of this history rmdc ship.
	*
	* @param registryDate the registry date of this history rmdc ship
	*/
	@Override
	public void setRegistryDate(java.util.Date registryDate) {
		_historyRmdcShip.setRegistryDate(registryDate);
	}

	/**
	* Returns the registry port ID of this history rmdc ship.
	*
	* @return the registry port ID of this history rmdc ship
	*/
	@Override
	public int getRegistryPortId() {
		return _historyRmdcShip.getRegistryPortId();
	}

	/**
	* Sets the registry port ID of this history rmdc ship.
	*
	* @param registryPortId the registry port ID of this history rmdc ship
	*/
	@Override
	public void setRegistryPortId(int registryPortId) {
		_historyRmdcShip.setRegistryPortId(registryPortId);
	}

	/**
	* Returns the registry port code of this history rmdc ship.
	*
	* @return the registry port code of this history rmdc ship
	*/
	@Override
	public java.lang.String getRegistryPortCode() {
		return _historyRmdcShip.getRegistryPortCode();
	}

	/**
	* Sets the registry port code of this history rmdc ship.
	*
	* @param registryPortCode the registry port code of this history rmdc ship
	*/
	@Override
	public void setRegistryPortCode(java.lang.String registryPortCode) {
		_historyRmdcShip.setRegistryPortCode(registryPortCode);
	}

	/**
	* Returns the gt of this history rmdc ship.
	*
	* @return the gt of this history rmdc ship
	*/
	@Override
	public double getGt() {
		return _historyRmdcShip.getGt();
	}

	/**
	* Sets the gt of this history rmdc ship.
	*
	* @param gt the gt of this history rmdc ship
	*/
	@Override
	public void setGt(double gt) {
		_historyRmdcShip.setGt(gt);
	}

	/**
	* Returns the nrt of this history rmdc ship.
	*
	* @return the nrt of this history rmdc ship
	*/
	@Override
	public double getNrt() {
		return _historyRmdcShip.getNrt();
	}

	/**
	* Sets the nrt of this history rmdc ship.
	*
	* @param nrt the nrt of this history rmdc ship
	*/
	@Override
	public void setNrt(double nrt) {
		_historyRmdcShip.setNrt(nrt);
	}

	/**
	* Returns the dwt of this history rmdc ship.
	*
	* @return the dwt of this history rmdc ship
	*/
	@Override
	public double getDwt() {
		return _historyRmdcShip.getDwt();
	}

	/**
	* Sets the dwt of this history rmdc ship.
	*
	* @param dwt the dwt of this history rmdc ship
	*/
	@Override
	public void setDwt(double dwt) {
		_historyRmdcShip.setDwt(dwt);
	}

	/**
	* Returns the length of this history rmdc ship.
	*
	* @return the length of this history rmdc ship
	*/
	@Override
	public double getLength() {
		return _historyRmdcShip.getLength();
	}

	/**
	* Sets the length of this history rmdc ship.
	*
	* @param length the length of this history rmdc ship
	*/
	@Override
	public void setLength(double length) {
		_historyRmdcShip.setLength(length);
	}

	/**
	* Returns the width of this history rmdc ship.
	*
	* @return the width of this history rmdc ship
	*/
	@Override
	public double getWidth() {
		return _historyRmdcShip.getWidth();
	}

	/**
	* Sets the width of this history rmdc ship.
	*
	* @param width the width of this history rmdc ship
	*/
	@Override
	public void setWidth(double width) {
		_historyRmdcShip.setWidth(width);
	}

	/**
	* Returns the height of this history rmdc ship.
	*
	* @return the height of this history rmdc ship
	*/
	@Override
	public double getHeight() {
		return _historyRmdcShip.getHeight();
	}

	/**
	* Sets the height of this history rmdc ship.
	*
	* @param height the height of this history rmdc ship
	*/
	@Override
	public void setHeight(double height) {
		_historyRmdcShip.setHeight(height);
	}

	/**
	* Returns the sailing speed of this history rmdc ship.
	*
	* @return the sailing speed of this history rmdc ship
	*/
	@Override
	public double getSailingSpeed() {
		return _historyRmdcShip.getSailingSpeed();
	}

	/**
	* Sets the sailing speed of this history rmdc ship.
	*
	* @param sailingSpeed the sailing speed of this history rmdc ship
	*/
	@Override
	public void setSailingSpeed(double sailingSpeed) {
		_historyRmdcShip.setSailingSpeed(sailingSpeed);
	}

	/**
	* Returns the color of this history rmdc ship.
	*
	* @return the color of this history rmdc ship
	*/
	@Override
	public java.lang.String getColor() {
		return _historyRmdcShip.getColor();
	}

	/**
	* Sets the color of this history rmdc ship.
	*
	* @param color the color of this history rmdc ship
	*/
	@Override
	public void setColor(java.lang.String color) {
		_historyRmdcShip.setColor(color);
	}

	/**
	* Returns the bone code of this history rmdc ship.
	*
	* @return the bone code of this history rmdc ship
	*/
	@Override
	public java.lang.String getBoneCode() {
		return _historyRmdcShip.getBoneCode();
	}

	/**
	* Sets the bone code of this history rmdc ship.
	*
	* @param boneCode the bone code of this history rmdc ship
	*/
	@Override
	public void setBoneCode(java.lang.String boneCode) {
		_historyRmdcShip.setBoneCode(boneCode);
	}

	/**
	* Returns the machine code of this history rmdc ship.
	*
	* @return the machine code of this history rmdc ship
	*/
	@Override
	public java.lang.String getMachineCode() {
		return _historyRmdcShip.getMachineCode();
	}

	/**
	* Sets the machine code of this history rmdc ship.
	*
	* @param machineCode the machine code of this history rmdc ship
	*/
	@Override
	public void setMachineCode(java.lang.String machineCode) {
		_historyRmdcShip.setMachineCode(machineCode);
	}

	/**
	* Returns the ship agency ID of this history rmdc ship.
	*
	* @return the ship agency ID of this history rmdc ship
	*/
	@Override
	public int getShipAgencyId() {
		return _historyRmdcShip.getShipAgencyId();
	}

	/**
	* Sets the ship agency ID of this history rmdc ship.
	*
	* @param shipAgencyId the ship agency ID of this history rmdc ship
	*/
	@Override
	public void setShipAgencyId(int shipAgencyId) {
		_historyRmdcShip.setShipAgencyId(shipAgencyId);
	}

	/**
	* Returns the ship agency code of this history rmdc ship.
	*
	* @return the ship agency code of this history rmdc ship
	*/
	@Override
	public java.lang.String getShipAgencyCode() {
		return _historyRmdcShip.getShipAgencyCode();
	}

	/**
	* Sets the ship agency code of this history rmdc ship.
	*
	* @param shipAgencyCode the ship agency code of this history rmdc ship
	*/
	@Override
	public void setShipAgencyCode(java.lang.String shipAgencyCode) {
		_historyRmdcShip.setShipAgencyCode(shipAgencyCode);
	}

	/**
	* Returns the fishing boat registration of this history rmdc ship.
	*
	* @return the fishing boat registration of this history rmdc ship
	*/
	@Override
	public java.lang.String getFishingBoatRegistration() {
		return _historyRmdcShip.getFishingBoatRegistration();
	}

	/**
	* Sets the fishing boat registration of this history rmdc ship.
	*
	* @param fishingBoatRegistration the fishing boat registration of this history rmdc ship
	*/
	@Override
	public void setFishingBoatRegistration(
		java.lang.String fishingBoatRegistration) {
		_historyRmdcShip.setFishingBoatRegistration(fishingBoatRegistration);
	}

	/**
	* Returns the role ship of this history rmdc ship.
	*
	* @return the role ship of this history rmdc ship
	*/
	@Override
	public int getRoleShip() {
		return _historyRmdcShip.getRoleShip();
	}

	/**
	* Sets the role ship of this history rmdc ship.
	*
	* @param roleShip the role ship of this history rmdc ship
	*/
	@Override
	public void setRoleShip(int roleShip) {
		_historyRmdcShip.setRoleShip(roleShip);
	}

	/**
	* Returns the is delete of this history rmdc ship.
	*
	* @return the is delete of this history rmdc ship
	*/
	@Override
	public int getIsDelete() {
		return _historyRmdcShip.getIsDelete();
	}

	/**
	* Sets the is delete of this history rmdc ship.
	*
	* @param isDelete the is delete of this history rmdc ship
	*/
	@Override
	public void setIsDelete(int isDelete) {
		_historyRmdcShip.setIsDelete(isDelete);
	}

	/**
	* Returns the marked as delete of this history rmdc ship.
	*
	* @return the marked as delete of this history rmdc ship
	*/
	@Override
	public int getMarkedAsDelete() {
		return _historyRmdcShip.getMarkedAsDelete();
	}

	/**
	* Sets the marked as delete of this history rmdc ship.
	*
	* @param markedAsDelete the marked as delete of this history rmdc ship
	*/
	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_historyRmdcShip.setMarkedAsDelete(markedAsDelete);
	}

	/**
	* Returns the modified date of this history rmdc ship.
	*
	* @return the modified date of this history rmdc ship
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _historyRmdcShip.getModifiedDate();
	}

	/**
	* Sets the modified date of this history rmdc ship.
	*
	* @param modifiedDate the modified date of this history rmdc ship
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_historyRmdcShip.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the requested date of this history rmdc ship.
	*
	* @return the requested date of this history rmdc ship
	*/
	@Override
	public java.util.Date getRequestedDate() {
		return _historyRmdcShip.getRequestedDate();
	}

	/**
	* Sets the requested date of this history rmdc ship.
	*
	* @param requestedDate the requested date of this history rmdc ship
	*/
	@Override
	public void setRequestedDate(java.util.Date requestedDate) {
		_historyRmdcShip.setRequestedDate(requestedDate);
	}

	/**
	* Returns the sync version of this history rmdc ship.
	*
	* @return the sync version of this history rmdc ship
	*/
	@Override
	public java.lang.String getSyncVersion() {
		return _historyRmdcShip.getSyncVersion();
	}

	/**
	* Sets the sync version of this history rmdc ship.
	*
	* @param syncVersion the sync version of this history rmdc ship
	*/
	@Override
	public void setSyncVersion(java.lang.String syncVersion) {
		_historyRmdcShip.setSyncVersion(syncVersion);
	}

	@Override
	public boolean isNew() {
		return _historyRmdcShip.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_historyRmdcShip.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _historyRmdcShip.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_historyRmdcShip.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _historyRmdcShip.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _historyRmdcShip.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_historyRmdcShip.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _historyRmdcShip.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_historyRmdcShip.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_historyRmdcShip.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_historyRmdcShip.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new HistoryRmdcShipWrapper((HistoryRmdcShip)_historyRmdcShip.clone());
	}

	@Override
	public int compareTo(HistoryRmdcShip historyRmdcShip) {
		return _historyRmdcShip.compareTo(historyRmdcShip);
	}

	@Override
	public int hashCode() {
		return _historyRmdcShip.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<HistoryRmdcShip> toCacheModel() {
		return _historyRmdcShip.toCacheModel();
	}

	@Override
	public HistoryRmdcShip toEscapedModel() {
		return new HistoryRmdcShipWrapper(_historyRmdcShip.toEscapedModel());
	}

	@Override
	public HistoryRmdcShip toUnescapedModel() {
		return new HistoryRmdcShipWrapper(_historyRmdcShip.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _historyRmdcShip.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _historyRmdcShip.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_historyRmdcShip.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof HistoryRmdcShipWrapper)) {
			return false;
		}

		HistoryRmdcShipWrapper historyRmdcShipWrapper = (HistoryRmdcShipWrapper)obj;

		if (Validator.equals(_historyRmdcShip,
					historyRmdcShipWrapper._historyRmdcShip)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public HistoryRmdcShip getWrappedHistoryRmdcShip() {
		return _historyRmdcShip;
	}

	@Override
	public HistoryRmdcShip getWrappedModel() {
		return _historyRmdcShip;
	}

	@Override
	public void resetOriginalValues() {
		_historyRmdcShip.resetOriginalValues();
	}

	private HistoryRmdcShip _historyRmdcShip;
}