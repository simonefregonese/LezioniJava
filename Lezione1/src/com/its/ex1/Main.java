package com.its.ex1;

public class Main {
	
	
	
	public static void main (String[] args){
		
		int[] array = new int[10];	
		
		double somma = 0;
		int val = 0;
		
		
		for(int i=0; i<array.length; i++){
			array[i] = val;
			val++;
		}
		
		for(int i=0; i<array.length; i++){
			somma += array[i];
		}		
	
		double m = somma /array.length;			
		
		
		System.out.println(m);
		
		
	}
	

}
