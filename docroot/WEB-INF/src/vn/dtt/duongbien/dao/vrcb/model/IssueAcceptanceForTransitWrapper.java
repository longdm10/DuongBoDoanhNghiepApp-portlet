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
 * This class is a wrapper for {@link IssueAcceptanceForTransit}.
 * </p>
 *
 * @author longdm
 * @see IssueAcceptanceForTransit
 * @generated
 */
public class IssueAcceptanceForTransitWrapper
	implements IssueAcceptanceForTransit,
		ModelWrapper<IssueAcceptanceForTransit> {
	public IssueAcceptanceForTransitWrapper(
		IssueAcceptanceForTransit issueAcceptanceForTransit) {
		_issueAcceptanceForTransit = issueAcceptanceForTransit;
	}

	@Override
	public Class<?> getModelClass() {
		return IssueAcceptanceForTransit.class;
	}

	@Override
	public String getModelClassName() {
		return IssueAcceptanceForTransit.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("requestCode", getRequestCode());
		attributes.put("numberAcceptanceForTransit",
			getNumberAcceptanceForTransit());
		attributes.put("documentName", getDocumentName());
		attributes.put("documentYear", getDocumentYear());
		attributes.put("nameOfShip", getNameOfShip());
		attributes.put("flagStateOfShip", getFlagStateOfShip());
		attributes.put("callSign", getCallSign());
		attributes.put("nameOfMaster", getNameOfMaster());
		attributes.put("loa", getLoa());
		attributes.put("unitLOA", getUnitLOA());
		attributes.put("breadth", getBreadth());
		attributes.put("unitBreadth", getUnitBreadth());
		attributes.put("grossTonnage", getGrossTonnage());
		attributes.put("grossTonnageUnit", getGrossTonnageUnit());
		attributes.put("netTonnage", getNetTonnage());
		attributes.put("netTonnageUnit", getNetTonnageUnit());
		attributes.put("dwt", getDwt());
		attributes.put("unitDWT", getUnitDWT());
		attributes.put("shownDraftxF", getShownDraftxF());
		attributes.put("unitShownDraftxF", getUnitShownDraftxF());
		attributes.put("shownDraftxA", getShownDraftxA());
		attributes.put("unitShownDraftxA", getUnitShownDraftxA());
		attributes.put("clearanceHeight", getClearanceHeight());
		attributes.put("unitClearanceHeight", getUnitClearanceHeight());
		attributes.put("permittedTransitFrom", getPermittedTransitFrom());
		attributes.put("permittedTransitTo", getPermittedTransitTo());
		attributes.put("timeOfDeparture", getTimeOfDeparture());

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

		String numberAcceptanceForTransit = (String)attributes.get(
				"numberAcceptanceForTransit");

		if (numberAcceptanceForTransit != null) {
			setNumberAcceptanceForTransit(numberAcceptanceForTransit);
		}

		Long documentName = (Long)attributes.get("documentName");

		if (documentName != null) {
			setDocumentName(documentName);
		}

		Integer documentYear = (Integer)attributes.get("documentYear");

		if (documentYear != null) {
			setDocumentYear(documentYear);
		}

		String nameOfShip = (String)attributes.get("nameOfShip");

		if (nameOfShip != null) {
			setNameOfShip(nameOfShip);
		}

		String flagStateOfShip = (String)attributes.get("flagStateOfShip");

		if (flagStateOfShip != null) {
			setFlagStateOfShip(flagStateOfShip);
		}

		String callSign = (String)attributes.get("callSign");

		if (callSign != null) {
			setCallSign(callSign);
		}

		String nameOfMaster = (String)attributes.get("nameOfMaster");

		if (nameOfMaster != null) {
			setNameOfMaster(nameOfMaster);
		}

		Double loa = (Double)attributes.get("loa");

		if (loa != null) {
			setLoa(loa);
		}

		String unitLOA = (String)attributes.get("unitLOA");

		if (unitLOA != null) {
			setUnitLOA(unitLOA);
		}

		Double breadth = (Double)attributes.get("breadth");

		if (breadth != null) {
			setBreadth(breadth);
		}

		String unitBreadth = (String)attributes.get("unitBreadth");

		if (unitBreadth != null) {
			setUnitBreadth(unitBreadth);
		}

		Double grossTonnage = (Double)attributes.get("grossTonnage");

		if (grossTonnage != null) {
			setGrossTonnage(grossTonnage);
		}

		String grossTonnageUnit = (String)attributes.get("grossTonnageUnit");

		if (grossTonnageUnit != null) {
			setGrossTonnageUnit(grossTonnageUnit);
		}

		Double netTonnage = (Double)attributes.get("netTonnage");

		if (netTonnage != null) {
			setNetTonnage(netTonnage);
		}

		String netTonnageUnit = (String)attributes.get("netTonnageUnit");

		if (netTonnageUnit != null) {
			setNetTonnageUnit(netTonnageUnit);
		}

		Double dwt = (Double)attributes.get("dwt");

		if (dwt != null) {
			setDwt(dwt);
		}

		String unitDWT = (String)attributes.get("unitDWT");

		if (unitDWT != null) {
			setUnitDWT(unitDWT);
		}

		Double shownDraftxF = (Double)attributes.get("shownDraftxF");

		if (shownDraftxF != null) {
			setShownDraftxF(shownDraftxF);
		}

		String unitShownDraftxF = (String)attributes.get("unitShownDraftxF");

		if (unitShownDraftxF != null) {
			setUnitShownDraftxF(unitShownDraftxF);
		}

		Double shownDraftxA = (Double)attributes.get("shownDraftxA");

		if (shownDraftxA != null) {
			setShownDraftxA(shownDraftxA);
		}

		String unitShownDraftxA = (String)attributes.get("unitShownDraftxA");

		if (unitShownDraftxA != null) {
			setUnitShownDraftxA(unitShownDraftxA);
		}

		Double clearanceHeight = (Double)attributes.get("clearanceHeight");

		if (clearanceHeight != null) {
			setClearanceHeight(clearanceHeight);
		}

		String unitClearanceHeight = (String)attributes.get(
				"unitClearanceHeight");

		if (unitClearanceHeight != null) {
			setUnitClearanceHeight(unitClearanceHeight);
		}

		Date permittedTransitFrom = (Date)attributes.get("permittedTransitFrom");

		if (permittedTransitFrom != null) {
			setPermittedTransitFrom(permittedTransitFrom);
		}

		Date permittedTransitTo = (Date)attributes.get("permittedTransitTo");

		if (permittedTransitTo != null) {
			setPermittedTransitTo(permittedTransitTo);
		}

		Date timeOfDeparture = (Date)attributes.get("timeOfDeparture");

		if (timeOfDeparture != null) {
			setTimeOfDeparture(timeOfDeparture);
		}
	}

	/**
	* Returns the primary key of this issue acceptance for transit.
	*
	* @return the primary key of this issue acceptance for transit
	*/
	@Override
	public long getPrimaryKey() {
		return _issueAcceptanceForTransit.getPrimaryKey();
	}

	/**
	* Sets the primary key of this issue acceptance for transit.
	*
	* @param primaryKey the primary key of this issue acceptance for transit
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_issueAcceptanceForTransit.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this issue acceptance for transit.
	*
	* @return the ID of this issue acceptance for transit
	*/
	@Override
	public long getId() {
		return _issueAcceptanceForTransit.getId();
	}

	/**
	* Sets the ID of this issue acceptance for transit.
	*
	* @param id the ID of this issue acceptance for transit
	*/
	@Override
	public void setId(long id) {
		_issueAcceptanceForTransit.setId(id);
	}

	/**
	* Returns the request code of this issue acceptance for transit.
	*
	* @return the request code of this issue acceptance for transit
	*/
	@Override
	public java.lang.String getRequestCode() {
		return _issueAcceptanceForTransit.getRequestCode();
	}

	/**
	* Sets the request code of this issue acceptance for transit.
	*
	* @param requestCode the request code of this issue acceptance for transit
	*/
	@Override
	public void setRequestCode(java.lang.String requestCode) {
		_issueAcceptanceForTransit.setRequestCode(requestCode);
	}

	/**
	* Returns the number acceptance for transit of this issue acceptance for transit.
	*
	* @return the number acceptance for transit of this issue acceptance for transit
	*/
	@Override
	public java.lang.String getNumberAcceptanceForTransit() {
		return _issueAcceptanceForTransit.getNumberAcceptanceForTransit();
	}

	/**
	* Sets the number acceptance for transit of this issue acceptance for transit.
	*
	* @param numberAcceptanceForTransit the number acceptance for transit of this issue acceptance for transit
	*/
	@Override
	public void setNumberAcceptanceForTransit(
		java.lang.String numberAcceptanceForTransit) {
		_issueAcceptanceForTransit.setNumberAcceptanceForTransit(numberAcceptanceForTransit);
	}

	/**
	* Returns the document name of this issue acceptance for transit.
	*
	* @return the document name of this issue acceptance for transit
	*/
	@Override
	public long getDocumentName() {
		return _issueAcceptanceForTransit.getDocumentName();
	}

	/**
	* Sets the document name of this issue acceptance for transit.
	*
	* @param documentName the document name of this issue acceptance for transit
	*/
	@Override
	public void setDocumentName(long documentName) {
		_issueAcceptanceForTransit.setDocumentName(documentName);
	}

	/**
	* Returns the document year of this issue acceptance for transit.
	*
	* @return the document year of this issue acceptance for transit
	*/
	@Override
	public int getDocumentYear() {
		return _issueAcceptanceForTransit.getDocumentYear();
	}

	/**
	* Sets the document year of this issue acceptance for transit.
	*
	* @param documentYear the document year of this issue acceptance for transit
	*/
	@Override
	public void setDocumentYear(int documentYear) {
		_issueAcceptanceForTransit.setDocumentYear(documentYear);
	}

	/**
	* Returns the name of ship of this issue acceptance for transit.
	*
	* @return the name of ship of this issue acceptance for transit
	*/
	@Override
	public java.lang.String getNameOfShip() {
		return _issueAcceptanceForTransit.getNameOfShip();
	}

	/**
	* Sets the name of ship of this issue acceptance for transit.
	*
	* @param nameOfShip the name of ship of this issue acceptance for transit
	*/
	@Override
	public void setNameOfShip(java.lang.String nameOfShip) {
		_issueAcceptanceForTransit.setNameOfShip(nameOfShip);
	}

	/**
	* Returns the flag state of ship of this issue acceptance for transit.
	*
	* @return the flag state of ship of this issue acceptance for transit
	*/
	@Override
	public java.lang.String getFlagStateOfShip() {
		return _issueAcceptanceForTransit.getFlagStateOfShip();
	}

	/**
	* Sets the flag state of ship of this issue acceptance for transit.
	*
	* @param flagStateOfShip the flag state of ship of this issue acceptance for transit
	*/
	@Override
	public void setFlagStateOfShip(java.lang.String flagStateOfShip) {
		_issueAcceptanceForTransit.setFlagStateOfShip(flagStateOfShip);
	}

	/**
	* Returns the call sign of this issue acceptance for transit.
	*
	* @return the call sign of this issue acceptance for transit
	*/
	@Override
	public java.lang.String getCallSign() {
		return _issueAcceptanceForTransit.getCallSign();
	}

	/**
	* Sets the call sign of this issue acceptance for transit.
	*
	* @param callSign the call sign of this issue acceptance for transit
	*/
	@Override
	public void setCallSign(java.lang.String callSign) {
		_issueAcceptanceForTransit.setCallSign(callSign);
	}

	/**
	* Returns the name of master of this issue acceptance for transit.
	*
	* @return the name of master of this issue acceptance for transit
	*/
	@Override
	public java.lang.String getNameOfMaster() {
		return _issueAcceptanceForTransit.getNameOfMaster();
	}

	/**
	* Sets the name of master of this issue acceptance for transit.
	*
	* @param nameOfMaster the name of master of this issue acceptance for transit
	*/
	@Override
	public void setNameOfMaster(java.lang.String nameOfMaster) {
		_issueAcceptanceForTransit.setNameOfMaster(nameOfMaster);
	}

	/**
	* Returns the loa of this issue acceptance for transit.
	*
	* @return the loa of this issue acceptance for transit
	*/
	@Override
	public double getLoa() {
		return _issueAcceptanceForTransit.getLoa();
	}

	/**
	* Sets the loa of this issue acceptance for transit.
	*
	* @param loa the loa of this issue acceptance for transit
	*/
	@Override
	public void setLoa(double loa) {
		_issueAcceptanceForTransit.setLoa(loa);
	}

	/**
	* Returns the unit l o a of this issue acceptance for transit.
	*
	* @return the unit l o a of this issue acceptance for transit
	*/
	@Override
	public java.lang.String getUnitLOA() {
		return _issueAcceptanceForTransit.getUnitLOA();
	}

	/**
	* Sets the unit l o a of this issue acceptance for transit.
	*
	* @param unitLOA the unit l o a of this issue acceptance for transit
	*/
	@Override
	public void setUnitLOA(java.lang.String unitLOA) {
		_issueAcceptanceForTransit.setUnitLOA(unitLOA);
	}

	/**
	* Returns the breadth of this issue acceptance for transit.
	*
	* @return the breadth of this issue acceptance for transit
	*/
	@Override
	public double getBreadth() {
		return _issueAcceptanceForTransit.getBreadth();
	}

	/**
	* Sets the breadth of this issue acceptance for transit.
	*
	* @param breadth the breadth of this issue acceptance for transit
	*/
	@Override
	public void setBreadth(double breadth) {
		_issueAcceptanceForTransit.setBreadth(breadth);
	}

	/**
	* Returns the unit breadth of this issue acceptance for transit.
	*
	* @return the unit breadth of this issue acceptance for transit
	*/
	@Override
	public java.lang.String getUnitBreadth() {
		return _issueAcceptanceForTransit.getUnitBreadth();
	}

	/**
	* Sets the unit breadth of this issue acceptance for transit.
	*
	* @param unitBreadth the unit breadth of this issue acceptance for transit
	*/
	@Override
	public void setUnitBreadth(java.lang.String unitBreadth) {
		_issueAcceptanceForTransit.setUnitBreadth(unitBreadth);
	}

	/**
	* Returns the gross tonnage of this issue acceptance for transit.
	*
	* @return the gross tonnage of this issue acceptance for transit
	*/
	@Override
	public double getGrossTonnage() {
		return _issueAcceptanceForTransit.getGrossTonnage();
	}

	/**
	* Sets the gross tonnage of this issue acceptance for transit.
	*
	* @param grossTonnage the gross tonnage of this issue acceptance for transit
	*/
	@Override
	public void setGrossTonnage(double grossTonnage) {
		_issueAcceptanceForTransit.setGrossTonnage(grossTonnage);
	}

	/**
	* Returns the gross tonnage unit of this issue acceptance for transit.
	*
	* @return the gross tonnage unit of this issue acceptance for transit
	*/
	@Override
	public java.lang.String getGrossTonnageUnit() {
		return _issueAcceptanceForTransit.getGrossTonnageUnit();
	}

	/**
	* Sets the gross tonnage unit of this issue acceptance for transit.
	*
	* @param grossTonnageUnit the gross tonnage unit of this issue acceptance for transit
	*/
	@Override
	public void setGrossTonnageUnit(java.lang.String grossTonnageUnit) {
		_issueAcceptanceForTransit.setGrossTonnageUnit(grossTonnageUnit);
	}

	/**
	* Returns the net tonnage of this issue acceptance for transit.
	*
	* @return the net tonnage of this issue acceptance for transit
	*/
	@Override
	public double getNetTonnage() {
		return _issueAcceptanceForTransit.getNetTonnage();
	}

	/**
	* Sets the net tonnage of this issue acceptance for transit.
	*
	* @param netTonnage the net tonnage of this issue acceptance for transit
	*/
	@Override
	public void setNetTonnage(double netTonnage) {
		_issueAcceptanceForTransit.setNetTonnage(netTonnage);
	}

	/**
	* Returns the net tonnage unit of this issue acceptance for transit.
	*
	* @return the net tonnage unit of this issue acceptance for transit
	*/
	@Override
	public java.lang.String getNetTonnageUnit() {
		return _issueAcceptanceForTransit.getNetTonnageUnit();
	}

	/**
	* Sets the net tonnage unit of this issue acceptance for transit.
	*
	* @param netTonnageUnit the net tonnage unit of this issue acceptance for transit
	*/
	@Override
	public void setNetTonnageUnit(java.lang.String netTonnageUnit) {
		_issueAcceptanceForTransit.setNetTonnageUnit(netTonnageUnit);
	}

	/**
	* Returns the dwt of this issue acceptance for transit.
	*
	* @return the dwt of this issue acceptance for transit
	*/
	@Override
	public double getDwt() {
		return _issueAcceptanceForTransit.getDwt();
	}

	/**
	* Sets the dwt of this issue acceptance for transit.
	*
	* @param dwt the dwt of this issue acceptance for transit
	*/
	@Override
	public void setDwt(double dwt) {
		_issueAcceptanceForTransit.setDwt(dwt);
	}

	/**
	* Returns the unit d w t of this issue acceptance for transit.
	*
	* @return the unit d w t of this issue acceptance for transit
	*/
	@Override
	public java.lang.String getUnitDWT() {
		return _issueAcceptanceForTransit.getUnitDWT();
	}

	/**
	* Sets the unit d w t of this issue acceptance for transit.
	*
	* @param unitDWT the unit d w t of this issue acceptance for transit
	*/
	@Override
	public void setUnitDWT(java.lang.String unitDWT) {
		_issueAcceptanceForTransit.setUnitDWT(unitDWT);
	}

	/**
	* Returns the shown draftx f of this issue acceptance for transit.
	*
	* @return the shown draftx f of this issue acceptance for transit
	*/
	@Override
	public double getShownDraftxF() {
		return _issueAcceptanceForTransit.getShownDraftxF();
	}

	/**
	* Sets the shown draftx f of this issue acceptance for transit.
	*
	* @param shownDraftxF the shown draftx f of this issue acceptance for transit
	*/
	@Override
	public void setShownDraftxF(double shownDraftxF) {
		_issueAcceptanceForTransit.setShownDraftxF(shownDraftxF);
	}

	/**
	* Returns the unit shown draftx f of this issue acceptance for transit.
	*
	* @return the unit shown draftx f of this issue acceptance for transit
	*/
	@Override
	public java.lang.String getUnitShownDraftxF() {
		return _issueAcceptanceForTransit.getUnitShownDraftxF();
	}

	/**
	* Sets the unit shown draftx f of this issue acceptance for transit.
	*
	* @param unitShownDraftxF the unit shown draftx f of this issue acceptance for transit
	*/
	@Override
	public void setUnitShownDraftxF(java.lang.String unitShownDraftxF) {
		_issueAcceptanceForTransit.setUnitShownDraftxF(unitShownDraftxF);
	}

	/**
	* Returns the shown draftx a of this issue acceptance for transit.
	*
	* @return the shown draftx a of this issue acceptance for transit
	*/
	@Override
	public double getShownDraftxA() {
		return _issueAcceptanceForTransit.getShownDraftxA();
	}

	/**
	* Sets the shown draftx a of this issue acceptance for transit.
	*
	* @param shownDraftxA the shown draftx a of this issue acceptance for transit
	*/
	@Override
	public void setShownDraftxA(double shownDraftxA) {
		_issueAcceptanceForTransit.setShownDraftxA(shownDraftxA);
	}

	/**
	* Returns the unit shown draftx a of this issue acceptance for transit.
	*
	* @return the unit shown draftx a of this issue acceptance for transit
	*/
	@Override
	public java.lang.String getUnitShownDraftxA() {
		return _issueAcceptanceForTransit.getUnitShownDraftxA();
	}

	/**
	* Sets the unit shown draftx a of this issue acceptance for transit.
	*
	* @param unitShownDraftxA the unit shown draftx a of this issue acceptance for transit
	*/
	@Override
	public void setUnitShownDraftxA(java.lang.String unitShownDraftxA) {
		_issueAcceptanceForTransit.setUnitShownDraftxA(unitShownDraftxA);
	}

	/**
	* Returns the clearance height of this issue acceptance for transit.
	*
	* @return the clearance height of this issue acceptance for transit
	*/
	@Override
	public double getClearanceHeight() {
		return _issueAcceptanceForTransit.getClearanceHeight();
	}

	/**
	* Sets the clearance height of this issue acceptance for transit.
	*
	* @param clearanceHeight the clearance height of this issue acceptance for transit
	*/
	@Override
	public void setClearanceHeight(double clearanceHeight) {
		_issueAcceptanceForTransit.setClearanceHeight(clearanceHeight);
	}

	/**
	* Returns the unit clearance height of this issue acceptance for transit.
	*
	* @return the unit clearance height of this issue acceptance for transit
	*/
	@Override
	public java.lang.String getUnitClearanceHeight() {
		return _issueAcceptanceForTransit.getUnitClearanceHeight();
	}

	/**
	* Sets the unit clearance height of this issue acceptance for transit.
	*
	* @param unitClearanceHeight the unit clearance height of this issue acceptance for transit
	*/
	@Override
	public void setUnitClearanceHeight(java.lang.String unitClearanceHeight) {
		_issueAcceptanceForTransit.setUnitClearanceHeight(unitClearanceHeight);
	}

	/**
	* Returns the permitted transit from of this issue acceptance for transit.
	*
	* @return the permitted transit from of this issue acceptance for transit
	*/
	@Override
	public java.util.Date getPermittedTransitFrom() {
		return _issueAcceptanceForTransit.getPermittedTransitFrom();
	}

	/**
	* Sets the permitted transit from of this issue acceptance for transit.
	*
	* @param permittedTransitFrom the permitted transit from of this issue acceptance for transit
	*/
	@Override
	public void setPermittedTransitFrom(java.util.Date permittedTransitFrom) {
		_issueAcceptanceForTransit.setPermittedTransitFrom(permittedTransitFrom);
	}

	/**
	* Returns the permitted transit to of this issue acceptance for transit.
	*
	* @return the permitted transit to of this issue acceptance for transit
	*/
	@Override
	public java.util.Date getPermittedTransitTo() {
		return _issueAcceptanceForTransit.getPermittedTransitTo();
	}

	/**
	* Sets the permitted transit to of this issue acceptance for transit.
	*
	* @param permittedTransitTo the permitted transit to of this issue acceptance for transit
	*/
	@Override
	public void setPermittedTransitTo(java.util.Date permittedTransitTo) {
		_issueAcceptanceForTransit.setPermittedTransitTo(permittedTransitTo);
	}

	/**
	* Returns the time of departure of this issue acceptance for transit.
	*
	* @return the time of departure of this issue acceptance for transit
	*/
	@Override
	public java.util.Date getTimeOfDeparture() {
		return _issueAcceptanceForTransit.getTimeOfDeparture();
	}

	/**
	* Sets the time of departure of this issue acceptance for transit.
	*
	* @param timeOfDeparture the time of departure of this issue acceptance for transit
	*/
	@Override
	public void setTimeOfDeparture(java.util.Date timeOfDeparture) {
		_issueAcceptanceForTransit.setTimeOfDeparture(timeOfDeparture);
	}

	@Override
	public boolean isNew() {
		return _issueAcceptanceForTransit.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_issueAcceptanceForTransit.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _issueAcceptanceForTransit.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_issueAcceptanceForTransit.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _issueAcceptanceForTransit.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _issueAcceptanceForTransit.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_issueAcceptanceForTransit.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _issueAcceptanceForTransit.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_issueAcceptanceForTransit.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_issueAcceptanceForTransit.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_issueAcceptanceForTransit.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new IssueAcceptanceForTransitWrapper((IssueAcceptanceForTransit)_issueAcceptanceForTransit.clone());
	}

	@Override
	public int compareTo(IssueAcceptanceForTransit issueAcceptanceForTransit) {
		return _issueAcceptanceForTransit.compareTo(issueAcceptanceForTransit);
	}

	@Override
	public int hashCode() {
		return _issueAcceptanceForTransit.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<IssueAcceptanceForTransit> toCacheModel() {
		return _issueAcceptanceForTransit.toCacheModel();
	}

	@Override
	public IssueAcceptanceForTransit toEscapedModel() {
		return new IssueAcceptanceForTransitWrapper(_issueAcceptanceForTransit.toEscapedModel());
	}

	@Override
	public IssueAcceptanceForTransit toUnescapedModel() {
		return new IssueAcceptanceForTransitWrapper(_issueAcceptanceForTransit.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _issueAcceptanceForTransit.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _issueAcceptanceForTransit.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_issueAcceptanceForTransit.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof IssueAcceptanceForTransitWrapper)) {
			return false;
		}

		IssueAcceptanceForTransitWrapper issueAcceptanceForTransitWrapper = (IssueAcceptanceForTransitWrapper)obj;

		if (Validator.equals(_issueAcceptanceForTransit,
					issueAcceptanceForTransitWrapper._issueAcceptanceForTransit)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public IssueAcceptanceForTransit getWrappedIssueAcceptanceForTransit() {
		return _issueAcceptanceForTransit;
	}

	@Override
	public IssueAcceptanceForTransit getWrappedModel() {
		return _issueAcceptanceForTransit;
	}

	@Override
	public void resetOriginalValues() {
		_issueAcceptanceForTransit.resetOriginalValues();
	}

	private IssueAcceptanceForTransit _issueAcceptanceForTransit;
}