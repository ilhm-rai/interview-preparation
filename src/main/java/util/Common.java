package util;

import linkedlist.LinkedListNode;

import java.util.List;

public class Common {

    public static String charArrayToString(char[] chars) {
        StringBuilder builder = new StringBuilder(chars.length);
        for (char ch : chars) {
            if (ch == 0) {
                break;
            }
            builder.append(ch);
        }
        return builder.toString();
    }

    public static int getCharNumber(Character c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');

        int val = Character.getNumericValue(c);
        if (a <= val && val <= z) {
            return val - a;
        }
        return -1;
    }

    public static int[] buildCharFrequencyTable(String phrase) {
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (char c : phrase.toCharArray()) {
            int x = getCharNumber(c);
            if (x != -1) {
                table[x]++;
            }
        }
        return table;
    }

    public static int randomInt(int n) {
        return (int) (Math.random() * n);
    }

    public static int randomIntInRange(int min, int max) {
        return randomInt(max + 1 - min) + min;
    }

    public static int[][] randomMatrix(int M, int N, int min, int max) {
        int[][] matrix = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = randomIntInRange(min, max);
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 10 && matrix[i][j] > -10) {
                    System.out.print(" ");
                }
                if (matrix[i][j] < 100 && matrix[i][j] > -100) {
                    System.out.print(" ");
                }
                if (matrix[i][j] >= 0) {
                    System.out.print(" ");
                }
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static LinkedListNode createLinkedListFromArray(int[] vals) {
        LinkedListNode head = new LinkedListNode(vals[0], null, null);
        LinkedListNode current = head;
        for (int i = 1; i < vals.length; i++) {
            current = new LinkedListNode(vals[i], null, current);
        }
        return head;
    }

    public static LinkedListNode randomLinkedList(int n, int min, int max) {
        LinkedListNode head = new LinkedListNode(randomIntInRange(min, max), null, null);
        LinkedListNode prev = head;
        for (int i = 1; i < n; i++) {
            int data = randomIntInRange(min, max);
            LinkedListNode next = new LinkedListNode(data, null, null);
            prev.setNext(next);
            prev = next;
        }
        var list = List.of(1,2,3);
        return head;
    }

    public static int[] createRandomArray(int n, int min, int max) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = randomIntInRange(min, max);
        }
        return arr;
    }

    public static void main(String[] args) {
    }
}
