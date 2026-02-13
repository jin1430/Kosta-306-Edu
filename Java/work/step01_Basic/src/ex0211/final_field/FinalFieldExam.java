package ex0211.final_field;

public class FinalFieldExam {
	int i; //인스턴스 필드 0
	
	//final 필드는 반드시 명시적 초기화필수(자동초기화 안됨)
	final int j;
	
	public FinalFieldExam(int j) {
		this.j=j;
	}
	
	static final int k=20;
	
	public static void main(String[] args) {
		System.out.println(FinalFieldExam.k);
		FinalFieldExam fe = new FinalFieldExam(5);
		System.out.println(fe.k);
		System.out.println(fe.i);
		System.out.println(fe.j);
	}
	
}
