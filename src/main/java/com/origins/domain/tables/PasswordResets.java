/*
 * This file is generated by jOOQ.
*/
package com.origins.domain.tables;


import com.origins.domain.TsdSrrs;
import com.origins.domain.tables.records.PasswordResetsRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


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
public class PasswordResets extends TableImpl<PasswordResetsRecord> {

    private static final long serialVersionUID = -2051070666;

    /**
     * The reference instance of <code>tsd_srrs.password_resets</code>
     */
    public static final PasswordResets PASSWORD_RESETS = new PasswordResets();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PasswordResetsRecord> getRecordType() {
        return PasswordResetsRecord.class;
    }

    /**
     * The column <code>tsd_srrs.password_resets.email</code>.
     */
    public final TableField<PasswordResetsRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>tsd_srrs.password_resets.token</code>.
     */
    public final TableField<PasswordResetsRecord, String> TOKEN = createField("token", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>tsd_srrs.password_resets.created_at</code>.
     */
    public final TableField<PasswordResetsRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>tsd_srrs.password_resets</code> table reference
     */
    public PasswordResets() {
        this("password_resets", null);
    }

    /**
     * Create an aliased <code>tsd_srrs.password_resets</code> table reference
     */
    public PasswordResets(String alias) {
        this(alias, PASSWORD_RESETS);
    }

    private PasswordResets(String alias, Table<PasswordResetsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PasswordResets(String alias, Table<PasswordResetsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return TsdSrrs.TSD_SRRS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PasswordResets as(String alias) {
        return new PasswordResets(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PasswordResets rename(String name) {
        return new PasswordResets(name, null);
    }
}
