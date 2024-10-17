package com.revature.day2.program1;


public class Pair<T,U> {

	private T first;
	private U second;
	
	//constructor
	public Pair(T first, U second) {
		super();
		this.first = first;
		this.second = second;
	}
	
	//getter n setter
	public T getFirst() {
		return first;
	}
	public void setFirst(T first) {
		this.first = first;
	}
	public U getSecond() {
		return second;
	}
	public void setSecond(U second) {
		this.second = second;
	}
	
	//tostring
	@Override
	public String toString() {
		return "Pair [first=" + first + ", second=" + second + "]";
	}
	
		
}
