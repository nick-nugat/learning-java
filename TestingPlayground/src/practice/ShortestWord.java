/**
 * learning the String.split() method
 */
package practice;

public class ShortestWord {
    public static int findShort(String s){
        String[] sArray = s.split(" ");
        int shortestWord = sArray[0].length();
        for (String string : sArray) {
            if (string.length() < shortestWord) shortestWord = string.length();
        }

        return shortestWord;

    }
}
