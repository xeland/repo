package com.xeland.project;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;



public final class ClassPub {


    private ClassPub() {

    }

    public static ClassST type(@Nullable final ClassST type) {
        throw new FailedException("exeption");
    }

    public static Set<@NonNull ClassST> typeObjects(@Nullable final ClassST... objects) {
        return null;
    }
}

