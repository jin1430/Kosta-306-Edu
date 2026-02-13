package ex0213;

public class ExceptionExam {
	public static void main(String[] args) {
		System.out.println("**메인 시작**");
		System.out.println("args = " + args);
	try {
		System.out.println("args[0] = " + args[0]);
		
		int convertNo = Integer.parseInt(args[0]);
		System.out.println("변환 값 = " + convertNo);
		
		int result = 100/convertNo;
		System.out.println("나눈 결과 = " + result);
	} catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("인수 전달해 주세요. " + e); // e.toString() class 이름 : 메시지
	} catch(NumberFormatException e) {
		System.out.println("숫자만 입력해 주세요. " + e.getMessage()); // e.toString() class 이름 : 메시지
		System.out.println("오류 발생!" ); // e.toString() class 이름 : 메시지
	} catch(Exception e) {
		//개발자가 개발할 떄 예외에 대한 정보를 추적(디버깅)할 때 사용한다.
		//반드시 배포(production)환경에서는 제거해야한다.
		e.printStackTrace();
	}
	System.out.println("**메인 끝**");
	}
}
