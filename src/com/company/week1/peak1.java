package com.company.week1;

import java.util.Scanner;

public class peak1 {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        String arr = scanner.nextLine();
        int[] A = new int[len];
        int result =0;
        String[] array = arr.split("\\|");
        for (int i = 0; i < arr.length()+1;i++) {
            A[i] = Integer.parseInt(array[i]);
        }

        if (A[0] >= A[1]) result = 0;
        for (int j = 1; j < len-1;j++){
            if (A[j-1] <= A[j] && A[j] >= A[j+1]) result = j;

        }
        if (A[A.length-2] <= A[A.length-1]) result = A.length-1;

        System.out.println(result);

    }
}
