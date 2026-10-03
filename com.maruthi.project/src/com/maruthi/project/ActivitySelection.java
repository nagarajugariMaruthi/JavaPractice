package com.maruthi.project;

public class ActivitySelection {

    public static void selectActivities(int start[], int finish[]) {

        int n = start.length;

        System.out.println("Selected Activities:");

        // First activity always selected
        int i = 0;
        System.out.print(i + " ");

        for (int j = 1; j < n; j++) {

            // If current activity start time >= previous finish time
            if (start[j] >= finish[i]) {

                System.out.print(j + " ");

                i = j;
            }
        }
    }

    public static void main(String[] args) {

        int start[]  = {1, 3, 0, 5, 8, 5};
        int finish[] = {2, 4, 6, 7, 9, 9};

        selectActivities(start, finish);
    }
}