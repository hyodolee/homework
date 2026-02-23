package ex0213.ex01;

public class ShoppingException extends RuntimeException{
	public static int age;
	
	public ShoppingException() {}
	public ShoppingException(String message) {
		super(message);
		age++;
	}
}
