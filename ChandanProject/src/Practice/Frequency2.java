package Practice;

public class Frequency2 {

	public static void main(String[] args) {
		FrequencyArray2 fa=new FrequencyArray2();
		System.out.println("Read the Arrays:-");
		int[] x=fa.readArray();
     System.out.println("Frequency of given Array:-");
		fa.printFrequency(x);
		
	}

}
