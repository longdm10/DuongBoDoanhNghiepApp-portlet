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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TempHealthQuestion}.
 * </p>
 *
 * @author longdm
 * @see TempHealthQuestion
 * @generated
 */
public class TempHealthQuestionWrapper implements TempHealthQuestion,
	ModelWrapper<TempHealthQuestion> {
	public TempHealthQuestionWrapper(TempHealthQuestion tempHealthQuestion) {
		_tempHealthQuestion = tempHealthQuestion;
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

	/**
	* Returns the primary key of this temp health question.
	*
	* @return the primary key of this temp health question
	*/
	@Override
	public long getPrimaryKey() {
		return _tempHealthQuestion.getPrimaryKey();
	}

	/**
	* Sets the primary key of this temp health question.
	*
	* @param primaryKey the primary key of this temp health question
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tempHealthQuestion.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this temp health question.
	*
	* @return the ID of this temp health question
	*/
	@Override
	public long getId() {
		return _tempHealthQuestion.getId();
	}

	/**
	* Sets the ID of this temp health question.
	*
	* @param id the ID of this temp health question
	*/
	@Override
	public void setId(long id) {
		_tempHealthQuestion.setId(id);
	}

	/**
	* Returns the request code of this temp health question.
	*
	* @return the request code of this temp health question
	*/
	@Override
	public java.lang.String getRequestCode() {
		return _tempHealthQuestion.getRequestCode();
	}

	/**
	* Sets the request code of this temp health question.
	*
	* @param requestCode the request code of this temp health question
	*/
	@Override
	public void setRequestCode(java.lang.String requestCode) {
		_tempHealthQuestion.setRequestCode(requestCode);
	}

	/**
	* Returns the health question code of this temp health question.
	*
	* @return the health question code of this temp health question
	*/
	@Override
	public java.lang.String getHealthQuestionCode() {
		return _tempHealthQuestion.getHealthQuestionCode();
	}

	/**
	* Sets the health question code of this temp health question.
	*
	* @param healthQuestionCode the health question code of this temp health question
	*/
	@Override
	public void setHealthQuestionCode(java.lang.String healthQuestionCode) {
		_tempHealthQuestion.setHealthQuestionCode(healthQuestionCode);
	}

	/**
	* Returns the person died of this temp health question.
	*
	* @return the person died of this temp health question
	*/
	@Override
	public int getPersonDied() {
		return _tempHealthQuestion.getPersonDied();
	}

	/**
	* Sets the person died of this temp health question.
	*
	* @param personDied the person died of this temp health question
	*/
	@Override
	public void setPersonDied(int personDied) {
		_tempHealthQuestion.setPersonDied(personDied);
	}

	/**
	* Returns the person died no of this temp health question.
	*
	* @return the person died no of this temp health question
	*/
	@Override
	public int getPersonDiedNo() {
		return _tempHealthQuestion.getPersonDiedNo();
	}

	/**
	* Sets the person died no of this temp health question.
	*
	* @param personDiedNo the person died no of this temp health question
	*/
	@Override
	public void setPersonDiedNo(int personDiedNo) {
		_tempHealthQuestion.setPersonDiedNo(personDiedNo);
	}

	/**
	* Returns the person died report of this temp health question.
	*
	* @return the person died report of this temp health question
	*/
	@Override
	public java.lang.String getPersonDiedReport() {
		return _tempHealthQuestion.getPersonDiedReport();
	}

	/**
	* Sets the person died report of this temp health question.
	*
	* @param personDiedReport the person died report of this temp health question
	*/
	@Override
	public void setPersonDiedReport(java.lang.String personDiedReport) {
		_tempHealthQuestion.setPersonDiedReport(personDiedReport);
	}

	/**
	* Returns the isinfectious of this temp health question.
	*
	* @return the isinfectious of this temp health question
	*/
	@Override
	public int getIsinfectious() {
		return _tempHealthQuestion.getIsinfectious();
	}

	/**
	* Sets the isinfectious of this temp health question.
	*
	* @param isinfectious the isinfectious of this temp health question
	*/
	@Override
	public void setIsinfectious(int isinfectious) {
		_tempHealthQuestion.setIsinfectious(isinfectious);
	}

	/**
	* Returns the infectious report of this temp health question.
	*
	* @return the infectious report of this temp health question
	*/
	@Override
	public java.lang.String getInfectiousReport() {
		return _tempHealthQuestion.getInfectiousReport();
	}

	/**
	* Sets the infectious report of this temp health question.
	*
	* @param infectiousReport the infectious report of this temp health question
	*/
	@Override
	public void setInfectiousReport(java.lang.String infectiousReport) {
		_tempHealthQuestion.setInfectiousReport(infectiousReport);
	}

	/**
	* Returns the ill passengers greater nomal of this temp health question.
	*
	* @return the ill passengers greater nomal of this temp health question
	*/
	@Override
	public int getIllPassengersGreaterNomal() {
		return _tempHealthQuestion.getIllPassengersGreaterNomal();
	}

	/**
	* Sets the ill passengers greater nomal of this temp health question.
	*
	* @param illPassengersGreaterNomal the ill passengers greater nomal of this temp health question
	*/
	@Override
	public void setIllPassengersGreaterNomal(int illPassengersGreaterNomal) {
		_tempHealthQuestion.setIllPassengersGreaterNomal(illPassengersGreaterNomal);
	}

	/**
	* Returns the ill passengers no of this temp health question.
	*
	* @return the ill passengers no of this temp health question
	*/
	@Override
	public int getIllPassengersNo() {
		return _tempHealthQuestion.getIllPassengersNo();
	}

	/**
	* Sets the ill passengers no of this temp health question.
	*
	* @param illPassengersNo the ill passengers no of this temp health question
	*/
	@Override
	public void setIllPassengersNo(int illPassengersNo) {
		_tempHealthQuestion.setIllPassengersNo(illPassengersNo);
	}

	/**
	* Returns the ill persons on board of this temp health question.
	*
	* @return the ill persons on board of this temp health question
	*/
	@Override
	public int getIllPersonsOnBoard() {
		return _tempHealthQuestion.getIllPersonsOnBoard();
	}

	/**
	* Sets the ill persons on board of this temp health question.
	*
	* @param illPersonsOnBoard the ill persons on board of this temp health question
	*/
	@Override
	public void setIllPersonsOnBoard(int illPersonsOnBoard) {
		_tempHealthQuestion.setIllPersonsOnBoard(illPersonsOnBoard);
	}

	/**
	* Returns the ill persons report of this temp health question.
	*
	* @return the ill persons report of this temp health question
	*/
	@Override
	public int getIllPersonsReport() {
		return _tempHealthQuestion.getIllPersonsReport();
	}

	/**
	* Sets the ill persons report of this temp health question.
	*
	* @param illPersonsReport the ill persons report of this temp health question
	*/
	@Override
	public void setIllPersonsReport(int illPersonsReport) {
		_tempHealthQuestion.setIllPersonsReport(illPersonsReport);
	}

	/**
	* Returns the medical practitioner consulted of this temp health question.
	*
	* @return the medical practitioner consulted of this temp health question
	*/
	@Override
	public int getMedicalPractitionerConsulted() {
		return _tempHealthQuestion.getMedicalPractitionerConsulted();
	}

	/**
	* Sets the medical practitioner consulted of this temp health question.
	*
	* @param medicalPractitionerConsulted the medical practitioner consulted of this temp health question
	*/
	@Override
	public void setMedicalPractitionerConsulted(
		int medicalPractitionerConsulted) {
		_tempHealthQuestion.setMedicalPractitionerConsulted(medicalPractitionerConsulted);
	}

	/**
	* Returns the medical treatment or advice of this temp health question.
	*
	* @return the medical treatment or advice of this temp health question
	*/
	@Override
	public java.lang.String getMedicalTreatmentOrAdvice() {
		return _tempHealthQuestion.getMedicalTreatmentOrAdvice();
	}

	/**
	* Sets the medical treatment or advice of this temp health question.
	*
	* @param medicalTreatmentOrAdvice the medical treatment or advice of this temp health question
	*/
	@Override
	public void setMedicalTreatmentOrAdvice(
		java.lang.String medicalTreatmentOrAdvice) {
		_tempHealthQuestion.setMedicalTreatmentOrAdvice(medicalTreatmentOrAdvice);
	}

	/**
	* Returns the infection or spread of disease of this temp health question.
	*
	* @return the infection or spread of disease of this temp health question
	*/
	@Override
	public int getInfectionOrSpreadOfDisease() {
		return _tempHealthQuestion.getInfectionOrSpreadOfDisease();
	}

	/**
	* Sets the infection or spread of disease of this temp health question.
	*
	* @param infectionOrSpreadOfDisease the infection or spread of disease of this temp health question
	*/
	@Override
	public void setInfectionOrSpreadOfDisease(int infectionOrSpreadOfDisease) {
		_tempHealthQuestion.setInfectionOrSpreadOfDisease(infectionOrSpreadOfDisease);
	}

	/**
	* Returns the infections report of this temp health question.
	*
	* @return the infections report of this temp health question
	*/
	@Override
	public java.lang.String getInfectionsReport() {
		return _tempHealthQuestion.getInfectionsReport();
	}

	/**
	* Sets the infections report of this temp health question.
	*
	* @param infectionsReport the infections report of this temp health question
	*/
	@Override
	public void setInfectionsReport(java.lang.String infectionsReport) {
		_tempHealthQuestion.setInfectionsReport(infectionsReport);
	}

	/**
	* Returns the is sanitary of this temp health question.
	*
	* @return the is sanitary of this temp health question
	*/
	@Override
	public int getIsSanitary() {
		return _tempHealthQuestion.getIsSanitary();
	}

	/**
	* Sets the is sanitary of this temp health question.
	*
	* @param isSanitary the is sanitary of this temp health question
	*/
	@Override
	public void setIsSanitary(int isSanitary) {
		_tempHealthQuestion.setIsSanitary(isSanitary);
	}

	/**
	* Returns the sanitary des of this temp health question.
	*
	* @return the sanitary des of this temp health question
	*/
	@Override
	public java.lang.String getSanitaryDes() {
		return _tempHealthQuestion.getSanitaryDes();
	}

	/**
	* Sets the sanitary des of this temp health question.
	*
	* @param sanitaryDes the sanitary des of this temp health question
	*/
	@Override
	public void setSanitaryDes(java.lang.String sanitaryDes) {
		_tempHealthQuestion.setSanitaryDes(sanitaryDes);
	}

	/**
	* Returns the is stowaways of this temp health question.
	*
	* @return the is stowaways of this temp health question
	*/
	@Override
	public int getIsStowaways() {
		return _tempHealthQuestion.getIsStowaways();
	}

	/**
	* Sets the is stowaways of this temp health question.
	*
	* @param isStowaways the is stowaways of this temp health question
	*/
	@Override
	public void setIsStowaways(int isStowaways) {
		_tempHealthQuestion.setIsStowaways(isStowaways);
	}

	/**
	* Returns the join ship of this temp health question.
	*
	* @return the join ship of this temp health question
	*/
	@Override
	public java.lang.String getJoinShip() {
		return _tempHealthQuestion.getJoinShip();
	}

	/**
	* Sets the join ship of this temp health question.
	*
	* @param joinShip the join ship of this temp health question
	*/
	@Override
	public void setJoinShip(java.lang.String joinShip) {
		_tempHealthQuestion.setJoinShip(joinShip);
	}

	/**
	* Returns the is animal of this temp health question.
	*
	* @return the is animal of this temp health question
	*/
	@Override
	public int getIsAnimal() {
		return _tempHealthQuestion.getIsAnimal();
	}

	/**
	* Sets the is animal of this temp health question.
	*
	* @param isAnimal the is animal of this temp health question
	*/
	@Override
	public void setIsAnimal(int isAnimal) {
		_tempHealthQuestion.setIsAnimal(isAnimal);
	}

	@Override
	public boolean isNew() {
		return _tempHealthQuestion.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tempHealthQuestion.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tempHealthQuestion.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tempHealthQuestion.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tempHealthQuestion.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tempHealthQuestion.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tempHealthQuestion.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tempHealthQuestion.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tempHealthQuestion.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tempHealthQuestion.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tempHealthQuestion.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TempHealthQuestionWrapper((TempHealthQuestion)_tempHealthQuestion.clone());
	}

	@Override
	public int compareTo(TempHealthQuestion tempHealthQuestion) {
		return _tempHealthQuestion.compareTo(tempHealthQuestion);
	}

	@Override
	public int hashCode() {
		return _tempHealthQuestion.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<TempHealthQuestion> toCacheModel() {
		return _tempHealthQuestion.toCacheModel();
	}

	@Override
	public TempHealthQuestion toEscapedModel() {
		return new TempHealthQuestionWrapper(_tempHealthQuestion.toEscapedModel());
	}

	@Override
	public TempHealthQuestion toUnescapedModel() {
		return new TempHealthQuestionWrapper(_tempHealthQuestion.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tempHealthQuestion.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tempHealthQuestion.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempHealthQuestion.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TempHealthQuestionWrapper)) {
			return false;
		}

		TempHealthQuestionWrapper tempHealthQuestionWrapper = (TempHealthQuestionWrapper)obj;

		if (Validator.equals(_tempHealthQuestion,
					tempHealthQuestionWrapper._tempHealthQuestion)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TempHealthQuestion getWrappedTempHealthQuestion() {
		return _tempHealthQuestion;
	}

	@Override
	public TempHealthQuestion getWrappedModel() {
		return _tempHealthQuestion;
	}

	@Override
	public void resetOriginalValues() {
		_tempHealthQuestion.resetOriginalValues();
	}

	private TempHealthQuestion _tempHealthQuestion;
}