package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    /**
     * Given two shuffled arrays `inputArray`, and `squareValues`,
     * ensure each `element` of `inputArray` has a corresponding `value` in `squaredValues`
     * such that `element == value*value`
     *
     * @param inputArray    an array of integers
     * @param squaredValues an array of integers
     * @return true if each `inputArray[i]` has a corresponding `squaredValues[j]` such that `squaredValues[j] == inputArray[i] * inputArray[i]`
     */
    public static Boolean compare(Integer[] inputArray, Integer[] squaredValues) {

        boolean flag = false;
        Integer[] newArr = new Integer[inputArray.length];
        List<Integer> list = Arrays.asList(inputArray);

        List<Integer> result = new ArrayList<Integer>();
        for (Integer digit : list) {
            result.add(digit * digit);
        }

//        int j=0;
//        for (int i=0;i<inputArray.length;i++) {
//           newArr[j]=inputArray[i]*inputArray[i];
//            //newArr[i] = (int) Math.pow(inputArray[i], 2);
//
//            //System.out.println(newArr[j]);
//            j++;
//        }
//        for(int m=0;m<newArr.length;m++) {
//            Arrays.sort(newArr);
//        }
        result.toArray(newArr);

        for(int k=0; k<newArr.length;k++) {
            if (newArr[k] == squaredValues[k]) {
                System.out.println(newArr[k]);

                flag = true;

            }
            else flag = false;
        }
        return flag;
    }
    }

