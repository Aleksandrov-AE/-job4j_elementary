package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        String temp;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                for (int i = index + 1; i < array.length; i++) {
                    if (array[i] != null) {
                        temp = array[i];
                        array[index] = temp;
                        array[i] = null;
                        break;
                    }
                }
            }
        }
        return array;
    }
}

