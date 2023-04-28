package Arrayjava;

public class InValidPinException extends RuntimeException {
	public InValidPinException(String t) {
		super(t);
		System.out.println(t);
	}
}
