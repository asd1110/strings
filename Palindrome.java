public class Palindrome {
	public static void main(String[]args){
	String s=new String("wow");
	char[]a=s.toCharArray();
	int b=s.length();
	String reverse="";
	for(int i=b-1;i>=0;i--){
		reverse=reverse+a[i];
	}
	if(s.equals(reverse)){
		System.out.println("palindrome");
	}
	else
		System.out.println("not palindrome");

}
}