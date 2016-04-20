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

package vn.dtt.duongbo.dao.common.service.persistence;

/**
 * @author win_64
 */
public interface DmDataItemFinder {
	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByGroupCodeIdTTHC(
		java.lang.String dmDataGroupCode, java.lang.String idTTHC);

	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByGroupCode(
		java.lang.String dmDataGroupCode);

	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByGroupCodeAndNode1(
		java.lang.String dmDataGroupCode, java.lang.String node_1);

	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByArrayId(
		java.lang.String arrayId);

	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByArrayCode(
		java.lang.String arrayCode);

	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByGroupId(
		long dataGroupId);

	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByGroupIdAndChaCode(
		long dataGroupId, java.lang.String chaCode);

	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findTinhThanh();

	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findQuanHuyenByMaTinhThanh(
		java.lang.String maTinhThanh);

	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findPhuongXaByMaTinhThanMaQuanHuyen(
		java.lang.String maTinhThanh, java.lang.String maQuanHuyen);

	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByGroupCodeAndLevel(
		java.lang.String groupCode, int level);

	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByGroupIdAndLevel(
		long groupId, int level);

	public java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByGroupCodeAndItemCode0(
		java.lang.String groupCode, java.lang.String code_0);

	public vn.dtt.duongbo.dao.common.model.DmDataItem findByGroupIdAndItemCode(
		long groupId, java.lang.String code);

	public vn.dtt.duongbo.dao.common.model.DmDataItem getByGroupCodeAndItemCode0(
		java.lang.String groupCode, java.lang.String code);
}