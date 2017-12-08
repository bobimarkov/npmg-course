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
//			if(y+m>n)y=(y+m)-n;
//			else y+=m;
			for(int z=0;z<m;z++) {
				if(x[y]==false) {z--;y++;continue;}
				if(y+1==n)y=0;
				else y++;
				System.out.println("Y = "+y+"  |  Z = "+z+"  |  X[Y] = "+x[y]);
			}
			if(y==0) x[y]=false;
			else x[y-1]=false;
			if(counter==2)p=y;
			counter--;

			System.out.println(Arrays.toString(x)+ " | "+(y));
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
