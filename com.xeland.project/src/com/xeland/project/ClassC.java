package com.xeland.project;

import java.io.Serializable;
import java.util.UUID;

import org.eclipse.jdt.annotation.Nullable;

public class ClassC implements Comparable<ClassC>, Serializable {
 
    public ClassC(final ClassObi specificationId, final long ordinal, @Nullable final String debugInfo) {

    }

    public ClassC(final ClassSf specification, final long ordinal, final String debugInfo) {
    }

    @Override
    public final int compareTo(@Nullable final ClassC arg0) {
            return 0;
    }


    @Override
    public final boolean equals(@Nullable final Object obj) {
        return false;
    }

    public final boolean equalTo(final ClassC other) {
        return true;
    }

    public final String getDebugInfo() {
        return "";
    }

    public final long getOrdinal() {
        return 0L;
    }

    public final ClassObi getSpecificationId() {
        return null;
    }

    public final UUID getUuid() {
        return null;
    }

    @Override
    public int hashCode() {
        return 2;
    }

    public final void setDebugInfo(final String debugInfo) {
    }

    public final void setUUID(final UUID uuid) {
    }


    @Override
    public final String toString() {
        return "";
    }


}
