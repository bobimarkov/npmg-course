package exam3;

import java.util.Scanner;

public class Contragent {
	private static Scanner sc = new Scanner(System.in);
	
	private String id;
	private String name;
	private String address;
	private boolean isCompany;
	private String phone;
	
	public Contragent() {}
	
	public Contragent(String id,String name, String address, boolean isCompany, String phone) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.isCompany = isCompany;
		this.phone = phone;
	}
	
	public void input() {
		System.out.print("Enter ID: ");
		id = sc.nextLine();
		System.out.print("Enter contragent name: ");
		name = sc.nextLine();
		System.out.print("Enter contragent address: ");
		address = sc.nextLine();
		System.out.print("Is the contragent company or human(true or false): ");
		isCompany = Boolean.parseBoolean(sc.nextLine());
		System.out.print("Enter contragent phone: ");
		phone = sc.nextLine();
	}
	
	public static void main(String[] args) {
		Contragent[] contragents = {
				new Contragent("9823802323","Alex Alexiev","Planet Mars",false,"0123456789"),
				new Contragent("4343452335","Jupiter Computers LTD","Planet Jupiter",true,"9876543210"),
				new Contragent()
			};
			
			contragents[2].input();
			for(int i=0;i<3;i++)System.out.println(contragents[i]);	
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nId: ").append(id);
		builder.append("\nName: ").append(name);
		builder.append("\nAddress: ").append(address);
		builder.append("\nCompany: ").append(isCompany);
		builder.append("\nPhone: ").append(phone).append("\n");
		return builder.toString();
	}
	
}
