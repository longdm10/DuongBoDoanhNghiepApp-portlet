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
import vn.dtt.duongbien.dao.vrcb.service.TempUnitGeneralLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class TempUnitGeneralClp extends BaseModelImpl<TempUnitGeneral>
	implements TempUnitGeneral {
	public TempUnitGeneralClp() {
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

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tempUnitGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _tempUnitGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tempUnitGeneralRemoteModel, id);
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

		if (_tempUnitGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _tempUnitGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestCode", String.class);

				method.invoke(_tempUnitGeneralRemoteModel, requestCode);
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

		if (_tempUnitGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _tempUnitGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentName", long.class);

				method.invoke(_tempUnitGeneralRemoteModel, documentName);
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

		if (_tempUnitGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _tempUnitGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentYear", int.class);

				method.invoke(_tempUnitGeneralRemoteModel, documentYear);
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

		if (_tempUnitGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _tempUnitGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setGrossTonnageUnit",
						String.class);

				method.invoke(_tempUnitGeneralRemoteModel, grossTonnageUnit);
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

		if (_tempUnitGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _tempUnitGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setNetTonnageUnit",
						String.class);

				method.invoke(_tempUnitGeneralRemoteModel, netTonnageUnit);
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

		if (_tempUnitGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _tempUnitGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitDWT", String.class);

				method.invoke(_tempUnitGeneralRemoteModel, unitDWT);
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

		if (_tempUnitGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _tempUnitGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitLOA", String.class);

				method.invoke(_tempUnitGeneralRemoteModel, unitLOA);
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

		if (_tempUnitGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _tempUnitGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitBreadth", String.class);

				method.invoke(_tempUnitGeneralRemoteModel, unitBreadth);
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

		if (_tempUnitGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _tempUnitGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitClearanceHeight",
						String.class);

				method.invoke(_tempUnitGeneralRemoteModel, unitClearanceHeight);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUnitShownDraft() {
		return _unitShownDraft;
	}

	@Override
	public void setUnitShownDraft(String unitShownDraft) {
		_unitShownDraft = unitShownDraft;

		if (_tempUnitGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _tempUnitGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitShownDraft",
						String.class);

				method.invoke(_tempUnitGeneralRemoteModel, unitShownDraft);
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

		if (_tempUnitGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _tempUnitGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitShownDraftxF",
						String.class);

				method.invoke(_tempUnitGeneralRemoteModel, unitShownDraftxF);
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

		if (_tempUnitGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _tempUnitGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitShownDraftxA",
						String.class);

				method.invoke(_tempUnitGeneralRemoteModel, unitShownDraftxA);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUnitHorsePower() {
		return _unitHorsePower;
	}

	@Override
	public void setUnitHorsePower(String unitHorsePower) {
		_unitHorsePower = unitHorsePower;

		if (_tempUnitGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _tempUnitGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitHorsePower",
						String.class);

				method.invoke(_tempUnitGeneralRemoteModel, unitHorsePower);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUnitRemainingOnBoardxB() {
		return _unitRemainingOnBoardxB;
	}

	@Override
	public void setUnitRemainingOnBoardxB(String unitRemainingOnBoardxB) {
		_unitRemainingOnBoardxB = unitRemainingOnBoardxB;

		if (_tempUnitGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _tempUnitGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitRemainingOnBoardxB",
						String.class);

				method.invoke(_tempUnitGeneralRemoteModel,
					unitRemainingOnBoardxB);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUnitRemainingOnBoardxS() {
		return _unitRemainingOnBoardxS;
	}

	@Override
	public void setUnitRemainingOnBoardxS(String unitRemainingOnBoardxS) {
		_unitRemainingOnBoardxS = unitRemainingOnBoardxS;

		if (_tempUnitGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _tempUnitGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitRemainingOnBoardxS",
						String.class);

				method.invoke(_tempUnitGeneralRemoteModel,
					unitRemainingOnBoardxS);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUnitFO() {
		return _unitFO;
	}

	@Override
	public void setUnitFO(String unitFO) {
		_unitFO = unitFO;

		if (_tempUnitGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _tempUnitGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitFO", String.class);

				method.invoke(_tempUnitGeneralRemoteModel, unitFO);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUnitLO() {
		return _unitLO;
	}

	@Override
	public void setUnitLO(String unitLO) {
		_unitLO = unitLO;

		if (_tempUnitGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _tempUnitGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitLO", String.class);

				method.invoke(_tempUnitGeneralRemoteModel, unitLO);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUnitFW() {
		return _unitFW;
	}

	@Override
	public void setUnitFW(String unitFW) {
		_unitFW = unitFW;

		if (_tempUnitGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _tempUnitGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitFW", String.class);

				method.invoke(_tempUnitGeneralRemoteModel, unitFW);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUnitDO() {
		return _unitDO;
	}

	@Override
	public void setUnitDO(String unitDO) {
		_unitDO = unitDO;

		if (_tempUnitGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _tempUnitGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitDO", String.class);

				method.invoke(_tempUnitGeneralRemoteModel, unitDO);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUnitSludgeOil() {
		return _unitSludgeOil;
	}

	@Override
	public void setUnitSludgeOil(String unitSludgeOil) {
		_unitSludgeOil = unitSludgeOil;

		if (_tempUnitGeneralRemoteModel != null) {
			try {
				Class<?> clazz = _tempUnitGeneralRemoteModel.getClass();

				Method method = clazz.getMethod("setUnitSludgeOil", String.class);

				method.invoke(_tempUnitGeneralRemoteModel, unitSludgeOil);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTempUnitGeneralRemoteModel() {
		return _tempUnitGeneralRemoteModel;
	}

	public void setTempUnitGeneralRemoteModel(
		BaseModel<?> tempUnitGeneralRemoteModel) {
		_tempUnitGeneralRemoteModel = tempUnitGeneralRemoteModel;
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

		Class<?> remoteModelClass = _tempUnitGeneralRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tempUnitGeneralRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TempUnitGeneralLocalServiceUtil.addTempUnitGeneral(this);
		}
		else {
			TempUnitGeneralLocalServiceUtil.updateTempUnitGeneral(this);
		}
	}

	@Override
	public TempUnitGeneral toEscapedModel() {
		return (TempUnitGeneral)ProxyUtil.newProxyInstance(TempUnitGeneral.class.getClassLoader(),
			new Class[] { TempUnitGeneral.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempUnitGeneralClp clone = new TempUnitGeneralClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setDocumentName(getDocumentName());
		clone.setDocumentYear(getDocumentYear());
		clone.setGrossTonnageUnit(getGrossTonnageUnit());
		clone.setNetTonnageUnit(getNetTonnageUnit());
		clone.setUnitDWT(getUnitDWT());
		clone.setUnitLOA(getUnitLOA());
		clone.setUnitBreadth(getUnitBreadth());
		clone.setUnitClearanceHeight(getUnitClearanceHeight());
		clone.setUnitShownDraft(getUnitShownDraft());
		clone.setUnitShownDraftxF(getUnitShownDraftxF());
		clone.setUnitShownDraftxA(getUnitShownDraftxA());
		clone.setUnitHorsePower(getUnitHorsePower());
		clone.setUnitRemainingOnBoardxB(getUnitRemainingOnBoardxB());
		clone.setUnitRemainingOnBoardxS(getUnitRemainingOnBoardxS());
		clone.setUnitFO(getUnitFO());
		clone.setUnitLO(getUnitLO());
		clone.setUnitFW(getUnitFW());
		clone.setUnitDO(getUnitDO());
		clone.setUnitSludgeOil(getUnitSludgeOil());

		return clone;
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

		if (!(obj instanceof TempUnitGeneralClp)) {
			return false;
		}

		TempUnitGeneralClp tempUnitGeneral = (TempUnitGeneralClp)obj;

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

	private long _id;
	private String _requestCode;
	private long _documentName;
	private int _documentYear;
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
	private BaseModel<?> _tempUnitGeneralRemoteModel;
}