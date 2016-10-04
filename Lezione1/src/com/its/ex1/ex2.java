package com.its.ex1;

import java.util.Random;

public class ex2 {
	
	//Random r = new Random(123);
	//int i = r.nextInt() --> i conterrà il prossimo numero pseudo casuale
	
	public static double avgfor(int arr[]){
		
		double somma = 0;
		for(int i=0; i<arr.length; i++){
			somma += arr[i];
		}		
		return somma / arr.length;
	}
	
	public static double avgwhile(int arr[]){
		int i = 0;
		double somma = 0;
		while(i<arr.length){
			somma += arr[i];
			i++;			
		}
		return somma/arr.length;
	}
	
	public static double avgforeach(int arr[]){
		
		double somma = 0;
		for(int i:arr){
			somma += i;
			
		}
		return somma / arr.length;
	}
	
	public static double avgdowhile(int arr[]){
		
		int i = 0;
		double somma = 0;
		do{
			somma += arr[i];
			i++;
		}
		while(i < arr.length);
		
		return somma / arr.length;
		
	}

	
	
	
	public static void main(String[] args){
		
		//int[] array = new int[10];
		int[] array = new int[Integer.parseInt(args[0])];
		Random r = new Random(123);
		double random = 0;
		
		for(int i=0; i<array.length;i++){
			array[i] = r.nextInt();
			//array[i] = i;
			
		}
		
		System.out.println(avgfor(array));
		System.out.println(avgwhile(array));
		System.out.println(avgforeach(array));
		System.out.println(avgdowhile(array));		
		
	}
}
