/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.hp.school.management.model.impl;

import com.hp.school.management.model.School;
import com.hp.school.management.model.SchoolModel;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Types;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the School service. Represents a row in the &quot;sch_School&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>SchoolModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SchoolImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SchoolImpl
 * @generated
 */
public class SchoolModelImpl
	extends BaseModelImpl<School> implements SchoolModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a school model instance should use the <code>School</code> interface instead.
	 */
	public static final String TABLE_NAME = "sch_School";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"schoolId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"name", Types.VARCHAR},
		{"type_", Types.VARCHAR}, {"city", Types.VARCHAR},
		{"noOfstudent", Types.INTEGER}, {"createdBy", Types.BIGINT},
		{"updatedBy", Types.BIGINT}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"isActive", Types.BOOLEAN},
		{"status", Types.INTEGER}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("schoolId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("type_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("city", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("noOfstudent", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("createdBy", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("updatedBy", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("isActive", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("status", Types.INTEGER);
	}

	public static final String TABLE_SQL_CREATE =
		"create table sch_School (uuid_ VARCHAR(75) null,schoolId LONG not null primary key,groupId LONG,name VARCHAR(75) null,type_ VARCHAR(75) null,city VARCHAR(75) null,noOfstudent INTEGER,createdBy LONG,updatedBy LONG,createDate DATE null,modifiedDate DATE null,isActive BOOLEAN,status INTEGER)";

	public static final String TABLE_SQL_DROP = "drop table sch_School";

	public static final String ORDER_BY_JPQL = " ORDER BY school.schoolId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY sch_School.schoolId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final long GROUPID_COLUMN_BITMASK = 1L;

	public static final long STATUS_COLUMN_BITMASK = 2L;

	public static final long UUID_COLUMN_BITMASK = 4L;

	public static final long SCHOOLID_COLUMN_BITMASK = 8L;

	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
		_entityCacheEnabled = entityCacheEnabled;
	}

	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
		_finderCacheEnabled = finderCacheEnabled;
	}

	public SchoolModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _schoolId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSchoolId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _schoolId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return School.class;
	}

	@Override
	public String getModelClassName() {
		return School.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<School, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<School, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<School, Object> attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((School)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<School, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<School, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(School)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<School, Object>> getAttributeGetterFunctions() {
		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<School, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, School>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			School.class.getClassLoader(), School.class, ModelWrapper.class);

		try {
			Constructor<School> constructor =
				(Constructor<School>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException
							reflectiveOperationException) {

					throw new InternalError(reflectiveOperationException);
				}
			};
		}
		catch (NoSuchMethodException noSuchMethodException) {
			throw new InternalError(noSuchMethodException);
		}
	}

	private static final Map<String, Function<School, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<School, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<School, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<School, Object>>();
		Map<String, BiConsumer<School, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<School, ?>>();

		attributeGetterFunctions.put("uuid", School::getUuid);
		attributeSetterBiConsumers.put(
			"uuid", (BiConsumer<School, String>)School::setUuid);
		attributeGetterFunctions.put("schoolId", School::getSchoolId);
		attributeSetterBiConsumers.put(
			"schoolId", (BiConsumer<School, Long>)School::setSchoolId);
		attributeGetterFunctions.put("groupId", School::getGroupId);
		attributeSetterBiConsumers.put(
			"groupId", (BiConsumer<School, Long>)School::setGroupId);
		attributeGetterFunctions.put("name", School::getName);
		attributeSetterBiConsumers.put(
			"name", (BiConsumer<School, String>)School::setName);
		attributeGetterFunctions.put("type", School::getType);
		attributeSetterBiConsumers.put(
			"type", (BiConsumer<School, String>)School::setType);
		attributeGetterFunctions.put("city", School::getCity);
		attributeSetterBiConsumers.put(
			"city", (BiConsumer<School, String>)School::setCity);
		attributeGetterFunctions.put("noOfstudent", School::getNoOfstudent);
		attributeSetterBiConsumers.put(
			"noOfstudent", (BiConsumer<School, Integer>)School::setNoOfstudent);
		attributeGetterFunctions.put("createdBy", School::getCreatedBy);
		attributeSetterBiConsumers.put(
			"createdBy", (BiConsumer<School, Long>)School::setCreatedBy);
		attributeGetterFunctions.put("updatedBy", School::getUpdatedBy);
		attributeSetterBiConsumers.put(
			"updatedBy", (BiConsumer<School, Long>)School::setUpdatedBy);
		attributeGetterFunctions.put("createDate", School::getCreateDate);
		attributeSetterBiConsumers.put(
			"createDate", (BiConsumer<School, Date>)School::setCreateDate);
		attributeGetterFunctions.put("modifiedDate", School::getModifiedDate);
		attributeSetterBiConsumers.put(
			"modifiedDate", (BiConsumer<School, Date>)School::setModifiedDate);
		attributeGetterFunctions.put("isActive", School::getIsActive);
		attributeSetterBiConsumers.put(
			"isActive", (BiConsumer<School, Boolean>)School::setIsActive);
		attributeGetterFunctions.put("status", School::getStatus);
		attributeSetterBiConsumers.put(
			"status", (BiConsumer<School, Integer>)School::setStatus);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		_columnBitmask |= UUID_COLUMN_BITMASK;

		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@Override
	public long getSchoolId() {
		return _schoolId;
	}

	@Override
	public void setSchoolId(long schoolId) {
		_schoolId = schoolId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@Override
	public String getName() {
		if (_name == null) {
			return "";
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_name = name;
	}

	@Override
	public String getType() {
		if (_type == null) {
			return "";
		}
		else {
			return _type;
		}
	}

	@Override
	public void setType(String type) {
		_type = type;
	}

	@Override
	public String getCity() {
		if (_city == null) {
			return "";
		}
		else {
			return _city;
		}
	}

	@Override
	public void setCity(String city) {
		_city = city;
	}

	@Override
	public int getNoOfstudent() {
		return _noOfstudent;
	}

	@Override
	public void setNoOfstudent(int noOfstudent) {
		_noOfstudent = noOfstudent;
	}

	@Override
	public long getCreatedBy() {
		return _createdBy;
	}

	@Override
	public void setCreatedBy(long createdBy) {
		_createdBy = createdBy;
	}

	@Override
	public long getUpdatedBy() {
		return _updatedBy;
	}

	@Override
	public void setUpdatedBy(long updatedBy) {
		_updatedBy = updatedBy;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@Override
	public boolean getIsActive() {
		return _isActive;
	}

	@Override
	public boolean isIsActive() {
		return _isActive;
	}

	@Override
	public void setIsActive(boolean isActive) {
		_isActive = isActive;
	}

	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_columnBitmask |= STATUS_COLUMN_BITMASK;

		if (!_setOriginalStatus) {
			_setOriginalStatus = true;

			_originalStatus = _status;
		}

		_status = status;
	}

	public int getOriginalStatus() {
		return _originalStatus;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			0, School.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public School toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, School>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		SchoolImpl schoolImpl = new SchoolImpl();

		schoolImpl.setUuid(getUuid());
		schoolImpl.setSchoolId(getSchoolId());
		schoolImpl.setGroupId(getGroupId());
		schoolImpl.setName(getName());
		schoolImpl.setType(getType());
		schoolImpl.setCity(getCity());
		schoolImpl.setNoOfstudent(getNoOfstudent());
		schoolImpl.setCreatedBy(getCreatedBy());
		schoolImpl.setUpdatedBy(getUpdatedBy());
		schoolImpl.setCreateDate(getCreateDate());
		schoolImpl.setModifiedDate(getModifiedDate());
		schoolImpl.setIsActive(isIsActive());
		schoolImpl.setStatus(getStatus());

		schoolImpl.resetOriginalValues();

		return schoolImpl;
	}

	@Override
	public int compareTo(School school) {
		long primaryKey = school.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof School)) {
			return false;
		}

		School school = (School)object;

		long primaryKey = school.getPrimaryKey();

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
	public boolean isEntityCacheEnabled() {
		return _entityCacheEnabled;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _finderCacheEnabled;
	}

	@Override
	public void resetOriginalValues() {
		_originalUuid = _uuid;

		_originalGroupId = _groupId;

		_setOriginalGroupId = false;

		_setModifiedDate = false;

		_originalStatus = _status;

		_setOriginalStatus = false;

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<School> toCacheModel() {
		SchoolCacheModel schoolCacheModel = new SchoolCacheModel();

		schoolCacheModel.uuid = getUuid();

		String uuid = schoolCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			schoolCacheModel.uuid = null;
		}

		schoolCacheModel.schoolId = getSchoolId();

		schoolCacheModel.groupId = getGroupId();

		schoolCacheModel.name = getName();

		String name = schoolCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			schoolCacheModel.name = null;
		}

		schoolCacheModel.type = getType();

		String type = schoolCacheModel.type;

		if ((type != null) && (type.length() == 0)) {
			schoolCacheModel.type = null;
		}

		schoolCacheModel.city = getCity();

		String city = schoolCacheModel.city;

		if ((city != null) && (city.length() == 0)) {
			schoolCacheModel.city = null;
		}

		schoolCacheModel.noOfstudent = getNoOfstudent();

		schoolCacheModel.createdBy = getCreatedBy();

		schoolCacheModel.updatedBy = getUpdatedBy();

		Date createDate = getCreateDate();

		if (createDate != null) {
			schoolCacheModel.createDate = createDate.getTime();
		}
		else {
			schoolCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			schoolCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			schoolCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		schoolCacheModel.isActive = isIsActive();

		schoolCacheModel.status = getStatus();

		return schoolCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<School, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(4 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<School, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<School, Object> attributeGetterFunction = entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((School)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<School, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<School, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<School, Object> attributeGetterFunction = entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((School)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, School>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

	private String _uuid;
	private String _originalUuid;
	private long _schoolId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private String _name;
	private String _type;
	private String _city;
	private int _noOfstudent;
	private long _createdBy;
	private long _updatedBy;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private boolean _isActive;
	private int _status;
	private int _originalStatus;
	private boolean _setOriginalStatus;
	private long _columnBitmask;
	private School _escapedModel;

}