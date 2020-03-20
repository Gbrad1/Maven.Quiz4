package rocks.zipcode.quiz4.fundamentals;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        int middleIndex = string.length()/2;
        return string.charAt(middleIndex);
    }

    public static String capitalizeMiddleCharacter(String str) {
        String toReturn = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() / 2) {
                String toAdd = str.substring(i, i+1).toUpperCase();
                toReturn += toAdd;
            } else
                toReturn += str.charAt(i);
        }
        return toReturn;
    }

    public static String lowerCaseMiddleCharacter(String str) {
        String toReturn = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() / 2) {
                String toAdd = str.substring(i, i+1).toLowerCase();
                toReturn += toAdd;
            } else
                toReturn += str.charAt(i);
        }
        return toReturn;
    }

    public static Boolean isIsogram(String str) {
        char[] chars = str.toCharArray();
        /*With a single for loop I was able to complete the "positive tests" but not the
        negative ones. To get the negative, I needed to use a nested for loop but
        then the positive failed. To fix this solution, I sorted the string as we only
        need a boolean value.*/
        Arrays.sort(chars);
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        String toReturn = "";
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length - 1; i++) {
            if (charArray[i] == charArray[i + 1]) {
                i++;
            } else
                toReturn += charArray[i];
        }
        toReturn += charArray[charArray.length - 1];
        return toReturn;
    }

    public static String invertCasing(String str) {
        String toReturn = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                toReturn += str.substring(i, i + 1).toUpperCase();
            } else if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                toReturn += str.substring(i, i + 1).toLowerCase();
            }else
                toReturn += str.substring(i, i + 1);
        }
        return toReturn;
    }
}