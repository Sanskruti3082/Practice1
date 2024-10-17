package com.revature.day2.program2;

import java.util.Arrays;

public class GenericSwap {

	public static <T> void swap(T[] array) {
		
		if(array == null || array.length<2) {
			return;
		}
		
		//swap 1st n last ele
		T temp=array[0];
		array[0]=array[array.length-1];
		array[array.length-1]=temp;
	}
	
}
