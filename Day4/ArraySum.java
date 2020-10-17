package Day4;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a =new int[5];
		int sum=0;
		Scanner S =new Scanner(System.in);
		for(int i=0;i<5;i++){
			System.out.println("Enter number "+(i+1)+" : ");
			a[i] = S.nextInt();
			sum += a[i];
		}
		System.out.println("Sum of array elements : "+sum);
	}

}
