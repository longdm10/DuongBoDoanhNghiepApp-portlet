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
 * This class is a wrapper for {@link TempDeclarationForAnimalQuarantine}.
 * </p>
 *
 * @author longdm
 * @see TempDeclarationForAnimalQuarantine
 * @generated
 */
public class TempDeclarationForAnimalQuarantineWrapper
	implements TempDeclarationForAnimalQuarantine,
		ModelWrapper<TempDeclarationForAnimalQuarantine> {
	public TempDeclarationForAnimalQuarantineWrapper(
		TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine) {
		_tempDeclarationForAnimalQuarantine = tempDeclarationForAnimalQuarantine;
	}

	@Override
	public Class<?> getModelClass() {
		return TempDeclarationForAnimalQuarantine.class;
	}

	@Override
	public String getModelClassName() {
		return TempDeclarationForAnimalQuarantine.class.getName();
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
	* Returns the primary key of this temp declaration for animal quarantine.
	*
	* @return the primary key of this temp declaration for animal quarantine
	*/
	@Override
	public long getPrimaryKey() {
		return _tempDeclarationForAnimalQuarantine.getPrimaryKey();
	}

	/**
	* Sets the primary key of this temp declaration for animal quarantine.
	*
	* @param primaryKey the primary key of this temp declaration for animal quarantine
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tempDeclarationForAnimalQuarantine.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this temp declaration for animal quarantine.
	*
	* @return the ID of this temp declaration for animal quarantine
	*/
	@Override
	public long getId() {
		return _tempDeclarationForAnimalQuarantine.getId();
	}

	/**
	* Sets the ID of this temp declaration for animal quarantine.
	*
	* @param id the ID of this temp declaration for animal quarantine
	*/
	@Override
	public void setId(long id) {
		_tempDeclarationForAnimalQuarantine.setId(id);
	}

	/**
	* Returns the request code of this temp declaration for animal quarantine.
	*
	* @return the request code of this temp declaration for animal quarantine
	*/
	@Override
	public java.lang.String getRequestCode() {
		return _tempDeclarationForAnimalQuarantine.getRequestCode();
	}

	/**
	* Sets the request code of this temp declaration for animal quarantine.
	*
	* @param requestCode the request code of this temp declaration for animal quarantine
	*/
	@Override
	public void setRequestCode(java.lang.String requestCode) {
		_tempDeclarationForAnimalQuarantine.setRequestCode(requestCode);
	}

	/**
	* Returns the request state of this temp declaration for animal quarantine.
	*
	* @return the request state of this temp declaration for animal quarantine
	*/
	@Override
	public int getRequestState() {
		return _tempDeclarationForAnimalQuarantine.getRequestState();
	}

	/**
	* Sets the request state of this temp declaration for animal quarantine.
	*
	* @param requestState the request state of this temp declaration for animal quarantine
	*/
	@Override
	public void setRequestState(int requestState) {
		_tempDeclarationForAnimalQuarantine.setRequestState(requestState);
	}

	/**
	* Returns the document name of this temp declaration for animal quarantine.
	*
	* @return the document name of this temp declaration for animal quarantine
	*/
	@Override
	public long getDocumentName() {
		return _tempDeclarationForAnimalQuarantine.getDocumentName();
	}

	/**
	* Sets the document name of this temp declaration for animal quarantine.
	*
	* @param documentName the document name of this temp declaration for animal quarantine
	*/
	@Override
	public void setDocumentName(long documentName) {
		_tempDeclarationForAnimalQuarantine.setDocumentName(documentName);
	}

	/**
	* Returns the document year of this temp declaration for animal quarantine.
	*
	* @return the document year of this temp declaration for animal quarantine
	*/
	@Override
	public int getDocumentYear() {
		return _tempDeclarationForAnimalQuarantine.getDocumentYear();
	}

	/**
	* Sets the document year of this temp declaration for animal quarantine.
	*
	* @param documentYear the document year of this temp declaration for animal quarantine
	*/
	@Override
	public void setDocumentYear(int documentYear) {
		_tempDeclarationForAnimalQuarantine.setDocumentYear(documentYear);
	}

	/**
	* Returns the user created of this temp declaration for animal quarantine.
	*
	* @return the user created of this temp declaration for animal quarantine
	*/
	@Override
	public java.lang.String getUserCreated() {
		return _tempDeclarationForAnimalQuarantine.getUserCreated();
	}

	/**
	* Sets the user created of this temp declaration for animal quarantine.
	*
	* @param userCreated the user created of this temp declaration for animal quarantine
	*/
	@Override
	public void setUserCreated(java.lang.String userCreated) {
		_tempDeclarationForAnimalQuarantine.setUserCreated(userCreated);
	}

	/**
	* Returns the name of ship of this temp declaration for animal quarantine.
	*
	* @return the name of ship of this temp declaration for animal quarantine
	*/
	@Override
	public java.lang.String getNameOfShip() {
		return _tempDeclarationForAnimalQuarantine.getNameOfShip();
	}

	/**
	* Sets the name of ship of this temp declaration for animal quarantine.
	*
	* @param nameOfShip the name of ship of this temp declaration for animal quarantine
	*/
	@Override
	public void setNameOfShip(java.lang.String nameOfShip) {
		_tempDeclarationForAnimalQuarantine.setNameOfShip(nameOfShip);
	}

	/**
	* Returns the flag state of ship of this temp declaration for animal quarantine.
	*
	* @return the flag state of ship of this temp declaration for animal quarantine
	*/
	@Override
	public java.lang.String getFlagStateOfShip() {
		return _tempDeclarationForAnimalQuarantine.getFlagStateOfShip();
	}

	/**
	* Sets the flag state of ship of this temp declaration for animal quarantine.
	*
	* @param flagStateOfShip the flag state of ship of this temp declaration for animal quarantine
	*/
	@Override
	public void setFlagStateOfShip(java.lang.String flagStateOfShip) {
		_tempDeclarationForAnimalQuarantine.setFlagStateOfShip(flagStateOfShip);
	}

	/**
	* Returns the number of crew of this temp declaration for animal quarantine.
	*
	* @return the number of crew of this temp declaration for animal quarantine
	*/
	@Override
	public int getNumberOfCrew() {
		return _tempDeclarationForAnimalQuarantine.getNumberOfCrew();
	}

	/**
	* Sets the number of crew of this temp declaration for animal quarantine.
	*
	* @param numberOfCrew the number of crew of this temp declaration for animal quarantine
	*/
	@Override
	public void setNumberOfCrew(int numberOfCrew) {
		_tempDeclarationForAnimalQuarantine.setNumberOfCrew(numberOfCrew);
	}

	/**
	* Returns the number of passengers of this temp declaration for animal quarantine.
	*
	* @return the number of passengers of this temp declaration for animal quarantine
	*/
	@Override
	public int getNumberOfPassengers() {
		return _tempDeclarationForAnimalQuarantine.getNumberOfPassengers();
	}

	/**
	* Sets the number of passengers of this temp declaration for animal quarantine.
	*
	* @param numberOfPassengers the number of passengers of this temp declaration for animal quarantine
	*/
	@Override
	public void setNumberOfPassengers(int numberOfPassengers) {
		_tempDeclarationForAnimalQuarantine.setNumberOfPassengers(numberOfPassengers);
	}

	/**
	* Returns the last port of call code of this temp declaration for animal quarantine.
	*
	* @return the last port of call code of this temp declaration for animal quarantine
	*/
	@Override
	public java.lang.String getLastPortOfCallCode() {
		return _tempDeclarationForAnimalQuarantine.getLastPortOfCallCode();
	}

	/**
	* Sets the last port of call code of this temp declaration for animal quarantine.
	*
	* @param lastPortOfCallCode the last port of call code of this temp declaration for animal quarantine
	*/
	@Override
	public void setLastPortOfCallCode(java.lang.String lastPortOfCallCode) {
		_tempDeclarationForAnimalQuarantine.setLastPortOfCallCode(lastPortOfCallCode);
	}

	/**
	* Returns the next port of call code of this temp declaration for animal quarantine.
	*
	* @return the next port of call code of this temp declaration for animal quarantine
	*/
	@Override
	public java.lang.String getNextPortOfCallCode() {
		return _tempDeclarationForAnimalQuarantine.getNextPortOfCallCode();
	}

	/**
	* Sets the next port of call code of this temp declaration for animal quarantine.
	*
	* @param nextPortOfCallCode the next port of call code of this temp declaration for animal quarantine
	*/
	@Override
	public void setNextPortOfCallCode(java.lang.String nextPortOfCallCode) {
		_tempDeclarationForAnimalQuarantine.setNextPortOfCallCode(nextPortOfCallCode);
	}

	/**
	* Returns the animal name first of this temp declaration for animal quarantine.
	*
	* @return the animal name first of this temp declaration for animal quarantine
	*/
	@Override
	public java.lang.String getAnimalNameFirst() {
		return _tempDeclarationForAnimalQuarantine.getAnimalNameFirst();
	}

	/**
	* Sets the animal name first of this temp declaration for animal quarantine.
	*
	* @param animalNameFirst the animal name first of this temp declaration for animal quarantine
	*/
	@Override
	public void setAnimalNameFirst(java.lang.String animalNameFirst) {
		_tempDeclarationForAnimalQuarantine.setAnimalNameFirst(animalNameFirst);
	}

	/**
	* Returns the animal name between of this temp declaration for animal quarantine.
	*
	* @return the animal name between of this temp declaration for animal quarantine
	*/
	@Override
	public java.lang.String getAnimalNameBetween() {
		return _tempDeclarationForAnimalQuarantine.getAnimalNameBetween();
	}

	/**
	* Sets the animal name between of this temp declaration for animal quarantine.
	*
	* @param animalNameBetween the animal name between of this temp declaration for animal quarantine
	*/
	@Override
	public void setAnimalNameBetween(java.lang.String animalNameBetween) {
		_tempDeclarationForAnimalQuarantine.setAnimalNameBetween(animalNameBetween);
	}

	/**
	* Returns the animal name this of this temp declaration for animal quarantine.
	*
	* @return the animal name this of this temp declaration for animal quarantine
	*/
	@Override
	public java.lang.String getAnimalNameThis() {
		return _tempDeclarationForAnimalQuarantine.getAnimalNameThis();
	}

	/**
	* Sets the animal name this of this temp declaration for animal quarantine.
	*
	* @param animalNameThis the animal name this of this temp declaration for animal quarantine
	*/
	@Override
	public void setAnimalNameThis(java.lang.String animalNameThis) {
		_tempDeclarationForAnimalQuarantine.setAnimalNameThis(animalNameThis);
	}

	/**
	* Returns the name of master of this temp declaration for animal quarantine.
	*
	* @return the name of master of this temp declaration for animal quarantine
	*/
	@Override
	public java.lang.String getNameOfMaster() {
		return _tempDeclarationForAnimalQuarantine.getNameOfMaster();
	}

	/**
	* Sets the name of master of this temp declaration for animal quarantine.
	*
	* @param nameOfMaster the name of master of this temp declaration for animal quarantine
	*/
	@Override
	public void setNameOfMaster(java.lang.String nameOfMaster) {
		_tempDeclarationForAnimalQuarantine.setNameOfMaster(nameOfMaster);
	}

	/**
	* Returns the sign place of this temp declaration for animal quarantine.
	*
	* @return the sign place of this temp declaration for animal quarantine
	*/
	@Override
	public java.lang.String getSignPlace() {
		return _tempDeclarationForAnimalQuarantine.getSignPlace();
	}

	/**
	* Sets the sign place of this temp declaration for animal quarantine.
	*
	* @param signPlace the sign place of this temp declaration for animal quarantine
	*/
	@Override
	public void setSignPlace(java.lang.String signPlace) {
		_tempDeclarationForAnimalQuarantine.setSignPlace(signPlace);
	}

	/**
	* Returns the sign date of this temp declaration for animal quarantine.
	*
	* @return the sign date of this temp declaration for animal quarantine
	*/
	@Override
	public java.util.Date getSignDate() {
		return _tempDeclarationForAnimalQuarantine.getSignDate();
	}

	/**
	* Sets the sign date of this temp declaration for animal quarantine.
	*
	* @param signDate the sign date of this temp declaration for animal quarantine
	*/
	@Override
	public void setSignDate(java.util.Date signDate) {
		_tempDeclarationForAnimalQuarantine.setSignDate(signDate);
	}

	/**
	* Returns the master signed of this temp declaration for animal quarantine.
	*
	* @return the master signed of this temp declaration for animal quarantine
	*/
	@Override
	public int getMasterSigned() {
		return _tempDeclarationForAnimalQuarantine.getMasterSigned();
	}

	/**
	* Sets the master signed of this temp declaration for animal quarantine.
	*
	* @param masterSigned the master signed of this temp declaration for animal quarantine
	*/
	@Override
	public void setMasterSigned(int masterSigned) {
		_tempDeclarationForAnimalQuarantine.setMasterSigned(masterSigned);
	}

	/**
	* Returns the master signed image of this temp declaration for animal quarantine.
	*
	* @return the master signed image of this temp declaration for animal quarantine
	*/
	@Override
	public int getMasterSignedImage() {
		return _tempDeclarationForAnimalQuarantine.getMasterSignedImage();
	}

	/**
	* Sets the master signed image of this temp declaration for animal quarantine.
	*
	* @param masterSignedImage the master signed image of this temp declaration for animal quarantine
	*/
	@Override
	public void setMasterSignedImage(int masterSignedImage) {
		_tempDeclarationForAnimalQuarantine.setMasterSignedImage(masterSignedImage);
	}

	/**
	* Returns the attached file of this temp declaration for animal quarantine.
	*
	* @return the attached file of this temp declaration for animal quarantine
	*/
	@Override
	public long getAttachedFile() {
		return _tempDeclarationForAnimalQuarantine.getAttachedFile();
	}

	/**
	* Sets the attached file of this temp declaration for animal quarantine.
	*
	* @param attachedFile the attached file of this temp declaration for animal quarantine
	*/
	@Override
	public void setAttachedFile(long attachedFile) {
		_tempDeclarationForAnimalQuarantine.setAttachedFile(attachedFile);
	}

	@Override
	public boolean isNew() {
		return _tempDeclarationForAnimalQuarantine.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tempDeclarationForAnimalQuarantine.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tempDeclarationForAnimalQuarantine.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tempDeclarationForAnimalQuarantine.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tempDeclarationForAnimalQuarantine.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tempDeclarationForAnimalQuarantine.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tempDeclarationForAnimalQuarantine.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tempDeclarationForAnimalQuarantine.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tempDeclarationForAnimalQuarantine.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tempDeclarationForAnimalQuarantine.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tempDeclarationForAnimalQuarantine.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TempDeclarationForAnimalQuarantineWrapper((TempDeclarationForAnimalQuarantine)_tempDeclarationForAnimalQuarantine.clone());
	}

	@Override
	public int compareTo(
		TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine) {
		return _tempDeclarationForAnimalQuarantine.compareTo(tempDeclarationForAnimalQuarantine);
	}

	@Override
	public int hashCode() {
		return _tempDeclarationForAnimalQuarantine.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<TempDeclarationForAnimalQuarantine> toCacheModel() {
		return _tempDeclarationForAnimalQuarantine.toCacheModel();
	}

	@Override
	public TempDeclarationForAnimalQuarantine toEscapedModel() {
		return new TempDeclarationForAnimalQuarantineWrapper(_tempDeclarationForAnimalQuarantine.toEscapedModel());
	}

	@Override
	public TempDeclarationForAnimalQuarantine toUnescapedModel() {
		return new TempDeclarationForAnimalQuarantineWrapper(_tempDeclarationForAnimalQuarantine.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tempDeclarationForAnimalQuarantine.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tempDeclarationForAnimalQuarantine.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempDeclarationForAnimalQuarantine.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TempDeclarationForAnimalQuarantineWrapper)) {
			return false;
		}

		TempDeclarationForAnimalQuarantineWrapper tempDeclarationForAnimalQuarantineWrapper =
			(TempDeclarationForAnimalQuarantineWrapper)obj;

		if (Validator.equals(_tempDeclarationForAnimalQuarantine,
					tempDeclarationForAnimalQuarantineWrapper._tempDeclarationForAnimalQuarantine)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TempDeclarationForAnimalQuarantine getWrappedTempDeclarationForAnimalQuarantine() {
		return _tempDeclarationForAnimalQuarantine;
	}

	@Override
	public TempDeclarationForAnimalQuarantine getWrappedModel() {
		return _tempDeclarationForAnimalQuarantine;
	}

	@Override
	public void resetOriginalValues() {
		_tempDeclarationForAnimalQuarantine.resetOriginalValues();
	}

	private TempDeclarationForAnimalQuarantine _tempDeclarationForAnimalQuarantine;
}