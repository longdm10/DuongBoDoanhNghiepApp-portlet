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
import vn.dtt.duongbien.dao.vrcb.service.TempHealthQuestionLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author longdm
 */
public class TempHealthQuestionClp extends BaseModelImpl<TempHealthQuestion>
	implements TempHealthQuestion {
	public TempHealthQuestionClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TempHealthQuestion.class;
	}

	@Override
	public String getModelClassName() {
		return TempHealthQuestion.class.getName();
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
		attributes.put("healthQuestionCode", getHealthQuestionCode());
		attributes.put("personDied", getPersonDied());
		attributes.put("personDiedNo", getPersonDiedNo());
		attributes.put("personDiedReport", getPersonDiedReport());
		attributes.put("isinfectious", getIsinfectious());
		attributes.put("infectiousReport", getInfectiousReport());
		attributes.put("illPassengersGreaterNomal",
			getIllPassengersGreaterNomal());
		attributes.put("illPassengersNo", getIllPassengersNo());
		attributes.put("illPersonsOnBoard", getIllPersonsOnBoard());
		attributes.put("illPersonsReport", getIllPersonsReport());
		attributes.put("medicalPractitionerConsulted",
			getMedicalPractitionerConsulted());
		attributes.put("medicalTreatmentOrAdvice", getMedicalTreatmentOrAdvice());
		attributes.put("infectionOrSpreadOfDisease",
			getInfectionOrSpreadOfDisease());
		attributes.put("infectionsReport", getInfectionsReport());
		attributes.put("isSanitary", getIsSanitary());
		attributes.put("sanitaryDes", getSanitaryDes());
		attributes.put("isStowaways", getIsStowaways());
		attributes.put("joinShip", getJoinShip());
		attributes.put("isAnimal", getIsAnimal());

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

		String healthQuestionCode = (String)attributes.get("healthQuestionCode");

		if (healthQuestionCode != null) {
			setHealthQuestionCode(healthQuestionCode);
		}

		Integer personDied = (Integer)attributes.get("personDied");

		if (personDied != null) {
			setPersonDied(personDied);
		}

		Integer personDiedNo = (Integer)attributes.get("personDiedNo");

		if (personDiedNo != null) {
			setPersonDiedNo(personDiedNo);
		}

		String personDiedReport = (String)attributes.get("personDiedReport");

		if (personDiedReport != null) {
			setPersonDiedReport(personDiedReport);
		}

		Integer isinfectious = (Integer)attributes.get("isinfectious");

		if (isinfectious != null) {
			setIsinfectious(isinfectious);
		}

		String infectiousReport = (String)attributes.get("infectiousReport");

		if (infectiousReport != null) {
			setInfectiousReport(infectiousReport);
		}

		Integer illPassengersGreaterNomal = (Integer)attributes.get(
				"illPassengersGreaterNomal");

		if (illPassengersGreaterNomal != null) {
			setIllPassengersGreaterNomal(illPassengersGreaterNomal);
		}

		Integer illPassengersNo = (Integer)attributes.get("illPassengersNo");

		if (illPassengersNo != null) {
			setIllPassengersNo(illPassengersNo);
		}

		Integer illPersonsOnBoard = (Integer)attributes.get("illPersonsOnBoard");

		if (illPersonsOnBoard != null) {
			setIllPersonsOnBoard(illPersonsOnBoard);
		}

		Integer illPersonsReport = (Integer)attributes.get("illPersonsReport");

		if (illPersonsReport != null) {
			setIllPersonsReport(illPersonsReport);
		}

		Integer medicalPractitionerConsulted = (Integer)attributes.get(
				"medicalPractitionerConsulted");

		if (medicalPractitionerConsulted != null) {
			setMedicalPractitionerConsulted(medicalPractitionerConsulted);
		}

		String medicalTreatmentOrAdvice = (String)attributes.get(
				"medicalTreatmentOrAdvice");

		if (medicalTreatmentOrAdvice != null) {
			setMedicalTreatmentOrAdvice(medicalTreatmentOrAdvice);
		}

		Integer infectionOrSpreadOfDisease = (Integer)attributes.get(
				"infectionOrSpreadOfDisease");

		if (infectionOrSpreadOfDisease != null) {
			setInfectionOrSpreadOfDisease(infectionOrSpreadOfDisease);
		}

		String infectionsReport = (String)attributes.get("infectionsReport");

		if (infectionsReport != null) {
			setInfectionsReport(infectionsReport);
		}

		Integer isSanitary = (Integer)attributes.get("isSanitary");

		if (isSanitary != null) {
			setIsSanitary(isSanitary);
		}

		String sanitaryDes = (String)attributes.get("sanitaryDes");

		if (sanitaryDes != null) {
			setSanitaryDes(sanitaryDes);
		}

		Integer isStowaways = (Integer)attributes.get("isStowaways");

		if (isStowaways != null) {
			setIsStowaways(isStowaways);
		}

		String joinShip = (String)attributes.get("joinShip");

		if (joinShip != null) {
			setJoinShip(joinShip);
		}

		Integer isAnimal = (Integer)attributes.get("isAnimal");

		if (isAnimal != null) {
			setIsAnimal(isAnimal);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tempHealthQuestionRemoteModel != null) {
			try {
				Class<?> clazz = _tempHealthQuestionRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tempHealthQuestionRemoteModel, id);
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

		if (_tempHealthQuestionRemoteModel != null) {
			try {
				Class<?> clazz = _tempHealthQuestionRemoteModel.getClass();

				Method method = clazz.getMethod("setRequestCode", String.class);

				method.invoke(_tempHealthQuestionRemoteModel, requestCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getHealthQuestionCode() {
		return _healthQuestionCode;
	}

	@Override
	public void setHealthQuestionCode(String healthQuestionCode) {
		_healthQuestionCode = healthQuestionCode;

		if (_tempHealthQuestionRemoteModel != null) {
			try {
				Class<?> clazz = _tempHealthQuestionRemoteModel.getClass();

				Method method = clazz.getMethod("setHealthQuestionCode",
						String.class);

				method.invoke(_tempHealthQuestionRemoteModel, healthQuestionCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPersonDied() {
		return _personDied;
	}

	@Override
	public void setPersonDied(int personDied) {
		_personDied = personDied;

		if (_tempHealthQuestionRemoteModel != null) {
			try {
				Class<?> clazz = _tempHealthQuestionRemoteModel.getClass();

				Method method = clazz.getMethod("setPersonDied", int.class);

				method.invoke(_tempHealthQuestionRemoteModel, personDied);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPersonDiedNo() {
		return _personDiedNo;
	}

	@Override
	public void setPersonDiedNo(int personDiedNo) {
		_personDiedNo = personDiedNo;

		if (_tempHealthQuestionRemoteModel != null) {
			try {
				Class<?> clazz = _tempHealthQuestionRemoteModel.getClass();

				Method method = clazz.getMethod("setPersonDiedNo", int.class);

				method.invoke(_tempHealthQuestionRemoteModel, personDiedNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPersonDiedReport() {
		return _personDiedReport;
	}

	@Override
	public void setPersonDiedReport(String personDiedReport) {
		_personDiedReport = personDiedReport;

		if (_tempHealthQuestionRemoteModel != null) {
			try {
				Class<?> clazz = _tempHealthQuestionRemoteModel.getClass();

				Method method = clazz.getMethod("setPersonDiedReport",
						String.class);

				method.invoke(_tempHealthQuestionRemoteModel, personDiedReport);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIsinfectious() {
		return _isinfectious;
	}

	@Override
	public void setIsinfectious(int isinfectious) {
		_isinfectious = isinfectious;

		if (_tempHealthQuestionRemoteModel != null) {
			try {
				Class<?> clazz = _tempHealthQuestionRemoteModel.getClass();

				Method method = clazz.getMethod("setIsinfectious", int.class);

				method.invoke(_tempHealthQuestionRemoteModel, isinfectious);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInfectiousReport() {
		return _infectiousReport;
	}

	@Override
	public void setInfectiousReport(String infectiousReport) {
		_infectiousReport = infectiousReport;

		if (_tempHealthQuestionRemoteModel != null) {
			try {
				Class<?> clazz = _tempHealthQuestionRemoteModel.getClass();

				Method method = clazz.getMethod("setInfectiousReport",
						String.class);

				method.invoke(_tempHealthQuestionRemoteModel, infectiousReport);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIllPassengersGreaterNomal() {
		return _illPassengersGreaterNomal;
	}

	@Override
	public void setIllPassengersGreaterNomal(int illPassengersGreaterNomal) {
		_illPassengersGreaterNomal = illPassengersGreaterNomal;

		if (_tempHealthQuestionRemoteModel != null) {
			try {
				Class<?> clazz = _tempHealthQuestionRemoteModel.getClass();

				Method method = clazz.getMethod("setIllPassengersGreaterNomal",
						int.class);

				method.invoke(_tempHealthQuestionRemoteModel,
					illPassengersGreaterNomal);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIllPassengersNo() {
		return _illPassengersNo;
	}

	@Override
	public void setIllPassengersNo(int illPassengersNo) {
		_illPassengersNo = illPassengersNo;

		if (_tempHealthQuestionRemoteModel != null) {
			try {
				Class<?> clazz = _tempHealthQuestionRemoteModel.getClass();

				Method method = clazz.getMethod("setIllPassengersNo", int.class);

				method.invoke(_tempHealthQuestionRemoteModel, illPassengersNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIllPersonsOnBoard() {
		return _illPersonsOnBoard;
	}

	@Override
	public void setIllPersonsOnBoard(int illPersonsOnBoard) {
		_illPersonsOnBoard = illPersonsOnBoard;

		if (_tempHealthQuestionRemoteModel != null) {
			try {
				Class<?> clazz = _tempHealthQuestionRemoteModel.getClass();

				Method method = clazz.getMethod("setIllPersonsOnBoard",
						int.class);

				method.invoke(_tempHealthQuestionRemoteModel, illPersonsOnBoard);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIllPersonsReport() {
		return _illPersonsReport;
	}

	@Override
	public void setIllPersonsReport(int illPersonsReport) {
		_illPersonsReport = illPersonsReport;

		if (_tempHealthQuestionRemoteModel != null) {
			try {
				Class<?> clazz = _tempHealthQuestionRemoteModel.getClass();

				Method method = clazz.getMethod("setIllPersonsReport", int.class);

				method.invoke(_tempHealthQuestionRemoteModel, illPersonsReport);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMedicalPractitionerConsulted() {
		return _medicalPractitionerConsulted;
	}

	@Override
	public void setMedicalPractitionerConsulted(
		int medicalPractitionerConsulted) {
		_medicalPractitionerConsulted = medicalPractitionerConsulted;

		if (_tempHealthQuestionRemoteModel != null) {
			try {
				Class<?> clazz = _tempHealthQuestionRemoteModel.getClass();

				Method method = clazz.getMethod("setMedicalPractitionerConsulted",
						int.class);

				method.invoke(_tempHealthQuestionRemoteModel,
					medicalPractitionerConsulted);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMedicalTreatmentOrAdvice() {
		return _medicalTreatmentOrAdvice;
	}

	@Override
	public void setMedicalTreatmentOrAdvice(String medicalTreatmentOrAdvice) {
		_medicalTreatmentOrAdvice = medicalTreatmentOrAdvice;

		if (_tempHealthQuestionRemoteModel != null) {
			try {
				Class<?> clazz = _tempHealthQuestionRemoteModel.getClass();

				Method method = clazz.getMethod("setMedicalTreatmentOrAdvice",
						String.class);

				method.invoke(_tempHealthQuestionRemoteModel,
					medicalTreatmentOrAdvice);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getInfectionOrSpreadOfDisease() {
		return _infectionOrSpreadOfDisease;
	}

	@Override
	public void setInfectionOrSpreadOfDisease(int infectionOrSpreadOfDisease) {
		_infectionOrSpreadOfDisease = infectionOrSpreadOfDisease;

		if (_tempHealthQuestionRemoteModel != null) {
			try {
				Class<?> clazz = _tempHealthQuestionRemoteModel.getClass();

				Method method = clazz.getMethod("setInfectionOrSpreadOfDisease",
						int.class);

				method.invoke(_tempHealthQuestionRemoteModel,
					infectionOrSpreadOfDisease);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInfectionsReport() {
		return _infectionsReport;
	}

	@Override
	public void setInfectionsReport(String infectionsReport) {
		_infectionsReport = infectionsReport;

		if (_tempHealthQuestionRemoteModel != null) {
			try {
				Class<?> clazz = _tempHealthQuestionRemoteModel.getClass();

				Method method = clazz.getMethod("setInfectionsReport",
						String.class);

				method.invoke(_tempHealthQuestionRemoteModel, infectionsReport);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIsSanitary() {
		return _isSanitary;
	}

	@Override
	public void setIsSanitary(int isSanitary) {
		_isSanitary = isSanitary;

		if (_tempHealthQuestionRemoteModel != null) {
			try {
				Class<?> clazz = _tempHealthQuestionRemoteModel.getClass();

				Method method = clazz.getMethod("setIsSanitary", int.class);

				method.invoke(_tempHealthQuestionRemoteModel, isSanitary);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSanitaryDes() {
		return _sanitaryDes;
	}

	@Override
	public void setSanitaryDes(String sanitaryDes) {
		_sanitaryDes = sanitaryDes;

		if (_tempHealthQuestionRemoteModel != null) {
			try {
				Class<?> clazz = _tempHealthQuestionRemoteModel.getClass();

				Method method = clazz.getMethod("setSanitaryDes", String.class);

				method.invoke(_tempHealthQuestionRemoteModel, sanitaryDes);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIsStowaways() {
		return _isStowaways;
	}

	@Override
	public void setIsStowaways(int isStowaways) {
		_isStowaways = isStowaways;

		if (_tempHealthQuestionRemoteModel != null) {
			try {
				Class<?> clazz = _tempHealthQuestionRemoteModel.getClass();

				Method method = clazz.getMethod("setIsStowaways", int.class);

				method.invoke(_tempHealthQuestionRemoteModel, isStowaways);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getJoinShip() {
		return _joinShip;
	}

	@Override
	public void setJoinShip(String joinShip) {
		_joinShip = joinShip;

		if (_tempHealthQuestionRemoteModel != null) {
			try {
				Class<?> clazz = _tempHealthQuestionRemoteModel.getClass();

				Method method = clazz.getMethod("setJoinShip", String.class);

				method.invoke(_tempHealthQuestionRemoteModel, joinShip);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIsAnimal() {
		return _isAnimal;
	}

	@Override
	public void setIsAnimal(int isAnimal) {
		_isAnimal = isAnimal;

		if (_tempHealthQuestionRemoteModel != null) {
			try {
				Class<?> clazz = _tempHealthQuestionRemoteModel.getClass();

				Method method = clazz.getMethod("setIsAnimal", int.class);

				method.invoke(_tempHealthQuestionRemoteModel, isAnimal);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTempHealthQuestionRemoteModel() {
		return _tempHealthQuestionRemoteModel;
	}

	public void setTempHealthQuestionRemoteModel(
		BaseModel<?> tempHealthQuestionRemoteModel) {
		_tempHealthQuestionRemoteModel = tempHealthQuestionRemoteModel;
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

		Class<?> remoteModelClass = _tempHealthQuestionRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tempHealthQuestionRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TempHealthQuestionLocalServiceUtil.addTempHealthQuestion(this);
		}
		else {
			TempHealthQuestionLocalServiceUtil.updateTempHealthQuestion(this);
		}
	}

	@Override
	public TempHealthQuestion toEscapedModel() {
		return (TempHealthQuestion)ProxyUtil.newProxyInstance(TempHealthQuestion.class.getClassLoader(),
			new Class[] { TempHealthQuestion.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TempHealthQuestionClp clone = new TempHealthQuestionClp();

		clone.setId(getId());
		clone.setRequestCode(getRequestCode());
		clone.setHealthQuestionCode(getHealthQuestionCode());
		clone.setPersonDied(getPersonDied());
		clone.setPersonDiedNo(getPersonDiedNo());
		clone.setPersonDiedReport(getPersonDiedReport());
		clone.setIsinfectious(getIsinfectious());
		clone.setInfectiousReport(getInfectiousReport());
		clone.setIllPassengersGreaterNomal(getIllPassengersGreaterNomal());
		clone.setIllPassengersNo(getIllPassengersNo());
		clone.setIllPersonsOnBoard(getIllPersonsOnBoard());
		clone.setIllPersonsReport(getIllPersonsReport());
		clone.setMedicalPractitionerConsulted(getMedicalPractitionerConsulted());
		clone.setMedicalTreatmentOrAdvice(getMedicalTreatmentOrAdvice());
		clone.setInfectionOrSpreadOfDisease(getInfectionOrSpreadOfDisease());
		clone.setInfectionsReport(getInfectionsReport());
		clone.setIsSanitary(getIsSanitary());
		clone.setSanitaryDes(getSanitaryDes());
		clone.setIsStowaways(getIsStowaways());
		clone.setJoinShip(getJoinShip());
		clone.setIsAnimal(getIsAnimal());

		return clone;
	}

	@Override
	public int compareTo(TempHealthQuestion tempHealthQuestion) {
		int value = 0;

		if (getId() < tempHealthQuestion.getId()) {
			value = -1;
		}
		else if (getId() > tempHealthQuestion.getId()) {
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

		if (!(obj instanceof TempHealthQuestionClp)) {
			return false;
		}

		TempHealthQuestionClp tempHealthQuestion = (TempHealthQuestionClp)obj;

		long primaryKey = tempHealthQuestion.getPrimaryKey();

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
		StringBundler sb = new StringBundler(43);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", healthQuestionCode=");
		sb.append(getHealthQuestionCode());
		sb.append(", personDied=");
		sb.append(getPersonDied());
		sb.append(", personDiedNo=");
		sb.append(getPersonDiedNo());
		sb.append(", personDiedReport=");
		sb.append(getPersonDiedReport());
		sb.append(", isinfectious=");
		sb.append(getIsinfectious());
		sb.append(", infectiousReport=");
		sb.append(getInfectiousReport());
		sb.append(", illPassengersGreaterNomal=");
		sb.append(getIllPassengersGreaterNomal());
		sb.append(", illPassengersNo=");
		sb.append(getIllPassengersNo());
		sb.append(", illPersonsOnBoard=");
		sb.append(getIllPersonsOnBoard());
		sb.append(", illPersonsReport=");
		sb.append(getIllPersonsReport());
		sb.append(", medicalPractitionerConsulted=");
		sb.append(getMedicalPractitionerConsulted());
		sb.append(", medicalTreatmentOrAdvice=");
		sb.append(getMedicalTreatmentOrAdvice());
		sb.append(", infectionOrSpreadOfDisease=");
		sb.append(getInfectionOrSpreadOfDisease());
		sb.append(", infectionsReport=");
		sb.append(getInfectionsReport());
		sb.append(", isSanitary=");
		sb.append(getIsSanitary());
		sb.append(", sanitaryDes=");
		sb.append(getSanitaryDes());
		sb.append(", isStowaways=");
		sb.append(getIsStowaways());
		sb.append(", joinShip=");
		sb.append(getJoinShip());
		sb.append(", isAnimal=");
		sb.append(getIsAnimal());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(67);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.TempHealthQuestion");
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
			"<column><column-name>healthQuestionCode</column-name><column-value><![CDATA[");
		sb.append(getHealthQuestionCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>personDied</column-name><column-value><![CDATA[");
		sb.append(getPersonDied());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>personDiedNo</column-name><column-value><![CDATA[");
		sb.append(getPersonDiedNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>personDiedReport</column-name><column-value><![CDATA[");
		sb.append(getPersonDiedReport());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isinfectious</column-name><column-value><![CDATA[");
		sb.append(getIsinfectious());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>infectiousReport</column-name><column-value><![CDATA[");
		sb.append(getInfectiousReport());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>illPassengersGreaterNomal</column-name><column-value><![CDATA[");
		sb.append(getIllPassengersGreaterNomal());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>illPassengersNo</column-name><column-value><![CDATA[");
		sb.append(getIllPassengersNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>illPersonsOnBoard</column-name><column-value><![CDATA[");
		sb.append(getIllPersonsOnBoard());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>illPersonsReport</column-name><column-value><![CDATA[");
		sb.append(getIllPersonsReport());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>medicalPractitionerConsulted</column-name><column-value><![CDATA[");
		sb.append(getMedicalPractitionerConsulted());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>medicalTreatmentOrAdvice</column-name><column-value><![CDATA[");
		sb.append(getMedicalTreatmentOrAdvice());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>infectionOrSpreadOfDisease</column-name><column-value><![CDATA[");
		sb.append(getInfectionOrSpreadOfDisease());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>infectionsReport</column-name><column-value><![CDATA[");
		sb.append(getInfectionsReport());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isSanitary</column-name><column-value><![CDATA[");
		sb.append(getIsSanitary());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sanitaryDes</column-name><column-value><![CDATA[");
		sb.append(getSanitaryDes());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isStowaways</column-name><column-value><![CDATA[");
		sb.append(getIsStowaways());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>joinShip</column-name><column-value><![CDATA[");
		sb.append(getJoinShip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isAnimal</column-name><column-value><![CDATA[");
		sb.append(getIsAnimal());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _requestCode;
	private String _healthQuestionCode;
	private int _personDied;
	private int _personDiedNo;
	private String _personDiedReport;
	private int _isinfectious;
	private String _infectiousReport;
	private int _illPassengersGreaterNomal;
	private int _illPassengersNo;
	private int _illPersonsOnBoard;
	private int _illPersonsReport;
	private int _medicalPractitionerConsulted;
	private String _medicalTreatmentOrAdvice;
	private int _infectionOrSpreadOfDisease;
	private String _infectionsReport;
	private int _isSanitary;
	private String _sanitaryDes;
	private int _isStowaways;
	private String _joinShip;
	private int _isAnimal;
	private BaseModel<?> _tempHealthQuestionRemoteModel;
	private Class<?> _clpSerializerClass = vn.dtt.duongbien.dao.vrcb.service.ClpSerializer.class;
}