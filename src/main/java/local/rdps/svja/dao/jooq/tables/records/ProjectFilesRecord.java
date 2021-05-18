/*
 * This file is generated by jOOQ.
 */
package local.rdps.svja.dao.jooq.tables.records;


import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import local.rdps.svja.dao.jooq.tables.ProjectFiles;
import local.rdps.svja.dao.jooq.tables.interfaces.IProjectFiles;

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
public class ProjectFilesRecord extends UpdatableRecordImpl<ProjectFilesRecord> implements Record4<Integer, Integer, Integer, LocalDateTime>, IProjectFiles {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>project_files.project_id</code>.
     */
    @Override
    public void setProjectId(@NotNull Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>project_files.project_id</code>.
     */
    @NotNull
    @Override
    public Integer getProjectId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>project_files.file_id</code>.
     */
    @Override
    public void setFileId(@NotNull Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>project_files.file_id</code>.
     */
    @NotNull
    @Override
    public Integer getFileId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>project_files.modified_by</code>.
     */
    @Override
    public void setModifiedBy(@NotNull Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>project_files.modified_by</code>.
     */
    @NotNull
    @Override
    public Integer getModifiedBy() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>project_files.modified_date</code>.
     */
    @Override
    public void setModifiedDate(@Nullable LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>project_files.modified_date</code>.
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
        return ProjectFiles.PROJECT_FILES.PROJECT_ID;
    }

    @Override
    @NotNull
    public Field<Integer> field2() {
        return ProjectFiles.PROJECT_FILES.FILE_ID;
    }

    @Override
    @NotNull
    public Field<Integer> field3() {
        return ProjectFiles.PROJECT_FILES.MODIFIED_BY;
    }

    @Override
    @NotNull
    public Field<LocalDateTime> field4() {
        return ProjectFiles.PROJECT_FILES.MODIFIED_DATE;
    }

    @Override
    @NotNull
    public Integer component1() {
        return getProjectId();
    }

    @Override
    @NotNull
    public Integer component2() {
        return getFileId();
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
        return getProjectId();
    }

    @Override
    @NotNull
    public Integer value2() {
        return getFileId();
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
    public ProjectFilesRecord value1(@NotNull Integer value) {
        setProjectId(value);
        return this;
    }

    @Override
    @NotNull
    public ProjectFilesRecord value2(@NotNull Integer value) {
        setFileId(value);
        return this;
    }

    @Override
    @NotNull
    public ProjectFilesRecord value3(@NotNull Integer value) {
        setModifiedBy(value);
        return this;
    }

    @Override
    @NotNull
    public ProjectFilesRecord value4(@Nullable LocalDateTime value) {
        setModifiedDate(value);
        return this;
    }

    @Override
    @NotNull
    public ProjectFilesRecord values(@NotNull Integer value1, @NotNull Integer value2, @NotNull Integer value3, @Nullable LocalDateTime value4) {
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
    public void from(IProjectFiles from) {
        setProjectId(from.getProjectId());
        setFileId(from.getFileId());
        setModifiedBy(from.getModifiedBy());
        setModifiedDate(from.getModifiedDate());
    }

    @Override
    public <E extends IProjectFiles> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProjectFilesRecord
     */
    public ProjectFilesRecord() {
        super(ProjectFiles.PROJECT_FILES);
    }

    /**
     * Create a detached, initialised ProjectFilesRecord
     */
    public ProjectFilesRecord(@NotNull Integer projectId, @NotNull Integer fileId, @NotNull Integer modifiedBy, @Nullable LocalDateTime modifiedDate) {
        super(ProjectFiles.PROJECT_FILES);

        setProjectId(projectId);
        setFileId(fileId);
        setModifiedBy(modifiedBy);
        setModifiedDate(modifiedDate);
    }
}
