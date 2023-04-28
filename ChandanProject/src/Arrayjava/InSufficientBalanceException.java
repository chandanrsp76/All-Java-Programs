package Arrayjava;

public class InSufficientBalanceException extends RuntimeException{
	public InSufficientBalanceException(String s) {
		super(s);
		System.out.println(s);
	}
}


