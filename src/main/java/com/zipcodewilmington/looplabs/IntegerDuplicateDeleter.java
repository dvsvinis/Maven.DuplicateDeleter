package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }


    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {

        String answerString = "";
        for (int i = 0; i < array.length; i++) {
            int counter = 0;

            for (int j = 0; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    counter++;
                }
            }

            if (counter < maxNumberOfDuplications) {
                answerString += array[i];
            }
        }

        return stringToIntegerArray(answerString);
    }


    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String answerString = "";
        for (int i = 0; i < array.length; i++) {
            int counter = 0;

            for (int j = 0; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    counter++;
                }
            }
            if (counter != exactNumberOfDuplications) {
                answerString += array[i];
            }
        }
        return stringToIntegerArray(answerString);
    }


    public Integer[] stringToIntegerArray(String answerString) {
        String[] stringArray = answerString.split("");
        Integer[] answer = new Integer[stringArray.length];

        if (!stringArray[0].equals("")) {

            for (int i = 0; i < stringArray.length; i++) {
                answer[i] = Integer.valueOf(stringArray[i]);
            }
            return answer;
        } else {
            return new Integer[0];
        }
    }

}
