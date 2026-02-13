package ex0211.constructor;

class Test {
	private static Test t = new Test();
	private Test() {}
	
	public static Test getInstance() {
		return t;
	}
}
public class PrivateContructorExam {
	
}
