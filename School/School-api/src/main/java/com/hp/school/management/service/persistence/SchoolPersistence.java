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

package com.hp.school.management.service.persistence;

import com.hp.school.management.exception.NoSuchSchoolException;
import com.hp.school.management.model.School;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the school service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SchoolUtil
 * @generated
 */
@ProviderType
public interface SchoolPersistence extends BasePersistence<School> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SchoolUtil} to access the school persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the schools where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching schools
	 */
	public java.util.List<School> findByUuid(String uuid);

	/**
	 * Returns a range of all the schools where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SchoolModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of schools
	 * @param end the upper bound of the range of schools (not inclusive)
	 * @return the range of matching schools
	 */
	public java.util.List<School> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the schools where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SchoolModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of schools
	 * @param end the upper bound of the range of schools (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching schools
	 */
	public java.util.List<School> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<School>
			orderByComparator);

	/**
	 * Returns an ordered range of all the schools where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SchoolModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of schools
	 * @param end the upper bound of the range of schools (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching schools
	 */
	public java.util.List<School> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<School>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first school in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching school
	 * @throws NoSuchSchoolException if a matching school could not be found
	 */
	public School findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<School>
				orderByComparator)
		throws NoSuchSchoolException;

	/**
	 * Returns the first school in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching school, or <code>null</code> if a matching school could not be found
	 */
	public School fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<School>
			orderByComparator);

	/**
	 * Returns the last school in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching school
	 * @throws NoSuchSchoolException if a matching school could not be found
	 */
	public School findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<School>
				orderByComparator)
		throws NoSuchSchoolException;

	/**
	 * Returns the last school in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching school, or <code>null</code> if a matching school could not be found
	 */
	public School fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<School>
			orderByComparator);

	/**
	 * Returns the schools before and after the current school in the ordered set where uuid = &#63;.
	 *
	 * @param schoolId the primary key of the current school
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next school
	 * @throws NoSuchSchoolException if a school with the primary key could not be found
	 */
	public School[] findByUuid_PrevAndNext(
			long schoolId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<School>
				orderByComparator)
		throws NoSuchSchoolException;

	/**
	 * Removes all the schools where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of schools where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching schools
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the school where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchSchoolException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching school
	 * @throws NoSuchSchoolException if a matching school could not be found
	 */
	public School findByUUID_G(String uuid, long groupId)
		throws NoSuchSchoolException;

	/**
	 * Returns the school where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching school, or <code>null</code> if a matching school could not be found
	 */
	public School fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the school where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching school, or <code>null</code> if a matching school could not be found
	 */
	public School fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the school where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the school that was removed
	 */
	public School removeByUUID_G(String uuid, long groupId)
		throws NoSuchSchoolException;

	/**
	 * Returns the number of schools where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching schools
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the schools where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching schools
	 */
	public java.util.List<School> findByStatus(int status);

	/**
	 * Returns a range of all the schools where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SchoolModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of schools
	 * @param end the upper bound of the range of schools (not inclusive)
	 * @return the range of matching schools
	 */
	public java.util.List<School> findByStatus(int status, int start, int end);

	/**
	 * Returns an ordered range of all the schools where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SchoolModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of schools
	 * @param end the upper bound of the range of schools (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching schools
	 */
	public java.util.List<School> findByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<School>
			orderByComparator);

	/**
	 * Returns an ordered range of all the schools where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SchoolModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of schools
	 * @param end the upper bound of the range of schools (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching schools
	 */
	public java.util.List<School> findByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<School>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first school in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching school
	 * @throws NoSuchSchoolException if a matching school could not be found
	 */
	public School findByStatus_First(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<School>
				orderByComparator)
		throws NoSuchSchoolException;

	/**
	 * Returns the first school in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching school, or <code>null</code> if a matching school could not be found
	 */
	public School fetchByStatus_First(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<School>
			orderByComparator);

	/**
	 * Returns the last school in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching school
	 * @throws NoSuchSchoolException if a matching school could not be found
	 */
	public School findByStatus_Last(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<School>
				orderByComparator)
		throws NoSuchSchoolException;

	/**
	 * Returns the last school in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching school, or <code>null</code> if a matching school could not be found
	 */
	public School fetchByStatus_Last(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<School>
			orderByComparator);

	/**
	 * Returns the schools before and after the current school in the ordered set where status = &#63;.
	 *
	 * @param schoolId the primary key of the current school
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next school
	 * @throws NoSuchSchoolException if a school with the primary key could not be found
	 */
	public School[] findByStatus_PrevAndNext(
			long schoolId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<School>
				orderByComparator)
		throws NoSuchSchoolException;

	/**
	 * Removes all the schools where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeByStatus(int status);

	/**
	 * Returns the number of schools where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching schools
	 */
	public int countByStatus(int status);

	/**
	 * Returns all the schools where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching schools
	 */
	public java.util.List<School> findByG_S(long groupId, int status);

	/**
	 * Returns a range of all the schools where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SchoolModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of schools
	 * @param end the upper bound of the range of schools (not inclusive)
	 * @return the range of matching schools
	 */
	public java.util.List<School> findByG_S(
		long groupId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the schools where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SchoolModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of schools
	 * @param end the upper bound of the range of schools (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching schools
	 */
	public java.util.List<School> findByG_S(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<School>
			orderByComparator);

	/**
	 * Returns an ordered range of all the schools where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SchoolModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of schools
	 * @param end the upper bound of the range of schools (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching schools
	 */
	public java.util.List<School> findByG_S(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<School>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first school in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching school
	 * @throws NoSuchSchoolException if a matching school could not be found
	 */
	public School findByG_S_First(
			long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<School>
				orderByComparator)
		throws NoSuchSchoolException;

	/**
	 * Returns the first school in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching school, or <code>null</code> if a matching school could not be found
	 */
	public School fetchByG_S_First(
		long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<School>
			orderByComparator);

	/**
	 * Returns the last school in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching school
	 * @throws NoSuchSchoolException if a matching school could not be found
	 */
	public School findByG_S_Last(
			long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<School>
				orderByComparator)
		throws NoSuchSchoolException;

	/**
	 * Returns the last school in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching school, or <code>null</code> if a matching school could not be found
	 */
	public School fetchByG_S_Last(
		long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<School>
			orderByComparator);

	/**
	 * Returns the schools before and after the current school in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param schoolId the primary key of the current school
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next school
	 * @throws NoSuchSchoolException if a school with the primary key could not be found
	 */
	public School[] findByG_S_PrevAndNext(
			long schoolId, long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<School>
				orderByComparator)
		throws NoSuchSchoolException;

	/**
	 * Removes all the schools where groupId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 */
	public void removeByG_S(long groupId, int status);

	/**
	 * Returns the number of schools where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching schools
	 */
	public int countByG_S(long groupId, int status);

	/**
	 * Caches the school in the entity cache if it is enabled.
	 *
	 * @param school the school
	 */
	public void cacheResult(School school);

	/**
	 * Caches the schools in the entity cache if it is enabled.
	 *
	 * @param schools the schools
	 */
	public void cacheResult(java.util.List<School> schools);

	/**
	 * Creates a new school with the primary key. Does not add the school to the database.
	 *
	 * @param schoolId the primary key for the new school
	 * @return the new school
	 */
	public School create(long schoolId);

	/**
	 * Removes the school with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param schoolId the primary key of the school
	 * @return the school that was removed
	 * @throws NoSuchSchoolException if a school with the primary key could not be found
	 */
	public School remove(long schoolId) throws NoSuchSchoolException;

	public School updateImpl(School school);

	/**
	 * Returns the school with the primary key or throws a <code>NoSuchSchoolException</code> if it could not be found.
	 *
	 * @param schoolId the primary key of the school
	 * @return the school
	 * @throws NoSuchSchoolException if a school with the primary key could not be found
	 */
	public School findByPrimaryKey(long schoolId) throws NoSuchSchoolException;

	/**
	 * Returns the school with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param schoolId the primary key of the school
	 * @return the school, or <code>null</code> if a school with the primary key could not be found
	 */
	public School fetchByPrimaryKey(long schoolId);

	/**
	 * Returns all the schools.
	 *
	 * @return the schools
	 */
	public java.util.List<School> findAll();

	/**
	 * Returns a range of all the schools.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SchoolModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of schools
	 * @param end the upper bound of the range of schools (not inclusive)
	 * @return the range of schools
	 */
	public java.util.List<School> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the schools.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SchoolModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of schools
	 * @param end the upper bound of the range of schools (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of schools
	 */
	public java.util.List<School> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<School>
			orderByComparator);

	/**
	 * Returns an ordered range of all the schools.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SchoolModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of schools
	 * @param end the upper bound of the range of schools (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of schools
	 */
	public java.util.List<School> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<School>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the schools from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of schools.
	 *
	 * @return the number of schools
	 */
	public int countAll();

}