package examples;

import java.util.Scanner;

public class SimpleNumLess {
	private static Scanner sc = new Scanner(System.in);

	public static void SNL(int n){
		boolean[] x = new boolean[n+1];
		for(int i=0;i<=n;i++)x[i]=true;
		for(int i=2;i<=n;i++){
			if(x[i]==true){
				System.out.println(i);
				for(int j=i+i;j<=n;j+=i){
					x[j]=false;
				}
			}
		}
	}

	public static void main(String[] args) {
		System.out.print("Enter N: ");
		int N=Integer.parseInt(sc.nextLine());
		SNL(N);
	}

}
