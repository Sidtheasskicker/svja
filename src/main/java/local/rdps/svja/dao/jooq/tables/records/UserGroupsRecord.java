/*
 * This file is generated by jOOQ.
 */
package local.rdps.svja.dao.jooq.tables.records;


import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import local.rdps.svja.dao.jooq.tables.UserGroups;
import local.rdps.svja.dao.jooq.tables.interfaces.IUserGroups;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.14.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserGroupsRecord extends UpdatableRecordImpl<UserGroupsRecord> implements Record4<Integer, Integer, Integer, LocalDateTime>, IUserGroups {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>user_groups.user_id</code>.
     */
    @Override
    public void setUserId(@NotNull Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>user_groups.user_id</code>.
     */
    @NotNull
    @Override
    public Integer getUserId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>user_groups.group_id</code>.
     */
    @Override
    public void setGroupId(@NotNull Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>user_groups.group_id</code>.
     */
    @NotNull
    @Override
    public Integer getGroupId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>user_groups.modified_by</code>.
     */
    @Override
    public void setModifiedBy(@NotNull Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>user_groups.modified_by</code>.
     */
    @NotNull
    @Override
    public Integer getModifiedBy() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>user_groups.modified_date</code>.
     */
    @Override
    public void setModifiedDate(@Nullable LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>user_groups.modified_date</code>.
     */
    @Nullable
    @Override
    public LocalDateTime getModifiedDate() {
        return (LocalDateTime) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row4<Integer, Integer, Integer, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row4<Integer, Integer, Integer, LocalDateTime> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<Integer> field1() {
        return UserGroups.USER_GROUPS.USER_ID;
    }

    @Override
    @NotNull
    public Field<Integer> field2() {
        return UserGroups.USER_GROUPS.GROUP_ID;
    }

    @Override
    @NotNull
    public Field<Integer> field3() {
        return UserGroups.USER_GROUPS.MODIFIED_BY;
    }

    @Override
    @NotNull
    public Field<LocalDateTime> field4() {
        return UserGroups.USER_GROUPS.MODIFIED_DATE;
    }

    @Override
    @NotNull
    public Integer component1() {
        return getUserId();
    }

    @Override
    @NotNull
    public Integer component2() {
        return getGroupId();
    }

    @Override
    @NotNull
    public Integer component3() {
        return getModifiedBy();
    }

    @Override
    @Nullable
    public LocalDateTime component4() {
        return getModifiedDate();
    }

    @Override
    @NotNull
    public Integer value1() {
        return getUserId();
    }

    @Override
    @NotNull
    public Integer value2() {
        return getGroupId();
    }

    @Override
    @NotNull
    public Integer value3() {
        return getModifiedBy();
    }

    @Override
    @Nullable
    public LocalDateTime value4() {
        return getModifiedDate();
    }

    @Override
    @NotNull
    public UserGroupsRecord value1(@NotNull Integer value) {
        setUserId(value);
        return this;
    }

    @Override
    @NotNull
    public UserGroupsRecord value2(@NotNull Integer value) {
        setGroupId(value);
        return this;
    }

    @Override
    @NotNull
    public UserGroupsRecord value3(@NotNull Integer value) {
        setModifiedBy(value);
        return this;
    }

    @Override
    @NotNull
    public UserGroupsRecord value4(@Nullable LocalDateTime value) {
        setModifiedDate(value);
        return this;
    }

    @Override
    @NotNull
    public UserGroupsRecord values(@NotNull Integer value1, @NotNull Integer value2, @NotNull Integer value3, @Nullable LocalDateTime value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IUserGroups from) {
        setUserId(from.getUserId());
        setGroupId(from.getGroupId());
        setModifiedBy(from.getModifiedBy());
        setModifiedDate(from.getModifiedDate());
    }

    @Override
    public <E extends IUserGroups> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserGroupsRecord
     */
    public UserGroupsRecord() {
        super(UserGroups.USER_GROUPS);
    }

    /**
     * Create a detached, initialised UserGroupsRecord
     */
    public UserGroupsRecord(@NotNull Integer userId, @NotNull Integer groupId, @NotNull Integer modifiedBy, @Nullable LocalDateTime modifiedDate) {
        super(UserGroups.USER_GROUPS);

        setUserId(userId);
        setGroupId(groupId);
        setModifiedBy(modifiedBy);
        setModifiedDate(modifiedDate);
    }
}
