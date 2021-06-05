/*
 * This file is generated by jOOQ.
 */
package local.rdps.svja.dao.jooq.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import local.rdps.svja.dao.jooq.DefaultSchema;
import local.rdps.svja.dao.jooq.Indexes;
import local.rdps.svja.dao.jooq.Keys;
import local.rdps.svja.dao.jooq.tables.records.SessionsRecord;

import org.jetbrains.annotations.NotNull;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


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
public class Sessions extends TableImpl<SessionsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sessions</code>
     */
    public static final Sessions SESSIONS = new Sessions();

    /**
     * The class holding records for this type
     */
    @Override
    @NotNull
    public Class<SessionsRecord> getRecordType() {
        return SessionsRecord.class;
    }

    /**
     * The column <code>sessions.id</code>.
     */
    public final TableField<SessionsRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>sessions.session_data</code>.
     */
    public final TableField<SessionsRecord, String> SESSION_DATA = createField(DSL.name("session_data"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sessions.last_accessed</code>.
     */
    public final TableField<SessionsRecord, LocalDateTime> LAST_ACCESSED = createField(DSL.name("last_accessed"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    private Sessions(Name alias, Table<SessionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Sessions(Name alias, Table<SessionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>sessions</code> table reference
     */
    public Sessions(String alias) {
        this(DSL.name(alias), SESSIONS);
    }

    /**
     * Create an aliased <code>sessions</code> table reference
     */
    public Sessions(Name alias) {
        this(alias, SESSIONS);
    }

    /**
     * Create a <code>sessions</code> table reference
     */
    public Sessions() {
        this(DSL.name("sessions"), null);
    }

    public <O extends Record> Sessions(Table<O> child, ForeignKey<O, SessionsRecord> key) {
        super(child, key, SESSIONS);
    }

    @Override
    @NotNull
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    @NotNull
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SESSIONS_ID_INDEX, Indexes.SESSIONS_LA_INDEX);
    }

    @Override
    @NotNull
    public Identity<SessionsRecord, Integer> getIdentity() {
        return (Identity<SessionsRecord, Integer>) super.getIdentity();
    }

    @Override
    @NotNull
    public UniqueKey<SessionsRecord> getPrimaryKey() {
        return Keys.PK_SESSIONS;
    }

    @Override
    @NotNull
    public List<UniqueKey<SessionsRecord>> getKeys() {
        return Arrays.<UniqueKey<SessionsRecord>>asList(Keys.PK_SESSIONS, Keys.SQLITE_AUTOINDEX_SESSIONS_1);
    }

    @Override
    @NotNull
    public Sessions as(String alias) {
        return new Sessions(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public Sessions as(Name alias) {
        return new Sessions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public Sessions rename(String name) {
        return new Sessions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    @NotNull
    public Sessions rename(Name name) {
        return new Sessions(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row3<Integer, String, LocalDateTime> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
