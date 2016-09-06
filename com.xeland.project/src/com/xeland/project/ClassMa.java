package com.xeland.project;

import org.eclipse.jdt.annotation.Nullable;

public interface ClassMa extends ClassNa {

	<T> boolean match(@Nullable T value1, @Nullable T value2);
}
