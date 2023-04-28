
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j,i,end=21,isPrime=1,sum=0;
		for ( i = 2; i <=end; i++) {
			for(j=2;j<i/2;j++) {
				if(i%j==0) {
					isPrime=0;
					break;
				}
			}
			if(isPrime==1) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
		
	}

}
