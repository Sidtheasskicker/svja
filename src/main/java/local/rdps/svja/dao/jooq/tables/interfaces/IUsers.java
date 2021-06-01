/*
 * This file is generated by jOOQ.
 */
package local.rdps.svja.dao.jooq.tables.interfaces;


import java.io.Serializable;
import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


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
public interface IUsers extends Serializable {

    /**
     * Setter for <code>users.id</code>.
     */
    public void setId(@NotNull Integer value);

    /**
     * Getter for <code>users.id</code>.
     */
    @NotNull
    public Integer getId();

    /**
     * Setter for <code>users.username</code>.
     */
    public void setUsername(@NotNull String value);

    /**
     * Getter for <code>users.username</code>.
     */
    @NotNull
    public String getUsername();

    /**
     * Setter for <code>users.password</code>.
     */
    public void setPassword(@Nullable String value);

    /**
     * Getter for <code>users.password</code>.
     */
    @Nullable
    public String getPassword();

    /**
     * Setter for <code>users.login_count</code>.
     */
    public void setLoginCount(@NotNull Integer value);

    /**
     * Getter for <code>users.login_count</code>.
     */
    @NotNull
    public Integer getLoginCount();

    /**
     * Setter for <code>users.last_login_date</code>.
     */
    public void setLastLoginDate(@Nullable LocalDateTime value);

    /**
     * Getter for <code>users.last_login_date</code>.
     */
    @Nullable
    public LocalDateTime getLastLoginDate();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IUsers
     */
    public void from(IUsers from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IUsers
     */
    public <E extends IUsers> E into(E into);
}