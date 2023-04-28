package Arrayjava;

public class FrequencyEachElement {

	public static void main(String[] args) {
      int[] x= {3,4,5,6,7,3,4,2,7};
      frequency(x);
	}

	private static void frequency(int[] x) {
     boolean[] rs=new boolean[x.length];
     for (int i = 0; i < x.length; i++) {
		if(rs[i]==false) {
			int count=1;
			for (int j = i+1; j < x.length; j++) {
				if(x[i]==x[j]) {
					count++;
					rs[j]=true;
				}
					
			}
			System.out.println(x[i]+"------>"+count);
		}
	}
	}

	
}
