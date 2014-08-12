package com.trifork.gotonight.lesserknownjava8features;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Sizes {
    Size[] value();
}
