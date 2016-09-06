package com.xeland.project;

import java.util.Set;

import org.eclipse.jdt.annotation.NonNull;

public interface ClassPu<O, R extends ClassRe> {

   
    R createRegistration(ClassRS<@NonNull O> registrationResult);

   
    Set<@NonNull O> getObjectsToPublish();

 
    Class<R> getRegistrationClass();
}
