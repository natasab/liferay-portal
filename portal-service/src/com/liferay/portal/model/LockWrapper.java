/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

package com.liferay.portal.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Lock}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       Lock
 * @generated
 */
public class LockWrapper implements Lock, ModelWrapper<Lock> {
	public LockWrapper(Lock lock) {
		_lock = lock;
	}

	public Class<?> getModelClass() {
		return Lock.class;
	}

	public String getModelClassName() {
		return Lock.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("lockId", getLockId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("className", getClassName());
		attributes.put("key", getKey());
		attributes.put("owner", getOwner());
		attributes.put("inheritable", getInheritable());
		attributes.put("expirationDate", getExpirationDate());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long lockId = (Long)attributes.get("lockId");

		if (lockId != null) {
			setLockId(lockId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		String className = (String)attributes.get("className");

		if (className != null) {
			setClassName(className);
		}

		String key = (String)attributes.get("key");

		if (key != null) {
			setKey(key);
		}

		String owner = (String)attributes.get("owner");

		if (owner != null) {
			setOwner(owner);
		}

		Boolean inheritable = (Boolean)attributes.get("inheritable");

		if (inheritable != null) {
			setInheritable(inheritable);
		}

		Date expirationDate = (Date)attributes.get("expirationDate");

		if (expirationDate != null) {
			setExpirationDate(expirationDate);
		}
	}

	/**
	* Returns the primary key of this lock.
	*
	* @return the primary key of this lock
	*/
	public long getPrimaryKey() {
		return _lock.getPrimaryKey();
	}

	/**
	* Sets the primary key of this lock.
	*
	* @param primaryKey the primary key of this lock
	*/
	public void setPrimaryKey(long primaryKey) {
		_lock.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this lock.
	*
	* @return the uuid of this lock
	*/
	public java.lang.String getUuid() {
		return _lock.getUuid();
	}

	/**
	* Sets the uuid of this lock.
	*
	* @param uuid the uuid of this lock
	*/
	public void setUuid(java.lang.String uuid) {
		_lock.setUuid(uuid);
	}

	/**
	* Returns the lock ID of this lock.
	*
	* @return the lock ID of this lock
	*/
	public long getLockId() {
		return _lock.getLockId();
	}

	/**
	* Sets the lock ID of this lock.
	*
	* @param lockId the lock ID of this lock
	*/
	public void setLockId(long lockId) {
		_lock.setLockId(lockId);
	}

	/**
	* Returns the company ID of this lock.
	*
	* @return the company ID of this lock
	*/
	public long getCompanyId() {
		return _lock.getCompanyId();
	}

	/**
	* Sets the company ID of this lock.
	*
	* @param companyId the company ID of this lock
	*/
	public void setCompanyId(long companyId) {
		_lock.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this lock.
	*
	* @return the user ID of this lock
	*/
	public long getUserId() {
		return _lock.getUserId();
	}

	/**
	* Sets the user ID of this lock.
	*
	* @param userId the user ID of this lock
	*/
	public void setUserId(long userId) {
		_lock.setUserId(userId);
	}

	/**
	* Returns the user uuid of this lock.
	*
	* @return the user uuid of this lock
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lock.getUserUuid();
	}

	/**
	* Sets the user uuid of this lock.
	*
	* @param userUuid the user uuid of this lock
	*/
	public void setUserUuid(java.lang.String userUuid) {
		_lock.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this lock.
	*
	* @return the user name of this lock
	*/
	public java.lang.String getUserName() {
		return _lock.getUserName();
	}

	/**
	* Sets the user name of this lock.
	*
	* @param userName the user name of this lock
	*/
	public void setUserName(java.lang.String userName) {
		_lock.setUserName(userName);
	}

	/**
	* Returns the create date of this lock.
	*
	* @return the create date of this lock
	*/
	public java.util.Date getCreateDate() {
		return _lock.getCreateDate();
	}

	/**
	* Sets the create date of this lock.
	*
	* @param createDate the create date of this lock
	*/
	public void setCreateDate(java.util.Date createDate) {
		_lock.setCreateDate(createDate);
	}

	/**
	* Returns the class name of this lock.
	*
	* @return the class name of this lock
	*/
	public java.lang.String getClassName() {
		return _lock.getClassName();
	}

	/**
	* Sets the class name of this lock.
	*
	* @param className the class name of this lock
	*/
	public void setClassName(java.lang.String className) {
		_lock.setClassName(className);
	}

	/**
	* Returns the key of this lock.
	*
	* @return the key of this lock
	*/
	public java.lang.String getKey() {
		return _lock.getKey();
	}

	/**
	* Sets the key of this lock.
	*
	* @param key the key of this lock
	*/
	public void setKey(java.lang.String key) {
		_lock.setKey(key);
	}

	/**
	* Returns the owner of this lock.
	*
	* @return the owner of this lock
	*/
	public java.lang.String getOwner() {
		return _lock.getOwner();
	}

	/**
	* Sets the owner of this lock.
	*
	* @param owner the owner of this lock
	*/
	public void setOwner(java.lang.String owner) {
		_lock.setOwner(owner);
	}

	/**
	* Returns the inheritable of this lock.
	*
	* @return the inheritable of this lock
	*/
	public boolean getInheritable() {
		return _lock.getInheritable();
	}

	/**
	* Returns <code>true</code> if this lock is inheritable.
	*
	* @return <code>true</code> if this lock is inheritable; <code>false</code> otherwise
	*/
	public boolean isInheritable() {
		return _lock.isInheritable();
	}

	/**
	* Sets whether this lock is inheritable.
	*
	* @param inheritable the inheritable of this lock
	*/
	public void setInheritable(boolean inheritable) {
		_lock.setInheritable(inheritable);
	}

	/**
	* Returns the expiration date of this lock.
	*
	* @return the expiration date of this lock
	*/
	public java.util.Date getExpirationDate() {
		return _lock.getExpirationDate();
	}

	/**
	* Sets the expiration date of this lock.
	*
	* @param expirationDate the expiration date of this lock
	*/
	public void setExpirationDate(java.util.Date expirationDate) {
		_lock.setExpirationDate(expirationDate);
	}

	public boolean isNew() {
		return _lock.isNew();
	}

	public void setNew(boolean n) {
		_lock.setNew(n);
	}

	public boolean isCachedModel() {
		return _lock.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_lock.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _lock.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _lock.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_lock.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _lock.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_lock.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new LockWrapper((Lock)_lock.clone());
	}

	public int compareTo(com.liferay.portal.model.Lock lock) {
		return _lock.compareTo(lock);
	}

	@Override
	public int hashCode() {
		return _lock.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.liferay.portal.model.Lock> toCacheModel() {
		return _lock.toCacheModel();
	}

	public com.liferay.portal.model.Lock toEscapedModel() {
		return new LockWrapper(_lock.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _lock.toString();
	}

	public java.lang.String toXmlString() {
		return _lock.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_lock.persist();
	}

	public long getExpirationTime() {
		return _lock.getExpirationTime();
	}

	public boolean isExpired() {
		return _lock.isExpired();
	}

	public boolean isNeverExpires() {
		return _lock.isNeverExpires();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Lock getWrappedLock() {
		return _lock;
	}

	public Lock getWrappedModel() {
		return _lock;
	}

	public void resetOriginalValues() {
		_lock.resetOriginalValues();
	}

	private Lock _lock;
}