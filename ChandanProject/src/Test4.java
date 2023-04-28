
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int sign=1;
		int b=0;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				a=a+b;
				b++;
				System.out.println(a*sign);
				sign=-sign;
			}
			
		}
}
}
