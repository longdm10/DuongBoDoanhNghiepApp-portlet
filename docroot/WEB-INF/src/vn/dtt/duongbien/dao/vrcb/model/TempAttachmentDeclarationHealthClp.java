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
import vn.dtt.duongbien.dao.vrcb.service.TempAttachmentDeclarationHealthLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class TempAttachmentDeclarationHealthClp extends BaseModelImpl<TempAttachmentDeclarationHealth>
	implements TempAttachmentDeclarationHealth {
	public TempAttachmentDeclarationHealthClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TempAttachmentDeclarationHealth.class;
	}

	@Override
	public String getModelClassName() {
		return TempAttachmentDeclarationHealth.class.getName();
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
		attributes.put("attachmentCode", getAttachmentCode());
		attributes.put("passengerOrCrewCode", getPassengerOrCrewCode());
		attributes.put("name", getName());
		attributes.put("age", getAge());
		attributes.put("sex", getSex());
		attributes.put("nationality", getNationality());
		attributes.put("portJoinVesselCode", getPortJoinVesselCode());
		attributes.put("dateJoinVessel", getDateJoinVessel());
		attributes.put("classOrRating", getClassOrRating());
		attributes.put("natureOfIllness", getNatureOfIllness());
		attributes.put("dateOfOnsetOfSymptom", getDateOfOnsetOfSymptom());
		attributes.put("reportedMedicalOfficer", getReportedMedicalOfficer());
		attributes.put("disposalOfCase", getDisposalOfCase());
		attributes.put("medicinesOrOther", getMedicinesOrOther());
		attributes.put("comments", getComments());

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

		String attachmentCode = (String)attributes.get("attachmentCode");

		if (attachmentCode != null) {
			setAttachmentCode(attachmentCode);
		}

		String passengerOrCrewCode = (String)attributes.get(
				"passengerOrCrewCode");

		if (passengerOrCrewCode != null) {
			setPassengerOrCrewCode(passengerOrCrewCode);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Integer age = (Integer)attributes.get("age");

		if (age != null) {
			setAge(age);
		}

		Integer sex = (Integer)attributes.get("sex");

		if (sex != null) {
			setSex(sex);
		}

		String nationality = (String)attributes.get("nationality");

		if (nationality != null) {
			setNationality(nationality);
		}

		String portJoinVesselCode = (String)attributes.get("portJoinVesselCode");

		if (portJoinVesselCode != null) {
			setPortJoinVesselCode(portJoinVesselCode);
		}

		Date dateJoinVessel = (Date)attributes.get("dateJoinVessel");

		if (dateJoinVessel != null) {
			setDateJoinVessel(dateJoinVessel);
		}

		Integer classOrRating = (Integer)attributes.get("classOrRating");

		if (classOrRating != null) {
			setClassOrRating(classOrRating);
		}

		String natureOfIllness = (String)attributes.get("natureOfIllness");

		if (natureOfIllness != null) {
			setNatureOfIllness(natureOfIllness);
		}

		Date dateOfOnsetOfSymptom = (Date)attributes.get("dateOfOnsetOfSymptom");

		if (dateOfOnsetOfSymptom != null) {
			setDateOfOnsetOfSymptom(dateOfOnsetOfSymptom);
		}

		Integer reportedMedicalOfficer = (Integer)attributes.get(
				"reportedMedicalOfficer");

		if (reportedMedicalOfficer != null) {
			setReportedMedicalOfficer(reportedMedicalOfficer);
		}

		String disposalOfCase = (String)attributes.get("disposalOfCase");

		if (disposalOfCase != null) {
			setDisposalOfCase(disposalOfCase);
		}

		String medicinesOrOther = (String)attributes.get("medicinesOrOther");

		if (medicinesOrOther != null) {
			setMedicinesOrOther(medicinesOrOther);
		}

		String comments = (String)attributes.get("comments");

		if (comments != null) {
			setComments(comments);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tempAttachmentDeclarationHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempAttachmentDeclarationHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tempAttachmentDeclarationHealthRemoteModel, id);
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

		if (_tempAttachmentDeclarationHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempAttachmentDeclarationHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestCode", String.class);

				method.invoke(_tempAttachmentDeclarationHealthRemoteModel,
					requestCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAttachmentCode() {
		return _attachmentCode;
	}

	@Override
	public void setAttachmentCode(String attachmentCode) {
		_attachmentCode = attachmentCode;

		if (_tempAttachmentDeclarationHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempAttachmentDeclarationHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setAttachmentCode",
						String.class);

				method.invoke(_tempAttachmentDeclarationHealthRemoteModel,
					attachmentCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPassengerOrCrewCode() {
		return _passengerOrCrewCode;
	}

	@Override
	public void setPassengerOrCrewCode(String passengerOrCrewCode) {
		_passengerOrCrewCode = passengerOrCrewCode;

		if (_tempAttachmentDeclarationHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempAttachmentDeclarationHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setPassengerOrCrewCode",
						String.class);

				method.invoke(_tempAttachmentDeclarationHealthRemoteModel,
					passengerOrCrewCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_tempAttachmentDeclarationHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempAttachmentDeclarationHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_tempAttachmentDeclarationHealthRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getAge() {
		return _age;
	}

	@Override
	public void setAge(int age) {
		_age = age;

		if (_tempAttachmentDeclarationHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempAttachmentDeclarationHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setAge", int.class);

				method.invoke(_tempAttachmentDeclarationHealthRemoteModel, age);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSex() {
		return _sex;
	}

	@Override
	public void setSex(int sex) {
		_sex = sex;

		if (_tempAttachmentDeclarationHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempAttachmentDeclarationHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setSex", int.class);

				method.invoke(_tempAttachmentDeclarationHealthRemoteModel, sex);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNationality() {
		return _nationality;
	}

	@Override
	public void setNationality(String nationality) {
		_nationality = nationality;

		if (_tempAttachmentDeclarationHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempAttachmentDeclarationHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setNationality", String.class);

				method.invoke(_tempAttachmentDeclarationHealthRemoteModel,
					nationality);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPortJoinVesselCode() {
		return _portJoinVesselCode;
	}

	@Override
	public void setPortJoinVesselCode(String portJoinVesselCode) {
		_portJoinVesselCode = portJoinVesselCode;

		if (_tempAttachmentDeclarationHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempAttachmentDeclarationHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setPortJoinVesselCode",
						String.class);

				method.invoke(_tempAttachmentDeclarationHealthRemoteModel,
					portJoinVesselCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDateJoinVessel() {
		return _dateJoinVessel;
	}

	@Override
	public void setDateJoinVessel(Date dateJoinVessel) {
		_dateJoinVessel = dateJoinVessel;

		if (_tempAttachmentDeclarationHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempAttachmentDeclarationHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setDateJoinVessel", Date.class);

				method.invoke(_tempAttachmentDeclarationHealthRemoteModel,
					dateJoinVessel);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getClassOrRating() {
		return _classOrRating;
	}

	@Override
	public void setClassOrRating(int classOrRating) {
		_classOrRating = classOrRating;

		if (_tempAttachmentDeclarationHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempAttachmentDeclarationHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setClassOrRating", int.class);

				method.invoke(_tempAttachmentDeclarationHealthRemoteModel,
					classOrRating);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNatureOfIllness() {
		return _natureOfIllness;
	}

	@Override
	public void setNatureOfIllness(String natureOfIllness) {
		_natureOfIllness = natureOfIllness;

		if (_tempAttachmentDeclarationHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempAttachmentDeclarationHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setNatureOfIllness",
						String.class);

				method.invoke(_tempAttachmentDeclarationHealthRemoteModel,
					natureOfIllness);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDateOfOnsetOfSymptom() {
		return _dateOfOnsetOfSymptom;
	}

	@Override
	public void setDateOfOnsetOfSymptom(Date dateOfOnsetOfSymptom) {
		_dateOfOnsetOfSymptom = dateOfOnsetOfSymptom;

		if (_tempAttachmentDeclarationHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempAttachmentDeclarationHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setDateOfOnsetOfSymptom",
						Date.class);

				method.invoke(_tempAttachmentDeclarationHealthRemoteModel,
					dateOfOnsetOfSymptom);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getReportedMedicalOfficer() {
		return _reportedMedicalOfficer;
	}

	@Override
	public void setReportedMedicalOfficer(int reportedMedicalOfficer) {
		_reportedMedicalOfficer = reportedMedicalOfficer;

		if (_tempAttachmentDeclarationHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempAttachmentDeclarationHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setReportedMedicalOfficer",
						int.class);

				method.invoke(_tempAttachmentDeclarationHealthRemoteModel,
					reportedMedicalOfficer);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDisposalOfCase() {
		return _disposalOfCase;
	}

	@Override
	public void setDisposalOfCase(String disposalOfCase) {
		_disposalOfCase = disposalOfCase;

		if (_tempAttachmentDeclarationHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempAttachmentDeclarationHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setDisposalOfCase",
						String.class);

				method.invoke(_tempAttachmentDeclarationHealthRemoteModel,
					disposalOfCase);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMedicinesOrOther() {
		return _medicinesOrOther;
	}

	@Override
	public void setMedicinesOrOther(String medicinesOrOther) {
		_medicinesOrOther = medicinesOrOther;

		if (_tempAttachmentDeclarationHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempAttachmentDeclarationHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setMedicinesOrOther",
						String.class);

				method.invoke(_tempAttachmentDeclarationHealthRemoteModel,
					medicinesOrOther);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getComments() {
		return _comments;
	}

	@Override
	public void setComments(String comments) {
		_comments = comments;

		if (_tempAttachmentDeclarationHealthRemoteModel != null) {
			try {
				Class<?> clazz = _tempAttachmentDeclarationHealthRemoteModel.getClass();

				Method method = clazz.getMethod("setComments", String.class);

				method.invoke(_tempAttachmentDeclarationHealthRemoteModel,
					comments);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTempAttachmentDeclarationHealthRemoteModel() {
		return _tempAttachmentDeclarationHealthRemoteModel;
	}

	public void setTempAttachmentDeclarationHealthRemoteModel(
		BaseModel<?> tempAttachmentDeclarationHealthRemoteModel) {
		_tempAttachmentDeclarationHealthRemoteModel = tempAttachmentDeclarationHealthRemoteModel;
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

		Class<?> remoteModelClass = _tempAttachmentDeclarationHealthRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tempAttachmentDeclarationHealthRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TempAttachmentDeclarationHealthLocalServiceUtil.addTempAttachmentDeclarationHealth(this);
		}
		else {
			TempAttachmentDeclarationHealthLocalServiceUtil.updateTempAttachmentDeclarationHealth(this);
		}
	}

	@Override
	public TempAttachmentDeclarationHealth toEscapedModel() {
		return (TempAttachmentDeclarationHealth)ProxyUtil.newProxyInstance(TempAttachmentDeclarationHealth.class.getClassLoader(),
			new Class[] { TempAttachmentDeclarationHealth.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempAttachmentDeclarationHealthClp clone = new TempAttachmentDeclarationHealthClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setAttachmentCode(getAttachmentCode());
		clone.setPassengerOrCrewCode(getPassengerOrCrewCode());
		clone.setName(getName());
		clone.setAge(getAge());
		clone.setSex(getSex());
		clone.setNationality(getNationality());
		clone.setPortJoinVesselCode(getPortJoinVesselCode());
		clone.setDateJoinVessel(getDateJoinVessel());
		clone.setClassOrRating(getClassOrRating());
		clone.setNatureOfIllness(getNatureOfIllness());
		clone.setDateOfOnsetOfSymptom(getDateOfOnsetOfSymptom());
		clone.setReportedMedicalOfficer(getReportedMedicalOfficer());
		clone.setDisposalOfCase(getDisposalOfCase());
		clone.setMedicinesOrOther(getMedicinesOrOther());
		clone.setComments(getComments());

		return clone;
	}

	@Override
	public int compareTo(
		TempAttachmentDeclarationHealth tempAttachmentDeclarationHealth) {
		int value = 0;

		if (getId() < tempAttachmentDeclarationHealth.getId()) {
			value = -1;
		}
		else if (getId() > tempAttachmentDeclarationHealth.getId()) {
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

		if (!(obj instanceof TempAttachmentDeclarationHealthClp)) {
			return false;
		}

		TempAttachmentDeclarationHealthClp tempAttachmentDeclarationHealth = (TempAttachmentDeclarationHealthClp)obj;

		long primaryKey = tempAttachmentDeclarationHealth.getPrimaryKey();

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
		StringBundler sb = new StringBundler(35);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", attachmentCode=");
		sb.append(getAttachmentCode());
		sb.append(", passengerOrCrewCode=");
		sb.append(getPassengerOrCrewCode());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", age=");
		sb.append(getAge());
		sb.append(", sex=");
		sb.append(getSex());
		sb.append(", nationality=");
		sb.append(getNationality());
		sb.append(", portJoinVesselCode=");
		sb.append(getPortJoinVesselCode());
		sb.append(", dateJoinVessel=");
		sb.append(getDateJoinVessel());
		sb.append(", classOrRating=");
		sb.append(getClassOrRating());
		sb.append(", natureOfIllness=");
		sb.append(getNatureOfIllness());
		sb.append(", dateOfOnsetOfSymptom=");
		sb.append(getDateOfOnsetOfSymptom());
		sb.append(", reportedMedicalOfficer=");
		sb.append(getReportedMedicalOfficer());
		sb.append(", disposalOfCase=");
		sb.append(getDisposalOfCase());
		sb.append(", medicinesOrOther=");
		sb.append(getMedicinesOrOther());
		sb.append(", comments=");
		sb.append(getComments());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(55);

		sb.append("<model><model-name>");
		sb.append(
			"vn.dtt.duongbien.dao.vrcb.model.TempAttachmentDeclarationHealth");
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
			"<column><column-name>attachmentCode</column-name><column-value><![CDATA[");
		sb.append(getAttachmentCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>passengerOrCrewCode</column-name><column-value><![CDATA[");
		sb.append(getPassengerOrCrewCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>age</column-name><column-value><![CDATA[");
		sb.append(getAge());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sex</column-name><column-value><![CDATA[");
		sb.append(getSex());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nationality</column-name><column-value><![CDATA[");
		sb.append(getNationality());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portJoinVesselCode</column-name><column-value><![CDATA[");
		sb.append(getPortJoinVesselCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateJoinVessel</column-name><column-value><![CDATA[");
		sb.append(getDateJoinVessel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>classOrRating</column-name><column-value><![CDATA[");
		sb.append(getClassOrRating());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>natureOfIllness</column-name><column-value><![CDATA[");
		sb.append(getNatureOfIllness());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateOfOnsetOfSymptom</column-name><column-value><![CDATA[");
		sb.append(getDateOfOnsetOfSymptom());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reportedMedicalOfficer</column-name><column-value><![CDATA[");
		sb.append(getReportedMedicalOfficer());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>disposalOfCase</column-name><column-value><![CDATA[");
		sb.append(getDisposalOfCase());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>medicinesOrOther</column-name><column-value><![CDATA[");
		sb.append(getMedicinesOrOther());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>comments</column-name><column-value><![CDATA[");
		sb.append(getComments());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private String _attachmentCode;
	private String _passengerOrCrewCode;
	private String _name;
	private int _age;
	private int _sex;
	private String _nationality;
	private String _portJoinVesselCode;
	private Date _dateJoinVessel;
	private int _classOrRating;
	private String _natureOfIllness;
	private Date _dateOfOnsetOfSymptom;
	private int _reportedMedicalOfficer;
	private String _disposalOfCase;
	private String _medicinesOrOther;
	private String _comments;
	private BaseModel<?> _tempAttachmentDeclarationHealthRemoteModel;
}