
public class CountOfWord {

	public static void main(String[] args) {
       String str="Chandan prasad";
       char[] ch=str.toCharArray();
       int count=0;
       for (int i = 0; i < ch.length; i++) {
    	   
		if(i==0 && ch[i]!=' '||ch[i]!=' ' && ch[i-1]==' ') {
			count++;
		}
		
	}
       System.out.println(count);
	}

}
