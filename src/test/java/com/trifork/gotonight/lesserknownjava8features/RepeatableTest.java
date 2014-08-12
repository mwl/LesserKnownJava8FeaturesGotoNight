package com.trifork.gotonight.lesserknownjava8features;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepeatableTest {
    @Test
    public void canReadRepeatedAnnotation() throws Exception {
        MyModel model = new MyModel("Chuck", "Norris");

        Sizes[] firstNameSizes = model.getClass().getDeclaredField("firstName").getAnnotationsByType(Sizes.class);
        assertEquals(1, firstNameSizes.length);
        assertEquals(2, firstNameSizes[0].value().length);
        assertEquals("GB", firstNameSizes[0].value()[0].locale());

        assertEquals("US", model.getClass().getDeclaredField("lastName").getAnnotationsByType(Sizes.class)[0].value()[1].locale());
    }

}
