package string;

public class CountSpecificAlphaate {

	public static void main(String[] args) {
            String str="Chandan";
            int count=0;
            for (int i = 0; i <str.length(); i++) {
				if(str.charAt(i)=='C') {
					count++;
				}
			}
            System.out.println(count+" times");
	}

}
