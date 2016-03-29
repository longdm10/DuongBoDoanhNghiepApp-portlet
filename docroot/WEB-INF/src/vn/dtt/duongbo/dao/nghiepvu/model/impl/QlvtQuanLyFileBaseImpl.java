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

package vn.dtt.duongbo.dao.nghiepvu.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtQuanLyFileLocalServiceUtil;

/**
 * The extended model base implementation for the QlvtQuanLyFile service. Represents a row in the &quot;nghiepvu_quanlyfile&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link QlvtQuanLyFileImpl}.
 * </p>
 *
 * @author NhanNc
 * @see QlvtQuanLyFileImpl
 * @see vn.dtt.duongbo.dao.nghiepvu.model.QlvtQuanLyFile
 * @generated
 */
public abstract class QlvtQuanLyFileBaseImpl extends QlvtQuanLyFileModelImpl
	implements QlvtQuanLyFile {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a qlvt quan ly file model instance should use the {@link QlvtQuanLyFile} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QlvtQuanLyFileLocalServiceUtil.addQlvtQuanLyFile(this);
		}
		else {
			QlvtQuanLyFileLocalServiceUtil.updateQlvtQuanLyFile(this);
		}
	}
}