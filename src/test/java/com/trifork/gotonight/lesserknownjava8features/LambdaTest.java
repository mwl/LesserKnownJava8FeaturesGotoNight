package com.trifork.gotonight.lesserknownjava8features;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.ListUtils;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.collections4.TransformerUtils;
import org.junit.Test;

import java.util.List;

import static java.lang.Integer.parseInt;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class LambdaTest {
    @Test
    public void canConvertListOfStringToListOfInts() throws Exception {
        List<String> numbers = asList(" 1 ", " 2 ", " 3 ", " 4 ");
        assertEquals(10, numbers.parallelStream().mapToInt((s) -> parseInt(s.trim())).sum());
    }

    @Test
    public void canUseCommonsLang() throws Exception {
        assertEquals("Bar", CollectionUtils.find(asList("Foo", "Bar", "Baz"), s -> s.endsWith("r")));

    }
}
