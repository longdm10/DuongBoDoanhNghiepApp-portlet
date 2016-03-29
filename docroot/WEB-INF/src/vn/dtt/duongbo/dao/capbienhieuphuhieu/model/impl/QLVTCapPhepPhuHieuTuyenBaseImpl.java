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

package vn.dtt.duongbo.dao.capbienhieuphuhieu.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepPhuHieuTuyen;
import vn.dtt.duongbo.dao.capbienhieuphuhieu.service.QLVTCapPhepPhuHieuTuyenLocalServiceUtil;

/**
 * The extended model base implementation for the QLVTCapPhepPhuHieuTuyen service. Represents a row in the &quot;qlvt_capphep_phuhieuxe_tuyen&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link QLVTCapPhepPhuHieuTuyenImpl}.
 * </p>
 *
 * @author binhta
 * @see QLVTCapPhepPhuHieuTuyenImpl
 * @see vn.dtt.duongbo.dao.capbienhieuphuhieu.model.QLVTCapPhepPhuHieuTuyen
 * @generated
 */
public abstract class QLVTCapPhepPhuHieuTuyenBaseImpl
	extends QLVTCapPhepPhuHieuTuyenModelImpl implements QLVTCapPhepPhuHieuTuyen {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a q l v t cap phep phu hieu tuyen model instance should use the {@link QLVTCapPhepPhuHieuTuyen} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			QLVTCapPhepPhuHieuTuyenLocalServiceUtil.addQLVTCapPhepPhuHieuTuyen(this);
		}
		else {
			QLVTCapPhepPhuHieuTuyenLocalServiceUtil.updateQLVTCapPhepPhuHieuTuyen(this);
		}
	}
}