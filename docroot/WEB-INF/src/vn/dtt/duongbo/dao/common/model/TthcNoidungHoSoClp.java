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

package vn.dtt.duongbo.dao.common.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.duongbo.dao.common.service.ClpSerializer;
import vn.dtt.duongbo.dao.common.service.TthcNoidungHoSoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class TthcNoidungHoSoClp extends BaseModelImpl<TthcNoidungHoSo>
	implements TthcNoidungHoSo {
	public TthcNoidungHoSoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TthcNoidungHoSo.class;
	}

	@Override
	public String getModelClassName() {
		return TthcNoidungHoSo.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("maTuSinh", getMaTuSinh());
		attributes.put("hoSoThuTucId", getHoSoThuTucId());
		attributes.put("thanhPhanHoSoId", getThanhPhanHoSoId());
		attributes.put("tenTaiLieu", getTenTaiLieu());
		attributes.put("taiLieuDinhKem", getTaiLieuDinhKem());
		attributes.put("noiDungXml", getNoiDungXml());
		attributes.put("noiDungHtml", getNoiDungHtml());
		attributes.put("bieuMauHoSoId", getBieuMauHoSoId());
		attributes.put("ngayGuiNhan", getNgayGuiNhan());
		attributes.put("loaiTaiLieu", getLoaiTaiLieu());
		attributes.put("ngayTao", getNgayTao());
		attributes.put("nguoiTao", getNguoiTao());
		attributes.put("trangThai", getTrangThai());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String maTuSinh = (String)attributes.get("maTuSinh");

		if (maTuSinh != null) {
			setMaTuSinh(maTuSinh);
		}

		Long hoSoThuTucId = (Long)attributes.get("hoSoThuTucId");

		if (hoSoThuTucId != null) {
			setHoSoThuTucId(hoSoThuTucId);
		}

		Long thanhPhanHoSoId = (Long)attributes.get("thanhPhanHoSoId");

		if (thanhPhanHoSoId != null) {
			setThanhPhanHoSoId(thanhPhanHoSoId);
		}

		String tenTaiLieu = (String)attributes.get("tenTaiLieu");

		if (tenTaiLieu != null) {
			setTenTaiLieu(tenTaiLieu);
		}

		Long taiLieuDinhKem = (Long)attributes.get("taiLieuDinhKem");

		if (taiLieuDinhKem != null) {
			setTaiLieuDinhKem(taiLieuDinhKem);
		}

		String noiDungXml = (String)attributes.get("noiDungXml");

		if (noiDungXml != null) {
			setNoiDungXml(noiDungXml);
		}

		String noiDungHtml = (String)attributes.get("noiDungHtml");

		if (noiDungHtml != null) {
			setNoiDungHtml(noiDungHtml);
		}

		Long bieuMauHoSoId = (Long)attributes.get("bieuMauHoSoId");

		if (bieuMauHoSoId != null) {
			setBieuMauHoSoId(bieuMauHoSoId);
		}

		Date ngayGuiNhan = (Date)attributes.get("ngayGuiNhan");

		if (ngayGuiNhan != null) {
			setNgayGuiNhan(ngayGuiNhan);
		}

		Long loaiTaiLieu = (Long)attributes.get("loaiTaiLieu");

		if (loaiTaiLieu != null) {
			setLoaiTaiLieu(loaiTaiLieu);
		}

		Date ngayTao = (Date)attributes.get("ngayTao");

		if (ngayTao != null) {
			setNgayTao(ngayTao);
		}

		Long nguoiTao = (Long)attributes.get("nguoiTao");

		if (nguoiTao != null) {
			setNguoiTao(nguoiTao);
		}

		Long trangThai = (Long)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_tthcNoidungHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcNoidungHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_tthcNoidungHoSoRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaTuSinh() {
		return _maTuSinh;
	}

	@Override
	public void setMaTuSinh(String maTuSinh) {
		_maTuSinh = maTuSinh;

		if (_tthcNoidungHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcNoidungHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setMaTuSinh", String.class);

				method.invoke(_tthcNoidungHoSoRemoteModel, maTuSinh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getHoSoThuTucId() {
		return _hoSoThuTucId;
	}

	@Override
	public void setHoSoThuTucId(long hoSoThuTucId) {
		_hoSoThuTucId = hoSoThuTucId;

		if (_tthcNoidungHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcNoidungHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setHoSoThuTucId", long.class);

				method.invoke(_tthcNoidungHoSoRemoteModel, hoSoThuTucId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getThanhPhanHoSoId() {
		return _thanhPhanHoSoId;
	}

	@Override
	public void setThanhPhanHoSoId(long thanhPhanHoSoId) {
		_thanhPhanHoSoId = thanhPhanHoSoId;

		if (_tthcNoidungHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcNoidungHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setThanhPhanHoSoId", long.class);

				method.invoke(_tthcNoidungHoSoRemoteModel, thanhPhanHoSoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenTaiLieu() {
		return _tenTaiLieu;
	}

	@Override
	public void setTenTaiLieu(String tenTaiLieu) {
		_tenTaiLieu = tenTaiLieu;

		if (_tthcNoidungHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcNoidungHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setTenTaiLieu", String.class);

				method.invoke(_tthcNoidungHoSoRemoteModel, tenTaiLieu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTaiLieuDinhKem() {
		return _taiLieuDinhKem;
	}

	@Override
	public void setTaiLieuDinhKem(long taiLieuDinhKem) {
		_taiLieuDinhKem = taiLieuDinhKem;

		if (_tthcNoidungHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcNoidungHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setTaiLieuDinhKem", long.class);

				method.invoke(_tthcNoidungHoSoRemoteModel, taiLieuDinhKem);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNoiDungXml() {
		return _noiDungXml;
	}

	@Override
	public void setNoiDungXml(String noiDungXml) {
		_noiDungXml = noiDungXml;

		if (_tthcNoidungHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcNoidungHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setNoiDungXml", String.class);

				method.invoke(_tthcNoidungHoSoRemoteModel, noiDungXml);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNoiDungHtml() {
		return _noiDungHtml;
	}

	@Override
	public void setNoiDungHtml(String noiDungHtml) {
		_noiDungHtml = noiDungHtml;

		if (_tthcNoidungHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcNoidungHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setNoiDungHtml", String.class);

				method.invoke(_tthcNoidungHoSoRemoteModel, noiDungHtml);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getBieuMauHoSoId() {
		return _bieuMauHoSoId;
	}

	@Override
	public void setBieuMauHoSoId(long bieuMauHoSoId) {
		_bieuMauHoSoId = bieuMauHoSoId;

		if (_tthcNoidungHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcNoidungHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setBieuMauHoSoId", long.class);

				method.invoke(_tthcNoidungHoSoRemoteModel, bieuMauHoSoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayGuiNhan() {
		return _ngayGuiNhan;
	}

	@Override
	public void setNgayGuiNhan(Date ngayGuiNhan) {
		_ngayGuiNhan = ngayGuiNhan;

		if (_tthcNoidungHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcNoidungHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayGuiNhan", Date.class);

				method.invoke(_tthcNoidungHoSoRemoteModel, ngayGuiNhan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getLoaiTaiLieu() {
		return _loaiTaiLieu;
	}

	@Override
	public void setLoaiTaiLieu(long loaiTaiLieu) {
		_loaiTaiLieu = loaiTaiLieu;

		if (_tthcNoidungHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcNoidungHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiTaiLieu", long.class);

				method.invoke(_tthcNoidungHoSoRemoteModel, loaiTaiLieu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayTao() {
		return _ngayTao;
	}

	@Override
	public void setNgayTao(Date ngayTao) {
		_ngayTao = ngayTao;

		if (_tthcNoidungHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcNoidungHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayTao", Date.class);

				method.invoke(_tthcNoidungHoSoRemoteModel, ngayTao);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNguoiTao() {
		return _nguoiTao;
	}

	@Override
	public void setNguoiTao(long nguoiTao) {
		_nguoiTao = nguoiTao;

		if (_tthcNoidungHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcNoidungHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setNguoiTao", long.class);

				method.invoke(_tthcNoidungHoSoRemoteModel, nguoiTao);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTrangThai() {
		return _trangThai;
	}

	@Override
	public void setTrangThai(long trangThai) {
		_trangThai = trangThai;

		if (_tthcNoidungHoSoRemoteModel != null) {
			try {
				Class<?> clazz = _tthcNoidungHoSoRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThai", long.class);

				method.invoke(_tthcNoidungHoSoRemoteModel, trangThai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTthcNoidungHoSoRemoteModel() {
		return _tthcNoidungHoSoRemoteModel;
	}

	public void setTthcNoidungHoSoRemoteModel(
		BaseModel<?> tthcNoidungHoSoRemoteModel) {
		_tthcNoidungHoSoRemoteModel = tthcNoidungHoSoRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _tthcNoidungHoSoRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_tthcNoidungHoSoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TthcNoidungHoSoLocalServiceUtil.addTthcNoidungHoSo(this);
		}
		else {
			TthcNoidungHoSoLocalServiceUtil.updateTthcNoidungHoSo(this);
		}
	}

	@Override
	public TthcNoidungHoSo toEscapedModel() {
		return (TthcNoidungHoSo)ProxyUtil.newProxyInstance(TthcNoidungHoSo.class.getClassLoader(),
			new Class[] { TthcNoidungHoSo.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TthcNoidungHoSoClp clone = new TthcNoidungHoSoClp();

		clone.setId(getId());
		clone.setMaTuSinh(getMaTuSinh());
		clone.setHoSoThuTucId(getHoSoThuTucId());
		clone.setThanhPhanHoSoId(getThanhPhanHoSoId());
		clone.setTenTaiLieu(getTenTaiLieu());
		clone.setTaiLieuDinhKem(getTaiLieuDinhKem());
		clone.setNoiDungXml(getNoiDungXml());
		clone.setNoiDungHtml(getNoiDungHtml());
		clone.setBieuMauHoSoId(getBieuMauHoSoId());
		clone.setNgayGuiNhan(getNgayGuiNhan());
		clone.setLoaiTaiLieu(getLoaiTaiLieu());
		clone.setNgayTao(getNgayTao());
		clone.setNguoiTao(getNguoiTao());
		clone.setTrangThai(getTrangThai());

		return clone;
	}

	@Override
	public int compareTo(TthcNoidungHoSo tthcNoidungHoSo) {
		int value = 0;

		if (getId() < tthcNoidungHoSo.getId()) {
			value = -1;
		}
		else if (getId() > tthcNoidungHoSo.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TthcNoidungHoSoClp)) {
			return false;
		}

		TthcNoidungHoSoClp tthcNoidungHoSo = (TthcNoidungHoSoClp)obj;

		long primaryKey = tthcNoidungHoSo.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", maTuSinh=");
		sb.append(getMaTuSinh());
		sb.append(", hoSoThuTucId=");
		sb.append(getHoSoThuTucId());
		sb.append(", thanhPhanHoSoId=");
		sb.append(getThanhPhanHoSoId());
		sb.append(", tenTaiLieu=");
		sb.append(getTenTaiLieu());
		sb.append(", taiLieuDinhKem=");
		sb.append(getTaiLieuDinhKem());
		sb.append(", noiDungXml=");
		sb.append(getNoiDungXml());
		sb.append(", noiDungHtml=");
		sb.append(getNoiDungHtml());
		sb.append(", bieuMauHoSoId=");
		sb.append(getBieuMauHoSoId());
		sb.append(", ngayGuiNhan=");
		sb.append(getNgayGuiNhan());
		sb.append(", loaiTaiLieu=");
		sb.append(getLoaiTaiLieu());
		sb.append(", ngayTao=");
		sb.append(getNgayTao());
		sb.append(", nguoiTao=");
		sb.append(getNguoiTao());
		sb.append(", trangThai=");
		sb.append(getTrangThai());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.common.model.TthcNoidungHoSo");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maTuSinh</column-name><column-value><![CDATA[");
		sb.append(getMaTuSinh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoSoThuTucId</column-name><column-value><![CDATA[");
		sb.append(getHoSoThuTucId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thanhPhanHoSoId</column-name><column-value><![CDATA[");
		sb.append(getThanhPhanHoSoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenTaiLieu</column-name><column-value><![CDATA[");
		sb.append(getTenTaiLieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>taiLieuDinhKem</column-name><column-value><![CDATA[");
		sb.append(getTaiLieuDinhKem());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>noiDungXml</column-name><column-value><![CDATA[");
		sb.append(getNoiDungXml());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>noiDungHtml</column-name><column-value><![CDATA[");
		sb.append(getNoiDungHtml());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bieuMauHoSoId</column-name><column-value><![CDATA[");
		sb.append(getBieuMauHoSoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayGuiNhan</column-name><column-value><![CDATA[");
		sb.append(getNgayGuiNhan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiTaiLieu</column-name><column-value><![CDATA[");
		sb.append(getLoaiTaiLieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayTao</column-name><column-value><![CDATA[");
		sb.append(getNgayTao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nguoiTao</column-name><column-value><![CDATA[");
		sb.append(getNguoiTao());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThai</column-name><column-value><![CDATA[");
		sb.append(getTrangThai());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _maTuSinh;
	private long _hoSoThuTucId;
	private long _thanhPhanHoSoId;
	private String _tenTaiLieu;
	private long _taiLieuDinhKem;
	private String _noiDungXml;
	private String _noiDungHtml;
	private long _bieuMauHoSoId;
	private Date _ngayGuiNhan;
	private long _loaiTaiLieu;
	private Date _ngayTao;
	private long _nguoiTao;
	private long _trangThai;
	private BaseModel<?> _tthcNoidungHoSoRemoteModel;
}