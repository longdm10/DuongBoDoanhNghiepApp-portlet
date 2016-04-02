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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ResponseBo}.
 * </p>
 *
 * @author longdm
 * @see ResponseBo
 * @generated
 */
public class ResponseBoWrapper implements ResponseBo, ModelWrapper<ResponseBo> {
	public ResponseBoWrapper(ResponseBo responseBo) {
		_responseBo = responseBo;
	}

	@Override
	public Class<?> getModelClass() {
		return ResponseBo.class;
	}

	@Override
	public String getModelClassName() {
		return ResponseBo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("isSuccess", getIsSuccess());
		attributes.put("errorMessage", getErrorMessage());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer isSuccess = (Integer)attributes.get("isSuccess");

		if (isSuccess != null) {
			setIsSuccess(isSuccess);
		}

		String errorMessage = (String)attributes.get("errorMessage");

		if (errorMessage != null) {
			setErrorMessage(errorMessage);
		}
	}

	/**
	* Returns the primary key of this response bo.
	*
	* @return the primary key of this response bo
	*/
	@Override
	public long getPrimaryKey() {
		return _responseBo.getPrimaryKey();
	}

	/**
	* Sets the primary key of this response bo.
	*
	* @param primaryKey the primary key of this response bo
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_responseBo.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this response bo.
	*
	* @return the ID of this response bo
	*/
	@Override
	public long getId() {
		return _responseBo.getId();
	}

	/**
	* Sets the ID of this response bo.
	*
	* @param id the ID of this response bo
	*/
	@Override
	public void setId(long id) {
		_responseBo.setId(id);
	}

	/**
	* Returns the is success of this response bo.
	*
	* @return the is success of this response bo
	*/
	@Override
	public int getIsSuccess() {
		return _responseBo.getIsSuccess();
	}

	/**
	* Sets the is success of this response bo.
	*
	* @param isSuccess the is success of this response bo
	*/
	@Override
	public void setIsSuccess(int isSuccess) {
		_responseBo.setIsSuccess(isSuccess);
	}

	/**
	* Returns the error message of this response bo.
	*
	* @return the error message of this response bo
	*/
	@Override
	public java.lang.String getErrorMessage() {
		return _responseBo.getErrorMessage();
	}

	/**
	* Sets the error message of this response bo.
	*
	* @param errorMessage the error message of this response bo
	*/
	@Override
	public void setErrorMessage(java.lang.String errorMessage) {
		_responseBo.setErrorMessage(errorMessage);
	}

	@Override
	public boolean isNew() {
		return _responseBo.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_responseBo.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _responseBo.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_responseBo.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _responseBo.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _responseBo.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_responseBo.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _responseBo.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_responseBo.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_responseBo.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_responseBo.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ResponseBoWrapper((ResponseBo)_responseBo.clone());
	}

	@Override
	public int compareTo(ResponseBo responseBo) {
		return _responseBo.compareTo(responseBo);
	}

	@Override
	public int hashCode() {
		return _responseBo.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<ResponseBo> toCacheModel() {
		return _responseBo.toCacheModel();
	}

	@Override
	public ResponseBo toEscapedModel() {
		return new ResponseBoWrapper(_responseBo.toEscapedModel());
	}

	@Override
	public ResponseBo toUnescapedModel() {
		return new ResponseBoWrapper(_responseBo.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _responseBo.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _responseBo.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_responseBo.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ResponseBoWrapper)) {
			return false;
		}

		ResponseBoWrapper responseBoWrapper = (ResponseBoWrapper)obj;

		if (Validator.equals(_responseBo, responseBoWrapper._responseBo)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ResponseBo getWrappedResponseBo() {
		return _responseBo;
	}

	@Override
	public ResponseBo getWrappedModel() {
		return _responseBo;
	}

	@Override
	public void resetOriginalValues() {
		_responseBo.resetOriginalValues();
	}

	private ResponseBo _responseBo;
}