package Day3;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		String name;
		int dd,mm,yy;
		float salary;
		System.out.println("Enter Name : ");
		name=S.nextLine();
		System.out.println("Enter Birth Date : ");
		dd=S.nextInt();
		System.out.println("Enter Month Of Birth : ");
		mm=S.nextInt();
		System.out.println("Enter Birth Year : ");
		yy=S.nextInt();
		System.out.println("Enter Salary : ");
		salary=S.nextFloat();
		float tax=0;
		if(salary>=500000){
			tax = (salary*20)/100;			
		}
		else if(salary<500000 && salary>=400000){
			tax = (salary*15)/100;			
		}
		else if(salary<400000 && salary>=300000){
			tax = (salary*10)/100;			
		}
		else if(salary<300000 && salary>=200000){
			tax = (salary*5)/100;			
		}
		else{
			tax=0;
		}
		System.out.println("Name is : "+name);
		System.out.println("Age is : "+(2020-yy));
		System.out.println("Annual Salary is : "+(salary-tax));
		System.out.println("Tax Amount is : "+tax);
		
	}

}
