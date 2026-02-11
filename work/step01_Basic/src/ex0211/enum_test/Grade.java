package ex0211.enum_test;

/**
 * enum 는 열겨형으로 안에 정의된 정보는 static final상수이다
 */
public enum Grade {
	BASIC(0,"일반"), SILVER(1,"우수"), GOLD(2,"최우수");
	
	private final int code;
	private final String name;

	Grade(int code, String name) {//기본이 private 이다.
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
