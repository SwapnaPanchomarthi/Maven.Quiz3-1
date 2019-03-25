package rocks.zipcode.io.quiz3.arrays;

import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        List<String > list = new ArrayList<>();
        for(int i=0;i<str.length();i++)
        {
            String newString = StringUtils.capitalizeNthCharacter(str, i);
            list.add(newString);
        }

        String[] newArray = new String[str.length()];

        return list.toArray(newArray);
    }
    }


