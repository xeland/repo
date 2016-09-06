package com.xeland.project;

import java.util.Set;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

public interface ClassSf extends ClassF, ClassIe<ClassObi> {


     String toDebugString();

    public enum SpecificationType {

    ST1(false, false, false, false),

    ST2(false, false, false, true),

    ST3(false, true, false, true),

    ST4(true, true, true, true);

 
    private SpecificationType(final boolean specificationModifiable, final boolean specificationRemovableFromSpecifiable, final boolean specificationRemovableFromSystem,
                final boolean attributeValuesOnSpecifiableModifiable) {
  }

         }

}
