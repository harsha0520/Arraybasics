package com.jspiders.basicjava.progams;
import java.util.*;

public class Remove {

	
	public static void remove(int[] arr,int n) {
				
	   for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]!=arr[n])
			{
				System.out.println(arr[i]);
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of index:");
		int n=sc.nextInt();
	    remove(arr,n);

	}

}
