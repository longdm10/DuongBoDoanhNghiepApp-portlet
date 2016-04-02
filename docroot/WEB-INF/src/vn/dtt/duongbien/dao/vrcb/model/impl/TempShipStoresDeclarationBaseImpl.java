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

import vn.dtt.duongbien.dao.vrcb.model.TempShipStoresDeclaration;
import vn.dtt.duongbien.dao.vrcb.service.TempShipStoresDeclarationLocalServiceUtil;

/**
 * The extended model base implementation for the TempShipStoresDeclaration service. Represents a row in the &quot;TEMP_SHIP_STORES_DECLARATION&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TempShipStoresDeclarationImpl}.
 * </p>
 *
 * @author longdm
 * @see TempShipStoresDeclarationImpl
 * @see vn.dtt.duongbien.dao.vrcb.model.TempShipStoresDeclaration
 * @generated
 */
public abstract class TempShipStoresDeclarationBaseImpl
	extends TempShipStoresDeclarationModelImpl
	implements TempShipStoresDeclaration {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a temp ship stores declaration model instance should use the {@link TempShipStoresDeclaration} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TempShipStoresDeclarationLocalServiceUtil.addTempShipStoresDeclaration(this);
		}
		else {
			TempShipStoresDeclarationLocalServiceUtil.updateTempShipStoresDeclaration(this);
		}
	}
}