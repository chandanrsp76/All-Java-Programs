package lambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class FrequecyOfEachDigits {

	public static void main(String[] args) {
		List<Long> al=new ArrayList<>();
		long num=7580984188l;
		while(num!=0) {
			long d=num%10;
			al.add(d);
			num=num/10;
		}
		Object[] al1=al.toArray();
		frequency(al1);
	}

	 public static void frequency (Object[] al1) {
		boolean[] rs=new boolean[al1.length];
		for (int i = 0; i < al1.length; i++) {
			if(rs[i]==false) {
				int count=1;
				for (int j = i+1; j < al1.length; j++) {
					if(al1[i]==al1[j]) {
						count++;
						rs[j]=true; 
					}
				}
				                   System.out.println(al1[i]+"------>"+count);
			}
		}
	}
}
