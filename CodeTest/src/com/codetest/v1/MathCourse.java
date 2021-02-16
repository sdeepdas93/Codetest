package com.codetest.v1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MathCourse {
	
	public static boolean isPrime(int number) {
	    return !IntStream.rangeClosed(2, number/2).anyMatch(i -> number%i == 0); 
	}
	
	public int fib(int n)
    {
    if (n <= 1)
       return n;
    return fib(n-1) + fib(n-2);
    }
	
	public int[] sortArray(int [] arr){
		
		Arrays.sort(arr);
		return arr;
	}
	public double getSquareroot(String number){
		
		try{
		 return  Math.pow(Double.parseDouble(number), 0.5);
		}catch (Exception e){ return 0.0;}
	}
	

}
