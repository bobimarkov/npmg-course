package exam1;

import java.util.Scanner;

public class Exercise {
	public static Scanner sc = new Scanner(System.in);

		
	public static double findPolinom(double x,int n,int[] a) {
		double P=0;
		for(int i=0;i<=n;i++) {
			P+=a[i]*(Math.pow(x, n-i));
		}
		return P;
	}
	
	public static double halfMethod(double l,double h,int n,int[] a) {
		double c = (l+h)/2;
		double e = (h-l)/2;
		if(e<0.000001 || findPolinom(c,n,a)==0) {
			return c;
		}
		else {
		if(findPolinom(l,n,a)*findPolinom(c,n,a)<0) return halfMethod(l,c,n,a);
		else return halfMethod(c,h,n,a);
		}
		}
	
	public static void main(String[] args) {
		System.out.print("Enter X: ");
		double x=Double.parseDouble(sc.nextLine());
		System.out.print("Enter N: ");
		int n=Integer.parseInt(sc.nextLine());
		System.out.println("Enter N+1 times A: ");
		int[] a = new int[n+1];
		for(int i=0;i<=n;i++)a[i]=Integer.parseInt(sc.nextLine());
		System.out.println("Polinom value: "+findPolinom(x,n,a));
		System.out.print("Enter L: ");
		double l=Double.parseDouble(sc.nextLine());
		System.out.print("Enter H: ");
		double h=Double.parseDouble(sc.nextLine());
		
		double Pl=findPolinom(l,n,a);
		double Ph=findPolinom(h,n,a);
		
		System.out.println("Polinom L value: "+Pl);
		System.out.println("Polinom H value: "+Ph);
		if(Pl*Ph<0) {
			System.out.println("X = "+halfMethod(l,h,n,a));
		}
	}

}
