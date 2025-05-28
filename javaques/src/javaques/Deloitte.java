package javaques;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Deloitte{
	int res=0;
	static int noofheadsofastikasheshanaga(int arr[], int N)
	{
		
		Scanner sc=new Scanner(System.in);
		int max=0;
		int min=Integer.MAX_VALUE;
		Arrays.sort(arr);
		min=arr[0];
		max=arr[arr.length-1];
		int res=(min+max);
		
		return res;
	}
	static int productofheadsofastikasheshanaga(int arr[], int N)
	{	
		int ans=0;
		Scanner sc=new Scanner(System.in);
		int max=0;
		int min=Integer.MAX_VALUE;
		Arrays.sort(arr);
		min=arr[0];
		max=arr[arr.length-1];
		int ans1=(min*max);

		return ans1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc= new Scanner(System.in);
		int n=Sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=Sc.nextInt();
		}
		System.out.println(noofheadsofastikasheshanaga(arr,n));
		System.out.println(productofheadsofastikasheshanaga(arr,n));
	}

}
