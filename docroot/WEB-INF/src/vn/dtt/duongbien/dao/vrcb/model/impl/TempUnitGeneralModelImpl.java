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

import vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral;
import vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneralModel;
import vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneralSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the TempUnitGeneral service. Represents a row in the &quot;TEMP_UNIT_GENERAL&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneralModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TempUnitGeneralImpl}.
 * </p>
 *
 * @author longdm
 * @see TempUnitGeneralImpl
 * @see vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral
 * @see vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneralModel
 * @generated
 */
@JSON(strict = true)
public class TempUnitGeneralModelImpl extends BaseModelImpl<TempUnitGeneral>
	implements TempUnitGeneralModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a temp unit general model instance should use the {@link vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral} interface instead.
	 */
	public static final String TABLE_NAME = "TEMP_UNIT_GENERAL";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.BIGINT },
			{ "RequestCode", Types.VARCHAR },
			{ "DocumentName", Types.BIGINT },
			{ "DocumentYear", Types.INTEGER },
			{ "GrossTonnageUnit", Types.VARCHAR },
			{ "NetTonnageUnit", Types.VARCHAR },
			{ "UnitDWT", Types.VARCHAR },
			{ "UnitLOA", Types.VARCHAR },
			{ "UnitBreadth", Types.VARCHAR },
			{ "UnitClearanceHeight", Types.VARCHAR },
			{ "UnitShownDraft", Types.VARCHAR },
			{ "UnitShownDraftxF", Types.VARCHAR },
			{ "UnitShownDraftxA", Types.VARCHAR },
			{ "UnitHorsePower", Types.VARCHAR },
			{ "UnitRemainingOnBoardxB", Types.VARCHAR },
			{ "UnitRemainingOnBoardxS", Types.VARCHAR },
			{ "UnitFO", Types.VARCHAR },
			{ "UnitLO", Types.VARCHAR },
			{ "UnitFW", Types.VARCHAR },
			{ "UnitDO", Types.VARCHAR },
			{ "UnitSludgeOil", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table TEMP_UNIT_GENERAL (ID LONG not null primary key,RequestCode VARCHAR(75) null,DocumentName LONG,DocumentYear INTEGER,GrossTonnageUnit VARCHAR(75) null,NetTonnageUnit VARCHAR(75) null,UnitDWT VARCHAR(75) null,UnitLOA VARCHAR(75) null,UnitBreadth VARCHAR(75) null,UnitClearanceHeight VARCHAR(75) null,UnitShownDraft VARCHAR(75) null,UnitShownDraftxF VARCHAR(75) null,UnitShownDraftxA VARCHAR(75) null,UnitHorsePower VARCHAR(75) null,UnitRemainingOnBoardxB VARCHAR(75) null,UnitRemainingOnBoardxS VARCHAR(75) null,UnitFO VARCHAR(75) null,UnitLO VARCHAR(75) null,UnitFW VARCHAR(75) null,UnitDO VARCHAR(75) null,UnitSludgeOil VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table TEMP_UNIT_GENERAL";
	public static final String ORDER_BY_JPQL = " ORDER BY tempUnitGeneral.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY TEMP_UNIT_GENERAL.ID ASC";
	public static final String DATA_SOURCE = "vaoracangbienDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral"),
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
	public static TempUnitGeneral toModel(TempUnitGeneralSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		TempUnitGeneral model = new TempUnitGeneralImpl();

		model.setId(soapModel.getId());
		model.setRequestCode(soapModel.getRequestCode());
		model.setDocumentName(soapModel.getDocumentName());
		model.setDocumentYear(soapModel.getDocumentYear());
		model.setGrossTonnageUnit(soapModel.getGrossTonnageUnit());
		model.setNetTonnageUnit(soapModel.getNetTonnageUnit());
		model.setUnitDWT(soapModel.getUnitDWT());
		model.setUnitLOA(soapModel.getUnitLOA());
		model.setUnitBreadth(soapModel.getUnitBreadth());
		model.setUnitClearanceHeight(soapModel.getUnitClearanceHeight());
		model.setUnitShownDraft(soapModel.getUnitShownDraft());
		model.setUnitShownDraftxF(soapModel.getUnitShownDraftxF());
		model.setUnitShownDraftxA(soapModel.getUnitShownDraftxA());
		model.setUnitHorsePower(soapModel.getUnitHorsePower());
		model.setUnitRemainingOnBoardxB(soapModel.getUnitRemainingOnBoardxB());
		model.setUnitRemainingOnBoardxS(soapModel.getUnitRemainingOnBoardxS());
		model.setUnitFO(soapModel.getUnitFO());
		model.setUnitLO(soapModel.getUnitLO());
		model.setUnitFW(soapModel.getUnitFW());
		model.setUnitDO(soapModel.getUnitDO());
		model.setUnitSludgeOil(soapModel.getUnitSludgeOil());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<TempUnitGeneral> toModels(
		TempUnitGeneralSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<TempUnitGeneral> models = new ArrayList<TempUnitGeneral>(soapModels.length);

		for (TempUnitGeneralSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral"));

	public TempUnitGeneralModelImpl() {
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
		return TempUnitGeneral.class;
	}

	@Override
	public String getModelClassName() {
		return TempUnitGeneral.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("requestCode", getRequestCode());
		attributes.put("documentName", getDocumentName());
		attributes.put("documentYear", getDocumentYear());
		attributes.put("grossTonnageUnit", getGrossTonnageUnit());
		attributes.put("netTonnageUnit", getNetTonnageUnit());
		attributes.put("unitDWT", getUnitDWT());
		attributes.put("unitLOA", getUnitLOA());
		attributes.put("unitBreadth", getUnitBreadth());
		attributes.put("unitClearanceHeight", getUnitClearanceHeight());
		attributes.put("unitShownDraft", getUnitShownDraft());
		attributes.put("unitShownDraftxF", getUnitShownDraftxF());
		attributes.put("unitShownDraftxA", getUnitShownDraftxA());
		attributes.put("unitHorsePower", getUnitHorsePower());
		attributes.put("unitRemainingOnBoardxB", getUnitRemainingOnBoardxB());
		attributes.put("unitRemainingOnBoardxS", getUnitRemainingOnBoardxS());
		attributes.put("unitFO", getUnitFO());
		attributes.put("unitLO", getUnitLO());
		attributes.put("unitFW", getUnitFW());
		attributes.put("unitDO", getUnitDO());
		attributes.put("unitSludgeOil", getUnitSludgeOil());

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

		Long documentName = (Long)attributes.get("documentName");

		if (documentName != null) {
			setDocumentName(documentName);
		}

		Integer documentYear = (Integer)attributes.get("documentYear");

		if (documentYear != null) {
			setDocumentYear(documentYear);
		}

		String grossTonnageUnit = (String)attributes.get("grossTonnageUnit");

		if (grossTonnageUnit != null) {
			setGrossTonnageUnit(grossTonnageUnit);
		}

		String netTonnageUnit = (String)attributes.get("netTonnageUnit");

		if (netTonnageUnit != null) {
			setNetTonnageUnit(netTonnageUnit);
		}

		String unitDWT = (String)attributes.get("unitDWT");

		if (unitDWT != null) {
			setUnitDWT(unitDWT);
		}

		String unitLOA = (String)attributes.get("unitLOA");

		if (unitLOA != null) {
			setUnitLOA(unitLOA);
		}

		String unitBreadth = (String)attributes.get("unitBreadth");

		if (unitBreadth != null) {
			setUnitBreadth(unitBreadth);
		}

		String unitClearanceHeight = (String)attributes.get(
				"unitClearanceHeight");

		if (unitClearanceHeight != null) {
			setUnitClearanceHeight(unitClearanceHeight);
		}

		String unitShownDraft = (String)attributes.get("unitShownDraft");

		if (unitShownDraft != null) {
			setUnitShownDraft(unitShownDraft);
		}

		String unitShownDraftxF = (String)attributes.get("unitShownDraftxF");

		if (unitShownDraftxF != null) {
			setUnitShownDraftxF(unitShownDraftxF);
		}

		String unitShownDraftxA = (String)attributes.get("unitShownDraftxA");

		if (unitShownDraftxA != null) {
			setUnitShownDraftxA(unitShownDraftxA);
		}

		String unitHorsePower = (String)attributes.get("unitHorsePower");

		if (unitHorsePower != null) {
			setUnitHorsePower(unitHorsePower);
		}

		String unitRemainingOnBoardxB = (String)attributes.get(
				"unitRemainingOnBoardxB");

		if (unitRemainingOnBoardxB != null) {
			setUnitRemainingOnBoardxB(unitRemainingOnBoardxB);
		}

		String unitRemainingOnBoardxS = (String)attributes.get(
				"unitRemainingOnBoardxS");

		if (unitRemainingOnBoardxS != null) {
			setUnitRemainingOnBoardxS(unitRemainingOnBoardxS);
		}

		String unitFO = (String)attributes.get("unitFO");

		if (unitFO != null) {
			setUnitFO(unitFO);
		}

		String unitLO = (String)attributes.get("unitLO");

		if (unitLO != null) {
			setUnitLO(unitLO);
		}

		String unitFW = (String)attributes.get("unitFW");

		if (unitFW != null) {
			setUnitFW(unitFW);
		}

		String unitDO = (String)attributes.get("unitDO");

		if (unitDO != null) {
			setUnitDO(unitDO);
		}

		String unitSludgeOil = (String)attributes.get("unitSludgeOil");

		if (unitSludgeOil != null) {
			setUnitSludgeOil(unitSludgeOil);
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
	public String getUnitShownDraft() {
		if (_unitShownDraft == null) {
			return StringPool.BLANK;
		}
		else {
			return _unitShownDraft;
		}
	}

	@Override
	public void setUnitShownDraft(String unitShownDraft) {
		_unitShownDraft = unitShownDraft;
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
	public String getUnitHorsePower() {
		if (_unitHorsePower == null) {
			return StringPool.BLANK;
		}
		else {
			return _unitHorsePower;
		}
	}

	@Override
	public void setUnitHorsePower(String unitHorsePower) {
		_unitHorsePower = unitHorsePower;
	}

	@JSON
	@Override
	public String getUnitRemainingOnBoardxB() {
		if (_unitRemainingOnBoardxB == null) {
			return StringPool.BLANK;
		}
		else {
			return _unitRemainingOnBoardxB;
		}
	}

	@Override
	public void setUnitRemainingOnBoardxB(String unitRemainingOnBoardxB) {
		_unitRemainingOnBoardxB = unitRemainingOnBoardxB;
	}

	@JSON
	@Override
	public String getUnitRemainingOnBoardxS() {
		if (_unitRemainingOnBoardxS == null) {
			return StringPool.BLANK;
		}
		else {
			return _unitRemainingOnBoardxS;
		}
	}

	@Override
	public void setUnitRemainingOnBoardxS(String unitRemainingOnBoardxS) {
		_unitRemainingOnBoardxS = unitRemainingOnBoardxS;
	}

	@JSON
	@Override
	public String getUnitFO() {
		if (_unitFO == null) {
			return StringPool.BLANK;
		}
		else {
			return _unitFO;
		}
	}

	@Override
	public void setUnitFO(String unitFO) {
		_unitFO = unitFO;
	}

	@JSON
	@Override
	public String getUnitLO() {
		if (_unitLO == null) {
			return StringPool.BLANK;
		}
		else {
			return _unitLO;
		}
	}

	@Override
	public void setUnitLO(String unitLO) {
		_unitLO = unitLO;
	}

	@JSON
	@Override
	public String getUnitFW() {
		if (_unitFW == null) {
			return StringPool.BLANK;
		}
		else {
			return _unitFW;
		}
	}

	@Override
	public void setUnitFW(String unitFW) {
		_unitFW = unitFW;
	}

	@JSON
	@Override
	public String getUnitDO() {
		if (_unitDO == null) {
			return StringPool.BLANK;
		}
		else {
			return _unitDO;
		}
	}

	@Override
	public void setUnitDO(String unitDO) {
		_unitDO = unitDO;
	}

	@JSON
	@Override
	public String getUnitSludgeOil() {
		if (_unitSludgeOil == null) {
			return StringPool.BLANK;
		}
		else {
			return _unitSludgeOil;
		}
	}

	@Override
	public void setUnitSludgeOil(String unitSludgeOil) {
		_unitSludgeOil = unitSludgeOil;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			TempUnitGeneral.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TempUnitGeneral toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (TempUnitGeneral)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TempUnitGeneralImpl tempUnitGeneralImpl = new TempUnitGeneralImpl();

		tempUnitGeneralImpl.setId(getId());
		tempUnitGeneralImpl.setRequestCode(getRequestCode());
		tempUnitGeneralImpl.setDocumentName(getDocumentName());
		tempUnitGeneralImpl.setDocumentYear(getDocumentYear());
		tempUnitGeneralImpl.setGrossTonnageUnit(getGrossTonnageUnit());
		tempUnitGeneralImpl.setNetTonnageUnit(getNetTonnageUnit());
		tempUnitGeneralImpl.setUnitDWT(getUnitDWT());
		tempUnitGeneralImpl.setUnitLOA(getUnitLOA());
		tempUnitGeneralImpl.setUnitBreadth(getUnitBreadth());
		tempUnitGeneralImpl.setUnitClearanceHeight(getUnitClearanceHeight());
		tempUnitGeneralImpl.setUnitShownDraft(getUnitShownDraft());
		tempUnitGeneralImpl.setUnitShownDraftxF(getUnitShownDraftxF());
		tempUnitGeneralImpl.setUnitShownDraftxA(getUnitShownDraftxA());
		tempUnitGeneralImpl.setUnitHorsePower(getUnitHorsePower());
		tempUnitGeneralImpl.setUnitRemainingOnBoardxB(getUnitRemainingOnBoardxB());
		tempUnitGeneralImpl.setUnitRemainingOnBoardxS(getUnitRemainingOnBoardxS());
		tempUnitGeneralImpl.setUnitFO(getUnitFO());
		tempUnitGeneralImpl.setUnitLO(getUnitLO());
		tempUnitGeneralImpl.setUnitFW(getUnitFW());
		tempUnitGeneralImpl.setUnitDO(getUnitDO());
		tempUnitGeneralImpl.setUnitSludgeOil(getUnitSludgeOil());

		tempUnitGeneralImpl.resetOriginalValues();

		return tempUnitGeneralImpl;
	}

	@Override
	public int compareTo(TempUnitGeneral tempUnitGeneral) {
		int value = 0;

		if (getId() < tempUnitGeneral.getId()) {
			value = -1;
		}
		else if (getId() > tempUnitGeneral.getId()) {
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

		if (!(obj instanceof TempUnitGeneral)) {
			return false;
		}

		TempUnitGeneral tempUnitGeneral = (TempUnitGeneral)obj;

		long primaryKey = tempUnitGeneral.getPrimaryKey();

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
		TempUnitGeneralModelImpl tempUnitGeneralModelImpl = this;

		tempUnitGeneralModelImpl._originalDocumentName = tempUnitGeneralModelImpl._documentName;

		tempUnitGeneralModelImpl._setOriginalDocumentName = false;

		tempUnitGeneralModelImpl._originalDocumentYear = tempUnitGeneralModelImpl._documentYear;

		tempUnitGeneralModelImpl._setOriginalDocumentYear = false;

		tempUnitGeneralModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<TempUnitGeneral> toCacheModel() {
		TempUnitGeneralCacheModel tempUnitGeneralCacheModel = new TempUnitGeneralCacheModel();

		tempUnitGeneralCacheModel.id = getId();

		tempUnitGeneralCacheModel.requestCode = getRequestCode();

		String requestCode = tempUnitGeneralCacheModel.requestCode;

		if ((requestCode != null) && (requestCode.length() == 0)) {
			tempUnitGeneralCacheModel.requestCode = null;
		}

		tempUnitGeneralCacheModel.documentName = getDocumentName();

		tempUnitGeneralCacheModel.documentYear = getDocumentYear();

		tempUnitGeneralCacheModel.grossTonnageUnit = getGrossTonnageUnit();

		String grossTonnageUnit = tempUnitGeneralCacheModel.grossTonnageUnit;

		if ((grossTonnageUnit != null) && (grossTonnageUnit.length() == 0)) {
			tempUnitGeneralCacheModel.grossTonnageUnit = null;
		}

		tempUnitGeneralCacheModel.netTonnageUnit = getNetTonnageUnit();

		String netTonnageUnit = tempUnitGeneralCacheModel.netTonnageUnit;

		if ((netTonnageUnit != null) && (netTonnageUnit.length() == 0)) {
			tempUnitGeneralCacheModel.netTonnageUnit = null;
		}

		tempUnitGeneralCacheModel.unitDWT = getUnitDWT();

		String unitDWT = tempUnitGeneralCacheModel.unitDWT;

		if ((unitDWT != null) && (unitDWT.length() == 0)) {
			tempUnitGeneralCacheModel.unitDWT = null;
		}

		tempUnitGeneralCacheModel.unitLOA = getUnitLOA();

		String unitLOA = tempUnitGeneralCacheModel.unitLOA;

		if ((unitLOA != null) && (unitLOA.length() == 0)) {
			tempUnitGeneralCacheModel.unitLOA = null;
		}

		tempUnitGeneralCacheModel.unitBreadth = getUnitBreadth();

		String unitBreadth = tempUnitGeneralCacheModel.unitBreadth;

		if ((unitBreadth != null) && (unitBreadth.length() == 0)) {
			tempUnitGeneralCacheModel.unitBreadth = null;
		}

		tempUnitGeneralCacheModel.unitClearanceHeight = getUnitClearanceHeight();

		String unitClearanceHeight = tempUnitGeneralCacheModel.unitClearanceHeight;

		if ((unitClearanceHeight != null) &&
				(unitClearanceHeight.length() == 0)) {
			tempUnitGeneralCacheModel.unitClearanceHeight = null;
		}

		tempUnitGeneralCacheModel.unitShownDraft = getUnitShownDraft();

		String unitShownDraft = tempUnitGeneralCacheModel.unitShownDraft;

		if ((unitShownDraft != null) && (unitShownDraft.length() == 0)) {
			tempUnitGeneralCacheModel.unitShownDraft = null;
		}

		tempUnitGeneralCacheModel.unitShownDraftxF = getUnitShownDraftxF();

		String unitShownDraftxF = tempUnitGeneralCacheModel.unitShownDraftxF;

		if ((unitShownDraftxF != null) && (unitShownDraftxF.length() == 0)) {
			tempUnitGeneralCacheModel.unitShownDraftxF = null;
		}

		tempUnitGeneralCacheModel.unitShownDraftxA = getUnitShownDraftxA();

		String unitShownDraftxA = tempUnitGeneralCacheModel.unitShownDraftxA;

		if ((unitShownDraftxA != null) && (unitShownDraftxA.length() == 0)) {
			tempUnitGeneralCacheModel.unitShownDraftxA = null;
		}

		tempUnitGeneralCacheModel.unitHorsePower = getUnitHorsePower();

		String unitHorsePower = tempUnitGeneralCacheModel.unitHorsePower;

		if ((unitHorsePower != null) && (unitHorsePower.length() == 0)) {
			tempUnitGeneralCacheModel.unitHorsePower = null;
		}

		tempUnitGeneralCacheModel.unitRemainingOnBoardxB = getUnitRemainingOnBoardxB();

		String unitRemainingOnBoardxB = tempUnitGeneralCacheModel.unitRemainingOnBoardxB;

		if ((unitRemainingOnBoardxB != null) &&
				(unitRemainingOnBoardxB.length() == 0)) {
			tempUnitGeneralCacheModel.unitRemainingOnBoardxB = null;
		}

		tempUnitGeneralCacheModel.unitRemainingOnBoardxS = getUnitRemainingOnBoardxS();

		String unitRemainingOnBoardxS = tempUnitGeneralCacheModel.unitRemainingOnBoardxS;

		if ((unitRemainingOnBoardxS != null) &&
				(unitRemainingOnBoardxS.length() == 0)) {
			tempUnitGeneralCacheModel.unitRemainingOnBoardxS = null;
		}

		tempUnitGeneralCacheModel.unitFO = getUnitFO();

		String unitFO = tempUnitGeneralCacheModel.unitFO;

		if ((unitFO != null) && (unitFO.length() == 0)) {
			tempUnitGeneralCacheModel.unitFO = null;
		}

		tempUnitGeneralCacheModel.unitLO = getUnitLO();

		String unitLO = tempUnitGeneralCacheModel.unitLO;

		if ((unitLO != null) && (unitLO.length() == 0)) {
			tempUnitGeneralCacheModel.unitLO = null;
		}

		tempUnitGeneralCacheModel.unitFW = getUnitFW();

		String unitFW = tempUnitGeneralCacheModel.unitFW;

		if ((unitFW != null) && (unitFW.length() == 0)) {
			tempUnitGeneralCacheModel.unitFW = null;
		}

		tempUnitGeneralCacheModel.unitDO = getUnitDO();

		String unitDO = tempUnitGeneralCacheModel.unitDO;

		if ((unitDO != null) && (unitDO.length() == 0)) {
			tempUnitGeneralCacheModel.unitDO = null;
		}

		tempUnitGeneralCacheModel.unitSludgeOil = getUnitSludgeOil();

		String unitSludgeOil = tempUnitGeneralCacheModel.unitSludgeOil;

		if ((unitSludgeOil != null) && (unitSludgeOil.length() == 0)) {
			tempUnitGeneralCacheModel.unitSludgeOil = null;
		}

		return tempUnitGeneralCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", documentName=");
		sb.append(getDocumentName());
		sb.append(", documentYear=");
		sb.append(getDocumentYear());
		sb.append(", grossTonnageUnit=");
		sb.append(getGrossTonnageUnit());
		sb.append(", netTonnageUnit=");
		sb.append(getNetTonnageUnit());
		sb.append(", unitDWT=");
		sb.append(getUnitDWT());
		sb.append(", unitLOA=");
		sb.append(getUnitLOA());
		sb.append(", unitBreadth=");
		sb.append(getUnitBreadth());
		sb.append(", unitClearanceHeight=");
		sb.append(getUnitClearanceHeight());
		sb.append(", unitShownDraft=");
		sb.append(getUnitShownDraft());
		sb.append(", unitShownDraftxF=");
		sb.append(getUnitShownDraftxF());
		sb.append(", unitShownDraftxA=");
		sb.append(getUnitShownDraftxA());
		sb.append(", unitHorsePower=");
		sb.append(getUnitHorsePower());
		sb.append(", unitRemainingOnBoardxB=");
		sb.append(getUnitRemainingOnBoardxB());
		sb.append(", unitRemainingOnBoardxS=");
		sb.append(getUnitRemainingOnBoardxS());
		sb.append(", unitFO=");
		sb.append(getUnitFO());
		sb.append(", unitLO=");
		sb.append(getUnitLO());
		sb.append(", unitFW=");
		sb.append(getUnitFW());
		sb.append(", unitDO=");
		sb.append(getUnitDO());
		sb.append(", unitSludgeOil=");
		sb.append(getUnitSludgeOil());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(67);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.TempUnitGeneral");
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
			"<column><column-name>documentName</column-name><column-value><![CDATA[");
		sb.append(getDocumentName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentYear</column-name><column-value><![CDATA[");
		sb.append(getDocumentYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>grossTonnageUnit</column-name><column-value><![CDATA[");
		sb.append(getGrossTonnageUnit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>netTonnageUnit</column-name><column-value><![CDATA[");
		sb.append(getNetTonnageUnit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitDWT</column-name><column-value><![CDATA[");
		sb.append(getUnitDWT());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitLOA</column-name><column-value><![CDATA[");
		sb.append(getUnitLOA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitBreadth</column-name><column-value><![CDATA[");
		sb.append(getUnitBreadth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitClearanceHeight</column-name><column-value><![CDATA[");
		sb.append(getUnitClearanceHeight());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitShownDraft</column-name><column-value><![CDATA[");
		sb.append(getUnitShownDraft());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitShownDraftxF</column-name><column-value><![CDATA[");
		sb.append(getUnitShownDraftxF());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitShownDraftxA</column-name><column-value><![CDATA[");
		sb.append(getUnitShownDraftxA());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitHorsePower</column-name><column-value><![CDATA[");
		sb.append(getUnitHorsePower());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitRemainingOnBoardxB</column-name><column-value><![CDATA[");
		sb.append(getUnitRemainingOnBoardxB());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitRemainingOnBoardxS</column-name><column-value><![CDATA[");
		sb.append(getUnitRemainingOnBoardxS());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitFO</column-name><column-value><![CDATA[");
		sb.append(getUnitFO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitLO</column-name><column-value><![CDATA[");
		sb.append(getUnitLO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitFW</column-name><column-value><![CDATA[");
		sb.append(getUnitFW());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitDO</column-name><column-value><![CDATA[");
		sb.append(getUnitDO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unitSludgeOil</column-name><column-value><![CDATA[");
		sb.append(getUnitSludgeOil());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = TempUnitGeneral.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			TempUnitGeneral.class
		};
	private long _id;
	private String _requestCode;
	private long _documentName;
	private long _originalDocumentName;
	private boolean _setOriginalDocumentName;
	private int _documentYear;
	private int _originalDocumentYear;
	private boolean _setOriginalDocumentYear;
	private String _grossTonnageUnit;
	private String _netTonnageUnit;
	private String _unitDWT;
	private String _unitLOA;
	private String _unitBreadth;
	private String _unitClearanceHeight;
	private String _unitShownDraft;
	private String _unitShownDraftxF;
	private String _unitShownDraftxA;
	private String _unitHorsePower;
	private String _unitRemainingOnBoardxB;
	private String _unitRemainingOnBoardxS;
	private String _unitFO;
	private String _unitLO;
	private String _unitFW;
	private String _unitDO;
	private String _unitSludgeOil;
	private long _columnBitmask;
	private TempUnitGeneral _escapedModel;
}