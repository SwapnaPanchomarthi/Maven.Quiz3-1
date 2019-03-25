package rocks.zipcode.io.quiz3.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        SomeType oddValue=null;
            for(int i=0; i<array.length;i++) {
                int k =getNumberOfOccurrences(array[i]);
                if(k%2==1)
                    oddValue= (SomeType) array[i];

            }
        return (SomeType) oddValue;
    }

    public SomeType findEvenOccurringValue() {
        SomeType oddValue=null;
        for(int i=0; i<array.length;i++) {
            int k =getNumberOfOccurrences(array[i]);
            if(k%2==0)
                oddValue= (SomeType) array[i];

        }
        return (SomeType) oddValue;


    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {


        Integer numberOfOccurences = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(valueToEvaluate)) {
                numberOfOccurences = numberOfOccurences + 1;

            }

        }
        return numberOfOccurences;

    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        return null;
    }
}
