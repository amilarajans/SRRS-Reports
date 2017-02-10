/*
 * This file is generated by jOOQ.
*/
package com.origins.domain.tables;


import com.origins.domain.TsdSrrs;
import com.origins.domain.tables.records.MigrationsRecord;

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
public class Migrations extends TableImpl<MigrationsRecord> {

    private static final long serialVersionUID = -1465012896;

    /**
     * The reference instance of <code>tsd_srrs.migrations</code>
     */
    public static final Migrations MIGRATIONS = new Migrations();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MigrationsRecord> getRecordType() {
        return MigrationsRecord.class;
    }

    /**
     * The column <code>tsd_srrs.migrations.migration</code>.
     */
    public final TableField<MigrationsRecord, String> MIGRATION = createField("migration", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>tsd_srrs.migrations.batch</code>.
     */
    public final TableField<MigrationsRecord, Integer> BATCH = createField("batch", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>tsd_srrs.migrations</code> table reference
     */
    public Migrations() {
        this("migrations", null);
    }

    /**
     * Create an aliased <code>tsd_srrs.migrations</code> table reference
     */
    public Migrations(String alias) {
        this(alias, MIGRATIONS);
    }

    private Migrations(String alias, Table<MigrationsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Migrations(String alias, Table<MigrationsRecord> aliased, Field<?>[] parameters) {
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
    public Migrations as(String alias) {
        return new Migrations(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Migrations rename(String name) {
        return new Migrations(name, null);
    }
}
