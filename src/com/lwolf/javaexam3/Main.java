package com.lwolf.javaexam3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by kdhaliwal on 3/3/2017.
 */
public class Main {
    public static void main(String[] args) {
        int n = 0;
        System.out.print("Enter n(>=1): ");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            n = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (n < 1) System.out.println("n must be greater than 0");
        else System.out.println("Sum of 1 to n: "+addNumbers(n));
    }

    private static int addNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
