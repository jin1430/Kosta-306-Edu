package ex0213.shopping;

import java.util.Random;

//class NoKids extends RuntimeException{ 비체크 예외 이므로 선택 

class NoKids extends Exception { //체크 예외 이므로 필수
	static int exceptionNo=0;
	public NoKids() {
		super("애들은 가라");
		
	}
	public NoKids(String s) {
		super(s);
		
	}
}
/////////////////////////////////////////////////
class Shoppingmall {
	public void enter(int age) throws NoKids{
		
		
			if(age <18) {
				throw new NoKids(age+"살은 더 커서오세요");//체크예외
			} else {
				System.out.println(age+ "세 입니다.");
			
		} 
	}
}

public class ShoppingException {
	public static void main(String[] args) {
		NoKids nk = new NoKids();
		Shoppingmall sp = new Shoppingmall();
		Random r = new Random();
		
		 
		 for(int i=0; i<10; i++) {
			 int age = r.nextInt(55) + 1;
			 
			 try {
				 sp.enter(age);
			 } catch (NoKids e) {
				 System.out.println(e.getMessage()); 
				 nk.exceptionNo++;
			 }

		 }
		 System.out.println("예외 개수: " + nk.exceptionNo);
	}
}
