package com.company;

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
}
