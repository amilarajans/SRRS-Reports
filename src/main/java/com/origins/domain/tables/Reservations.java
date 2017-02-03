/*
 * This file is generated by jOOQ.
*/
package com.origins.domain.tables;


import com.origins.domain.Keys;
import com.origins.domain.TsdSrrs;
import com.origins.domain.tables.records.ReservationsRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class Reservations extends TableImpl<ReservationsRecord> {

    private static final long serialVersionUID = 1916268940;

    /**
     * The reference instance of <code>tsd_srrs.reservations</code>
     */
    public static final Reservations RESERVATIONS = new Reservations();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReservationsRecord> getRecordType() {
        return ReservationsRecord.class;
    }

    /**
     * The column <code>tsd_srrs.reservations.id</code>.
     */
    public final TableField<ReservationsRecord, UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>tsd_srrs.reservations.resource_id</code>.
     */
    public final TableField<ReservationsRecord, UInteger> RESOURCE_ID = createField("resource_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>tsd_srrs.reservations.name</code>.
     */
    public final TableField<ReservationsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>tsd_srrs.reservations.address</code>.
     */
    public final TableField<ReservationsRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>tsd_srrs.reservations.nic_number</code>.
     */
    public final TableField<ReservationsRecord, String> NIC_NUMBER = createField("nic_number", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>tsd_srrs.reservations.conact_number</code>.
     */
    public final TableField<ReservationsRecord, String> CONACT_NUMBER = createField("conact_number", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>tsd_srrs.reservations.email_address</code>.
     */
    public final TableField<ReservationsRecord, String> EMAIL_ADDRESS = createField("email_address", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>tsd_srrs.reservations.start</code>.
     */
    public final TableField<ReservationsRecord, Timestamp> START = createField("start", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>tsd_srrs.reservations.end</code>.
     */
    public final TableField<ReservationsRecord, Timestamp> END = createField("end", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>tsd_srrs.reservations.created_at</code>.
     */
    public final TableField<ReservationsRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>tsd_srrs.reservations.updated_at</code>.
     */
    public final TableField<ReservationsRecord, Timestamp> UPDATED_AT = createField("updated_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>tsd_srrs.reservations</code> table reference
     */
    public Reservations() {
        this("reservations", null);
    }

    /**
     * Create an aliased <code>tsd_srrs.reservations</code> table reference
     */
    public Reservations(String alias) {
        this(alias, RESERVATIONS);
    }

    private Reservations(String alias, Table<ReservationsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Reservations(String alias, Table<ReservationsRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ReservationsRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_RESERVATIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ReservationsRecord> getPrimaryKey() {
        return Keys.KEY_RESERVATIONS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ReservationsRecord>> getKeys() {
        return Arrays.<UniqueKey<ReservationsRecord>>asList(Keys.KEY_RESERVATIONS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ReservationsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ReservationsRecord, ?>>asList(Keys.RESERVATIONS_RESOURCE_ID_FOREIGN);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Reservations as(String alias) {
        return new Reservations(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Reservations rename(String name) {
        return new Reservations(name, null);
    }
}
