package com.jspiders.basicjava.progams;

import java.util.Arrays;

public class Even {
	
	public static int[] test(int[] ar) {
		int n=ar.length-1;
		int[] n1=new int[n];
		
		int j=0;
		
		
		for(int i=0;i<ar.length;i++)
		{
			
				if(ar[i]%2==0)
				{
					n1[j]=ar[i];
					j++;
					
				}
		}
		int[] n2=new int[j];
		
		    for(int k=0;k<n2.length;k++)
		     {
			n2[k]=n1[k];
			
		      }
//		       Arrays.sort(n2);
	           return n2;
			
		          }
		
	public static void main(String[] args)
	  {
		int[] ar= {8,5,2,6,1,3};
		int[] n2=test(ar);
		
			System.out.println(Arrays.toString(n2) );
	
		
		
	}

}
