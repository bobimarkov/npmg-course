package examples;

import java.util.Arrays;
import java.util.Scanner;

public class Broenka {
	private static Scanner sc = new Scanner(System.in);
	
	public static int findWinner(int n,int m) {
		int p = 0,counter = n,y=0;
		boolean[] x = new boolean[n];
		for(int i=0;i<x.length;i++) {
			x[i]=true;
		}
		do {
			if(y+m>n)y=(y+m)-n;
			else y+=m;
			x[y-1]=false;
			if(counter==2)p=y-1;
			counter--;

			System.out.println(Arrays.toString(x)+ " | "+(y-1));
		}
		while(counter>1);
		return p+m;
	}
	
	public static void main(String[] args) {
		System.out.print("Enter N: ");
		int n = Integer.parseInt(sc.nextLine());
		System.out.print("Enter M: ");
		int m = Integer.parseInt(sc.nextLine());
		System.out.println("Winner: "+findWinner(n,m));
	}

}
