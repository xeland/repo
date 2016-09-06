
package com.xeland.project;

import java.io.Serializable;
import java.util.UUID;

import org.eclipse.jdt.annotation.Nullable;


public class ClassObi implements Serializable {


    public ClassObi(final String debugInfo) {

    }

    public ClassObi(final UUID id) {

    }

    public ClassObi(final UUID id, final String debugInfo) {

    }

    @Override
    public final boolean equals(@Nullable final Object obj) {
        return true;
    }

    public final String getDebugInfo() {
        return "";
    }

    public final UUID getUuid() {
        return null;
    }

    @Override
    public final int hashCode() {
        return 0;
    }

    public boolean is(final String uuidString) {

        return false;
    }

    public final void setDebugInfo(final String debugInfo) {
    }

    @Override
    public final String toString() {
        return "";
    }
}
