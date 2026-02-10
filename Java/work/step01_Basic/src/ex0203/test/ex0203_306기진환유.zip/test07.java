package ex0203.test;

public class test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int y;
		int sum = 0;
		while(sum != 5) {
			x = (int)(Math.random()*6+1);
			y = (int)(Math.random()*6+1);
			
			sum = x+y;
			System.out.printf("(%d, %d)\n", x, y);
		}
		 
	}

}
