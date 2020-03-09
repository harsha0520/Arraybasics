package com.jspiders.basicjava.progams;

import java.util.Scanner;

public class Remove1 {
	
	
		
		public static int search(int a[],int n,int start)
		{
			if(start<a.length) {
				if(a[start]!=n)
				{
					return start;
				}
				start++;
				return search(a,n,start);
			
		}
			else {
				return 0;
			}
		
	}
		public static int[] remove(int a[],int b[],int index,int start) {
			if(start<index) {
				b[start]=a[start];
				start++;
				return remove(a,b,index,start);
			}
			else if(start-1<a.length){
				b[start-1]=a[start];
				start++;
				return remove(a,b,index,start);
				
			}
			else
			{
				return b;
			}
		}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element:");
		int n=sc.nextInt();
		int [] a= {10,20,30,40};
	     int start=0;
		
		
		search(a,n,start);
	
		
	   

	}

}
