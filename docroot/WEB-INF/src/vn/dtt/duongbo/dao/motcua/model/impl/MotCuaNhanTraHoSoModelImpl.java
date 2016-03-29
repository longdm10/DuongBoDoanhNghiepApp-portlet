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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSo;
import vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSoModel;
import vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSoSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the MotCuaNhanTraHoSo service. Represents a row in the &quot;motcua_nhantrahoso&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSoModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MotCuaNhanTraHoSoImpl}.
 * </p>
 *
 * @author win_64
 * @see MotCuaNhanTraHoSoImpl
 * @see vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSo
 * @see vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSoModel
 * @generated
 */
@JSON(strict = true)
public class MotCuaNhanTraHoSoModelImpl extends BaseModelImpl<MotCuaNhanTraHoSo>
	implements MotCuaNhanTraHoSoModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a mot cua nhan tra ho so model instance should use the {@link vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSo} interface instead.
	 */
	public static final String TABLE_NAME = "motcua_nhantrahoso";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "hosothutucid", Types.BIGINT },
			{ "tennguoinop", Types.VARCHAR },
			{ "cmndnguoinop", Types.VARCHAR },
			{ "diachinguoinop", Types.VARCHAR },
			{ "sodienthoainguoinop", Types.VARCHAR },
			{ "emailnguoinop", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table motcua_nhantrahoso (id LONG not null primary key,hosothutucid LONG,tennguoinop VARCHAR(75) null,cmndnguoinop VARCHAR(75) null,diachinguoinop VARCHAR(75) null,sodienthoainguoinop VARCHAR(75) null,emailnguoinop VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table motcua_nhantrahoso";
	public static final String ORDER_BY_JPQL = " ORDER BY motCuaNhanTraHoSo.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY motcua_nhantrahoso.id ASC";
	public static final String DATA_SOURCE = "tthcDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSo"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSo"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static MotCuaNhanTraHoSo toModel(MotCuaNhanTraHoSoSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		MotCuaNhanTraHoSo model = new MotCuaNhanTraHoSoImpl();

		model.setId(soapModel.getId());
		model.setHoSoThuTucId(soapModel.getHoSoThuTucId());
		model.setTenNguoiNop(soapModel.getTenNguoiNop());
		model.setCmndNguoiNop(soapModel.getCmndNguoiNop());
		model.setDiaChiNguoiNop(soapModel.getDiaChiNguoiNop());
		model.setSoDienThoaiNguoiNop(soapModel.getSoDienThoaiNguoiNop());
		model.setEmailNguoiNop(soapModel.getEmailNguoiNop());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<MotCuaNhanTraHoSo> toModels(
		MotCuaNhanTraHoSoSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<MotCuaNhanTraHoSo> models = new ArrayList<MotCuaNhanTraHoSo>(soapModels.length);

		for (MotCuaNhanTraHoSoSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSo"));

	public MotCuaNhanTraHoSoModelImpl() {
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
	public Class<?> getModelClass() {
		return MotCuaNhanTraHoSo.class;
	}

	@Override
	public String getModelClassName() {
		return MotCuaNhanTraHoSo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("hoSoThuTucId", getHoSoThuTucId());
		attributes.put("tenNguoiNop", getTenNguoiNop());
		attributes.put("cmndNguoiNop", getCmndNguoiNop());
		attributes.put("diaChiNguoiNop", getDiaChiNguoiNop());
		attributes.put("soDienThoaiNguoiNop", getSoDienThoaiNguoiNop());
		attributes.put("emailNguoiNop", getEmailNguoiNop());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long hoSoThuTucId = (Long)attributes.get("hoSoThuTucId");

		if (hoSoThuTucId != null) {
			setHoSoThuTucId(hoSoThuTucId);
		}

		String tenNguoiNop = (String)attributes.get("tenNguoiNop");

		if (tenNguoiNop != null) {
			setTenNguoiNop(tenNguoiNop);
		}

		String cmndNguoiNop = (String)attributes.get("cmndNguoiNop");

		if (cmndNguoiNop != null) {
			setCmndNguoiNop(cmndNguoiNop);
		}

		String diaChiNguoiNop = (String)attributes.get("diaChiNguoiNop");

		if (diaChiNguoiNop != null) {
			setDiaChiNguoiNop(diaChiNguoiNop);
		}

		String soDienThoaiNguoiNop = (String)attributes.get(
				"soDienThoaiNguoiNop");

		if (soDienThoaiNguoiNop != null) {
			setSoDienThoaiNguoiNop(soDienThoaiNguoiNop);
		}

		String emailNguoiNop = (String)attributes.get("emailNguoiNop");

		if (emailNguoiNop != null) {
			setEmailNguoiNop(emailNguoiNop);
		}
	}

	@JSON
	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;
	}

	@JSON
	@Override
	public long getHoSoThuTucId() {
		return _hoSoThuTucId;
	}

	@Override
	public void setHoSoThuTucId(long hoSoThuTucId) {
		_hoSoThuTucId = hoSoThuTucId;
	}

	@JSON
	@Override
	public String getTenNguoiNop() {
		if (_tenNguoiNop == null) {
			return StringPool.BLANK;
		}
		else {
			return _tenNguoiNop;
		}
	}

	@Override
	public void setTenNguoiNop(String tenNguoiNop) {
		_tenNguoiNop = tenNguoiNop;
	}

	@JSON
	@Override
	public String getCmndNguoiNop() {
		if (_cmndNguoiNop == null) {
			return StringPool.BLANK;
		}
		else {
			return _cmndNguoiNop;
		}
	}

	@Override
	public void setCmndNguoiNop(String cmndNguoiNop) {
		_cmndNguoiNop = cmndNguoiNop;
	}

	@JSON
	@Override
	public String getDiaChiNguoiNop() {
		if (_diaChiNguoiNop == null) {
			return StringPool.BLANK;
		}
		else {
			return _diaChiNguoiNop;
		}
	}

	@Override
	public void setDiaChiNguoiNop(String diaChiNguoiNop) {
		_diaChiNguoiNop = diaChiNguoiNop;
	}

	@JSON
	@Override
	public String getSoDienThoaiNguoiNop() {
		if (_soDienThoaiNguoiNop == null) {
			return StringPool.BLANK;
		}
		else {
			return _soDienThoaiNguoiNop;
		}
	}

	@Override
	public void setSoDienThoaiNguoiNop(String soDienThoaiNguoiNop) {
		_soDienThoaiNguoiNop = soDienThoaiNguoiNop;
	}

	@JSON
	@Override
	public String getEmailNguoiNop() {
		if (_emailNguoiNop == null) {
			return StringPool.BLANK;
		}
		else {
			return _emailNguoiNop;
		}
	}

	@Override
	public void setEmailNguoiNop(String emailNguoiNop) {
		_emailNguoiNop = emailNguoiNop;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			MotCuaNhanTraHoSo.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public MotCuaNhanTraHoSo toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (MotCuaNhanTraHoSo)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		MotCuaNhanTraHoSoImpl motCuaNhanTraHoSoImpl = new MotCuaNhanTraHoSoImpl();

		motCuaNhanTraHoSoImpl.setId(getId());
		motCuaNhanTraHoSoImpl.setHoSoThuTucId(getHoSoThuTucId());
		motCuaNhanTraHoSoImpl.setTenNguoiNop(getTenNguoiNop());
		motCuaNhanTraHoSoImpl.setCmndNguoiNop(getCmndNguoiNop());
		motCuaNhanTraHoSoImpl.setDiaChiNguoiNop(getDiaChiNguoiNop());
		motCuaNhanTraHoSoImpl.setSoDienThoaiNguoiNop(getSoDienThoaiNguoiNop());
		motCuaNhanTraHoSoImpl.setEmailNguoiNop(getEmailNguoiNop());

		motCuaNhanTraHoSoImpl.resetOriginalValues();

		return motCuaNhanTraHoSoImpl;
	}

	@Override
	public int compareTo(MotCuaNhanTraHoSo motCuaNhanTraHoSo) {
		int value = 0;

		if (getId() < motCuaNhanTraHoSo.getId()) {
			value = -1;
		}
		else if (getId() > motCuaNhanTraHoSo.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

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

		if (!(obj instanceof MotCuaNhanTraHoSo)) {
			return false;
		}

		MotCuaNhanTraHoSo motCuaNhanTraHoSo = (MotCuaNhanTraHoSo)obj;

		long primaryKey = motCuaNhanTraHoSo.getPrimaryKey();

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
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<MotCuaNhanTraHoSo> toCacheModel() {
		MotCuaNhanTraHoSoCacheModel motCuaNhanTraHoSoCacheModel = new MotCuaNhanTraHoSoCacheModel();

		motCuaNhanTraHoSoCacheModel.id = getId();

		motCuaNhanTraHoSoCacheModel.hoSoThuTucId = getHoSoThuTucId();

		motCuaNhanTraHoSoCacheModel.tenNguoiNop = getTenNguoiNop();

		String tenNguoiNop = motCuaNhanTraHoSoCacheModel.tenNguoiNop;

		if ((tenNguoiNop != null) && (tenNguoiNop.length() == 0)) {
			motCuaNhanTraHoSoCacheModel.tenNguoiNop = null;
		}

		motCuaNhanTraHoSoCacheModel.cmndNguoiNop = getCmndNguoiNop();

		String cmndNguoiNop = motCuaNhanTraHoSoCacheModel.cmndNguoiNop;

		if ((cmndNguoiNop != null) && (cmndNguoiNop.length() == 0)) {
			motCuaNhanTraHoSoCacheModel.cmndNguoiNop = null;
		}

		motCuaNhanTraHoSoCacheModel.diaChiNguoiNop = getDiaChiNguoiNop();

		String diaChiNguoiNop = motCuaNhanTraHoSoCacheModel.diaChiNguoiNop;

		if ((diaChiNguoiNop != null) && (diaChiNguoiNop.length() == 0)) {
			motCuaNhanTraHoSoCacheModel.diaChiNguoiNop = null;
		}

		motCuaNhanTraHoSoCacheModel.soDienThoaiNguoiNop = getSoDienThoaiNguoiNop();

		String soDienThoaiNguoiNop = motCuaNhanTraHoSoCacheModel.soDienThoaiNguoiNop;

		if ((soDienThoaiNguoiNop != null) &&
				(soDienThoaiNguoiNop.length() == 0)) {
			motCuaNhanTraHoSoCacheModel.soDienThoaiNguoiNop = null;
		}

		motCuaNhanTraHoSoCacheModel.emailNguoiNop = getEmailNguoiNop();

		String emailNguoiNop = motCuaNhanTraHoSoCacheModel.emailNguoiNop;

		if ((emailNguoiNop != null) && (emailNguoiNop.length() == 0)) {
			motCuaNhanTraHoSoCacheModel.emailNguoiNop = null;
		}

		return motCuaNhanTraHoSoCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", hoSoThuTucId=");
		sb.append(getHoSoThuTucId());
		sb.append(", tenNguoiNop=");
		sb.append(getTenNguoiNop());
		sb.append(", cmndNguoiNop=");
		sb.append(getCmndNguoiNop());
		sb.append(", diaChiNguoiNop=");
		sb.append(getDiaChiNguoiNop());
		sb.append(", soDienThoaiNguoiNop=");
		sb.append(getSoDienThoaiNguoiNop());
		sb.append(", emailNguoiNop=");
		sb.append(getEmailNguoiNop());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.duongbo.dao.motcua.model.MotCuaNhanTraHoSo");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoSoThuTucId</column-name><column-value><![CDATA[");
		sb.append(getHoSoThuTucId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenNguoiNop</column-name><column-value><![CDATA[");
		sb.append(getTenNguoiNop());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cmndNguoiNop</column-name><column-value><![CDATA[");
		sb.append(getCmndNguoiNop());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>diaChiNguoiNop</column-name><column-value><![CDATA[");
		sb.append(getDiaChiNguoiNop());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soDienThoaiNguoiNop</column-name><column-value><![CDATA[");
		sb.append(getSoDienThoaiNguoiNop());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emailNguoiNop</column-name><column-value><![CDATA[");
		sb.append(getEmailNguoiNop());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = MotCuaNhanTraHoSo.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			MotCuaNhanTraHoSo.class
		};
	private long _id;
	private long _hoSoThuTucId;
	private String _tenNguoiNop;
	private String _cmndNguoiNop;
	private String _diaChiNguoiNop;
	private String _soDienThoaiNguoiNop;
	private String _emailNguoiNop;
	private MotCuaNhanTraHoSo _escapedModel;
}