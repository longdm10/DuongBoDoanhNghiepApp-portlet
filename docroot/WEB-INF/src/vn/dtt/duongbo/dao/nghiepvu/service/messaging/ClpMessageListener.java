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

package vn.dtt.duongbo.dao.nghiepvu.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import vn.dtt.duongbo.dao.nghiepvu.service.ClpSerializer;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtKiemTraHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtKiemTraHoSoServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtLoaiHinhHoatDongTthsLocalServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtLoaiHinhHoatDongTthsServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtNoiDungThamTraLocalServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtNoiDungThamTraServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtQuanLyFileLocalServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtQuanLyFileServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtTTHCKetQuaThamTraLocalServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtTTHCKetQuaThamTraServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtTTHCNoiDungThamTraLocalServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtTTHCNoiDungThamTraServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinHoSoLienVanLocalServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinHoSoLienVanServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinHoSoLocalServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinHoSoNoiDiaLocalServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinHoSoNoiDiaServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinHoSoQuocTeLocalServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinHoSoQuocTeServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinHoSoServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinXuLyLocalServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtThongTinXuLyServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtYeuCauBoXungLocalServiceUtil;
import vn.dtt.duongbo.dao.nghiepvu.service.QlvtYeuCauBoXungServiceUtil;

/**
 * @author NhanNc
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			QlvtKiemTraHoSoLocalServiceUtil.clearService();

			QlvtKiemTraHoSoServiceUtil.clearService();
			QlvtLoaiHinhHoatDongTthsLocalServiceUtil.clearService();

			QlvtLoaiHinhHoatDongTthsServiceUtil.clearService();
			QlvtNoiDungThamTraLocalServiceUtil.clearService();

			QlvtNoiDungThamTraServiceUtil.clearService();
			QlvtQuanLyFileLocalServiceUtil.clearService();

			QlvtQuanLyFileServiceUtil.clearService();
			QlvtThongTinHoSoLocalServiceUtil.clearService();

			QlvtThongTinHoSoServiceUtil.clearService();
			QlvtThongTinHoSoLienVanLocalServiceUtil.clearService();

			QlvtThongTinHoSoLienVanServiceUtil.clearService();
			QlvtThongTinHoSoNoiDiaLocalServiceUtil.clearService();

			QlvtThongTinHoSoNoiDiaServiceUtil.clearService();
			QlvtThongTinHoSoQuocTeLocalServiceUtil.clearService();

			QlvtThongTinHoSoQuocTeServiceUtil.clearService();
			QlvtThongTinXuLyLocalServiceUtil.clearService();

			QlvtThongTinXuLyServiceUtil.clearService();
			QlvtTTHCKetQuaThamTraLocalServiceUtil.clearService();

			QlvtTTHCKetQuaThamTraServiceUtil.clearService();
			QlvtTTHCNoiDungThamTraLocalServiceUtil.clearService();

			QlvtTTHCNoiDungThamTraServiceUtil.clearService();
			QlvtYeuCauBoXungLocalServiceUtil.clearService();

			QlvtYeuCauBoXungServiceUtil.clearService();
		}
	}
}