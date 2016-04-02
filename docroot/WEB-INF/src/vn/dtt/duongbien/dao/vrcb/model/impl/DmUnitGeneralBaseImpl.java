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

import com.liferay.portal.kernel.exception.SystemException;

import vn.dtt.duongbien.dao.vrcb.model.DmUnitGeneral;
import vn.dtt.duongbien.dao.vrcb.service.DmUnitGeneralLocalServiceUtil;

/**
 * The extended model base implementation for the DmUnitGeneral service. Represents a row in the &quot;DM_UNIT_GENERAL&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DmUnitGeneralImpl}.
 * </p>
 *
 * @author longdm
 * @see DmUnitGeneralImpl
 * @see vn.dtt.duongbien.dao.vrcb.model.DmUnitGeneral
 * @generated
 */
public abstract class DmUnitGeneralBaseImpl extends DmUnitGeneralModelImpl
	implements DmUnitGeneral {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dm unit general model instance should use the {@link DmUnitGeneral} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DmUnitGeneralLocalServiceUtil.addDmUnitGeneral(this);
		}
		else {
			DmUnitGeneralLocalServiceUtil.updateDmUnitGeneral(this);
		}
	}
}