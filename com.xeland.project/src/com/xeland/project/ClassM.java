package com.xeland.project;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

public class ClassM<F> implements ClassFL<F> {


    public ClassM(final ClassLo operation, final Class<F> clazz) {

    }

    public final void add(final ClassFL<? extends F> filter) {
    }

   
    public final void addFilters(final Collection<@NonNull ? extends ClassFL<? extends F>> newFilters) {
    }

   
    @SafeVarargs
    public final void addFilters(@NonNull final ClassFL<? extends F>... newFilters) {
    }

    @Override
    public final boolean equals(@Nullable final Object obj) {
        return false;
    }


    @Override
    public final Class<F> getFilterObjectsBaseInterface() {
        return null;
    }


    @SuppressWarnings("unchecked")
    public final List<ClassFL<F>> getFilters() {
        return null;
    }


    public final ClassLo getOperation() {
        return null;
    }

    @Override
    public final int hashCode() {
        return 1;
    }
}
