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

import vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine;
import vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantineModel;
import vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantineSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the TempDeclarationForAnimalQuarantine service. Represents a row in the &quot;temp_animal_quarantine&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantineModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TempDeclarationForAnimalQuarantineImpl}.
 * </p>
 *
 * @author longdm
 * @see TempDeclarationForAnimalQuarantineImpl
 * @see vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine
 * @see vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantineModel
 * @generated
 */
@JSON(strict = true)
public class TempDeclarationForAnimalQuarantineModelImpl extends BaseModelImpl<TempDeclarationForAnimalQuarantine>
	implements TempDeclarationForAnimalQuarantineModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a temp declaration for animal quarantine model instance should use the {@link vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine} interface instead.
	 */
	public static final String TABLE_NAME = "temp_animal_quarantine";
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
	public static final String TABLE_SQL_CREATE = "create table temp_animal_quarantine (ID LONG not null primary key,RequestCode VARCHAR(75) null,RequestState INTEGER,DocumentName LONG,DocumentYear INTEGER,UserCreated VARCHAR(75) null,NameOfShip VARCHAR(75) null,FlagStateOfShip VARCHAR(75) null,NumberOfCrew INTEGER,NumberOfPassengers INTEGER,LastPortOfCallCode VARCHAR(75) null,NextPortOfCallCode VARCHAR(75) null,AnimalNameFirst VARCHAR(75) null,AnimalNameBetween VARCHAR(75) null,AnimalNameThis VARCHAR(75) null,NameOfMaster VARCHAR(75) null,SignPlace VARCHAR(75) null,SignDate DATE null,MasterSigned INTEGER,MasterSignedImage INTEGER,AttachedFile LONG)";
	public static final String TABLE_SQL_DROP = "drop table temp_animal_quarantine";
	public static final String ORDER_BY_JPQL = " ORDER BY tempDeclarationForAnimalQuarantine.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY temp_animal_quarantine.ID ASC";
	public static final String DATA_SOURCE = "vaoracangbienDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine"),
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
	public static TempDeclarationForAnimalQuarantine toModel(
		TempDeclarationForAnimalQuarantineSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		TempDeclarationForAnimalQuarantine model = new TempDeclarationForAnimalQuarantineImpl();

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
	public static List<TempDeclarationForAnimalQuarantine> toModels(
		TempDeclarationForAnimalQuarantineSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<TempDeclarationForAnimalQuarantine> models = new ArrayList<TempDeclarationForAnimalQuarantine>(soapModels.length);

		for (TempDeclarationForAnimalQuarantineSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine"));

	public TempDeclarationForAnimalQuarantineModelImpl() {
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
			TempDeclarationForAnimalQuarantine.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TempDeclarationForAnimalQuarantine toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (TempDeclarationForAnimalQuarantine)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TempDeclarationForAnimalQuarantineImpl tempDeclarationForAnimalQuarantineImpl =
			new TempDeclarationForAnimalQuarantineImpl();

		tempDeclarationForAnimalQuarantineImpl.setId(getId());
		tempDeclarationForAnimalQuarantineImpl.setRequestCode(getRequestCode());
		tempDeclarationForAnimalQuarantineImpl.setRequestState(getRequestState());
		tempDeclarationForAnimalQuarantineImpl.setDocumentName(getDocumentName());
		tempDeclarationForAnimalQuarantineImpl.setDocumentYear(getDocumentYear());
		tempDeclarationForAnimalQuarantineImpl.setUserCreated(getUserCreated());
		tempDeclarationForAnimalQuarantineImpl.setNameOfShip(getNameOfShip());
		tempDeclarationForAnimalQuarantineImpl.setFlagStateOfShip(getFlagStateOfShip());
		tempDeclarationForAnimalQuarantineImpl.setNumberOfCrew(getNumberOfCrew());
		tempDeclarationForAnimalQuarantineImpl.setNumberOfPassengers(getNumberOfPassengers());
		tempDeclarationForAnimalQuarantineImpl.setLastPortOfCallCode(getLastPortOfCallCode());
		tempDeclarationForAnimalQuarantineImpl.setNextPortOfCallCode(getNextPortOfCallCode());
		tempDeclarationForAnimalQuarantineImpl.setAnimalNameFirst(getAnimalNameFirst());
		tempDeclarationForAnimalQuarantineImpl.setAnimalNameBetween(getAnimalNameBetween());
		tempDeclarationForAnimalQuarantineImpl.setAnimalNameThis(getAnimalNameThis());
		tempDeclarationForAnimalQuarantineImpl.setNameOfMaster(getNameOfMaster());
		tempDeclarationForAnimalQuarantineImpl.setSignPlace(getSignPlace());
		tempDeclarationForAnimalQuarantineImpl.setSignDate(getSignDate());
		tempDeclarationForAnimalQuarantineImpl.setMasterSigned(getMasterSigned());
		tempDeclarationForAnimalQuarantineImpl.setMasterSignedImage(getMasterSignedImage());
		tempDeclarationForAnimalQuarantineImpl.setAttachedFile(getAttachedFile());

		tempDeclarationForAnimalQuarantineImpl.resetOriginalValues();

		return tempDeclarationForAnimalQuarantineImpl;
	}

	@Override
	public int compareTo(
		TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine) {
		int value = 0;

		if (getId() < tempDeclarationForAnimalQuarantine.getId()) {
			value = -1;
		}
		else if (getId() > tempDeclarationForAnimalQuarantine.getId()) {
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

		if (!(obj instanceof TempDeclarationForAnimalQuarantine)) {
			return false;
		}

		TempDeclarationForAnimalQuarantine tempDeclarationForAnimalQuarantine = (TempDeclarationForAnimalQuarantine)obj;

		long primaryKey = tempDeclarationForAnimalQuarantine.getPrimaryKey();

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
		TempDeclarationForAnimalQuarantineModelImpl tempDeclarationForAnimalQuarantineModelImpl =
			this;

		tempDeclarationForAnimalQuarantineModelImpl._originalRequestCode = tempDeclarationForAnimalQuarantineModelImpl._requestCode;

		tempDeclarationForAnimalQuarantineModelImpl._originalRequestState = tempDeclarationForAnimalQuarantineModelImpl._requestState;

		tempDeclarationForAnimalQuarantineModelImpl._setOriginalRequestState = false;

		tempDeclarationForAnimalQuarantineModelImpl._originalDocumentName = tempDeclarationForAnimalQuarantineModelImpl._documentName;

		tempDeclarationForAnimalQuarantineModelImpl._setOriginalDocumentName = false;

		tempDeclarationForAnimalQuarantineModelImpl._originalDocumentYear = tempDeclarationForAnimalQuarantineModelImpl._documentYear;

		tempDeclarationForAnimalQuarantineModelImpl._setOriginalDocumentYear = false;

		tempDeclarationForAnimalQuarantineModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<TempDeclarationForAnimalQuarantine> toCacheModel() {
		TempDeclarationForAnimalQuarantineCacheModel tempDeclarationForAnimalQuarantineCacheModel =
			new TempDeclarationForAnimalQuarantineCacheModel();

		tempDeclarationForAnimalQuarantineCacheModel.id = getId();

		tempDeclarationForAnimalQuarantineCacheModel.requestCode = getRequestCode();

		String requestCode = tempDeclarationForAnimalQuarantineCacheModel.requestCode;

		if ((requestCode != null) && (requestCode.length() == 0)) {
			tempDeclarationForAnimalQuarantineCacheModel.requestCode = null;
		}

		tempDeclarationForAnimalQuarantineCacheModel.requestState = getRequestState();

		tempDeclarationForAnimalQuarantineCacheModel.documentName = getDocumentName();

		tempDeclarationForAnimalQuarantineCacheModel.documentYear = getDocumentYear();

		tempDeclarationForAnimalQuarantineCacheModel.userCreated = getUserCreated();

		String userCreated = tempDeclarationForAnimalQuarantineCacheModel.userCreated;

		if ((userCreated != null) && (userCreated.length() == 0)) {
			tempDeclarationForAnimalQuarantineCacheModel.userCreated = null;
		}

		tempDeclarationForAnimalQuarantineCacheModel.nameOfShip = getNameOfShip();

		String nameOfShip = tempDeclarationForAnimalQuarantineCacheModel.nameOfShip;

		if ((nameOfShip != null) && (nameOfShip.length() == 0)) {
			tempDeclarationForAnimalQuarantineCacheModel.nameOfShip = null;
		}

		tempDeclarationForAnimalQuarantineCacheModel.flagStateOfShip = getFlagStateOfShip();

		String flagStateOfShip = tempDeclarationForAnimalQuarantineCacheModel.flagStateOfShip;

		if ((flagStateOfShip != null) && (flagStateOfShip.length() == 0)) {
			tempDeclarationForAnimalQuarantineCacheModel.flagStateOfShip = null;
		}

		tempDeclarationForAnimalQuarantineCacheModel.numberOfCrew = getNumberOfCrew();

		tempDeclarationForAnimalQuarantineCacheModel.numberOfPassengers = getNumberOfPassengers();

		tempDeclarationForAnimalQuarantineCacheModel.lastPortOfCallCode = getLastPortOfCallCode();

		String lastPortOfCallCode = tempDeclarationForAnimalQuarantineCacheModel.lastPortOfCallCode;

		if ((lastPortOfCallCode != null) && (lastPortOfCallCode.length() == 0)) {
			tempDeclarationForAnimalQuarantineCacheModel.lastPortOfCallCode = null;
		}

		tempDeclarationForAnimalQuarantineCacheModel.nextPortOfCallCode = getNextPortOfCallCode();

		String nextPortOfCallCode = tempDeclarationForAnimalQuarantineCacheModel.nextPortOfCallCode;

		if ((nextPortOfCallCode != null) && (nextPortOfCallCode.length() == 0)) {
			tempDeclarationForAnimalQuarantineCacheModel.nextPortOfCallCode = null;
		}

		tempDeclarationForAnimalQuarantineCacheModel.animalNameFirst = getAnimalNameFirst();

		String animalNameFirst = tempDeclarationForAnimalQuarantineCacheModel.animalNameFirst;

		if ((animalNameFirst != null) && (animalNameFirst.length() == 0)) {
			tempDeclarationForAnimalQuarantineCacheModel.animalNameFirst = null;
		}

		tempDeclarationForAnimalQuarantineCacheModel.animalNameBetween = getAnimalNameBetween();

		String animalNameBetween = tempDeclarationForAnimalQuarantineCacheModel.animalNameBetween;

		if ((animalNameBetween != null) && (animalNameBetween.length() == 0)) {
			tempDeclarationForAnimalQuarantineCacheModel.animalNameBetween = null;
		}

		tempDeclarationForAnimalQuarantineCacheModel.animalNameThis = getAnimalNameThis();

		String animalNameThis = tempDeclarationForAnimalQuarantineCacheModel.animalNameThis;

		if ((animalNameThis != null) && (animalNameThis.length() == 0)) {
			tempDeclarationForAnimalQuarantineCacheModel.animalNameThis = null;
		}

		tempDeclarationForAnimalQuarantineCacheModel.nameOfMaster = getNameOfMaster();

		String nameOfMaster = tempDeclarationForAnimalQuarantineCacheModel.nameOfMaster;

		if ((nameOfMaster != null) && (nameOfMaster.length() == 0)) {
			tempDeclarationForAnimalQuarantineCacheModel.nameOfMaster = null;
		}

		tempDeclarationForAnimalQuarantineCacheModel.signPlace = getSignPlace();

		String signPlace = tempDeclarationForAnimalQuarantineCacheModel.signPlace;

		if ((signPlace != null) && (signPlace.length() == 0)) {
			tempDeclarationForAnimalQuarantineCacheModel.signPlace = null;
		}

		Date signDate = getSignDate();

		if (signDate != null) {
			tempDeclarationForAnimalQuarantineCacheModel.signDate = signDate.getTime();
		}
		else {
			tempDeclarationForAnimalQuarantineCacheModel.signDate = Long.MIN_VALUE;
		}

		tempDeclarationForAnimalQuarantineCacheModel.masterSigned = getMasterSigned();

		tempDeclarationForAnimalQuarantineCacheModel.masterSignedImage = getMasterSignedImage();

		tempDeclarationForAnimalQuarantineCacheModel.attachedFile = getAttachedFile();

		return tempDeclarationForAnimalQuarantineCacheModel;
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
		sb.append(
			"vn.dtt.duongbien.dao.vrcb.model.TempDeclarationForAnimalQuarantine");
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

	private static ClassLoader _classLoader = TempDeclarationForAnimalQuarantine.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			TempDeclarationForAnimalQuarantine.class
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
	private TempDeclarationForAnimalQuarantine _escapedModel;
}