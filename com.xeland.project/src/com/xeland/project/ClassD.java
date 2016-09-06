package com.xeland.project;

import java.util.List;

import org.eclipse.jdt.annotation.Nullable;


public final class ClassD {

    public ClassD(final String displayName, @Nullable final Object defaultValue, final boolean multiValue, final ClassH<?> valueType) throws FailedException {
    }
    
    public ClassD(final String displayName, @Nullable final Object defaultValue, final boolean multiValue, final ClassH<?> valueType, final List<@Nullable ?> softRange)
            throws FailedException {
    }

    public ClassD(final ClassTh displayName, @Nullable final Object defaultValue, final boolean multiValue, final ClassH<?> valueType) throws FailedException {
    }

    public ClassD(final ClassTh displayName, @Nullable final Object defaultValue, final boolean multiValue, final ClassH<?> valueType, final List<@Nullable ?> softRange)
            throws FailedException {
    }

    @Override
    public boolean equals(@Nullable final Object obj) {
        return false;
    }

    public ClassH<?> getAttributeValueType() {
        return null;
    }

    @Nullable
    public Object getDefaultValue() {
        return null;
    }

    @Nullable
    public <V> V getDefaultValue(final Class<@Nullable V> type) throws FailedException {
            return null;
    }

    public ClassTh getDisplayName() {
        return null;
    }

    public String getNonLocalizedDisplayName() {
        return null;
    }

    public List<?> getSoftRange() {
        return null;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public boolean isMultiValue() {
        return true;
    }

    @Override
    public String toString() {
        return "";
    }

    public static ClassD from(final ClassMe attribute) {
        return null;
    }
}
