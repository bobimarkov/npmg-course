package Store;

import java.util.Scanner;

public class Items {
    float price;
    String name;
    static int Xn=1;
    int X;

    public Items(){this.X=Xn++;}

    public Items(float price,String name) {
        this.price=price;
        this.name=name;
        this.X=Xn++;
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String Nn;
        int N;
        System.out.print("Enter number of items: ");
        Nn = sc.nextLine();
        N = Integer.parseInt(Nn);
        Items[] p = new Items[N];
        for(int i=0;i<N;i++){
            System.out.println("\nEnter information for item "+(i+1)+":");
            System.out.print("Name: ");String name = sc.nextLine();
            System.out.print("Price: ");String price = sc.nextLine();
            p[i] = new Items(Float.parseFloat(price),name);
        }
        System.out.println("\n===================================");
        for(int i=0;i<N;i++){
            System.out.println(p[i]);
        }
    }

    @Override
    public String toString() {
        return "\nItem "+X+":\nName: "+name+"\nPrice: "+ price;
    }
}
