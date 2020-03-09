package com.jspiders.basicjava.progams;
import java.util.*;

public class Add {
	
	
	public static void insertion(int[] a,int elem,int index) {
		
		int[] b=new int[a.length+1];
		for(int i=0;i<index;i++) 
		{
			if(i!=index) {
				b[i]=a[i];
			}
		}
			
				b[index]=elem;
			
			
		for(int i=index+1;i<=b.length-1;i++)
		{
			b[i]=a[i-1];
		}
		print(b);
		
		
		
	}
	
	
	public static void print(int[] b)
	{
		for(int i=0;i<b.length;i++)
		{
		   System.out.println(b[i]);
		}
	}

	public static void main(String[] args) {
		int[] a= {10,20,30,40};
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the element to be inserted");
		int elem=sc.nextInt();
		System.out.println("enter the index where element is to be inserted");
		int index=sc.nextInt();
		insertion(a,elem,index);
		
		
		
		
		
			
		

	}

}
