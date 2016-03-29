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

package vn.dtt.duongbo.dao.motcua.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import vn.dtt.duongbo.dao.motcua.model.OEPUserMgtWorkingUnit2tthc;
import vn.dtt.duongbo.dao.motcua.service.OEPUserMgtWorkingUnit2tthcLocalServiceUtil;

/**
 * @author win_64
 * @generated
 */
public abstract class OEPUserMgtWorkingUnit2tthcActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public OEPUserMgtWorkingUnit2tthcActionableDynamicQuery()
		throws SystemException {
		setBaseLocalService(OEPUserMgtWorkingUnit2tthcLocalServiceUtil.getService());
		setClass(OEPUserMgtWorkingUnit2tthc.class);

		setClassLoader(vn.dtt.duongbo.dao.motcua.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("workingUnit2TTHCId");
	}
}