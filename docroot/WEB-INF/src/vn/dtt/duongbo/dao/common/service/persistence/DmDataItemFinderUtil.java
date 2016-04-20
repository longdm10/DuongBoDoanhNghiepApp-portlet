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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author win_64
 */
public class DmDataItemFinderUtil {
	public static java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByGroupCodeIdTTHC(
		java.lang.String dmDataGroupCode, java.lang.String idTTHC) {
		return getFinder().findByGroupCodeIdTTHC(dmDataGroupCode, idTTHC);
	}

	public static java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByGroupCode(
		java.lang.String dmDataGroupCode) {
		return getFinder().findByGroupCode(dmDataGroupCode);
	}

	public static java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByGroupCodeAndNode1(
		java.lang.String dmDataGroupCode, java.lang.String node_1) {
		return getFinder().findByGroupCodeAndNode1(dmDataGroupCode, node_1);
	}

	public static java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByArrayId(
		java.lang.String arrayId) {
		return getFinder().findByArrayId(arrayId);
	}

	public static java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByArrayCode(
		java.lang.String arrayCode) {
		return getFinder().findByArrayCode(arrayCode);
	}

	public static java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByGroupId(
		long dataGroupId) {
		return getFinder().findByGroupId(dataGroupId);
	}

	public static java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByGroupIdAndChaCode(
		long dataGroupId, java.lang.String chaCode) {
		return getFinder().findByGroupIdAndChaCode(dataGroupId, chaCode);
	}

	public static java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findTinhThanh() {
		return getFinder().findTinhThanh();
	}

	public static java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findQuanHuyenByMaTinhThanh(
		java.lang.String maTinhThanh) {
		return getFinder().findQuanHuyenByMaTinhThanh(maTinhThanh);
	}

	public static java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findPhuongXaByMaTinhThanMaQuanHuyen(
		java.lang.String maTinhThanh, java.lang.String maQuanHuyen) {
		return getFinder()
				   .findPhuongXaByMaTinhThanMaQuanHuyen(maTinhThanh, maQuanHuyen);
	}

	public static java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByGroupCodeAndLevel(
		java.lang.String groupCode, int level) {
		return getFinder().findByGroupCodeAndLevel(groupCode, level);
	}

	public static java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByGroupIdAndLevel(
		long groupId, int level) {
		return getFinder().findByGroupIdAndLevel(groupId, level);
	}

	public static java.util.List<vn.dtt.duongbo.dao.common.model.DmDataItem> findByGroupCodeAndItemCode0(
		java.lang.String groupCode, java.lang.String code_0) {
		return getFinder().findByGroupCodeAndItemCode0(groupCode, code_0);
	}

	public static vn.dtt.duongbo.dao.common.model.DmDataItem findByGroupIdAndItemCode(
		long groupId, java.lang.String code) {
		return getFinder().findByGroupIdAndItemCode(groupId, code);
	}

	public static vn.dtt.duongbo.dao.common.model.DmDataItem getByGroupCodeAndItemCode0(
		java.lang.String groupCode, java.lang.String code) {
		return getFinder().getByGroupCodeAndItemCode0(groupCode, code);
	}

	public static DmDataItemFinder getFinder() {
		if (_finder == null) {
			_finder = (DmDataItemFinder)PortletBeanLocatorUtil.locate(vn.dtt.duongbo.dao.common.service.ClpSerializer.getServletContextName(),
					DmDataItemFinder.class.getName());

			ReferenceRegistry.registerReference(DmDataItemFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(DmDataItemFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(DmDataItemFinderUtil.class,
			"_finder");
	}

	private static DmDataItemFinder _finder;
}