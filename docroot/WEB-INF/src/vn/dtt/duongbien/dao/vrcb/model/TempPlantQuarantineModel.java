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
 * The base model interface for the TempPlantQuarantine service. Represents a row in the &quot;TEMP_PLANT_QUARANTINE&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempPlantQuarantineModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.duongbien.dao.vrcb.model.impl.TempPlantQuarantineImpl}.
 * </p>
 *
 * @author longdm
 * @see TempPlantQuarantine
 * @see vn.dtt.duongbien.dao.vrcb.model.impl.TempPlantQuarantineImpl
 * @see vn.dtt.duongbien.dao.vrcb.model.impl.TempPlantQuarantineModelImpl
 * @generated
 */
public interface TempPlantQuarantineModel extends BaseModel<TempPlantQuarantine> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a temp plant quarantine model instance should use the {@link TempPlantQuarantine} interface instead.
	 */

	/**
	 * Returns the primary key of this temp plant quarantine.
	 *
	 * @return the primary key of this temp plant quarantine
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this temp plant quarantine.
	 *
	 * @param primaryKey the primary key of this temp plant quarantine
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this temp plant quarantine.
	 *
	 * @return the ID of this temp plant quarantine
	 */
	public long getId();

	/**
	 * Sets the ID of this temp plant quarantine.
	 *
	 * @param id the ID of this temp plant quarantine
	 */
	public void setId(long id);

	/**
	 * Returns the request code of this temp plant quarantine.
	 *
	 * @return the request code of this temp plant quarantine
	 */
	@AutoEscape
	public String getRequestCode();

	/**
	 * Sets the request code of this temp plant quarantine.
	 *
	 * @param requestCode the request code of this temp plant quarantine
	 */
	public void setRequestCode(String requestCode);

	/**
	 * Returns the request state of this temp plant quarantine.
	 *
	 * @return the request state of this temp plant quarantine
	 */
	public int getRequestState();

	/**
	 * Sets the request state of this temp plant quarantine.
	 *
	 * @param requestState the request state of this temp plant quarantine
	 */
	public void setRequestState(int requestState);

	/**
	 * Returns the document name of this temp plant quarantine.
	 *
	 * @return the document name of this temp plant quarantine
	 */
	public long getDocumentName();

	/**
	 * Sets the document name of this temp plant quarantine.
	 *
	 * @param documentName the document name of this temp plant quarantine
	 */
	public void setDocumentName(long documentName);

	/**
	 * Returns the user created of this temp plant quarantine.
	 *
	 * @return the user created of this temp plant quarantine
	 */
	@AutoEscape
	public String getUserCreated();

	/**
	 * Sets the user created of this temp plant quarantine.
	 *
	 * @param userCreated the user created of this temp plant quarantine
	 */
	public void setUserCreated(String userCreated);

	/**
	 * Returns the document year of this temp plant quarantine.
	 *
	 * @return the document year of this temp plant quarantine
	 */
	public int getDocumentYear();

	/**
	 * Sets the document year of this temp plant quarantine.
	 *
	 * @param documentYear the document year of this temp plant quarantine
	 */
	public void setDocumentYear(int documentYear);

	/**
	 * Returns the name of ship of this temp plant quarantine.
	 *
	 * @return the name of ship of this temp plant quarantine
	 */
	@AutoEscape
	public String getNameOfShip();

	/**
	 * Sets the name of ship of this temp plant quarantine.
	 *
	 * @param nameOfShip the name of ship of this temp plant quarantine
	 */
	public void setNameOfShip(String nameOfShip);

	/**
	 * Returns the flag state of ship of this temp plant quarantine.
	 *
	 * @return the flag state of ship of this temp plant quarantine
	 */
	@AutoEscape
	public String getFlagStateOfShip();

	/**
	 * Sets the flag state of ship of this temp plant quarantine.
	 *
	 * @param flagStateOfShip the flag state of ship of this temp plant quarantine
	 */
	public void setFlagStateOfShip(String flagStateOfShip);

	/**
	 * Returns the name of master of this temp plant quarantine.
	 *
	 * @return the name of master of this temp plant quarantine
	 */
	@AutoEscape
	public String getNameOfMaster();

	/**
	 * Sets the name of master of this temp plant quarantine.
	 *
	 * @param nameOfMaster the name of master of this temp plant quarantine
	 */
	public void setNameOfMaster(String nameOfMaster);

	/**
	 * Returns the doctor name of this temp plant quarantine.
	 *
	 * @return the doctor name of this temp plant quarantine
	 */
	@AutoEscape
	public String getDoctorName();

	/**
	 * Sets the doctor name of this temp plant quarantine.
	 *
	 * @param doctorName the doctor name of this temp plant quarantine
	 */
	public void setDoctorName(String doctorName);

	/**
	 * Returns the number of crew of this temp plant quarantine.
	 *
	 * @return the number of crew of this temp plant quarantine
	 */
	public int getNumberOfCrew();

	/**
	 * Sets the number of crew of this temp plant quarantine.
	 *
	 * @param numberOfCrew the number of crew of this temp plant quarantine
	 */
	public void setNumberOfCrew(int numberOfCrew);

	/**
	 * Returns the number of passengers of this temp plant quarantine.
	 *
	 * @return the number of passengers of this temp plant quarantine
	 */
	public int getNumberOfPassengers();

	/**
	 * Sets the number of passengers of this temp plant quarantine.
	 *
	 * @param numberOfPassengers the number of passengers of this temp plant quarantine
	 */
	public void setNumberOfPassengers(int numberOfPassengers);

	/**
	 * Returns the last port of call code of this temp plant quarantine.
	 *
	 * @return the last port of call code of this temp plant quarantine
	 */
	@AutoEscape
	public String getLastPortOfCallCode();

	/**
	 * Sets the last port of call code of this temp plant quarantine.
	 *
	 * @param lastPortOfCallCode the last port of call code of this temp plant quarantine
	 */
	public void setLastPortOfCallCode(String lastPortOfCallCode);

	/**
	 * Returns the next port of call code of this temp plant quarantine.
	 *
	 * @return the next port of call code of this temp plant quarantine
	 */
	@AutoEscape
	public String getNextPortOfCallCode();

	/**
	 * Sets the next port of call code of this temp plant quarantine.
	 *
	 * @param nextPortOfCallCode the next port of call code of this temp plant quarantine
	 */
	public void setNextPortOfCallCode(String nextPortOfCallCode);

	/**
	 * Returns the first port of loading code of this temp plant quarantine.
	 *
	 * @return the first port of loading code of this temp plant quarantine
	 */
	@AutoEscape
	public String getFirstPortOfLoadingCode();

	/**
	 * Sets the first port of loading code of this temp plant quarantine.
	 *
	 * @param firstPortOfLoadingCode the first port of loading code of this temp plant quarantine
	 */
	public void setFirstPortOfLoadingCode(String firstPortOfLoadingCode);

	/**
	 * Returns the date ofdeparture of this temp plant quarantine.
	 *
	 * @return the date ofdeparture of this temp plant quarantine
	 */
	public Date getDateOfdeparture();

	/**
	 * Sets the date ofdeparture of this temp plant quarantine.
	 *
	 * @param dateOfdeparture the date ofdeparture of this temp plant quarantine
	 */
	public void setDateOfdeparture(Date dateOfdeparture);

	/**
	 * Returns the plant name first of this temp plant quarantine.
	 *
	 * @return the plant name first of this temp plant quarantine
	 */
	@AutoEscape
	public String getPlantNameFirst();

	/**
	 * Sets the plant name first of this temp plant quarantine.
	 *
	 * @param plantNameFirst the plant name first of this temp plant quarantine
	 */
	public void setPlantNameFirst(String plantNameFirst);

	/**
	 * Returns the plant name between of this temp plant quarantine.
	 *
	 * @return the plant name between of this temp plant quarantine
	 */
	@AutoEscape
	public String getPlantNameBetween();

	/**
	 * Sets the plant name between of this temp plant quarantine.
	 *
	 * @param plantNameBetween the plant name between of this temp plant quarantine
	 */
	public void setPlantNameBetween(String plantNameBetween);

	/**
	 * Returns the plant name this of this temp plant quarantine.
	 *
	 * @return the plant name this of this temp plant quarantine
	 */
	@AutoEscape
	public String getPlantNameThis();

	/**
	 * Sets the plant name this of this temp plant quarantine.
	 *
	 * @param plantNameThis the plant name this of this temp plant quarantine
	 */
	public void setPlantNameThis(String plantNameThis);

	/**
	 * Returns the sign place of this temp plant quarantine.
	 *
	 * @return the sign place of this temp plant quarantine
	 */
	@AutoEscape
	public String getSignPlace();

	/**
	 * Sets the sign place of this temp plant quarantine.
	 *
	 * @param signPlace the sign place of this temp plant quarantine
	 */
	public void setSignPlace(String signPlace);

	/**
	 * Returns the sign date of this temp plant quarantine.
	 *
	 * @return the sign date of this temp plant quarantine
	 */
	public Date getSignDate();

	/**
	 * Sets the sign date of this temp plant quarantine.
	 *
	 * @param signDate the sign date of this temp plant quarantine
	 */
	public void setSignDate(Date signDate);

	/**
	 * Returns the master signed of this temp plant quarantine.
	 *
	 * @return the master signed of this temp plant quarantine
	 */
	public int getMasterSigned();

	/**
	 * Sets the master signed of this temp plant quarantine.
	 *
	 * @param masterSigned the master signed of this temp plant quarantine
	 */
	public void setMasterSigned(int masterSigned);

	/**
	 * Returns the master signed image of this temp plant quarantine.
	 *
	 * @return the master signed image of this temp plant quarantine
	 */
	public int getMasterSignedImage();

	/**
	 * Sets the master signed image of this temp plant quarantine.
	 *
	 * @param masterSignedImage the master signed image of this temp plant quarantine
	 */
	public void setMasterSignedImage(int masterSignedImage);

	/**
	 * Returns the attached file of this temp plant quarantine.
	 *
	 * @return the attached file of this temp plant quarantine
	 */
	public long getAttachedFile();

	/**
	 * Sets the attached file of this temp plant quarantine.
	 *
	 * @param attachedFile the attached file of this temp plant quarantine
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
	public int compareTo(TempPlantQuarantine tempPlantQuarantine);

	@Override
	public int hashCode();

	@Override
	public CacheModel<TempPlantQuarantine> toCacheModel();

	@Override
	public TempPlantQuarantine toEscapedModel();

	@Override
	public TempPlantQuarantine toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}