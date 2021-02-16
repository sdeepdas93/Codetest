package com.codetest.v1;

import java.util.Arrays;

public class Student {
	
	public static void main(String [] arg){
		
		System.out.println("Computer Course");
		ComputerCourse computerCourse=new ComputerCourse();
		System.out.println(computerCourse.bracketCheck("f://bracketCheck.txt"));
		System.out.println(computerCourse.ipAddressCheck("f://ipCheck.txt"));
		
		
		System.out.println("StatisticsCourse");
		StatisticsCourse statisticsCourse =new StatisticsCourse();
		System.out.println(statisticsCourse.getEmpMap());
		System.out.println(statisticsCourse.getAgeFilter());
		System.out.println(statisticsCourse.getSortedEmps());
		
		
		System.out.println("MathCources");
		MathCourse mathCourse=new MathCourse();
		System.out.println(mathCourse.isPrime(9));
		System.out.println(mathCourse.fib(8));
		int[] arr={1,55,6,88,9};
		System.out.println(Arrays.toString(mathCourse.sortArray(arr)));
		System.out.println(mathCourse.getSquareroot("25"));
		
		
	}

}
