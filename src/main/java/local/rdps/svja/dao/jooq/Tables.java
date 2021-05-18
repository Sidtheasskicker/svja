/*
 * This file is generated by jOOQ.
 */
package local.rdps.svja.dao.jooq;


import javax.annotation.processing.Generated;

import local.rdps.svja.dao.jooq.tables.Files;
import local.rdps.svja.dao.jooq.tables.GroupPermissions;
import local.rdps.svja.dao.jooq.tables.Groups;
import local.rdps.svja.dao.jooq.tables.ProjectFiles;
import local.rdps.svja.dao.jooq.tables.Projects;
import local.rdps.svja.dao.jooq.tables.SqliteSequence;
import local.rdps.svja.dao.jooq.tables.UserGroups;
import local.rdps.svja.dao.jooq.tables.Users;


/**
 * Convenience access to all tables in the default schema.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.14.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>files</code>.
     */
    public static final Files FILES = Files.FILES;

    /**
     * The table <code>group_permissions</code>.
     */
    public static final GroupPermissions GROUP_PERMISSIONS = GroupPermissions.GROUP_PERMISSIONS;

    /**
     * The table <code>groups</code>.
     */
    public static final Groups GROUPS = Groups.GROUPS;

    /**
     * The table <code>project_files</code>.
     */
    public static final ProjectFiles PROJECT_FILES = ProjectFiles.PROJECT_FILES;

    /**
     * The table <code>projects</code>.
     */
    public static final Projects PROJECTS = Projects.PROJECTS;

    /**
     * The table <code>sqlite_sequence</code>.
     */
    public static final SqliteSequence SQLITE_SEQUENCE = SqliteSequence.SQLITE_SEQUENCE;

    /**
     * The table <code>user_groups</code>.
     */
    public static final UserGroups USER_GROUPS = UserGroups.USER_GROUPS;

    /**
     * The table <code>users</code>.
     */
    public static final Users USERS = Users.USERS;
}
