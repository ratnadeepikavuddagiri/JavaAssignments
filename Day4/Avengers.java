package Day4;
import java.util.Scanner;

public class Avengers {
	String name;
	int age;
	float power;
	String weapon;
	String planet;

	Scanner S = new Scanner(System.in);
	public void getDetails(){
		System.out.print("Enter Name:");
		name = S.nextLine();
		System.out.print("Enter Age:");
		age = S.nextInt();
		System.out.print("Enter Power:");
		power = S.nextFloat();
		System.out.print("Enter Weapon:");
		weapon = S.next();
		System.out.print("Enter Planet:");
		planet = S.next();
		System.out.println();
	}
	public void displayDetails(){
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Power : "+power);
		System.out.println("Weapon : "+weapon);
		System.out.println("Planet : "+planet);
		System.out.println();
	}
}
