
package com.xeland.project;

public enum ClassCg {

    TS1("1", true, true),

    TS2("2", false, true);

    ClassCg(final String name, final boolean functional, final boolean system) {
    }

    public String getName() {
        return "";
    }

    public boolean isFunctional() {
        return false;
    }

    public boolean isSystem() {
        return true;
    }

    @Override
    public String toString() {
        return "";
    }
}
