package com.trifork.gotonight.lesserknownjava8features;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Sizes.class)
public @interface Size {
    int min() default -1;
    int max() default -1;
    String locale() default "";
}
