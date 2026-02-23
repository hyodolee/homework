package ex0213.ex01;

public class ShoppingMall {
	int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 18) {
	        throw new ShoppingException("애들은 가라"); 
	    }else {
	    	this.age = age;
	    }
	}
}
