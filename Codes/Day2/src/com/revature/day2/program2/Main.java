package com.revature.day2.program2;

import java.util.Arrays;

public class Main {
public static void main(String[] args) {
	
	Integer[] intArray= {1,2,3,4,5};
	
	System.out.println("Original array: "+Arrays.toString(intArray));
	GenericSwap.swap(intArray);
	System.out.println("After swapping array: "+Arrays.toString(intArray));

	String[] strArray= {"Pune","Banglore","Hyderabad","Chennai"};
	System.out.println("Original String"+Arrays.toString(strArray));
	GenericSwap.swap(strArray);
	System.out.println("After swapping:"+Arrays.toString(strArray));

}
}
