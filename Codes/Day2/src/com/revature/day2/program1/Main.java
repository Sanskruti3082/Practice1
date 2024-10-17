package com.revature.day2.program1;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the first element: ");
	String firstElement=sc.nextLine();
	
	System.out.println("Enter second element");
	int secondElement=sc.nextInt();
	
	Pair<String,Integer> pair=new Pair<>(firstElement,secondElement);
	System.out.println(pair);
	
}
}

