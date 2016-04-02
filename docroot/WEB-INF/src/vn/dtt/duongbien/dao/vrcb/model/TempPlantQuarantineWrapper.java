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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TempPlantQuarantine}.
 * </p>
 *
 * @author longdm
 * @see TempPlantQuarantine
 * @generated
 */
public class TempPlantQuarantineWrapper implements TempPlantQuarantine,
	ModelWrapper<TempPlantQuarantine> {
	public TempPlantQuarantineWrapper(TempPlantQuarantine tempPlantQuarantine) {
		_tempPlantQuarantine = tempPlantQuarantine;
	}

	@Override
	public Class<?> getModelClass() {
		return TempPlantQuarantine.class;
	}

	@Override
	public String getModelClassName() {
		return TempPlantQuarantine.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("requestCode", getRequestCode());
		attributes.put("requestState", getRequestState());
		attributes.put("documentName", getDocumentName());
		attributes.put("userCreated", getUserCreated());
		attributes.put("documentYear", getDocumentYear());
		attributes.put("nameOfShip", getNameOfShip());
		attributes.put("flagStateOfShip", getFlagStateOfShip());
		attributes.put("nameOfMaster", getNameOfMaster());
		attributes.put("doctorName", getDoctorName());
		attributes.put("numberOfCrew", getNumberOfCrew());
		attributes.put("numberOfPassengers", getNumberOfPassengers());
		attributes.put("lastPortOfCallCode", getLastPortOfCallCode());
		attributes.put("nextPortOfCallCode", getNextPortOfCallCode());
		attributes.put("firstPortOfLoadingCode", getFirstPortOfLoadingCode());
		attributes.put("dateOfdeparture", getDateOfdeparture());
		attributes.put("plantNameFirst", getPlantNameFirst());
		attributes.put("plantNameBetween", getPlantNameBetween());
		attributes.put("plantNameThis", getPlantNameThis());
		attributes.put("signPlace", getSignPlace());
		attributes.put("signDate", getSignDate());
		attributes.put("masterSigned", getMasterSigned());
		attributes.put("masterSignedImage", getMasterSignedImage());
		attributes.put("attachedFile", getAttachedFile());

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

		Integer requestState = (Integer)attributes.get("requestState");

		if (requestState != null) {
			setRequestState(requestState);
		}

		Long documentName = (Long)attributes.get("documentName");

		if (documentName != null) {
			setDocumentName(documentName);
		}

		String userCreated = (String)attributes.get("userCreated");

		if (userCreated != null) {
			setUserCreated(userCreated);
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

		String nameOfMaster = (String)attributes.get("nameOfMaster");

		if (nameOfMaster != null) {
			setNameOfMaster(nameOfMaster);
		}

		String doctorName = (String)attributes.get("doctorName");

		if (doctorName != null) {
			setDoctorName(doctorName);
		}

		Integer numberOfCrew = (Integer)attributes.get("numberOfCrew");

		if (numberOfCrew != null) {
			setNumberOfCrew(numberOfCrew);
		}

		Integer numberOfPassengers = (Integer)attributes.get(
				"numberOfPassengers");

		if (numberOfPassengers != null) {
			setNumberOfPassengers(numberOfPassengers);
		}

		String lastPortOfCallCode = (String)attributes.get("lastPortOfCallCode");

		if (lastPortOfCallCode != null) {
			setLastPortOfCallCode(lastPortOfCallCode);
		}

		String nextPortOfCallCode = (String)attributes.get("nextPortOfCallCode");

		if (nextPortOfCallCode != null) {
			setNextPortOfCallCode(nextPortOfCallCode);
		}

		String firstPortOfLoadingCode = (String)attributes.get(
				"firstPortOfLoadingCode");

		if (firstPortOfLoadingCode != null) {
			setFirstPortOfLoadingCode(firstPortOfLoadingCode);
		}

		Date dateOfdeparture = (Date)attributes.get("dateOfdeparture");

		if (dateOfdeparture != null) {
			setDateOfdeparture(dateOfdeparture);
		}

		String plantNameFirst = (String)attributes.get("plantNameFirst");

		if (plantNameFirst != null) {
			setPlantNameFirst(plantNameFirst);
		}

		String plantNameBetween = (String)attributes.get("plantNameBetween");

		if (plantNameBetween != null) {
			setPlantNameBetween(plantNameBetween);
		}

		String plantNameThis = (String)attributes.get("plantNameThis");

		if (plantNameThis != null) {
			setPlantNameThis(plantNameThis);
		}

		String signPlace = (String)attributes.get("signPlace");

		if (signPlace != null) {
			setSignPlace(signPlace);
		}

		Date signDate = (Date)attributes.get("signDate");

		if (signDate != null) {
			setSignDate(signDate);
		}

		Integer masterSigned = (Integer)attributes.get("masterSigned");

		if (masterSigned != null) {
			setMasterSigned(masterSigned);
		}

		Integer masterSignedImage = (Integer)attributes.get("masterSignedImage");

		if (masterSignedImage != null) {
			setMasterSignedImage(masterSignedImage);
		}

		Long attachedFile = (Long)attributes.get("attachedFile");

		if (attachedFile != null) {
			setAttachedFile(attachedFile);
		}
	}

	/**
	* Returns the primary key of this temp plant quarantine.
	*
	* @return the primary key of this temp plant quarantine
	*/
	@Override
	public long getPrimaryKey() {
		return _tempPlantQuarantine.getPrimaryKey();
	}

	/**
	* Sets the primary key of this temp plant quarantine.
	*
	* @param primaryKey the primary key of this temp plant quarantine
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tempPlantQuarantine.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this temp plant quarantine.
	*
	* @return the ID of this temp plant quarantine
	*/
	@Override
	public long getId() {
		return _tempPlantQuarantine.getId();
	}

	/**
	* Sets the ID of this temp plant quarantine.
	*
	* @param id the ID of this temp plant quarantine
	*/
	@Override
	public void setId(long id) {
		_tempPlantQuarantine.setId(id);
	}

	/**
	* Returns the request code of this temp plant quarantine.
	*
	* @return the request code of this temp plant quarantine
	*/
	@Override
	public java.lang.String getRequestCode() {
		return _tempPlantQuarantine.getRequestCode();
	}

	/**
	* Sets the request code of this temp plant quarantine.
	*
	* @param requestCode the request code of this temp plant quarantine
	*/
	@Override
	public void setRequestCode(java.lang.String requestCode) {
		_tempPlantQuarantine.setRequestCode(requestCode);
	}

	/**
	* Returns the request state of this temp plant quarantine.
	*
	* @return the request state of this temp plant quarantine
	*/
	@Override
	public int getRequestState() {
		return _tempPlantQuarantine.getRequestState();
	}

	/**
	* Sets the request state of this temp plant quarantine.
	*
	* @param requestState the request state of this temp plant quarantine
	*/
	@Override
	public void setRequestState(int requestState) {
		_tempPlantQuarantine.setRequestState(requestState);
	}

	/**
	* Returns the document name of this temp plant quarantine.
	*
	* @return the document name of this temp plant quarantine
	*/
	@Override
	public long getDocumentName() {
		return _tempPlantQuarantine.getDocumentName();
	}

	/**
	* Sets the document name of this temp plant quarantine.
	*
	* @param documentName the document name of this temp plant quarantine
	*/
	@Override
	public void setDocumentName(long documentName) {
		_tempPlantQuarantine.setDocumentName(documentName);
	}

	/**
	* Returns the user created of this temp plant quarantine.
	*
	* @return the user created of this temp plant quarantine
	*/
	@Override
	public java.lang.String getUserCreated() {
		return _tempPlantQuarantine.getUserCreated();
	}

	/**
	* Sets the user created of this temp plant quarantine.
	*
	* @param userCreated the user created of this temp plant quarantine
	*/
	@Override
	public void setUserCreated(java.lang.String userCreated) {
		_tempPlantQuarantine.setUserCreated(userCreated);
	}

	/**
	* Returns the document year of this temp plant quarantine.
	*
	* @return the document year of this temp plant quarantine
	*/
	@Override
	public int getDocumentYear() {
		return _tempPlantQuarantine.getDocumentYear();
	}

	/**
	* Sets the document year of this temp plant quarantine.
	*
	* @param documentYear the document year of this temp plant quarantine
	*/
	@Override
	public void setDocumentYear(int documentYear) {
		_tempPlantQuarantine.setDocumentYear(documentYear);
	}

	/**
	* Returns the name of ship of this temp plant quarantine.
	*
	* @return the name of ship of this temp plant quarantine
	*/
	@Override
	public java.lang.String getNameOfShip() {
		return _tempPlantQuarantine.getNameOfShip();
	}

	/**
	* Sets the name of ship of this temp plant quarantine.
	*
	* @param nameOfShip the name of ship of this temp plant quarantine
	*/
	@Override
	public void setNameOfShip(java.lang.String nameOfShip) {
		_tempPlantQuarantine.setNameOfShip(nameOfShip);
	}

	/**
	* Returns the flag state of ship of this temp plant quarantine.
	*
	* @return the flag state of ship of this temp plant quarantine
	*/
	@Override
	public java.lang.String getFlagStateOfShip() {
		return _tempPlantQuarantine.getFlagStateOfShip();
	}

	/**
	* Sets the flag state of ship of this temp plant quarantine.
	*
	* @param flagStateOfShip the flag state of ship of this temp plant quarantine
	*/
	@Override
	public void setFlagStateOfShip(java.lang.String flagStateOfShip) {
		_tempPlantQuarantine.setFlagStateOfShip(flagStateOfShip);
	}

	/**
	* Returns the name of master of this temp plant quarantine.
	*
	* @return the name of master of this temp plant quarantine
	*/
	@Override
	public java.lang.String getNameOfMaster() {
		return _tempPlantQuarantine.getNameOfMaster();
	}

	/**
	* Sets the name of master of this temp plant quarantine.
	*
	* @param nameOfMaster the name of master of this temp plant quarantine
	*/
	@Override
	public void setNameOfMaster(java.lang.String nameOfMaster) {
		_tempPlantQuarantine.setNameOfMaster(nameOfMaster);
	}

	/**
	* Returns the doctor name of this temp plant quarantine.
	*
	* @return the doctor name of this temp plant quarantine
	*/
	@Override
	public java.lang.String getDoctorName() {
		return _tempPlantQuarantine.getDoctorName();
	}

	/**
	* Sets the doctor name of this temp plant quarantine.
	*
	* @param doctorName the doctor name of this temp plant quarantine
	*/
	@Override
	public void setDoctorName(java.lang.String doctorName) {
		_tempPlantQuarantine.setDoctorName(doctorName);
	}

	/**
	* Returns the number of crew of this temp plant quarantine.
	*
	* @return the number of crew of this temp plant quarantine
	*/
	@Override
	public int getNumberOfCrew() {
		return _tempPlantQuarantine.getNumberOfCrew();
	}

	/**
	* Sets the number of crew of this temp plant quarantine.
	*
	* @param numberOfCrew the number of crew of this temp plant quarantine
	*/
	@Override
	public void setNumberOfCrew(int numberOfCrew) {
		_tempPlantQuarantine.setNumberOfCrew(numberOfCrew);
	}

	/**
	* Returns the number of passengers of this temp plant quarantine.
	*
	* @return the number of passengers of this temp plant quarantine
	*/
	@Override
	public int getNumberOfPassengers() {
		return _tempPlantQuarantine.getNumberOfPassengers();
	}

	/**
	* Sets the number of passengers of this temp plant quarantine.
	*
	* @param numberOfPassengers the number of passengers of this temp plant quarantine
	*/
	@Override
	public void setNumberOfPassengers(int numberOfPassengers) {
		_tempPlantQuarantine.setNumberOfPassengers(numberOfPassengers);
	}

	/**
	* Returns the last port of call code of this temp plant quarantine.
	*
	* @return the last port of call code of this temp plant quarantine
	*/
	@Override
	public java.lang.String getLastPortOfCallCode() {
		return _tempPlantQuarantine.getLastPortOfCallCode();
	}

	/**
	* Sets the last port of call code of this temp plant quarantine.
	*
	* @param lastPortOfCallCode the last port of call code of this temp plant quarantine
	*/
	@Override
	public void setLastPortOfCallCode(java.lang.String lastPortOfCallCode) {
		_tempPlantQuarantine.setLastPortOfCallCode(lastPortOfCallCode);
	}

	/**
	* Returns the next port of call code of this temp plant quarantine.
	*
	* @return the next port of call code of this temp plant quarantine
	*/
	@Override
	public java.lang.String getNextPortOfCallCode() {
		return _tempPlantQuarantine.getNextPortOfCallCode();
	}

	/**
	* Sets the next port of call code of this temp plant quarantine.
	*
	* @param nextPortOfCallCode the next port of call code of this temp plant quarantine
	*/
	@Override
	public void setNextPortOfCallCode(java.lang.String nextPortOfCallCode) {
		_tempPlantQuarantine.setNextPortOfCallCode(nextPortOfCallCode);
	}

	/**
	* Returns the first port of loading code of this temp plant quarantine.
	*
	* @return the first port of loading code of this temp plant quarantine
	*/
	@Override
	public java.lang.String getFirstPortOfLoadingCode() {
		return _tempPlantQuarantine.getFirstPortOfLoadingCode();
	}

	/**
	* Sets the first port of loading code of this temp plant quarantine.
	*
	* @param firstPortOfLoadingCode the first port of loading code of this temp plant quarantine
	*/
	@Override
	public void setFirstPortOfLoadingCode(
		java.lang.String firstPortOfLoadingCode) {
		_tempPlantQuarantine.setFirstPortOfLoadingCode(firstPortOfLoadingCode);
	}

	/**
	* Returns the date ofdeparture of this temp plant quarantine.
	*
	* @return the date ofdeparture of this temp plant quarantine
	*/
	@Override
	public java.util.Date getDateOfdeparture() {
		return _tempPlantQuarantine.getDateOfdeparture();
	}

	/**
	* Sets the date ofdeparture of this temp plant quarantine.
	*
	* @param dateOfdeparture the date ofdeparture of this temp plant quarantine
	*/
	@Override
	public void setDateOfdeparture(java.util.Date dateOfdeparture) {
		_tempPlantQuarantine.setDateOfdeparture(dateOfdeparture);
	}

	/**
	* Returns the plant name first of this temp plant quarantine.
	*
	* @return the plant name first of this temp plant quarantine
	*/
	@Override
	public java.lang.String getPlantNameFirst() {
		return _tempPlantQuarantine.getPlantNameFirst();
	}

	/**
	* Sets the plant name first of this temp plant quarantine.
	*
	* @param plantNameFirst the plant name first of this temp plant quarantine
	*/
	@Override
	public void setPlantNameFirst(java.lang.String plantNameFirst) {
		_tempPlantQuarantine.setPlantNameFirst(plantNameFirst);
	}

	/**
	* Returns the plant name between of this temp plant quarantine.
	*
	* @return the plant name between of this temp plant quarantine
	*/
	@Override
	public java.lang.String getPlantNameBetween() {
		return _tempPlantQuarantine.getPlantNameBetween();
	}

	/**
	* Sets the plant name between of this temp plant quarantine.
	*
	* @param plantNameBetween the plant name between of this temp plant quarantine
	*/
	@Override
	public void setPlantNameBetween(java.lang.String plantNameBetween) {
		_tempPlantQuarantine.setPlantNameBetween(plantNameBetween);
	}

	/**
	* Returns the plant name this of this temp plant quarantine.
	*
	* @return the plant name this of this temp plant quarantine
	*/
	@Override
	public java.lang.String getPlantNameThis() {
		return _tempPlantQuarantine.getPlantNameThis();
	}

	/**
	* Sets the plant name this of this temp plant quarantine.
	*
	* @param plantNameThis the plant name this of this temp plant quarantine
	*/
	@Override
	public void setPlantNameThis(java.lang.String plantNameThis) {
		_tempPlantQuarantine.setPlantNameThis(plantNameThis);
	}

	/**
	* Returns the sign place of this temp plant quarantine.
	*
	* @return the sign place of this temp plant quarantine
	*/
	@Override
	public java.lang.String getSignPlace() {
		return _tempPlantQuarantine.getSignPlace();
	}

	/**
	* Sets the sign place of this temp plant quarantine.
	*
	* @param signPlace the sign place of this temp plant quarantine
	*/
	@Override
	public void setSignPlace(java.lang.String signPlace) {
		_tempPlantQuarantine.setSignPlace(signPlace);
	}

	/**
	* Returns the sign date of this temp plant quarantine.
	*
	* @return the sign date of this temp plant quarantine
	*/
	@Override
	public java.util.Date getSignDate() {
		return _tempPlantQuarantine.getSignDate();
	}

	/**
	* Sets the sign date of this temp plant quarantine.
	*
	* @param signDate the sign date of this temp plant quarantine
	*/
	@Override
	public void setSignDate(java.util.Date signDate) {
		_tempPlantQuarantine.setSignDate(signDate);
	}

	/**
	* Returns the master signed of this temp plant quarantine.
	*
	* @return the master signed of this temp plant quarantine
	*/
	@Override
	public int getMasterSigned() {
		return _tempPlantQuarantine.getMasterSigned();
	}

	/**
	* Sets the master signed of this temp plant quarantine.
	*
	* @param masterSigned the master signed of this temp plant quarantine
	*/
	@Override
	public void setMasterSigned(int masterSigned) {
		_tempPlantQuarantine.setMasterSigned(masterSigned);
	}

	/**
	* Returns the master signed image of this temp plant quarantine.
	*
	* @return the master signed image of this temp plant quarantine
	*/
	@Override
	public int getMasterSignedImage() {
		return _tempPlantQuarantine.getMasterSignedImage();
	}

	/**
	* Sets the master signed image of this temp plant quarantine.
	*
	* @param masterSignedImage the master signed image of this temp plant quarantine
	*/
	@Override
	public void setMasterSignedImage(int masterSignedImage) {
		_tempPlantQuarantine.setMasterSignedImage(masterSignedImage);
	}

	/**
	* Returns the attached file of this temp plant quarantine.
	*
	* @return the attached file of this temp plant quarantine
	*/
	@Override
	public long getAttachedFile() {
		return _tempPlantQuarantine.getAttachedFile();
	}

	/**
	* Sets the attached file of this temp plant quarantine.
	*
	* @param attachedFile the attached file of this temp plant quarantine
	*/
	@Override
	public void setAttachedFile(long attachedFile) {
		_tempPlantQuarantine.setAttachedFile(attachedFile);
	}

	@Override
	public boolean isNew() {
		return _tempPlantQuarantine.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tempPlantQuarantine.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tempPlantQuarantine.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tempPlantQuarantine.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tempPlantQuarantine.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tempPlantQuarantine.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tempPlantQuarantine.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tempPlantQuarantine.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tempPlantQuarantine.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tempPlantQuarantine.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tempPlantQuarantine.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TempPlantQuarantineWrapper((TempPlantQuarantine)_tempPlantQuarantine.clone());
	}

	@Override
	public int compareTo(TempPlantQuarantine tempPlantQuarantine) {
		return _tempPlantQuarantine.compareTo(tempPlantQuarantine);
	}

	@Override
	public int hashCode() {
		return _tempPlantQuarantine.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<TempPlantQuarantine> toCacheModel() {
		return _tempPlantQuarantine.toCacheModel();
	}

	@Override
	public TempPlantQuarantine toEscapedModel() {
		return new TempPlantQuarantineWrapper(_tempPlantQuarantine.toEscapedModel());
	}

	@Override
	public TempPlantQuarantine toUnescapedModel() {
		return new TempPlantQuarantineWrapper(_tempPlantQuarantine.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tempPlantQuarantine.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tempPlantQuarantine.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempPlantQuarantine.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TempPlantQuarantineWrapper)) {
			return false;
		}

		TempPlantQuarantineWrapper tempPlantQuarantineWrapper = (TempPlantQuarantineWrapper)obj;

		if (Validator.equals(_tempPlantQuarantine,
					tempPlantQuarantineWrapper._tempPlantQuarantine)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TempPlantQuarantine getWrappedTempPlantQuarantine() {
		return _tempPlantQuarantine;
	}

	@Override
	public TempPlantQuarantine getWrappedModel() {
		return _tempPlantQuarantine;
	}

	@Override
	public void resetOriginalValues() {
		_tempPlantQuarantine.resetOriginalValues();
	}

	private TempPlantQuarantine _tempPlantQuarantine;
}