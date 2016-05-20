
package com.ishuqi.commonutil;

import java.util.List;

//add for test
public class PrintUtil {

    public static <T> void printArray(T[] array) {
        if (array == null || array.length == 0) {
            System.out.println("array is null or empty");
            return;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("index = " + i + ", " + array[i].toString());
        }
    }

    public static <T> void printList(List<T> list) {
        if (list == null || list.size() == 0) {
            System.out.println("list is null or empty");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("index = " + i + ", " + list.get(i).toString());
        }
    }

    public static void printEmptyLine() {
        printEmptyLine(1);
    }

    public static void printEmptyLine(int lines) {
        if (lines <= 0) {
            lines = 1;
        }
        for (int i = 0; i < lines; i++) {
            System.out.println();
        }
    }

}
