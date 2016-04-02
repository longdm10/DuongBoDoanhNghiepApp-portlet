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
import vn.dtt.duongbien.dao.vrcb.service.TempCrewEffectsItemsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class TempCrewEffectsItemsClp extends BaseModelImpl<TempCrewEffectsItems>
	implements TempCrewEffectsItems {
	public TempCrewEffectsItemsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TempCrewEffectsItems.class;
	}

	@Override
	public String getModelClassName() {
		return TempCrewEffectsItems.class.getName();
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
		attributes.put("crewEffectItemcode", getCrewEffectItemcode());
		attributes.put("familyName", getFamilyName());
		attributes.put("givenName", getGivenName());
		attributes.put("rankOrratingCode", getRankOrratingCode());
		attributes.put("effectsIneligibleForRelief",
			getEffectsIneligibleForRelief());

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

		String crewEffectItemcode = (String)attributes.get("crewEffectItemcode");

		if (crewEffectItemcode != null) {
			setCrewEffectItemcode(crewEffectItemcode);
		}

		String familyName = (String)attributes.get("familyName");

		if (familyName != null) {
			setFamilyName(familyName);
		}

		String givenName = (String)attributes.get("givenName");

		if (givenName != null) {
			setGivenName(givenName);
		}

		String rankOrratingCode = (String)attributes.get("rankOrratingCode");

		if (rankOrratingCode != null) {
			setRankOrratingCode(rankOrratingCode);
		}

		String effectsIneligibleForRelief = (String)attributes.get(
				"effectsIneligibleForRelief");

		if (effectsIneligibleForRelief != null) {
			setEffectsIneligibleForRelief(effectsIneligibleForRelief);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tempCrewEffectsItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempCrewEffectsItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tempCrewEffectsItemsRemoteModel, id);
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

		if (_tempCrewEffectsItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempCrewEffectsItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestCode", String.class);

				method.invoke(_tempCrewEffectsItemsRemoteModel, requestCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCrewEffectItemcode() {
		return _crewEffectItemcode;
	}

	@Override
	public void setCrewEffectItemcode(String crewEffectItemcode) {
		_crewEffectItemcode = crewEffectItemcode;

		if (_tempCrewEffectsItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempCrewEffectsItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setCrewEffectItemcode",
						String.class);

				method.invoke(_tempCrewEffectsItemsRemoteModel,
					crewEffectItemcode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFamilyName() {
		return _familyName;
	}

	@Override
	public void setFamilyName(String familyName) {
		_familyName = familyName;

		if (_tempCrewEffectsItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempCrewEffectsItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setFamilyName", String.class);

				method.invoke(_tempCrewEffectsItemsRemoteModel, familyName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGivenName() {
		return _givenName;
	}

	@Override
	public void setGivenName(String givenName) {
		_givenName = givenName;

		if (_tempCrewEffectsItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempCrewEffectsItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setGivenName", String.class);

				method.invoke(_tempCrewEffectsItemsRemoteModel, givenName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRankOrratingCode() {
		return _rankOrratingCode;
	}

	@Override
	public void setRankOrratingCode(String rankOrratingCode) {
		_rankOrratingCode = rankOrratingCode;

		if (_tempCrewEffectsItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempCrewEffectsItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setRankOrratingCode",
						String.class);

				method.invoke(_tempCrewEffectsItemsRemoteModel, rankOrratingCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEffectsIneligibleForRelief() {
		return _effectsIneligibleForRelief;
	}

	@Override
	public void setEffectsIneligibleForRelief(String effectsIneligibleForRelief) {
		_effectsIneligibleForRelief = effectsIneligibleForRelief;

		if (_tempCrewEffectsItemsRemoteModel != null) {
			try {
				Class<?> clazz = _tempCrewEffectsItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setEffectsIneligibleForRelief",
						String.class);

				method.invoke(_tempCrewEffectsItemsRemoteModel,
					effectsIneligibleForRelief);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTempCrewEffectsItemsRemoteModel() {
		return _tempCrewEffectsItemsRemoteModel;
	}

	public void setTempCrewEffectsItemsRemoteModel(
		BaseModel<?> tempCrewEffectsItemsRemoteModel) {
		_tempCrewEffectsItemsRemoteModel = tempCrewEffectsItemsRemoteModel;
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

		Class<?> remoteModelClass = _tempCrewEffectsItemsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tempCrewEffectsItemsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TempCrewEffectsItemsLocalServiceUtil.addTempCrewEffectsItems(this);
		}
		else {
			TempCrewEffectsItemsLocalServiceUtil.updateTempCrewEffectsItems(this);
		}
	}

	@Override
	public TempCrewEffectsItems toEscapedModel() {
		return (TempCrewEffectsItems)ProxyUtil.newProxyInstance(TempCrewEffectsItems.class.getClassLoader(),
			new Class[] { TempCrewEffectsItems.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempCrewEffectsItemsClp clone = new TempCrewEffectsItemsClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setCrewEffectItemcode(getCrewEffectItemcode());
		clone.setFamilyName(getFamilyName());
		clone.setGivenName(getGivenName());
		clone.setRankOrratingCode(getRankOrratingCode());
		clone.setEffectsIneligibleForRelief(getEffectsIneligibleForRelief());

		return clone;
	}

	@Override
	public int compareTo(TempCrewEffectsItems tempCrewEffectsItems) {
		int value = 0;

		if (getId() < tempCrewEffectsItems.getId()) {
			value = -1;
		}
		else if (getId() > tempCrewEffectsItems.getId()) {
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

		if (!(obj instanceof TempCrewEffectsItemsClp)) {
			return false;
		}

		TempCrewEffectsItemsClp tempCrewEffectsItems = (TempCrewEffectsItemsClp)obj;

		long primaryKey = tempCrewEffectsItems.getPrimaryKey();

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
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", crewEffectItemcode=");
		sb.append(getCrewEffectItemcode());
		sb.append(", familyName=");
		sb.append(getFamilyName());
		sb.append(", givenName=");
		sb.append(getGivenName());
		sb.append(", rankOrratingCode=");
		sb.append(getRankOrratingCode());
		sb.append(", effectsIneligibleForRelief=");
		sb.append(getEffectsIneligibleForRelief());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.TempCrewEffectsItems");
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
			"<column><column-name>crewEffectItemcode</column-name><column-value><![CDATA[");
		sb.append(getCrewEffectItemcode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>familyName</column-name><column-value><![CDATA[");
		sb.append(getFamilyName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>givenName</column-name><column-value><![CDATA[");
		sb.append(getGivenName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rankOrratingCode</column-name><column-value><![CDATA[");
		sb.append(getRankOrratingCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>effectsIneligibleForRelief</column-name><column-value><![CDATA[");
		sb.append(getEffectsIneligibleForRelief());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private String _crewEffectItemcode;
	private String _familyName;
	private String _givenName;
	private String _rankOrratingCode;
	private String _effectsIneligibleForRelief;
	private BaseModel<?> _tempCrewEffectsItemsRemoteModel;
}