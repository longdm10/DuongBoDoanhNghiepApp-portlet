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
 * This class is a wrapper for {@link TempHealthCrewPassengerList}.
 * </p>
 *
 * @author longdm
 * @see TempHealthCrewPassengerList
 * @generated
 */
public class TempHealthCrewPassengerListWrapper
	implements TempHealthCrewPassengerList,
		ModelWrapper<TempHealthCrewPassengerList> {
	public TempHealthCrewPassengerListWrapper(
		TempHealthCrewPassengerList tempHealthCrewPassengerList) {
		_tempHealthCrewPassengerList = tempHealthCrewPassengerList;
	}

	@Override
	public Class<?> getModelClass() {
		return TempHealthCrewPassengerList.class;
	}

	@Override
	public String getModelClassName() {
		return TempHealthCrewPassengerList.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("requestCode", getRequestCode());
		attributes.put("healthCrewPassengerCode", getHealthCrewPassengerCode());
		attributes.put("passengerOrCrewCode", getPassengerOrCrewCode());
		attributes.put("passengerOrCrewName", getPassengerOrCrewName());
		attributes.put("classOrRating", getClassOrRating());
		attributes.put("stateVisitedCode", getStateVisitedCode());
		attributes.put("portVisitedCode", getPortVisitedCode());
		attributes.put("fromDate", getFromDate());
		attributes.put("toDate", getToDate());

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

		String healthCrewPassengerCode = (String)attributes.get(
				"healthCrewPassengerCode");

		if (healthCrewPassengerCode != null) {
			setHealthCrewPassengerCode(healthCrewPassengerCode);
		}

		String passengerOrCrewCode = (String)attributes.get(
				"passengerOrCrewCode");

		if (passengerOrCrewCode != null) {
			setPassengerOrCrewCode(passengerOrCrewCode);
		}

		String passengerOrCrewName = (String)attributes.get(
				"passengerOrCrewName");

		if (passengerOrCrewName != null) {
			setPassengerOrCrewName(passengerOrCrewName);
		}

		Integer classOrRating = (Integer)attributes.get("classOrRating");

		if (classOrRating != null) {
			setClassOrRating(classOrRating);
		}

		String stateVisitedCode = (String)attributes.get("stateVisitedCode");

		if (stateVisitedCode != null) {
			setStateVisitedCode(stateVisitedCode);
		}

		String portVisitedCode = (String)attributes.get("portVisitedCode");

		if (portVisitedCode != null) {
			setPortVisitedCode(portVisitedCode);
		}

		Date fromDate = (Date)attributes.get("fromDate");

		if (fromDate != null) {
			setFromDate(fromDate);
		}

		Date toDate = (Date)attributes.get("toDate");

		if (toDate != null) {
			setToDate(toDate);
		}
	}

	/**
	* Returns the primary key of this temp health crew passenger list.
	*
	* @return the primary key of this temp health crew passenger list
	*/
	@Override
	public long getPrimaryKey() {
		return _tempHealthCrewPassengerList.getPrimaryKey();
	}

	/**
	* Sets the primary key of this temp health crew passenger list.
	*
	* @param primaryKey the primary key of this temp health crew passenger list
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tempHealthCrewPassengerList.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this temp health crew passenger list.
	*
	* @return the ID of this temp health crew passenger list
	*/
	@Override
	public long getId() {
		return _tempHealthCrewPassengerList.getId();
	}

	/**
	* Sets the ID of this temp health crew passenger list.
	*
	* @param id the ID of this temp health crew passenger list
	*/
	@Override
	public void setId(long id) {
		_tempHealthCrewPassengerList.setId(id);
	}

	/**
	* Returns the request code of this temp health crew passenger list.
	*
	* @return the request code of this temp health crew passenger list
	*/
	@Override
	public java.lang.String getRequestCode() {
		return _tempHealthCrewPassengerList.getRequestCode();
	}

	/**
	* Sets the request code of this temp health crew passenger list.
	*
	* @param requestCode the request code of this temp health crew passenger list
	*/
	@Override
	public void setRequestCode(java.lang.String requestCode) {
		_tempHealthCrewPassengerList.setRequestCode(requestCode);
	}

	/**
	* Returns the health crew passenger code of this temp health crew passenger list.
	*
	* @return the health crew passenger code of this temp health crew passenger list
	*/
	@Override
	public java.lang.String getHealthCrewPassengerCode() {
		return _tempHealthCrewPassengerList.getHealthCrewPassengerCode();
	}

	/**
	* Sets the health crew passenger code of this temp health crew passenger list.
	*
	* @param healthCrewPassengerCode the health crew passenger code of this temp health crew passenger list
	*/
	@Override
	public void setHealthCrewPassengerCode(
		java.lang.String healthCrewPassengerCode) {
		_tempHealthCrewPassengerList.setHealthCrewPassengerCode(healthCrewPassengerCode);
	}

	/**
	* Returns the passenger or crew code of this temp health crew passenger list.
	*
	* @return the passenger or crew code of this temp health crew passenger list
	*/
	@Override
	public java.lang.String getPassengerOrCrewCode() {
		return _tempHealthCrewPassengerList.getPassengerOrCrewCode();
	}

	/**
	* Sets the passenger or crew code of this temp health crew passenger list.
	*
	* @param passengerOrCrewCode the passenger or crew code of this temp health crew passenger list
	*/
	@Override
	public void setPassengerOrCrewCode(java.lang.String passengerOrCrewCode) {
		_tempHealthCrewPassengerList.setPassengerOrCrewCode(passengerOrCrewCode);
	}

	/**
	* Returns the passenger or crew name of this temp health crew passenger list.
	*
	* @return the passenger or crew name of this temp health crew passenger list
	*/
	@Override
	public java.lang.String getPassengerOrCrewName() {
		return _tempHealthCrewPassengerList.getPassengerOrCrewName();
	}

	/**
	* Sets the passenger or crew name of this temp health crew passenger list.
	*
	* @param passengerOrCrewName the passenger or crew name of this temp health crew passenger list
	*/
	@Override
	public void setPassengerOrCrewName(java.lang.String passengerOrCrewName) {
		_tempHealthCrewPassengerList.setPassengerOrCrewName(passengerOrCrewName);
	}

	/**
	* Returns the class or rating of this temp health crew passenger list.
	*
	* @return the class or rating of this temp health crew passenger list
	*/
	@Override
	public int getClassOrRating() {
		return _tempHealthCrewPassengerList.getClassOrRating();
	}

	/**
	* Sets the class or rating of this temp health crew passenger list.
	*
	* @param classOrRating the class or rating of this temp health crew passenger list
	*/
	@Override
	public void setClassOrRating(int classOrRating) {
		_tempHealthCrewPassengerList.setClassOrRating(classOrRating);
	}

	/**
	* Returns the state visited code of this temp health crew passenger list.
	*
	* @return the state visited code of this temp health crew passenger list
	*/
	@Override
	public java.lang.String getStateVisitedCode() {
		return _tempHealthCrewPassengerList.getStateVisitedCode();
	}

	/**
	* Sets the state visited code of this temp health crew passenger list.
	*
	* @param stateVisitedCode the state visited code of this temp health crew passenger list
	*/
	@Override
	public void setStateVisitedCode(java.lang.String stateVisitedCode) {
		_tempHealthCrewPassengerList.setStateVisitedCode(stateVisitedCode);
	}

	/**
	* Returns the port visited code of this temp health crew passenger list.
	*
	* @return the port visited code of this temp health crew passenger list
	*/
	@Override
	public java.lang.String getPortVisitedCode() {
		return _tempHealthCrewPassengerList.getPortVisitedCode();
	}

	/**
	* Sets the port visited code of this temp health crew passenger list.
	*
	* @param portVisitedCode the port visited code of this temp health crew passenger list
	*/
	@Override
	public void setPortVisitedCode(java.lang.String portVisitedCode) {
		_tempHealthCrewPassengerList.setPortVisitedCode(portVisitedCode);
	}

	/**
	* Returns the from date of this temp health crew passenger list.
	*
	* @return the from date of this temp health crew passenger list
	*/
	@Override
	public java.util.Date getFromDate() {
		return _tempHealthCrewPassengerList.getFromDate();
	}

	/**
	* Sets the from date of this temp health crew passenger list.
	*
	* @param fromDate the from date of this temp health crew passenger list
	*/
	@Override
	public void setFromDate(java.util.Date fromDate) {
		_tempHealthCrewPassengerList.setFromDate(fromDate);
	}

	/**
	* Returns the to date of this temp health crew passenger list.
	*
	* @return the to date of this temp health crew passenger list
	*/
	@Override
	public java.util.Date getToDate() {
		return _tempHealthCrewPassengerList.getToDate();
	}

	/**
	* Sets the to date of this temp health crew passenger list.
	*
	* @param toDate the to date of this temp health crew passenger list
	*/
	@Override
	public void setToDate(java.util.Date toDate) {
		_tempHealthCrewPassengerList.setToDate(toDate);
	}

	@Override
	public boolean isNew() {
		return _tempHealthCrewPassengerList.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tempHealthCrewPassengerList.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tempHealthCrewPassengerList.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tempHealthCrewPassengerList.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tempHealthCrewPassengerList.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tempHealthCrewPassengerList.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tempHealthCrewPassengerList.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tempHealthCrewPassengerList.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tempHealthCrewPassengerList.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tempHealthCrewPassengerList.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tempHealthCrewPassengerList.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TempHealthCrewPassengerListWrapper((TempHealthCrewPassengerList)_tempHealthCrewPassengerList.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.duongbien.dao.vrcb.model.TempHealthCrewPassengerList tempHealthCrewPassengerList) {
		return _tempHealthCrewPassengerList.compareTo(tempHealthCrewPassengerList);
	}

	@Override
	public int hashCode() {
		return _tempHealthCrewPassengerList.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbien.dao.vrcb.model.TempHealthCrewPassengerList> toCacheModel() {
		return _tempHealthCrewPassengerList.toCacheModel();
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempHealthCrewPassengerList toEscapedModel() {
		return new TempHealthCrewPassengerListWrapper(_tempHealthCrewPassengerList.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbien.dao.vrcb.model.TempHealthCrewPassengerList toUnescapedModel() {
		return new TempHealthCrewPassengerListWrapper(_tempHealthCrewPassengerList.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tempHealthCrewPassengerList.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tempHealthCrewPassengerList.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tempHealthCrewPassengerList.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TempHealthCrewPassengerListWrapper)) {
			return false;
		}

		TempHealthCrewPassengerListWrapper tempHealthCrewPassengerListWrapper = (TempHealthCrewPassengerListWrapper)obj;

		if (Validator.equals(_tempHealthCrewPassengerList,
					tempHealthCrewPassengerListWrapper._tempHealthCrewPassengerList)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TempHealthCrewPassengerList getWrappedTempHealthCrewPassengerList() {
		return _tempHealthCrewPassengerList;
	}

	@Override
	public TempHealthCrewPassengerList getWrappedModel() {
		return _tempHealthCrewPassengerList;
	}

	@Override
	public void resetOriginalValues() {
		_tempHealthCrewPassengerList.resetOriginalValues();
	}

	private TempHealthCrewPassengerList _tempHealthCrewPassengerList;
}