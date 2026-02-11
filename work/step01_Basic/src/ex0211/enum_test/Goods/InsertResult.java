package ex0211.enum_test.Goods;

public enum InsertResult {
	/**
	 * 상품코드 중복되었을때
	 */
	INSERT_DUPLICATE,
	
	/**
	 * 배열의 길이를 벗어 낫을때 
	 */
	INSERT_OUTINDEX,

	
	/**
	 * 등록이 선언했을때 
	 */
	INSERT_SECCESS;
}