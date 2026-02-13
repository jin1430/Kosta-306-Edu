package ex0211.enum_test;

public enum Grade {
//		BASIC, SILVER, GOLD
	BASIC(0,"일반"), SILVER(1,"우수"), GOLD(2,"최우수");
	
	private final int code;
	private final String name;
	
	Grade(int code, String name) {
		this.code = code;
		this.name = name;
	}
	public int getCode() {
		return code;
	}
	
	public String getName() {
		return name;
	}
}

