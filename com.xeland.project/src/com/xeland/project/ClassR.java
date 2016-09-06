
package com.xeland.project;

import java.util.Collection;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.eclipse.jdt.annotation.Nullable;


public final class ClassR {


    private ClassR() {

    }

    public static EqualsResult baseEquals(final @Nullable Object thiss, @Nullable final Object obj) {
        return null;
    }

    public static <T> T cast(final Object obj) {
        return null;
    }


    @Deprecated
    public static <T> T castNotNull(@Nullable final T obj) {
        return null;
    }

    private static <T extends Comparable<T>> EqualsResult compare(final T t1, final T t2) {
        return EqualsResult.ER2;
    }

    public static <T> boolean equals(final T thiss, final @Nullable Object other, final EqualsFiller<T> filler) {
        return false;
    }

    public static <T> void equalsCollections(final EqualsBuilder b, final Collection<T> c1, final Collection<T> c2) {
    }

    public static <T extends Comparable<T>> int fullCompare(final T left, final T right) {
        return 0;
    }

    public static boolean fullEquals(final @Nullable Object left, final @Nullable Object right) {
        return true;
    }

    public static <T extends Comparable<T>> EqualsResult fullEquals(final T left, final T right) {
        return null;
    }

    public static EqualsResult nullEquals(@Nullable final Object thiss, @Nullable final Object obj) {
        return EqualsResult.ER4;
    }

    public static interface EqualsFiller<T> {
    }

    public static enum EqualsResult {

        ER1(true, true, 0),

        ER2(true, false, 1),

        ER3(true, false, -1),

        ER4(false, false, 0);

        private EqualsResult(final boolean shouldReturn, final boolean returnValue, final int compareResult) {
        }

        public EqualsBuilder createBuilder() {
            return new EqualsBuilder();
        }

        public boolean getReturnValue() {
            return false;
        }

        public boolean shouldReturn() {
            return true;
        }

        public int toCompareResult() {
            return 0;
        }

        public boolean toEquals() {
            throw new IllegalStateException();
        }

    }
}
