/*
 * This file is generated by jOOQ.
*/
package com.origins.domain;


import com.origins.DefaultCatalog;
import com.origins.domain.tables.*;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


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
public class TsdSrrs extends SchemaImpl {

    private static final long serialVersionUID = 742938090;

    /**
     * The reference instance of <code>tsd_srrs</code>
     */
    public static final TsdSrrs TSD_SRRS = new TsdSrrs();

    /**
     * The table <code>tsd_srrs.availabilities</code>.
     */
    public final Availabilities AVAILABILITIES = com.origins.domain.tables.Availabilities.AVAILABILITIES;

    /**
     * The table <code>tsd_srrs.categories</code>.
     */
    public final Categories CATEGORIES = com.origins.domain.tables.Categories.CATEGORIES;

    /**
     * The table <code>tsd_srrs.migrations</code>.
     */
    public final Migrations MIGRATIONS = com.origins.domain.tables.Migrations.MIGRATIONS;

    /**
     * The table <code>tsd_srrs.password_resets</code>.
     */
    public final PasswordResets PASSWORD_RESETS = com.origins.domain.tables.PasswordResets.PASSWORD_RESETS;

    /**
     * The table <code>tsd_srrs.permissions</code>.
     */
    public final Permissions PERMISSIONS = com.origins.domain.tables.Permissions.PERMISSIONS;

    /**
     * The table <code>tsd_srrs.reservations</code>.
     */
    public final Reservations RESERVATIONS = com.origins.domain.tables.Reservations.RESERVATIONS;

    /**
     * The table <code>tsd_srrs.resources</code>.
     */
    public final Resources RESOURCES = com.origins.domain.tables.Resources.RESOURCES;

    /**
     * The table <code>tsd_srrs.roles</code>.
     */
    public final Roles ROLES = com.origins.domain.tables.Roles.ROLES;

    /**
     * The table <code>tsd_srrs.role_has_permissions</code>.
     */
    public final RoleHasPermissions ROLE_HAS_PERMISSIONS = com.origins.domain.tables.RoleHasPermissions.ROLE_HAS_PERMISSIONS;

    /**
     * The table <code>tsd_srrs.staff</code>.
     */
    public final Staff STAFF = com.origins.domain.tables.Staff.STAFF;

    /**
     * The table <code>tsd_srrs.students</code>.
     */
    public final Students STUDENTS = com.origins.domain.tables.Students.STUDENTS;

    /**
     * The table <code>tsd_srrs.users</code>.
     */
    public final Users USERS = com.origins.domain.tables.Users.USERS;

    /**
     * The table <code>tsd_srrs.user_has_permissions</code>.
     */
    public final UserHasPermissions USER_HAS_PERMISSIONS = com.origins.domain.tables.UserHasPermissions.USER_HAS_PERMISSIONS;

    /**
     * The table <code>tsd_srrs.user_has_roles</code>.
     */
    public final UserHasRoles USER_HAS_ROLES = com.origins.domain.tables.UserHasRoles.USER_HAS_ROLES;

    /**
     * No further instances allowed
     */
    private TsdSrrs() {
        super("heroku_c21939b1ce2dfd5", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Availabilities.AVAILABILITIES,
            Categories.CATEGORIES,
            Migrations.MIGRATIONS,
            PasswordResets.PASSWORD_RESETS,
            Permissions.PERMISSIONS,
            Reservations.RESERVATIONS,
            Resources.RESOURCES,
            Roles.ROLES,
            RoleHasPermissions.ROLE_HAS_PERMISSIONS,
            Staff.STAFF,
            Students.STUDENTS,
            Users.USERS,
            UserHasPermissions.USER_HAS_PERMISSIONS,
            UserHasRoles.USER_HAS_ROLES);
    }
}
