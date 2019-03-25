package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        String beging = str.substring(0, indexToCapitalize);
        Character upperCase = Character.toUpperCase(str.charAt(indexToCapitalize));
        String end = str.substring(indexToCapitalize+1);

        return beging+upperCase+end;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return baseString.charAt(indexOfString)==characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {
        Set<String> list = new HashSet<>();
        for(int i=0;i<string.length();i++)
        {
            for(int j=i+1;j<=string.length();j++)
            {
                String sub=string.substring(i, j);
                list.add(sub);
            }
        }

        String[] strArr = new String[list.size()];

        return list.toArray(strArr);
    }

    public static Integer getNumberOfSubStrings(String input){
        int n = input.length();
        return (n * (n + 1) / 2)-1;

    }
}
