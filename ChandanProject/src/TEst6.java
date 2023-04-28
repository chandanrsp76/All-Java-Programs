
public class TEst6 {
	public static void main(String[] args) {
		int a=1;
		int b=0;
		int sign=1;
		for(int i=1;i<=4;i++) {
			for(int j=i;j>=1;j--) {
				a=a+b;
				b++;
				System.out.println(a*sign);
				sign=sign*-1;
			}
	}
}
}