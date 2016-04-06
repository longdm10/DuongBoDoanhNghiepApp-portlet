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
import vn.dtt.duongbien.dao.vrcb.service.HistoryRmdcShipLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class HistoryRmdcShipClp extends BaseModelImpl<HistoryRmdcShip>
	implements HistoryRmdcShip {
	public HistoryRmdcShipClp() {
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

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_historyRmdcShipRemoteModel != null) {
			try {
				Class<?> clazz = _historyRmdcShipRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_historyRmdcShipRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getShipId() {
		return _shipId;
	}

	@Override
	public void setShipId(int shipId) {
		_shipId = shipId;

		if (_historyRmdcShipRemoteModel != null) {
			try {
				Class<?> clazz = _historyRmdcShipRemoteModel.getClass();

				Method method = clazz.getMethod("setShipId", int.class);

				method.invoke(_historyRmdcShipRemoteModel, shipId);
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

		if (_historyRmdcShipRemoteModel != null) {
			try {
				Class<?> clazz = _historyRmdcShipRemoteModel.getClass();

				Method method = clazz.getMethod("setShipName", String.class);

				method.invoke(_historyRmdcShipRemoteModel, shipName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getShipTypeId() {
		return _shipTypeId;
	}

	@Override
	public void setShipTypeId(int shipTypeId) {
		_shipTypeId = shipTypeId;

		if (_historyRmdcShipRemoteModel != null) {
			try {
				Class<?> clazz = _historyRmdcShipRemoteModel.getClass();

				Method method = clazz.getMethod("setShipTypeId", int.class);

				method.invoke(_historyRmdcShipRemoteModel, shipTypeId);
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

		if (_historyRmdcShipRemoteModel != null) {
			try {
				Class<?> clazz = _historyRmdcShipRemoteModel.getClass();

				Method method = clazz.getMethod("setShipTypeCode", String.class);

				method.invoke(_historyRmdcShipRemoteModel, shipTypeCode);
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

		if (_historyRmdcShipRemoteModel != null) {
			try {
				Class<?> clazz = _historyRmdcShipRemoteModel.getClass();

				Method method = clazz.getMethod("setImo", String.class);

				method.invoke(_historyRmdcShipRemoteModel, imo);
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

		if (_historyRmdcShipRemoteModel != null) {
			try {
				Class<?> clazz = _historyRmdcShipRemoteModel.getClass();

				Method method = clazz.getMethod("setCallSign", String.class);

				method.invoke(_historyRmdcShipRemoteModel, callSign);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStateId() {
		return _stateId;
	}

	@Override
	public void setStateId(String stateId) {
		_stateId = stateId;

		if (_historyRmdcShipRemoteModel != null) {
			try {
				Class<?> clazz = _historyRmdcShipRemoteModel.getClass();

				Method method = clazz.getMethod("setStateId", String.class);

				method.invoke(_historyRmdcShipRemoteModel, stateId);
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

		if (_historyRmdcShipRemoteModel != null) {
			try {
				Class<?> clazz = _historyRmdcShipRemoteModel.getClass();

				Method method = clazz.getMethod("setStateCode", String.class);

				method.invoke(_historyRmdcShipRemoteModel, stateCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRegistryNumber() {
		return _registryNumber;
	}

	@Override
	public void setRegistryNumber(String registryNumber) {
		_registryNumber = registryNumber;

		if (_historyRmdcShipRemoteModel != null) {
			try {
				Class<?> clazz = _historyRmdcShipRemoteModel.getClass();

				Method method = clazz.getMethod("setRegistryNumber",
						String.class);

				method.invoke(_historyRmdcShipRemoteModel, registryNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getRegistryDate() {
		return _registryDate;
	}

	@Override
	public void setRegistryDate(Date registryDate) {
		_registryDate = registryDate;

		if (_historyRmdcShipRemoteModel != null) {
			try {
				Class<?> clazz = _historyRmdcShipRemoteModel.getClass();

				Method method = clazz.getMethod("setRegistryDate", Date.class);

				method.invoke(_historyRmdcShipRemoteModel, registryDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getRegistryPortId() {
		return _registryPortId;
	}

	@Override
	public void setRegistryPortId(int registryPortId) {
		_registryPortId = registryPortId;

		if (_historyRmdcShipRemoteModel != null) {
			try {
				Class<?> clazz = _historyRmdcShipRemoteModel.getClass();

				Method method = clazz.getMethod("setRegistryPortId", int.class);

				method.invoke(_historyRmdcShipRemoteModel, registryPortId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRegistryPortCode() {
		return _registryPortCode;
	}

	@Override
	public void setRegistryPortCode(String registryPortCode) {
		_registryPortCode = registryPortCode;

		if (_historyRmdcShipRemoteModel != null) {
			try {
				Class<?> clazz = _historyRmdcShipRemoteModel.getClass();

				Method method = clazz.getMethod("setRegistryPortCode",
						String.class);

				method.invoke(_historyRmdcShipRemoteModel, registryPortCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getGt() {
		return _gt;
	}

	@Override
	public void setGt(double gt) {
		_gt = gt;

		if (_historyRmdcShipRemoteModel != null) {
			try {
				Class<?> clazz = _historyRmdcShipRemoteModel.getClass();

				Method method = clazz.getMethod("setGt", double.class);

				method.invoke(_historyRmdcShipRemoteModel, gt);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getNrt() {
		return _nrt;
	}

	@Override
	public void setNrt(double nrt) {
		_nrt = nrt;

		if (_historyRmdcShipRemoteModel != null) {
			try {
				Class<?> clazz = _historyRmdcShipRemoteModel.getClass();

				Method method = clazz.getMethod("setNrt", double.class);

				method.invoke(_historyRmdcShipRemoteModel, nrt);
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

		if (_historyRmdcShipRemoteModel != null) {
			try {
				Class<?> clazz = _historyRmdcShipRemoteModel.getClass();

				Method method = clazz.getMethod("setDwt", double.class);

				method.invoke(_historyRmdcShipRemoteModel, dwt);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getLength() {
		return _length;
	}

	@Override
	public void setLength(double length) {
		_length = length;

		if (_historyRmdcShipRemoteModel != null) {
			try {
				Class<?> clazz = _historyRmdcShipRemoteModel.getClass();

				Method method = clazz.getMethod("setLength", double.class);

				method.invoke(_historyRmdcShipRemoteModel, length);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getWidth() {
		return _width;
	}

	@Override
	public void setWidth(double width) {
		_width = width;

		if (_historyRmdcShipRemoteModel != null) {
			try {
				Class<?> clazz = _historyRmdcShipRemoteModel.getClass();

				Method method = clazz.getMethod("setWidth", double.class);

				method.invoke(_historyRmdcShipRemoteModel, width);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getHeight() {
		return _height;
	}

	@Override
	public void setHeight(double height) {
		_height = height;

		if (_historyRmdcShipRemoteModel != null) {
			try {
				Class<?> clazz = _historyRmdcShipRemoteModel.getClass();

				Method method = clazz.getMethod("setHeight", double.class);

				method.invoke(_historyRmdcShipRemoteModel, height);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getSailingSpeed() {
		return _sailingSpeed;
	}

	@Override
	public void setSailingSpeed(double sailingSpeed) {
		_sailingSpeed = sailingSpeed;

		if (_historyRmdcShipRemoteModel != null) {
			try {
				Class<?> clazz = _historyRmdcShipRemoteModel.getClass();

				Method method = clazz.getMethod("setSailingSpeed", double.class);

				method.invoke(_historyRmdcShipRemoteModel, sailingSpeed);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getColor() {
		return _color;
	}

	@Override
	public void setColor(String color) {
		_color = color;

		if (_historyRmdcShipRemoteModel != null) {
			try {
				Class<?> clazz = _historyRmdcShipRemoteModel.getClass();

				Method method = clazz.getMethod("setColor", String.class);

				method.invoke(_historyRmdcShipRemoteModel, color);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBoneCode() {
		return _boneCode;
	}

	@Override
	public void setBoneCode(String boneCode) {
		_boneCode = boneCode;

		if (_historyRmdcShipRemoteModel != null) {
			try {
				Class<?> clazz = _historyRmdcShipRemoteModel.getClass();

				Method method = clazz.getMethod("setBoneCode", String.class);

				method.invoke(_historyRmdcShipRemoteModel, boneCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMachineCode() {
		return _machineCode;
	}

	@Override
	public void setMachineCode(String machineCode) {
		_machineCode = machineCode;

		if (_historyRmdcShipRemoteModel != null) {
			try {
				Class<?> clazz = _historyRmdcShipRemoteModel.getClass();

				Method method = clazz.getMethod("setMachineCode", String.class);

				method.invoke(_historyRmdcShipRemoteModel, machineCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getShipAgencyId() {
		return _shipAgencyId;
	}

	@Override
	public void setShipAgencyId(int shipAgencyId) {
		_shipAgencyId = shipAgencyId;

		if (_historyRmdcShipRemoteModel != null) {
			try {
				Class<?> clazz = _historyRmdcShipRemoteModel.getClass();

				Method method = clazz.getMethod("setShipAgencyId", int.class);

				method.invoke(_historyRmdcShipRemoteModel, shipAgencyId);
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

		if (_historyRmdcShipRemoteModel != null) {
			try {
				Class<?> clazz = _historyRmdcShipRemoteModel.getClass();

				Method method = clazz.getMethod("setShipAgencyCode",
						String.class);

				method.invoke(_historyRmdcShipRemoteModel, shipAgencyCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFishingBoatRegistration() {
		return _fishingBoatRegistration;
	}

	@Override
	public void setFishingBoatRegistration(String fishingBoatRegistration) {
		_fishingBoatRegistration = fishingBoatRegistration;

		if (_historyRmdcShipRemoteModel != null) {
			try {
				Class<?> clazz = _historyRmdcShipRemoteModel.getClass();

				Method method = clazz.getMethod("setFishingBoatRegistration",
						String.class);

				method.invoke(_historyRmdcShipRemoteModel,
					fishingBoatRegistration);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getRoleShip() {
		return _roleShip;
	}

	@Override
	public void setRoleShip(int roleShip) {
		_roleShip = roleShip;

		if (_historyRmdcShipRemoteModel != null) {
			try {
				Class<?> clazz = _historyRmdcShipRemoteModel.getClass();

				Method method = clazz.getMethod("setRoleShip", int.class);

				method.invoke(_historyRmdcShipRemoteModel, roleShip);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIsDelete() {
		return _isDelete;
	}

	@Override
	public void setIsDelete(int isDelete) {
		_isDelete = isDelete;

		if (_historyRmdcShipRemoteModel != null) {
			try {
				Class<?> clazz = _historyRmdcShipRemoteModel.getClass();

				Method method = clazz.getMethod("setIsDelete", int.class);

				method.invoke(_historyRmdcShipRemoteModel, isDelete);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMarkedAsDelete() {
		return _markedAsDelete;
	}

	@Override
	public void setMarkedAsDelete(int markedAsDelete) {
		_markedAsDelete = markedAsDelete;

		if (_historyRmdcShipRemoteModel != null) {
			try {
				Class<?> clazz = _historyRmdcShipRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkedAsDelete", int.class);

				method.invoke(_historyRmdcShipRemoteModel, markedAsDelete);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_historyRmdcShipRemoteModel != null) {
			try {
				Class<?> clazz = _historyRmdcShipRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_historyRmdcShipRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getRequestedDate() {
		return _requestedDate;
	}

	@Override
	public void setRequestedDate(Date requestedDate) {
		_requestedDate = requestedDate;

		if (_historyRmdcShipRemoteModel != null) {
			try {
				Class<?> clazz = _historyRmdcShipRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestedDate", Date.class);

				method.invoke(_historyRmdcShipRemoteModel, requestedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSyncVersion() {
		return _syncVersion;
	}

	@Override
	public void setSyncVersion(String syncVersion) {
		_syncVersion = syncVersion;

		if (_historyRmdcShipRemoteModel != null) {
			try {
				Class<?> clazz = _historyRmdcShipRemoteModel.getClass();

				Method method = clazz.getMethod("setSyncVersion", String.class);

				method.invoke(_historyRmdcShipRemoteModel, syncVersion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getHistoryRmdcShipRemoteModel() {
		return _historyRmdcShipRemoteModel;
	}

	public void setHistoryRmdcShipRemoteModel(
		BaseModel<?> historyRmdcShipRemoteModel) {
		_historyRmdcShipRemoteModel = historyRmdcShipRemoteModel;
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

		Class<?> remoteModelClass = _historyRmdcShipRemoteModel.getClass();

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

		Object returnValue = method.invoke(_historyRmdcShipRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			HistoryRmdcShipLocalServiceUtil.addHistoryRmdcShip(this);
		}
		else {
			HistoryRmdcShipLocalServiceUtil.updateHistoryRmdcShip(this);
		}
	}

	@Override
	public HistoryRmdcShip toEscapedModel() {
		return (HistoryRmdcShip)ProxyUtil.newProxyInstance(HistoryRmdcShip.class.getClassLoader(),
			new Class[] { HistoryRmdcShip.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		HistoryRmdcShipClp clone = new HistoryRmdcShipClp();

		clone.setId(getId());
		clone.setShipId(getShipId());
		clone.setShipName(getShipName());
		clone.setShipTypeId(getShipTypeId());
		clone.setShipTypeCode(getShipTypeCode());
		clone.setImo(getImo());
		clone.setCallSign(getCallSign());
		clone.setStateId(getStateId());
		clone.setStateCode(getStateCode());
		clone.setRegistryNumber(getRegistryNumber());
		clone.setRegistryDate(getRegistryDate());
		clone.setRegistryPortId(getRegistryPortId());
		clone.setRegistryPortCode(getRegistryPortCode());
		clone.setGt(getGt());
		clone.setNrt(getNrt());
		clone.setDwt(getDwt());
		clone.setLength(getLength());
		clone.setWidth(getWidth());
		clone.setHeight(getHeight());
		clone.setSailingSpeed(getSailingSpeed());
		clone.setColor(getColor());
		clone.setBoneCode(getBoneCode());
		clone.setMachineCode(getMachineCode());
		clone.setShipAgencyId(getShipAgencyId());
		clone.setShipAgencyCode(getShipAgencyCode());
		clone.setFishingBoatRegistration(getFishingBoatRegistration());
		clone.setRoleShip(getRoleShip());
		clone.setIsDelete(getIsDelete());
		clone.setMarkedAsDelete(getMarkedAsDelete());
		clone.setModifiedDate(getModifiedDate());
		clone.setRequestedDate(getRequestedDate());
		clone.setSyncVersion(getSyncVersion());

		return clone;
	}

	@Override
	public int compareTo(HistoryRmdcShip historyRmdcShip) {
		int value = 0;

		if (getId() < historyRmdcShip.getId()) {
			value = -1;
		}
		else if (getId() > historyRmdcShip.getId()) {
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

		if (!(obj instanceof HistoryRmdcShipClp)) {
			return false;
		}

		HistoryRmdcShipClp historyRmdcShip = (HistoryRmdcShipClp)obj;

		long primaryKey = historyRmdcShip.getPrimaryKey();

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
		StringBundler sb = new StringBundler(65);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", shipId=");
		sb.append(getShipId());
		sb.append(", shipName=");
		sb.append(getShipName());
		sb.append(", shipTypeId=");
		sb.append(getShipTypeId());
		sb.append(", shipTypeCode=");
		sb.append(getShipTypeCode());
		sb.append(", imo=");
		sb.append(getImo());
		sb.append(", callSign=");
		sb.append(getCallSign());
		sb.append(", stateId=");
		sb.append(getStateId());
		sb.append(", stateCode=");
		sb.append(getStateCode());
		sb.append(", registryNumber=");
		sb.append(getRegistryNumber());
		sb.append(", registryDate=");
		sb.append(getRegistryDate());
		sb.append(", registryPortId=");
		sb.append(getRegistryPortId());
		sb.append(", registryPortCode=");
		sb.append(getRegistryPortCode());
		sb.append(", gt=");
		sb.append(getGt());
		sb.append(", nrt=");
		sb.append(getNrt());
		sb.append(", dwt=");
		sb.append(getDwt());
		sb.append(", length=");
		sb.append(getLength());
		sb.append(", width=");
		sb.append(getWidth());
		sb.append(", height=");
		sb.append(getHeight());
		sb.append(", sailingSpeed=");
		sb.append(getSailingSpeed());
		sb.append(", color=");
		sb.append(getColor());
		sb.append(", boneCode=");
		sb.append(getBoneCode());
		sb.append(", machineCode=");
		sb.append(getMachineCode());
		sb.append(", shipAgencyId=");
		sb.append(getShipAgencyId());
		sb.append(", shipAgencyCode=");
		sb.append(getShipAgencyCode());
		sb.append(", fishingBoatRegistration=");
		sb.append(getFishingBoatRegistration());
		sb.append(", roleShip=");
		sb.append(getRoleShip());
		sb.append(", isDelete=");
		sb.append(getIsDelete());
		sb.append(", markedAsDelete=");
		sb.append(getMarkedAsDelete());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", requestedDate=");
		sb.append(getRequestedDate());
		sb.append(", syncVersion=");
		sb.append(getSyncVersion());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(100);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.HistoryRmdcShip");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipId</column-name><column-value><![CDATA[");
		sb.append(getShipId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipName</column-name><column-value><![CDATA[");
		sb.append(getShipName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipTypeId</column-name><column-value><![CDATA[");
		sb.append(getShipTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipTypeCode</column-name><column-value><![CDATA[");
		sb.append(getShipTypeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>imo</column-name><column-value><![CDATA[");
		sb.append(getImo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>callSign</column-name><column-value><![CDATA[");
		sb.append(getCallSign());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stateId</column-name><column-value><![CDATA[");
		sb.append(getStateId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stateCode</column-name><column-value><![CDATA[");
		sb.append(getStateCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registryNumber</column-name><column-value><![CDATA[");
		sb.append(getRegistryNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registryDate</column-name><column-value><![CDATA[");
		sb.append(getRegistryDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registryPortId</column-name><column-value><![CDATA[");
		sb.append(getRegistryPortId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registryPortCode</column-name><column-value><![CDATA[");
		sb.append(getRegistryPortCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gt</column-name><column-value><![CDATA[");
		sb.append(getGt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nrt</column-name><column-value><![CDATA[");
		sb.append(getNrt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dwt</column-name><column-value><![CDATA[");
		sb.append(getDwt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>length</column-name><column-value><![CDATA[");
		sb.append(getLength());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>width</column-name><column-value><![CDATA[");
		sb.append(getWidth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>height</column-name><column-value><![CDATA[");
		sb.append(getHeight());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sailingSpeed</column-name><column-value><![CDATA[");
		sb.append(getSailingSpeed());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>color</column-name><column-value><![CDATA[");
		sb.append(getColor());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>boneCode</column-name><column-value><![CDATA[");
		sb.append(getBoneCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>machineCode</column-name><column-value><![CDATA[");
		sb.append(getMachineCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipAgencyId</column-name><column-value><![CDATA[");
		sb.append(getShipAgencyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipAgencyCode</column-name><column-value><![CDATA[");
		sb.append(getShipAgencyCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fishingBoatRegistration</column-name><column-value><![CDATA[");
		sb.append(getFishingBoatRegistration());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>roleShip</column-name><column-value><![CDATA[");
		sb.append(getRoleShip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isDelete</column-name><column-value><![CDATA[");
		sb.append(getIsDelete());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markedAsDelete</column-name><column-value><![CDATA[");
		sb.append(getMarkedAsDelete());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requestedDate</column-name><column-value><![CDATA[");
		sb.append(getRequestedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>syncVersion</column-name><column-value><![CDATA[");
		sb.append(getSyncVersion());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private int _shipId;
	private String _shipName;
	private int _shipTypeId;
	private String _shipTypeCode;
	private String _imo;
	private String _callSign;
	private String _stateId;
	private String _stateCode;
	private String _registryNumber;
	private Date _registryDate;
	private int _registryPortId;
	private String _registryPortCode;
	private double _gt;
	private double _nrt;
	private double _dwt;
	private double _length;
	private double _width;
	private double _height;
	private double _sailingSpeed;
	private String _color;
	private String _boneCode;
	private String _machineCode;
	private int _shipAgencyId;
	private String _shipAgencyCode;
	private String _fishingBoatRegistration;
	private int _roleShip;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private BaseModel<?> _historyRmdcShipRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.class;
}