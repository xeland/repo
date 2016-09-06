
package com.xeland.project;


public enum ClassP {

    C1("0"), C2("00"), C3("1"), C4("2"), C5("9");

    private String name;

    private ClassP(final String name) {
       this.name = name;
    }

    public String getName() {
       return this.name;
    }

    @Override
    public String toString() {
        return "";
    }
}
