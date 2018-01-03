package exam2;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class CowsAndBulls {
	public static Scanner sc = new Scanner(System.in);
	
	public static int[] genNumber(int N) {
		Random r = new Random();
		int x[] = new int[N];
		x[0]=1+r.nextInt(9);
		for(int i=1;i<=N-1;i++) {
			int z=r.nextInt(10);
			boolean b = true;
			for(int n=0;n<i;n++) {
				if(z==x[n]) {i--;b=false;break;}
		}
			if(b)x[i]=z;
		}
		return x;
	}
	
	public static void findN(int N,int[] A,int counter) {
		System.out.println("Lives: "+counter);
		System.out.print("Enter number: ");
		int Bnum=Integer.parseInt(sc.nextLine());
		int B[] = new int[N];
		for(int i=0;i<N;i++) {
			int x=Bnum/(int)(Math.pow(10, N-i-1));
			if(i>0)x=x%10;
			//System.out.println(x);
			B[i]=x;
		}
		//System.out.println(Arrays.toString(B));
		int cows=0,bulls=0;
		for(int i=0;i<N;i++) {
			if(A[i]==B[i])bulls++;
			for(int n=0;n<N;n++) {
				if(A[i]==B[n])cows++;
			}
		}
		cows-=bulls;
		System.out.println(cows+" cows, "+bulls+" bulls\n");
		if(bulls==N)System.out.println("Congratulations! You won!");
		else {
			if(counter==0)System.out.println("No more lives! You lost!");
			else findN(N,A,counter-1);
		}
	}
	
	public static void main(String[] args) {
		System.out.print("Enter N: ");
		int N=Integer.parseInt(sc.nextLine()),Anum = 0;
		int[] A = genNumber(N);
		for(int i=0;i<N;i++) {
			Anum += Math.pow(10, (N-i-1))*A[i];
		}
		//System.out.println(Anum);
		findN(N,A,10);
	}

}
