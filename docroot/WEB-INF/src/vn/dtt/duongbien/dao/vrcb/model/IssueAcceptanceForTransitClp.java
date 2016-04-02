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
import vn.dtt.duongbien.dao.vrcb.service.IssueAcceptanceForTransitLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class IssueAcceptanceForTransitClp extends BaseModelImpl<IssueAcceptanceForTransit>
	implements IssueAcceptanceForTransit {
	public IssueAcceptanceForTransitClp() {
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

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_issueAcceptanceForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issueAcceptanceForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_issueAcceptanceForTransitRemoteModel, id);
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

		if (_issueAcceptanceForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issueAcceptanceForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestCode", String.class);

				method.invoke(_issueAcceptanceForTransitRemoteModel, requestCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNumberAcceptanceForTransit() {
		return _numberAcceptanceForTransit;
	}

	@Override
	public void setNumberAcceptanceForTransit(String numberAcceptanceForTransit) {
		_numberAcceptanceForTransit = numberAcceptanceForTransit;

		if (_issueAcceptanceForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issueAcceptanceForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setNumberAcceptanceForTransit",
						String.class);

				method.invoke(_issueAcceptanceForTransitRemoteModel,
					numberAcceptanceForTransit);
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

		if (_issueAcceptanceForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issueAcceptanceForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentName", long.class);

				method.invoke(_issueAcceptanceForTransitRemoteModel,
					documentName);
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

		if (_issueAcceptanceForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issueAcceptanceForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentYear", int.class);

				method.invoke(_issueAcceptanceForTransitRemoteModel,
					documentYear);
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

		if (_issueAcceptanceForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issueAcceptanceForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setNameOfShip", String.class);

				method.invoke(_issueAcceptanceForTransitRemoteModel, nameOfShip);
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

		if (_issueAcceptanceForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issueAcceptanceForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setFlagStateOfShip",
						String.class);

				method.invoke(_issueAcceptanceForTransitRemoteModel,
					flagStateOfShip);
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

		if (_issueAcceptanceForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issueAcceptanceForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setCallSign", String.class);

				method.invoke(_issueAcceptanceForTransitRemoteModel, callSign);
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

		if (_issueAcceptanceForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issueAcceptanceForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setNameOfMaster", String.class);

				method.invoke(_issueAcceptanceForTransitRemoteModel,
					nameOfMaster);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getLoa() {
		return _loa;
	}

	@Override
	public void setLoa(double loa) {
		_loa = loa;

		if (_issueAcceptanceForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issueAcceptanceForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setLoa", double.class);

				method.invoke(_issueAcceptanceForTransitRemoteModel, loa);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUnitLOA() {
		return _unitLOA;
	}

	@Override
	public void setUnitLOA(String unitLOA) {
		_unitLOA = unitLOA;

		if (_issueAcceptanceForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issueAcceptanceForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitLOA", String.class);

				method.invoke(_issueAcceptanceForTransitRemoteModel, unitLOA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getBreadth() {
		return _breadth;
	}

	@Override
	public void setBreadth(double breadth) {
		_breadth = breadth;

		if (_issueAcceptanceForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issueAcceptanceForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setBreadth", double.class);

				method.invoke(_issueAcceptanceForTransitRemoteModel, breadth);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUnitBreadth() {
		return _unitBreadth;
	}

	@Override
	public void setUnitBreadth(String unitBreadth) {
		_unitBreadth = unitBreadth;

		if (_issueAcceptanceForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issueAcceptanceForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitBreadth", String.class);

				method.invoke(_issueAcceptanceForTransitRemoteModel, unitBreadth);
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

		if (_issueAcceptanceForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issueAcceptanceForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setGrossTonnage", double.class);

				method.invoke(_issueAcceptanceForTransitRemoteModel,
					grossTonnage);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGrossTonnageUnit() {
		return _grossTonnageUnit;
	}

	@Override
	public void setGrossTonnageUnit(String grossTonnageUnit) {
		_grossTonnageUnit = grossTonnageUnit;

		if (_issueAcceptanceForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issueAcceptanceForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setGrossTonnageUnit",
						String.class);

				method.invoke(_issueAcceptanceForTransitRemoteModel,
					grossTonnageUnit);
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

		if (_issueAcceptanceForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issueAcceptanceForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setNetTonnage", double.class);

				method.invoke(_issueAcceptanceForTransitRemoteModel, netTonnage);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNetTonnageUnit() {
		return _netTonnageUnit;
	}

	@Override
	public void setNetTonnageUnit(String netTonnageUnit) {
		_netTonnageUnit = netTonnageUnit;

		if (_issueAcceptanceForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issueAcceptanceForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setNetTonnageUnit",
						String.class);

				method.invoke(_issueAcceptanceForTransitRemoteModel,
					netTonnageUnit);
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

		if (_issueAcceptanceForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issueAcceptanceForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setDwt", double.class);

				method.invoke(_issueAcceptanceForTransitRemoteModel, dwt);
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

		if (_issueAcceptanceForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issueAcceptanceForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitDWT", String.class);

				method.invoke(_issueAcceptanceForTransitRemoteModel, unitDWT);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getShownDraftxF() {
		return _shownDraftxF;
	}

	@Override
	public void setShownDraftxF(double shownDraftxF) {
		_shownDraftxF = shownDraftxF;

		if (_issueAcceptanceForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issueAcceptanceForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setShownDraftxF", double.class);

				method.invoke(_issueAcceptanceForTransitRemoteModel,
					shownDraftxF);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUnitShownDraftxF() {
		return _unitShownDraftxF;
	}

	@Override
	public void setUnitShownDraftxF(String unitShownDraftxF) {
		_unitShownDraftxF = unitShownDraftxF;

		if (_issueAcceptanceForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issueAcceptanceForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitShownDraftxF",
						String.class);

				method.invoke(_issueAcceptanceForTransitRemoteModel,
					unitShownDraftxF);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getShownDraftxA() {
		return _shownDraftxA;
	}

	@Override
	public void setShownDraftxA(double shownDraftxA) {
		_shownDraftxA = shownDraftxA;

		if (_issueAcceptanceForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issueAcceptanceForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setShownDraftxA", double.class);

				method.invoke(_issueAcceptanceForTransitRemoteModel,
					shownDraftxA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUnitShownDraftxA() {
		return _unitShownDraftxA;
	}

	@Override
	public void setUnitShownDraftxA(String unitShownDraftxA) {
		_unitShownDraftxA = unitShownDraftxA;

		if (_issueAcceptanceForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issueAcceptanceForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitShownDraftxA",
						String.class);

				method.invoke(_issueAcceptanceForTransitRemoteModel,
					unitShownDraftxA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getClearanceHeight() {
		return _clearanceHeight;
	}

	@Override
	public void setClearanceHeight(double clearanceHeight) {
		_clearanceHeight = clearanceHeight;

		if (_issueAcceptanceForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issueAcceptanceForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setClearanceHeight",
						double.class);

				method.invoke(_issueAcceptanceForTransitRemoteModel,
					clearanceHeight);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUnitClearanceHeight() {
		return _unitClearanceHeight;
	}

	@Override
	public void setUnitClearanceHeight(String unitClearanceHeight) {
		_unitClearanceHeight = unitClearanceHeight;

		if (_issueAcceptanceForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issueAcceptanceForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitClearanceHeight",
						String.class);

				method.invoke(_issueAcceptanceForTransitRemoteModel,
					unitClearanceHeight);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getPermittedTransitFrom() {
		return _permittedTransitFrom;
	}

	@Override
	public void setPermittedTransitFrom(Date permittedTransitFrom) {
		_permittedTransitFrom = permittedTransitFrom;

		if (_issueAcceptanceForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issueAcceptanceForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setPermittedTransitFrom",
						Date.class);

				method.invoke(_issueAcceptanceForTransitRemoteModel,
					permittedTransitFrom);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getPermittedTransitTo() {
		return _permittedTransitTo;
	}

	@Override
	public void setPermittedTransitTo(Date permittedTransitTo) {
		_permittedTransitTo = permittedTransitTo;

		if (_issueAcceptanceForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issueAcceptanceForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setPermittedTransitTo",
						Date.class);

				method.invoke(_issueAcceptanceForTransitRemoteModel,
					permittedTransitTo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getTimeOfDeparture() {
		return _timeOfDeparture;
	}

	@Override
	public void setTimeOfDeparture(Date timeOfDeparture) {
		_timeOfDeparture = timeOfDeparture;

		if (_issueAcceptanceForTransitRemoteModel != null) {
			try {
				Class<?> clazz = _issueAcceptanceForTransitRemoteModel.getClass();

				Method method = clazz.getMethod("setTimeOfDeparture", Date.class);

				method.invoke(_issueAcceptanceForTransitRemoteModel,
					timeOfDeparture);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getIssueAcceptanceForTransitRemoteModel() {
		return _issueAcceptanceForTransitRemoteModel;
	}

	public void setIssueAcceptanceForTransitRemoteModel(
		BaseModel<?> issueAcceptanceForTransitRemoteModel) {
		_issueAcceptanceForTransitRemoteModel = issueAcceptanceForTransitRemoteModel;
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

		Class<?> remoteModelClass = _issueAcceptanceForTransitRemoteModel.getClass();

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

		Object returnValue = method.invoke(_issueAcceptanceForTransitRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			IssueAcceptanceForTransitLocalServiceUtil.addIssueAcceptanceForTransit(this);
		}
		else {
			IssueAcceptanceForTransitLocalServiceUtil.updateIssueAcceptanceForTransit(this);
		}
	}

	@Override
	public IssueAcceptanceForTransit toEscapedModel() {
		return (IssueAcceptanceForTransit)ProxyUtil.newProxyInstance(IssueAcceptanceForTransit.class.getClassLoader(),
			new Class[] { IssueAcceptanceForTransit.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		IssueAcceptanceForTransitClp clone = new IssueAcceptanceForTransitClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setNumberAcceptanceForTransit(getNumberAcceptanceForTransit());
		clone.setDocumentName(getDocumentName());
		clone.setDocumentYear(getDocumentYear());
		clone.setNameOfShip(getNameOfShip());
		clone.setFlagStateOfShip(getFlagStateOfShip());
		clone.setCallSign(getCallSign());
		clone.setNameOfMaster(getNameOfMaster());
		clone.setLoa(getLoa());
		clone.setUnitLOA(getUnitLOA());
		clone.setBreadth(getBreadth());
		clone.setUnitBreadth(getUnitBreadth());
		clone.setGrossTonnage(getGrossTonnage());
		clone.setGrossTonnageUnit(getGrossTonnageUnit());
		clone.setNetTonnage(getNetTonnage());
		clone.setNetTonnageUnit(getNetTonnageUnit());
		clone.setDwt(getDwt());
		clone.setUnitDWT(getUnitDWT());
		clone.setShownDraftxF(getShownDraftxF());
		clone.setUnitShownDraftxF(getUnitShownDraftxF());
		clone.setShownDraftxA(getShownDraftxA());
		clone.setUnitShownDraftxA(getUnitShownDraftxA());
		clone.setClearanceHeight(getClearanceHeight());
		clone.setUnitClearanceHeight(getUnitClearanceHeight());
		clone.setPermittedTransitFrom(getPermittedTransitFrom());
		clone.setPermittedTransitTo(getPermittedTransitTo());
		clone.setTimeOfDeparture(getTimeOfDeparture());

		return clone;
	}

	@Override
	public int compareTo(IssueAcceptanceForTransit issueAcceptanceForTransit) {
		int value = 0;

		if (getId() < issueAcceptanceForTransit.getId()) {
			value = -1;
		}
		else if (getId() > issueAcceptanceForTransit.getId()) {
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

		if (!(obj instanceof IssueAcceptanceForTransitClp)) {
			return false;
		}

		IssueAcceptanceForTransitClp issueAcceptanceForTransit = (IssueAcceptanceForTransitClp)obj;

		long primaryKey = issueAcceptanceForTransit.getPrimaryKey();

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
		StringBundler sb = new StringBundler(57);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", numberAcceptanceForTransit=");
		sb.append(getNumberAcceptanceForTransit());
		sb.append(", documentName=");
		sb.append(getDocumentName());
		sb.append(", documentYear=");
		sb.append(getDocumentYear());
		sb.append(", nameOfShip=");
		sb.append(getNameOfShip());
		sb.append(", flagStateOfShip=");
		sb.append(getFlagStateOfShip());
		sb.append(", callSign=");
		sb.append(getCallSign());
		sb.append(", nameOfMaster=");
		sb.append(getNameOfMaster());
		sb.append(", loa=");
		sb.append(getLoa());
		sb.append(", unitLOA=");
		sb.append(getUnitLOA());
		sb.append(", breadth=");
		sb.append(getBreadth());
		sb.append(", unitBreadth=");
		sb.append(getUnitBreadth());
		sb.append(", grossTonnage=");
		sb.append(getGrossTonnage());
		sb.append(", grossTonnageUnit=");
		sb.append(getGrossTonnageUnit());
		sb.append(", netTonnage=");
		sb.append(getNetTonnage());
		sb.append(", netTonnageUnit=");
		sb.append(getNetTonnageUnit());
		sb.append(", dwt=");
		sb.append(getDwt());
		sb.append(", unitDWT=");
		sb.append(getUnitDWT());
		sb.append(", shownDraftxF=");
		sb.append(getShownDraftxF());
		sb.append(", unitShownDraftxF=");
		sb.append(getUnitShownDraftxF());
		sb.append(", shownDraftxA=");
		sb.append(getShownDraftxA());
		sb.append(", unitShownDraftxA=");
		sb.append(getUnitShownDraftxA());
		sb.append(", clearanceHeight=");
		sb.append(getClearanceHeight());
		sb.append(", unitClearanceHeight=");
		sb.append(getUnitClearanceHeight());
		sb.append(", permittedTransitFrom=");
		sb.append(getPermittedTransitFrom());
		sb.append(", permittedTransitTo=");
		sb.append(getPermittedTransitTo());
		sb.append(", timeOfDeparture=");
		sb.append(getTimeOfDeparture());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(88);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransit");
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
			"<column><column-name>numberAcceptanceForTransit</column-name><column-value><![CDATA[");
		sb.append(getNumberAcceptanceForTransit());
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
			"<column><column-name>nameOfShip</column-name><column-value><![CDATA[");
		sb.append(getNameOfShip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>flagStateOfShip</column-name><column-value><![CDATA[");
		sb.append(getFlagStateOfShip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>callSign</column-name><column-value><![CDATA[");
		sb.append(getCallSign());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameOfMaster</column-name><column-value><![CDATA[");
		sb.append(getNameOfMaster());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loa</column-name><column-value><![CDATA[");
		sb.append(getLoa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitLOA</column-name><column-value><![CDATA[");
		sb.append(getUnitLOA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>breadth</column-name><column-value><![CDATA[");
		sb.append(getBreadth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitBreadth</column-name><column-value><![CDATA[");
		sb.append(getUnitBreadth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>grossTonnage</column-name><column-value><![CDATA[");
		sb.append(getGrossTonnage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>grossTonnageUnit</column-name><column-value><![CDATA[");
		sb.append(getGrossTonnageUnit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>netTonnage</column-name><column-value><![CDATA[");
		sb.append(getNetTonnage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>netTonnageUnit</column-name><column-value><![CDATA[");
		sb.append(getNetTonnageUnit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dwt</column-name><column-value><![CDATA[");
		sb.append(getDwt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitDWT</column-name><column-value><![CDATA[");
		sb.append(getUnitDWT());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shownDraftxF</column-name><column-value><![CDATA[");
		sb.append(getShownDraftxF());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitShownDraftxF</column-name><column-value><![CDATA[");
		sb.append(getUnitShownDraftxF());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shownDraftxA</column-name><column-value><![CDATA[");
		sb.append(getShownDraftxA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitShownDraftxA</column-name><column-value><![CDATA[");
		sb.append(getUnitShownDraftxA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>clearanceHeight</column-name><column-value><![CDATA[");
		sb.append(getClearanceHeight());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitClearanceHeight</column-name><column-value><![CDATA[");
		sb.append(getUnitClearanceHeight());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>permittedTransitFrom</column-name><column-value><![CDATA[");
		sb.append(getPermittedTransitFrom());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>permittedTransitTo</column-name><column-value><![CDATA[");
		sb.append(getPermittedTransitTo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>timeOfDeparture</column-name><column-value><![CDATA[");
		sb.append(getTimeOfDeparture());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private String _numberAcceptanceForTransit;
	private long _documentName;
	private int _documentYear;
	private String _nameOfShip;
	private String _flagStateOfShip;
	private String _callSign;
	private String _nameOfMaster;
	private double _loa;
	private String _unitLOA;
	private double _breadth;
	private String _unitBreadth;
	private double _grossTonnage;
	private String _grossTonnageUnit;
	private double _netTonnage;
	private String _netTonnageUnit;
	private double _dwt;
	private String _unitDWT;
	private double _shownDraftxF;
	private String _unitShownDraftxF;
	private double _shownDraftxA;
	private String _unitShownDraftxA;
	private double _clearanceHeight;
	private String _unitClearanceHeight;
	private Date _permittedTransitFrom;
	private Date _permittedTransitTo;
	private Date _timeOfDeparture;
	private BaseModel<?> _issueAcceptanceForTransitRemoteModel;
}