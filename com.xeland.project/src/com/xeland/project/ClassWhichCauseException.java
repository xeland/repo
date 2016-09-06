package com.xeland.project;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;

import org.apache.felix.dm.annotation.api.Component;
import org.apache.felix.dm.annotation.api.ServiceDependency;
import org.apache.felix.dm.annotation.api.Start;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;


@Component(provides = { ClassSpu.class })
public final class ClassWhichCauseException implements ClassSpu<ClassL> {

    @Nullable
    private ClassST type;

    @Override
    public ClassL createRegistration(final ClassRS<@NonNull ClassST> registrationResult) {
        final Supplier<@NonNull ? extends ClassST> supplier = registrationResult.get(ClassPub.type(this.type));
        return supplier::get;
    }

    @Override
    public Set<@NonNull ClassST> getObjectsToPublish() {
        final HashSet<@NonNull ClassST> res = new HashSet<>();
        res.add(ClassPub.type(this.type));
        return res;
    }

    @Override
    public Class<ClassL> getRegistrationClass() {
        return ClassL.class;
    }

}

