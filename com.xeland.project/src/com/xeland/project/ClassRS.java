package com.xeland.project;

import java.util.function.Supplier;

public interface ClassRS<O> {

    Supplier<? extends O> get(O key);

}
