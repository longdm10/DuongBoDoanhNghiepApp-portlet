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

package vn.dtt.duongbo.dao.common.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.duongbo.dao.common.model.DmDataItem;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing DmDataItem in entity cache.
 *
 * @author win_64
 * @see DmDataItem
 * @generated
 */
public class DmDataItemCacheModel implements CacheModel<DmDataItem>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{id=");
		sb.append(id);
		sb.append(", dataGroupId=");
		sb.append(dataGroupId);
		sb.append(", code=");
		sb.append(code);
		sb.append(", node1=");
		sb.append(node1);
		sb.append(", node2=");
		sb.append(node2);
		sb.append(", node3=");
		sb.append(node3);
		sb.append(", node4=");
		sb.append(node4);
		sb.append(", level=");
		sb.append(level);
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append(", validatedFrom=");
		sb.append(validatedFrom);
		sb.append(", validatedTo=");
		sb.append(validatedTo);
		sb.append(", status=");
		sb.append(status);
		sb.append(", order=");
		sb.append(order);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DmDataItem toEntityModel() {
		DmDataItemImpl dmDataItemImpl = new DmDataItemImpl();

		dmDataItemImpl.setId(id);
		dmDataItemImpl.setDataGroupId(dataGroupId);

		if (code == null) {
			dmDataItemImpl.setCode(StringPool.BLANK);
		}
		else {
			dmDataItemImpl.setCode(code);
		}

		if (node1 == null) {
			dmDataItemImpl.setNode1(StringPool.BLANK);
		}
		else {
			dmDataItemImpl.setNode1(node1);
		}

		if (node2 == null) {
			dmDataItemImpl.setNode2(StringPool.BLANK);
		}
		else {
			dmDataItemImpl.setNode2(node2);
		}

		if (node3 == null) {
			dmDataItemImpl.setNode3(StringPool.BLANK);
		}
		else {
			dmDataItemImpl.setNode3(node3);
		}

		if (node4 == null) {
			dmDataItemImpl.setNode4(StringPool.BLANK);
		}
		else {
			dmDataItemImpl.setNode4(node4);
		}

		dmDataItemImpl.setLevel(level);

		if (name == null) {
			dmDataItemImpl.setName(StringPool.BLANK);
		}
		else {
			dmDataItemImpl.setName(name);
		}

		if (description == null) {
			dmDataItemImpl.setDescription(StringPool.BLANK);
		}
		else {
			dmDataItemImpl.setDescription(description);
		}

		if (validatedFrom == null) {
			dmDataItemImpl.setValidatedFrom(StringPool.BLANK);
		}
		else {
			dmDataItemImpl.setValidatedFrom(validatedFrom);
		}

		if (validatedTo == null) {
			dmDataItemImpl.setValidatedTo(StringPool.BLANK);
		}
		else {
			dmDataItemImpl.setValidatedTo(validatedTo);
		}

		dmDataItemImpl.setStatus(status);
		dmDataItemImpl.setOrder(order);

		dmDataItemImpl.resetOriginalValues();

		return dmDataItemImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		dataGroupId = objectInput.readLong();
		code = objectInput.readUTF();
		node1 = objectInput.readUTF();
		node2 = objectInput.readUTF();
		node3 = objectInput.readUTF();
		node4 = objectInput.readUTF();
		level = objectInput.readInt();
		name = objectInput.readUTF();
		description = objectInput.readUTF();
		validatedFrom = objectInput.readUTF();
		validatedTo = objectInput.readUTF();
		status = objectInput.readInt();
		order = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(dataGroupId);

		if (code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(code);
		}

		if (node1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(node1);
		}

		if (node2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(node2);
		}

		if (node3 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(node3);
		}

		if (node4 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(node4);
		}

		objectOutput.writeInt(level);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (validatedFrom == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(validatedFrom);
		}

		if (validatedTo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(validatedTo);
		}

		objectOutput.writeInt(status);
		objectOutput.writeInt(order);
	}

	public long id;
	public long dataGroupId;
	public String code;
	public String node1;
	public String node2;
	public String node3;
	public String node4;
	public int level;
	public String name;
	public String description;
	public String validatedFrom;
	public String validatedTo;
	public int status;
	public int order;
}