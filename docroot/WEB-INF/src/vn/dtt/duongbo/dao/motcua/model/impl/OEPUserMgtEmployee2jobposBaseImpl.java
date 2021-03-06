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

package vn.dtt.duongbo.dao.motcua.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee2jobpos;
import vn.dtt.duongbo.dao.motcua.service.OEPUserMgtEmployee2jobposLocalServiceUtil;

/**
 * The extended model base implementation for the OEPUserMgtEmployee2jobpos service. Represents a row in the &quot;oep_usermgt_employee2jobpos&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link OEPUserMgtEmployee2jobposImpl}.
 * </p>
 *
 * @author win_64
 * @see OEPUserMgtEmployee2jobposImpl
 * @see vn.dtt.duongbo.dao.motcua.model.OEPUserMgtEmployee2jobpos
 * @generated
 */
public abstract class OEPUserMgtEmployee2jobposBaseImpl
	extends OEPUserMgtEmployee2jobposModelImpl
	implements OEPUserMgtEmployee2jobpos {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a o e p user mgt employee2jobpos model instance should use the {@link OEPUserMgtEmployee2jobpos} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			OEPUserMgtEmployee2jobposLocalServiceUtil.addOEPUserMgtEmployee2jobpos(this);
		}
		else {
			OEPUserMgtEmployee2jobposLocalServiceUtil.updateOEPUserMgtEmployee2jobpos(this);
		}
	}
}