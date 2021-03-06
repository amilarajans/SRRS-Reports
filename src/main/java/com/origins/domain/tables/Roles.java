/*
 * This file is generated by jOOQ.
*/
package com.origins.domain.tables;


import com.origins.domain.Keys;
import com.origins.domain.SrrsTsd;
import com.origins.domain.tables.records.RolesRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Roles extends TableImpl<RolesRecord> {

    private static final long serialVersionUID = -473544902;

    /**
     * The reference instance of <code>srrs_tsd.roles</code>
     */
    public static final Roles ROLES = new Roles();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RolesRecord> getRecordType() {
        return RolesRecord.class;
    }

    /**
     * The column <code>srrs_tsd.roles.id</code>.
     */
    public final TableField<RolesRecord, UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>srrs_tsd.roles.name</code>.
     */
    public final TableField<RolesRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>srrs_tsd.roles.created_at</code>.
     */
    public final TableField<RolesRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>srrs_tsd.roles.updated_at</code>.
     */
    public final TableField<RolesRecord, Timestamp> UPDATED_AT = createField("updated_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>srrs_tsd.roles</code> table reference
     */
    public Roles() {
        this("roles", null);
    }

    /**
     * Create an aliased <code>srrs_tsd.roles</code> table reference
     */
    public Roles(String alias) {
        this(alias, ROLES);
    }

    private Roles(String alias, Table<RolesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Roles(String alias, Table<RolesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return SrrsTsd.SRRS_TSD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<RolesRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_ROLES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RolesRecord> getPrimaryKey() {
        return Keys.KEY_ROLES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RolesRecord>> getKeys() {
        return Arrays.<UniqueKey<RolesRecord>>asList(Keys.KEY_ROLES_PRIMARY, Keys.KEY_ROLES_ROLES_NAME_UNIQUE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Roles as(String alias) {
        return new Roles(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Roles rename(String name) {
        return new Roles(name, null);
    }
}
