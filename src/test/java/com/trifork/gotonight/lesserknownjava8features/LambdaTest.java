package com.trifork.gotonight.lesserknownjava8features;

import org.apache.commons.collections4.CollectionUtils;
import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class LambdaTest {

    @Test
    public void canUseCommonsLang() throws Exception {
        assertEquals("Bar", CollectionUtils.find(asList("Foo", "Bar", "Baz"), s -> s.endsWith("r")));

    }
}
