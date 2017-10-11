package Store;

import java.util.Scanner;

public class Person {
    int age;
    String name;
    String SSN;
    String address;
    static int Xn=1;
    int X;

    public Person(){this.X=Xn++;}

    public Person(int age,String name,String SSN,String address) {
        this.age=age;
        this.name=name;
        this.SSN=SSN;
        this.address=address;
        this.X=Xn++;
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String Nn;
        int N;
        System.out.print("Enter number of people: ");
        Nn = sc.nextLine();
        N = Integer.parseInt(Nn);
        Person[] p = new Person[N];
        for(int i=0;i<N;i++){
            System.out.println("\nEnter information for person "+(i+1)+":");
            System.out.print("Name: ");String name = sc.nextLine();
            System.out.print("Age: ");String age = sc.nextLine();
            System.out.print("SSN: ");String SSN = sc.nextLine();
            System.out.print("Address: ");String address = sc.nextLine();
            p[i] = new Person(Integer.parseInt(age),name,SSN,address);
        }
        System.out.println("\n===================================");
        for(int i=0;i<N;i++){
            System.out.println(p[i]);
        }
    }

    @Override
    public String toString() {
        return "\nPerson "+X+":\nName: "+name+"\nAge: "+ age + "\nSSN: "+SSN+"\nAddress: "+address;
    }
}
