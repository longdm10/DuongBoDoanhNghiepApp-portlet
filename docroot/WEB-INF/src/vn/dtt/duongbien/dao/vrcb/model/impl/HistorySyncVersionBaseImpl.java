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

import vn.dtt.duongbien.dao.vrcb.model.HistorySyncVersion;
import vn.dtt.duongbien.dao.vrcb.service.HistorySyncVersionLocalServiceUtil;

/**
 * The extended model base implementation for the HistorySyncVersion service. Represents a row in the &quot;history_sync_version&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link HistorySyncVersionImpl}.
 * </p>
 *
 * @author longdm
 * @see HistorySyncVersionImpl
 * @see vn.dtt.duongbien.dao.vrcb.model.HistorySyncVersion
 * @generated
 */
public abstract class HistorySyncVersionBaseImpl
	extends HistorySyncVersionModelImpl implements HistorySyncVersion {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a history sync version model instance should use the {@link HistorySyncVersion} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			HistorySyncVersionLocalServiceUtil.addHistorySyncVersion(this);
		}
		else {
			HistorySyncVersionLocalServiceUtil.updateHistorySyncVersion(this);
		}
	}
}