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

import vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy;
import vn.dtt.duongbo.dao.motcua.service.MotCuaPhieuXuLyLocalServiceUtil;

/**
 * The extended model base implementation for the MotCuaPhieuXuLy service. Represents a row in the &quot;motcua_phieuxuly&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MotCuaPhieuXuLyImpl}.
 * </p>
 *
 * @author win_64
 * @see MotCuaPhieuXuLyImpl
 * @see vn.dtt.duongbo.dao.motcua.model.MotCuaPhieuXuLy
 * @generated
 */
public abstract class MotCuaPhieuXuLyBaseImpl extends MotCuaPhieuXuLyModelImpl
	implements MotCuaPhieuXuLy {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a mot cua phieu xu ly model instance should use the {@link MotCuaPhieuXuLy} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			MotCuaPhieuXuLyLocalServiceUtil.addMotCuaPhieuXuLy(this);
		}
		else {
			MotCuaPhieuXuLyLocalServiceUtil.updateMotCuaPhieuXuLy(this);
		}
	}
}