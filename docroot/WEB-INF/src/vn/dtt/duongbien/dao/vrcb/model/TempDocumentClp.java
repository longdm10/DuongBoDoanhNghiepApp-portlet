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
import vn.dtt.duongbien.dao.vrcb.service.TempDocumentLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class TempDocumentClp extends BaseModelImpl<TempDocument>
	implements TempDocument {
	public TempDocumentClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TempDocument.class;
	}

	@Override
	public String getModelClassName() {
		return TempDocument.class.getName();
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
		attributes.put("documentTypeCode", getDocumentTypeCode());
		attributes.put("userCreated", getUserCreated());
		attributes.put("shipAgencyCode", getShipAgencyCode());
		attributes.put("shipName", getShipName());
		attributes.put("shipTypeCode", getShipTypeCode());
		attributes.put("stateCode", getStateCode());
		attributes.put("shipCaptain", getShipCaptain());
		attributes.put("imo", getImo());
		attributes.put("grt", getGrt());
		attributes.put("nt", getNt());
		attributes.put("dwt", getDwt());
		attributes.put("unitGRT", getUnitGRT());
		attributes.put("unitNT", getUnitNT());
		attributes.put("unitDWT", getUnitDWT());
		attributes.put("callSign", getCallSign());
		attributes.put("preDocumentName", getPreDocumentName());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("lastModifiedDate", getLastModifiedDate());
		attributes.put("flowFlag", getFlowFlag());
		attributes.put("documentStatusCode", getDocumentStatusCode());
		attributes.put("locationCode", getLocationCode());
		attributes.put("maritimeCode", getMaritimeCode());
		attributes.put("portRegionCode", getPortRegionCode());
		attributes.put("portCode", getPortCode());
		attributes.put("lastPortCode", getLastPortCode());
		attributes.put("shipPosition", getShipPosition());
		attributes.put("shipOwnerCode", getShipOwnerCode());
		attributes.put("arrivalShipAgency", getArrivalShipAgency());
		attributes.put("departureShipAgency", getDepartureShipAgency());
		attributes.put("shipDateFrom", getShipDateFrom());
		attributes.put("shipDateTo", getShipDateTo());
		attributes.put("shipDateLastCheck", getShipDateLastCheck());

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

		String documentTypeCode = (String)attributes.get("documentTypeCode");

		if (documentTypeCode != null) {
			setDocumentTypeCode(documentTypeCode);
		}

		String userCreated = (String)attributes.get("userCreated");

		if (userCreated != null) {
			setUserCreated(userCreated);
		}

		String shipAgencyCode = (String)attributes.get("shipAgencyCode");

		if (shipAgencyCode != null) {
			setShipAgencyCode(shipAgencyCode);
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

		Double nt = (Double)attributes.get("nt");

		if (nt != null) {
			setNt(nt);
		}

		Double dwt = (Double)attributes.get("dwt");

		if (dwt != null) {
			setDwt(dwt);
		}

		String unitGRT = (String)attributes.get("unitGRT");

		if (unitGRT != null) {
			setUnitGRT(unitGRT);
		}

		String unitNT = (String)attributes.get("unitNT");

		if (unitNT != null) {
			setUnitNT(unitNT);
		}

		String unitDWT = (String)attributes.get("unitDWT");

		if (unitDWT != null) {
			setUnitDWT(unitDWT);
		}

		String callSign = (String)attributes.get("callSign");

		if (callSign != null) {
			setCallSign(callSign);
		}

		String preDocumentName = (String)attributes.get("preDocumentName");

		if (preDocumentName != null) {
			setPreDocumentName(preDocumentName);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		Date lastModifiedDate = (Date)attributes.get("lastModifiedDate");

		if (lastModifiedDate != null) {
			setLastModifiedDate(lastModifiedDate);
		}

		Integer flowFlag = (Integer)attributes.get("flowFlag");

		if (flowFlag != null) {
			setFlowFlag(flowFlag);
		}

		Integer documentStatusCode = (Integer)attributes.get(
				"documentStatusCode");

		if (documentStatusCode != null) {
			setDocumentStatusCode(documentStatusCode);
		}

		String locationCode = (String)attributes.get("locationCode");

		if (locationCode != null) {
			setLocationCode(locationCode);
		}

		String maritimeCode = (String)attributes.get("maritimeCode");

		if (maritimeCode != null) {
			setMaritimeCode(maritimeCode);
		}

		String portRegionCode = (String)attributes.get("portRegionCode");

		if (portRegionCode != null) {
			setPortRegionCode(portRegionCode);
		}

		String portCode = (String)attributes.get("portCode");

		if (portCode != null) {
			setPortCode(portCode);
		}

		String lastPortCode = (String)attributes.get("lastPortCode");

		if (lastPortCode != null) {
			setLastPortCode(lastPortCode);
		}

		Integer shipPosition = (Integer)attributes.get("shipPosition");

		if (shipPosition != null) {
			setShipPosition(shipPosition);
		}

		String shipOwnerCode = (String)attributes.get("shipOwnerCode");

		if (shipOwnerCode != null) {
			setShipOwnerCode(shipOwnerCode);
		}

		String arrivalShipAgency = (String)attributes.get("arrivalShipAgency");

		if (arrivalShipAgency != null) {
			setArrivalShipAgency(arrivalShipAgency);
		}

		String departureShipAgency = (String)attributes.get(
				"departureShipAgency");

		if (departureShipAgency != null) {
			setDepartureShipAgency(departureShipAgency);
		}

		Date shipDateFrom = (Date)attributes.get("shipDateFrom");

		if (shipDateFrom != null) {
			setShipDateFrom(shipDateFrom);
		}

		Date shipDateTo = (Date)attributes.get("shipDateTo");

		if (shipDateTo != null) {
			setShipDateTo(shipDateTo);
		}

		Date shipDateLastCheck = (Date)attributes.get("shipDateLastCheck");

		if (shipDateLastCheck != null) {
			setShipDateLastCheck(shipDateLastCheck);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tempDocumentRemoteModel != null) {
			try {
				Class<?> clazz = _tempDocumentRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tempDocumentRemoteModel, id);
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

		if (_tempDocumentRemoteModel != null) {
			try {
				Class<?> clazz = _tempDocumentRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestCode", String.class);

				method.invoke(_tempDocumentRemoteModel, requestCode);
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

		if (_tempDocumentRemoteModel != null) {
			try {
				Class<?> clazz = _tempDocumentRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestState", int.class);

				method.invoke(_tempDocumentRemoteModel, requestState);
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

		if (_tempDocumentRemoteModel != null) {
			try {
				Class<?> clazz = _tempDocumentRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentName", long.class);

				method.invoke(_tempDocumentRemoteModel, documentName);
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

		if (_tempDocumentRemoteModel != null) {
			try {
				Class<?> clazz = _tempDocumentRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentYear", int.class);

				method.invoke(_tempDocumentRemoteModel, documentYear);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDocumentTypeCode() {
		return _documentTypeCode;
	}

	@Override
	public void setDocumentTypeCode(String documentTypeCode) {
		_documentTypeCode = documentTypeCode;

		if (_tempDocumentRemoteModel != null) {
			try {
				Class<?> clazz = _tempDocumentRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentTypeCode",
						String.class);

				method.invoke(_tempDocumentRemoteModel, documentTypeCode);
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

		if (_tempDocumentRemoteModel != null) {
			try {
				Class<?> clazz = _tempDocumentRemoteModel.getClass();

				Method method = clazz.getMethod("setUserCreated", String.class);

				method.invoke(_tempDocumentRemoteModel, userCreated);
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

		if (_tempDocumentRemoteModel != null) {
			try {
				Class<?> clazz = _tempDocumentRemoteModel.getClass();

				Method method = clazz.getMethod("setShipAgencyCode",
						String.class);

				method.invoke(_tempDocumentRemoteModel, shipAgencyCode);
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

		if (_tempDocumentRemoteModel != null) {
			try {
				Class<?> clazz = _tempDocumentRemoteModel.getClass();

				Method method = clazz.getMethod("setShipName", String.class);

				method.invoke(_tempDocumentRemoteModel, shipName);
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

		if (_tempDocumentRemoteModel != null) {
			try {
				Class<?> clazz = _tempDocumentRemoteModel.getClass();

				Method method = clazz.getMethod("setShipTypeCode", String.class);

				method.invoke(_tempDocumentRemoteModel, shipTypeCode);
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

		if (_tempDocumentRemoteModel != null) {
			try {
				Class<?> clazz = _tempDocumentRemoteModel.getClass();

				Method method = clazz.getMethod("setStateCode", String.class);

				method.invoke(_tempDocumentRemoteModel, stateCode);
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

		if (_tempDocumentRemoteModel != null) {
			try {
				Class<?> clazz = _tempDocumentRemoteModel.getClass();

				Method method = clazz.getMethod("setShipCaptain", String.class);

				method.invoke(_tempDocumentRemoteModel, shipCaptain);
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

		if (_tempDocumentRemoteModel != null) {
			try {
				Class<?> clazz = _tempDocumentRemoteModel.getClass();

				Method method = clazz.getMethod("setImo", String.class);

				method.invoke(_tempDocumentRemoteModel, imo);
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

		if (_tempDocumentRemoteModel != null) {
			try {
				Class<?> clazz = _tempDocumentRemoteModel.getClass();

				Method method = clazz.getMethod("setGrt", double.class);

				method.invoke(_tempDocumentRemoteModel, grt);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getNt() {
		return _nt;
	}

	@Override
	public void setNt(double nt) {
		_nt = nt;

		if (_tempDocumentRemoteModel != null) {
			try {
				Class<?> clazz = _tempDocumentRemoteModel.getClass();

				Method method = clazz.getMethod("setNt", double.class);

				method.invoke(_tempDocumentRemoteModel, nt);
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

		if (_tempDocumentRemoteModel != null) {
			try {
				Class<?> clazz = _tempDocumentRemoteModel.getClass();

				Method method = clazz.getMethod("setDwt", double.class);

				method.invoke(_tempDocumentRemoteModel, dwt);
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

		if (_tempDocumentRemoteModel != null) {
			try {
				Class<?> clazz = _tempDocumentRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitGRT", String.class);

				method.invoke(_tempDocumentRemoteModel, unitGRT);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUnitNT() {
		return _unitNT;
	}

	@Override
	public void setUnitNT(String unitNT) {
		_unitNT = unitNT;

		if (_tempDocumentRemoteModel != null) {
			try {
				Class<?> clazz = _tempDocumentRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitNT", String.class);

				method.invoke(_tempDocumentRemoteModel, unitNT);
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

		if (_tempDocumentRemoteModel != null) {
			try {
				Class<?> clazz = _tempDocumentRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitDWT", String.class);

				method.invoke(_tempDocumentRemoteModel, unitDWT);
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

		if (_tempDocumentRemoteModel != null) {
			try {
				Class<?> clazz = _tempDocumentRemoteModel.getClass();

				Method method = clazz.getMethod("setCallSign", String.class);

				method.invoke(_tempDocumentRemoteModel, callSign);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPreDocumentName() {
		return _preDocumentName;
	}

	@Override
	public void setPreDocumentName(String preDocumentName) {
		_preDocumentName = preDocumentName;

		if (_tempDocumentRemoteModel != null) {
			try {
				Class<?> clazz = _tempDocumentRemoteModel.getClass();

				Method method = clazz.getMethod("setPreDocumentName",
						String.class);

				method.invoke(_tempDocumentRemoteModel, preDocumentName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreatedDate() {
		return _createdDate;
	}

	@Override
	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;

		if (_tempDocumentRemoteModel != null) {
			try {
				Class<?> clazz = _tempDocumentRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_tempDocumentRemoteModel, createdDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getLastModifiedDate() {
		return _lastModifiedDate;
	}

	@Override
	public void setLastModifiedDate(Date lastModifiedDate) {
		_lastModifiedDate = lastModifiedDate;

		if (_tempDocumentRemoteModel != null) {
			try {
				Class<?> clazz = _tempDocumentRemoteModel.getClass();

				Method method = clazz.getMethod("setLastModifiedDate",
						Date.class);

				method.invoke(_tempDocumentRemoteModel, lastModifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getFlowFlag() {
		return _flowFlag;
	}

	@Override
	public void setFlowFlag(int flowFlag) {
		_flowFlag = flowFlag;

		if (_tempDocumentRemoteModel != null) {
			try {
				Class<?> clazz = _tempDocumentRemoteModel.getClass();

				Method method = clazz.getMethod("setFlowFlag", int.class);

				method.invoke(_tempDocumentRemoteModel, flowFlag);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDocumentStatusCode() {
		return _documentStatusCode;
	}

	@Override
	public void setDocumentStatusCode(int documentStatusCode) {
		_documentStatusCode = documentStatusCode;

		if (_tempDocumentRemoteModel != null) {
			try {
				Class<?> clazz = _tempDocumentRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentStatusCode",
						int.class);

				method.invoke(_tempDocumentRemoteModel, documentStatusCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLocationCode() {
		return _locationCode;
	}

	@Override
	public void setLocationCode(String locationCode) {
		_locationCode = locationCode;

		if (_tempDocumentRemoteModel != null) {
			try {
				Class<?> clazz = _tempDocumentRemoteModel.getClass();

				Method method = clazz.getMethod("setLocationCode", String.class);

				method.invoke(_tempDocumentRemoteModel, locationCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaritimeCode() {
		return _maritimeCode;
	}

	@Override
	public void setMaritimeCode(String maritimeCode) {
		_maritimeCode = maritimeCode;

		if (_tempDocumentRemoteModel != null) {
			try {
				Class<?> clazz = _tempDocumentRemoteModel.getClass();

				Method method = clazz.getMethod("setMaritimeCode", String.class);

				method.invoke(_tempDocumentRemoteModel, maritimeCode);
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

		if (_tempDocumentRemoteModel != null) {
			try {
				Class<?> clazz = _tempDocumentRemoteModel.getClass();

				Method method = clazz.getMethod("setPortRegionCode",
						String.class);

				method.invoke(_tempDocumentRemoteModel, portRegionCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPortCode() {
		return _portCode;
	}

	@Override
	public void setPortCode(String portCode) {
		_portCode = portCode;

		if (_tempDocumentRemoteModel != null) {
			try {
				Class<?> clazz = _tempDocumentRemoteModel.getClass();

				Method method = clazz.getMethod("setPortCode", String.class);

				method.invoke(_tempDocumentRemoteModel, portCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLastPortCode() {
		return _lastPortCode;
	}

	@Override
	public void setLastPortCode(String lastPortCode) {
		_lastPortCode = lastPortCode;

		if (_tempDocumentRemoteModel != null) {
			try {
				Class<?> clazz = _tempDocumentRemoteModel.getClass();

				Method method = clazz.getMethod("setLastPortCode", String.class);

				method.invoke(_tempDocumentRemoteModel, lastPortCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getShipPosition() {
		return _shipPosition;
	}

	@Override
	public void setShipPosition(int shipPosition) {
		_shipPosition = shipPosition;

		if (_tempDocumentRemoteModel != null) {
			try {
				Class<?> clazz = _tempDocumentRemoteModel.getClass();

				Method method = clazz.getMethod("setShipPosition", int.class);

				method.invoke(_tempDocumentRemoteModel, shipPosition);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getShipOwnerCode() {
		return _shipOwnerCode;
	}

	@Override
	public void setShipOwnerCode(String shipOwnerCode) {
		_shipOwnerCode = shipOwnerCode;

		if (_tempDocumentRemoteModel != null) {
			try {
				Class<?> clazz = _tempDocumentRemoteModel.getClass();

				Method method = clazz.getMethod("setShipOwnerCode", String.class);

				method.invoke(_tempDocumentRemoteModel, shipOwnerCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getArrivalShipAgency() {
		return _arrivalShipAgency;
	}

	@Override
	public void setArrivalShipAgency(String arrivalShipAgency) {
		_arrivalShipAgency = arrivalShipAgency;

		if (_tempDocumentRemoteModel != null) {
			try {
				Class<?> clazz = _tempDocumentRemoteModel.getClass();

				Method method = clazz.getMethod("setArrivalShipAgency",
						String.class);

				method.invoke(_tempDocumentRemoteModel, arrivalShipAgency);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDepartureShipAgency() {
		return _departureShipAgency;
	}

	@Override
	public void setDepartureShipAgency(String departureShipAgency) {
		_departureShipAgency = departureShipAgency;

		if (_tempDocumentRemoteModel != null) {
			try {
				Class<?> clazz = _tempDocumentRemoteModel.getClass();

				Method method = clazz.getMethod("setDepartureShipAgency",
						String.class);

				method.invoke(_tempDocumentRemoteModel, departureShipAgency);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getShipDateFrom() {
		return _shipDateFrom;
	}

	@Override
	public void setShipDateFrom(Date shipDateFrom) {
		_shipDateFrom = shipDateFrom;

		if (_tempDocumentRemoteModel != null) {
			try {
				Class<?> clazz = _tempDocumentRemoteModel.getClass();

				Method method = clazz.getMethod("setShipDateFrom", Date.class);

				method.invoke(_tempDocumentRemoteModel, shipDateFrom);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getShipDateTo() {
		return _shipDateTo;
	}

	@Override
	public void setShipDateTo(Date shipDateTo) {
		_shipDateTo = shipDateTo;

		if (_tempDocumentRemoteModel != null) {
			try {
				Class<?> clazz = _tempDocumentRemoteModel.getClass();

				Method method = clazz.getMethod("setShipDateTo", Date.class);

				method.invoke(_tempDocumentRemoteModel, shipDateTo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getShipDateLastCheck() {
		return _shipDateLastCheck;
	}

	@Override
	public void setShipDateLastCheck(Date shipDateLastCheck) {
		_shipDateLastCheck = shipDateLastCheck;

		if (_tempDocumentRemoteModel != null) {
			try {
				Class<?> clazz = _tempDocumentRemoteModel.getClass();

				Method method = clazz.getMethod("setShipDateLastCheck",
						Date.class);

				method.invoke(_tempDocumentRemoteModel, shipDateLastCheck);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTempDocumentRemoteModel() {
		return _tempDocumentRemoteModel;
	}

	public void setTempDocumentRemoteModel(BaseModel<?> tempDocumentRemoteModel) {
		_tempDocumentRemoteModel = tempDocumentRemoteModel;
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

		Class<?> remoteModelClass = _tempDocumentRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tempDocumentRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TempDocumentLocalServiceUtil.addTempDocument(this);
		}
		else {
			TempDocumentLocalServiceUtil.updateTempDocument(this);
		}
	}

	@Override
	public TempDocument toEscapedModel() {
		return (TempDocument)ProxyUtil.newProxyInstance(TempDocument.class.getClassLoader(),
			new Class[] { TempDocument.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempDocumentClp clone = new TempDocumentClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setRequestState(getRequestState());
		clone.setDocumentName(getDocumentName());
		clone.setDocumentYear(getDocumentYear());
		clone.setDocumentTypeCode(getDocumentTypeCode());
		clone.setUserCreated(getUserCreated());
		clone.setShipAgencyCode(getShipAgencyCode());
		clone.setShipName(getShipName());
		clone.setShipTypeCode(getShipTypeCode());
		clone.setStateCode(getStateCode());
		clone.setShipCaptain(getShipCaptain());
		clone.setImo(getImo());
		clone.setGrt(getGrt());
		clone.setNt(getNt());
		clone.setDwt(getDwt());
		clone.setUnitGRT(getUnitGRT());
		clone.setUnitNT(getUnitNT());
		clone.setUnitDWT(getUnitDWT());
		clone.setCallSign(getCallSign());
		clone.setPreDocumentName(getPreDocumentName());
		clone.setCreatedDate(getCreatedDate());
		clone.setLastModifiedDate(getLastModifiedDate());
		clone.setFlowFlag(getFlowFlag());
		clone.setDocumentStatusCode(getDocumentStatusCode());
		clone.setLocationCode(getLocationCode());
		clone.setMaritimeCode(getMaritimeCode());
		clone.setPortRegionCode(getPortRegionCode());
		clone.setPortCode(getPortCode());
		clone.setLastPortCode(getLastPortCode());
		clone.setShipPosition(getShipPosition());
		clone.setShipOwnerCode(getShipOwnerCode());
		clone.setArrivalShipAgency(getArrivalShipAgency());
		clone.setDepartureShipAgency(getDepartureShipAgency());
		clone.setShipDateFrom(getShipDateFrom());
		clone.setShipDateTo(getShipDateTo());
		clone.setShipDateLastCheck(getShipDateLastCheck());

		return clone;
	}

	@Override
	public int compareTo(TempDocument tempDocument) {
		int value = 0;

		if (getId() < tempDocument.getId()) {
			value = -1;
		}
		else if (getId() > tempDocument.getId()) {
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

		if (!(obj instanceof TempDocumentClp)) {
			return false;
		}

		TempDocumentClp tempDocument = (TempDocumentClp)obj;

		long primaryKey = tempDocument.getPrimaryKey();

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
		StringBundler sb = new StringBundler(75);

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
		sb.append(", documentTypeCode=");
		sb.append(getDocumentTypeCode());
		sb.append(", userCreated=");
		sb.append(getUserCreated());
		sb.append(", shipAgencyCode=");
		sb.append(getShipAgencyCode());
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
		sb.append(", nt=");
		sb.append(getNt());
		sb.append(", dwt=");
		sb.append(getDwt());
		sb.append(", unitGRT=");
		sb.append(getUnitGRT());
		sb.append(", unitNT=");
		sb.append(getUnitNT());
		sb.append(", unitDWT=");
		sb.append(getUnitDWT());
		sb.append(", callSign=");
		sb.append(getCallSign());
		sb.append(", preDocumentName=");
		sb.append(getPreDocumentName());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append(", lastModifiedDate=");
		sb.append(getLastModifiedDate());
		sb.append(", flowFlag=");
		sb.append(getFlowFlag());
		sb.append(", documentStatusCode=");
		sb.append(getDocumentStatusCode());
		sb.append(", locationCode=");
		sb.append(getLocationCode());
		sb.append(", maritimeCode=");
		sb.append(getMaritimeCode());
		sb.append(", portRegionCode=");
		sb.append(getPortRegionCode());
		sb.append(", portCode=");
		sb.append(getPortCode());
		sb.append(", lastPortCode=");
		sb.append(getLastPortCode());
		sb.append(", shipPosition=");
		sb.append(getShipPosition());
		sb.append(", shipOwnerCode=");
		sb.append(getShipOwnerCode());
		sb.append(", arrivalShipAgency=");
		sb.append(getArrivalShipAgency());
		sb.append(", departureShipAgency=");
		sb.append(getDepartureShipAgency());
		sb.append(", shipDateFrom=");
		sb.append(getShipDateFrom());
		sb.append(", shipDateTo=");
		sb.append(getShipDateTo());
		sb.append(", shipDateLastCheck=");
		sb.append(getShipDateLastCheck());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(115);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.TempDocument");
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
			"<column><column-name>documentTypeCode</column-name><column-value><![CDATA[");
		sb.append(getDocumentTypeCode());
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
			"<column><column-name>nt</column-name><column-value><![CDATA[");
		sb.append(getNt());
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
			"<column><column-name>unitNT</column-name><column-value><![CDATA[");
		sb.append(getUnitNT());
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
			"<column><column-name>preDocumentName</column-name><column-value><![CDATA[");
		sb.append(getPreDocumentName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdDate</column-name><column-value><![CDATA[");
		sb.append(getCreatedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lastModifiedDate</column-name><column-value><![CDATA[");
		sb.append(getLastModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>flowFlag</column-name><column-value><![CDATA[");
		sb.append(getFlowFlag());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentStatusCode</column-name><column-value><![CDATA[");
		sb.append(getDocumentStatusCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>locationCode</column-name><column-value><![CDATA[");
		sb.append(getLocationCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maritimeCode</column-name><column-value><![CDATA[");
		sb.append(getMaritimeCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portRegionCode</column-name><column-value><![CDATA[");
		sb.append(getPortRegionCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portCode</column-name><column-value><![CDATA[");
		sb.append(getPortCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lastPortCode</column-name><column-value><![CDATA[");
		sb.append(getLastPortCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipPosition</column-name><column-value><![CDATA[");
		sb.append(getShipPosition());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipOwnerCode</column-name><column-value><![CDATA[");
		sb.append(getShipOwnerCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>arrivalShipAgency</column-name><column-value><![CDATA[");
		sb.append(getArrivalShipAgency());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>departureShipAgency</column-name><column-value><![CDATA[");
		sb.append(getDepartureShipAgency());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipDateFrom</column-name><column-value><![CDATA[");
		sb.append(getShipDateFrom());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipDateTo</column-name><column-value><![CDATA[");
		sb.append(getShipDateTo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipDateLastCheck</column-name><column-value><![CDATA[");
		sb.append(getShipDateLastCheck());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private int _requestState;
	private long _documentName;
	private int _documentYear;
	private String _documentTypeCode;
	private String _userCreated;
	private String _shipAgencyCode;
	private String _shipName;
	private String _shipTypeCode;
	private String _stateCode;
	private String _shipCaptain;
	private String _imo;
	private double _grt;
	private double _nt;
	private double _dwt;
	private String _unitGRT;
	private String _unitNT;
	private String _unitDWT;
	private String _callSign;
	private String _preDocumentName;
	private Date _createdDate;
	private Date _lastModifiedDate;
	private int _flowFlag;
	private int _documentStatusCode;
	private String _locationCode;
	private String _maritimeCode;
	private String _portRegionCode;
	private String _portCode;
	private String _lastPortCode;
	private int _shipPosition;
	private String _shipOwnerCode;
	private String _arrivalShipAgency;
	private String _departureShipAgency;
	private Date _shipDateFrom;
	private Date _shipDateTo;
	private Date _shipDateLastCheck;
	private BaseModel<?> _tempDocumentRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.class;
}