package Arrayspro;

import java.util.Scanner;

public class Frequency {
	static void getArray() {
		
	  Scanner sc=new Scanner(System.in);
	   System.err.print("Enter the Size of Array:-");
	   int size=sc.nextInt();
	   int[] ar=new int[size];
	   System.err.print("Enter "+size+" values:-");
	   for (int i = 0; i < ar.length; i++)
      {
		   ar[i]=sc.nextInt();
		}
	      System.err.print("enter Key element:-");
	      int key=sc.nextInt();
	 frequecyArray(ar, key);
	 }   
	
 static void frequecyArray(int[] ar,int key)
 {
	        int count=0;
	        for (int i = 0; i < ar.length; i++) 
	        {
				if(ar[i]==key)
					count++;
			}
	    System.out.println("Frequency of "+key+" = "+(count));
  }
  public static void main(String[] args) {
	  getArray();
  }
}
	
	
     


