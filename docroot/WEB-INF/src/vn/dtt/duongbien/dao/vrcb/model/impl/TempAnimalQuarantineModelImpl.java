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

import vn.dtt.duongbien.dao.vrcb.model.TempAnimalQuarantine;
import vn.dtt.duongbien.dao.vrcb.model.TempAnimalQuarantineModel;
import vn.dtt.duongbien.dao.vrcb.model.TempAnimalQuarantineSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the TempAnimalQuarantine service. Represents a row in the &quot;TEMP_ANIMAL_QUARANTINE&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbien.dao.vrcb.model.TempAnimalQuarantineModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TempAnimalQuarantineImpl}.
 * </p>
 *
 * @author longdm
 * @see TempAnimalQuarantineImpl
 * @see vn.dtt.duongbien.dao.vrcb.model.TempAnimalQuarantine
 * @see vn.dtt.duongbien.dao.vrcb.model.TempAnimalQuarantineModel
 * @generated
 */
@JSON(strict = true)
public class TempAnimalQuarantineModelImpl extends BaseModelImpl<TempAnimalQuarantine>
	implements TempAnimalQuarantineModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a temp animal quarantine model instance should use the {@link vn.dtt.duongbien.dao.vrcb.model.TempAnimalQuarantine} interface instead.
	 */
	public static final String TABLE_NAME = "TEMP_ANIMAL_QUARANTINE";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.BIGINT },
			{ "RequestCode", Types.VARCHAR },
			{ "RequestState", Types.INTEGER },
			{ "DocumentName", Types.BIGINT },
			{ "DocumentYear", Types.INTEGER },
			{ "UserCreated", Types.VARCHAR },
			{ "NameOfShip", Types.VARCHAR },
			{ "FlagStateOfShip", Types.VARCHAR },
			{ "NumberOfCrew", Types.INTEGER },
			{ "NumberOfPassengers", Types.INTEGER },
			{ "LastPortOfCallCode", Types.VARCHAR },
			{ "NextPortOfCallCode", Types.VARCHAR },
			{ "AnimalNameFirst", Types.VARCHAR },
			{ "AnimalNameBetween", Types.VARCHAR },
			{ "AnimalNameThis", Types.VARCHAR },
			{ "NameOfMaster", Types.VARCHAR },
			{ "SignPlace", Types.VARCHAR },
			{ "SignDate", Types.TIMESTAMP },
			{ "MasterSigned", Types.INTEGER },
			{ "MasterSignedImage", Types.INTEGER },
			{ "AttachedFile", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table TEMP_ANIMAL_QUARANTINE (ID LONG not null primary key,RequestCode VARCHAR(75) null,RequestState INTEGER,DocumentName LONG,DocumentYear INTEGER,UserCreated VARCHAR(75) null,NameOfShip VARCHAR(75) null,FlagStateOfShip VARCHAR(75) null,NumberOfCrew INTEGER,NumberOfPassengers INTEGER,LastPortOfCallCode VARCHAR(75) null,NextPortOfCallCode VARCHAR(75) null,AnimalNameFirst VARCHAR(75) null,AnimalNameBetween VARCHAR(75) null,AnimalNameThis VARCHAR(75) null,NameOfMaster VARCHAR(75) null,SignPlace VARCHAR(75) null,SignDate DATE null,MasterSigned INTEGER,MasterSignedImage INTEGER,AttachedFile LONG)";
	public static final String TABLE_SQL_DROP = "drop table TEMP_ANIMAL_QUARANTINE";
	public static final String ORDER_BY_JPQL = " ORDER BY tempAnimalQuarantine.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY TEMP_ANIMAL_QUARANTINE.ID ASC";
	public static final String DATA_SOURCE = "vaoracangbienDataSource";
	public static final String SESSION_FACTORY = "ravaocangbienSessionFactory";
	public static final String TX_MANAGER = "ravaocangbienTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.TempAnimalQuarantine"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.TempAnimalQuarantine"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.duongbien.dao.vrcb.model.TempAnimalQuarantine"),
			true);
	public static long DOCUMENTNAME_COLUMN_BITMASK = 1L;
	public static long DOCUMENTYEAR_COLUMN_BITMASK = 2L;
	public static long REQUESTCODE_COLUMN_BITMASK = 4L;
	public static long REQUESTSTATE_COLUMN_BITMASK = 8L;
	public static long ID_COLUMN_BITMASK = 16L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static TempAnimalQuarantine toModel(
		TempAnimalQuarantineSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		TempAnimalQuarantine model = new TempAnimalQuarantineImpl();

		model.setId(soapModel.getId());
		model.setRequestCode(soapModel.getRequestCode());
		model.setRequestState(soapModel.getRequestState());
		model.setDocumentName(soapModel.getDocumentName());
		model.setDocumentYear(soapModel.getDocumentYear());
		model.setUserCreated(soapModel.getUserCreated());
		model.setNameOfShip(soapModel.getNameOfShip());
		model.setFlagStateOfShip(soapModel.getFlagStateOfShip());
		model.setNumberOfCrew(soapModel.getNumberOfCrew());
		model.setNumberOfPassengers(soapModel.getNumberOfPassengers());
		model.setLastPortOfCallCode(soapModel.getLastPortOfCallCode());
		model.setNextPortOfCallCode(soapModel.getNextPortOfCallCode());
		model.setAnimalNameFirst(soapModel.getAnimalNameFirst());
		model.setAnimalNameBetween(soapModel.getAnimalNameBetween());
		model.setAnimalNameThis(soapModel.getAnimalNameThis());
		model.setNameOfMaster(soapModel.getNameOfMaster());
		model.setSignPlace(soapModel.getSignPlace());
		model.setSignDate(soapModel.getSignDate());
		model.setMasterSigned(soapModel.getMasterSigned());
		model.setMasterSignedImage(soapModel.getMasterSignedImage());
		model.setAttachedFile(soapModel.getAttachedFile());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<TempAnimalQuarantine> toModels(
		TempAnimalQuarantineSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<TempAnimalQuarantine> models = new ArrayList<TempAnimalQuarantine>(soapModels.length);

		for (TempAnimalQuarantineSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbien.dao.vrcb.model.TempAnimalQuarantine"));

	public TempAnimalQuarantineModelImpl() {
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
	public int getRequestState() {
		return _requestState;
	}

	@Override
	public void setRequestState(int requestState) {
		_columnBitmask |= REQUESTSTATE_COLUMN_BITMASK;

		if (!_setOriginalRequestState) {
			_setOriginalRequestState = true;

			_originalRequestState = _requestState;
		}

		_requestState = requestState;
	}

	public int getOriginalRequestState() {
		return _originalRequestState;
	}

	@JSON
	@Override
	public long getDocumentName() {
		return _documentName;
	}

	@Override
	public void setDocumentName(long documentName) {
		_columnBitmask |= DOCUMENTNAME_COLUMN_BITMASK;

		if (!_setOriginalDocumentName) {
			_setOriginalDocumentName = true;

			_originalDocumentName = _documentName;
		}

		_documentName = documentName;
	}

	public long getOriginalDocumentName() {
		return _originalDocumentName;
	}

	@JSON
	@Override
	public int getDocumentYear() {
		return _documentYear;
	}

	@Override
	public void setDocumentYear(int documentYear) {
		_columnBitmask |= DOCUMENTYEAR_COLUMN_BITMASK;

		if (!_setOriginalDocumentYear) {
			_setOriginalDocumentYear = true;

			_originalDocumentYear = _documentYear;
		}

		_documentYear = documentYear;
	}

	public int getOriginalDocumentYear() {
		return _originalDocumentYear;
	}

	@JSON
	@Override
	public String getUserCreated() {
		if (_userCreated == null) {
			return StringPool.BLANK;
		}
		else {
			return _userCreated;
		}
	}

	@Override
	public void setUserCreated(String userCreated) {
		_userCreated = userCreated;
	}

	@JSON
	@Override
	public String getNameOfShip() {
		if (_nameOfShip == null) {
			return StringPool.BLANK;
		}
		else {
			return _nameOfShip;
		}
	}

	@Override
	public void setNameOfShip(String nameOfShip) {
		_nameOfShip = nameOfShip;
	}

	@JSON
	@Override
	public String getFlagStateOfShip() {
		if (_flagStateOfShip == null) {
			return StringPool.BLANK;
		}
		else {
			return _flagStateOfShip;
		}
	}

	@Override
	public void setFlagStateOfShip(String flagStateOfShip) {
		_flagStateOfShip = flagStateOfShip;
	}

	@JSON
	@Override
	public int getNumberOfCrew() {
		return _numberOfCrew;
	}

	@Override
	public void setNumberOfCrew(int numberOfCrew) {
		_numberOfCrew = numberOfCrew;
	}

	@JSON
	@Override
	public int getNumberOfPassengers() {
		return _numberOfPassengers;
	}

	@Override
	public void setNumberOfPassengers(int numberOfPassengers) {
		_numberOfPassengers = numberOfPassengers;
	}

	@JSON
	@Override
	public String getLastPortOfCallCode() {
		if (_lastPortOfCallCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _lastPortOfCallCode;
		}
	}

	@Override
	public void setLastPortOfCallCode(String lastPortOfCallCode) {
		_lastPortOfCallCode = lastPortOfCallCode;
	}

	@JSON
	@Override
	public String getNextPortOfCallCode() {
		if (_nextPortOfCallCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _nextPortOfCallCode;
		}
	}

	@Override
	public void setNextPortOfCallCode(String nextPortOfCallCode) {
		_nextPortOfCallCode = nextPortOfCallCode;
	}

	@JSON
	@Override
	public String getAnimalNameFirst() {
		if (_animalNameFirst == null) {
			return StringPool.BLANK;
		}
		else {
			return _animalNameFirst;
		}
	}

	@Override
	public void setAnimalNameFirst(String animalNameFirst) {
		_animalNameFirst = animalNameFirst;
	}

	@JSON
	@Override
	public String getAnimalNameBetween() {
		if (_animalNameBetween == null) {
			return StringPool.BLANK;
		}
		else {
			return _animalNameBetween;
		}
	}

	@Override
	public void setAnimalNameBetween(String animalNameBetween) {
		_animalNameBetween = animalNameBetween;
	}

	@JSON
	@Override
	public String getAnimalNameThis() {
		if (_animalNameThis == null) {
			return StringPool.BLANK;
		}
		else {
			return _animalNameThis;
		}
	}

	@Override
	public void setAnimalNameThis(String animalNameThis) {
		_animalNameThis = animalNameThis;
	}

	@JSON
	@Override
	public String getNameOfMaster() {
		if (_nameOfMaster == null) {
			return StringPool.BLANK;
		}
		else {
			return _nameOfMaster;
		}
	}

	@Override
	public void setNameOfMaster(String nameOfMaster) {
		_nameOfMaster = nameOfMaster;
	}

	@JSON
	@Override
	public String getSignPlace() {
		if (_signPlace == null) {
			return StringPool.BLANK;
		}
		else {
			return _signPlace;
		}
	}

	@Override
	public void setSignPlace(String signPlace) {
		_signPlace = signPlace;
	}

	@JSON
	@Override
	public Date getSignDate() {
		return _signDate;
	}

	@Override
	public void setSignDate(Date signDate) {
		_signDate = signDate;
	}

	@JSON
	@Override
	public int getMasterSigned() {
		return _masterSigned;
	}

	@Override
	public void setMasterSigned(int masterSigned) {
		_masterSigned = masterSigned;
	}

	@JSON
	@Override
	public int getMasterSignedImage() {
		return _masterSignedImage;
	}

	@Override
	public void setMasterSignedImage(int masterSignedImage) {
		_masterSignedImage = masterSignedImage;
	}

	@JSON
	@Override
	public long getAttachedFile() {
		return _attachedFile;
	}

	@Override
	public void setAttachedFile(long attachedFile) {
		_attachedFile = attachedFile;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			TempAnimalQuarantine.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TempAnimalQuarantine toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (TempAnimalQuarantine)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TempAnimalQuarantineImpl tempAnimalQuarantineImpl = new TempAnimalQuarantineImpl();

		tempAnimalQuarantineImpl.setId(getId());
		tempAnimalQuarantineImpl.setRequestCode(getRequestCode());
		tempAnimalQuarantineImpl.setRequestState(getRequestState());
		tempAnimalQuarantineImpl.setDocumentName(getDocumentName());
		tempAnimalQuarantineImpl.setDocumentYear(getDocumentYear());
		tempAnimalQuarantineImpl.setUserCreated(getUserCreated());
		tempAnimalQuarantineImpl.setNameOfShip(getNameOfShip());
		tempAnimalQuarantineImpl.setFlagStateOfShip(getFlagStateOfShip());
		tempAnimalQuarantineImpl.setNumberOfCrew(getNumberOfCrew());
		tempAnimalQuarantineImpl.setNumberOfPassengers(getNumberOfPassengers());
		tempAnimalQuarantineImpl.setLastPortOfCallCode(getLastPortOfCallCode());
		tempAnimalQuarantineImpl.setNextPortOfCallCode(getNextPortOfCallCode());
		tempAnimalQuarantineImpl.setAnimalNameFirst(getAnimalNameFirst());
		tempAnimalQuarantineImpl.setAnimalNameBetween(getAnimalNameBetween());
		tempAnimalQuarantineImpl.setAnimalNameThis(getAnimalNameThis());
		tempAnimalQuarantineImpl.setNameOfMaster(getNameOfMaster());
		tempAnimalQuarantineImpl.setSignPlace(getSignPlace());
		tempAnimalQuarantineImpl.setSignDate(getSignDate());
		tempAnimalQuarantineImpl.setMasterSigned(getMasterSigned());
		tempAnimalQuarantineImpl.setMasterSignedImage(getMasterSignedImage());
		tempAnimalQuarantineImpl.setAttachedFile(getAttachedFile());

		tempAnimalQuarantineImpl.resetOriginalValues();

		return tempAnimalQuarantineImpl;
	}

	@Override
	public int compareTo(TempAnimalQuarantine tempAnimalQuarantine) {
		int value = 0;

		if (getId() < tempAnimalQuarantine.getId()) {
			value = -1;
		}
		else if (getId() > tempAnimalQuarantine.getId()) {
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

		if (!(obj instanceof TempAnimalQuarantine)) {
			return false;
		}

		TempAnimalQuarantine tempAnimalQuarantine = (TempAnimalQuarantine)obj;

		long primaryKey = tempAnimalQuarantine.getPrimaryKey();

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
		TempAnimalQuarantineModelImpl tempAnimalQuarantineModelImpl = this;

		tempAnimalQuarantineModelImpl._originalRequestCode = tempAnimalQuarantineModelImpl._requestCode;

		tempAnimalQuarantineModelImpl._originalRequestState = tempAnimalQuarantineModelImpl._requestState;

		tempAnimalQuarantineModelImpl._setOriginalRequestState = false;

		tempAnimalQuarantineModelImpl._originalDocumentName = tempAnimalQuarantineModelImpl._documentName;

		tempAnimalQuarantineModelImpl._setOriginalDocumentName = false;

		tempAnimalQuarantineModelImpl._originalDocumentYear = tempAnimalQuarantineModelImpl._documentYear;

		tempAnimalQuarantineModelImpl._setOriginalDocumentYear = false;

		tempAnimalQuarantineModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<TempAnimalQuarantine> toCacheModel() {
		TempAnimalQuarantineCacheModel tempAnimalQuarantineCacheModel = new TempAnimalQuarantineCacheModel();

		tempAnimalQuarantineCacheModel.id = getId();

		tempAnimalQuarantineCacheModel.requestCode = getRequestCode();

		String requestCode = tempAnimalQuarantineCacheModel.requestCode;

		if ((requestCode != null) && (requestCode.length() == 0)) {
			tempAnimalQuarantineCacheModel.requestCode = null;
		}

		tempAnimalQuarantineCacheModel.requestState = getRequestState();

		tempAnimalQuarantineCacheModel.documentName = getDocumentName();

		tempAnimalQuarantineCacheModel.documentYear = getDocumentYear();

		tempAnimalQuarantineCacheModel.userCreated = getUserCreated();

		String userCreated = tempAnimalQuarantineCacheModel.userCreated;

		if ((userCreated != null) && (userCreated.length() == 0)) {
			tempAnimalQuarantineCacheModel.userCreated = null;
		}

		tempAnimalQuarantineCacheModel.nameOfShip = getNameOfShip();

		String nameOfShip = tempAnimalQuarantineCacheModel.nameOfShip;

		if ((nameOfShip != null) && (nameOfShip.length() == 0)) {
			tempAnimalQuarantineCacheModel.nameOfShip = null;
		}

		tempAnimalQuarantineCacheModel.flagStateOfShip = getFlagStateOfShip();

		String flagStateOfShip = tempAnimalQuarantineCacheModel.flagStateOfShip;

		if ((flagStateOfShip != null) && (flagStateOfShip.length() == 0)) {
			tempAnimalQuarantineCacheModel.flagStateOfShip = null;
		}

		tempAnimalQuarantineCacheModel.numberOfCrew = getNumberOfCrew();

		tempAnimalQuarantineCacheModel.numberOfPassengers = getNumberOfPassengers();

		tempAnimalQuarantineCacheModel.lastPortOfCallCode = getLastPortOfCallCode();

		String lastPortOfCallCode = tempAnimalQuarantineCacheModel.lastPortOfCallCode;

		if ((lastPortOfCallCode != null) && (lastPortOfCallCode.length() == 0)) {
			tempAnimalQuarantineCacheModel.lastPortOfCallCode = null;
		}

		tempAnimalQuarantineCacheModel.nextPortOfCallCode = getNextPortOfCallCode();

		String nextPortOfCallCode = tempAnimalQuarantineCacheModel.nextPortOfCallCode;

		if ((nextPortOfCallCode != null) && (nextPortOfCallCode.length() == 0)) {
			tempAnimalQuarantineCacheModel.nextPortOfCallCode = null;
		}

		tempAnimalQuarantineCacheModel.animalNameFirst = getAnimalNameFirst();

		String animalNameFirst = tempAnimalQuarantineCacheModel.animalNameFirst;

		if ((animalNameFirst != null) && (animalNameFirst.length() == 0)) {
			tempAnimalQuarantineCacheModel.animalNameFirst = null;
		}

		tempAnimalQuarantineCacheModel.animalNameBetween = getAnimalNameBetween();

		String animalNameBetween = tempAnimalQuarantineCacheModel.animalNameBetween;

		if ((animalNameBetween != null) && (animalNameBetween.length() == 0)) {
			tempAnimalQuarantineCacheModel.animalNameBetween = null;
		}

		tempAnimalQuarantineCacheModel.animalNameThis = getAnimalNameThis();

		String animalNameThis = tempAnimalQuarantineCacheModel.animalNameThis;

		if ((animalNameThis != null) && (animalNameThis.length() == 0)) {
			tempAnimalQuarantineCacheModel.animalNameThis = null;
		}

		tempAnimalQuarantineCacheModel.nameOfMaster = getNameOfMaster();

		String nameOfMaster = tempAnimalQuarantineCacheModel.nameOfMaster;

		if ((nameOfMaster != null) && (nameOfMaster.length() == 0)) {
			tempAnimalQuarantineCacheModel.nameOfMaster = null;
		}

		tempAnimalQuarantineCacheModel.signPlace = getSignPlace();

		String signPlace = tempAnimalQuarantineCacheModel.signPlace;

		if ((signPlace != null) && (signPlace.length() == 0)) {
			tempAnimalQuarantineCacheModel.signPlace = null;
		}

		Date signDate = getSignDate();

		if (signDate != null) {
			tempAnimalQuarantineCacheModel.signDate = signDate.getTime();
		}
		else {
			tempAnimalQuarantineCacheModel.signDate = Long.MIN_VALUE;
		}

		tempAnimalQuarantineCacheModel.masterSigned = getMasterSigned();

		tempAnimalQuarantineCacheModel.masterSignedImage = getMasterSignedImage();

		tempAnimalQuarantineCacheModel.attachedFile = getAttachedFile();

		return tempAnimalQuarantineCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", requestCode=");
		sb.append(getRequestCode());
		sb.append(", requestState=");
		sb.append(getRequestState());
		sb.append(", documentName=");
		sb.append(getDocumentName());
		sb.append(", documentYear=");
		sb.append(getDocumentYear());
		sb.append(", userCreated=");
		sb.append(getUserCreated());
		sb.append(", nameOfShip=");
		sb.append(getNameOfShip());
		sb.append(", flagStateOfShip=");
		sb.append(getFlagStateOfShip());
		sb.append(", numberOfCrew=");
		sb.append(getNumberOfCrew());
		sb.append(", numberOfPassengers=");
		sb.append(getNumberOfPassengers());
		sb.append(", lastPortOfCallCode=");
		sb.append(getLastPortOfCallCode());
		sb.append(", nextPortOfCallCode=");
		sb.append(getNextPortOfCallCode());
		sb.append(", animalNameFirst=");
		sb.append(getAnimalNameFirst());
		sb.append(", animalNameBetween=");
		sb.append(getAnimalNameBetween());
		sb.append(", animalNameThis=");
		sb.append(getAnimalNameThis());
		sb.append(", nameOfMaster=");
		sb.append(getNameOfMaster());
		sb.append(", signPlace=");
		sb.append(getSignPlace());
		sb.append(", signDate=");
		sb.append(getSignDate());
		sb.append(", masterSigned=");
		sb.append(getMasterSigned());
		sb.append(", masterSignedImage=");
		sb.append(getMasterSignedImage());
		sb.append(", attachedFile=");
		sb.append(getAttachedFile());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(67);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbien.dao.vrcb.model.TempAnimalQuarantine");
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
			"<column><column-name>requestState</column-name><column-value><![CDATA[");
		sb.append(getRequestState());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentName</column-name><column-value><![CDATA[");
		sb.append(getDocumentName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentYear</column-name><column-value><![CDATA[");
		sb.append(getDocumentYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userCreated</column-name><column-value><![CDATA[");
		sb.append(getUserCreated());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameOfShip</column-name><column-value><![CDATA[");
		sb.append(getNameOfShip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>flagStateOfShip</column-name><column-value><![CDATA[");
		sb.append(getFlagStateOfShip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>numberOfCrew</column-name><column-value><![CDATA[");
		sb.append(getNumberOfCrew());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>numberOfPassengers</column-name><column-value><![CDATA[");
		sb.append(getNumberOfPassengers());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lastPortOfCallCode</column-name><column-value><![CDATA[");
		sb.append(getLastPortOfCallCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nextPortOfCallCode</column-name><column-value><![CDATA[");
		sb.append(getNextPortOfCallCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>animalNameFirst</column-name><column-value><![CDATA[");
		sb.append(getAnimalNameFirst());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>animalNameBetween</column-name><column-value><![CDATA[");
		sb.append(getAnimalNameBetween());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>animalNameThis</column-name><column-value><![CDATA[");
		sb.append(getAnimalNameThis());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameOfMaster</column-name><column-value><![CDATA[");
		sb.append(getNameOfMaster());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signPlace</column-name><column-value><![CDATA[");
		sb.append(getSignPlace());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signDate</column-name><column-value><![CDATA[");
		sb.append(getSignDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>masterSigned</column-name><column-value><![CDATA[");
		sb.append(getMasterSigned());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>masterSignedImage</column-name><column-value><![CDATA[");
		sb.append(getMasterSignedImage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>attachedFile</column-name><column-value><![CDATA[");
		sb.append(getAttachedFile());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = TempAnimalQuarantine.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			TempAnimalQuarantine.class
		};
	private long _id;
	private String _requestCode;
	private String _originalRequestCode;
	private int _requestState;
	private int _originalRequestState;
	private boolean _setOriginalRequestState;
	private long _documentName;
	private long _originalDocumentName;
	private boolean _setOriginalDocumentName;
	private int _documentYear;
	private int _originalDocumentYear;
	private boolean _setOriginalDocumentYear;
	private String _userCreated;
	private String _nameOfShip;
	private String _flagStateOfShip;
	private int _numberOfCrew;
	private int _numberOfPassengers;
	private String _lastPortOfCallCode;
	private String _nextPortOfCallCode;
	private String _animalNameFirst;
	private String _animalNameBetween;
	private String _animalNameThis;
	private String _nameOfMaster;
	private String _signPlace;
	private Date _signDate;
	private int _masterSigned;
	private int _masterSignedImage;
	private long _attachedFile;
	private long _columnBitmask;
	private TempAnimalQuarantine _escapedModel;
}