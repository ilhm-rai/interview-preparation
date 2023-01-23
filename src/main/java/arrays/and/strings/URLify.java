package arrays.and.strings;

import util.Common;

import java.util.Arrays;

public class URLify {

    // Assume string has sufficient free space at the end
    public static void replaceSpaces(char[] arr, int trueLength) {
        int spaceCount = 0, index, i = 0;
        for (i = 0; i < trueLength; i++) {
            if (arr[i] == ' ') {
                spaceCount++;
            }
        }
        index = trueLength + spaceCount * 2;
        if (trueLength < arr.length) arr[trueLength] = '\0';
        for (i = trueLength - 1; i >= 0; i--) {
            if (arr[i] == ' ') {
                arr[index - 1] = '0';
                arr[index - 2] = '2';
                arr[index - 3] = '%';
                index = index - 3;
            } else {
                arr[index - 1] = arr[i];
                index--;
            }
        }
    }

    public static int findLastCharacter(char[] str) {
        for (int i = str.length - 1; i >= 0; i--) {
            if (str[i] != ' ') {
                return i;
            }
        }
        return -1;
    }

    public static String replaceSpaces2(String str, int trueLength) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < trueLength; i++) {
            if (str.charAt(i) == ' ') {
                builder.append("%20");
            } else {
                builder.append(str.charAt(i));
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String str = "Mr John Smith    ";
        char[] arr = str.toCharArray();
        int trueLength = findLastCharacter(arr) + 1;
        replaceSpaces(arr, trueLength);
        System.out.println("\"" + Common.charArrayToString(arr) + "\"");

        String str2 = "Mrs John Smith      ";
        char[] arr2 = str2.toCharArray();
        int trueLength2 = findLastCharacter(arr2) + 1;
        String replacedStr = replaceSpaces2(str2, trueLength2);
        System.out.println("\"" + replacedStr + "\"");
    }
}
