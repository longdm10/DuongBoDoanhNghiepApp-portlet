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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the TempDeclarationForAnimalQuarantine service. Represents a row in the &quot;temp_animal_quarantine&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDeclarationForAnimalQuarantineModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempDeclarationForAnimalQuarantineImpl}.
 * </p>
 *
 * @author longdm
 * @see TempDeclarationForAnimalQuarantine
 * @see vn.dtt.duongbien.dao.vrcb.model.impl.TempDeclarationForAnimalQuarantineImpl
 * @see vn.dtt.duongbien.dao.vrcb.model.impl.TempDeclarationForAnimalQuarantineModelImpl
 * @generated
 */
public interface TempDeclarationForAnimalQuarantineModel extends BaseModel<TempDeclarationForAnimalQuarantine> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a temp declaration for animal quarantine model instance should use the {@link TempDeclarationForAnimalQuarantine} interface instead.
	 */

	/**
	 * Returns the primary key of this temp declaration for animal quarantine.
	 *
	 * @return the primary key of this temp declaration for animal quarantine
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this temp declaration for animal quarantine.
	 *
	 * @param primaryKey the primary key of this temp declaration for animal quarantine
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this temp declaration for animal quarantine.
	 *
	 * @return the ID of this temp declaration for animal quarantine
	 */
	public long getId();

	/**
	 * Sets the ID of this temp declaration for animal quarantine.
	 *
	 * @param id the ID of this temp declaration for animal quarantine
	 */
	public void setId(long id);

	/**
	 * Returns the request code of this temp declaration for animal quarantine.
	 *
	 * @return the request code of this temp declaration for animal quarantine
	 */
	@AutoEscape
	public String getRequestCode();

	/**
	 * Sets the request code of this temp declaration for animal quarantine.
	 *
	 * @param requestCode the request code of this temp declaration for animal quarantine
	 */
	public void setRequestCode(String requestCode);

	/**
	 * Returns the request state of this temp declaration for animal quarantine.
	 *
	 * @return the request state of this temp declaration for animal quarantine
	 */
	public int getRequestState();

	/**
	 * Sets the request state of this temp declaration for animal quarantine.
	 *
	 * @param requestState the request state of this temp declaration for animal quarantine
	 */
	public void setRequestState(int requestState);

	/**
	 * Returns the document name of this temp declaration for animal quarantine.
	 *
	 * @return the document name of this temp declaration for animal quarantine
	 */
	public long getDocumentName();

	/**
	 * Sets the document name of this temp declaration for animal quarantine.
	 *
	 * @param documentName the document name of this temp declaration for animal quarantine
	 */
	public void setDocumentName(long documentName);

	/**
	 * Returns the document year of this temp declaration for animal quarantine.
	 *
	 * @return the document year of this temp declaration for animal quarantine
	 */
	public int getDocumentYear();

	/**
	 * Sets the document year of this temp declaration for animal quarantine.
	 *
	 * @param documentYear the document year of this temp declaration for animal quarantine
	 */
	public void setDocumentYear(int documentYear);

	/**
	 * Returns the user created of this temp declaration for animal quarantine.
	 *
	 * @return the user created of this temp declaration for animal quarantine
	 */
	@AutoEscape
	public String getUserCreated();

	/**
	 * Sets the user created of this temp declaration for animal quarantine.
	 *
	 * @param userCreated the user created of this temp declaration for animal quarantine
	 */
	public void setUserCreated(String userCreated);

	/**
	 * Returns the name of ship of this temp declaration for animal quarantine.
	 *
	 * @return the name of ship of this temp declaration for animal quarantine
	 */
	@AutoEscape
	public String getNameOfShip();

	/**
	 * Sets the name of ship of this temp declaration for animal quarantine.
	 *
	 * @param nameOfShip the name of ship of this temp declaration for animal quarantine
	 */
	public void setNameOfShip(String nameOfShip);

	/**
	 * Returns the flag state of ship of this temp declaration for animal quarantine.
	 *
	 * @return the flag state of ship of this temp declaration for animal quarantine
	 */
	@AutoEscape
	public String getFlagStateOfShip();

	/**
	 * Sets the flag state of ship of this temp declaration for animal quarantine.
	 *
	 * @param flagStateOfShip the flag state of ship of this temp declaration for animal quarantine
	 */
	public void setFlagStateOfShip(String flagStateOfShip);

	/**
	 * Returns the number of crew of this temp declaration for animal quarantine.
	 *
	 * @return the number of crew of this temp declaration for animal quarantine
	 */
	public int getNumberOfCrew();

	/**
	 * Sets the number of crew of this temp declaration for animal quarantine.
	 *
	 * @param numberOfCrew the number of crew of this temp declaration for animal quarantine
	 */
	public void setNumberOfCrew(int numberOfCrew);

	/**
	 * Returns the number of passengers of this temp declaration for animal quarantine.
	 *
	 * @return the number of passengers of this temp declaration for animal quarantine
	 */
	public int getNumberOfPassengers();

	/**
	 * Sets the number of passengers of this temp declaration for animal quarantine.
	 *
	 * @param numberOfPassengers the number of passengers of this temp declaration for animal quarantine
	 */
	public void setNumberOfPassengers(int numberOfPassengers);

	/**
	 * Returns the last port of call code of this temp declaration for animal quarantine.
	 *
	 * @return the last port of call code of this temp declaration for animal quarantine
	 */
	@AutoEscape
	public String getLastPortOfCallCode();

	/**
	 * Sets the last port of call code of this temp declaration for animal quarantine.
	 *
	 * @param lastPortOfCallCode the last port of call code of this temp declaration for animal quarantine
	 */
	public void setLastPortOfCallCode(String lastPortOfCallCode);

	/**
	 * Returns the next port of call code of this temp declaration for animal quarantine.
	 *
	 * @return the next port of call code of this temp declaration for animal quarantine
	 */
	@AutoEscape
	public String getNextPortOfCallCode();

	/**
	 * Sets the next port of call code of this temp declaration for animal quarantine.
	 *
	 * @param nextPortOfCallCode the next port of call code of this temp declaration for animal quarantine
	 */
	public void setNextPortOfCallCode(String nextPortOfCallCode);

	/**
	 * Returns the animal name first of this temp declaration for animal quarantine.
	 *
	 * @return the animal name first of this temp declaration for animal quarantine
	 */
	@AutoEscape
	public String getAnimalNameFirst();

	/**
	 * Sets the animal name first of this temp declaration for animal quarantine.
	 *
	 * @param animalNameFirst the animal name first of this temp declaration for animal quarantine
	 */
	public void setAnimalNameFirst(String animalNameFirst);

	/**
	 * Returns the animal name between of this temp declaration for animal quarantine.
	 *
	 * @return the animal name between of this temp declaration for animal quarantine
	 */
	@AutoEscape
	public String getAnimalNameBetween();

	/**
	 * Sets the animal name between of this temp declaration for animal quarantine.
	 *
	 * @param animalNameBetween the animal name between of this temp declaration for animal quarantine
	 */
	public void setAnimalNameBetween(String animalNameBetween);

	/**
	 * Returns the animal name this of this temp declaration for animal quarantine.
	 *
	 * @return the animal name this of this temp declaration for animal quarantine
	 */
	@AutoEscape
	public String getAnimalNameThis();

	/**
	 * Sets the animal name this of this temp declaration for animal quarantine.
	 *
	 * @param animalNameThis the animal name this of this temp declaration for animal quarantine
	 */
	public void setAnimalNameThis(String animalNameThis);

	/**
	 * Returns the name of master of this temp declaration for animal quarantine.
	 *
	 * @return the name of master of this temp declaration for animal quarantine
	 */
	@AutoEscape
	public String getNameOfMaster();

	/**
	 * Sets the name of master of this temp declaration for animal quarantine.
	 *
	 * @param nameOfMaster the name of master of this temp declaration for animal quarantine
	 */
	public void setNameOfMaster(String nameOfMaster);

	/**
	 * Returns the sign place of this temp declaration for animal quarantine.
	 *
	 * @return the sign place of this temp declaration for animal quarantine
	 */
	@AutoEscape
	public String getSignPlace();

	/**
	 * Sets the sign place of this temp declaration for animal quarantine.
	 *
	 * @param signPlace the sign place of this temp declaration for animal quarantine
	 */
	public void setSignPlace(String signPlace);

	/**
	 * Returns the sign date of this temp declaration for animal quarantine.
	 *
	 * @return the sign date of this temp declaration for animal quarantine
	 */
	public Date getSignDate();

	/**
	 * Sets the sign date of this temp declaration for animal quarantine.
	 *
	 * @param signDate the sign date of this temp declaration for animal quarantine
	 */
	public void setSignDate(Date signDate);

	/**
	 * Returns the master signed of this temp declaration for animal quarantine.
	 *
	 * @return the master signed of this temp declaration for animal quarantine
	 */
	public int getMasterSigned();

	/**
	 * Sets the master signed of this temp declaration for animal quarantine.
	 *
	 * @param masterSigned the master signed of this temp declaration for animal quarantine
	 */
	public void setMasterSigned(int masterSigned);

	/**
	 * Returns the master signed image of this temp declaration for animal quarantine.
	 *
	 * @return the master signed image of this temp declaration for animal quarantine
	 */
	public int getMasterSignedImage();

	/**
	 * Sets the master signed image of this temp declaration for animal quarantine.
	 *
	 * @param masterSignedImage the master signed image of this temp declaration for animal quarantine
	 */
	public void setMasterSignedImage(int masterSignedImage);

	/**
	 * Returns the attached file of this temp declaration for animal quarantine.
	 *
	 * @return the attached file of this temp declaration for animal quarantine
	 */
	public long getAttachedFile();

	/**
	 * Sets the attached file of this temp declaration for animal quarantine.
	 *
	 * @param attachedFile the attached file of this temp declaration for animal quarantine
	 */
	public void setAttachedFile(long attachedFile);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine);

	@Override
	public int hashCode();

	@Override
	public CacheModel<TempDeclarationForAnimalQuarantine> toCacheModel();

	@Override
	public TempDeclarationForAnimalQuarantine toEscapedModel();

	@Override
	public TempDeclarationForAnimalQuarantine toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}