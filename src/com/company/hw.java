package com.company;
import ibcsutils.*;

public class hw {

    public static void hw1() {
        // 1.1: 7 comparisons
        // 1.2: 2 comparisons
        int[] array = {-2, 9, 11, 12, 13, 14, 15, 22, 142};
        int key = 15;
        int lower_index = 0, higher_index = array.length - 1;
        boolean found = false;
        while (!found && (lower_index <= higher_index)) {
            int middle_index = (lower_index + higher_index) / 2;
            int middle_value = array[middle_index];
            if (middle_value == key) {
                System.out.println(middle_value);
                found = true;
            } else if (middle_value > key) {
                higher_index = middle_index - 1;
                System.out.println(middle_value);
            } else {
                lower_index = middle_index + 1;
                System.out.println(middle_value);
            }
        }
        System.out.println(found);
    }

    public static void hw2() {
        String[] students = {"Alissa", "Ben", "Charlie", "Dianna"};
        String[] grades = {"B", "D", "B", "A"};
        final String key = "Charlie";
        boolean found = false;
        String grade = " ";
        for (int i = 0; !found && i < students.length; i++)
            if (students[i].equals(key)) {
                found = true;
                grade = grades[i];
            }
        if (found)
            System.out.println("grade is " + grade);
        else
            System.out.println("error");
    }

    public static void hw3_1() {
        int[] data = {-4, 11, 7, -12, 6, 1};
        for (int s = 0; s < data.length - 1; s++) {
            int smallestInd = s;
            for (int c = s + 1; c < data.length; c++)
                if (data[c] < data[smallestInd])
                    smallestInd = c;
            swap(data, s, smallestInd);
        }
        for (int e : data)
            System.out.print(e + " ");
        System.out.println("");
    }

    static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public static void hw3_2() {
        int[] data = {-4, 11, 7, -12, 6, 1};
        boolean changed = true;
        int correct = 0;
        while (changed == true) {
            changed = false;
            for (int i = 0; i < data.length - 1 - correct; i++) {
                if (data[i] > data[i + 1]) {
                    swap(data, i, i + 1);
                    changed = true;
                }
            }
            correct++;
        }
        for (int e : data)
            System.out.print(e + " ");
        System.out.println("");
    }

    public static void hw4_1() { // sequential search for small array
        String link = "http://www-personal.umich.edu/~jlawler/wordlist";
        String[] words = ReadViaURL.readWords(link);
        String[] words_local = new String[20];
        int b = 0;
        for (int i = 0; i < words_local.length; i++) {
            words_local[i] = words[b];
            b++;
        }
        String key = "abacus";
        boolean found = false;
        for (int i = 0; !found && i < words_local.length; i++)
            if (words_local[i].equals(key))
                found = true;
        System.out.println(found);
    }

    public static void hw4_2() { // sequential search for large array
        String link = "http://www-personal.umich.edu/~jlawler/wordlist";
        String[] words = ReadViaURL.readWords(link);
        String[] words_local = new String[6000];
        int b = 0;
        for (int i = 0; i < words_local.length; i++) {
            words_local[i] = words[b];
            b++;
        }
        String key = "abacus";
        boolean found = false;
        for (int i = 0; !found && i < words_local.length; i++)
            if (words_local[i].equals(key))
                found = true;
        System.out.println(found);
    }

    public static void hw4_3() { //binary search for small array
        String link = "http://www-personal.umich.edu/~jlawler/wordlist";
        String[] words = ReadViaURL.readWords(link);
        String[] words_local = new String[20];
        int b = 0;
        for (int i = 0; i < words_local.length; i++) {
            words_local[i] = words[b];
            b++;
        }
        String key = "abacus";
        int lower_index = 0, higher_index = words_local.length - 1;
        boolean found = false;
        while (!found && (lower_index <= higher_index)) {
            int middle_index = (lower_index + higher_index) / 2;
            String middle_value = words_local[middle_index];
            if (middle_value.compareTo(key) == 0)
                found = true;
            else if (middle_value.compareTo(key) > 0)
                higher_index = middle_index - 1;
            else
                lower_index = middle_index + 1;
        }
        System.out.println(found);
    }

    public static void hw4_4() { //binary search for large array
        String link = "http://www-personal.umich.edu/~jlawler/wordlist";
        String[] words = ReadViaURL.readWords(link);
        String[] words_local = new String[6000];
        int b = 0;
        for (int i = 0; i < words_local.length; i++) {
            words_local[i] = words[b];
            b++;
        }
        String key = "abacus";
        int lower_index = 0, higher_index = words_local.length - 1;
        boolean found = false;
        while (!found && (lower_index <= higher_index)) {
            int middle_index = (lower_index + higher_index) / 2;
            String middle_value = words_local[middle_index];
            if (middle_value.compareTo(key) == 0)
                found = true;
            else if (middle_value.compareTo(key) > 0)
                higher_index = middle_index - 1;
            else
                lower_index = middle_index + 1;
        }
        System.out.println(found);
    }

}
