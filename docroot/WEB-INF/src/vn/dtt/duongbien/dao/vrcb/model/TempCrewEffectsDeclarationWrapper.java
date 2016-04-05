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
 * This class is a wrapper for {@link TempCrewEffectsDeclaration}.
 * </p>
 *
 * @author longdm
 * @see TempCrewEffectsDeclaration
 * @generated
 */
public class TempCrewEffectsDeclarationWrapper
	implements TempCrewEffectsDeclaration,
		ModelWrapper<TempCrewEffectsDeclaration> {
	public TempCrewEffectsDeclarationWrapper(
		TempCrewEffectsDeclaration tempCrewEffectsDeclaration) {
		_tempCrewEffectsDeclaration = tempCrewEffectsDeclaration;
	}

	@Override
	public Class<?> getModelClass() {
		return TempCrewEffectsDeclaration.class;
	}

	@Override
	public String getModelClassName() {
		return TempCrewEffectsDeclaration.class.getName();
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
		attributes.put("imoNumber", getImoNumber());
		attributes.put("callsign", getCallsign());
		attributes.put("voyageNumber", getVoyageNumber());
		attributes.put("flagStateOfShip", getFlagStateOfShip());
		attributes.put("nameOfMaster", getNameOfMaster());
		attributes.put("listCrewEffects", getListCrewEffects());
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

		String imoNumber = (String)attributes.get("imoNumber");

		if (imoNumber != null) {
			setImoNumber(imoNumber);
		}

		String callsign = (String)attributes.get("callsign");

		if (callsign != null) {
			setCallsign(callsign);
		}

		String voyageNumber = (String)attributes.get("voyageNumber");

		if (voyageNumber != null) {
			setVoyageNumber(voyageNumber);
		}

		String flagStateOfShip = (String)attributes.get("flagStateOfShip");

		if (flagStateOfShip != null) {
			setFlagStateOfShip(flagStateOfShip);
		}

		String nameOfMaster = (String)attributes.get("nameOfMaster");

		if (nameOfMaster != null) {
			setNameOfMaster(nameOfMaster);
		}

		Integer listCrewEffects = (Integer)attributes.get("listCrewEffects");

		if (listCrewEffects != null) {
			setListCrewEffects(listCrewEffects);
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
	* Returns the primary key of this temp crew effects declaration.
	*
	* @return the primary key of this temp crew effects declaration
	*/
	@Override
	public long getPrimaryKey() {
		return _tempCrewEffectsDeclaration.getPrimaryKey();
	}

	/**
	* Sets the primary key of this temp crew effects declaration.
	*
	* @param primaryKey the primary key of this temp crew effects declaration
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tempCrewEffectsDeclaration.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this temp crew effects declaration.
	*
	* @return the ID of this temp crew effects declaration
	*/
	@Override
	public long getId() {
		return _tempCrewEffectsDeclaration.getId();
	}

	/**
	* Sets the ID of this temp crew effects declaration.
	*
	* @param id the ID of this temp crew effects declaration
	*/
	@Override
	public void setId(long id) {
		_tempCrewEffectsDeclaration.setId(id);
	}

	/**
	* Returns the request code of this temp crew effects declaration.
	*
	* @return the request code of this temp crew effects declaration
	*/
	@Override
	public java.lang.String getRequestCode() {
		return _tempCrewEffectsDeclaration.getRequestCode();
	}

	/**
	* Sets the request code of this temp crew effects declaration.
	*
	* @param requestCode the request code of this temp crew effects declaration
	*/
	@Override
	public void setRequestCode(java.lang.String requestCode) {
		_tempCrewEffectsDeclaration.setRequestCode(requestCode);
	}

	/**
	* Returns the request state of this temp crew effects declaration.
	*
	* @return the request state of this temp crew effects declaration
	*/
	@Override
	public int getRequestState() {
		return _tempCrewEffectsDeclaration.getRequestState();
	}

	/**
	* Sets the request state of this temp crew effects declaration.
	*
	* @param requestState the request state of this temp crew effects declaration
	*/
	@Override
	public void setRequestState(int requestState) {
		_tempCrewEffectsDeclaration.setRequestState(requestState);
	}

	/**
	* Returns the document name of this temp crew effects declaration.
	*
	* @return the document name of this temp crew effects declaration
	*/
	@Override
	public long getDocumentName() {
		return _tempCrewEffectsDeclaration.getDocumentName();
	}

	/**
	* Sets the document name of this temp crew effects declaration.
	*
	* @param documentName the document name of this temp crew effects declaration
	*/
	@Override
	public void setDocumentName(long documentName) {
		_tempCrewEffectsDeclaration.setDocumentName(documentName);
	}

	/**
	* Returns the user created of this temp crew effects declaration.
	*
	* @return the user created of this temp crew effects declaration
	*/
	@Override
	public java.lang.String getUserCreated() {
		return _tempCrewEffectsDeclaration.getUserCreated();
	}

	/**
	* Sets the user created of this temp crew effects declaration.
	*
	* @param userCreated the user created of this temp crew effects declaration
	*/
	@Override
	public void setUserCreated(java.lang.String userCreated) {
		_tempCrewEffectsDeclaration.setUserCreated(userCreated);
	}

	/**
	* Returns the name of ship of this temp crew effects declaration.
	*
	* @return the name of ship of this temp crew effects declaration
	*/
	@Override
	public java.lang.String getNameOfShip() {
		return _tempCrewEffectsDeclaration.getNameOfShip();
	}

	/**
	* Sets the name of ship of this temp crew effects declaration.
	*
	* @param nameOfShip the name of ship of this temp crew effects declaration
	*/
	@Override
	public void setNameOfShip(java.lang.String nameOfShip) {
		_tempCrewEffectsDeclaration.setNameOfShip(nameOfShip);
	}

	/**
	* Returns the imo number of this temp crew effects declaration.
	*
	* @return the imo number of this temp crew effects declaration
	*/
	@Override
	public java.lang.String getImoNumber() {
		return _tempCrewEffectsDeclaration.getImoNumber();
	}

	/**
	* Sets the imo number of this temp crew effects declaration.
	*
	* @param imoNumber the imo number of this temp crew effects declaration
	*/
	@Override
	public void setImoNumber(java.lang.String imoNumber) {
		_tempCrewEffectsDeclaration.setImoNumber(imoNumber);
	}

	/**
	* Returns the callsign of this temp crew effects declaration.
	*
	* @return the callsign of this temp crew effects declaration
	*/
	@Override
	public java.lang.String getCallsign() {
		return _tempCrewEffectsDeclaration.getCallsign();
	}

	/**
	* Sets the callsign of this temp crew effects declaration.
	*
	* @param callsign the callsign of this temp crew effects declaration
	*/
	@Override
	public void setCallsign(java.lang.String callsign) {
		_tempCrewEffectsDeclaration.setCallsign(callsign);
	}

	/**
	* Returns the voyage number of this temp crew effects declaration.
	*
	* @return the voyage number of this temp crew effects declaration
	*/
	@Override
	public java.lang.String getVoyageNumber() {
		return _tempCrewEffectsDeclaration.getVoyageNumber();
	}

	/**
	* Sets the voyage number of this temp crew effects declaration.
	*
	* @param voyageNumber the voyage number of this temp crew effects declaration
	*/
	@Override
	public void setVoyageNumber(java.lang.String voyageNumber) {
		_tempCrewEffectsDeclaration.setVoyageNumber(voyageNumber);
	}

	/**
	* Returns the flag state of ship of this temp crew effects declaration.
	*
	* @return the flag state of ship of this temp crew effects declaration
	*/
	@Override
	public java.lang.String getFlagStateOfShip() {
		return _tempCrewEffectsDeclaration.getFlagStateOfShip();
	}

	/**
	* Sets the flag state of ship of this temp crew effects declaration.
	*
	* @param flagStateOfShip the flag state of ship of this temp crew effects declaration
	*/
	@Override
	public void setFlagStateOfShip(java.lang.String flagStateOfShip) {
		_tempCrewEffectsDeclaration.setFlagStateOfShip(flagStateOfShip);
	}

	/**
	* Returns the name of master of this temp crew effects declaration.
	*
	* @return the name of master of this temp crew effects declaration
	*/
	@Override
	public java.lang.String getNameOfMaster() {
		return _tempCrewEffectsDeclaration.getNameOfMaster();
	}

	/**
	* Sets the name of master of this temp crew effects declaration.
	*
	* @param nameOfMaster the name of master of this temp crew effects declaration
	*/
	@Override
	public void setNameOfMaster(java.lang.String nameOfMaster) {
		_tempCrewEffectsDeclaration.setNameOfMaster(nameOfMaster);
	}

	/**
	* Returns the list crew effects of this temp crew effects declaration.
	*
	* @return the list crew effects of this temp crew effects declaration
	*/
	@Override
	public int getListCrewEffects() {
		return _tempCrewEffectsDeclaration.getListCrewEffects();
	}

	/**
	* Sets the list crew effects of this temp crew effects declaration.
	*
	* @param listCrewEffects the list crew effects of this temp crew effects declaration
	*/
	@Override
	public void setListCrewEffects(int listCrewEffects) {
		_tempCrewEffectsDeclaration.setListCrewEffects(listCrewEffects);
	}

	/**
	* Returns the sign place of this temp crew effects declaration.
	*
	* @return the sign place of this temp crew effects declaration
	*/
	@Override
	public java.lang.String getSignPlace() {
		return _tempCrewEffectsDeclaration.getSignPlace();
	}

	/**
	* Sets the sign place of this temp crew effects declaration.
	*
	* @param signPlace the sign place of this temp crew effects declaration
	*/
	@Override
	public void setSignPlace(java.lang.String signPlace) {
		_tempCrewEffectsDeclaration.setSignPlace(signPlace);
	}

	/**
	* Returns the sign date of this temp crew effects declaration.
	*
	* @return the sign date of this temp crew effects declaration
	*/
	@Override
	public java.util.Date getSignDate() {
		return _tempCrewEffectsDeclaration.getSignDate();
	}

	/**
	* Sets the sign date of this temp crew effects declaration.
	*
	* @param signDate the sign date of this temp crew effects declaration
	*/
	@Override
	public void setSignDate(java.util.Date signDate) {
		_tempCrewEffectsDeclaration.setSignDate(signDate);
	}

	/**
	* Returns the master signed of this temp crew effects declaration.
	*
	* @return the master signed of this temp crew effects declaration
	*/
	@Override
	public int getMasterSigned() {
		return _tempCrewEffectsDeclaration.getMasterSigned();
	}

	/**
	* Sets the master signed of this temp crew effects declaration.
	*
	* @param masterSigned the master signed of this temp crew effects declaration
	*/
	@Override
	public void setMasterSigned(int masterSigned) {
		_tempCrewEffectsDeclaration.setMasterSigned(masterSigned);
	}

	/**
	* Returns the master signed image of this temp crew effects declaration.
	*
	* @return the master signed image of this temp crew effects declaration
	*/
	@Override
	public int getMasterSignedImage() {
		return _tempCrewEffectsDeclaration.getMasterSignedImage();
	}

	/**
	* Sets the master signed image of this temp crew effects declaration.
	*
	* @param masterSignedImage the master signed image of this temp crew effects declaration
	*/
	@Override
	public void setMasterSignedImage(int masterSignedImage) {
		_tempCrewEffectsDeclaration.setMasterSignedImage(masterSignedImage);
	}

	/**
	* Returns the attached file of this temp crew effects declaration.
	*
	* @return the attached file of this temp crew effects declaration
	*/
	@Override
	public long getAttachedFile() {
		return _tempCrewEffectsDeclaration.getAttachedFile();
	}

	/**
	* Sets the attached file of this temp crew effects declaration.
	*
	* @param attachedFile the attached file of this temp crew effects declaration
	*/
	@Override
	public void setAttachedFile(long attachedFile) {
		_tempCrewEffectsDeclaration.setAttachedFile(attachedFile);
	}

	/**
	* Returns the document year of this temp crew effects declaration.
	*
	* @return the document year of this temp crew effects declaration
	*/
	@Override
	public int getDocumentYear() {
		return _tempCrewEffectsDeclaration.getDocumentYear();
	}

	/**
	* Sets the document year of this temp crew effects declaration.
	*
	* @param documentYear the document year of this temp crew effects declaration
	*/
	@Override
	public void setDocumentYear(int documentYear) {
		_tempCrewEffectsDeclaration.setDocumentYear(documentYear);
	}

	@Override
	public boolean isNew() {
		return _tempCrewEffectsDeclaration.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tempCrewEffectsDeclaration.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tempCrewEffectsDeclaration.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tempCrewEffectsDeclaration.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tempCrewEffectsDeclaration.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tempCrewEffectsDeclaration.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tempCrewEffectsDeclaration.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tempCrewEffectsDeclaration.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tempCrewEffectsDeclaration.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tempCrewEffectsDeclaration.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tempCrewEffectsDeclaration.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TempCrewEffectsDeclarationWrapper((TempCrewEffectsDeclaration)_tempCrewEffectsDeclaration.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.TempCrewEffectsDeclaration tempCrewEffectsDeclaration) {
		return _tempCrewEffectsDeclaration.compareTo(tempCrewEffectsDeclaration);
	}

	@Override
	public int hashCode() {
		return _tempCrewEffectsDeclaration.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.TempCrewEffectsDeclaration> toCacheModel() {
		return _tempCrewEffectsDeclaration.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempCrewEffectsDeclaration toEscapedModel() {
		return new TempCrewEffectsDeclarationWrapper(_tempCrewEffectsDeclaration.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempCrewEffectsDeclaration toUnescapedModel() {
		return new TempCrewEffectsDeclarationWrapper(_tempCrewEffectsDeclaration.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tempCrewEffectsDeclaration.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tempCrewEffectsDeclaration.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempCrewEffectsDeclaration.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TempCrewEffectsDeclarationWrapper)) {
			return false;
		}

		TempCrewEffectsDeclarationWrapper tempCrewEffectsDeclarationWrapper = (TempCrewEffectsDeclarationWrapper)obj;

		if (Validator.equals(_tempCrewEffectsDeclaration,
					tempCrewEffectsDeclarationWrapper._tempCrewEffectsDeclaration)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TempCrewEffectsDeclaration getWrappedTempCrewEffectsDeclaration() {
		return _tempCrewEffectsDeclaration;
	}

	@Override
	public TempCrewEffectsDeclaration getWrappedModel() {
		return _tempCrewEffectsDeclaration;
	}

	@Override
	public void resetOriginalValues() {
		_tempCrewEffectsDeclaration.resetOriginalValues();
	}

	private TempCrewEffectsDeclaration _tempCrewEffectsDeclaration;
}