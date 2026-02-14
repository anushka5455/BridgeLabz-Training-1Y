package com.gla.array.Level1;v
import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        // Solution 6: Mean height of 11 football players
        
        Scanner scanner = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0;
        
        for (int i = 0; i < 11; i++) {
            System.out.print("Enter height for player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }
        
        double mean = sum / 11;
        System.out.println("Mean height of the football team is: " + mean);
        scanner.close();
    }
}
