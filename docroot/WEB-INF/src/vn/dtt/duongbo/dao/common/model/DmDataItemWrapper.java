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

package vn.dtt.duongbo.dao.common.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DmDataItem}.
 * </p>
 *
 * @author win_64
 * @see DmDataItem
 * @generated
 */
public class DmDataItemWrapper implements DmDataItem, ModelWrapper<DmDataItem> {
	public DmDataItemWrapper(DmDataItem dmDataItem) {
		_dmDataItem = dmDataItem;
	}

	@Override
	public Class<?> getModelClass() {
		return DmDataItem.class;
	}

	@Override
	public String getModelClassName() {
		return DmDataItem.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("dataGroupId", getDataGroupId());
		attributes.put("code", getCode());
		attributes.put("node1", getNode1());
		attributes.put("node2", getNode2());
		attributes.put("node3", getNode3());
		attributes.put("node4", getNode4());
		attributes.put("level", getLevel());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("validatedFrom", getValidatedFrom());
		attributes.put("validatedTo", getValidatedTo());
		attributes.put("status", getStatus());
		attributes.put("order", getOrder());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long dataGroupId = (Long)attributes.get("dataGroupId");

		if (dataGroupId != null) {
			setDataGroupId(dataGroupId);
		}

		String code = (String)attributes.get("code");

		if (code != null) {
			setCode(code);
		}

		String node1 = (String)attributes.get("node1");

		if (node1 != null) {
			setNode1(node1);
		}

		String node2 = (String)attributes.get("node2");

		if (node2 != null) {
			setNode2(node2);
		}

		String node3 = (String)attributes.get("node3");

		if (node3 != null) {
			setNode3(node3);
		}

		String node4 = (String)attributes.get("node4");

		if (node4 != null) {
			setNode4(node4);
		}

		Integer level = (Integer)attributes.get("level");

		if (level != null) {
			setLevel(level);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String validatedFrom = (String)attributes.get("validatedFrom");

		if (validatedFrom != null) {
			setValidatedFrom(validatedFrom);
		}

		String validatedTo = (String)attributes.get("validatedTo");

		if (validatedTo != null) {
			setValidatedTo(validatedTo);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Integer order = (Integer)attributes.get("order");

		if (order != null) {
			setOrder(order);
		}
	}

	/**
	* Returns the primary key of this dm data item.
	*
	* @return the primary key of this dm data item
	*/
	@Override
	public long getPrimaryKey() {
		return _dmDataItem.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dm data item.
	*
	* @param primaryKey the primary key of this dm data item
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dmDataItem.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this dm data item.
	*
	* @return the ID of this dm data item
	*/
	@Override
	public long getId() {
		return _dmDataItem.getId();
	}

	/**
	* Sets the ID of this dm data item.
	*
	* @param id the ID of this dm data item
	*/
	@Override
	public void setId(long id) {
		_dmDataItem.setId(id);
	}

	/**
	* Returns the data group ID of this dm data item.
	*
	* @return the data group ID of this dm data item
	*/
	@Override
	public long getDataGroupId() {
		return _dmDataItem.getDataGroupId();
	}

	/**
	* Sets the data group ID of this dm data item.
	*
	* @param dataGroupId the data group ID of this dm data item
	*/
	@Override
	public void setDataGroupId(long dataGroupId) {
		_dmDataItem.setDataGroupId(dataGroupId);
	}

	/**
	* Returns the code of this dm data item.
	*
	* @return the code of this dm data item
	*/
	@Override
	public java.lang.String getCode() {
		return _dmDataItem.getCode();
	}

	/**
	* Sets the code of this dm data item.
	*
	* @param code the code of this dm data item
	*/
	@Override
	public void setCode(java.lang.String code) {
		_dmDataItem.setCode(code);
	}

	/**
	* Returns the node1 of this dm data item.
	*
	* @return the node1 of this dm data item
	*/
	@Override
	public java.lang.String getNode1() {
		return _dmDataItem.getNode1();
	}

	/**
	* Sets the node1 of this dm data item.
	*
	* @param node1 the node1 of this dm data item
	*/
	@Override
	public void setNode1(java.lang.String node1) {
		_dmDataItem.setNode1(node1);
	}

	/**
	* Returns the node2 of this dm data item.
	*
	* @return the node2 of this dm data item
	*/
	@Override
	public java.lang.String getNode2() {
		return _dmDataItem.getNode2();
	}

	/**
	* Sets the node2 of this dm data item.
	*
	* @param node2 the node2 of this dm data item
	*/
	@Override
	public void setNode2(java.lang.String node2) {
		_dmDataItem.setNode2(node2);
	}

	/**
	* Returns the node3 of this dm data item.
	*
	* @return the node3 of this dm data item
	*/
	@Override
	public java.lang.String getNode3() {
		return _dmDataItem.getNode3();
	}

	/**
	* Sets the node3 of this dm data item.
	*
	* @param node3 the node3 of this dm data item
	*/
	@Override
	public void setNode3(java.lang.String node3) {
		_dmDataItem.setNode3(node3);
	}

	/**
	* Returns the node4 of this dm data item.
	*
	* @return the node4 of this dm data item
	*/
	@Override
	public java.lang.String getNode4() {
		return _dmDataItem.getNode4();
	}

	/**
	* Sets the node4 of this dm data item.
	*
	* @param node4 the node4 of this dm data item
	*/
	@Override
	public void setNode4(java.lang.String node4) {
		_dmDataItem.setNode4(node4);
	}

	/**
	* Returns the level of this dm data item.
	*
	* @return the level of this dm data item
	*/
	@Override
	public int getLevel() {
		return _dmDataItem.getLevel();
	}

	/**
	* Sets the level of this dm data item.
	*
	* @param level the level of this dm data item
	*/
	@Override
	public void setLevel(int level) {
		_dmDataItem.setLevel(level);
	}

	/**
	* Returns the name of this dm data item.
	*
	* @return the name of this dm data item
	*/
	@Override
	public java.lang.String getName() {
		return _dmDataItem.getName();
	}

	/**
	* Sets the name of this dm data item.
	*
	* @param name the name of this dm data item
	*/
	@Override
	public void setName(java.lang.String name) {
		_dmDataItem.setName(name);
	}

	/**
	* Returns the description of this dm data item.
	*
	* @return the description of this dm data item
	*/
	@Override
	public java.lang.String getDescription() {
		return _dmDataItem.getDescription();
	}

	/**
	* Sets the description of this dm data item.
	*
	* @param description the description of this dm data item
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_dmDataItem.setDescription(description);
	}

	/**
	* Returns the validated from of this dm data item.
	*
	* @return the validated from of this dm data item
	*/
	@Override
	public java.lang.String getValidatedFrom() {
		return _dmDataItem.getValidatedFrom();
	}

	/**
	* Sets the validated from of this dm data item.
	*
	* @param validatedFrom the validated from of this dm data item
	*/
	@Override
	public void setValidatedFrom(java.lang.String validatedFrom) {
		_dmDataItem.setValidatedFrom(validatedFrom);
	}

	/**
	* Returns the validated to of this dm data item.
	*
	* @return the validated to of this dm data item
	*/
	@Override
	public java.lang.String getValidatedTo() {
		return _dmDataItem.getValidatedTo();
	}

	/**
	* Sets the validated to of this dm data item.
	*
	* @param validatedTo the validated to of this dm data item
	*/
	@Override
	public void setValidatedTo(java.lang.String validatedTo) {
		_dmDataItem.setValidatedTo(validatedTo);
	}

	/**
	* Returns the status of this dm data item.
	*
	* @return the status of this dm data item
	*/
	@Override
	public int getStatus() {
		return _dmDataItem.getStatus();
	}

	/**
	* Sets the status of this dm data item.
	*
	* @param status the status of this dm data item
	*/
	@Override
	public void setStatus(int status) {
		_dmDataItem.setStatus(status);
	}

	/**
	* Returns the order of this dm data item.
	*
	* @return the order of this dm data item
	*/
	@Override
	public int getOrder() {
		return _dmDataItem.getOrder();
	}

	/**
	* Sets the order of this dm data item.
	*
	* @param order the order of this dm data item
	*/
	@Override
	public void setOrder(int order) {
		_dmDataItem.setOrder(order);
	}

	@Override
	public boolean isNew() {
		return _dmDataItem.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dmDataItem.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dmDataItem.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmDataItem.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dmDataItem.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dmDataItem.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dmDataItem.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dmDataItem.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dmDataItem.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dmDataItem.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dmDataItem.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DmDataItemWrapper((DmDataItem)_dmDataItem.clone());
	}

	@Override
	public int compareTo(vn.dtt.duongbo.dao.common.model.DmDataItem dmDataItem) {
		return _dmDataItem.compareTo(dmDataItem);
	}

	@Override
	public int hashCode() {
		return _dmDataItem.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.duongbo.dao.common.model.DmDataItem> toCacheModel() {
		return _dmDataItem.toCacheModel();
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.DmDataItem toEscapedModel() {
		return new DmDataItemWrapper(_dmDataItem.toEscapedModel());
	}

	@Override
	public vn.dtt.duongbo.dao.common.model.DmDataItem toUnescapedModel() {
		return new DmDataItemWrapper(_dmDataItem.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dmDataItem.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dmDataItem.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dmDataItem.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmDataItemWrapper)) {
			return false;
		}

		DmDataItemWrapper dmDataItemWrapper = (DmDataItemWrapper)obj;

		if (Validator.equals(_dmDataItem, dmDataItemWrapper._dmDataItem)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DmDataItem getWrappedDmDataItem() {
		return _dmDataItem;
	}

	@Override
	public DmDataItem getWrappedModel() {
		return _dmDataItem;
	}

	@Override
	public void resetOriginalValues() {
		_dmDataItem.resetOriginalValues();
	}

	private DmDataItem _dmDataItem;
}