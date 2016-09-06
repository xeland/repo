package com.xeland.project;

import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

public interface ClassFL<F> {


  
    default ClassM<F> and(final ClassFL<F> filter) {
    	return null;
    }

  
    Class<F> getFilterObjectsBaseInterface();

   
    default ClassM<F> or(final ClassFL<F> filter) {
        return null;
    }

   
    @Nullable
    static <T> ClassFL<T> combineAnd(final List<@NonNull ClassFL<T>> filters, final Class<T> clazz) {
    	return null;
    }

    
    @Nullable
    static <T> ClassFL<T> combineOr(final List<@NonNull ClassFL<T>> filters, final Class<T> clazz) {
    	return null;
    }
}
