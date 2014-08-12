package com.trifork.gotonight.lesserknownjava8features;

public class MyModel {
    @Size(max = 12, locale = "GB")
    @Size(max = 10, locale = "US")
    private final String firstName;

    @Sizes({
            @Size(max = 12, locale = "GB"),
            @Size(max = 10, locale = "US")}
    )
    private final String lastName;

    public MyModel(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
