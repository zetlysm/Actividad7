/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacomp7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hgarz
 */
public class JavaComp7 {

    private static ArrayList getPrimeNumbers(int num) {
        ArrayList<Integer> primeNumbers = new ArrayList();
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    private static void getFibonacci(int num, long[] series)
    {
        series[0] = 0;
        series[1] = 1;

        for (int i = 2; i < num; i++) {
            series[i] = series[i - 1] + series[i - 2];
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Type a positive number.");  
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("Input Integer is: "+num);
        long[] series = new long[num];
        
        getPrimeNumbers(num);
        System.out.println(" ");
        System.out.println("Prime Numbers: \n"+getPrimeNumbers(num));
        System.out.println(" ");
        
        //getFibonacci(num);
        //System.out.println("Fibonacci Sequence: "+getFibonacci(num));
        
        getFibonacci(num, series);
        System.out.println("Fibonacci Sequence: ");
        for (int i = 0; i < num; i++) {
            System.out.print(series[i] + ", ");
        }
         
    }
    
}
