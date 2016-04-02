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

import vn.dtt.duongbien.dao.vrcb.model.TempHealthQuestion;
import vn.dtt.duongbien.dao.vrcb.model.TempHealthQuestionModel;
import vn.dtt.duongbien.dao.vrcb.model.TempHealthQuestionSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the TempHealthQuestion service. Represents a row in the &quot;TEMP_HEALTH_QUESTION&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbien.dao.vrcb.model.TempHealthQuestionModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TempHealthQuestionImpl}.
 * </p>
 *
 * @author longdm
 * @see TempHealthQuestionImpl
 * @see vn.dtt.duongbien.dao.vrcb.model.TempHealthQuestion
 * @see vn.dtt.duongbien.dao.vrcb.model.TempHealthQuestionModel
 * @generated
 */
@JSON(strict = true)
public class TempHealthQuestionModelImpl extends BaseModelImpl<TempHealthQuestion>
	implements TempHealthQuestionModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a temp health question model instance should use the {@link vn.dtt.duongbien.dao.vrcb.model.TempHealthQuestion} interface instead.
	 */
	public static final String TABLE_NAME = "TEMP_HEALTH_QUESTION";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.BIGINT },
			{ "RequestCode", Types.VARCHAR },
			{ "HealthQuestionCode", Types.VARCHAR },
			{ "PersonDied", Types.INTEGER },
			{ "PersonDiedNo", Types.INTEGER },
			{ "PersonDiedReport", Types.VARCHAR },
			{ "IsInfectious", Types.INTEGER },
			{ "InfectiousReport", Types.VARCHAR },
			{ "IllPassengersGreaterNomal", Types.INTEGER },
			{ "IllPassengersNo", Types.INTEGER },
			{ "IllPersonsOnBoard", Types.INTEGER },
			{ "IllPersonsReport", Types.INTEGER },
			{ "MedicalPractitionerConsulted", Types.INTEGER },
			{ "MedicalTreatmentOrAdvice", Types.VARCHAR },
			{ "InfectionOrSpreadOfDisease", Types.INTEGER },
			{ "InfectionsReport", Types.VARCHAR },
			{ "IsSanitary", Types.INTEGER },
			{ "SanitaryDes", Types.VARCHAR },
			{ "IsStowaways", Types.INTEGER },
			{ "JoinShip", Types.VARCHAR },
			{ "IsAnimal", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table TEMP_HEALTH_QUESTION (ID LONG not null primary key,RequestCode VARCHAR(75) null,HealthQuestionCode VARCHAR(75) null,PersonDied INTEGER,PersonDiedNo INTEGER,PersonDiedReport VARCHAR(75) null,IsInfectious INTEGER,InfectiousReport VARCHAR(75) null,IllPassengersGreaterNomal INTEGER,IllPassengersNo INTEGER,IllPersonsOnBoard INTEGER,IllPersonsReport INTEGER,MedicalPractitionerConsulted INTEGER,MedicalTreatmentOrAdvice VARCHAR(75) null,InfectionOrSpreadOfDisease INTEGER,InfectionsReport VARCHAR(75) null,IsSanitary INTEGER,SanitaryDes VARCHAR(75) null,IsStowaways INTEGER,JoinShip VARCHAR(75) null,IsAnimal INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table TEMP_HEALTH_QUESTION";
	public static final String ORDER_BY_JPQL = " ORDER BY tempHealthQuestion.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY TEMP_HEALTH_QUESTION.ID ASC";
	public static final String DATA_SOURCE = "vaoracangbienDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.TempHealthQuestion"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.TempHealthQuestion"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.duongbien.dao.vrcb.model.TempHealthQuestion"),
			true);
	public static long REQUESTCODE_COLUMN_BITMASK = 1L;
	public static long ID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static TempHealthQuestion toModel(TempHealthQuestionSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		TempHealthQuestion model = new TempHealthQuestionImpl();

		model.setId(soapModel.getId());
		model.setRequestCode(soapModel.getRequestCode());
		model.setHealthQuestionCode(soapModel.getHealthQuestionCode());
		model.setPersonDied(soapModel.getPersonDied());
		model.setPersonDiedNo(soapModel.getPersonDiedNo());
		model.setPersonDiedReport(soapModel.getPersonDiedReport());
		model.setIsinfectious(soapModel.getIsinfectious());
		model.setInfectiousReport(soapModel.getInfectiousReport());
		model.setIllPassengersGreaterNomal(soapModel.getIllPassengersGreaterNomal());
		model.setIllPassengersNo(soapModel.getIllPassengersNo());
		model.setIllPersonsOnBoard(soapModel.getIllPersonsOnBoard());
		model.setIllPersonsReport(soapModel.getIllPersonsReport());
		model.setMedicalPractitionerConsulted(soapModel.getMedicalPractitionerConsulted());
		model.setMedicalTreatmentOrAdvice(soapModel.getMedicalTreatmentOrAdvice());
		model.setInfectionOrSpreadOfDisease(soapModel.getInfectionOrSpreadOfDisease());
		model.setInfectionsReport(soapModel.getInfectionsReport());
		model.setIsSanitary(soapModel.getIsSanitary());
		model.setSanitaryDes(soapModel.getSanitaryDes());
		model.setIsStowaways(soapModel.getIsStowaways());
		model.setJoinShip(soapModel.getJoinShip());
		model.setIsAnimal(soapModel.getIsAnimal());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<TempHealthQuestion> toModels(
		TempHealthQuestionSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<TempHealthQuestion> models = new ArrayList<TempHealthQuestion>(soapModels.length);

		for (TempHealthQuestionSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbien.dao.vrcb.model.TempHealthQuestion"));

	public TempHealthQuestionModelImpl() {
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
		return TempHealthQuestion.class;
	}

	@Override
	public String getModelClassName() {
		return TempHealthQuestion.class.getName();
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
		_columnBitmask |= REQUESTCODE_COLUMN_BITMASK;

		if (_originalRequestCode == null) {
			_originalRequestCode = _requestCode;
		}

		_requestCode = requestCode;
	}

	public String getOriginalRequestCode() {
		return GetterUtil.getString(_originalRequestCode);
	}

	@JSON
	@Override
	public String getHealthQuestionCode() {
		if (_healthQuestionCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _healthQuestionCode;
		}
	}

	@Override
	public void setHealthQuestionCode(String healthQuestionCode) {
		_healthQuestionCode = healthQuestionCode;
	}

	@JSON
	@Override
	public int getPersonDied() {
		return _personDied;
	}

	@Override
	public void setPersonDied(int personDied) {
		_personDied = personDied;
	}

	@JSON
	@Override
	public int getPersonDiedNo() {
		return _personDiedNo;
	}

	@Override
	public void setPersonDiedNo(int personDiedNo) {
		_personDiedNo = personDiedNo;
	}

	@JSON
	@Override
	public String getPersonDiedReport() {
		if (_personDiedReport == null) {
			return StringPool.BLANK;
		}
		else {
			return _personDiedReport;
		}
	}

	@Override
	public void setPersonDiedReport(String personDiedReport) {
		_personDiedReport = personDiedReport;
	}

	@JSON
	@Override
	public int getIsinfectious() {
		return _isinfectious;
	}

	@Override
	public void setIsinfectious(int isinfectious) {
		_isinfectious = isinfectious;
	}

	@JSON
	@Override
	public String getInfectiousReport() {
		if (_infectiousReport == null) {
			return StringPool.BLANK;
		}
		else {
			return _infectiousReport;
		}
	}

	@Override
	public void setInfectiousReport(String infectiousReport) {
		_infectiousReport = infectiousReport;
	}

	@JSON
	@Override
	public int getIllPassengersGreaterNomal() {
		return _illPassengersGreaterNomal;
	}

	@Override
	public void setIllPassengersGreaterNomal(int illPassengersGreaterNomal) {
		_illPassengersGreaterNomal = illPassengersGreaterNomal;
	}

	@JSON
	@Override
	public int getIllPassengersNo() {
		return _illPassengersNo;
	}

	@Override
	public void setIllPassengersNo(int illPassengersNo) {
		_illPassengersNo = illPassengersNo;
	}

	@JSON
	@Override
	public int getIllPersonsOnBoard() {
		return _illPersonsOnBoard;
	}

	@Override
	public void setIllPersonsOnBoard(int illPersonsOnBoard) {
		_illPersonsOnBoard = illPersonsOnBoard;
	}

	@JSON
	@Override
	public int getIllPersonsReport() {
		return _illPersonsReport;
	}

	@Override
	public void setIllPersonsReport(int illPersonsReport) {
		_illPersonsReport = illPersonsReport;
	}

	@JSON
	@Override
	public int getMedicalPractitionerConsulted() {
		return _medicalPractitionerConsulted;
	}

	@Override
	public void setMedicalPractitionerConsulted(
		int medicalPractitionerConsulted) {
		_medicalPractitionerConsulted = medicalPractitionerConsulted;
	}

	@JSON
	@Override
	public String getMedicalTreatmentOrAdvice() {
		if (_medicalTreatmentOrAdvice == null) {
			return StringPool.BLANK;
		}
		else {
			return _medicalTreatmentOrAdvice;
		}
	}

	@Override
	public void setMedicalTreatmentOrAdvice(String medicalTreatmentOrAdvice) {
		_medicalTreatmentOrAdvice = medicalTreatmentOrAdvice;
	}

	@JSON
	@Override
	public int getInfectionOrSpreadOfDisease() {
		return _infectionOrSpreadOfDisease;
	}

	@Override
	public void setInfectionOrSpreadOfDisease(int infectionOrSpreadOfDisease) {
		_infectionOrSpreadOfDisease = infectionOrSpreadOfDisease;
	}

	@JSON
	@Override
	public String getInfectionsReport() {
		if (_infectionsReport == null) {
			return StringPool.BLANK;
		}
		else {
			return _infectionsReport;
		}
	}

	@Override
	public void setInfectionsReport(String infectionsReport) {
		_infectionsReport = infectionsReport;
	}

	@JSON
	@Override
	public int getIsSanitary() {
		return _isSanitary;
	}

	@Override
	public void setIsSanitary(int isSanitary) {
		_isSanitary = isSanitary;
	}

	@JSON
	@Override
	public String getSanitaryDes() {
		if (_sanitaryDes == null) {
			return StringPool.BLANK;
		}
		else {
			return _sanitaryDes;
		}
	}

	@Override
	public void setSanitaryDes(String sanitaryDes) {
		_sanitaryDes = sanitaryDes;
	}

	@JSON
	@Override
	public int getIsStowaways() {
		return _isStowaways;
	}

	@Override
	public void setIsStowaways(int isStowaways) {
		_isStowaways = isStowaways;
	}

	@JSON
	@Override
	public String getJoinShip() {
		if (_joinShip == null) {
			return StringPool.BLANK;
		}
		else {
			return _joinShip;
		}
	}

	@Override
	public void setJoinShip(String joinShip) {
		_joinShip = joinShip;
	}

	@JSON
	@Override
	public int getIsAnimal() {
		return _isAnimal;
	}

	@Override
	public void setIsAnimal(int isAnimal) {
		_isAnimal = isAnimal;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			TempHealthQuestion.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TempHealthQuestion toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (TempHealthQuestion)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TempHealthQuestionImpl tempHealthQuestionImpl = new TempHealthQuestionImpl();

		tempHealthQuestionImpl.setId(getId());
		tempHealthQuestionImpl.setRequestCode(getRequestCode());
		tempHealthQuestionImpl.setHealthQuestionCode(getHealthQuestionCode());
		tempHealthQuestionImpl.setPersonDied(getPersonDied());
		tempHealthQuestionImpl.setPersonDiedNo(getPersonDiedNo());
		tempHealthQuestionImpl.setPersonDiedReport(getPersonDiedReport());
		tempHealthQuestionImpl.setIsinfectious(getIsinfectious());
		tempHealthQuestionImpl.setInfectiousReport(getInfectiousReport());
		tempHealthQuestionImpl.setIllPassengersGreaterNomal(getIllPassengersGreaterNomal());
		tempHealthQuestionImpl.setIllPassengersNo(getIllPassengersNo());
		tempHealthQuestionImpl.setIllPersonsOnBoard(getIllPersonsOnBoard());
		tempHealthQuestionImpl.setIllPersonsReport(getIllPersonsReport());
		tempHealthQuestionImpl.setMedicalPractitionerConsulted(getMedicalPractitionerConsulted());
		tempHealthQuestionImpl.setMedicalTreatmentOrAdvice(getMedicalTreatmentOrAdvice());
		tempHealthQuestionImpl.setInfectionOrSpreadOfDisease(getInfectionOrSpreadOfDisease());
		tempHealthQuestionImpl.setInfectionsReport(getInfectionsReport());
		tempHealthQuestionImpl.setIsSanitary(getIsSanitary());
		tempHealthQuestionImpl.setSanitaryDes(getSanitaryDes());
		tempHealthQuestionImpl.setIsStowaways(getIsStowaways());
		tempHealthQuestionImpl.setJoinShip(getJoinShip());
		tempHealthQuestionImpl.setIsAnimal(getIsAnimal());

		tempHealthQuestionImpl.resetOriginalValues();

		return tempHealthQuestionImpl;
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

		if (!(obj instanceof TempHealthQuestion)) {
			return false;
		}

		TempHealthQuestion tempHealthQuestion = (TempHealthQuestion)obj;

		long primaryKey = tempHealthQuestion.getPrimaryKey();

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
		TempHealthQuestionModelImpl tempHealthQuestionModelImpl = this;

		tempHealthQuestionModelImpl._originalRequestCode = tempHealthQuestionModelImpl._requestCode;

		tempHealthQuestionModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<TempHealthQuestion> toCacheModel() {
		TempHealthQuestionCacheModel tempHealthQuestionCacheModel = new TempHealthQuestionCacheModel();

		tempHealthQuestionCacheModel.id = getId();

		tempHealthQuestionCacheModel.requestCode = getRequestCode();

		String requestCode = tempHealthQuestionCacheModel.requestCode;

		if ((requestCode != null) && (requestCode.length() == 0)) {
			tempHealthQuestionCacheModel.requestCode = null;
		}

		tempHealthQuestionCacheModel.healthQuestionCode = getHealthQuestionCode();

		String healthQuestionCode = tempHealthQuestionCacheModel.healthQuestionCode;

		if ((healthQuestionCode != null) && (healthQuestionCode.length() == 0)) {
			tempHealthQuestionCacheModel.healthQuestionCode = null;
		}

		tempHealthQuestionCacheModel.personDied = getPersonDied();

		tempHealthQuestionCacheModel.personDiedNo = getPersonDiedNo();

		tempHealthQuestionCacheModel.personDiedReport = getPersonDiedReport();

		String personDiedReport = tempHealthQuestionCacheModel.personDiedReport;

		if ((personDiedReport != null) && (personDiedReport.length() == 0)) {
			tempHealthQuestionCacheModel.personDiedReport = null;
		}

		tempHealthQuestionCacheModel.isinfectious = getIsinfectious();

		tempHealthQuestionCacheModel.infectiousReport = getInfectiousReport();

		String infectiousReport = tempHealthQuestionCacheModel.infectiousReport;

		if ((infectiousReport != null) && (infectiousReport.length() == 0)) {
			tempHealthQuestionCacheModel.infectiousReport = null;
		}

		tempHealthQuestionCacheModel.illPassengersGreaterNomal = getIllPassengersGreaterNomal();

		tempHealthQuestionCacheModel.illPassengersNo = getIllPassengersNo();

		tempHealthQuestionCacheModel.illPersonsOnBoard = getIllPersonsOnBoard();

		tempHealthQuestionCacheModel.illPersonsReport = getIllPersonsReport();

		tempHealthQuestionCacheModel.medicalPractitionerConsulted = getMedicalPractitionerConsulted();

		tempHealthQuestionCacheModel.medicalTreatmentOrAdvice = getMedicalTreatmentOrAdvice();

		String medicalTreatmentOrAdvice = tempHealthQuestionCacheModel.medicalTreatmentOrAdvice;

		if ((medicalTreatmentOrAdvice != null) &&
				(medicalTreatmentOrAdvice.length() == 0)) {
			tempHealthQuestionCacheModel.medicalTreatmentOrAdvice = null;
		}

		tempHealthQuestionCacheModel.infectionOrSpreadOfDisease = getInfectionOrSpreadOfDisease();

		tempHealthQuestionCacheModel.infectionsReport = getInfectionsReport();

		String infectionsReport = tempHealthQuestionCacheModel.infectionsReport;

		if ((infectionsReport != null) && (infectionsReport.length() == 0)) {
			tempHealthQuestionCacheModel.infectionsReport = null;
		}

		tempHealthQuestionCacheModel.isSanitary = getIsSanitary();

		tempHealthQuestionCacheModel.sanitaryDes = getSanitaryDes();

		String sanitaryDes = tempHealthQuestionCacheModel.sanitaryDes;

		if ((sanitaryDes != null) && (sanitaryDes.length() == 0)) {
			tempHealthQuestionCacheModel.sanitaryDes = null;
		}

		tempHealthQuestionCacheModel.isStowaways = getIsStowaways();

		tempHealthQuestionCacheModel.joinShip = getJoinShip();

		String joinShip = tempHealthQuestionCacheModel.joinShip;

		if ((joinShip != null) && (joinShip.length() == 0)) {
			tempHealthQuestionCacheModel.joinShip = null;
		}

		tempHealthQuestionCacheModel.isAnimal = getIsAnimal();

		return tempHealthQuestionCacheModel;
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

	private static ClassLoader _classLoader = TempHealthQuestion.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			TempHealthQuestion.class
		};
	private long _id;
	private String _requestCode;
	private String _originalRequestCode;
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
	private long _columnBitmask;
	private TempHealthQuestion _escapedModel;
}