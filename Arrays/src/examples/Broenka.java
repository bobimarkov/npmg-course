package examples;

import java.util.Arrays;
import java.util.Scanner;

public class Broenka {
	private static Scanner sc = new Scanner(System.in);
	
	public static int findWinner(int n,int m) {
		int counter = n,y=0,zz;
		boolean[] x = new boolean[n];
		for(int i=0;i<x.length;i++) {
			x[i]=true;
		}
		do {
//			if(y+m>n)y=(y+m)-n;
//			else y+=m;
            zz=-1;
            int k=0,mc=0;
			for(int z=0;z<m;z++) {
                zz++;
                if((y+zz)%n==0 && (y+zz)>0)mc++;
                k=(y+zz)-(n*mc);
                if(x[k]==false)z--;
			}
            y=k;
			x[k]=false;
			counter--;

//			System.out.println(Arrays.toString(x)+ " | "+(y+1));
		}
		while(counter>=1);
		return y+1;
	}
	
	public static void main(String[] args) {
		System.out.print("Enter N: ");
		int n = Integer.parseInt(sc.nextLine());
		System.out.print("Enter M: ");
		int m = Integer.parseInt(sc.nextLine());
		System.out.println("Winner: "+findWinner(n,m));
	}

}
