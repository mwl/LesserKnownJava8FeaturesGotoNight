package com.trifork.gotonight.lesserknownjava8features;

import org.junit.Test;

import java.util.List;

import static java.lang.Integer.parseInt;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CollectionsTest {
    @Test
    public void canFindSumOfAllNumbersGreaterThanTwo() throws Exception {
        List<String> numbers = asList("1", "2", "3", "4");
        assertArrayEquals(new int[]{3, 4}, numbers.stream().mapToInt(Integer::parseInt).filter(value -> value > 2).toArray());
    }

    @Test
    public void canConvertListOfStringToListOfInts() throws Exception {
        List<String> numbers = asList(" 1 ", " 2 ", " 3 ", " 4 ");
        assertEquals(10, numbers.parallelStream().mapToInt((s) -> parseInt(s.trim())).sum());
    }

    @Test
    public void canMapMyModelToStrings() throws Exception {
        List<MyModel> myModels = asList(new MyModel("a", "b"), new MyModel("c", "d"));
        assertArrayEquals(new String[]{"a", "c"}, myModels.stream().map(myModel -> myModel.getFirstName()).toArray());
    }
}
