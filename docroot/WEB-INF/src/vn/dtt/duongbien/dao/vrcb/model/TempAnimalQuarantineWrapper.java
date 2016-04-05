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
 * This class is a wrapper for {@link TempAnimalQuarantine}.
 * </p>
 *
 * @author longdm
 * @see TempAnimalQuarantine
 * @generated
 */
public class TempAnimalQuarantineWrapper implements TempAnimalQuarantine,
	ModelWrapper<TempAnimalQuarantine> {
	public TempAnimalQuarantineWrapper(
		TempAnimalQuarantine tempAnimalQuarantine) {
		_tempAnimalQuarantine = tempAnimalQuarantine;
	}

	@Override
	public Class<?> getModelClass() {
		return TempAnimalQuarantine.class;
	}

	@Override
	public String getModelClassName() {
		return TempAnimalQuarantine.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("requestCode", getRequestCode());
		attributes.put("requestState", getRequestState());
		attributes.put("documentName", getDocumentName());
		attributes.put("documentYear", getDocumentYear());
		attributes.put("userCreated", getUserCreated());
		attributes.put("nameOfShip", getNameOfShip());
		attributes.put("flagStateOfShip", getFlagStateOfShip());
		attributes.put("numberOfCrew", getNumberOfCrew());
		attributes.put("numberOfPassengers", getNumberOfPassengers());
		attributes.put("lastPortOfCallCode", getLastPortOfCallCode());
		attributes.put("nextPortOfCallCode", getNextPortOfCallCode());
		attributes.put("animalNameFirst", getAnimalNameFirst());
		attributes.put("animalNameBetween", getAnimalNameBetween());
		attributes.put("animalNameThis", getAnimalNameThis());
		attributes.put("nameOfMaster", getNameOfMaster());
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

		Integer documentYear = (Integer)attributes.get("documentYear");

		if (documentYear != null) {
			setDocumentYear(documentYear);
		}

		String userCreated = (String)attributes.get("userCreated");

		if (userCreated != null) {
			setUserCreated(userCreated);
		}

		String nameOfShip = (String)attributes.get("nameOfShip");

		if (nameOfShip != null) {
			setNameOfShip(nameOfShip);
		}

		String flagStateOfShip = (String)attributes.get("flagStateOfShip");

		if (flagStateOfShip != null) {
			setFlagStateOfShip(flagStateOfShip);
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

		String animalNameFirst = (String)attributes.get("animalNameFirst");

		if (animalNameFirst != null) {
			setAnimalNameFirst(animalNameFirst);
		}

		String animalNameBetween = (String)attributes.get("animalNameBetween");

		if (animalNameBetween != null) {
			setAnimalNameBetween(animalNameBetween);
		}

		String animalNameThis = (String)attributes.get("animalNameThis");

		if (animalNameThis != null) {
			setAnimalNameThis(animalNameThis);
		}

		String nameOfMaster = (String)attributes.get("nameOfMaster");

		if (nameOfMaster != null) {
			setNameOfMaster(nameOfMaster);
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
	* Returns the primary key of this temp animal quarantine.
	*
	* @return the primary key of this temp animal quarantine
	*/
	@Override
	public long getPrimaryKey() {
		return _tempAnimalQuarantine.getPrimaryKey();
	}

	/**
	* Sets the primary key of this temp animal quarantine.
	*
	* @param primaryKey the primary key of this temp animal quarantine
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tempAnimalQuarantine.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this temp animal quarantine.
	*
	* @return the ID of this temp animal quarantine
	*/
	@Override
	public long getId() {
		return _tempAnimalQuarantine.getId();
	}

	/**
	* Sets the ID of this temp animal quarantine.
	*
	* @param id the ID of this temp animal quarantine
	*/
	@Override
	public void setId(long id) {
		_tempAnimalQuarantine.setId(id);
	}

	/**
	* Returns the request code of this temp animal quarantine.
	*
	* @return the request code of this temp animal quarantine
	*/
	@Override
	public java.lang.String getRequestCode() {
		return _tempAnimalQuarantine.getRequestCode();
	}

	/**
	* Sets the request code of this temp animal quarantine.
	*
	* @param requestCode the request code of this temp animal quarantine
	*/
	@Override
	public void setRequestCode(java.lang.String requestCode) {
		_tempAnimalQuarantine.setRequestCode(requestCode);
	}

	/**
	* Returns the request state of this temp animal quarantine.
	*
	* @return the request state of this temp animal quarantine
	*/
	@Override
	public int getRequestState() {
		return _tempAnimalQuarantine.getRequestState();
	}

	/**
	* Sets the request state of this temp animal quarantine.
	*
	* @param requestState the request state of this temp animal quarantine
	*/
	@Override
	public void setRequestState(int requestState) {
		_tempAnimalQuarantine.setRequestState(requestState);
	}

	/**
	* Returns the document name of this temp animal quarantine.
	*
	* @return the document name of this temp animal quarantine
	*/
	@Override
	public long getDocumentName() {
		return _tempAnimalQuarantine.getDocumentName();
	}

	/**
	* Sets the document name of this temp animal quarantine.
	*
	* @param documentName the document name of this temp animal quarantine
	*/
	@Override
	public void setDocumentName(long documentName) {
		_tempAnimalQuarantine.setDocumentName(documentName);
	}

	/**
	* Returns the document year of this temp animal quarantine.
	*
	* @return the document year of this temp animal quarantine
	*/
	@Override
	public int getDocumentYear() {
		return _tempAnimalQuarantine.getDocumentYear();
	}

	/**
	* Sets the document year of this temp animal quarantine.
	*
	* @param documentYear the document year of this temp animal quarantine
	*/
	@Override
	public void setDocumentYear(int documentYear) {
		_tempAnimalQuarantine.setDocumentYear(documentYear);
	}

	/**
	* Returns the user created of this temp animal quarantine.
	*
	* @return the user created of this temp animal quarantine
	*/
	@Override
	public java.lang.String getUserCreated() {
		return _tempAnimalQuarantine.getUserCreated();
	}

	/**
	* Sets the user created of this temp animal quarantine.
	*
	* @param userCreated the user created of this temp animal quarantine
	*/
	@Override
	public void setUserCreated(java.lang.String userCreated) {
		_tempAnimalQuarantine.setUserCreated(userCreated);
	}

	/**
	* Returns the name of ship of this temp animal quarantine.
	*
	* @return the name of ship of this temp animal quarantine
	*/
	@Override
	public java.lang.String getNameOfShip() {
		return _tempAnimalQuarantine.getNameOfShip();
	}

	/**
	* Sets the name of ship of this temp animal quarantine.
	*
	* @param nameOfShip the name of ship of this temp animal quarantine
	*/
	@Override
	public void setNameOfShip(java.lang.String nameOfShip) {
		_tempAnimalQuarantine.setNameOfShip(nameOfShip);
	}

	/**
	* Returns the flag state of ship of this temp animal quarantine.
	*
	* @return the flag state of ship of this temp animal quarantine
	*/
	@Override
	public java.lang.String getFlagStateOfShip() {
		return _tempAnimalQuarantine.getFlagStateOfShip();
	}

	/**
	* Sets the flag state of ship of this temp animal quarantine.
	*
	* @param flagStateOfShip the flag state of ship of this temp animal quarantine
	*/
	@Override
	public void setFlagStateOfShip(java.lang.String flagStateOfShip) {
		_tempAnimalQuarantine.setFlagStateOfShip(flagStateOfShip);
	}

	/**
	* Returns the number of crew of this temp animal quarantine.
	*
	* @return the number of crew of this temp animal quarantine
	*/
	@Override
	public int getNumberOfCrew() {
		return _tempAnimalQuarantine.getNumberOfCrew();
	}

	/**
	* Sets the number of crew of this temp animal quarantine.
	*
	* @param numberOfCrew the number of crew of this temp animal quarantine
	*/
	@Override
	public void setNumberOfCrew(int numberOfCrew) {
		_tempAnimalQuarantine.setNumberOfCrew(numberOfCrew);
	}

	/**
	* Returns the number of passengers of this temp animal quarantine.
	*
	* @return the number of passengers of this temp animal quarantine
	*/
	@Override
	public int getNumberOfPassengers() {
		return _tempAnimalQuarantine.getNumberOfPassengers();
	}

	/**
	* Sets the number of passengers of this temp animal quarantine.
	*
	* @param numberOfPassengers the number of passengers of this temp animal quarantine
	*/
	@Override
	public void setNumberOfPassengers(int numberOfPassengers) {
		_tempAnimalQuarantine.setNumberOfPassengers(numberOfPassengers);
	}

	/**
	* Returns the last port of call code of this temp animal quarantine.
	*
	* @return the last port of call code of this temp animal quarantine
	*/
	@Override
	public java.lang.String getLastPortOfCallCode() {
		return _tempAnimalQuarantine.getLastPortOfCallCode();
	}

	/**
	* Sets the last port of call code of this temp animal quarantine.
	*
	* @param lastPortOfCallCode the last port of call code of this temp animal quarantine
	*/
	@Override
	public void setLastPortOfCallCode(java.lang.String lastPortOfCallCode) {
		_tempAnimalQuarantine.setLastPortOfCallCode(lastPortOfCallCode);
	}

	/**
	* Returns the next port of call code of this temp animal quarantine.
	*
	* @return the next port of call code of this temp animal quarantine
	*/
	@Override
	public java.lang.String getNextPortOfCallCode() {
		return _tempAnimalQuarantine.getNextPortOfCallCode();
	}

	/**
	* Sets the next port of call code of this temp animal quarantine.
	*
	* @param nextPortOfCallCode the next port of call code of this temp animal quarantine
	*/
	@Override
	public void setNextPortOfCallCode(java.lang.String nextPortOfCallCode) {
		_tempAnimalQuarantine.setNextPortOfCallCode(nextPortOfCallCode);
	}

	/**
	* Returns the animal name first of this temp animal quarantine.
	*
	* @return the animal name first of this temp animal quarantine
	*/
	@Override
	public java.lang.String getAnimalNameFirst() {
		return _tempAnimalQuarantine.getAnimalNameFirst();
	}

	/**
	* Sets the animal name first of this temp animal quarantine.
	*
	* @param animalNameFirst the animal name first of this temp animal quarantine
	*/
	@Override
	public void setAnimalNameFirst(java.lang.String animalNameFirst) {
		_tempAnimalQuarantine.setAnimalNameFirst(animalNameFirst);
	}

	/**
	* Returns the animal name between of this temp animal quarantine.
	*
	* @return the animal name between of this temp animal quarantine
	*/
	@Override
	public java.lang.String getAnimalNameBetween() {
		return _tempAnimalQuarantine.getAnimalNameBetween();
	}

	/**
	* Sets the animal name between of this temp animal quarantine.
	*
	* @param animalNameBetween the animal name between of this temp animal quarantine
	*/
	@Override
	public void setAnimalNameBetween(java.lang.String animalNameBetween) {
		_tempAnimalQuarantine.setAnimalNameBetween(animalNameBetween);
	}

	/**
	* Returns the animal name this of this temp animal quarantine.
	*
	* @return the animal name this of this temp animal quarantine
	*/
	@Override
	public java.lang.String getAnimalNameThis() {
		return _tempAnimalQuarantine.getAnimalNameThis();
	}

	/**
	* Sets the animal name this of this temp animal quarantine.
	*
	* @param animalNameThis the animal name this of this temp animal quarantine
	*/
	@Override
	public void setAnimalNameThis(java.lang.String animalNameThis) {
		_tempAnimalQuarantine.setAnimalNameThis(animalNameThis);
	}

	/**
	* Returns the name of master of this temp animal quarantine.
	*
	* @return the name of master of this temp animal quarantine
	*/
	@Override
	public java.lang.String getNameOfMaster() {
		return _tempAnimalQuarantine.getNameOfMaster();
	}

	/**
	* Sets the name of master of this temp animal quarantine.
	*
	* @param nameOfMaster the name of master of this temp animal quarantine
	*/
	@Override
	public void setNameOfMaster(java.lang.String nameOfMaster) {
		_tempAnimalQuarantine.setNameOfMaster(nameOfMaster);
	}

	/**
	* Returns the sign place of this temp animal quarantine.
	*
	* @return the sign place of this temp animal quarantine
	*/
	@Override
	public java.lang.String getSignPlace() {
		return _tempAnimalQuarantine.getSignPlace();
	}

	/**
	* Sets the sign place of this temp animal quarantine.
	*
	* @param signPlace the sign place of this temp animal quarantine
	*/
	@Override
	public void setSignPlace(java.lang.String signPlace) {
		_tempAnimalQuarantine.setSignPlace(signPlace);
	}

	/**
	* Returns the sign date of this temp animal quarantine.
	*
	* @return the sign date of this temp animal quarantine
	*/
	@Override
	public java.util.Date getSignDate() {
		return _tempAnimalQuarantine.getSignDate();
	}

	/**
	* Sets the sign date of this temp animal quarantine.
	*
	* @param signDate the sign date of this temp animal quarantine
	*/
	@Override
	public void setSignDate(java.util.Date signDate) {
		_tempAnimalQuarantine.setSignDate(signDate);
	}

	/**
	* Returns the master signed of this temp animal quarantine.
	*
	* @return the master signed of this temp animal quarantine
	*/
	@Override
	public int getMasterSigned() {
		return _tempAnimalQuarantine.getMasterSigned();
	}

	/**
	* Sets the master signed of this temp animal quarantine.
	*
	* @param masterSigned the master signed of this temp animal quarantine
	*/
	@Override
	public void setMasterSigned(int masterSigned) {
		_tempAnimalQuarantine.setMasterSigned(masterSigned);
	}

	/**
	* Returns the master signed image of this temp animal quarantine.
	*
	* @return the master signed image of this temp animal quarantine
	*/
	@Override
	public int getMasterSignedImage() {
		return _tempAnimalQuarantine.getMasterSignedImage();
	}

	/**
	* Sets the master signed image of this temp animal quarantine.
	*
	* @param masterSignedImage the master signed image of this temp animal quarantine
	*/
	@Override
	public void setMasterSignedImage(int masterSignedImage) {
		_tempAnimalQuarantine.setMasterSignedImage(masterSignedImage);
	}

	/**
	* Returns the attached file of this temp animal quarantine.
	*
	* @return the attached file of this temp animal quarantine
	*/
	@Override
	public long getAttachedFile() {
		return _tempAnimalQuarantine.getAttachedFile();
	}

	/**
	* Sets the attached file of this temp animal quarantine.
	*
	* @param attachedFile the attached file of this temp animal quarantine
	*/
	@Override
	public void setAttachedFile(long attachedFile) {
		_tempAnimalQuarantine.setAttachedFile(attachedFile);
	}

	@Override
	public boolean isNew() {
		return _tempAnimalQuarantine.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tempAnimalQuarantine.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tempAnimalQuarantine.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tempAnimalQuarantine.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tempAnimalQuarantine.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tempAnimalQuarantine.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tempAnimalQuarantine.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tempAnimalQuarantine.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tempAnimalQuarantine.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tempAnimalQuarantine.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tempAnimalQuarantine.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TempAnimalQuarantineWrapper((TempAnimalQuarantine)_tempAnimalQuarantine.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.TempAnimalQuarantine tempAnimalQuarantine) {
		return _tempAnimalQuarantine.compareTo(tempAnimalQuarantine);
	}

	@Override
	public int hashCode() {
		return _tempAnimalQuarantine.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.TempAnimalQuarantine> toCacheModel() {
		return _tempAnimalQuarantine.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempAnimalQuarantine toEscapedModel() {
		return new TempAnimalQuarantineWrapper(_tempAnimalQuarantine.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempAnimalQuarantine toUnescapedModel() {
		return new TempAnimalQuarantineWrapper(_tempAnimalQuarantine.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tempAnimalQuarantine.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tempAnimalQuarantine.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempAnimalQuarantine.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TempAnimalQuarantineWrapper)) {
			return false;
		}

		TempAnimalQuarantineWrapper tempAnimalQuarantineWrapper = (TempAnimalQuarantineWrapper)obj;

		if (Validator.equals(_tempAnimalQuarantine,
					tempAnimalQuarantineWrapper._tempAnimalQuarantine)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TempAnimalQuarantine getWrappedTempAnimalQuarantine() {
		return _tempAnimalQuarantine;
	}

	@Override
	public TempAnimalQuarantine getWrappedModel() {
		return _tempAnimalQuarantine;
	}

	@Override
	public void resetOriginalValues() {
		_tempAnimalQuarantine.resetOriginalValues();
	}

	private TempAnimalQuarantine _tempAnimalQuarantine;
}