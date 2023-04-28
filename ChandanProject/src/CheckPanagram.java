
public class CheckPanagram {

	public static void main(String[] args) {
      String str="A quick brown fox jumps over the lazy dog";
  if   (isPanagram(str))
	  System.out.println(str+" is Panagram");
  else
	  System.out.println(str+" is not Panagram");
	}

	private static boolean isPanagram(String str) {
  int count[]=new int[26]; 
  if(str.length()<26)
	  return false;
  for (int i = 0; i < str.length(); i++) {
char ch=str.charAt(i);
	if(ch>='a' && ch<='z')
		count[ch-97]++;
	else if(ch>='A' && ch<='Z')
		count[ch-65]++;
}
  for (int i = 0; i < count.length; i++) {
	if(count[i]==0)
		return false;
}
  return true;
	}

}
