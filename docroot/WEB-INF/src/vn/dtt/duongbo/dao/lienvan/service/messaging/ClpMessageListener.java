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

package vn.dtt.duongbo.dao.lienvan.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import vn.dtt.duongbo.dao.lienvan.service.ClpSerializer;
import vn.dtt.duongbo.dao.lienvan.service.QlvtCapPhepGpLienVanLocalServiceUtil;
import vn.dtt.duongbo.dao.lienvan.service.QlvtCapPhepGpLienVanServiceUtil;
import vn.dtt.duongbo.dao.lienvan.service.QlvtCapPhepGpkdvtDuongboQuocTeLocalServiceUtil;
import vn.dtt.duongbo.dao.lienvan.service.QlvtCapPhepGpkdvtDuongboQuocTeServiceUtil;
import vn.dtt.duongbo.dao.lienvan.service.QlvtCapPhepGplvLoaiHinhVanTaiLocalServiceUtil;
import vn.dtt.duongbo.dao.lienvan.service.QlvtCapPhepGplvLoaiHinhVanTaiServiceUtil;
import vn.dtt.duongbo.dao.lienvan.service.QlvtCapPhepGplvPhuongTienLocalServiceUtil;
import vn.dtt.duongbo.dao.lienvan.service.QlvtCapPhepGplvPhuongTienServiceUtil;
import vn.dtt.duongbo.dao.lienvan.service.QlvtCapPhepGplvPhuongTienVanTaiLocalServiceUtil;
import vn.dtt.duongbo.dao.lienvan.service.QlvtCapPhepGplvPhuongTienVanTaiServiceUtil;
import vn.dtt.duongbo.dao.lienvan.service.QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiLocalServiceUtil;
import vn.dtt.duongbo.dao.lienvan.service.QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiServiceUtil;
import vn.dtt.duongbo.dao.lienvan.service.QlvtCapPhepPhuongTienVanTaiLocalServiceUtil;
import vn.dtt.duongbo.dao.lienvan.service.QlvtCapPhepPhuongTienVanTaiServiceUtil;
import vn.dtt.duongbo.dao.lienvan.service.QlvtThongTinHoSoCapPhepGplvLocalServiceUtil;
import vn.dtt.duongbo.dao.lienvan.service.QlvtThongTinHoSoCapPhepGplvServiceUtil;
import vn.dtt.duongbo.dao.lienvan.service.QlvtThongTinHoSoGiayPhepVanTaiLocalServiceUtil;
import vn.dtt.duongbo.dao.lienvan.service.QlvtThongTinHoSoGiayPhepVanTaiServiceUtil;
import vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanLoaiHinhVanTaiLocalServiceUtil;
import vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanLoaiHinhVanTaiServiceUtil;
import vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanLocalServiceUtil;
import vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanPhuongTienLocalServiceUtil;
import vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanPhuongTienServiceUtil;
import vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalServiceUtil;
import vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanPhuongTienTramDungNghiServiceUtil;
import vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanServiceUtil;
import vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanTuyenLocalServiceUtil;
import vn.dtt.duongbo.dao.lienvan.service.QlvtXuLyGpLienVanTuyenServiceUtil;

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
			QlvtCapPhepGpkdvtDuongboQuocTeLocalServiceUtil.clearService();

			QlvtCapPhepGpkdvtDuongboQuocTeServiceUtil.clearService();
			QlvtCapPhepGpLienVanLocalServiceUtil.clearService();

			QlvtCapPhepGpLienVanServiceUtil.clearService();
			QlvtCapPhepGplvLoaiHinhVanTaiLocalServiceUtil.clearService();

			QlvtCapPhepGplvLoaiHinhVanTaiServiceUtil.clearService();
			QlvtCapPhepGplvPhuongTienLocalServiceUtil.clearService();

			QlvtCapPhepGplvPhuongTienServiceUtil.clearService();
			QlvtCapPhepGplvPhuongTienVanTaiLocalServiceUtil.clearService();

			QlvtCapPhepGplvPhuongTienVanTaiServiceUtil.clearService();
			QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiLocalServiceUtil.clearService();

			QlvtCapPhepGplvPhuongTienVanTaiTramdungnghiServiceUtil.clearService();
			QlvtCapPhepPhuongTienVanTaiLocalServiceUtil.clearService();

			QlvtCapPhepPhuongTienVanTaiServiceUtil.clearService();
			QlvtThongTinHoSoCapPhepGplvLocalServiceUtil.clearService();

			QlvtThongTinHoSoCapPhepGplvServiceUtil.clearService();
			QlvtThongTinHoSoGiayPhepVanTaiLocalServiceUtil.clearService();

			QlvtThongTinHoSoGiayPhepVanTaiServiceUtil.clearService();
			QlvtXuLyGpLienVanLocalServiceUtil.clearService();

			QlvtXuLyGpLienVanServiceUtil.clearService();
			QlvtXuLyGpLienVanLoaiHinhVanTaiLocalServiceUtil.clearService();

			QlvtXuLyGpLienVanLoaiHinhVanTaiServiceUtil.clearService();
			QlvtXuLyGpLienVanPhuongTienLocalServiceUtil.clearService();

			QlvtXuLyGpLienVanPhuongTienServiceUtil.clearService();
			QlvtXuLyGpLienVanPhuongTienTramDungNghiLocalServiceUtil.clearService();

			QlvtXuLyGpLienVanPhuongTienTramDungNghiServiceUtil.clearService();
			QlvtXuLyGpLienVanTuyenLocalServiceUtil.clearService();

			QlvtXuLyGpLienVanTuyenServiceUtil.clearService();
		}
	}
}