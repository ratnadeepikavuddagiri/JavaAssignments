package Day4;

public class ArrayOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array =new int[5];
		array[0] = 1;
		array[1] = 5;
		array[2] = 2;
		array[3] = 45;
		array[4] = 34;
		for(int i=0;i<5;i++){
			if(array[i]%2 == 1)
				System.out.println(array[i]);
		}
	}

}
