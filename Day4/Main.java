package Day4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Avengers[] ave = new Avengers[5];
		for(int i=0;i<5;i++){
			ave[i] = new Avengers();
			ave[i].getDetails();
		}
		for(int i=0;i<5;i++){
			ave[i].displayDetails();
		}
	}

}
