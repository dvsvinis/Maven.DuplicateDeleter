package com.zipcodewilmington.looplabs;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    public String[] removeDuplicatesExactly(int Duplicates) {
        return Arrays.stream(array).filter(i -> Collections.frequency(Arrays.asList(array), i) != Duplicates)
                .toArray(String[]::new);
    }

    public String[] removeDuplicates(int Duplicates) {
        return Arrays.stream(array).filter(i -> Collections.frequency(Arrays.asList(array), i) < Duplicates)
                .toArray(String[]::new);

    }
}
