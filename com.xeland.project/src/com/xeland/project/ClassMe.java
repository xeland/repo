package com.xeland.project;

import java.util.List;

import org.eclipse.jdt.annotation.Nullable;


public interface ClassMe extends ClassIe<ClassC>, ClassNa {

   

    ClassH<?> getAttributeValueType();

   
    @Nullable
    Object getDefaultValue();

    
    @Nullable
    <V> V getDefaultValue(Class<@Nullable V> type) throws FailedException;

   
    List<@Nullable ?> getSoftRange();

   
    ClassSf getSpecification();

    
    boolean isMultiValue();

 
    void removeAttributeListener(ClassE listener) throws FailedException;

    void setSoftRange(List<@Nullable ?> values);
}
