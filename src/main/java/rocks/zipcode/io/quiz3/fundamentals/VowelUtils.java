package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        boolean flag=false;
        for(int i=0; i<word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                flag = true;

            }
            else flag
                    =false;

        }
        return flag;
    }


    public static Integer getIndexOfFirstVowel(String word) {
        Integer index=null;
        for(int i=0; i<word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                index=i;
                break;

            }

        }
        return index;
    }


    public  static Boolean startsWithVowel(String word) {
        boolean flag=false;


        if ((word.charAt(0) == 'a'||word.charAt(0) == 'A') || (word.charAt(0) == 'e'||word.charAt(0) == 'E') || (word.charAt(0) == 'i'||word.charAt(0) == 'I') || (word.charAt(0) == 'o' ||word.charAt(0) == 'O')|| (word.charAt(0) == 'u'||word.charAt(0) == 'U'))
            flag = true;

        else flag = false;


        return flag;
    }

    public static Boolean isVowel(Character character) {
        boolean flag = false;
        String s = character.toString();

        if ((character == 'a'||character == 'A') || (character == 'e'||character == 'E' )|| (character == 'i'||character == 'I' )|| (character == 'o'||character == 'O') || (character == 'u'||character == 'U'))
            flag = true;

        else flag = false;


        return flag;
    }
}
