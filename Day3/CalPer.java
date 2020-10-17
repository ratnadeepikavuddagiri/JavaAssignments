package Day3;
import java.util.Scanner;

public class CalPer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner S =new Scanner(System.in);
		int s1,s2,s3,s4,s5;
		System.out.println("Enter Subject 1 Marks: ");
		s1=S.nextInt();
		System.out.println("Enter Subject 2 Marks: ");
		s2=S.nextInt();
		System.out.println("Enter Subject 3 Marks: ");
		s3=S.nextInt();
		System.out.println("Enter Subject 4 Marks: ");
		s4=S.nextInt();
		System.out.println("Enter Subject 5 Marks: ");
		s5=S.nextInt();
		int per = (s1+s2+s3+s4+s5)/5;
		System.out.println("Percentage : "+per);
		if(per<=100 && per>90){
			System.out.println("Grade : A");
		}
		else if(per<=90 && per>80){
			System.out.println("Grade : B");
		}
		else if(per<=80 && per>70){
			System.out.println("Grade : C");
		}
		else if(per<=70 && per>60){
			System.out.println("Grade : D");
		}
		else if(per<=60 && per>50){
			System.out.println("Grade : E");
		}
		else{
			System.out.println("Grade : F");
		}	
	}

}
