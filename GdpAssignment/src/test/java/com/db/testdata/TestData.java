package com.db.testdata;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class TestData {

    public static final Map<String, List<Integer>> RATING_TYPE_MAP = Map.of(
            "Low", Arrays.asList(1, 2, 3, 4),
            "High", Arrays.asList(5, 6)
    );

    public static final Map<String, List<String>> CONTRIBUTING_AREAS_MAP = Map.of(
            "Low", Arrays.asList(
                    "Content not clear",
                    "Website loaded slowly",
                    "Difficult to navigate",
                    "Technical errors",
                    "Couldn't find content"
            ),
            "High", Arrays.asList(
                    "Content was clear",
                    "Website loaded fast",
                    "Easy to navigate",
                    "Website is great",
                    "Easy to find content"
            )
    );
}