package string;

public class Arrayreverse {

	public static void main(String[] args) {
		 int[] arr= {2,3,4,5,6,7,8,9};
		 System.out.println("Before reverse:-");
		 for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
	    int[] rs=    reverse(arr);
	    System.out.println("After reverse:-");
	    for (int i = 0; i < rs.length; i++) {
			System.out.println(rs[i]+" ");
		}
	}

	private static int[] reverse(int[] arr) {
        int i=0,j=arr.length-1;
        while(i<j) {
        	int t=arr[i];
        	arr[i]=arr[j];
        	arr[j]=t;
        	i++;
        	j--;
        }
        return arr;
	}

}
