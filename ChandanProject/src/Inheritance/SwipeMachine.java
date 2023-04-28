package Inheritance;

public class SwipeMachine {
public static void main(String[] args) {
	DebitCard d=new DebitCard();
	swipe(d);
	CreditCard c=new CreditCard();
	swipe(c);
}

public static void swipe(Card ob) {
	ob.payment();
	if(ob instanceof DebitCard)
	{
		DebitCard dd=(DebitCard)ob;
		dd.Balance();
	}else {
		CreditCard cc=(CreditCard)ob;
		cc.limit();
	}
	
}
}
