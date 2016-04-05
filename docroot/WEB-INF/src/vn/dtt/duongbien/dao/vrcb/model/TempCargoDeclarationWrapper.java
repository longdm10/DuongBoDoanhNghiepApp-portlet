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
 * This class is a wrapper for {@link TempCargoDeclaration}.
 * </p>
 *
 * @author longdm
 * @see TempCargoDeclaration
 * @generated
 */
public class TempCargoDeclarationWrapper implements TempCargoDeclaration,
	ModelWrapper<TempCargoDeclaration> {
	public TempCargoDeclarationWrapper(
		TempCargoDeclaration tempCargoDeclaration) {
		_tempCargoDeclaration = tempCargoDeclaration;
	}

	@Override
	public Class<?> getModelClass() {
		return TempCargoDeclaration.class;
	}

	@Override
	public String getModelClassName() {
		return TempCargoDeclaration.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("requestCode", getRequestCode());
		attributes.put("requestState", getRequestState());
		attributes.put("documentName", getDocumentName());
		attributes.put("userCreated", getUserCreated());
		attributes.put("isArrival", getIsArrival());
		attributes.put("nameOfShip", getNameOfShip());
		attributes.put("imoNumber", getImoNumber());
		attributes.put("callsign", getCallsign());
		attributes.put("voyageNumber", getVoyageNumber());
		attributes.put("portReport", getPortReport());
		attributes.put("flagStateOfShip", getFlagStateOfShip());
		attributes.put("nameOfMaster", getNameOfMaster());
		attributes.put("portOfLoading", getPortOfLoading());
		attributes.put("listGoods", getListGoods());
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

		Integer isArrival = (Integer)attributes.get("isArrival");

		if (isArrival != null) {
			setIsArrival(isArrival);
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

		String portReport = (String)attributes.get("portReport");

		if (portReport != null) {
			setPortReport(portReport);
		}

		String flagStateOfShip = (String)attributes.get("flagStateOfShip");

		if (flagStateOfShip != null) {
			setFlagStateOfShip(flagStateOfShip);
		}

		String nameOfMaster = (String)attributes.get("nameOfMaster");

		if (nameOfMaster != null) {
			setNameOfMaster(nameOfMaster);
		}

		String portOfLoading = (String)attributes.get("portOfLoading");

		if (portOfLoading != null) {
			setPortOfLoading(portOfLoading);
		}

		Integer listGoods = (Integer)attributes.get("listGoods");

		if (listGoods != null) {
			setListGoods(listGoods);
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
	* Returns the primary key of this temp cargo declaration.
	*
	* @return the primary key of this temp cargo declaration
	*/
	@Override
	public long getPrimaryKey() {
		return _tempCargoDeclaration.getPrimaryKey();
	}

	/**
	* Sets the primary key of this temp cargo declaration.
	*
	* @param primaryKey the primary key of this temp cargo declaration
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tempCargoDeclaration.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this temp cargo declaration.
	*
	* @return the ID of this temp cargo declaration
	*/
	@Override
	public long getId() {
		return _tempCargoDeclaration.getId();
	}

	/**
	* Sets the ID of this temp cargo declaration.
	*
	* @param id the ID of this temp cargo declaration
	*/
	@Override
	public void setId(long id) {
		_tempCargoDeclaration.setId(id);
	}

	/**
	* Returns the request code of this temp cargo declaration.
	*
	* @return the request code of this temp cargo declaration
	*/
	@Override
	public java.lang.String getRequestCode() {
		return _tempCargoDeclaration.getRequestCode();
	}

	/**
	* Sets the request code of this temp cargo declaration.
	*
	* @param requestCode the request code of this temp cargo declaration
	*/
	@Override
	public void setRequestCode(java.lang.String requestCode) {
		_tempCargoDeclaration.setRequestCode(requestCode);
	}

	/**
	* Returns the request state of this temp cargo declaration.
	*
	* @return the request state of this temp cargo declaration
	*/
	@Override
	public int getRequestState() {
		return _tempCargoDeclaration.getRequestState();
	}

	/**
	* Sets the request state of this temp cargo declaration.
	*
	* @param requestState the request state of this temp cargo declaration
	*/
	@Override
	public void setRequestState(int requestState) {
		_tempCargoDeclaration.setRequestState(requestState);
	}

	/**
	* Returns the document name of this temp cargo declaration.
	*
	* @return the document name of this temp cargo declaration
	*/
	@Override
	public long getDocumentName() {
		return _tempCargoDeclaration.getDocumentName();
	}

	/**
	* Sets the document name of this temp cargo declaration.
	*
	* @param documentName the document name of this temp cargo declaration
	*/
	@Override
	public void setDocumentName(long documentName) {
		_tempCargoDeclaration.setDocumentName(documentName);
	}

	/**
	* Returns the user created of this temp cargo declaration.
	*
	* @return the user created of this temp cargo declaration
	*/
	@Override
	public java.lang.String getUserCreated() {
		return _tempCargoDeclaration.getUserCreated();
	}

	/**
	* Sets the user created of this temp cargo declaration.
	*
	* @param userCreated the user created of this temp cargo declaration
	*/
	@Override
	public void setUserCreated(java.lang.String userCreated) {
		_tempCargoDeclaration.setUserCreated(userCreated);
	}

	/**
	* Returns the is arrival of this temp cargo declaration.
	*
	* @return the is arrival of this temp cargo declaration
	*/
	@Override
	public int getIsArrival() {
		return _tempCargoDeclaration.getIsArrival();
	}

	/**
	* Sets the is arrival of this temp cargo declaration.
	*
	* @param isArrival the is arrival of this temp cargo declaration
	*/
	@Override
	public void setIsArrival(int isArrival) {
		_tempCargoDeclaration.setIsArrival(isArrival);
	}

	/**
	* Returns the name of ship of this temp cargo declaration.
	*
	* @return the name of ship of this temp cargo declaration
	*/
	@Override
	public java.lang.String getNameOfShip() {
		return _tempCargoDeclaration.getNameOfShip();
	}

	/**
	* Sets the name of ship of this temp cargo declaration.
	*
	* @param nameOfShip the name of ship of this temp cargo declaration
	*/
	@Override
	public void setNameOfShip(java.lang.String nameOfShip) {
		_tempCargoDeclaration.setNameOfShip(nameOfShip);
	}

	/**
	* Returns the imo number of this temp cargo declaration.
	*
	* @return the imo number of this temp cargo declaration
	*/
	@Override
	public java.lang.String getImoNumber() {
		return _tempCargoDeclaration.getImoNumber();
	}

	/**
	* Sets the imo number of this temp cargo declaration.
	*
	* @param imoNumber the imo number of this temp cargo declaration
	*/
	@Override
	public void setImoNumber(java.lang.String imoNumber) {
		_tempCargoDeclaration.setImoNumber(imoNumber);
	}

	/**
	* Returns the callsign of this temp cargo declaration.
	*
	* @return the callsign of this temp cargo declaration
	*/
	@Override
	public java.lang.String getCallsign() {
		return _tempCargoDeclaration.getCallsign();
	}

	/**
	* Sets the callsign of this temp cargo declaration.
	*
	* @param callsign the callsign of this temp cargo declaration
	*/
	@Override
	public void setCallsign(java.lang.String callsign) {
		_tempCargoDeclaration.setCallsign(callsign);
	}

	/**
	* Returns the voyage number of this temp cargo declaration.
	*
	* @return the voyage number of this temp cargo declaration
	*/
	@Override
	public java.lang.String getVoyageNumber() {
		return _tempCargoDeclaration.getVoyageNumber();
	}

	/**
	* Sets the voyage number of this temp cargo declaration.
	*
	* @param voyageNumber the voyage number of this temp cargo declaration
	*/
	@Override
	public void setVoyageNumber(java.lang.String voyageNumber) {
		_tempCargoDeclaration.setVoyageNumber(voyageNumber);
	}

	/**
	* Returns the port report of this temp cargo declaration.
	*
	* @return the port report of this temp cargo declaration
	*/
	@Override
	public java.lang.String getPortReport() {
		return _tempCargoDeclaration.getPortReport();
	}

	/**
	* Sets the port report of this temp cargo declaration.
	*
	* @param portReport the port report of this temp cargo declaration
	*/
	@Override
	public void setPortReport(java.lang.String portReport) {
		_tempCargoDeclaration.setPortReport(portReport);
	}

	/**
	* Returns the flag state of ship of this temp cargo declaration.
	*
	* @return the flag state of ship of this temp cargo declaration
	*/
	@Override
	public java.lang.String getFlagStateOfShip() {
		return _tempCargoDeclaration.getFlagStateOfShip();
	}

	/**
	* Sets the flag state of ship of this temp cargo declaration.
	*
	* @param flagStateOfShip the flag state of ship of this temp cargo declaration
	*/
	@Override
	public void setFlagStateOfShip(java.lang.String flagStateOfShip) {
		_tempCargoDeclaration.setFlagStateOfShip(flagStateOfShip);
	}

	/**
	* Returns the name of master of this temp cargo declaration.
	*
	* @return the name of master of this temp cargo declaration
	*/
	@Override
	public java.lang.String getNameOfMaster() {
		return _tempCargoDeclaration.getNameOfMaster();
	}

	/**
	* Sets the name of master of this temp cargo declaration.
	*
	* @param nameOfMaster the name of master of this temp cargo declaration
	*/
	@Override
	public void setNameOfMaster(java.lang.String nameOfMaster) {
		_tempCargoDeclaration.setNameOfMaster(nameOfMaster);
	}

	/**
	* Returns the port of loading of this temp cargo declaration.
	*
	* @return the port of loading of this temp cargo declaration
	*/
	@Override
	public java.lang.String getPortOfLoading() {
		return _tempCargoDeclaration.getPortOfLoading();
	}

	/**
	* Sets the port of loading of this temp cargo declaration.
	*
	* @param portOfLoading the port of loading of this temp cargo declaration
	*/
	@Override
	public void setPortOfLoading(java.lang.String portOfLoading) {
		_tempCargoDeclaration.setPortOfLoading(portOfLoading);
	}

	/**
	* Returns the list goods of this temp cargo declaration.
	*
	* @return the list goods of this temp cargo declaration
	*/
	@Override
	public int getListGoods() {
		return _tempCargoDeclaration.getListGoods();
	}

	/**
	* Sets the list goods of this temp cargo declaration.
	*
	* @param listGoods the list goods of this temp cargo declaration
	*/
	@Override
	public void setListGoods(int listGoods) {
		_tempCargoDeclaration.setListGoods(listGoods);
	}

	/**
	* Returns the sign place of this temp cargo declaration.
	*
	* @return the sign place of this temp cargo declaration
	*/
	@Override
	public java.lang.String getSignPlace() {
		return _tempCargoDeclaration.getSignPlace();
	}

	/**
	* Sets the sign place of this temp cargo declaration.
	*
	* @param signPlace the sign place of this temp cargo declaration
	*/
	@Override
	public void setSignPlace(java.lang.String signPlace) {
		_tempCargoDeclaration.setSignPlace(signPlace);
	}

	/**
	* Returns the sign date of this temp cargo declaration.
	*
	* @return the sign date of this temp cargo declaration
	*/
	@Override
	public java.util.Date getSignDate() {
		return _tempCargoDeclaration.getSignDate();
	}

	/**
	* Sets the sign date of this temp cargo declaration.
	*
	* @param signDate the sign date of this temp cargo declaration
	*/
	@Override
	public void setSignDate(java.util.Date signDate) {
		_tempCargoDeclaration.setSignDate(signDate);
	}

	/**
	* Returns the master signed of this temp cargo declaration.
	*
	* @return the master signed of this temp cargo declaration
	*/
	@Override
	public int getMasterSigned() {
		return _tempCargoDeclaration.getMasterSigned();
	}

	/**
	* Sets the master signed of this temp cargo declaration.
	*
	* @param masterSigned the master signed of this temp cargo declaration
	*/
	@Override
	public void setMasterSigned(int masterSigned) {
		_tempCargoDeclaration.setMasterSigned(masterSigned);
	}

	/**
	* Returns the master signed image of this temp cargo declaration.
	*
	* @return the master signed image of this temp cargo declaration
	*/
	@Override
	public int getMasterSignedImage() {
		return _tempCargoDeclaration.getMasterSignedImage();
	}

	/**
	* Sets the master signed image of this temp cargo declaration.
	*
	* @param masterSignedImage the master signed image of this temp cargo declaration
	*/
	@Override
	public void setMasterSignedImage(int masterSignedImage) {
		_tempCargoDeclaration.setMasterSignedImage(masterSignedImage);
	}

	/**
	* Returns the attached file of this temp cargo declaration.
	*
	* @return the attached file of this temp cargo declaration
	*/
	@Override
	public long getAttachedFile() {
		return _tempCargoDeclaration.getAttachedFile();
	}

	/**
	* Sets the attached file of this temp cargo declaration.
	*
	* @param attachedFile the attached file of this temp cargo declaration
	*/
	@Override
	public void setAttachedFile(long attachedFile) {
		_tempCargoDeclaration.setAttachedFile(attachedFile);
	}

	/**
	* Returns the document year of this temp cargo declaration.
	*
	* @return the document year of this temp cargo declaration
	*/
	@Override
	public int getDocumentYear() {
		return _tempCargoDeclaration.getDocumentYear();
	}

	/**
	* Sets the document year of this temp cargo declaration.
	*
	* @param documentYear the document year of this temp cargo declaration
	*/
	@Override
	public void setDocumentYear(int documentYear) {
		_tempCargoDeclaration.setDocumentYear(documentYear);
	}

	@Override
	public boolean isNew() {
		return _tempCargoDeclaration.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tempCargoDeclaration.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tempCargoDeclaration.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tempCargoDeclaration.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tempCargoDeclaration.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tempCargoDeclaration.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tempCargoDeclaration.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tempCargoDeclaration.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tempCargoDeclaration.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tempCargoDeclaration.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tempCargoDeclaration.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TempCargoDeclarationWrapper((TempCargoDeclaration)_tempCargoDeclaration.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.TempCargoDeclaration tempCargoDeclaration) {
		return _tempCargoDeclaration.compareTo(tempCargoDeclaration);
	}

	@Override
	public int hashCode() {
		return _tempCargoDeclaration.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.TempCargoDeclaration> toCacheModel() {
		return _tempCargoDeclaration.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempCargoDeclaration toEscapedModel() {
		return new TempCargoDeclarationWrapper(_tempCargoDeclaration.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempCargoDeclaration toUnescapedModel() {
		return new TempCargoDeclarationWrapper(_tempCargoDeclaration.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tempCargoDeclaration.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tempCargoDeclaration.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempCargoDeclaration.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TempCargoDeclarationWrapper)) {
			return false;
		}

		TempCargoDeclarationWrapper tempCargoDeclarationWrapper = (TempCargoDeclarationWrapper)obj;

		if (Validator.equals(_tempCargoDeclaration,
					tempCargoDeclarationWrapper._tempCargoDeclaration)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TempCargoDeclaration getWrappedTempCargoDeclaration() {
		return _tempCargoDeclaration;
	}

	@Override
	public TempCargoDeclaration getWrappedModel() {
		return _tempCargoDeclaration;
	}

	@Override
	public void resetOriginalValues() {
		_tempCargoDeclaration.resetOriginalValues();
	}

	private TempCargoDeclaration _tempCargoDeclaration;
}