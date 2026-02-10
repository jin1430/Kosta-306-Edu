package ex0203.test;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력: ");
		String name = sc.next();
		int korean, math, english;
		
		korean = (int)(Math.random()*55+45);
		math = (int)(Math.random()*55+45);
		english = (int)(Math.random()*55+45);
		
		int total = korean + math + english;
		double mean = (double)total/3;
		char grade;
//		//if
//		if(100>=mean&& mean>=90) {
//			grade = 'A';
//		} else if(mean>=80) {
//			grade = 'B';
//		} else if(mean>=70) {
//			grade = 'C';
//		}else if(mean>=60) {
//			grade = 'D';
//		} else {
//			grade = 'F';
//		}
		//case
		grade = switch((int)(mean/10)) {
		case 10,9 -> 'A';
		case 8 -> 'B';
		case 7-> 'C';
		case 6-> 'D';
		default -> 'F';
		} ;
			
		
		System.out.println("결과: " + name + "님 성적표");
		System.out.println("국어 = "+ korean);
		System.out.println("영어 = "+ english);
		System.out.println("수학 = "+ math);

		System.out.println("총점 = "+ total);
		System.out.printf("평균 = %.2f",mean);
		System.out.println("학점 = " + grade);
		
		
		
	}
}
