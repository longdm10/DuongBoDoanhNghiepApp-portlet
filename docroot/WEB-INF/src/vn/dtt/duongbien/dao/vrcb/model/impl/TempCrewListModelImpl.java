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

import vn.dtt.duongbien.dao.vrcb.model.TempCrewList;
import vn.dtt.duongbien.dao.vrcb.model.TempCrewListModel;
import vn.dtt.duongbien.dao.vrcb.model.TempCrewListSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the TempCrewList service. Represents a row in the &quot;TEMP_CREW_LIST&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbien.dao.vrcb.model.TempCrewListModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TempCrewListImpl}.
 * </p>
 *
 * @author longdm
 * @see TempCrewListImpl
 * @see vn.dtt.duongbien.dao.vrcb.model.TempCrewList
 * @see vn.dtt.duongbien.dao.vrcb.model.TempCrewListModel
 * @generated
 */
@JSON(strict = true)
public class TempCrewListModelImpl extends BaseModelImpl<TempCrewList>
	implements TempCrewListModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a temp crew list model instance should use the {@link vn.dtt.duongbien.dao.vrcb.model.TempCrewList} interface instead.
	 */
	public static final String TABLE_NAME = "TEMP_CREW_LIST";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ID", Types.BIGINT },
			{ "RequestCode", Types.VARCHAR },
			{ "RequestState", Types.INTEGER },
			{ "DocumentName", Types.BIGINT },
			{ "DocumentYear", Types.INTEGER },
			{ "UserCreated", Types.VARCHAR },
			{ "IsArrival", Types.INTEGER },
			{ "NameOfShip", Types.VARCHAR },
			{ "IMONumber", Types.VARCHAR },
			{ "CallSign", Types.VARCHAR },
			{ "VoyageNumber", Types.VARCHAR },
			{ "PortOfArrivalCode", Types.VARCHAR },
			{ "DateOfArrival", Types.TIMESTAMP },
			{ "FlagStateOfShip", Types.VARCHAR },
			{ "LastPortOfCallCode", Types.VARCHAR },
			{ "CrewList", Types.INTEGER },
			{ "SignPlace", Types.VARCHAR },
			{ "SignDate", Types.TIMESTAMP },
			{ "MasterSigned", Types.INTEGER },
			{ "MasterSignedImage", Types.INTEGER },
			{ "AttachedFile", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table TEMP_CREW_LIST (ID LONG not null primary key,RequestCode VARCHAR(75) null,RequestState INTEGER,DocumentName LONG,DocumentYear INTEGER,UserCreated VARCHAR(75) null,IsArrival INTEGER,NameOfShip VARCHAR(75) null,IMONumber VARCHAR(75) null,CallSign VARCHAR(75) null,VoyageNumber VARCHAR(75) null,PortOfArrivalCode VARCHAR(75) null,DateOfArrival DATE null,FlagStateOfShip VARCHAR(75) null,LastPortOfCallCode VARCHAR(75) null,CrewList INTEGER,SignPlace VARCHAR(75) null,SignDate DATE null,MasterSigned INTEGER,MasterSignedImage INTEGER,AttachedFile LONG)";
	public static final String TABLE_SQL_DROP = "drop table TEMP_CREW_LIST";
	public static final String ORDER_BY_JPQL = " ORDER BY tempCrewList.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY TEMP_CREW_LIST.ID ASC";
	public static final String DATA_SOURCE = "vaoracangbienDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.TempCrewList"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbien.dao.vrcb.model.TempCrewList"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.dtt.duongbien.dao.vrcb.model.TempCrewList"),
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
	public static TempCrewList toModel(TempCrewListSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		TempCrewList model = new TempCrewListImpl();

		model.setId(soapModel.getId());
		model.setRequestCode(soapModel.getRequestCode());
		model.setRequestState(soapModel.getRequestState());
		model.setDocumentName(soapModel.getDocumentName());
		model.setDocumentYear(soapModel.getDocumentYear());
		model.setUserCreated(soapModel.getUserCreated());
		model.setIsArrival(soapModel.getIsArrival());
		model.setNameOfShip(soapModel.getNameOfShip());
		model.setImoNumber(soapModel.getImoNumber());
		model.setCallSign(soapModel.getCallSign());
		model.setVoyageNumber(soapModel.getVoyageNumber());
		model.setPortOfArrivalCode(soapModel.getPortOfArrivalCode());
		model.setDateOfArrival(soapModel.getDateOfArrival());
		model.setFlagStateOfShip(soapModel.getFlagStateOfShip());
		model.setLastPortOfCallCode(soapModel.getLastPortOfCallCode());
		model.setCrewList(soapModel.getCrewList());
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
	public static List<TempCrewList> toModels(TempCrewListSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<TempCrewList> models = new ArrayList<TempCrewList>(soapModels.length);

		for (TempCrewListSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbien.dao.vrcb.model.TempCrewList"));

	public TempCrewListModelImpl() {
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
		return TempCrewList.class;
	}

	@Override
	public String getModelClassName() {
		return TempCrewList.class.getName();
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
		attributes.put("isArrival", getIsArrival());
		attributes.put("nameOfShip", getNameOfShip());
		attributes.put("imoNumber", getImoNumber());
		attributes.put("callSign", getCallSign());
		attributes.put("voyageNumber", getVoyageNumber());
		attributes.put("portOfArrivalCode", getPortOfArrivalCode());
		attributes.put("dateOfArrival", getDateOfArrival());
		attributes.put("flagStateOfShip", getFlagStateOfShip());
		attributes.put("lastPortOfCallCode", getLastPortOfCallCode());
		attributes.put("crewList", getCrewList());
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

		String callSign = (String)attributes.get("callSign");

		if (callSign != null) {
			setCallSign(callSign);
		}

		String voyageNumber = (String)attributes.get("voyageNumber");

		if (voyageNumber != null) {
			setVoyageNumber(voyageNumber);
		}

		String portOfArrivalCode = (String)attributes.get("portOfArrivalCode");

		if (portOfArrivalCode != null) {
			setPortOfArrivalCode(portOfArrivalCode);
		}

		Date dateOfArrival = (Date)attributes.get("dateOfArrival");

		if (dateOfArrival != null) {
			setDateOfArrival(dateOfArrival);
		}

		String flagStateOfShip = (String)attributes.get("flagStateOfShip");

		if (flagStateOfShip != null) {
			setFlagStateOfShip(flagStateOfShip);
		}

		String lastPortOfCallCode = (String)attributes.get("lastPortOfCallCode");

		if (lastPortOfCallCode != null) {
			setLastPortOfCallCode(lastPortOfCallCode);
		}

		Integer crewList = (Integer)attributes.get("crewList");

		if (crewList != null) {
			setCrewList(crewList);
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
	public int getIsArrival() {
		return _isArrival;
	}

	@Override
	public void setIsArrival(int isArrival) {
		_isArrival = isArrival;
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
	public String getImoNumber() {
		if (_imoNumber == null) {
			return StringPool.BLANK;
		}
		else {
			return _imoNumber;
		}
	}

	@Override
	public void setImoNumber(String imoNumber) {
		_imoNumber = imoNumber;
	}

	@JSON
	@Override
	public String getCallSign() {
		if (_callSign == null) {
			return StringPool.BLANK;
		}
		else {
			return _callSign;
		}
	}

	@Override
	public void setCallSign(String callSign) {
		_callSign = callSign;
	}

	@JSON
	@Override
	public String getVoyageNumber() {
		if (_voyageNumber == null) {
			return StringPool.BLANK;
		}
		else {
			return _voyageNumber;
		}
	}

	@Override
	public void setVoyageNumber(String voyageNumber) {
		_voyageNumber = voyageNumber;
	}

	@JSON
	@Override
	public String getPortOfArrivalCode() {
		if (_portOfArrivalCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _portOfArrivalCode;
		}
	}

	@Override
	public void setPortOfArrivalCode(String portOfArrivalCode) {
		_portOfArrivalCode = portOfArrivalCode;
	}

	@JSON
	@Override
	public Date getDateOfArrival() {
		return _dateOfArrival;
	}

	@Override
	public void setDateOfArrival(Date dateOfArrival) {
		_dateOfArrival = dateOfArrival;
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
	public int getCrewList() {
		return _crewList;
	}

	@Override
	public void setCrewList(int crewList) {
		_crewList = crewList;
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
			TempCrewList.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TempCrewList toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (TempCrewList)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TempCrewListImpl tempCrewListImpl = new TempCrewListImpl();

		tempCrewListImpl.setId(getId());
		tempCrewListImpl.setRequestCode(getRequestCode());
		tempCrewListImpl.setRequestState(getRequestState());
		tempCrewListImpl.setDocumentName(getDocumentName());
		tempCrewListImpl.setDocumentYear(getDocumentYear());
		tempCrewListImpl.setUserCreated(getUserCreated());
		tempCrewListImpl.setIsArrival(getIsArrival());
		tempCrewListImpl.setNameOfShip(getNameOfShip());
		tempCrewListImpl.setImoNumber(getImoNumber());
		tempCrewListImpl.setCallSign(getCallSign());
		tempCrewListImpl.setVoyageNumber(getVoyageNumber());
		tempCrewListImpl.setPortOfArrivalCode(getPortOfArrivalCode());
		tempCrewListImpl.setDateOfArrival(getDateOfArrival());
		tempCrewListImpl.setFlagStateOfShip(getFlagStateOfShip());
		tempCrewListImpl.setLastPortOfCallCode(getLastPortOfCallCode());
		tempCrewListImpl.setCrewList(getCrewList());
		tempCrewListImpl.setSignPlace(getSignPlace());
		tempCrewListImpl.setSignDate(getSignDate());
		tempCrewListImpl.setMasterSigned(getMasterSigned());
		tempCrewListImpl.setMasterSignedImage(getMasterSignedImage());
		tempCrewListImpl.setAttachedFile(getAttachedFile());

		tempCrewListImpl.resetOriginalValues();

		return tempCrewListImpl;
	}

	@Override
	public int compareTo(TempCrewList tempCrewList) {
		int value = 0;

		if (getId() < tempCrewList.getId()) {
			value = -1;
		}
		else if (getId() > tempCrewList.getId()) {
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

		if (!(obj instanceof TempCrewList)) {
			return false;
		}

		TempCrewList tempCrewList = (TempCrewList)obj;

		long primaryKey = tempCrewList.getPrimaryKey();

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
		TempCrewListModelImpl tempCrewListModelImpl = this;

		tempCrewListModelImpl._originalRequestCode = tempCrewListModelImpl._requestCode;

		tempCrewListModelImpl._originalRequestState = tempCrewListModelImpl._requestState;

		tempCrewListModelImpl._setOriginalRequestState = false;

		tempCrewListModelImpl._originalDocumentName = tempCrewListModelImpl._documentName;

		tempCrewListModelImpl._setOriginalDocumentName = false;

		tempCrewListModelImpl._originalDocumentYear = tempCrewListModelImpl._documentYear;

		tempCrewListModelImpl._setOriginalDocumentYear = false;

		tempCrewListModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<TempCrewList> toCacheModel() {
		TempCrewListCacheModel tempCrewListCacheModel = new TempCrewListCacheModel();

		tempCrewListCacheModel.id = getId();

		tempCrewListCacheModel.requestCode = getRequestCode();

		String requestCode = tempCrewListCacheModel.requestCode;

		if ((requestCode != null) && (requestCode.length() == 0)) {
			tempCrewListCacheModel.requestCode = null;
		}

		tempCrewListCacheModel.requestState = getRequestState();

		tempCrewListCacheModel.documentName = getDocumentName();

		tempCrewListCacheModel.documentYear = getDocumentYear();

		tempCrewListCacheModel.userCreated = getUserCreated();

		String userCreated = tempCrewListCacheModel.userCreated;

		if ((userCreated != null) && (userCreated.length() == 0)) {
			tempCrewListCacheModel.userCreated = null;
		}

		tempCrewListCacheModel.isArrival = getIsArrival();

		tempCrewListCacheModel.nameOfShip = getNameOfShip();

		String nameOfShip = tempCrewListCacheModel.nameOfShip;

		if ((nameOfShip != null) && (nameOfShip.length() == 0)) {
			tempCrewListCacheModel.nameOfShip = null;
		}

		tempCrewListCacheModel.imoNumber = getImoNumber();

		String imoNumber = tempCrewListCacheModel.imoNumber;

		if ((imoNumber != null) && (imoNumber.length() == 0)) {
			tempCrewListCacheModel.imoNumber = null;
		}

		tempCrewListCacheModel.callSign = getCallSign();

		String callSign = tempCrewListCacheModel.callSign;

		if ((callSign != null) && (callSign.length() == 0)) {
			tempCrewListCacheModel.callSign = null;
		}

		tempCrewListCacheModel.voyageNumber = getVoyageNumber();

		String voyageNumber = tempCrewListCacheModel.voyageNumber;

		if ((voyageNumber != null) && (voyageNumber.length() == 0)) {
			tempCrewListCacheModel.voyageNumber = null;
		}

		tempCrewListCacheModel.portOfArrivalCode = getPortOfArrivalCode();

		String portOfArrivalCode = tempCrewListCacheModel.portOfArrivalCode;

		if ((portOfArrivalCode != null) && (portOfArrivalCode.length() == 0)) {
			tempCrewListCacheModel.portOfArrivalCode = null;
		}

		Date dateOfArrival = getDateOfArrival();

		if (dateOfArrival != null) {
			tempCrewListCacheModel.dateOfArrival = dateOfArrival.getTime();
		}
		else {
			tempCrewListCacheModel.dateOfArrival = Long.MIN_VALUE;
		}

		tempCrewListCacheModel.flagStateOfShip = getFlagStateOfShip();

		String flagStateOfShip = tempCrewListCacheModel.flagStateOfShip;

		if ((flagStateOfShip != null) && (flagStateOfShip.length() == 0)) {
			tempCrewListCacheModel.flagStateOfShip = null;
		}

		tempCrewListCacheModel.lastPortOfCallCode = getLastPortOfCallCode();

		String lastPortOfCallCode = tempCrewListCacheModel.lastPortOfCallCode;

		if ((lastPortOfCallCode != null) && (lastPortOfCallCode.length() == 0)) {
			tempCrewListCacheModel.lastPortOfCallCode = null;
		}

		tempCrewListCacheModel.crewList = getCrewList();

		tempCrewListCacheModel.signPlace = getSignPlace();

		String signPlace = tempCrewListCacheModel.signPlace;

		if ((signPlace != null) && (signPlace.length() == 0)) {
			tempCrewListCacheModel.signPlace = null;
		}

		Date signDate = getSignDate();

		if (signDate != null) {
			tempCrewListCacheModel.signDate = signDate.getTime();
		}
		else {
			tempCrewListCacheModel.signDate = Long.MIN_VALUE;
		}

		tempCrewListCacheModel.masterSigned = getMasterSigned();

		tempCrewListCacheModel.masterSignedImage = getMasterSignedImage();

		tempCrewListCacheModel.attachedFile = getAttachedFile();

		return tempCrewListCacheModel;
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
		sb.append(", isArrival=");
		sb.append(getIsArrival());
		sb.append(", nameOfShip=");
		sb.append(getNameOfShip());
		sb.append(", imoNumber=");
		sb.append(getImoNumber());
		sb.append(", callSign=");
		sb.append(getCallSign());
		sb.append(", voyageNumber=");
		sb.append(getVoyageNumber());
		sb.append(", portOfArrivalCode=");
		sb.append(getPortOfArrivalCode());
		sb.append(", dateOfArrival=");
		sb.append(getDateOfArrival());
		sb.append(", flagStateOfShip=");
		sb.append(getFlagStateOfShip());
		sb.append(", lastPortOfCallCode=");
		sb.append(getLastPortOfCallCode());
		sb.append(", crewList=");
		sb.append(getCrewList());
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
		sb.append("vn.dtt.duongbien.dao.vrcb.model.TempCrewList");
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
			"<column><column-name>isArrival</column-name><column-value><![CDATA[");
		sb.append(getIsArrival());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nameOfShip</column-name><column-value><![CDATA[");
		sb.append(getNameOfShip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>imoNumber</column-name><column-value><![CDATA[");
		sb.append(getImoNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>callSign</column-name><column-value><![CDATA[");
		sb.append(getCallSign());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>voyageNumber</column-name><column-value><![CDATA[");
		sb.append(getVoyageNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portOfArrivalCode</column-name><column-value><![CDATA[");
		sb.append(getPortOfArrivalCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateOfArrival</column-name><column-value><![CDATA[");
		sb.append(getDateOfArrival());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>flagStateOfShip</column-name><column-value><![CDATA[");
		sb.append(getFlagStateOfShip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lastPortOfCallCode</column-name><column-value><![CDATA[");
		sb.append(getLastPortOfCallCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>crewList</column-name><column-value><![CDATA[");
		sb.append(getCrewList());
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

	private static ClassLoader _classLoader = TempCrewList.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			TempCrewList.class
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
	private int _isArrival;
	private String _nameOfShip;
	private String _imoNumber;
	private String _callSign;
	private String _voyageNumber;
	private String _portOfArrivalCode;
	private Date _dateOfArrival;
	private String _flagStateOfShip;
	private String _lastPortOfCallCode;
	private int _crewList;
	private String _signPlace;
	private Date _signDate;
	private int _masterSigned;
	private int _masterSignedImage;
	private long _attachedFile;
	private long _columnBitmask;
	private TempCrewList _escapedModel;
}