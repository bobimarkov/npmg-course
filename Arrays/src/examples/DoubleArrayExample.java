package examples;

import java.util.Arrays;
import java.util.Scanner;

public class DoubleArrayExample {
	private static Scanner sc = new Scanner(System.in);
	public static double[] inputDoubleArray() {
		System.out.print("Input number of elements: ");
		int N = Integer.parseInt(sc.nextLine());
		double[] a = new double[N];
		for(int i=0;i<a.length;i++) {
			System.out.printf("Input element[%d]: ",i);
			a[i] = Double.parseDouble(sc.nextLine());
		}
		return a;
	}
	
	public static double getAverage(double[] a) {
		double x = 0.0;
		for(int i=0;i<a.length;i++) {
			x+=a[i];
		}
		return x/a.length;
	}
	
	public static int getMinIndex(double[] a) {
		double min=a[0];
		int index=0;
		for(int i=1;i<a.length;i++) {
			if(min>a[i]) {min=a[i];index=i;}
		}
		return index;
	}
	
	public static double getMin(double[] a) {
		double min=a[0];
		int index=0;
		for(int i=1;i<a.length;i++) {
			if(min>a[i]) {min=a[i];index=i;}
		}
		return min;
	}
	
	public static int getMaxIndex(double[] a) {
		double max=a[0];
		int index=0;
		for(int i=1;i<a.length;i++) {
			if(max<a[i]) {max=a[i];index=i;}
		}
		return index;
	}
	
	public static double getMax(double[] a) {
		double max=a[0];
		int index=0;
		for(int i=1;i<a.length;i++) {
			if(max<a[i]) {max=a[i];index=i;}
		}
		return max;
	}
	
	public static void main(String[] args) {
		double[] a = inputDoubleArray();
		System.out.println(Arrays.toString(a));
		System.out.println("Min element is A["+getMinIndex(a)+"] = "+getMin(a));
		System.out.println("Max element is A["+getMaxIndex(a)+"] = "+getMax(a));
		System.out.println("Average: "+getAverage(a));
	}

}
