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

package vn.dtt.duongbien.dao.vrcb.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransit;
import vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransitModel;
import vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransitSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the IssueAcceptanceForTransit service. Represents a row in the &quot;ISSUE_ACCEPTANCE_FOR_TRANSIT&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransitModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link IssueAcceptanceForTransitImpl}.
 * </p>
 *
 * @author longdm
 * @see IssueAcceptanceForTransitImpl
 * @see vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransit
 * @see vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransitModel
 * @generated
 */
@JSON(strict = true)
public class IssueAcceptanceForTransitModelImpl extends BaseModelImpl<IssueAcceptanceForTransit>
	implements IssueAcceptanceForTransitModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a issue acceptance for transit model instance should use the {@link vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransit} interface instead.
	 */
	public static final String TABLE_NAME = "ISSUE_ACCEPTANCE_FOR_TRANSIT";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.BIGINT },
			{ "RequestCode", Types.VARCHAR },
			{ "NumberAcceptanceForTransit", Types.VARCHAR },
			{ "DocumentName", Types.BIGINT },
			{ "DocumentYear", Types.INTEGER },
			{ "NameOfShip", Types.VARCHAR },
			{ "FlagStateOfShip", Types.VARCHAR },
			{ "CallSign", Types.VARCHAR },
			{ "NameOfMaster", Types.VARCHAR },
			{ "LOA", Types.DOUBLE },
			{ "UnitLOA", Types.VARCHAR },
			{ "Breadth", Types.DOUBLE },
			{ "UnitBreadth", Types.VARCHAR },
			{ "GrossTonnage", Types.DOUBLE },
			{ "GrossTonnageUnit", Types.VARCHAR },
			{ "NetTonnage", Types.DOUBLE },
			{ "NetTonnageUnit", Types.VARCHAR },
			{ "DWT", Types.DOUBLE },
			{ "UnitDWT", Types.VARCHAR },
			{ "ShownDraftxF", Types.DOUBLE },
			{ "UnitShownDraftxF", Types.VARCHAR },
			{ "ShownDraftxA", Types.DOUBLE },
			{ "UnitShownDraftxA", Types.VARCHAR },
			{ "ClearanceHeight", Types.DOUBLE },
			{ "UnitClearanceHeight", Types.VARCHAR },
			{ "PermittedTransitFrom", Types.TIMESTAMP },
			{ "PermittedTransitTo", Types.TIMESTAMP },
			{ "TimeOfDeparture", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table ISSUE_ACCEPTANCE_FOR_TRANSIT (ID LONG not null primary key,RequestCode VARCHAR(75) null,NumberAcceptanceForTransit VARCHAR(75) null,DocumentName LONG,DocumentYear INTEGER,NameOfShip VARCHAR(75) null,FlagStateOfShip VARCHAR(75) null,CallSign VARCHAR(75) null,NameOfMaster VARCHAR(75) null,LOA DOUBLE,UnitLOA VARCHAR(75) null,Breadth DOUBLE,UnitBreadth VARCHAR(75) null,GrossTonnage DOUBLE,GrossTonnageUnit VARCHAR(75) null,NetTonnage DOUBLE,NetTonnageUnit VARCHAR(75) null,DWT DOUBLE,UnitDWT VARCHAR(75) null,ShownDraftxF DOUBLE,UnitShownDraftxF VARCHAR(75) null,ShownDraftxA DOUBLE,UnitShownDraftxA VARCHAR(75) null,ClearanceHeight DOUBLE,UnitClearanceHeight VARCHAR(75) null,PermittedTransitFrom DATE null,PermittedTransitTo DATE null,TimeOfDeparture DATE null)";
	public static final String TABLE_SQL_DROP = "drop table ISSUE_ACCEPTANCE_FOR_TRANSIT";
	public static final String ORDER_BY_JPQL = " ORDER BY issueAcceptanceForTransit.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY ISSUE_ACCEPTANCE_FOR_TRANSIT.ID ASC";
	public static final String DATA_SOURCE = "vaoracangbienDataSource";
	public static final String SESSION_FACTORY = "ravaocangbienSessionFactory";
	public static final String TX_MANAGER = "ravaocangbienTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransit"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransit"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransit"),
			true);
	public static long DOCUMENTNAME_COLUMN_BITMASK = 1L;
	public static long DOCUMENTYEAR_COLUMN_BITMASK = 2L;
	public static long ID_COLUMN_BITMASK = 4L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static IssueAcceptanceForTransit toModel(
		IssueAcceptanceForTransitSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		IssueAcceptanceForTransit model = new IssueAcceptanceForTransitImpl();

		model.setId(soapModel.getId());
		model.setRequestCode(soapModel.getRequestCode());
		model.setNumberAcceptanceForTransit(soapModel.getNumberAcceptanceForTransit());
		model.setDocumentName(soapModel.getDocumentName());
		model.setDocumentYear(soapModel.getDocumentYear());
		model.setNameOfShip(soapModel.getNameOfShip());
		model.setFlagStateOfShip(soapModel.getFlagStateOfShip());
		model.setCallSign(soapModel.getCallSign());
		model.setNameOfMaster(soapModel.getNameOfMaster());
		model.setLoa(soapModel.getLoa());
		model.setUnitLOA(soapModel.getUnitLOA());
		model.setBreadth(soapModel.getBreadth());
		model.setUnitBreadth(soapModel.getUnitBreadth());
		model.setGrossTonnage(soapModel.getGrossTonnage());
		model.setGrossTonnageUnit(soapModel.getGrossTonnageUnit());
		model.setNetTonnage(soapModel.getNetTonnage());
		model.setNetTonnageUnit(soapModel.getNetTonnageUnit());
		model.setDwt(soapModel.getDwt());
		model.setUnitDWT(soapModel.getUnitDWT());
		model.setShownDraftxF(soapModel.getShownDraftxF());
		model.setUnitShownDraftxF(soapModel.getUnitShownDraftxF());
		model.setShownDraftxA(soapModel.getShownDraftxA());
		model.setUnitShownDraftxA(soapModel.getUnitShownDraftxA());
		model.setClearanceHeight(soapModel.getClearanceHeight());
		model.setUnitClearanceHeight(soapModel.getUnitClearanceHeight());
		model.setPermittedTransitFrom(soapModel.getPermittedTransitFrom());
		model.setPermittedTransitTo(soapModel.getPermittedTransitTo());
		model.setTimeOfDeparture(soapModel.getTimeOfDeparture());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<IssueAcceptanceForTransit> toModels(
		IssueAcceptanceForTransitSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<IssueAcceptanceForTransit> models = new ArrayList<IssueAcceptanceForTransit>(soapModels.length);

		for (IssueAcceptanceForTransitSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbien.dao.vrcb.model.IssueAcceptanceForTransit"));

	public IssueAcceptanceForTransitModelImpl() {
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

	@JSON
	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_columnBitmask = -1L;

		_id = id;
	}

	@JSON
	@Override
	public String getRequestCode() {
		if (_requestCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _requestCode;
		}
	}

	@Override
	public void setRequestCode(String requestCode) {
		_requestCode = requestCode;
	}

	@JSON
	@Override
	public String getNumberAcceptanceForTransit() {
		if (_numberAcceptanceForTransit == null) {
			return StringPool.BLANK;
		}
		else {
			return _numberAcceptanceForTransit;
		}
	}

	@Override
	public void setNumberAcceptanceForTransit(String numberAcceptanceForTransit) {
		_numberAcceptanceForTransit = numberAcceptanceForTransit;
	}

	@JSON
	@Override
	public long getDocumentName() {
		return _documentName;
	}

	@Override
	public void setDocumentName(long documentName) {
		_columnBitmask |= DOCUMENTNAME_COLUMN_BITMASK;

		if (!_setOriginalDocumentName) {
			_setOriginalDocumentName = true;

			_originalDocumentName = _documentName;
		}

		_documentName = documentName;
	}

	public long getOriginalDocumentName() {
		return _originalDocumentName;
	}

	@JSON
	@Override
	public int getDocumentYear() {
		return _documentYear;
	}

	@Override
	public void setDocumentYear(int documentYear) {
		_columnBitmask |= DOCUMENTYEAR_COLUMN_BITMASK;

		if (!_setOriginalDocumentYear) {
			_setOriginalDocumentYear = true;

			_originalDocumentYear = _documentYear;
		}

		_documentYear = documentYear;
	}

	public int getOriginalDocumentYear() {
		return _originalDocumentYear;
	}

	@JSON
	@Override
	public String getNameOfShip() {
		if (_nameOfShip == null) {
			return StringPool.BLANK;
		}
		else {
			return _nameOfShip;
		}
	}

	@Override
	public void setNameOfShip(String nameOfShip) {
		_nameOfShip = nameOfShip;
	}

	@JSON
	@Override
	public String getFlagStateOfShip() {
		if (_flagStateOfShip == null) {
			return StringPool.BLANK;
		}
		else {
			return _flagStateOfShip;
		}
	}

	@Override
	public void setFlagStateOfShip(String flagStateOfShip) {
		_flagStateOfShip = flagStateOfShip;
	}

	@JSON
	@Override
	public String getCallSign() {
		if (_callSign == null) {
			return StringPool.BLANK;
		}
		else {
			return _callSign;
		}
	}

	@Override
	public void setCallSign(String callSign) {
		_callSign = callSign;
	}

	@JSON
	@Override
	public String getNameOfMaster() {
		if (_nameOfMaster == null) {
			return StringPool.BLANK;
		}
		else {
			return _nameOfMaster;
		}
	}

	@Override
	public void setNameOfMaster(String nameOfMaster) {
		_nameOfMaster = nameOfMaster;
	}

	@JSON
	@Override
	public double getLoa() {
		return _loa;
	}

	@Override
	public void setLoa(double loa) {
		_loa = loa;
	}

	@JSON
	@Override
	public String getUnitLOA() {
		if (_unitLOA == null) {
			return StringPool.BLANK;
		}
		else {
			return _unitLOA;
		}
	}

	@Override
	public void setUnitLOA(String unitLOA) {
		_unitLOA = unitLOA;
	}

	@JSON
	@Override
	public double getBreadth() {
		return _breadth;
	}

	@Override
	public void setBreadth(double breadth) {
		_breadth = breadth;
	}

	@JSON
	@Override
	public String getUnitBreadth() {
		if (_unitBreadth == null) {
			return StringPool.BLANK;
		}
		else {
			return _unitBreadth;
		}
	}

	@Override
	public void setUnitBreadth(String unitBreadth) {
		_unitBreadth = unitBreadth;
	}

	@JSON
	@Override
	public double getGrossTonnage() {
		return _grossTonnage;
	}

	@Override
	public void setGrossTonnage(double grossTonnage) {
		_grossTonnage = grossTonnage;
	}

	@JSON
	@Override
	public String getGrossTonnageUnit() {
		if (_grossTonnageUnit == null) {
			return StringPool.BLANK;
		}
		else {
			return _grossTonnageUnit;
		}
	}

	@Override
	public void setGrossTonnageUnit(String grossTonnageUnit) {
		_grossTonnageUnit = grossTonnageUnit;
	}

	@JSON
	@Override
	public double getNetTonnage() {
		return _netTonnage;
	}

	@Override
	public void setNetTonnage(double netTonnage) {
		_netTonnage = netTonnage;
	}

	@JSON
	@Override
	public String getNetTonnageUnit() {
		if (_netTonnageUnit == null) {
			return StringPool.BLANK;
		}
		else {
			return _netTonnageUnit;
		}
	}

	@Override
	public void setNetTonnageUnit(String netTonnageUnit) {
		_netTonnageUnit = netTonnageUnit;
	}

	@JSON
	@Override
	public double getDwt() {
		return _dwt;
	}

	@Override
	public void setDwt(double dwt) {
		_dwt = dwt;
	}

	@JSON
	@Override
	public String getUnitDWT() {
		if (_unitDWT == null) {
			return StringPool.BLANK;
		}
		else {
			return _unitDWT;
		}
	}

	@Override
	public void setUnitDWT(String unitDWT) {
		_unitDWT = unitDWT;
	}

	@JSON
	@Override
	public double getShownDraftxF() {
		return _shownDraftxF;
	}

	@Override
	public void setShownDraftxF(double shownDraftxF) {
		_shownDraftxF = shownDraftxF;
	}

	@JSON
	@Override
	public String getUnitShownDraftxF() {
		if (_unitShownDraftxF == null) {
			return StringPool.BLANK;
		}
		else {
			return _unitShownDraftxF;
		}
	}

	@Override
	public void setUnitShownDraftxF(String unitShownDraftxF) {
		_unitShownDraftxF = unitShownDraftxF;
	}

	@JSON
	@Override
	public double getShownDraftxA() {
		return _shownDraftxA;
	}

	@Override
	public void setShownDraftxA(double shownDraftxA) {
		_shownDraftxA = shownDraftxA;
	}

	@JSON
	@Override
	public String getUnitShownDraftxA() {
		if (_unitShownDraftxA == null) {
			return StringPool.BLANK;
		}
		else {
			return _unitShownDraftxA;
		}
	}

	@Override
	public void setUnitShownDraftxA(String unitShownDraftxA) {
		_unitShownDraftxA = unitShownDraftxA;
	}

	@JSON
	@Override
	public double getClearanceHeight() {
		return _clearanceHeight;
	}

	@Override
	public void setClearanceHeight(double clearanceHeight) {
		_clearanceHeight = clearanceHeight;
	}

	@JSON
	@Override
	public String getUnitClearanceHeight() {
		if (_unitClearanceHeight == null) {
			return StringPool.BLANK;
		}
		else {
			return _unitClearanceHeight;
		}
	}

	@Override
	public void setUnitClearanceHeight(String unitClearanceHeight) {
		_unitClearanceHeight = unitClearanceHeight;
	}

	@JSON
	@Override
	public Date getPermittedTransitFrom() {
		return _permittedTransitFrom;
	}

	@Override
	public void setPermittedTransitFrom(Date permittedTransitFrom) {
		_permittedTransitFrom = permittedTransitFrom;
	}

	@JSON
	@Override
	public Date getPermittedTransitTo() {
		return _permittedTransitTo;
	}

	@Override
	public void setPermittedTransitTo(Date permittedTransitTo) {
		_permittedTransitTo = permittedTransitTo;
	}

	@JSON
	@Override
	public Date getTimeOfDeparture() {
		return _timeOfDeparture;
	}

	@Override
	public void setTimeOfDeparture(Date timeOfDeparture) {
		_timeOfDeparture = timeOfDeparture;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			IssueAcceptanceForTransit.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public IssueAcceptanceForTransit toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (IssueAcceptanceForTransit)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		IssueAcceptanceForTransitImpl issueAcceptanceForTransitImpl = new IssueAcceptanceForTransitImpl();

		issueAcceptanceForTransitImpl.setId(getId());
		issueAcceptanceForTransitImpl.setRequestCode(getRequestCode());
		issueAcceptanceForTransitImpl.setNumberAcceptanceForTransit(getNumberAcceptanceForTransit());
		issueAcceptanceForTransitImpl.setDocumentName(getDocumentName());
		issueAcceptanceForTransitImpl.setDocumentYear(getDocumentYear());
		issueAcceptanceForTransitImpl.setNameOfShip(getNameOfShip());
		issueAcceptanceForTransitImpl.setFlagStateOfShip(getFlagStateOfShip());
		issueAcceptanceForTransitImpl.setCallSign(getCallSign());
		issueAcceptanceForTransitImpl.setNameOfMaster(getNameOfMaster());
		issueAcceptanceForTransitImpl.setLoa(getLoa());
		issueAcceptanceForTransitImpl.setUnitLOA(getUnitLOA());
		issueAcceptanceForTransitImpl.setBreadth(getBreadth());
		issueAcceptanceForTransitImpl.setUnitBreadth(getUnitBreadth());
		issueAcceptanceForTransitImpl.setGrossTonnage(getGrossTonnage());
		issueAcceptanceForTransitImpl.setGrossTonnageUnit(getGrossTonnageUnit());
		issueAcceptanceForTransitImpl.setNetTonnage(getNetTonnage());
		issueAcceptanceForTransitImpl.setNetTonnageUnit(getNetTonnageUnit());
		issueAcceptanceForTransitImpl.setDwt(getDwt());
		issueAcceptanceForTransitImpl.setUnitDWT(getUnitDWT());
		issueAcceptanceForTransitImpl.setShownDraftxF(getShownDraftxF());
		issueAcceptanceForTransitImpl.setUnitShownDraftxF(getUnitShownDraftxF());
		issueAcceptanceForTransitImpl.setShownDraftxA(getShownDraftxA());
		issueAcceptanceForTransitImpl.setUnitShownDraftxA(getUnitShownDraftxA());
		issueAcceptanceForTransitImpl.setClearanceHeight(getClearanceHeight());
		issueAcceptanceForTransitImpl.setUnitClearanceHeight(getUnitClearanceHeight());
		issueAcceptanceForTransitImpl.setPermittedTransitFrom(getPermittedTransitFrom());
		issueAcceptanceForTransitImpl.setPermittedTransitTo(getPermittedTransitTo());
		issueAcceptanceForTransitImpl.setTimeOfDeparture(getTimeOfDeparture());

		issueAcceptanceForTransitImpl.resetOriginalValues();

		return issueAcceptanceForTransitImpl;
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

		if (!(obj instanceof IssueAcceptanceForTransit)) {
			return false;
		}

		IssueAcceptanceForTransit issueAcceptanceForTransit = (IssueAcceptanceForTransit)obj;

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
	public void resetOriginalValues() {
		IssueAcceptanceForTransitModelImpl issueAcceptanceForTransitModelImpl = this;

		issueAcceptanceForTransitModelImpl._originalDocumentName = issueAcceptanceForTransitModelImpl._documentName;

		issueAcceptanceForTransitModelImpl._setOriginalDocumentName = false;

		issueAcceptanceForTransitModelImpl._originalDocumentYear = issueAcceptanceForTransitModelImpl._documentYear;

		issueAcceptanceForTransitModelImpl._setOriginalDocumentYear = false;

		issueAcceptanceForTransitModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<IssueAcceptanceForTransit> toCacheModel() {
		IssueAcceptanceForTransitCacheModel issueAcceptanceForTransitCacheModel = new IssueAcceptanceForTransitCacheModel();

		issueAcceptanceForTransitCacheModel.id = getId();

		issueAcceptanceForTransitCacheModel.requestCode = getRequestCode();

		String requestCode = issueAcceptanceForTransitCacheModel.requestCode;

		if ((requestCode != null) && (requestCode.length() == 0)) {
			issueAcceptanceForTransitCacheModel.requestCode = null;
		}

		issueAcceptanceForTransitCacheModel.numberAcceptanceForTransit = getNumberAcceptanceForTransit();

		String numberAcceptanceForTransit = issueAcceptanceForTransitCacheModel.numberAcceptanceForTransit;

		if ((numberAcceptanceForTransit != null) &&
				(numberAcceptanceForTransit.length() == 0)) {
			issueAcceptanceForTransitCacheModel.numberAcceptanceForTransit = null;
		}

		issueAcceptanceForTransitCacheModel.documentName = getDocumentName();

		issueAcceptanceForTransitCacheModel.documentYear = getDocumentYear();

		issueAcceptanceForTransitCacheModel.nameOfShip = getNameOfShip();

		String nameOfShip = issueAcceptanceForTransitCacheModel.nameOfShip;

		if ((nameOfShip != null) && (nameOfShip.length() == 0)) {
			issueAcceptanceForTransitCacheModel.nameOfShip = null;
		}

		issueAcceptanceForTransitCacheModel.flagStateOfShip = getFlagStateOfShip();

		String flagStateOfShip = issueAcceptanceForTransitCacheModel.flagStateOfShip;

		if ((flagStateOfShip != null) && (flagStateOfShip.length() == 0)) {
			issueAcceptanceForTransitCacheModel.flagStateOfShip = null;
		}

		issueAcceptanceForTransitCacheModel.callSign = getCallSign();

		String callSign = issueAcceptanceForTransitCacheModel.callSign;

		if ((callSign != null) && (callSign.length() == 0)) {
			issueAcceptanceForTransitCacheModel.callSign = null;
		}

		issueAcceptanceForTransitCacheModel.nameOfMaster = getNameOfMaster();

		String nameOfMaster = issueAcceptanceForTransitCacheModel.nameOfMaster;

		if ((nameOfMaster != null) && (nameOfMaster.length() == 0)) {
			issueAcceptanceForTransitCacheModel.nameOfMaster = null;
		}

		issueAcceptanceForTransitCacheModel.loa = getLoa();

		issueAcceptanceForTransitCacheModel.unitLOA = getUnitLOA();

		String unitLOA = issueAcceptanceForTransitCacheModel.unitLOA;

		if ((unitLOA != null) && (unitLOA.length() == 0)) {
			issueAcceptanceForTransitCacheModel.unitLOA = null;
		}

		issueAcceptanceForTransitCacheModel.breadth = getBreadth();

		issueAcceptanceForTransitCacheModel.unitBreadth = getUnitBreadth();

		String unitBreadth = issueAcceptanceForTransitCacheModel.unitBreadth;

		if ((unitBreadth != null) && (unitBreadth.length() == 0)) {
			issueAcceptanceForTransitCacheModel.unitBreadth = null;
		}

		issueAcceptanceForTransitCacheModel.grossTonnage = getGrossTonnage();

		issueAcceptanceForTransitCacheModel.grossTonnageUnit = getGrossTonnageUnit();

		String grossTonnageUnit = issueAcceptanceForTransitCacheModel.grossTonnageUnit;

		if ((grossTonnageUnit != null) && (grossTonnageUnit.length() == 0)) {
			issueAcceptanceForTransitCacheModel.grossTonnageUnit = null;
		}

		issueAcceptanceForTransitCacheModel.netTonnage = getNetTonnage();

		issueAcceptanceForTransitCacheModel.netTonnageUnit = getNetTonnageUnit();

		String netTonnageUnit = issueAcceptanceForTransitCacheModel.netTonnageUnit;

		if ((netTonnageUnit != null) && (netTonnageUnit.length() == 0)) {
			issueAcceptanceForTransitCacheModel.netTonnageUnit = null;
		}

		issueAcceptanceForTransitCacheModel.dwt = getDwt();

		issueAcceptanceForTransitCacheModel.unitDWT = getUnitDWT();

		String unitDWT = issueAcceptanceForTransitCacheModel.unitDWT;

		if ((unitDWT != null) && (unitDWT.length() == 0)) {
			issueAcceptanceForTransitCacheModel.unitDWT = null;
		}

		issueAcceptanceForTransitCacheModel.shownDraftxF = getShownDraftxF();

		issueAcceptanceForTransitCacheModel.unitShownDraftxF = getUnitShownDraftxF();

		String unitShownDraftxF = issueAcceptanceForTransitCacheModel.unitShownDraftxF;

		if ((unitShownDraftxF != null) && (unitShownDraftxF.length() == 0)) {
			issueAcceptanceForTransitCacheModel.unitShownDraftxF = null;
		}

		issueAcceptanceForTransitCacheModel.shownDraftxA = getShownDraftxA();

		issueAcceptanceForTransitCacheModel.unitShownDraftxA = getUnitShownDraftxA();

		String unitShownDraftxA = issueAcceptanceForTransitCacheModel.unitShownDraftxA;

		if ((unitShownDraftxA != null) && (unitShownDraftxA.length() == 0)) {
			issueAcceptanceForTransitCacheModel.unitShownDraftxA = null;
		}

		issueAcceptanceForTransitCacheModel.clearanceHeight = getClearanceHeight();

		issueAcceptanceForTransitCacheModel.unitClearanceHeight = getUnitClearanceHeight();

		String unitClearanceHeight = issueAcceptanceForTransitCacheModel.unitClearanceHeight;

		if ((unitClearanceHeight != null) &&
				(unitClearanceHeight.length() == 0)) {
			issueAcceptanceForTransitCacheModel.unitClearanceHeight = null;
		}

		Date permittedTransitFrom = getPermittedTransitFrom();

		if (permittedTransitFrom != null) {
			issueAcceptanceForTransitCacheModel.permittedTransitFrom = permittedTransitFrom.getTime();
		}
		else {
			issueAcceptanceForTransitCacheModel.permittedTransitFrom = Long.MIN_VALUE;
		}

		Date permittedTransitTo = getPermittedTransitTo();

		if (permittedTransitTo != null) {
			issueAcceptanceForTransitCacheModel.permittedTransitTo = permittedTransitTo.getTime();
		}
		else {
			issueAcceptanceForTransitCacheModel.permittedTransitTo = Long.MIN_VALUE;
		}

		Date timeOfDeparture = getTimeOfDeparture();

		if (timeOfDeparture != null) {
			issueAcceptanceForTransitCacheModel.timeOfDeparture = timeOfDeparture.getTime();
		}
		else {
			issueAcceptanceForTransitCacheModel.timeOfDeparture = Long.MIN_VALUE;
		}

		return issueAcceptanceForTransitCacheModel;
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

	private static ClassLoader _classLoader = IssueAcceptanceForTransit.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			IssueAcceptanceForTransit.class
		};
	private long _id;
	private String _requestCode;
	private String _numberAcceptanceForTransit;
	private long _documentName;
	private long _originalDocumentName;
	private boolean _setOriginalDocumentName;
	private int _documentYear;
	private int _originalDocumentYear;
	private boolean _setOriginalDocumentYear;
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
	private long _columnBitmask;
	private IssueAcceptanceForTransit _escapedModel;
}