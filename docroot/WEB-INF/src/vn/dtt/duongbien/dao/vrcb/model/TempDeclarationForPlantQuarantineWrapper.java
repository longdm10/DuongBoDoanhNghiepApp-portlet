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
 * This class is a wrapper for {@link TempDeclarationForPlantQuarantine}.
 * </p>
 *
 * @author longdm
 * @see TempDeclarationForPlantQuarantine
 * @generated
 */
public class TempDeclarationForPlantQuarantineWrapper
	implements TempDeclarationForPlantQuarantine,
		ModelWrapper<TempDeclarationForPlantQuarantine> {
	public TempDeclarationForPlantQuarantineWrapper(
		TempDeclarationForPlantQuarantine tempDeclarationForPlantQuarantine) {
		_tempDeclarationForPlantQuarantine = tempDeclarationForPlantQuarantine;
	}

	@Override
	public Class<?> getModelClass() {
		return TempDeclarationForPlantQuarantine.class;
	}

	@Override
	public String getModelClassName() {
		return TempDeclarationForPlantQuarantine.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("requestCode", getRequestCode());
		attributes.put("requestState", getRequestState());
		attributes.put("documentName", getDocumentName());
		attributes.put("userCreated", getUserCreated());
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
		attributes.put("documentYear", getDocumentYear());

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

		Integer documentYear = (Integer)attributes.get("documentYear");

		if (documentYear != null) {
			setDocumentYear(documentYear);
		}
	}

	/**
	* Returns the primary key of this temp declaration for plant quarantine.
	*
	* @return the primary key of this temp declaration for plant quarantine
	*/
	@Override
	public long getPrimaryKey() {
		return _tempDeclarationForPlantQuarantine.getPrimaryKey();
	}

	/**
	* Sets the primary key of this temp declaration for plant quarantine.
	*
	* @param primaryKey the primary key of this temp declaration for plant quarantine
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tempDeclarationForPlantQuarantine.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this temp declaration for plant quarantine.
	*
	* @return the ID of this temp declaration for plant quarantine
	*/
	@Override
	public long getId() {
		return _tempDeclarationForPlantQuarantine.getId();
	}

	/**
	* Sets the ID of this temp declaration for plant quarantine.
	*
	* @param id the ID of this temp declaration for plant quarantine
	*/
	@Override
	public void setId(long id) {
		_tempDeclarationForPlantQuarantine.setId(id);
	}

	/**
	* Returns the request code of this temp declaration for plant quarantine.
	*
	* @return the request code of this temp declaration for plant quarantine
	*/
	@Override
	public java.lang.String getRequestCode() {
		return _tempDeclarationForPlantQuarantine.getRequestCode();
	}

	/**
	* Sets the request code of this temp declaration for plant quarantine.
	*
	* @param requestCode the request code of this temp declaration for plant quarantine
	*/
	@Override
	public void setRequestCode(java.lang.String requestCode) {
		_tempDeclarationForPlantQuarantine.setRequestCode(requestCode);
	}

	/**
	* Returns the request state of this temp declaration for plant quarantine.
	*
	* @return the request state of this temp declaration for plant quarantine
	*/
	@Override
	public int getRequestState() {
		return _tempDeclarationForPlantQuarantine.getRequestState();
	}

	/**
	* Sets the request state of this temp declaration for plant quarantine.
	*
	* @param requestState the request state of this temp declaration for plant quarantine
	*/
	@Override
	public void setRequestState(int requestState) {
		_tempDeclarationForPlantQuarantine.setRequestState(requestState);
	}

	/**
	* Returns the document name of this temp declaration for plant quarantine.
	*
	* @return the document name of this temp declaration for plant quarantine
	*/
	@Override
	public long getDocumentName() {
		return _tempDeclarationForPlantQuarantine.getDocumentName();
	}

	/**
	* Sets the document name of this temp declaration for plant quarantine.
	*
	* @param documentName the document name of this temp declaration for plant quarantine
	*/
	@Override
	public void setDocumentName(long documentName) {
		_tempDeclarationForPlantQuarantine.setDocumentName(documentName);
	}

	/**
	* Returns the user created of this temp declaration for plant quarantine.
	*
	* @return the user created of this temp declaration for plant quarantine
	*/
	@Override
	public java.lang.String getUserCreated() {
		return _tempDeclarationForPlantQuarantine.getUserCreated();
	}

	/**
	* Sets the user created of this temp declaration for plant quarantine.
	*
	* @param userCreated the user created of this temp declaration for plant quarantine
	*/
	@Override
	public void setUserCreated(java.lang.String userCreated) {
		_tempDeclarationForPlantQuarantine.setUserCreated(userCreated);
	}

	/**
	* Returns the name of ship of this temp declaration for plant quarantine.
	*
	* @return the name of ship of this temp declaration for plant quarantine
	*/
	@Override
	public java.lang.String getNameOfShip() {
		return _tempDeclarationForPlantQuarantine.getNameOfShip();
	}

	/**
	* Sets the name of ship of this temp declaration for plant quarantine.
	*
	* @param nameOfShip the name of ship of this temp declaration for plant quarantine
	*/
	@Override
	public void setNameOfShip(java.lang.String nameOfShip) {
		_tempDeclarationForPlantQuarantine.setNameOfShip(nameOfShip);
	}

	/**
	* Returns the flag state of ship of this temp declaration for plant quarantine.
	*
	* @return the flag state of ship of this temp declaration for plant quarantine
	*/
	@Override
	public java.lang.String getFlagStateOfShip() {
		return _tempDeclarationForPlantQuarantine.getFlagStateOfShip();
	}

	/**
	* Sets the flag state of ship of this temp declaration for plant quarantine.
	*
	* @param flagStateOfShip the flag state of ship of this temp declaration for plant quarantine
	*/
	@Override
	public void setFlagStateOfShip(java.lang.String flagStateOfShip) {
		_tempDeclarationForPlantQuarantine.setFlagStateOfShip(flagStateOfShip);
	}

	/**
	* Returns the name of master of this temp declaration for plant quarantine.
	*
	* @return the name of master of this temp declaration for plant quarantine
	*/
	@Override
	public java.lang.String getNameOfMaster() {
		return _tempDeclarationForPlantQuarantine.getNameOfMaster();
	}

	/**
	* Sets the name of master of this temp declaration for plant quarantine.
	*
	* @param nameOfMaster the name of master of this temp declaration for plant quarantine
	*/
	@Override
	public void setNameOfMaster(java.lang.String nameOfMaster) {
		_tempDeclarationForPlantQuarantine.setNameOfMaster(nameOfMaster);
	}

	/**
	* Returns the doctor name of this temp declaration for plant quarantine.
	*
	* @return the doctor name of this temp declaration for plant quarantine
	*/
	@Override
	public java.lang.String getDoctorName() {
		return _tempDeclarationForPlantQuarantine.getDoctorName();
	}

	/**
	* Sets the doctor name of this temp declaration for plant quarantine.
	*
	* @param doctorName the doctor name of this temp declaration for plant quarantine
	*/
	@Override
	public void setDoctorName(java.lang.String doctorName) {
		_tempDeclarationForPlantQuarantine.setDoctorName(doctorName);
	}

	/**
	* Returns the number of crew of this temp declaration for plant quarantine.
	*
	* @return the number of crew of this temp declaration for plant quarantine
	*/
	@Override
	public int getNumberOfCrew() {
		return _tempDeclarationForPlantQuarantine.getNumberOfCrew();
	}

	/**
	* Sets the number of crew of this temp declaration for plant quarantine.
	*
	* @param numberOfCrew the number of crew of this temp declaration for plant quarantine
	*/
	@Override
	public void setNumberOfCrew(int numberOfCrew) {
		_tempDeclarationForPlantQuarantine.setNumberOfCrew(numberOfCrew);
	}

	/**
	* Returns the number of passengers of this temp declaration for plant quarantine.
	*
	* @return the number of passengers of this temp declaration for plant quarantine
	*/
	@Override
	public int getNumberOfPassengers() {
		return _tempDeclarationForPlantQuarantine.getNumberOfPassengers();
	}

	/**
	* Sets the number of passengers of this temp declaration for plant quarantine.
	*
	* @param numberOfPassengers the number of passengers of this temp declaration for plant quarantine
	*/
	@Override
	public void setNumberOfPassengers(int numberOfPassengers) {
		_tempDeclarationForPlantQuarantine.setNumberOfPassengers(numberOfPassengers);
	}

	/**
	* Returns the last port of call code of this temp declaration for plant quarantine.
	*
	* @return the last port of call code of this temp declaration for plant quarantine
	*/
	@Override
	public java.lang.String getLastPortOfCallCode() {
		return _tempDeclarationForPlantQuarantine.getLastPortOfCallCode();
	}

	/**
	* Sets the last port of call code of this temp declaration for plant quarantine.
	*
	* @param lastPortOfCallCode the last port of call code of this temp declaration for plant quarantine
	*/
	@Override
	public void setLastPortOfCallCode(java.lang.String lastPortOfCallCode) {
		_tempDeclarationForPlantQuarantine.setLastPortOfCallCode(lastPortOfCallCode);
	}

	/**
	* Returns the next port of call code of this temp declaration for plant quarantine.
	*
	* @return the next port of call code of this temp declaration for plant quarantine
	*/
	@Override
	public java.lang.String getNextPortOfCallCode() {
		return _tempDeclarationForPlantQuarantine.getNextPortOfCallCode();
	}

	/**
	* Sets the next port of call code of this temp declaration for plant quarantine.
	*
	* @param nextPortOfCallCode the next port of call code of this temp declaration for plant quarantine
	*/
	@Override
	public void setNextPortOfCallCode(java.lang.String nextPortOfCallCode) {
		_tempDeclarationForPlantQuarantine.setNextPortOfCallCode(nextPortOfCallCode);
	}

	/**
	* Returns the first port of loading code of this temp declaration for plant quarantine.
	*
	* @return the first port of loading code of this temp declaration for plant quarantine
	*/
	@Override
	public java.lang.String getFirstPortOfLoadingCode() {
		return _tempDeclarationForPlantQuarantine.getFirstPortOfLoadingCode();
	}

	/**
	* Sets the first port of loading code of this temp declaration for plant quarantine.
	*
	* @param firstPortOfLoadingCode the first port of loading code of this temp declaration for plant quarantine
	*/
	@Override
	public void setFirstPortOfLoadingCode(
		java.lang.String firstPortOfLoadingCode) {
		_tempDeclarationForPlantQuarantine.setFirstPortOfLoadingCode(firstPortOfLoadingCode);
	}

	/**
	* Returns the date ofdeparture of this temp declaration for plant quarantine.
	*
	* @return the date ofdeparture of this temp declaration for plant quarantine
	*/
	@Override
	public java.util.Date getDateOfdeparture() {
		return _tempDeclarationForPlantQuarantine.getDateOfdeparture();
	}

	/**
	* Sets the date ofdeparture of this temp declaration for plant quarantine.
	*
	* @param dateOfdeparture the date ofdeparture of this temp declaration for plant quarantine
	*/
	@Override
	public void setDateOfdeparture(java.util.Date dateOfdeparture) {
		_tempDeclarationForPlantQuarantine.setDateOfdeparture(dateOfdeparture);
	}

	/**
	* Returns the plant name first of this temp declaration for plant quarantine.
	*
	* @return the plant name first of this temp declaration for plant quarantine
	*/
	@Override
	public java.lang.String getPlantNameFirst() {
		return _tempDeclarationForPlantQuarantine.getPlantNameFirst();
	}

	/**
	* Sets the plant name first of this temp declaration for plant quarantine.
	*
	* @param plantNameFirst the plant name first of this temp declaration for plant quarantine
	*/
	@Override
	public void setPlantNameFirst(java.lang.String plantNameFirst) {
		_tempDeclarationForPlantQuarantine.setPlantNameFirst(plantNameFirst);
	}

	/**
	* Returns the plant name between of this temp declaration for plant quarantine.
	*
	* @return the plant name between of this temp declaration for plant quarantine
	*/
	@Override
	public java.lang.String getPlantNameBetween() {
		return _tempDeclarationForPlantQuarantine.getPlantNameBetween();
	}

	/**
	* Sets the plant name between of this temp declaration for plant quarantine.
	*
	* @param plantNameBetween the plant name between of this temp declaration for plant quarantine
	*/
	@Override
	public void setPlantNameBetween(java.lang.String plantNameBetween) {
		_tempDeclarationForPlantQuarantine.setPlantNameBetween(plantNameBetween);
	}

	/**
	* Returns the plant name this of this temp declaration for plant quarantine.
	*
	* @return the plant name this of this temp declaration for plant quarantine
	*/
	@Override
	public java.lang.String getPlantNameThis() {
		return _tempDeclarationForPlantQuarantine.getPlantNameThis();
	}

	/**
	* Sets the plant name this of this temp declaration for plant quarantine.
	*
	* @param plantNameThis the plant name this of this temp declaration for plant quarantine
	*/
	@Override
	public void setPlantNameThis(java.lang.String plantNameThis) {
		_tempDeclarationForPlantQuarantine.setPlantNameThis(plantNameThis);
	}

	/**
	* Returns the sign place of this temp declaration for plant quarantine.
	*
	* @return the sign place of this temp declaration for plant quarantine
	*/
	@Override
	public java.lang.String getSignPlace() {
		return _tempDeclarationForPlantQuarantine.getSignPlace();
	}

	/**
	* Sets the sign place of this temp declaration for plant quarantine.
	*
	* @param signPlace the sign place of this temp declaration for plant quarantine
	*/
	@Override
	public void setSignPlace(java.lang.String signPlace) {
		_tempDeclarationForPlantQuarantine.setSignPlace(signPlace);
	}

	/**
	* Returns the sign date of this temp declaration for plant quarantine.
	*
	* @return the sign date of this temp declaration for plant quarantine
	*/
	@Override
	public java.util.Date getSignDate() {
		return _tempDeclarationForPlantQuarantine.getSignDate();
	}

	/**
	* Sets the sign date of this temp declaration for plant quarantine.
	*
	* @param signDate the sign date of this temp declaration for plant quarantine
	*/
	@Override
	public void setSignDate(java.util.Date signDate) {
		_tempDeclarationForPlantQuarantine.setSignDate(signDate);
	}

	/**
	* Returns the master signed of this temp declaration for plant quarantine.
	*
	* @return the master signed of this temp declaration for plant quarantine
	*/
	@Override
	public int getMasterSigned() {
		return _tempDeclarationForPlantQuarantine.getMasterSigned();
	}

	/**
	* Sets the master signed of this temp declaration for plant quarantine.
	*
	* @param masterSigned the master signed of this temp declaration for plant quarantine
	*/
	@Override
	public void setMasterSigned(int masterSigned) {
		_tempDeclarationForPlantQuarantine.setMasterSigned(masterSigned);
	}

	/**
	* Returns the master signed image of this temp declaration for plant quarantine.
	*
	* @return the master signed image of this temp declaration for plant quarantine
	*/
	@Override
	public int getMasterSignedImage() {
		return _tempDeclarationForPlantQuarantine.getMasterSignedImage();
	}

	/**
	* Sets the master signed image of this temp declaration for plant quarantine.
	*
	* @param masterSignedImage the master signed image of this temp declaration for plant quarantine
	*/
	@Override
	public void setMasterSignedImage(int masterSignedImage) {
		_tempDeclarationForPlantQuarantine.setMasterSignedImage(masterSignedImage);
	}

	/**
	* Returns the attached file of this temp declaration for plant quarantine.
	*
	* @return the attached file of this temp declaration for plant quarantine
	*/
	@Override
	public long getAttachedFile() {
		return _tempDeclarationForPlantQuarantine.getAttachedFile();
	}

	/**
	* Sets the attached file of this temp declaration for plant quarantine.
	*
	* @param attachedFile the attached file of this temp declaration for plant quarantine
	*/
	@Override
	public void setAttachedFile(long attachedFile) {
		_tempDeclarationForPlantQuarantine.setAttachedFile(attachedFile);
	}

	/**
	* Returns the document year of this temp declaration for plant quarantine.
	*
	* @return the document year of this temp declaration for plant quarantine
	*/
	@Override
	public int getDocumentYear() {
		return _tempDeclarationForPlantQuarantine.getDocumentYear();
	}

	/**
	* Sets the document year of this temp declaration for plant quarantine.
	*
	* @param documentYear the document year of this temp declaration for plant quarantine
	*/
	@Override
	public void setDocumentYear(int documentYear) {
		_tempDeclarationForPlantQuarantine.setDocumentYear(documentYear);
	}

	@Override
	public boolean isNew() {
		return _tempDeclarationForPlantQuarantine.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tempDeclarationForPlantQuarantine.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tempDeclarationForPlantQuarantine.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tempDeclarationForPlantQuarantine.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tempDeclarationForPlantQuarantine.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tempDeclarationForPlantQuarantine.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tempDeclarationForPlantQuarantine.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tempDeclarationForPlantQuarantine.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tempDeclarationForPlantQuarantine.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tempDeclarationForPlantQuarantine.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tempDeclarationForPlantQuarantine.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TempDeclarationForPlantQuarantineWrapper((TempDeclarationForPlantQuarantine)_tempDeclarationForPlantQuarantine.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForPlantQuarantine tempDeclarationForPlantQuarantine) {
		return _tempDeclarationForPlantQuarantine.compareTo(tempDeclarationForPlantQuarantine);
	}

	@Override
	public int hashCode() {
		return _tempDeclarationForPlantQuarantine.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForPlantQuarantine> toCacheModel() {
		return _tempDeclarationForPlantQuarantine.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForPlantQuarantine toEscapedModel() {
		return new TempDeclarationForPlantQuarantineWrapper(_tempDeclarationForPlantQuarantine.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForPlantQuarantine toUnescapedModel() {
		return new TempDeclarationForPlantQuarantineWrapper(_tempDeclarationForPlantQuarantine.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tempDeclarationForPlantQuarantine.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tempDeclarationForPlantQuarantine.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempDeclarationForPlantQuarantine.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TempDeclarationForPlantQuarantineWrapper)) {
			return false;
		}

		TempDeclarationForPlantQuarantineWrapper tempDeclarationForPlantQuarantineWrapper =
			(TempDeclarationForPlantQuarantineWrapper)obj;

		if (Validator.equals(_tempDeclarationForPlantQuarantine,
					tempDeclarationForPlantQuarantineWrapper._tempDeclarationForPlantQuarantine)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TempDeclarationForPlantQuarantine getWrappedTempDeclarationForPlantQuarantine() {
		return _tempDeclarationForPlantQuarantine;
	}

	@Override
	public TempDeclarationForPlantQuarantine getWrappedModel() {
		return _tempDeclarationForPlantQuarantine;
	}

	@Override
	public void resetOriginalValues() {
		_tempDeclarationForPlantQuarantine.resetOriginalValues();
	}

	private TempDeclarationForPlantQuarantine _tempDeclarationForPlantQuarantine;
}