package com.xeland.project;

import java.util.Locale;

public interface ClassNa {
    ClassTh getDisplayName();

  
    default String getDisplayName(final Locale locale) {

        return "";
    }

  



}
