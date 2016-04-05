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
 * This class is a wrapper for {@link TempDocument}.
 * </p>
 *
 * @author longdm
 * @see TempDocument
 * @generated
 */
public class TempDocumentWrapper implements TempDocument,
	ModelWrapper<TempDocument> {
	public TempDocumentWrapper(TempDocument tempDocument) {
		_tempDocument = tempDocument;
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
	}

	/**
	* Returns the primary key of this temp document.
	*
	* @return the primary key of this temp document
	*/
	@Override
	public long getPrimaryKey() {
		return _tempDocument.getPrimaryKey();
	}

	/**
	* Sets the primary key of this temp document.
	*
	* @param primaryKey the primary key of this temp document
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tempDocument.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this temp document.
	*
	* @return the ID of this temp document
	*/
	@Override
	public long getId() {
		return _tempDocument.getId();
	}

	/**
	* Sets the ID of this temp document.
	*
	* @param id the ID of this temp document
	*/
	@Override
	public void setId(long id) {
		_tempDocument.setId(id);
	}

	/**
	* Returns the request code of this temp document.
	*
	* @return the request code of this temp document
	*/
	@Override
	public java.lang.String getRequestCode() {
		return _tempDocument.getRequestCode();
	}

	/**
	* Sets the request code of this temp document.
	*
	* @param requestCode the request code of this temp document
	*/
	@Override
	public void setRequestCode(java.lang.String requestCode) {
		_tempDocument.setRequestCode(requestCode);
	}

	/**
	* Returns the request state of this temp document.
	*
	* @return the request state of this temp document
	*/
	@Override
	public int getRequestState() {
		return _tempDocument.getRequestState();
	}

	/**
	* Sets the request state of this temp document.
	*
	* @param requestState the request state of this temp document
	*/
	@Override
	public void setRequestState(int requestState) {
		_tempDocument.setRequestState(requestState);
	}

	/**
	* Returns the document name of this temp document.
	*
	* @return the document name of this temp document
	*/
	@Override
	public long getDocumentName() {
		return _tempDocument.getDocumentName();
	}

	/**
	* Sets the document name of this temp document.
	*
	* @param documentName the document name of this temp document
	*/
	@Override
	public void setDocumentName(long documentName) {
		_tempDocument.setDocumentName(documentName);
	}

	/**
	* Returns the document year of this temp document.
	*
	* @return the document year of this temp document
	*/
	@Override
	public int getDocumentYear() {
		return _tempDocument.getDocumentYear();
	}

	/**
	* Sets the document year of this temp document.
	*
	* @param documentYear the document year of this temp document
	*/
	@Override
	public void setDocumentYear(int documentYear) {
		_tempDocument.setDocumentYear(documentYear);
	}

	/**
	* Returns the document type code of this temp document.
	*
	* @return the document type code of this temp document
	*/
	@Override
	public java.lang.String getDocumentTypeCode() {
		return _tempDocument.getDocumentTypeCode();
	}

	/**
	* Sets the document type code of this temp document.
	*
	* @param documentTypeCode the document type code of this temp document
	*/
	@Override
	public void setDocumentTypeCode(java.lang.String documentTypeCode) {
		_tempDocument.setDocumentTypeCode(documentTypeCode);
	}

	/**
	* Returns the user created of this temp document.
	*
	* @return the user created of this temp document
	*/
	@Override
	public java.lang.String getUserCreated() {
		return _tempDocument.getUserCreated();
	}

	/**
	* Sets the user created of this temp document.
	*
	* @param userCreated the user created of this temp document
	*/
	@Override
	public void setUserCreated(java.lang.String userCreated) {
		_tempDocument.setUserCreated(userCreated);
	}

	/**
	* Returns the ship agency code of this temp document.
	*
	* @return the ship agency code of this temp document
	*/
	@Override
	public java.lang.String getShipAgencyCode() {
		return _tempDocument.getShipAgencyCode();
	}

	/**
	* Sets the ship agency code of this temp document.
	*
	* @param shipAgencyCode the ship agency code of this temp document
	*/
	@Override
	public void setShipAgencyCode(java.lang.String shipAgencyCode) {
		_tempDocument.setShipAgencyCode(shipAgencyCode);
	}

	/**
	* Returns the ship name of this temp document.
	*
	* @return the ship name of this temp document
	*/
	@Override
	public java.lang.String getShipName() {
		return _tempDocument.getShipName();
	}

	/**
	* Sets the ship name of this temp document.
	*
	* @param shipName the ship name of this temp document
	*/
	@Override
	public void setShipName(java.lang.String shipName) {
		_tempDocument.setShipName(shipName);
	}

	/**
	* Returns the ship type code of this temp document.
	*
	* @return the ship type code of this temp document
	*/
	@Override
	public java.lang.String getShipTypeCode() {
		return _tempDocument.getShipTypeCode();
	}

	/**
	* Sets the ship type code of this temp document.
	*
	* @param shipTypeCode the ship type code of this temp document
	*/
	@Override
	public void setShipTypeCode(java.lang.String shipTypeCode) {
		_tempDocument.setShipTypeCode(shipTypeCode);
	}

	/**
	* Returns the state code of this temp document.
	*
	* @return the state code of this temp document
	*/
	@Override
	public java.lang.String getStateCode() {
		return _tempDocument.getStateCode();
	}

	/**
	* Sets the state code of this temp document.
	*
	* @param stateCode the state code of this temp document
	*/
	@Override
	public void setStateCode(java.lang.String stateCode) {
		_tempDocument.setStateCode(stateCode);
	}

	/**
	* Returns the ship captain of this temp document.
	*
	* @return the ship captain of this temp document
	*/
	@Override
	public java.lang.String getShipCaptain() {
		return _tempDocument.getShipCaptain();
	}

	/**
	* Sets the ship captain of this temp document.
	*
	* @param shipCaptain the ship captain of this temp document
	*/
	@Override
	public void setShipCaptain(java.lang.String shipCaptain) {
		_tempDocument.setShipCaptain(shipCaptain);
	}

	/**
	* Returns the imo of this temp document.
	*
	* @return the imo of this temp document
	*/
	@Override
	public java.lang.String getImo() {
		return _tempDocument.getImo();
	}

	/**
	* Sets the imo of this temp document.
	*
	* @param imo the imo of this temp document
	*/
	@Override
	public void setImo(java.lang.String imo) {
		_tempDocument.setImo(imo);
	}

	/**
	* Returns the grt of this temp document.
	*
	* @return the grt of this temp document
	*/
	@Override
	public double getGrt() {
		return _tempDocument.getGrt();
	}

	/**
	* Sets the grt of this temp document.
	*
	* @param grt the grt of this temp document
	*/
	@Override
	public void setGrt(double grt) {
		_tempDocument.setGrt(grt);
	}

	/**
	* Returns the nt of this temp document.
	*
	* @return the nt of this temp document
	*/
	@Override
	public double getNt() {
		return _tempDocument.getNt();
	}

	/**
	* Sets the nt of this temp document.
	*
	* @param nt the nt of this temp document
	*/
	@Override
	public void setNt(double nt) {
		_tempDocument.setNt(nt);
	}

	/**
	* Returns the dwt of this temp document.
	*
	* @return the dwt of this temp document
	*/
	@Override
	public double getDwt() {
		return _tempDocument.getDwt();
	}

	/**
	* Sets the dwt of this temp document.
	*
	* @param dwt the dwt of this temp document
	*/
	@Override
	public void setDwt(double dwt) {
		_tempDocument.setDwt(dwt);
	}

	/**
	* Returns the unit g r t of this temp document.
	*
	* @return the unit g r t of this temp document
	*/
	@Override
	public java.lang.String getUnitGRT() {
		return _tempDocument.getUnitGRT();
	}

	/**
	* Sets the unit g r t of this temp document.
	*
	* @param unitGRT the unit g r t of this temp document
	*/
	@Override
	public void setUnitGRT(java.lang.String unitGRT) {
		_tempDocument.setUnitGRT(unitGRT);
	}

	/**
	* Returns the unit n t of this temp document.
	*
	* @return the unit n t of this temp document
	*/
	@Override
	public java.lang.String getUnitNT() {
		return _tempDocument.getUnitNT();
	}

	/**
	* Sets the unit n t of this temp document.
	*
	* @param unitNT the unit n t of this temp document
	*/
	@Override
	public void setUnitNT(java.lang.String unitNT) {
		_tempDocument.setUnitNT(unitNT);
	}

	/**
	* Returns the unit d w t of this temp document.
	*
	* @return the unit d w t of this temp document
	*/
	@Override
	public java.lang.String getUnitDWT() {
		return _tempDocument.getUnitDWT();
	}

	/**
	* Sets the unit d w t of this temp document.
	*
	* @param unitDWT the unit d w t of this temp document
	*/
	@Override
	public void setUnitDWT(java.lang.String unitDWT) {
		_tempDocument.setUnitDWT(unitDWT);
	}

	/**
	* Returns the call sign of this temp document.
	*
	* @return the call sign of this temp document
	*/
	@Override
	public java.lang.String getCallSign() {
		return _tempDocument.getCallSign();
	}

	/**
	* Sets the call sign of this temp document.
	*
	* @param callSign the call sign of this temp document
	*/
	@Override
	public void setCallSign(java.lang.String callSign) {
		_tempDocument.setCallSign(callSign);
	}

	/**
	* Returns the pre document name of this temp document.
	*
	* @return the pre document name of this temp document
	*/
	@Override
	public java.lang.String getPreDocumentName() {
		return _tempDocument.getPreDocumentName();
	}

	/**
	* Sets the pre document name of this temp document.
	*
	* @param preDocumentName the pre document name of this temp document
	*/
	@Override
	public void setPreDocumentName(java.lang.String preDocumentName) {
		_tempDocument.setPreDocumentName(preDocumentName);
	}

	/**
	* Returns the created date of this temp document.
	*
	* @return the created date of this temp document
	*/
	@Override
	public java.util.Date getCreatedDate() {
		return _tempDocument.getCreatedDate();
	}

	/**
	* Sets the created date of this temp document.
	*
	* @param createdDate the created date of this temp document
	*/
	@Override
	public void setCreatedDate(java.util.Date createdDate) {
		_tempDocument.setCreatedDate(createdDate);
	}

	/**
	* Returns the last modified date of this temp document.
	*
	* @return the last modified date of this temp document
	*/
	@Override
	public java.util.Date getLastModifiedDate() {
		return _tempDocument.getLastModifiedDate();
	}

	/**
	* Sets the last modified date of this temp document.
	*
	* @param lastModifiedDate the last modified date of this temp document
	*/
	@Override
	public void setLastModifiedDate(java.util.Date lastModifiedDate) {
		_tempDocument.setLastModifiedDate(lastModifiedDate);
	}

	/**
	* Returns the flow flag of this temp document.
	*
	* @return the flow flag of this temp document
	*/
	@Override
	public int getFlowFlag() {
		return _tempDocument.getFlowFlag();
	}

	/**
	* Sets the flow flag of this temp document.
	*
	* @param flowFlag the flow flag of this temp document
	*/
	@Override
	public void setFlowFlag(int flowFlag) {
		_tempDocument.setFlowFlag(flowFlag);
	}

	/**
	* Returns the document status code of this temp document.
	*
	* @return the document status code of this temp document
	*/
	@Override
	public int getDocumentStatusCode() {
		return _tempDocument.getDocumentStatusCode();
	}

	/**
	* Sets the document status code of this temp document.
	*
	* @param documentStatusCode the document status code of this temp document
	*/
	@Override
	public void setDocumentStatusCode(int documentStatusCode) {
		_tempDocument.setDocumentStatusCode(documentStatusCode);
	}

	/**
	* Returns the location code of this temp document.
	*
	* @return the location code of this temp document
	*/
	@Override
	public java.lang.String getLocationCode() {
		return _tempDocument.getLocationCode();
	}

	/**
	* Sets the location code of this temp document.
	*
	* @param locationCode the location code of this temp document
	*/
	@Override
	public void setLocationCode(java.lang.String locationCode) {
		_tempDocument.setLocationCode(locationCode);
	}

	/**
	* Returns the maritime code of this temp document.
	*
	* @return the maritime code of this temp document
	*/
	@Override
	public java.lang.String getMaritimeCode() {
		return _tempDocument.getMaritimeCode();
	}

	/**
	* Sets the maritime code of this temp document.
	*
	* @param maritimeCode the maritime code of this temp document
	*/
	@Override
	public void setMaritimeCode(java.lang.String maritimeCode) {
		_tempDocument.setMaritimeCode(maritimeCode);
	}

	/**
	* Returns the port region code of this temp document.
	*
	* @return the port region code of this temp document
	*/
	@Override
	public java.lang.String getPortRegionCode() {
		return _tempDocument.getPortRegionCode();
	}

	/**
	* Sets the port region code of this temp document.
	*
	* @param portRegionCode the port region code of this temp document
	*/
	@Override
	public void setPortRegionCode(java.lang.String portRegionCode) {
		_tempDocument.setPortRegionCode(portRegionCode);
	}

	/**
	* Returns the port code of this temp document.
	*
	* @return the port code of this temp document
	*/
	@Override
	public java.lang.String getPortCode() {
		return _tempDocument.getPortCode();
	}

	/**
	* Sets the port code of this temp document.
	*
	* @param portCode the port code of this temp document
	*/
	@Override
	public void setPortCode(java.lang.String portCode) {
		_tempDocument.setPortCode(portCode);
	}

	/**
	* Returns the last port code of this temp document.
	*
	* @return the last port code of this temp document
	*/
	@Override
	public java.lang.String getLastPortCode() {
		return _tempDocument.getLastPortCode();
	}

	/**
	* Sets the last port code of this temp document.
	*
	* @param lastPortCode the last port code of this temp document
	*/
	@Override
	public void setLastPortCode(java.lang.String lastPortCode) {
		_tempDocument.setLastPortCode(lastPortCode);
	}

	/**
	* Returns the ship position of this temp document.
	*
	* @return the ship position of this temp document
	*/
	@Override
	public int getShipPosition() {
		return _tempDocument.getShipPosition();
	}

	/**
	* Sets the ship position of this temp document.
	*
	* @param shipPosition the ship position of this temp document
	*/
	@Override
	public void setShipPosition(int shipPosition) {
		_tempDocument.setShipPosition(shipPosition);
	}

	/**
	* Returns the ship owner code of this temp document.
	*
	* @return the ship owner code of this temp document
	*/
	@Override
	public java.lang.String getShipOwnerCode() {
		return _tempDocument.getShipOwnerCode();
	}

	/**
	* Sets the ship owner code of this temp document.
	*
	* @param shipOwnerCode the ship owner code of this temp document
	*/
	@Override
	public void setShipOwnerCode(java.lang.String shipOwnerCode) {
		_tempDocument.setShipOwnerCode(shipOwnerCode);
	}

	/**
	* Returns the arrival ship agency of this temp document.
	*
	* @return the arrival ship agency of this temp document
	*/
	@Override
	public java.lang.String getArrivalShipAgency() {
		return _tempDocument.getArrivalShipAgency();
	}

	/**
	* Sets the arrival ship agency of this temp document.
	*
	* @param arrivalShipAgency the arrival ship agency of this temp document
	*/
	@Override
	public void setArrivalShipAgency(java.lang.String arrivalShipAgency) {
		_tempDocument.setArrivalShipAgency(arrivalShipAgency);
	}

	/**
	* Returns the departure ship agency of this temp document.
	*
	* @return the departure ship agency of this temp document
	*/
	@Override
	public java.lang.String getDepartureShipAgency() {
		return _tempDocument.getDepartureShipAgency();
	}

	/**
	* Sets the departure ship agency of this temp document.
	*
	* @param departureShipAgency the departure ship agency of this temp document
	*/
	@Override
	public void setDepartureShipAgency(java.lang.String departureShipAgency) {
		_tempDocument.setDepartureShipAgency(departureShipAgency);
	}

	/**
	* Returns the ship date from of this temp document.
	*
	* @return the ship date from of this temp document
	*/
	@Override
	public java.util.Date getShipDateFrom() {
		return _tempDocument.getShipDateFrom();
	}

	/**
	* Sets the ship date from of this temp document.
	*
	* @param shipDateFrom the ship date from of this temp document
	*/
	@Override
	public void setShipDateFrom(java.util.Date shipDateFrom) {
		_tempDocument.setShipDateFrom(shipDateFrom);
	}

	/**
	* Returns the ship date to of this temp document.
	*
	* @return the ship date to of this temp document
	*/
	@Override
	public java.util.Date getShipDateTo() {
		return _tempDocument.getShipDateTo();
	}

	/**
	* Sets the ship date to of this temp document.
	*
	* @param shipDateTo the ship date to of this temp document
	*/
	@Override
	public void setShipDateTo(java.util.Date shipDateTo) {
		_tempDocument.setShipDateTo(shipDateTo);
	}

	@Override
	public boolean isNew() {
		return _tempDocument.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tempDocument.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tempDocument.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tempDocument.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tempDocument.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tempDocument.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tempDocument.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tempDocument.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tempDocument.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tempDocument.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tempDocument.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TempDocumentWrapper((TempDocument)_tempDocument.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.TempDocument tempDocument) {
		return _tempDocument.compareTo(tempDocument);
	}

	@Override
	public int hashCode() {
		return _tempDocument.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.TempDocument> toCacheModel() {
		return _tempDocument.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempDocument toEscapedModel() {
		return new TempDocumentWrapper(_tempDocument.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempDocument toUnescapedModel() {
		return new TempDocumentWrapper(_tempDocument.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tempDocument.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tempDocument.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempDocument.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TempDocumentWrapper)) {
			return false;
		}

		TempDocumentWrapper tempDocumentWrapper = (TempDocumentWrapper)obj;

		if (Validator.equals(_tempDocument, tempDocumentWrapper._tempDocument)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TempDocument getWrappedTempDocument() {
		return _tempDocument;
	}

	@Override
	public TempDocument getWrappedModel() {
		return _tempDocument;
	}

	@Override
	public void resetOriginalValues() {
		_tempDocument.resetOriginalValues();
	}

	private TempDocument _tempDocument;
}