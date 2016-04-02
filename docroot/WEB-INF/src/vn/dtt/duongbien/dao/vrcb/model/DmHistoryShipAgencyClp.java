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
import vn.dtt.duongbien.dao.vrcb.service.DmHistoryShipAgencyLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class DmHistoryShipAgencyClp extends BaseModelImpl<DmHistoryShipAgency>
	implements DmHistoryShipAgency {
	public DmHistoryShipAgencyClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DmHistoryShipAgency.class;
	}

	@Override
	public String getModelClassName() {
		return DmHistoryShipAgency.class.getName();
	}

	@Override
	public int getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("shipAgencyCode", getShipAgencyCode());
		attributes.put("shipAgencyName", getShipAgencyName());
		attributes.put("shipAgencyNameVN", getShipAgencyNameVN());
		attributes.put("taxCode", getTaxCode());
		attributes.put("stateCode", getStateCode());
		attributes.put("citycode", getCitycode());
		attributes.put("address", getAddress());
		attributes.put("addressVN", getAddressVN());
		attributes.put("phone", getPhone());
		attributes.put("fax", getFax());
		attributes.put("email", getEmail());
		attributes.put("description", getDescription());
		attributes.put("contacter", getContacter());
		attributes.put("position", getPosition());
		attributes.put("contactTell", getContactTell());
		attributes.put("isDelete", getIsDelete());
		attributes.put("markedAsDelete", getMarkedAsDelete());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("requestedDate", getRequestedDate());
		attributes.put("syncVersion", getSyncVersion());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String shipAgencyCode = (String)attributes.get("shipAgencyCode");

		if (shipAgencyCode != null) {
			setShipAgencyCode(shipAgencyCode);
		}

		String shipAgencyName = (String)attributes.get("shipAgencyName");

		if (shipAgencyName != null) {
			setShipAgencyName(shipAgencyName);
		}

		String shipAgencyNameVN = (String)attributes.get("shipAgencyNameVN");

		if (shipAgencyNameVN != null) {
			setShipAgencyNameVN(shipAgencyNameVN);
		}

		String taxCode = (String)attributes.get("taxCode");

		if (taxCode != null) {
			setTaxCode(taxCode);
		}

		String stateCode = (String)attributes.get("stateCode");

		if (stateCode != null) {
			setStateCode(stateCode);
		}

		String citycode = (String)attributes.get("citycode");

		if (citycode != null) {
			setCitycode(citycode);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String addressVN = (String)attributes.get("addressVN");

		if (addressVN != null) {
			setAddressVN(addressVN);
		}

		String phone = (String)attributes.get("phone");

		if (phone != null) {
			setPhone(phone);
		}

		String fax = (String)attributes.get("fax");

		if (fax != null) {
			setFax(fax);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String contacter = (String)attributes.get("contacter");

		if (contacter != null) {
			setContacter(contacter);
		}

		String position = (String)attributes.get("position");

		if (position != null) {
			setPosition(position);
		}

		String contactTell = (String)attributes.get("contactTell");

		if (contactTell != null) {
			setContactTell(contactTell);
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
	public int getId() {
		return _id;
	}

	@Override
	public void setId(int id) {
		_id = id;

		if (_dmHistoryShipAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryShipAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setId", int.class);

				method.invoke(_dmHistoryShipAgencyRemoteModel, id);
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

		if (_dmHistoryShipAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryShipAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setShipAgencyCode",
						String.class);

				method.invoke(_dmHistoryShipAgencyRemoteModel, shipAgencyCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getShipAgencyName() {
		return _shipAgencyName;
	}

	@Override
	public void setShipAgencyName(String shipAgencyName) {
		_shipAgencyName = shipAgencyName;

		if (_dmHistoryShipAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryShipAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setShipAgencyName",
						String.class);

				method.invoke(_dmHistoryShipAgencyRemoteModel, shipAgencyName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getShipAgencyNameVN() {
		return _shipAgencyNameVN;
	}

	@Override
	public void setShipAgencyNameVN(String shipAgencyNameVN) {
		_shipAgencyNameVN = shipAgencyNameVN;

		if (_dmHistoryShipAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryShipAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setShipAgencyNameVN",
						String.class);

				method.invoke(_dmHistoryShipAgencyRemoteModel, shipAgencyNameVN);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTaxCode() {
		return _taxCode;
	}

	@Override
	public void setTaxCode(String taxCode) {
		_taxCode = taxCode;

		if (_dmHistoryShipAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryShipAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setTaxCode", String.class);

				method.invoke(_dmHistoryShipAgencyRemoteModel, taxCode);
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

		if (_dmHistoryShipAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryShipAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setStateCode", String.class);

				method.invoke(_dmHistoryShipAgencyRemoteModel, stateCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCitycode() {
		return _citycode;
	}

	@Override
	public void setCitycode(String citycode) {
		_citycode = citycode;

		if (_dmHistoryShipAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryShipAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setCitycode", String.class);

				method.invoke(_dmHistoryShipAgencyRemoteModel, citycode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAddress() {
		return _address;
	}

	@Override
	public void setAddress(String address) {
		_address = address;

		if (_dmHistoryShipAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryShipAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setAddress", String.class);

				method.invoke(_dmHistoryShipAgencyRemoteModel, address);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAddressVN() {
		return _addressVN;
	}

	@Override
	public void setAddressVN(String addressVN) {
		_addressVN = addressVN;

		if (_dmHistoryShipAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryShipAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setAddressVN", String.class);

				method.invoke(_dmHistoryShipAgencyRemoteModel, addressVN);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPhone() {
		return _phone;
	}

	@Override
	public void setPhone(String phone) {
		_phone = phone;

		if (_dmHistoryShipAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryShipAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setPhone", String.class);

				method.invoke(_dmHistoryShipAgencyRemoteModel, phone);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFax() {
		return _fax;
	}

	@Override
	public void setFax(String fax) {
		_fax = fax;

		if (_dmHistoryShipAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryShipAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setFax", String.class);

				method.invoke(_dmHistoryShipAgencyRemoteModel, fax);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmail() {
		return _email;
	}

	@Override
	public void setEmail(String email) {
		_email = email;

		if (_dmHistoryShipAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryShipAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setEmail", String.class);

				method.invoke(_dmHistoryShipAgencyRemoteModel, email);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescription() {
		return _description;
	}

	@Override
	public void setDescription(String description) {
		_description = description;

		if (_dmHistoryShipAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryShipAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_dmHistoryShipAgencyRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getContacter() {
		return _contacter;
	}

	@Override
	public void setContacter(String contacter) {
		_contacter = contacter;

		if (_dmHistoryShipAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryShipAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setContacter", String.class);

				method.invoke(_dmHistoryShipAgencyRemoteModel, contacter);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPosition() {
		return _position;
	}

	@Override
	public void setPosition(String position) {
		_position = position;

		if (_dmHistoryShipAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryShipAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setPosition", String.class);

				method.invoke(_dmHistoryShipAgencyRemoteModel, position);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getContactTell() {
		return _contactTell;
	}

	@Override
	public void setContactTell(String contactTell) {
		_contactTell = contactTell;

		if (_dmHistoryShipAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryShipAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setContactTell", String.class);

				method.invoke(_dmHistoryShipAgencyRemoteModel, contactTell);
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

		if (_dmHistoryShipAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryShipAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setIsDelete", int.class);

				method.invoke(_dmHistoryShipAgencyRemoteModel, isDelete);
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

		if (_dmHistoryShipAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryShipAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkedAsDelete", int.class);

				method.invoke(_dmHistoryShipAgencyRemoteModel, markedAsDelete);
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

		if (_dmHistoryShipAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryShipAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_dmHistoryShipAgencyRemoteModel, modifiedDate);
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

		if (_dmHistoryShipAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryShipAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestedDate", Date.class);

				method.invoke(_dmHistoryShipAgencyRemoteModel, requestedDate);
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

		if (_dmHistoryShipAgencyRemoteModel != null) {
			try {
				Class<?> clazz = _dmHistoryShipAgencyRemoteModel.getClass();

				Method method = clazz.getMethod("setSyncVersion", String.class);

				method.invoke(_dmHistoryShipAgencyRemoteModel, syncVersion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDmHistoryShipAgencyRemoteModel() {
		return _dmHistoryShipAgencyRemoteModel;
	}

	public void setDmHistoryShipAgencyRemoteModel(
		BaseModel<?> dmHistoryShipAgencyRemoteModel) {
		_dmHistoryShipAgencyRemoteModel = dmHistoryShipAgencyRemoteModel;
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

		Class<?> remoteModelClass = _dmHistoryShipAgencyRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dmHistoryShipAgencyRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DmHistoryShipAgencyLocalServiceUtil.addDmHistoryShipAgency(this);
		}
		else {
			DmHistoryShipAgencyLocalServiceUtil.updateDmHistoryShipAgency(this);
		}
	}

	@Override
	public DmHistoryShipAgency toEscapedModel() {
		return (DmHistoryShipAgency)ProxyUtil.newProxyInstance(DmHistoryShipAgency.class.getClassLoader(),
			new Class[] { DmHistoryShipAgency.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DmHistoryShipAgencyClp clone = new DmHistoryShipAgencyClp();

		clone.setId(getId());
		clone.setShipAgencyCode(getShipAgencyCode());
		clone.setShipAgencyName(getShipAgencyName());
		clone.setShipAgencyNameVN(getShipAgencyNameVN());
		clone.setTaxCode(getTaxCode());
		clone.setStateCode(getStateCode());
		clone.setCitycode(getCitycode());
		clone.setAddress(getAddress());
		clone.setAddressVN(getAddressVN());
		clone.setPhone(getPhone());
		clone.setFax(getFax());
		clone.setEmail(getEmail());
		clone.setDescription(getDescription());
		clone.setContacter(getContacter());
		clone.setPosition(getPosition());
		clone.setContactTell(getContactTell());
		clone.setIsDelete(getIsDelete());
		clone.setMarkedAsDelete(getMarkedAsDelete());
		clone.setModifiedDate(getModifiedDate());
		clone.setRequestedDate(getRequestedDate());
		clone.setSyncVersion(getSyncVersion());

		return clone;
	}

	@Override
	public int compareTo(DmHistoryShipAgency dmHistoryShipAgency) {
		int value = 0;

		if (getId() < dmHistoryShipAgency.getId()) {
			value = -1;
		}
		else if (getId() > dmHistoryShipAgency.getId()) {
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

		if (!(obj instanceof DmHistoryShipAgencyClp)) {
			return false;
		}

		DmHistoryShipAgencyClp dmHistoryShipAgency = (DmHistoryShipAgencyClp)obj;

		int primaryKey = dmHistoryShipAgency.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", shipAgencyCode=");
		sb.append(getShipAgencyCode());
		sb.append(", shipAgencyName=");
		sb.append(getShipAgencyName());
		sb.append(", shipAgencyNameVN=");
		sb.append(getShipAgencyNameVN());
		sb.append(", taxCode=");
		sb.append(getTaxCode());
		sb.append(", stateCode=");
		sb.append(getStateCode());
		sb.append(", citycode=");
		sb.append(getCitycode());
		sb.append(", address=");
		sb.append(getAddress());
		sb.append(", addressVN=");
		sb.append(getAddressVN());
		sb.append(", phone=");
		sb.append(getPhone());
		sb.append(", fax=");
		sb.append(getFax());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", contacter=");
		sb.append(getContacter());
		sb.append(", position=");
		sb.append(getPosition());
		sb.append(", contactTell=");
		sb.append(getContactTell());
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
		StringBundler sb = new StringBundler(67);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.DmHistoryShipAgency");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipAgencyCode</column-name><column-value><![CDATA[");
		sb.append(getShipAgencyCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipAgencyName</column-name><column-value><![CDATA[");
		sb.append(getShipAgencyName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shipAgencyNameVN</column-name><column-value><![CDATA[");
		sb.append(getShipAgencyNameVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>taxCode</column-name><column-value><![CDATA[");
		sb.append(getTaxCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stateCode</column-name><column-value><![CDATA[");
		sb.append(getStateCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>citycode</column-name><column-value><![CDATA[");
		sb.append(getCitycode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address</column-name><column-value><![CDATA[");
		sb.append(getAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>addressVN</column-name><column-value><![CDATA[");
		sb.append(getAddressVN());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phone</column-name><column-value><![CDATA[");
		sb.append(getPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fax</column-name><column-value><![CDATA[");
		sb.append(getFax());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contacter</column-name><column-value><![CDATA[");
		sb.append(getContacter());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>position</column-name><column-value><![CDATA[");
		sb.append(getPosition());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactTell</column-name><column-value><![CDATA[");
		sb.append(getContactTell());
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

	private int _id;
	private String _shipAgencyCode;
	private String _shipAgencyName;
	private String _shipAgencyNameVN;
	private String _taxCode;
	private String _stateCode;
	private String _citycode;
	private String _address;
	private String _addressVN;
	private String _phone;
	private String _fax;
	private String _email;
	private String _description;
	private String _contacter;
	private String _position;
	private String _contactTell;
	private int _isDelete;
	private int _markedAsDelete;
	private Date _modifiedDate;
	private Date _requestedDate;
	private String _syncVersion;
	private BaseModel<?> _dmHistoryShipAgencyRemoteModel;
}